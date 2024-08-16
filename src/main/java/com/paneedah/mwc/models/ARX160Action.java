package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ARX160Action extends ModelWithAttachments {
    private final ModelRenderer action;
    private final ModelRenderer cube_r250;
    private final ModelRenderer cube_r251;
    private final ModelRenderer cube_r252;

    public ARX160Action() {
        textureWidth = 200;
        textureHeight = 200;

        action = new ModelRenderer(this);
        action.setRotationPoint(0.0F, 20.0F, 0.0F);
        action.cubeList.add(new ModelBox(action, 151, 20, -0.75F, -38.3341F, -25.2473F, 1, 1, 16, 0.0F, false));
        action.cubeList.add(new ModelBox(action, 52, 52, -0.76F, -37.5841F, -24.4973F, 1, 1, 9, 0.0F, false));
        action.cubeList.add(new ModelBox(action, 141, 121, -3.25F, -38.3341F, -25.2473F, 1, 1, 16, 0.0F, false));
        action.cubeList.add(new ModelBox(action, 3, 36, -3.24F, -37.5841F, -24.4973F, 1, 1, 9, 0.0F, false));
        action.cubeList.add(new ModelBox(action, 60, 78, -0.75F, -36.9F, -22.6179F, 1, 1, 6, 0.0F, false));
        action.cubeList.add(new ModelBox(action, 77, 60, -3.25F, -36.9F, -22.6179F, 1, 1, 6, 0.0F, false));

        cube_r250 = new ModelRenderer(this);
        cube_r250.setRotationPoint(-2.75F, -36.7119F, -16.6134F);
        action.addChild(cube_r250);
        setRotationAngle(cube_r250, 0.3491F, 0.0F, 0.0F);
        cube_r250.cubeList.add(new ModelBox(cube_r250, 95, 88, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));
        cube_r250.cubeList.add(new ModelBox(cube_r250, 96, 67, 2.0F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        cube_r251 = new ModelRenderer(this);
        cube_r251.setRotationPoint(-2.75F, -36.7119F, -23.3866F);
        action.addChild(cube_r251);
        setRotationAngle(cube_r251, -0.3491F, 0.0F, 0.0F);
        cube_r251.cubeList.add(new ModelBox(cube_r251, 96, 37, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));
        cube_r251.cubeList.add(new ModelBox(cube_r251, 44, 97, 2.0F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        cube_r252 = new ModelRenderer(this);
        cube_r252.setRotationPoint(1.5F, -37.8341F, -24.2473F);
        action.addChild(cube_r252);
        setRotationAngle(cube_r252, 0.0F, -0.1309F, 0.0F);
        cube_r252.cubeList.add(new ModelBox(cube_r252, 25, 57, -1.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
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
