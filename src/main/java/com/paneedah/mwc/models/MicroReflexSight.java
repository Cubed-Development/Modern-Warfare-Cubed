package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class MicroReflexSight extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone12;
    private final ModelRenderer bone5;
    private final ModelRenderer bone11;
    private final ModelRenderer bone6;
    private final ModelRenderer bone14;
    private final ModelRenderer bone7;
    private final ModelRenderer bone13;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;

    public MicroReflexSight() {
        textureWidth = 16;
        textureHeight = 16;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(-2.0F, 24.0F, 0.0F);


        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-2.0F, -9.0F, -4.0F);
        bone.addChild(bone2);
        setRotationAngle(bone2, 0.0F, 0.0F, 0.7854F);
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.7071F, -2.0F, 0.0F, 1, 2, 15, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(8.0F, -9.0F, -4.0F);
        bone.addChild(bone3);
        setRotationAngle(bone3, 0.0F, 0.0F, -0.7854F);
        bone3.cubeList.add(new ModelBox(bone3, 0, 0, -1.7071F, -2.0F, 0.0F, 1, 2, 15, 0.0F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(-1.0F, -14.25F, -4.0F);
        bone.addChild(bone4);
        setRotationAngle(bone4, 0.0F, 0.0F, 0.5236F);
        bone4.cubeList.add(new ModelBox(bone4, 0, 0, 0.0F, -2.0F, 0.0F, 1, 2, 3, 0.0F, false));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(-1.0F, -14.25F, -1.0F);
        bone.addChild(bone12);
        setRotationAngle(bone12, 0.2618F, 0.0F, 0.5236F);
        bone12.cubeList.add(new ModelBox(bone12, 0, 0, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(7.0F, -14.25F, -4.0F);
        bone.addChild(bone5);
        setRotationAngle(bone5, 0.0F, 0.0F, -0.5236F);
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -1.0F, -2.0F, 0.0F, 1, 2, 3, 0.0F, false));

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(7.0F, -14.25F, -1.0F);
        bone.addChild(bone11);
        setRotationAngle(bone11, 0.2618F, 0.0F, -0.5236F);
        bone11.cubeList.add(new ModelBox(bone11, 0, 0, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, -16.0F, -4.0F);
        bone.addChild(bone6);
        setRotationAngle(bone6, 0.0F, 0.0F, 2.7576F);
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(-0.1F, -16.0F, -1.4F);
        bone.addChild(bone14);
        setRotationAngle(bone14, 0.0F, -0.3491F, 2.7576F);
        bone14.cubeList.add(new ModelBox(bone14, 0, 0, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(6.0F, -16.0F, -4.0F);
        bone.addChild(bone7);
        setRotationAngle(bone7, 0.0F, 0.0F, -2.7576F);
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(6.1F, -16.0F, -1.4F);
        bone.addChild(bone13);
        setRotationAngle(bone13, 0.0F, 0.3491F, -2.7576F);
        bone13.cubeList.add(new ModelBox(bone13, 0, 0, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone.addChild(bone8);
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, -1.5F, -8.5F, -4.0F, 2, 2, 15, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, -0.5F, -10.25F, -4.0F, 7, 3, 15, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, -0.75F, -11.25F, -4.0F, 1, 1, 15, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, -0.25F, -11.15F, -4.0F, 6, 1, 3, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 0.25F, -11.0F, -1.0F, 1, 1, 9, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 4.75F, -11.0F, -1.0F, 1, 1, 9, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 0.0F, -11.25F, 8.0F, 6, 2, 4, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 5.75F, -11.25F, -4.0F, 1, 1, 15, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, -1.0F, -14.25F, -4.0F, 1, 4, 4, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 1.85F, -16.75F, -4.0F, 2, 1, 3, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 3.2F, -16.75F, -4.0F, 1, 1, 3, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 6.0F, -14.25F, -4.0F, 1, 4, 4, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 6.5F, -11.75F, -4.0F, 1, 2, 10, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, -1.5F, -11.75F, -4.0F, 1, 2, 10, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 0, 0, 5.5F, -8.5F, -4.0F, 2, 2, 15, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(-1.0F, -14.25F, 0.0F);
        bone.addChild(bone9);
        setRotationAngle(bone9, -0.384F, 0.0349F, 0.0F);
        bone9.cubeList.add(new ModelBox(bone9, 0, 0, 0.0F, 0.0F, 0.0F, 1, 3, 8, 0.0F, false));

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(7.0F, -14.25F, 0.0F);
        bone.addChild(bone10);
        setRotationAngle(bone10, -0.384F, -0.0349F, 0.0F);
        bone10.cubeList.add(new ModelBox(bone10, 0, 0, -1.0F, 0.0F, 0.0F, 1, 3, 8, 0.0F, false));

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(7.8F, -10.75F, -4.5F);
        bone.addChild(bone15);
        setRotationAngle(bone15, 0.0F, 0.0F, 0.6981F);
        bone15.cubeList.add(new ModelBox(bone15, 0, 0, -1.0F, -1.0F, 0.0F, 2, 2, 11, 0.0F, false));

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone15.addChild(bone16);
        setRotationAngle(bone16, 0.0F, 0.0F, -0.4363F);
        bone16.cubeList.add(new ModelBox(bone16, 0, 0, -1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bone.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
