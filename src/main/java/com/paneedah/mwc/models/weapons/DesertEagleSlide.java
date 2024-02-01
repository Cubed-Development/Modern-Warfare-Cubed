package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DesertEagleSlide extends ModelWithAttachments {
	private final ModelRenderer Slide;
	private final ModelRenderer FireSelector;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer RearSight;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer Cubes2;
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
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer deco;
	private final ModelRenderer cube_r40;

	public DesertEagleSlide() {
		textureWidth = 128;
		textureHeight = 128;

		Slide = new ModelRenderer(this);
		Slide.setRotationPoint(-2.0316F, -13.0337F, -1.4061F);
		

		FireSelector = new ModelRenderer(this);
		FireSelector.setRotationPoint(0.0F, -1.5F, 3.5F);
		Slide.addChild(FireSelector);
		FireSelector.cubeList.add(new ModelBox(FireSelector, 59, 60, -1.8F, -0.825F, -4.35F, 2, 1, 4, 0.0F, false));
		FireSelector.cubeList.add(new ModelBox(FireSelector, 20, 73, -2.1F, -0.825F, -4.35F, 2, 1, 1, 0.0F, false));
		FireSelector.cubeList.add(new ModelBox(FireSelector, 9, 73, 1.4F, -0.825F, -4.35F, 2, 1, 1, 0.0F, false));
		FireSelector.cubeList.add(new ModelBox(FireSelector, 0, 73, -2.0F, -0.225F, -1.15F, 2, 1, 1, 0.0F, false));
		FireSelector.cubeList.add(new ModelBox(FireSelector, 10, 60, 1.1F, -0.825F, -4.35F, 2, 1, 4, 0.0F, false));
		FireSelector.cubeList.add(new ModelBox(FireSelector, 34, 62, 1.3F, -0.225F, -1.15F, 2, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.2F, 0.0F, 0.0F);
		FireSelector.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.8727F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 50, 38, -2.0F, -0.3F, -1.5F, 2, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 62, 0.9F, -0.8F, -0.6F, 2, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 65, 13, 0.9F, -0.3F, -0.6F, 2, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 67, 0.9F, -0.3F, -1.5F, 2, 1, 1, -0.002F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 37, 73, -2.0F, -0.8F, -0.6F, 2, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 73, 45, -2.0F, -0.3F, -0.6F, 2, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.2F, 0.0F, 0.0F);
		FireSelector.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3316F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 59, 52, -2.0F, 0.675F, -4.05F, 2, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 62, 4, -2.0F, -0.125F, -1.85F, 2, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 43, -2.0F, 0.675F, -3.85F, 2, 1, 4, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 59, 47, 0.9F, 0.675F, -3.85F, 2, 1, 4, -0.002F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 65, 67, 0.9F, -0.125F, -1.85F, 2, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 71, 0.9F, 0.675F, -4.05F, 2, 1, 1, 0.0F, false));

		RearSight = new ModelRenderer(this);
		RearSight.setRotationPoint(0.6F, -4.0F, 2.8F);
		Slide.addChild(RearSight);
		RearSight.cubeList.add(new ModelBox(RearSight, 11, 57, -2.0F, -0.3F, -0.3F, 4, 1, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 89, 2, -2.3867F, 0.15F, -0.3F, 1, 1, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 89, 0, 1.0F, -0.8F, -0.3F, 1, 1, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 88, 74, -1.9867F, -0.8F, -0.3F, 1, 1, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 88, 70, 1.4F, 0.15F, -0.3F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.6677F, -0.1821F, 0.2F);
		RearSight.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.3927F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 88, 23, -0.45F, -0.425F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.6544F, -0.1821F, 0.2F);
		RearSight.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3927F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 88, 72, -0.55F, -0.425F, -0.5F, 1, 1, 1, 0.0F, false));

		Cubes2 = new ModelRenderer(this);
		Cubes2.setRotationPoint(0.2316F, 0.0337F, -3.2939F);
		Slide.addChild(Cubes2);
		Cubes2.cubeList.add(new ModelBox(Cubes2, 69, 86, -2.1F, 2.0F, 6.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 25, 47, -2.1F, 0.7F, -26.6F, 1, 1, 23, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 0, 25, -2.1F, 1.0F, -26.6F, 1, 2, 23, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 86, 61, 1.4F, -0.7F, 7.4F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 86, 58, 1.4F, -2.7F, 6.6F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 0, 0, 1.9F, 1.0F, -26.6F, 1, 2, 23, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 80, 28, 1.9F, -0.6F, -5.1F, 1, 2, 1, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 80, 21, 1.9F, -0.8F, -4.6F, 1, 2, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 25, 23, 1.9F, 0.7F, -26.6F, 1, 1, 23, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 79, 73, -2.1F, -0.6F, -5.1F, 1, 2, 1, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 79, 70, -2.1F, -0.8F, -4.6F, 1, 2, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 74, 53, 1.9F, -2.7F, -4.8F, 1, 1, 7, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 81, 8, 1.9F, -3.6F, 1.2F, 1, 1, 6, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 86, 49, -2.1F, 2.0F, -2.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 41, 85, -2.1F, 2.0F, -0.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 0, 84, -2.1F, 2.0F, 1.15F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 83, 55, -2.1F, 2.0F, 4.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 83, 48, -2.1F, 2.0F, 2.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 34, 38, -2.1F, -3.6F, 1.2F, 1, 1, 6, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 26, 90, -1.1F, -3.6F, -4.8F, 3, 1, 12, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 11, 7, -2.1F, -3.6F, 6.6F, 5, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 74, 45, -2.1F, -2.7F, -4.8F, 1, 1, 7, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 53, 0, -1.6F, -2.7F, -4.8F, 1, 6, 7, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 14, 78, 1.925F, 2.0F, 2.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 14, 76, 1.925F, 2.0F, 4.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 14, 74, 1.925F, 2.0F, 1.15F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 66, 28, 1.925F, 2.0F, -0.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 65, 19, 1.925F, 2.0F, -2.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 44, 55, 1.925F, 2.0F, 6.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 0, 81, 1.225F, -2.7F, 2.0F, 1, 3, 6, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 52, 71, 1.425F, 0.3F, 2.1F, 1, 3, 7, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 50, 47, 1.425F, -2.7F, -4.8F, 1, 6, 7, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 80, 19, -1.4F, -2.7F, 2.0F, 1, 3, 6, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 50, 33, -1.6F, 0.3F, 2.1F, 1, 3, 7, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.1F, -0.9858F, 8.209F);
		Cubes2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.8727F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 44, 50, -0.5F, 0.1F, -1.4F, 1, 1, 1, -0.002F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 50, -0.5F, -0.4F, -2.9F, 1, 1, 3, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 50, 23, 2.525F, -0.4F, -2.9F, 1, 1, 3, -0.002F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 54, 2.525F, 0.1F, -1.4F, 1, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Cubes2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 50, 47, 1.4F, 0.2F, 0.3F, 1, 1, 2, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 50, 47, -1.6F, 0.2F, 0.3F, 1, 1, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.425F, 0.8999F, 7.02F);
		Cubes2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.236F, 0.1507F, -0.5581F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 56, -0.7F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.825F, 0.0F, 0.0F);
		Cubes2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.2793F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 59, 1.1F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 86, 54, -2.925F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 13, 1.075F, 0.7F, 8.0F, 1, 4, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 35, 0, -2.925F, 0.7F, 8.0F, 1, 4, 1, -0.002F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.825F, 0.0F, -9.7F);
		Cubes2.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.2793F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 60, 1.1F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 0, 1.1F, 0.8F, 6.0F, 1, 3, 1, -0.001F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 86, 47, -2.925F, 3.1F, 6.0F, 1, 1, 1, -0.002F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 59, 60, -2.925F, 0.8F, 6.0F, 1, 3, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.425F, 0.8999F, -2.68F);
		Cubes2.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.2632F, 0.0944F, -0.3366F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 0, 0.2F, -3.7F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.825F, 0.0F, -7.7F);
		Cubes2.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.2793F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 65, 23, 1.1F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 42, 1.1F, 0.8F, 6.0F, 1, 3, 1, -0.001F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 52, 84, -2.925F, 3.1F, 6.0F, 1, 1, 1, -0.002F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 60, -2.925F, 0.8F, 6.0F, 1, 3, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(2.425F, 0.8999F, -0.68F);
		Cubes2.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.2632F, 0.0944F, -0.3366F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 5, 50, 0.2F, -3.7F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.825F, 0.0F, -5.7F);
		Cubes2.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.2793F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 67, 5, 1.1F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 50, 1.1F, 0.8F, 6.0F, 1, 3, 1, -0.001F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 69, 83, -2.925F, 3.1F, 6.0F, 1, 1, 1, -0.002F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 60, -2.925F, 0.8F, 6.0F, 1, 3, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(2.425F, 0.8999F, 1.32F);
		Cubes2.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.2632F, 0.0944F, -0.3366F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 55, 23, 0.2F, -3.7F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(2.425F, 0.8999F, 5.02F);
		Cubes2.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.236F, 0.1507F, -0.5581F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 25, 74, -0.7F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.825F, 0.0F, -2.0F);
		Cubes2.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.2793F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 42, 74, 1.1F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 83, 53, -2.925F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(2.425F, 0.8999F, 3.02F);
		Cubes2.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.236F, 0.1507F, -0.5581F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 25, 76, -0.7F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.825F, 0.0F, -4.0F);
		Cubes2.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.2793F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 42, 76, 1.1F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 82, 75, -2.925F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(3.6F, 0.0F, 0.0F);
		Cubes2.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.8029F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 25, 13, 0.45F, -3.725F, -4.8F, 1, 1, 7, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 25, 38, 0.45F, -3.375F, -4.8F, 1, 1, 7, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
		Cubes2.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.8029F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 50, 60, -3.4F, -1.7F, -4.8F, 1, 1, 7, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 73, -3.4F, -1.35F, -4.8F, 1, 1, 7, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(3.6F, 0.0F, 0.0F);
		Cubes2.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.7854F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 50, 50, -2.35F, -3.6F, -1.675F, 1, 1, 2, -0.002F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
		Cubes2.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, -0.7854F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 53, 0, -0.65F, -3.6F, 0.325F, 1, 1, 2, -0.002F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.6F, -2.5558F, 7.5411F);
		Cubes2.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.7243F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 42, 78, -0.5F, 0.5F, -0.55F, 1, 1, 1, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 17, 50, 2.6F, -0.2F, -0.25F, 1, 3, 1, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 80, 40, 0.4F, -0.7F, -0.25F, 1, 1, 1, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 42, 80, 2.6F, -0.7F, -0.25F, 1, 1, 1, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 59, 47, 0.4F, -0.2F, -0.25F, 1, 3, 1, -0.002F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 55, 27, -0.5F, -1.0F, -0.55F, 1, 2, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(5.2F, -2.5558F, 7.5411F);
		Cubes2.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.7479F, -0.2272F, -0.206F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 25, 80, -6.775F, -0.7F, 1.625F, 1, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.6F, -2.5558F, 7.5411F);
		Cubes2.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.7479F, 0.2272F, 0.206F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 80, 31, 3.1F, -0.7F, 0.75F, 1, 1, 1, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-1.6F, 0.8999F, 3.02F);
		Cubes2.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.236F, -0.1507F, 0.5581F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 82, 72, -0.3F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-1.6F, 0.8999F, 5.02F);
		Cubes2.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.236F, -0.1507F, 0.5581F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 83, 50, -0.3F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-1.6F, 0.8999F, 7.02F);
		Cubes2.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.236F, -0.1507F, 0.5581F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 83, 57, -0.3F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-1.6F, 0.8999F, 1.32F);
		Cubes2.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.2632F, -0.0944F, 0.3366F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 66, 25, -1.2F, -3.7F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-1.6F, 0.8999F, -0.68F);
		Cubes2.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.2632F, -0.0944F, 0.3366F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 66, 40, -1.2F, -3.7F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-1.6F, 0.8999F, -2.68F);
		Cubes2.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.2632F, -0.0944F, 0.3366F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 67, 15, -1.2F, -3.7F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.4F, 0.6351F, 9.45F);
		Cubes2.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0785F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 62, 0, 1.5F, -0.6351F, -0.45F, 1, 3, 1, 0.0F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 63, -1.6F, -1.6351F, -0.45F, 1, 3, 1, 0.0F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 4, 63, 0.6F, -1.6351F, -0.45F, 1, 3, 1, 0.0F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 50, 63, -2.5F, -0.6351F, -0.45F, 1, 3, 1, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(2.8F, 0.0F, 0.0F);
		Cubes2.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.7243F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 69, 71, -0.9F, 2.0827F, 6.7915F, 1, 2, 1, 0.0F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 86, 56, -0.9F, 3.5827F, 6.7915F, 1, 1, 1, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-1.2F, 0.0F, 0.0F);
		Cubes2.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.4014F, 0.0F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 24, 62, -0.9F, 0.0F, -5.2F, 1, 3, 1, 0.0F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 68, 78, -0.9F, -0.3F, -4.9F, 1, 2, 1, -0.003F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 28, 62, 3.1F, 0.0F, -5.2F, 1, 3, 1, 0.0F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 80, 37, 3.1F, -0.3F, -4.9F, 1, 2, 1, -0.003F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-1.434F, 0.4325F, -15.6F);
		Cubes2.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, 0.2182F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 50, -0.586F, -0.5825F, -11.0F, 1, 1, 22, 0.0F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(2.234F, 0.4325F, -15.6F);
		Cubes2.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 0.0F, -0.2182F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 50, 47, -0.414F, -0.5825F, -11.0F, 1, 1, 22, 0.0F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.4F, 0.6351F, 9.45F);
		Cubes2.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0556F, 0.0555F, -0.7839F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 14, 87, 1.2075F, -0.0156F, -0.45F, 1, 1, 1, -0.002F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 87, 45, 1.2075F, 0.2844F, -0.45F, 1, 1, 1, -0.001F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(0.4F, 0.6351F, 9.45F);
		Cubes2.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0556F, -0.0555F, 0.7839F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 88, 19, -2.2276F, 0.0045F, -0.45F, 1, 1, 1, -0.002F, false));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 88, 21, -2.2276F, 0.3045F, -0.45F, 1, 1, 1, -0.001F, false));

		deco = new ModelRenderer(this);
		deco.setRotationPoint(1.0566F, 0.0337F, -3.2939F);
		Slide.addChild(deco);
		

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(1.4F, -0.2F, 3.9F);
		deco.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.7854F, 0.0F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 29, 0, -3.875F, -0.6F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 29, 25, -0.775F, -0.6F, -0.5F, 1, 1, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Slide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}