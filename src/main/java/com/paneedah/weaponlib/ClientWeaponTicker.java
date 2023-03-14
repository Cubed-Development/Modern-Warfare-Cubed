package com.paneedah.weaponlib;

import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.animation.ClientValueRepo;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.grenade.ItemGrenade;
import com.paneedah.weaponlib.melee.ItemMelee;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Mouse;

import java.util.concurrent.atomic.AtomicBoolean;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

class ClientWeaponTicker extends Thread {

	boolean[] buttonsPressed = new boolean[2];
	long[] buttonsPressedTimestamps = new long[2];

	private final AtomicBoolean running = new AtomicBoolean(true);

	private final ClientModContext clientModContext;

	public ClientWeaponTicker(ClientModContext clientModContext) {
		this.clientModContext = clientModContext;
	}

	void shutdown() {
		running.set(false);
	}

	public void run() {
		SafeGlobals safeGlobals = clientModContext.getSafeGlobals();
		int currentItemIndex = safeGlobals.currentItemIndex.get();

		while(running.get()) {
			try {
				if (!Mouse.isCreated())
					continue;

				if (Mouse.isButtonDown(1)) {
					if (!buttonsPressed[1]) {
						buttonsPressed[1] = true;
						buttonsPressedTimestamps[1] = System.currentTimeMillis();

						if (!safeGlobals.guiOpen.get() && !isInteracting())
							clientModContext.runSyncTick(this::onRightButtonDown);
					}

				} else if (buttonsPressed[1] /*TODO: || currentItemIndex != safeGlobals.currentItemIndex.get()*/) {
					buttonsPressed[1] = false;
                    clientModContext.runSyncTick(this::onRightButtonUp);
				}

				if (Mouse.isButtonDown(0)) {
					// Capture the current item index
					currentItemIndex = safeGlobals.currentItemIndex.get();
					if (!buttonsPressed[0])
						buttonsPressed[0] = true;

					if (!safeGlobals.guiOpen.get() && !isInteracting())
						clientModContext.runSyncTick(this::onLeftButtonDown);

				} else if(buttonsPressed[0] || currentItemIndex != safeGlobals.currentItemIndex.get()) { // if switched item while pressing mouse down and then released
					buttonsPressed[0] = false;
					currentItemIndex = safeGlobals.currentItemIndex.get();
					clientModContext.runSyncTick(this::onLeftButtonUp);
				}

				clientModContext.runSyncTick(this::onTick);
				Thread.sleep(10);

			} catch(InterruptedException ignored) { break; }
		}
	}

    private void onLeftButtonUp() {
        EntityPlayer player = compatibility.getClientPlayer();
        Item item = getHeldItemMainHand(player);
        if((item instanceof Weapon) && BalancePackManager.isWeaponDisabled((Weapon) item)) return;
        if(item instanceof Weapon) ((Weapon) item).tryStopFire(player);
        else if(item instanceof ItemGrenade) ((ItemGrenade) item).attackUp(player, true);
    }

    private void onRightButtonUp() {
        EntityPlayer player = compatibility.getClientPlayer();
        Item item = getHeldItemMainHand(player);
        if((item instanceof Weapon) && BalancePackManager.isWeaponDisabled((Weapon) item)) return;
        if(item instanceof ItemGrenade) // TODO: introduce generic action handler interface with on*Click() handler
            ((ItemGrenade) item).attackUp(player, false);
        
        PlayerWeaponInstance mainHandHeldWeaponInstance = clientModContext.getMainHeldWeapon();
		if (mainHandHeldWeaponInstance == null)
			return;

		if(ModernConfigManager.holdToAim && item instanceof Weapon && mainHandHeldWeaponInstance.isAimed()) {
			if(mainHandHeldWeaponInstance.isAimed() && ClientValueRepo.shouldContinueRunning) {
				player.setSprinting(true);
				ClientValueRepo.shouldContinueRunning = false;
			}

			((Weapon) item).toggleAiming();
		}
    }

    private void onLeftButtonDown() {
    	if(AnimationModeProcessor.getInstance().getFPSMode()) return;
        EntityPlayer player = compatibility.getClientPlayer();
        Item item = getHeldItemMainHand(player);
        if((item instanceof Weapon) && BalancePackManager.isWeaponDisabled((Weapon) item)) return;
        if(item instanceof Weapon) ((Weapon) item).tryFire(player);
        else if(item instanceof ItemMelee) ((ItemMelee) item).attack(player, false);
        else if(item instanceof ItemGrenade) ((ItemGrenade) item).attack(player, true); // TODO: introduce generic action handler interface with on*Click() handler
    }

    private void onRightButtonDown() {
    	if(AnimationModeProcessor.getInstance().getFPSMode())
			return;
        
        EntityPlayer player = compatibility.getClientPlayer();
        Item item = getHeldItemMainHand(player);
        
        if((item instanceof Weapon) && BalancePackManager.isWeaponDisabled((Weapon) item))
			return;
        
        if(item instanceof Weapon) {
        	if(player.isSprinting()) {
        		player.setSprinting(false);
        		KeyBinding.setKeyBindState(mc.gameSettings.keyBindSprint.getKeyCode(), false);
        		ClientValueRepo.shouldContinueRunning = true;
        	}

            ((Weapon) item).toggleAiming();

        }

		else if(item instanceof ItemMelee) ((ItemMelee) item).attack(player, true);
        else if(item instanceof ItemGrenade) ((ItemGrenade) item).attack(player, false);
    }

	private void onTick() {
	    EntityPlayer player = compatibility.getClientPlayer();

	    Item item = getHeldItemMainHand(player);

	    /*
	    if(item instanceof Weapon) {
	    	PlayerWeaponInstance pwi = ClientModContext.getContext().getMainHeldWeapon();
	    	if(pwi != null)  {
	    		if(Mouse.isButtonDown(1) && !pwi.isAimed()) {
					((Weapon) item).toggleAiming();
				} else if(pwi.isAimed()) {
					((Weapon) item).toggleAiming();
				}
	    	}
	    	
	    }*/
	    
	    
        if(item instanceof Updatable)
            ((Updatable) item).update(player);
	}

	private boolean isInteracting() {
		return false;
	}

	private Item getHeldItemMainHand(EntityPlayer player) {
		if(player == null)
			return null;

		ItemStack itemStack = compatibility.getHeldItemMainHand(player);
		return itemStack != null ? itemStack.getItem() : null;
	}
}
