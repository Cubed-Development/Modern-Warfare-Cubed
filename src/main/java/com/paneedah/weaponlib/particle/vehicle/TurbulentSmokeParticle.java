package com.paneedah.weaponlib.particle.vehicle;

import com.paneedah.weaponlib.compatibility.CompatibleClientEventHandler;
import net.minecraft.client.particle.ParticleCloud;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.Random;

public class TurbulentSmokeParticle extends ParticleCloud {

	
	public TurbulentSmokeParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double p_i1221_8_,
			double p_i1221_10_, double p_i1221_12_) {
		super(worldIn, xCoordIn, yCoordIn, zCoordIn, p_i1221_8_, p_i1221_10_, p_i1221_12_);
		setParticleTexture(CompatibleClientEventHandler.carParticles);
		particleScale = 0.5f;
		
	}
	
	@Override
	public boolean shouldDisableDepth() {
		return true;
	}
	
	public TurbulentSmokeParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double p_i1221_8_,
			double p_i1221_10_, double p_i1221_12_, int indexY) {
		super(worldIn, xCoordIn, yCoordIn, zCoordIn, p_i1221_8_, p_i1221_10_, p_i1221_12_);
		setParticleTexture(CompatibleClientEventHandler.carParticles);
		particleScale = 0.5f;
		
		this.particleTextureIndexY = indexY;
		
	}
	
	
	@Override
	public int getFXLayer() {
		return 1;
	}
	
	@Override
	public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX,
			float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
		
		
		//rotationX = 0f;
		//rotationXZ = 30f;
			
			Random urandom = new Random(333);
			
			
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

        
        Random rand = new Random();
       
        this.move(this.motionX, this.motionY, this.motionZ);
        
       
        /*
        try {
        
        	 List<Entity> entList = this.world.getLoadedEntityList();
        	// entList.removeIf((e) -> !(e instanceof EntityVehicle));
        	 
        	 for(Entity ent : entList) {
        		 
        		 if(ent instanceof EntityVehicle) continue;
        		 
        		 EntityVehicle v = (EntityVehicle) ent;
        		 Vec3d particlePos = new Vec3d(posX, posY, posZ);
        		 
        		 double distance = particlePos.subtract(ent.getPositionVector()).length();
        		 
        		 if(distance < 1 && v.solver.getVelocityVector().length() > 3) {
        			 Vec3d sV = ent.getPositionVector().subtract(particlePos).normalize();
        			 
        			 this.motionX += sV.x;
        			 this.motionY += sV.y;
        			 this.motionZ += sV.z;
        			 
        			 
        		 } else if(distance < 5 && distance > 3 && v.solver.getVelocityVector().length() > 1) {
        			 Vec3d sV = particlePos.subtract(ent.getPositionVector()).normalize().scale(-v.solver.getVelocityVector().length()*0.005);
        			 
        			 this.motionX += sV.x;
        			 this.motionY += sV.y;
        			 this.motionZ += sV.z;
        			 
        		 }
        	 }
        	 
             
        } catch(Exception e) {
        	//e.printStackTrace();
        };*/
        
        
        
       
        
        this.motionX *= 0.9599999785423279D;
        this.motionY *= 0.9499999785423279D;
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
        	this.setExpired();
            this.motionX *= 0.699999988079071D;
            this.motionZ *= 0.699999988079071D;
        }
	}
}
