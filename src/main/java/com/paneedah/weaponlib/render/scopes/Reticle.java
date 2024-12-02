package com.paneedah.weaponlib.render.scopes;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;

import java.awt.*;

import static com.paneedah.mwc.ProjectConstants.ID;

public class Reticle {

    private static final int DEFAULT_TINT = 0x576574;

    @Getter @Setter private ResourceLocation reticleTexture;
    private Type reticleType;

    @Getter @Setter private float textureScale;
    @Getter @Setter private Vec3d backgroundColor;

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
        this.reticleTexture = new ResourceLocation(ID + ":textures/crosshairs/" + textureName + ".png");
        this.textureScale = textureScale;
        this.backgroundColor = extractColorFromHex(background);
    }

    public Reticle(String textureName, float textureScale) {
        this(textureName, textureScale, DEFAULT_TINT);
        this.reticleType = Type.HOLOGRAPHIC;
    }

    private static Vec3d extractColorFromHex(int color) {
        Color col = new Color(color);
        return new Vec3d(col.getRed() / 255f, col.getBlue() / 255f, col.getGreen() / 255f);
    }


    public static int getDefaultTint() {
        return DEFAULT_TINT;
    }


}
