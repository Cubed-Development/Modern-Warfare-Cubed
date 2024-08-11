package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DesertEagleMag extends ModelWithAttachments {
    private final ModelRenderer magazine;
    private final ModelRenderer mag2_r1;
    private final ModelRenderer mag6_r1;
    private final ModelRenderer mag5_r1;

    public DesertEagleMag() {
        textureWidth = 150;
        textureHeight = 150;

        magazine = new ModelRenderer(this);
        magazine.setRotationPoint(0.0F, 24.0F, 0.0F);
        magazine.cubeList.add(new ModelBox(magazine, 57, 12, -2.5F, -18.9F, -5.8F, 2, 1, 1, 0.001F, false));
        magazine.cubeList.add(new ModelBox(magazine, 31, 18, -3.0F, -18.9F, -4.8F, 3, 1, 6, 0.001F, false));

        mag2_r1 = new ModelRenderer(this);
        mag2_r1.setRotationPoint(-2.8F, -18.8F, 1.0F);
        magazine.addChild(mag2_r1);
        setRotationAngle(mag2_r1, -2.9845F, 0.0F, 0.0F);
        mag2_r1.cubeList.add(new ModelBox(mag2_r1, 0, 75, 0.0F, 0.0F, 0.0F, 2, 12, 5, 0.0F, false));
        mag2_r1.cubeList.add(new ModelBox(mag2_r1, 14, 75, 1.6F, 0.0F, 0.0F, 1, 12, 5, 0.001F, false));

        mag6_r1 = new ModelRenderer(this);
        mag6_r1.setRotationPoint(-0.5F, -18.9F, -5.8F);
        magazine.addChild(mag6_r1);
        setRotationAngle(mag6_r1, 0.0F, 0.4636F, 0.0F);
        mag6_r1.cubeList.add(new ModelBox(mag6_r1, 77, 37, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        mag5_r1 = new ModelRenderer(this);
        mag5_r1.setRotationPoint(-2.5F, -18.9F, -5.8F);
        magazine.addChild(mag5_r1);
        setRotationAngle(mag5_r1, 0.0F, -0.4461F, 0.0F);
        mag5_r1.cubeList.add(new ModelBox(mag5_r1, 38, 77, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        magazine.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
