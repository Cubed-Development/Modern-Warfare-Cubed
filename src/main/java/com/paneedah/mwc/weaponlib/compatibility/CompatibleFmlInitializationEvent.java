package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class CompatibleFmlInitializationEvent {

	private FMLInitializationEvent event;

	public CompatibleFmlInitializationEvent(FMLInitializationEvent event) {
		this.event = event;
	}

	public FMLInitializationEvent getEvent() {
		return event;
	}

}
