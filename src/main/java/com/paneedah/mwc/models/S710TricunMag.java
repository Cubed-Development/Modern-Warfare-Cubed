package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class S710TricunMag extends ModelWithAttachments {
    private final ModelRenderer magazine;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;

    public S710TricunMag() {
        textureWidth = 200;
        textureHeight = 200;

        magazine = new ModelRenderer(this);
        magazine.setRotationPoint(-2.0F, -9.0F, -18.5F);
        magazine.cubeList.add(new ModelBox(magazine, 79, 33, -0.75F, 21.0F, 4.2F, 3, 2, 5, 0.0F, false));
        magazine.cubeList.add(new ModelBox(magazine, 36, 39, -1.25F, 21.0F, 4.199F, 1, 2, 5, 0.0F, false));

        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(1.5F, 0.0F, 0.0F);
        magazine.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.2182F, 0.0F, 0.0F);
        cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 26, -2.0F, 4.0F, 3.2F, 2, 19, 1, 0.0F, false));
        cube_r27.cubeList.add(new ModelBox(cube_r27, 36, 39, -1.5F, 0.0F, 3.2F, 1, 4, 1, 0.0F, false));
        cube_r27.cubeList.add(new ModelBox(cube_r27, 43, 39, -1.5F, 0.0F, -0.2F, 1, 4, 1, 0.0F, false));
        cube_r27.cubeList.add(new ModelBox(cube_r27, 67, 0, -2.0F, 4.0F, -0.2F, 2, 19, 1, 0.0F, false));
        cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 26, -2.5F, 4.0F, 0.0F, 3, 19, 4, 0.0F, false));

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(-0.25F, 23.0F, 4.2F);
        magazine.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.192F, 0.0F, 0.0F);
        cube_r28.cubeList.add(new ModelBox(cube_r28, 48, 91, -0.98F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 85, -0.52F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(-1.0F, 3.9F, 0.86F);
        magazine.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.2182F, -0.0262F, 0.1222F);
        cube_r29.cubeList.add(new ModelBox(cube_r29, 26, 26, 0.0F, -4.0F, 0.0F, 1, 4, 4, 0.0F, false));

        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(2.0F, 3.9F, 0.86F);
        magazine.addChild(cube_r30);
        setRotationAngle(cube_r30, 0.2182F, 0.0262F, -0.1222F);
        cube_r30.cubeList.add(new ModelBox(cube_r30, 26, 0, -1.0F, -4.0F, 0.0F, 1, 4, 4, 0.0F, false));

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(0.3F, -1.15F, 1.05F);
        magazine.addChild(cube_r31);
        setRotationAngle(cube_r31, -0.0436F, 0.0F, 0.0F);
        cube_r31.cubeList.add(new ModelBox(cube_r31, 52, 52, -1.0F, 0.0F, 0.0F, 1, 2, 3, -0.2F, false));
        cube_r31.cubeList.add(new ModelBox(cube_r31, 56, 25, 0.4F, 0.0F, 0.0F, 1, 2, 3, -0.2F, false));

        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(1.9F, -0.4F, 0.5F);
        magazine.addChild(cube_r32);
        setRotationAngle(cube_r32, 0.2182F, 0.0F, 0.0F);
        cube_r32.cubeList.add(new ModelBox(cube_r32, 70, 96, -3.0F, 8.2F, 2.0F, 3, 12, 1, 0.0F, false));
        cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 97, -2.8F, 8.2F, 2.0F, 3, 12, 1, 0.0F, false));
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
