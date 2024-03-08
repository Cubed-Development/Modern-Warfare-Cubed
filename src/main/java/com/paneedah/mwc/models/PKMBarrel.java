package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMBarrel extends ModelWithAttachments {
	private final ModelRenderer PKMBarrel;
	private final ModelRenderer piston;
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
	private final ModelRenderer barrel;
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
	private final ModelRenderer cube_r21;
	private final ModelRenderer MuzzleBrake;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;

	public PKMBarrel() {
		textureWidth = 400;
		textureHeight = 400;

		PKMBarrel = new ModelRenderer(this);
		PKMBarrel.setRotationPoint(-1.375F, -14.15F, -47.0F);
		

		piston = new ModelRenderer(this);
		piston.setRotationPoint(0.0F, 4.0F, 0.0F);
		PKMBarrel.addChild(piston);
		piston.cubeList.add(new ModelBox(piston, 148, 235, -1.475F, -1.8F, -12.0F, 3, 4, 13, 0.0F, false));
		piston.cubeList.add(new ModelBox(piston, 270, 60, -0.475F, -0.8F, -34.0F, 1, 1, 22, 0.0F, false));
		piston.cubeList.add(new ModelBox(piston, 185, 235, -0.775F, -0.6F, -34.0F, 1, 1, 22, 0.0F, false));
		piston.cubeList.add(new ModelBox(piston, 0, 232, -0.175F, 0.0F, -34.0F, 1, 1, 22, 0.0F, false));
		piston.cubeList.add(new ModelBox(piston, 63, 234, -0.775F, 0.0F, -34.0F, 1, 1, 22, 0.0F, false));
		piston.cubeList.add(new ModelBox(piston, 124, 235, -0.175F, -0.6F, -34.0F, 1, 1, 22, 0.0F, false));
		piston.cubeList.add(new ModelBox(piston, 0, 270, -0.475F, 0.2F, -34.0F, 1, 1, 22, 0.0F, false));
		piston.cubeList.add(new ModelBox(piston, 178, 31, 0.5F, -5.5F, -40.3F, 1, 1, 3, 0.0F, false));
		piston.cubeList.add(new ModelBox(piston, 140, 169, -0.8F, -5.65F, -40.3F, 2, 2, 3, 0.0F, false));
		piston.cubeList.add(new ModelBox(piston, 178, 27, -1.45F, -5.5F, -40.3F, 1, 1, 3, 0.0F, false));
		piston.cubeList.add(new ModelBox(piston, 80, 169, -1.15F, -5.65F, -40.3F, 2, 2, 3, 0.0F, false));
		piston.cubeList.add(new ModelBox(piston, 15, 178, 0.5F, -3.5F, -40.3F, 1, 1, 3, 0.0F, false));
		piston.cubeList.add(new ModelBox(piston, 168, 150, -0.8F, -4.35F, -40.3F, 2, 2, 3, 0.0F, false));
		piston.cubeList.add(new ModelBox(piston, 178, 19, -1.45F, -3.5F, -40.3F, 1, 1, 3, 0.0F, false));
		piston.cubeList.add(new ModelBox(piston, 168, 162, -1.0F, -3.95F, -40.3F, 2, 2, 3, 0.0F, false));
		piston.cubeList.add(new ModelBox(piston, 0, 77, -1.0F, -0.8F, -38.0F, 2, 2, 4, 0.0F, false));
		piston.cubeList.add(new ModelBox(piston, 22, 16, -1.0F, -2.8F, -38.3F, 2, 4, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.15F, -0.8F, -37.8F);
		piston.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 62, 129, -0.85F, -1.6F, -0.45F, 2, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 94, 29, -0.85F, -2.6F, -0.95F, 2, 3, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.15F, -3.8F, 20.7F);
		piston.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 168, 155, -1.0F, -0.55F, -61.0F, 2, 2, 3, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.2F, -3.8F, 20.7F);
		piston.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 168, -1.0F, -0.55F, -61.0F, 2, 2, 3, -0.002F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.15F, -4.2F, 20.7F);
		piston.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -1.5708F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 70, 169, -1.0F, -1.45F, -61.0F, 2, 2, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.2F, -4.2F, 20.7F);
		piston.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 1.5708F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 97, 169, -1.0F, -1.45F, -61.0F, 2, 2, 3, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.025F, 0.2F, -19.5F);
		piston.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 1.5708F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 246, 248, -0.5F, -1.0F, -14.5F, 1, 1, 22, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 246, 212, -0.5F, 0.0F, -14.5F, 1, 1, 22, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.025F, 0.2F, -19.5F);
		piston.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.6545F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 122, 42, -4.3F, -1.0F, 4.85F, 1, 1, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 122, 39, -4.3F, 0.0F, 4.85F, 1, 1, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.075F, 0.2F, -19.5F);
		piston.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -0.6545F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 122, 32, 3.3F, -1.0F, 4.85F, 1, 1, 2, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 122, 29, 3.3F, 0.0F, 4.85F, 1, 1, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.075F, 0.2F, -19.5F);
		piston.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.6545F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 121, 113, -0.8F, -4.0F, 5.2F, 1, 1, 2, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 121, 110, -0.2F, -4.0F, 5.2F, 1, 1, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.025F, 0.2F, -19.5F);
		piston.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.6545F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 123, 90, -0.2F, 3.0F, 5.2F, 1, 1, 2, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 123, 93, -0.8F, 3.0F, 5.2F, 1, 1, 2, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 0.0F, 0.0F);
		PKMBarrel.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 72, 72, -1.0F, -1.45F, -67.0F, 2, 2, 68, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 26, 168, -1.475F, -1.5F, -5.0F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 120, 163, -1.2F, -1.65F, -5.0F, 2, 2, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 168, 0.425F, -1.5F, -5.0F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 46, 158, -0.85F, -1.65F, -5.0F, 2, 2, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 163, 52, -1.475F, 0.5F, -5.0F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 101, 150, -1.2F, -0.35F, -5.0F, 2, 2, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 163, 59, 0.425F, 0.5F, -5.0F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 70, 157, -0.85F, -0.35F, -5.0F, 2, 2, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 144, 0, 0.3F, -1.3F, -67.0F, 1, 1, 68, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 140, 143, -1.275F, -1.3F, -67.0F, 1, 1, 68, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 140, 0.3F, 0.3F, -67.0F, 1, 1, 68, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 70, 142, -1.275F, 0.3F, -67.0F, 1, 1, 68, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 72, 2, -1.0F, -0.55F, -67.0F, 2, 2, 68, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 1.5708F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 70, -1.0F, -0.55F, -67.0F, 2, 2, 68, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -1.0F, -1.45F, -67.0F, 2, 2, 68, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.15F, 0.2F, 0.0F);
		barrel.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 1.5708F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 120, 150, -1.0F, -1.45F, -5.0F, 2, 2, 6, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.2F, 0.2F, 0.0F);
		barrel.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -1.5708F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 51, 148, -1.0F, -1.45F, -5.0F, 2, 2, 6, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(2.6031F, -3.7489F, -1.5F);
		barrel.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -0.1745F, -1.0472F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 122, 12, 2.1F, -0.5F, 1.075F, 5, 1, 3, -0.001F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(2.6031F, -3.7489F, -1.5F);
		barrel.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -1.0472F, -1.0472F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 111, 120, -0.5F, -0.5F, -2.0F, 5, 1, 3, -0.001F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(2.6031F, -3.7489F, -1.5F);
		barrel.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -0.7854F, -1.0472F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 90, 7.1F, -1.1F, -3.4F, 3, 2, 3, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(2.6031F, -3.7489F, -1.5F);
		barrel.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -1.0472F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 70, 193, 6.5F, -1.1F, 4.8F, 3, 2, 13, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(2.6031F, -3.7489F, -1.5F);
		barrel.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, -0.6109F, -1.0472F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 19, -2.9F, -0.5F, -2.3F, 11, 1, 3, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.15F, -0.2F, 0.0F);
		barrel.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -1.0472F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 114, 131, 1.3F, -0.15F, -5.0F, 2, 1, 6, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.15F, -0.2F, 0.0F);
		barrel.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -1.5708F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 30, 158, -1.0F, -0.55F, -5.0F, 2, 2, 6, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-0.2F, -0.2F, 0.0F);
		barrel.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 1.5708F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 160, 122, -1.0F, -0.55F, -5.0F, 2, 2, 6, 0.0F, false));

		MuzzleBrake = new ModelRenderer(this);
		MuzzleBrake.setRotationPoint(0.0F, 0.0F, -68.5F);
		barrel.addChild(MuzzleBrake);
		MuzzleBrake.cubeList.add(new ModelBox(MuzzleBrake, 170, 177, -0.825F, -1.95F, -1.5F, 1, 1, 3, 0.0F, false));
		MuzzleBrake.cubeList.add(new ModelBox(MuzzleBrake, 177, 90, -0.175F, 0.85F, -1.5F, 1, 1, 3, 0.0F, false));
		MuzzleBrake.cubeList.add(new ModelBox(MuzzleBrake, 177, 123, -0.825F, 0.85F, -1.5F, 1, 1, 3, 0.0F, false));
		MuzzleBrake.cubeList.add(new ModelBox(MuzzleBrake, 178, 1, -0.175F, -1.95F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, -0.05F, 0.0F);
		MuzzleBrake.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 2.3562F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 175, 152, -0.825F, -1.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 102, 175, -0.175F, 0.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 83, 175, -0.825F, 0.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 34, 175, -0.175F, -1.9F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, -0.05F, 0.0F);
		MuzzleBrake.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 1.5708F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 5, 176, -0.825F, -1.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 175, 164, -0.175F, 0.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 175, 157, -0.825F, 0.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 153, 175, -0.175F, -1.9F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, -0.05F, 0.0F);
		MuzzleBrake.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 10, 177, -0.825F, -1.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 176, 133, -0.175F, 0.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 176, 116, -0.825F, 0.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 107, 176, -0.175F, -1.9F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.025F, -0.05F, -3.5F);
		MuzzleBrake.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 2.3562F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 158, 31, -0.5F, 0.7F, -2.0F, 1, 1, 4, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 158, 26, -0.5F, -1.7F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.025F, -0.05F, -3.5F);
		MuzzleBrake.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 40, 158, -0.5F, 0.7F, -2.0F, 1, 1, 4, 0.0F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 56, 158, -0.5F, -1.7F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.025F, -0.05F, -6.0F);
		MuzzleBrake.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 3.1416F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 114, 115, -0.65F, 0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 78, 116, -0.3F, 0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 101, 115, -0.7F, -1.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 72, 116, -0.3F, -1.7F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.025F, -0.05F, -6.0F);
		MuzzleBrake.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 107, 90, -0.7F, -1.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 102, 74, -0.3F, 0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 102, 72, -0.65F, 0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 102, 41, -0.3F, -1.7F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.025F, -0.05F, -6.0F);
		MuzzleBrake.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -1.5708F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 78, 114, -0.7F, -1.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 72, 114, -0.3F, 0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 101, 113, -0.65F, 0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 64, 113, -0.3F, -1.7F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.025F, -0.05F, -6.0F);
		MuzzleBrake.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, -2.3562F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 115, 41, -0.7F, -1.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 115, 39, -0.3F, 0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 114, 113, -0.65F, 0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 114, 85, -0.3F, -1.7F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		PKMBarrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}