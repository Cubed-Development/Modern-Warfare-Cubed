package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HKS20Stock extends ModelWithAttachments {
    private final ModelRenderer stock;
    private final ModelRenderer stock25_r1;
    private final ModelRenderer stock23_r1;
    private final ModelRenderer stock19_r1;
    private final ModelRenderer stock16_r1;
    private final ModelRenderer stock15_r1;
    private final ModelRenderer stock11_r1;
    private final ModelRenderer stock9_r1;
    private final ModelRenderer stock7_r1;
    private final ModelRenderer stock5_r1;

    public HKS20Stock() {
        textureWidth = 512;
        textureHeight = 256;

        stock = new ModelRenderer(this);
        stock.setRotationPoint(0, 11.8608F, -28.5004F);
        stock.cubeList.add(new ModelBox(stock, 0, 0, -2.5F, -24.3608F, 30.5004F, 2, 5, 33, 0, true));
        stock.cubeList.add(new ModelBox(stock, 0, 0, -3, -24.8608F, 29.5004F, 3, 1, 34, 0, true));
        stock.cubeList.add(new ModelBox(stock, 0, 0, -3, -19.8608F, 42.5004F, 3, 1, 21, 0, true));
        stock.cubeList.add(new ModelBox(stock, 0, 0, -3, -23.8608F, 46.5004F, 3, 4, 14, 0, true));
        stock.cubeList.add(new ModelBox(stock, 0, 0, -2.5F, -18.8608F, 52.5004F, 2, 1, 11, 0, true));
        stock.cubeList.add(new ModelBox(stock, 0, 0, -2.5F, -17.8608F, 62.5004F, 2, 8, 2, 0, true));
        stock.cubeList.add(new ModelBox(stock, 0, 0, -3.5F, -24.8608F, 63.5004F, 4, 7, 3, 0, true));
        stock.cubeList.add(new ModelBox(stock, 0, 0, -3.5F, -18.3608F, 64.5004F, 4, 11, 2, 0, true));
        stock.cubeList.add(new ModelBox(stock, 0, 0, -3, -25.3608F, 63.5004F, 3, 1, 3, 0, true));
        stock.cubeList.add(new ModelBox(stock, 0, 0, -3, -25.3608F, 44.5004F, 3, 1, 18, 0, true));
        stock.cubeList.add(new ModelBox(stock, 0, 0, -2.5F, -25.8608F, 44.5004F, 2, 1, 18, 0, true));
        stock.cubeList.add(new ModelBox(stock, 0, 0, -2.5F, -25.1608F, 29.5004F, 2, 1, 34, 0, true));
        stock.cubeList.add(new ModelBox(stock, 0, 0, -3.3F, -24.8608F, 66.5004F, 3, 17, 3, 0, true));
        stock.cubeList.add(new ModelBox(stock, 0, 0, -0.7F, -24.8608F, 66.5004F, 1, 17, 3, 0, true));
        stock.cubeList.add(new ModelBox(stock, 0, 0, -2.5F, -28.5608F, 27.0004F, 2, 2, 2, 0, true));

        stock25_r1 = new ModelRenderer(this);
        stock25_r1.setRotationPoint(0, 0, 0);
        stock.addChild(stock25_r1);
        setRotationAngle(stock25_r1, -0.7808F, 0, 0);
        stock25_r1.cubeList.add(new ModelBox(stock25_r1, 0, 0, -2.5F, -40.7F, 0.5F, 2, 1, 2, 0, true));

        stock23_r1 = new ModelRenderer(this);
        stock23_r1.setRotationPoint(0, -53.8678F, 7.0536F);
        stock.addChild(stock23_r1);
        setRotationAngle(stock23_r1, -2.3794F, 0, 0);
        stock23_r1.cubeList.add(new ModelBox(stock23_r1, 0, 0, -2.5F, -37.3F, 2.5F, 2, 3, 1, 0, true));

        stock19_r1 = new ModelRenderer(this);
        stock19_r1.setRotationPoint(0, -14.4668F, 4.8749F);
        stock.addChild(stock19_r1);
        setRotationAngle(stock19_r1, -0.8923F, 0, 0);
        stock19_r1.cubeList.add(new ModelBox(stock19_r1, 0, 0, -2.5F, -38, 16, 2, 2, 1, 0, true));

        stock16_r1 = new ModelRenderer(this);
        stock16_r1.setRotationPoint(0, 9.3915F, 92.1096F);
        stock.addChild(stock16_r1);
        setRotationAngle(stock16_r1, 2.082F, 0, 0);
        stock16_r1.cubeList.add(new ModelBox(stock16_r1, 0, 0, -2.51F, -16, 31, 2, 4, 10, 0, true));
        stock16_r1.cubeList.add(new ModelBox(stock16_r1, 0, 0, -2.5F, -20, 31, 2, 2, 12, 0, true));

        stock15_r1 = new ModelRenderer(this);
        stock15_r1.setRotationPoint(0, 27.0216F, 52.9851F);
        stock.addChild(stock15_r1);
        setRotationAngle(stock15_r1, 0.632F, 0, 0);
        stock15_r1.cubeList.add(new ModelBox(stock15_r1, 0, 0, -3.5F, -30, 35, 4, 2, 1, 0, true));

        stock11_r1 = new ModelRenderer(this);
        stock11_r1.setRotationPoint(0, -9.4371F, 15.0733F);
        stock.addChild(stock11_r1);
        setRotationAngle(stock11_r1, -0.5205F, 0, 0);
        stock11_r1.cubeList.add(new ModelBox(stock11_r1, 0, 0, -3, -36, 31.8F, 3, 4, 2, 0, true));

        stock9_r1 = new ModelRenderer(this);
        stock9_r1.setRotationPoint(0, -22.1034F, 90.6841F);
        stock.addChild(stock9_r1);
        setRotationAngle(stock9_r1, 2.3562F, 0, 0);
        stock9_r1.cubeList.add(new ModelBox(stock9_r1, 0, 0, -2.5F, -30, 24, 2, 1, 2, 0, true));

        stock7_r1 = new ModelRenderer(this);
        stock7_r1.setRotationPoint(0, 24.7019F, 76.8402F);
        stock.addChild(stock7_r1);
        setRotationAngle(stock7_r1, 1.4871F, 0, 0);
        stock7_r1.cubeList.add(new ModelBox(stock7_r1, 0, 0, -2.5F, -20, 31, 2, 5, 3, 0, true));

        stock5_r1 = new ModelRenderer(this);
        stock5_r1.setRotationPoint(0, 15.4283F, 48.5491F);
        stock.addChild(stock5_r1);
        setRotationAngle(stock5_r1, 0.5205F, 0, 0);
        stock5_r1.cubeList.add(new ModelBox(stock5_r1, 0, 0, -3, -36, 16.2F, 3, 4, 2, 0, true));
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
