package com.paneedah.weaponlib;

import com.paneedah.weaponlib.ClientEventHandler.MuzzleFlash;
import com.paneedah.weaponlib.particle.BetterMuzzleSmoke;
import com.paneedah.weaponlib.particle.ExplosionParticleFX;
import com.paneedah.weaponlib.particle.ExplosionSmokeFX;
import io.redstudioragnarok.redcore.vectors.Vector3D;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@SideOnly(Side.CLIENT)
final class ClientEffectManager implements EffectManager {

    ClientEffectManager() {}

    @Override
    public void spawnSmokeParticle(EntityLivingBase player, float xOffset, float yOffset) {
        Vector3D look = new Vector3D(player.getLookVec());

        double motionX = MC.world.rand.nextGaussian() * 0.0003;
        double motionY = MC.world.rand.nextGaussian() * 0.0003;
        double motionZ = MC.world.rand.nextGaussian() * 0.0003;

        float distance = 1.2f;
        float scale = 5f * 1; // TODO: check why scale multiplier was set to 2.0 in 1.7.10
        float positionRandomizationFactor = 0.01f;

        double posX = player.posX + (look.x * distance) + (MC.world.rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor + (-look.z * xOffset);
        double posY = player.posY + (look.y * distance) + (MC.world.rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor - yOffset;
        double posZ = player.posZ + (look.z * distance) + (MC.world.rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor + (look.x * xOffset);

        if (player instanceof EntityPlayer && player.isSneaking()) {
            posY -= 0.1f;
        }

        BetterMuzzleSmoke smokeParticle = new BetterMuzzleSmoke(MC.world, posX, posY, posZ, scale, (float) motionX, (float) motionY, (int) motionZ);

        MC.effectRenderer.addEffect(smokeParticle);
    }

    @Override
    public void spawnFlashParticle(EntityLivingBase player, float flashIntensity, float flashScale, float xOffset, float yOffset, String texture) {
        Weapon weapon = (Weapon) player.getHeldItemMainhand().getItem();

        float distance = 1.0f;

        //float scale = 0.8f * flashScale;
        float positionRandomizationFactor = 0.0f;

        Vector3D look = new Vector3D(player.getLookVec());

        double posX = player.posX + (look.x * distance) + (MC.world.rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor + (-look.z * xOffset);
        double posY = player.posY + (look.y * distance) + (MC.world.rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor - yOffset;
        double posZ = player.posZ + (look.z * distance) + (MC.world.rand.nextFloat() * 2.0f - 1) * positionRandomizationFactor + (look.x * xOffset);

        Vec3d thirdPersonPosition = new Vec3d(-0.13, 0, 2.0).rotatePitch((float) Math.toRadians(-player.rotationPitch)).rotateYaw((float) Math.toRadians(-player.rotationYaw)).add(player.getPositionVector()).add(0, 1.5, 0);

        //MuzzleFlash flash = new MuzzleFlash(thirdPersonPosition, player.rotationYaw, player.rotationPitch, 1.0);

        MuzzleFlash flash = new MuzzleFlash(new Vec3d(posX, posY, posZ), thirdPersonPosition, player.rotationYaw, player.rotationPitch, 1.0);
        ClientEventHandler.muzzleFlashStack.push(flash);


        if (Math.random() < 0.6 / weapon.builder.fireRate) {
            ClientEventHandler.uploadFlash(player.getEntityId());
        }
    }

    @Override
    public void spawnExplosionSmoke(double posX, double posY, double posZ, double motionX, double motionY, double motionZ, float scale, int maxAge, ExplosionSmokeFX.Behavior behavior, String particleTexture) {
        MC.effectRenderer.addEffect(new ExplosionSmokeFX(MC.world, posX, posY, posZ, scale, (float) motionX, (float) motionY, (float) motionZ, maxAge, ExplosionSmokeFX.Behavior.SMOKE_GRENADE, particleTexture));
    }

    @Override
    public void spawnExplosionParticle(double posX, double posY, double posZ, double motionX, double motionY, double motionZ, float scale, int maxAge, String particleTexture) {
        MC.effectRenderer.addEffect(new ExplosionParticleFX(MC.world, posX, posY, posZ, scale, motionX, motionY, motionZ, maxAge, particleTexture));
    }
}
