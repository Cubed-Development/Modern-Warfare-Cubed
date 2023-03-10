package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AR15 extends ModelWithAttachments {
	private final QRenderer gun;
	private final ModelRenderer receiver17_r1;
	private final ModelRenderer receiver16_r1;
	private final ModelRenderer receiver18_r1;
	private final ModelRenderer receiver17_r2;
	private final ModelRenderer receiver17_r3;
	private final ModelRenderer receiver16_r2;
	private final ModelRenderer receiver15_r1;
	private final ModelRenderer receiver14_r1;
	private final ModelRenderer receiver16_r3;
	private final ModelRenderer receiver15_r2;
	private final ModelRenderer receiver16_r4;
	private final ModelRenderer receiver15_r3;
	private final ModelRenderer receiver14_r2;
	private final ModelRenderer receiver14_r3;
	private final ModelRenderer receiver17_r4;
	private final ModelRenderer receiver16_r5;
	private final ModelRenderer receiver16_r6;
	private final ModelRenderer receiver15_r4;
	private final ModelRenderer receiver15_r5;
	private final ModelRenderer gun30_r1;
	private final ModelRenderer gun29_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun38_r1;
	private final ModelRenderer gun37_r1;
	private final ModelRenderer gun37_r2;
	private final ModelRenderer gun51_r1;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun80_r1;
	private final ModelRenderer gun82_r1;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer bone_r1;
	private final ModelRenderer gun132;
	private final ModelRenderer gun67;
	private final ModelRenderer gun60;
	private final ModelRenderer handguard;
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

	public AR15() {
		textureWidth = 300;
		textureHeight = 300;

		gun = new QRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 72, 56, -1.8F, -37.8F, -78.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 118, -1.8F, -37.8F, -73.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 62, -2.2F, -37.8F, -78.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 118, -2.2F, -37.8F, -73.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 14, -2.2F, -38.2F, -78.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 118, -2.2F, -38.2F, -73.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 25, -1.8F, -38.2F, -78.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 118, -1.8F, -38.2F, -73.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 31, -1.6F, -38.0F, -78.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 118, -1.6F, -38.0F, -73.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 35, 86, -2.4F, -38.0F, -78.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 118, -2.4F, -38.0F, -73.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 43, -2.0F, -37.6F, -78.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 118, -2.0F, -37.6F, -73.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 49, -2.0F, -38.4F, -78.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 118, -2.0F, -38.4F, -73.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -2.2F, -38.0F, -73.499F, 1, 1, 41, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 42, -1.8F, -38.0F, -73.501F, 1, 1, 41, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 1, -2.0F, -37.8F, -73.5F, 1, 1, 41, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 43, -2.0F, -38.2F, -73.5F, 1, 1, 41, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 84, -0.05F, -36.1F, -12.75F, 1, 2, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 22, 0.0F, -34.6F, -12.751F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 40, -0.3F, -35.6F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 41, 100, -0.3F, -35.6F, -12.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 0, -0.35F, -32.8F, -16.5F, 1, 6, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 47, -3.7F, -33.9F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 49, -3.801F, -32.501F, -12.4F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 63, 85, -3.8F, -32.5F, -13.7F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 29, -3.8F, -34.3F, -14.7F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 85, -3.8F, -35.3F, -21.4F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 36, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 84, -3.3F, -36.0F, -1.001F, 3, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 29, -0.7F, -36.0F, -0.998F, 1, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 15, -3.501F, -35.7F, -22.7F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 55, -0.4F, -33.5F, -16.3F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 29, -0.35F, -36.5F, -16.5F, 1, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 61, -3.5F, -36.0F, -13.2F, 4, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 84, -3.5F, -36.0F, -21.2F, 4, 8, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 30, -3.5F, -28.0F, -18.2F, 4, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 25, 7, -0.3F, -34.5F, -6.3F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 25, 7, -0.3F, -34.5F, -2.8F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 0, -0.3F, -34.5F, -5.9F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 0, -0.3F, -34.5F, -2.4F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 43, -3.3F, -36.0F, -14.0F, 3, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 61, -0.7F, -36.0F, -14.0F, 1, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 10, -3.001F, -32.0F, -13.8F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 10, -3.001F, -27.0F, -13.3F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 42, -2.999F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 19, -2.6F, -39.401F, 1.0015F, 2, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 10, -1.4F, -39.4F, 1.0025F, 1, 4, 2, 0.0F, false));

		receiver17_r1 = new ModelRenderer(this);
		receiver17_r1.setRotationPoint(0.25F, -37.5F, 2.35F);
		gun.addChild(receiver17_r1);
		setRotationAngle(receiver17_r1, 0.0F, 0.0F, 0.4014F);
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 35, 42, -0.999F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 30, 54, -1.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver16_r1 = new ModelRenderer(this);
		receiver16_r1.setRotationPoint(-3.25F, -37.5F, 2.35F);
		gun.addChild(receiver16_r1);
		setRotationAngle(receiver16_r1, 0.0F, 0.0F, -0.4014F);
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 11, 42, -0.001F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 73, 12, 0.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver18_r1 = new ModelRenderer(this);
		receiver18_r1.setRotationPoint(-1.5F, -35.75F, 2.35F);
		gun.addChild(receiver18_r1);
		setRotationAngle(receiver18_r1, 0.0F, 0.0F, -0.4014F);
		receiver18_r1.cubeList.add(new ModelBox(receiver18_r1, 0, 46, 0.35F, -0.999F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver18_r1.cubeList.add(new ModelBox(receiver18_r1, 49, 43, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r2 = new ModelRenderer(this);
		receiver17_r2.setRotationPoint(-1.5F, -39.25F, 2.35F);
		gun.addChild(receiver17_r2);
		setRotationAngle(receiver17_r2, 0.0F, 0.0F, 0.4014F);
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 50, 67, 0.35F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 35, 65, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r3 = new ModelRenderer(this);
		receiver17_r3.setRotationPoint(-1.5F, -35.75F, 2.35F);
		gun.addChild(receiver17_r3);
		setRotationAngle(receiver17_r3, 0.0F, 0.0F, 0.4014F);
		receiver17_r3.cubeList.add(new ModelBox(receiver17_r3, 11, 45, -1.35F, -0.999F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver17_r3.cubeList.add(new ModelBox(receiver17_r3, 30, 51, -1.0F, -1.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver16_r2 = new ModelRenderer(this);
		receiver16_r2.setRotationPoint(-1.5F, -39.25F, 2.35F);
		gun.addChild(receiver16_r2);
		setRotationAngle(receiver16_r2, 0.0F, 0.0F, -0.4014F);
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 70, 31, -1.35F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 34, 70, -1.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver15_r1 = new ModelRenderer(this);
		receiver15_r1.setRotationPoint(0.25F, -37.5F, 2.35F);
		gun.addChild(receiver15_r1);
		setRotationAngle(receiver15_r1, 0.0F, 0.0F, -0.4014F);
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 50, 61, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 35, 61, -0.999F, -1.35F, -0.0001F, 1, 1, 2, 0.0F, false));

		receiver14_r1 = new ModelRenderer(this);
		receiver14_r1.setRotationPoint(-3.25F, -37.5F, 2.35F);
		gun.addChild(receiver14_r1);
		setRotationAngle(receiver14_r1, 0.0F, 0.0F, 0.4014F);
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 34, 73, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 74, 19, -0.001F, -1.35F, -0.0001F, 1, 1, 2, 0.0F, false));

		receiver16_r3 = new ModelRenderer(this);
		receiver16_r3.setRotationPoint(-3.8F, -37.5F, 1.0F);
		gun.addChild(receiver16_r3);
		setRotationAngle(receiver16_r3, -0.925F, 0.0F, -0.2618F);
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 12, 0, 0.001F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver15_r2 = new ModelRenderer(this);
		receiver15_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		gun.addChild(receiver15_r2);
		setRotationAngle(receiver15_r2, -0.925F, 0.0F, 0.2618F);
		receiver15_r2.cubeList.add(new ModelBox(receiver15_r2, 0, 42, -0.999F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver16_r4 = new ModelRenderer(this);
		receiver16_r4.setRotationPoint(-3.37F, -35.9F, 0.0F);
		gun.addChild(receiver16_r4);
		setRotationAngle(receiver16_r4, 0.0F, 0.0F, -0.0524F);
		receiver16_r4.cubeList.add(new ModelBox(receiver16_r4, 43, 0, 0.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver15_r3 = new ModelRenderer(this);
		receiver15_r3.setRotationPoint(0.37F, -35.9F, 0.0F);
		gun.addChild(receiver15_r3);
		setRotationAngle(receiver15_r3, 0.0F, 0.0F, 0.0524F);
		receiver15_r3.cubeList.add(new ModelBox(receiver15_r3, 50, 29, -1.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver14_r2 = new ModelRenderer(this);
		receiver14_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		gun.addChild(receiver14_r2);
		setRotationAngle(receiver14_r2, 0.0F, 0.0F, 0.2618F);
		receiver14_r2.cubeList.add(new ModelBox(receiver14_r2, 20, 65, -2.0F, 0.0F, 0.0012F, 2, 2, 2, 0.0F, false));

		receiver14_r3 = new ModelRenderer(this);
		receiver14_r3.setRotationPoint(0.8F, -37.5F, 1.0F);
		gun.addChild(receiver14_r3);
		setRotationAngle(receiver14_r3, 0.0F, 0.0F, -0.4014F);
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 20, 70, -1.999F, -1.3F, 0.001F, 2, 1, 2, 0.0F, false));
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 43, 79, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r4 = new ModelRenderer(this);
		receiver17_r4.setRotationPoint(-2.6F, -39.4F, 1.0F);
		gun.addChild(receiver17_r4);
		setRotationAngle(receiver17_r4, 0.0F, 0.0F, -0.8029F);
		receiver17_r4.cubeList.add(new ModelBox(receiver17_r4, 78, 50, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver16_r5 = new ModelRenderer(this);
		receiver16_r5.setRotationPoint(-0.4F, -39.4F, 1.0F);
		gun.addChild(receiver16_r5);
		setRotationAngle(receiver16_r5, 0.0F, 0.0F, 0.8029F);
		receiver16_r5.cubeList.add(new ModelBox(receiver16_r5, 78, 69, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver16_r6 = new ModelRenderer(this);
		receiver16_r6.setRotationPoint(-1.5F, -37.5F, 3.1F);
		gun.addChild(receiver16_r6);
		setRotationAngle(receiver16_r6, 0.0F, 0.0F, -0.3316F);
		receiver16_r6.cubeList.add(new ModelBox(receiver16_r6, 0, 42, -1.0F, -1.001F, 8.0015F, 2, 2, 7, -0.1F, false));
		receiver16_r6.cubeList.add(new ModelBox(receiver16_r6, 43, 19, -1.0F, -1.001F, -0.2985F, 2, 2, 15, -0.2F, false));

		receiver15_r4 = new ModelRenderer(this);
		receiver15_r4.setRotationPoint(-3.8F, -37.5F, 1.0F);
		gun.addChild(receiver15_r4);
		setRotationAngle(receiver15_r4, 0.0F, 0.0F, -0.2618F);
		receiver15_r4.cubeList.add(new ModelBox(receiver15_r4, 63, 36, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		receiver15_r5 = new ModelRenderer(this);
		receiver15_r5.setRotationPoint(-3.8F, -37.5F, 1.0F);
		gun.addChild(receiver15_r5);
		setRotationAngle(receiver15_r5, 0.0F, 0.0F, 0.4014F);
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 78, 44, -0.001F, -1.3F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 69, 38, 0.0F, -1.0F, -0.001F, 2, 1, 2, 0.0F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-3.2F, -31.0F, -7.6F);
		gun.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 73, 0, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-3.2F, -27.0F, -7.6F);
		gun.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.3562F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 0, 38, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -27.0F, -11.5F);
		gun.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 73, 9, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(0.5F, -33.7F, -11.3F);
		gun.addChild(gun39_r1);
		setRotationAngle(gun39_r1, -0.3665F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 37, 31, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(0.5F, -32.7F, -7.6F);
		gun.addChild(gun38_r1);
		setRotationAngle(gun38_r1, -0.3665F, 0.0F, 0.0F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 37, 31, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-3.4F, -33.0F, -4.2F);
		gun.addChild(gun37_r1);
		setRotationAngle(gun37_r1, -0.3665F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 0, 25, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun37_r2 = new ModelRenderer(this);
		gun37_r2.setRotationPoint(-2.6F, -34.7F, -0.6F);
		gun.addChild(gun37_r2);
		setRotationAngle(gun37_r2, -0.3665F, 0.0F, 0.0F);
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 10, 15, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 62, 51, -0.8F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun51_r1 = new ModelRenderer(this);
		gun51_r1.setRotationPoint(-3.9F, -27.5F, -21.2F);
		gun.addChild(gun51_r1);
		setRotationAngle(gun51_r1, 1.3756F, 0.0F, 0.0F);
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 31, 0, 0.1F, 0.0806F, 0.0981F, 4, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 62, 27, 0.101F, -0.4194F, 0.098F, 4, 1, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 37, 50, 3.7F, 0.08F, 0.098F, 1, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 100, 61, 3.699F, -0.42F, 0.1F, 1, 1, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-3.5F, -32.0F, -11.2F);
		gun.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.7884F, 0.0F, 0.0F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 30, 65, 2.999F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-3.5F, -34.5F, -22.7F);
		gun.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.9082F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 10, 38, -0.002F, -0.123F, 0.1577F, 4, 2, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -30.2F, -8.95F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 20, 19, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun80_r1 = new ModelRenderer(this);
		gun80_r1.setRotationPoint(-3.8F, -31.3F, -14.7F);
		gun.addChild(gun80_r1);
		setRotationAngle(gun80_r1, 0.0F, 0.0F, -0.2603F);
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 42, 85, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(-3.8F, -34.3F, -14.7F);
		gun.addChild(gun82_r1);
		setRotationAngle(gun82_r1, 0.0F, 0.7436F, 0.0F);
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 13, 30, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.7F, -33.5F, -4.7F);
		gun.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 100, 38, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.6F, -33.4F, -4.5F);
		gun.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -1.5708F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 16, 84, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.2F, -32.8F, -16.5F);
		gun.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 0.0F, 0.7854F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 59, 80, -0.3636F, -0.3636F, -0.001F, 1, 1, 2, 0.0F, false));
		bone_r1.cubeList.add(new ModelBox(bone_r1, 0, 84, -1.0F, -1.0F, -0.001F, 1, 1, 2, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-0.15F, -36.2F, -12.8F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -1.2641F);
		gun132.cubeList.add(new ModelBox(gun132, 86, 76, -0.7277F, 0.2207F, -0.15F, 2, 1, 1, -0.2F, false));
		gun132.cubeList.add(new ModelBox(gun132, 86, 68, -0.727F, 0.22F, 0.25F, 2, 1, 1, -0.2F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -33.5F, 1.5F);
		gun.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 16, 76, 0.001F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 0, 76, 0.599F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 86, 8, 0.299F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		gun.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		gun60.cubeList.add(new ModelBox(gun60, 100, 55, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 100, 53, -3.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(-0.5F, -16.1F, -60.7F);
		handguard.cubeList.add(new ModelBox(handguard, 159, 7, -2.0F, 0.0F, -5.0F, 2, 1, 43, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 207, 12, -2.0F, 4.1F, -5.0F, 2, 1, 43, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 163, 5, 0.5F, 1.85F, 0.0F, 1, 2, 1, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 184, 43, 0.5F, 1.85F, -5.0F, 1, 2, 1, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 163, 12, 0.5F, 1.85F, 5.0F, 1, 2, 1, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 178, 27, 0.5F, 1.85F, 10.0F, 1, 2, 1, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 163, 29, 0.5F, 1.85F, 15.0F, 1, 2, 1, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 176, 9, 0.5F, 1.85F, 20.0F, 1, 2, 1, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 188, 6, 0.5F, 1.85F, 25.0F, 1, 2, 1, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 209, 5, 0.5F, 1.85F, 30.0F, 1, 2, 8, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 217, 69, 0.7F, 3.05F, -4.75F, 1, 1, 35, -0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 177, 62, 0.7F, 1.65F, -4.75F, 1, 1, 35, -0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 231, 20, 0.78F, 2.85F, 31.0F, 1, 1, 7, -0.002F, false));
		handguard.cubeList.add(new ModelBox(handguard, 231, 5, 0.58F, 3.15F, 31.0F, 1, 1, 7, -0.003F, false));
		handguard.cubeList.add(new ModelBox(handguard, 257, 6, -0.47F, 4.35F, 31.0F, 1, 1, 7, -0.003F, false));
		handguard.cubeList.add(new ModelBox(handguard, 261, 127, -1.17F, 5.05F, 31.0F, 1, 1, 7, -0.003F, false));
		handguard.cubeList.add(new ModelBox(handguard, 253, 152, -1.83F, 5.05F, 31.0F, 1, 1, 7, -0.004F, true));
		handguard.cubeList.add(new ModelBox(handguard, 231, 34, 0.78F, 2.05F, 31.0F, 1, 1, 7, -0.003F, false));
		handguard.cubeList.add(new ModelBox(handguard, 236, 65, -3.5F, 1.85F, 0.0F, 1, 2, 1, 0.001F, true));
		handguard.cubeList.add(new ModelBox(handguard, 236, 65, -3.5F, 1.85F, 5.0F, 1, 2, 1, 0.001F, true));
		handguard.cubeList.add(new ModelBox(handguard, 236, 65, -3.5F, 1.85F, 10.0F, 1, 2, 1, 0.001F, true));
		handguard.cubeList.add(new ModelBox(handguard, 236, 65, -3.5F, 1.85F, 15.0F, 1, 2, 1, 0.001F, true));
		handguard.cubeList.add(new ModelBox(handguard, 236, 65, -3.5F, 1.85F, 20.0F, 1, 2, 1, 0.001F, true));
		handguard.cubeList.add(new ModelBox(handguard, 236, 65, -3.5F, 1.85F, 25.0F, 1, 2, 1, 0.001F, true));
		handguard.cubeList.add(new ModelBox(handguard, 259, 111, -3.5F, 1.85F, 30.0F, 1, 2, 8, 0.001F, true));
		handguard.cubeList.add(new ModelBox(handguard, 178, 103, -3.7F, 1.65F, -4.75F, 1, 1, 35, -0.2F, true));
		handguard.cubeList.add(new ModelBox(handguard, 218, 111, -3.7F, 3.05F, -4.75F, 1, 1, 35, -0.2F, true));
		handguard.cubeList.add(new ModelBox(handguard, 236, 65, -3.5F, 1.85F, -5.0F, 1, 2, 1, 0.001F, true));
		handguard.cubeList.add(new ModelBox(handguard, 258, 75, -3.78F, 2.85F, 31.0F, 1, 1, 7, -0.002F, true));
		handguard.cubeList.add(new ModelBox(handguard, 257, 62, -3.78F, 2.05F, 31.0F, 1, 1, 7, -0.003F, true));
		handguard.cubeList.add(new ModelBox(handguard, 183, 156, -3.58F, 3.15F, 31.0F, 1, 1, 7, -0.003F, true));
		handguard.cubeList.add(new ModelBox(handguard, 223, 121, -2.53F, 4.35F, 31.0F, 1, 1, 7, -0.003F, true));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.5F, 3.85F, 2.25F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.925F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, -6.6F, 1, 2, 1, -0.101F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, -6.1F, 1, 2, 1, -0.1F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, -4.1F, 1, 2, 1, -0.1F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, -2.0F, 1, 2, 1, -0.1F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 4, 200, -0.2F, 1.2F, -6.45F, 1, 1, 34, -0.199F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 43, 194, -0.2F, -0.2F, -6.45F, 1, 1, 34, -0.199F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 283, 33, 0.0F, 0.0F, -7.25F, 1, 2, 1, 0.0F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 0.0F, 1, 2, 1, -0.1F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 2.1F, 1, 2, 1, -0.1F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 4.1F, 1, 2, 1, -0.1F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 6.2F, 1, 2, 1, -0.1F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 8.2F, 1, 2, 1, -0.1F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 10.3F, 1, 2, 1, -0.1F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 12.4F, 1, 2, 1, -0.1F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 14.5F, 1, 2, 1, -0.1F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 16.5F, 1, 2, 1, -0.1F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 18.6F, 1, 2, 1, -0.1F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 20.6F, 1, 2, 1, -0.1F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 22.7F, 1, 2, 1, -0.1F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 24.7F, 1, 2, 1, -0.1F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 278, 65, -0.1F, -0.1F, 26.8F, 1, 2, 2, -0.101F, true));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.5F, 1.85F, -5.0F);
		handguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.925F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 214, 150, -0.2F, -0.8F, 0.8F, 1, 1, 34, -0.199F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 172, 143, 0.0F, -2.5F, 1.0F, 1, 1, 34, 0.001F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 257, 30, 0.0F, -2.0F, 35.0F, 1, 2, 8, 0.0F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 34.05F, 1, 2, 2, -0.101F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 31.95F, 1, 2, 1, -0.1F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 29.95F, 1, 2, 1, -0.1F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 27.85F, 1, 2, 1, -0.1F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 25.85F, 1, 2, 1, -0.1F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 23.75F, 1, 2, 1, -0.1F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 21.75F, 1, 2, 1, -0.1F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 19.65F, 1, 2, 1, -0.1F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 15.45F, 1, 2, 1, -0.1F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 17.55F, 1, 2, 1, -0.1F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 11.35F, 1, 2, 1, -0.1F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 13.45F, 1, 2, 1, -0.1F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 9.35F, 1, 2, 1, -0.1F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 7.25F, 1, 2, 1, -0.1F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 285, 114, 0.0F, -2.0F, 5.0F, 1, 2, 1, 0.0F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 257, 89, 0.0F, -0.65F, 36.0F, 1, 1, 7, -0.001F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 259, 44, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, true));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.53F, 5.35F, 31.0F);
		handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 234, 114, 0.0F, -1.0F, 0.0F, 1, 1, 7, -0.001F, true));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.58F, 4.15F, 31.0F);
		handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.8552F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 219, 156, 0.0F, 0.0F, 0.0F, 1, 2, 7, -0.002F, true));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.78F, 3.85F, 31.0F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.7854F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 243, 72, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.004F, true));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 246, 63, 0.0F, -1.8F, -1.0F, 1, 1, 1, -0.003F, true));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.78F, 3.85F, 31.0F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.7854F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 212, 31, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.004F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 213, 45, -1.0F, -1.8F, -1.0F, 1, 1, 1, -0.003F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.53F, 5.35F, 31.0F);
		handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 258, 17, -1.0F, -1.0F, 0.0F, 1, 1, 7, -0.001F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.58F, 4.15F, 31.0F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.8552F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 217, 63, -1.0F, 0.0F, 0.0F, 1, 2, 7, -0.002F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.5F, 1.85F, 31.0F);
		handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.925F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 210, 17, -1.0F, -0.65F, 0.0F, 1, 1, 7, -0.001F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -16.35F, 1, 2, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -14.25F, 1, 2, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -12.25F, 1, 2, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -10.15F, 1, 2, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -4.05F, 1, 2, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -1.95F, 1, 2, 2, -0.101F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -8.15F, 1, 2, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -6.05F, 1, 2, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -18.45F, 1, 2, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -20.55F, 1, 2, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -22.55F, 1, 2, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -24.65F, 1, 2, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -26.65F, 1, 2, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -28.75F, 1, 2, 1, -0.1F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 216, 28, -1.0F, -2.0F, -1.0F, 1, 2, 8, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 189, 31, -1.0F, -2.0F, -31.0F, 1, 2, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 167, 185, -0.8F, -0.8F, -35.2F, 1, 1, 34, -0.199F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 127, 180, -1.0F, -2.5F, -35.0F, 1, 1, 34, 0.001F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 200, 75, -1.0F, -2.0F, -36.0F, 1, 2, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.5F, 3.85F, 29.05F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.925F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 234, 82, -0.9F, -0.1F, 0.0F, 1, 2, 2, -0.101F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -2.1F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -4.1F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -6.2F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -8.2F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -10.3F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -12.3F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -14.4F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -16.5F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -18.6F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -20.6F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -22.7F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -28.8F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 188, 69, -0.9F, -0.1F, -33.4F, 1, 2, 1, -0.101F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 188, 69, -0.9F, -0.1F, -32.9F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -30.9F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -24.7F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -26.8F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 200, 84, -1.0F, 0.0F, -34.05F, 1, 2, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 206, 192, -0.8F, -0.2F, -33.25F, 1, 1, 34, -0.199F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 87, 189, -0.8F, 1.2F, -33.25F, 1, 1, 34, -0.199F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
//		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
