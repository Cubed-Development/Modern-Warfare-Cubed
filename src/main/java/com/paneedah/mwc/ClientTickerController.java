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
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Mouse;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.utils.ModReference.RED_LOG;


/**
 * The ClientTickerController class is responsible for starting and stopping the client ticker, which handles user inputs and periodic tasks.
 *
 * @author Luna Lage (Desoroxxx)
 * @see ClientTicker
 * @since 0.1
 */
@SideOnly(Side.CLIENT)
public final class ClientTickerController {

    /**
     * @since 0.1
     */
    private static ScheduledFuture<?> scheduledFuture;

    /**
     * Starts the client ticker.
     *
     * @author Luna Lage (Desoroxxx)
     * @since 0.1
     */
    public static void start() {
        scheduledFuture = Executors.newScheduledThreadPool(1).scheduleAtFixedRate(ClientTicker::onTick, 0, 10, TimeUnit.MILLISECONDS);
    }

    /**
     * Stops the client ticker.
     *
     * @author Luna Lage (Desoroxxx)
     * @since 0.1
     */
    public static void stop() {
        if (scheduledFuture != null)
            scheduledFuture.cancel(true);

        if (MC.world != null)
            RED_LOG.printFramedError("Client Weapon Ticker Thread", "Client weapon ticker thread stopped", "This will probably cause a CTCS");
    }

    /**
     * Represents a client ticker to handle user inputs, specifically mouse inputs, and also periodically runs tasks such as updating held items in the player's main hand.
     * <p>
     * This class operates by scheduling these tasks to execute on a fixed schedule.
     * <p>
     * Note: This class is very important and anything that can go wrong with it will cause gigantic problems and headaches, any modifications should be carefully made and reviewed.
     *
     * @author Luna Lage (Desoroxxx)
     * @since 0.1
     */
    @SideOnly(Side.CLIENT)
    private static final class ClientTicker {

        /**
         * @since 0.1
         */
        private static boolean rightMouseButtonPressed;

        /**
         * @since 0.1
         */
        private static final ClientModContext clientModContext = (ClientModContext) MWC.modContext;

        /**
         * Executes the tick logic for the client ticker.
         * <p>
         * Checks for mouse button presses and releases, and handles those events accordingly.
         * Also, it executes the {@link #tickHeldItem} method periodically to update the item held by the player.
         *
         * @author Luna Lage (Desoroxxx)
         * @see #onLeftMouseButtonDown()
         * @see #onRightMouseButtonDown()
         * @see #onLeftMouseButtonReleased()
         * @see #onRightMouseButtonReleased()
         * @see #tickHeldItem
         * @since 0.1
         */
        private static void onTick() {
            if (!Mouse.isCreated())
                return;

            final SafeGlobals safeGlobals = clientModContext.getSafeGlobals();

            // Left mouse button
            if (Mouse.isButtonDown(0)) {
                if (!safeGlobals.guiOpen.get())
                    MC.addScheduledTask(ClientTicker::onLeftMouseButtonDown);
            } else
                MC.addScheduledTask(ClientTicker::onLeftMouseButtonReleased);

            // Right mouse button
            if (Mouse.isButtonDown(1)) {
                if (!rightMouseButtonPressed) {
                    rightMouseButtonPressed = true;

                    if (!safeGlobals.guiOpen.get())
                        MC.addScheduledTask(ClientTicker::onRightMouseButtonDown);
                }
            } else {
                rightMouseButtonPressed = false;

                MC.addScheduledTask(ClientTicker::onRightMouseButtonReleased);
            }

            MC.addScheduledTask(ClientTicker::tickHeldItem);
        }

        /**
         * Handles actions when the left mouse button is pressed down.
         *
         * @author Luna Lage (Desoroxxx)
         * @since 0.1
         */
        private static void onLeftMouseButtonDown() {
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
         *
         * @author Luna Lage (Desoroxxx)
         * @since 0.1
         */
        private static void onRightMouseButtonDown() {
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
         *
         * @author Luna Lage (Desoroxxx)
         * @since 0.1
         */
        private static void onLeftMouseButtonReleased() {
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
         *
         * @author Luna Lage (Desoroxxx)
         * @since 0.1
         */
        private static void onRightMouseButtonReleased() {
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
         *
         * @author Luna Lage (Desoroxxx)
         * @since 0.1
         */
        private static void tickHeldItem() {
            final EntityPlayer player = MC.player;
            final Item item = getHeldItemMainHand(player);

            if (item instanceof Updatable)
                ((Updatable) item).update(player);
        }

        /**
         * Retrieves the item held in the main hand of the specified player.
         *
         * @param player The player whose main hand item is to be returned
         * @return The item held in the main hand of the player
         * @author Luna Lage (Desoroxxx)
         * @since 0.1
         */
        private static Item getHeldItemMainHand(final EntityPlayer player) {
            if (player == null)
                return Items.AIR;

            return player.getHeldItemMainhand().getItem();
        }
    }
}
