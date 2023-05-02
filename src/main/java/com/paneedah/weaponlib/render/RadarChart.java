package com.paneedah.weaponlib.render;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;

import java.util.LinkedList;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class RadarChart {
	
	private static final double TRANSITION_TIME = 200;
	private static final double TYPE_TIME = 100;
	
	private static final double TWO_PI = 2*Math.PI;
	
	private String name;
	
 	private String[] titleList;
	
	private float[] color;
	private float radius;
	
	private int sides;
	private double increment;
	private double rotation;
	
	
	private long textTypeTimestamp = System.currentTimeMillis();
	private boolean textLock = false;
	
	private long lastStateStamp = System.nanoTime();
	private LinkedList<float[]> states = new LinkedList<>();
	private double mu = 1.0;
	
	public RadarChart(String name, int chartColor, float chartAlpha, float radius, int sides) {
		this.name = name;
		
		float r = (float) (((chartColor & 0xFF0000) >> 16)/255.0);
		float g = (float) (((chartColor & 0xFF00) >> 8)/255.0);
		float b = (float) ((chartColor & 0xFF)/255.0);
		
		color = new float[] { r, g, b, chartAlpha};
		
		this.radius = radius;
		this.sides = sides;
		increment = TWO_PI / (double) sides;
		rotation = increment * (1.0/4.0);
	}
	
	public RadarChart withTitles(String[] list) {
		this.titleList = list;
		return this;
	}
	
	public void uploadSet(float[] set) {
		if(states.size() == 1) lastStateStamp = System.currentTimeMillis();
		if(states.size() > 2) states.removeLast();
		
		//states.clear();
		//System.out.println(states.size());
		states.add(set);
	}
	
	public void randomizeData() {
		uploadSet(new float[] { (float) Math.random(), (float) Math.random(), (float) Math.random(), (float) Math.random(), (float) Math.random() });
	}
	
	
	public double getPointRadius(double angle) {
		if(states.isEmpty()) return 0.0;
		int index;
		if(angle == 0) {
			index = 0;
		} else {
			index = (int) Math.floor(angle / increment);
		}
		
		float value = 0f;
		if(states.size() > 1) {
			float current = states.get(1)[index];
			float previous = states.peek()[index];
			
			float alpha = (float) ((mu*mu)*(3-2*mu));
			
			value = previous + (current - previous)*alpha;
			
		} else {
			value = states.peek()[index];
		}
		

		return value;
		
	}
	
	
	public void render(double x, double y, int mouseX, int mouseY, double scale) {
		
		
		// Update chart
		if(states.size() > 1) {
			
			mu = (System.currentTimeMillis() - lastStateStamp)/250.0;
			if(mu >= 1) {
				//System.out.println("pop");
				lastStateStamp = System.currentTimeMillis();
				states.pop();
				mu = 0;
			}
		} else {
			mu = 1.0;
		}

		GlStateManager.pushMatrix();
		GlStateManager.translate(x, y, 0);
		GlStateManager.rotate((float) -Math.toDegrees(2*Math.PI / (5*4)), 0, 0, 1);
		
		
		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		
		
		
		// Draw hexagonal grid pattern
		GL11.glLineWidth(1.0f);
		bb.begin(GL11.GL_LINE_STRIP, DefaultVertexFormats.POSITION_COLOR);
		for(double m = 0; m <= 1; m += 0.2) {
			for(double a = 0; a <= 2*Math.PI; a += increment) {
				bb.pos(Math.cos(a) * radius * m, Math.sin(a) * radius * m, 0).color(1, 1, 1, color[3]).endVertex();
			}
		}
		t.draw();
		
		GL11.glLineWidth(1.0f);
		bb.begin(GL11.GL_LINES, DefaultVertexFormats.POSITION_COLOR);
			for(double a = 0; a <= 2*Math.PI; a += increment) {
				bb.pos(0, 0, 0).color(1, 1, 1, color[3]).endVertex();
				bb.pos(Math.cos(a) * radius, Math.sin(a) * radius, 0).color(1, 1, 1, color[3]).endVertex();
			}
		t.draw();
		

		
		GlStateManager.enableBlend();
		GlStateManager.disableTexture2D();
		bb.begin(GL11.GL_TRIANGLE_FAN, DefaultVertexFormats.POSITION_COLOR);
		bb.pos(0, 0, 0).color(color[0], color[1], color[2], color[3]).endVertex();
		for(double a = 0; a < 2*Math.PI; a += increment) {
			double point = getPointRadius(a);
			bb.pos(Math.cos(a) * radius * point, Math.sin(a) * radius * point, 0).color(color[0], color[1], color[2], color[3]).endVertex();
		}
		bb.pos(radius * getPointRadius(0), 0, 0).color(color[0], color[1], color[2], color[3]).endVertex();
		
		t.draw();
		
		
		// Render background grid lines
				GL11.glLineWidth(3.0f);
				bb.begin(GL11.GL_LINE_STRIP, DefaultVertexFormats.POSITION_COLOR);
				for(double a = 0; a < TWO_PI; a += increment) {
					double point = getPointRadius(a);
					bb.pos(Math.cos(a)*radius*point, Math.sin(a)*radius*point, 0).color(color[0], color[1], color[2], color[3]).endVertex();
				}
				double point = getPointRadius(0);
				bb.pos(radius*point, 0, 0).color(color[0], color[1], color[2], color[3]).endVertex();
				t.draw();
				
		
		GlStateManager.popMatrix();
		
		GlStateManager.enableTexture2D();
		double textRadius = radius * 1.1;
		for(double a = 0; a < TWO_PI; a += increment) {
			

			String text = titleList[(int) Math.floor(a/increment)];
			
			double d1 = mouseX - x*scale;
			double d2 = mouseY - y*scale;
			double distance = Math.sqrt(d1*d1 + d2*d2);
			
			try {
			if(distance < radius) {
				double diff = System.currentTimeMillis() - textTypeTimestamp;
				if(diff > TYPE_TIME && !textLock) {
					textLock = true;
					textTypeTimestamp = System.currentTimeMillis();
				}
				if(diff < TYPE_TIME) {
					text = text.substring(1, (int) Math.max(Math.floor((text.length()-1)*(diff/TYPE_TIME)), 1));
					
				}
				
				
				
			} else {
				textLock = false;
				text = text.charAt(0) + "";
			}
			} catch(Exception e) {
				e.printStackTrace();
			}
			//text = text.charAt(0) + "";
			
			
			double angle = a - rotation;
			double textCenter = mc.fontRenderer.getStringWidth(text)/2;
			double centerHeight = mc.fontRenderer.FONT_HEIGHT/2.0;
			mc.fontRenderer.drawStringWithShadow(text, (float) (Math.cos(angle)*textRadius + x - textCenter) , (float) (Math.sin(angle)*textRadius + y - centerHeight), 0xffffff);
		}
		
		
	}
 
}
