package com.paneedah.mwc.models;

import com.paneedah.mwc.rendering.perspective.OpticalScopePerspective;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.ClientValueRepo;
import com.paneedah.weaponlib.compatibility.FlatSurfaceModelBox;
import com.paneedah.weaponlib.config.ModernConfigManager;
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

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.utils.ModReference.ID;

public class Viewfinder extends ModelBase {

    private static final ResourceLocation SCOPE_GRIME_TEXTURE = new ResourceLocation(ID + ":textures/hud/scopedirt.png");

    private final ModelRenderer viewfinder;

    public Viewfinder() {
        textureWidth = 128;
        textureHeight = 64;

        viewfinder = new ModelRenderer(this, 0, 0);
        viewfinder.cubeList.add(new FlatSurfaceModelBox(viewfinder, 0, 0, 0, 0, 0, 3, 3, 0, 0));
        viewfinder.mirror = true;
        viewfinder.setRotationPoint(0, -10, 0);
        viewfinder.setTextureSize(100, 100);
    }

    @Override
    public void render(final Entity entityIn, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
        viewfinder.render(scale);
    }

    public void render(final Reticle reticle, final RenderContext<RenderableState> renderContext, final float scale) {
        if (ModernConfigManager.enableAllShaders && ModernConfigManager.enableScopeEffects)
            renderWithScopeFX(reticle, renderContext, scale);
        else
            renderDry(reticle, scale);
    }

    private void renderDry(final Reticle reticle, final float scale) {
        GlStateManager.disableBlend();
        GlStateManager.disableAlpha();
        viewfinder.render(scale);

        GlStateManager.enableAlpha();
        GlStateManager.enableBlend();
        MC.getTextureManager().bindTexture(reticle.getReticleTexture());
        GlStateManager.pushMatrix();

        GlStateManager.pushMatrix();
        double yOff = 0.68;
        double xOff = -0.119;
        GlStateManager.translate(-xOff, -yOff, 0);
        GlStateManager.rotate(180f, 0, 0, 1);
        GlStateManager.translate(xOff, yOff, 0.001);

        viewfinder.render(scale);

        GlStateManager.popMatrix();
        GlStateManager.popMatrix();
    }

    private void renderWithScopeFX(final Reticle reticle, final RenderContext<RenderableState> renderContext, final float scale) {
        GlStateManager.enableBlend();
        GlStateManager.enableAlpha();

        boolean isNightVisionOn = false;
        boolean useWhitePhosphor = false;
        if (renderContext.getWeaponInstance() != null) {
            final ItemAttachment<Weapon> scope = renderContext.getWeaponInstance().getAttachmentItemWithCategory(AttachmentCategory.SCOPE);

            if (scope instanceof ItemScope) {
                isNightVisionOn = ((ItemScope) scope).hasNightVision() && renderContext.getWeaponInstance().isNightVisionOn();
                useWhitePhosphor = ((ItemScope) scope).usesWhitePhosphor();
            }
        }

        final Shader scopeShader = OpticalScopePerspective.scope;

        scopeShader.use();

        final boolean shouldDoFog = PostProcessPipeline.shouldDoFog() && PostProcessPipeline.getScopeDepthTexture() != null;

        if (shouldDoFog) {
            GlStateManager.setActiveTexture(GL13.GL_TEXTURE0 + 3);
            GlStateManager.bindTexture(PostProcessPipeline.getScopeDepthTexture().getTexture());
            GlStateManager.setActiveTexture(GL13.GL_TEXTURE0);
        }

        GlStateManager.setActiveTexture(GL13.GL_TEXTURE0 + 4);
        MC.getTextureManager().bindTexture(reticle.getReticleTexture());
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
        GlStateManager.setActiveTexture(GL13.GL_TEXTURE0);

        GlStateManager.setActiveTexture(GL13.GL_TEXTURE0 + 6);
        MC.getTextureManager().bindTexture(SCOPE_GRIME_TEXTURE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
        GlStateManager.setActiveTexture(GL13.GL_TEXTURE0);
    	
    	/* Code for a future hybrid scope
    	GlStateManager.setActiveTexture(GL13.GL_TEXTURE0+7);
		ResourceLocation loc = new ResourceLocation(ID + ":textures/reticles/reflexret.png");
		MC.getTextureManager().bindTexture(loc);
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
		GlStateManager.setActiveTexture(GL13.GL_TEXTURE0);
		*/

        if (ClientModContext.getContext() != null && ClientModContext.getContext().getMainHeldWeapon() != null) {
            final float zoom = ClientModContext.getContext().getMainHeldWeapon().getZoom();

            scopeShader.uniform1f("reticleZoom", (zoom + 0.86F));
            scopeShader.uniform1f("actualZoom", (1 - zoom) - 0.80F);
        }

        if (shouldDoFog) {
            scopeShader.boolean1b("shouldDoFog", true);
            scopeShader.uniform1i("depthTex", 3);

            final float fogIntensity = 0.6F * MC.world.getRainStrength(MC.getRenderPartialTicks());

            scopeShader.uniform1f("fogIntensity", fogIntensity);
            scopeShader.uniform3f("baseFogColor", 0.6F, 0.6F, 0.6F);
        } else {
            scopeShader.boolean1b("shouldDoFog", false);
        }

        scopeShader.uniform1i("reticle", 4);
        scopeShader.uniform1i("dirt", 6);
        //scopeShader.uniform1i("holo", 7);

        scopeShader.boolean1b("isNightVisionOn", isNightVisionOn);
        scopeShader.boolean1b("useWhitePhosphor", useWhitePhosphor);
        scopeShader.uniform1f("time", ClientValueRepo.TICKER.getLerpedFloat());

        viewfinder.render(scale);

        scopeShader.release();

        GlStateManager.disableBlend();
        GlStateManager.disableAlpha();
    }
}
