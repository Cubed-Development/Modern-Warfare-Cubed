package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ScarIron1 extends ModelBase {
	private final QRenderer sight;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer sight16_r1;
	private final ModelRenderer sight19_r1;
	private final ModelRenderer sight31_r1;
	private final ModelRenderer sight31_r2;
	private final ModelRenderer bone;
	private final ModelRenderer sight8_r1;
	private final ModelRenderer sight10_r1;
	private final ModelRenderer sight9_r1;
	private final ModelRenderer sight10_r2;
	private final ModelRenderer sight9_r2;
	private final ModelRenderer sight9_r3;
	private final ModelRenderer bone4;
	private final ModelRenderer sight9_r4;
	private final ModelRenderer sight11_r1;
	private final ModelRenderer sight10_r3;
	private final ModelRenderer sight10_r4;
	private final ModelRenderer sight11_r2;
	private final ModelRenderer sight10_r5;
	private final ModelRenderer bone2;
	private final ModelRenderer sight9_r5;
	private final ModelRenderer sight11_r3;
	private final ModelRenderer sight10_r6;
	private final ModelRenderer sight10_r7;
	private final ModelRenderer bone3;
	private final ModelRenderer sight10_r8;
	private final ModelRenderer sight12_r1;
	private final ModelRenderer sight11_r4;
	private final ModelRenderer sight11_r5;

	public ScarIron1() {
		textureWidth = 64;
		textureHeight = 64;

		sight = new QRenderer(this);
		sight.setRotationPoint(0.0F, 24.0F, 0.0F);
		sight.cubeList.add(new ModelBox(sight, 0, 0, -2.5F, -19.25F, -7.0F, 8, 2, 7, 0.0F, false));
		sight.cubeList.add(new ModelBox(sight, 24, 17, -2.5F, -18.25F, -8.0F, 8, 1, 1, 0.0F, false));
		sight.cubeList.add(new ModelBox(sight, 12, 11, -2.5F, -17.25F, -8.0F, 2, 2, 8, 0.0F, false));
		sight.cubeList.add(new ModelBox(sight, 0, 9, 3.5F, -17.25F, -8.0F, 2, 2, 8, 0.0F, false));
		sight.cubeList.add(new ModelBox(sight, 0, 27, 5.5F, -19.25F, -8.0F, 1, 4, 5, 0.0F, false));
		sight.cubeList.add(new ModelBox(sight, 23, 0, -2.5F, -20.25F, -3.0F, 8, 1, 3, 0.0F, false));
		sight.cubeList.add(new ModelBox(sight, 0, 19, 0.0F, -28.0F, 0.0F, 3, 1, 1, -0.2F, false));
		sight.cubeList.add(new ModelBox(sight, 30, 6, 2.0F, -29.5F, 0.0F, 1, 2, 1, -0.201F, false));
		sight.cubeList.add(new ModelBox(sight, 0, 4, 0.0F, -29.5F, 0.0F, 1, 2, 1, -0.201F, false));
		sight.cubeList.add(new ModelBox(sight, 45, 11, 1.4F, -30.0F, 0.0F, 1, 1, 1, -0.201F, false));
		sight.cubeList.add(new ModelBox(sight, 20, 9, 0.6F, -30.0F, 0.0F, 1, 1, 1, -0.201F, false));
		sight.cubeList.add(new ModelBox(sight, 8, 19, 1.0F, -30.0F, 0.0F, 1, 1, 1, -0.202F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.2F, -29.8F, 0.2F);
		sight.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 19, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.8F, -29.8F, 0.2F);
		sight.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 34, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.8F, -28.1F, 0.2F);
		sight.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 43, 40, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.2F, -28.1F, 0.2F);
		sight.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 45, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		sight16_r1 = new ModelRenderer(this);
		sight16_r1.setRotationPoint(-3.0F, -21.1F, -1.5F);
		sight.addChild(sight16_r1);
		setRotationAngle(sight16_r1, -0.384F, 0.0F, 0.0F);
		sight16_r1.cubeList.add(new ModelBox(sight16_r1, 0, 21, 0.0F, 0.0F, 1.0F, 9, 3, 3, -0.4F, false));

		sight19_r1 = new ModelRenderer(this);
		sight19_r1.setRotationPoint(5.5F, -21.5F, 0.5F);
		sight.addChild(sight19_r1);
		setRotationAngle(sight19_r1, -0.7808F, 0.0F, 0.0F);
		sight19_r1.cubeList.add(new ModelBox(sight19_r1, 24, 9, -11.0F, 0.0F, 0.0F, 3, 4, 4, 0.0F, false));
		sight19_r1.cubeList.add(new ModelBox(sight19_r1, 20, 24, 0.0F, 0.0F, 0.0F, 3, 4, 4, 0.0F, false));

		sight31_r1 = new ModelRenderer(this);
		sight31_r1.setRotationPoint(5.5F, -20.25F, -3.0F);
		sight.addChild(sight31_r1);
		setRotationAngle(sight31_r1, 0.6109F, 0.0F, 0.0F);
		sight31_r1.cubeList.add(new ModelBox(sight31_r1, 21, 21, -8.0F, 0.0F, -2.0F, 8, 1, 2, -0.001F, false));

		sight31_r2 = new ModelRenderer(this);
		sight31_r2.setRotationPoint(5.5F, -18.25F, -8.0F);
		sight.addChild(sight31_r2);
		setRotationAngle(sight31_r2, -0.7854F, 0.0F, 0.0F);
		sight31_r2.cubeList.add(new ModelBox(sight31_r2, 23, 4, -7.8F, -1.2F, 0.2F, 8, 1, 1, 0.199F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.5F, -24.3F, 2.6F);
		sight.addChild(bone);
		

		sight8_r1 = new ModelRenderer(this);
		sight8_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(sight8_r1);
		setRotationAngle(sight8_r1, 0.0F, -0.4363F, 0.0F);
		sight8_r1.cubeList.add(new ModelBox(sight8_r1, 4, 36, -1.6F, 0.0F, -1.0F, 1, 7, 1, -0.001F, false));
		sight8_r1.cubeList.add(new ModelBox(sight8_r1, 15, 35, -1.0F, 0.0F, -1.0F, 1, 7, 1, 0.0F, false));

		sight10_r1 = new ModelRenderer(this);
		sight10_r1.setRotationPoint(0.0F, 0.75F, -0.25F);
		bone.addChild(sight10_r1);
		setRotationAngle(sight10_r1, 0.0F, -0.4363F, 0.0F);
		sight10_r1.cubeList.add(new ModelBox(sight10_r1, 4, 44, -1.35F, -2.0F, -1.0F, 1, 2, 1, -0.003F, false));
		sight10_r1.cubeList.add(new ModelBox(sight10_r1, 44, 31, -1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		sight9_r1 = new ModelRenderer(this);
		sight9_r1.setRotationPoint(0.0F, 0.75F, -0.25F);
		bone.addChild(sight9_r1);
		setRotationAngle(sight9_r1, 0.0F, 0.4363F, 0.0F);
		sight9_r1.cubeList.add(new ModelBox(sight9_r1, 44, 6, 0.35F, -2.0F, -1.0F, 1, 2, 1, -0.003F, false));
		sight9_r1.cubeList.add(new ModelBox(sight9_r1, 20, 44, 0.0F, -2.0F, -1.0F, 1, 2, 1, -0.001F, false));

		sight10_r2 = new ModelRenderer(this);
		sight10_r2.setRotationPoint(0.0F, 1.0F, -0.5F);
		bone.addChild(sight10_r2);
		setRotationAngle(sight10_r2, 0.0F, 0.4363F, 0.0F);
		sight10_r2.cubeList.add(new ModelBox(sight10_r2, 35, 40, 0.2F, -4.0F, -1.0F, 1, 2, 1, -0.002F, false));
		sight10_r2.cubeList.add(new ModelBox(sight10_r2, 42, 25, 0.0F, -4.0F, -1.0F, 1, 2, 1, -0.001F, false));

		sight9_r2 = new ModelRenderer(this);
		sight9_r2.setRotationPoint(0.0F, 1.0F, -0.5F);
		bone.addChild(sight9_r2);
		setRotationAngle(sight9_r2, 0.0F, -0.4363F, 0.0F);
		sight9_r2.cubeList.add(new ModelBox(sight9_r2, 42, 0, -1.2F, -4.0F, -1.0F, 1, 2, 1, 0.0F, false));
		sight9_r2.cubeList.add(new ModelBox(sight9_r2, 34, 6, -1.0F, -4.0F, -2.0F, 1, 2, 2, 0.003F, false));

		sight9_r3 = new ModelRenderer(this);
		sight9_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(sight9_r3);
		setRotationAngle(sight9_r3, 0.0F, 0.4363F, 0.0F);
		sight9_r3.cubeList.add(new ModelBox(sight9_r3, 0, 36, 0.6F, 0.0F, -1.0F, 1, 7, 1, -0.001F, false));
		sight9_r3.cubeList.add(new ModelBox(sight9_r3, 36, 32, 0.0F, 0.0F, -1.0F, 1, 7, 1, 0.001F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(1.5F, -24.3F, -1.6F);
		sight.addChild(bone4);
		

		sight9_r4 = new ModelRenderer(this);
		sight9_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(sight9_r4);
		setRotationAngle(sight9_r4, 0.0F, 0.4363F, 0.0F);
		sight9_r4.cubeList.add(new ModelBox(sight9_r4, 0, 9, -1.6F, 0.0F, 0.0F, 1, 7, 1, -0.001F, false));
		sight9_r4.cubeList.add(new ModelBox(sight9_r4, 4, 9, -1.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, false));

		sight11_r1 = new ModelRenderer(this);
		sight11_r1.setRotationPoint(0.0F, 0.75F, 0.25F);
		bone4.addChild(sight11_r1);
		setRotationAngle(sight11_r1, 0.0F, 0.4363F, 0.0F);
		sight11_r1.cubeList.add(new ModelBox(sight11_r1, 42, 28, -1.35F, -2.0F, 0.0F, 1, 2, 1, -0.003F, false));
		sight11_r1.cubeList.add(new ModelBox(sight11_r1, 16, 43, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		sight10_r3 = new ModelRenderer(this);
		sight10_r3.setRotationPoint(0.0F, 0.75F, 0.25F);
		bone4.addChild(sight10_r3);
		setRotationAngle(sight10_r3, 0.0F, -0.4363F, 0.0F);
		sight10_r3.cubeList.add(new ModelBox(sight10_r3, 42, 42, 0.35F, -2.0F, 0.0F, 1, 2, 1, -0.003F, false));
		sight10_r3.cubeList.add(new ModelBox(sight10_r3, 12, 43, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.001F, false));

		sight10_r4 = new ModelRenderer(this);
		sight10_r4.setRotationPoint(0.0F, -1.0F, 0.5F);
		bone4.addChild(sight10_r4);
		setRotationAngle(sight10_r4, 0.0F, 0.4363F, 0.0F);
		sight10_r4.cubeList.add(new ModelBox(sight10_r4, 34, 10, -1.2F, -2.0F, 0.0F, 1, 2, 1, -0.002F, false));
		sight10_r4.cubeList.add(new ModelBox(sight10_r4, 0, 0, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		sight11_r2 = new ModelRenderer(this);
		sight11_r2.setRotationPoint(0.0F, -1.0F, 0.5F);
		bone4.addChild(sight11_r2);
		setRotationAngle(sight11_r2, 0.0F, -0.4363F, 0.0F);
		sight11_r2.cubeList.add(new ModelBox(sight11_r2, 27, 40, 0.2F, -2.0F, 0.0F, 1, 2, 1, -0.002F, false));
		sight11_r2.cubeList.add(new ModelBox(sight11_r2, 42, 12, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.002F, false));

		sight10_r5 = new ModelRenderer(this);
		sight10_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(sight10_r5);
		setRotationAngle(sight10_r5, 0.0F, -0.4363F, 0.0F);
		sight10_r5.cubeList.add(new ModelBox(sight10_r5, 12, 9, 0.6F, 0.0F, 0.0F, 1, 7, 1, -0.001F, false));
		sight10_r5.cubeList.add(new ModelBox(sight10_r5, 16, 9, 0.0F, 0.0F, 0.0F, 1, 7, 1, 0.001F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.6F, -24.3F, 0.5F);
		sight.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -1.5708F, 0.0F);
		

		sight9_r5 = new ModelRenderer(this);
		sight9_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(sight9_r5);
		setRotationAngle(sight9_r5, 0.0F, -0.4363F, 0.0F);
		sight9_r5.cubeList.add(new ModelBox(sight9_r5, 28, 32, -1.6F, 0.0F, -1.0F, 1, 7, 1, -0.001F, false));
		sight9_r5.cubeList.add(new ModelBox(sight9_r5, 32, 32, -1.0F, 0.0F, -1.0F, 1, 7, 1, 0.0F, false));

		sight11_r3 = new ModelRenderer(this);
		sight11_r3.setRotationPoint(0.0F, 0.0F, -0.25F);
		bone2.addChild(sight11_r3);
		setRotationAngle(sight11_r3, 0.0F, -0.4363F, 0.0F);
		sight11_r3.cubeList.add(new ModelBox(sight11_r3, 43, 37, -1.35F, -1.25F, -1.0F, 1, 2, 1, -0.002F, false));
		sight11_r3.cubeList.add(new ModelBox(sight11_r3, 0, 27, -1.5057F, -5.7F, -0.9266F, 1, 3, 1, -0.303F, false));
		sight11_r3.cubeList.add(new ModelBox(sight11_r3, 38, 24, -1.2057F, -5.7F, -0.9266F, 1, 3, 1, -0.302F, false));
		sight11_r3.cubeList.add(new ModelBox(sight11_r3, 38, 28, -0.8057F, -5.7F, -0.9266F, 1, 3, 1, -0.301F, false));
		sight11_r3.cubeList.add(new ModelBox(sight11_r3, 38, 14, -1.3057F, -3.0F, -1.2266F, 1, 2, 1, -0.001F, false));
		sight11_r3.cubeList.add(new ModelBox(sight11_r3, 42, 9, -1.1057F, -3.0F, -1.2266F, 1, 2, 1, 0.001F, false));
		sight11_r3.cubeList.add(new ModelBox(sight11_r3, 44, 3, -1.0F, -1.25F, -1.0F, 1, 2, 1, 0.0F, false));

		sight10_r6 = new ModelRenderer(this);
		sight10_r6.setRotationPoint(0.0F, 0.0F, -0.25F);
		bone2.addChild(sight10_r6);
		setRotationAngle(sight10_r6, 0.0F, 0.4363F, 0.0F);
		sight10_r6.cubeList.add(new ModelBox(sight10_r6, 38, 43, 0.35F, -1.25F, -1.0F, 1, 2, 1, -0.002F, false));
		sight10_r6.cubeList.add(new ModelBox(sight10_r6, 7, 27, 0.5057F, -5.7F, -0.9266F, 1, 3, 1, -0.303F, false));
		sight10_r6.cubeList.add(new ModelBox(sight10_r6, 38, 10, 0.2057F, -5.7F, -0.9266F, 1, 3, 1, -0.302F, false));
		sight10_r6.cubeList.add(new ModelBox(sight10_r6, 39, 19, -0.1943F, -5.7F, -0.9266F, 1, 3, 1, -0.3F, false));
		sight10_r6.cubeList.add(new ModelBox(sight10_r6, 40, 35, 0.3057F, -3.0F, -1.2266F, 1, 2, 1, -0.002F, false));
		sight10_r6.cubeList.add(new ModelBox(sight10_r6, 8, 42, 0.1057F, -3.0F, -1.2266F, 1, 2, 1, -0.001F, false));
		sight10_r6.cubeList.add(new ModelBox(sight10_r6, 0, 44, 0.0F, -1.25F, -1.0F, 1, 2, 1, -0.001F, false));

		sight10_r7 = new ModelRenderer(this);
		sight10_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(sight10_r7);
		setRotationAngle(sight10_r7, 0.0F, 0.4363F, 0.0F);
		sight10_r7.cubeList.add(new ModelBox(sight10_r7, 34, 24, 0.6F, 0.0F, -1.0F, 1, 7, 1, -0.001F, false));
		sight10_r7.cubeList.add(new ModelBox(sight10_r7, 11, 35, 0.0F, 0.0F, -1.0F, 1, 7, 1, 0.001F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(3.6F, -24.3F, 0.5F);
		sight.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 1.5708F, 0.0F);
		

		sight10_r8 = new ModelRenderer(this);
		sight10_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(sight10_r8);
		setRotationAngle(sight10_r8, 0.0F, 0.4363F, 0.0F);
		sight10_r8.cubeList.add(new ModelBox(sight10_r8, 12, 27, 0.6F, 0.0F, -1.0F, 1, 7, 1, -0.001F, false));
		sight10_r8.cubeList.add(new ModelBox(sight10_r8, 16, 27, 0.0F, 0.0F, -1.0F, 1, 7, 1, 0.0F, false));

		sight12_r1 = new ModelRenderer(this);
		sight12_r1.setRotationPoint(0.0F, 0.0F, -0.25F);
		bone3.addChild(sight12_r1);
		setRotationAngle(sight12_r1, 0.0F, 0.4363F, 0.0F);
		sight12_r1.cubeList.add(new ModelBox(sight12_r1, 43, 18, 0.35F, -1.25F, -1.0F, 1, 2, 1, -0.002F, false));
		sight12_r1.cubeList.add(new ModelBox(sight12_r1, 24, 9, 0.5057F, -5.7F, -0.9266F, 1, 3, 1, -0.303F, false));
		sight12_r1.cubeList.add(new ModelBox(sight12_r1, 39, 39, 0.2057F, -5.7F, -0.9266F, 1, 3, 1, -0.302F, false));
		sight12_r1.cubeList.add(new ModelBox(sight12_r1, 40, 5, -0.1943F, -5.7F, -0.9266F, 1, 3, 1, -0.301F, false));
		sight12_r1.cubeList.add(new ModelBox(sight12_r1, 31, 40, 0.3057F, -3.0F, -1.2266F, 1, 2, 1, -0.001F, false));
		sight12_r1.cubeList.add(new ModelBox(sight12_r1, 42, 22, 0.1057F, -3.0F, -1.2266F, 1, 2, 1, 0.0F, false));
		sight12_r1.cubeList.add(new ModelBox(sight12_r1, 34, 43, 0.0F, -1.25F, -1.0F, 1, 2, 1, 0.0F, false));

		sight11_r4 = new ModelRenderer(this);
		sight11_r4.setRotationPoint(0.0F, 0.0F, -0.25F);
		bone3.addChild(sight11_r4);
		setRotationAngle(sight11_r4, 0.0F, -0.4363F, 0.0F);
		sight11_r4.cubeList.add(new ModelBox(sight11_r4, 26, 43, -1.35F, -1.25F, -1.0F, 1, 2, 1, -0.002F, false));
		sight11_r4.cubeList.add(new ModelBox(sight11_r4, 30, 24, -1.5057F, -5.7F, -0.9266F, 1, 3, 1, -0.303F, false));
		sight11_r4.cubeList.add(new ModelBox(sight11_r4, 19, 40, -1.2057F, -5.7F, -0.9266F, 1, 3, 1, -0.301F, false));
		sight11_r4.cubeList.add(new ModelBox(sight11_r4, 23, 40, -0.8057F, -5.7F, -0.9266F, 1, 3, 1, -0.3F, false));
		sight11_r4.cubeList.add(new ModelBox(sight11_r4, 40, 32, -1.3057F, -3.0F, -1.2266F, 1, 2, 1, 0.0F, false));
		sight11_r4.cubeList.add(new ModelBox(sight11_r4, 42, 15, -1.1057F, -3.0F, -1.2266F, 1, 2, 1, 0.001F, false));
		sight11_r4.cubeList.add(new ModelBox(sight11_r4, 30, 43, -1.0F, -1.25F, -1.0F, 1, 2, 1, -0.001F, false));

		sight11_r5 = new ModelRenderer(this);
		sight11_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(sight11_r5);
		setRotationAngle(sight11_r5, 0.0F, -0.4363F, 0.0F);
		sight11_r5.cubeList.add(new ModelBox(sight11_r5, 20, 32, -1.6F, 0.0F, -1.0F, 1, 7, 1, -0.001F, false));
		sight11_r5.cubeList.add(new ModelBox(sight11_r5, 24, 32, -1.0F, 0.0F, -1.0F, 1, 7, 1, 0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sight.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
