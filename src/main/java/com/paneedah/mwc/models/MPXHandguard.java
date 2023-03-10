package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MPXHandguard extends ModelWithAttachments {
	private final QRenderer mpx_handguard;
	private final ModelRenderer mpx_handguard_left_r1;
	private final ModelRenderer mpx_handguard_left_r2;
	private final ModelRenderer mpx_handguard_left_r3;
	private final ModelRenderer mpx_handguard_left_r4;
	private final ModelRenderer mpx_handguard_left_r5;
	private final ModelRenderer mpx_handguard_left_r6;
	private final ModelRenderer mpx_handguard_left_r7;
	private final ModelRenderer mpx_handguard_left_r8;
	private final ModelRenderer mpx_handguard_left_r9;
	private final ModelRenderer mpx_handguard_left_r10;
	private final ModelRenderer mpx_handguard_left_r11;
	private final ModelRenderer mpx_handguard_left_r12;
	private final ModelRenderer mpx_handguard_left_r13;
	private final ModelRenderer mpx_handguard_left_r14;
	private final ModelRenderer mpx_handguard_left_r15;
	private final ModelRenderer mpx_handguard_left_r16;
	private final ModelRenderer mpx_handguard_left_r17;
	private final ModelRenderer mpx_handguard_left_r18;
	private final ModelRenderer mpx_handguard_left_r19;
	private final ModelRenderer mpx_handguard_left_r20;
	private final ModelRenderer mpx_handguard_left_r21;
	private final ModelRenderer mpx_handguard_left_r22;
	private final ModelRenderer mpx_handguard_left_r23;
	private final ModelRenderer mpx_handguard_left_r24;
	private final ModelRenderer mpx_handguard_left_r25;
	private final ModelRenderer mpx_handguard_left_r26;
	private final ModelRenderer mpx_handguard_left_r27;
	private final ModelRenderer mpx_handguard_left_r28;
	private final ModelRenderer mpx_handguard_left_r29;
	private final ModelRenderer mpx_handguard_left_r30;
	private final ModelRenderer mpx_handguard_left_r31;
	private final ModelRenderer mpx_handguard_left_r32;
	private final ModelRenderer mpx_handguard_left_r33;
	private final ModelRenderer mpx_handguard_left_r34;
	private final ModelRenderer mpx_handguard_left_r35;
	private final ModelRenderer mpx_handguard_left_r36;
	private final ModelRenderer mpx_handguard_left_r37;
	private final ModelRenderer mpx_handguard_left_r38;
	private final ModelRenderer barrel;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public MPXHandguard() {
		textureWidth = 256;
		textureHeight = 256;

		mpx_handguard = new QRenderer(this);
		mpx_handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 40, 11, 1.0F, -40.0F, -28.5F, 1, 3, 3, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 0, 24, -5.0F, -40.0F, -28.5F, 1, 3, 3, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 57, 74, 1.0F, -40.0F, -46.5F, 1, 3, 1, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 52, 23, -3.4F, -35.5F, -46.5F, 3, 1, 19, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 62, 27, -3.4F, -34.5F, -46.25F, 3, 3, 1, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 49, 74, -0.65F, -35.5F, -46.5F, 1, 1, 19, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 69, 8, -5.0F, -40.0F, -46.5F, 1, 3, 1, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 140, 18, 1.0F, -40.0F, -45.5F, 1, 1, 17, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 100, 20, -5.0F, -40.0F, -45.5F, 1, 1, 17, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 140, 0, 1.0F, -38.0F, -45.5F, 1, 1, 17, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 48, 120, -5.0F, -38.0F, -45.5F, 1, 1, 17, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 117, 42, 1.0F, -39.0F, -43.0F, 1, 1, 1, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 52, 115, -5.0F, -39.0F, -43.0F, 1, 1, 1, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 23, 116, 1.0F, -39.0F, -39.5F, 1, 1, 1, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 58, 115, -5.0F, -39.0F, -39.5F, 1, 1, 1, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 4, 116, 1.0F, -39.0F, -36.0F, 1, 1, 1, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 115, 67, -5.0F, -39.0F, -36.0F, 1, 1, 1, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 0, 116, 1.0F, -39.0F, -32.5F, 1, 1, 1, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 83, 115, -5.0F, -39.0F, -32.5F, 1, 1, 1, 0.0F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 115, 113, 1.0F, -39.0F, -29.0F, 1, 1, 1, 0.001F, false));
		mpx_handguard.cubeList.add(new ModelBox(mpx_handguard, 115, 70, -5.0F, -39.0F, -29.0F, 1, 1, 1, 0.001F, false));

		mpx_handguard_left_r1 = new ModelRenderer(this);
		mpx_handguard_left_r1.setRotationPoint(2.0F, -40.0F, -46.5F);
		mpx_handguard.addChild(mpx_handguard_left_r1);
		setRotationAngle(mpx_handguard_left_r1, 0.0F, 0.0F, 0.9948F);
		mpx_handguard_left_r1.cubeList.add(new ModelBox(mpx_handguard_left_r1, 71, 185, -2.0F, 0.0F, 0.0F, 2, 1, 21, 0.001F, false));

		mpx_handguard_left_r2 = new ModelRenderer(this);
		mpx_handguard_left_r2.setRotationPoint(-4.0F, -38.3F, -42.2F);
		mpx_handguard.addChild(mpx_handguard_left_r2);
		setRotationAngle(mpx_handguard_left_r2, -0.1047F, 0.0F, 0.0F);
		mpx_handguard_left_r2.cubeList.add(new ModelBox(mpx_handguard_left_r2, 12, 120, -1.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		mpx_handguard_left_r2.cubeList.add(new ModelBox(mpx_handguard_left_r2, 81, 120, 4.999F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r3 = new ModelRenderer(this);
		mpx_handguard_left_r3.setRotationPoint(-4.0F, -38.7F, -42.2F);
		mpx_handguard.addChild(mpx_handguard_left_r3);
		setRotationAngle(mpx_handguard_left_r3, 0.1047F, 0.0F, 0.0F);
		mpx_handguard_left_r3.cubeList.add(new ModelBox(mpx_handguard_left_r3, 120, 12, -1.001F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		mpx_handguard_left_r3.cubeList.add(new ModelBox(mpx_handguard_left_r3, 110, 120, 4.999F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r4 = new ModelRenderer(this);
		mpx_handguard_left_r4.setRotationPoint(-4.0F, -38.3F, -35.2F);
		mpx_handguard.addChild(mpx_handguard_left_r4);
		setRotationAngle(mpx_handguard_left_r4, -0.1047F, 0.0F, 0.0F);
		mpx_handguard_left_r4.cubeList.add(new ModelBox(mpx_handguard_left_r4, 48, 120, -1.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		mpx_handguard_left_r4.cubeList.add(new ModelBox(mpx_handguard_left_r4, 67, 120, 4.999F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r5 = new ModelRenderer(this);
		mpx_handguard_left_r5.setRotationPoint(-4.0F, -38.7F, -35.2F);
		mpx_handguard.addChild(mpx_handguard_left_r5);
		setRotationAngle(mpx_handguard_left_r5, 0.1047F, 0.0F, 0.0F);
		mpx_handguard_left_r5.cubeList.add(new ModelBox(mpx_handguard_left_r5, 120, 40, -1.001F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		mpx_handguard_left_r5.cubeList.add(new ModelBox(mpx_handguard_left_r5, 37, 121, 4.999F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r6 = new ModelRenderer(this);
		mpx_handguard_left_r6.setRotationPoint(-4.0F, -38.3F, -45.8F);
		mpx_handguard.addChild(mpx_handguard_left_r6);
		setRotationAngle(mpx_handguard_left_r6, -0.1047F, 0.0F, 0.0F);
		mpx_handguard_left_r6.cubeList.add(new ModelBox(mpx_handguard_left_r6, 120, 6, -1.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		mpx_handguard_left_r6.cubeList.add(new ModelBox(mpx_handguard_left_r6, 87, 120, 4.999F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r7 = new ModelRenderer(this);
		mpx_handguard_left_r7.setRotationPoint(-4.0F, -38.7F, -45.8F);
		mpx_handguard.addChild(mpx_handguard_left_r7);
		setRotationAngle(mpx_handguard_left_r7, 0.1047F, 0.0F, 0.0F);
		mpx_handguard_left_r7.cubeList.add(new ModelBox(mpx_handguard_left_r7, 120, 9, -1.001F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		mpx_handguard_left_r7.cubeList.add(new ModelBox(mpx_handguard_left_r7, 98, 120, 4.999F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r8 = new ModelRenderer(this);
		mpx_handguard_left_r8.setRotationPoint(-4.0F, -38.3F, -38.8F);
		mpx_handguard.addChild(mpx_handguard_left_r8);
		setRotationAngle(mpx_handguard_left_r8, -0.1047F, 0.0F, 0.0F);
		mpx_handguard_left_r8.cubeList.add(new ModelBox(mpx_handguard_left_r8, 120, 15, -1.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		mpx_handguard_left_r8.cubeList.add(new ModelBox(mpx_handguard_left_r8, 73, 120, 4.999F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r9 = new ModelRenderer(this);
		mpx_handguard_left_r9.setRotationPoint(-4.0F, -38.7F, -38.8F);
		mpx_handguard.addChild(mpx_handguard_left_r9);
		setRotationAngle(mpx_handguard_left_r9, 0.1047F, 0.0F, 0.0F);
		mpx_handguard_left_r9.cubeList.add(new ModelBox(mpx_handguard_left_r9, 21, 120, -1.001F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		mpx_handguard_left_r9.cubeList.add(new ModelBox(mpx_handguard_left_r9, 104, 120, 4.999F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r10 = new ModelRenderer(this);
		mpx_handguard_left_r10.setRotationPoint(-4.0F, -38.3F, -31.8F);
		mpx_handguard.addChild(mpx_handguard_left_r10);
		setRotationAngle(mpx_handguard_left_r10, -0.1047F, 0.0F, 0.0F);
		mpx_handguard_left_r10.cubeList.add(new ModelBox(mpx_handguard_left_r10, 27, 120, -1.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		mpx_handguard_left_r10.cubeList.add(new ModelBox(mpx_handguard_left_r10, 54, 120, 4.999F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r11 = new ModelRenderer(this);
		mpx_handguard_left_r11.setRotationPoint(-4.0F, -38.7F, -31.8F);
		mpx_handguard.addChild(mpx_handguard_left_r11);
		setRotationAngle(mpx_handguard_left_r11, 0.1047F, 0.0F, 0.0F);
		mpx_handguard_left_r11.cubeList.add(new ModelBox(mpx_handguard_left_r11, 33, 120, -1.001F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		mpx_handguard_left_r11.cubeList.add(new ModelBox(mpx_handguard_left_r11, 58, 121, 4.999F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r12 = new ModelRenderer(this);
		mpx_handguard_left_r12.setRotationPoint(-0.4F, -34.55F, -42.55F);
		mpx_handguard.addChild(mpx_handguard_left_r12);
		setRotationAngle(mpx_handguard_left_r12, -1.1868F, 0.0F, 0.0F);
		mpx_handguard_left_r12.cubeList.add(new ModelBox(mpx_handguard_left_r12, 99, 85, -3.0F, 0.0F, -1.0F, 3, 2, 1, 0.0F, false));

		mpx_handguard_left_r13 = new ModelRenderer(this);
		mpx_handguard_left_r13.setRotationPoint(-0.4F, -31.35F, -44.85F);
		mpx_handguard.addChild(mpx_handguard_left_r13);
		setRotationAngle(mpx_handguard_left_r13, -0.192F, 0.0F, 0.0F);
		mpx_handguard_left_r13.cubeList.add(new ModelBox(mpx_handguard_left_r13, 36, 50, -3.001F, -4.0F, -1.0F, 3, 4, 1, 0.0F, false));

		mpx_handguard_left_r14 = new ModelRenderer(this);
		mpx_handguard_left_r14.setRotationPoint(2.0F, -37.0F, -25.5F);
		mpx_handguard.addChild(mpx_handguard_left_r14);
		setRotationAngle(mpx_handguard_left_r14, 0.0F, 0.7854F, 0.576F);
		mpx_handguard_left_r14.cubeList.add(new ModelBox(mpx_handguard_left_r14, 30, 87, -1.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

		mpx_handguard_left_r15 = new ModelRenderer(this);
		mpx_handguard_left_r15.setRotationPoint(-5.0F, -37.0F, -25.5F);
		mpx_handguard.addChild(mpx_handguard_left_r15);
		setRotationAngle(mpx_handguard_left_r15, 0.0F, -0.7854F, -0.576F);
		mpx_handguard_left_r15.cubeList.add(new ModelBox(mpx_handguard_left_r15, 82, 0, 0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

		mpx_handguard_left_r16 = new ModelRenderer(this);
		mpx_handguard_left_r16.setRotationPoint(-5.0F, -40.0F, -25.5F);
		mpx_handguard.addChild(mpx_handguard_left_r16);
		setRotationAngle(mpx_handguard_left_r16, 0.0F, 0.7854F, 0.576F);
		mpx_handguard_left_r16.cubeList.add(new ModelBox(mpx_handguard_left_r16, 23, 86, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		mpx_handguard_left_r17 = new ModelRenderer(this);
		mpx_handguard_left_r17.setRotationPoint(2.0F, -40.0F, -25.5F);
		mpx_handguard.addChild(mpx_handguard_left_r17);
		setRotationAngle(mpx_handguard_left_r17, 0.0F, -0.7854F, -0.576F);
		mpx_handguard_left_r17.cubeList.add(new ModelBox(mpx_handguard_left_r17, 88, 74, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		mpx_handguard_left_r18 = new ModelRenderer(this);
		mpx_handguard_left_r18.setRotationPoint(-5.0F, -37.0F, -25.5F);
		mpx_handguard.addChild(mpx_handguard_left_r18);
		setRotationAngle(mpx_handguard_left_r18, 0.0F, 0.7854F, 0.0F);
		mpx_handguard_left_r18.cubeList.add(new ModelBox(mpx_handguard_left_r18, 66, 64, 0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

		mpx_handguard_left_r19 = new ModelRenderer(this);
		mpx_handguard_left_r19.setRotationPoint(2.0F, -37.0F, -25.5F);
		mpx_handguard.addChild(mpx_handguard_left_r19);
		setRotationAngle(mpx_handguard_left_r19, 0.0F, -0.7854F, 0.0F);
		mpx_handguard_left_r19.cubeList.add(new ModelBox(mpx_handguard_left_r19, 68, 0, -1.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

		mpx_handguard_left_r20 = new ModelRenderer(this);
		mpx_handguard_left_r20.setRotationPoint(-5.0F, -40.0F, -46.5F);
		mpx_handguard.addChild(mpx_handguard_left_r20);
		setRotationAngle(mpx_handguard_left_r20, 0.0F, 0.0F, -0.9948F);
		mpx_handguard_left_r20.cubeList.add(new ModelBox(mpx_handguard_left_r20, 25, 185, 0.0F, 0.0F, 0.0F, 2, 1, 21, 0.001F, false));

		mpx_handguard_left_r21 = new ModelRenderer(this);
		mpx_handguard_left_r21.setRotationPoint(-5.0F, -37.0F, -60.5F);
		mpx_handguard.addChild(mpx_handguard_left_r21);
		setRotationAngle(mpx_handguard_left_r21, 0.0F, 0.0F, 0.9948F);
		mpx_handguard_left_r21.cubeList.add(new ModelBox(mpx_handguard_left_r21, 163, 72, 2.0F, -1.0F, 15.0F, 1, 1, 13, 0.0F, false));
		mpx_handguard_left_r21.cubeList.add(new ModelBox(mpx_handguard_left_r21, 164, 122, 0.0F, -1.0F, 15.0F, 1, 1, 13, 0.0F, false));
		mpx_handguard_left_r21.cubeList.add(new ModelBox(mpx_handguard_left_r21, 36, 55, 0.0F, -1.0F, 14.0F, 3, 1, 1, 0.001F, false));
		mpx_handguard_left_r21.cubeList.add(new ModelBox(mpx_handguard_left_r21, 114, 98, 1.0F, -1.0F, 17.5F, 1, 1, 1, 0.0F, false));
		mpx_handguard_left_r21.cubeList.add(new ModelBox(mpx_handguard_left_r21, 114, 105, 1.0F, -1.0F, 21.0F, 1, 1, 1, 0.0F, false));
		mpx_handguard_left_r21.cubeList.add(new ModelBox(mpx_handguard_left_r21, 114, 111, 1.0F, -1.0F, 24.5F, 1, 1, 1, 0.0F, false));
		mpx_handguard_left_r21.cubeList.add(new ModelBox(mpx_handguard_left_r21, 0, 50, 0.0F, -1.0F, 28.0F, 3, 1, 7, 0.0F, false));

		mpx_handguard_left_r22 = new ModelRenderer(this);
		mpx_handguard_left_r22.setRotationPoint(-4.28F, -35.9F, -42.2F);
		mpx_handguard.addChild(mpx_handguard_left_r22);
		setRotationAngle(mpx_handguard_left_r22, 0.0F, -0.1047F, 0.9948F);
		mpx_handguard_left_r22.cubeList.add(new ModelBox(mpx_handguard_left_r22, 120, 3, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r23 = new ModelRenderer(this);
		mpx_handguard_left_r23.setRotationPoint(-4.28F, -35.9F, -35.2F);
		mpx_handguard.addChild(mpx_handguard_left_r23);
		setRotationAngle(mpx_handguard_left_r23, 0.0F, -0.1047F, 0.9948F);
		mpx_handguard_left_r23.cubeList.add(new ModelBox(mpx_handguard_left_r23, 6, 120, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r24 = new ModelRenderer(this);
		mpx_handguard_left_r24.setRotationPoint(-4.28F, -35.9F, -45.8F);
		mpx_handguard.addChild(mpx_handguard_left_r24);
		setRotationAngle(mpx_handguard_left_r24, 0.0F, -0.1047F, 0.9948F);
		mpx_handguard_left_r24.cubeList.add(new ModelBox(mpx_handguard_left_r24, 0, 120, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r25 = new ModelRenderer(this);
		mpx_handguard_left_r25.setRotationPoint(-4.28F, -35.9F, -38.8F);
		mpx_handguard.addChild(mpx_handguard_left_r25);
		setRotationAngle(mpx_handguard_left_r25, 0.0F, -0.1047F, 0.9948F);
		mpx_handguard_left_r25.cubeList.add(new ModelBox(mpx_handguard_left_r25, 120, 0, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r26 = new ModelRenderer(this);
		mpx_handguard_left_r26.setRotationPoint(-4.09F, -35.6F, -42.2F);
		mpx_handguard.addChild(mpx_handguard_left_r26);
		setRotationAngle(mpx_handguard_left_r26, 0.0F, 0.1047F, 0.9948F);
		mpx_handguard_left_r26.cubeList.add(new ModelBox(mpx_handguard_left_r26, 119, 29, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r27 = new ModelRenderer(this);
		mpx_handguard_left_r27.setRotationPoint(-4.09F, -35.6F, -35.2F);
		mpx_handguard.addChild(mpx_handguard_left_r27);
		setRotationAngle(mpx_handguard_left_r27, 0.0F, 0.1047F, 0.9948F);
		mpx_handguard_left_r27.cubeList.add(new ModelBox(mpx_handguard_left_r27, 119, 32, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r28 = new ModelRenderer(this);
		mpx_handguard_left_r28.setRotationPoint(-4.09F, -35.6F, -45.8F);
		mpx_handguard.addChild(mpx_handguard_left_r28);
		setRotationAngle(mpx_handguard_left_r28, 0.0F, 0.1047F, 0.9948F);
		mpx_handguard_left_r28.cubeList.add(new ModelBox(mpx_handguard_left_r28, 119, 23, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r29 = new ModelRenderer(this);
		mpx_handguard_left_r29.setRotationPoint(-4.09F, -35.6F, -38.8F);
		mpx_handguard.addChild(mpx_handguard_left_r29);
		setRotationAngle(mpx_handguard_left_r29, 0.0F, 0.1047F, 0.9948F);
		mpx_handguard_left_r29.cubeList.add(new ModelBox(mpx_handguard_left_r29, 119, 26, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r30 = new ModelRenderer(this);
		mpx_handguard_left_r30.setRotationPoint(2.0F, -37.0F, -60.5F);
		mpx_handguard.addChild(mpx_handguard_left_r30);
		setRotationAngle(mpx_handguard_left_r30, 0.0F, 0.0F, -0.9948F);
		mpx_handguard_left_r30.cubeList.add(new ModelBox(mpx_handguard_left_r30, 146, 90, -3.0F, -1.0F, 15.0F, 1, 1, 13, 0.0F, false));
		mpx_handguard_left_r30.cubeList.add(new ModelBox(mpx_handguard_left_r30, 146, 104, -1.0F, -1.0F, 15.0F, 1, 1, 13, 0.0F, false));
		mpx_handguard_left_r30.cubeList.add(new ModelBox(mpx_handguard_left_r30, 64, 13, -3.0F, -1.0F, 14.0F, 3, 1, 1, 0.001F, false));
		mpx_handguard_left_r30.cubeList.add(new ModelBox(mpx_handguard_left_r30, 114, 102, -2.0F, -1.0F, 17.5F, 1, 1, 1, 0.0F, false));
		mpx_handguard_left_r30.cubeList.add(new ModelBox(mpx_handguard_left_r30, 114, 108, -2.0F, -1.0F, 21.0F, 1, 1, 1, 0.0F, false));
		mpx_handguard_left_r30.cubeList.add(new ModelBox(mpx_handguard_left_r30, 112, 114, -2.0F, -1.0F, 24.5F, 1, 1, 1, 0.0F, false));
		mpx_handguard_left_r30.cubeList.add(new ModelBox(mpx_handguard_left_r30, 23, 50, -3.0F, -1.0F, 28.0F, 3, 1, 7, 0.0F, false));

		mpx_handguard_left_r31 = new ModelRenderer(this);
		mpx_handguard_left_r31.setRotationPoint(1.09F, -35.6F, -35.2F);
		mpx_handguard.addChild(mpx_handguard_left_r31);
		setRotationAngle(mpx_handguard_left_r31, 0.0F, -0.1047F, -0.9948F);
		mpx_handguard_left_r31.cubeList.add(new ModelBox(mpx_handguard_left_r31, 85, 115, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r32 = new ModelRenderer(this);
		mpx_handguard_left_r32.setRotationPoint(1.09F, -35.6F, -38.8F);
		mpx_handguard.addChild(mpx_handguard_left_r32);
		setRotationAngle(mpx_handguard_left_r32, 0.0F, -0.1047F, -0.9948F);
		mpx_handguard_left_r32.cubeList.add(new ModelBox(mpx_handguard_left_r32, 117, 90, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r33 = new ModelRenderer(this);
		mpx_handguard_left_r33.setRotationPoint(1.09F, -35.6F, -42.2F);
		mpx_handguard.addChild(mpx_handguard_left_r33);
		setRotationAngle(mpx_handguard_left_r33, 0.0F, -0.1047F, -0.9948F);
		mpx_handguard_left_r33.cubeList.add(new ModelBox(mpx_handguard_left_r33, 104, 117, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r34 = new ModelRenderer(this);
		mpx_handguard_left_r34.setRotationPoint(1.09F, -35.6F, -45.8F);
		mpx_handguard.addChild(mpx_handguard_left_r34);
		setRotationAngle(mpx_handguard_left_r34, 0.0F, -0.1047F, -0.9948F);
		mpx_handguard_left_r34.cubeList.add(new ModelBox(mpx_handguard_left_r34, 110, 117, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r35 = new ModelRenderer(this);
		mpx_handguard_left_r35.setRotationPoint(1.28F, -35.9F, -35.2F);
		mpx_handguard.addChild(mpx_handguard_left_r35);
		setRotationAngle(mpx_handguard_left_r35, 0.0F, 0.1047F, -0.9948F);
		mpx_handguard_left_r35.cubeList.add(new ModelBox(mpx_handguard_left_r35, 79, 115, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r36 = new ModelRenderer(this);
		mpx_handguard_left_r36.setRotationPoint(1.28F, -35.9F, -38.8F);
		mpx_handguard.addChild(mpx_handguard_left_r36);
		setRotationAngle(mpx_handguard_left_r36, 0.0F, 0.1047F, -0.9948F);
		mpx_handguard_left_r36.cubeList.add(new ModelBox(mpx_handguard_left_r36, 116, 39, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r37 = new ModelRenderer(this);
		mpx_handguard_left_r37.setRotationPoint(1.28F, -35.9F, -42.2F);
		mpx_handguard.addChild(mpx_handguard_left_r37);
		setRotationAngle(mpx_handguard_left_r37, 0.0F, 0.1047F, -0.9948F);
		mpx_handguard_left_r37.cubeList.add(new ModelBox(mpx_handguard_left_r37, 98, 117, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		mpx_handguard_left_r38 = new ModelRenderer(this);
		mpx_handguard_left_r38.setRotationPoint(1.28F, -35.9F, -45.8F);
		mpx_handguard.addChild(mpx_handguard_left_r38);
		setRotationAngle(mpx_handguard_left_r38, 0.0F, 0.1047F, -0.9948F);
		mpx_handguard_left_r38.cubeList.add(new ModelBox(mpx_handguard_left_r38, 119, 20, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(-1.0F, -40.0F, -51.0F);
		mpx_handguard.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 56, 86, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 178, 40, -1.5F, 0.5F, 5.0F, 2, 2, 21, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 86, -1.0F, 2.0F, 0.0F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 65, 114, -2.0F, 1.0F, 4.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 114, 3, -2.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 31, 114, 0.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 114, 6, 0.0F, 1.0F, 4.0F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.7F, 1.0F, -0.8F);
		barrel.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 221, 30, 0.0F, -1.0F, 1.0F, 1, 1, 5, 0.204F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.7F, 2.0F, -0.8F);
		barrel.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 235, 39, 0.0F, -1.0F, 1.0F, 1, 1, 5, 0.203F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.7F, 2.0F, -0.8F);
		barrel.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 235, 21, 0.0F, -1.0F, 1.0F, 1, 1, 5, 0.202F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.7F, 1.0F, -0.8F);
		barrel.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 236, 6, 0.0F, -1.0F, 1.0F, 1, 1, 5, 0.201F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mpx_handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
