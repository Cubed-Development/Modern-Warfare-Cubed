package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ScorpionFrontSight extends ModelBase {
	private final ModelRenderer sight_rear;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r11;
	private final ModelRenderer sight_front;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r28;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer bone6;

	public ScorpionFrontSight() {
		textureWidth = 512;
		textureHeight = 256;

		sight_rear = new ModelRenderer(this);
		sight_rear.setRotationPoint(0.0F, 24.0F, 6.0F);
		sight_rear.cubeList.add(new ModelBox(sight_rear, 0, 0, -3.0F, -8.1321F, 2.0958F, 6, 2, 8, 0.0F, false));
		sight_rear.cubeList.add(new ModelBox(sight_rear, 0, 0, -1.5F, -9.2793F, 3.4575F, 3, 1, 5, 0.0F, false));
		sight_rear.cubeList.add(new ModelBox(sight_rear, 0, 0, -1.0F, -9.5293F, 4.9575F, 2, 1, 3, 0.0F, false));
		sight_rear.cubeList.add(new ModelBox(sight_rear, 0, 0, 1.5F, -11.0F, 3.0F, 1, 3, 3, 0.0F, false));
		sight_rear.cubeList.add(new ModelBox(sight_rear, 0, 0, 1.5F, -11.0F, 3.0F, 1, 3, 3, 0.0F, false));
		sight_rear.cubeList.add(new ModelBox(sight_rear, 0, 0, -2.5F, -11.0F, 3.0F, 1, 3, 3, 0.0F, false));
		sight_rear.cubeList.add(new ModelBox(sight_rear, 0, 0, -0.5F, -9.9557F, 6.0266F, 1, 1, 1, -0.3F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.0F, -9.1184F, 3.9795F);
		sight_rear.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -1.5F, -1.5F, 1, 3, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -4.5F, -1.5F, -1.5F, 1, 3, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.0F, -8.9109F, 6.3684F);
		sight_rear.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.6109F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.5F, -1.5F, -1.5F, 1, 2, 5, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -3.5F, -1.5F, 1.5F, 3, 2, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -4.5F, -1.5F, -1.5F, 1, 2, 5, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.0F, -9.2543F, 6.7075F);
		sight_rear.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3927F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.0F, -9.2543F, 6.7075F);
		sight_rear.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3927F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(2.25F, -9.0855F, 4.9044F);
		sight_rear.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -0.1309F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.5F, -1.9145F, -1.9044F, 1, 3, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.7481F, 2.2831F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.6109F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, -1.5F, 1.5F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, -1.5F, -0.5F, 1, 2, 2, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, -1.5F, -2.5F, 1, 3, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -0.3336F, -1.8786F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.25F, -9.0855F, 4.9044F);
		sight_rear.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.1309F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -0.5F, -1.9145F, -1.9044F, 1, 3, 3, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.7481F, 2.2831F);
		bone2.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.6109F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5F, -1.5F, 1.5F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5F, -1.5F, -0.5F, 1, 2, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5F, -1.5F, -2.5F, 1, 3, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -0.3336F, -1.8786F);
		bone2.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(2.0F, -8.9109F, 6.3684F);
		sight_rear.addChild(bone3);
		

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(1.0555F, -9.7612F, 6.7766F);
		sight_rear.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -1.6581F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -1.0F, -0.5F, -1.5F, 2, 1, 2, -0.3F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.0555F, -9.7612F, 6.7766F);
		sight_rear.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 1.5708F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, -1.0F, -0.5F, -1.5F, 2, 1, 2, -0.3F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, -11.0666F, 6.5266F);
		sight_rear.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -3.1416F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.3082F, -11.0053F, 6.5266F);
		sight_rear.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -2.7489F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.5696F, -10.8307F, 6.5266F);
		sight_rear.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -2.3562F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.7442F, -10.5694F, 6.5266F);
		sight_rear.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -1.9635F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.3082F, -11.0053F, 6.5266F);
		sight_rear.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 2.7489F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-0.5696F, -10.8307F, 6.5266F);
		sight_rear.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 2.3562F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.7442F, -10.5694F, 6.5266F);
		sight_rear.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 1.9635F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-0.8055F, -10.2612F, 6.5266F);
		sight_rear.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 1.5708F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-0.7442F, -9.9529F, 6.5266F);
		sight_rear.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 1.1781F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-0.5696F, -9.6916F, 6.5266F);
		sight_rear.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-0.3082F, -9.517F, 6.5266F);
		sight_rear.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 0.3927F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.8055F, -10.2612F, 6.5266F);
		sight_rear.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -1.5708F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.7442F, -9.9529F, 6.5266F);
		sight_rear.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -1.1781F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.5696F, -9.6916F, 6.5266F);
		sight_rear.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.3082F, -9.517F, 6.5266F);
		sight_rear.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.3927F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		sight_front = new ModelRenderer(this);
		sight_front.setRotationPoint(0.0F, 24.0F, -19.0F);
		sight_front.cubeList.add(new ModelBox(sight_front, 0, 0, -3.0F, -8.1321F, 3.0958F, 6, 2, 7, 0.0F, false));
		sight_front.cubeList.add(new ModelBox(sight_front, 0, 0, -1.5F, -8.7057F, 4.2766F, 3, 1, 5, 0.0F, false));
		sight_front.cubeList.add(new ModelBox(sight_front, 0, 0, -0.5F, -10.4557F, 4.7766F, 1, 2, 1, -0.3F, false));
		sight_front.cubeList.add(new ModelBox(sight_front, 0, 0, 1.5F, -11.0F, 4.0F, 1, 3, 2, 0.0F, false));
		sight_front.cubeList.add(new ModelBox(sight_front, 0, 0, 1.5F, -11.0F, 4.0F, 1, 3, 2, 0.0F, false));
		sight_front.cubeList.add(new ModelBox(sight_front, 0, 0, -2.5F, -11.0F, 4.0F, 1, 3, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(2.0F, -9.1184F, 4.9795F);
		sight_front.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3054F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -0.5F, -1.5F, -1.5F, 1, 3, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -4.5F, -1.5F, -1.5F, 1, 3, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.0F, -8.9109F, 6.3684F);
		sight_front.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.6109F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.5F, -1.5F, -1.5F, 1, 2, 5, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -3.5F, -1.5F, 2.5F, 3, 2, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -4.5F, -1.5F, -1.5F, 1, 2, 5, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, -8.4557F, 5.2766F);
		sight_front.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, -0.7854F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, -0.5F, -1.0F, -0.5F, 1, 1, 1, -0.2F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(2.25F, -9.0855F, 4.9044F);
		sight_front.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.1309F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, -0.5F, -1.9145F, -0.9044F, 1, 3, 2, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, 0.7481F, 2.2831F);
		bone4.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.6109F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 0, -0.5F, -1.5F, 1.5F, 1, 1, 1, 0.0F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 0, -0.5F, -1.5F, -0.5F, 1, 2, 2, 0.0F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 0, -0.5F, -1.5F, -2.5F, 1, 3, 2, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, -0.3336F, -1.8786F);
		bone4.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.3054F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 0, -0.5F, -1.8007F, 0.4537F, 1, 3, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.5F, -8.8355F, 4.9044F);
		sight_front.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, -0.2182F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -0.5F, -1.9145F, -0.9044F, 1, 3, 2, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, 0.7481F, 2.2831F);
		bone7.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.6109F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 0, -0.5F, -1.5F, 1.5F, 1, 1, 1, 0.0F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 0, -0.5F, -1.5F, -0.5F, 1, 2, 2, 0.0F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 0, -0.5F, -1.5F, -2.5F, 1, 3, 2, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, -0.3336F, -1.8786F);
		bone7.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.3054F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 0, -0.5F, -1.8007F, 0.4537F, 1, 3, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-2.25F, -9.0855F, 4.9044F);
		sight_front.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.1309F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -0.5F, -1.9145F, -0.9044F, 1, 3, 2, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, 0.7481F, 2.2831F);
		bone5.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.6109F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 0, -0.5F, -1.5F, 1.5F, 1, 1, 1, 0.0F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 0, -0.5F, -1.5F, -0.5F, 1, 2, 2, 0.0F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 0, -0.5F, -1.5F, -2.5F, 1, 3, 2, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, -0.3336F, -1.8786F);
		bone5.addChild(cube_r34);
		setRotationAngle(cube_r34, -0.3054F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 0, -0.5F, -1.8007F, 0.4537F, 1, 3, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(1.5F, -8.8355F, 4.9044F);
		sight_front.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, 0.2182F);
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, -0.5F, -1.9145F, -0.9044F, 1, 3, 2, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.0F, 0.7481F, 2.2831F);
		bone8.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.6109F, 0.0F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 0, -0.5F, -1.5F, 1.5F, 1, 1, 1, 0.0F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 0, -0.5F, -1.5F, -0.5F, 1, 2, 2, 0.0F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 0, -0.5F, -1.5F, -2.5F, 1, 3, 2, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.0F, -0.3336F, -1.8786F);
		bone8.addChild(cube_r36);
		setRotationAngle(cube_r36, -0.3054F, 0.0F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 0, -0.5F, -1.8007F, 0.4537F, 1, 3, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(2.0F, -8.9109F, 6.3684F);
		sight_front.addChild(bone6);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		sight_rear.render(f5);
		sight_front.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
