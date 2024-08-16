package com.paneedah.weaponlib.ai;

import net.minecraft.entity.Entity;

public class ExplosionAttack implements CustomMobAttack, Timeable {
    
    private float explosionRadius;
    private boolean isSmokeEnabled;
    private int duration;

    public ExplosionAttack(float explosionRadius, boolean isSmokeEnabled, int duration) {
        super();
        this.explosionRadius = explosionRadius;
        this.isSmokeEnabled = isSmokeEnabled;
        this.duration = duration;
    }

    @Override
    public boolean attackEntity(EntityCustomMob entityMob, Entity target) {
        entityMob.world.createExplosion(entityMob, entityMob.posX, entityMob.posY, entityMob.posZ,
                explosionRadius, isSmokeEnabled);
        entityMob.setDead();
        return false;
    }

    @Override
    public int getDuration() {
        return duration;
    }

}
