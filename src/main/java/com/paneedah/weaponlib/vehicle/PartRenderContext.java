package com.paneedah.weaponlib.vehicle;

import com.paneedah.weaponlib.animation.PartPositionProvider;
import lombok.Data;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.util.vector.Matrix4f;

@Data
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
    private boolean shouldRenderAlternateTexture = false;
    private ResourceLocation alternateTexture = null;

    @Override
    public Matrix4f getPartPosition(Object part) {
        // TODO Auto-generated method stub
        return null;
    }

    public void renderAlternateTexture(ResourceLocation loc) {
        this.alternateTexture = loc;
        this.shouldRenderAlternateTexture = true;
    }

    public float getSymmetricProgress() {
        return (progress * 2f) - 1f;
    }
}
