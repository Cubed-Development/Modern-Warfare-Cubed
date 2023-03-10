package com.paneedah.weaponlib.compatibility;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;

import java.util.List;

public class CompatiblePlayerDropsEvent {
    
    private PlayerDropsEvent event;

    public CompatiblePlayerDropsEvent(PlayerDropsEvent event) {
        this.event = event;
    }
    
    public List<EntityItem> getDrops() {
        return event.getDrops();
    }

    public EntityPlayer getPlayer() {
        return event.getEntityPlayer();
    }
}
