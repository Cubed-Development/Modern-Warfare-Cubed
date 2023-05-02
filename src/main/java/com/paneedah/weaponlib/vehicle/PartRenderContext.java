package com.paneedah.weaponlib.vehicle;

import com.paneedah.weaponlib.animation.PartPositionProvider;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.util.vector.Matrix4f;

public class PartRenderContext<State> implements PartPositionProvider {
    
    private float limbSwing;
    private float flimbSwingAmount;
    private float ageInTicks;
    private float netHeadYaw;
    private float headPitch;
    private float scale;
    private Entity entity;
    private State state;
    private float progress;
    
    /**
     * ALTERNATE TEX RENDERINGS
     */
    private boolean shouldAlternateTexture = false;
    private ResourceLocation alternateTexture = null;

    @Override
    public Matrix4f getPartPosition(Object part) {
    	
        // TODO Auto-generated method stub
        return null;
    }
    
    
    public void renderAlternateTexture(ResourceLocation loc) {
    	this.alternateTexture = loc;
    	this.shouldAlternateTexture = true;
    }
    
    public boolean shouldRenderAlternateTexture() {
    	return this.shouldAlternateTexture;
    }
    
    public ResourceLocation getAlternateTexture() {
    	return this.alternateTexture;
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public State getState() {
        return state;
    }
    
    public float getLimbSwing() {
        return limbSwing;
    }

    public void setLimbSwing(float limbSwing) {
        this.limbSwing = limbSwing;
    }

    public float getFlimbSwingAmount() {
        return flimbSwingAmount;
    }

    public void setFlimbSwingAmount(float flimbSwingAmount) {
        this.flimbSwingAmount = flimbSwingAmount;
    }

    public float getAgeInTicks() {
        return ageInTicks;
    }

    public void setAgeInTicks(float ageInTicks) {
        this.ageInTicks = ageInTicks;
    }

    public float getNetHeadYaw() {
        return netHeadYaw;
    }

    public void setNetHeadYaw(float netHeadYaw) {
        this.netHeadYaw = netHeadYaw;
    }

    public float getHeadPitch() {
        return headPitch;
    }

    public void setHeadPitch(float headPitch) {
        this.headPitch = headPitch;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public Entity getEntity() {
        return entity;
    }
    
    public void setEntity(Entity entity) {
        this.entity = entity;
    }
    
    public void setProgress(float progress) {
//        System.out.println("Progress: " + progress);
        this.progress = progress;
    }
    
    public float getProgress() {
        return progress;
    }
    
    public float getSymmetricProgress() {
        return (progress * 2f) - 1f;
    }
}
