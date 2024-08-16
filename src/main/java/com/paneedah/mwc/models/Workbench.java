package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Workbench extends ModelBase {
    private final ModelRenderer workbench;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;

    public Workbench() {
        textureWidth = 160;
        textureHeight = 160;

        workbench = new ModelRenderer(this);
        workbench.setRotationPoint(16.0F, 10.2F, -8.2F);
        workbench.cubeList.add(new ModelBox(workbench, 0, 0, -32.0F, -0.2F, 0.2F, 32, 5, 16, 0.0F, false));
        workbench.cubeList.add(new ModelBox(workbench, 0, 39, -31.5F, 11.3F, 0.7F, 31, 1, 15, -0.2F, false));
        workbench.cubeList.add(new ModelBox(workbench, 0, 87, -31.5F, 4.8F, 0.7F, 2, 9, 2, 0.0F, false));
        workbench.cubeList.add(new ModelBox(workbench, 0, 72, -28.5F, 6.55F, 1.45F, 12, 5, 10, 0.0F, false));
        workbench.cubeList.add(new ModelBox(workbench, 68, 81, -2.5F, 4.8F, 0.7F, 2, 9, 2, 0.0F, false));
        workbench.cubeList.add(new ModelBox(workbench, 0, 55, -2.5F, 4.8F, 13.95F, 2, 9, 2, 0.0F, false));
        workbench.cubeList.add(new ModelBox(workbench, 6, 21, -1.0F, -13.2F, 13.95F, 1, 11, 2, 0.0F, false));
        workbench.cubeList.add(new ModelBox(workbench, 0, 21, -32.0F, -13.2F, 13.95F, 1, 11, 2, 0.0F, false));
        workbench.cubeList.add(new ModelBox(workbench, 80, 0, -32.0F, -15.2F, 12.95F, 32, 2, 3, 0.0F, false));
        workbench.cubeList.add(new ModelBox(workbench, 80, 5, -29.5F, 4.8F, 14.7F, 28, 7, 1, 0.0F, false));
        workbench.cubeList.add(new ModelBox(workbench, 77, 39, -31.5F, -14.2F, 14.7F, 31, 12, 1, 0.0F, false));
        workbench.cubeList.add(new ModelBox(workbench, 0, 39, -31.5F, 4.8F, 13.95F, 2, 9, 2, 0.0F, false));
        workbench.cubeList.add(new ModelBox(workbench, 0, 21, -32.0F, -2.0F, 0.1F, 32, 2, 16, 0.2F, false));

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-6.65F, -3.2F, 3.1F);
        workbench.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.3316F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 25, 0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-5.75F, -4.5F, 5.2F);
        workbench.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.067F, -0.4826F, 0.2046F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 10, 0.0F, -1.0F, 0.0F, 4, 1, 1, -0.2F, false));

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-4.05F, -3.2F, 1.2F);
        workbench.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0831F, -0.3214F, -0.2578F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 8, 0.0F, -1.0F, 0.0F, 6, 1, 1, -0.2F, false));

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-5.25F, -3.2F, 1.6F);
        workbench.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, -0.3316F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, -4.0F, 0.0F, 3, 4, 4, 0.0F, false));

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-12.0F, -2.2F, 3.35F);
        workbench.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, -1.3439F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 88, 52, 0.0F, -3.0F, 0.0F, 8, 3, 4, 0.0F, false));

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-7.0F, -2.2F, 0.85F);
        workbench.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, -0.3316F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 81, 0.0F, -1.0F, 0.0F, 5, 1, 5, 0.0F, false));

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(-7.6F, 8.05F, 4.8F);
        workbench.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, -0.2269F, 0.0F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 10, 0.0F, -2.25F, 0.5F, 1, 1, 4, 0.01F, false));
        cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 47, 0.0F, -2.0F, 4.0F, 1, 2, 1, 0.0F, false));
        cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 49, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(-8.5F, 11.55F, 2.05F);
        workbench.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, -0.2269F, 0.0F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 84, 94, 0.0F, -4.0F, 0.0F, 4, 4, 10, 0.0F, false));

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-34.2F, 6.75F, -0.7F);
        workbench.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, -0.8552F, 0.0F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 41, -12.3F, -2.3F, 0.2F, 1, 2, 1, 0.0F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 43, -17.3F, -2.3F, 0.2F, 1, 2, 1, 0.0F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 10, -14.35F, 2.0F, 0.6F, 1, 3, 1, 0.0F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -10.35F, 2.0F, 0.6F, 1, 3, 1, 0.0F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 34, -13.35F, 4.0F, 0.6F, 3, 1, 1, 0.0F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 12, -13.35F, 2.0F, 0.6F, 3, 1, 1, 0.2F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 34, -7.0F, 2.0F, 0.6F, 3, 1, 1, 0.2F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 39, -7.0F, 4.0F, 0.6F, 3, 1, 1, 0.0F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 0, -4.0F, 2.0F, 0.6F, 1, 3, 1, 0.0F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 21, -8.0F, 2.0F, 0.6F, 1, 3, 1, 0.0F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 29, -6.0F, -2.3F, 0.2F, 1, 2, 1, 0.0F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 45, -1.0F, -2.3F, 0.2F, 1, 2, 1, 0.0F, false));

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(-33.8F, 5.2F, 0.7F);
        workbench.addChild(cube_r10);
        setRotationAngle(cube_r10, -0.0873F, -0.8552F, 0.0F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 55, -20.0F, -3.0F, 0.0F, 20, 3, 14, 0.2F, false));

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(-33.8F, 13.8F, 0.7F);
        workbench.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, -0.8552F, 0.0F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 80, 81, -18.0F, -9.0F, 0.2F, 16, 9, 1, -0.02F, false));
        cube_r11.cubeList.add(new ModelBox(cube_r11, 55, 59, -18.0F, -9.0F, 1.0F, 16, 9, 13, -0.01F, false));
        cube_r11.cubeList.add(new ModelBox(cube_r11, 82, 13, -4.0F, -6.0F, 0.0F, 1, 6, 14, 0.0F, false));
        cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 87, -17.0F, -6.0F, 0.0F, 1, 6, 14, 0.0F, false));
        cube_r11.cubeList.add(new ModelBox(cube_r11, 54, 55, -18.0F, -9.0F, 0.0F, 16, 3, 1, 0.0F, false));
        cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 73, -20.0F, -9.0F, 0.0F, 2, 9, 14, 0.0F, false));
        cube_r11.cubeList.add(new ModelBox(cube_r11, 62, 81, -2.0F, -9.0F, 0.0F, 2, 9, 14, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        workbench.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
