package com.paneedah.weaponlib.perspective;

import com.paneedah.weaponlib.RenderableState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public abstract class ScreenPerspective extends Perspective<RenderableState> {

    public ScreenPerspective() {
        this.width = 427; //MC.displayWidth >> 1;
        this.height = 240; //MC.displayHeight >> 1;
    }

    @Override
    public void update(TickEvent.RenderTickEvent event) {
        //if(true) return;
        int originalFramebufferId = GlStateManager.glGetInteger(ARBFramebufferObject.GL_FRAMEBUFFER_BINDING);

        GlStateManager.pushMatrix();
        GlStateManager.pushAttrib(); // TODO: This fucks up the GlStateManager - Luna Mira Lage (Desoroxxx) 2025-12-28 // Before the transition to GlStateManager it used `GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT`, but GlStateManager don't allow mask so maybe we just don't at all? - Luna Mira Lage (Desoroxxx) - 2025-12-28
        //MC.entityRenderer.disableLightmap();
        enable2DRenderingMode(427, 240);

        framebuffer.framebufferClear();
        framebuffer.bindFramebuffer(true);

        drawScreen();

        restoreRenderingMode();

        //MC.entityRenderer.enableLightmap();
        GlStateManager.popAttrib(); // TODO: This fucks up the GlStateManager - Luna Mira Lage (Desoroxxx) 2025-12-28
        GlStateManager.popMatrix();

        if (OpenGlHelper.isFramebufferEnabled()) {
            OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, originalFramebufferId);
            GlStateManager.viewport(0, 0, MC.getFramebuffer().framebufferWidth, MC.getFramebuffer().framebufferHeight);
        }
    }

    protected abstract void drawScreen();


    private void enable2DRenderingMode(double projectionWidth, double projectionHeight) {
        //GlStateManager.clear(GL11.GL_DEPTH_BUFFER_BIT);
        GlStateManager.matrixMode(GL11.GL_PROJECTION);
        GlStateManager.pushMatrix();
        GlStateManager.loadIdentity();
        GlStateManager.ortho(0.0D, projectionWidth, projectionHeight, 0, -1, 1); //0.0D, 1000.0D, 3000.0D);
        GlStateManager.matrixMode(GL11.GL_MODELVIEW);
        GlStateManager.pushMatrix();
        GlStateManager.loadIdentity();
        //GlStateManager.translate(0, 0, -2000);
    }

    private void restoreRenderingMode() {
        GlStateManager.matrixMode(GL11.GL_PROJECTION);
        GlStateManager.popMatrix();
        GlStateManager.matrixMode(GL11.GL_MODELVIEW);
        GlStateManager.popMatrix();

    }
}
