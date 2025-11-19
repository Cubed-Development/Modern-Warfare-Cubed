package com.paneedah.weaponlib.animation.gui;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.awt.*;

import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class GuiRenderUtil {

    public static void drawScaledString(String text, double x, double y, double scale, int color) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, 0);
        GlStateManager.scale(scale, scale, scale);
        MC.fontRenderer.drawStringWithShadow(text, 0, 0, color);
        GlStateManager.popMatrix();
    }

    public static void renderRect(Color c, double x, double y, double w, double h) {

        float r = (float) c.getRed() / 255f;

        float g = (float) c.getGreen() / 255f;
        float b = (float) c.getBlue() / 255f;

        Tessellator t = Tessellator.getInstance();
        BufferBuilder bb = t.getBuffer();

        bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_COLOR);

        float grad = 0.8f;
        GlStateManager.shadeModel(GL11.GL_SMOOTH);
        bb.pos(x, y, 0).color(r, g, b, 1).endVertex();
        bb.pos(x, y + h, 0).color(r * grad, g * grad, b * grad, 1).endVertex();
        bb.pos(x + w, y + h, 0).color(r * grad, g * grad, b * grad, 1).endVertex();
        bb.pos(x + w, y, 0).color(r, g, b, 1).endVertex();


        t.draw();
    }

    public static void renderTexturedRect(int id, double x, double y, double w, double h) {
        MC.getTextureManager().bindTexture(new ResourceLocation(ID + ":textures/hud/animguio.png"));

        GlStateManager.enableAlpha();
        GlStateManager.enableBlend();
        Tessellator t = Tessellator.getInstance();
        BufferBuilder bb = t.getBuffer();

        bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);

        float width = 64;
        float icoSize = 16;
        float height = 64;


        float u = ((id * icoSize) % width) / width;
        float v = (float) (Math.floor((id * icoSize) / width)) * icoSize / height;
        float m = icoSize / width;
        float n = icoSize / height;


        bb.pos(x, y, 0).tex(u, v).endVertex();
        bb.pos(x, y + h, 0).tex(u, v + n).endVertex();
        bb.pos(x + w, y + h, 0).tex(u + m, v + n).endVertex();
        bb.pos(x + w, y, 0).tex(u + m, v).endVertex();


        t.draw();

        GlStateManager.disableAlpha();
        GlStateManager.disableBlend();
        GlStateManager.disableTexture2D();

    }

}
