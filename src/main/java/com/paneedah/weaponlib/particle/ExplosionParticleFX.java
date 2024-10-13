package com.paneedah.weaponlib.particle;

import com.paneedah.mwc.renderer.ParticleRenderer;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class ExplosionParticleFX extends Particle {

    private static final String DEFAULT_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/explosion-particles.png";
    private static final int columnCount = 5;
    private static final int rowCount = 5; //4;
    private final int imageIndex;
    private final String particleTexture;

    public ExplosionParticleFX(World par1World, double positionX, double positionY, double positionZ, float scale, double motionX, double motionY, double motionZ, int particleMaxAge, String particleTexture) {
        super(par1World, positionX, positionY, positionZ, 0.0D, 0.0D, 0.0D);

        this.motionX = motionX;
        this.motionY = motionY;
        this.motionZ = motionZ;

        if (motionX == 0.0F) {
        }

        particleTextureIndexX = 0;
        particleTextureIndexY = 0;
        particleRed = 1.0F;
        particleGreen = 1.0F;
        particleBlue = 1.0F;
        particleAlpha = 1.0F;
        particleScale = scale;
        this.particleMaxAge = particleMaxAge == 0 ? 50 + (int) (rand.nextFloat() * 30) : particleMaxAge;

        imageIndex = rand.nextInt(columnCount * rowCount); // % columnCount;

        this.particleTexture = particleTexture != null ? particleTexture : DEFAULT_TEXTURE;
    }

    @Override
    public void onUpdate() {

        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;

        if (particleAge++ >= particleMaxAge) //this.particleMaxAge)
        {
            setExpired();
        }

        //this.setParticleTextureIndex(7 - this.particleAge * 8 / this.particleMaxAge);
        motionY += 0.004D;
        move(motionX, motionY, motionZ);
        //this.moveEntity(this.motionX, this.motionY, this.motionZ);
        motionX *= 0.99; //8999999761581421D;
        //8999999761581421D;

        motionY *= 0.99;

        motionY -= 0.07;

        motionZ *= 0.99; //8999999761581421D;

        if (isExpired) {
            motionX *= 0.699999988079071D;
            motionZ *= 0.699999988079071D;
        }

        particleAlpha = particleAge < 9 ? 1 : 1 + (float) 9 / particleMaxAge - ((float) particleAge / particleMaxAge);

    }

    @Override
    public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
        MC.getTextureManager().bindTexture(new ResourceLocation(particleTexture));

        GL11.glPushMatrix();
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT);

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDepthMask(false);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glAlphaFunc(GL11.GL_GREATER, 0.003921569F);

        RenderHelper.disableStandardItemLighting();

        buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP);

        float scale = 0.1F * particleScale;

        float x = (float) (prevPosX + (posX - prevPosX) * (double) partialTicks - interpPosX);
        float y = (float) (prevPosY + (posY - prevPosY) * (double) partialTicks - interpPosY);
        float z = (float) (prevPosZ + (posZ - prevPosZ) * (double) partialTicks - interpPosZ);

        int brightness = getBrightnessForRender(partialTicks); // or simply set it to 200?
        int skyLight = brightness >> 16 & 65535;
        int blockLight = brightness & 65535;

        float columnWidth = 1f / columnCount + 0;
        float rowHeight = 1f / rowCount;

        int rowIndex = Math.floorDiv(imageIndex, columnCount);
        int columnIndex = imageIndex % rowCount;

        float u1 = (columnIndex + 1) * columnWidth;
        float v1 = (rowIndex + 1) * rowHeight; // 1

        float v2 = rowIndex * rowHeight; //0f;

        float u3 = columnIndex * columnWidth;

        ParticleRenderer.renderParticle(buffer, x - rotationX * scale - rotationXY * scale, y - rotationZ * scale, z - rotationYZ * scale - rotationXZ * scale, skyLight, blockLight, u1, v1, particleRed, particleGreen, particleBlue, particleAlpha);
        ParticleRenderer.renderParticle(buffer, x - rotationX * scale + rotationXY * scale, y + rotationZ * scale, z - rotationYZ * scale + rotationXZ * scale, skyLight, blockLight, u1, v2, particleRed, particleGreen, particleBlue, particleAlpha);
        ParticleRenderer.renderParticle(buffer, x + rotationX * scale + rotationXY * scale, y + rotationZ * scale, z + rotationYZ * scale + rotationXZ * scale, skyLight, blockLight, u3, v2, particleRed, particleGreen, particleBlue, particleAlpha);
        ParticleRenderer.renderParticle(buffer, x + rotationX * scale - rotationXY * scale, y - rotationZ * scale, z + rotationYZ * scale - rotationXZ * scale, skyLight, blockLight, u3, v1, particleRed, particleGreen, particleBlue, particleAlpha);

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
