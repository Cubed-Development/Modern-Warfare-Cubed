package com.paneedah.weaponlib.particle.vehicle;

import com.paneedah.weaponlib.ClientEventHandler;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

import java.util.Random;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class VehicleExhaustFlameParticle extends Particle {

    private final float lavaParticleScale;

    public VehicleExhaustFlameParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn,
                                       double xSpeedIn, double ySpeedIn, double zSpeedIn) {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, zSpeedIn);

        particleTextureIndexY = 0;


        motionY = Math.random() * 0.0001;
        motionX *= 2 + (Math.random() * 2.0);
        motionZ *= 2 + (Math.random() * 2.0);

        particleRed = 1.0F;
        particleGreen = 1.0F;
        particleBlue = 1.0F;
        particleScale = rand.nextFloat() * 0.5F + 0.05F;

        lavaParticleScale = particleScale;
        particleMaxAge = (int) (1.0D / (Math.random() * 0.8D + 0.2D));
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


    public int getBrightnessForRender(float p_189214_1_) {
        int i = super.getBrightnessForRender(p_189214_1_);
        int j = 240;
        int k = i >> 16 & 255;
        return 240 | k << 16;
    }

    /**
     * Renders the particle
     */
    public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
        float f = ((float) particleAge + partialTicks) / (float) particleMaxAge;


        particleScale = ((particleAge / (float) particleMaxAge)) * lavaParticleScale;
        particleAlpha = 1.0f - ((particleAge / (float) particleMaxAge + 28));


        Random urandom = new Random(333);


        //this.particleRed = this.particleGreen = this.particleBlue = urandom.nextFloat() * 0.5F + 0.4F;

        int j = getBrightnessForRender(partialTicks);
        int k = j >> 16 & 65535;
        int l = j & 65535;

        float scale = particleScale;
        float pX = (float) (prevPosX + (posX - prevPosX) * (double) partialTicks - interpPosX);
        float pY = (float) (prevPosY + (posY - prevPosY) * (double) partialTicks - interpPosY);
        float pZ = (float) (prevPosZ + (posZ - prevPosZ) * (double) partialTicks - interpPosZ);

        double minX = particleTexture.getMinU() + ((particleTexture.getMaxU() - particleTexture.getMinU()) * (particleTextureIndexX / 8f));
        double minY = particleTexture.getMinV() + ((particleTexture.getMaxV() - particleTexture.getMinV()) * (particleTextureIndexY / 8f));
        double mU = (particleTexture.getMaxU() - particleTexture.getMinU()) / 8;
        double mV = (particleTexture.getMaxV() - particleTexture.getMinV()) / 8;

        buffer.pos(pX - rotationX * scale - rotationXY * scale, pY - rotationZ * scale, pZ - rotationYZ * scale - rotationXZ * scale).tex(minX + mU, minY + mV).color(particleRed, particleGreen, particleBlue, particleAlpha).lightmap(k, l).endVertex();
        buffer.pos(pX - rotationX * scale + rotationXY * scale, pY + rotationZ * scale, pZ - rotationYZ * scale + rotationXZ * scale).tex(minX + mU, minY).color(particleRed, particleGreen, particleBlue, particleAlpha).lightmap(k, l).endVertex();
        buffer.pos(pX + rotationX * scale + rotationXY * scale, pY + rotationZ * scale, pZ + rotationYZ * scale + rotationXZ * scale).tex(minX, minY).color(particleRed, particleGreen, particleBlue, particleAlpha).lightmap(k, l).endVertex();
        buffer.pos(pX + rotationX * scale - rotationXY * scale, pY - rotationZ * scale, pZ + rotationYZ * scale - rotationXZ * scale).tex(minX, minY + mV).color(particleRed, particleGreen, particleBlue, particleAlpha).lightmap(k, l).endVertex();


    }

    public void onUpdate() {
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;

        particleTextureIndexX = particleAge * 7 / particleMaxAge;


        if (particleAge++ >= particleMaxAge) {
            setExpired();
        }

        float f = (float) particleAge / (float) particleMaxAge;

        if (rand.nextFloat() > f) {
            MC.effectRenderer.addEffect(new ExhaustParticle(world, posX, posY, posZ, motionX, motionY, motionZ, 3));
        }


        move(motionX, motionY, motionZ);

        if (onGround) {
            motionX *= 0.699999988079071D;
            motionZ *= 0.699999988079071D;
        }
    }

}
