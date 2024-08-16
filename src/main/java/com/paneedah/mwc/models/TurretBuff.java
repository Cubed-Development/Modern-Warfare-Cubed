package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TurretBuff extends ModelBiped {
    private final ModelRenderer body;
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
    private final ModelRenderer head;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer magazine;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;

    public TurretBuff() {
        textureWidth = 64;
        textureHeight = 64;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.cubeList.add(new ModelBox(body, 44, 18, 2.0F, -3.0F, -4.0F, 2, 2, 2, 0.0F, false));
        body.cubeList.add(new ModelBox(body, 42, 26, 2.0F, -6.38F, -0.3F, 2, 2, 2, 0.0F, false));
        body.cubeList.add(new ModelBox(body, 38, 40, -4.0F, -6.38F, -0.3F, 2, 2, 2, 0.0F, false));
        body.cubeList.add(new ModelBox(body, 14, 44, -4.0F, -3.0F, -4.0F, 2, 2, 2, 0.0F, false));

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-0.5F, -4.2F, 5.45F);
        body.addChild(cube_r1);
        setRotationAngle(cube_r1, 1.2217F, 0.0F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 27, 0.0F, -1.0F, -4.0F, 1, 1, 5, 0.001F, false));

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-4.0F, -6.38F, 1.7F);
        body.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.3436F, -0.0032F, -0.1434F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 40, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-1.0F, -4.0F, 4.95F);
        body.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.6604F, -0.3563F, 0.2557F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 8, -3.0F, -1.0F, 0.0F, 3, 1, 1, 0.001F, false));

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(1.0F, -4.0F, 4.95F);
        body.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.6604F, 0.3563F, -0.2557F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 11, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.001F, false));

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-1.0F, -4.0F, 4.95F);
        body.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.6807F, 0.0F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 40, 0.0F, -3.0F, 0.0F, 2, 3, 2, 0.001F, false));

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-4.0F, -3.0F, -4.0F);
        body.addChild(cube_r6);
        setRotationAngle(cube_r6, -0.829F, 0.0F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 12, 0.0F, -5.0F, 0.0F, 2, 5, 2, 0.001F, false));
        cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 40, 6.0F, -5.0F, 0.0F, 2, 5, 2, 0.001F, false));

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(4.0F, -6.38F, 1.7F);
        body.addChild(cube_r7);
        setRotationAngle(cube_r7, -0.3436F, 0.0032F, 0.1434F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 1, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(-3.5F, -4.38F, 0.9F);
        body.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.3441F, 0.1288F, -0.3441F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 12, 0.0F, -1.0F, 0.0F, 1, 6, 1, 0.0F, false));

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(3.5F, -4.38F, 0.9F);
        body.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.3441F, -0.1288F, 0.3441F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 0, -1.0F, -1.0F, 0.0F, 1, 6, 1, 0.0F, false));

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(-6.5F, 0.0F, 0.0F);
        body.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, -0.4363F, 0.0F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 20, 0.0F, -1.0F, -5.0F, 4, 1, 5, 0.002F, false));

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(-6.5F, 0.0F, 0.0F);
        body.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 0.4363F, 0.0F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 8, 0.0F, -1.0F, 0.0F, 4, 1, 5, 0.0F, false));

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(6.5F, 0.0F, 0.0F);
        body.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.4363F, 0.0F);
        cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 0, -4.0F, -1.0F, -5.0F, 4, 1, 5, 0.0F, false));

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(6.5F, 0.0F, 0.0F);
        body.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, -0.4363F, 0.0F);
        cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 21, -4.0F, -1.0F, 0.0F, 4, 1, 5, 0.002F, false));

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(0.0F, 0.0F, 6.5F);
        body.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0F, -0.4363F, 0.0F);
        cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 27, -5.0F, -1.0F, -4.0F, 5, 1, 4, 0.001F, false));

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(0.0F, 0.0F, 6.5F);
        body.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.4363F, 0.0F);
        cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 14, 0.0F, -1.0F, -4.0F, 5, 1, 4, 0.0F, false));

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(0.0F, 0.0F, -6.5F);
        body.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0F, -0.4363F, 0.0F);
        cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 27, 0.0F, -1.0F, 0.0F, 5, 1, 4, 0.001F, false));

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(0.0F, 0.0F, -6.5F);
        body.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, 0.4363F, 0.0F);
        cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 6, -5.0F, -1.0F, 0.0F, 5, 1, 4, 0.0F, false));

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 17.0F, 4.0F);
        head.cubeList.add(new ModelBox(head, 0, 0, -0.5F, -3.2F, -8.0F, 1, 1, 11, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 10, 12, -0.5F, -3.7F, -10.0F, 1, 1, 7, -0.1F, false));
        head.cubeList.add(new ModelBox(head, 0, 12, -0.5F, -3.8F, -15.5F, 1, 1, 8, -0.3F, false));
        head.cubeList.add(new ModelBox(head, 30, 33, -0.5F, -1.55F, -8.3F, 1, 1, 6, -0.3F, false));
        head.cubeList.add(new ModelBox(head, 33, 44, -0.5F, -1.95F, -4.3F, 1, 1, 2, -0.3F, false));
        head.cubeList.add(new ModelBox(head, 30, 36, -0.75F, -4.5F, -4.0F, 2, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 12, 26, -1.0F, -4.25F, -3.5F, 2, 1, 6, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 14, 33, -1.25F, -4.5F, -4.0F, 1, 1, 6, 0.001F, false));
        head.cubeList.add(new ModelBox(head, 8, 33, -0.9F, -4.5F, -2.0F, 2, 1, 3, -0.01F, false));
        head.cubeList.add(new ModelBox(head, 22, 32, -1.98F, -2.68F, -4.0F, 1, 1, 6, 0.001F, false));
        head.cubeList.add(new ModelBox(head, 19, 14, 0.98F, -2.68F, -4.0F, 1, 1, 1, 0.001F, false));
        head.cubeList.add(new ModelBox(head, 0, 6, 0.98F, -1.33F, -2.6F, 1, 1, 4, 0.002F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, -1.98F, -2.33F, -2.6F, 1, 2, 4, 0.002F, false));
        head.cubeList.add(new ModelBox(head, 13, 0, -0.5F, -3.35F, -14.0F, 1, 1, 7, -0.2F, false));

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(-0.1F, -2.4F, -13.75F);
        head.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, 0.0F, -0.9948F);
        cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 40, 0.0F, -1.0F, 0.0F, 1, 1, 3, -0.14F, false));

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(0.1F, -2.4F, -13.75F);
        head.addChild(cube_r19);
        setRotationAngle(cube_r19, 0.0F, 0.0F, 0.9948F);
        cube_r19.cubeList.add(new ModelBox(cube_r19, 43, 41, -1.0F, -1.0F, 0.0F, 1, 1, 3, -0.15F, false));

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(-0.8F, -2.45F, -7.0F);
        head.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.0F, 0.0F, 0.9599F);
        cube_r20.cubeList.add(new ModelBox(cube_r20, 39, 11, 0.0F, -1.0F, 0.0F, 1, 1, 5, 0.001F, false));

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(0.8F, -2.45F, -7.0F);
        head.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.0F, 0.0F, -0.9599F);
        cube_r21.cubeList.add(new ModelBox(cube_r21, 23, 39, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(-1.25F, -4.5F, -4.0F);
        head.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.0F, 0.0F, 0.384F);
        cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 32, 0.0F, 0.0F, 0.0F, 1, 2, 6, -0.001F, false));

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(1.25F, -4.5F, -4.0F);
        head.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0F, 0.0F, -0.384F);
        cube_r23.cubeList.add(new ModelBox(cube_r23, 6, 6, -1.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(-1.98F, -1.68F, -4.0F);
        head.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.8029F, 0.0F, 0.0F);
        cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 6, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
        cube_r24.cubeList.add(new ModelBox(cube_r24, 6, 0, 2.96F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(2.38F, -0.68F, -0.1F);
        head.addChild(cube_r25);
        setRotationAngle(cube_r25, -0.5322F, -0.3809F, 0.6075F);
        cube_r25.cubeList.add(new ModelBox(cube_r25, 38, 33, -3.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F, false));

        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(-0.85F, -4.8F, -6.0F);
        head.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.0F, 0.0F, -0.4363F);
        cube_r26.cubeList.add(new ModelBox(cube_r26, 31, 13, -1.0F, 0.0F, 0.0F, 1, 1, 6, 0.001F, false));

        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(1.0F, -4.25F, 2.5F);
        head.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.2967F, 0.0F, 0.0F);
        cube_r27.cubeList.add(new ModelBox(cube_r27, 22, 36, -2.0F, 1.55F, 0.45F, 2, 1, 1, 0.0F, false));
        cube_r27.cubeList.add(new ModelBox(cube_r27, 44, 22, -2.0F, 2.4F, 1.2F, 2, 2, 1, -0.018F, false));
        cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 32, -2.0F, 2.3F, 0.45F, 2, 3, 1, -0.015F, false));

        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(1.0F, -4.25F, 2.5F);
        head.addChild(cube_r28);
        setRotationAngle(cube_r28, -0.4712F, 0.0F, 0.0F);
        cube_r28.cubeList.add(new ModelBox(cube_r28, 30, 32, -2.0F, 0.5F, 4.0F, 2, 3, 1, 0.0F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 25, 20, -2.0F, 0.75F, -1.2F, 2, 1, 6, -0.1F, false));
        cube_r28.cubeList.add(new ModelBox(cube_r28, 35, 20, -2.0F, 0.0F, 0.0F, 2, 1, 5, -0.01F, false));

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(0.2F, -0.85F, -8.0F);
        head.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.7679F, 0.0F, 0.0F);
        cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 0, -0.7F, -2.7F, -0.3F, 1, 3, 1, -0.301F, false));

        magazine = new ModelRenderer(this);
        magazine.setRotationPoint(1.3F, -3.15F, 0.5F);
        head.addChild(magazine);
        setRotationAngle(magazine, -0.4093F, 0.0916F, 0.2079F);


        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(2.0F, 0.0F, 1.0F);
        magazine.addChild(cube_r30);
        setRotationAngle(cube_r30, 0.0F, 0.4538F, 0.0F);
        cube_r30.cubeList.add(new ModelBox(cube_r30, 22, 33, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.005F, false));

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(-0.4F, 0.0F, 4.05F);
        magazine.addChild(cube_r31);
        setRotationAngle(cube_r31, 0.0F, 0.6807F, 0.0F);
        cube_r31.cubeList.add(new ModelBox(cube_r31, 29, 6, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(-0.4F, 0.0F, -2.05F);
        magazine.addChild(cube_r32);
        setRotationAngle(cube_r32, 0.0F, -0.6807F, 0.0F);
        cube_r32.cubeList.add(new ModelBox(cube_r32, 35, 0, -0.4F, 0.0F, -0.3F, 2, 1, 3, 0.1F, false));
        cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 36, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(2.0F, 0.0F, 1.0F);
        magazine.addChild(cube_r33);
        setRotationAngle(cube_r33, 0.0F, -0.4538F, 0.0F);
        cube_r33.cubeList.add(new ModelBox(cube_r33, 21, 40, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
        body.render(scale);
        head.render(scale);
    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.head.rotateAngleX = headPitch * 0.017453292F;
//        float f = ((float)Math.PI / 4F);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
