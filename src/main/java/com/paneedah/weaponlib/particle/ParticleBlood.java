package com.paneedah.weaponlib.particle;

import com.paneedah.mwc.utils.ModReference;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class ParticleBlood extends Particle {

	public static final String texture = "particle/blood";
   
	public ParticleBlood(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn) {
		super(worldIn, xCoordIn, yCoordIn, zCoordIn);

		this.particleGravity = 1;

		this.particleScale /= 2;

		this.particleRed = 0.6F;
		this.particleGreen = 0.6F;
		this.particleBlue = 0.6F;

		this.particleTextureIndexX = (int) Math.floor(Math.random() * (3));
		this.particleTextureIndexY = (int) Math.floor(Math.random() * (3));

		setParticleTexture(mc.getTextureMapBlocks().getAtlasSprite(new ResourceLocation(ModReference.ID, texture).toString()));
	}
	
	public ParticleBlood(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn) {
		super(worldIn, xCoordIn, yCoordIn, zCoordIn);

		this.particleGravity = 1;
	        
		this.motionX = xSpeedIn;
		this.motionY = ySpeedIn;
		this.motionZ = zSpeedIn;

		this.particleScale /= 2;

		this.particleRed = 0.6F;
		this.particleGreen = 0.6F;
		this.particleBlue = 0.6F;
	        
		this.particleTextureIndexX = (int) Math.floor(Math.random() * (3));
		this.particleTextureIndexY = (int) Math.floor(Math.random() * (3));

		setParticleTexture(mc.getTextureMapBlocks().getAtlasSprite(new ResourceLocation(ModReference.ID, texture).toString()));
	}



	protected void multiplyColor(@Nullable BlockPos p_187154_1_) {

	}

	/**
	 * Retrieve what effect layer (what texture) the particle should be rendered
	 * with. 0 for the particle sprite sheet, 1 for the main Texture atlas, and 3
	 * for a custom texture
	 */
	public int getFXLayer() {
		return 1;
	}

	/**
	 * Renders the particle
	 */
	public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX,
			float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
		
		//GlStateManager.disableTexture2D();
		/*
		float f = ((float) this.particleTextureIndexX + this.particleTextureJitterX / 4.0F) / 16.0F;
		float f1 = f + 0.015609375F;
		float f2 = ((float) this.particleTextureIndexY + this.particleTextureJitterY / 4.0F) / 16.0F;
		float f3 = f2 + 0.015609375F;
		*/
		
		
		/*
		float f = 0.0f;
		float f1 = f + 150.0f/400.0f;
		float f2 = 0.0f;
		float f3 = f2 + 150.0f/400.0f;
		*/
		
		float delta = 100.0f/400.0f;
		
		
		
		
		
	//	Sprite sprit = SpriteSheetTools.getSquareSprite(1, this.particleTexture.getMaxU()/4f, this.particleTexture.getMaxU(), this.particleTexture.getMaxV());
		
	//	System.out.println(this.particleTexture.getMaxV());
		
		float dirac = particleTexture.getMaxU()/4f;
		
		float f = this.particleTexture.getMinU() + dirac*((float) this.particleTextureIndexX);
		float f1 = this.particleTexture.getMaxU()/4f + f;
		float f2 = this.particleTexture.getMinV() + dirac*((float) this.particleTextureIndexY);
		float f3 = this.particleTexture.getMaxV()/4f + f2;
		
		float f4 = 0.15F * this.particleScale;

		
		
		if (this.particleTexture != null) {
			/*
			f = 0.0f;
			f1 = 1.0f;
			f2 = 0.0f;
			f3 = 1.0f;
			*/
			/*
			f = this.particleTexture.getInterpolatedU((double) (this.particleTextureJitterX / 4.0F * 16.0F));
			f1 = this.particleTexture.getInterpolatedU((double) ((this.particleTextureJitterX + 1.0F) / 4.0F * 16.0F));
			f2 = this.particleTexture.getInterpolatedV((double) (this.particleTextureJitterY / 4.0F * 16.0F));
			f3 = this.particleTexture.getInterpolatedV((double) ((this.particleTextureJitterY + 1.0F) / 4.0F * 16.0F));
			*/
		}

		float f5 = (float) (this.prevPosX + (this.posX - this.prevPosX) * (double) partialTicks - interpPosX);
		float f6 = (float) (this.prevPosY + (this.posY - this.prevPosY) * (double) partialTicks - interpPosY);
		float f7 = (float) (this.prevPosZ + (this.posZ - this.prevPosZ) * (double) partialTicks - interpPosZ);
		int i = this.getBrightnessForRender(partialTicks);
		int j = i >> 16 & 65535;
		int k = i & 65535;
		buffer.pos((double) (f5 - rotationX * f4 - rotationXY * f4), (double) (f6 - rotationZ * f4),
				(double) (f7 - rotationYZ * f4 - rotationXZ * f4)).tex((double) f, (double) f3)
				.color(this.particleRed, this.particleGreen, this.particleBlue, 1.0F).lightmap(j, k).endVertex();
		buffer.pos((double) (f5 - rotationX * f4 + rotationXY * f4), (double) (f6 + rotationZ * f4),
				(double) (f7 - rotationYZ * f4 + rotationXZ * f4)).tex((double) f, (double) f2)
				.color(this.particleRed, this.particleGreen, this.particleBlue, 1.0F).lightmap(j, k).endVertex();
		buffer.pos((double) (f5 + rotationX * f4 + rotationXY * f4), (double) (f6 + rotationZ * f4),
				(double) (f7 + rotationYZ * f4 + rotationXZ * f4)).tex((double) f1, (double) f2)
				.color(this.particleRed, this.particleGreen, this.particleBlue, 1.0F).lightmap(j, k).endVertex();
		buffer.pos((double) (f5 + rotationX * f4 - rotationXY * f4), (double) (f6 - rotationZ * f4),
				(double) (f7 + rotationYZ * f4 - rotationXZ * f4)).tex((double) f1, (double) f3)
				.color(this.particleRed, this.particleGreen, this.particleBlue, 1.0F).lightmap(j, k).endVertex();
	}

	public int getBrightnessForRender(float p_189214_1_) {
		return super.getBrightnessForRender(p_189214_1_);
	}

	@SideOnly(Side.CLIENT)
	public static class Factory implements IParticleFactory {
		public Particle createParticle(int particleID, World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn, int... p_178902_15_) {
			return (new ParticleBlood(worldIn, xCoordIn, yCoordIn, zCoordIn));
		}
	}

}
