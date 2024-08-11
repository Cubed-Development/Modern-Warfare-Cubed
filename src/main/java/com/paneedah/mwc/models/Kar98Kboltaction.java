package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Kar98Kboltaction extends ModelBase {
    private final ModelRenderer boltaction;
    private final ModelRenderer action36_r1;
    private final ModelRenderer action32_r1;
    private final ModelRenderer action29_r1;
    private final ModelRenderer action27_r1;
    private final ModelRenderer action22_r1;
    private final ModelRenderer action19_r1;
    private final ModelRenderer action17_r1;
    private final ModelRenderer action14_r1;
    private final ModelRenderer action10_r1;
    private final ModelRenderer action9_r1;
    private final ModelRenderer action8_r1;
    private final ModelRenderer action7_r1;
    private final ModelRenderer action6_r1;
    private final ModelRenderer action5_r1;
    private final ModelRenderer action4_r1;
    private final ModelRenderer action3_r1;

    public Kar98Kboltaction() {
        textureWidth = 512;
        textureHeight = 256;

        boltaction = new ModelRenderer(this);
        boltaction.setRotationPoint(0.0F, 24.0F, 0.0F);
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -2.7F, -39.6F, -12.8F, 1, 1, 4, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -2.5F, -40.7F, -31.5F, 1, 3, 14, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -3.5F, -39.7F, -31.5F, 3, 1, 16, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -3.0F, -40.65F, -17.5F, 2, 1, 3, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -3.4F, -39.7F, -15.5F, 1, 1, 4, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -1.6F, -39.7F, -15.5F, 1, 1, 2, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -2.4F, -40.9F, -17.0F, 1, 1, 4, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -1.8F, -40.8F, -14.0F, 2, 1, 2, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -5.3F, -39.5F, -16.5F, 3, 1, 1, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -2.5F, -41.0F, -17.0F, 1, 1, 4, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -2.5F, -40.8F, -13.5F, 1, 1, 1, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -2.6F, -40.9F, -17.0F, 1, 1, 4, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -2.5F, -40.8F, -13.0F, 1, 1, 1, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -2.5F, -39.1F, -13.5F, 1, 1, 2, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -1.2F, -39.6F, -17.6F, 1, 1, 6, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -2.5F, -39.8F, -12.8F, 1, 1, 4, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -2.5F, -39.4F, -12.8F, 1, 1, 4, 0.0F, true));
        boltaction.cubeList.add(new ModelBox(boltaction, 200, 0, -2.3F, -39.6F, -12.8F, 1, 1, 4, 0.0F, true));

        action36_r1 = new ModelRenderer(this);
        action36_r1.setRotationPoint(-7.9974F, 0.6051F, 0.0F);
        boltaction.addChild(action36_r1);
        setRotationAngle(action36_r1, 0.0F, 0.0F, 0.2231F);
        action36_r1.cubeList.add(new ModelBox(action36_r1, 200, 0, -6.7F, -35.4F, -17.0F, 2, 2, 2, 0.0F, true));

        action32_r1 = new ModelRenderer(this);
        action32_r1.setRotationPoint(32.6126F, -22.707F, 0.0F);
        boltaction.addChild(action32_r1);
        setRotationAngle(action32_r1, 0.0F, 0.0F, -1.041F);
        action32_r1.cubeList.add(new ModelBox(action32_r1, 200, 0, -3.5F, -39.8F, -17.5F, 1, 1, 2, 0.0F, true));

        action29_r1 = new ModelRenderer(this);
        action29_r1.setRotationPoint(12.8489F, -3.3183F, 0.0F);
        boltaction.addChild(action29_r1);
        setRotationAngle(action29_r1, 0.0F, 0.0F, -0.3346F);
        action29_r1.cubeList.add(new ModelBox(action29_r1, 200, 0, -3.4F, -39.7F, -15.5F, 1, 1, 4, 0.0F, true));

        action27_r1 = new ModelRenderer(this);
        action27_r1.setRotationPoint(-21.3606F, -73.6987F, 0.0F);
        boltaction.addChild(action27_r1);
        setRotationAngle(action27_r1, 0.0F, 0.0F, 2.6025F);
        action27_r1.cubeList.add(new ModelBox(action27_r1, 200, 0, -0.5F, -39.8F, -17.5F, 1, 1, 3, 0.0F, true));

        action22_r1 = new ModelRenderer(this);
        action22_r1.setRotationPoint(32.8508F, -24.731F, 0.0F);
        boltaction.addChild(action22_r1);
        setRotationAngle(action22_r1, 0.0F, 0.0F, -1.1154F);
        action22_r1.cubeList.add(new ModelBox(action22_r1, 200, 0, -3.4F, -38.7F, -15.5F, 1, 1, 4, 0.0F, true));

        action19_r1 = new ModelRenderer(this);
        action19_r1.setRotationPoint(-8.8698F, 0.1938F, 0.0F);
        boltaction.addChild(action19_r1);
        setRotationAngle(action19_r1, 0.0F, 0.0F, 0.2231F);
        action19_r1.cubeList.add(new ModelBox(action19_r1, 200, 0, -5.3F, -39.5F, -16.5F, 1, 5, 1, 0.0F, true));

        action17_r1 = new ModelRenderer(this);
        action17_r1.setRotationPoint(-37.8394F, -53.0814F, 0.0F);
        boltaction.addChild(action17_r1);
        setRotationAngle(action17_r1, 0.0F, 0.0F, 1.9333F);
        action17_r1.cubeList.add(new ModelBox(action17_r1, 200, 0, -0.6F, -39.6F, -17.6F, 1, 1, 6, 0.0F, true));

        action14_r1 = new ModelRenderer(this);
        action14_r1.setRotationPoint(-13.1666F, -75.1021F, 0.0F);
        boltaction.addChild(action14_r1);
        setRotationAngle(action14_r1, 0.0F, 0.0F, 2.8256F);
        action14_r1.cubeList.add(new ModelBox(action14_r1, 200, 0, -0.6F, -38.6F, -17.6F, 2, 1, 6, 0.0F, true));

        action10_r1 = new ModelRenderer(this);
        action10_r1.setRotationPoint(24.168F, -65.5893F, 0.0F);
        boltaction.addChild(action10_r1);
        setRotationAngle(action10_r1, 0.0F, 0.0F, -2.3562F);
        action10_r1.cubeList.add(new ModelBox(action10_r1, 200, 0, -1.5F, -37.8F, -31.5F, 1, 1, 16, 0.0F, true));

        action9_r1 = new ModelRenderer(this);
        action9_r1.setRotationPoint(22.4609F, -66.2964F, 0.0F);
        boltaction.addChild(action9_r1);
        setRotationAngle(action9_r1, 0.0F, 0.0F, -2.3562F);
        action9_r1.cubeList.add(new ModelBox(action9_r1, 200, 0, -2.5F, -37.8F, -31.5F, 1, 1, 16, 0.0F, true));

        action8_r1 = new ModelRenderer(this);
        action8_r1.setRotationPoint(-28.2186F, -65.7115F, 0.0F);
        boltaction.addChild(action8_r1);
        setRotationAngle(action8_r1, 0.0F, 0.0F, 2.3562F);
        action8_r1.cubeList.add(new ModelBox(action8_r1, 200, 0, -0.5F, -38.7F, -31.5F, 1, 1, 16, 0.0F, true));

        action7_r1 = new ModelRenderer(this);
        action7_r1.setRotationPoint(-28.9257F, -67.4186F, 0.0F);
        boltaction.addChild(action7_r1);
        setRotationAngle(action7_r1, 0.0F, 0.0F, 2.3562F);
        action7_r1.cubeList.add(new ModelBox(action7_r1, 200, 0, -0.5F, -39.7F, -31.5F, 1, 1, 14, 0.0F, true));

        action6_r1 = new ModelRenderer(this);
        action6_r1.setRotationPoint(26.4106F, -13.8391F, 0.0F);
        boltaction.addChild(action6_r1);
        setRotationAngle(action6_r1, 0.0F, 0.0F, -0.7854F);
        action6_r1.cubeList.add(new ModelBox(action6_r1, 200, 0, -3.5F, -38.8F, -31.5F, 1, 1, 16, 0.0F, true));

        action5_r1 = new ModelRenderer(this);
        action5_r1.setRotationPoint(27.047F, -14.1027F, 0.0F);
        boltaction.addChild(action5_r1);
        setRotationAngle(action5_r1, 0.0F, 0.0F, -0.7854F);
        action5_r1.cubeList.add(new ModelBox(action5_r1, 200, 0, -3.5F, -39.7F, -31.5F, 1, 1, 14, 0.0F, true));

        action4_r1 = new ModelRenderer(this);
        action4_r1.setRotationPoint(-29.5115F, -10.153F, 0.0F);
        boltaction.addChild(action4_r1);
        setRotationAngle(action4_r1, 0.0F, 0.0F, 0.7854F);
        action4_r1.cubeList.add(new ModelBox(action4_r1, 200, 0, -2.5F, -40.7F, -31.5F, 1, 1, 14, 0.0F, true));

        action3_r1 = new ModelRenderer(this);
        action3_r1.setRotationPoint(-29.2186F, -10.8601F, 0.0F);
        boltaction.addChild(action3_r1);
        setRotationAngle(action3_r1, 0.0F, 0.0F, 0.7854F);
        action3_r1.cubeList.add(new ModelBox(action3_r1, 200, 0, -1.5F, -40.7F, -31.5F, 1, 1, 14, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        boltaction.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
