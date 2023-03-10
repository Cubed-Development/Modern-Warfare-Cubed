package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class MAS21 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer grip4_r1;
	private final ModelRenderer grip4_r2;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip2_r1;
	private final ModelRenderer grip4_r3;
	private final ModelRenderer grip7_r1;
	private final ModelRenderer grip6_r1;
	private final ModelRenderer grip6_r2;
	private final ModelRenderer grip5_r1;
	private final ModelRenderer grip6_r3;
	private final ModelRenderer grip9_r1;
	private final ModelRenderer grip8_r1;
	private final ModelRenderer grip7_r2;
	private final ModelRenderer grip6_r4;
	private final ModelRenderer grip5_r2;
	private final ModelRenderer grip4_r4;
	private final ModelRenderer grip5_r3;
	private final ModelRenderer grip4_r5;
	private final ModelRenderer grip5_r4;
	private final ModelRenderer grip4_r6;
	private final ModelRenderer grip3_r2;
	private final ModelRenderer grip4_r7;
	private final ModelRenderer grip3_r3;
	private final ModelRenderer grip2_r2;
	private final ModelRenderer grip2_r3;
	private final ModelRenderer gunslide;
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
	private final ModelRenderer rotatingbarrel;
	private final ModelRenderer slideactual;
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
	private final ModelRenderer rotatingbarrel2;
	private final ModelRenderer movingpart;
	private final ModelRenderer cube_r27;
	private final ModelRenderer lever;
	private final ModelRenderer cube_r28;

	public MAS21() {
		textureWidth = 100;
		textureHeight = 100;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 21, 31, -3.5F, -33.0F, -10.5F, 4, 3, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 17, 18, -0.75F, -33.0F, -14.5F, 1, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 14, 62, -3.25F, -33.0F, -14.5F, 3, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 14, -0.1F, -33.2F, -15.7F, 1, 1, 11, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -3.9F, -33.2F, -15.7F, 1, 1, 17, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 48, -0.75F, -32.0F, -23.5F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 11, 43, -0.85F, -32.7F, -23.5F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 26, -3.15F, -32.7F, -23.5F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 35, 0, -0.549F, -33.2F, -23.7F, 1, 1, 10, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 22, 44, -3.25F, -32.0F, -23.5F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 37, 37, -3.451F, -33.2F, -23.7F, 1, 1, 10, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 26, -3.0F, -31.0F, -23.5F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 44, 48, -3.0F, -31.0F, -20.5F, 3, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 5, -3.001F, -31.3F, -21.1F, 3, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 14, -3.001F, -31.001F, -22.1F, 3, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 43, -3.5F, -33.0F, -1.5F, 4, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 54, -3.0F, -33.5F, 0.2F, 3, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 22, -1.0F, -33.9F, 0.201F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 20, -3.0F, -33.9F, 0.201F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 0, -2.5F, -32.95F, -24.2F, 2, 2, 12, -0.3F, false));

		grip4_r1 = new ModelRenderer(this);
		grip4_r1.setRotationPoint(0.5F, -20.75F, 2.75F);
		gun.addChild(grip4_r1);
		setRotationAngle(grip4_r1, -0.829F, 0.0F, 0.0F);
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 59, 25, -3.999F, 0.0F, -1.0F, 4, 2, 1, 0.0F, false));

		grip4_r2 = new ModelRenderer(this);
		grip4_r2.setRotationPoint(0.5F, -25.6F, 1.4F);
		gun.addChild(grip4_r2);
		setRotationAngle(grip4_r2, -1.0472F, 0.0F, 0.0F);
		grip4_r2.cubeList.add(new ModelBox(grip4_r2, 49, 36, -4.001F, 0.0F, -5.0F, 4, 2, 5, 0.0F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(0.5F, -27.0F, -1.0F);
		gun.addChild(grip3_r1);
		setRotationAngle(grip3_r1, 0.2618F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 70, 63, -3.999F, 2.0F, 0.0F, 4, 5, 2, 0.0F, false));

		grip2_r1 = new ModelRenderer(this);
		grip2_r1.setRotationPoint(0.5F, -27.0F, -6.5F);
		gun.addChild(grip2_r1);
		setRotationAngle(grip2_r1, 0.2618F, 0.0F, 0.0F);
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 0, 33, -4.0F, 0.0F, 0.0F, 4, 9, 6, 0.0F, false));

		grip4_r3 = new ModelRenderer(this);
		grip4_r3.setRotationPoint(0.5F, -32.0F, 1.5F);
		gun.addChild(grip4_r3);
		setRotationAngle(grip4_r3, -1.309F, 0.0F, 0.0F);
		grip4_r3.cubeList.add(new ModelBox(grip4_r3, 35, 5, -4.0F, 0.0F, -1.0F, 4, 3, 1, 0.0F, false));

		grip7_r1 = new ModelRenderer(this);
		grip7_r1.setRotationPoint(-2.95F, -29.6F, -10.8F);
		gun.addChild(grip7_r1);
		setRotationAngle(grip7_r1, 0.0F, 0.0F, 2.3562F);
		grip7_r1.cubeList.add(new ModelBox(grip7_r1, 0, 0, -0.95F, 0.01F, -10.0F, 1, 1, 7, -0.3F, false));
		grip7_r1.cubeList.add(new ModelBox(grip7_r1, 0, 52, -0.95F, 0.01F, -13.0F, 1, 1, 3, -0.3F, false));

		grip6_r1 = new ModelRenderer(this);
		grip6_r1.setRotationPoint(0.05F, -29.6F, -10.8F);
		gun.addChild(grip6_r1);
		setRotationAngle(grip6_r1, 0.0F, 0.0F, 2.3562F);
		grip6_r1.cubeList.add(new ModelBox(grip6_r1, 0, 8, -0.95F, 0.01F, -10.0F, 1, 1, 7, -0.3F, false));
		grip6_r1.cubeList.add(new ModelBox(grip6_r1, 11, 53, -0.95F, 0.01F, -13.0F, 1, 1, 3, -0.3F, false));

		grip6_r2 = new ModelRenderer(this);
		grip6_r2.setRotationPoint(-0.55F, -31.7F, -22.5F);
		gun.addChild(grip6_r2);
		setRotationAngle(grip6_r2, 0.0F, 0.0F, -0.7854F);
		grip6_r2.cubeList.add(new ModelBox(grip6_r2, 45, 11, -1.0F, 0.0F, -1.001F, 1, 1, 9, 0.0F, false));

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(-2.45F, -31.7F, -22.5F);
		gun.addChild(grip5_r1);
		setRotationAngle(grip5_r1, 0.0F, 0.0F, -0.7854F);
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 47, 0, -1.0F, 0.0F, -1.001F, 1, 1, 9, 0.0F, false));

		grip6_r3 = new ModelRenderer(this);
		grip6_r3.setRotationPoint(1.25F, -30.0F, -14.5F);
		gun.addChild(grip6_r3);
		setRotationAngle(grip6_r3, -0.0785F, 0.0F, 0.0F);
		grip6_r3.cubeList.add(new ModelBox(grip6_r3, 32, 20, -1.999F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));
		grip6_r3.cubeList.add(new ModelBox(grip6_r3, 49, 30, -4.499F, -1.0F, 0.0F, 3, 1, 4, 0.0F, false));
		grip6_r3.cubeList.add(new ModelBox(grip6_r3, 66, 0, -4.749F, -1.0F, 4.0F, 4, 1, 4, 0.0F, false));

		grip9_r1 = new ModelRenderer(this);
		grip9_r1.setRotationPoint(0.4F, -25.95F, -7.75F);
		gun.addChild(grip9_r1);
		setRotationAngle(grip9_r1, -0.5672F, 0.0F, 0.0F);
		grip9_r1.cubeList.add(new ModelBox(grip9_r1, 0, 25, -0.999F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		grip8_r1 = new ModelRenderer(this);
		grip8_r1.setRotationPoint(0.0F, -25.35F, -7.05F);
		gun.addChild(grip8_r1);
		setRotationAngle(grip8_r1, -0.5672F, 0.0F, 0.0F);
		grip8_r1.cubeList.add(new ModelBox(grip8_r1, 72, 43, -2.999F, -3.0F, -1.0F, 3, 3, 3, 0.0F, false));

		grip7_r2 = new ModelRenderer(this);
		grip7_r2.setRotationPoint(0.0F, -25.15F, -7.85F);
		gun.addChild(grip7_r2);
		setRotationAngle(grip7_r2, -1.1345F, 0.0F, 0.0F);
		grip7_r2.cubeList.add(new ModelBox(grip7_r2, 61, 44, -3.001F, -3.0F, -1.0F, 3, 3, 1, 0.0F, false));

		grip6_r4 = new ModelRenderer(this);
		grip6_r4.setRotationPoint(0.0F, -25.35F, -13.85F);
		gun.addChild(grip6_r4);
		setRotationAngle(grip6_r4, -0.0349F, 0.0F, 0.0F);
		grip6_r4.cubeList.add(new ModelBox(grip6_r4, 58, 30, -3.001F, -1.0F, 1.0F, 3, 1, 5, 0.0F, false));

		grip5_r2 = new ModelRenderer(this);
		grip5_r2.setRotationPoint(0.0F, -26.05F, -13.55F);
		gun.addChild(grip5_r2);
		setRotationAngle(grip5_r2, -0.7854F, 0.0F, 0.0F);
		grip5_r2.cubeList.add(new ModelBox(grip5_r2, 8, 58, -3.001F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		grip4_r4 = new ModelRenderer(this);
		grip4_r4.setRotationPoint(0.0F, -30.0F, -14.25F);
		gun.addChild(grip4_r4);
		setRotationAngle(grip4_r4, 0.1745F, 0.0F, 0.0F);
		grip4_r4.cubeList.add(new ModelBox(grip4_r4, 22, 43, -3.001F, 0.0F, 0.0F, 3, 4, 1, 0.0F, false));

		grip5_r3 = new ModelRenderer(this);
		grip5_r3.setRotationPoint(0.5F, -30.6F, -13.6F);
		gun.addChild(grip5_r3);
		setRotationAngle(grip5_r3, -0.3491F, 0.0F, 0.0F);
		grip5_r3.cubeList.add(new ModelBox(grip5_r3, 45, 21, -4.0F, -2.0F, 0.0F, 4, 2, 2, -0.2F, false));

		grip4_r5 = new ModelRenderer(this);
		grip4_r5.setRotationPoint(0.5F, -30.0F, -10.5F);
		gun.addChild(grip4_r5);
		setRotationAngle(grip4_r5, 0.3054F, 0.0F, 0.0F);
		grip4_r5.cubeList.add(new ModelBox(grip4_r5, 17, 25, -4.001F, -3.0F, 0.0F, 4, 3, 1, 0.0F, false));

		grip5_r4 = new ModelRenderer(this);
		grip5_r4.setRotationPoint(-3.5F, -30.6F, -14.8F);
		gun.addChild(grip5_r4);
		setRotationAngle(grip5_r4, 0.3054F, 0.1134F, -0.3229F);
		grip5_r4.cubeList.add(new ModelBox(grip5_r4, 23, 18, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		grip4_r6 = new ModelRenderer(this);
		grip4_r6.setRotationPoint(0.5F, -30.6F, -14.8F);
		gun.addChild(grip4_r6);
		setRotationAngle(grip4_r6, 0.3054F, -0.1134F, 0.3229F);
		grip4_r6.cubeList.add(new ModelBox(grip4_r6, 23, 20, -1.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		grip3_r2 = new ModelRenderer(this);
		grip3_r2.setRotationPoint(0.5F, -30.6F, -14.8F);
		gun.addChild(grip3_r2);
		setRotationAngle(grip3_r2, 0.3054F, 0.0F, 0.0F);
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 40, 58, -4.001F, -2.0F, 0.0F, 4, 2, 1, 0.0F, false));

		grip4_r7 = new ModelRenderer(this);
		grip4_r7.setRotationPoint(0.9F, -31.6F, -4.1F);
		gun.addChild(grip4_r7);
		setRotationAngle(grip4_r7, 0.1745F, 0.0F, -0.2182F);
		grip4_r7.cubeList.add(new ModelBox(grip4_r7, 0, 4, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		grip3_r3 = new ModelRenderer(this);
		grip3_r3.setRotationPoint(0.7F, -32.0F, -9.5F);
		gun.addChild(grip3_r3);
		setRotationAngle(grip3_r3, 0.0F, 0.0F, 0.2618F);
		grip3_r3.cubeList.add(new ModelBox(grip3_r3, 0, 12, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		grip2_r2 = new ModelRenderer(this);
		grip2_r2.setRotationPoint(0.5F, -27.0F, -6.5F);
		gun.addChild(grip2_r2);
		setRotationAngle(grip2_r2, 0.2182F, 0.0F, 0.0F);
		grip2_r2.cubeList.add(new ModelBox(grip2_r2, 14, 70, -3.999F, -4.0F, 3.0F, 4, 4, 3, 0.0F, false));
		grip2_r2.cubeList.add(new ModelBox(grip2_r2, 51, 71, -3.5F, -4.0F, 0.0F, 3, 4, 3, 0.0F, false));

		grip2_r3 = new ModelRenderer(this);
		grip2_r3.setRotationPoint(-0.5F, -30.0F, -10.0F);
		gun.addChild(grip2_r3);
		setRotationAngle(grip2_r3, 0.2182F, 0.0F, 0.0F);
		grip2_r3.cubeList.add(new ModelBox(grip2_r3, 7, 18, -2.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, false));

		gunslide = new ModelRenderer(this);
		gunslide.setRotationPoint(0.0F, -33.0F, 0.0F);
		gun.addChild(gunslide);
		gunslide.cubeList.add(new ModelBox(gunslide, 0, 8, -0.4F, -2.0F, -15.5F, 1, 2, 2, 0.0F, false));
		gunslide.cubeList.add(new ModelBox(gunslide, 63, 56, -0.65F, -0.9F, -13.5F, 1, 1, 6, 0.0F, false));
		gunslide.cubeList.add(new ModelBox(gunslide, 56, 10, -0.397F, -2.0F, -22.1F, 1, 1, 7, 0.0F, false));
		gunslide.cubeList.add(new ModelBox(gunslide, 71, 70, -0.398F, -2.65F, -22.1F, 1, 1, 5, 0.0F, false));
		gunslide.cubeList.add(new ModelBox(gunslide, 7, 28, -2.498F, -0.9F, -23.8F, 2, 1, 1, 0.0F, false));
		gunslide.cubeList.add(new ModelBox(gunslide, 23, 72, -0.799F, -3.849F, -21.9F, 1, 1, 5, -0.2F, false));
		gunslide.cubeList.add(new ModelBox(gunslide, 63, 71, -3.201F, -3.849F, -21.9F, 1, 1, 5, -0.2F, false));
		gunslide.cubeList.add(new ModelBox(gunslide, 49, 43, -3.0F, -3.65F, -23.8F, 3, 1, 3, 0.0F, false));
		gunslide.cubeList.add(new ModelBox(gunslide, 54, 56, -3.603F, -2.0F, -22.1F, 1, 1, 7, 0.0F, false));
		gunslide.cubeList.add(new ModelBox(gunslide, 71, 51, -3.602F, -2.65F, -22.1F, 1, 1, 5, 0.0F, false));
		gunslide.cubeList.add(new ModelBox(gunslide, 0, 0, -3.6F, -2.0F, -15.5F, 1, 2, 2, 0.0F, false));
		gunslide.cubeList.add(new ModelBox(gunslide, 40, 63, -3.35F, -0.9F, -13.5F, 1, 1, 6, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.6F, 0.0F, -15.5F);
		gunslide.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.637F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 48, -1.001F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 51, 2.201F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.0F, -3.65F, -15.1F);
		gunslide.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.5411F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 69, 37, -0.001F, 0.16F, -7.0F, 1, 1, 5, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 67, 23, 0.0F, 0.0F, -8.0F, 1, 1, 6, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -3.65F, -15.1F);
		gunslide.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.5411F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 56, 64, -1.001F, 0.16F, -7.0F, 1, 1, 5, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 67, 16, -1.0F, 0.0F, -8.0F, 1, 1, 6, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.1F, -3.75F, -22.9F);
		gunslide.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.5411F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 54, 56, 0.04F, -0.07F, -1.001F, 1, 1, 1, -0.1F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -3.75F, -22.9F);
		gunslide.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.5411F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 10, -0.95F, -0.01F, -1.001F, 1, 1, 1, -0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.2F, -2.95F, -23.8F);
		gunslide.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.0524F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 0, 0.002F, 1.0F, 6.0F, 1, 2, 3, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 58, 0.002F, 0.0F, 0.0F, 1, 3, 6, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.05F, -23.8F);
		gunslide.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 49, 26, -2.998F, -0.05F, 0.0F, 3, 2, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.2F, -2.95F, -23.8F);
		gunslide.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.0524F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 9, -0.998F, 1.0F, 6.0F, 1, 2, 3, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 0, -0.998F, 0.0F, 0.0F, 1, 3, 6, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.6F, -1.15F, -22.1F);
		gunslide.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -0.1833F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 50, 15, 0.002F, -0.85F, -1.7F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 5, 52, 0.002F, -0.85F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.6F, -1.15F, -22.1F);
		gunslide.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.1833F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 56, 48, -0.998F, -0.85F, -1.7F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 56, 50, -0.998F, -0.85F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.6F, -1.65F, -22.1F);
		gunslide.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.1745F, -0.1833F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 49, 38, 0.0F, -1.0F, -1.8F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 50, 11, 0.001F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.6F, -1.65F, -22.1F);
		gunslide.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.1745F, 0.1833F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 12, -1.0F, -1.0F, -1.8F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 14, -0.999F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

		rotatingbarrel = new ModelRenderer(this);
		rotatingbarrel.setRotationPoint(-0.5F, -33.25F, -24.0F);
		gun.addChild(rotatingbarrel);
		rotatingbarrel.cubeList.add(new ModelBox(rotatingbarrel, 0, 18, -2.0F, -2.45F, 0.0F, 2, 2, 13, 0.0F, false));

		slideactual = new ModelRenderer(this);
		slideactual.setRotationPoint(0.0F, -9.0F, -2.0F);
		slideactual.cubeList.add(new ModelBox(slideactual, 34, 48, -0.3F, -2.0F, -11.5F, 1, 2, 8, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 68, 30, -0.68F, -3.1F, -15.1F, 1, 1, 6, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 38, 36, -0.4F, -3.1F, -12.1F, 1, 1, 3, -0.2F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 38, 31, -3.6F, -3.1F, -12.1F, 1, 1, 3, -0.2F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 62, 64, -0.78F, -2.1F, -15.1F, 1, 1, 6, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 19, 0, -0.68F, -2.6F, -9.1F, 1, 2, 5, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 65, 9, -3.325F, -3.1F, -15.101F, 1, 1, 6, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 48, 64, -3.225F, -2.1F, -15.101F, 1, 1, 6, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 30, 67, -3.0F, -3.6F, -15.1F, 1, 1, 6, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 59, 18, -1.0F, -3.6F, -15.1F, 1, 1, 6, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 0, 21, -2.0F, -3.6F, -14.1F, 1, 1, 1, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 19, 9, -2.0F, -3.6F, -10.1F, 1, 1, 1, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 19, 7, -2.0F, -3.6F, -12.1F, 1, 1, 1, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 55, 48, -3.0F, -3.6F, -4.5F, 1, 1, 7, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 33, 48, -2.0F, -3.5F, -4.5F, 1, 1, 3, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 13, 53, -1.0F, -3.6F, -4.5F, 1, 1, 7, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 35, 0, -2.0F, -3.6F, -1.5F, 1, 1, 4, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 19, 7, -2.5F, -3.6F, -19.1F, 2, 1, 4, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 22, 56, -3.325F, -3.1F, -4.501F, 1, 1, 1, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 32, 14, -3.125F, -2.2F, -4.501F, 1, 2, 4, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 19, 0, -0.679F, -3.1F, -4.501F, 1, 2, 1, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 0, 58, -0.779F, -3.0F, -3.501F, 1, 3, 6, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 22, 63, -3.25F, -3.0F, -3.501F, 1, 1, 6, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 45, 11, -3.25F, -2.0F, -0.501F, 1, 1, 3, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 61, 37, -3.25F, -1.0F, -3.501F, 1, 1, 6, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 49, 21, -3.7F, -1.0F, -11.5F, 1, 1, 8, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 0, 36, -3.7F, -2.0F, -11.5F, 1, 1, 2, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 16, 53, -3.701F, -1.999F, -10.1F, 1, 1, 1, 0.0F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 56, 52, -0.2F, -1.2F, 2.5F, 1, 1, 1, -0.2F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 14, 33, -3.8F, -1.2F, 2.5F, 1, 1, 1, -0.2F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 35, 2, -0.199F, -1.2F, 2.1F, 1, 1, 1, -0.2F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 25, 35, -3.799F, -1.2F, 2.1F, 1, 1, 1, -0.2F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 38, 16, -0.199F, -0.8F, 2.501F, 1, 1, 1, -0.2F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 25, 33, -3.799F, -0.8F, 2.501F, 1, 1, 1, -0.2F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 35, 0, -0.399F, -0.8F, 2.5F, 1, 1, 1, -0.2F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 32, 22, -3.599F, -0.8F, 2.5F, 1, 1, 1, -0.2F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 38, 14, -0.2F, -0.8F, 2.101F, 1, 1, 1, -0.2F, false));
		slideactual.cubeList.add(new ModelBox(slideactual, 14, 35, -3.8F, -0.8F, 2.101F, 1, 1, 1, -0.2F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.6F, -1.0F, 3.3F);
		slideactual.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.288F, -0.0349F, 0.1396F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 49, 32, 0.001F, -2.2F, -0.999F, 1, 1, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 18, 0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.6F, -1.0F, 3.3F);
		slideactual.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.288F, 0.0349F, -0.1396F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 49, 36, -0.999F, -2.2F, -0.999F, 1, 1, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 17, 18, -1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.6F, -3.35F, 1.3F);
		slideactual.addChild(cube_r15);
		setRotationAngle(cube_r15, -1.2654F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 47, 0, -0.93F, 0.0F, -0.001F, 1, 1, 3, -0.2F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 48, 2.12F, 0.0F, -0.001F, 1, 1, 3, -0.2F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 43, 29, -0.93F, 0.0F, 2.5F, 1, 1, 1, -0.2F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 27, 48, 2.1F, 0.0F, 2.5F, 1, 1, 1, -0.2F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-2.6F, -3.35F, -1.0F);
		slideactual.addChild(cube_r16);
		setRotationAngle(cube_r16, -1.2654F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 43, 27, -0.93F, 0.0F, -0.001F, 1, 1, 1, -0.2F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 48, 2.12F, 0.0F, -0.001F, 1, 1, 3, -0.2F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 43, 36, -0.93F, 0.0F, 2.5F, 1, 1, 1, -0.2F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 38, 48, 2.1F, 0.0F, 2.5F, 1, 1, 1, -0.2F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 27, -0.931F, 0.0F, 2.1F, 1, 1, 1, -0.2F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.6F, -3.35F, 0.1F);
		slideactual.addChild(cube_r17);
		setRotationAngle(cube_r17, -1.2654F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 45, 15, -0.93F, 0.0F, -0.001F, 1, 1, 3, -0.2F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 47, 4, 2.12F, 0.0F, -0.001F, 1, 1, 3, -0.2F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 43, 31, -0.93F, 0.0F, 2.5F, 1, 1, 1, -0.2F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 48, 2.1F, 0.0F, 2.5F, 1, 1, 1, -0.2F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.8F, -3.35F, -2.2F);
		slideactual.addChild(cube_r18);
		setRotationAngle(cube_r18, -1.2654F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 27, 7, -0.731F, 0.0F, 2.1F, 1, 1, 1, -0.2F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 5, 48, -0.73F, 0.0F, 2.5F, 1, 1, 1, -0.2F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 49, 30, 2.3F, 0.0F, 2.5F, 1, 1, 1, -0.2F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 26, 2, -0.731F, 0.0F, 0.4F, 1, 1, 1, -0.2F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 41, 2, -0.73F, 0.0F, -0.001F, 1, 1, 1, -0.2F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 22, 48, 2.32F, 0.0F, -0.001F, 1, 1, 3, -0.2F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.6F, -3.35F, -1.0F);
		slideactual.addChild(cube_r19);
		setRotationAngle(cube_r19, -1.2654F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 0, -0.931F, 0.0F, 0.4F, 1, 1, 1, -0.2F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-2.7F, -3.1F, -3.5F);
		slideactual.addChild(cube_r20);
		setRotationAngle(cube_r20, -1.2654F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 26, -1.01F, 0.0F, 1.998F, 1, 1, 1, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 7, 25, 2.42F, 0.0F, 0.998F, 1, 1, 2, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 41, 0, -0.63F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 33, 2.02F, 0.0F, -0.001F, 1, 1, 2, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.0F, -0.9F, 3.25F);
		slideactual.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.4014F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 32, 20, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.5F, -1.3F, 3.36F);
		slideactual.addChild(cube_r22);
		setRotationAngle(cube_r22, -1.3614F, -0.2182F, 0.7418F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 27, 9, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.2F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, -0.9F, 3.25F);
		slideactual.addChild(cube_r23);
		setRotationAngle(cube_r23, -1.2741F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 19, 14, -3.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, -3.6F, 2.5F);
		slideactual.addChild(cube_r24);
		setRotationAngle(cube_r24, -1.2654F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 56, 18, -3.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-3.1F, -3.9F, -4.3F);
		slideactual.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.5672F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 45, 55, 0.045F, 0.0F, -0.001F, 1, 1, 7, -0.2F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 22, 54, 0.046F, 0.0F, -0.401F, 1, 1, 1, -0.2F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 25, 55, 0.046F, 0.0F, -5.601F, 1, 1, 1, -0.2F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 67, 0.045F, 0.0F, -11.0F, 1, 1, 6, -0.2F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, -3.9F, -4.3F);
		slideactual.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.5672F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 22, 54, -0.96F, 0.05F, -0.001F, 1, 1, 7, -0.2F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 52, 0, -0.959F, 0.05F, -0.401F, 1, 1, 1, -0.2F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 52, 4, -0.959F, 0.05F, -5.601F, 1, 1, 1, -0.2F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 64, 44, -0.96F, 0.05F, -11.0F, 1, 1, 6, -0.2F, false));

		rotatingbarrel2 = new ModelRenderer(this);
		rotatingbarrel2.setRotationPoint(-0.5F, -9.25F, -24.0F);
		rotatingbarrel2.cubeList.add(new ModelBox(rotatingbarrel2, 17, 18, -2.0F, -2.45F, 2.4F, 2, 2, 11, -0.3F, false));

		movingpart = new ModelRenderer(this);
		movingpart.setRotationPoint(-3.25F, -10.0F, -11.0F);
		movingpart.cubeList.add(new ModelBox(movingpart, 39, 70, 0.15F, -2.0F, -0.5F, 1, 2, 5, 0.0F, false));
		movingpart.cubeList.add(new ModelBox(movingpart, 0, 18, 2.35F, -2.0F, -0.5F, 1, 2, 5, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.25F, -2.5F, 4.5F);
		movingpart.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0524F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 14, 33, 0.0F, 0.0F, -5.0F, 3, 1, 5, 0.0F, false));

		lever = new ModelRenderer(this);
		lever.setRotationPoint(-4.1F, -7.3F, -5.0F);
		setRotationAngle(lever, -0.0873F, -0.1134F, -0.1309F);
		lever.cubeList.add(new ModelBox(lever, 0, 25, 0.0F, -1.0F, -5.0F, 1, 1, 5, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
		lever.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.3927F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 19, 3, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
//		slideactual.render(f5);
//		rotatingbarrel2.render(f5);
//		movingpart.render(f5);
		lever.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
