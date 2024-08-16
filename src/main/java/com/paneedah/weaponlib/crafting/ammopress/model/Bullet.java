package com.paneedah.weaponlib.crafting.ammopress.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Bullet extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer cube_r1;
    private final ModelRenderer bone2;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;

    public Bullet() {
        textureWidth = 32;
        textureHeight = 32;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -0.5F, -6.0F, -1.0F, 1, 6, 2, 0.001F, false));
        bone.cubeList.add(new ModelBox(bone, 6, 0, -1.0F, -6.0F, -0.5F, 2, 6, 1, 0.002F, false));

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(1.0F, 0.0F, -0.5F);
        bone.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 7, -1.5F, -6.1F, 0.56F, 1, 6, 1, -0.1F, false));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 8, -0.2F, -6.1F, 0.56F, 1, 6, 1, -0.1F, false));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 7, -0.85F, -6.1F, 1.2F, 1, 6, 1, -0.1F, false));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 0, -0.85F, -6.1F, -0.09F, 1, 6, 1, -0.1F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.5F, 18.0F, 0.8F);


        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone2.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.1047F, 0.0F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 14, -1.0F, -3.0F, -1.0F, 1, 3, 1, 0.002F, false));

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-1.3F, 0.0F, -0.3F);
        bone2.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, 0.1047F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 7, 0.0F, -3.0F, -1.0F, 1, 3, 1, 0.002F, false));

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, 0.0F, -1.6F);
        bone2.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 14, -1.0F, -3.0F, 0.0F, 1, 3, 1, 0.002F, false));

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(0.3F, 0.0F, -0.3F);
        bone2.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, -0.1047F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 11, -1.0F, -3.0F, -1.0F, 1, 3, 1, 0.002F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bone.render(f5);
        if (f1 != -1) {
            bone2.render(f5);
        }
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
