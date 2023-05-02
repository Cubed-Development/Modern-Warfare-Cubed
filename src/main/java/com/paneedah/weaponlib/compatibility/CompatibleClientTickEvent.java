package com.paneedah.weaponlib.compatibility;

import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class CompatibleClientTickEvent {
	
	public enum Phase {
        START, END;
    }

	private ClientTickEvent event;
	
	public CompatibleClientTickEvent(ClientTickEvent event) {
		this.event = event;
	}

	public Phase getPhase() {
		return event.phase == net.minecraftforge.fml.common.gameevent.TickEvent.Phase.START ? Phase.START: Phase.END;
	}

}
