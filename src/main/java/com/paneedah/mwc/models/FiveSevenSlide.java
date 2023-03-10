package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FiveSevenSlide extends ModelWithAttachments {
	private final QRenderer slide;
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
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;

	public FiveSevenSlide() {
		textureWidth = 128;
		textureHeight = 128;

		slide = new QRenderer(this);
		slide.setRotationPoint(-4.1F, -11.0F, 0.0F);
		slide.cubeList.add(new ModelBox(slide, 58, 46, 0.0F, -1.5F, -9.5F, 1, 2, 13, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 50, 62, -0.01F, -0.25F, -5.0F, 1, 1, 8, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 78, 87, -0.01F, -1.4F, -4.0F, 1, 2, 7, -0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 13, 15, 0.0F, -1.5F, -19.25F, 1, 1, 3, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 76, 32, 4.2F, -1.5F, -19.25F, 1, 1, 1, -0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 41, 48, 1.42F, -2.92F, -9.5F, 2, 1, 13, 0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 61, 3, 1.42F, -2.92F, -17.25F, 2, 1, 1, 0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 14, 19, 1.42F, -2.92F, -17.75F, 2, 1, 1, 0.002F, false));
		slide.cubeList.add(new ModelBox(slide, 48, 33, 2.1F, -2.92F, -25.75F, 1, 1, 8, 0.002F, false));
		slide.cubeList.add(new ModelBox(slide, 0, 69, 1.48F, -2.78F, -29.5F, 1, 2, 12, 0.002F, false));
		slide.cubeList.add(new ModelBox(slide, 59, 61, 1.72F, -2.78F, -29.5F, 2, 2, 12, 0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 76, 29, 2.78F, -2.92F, -17.75F, 1, 1, 1, 0.003F, false));
		slide.cubeList.add(new ModelBox(slide, 0, 47, 0.0F, -0.5F, -18.5F, 1, 1, 9, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 30, 1, 0.0F, 0.0F, -18.5F, 1, 1, 22, 0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 0, 47, 2.78F, -2.92F, -17.5F, 1, 1, 21, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 88, 58, 1.78F, -2.92F, -16.5F, 1, 1, 7, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 0, 23, 4.2F, -1.5F, -18.5F, 1, 2, 22, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 24, 25, 4.2F, 0.0F, -18.5F, 1, 1, 22, 0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 0, 57, 4.21F, -0.25F, -5.0F, 1, 1, 8, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 87, 70, 4.21F, -1.4F, -4.0F, 1, 2, 7, -0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 83, 0, 0.2F, 0.0F, -28.5F, 1, 1, 10, 0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 24, 24, 0.2F, -1.5F, -28.5F, 1, 2, 10, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 0, 23, 4.0F, -1.5F, -28.5F, 1, 2, 10, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 63, 75, 4.0F, 0.0F, -28.5F, 1, 1, 10, 0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 24, 31, 0.6F, -1.5F, -29.5F, 4, 2, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 58, 57, 0.6F, 0.0F, -29.5F, 4, 1, 1, 0.001F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(5.0F, -1.5F, -28.5F);
		slide.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.3665F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 70, 26, -1.0F, 0.0F, -1.0F, 1, 2, 1, -0.001F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 63, 77, -1.0F, 1.5F, -1.0F, 1, 1, 1, -0.002F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.2F, 0.0F, -28.5F);
		slide.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.3665F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 67, 77, 0.0F, 0.0F, -1.0F, 1, 1, 1, -0.002F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 70, 29, 0.0F, -1.5F, -1.0F, 1, 2, 1, -0.001F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(5.0F, -1.5F, -17.5F);
		slide.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 69, -1.0F, -1.0F, -11.0F, 1, 1, 11, -0.001F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 69, 0, -1.0F, -1.8F, -12.0F, 1, 1, 12, -0.002F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(5.77F, -1.7F, 3.25F);
		slide.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.192F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 69, -1.01F, -0.1F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 69, -1.01F, 0.6F, -1.0F, 1, 2, 1, -0.301F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 71, -6.33F, 0.6F, -1.0F, 1, 2, 1, -0.301F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 4, 71, -6.33F, -0.1F, -1.0F, 1, 2, 1, -0.3F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(5.57F, -1.7F, 2.75F);
		slide.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.192F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 57, 77, -1.01F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 57, -1.01F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 78, 66, -5.93F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 73, 9, -5.93F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(5.57F, -1.7F, 2.0F);
		slide.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.192F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 53, 77, -1.01F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 63, 8, -1.01F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 73, 6, -5.93F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 78, 64, -5.93F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(5.57F, -1.7F, 1.25F);
		slide.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.192F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 77, 46, -1.01F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 63, 24, -1.01F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 72, -5.93F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 78, 62, -5.93F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(5.57F, -1.7F, 0.5F);
		slide.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.192F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 77, -1.01F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 65, -1.01F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 72, -5.93F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 78, -5.93F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(5.57F, -1.7F, -0.25F);
		slide.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.192F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 77, 34, -1.01F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 69, 6, -1.01F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 54, 71, -5.93F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 78, -5.93F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(5.57F, -1.7F, -1.0F);
		slide.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.192F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 33, 77, -1.01F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 69, -1.01F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 50, 71, -5.93F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 78, 22, -5.93F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(5.57F, -1.7F, -1.75F);
		slide.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.192F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 77, 27, -1.01F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 69, 9, -1.01F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 21, 71, -5.93F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 78, 20, -5.93F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(5.57F, -1.7F, -2.5F);
		slide.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.192F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 27, 77, -1.01F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 69, -1.01F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 71, 18, -5.93F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 78, -5.93F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(5.57F, -1.7F, -3.25F);
		slide.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.192F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 77, -1.01F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 69, -1.01F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 71, 15, -5.93F, 0.0F, -1.0F, 1, 2, 1, -0.3F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 78, 16, -5.93F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(5.57F, -1.7F, -4.0F);
		slide.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.192F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 77, 18, -1.01F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 77, 10, -1.01F, 1.0F, -1.0F, 1, 1, 1, -0.3F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 4, 78, -5.93F, 1.0F, -1.0F, 1, 1, 1, -0.3F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 78, -5.93F, 1.4F, -1.0F, 1, 1, 1, -0.3F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(5.22F, -1.4F, -4.0F);
		slide.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.8552F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 77, -1.01F, 0.0F, -1.5F, 1, 1, 1, -0.003F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 77, -1.01F, 0.0F, -1.0F, 1, 1, 1, -0.002F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 78, 71, -5.23F, 0.0F, -1.5F, 1, 1, 1, -0.003F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 78, 76, -5.23F, 0.0F, -1.0F, 1, 1, 1, -0.002F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(5.2F, -1.5F, 3.4F);
		slide.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.2269F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 76, 54, -1.0F, 1.5F, -1.0F, 1, 1, 1, -0.002F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 57, -1.0F, 0.0F, -1.0F, 1, 2, 1, -0.001F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 76, 5, -5.2F, 1.5F, -1.0F, 1, 1, 1, -0.002F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 47, -5.2F, 0.0F, -1.0F, 1, 2, 1, -0.001F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(5.2F, -1.5F, 3.5F);
		slide.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 48, 24, -1.0F, -2.0F, -20.0F, 1, 2, 20, -0.001F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 76, -1.0F, -1.0F, -21.85F, 1, 1, 1, -0.001F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 31, 55, -1.0F, -2.0F, -21.25F, 1, 2, 2, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(5.2F, -1.5F, -19.25F);
		slide.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.6458F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 50, 56, -1.0F, -2.5F, 0.0F, 1, 2, 1, 0.001F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(5.2F, -0.5F, -19.25F);
		slide.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.3316F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 76, 51, -1.0F, 0.6F, 0.0F, 1, 1, 1, -0.003F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 76, 48, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 78, 78, -5.2F, 0.6F, 0.0F, 1, 1, 1, -0.002F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 7, 79, -5.2F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(3.78F, -2.92F, 3.5F);
		slide.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.2618F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 36, 24, -1.0F, 0.0F, -1.0F, 1, 3, 1, 0.001F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 0, -0.65F, 0.45F, -1.0F, 1, 3, 1, 0.002F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 17, 0, -2.71F, 0.45F, -1.0F, 1, 3, 1, 0.001F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 54, 15, -2.36F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(5.2F, -2.92F, 3.5F);
		slide.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.3092F, 0.554F, 0.1665F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 16, 12, -0.9F, 1.9F, -1.5F, 1, 2, 1, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 76, 3, -0.9F, 1.2F, -1.5F, 1, 1, 1, -0.001F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, -2.92F, 3.5F);
		slide.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.3092F, -0.554F, -0.1665F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 4, 76, -0.1F, 1.2F, -1.5F, 1, 1, 1, -0.001F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 54, 0, -0.1F, 1.9F, -1.5F, 1, 2, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(5.3F, -1.6F, -2.5F);
		slide.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.6458F, 0.0F, -0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 62, 71, -1.0F, -0.7F, -0.8F, 1, 1, 1, -0.1F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-0.1F, -1.6F, -2.5F);
		slide.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.6458F, 0.0F, 0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 27, 72, 0.0F, -0.7F, -0.8F, 1, 1, 1, -0.1F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, -1.5F, 3.5F);
		slide.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 54, 0, 0.0F, -2.0F, -13.0F, 1, 2, 13, -0.001F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 75, 77, 0.0F, -1.0F, -21.85F, 1, 1, 1, -0.001F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 67, 70, 0.0F, -2.0F, -21.25F, 1, 2, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 18, 73, 0.0F, -2.0F, -20.75F, 1, 2, 1, -0.001F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.2F, -1.5F, -17.5F);
		slide.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 70, 13, 0.0F, -1.8F, -12.0F, 1, 1, 12, -0.002F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 70, 26, 0.0F, -1.0F, -11.0F, 1, 1, 11, -0.001F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(5.0F, -1.5F, -28.5F);
		slide.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.5411F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 76, 8, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.003F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.2F, -1.5F, -28.5F);
		slide.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.5411F, 0.0F, 0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 17, 76, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.003F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, -1.5F, -19.25F);
		slide.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.6458F, 0.0F, 0.7854F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 70, 32, 0.0F, -2.5F, 0.0F, 1, 2, 1, 0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		slide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
