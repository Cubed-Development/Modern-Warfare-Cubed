package com.paneedah.weaponlib.particle.vehicle;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class DriftCloudParticle extends TurbulentSmokeParticle {

    public DriftCloudParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double p_i1221_8_,
                              double p_i1221_10_, double p_i1221_12_, int indexY) {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn, p_i1221_8_, p_i1221_10_, p_i1221_12_, indexY);
        motionY /= 2;

        int subtractor = 10;
        motionX += Math.random() / subtractor;
        motionY += Math.random() / subtractor;
        motionZ += Math.random() / subtractor;
    }

    @Override
    public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX,
                               float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
        particleAlpha = 1.0f - ((particleAge / (float) particleMaxAge));
        particleScale = ((particleAge / (float) particleMaxAge)) + 0.5f;
        super.renderParticle(buffer, entityIn, partialTicks, rotationX, rotationZ, rotationYZ, rotationXY, rotationXZ);
    }

}
