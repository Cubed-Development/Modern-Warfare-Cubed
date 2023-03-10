package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;

/**
 * Pay special attention to the fact this class is stateful.
 *
 * @author victor
 *
 */
public class CompatibleTessellator {

	private static Tessellator tessellator = Tessellator.getInstance();

	private static CompatibleTessellator compatibleTessellator = new CompatibleTessellator();

	public static CompatibleTessellator getInstance() {
		return compatibleTessellator;
	}

	private boolean hasColor; //Pay special attention to the fact this class is stateful.
	private boolean hasLightMap; //Pay special attention to the fact this class is stateful.

	private float red;
	private float green;
	private float blue;
	private float alpha;
	private int i;
	private int j;

	public void startDrawingQuads() {
		BufferBuilder vertextBuffer = tessellator.getBuffer();
		vertextBuffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
		hasColor = false;
		hasLightMap = false;
	}

	public void startDrawingParticles() {
	    BufferBuilder vertextBuffer = tessellator.getBuffer();
		vertextBuffer.begin(GL11.GL_QUADS, DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP);
	}

	public void startDrawingLines() {
	    BufferBuilder renderer = tessellator.getBuffer();
		renderer.begin(GL11.GL_LINES, DefaultVertexFormats.POSITION);
	}

	public void addVertexWithUV(double d, double e, double zLevel, double u, double v) {
	    BufferBuilder vertextBuffer = tessellator.getBuffer();
		vertextBuffer.pos(d, e, zLevel);
		vertextBuffer.tex(u, v);
		if(hasColor) {
			vertextBuffer.color(red, green, blue, alpha);
		}
		if(hasLightMap) {
			vertextBuffer.lightmap(i, j);
		}
		vertextBuffer.endVertex();
	}

	public void draw() {
		tessellator.draw();
	}

	public void setLightMap(int i, int j) {
		hasLightMap = true;
		this.i = i;
		this.j = j;
	}

	public void disableLightMap() {
	    hasLightMap = false;
	}

	public void setColorRgba(float red, float green, float blue, float alpha) {
		hasColor = true;
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.alpha = alpha;
	}

	public void addVertex(float x, float y, float z) {
		tessellator.getBuffer().pos(x, y, z);
	}

	public void endVertex() {
		tessellator.getBuffer().endVertex();
	}

	public BufferBuilder getBuffer() { // Temporary debug only code
		return tessellator.getBuffer();
	}


}
