package com.paneedah.weaponlib.render.scopes;

import com.paneedah.mwc.utils.VectorUtil;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;

import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.weaponlib.render.gui.ColorPalette.SHUTTLE_GREY;

@Getter @Setter
public class Reticle {


    private ResourceLocation reticleTexture;
    private ReticleType reticleType;

    private float textureScale;
    private Vec3d backgroundColor;

    public enum ReticleType {
        HOLOGRAPHIC,
        SNIPER
    }

    public Reticle(String textureName) {
        this(textureName, 1f, SHUTTLE_GREY);
        this.reticleType = ReticleType.SNIPER;
    }

    public Reticle(String textureName, float textureScale, int backgroundColor) {
        this.reticleType = ReticleType.HOLOGRAPHIC;
        this.reticleTexture = new ResourceLocation(ID + ":textures/crosshairs/" + textureName + ".png");
        this.textureScale = textureScale;
        this.backgroundColor = VectorUtil.extractColorVec3d(backgroundColor);
    }

    public Reticle(String textureName, float textureScale) {
        this(textureName, textureScale, SHUTTLE_GREY);
        this.reticleType = ReticleType.HOLOGRAPHIC;
    }
}
