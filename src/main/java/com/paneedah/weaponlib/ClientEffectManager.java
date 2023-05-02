package com.paneedah.weaponlib;

import com.paneedah.mwc.vectors.Vector3D;
import com.paneedah.weaponlib.compatibility.CompatibleClientEventHandler.MuzzleFlash;
import com.paneedah.weaponlib.compatibility.Interceptors;
import com.paneedah.weaponlib.particle.BetterMuzzleSmoke;
import com.paneedah.weaponlib.particle.ExplosionParticleFX;
import com.paneedah.weaponlib.particle.ExplosionSmokeFX;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

@SideOnly(Side.CLIENT)
final class ClientEffectManager implements EffectManager {

	ClientEffectManager() {}

	@Override
    public void spawnSmokeParticle(EntityLivingBase player, float xOffset, float yOffset) {
	    if(compatibility.isShadersModEnabled())
	        return;

		Vector3D look = compatibility.getLookVec(player);

		double motionX = mc.world.rand.nextGaussian() * 0.0003;
		double motionY = mc.world.rand.nextGaussian() * 0.0003;
		double motionZ = mc.world.rand.nextGaussian() * 0.0003;

		float distance = 1.2f;
		float scale = 5f * compatibility.getSmokeEffectScaleFactor(); // TODO: check why scale was set to 2.0 in 1.7.10
		float positionRandomizationFactor = 0.01f;

		double posX = player.posX + (look.x * distance) + (mc.world.rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor + (-look.z * xOffset);
		double posY = player.posY + (look.y * distance) + (mc.world.rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor - yOffset;
		double posZ = player.posZ + (look.z * distance) + (mc.world.rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor  + (look.x * xOffset);

		/*
		Weapon weapon = (Weapon) player.getHeldItemMainhand().getItem();

		posX += weapon.getMuzzlePosition().x;
		posY += weapon.getMuzzlePosition().y;
		posZ += weapon.getMuzzlePosition().z;
		*/
		
	    if(player instanceof EntityPlayer) {
	        if(player.isSneaking())
	            posY -= 0.1f;
            else if(Interceptors.isProning((EntityPlayer) player))
                posY -= 1.2f;
	    }

	    BetterMuzzleSmoke smokeParticle = new BetterMuzzleSmoke(mc.world, posX, posY, posZ, scale, (float)motionX, (float)motionY, (int)motionZ);

		mc.effectRenderer.addEffect(smokeParticle);
	}

	@Override
    public void spawnFlashParticle(EntityLivingBase player, float flashIntensity, float flashScale, float xOffset, float yOffset, String texture) {
	    if (compatibility.isShadersModEnabled())
	        return;

	    Weapon weapon = (Weapon) player.getHeldItemMainhand().getItem();

	    float distance = 1.0f;
	    
		//float scale = 0.8f * compatibility.getEffectScaleFactor() * flashScale;
		float positionRandomizationFactor = 0.0f;

		Vector3D look = compatibility.getLookVec(player);

		/*
		float motionX = (float)mc.world.rand.nextGaussian() * 0.003f;
		float motionY = (float)mc.world.rand.nextGaussian() * 0.003f;
		float motionZ = (float)mc.world.rand.nextGaussian() * 0.003f;

		motionX = 0.0f;
		motionY = 0f;
		motionZ = 0f;
		
		xOffset = -.05f;
		*/
		
		double posX = player.posX + (look.x * distance) + (mc.world.rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor + (-look.z * xOffset);
		double posY = player.posY + (look.y * distance) + (mc.world.rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor - yOffset;
		double posZ = player.posZ + (look.z * distance) + (mc.world.rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor + (look.x * xOffset);

		Vec3d thirdPersonPosition = new Vec3d(-0.13, 0, 2.0).rotatePitch((float) Math.toRadians(-player.rotationPitch)).rotateYaw((float) Math.toRadians(-player.rotationYaw)).add(player.getPositionVector()).add(0, 1.5, 0);
		
		//MuzzleFlash flash = new MuzzleFlash(thirdPersonPosition, player.rotationYaw, player.rotationPitch, 1.0);

		MuzzleFlash flash = new MuzzleFlash(new Vec3d(posX, posY, posZ), thirdPersonPosition, player.rotationYaw, player.rotationPitch, 1.0);
		ClientEventHandler.muzzleFlashStack.push(flash);
		
		
		if (Math.random() < 0.6/weapon.builder.fireRate)
			ClientEventHandler.uploadFlash(player.getEntityId());

		/*
		if (player instanceof EntityPlayer) {
            if(player.isSneaking())
                posY -= 0.1f;
            else if(Interceptors.isProning((EntityPlayer) player))
                posY -= 1.2f;
        }

		mc.effectRenderer.addEffect(new FlashFX(mc.world, posX, posY, posZ, scale, flashIntensity * compatibility.getFlashIntencityFactor(), motionX, motionY, motionZ, texture));
		*/
	}

	@Override
    public void spawnExplosionSmoke(double posX, double posY, double posZ, double motionX, double motionY, double motionZ, float scale, int maxAge, ExplosionSmokeFX.Behavior behavior, String particleTexture) {
        mc.effectRenderer.addEffect(new ExplosionSmokeFX(mc.world, posX, posY, posZ, scale, (float)motionX, (float)motionY, (float)motionZ, maxAge, ExplosionSmokeFX.Behavior.SMOKE_GRENADE, particleTexture));
	}

	@Override
	public void spawnExplosionParticle(double posX, double posY, double posZ, double motionX, double motionY, double motionZ, float scale, int maxAge, String particleTexture) {
        mc.effectRenderer.addEffect(new ExplosionParticleFX(mc.world, posX, posY, posZ, scale, motionX, motionY, motionZ, maxAge, particleTexture));
	}
}
