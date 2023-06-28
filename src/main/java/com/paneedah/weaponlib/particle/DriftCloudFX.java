package com.paneedah.weaponlib.particle;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.ClientEventHandler;
import net.minecraft.client.particle.ParticleCloud;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.Random;

public class DriftCloudFX extends ParticleCloud {
	
	
	public static final ResourceLocation CAR_PARTICLES = new ResourceLocation(ModReference.ID + ":particle/carparticle.png");
	
	public DriftCloudFX(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double p_i1221_8_,
			double p_i1221_10_, double p_i1221_12_) {
		super(worldIn, xCoordIn, yCoordIn, zCoordIn, p_i1221_8_, p_i1221_10_, p_i1221_12_);
		setParticleTexture(ClientEventHandler.carParticles);
		particleScale = 0.5f;
		
	}
	
	
	@Override
	public int getFXLayer() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	@Override
	public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX,
			float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
		
			Random urandom = new Random(333);
			
			this.particleTextureIndexY = 3;
			
			//this.particleTextureIndexX = (int) Math.floor(8*(this.particleAge/this.particleMaxAge));
			
			//this.particleAlpha = (float) ((float) 1.0f - ((double) this.particleAge/(double) this.particleMaxAge));
			
			
			 this.particleRed = this.particleGreen = this.particleBlue = urandom.nextFloat() * 0.5F + 0.4F;
		       
		        int j = this.getBrightnessForRender(partialTicks);
		        int k = j >> 16 & 65535;
		        int l = j & 65535;
		        
				float scale = this.particleScale;
				float pX = (float)(this.prevPosX + (this.posX - this.prevPosX) * (double)partialTicks - interpPosX);
		        float pY = (float)(this.prevPosY + (this.posY - this.prevPosY) * (double)partialTicks - interpPosY);
		        float pZ = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * (double)partialTicks - interpPosZ);
		        
		        double minX = particleTexture.getMinU() + ((particleTexture.getMaxU()-particleTexture.getMinU()) * (particleTextureIndexX/8f));
		        double minY = particleTexture.getMinV() + ((particleTexture.getMaxV()-particleTexture.getMinV()) * (particleTextureIndexY/8f));
		        double mU = (particleTexture.getMaxU()-particleTexture.getMinU())/8;
		        double mV = (particleTexture.getMaxV()-particleTexture.getMinV())/8;
		        
		        buffer.pos((double)(pX - rotationX * scale - rotationXY * scale), (double)(pY - rotationZ * scale), (double)(pZ - rotationYZ * scale - rotationXZ * scale)).tex(minX+mU, minY+mV).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(k, l).endVertex();
				buffer.pos((double)(pX - rotationX * scale + rotationXY * scale), (double)(pY + rotationZ * scale), (double)(pZ - rotationYZ * scale + rotationXZ * scale)).tex(minX+mU, minY).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(k, l).endVertex();
				buffer.pos((double)(pX + rotationX * scale + rotationXY * scale), (double)(pY + rotationZ * scale), (double)(pZ + rotationYZ * scale + rotationXZ * scale)).tex(minX, minY).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(k, l).endVertex();
				buffer.pos((double)(pX + rotationX * scale - rotationXY * scale), (double)(pY - rotationZ * scale), (double)(pZ + rotationYZ * scale - rotationXZ * scale)).tex(minX, minY+mV).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(k, l).endVertex();
			
		
	}
	
	
	@Override
	public void onUpdate() {
		this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;

        
        
        if (this.particleAge++ >= this.particleMaxAge)
        {
        	 this.setExpired();
        }
        
        this.particleTextureIndexX = this.particleAge * 7 / this.particleMaxAge;

        //this.setParticleTextureIndex(7 - this.particleAge * 8 / this.particleMaxAge);
        this.move(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.9599999785423279D;
        this.motionY *= 0.9599999785423279D;
        this.motionZ *= 0.9599999785423279D;
        EntityPlayer entityplayer = this.world.getClosestPlayer(this.posX, this.posY, this.posZ, 2.0D, false);

        if (entityplayer != null)
        {
            AxisAlignedBB axisalignedbb = entityplayer.getEntityBoundingBox();

            if (this.posY > axisalignedbb.minY)
            {
                this.posY += (axisalignedbb.minY - this.posY) * 0.2D;
                this.motionY += (entityplayer.motionY - this.motionY) * 0.2D;
                this.setPosition(this.posX, this.posY, this.posZ);
            }
        }

        
        
        if (this.onGround)
        {
            this.motionX *= 0.699999988079071D;
            this.motionZ *= 0.699999988079071D;
        }
	}
	
	
	

}
