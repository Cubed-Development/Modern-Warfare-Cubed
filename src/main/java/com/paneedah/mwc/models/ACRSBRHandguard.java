package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ACRSBRHandguard extends ModelBase {
    private final ModelRenderer SBR_Handguard;
    private final ModelRenderer ACR2_r1;
    private final ModelRenderer bone7_r1;
    private final ModelRenderer ACR109_r1;
    private final ModelRenderer bone5_r1;
    private final ModelRenderer handguard2;
    private final ModelRenderer bone2_r1;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone4_r1;

    public ACRSBRHandguard() {
        textureWidth = 400;
        textureHeight = 400;

        SBR_Handguard = new ModelRenderer(this);
        SBR_Handguard.setRotationPoint(-1.4167F, -17.0579F, -50.3385F);
        SBR_Handguard.cubeList.add(new ModelBox(SBR_Handguard, 162, 128, -1.2833F, -1.2421F, -0.6615F, 2, 1, 2, 0.0F, false));
        SBR_Handguard.cubeList.add(new ModelBox(SBR_Handguard, 0, 123, 0.1167F, -1.2421F, -0.6615F, 1, 1, 2, 0.0F, false));

        ACR2_r1 = new ModelRenderer(this);
        ACR2_r1.setRotationPoint(17.5736F, -33.2926F, 50.3385F);
        SBR_Handguard.addChild(ACR2_r1);
        setRotationAngle(ACR2_r1, 0.0F, 0.0F, -2.5133F);
        ACR2_r1.cubeList.add(new ModelBox(ACR2_r1, 12, 78, -5.0F, -39.8F, -51.0F, 1, 3, 2, 0.0F, false));

        bone7_r1 = new ModelRenderer(this);
        bone7_r1.setRotationPoint(6.6363F, -18.238F, 59.5407F);
        SBR_Handguard.addChild(bone7_r1);
        setRotationAngle(bone7_r1, 0.3316F, 0.0F, -2.5133F);
        bone7_r1.cubeList.add(new ModelBox(bone7_r1, 35, 0, -5.0F, -39.8F, -51.0F, 1, 3, 1, 0.0F, false));

        ACR109_r1 = new ModelRenderer(this);
        ACR109_r1.setRotationPoint(-20.1673F, -31.5293F, 50.3385F);
        SBR_Handguard.addChild(ACR109_r1);
        setRotationAngle(ACR109_r1, 0.0F, 0.0F, 2.5133F);
        ACR109_r1.cubeList.add(new ModelBox(ACR109_r1, 96, 10, 1.0F, -39.8F, -51.0F, 1, 3, 2, 0.0F, false));

        bone5_r1 = new ModelRenderer(this);
        bone5_r1.setRotationPoint(-9.2301F, -16.4747F, 59.5407F);
        SBR_Handguard.addChild(bone5_r1);
        setRotationAngle(bone5_r1, 0.3316F, 0.0F, 2.5133F);
        bone5_r1.cubeList.add(new ModelBox(bone5_r1, 61, 47, 1.0F, -39.8F, -51.0F, 1, 3, 1, 0.0F, false));

        handguard2 = new ModelRenderer(this);
        handguard2.setRotationPoint(1.7167F, 1.6579F, 1.3385F);
        SBR_Handguard.addChild(handguard2);
        handguard2.cubeList.add(new ModelBox(handguard2, 188, 202, -3.1F, 4.1F, -3.0F, 2, 1, 29, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 214, 0, -1.5F, 4.1F, -3.0F, 1, 1, 29, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 161, 134, -1.6F, 4.8F, 21.0F, 1, 1, 4, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 123, 153, -3.0F, 4.8F, 21.0F, 2, 1, 4, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 150, 58, -1.5F, 4.6F, 23.0F, 1, 1, 1, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 131, 149, -3.1F, 4.6F, 23.0F, 1, 1, 1, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 247, 88, 0.0F, -0.4F, -3.0F, 1, 1, 27, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 88, 219, 0.0F, 2.7F, -3.0F, 1, 1, 28, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 106, 10, 0.01F, -0.3F, -3.0F, 1, 3, 2, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 103, 67, 0.01F, -0.3F, 3.0F, 1, 3, 2, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 58, 101, 0.01F, -0.3F, 9.0F, 1, 3, 2, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 47, 101, 0.01F, -0.3F, 15.0F, 1, 3, 2, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 124, 149, -4.59F, 1.7F, 24.0F, 1, 1, 1, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 117, 149, 0.01F, 1.7F, 24.0F, 1, 1, 1, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 57, 57, 0.01F, -0.3F, 21.0F, 1, 3, 3, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 29, 247, 0.0F, 1.15F, -3.0F, 1, 1, 27, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 158, 211, -4.6F, 2.7F, -3.0F, 1, 1, 28, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 11, 101, -4.61F, -0.3F, -3.0F, 1, 3, 2, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 0, 101, -4.61F, -0.3F, 3.0F, 1, 3, 2, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 96, 27, -4.61F, -0.3F, 9.0F, 1, 3, 2, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 96, 18, -4.61F, -0.3F, 15.0F, 1, 3, 2, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 47, 57, -4.61F, -0.3F, 21.0F, 1, 3, 3, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 161, 119, -4.5F, 0.3F, -1.0F, 1, 1, 4, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 161, 102, -0.1F, 0.3F, -1.0F, 1, 1, 4, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 246, 60, -4.6F, -0.4F, -3.0F, 1, 1, 27, 0.0F, false));
        handguard2.cubeList.add(new ModelBox(handguard2, 0, 246, -4.6F, 1.15F, -3.0F, 1, 1, 27, 0.0F, false));

        bone2_r1 = new ModelRenderer(this);
        bone2_r1.setRotationPoint(-0.3F, 45.4002F, 13.8519F);
        handguard2.addChild(bone2_r1);
        setRotationAngle(bone2_r1, -0.7679F, 0.0F, 0.0F);
        bone2_r1.cubeList.add(new ModelBox(bone2_r1, 9, 119, 0.2F, -39.9965F, -24.5137F, 1, 2, 3, 0.0F, false));
        bone2_r1.cubeList.add(new ModelBox(bone2_r1, 56, 120, -4.3F, -39.9965F, -24.5137F, 1, 2, 3, 0.0F, false));

        bone3_r1 = new ModelRenderer(this);
        bone3_r1.setRotationPoint(-25.9958F, 27.0967F, 49.0F);
        handguard2.addChild(bone3_r1);
        setRotationAngle(bone3_r1, 0.0F, 0.0F, 0.8203F);
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 218, 171, 0.3F, -35.7F, -52.0F, 1, 2, 28, 0.0F, false));

        bone4_r1 = new ModelRenderer(this);
        bone4_r1.setRotationPoint(24.4418F, 24.9027F, 49.0F);
        handguard2.addChild(bone4_r1);
        setRotationAngle(bone4_r1, 0.0F, 0.0F, -0.8203F);
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 219, 30, -4.3F, -35.7F, -52.0F, 1, 2, 28, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        SBR_Handguard.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
