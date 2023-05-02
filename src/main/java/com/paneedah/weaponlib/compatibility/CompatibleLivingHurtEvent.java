package com.paneedah.weaponlib.compatibility;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class CompatibleLivingHurtEvent {
    private LivingHurtEvent event;

    public CompatibleLivingHurtEvent(LivingHurtEvent event) {
        this.event = event;
    }

    public EntityLivingBase getEntityLiving() {
        return event.getEntityLiving();
    }
    
    public float getAmount() {
        return event.getAmount();
    }
    
    public void setAmount(float amount) {
        event.setAmount(amount);
    }

    public DamageSource getDamageSource() {
        return event.getSource();
    }
}
