package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Suppressor556x39 extends ModelBase {
    private final ModelRenderer suppressor;
    private final ModelRenderer gun27_r1;
    private final ModelRenderer gun26_r1;
    private final ModelRenderer gun25_r1;
    private final ModelRenderer gun22_r1;
    private final ModelRenderer gun21_r1;
    private final ModelRenderer gun19_r1;
    private final ModelRenderer gun18_r1;
    private final ModelRenderer gun16_r1;
    private final ModelRenderer gun15_r1;
    private final ModelRenderer gun144_r1;
    private final ModelRenderer gun233_r1;
    private final ModelRenderer gun222_r1;
    private final ModelRenderer gun200_r1;
    private final ModelRenderer gun188_r1;
    private final ModelRenderer gun155_r1;
    private final ModelRenderer gun28_r1;

    public Suppressor556x39() {
        textureWidth = 128;
        textureHeight = 128;

        suppressor = new ModelRenderer(this);
        suppressor.setRotationPoint(-13.4662F, -12.6045F, 0.0F);
        suppressor.cubeList.add(new ModelBox(suppressor, 63, 37, 15.4662F, 13.6045F, -2.0F, 1, 2, 17, 0.0F, false));
        suppressor.cubeList.add(new ModelBox(suppressor, 63, 18, 12.4662F, 13.6045F, -2.0F, 1, 2, 17, 0.0F, false));
        suppressor.cubeList.add(new ModelBox(suppressor, 62, 0, 13.4662F, 15.6045F, -2.0F, 2, 1, 17, 0.0F, false));
        suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 13.4662F, 12.6045F, 15.3F, 2, 3, 5, 0.0F, false));
        suppressor.cubeList.add(new ModelBox(suppressor, 0, 38, 13.4662F, 12.6045F, -2.0F, 2, 3, 17, 0.0F, false));
        suppressor.cubeList.add(new ModelBox(suppressor, 0, 19, 13.4662F, 12.8045F, -2.2F, 2, 1, 18, 0.0F, false));
        suppressor.cubeList.add(new ModelBox(suppressor, 22, 21, 15.2662F, 13.6045F, -2.2F, 1, 2, 18, 0.0F, false));
        suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 13.4662F, 15.4045F, -2.2F, 2, 1, 18, -0.001F, false));
        suppressor.cubeList.add(new ModelBox(suppressor, 22, 0, 15.4662F, 13.6045F, 15.3F, 1, 2, 5, 0.0F, false));
        suppressor.cubeList.add(new ModelBox(suppressor, 0, 8, 13.4662F, 15.6045F, 15.3F, 2, 1, 5, 0.0F, false));
        suppressor.cubeList.add(new ModelBox(suppressor, 0, 19, 12.4662F, 13.6045F, 15.3F, 1, 2, 5, 0.0F, false));
        suppressor.cubeList.add(new ModelBox(suppressor, 22, 1, 12.6662F, 13.6045F, -2.2F, 1, 2, 18, 0.0F, false));

        gun27_r1 = new ModelRenderer(this);
        gun27_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        suppressor.addChild(gun27_r1);
        setRotationAngle(gun27_r1, 0.0F, 0.0F, 2.3794F);
        gun27_r1.cubeList.add(new ModelBox(gun27_r1, 60, 58, 0.6F, -21.0F, -2.2F, 1, 1, 18, 0.0F, false));

        gun26_r1 = new ModelRenderer(this);
        gun26_r1.setRotationPoint(-1.381F, -3.4467F, 0.0F);
        suppressor.addChild(gun26_r1);
        setRotationAngle(gun26_r1, 0.0F, 0.0F, 2.3794F);
        gun26_r1.cubeList.add(new ModelBox(gun26_r1, 20, 60, 0.6F, -23.0F, -2.2F, 1, 1, 18, 0.0F, false));

        gun25_r1 = new ModelRenderer(this);
        gun25_r1.setRotationPoint(-3.2845F, 29.7117F, 0.0F);
        suppressor.addChild(gun25_r1);
        setRotationAngle(gun25_r1, 0.0F, 0.0F, 0.7808F);
        gun25_r1.cubeList.add(new ModelBox(gun25_r1, 0, 58, 0.0F, -23.8F, -2.2F, 1, 1, 18, 0.0F, false));

        gun22_r1 = new ModelRenderer(this);
        gun22_r1.setRotationPoint(-1.7256F, -3.3086F, 0.0F);
        suppressor.addChild(gun22_r1);
        setRotationAngle(gun22_r1, 0.0F, 0.0F, 2.3794F);
        gun22_r1.cubeList.add(new ModelBox(gun22_r1, 42, 0, 0.4F, -23.0F, 15.3F, 1, 1, 5, 0.0F, false));
        gun22_r1.cubeList.add(new ModelBox(gun22_r1, 83, 1, 0.4F, -23.0F, -2.0F, 1, 1, 17, 0.0F, false));

        gun21_r1 = new ModelRenderer(this);
        gun21_r1.setRotationPoint(-3.4253F, 29.6538F, 0.0F);
        suppressor.addChild(gun21_r1);
        setRotationAngle(gun21_r1, 0.0F, 0.0F, 0.7808F);
        gun21_r1.cubeList.add(new ModelBox(gun21_r1, 40, 41, 0.0F, -24.0F, 15.3F, 1, 1, 5, 0.0F, false));
        gun21_r1.cubeList.add(new ModelBox(gun21_r1, 82, 20, 0.0F, -24.0F, -2.0F, 1, 1, 17, 0.0F, false));

        gun19_r1 = new ModelRenderer(this);
        gun19_r1.setRotationPoint(-1.0162F, 28.9992F, 0.0F);
        suppressor.addChild(gun19_r1);
        setRotationAngle(gun19_r1, 0.0F, 0.0F, 0.7808F);
        gun19_r1.cubeList.add(new ModelBox(gun19_r1, 21, 41, 2.0F, -21.4F, 15.3F, 1, 1, 5, 0.0F, false));
        gun19_r1.cubeList.add(new ModelBox(gun19_r1, 80, 56, 2.0F, -21.4F, -2.0F, 1, 1, 17, 0.0F, false));

        gun18_r1 = new ModelRenderer(this);
        gun18_r1.setRotationPoint(4.136F, -1.6572F, 0.0F);
        suppressor.addChild(gun18_r1);
        setRotationAngle(gun18_r1, 0.0F, 0.0F, 2.3794F);
        gun18_r1.cubeList.add(new ModelBox(gun18_r1, 0, 38, 3.0F, -21.0F, 15.3F, 1, 1, 5, 0.0F, false));
        gun18_r1.cubeList.add(new ModelBox(gun18_r1, 79, 78, 3.0F, -21.0F, -2.0F, 1, 1, 17, 0.0F, false));

        gun16_r1 = new ModelRenderer(this);
        gun16_r1.setRotationPoint(2.7551F, -5.1039F, 0.0F);
        suppressor.addChild(gun16_r1);
        setRotationAngle(gun16_r1, 0.0F, 0.0F, 2.3794F);
        gun16_r1.cubeList.add(new ModelBox(gun16_r1, 22, 27, 3.0F, -23.0F, 15.3F, 1, 1, 5, 0.0F, false));
        gun16_r1.cubeList.add(new ModelBox(gun16_r1, 19, 79, 3.0F, -23.0F, -2.0F, 1, 1, 17, 0.0F, false));

        gun15_r1 = new ModelRenderer(this);
        gun15_r1.setRotationPoint(-2.8461F, 28.2462F, 0.0F);
        suppressor.addChild(gun15_r1);
        setRotationAngle(gun15_r1, 0.0F, 0.0F, 0.7808F);
        gun15_r1.cubeList.add(new ModelBox(gun15_r1, 0, 26, 2.0F, -24.0F, 15.3F, 1, 1, 5, 0.0F, false));
        gun15_r1.cubeList.add(new ModelBox(gun15_r1, 60, 77, 2.0F, -24.0F, -2.0F, 1, 1, 17, -0.001F, false));

        gun144_r1 = new ModelRenderer(this);
        gun144_r1.setRotationPoint(-0.3447F, 0.1381F, 0.0F);
        suppressor.addChild(gun144_r1);
        setRotationAngle(gun144_r1, 0.0F, 0.0F, 2.3794F);
        gun144_r1.cubeList.add(new ModelBox(gun144_r1, 22, 21, 0.4F, -21.0F, 15.3F, 1, 1, 5, 0.0F, false));
        gun144_r1.cubeList.add(new ModelBox(gun144_r1, 0, 77, 0.4F, -21.0F, -2.0F, 1, 1, 17, 0.0F, false));

        gun233_r1 = new ModelRenderer(this);
        gun233_r1.setRotationPoint(3.7914F, -1.5191F, 0.0F);
        suppressor.addChild(gun233_r1);
        setRotationAngle(gun233_r1, 0.0F, 0.0F, 2.3794F);
        gun233_r1.cubeList.add(new ModelBox(gun233_r1, 40, 57, 2.8F, -21.0F, -2.2F, 1, 1, 18, -0.0015F, false));

        gun222_r1 = new ModelRenderer(this);
        gun222_r1.setRotationPoint(-1.1569F, 28.9412F, 0.0F);
        suppressor.addChild(gun222_r1);
        setRotationAngle(gun222_r1, 0.0F, 0.0F, 0.7808F);
        gun222_r1.cubeList.add(new ModelBox(gun222_r1, 42, 38, 2.0F, -21.6F, -2.2F, 1, 1, 18, -0.0015F, false));

        gun200_r1 = new ModelRenderer(this);
        gun200_r1.setRotationPoint(2.4104F, -4.9658F, 0.0F);
        suppressor.addChild(gun200_r1);
        setRotationAngle(gun200_r1, 0.0F, 0.0F, 2.3794F);
        gun200_r1.cubeList.add(new ModelBox(gun200_r1, 42, 19, 2.8F, -23.0F, -2.2F, 1, 1, 18, -0.002F, false));

        gun188_r1 = new ModelRenderer(this);
        gun188_r1.setRotationPoint(-2.7053F, 28.3041F, 0.0F);
        suppressor.addChild(gun188_r1);
        setRotationAngle(gun188_r1, 0.0F, 0.0F, 0.7808F);
        gun188_r1.cubeList.add(new ModelBox(gun188_r1, 42, 0, 2.0F, -23.8F, -2.2F, 1, 1, 18, -0.002F, false));

        gun155_r1 = new ModelRenderer(this);
        gun155_r1.setRotationPoint(-1.5954F, 30.4068F, 0.0F);
        suppressor.addChild(gun155_r1);
        setRotationAngle(gun155_r1, 0.0F, 0.0F, 0.7808F);
        gun155_r1.cubeList.add(new ModelBox(gun155_r1, 22, 7, 0.0F, -21.4F, 15.3F, 1, 1, 5, 0.0F, false));
        gun155_r1.cubeList.add(new ModelBox(gun155_r1, 41, 76, 0.0F, -21.4F, -2.0F, 1, 1, 17, -0.001F, false));

        gun28_r1 = new ModelRenderer(this);
        gun28_r1.setRotationPoint(-1.7361F, 30.3489F, 0.0F);
        suppressor.addChild(gun28_r1);
        setRotationAngle(gun28_r1, 0.0F, 0.0F, 0.7808F);
        gun28_r1.cubeList.add(new ModelBox(gun28_r1, 20, 41, 0.0F, -21.6F, -2.2F, 1, 1, 18, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        suppressor.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}