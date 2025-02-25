package com.paneedah.weaponlib;

import com.paneedah.weaponlib.particle.ExplosionSmokeFX.Behavior;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public interface EffectManager {

    void spawnSmokeParticle(EntityLivingBase player, float xOffset, float yOffset);

    void spawnFlashParticle(EntityLivingBase player, float flashIntensity, float flashScale, float xOffset, float yOffset, ResourceLocation flashTexture);

    void spawnExplosionSmoke(double posX, double posY, double posZ, double motionX, double motionY, double motionZ, float scale, int maxAge, Behavior behavior, ResourceLocation particleTexture);

    void spawnExplosionParticle(double posX, double posY, double posZ, double motionX, double motionY, double motionZ, float scale, int maxAge, ResourceLocation particleTexture);

}
