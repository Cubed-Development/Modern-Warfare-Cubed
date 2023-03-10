package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M4A1 extends ModelWithAttachments {
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
	private final ModelRenderer receiver;
	private final ModelRenderer gun263_r1;
	private final ModelRenderer gun263_r2;
	private final ModelRenderer gun264_r1;
	private final ModelRenderer gun264_r2;
	private final ModelRenderer gun143_r1;
	private final ModelRenderer gun140_r1;
	private final ModelRenderer receiver18_r2;
	private final ModelRenderer receiver17_r5;
	private final ModelRenderer receiver14_r4;
	private final ModelRenderer receiver14_r5;
	private final ModelRenderer receiver13_r1;
	private final ModelRenderer receiver12_r1;
	private final ModelRenderer receiver15_r6;
	private final ModelRenderer receiver14_r6;
	private final ModelRenderer receiver14_r7;
	private final ModelRenderer receiver13_r2;
	private final ModelRenderer receiver13_r3;
	private final ModelRenderer receiver14_r8;
	private final ModelRenderer receiver14_r9;
	private final ModelRenderer receiver15_r7;
	private final ModelRenderer receiver14_r10;
	private final ModelRenderer receiver14_r11;
	private final ModelRenderer receiver13_r4;
	private final ModelRenderer receiver12_r2;
	private final ModelRenderer receiver13_r5;
	private final ModelRenderer receiver13_r6;
	private final ModelRenderer receiver12_r3;
	private final ModelRenderer receiver11_r1;
	private final ModelRenderer receiver16_r7;
	private final ModelRenderer receiver18_r3;
	private final ModelRenderer receiver17_r6;
	private final ModelRenderer gun125_r1;
	private final ModelRenderer gun170;
	private final ModelRenderer gun172_r1;
	private final ModelRenderer gun172_r2;
	private final ModelRenderer gun264;
	private final ModelRenderer action;
	private final ModelRenderer receiver16_r8;
	private final ModelRenderer receiver16_r9;
	private final ModelRenderer receiver15_r8;
	private final ModelRenderer receiver16_r10;
	private final ModelRenderer handguard;
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
	private final ModelRenderer handguard10_r1;
	private final ModelRenderer handguard11_r1;
	private final ModelRenderer handguard10_r2;
	private final ModelRenderer handguard9_r2;
	private final ModelRenderer handguard9_r3;
	private final ModelRenderer handguard10_r3;
	private final ModelRenderer handguard9_r4;
	private final ModelRenderer handguard20_r1;
	private final ModelRenderer handguard19_r1;
	private final ModelRenderer handguard19_r2;
	private final ModelRenderer handguard18_r1;
	private final ModelRenderer handguard8_r2;
	private final ModelRenderer handguard8_r3;
	private final ModelRenderer handguard9_r5;
	private final ModelRenderer handguard8_r4;
	private final ModelRenderer handguard19_r3;
	private final ModelRenderer handguard18_r2;
	private final ModelRenderer handguard18_r3;
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
	private final ModelRenderer handguard10_r4;
	private final ModelRenderer handguard9_r6;
	private final ModelRenderer handguard10_r5;
	private final ModelRenderer handguard9_r7;
	private final ModelRenderer handguard8_r7;
	private final ModelRenderer handguard19_r4;
	private final ModelRenderer handguard18_r4;
	private final ModelRenderer handguard18_r5;
	private final ModelRenderer handguard17_r2;
	private final ModelRenderer handguard5_r1;
	private final ModelRenderer handguard4_r1;
	private final ModelRenderer handguard15_r1;
	private final ModelRenderer grip;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip3_r2;
	private final ModelRenderer grip4_r1;
	private final ModelRenderer grip5_r1;
	private final ModelRenderer grip13_r1;

	public M4A1() {
		textureWidth = 200;
		textureHeight = 200;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 72, 56, -1.8F, -37.8F, -67.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 67, -1.8F, -37.8F, -62.0F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 42, -1.8F, -37.8F, -53.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 62, -2.2F, -37.8F, -67.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 61, -2.2F, -37.8F, -62.0F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 51, -2.2F, -37.8F, -53.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 14, -2.2F, -38.2F, -67.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 61, -2.2F, -38.2F, -62.0F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 61, -2.2F, -38.2F, -53.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 25, -1.8F, -38.2F, -67.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 67, -1.8F, -38.2F, -62.0F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 9, -1.8F, -38.2F, -53.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 31, -1.6F, -38.0F, -67.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 71, -1.6F, -38.0F, -62.0F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 0, -1.6F, -38.0F, -53.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 35, 86, -2.4F, -38.0F, -67.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 61, -2.4F, -38.0F, -62.0F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 63, 0, -2.4F, -38.0F, -53.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 43, -2.0F, -37.6F, -67.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 67, -2.0F, -37.6F, -62.0F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 51, -2.0F, -37.6F, -53.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 49, -2.0F, -38.4F, -67.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 31, -2.0F, -38.4F, -62.0F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 63, 9, -2.0F, -38.4F, -53.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -2.2F, -38.0F, -62.499F, 1, 1, 41, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 42, -1.8F, -38.0F, -62.501F, 1, 1, 41, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 1, -2.0F, -37.8F, -62.5F, 1, 1, 41, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 43, -2.0F, -38.2F, -62.5F, 1, 1, 41, 0.0F, false));
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

		receiver = new ModelRenderer(this);
		receiver.setRotationPoint(0.0F, 24.0F, 0.0F);
		receiver.cubeList.add(new ModelBox(receiver, 32, 80, -2.0F, -40.3F, -1.0F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 86, 74, -2.502F, -40.2F, -2.0F, 2, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 86, 72, -2.501F, -40.101F, -22.7F, 2, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 26, 85, -2.5F, -40.1F, -22.0F, 2, 1, 21, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 33, 100, -1.401F, -39.301F, -22.701F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 86, 70, -2.601F, -39.301F, -22.702F, 2, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 49, 79, -0.6F, -38.85F, -18.5F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 12, 100, -0.599F, -38.85F, -19.0F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 103, 109, -1.4F, -39.3F, -22.0F, 1, 1, 23, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 102, 85, -2.6F, -39.3F, -22.0F, 1, 1, 23, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 92, 96, -2.0F, -38.8F, -23.699F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 88, 96, -2.0F, -37.2F, -23.699F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 37, 100, -4.3F, -37.4F, -21.0F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 100, -4.3F, -37.4F, -12.0F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 74, 49, -2.5F, -37.001F, -22.701F, 2, 2, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 51, 85, -0.6F, -37.1F, -21.201F, 1, 2, 10, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 50, 85, -0.8F, -37.0F, -22.698F, 1, 2, 24, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 62, 43, -3.4F, -37.1F, -21.201F, 1, 2, 10, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 84, -3.2F, -37.0F, -22.699F, 1, 2, 24, 0.0F, false));

		gun263_r1 = new ModelRenderer(this);
		gun263_r1.setRotationPoint(-4.3F, -37.4F, -21.0F);
		receiver.addChild(gun263_r1);
		setRotationAngle(gun263_r1, 0.0F, 0.0F, -0.3491F);
		gun263_r1.cubeList.add(new ModelBox(gun263_r1, 99, 51, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));
		gun263_r1.cubeList.add(new ModelBox(gun263_r1, 51, 99, 0.0F, 0.0F, 8.999F, 1, 1, 1, 0.0F, false));

		gun263_r2 = new ModelRenderer(this);
		gun263_r2.setRotationPoint(-3.8F, -37.5F, -21.0F);
		receiver.addChild(gun263_r2);
		setRotationAngle(gun263_r2, 0.0F, 0.0F, 0.4014F);
		gun263_r2.cubeList.add(new ModelBox(gun263_r2, 67, 99, 0.0F, -0.7F, 0.0F, 1, 1, 1, 0.0F, false));
		gun263_r2.cubeList.add(new ModelBox(gun263_r2, 63, 99, -0.001F, -1.22F, -0.001F, 1, 1, 1, 0.0F, false));
		gun263_r2.cubeList.add(new ModelBox(gun263_r2, 59, 99, 0.0F, -0.7F, 9.0F, 1, 1, 1, 0.0F, false));
		gun263_r2.cubeList.add(new ModelBox(gun263_r2, 99, 57, -0.001F, -1.22F, 8.999F, 1, 1, 1, 0.0F, false));

		gun264_r1 = new ModelRenderer(this);
		gun264_r1.setRotationPoint(-3.32F, -38.62F, -21.0F);
		receiver.addChild(gun264_r1);
		setRotationAngle(gun264_r1, 0.0F, 0.0F, 0.8203F);
		gun264_r1.cubeList.add(new ModelBox(gun264_r1, 99, 59, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun264_r1.cubeList.add(new ModelBox(gun264_r1, 20, 0, -0.101F, -1.1F, 0.5F, 1, 1, 9, -0.1F, false));
		gun264_r1.cubeList.add(new ModelBox(gun264_r1, 55, 99, 0.0F, -1.0F, 9.0F, 1, 1, 1, 0.0F, false));

		gun264_r2 = new ModelRenderer(this);
		gun264_r2.setRotationPoint(-4.5F, -36.8F, -22.4F);
		receiver.addChild(gun264_r2);
		setRotationAngle(gun264_r2, 0.0F, 0.0F, -0.9295F);
		gun264_r2.cubeList.add(new ModelBox(gun264_r2, 75, 77, 0.0F, 0.0F, 5.35F, 1, 1, 2, -0.2F, false));
		gun264_r2.cubeList.add(new ModelBox(gun264_r2, 58, 61, 0.0F, 0.0F, 0.0F, 1, 1, 12, -0.3F, false));

		gun143_r1 = new ModelRenderer(this);
		gun143_r1.setRotationPoint(-4.7F, -38.0F, 0.5F);
		receiver.addChild(gun143_r1);
		setRotationAngle(gun143_r1, 0.0F, -0.2603F, 0.0F);
		gun143_r1.cubeList.add(new ModelBox(gun143_r1, 75, 37, -0.5F, -0.5F, 1.4F, 2, 2, 1, -0.4F, false));
		gun143_r1.cubeList.add(new ModelBox(gun143_r1, 51, 85, 0.0F, 0.0F, -0.1F, 1, 1, 2, 0.0F, false));

		gun140_r1 = new ModelRenderer(this);
		gun140_r1.setRotationPoint(-3.1F, -37.8F, -6.0F);
		receiver.addChild(gun140_r1);
		setRotationAngle(gun140_r1, 0.0F, -0.2603F, 0.0F);
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 64, 74, -0.01F, 0.0F, 0.0F, 2, 1, 7, 0.0F, false));
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 20, 29, -0.011F, -0.4F, -0.001F, 2, 1, 7, 0.0F, false));

		receiver18_r2 = new ModelRenderer(this);
		receiver18_r2.setRotationPoint(-2.6F, -39.25F, 1.0F);
		receiver.addChild(receiver18_r2);
		setRotationAngle(receiver18_r2, 0.0F, 0.0F, -0.8029F);
		receiver18_r2.cubeList.add(new ModelBox(receiver18_r2, 8, 100, -0.9F, 0.0F, -0.4F, 1, 1, 1, 0.0F, false));

		receiver17_r5 = new ModelRenderer(this);
		receiver17_r5.setRotationPoint(-0.4F, -39.25F, 1.0F);
		receiver.addChild(receiver17_r5);
		setRotationAngle(receiver17_r5, 0.0F, 0.0F, 0.8029F);
		receiver17_r5.cubeList.add(new ModelBox(receiver17_r5, 100, 18, -0.1F, 0.0F, -0.4F, 1, 1, 1, 0.0F, false));

		receiver14_r4 = new ModelRenderer(this);
		receiver14_r4.setRotationPoint(-3.6F, -37.5F, -11.7F);
		receiver.addChild(receiver14_r4);
		setRotationAngle(receiver14_r4, 0.0F, 0.0F, -0.4014F);
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 86, 68, 0.0F, 0.0F, 0.001F, 1, 1, 13, 0.0F, false));
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 62, 19, -0.4F, -0.2F, -8.999F, 1, 2, 10, -0.4F, false));
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 78, 20, 0.0F, 0.0F, -10.998F, 1, 1, 2, 0.0F, false));

		receiver14_r5 = new ModelRenderer(this);
		receiver14_r5.setRotationPoint(-3.2F, -37.5F, -23.7F);
		receiver.addChild(receiver14_r5);
		setRotationAngle(receiver14_r5, 0.0F, 0.0F, -0.4014F);
		receiver14_r5.cubeList.add(new ModelBox(receiver14_r5, 97, 19, 0.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver13_r1 = new ModelRenderer(this);
		receiver13_r1.setRotationPoint(0.2F, -37.5F, -23.7F);
		receiver.addChild(receiver13_r1);
		setRotationAngle(receiver13_r1, 0.0F, 0.0F, 0.4014F);
		receiver13_r1.cubeList.add(new ModelBox(receiver13_r1, 97, 39, -1.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver12_r1 = new ModelRenderer(this);
		receiver12_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
		receiver.addChild(receiver12_r1);
		setRotationAngle(receiver12_r1, 0.0F, 0.0F, 0.4014F);
		receiver12_r1.cubeList.add(new ModelBox(receiver12_r1, 86, 43, -1.0F, 0.0F, 0.001F, 1, 1, 24, 0.0F, false));

		receiver15_r6 = new ModelRenderer(this);
		receiver15_r6.setRotationPoint(-3.7F, -37.5F, 0.6F);
		receiver.addChild(receiver15_r6);
		setRotationAngle(receiver15_r6, -0.925F, 0.0F, -0.3142F);
		receiver15_r6.cubeList.add(new ModelBox(receiver15_r6, 79, 55, 0.001F, 0.3F, 0.5F, 1, 2, 1, 0.0F, false));

		receiver14_r6 = new ModelRenderer(this);
		receiver14_r6.setRotationPoint(0.7F, -37.5F, 0.6F);
		receiver.addChild(receiver14_r6);
		setRotationAngle(receiver14_r6, -0.925F, 0.0F, 0.3142F);
		receiver14_r6.cubeList.add(new ModelBox(receiver14_r6, 79, 62, -0.999F, 0.3F, 0.5F, 1, 2, 1, 0.0F, false));

		receiver14_r7 = new ModelRenderer(this);
		receiver14_r7.setRotationPoint(-3.7F, -37.5F, 0.6F);
		receiver.addChild(receiver14_r7);
		setRotationAngle(receiver14_r7, 0.0F, 0.0F, -0.3142F);
		receiver14_r7.cubeList.add(new ModelBox(receiver14_r7, 79, 31, 0.0F, 0.0F, 0.001F, 1, 2, 1, 0.0F, false));

		receiver13_r2 = new ModelRenderer(this);
		receiver13_r2.setRotationPoint(0.7F, -37.5F, 0.6F);
		receiver.addChild(receiver13_r2);
		setRotationAngle(receiver13_r2, 0.0F, 0.0F, 0.3142F);
		receiver13_r2.cubeList.add(new ModelBox(receiver13_r2, 80, 5, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver13_r3 = new ModelRenderer(this);
		receiver13_r3.setRotationPoint(0.7F, -37.5F, 0.6F);
		receiver.addChild(receiver13_r3);
		setRotationAngle(receiver13_r3, 0.0F, 0.0F, -0.4014F);
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 20, 100, -0.999F, -1.2F, 0.001F, 1, 1, 1, 0.0F, false));
		receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 100, 20, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver14_r8 = new ModelRenderer(this);
		receiver14_r8.setRotationPoint(-3.7F, -37.5F, 0.6F);
		receiver.addChild(receiver14_r8);
		setRotationAngle(receiver14_r8, 0.0F, 0.0F, 0.4014F);
		receiver14_r8.cubeList.add(new ModelBox(receiver14_r8, 4, 100, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver14_r8.cubeList.add(new ModelBox(receiver14_r8, 100, 11, -0.001F, -1.2F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r9 = new ModelRenderer(this);
		receiver14_r9.setRotationPoint(-2.3F, -38.8F, -11.7F);
		receiver.addChild(receiver14_r9);
		setRotationAngle(receiver14_r9, 0.0F, 0.0F, -0.4014F);
		receiver14_r9.cubeList.add(new ModelBox(receiver14_r9, 101, 69, -1.0F, 0.0F, 0.001F, 1, 1, 13, 0.0F, false));
		receiver14_r9.cubeList.add(new ModelBox(receiver14_r9, 78, 23, -1.0F, 0.0F, -10.999F, 1, 1, 2, 0.0F, false));

		receiver15_r7 = new ModelRenderer(this);
		receiver15_r7.setRotationPoint(-1.9F, -36.2F, -23.7F);
		receiver.addChild(receiver15_r7);
		setRotationAngle(receiver15_r7, 0.0F, 0.0F, 0.4014F);
		receiver15_r7.cubeList.add(new ModelBox(receiver15_r7, 96, 96, -1.0F, -1.0F, -0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r10 = new ModelRenderer(this);
		receiver14_r10.setRotationPoint(-1.1F, -36.2F, -23.7F);
		receiver.addChild(receiver14_r10);
		setRotationAngle(receiver14_r10, 0.0F, 0.0F, -0.4014F);
		receiver14_r10.cubeList.add(new ModelBox(receiver14_r10, 30, 97, 0.0F, -1.0F, -0.001F, 1, 1, 1, 0.0F, false));

		receiver14_r11 = new ModelRenderer(this);
		receiver14_r11.setRotationPoint(-1.9F, -38.8F, -23.7F);
		receiver.addChild(receiver14_r11);
		setRotationAngle(receiver14_r11, 0.0F, 0.0F, -0.4014F);
		receiver14_r11.cubeList.add(new ModelBox(receiver14_r11, 97, 21, -1.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver13_r4 = new ModelRenderer(this);
		receiver13_r4.setRotationPoint(-1.1F, -38.8F, -23.7F);
		receiver.addChild(receiver13_r4);
		setRotationAngle(receiver13_r4, 0.0F, 0.0F, 0.4014F);
		receiver13_r4.cubeList.add(new ModelBox(receiver13_r4, 51, 97, 0.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		receiver12_r2 = new ModelRenderer(this);
		receiver12_r2.setRotationPoint(-0.7F, -38.8F, -22.7F);
		receiver.addChild(receiver12_r2);
		setRotationAngle(receiver12_r2, 0.0F, 0.0F, 0.4014F);
		receiver12_r2.cubeList.add(new ModelBox(receiver12_r2, 86, 0, 0.0F, 0.0F, 0.001F, 1, 1, 24, 0.0F, false));

		receiver13_r5 = new ModelRenderer(this);
		receiver13_r5.setRotationPoint(-3.6F, -37.5F, -11.7F);
		receiver.addChild(receiver13_r5);
		setRotationAngle(receiver13_r5, 0.0F, 0.0F, 0.4014F);
		receiver13_r5.cubeList.add(new ModelBox(receiver13_r5, 103, 25, 0.0F, -1.0F, 0.0F, 1, 1, 13, 0.0F, false));
		receiver13_r5.cubeList.add(new ModelBox(receiver13_r5, 78, 26, 0.0F, -1.0F, -11.0F, 1, 1, 2, 0.0F, false));

		receiver13_r6 = new ModelRenderer(this);
		receiver13_r6.setRotationPoint(-3.2F, -37.5F, -23.7F);
		receiver.addChild(receiver13_r6);
		setRotationAngle(receiver13_r6, 0.0F, 0.0F, 0.4014F);
		receiver13_r6.cubeList.add(new ModelBox(receiver13_r6, 26, 97, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver12_r3 = new ModelRenderer(this);
		receiver12_r3.setRotationPoint(0.2F, -37.5F, -23.7F);
		receiver.addChild(receiver12_r3);
		setRotationAngle(receiver12_r3, 0.0F, 0.0F, -0.4014F);
		receiver12_r3.cubeList.add(new ModelBox(receiver12_r3, 97, 48, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver11_r1 = new ModelRenderer(this);
		receiver11_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
		receiver.addChild(receiver11_r1);
		setRotationAngle(receiver11_r1, 0.0F, 0.0F, -0.4014F);
		receiver11_r1.cubeList.add(new ModelBox(receiver11_r1, 76, 87, -1.0F, -1.0F, 0.0F, 1, 1, 24, 0.0F, false));

		receiver16_r7 = new ModelRenderer(this);
		receiver16_r7.setRotationPoint(0.4F, -38.85F, -19.0F);
		receiver.addChild(receiver16_r7);
		setRotationAngle(receiver16_r7, 0.0F, 0.0F, 1.9705F);
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 16, 100, 0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 55, 79, 0.0F, 0.0F, 0.5F, 1, 1, 2, 0.0F, false));

		receiver18_r3 = new ModelRenderer(this);
		receiver18_r3.setRotationPoint(0.4F, -38.85F, -19.0F);
		receiver.addChild(receiver18_r3);
		setRotationAngle(receiver18_r3, 0.0F, -1.9333F, 0.0F);
		receiver18_r3.cubeList.add(new ModelBox(receiver18_r3, 80, 47, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver17_r6 = new ModelRenderer(this);
		receiver17_r6.setRotationPoint(0.4F, -38.85F, -16.5F);
		receiver.addChild(receiver17_r6);
		setRotationAngle(receiver17_r6, 0.0F, 1.9333F, 0.0F);
		receiver17_r6.cubeList.add(new ModelBox(receiver17_r6, 80, 76, 0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun125_r1 = new ModelRenderer(this);
		gun125_r1.setRotationPoint(-2.5F, -40.1F, -1.0F);
		receiver.addChild(gun125_r1);
		setRotationAngle(gun125_r1, -0.632F, 0.0F, 0.0F);
		gun125_r1.cubeList.add(new ModelBox(gun125_r1, 72, 68, -0.001F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(-3.5F, -39.25F, -10.3F);
		receiver.addChild(gun170);
		setRotationAngle(gun170, 0.0F, 0.0F, -0.0524F);
		gun170.cubeList.add(new ModelBox(gun170, 73, 3, -1.3F, -0.001F, 0.0F, 3, 2, 1, 0.0F, false));

		gun172_r1 = new ModelRenderer(this);
		gun172_r1.setRotationPoint(-1.3F, -0.05F, 1.0F);
		gun170.addChild(gun172_r1);
		setRotationAngle(gun172_r1, 0.0F, -0.2618F, 0.0F);
		gun172_r1.cubeList.add(new ModelBox(gun172_r1, 62, 31, 0.0F, 0.05F, -1.0F, 3, 2, 1, 0.0F, false));

		gun172_r2 = new ModelRenderer(this);
		gun172_r2.setRotationPoint(-1.3F, -0.05F, 0.0F);
		gun170.addChild(gun172_r2);
		setRotationAngle(gun172_r2, 0.0F, -0.9076F, 0.0F);
		gun172_r2.cubeList.add(new ModelBox(gun172_r2, 79, 58, 1.0F, 0.05F, -2.0F, 1, 2, 1, 0.0F, false));
		gun172_r2.cubeList.add(new ModelBox(gun172_r2, 43, 9, 0.0F, 0.05F, -3.0F, 1, 2, 3, 0.0F, false));

		gun264 = new ModelRenderer(this);
		gun264.setRotationPoint(-3.7F, -34.2F, -20.0F);
		receiver.addChild(gun264);
		setRotationAngle(gun264, 0.0F, 0.0F, 0.1578F);
		gun264.cubeList.add(new ModelBox(gun264, 0, 19, -1.0F, -3.0F, -0.3F, 1, 3, 8, -0.3F, false));
		gun264.cubeList.add(new ModelBox(gun264, 30, 42, -0.85F, -2.7F, 0.25F, 1, 2, 3, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 33, 19, -0.85F, -2.7F, 4.65F, 1, 2, 3, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 99, 45, -1.0F, -1.3F, 3.45F, 1, 1, 1, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 99, 43, -1.001F, -1.7F, 3.449F, 1, 1, 1, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 0, 30, -1.0F, -3.0F, 7.1F, 1, 3, 1, -0.3F, false));
		gun264.cubeList.add(new ModelBox(gun264, 0, 0, -1.001F, -3.001F, 7.3F, 1, 3, 1, -0.3F, false));

		action = new ModelRenderer(this);
		action.setRotationPoint(0.1F, 24.0F, 2.0F);
		

		receiver16_r8 = new ModelRenderer(this);
		receiver16_r8.setRotationPoint(-2.3F, -38.8F, -15.0F);
		action.addChild(receiver16_r8);
		setRotationAngle(receiver16_r8, 0.0F, 0.0F, -0.4014F);
		receiver16_r8.cubeList.add(new ModelBox(receiver16_r8, 96, 98, -1.0F, -0.001F, 0.001F, 1, 1, 1, 0.0F, false));
		receiver16_r8.cubeList.add(new ModelBox(receiver16_r8, 99, 9, -1.0F, -0.001F, -5.499F, 1, 1, 1, 0.0F, false));
		receiver16_r8.cubeList.add(new ModelBox(receiver16_r8, 75, 74, -1.0F, 0.0F, -1.499F, 1, 1, 2, 0.0F, false));
		receiver16_r8.cubeList.add(new ModelBox(receiver16_r8, 11, 76, -1.0F, 0.0F, -6.999F, 1, 1, 2, 0.0F, false));

		receiver16_r9 = new ModelRenderer(this);
		receiver16_r9.setRotationPoint(-3.6F, -37.5F, -16.5F);
		action.addChild(receiver16_r9);
		setRotationAngle(receiver16_r9, 0.0F, 0.0F, -0.4014F);
		receiver16_r9.cubeList.add(new ModelBox(receiver16_r9, 99, 13, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver16_r9.cubeList.add(new ModelBox(receiver16_r9, 77, 13, 0.0F, 0.0F, 0.5F, 1, 1, 2, 0.0F, false));
		receiver16_r9.cubeList.add(new ModelBox(receiver16_r9, 26, 99, -0.001F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		receiver16_r9.cubeList.add(new ModelBox(receiver16_r9, 27, 77, 0.0F, 0.0F, -5.5F, 1, 1, 2, 0.0F, false));

		receiver15_r8 = new ModelRenderer(this);
		receiver15_r8.setRotationPoint(-3.6F, -37.5F, -16.5F);
		action.addChild(receiver15_r8);
		setRotationAngle(receiver15_r8, 0.0F, 0.0F, 0.4014F);
		receiver15_r8.cubeList.add(new ModelBox(receiver15_r8, 99, 16, -0.001F, -1.0F, -0.001F, 1, 1, 1, 0.0F, false));
		receiver15_r8.cubeList.add(new ModelBox(receiver15_r8, 15, 77, 0.0F, -1.0F, 0.5F, 1, 1, 2, 0.0F, false));
		receiver15_r8.cubeList.add(new ModelBox(receiver15_r8, 30, 99, -0.001F, -1.0F, -4.001F, 1, 1, 1, 0.0F, false));
		receiver15_r8.cubeList.add(new ModelBox(receiver15_r8, 33, 77, 0.0F, -1.0F, -5.5F, 1, 1, 2, 0.0F, false));

		receiver16_r10 = new ModelRenderer(this);
		receiver16_r10.setRotationPoint(-3.5F, -37.3F, -19.5F);
		action.addChild(receiver16_r10);
		setRotationAngle(receiver16_r10, 0.0F, 0.0F, 0.4014F);
		receiver16_r10.cubeList.add(new ModelBox(receiver16_r10, 63, 9, 0.0F, -1.3F, -0.001F, 1, 1, 3, 0.0F, false));
		receiver16_r10.cubeList.add(new ModelBox(receiver16_r10, 63, 13, -0.001F, -1.0F, -0.001F, 1, 1, 3, 0.0F, false));

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.9F, -12.5F, -45.5F);
		handguard.cubeList.add(new ModelBox(handguard, 49, 19, -3.9F, -2.5F, -0.25F, 3, 3, 1, 0.1F, false));

		handguard206_r1 = new ModelRenderer(this);
		handguard206_r1.setRotationPoint(-0.3F, -0.5F, 19.5F);
		handguard.addChild(handguard206_r1);
		setRotationAngle(handguard206_r1, -0.0349F, 0.096F, 0.4538F);
		handguard206_r1.cubeList.add(new ModelBox(handguard206_r1, 20, 51, -0.999F, 0.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard205_r1 = new ModelRenderer(this);
		handguard205_r1.setRotationPoint(-4.5F, -0.5F, 19.5F);
		handguard.addChild(handguard205_r1);
		setRotationAngle(handguard205_r1, -0.0349F, -0.096F, -0.4538F);
		handguard205_r1.cubeList.add(new ModelBox(handguard205_r1, 53, 13, -0.001F, 0.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard204_r1 = new ModelRenderer(this);
		handguard204_r1.setRotationPoint(-4.5F, -1.5F, 19.5F);
		handguard.addChild(handguard204_r1);
		setRotationAngle(handguard204_r1, 0.0349F, -0.096F, 0.4538F);
		handguard204_r1.cubeList.add(new ModelBox(handguard204_r1, 20, 55, -0.001F, -1.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r1 = new ModelRenderer(this);
		handguard203_r1.setRotationPoint(-0.3F, -1.5F, 19.5F);
		handguard.addChild(handguard203_r1);
		setRotationAngle(handguard203_r1, 0.0349F, 0.096F, -0.4538F);
		handguard203_r1.cubeList.add(new ModelBox(handguard203_r1, 30, 61, -0.999F, -1.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard205_r2 = new ModelRenderer(this);
		handguard205_r2.setRotationPoint(-0.3F, -0.5F, 19.5F);
		handguard.addChild(handguard205_r2);
		setRotationAngle(handguard205_r2, 0.0436F, 0.096F, 0.4538F);
		handguard205_r2.cubeList.add(new ModelBox(handguard205_r2, 53, 0, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard204_r2 = new ModelRenderer(this);
		handguard204_r2.setRotationPoint(-4.5F, -0.5F, 19.5F);
		handguard.addChild(handguard204_r2);
		setRotationAngle(handguard204_r2, 0.0436F, -0.096F, -0.4538F);
		handguard204_r2.cubeList.add(new ModelBox(handguard204_r2, 53, 36, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard203_r2 = new ModelRenderer(this);
		handguard203_r2.setRotationPoint(-4.5F, -1.5F, 19.5F);
		handguard.addChild(handguard203_r2);
		setRotationAngle(handguard203_r2, -0.0436F, -0.096F, 0.4538F);
		handguard203_r2.cubeList.add(new ModelBox(handguard203_r2, 10, 55, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard202_r1 = new ModelRenderer(this);
		handguard202_r1.setRotationPoint(-0.3F, -1.5F, 19.5F);
		handguard.addChild(handguard202_r1);
		setRotationAngle(handguard202_r1, -0.0436F, 0.096F, -0.4538F);
		handguard202_r1.cubeList.add(new ModelBox(handguard202_r1, 62, 43, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard202_r2 = new ModelRenderer(this);
		handguard202_r2.setRotationPoint(-4.5F, -0.5F, 19.5F);
		handguard.addChild(handguard202_r2);
		setRotationAngle(handguard202_r2, 0.0F, -0.1047F, 0.0F);
		handguard202_r2.cubeList.add(new ModelBox(handguard202_r2, 0, 55, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard201_r1 = new ModelRenderer(this);
		handguard201_r1.setRotationPoint(-0.3F, -0.5F, 19.5F);
		handguard.addChild(handguard201_r1);
		setRotationAngle(handguard201_r1, 0.0F, 0.1047F, 0.0F);
		handguard201_r1.cubeList.add(new ModelBox(handguard201_r1, 62, 47, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard200_r1 = new ModelRenderer(this);
		handguard200_r1.setRotationPoint(-2.9F, 1.1F, 19.5F);
		handguard.addChild(handguard200_r1);
		setRotationAngle(handguard200_r1, -0.1047F, 0.0F, 0.0F);
		handguard200_r1.cubeList.add(new ModelBox(handguard200_r1, 63, 0, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard204_r3 = new ModelRenderer(this);
		handguard204_r3.setRotationPoint(-1.9F, 1.1F, 19.5F);
		handguard.addChild(handguard204_r3);
		setRotationAngle(handguard204_r3, -0.0925F, 0.0349F, -0.4538F);
		handguard204_r3.cubeList.add(new ModelBox(handguard204_r3, 10, 51, 0.2F, -1.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r3 = new ModelRenderer(this);
		handguard203_r3.setRotationPoint(-2.9F, 1.1F, 19.5F);
		handguard.addChild(handguard203_r3);
		setRotationAngle(handguard203_r3, -0.0925F, -0.0349F, 0.4538F);
		handguard203_r3.cubeList.add(new ModelBox(handguard203_r3, 53, 9, -1.2F, -1.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard202_r3 = new ModelRenderer(this);
		handguard202_r3.setRotationPoint(-2.9F, -3.1F, 19.5F);
		handguard.addChild(handguard202_r3);
		setRotationAngle(handguard202_r3, 0.0925F, -0.0349F, -0.4538F);
		handguard202_r3.cubeList.add(new ModelBox(handguard202_r3, 58, 37, -1.2F, 0.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard201_r2 = new ModelRenderer(this);
		handguard201_r2.setRotationPoint(-1.9F, -3.1F, 19.5F);
		handguard.addChild(handguard201_r2);
		setRotationAngle(handguard201_r2, 0.0925F, 0.0349F, 0.4538F);
		handguard201_r2.cubeList.add(new ModelBox(handguard201_r2, 62, 19, 0.2F, 0.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r4 = new ModelRenderer(this);
		handguard203_r4.setRotationPoint(-1.9F, 1.1F, 19.5F);
		handguard.addChild(handguard203_r4);
		setRotationAngle(handguard203_r4, -0.0925F, -0.0524F, -0.4538F);
		handguard203_r4.cubeList.add(new ModelBox(handguard203_r4, 0, 51, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard202_r4 = new ModelRenderer(this);
		handguard202_r4.setRotationPoint(-2.9F, 1.1F, 19.5F);
		handguard.addChild(handguard202_r4);
		setRotationAngle(handguard202_r4, -0.0925F, 0.0524F, 0.4538F);
		handguard202_r4.cubeList.add(new ModelBox(handguard202_r4, 53, 4, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard201_r3 = new ModelRenderer(this);
		handguard201_r3.setRotationPoint(-2.9F, -3.1F, 19.5F);
		handguard.addChild(handguard201_r3);
		setRotationAngle(handguard201_r3, 0.0925F, 0.0524F, -0.4538F);
		handguard201_r3.cubeList.add(new ModelBox(handguard201_r3, 20, 61, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard200_r2 = new ModelRenderer(this);
		handguard200_r2.setRotationPoint(-1.9F, -3.1F, 19.5F);
		handguard.addChild(handguard200_r2);
		setRotationAngle(handguard200_r2, 0.0925F, -0.0524F, 0.4538F);
		handguard200_r2.cubeList.add(new ModelBox(handguard200_r2, 62, 23, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard199_r1 = new ModelRenderer(this);
		handguard199_r1.setRotationPoint(-2.9F, -3.1F, 19.5F);
		handguard.addChild(handguard199_r1);
		setRotationAngle(handguard199_r1, 0.1047F, 0.0F, 0.0F);
		handguard199_r1.cubeList.add(new ModelBox(handguard199_r1, 63, 4, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard9_r1 = new ModelRenderer(this);
		handguard9_r1.setRotationPoint(-3.4F, 76.6F, 0.0F);
		handguard.addChild(handguard9_r1);
		setRotationAngle(handguard9_r1, -0.0175F, 0.0F, 0.0F);
		handguard9_r1.cubeList.add(new ModelBox(handguard9_r1, 74, 22, 1.3F, -75.7F, 17.5F, 1, 1, 2, -0.3F, false));
		handguard9_r1.cubeList.add(new ModelBox(handguard9_r1, 112, 0, 1.299F, -75.699F, -1.6F, 1, 1, 20, -0.3F, false));
		handguard9_r1.cubeList.add(new ModelBox(handguard9_r1, 74, 25, -0.3F, -75.7F, 17.5F, 1, 1, 2, -0.3F, false));
		handguard9_r1.cubeList.add(new ModelBox(handguard9_r1, 112, 25, -0.301F, -75.699F, -1.6F, 1, 1, 20, -0.3F, false));

		handguard8_r1 = new ModelRenderer(this);
		handguard8_r1.setRotationPoint(-3.4F, -3.6F, 0.0F);
		handguard.addChild(handguard8_r1);
		setRotationAngle(handguard8_r1, 0.0175F, 0.0F, 0.0F);
		handguard8_r1.cubeList.add(new ModelBox(handguard8_r1, 74, 43, 1.3F, -0.3F, 18.8F, 1, 1, 2, -0.3F, false));
		handguard8_r1.cubeList.add(new ModelBox(handguard8_r1, 112, 46, 1.299F, -0.301F, -0.3F, 1, 1, 20, -0.3F, false));
		handguard8_r1.cubeList.add(new ModelBox(handguard8_r1, 74, 46, -0.3F, -0.3F, 18.8F, 1, 1, 2, -0.3F, false));
		handguard8_r1.cubeList.add(new ModelBox(handguard8_r1, 152, 152, -0.301F, -0.301F, -0.3F, 1, 1, 20, -0.3F, false));

		handguard14_r1 = new ModelRenderer(this);
		handguard14_r1.setRotationPoint(-3.4F, 76.5F, 0.0F);
		handguard.addChild(handguard14_r1);
		setRotationAngle(handguard14_r1, -0.0175F, 0.0F, 0.0F);
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 20, 34, -0.001F, -76.0F, 18.2F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 43, 5, -0.001F, -75.999F, 16.7F, 2, 1, 2, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 43, 32, -0.001F, -75.999F, 14.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 26, 70, -0.001F, -75.999F, 8.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 73, 6, -0.001F, -75.999F, 2.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 30, 57, -0.001F, -75.999F, 12.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 50, 70, -0.001F, -75.999F, 6.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 63, 79, -0.001F, -75.999F, 0.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 50, 64, -0.001F, -75.999F, 10.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 72, 71, -0.001F, -75.999F, 4.7F, 2, 1, 1, 0.0F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 0, 0, 1.2F, -75.8F, -0.8F, 1, 1, 18, -0.2F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 0, 19, -0.2F, -75.8F, -0.8F, 1, 1, 18, -0.2F, false));
		handguard14_r1.cubeList.add(new ModelBox(handguard14_r1, 36, 84, -0.001F, -75.999F, -1.3F, 2, 1, 1, 0.0F, false));

		handguard13_r1 = new ModelRenderer(this);
		handguard13_r1.setRotationPoint(-3.4F, -3.5F, 0.0F);
		handguard.addChild(handguard13_r1);
		setRotationAngle(handguard13_r1, 0.0175F, 0.0F, 0.0F);
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 55, 85, -0.001F, 0.0F, 19.5F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 43, 14, -0.001F, -0.001F, 18.0F, 2, 1, 2, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 86, 0, -0.001F, -0.001F, 16.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 86, 20, -0.001F, -0.001F, 10.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 86, 22, -0.001F, -0.001F, 4.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 76, 85, -0.001F, -0.001F, 14.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 86, 4, -0.001F, -0.001F, 8.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 86, 38, -0.001F, -0.001F, 2.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 67, 85, -0.001F, -0.001F, 12.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 86, 2, -0.001F, -0.001F, 6.0F, 2, 1, 1, 0.0F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 0, 42, 1.2F, -0.202F, 0.5F, 1, 1, 18, -0.2F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 43, 0, -0.2F, -0.202F, 0.5F, 1, 1, 18, -0.2F, false));
		handguard13_r1.cubeList.add(new ModelBox(handguard13_r1, 86, 40, -0.001F, -0.001F, 0.0F, 2, 1, 1, 0.0F, false));

		handguard10_r1 = new ModelRenderer(this);
		handguard10_r1.setRotationPoint(-3.4F, -3.5F, 0.0F);
		handguard.addChild(handguard10_r1);
		setRotationAngle(handguard10_r1, 0.0157F, -0.0044F, -0.5236F);
		handguard10_r1.cubeList.add(new ModelBox(handguard10_r1, 44, 134, -1.05F, -0.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard11_r1 = new ModelRenderer(this);
		handguard11_r1.setRotationPoint(-3.4F, 1.5F, 0.0F);
		handguard.addChild(handguard11_r1);
		setRotationAngle(handguard11_r1, -0.0157F, -0.0044F, 0.5236F);
		handguard11_r1.cubeList.add(new ModelBox(handguard11_r1, 127, 67, -1.05F, -0.999F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard10_r2 = new ModelRenderer(this);
		handguard10_r2.setRotationPoint(-1.4F, 1.5F, 0.0F);
		handguard.addChild(handguard10_r2);
		setRotationAngle(handguard10_r2, -0.0157F, 0.0044F, -0.5236F);
		handguard10_r2.cubeList.add(new ModelBox(handguard10_r2, 22, 133, 0.05F, -0.999F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard9_r2 = new ModelRenderer(this);
		handguard9_r2.setRotationPoint(-1.4F, -3.5F, 0.0F);
		handguard.addChild(handguard9_r2);
		setRotationAngle(handguard9_r2, 0.0157F, 0.0044F, 0.5236F);
		handguard9_r2.cubeList.add(new ModelBox(handguard9_r2, 149, 85, 0.05F, -0.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard9_r3 = new ModelRenderer(this);
		handguard9_r3.setRotationPoint(-3.4F, -3.5F, 0.0F);
		handguard.addChild(handguard9_r3);
		setRotationAngle(handguard9_r3, 0.014F, -0.0044F, -0.5236F);
		handguard9_r3.cubeList.add(new ModelBox(handguard9_r3, 70, 98, -1.05F, -0.002F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard10_r3 = new ModelRenderer(this);
		handguard10_r3.setRotationPoint(-3.4F, 1.5F, 0.0F);
		handguard.addChild(handguard10_r3);
		setRotationAngle(handguard10_r3, -0.014F, -0.0044F, 0.5236F);
		handguard10_r3.cubeList.add(new ModelBox(handguard10_r3, 55, 97, -1.05F, -0.998F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard9_r4 = new ModelRenderer(this);
		handguard9_r4.setRotationPoint(-1.4F, 1.5F, 0.0F);
		handguard.addChild(handguard9_r4);
		setRotationAngle(handguard9_r4, -0.014F, 0.0044F, -0.5236F);
		handguard9_r4.cubeList.add(new ModelBox(handguard9_r4, 33, 98, 0.05F, -0.998F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard20_r1 = new ModelRenderer(this);
		handguard20_r1.setRotationPoint(-3.4F, 1.6F, 0.0F);
		handguard.addChild(handguard20_r1);
		setRotationAngle(handguard20_r1, -0.014F, -0.0044F, 0.5236F);
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 88, 87, -1.15F, -1.012F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 0, 89, -1.15F, -1.012F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 20, 89, -1.15F, -1.012F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 54, 89, -1.15F, -1.012F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 76, 89, -1.15F, -1.012F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 89, 79, -1.15F, -1.012F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 51, 90, -1.15F, -1.012F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 57, 90, -1.15F, -1.012F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 91, 21, -1.15F, -1.012F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 30, 91, -1.15F, -1.012F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard19_r1 = new ModelRenderer(this);
		handguard19_r1.setRotationPoint(-1.4F, 1.6F, 0.0F);
		handguard.addChild(handguard19_r1);
		setRotationAngle(handguard19_r1, -0.014F, 0.0044F, -0.5236F);
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 91, 92, 0.15F, -1.012F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 93, 14, 0.15F, -1.012F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 26, 93, 0.15F, -1.012F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 93, 27, 0.15F, -1.012F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 93, 33, 0.15F, -1.012F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 93, 43, 0.15F, -1.012F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 93, 51, 0.15F, -1.012F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 54, 93, 0.15F, -1.012F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 66, 93, 0.15F, -1.012F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 76, 93, 0.15F, -1.012F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard19_r2 = new ModelRenderer(this);
		handguard19_r2.setRotationPoint(-3.4F, -3.6F, 0.0F);
		handguard.addChild(handguard19_r2);
		setRotationAngle(handguard19_r2, 0.014F, -0.0044F, -0.5236F);
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 79, 74, -1.15F, 0.012F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 80, 2, -1.15F, 0.012F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 80, 11, -1.15F, 0.012F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 80, 39, -1.15F, 0.012F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 80, 79, -1.15F, 0.012F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 82, 85, -1.15F, 0.012F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 86, 10, -1.15F, 0.012F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 86, 14, -1.15F, 0.012F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 86, 27, -1.15F, 0.012F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 86, 33, -1.15F, 0.012F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard18_r1 = new ModelRenderer(this);
		handguard18_r1.setRotationPoint(-1.4F, -3.6F, 0.0F);
		handguard.addChild(handguard18_r1);
		setRotationAngle(handguard18_r1, 0.014F, 0.0044F, 0.5236F);
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 93, 79, 0.15F, 0.012F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 80, 93, 0.15F, 0.012F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 88, 93, 0.15F, 0.012F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 94, 20, 0.15F, 0.012F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 94, 22, 0.15F, 0.012F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 33, 94, 0.15F, 0.012F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 37, 94, 0.15F, 0.012F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 94, 38, 0.15F, 0.012F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 94, 40, 0.15F, 0.012F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 41, 94, 0.15F, 0.012F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard8_r2 = new ModelRenderer(this);
		handguard8_r2.setRotationPoint(-1.4F, -3.5F, 0.0F);
		handguard.addChild(handguard8_r2);
		setRotationAngle(handguard8_r2, 0.014F, 0.0044F, 0.5236F);
		handguard8_r2.cubeList.add(new ModelBox(handguard8_r2, 98, 82, 0.05F, -0.002F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard8_r3 = new ModelRenderer(this);
		handguard8_r3.setRotationPoint(-3.4F, -3.5F, 0.0F);
		handguard.addChild(handguard8_r3);
		setRotationAngle(handguard8_r3, 0.014F, 0.0087F, -0.5236F);
		handguard8_r3.cubeList.add(new ModelBox(handguard8_r3, 76, 98, -1.001F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard9_r5 = new ModelRenderer(this);
		handguard9_r5.setRotationPoint(-3.4F, 1.5F, 0.0F);
		handguard.addChild(handguard9_r5);
		setRotationAngle(handguard9_r5, -0.014F, 0.0087F, 0.5236F);
		handguard9_r5.cubeList.add(new ModelBox(handguard9_r5, 97, 54, -1.001F, -0.999F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard8_r4 = new ModelRenderer(this);
		handguard8_r4.setRotationPoint(-1.4F, 1.5F, 0.0F);
		handguard.addChild(handguard8_r4);
		setRotationAngle(handguard8_r4, -0.014F, -0.0087F, -0.5236F);
		handguard8_r4.cubeList.add(new ModelBox(handguard8_r4, 67, 97, 0.001F, -0.999F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard19_r3 = new ModelRenderer(this);
		handguard19_r3.setRotationPoint(-3.4F, 1.6F, 1.0F);
		handguard.addChild(handguard19_r3);
		setRotationAngle(handguard19_r3, -0.014F, 0.0087F, 0.5236F);
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 88, 85, -1.001F, -0.999F, 18.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 4, 89, -1.001F, -0.999F, 16.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 16, 89, -1.001F, -0.999F, 14.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 66, 89, -1.001F, -0.999F, 12.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 70, 89, -1.001F, -0.999F, 10.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 80, 89, -1.001F, -0.999F, 8.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 88, 89, -1.001F, -0.999F, 6.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 63, 90, -1.001F, -0.999F, 4.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 90, 82, -1.001F, -0.999F, 2.0F, 1, 1, 1, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 26, 91, -1.001F, -0.999F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard18_r2 = new ModelRenderer(this);
		handguard18_r2.setRotationPoint(-1.4F, 1.6F, 1.0F);
		handguard.addChild(handguard18_r2);
		setRotationAngle(handguard18_r2, -0.014F, -0.0087F, -0.5236F);
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 63, 92, 0.001F, -0.999F, 18.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 93, 16, 0.001F, -0.999F, 16.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 93, 25, 0.001F, -0.999F, 14.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 30, 93, 0.001F, -0.999F, 12.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 93, 31, 0.001F, -0.999F, 10.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 93, 45, 0.001F, -0.999F, 8.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 93, 49, 0.001F, -0.999F, 6.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 93, 55, 0.001F, -0.999F, 4.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 93, 57, 0.001F, -0.999F, 2.0F, 1, 1, 1, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 70, 93, 0.001F, -0.999F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard18_r3 = new ModelRenderer(this);
		handguard18_r3.setRotationPoint(-3.4F, -3.6F, 1.0F);
		handguard.addChild(handguard18_r3);
		setRotationAngle(handguard18_r3, 0.014F, 0.0087F, -0.5236F);
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 79, 65, -1.001F, -0.001F, 18.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 80, 8, -1.001F, -0.001F, 16.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 80, 18, -1.001F, -0.001F, 14.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 36, 80, -1.001F, -0.001F, 12.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 4, 84, -1.001F, -0.001F, 10.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 20, 84, -1.001F, -0.001F, 8.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 86, 8, -1.001F, -0.001F, 6.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 86, 16, -1.001F, -0.001F, 4.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 86, 25, -1.001F, -0.001F, 2.0F, 1, 1, 1, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 86, 31, -1.001F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard17_r1 = new ModelRenderer(this);
		handguard17_r1.setRotationPoint(-1.4F, -3.6F, 1.0F);
		handguard.addChild(handguard17_r1);
		setRotationAngle(handguard17_r1, 0.014F, -0.0087F, 0.5236F);
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 94, 68, 0.001F, -0.001F, 18.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 94, 70, 0.001F, -0.001F, 16.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 94, 72, 0.001F, -0.001F, 14.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 94, 74, 0.001F, -0.001F, 12.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 94, 76, 0.001F, -0.001F, 10.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 94, 82, 0.001F, -0.001F, 8.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 94, 85, 0.001F, -0.001F, 6.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 94, 87, 0.001F, -0.001F, 4.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 94, 89, 0.001F, -0.001F, 2.0F, 1, 1, 1, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 94, 91, 0.001F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard7_r1 = new ModelRenderer(this);
		handguard7_r1.setRotationPoint(-1.4F, -3.5F, 0.0F);
		handguard.addChild(handguard7_r1);
		setRotationAngle(handguard7_r1, 0.014F, -0.0087F, 0.5236F);
		handguard7_r1.cubeList.add(new ModelBox(handguard7_r1, 98, 85, 0.001F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard7_r2 = new ModelRenderer(this);
		handguard7_r2.setRotationPoint(-3.4F, -3.5F, 0.0F);
		handguard.addChild(handguard7_r2);
		setRotationAngle(handguard7_r2, 0.0157F, 0.0087F, -0.5236F);
		handguard7_r2.cubeList.add(new ModelBox(handguard7_r2, 108, 134, -1.0F, 0.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard8_r5 = new ModelRenderer(this);
		handguard8_r5.setRotationPoint(-3.4F, 1.5F, 0.0F);
		handguard.addChild(handguard8_r5);
		setRotationAngle(handguard8_r5, -0.0157F, 0.0087F, 0.5236F);
		handguard8_r5.cubeList.add(new ModelBox(handguard8_r5, 64, 113, -1.0F, -1.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard7_r3 = new ModelRenderer(this);
		handguard7_r3.setRotationPoint(-1.4F, 1.5F, 0.0F);
		handguard.addChild(handguard7_r3);
		setRotationAngle(handguard7_r3, -0.0157F, -0.0087F, -0.5236F);
		handguard7_r3.cubeList.add(new ModelBox(handguard7_r3, 0, 132, 0.0F, -1.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard6_r1 = new ModelRenderer(this);
		handguard6_r1.setRotationPoint(-1.4F, -3.5F, 0.0F);
		handguard.addChild(handguard6_r1);
		setRotationAngle(handguard6_r1, 0.0157F, -0.0087F, 0.5236F);
		handguard6_r1.cubeList.add(new ModelBox(handguard6_r1, 150, 106, 0.0F, 0.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard7_r4 = new ModelRenderer(this);
		handguard7_r4.setRotationPoint(0.0F, -2.0F, 0.0F);
		handguard.addChild(handguard7_r4);
		setRotationAngle(handguard7_r4, 0.0F, 0.0175F, 0.0F);
		handguard7_r4.cubeList.add(new ModelBox(handguard7_r4, 42, 111, -1.0F, 0.0F, 0.5F, 1, 2, 20, 0.0F, false));
		handguard7_r4.cubeList.add(new ModelBox(handguard7_r4, 0, 76, -1.001F, -0.001F, 0.0F, 1, 2, 1, 0.0F, false));

		handguard8_r6 = new ModelRenderer(this);
		handguard8_r6.setRotationPoint(-4.8F, -2.0F, 0.0F);
		handguard.addChild(handguard8_r6);
		setRotationAngle(handguard8_r6, 0.0F, -0.0175F, 0.0F);
		handguard8_r6.cubeList.add(new ModelBox(handguard8_r6, 0, 110, -0.001F, 0.0F, 0.5F, 1, 2, 20, 0.0F, false));
		handguard8_r6.cubeList.add(new ModelBox(handguard8_r6, 72, 62, 0.0F, -0.001F, 0.0F, 1, 2, 1, 0.0F, false));

		handguard11_r2 = new ModelRenderer(this);
		handguard11_r2.setRotationPoint(-4.8F, -2.0F, 0.0F);
		handguard.addChild(handguard11_r2);
		setRotationAngle(handguard11_r2, 0.0044F, -0.0157F, 0.4712F);
		handguard11_r2.cubeList.add(new ModelBox(handguard11_r2, 134, 43, 0.0F, -1.1F, 0.5F, 1, 1, 20, 0.0F, false));
		handguard11_r2.cubeList.add(new ModelBox(handguard11_r2, 98, 65, -0.001F, -1.1F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard12_r1 = new ModelRenderer(this);
		handguard12_r1.setRotationPoint(-4.8F, 0.0F, 0.0F);
		handguard.addChild(handguard12_r1);
		setRotationAngle(handguard12_r1, -0.0044F, -0.0157F, -0.4712F);
		handguard12_r1.cubeList.add(new ModelBox(handguard12_r1, 131, 130, 0.0F, 0.1F, 0.5F, 1, 1, 20, 0.0F, false));
		handguard12_r1.cubeList.add(new ModelBox(handguard12_r1, 63, 97, -0.001F, 0.1F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard11_r3 = new ModelRenderer(this);
		handguard11_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard.addChild(handguard11_r3);
		setRotationAngle(handguard11_r3, -0.0044F, 0.0157F, 0.4712F);
		handguard11_r3.cubeList.add(new ModelBox(handguard11_r3, 134, 1, -1.0F, 0.1F, 0.5F, 1, 1, 20, 0.0F, false));
		handguard11_r3.cubeList.add(new ModelBox(handguard11_r3, 37, 98, -0.999F, 0.1F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard22_r1 = new ModelRenderer(this);
		handguard22_r1.setRotationPoint(-4.9F, 0.0F, 0.0F);
		handguard.addChild(handguard22_r1);
		setRotationAngle(handguard22_r1, -0.0044F, -0.0157F, -0.4712F);
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 63, 88, 0.0F, 0.15F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 42, 88, 0.0F, 0.15F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 76, 87, 0.0F, 0.15F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 20, 87, 0.0F, 0.15F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 16, 87, 0.0F, 0.15F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 86, 82, 0.0F, 0.15F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 86, 78, 0.0F, 0.15F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 86, 51, 0.0F, 0.15F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 86, 49, 0.0F, 0.15F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 36, 86, 0.0F, 0.15F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard21_r1 = new ModelRenderer(this);
		handguard21_r1.setRotationPoint(0.1F, 0.0F, 0.0F);
		handguard.addChild(handguard21_r1);
		setRotationAngle(handguard21_r1, -0.0044F, 0.0157F, 0.4712F);
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 57, 92, -1.0F, 0.15F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 41, 92, -1.0F, 0.15F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 33, 92, -1.0F, 0.15F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 88, 91, -1.0F, 0.15F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 91, 86, -1.0F, 0.15F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 76, 91, -1.0F, 0.15F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 91, 75, -1.0F, 0.15F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 70, 91, -1.0F, 0.15F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 91, 69, -1.0F, 0.15F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 91, 39, -1.0F, 0.15F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard21_r2 = new ModelRenderer(this);
		handguard21_r2.setRotationPoint(-4.9F, -2.0F, 0.0F);
		handguard.addChild(handguard21_r2);
		setRotationAngle(handguard21_r2, 0.0044F, -0.0157F, 0.4712F);
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 53, 79, 0.0F, -1.15F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 11, 79, 0.0F, -1.15F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 0, 79, 0.0F, -1.15F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 73, 15, 0.0F, -1.15F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 72, 65, 0.0F, -1.15F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 43, 70, 0.0F, -1.15F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 7, 70, 0.0F, -1.15F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 65, 64, 0.0F, -1.15F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 58, 64, 0.0F, -1.15F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard21_r2.cubeList.add(new ModelBox(handguard21_r2, 7, 64, 0.0F, -1.15F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard20_r2 = new ModelRenderer(this);
		handguard20_r2.setRotationPoint(0.1F, -2.0F, 0.0F);
		handguard.addChild(handguard20_r2);
		setRotationAngle(handguard20_r2, 0.0044F, 0.0157F, -0.4712F);
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 94, 93, -1.0F, -1.15F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 26, 95, -1.0F, -1.15F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 30, 95, -1.0F, -1.15F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 96, 8, -1.0F, -1.15F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 96, 10, -1.0F, -1.15F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 96, 15, -1.0F, -1.15F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 96, 17, -1.0F, -1.15F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 33, 96, -1.0F, -1.15F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 37, 96, -1.0F, -1.15F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard20_r2.cubeList.add(new ModelBox(handguard20_r2, 41, 96, -1.0F, -1.15F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard10_r4 = new ModelRenderer(this);
		handguard10_r4.setRotationPoint(0.0F, -2.0F, 0.0F);
		handguard.addChild(handguard10_r4);
		setRotationAngle(handguard10_r4, 0.0044F, 0.0157F, -0.4712F);
		handguard10_r4.cubeList.add(new ModelBox(handguard10_r4, 149, 64, -1.0F, -1.1F, 0.5F, 1, 1, 20, 0.0F, false));
		handguard10_r4.cubeList.add(new ModelBox(handguard10_r4, 80, 98, -0.999F, -1.1F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard9_r6 = new ModelRenderer(this);
		handguard9_r6.setRotationPoint(-4.8F, -2.0F, 0.0F);
		handguard.addChild(handguard9_r6);
		setRotationAngle(handguard9_r6, -0.0079F, -0.0157F, 0.4712F);
		handguard9_r6.cubeList.add(new ModelBox(handguard9_r6, 98, 63, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard9_r6.cubeList.add(new ModelBox(handguard9_r6, 134, 22, 0.001F, -1.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard10_r5 = new ModelRenderer(this);
		handguard10_r5.setRotationPoint(-4.8F, 0.0F, 0.0F);
		handguard.addChild(handguard10_r5);
		setRotationAngle(handguard10_r5, 0.0079F, -0.0157F, -0.4712F);
		handguard10_r5.cubeList.add(new ModelBox(handguard10_r5, 59, 97, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard10_r5.cubeList.add(new ModelBox(handguard10_r5, 128, 109, 0.001F, 0.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard9_r7 = new ModelRenderer(this);
		handguard9_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard.addChild(handguard9_r7);
		setRotationAngle(handguard9_r7, 0.0079F, 0.0157F, 0.4712F);
		handguard9_r7.cubeList.add(new ModelBox(handguard9_r7, 41, 98, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard9_r7.cubeList.add(new ModelBox(handguard9_r7, 86, 133, -1.001F, 0.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard8_r7 = new ModelRenderer(this);
		handguard8_r7.setRotationPoint(0.0F, -2.0F, 0.0F);
		handguard.addChild(handguard8_r7);
		setRotationAngle(handguard8_r7, -0.0079F, 0.0157F, -0.4712F);
		handguard8_r7.cubeList.add(new ModelBox(handguard8_r7, 84, 98, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard8_r7.cubeList.add(new ModelBox(handguard8_r7, 130, 151, -1.001F, -1.001F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard19_r4 = new ModelRenderer(this);
		handguard19_r4.setRotationPoint(-4.9F, 0.0F, 0.0F);
		handguard.addChild(handguard19_r4);
		setRotationAngle(handguard19_r4, 0.0079F, -0.0157F, -0.4712F);
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 51, 88, 0.001F, 0.001F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 80, 87, 0.001F, 0.001F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 68, 87, 0.001F, 0.001F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 56, 87, 0.001F, 0.001F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 4, 87, 0.001F, 0.001F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 0, 87, 0.001F, 0.001F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 86, 57, 0.001F, 0.001F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 86, 55, 0.001F, 0.001F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 86, 45, 0.001F, 0.001F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard19_r4.cubeList.add(new ModelBox(handguard19_r4, 86, 43, 0.001F, 0.001F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard18_r4 = new ModelRenderer(this);
		handguard18_r4.setRotationPoint(0.1F, 0.0F, 0.0F);
		handguard.addChild(handguard18_r4);
		setRotationAngle(handguard18_r4, 0.0079F, 0.0157F, 0.4712F);
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 51, 92, -1.001F, 0.001F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 37, 92, -1.001F, 0.001F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 91, 90, -1.001F, 0.001F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 91, 88, -1.001F, 0.001F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 80, 91, -1.001F, 0.001F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 91, 77, -1.001F, 0.001F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 91, 73, -1.001F, 0.001F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 91, 71, -1.001F, 0.001F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 66, 91, -1.001F, 0.001F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard18_r4.cubeList.add(new ModelBox(handguard18_r4, 54, 91, -1.001F, 0.001F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard18_r5 = new ModelRenderer(this);
		handguard18_r5.setRotationPoint(-4.9F, -2.0F, 0.0F);
		handguard.addChild(handguard18_r5);
		setRotationAngle(handguard18_r5, -0.0079F, -0.0157F, 0.4712F);
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 47, 79, 0.001F, -1.001F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 79, 34, 0.001F, -1.001F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 37, 77, 0.001F, -1.001F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 31, 77, 0.001F, -1.001F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 65, 70, 0.001F, -1.001F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 58, 70, 0.001F, -1.001F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 0, 70, 0.001F, -1.001F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 69, 36, 0.001F, -1.001F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 43, 64, 0.001F, -1.001F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard18_r5.cubeList.add(new ModelBox(handguard18_r5, 0, 64, 0.001F, -1.001F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard17_r2 = new ModelRenderer(this);
		handguard17_r2.setRotationPoint(0.1F, -2.0F, 0.0F);
		handguard.addChild(handguard17_r2);
		setRotationAngle(handguard17_r2, -0.0079F, 0.0157F, -0.4712F);
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 96, 44, -1.001F, -1.001F, 19.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 96, 46, -1.001F, -1.001F, 17.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 96, 50, -1.001F, -1.001F, 15.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 96, 52, -1.001F, -1.001F, 13.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 96, 56, -1.001F, -1.001F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 96, 58, -1.001F, -1.001F, 9.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 96, 61, -1.001F, -1.001F, 7.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 76, 96, -1.001F, -1.001F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 80, 96, -1.001F, -1.001F, 3.0F, 1, 1, 1, 0.0F, false));
		handguard17_r2.cubeList.add(new ModelBox(handguard17_r2, 84, 96, -1.001F, -1.001F, 1.0F, 1, 1, 1, 0.0F, false));

		handguard5_r1 = new ModelRenderer(this);
		handguard5_r1.setRotationPoint(0.1F, -1.5F, 0.0F);
		handguard.addChild(handguard5_r1);
		setRotationAngle(handguard5_r1, 0.0F, 0.0175F, 0.0F);
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 88, 98, -1.001F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 65, 61, -1.001F, -0.5F, 19.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 0, 67, -1.001F, -0.5F, 17.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 7, 67, -1.001F, -0.5F, 15.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 67, 19, -1.001F, -0.5F, 13.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 67, 23, -1.001F, -0.5F, 11.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 43, 67, -1.001F, -0.5F, 9.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 67, 43, -1.001F, -0.5F, 7.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 67, 47, -1.001F, -0.5F, 5.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 58, 67, -1.001F, -0.5F, 3.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 65, 67, -1.001F, -0.5F, 1.0F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 0, 153, -1.0F, 0.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard4_r1 = new ModelRenderer(this);
		handguard4_r1.setRotationPoint(-4.9F, -1.5F, 0.0F);
		handguard.addChild(handguard4_r1);
		setRotationAngle(handguard4_r1, 0.0F, -0.0175F, 0.0F);
		handguard4_r1.cubeList.add(new ModelBox(handguard4_r1, 92, 98, -0.001F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard4_r1.cubeList.add(new ModelBox(handguard4_r1, 153, 127, 0.0F, 0.0F, 0.5F, 1, 1, 20, 0.0F, false));

		handguard15_r1 = new ModelRenderer(this);
		handguard15_r1.setRotationPoint(-1.9F, -1.5F, 0.0F);
		handguard.addChild(handguard15_r1);
		setRotationAngle(handguard15_r1, 0.0F, -0.0175F, 0.0F);
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 37, 28, -2.999F, -0.5F, 19.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 43, 19, -2.999F, -0.5F, 17.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 43, 36, -2.999F, -0.5F, 15.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 43, 43, -2.999F, -0.5F, 13.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 53, 23, -2.999F, -0.5F, 11.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 53, 26, -2.999F, -0.5F, 9.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 0, 61, -2.999F, -0.5F, 7.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 7, 61, -2.999F, -0.5F, 5.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 43, 61, -2.999F, -0.5F, 3.0F, 1, 2, 1, 0.0F, false));
		handguard15_r1.cubeList.add(new ModelBox(handguard15_r1, 58, 61, -2.999F, -0.5F, 1.0F, 1, 2, 1, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		grip.cubeList.add(new ModelBox(grip, 0, 19, -3.0F, -31.0F, -1.0F, 3, 5, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 20, 19, -3.499F, -31.0F, -6.0F, 4, 5, 5, 0.0F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(-3.5F, -26.0F, -5.5F);
		grip.addChild(grip3_r1);
		setRotationAngle(grip3_r1, 0.3718F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 20, 38, 0.001F, 3.0F, -0.5F, 4, 1, 1, 0.0F, false));
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 0, 0, 0.0F, -0.5F, 0.0F, 4, 11, 4, 0.0F, false));

		grip3_r2 = new ModelRenderer(this);
		grip3_r2.setRotationPoint(-3.5F, -29.0F, -1.0F);
		grip.addChild(grip3_r2);
		setRotationAngle(grip3_r2, -1.0782F, 0.0F, 0.0F);
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 0, 61, -0.001F, 0.0F, 0.0F, 4, 3, 12, 0.0F, false));
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 86, 25, 0.499F, -1.0F, 0.0F, 3, 1, 12, 0.0F, false));

		grip4_r1 = new ModelRenderer(this);
		grip4_r1.setRotationPoint(-3.5F, -16.8F, -2.6F);
		grip.addChild(grip4_r1);
		setRotationAngle(grip4_r1, 0.2231F, 0.0F, 0.0F);
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 86, 0, 0.001F, 0.0F, 0.0F, 4, 1, 7, 0.0F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 30, 47, 0.0F, -0.001F, 6.45F, 4, 1, 1, 0.0F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 10, 25, 0.5F, 0.0F, 7.421F, 3, 1, 1, 0.0F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 20, 48, 0.501F, -0.25F, 7.42F, 3, 1, 1, 0.0F, false));

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(-3.5F, -16.8F, -2.6F);
		grip.addChild(grip5_r1);
		setRotationAngle(grip5_r1, 1.0782F, 0.0F, 0.0F);
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 30, 38, -0.001F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		grip13_r1 = new ModelRenderer(this);
		grip13_r1.setRotationPoint(-3.6F, -26.0F, -5.5F);
		grip.addChild(grip13_r1);
		setRotationAngle(grip13_r1, 0.3665F, 0.0F, 0.0F);
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 43, 19, 3.2F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 43, 43, 0.0F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
//		receiver.render(f5);
//		action.render(f5);
//		handguard.render(f5);
//		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
