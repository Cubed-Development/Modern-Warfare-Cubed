package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class GunRack extends ModelBase {
    private final ModelRenderer bone;

    public GunRack() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0, 24, 0);
        bone.cubeList.add(new ModelBox(bone, 187, 117, -2, -48, 28, 11, 44, 0, 0, false));
        bone.cubeList.add(new ModelBox(bone, 187, 117, -2, -48, -19, 11, 44, 0, 0, false));
        bone.cubeList.add(new ModelBox(bone, 0, 61, 10.5F, -48, -17, 0, 44, 43, 0, false));
        bone.cubeList.add(new ModelBox(bone, 0, 52, 10, -32, 22.5F, 1, 11, 3, 0, false));
        bone.cubeList.add(new ModelBox(bone, 83, 40, -1, -39, -15, 7, 2, 7, 0, false));
        bone.cubeList.add(new ModelBox(bone, 83, 71, -1, -39, -7, 7, 2, 7, 0, false));
        bone.cubeList.add(new ModelBox(bone, 83, 83, -2, -35, -11, 10, 4, 12, 0, false));
        bone.cubeList.add(new ModelBox(bone, 86, 104, -2, -23, -12, 6, 4, 13, 0, false));
        bone.cubeList.add(new ModelBox(bone, 0, 72, -2, -29, -17, 10, 4, 12, 0, false));
        bone.cubeList.add(new ModelBox(bone, 0, 52, -2, -17, -16, 8, 4, 16, 0, false));
        bone.cubeList.add(new ModelBox(bone, 0, 88, 0, -11, -9, 7, 4, 9, 0, false));
        bone.cubeList.add(new ModelBox(bone, 28, 168, -2, -24, 21, 6, 20, 1, 0, false));
        bone.cubeList.add(new ModelBox(bone, 14, 168, -2, -24, 18, 6, 20, 1, 0, false));
        bone.cubeList.add(new ModelBox(bone, 163, 0, -2, -24, 12, 6, 20, 1, 0, false));
        bone.cubeList.add(new ModelBox(bone, 48, 163, -2, -24, 8.75F, 6, 20, 1, 0, false));
        bone.cubeList.add(new ModelBox(bone, 32, 52, -2, -41, 21, 6, 4, 1, 0, false));
        bone.cubeList.add(new ModelBox(bone, 32, 57, -2, -41, 18, 6, 4, 1, 0, false));
        bone.cubeList.add(new ModelBox(bone, 32, 72, -2, -41, 12, 6, 4, 1, 0, false));
        bone.cubeList.add(new ModelBox(bone, 83, 0, -2, -41, 9.25F, 6, 4, 1, 0, false));
        bone.cubeList.add(new ModelBox(bone, 123, 41, -2, -37, -17, 11, 1, 18, 0, false));
        bone.cubeList.add(new ModelBox(bone, 123, 22, -2, -31, -17, 11, 1, 18, 0, false));
        bone.cubeList.add(new ModelBox(bone, 83, 21, -2, -25, -17, 11, 1, 18, 0, false));
        bone.cubeList.add(new ModelBox(bone, 83, 52, -2, -19, -17, 11, 1, 18, 0, false));
        bone.cubeList.add(new ModelBox(bone, 123, 3, -2, -13, -17, 11, 1, 18, 0, false));
        bone.cubeList.add(new ModelBox(bone, 83, 0, -2, -7, -17, 11, 3, 18, 0, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -2, -48, 1, 10, 44, 2, 0, false));
        bone.cubeList.add(new ModelBox(bone, 89, 89, -3, -48, -17, 1, 44, 43, 0, false));
        bone.cubeList.add(new ModelBox(bone, 24, 0, -5, -48, 26, 3, 44, 3, 0, false));
        bone.cubeList.add(new ModelBox(bone, 36, 0, 9, -48, 26, 3, 44, 3, 0, false));
        bone.cubeList.add(new ModelBox(bone, 134, 79, 9, -48, -20, 3, 44, 3, 0, false));
        bone.cubeList.add(new ModelBox(bone, 146, 79, -5, -48, -20, 3, 44, 3, 0, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -5, -51, -20, 17, 3, 49, 0, false));
        bone.cubeList.add(new ModelBox(bone, 0, 52, -5, -4, -20, 17, 3, 49, 0, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bone.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
