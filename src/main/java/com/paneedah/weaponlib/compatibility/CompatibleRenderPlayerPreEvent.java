package com.paneedah.weaponlib.compatibility;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent.Pre;

public class CompatibleRenderPlayerPreEvent {
    
    private Pre event;

    public CompatibleRenderPlayerPreEvent(Pre event) {
        this.event = event;
    }

    public EntityPlayer getPlayer() {
        return event.getEntityPlayer();
    }

}
