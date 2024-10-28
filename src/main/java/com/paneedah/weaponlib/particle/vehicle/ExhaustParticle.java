package com.paneedah.weaponlib.particle.vehicle;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class ExhaustParticle extends TurbulentSmokeParticle {


    public ExhaustParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double p_i1221_8_,
                           double p_i1221_10_, double p_i1221_12_, int indexY) {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn, p_i1221_8_, p_i1221_10_, p_i1221_12_, indexY);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX,
                               float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
        particleAlpha = (1.0f - ((particleAge / (float) particleMaxAge))) * 0.08f;
        particleScale = (((particleAge / (float) particleMaxAge)) * 0.3f) + 0.3f;
        super.renderParticle(buffer, entityIn, partialTicks, rotationX, rotationZ, rotationYZ, rotationXY, rotationXZ);
    }


}
