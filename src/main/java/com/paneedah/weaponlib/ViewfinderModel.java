package com.paneedah.weaponlib;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.animation.ClientValueRepo;
import com.paneedah.weaponlib.compatibility.FlatSurfaceModelBox;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.perspective.OpticalScopePerspective;
import com.paneedah.weaponlib.render.bgl.PostProcessPipeline;
import com.paneedah.weaponlib.render.scopes.Reticle;
import com.paneedah.weaponlib.shader.jim.Shader;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class ViewfinderModel extends ModelBase {
	
	private static final ResourceLocation SCOPE_GRIME_TEXTURE = new ResourceLocation(ModReference.ID + ":textures/hud/scopedirt.png");

	private ModelRenderer surfaceRenderer;
	private FlatSurfaceModelBox box;

	public ViewfinderModel() {
		textureWidth = 128;
		textureHeight = 64;

		surfaceRenderer = new ModelRenderer(this, 0, 0);
		box = new FlatSurfaceModelBox(surfaceRenderer, 0, 0, 0f, 0f, 0f, 3, 3, 0, 0.0F);
		surfaceRenderer.cubeList.add(box);
		surfaceRenderer.mirror = true;
		surfaceRenderer.setRotationPoint(0F, -10F, 0F);
		surfaceRenderer.setTextureSize(100, 100);
		
		setRotation(surfaceRenderer, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale) {
	
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		surfaceRenderer.render(scale);
	}
	
	public void render(Reticle ret, RenderContext<RenderableState> renderContext, Entity entity, float f5) {
		

	
		
		if(ModernConfigManager.enableAllShaders && ModernConfigManager.enableScopeEffects) {
			renderWithScopeFX(ret, renderContext, entity, f5);
		} else {
			renderDry(ret, entity, f5);
		}
		
		
		
	}
	
	public void renderDry(Reticle ret, Entity entity, float f5) {
		GlStateManager.disableBlend();
		GlStateManager.disableAlpha();
		surfaceRenderer.render(f5);
		
		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();
		mc.getTextureManager().bindTexture(ret.getReticleTexture());
		GlStateManager.pushMatrix();
		
		GlStateManager.pushMatrix();
		double yOff = 0.68;
		double xOff = -0.119;
		GlStateManager.translate(-xOff, -yOff, 0);
		GlStateManager.rotate(180f, 0, 0, 1);
		GlStateManager.translate(xOff, yOff, 0.001);
		
		surfaceRenderer.render(f5);
		
		GlStateManager.popMatrix();
		GlStateManager.popMatrix();
		
		
	}
	
	public void renderWithScopeFX(Reticle ret, RenderContext<RenderableState> renderContext, Entity entity, float f5) {
		GlStateManager.enableBlend();
		GlStateManager.enableAlpha();
		
		
	
		boolean isNightVisionOn = false;
		boolean useWhitePhosphor = false;
		if(renderContext.getWeaponInstance() != null) {
			ItemAttachment<Weapon> scope = renderContext.getWeaponInstance().getAttachmentItemWithCategory(AttachmentCategory.SCOPE);
			if(scope != null) { 
				if(scope instanceof ItemScope) {
					isNightVisionOn = ((ItemScope) scope).hasNightVision() && renderContext.getWeaponInstance().isNightVisionOn();
					useWhitePhosphor = ((ItemScope) scope).usesWhitePhosphor();
				}
			}
		}

		Shader scopeShader = OpticalScopePerspective.scope;
	
		scopeShader.use();
		
		boolean shouldDoFog = PostProcessPipeline.shouldDoFog() && PostProcessPipeline.getScopeDepthTexture() != null;
		
	
		//shouldDoFog = false;
		if(shouldDoFog) {
			GlStateManager.setActiveTexture(GL13.GL_TEXTURE0 + 3);
			GlStateManager.bindTexture(PostProcessPipeline.getScopeDepthTexture().getTexture());
			GlStateManager.setActiveTexture(GL13.GL_TEXTURE0);
		}
		
	
		GlStateManager.setActiveTexture(GL13.GL_TEXTURE0 + 4);
		mc.getTextureManager().bindTexture(ret.getReticleTexture());
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
    	GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
    	GlStateManager.setActiveTexture(GL13.GL_TEXTURE0);
    	
    	
    	GlStateManager.setActiveTexture(GL13.GL_TEXTURE0 + 6);
		mc.getTextureManager().bindTexture(SCOPE_GRIME_TEXTURE);
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
    	GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
    	GlStateManager.setActiveTexture(GL13.GL_TEXTURE0);
    	
    	/* Code for a future hybrid scope
    	GlStateManager.setActiveTexture(GL13.GL_TEXTURE0+7);
		ResourceLocation loc = new ResourceLocation(ModReference.id + ":textures/crosshairs/reflexret.png");
		mc.getTextureManager().bindTexture(loc);
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
		GlStateManager.setActiveTexture(GL13.GL_TEXTURE0);
		*/
    	

    	if(ClientModContext.getContext() != null && ClientModContext.getContext().getMainHeldWeapon() != null) {
    		float pwi = ClientModContext.getContext().getMainHeldWeapon().getZoom();
    		if(ClientModContext.getContext().getMainHeldWeapon().state != WeaponState.READY && ClientModContext.getContext().getMainHeldWeapon().state != WeaponState.PAUSED && ClientModContext.getContext().getMainHeldWeapon().state != WeaponState.EJECT_REQUIRED && ClientModContext.getContext().getMainHeldWeapon().state != WeaponState.ALERT) {
        		ClientValueRepo.scopeY.currentValue = 1;
        	}
    		scopeShader.uniform1f("reticleZoom", (pwi+0.86f));
    		scopeShader.uniform1f("actualZoom", (1.0f - pwi) - 0.80f);
    	}
    	
    	
    	if(shouldDoFog) {
    		scopeShader.boolean1b("shouldDoFog", true);
    		scopeShader.uniform1i("depthTex", 3);
    		
    		float fogIntensity = 0.6f;
    		fogIntensity *= mc.world.getRainStrength(mc.getRenderPartialTicks());
    		scopeShader.uniform1f("fogIntensity", fogIntensity);
    		scopeShader.uniform3f("baseFogColor", 0.6f, 0.6f, 0.6f);

    		
    	} else {
    		scopeShader.boolean1b("shouldDoFog", false);
    	}
 
    	scopeShader.uniform1i("reticle", 4);
    	scopeShader.uniform1i("dirt", 6);
    	//scopeShader.uniform1i("holo", 7);
    	
    	//scopeShader.uniform2f("Velocity", (float) ClientValueRepo.scopeX.getLerpedFloat(), (float) ClientValueRepo.scopeY.getLerpedFloat());
    	scopeShader.uniform2f("resolution", mc.displayWidth, mc.displayHeight);
    	scopeShader.boolean1b("isNightVisionOn", isNightVisionOn);
    	scopeShader.boolean1b("useWhitePhosphor", useWhitePhosphor);
    	scopeShader.uniform1f("time", ClientValueRepo.TICKER.getLerpedFloat());
 
    	
    	
    	
    	GlStateManager.enableBlend();
		surfaceRenderer.render(f5);
		scopeShader.release();
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
