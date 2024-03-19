package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LP extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer sight24_r1;
	private final ModelRenderer sight4_r1;
	private final ModelRenderer sight5_r1;
	private final ModelRenderer sight9_r1;
	private final ModelRenderer sight10_r1;
	private final ModelRenderer sight12_r1;
	private final ModelRenderer sight13_r1;
	private final ModelRenderer sight15_r1;
	private final ModelRenderer sight16_r1;
	private final ModelRenderer sight18_r1;
	private final ModelRenderer gun82_r1;
	private final ModelRenderer gun81_r1;
	private final ModelRenderer gun77_r1;
	private final ModelRenderer gun76_r1;
	private final ModelRenderer gun73_r1;
	private final ModelRenderer gun72_r1;
	private final ModelRenderer gun41_r1;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun38_r1;
	private final ModelRenderer gun35_r1;
	private final ModelRenderer gun34_r1;
	private final ModelRenderer gun33_r1;
	private final ModelRenderer gun32_r1;

	public LP() {
		textureWidth = 256;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(19.7091F, -17.7032F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 15.9032F, -4.1F, 3, 1, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 18.7032F, -14.5F, 1, 1, 5, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 16.4032F, -14.1F, 3, 3, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -17.7091F, 16.4032F, -11.1F, 2, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 15.4032F, -16.1F, 3, 1, 15, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -15.2091F, 12.4032F, -10.1F, 1, 3, 9, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 11.4032F, -10.1F, 3, 1, 9, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -19.2091F, 12.4032F, -16.1F, 1, 3, 15, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -17.7091F, 15.8032F, -16.1F, 2, 1, 25, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -14.9091F, 12.9032F, -10.1F, 1, 2, 19, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -19.6091F, 12.9032F, -16.1F, 1, 2, 25, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 16.3032F, -26.1F, 3, 1, 10, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -14.3091F, 12.4032F, -26.1F, 1, 3, 10, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -20.1091F, 12.4032F, -26.1F, 1, 3, 10, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -14.0091F, 12.9032F, -26.1F, 1, 2, 10, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -20.4091F, 12.9032F, -26.1F, 1, 2, 10, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 10.5032F, -26.1F, 3, 1, 10, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -14.7091F, 12.4032F, -9.1F, 1, 3, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 15.9032F, -9.1F, 3, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 10.9032F, -9.1F, 3, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -19.7091F, 12.4032F, -9.1F, 1, 3, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -17.7091F, 9.9032F, -8.6F, 2, 1, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -13.7091F, 13.0032F, -8.6F, 1, 2, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -20.7091F, 13.0032F, -8.6F, 1, 2, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 11.4032F, -1.1F, 3, 1, 10, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -15.2091F, 12.4032F, -1.1F, 1, 3, 10, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 15.4032F, -1.1F, 3, 1, 10, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -19.2091F, 12.4032F, -1.1F, 1, 3, 10, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -13.9091F, 12.9032F, -4.1F, 1, 2, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 10.9032F, -4.1F, 3, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -20.4091F, 12.9032F, -4.1F, 1, 2, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 18.7032F, -9.5F, 1, 1, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -16.2091F, 18.7032F, -9.5F, 1, 1, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -17.7091F, 18.2032F, -9.5F, 2, 1, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -17.7091F, 16.4032F, -1.6F, 2, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 16.4032F, -4.1F, 3, 2, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -20.4091F, 12.9032F, -14.1F, 1, 2, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 15.9032F, -12.1F, 3, 1, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 10.9032F, -14.1F, 3, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -13.9091F, 12.9032F, -14.1F, 1, 2, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -14.9091F, 12.9032F, -16.1F, 1, 2, 12, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -15.2091F, 12.4032F, -16.1F, 1, 3, 7, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -18.2091F, 11.4032F, -16.1F, 3, 1, 7, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -17.7091F, 18.2032F, -14.5F, 2, 1, 5, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -16.2091F, 18.7032F, -14.5F, 1, 1, 5, 0.0F, true));

		sight24_r1 = new ModelRenderer(this);
		sight24_r1.setRotationPoint(-19.7091F, 9.6611F, 14.8324F);
		bone.addChild(sight24_r1);
		setRotationAngle(sight24_r1, 1.7846F, 0.0F, 0.0F);
		sight24_r1.cubeList.add(new ModelBox(sight24_r1, 0, 0, 1.5F, -22.0F, -5.5F, 3, 5, 1, 0.0F, true));

		sight4_r1 = new ModelRenderer(this);
		sight4_r1.setRotationPoint(-39.7314F, 29.7607F, 0.0F);
		bone.addChild(sight4_r1);
		setRotationAngle(sight4_r1, 0.0F, 0.0F, 0.7808F);
		sight4_r1.cubeList.add(new ModelBox(sight4_r1, 0, 0, 4.5F, -30.3F, -16.1F, 1, 1, 7, 0.0F, true));
		sight4_r1.cubeList.add(new ModelBox(sight4_r1, 0, 0, 4.5F, -30.3F, -1.1F, 1, 1, 10, 0.0F, true));
		sight4_r1.cubeList.add(new ModelBox(sight4_r1, 0, 0, 4.5F, -30.3F, -10.1F, 1, 1, 9, 0.0F, true));

		sight5_r1 = new ModelRenderer(this);
		sight5_r1.setRotationPoint(-31.3797F, -11.9671F, 0.0F);
		bone.addChild(sight5_r1);
		setRotationAngle(sight5_r1, 0.0F, 0.0F, 2.3423F);
		sight5_r1.cubeList.add(new ModelBox(sight5_r1, 0, 0, 5.5F, -29.3F, -16.1F, 1, 1, 7, 0.0F, true));
		sight5_r1.cubeList.add(new ModelBox(sight5_r1, 0, 0, 5.5F, -29.3F, -1.1F, 1, 1, 10, 0.0F, true));
		sight5_r1.cubeList.add(new ModelBox(sight5_r1, 0, 0, 5.5F, -29.3F, -10.1F, 1, 1, 9, 0.0F, true));

		sight9_r1 = new ModelRenderer(this);
		sight9_r1.setRotationPoint(-30.5311F, -12.3255F, 0.0F);
		bone.addChild(sight9_r1);
		setRotationAngle(sight9_r1, 0.0F, 0.0F, 2.3423F);
		sight9_r1.cubeList.add(new ModelBox(sight9_r1, 0, 0, 6.0F, -29.3F, -14.1F, 1, 2, 2, 0.0F, true));
		sight9_r1.cubeList.add(new ModelBox(sight9_r1, 0, 0, 6.0F, -29.3F, -4.1F, 1, 2, 3, 0.0F, true));
		sight9_r1.cubeList.add(new ModelBox(sight9_r1, 0, 0, 6.0F, -29.3F, -9.1F, 1, 2, 3, 0.0F, true));

		sight10_r1 = new ModelRenderer(this);
		sight10_r1.setRotationPoint(-40.0833F, 29.6159F, 0.0F);
		bone.addChild(sight10_r1);
		setRotationAngle(sight10_r1, 0.0F, 0.0F, 0.7808F);
		sight10_r1.cubeList.add(new ModelBox(sight10_r1, 0, 0, 4.5F, -30.8F, -14.1F, 3, 1, 3, 0.0F, true));
		sight10_r1.cubeList.add(new ModelBox(sight10_r1, 0, 0, 4.5F, -30.8F, -4.1F, 3, 1, 3, 0.0F, true));
		sight10_r1.cubeList.add(new ModelBox(sight10_r1, 0, 0, 4.5F, -30.8F, -9.1F, 1, 1, 3, 0.0F, true));

		sight12_r1 = new ModelRenderer(this);
		sight12_r1.setRotationPoint(0.1247F, 33.9696F, 0.0F);
		bone.addChild(sight12_r1);
		setRotationAngle(sight12_r1, 0.0F, 0.0F, -0.7436F);
		sight12_r1.cubeList.add(new ModelBox(sight12_r1, 0, 0, 0.0F, -29.3F, -14.1F, 2, 1, 2, 0.0F, true));
		sight12_r1.cubeList.add(new ModelBox(sight12_r1, 0, 0, 0.0F, -29.3F, -4.1F, 2, 1, 2, 0.0F, true));
		sight12_r1.cubeList.add(new ModelBox(sight12_r1, 0, 0, 0.0F, -29.3F, -9.1F, 2, 1, 3, 0.0F, true));

		sight13_r1 = new ModelRenderer(this);
		sight13_r1.setRotationPoint(-40.9521F, 31.7274F, 0.0F);
		bone.addChild(sight13_r1);
		setRotationAngle(sight13_r1, 0.0F, 0.0F, 0.7808F);
		sight13_r1.cubeList.add(new ModelBox(sight13_r1, 0, 0, 1.5F, -30.8F, -14.1F, 1, 3, 3, 0.0F, true));
		sight13_r1.cubeList.add(new ModelBox(sight13_r1, 0, 0, 1.5F, -30.8F, -4.1F, 1, 3, 3, 0.0F, true));
		sight13_r1.cubeList.add(new ModelBox(sight13_r1, 0, 0, 1.5F, -30.8F, -9.1F, 1, 1, 3, 0.0F, true));

		sight15_r1 = new ModelRenderer(this);
		sight15_r1.setRotationPoint(5.7073F, 2.8392F, 0.0F);
		bone.addChild(sight15_r1);
		setRotationAngle(sight15_r1, 0.0F, 0.0F, -2.3423F);
		sight15_r1.cubeList.add(new ModelBox(sight15_r1, 0, 0, 4.5F, -24.8F, -14.1F, 1, 3, 3, 0.0F, true));
		sight15_r1.cubeList.add(new ModelBox(sight15_r1, 0, 0, 4.5F, -24.8F, -4.1F, 1, 3, 3, 0.0F, true));
		sight15_r1.cubeList.add(new ModelBox(sight15_r1, 0, 0, 4.5F, -24.8F, -9.1F, 1, 2, 3, 0.0F, true));

		sight16_r1 = new ModelRenderer(this);
		sight16_r1.setRotationPoint(-27.5288F, -7.7637F, 0.0F);
		bone.addChild(sight16_r1);
		setRotationAngle(sight16_r1, 0.0F, 0.0F, 2.3794F);
		sight16_r1.cubeList.add(new ModelBox(sight16_r1, 0, 0, 6.0F, -26.3F, -14.1F, 1, 1, 2, 0.0F, true));
		sight16_r1.cubeList.add(new ModelBox(sight16_r1, 0, 0, 6.0F, -26.3F, -4.1F, 1, 1, 2, 0.0F, true));
		sight16_r1.cubeList.add(new ModelBox(sight16_r1, 0, 0, 6.0F, -26.3F, -9.1F, 1, 1, 3, 0.0F, true));

		sight18_r1 = new ModelRenderer(this);
		sight18_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(sight18_r1);
		setRotationAngle(sight18_r1, 0.0F, 0.0F, -2.3794F);
		sight18_r1.cubeList.add(new ModelBox(sight18_r1, 0, 0, 1.5F, -24.8F, -14.1F, 3, 1, 3, 0.0F, true));
		sight18_r1.cubeList.add(new ModelBox(sight18_r1, 0, 0, 1.5F, -24.8F, -4.1F, 3, 1, 3, 0.0F, true));
		sight18_r1.cubeList.add(new ModelBox(sight18_r1, 0, 0, 1.5F, -24.8F, -9.1F, 2, 1, 3, 0.0F, true));

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(0.3452F, -0.8617F, 0.0F);
		bone.addChild(gun82_r1);
		setRotationAngle(gun82_r1, 0.0F, 0.0F, -2.3794F);
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 0, 0, 1.5F, -25.3F, -1.1F, 1, 1, 10, 0.0F, true));
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 0, 0, 1.5F, -25.3F, -16.1F, 1, 1, 15, 0.0F, true));

		gun81_r1 = new ModelRenderer(this);
		gun81_r1.setRotationPoint(-1.7741F, 35.0999F, 0.0F);
		bone.addChild(gun81_r1);
		setRotationAngle(gun81_r1, 0.0F, 0.0F, -0.7436F);
		gun81_r1.cubeList.add(new ModelBox(gun81_r1, 0, 0, 0.5F, -26.3F, -1.1F, 1, 1, 10, 0.0F, true));
		gun81_r1.cubeList.add(new ModelBox(gun81_r1, 0, 0, 0.5F, -26.3F, -16.1F, 1, 1, 15, 0.0F, true));

		gun77_r1 = new ModelRenderer(this);
		gun77_r1.setRotationPoint(6.0657F, 1.9906F, 0.0F);
		bone.addChild(gun77_r1);
		setRotationAngle(gun77_r1, 0.0F, 0.0F, -2.3423F);
		gun77_r1.cubeList.add(new ModelBox(gun77_r1, 0, 0, 4.5F, -25.3F, -1.1F, 1, 1, 10, 0.0F, true));
		gun77_r1.cubeList.add(new ModelBox(gun77_r1, 0, 0, 4.5F, -25.3F, -16.1F, 1, 1, 15, 0.0F, true));

		gun76_r1 = new ModelRenderer(this);
		gun76_r1.setRotationPoint(-28.3905F, -7.4184F, 0.0F);
		bone.addChild(gun76_r1);
		setRotationAngle(gun76_r1, 0.0F, 0.0F, 2.3794F);
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 0, 0, 5.5F, -26.3F, -1.1F, 1, 1, 10, 0.0F, true));
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 0, 0, 5.5F, -26.3F, -16.1F, 1, 1, 15, 0.0F, true));

		gun73_r1 = new ModelRenderer(this);
		gun73_r1.setRotationPoint(0.2567F, 34.3081F, 0.0F);
		bone.addChild(gun73_r1);
		setRotationAngle(gun73_r1, 0.0F, 0.0F, -0.7436F);
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 0, 0, 0.5F, -29.3F, -1.1F, 1, 1, 10, 0.0F, true));
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 0, 0, 0.5F, -29.3F, -16.1F, 1, 1, 15, 0.0F, true));

		gun72_r1 = new ModelRenderer(this);
		gun72_r1.setRotationPoint(-40.6002F, 31.8722F, 0.0F);
		bone.addChild(gun72_r1);
		setRotationAngle(gun72_r1, 0.0F, 0.0F, 0.7808F);
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 0, 0, 1.5F, -30.3F, -1.1F, 1, 1, 10, 0.0F, true));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 0, 0, 1.5F, -30.3F, -16.1F, 1, 1, 15, 0.0F, true));

		gun41_r1 = new ModelRenderer(this);
		gun41_r1.setRotationPoint(-40.3648F, 29.5001F, 0.0F);
		bone.addChild(gun41_r1);
		setRotationAngle(gun41_r1, 0.0F, 0.0F, 0.7808F);
		gun41_r1.cubeList.add(new ModelBox(gun41_r1, 0, 0, 4.5F, -31.2F, -26.1F, 1, 1, 10, 0.0F, true));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(-41.2336F, 31.6115F, 0.0F);
		bone.addChild(gun40_r1);
		setRotationAngle(gun40_r1, 0.0F, 0.0F, 0.7808F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 0, 0, 1.5F, -31.2F, -26.1F, 1, 1, 10, 0.0F, true));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(-29.8522F, -12.6123F, 0.0F);
		bone.addChild(gun39_r1);
		setRotationAngle(gun39_r1, 0.0F, 0.0F, 2.3423F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 0, 0, 6.4F, -29.3F, -26.1F, 1, 2, 10, 0.0F, true));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(0.0191F, 33.6989F, 0.0F);
		bone.addChild(gun38_r1);
		setRotationAngle(gun38_r1, 0.0F, 0.0F, -0.7436F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 0, 0, -0.4F, -29.3F, -26.1F, 2, 1, 10, 0.0F, true));

		gun35_r1 = new ModelRenderer(this);
		gun35_r1.setRotationPoint(-26.8395F, -8.0399F, 0.0F);
		bone.addChild(gun35_r1);
		setRotationAngle(gun35_r1, 0.0F, 0.0F, 2.3794F);
		gun35_r1.cubeList.add(new ModelBox(gun35_r1, 0, 0, 6.4F, -26.3F, -26.1F, 1, 1, 10, 0.0F, true));

		gun34_r1 = new ModelRenderer(this);
		gun34_r1.setRotationPoint(-2.0116F, 34.4907F, 0.0F);
		bone.addChild(gun34_r1);
		setRotationAngle(gun34_r1, 0.0F, 0.0F, -0.7436F);
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 0, 0, -0.4F, -26.3F, -26.1F, 1, 1, 10, 0.0F, true));

		gun33_r1 = new ModelRenderer(this);
		gun33_r1.setRotationPoint(-0.2762F, 0.6893F, 0.0F);
		bone.addChild(gun33_r1);
		setRotationAngle(gun33_r1, 0.0F, 0.0F, -2.3794F);
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 0, 0, 1.5F, -24.4F, -26.1F, 2, 1, 10, 0.0F, true));

		gun32_r1 = new ModelRenderer(this);
		gun32_r1.setRotationPoint(5.4205F, 3.5181F, 0.0F);
		bone.addChild(gun32_r1);
		setRotationAngle(gun32_r1, 0.0F, 0.0F, -2.3423F);
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 0, 0, 4.5F, -24.4F, -26.1F, 1, 2, 10, 0.0F, true));
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