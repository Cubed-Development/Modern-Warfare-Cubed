package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ARPRSPrecisionStock extends ModelBase {
    private final ModelRenderer stock;
    private final ModelRenderer bone43;
    private final ModelRenderer bone41;
    private final ModelRenderer bone39;
    private final ModelRenderer bone44;
    private final ModelRenderer bone46;
    private final ModelRenderer bone47;
    private final ModelRenderer bone48;
    private final ModelRenderer bone42;
    private final ModelRenderer bone51;
    private final ModelRenderer bone50;
    private final ModelRenderer bone49;

    public ARPRSPrecisionStock() {
        textureWidth = 256;
        textureHeight = 256;

        stock = new ModelRenderer(this);
        stock.setRotationPoint(-1.5F, -14.25F, 3.0F);
        stock.cubeList.add(new ModelBox(stock, 0, 41, -1.0F, -0.75F, 0.0F, 2, 1, 39, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 63, 63, -2.0F, 2.25F, 33.9F, 4, 15, 2, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 0, 7, -2.0F, 8.25F, 31.75F, 4, 6, 1, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 84, 42, -1.5F, 2.25F, 2.0F, 3, 3, 37, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 19, 0, -1.0F, 2.25F, 0.0F, 2, 3, 2, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 48, 123, -1.5F, 13.25F, 19.0F, 3, 3, 20, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 0, 121, -1.5F, 5.25F, 18.0F, 3, 5, 21, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 17, 41, -1.5F, 10.25F, 31.0F, 3, 3, 8, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 47, 16, -0.5F, 10.25F, 19.9F, 1, 3, 12, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 0, 32, -2.0F, 10.5F, 20.4F, 4, 2, 5, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 0, 0, -2.0F, 5.75F, 28.4F, 4, 5, 2, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 19, 5, -1.5F, 10.25F, 18.9F, 3, 3, 1, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 0, 0, -2.0F, 0.25F, 0.0F, 4, 2, 39, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 0, 16, -1.0F, -3.0F, 15.0F, 2, 1, 15, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 47, 0, 1.4F, -1.6F, 15.0F, 1, 1, 15, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 23, 62, 1.4F, -0.6F, 19.0F, 1, 8, 7, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 60, 42, -2.4F, -0.6F, 19.0F, 1, 8, 7, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 43, 43, -2.4F, -1.6F, 15.0F, 1, 1, 15, 0.0F, false));

        bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(1.0F, -0.75F, 0.0F);
        stock.addChild(bone43);
        setRotationAngle(bone43, 0.0F, 0.0F, -0.7854F);
        bone43.cubeList.add(new ModelBox(bone43, 41, 83, -1.0F, 0.0F, 0.0F, 1, 1, 39, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 43, 43, -1.0F, 0.4F, 0.0F, 1, 1, 39, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 0, 81, -2.4142F, -1.4142F, 0.0F, 1, 1, 39, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 47, 2, -2.8F, -1.4142F, 0.0F, 1, 1, 39, 0.0F, false));

        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(-0.5F, 16.25F, 19.0F);
        stock.addChild(bone41);
        setRotationAngle(bone41, 1.4835F, 0.0F, 0.0F);
        bone41.cubeList.add(new ModelBox(bone41, 0, 58, -1.01F, 0.0F, 0.0F, 3, 20, 2, 0.0F, false));

        bone39 = new ModelRenderer(this);
        bone39.setRotationPoint(0.5F, 14.25F, 19.0F);
        stock.addChild(bone39);
        setRotationAngle(bone39, 0.5411F, 0.0F, 0.0F);
        bone39.cubeList.add(new ModelBox(bone39, 61, 16, -2.001F, -11.0F, 0.0F, 3, 7, 5, 0.0F, false));
        bone39.cubeList.add(new ModelBox(bone39, 18, 32, -2.001F, -4.0F, 0.0F, 3, 5, 2, 0.0F, false));

        bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(-2.0F, 2.25F, 0.0F);
        stock.addChild(bone44);
        setRotationAngle(bone44, 0.0F, 0.0F, -0.2269F);
        bone44.cubeList.add(new ModelBox(bone44, 88, 0, 0.0F, 0.0F, 2.0F, 1, 3, 37, 0.0F, false));

        bone46 = new ModelRenderer(this);
        bone46.setRotationPoint(2.0F, 2.25F, 0.0F);
        stock.addChild(bone46);
        setRotationAngle(bone46, 0.0F, 0.0F, 0.2269F);
        bone46.cubeList.add(new ModelBox(bone46, 84, 86, -1.0F, 0.0F, 2.0F, 1, 3, 37, 0.0F, false));

        bone47 = new ModelRenderer(this);
        bone47.setRotationPoint(2.0F, 2.25F, 2.0F);
        stock.addChild(bone47);
        setRotationAngle(bone47, 0.0F, 0.0873F, 0.2793F);
        bone47.cubeList.add(new ModelBox(bone47, 28, 32, -1.0F, 0.0F, -2.0F, 1, 3, 2, 0.0F, false));

        bone48 = new ModelRenderer(this);
        bone48.setRotationPoint(-2.0F, 2.25F, 2.0F);
        stock.addChild(bone48);
        setRotationAngle(bone48, 0.0F, -0.0873F, -0.2793F);
        bone48.cubeList.add(new ModelBox(bone48, 30, 0, 0.0F, 0.0F, -2.0F, 1, 3, 2, 0.0F, false));

        bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(-1.0F, 4.0F, 5.0F);
        stock.addChild(bone42);
        setRotationAngle(bone42, -0.7854F, 0.0F, 0.0F);
        bone42.cubeList.add(new ModelBox(bone42, 0, 27, -1.0F, -2.0F, 0.0F, 4, 2, 2, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 19, 11, -0.999F, -17.4503F, 21.1071F, 4, 2, 2, 0.0F, false));

        bone51 = new ModelRenderer(this);
        bone51.setRotationPoint(2.4F, 1.4F, 30.0F);
        stock.addChild(bone51);
        setRotationAngle(bone51, -0.4538F, 0.0F, 0.0F);
        bone51.cubeList.add(new ModelBox(bone51, 30, 16, -0.999F, -1.7976F, -2.8767F, 1, 9, 2, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 6, 16, -0.997F, -0.9647F, -4.5845F, 1, 9, 2, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 0, 16, -4.797F, -0.9647F, -4.5845F, 1, 9, 2, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 19, 16, -4.799F, -1.7976F, -2.8767F, 1, 9, 2, 0.0F, false));

        bone50 = new ModelRenderer(this);
        bone50.setRotationPoint(2.4F, 1.4F, 16.0F);
        stock.addChild(bone50);
        setRotationAngle(bone50, -1.117F, 0.0F, 0.0F);
        bone50.cubeList.add(new ModelBox(bone50, 43, 59, -0.999F, -1.9779F, -2.236F, 1, 2, 9, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 19, 19, -4.799F, -1.9779F, -2.236F, 1, 2, 9, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 10, 58, -0.998F, -3.7755F, -1.3592F, 1, 2, 9, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 19, 0, -4.798F, -3.7755F, -1.3592F, 1, 2, 9, 0.0F, false));

        bone49 = new ModelRenderer(this);
        bone49.setRotationPoint(1.5F, -1.0F, 16.0F);
        stock.addChild(bone49);
        setRotationAngle(bone49, 0.0F, 0.0F, -0.7854F);
        bone49.cubeList.add(new ModelBox(bone49, 0, 41, 0.0607F, -1.7678F, -1.0F, 1, 2, 15, 0.0F, false));
        bone49.cubeList.add(new ModelBox(bone49, 0, 0, -2.3536F, -3.182F, -1.0F, 2, 1, 15, 0.0F, false));
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
