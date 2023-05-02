package com.paneedah.mwc.weaponlib.ai;

import com.paneedah.mwc.weaponlib.Spreadable;
import com.paneedah.mwc.weaponlib.SpreadableExposure;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleExposureCapability;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

import java.util.UUID;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class InfectionAttack implements CustomMobAttack, Spreadable {
    
    private static UUID uuid = UUID.randomUUID();
    
    private float dose;
    private long firstExposureImpactDelay;
    private float colorImpairmentR;
    private float colorImpairmentG;
    private float colorImpairmentB;
    
    public InfectionAttack(float dose, long firstExposureImpactDelay, 
            float colorImpairmentR, float colorImpairmentG, float colorImpairmentB) {
        this.dose = dose;
        this.firstExposureImpactDelay = firstExposureImpactDelay;
        this.colorImpairmentR = colorImpairmentR;
        this.colorImpairmentG = colorImpairmentG;
        this.colorImpairmentB = colorImpairmentB;
    }

    @Override
    public boolean attackEntity(EntityCustomMob entityMob, Entity target) {
        if(target instanceof EntityLivingBase) {
            SpreadableExposure exposure = CompatibleExposureCapability.getExposure(target, SpreadableExposure.class);
            if(exposure == null) {
                exposure = new SpreadableExposure(firstExposureImpactDelay, compatibility.world(entityMob).getTotalWorldTime())
                        .withColorImpairment(colorImpairmentR, colorImpairmentG, colorImpairmentB);
                CompatibleExposureCapability.updateExposure((EntityLivingBase) target, exposure);
            }
            
            exposure.apply(this, target, dose);
        }
        
        return false;
    }

    @Override
    public UUID getId() {
        return uuid;
    }

}
