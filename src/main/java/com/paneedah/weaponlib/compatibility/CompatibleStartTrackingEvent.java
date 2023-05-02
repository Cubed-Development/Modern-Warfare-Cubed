package com.paneedah.weaponlib.compatibility;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent.StartTracking;

public class CompatibleStartTrackingEvent {

    private StartTracking event;

    public CompatibleStartTrackingEvent(StartTracking event) {
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
