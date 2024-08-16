package com.paneedah.weaponlib.crafting.ammopress.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Gunpowder extends ModelBase {
    private final ModelRenderer bb_main;

    public Gunpowder() {
        textureWidth = 16;
        textureHeight = 16;

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 0.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {


        bb_main.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
