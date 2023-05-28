package com.paneedah.weaponlib;

import com.paneedah.weaponlib.animation.DebugPositioner;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class KeyBindings {

	public static KeyBinding openDoor;

	public static KeyBinding reloadKey;
	public static KeyBinding unloadKey;
	public static KeyBinding inspectKey;
	public static KeyBinding attachmentKey;
	/*
	 * public static KeyBinding upArrowKey; public static KeyBinding downArrowKey;
	 * public static KeyBinding leftArrowKey; public static KeyBinding
	 * rightArrowKey;
	 */
	public static KeyBinding laserSwitchKey;
	public static KeyBinding nightVisionSwitchKey;
	public static KeyBinding proningSwitchKey;
	/*
	 * public static KeyBinding laserAttachmentKey; public static KeyBinding
	 * periodKey;
	 */

	public static KeyBinding addKey;

	public static KeyBinding subtractKey;

	public static KeyBinding fireModeKey;

	public static KeyBinding customInventoryKey;

	public static KeyBinding jDebugKey;
	public static KeyBinding kDebugKey;

	public static KeyBinding minusDebugKey;
	public static KeyBinding equalsDebugKey;

	public static KeyBinding lBracketDebugKey;
	public static KeyBinding rBracketDebugKey;

	public static KeyBinding semicolonDebugKey;
	public static KeyBinding apostropheDebugKey;

	public static KeyBinding altModeDebugKey;

	public static KeyBinding deleteDebugKey;

	public static KeyBinding freecamLock;
	public static KeyBinding freecamRotate;

	/*
	 * VEHICLE
	 */
	public static KeyBinding vehicleThrottle;
	public static KeyBinding vehicleBrake;
	public static KeyBinding vehicleHandbrake;
	public static KeyBinding vehicleTurnLeft;
	public static KeyBinding vehicleTurnRight;
	public static KeyBinding vehicleClutch;
	public static KeyBinding vehicleTurnOff;

	public static void init() {

		openDoor = new KeyBinding("key.opendoor", Keyboard.KEY_C, "key.categories.weaponlib");

		reloadKey = new KeyBinding("key.reload", Keyboard.KEY_R, "key.categories.weaponlib");

		unloadKey = new KeyBinding("key.unload", Keyboard.KEY_U, "key.categories.weaponlib");

		inspectKey = new KeyBinding("key.inspect", Keyboard.KEY_P, "key.categories.weaponlib");

		laserSwitchKey = new KeyBinding("key.laser", Keyboard.KEY_L, "key.categories.weaponlib");

		nightVisionSwitchKey = new KeyBinding("key.nightVision", Keyboard.KEY_N, "key.categories.weaponlib");

		attachmentKey = new KeyBinding("key.attachment", Keyboard.KEY_M, "key.categories.weaponlib");

		freecamLock = new KeyBinding("debug.freecamLock", Keyboard.KEY_HOME, "key.categories.weaponlib");
		
		freecamRotate = new KeyBinding("debug.freecamRotate", Keyboard.KEY_LCONTROL, "key.categories.weaponlib");

		/*
		 * upArrowKey = new KeyBinding("key.scope", Keyboard.KEY_UP,
		 * "key.categories.weaponlib");
		 * 
		 * downArrowKey = new KeyBinding("key.recoil_fitter", Keyboard.KEY_DOWN,
		 * "key.categories.weaponlib");
		 * 
		 * leftArrowKey = new KeyBinding("key.silencer", Keyboard.KEY_LEFT,
		 * "key.categories.weaponlib");
		 * 
		 * rightArrowKey = new KeyBinding("key.texture_change", Keyboard.KEY_RIGHT,
		 * "key.categories.weaponlib");
		 */

		addKey = new KeyBinding("key.add", Keyboard.KEY_I, "key.categories.weaponlib");

		subtractKey = new KeyBinding("key.subtract", Keyboard.KEY_O, "key.categories.weaponlib");

		fireModeKey = new KeyBinding("key.fire_mode", Keyboard.KEY_B, "key.categories.weaponlib");

		proningSwitchKey = new KeyBinding("key.proning", Keyboard.KEY_Z, "key.categories.weaponlib");

		/*
		 * laserAttachmentKey = new KeyBinding("key.attach_laser", Keyboard.KEY_RSHIFT,
		 * "key.categories.weaponlib");
		 */

		customInventoryKey = new KeyBinding("key.custom_inventory", Keyboard.KEY_X, "key.categories.weaponlib");

		/*
		 * periodKey = new KeyBinding("key.sight", Keyboard.KEY_PERIOD,
		 * "key.categories.weaponlib");
		 */

		/*
		 * VEHICLE
		 */

		vehicleThrottle = new KeyBinding("vehicle.throttle", Keyboard.KEY_W, "key.categories.vehicle");

		vehicleBrake = new KeyBinding("vehicle.brake", Keyboard.KEY_S, "key.categories.vehicle");

		vehicleHandbrake = new KeyBinding("vehicle.handbrake", Keyboard.KEY_SPACE, "key.categories.vehicle");

		vehicleTurnLeft = new KeyBinding("vehicle.turnleft", Keyboard.KEY_A, "key.categories.vehicle");

		vehicleTurnRight = new KeyBinding("vehicle.turnright", Keyboard.KEY_D, "key.categories.vehicle");

		vehicleClutch = new KeyBinding("vehicle.clutch", Keyboard.KEY_C, "key.categories.vehicle");

		vehicleTurnOff = new KeyBinding("vehicle.turnoff", Keyboard.KEY_EQUALS, "key.categories.vehicle");

		ClientRegistry.registerKeyBinding(openDoor);
		ClientRegistry.registerKeyBinding(reloadKey);
		ClientRegistry.registerKeyBinding(unloadKey);
		ClientRegistry.registerKeyBinding(inspectKey);
		ClientRegistry.registerKeyBinding(attachmentKey);
		/*
		 * ClientRegistry.registerKeyBinding(upArrowKey);
		 * ClientRegistry.registerKeyBinding(downArrowKey);
		 * ClientRegistry.registerKeyBinding(leftArrowKey);
		 * ClientRegistry.registerKeyBinding(rightArrowKey);
		 */
		ClientRegistry.registerKeyBinding(laserSwitchKey);
		ClientRegistry.registerKeyBinding(nightVisionSwitchKey);
		ClientRegistry.registerKeyBinding(addKey);
		ClientRegistry.registerKeyBinding(subtractKey);
		ClientRegistry.registerKeyBinding(fireModeKey);
		ClientRegistry.registerKeyBinding(proningSwitchKey);
		ClientRegistry.registerKeyBinding(freecamLock);
		ClientRegistry.registerKeyBinding(freecamRotate);
		/*
		 * ClientRegistry.registerKeyBinding(laserAttachmentKey);
		 * ClientRegistry.registerKeyBinding(periodKey);
		 */
		ClientRegistry.registerKeyBinding(customInventoryKey);

		ClientRegistry.registerKeyBinding(vehicleThrottle);
		ClientRegistry.registerKeyBinding(vehicleBrake);
		ClientRegistry.registerKeyBinding(vehicleHandbrake);
		ClientRegistry.registerKeyBinding(vehicleTurnLeft);
		ClientRegistry.registerKeyBinding(vehicleTurnRight);
		ClientRegistry.registerKeyBinding(vehicleClutch);
		ClientRegistry.registerKeyBinding(vehicleTurnOff);

		if (DebugPositioner.isDebugModeEnabled()) {
			bindDebugKeys();
		}
	}

	public static void bindDebugKeys() {

		jDebugKey = new KeyBinding("key.jDebugKey", Keyboard.KEY_J, "key.categories.weaponlib");

		kDebugKey = new KeyBinding("key.klDebugKey", Keyboard.KEY_K, "key.categories.weaponlib");

		minusDebugKey = new KeyBinding("key.minusDebugKey", Keyboard.KEY_MINUS, "key.categories.weaponlib");

		equalsDebugKey = new KeyBinding("key.equalsDebugKey", Keyboard.KEY_EQUALS, "key.categories.weaponlib");

		lBracketDebugKey = new KeyBinding("key.lBracketDebugKey", Keyboard.KEY_LBRACKET, "key.categories.weaponlib");

		rBracketDebugKey = new KeyBinding("key.rBracketDebugKey", Keyboard.KEY_RBRACKET, "key.categories.weaponlib");

		semicolonDebugKey = new KeyBinding("key.semicolonDebugKey", Keyboard.KEY_SEMICOLON, "key.categories.weaponlib");

		apostropheDebugKey = new KeyBinding("key.apostropheDebugKey", Keyboard.KEY_APOSTROPHE,
				"key.categories.weaponlib");

		deleteDebugKey = new KeyBinding("key.deleteDebugKey", Keyboard.KEY_BACK, "key.categories.weaponlib");

		altModeDebugKey = new KeyBinding("key.altModeDebugKey", Keyboard.KEY_RSHIFT, "key.categories.weaponlib");

		ClientRegistry.registerKeyBinding(jDebugKey);
		ClientRegistry.registerKeyBinding(kDebugKey);

		ClientRegistry.registerKeyBinding(lBracketDebugKey);
		ClientRegistry.registerKeyBinding(rBracketDebugKey);

		ClientRegistry.registerKeyBinding(semicolonDebugKey);
		ClientRegistry.registerKeyBinding(apostropheDebugKey);

		ClientRegistry.registerKeyBinding(minusDebugKey);
		ClientRegistry.registerKeyBinding(equalsDebugKey);

		ClientRegistry.registerKeyBinding(deleteDebugKey);

		ClientRegistry.registerKeyBinding(altModeDebugKey);
	}
}
