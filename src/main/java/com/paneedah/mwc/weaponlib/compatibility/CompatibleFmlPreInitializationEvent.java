package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CompatibleFmlPreInitializationEvent {

	private FMLPreInitializationEvent event;

	public CompatibleFmlPreInitializationEvent(FMLPreInitializationEvent event) {
		this.event = event;
	}

	public FMLPreInitializationEvent getEvent() {
		return event;
	}

}
