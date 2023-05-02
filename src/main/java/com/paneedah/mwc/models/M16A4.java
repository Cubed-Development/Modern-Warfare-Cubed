package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M16A4 extends ModelWithAttachments {
	private final ModelRenderer gun;
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
	private final ModelRenderer handguard10_r1;
	private final ModelRenderer handguard206_r1;
	private final ModelRenderer handguard205_r1;
	private final ModelRenderer handguard204_r1;
	private final ModelRenderer handguard203_r1;
	private final ModelRenderer handguard205_r2;
	private final ModelRenderer handguard204_r2;
	private final ModelRenderer handguard203_r2;
	private final ModelRenderer handguard202_r1;
	private final ModelRenderer handguard202_r2;
	private final ModelRenderer handguard201_r1;
	private final ModelRenderer handguard200_r1;
	private final ModelRenderer handguard204_r3;
	private final ModelRenderer handguard203_r3;
	private final ModelRenderer handguard202_r3;
	private final ModelRenderer handguard201_r2;
	private final ModelRenderer handguard203_r4;
	private final ModelRenderer handguard202_r4;
	private final ModelRenderer handguard201_r3;
	private final ModelRenderer handguard200_r2;
	private final ModelRenderer handguard199_r1;
	private final ModelRenderer handguard9_r1;
	private final ModelRenderer handguard8_r1;
	private final ModelRenderer handguard14_r1;
	private final ModelRenderer handguard13_r1;
	private final ModelRenderer handguard10_r2;
	private final ModelRenderer handguard11_r1;
	private final ModelRenderer handguard10_r3;
	private final ModelRenderer handguard9_r2;
	private final ModelRenderer handguard9_r3;
	private final ModelRenderer handguard10_r4;
	private final ModelRenderer handguard9_r4;
	private final ModelRenderer handguard20_r1;
	private final ModelRenderer handguard19_r1;
	private final ModelRenderer handguard19_r2;
	private final ModelRenderer handguard8_r2;
	private final ModelRenderer handguard8_r3;
	private final ModelRenderer handguard9_r5;
	private final ModelRenderer handguard8_r4;
	private final ModelRenderer handguard19_r3;
	private final ModelRenderer handguard18_r1;
	private final ModelRenderer handguard18_r2;
	private final ModelRenderer handguard17_r1;
	private final ModelRenderer handguard7_r1;
	private final ModelRenderer handguard7_r2;
	private final ModelRenderer handguard8_r5;
	private final ModelRenderer handguard7_r3;
	private final ModelRenderer handguard6_r1;
	private final ModelRenderer handguard7_r4;
	private final ModelRenderer handguard8_r6;
	private final ModelRenderer handguard11_r2;
	private final ModelRenderer handguard12_r1;
	private final ModelRenderer handguard11_r3;
	private final ModelRenderer handguard22_r1;
	private final ModelRenderer handguard21_r1;
	private final ModelRenderer handguard21_r2;
	private final ModelRenderer handguard20_r2;
	private final ModelRenderer handguard10_r5;
	private final ModelRenderer handguard9_r6;
	private final ModelRenderer handguard10_r6;
	private final ModelRenderer handguard9_r7;
	private final ModelRenderer handguard8_r7;
	private final ModelRenderer handguard19_r4;
	private final ModelRenderer handguard18_r3;
	private final ModelRenderer handguard18_r4;
	private final ModelRenderer handguard17_r2;
	private final ModelRenderer handguard5_r1;
	private final ModelRenderer handguard4_r1;
	private final ModelRenderer handguard15_r1;

	public M16A4() {
		textureWidth = 220;
		textureHeight = 220;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 22, 28, -1.8F, -37.8F, -81.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 81, 61, -1.8F, -37.8F, -76.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 31, -1.8F, -37.8F, -67.7F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 41, 0, -2.2F, -37.8F, -81.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 81, -2.2F, -37.8F, -76.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 16, 44, -2.2F, -37.8F, -67.7F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 41, 6, -2.2F, -38.2F, -81.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 81, 59, -2.2F, -38.2F, -76.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 55, -2.2F, -38.2F, -67.7F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 14, -1.8F, -38.2F, -81.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 81, 63, -1.8F, -38.2F, -76.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 37, 26, -1.8F, -38.2F, -67.7F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 35, -1.6F, -38.0F, -81.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 64, 81, -1.6F, -38.0F, -76.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 37, 18, -1.6F, -38.0F, -67.7F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 42, -2.4F, -38.0F, -81.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 81, 57, -2.4F, -38.0F, -76.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 55, -2.4F, -38.0F, -67.7F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 48, -2.0F, -37.6F, -81.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 81, -2.0F, -37.6F, -76.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 44, -2.0F, -37.6F, -67.7F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 56, -2.0F, -38.4F, -81.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 81, 65, -2.0F, -38.4F, -76.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 0, -2.0F, -38.4F, -67.7F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -2.2F, -38.0F, -76.499F, 1, 1, 54, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 55, -1.8F, -38.0F, -76.501F, 1, 1, 54, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 1, -2.0F, -37.8F, -76.5F, 1, 1, 54, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 56, -2.0F, -38.2F, -76.5F, 1, 1, 54, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 74, 51, -0.05F, -36.1F, -12.75F, 1, 2, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 14, 0.0F, -34.6F, -12.751F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 16, -0.3F, -35.6F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 18, -0.3F, -35.6F, -12.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 22, -0.35F, -32.8F, -16.5F, 1, 6, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 21, -3.7F, -33.9F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 23, -3.801F, -32.501F, -12.4F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 5, 67, -3.8F, -32.5F, -13.7F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 16, 22, -3.8F, -34.3F, -14.7F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 40, -3.8F, -35.3F, -21.4F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 22, 55, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 44, -3.3F, -36.0F, -1.001F, 3, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 22, -0.7F, -36.0F, -0.998F, 1, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 17, -3.501F, -35.7F, -22.7F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 22, 60, -0.4F, -33.5F, -16.3F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 8, -0.35F, -36.5F, -16.5F, 1, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 62, -3.5F, -36.0F, -13.2F, 4, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 22, 76, -3.5F, -36.0F, -21.2F, 4, 8, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 8, -3.5F, -28.0F, -18.2F, 4, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 68, 81, -0.3F, -34.5F, -6.3F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 81, 52, -0.3F, -34.5F, -2.8F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 81, 67, -0.3F, -34.5F, -5.9F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 81, -0.3F, -34.5F, -2.4F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 22, 0, -3.3F, -36.0F, -14.0F, 3, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 22, 22, -0.7F, -36.0F, -14.0F, 1, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 31, -3.001F, -32.0F, -13.8F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -3.001F, -27.0F, -13.3F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 44, 40, -2.999F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 11, 8, -2.6F, -39.401F, 1.0015F, 2, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -1.4F, -39.4F, 1.0025F, 1, 4, 2, 0.0F, false));

		receiver17_r1 = new ModelRenderer(this);
		receiver17_r1.setRotationPoint(0.25F, -37.5F, 2.35F);
		gun.addChild(receiver17_r1);
		setRotationAngle(receiver17_r1, 0.0F, 0.0F, 0.4014F);
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 29, 28, -0.999F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 37, 29, -1.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver16_r1 = new ModelRenderer(this);
		receiver16_r1.setRotationPoint(-3.25F, -37.5F, 2.35F);
		gun.addChild(receiver16_r1);
		setRotationAngle(receiver16_r1, 0.0F, 0.0F, -0.4014F);
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 13, 4, -0.001F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 9, 55, 0.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver18_r1 = new ModelRenderer(this);
		receiver18_r1.setRotationPoint(-1.5F, -35.75F, 2.35F);
		gun.addChild(receiver18_r1);
		setRotationAngle(receiver18_r1, 0.0F, 0.0F, -0.4014F);
		receiver18_r1.cubeList.add(new ModelBox(receiver18_r1, 0, 34, 0.35F, -0.999F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver18_r1.cubeList.add(new ModelBox(receiver18_r1, 37, 22, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r2 = new ModelRenderer(this);
		receiver17_r2.setRotationPoint(-1.5F, -39.25F, 2.35F);
		gun.addChild(receiver17_r2);
		setRotationAngle(receiver17_r2, 0.0F, 0.0F, 0.4014F);
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 48, 0, 0.35F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 0, 47, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r3 = new ModelRenderer(this);
		receiver17_r3.setRotationPoint(-1.5F, -35.75F, 2.35F);
		gun.addChild(receiver17_r3);
		setRotationAngle(receiver17_r3, 0.0F, 0.0F, 0.4014F);
		receiver17_r3.cubeList.add(new ModelBox(receiver17_r3, 0, 31, -1.35F, -0.999F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver17_r3.cubeList.add(new ModelBox(receiver17_r3, 37, 26, -1.0F, -1.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver16_r2 = new ModelRenderer(this);
		receiver16_r2.setRotationPoint(-1.5F, -39.25F, 2.35F);
		gun.addChild(receiver16_r2);
		setRotationAngle(receiver16_r2, 0.0F, 0.0F, -0.4014F);
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 48, 6, -1.35F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 0, 55, -1.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver15_r1 = new ModelRenderer(this);
		receiver15_r1.setRotationPoint(0.25F, -37.5F, 2.35F);
		gun.addChild(receiver15_r1);
		setRotationAngle(receiver15_r1, 0.0F, 0.0F, -0.4014F);
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 35, 44, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 0, 44, -0.999F, -1.35F, -0.0001F, 1, 1, 2, 0.0F, false));

		receiver14_r1 = new ModelRenderer(this);
		receiver14_r1.setRotationPoint(-3.25F, -37.5F, 2.35F);
		gun.addChild(receiver14_r1);
		setRotationAngle(receiver14_r1, 0.0F, 0.0F, 0.4014F);
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 38, 55, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 47, 55, -0.001F, -1.35F, -0.0001F, 1, 1, 2, 0.0F, false));

		receiver16_r3 = new ModelRenderer(this);
		receiver16_r3.setRotationPoint(-3.8F, -37.5F, 1.0F);
		gun.addChild(receiver16_r3);
		setRotationAngle(receiver16_r3, -0.925F, 0.0F, -0.2618F);
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 13, 0, 0.001F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver15_r2 = new ModelRenderer(this);
		receiver15_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		gun.addChild(receiver15_r2);
		setRotationAngle(receiver15_r2, -0.925F, 0.0F, 0.2618F);
		receiver15_r2.cubeList.add(new ModelBox(receiver15_r2, 29, 22, -0.999F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver16_r4 = new ModelRenderer(this);
		receiver16_r4.setRotationPoint(-3.37F, -35.9F, 0.0F);
		gun.addChild(receiver16_r4);
		setRotationAngle(receiver16_r4, 0.0F, 0.0F, -0.0524F);
		receiver16_r4.cubeList.add(new ModelBox(receiver16_r4, 46, 18, 0.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver15_r3 = new ModelRenderer(this);
		receiver15_r3.setRotationPoint(0.37F, -35.9F, 0.0F);
		gun.addChild(receiver15_r3);
		setRotationAngle(receiver15_r3, 0.0F, 0.0F, 0.0524F);
		receiver15_r3.cubeList.add(new ModelBox(receiver15_r3, 46, 26, -1.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver14_r2 = new ModelRenderer(this);
		receiver14_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		gun.addChild(receiver14_r2);
		setRotationAngle(receiver14_r2, 0.0F, 0.0F, 0.2618F);
		receiver14_r2.cubeList.add(new ModelBox(receiver14_r2, 64, 69, -2.0F, 0.0F, 0.0012F, 2, 2, 2, 0.0F, false));

		receiver14_r3 = new ModelRenderer(this);
		receiver14_r3.setRotationPoint(0.8F, -37.5F, 1.0F);
		gun.addChild(receiver14_r3);
		setRotationAngle(receiver14_r3, 0.0F, 0.0F, -0.4014F);
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 22, 66, -1.999F, -1.3F, 0.001F, 2, 1, 2, 0.0F, false));
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 5, 63, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r4 = new ModelRenderer(this);
		receiver17_r4.setRotationPoint(-2.6F, -39.4F, 1.0F);
		gun.addChild(receiver17_r4);
		setRotationAngle(receiver17_r4, 0.0F, 0.0F, -0.8029F);
		receiver17_r4.cubeList.add(new ModelBox(receiver17_r4, 47, 58, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver16_r5 = new ModelRenderer(this);
		receiver16_r5.setRotationPoint(-0.4F, -39.4F, 1.0F);
		gun.addChild(receiver16_r5);
		setRotationAngle(receiver16_r5, 0.0F, 0.0F, 0.8029F);
		receiver16_r5.cubeList.add(new ModelBox(receiver16_r5, 29, 60, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver16_r6 = new ModelRenderer(this);
		receiver16_r6.setRotationPoint(-1.5F, -37.5F, 3.1F);
		gun.addChild(receiver16_r6);
		setRotationAngle(receiver16_r6, 0.0F, 0.0F, -0.3316F);
		receiver16_r6.cubeList.add(new ModelBox(receiver16_r6, 0, 8, -1.0F, -1.001F, 8.0015F, 2, 2, 7, -0.1F, false));
		receiver16_r6.cubeList.add(new ModelBox(receiver16_r6, 109, 111, -1.0F, -1.001F, -0.2985F, 2, 2, 15, -0.2F, false));

		receiver15_r4 = new ModelRenderer(this);
		receiver15_r4.setRotationPoint(-3.8F, -37.5F, 1.0F);
		gun.addChild(receiver15_r4);
		setRotationAngle(receiver15_r4, 0.0F, 0.0F, -0.2618F);
		receiver15_r4.cubeList.add(new ModelBox(receiver15_r4, 56, 68, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		receiver15_r5 = new ModelRenderer(this);
		receiver15_r5.setRotationPoint(-3.8F, -37.5F, 1.0F);
		gun.addChild(receiver15_r5);
		setRotationAngle(receiver15_r5, 0.0F, 0.0F, 0.4014F);
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 38, 58, -0.001F, -1.3F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 65, 4, 0.0F, -1.0F, -0.001F, 2, 1, 2, 0.0F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-3.2F, -31.0F, -7.6F);
		gun.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 68, 56, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-3.2F, -27.0F, -7.6F);
		gun.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.3562F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 22, 9, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -27.0F, -11.5F);
		gun.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 27, 70, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(0.5F, -33.7F, -11.3F);
		gun.addChild(gun39_r1);
		setRotationAngle(gun39_r1, -0.3665F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 45, 81, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(0.5F, -32.7F, -7.6F);
		gun.addChild(gun38_r1);
		setRotationAngle(gun38_r1, -0.3665F, 0.0F, 0.0F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 81, 69, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-3.4F, -33.0F, -4.2F);
		gun.addChild(gun37_r1);
		setRotationAngle(gun37_r1, -0.3665F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 30, 18, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun37_r2 = new ModelRenderer(this);
		gun37_r2.setRotationPoint(-2.6F, -34.7F, -0.6F);
		gun.addChild(gun37_r2);
		setRotationAngle(gun37_r2, -0.3665F, 0.0F, 0.0F);
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 22, 18, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 22, 40, -0.8F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun51_r1 = new ModelRenderer(this);
		gun51_r1.setRotationPoint(-3.9F, -27.5F, -21.2F);
		gun.addChild(gun51_r1);
		setRotationAngle(gun51_r1, 1.3756F, 0.0F, 0.0F);
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 22, 0, 0.1F, 0.082F, 0.099F, 4, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 10, 17, 0.101F, -0.4194F, 0.098F, 4, 1, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 16, 55, 3.7F, 0.08F, 0.097F, 1, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 90, 29, 3.699F, -0.42F, 0.1F, 1, 1, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-3.5F, -32.0F, -11.2F);
		gun.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.7884F, 0.0F, 0.0F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 22, 70, 2.999F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-3.5F, -34.5F, -22.7F);
		gun.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.9082F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 0, 39, -0.002F, -0.123F, 0.1577F, 4, 2, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -30.2F, -8.95F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 22, 22, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun80_r1 = new ModelRenderer(this);
		gun80_r1.setRotationPoint(-3.8F, -31.3F, -14.7F);
		gun.addChild(gun80_r1);
		setRotationAngle(gun80_r1, 0.0F, 0.0F, -0.2603F);
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 0, 76, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(-3.8F, -34.3F, -14.7F);
		gun.addChild(gun82_r1);
		setRotationAngle(gun82_r1, 0.0F, 0.7436F, 0.0F);
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 10, 22, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.7F, -33.5F, -4.7F);
		gun.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 15, 90, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.6F, -33.4F, -4.5F);
		gun.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -1.5708F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 30, 66, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.2F, -32.8F, -16.5F);
		gun.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 0.0F, 0.7854F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 43, 63, -0.3636F, -0.3636F, -0.001F, 1, 1, 2, 0.0F, false));
		bone_r1.cubeList.add(new ModelBox(bone_r1, 14, 65, -1.0F, -1.0F, -0.001F, 1, 1, 2, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-0.15F, -36.2F, -12.8F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -1.2641F);
		gun132.cubeList.add(new ModelBox(gun132, 46, 72, -0.7277F, 0.2207F, -0.15F, 2, 1, 1, -0.2F, false));
		gun132.cubeList.add(new ModelBox(gun132, 40, 72, -0.727F, 0.22F, 0.25F, 2, 1, 1, -0.2F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -33.5F, 1.5F);
		gun.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 56, 28, 0.001F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 56, 21, 0.599F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 25, 44, 0.299F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		gun.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		gun60.cubeList.add(new ModelBox(gun60, 90, 27, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 90, 25, -3.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.9F, -12.5F, -45.5F);
		handguard.cubeList.add(new ModelBox(handguard, 44, 46, -3.9F, -2.5F, -15.25F, 3, 3, 1, 0.1F, false));

		handguard10_r1 = new ModelRenderer(this);
		handguard10_r1.setRotationPoint(-1.4F, -3.6F, 0.0F);
		handguard.addChild(handguard10_r1);
		setRotationAngle(handguard10_r1, 0.014F, 0.0044F, 0.5236F);
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 87, 86, 0.15F, 0.012F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 72, 87, 0.15F, 0.012F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 87, 73, 0.15F, 0.012F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 78, 87, 0.15F, 0.012F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 87, 78, 0.15F, 0.012F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 87, 80, 0.15F, 0.012F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 87, 82, 0.15F, 0.012F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 84, 87, 0.15F, 0.012F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 87, 84, 0.15F, 0.012F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 56, 31, 0.15F, 0.012F, -15.0F, 1, 1, 1, 0.0F, false));
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 29, 73, 0.15F, 0.012F, -13.0F, 1, 1, 1, 0.0F, false));
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 56, 77, 0.15F, 0.012F, -11.0F, 1, 1, 1, 0.0F, false));
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 79, 47, 0.15F, 0.012F, -5.0F, 1, 1, 1, 0.0F, false));
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 80, 49, 0.15F, 0.012F, -3.0F, 1, 1, 1, 0.0F, false));
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 81, 32, 0.15F, 0.012F, -1.0F, 1, 1, 1, 0.0F, false));
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 3, 88, 0.15F, 0.012F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard206_r1 = new ModelRenderer(this);
		handguard206_r1.setRotationPoint(-0.3F, -0.5F, 19.5F);
		handguard.addChild(handguard206_r1);
		setRotationAngle(handguard206_r1, -0.0349F, 0.096F, 0.4538F);
		handguard206_r1.cubeList.add(new ModelBox(handguard206_r1, 63, 14, -0.999F, 0.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard205_r1 = new ModelRenderer(this);
		handguard205_r1.setRotationPoint(-4.5F, -0.5F, 19.5F);
		handguard.addChild(handguard205_r1);
		setRotationAngle(handguard205_r1, -0.0349F, -0.096F, -0.4538F);
		handguard205_r1.cubeList.add(new ModelBox(handguard205_r1, 46, 63, -0.001F, 0.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard204_r1 = new ModelRenderer(this);
		handguard204_r1.setRotationPoint(-4.5F, -1.5F, 19.5F);
		handguard.addChild(handguard204_r1);
		setRotationAngle(handguard204_r1, 0.0349F, -0.096F, 0.4538F);
		handguard204_r1.cubeList.add(new ModelBox(handguard204_r1, 65, 65, -0.001F, -1.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r1 = new ModelRenderer(this);
		handguard203_r1.setRotationPoint(-0.3F, -1.5F, 19.5F);
		handguard.addChild(handguard203_r1);
		setRotationAngle(handguard203_r1, 0.0349F, 0.096F, -0.4538F);
		handguard203_r1.cubeList.add(new ModelBox(handguard203_r1, 8, 67, -0.999F, -1.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard205_r2 = new ModelRenderer(this);
		handguard205_r2.setRotationPoint(-0.3F, -0.5F, 19.5F);
		handguard.addChild(handguard205_r2);
		setRotationAngle(handguard205_r2, 0.0436F, 0.096F, 0.4538F);
		handguard205_r2.cubeList.add(new ModelBox(handguard205_r2, 63, 35, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard204_r2 = new ModelRenderer(this);
		handguard204_r2.setRotationPoint(-4.5F, -0.5F, 19.5F);
		handguard.addChild(handguard204_r2);
		setRotationAngle(handguard204_r2, 0.0436F, -0.096F, -0.4538F);
		handguard204_r2.cubeList.add(new ModelBox(handguard204_r2, 63, 48, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard203_r2 = new ModelRenderer(this);
		handguard203_r2.setRotationPoint(-4.5F, -1.5F, 19.5F);
		handguard.addChild(handguard203_r2);
		setRotationAngle(handguard203_r2, -0.0436F, -0.096F, 0.4538F);
		handguard203_r2.cubeList.add(new ModelBox(handguard203_r2, 65, 0, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard202_r1 = new ModelRenderer(this);
		handguard202_r1.setRotationPoint(-0.3F, -1.5F, 19.5F);
		handguard.addChild(handguard202_r1);
		setRotationAngle(handguard202_r1, -0.0436F, 0.096F, -0.4538F);
		handguard202_r1.cubeList.add(new ModelBox(handguard202_r1, 68, 15, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard202_r2 = new ModelRenderer(this);
		handguard202_r2.setRotationPoint(-4.5F, -0.5F, 19.5F);
		handguard.addChild(handguard202_r2);
		setRotationAngle(handguard202_r2, 0.0F, -0.1047F, 0.0F);
		handguard202_r2.cubeList.add(new ModelBox(handguard202_r2, 63, 56, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard201_r1 = new ModelRenderer(this);
		handguard201_r1.setRotationPoint(-0.3F, -0.5F, 19.5F);
		handguard.addChild(handguard201_r1);
		setRotationAngle(handguard201_r1, 0.0F, 0.1047F, 0.0F);
		handguard201_r1.cubeList.add(new ModelBox(handguard201_r1, 68, 36, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard200_r1 = new ModelRenderer(this);
		handguard200_r1.setRotationPoint(-2.9F, 1.1F, 19.5F);
		handguard.addChild(handguard200_r1);
		setRotationAngle(handguard200_r1, -0.1047F, 0.0F, 0.0F);
		handguard200_r1.cubeList.add(new ModelBox(handguard200_r1, 68, 43, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard204_r3 = new ModelRenderer(this);
		handguard204_r3.setRotationPoint(-1.9F, 1.1F, 19.5F);
		handguard.addChild(handguard204_r3);
		setRotationAngle(handguard204_r3, -0.0925F, 0.0349F, -0.4538F);
		handguard204_r3.cubeList.add(new ModelBox(handguard204_r3, 8, 63, 0.2F, -1.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r3 = new ModelRenderer(this);
		handguard203_r3.setRotationPoint(-2.9F, 1.1F, 19.5F);
		handguard.addChild(handguard203_r3);
		setRotationAngle(handguard203_r3, -0.0925F, -0.0349F, 0.4538F);
		handguard203_r3.cubeList.add(new ModelBox(handguard203_r3, 63, 42, -1.2F, -1.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard202_r3 = new ModelRenderer(this);
		handguard202_r3.setRotationPoint(-2.9F, -3.1F, 19.5F);
		handguard.addChild(handguard202_r3);
		setRotationAngle(handguard202_r3, 0.0925F, -0.0349F, -0.4538F);
		handguard202_r3.cubeList.add(new ModelBox(handguard202_r3, 66, 60, -1.2F, 0.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard201_r2 = new ModelRenderer(this);
		handguard201_r2.setRotationPoint(-1.9F, -3.1F, 19.5F);
		handguard.addChild(handguard201_r2);
		setRotationAngle(handguard201_r2, 0.0925F, 0.0349F, 0.4538F);
		handguard201_r2.cubeList.add(new ModelBox(handguard201_r2, 67, 21, 0.2F, 0.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r4 = new ModelRenderer(this);
		handguard203_r4.setRotationPoint(-1.9F, 1.1F, 19.5F);
		handguard.addChild(handguard203_r4);
		setRotationAngle(handguard203_r4, -0.0925F, -0.0524F, -0.4538F);
		handguard203_r4.cubeList.add(new ModelBox(handguard203_r4, 0, 63, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard202_r4 = new ModelRenderer(this);
		handguard202_r4.setRotationPoint(-2.9F, 1.1F, 19.5F);
		handguard.addChild(handguard202_r4);
		setRotationAngle(handguard202_r4, -0.0925F, 0.0524F, 0.4538F);
		handguard202_r4.cubeList.add(new ModelBox(handguard202_r4, 38, 63, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard201_r3 = new ModelRenderer(this);
		handguard201_r3.setRotationPoint(-2.9F, -3.1F, 19.5F);
		handguard.addChild(handguard201_r3);
		setRotationAngle(handguard201_r3, 0.0925F, 0.0524F, -0.4538F);
		handguard201_r3.cubeList.add(new ModelBox(handguard201_r3, 0, 67, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard200_r2 = new ModelRenderer(this);
		handguard200_r2.setRotationPoint(-1.9F, -3.1F, 19.5F);
		handguard.addChild(handguard200_r2);
		setRotationAngle(handguard200_r2, 0.0925F, -0.0524F, 0.4538F);
		handguard200_r2.cubeList.add(new ModelBox(handguard200_r2, 67, 28, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard199_r1 = new ModelRenderer(this);
		handguard199_r1.setRotationPoint(-2.9F, -3.1F, 19.5F);
		handguard.addChild(handguard199_r1);
		setRotationAngle(handguard199_r1, 0.1047F, 0.0F, 0.0F);
		handguard199_r1.cubeList.add(new ModelBox(handguard199_r1, 68, 47, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard9_r1 = new ModelRenderer(this);
		handguard9_r1.setRotationPoint(-3.4F, 76.6F, 0.0F);
		handguard.addChild(handguard9_r1);
		setRotationAngle(handguard9_r1, -0.0175F, 0.0F, 0.0F);
		handguard9_r1.cubeList.add(new ModelBox(handguard9_r1, 56, 0, 1.3F, -75.7F, 17.5F, 1, 1, 2, -0.3F, false));
		handguard9_r1.cubeList.add(new ModelBox(handguard9_r1, 0, 110, 1.299F, -75.699F, -16.6F, 1, 1, 35, -0.3F, false));
		handguard9_r1.cubeList.add(new ModelBox(handguard9_r1, 56, 3, -0.3F, -75.7F, 17.5F, 1, 1, 2, -0.3F, false));
		handguard9_r1.cubeList.add(new ModelBox(handguard9_r1, 37, 111, -0.301F, -75.699F, -16.6F, 1, 1, 35, -0.3F, false));

		handguard8_r1 = new ModelRenderer(this);
		handguard8_r1.setRotationPoint(-3.4F, -3.6F, 0.0F);
		handguard.addChild(handguard8_r1);
		setRotationAngle(handguard8_r1, 0.0175F, 0.0F, 0.0F);
		handguard8_r1.cubeList.add(new ModelBox(handguard8_r1, 0, 58, 1.3F, -0.3F, 18.8F, 1, 1, 2, -0.3F, false));
		handguard8_r1.cubeList.add(new ModelBox(handguard8_r1, 109, 111, 1.299F, -0.301F, -15.3F, 1, 1, 35, -0.3F, false));
		handguard8_r1.cubeList.add(new ModelBox(handguard8_r1, 9, 58, -0.3F, -0.3F, 18.8F, 1, 1, 2, -0.3F, false));
		handguard8_r1.cubeList.add(new ModelBox(handguard8_r1, 112, 0, -0.301F, -0.301F, -15.3F, 1, 1, 35, -0.3F, false));

		handguard14_r1 = new ModelRenderer(this);
		handguard14_r1.setRotationPoint(-3.4F, 76.5F, 0.0F);
		handguard.addChild(handguard14_r1);
		setRotationAngle(handguard14_r1, -0.0175F, 0.0F, 0.0F);
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 18, 52, -0.001F, -76.0F, 18.2F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 38, 51, -0.001F, -75.999F, 16.7F, 2, 1, 2, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 24, 52, -0.001F, -75.999F, 14.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 44, 67, -0.001F, -75.999F, 8.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 69, 8, -0.001F, -75.999F, 2.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 29, 63, -0.001F, -75.999F, 12.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 13, 68, -0.001F, -75.999F, 6.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 69, 10, -0.001F, -75.999F, 0.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 38, 67, -0.001F, -75.999F, 10.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 68, 52, -0.001F, -75.999F, 4.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 74, 111, 1.2F, -75.8F, -15.8F, 1, 1, 33, -0.2F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 112, 56, -0.2F, -75.8F, -15.8F, 1, 1, 33, -0.2F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 10, 39, -0.001F, -75.999F, -16.3F, 2, 1, 2, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 0, 13, -0.001F, -75.999F, -13.3F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 38, 18, -0.001F, -75.999F, -11.3F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 36, 40, -0.001F, -75.999F, -9.3F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 46, 31, -0.001F, -75.999F, -7.3F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 48, 9, -0.001F, -75.999F, -5.3F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 6, 52, -0.001F, -75.999F, -3.3F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 70, 0, -0.001F, -75.999F, -1.3F, 2, 1, 1, 0.0F, false));

		handguard13_r1 = new ModelRenderer(this);
		handguard13_r1.setRotationPoint(-3.4F, -3.5F, 0.0F);
		handguard.addChild(handguard13_r1);
		setRotationAngle(handguard13_r1, 0.0175F, 0.0F, 0.0F);
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 35, 70, -0.001F, 0.0F, 19.5F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 46, 51, -0.001F, -0.001F, 18.0F, 2, 1, 2, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 70, 64, -0.001F, -0.001F, 16.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 0, 71, -0.001F, -0.001F, 10.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 6, 71, -0.001F, -0.001F, 4.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 47, 70, -0.001F, -0.001F, 14.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 70, 69, -0.001F, -0.001F, 8.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 12, 71, -0.001F, -0.001F, 2.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 41, 70, -0.001F, -0.001F, 12.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 70, 66, -0.001F, -0.001F, 6.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 0, 146, 1.2F, -0.202F, -14.5F, 1, 1, 33, -0.2F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 146, 90, -0.2F, -0.202F, -14.5F, 1, 1, 33, -0.2F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 30, 51, -0.001F, -0.001F, -15.0F, 2, 1, 2, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 29, 31, -0.001F, -0.001F, -12.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 30, 40, -0.001F, -0.001F, -10.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 46, 23, -0.001F, -0.001F, -8.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 48, 3, -0.001F, -0.001F, -6.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 0, 52, -0.001F, -0.001F, -4.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 12, 52, -0.001F, -0.001F, -2.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 34, 72, -0.001F, -0.001F, 0.0F, 2, 1, 1, 0.0F, false));

		handguard10_r2 = new ModelRenderer(this);
		handguard10_r2.setRotationPoint(-3.4F, -3.5F, 0.0F);
		handguard.addChild(handguard10_r2);
		setRotationAngle(handguard10_r2, 0.0157F, -0.0044F, -0.5236F);
		handguard10_r2.cubeList.add(new ModelBox(handguard10_r2, 77, 147, -1.05F, -0.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard11_r1 = new ModelRenderer(this);
		handguard11_r1.setRotationPoint(-3.4F, 1.5F, 0.0F);
		handguard.addChild(handguard11_r1);
		setRotationAngle(handguard11_r1, -0.0157F, -0.0044F, 0.5236F);
		handguard11_r1.cubeList.add(new ModelBox(handguard11_r1, 56, 0, -1.05F, -0.999F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard10_r3 = new ModelRenderer(this);
		handguard10_r3.setRotationPoint(-1.4F, 1.5F, 0.0F);
		handguard.addChild(handguard10_r3);
		setRotationAngle(handguard10_r3, -0.0157F, 0.0044F, -0.5236F);
		handguard10_r3.cubeList.add(new ModelBox(handguard10_r3, 56, 77, 0.05F, -0.999F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard9_r2 = new ModelRenderer(this);
		handguard9_r2.setRotationPoint(-1.4F, -3.5F, 0.0F);
		handguard.addChild(handguard9_r2);
		setRotationAngle(handguard9_r2, 0.0157F, 0.0044F, 0.5236F);
		handguard9_r2.cubeList.add(new ModelBox(handguard9_r2, 149, 0, 0.05F, -0.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard9_r3 = new ModelRenderer(this);
		handguard9_r3.setRotationPoint(-3.4F, -3.5F, 0.0F);
		handguard.addChild(handguard9_r3);
		setRotationAngle(handguard9_r3, 0.014F, -0.0044F, -0.5236F);
		handguard9_r3.cubeList.add(new ModelBox(handguard9_r3, 130, 91, -1.05F, -0.002F, -15.0F, 1, 1, 16, 0.0F, false));

		handguard10_r4 = new ModelRenderer(this);
		handguard10_r4.setRotationPoint(-3.4F, 1.5F, 0.0F);
		handguard.addChild(handguard10_r4);
		setRotationAngle(handguard10_r4, -0.014F, -0.0044F, 0.5236F);
		handguard10_r4.cubeList.add(new ModelBox(handguard10_r4, 112, 0, -1.05F, -0.998F, -15.0F, 1, 1, 16, 0.0F, false));

		handguard9_r4 = new ModelRenderer(this);
		handguard9_r4.setRotationPoint(-1.4F, 1.5F, 0.0F);
		handguard.addChild(handguard9_r4);
		setRotationAngle(handguard9_r4, -0.014F, 0.0044F, -0.5236F);
		handguard9_r4.cubeList.add(new ModelBox(handguard9_r4, 112, 90, 0.05F, -0.998F, -15.0F, 1, 1, 16, 0.0F, false));

		handguard20_r1 = new ModelRenderer(this);
		handguard20_r1.setRotationPoint(-3.4F, 1.6F, 0.0F);
		handguard.addChild(handguard20_r1);
		setRotationAngle(handguard20_r1, -0.014F, -0.0044F, 0.5236F);
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 84, 74, -1.15F, -1.012F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 84, 77, -1.15F, -1.012F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 84, 81, -1.15F, -1.012F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 84, 83, -1.15F, -1.012F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 50, 85, -1.15F, -1.012F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 85, 52, -1.15F, -1.012F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 64, 85, -1.15F, -1.012F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 68, 85, -1.15F, -1.012F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 84, 85, -1.15F, -1.012F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 16, 39, -1.15F, -1.012F, -15.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 50, 67, -1.15F, -1.012F, -13.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 38, 76, -1.15F, -1.012F, -11.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 78, 4, -1.15F, -1.012F, -9.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 78, 27, -1.15F, -1.012F, -7.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 78, 70, -1.15F, -1.012F, -5.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 3, 80, -1.15F, -1.012F, -3.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 81, 13, -1.15F, -1.012F, -1.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 7, 86, -1.15F, -1.012F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard19_r1 = new ModelRenderer(this);
		handguard19_r1.setRotationPoint(-1.4F, 1.6F, 0.0F);
		handguard.addChild(handguard19_r1);
		setRotationAngle(handguard19_r1, -0.014F, 0.0044F, -0.5236F);
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 87, 30, 0.15F, -1.012F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 87, 32, 0.15F, -1.012F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 87, 38, 0.15F, -1.012F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 46, 87, 0.15F, -1.012F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 87, 57, 0.15F, -1.012F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 87, 59, 0.15F, -1.012F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 87, 63, 0.15F, -1.012F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 64, 87, 0.15F, -1.012F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 68, 87, 0.15F, -1.012F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 41, 9, 0.15F, -1.012F, -15.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 72, 6, 0.15F, -1.012F, -13.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 76, 46, 0.15F, -1.012F, -11.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 7, 78, 0.15F, -1.012F, -9.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 78, 31, 0.15F, -1.012F, -7.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 78, 74, 0.15F, -1.012F, -5.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 11, 80, 0.15F, -1.012F, -3.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 81, 17, 0.15F, -1.012F, -1.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 87, 71, 0.15F, -1.012F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard19_r2 = new ModelRenderer(this);
		handguard19_r2.setRotationPoint(-3.4F, -3.6F, 0.0F);
		handguard.addChild(handguard19_r2);
		setRotationAngle(handguard19_r2, 0.014F, -0.0044F, -0.5236F);
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 83, 50, -1.15F, 0.012F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 56, 83, -1.15F, 0.012F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 64, 83, -1.15F, 0.012F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 78, 83, -1.15F, 0.012F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 84, 0, -1.15F, 0.012F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 84, 4, -1.15F, 0.012F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 7, 84, -1.15F, 0.012F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 84, 8, -1.15F, 0.012F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 84, 12, -1.15F, 0.012F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 56, 51, -1.15F, 0.012F, -15.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 8, 76, -1.15F, 0.012F, -13.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 68, 77, -1.15F, 0.012F, -11.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 78, 21, -1.15F, 0.012F, -9.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 78, 60, -1.15F, 0.012F, -7.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 60, 79, -1.15F, 0.012F, -5.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 81, 3, -1.15F, 0.012F, -3.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 81, 38, -1.15F, 0.012F, -1.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 15, 84, -1.15F, 0.012F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard8_r2 = new ModelRenderer(this);
		handguard8_r2.setRotationPoint(-1.4F, -3.5F, 0.0F);
		handguard.addChild(handguard8_r2);
		setRotationAngle(handguard8_r2, 0.014F, 0.0044F, 0.5236F);
		handguard8_r2.cubeList.add(new ModelBox(handguard8_r2, 70, 168, 0.05F, -0.002F, -15.0F, 1, 1, 16, 0.0F, false));

		handguard8_r3 = new ModelRenderer(this);
		handguard8_r3.setRotationPoint(-3.4F, -3.5F, 0.0F);
		handguard.addChild(handguard8_r3);
		setRotationAngle(handguard8_r3, 0.014F, 0.0087F, -0.5236F);
		handguard8_r3.cubeList.add(new ModelBox(handguard8_r3, 57, 147, -1.001F, -0.001F, -15.0F, 1, 1, 16, 0.0F, false));

		handguard9_r5 = new ModelRenderer(this);
		handguard9_r5.setRotationPoint(-3.4F, 1.5F, 0.0F);
		handguard.addChild(handguard9_r5);
		setRotationAngle(handguard9_r5, -0.014F, 0.0087F, 0.5236F);
		handguard9_r5.cubeList.add(new ModelBox(handguard9_r5, 22, 22, -1.001F, -0.999F, -4.0F, 1, 1, 5, 0.0F, false));

		handguard8_r4 = new ModelRenderer(this);
		handguard8_r4.setRotationPoint(-1.4F, 1.5F, 0.0F);
		handguard.addChild(handguard8_r4);
		setRotationAngle(handguard8_r4, -0.014F, -0.0087F, -0.5236F);
		handguard8_r4.cubeList.add(new ModelBox(handguard8_r4, 0, 22, 0.001F, -0.999F, -7.0F, 1, 1, 8, 0.0F, false));

		handguard19_r3 = new ModelRenderer(this);
		handguard19_r3.setRotationPoint(-3.4F, 1.6F, 1.0F);
		handguard.addChild(handguard19_r3);
		setRotationAngle(handguard19_r3, -0.014F, 0.0087F, 0.5236F);
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 84, 72, -1.001F, -0.999F, 18.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 84, 79, -1.001F, -0.999F, 16.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 81, 84, -1.001F, -0.999F, 14.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 0, 85, -1.001F, -0.999F, 12.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 46, 85, -1.001F, -0.999F, 10.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 56, 85, -1.001F, -0.999F, 8.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 60, 85, -1.001F, -0.999F, 6.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 72, 85, -1.001F, -0.999F, 4.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 78, 85, -1.001F, -0.999F, 2.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 3, 78, -1.001F, -0.999F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 26, 78, -1.001F, -0.999F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 78, 68, -1.001F, -0.999F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 78, 79, -1.001F, -0.999F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 81, 11, -1.001F, -0.999F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 3, 86, -1.001F, -0.999F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard18_r1 = new ModelRenderer(this);
		handguard18_r1.setRotationPoint(-1.4F, 1.6F, 1.0F);
		handguard.addChild(handguard18_r1);
		setRotationAngle(handguard18_r1, -0.014F, -0.0087F, -0.5236F);
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 87, 28, 0.001F, -0.999F, 18.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 87, 34, 0.001F, -0.999F, 16.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 87, 36, 0.001F, -0.999F, 14.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 50, 87, 0.001F, -0.999F, 12.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 56, 87, 0.001F, -0.999F, 10.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 60, 87, 0.001F, -0.999F, 8.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 87, 61, 0.001F, -0.999F, 6.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 87, 65, 0.001F, -0.999F, 4.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 87, 67, 0.001F, -0.999F, 2.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 41, 3, 0.001F, -0.999F, -16.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 62, 68, 0.001F, -0.999F, -14.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 78, 6, 0.001F, -0.999F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 78, 72, 0.001F, -0.999F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 7, 80, 0.001F, -0.999F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 81, 15, 0.001F, -0.999F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 87, 69, 0.001F, -0.999F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard18_r2 = new ModelRenderer(this);
		handguard18_r2.setRotationPoint(-3.4F, -3.6F, 1.0F);
		handguard.addChild(handguard18_r2);
		setRotationAngle(handguard18_r2, 0.014F, 0.0087F, -0.5236F);
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 50, 83, -1.001F, -0.001F, 18.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 60, 83, -1.001F, -0.001F, 16.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 68, 83, -1.001F, -0.001F, 14.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 72, 83, -1.001F, -0.001F, 12.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 84, 2, -1.001F, -0.001F, 10.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 3, 84, -1.001F, -0.001F, 8.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 84, 6, -1.001F, -0.001F, 6.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 84, 10, -1.001F, -0.001F, 4.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 11, 84, -1.001F, -0.001F, 2.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 78, 16, -1.001F, -0.001F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 78, 56, -1.001F, -0.001F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 49, 79, -1.001F, -0.001F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 0, 81, -1.001F, -0.001F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 81, 34, -1.001F, -0.001F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 84, 14, -1.001F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard17_r1 = new ModelRenderer(this);
		handguard17_r1.setRotationPoint(-1.4F, -3.6F, 1.0F);
		handguard.addChild(handguard17_r1);
		setRotationAngle(handguard17_r1, 0.014F, -0.0087F, 0.5236F);
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 7, 88, 0.001F, -0.001F, 18.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 11, 88, 0.001F, -0.001F, 16.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 15, 88, 0.001F, -0.001F, 14.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 88, 51, 0.001F, -0.001F, 12.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 81, 88, 0.001F, -0.001F, 10.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 87, 88, 0.001F, -0.001F, 8.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 0, 89, 0.001F, -0.001F, 6.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 89, 42, 0.001F, -0.001F, 4.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 89, 44, 0.001F, -0.001F, 2.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 56, 24, 0.001F, -0.001F, -16.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 16, 73, 0.001F, -0.001F, -14.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 78, 14, 0.001F, -0.001F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 78, 39, 0.001F, -0.001F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 79, 45, 0.001F, -0.001F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 80, 43, 0.001F, -0.001F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 81, 30, 0.001F, -0.001F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 46, 89, 0.001F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard7_r1 = new ModelRenderer(this);
		handguard7_r1.setRotationPoint(-1.4F, -3.5F, 0.0F);
		handguard.addChild(handguard7_r1);
		setRotationAngle(handguard7_r1, 0.014F, -0.0087F, 0.5236F);
		handguard7_r1.cubeList.add(new ModelBox(handguard7_r1, 168, 124, 0.001F, -0.001F, -15.0F, 1, 1, 16, 0.0F, false));

		handguard7_r2 = new ModelRenderer(this);
		handguard7_r2.setRotationPoint(-3.4F, -3.5F, 0.0F);
		handguard.addChild(handguard7_r2);
		setRotationAngle(handguard7_r2, 0.0157F, 0.0087F, -0.5236F);
		handguard7_r2.cubeList.add(new ModelBox(handguard7_r2, 119, 147, -1.0F, 0.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard8_r5 = new ModelRenderer(this);
		handguard8_r5.setRotationPoint(-3.4F, 1.5F, 0.0F);
		handguard.addChild(handguard8_r5);
		setRotationAngle(handguard8_r5, -0.0157F, 0.0087F, 0.5236F);
		handguard8_r5.cubeList.add(new ModelBox(handguard8_r5, 0, 55, -1.0F, -1.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard7_r3 = new ModelRenderer(this);
		handguard7_r3.setRotationPoint(-1.4F, 1.5F, 0.0F);
		handguard.addChild(handguard7_r3);
		setRotationAngle(handguard7_r3, -0.0157F, -0.0087F, -0.5236F);
		handguard7_r3.cubeList.add(new ModelBox(handguard7_r3, 0, 76, 0.0F, -1.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard6_r1 = new ModelRenderer(this);
		handguard6_r1.setRotationPoint(-1.4F, -3.5F, 0.0F);
		handguard.addChild(handguard6_r1);
		setRotationAngle(handguard6_r1, 0.0157F, -0.0087F, 0.5236F);
		handguard6_r1.cubeList.add(new ModelBox(handguard6_r1, 163, 145, 0.0F, 0.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard7_r4 = new ModelRenderer(this);
		handguard7_r4.setRotationPoint(0.0F, -2.0F, 0.0F);
		handguard.addChild(handguard7_r4);
		setRotationAngle(handguard7_r4, 0.0F, 0.0175F, 0.0F);
		handguard7_r4.cubeList.add(new ModelBox(handguard7_r4, 0, 22, -1.0F, 0.0F, 0.5F, 1, 2, 20, 0.0F, false));
		handguard7_r4.cubeList.add(new ModelBox(handguard7_r4, 37, 110, -1.001F, -0.001F, -15.0F, 1, 2, 16, 0.0F, false));

		handguard8_r6 = new ModelRenderer(this);
		handguard8_r6.setRotationPoint(-4.8F, -2.0F, 0.0F);
		handguard.addChild(handguard8_r6);
		setRotationAngle(handguard8_r6, 0.0F, -0.0175F, 0.0F);
		handguard8_r6.cubeList.add(new ModelBox(handguard8_r6, 0, 0, -0.001F, 0.0F, 0.5F, 1, 2, 20, 0.0F, false));
		handguard8_r6.cubeList.add(new ModelBox(handguard8_r6, 0, 110, 0.0F, -0.001F, -15.0F, 1, 2, 16, 0.0F, false));

		handguard11_r2 = new ModelRenderer(this);
		handguard11_r2.setRotationPoint(-4.8F, -2.0F, 0.0F);
		handguard.addChild(handguard11_r2);
		setRotationAngle(handguard11_r2, 0.0044F, -0.0157F, 0.4712F);
		handguard11_r2.cubeList.add(new ModelBox(handguard11_r2, 147, 57, 0.0F, -1.1F, 0.5F, 1, 1, 20, 0.0F, false));
		handguard11_r2.cubeList.add(new ModelBox(handguard11_r2, 130, 37, -0.001F, -1.1F, -15.0F, 1, 1, 16, 0.0F, false));

		handguard12_r1 = new ModelRenderer(this);
		handguard12_r1.setRotationPoint(-4.8F, 0.0F, 0.0F);
		handguard.addChild(handguard12_r1);
		setRotationAngle(handguard12_r1, -0.0044F, -0.0157F, -0.4712F);
		handguard12_r1.cubeList.add(new ModelBox(handguard12_r1, 56, 56, 0.0F, 0.1F, 0.5F, 1, 1, 20, 0.0F, false));
		handguard12_r1.cubeList.add(new ModelBox(handguard12_r1, 112, 36, -0.001F, 0.1F, -15.0F, 1, 1, 16, 0.0F, false));

		handguard11_r3 = new ModelRenderer(this);
		handguard11_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard.addChild(handguard11_r3);
		setRotationAngle(handguard11_r3, -0.0044F, 0.0157F, 0.4712F);
		handguard11_r3.cubeList.add(new ModelBox(handguard11_r3, 35, 147, -1.0F, 0.1F, 0.5F, 1, 1, 20, 0.0F, false));
		handguard11_r3.cubeList.add(new ModelBox(handguard11_r3, 0, 128, -0.999F, 0.1F, -15.0F, 1, 1, 16, 0.0F, false));

		handguard22_r1 = new ModelRenderer(this);
		handguard22_r1.setRotationPoint(-4.9F, 0.0F, 0.0F);
		handguard.addChild(handguard22_r1);
		setRotationAngle(handguard22_r1, -0.0044F, -0.0157F, -0.4712F);
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 84, 70, 0.0F, 0.15F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 84, 66, 0.0F, 0.15F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 84, 62, 0.0F, 0.15F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 84, 56, 0.0F, 0.15F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 84, 39, 0.0F, 0.15F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 84, 33, 0.0F, 0.15F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 84, 31, 0.0F, 0.15F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 84, 25, 0.0F, 0.15F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 84, 23, 0.0F, 0.15F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 31, 11, 0.0F, 0.15F, -15.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 22, 63, 0.0F, 0.15F, -13.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 22, 76, 0.0F, 0.15F, -11.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 78, 2, 0.0F, 0.15F, -9.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 78, 25, 0.0F, 0.15F, -7.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 78, 66, 0.0F, 0.15F, -5.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 72, 79, 0.0F, 0.15F, -3.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 81, 9, 0.0F, 0.15F, -1.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 84, 16, 0.0F, 0.15F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard21_r1 = new ModelRenderer(this);
		handguard21_r1.setRotationPoint(0.1F, 0.0F, 0.0F);
		handguard.addChild(handguard21_r1);
		setRotationAngle(handguard21_r1, -0.0044F, 0.0157F, 0.4712F);
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 87, 26, -1.0F, 0.15F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 87, 22, -1.0F, 0.15F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 87, 15, -1.0F, 0.15F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 87, 9, -1.0F, 0.15F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 87, 7, -1.0F, 0.15F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 87, 1, -1.0F, 0.15F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 0, 87, -1.0F, 0.15F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 86, 47, -1.0F, 0.15F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 86, 45, -1.0F, 0.15F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 44, 51, -1.0F, 0.15F, -15.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 4, 73, -1.0F, 0.15F, -13.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 41, 77, -1.0F, 0.15F, -11.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 78, 10, -1.0F, 0.15F, -9.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 0, 79, -1.0F, 0.15F, -5.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 22, 80, -1.0F, 0.15F, -3.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 81, 24, -1.0F, 0.15F, -1.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 11, 86, -1.0F, 0.15F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard21_r2 = new ModelRenderer(this);
		handguard21_r2.setRotationPoint(-4.9F, -2.0F, 0.0F);
		handguard.addChild(handguard21_r2);
		setRotationAngle(handguard21_r2, 0.0044F, -0.0157F, 0.4712F);
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 83, 48, 0.0F, -1.15F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 83, 42, 0.0F, -1.15F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 0, 83, 0.0F, -1.15F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 38, 82, 0.0F, -1.15F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 26, 82, 0.0F, -1.15F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 11, 82, 0.0F, -1.15F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 7, 82, 0.0F, -1.15F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 81, 78, 0.0F, -1.15F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 78, 81, 0.0F, -1.15F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 56, 59, 0.0F, -1.15F, -15.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 12, 76, 0.0F, -1.15F, -13.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 72, 77, 0.0F, -1.15F, -11.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 22, 78, 0.0F, -1.15F, -9.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 78, 62, 0.0F, -1.15F, -7.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 64, 79, 0.0F, -1.15F, -5.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 81, 5, 0.0F, -1.15F, -3.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 41, 81, 0.0F, -1.15F, -1.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 72, 81, 0.0F, -1.15F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard20_r2 = new ModelRenderer(this);
		handguard20_r2.setRotationPoint(0.1F, -2.0F, 0.0F);
		handguard.addChild(handguard20_r2);
		setRotationAngle(handguard20_r2, 0.0044F, 0.0157F, -0.4712F);
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 89, 46, -1.0F, -1.15F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 89, 48, -1.0F, -1.15F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 50, 89, -1.0F, -1.15F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 56, 89, -1.0F, -1.15F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 60, 89, -1.0F, -1.15F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 64, 89, -1.0F, -1.15F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 68, 89, -1.0F, -1.15F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 72, 89, -1.0F, -1.15F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 78, 89, -1.0F, -1.15F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 56, 17, -1.0F, -1.15F, -15.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 12, 73, -1.0F, -1.15F, -13.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 45, 77, -1.0F, -1.15F, -11.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 78, 12, -1.0F, -1.15F, -9.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 38, 78, -1.0F, -1.15F, -7.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 45, 79, -1.0F, -1.15F, -5.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 38, 80, -1.0F, -1.15F, -3.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 81, 28, -1.0F, -1.15F, -1.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 84, 89, -1.0F, -1.15F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard10_r5 = new ModelRenderer(this);
		handguard10_r5.setRotationPoint(0.0F, -2.0F, 0.0F);
		handguard.addChild(handguard10_r5);
		setRotationAngle(handguard10_r5, 0.0044F, 0.0157F, -0.4712F);
		handguard10_r5.cubeList.add(new ModelBox(handguard10_r5, 141, 148, -1.0F, -1.1F, 0.5F, 1, 1, 20, 0.0F, false));
		handguard10_r5.cubeList.add(new ModelBox(handguard10_r5, 99, 147, -0.999F, -1.1F, -15.0F, 1, 1, 16, 0.0F, false));

		handguard9_r6 = new ModelRenderer(this);
		handguard9_r6.setRotationPoint(-4.8F, -2.0F, 0.0F);
		handguard.addChild(handguard9_r6);
		setRotationAngle(handguard9_r6, -0.0079F, -0.0157F, 0.4712F);
		handguard9_r6.cubeList.add(new ModelBox(handguard9_r6, 22, 55, 0.0F, -1.0F, -13.0F, 1, 1, 14, 0.0F, false));
		handguard9_r6.cubeList.add(new ModelBox(handguard9_r6, 147, 36, 0.001F, -1.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard10_r6 = new ModelRenderer(this);
		handguard10_r6.setRotationPoint(-4.8F, 0.0F, 0.0F);
		handguard.addChild(handguard10_r6);
		setRotationAngle(handguard10_r6, 0.0079F, -0.0157F, -0.4712F);
		handguard10_r6.cubeList.add(new ModelBox(handguard10_r6, 112, 17, 0.0F, 0.0F, -15.0F, 1, 1, 16, 0.0F, false));
		handguard10_r6.cubeList.add(new ModelBox(handguard10_r6, 56, 21, 0.001F, 0.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard9_r7 = new ModelRenderer(this);
		handguard9_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard.addChild(handguard9_r7);
		setRotationAngle(handguard9_r7, 0.0079F, 0.0157F, 0.4712F);
		handguard9_r7.cubeList.add(new ModelBox(handguard9_r7, 37, 128, -1.0F, 0.0F, -15.0F, 1, 1, 16, 0.0F, false));
		handguard9_r7.cubeList.add(new ModelBox(handguard9_r7, 146, 124, -1.001F, 0.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard8_r7 = new ModelRenderer(this);
		handguard8_r7.setRotationPoint(0.0F, -2.0F, 0.0F);
		handguard.addChild(handguard8_r7);
		setRotationAngle(handguard8_r7, -0.0079F, 0.0157F, -0.4712F);
		handguard8_r7.cubeList.add(new ModelBox(handguard8_r7, 112, 168, -1.0F, -1.0F, -15.0F, 1, 1, 16, 0.0F, false));
		handguard8_r7.cubeList.add(new ModelBox(handguard8_r7, 163, 166, -1.001F, -1.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard19_r4 = new ModelRenderer(this);
		handguard19_r4.setRotationPoint(-4.9F, 0.0F, 0.0F);
		handguard.addChild(handguard19_r4);
		setRotationAngle(handguard19_r4, 0.0079F, -0.0157F, -0.4712F);
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 84, 68, 0.001F, 0.001F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 84, 64, 0.001F, 0.001F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 84, 60, 0.001F, 0.001F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 84, 58, 0.001F, 0.001F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 84, 37, 0.001F, 0.001F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 84, 35, 0.001F, 0.001F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 84, 29, 0.001F, 0.001F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 84, 27, 0.001F, 0.001F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 84, 21, 0.001F, 0.001F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 78, 0, 0.001F, 0.001F, -9.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 78, 23, 0.001F, 0.001F, -7.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 78, 64, 0.001F, 0.001F, -5.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 68, 79, 0.001F, 0.001F, -3.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 81, 7, 0.001F, 0.001F, -1.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 84, 18, 0.001F, 0.001F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard18_r3 = new ModelRenderer(this);
		handguard18_r3.setRotationPoint(0.1F, 0.0F, 0.0F);
		handguard.addChild(handguard18_r3);
		setRotationAngle(handguard18_r3, 0.0079F, 0.0157F, 0.4712F);
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 87, 24, -1.001F, 0.001F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 87, 17, -1.001F, 0.001F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 87, 13, -1.001F, 0.001F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 87, 11, -1.001F, 0.001F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 87, 5, -1.001F, 0.001F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 87, 3, -1.001F, 0.001F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 81, 86, -1.001F, 0.001F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 86, 49, -1.001F, 0.001F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 86, 43, -1.001F, 0.001F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 78, 8, -1.001F, 0.001F, -9.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 78, 33, -1.001F, 0.001F, -7.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 78, 77, -1.001F, 0.001F, -5.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 15, 80, -1.001F, 0.001F, -3.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 81, 22, -1.001F, 0.001F, -1.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 15, 86, -1.001F, 0.001F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard18_r4 = new ModelRenderer(this);
		handguard18_r4.setRotationPoint(-4.9F, -2.0F, 0.0F);
		handguard.addChild(handguard18_r4);
		setRotationAngle(handguard18_r4, -0.0079F, -0.0157F, 0.4712F);
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 46, 83, 0.001F, -1.001F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 83, 44, 0.001F, -1.001F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 81, 82, 0.001F, -1.001F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 82, 46, 0.001F, -1.001F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 22, 82, 0.001F, -1.001F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 15, 82, 0.001F, -1.001F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 3, 82, 0.001F, -1.001F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 81, 80, 0.001F, -1.001F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 81, 73, 0.001F, -1.001F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 78, 18, 0.001F, -1.001F, -9.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 78, 58, 0.001F, -1.001F, -7.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 56, 79, 0.001F, -1.001F, -5.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 81, 1, 0.001F, -1.001F, -3.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 81, 36, 0.001F, -1.001F, -1.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 81, 71, 0.001F, -1.001F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard17_r2 = new ModelRenderer(this);
		handguard17_r2.setRotationPoint(0.1F, -2.0F, 0.0F);
		handguard.addChild(handguard17_r2);
		setRotationAngle(handguard17_r2, -0.0079F, 0.0157F, -0.4712F);
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 90, 0, -1.001F, -1.001F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 90, 2, -1.001F, -1.001F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 3, 90, -1.001F, -1.001F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 90, 4, -1.001F, -1.001F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 90, 6, -1.001F, -1.001F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 7, 90, -1.001F, -1.001F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 90, 8, -1.001F, -1.001F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 90, 10, -1.001F, -1.001F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 11, 90, -1.001F, -1.001F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 11, 78, -1.001F, -1.001F, -9.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 78, 37, -1.001F, -1.001F, -7.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 41, 79, -1.001F, -1.001F, -5.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 26, 80, -1.001F, -1.001F, -3.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 81, 26, -1.001F, -1.001F, -1.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 90, 12, -1.001F, -1.001F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard5_r1 = new ModelRenderer(this);
		handguard5_r1.setRotationPoint(0.1F, -1.5F, 0.0F);
		handguard.addChild(handguard5_r1);
		setRotationAngle(handguard5_r1, 0.0F, 0.0175F, 0.0F);
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 169, 21, -1.001F, -0.001F, -15.0F, 1, 1, 16, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 72, 32, -1.001F, -0.5F, 19.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 56, 72, -1.001F, -0.5F, 17.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 60, 72, -1.001F, -0.5F, 15.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 71, 72, -1.001F, -0.5F, 13.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 73, 42, -1.001F, -0.5F, 11.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 73, 47, -1.001F, -0.5F, 9.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 64, 73, -1.001F, -0.5F, 7.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 42, 74, -1.001F, -0.5F, 5.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 46, 74, -1.001F, -0.5F, 3.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 31, 8, -1.002F, -0.5F, -15.001F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 41, 0, -1.002F, -0.5F, -13.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 9, 44, -1.002F, -0.5F, -11.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 25, 44, -1.002F, -0.5F, -9.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 50, 37, -1.002F, -0.5F, -7.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 32, 55, -1.002F, -0.5F, -5.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 56, 8, -1.002F, -0.5F, -3.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 56, 14, -1.002F, -0.5F, -1.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 50, 74, -1.001F, -0.5F, 1.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 48, 168, -1.0F, 0.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard4_r1 = new ModelRenderer(this);
		handguard4_r1.setRotationPoint(-4.9F, -1.5F, 0.0F);
		handguard.addChild(handguard4_r1);
		setRotationAngle(handguard4_r1, 0.0F, -0.0175F, 0.0F);
		handguard4_r1.cubeList.add(new ModelBox(handguard4_r1, 169, 38, -0.001F, -0.001F, -15.0F, 1, 1, 16, 0.0F, false));
		handguard4_r1.cubeList.add(new ModelBox(handguard4_r1, 90, 168, 0.0F, 0.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard15_r1 = new ModelRenderer(this);
		handguard15_r1.setRotationPoint(-1.9F, -1.5F, 0.0F);
		handguard.addChild(handguard15_r1);
		setRotationAngle(handguard15_r1, 0.0F, -0.0175F, 0.0F);
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 56, 35, -2.999F, -0.5F, 19.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 56, 42, -2.999F, -0.5F, 17.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 56, 48, -2.999F, -0.5F, 15.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 56, 56, -2.999F, -0.5F, 13.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 22, 60, -2.999F, -0.5F, 11.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 71, 59, -2.999F, -0.5F, 9.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 72, 3, -2.999F, -0.5F, 7.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 72, 21, -2.999F, -0.5F, 5.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 72, 25, -2.999F, -0.5F, 3.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 22, 28, -2.999F, -0.5F, -15.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 16, 36, -2.999F, -0.5F, -13.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 41, 6, -2.999F, -0.5F, -11.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 19, 44, -2.999F, -0.5F, -9.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 50, 34, -2.999F, -0.5F, -7.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 22, 55, -2.999F, -0.5F, -5.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 56, 21, -2.999F, -0.5F, -3.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 56, 28, -2.999F, -0.5F, -1.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 72, 28, -2.999F, -0.5F, 1.0F, 1, 2, 1, 0.0F, false));
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
