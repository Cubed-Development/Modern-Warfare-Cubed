package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KBP9A91Suppressor extends ModelWithAttachments {
    private final ModelRenderer Suppressor;
    private final ModelRenderer cube_r140_r1;
    private final ModelRenderer cube_r141_r1;
    private final ModelRenderer cube_r138_r1;
    private final ModelRenderer cube_r139_r1;
    private final ModelRenderer cube_r136_r1;
    private final ModelRenderer cube_r137_r1;
    private final ModelRenderer cube_r134_r1;
    private final ModelRenderer cube_r135_r1;

    public KBP9A91Suppressor() {
        textureWidth = 220;
        textureHeight = 220;

        Suppressor = new ModelRenderer(this);
        Suppressor.setRotationPoint(-1.5F, -13.8F, -51.5F);


        cube_r140_r1 = new ModelRenderer(this);
        cube_r140_r1.setRotationPoint(31.5958F, 14.039F, 51.5F);
        Suppressor.addChild(cube_r140_r1);
        setRotationAngle(cube_r140_r1, 0.0F, 0.0F, -1.1345F);
        cube_r140_r1.cubeList.add(new ModelBox(cube_r140_r1, 79, 36, -3.8F, -35.7F, -84.3F, 2, 2, 34, -0.201F, false));

        cube_r141_r1 = new ModelRenderer(this);
        cube_r141_r1.setRotationPoint(28.553F, -15.9648F, 51.5F);
        Suppressor.addChild(cube_r141_r1);
        setRotationAngle(cube_r141_r1, 0.0F, 0.0F, -2.0071F);
        cube_r141_r1.cubeList.add(new ModelBox(cube_r141_r1, 0, 80, -5.4F, -35.7F, -84.3F, 2, 2, 34, -0.2F, false));

        cube_r138_r1 = new ModelRenderer(this);
        cube_r138_r1.setRotationPoint(-30.328F, 16.758F, 51.5F);
        Suppressor.addChild(cube_r138_r1);
        setRotationAngle(cube_r138_r1, 0.0F, 0.0F, 1.1345F);
        cube_r138_r1.cubeList.add(new ModelBox(cube_r138_r1, 82, 72, -1.2F, -35.7F, -84.3F, 2, 2, 34, -0.2F, false));

        cube_r139_r1 = new ModelRenderer(this);
        cube_r139_r1.setRotationPoint(-29.8208F, -13.2458F, 51.5F);
        Suppressor.addChild(cube_r139_r1);
        setRotationAngle(cube_r139_r1, 0.0F, 0.0F, 2.0071F);
        cube_r139_r1.cubeList.add(new ModelBox(cube_r139_r1, 82, 108, 0.4F, -35.7F, -84.3F, 2, 2, 34, -0.201F, false));

        cube_r136_r1 = new ModelRenderer(this);
        cube_r136_r1.setRotationPoint(-12.755F, 35.305F, 51.5F);
        Suppressor.addChild(cube_r136_r1);
        setRotationAngle(cube_r136_r1, 0.0F, 0.0F, 0.4363F);
        cube_r136_r1.cubeList.add(new ModelBox(cube_r136_r1, 46, 0, -3.3F, -35.2F, -84.3F, 2, 2, 34, -0.201F, false));

        cube_r137_r1 = new ModelRenderer(this);
        cube_r137_r1.setRotationPoint(15.4739F, 34.0373F, 51.5F);
        Suppressor.addChild(cube_r137_r1);
        setRotationAngle(cube_r137_r1, 0.0F, 0.0F, -0.4363F);
        cube_r137_r1.cubeList.add(new ModelBox(cube_r137_r1, 44, 77, -1.7F, -35.2F, -84.3F, 2, 2, 34, -0.199F, false));

        cube_r134_r1 = new ModelRenderer(this);
        cube_r134_r1.setRotationPoint(17.2488F, 33.6438F, 51.5F);
        Suppressor.addChild(cube_r134_r1);
        setRotationAngle(cube_r134_r1, 0.0F, 0.0F, -0.4363F);
        cube_r134_r1.cubeList.add(new ModelBox(cube_r134_r1, 0, 116, -3.3F, -37.8F, -84.3F, 2, 2, 34, -0.199F, false));

        cube_r135_r1 = new ModelRenderer(this);
        cube_r135_r1.setRotationPoint(-14.5298F, 34.9116F, 51.5F);
        Suppressor.addChild(cube_r135_r1);
        setRotationAngle(cube_r135_r1, 0.0F, 0.0F, 0.4363F);
        cube_r135_r1.cubeList.add(new ModelBox(cube_r135_r1, 38, 113, -1.7F, -37.8F, -84.3F, 2, 2, 34, -0.201F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        Suppressor.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
