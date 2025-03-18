package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class WoodenCrateOpened extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone10;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;

    public WoodenCrateOpened() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(7, 16, -7);
        setRotationAngle(bone, -1.5708F, 0, 0);
        bone.cubeList.add(new ModelBox(bone, 18, 75, -1, -1, -9, 2, 2, 14, 0, false));
        bone.cubeList.add(new ModelBox(bone, 0, 57, -15, -1, -9, 2, 2, 14, 0, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(7, 16, 7);
        setRotationAngle(bone2, -1.5708F, 0, 0);
        bone2.cubeList.add(new ModelBox(bone2, 0, 73, -1, -1, -9, 2, 2, 14, 0, false));
        bone2.cubeList.add(new ModelBox(bone2, 18, 59, -15, -1, -9, 2, 2, 14, 0, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-21, 10, 15);
        bone3.cubeList.add(new ModelBox(bone3, 52, 52, 14, -1, -22, 14, 12, 14, 0, false));
        bone3.cubeList.add(new ModelBox(bone3, 0, 89, 27, -3, -21, 2, 2, 12, 0, false));
        bone3.cubeList.add(new ModelBox(bone3, 82, 84, 13, -3, -21, 2, 2, 12, 0, false));
        bone3.cubeList.add(new ModelBox(bone3, 48, 20, 13, 11, -23, 16, 2, 16, 0, false));
        bone3.cubeList.add(new ModelBox(bone3, 36, 57, 15, -3, -23, 12, 2, 2, 0, false));
        bone3.cubeList.add(new ModelBox(bone3, 94, 51, 13, 13, -9, 16, 1, 2, 0, false));
        bone3.cubeList.add(new ModelBox(bone3, 90, 46, 13, 13, -16, 16, 1, 2, 0, false));
        bone3.cubeList.add(new ModelBox(bone3, 66, 17, 13, 13, -23, 16, 1, 2, 0, false));
        bone3.cubeList.add(new ModelBox(bone3, 36, 61, 15, -3, -9, 12, 2, 2, 0, false));

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(24, -4.9167F, -16);
        bone3.addChild(bone11);
        setRotationAngle(bone11, 0, -1.2217F, 0);
        bone11.cubeList.add(new ModelBox(bone11, 54, 38, -6, 0.9167F, -6, 12, 1, 12, 0, false));
        bone11.cubeList.add(new ModelBox(bone11, 38, 82, -8, -0.0833F, -6, 2, 2, 12, 0, false));
        bone11.cubeList.add(new ModelBox(bone11, 90, 42, -8, -0.0833F, -8, 16, 2, 2, 0, false));
        bone11.cubeList.add(new ModelBox(bone11, 90, 38, -8, -0.0833F, 6, 16, 2, 2, 0, false));
        bone11.cubeList.add(new ModelBox(bone11, 66, 82, 6, -0.0833F, -6, 2, 2, 12, 0, false));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(0, 0.6667F, 0);
        bone11.addChild(bone12);
        setRotationAngle(bone12, 0, -0.7854F, 0);
        bone12.cubeList.add(new ModelBox(bone12, 76, 78, -9, -0.5F, -1, 18, 2, 2, 0, false));

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(0, 0.5F, 0);
        bone12.addChild(bone13);
        setRotationAngle(bone13, 0, 1.5708F, 0);


        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0, 0.5F, 0);
        bone12.addChild(bone14);
        setRotationAngle(bone14, 0, 1.5708F, 0);
        bone14.cubeList.add(new ModelBox(bone14, 36, 78, -9, -1.01F, -1, 18, 2, 2, 0, false));

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(20.5F, 7.5F, -4);
        bone3.addChild(bone10);
        setRotationAngle(bone10, -1.0472F, 0, 0);


        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(14, 5, -15);
        bone3.addChild(bone4);
        setRotationAngle(bone4, 0.7854F, 0, 0);
        bone4.cubeList.add(new ModelBox(bone4, 0, 0, -0.5F, -1, -9, 15, 2, 18, 0, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(14.25F, 5, -15);
        bone3.addChild(bone5);
        setRotationAngle(bone5, -0.7854F, 0, 0);
        bone5.cubeList.add(new ModelBox(bone5, 0, 20, -0.74F, -1, -9, 15, 2, 18, 0, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(21, 5, -22);
        bone3.addChild(bone6);
        setRotationAngle(bone6, 0, 0, -0.7854F);
        bone6.cubeList.add(new ModelBox(bone6, 0, 40, -9, -1, -0.51F, 18, 2, 15, 0, false));

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(21, 5, -21.75F);
        bone3.addChild(bone7);
        setRotationAngle(bone7, 0, 0, 0.7854F);
        bone7.cubeList.add(new ModelBox(bone7, 48, 0, -9, -1, -0.75F, 18, 2, 15, 0, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(21, -2, 1);
        bone3.addChild(bone8);
        setRotationAngle(bone8, 0, -0.7854F, 0);


        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(21, 12, -15);
        bone3.addChild(bone9);
        setRotationAngle(bone9, 0, 0.7854F, 0);

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bone.render(f5);
        bone2.render(f5);
        bone3.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
