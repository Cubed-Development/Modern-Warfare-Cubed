package com.paneedah.weaponlib.vehicle;

import com.paneedah.weaponlib.animation.PartPositionProvider;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.util.vector.Matrix4f;

public class PartRenderContext<State> implements PartPositionProvider {

    @Getter
    @Setter
    private float limbSwing;
    @Getter
    @Setter
    private float flimbSwingAmount;
    @Getter
    @Setter
    private float ageInTicks;
    @Getter
    @Setter
    private float netHeadYaw;
    @Getter
    @Setter
    private float headPitch;
    @Getter
    @Setter
    private float scale;
    @Getter
    @Setter
    private Entity entity;
    @Getter
    @Setter
    private State state;
    //        System.out.println("Progress: " + progress);
    @Getter
    @Setter
    private float progress;

    /**
     * ALTERNATE TEX RENDERINGS
     */
    private boolean shouldAlternateTexture = false;
    @Getter
    private ResourceLocation alternateTexture = null;

    @Override
    public Matrix4f getPartPosition(Object part) {

        // TODO Auto-generated method stub
        return null;
    }


    public void renderAlternateTexture(ResourceLocation loc) {
        alternateTexture = loc;
        shouldAlternateTexture = true;
    }

    public boolean shouldRenderAlternateTexture() {
        return shouldAlternateTexture;
    }

    public float getSymmetricProgress() {
        return (progress * 2f) - 1f;
    }
}
