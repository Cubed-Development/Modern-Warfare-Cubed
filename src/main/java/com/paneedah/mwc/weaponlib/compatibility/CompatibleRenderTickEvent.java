package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.RenderTickEvent;

public class CompatibleRenderTickEvent {
	
	public enum Phase {
        START, END;
    }
	
	private RenderTickEvent event;

	public CompatibleRenderTickEvent(RenderTickEvent event) {
		this.event = event;
	}
	
	public Phase getPhase() {
		return event.phase == TickEvent.Phase.START ? Phase.START : Phase.END;
	}

	public float getRenderTickTime() {
		return event.renderTickTime;
	}

}
