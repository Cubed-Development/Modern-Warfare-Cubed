package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent.StopTracking;

public class CompatibleStopTrackingEvent {

    private StopTracking event;

    public CompatibleStopTrackingEvent(StopTracking event) {
        this.event = event;
    }

    public EntityPlayer getPlayer() {
        return event.getEntityPlayer();
    }

    public Entity getTarget() {
        return event.getTarget();
    }

    public Entity getEntity() {
        return event.getEntity();
    }
}
