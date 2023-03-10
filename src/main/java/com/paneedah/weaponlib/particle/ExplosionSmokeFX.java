package com.paneedah.weaponlib.particle;

import com.paneedah.weaponlib.compatibility.CompatibleParticle;
import com.paneedah.weaponlib.compatibility.CompatibleTessellator;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class ExplosionSmokeFX extends CompatibleParticle {

	//private static final String SMOKE_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/large-yellow-smoke.png";
    private static final String DEFAULT_SMOKE_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/large-smoke.png";

    private String particleTexture;
    private float scale;

	private int imageIndex;

    private static final int columnCount = 4;
    private static final int rowCount = 4;

    public interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }

    private static final TriFunction<Float, Integer, Integer, Float> EXPLOSION_SCALE_UPDATE_FUNCTION = (currentScale, ticks, maxTicks) -> {

        if(currentScale > 25) {
            currentScale *= 1.0008f;
        } else if(currentScale > 20) {
            currentScale *= 1.002f;
        } else if(currentScale > 15) {
            currentScale *= 1.004f;
        } else if(currentScale > 10) {
            currentScale *= 1.05f;
        } else {
            currentScale *= 3f;
        }

        return currentScale;
    };

    private static final TriFunction<Float, Integer, Integer, Float> SMOKE_GRENADE_SCALE_UPDATE_FUNCTION = (currentScale, ticks, maxTicks) -> {

        if(currentScale > 25) {
            currentScale *= 1.0008f;
        } else if(currentScale > 20) {
            currentScale *= 1.002f;
        } else if(currentScale > 15) {
            currentScale *= 1.004f;
        } else if(currentScale > 5) {
            currentScale *= 1.05f;
        } else {
            currentScale *= 2f;
        }

        return currentScale;
    };

    private static final TriFunction<Float, Integer, Integer, Float> EXPLOSION_ALPHA_UPDATE_FUNCTION = (currentAlpha, ticks, maxTicks) -> {
        double alphaRadians = Math.PI / 4f + Math.PI * (float)ticks / (float)maxTicks;
        return 0.3f * (float) Math.sin(alphaRadians > Math.PI ? Math.PI : alphaRadians);
    };

    private static final TriFunction<Float, Integer, Integer, Float> SMOKE_GRENADE_ALPHA_UPDATE_FUNCTION = (currentAlpha, ticks, maxTicks) -> {
        double alphaRadians = Math.PI / 4f + Math.PI * (float)ticks / (float)maxTicks;
        return 0.3f * (float) Math.sin(alphaRadians > Math.PI ? Math.PI : alphaRadians);
    };


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

    private Behavior behavior;

	public ExplosionSmokeFX(World par1World, double positionX, double positionY, double positionZ, float scale,
			float motionX, float motionY, float motionZ, int particleMaxAge, Behavior behavior, String particleTexture)
	{
		super(par1World, positionX, positionY, positionZ, 0.0D, 0.0D, 0.0D);

		this.motionX = motionX;
		this.motionY = motionY;
		this.motionZ = motionZ;

		if (motionX == 0.0F) {
			motionX = 1.0F;
		}

		this.behavior = behavior;

		this.particleRed = 1.0F;
		this.particleGreen = 1.0F;
		this.particleBlue = 1.0F;
		this.particleAlpha = 0.0F;
//		this.particleScale *= scale;
		this.scale = scale;
		this.particleMaxAge = particleMaxAge == 0 ?  50 + (int)(rand.nextFloat() * 30) : particleMaxAge;

        this.imageIndex = this.rand.nextInt(columnCount * rowCount); // % columnCount;
        
        this.particleTexture = particleTexture != null ? particleTexture : DEFAULT_SMOKE_TEXTURE;
	}

	@Override
	public void onUpdate() {
		this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;

        if (this.particleAge++ >= this.particleMaxAge)
        {
            this.setExpired();
        }

        this.motionY += 0.00001D; //this.motionY += 0.0005D;
        compatibility.moveParticle(this, this.motionX, this.motionY, this.motionZ);

        this.motionX *= 0.799999785423279D;
        this.motionY *= 0.9999999785423279D;
        this.motionZ *= 0.799999785423279D;

        this.particleAlpha = behavior.alphaUpdateFunction.apply(particleAlpha, particleAge, particleMaxAge);

        this.particleScale = behavior.scaleUpdateFunction.apply(particleScale, particleAge, particleMaxAge);

        if (this.isCollided())
        {
            this.motionX *= 0.699999988079071D;
            this.motionZ *= 0.699999988079071D;
        }
	}

    @Override
    public void renderParticle(CompatibleTessellator tessellator, float partialTicks, float par3, float par4, float par5, float par6, float par7) {

        mc.getTextureManager().bindTexture(new ResourceLocation(particleTexture));

		GL11.glPushMatrix();
		GL11.glPushAttrib(GL11.GL_ENABLE_BIT);

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDepthMask(false);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glAlphaFunc(GL11.GL_GREATER, 0.003921569F);

        RenderHelper.disableStandardItemLighting();

        tessellator.startDrawingParticles();

        float f10 = 0.1F * this.particleScale * this.scale;

        float f11 = (float)(this.prevPosX + (this.posX - this.prevPosX) * (double)partialTicks - interpPosX);
        float f12 = (float)(this.prevPosY + (this.posY - this.prevPosY) * (double)partialTicks - interpPosY);
        float f13 = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * (double)partialTicks - interpPosZ);

        tessellator.setColorRgba(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha);

        int i = this.getBrightnessForRender(partialTicks); // or simply set it to 200?
        int j = i >> 16 & 65535;
        int k = i & 65535;
        tessellator.setLightMap(j, k);

        /*
         *  (cU, cV)   (bU, bV)
         *
         *  (dU, dV)   (aU, aV)
         *
         */

        float columnWidth = 1f / columnCount + 0;
        float rowHeight = 1f / rowCount;

        int rowIndex = Math.floorDiv(imageIndex, columnCount);
        int columnIndex = imageIndex % rowCount;

        float aU = (columnIndex + 1) * columnWidth;
        float aV = (rowIndex + 1) * rowHeight; // 1

        float bU = aU;
        float bV = rowIndex * rowHeight; //0f;

        float cU = columnIndex * columnWidth;
        float cV = bV;

        float dU = cU;
        float dV = aV;

        tessellator.addVertexWithUV((double)(f11 - par3 * f10 - par6 * f10), (double)(f12 - par4 * f10), (double)(f13 - par5 * f10 - par7 * f10), aU, aV); //1, 1);
        tessellator.addVertexWithUV((double)(f11 - par3 * f10 + par6 * f10), (double)(f12 + par4 * f10), (double)(f13 - par5 * f10 + par7 * f10), bU, bV); //1, 0);
        tessellator.addVertexWithUV((double)(f11 + par3 * f10 + par6 * f10), (double)(f12 + par4 * f10), (double)(f13 + par5 * f10 + par7 * f10), cU, cV); //0, 0);
        tessellator.addVertexWithUV((double)(f11 + par3 * f10 - par6 * f10), (double)(f12 - par4 * f10), (double)(f13 + par5 * f10 - par7 * f10), dU, dV); //0, 1);

        tessellator.draw();

        RenderHelper.enableStandardItemLighting();

        GL11.glPopAttrib();
        GL11.glPopMatrix();
    }

    @Override
    public int getFXLayer() {
    	return 3;
    }
}
