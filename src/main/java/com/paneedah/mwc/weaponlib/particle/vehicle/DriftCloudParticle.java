package com.paneedah.mwc.weaponlib.particle.vehicle;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class DriftCloudParticle extends TurbulentSmokeParticle {

	public DriftCloudParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double p_i1221_8_,
			double p_i1221_10_, double p_i1221_12_, int indexY) {
		super(worldIn, xCoordIn, yCoordIn, zCoordIn, p_i1221_8_, p_i1221_10_, p_i1221_12_, indexY);
		this.motionY /= 2;
		
		int subtractor = 10;
		this.motionX += Math.random()/subtractor;
		this.motionY += Math.random()/subtractor;
		this.motionZ += Math.random()/subtractor;
	}
	
	@Override
	public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX,
			float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
		this.particleAlpha = 1.0f - ((this.particleAge/(float) this.particleMaxAge));
		this.particleScale = ((this.particleAge/(float) this.particleMaxAge))+0.5f;
		super.renderParticle(buffer, entityIn, partialTicks, rotationX, rotationZ, rotationYZ, rotationXY, rotationXZ);
	}

}
