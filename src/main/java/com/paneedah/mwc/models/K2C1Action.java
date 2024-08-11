package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class K2C1Action extends ModelWithAttachments {
    private final ModelRenderer Action;
    private final ModelRenderer bulletejection_r1;
    private final ModelRenderer lever_r1;
    private final ModelRenderer lever;
    private final ModelRenderer bulletejection;
    private final ModelRenderer bulletejection2;

    public K2C1Action() {
        textureWidth = 256;
        textureHeight = 256;

        Action = new ModelRenderer(this);
        Action.setRotationPoint(0.0F, 24.0F, 0.0F);


        bulletejection_r1 = new ModelRenderer(this);
        bulletejection_r1.setRotationPoint(-4.0944F, -38.6773F, -20.8618F);
        Action.addChild(bulletejection_r1);
        setRotationAngle(bulletejection_r1, 0.0F, 0.0F, -0.7854F);


        lever_r1 = new ModelRenderer(this);
        lever_r1.setRotationPoint(-3.9549F, -39.5237F, -19.0644F);
        Action.addChild(lever_r1);
        setRotationAngle(lever_r1, 0.0F, 0.0F, -0.7854F);


        lever = new ModelRenderer(this);
        lever.setRotationPoint(-3.9549F, -39.5237F, -19.0644F);
        Action.addChild(lever);
        setRotationAngle(lever, 0.0F, 0.0F, -0.7854F);
        lever.cubeList.add(new ModelBox(lever, 54, 48, -0.5F, -2.1464F, -0.25F, 1, 2, 1, 0.0F, false));
        lever.cubeList.add(new ModelBox(lever, 54, 21, -0.5F, -2.1464F, -0.75F, 1, 2, 1, 0.0F, false));
        lever.cubeList.add(new ModelBox(lever, 54, 8, -0.3839F, -1.9697F, -0.5F, 1, 2, 1, 0.0F, false));
        lever.cubeList.add(new ModelBox(lever, 53, 36, -0.6768F, -1.9697F, -0.5F, 1, 2, 1, 0.0F, false));
        lever.cubeList.add(new ModelBox(lever, 21, 72, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        bulletejection = new ModelRenderer(this);
        bulletejection.setRotationPoint(-4.0944F, -38.6773F, -20.8618F);
        Action.addChild(bulletejection);
        setRotationAngle(bulletejection, 0.0F, 0.0F, -0.7854F);
        bulletejection.cubeList.add(new ModelBox(bulletejection, 60, 72, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

        bulletejection2 = new ModelRenderer(this);
        bulletejection2.setRotationPoint(-3.3444F, -40.1773F, -19.8618F);
        Action.addChild(bulletejection2);
        bulletejection2.cubeList.add(new ModelBox(bulletejection2, 60, 25, 0.0F, 0.0F, -1.0F, 1, 1, 10, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        Action.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
