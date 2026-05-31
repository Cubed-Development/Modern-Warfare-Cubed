package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HKS20Grip extends ModelWithAttachments {
    private final ModelRenderer grip;
    private final ModelRenderer grip33_r1;
    private final ModelRenderer grip32_r1;
    private final ModelRenderer grip30_r1;
    private final ModelRenderer grip29_r1;
    private final ModelRenderer grip27_r1;
    private final ModelRenderer grip25_r1;
    private final ModelRenderer grip15_r1;
    private final ModelRenderer grip14_r1;
    private final ModelRenderer grip13_r1;
    private final ModelRenderer grip12_r1;
    private final ModelRenderer grip11_r1;
    private final ModelRenderer grip10_r1;
    private final ModelRenderer grip144_r1;
    private final ModelRenderer grip122_r1;
    private final ModelRenderer grip111_r1;
    private final ModelRenderer grip8_r1;
    private final ModelRenderer grip7_r1;
    private final ModelRenderer grip4_r1;
    private final ModelRenderer grip177_r1;
    private final ModelRenderer grip64_r1;
    private final ModelRenderer grip63_r1;
    private final ModelRenderer grip62_r1;
    private final ModelRenderer grip61_r1;
    private final ModelRenderer grip60_r1;
    private final ModelRenderer grip59_r1;
    private final ModelRenderer grip56_r1;
    private final ModelRenderer grip55_r1;

    public HKS20Grip() {
        textureWidth = 512;
        textureHeight = 256;

        grip = new ModelRenderer(this);
        grip.setRotationPoint(0, 24, 0);
        grip.cubeList.add(new ModelBox(grip, 0, 0, -1, -33.5F, 2, 2, 1, 12, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 0, -3.5F, -30, 7.9F, 4, 9, 9, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 0, -3.5F, -33, -1.1F, 4, 3, 15, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 0, -4, -33.5F, 2, 2, 1, 12, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 0, -3.5F, -31.5F, -7, 4, 4, 6, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 0, -3.5F, -31.5F, -1.5F, 4, 4, 1, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 200, -4, -36.5F, -30, 5, 4, 32, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 200, 0.2F, -37.5F, -30, 1, 2, 7, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 200, 0.2F, -35.9F, -28.8F, 1, 1, 5, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 200, -4, -37.5F, -30, 1, 1, 6, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 200, -4.2F, -35.5F, -9, 1, 3, 1, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 200, 0.2F, -35.5F, -9, 1, 3, 1, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 200, 0.2F, -35.5F, -8, 1, 1, 2, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 200, 0.2F, -33.5F, -8, 1, 1, 2, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 200, -4.2F, -33.5F, -8, 1, 1, 2, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 200, -4.2F, -35.5F, -8, 1, 1, 2, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 200, 0.2F, -35, -10, 1, 2, 1, 0, true));
        grip.cubeList.add(new ModelBox(grip, 0, 200, -4.2F, -35, -10, 1, 2, 1, 0, true));

        grip33_r1 = new ModelRenderer(this);
        grip33_r1.setRotationPoint(0, -18.4458F, 21.0831F);
        grip.addChild(grip33_r1);
        setRotationAngle(grip33_r1, 1.6359F, 0, 0);
        grip33_r1.cubeList.add(new ModelBox(grip33_r1, 0, 0, -3.5F, -20.1F, 1.9F, 4, 5, 4, 0, true));

        grip32_r1 = new ModelRenderer(this);
        grip32_r1.setRotationPoint(0, 1.2989F, -7.4031F);
        grip.addChild(grip32_r1);
        setRotationAngle(grip32_r1, -0.2231F, 0, 0);
        grip32_r1.cubeList.add(new ModelBox(grip32_r1, 0, 0, 0.2F, -32.4F, -9.5F, 1, 1, 1, 0, true));

        grip30_r1 = new ModelRenderer(this);
        grip30_r1.setRotationPoint(0, 2.3901F, -7.6597F);
        grip.addChild(grip30_r1);
        setRotationAngle(grip30_r1, -0.2231F, 0, 0);
        grip30_r1.cubeList.add(new ModelBox(grip30_r1, 0, 0, 0.2F, -33, -14.5F, 1, 1, 1, 0, true));

        grip29_r1 = new ModelRenderer(this);
        grip29_r1.setRotationPoint(0, -8.2325F, 15.9155F);
        grip.addChild(grip29_r1);
        setRotationAngle(grip29_r1, 0.5205F, 0, 0);
        grip29_r1.cubeList.add(new ModelBox(grip29_r1, 0, 0, -4.5F, -33, -6, 6, 1, 1, 0, true));
        grip29_r1.cubeList.add(new ModelBox(grip29_r1, 0, 0, -4.5F, -34, -7.5F, 6, 1, 3, 0, true));

        grip27_r1 = new ModelRenderer(this);
        grip27_r1.setRotationPoint(0, 1.0848F, -15.2179F);
        grip.addChild(grip27_r1);
        setRotationAngle(grip27_r1, -0.4461F, 0, 0);
        grip27_r1.cubeList.add(new ModelBox(grip27_r1, 0, 200, -4.2F, -34, -10, 1, 1, 1, 0, true));
        grip27_r1.cubeList.add(new ModelBox(grip27_r1, 0, 200, 0.2F, -34, -10, 1, 1, 1, 0, true));

        grip25_r1 = new ModelRenderer(this);
        grip25_r1.setRotationPoint(0, -7.7408F, 14.1233F);
        grip.addChild(grip25_r1);
        setRotationAngle(grip25_r1, 0.4461F, 0, 0);
        grip25_r1.cubeList.add(new ModelBox(grip25_r1, 0, 200, -4.2F, -35, -10, 1, 1, 1, 0, true));
        grip25_r1.cubeList.add(new ModelBox(grip25_r1, 0, 200, 0.2F, -35, -10, 1, 1, 1, 0, true));

        grip15_r1 = new ModelRenderer(this);
        grip15_r1.setRotationPoint(0, 1.1636F, -13.3892F);
        grip.addChild(grip15_r1);
        setRotationAngle(grip15_r1, -0.409F, 0, 0);
        grip15_r1.cubeList.add(new ModelBox(grip15_r1, 0, 0, -2, -31.7F, -9.5F, 1, 3, 1, 0, true));

        grip14_r1 = new ModelRenderer(this);
        grip14_r1.setRotationPoint(0, -51.3643F, 5.58F);
        grip.addChild(grip14_r1);
        setRotationAngle(grip14_r1, 2.3794F, 0, 0);
        grip14_r1.cubeList.add(new ModelBox(grip14_r1, 0, 200, -3, -26.8F, -7.5F, 3, 3, 1, 0, true));

        grip13_r1 = new ModelRenderer(this);
        grip13_r1.setRotationPoint(0, -54.0321F, -15.493F);
        grip.addChild(grip13_r1);
        setRotationAngle(grip13_r1, 3.0858F, 0, 0);
        grip13_r1.cubeList.add(new ModelBox(grip13_r1, 0, 200, -3, -26.8F, -9.5F, 3, 1, 6, 0, true));

        grip12_r1 = new ModelRenderer(this);
        grip12_r1.setRotationPoint(0, -18.9712F, 16.0006F);
        grip.addChild(grip12_r1);
        setRotationAngle(grip12_r1, 0.7854F, 0, 0);
        grip12_r1.cubeList.add(new ModelBox(grip12_r1, 0, 200, -3.5F, -28.8F, -14.9F, 4, 2, 1, 0, true));

        grip11_r1 = new ModelRenderer(this);
        grip11_r1.setRotationPoint(0, -17.505F, -45.6685F);
        grip.addChild(grip11_r1);
        setRotationAngle(grip11_r1, -1.5615F, 0, 0);
        grip11_r1.cubeList.add(new ModelBox(grip11_r1, 0, 200, -3.5F, -31.8F, -14, 4, 1, 3, 0, true));

        grip10_r1 = new ModelRenderer(this);
        grip10_r1.setRotationPoint(0, -28.6977F, -48.6066F);
        grip.addChild(grip10_r1);
        setRotationAngle(grip10_r1, -1.8961F, 0, 0);
        grip10_r1.cubeList.add(new ModelBox(grip10_r1, 0, 200, -3.5F, -31.8F, -14, 4, 2, 1, 0, true));

        grip144_r1 = new ModelRenderer(this);
        grip144_r1.setRotationPoint(0, -61.0375F, 2.8759F);
        grip.addChild(grip144_r1);
        setRotationAngle(grip144_r1, 1.5411F, 0, 0);
        grip144_r1.cubeList.add(new ModelBox(grip144_r1, 0, 200, -4, -32, -30, 5, 32, 2, 0, true));

        grip122_r1 = new ModelRenderer(this);
        grip122_r1.setRotationPoint(0, -24.1791F, 14.4252F);
        grip.addChild(grip122_r1);
        setRotationAngle(grip122_r1, 1.673F, 0, 0);
        grip122_r1.cubeList.add(new ModelBox(grip122_r1, 0, 0, -3.5F, -18.6F, -3.7F, 4, 1, 4, 0, true));

        grip111_r1 = new ModelRenderer(this);
        grip111_r1.setRotationPoint(0, -2.3413F, 6.8912F);
        grip.addChild(grip111_r1);
        setRotationAngle(grip111_r1, 0.2602F, 0, 0);
        grip111_r1.cubeList.add(new ModelBox(grip111_r1, 0, 0, -3.5F, -18.5F, -6, 4, 1, 1, 0, true));
        grip111_r1.cubeList.add(new ModelBox(grip111_r1, 0, 0, -3.5F, -27.5F, -5.5F, 4, 10, 5, 0, true));

        grip8_r1 = new ModelRenderer(this);
        grip8_r1.setRotationPoint(0, -19.6431F, 20.2675F);
        grip.addChild(grip8_r1);
        setRotationAngle(grip8_r1, 1.041F, 0, 0);
        grip8_r1.cubeList.add(new ModelBox(grip8_r1, 0, 0, -3.5F, -27.5F, -7, 4, 3, 1, 0, true));

        grip7_r1 = new ModelRenderer(this);
        grip7_r1.setRotationPoint(0, -52.7361F, -18.1296F);
        grip.addChild(grip7_r1);
        setRotationAngle(grip7_r1, -2.3794F, 0, 0);
        grip7_r1.cubeList.add(new ModelBox(grip7_r1, 0, 0, -3.5F, -30, 1.5F, 4, 2, 3, 0, true));

        grip4_r1 = new ModelRenderer(this);
        grip4_r1.setRotationPoint(0, -43.8502F, -12.7042F);
        grip.addChild(grip4_r1);
        setRotationAngle(grip4_r1, -2.4538F, 0, 0);
        grip4_r1.cubeList.add(new ModelBox(grip4_r1, 0, 0, -3.5F, -24.2F, 1.5F, 4, 3, 1, 0, true));

        grip177_r1 = new ModelRenderer(this);
        grip177_r1.setRotationPoint(0, -52.7341F, -61.6295F);
        grip.addChild(grip177_r1);
        setRotationAngle(grip177_r1, -2.5653F, 0, 0);
        grip177_r1.cubeList.add(new ModelBox(grip177_r1, 0, 200, 0.2F, -35.5F, -23, 1, 1, 1, 0, true));

        grip64_r1 = new ModelRenderer(this);
        grip64_r1.setRotationPoint(0, -36.9727F, 33.9686F);
        grip.addChild(grip64_r1);
        setRotationAngle(grip64_r1, 2.1935F, 0, 0);
        grip64_r1.cubeList.add(new ModelBox(grip64_r1, 0, 0, -3.5F, -27.2F, 7.5F, 4, 2, 4, 0, true));

        grip63_r1 = new ModelRenderer(this);
        grip63_r1.setRotationPoint(0, -12.3019F, 28.5528F);
        grip.addChild(grip63_r1);
        setRotationAngle(grip63_r1, 1.3384F, 0, 0);
        grip63_r1.cubeList.add(new ModelBox(grip63_r1, 0, 0, -3.5F, -24.2F, 6.5F, 4, 3, 4, 0, true));

        grip62_r1 = new ModelRenderer(this);
        grip62_r1.setRotationPoint(0, -2.2124F, 15.3632F);
        grip.addChild(grip62_r1);
        setRotationAngle(grip62_r1, 0.6692F, 0, 0);
        grip62_r1.cubeList.add(new ModelBox(grip62_r1, 0, 0, -3.5F, -23.2F, 4.5F, 4, 3, 4, 0, true));

        grip61_r1 = new ModelRenderer(this);
        grip61_r1.setRotationPoint(0, -3.469F, -11.0745F);
        grip.addChild(grip61_r1);
        setRotationAngle(grip61_r1, -0.4833F, 0, 0);
        grip61_r1.cubeList.add(new ModelBox(grip61_r1, 0, 0, -3.5F, -24.2F, 0.5F, 4, 2, 4, 0, true));

        grip60_r1 = new ModelRenderer(this);
        grip60_r1.setRotationPoint(0, -55.6018F, -6.1252F);
        grip.addChild(grip60_r1);
        setRotationAngle(grip60_r1, -1.8961F, 0, 0);
        grip60_r1.cubeList.add(new ModelBox(grip60_r1, 0, 0, -3.5F, -30, 16.9F, 4, 2, 1, 0, true));

        grip59_r1 = new ModelRenderer(this);
        grip59_r1.setRotationPoint(0, -29.6405F, -21.75F);
        grip.addChild(grip59_r1);
        setRotationAngle(grip59_r1, -1.0782F, 0, 0);
        grip59_r1.cubeList.add(new ModelBox(grip59_r1, 0, 0, -3.5F, -33, 13.9F, 4, 2, 4, 0, true));

        grip56_r1 = new ModelRenderer(this);
        grip56_r1.setRotationPoint(0, -44.0154F, 30.9322F);
        grip.addChild(grip56_r1);
        setRotationAngle(grip56_r1, -3.0115F, 0, 0);
        grip56_r1.cubeList.add(new ModelBox(grip56_r1, 0, 0, -3.5F, -21, 16.9F, 4, 2, 9, 0, true));

        grip55_r1 = new ModelRenderer(this);
        grip55_r1.setRotationPoint(0, -12.1094F, 23.4687F);
        grip.addChild(grip55_r1);
        setRotationAngle(grip55_r1, 1.45F, 0, 0);
        grip55_r1.cubeList.add(new ModelBox(grip55_r1, 0, 0, -3.5F, -19.3F, 4.9F, 4, 4, 4, 0, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        grip.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
