package com.paneedah.weaponlib.compatibility;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class CompatibleLivingUpdateEvent {

    private LivingUpdateEvent event;

    public CompatibleLivingUpdateEvent(LivingUpdateEvent event) {
        this.event = event;
    }
    
    public Entity getEntity() {
        return event.getEntity();
    }

    public EntityLivingBase getEntityLiving() {
        return event.getEntityLiving();
    }
}
