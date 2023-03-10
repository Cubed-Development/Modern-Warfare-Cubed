package com.paneedah.weaponlib.particle;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.compatibility.CompatibleParticle;
import com.paneedah.weaponlib.compatibility.CompatibleTessellator;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import java.util.Random;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class SmokeFX extends CompatibleParticle {

	private static final double SMOKE_SCALE_FACTOR = 1.0005988079071D;

	private static final String SMOKE_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/smokes.png";

	private int imageIndex;

    private static final int imagesPerRow = 4;

	public SmokeFX(World par1World, double positionX, double positionY, double positionZ, float scale,
			float motionX, float motionY, float motionZ)
	{
		super(par1World, positionX, positionY, positionZ, 0.0D, 0.0D, 0.0D);
		this.motionX = motionX;
		this.motionY = motionY;
		this.motionZ = motionZ;

		if (motionX == 0.0F) {
			motionX = 1.0F;
		}

		this.particleTextureIndexX = 0;
		this.particleTextureIndexY = 0;
		this.particleRed = 1.0F;
		this.particleGreen = 1.0F;
		this.particleBlue = 1.0F;
		this.particleAlpha = 0.0F;
		this.particleScale *= scale;
		this.particleMaxAge = 50;
        this.imageIndex = this.rand.nextInt() % imagesPerRow;
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

        this.motionY += 0.0005D;
        compatibility.moveParticle(this, this.motionX, this.motionY, this.motionZ);

        this.motionX *= 0.999999785423279D;
        this.motionY *= 0.9999999785423279D;
        this.motionZ *= 0.999999785423279D;

        double alphaRadians = Math.PI / 4f + Math.PI * (float)this.particleAge / (float)this.particleMaxAge;
        this.particleAlpha = 0.2f * (float) Math.sin(alphaRadians > Math.PI ? Math.PI : alphaRadians);

        this.particleScale *= SMOKE_SCALE_FACTOR;

        if (this.isCollided())
        {
            this.motionX *= 0.699999988079071D;
            this.motionZ *= 0.699999988079071D;
        }
	}

    @Override
    public void renderParticle(CompatibleTessellator tessellator, float partialTicks, float par3, float par4, float par5, float par6, float par7) {

    	
    	
    	mc.getTextureManager().bindTexture(new ResourceLocation(ModReference.id + ":textures/smokes/smokesheet.png"));

    	Random urandom = new Random(333);
		
    	BufferBuilder buffer = tessellator.getBuffer();
    	double rotationX = 0;
    	double rotationXY = 0;
    	
		
		 this.particleRed = this.particleGreen = this.particleBlue = urandom.nextFloat() * 0.5F + 0.4F;
	       
	        int j = this.getBrightnessForRender(partialTicks);
	        int k = j >> 16 & 65535;
	        int l = j & 65535;
	        
			float scale = this.particleScale;
			float pX = (float)(this.prevPosX + (this.posX - this.prevPosX) * (double)partialTicks - interpPosX);
	        float pY = (float)(this.prevPosY + (this.posY - this.prevPosY) * (double)partialTicks - interpPosY);
	        float pZ = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * (double)partialTicks - interpPosZ);
	        
	        double minX = particleTexture.getMinU() + ((particleTexture.getMaxU()-particleTexture.getMinU()) * (particleTextureIndexX/8f));
	        double minY = particleTexture.getMinV() + ((particleTexture.getMaxV()-particleTexture.getMinV()) * (particleTextureIndexY/8f));
	        double mU = (particleTexture.getMaxU()-particleTexture.getMinU())/8;
	        double mV = (particleTexture.getMaxV()-particleTexture.getMinV())/8;
	        
	        float rotationYZ = 0;
			float rotationZ = 0;
			float rotationXZ = 0;
			buffer.pos((double)(pX - rotationX * scale - rotationXY * scale), (double)(pY - rotationZ * scale), (double)(pZ - rotationYZ * scale - rotationXZ * scale)).tex(minX+mU, minY+mV).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(k, l).endVertex();
			buffer.pos((double)(pX - rotationX * scale + rotationXY * scale), (double)(pY + rotationZ * scale), (double)(pZ - rotationYZ * scale + rotationXZ * scale)).tex(minX+mU, minY).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(k, l).endVertex();
			buffer.pos((double)(pX + rotationX * scale + rotationXY * scale), (double)(pY + rotationZ * scale), (double)(pZ + rotationYZ * scale + rotationXZ * scale)).tex(minX, minY).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(k, l).endVertex();
			buffer.pos((double)(pX + rotationX * scale - rotationXY * scale), (double)(pY - rotationZ * scale), (double)(pZ + rotationYZ * scale - rotationXZ * scale)).tex(minX, minY+mV).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(k, l).endVertex();
		
    	
    	if(1+1==2) return;    	
    	//mc.getTextureManager().bindTexture(new ResourceLocation(SMOKE_TEXTURE));

		GL11.glPushMatrix();
		GL11.glPushAttrib(GL11.GL_ENABLE_BIT);

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDepthMask(false);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glAlphaFunc(GL11.GL_GREATER, 0.003921569F);

        tessellator.startDrawingParticles();

        float f10 = 0.1F * this.particleScale;

        float f11 = (float)(this.prevPosX + (this.posX - this.prevPosX) * (double)partialTicks - interpPosX);
        float f12 = (float)(this.prevPosY + (this.posY - this.prevPosY) * (double)partialTicks - interpPosY);
        float f13 = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * (double)partialTicks - interpPosZ);

        tessellator.setColorRgba(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha);

        int i = this.getBrightnessForRender(partialTicks); // or simply set it to 200?
        j = i >> 16 & 65535;
        k = i & 65535;
        tessellator.setLightMap(j, k);

        RenderHelper.disableStandardItemLighting();

        // Single row setup


        /*
         *  (cU, cV)   (bU, bV)
         *
         *  (dU, dV)   (aU, aV)
         *
         */
        float uWidth = 1f / imagesPerRow;

		float aU = (imageIndex + 1) * uWidth; // imageIndex = 0, imagesPerRow = 2, aU = 0.5; imageIndex = 1, aU = 1
			// imagesPerRow = 4; imageIndex = 1; aU = 2/4 = 0.5
        float aV = 1f;

        float bU = (imageIndex + 1) * uWidth;
        float bV = 0f;

        float cU = imageIndex * uWidth; // imageIndex = 0, imagesPerRow = 2, cU = 0; imageIndex = 1, cU = 0.5
        float cV = 0f;

        float dU = imageIndex * uWidth;
        float dV = 1f;

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
