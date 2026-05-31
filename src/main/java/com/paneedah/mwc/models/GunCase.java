package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class GunCase extends ModelBase {
    private final ModelRenderer Shape1;
    private final ModelRenderer Shape22;
    private final ModelRenderer Shape23;
    private final ModelRenderer Shape24;
    private final ModelRenderer Shape25;
    private final ModelRenderer Shape75Hatch;
    private final ModelRenderer Shape79Hatch;
    private final ModelRenderer Shape82Hatch;
    private final ModelRenderer Shape86Hatch;

    public GunCase() {
        textureWidth = 256;
        textureHeight = 256;

        Shape1 = new ModelRenderer(this);
        Shape1.setRotationPoint(-5, 18, -24);
        Shape1.cubeList.add(new ModelBox(Shape1, 0, 0, 0, 0, 0, 14, 5, 60, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 91, 7, -1, -0.01F, 1, 16, 5, 58, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 0, 65, -2.3F, -1.5F, 10, 2, 3, 9, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 33, 42, -2.3F, -1.5F, 41, 2, 3, 9, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 0, 65, -1, -3.1F, 0.45F, 16, 3, 59, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 0, 13, -0.99F, -3.3F, 24, 16, 1, 12, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 0, 0, -0.99F, -3.3F, 9, 16, 1, 12, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 0, 26, -0.99F, -3.3F, 39, 16, 1, 12, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 0, 45, -0.99F, -3.3F, 54, 16, 1, 5, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 0, 39, -0.99F, -3.3F, 1, 16, 1, 5, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 44, 13, 14.5F, -2.1F, 6, 2, 5, 3, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 0, 26, 14.5F, -2.1F, 21, 2, 5, 3, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 0, 13, 14.5F, -2.1F, 36, 2, 5, 3, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 0, 0, 14.5F, -2.1F, 51, 2, 5, 3, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 46, 39, 6, -2.1F, -1.5F, 3, 5, 2, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 44, 26, 6, -2.1F, 59.5F, 3, 5, 2, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 53, 0, 16, -1.1F, 9.5F, 1, 2, 2, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 53, 53, 16, -1.1F, 18.5F, 1, 2, 2, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 50, 8, 16, -1.1F, 39.5F, 1, 2, 2, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 0, 127, 15, -1.1F, 1, 1, 2, 58, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 44, 21, 16, -1.1F, 48.5F, 1, 2, 2, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 44, 8, 16, -1.1F, 54.5F, 1, 2, 2, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 0, 55, 0, -1.1F, 59, 14, 2, 2, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 0, 51, 0, -1.1F, -1, 14, 2, 2, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 92, 92, -2, -1.1F, 1, 1, 2, 58, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 44, 0, 16, -1.1F, 3.5F, 1, 2, 2, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 52, 31, 14.2F, 1, 25, 2, 3, 2, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 52, 19, 14.2F, 1, 33, 2, 3, 2, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 0, 36, 15.2F, 2.5F, 33.5F, 3, 1, 1, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 0, 34, 15.2F, 2.5F, 25.5F, 3, 1, 1, 0, false));
        Shape1.cubeList.add(new ModelBox(Shape1, 44, 0, 17.5F, 2.5F, 26.5F, 1, 1, 7, 0, false));

        Shape22 = new ModelRenderer(this);
        Shape22.setRotationPoint(8, 19, -23);
        setRotationAngle(Shape22, 0, 0.6981F, 0);
        Shape22.cubeList.add(new ModelBox(Shape22, 37, 45, 0.5F, 0, 0.1F, 1, 4, 1, 0, false));

        Shape23 = new ModelRenderer(this);
        Shape23.setRotationPoint(-6, 19, 35);
        setRotationAngle(Shape23, 0, 0.6981F, 0);
        Shape23.cubeList.add(new ModelBox(Shape23, 0, 45, -0.1F, 0, 0.2F, 1, 4, 1, 0, false));

        Shape24 = new ModelRenderer(this);
        Shape24.setRotationPoint(-6, 19, -23);
        setRotationAngle(Shape24, 0, 0.6981F, 0);
        Shape24.cubeList.add(new ModelBox(Shape24, 37, 39, 0.2F, 0, -0.2F, 1, 4, 1, 0, false));

        Shape25 = new ModelRenderer(this);
        Shape25.setRotationPoint(8, 19, 35);
        setRotationAngle(Shape25, 0, 0.6981F, 0);
        Shape25.cubeList.add(new ModelBox(Shape25, 0, 39, 0.3F, 0, 0.4F, 1, 4, 1, 0, false));

        Shape75Hatch = new ModelRenderer(this);
        Shape75Hatch.setRotationPoint(8, 16.9F, 35);
        setRotationAngle(Shape75Hatch, 0, 0.8203F, 0);
        Shape75Hatch.cubeList.add(new ModelBox(Shape75Hatch, 0, 21, -0.8F, 0, 0.1F, 3, 2, 2, 0, false));

        Shape79Hatch = new ModelRenderer(this);
        Shape79Hatch.setRotationPoint(-6, 16.9F, 35);
        setRotationAngle(Shape79Hatch, 0, 0.7854F, 0);
        Shape79Hatch.cubeList.add(new ModelBox(Shape79Hatch, 46, 46, -0.7F, 0, -0.8F, 2, 2, 3, 0, false));

        Shape82Hatch = new ModelRenderer(this);
        Shape82Hatch.setRotationPoint(-6, 16.9F, -23);
        setRotationAngle(Shape82Hatch, 0, 0.7679F, 0);
        Shape82Hatch.cubeList.add(new ModelBox(Shape82Hatch, 0, 8, -0.8F, 0, -0.7F, 3, 2, 2, 0, false));

        Shape86Hatch = new ModelRenderer(this);
        Shape86Hatch.setRotationPoint(8, 16.9F, -23);
        setRotationAngle(Shape86Hatch, 0, 0.7505F, 0);
        Shape86Hatch.cubeList.add(new ModelBox(Shape86Hatch, 44, 33, 0.1F, 0, -0.9F, 2, 2, 3, 0, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        Shape1.render(f5);
        Shape22.render(f5);
        Shape23.render(f5);
        Shape24.render(f5);
        Shape25.render(f5);
        Shape75Hatch.render(f5);
        Shape79Hatch.render(f5);
        Shape82Hatch.render(f5);
        Shape86Hatch.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
