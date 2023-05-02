package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class CompatiblePlayerCloneEvent {
    
    private PlayerEvent.Clone event;

    public CompatiblePlayerCloneEvent(PlayerEvent.Clone event) {
        this.event = event;
    }
    
    public void copyInventory() {
        event.getEntityPlayer().inventory.copyInventory(event.getOriginal().inventory);
    }

    public EntityPlayer getPlayer() {
        return event.getEntityPlayer();
    }
    
    public EntityPlayer getOriginalPlayer() {
        return event.getOriginal();
    }
}
