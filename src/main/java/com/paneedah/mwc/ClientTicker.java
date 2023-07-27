package com.paneedah.mwc;

import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.animation.ClientValueRepo;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.grenade.ItemGrenade;
import com.paneedah.weaponlib.melee.ItemMelee;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import org.lwjgl.input.Mouse;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.utils.ModReference.RED_LOG;

/**
 * Represents a client ticker to handle user inputs, specifically mouse inputs,  and also periodically runs tasks such as updating held items in the player's main hand.
 * <p>
 * This class operates by scheduling these tasks to execute on a fixed schedule.
 */
public final class ClientTicker {

    private boolean rightMouseButtonPressed;

    private final ClientModContext clientModContext;

    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    private ScheduledFuture<?> scheduledFuture;

    /**
     * Constructs a new ClientTicker with the specified clientModContext.
     *
     * @param clientModContext The context that the client ticker is operating in.
     */
    public ClientTicker(final ClientModContext clientModContext) {
        this.clientModContext = clientModContext;
    }

    /**
     * Starts the scheduler for this client ticker.
     * <p>
     * Checks for mouse button presses and releases, and handles those events accordingly.
     * Also, it executes the `onTick` method periodically to update the item held by the player.
     */
    public void start() {
        final SafeGlobals safeGlobals = clientModContext.getSafeGlobals();

        scheduledFuture = scheduler.scheduleAtFixedRate(() -> {
            if (!Mouse.isCreated())
                return;

            // Left mouse button
            if (Mouse.isButtonDown(0)) {
                if (!safeGlobals.guiOpen.get())
                    clientModContext.runSyncTick(this::onLeftMouseButtonDown);
            } else
                clientModContext.runSyncTick(this::onLeftMouseButtonReleased);

            // Right mouse button
            if (Mouse.isButtonDown(1)) {
                if (!rightMouseButtonPressed) {
                    rightMouseButtonPressed = true;

                    if (!safeGlobals.guiOpen.get())
                        clientModContext.runSyncTick(this::onRightMouseButtonDown);
                }
            } else {
                rightMouseButtonPressed = false;

                clientModContext.runSyncTick(this::onRightMouseButtonReleased);
            }

            clientModContext.runSyncTick(this::onTick);

        }, 0, 10, TimeUnit.MILLISECONDS);
    }

    /**
     * Stops the scheduler for this client ticker.
     */
    public void stop() {
        if (scheduledFuture != null)
            scheduledFuture.cancel(true);

        if (MC.world != null)
            RED_LOG.printFramedError("Client Weapon Ticker Thread", "Client weapon ticker thread stopped", "This will probably cause a CCS");
    }

    /**
     * Handles actions when the left mouse button is pressed down.
     */
    private void onLeftMouseButtonDown() {
        if (AnimationModeProcessor.getInstance().getFPSMode())
            return;

        final EntityPlayer player = MC.player;
        final Item item = getHeldItemMainHand(player);

        if ((item instanceof Weapon) && BalancePackManager.isWeaponDisabled((Weapon) item))
            return;

        if (item instanceof Weapon)
            ((Weapon) item).tryFire(player);
        else if (item instanceof ItemMelee)
            ((ItemMelee) item).attack(player, false);
        else if (item instanceof ItemGrenade)
            ((ItemGrenade) item).attack(player, true);
    }


    /**
     * Handles actions when the right mouse button is pressed down.
     */
    private void onRightMouseButtonDown() {
        if (AnimationModeProcessor.getInstance().getFPSMode())
            return;

        final EntityPlayer player = MC.player;
        final Item item = getHeldItemMainHand(player);

        if ((item instanceof Weapon) && BalancePackManager.isWeaponDisabled((Weapon) item))
            return;

        if (item instanceof Weapon) {
            if (player.isSprinting()) {
                player.setSprinting(false);

                KeyBinding.setKeyBindState(MC.gameSettings.keyBindSprint.getKeyCode(), false);
                ClientValueRepo.shouldContinueRunning = true;
            }
            ((Weapon) item).toggleAiming();
        } else if (item instanceof ItemMelee)
            ((ItemMelee) item).attack(player, true);
        else if (item instanceof ItemGrenade)
            ((ItemGrenade) item).attack(player, false);
    }

    /**
     * Handles actions when the left mouse button is released.
     */
    private void onLeftMouseButtonReleased() {
        final EntityPlayer player = MC.player;
        final Item item = getHeldItemMainHand(player);

        if ((item instanceof Weapon) && BalancePackManager.isWeaponDisabled((Weapon) item))
            return;

        if (item instanceof Weapon)
            ((Weapon) item).tryStopFire(player);
        else if (item instanceof ItemGrenade)
            ((ItemGrenade) item).attackUp(player, true);
    }

    /**
     * Handles actions when the right mouse button is released.
     */
    private void onRightMouseButtonReleased() {
        final EntityPlayer player = MC.player;
        final Item item = getHeldItemMainHand(player);

        if ((item instanceof Weapon) && BalancePackManager.isWeaponDisabled((Weapon) item))
            return;

        final PlayerWeaponInstance mainHandHeldWeaponInstance = clientModContext.getMainHeldWeapon();
        if (mainHandHeldWeaponInstance != null && (ModernConfigManager.holdToAim && (item instanceof Weapon && mainHandHeldWeaponInstance.isAimed()))) {
            if (ClientValueRepo.shouldContinueRunning) {
                player.setSprinting(true);
                ClientValueRepo.shouldContinueRunning = false;
            }

            ((Weapon) item).toggleAiming();
        }

        if (item instanceof ItemGrenade)
            ((ItemGrenade) item).attackUp(player, false);
    }

    /**
     * Runs actions on each tick, specifically updating the held item if it is an instance of Updatable.
     */
    private void onTick() {
        final EntityPlayer player = MC.player;
        final Item item = getHeldItemMainHand(player);

        if (item instanceof Updatable)
            ((Updatable) item).update(player);
    }

    /**
     * Retrieves the item held in the main hand of the specified player.
     *
     * @param player The player whose main hand item is to be returned
     * @return The item held in the main hand of the player, or null if the player is null
     */
    private Item getHeldItemMainHand(final EntityPlayer player) {
        if (player == null)
            return null;

        return player.getHeldItemMainhand().getItem();
    }
}
