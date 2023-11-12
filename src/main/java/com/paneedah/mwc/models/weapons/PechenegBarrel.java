package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PechenegBarrel extends ModelWithAttachments {
	private final ModelRenderer PenhenegBarrel;
	private final ModelRenderer piston2;
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
	private final ModelRenderer barrel21;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer MuzzleBrake2;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;

	public PechenegBarrel() {
		textureWidth = 400;
		textureHeight = 400;

		PenhenegBarrel = new ModelRenderer(this);
		PenhenegBarrel.setRotationPoint(-1.375F, -14.15F, -47.0F);
		

		piston2 = new ModelRenderer(this);
		piston2.setRotationPoint(0.0F, 4.0F, 0.0F);
		PenhenegBarrel.addChild(piston2);
		piston2.cubeList.add(new ModelBox(piston2, 234, 156, -1.475F, -1.8F, -12.0F, 3, 4, 13, 0.0F, false));
		piston2.cubeList.add(new ModelBox(piston2, 214, 23, -0.475F, -0.8F, -34.0F, 1, 1, 22, 0.0F, false));
		piston2.cubeList.add(new ModelBox(piston2, 214, 0, -0.775F, -0.6F, -34.0F, 1, 1, 22, 0.0F, false));
		piston2.cubeList.add(new ModelBox(piston2, 185, 212, -0.175F, 0.0F, -34.0F, 1, 1, 22, 0.0F, false));
		piston2.cubeList.add(new ModelBox(piston2, 124, 212, -0.775F, 0.0F, -34.0F, 1, 1, 22, 0.0F, false));
		piston2.cubeList.add(new ModelBox(piston2, 63, 211, -0.175F, -0.6F, -34.0F, 1, 1, 22, 0.0F, false));
		piston2.cubeList.add(new ModelBox(piston2, 0, 209, -0.475F, 0.2F, -34.0F, 1, 1, 22, 0.0F, false));
		piston2.cubeList.add(new ModelBox(piston2, 0, 175, 0.5F, -5.5F, -40.3F, 1, 1, 3, 0.0F, false));
		piston2.cubeList.add(new ModelBox(piston2, 158, 14, -0.8F, -5.65F, -40.3F, 2, 2, 3, 0.0F, false));
		piston2.cubeList.add(new ModelBox(piston2, 165, 174, -1.45F, -5.5F, -40.3F, 1, 1, 3, 0.0F, false));
		piston2.cubeList.add(new ModelBox(piston2, 157, 7, -1.15F, -5.65F, -40.3F, 2, 2, 3, 0.0F, false));
		piston2.cubeList.add(new ModelBox(piston2, 148, 174, 0.5F, -3.5F, -40.3F, 1, 1, 3, 0.0F, false));
		piston2.cubeList.add(new ModelBox(piston2, 156, 147, -0.8F, -4.35F, -40.3F, 2, 2, 3, 0.0F, false));
		piston2.cubeList.add(new ModelBox(piston2, 140, 174, -1.45F, -3.5F, -40.3F, 1, 1, 3, 0.0F, false));
		piston2.cubeList.add(new ModelBox(piston2, 156, 102, -1.0F, -3.95F, -40.3F, 2, 2, 3, 0.0F, false));
		piston2.cubeList.add(new ModelBox(piston2, 72, 19, -1.0F, -0.8F, -38.0F, 2, 2, 4, 0.0F, false));
		piston2.cubeList.add(new ModelBox(piston2, 7, 0, -1.0F, -2.8F, -38.3F, 2, 4, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.15F, -0.8F, -37.8F);
		piston2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 125, 23, -0.85F, -1.6F, -0.45F, 2, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 86, 43, -0.85F, -2.6F, -0.95F, 2, 3, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.15F, -3.8F, 20.7F);
		piston2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 156, 142, -1.0F, -0.55F, -61.0F, 2, 2, 3, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.2F, -3.8F, 20.7F);
		piston2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 157, 2, -1.0F, -0.55F, -61.0F, 2, 2, 3, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.15F, -4.2F, 20.7F);
		piston2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -1.5708F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 157, 108, -1.0F, -1.45F, -61.0F, 2, 2, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.2F, -4.2F, 20.7F);
		piston2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 1.5708F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 158, 19, -1.0F, -1.45F, -61.0F, 2, 2, 3, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.025F, 0.2F, -19.5F);
		piston2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 1.5708F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 210, 133, -0.5F, -1.0F, -14.5F, 1, 1, 22, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 210, 156, -0.5F, 0.0F, -14.5F, 1, 1, 22, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.025F, 0.2F, -19.5F);
		piston2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.6545F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 113, 29, -4.3F, -1.0F, 4.85F, 1, 1, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 118, -4.3F, 0.0F, 4.85F, 1, 1, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.075F, 0.2F, -19.5F);
		piston2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -0.6545F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 113, 32, 3.3F, -1.0F, 4.85F, 1, 1, 2, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 114, 3.3F, 0.0F, 4.85F, 1, 1, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.075F, 0.2F, -19.5F);
		piston2.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.6545F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 117, 19, -0.8F, -4.0F, 5.2F, 1, 1, 2, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 117, 22, -0.2F, -4.0F, 5.2F, 1, 1, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.025F, 0.2F, -19.5F);
		piston2.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.6545F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 118, -0.2F, 3.0F, 5.2F, 1, 1, 2, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 118, -0.8F, 3.0F, 5.2F, 1, 1, 2, 0.0F, false));

		barrel21 = new ModelRenderer(this);
		barrel21.setRotationPoint(0.0F, 0.0F, 0.0F);
		PenhenegBarrel.addChild(barrel21);
		barrel21.cubeList.add(new ModelBox(barrel21, 210, 130, -1.0F, -1.45F, -58.0F, 2, 2, 59, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 101, 160, -1.475F, -1.5F, -5.0F, 1, 1, 6, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 144, 122, -1.2F, -1.65F, -5.0F, 2, 2, 6, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 173, 26, -1.0F, -1.95F, -17.0F, 2, 1, 17, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 118, 58, -0.5F, -6.95F, -17.0F, 1, 5, 3, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 173, 0, -1.0F, -7.45F, -17.0F, 2, 1, 17, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 62, 0, -1.0F, -6.05F, 0.4F, 2, 3, 1, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 80, 159, 0.425F, -1.5F, -5.0F, 1, 1, 6, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 101, 142, -0.85F, -1.65F, -5.0F, 2, 2, 6, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 158, 133, -1.475F, 0.5F, -5.0F, 1, 1, 6, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 30, 140, -1.2F, -0.35F, -5.0F, 2, 2, 6, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 144, 133, 0.425F, 0.5F, -5.0F, 1, 1, 6, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 0, 130, -0.85F, -0.35F, -5.0F, 2, 2, 6, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 214, 0, 0.3F, -1.3F, -58.0F, 1, 1, 59, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 185, 213, -1.275F, -1.3F, -58.0F, 1, 1, 59, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 124, 212, 0.3F, 0.3F, -58.0F, 1, 1, 59, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 63, 211, -1.275F, 0.3F, -58.0F, 1, 1, 59, 0.0F, false));
		barrel21.cubeList.add(new ModelBox(barrel21, 0, 209, -1.0F, -0.55F, -58.0F, 2, 2, 59, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel21.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 1.5708F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 144, 72, -1.0F, -0.55F, -58.0F, 2, 2, 59, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 207, 69, -1.0F, -1.45F, -58.0F, 2, 2, 59, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.15F, 0.2F, 0.0F);
		barrel21.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 1.5708F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 130, -1.0F, -1.45F, -5.0F, 2, 2, 6, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.2F, 0.2F, 0.0F);
		barrel21.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -1.5708F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 51, 140, -1.0F, -1.45F, -5.0F, 2, 2, 6, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.15F, -0.2F, 0.0F);
		barrel21.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -1.5708F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 120, 142, -1.0F, -0.55F, -5.0F, 2, 2, 6, -0.001F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, -6.95F, -8.0F);
		barrel21.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.7854F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 95, 6, -0.6F, 2.1F, -2.6F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 95, 8, -0.6F, -0.9F, 0.4F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 95, 13, -0.6F, -3.9F, 3.4F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 70, -1.0F, -3.9F, 8.4F, 2, 3, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 178, 137, -1.0F, -6.0F, 5.3F, 2, 1, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, -6.95F, -8.0F);
		barrel21.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.2618F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 144, 72, -1.0F, -2.8F, -32.5F, 2, 1, 24, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.2F, -0.2F, 0.0F);
		barrel21.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 1.5708F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 148, -1.0F, -0.55F, -5.0F, 2, 2, 6, -0.001F, false));

		MuzzleBrake2 = new ModelRenderer(this);
		MuzzleBrake2.setRotationPoint(0.0F, 0.0F, -68.5F);
		barrel21.addChild(MuzzleBrake2);
		MuzzleBrake2.cubeList.add(new ModelBox(MuzzleBrake2, 97, 174, -0.825F, -1.95F, 7.5F, 1, 1, 3, 0.0F, false));
		MuzzleBrake2.cubeList.add(new ModelBox(MuzzleBrake2, 173, 18, -0.175F, 0.85F, 7.5F, 1, 1, 3, 0.0F, false));
		MuzzleBrake2.cubeList.add(new ModelBox(MuzzleBrake2, 173, 12, -0.825F, 0.85F, 7.5F, 1, 1, 3, 0.0F, false));
		MuzzleBrake2.cubeList.add(new ModelBox(MuzzleBrake2, 11, 173, -0.175F, -1.95F, 7.5F, 1, 1, 3, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, -0.05F, 9.0F);
		MuzzleBrake2.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 2.3562F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 173, 26, -0.825F, -1.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 173, 30, -0.175F, 0.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 173, 34, -0.825F, 0.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 173, 38, -0.175F, -1.9F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, -0.05F, 9.0F);
		MuzzleBrake2.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 1.5708F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 173, 44, -0.825F, -1.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 173, 127, -0.175F, 0.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 172, 173, -0.825F, 0.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 16, 174, -0.175F, -1.9F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, -0.05F, 9.0F);
		MuzzleBrake2.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 50, 174, -0.825F, -1.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 58, 174, -0.175F, 0.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 70, 174, -0.825F, 0.9F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 78, 174, -0.175F, -1.9F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.025F, -0.05F, 5.5F);
		MuzzleBrake2.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 2.3562F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 154, 122, -0.5F, 0.7F, -2.0F, 1, 1, 4, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 156, 83, -0.5F, -1.7F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.025F, -0.05F, 5.5F);
		MuzzleBrake2.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 156, 88, -0.5F, 0.7F, -2.0F, 1, 1, 4, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 156, 97, -0.5F, -1.7F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.025F, -0.05F, 3.0F);
		MuzzleBrake2.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 3.1416F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 95, 15, -0.65F, 0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 96, 19, -0.3F, 0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 30, 101, -0.7F, -1.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 50, 101, -0.3F, -1.7F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.025F, -0.05F, 3.0F);
		MuzzleBrake2.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 96, 21, -0.7F, -1.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 96, 26, -0.3F, 0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 96, 35, -0.65F, 0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 96, 82, -0.3F, -1.7F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.025F, -0.05F, 3.0F);
		MuzzleBrake2.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -1.5708F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 96, 95, -0.7F, -1.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 14, 99, -0.3F, 0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 24, 99, -0.65F, 0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 30, 99, -0.3F, -1.7F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.025F, -0.05F, 3.0F);
		MuzzleBrake2.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -2.3562F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 50, 99, -0.7F, -1.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 63, 99, -0.3F, 0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 14, 101, -0.65F, 0.7F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 24, 101, -0.3F, -1.7F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		PenhenegBarrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}