package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ACRAction extends ModelBase {
    private final ModelRenderer action;
    private final ModelRenderer ACRAction4_r1_r1;

    public ACRAction() {
        textureWidth = 400;
        textureHeight = 400;

        action = new ModelRenderer(this);
        action.setRotationPoint(-1.1443F, -16.189F, -28.8415F);
        action.cubeList.add(new ModelBox(action, 33, 76, 1.1443F, 16.189F, 28.8415F, 5, 1, 1, 0.0F, false));
        action.cubeList.add(new ModelBox(action, 73, 125, 1.1443F, 16.189F, 29.3415F, 3, 1, 2, 0.0F, false));
        action.cubeList.add(new ModelBox(action, 143, 20, 3.7443F, 16.189F, 29.3415F, 1, 1, 2, 0.0F, false));

        ACRAction4_r1_r1 = new ModelRenderer(this);
        ACRAction4_r1_r1.setRotationPoint(-12.2774F, 57.6891F, -3.9813F);
        action.addChild(ACRAction4_r1_r1);
        setRotationAngle(ACRAction4_r1_r1, 3.1416F, -0.7993F, -3.1416F);
        ACRAction4_r1_r1.cubeList.add(new ModelBox(ACRAction4_r1_r1, 0, 106, 11.4028F, -41.5F, -36.7873F, 2, 1, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        action.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
