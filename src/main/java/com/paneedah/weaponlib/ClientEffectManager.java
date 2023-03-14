package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleClientEventHandler.MuzzleFlash;
import com.paneedah.weaponlib.compatibility.CompatibleVec3;
import com.paneedah.weaponlib.compatibility.Interceptors;
import com.paneedah.weaponlib.particle.BetterMuzzleSmoke;
import com.paneedah.weaponlib.particle.ExplosionParticleFX;
import com.paneedah.weaponlib.particle.ExplosionSmokeFX;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

final class ClientEffectManager implements EffectManager {

	ClientEffectManager() {}

	@Override
    public void spawnSmokeParticle(EntityLivingBase player, float xOffset, float yOffset) {
	       
		
		//Weapon w = (Weapon) player.getHeldItemMainhand().getItem();
		//System.out.println(w.getMuzzlePosition());
		
	    if(compatibility.isShadersModEnabled()) {
	        return;
	    }

	    CompatibleVec3 look = compatibility.getLookVec(player);
		double motionX = compatibility.world(player).rand.nextGaussian() * 0.0003;
		double motionY = compatibility.world(player).rand.nextGaussian() * 0.0003;
		double motionZ = compatibility.world(player).rand.nextGaussian() * 0.0003; 

		
		float distance = 1.2f;
		float scale = 5f * compatibility.getSmokeEffectScaleFactor(); // TODO: check why scale was set to 2.0 in 1.7.10
		float positionRandomizationFactor = 0.01f;

		//System.out.println("yo");
		double posX = player.posX + (look.getXCoord() * distance) + (compatibility.world(player).rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor + (-look.getZCoord() * xOffset);
		double posY = player.posY + (look.getYCoord() * distance) + (compatibility.world(player).rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor - yOffset;
		double posZ = player.posZ + (look.getZCoord() * distance) + (compatibility.world(player).rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor  + (look.getXCoord() * xOffset);

		

		
		
		
		//posX += w.getMuzzlePosition().x;
		//posY += w.getMuzzlePosition().y;
		//posZ += w.getMuzzlePosition().z;
		
	    if(player instanceof EntityPlayer) {
	        if(player.isSneaking()) {
	            posY -= 0.1f;
            } else if(Interceptors.isProning((EntityPlayer) player)) {
                posY -= 1.2f;
            }
	    }
	        
	    /*
		SmokeFX smokeParticle = new SmokeFX(
				compatibility.world(player),
				posX,
		        posY,
		        posZ,
		        scale,
		      (float)motionX,
		      (float)motionY,
		      (float)motionZ);
		      */
	    BetterMuzzleSmoke smokeParticle = new BetterMuzzleSmoke(
				compatibility.world(player),
				posX,
		        posY,
		        posZ,
		        scale,
		      (float)motionX,
		      (float)motionY,
		      (int)motionZ);

		mc.effectRenderer.addEffect(smokeParticle);
	}

	@Override
    public void spawnFlashParticle(EntityLivingBase player, float flashIntensity, float flashScale,
			float xOffset, float yOffset, String texture) {

	    if (compatibility.isShadersModEnabled())
	        return;

	    Weapon w = (Weapon) player.getHeldItemMainhand().getItem();
	   
		//float distance = 0.6f;

	    float distance = 1.0f;
	    
		//float scale = 0.8f * compatibility.getEffectScaleFactor() * flashScale;
		float positionRandomizationFactor = 0.0f;

		CompatibleVec3 look = compatibility.getLookVec(player);

		//float motionX = (float)compatibility.world(player).rand.nextGaussian() * 0.003f;
		//float motionY = (float)compatibility.world(player).rand.nextGaussian() * 0.003f;
		//float motionZ = (float)compatibility.world(player).rand.nextGaussian() * 0.003f;

		//motionX = 0.0f;
		//motionY = 0f;
		//motionZ = 0f;
		
		//xOffset = -.05f;
		//System.out.println(xOffset);
		
		double posX = player.posX + (look.getXCoord() * distance) + (compatibility.world(player).rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor + (-look.getZCoord() * xOffset);
		double posY = player.posY + (look.getYCoord() * distance) + (compatibility.world(player).rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor - yOffset;
		double posZ = player.posZ + (look.getZCoord() * distance) + (compatibility.world(player).rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor + (look.getXCoord() * xOffset);

		Vec3d bruh = new Vec3d(-0.13, 0, 2.0).rotatePitch((float) Math.toRadians(-player.rotationPitch)).rotateYaw((float) Math.toRadians(-player.rotationYaw)).add(player.getPositionVector()).add(0, 1.5, 0);
		
		//MuzzleFlash flash = new MuzzleFlash(bruh, player.rotationYaw, player.rotationPitch, 1.0);

		MuzzleFlash flash = new MuzzleFlash(new Vec3d(posX, posY, posZ), bruh, player.rotationYaw, player.rotationPitch, 1.0);
		ClientEventHandler.muzzleFlashStack.push(flash);
		
		
		if (Math.random() < 0.6/w.builder.fireRate)
			ClientEventHandler.uploadFlash(player.getEntityId());

		//if(player instanceof EntityPlayer) {
        //    if(player.isSneaking()) {
        //        posY -= 0.1f;
        //    } else if(Interceptors.isProning((EntityPlayer) player)) {
        //        posY -= 1.2f;
        //    }
        //}
		/*
		FlashFX flashParticle = new FlashFX(
				compatibility.world(player),
				posX,
				posY,
				posZ,
				scale,
				flashIntensity * compatibility.getFlashIntencityFactor(),
				motionX,
				motionY,
				motionZ,
				texture);
		*/
	//	mc.effectRenderer.addEffect(flashParticle);
	}

	/* (non-Javadoc)
     * @see com.paneedah.weaponlib.IEffectManager#spawnExplosionSmoke(double, double, double, double, double, double)
     */
	@Override
    public void spawnExplosionSmoke(double posX, double posY, double posZ,
            double motionX, double motionY, double motionZ, float scale,
            int maxAge, ExplosionSmokeFX.Behavior behavior, String particleTexture) {
	    
	    World world = compatibility.world(compatibility.clientPlayer());
        ExplosionSmokeFX smokeParticle = new ExplosionSmokeFX(
                world,
                posX,
                posY,
                posZ,
                scale,
                (float)motionX,
                (float)motionY,
                (float)motionZ,
                maxAge,
                ExplosionSmokeFX.Behavior.SMOKE_GRENADE,
                particleTexture);

        mc.effectRenderer.addEffect(smokeParticle);
	}

	@Override
	public void spawnExplosionParticle(double posX, double posY, double posZ,
	        double motionX, double motionY, double motionZ, float scale, int maxAge, String particleTexture) {
	    World world = compatibility.world(compatibility.clientPlayer());
	    ExplosionParticleFX explosionParticle = new ExplosionParticleFX(
                world,
                posX,
                posY,
                posZ,
                scale,
                motionX, motionY, motionZ,
                maxAge,
                particleTexture);

        mc.effectRenderer.addEffect(explosionParticle);
	}
}
