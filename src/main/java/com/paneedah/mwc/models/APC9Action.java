package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class APC9Action extends ModelBase {
    private final ModelRenderer bone41;
    private final ModelRenderer cube_r1;

    public APC9Action() {
        textureWidth = 16;
        textureHeight = 16;

        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(1.0F, -15.0F, -10.5F);
        bone41.cubeList.add(new ModelBox(bone41, 20, 64, -2.0F, -2.7189F, -10.2321F, 1, 2, 9, 0.0F, false));
        bone41.cubeList.add(new ModelBox(bone41, 22, 0, -4.0F, -2.7189F, -10.2321F, 1, 2, 9, 0.0F, false));

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-0.25F, -2.2189F, -9.7321F);
        bone41.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 77, 44, -1.4566F, -0.5F, -0.2538F, 3, 1, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bone41.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
