package com.paneedah.mwc.weaponlib.animation.gui;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;

public class GuiRenderUtil {
	
	public static void drawScaledString(FontRenderer fr, String text, double x, double y, double scale, int color) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(x, y, 0);
		GlStateManager.scale(scale, scale, scale);
		fr.drawStringWithShadow(text, 0, 0, color);
		GlStateManager.popMatrix();
	}

}
