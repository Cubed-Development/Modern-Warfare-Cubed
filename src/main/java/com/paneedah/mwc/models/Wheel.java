package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Wheel extends ModelBase {
    private final ModelRenderer wheel;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;

    public Wheel() {
        textureWidth = 64;
        textureHeight = 64;

        wheel = new ModelRenderer(this);
        wheel.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        wheel.addChild(bone);
        bone.cubeList.add(new ModelBox(bone, 24, 26, -4.0F, -4.0F, -3.0F, 5, 4, 7, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 15, 15, -4.0F, -16.9F, -3.0F, 5, 4, 7, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 18, 37, -4.0F, -11.95F, -7.95F, 5, 7, 4, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 37, -4.0F, -11.95F, 4.95F, 5, 7, 4, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, -12.95F, -4.05F, 2, 9, 9, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, 0.0F, 4.0F);
        bone.addChild(bone2);
        setRotationAngle(bone2, 0.7854F, 0.0F, 0.0F);
        bone2.cubeList.add(new ModelBox(bone2, 0, 26, -4.01F, -4.0F, 0.0F, 5, 4, 7, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 32, 11, -4.01F, -11.9497F, 7.9497F, 5, 7, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 36, 37, -4.01F, -11.9497F, -4.9497F, 5, 7, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 22, 0, -4.01F, -16.8995F, 0.0F, 5, 4, 7, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 41, 22, -3.51F, -10.5F, 1.5F, 4, 4, 4, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        wheel.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
