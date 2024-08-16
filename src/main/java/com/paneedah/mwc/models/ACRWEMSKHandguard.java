package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ACRWEMSKHandguard extends ModelBase {
    private final ModelRenderer Wemsk_Handguard;
    private final ModelRenderer bone7_r1;
    private final ModelRenderer bone8_r1;
    private final ModelRenderer bone9_r1;
    private final ModelRenderer bone10_r1;
    private final ModelRenderer bone2_r1;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone11_r1;
    private final ModelRenderer bone13_r1;
    private final ModelRenderer bone14_r1;
    private final ModelRenderer bone15_r1;

    public ACRWEMSKHandguard() {
        textureWidth = 400;
        textureHeight = 400;

        Wemsk_Handguard = new ModelRenderer(this);
        Wemsk_Handguard.setRotationPoint(-1.5348F, -12.7169F, -39.2587F);
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 188, 202, -0.9652F, 1.4169F, -12.7413F, 2, 1, 29, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 66, 118, 0.2348F, 2.1169F, 10.2587F, 1, 1, 5, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 141, 73, -1.1652F, 2.1169F, 10.2587F, 2, 1, 5, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 158, 48, 0.3348F, 1.9169F, 13.2587F, 1, 1, 1, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 158, 46, -1.2652F, 1.9169F, 13.2587F, 1, 1, 1, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 222, 230, 2.3348F, -0.3831F, -12.7413F, 1, 1, 28, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 22, 142, 2.3348F, -1.3831F, -12.7413F, 1, 1, 2, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 133, 135, 2.3348F, -1.3831F, -6.7413F, 1, 1, 2, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 94, 134, 2.3348F, -1.3831F, -0.7413F, 1, 1, 2, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 134, 13, 2.3348F, -1.3831F, 5.2587F, 1, 1, 2, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 163, 74, 2.3348F, -1.3831F, 11.2587F, 1, 1, 4, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 249, 28, 2.3348F, -2.3831F, -11.7413F, 1, 1, 27, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 221, 201, -3.2652F, -0.3831F, -12.7413F, 1, 1, 28, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 0, 133, -3.2652F, -1.3831F, -12.7413F, 1, 1, 2, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 85, 129, -3.2652F, -1.3831F, -6.7413F, 1, 1, 2, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 103, 125, -3.2652F, -1.3831F, -0.7413F, 1, 1, 2, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 94, 125, -3.2652F, -1.3831F, 5.2587F, 1, 1, 2, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 63, 163, -3.2652F, -1.3831F, 11.2587F, 1, 1, 4, 0.0F, false));
        Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 247, 116, -3.2652F, -2.3831F, -11.7413F, 1, 1, 27, 0.0F, false));

        bone7_r1 = new ModelRenderer(this);
        bone7_r1.setRotationPoint(1.5348F, -5.9107F, 52.1707F);
        Wemsk_Handguard.addChild(bone7_r1);
        setRotationAngle(bone7_r1, 0.7854F, 0.0F, 0.0F);
        bone7_r1.cubeList.add(new ModelBox(bone7_r1, 11, 155, -4.9F, -37.9F, -45.0F, 1, 1, 1, 0.0F, false));
        bone7_r1.cubeList.add(new ModelBox(bone7_r1, 38, 155, -4.9F, -33.6574F, -40.7574F, 1, 1, 1, 0.0F, false));
        bone7_r1.cubeList.add(new ModelBox(bone7_r1, 131, 155, -4.9F, -29.4147F, -36.5147F, 1, 1, 1, 0.0F, false));
        bone7_r1.cubeList.add(new ModelBox(bone7_r1, 155, 150, -4.9F, -25.1721F, -32.2721F, 1, 1, 1, 0.0F, false));
        bone7_r1.cubeList.add(new ModelBox(bone7_r1, 155, 152, -4.9F, -42.1426F, -49.2426F, 1, 1, 1, 0.0F, false));
        bone7_r1.cubeList.add(new ModelBox(bone7_r1, 156, 33, 0.9F, -37.9F, -45.0F, 1, 1, 1, 0.0F, false));
        bone7_r1.cubeList.add(new ModelBox(bone7_r1, 156, 38, 0.9F, -33.6574F, -40.7574F, 1, 1, 1, 0.0F, false));
        bone7_r1.cubeList.add(new ModelBox(bone7_r1, 46, 156, 0.9F, -29.4147F, -36.5147F, 1, 1, 1, 0.0F, false));
        bone7_r1.cubeList.add(new ModelBox(bone7_r1, 54, 156, 0.9F, -25.1721F, -32.2721F, 1, 1, 1, 0.0F, false));
        bone7_r1.cubeList.add(new ModelBox(bone7_r1, 63, 156, 0.9F, -42.1426F, -49.2426F, 1, 1, 1, 0.0F, false));

        bone8_r1 = new ModelRenderer(this);
        bone8_r1.setRotationPoint(-23.5543F, 31.3838F, 39.2587F);
        Wemsk_Handguard.addChild(bone8_r1);
        setRotationAngle(bone8_r1, 0.0F, 0.0F, 0.6632F);
        bone8_r1.cubeList.add(new ModelBox(bone8_r1, 252, 230, -4.8F, -40.1F, -50.0F, 1, 1, 26, 0.0F, false));
        bone8_r1.cubeList.add(new ModelBox(bone8_r1, 279, 198, -4.79F, -40.5F, -49.0F, 1, 1, 25, 0.0F, false));

        bone9_r1 = new ModelRenderer(this);
        bone9_r1.setRotationPoint(-35.7187F, 46.9543F, -29.9926F);
        Wemsk_Handguard.addChild(bone9_r1);
        setRotationAngle(bone9_r1, -1.2043F, 0.0F, 0.6632F);
        bone9_r1.cubeList.add(new ModelBox(bone9_r1, 141, 55, -4.8F, -40.5F, -49.0F, 1, 2, 1, 0.0F, false));

        bone10_r1 = new ModelRenderer(this);
        bone10_r1.setRotationPoint(1.5348F, 61.3273F, -3.3268F);
        Wemsk_Handguard.addChild(bone10_r1);
        setRotationAngle(bone10_r1, -0.7854F, 0.0F, 0.0F);
        bone10_r1.cubeList.add(new ModelBox(bone10_r1, 0, 156, -4.8F, -39.1F, -51.0F, 1, 1, 1, 0.0F, false));
        bone10_r1.cubeList.add(new ModelBox(bone10_r1, 8, 156, -4.8F, -38.7F, -51.0F, 1, 1, 1, 0.0F, false));
        bone10_r1.cubeList.add(new ModelBox(bone10_r1, 69, 156, 0.8F, -39.1F, -51.0F, 1, 1, 1, 0.0F, false));
        bone10_r1.cubeList.add(new ModelBox(bone10_r1, 11, 157, 0.8F, -38.7F, -51.0F, 1, 1, 1, 0.0F, false));

        bone2_r1 = new ModelRenderer(this);
        bone2_r1.setRotationPoint(25.988F, 29.5369F, 39.2587F);
        Wemsk_Handguard.addChild(bone2_r1);
        setRotationAngle(bone2_r1, 0.0F, 0.0F, -0.6632F);
        bone2_r1.cubeList.add(new ModelBox(bone2_r1, 254, 257, 0.8F, -40.1F, -50.0F, 1, 1, 26, 0.0F, false));
        bone2_r1.cubeList.add(new ModelBox(bone2_r1, 280, 224, 0.81F, -40.5F, -49.0F, 1, 1, 25, 0.0F, false));

        bone3_r1 = new ModelRenderer(this);
        bone3_r1.setRotationPoint(38.1524F, 45.1074F, -29.9926F);
        Wemsk_Handguard.addChild(bone3_r1);
        setRotationAngle(bone3_r1, -1.2043F, 0.0F, -0.6632F);
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 141, 65, 0.8F, -40.5F, -49.0F, 1, 2, 1, 0.0F, false));

        bone11_r1 = new ModelRenderer(this);
        bone11_r1.setRotationPoint(23.6236F, 30.5304F, 39.2587F);
        Wemsk_Handguard.addChild(bone11_r1);
        setRotationAngle(bone11_r1, 0.0F, 0.0F, -0.6458F);
        bone11_r1.cubeList.add(new ModelBox(bone11_r1, 115, 54, -1.2F, -37.1F, -52.0F, 3, 1, 2, 0.0F, false));
        bone11_r1.cubeList.add(new ModelBox(bone11_r1, 77, 163, -0.2F, -37.1F, -28.0F, 1, 1, 4, 0.0F, false));
        bone11_r1.cubeList.add(new ModelBox(bone11_r1, 37, 142, -0.2F, -37.1F, -34.0F, 1, 1, 2, 0.0F, false));
        bone11_r1.cubeList.add(new ModelBox(bone11_r1, 143, 0, -0.2F, -37.1F, -40.0F, 1, 1, 2, 0.0F, false));
        bone11_r1.cubeList.add(new ModelBox(bone11_r1, 143, 3, -0.2F, -37.1F, -46.0F, 1, 1, 2, 0.0F, false));
        bone11_r1.cubeList.add(new ModelBox(bone11_r1, 26, 301, -1.2F, -37.1F, -50.0F, 1, 1, 23, 0.0F, false));
        bone11_r1.cubeList.add(new ModelBox(bone11_r1, 109, 163, 0.8F, -37.1F, -50.0F, 1, 1, 4, 0.0F, false));
        bone11_r1.cubeList.add(new ModelBox(bone11_r1, 221, 259, 0.4F, -37.11F, -50.0F, 1, 1, 26, 0.0F, false));

        bone13_r1 = new ModelRenderer(this);
        bone13_r1.setRotationPoint(6.8572F, -1.2253F, 51.5102F);
        Wemsk_Handguard.addChild(bone13_r1);
        setRotationAngle(bone13_r1, 0.7854F, 0.0F, 0.8988F);
        bone13_r1.cubeList.add(new ModelBox(bone13_r1, 57, 157, -1.6821F, -36.9659F, -45.0F, 1, 1, 1, 0.0F, false));
        bone13_r1.cubeList.add(new ModelBox(bone13_r1, 77, 157, -1.6821F, -32.7233F, -40.7574F, 1, 1, 1, 0.0F, false));
        bone13_r1.cubeList.add(new ModelBox(bone13_r1, 83, 157, -1.6821F, -28.4806F, -36.5147F, 1, 1, 1, 0.0F, false));
        bone13_r1.cubeList.add(new ModelBox(bone13_r1, 92, 157, -1.6821F, -24.238F, -32.2721F, 1, 1, 1, 0.0F, false));
        bone13_r1.cubeList.add(new ModelBox(bone13_r1, 102, 157, -1.6821F, -41.2085F, -49.2426F, 1, 1, 1, 0.0F, false));

        bone14_r1 = new ModelRenderer(this);
        bone14_r1.setRotationPoint(-21.1581F, 32.3359F, 39.2587F);
        Wemsk_Handguard.addChild(bone14_r1);
        setRotationAngle(bone14_r1, 0.0F, 0.0F, 0.6458F);
        bone14_r1.cubeList.add(new ModelBox(bone14_r1, 116, 74, -4.8F, -37.1F, -52.0F, 3, 1, 2, 0.0F, false));
        bone14_r1.cubeList.add(new ModelBox(bone14_r1, 123, 163, -3.8F, -37.1F, -28.0F, 1, 1, 4, 0.0F, false));
        bone14_r1.cubeList.add(new ModelBox(bone14_r1, 143, 7, -3.8F, -37.1F, -34.0F, 1, 1, 2, 0.0F, false));
        bone14_r1.cubeList.add(new ModelBox(bone14_r1, 143, 10, -3.8F, -37.1F, -40.0F, 1, 1, 2, 0.0F, false));
        bone14_r1.cubeList.add(new ModelBox(bone14_r1, 143, 17, -3.8F, -37.1F, -46.0F, 1, 1, 2, 0.0F, false));
        bone14_r1.cubeList.add(new ModelBox(bone14_r1, 92, 164, -4.8F, -37.1F, -50.0F, 1, 1, 4, 0.0F, false));
        bone14_r1.cubeList.add(new ModelBox(bone14_r1, 279, 304, -4.4F, -37.1F, -46.0F, 1, 1, 22, 0.0F, false));
        bone14_r1.cubeList.add(new ModelBox(bone14_r1, 165, 150, -2.8F, -37.1F, -50.0F, 1, 1, 4, 0.0F, false));
        bone14_r1.cubeList.add(new ModelBox(bone14_r1, 183, 261, -3.2F, -37.11F, -50.0F, 1, 1, 26, 0.0F, false));

        bone15_r1 = new ModelRenderer(this);
        bone15_r1.setRotationPoint(-0.0373F, 4.5074F, 53.6789F);
        Wemsk_Handguard.addChild(bone15_r1);
        setRotationAngle(bone15_r1, 0.7854F, 0.0F, 2.1904F);
        bone15_r1.cubeList.add(new ModelBox(bone15_r1, 109, 157, -2.2091F, -40.0328F, -45.0F, 1, 1, 1, 0.0F, false));
        bone15_r1.cubeList.add(new ModelBox(bone15_r1, 115, 157, -2.2091F, -35.7902F, -40.7574F, 1, 1, 1, 0.0F, false));
        bone15_r1.cubeList.add(new ModelBox(bone15_r1, 0, 158, -2.2091F, -31.5475F, -36.5147F, 1, 1, 1, 0.0F, false));
        bone15_r1.cubeList.add(new ModelBox(bone15_r1, 8, 158, -2.2091F, -27.3049F, -32.2721F, 1, 1, 1, 0.0F, false));
        bone15_r1.cubeList.add(new ModelBox(bone15_r1, 46, 158, -2.2091F, -44.2754F, -49.2426F, 1, 1, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        Wemsk_Handguard.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
