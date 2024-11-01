package com.paneedah.weaponlib;

import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.particle.BetterMuzzleSmoke;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class SpawnEntityRenderer extends Render<Entity> {

    protected SpawnEntityRenderer() {
        super(MC.getRenderManager());
    }

    @Override
    public void doRender(Entity entity, double x, double y, double z, float yaw, float tick) {


        WeaponSpawnEntity weaponSpawnEntity = (WeaponSpawnEntity) entity;

        //System.out.println("Rendering entity with aim tan: " + weaponSpawnEntity.getAimTan());
        Weapon weapon = weaponSpawnEntity.getWeapon();
        if (weapon == null) {
            return;
        }
        ModelBase model = weapon.getAmmoModel();
        //	System.out.println("Tick: " + entity.ticksExisted);
        if (model != null) {
            String ammoModelTextureName = weapon.getAmmoModelTextureName();
            ResourceLocation textureLocation = ammoModelTextureName != null ? new ResourceLocation(ammoModelTextureName) : null;

            if (textureLocation != null) {
                bindTexture(textureLocation);
            }

            // Panda: I don't know why this is here, but we don't need this.

            if (weaponSpawnEntity.world.isRemote && weaponSpawnEntity.spawnRocketParticles) {
                BetterMuzzleSmoke smokeParticle = new BetterMuzzleSmoke(
                        weaponSpawnEntity.world,
                        weaponSpawnEntity.posX,
                        weaponSpawnEntity.posY,
                        weaponSpawnEntity.posZ,
                        1,
                        (float) 0,
                        (float) 0,
                        0);

                MC.effectRenderer.addEffect(smokeParticle);
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
