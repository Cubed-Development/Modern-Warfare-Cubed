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

public class ExplosionSmokeFX extends Particle {

    //private static final String SMOKE_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/large-yellow-smoke.png";
    private static final String DEFAULT_SMOKE_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/large-smoke.png";
    private static final int columnCount = 4;
    private static final int rowCount = 4;

    private static final TriFunction<Float, Integer, Integer, Float> EXPLOSION_SCALE_UPDATE_FUNCTION = (currentScale, ticks, maxTicks) -> {
        if (currentScale.floatValue() > 25) {
            currentScale = currentScale.floatValue() * 1.0008f;
        } else if (currentScale.floatValue() > 20) {
            currentScale = currentScale.floatValue() * 1.002f;
        } else if (currentScale.floatValue() > 15) {
            currentScale = currentScale.floatValue() * 1.004f;
        } else if (currentScale.floatValue() > 10) {
            currentScale = currentScale.floatValue() * 1.05f;
        } else {
            currentScale = currentScale.floatValue() * 3f;
        }

        return currentScale;
    };

    private static final TriFunction<Float, Integer, Integer, Float> SMOKE_GRENADE_SCALE_UPDATE_FUNCTION = (currentScale, ticks, maxTicks) -> {
        if (currentScale.floatValue() > 25) {
            currentScale = currentScale.floatValue() * 1.0008f;
        } else if (currentScale.floatValue() > 20) {
            currentScale = currentScale.floatValue() * 1.002f;
        } else if (currentScale.floatValue() > 15) {
            currentScale = currentScale.floatValue() * 1.004f;
        } else if (currentScale.floatValue() > 5) {
            currentScale = currentScale.floatValue() * 1.05f;
        } else {
            currentScale = currentScale.floatValue() * 2f;
        }

        return currentScale;
    };

    private static final TriFunction<Float, Integer, Integer, Float> EXPLOSION_ALPHA_UPDATE_FUNCTION = (currentAlpha, ticks, maxTicks) -> {
        double alphaRadians = Math.PI / 4f + Math.PI * ticks.floatValue() / maxTicks.floatValue();
        return Float.valueOf(0.3f * (float) Math.sin(alphaRadians > Math.PI ? Math.PI : alphaRadians));
    };

    private static final TriFunction<Float, Integer, Integer, Float> SMOKE_GRENADE_ALPHA_UPDATE_FUNCTION = (currentAlpha, ticks, maxTicks) -> {
        double alphaRadians = Math.PI / 4f + Math.PI * ticks.floatValue() / maxTicks.floatValue();
        return Float.valueOf(0.3f * (float) Math.sin(alphaRadians > Math.PI ? Math.PI : alphaRadians));
    };

    private final String particleTexture;
    private final float scale;
    private final int imageIndex;
    private final Behavior behavior;

    public ExplosionSmokeFX(World par1World, double positionX, double positionY, double positionZ, float scale, float motionX, float motionY, float motionZ, int particleMaxAge, Behavior behavior, String particleTexture) {
        super(par1World, positionX, positionY, positionZ, 0.0D, 0.0D, 0.0D);

        this.motionX = motionX;
        this.motionY = motionY;
        this.motionZ = motionZ;

        if (motionX == 0.0F) {
        }

        this.behavior = behavior;

        particleRed = 1.0F;
        particleGreen = 1.0F;
        particleBlue = 1.0F;
        particleAlpha = 0.0F;
//		this.particleScale *= scale;
        this.scale = scale;
        this.particleMaxAge = particleMaxAge == 0 ? 50 + (int) (rand.nextFloat() * 30) : particleMaxAge;

        imageIndex = rand.nextInt(columnCount * rowCount); // % columnCount;

        this.particleTexture = particleTexture != null ? particleTexture : DEFAULT_SMOKE_TEXTURE;
    }

    @Override
    public void onUpdate() {
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;

        if (particleAge++ >= particleMaxAge) {
            setExpired();
        }

        motionY += 0.00001D; //this.motionY += 0.0005D;
        move(motionX, motionY, motionZ);

        motionX *= 0.799999785423279D;
        motionY *= 0.9999999785423279D;
        motionZ *= 0.799999785423279D;

        particleAlpha = behavior.alphaUpdateFunction.apply(Float.valueOf(particleAlpha), Integer.valueOf(particleAge), Integer.valueOf(particleMaxAge)).floatValue();

        particleScale = behavior.scaleUpdateFunction.apply(Float.valueOf(particleScale), Integer.valueOf(particleAge), Integer.valueOf(particleMaxAge)).floatValue();

        if (isExpired) {
            motionX *= 0.699999988079071D;
            motionZ *= 0.699999988079071D;
        }
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

        float scale = 0.1F * particleScale * this.scale;

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

    public enum Behavior {

        EXPLOSION(EXPLOSION_SCALE_UPDATE_FUNCTION, EXPLOSION_ALPHA_UPDATE_FUNCTION),

        SMOKE_GRENADE(SMOKE_GRENADE_SCALE_UPDATE_FUNCTION, SMOKE_GRENADE_ALPHA_UPDATE_FUNCTION);

        private final TriFunction<Float, Integer, Integer, Float> scaleUpdateFunction;
        private final TriFunction<Float, Integer, Integer, Float> alphaUpdateFunction;

        Behavior(TriFunction<Float, Integer, Integer, Float> scaleUpdateFunction,
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
