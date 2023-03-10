package com.paneedah.weaponlib.render.gui;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import scala.concurrent.duration.Duration;

import java.util.concurrent.TimeUnit;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class GUIRenderHelper {
	
	public static enum StringAlignment {
		CENTERED,
		LEFT,
		RIGHT
	}

	private static double FONT_SIZE_HALVED = mc.fontRenderer.FONT_HEIGHT/2.0;

	
	public static String formatTimeString(long time, TimeUnit unit) {
		Duration duration = Duration.create(time, unit);
		
		if(duration.toDays() != 0) {
			return (duration.toDays()) + "d " + (duration.toHours() - duration.toDays()*24) + "h ";
		} else if(duration.toHours() != 0) {
			return (duration.toHours()) + "h " + (duration.toMinutes() - duration.toHours()*60) + "m " + (duration.toSeconds() - duration.toMinutes()*60) + "s";
		} else if(duration.toMinutes() != 0) {
			return (duration.toMinutes()) + "m " + (duration.toSeconds() - duration.toMinutes()*60) + "s";
		} else if(duration.toSeconds() != 0) {
			return duration.toSeconds() + "s";
		}
		return "";
	}
	
	
	public static void drawAlignedString(String text, StringAlignment alignment, boolean verticallyCentered, double x, double y, double scale, int color) {
		switch(alignment) {
			case CENTERED: {
				x -= mc.fontRenderer.getStringWidth(text)*scale/2;
			}
			case RIGHT: {
				x -= mc.fontRenderer.getStringWidth(text)*scale;
			}
		}
		if(verticallyCentered) {
			y += FONT_SIZE_HALVED;
		}
		
		drawScaledString(text, x, y, scale, color);
	}
	
	public static boolean checkInBox(double tX, double tY, double x, double y, double width, double height) {
		return tX >= x && tX <= x + width && tY >= y && tY <= y + height;
	}

	
	
	public static void drawScaledString(String text, double x, double y, double scale, int color) {
	
		
		GlStateManager.pushMatrix();
		GlStateManager.translate(x, y, 0);
		GlStateManager.scale(scale, scale, scale);

		mc.fontRenderer.drawStringWithShadow(text, 0, 0, color);

		GlStateManager.popMatrix();
	}

	public static void quickItemRender(Item item, double x, double y, double scale) {
		GlStateManager.pushMatrix();

		
		
		
	
		GlStateManager.translate(x, y, 0);
		GlStateManager.scale(scale, scale, 1.0);
		RenderHelper.enableGUIStandardItemLighting();
		mc.getRenderItem().renderItemIntoGUI(new ItemStack(item), 0, 0);
		RenderHelper.disableStandardItemLighting();
		

		
		GlStateManager.popMatrix();
	}

	public static void drawTexturedRect(double x, double y, float u, float v, double width, double height,
			double textureWidth, double textureHeight) {
		float f = (float) (1.0F / textureWidth);
		float f1 = (float) (1.0F / textureHeight);
		Tessellator tessellator = Tessellator.getInstance();
		BufferBuilder bufferbuilder = tessellator.getBuffer();
		bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
		bufferbuilder.pos((double) x, (double) (y + height), 0.0D)
				.tex((double) (u * f), (double) ((v + (float) height) * f1)).endVertex();
		bufferbuilder.pos((double) (x + width), (double) (y + height), 0.0D)
				.tex((double) ((u + (float) width) * f), (double) ((v + (float) height) * f1)).endVertex();
		bufferbuilder.pos((double) (x + width), (double) y, 0.0D)
				.tex((double) ((u + (float) width) * f), (double) (v * f1)).endVertex();
		bufferbuilder.pos((double) x, (double) y, 0.0D).tex((double) (u * f), (double) (v * f1)).endVertex();
		tessellator.draw();

	}

	public static void drawColoredRectangle(double x, double y, double width, double height, double alpha, int color) {

		float r = (float) (((color & 0xFF0000) >> 16) / 255.0);
		float g = (float) (((color & 0xFF00) >> 8) / 255.0);
		float b = (float) ((color & 0xFF) / 255.0);

		Tessellator tessellator = Tessellator.getInstance();
		BufferBuilder bufferbuilder = tessellator.getBuffer();
		bufferbuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
		bufferbuilder.pos((double) x, (double) (y + height), 0.0D).color(r, g, b, (float) alpha).endVertex();
		bufferbuilder.pos((double) (x + width), (double) (y + height), 0.0D).color(r, g, b, (float) alpha).endVertex();
		bufferbuilder.pos((double) (x + width), (double) y, 0.0D).color(r, g, b, (float) alpha).endVertex();
		bufferbuilder.pos((double) x, (double) y, 0.0D).color(r, g, b, (float) alpha).endVertex();
		tessellator.draw();
	}

	public static void drawTexturedScaledRect(double x, double y, float u, float v, double width, double height,
			double textureWidth, double textureHeight, double scale) {
		float f = (float) (1.0F / textureWidth);
		float f1 = (float) (1.0F / textureHeight);
		Tessellator tessellator = Tessellator.getInstance();
		BufferBuilder bufferbuilder = tessellator.getBuffer();
		bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
		bufferbuilder.pos((double) x, (double) (y + height * scale), 0.0D)
				.tex((double) (u * f), (double) ((v + (float) height) * f1)).endVertex();
		bufferbuilder.pos((double) (x + width * scale), (double) (y + height * scale), 0.0D)
				.tex((double) ((u + (float) width) * f), (double) ((v + (float) height) * f1)).endVertex();
		bufferbuilder.pos((double) (x + width * scale), (double) y, 0.0D)
				.tex((double) ((u + (float) width) * f), (double) (v * f1)).endVertex();
		bufferbuilder.pos((double) x, (double) y, 0.0D).tex((double) (u * f), (double) (v * f1)).endVertex();
		tessellator.draw();
	}


}
