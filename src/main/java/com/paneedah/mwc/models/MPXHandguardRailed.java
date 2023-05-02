package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MPXHandguardRailed extends ModelWithAttachments {
	private final QRenderer mpx_handguard2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer mpx_handguard_left_r39;
	private final ModelRenderer mpx_handguard_left_r40;
	private final ModelRenderer mpx_handguard_left_r41;
	private final ModelRenderer mpx_handguard_left_r42;
	private final ModelRenderer mpx_handguard_left_r43;
	private final ModelRenderer mpx_handguard_left_r44;
	private final ModelRenderer mpx_handguard_left_r45;
	private final ModelRenderer mpx_handguard_left_r46;
	private final ModelRenderer mpx_handguard_left_r47;
	private final ModelRenderer mpx_handguard_left_r48;
	private final ModelRenderer barrel2;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;

	public MPXHandguardRailed() {
		textureWidth = 256;
		textureHeight = 256;

		mpx_handguard2 = new QRenderer(this);
		mpx_handguard2.setRotationPoint(0.0F, 24.0F, 0.0F);
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 49, 50, 1.0F, -40.0F, -46.5F, 1, 3, 21, 0.0F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 176, 173, -3.0F, -36.25F, -46.5F, 3, 1, 21, 0.0F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 0, 50, -5.0F, -40.0F, -46.5F, 1, 3, 21, 0.0F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 0, 97, 1.4F, -39.5F, -46.5F, 1, 2, 21, -0.001F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 104, 26, 2.2F, -39.5F, -46.7F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 104, 22, 2.2F, -39.5F, -44.2F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 103, 76, 2.2F, -39.5F, -41.7F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 103, 72, 2.2F, -39.5F, -39.2F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 23, 103, 2.2F, -39.5F, -36.7F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 6, 103, 2.2F, -39.5F, -34.2F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 0, 103, 2.2F, -39.5F, -31.7F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 102, 102, 2.2F, -39.5F, -29.2F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 85, 102, 2.2F, -39.5F, -27.3F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 52, 0, -5.4F, -39.5F, -46.5F, 1, 2, 21, -0.001F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 100, 28, -6.2F, -39.5F, -46.7F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 100, 32, -6.2F, -39.5F, -44.2F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 100, 39, -6.2F, -39.5F, -41.7F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 98, 100, -6.2F, -39.5F, -39.2F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 48, 102, -6.2F, -39.5F, -36.7F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 54, 102, -6.2F, -39.5F, -34.2F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 60, 102, -6.2F, -39.5F, -31.7F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 73, 102, -6.2F, -39.5F, -29.2F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 79, 102, -6.2F, -39.5F, -27.3F, 1, 2, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 179, 72, -2.5F, -35.8F, -46.5F, 2, 1, 21, -0.001F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 76, 45, -2.5F, -35.0F, -46.7F, 2, 1, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 84, 45, -2.5F, -35.0F, -44.2F, 2, 1, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 10, 89, -2.5F, -35.0F, -41.7F, 2, 1, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 70, 90, -2.5F, -35.0F, -39.2F, 2, 1, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 92, 45, -2.5F, -35.0F, -36.7F, 2, 1, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 54, 97, -2.5F, -35.0F, -34.2F, 2, 1, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 79, 97, -2.5F, -35.0F, -31.7F, 2, 1, 2, -0.2F, false));
		mpx_handguard2.cubeList.add(new ModelBox(mpx_handguard2, 99, 82, -2.5F, -35.0F, -29.2F, 2, 1, 2, -0.2F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.7F, -34.2F, -29.0F);
		mpx_handguard2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.576F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 110, 99, -0.2F, -0.8F, -0.2F, 1, 1, 2, -0.202F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 110, 95, -0.2F, -0.8F, -2.7F, 1, 1, 2, -0.202F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 110, 81, -0.2F, -0.8F, -5.2F, 1, 1, 2, -0.202F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 110, 6, -0.2F, -0.8F, -7.7F, 1, 1, 2, -0.202F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 110, 3, -0.2F, -0.8F, -10.2F, 1, 1, 2, -0.202F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 110, -0.2F, -0.8F, -12.7F, 1, 1, 2, -0.202F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 109, 90, -0.2F, -0.8F, -15.2F, 1, 1, 2, -0.202F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 109, 77, -0.2F, -0.8F, -17.7F, 1, 1, 2, -0.202F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.3F, -34.2F, -29.0F);
		mpx_handguard2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.576F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 98, 110, -0.8F, -0.8F, -0.2F, 1, 1, 2, -0.202F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 110, 84, -0.8F, -0.8F, -2.7F, 1, 1, 2, -0.202F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 110, -0.8F, -0.8F, -5.2F, 1, 1, 2, -0.202F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 110, -0.8F, -0.8F, -7.7F, 1, 1, 2, -0.202F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 110, 0, -0.8F, -0.8F, -10.2F, 1, 1, 2, -0.202F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 102, 109, -0.8F, -0.8F, -12.7F, 1, 1, 2, -0.202F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 85, 109, -0.8F, -0.8F, -15.2F, 1, 1, 2, -0.202F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 79, 109, -0.8F, -0.8F, -17.7F, 1, 1, 2, -0.202F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-6.0F, -39.3F, -27.1F);
		mpx_handguard2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.576F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 54, 112, -0.2F, -0.8F, -0.2F, 1, 1, 2, -0.202F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 112, 40, -0.2F, -0.8F, -2.1F, 1, 1, 2, -0.202F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 112, -0.2F, -0.8F, -4.6F, 1, 1, 2, -0.202F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 111, 71, -0.2F, -0.8F, -7.1F, 1, 1, 2, -0.202F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 111, -0.2F, -0.8F, -9.6F, 1, 1, 2, -0.202F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 111, 15, -0.2F, -0.8F, -12.1F, 1, 1, 2, -0.202F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 111, -0.2F, -0.8F, -14.6F, 1, 1, 2, -0.202F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 110, 108, -0.2F, -0.8F, -17.1F, 1, 1, 2, -0.202F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 110, 102, -0.2F, -0.8F, -19.6F, 1, 1, 2, -0.202F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-6.0F, -37.7F, -27.1F);
		mpx_handguard2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.576F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 112, -0.2F, -0.2F, -0.2F, 1, 1, 2, -0.202F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 112, -0.2F, -0.2F, -2.1F, 1, 1, 2, -0.202F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 110, 111, -0.2F, -0.2F, -4.6F, 1, 1, 2, -0.202F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 111, 67, -0.2F, -0.2F, -7.1F, 1, 1, 2, -0.202F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 111, -0.2F, -0.2F, -9.6F, 1, 1, 2, -0.202F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 111, 12, -0.2F, -0.2F, -12.1F, 1, 1, 2, -0.202F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 111, 9, -0.2F, -0.2F, -14.6F, 1, 1, 2, -0.202F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 106, 110, -0.2F, -0.2F, -17.1F, 1, 1, 2, -0.202F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 110, 105, -0.2F, -0.2F, -19.6F, 1, 1, 2, -0.202F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(3.0F, -37.7F, -27.1F);
		mpx_handguard2.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.576F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 73, 112, -0.8F, -0.2F, -0.2F, 1, 1, 2, -0.202F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 85, 112, -0.8F, -0.2F, -2.1F, 1, 1, 2, -0.202F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 113, -0.8F, -0.2F, -4.6F, 1, 1, 2, -0.202F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 113, -0.8F, -0.2F, -7.1F, 1, 1, 2, -0.202F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 113, 48, -0.8F, -0.2F, -9.6F, 1, 1, 2, -0.202F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 113, 54, -0.8F, -0.2F, -12.1F, 1, 1, 2, -0.202F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 113, 60, -0.8F, -0.2F, -14.6F, 1, 1, 2, -0.202F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 113, 74, -0.8F, -0.2F, -17.1F, 1, 1, 2, -0.202F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 113, 78, -0.8F, -0.2F, -19.6F, 1, 1, 2, -0.202F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(3.0F, -39.3F, -27.1F);
		mpx_handguard2.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.576F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 60, 112, -0.8F, -0.8F, -0.2F, 1, 1, 2, -0.202F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 79, 112, -0.8F, -0.8F, -2.1F, 1, 1, 2, -0.202F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 102, 112, -0.8F, -0.8F, -4.6F, 1, 1, 2, -0.202F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 113, -0.8F, -0.8F, -7.1F, 1, 1, 2, -0.202F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 113, 45, -0.8F, -0.8F, -9.6F, 1, 1, 2, -0.202F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 113, 51, -0.8F, -0.8F, -12.1F, 1, 1, 2, -0.202F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 113, 57, -0.8F, -0.8F, -14.6F, 1, 1, 2, -0.202F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 113, 63, -0.8F, -0.8F, -17.1F, 1, 1, 2, -0.202F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 113, 91, -0.8F, -0.8F, -19.6F, 1, 1, 2, -0.202F, false));

		mpx_handguard_left_r39 = new ModelRenderer(this);
		mpx_handguard_left_r39.setRotationPoint(2.0F, -40.0F, -46.5F);
		mpx_handguard2.addChild(mpx_handguard_left_r39);
		setRotationAngle(mpx_handguard_left_r39, 0.0F, 0.0F, 0.925F);
		mpx_handguard_left_r39.cubeList.add(new ModelBox(mpx_handguard_left_r39, 117, 180, -2.0F, 0.0F, 0.0F, 2, 1, 21, 0.001F, false));

		mpx_handguard_left_r40 = new ModelRenderer(this);
		mpx_handguard_left_r40.setRotationPoint(-3.0F, -35.25F, -46.5F);
		mpx_handguard2.addChild(mpx_handguard_left_r40);
		setRotationAngle(mpx_handguard_left_r40, 0.0F, 0.0F, 0.7156F);
		mpx_handguard_left_r40.cubeList.add(new ModelBox(mpx_handguard_left_r40, 98, 95, -2.6F, -1.0F, 0.0F, 1, 1, 21, -0.002F, false));
		mpx_handguard_left_r40.cubeList.add(new ModelBox(mpx_handguard_left_r40, 179, 94, -2.0F, -1.0F, 0.0F, 2, 1, 21, -0.001F, false));

		mpx_handguard_left_r41 = new ModelRenderer(this);
		mpx_handguard_left_r41.setRotationPoint(0.0F, -35.25F, -46.5F);
		mpx_handguard2.addChild(mpx_handguard_left_r41);
		setRotationAngle(mpx_handguard_left_r41, 0.0F, 0.0F, -0.7156F);
		mpx_handguard_left_r41.cubeList.add(new ModelBox(mpx_handguard_left_r41, 99, 45, 1.6F, -1.0F, 0.0F, 1, 1, 21, -0.002F, false));
		mpx_handguard_left_r41.cubeList.add(new ModelBox(mpx_handguard_left_r41, 180, 0, 0.0F, -1.0F, 0.0F, 2, 1, 21, -0.001F, false));

		mpx_handguard_left_r42 = new ModelRenderer(this);
		mpx_handguard_left_r42.setRotationPoint(2.0F, -37.0F, -25.5F);
		mpx_handguard2.addChild(mpx_handguard_left_r42);
		setRotationAngle(mpx_handguard_left_r42, -0.0249F, 0.6064F, 0.8305F);
		mpx_handguard_left_r42.cubeList.add(new ModelBox(mpx_handguard_left_r42, 17, 58, -1.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

		mpx_handguard_left_r43 = new ModelRenderer(this);
		mpx_handguard_left_r43.setRotationPoint(-5.0F, -37.0F, -25.5F);
		mpx_handguard2.addChild(mpx_handguard_left_r43);
		setRotationAngle(mpx_handguard_left_r43, -0.0249F, -0.6064F, -0.8305F);
		mpx_handguard_left_r43.cubeList.add(new ModelBox(mpx_handguard_left_r43, 67, 23, 0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

		mpx_handguard_left_r44 = new ModelRenderer(this);
		mpx_handguard_left_r44.setRotationPoint(-5.0F, -40.0F, -25.5F);
		mpx_handguard2.addChild(mpx_handguard_left_r44);
		setRotationAngle(mpx_handguard_left_r44, 0.0F, 0.7854F, 0.576F);
		mpx_handguard_left_r44.cubeList.add(new ModelBox(mpx_handguard_left_r44, 67, 32, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		mpx_handguard_left_r45 = new ModelRenderer(this);
		mpx_handguard_left_r45.setRotationPoint(2.0F, -40.0F, -25.5F);
		mpx_handguard2.addChild(mpx_handguard_left_r45);
		setRotationAngle(mpx_handguard_left_r45, 0.0F, -0.7854F, -0.576F);
		mpx_handguard_left_r45.cubeList.add(new ModelBox(mpx_handguard_left_r45, 67, 36, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		mpx_handguard_left_r46 = new ModelRenderer(this);
		mpx_handguard_left_r46.setRotationPoint(-5.0F, -37.0F, -25.5F);
		mpx_handguard2.addChild(mpx_handguard_left_r46);
		setRotationAngle(mpx_handguard_left_r46, 0.0F, 0.7854F, 0.0F);
		mpx_handguard_left_r46.cubeList.add(new ModelBox(mpx_handguard_left_r46, 37, 0, 0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

		mpx_handguard_left_r47 = new ModelRenderer(this);
		mpx_handguard_left_r47.setRotationPoint(2.0F, -37.0F, -25.5F);
		mpx_handguard2.addChild(mpx_handguard_left_r47);
		setRotationAngle(mpx_handguard_left_r47, 0.0F, -0.7854F, 0.0F);
		mpx_handguard_left_r47.cubeList.add(new ModelBox(mpx_handguard_left_r47, 43, 0, -1.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

		mpx_handguard_left_r48 = new ModelRenderer(this);
		mpx_handguard_left_r48.setRotationPoint(-5.0F, -40.0F, -46.5F);
		mpx_handguard2.addChild(mpx_handguard_left_r48);
		setRotationAngle(mpx_handguard_left_r48, 0.0F, 0.0F, -0.925F);
		mpx_handguard_left_r48.cubeList.add(new ModelBox(mpx_handguard_left_r48, 0, 181, 0.0F, 0.0F, 0.0F, 2, 1, 21, 0.001F, false));

		barrel2 = new ModelRenderer(this);
		barrel2.setRotationPoint(-1.0F, -40.0F, -51.0F);
		mpx_handguard2.addChild(barrel2);
		barrel2.cubeList.add(new ModelBox(barrel2, 77, 85, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 48, 97, -1.5F, 0.5F, 5.0F, 2, 2, 21, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 82, 15, -1.0F, 2.0F, 0.0F, 1, 1, 5, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 65, 108, -2.0F, 1.0F, 4.0F, 1, 1, 1, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 31, 108, -2.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 107, 86, 0.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 40, 107, 0.0F, 1.0F, 4.0F, 1, 1, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.0F, 0.3F, -0.8F);
		barrel2.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 225, 64, 0.0F, 0.0F, 1.0F, 1, 1, 5, 0.204F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.0F, 1.3F, -0.8F);
		barrel2.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 239, 69, 0.0F, 0.0F, 1.0F, 1, 1, 5, 0.203F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 1.3F, -0.8F);
		barrel2.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 225, 53, 0.0F, 0.0F, 1.0F, 1, 1, 5, 0.202F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.3F, -0.8F);
		barrel2.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 212, 50, 0.0F, 0.0F, 1.0F, 1, 1, 5, 0.201F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mpx_handguard2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
