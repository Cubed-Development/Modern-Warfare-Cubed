package com.paneedah.weaponlib.render.scopes;

import com.paneedah.mwc.utils.ModReference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;

import java.awt.Color;

public class Reticle {
	
	private static final int DEFAULT_TINT = 0x576574;
	
	private ResourceLocation reticleTexture;
	private Type reticleType;
	
	
	private float textureScale;
	private Vec3d backgroundColor;
	
	public enum Type {
		HOLOGRAPHIC,
		SNIPER
	}
	
	public Reticle(String textureName) {
		this(textureName, 1f, DEFAULT_TINT);
		this.reticleType = Type.SNIPER;
	}
	
	public Reticle(String textureName, float textureScale, int background) {
		this.reticleType = Type.HOLOGRAPHIC;
		this.reticleTexture = new ResourceLocation(ModReference.ID + ":textures/crosshairs/" + textureName + ".png");
		this.textureScale = textureScale;
		this.backgroundColor = extractColorFromHex(background);
	}
	
	public Reticle(String textureName, float textureScale) {
		this(textureName, textureScale, DEFAULT_TINT);
		this.reticleType = Type.HOLOGRAPHIC;
	}
	
	private static Vec3d extractColorFromHex(int color) {
		Color col = new Color(color);
		return new Vec3d(col.getRed()/255f, col.getBlue()/255f, col.getGreen()/255f);
	}

	public ResourceLocation getReticleTexture() {
		return reticleTexture;
	}

	public void setReticleTexture(ResourceLocation reticleTexture) {
		this.reticleTexture = reticleTexture;
	}

	public float getTextureScale() {
		return textureScale;
	}

	public void setTextureScale(float textureScale) {
		this.textureScale = textureScale;
	}



	public Vec3d getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(Vec3d backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public static int getDefaultTint() {
		return DEFAULT_TINT;
	}
	
	
	
	

}
