package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M2A1 extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer sight108_r1;
	private final ModelRenderer sight100_r1;
	private final ModelRenderer sight82_r1;
	private final ModelRenderer sight73_r1;
	private final ModelRenderer sight64_r1;
	private final ModelRenderer sight55_r1;
	private final ModelRenderer sight34_r1;
	private final ModelRenderer sight32_r1;
	private final ModelRenderer sight31_r1;
	private final ModelRenderer sight26_r1;
	private final ModelRenderer sight24_r1;
	private final ModelRenderer sight23_r1;
	private final ModelRenderer sight22_r1;
	private final ModelRenderer sight21_r1;
	private final ModelRenderer sight12_r1;
	private final ModelRenderer sight10_r1;
	private final ModelRenderer sight8_r1;
	private final ModelRenderer sight6_r1;

	public M2A1() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(28.0817F, -30.6542F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -28.0817F, 30.6542F, 0.0F, 4, 2, 17, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -28.0817F, 22.6542F, 0.0F, 4, 1, 17, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -30.5817F, 25.1542F, 0.0F, 1, 4, 17, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -22.5817F, 25.1542F, 0.0F, 1, 4, 17, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -28.0817F, 23.1542F, -1.0F, 4, 1, 21, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -28.0817F, 30.1542F, -1.0F, 4, 1, 21, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -30.0817F, 25.1542F, -1.0F, 1, 4, 21, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -23.0817F, 25.1542F, -1.0F, 1, 4, 21, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -28.0817F, 32.6542F, 0.0F, 4, 2, 16, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -29.5817F, 32.6542F, 3.0F, 7, 3, 12, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -29.5817F, 28.6542F, 8.0F, 1, 4, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -24.0817F, 30.6542F, 14.0F, 2, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -23.5817F, 28.6542F, 8.0F, 1, 4, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -22.0817F, 25.6542F, 0.0F, 1, 3, 17, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -31.0817F, 25.6542F, 0.0F, 1, 3, 17, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -27.5817F, 22.1542F, 0.0F, 3, 1, 17, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -31.5817F, 26.1542F, 0.0F, 11, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -31.5817F, 26.1542F, 2.0F, 11, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -31.5817F, 26.1542F, 4.0F, 11, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -31.5817F, 26.1542F, 6.0F, 11, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -31.5817F, 26.1542F, 8.0F, 11, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -31.5817F, 26.1542F, 10.0F, 11, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -31.5817F, 26.1542F, 12.0F, 11, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -31.5817F, 26.1542F, 14.0F, 11, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -31.5817F, 26.1542F, 16.0F, 11, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -27.0817F, 21.6542F, 0.0F, 2, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -27.0817F, 21.6542F, 2.0F, 2, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -27.0817F, 21.6542F, 4.0F, 2, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -27.0817F, 21.6542F, 6.0F, 2, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -27.0817F, 21.6542F, 8.0F, 2, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -27.0817F, 21.6542F, 10.0F, 2, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -27.0817F, 21.6542F, 12.0F, 2, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -27.0817F, 21.6542F, 14.0F, 2, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -27.0817F, 21.6542F, 16.0F, 2, 1, 1, 0.0F, true));

		sight108_r1 = new ModelRenderer(this);
		sight108_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(sight108_r1);
		setRotationAngle(sight108_r1, 0.0F, 0.0F, -2.3736F);
		sight108_r1.cubeList.add(new ModelBox(sight108_r1, 0, 0, 2.0F, -34.0F, 2.0F, 1, 1, 1, 0.0F, true));
		sight108_r1.cubeList.add(new ModelBox(sight108_r1, 0, 0, 2.0F, -34.0F, 4.0F, 1, 1, 1, 0.0F, true));
		sight108_r1.cubeList.add(new ModelBox(sight108_r1, 0, 0, 2.0F, -34.0F, 6.0F, 1, 1, 1, 0.0F, true));
		sight108_r1.cubeList.add(new ModelBox(sight108_r1, 0, 0, 2.0F, -34.0F, 8.0F, 1, 1, 1, 0.0F, true));
		sight108_r1.cubeList.add(new ModelBox(sight108_r1, 0, 0, 2.0F, -34.0F, 10.0F, 1, 1, 1, 0.0F, true));
		sight108_r1.cubeList.add(new ModelBox(sight108_r1, 0, 0, 2.0F, -34.0F, 12.0F, 1, 1, 1, 0.0F, true));
		sight108_r1.cubeList.add(new ModelBox(sight108_r1, 0, 0, 2.0F, -34.0F, 14.0F, 1, 1, 1, 0.0F, true));
		sight108_r1.cubeList.add(new ModelBox(sight108_r1, 0, 0, 2.0F, -34.0F, 16.0F, 1, 1, 1, 0.0F, true));
		sight108_r1.cubeList.add(new ModelBox(sight108_r1, 0, 0, 2.0F, -34.0F, 0.0F, 1, 1, 1, 0.0F, true));

		sight100_r1 = new ModelRenderer(this);
		sight100_r1.setRotationPoint(-49.2861F, -2.7786F, 0.0F);
		bone.addChild(sight100_r1);
		setRotationAngle(sight100_r1, 0.0F, 0.0F, 2.3736F);
		sight100_r1.cubeList.add(new ModelBox(sight100_r1, 0, 0, 1.0F, -34.0F, 16.0F, 1, 1, 1, 0.0F, true));
		sight100_r1.cubeList.add(new ModelBox(sight100_r1, 0, 0, 1.0F, -34.0F, 14.0F, 1, 1, 1, 0.0F, true));
		sight100_r1.cubeList.add(new ModelBox(sight100_r1, 0, 0, 1.0F, -34.0F, 12.0F, 1, 1, 1, 0.0F, true));
		sight100_r1.cubeList.add(new ModelBox(sight100_r1, 0, 0, 1.0F, -34.0F, 10.0F, 1, 1, 1, 0.0F, true));
		sight100_r1.cubeList.add(new ModelBox(sight100_r1, 0, 0, 1.0F, -34.0F, 8.0F, 1, 1, 1, 0.0F, true));
		sight100_r1.cubeList.add(new ModelBox(sight100_r1, 0, 0, 1.0F, -34.0F, 6.0F, 1, 1, 1, 0.0F, true));
		sight100_r1.cubeList.add(new ModelBox(sight100_r1, 0, 0, 1.0F, -34.0F, 4.0F, 1, 1, 1, 0.0F, true));
		sight100_r1.cubeList.add(new ModelBox(sight100_r1, 0, 0, 1.0F, -34.0F, 2.0F, 1, 1, 1, 0.0F, true));
		sight100_r1.cubeList.add(new ModelBox(sight100_r1, 0, 0, 1.0F, -34.0F, 0.0F, 1, 1, 1, 0.0F, true));

		sight82_r1 = new ModelRenderer(this);
		sight82_r1.setRotationPoint(-52.5079F, 11.523F, 0.0F);
		bone.addChild(sight82_r1);
		setRotationAngle(sight82_r1, 0.0F, 0.0F, 2.3736F);
		sight82_r1.cubeList.add(new ModelBox(sight82_r1, 0, 0, -4.5F, -27.5F, 0.0F, 1, 1, 1, 0.0F, true));
		sight82_r1.cubeList.add(new ModelBox(sight82_r1, 0, 0, -4.5F, -27.5F, 2.0F, 1, 1, 1, 0.0F, true));
		sight82_r1.cubeList.add(new ModelBox(sight82_r1, 0, 0, -4.5F, -27.5F, 4.0F, 1, 1, 1, 0.0F, true));
		sight82_r1.cubeList.add(new ModelBox(sight82_r1, 0, 0, -4.5F, -27.5F, 6.0F, 1, 1, 1, 0.0F, true));
		sight82_r1.cubeList.add(new ModelBox(sight82_r1, 0, 0, -4.5F, -27.5F, 8.0F, 1, 1, 1, 0.0F, true));
		sight82_r1.cubeList.add(new ModelBox(sight82_r1, 0, 0, -4.5F, -27.5F, 10.0F, 1, 1, 1, 0.0F, true));
		sight82_r1.cubeList.add(new ModelBox(sight82_r1, 0, 0, -4.5F, -27.5F, 12.0F, 1, 1, 1, 0.0F, true));
		sight82_r1.cubeList.add(new ModelBox(sight82_r1, 0, 0, -4.5F, -27.5F, 14.0F, 1, 1, 1, 0.0F, true));
		sight82_r1.cubeList.add(new ModelBox(sight82_r1, 0, 0, -4.5F, -27.5F, 16.0F, 1, 1, 1, 0.0F, true));

		sight73_r1 = new ModelRenderer(this);
		sight73_r1.setRotationPoint(-14.3017F, 3.2218F, 0.0F);
		bone.addChild(sight73_r1);
		setRotationAngle(sight73_r1, 0.0F, 0.0F, -2.3736F);
		sight73_r1.cubeList.add(new ModelBox(sight73_r1, 0, 0, -4.5F, -28.5F, 16.0F, 1, 1, 1, 0.0F, true));
		sight73_r1.cubeList.add(new ModelBox(sight73_r1, 0, 0, -4.5F, -28.5F, 14.0F, 1, 1, 1, 0.0F, true));
		sight73_r1.cubeList.add(new ModelBox(sight73_r1, 0, 0, -4.5F, -28.5F, 12.0F, 1, 1, 1, 0.0F, true));
		sight73_r1.cubeList.add(new ModelBox(sight73_r1, 0, 0, -4.5F, -28.5F, 10.0F, 1, 1, 1, 0.0F, true));
		sight73_r1.cubeList.add(new ModelBox(sight73_r1, 0, 0, -4.5F, -28.5F, 8.0F, 1, 1, 1, 0.0F, true));
		sight73_r1.cubeList.add(new ModelBox(sight73_r1, 0, 0, -4.5F, -28.5F, 6.0F, 1, 1, 1, 0.0F, true));
		sight73_r1.cubeList.add(new ModelBox(sight73_r1, 0, 0, -4.5F, -28.5F, 4.0F, 1, 1, 1, 0.0F, true));
		sight73_r1.cubeList.add(new ModelBox(sight73_r1, 0, 0, -4.5F, -28.5F, 2.0F, 1, 1, 1, 0.0F, true));
		sight73_r1.cubeList.add(new ModelBox(sight73_r1, 0, 0, -4.5F, -28.5F, 0.0F, 1, 1, 1, 0.0F, true));

		sight64_r1 = new ModelRenderer(this);
		sight64_r1.setRotationPoint(3.2218F, 14.3017F, 0.0F);
		bone.addChild(sight64_r1);
		setRotationAngle(sight64_r1, 0.0F, 0.0F, -2.3736F);
		sight64_r1.cubeList.add(new ModelBox(sight64_r1, 0, 0, 7.5F, -27.5F, 16.0F, 1, 1, 1, 0.0F, true));
		sight64_r1.cubeList.add(new ModelBox(sight64_r1, 0, 0, 7.5F, -27.5F, 14.0F, 1, 1, 1, 0.0F, true));
		sight64_r1.cubeList.add(new ModelBox(sight64_r1, 0, 0, 7.5F, -27.5F, 12.0F, 1, 1, 1, 0.0F, true));
		sight64_r1.cubeList.add(new ModelBox(sight64_r1, 0, 0, 7.5F, -27.5F, 10.0F, 1, 1, 1, 0.0F, true));
		sight64_r1.cubeList.add(new ModelBox(sight64_r1, 0, 0, 7.5F, -27.5F, 8.0F, 1, 1, 1, 0.0F, true));
		sight64_r1.cubeList.add(new ModelBox(sight64_r1, 0, 0, 7.5F, -27.5F, 6.0F, 1, 1, 1, 0.0F, true));
		sight64_r1.cubeList.add(new ModelBox(sight64_r1, 0, 0, 7.5F, -27.5F, 4.0F, 1, 1, 1, 0.0F, true));
		sight64_r1.cubeList.add(new ModelBox(sight64_r1, 0, 0, 7.5F, -27.5F, 2.0F, 1, 1, 1, 0.0F, true));
		sight64_r1.cubeList.add(new ModelBox(sight64_r1, 0, 0, 7.5F, -27.5F, 0.0F, 1, 1, 1, 0.0F, true));

		sight55_r1 = new ModelRenderer(this);
		sight55_r1.setRotationPoint(-34.9845F, 0.4431F, 0.0F);
		bone.addChild(sight55_r1);
		setRotationAngle(sight55_r1, 0.0F, 0.0F, 2.3736F);
		sight55_r1.cubeList.add(new ModelBox(sight55_r1, 0, 0, 7.5F, -28.5F, 16.0F, 1, 1, 1, 0.0F, true));
		sight55_r1.cubeList.add(new ModelBox(sight55_r1, 0, 0, 7.5F, -28.5F, 14.0F, 1, 1, 1, 0.0F, true));
		sight55_r1.cubeList.add(new ModelBox(sight55_r1, 0, 0, 7.5F, -28.5F, 12.0F, 1, 1, 1, 0.0F, true));
		sight55_r1.cubeList.add(new ModelBox(sight55_r1, 0, 0, 7.5F, -28.5F, 10.0F, 1, 1, 1, 0.0F, true));
		sight55_r1.cubeList.add(new ModelBox(sight55_r1, 0, 0, 7.5F, -28.5F, 8.0F, 1, 1, 1, 0.0F, true));
		sight55_r1.cubeList.add(new ModelBox(sight55_r1, 0, 0, 7.5F, -28.5F, 6.0F, 1, 1, 1, 0.0F, true));
		sight55_r1.cubeList.add(new ModelBox(sight55_r1, 0, 0, 7.5F, -28.5F, 4.0F, 1, 1, 1, 0.0F, true));
		sight55_r1.cubeList.add(new ModelBox(sight55_r1, 0, 0, 7.5F, -28.5F, 2.0F, 1, 1, 1, 0.0F, true));
		sight55_r1.cubeList.add(new ModelBox(sight55_r1, 0, 0, 7.5F, -28.5F, 0.0F, 1, 1, 1, 0.0F, true));

		sight34_r1 = new ModelRenderer(this);
		sight34_r1.setRotationPoint(-28.0817F, 8.0667F, 25.2202F);
		bone.addChild(sight34_r1);
		setRotationAngle(sight34_r1, -2.9371F, 0.0F, 0.0F);
		sight34_r1.cubeList.add(new ModelBox(sight34_r1, 0, 0, 4.5F, -22.0F, 15.0F, 1, 4, 1, 0.0F, true));
		sight34_r1.cubeList.add(new ModelBox(sight34_r1, 0, 0, -1.5F, -22.0F, 15.0F, 1, 4, 1, 0.0F, true));

		sight32_r1 = new ModelRenderer(this);
		sight32_r1.setRotationPoint(-34.1026F, 11.1482F, 0.0F);
		bone.addChild(sight32_r1);
		setRotationAngle(sight32_r1, 0.0F, 0.0F, 2.3562F);
		sight32_r1.cubeList.add(new ModelBox(sight32_r1, 0, 0, 6.0F, -23.0F, 14.0F, 1, 1, 3, 0.0F, true));

		sight31_r1 = new ModelRenderer(this);
		sight31_r1.setRotationPoint(-34.8097F, 9.441F, 0.0F);
		bone.addChild(sight31_r1);
		setRotationAngle(sight31_r1, 0.0F, 0.0F, 2.3562F);
		sight31_r1.cubeList.add(new ModelBox(sight31_r1, 0, 0, 6.0F, -24.0F, 14.0F, 1, 1, 3, 0.0F, true));

		sight26_r1 = new ModelRenderer(this);
		sight26_r1.setRotationPoint(-28.0817F, 5.0771F, 13.4645F);
		bone.addChild(sight26_r1);
		setRotationAngle(sight26_r1, -2.3562F, 0.0F, 0.0F);
		sight26_r1.cubeList.add(new ModelBox(sight26_r1, 0, 0, 0.0F, -22.0F, 17.0F, 4, 1, 2, 0.0F, true));

		sight24_r1 = new ModelRenderer(this);
		sight24_r1.setRotationPoint(-49.184F, 42.5997F, 0.0F);
		bone.addChild(sight24_r1);
		setRotationAngle(sight24_r1, 0.0F, 0.0F, 0.7854F);
		sight24_r1.cubeList.add(new ModelBox(sight24_r1, 0, 0, 5.8F, -31.5F, -1.0F, 1, 1, 21, 0.0F, true));
		sight24_r1.cubeList.add(new ModelBox(sight24_r1, 0, 0, 4.0F, -31.5F, -1.0F, 2, 1, 21, 0.0F, true));

		sight23_r1 = new ModelRenderer(this);
		sight23_r1.setRotationPoint(-43.5272F, 44.9428F, 0.0F);
		bone.addChild(sight23_r1);
		setRotationAngle(sight23_r1, 0.0F, 0.0F, 0.7854F);
		sight23_r1.cubeList.add(new ModelBox(sight23_r1, 0, 0, 3.0F, -26.3F, -1.0F, 1, 1, 21, 0.0F, true));
		sight23_r1.cubeList.add(new ModelBox(sight23_r1, 0, 0, 3.0F, -25.5F, -1.0F, 1, 2, 21, 0.0F, true));

		sight22_r1 = new ModelRenderer(this);
		sight22_r1.setRotationPoint(-11.4647F, 47.7713F, 0.0F);
		bone.addChild(sight22_r1);
		setRotationAngle(sight22_r1, 0.0F, 0.0F, -0.7854F);
		sight22_r1.cubeList.add(new ModelBox(sight22_r1, 0, 0, 0.0F, -26.3F, -1.0F, 1, 1, 21, 0.0F, true));
		sight22_r1.cubeList.add(new ModelBox(sight22_r1, 0, 0, 0.0F, -25.5F, -1.0F, 1, 2, 21, 0.0F, true));

		sight21_r1 = new ModelRenderer(this);
		sight21_r1.setRotationPoint(-5.8079F, 45.4281F, 0.0F);
		bone.addChild(sight21_r1);
		setRotationAngle(sight21_r1, 0.0F, 0.0F, -0.7854F);
		sight21_r1.cubeList.add(new ModelBox(sight21_r1, 0, 0, -2.8F, -31.5F, -1.0F, 1, 1, 21, 0.0F, true));
		sight21_r1.cubeList.add(new ModelBox(sight21_r1, 0, 0, -2.0F, -31.5F, -1.0F, 2, 1, 21, 0.0F, true));

		sight12_r1 = new ModelRenderer(this);
		sight12_r1.setRotationPoint(-7.9543F, 44.2461F, 0.0F);
		bone.addChild(sight12_r1);
		setRotationAngle(sight12_r1, 0.0F, 0.0F, -0.7854F);
		sight12_r1.cubeList.add(new ModelBox(sight12_r1, 0, 0, 0.0F, -29.5F, 0.0F, 1, 1, 17, 0.0F, true));
		sight12_r1.cubeList.add(new ModelBox(sight12_r1, 0, 0, -2.5F, -29.5F, 14.0F, 3, 1, 3, 0.0F, true));
		sight12_r1.cubeList.add(new ModelBox(sight12_r1, 0, 0, -2.5F, -29.5F, 0.0F, 3, 1, 9, 0.0F, true));

		sight10_r1 = new ModelRenderer(this);
		sight10_r1.setRotationPoint(-47.0376F, 41.4177F, 0.0F);
		bone.addChild(sight10_r1);
		setRotationAngle(sight10_r1, 0.0F, 0.0F, 0.7854F);
		sight10_r1.cubeList.add(new ModelBox(sight10_r1, 0, 0, 3.0F, -29.5F, 0.0F, 1, 1, 17, 0.0F, true));
		sight10_r1.cubeList.add(new ModelBox(sight10_r1, 0, 0, 3.5F, -29.5F, 14.0F, 3, 1, 3, 0.0F, true));
		sight10_r1.cubeList.add(new ModelBox(sight10_r1, 0, 0, 3.5F, -29.5F, 0.0F, 3, 1, 9, 0.0F, true));

		sight8_r1 = new ModelRenderer(this);
		sight8_r1.setRotationPoint(-44.2092F, 42.5893F, 0.0F);
		bone.addChild(sight8_r1);
		setRotationAngle(sight8_r1, 0.0F, 0.0F, 0.7854F);
		sight8_r1.cubeList.add(new ModelBox(sight8_r1, 0, 0, 5.5F, -25.5F, 0.0F, 1, 4, 17, 0.0F, true));

		sight6_r1 = new ModelRenderer(this);
		sight6_r1.setRotationPoint(-10.7828F, 45.4177F, 0.0F);
		bone.addChild(sight6_r1);
		setRotationAngle(sight6_r1, 0.0F, 0.0F, -0.7854F);
		sight6_r1.cubeList.add(new ModelBox(sight6_r1, 0, 0, -2.5F, -25.5F, 0.0F, 1, 4, 17, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}