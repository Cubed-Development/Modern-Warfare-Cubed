package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class CompatibleLivingDeathEvent {
    
    private LivingDeathEvent e;

    public CompatibleLivingDeathEvent(LivingDeathEvent e) {
        this.e = e;
    }

    public EntityLivingBase getEntity() {
        return e.getEntityLiving();
    }
    
    public void setAmount(double amount) {
        
    }
    
    public DamageSource getDamageSource() {
        return e.getSource();
    }

}
