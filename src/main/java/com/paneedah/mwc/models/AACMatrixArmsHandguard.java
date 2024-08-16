package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class AACMatrixArmsHandguard extends ModelBase {
    private final ModelRenderer handguard;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone7;
    private final ModelRenderer bone4;
    private final ModelRenderer bone6;
    private final ModelRenderer bone5;

    public AACMatrixArmsHandguard() {
        textureWidth = 256;
        textureHeight = 256;

        handguard = new ModelRenderer(this);
        handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
        handguard.cubeList.add(new ModelBox(handguard, 34, 103, -4.0F, -38.5F, -54.7F, 1, 1, 32, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 102, 102, 0.0F, -38.5F, -54.7F, 1, 1, 32, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 22, 22, 0.01F, -37.5F, -40.7F, 1, 1, 3, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 25, 28, 0.11F, -37.5F, -25.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 27, 11, -4.09F, -37.5F, -25.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 21, 28, 0.11F, -37.5F, -32.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 27, 9, -4.09F, -37.5F, -32.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 9, 28, 0.11F, -37.5F, -39.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 27, 7, -4.09F, -37.5F, -39.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 3, 28, 0.11F, -37.5F, -46.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 18, 27, -4.09F, -37.5F, -46.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 27, 22, 0.11F, -37.5F, -53.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 27, 16, -4.09F, -37.5F, -53.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 15, 0, 0.01F, -37.5F, -47.7F, 1, 1, 3, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 14, 11, 0.01F, -37.5F, -54.7F, 1, 1, 3, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 21, -3.99F, -37.5F, -40.7F, 1, 1, 3, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 15, 5, -3.99F, -37.5F, -47.7F, 1, 1, 3, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 15, 15, -3.99F, -37.5F, -54.7F, 1, 1, 3, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 12, 0.01F, -37.5F, -26.7F, 1, 1, 4, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 104, 0, -3.49F, -37.5F, -46.7F, 4, 1, 24, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 8, 11, -3.99F, -37.5F, -26.7F, 1, 1, 4, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 20, 13, 0.01F, -37.5F, -33.7F, 1, 1, 3, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 20, 1, -3.99F, -37.5F, -33.7F, 1, 1, 3, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 68, 99, -2.1F, -40.1F, -54.7F, 1, 1, 32, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 36, 1, -1.9F, -40.11F, -54.7F, 1, 1, 32, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 25, 2, -2.0F, -40.21F, -25.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 5, 17, -2.0F, -35.41F, -25.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 25, 0, -2.0F, -40.21F, -32.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 10, 20, -2.0F, -35.41F, -32.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 25, -2.0F, -40.21F, -39.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 22, 20, -2.0F, -35.41F, -39.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 24, 10, -2.0F, -40.21F, -46.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 24, 8, -2.0F, -35.41F, -46.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 7, 6, -2.5F, -40.21F, -53.7F, 2, 1, 4, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 7, 0, -2.5F, -35.31F, -53.7F, 2, 1, 4, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 99, -4.0F, -36.9F, -54.7F, 1, 1, 32, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 70, 66, 0.0F, -36.9F, -54.7F, 1, 1, 32, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 33, -2.5F, -35.51F, -54.7F, 2, 1, 32, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 128, 57, -2.6F, -35.5F, -42.7F, 1, 1, 20, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(-1.4F, -40.2F, -53.7F);
        handguard.addChild(bone);
        setRotationAngle(bone, -0.2094F, 0.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 12, 23, -1.1F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, -0.2079F, 0.9781F);
        bone.addChild(bone2);
        setRotationAngle(bone2, -0.733F, 0.0F, 0.0F);
        bone2.cubeList.add(new ModelBox(bone2, 21, 17, -1.11F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-1.6F, -34.3F, -53.7F);
        handguard.addChild(bone3);
        setRotationAngle(bone3, -0.2094F, 0.0F, -3.1416F);
        bone3.cubeList.add(new ModelBox(bone3, 6, 12, -1.1F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(0.0F, -0.2079F, 0.9781F);
        bone3.addChild(bone7);
        setRotationAngle(bone7, -0.733F, 0.0F, 0.0F);
        bone7.cubeList.add(new ModelBox(bone7, 20, 5, -1.1F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(1.0F, -38.5F, -42.7F);
        handguard.addChild(bone4);
        setRotationAngle(bone4, 0.0F, 0.0F, -0.8727F);
        bone4.cubeList.add(new ModelBox(bone4, 17, 20, -1.0F, -2.0F, -3.0F, 1, 1, 3, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 0, 0, -1.0F, -2.0F, -12.0F, 1, 1, 5, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 70, 33, -0.99F, -2.5F, -12.0F, 1, 1, 32, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 5, 20, -1.0F, -2.0F, 4.0F, 1, 1, 3, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 104, 33, -1.5F, -2.0F, -4.0F, 1, 1, 23, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 19, 9, -1.0F, -2.0F, 11.0F, 1, 1, 3, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 16, 24, -1.0F, -2.0F, 18.0F, 1, 1, 2, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 25, 26, -0.9F, -1.7F, 18.5F, 1, 1, 1, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 21, 26, -0.9F, -1.7F, 12.0F, 1, 1, 1, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 11, 26, -0.9F, -1.7F, 5.0F, 1, 1, 1, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 3, 26, -0.9F, -1.7F, -2.0F, 1, 1, 1, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 25, 13, -0.9F, -1.7F, -9.0F, 1, 1, 1, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 70, 0, -1.0F, -1.0F, -12.0F, 1, 1, 32, 0.0F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(1.0F, -35.9F, -42.7F);
        handguard.addChild(bone6);
        setRotationAngle(bone6, 0.0F, 0.0F, 0.7854F);
        bone6.cubeList.add(new ModelBox(bone6, 36, 36, -1.0F, 0.0F, -12.0F, 1, 2, 32, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, -3.5355F, 2.5355F, -12.0F, 2, 1, 32, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 12, 16, -3.0F, 2.65F, 18.5F, 1, 1, 1, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, -0.9494F, 0.5994F, 18.5F, 1, 1, 1, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 14, -3.0F, 2.65F, 12.0F, 1, 1, 1, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 2, -0.9494F, 0.5994F, 12.0F, 1, 1, 1, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 12, -3.0F, 2.65F, 5.0F, 1, 1, 1, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 6, -0.9494F, 0.5994F, 5.0F, 1, 1, 1, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 8, -3.0F, 2.65F, -2.0F, 1, 1, 1, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 7, 7, -0.9494F, 0.5994F, -2.0F, 1, 1, 1, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 7, 2, -3.0F, 2.65F, -9.0F, 1, 1, 1, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 7, 0, -0.9494F, 0.5994F, -9.0F, 1, 1, 1, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(-4.0F, -38.5F, -42.7F);
        handguard.addChild(bone5);
        setRotationAngle(bone5, 0.0F, 0.0F, 0.8727F);
        bone5.cubeList.add(new ModelBox(bone5, 12, 19, 0.0F, -2.0F, -3.0F, 1, 1, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 6, 0.0F, -2.0F, -12.0F, 1, 1, 5, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 34, 70, 0.0F, -1.0F, -12.0F, 1, 1, 32, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 66, -0.01F, -2.5F, -12.0F, 1, 1, 32, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 17, 0.0F, -2.0F, 4.0F, 1, 1, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 104, 66, 0.5F, -2.0F, -4.0F, 1, 1, 22, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 7, 16, 0.0F, -2.0F, 11.0F, 1, 1, 3, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 6, 24, 0.0F, -2.0F, 18.0F, 1, 1, 2, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 14, 27, -0.1F, -1.8F, 18.5F, 1, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 6, 27, -0.1F, -1.8F, 12.0F, 1, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 27, -0.1F, -1.8F, 5.0F, 1, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 26, 20, -0.1F, -1.8F, -9.0F, 1, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 26, 5, -0.1F, -1.8F, -2.0F, 1, 1, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        handguard.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
