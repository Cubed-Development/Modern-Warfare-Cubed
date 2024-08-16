package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ScarHMag extends ModelWithAttachments {
    private final ModelRenderer magazine;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;

    public ScarHMag() {
        textureWidth = 300;
        textureHeight = 300;

        magazine = new ModelRenderer(this);
        magazine.setRotationPoint(0.25F, -4.0F, -24.95F);
        magazine.cubeList.add(new ModelBox(magazine, 114, 112, -1.0F, -5.0F, 0.25F, 1, 15, 1, 0.0F, false));
        magazine.cubeList.add(new ModelBox(magazine, 12, 24, -1.35F, -5.0F, 0.45F, 1, 18, 4, -0.002F, false));
        magazine.cubeList.add(new ModelBox(magazine, 55, 24, -3.25F, -5.0F, 5.45F, 3, 18, 3, -0.002F, false));
        magazine.cubeList.add(new ModelBox(magazine, 8, 80, -2.15F, -5.0F, 3.75F, 2, 18, 2, -0.003F, false));
        magazine.cubeList.add(new ModelBox(magazine, 55, 67, -0.7F, 12.3F, 0.05F, 1, 1, 9, -0.1F, false));
        magazine.cubeList.add(new ModelBox(magazine, 66, 48, -1.0F, 12.2F, 7.45F, 1, 1, 2, -0.001F, false));
        magazine.cubeList.add(new ModelBox(magazine, 42, 27, -0.7F, 10.3F, -0.25F, 1, 3, 1, -0.2F, false));
        magazine.cubeList.add(new ModelBox(magazine, 110, 112, -1.0F, -5.0F, 0.75F, 1, 15, 1, -0.001F, false));
        magazine.cubeList.add(new ModelBox(magazine, 65, 111, -1.0F, -5.0F, 2.5F, 1, 15, 2, 0.0F, false));
        magazine.cubeList.add(new ModelBox(magazine, 101, 71, -1.0F, -5.0F, 5.0F, 1, 15, 2, 0.0F, false));
        magazine.cubeList.add(new ModelBox(magazine, 11, 73, -1.0F, 9.8F, 5.0F, 1, 1, 2, 0.001F, false));
        magazine.cubeList.add(new ModelBox(magazine, 73, 80, -1.0F, -5.0F, 8.0F, 1, 16, 1, 0.0F, false));
        magazine.cubeList.add(new ModelBox(magazine, 48, 14, -3.5F, -5.0F, 8.0F, 1, 16, 1, 0.0F, false));
        magazine.cubeList.add(new ModelBox(magazine, 16, 80, -3.5F, -5.0F, 5.0F, 1, 15, 2, 0.0F, false));
        magazine.cubeList.add(new ModelBox(magazine, 101, 14, -3.5F, -5.0F, 2.5F, 1, 15, 2, 0.0F, false));
        magazine.cubeList.add(new ModelBox(magazine, 16, 110, -3.5F, -5.0F, 0.75F, 1, 15, 1, -0.001F, false));
        magazine.cubeList.add(new ModelBox(magazine, 112, 0, -3.5F, -5.0F, 0.25F, 1, 15, 1, 0.0F, false));
        magazine.cubeList.add(new ModelBox(magazine, 0, 24, -3.15F, -5.0F, 0.45F, 2, 18, 4, -0.003F, false));
        magazine.cubeList.add(new ModelBox(magazine, 42, 24, -3.5F, 9.8F, 5.0F, 1, 1, 2, 0.001F, false));
        magazine.cubeList.add(new ModelBox(magazine, 26, 47, -3.5F, 12.2F, 7.45F, 1, 1, 2, -0.001F, false));
        magazine.cubeList.add(new ModelBox(magazine, 55, 57, -3.8F, 12.3F, 0.05F, 1, 1, 9, -0.1F, false));
        magazine.cubeList.add(new ModelBox(magazine, 18, 24, -3.8F, 10.3F, -0.25F, 1, 3, 1, -0.2F, false));
        magazine.cubeList.add(new ModelBox(magazine, 0, 80, -3.35F, -5.0F, 3.75F, 2, 18, 2, -0.004F, false));
        magazine.cubeList.add(new ModelBox(magazine, 8, 110, -3.25F, -3.0F, 8.45F, 3, 16, 1, -0.001F, false));
        magazine.cubeList.add(new ModelBox(magazine, 0, 110, -3.25F, -5.0F, -0.1F, 3, 18, 1, -0.001F, false));

        cube_r66 = new ModelRenderer(this);
        cube_r66.setRotationPoint(-3.5F, 10.0F, 0.25F);
        magazine.addChild(cube_r66);
        setRotationAngle(cube_r66, 1.3736F, 0.0F, 0.0F);
        cube_r66.cubeList.add(new ModelBox(cube_r66, 12, 58, 0.0F, 7.8F, 0.0F, 1, 1, 1, -0.001F, false));
        cube_r66.cubeList.add(new ModelBox(cube_r66, 0, 56, 0.0F, 4.8F, 0.0F, 1, 2, 1, -0.002F, false));
        cube_r66.cubeList.add(new ModelBox(cube_r66, 49, 8, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));
        cube_r66.cubeList.add(new ModelBox(cube_r66, 18, 0, 0.0F, 0.4F, 0.0F, 1, 1, 1, -0.003F, false));
        cube_r66.cubeList.add(new ModelBox(cube_r66, 0, 24, 0.0F, 2.2F, 0.0F, 1, 3, 1, -0.001F, false));
        cube_r66.cubeList.add(new ModelBox(cube_r66, 64, 24, 2.5F, 0.4F, 0.0F, 1, 1, 1, -0.003F, false));
        cube_r66.cubeList.add(new ModelBox(cube_r66, 11, 71, 2.5F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));
        cube_r66.cubeList.add(new ModelBox(cube_r66, 61, 0, 2.5F, 7.8F, 0.0F, 1, 1, 1, -0.001F, false));
        cube_r66.cubeList.add(new ModelBox(cube_r66, 24, 56, 2.5F, 4.8F, 0.0F, 1, 2, 1, -0.002F, false));
        cube_r66.cubeList.add(new ModelBox(cube_r66, 0, 47, 2.5F, 2.2F, 0.0F, 1, 3, 1, -0.001F, false));

        cube_r67 = new ModelRenderer(this);
        cube_r67.setRotationPoint(-3.5F, 10.2F, 0.25F);
        magazine.addChild(cube_r67);
        setRotationAngle(cube_r67, -0.192F, 0.0F, 0.0F);
        cube_r67.cubeList.add(new ModelBox(cube_r67, 55, 0, -0.2F, -0.2F, -0.4F, 1, 1, 10, -0.2F, false));
        cube_r67.cubeList.add(new ModelBox(cube_r67, 55, 11, 2.7F, -0.2F, -0.4F, 1, 1, 10, -0.2F, false));
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
