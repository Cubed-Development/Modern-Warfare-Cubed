package com.paneedah.weaponlib.compatibility;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;

public class CompatiblePlayerRespawnEvent {
    private PlayerRespawnEvent event;

    public CompatiblePlayerRespawnEvent(PlayerRespawnEvent event) {
        this.event = event;
    }
    
    public EntityPlayer getPlayer() {
        return event.player;
    }

}
