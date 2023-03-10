package com.paneedah.weaponlib.compatibility;

import net.minecraftforge.fml.common.gameevent.TickEvent.ServerTickEvent;

public class CompatibleServerTickEvent {
    
    private ServerTickEvent event;

    public CompatibleServerTickEvent(ServerTickEvent event) {
        this.event = event;
    }

    public ServerTickEvent getEvent() {
        return event;
    }
}
