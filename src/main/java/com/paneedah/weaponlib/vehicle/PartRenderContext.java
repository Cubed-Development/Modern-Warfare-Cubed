package com.paneedah.weaponlib.vehicle;

import com.paneedah.weaponlib.animation.PartPositionProvider;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.util.vector.Matrix4f;

public class PartRenderContext<State> implements PartPositionProvider {

    @Setter
    @Getter
    private float limbSwing;
    @Setter
    @Getter
    private float flimbSwingAmount;
    @Setter
    @Getter
    private float ageInTicks;
    @Setter
    @Getter
    private float netHeadYaw;
    @Setter
    @Getter
    private float headPitch;
    @Setter
    @Getter
    private float scale;
    @Setter
    @Getter
    private Entity entity;
    @Setter
    @Getter
    private State state;
    //        System.out.println("Progress: " + progress);
    @Setter
    @Getter
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
