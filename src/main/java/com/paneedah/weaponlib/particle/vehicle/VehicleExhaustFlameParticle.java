package com.paneedah.weaponlib.particle.vehicle;

import com.paneedah.weaponlib.ClientEventHandler;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

import java.util.Random;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class VehicleExhaustFlameParticle extends Particle {
	
	private final float lavaParticleScale;
	
	public VehicleExhaustFlameParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn,
			double xSpeedIn, double ySpeedIn, double zSpeedIn) {
		super(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, zSpeedIn);
		
		this.particleTextureIndexY = 0;
		
		
		
		
		this.motionY = Math.random()*0.0001;
		this.motionX *= 2 + (Math.random()*2.0);
		this.motionZ *= 2 + (Math.random()*2.0);
		
		//this.motionX += Math.random()*0.005;
		//this.motionY += Math.random()*0.005;
		//this.motionZ += Math.random()*0.005;
        
        this.particleRed = 1.0F;
        this.particleGreen = 1.0F;
        this.particleBlue = 1.0F;
        this.particleScale = this.rand.nextFloat() * 0.5F + 0.05F;
        
        this.lavaParticleScale = this.particleScale;
        this.particleMaxAge = (int)(1.0D / (Math.random() * 0.8D + 0.2D));
        setParticleTexture(ClientEventHandler.carParticles);
	}
	
	@Override
	public boolean shouldDisableDepth() {
		return true;
	}

	@Override
	public int getFXLayer() {
		return 1;
	}
   

    public int getBrightnessForRender(float p_189214_1_)
    {
        int i = super.getBrightnessForRender(p_189214_1_);
        int j = 240;
        int k = i >> 16 & 255;
        return 240 | k << 16;
    }

    /**
     * Renders the particle
     */
    public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ)
    {
        float f = ((float)this.particleAge + partialTicks) / (float)this.particleMaxAge;
        
        
        this.particleScale = ((this.particleAge/(float) this.particleMaxAge))*this.lavaParticleScale;
        this.particleAlpha = 1.0f - ((this.particleAge/(float) this.particleMaxAge+28));
		
        
        Random urandom = new Random(333);
		
       
		//this.particleRed = this.particleGreen = this.particleBlue = urandom.nextFloat() * 0.5F + 0.4F;
	       
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

    public void onUpdate()
    {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;

        this.particleTextureIndexX = this.particleAge * 7 / this.particleMaxAge;

        
        
        if (this.particleAge++ >= this.particleMaxAge)
        {
            this.setExpired();
        }

        float f = (float)this.particleAge / (float)this.particleMaxAge;

        if (this.rand.nextFloat() > f)
        {
        	mc.effectRenderer.addEffect(new ExhaustParticle( world, this.posX, this.posY, this.posZ, this.motionX, this.motionY, this.motionZ, 3));
        }

        
        this.move(this.motionX, this.motionY, this.motionZ);
        //this.motionX *= 1.5;
       // this.motionY *= 0.9990000128746033D;
        //this.motionZ *= 1.5;

        if (this.onGround)
        {
            this.motionX *= 0.699999988079071D;
            this.motionZ *= 0.699999988079071D;
        }
    }

}
