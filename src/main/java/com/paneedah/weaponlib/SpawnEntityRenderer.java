package com.paneedah.weaponlib;

import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.particle.BetterMuzzleSmoke;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class SpawnEntityRenderer extends Render<Entity> {

	protected SpawnEntityRenderer() {
		super(mc.getRenderManager());
	}

	@Override
	public void doRender(Entity entity, double x, double y, double z, float yaw, float tick) {
		
	//	if(/*entity.distanceWalkedModified < 1.5f */entity.ticksExisted < 2) {
	    //    return;
	    //}
		
		
    		WeaponSpawnEntity weaponSpawnEntity = (WeaponSpawnEntity) entity;
    		
    		//System.out.println("Rendering entity with aim tan: " + weaponSpawnEntity.getAimTan());
    		Weapon weapon = weaponSpawnEntity.getWeapon();
    		if(weapon == null) {
        		return;
        	}
        	ModelBase model = weapon.getAmmoModel();
        //	System.out.println("Tick: " + entity.ticksExisted);
        	if(model != null) {
        		String ammoModelTextureName = weapon.getAmmoModelTextureName();
    			ResourceLocation textureLocation = ammoModelTextureName != null ? new ResourceLocation(ammoModelTextureName) : null;
            	/*
				GL11.glPushMatrix();
				if(textureLocation != null) {
					bindTexture(textureLocation);
				}

				double xxofset = 0.4 - entity.distanceWalkedModified * weaponSpawnEntity.getAimTan();
				double angle = Math.atan(weaponSpawnEntity.getAimTan());
				// 360 -> 2p, x -> angle, x = 360 * angle / 2pi = 180 * angle /pi
				double zOffset = xxofset * Math.cos(entity.rotationYaw / 180.0F * (float) Math.PI);
				double xOffset = xxofset * Math.sin(entity.rotationYaw / 180.0F * (float) Math.PI);
				//System.out.println("Xoffset: " + xOffset + ", zoffset: " + zOffset);
				GL11.glTranslated(x + xOffset, y, z + zOffset);
//            		GL11.glRotatef(90, 1f, 0f, 0f);
//            		GL11.glRotatef(90, 0f, 0f, 1f);
//            		GL11.glRotatef(45, 0f, 1f, 0f);
				GL11.glRotatef(0f, 1f, 0f, 0f);
				GL11.glRotatef(entity.rotationYaw - 90 + (float)(angle * 180 / Math.PI), 0f, 1f, 0f);
				GL11.glRotatef(90f + entity.rotationPitch, 0f, 0f, 1f);
				GL11.glScalef(2f, 2f, 2f);
				model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
				GL11.glPopMatrix();
				*/

				if(textureLocation != null)
					bindTexture(textureLocation);

				// Panda: I don't know why this is here, but we don't need this.
				//double xxofset = 0.4 - entity.distanceWalkedModified * weaponSpawnEntity.getAimTan();
				//double angle = Math.atan(weaponSpawnEntity.getAimTan());
				//double zOffset = xxofset * Math.cos(entity.rotationYaw / 180.0F * (float) Math.PI);
				//double xOffset = xxofset * Math.sin(entity.rotationYaw / 180.0F * (float) Math.PI);

				if(weaponSpawnEntity.world.isRemote && weaponSpawnEntity.spawnRocketParticles) {
					BetterMuzzleSmoke smokeParticle = new BetterMuzzleSmoke(
							weaponSpawnEntity.world,
							weaponSpawnEntity.posX,
							weaponSpawnEntity.posY,
							weaponSpawnEntity.posZ,
							1,
						  (float)0,
						  (float)0,
						  (int)0);

					mc.effectRenderer.addEffect(smokeParticle);
				}


				//weaponSpawnEntity.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, true, weaponSpawnEntity.posX + xOffset, weaponSpawnEntity.posY, weaponSpawnEntity.posZ + zOffset, 0, 0, 0, new int[] {});


				GlStateManager.pushMatrix();
				new Transform()
				.withRotation(90 - entity.rotationPitch, entity.rotationYaw, 0)
				.withPosition(x, y, z)
				.withScale(1, 1, 1)
				.doGLDirect();


				model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

				GlStateManager.popMatrix();
			}
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
        return new ResourceLocation(((WeaponSpawnEntity) entity).getWeapon().getAmmoModelTextureName());
	}


}
