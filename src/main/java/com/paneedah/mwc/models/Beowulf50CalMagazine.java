package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Beowulf50CalMagazine extends ModelBase {
    private final ModelRenderer magazine;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;

    public Beowulf50CalMagazine() {
        textureWidth = 64;
        textureHeight = 64;

        magazine = new ModelRenderer(this);
        magazine.setRotationPoint(0.0F, -3.0F, -20.8F);
        magazine.cubeList.add(new ModelBox(magazine, 28, 28, -3.0F, -5.3F, 2.0F, 3, 7, 4, 0.0F, false));
        magazine.cubeList.add(new ModelBox(magazine, 29, 17, -2.25F, -5.3F, 0.0F, 2, 7, 2, 0.0F, false));
        magazine.cubeList.add(new ModelBox(magazine, 10, 32, -2.75F, -5.3F, 0.0F, 1, 7, 2, 0.0F, false));
        magazine.cubeList.add(new ModelBox(magazine, 32, 9, -3.0F, -5.3F, 5.8F, 3, 7, 1, 0.0F, false));

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-1.25F, 7.6F, 6.3F);
        magazine.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.096F, 0.0F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 18, -2.0F, -6.0F, -5.0F, 2, 6, 5, 0.0F, false));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 29, -1.75F, -6.0F, -7.0F, 3, 6, 2, 0.0F, false));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 23, -0.5F, -6.0F, -5.0F, 2, 6, 5, 0.0F, false));

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-1.25F, 7.6F, 6.3F);
        magazine.addChild(cube_r2);
        setRotationAngle(cube_r2, 1.3439F, 0.0F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.0F, -5.0F, -7.0F, 2, 5, 7, 0.0F, false));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 0, -1.75F, -7.0F, -7.0F, 3, 2, 7, 0.0F, false));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 11, -0.5F, -5.0F, -7.0F, 2, 5, 7, 0.0F, false));

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-3.5F, 13.6F, 4.9F);
        magazine.addChild(cube_r3);
        setRotationAngle(cube_r3, 1.4207F, -0.1693F, -0.8378F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 34, 0.0F, -7.0F, -1.0F, 1, 7, 1, 0.0F, false));

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(0.5F, 13.6F, 4.9F);
        magazine.addChild(cube_r4);
        setRotationAngle(cube_r4, 1.4207F, 0.1693F, 0.8378F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 34, -1.0F, -7.0F, -1.0F, 1, 7, 1, 0.0F, false));

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(0.5F, 13.6F, 4.9F);
        magazine.addChild(cube_r5);
        setRotationAngle(cube_r5, 1.3439F, 0.0F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 9, -4.0F, -7.0F, -1.0F, 4, 7, 1, 0.0F, false));

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-2.25F, 1.0F, -0.2F);
        magazine.addChild(cube_r6);
        setRotationAngle(cube_r6, 1.3526F, 0.0F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.0F, 2.0F, 0.0F, 1, 5, 1, 0.0F, false));
        cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 0, -0.75F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));
        cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 12, -0.5F, 2.0F, 0.0F, 3, 5, 1, 0.0F, false));

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(-3.0F, -5.3F, 5.7F);
        magazine.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, -0.9163F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 3, 5, 0.0F, 0.0F, 0.1F, 1, 1, 1, 0.0F, false));
        cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 0, 0.0F, 0.0F, -3.7F, 1, 1, 4, 0.0F, false));

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(0.0F, -5.3F, 5.7F);
        magazine.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, 0.9163F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 0, -1.0F, 0.0F, 0.1F, 1, 1, 1, 0.0F, false));
        cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 12, -1.0F, 0.0F, -3.7F, 1, 1, 4, 0.0F, false));
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
