package com.paneedah.weaponlib.particle;

import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.ProjectConstants.ID;

public class ParticleBlood extends Particle {

    public static final String texture = "particle/blood";

    public ParticleBlood(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn) {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn);

        this.particleGravity = 1;
        this.particleScale /= 2;
        this.particleRed = 0.6F;
        this.particleGreen = 0.6F;
        this.particleBlue = 0.6F;

        this.particleTextureIndexX = (int) Math.floor(Math.random() * 3);
        this.particleTextureIndexY = (int) Math.floor(Math.random() * 3);

        setParticleTexture(MC.getTextureMapBlocks().getAtlasSprite(new ResourceLocation(ID, texture).toString()));
    }

    public ParticleBlood(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn) {
        this(worldIn, xCoordIn, yCoordIn, zCoordIn);
        this.motionX = xSpeedIn;
        this.motionY = ySpeedIn;
        this.motionZ = zSpeedIn;
    }



    /**
     * Retrieve what effect layer (what texture) the particle should be rendered
     * with. 0 for the particle sprite sheet, 1 for the main Texture atlas, and 3
     * for a custom texture
     */
    public int getFXLayer() {
        return 1;
    }

    /**
     * Renders the particle
     */
    public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX,
                               float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {

        float textureWidth = this.particleTexture.getMaxU() - this.particleTexture.getMinU();
        float textureHeight = this.particleTexture.getMaxV() - this.particleTexture.getMinV();
        float spriteSizeX = textureWidth / 4f;
        float spriteSizeY = textureHeight / 4f;

        float f = this.particleTexture.getMinU() + spriteSizeX * this.particleTextureIndexX;
        float f1 = f + spriteSizeX;
        float f2 = this.particleTexture.getMinV() + spriteSizeY * this.particleTextureIndexY;
        float f3 = f2 + spriteSizeY;

        float f4 = 0.15F * this.particleScale;

        float f5 = (float) (this.prevPosX + (this.posX - this.prevPosX) * partialTicks - interpPosX);
        float f6 = (float) (this.prevPosY + (this.posY - this.prevPosY) * partialTicks - interpPosY);
        float f7 = (float) (this.prevPosZ + (this.posZ - this.prevPosZ) * partialTicks - interpPosZ);
        int i = this.getBrightnessForRender(partialTicks);
        int j = i >> 16 & 65535;
        int k = i & 65535;

        buffer.pos(f5 - rotationX * f4 - rotationXY * f4, f6 - rotationZ * f4,
                        f7 - rotationYZ * f4 - rotationXZ * f4).tex(f, f3)
                .color(this.particleRed, this.particleGreen, this.particleBlue, 1.0F).lightmap(j, k).endVertex();
        buffer.pos(f5 - rotationX * f4 + rotationXY * f4, f6 + rotationZ * f4,
                        f7 - rotationYZ * f4 + rotationXZ * f4).tex(f, f2)
                .color(this.particleRed, this.particleGreen, this.particleBlue, 1.0F).lightmap(j, k).endVertex();
        buffer.pos(f5 + rotationX * f4 + rotationXY * f4, f6 + rotationZ * f4,
                        f7 + rotationYZ * f4 + rotationXZ * f4).tex(f1, f2)
                .color(this.particleRed, this.particleGreen, this.particleBlue, 1.0F).lightmap(j, k).endVertex();
        buffer.pos(f5 + rotationX * f4 - rotationXY * f4, f6 - rotationZ * f4,
                        f7 + rotationYZ * f4 - rotationXZ * f4).tex(f1, f3)
                .color(this.particleRed, this.particleGreen, this.particleBlue, 1.0F).lightmap(j, k).endVertex();
    }

    public int getBrightnessForRender(float partialTicks) {
        return super.getBrightnessForRender(partialTicks);
    }

    @SideOnly(Side.CLIENT)
    public static class Factory implements IParticleFactory {
        public Particle createParticle(int particleID, World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn, int... params) {
            return new ParticleBlood(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, zSpeedIn);
        }
    }
}
