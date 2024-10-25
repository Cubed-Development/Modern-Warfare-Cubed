package com.paneedah.weaponlib.particle;

import com.paneedah.weaponlib.ClientEventHandler;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@SideOnly(Side.CLIENT)
public class ParticleExSmoke extends Particle {

    private int age;
    private int maxAge;
    private int randomSeed;


    public ParticleExSmoke(World worldIn, double posXIn, double posYIn, double posZIn) {
        super(worldIn, posXIn, posYIn, posZIn);

    }

    public ParticleExSmoke(World worldIn, double posXIn, double posYIn, double posZIn, double a, double b, double c) {
        super(worldIn, posXIn, posYIn, posZIn, a, b, c);

        maxAge = 100 + rand.nextInt(40);
        randomSeed = worldIn.rand.nextInt();

        setParticleTexture(ClientEventHandler.carParticles);
    }

    public void setMotion(double x, double y, double z) {
        motionX = x;
        motionY = y;
        motionZ = z;
    }

    @Override
    public void onUpdate() {

        //MC.getTextureManager().bindTexture(DriftCloudFX.CAR_PARTICLES);
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;

        particleAlpha = 1 - ((float) age / (float) maxAge);

        ++age;

        if (age == maxAge) {
            setExpired();
        }

        motionX *= 0.7599999785423279D;
        motionY *= 0.7599999785423279D;
        motionZ *= 0.7599999785423279D;

        move(motionX, motionY, motionZ);
    }

    @Override
    public int getFXLayer() {
        return 1;
    }

    @Override
    public boolean shouldDisableDepth() {
        return true;
    }

    @Override
    public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
        try {
            Random urandom = new Random(randomSeed);

            for (int i = 0; i < 6; i++) {

                particleRed = particleGreen = particleBlue = urandom.nextFloat() * 0.5F + 0.4F;

                int j = getBrightnessForRender(partialTicks);
                int k = j >> 16 & 65535;
                int l = j & 65535;

                float scale = urandom.nextFloat() + 0.5F;
                float pX = (float) ((prevPosX + (posX - prevPosX) * (double) partialTicks - interpPosX) + (urandom.nextGaussian() - 1D) * 0.75F);
                float pY = (float) ((prevPosY + (posY - prevPosY) * (double) partialTicks - interpPosY) + (urandom.nextGaussian() - 1D) * 0.75F);
                float pZ = (float) ((prevPosZ + (posZ - prevPosZ) * (double) partialTicks - interpPosZ) + (urandom.nextGaussian() - 1D) * 0.75F);

                buffer.pos(pX - rotationX * scale - rotationXY * scale, pY - rotationZ * scale, pZ - rotationYZ * scale - rotationXZ * scale).tex(particleTexture.getMaxU(), particleTexture.getMaxV()).color(particleRed, particleGreen, particleBlue, particleAlpha).lightmap(k, l).endVertex();
                buffer.pos(pX - rotationX * scale + rotationXY * scale, pY + rotationZ * scale, pZ - rotationYZ * scale + rotationXZ * scale).tex(particleTexture.getMaxU(), particleTexture.getMinV()).color(particleRed, particleGreen, particleBlue, particleAlpha).lightmap(k, l).endVertex();
                buffer.pos(pX + rotationX * scale + rotationXY * scale, pY + rotationZ * scale, pZ + rotationYZ * scale + rotationXZ * scale).tex(particleTexture.getMinU(), particleTexture.getMinV()).color(particleRed, particleGreen, particleBlue, particleAlpha).lightmap(k, l).endVertex();
                buffer.pos(pX + rotationX * scale - rotationXY * scale, pY - rotationZ * scale, pZ + rotationYZ * scale - rotationXZ * scale).tex(particleTexture.getMinU(), particleTexture.getMaxV()).color(particleRed, particleGreen, particleBlue, particleAlpha).lightmap(k, l).endVertex();
            }
        } catch (Exception ignored) {
        }

    }

    @Override
    public int getBrightnessForRender(float p_189214_1_) {
        return 240;
    }
}
