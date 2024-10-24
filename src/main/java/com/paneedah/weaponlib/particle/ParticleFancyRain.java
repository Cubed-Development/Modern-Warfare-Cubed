package com.paneedah.weaponlib.particle;

import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleRain;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Luna Lage (Desoroxxx)
 * @since 0.1
 */
public class ParticleFancyRain extends ParticleRain {

    protected ParticleFancyRain(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn) {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn);
        motionX *= 0.30000001192092896D;
        motionY = Math.random() * 0.20000000298023224D + 0.10000000149011612D;
        motionZ *= 0.30000001192092896D;
        particleRed = 1F;
        particleGreen = 1F;
        particleBlue = 0.5F;
        particleScale = (rand.nextFloat() * 0.5F + 0.5F);
        particleAlpha = 0.3F;
        setParticleTextureIndex(19 + rand.nextInt(4));
        setSize(0.01F, 0.01F);
        particleGravity = 0.06F;
        particleMaxAge = (int) (8.0D / (Math.random() * 0.8D + 0.2D));
    }

    @SideOnly(Side.CLIENT)
    public static class Factory implements IParticleFactory {
        public Particle createParticle(int particleID, World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn, int... p_178902_15_) {
            return new ParticleFancyRain(worldIn, xCoordIn, yCoordIn, zCoordIn);
        }
    }
}
