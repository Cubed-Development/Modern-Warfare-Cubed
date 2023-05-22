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

public class FlashFX extends Particle {

    private static final float FLASH_ALPHA_FACTOR = 0.1f;

    private static final double FLASH_SCALE_FACTOR = 0.1f;

    private static final String FLASH_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/flashes.png";
    private static final int imagesPerRow = 8;
    private int imageIndex;
    private String texture;

    public FlashFX(World par1World, double positionX, double positionY, double positionZ, float scale, float alpha, float motionX, float motionY, float motionZ, String texture) {
        super(par1World, positionX, positionY, positionZ, 0.0D, 0.0D, 0.0D);

        this.motionX = motionX;
        this.motionY = motionY;
        this.motionZ = motionZ;

        if (motionX == 0.0F)
            motionX = 0.01F;

        if (motionZ == 0.0F)
            motionZ = 0.01F;

        if (motionY == 0.0F)
            motionY = 0.01F;

        this.particleTextureIndexX = 0;
        this.particleTextureIndexY = 0;
        this.particleRed = 1.0F;
        this.particleGreen = 1.0F;
        this.particleBlue = 1.0F;
        this.particleAlpha = alpha;
        this.particleScale *= 1.4F;
        this.particleScale *= scale;
        this.particleMaxAge = 1;

        this.imageIndex = this.rand.nextInt() % imagesPerRow;

        this.texture = texture != null ? texture : FLASH_TEXTURE;
    }

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;

        if (this.particleAge++ >= this.particleMaxAge)
            this.setExpired();

        this.move(this.motionX, this.motionY, this.motionZ);

        this.motionX *= 0.9999999785423279D;
        this.motionY *= 0.9999999785423279D;
        this.motionZ *= 0.9999999785423279D;

        this.particleAlpha *= FLASH_ALPHA_FACTOR;

        this.particleScale *= FLASH_SCALE_FACTOR;

        if (this.isExpired) {
            this.motionX *= 0.699999988079071D;
            this.motionZ *= 0.699999988079071D;
        }
    }

    @Override
    public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
        mc.getTextureManager().bindTexture(new ResourceLocation(texture));

        GL11.glPushMatrix();
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT);

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDepthMask(false);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glAlphaFunc(GL11.GL_GREATER, 0.003921569F);

        buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP);

        int brightness = this.getBrightnessForRender(partialTicks); // or simply set it to 200?
        int skyLight = brightness >> 16 & 65535;
        int blockLight = brightness & 65535;

        RenderHelper.disableStandardItemLighting();

        float scale = 0.1F * this.particleScale;

        float x = (float) (this.prevPosX + (this.posX - this.prevPosX) * (double) partialTicks - interpPosX);
        float y = (float) (this.prevPosY + (this.posY - this.prevPosY) * (double) partialTicks - interpPosY);
        float z = (float) (this.prevPosZ + (this.posZ - this.prevPosZ) * (double) partialTicks - interpPosZ);

        float uWidth = 1f / imagesPerRow;

        float u1 = (imageIndex + 1) * uWidth; // imageIndex = 0, imagesPerRow = 2, u1 = 0.5; imageIndex = 1, u1 = 1
        // imagesPerRow = 4; imageIndex = 1; u1 = 2/4 = 0.5
        float v1 = 1f;

        float u2 = (imageIndex + 1) * uWidth;
        float v2 = 0f;

        float u3 = imageIndex * uWidth; // imageIndex = 0, imagesPerRow = 2, u3 = 0; imageIndex = 1, u3 = 0.5
        float v3 = 0f;

        float u4 = imageIndex * uWidth;
        float v4 = 1f;

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
