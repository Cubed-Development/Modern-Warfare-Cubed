package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ElectricBoxOpened extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;

    public ElectricBoxOpened() {
        textureWidth = 128;
        textureHeight = 128;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(-7.0F, 7.0F, 0.5F);
        setRotationAngle(bone, 0.0F, 0.9599F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 20, 0, 3.2278F, -7.0F, 11.0093F, 8, 14, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 4, 74, 3.0136F, -6.5F, 11.1939F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 74, 3.0136F, 5.5F, 11.1939F, 1, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 24, 70, 9.3506F, -1.5F, 11.313F, 1, 3, 1, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, 20.5F, 7.0F);
        setRotationAngle(bone2, 0.0F, -0.7854F, 0.0F);
        bone2.cubeList.add(new ModelBox(bone2, 0, 49, -0.5F, -6.5F, -1.0F, 1, 13, 2, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.0F, 20.5F, 7.0F);
        setRotationAngle(bone3, 0.0F, 0.7854F, 0.0F);
        bone3.cubeList.add(new ModelBox(bone3, 20, 34, -0.5F, -6.5F, -1.0F, 1, 13, 2, 0.0F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(1.75F, 11.75F, 5.5F);
        setRotationAngle(bone4, 0.0F, -0.7854F, 0.0F);
        bone4.cubeList.add(new ModelBox(bone4, 18, 70, -0.7929F, -0.5F, -0.6464F, 2, 1, 1, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 0, 70, -0.7929F, -2.5F, -0.6464F, 2, 1, 1, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 42, 67, -0.7929F, -8.5F, -0.6464F, 2, 1, 1, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 12, 72, -3.2678F, -2.5F, 1.8284F, 2, 1, 1, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 12, 70, -3.2678F, -4.5F, 1.8284F, 2, 1, 1, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 6, 72, -3.2678F, -6.5F, 1.8284F, 2, 1, 1, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(1.75F, 11.75F, 2.5F);
        setRotationAngle(bone5, 0.0F, 0.7854F, 0.0F);
        bone5.cubeList.add(new ModelBox(bone5, 6, 70, -3.4445F, -4.5F, 1.6517F, 2, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 36, 67, -5.9194F, -0.5F, -0.8232F, 2, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 30, 67, -5.9194F, -8.5F, -0.8232F, 2, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 72, -3.4445F, -6.5F, 1.6517F, 2, 1, 1, 0.0F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone6.cubeList.add(new ModelBox(bone6, 18, 16, -5.0F, -24.0F, 4.0F, 1, 14, 4, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 28, 16, 4.0F, -24.0F, 4.0F, 1, 14, 4, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 0, -4.0F, -24.0F, 6.0F, 8, 14, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 16, -3.5F, -22.5F, 5.75F, 7, 11, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 20, 67, -3.25F, -12.75F, 5.5F, 3, 1, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 40, 64, -3.25F, -14.75F, 5.5F, 3, 1, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 20, 64, -3.25F, -16.75F, 5.5F, 3, 1, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 64, -3.25F, -18.75F, 5.5F, 3, 1, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 6, 52, -3.25F, -20.75F, 5.5F, 3, 1, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 10, 67, 0.25F, -12.75F, 5.5F, 3, 1, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 67, 0.25F, -14.75F, 5.5F, 3, 1, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 30, 64, 0.25F, -16.75F, 5.5F, 3, 1, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 10, 64, 0.25F, -18.75F, 5.5F, 3, 1, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 6, 55, 0.25F, -20.75F, 5.5F, 3, 1, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 6, 49, -1.5F, -22.25F, 5.5F, 3, 1, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 37, -4.0F, -24.0F, 4.0F, 8, 1, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 34, -4.0F, -11.0F, 4.0F, 8, 1, 2, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bone.render(f5);
        bone2.render(f5);
        bone3.render(f5);
        bone4.render(f5);
        bone5.render(f5);
        bone6.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
