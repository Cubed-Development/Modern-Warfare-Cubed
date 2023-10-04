package com.paneedah.mwc.rendering.perspective;

import com.paneedah.weaponlib.RenderContext;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.shader.DynamicShaderContext;
import com.paneedah.weaponlib.shader.DynamicShaderGroupManager;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.ARBFramebufferObject;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.utils.ModReference.LOG;

@SideOnly(Side.CLIENT)
public abstract class Perspective implements IPerspective {

    protected int width;
    protected int height;

    protected Framebuffer framebuffer;
    protected EntityRenderer entityRenderer;
    private DynamicShaderGroupManager dynamicShaderGroupManager;

    public void init() {
        if (framebuffer == null) {
            framebuffer = new Framebuffer(width, height, true);
            framebuffer.setFramebufferColor(0, 0, 0, 0);
        }

        entityRenderer = PerspectiveManager.ENTITY_RENDERER;
        dynamicShaderGroupManager = PerspectiveManager.DYNAMIC_SHADER_GROUP_MANAGER;
        if (dynamicShaderGroupManager.hasActiveGroups())
            LOG.warn("!!! Active shader groups found !!!");
    }

    public void releaseResources() {
        entityRenderer.resetData();

        framebuffer.framebufferClear();
        framebuffer.deleteFramebuffer();

        dynamicShaderGroupManager.removeAllShaders(new DynamicShaderContext(null, entityRenderer, null, 0f));

        if (OpenGlHelper.isFramebufferEnabled()) {
            OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, GlStateManager.glGetInteger(ARBFramebufferObject.GL_FRAMEBUFFER_BINDING));
            GlStateManager.viewport(0, 0, MC.getFramebuffer().framebufferWidth, MC.getFramebuffer().framebufferHeight);
        }
    }

    public float getBrightness(final RenderContext<RenderableState> context) {
        return 1;
    }

    public int getTexture() {
        return framebuffer != null ? framebuffer.framebufferTexture : -1;
    }
}
