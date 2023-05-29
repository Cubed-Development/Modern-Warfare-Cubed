package com.paneedah.weaponlib.animation.gui;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;

import java.awt.Color;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class Textbar {
	
	public int x = 0;
	public int y = 0;
	
	public int w = 0;
	public int h= 0;
	
	public String[] strings = new String[3];
	
	public String name;
	
	public Textbar(String name, int x, int y, int w, int h) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	public String formatDouble(double d) {
		return Math.round(d*10)/10.0 + "";
	}
	
	public void setStrings(double one, double two, double three) {
		strings[0] = formatDouble(one);
		strings[1] = formatDouble(two);
		strings[2] = formatDouble(three);
	}
	
	public void renderButton(int mouseX, int mouseY) {
		
		Color c = new Color(0x222f3e);
		
		if(isMouseOver(mouseX, mouseY)) {
			c = c.darker().darker();
		}
		
		Color[] cAr = new Color[] {
				new Color(0xff3838),
				new Color(0x32ff7e),
				new Color(0x18dcff)
				
				
		};
		
		AnimationGUI.renderRect(new Color(0x3d3d3d).darker(), x-5, y-10, w+5, h+15);
		GlStateManager.enableTexture2D();
		
		AnimationGUI.renderScaledString(this.name, x, y-7, 0.6);
		//mc.fontRenderer.drawStringWithShadow("Position", x, y-5, 0xffffff);
		GlStateManager.disableTexture2D();
		
		int cS = 0;
		for(int i = 0; i < w; i += w/3) {
			renderBoxFlag(strings[Math.min(cS, 2)], x+i, y, w/3 - 5, h, cAr[Math.min(cS, 2)]);
			cS++;
		}
		
		
		
	}
	
	public void renderBoxFlag(String str, int x, int y, int w, int h, Color flagCol) {
		AnimationGUI.renderRect(new Color(0x576574), x, y, w, h);
	
	
		
		float r = (float) flagCol.getRed()/255f;
		
		float g = (float) flagCol.getGreen()/255f;
		float b = (float) flagCol.getBlue()/255f;
		
		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		bb.begin(GL11.GL_TRIANGLES, DefaultVertexFormats.POSITION_COLOR);
		
		
		float buf = (h*0.3f);
		bb.pos(x+w, y+buf, 0).color(r, g, b, 1).endVertex();
		bb.pos(x+buf*4, y, 0).color(r, g, b, 1).endVertex();
		bb.pos(x+w, y, 0).color(r, g, b, 1).endVertex();
		
		
		t.draw();
		

		GlStateManager.enableTexture2D();
		GlStateManager.pushMatrix();
		
		double scale = 0.8;
		GlStateManager.translate(x+w*scale-mc.fontRenderer.getStringWidth(str)*(scale)-2, y+h*scale-mc.fontRenderer.FONT_HEIGHT*(scale), 0);
		GlStateManager.scale(scale, scale, scale);
		
		mc.fontRenderer.drawStringWithShadow(str, 0, 0, 0xffffff);
		GlStateManager.popMatrix();
		GlStateManager.disableTexture2D();
	}
	
	
	
	
	public boolean isMouseOver(int mouseX, int mouseY) {
		return (mouseX >= x && mouseY >= y) && (mouseX <= x+w && mouseY <= y+h);
		
	}

}
