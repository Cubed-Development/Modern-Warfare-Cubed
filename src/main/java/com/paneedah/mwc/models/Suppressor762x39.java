package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Suppressor762x39 extends ModelBase {
    private final ModelRenderer suppressor;
    private final ModelRenderer gun21_r1;
    private final ModelRenderer gun20_r1;
    private final ModelRenderer gun19_r1;
    private final ModelRenderer gun18_r1;
    private final ModelRenderer gun17_r1;
    private final ModelRenderer gun16_r1;
    private final ModelRenderer gun15_r1;
    private final ModelRenderer gun14_r1;
    private final ModelRenderer gun13_r1;
    private final ModelRenderer gun9_r1;
    private final ModelRenderer gun8_r1;
    private final ModelRenderer gun7_r1;

    public Suppressor762x39() {
        textureWidth = 256;
        textureHeight = 128;

        suppressor = new ModelRenderer(this);
        suppressor.setRotationPoint(0.0F, 24.0F, 0.0F);
        suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 0.0F, -24.0F, -2.0F, 2, 3, 22, 0.0F, true));
        suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 0.0F, -21.0F, -2.0F, 2, 1, 22, 0.0F, true));
        suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 0.5F, -24.1F, 13.0F, 1, 3, 6, 0.0F, true));
        suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 0.5F, -20.9F, 13.0F, 1, 1, 6, 0.0F, true));

        gun21_r1 = new ModelRenderer(this);
        gun21_r1.setRotationPoint(15.3893F, -33.4626F, 0.0F);
        suppressor.addChild(gun21_r1);
        setRotationAngle(gun21_r1, 0.0F, 0.0F, -2.2307F);
        gun21_r1.cubeList.add(new ModelBox(gun21_r1, 0, 0, -0.5F, -20.5F, 13.0F, 1, 1, 6, 0.0F, true));

        gun20_r1 = new ModelRenderer(this);
        gun20_r1.setRotationPoint(15.5828F, -36.3815F, 0.0F);
        suppressor.addChild(gun20_r1);
        setRotationAngle(gun20_r1, 0.0F, 0.0F, -2.5653F);
        gun20_r1.cubeList.add(new ModelBox(gun20_r1, 0, 0, 2.4F, -20.5F, 13.0F, 1, 1, 6, 0.0F, true));

        gun19_r1 = new ModelRenderer(this);
        gun19_r1.setRotationPoint(-18.3858F, -12.1688F, 0.0F);
        suppressor.addChild(gun19_r1);
        setRotationAngle(gun19_r1, 0.0F, 0.0F, 0.9666F);
        gun19_r1.cubeList.add(new ModelBox(gun19_r1, 0, 0, 2.4F, -23.6F, 13.0F, 1, 2, 6, 0.0F, true));

        gun18_r1 = new ModelRenderer(this);
        gun18_r1.setRotationPoint(-14.0199F, -4.3226F, 0.0F);
        suppressor.addChild(gun18_r1);
        setRotationAngle(gun18_r1, 0.0F, 0.0F, 0.632F);
        gun18_r1.cubeList.add(new ModelBox(gun18_r1, 0, 0, -0.4F, -23.6F, 13.0F, 2, 1, 6, 0.0F, true));

        gun17_r1 = new ModelRenderer(this);
        gun17_r1.setRotationPoint(15.3794F, -34.6675F, 0.0F);
        suppressor.addChild(gun17_r1);
        setRotationAngle(gun17_r1, 0.0F, 0.0F, -2.2307F);
        gun17_r1.cubeList.add(new ModelBox(gun17_r1, 0, 0, -0.8F, -21.1F, -2.0F, 1, 1, 22, 0.0F, true));

        gun16_r1 = new ModelRenderer(this);
        gun16_r1.setRotationPoint(-13.6342F, -3.9022F, 0.0F);
        suppressor.addChild(gun16_r1);
        setRotationAngle(gun16_r1, 0.0F, 0.0F, 0.632F);
        gun16_r1.cubeList.add(new ModelBox(gun16_r1, 0, 0, -0.85F, -22.8F, -2.0F, 1, 1, 22, 0.0F, true));

        gun15_r1 = new ModelRenderer(this);
        gun15_r1.setRotationPoint(16.5532F, -37.2939F, 0.0F);
        suppressor.addChild(gun15_r1);
        setRotationAngle(gun15_r1, 0.0F, 0.0F, -2.5653F);
        gun15_r1.cubeList.add(new ModelBox(gun15_r1, 0, 0, 2.75F, -21.1F, -2.0F, 1, 1, 22, 0.0F, true));

        gun14_r1 = new ModelRenderer(this);
        gun14_r1.setRotationPoint(-17.6174F, -12.1329F, 0.0F);
        suppressor.addChild(gun14_r1);
        setRotationAngle(gun14_r1, 0.0F, 0.0F, 0.9666F);
        gun14_r1.cubeList.add(new ModelBox(gun14_r1, 0, 0, 2.75F, -22.85F, -2.0F, 1, 1, 22, 0.0F, true));

        gun13_r1 = new ModelRenderer(this);
        gun13_r1.setRotationPoint(-14.1789F, -4.6362F, 0.0F);
        suppressor.addChild(gun13_r1);
        setRotationAngle(gun13_r1, 0.0F, 0.0F, 0.632F);
        gun13_r1.cubeList.add(new ModelBox(gun13_r1, 0, 0, 0.0F, -24.0F, -2.0F, 2, 2, 22, 0.0F, true));

        gun9_r1 = new ModelRenderer(this);
        gun9_r1.setRotationPoint(15.8008F, -32.2611F, 0.0F);
        suppressor.addChild(gun9_r1);
        setRotationAngle(gun9_r1, 0.0F, 0.0F, -2.2307F);
        gun9_r1.cubeList.add(new ModelBox(gun9_r1, 0, 0, 0.0F, -20.0F, -2.0F, 2, 1, 22, 0.0F, true));

        gun8_r1 = new ModelRenderer(this);
        gun8_r1.setRotationPoint(14.575F, -35.6802F, 0.0F);
        suppressor.addChild(gun8_r1);
        setRotationAngle(gun8_r1, 0.0F, 0.0F, -2.5653F);
        gun8_r1.cubeList.add(new ModelBox(gun8_r1, 0, 0, 2.0F, -20.0F, -2.0F, 1, 2, 22, 0.0F, true));

        gun7_r1 = new ModelRenderer(this);
        gun7_r1.setRotationPoint(-18.8877F, -12.0124F, 0.0F);
        suppressor.addChild(gun7_r1);
        setRotationAngle(gun7_r1, 0.0F, 0.0F, 0.9666F);
        gun7_r1.cubeList.add(new ModelBox(gun7_r1, 0, 0, 2.0F, -24.0F, -2.0F, 2, 2, 22, 0.0F, true));
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
