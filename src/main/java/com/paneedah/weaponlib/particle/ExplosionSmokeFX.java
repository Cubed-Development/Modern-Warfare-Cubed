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

public class ExplosionSmokeFX extends Particle {

    //private static final String SMOKE_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/large-yellow-smoke.png";
    private static final String DEFAULT_SMOKE_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/large-smoke.png";
    private static final int columnCount = 4;
    private static final int rowCount = 4;

    private static final TriFunction<Float, Integer, Integer, Float> EXPLOSION_SCALE_UPDATE_FUNCTION = (currentScale, ticks, maxTicks) -> {
        if (currentScale > 25)
            currentScale *= 1.0008f;
        else if (currentScale > 20)
            currentScale *= 1.002f;
        else if (currentScale > 15)
            currentScale *= 1.004f;
        else if (currentScale > 10)
            currentScale *= 1.05f;
        else
            currentScale *= 3f;

        return currentScale;
    };

    private static final TriFunction<Float, Integer, Integer, Float> SMOKE_GRENADE_SCALE_UPDATE_FUNCTION = (currentScale, ticks, maxTicks) -> {
        if (currentScale > 25)
            currentScale *= 1.0008f;
        else if (currentScale > 20)
            currentScale *= 1.002f;
        else if (currentScale > 15)
            currentScale *= 1.004f;
        else if (currentScale > 5)
            currentScale *= 1.05f;
        else
            currentScale *= 2f;

        return currentScale;
    };

    private static final TriFunction<Float, Integer, Integer, Float> EXPLOSION_ALPHA_UPDATE_FUNCTION = (currentAlpha, ticks, maxTicks) -> {
        double alphaRadians = Math.PI / 4f + Math.PI * (float) ticks / (float) maxTicks;
        return 0.3f * (float) Math.sin(alphaRadians > Math.PI ? Math.PI : alphaRadians);
    };

    private static final TriFunction<Float, Integer, Integer, Float> SMOKE_GRENADE_ALPHA_UPDATE_FUNCTION = (currentAlpha, ticks, maxTicks) -> {
        double alphaRadians = Math.PI / 4f + Math.PI * (float) ticks / (float) maxTicks;
        return 0.3f * (float) Math.sin(alphaRadians > Math.PI ? Math.PI : alphaRadians);
    };

    private String particleTexture;
    private float scale;
    private int imageIndex;
    private Behavior behavior;

    public ExplosionSmokeFX(World par1World, double positionX, double positionY, double positionZ, float scale, float motionX, float motionY, float motionZ, int particleMaxAge, Behavior behavior, String particleTexture) {
        super(par1World, positionX, positionY, positionZ, 0.0D, 0.0D, 0.0D);

        this.motionX = motionX;
        this.motionY = motionY;
        this.motionZ = motionZ;

        if (motionX == 0.0F)
            motionX = 1.0F;

        this.behavior = behavior;

        this.particleRed = 1.0F;
        this.particleGreen = 1.0F;
        this.particleBlue = 1.0F;
        this.particleAlpha = 0.0F;
//		this.particleScale *= scale;
        this.scale = scale;
        this.particleMaxAge = particleMaxAge == 0 ? 50 + (int) (rand.nextFloat() * 30) : particleMaxAge;

        this.imageIndex = this.rand.nextInt(columnCount * rowCount); // % columnCount;

        this.particleTexture = particleTexture != null ? particleTexture : DEFAULT_SMOKE_TEXTURE;
    }

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;

        if (this.particleAge++ >= this.particleMaxAge)
            this.setExpired();

        this.motionY += 0.00001D; //this.motionY += 0.0005D;
        this.move(this.motionX, this.motionY, this.motionZ);

        this.motionX *= 0.799999785423279D;
        this.motionY *= 0.9999999785423279D;
        this.motionZ *= 0.799999785423279D;

        this.particleAlpha = behavior.alphaUpdateFunction.apply(particleAlpha, particleAge, particleMaxAge);

        this.particleScale = behavior.scaleUpdateFunction.apply(particleScale, particleAge, particleMaxAge);

        if (this.isExpired) {
            this.motionX *= 0.699999988079071D;
            this.motionZ *= 0.699999988079071D;
        }
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

        float scale = 0.1F * this.particleScale * this.scale;

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

    public static enum Behavior {

        EXPLOSION(EXPLOSION_SCALE_UPDATE_FUNCTION, EXPLOSION_ALPHA_UPDATE_FUNCTION),

        SMOKE_GRENADE(SMOKE_GRENADE_SCALE_UPDATE_FUNCTION, SMOKE_GRENADE_ALPHA_UPDATE_FUNCTION);

        private TriFunction<Float, Integer, Integer, Float> scaleUpdateFunction;
        private TriFunction<Float, Integer, Integer, Float> alphaUpdateFunction;

        private Behavior(TriFunction<Float, Integer, Integer, Float> scaleUpdateFunction,
                         TriFunction<Float, Integer, Integer, Float> alphaUpdateFunction) {
            this.scaleUpdateFunction = scaleUpdateFunction;
            this.alphaUpdateFunction = alphaUpdateFunction;
        }

    }

    public interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }

    @Override
    public int getFXLayer() {
        return 3;
    }
}
