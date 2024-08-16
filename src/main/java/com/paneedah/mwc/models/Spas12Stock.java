package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Spas12Stock extends ModelWithAttachments {
    private final ModelRenderer stock;
    private final ModelRenderer stock26_r1;
    private final ModelRenderer stock25_r1;
    private final ModelRenderer stock14_r1;
    private final ModelRenderer stock11_r1;
    private final ModelRenderer stock8_r1;
    private final ModelRenderer stock1_r1;

    public Spas12Stock() {
        textureWidth = 512;
        textureHeight = 256;

        stock = new ModelRenderer(this);
        stock.setRotationPoint(0.0F, 23.9868F, -0.7957F);
        stock.cubeList.add(new ModelBox(stock, 0, 0, -3.3F, -27.9868F, 11.4957F, 1, 1, 5, 0.0F, true));

        stock26_r1 = new ModelRenderer(this);
        stock26_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        stock.addChild(stock26_r1);
        setRotationAngle(stock26_r1, -0.0332F, 0.0F, 0.0F);
        stock26_r1.cubeList.add(new ModelBox(stock26_r1, 0, 0, -3.3F, -33.9F, -3.5F, 1, 1, 2, 0.0F, true));

        stock25_r1 = new ModelRenderer(this);
        stock25_r1.setRotationPoint(0.0F, 0.5742F, -0.371F);
        stock.addChild(stock25_r1);
        setRotationAngle(stock25_r1, -0.0332F, 0.0F, 0.0F);
        stock25_r1.cubeList.add(new ModelBox(stock25_r1, 0, 0, -3.3F, -33.9F, -6.5F, 1, 1, 2, 0.0F, true));
        stock25_r1.cubeList.add(new ModelBox(stock25_r1, 0, 0, -3.3F, -33.9F, -9.5F, 1, 1, 2, 0.0F, true));
        stock25_r1.cubeList.add(new ModelBox(stock25_r1, 0, 0, -3.3F, -33.9F, -12.5F, 1, 1, 2, 0.0F, true));
        stock25_r1.cubeList.add(new ModelBox(stock25_r1, 0, 0, -3.3F, -33.9F, -17.5F, 1, 1, 4, 0.0F, true));
        stock25_r1.cubeList.add(new ModelBox(stock25_r1, 0, 0, 0.3F, -33.9F, -3.5F, 1, 1, 2, 0.0F, true));
        stock25_r1.cubeList.add(new ModelBox(stock25_r1, 0, 0, 0.3F, -33.9F, -6.5F, 1, 1, 2, 0.0F, true));
        stock25_r1.cubeList.add(new ModelBox(stock25_r1, 0, 0, 0.3F, -33.9F, -9.5F, 1, 1, 2, 0.0F, true));
        stock25_r1.cubeList.add(new ModelBox(stock25_r1, 0, 0, 0.3F, -33.9F, -12.5F, 1, 1, 2, 0.0F, true));
        stock25_r1.cubeList.add(new ModelBox(stock25_r1, 0, 0, 0.3F, -33.9F, -17.5F, 1, 1, 4, 0.0F, true));
        stock25_r1.cubeList.add(new ModelBox(stock25_r1, 0, 0, -3.3F, -32.9F, -17.5F, 1, 1, 16, 0.0F, true));
        stock25_r1.cubeList.add(new ModelBox(stock25_r1, 0, 0, 0.3F, -32.9F, -17.5F, 1, 1, 16, 0.0F, true));
        stock25_r1.cubeList.add(new ModelBox(stock25_r1, 0, 0, 0.3F, -34.9F, -17.5F, 1, 1, 16, 0.0F, true));
        stock25_r1.cubeList.add(new ModelBox(stock25_r1, 0, 0, -3.3F, -34.9F, -17.5F, 1, 1, 16, 0.0F, true));

        stock14_r1 = new ModelRenderer(this);
        stock14_r1.setRotationPoint(0.0F, -15.7844F, -50.7536F);
        stock.addChild(stock14_r1);
        setRotationAngle(stock14_r1, -1.5243F, 0.0F, 0.0F);
        stock14_r1.cubeList.add(new ModelBox(stock14_r1, 0, 0, -2.5F, -29.9F, -17.5F, 3, 3, 3, 0.0F, true));
        stock14_r1.cubeList.add(new ModelBox(stock14_r1, 0, 0, -3.5F, -34.9F, -17.5F, 1, 8, 3, 0.0F, true));
        stock14_r1.cubeList.add(new ModelBox(stock14_r1, 0, 0, 0.5F, -34.9F, -17.5F, 1, 8, 3, 0.0F, true));

        stock11_r1 = new ModelRenderer(this);
        stock11_r1.setRotationPoint(0.0F, 4.1368F, -17.4741F);
        stock.addChild(stock11_r1);
        setRotationAngle(stock11_r1, -0.4833F, 0.0F, 0.0F);
        stock11_r1.cubeList.add(new ModelBox(stock11_r1, 0, 0, -3.0F, -35.0F, -17.5F, 4, 2, 2, 0.0F, true));

        stock8_r1 = new ModelRenderer(this);
        stock8_r1.setRotationPoint(0.0F, -49.3244F, 30.0571F);
        stock.addChild(stock8_r1);
        setRotationAngle(stock8_r1, 2.8256F, 0.0F, 0.0F);
        stock8_r1.cubeList.add(new ModelBox(stock8_r1, 0, 0, 0.4F, -26.7F, 10.7F, 1, 1, 14, 0.0F, true));
        stock8_r1.cubeList.add(new ModelBox(stock8_r1, 0, 0, -3.4F, -26.7F, 10.7F, 1, 1, 14, 0.0F, true));
        stock8_r1.cubeList.add(new ModelBox(stock8_r1, 0, 0, 0.3F, -27.0F, 10.7F, 1, 3, 14, 0.0F, true));
        stock8_r1.cubeList.add(new ModelBox(stock8_r1, 0, 0, 0.3F, -25.0F, 6.7F, 1, 1, 4, 0.0F, true));
        stock8_r1.cubeList.add(new ModelBox(stock8_r1, 0, 0, -3.3F, -25.0F, 6.7F, 1, 1, 4, 0.0F, true));
        stock8_r1.cubeList.add(new ModelBox(stock8_r1, 0, 0, -3.3F, -27.0F, 10.7F, 1, 3, 14, 0.0F, true));

        stock1_r1 = new ModelRenderer(this);
        stock1_r1.setRotationPoint(0.0F, -4.2516F, -6.3934F);
        stock.addChild(stock1_r1);
        setRotationAngle(stock1_r1, -0.2602F, 0.0F, 0.0F);
        stock1_r1.cubeList.add(new ModelBox(stock1_r1, 0, 0, -3.5F, -29.6F, 12.7F, 5, 2, 2, 0.0F, true));
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
