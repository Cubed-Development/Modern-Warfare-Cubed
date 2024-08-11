package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class USPMatchCompensator extends ModelBase {
    private final ModelRenderer matchcompensator;
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
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;

    public USPMatchCompensator() {
        textureWidth = 100;
        textureHeight = 100;

        matchcompensator = new ModelRenderer(this);
        matchcompensator.setRotationPoint(0.0F, -5.0F, -26.0F);
        matchcompensator.cubeList.add(new ModelBox(matchcompensator, 21, 1, -0.1F, -4.2F, -9.25F, 1, 1, 19, 0.0F, false));
        matchcompensator.cubeList.add(new ModelBox(matchcompensator, 21, 0, -0.35F, -8.1F, -10.1F, 1, 4, 7, 0.0F, false));
        matchcompensator.cubeList.add(new ModelBox(matchcompensator, 0, 0, -3.65F, -8.1F, -10.1F, 1, 4, 7, 0.0F, false));
        matchcompensator.cubeList.add(new ModelBox(matchcompensator, 16, 56, -0.1F, -1.2F, -3.2F, 1, 1, 14, 0.0F, false));
        matchcompensator.cubeList.add(new ModelBox(matchcompensator, 0, 40, -3.0F, -0.45F, -3.2F, 3, 1, 14, 0.0F, false));
        matchcompensator.cubeList.add(new ModelBox(matchcompensator, 42, 0, -0.101F, -1.95F, -3.2F, 1, 1, 14, 0.0F, false));
        matchcompensator.cubeList.add(new ModelBox(matchcompensator, 36, 42, -3.901F, -1.95F, -3.2F, 1, 1, 14, 0.0F, false));
        matchcompensator.cubeList.add(new ModelBox(matchcompensator, 21, 21, -0.102F, -3.7F, -3.2F, 1, 2, 2, 0.0F, false));
        matchcompensator.cubeList.add(new ModelBox(matchcompensator, 10, 20, -3.902F, -3.7F, -3.2F, 1, 2, 2, 0.0F, false));
        matchcompensator.cubeList.add(new ModelBox(matchcompensator, 0, 11, -0.102F, -3.7F, 7.8F, 1, 2, 2, 0.0F, false));
        matchcompensator.cubeList.add(new ModelBox(matchcompensator, 58, 0, -0.202F, -3.7F, -1.2F, 1, 2, 9, 0.0F, false));
        matchcompensator.cubeList.add(new ModelBox(matchcompensator, 32, 57, -3.802F, -3.7F, -1.2F, 1, 2, 9, 0.0F, false));
        matchcompensator.cubeList.add(new ModelBox(matchcompensator, 0, 0, -3.902F, -3.7F, 7.8F, 1, 2, 2, 0.0F, false));
        matchcompensator.cubeList.add(new ModelBox(matchcompensator, 0, 0, -3.9F, -4.2F, -9.25F, 1, 1, 19, 0.0F, false));
        matchcompensator.cubeList.add(new ModelBox(matchcompensator, 20, 41, -3.9F, -1.2F, -3.2F, 1, 1, 14, 0.0F, false));
        matchcompensator.cubeList.add(new ModelBox(matchcompensator, 0, 11, -2.5F, -8.0F, -9.5F, 2, 2, 6, 0.0F, false));

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-2.9F, -4.2F, 9.75F);
        matchcompensator.addChild(cube_r1);
        setRotationAngle(cube_r1, -1.1345F, 0.0F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 29, -1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 11, 0.8F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-2.9F, -0.2F, -3.2F);
        matchcompensator.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.2269F, 0.0F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 0, -0.999F, -4.0F, 0.0F, 4, 4, 1, 0.0F, false));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 31, 2.801F, -4.0F, 0.0F, 1, 4, 1, 0.0F, false));

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-1.9F, -0.2F, -5.2F);
        matchcompensator.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.2269F, 0.0F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 5, -1.1F, -0.23F, 0.0F, 3, 1, 1, 0.0F, false));

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-1.9F, -0.2F, -7.2F);
        matchcompensator.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.2269F, 0.0F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 14, -1.1F, -0.23F, 0.0F, 3, 1, 1, 0.0F, false));
        cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 0, -1.999F, -4.0F, 0.0F, 4, 4, 1, 0.0F, false));
        cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 23, 1.801F, -4.0F, 0.0F, 1, 4, 1, 0.0F, false));

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-1.9F, -0.2F, -9.2F);
        matchcompensator.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.2269F, 0.0F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 20, -1.1F, -0.23F, 0.0F, 3, 1, 1, 0.0F, false));
        cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 30, -1.999F, -4.0F, 0.0F, 4, 4, 1, 0.0F, false));
        cube_r5.cubeList.add(new ModelBox(cube_r5, 4, 22, 1.801F, -4.0F, 0.0F, 1, 4, 1, 0.0F, false));

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-1.85F, -4.15F, -10.2F);
        matchcompensator.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.2269F, 0.0F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 11, -1.049F, -1.65F, 0.0F, 3, 2, 1, 0.0F, false));
        cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 0, -1.799F, -4.0F, 0.0F, 1, 4, 1, 0.0F, false));
        cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 22, 1.501F, -4.0F, 0.0F, 1, 4, 1, 0.0F, false));

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(-2.9F, -0.2F, -5.2F);
        matchcompensator.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.2269F, 0.0F, 0.0F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 34, -0.999F, -4.0F, 0.0F, 4, 4, 1, 0.0F, false));
        cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 29, 2.801F, -4.0F, 0.0F, 1, 4, 1, 0.0F, false));

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(-3.0F, 0.55F, -9.0F);
        matchcompensator.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.1745F, -0.1396F, 0.6981F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 4, -1.17F, -1.001F, -0.03F, 1, 1, 1, 0.0F, false));
        cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 13, -1.0F, -1.0F, -0.03F, 1, 1, 1, 0.0F, false));

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-3.0F, 0.55F, -7.0F);
        matchcompensator.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.1745F, -0.1396F, 0.6981F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 3, 5, -1.17F, -1.001F, -0.03F, 1, 1, 1, 0.0F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 16, -1.0F, -1.0F, -0.03F, 1, 1, 1, 0.0F, false));

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(-3.0F, 0.55F, -5.0F);
        matchcompensator.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.1745F, -0.1396F, 0.6981F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 15, -1.17F, -1.001F, -0.03F, 1, 1, 1, 0.0F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 24, -1.0F, -1.0F, -0.03F, 1, 1, 1, 0.0F, false));

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(-3.0F, 0.55F, -3.2F);
        matchcompensator.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 0.0F, 0.6981F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 21, -1.17F, -1.001F, 0.0F, 1, 1, 14, 0.0F, false));
        cube_r11.cubeList.add(new ModelBox(cube_r11, 52, 36, -1.0F, -1.0F, 0.0F, 1, 1, 14, 0.0F, false));

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(0.0F, 0.55F, -9.0F);
        matchcompensator.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.1745F, 0.1396F, -0.6981F);
        cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 20, 0.17F, -1.001F, -0.04F, 1, 1, 1, 0.0F, false));
        cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 4, 0.0F, -1.0F, -0.04F, 1, 1, 1, 0.0F, false));

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(0.0F, 0.55F, -7.0F);
        matchcompensator.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.1745F, 0.1396F, -0.6981F);
        cube_r13.cubeList.add(new ModelBox(cube_r13, 21, 5, 0.17F, -1.001F, -0.04F, 1, 1, 1, 0.0F, false));
        cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 17, 0.0F, -1.0F, -0.04F, 1, 1, 1, 0.0F, false));

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(0.0F, 0.55F, -5.0F);
        matchcompensator.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.1745F, 0.1396F, -0.6981F);
        cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 11, 0.17F, -1.001F, -0.04F, 1, 1, 1, 0.0F, false));
        cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 25, 0.0F, -1.0F, -0.04F, 1, 1, 1, 0.0F, false));

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(0.0F, 0.55F, -3.2F);
        matchcompensator.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.0F, -0.6981F);
        cube_r15.cubeList.add(new ModelBox(cube_r15, 52, 52, 0.17F, -1.001F, 0.0F, 1, 1, 14, 0.0F, false));
        cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 55, 0.0F, -1.0F, 0.0F, 1, 1, 14, 0.0F, false));

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(-3.65F, -8.1F, -10.1F);
        matchcompensator.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0F, 0.0F, 0.5934F);
        cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 20, 0.0F, -1.0F, -1.0F, 1, 1, 8, 0.0F, false));

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(0.65F, -8.1F, -10.1F);
        matchcompensator.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, 0.0F, -0.5934F);
        cube_r17.cubeList.add(new ModelBox(cube_r17, 21, 21, -1.0F, -1.0F, -1.0F, 1, 1, 8, 0.0F, false));

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(0.9F, -4.2F, 8.75F);
        matchcompensator.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, 0.0F, 0.9599F);
        cube_r18.cubeList.add(new ModelBox(cube_r18, 25, 25, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(-3.9F, -4.2F, 8.75F);
        matchcompensator.addChild(cube_r19);
        setRotationAngle(cube_r19, 0.0F, 0.0F, -0.9599F);
        cube_r19.cubeList.add(new ModelBox(cube_r19, 25, 21, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
        cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 20, 0.0F, 0.0F, -18.85F, 1, 1, 19, 0.0F, false));

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(0.9F, -4.2F, -10.1F);
        matchcompensator.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.0F, 0.0F, 0.9599F);
        cube_r20.cubeList.add(new ModelBox(cube_r20, 21, 21, -1.0F, 0.0F, 0.0F, 1, 1, 19, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        matchcompensator.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
