package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKM extends ModelWithAttachments {
	private final ModelRenderer body;
	private final ModelRenderer trigger;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer LowerPart;
	private final ModelRenderer LPcubes;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer LPdetails;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer KashtanMount;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;

	public PKM() {
		textureWidth = 400;
		textureHeight = 400;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		trigger = new ModelRenderer(this);
		trigger.setRotationPoint(-1.4F, -28.2F, -9.5F);
		body.addChild(trigger);
		trigger.cubeList.add(new ModelBox(trigger, 144, 72, -1.5F, -3.0F, -6.5F, 3, 2, 9, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 179, 61, -1.5F, -1.1F, -6.3F, 3, 2, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		trigger.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 79, 43, -0.5F, 0.3F, -0.2F, 1, 2, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		trigger.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 79, 49, -0.5F, -1.3F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.5F, 1.2939F, -5.2831F);
		trigger.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.3526F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 130, 154, -2.0F, 6.375F, -0.075F, 3, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 111, 101, -2.0F, 0.875F, -1.025F, 3, 5, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 166, 133, -2.0F, 6.375F, 0.475F, 3, 1, 4, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 132, 39, -2.0F, 0.475F, -1.025F, 3, 1, 1, -0.002F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.5F, 2.3421F, -2.9804F);
		trigger.addChild(cube_r4);
		setRotationAngle(cube_r4, 1.9635F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 80, 157, -2.0F, 2.5F, -2.4F, 3, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 160, 42, -2.0F, 3.2F, -2.4F, 3, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.5F, -0.1F, -5.8F);
		trigger.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.6981F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 179, 58, -2.0F, 0.4F, -1.0F, 3, 2, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.5F, -2.0F, -2.0F);
		trigger.addChild(cube_r6);
		setRotationAngle(cube_r6, -1.0472F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 172, 75, -2.0F, 3.4F, -3.5F, 3, 1, 2, 0.0F, false));

		LowerPart = new ModelRenderer(this);
		LowerPart.setRotationPoint(-1.7612F, -37.5435F, -68.5408F);
		body.addChild(LowerPart);
		

		LPcubes = new ModelRenderer(this);
		LPcubes.setRotationPoint(7.7612F, 2.5435F, 59.5408F);
		LowerPart.addChild(LPcubes);
		LPcubes.cubeList.add(new ModelBox(LPcubes, 246, 191, -6.0F, -3.0F, -37.0F, 2, 7, 50, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 121, 101, -8.6F, -5.1F, -37.0F, 2, 2, 7, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 121, 110, -7.1F, -5.1F, -37.0F, 1, 2, 7, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 72, 29, -10.0F, -3.0F, 12.0F, 4, 7, 1, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 270, 60, -10.0F, 3.0F, -37.0F, 4, 1, 49, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 144, 14, -8.5F, 5.4F, -29.0F, 2, 1, 10, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 72, 91, -8.5F, 3.3F, -18.9F, 2, 1, 4, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 56, 90, -8.5F, 3.3F, -32.9F, 2, 1, 4, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 144, 72, -6.0F, -6.0F, -30.7F, 2, 3, 2, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 72, 0, -6.0F, -4.0F, -28.7F, 2, 1, 12, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 118, 58, -5.9F, -4.2F, -28.7F, 2, 1, 9, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 54, 134, -10.9F, -4.2F, -28.7F, 5, 1, 2, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 49, 118, -8.7F, -2.8F, -16.3F, 1, 1, 2, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 101, 120, -7.0F, -2.8F, -16.3F, 1, 1, 2, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 140, 178, -10.9F, -4.2F, -21.7F, 2, 1, 2, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 0, 270, -10.7F, -3.0F, -37.0F, 2, 3, 50, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 255, 248, -10.7F, 1.0F, -37.0F, 2, 3, 50, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 88, 19, -10.7F, 0.0F, 9.0F, 2, 1, 4, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 70, 169, -10.7F, 0.0F, -37.0F, 2, 1, 23, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 8, 168, -10.7F, -6.0F, -30.7F, 5, 3, 2, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 72, 13, -10.7F, -4.0F, -28.7F, 2, 1, 12, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 118, 120, -6.0F, -4.0F, -16.7F, 1, 1, 10, 0.0F, false));
		LPcubes.cubeList.add(new ModelBox(LPcubes, 144, 83, -9.7F, -4.0F, -16.7F, 1, 1, 10, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-11.2F, -3.5F, -23.3F);
		LPcubes.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.3927F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 140, 142, -2.5F, -0.6F, -5.0F, 3, 1, 10, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-7.3F, 0.5F, -12.0F);
		LPcubes.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 102, 29, 2.8F, -3.1F, -25.0F, 2, 3, 7, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-5.0F, -6.6F, -29.7F);
		LPcubes.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 72, 129, -1.0F, -0.275F, -0.1F, 2, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 88, 129, -1.0F, -0.275F, 0.15F, 2, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 130, -1.0F, -0.075F, -0.3F, 2, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 130, -1.0F, 0.125F, -0.3F, 2, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-8.0F, 5.9F, 42.5F);
		LPcubes.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 86, 72, -0.5F, 8.2F, -61.5F, 2, 3, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-8.0F, 5.9F, -28.5F);
		LPcubes.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 86, 85, -0.5F, -2.9F, -0.5F, 2, 3, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-4.7F, 0.5F, -12.0F);
		LPcubes.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 102, 0, -6.7F, -1.2F, -25.0F, 2, 3, 7, 0.0F, false));

		LPdetails = new ModelRenderer(this);
		LPdetails.setRotationPoint(-1.2388F, 2.5435F, 59.5408F);
		LowerPart.addChild(LPdetails);
		LPdetails.cubeList.add(new ModelBox(LPdetails, 64, 141, -2.0F, -2.2F, 9.9F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 40, 140, -2.0F, 1.2F, 9.9F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 0, 168, -1.9F, -1.0F, -14.7F, 1, 1, 24, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 136, 20, -1.9F, -2.0F, 7.3F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 133, 2, -1.9F, 1.9F, -13.7F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 133, 4, -1.9F, 1.9F, -7.7F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 133, 19, -1.9F, 1.9F, 0.3F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 133, 21, -1.9F, 1.9F, 7.3F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 136, 5, -1.9F, -2.0F, 0.3F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 136, 3, -1.9F, -2.0F, -7.7F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 135, 56, -1.9F, -2.0F, -13.7F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 144, 97, -1.9F, 0.9F, -14.7F, 1, 1, 24, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 136, 24, -1.9F, -0.1F, 8.3F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 136, 22, -1.9F, -0.1F, -14.7F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 43, 141, -2.0F, -2.2F, 11.9F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 16, 140, 4.1F, 1.2F, 9.9F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 22, 140, 4.1F, -2.2F, 9.9F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 6, 140, 4.1F, -2.2F, -22.6F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 0, 0, 4.3F, -2.2F, -18.9F, 1, 3, 13, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 144, 2, 4.3F, 0.8F, -17.9F, 1, 1, 11, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 0, 140, 4.1F, -2.2F, -25.0F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 136, 112, 4.1F, -2.2F, -35.1F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 79, 120, -2.0F, -2.2F, -35.1F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 136, 110, 4.1F, 1.7F, -35.1F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 30, 140, 4.1F, -2.2F, 11.9F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 51, 140, -2.0F, -2.4F, -10.1F, 1, 1, 1, 0.0F, false));
		LPdetails.cubeList.add(new ModelBox(LPdetails, 61, 140, -2.0F, -2.4F, -5.3F, 1, 1, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(4.8F, 1.3F, -12.4F);
		LPdetails.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.7854F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 63, 101, -0.5F, -4.95F, 3.25F, 1, 1, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 102, 10, -0.5F, -4.55F, 3.25F, 1, 1, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 102, 12, -0.5F, 3.225F, -4.55F, 1, 1, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 102, 39, -0.5F, 3.225F, -4.95F, 1, 1, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(4.6F, -2.2F, -20.4F);
		LPdetails.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 101, 142, -0.5F, -0.5F, -0.5F, 1, 1, 17, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.4F, -1.5F, -7.2F);
		LPdetails.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.7854F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 133, 23, -0.5F, -11.325F, 10.6F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 72, 133, -0.5F, -11.325F, 11.05F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 114, 133, -0.5F, -10.025F, 9.9F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 134, -0.5F, -10.625F, 9.9F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 40, 134, -0.5F, -6.35F, 6.15F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 134, 48, -0.5F, -6.35F, 5.65F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 134, 50, -0.5F, -5.15F, 4.95F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 134, 52, -0.5F, -5.65F, 4.95F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 134, 72, -0.5F, 4.25F, -4.95F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 134, 74, -0.5F, 4.65F, -4.95F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 134, 76, -0.5F, 3.55F, -3.75F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 134, 80, -0.5F, 3.55F, -4.25F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 134, 82, -0.5F, 0.5F, -0.7F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 134, 84, -0.5F, 0.0F, -0.7F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 135, 12, -0.5F, -0.7F, 0.4F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 135, 28, -0.5F, -0.7F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.4F, 2.4F, -7.2F);
		LPdetails.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.7854F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 132, -0.5F, -0.3F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 132, -0.5F, -0.3F, 0.4F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 114, 131, -0.5F, -1.0F, -0.7F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 131, 99, -0.5F, -1.5F, -0.7F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 88, 131, -0.5F, -4.55F, -4.25F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 82, 131, -0.5F, -4.55F, -3.75F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 130, 112, -0.5F, -5.65F, -4.95F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 130, 110, -0.5F, -5.25F, -4.95F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 33, 130, -0.5F, 4.65F, 4.95F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 114, 129, -0.5F, 4.15F, 4.95F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 82, 129, -0.5F, 5.35F, 5.65F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 126, 48, -0.5F, 5.35F, 6.15F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 124, 120, -0.5F, 9.625F, 9.9F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 123, 58, -0.5F, 9.025F, 9.9F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 122, 4, -0.5F, 10.325F, 11.05F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 122, 2, -0.5F, 10.325F, 10.6F, 1, 1, 1, 0.0F, false));

		KashtanMount = new ModelRenderer(this);
		KashtanMount.setRotationPoint(0.0F, -36.0F, 0.0F);
		body.addChild(KashtanMount);
		KashtanMount.cubeList.add(new ModelBox(KashtanMount, 30, 70, 0.5F, -3.1F, -13.2F, 2, 3, 17, 0.0F, false));
		KashtanMount.cubeList.add(new ModelBox(KashtanMount, 153, 158, 0.5F, -0.1F, -10.2F, 2, 1, 3, 0.0F, false));
		KashtanMount.cubeList.add(new ModelBox(KashtanMount, 58, 95, 0.5F, -0.1F, -2.2F, 2, 1, 3, 0.0F, false));
		KashtanMount.cubeList.add(new ModelBox(KashtanMount, 26, 130, 0.3F, 0.8F, 0.8F, 2, 2, 3, 0.0F, false));
		KashtanMount.cubeList.add(new ModelBox(KashtanMount, 113, 13, 0.5F, 1.8F, 1.8F, 2, 1, 1, 0.0F, false));
		KashtanMount.cubeList.add(new ModelBox(KashtanMount, 0, 103, 0.5F, 1.8F, -12.2F, 2, 1, 1, 0.0F, false));
		KashtanMount.cubeList.add(new ModelBox(KashtanMount, 125, 21, 0.3F, 2.8F, 1.8F, 2, 1, 1, 0.0F, false));
		KashtanMount.cubeList.add(new ModelBox(KashtanMount, 125, 19, 0.3F, 2.8F, -12.2F, 2, 1, 1, 0.0F, false));
		KashtanMount.cubeList.add(new ModelBox(KashtanMount, 72, 120, 0.3F, 0.8F, -13.2F, 2, 2, 3, 0.0F, false));
		KashtanMount.cubeList.add(new ModelBox(KashtanMount, 72, 13, 1.5F, -4.1F, -2.2F, 1, 1, 5, 0.0F, false));
		KashtanMount.cubeList.add(new ModelBox(KashtanMount, 0, 0, 2.0F, -6.1F, 2.8F, 1, 3, 1, 0.0F, false));
		KashtanMount.cubeList.add(new ModelBox(KashtanMount, 48, 118, 0.9F, -2.6F, -13.2F, 2, 2, 7, 0.0F, false));
		KashtanMount.cubeList.add(new ModelBox(KashtanMount, 30, 118, 0.9F, -2.6F, -3.2F, 2, 2, 7, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
		KashtanMount.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.7854F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 124, 74, 0.3F, -7.4F, -11.3F, 2, 1, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 124, 72, 0.3F, -6.2F, -10.2F, 2, 1, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 101, 123, 0.3F, -6.2F, -10.6F, 2, 1, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 117, 53, 0.3F, -6.9F, -11.3F, 2, 1, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 124, 76, 0.3F, 2.5F, -1.4F, 2, 1, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 124, 80, 0.3F, 3.0F, -1.4F, 2, 1, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 124, 82, 0.3F, 3.7F, -0.7F, 2, 1, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 124, 84, 0.3F, 3.7F, -0.3F, 2, 1, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(1.5F, 0.4F, -6.7F);
		KashtanMount.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 30, 140, -1.3F, -0.3F, -6.5F, 2, 1, 17, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
