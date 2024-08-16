package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziMag extends ModelWithAttachments {
    private final ModelRenderer magazine;
    private final ModelRenderer mag8_r1;
    private final ModelRenderer mag7_r1;
    private final ModelRenderer mag5_r1;
    private final ModelRenderer mag4_r1;

    public UziMag() {
        textureWidth = 256;
        textureHeight = 256;

        magazine = new ModelRenderer(this);
        magazine.setRotationPoint(-6.3658F, 24.0F, -0.9549F);
        magazine.cubeList.add(new ModelBox(magazine, 0, 0, 3.8658F, -31.5F, -5.0451F, 2, 18, 5, 0.0F, true));
        magazine.cubeList.add(new ModelBox(magazine, 0, 0, 3.3658F, -31.5F, -4.5451F, 3, 18, 4, 0.0F, true));
        magazine.cubeList.add(new ModelBox(magazine, 0, 0, 3.1658F, -14.5F, -4.5451F, 1, 1, 4, 0.0F, true));
        magazine.cubeList.add(new ModelBox(magazine, 0, 0, 5.5658F, -14.5F, -4.5451F, 1, 1, 4, 0.0F, true));

        mag8_r1 = new ModelRenderer(this);
        mag8_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        magazine.addChild(mag8_r1);
        setRotationAngle(mag8_r1, 0.0F, -1.041F, 0.0F);
        mag8_r1.cubeList.add(new ModelBox(mag8_r1, 0, 0, -2.35F, -14.5F, -6.03F, 1, 1, 1, 0.0F, true));

        mag7_r1 = new ModelRenderer(this);
        mag7_r1.setRotationPoint(8.1025F, 0.0F, -7.8653F);
        magazine.addChild(mag7_r1);
        setRotationAngle(mag7_r1, -3.1416F, 0.5391F, 3.1416F);
        mag7_r1.cubeList.add(new ModelBox(mag7_r1, 0, 0, -0.35F, -14.5F, -4.65F, 1, 1, 1, 0.0F, true));

        mag5_r1 = new ModelRenderer(this);
        mag5_r1.setRotationPoint(5.9674F, 0.0F, -1.9351F);
        magazine.addChild(mag5_r1);
        setRotationAngle(mag5_r1, -3.1416F, -0.5391F, 3.1416F);
        mag5_r1.cubeList.add(new ModelBox(mag5_r1, 0, 0, 0.2F, -14.5F, -1.5F, 1, 1, 1, 0.0F, true));

        mag4_r1 = new ModelRenderer(this);
        mag4_r1.setRotationPoint(6.0773F, 0.0F, -2.5484F);
        magazine.addChild(mag4_r1);
        setRotationAngle(mag4_r1, 0.0F, 1.041F, 0.0F);
        mag4_r1.cubeList.add(new ModelBox(mag4_r1, 0, 0, -3.2F, -14.5F, -1.5F, 1, 1, 1, 0.0F, true));
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
