package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Tyke extends ModelBiped {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer body;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bodyback;
	private final ModelRenderer cube_r9;
	private final ModelRenderer leftwing;
	private final ModelRenderer cube_r10;
	private final ModelRenderer rightwing;
	private final ModelRenderer cube_r11;
	private final ModelRenderer rightarm;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer rightarmjoint;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer leftarm;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer leftarmjoint;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer rightleg;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer rightlegjoint;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer leftleg;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer leftlegjoint;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;

	public Tyke() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 16.8F, -5.4F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.9F, 5.3F, -4.1F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.9835F, -0.0873F, 0.6452F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 4, 0, -2.0F, 0.0F, 1.0F, 2, 0, 4, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.9F, 5.3F, -4.1F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.9835F, 0.0873F, -0.6452F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 4, 5, 0.0F, 0.0F, 1.0F, 2, 0, 4, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.7F, 4.6F, -5.5F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.832F, -0.1013F, -0.4337F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 35, 0.0F, 0.0F, 1.0F, 1, 3, 6, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.2F, 3.3F, -5.5F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.7441F, -0.4261F, -0.1035F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 42, 0.0F, -1.0F, 3.0F, 3, 3, 4, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.2F, 3.3F, -5.5F);
		head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7441F, 0.4261F, 0.1035F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 43, -3.0F, -1.0F, 3.0F, 3, 3, 4, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(2.7F, 4.6F, -5.5F);
		head.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.832F, 0.1013F, 0.4337F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 0, -1.0F, 0.0F, 1.0F, 1, 3, 6, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.3F, -6.0F);
		head.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.636F, 0.6557F, 0.4528F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 29, -6.0F, 0.0F, 0.0F, 6, 3, 6, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(3.0F, 8.6F, 2.9F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.5F, 8.0F, -9.6F);
		body.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.2967F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 18, -7.0F, -1.0F, 0.0F, 7, 6, 11, 0.0F, false));

		bodyback = new ModelRenderer(this);
		bodyback.setRotationPoint(-3.0F, 4.8F, -2.0F);
		body.addChild(bodyback);
		

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(3.0F, -4.0F, 2.0F);
		bodyback.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.7156F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -6.0F, 0.0F, 0.0F, 6, 6, 12, 0.0F, false));

		leftwing = new ModelRenderer(this);
		leftwing.setRotationPoint(-0.9F, 5.7F, -7.0F);
		body.addChild(leftwing);
		

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.5F, -0.7F, -0.4F);
		leftwing.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.5971F, -0.1738F, 0.6036F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 18, -1.0F, 0.0F, 0.0F, 7, 0, 11, 0.0F, false));

		rightwing = new ModelRenderer(this);
		rightwing.setRotationPoint(-5.1F, 5.7F, -7.0F);
		body.addChild(rightwing);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.5F, -0.7F, -0.4F);
		rightwing.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.5971F, 0.1738F, -0.6036F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 0, -6.0F, 0.0F, 0.0F, 7, 0, 11, 0.0F, false));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-2.9F, 17.3F, -2.4F);
		

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-5.7F, -4.4F, -5.3F);
		rightarm.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.8029F, 0.7854F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 23, -3.0F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 2.2F, -0.3F);
		rightarm.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.2147F, -0.454F, 0.9093F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 15, -10.0F, -1.0F, 1.0F, 10, 1, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.8F, 0.0F);
		rightarm.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.1454F, -0.4791F, 0.7554F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 9, -10.0F, -2.0F, 0.0F, 11, 2, 2, 0.0F, false));

		rightarmjoint = new ModelRenderer(this);
		rightarmjoint.setRotationPoint(-6.5F, -5.6F, -3.6F);
		rightarm.addChild(rightarmjoint);
		

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(1.6F, 1.2F, -1.0F);
		rightarmjoint.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.2901F, 0.3536F, 0.1483F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 48, -2.0F, -1.0F, 0.0F, 0, 13, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.6F, 1.2F, -1.0F);
		rightarmjoint.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.3425F, 0.3536F, 0.1483F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 44, -2.0F, -1.0F, 0.0F, 2, 13, 1, 0.0F, false));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(2.9F, 17.3F, -2.4F);
		

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(5.7F, -4.4F, -5.3F);
		leftarm.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.8029F, -0.7854F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 39, 17, 0.0F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 2.2F, -0.3F);
		leftarm.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.2147F, 0.454F, -0.9093F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 36, 13, 0.0F, -1.0F, 1.0F, 10, 1, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 0.8F, 0.0F);
		leftarm.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.1454F, 0.4791F, -0.7554F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 35, -1.0F, -2.0F, 0.0F, 11, 2, 2, 0.0F, false));

		leftarmjoint = new ModelRenderer(this);
		leftarmjoint.setRotationPoint(6.5F, -5.6F, -3.6F);
		leftarm.addChild(leftarmjoint);
		

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.6F, 1.2F, -1.0F);
		leftarmjoint.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.2901F, -0.3536F, -0.1483F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 34, 48, 2.0F, -1.0F, 0.0F, 0, 13, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-0.6F, 1.2F, -1.0F);
		leftarmjoint.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.3425F, -0.3536F, -0.1483F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 14, 43, 0.0F, -1.0F, 0.0F, 2, 13, 1, 0.0F, false));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.9F, 17.3F, 3.6F);
		

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-7.4F, -4.7F, -2.2F);
		rightleg.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.9269F, 1.2529F, 0.6918F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 5, -2.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.2F, 1.6F, -0.3F);
		rightleg.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.198F, -0.2319F, 0.7378F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 48, 33, -6.0F, -1.0F, 1.0F, 6, 1, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-4.9F, -2.9F, -1.4F);
		rightleg.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.1461F, -0.1876F, 1.2206F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 48, 29, -3.0F, -2.0F, 0.0F, 4, 2, 2, -0.3F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, 0.8F, 0.0F);
		rightleg.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.0105F, -0.2371F, 0.5972F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 39, -6.0F, -2.0F, 0.0F, 7, 2, 2, -0.1F, false));

		rightlegjoint = new ModelRenderer(this);
		rightlegjoint.setRotationPoint(-5.5F, -5.5F, -0.6F);
		rightleg.addChild(rightlegjoint);
		

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.2F, 0.4F, -0.4F);
		rightlegjoint.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.0333F, 1.227F, 0.3859F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 32, 48, 0.0F, -1.0F, 0.0F, 0, 13, 1, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-1.3F, 0.4F, -1.0F);
		rightlegjoint.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.0857F, 1.227F, 0.3859F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 44, 42, -1.0F, -1.0F, 0.0F, 1, 13, 1, 0.0F, false));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.9F, 17.3F, 3.6F);
		

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(7.4F, -4.7F, -2.2F);
		leftleg.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.9269F, -1.2529F, -0.6918F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, 0.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-0.2F, 1.6F, -0.3F);
		leftleg.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.198F, 0.2319F, -0.7378F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 46, 0, 0.0F, -1.0F, 1.0F, 6, 1, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(4.9F, -2.9F, -1.4F);
		leftleg.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.1461F, 0.1876F, -1.2206F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 46, 2, -1.0F, -2.0F, 0.0F, 4, 2, 2, -0.3F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, 0.8F, 0.0F);
		leftleg.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.0105F, 0.2371F, -0.5972F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 34, 38, -1.0F, -2.0F, 0.0F, 7, 2, 2, -0.1F, false));

		leftlegjoint = new ModelRenderer(this);
		leftlegjoint.setRotationPoint(5.5F, -5.5F, -0.6F);
		leftleg.addChild(leftlegjoint);
		

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(1.2F, 0.4F, -0.4F);
		leftlegjoint.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.0333F, -1.227F, -0.3859F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 30, 48, 0.0F, -1.0F, 0.0F, 0, 13, 1, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(1.3F, 0.4F, -1.0F);
		leftlegjoint.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.0857F, -1.227F, -0.3859F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 26, 44, 0.0F, -1.0F, 0.0F, 1, 13, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		head.render(scale);
		body.render(scale);
		rightarm.render(scale);
		leftarm.render(scale);
		rightleg.render(scale);
		leftleg.render(scale);
	}
	
//	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
//    {
//        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
//        this.head.rotateAngleX = headPitch * 0.017453292F;
//        float f = ((float)Math.PI / 4F);
//        this.rightleg.rotateAngleZ = ((float)Math.PI * 4F);
//        this.leftleg.rotateAngleZ = ((float)Math.PI * 4F);
//        this.rightarm.rotateAngleZ = ((float)Math.PI * 4F);
//        this.leftarm.rotateAngleZ = -((float)Math.PI * 4F);
//        float f1 = -0.0F;
//        float f2 = 0.3926991F;
//        this.rightleg.rotateAngleY = ((float)Math.PI / 4F);
//        this.leftleg.rotateAngleY = -((float)Math.PI / 4F);
//        this.rightarm.rotateAngleY = -((float)Math.PI * 4F);
//        this.leftarm.rotateAngleY = ((float)Math.PI * 4F);
//        float f3 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + 0.0F) * 0.4F) * limbSwingAmount;
//        float f4 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + (float)Math.PI) * 0.4F) * limbSwingAmount;
//        float f5 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + ((float)Math.PI / 2F)) * 0.4F) * limbSwingAmount;
//        float f6 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + ((float)Math.PI * 3F / 2F)) * 0.4F) * limbSwingAmount;
//        float f7 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + 0.0F) * 0.4F) * limbSwingAmount;
//        float f8 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + (float)Math.PI) * 0.4F) * limbSwingAmount;
//        float f9 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + ((float)Math.PI / 2F)) * 0.4F) * limbSwingAmount;
//        float f10 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + ((float)Math.PI * 3F / 2F)) * 0.4F) * limbSwingAmount;
//        this.rightleg.rotateAngleY += f3;
//        this.leftleg.rotateAngleY += f3;
//        this.rightarm.rotateAngleY += f6;
//        this.leftarm.rotateAngleY += f6;
//        this.rightleg.rotateAngleZ += f7;
//        this.leftleg.rotateAngleZ += -f7;
//        this.rightarm.rotateAngleZ += f10;
//        this.leftarm.rotateAngleZ += f10;
//    }
	
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.head.rotateAngleX = headPitch * 0.017453292F;
        float f = ((float)Math.PI / 4F);
        // back right
        this.rightleg.rotateAngleZ = -((float)Math.PI * 4F);
        // back left
        this.leftleg.rotateAngleZ = /*-0.08119464F;*/ 0F;
        // front left
        this.leftarm.rotateAngleZ = /*-0.08119464F;*/ 0F;
        // front right
        this.rightarm.rotateAngleZ = -((float)Math.PI * 4F);
        this.rightleg.rotateAngleY = ((float)Math.PI * 4F);
        this.leftleg.rotateAngleY = /*0.2026991F;*/ 0F;
        this.leftarm.rotateAngleY = /*-0.1926991F;*/ 0F;
        this.rightarm.rotateAngleY = -((float)Math.PI * 4F);
        float f3 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + 0.0F) * 0.4F) * limbSwingAmount;
        float f4 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + (float)Math.PI) * 0.4F) * limbSwingAmount;
        float f5 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + ((float)Math.PI / 2F)) * 0.4F) * limbSwingAmount;
        float f6 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + ((float)Math.PI * 3F / 2F)) * 0.4F) * limbSwingAmount;
        float f7 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + 0.0F) * 0.4F) * limbSwingAmount;
        float f8 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + (float)Math.PI) * 0.4F) * limbSwingAmount;
        float f9 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + ((float)Math.PI / 2F)) * 0.4F) * limbSwingAmount;
        float f10 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + ((float)Math.PI * 3F / 2F)) * 0.4F) * limbSwingAmount;
        this.rightleg.rotateAngleY += f3;
        this.leftleg.rotateAngleY += -f4;
        this.leftarm.rotateAngleY += -f5;
        this.rightarm.rotateAngleY += f6;
        this.rightleg.rotateAngleZ += f7;
        this.leftleg.rotateAngleZ += -f8;
        this.leftarm.rotateAngleZ += -f9;
        this.rightarm.rotateAngleZ += f10;
    }

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}