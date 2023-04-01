package com.paneedah.weaponlib.perspective;

import com.paneedah.weaponlib.ClientModContext;
import com.paneedah.weaponlib.RenderContext;
import com.paneedah.weaponlib.compatibility.CompatibleWorldRenderer;
import com.paneedah.weaponlib.compatibility.MWCParticleManager;
import com.paneedah.weaponlib.shader.DynamicShaderContext;
import com.paneedah.weaponlib.shader.DynamicShaderGroupManager;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.opengl.ARBFramebufferObject;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public abstract class Perspective<S> {

    protected ClientModContext modContext;
    protected Framebuffer framebuffer;

    protected int width;
    protected int height;

    protected CompatibleWorldRenderer entityRenderer;
    protected MWCParticleManager effectRenderer;
    protected DynamicShaderGroupManager shaderGroupManager;

    public void activate(ClientModContext modContext, PerspectiveManager manager) {
        this.modContext = modContext;
        if(framebuffer == null) {
            framebuffer = new Framebuffer(width, height, true);
            framebuffer.setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
        }
        this.entityRenderer = manager.getEntityRenderer();
        this.effectRenderer = manager.getEffectRenderer();
        this.shaderGroupManager = new DynamicShaderGroupManager(); //manager.getShaderGroupManager();
        if(this.shaderGroupManager.hasActiveGroups()) {
            System.err.println("!!! Active shader groups found !!!");
        }
    }

    public void deactivate(ClientModContext modContext) {
        //framebuffer.framebufferClear();
        int originalFramebufferId = GlStateManager.glGetInteger(ARBFramebufferObject.GL_FRAMEBUFFER_BINDING);

        framebuffer.deleteFramebuffer();
        this.shaderGroupManager.removeAllShaders(new DynamicShaderContext(null, entityRenderer, null, 0f));
        if (OpenGlHelper.isFramebufferEnabled()) {
            OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, originalFramebufferId);
            GlStateManager.viewport(0, 0, mc.getFramebuffer().framebufferWidth, mc.getFramebuffer().framebufferHeight);
        }
    }

    public float getBrightness(RenderContext<S> context) {
        return 1f;
    }

    public int getTexture(RenderContext<S> context) {
        return framebuffer != null ? framebuffer.framebufferTexture : -1;
    }

    public Framebuffer getFramebuffer() {
        return framebuffer;
    }

    public abstract void update(TickEvent.RenderTickEvent event);

}
