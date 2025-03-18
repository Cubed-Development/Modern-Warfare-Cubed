package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class RPKstock extends ModelBase {
    private final ModelRenderer stock1;
    private final ModelRenderer stock2;
    private final ModelRenderer stock5;
    private final ModelRenderer stock6;
    private final ModelRenderer stock7;
    private final ModelRenderer stock8;
    private final ModelRenderer stock9;
    private final ModelRenderer stock10;
    private final ModelRenderer stock11;
    private final ModelRenderer stock12;
    private final ModelRenderer stock13;
    private final ModelRenderer stock14;

    public RPKstock() {
        textureWidth = 70;
        textureHeight = 70;

        stock1 = new ModelRenderer(this);
        stock1.setRotationPoint(-3.5F, -10.9F, 3.5F);
        setRotationAngle(stock1, -0.0873F, 0, 0);
        stock1.cubeList.add(new ModelBox(stock1, 0, 0, 0, 0, 0, 4, 5, 27, 0, false));

        stock2 = new ModelRenderer(this);
        stock2.setRotationPoint(-3, -11.9F, 3.5F);
        setRotationAngle(stock2, -0.0873F, 0, 0);
        stock2.cubeList.add(new ModelBox(stock2, 0, 32, 0, 0, 0, 3, 2, 28, 0, false));

        stock5 = new ModelRenderer(this);
        stock5.setRotationPoint(-2.9F, -9.7F, 30.8F);
        setRotationAngle(stock5, -0.0873F, 0, 0);
        stock5.cubeList.add(new ModelBox(stock5, 6, 17, 0, 0.3985F, 0.0349F, 2, 2, 1, 0, false));

        stock6 = new ModelRenderer(this);
        stock6.setRotationPoint(-3.4F, -8.9F, 29.7F);
        setRotationAngle(stock6, -0.0873F, 0, 0);
        stock6.cubeList.add(new ModelBox(stock6, 0, 0, 0, 0.3985F, 0.0349F, 3, 10, 2, 0, false));

        stock7 = new ModelRenderer(this);
        stock7.setRotationPoint(-0.6F, -8.9F, 29.7F);
        setRotationAngle(stock7, -0.0873F, 0, 0);
        stock7.cubeList.add(new ModelBox(stock7, 0, 12, 0, 0.3985F, 0.0359F, 1, 10, 2, 0, false));

        stock8 = new ModelRenderer(this);
        stock8.setRotationPoint(-1.1F, -9.7F, 30.8F);
        setRotationAngle(stock8, -0.0873F, 0, 0);
        stock8.cubeList.add(new ModelBox(stock8, 12, 17, 0, 0.3975F, 0.0359F, 1, 2, 1, 0, false));

        stock9 = new ModelRenderer(this);
        stock9.setRotationPoint(-0.4F, -8.6F, 7.5F);
        setRotationAngle(stock9, -0.1859F, 0, 0);
        stock9.cubeList.add(new ModelBox(stock9, 14, 12, 0, 0, 0, 1, 1, 3, 0, false));

        stock10 = new ModelRenderer(this);
        stock10.setRotationPoint(-0.1F, -9.5F, 8.5F);
        setRotationAngle(stock10, -0.1859F, 0, 0);
        stock10.cubeList.add(new ModelBox(stock10, 6, 12, 0, 0, 0, 1, 3, 1, 0, false));

        stock11 = new ModelRenderer(this);
        stock11.setRotationPoint(-2.5F, -12, 3.5F);
        setRotationAngle(stock11, -0.0873F, 0, 0);
        stock11.cubeList.add(new ModelBox(stock11, 6, 12, 0, 0, 0, 2, 1, 4, 0, false));

        stock12 = new ModelRenderer(this);
        stock12.setRotationPoint(-3.5F, 1, 16.6F);
        setRotationAngle(stock12, -0.0524F, 0, 0);
        stock12.cubeList.add(new ModelBox(stock12, 34, 32, 0.001F, -6, 0, 4, 6, 13, 0, false));

        stock13 = new ModelRenderer(this);
        stock13.setRotationPoint(-3.5F, 0, 16.7F);
        setRotationAngle(stock13, 0.1335F, 0, 0);
        stock13.cubeList.add(new ModelBox(stock13, 10, 6, 0, -4, 0, 4, 4, 2, 0, false));

        stock14 = new ModelRenderer(this);
        stock14.setRotationPoint(-3.5F, -3, 16.4F);
        setRotationAngle(stock14, 0.9515F, 0, 0);
        stock14.cubeList.add(new ModelBox(stock14, 10, 0, -0.001F, -4, 0, 4, 4, 2, 0, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        stock1.render(f5);
        stock2.render(f5);
        stock5.render(f5);
        stock6.render(f5);
        stock7.render(f5);
        stock8.render(f5);
        stock9.render(f5);
        stock10.render(f5);
        stock11.render(f5);
        stock12.render(f5);
        stock13.render(f5);
        stock14.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
