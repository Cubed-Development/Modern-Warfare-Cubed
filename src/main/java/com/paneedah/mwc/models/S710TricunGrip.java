package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class S710TricunGrip extends ModelWithAttachments {
    private final ModelRenderer grip;
    private final ModelRenderer grip3_r1;
    private final ModelRenderer grip3_r2;
    private final ModelRenderer grip5_r1;
    private final ModelRenderer grip5_r2;

    public S710TricunGrip() {
        textureWidth = 200;
        textureHeight = 200;

        grip = new ModelRenderer(this);
        grip.setRotationPoint(0.0F, 24.0F, 0.0F);
        grip.cubeList.add(new ModelBox(grip, 15, 16, -3.001F, -31.0F, -1.0F, 3, 5, 1, 0.0F, false));
        grip.cubeList.add(new ModelBox(grip, 0, 62, -3.5F, -31.0F, -6.0F, 4, 5, 5, 0.0F, false));

        grip3_r1 = new ModelRenderer(this);
        grip3_r1.setRotationPoint(-3.5F, -26.0F, -5.5F);
        grip.addChild(grip3_r1);
        setRotationAngle(grip3_r1, 0.3718F, 0.0F, 0.0F);
        grip3_r1.cubeList.add(new ModelBox(grip3_r1, 51, 0, 0.001F, -0.5F, 0.0F, 4, 11, 4, 0.0F, false));
        grip3_r1.cubeList.add(new ModelBox(grip3_r1, 48, 74, 3.1F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
        grip3_r1.cubeList.add(new ModelBox(grip3_r1, 63, 74, -0.1F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));

        grip3_r2 = new ModelRenderer(this);
        grip3_r2.setRotationPoint(-3.5F, -29.0F, -1.0F);
        grip.addChild(grip3_r2);
        setRotationAngle(grip3_r2, -1.0782F, 0.0F, 0.0F);
        grip3_r2.cubeList.add(new ModelBox(grip3_r2, 109, 111, -0.001F, 0.0F, 0.0F, 4, 3, 12, 0.0F, false));
        grip3_r2.cubeList.add(new ModelBox(grip3_r2, 118, 0, 0.5F, -1.0F, 0.0F, 3, 1, 12, 0.0F, false));

        grip5_r1 = new ModelRenderer(this);
        grip5_r1.setRotationPoint(-3.5F, -16.8F, -2.6F);
        grip.addChild(grip5_r1);
        setRotationAngle(grip5_r1, 0.2231F, 0.0F, 0.0F);
        grip5_r1.cubeList.add(new ModelBox(grip5_r1, 0, 16, 0.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F, false));
        grip5_r1.cubeList.add(new ModelBox(grip5_r1, 26, 8, 0.001F, 0.0F, 6.5F, 4, 1, 1, 0.0F, false));
        grip5_r1.cubeList.add(new ModelBox(grip5_r1, 82, 64, 0.5F, 0.0F, 7.4F, 3, 1, 1, 0.0F, false));
        grip5_r1.cubeList.add(new ModelBox(grip5_r1, 35, 83, 0.5F, -0.3F, 7.401F, 3, 1, 1, 0.0F, false));

        grip5_r2 = new ModelRenderer(this);
        grip5_r2.setRotationPoint(-3.5F, -16.8F, -2.6F);
        grip.addChild(grip5_r2);
        setRotationAngle(grip5_r2, 1.0782F, 0.0F, 0.0F);
        grip5_r2.cubeList.add(new ModelBox(grip5_r2, 26, 34, 0.002F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));
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
