package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class S710TricunHandguard extends ModelWithAttachments {
	private final ModelRenderer handguard;
	private final ModelRenderer gun63_r2;
	private final ModelRenderer gun62_r1;
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

	public S710TricunHandguard() {
		textureWidth = 200;
		textureHeight = 200;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(1.0F, -14.5F, -23.4F);
		handguard.cubeList.add(new ModelBox(handguard, 70, 49, -1.099F, 0.3F, -18.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 45, 0, -4.899F, 0.3F, -18.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 32, 116, -1.0F, 0.2F, -17.2F, 1, 1, 14, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 16, 115, -5.0F, 0.2F, -17.2F, 1, 1, 14, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 68, 115, -1.001F, 1.8F, -17.2F, 1, 1, 14, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 114, -5.001F, 1.8F, -17.2F, 1, 1, 14, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 70, 20, -1.099F, 0.3F, -14.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 44, 26, -4.899F, 0.3F, -14.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 63, 55, -1.099F, 0.3F, -10.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 38, 26, -4.899F, 0.3F, -10.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 63, 51, -1.099F, 0.3F, -6.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 32, 26, -4.899F, 0.3F, -6.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 38, 52, -1.099F, 0.3F, -4.0F, 1, 2, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 11, 52, -4.899F, 0.3F, -4.0F, 1, 2, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 24, 77, -3.5F, 3.2F, -18.999F, 2, 1, 20, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 101, -2.2F, -2.2F, -17.0F, 1, 1, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 99, 50, -3.8F, -2.2F, -17.0F, 1, 1, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 72, -3.5F, -2.0F, -1.0F, 2, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 44, 65, -3.9F, -1.2F, -1.0F, 1, 2, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 13, 62, -3.9F, -1.2F, -17.0F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 36, 65, -2.1F, -1.2F, -1.0F, 1, 2, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 56, 35, -2.1F, -1.2F, -17.0F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 77, 56, -3.0F, -1.0F, -15.0F, 1, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 83, -3.0F, -1.0F, -12.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 70, -3.0F, -1.0F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 60, -3.0F, -1.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 81, -3.0F, -1.0F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 79, -3.0F, -1.0F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 64, -3.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 25, 56, -3.501F, 4.0F, -2.6F, 2, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 86, -1.1F, 1.7F, -18.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 88, -4.9F, 1.7F, -18.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 100, 86, -1.1F, 1.7F, -4.0F, 1, 1, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 100, 75, -4.9F, 1.7F, -4.0F, 1, 1, 5, 0.0F, false));

		gun63_r2 = new ModelRenderer(this);
		gun63_r2.setRotationPoint(-3.7F, 3.8F, -2.2F);
		handguard.addChild(gun63_r2);
		setRotationAngle(gun63_r2, -0.3316F, 0.0F, 0.0F);
		gun63_r2.cubeList.add(new ModelBox(gun63_r2, 88, 27, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));
		gun63_r2.cubeList.add(new ModelBox(gun63_r2, 88, 29, 1.4F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun62_r1 = new ModelRenderer(this);
		gun62_r1.setRotationPoint(-3.7F, 3.8F, -0.5F);
		handguard.addChild(gun62_r1);
		setRotationAngle(gun62_r1, -0.3316F, 0.0F, 0.0F);
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 88, 25, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 88, 73, 1.4F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.7F, 2.7F, -1.0F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 26, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 52, 0.0F, 0.0F, -4.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 56, 0.0F, 0.0F, -10.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 45, 52, 0.0F, 0.0F, -8.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 57, 57, 0.0F, 0.0F, -14.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 51, 0, 0.0F, 0.0F, -2.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 52, 0.0F, 0.0F, -6.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 57, 0.0F, 0.0F, -12.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 88, 0.0F, 1.0F, -18.0F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 12, 0.0F, 0.0F, -17.0F, 1, 2, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.3F, 2.7F, -1.0F);
		handguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 15, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 61, -1.0F, 0.0F, -4.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 62, 62, -1.0F, 0.0F, -10.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 61, 25, -1.0F, 0.0F, -8.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 63, 0, -1.0F, 0.0F, -14.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 57, 52, -1.0F, 0.0F, -2.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 61, 30, -1.0F, 0.0F, -6.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 62, -1.0F, 0.0F, -12.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 88, 21, -1.0F, 1.0F, -18.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 65, -1.0F, 0.0F, -17.0F, 1, 2, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.05F, 2.8F, -16.2F);
		handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 96, -0.95F, 1.0F, 0.0F, 1, 1, 16, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.2F, 2.8F, -16.2F);
		handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 98, -0.943F, 1.0F, 0.0F, 1, 1, 16, -0.2F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 99, 42, -0.943F, -0.4F, 0.0F, 1, 1, 16, -0.2F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.03F, 2.8F, -16.2F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 97, -0.92F, -0.4F, 0.0F, 1, 1, 16, -0.2F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.0F, 3.4F, -19.0F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.6807F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 69, -0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.0F, 3.4F, -19.0F);
		handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.6807F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 71, 35, -1.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.5F, 5.0F, -2.6F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, 2.6616F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 72, -1.002F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.5F, 5.0F, 0.4F);
		handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, 2.4435F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 86, 48, -1.002F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.0F, -1.0F, -2.0F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.8727F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 90, 5, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 33, 90, 0.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 90, 0.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 90, 0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 90, 0.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 89, 3, 0.0F, 0.0F, -10.0F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 77, 48, 0.0F, 0.0F, -13.0F, 1, 1, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.0F, -1.0F, -2.0F);
		handguard.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.8727F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 11, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 17, -1.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 33, -1.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 9, -1.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 13, -1.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 35, -1.0F, 0.0F, -10.0F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 77, 51, -1.0F, 0.0F, -13.0F, 1, 1, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-3.76F, -0.35F, -15.0F);
		handguard.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.3491F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 84, 116, 0.0F, 0.0F, 0.0F, 1, 1, 14, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.24F, -0.35F, -15.0F);
		handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.3491F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 117, 38, -1.0F, 0.0F, 0.0F, 1, 1, 14, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.25F, -0.7F, -13.0F);
		handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.8727F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 50, 128, -0.265F, -0.17F, -0.2F, 1, 1, 12, -0.2F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.7F, -0.7F, -13.0F);
		handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.8727F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 129, -0.765F, -0.2F, -0.2F, 1, 1, 12, -0.2F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-4.11F, -0.5F, -15.0F);
		handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -1.0036F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 70, 96, -1.3F, 0.0F, 1.0F, 1, 1, 13, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.1F, -0.85F, -15.0F);
		handguard.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 1.0036F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 118, 17, 0.7F, 0.0F, 1.0F, 1, 1, 13, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 52, 67, -0.2F, 0.0F, 14.0F, 2, 1, 2, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 89, 0, 0.4F, 0.0F, -3.0F, 1, 1, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 25, 52, -0.2F, 0.0F, -2.0F, 2, 1, 3, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-3.9F, -0.85F, -17.0F);
		handguard.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -1.0036F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 88, 75, -1.4F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 31, -1.8F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 56, 40, -1.8F, 0.0F, 16.0F, 2, 1, 2, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-4.11F, -0.5F, -18.0F);
		handguard.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.7156F, -1.0036F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 46, 74, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.89F, -0.5F, -18.0F);
		handguard.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, -0.7156F, 1.0036F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 76, 4, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.1F, -1.2F, -1.0F);
		handguard.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.9512F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 76, 8, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-3.9F, -1.2F, -1.0F);
		handguard.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.9512F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 76, 11, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
