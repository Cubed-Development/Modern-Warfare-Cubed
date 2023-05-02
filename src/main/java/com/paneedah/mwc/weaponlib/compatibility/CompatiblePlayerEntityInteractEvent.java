package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class CompatiblePlayerEntityInteractEvent {
    
    private PlayerInteractEvent event;

    public CompatiblePlayerEntityInteractEvent(PlayerInteractEvent.EntityInteract event) {
        this.event = event;
    }
    
    public Entity getEntity() {
        return event.getEntity();
    }
    
    public EntityPlayer getPlayer() {
        return event.getEntityPlayer();
    }

}
