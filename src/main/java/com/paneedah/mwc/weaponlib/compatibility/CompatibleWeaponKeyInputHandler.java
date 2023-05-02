package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public abstract class CompatibleWeaponKeyInputHandler {

	@SubscribeEvent
	public final void onKeyInput(InputEvent.KeyInputEvent event) {
		onCompatibleKeyInput();
	}

	protected abstract void onCompatibleKeyInput();
}
