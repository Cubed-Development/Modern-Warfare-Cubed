package com.paneedah.weaponlib.particle;

import com.paneedah.mwc.render.ParticleRenderer;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class ExplosionParticleFX extends Particle {

    private static final String DEFAULT_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/explosion-particles.png";
    private static final int columnCount = 5;
    private static final int rowCount = 5; //4;
    private int imageIndex;
    private String particleTexture;

    public ExplosionParticleFX(World par1World, double positionX, double positionY, double positionZ, float scale, double motionX, double motionY, double motionZ, int particleMaxAge, String particleTexture) {
        super(par1World, positionX, positionY, positionZ, 0.0D, 0.0D, 0.0D);

        this.motionX = motionX;
        this.motionY = motionY;
        this.motionZ = motionZ;

        if (motionX == 0.0F)
            motionX = 1.0F;

        this.particleTextureIndexX = 0;
        this.particleTextureIndexY = 0;
        this.particleRed = 1.0F;
        this.particleGreen = 1.0F;
        this.particleBlue = 1.0F;
        this.particleAlpha = 1.0F;
        this.particleScale = scale;
        this.particleMaxAge = particleMaxAge == 0 ? 50 + (int) (rand.nextFloat() * 30) : particleMaxAge;

        this.imageIndex = this.rand.nextInt(columnCount * rowCount); // % columnCount;

        this.particleTexture = particleTexture != null ? particleTexture : DEFAULT_TEXTURE;
    }

    @Override
    public void onUpdate() {

        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;

        if (this.particleAge++ >= particleMaxAge) //this.particleMaxAge)
            this.setExpired();

        //this.setParticleTextureIndex(7 - this.particleAge * 8 / this.particleMaxAge);
        this.motionY += 0.004D;
        this.move(this.motionX, this.motionY, this.motionZ);
        //this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.99; //8999999761581421D;
        //8999999761581421D;

        this.motionY *= 0.99;

        motionY -= 0.07;

        this.motionZ *= 0.99; //8999999761581421D;

        if (this.isExpired) {
            this.motionX *= 0.699999988079071D;
            this.motionZ *= 0.699999988079071D;
        }

        this.particleAlpha = particleAge < 9 ? 1 : 1 + 9 / particleMaxAge - (particleAge / particleMaxAge);

    }

    @Override
    public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
        mc.getTextureManager().bindTexture(new ResourceLocation(particleTexture));

        GL11.glPushMatrix();
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT);

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDepthMask(false);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glAlphaFunc(GL11.GL_GREATER, 0.003921569F);

        RenderHelper.disableStandardItemLighting();

        buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP);

        float scale = 0.1F * this.particleScale;

        float x = (float) (this.prevPosX + (this.posX - this.prevPosX) * (double) partialTicks - interpPosX);
        float y = (float) (this.prevPosY + (this.posY - this.prevPosY) * (double) partialTicks - interpPosY);
        float z = (float) (this.prevPosZ + (this.posZ - this.prevPosZ) * (double) partialTicks - interpPosZ);

        int brightness = this.getBrightnessForRender(partialTicks); // or simply set it to 200?
        int skyLight = brightness >> 16 & 65535;
        int blockLight = brightness & 65535;

        float columnWidth = 1f / columnCount + 0;
        float rowHeight = 1f / rowCount;

        int rowIndex = Math.floorDiv(imageIndex, columnCount);
        int columnIndex = imageIndex % rowCount;

        float u1 = (columnIndex + 1) * columnWidth;
        float v1 = (rowIndex + 1) * rowHeight; // 1

        float u2 = u1;
        float v2 = rowIndex * rowHeight; //0f;

        float u3 = columnIndex * columnWidth;
        float v3 = v2;

        float u4 = u3;
        float v4 = v1;

        ParticleRenderer.renderParticle(buffer, x - rotationX * scale - rotationXY * scale, y - rotationZ * scale, z - rotationYZ * scale - rotationXZ * scale, skyLight, blockLight, u1, v1, this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha);
        ParticleRenderer.renderParticle(buffer, x - rotationX * scale + rotationXY * scale, y + rotationZ * scale, z - rotationYZ * scale + rotationXZ * scale, skyLight, blockLight, u2, v2, this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha);
        ParticleRenderer.renderParticle(buffer, x + rotationX * scale + rotationXY * scale, y + rotationZ * scale, z + rotationYZ * scale + rotationXZ * scale, skyLight, blockLight, u3, v3, this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha);
        ParticleRenderer.renderParticle(buffer, x + rotationX * scale - rotationXY * scale, y - rotationZ * scale, z + rotationYZ * scale - rotationXZ * scale, skyLight, blockLight, u4, v4, this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha);

        Tessellator.getInstance().draw();

        RenderHelper.enableStandardItemLighting();

        GL11.glPopAttrib();
        GL11.glPopMatrix();
    }

    @Override
    public int getFXLayer() {
        return 3;
    }
}
