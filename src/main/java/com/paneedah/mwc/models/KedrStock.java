package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KedrStock extends ModelBase {
    private final ModelRenderer stock;
    private final ModelRenderer gun78_r1_r1;
    private final ModelRenderer gun80_r2_r1;
    private final ModelRenderer gun79_r2_r1;
    private final ModelRenderer gun84_r1_r1;
    private final ModelRenderer gun86_r2_r1;
    private final ModelRenderer gun79_r1_r1;
    private final ModelRenderer gun80_r1_r1;

    public KedrStock() {
        textureWidth = 180;
        textureHeight = 180;

        stock = new ModelRenderer(this);
        stock.setRotationPoint(-1.5F, -12.5F, 5.7F);
        setRotationAngle(stock, 2.9147F, 0.0F, 0.0F);
        stock.cubeList.add(new ModelBox(stock, 0, 0, -2.2F, -2.3F, -33.9F, 1, 1, 34, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 24, 53, -2.2F, -2.3F, -35.9F, 1, 1, 3, 0.1F, false));
        stock.cubeList.add(new ModelBox(stock, 46, 0, 1.2F, -2.3F, -35.9F, 1, 1, 3, 0.1F, false));
        stock.cubeList.add(new ModelBox(stock, 16, 46, -2.2F, -1.3F, -33.9F, 1, 8, 1, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 36, 21, 1.2F, -1.3F, -33.9F, 1, 8, 1, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 0, 103, -1.7F, -2.55F, -31.9F, 1, 1, 30, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 36, 101, 0.7F, -2.55F, -31.9F, 1, 1, 30, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 70, 34, -1.0F, -2.45F, -31.901F, 2, 1, 30, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 0, 35, 1.2F, -2.3F, -33.9F, 1, 1, 34, 0.0F, false));

        gun78_r1_r1 = new ModelRenderer(this);
        gun78_r1_r1.setRotationPoint(1.5F, 3.1609F, -37.5444F);
        stock.addChild(gun78_r1_r1);
        setRotationAngle(gun78_r1_r1, -1.2915F, 0.0F, 0.0F);
        gun78_r1_r1.cubeList.add(new ModelBox(gun78_r1_r1, 58, 51, -0.299F, -37.8F, 5.2F, 1, 1, 3, 0.0F, false));
        gun78_r1_r1.cubeList.add(new ModelBox(gun78_r1_r1, 36, 63, -3.7F, -37.8F, 5.2F, 1, 1, 3, 0.0F, false));

        gun80_r2_r1 = new ModelRenderer(this);
        gun80_r2_r1.setRotationPoint(1.5F, 33.3371F, -15.601F);
        stock.addChild(gun80_r2_r1);
        setRotationAngle(gun80_r2_r1, -0.2793F, 0.0F, 0.0F);
        gun80_r2_r1.cubeList.add(new ModelBox(gun80_r2_r1, 54, 17, -0.101F, -36.8F, 5.3F, 1, 1, 1, -0.1F, false));
        gun80_r2_r1.cubeList.add(new ModelBox(gun80_r2_r1, 17, 59, -3.901F, -36.8F, 5.3F, 1, 1, 1, -0.1F, false));

        gun79_r2_r1 = new ModelRenderer(this);
        gun79_r2_r1.setRotationPoint(1.5F, -5.3121F, -37.7624F);
        stock.addChild(gun79_r2_r1);
        setRotationAngle(gun79_r2_r1, -1.5184F, 0.0F, 0.0F);
        gun79_r2_r1.cubeList.add(new ModelBox(gun79_r2_r1, 58, 55, -0.301F, -37.8F, 5.0F, 1, 1, 3, 0.0F, false));
        gun79_r2_r1.cubeList.add(new ModelBox(gun79_r2_r1, 59, 21, -3.701F, -37.8F, 5.0F, 1, 1, 3, 0.0F, false));

        gun84_r1_r1 = new ModelRenderer(this);
        gun84_r1_r1.setRotationPoint(1.5F, 27.3732F, 3.025F);
        stock.addChild(gun84_r1_r1);
        setRotationAngle(gun84_r1_r1, 0.2618F, 0.0F, 0.0F);
        gun84_r1_r1.cubeList.add(new ModelBox(gun84_r1_r1, 40, 21, -0.199F, -37.7F, -30.3F, 1, 8, 1, 0.0F, false));
        gun84_r1_r1.cubeList.add(new ModelBox(gun84_r1_r1, 12, 46, -3.801F, -37.7F, -30.3F, 1, 8, 1, 0.0F, false));

        gun86_r2_r1 = new ModelRenderer(this);
        gun86_r2_r1.setRotationPoint(1.5F, 27.5026F, 3.0421F);
        stock.addChild(gun86_r2_r1);
        setRotationAngle(gun86_r2_r1, 0.2618F, 0.0F, 0.0F);
        gun86_r2_r1.cubeList.add(new ModelBox(gun86_r2_r1, 7, 16, -0.299F, -38.3F, -28.8F, 1, 3, 1, 0.0F, false));
        gun86_r2_r1.cubeList.add(new ModelBox(gun86_r2_r1, 17, 0, -3.701F, -38.3F, -28.8F, 1, 3, 1, 0.0F, false));
        gun86_r2_r1.cubeList.add(new ModelBox(gun86_r2_r1, 24, 46, -0.299F, -37.7F, -29.8F, 1, 5, 1, 0.0F, false));
        gun86_r2_r1.cubeList.add(new ModelBox(gun86_r2_r1, 28, 59, -3.701F, -37.7F, -29.8F, 1, 5, 1, 0.0F, false));

        gun79_r1_r1 = new ModelRenderer(this);
        gun79_r1_r1.setRotationPoint(-17.2077F, 33.4313F, -5.7F);
        stock.addChild(gun79_r1_r1);
        setRotationAngle(gun79_r1_r1, 0.0F, 0.0F, 0.4887F);
        gun79_r1_r1.cubeList.add(new ModelBox(gun79_r1_r1, 74, 96, -3.2F, -39.05F, -26.201F, 1, 1, 30, 0.0F, false));

        gun80_r1_r1 = new ModelRenderer(this);
        gun80_r1_r1.setRotationPoint(19.8565F, 32.0229F, -5.7F);
        stock.addChild(gun80_r1_r1);
        setRotationAngle(gun80_r1_r1, 0.0F, 0.0F, -0.4887F);
        gun80_r1_r1.cubeList.add(new ModelBox(gun80_r1_r1, 72, 65, -0.8F, -39.05F, -26.201F, 1, 1, 30, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        stock.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
