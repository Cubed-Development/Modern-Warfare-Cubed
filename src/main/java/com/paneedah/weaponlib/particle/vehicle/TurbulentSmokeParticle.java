package com.paneedah.weaponlib.particle.vehicle;

import com.paneedah.weaponlib.ClientEventHandler;
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
        setParticleTexture(ClientEventHandler.carParticles);
        particleScale = 0.5f;

    }

    @Override
    public boolean shouldDisableDepth() {
        return true;
    }

    public TurbulentSmokeParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double p_i1221_8_,
                                  double p_i1221_10_, double p_i1221_12_, int indexY) {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn, p_i1221_8_, p_i1221_10_, p_i1221_12_);
        setParticleTexture(ClientEventHandler.carParticles);
        particleScale = 0.5f;

        particleTextureIndexY = indexY;

    }


    @Override
    public int getFXLayer() {
        return 1;
    }

    @Override
    public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX,
                               float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {


        Random urandom = new Random(333);


        particleRed = particleGreen = particleBlue = urandom.nextFloat() * 0.5F + 0.4F;

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


    @Override
    public void onUpdate() {
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;


        if (particleAge++ >= particleMaxAge) {
            setExpired();
        }

        particleTextureIndexX = particleAge * 7 / particleMaxAge;


        Random rand = new Random();

        move(motionX, motionY, motionZ);


        motionX *= 0.9599999785423279D;
        motionY *= 0.9499999785423279D;
        motionZ *= 0.9599999785423279D;


        EntityPlayer entityplayer = world.getClosestPlayer(posX, posY, posZ, 2.0D, false);

        if (entityplayer != null) {
            AxisAlignedBB axisalignedbb = entityplayer.getEntityBoundingBox();

            if (posY > axisalignedbb.minY) {
                posY += (axisalignedbb.minY - posY) * 0.2D;
                motionY += (entityplayer.motionY - motionY) * 0.2D;
                setPosition(posX, posY, posZ);
            }
        }


        if (onGround) {
            setExpired();
            motionX *= 0.699999988079071D;
            motionZ *= 0.699999988079071D;
        }
    }
}
