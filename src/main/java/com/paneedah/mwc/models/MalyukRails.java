package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MalyukRails extends ModelWithAttachments {
	private final QRenderer gun;
	private final ModelRenderer gun61_r1;
	private final ModelRenderer gun60_r1;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer gun988;
	private final ModelRenderer gun977;
	private final ModelRenderer gun12;
	private final ModelRenderer gun82;
	private final ModelRenderer gun42;
	private final ModelRenderer gun47_r1;
	private final ModelRenderer gun46_r1;
	private final ModelRenderer gun46_r2;
	private final ModelRenderer gun45_r1;
	private final ModelRenderer gun48_r1;
	private final ModelRenderer gun47_r2;
	private final ModelRenderer gun47_r3;
	private final ModelRenderer gun46_r3;
	private final ModelRenderer gun47_r4;
	private final ModelRenderer bone3;
	private final ModelRenderer gun47_r5;
	private final ModelRenderer gun52_r1;
	private final ModelRenderer gun50_r1;
	private final ModelRenderer gun48_r2;
	private final ModelRenderer bone2;
	private final ModelRenderer gun52_r2;
	private final ModelRenderer gun54_r1;
	private final ModelRenderer gun55_r1;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun59_r1;
	private final ModelRenderer gun58_r2;
	private final ModelRenderer gun58_r3;
	private final ModelRenderer gun57_r1;
	private final ModelRenderer gun57_r2;
	private final ModelRenderer gun56_r1;
	private final ModelRenderer gun56_r2;
	private final ModelRenderer gun55_r2;
	private final ModelRenderer gun55_r3;
	private final ModelRenderer gun54_r2;
	private final ModelRenderer bone;
	private final ModelRenderer gun51_r1;
	private final ModelRenderer bone4;
	private final ModelRenderer gun48_r3;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun50_r2;
	private final ModelRenderer gun49_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer gun53_r2;
	private final ModelRenderer gun55_r4;
	private final ModelRenderer gun56_r3;
	private final ModelRenderer gun59_r2;
	private final ModelRenderer gun60_r2;
	private final ModelRenderer gun59_r3;
	private final ModelRenderer gun59_r4;
	private final ModelRenderer gun58_r4;
	private final ModelRenderer gun58_r5;
	private final ModelRenderer gun57_r3;
	private final ModelRenderer gun57_r4;
	private final ModelRenderer gun56_r4;
	private final ModelRenderer gun56_r5;
	private final ModelRenderer gun55_r5;
	private final ModelRenderer bone6;
	private final ModelRenderer gun52_r3;
	private final ModelRenderer gun39;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer dustcover;
	private final ModelRenderer DustCover46_r1;
	private final ModelRenderer DustCover45_r1;
	private final ModelRenderer DustCover46_r2;
	private final ModelRenderer DustCover44_r1;
	private final ModelRenderer DustCover45_r2;
	private final ModelRenderer DustCover5;
	private final ModelRenderer DustCover6_r1;
	private final ModelRenderer DustCover3;
	private final ModelRenderer DustCover7_r1;
	private final ModelRenderer DustCover2;
	private final ModelRenderer DustCover4;
	private final ModelRenderer DustCover5_r1;
	private final ModelRenderer DustCover6;
	private final ModelRenderer DustCover6_r2;
	private final ModelRenderer DustCover1;
	private final ModelRenderer DustCover3_r1;
	private final ModelRenderer DustCover36;
	private final ModelRenderer DustCover18;
	private final ModelRenderer DustCover17;
	private final ModelRenderer DustCover19;
	private final ModelRenderer stocc;
	private final ModelRenderer stocc4_r1;
	private final ModelRenderer stocc3_r1;
	private final ModelRenderer stocc2_r1;
	private final ModelRenderer stocc5_r1;
	private final ModelRenderer stocc5_r2;
	private final ModelRenderer stocc7_r1;
	private final ModelRenderer stocc7_r2;
	private final ModelRenderer stocc6_r1;
	private final ModelRenderer stocc6_r2;
	private final ModelRenderer stocc4_r2;
	private final ModelRenderer stocc6_r3;
	private final ModelRenderer stocc5_r3;
	private final ModelRenderer stocc6_r4;
	private final ModelRenderer stocc5_r4;
	private final ModelRenderer stocc6_r5;
	private final ModelRenderer stocc5_r5;
	private final ModelRenderer stocc6_r6;
	private final ModelRenderer stocc4_r3;
	private final ModelRenderer stocc3_r2;
	private final ModelRenderer stocc1_r1;
	private final ModelRenderer handguard;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun153_r1;
	private final ModelRenderer gun152_r2;
	private final ModelRenderer gun153_r2;
	private final ModelRenderer gun155_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer gun157_r1;
	private final ModelRenderer gun158_r1;
	private final ModelRenderer gun152_r3;
	private final ModelRenderer gun157_r2;
	private final ModelRenderer gun156_r2;
	private final ModelRenderer gun155_r2;
	private final ModelRenderer gun154_r1;
	private final ModelRenderer gun153_r3;
	private final ModelRenderer gun220;
	private final ModelRenderer gun219;
	private final ModelRenderer gun193;
	private final ModelRenderer gun196_r1;
	private final ModelRenderer gun195_r1;
	private final ModelRenderer gun192;
	private final ModelRenderer gun194_r1;
	private final ModelRenderer gun193_r1;
	private final ModelRenderer gun195_r2;
	private final ModelRenderer gun194_r2;
	private final ModelRenderer gun159;
	private final ModelRenderer gun161_r1;
	private final ModelRenderer gun160_r1;
	private final ModelRenderer gun158;
	private final ModelRenderer gun148;
	private final ModelRenderer gun151_r1;
	private final ModelRenderer gun150_r1;
	private final ModelRenderer rail;
	private final ModelRenderer DustCover4_r1;
	private final ModelRenderer DustCover3_r2;
	private final ModelRenderer DustCover5_r2;
	private final ModelRenderer teeth;
	private final ModelRenderer DustCover9_r1;
	private final ModelRenderer DustCover10_r1;
	private final QRenderer grip;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun10_r1;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun9_r2;
	private final ModelRenderer gun10_r2;
	private final ModelRenderer gun9_r3;
	private final ModelRenderer gun5;
	private final ModelRenderer gun4;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun3;
	private final ModelRenderer gun2;
	private final QRenderer barrel;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final QRenderer rails;
	private final ModelRenderer griprails;
	private final ModelRenderer teeth2;
	private final ModelRenderer DustCover10_r2;
	private final ModelRenderer DustCover11_r1;
	private final ModelRenderer griprails2;
	private final ModelRenderer teeth3;
	private final ModelRenderer DustCover11_r2;
	private final ModelRenderer DustCover12_r1;
	private final ModelRenderer griprails3;
	private final ModelRenderer teeth4;
	private final ModelRenderer DustCover12_r2;
	private final ModelRenderer DustCover13_r1;
	private final QRenderer action;
	private final ModelRenderer cube_r6;

	public MalyukRails() {
		textureWidth = 360;
		textureHeight = 360;

		gun = new QRenderer(this);
		gun.setRotationPoint(0.0F, 25.0F, 37.0F);
		gun.cubeList.add(new ModelBox(gun, 85, 58, -3.451F, -33.0F, -21.5F, 1, 2, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 83, 24, -0.549F, -33.0F, -21.5F, 1, 2, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 116, 58, -3.7F, -36.5F, -47.5F, 1, 1, 17, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 116, 76, -0.3F, -36.5F, -47.5F, 1, 1, 17, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 221, 202, -3.45F, -35.75F, -30.5F, 1, 3, 34, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 219, 142, -0.55F, -35.75F, -30.5F, 1, 3, 34, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 254, 79, -3.95F, -36.5F, -30.5F, 1, 1, 34, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 88, 248, -0.05F, -36.5F, -30.5F, 1, 1, 34, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 179, 247, -0.0499F, -36.0F, -30.5F, 1, 1, 34, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 143, 246, -3.9501F, -36.0F, -30.5F, 1, 1, 34, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 57, -3.451F, -32.75F, -9.5F, 1, 2, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 0, -0.549F, -32.75F, -9.5F, 1, 2, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 96, -3.451F, -33.0F, -30.5F, 1, 2, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 41, 57, -0.549F, -33.0F, -30.5F, 1, 2, 6, 0.0F, false));

		gun61_r1 = new ModelRenderer(this);
		gun61_r1.setRotationPoint(-3.95F, -36.5F, -30.5F);
		gun.addChild(gun61_r1);
		setRotationAngle(gun61_r1, 0.0F, 0.0F, -1.0647F);
		gun61_r1.cubeList.add(new ModelBox(gun61_r1, 46, 50, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun60_r1 = new ModelRenderer(this);
		gun60_r1.setRotationPoint(0.95F, -36.5F, -30.5F);
		gun.addChild(gun60_r1);
		setRotationAngle(gun60_r1, 0.0F, 0.0F, 1.0647F);
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 37, 41, -1.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.25F, 0.0F, 0.0F);
		gun.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 99, 95, -0.2F, -32.0F, -18.0F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 81, 99, -0.2F, -33.5F, -3.5F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 85, 99, -0.2F, -34.8F, 0.5F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 93, 99, -0.2F, -32.5F, -16.0F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 89, 99, -0.2F, -31.7F, -10.0F, 1, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.25F, 0.0F, 0.0F);
		gun.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 58, 99, -3.8F, -33.5F, -3.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 99, 58, -3.8F, -34.8F, 0.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 99, 60, -3.8F, -32.5F, -16.0F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 62, 99, -3.8F, -31.7F, -10.0F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 99, 62, -3.8F, -32.0F, -18.0F, 1, 1, 1, 0.0F, false));

		gun988 = new ModelRenderer(this);
		gun988.setRotationPoint(-0.2F, -33.0F, -26.5F);
		gun.addChild(gun988);
		gun988.cubeList.add(new ModelBox(gun988, 99, 97, -0.25F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun977 = new ModelRenderer(this);
		gun977.setRotationPoint(-3.55F, -34.5F, -27.5F);
		gun.addChild(gun977);
		gun977.cubeList.add(new ModelBox(gun977, 100, 10, 0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		gun977.cubeList.add(new ModelBox(gun977, 100, 8, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(0.55F, -34.5F, -27.5F);
		gun.addChild(gun12);
		gun12.cubeList.add(new ModelBox(gun12, 95, 18, -1.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		gun12.cubeList.add(new ModelBox(gun12, 17, 95, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun82 = new ModelRenderer(this);
		gun82.setRotationPoint(-3.4F, -33.5F, -24.5F);
		gun.addChild(gun82);
		gun82.cubeList.add(new ModelBox(gun82, 24, 82, 0.625F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

		gun42 = new ModelRenderer(this);
		gun42.setRotationPoint(-3.7F, -35.0F, -35.5F);
		gun.addChild(gun42);
		gun42.cubeList.add(new ModelBox(gun42, 0, 114, 0.099F, 0.0F, -16.0F, 1, 4, 21, 0.0F, false));
		gun42.cubeList.add(new ModelBox(gun42, 58, 80, 3.301F, 0.0F, -16.0F, 1, 4, 21, 0.0F, false));
		gun42.cubeList.add(new ModelBox(gun42, 58, 115, 2.3F, 3.75F, -16.0F, 2, 1, 21, 0.0F, false));
		gun42.cubeList.add(new ModelBox(gun42, 58, 58, 0.1F, 3.75F, -16.0F, 3, 1, 21, -0.001F, false));
		gun42.cubeList.add(new ModelBox(gun42, 219, 0, 0.101F, -0.75F, -33.0F, 1, 1, 38, 0.0F, false));
		gun42.cubeList.add(new ModelBox(gun42, 44, 217, 3.299F, -0.75F, -33.0F, 1, 1, 38, 0.0F, false));
		gun42.cubeList.add(new ModelBox(gun42, 16, 87, 0.0F, -1.5F, -33.0F, 1, 1, 2, 0.0F, false));
		gun42.cubeList.add(new ModelBox(gun42, 10, 87, 3.4F, -1.5F, -33.0F, 1, 1, 2, 0.0F, false));
		gun42.cubeList.add(new ModelBox(gun42, 26, 28, -0.001F, -2.75F, -38.0F, 1, 6, 5, 0.0F, false));
		gun42.cubeList.add(new ModelBox(gun42, 0, 0, 3.401F, -2.75F, -38.0F, 1, 6, 5, 0.0F, false));
		gun42.cubeList.add(new ModelBox(gun42, 36, 72, -0.001F, -4.575F, 10.0F, 2, 1, 7, 0.0F, false));
		gun42.cubeList.add(new ModelBox(gun42, 81, 85, -0.001F, -3.575F, 17.0F, 2, 3, 1, 0.0F, false));
		gun42.cubeList.add(new ModelBox(gun42, 85, 66, -0.001F, -3.575F, 9.0001F, 2, 3, 1, 0.0F, false));

		gun47_r1 = new ModelRenderer(this);
		gun47_r1.setRotationPoint(0.999F, -3.8679F, 10.0F);
		gun42.addChild(gun47_r1);
		setRotationAngle(gun47_r1, 0.7854F, 0.0F, 0.0F);
		gun47_r1.cubeList.add(new ModelBox(gun47_r1, 44, 91, -0.998F, -0.5F, -0.501F, 2, 1, 1, 0.0F, false));

		gun46_r1 = new ModelRenderer(this);
		gun46_r1.setRotationPoint(0.999F, -4.2821F, 10.4142F);
		gun42.addChild(gun46_r1);
		setRotationAngle(gun46_r1, 0.7854F, 0.0F, 0.0F);
		gun46_r1.cubeList.add(new ModelBox(gun46_r1, 38, 91, -0.999F, -0.5F, -1.5F, 2, 1, 1, -0.002F, false));

		gun46_r2 = new ModelRenderer(this);
		gun46_r2.setRotationPoint(0.999F, -3.8679F, 17.0F);
		gun42.addChild(gun46_r2);
		setRotationAngle(gun46_r2, -0.7854F, 0.0F, 0.0F);
		gun46_r2.cubeList.add(new ModelBox(gun46_r2, 50, 91, -0.998F, -0.5F, -0.499F, 2, 1, 1, 0.0F, false));

		gun45_r1 = new ModelRenderer(this);
		gun45_r1.setRotationPoint(0.999F, -4.2821F, 16.5858F);
		gun42.addChild(gun45_r1);
		setRotationAngle(gun45_r1, -0.7854F, 0.0F, 0.0F);
		gun45_r1.cubeList.add(new ModelBox(gun45_r1, 91, 60, -0.999F, -0.5F, 0.5F, 2, 1, 1, -0.002F, false));

		gun48_r1 = new ModelRenderer(this);
		gun48_r1.setRotationPoint(0.7054F, 3.2192F, -36.0F);
		gun42.addChild(gun48_r1);
		setRotationAngle(gun48_r1, 0.0F, 0.0F, -0.829F);
		gun48_r1.cubeList.add(new ModelBox(gun48_r1, 38, 82, -0.5F, -0.5F, -2.0F, 1, 1, 3, 0.0F, false));

		gun47_r2 = new ModelRenderer(this);
		gun47_r2.setRotationPoint(3.6946F, 3.2192F, -36.0F);
		gun42.addChild(gun47_r2);
		setRotationAngle(gun47_r2, 0.0F, 0.0F, 0.829F);
		gun47_r2.cubeList.add(new ModelBox(gun47_r2, 83, 24, -0.5F, -0.5F, -2.0F, 1, 1, 3, 0.0F, false));

		gun47_r3 = new ModelRenderer(this);
		gun47_r3.setRotationPoint(3.401F, -1.9717F, -35.4224F);
		gun42.addChild(gun47_r3);
		setRotationAngle(gun47_r3, 0.0873F, 0.0F, 0.0F);
		gun47_r3.cubeList.add(new ModelBox(gun47_r3, 43, 15, -0.001F, -1.0F, -2.5F, 1, 2, 5, 0.0F, false));
		gun47_r3.cubeList.add(new ModelBox(gun47_r3, 26, 57, -3.401F, -1.0F, -2.5F, 1, 2, 5, 0.0F, false));

		gun46_r3 = new ModelRenderer(this);
		gun46_r3.setRotationPoint(-0.001F, 3.8F, -13.5F);
		gun42.addChild(gun46_r3);
		setRotationAngle(gun46_r3, 0.5236F, 0.0F, 0.0F);
		gun46_r3.cubeList.add(new ModelBox(gun46_r3, 52, 72, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun46_r3.cubeList.add(new ModelBox(gun46_r3, 73, 48, 3.402F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun47_r4 = new ModelRenderer(this);
		gun47_r4.setRotationPoint(-0.201F, -1.0F, -34.1F);
		gun42.addChild(gun47_r4);
		setRotationAngle(gun47_r4, 0.5236F, 0.0F, 0.0F);
		gun47_r4.cubeList.add(new ModelBox(gun47_r4, 20, 70, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun47_r4.cubeList.add(new ModelBox(gun47_r4, 0, 72, 3.802F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(3.63F, -2.3113F, -10.5F);
		gun42.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.1309F);
		

		gun47_r5 = new ModelRenderer(this);
		gun47_r5.setRotationPoint(0.0575F, -0.0649F, -1.0F);
		bone3.addChild(gun47_r5);
		setRotationAngle(gun47_r5, 0.0F, 0.0F, -0.349F);
		gun47_r5.cubeList.add(new ModelBox(gun47_r5, 116, 115, -0.5F, 0.0F, -21.5F, 1, 1, 45, -0.001F, false));
		gun47_r5.cubeList.add(new ModelBox(gun47_r5, 127, 161, -0.4999F, -0.5F, -21.5F, 1, 1, 45, 0.0F, false));

		gun52_r1 = new ModelRenderer(this);
		gun52_r1.setRotationPoint(-0.37F, -1.2395F, 14.5F);
		bone3.addChild(gun52_r1);
		setRotationAngle(gun52_r1, 0.0F, 0.0F, -0.349F);
		gun52_r1.cubeList.add(new ModelBox(gun52_r1, 0, 57, -0.5F, -1.0F, -5.5F, 1, 2, 11, 0.0F, false));

		gun50_r1 = new ModelRenderer(this);
		gun50_r1.setRotationPoint(-0.2442F, -0.8939F, 21.5607F);
		bone3.addChild(gun50_r1);
		setRotationAngle(gun50_r1, 0.7854F, 0.0F, -0.349F);
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 0, 20, -0.5001F, -2.0F, -1.5F, 1, 3, 1, 0.0F, false));
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 0, 0, -0.5F, -2.0F, -0.5F, 1, 4, 1, -0.001F, false));

		gun48_r2 = new ModelRenderer(this);
		gun48_r2.setRotationPoint(-0.6778F, -2.0852F, -1.0F);
		bone3.addChild(gun48_r2);
		setRotationAngle(gun48_r2, 0.0F, 0.0F, -0.349F);
		gun48_r2.cubeList.add(new ModelBox(gun48_r2, 176, 202, -0.4999F, -0.5F, -20.5F, 1, 1, 43, 0.001F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.37F, -1.2395F, 6.0F);
		bone3.addChild(bone2);
		

		gun52_r2 = new ModelRenderer(this);
		gun52_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(gun52_r2);
		setRotationAngle(gun52_r2, 0.7854F, 0.0F, -0.349F);
		gun52_r2.cubeList.add(new ModelBox(gun52_r2, 49, 99, -0.5009F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));
		gun52_r2.cubeList.add(new ModelBox(gun52_r2, 99, 21, -0.5009F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));

		gun54_r1 = new ModelRenderer(this);
		gun54_r1.setRotationPoint(0.0F, 0.0F, 2.9F);
		bone2.addChild(gun54_r1);
		setRotationAngle(gun54_r1, 0.7854F, 0.0F, -0.349F);
		gun54_r1.cubeList.add(new ModelBox(gun54_r1, 16, 99, -0.5009F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));
		gun54_r1.cubeList.add(new ModelBox(gun54_r1, 12, 99, -0.5009F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));

		gun55_r1 = new ModelRenderer(this);
		gun55_r1.setRotationPoint(0.0F, 0.0F, -1.6F);
		bone2.addChild(gun55_r1);
		setRotationAngle(gun55_r1, 0.7854F, 0.0F, -0.349F);
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 8, 99, -0.5009F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 4, 99, -0.5009F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(0.0F, 0.0F, -22.5F);
		bone2.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.7854F, 0.0F, -0.349F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 74, 97, -0.5009F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 97, 72, -0.5009F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));

		gun59_r1 = new ModelRenderer(this);
		gun59_r1.setRotationPoint(0.0F, 0.0F, -19.6F);
		bone2.addChild(gun59_r1);
		setRotationAngle(gun59_r1, 0.7854F, 0.0F, -0.349F);
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 97, 74, -0.5009F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 81, 97, -0.5009F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));

		gun58_r2 = new ModelRenderer(this);
		gun58_r2.setRotationPoint(0.0F, 0.0F, -27.0F);
		bone2.addChild(gun58_r2);
		setRotationAngle(gun58_r2, 0.7854F, 0.0F, -0.349F);
		gun58_r2.cubeList.add(new ModelBox(gun58_r2, 85, 97, -0.5009F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));
		gun58_r2.cubeList.add(new ModelBox(gun58_r2, 89, 97, -0.5009F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));

		gun58_r3 = new ModelRenderer(this);
		gun58_r3.setRotationPoint(0.0F, 0.0F, -24.1F);
		bone2.addChild(gun58_r3);
		setRotationAngle(gun58_r3, 0.7854F, 0.0F, -0.349F);
		gun58_r3.cubeList.add(new ModelBox(gun58_r3, 93, 97, -0.5009F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));
		gun58_r3.cubeList.add(new ModelBox(gun58_r3, 98, 15, -0.5009F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));

		gun57_r1 = new ModelRenderer(this);
		gun57_r1.setRotationPoint(0.0F, 0.0F, -18.0F);
		bone2.addChild(gun57_r1);
		setRotationAngle(gun57_r1, 0.7854F, 0.0F, -0.349F);
		gun57_r1.cubeList.add(new ModelBox(gun57_r1, 98, 17, -0.5009F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));
		gun57_r1.cubeList.add(new ModelBox(gun57_r1, 24, 98, -0.5009F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));

		gun57_r2 = new ModelRenderer(this);
		gun57_r2.setRotationPoint(0.0F, 0.0F, -15.1F);
		bone2.addChild(gun57_r2);
		setRotationAngle(gun57_r2, 0.7854F, 0.0F, -0.349F);
		gun57_r2.cubeList.add(new ModelBox(gun57_r2, 32, 98, -0.5009F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));
		gun57_r2.cubeList.add(new ModelBox(gun57_r2, 36, 98, -0.5009F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));

		gun56_r1 = new ModelRenderer(this);
		gun56_r1.setRotationPoint(0.0F, 0.0F, -9.0F);
		bone2.addChild(gun56_r1);
		setRotationAngle(gun56_r1, 0.7854F, 0.0F, -0.349F);
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 40, 98, -0.5009F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 98, 45, -0.5009F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));

		gun56_r2 = new ModelRenderer(this);
		gun56_r2.setRotationPoint(0.0F, 0.0F, -6.1F);
		bone2.addChild(gun56_r2);
		setRotationAngle(gun56_r2, 0.7854F, 0.0F, -0.349F);
		gun56_r2.cubeList.add(new ModelBox(gun56_r2, 46, 98, -0.5009F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));
		gun56_r2.cubeList.add(new ModelBox(gun56_r2, 98, 48, -0.5009F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));

		gun55_r2 = new ModelRenderer(this);
		gun55_r2.setRotationPoint(0.0F, 0.0F, -13.5F);
		bone2.addChild(gun55_r2);
		setRotationAngle(gun55_r2, 0.7854F, 0.0F, -0.349F);
		gun55_r2.cubeList.add(new ModelBox(gun55_r2, 98, 50, -0.5009F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));
		gun55_r2.cubeList.add(new ModelBox(gun55_r2, 52, 98, -0.5009F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));

		gun55_r3 = new ModelRenderer(this);
		gun55_r3.setRotationPoint(0.0F, 0.0F, -10.6F);
		bone2.addChild(gun55_r3);
		setRotationAngle(gun55_r3, 0.7854F, 0.0F, -0.349F);
		gun55_r3.cubeList.add(new ModelBox(gun55_r3, 98, 52, -0.5009F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));
		gun55_r3.cubeList.add(new ModelBox(gun55_r3, 98, 89, -0.5009F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));

		gun54_r2 = new ModelRenderer(this);
		gun54_r2.setRotationPoint(0.0F, 0.0F, -4.5F);
		bone2.addChild(gun54_r2);
		setRotationAngle(gun54_r2, 0.7854F, 0.0F, -0.349F);
		gun54_r2.cubeList.add(new ModelBox(gun54_r2, 96, 98, -0.5009F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));
		gun54_r2.cubeList.add(new ModelBox(gun54_r2, 0, 99, -0.5009F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.2845F, -1.0046F, -22.0F);
		bone3.addChild(bone);
		

		gun51_r1 = new ModelRenderer(this);
		gun51_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(gun51_r1);
		setRotationAngle(gun51_r1, 0.0F, 0.0F, -0.349F);
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 68, 84, -0.5005F, -1.25F, 26.5F, 1, 2, 2, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 85, 58, -0.5005F, -1.25F, 17.5F, 1, 2, 2, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 85, 62, -0.5005F, -1.25F, 22.0F, 1, 2, 2, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 83, 32, -0.5005F, -1.25F, 4.0F, 1, 2, 2, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 83, 38, -0.5005F, -1.25F, -0.5F, 1, 2, 2, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 48, 84, -0.5005F, -1.25F, 8.5F, 1, 2, 2, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 58, 84, -0.5005F, -1.25F, 13.0F, 1, 2, 2, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.77F, -2.3113F, -10.5F);
		gun42.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.1309F);
		

		gun48_r3 = new ModelRenderer(this);
		gun48_r3.setRotationPoint(-0.0575F, -0.0649F, -1.0F);
		bone4.addChild(gun48_r3);
		setRotationAngle(gun48_r3, 0.0F, 0.0F, 0.349F);
		gun48_r3.cubeList.add(new ModelBox(gun48_r3, 45, 172, -0.5F, 0.0F, -21.5F, 1, 1, 43, -0.001F, false));
		gun48_r3.cubeList.add(new ModelBox(gun48_r3, 174, 0, -0.5001F, -0.5F, -21.5F, 1, 1, 43, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(0.37F, -1.2395F, 14.5F);
		bone4.addChild(gun53_r1);
		setRotationAngle(gun53_r1, 0.0F, 0.0F, 0.349F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 0, 28, -0.5F, -1.0F, -5.5F, 1, 2, 11, 0.0F, false));

		gun50_r2 = new ModelRenderer(this);
		gun50_r2.setRotationPoint(0.2442F, -0.8939F, 21.5607F);
		bone4.addChild(gun50_r2);
		setRotationAngle(gun50_r2, 0.7854F, 0.0F, 0.349F);
		gun50_r2.cubeList.add(new ModelBox(gun50_r2, 97, 26, -0.5F, -2.0F, -0.5F, 1, 1, 1, 0.0F, false));

		gun49_r1 = new ModelRenderer(this);
		gun49_r1.setRotationPoint(0.6778F, -2.0852F, -1.0F);
		bone4.addChild(gun49_r1);
		setRotationAngle(gun49_r1, 0.0F, 0.0F, 0.349F);
		gun49_r1.cubeList.add(new ModelBox(gun49_r1, 174, 57, -0.5001F, -0.5F, -21.5F, 1, 1, 43, 0.001F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.37F, -1.2395F, 6.0F);
		bone4.addChild(bone5);
		

		gun53_r2 = new ModelRenderer(this);
		gun53_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(gun53_r2);
		setRotationAngle(gun53_r2, 0.7854F, 0.0F, 0.349F);
		gun53_r2.cubeList.add(new ModelBox(gun53_r2, 95, 21, -0.4991F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));
		gun53_r2.cubeList.add(new ModelBox(gun53_r2, 49, 95, -0.4991F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));

		gun55_r4 = new ModelRenderer(this);
		gun55_r4.setRotationPoint(0.0F, 0.0F, 2.9F);
		bone5.addChild(gun55_r4);
		setRotationAngle(gun55_r4, 0.7854F, 0.0F, 0.349F);
		gun55_r4.cubeList.add(new ModelBox(gun55_r4, 95, 49, -0.4991F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));
		gun55_r4.cubeList.add(new ModelBox(gun55_r4, 95, 51, -0.4991F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));

		gun56_r3 = new ModelRenderer(this);
		gun56_r3.setRotationPoint(0.0F, 0.0F, -1.6F);
		bone5.addChild(gun56_r3);
		setRotationAngle(gun56_r3, 0.7854F, 0.0F, 0.349F);
		gun56_r3.cubeList.add(new ModelBox(gun56_r3, 74, 95, -0.4991F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));
		gun56_r3.cubeList.add(new ModelBox(gun56_r3, 16, 97, -0.4991F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));

		gun59_r2 = new ModelRenderer(this);
		gun59_r2.setRotationPoint(0.0F, 0.0F, -22.5F);
		bone5.addChild(gun59_r2);
		setRotationAngle(gun59_r2, 0.7854F, 0.0F, 0.349F);
		gun59_r2.cubeList.add(new ModelBox(gun59_r2, 95, 80, -0.4991F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));
		gun59_r2.cubeList.add(new ModelBox(gun59_r2, 97, 24, -0.4991F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));

		gun60_r2 = new ModelRenderer(this);
		gun60_r2.setRotationPoint(0.0F, 0.0F, -19.6F);
		bone5.addChild(gun60_r2);
		setRotationAngle(gun60_r2, 0.7854F, 0.0F, 0.349F);
		gun60_r2.cubeList.add(new ModelBox(gun60_r2, 81, 95, -0.4991F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));
		gun60_r2.cubeList.add(new ModelBox(gun60_r2, 95, 82, -0.4991F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));

		gun59_r3 = new ModelRenderer(this);
		gun59_r3.setRotationPoint(0.0F, 0.0F, -27.0F);
		bone5.addChild(gun59_r3);
		setRotationAngle(gun59_r3, 0.7854F, 0.0F, 0.349F);
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 85, 95, -0.4991F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 95, 88, -0.4991F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));

		gun59_r4 = new ModelRenderer(this);
		gun59_r4.setRotationPoint(0.0F, 0.0F, -24.1F);
		bone5.addChild(gun59_r4);
		setRotationAngle(gun59_r4, 0.7854F, 0.0F, 0.349F);
		gun59_r4.cubeList.add(new ModelBox(gun59_r4, 89, 95, -0.4991F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));
		gun59_r4.cubeList.add(new ModelBox(gun59_r4, 95, 90, -0.4991F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));

		gun58_r4 = new ModelRenderer(this);
		gun58_r4.setRotationPoint(0.0F, 0.0F, -18.0F);
		bone5.addChild(gun58_r4);
		setRotationAngle(gun58_r4, 0.7854F, 0.0F, 0.349F);
		gun58_r4.cubeList.add(new ModelBox(gun58_r4, 93, 95, -0.4991F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));
		gun58_r4.cubeList.add(new ModelBox(gun58_r4, 3, 96, -0.4991F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));

		gun58_r5 = new ModelRenderer(this);
		gun58_r5.setRotationPoint(0.0F, 0.0F, -15.1F);
		bone5.addChild(gun58_r5);
		setRotationAngle(gun58_r5, 0.7854F, 0.0F, 0.349F);
		gun58_r5.cubeList.add(new ModelBox(gun58_r5, 24, 96, -0.4991F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));
		gun58_r5.cubeList.add(new ModelBox(gun58_r5, 32, 96, -0.4991F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));

		gun57_r3 = new ModelRenderer(this);
		gun57_r3.setRotationPoint(0.0F, 0.0F, -9.0F);
		bone5.addChild(gun57_r3);
		setRotationAngle(gun57_r3, 0.7854F, 0.0F, 0.349F);
		gun57_r3.cubeList.add(new ModelBox(gun57_r3, 36, 96, -0.4991F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));
		gun57_r3.cubeList.add(new ModelBox(gun57_r3, 40, 96, -0.4991F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));

		gun57_r4 = new ModelRenderer(this);
		gun57_r4.setRotationPoint(0.0F, 0.0F, -6.1F);
		bone5.addChild(gun57_r4);
		setRotationAngle(gun57_r4, 0.7854F, 0.0F, 0.349F);
		gun57_r4.cubeList.add(new ModelBox(gun57_r4, 46, 96, -0.4991F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));
		gun57_r4.cubeList.add(new ModelBox(gun57_r4, 52, 96, -0.4991F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));

		gun56_r4 = new ModelRenderer(this);
		gun56_r4.setRotationPoint(0.0F, 0.0F, -13.5F);
		bone5.addChild(gun56_r4);
		setRotationAngle(gun56_r4, 0.7854F, 0.0F, 0.349F);
		gun56_r4.cubeList.add(new ModelBox(gun56_r4, 96, 96, -0.4991F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));
		gun56_r4.cubeList.add(new ModelBox(gun56_r4, 97, 0, -0.4991F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));

		gun56_r5 = new ModelRenderer(this);
		gun56_r5.setRotationPoint(0.0F, 0.0F, -10.6F);
		bone5.addChild(gun56_r5);
		setRotationAngle(gun56_r5, 0.7854F, 0.0F, 0.349F);
		gun56_r5.cubeList.add(new ModelBox(gun56_r5, 97, 2, -0.4991F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));
		gun56_r5.cubeList.add(new ModelBox(gun56_r5, 97, 4, -0.4991F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));

		gun55_r5 = new ModelRenderer(this);
		gun55_r5.setRotationPoint(0.0F, 0.0F, -4.5F);
		bone5.addChild(gun55_r5);
		setRotationAngle(gun55_r5, 0.7854F, 0.0F, 0.349F);
		gun55_r5.cubeList.add(new ModelBox(gun55_r5, 97, 7, -0.4991F, -0.7F, 0.15F, 1, 1, 1, 0.0F, false));
		gun55_r5.cubeList.add(new ModelBox(gun55_r5, 97, 9, -0.4991F, 0.375F, -0.925F, 1, 1, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.2845F, -1.0046F, -22.0F);
		bone4.addChild(bone6);
		

		gun52_r3 = new ModelRenderer(this);
		gun52_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(gun52_r3);
		setRotationAngle(gun52_r3, 0.0F, 0.0F, 0.349F);
		gun52_r3.cubeList.add(new ModelBox(gun52_r3, 41, 57, -0.4995F, -1.25F, 26.5F, 1, 2, 2, 0.0F, false));
		gun52_r3.cubeList.add(new ModelBox(gun52_r3, 49, 57, -0.4995F, -1.25F, 17.5F, 1, 2, 2, 0.0F, false));
		gun52_r3.cubeList.add(new ModelBox(gun52_r3, 58, 0, -0.4995F, -1.25F, 22.0F, 1, 2, 2, 0.0F, false));
		gun52_r3.cubeList.add(new ModelBox(gun52_r3, 33, 64, -0.4995F, -1.25F, 4.0F, 1, 2, 2, 0.0F, false));
		gun52_r3.cubeList.add(new ModelBox(gun52_r3, 36, 72, -0.4995F, -1.25F, -0.5F, 1, 2, 2, 0.0F, false));
		gun52_r3.cubeList.add(new ModelBox(gun52_r3, 18, 77, -0.4995F, -1.25F, 8.5F, 1, 2, 2, 0.0F, false));
		gun52_r3.cubeList.add(new ModelBox(gun52_r3, 83, 14, -0.4995F, -1.25F, 13.0F, 1, 2, 2, 0.0F, false));

		gun39 = new ModelRenderer(this);
		gun39.setRotationPoint(-3.7F, -32.0F, -35.5F);
		gun.addChild(gun39);
		setRotationAngle(gun39, -0.0175F, 0.0F, 0.0F);
		

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(6.151F, 0.7094F, 22.0228F);
		gun39.addChild(gun40_r1);
		setRotationAngle(gun40_r1, -0.0175F, 0.0F, 0.0F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 219, 44, -4.001F, -0.5F, -17.0F, 2, 1, 34, 0.0F, false));
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 230, 239, -5.901F, -0.5F, -17.0F, 2, 1, 34, 0.0F, false));

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(dustcover);
		

		DustCover46_r1 = new ModelRenderer(this);
		DustCover46_r1.setRotationPoint(-1.5F, -38.1021F, 1.0367F);
		dustcover.addChild(DustCover46_r1);
		setRotationAngle(DustCover46_r1, -0.48F, 0.0F, 0.0F);
		DustCover46_r1.cubeList.add(new ModelBox(DustCover46_r1, 83, 8, -1.0F, -0.5001F, -0.15F, 2, 1, 3, 0.0F, false));
		DustCover46_r1.cubeList.add(new ModelBox(DustCover46_r1, 83, 28, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

		DustCover45_r1 = new ModelRenderer(this);
		DustCover45_r1.setRotationPoint(-1.5F, -38.1021F, 1.0367F);
		dustcover.addChild(DustCover45_r1);
		setRotationAngle(DustCover45_r1, -0.4863F, 0.1546F, -0.0812F);
		DustCover45_r1.cubeList.add(new ModelBox(DustCover45_r1, 0, 62, 0.4F, -0.4999F, -1.0F, 1, 1, 4, 0.0F, false));

		DustCover46_r2 = new ModelRenderer(this);
		DustCover46_r2.setRotationPoint(-0.8844F, -38.743F, -0.1945F);
		dustcover.addChild(DustCover46_r2);
		setRotationAngle(DustCover46_r2, -0.553F, 0.4968F, -0.2861F);
		DustCover46_r2.cubeList.add(new ModelBox(DustCover46_r2, 97, 30, -0.5F, -0.499F, -0.5F, 1, 1, 1, 0.0F, false));
		DustCover46_r2.cubeList.add(new ModelBox(DustCover46_r2, 97, 28, -0.5F, -0.498F, -1.0F, 1, 1, 1, 0.0F, false));

		DustCover44_r1 = new ModelRenderer(this);
		DustCover44_r1.setRotationPoint(-1.5F, -38.1021F, 1.0367F);
		dustcover.addChild(DustCover44_r1);
		setRotationAngle(DustCover44_r1, -0.4863F, -0.1546F, 0.0812F);
		DustCover44_r1.cubeList.add(new ModelBox(DustCover44_r1, 73, 48, -1.4F, -0.4999F, -1.0F, 1, 1, 4, 0.0F, false));

		DustCover45_r2 = new ModelRenderer(this);
		DustCover45_r2.setRotationPoint(-2.1156F, -38.743F, -0.1945F);
		dustcover.addChild(DustCover45_r2);
		setRotationAngle(DustCover45_r2, -0.553F, -0.4968F, 0.2861F);
		DustCover45_r2.cubeList.add(new ModelBox(DustCover45_r2, 66, 99, -0.5F, -0.499F, -0.5F, 1, 1, 1, 0.0F, false));
		DustCover45_r2.cubeList.add(new ModelBox(DustCover45_r2, 99, 67, -0.5F, -0.498F, -1.0F, 1, 1, 1, 0.0F, false));

		DustCover5 = new ModelRenderer(this);
		DustCover5.setRotationPoint(-2.8F, -39.125F, -21.5F);
		dustcover.addChild(DustCover5);
		setRotationAngle(DustCover5, 0.0F, 0.0F, 0.3346F);
		DustCover5.cubeList.add(new ModelBox(DustCover5, 116, 18, 0.0F, 0.0F, 3.499F, 1, 2, 18, 0.0F, false));
		DustCover5.cubeList.add(new ModelBox(DustCover5, 0, 82, 0.011F, 1.7753F, 3.0F, 1, 1, 22, 0.0F, false));
		DustCover5.cubeList.add(new ModelBox(DustCover5, 30, 87, 0.011F, 0.7753F, 21.0F, 1, 1, 2, 0.0F, false));

		DustCover6_r1 = new ModelRenderer(this);
		DustCover6_r1.setRotationPoint(0.511F, 1.4379F, 22.3286F);
		DustCover5.addChild(DustCover6_r1);
		setRotationAngle(DustCover6_r1, -0.5061F, 0.0F, 0.0F);
		DustCover6_r1.cubeList.add(new ModelBox(DustCover6_r1, 70, 14, -0.5F, -0.9636F, -1.3156F, 1, 1, 4, 0.001F, false));

		DustCover3 = new ModelRenderer(this);
		DustCover3.setRotationPoint(-0.1945F, -37.5614F, -3.5872F);
		dustcover.addChild(DustCover3);
		setRotationAngle(DustCover3, 0.0F, 0.0F, -0.3346F);
		DustCover3.cubeList.add(new ModelBox(DustCover3, 0, 0, -0.4917F, -1.4787F, -22.4138F, 1, 2, 26, 0.0F, false));
		DustCover3.cubeList.add(new ModelBox(DustCover3, 0, 255, -0.5028F, 0.2966F, -21.9128F, 1, 1, 29, 0.0F, false));
		DustCover3.cubeList.add(new ModelBox(DustCover3, 24, 87, -0.5028F, -0.7034F, 3.0872F, 1, 1, 2, 0.0F, false));

		DustCover7_r1 = new ModelRenderer(this);
		DustCover7_r1.setRotationPoint(-0.0028F, -0.0408F, 4.4159F);
		DustCover3.addChild(DustCover7_r1);
		setRotationAngle(DustCover7_r1, -0.5061F, 0.0F, 0.0F);
		DustCover7_r1.cubeList.add(new ModelBox(DustCover7_r1, 13, 62, -0.5F, -0.9636F, -1.3156F, 1, 1, 4, 0.001F, false));

		DustCover2 = new ModelRenderer(this);
		DustCover2.setRotationPoint(-0.2218F, -37.7233F, -9.5005F);
		dustcover.addChild(DustCover2);
		setRotationAngle(DustCover2, 0.0F, 0.0F, -0.3346F);
		

		DustCover4 = new ModelRenderer(this);
		DustCover4.setRotationPoint(-2.0F, -39.7F, -33.5F);
		dustcover.addChild(DustCover4);
		setRotationAngle(DustCover4, 0.0F, 0.0F, 0.9295F);
		DustCover4.cubeList.add(new ModelBox(DustCover4, 74, 99, 0.0F, 0.0F, 31.55F, 1, 1, 1, 0.0F, false));
		DustCover4.cubeList.add(new ModelBox(DustCover4, 0, 57, 0.0F, 0.0F, 8.0F, 1, 1, 24, 0.001F, false));

		DustCover5_r1 = new ModelRenderer(this);
		DustCover5_r1.setRotationPoint(0.35F, 0.4938F, 32.5845F);
		DustCover4.addChild(DustCover5_r1);
		setRotationAngle(DustCover5_r1, 0.8552F, 0.0F, 0.0F);
		DustCover5_r1.cubeList.add(new ModelBox(DustCover5_r1, 70, 99, -0.5F, -0.4999F, -0.5F, 1, 1, 1, -0.151F, false));

		DustCover6 = new ModelRenderer(this);
		DustCover6.setRotationPoint(-1.0F, -39.7F, -33.5F);
		dustcover.addChild(DustCover6);
		setRotationAngle(DustCover6, 0.0F, 0.0F, -0.9295F);
		DustCover6.cubeList.add(new ModelBox(DustCover6, 49, 97, -1.0F, 0.0F, 31.55F, 1, 1, 1, 0.0F, false));
		DustCover6.cubeList.add(new ModelBox(DustCover6, 0, 28, -1.0F, 0.0F, 8.0F, 1, 1, 24, 0.001F, false));

		DustCover6_r2 = new ModelRenderer(this);
		DustCover6_r2.setRotationPoint(-0.35F, 0.4938F, 32.5845F);
		DustCover6.addChild(DustCover6_r2);
		setRotationAngle(DustCover6_r2, 0.8552F, 0.0F, 0.0F);
		DustCover6_r2.cubeList.add(new ModelBox(DustCover6_r2, 97, 34, -0.5F, -0.4999F, -0.5F, 1, 1, 1, -0.151F, false));

		DustCover1 = new ModelRenderer(this);
		DustCover1.setRotationPoint(-2.0F, -39.7F, -33.5F);
		dustcover.addChild(DustCover1);
		DustCover1.cubeList.add(new ModelBox(DustCover1, 90, 172, 0.0F, 0.0F, 0.0F, 1, 1, 32, 0.0F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 99, 65, 0.0F, 0.001F, 31.55F, 1, 1, 1, 0.0F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 163, 114, -0.0899F, -0.3635F, -35.0F, 2, 1, 43, 0.0F, false));
		DustCover1.cubeList.add(new ModelBox(DustCover1, 174, 158, -0.9101F, -0.3634F, -35.001F, 1, 1, 43, 0.0F, false));

		DustCover3_r1 = new ModelRenderer(this);
		DustCover3_r1.setRotationPoint(0.25F, 0.344F, 7.9994F);
		DustCover1.addChild(DustCover3_r1);
		setRotationAngle(DustCover3_r1, -0.7854F, 0.0F, 0.0F);
		DustCover3_r1.cubeList.add(new ModelBox(DustCover3_r1, 7, 0, -0.3399F, -0.5001F, -0.4995F, 2, 1, 2, 0.0F, false));
		DustCover3_r1.cubeList.add(new ModelBox(DustCover3_r1, 38, 86, -1.1601F, -0.4999F, -0.5005F, 1, 1, 2, 0.0F, false));

		DustCover36 = new ModelRenderer(this);
		DustCover36.setRotationPoint(-0.2F, -37.5F, -24.5F);
		dustcover.addChild(DustCover36);
		setRotationAngle(DustCover36, -1.1525F, 0.0F, 0.0F);
		

		DustCover18 = new ModelRenderer(this);
		DustCover18.setRotationPoint(-3.8F, -36.0F, 2.5F);
		dustcover.addChild(DustCover18);
		

		DustCover17 = new ModelRenderer(this);
		DustCover17.setRotationPoint(-3.8F, -36.0F, -9.5F);
		dustcover.addChild(DustCover17);
		

		DustCover19 = new ModelRenderer(this);
		DustCover19.setRotationPoint(-0.2F, -36.0F, -24.5F);
		dustcover.addChild(DustCover19);
		

		stocc = new ModelRenderer(this);
		stocc.setRotationPoint(-1.5F, -26.2F, -17.5F);
		gun.addChild(stocc);
		

		stocc4_r1 = new ModelRenderer(this);
		stocc4_r1.setRotationPoint(0.0F, 0.1065F, 22.1146F);
		stocc.addChild(stocc4_r1);
		setRotationAngle(stocc4_r1, -0.0349F, 0.0F, 0.0F);
		stocc4_r1.cubeList.add(new ModelBox(stocc4_r1, 43, 0, -2.0F, -10.75F, -1.4F, 4, 6, 2, 0.0F, false));

		stocc3_r1 = new ModelRenderer(this);
		stocc3_r1.setRotationPoint(0.0F, 0.0016F, 22.1284F);
		stocc.addChild(stocc3_r1);
		setRotationAngle(stocc3_r1, 0.0524F, 0.0F, 0.0F);
		stocc3_r1.cubeList.add(new ModelBox(stocc3_r1, 28, 0, -2.0F, -4.75F, -1.0F, 4, 9, 2, 0.0F, false));

		stocc2_r1 = new ModelRenderer(this);
		stocc2_r1.setRotationPoint(0.0F, 1.0788F, 20.6828F);
		stocc.addChild(stocc2_r1);
		setRotationAngle(stocc2_r1, 0.0524F, 0.0F, 0.0F);
		stocc2_r1.cubeList.add(new ModelBox(stocc2_r1, 0, 28, -2.0F, -5.0F, -0.5F, 4, 8, 1, -0.001F, false));

		stocc5_r1 = new ModelRenderer(this);
		stocc5_r1.setRotationPoint(0.0F, 0.2183F, 3.192F);
		stocc.addChild(stocc5_r1);
		setRotationAngle(stocc5_r1, -0.6981F, 0.0F, 0.0F);
		stocc5_r1.cubeList.add(new ModelBox(stocc5_r1, 14, 41, -2.001F, -5.5F, -0.5F, 4, 7, 1, 0.0F, false));

		stocc5_r2 = new ModelRenderer(this);
		stocc5_r2.setRotationPoint(-1.0F, -0.7298F, 6.9001F);
		stocc.addChild(stocc5_r2);
		setRotationAngle(stocc5_r2, -0.3054F, 0.0F, 0.0F);
		stocc5_r2.cubeList.add(new ModelBox(stocc5_r2, 92, 38, -1.0F, -2.5F, -2.5F, 4, 3, 4, 0.0F, false));

		stocc7_r1 = new ModelRenderer(this);
		stocc7_r1.setRotationPoint(-1.0F, 0.6816F, 9.8669F);
		stocc.addChild(stocc7_r1);
		setRotationAngle(stocc7_r1, -0.5672F, 0.0F, 0.0F);
		stocc7_r1.cubeList.add(new ModelBox(stocc7_r1, 85, 72, -0.999F, -2.5F, -2.0F, 4, 3, 4, 0.0F, false));

		stocc7_r2 = new ModelRenderer(this);
		stocc7_r2.setRotationPoint(-1.0F, 1.3961F, 11.1179F);
		stocc.addChild(stocc7_r2);
		setRotationAngle(stocc7_r2, -0.6981F, 0.0F, 0.0F);
		stocc7_r2.cubeList.add(new ModelBox(stocc7_r2, 95, 80, -1.0F, -3.5F, -0.5F, 4, 4, 4, 0.0F, false));

		stocc6_r1 = new ModelRenderer(this);
		stocc6_r1.setRotationPoint(0.0F, 2.1461F, 10.6179F);
		stocc.addChild(stocc6_r1);
		setRotationAngle(stocc6_r1, -0.6981F, 0.0F, 0.0F);
		stocc6_r1.cubeList.add(new ModelBox(stocc6_r1, 83, 4, -1.0F, -0.5F, 0.5F, 2, 1, 3, 0.0F, false));

		stocc6_r2 = new ModelRenderer(this);
		stocc6_r2.setRotationPoint(0.0F, 1.4316F, 9.3669F);
		stocc.addChild(stocc6_r2);
		setRotationAngle(stocc6_r2, -0.5672F, 0.0F, 0.0F);
		stocc6_r2.cubeList.add(new ModelBox(stocc6_r2, 43, 8, -1.0F, -0.5F, -2.0F, 2, 1, 4, 0.001F, false));

		stocc4_r2 = new ModelRenderer(this);
		stocc4_r2.setRotationPoint(0.0F, 0.0202F, 6.4001F);
		stocc.addChild(stocc4_r2);
		setRotationAngle(stocc4_r2, -0.3054F, 0.0F, 0.0F);
		stocc4_r2.cubeList.add(new ModelBox(stocc4_r2, 81, 80, -1.0F, -0.5F, -2.5F, 2, 1, 4, 0.0F, false));

		stocc6_r3 = new ModelRenderer(this);
		stocc6_r3.setRotationPoint(0.0F, -2.2464F, -9.0113F);
		stocc.addChild(stocc6_r3);
		setRotationAngle(stocc6_r3, -0.829F, 0.0F, 0.0F);
		stocc6_r3.cubeList.add(new ModelBox(stocc6_r3, 58, 75, -2.001F, -1.5F, -2.0F, 4, 2, 2, 0.0F, false));

		stocc5_r3 = new ModelRenderer(this);
		stocc5_r3.setRotationPoint(0.0F, -3.86F, -10.5808F);
		stocc.addChild(stocc5_r3);
		setRotationAngle(stocc5_r3, -0.3054F, 0.0F, 0.0F);
		stocc5_r3.cubeList.add(new ModelBox(stocc5_r3, 41, 65, -2.002F, -0.5F, -2.375F, 4, 1, 3, 0.0F, false));

		stocc6_r4 = new ModelRenderer(this);
		stocc6_r4.setRotationPoint(1.7502F, -3.0612F, -2.5339F);
		stocc.addChild(stocc6_r4);
		setRotationAngle(stocc6_r4, -0.0349F, 0.0F, 0.0F);
		stocc6_r4.cubeList.add(new ModelBox(stocc6_r4, 0, 3, -0.4987F, -1.5F, -6.0F, 1, 3, 12, 0.0F, false));

		stocc5_r4 = new ModelRenderer(this);
		stocc5_r4.setRotationPoint(0.0F, -2.0619F, -2.5688F);
		stocc.addChild(stocc5_r4);
		setRotationAngle(stocc5_r4, -0.0349F, 0.0F, 0.0F);
		stocc5_r4.cubeList.add(new ModelBox(stocc5_r4, 81, 80, -2.2503F, -2.5F, -6.0F, 1, 3, 12, 0.0F, false));
		stocc5_r4.cubeList.add(new ModelBox(stocc5_r4, 70, 19, 1.25F, -2.5F, 5.875F, 1, 1, 2, 0.0F, false));
		stocc5_r4.cubeList.add(new ModelBox(stocc5_r4, 47, 76, -2.25F, -2.5F, 5.875F, 1, 1, 2, 0.0F, false));

		stocc6_r5 = new ModelRenderer(this);
		stocc6_r5.setRotationPoint(1.75F, 0.2055F, 2.5811F);
		stocc.addChild(stocc6_r5);
		setRotationAngle(stocc6_r5, -0.6545F, 0.0F, 0.0F);
		stocc6_r5.cubeList.add(new ModelBox(stocc6_r5, 0, 41, -0.5001F, -3.5F, -2.5F, 1, 5, 3, 0.0F, false));
		stocc6_r5.cubeList.add(new ModelBox(stocc6_r5, 73, 4, -0.5F, -4.5F, -1.5F, 1, 1, 2, -0.002F, false));
		stocc6_r5.cubeList.add(new ModelBox(stocc6_r5, 95, 14, -0.5F, -5.275F, -0.5F, 1, 1, 1, 0.0F, false));
		stocc6_r5.cubeList.add(new ModelBox(stocc6_r5, 36, 76, -4.0F, -4.5F, -1.5F, 1, 1, 2, -0.002F, false));
		stocc6_r5.cubeList.add(new ModelBox(stocc6_r5, 95, 16, -4.0F, -5.275F, -0.5F, 1, 1, 1, 0.0F, false));
		stocc6_r5.cubeList.add(new ModelBox(stocc6_r5, 26, 41, -4.0F, -3.5F, -2.5F, 1, 5, 3, -0.001F, false));

		stocc5_r5 = new ModelRenderer(this);
		stocc5_r5.setRotationPoint(1.7501F, -2.0118F, -3.0563F);
		stocc.addChild(stocc5_r5);
		setRotationAngle(stocc5_r5, -0.3054F, 0.0F, 0.0F);
		stocc5_r5.cubeList.add(new ModelBox(stocc5_r5, 24, 82, -0.4993F, -1.0F, -6.0F, 1, 2, 12, 0.0F, false));
		stocc5_r5.cubeList.add(new ModelBox(stocc5_r5, 83, 0, -4.0002F, -1.0F, -6.0F, 1, 2, 12, 0.0F, false));

		stocc6_r6 = new ModelRenderer(this);
		stocc6_r6.setRotationPoint(5.0001F, -0.5812F, -3.5073F);
		stocc.addChild(stocc6_r6);
		setRotationAngle(stocc6_r6, -0.3054F, 0.0F, 0.0F);
		stocc6_r6.cubeList.add(new ModelBox(stocc6_r6, 83, 115, -3.5F, -0.5F, -6.0F, 1, 1, 12, 0.0F, false));
		stocc6_r6.cubeList.add(new ModelBox(stocc6_r6, 116, 115, -7.5002F, -0.5F, -6.0F, 1, 1, 12, 0.0F, false));

		stocc4_r3 = new ModelRenderer(this);
		stocc4_r3.setRotationPoint(0.0F, 3.4194F, 17.0276F);
		stocc.addChild(stocc4_r3);
		setRotationAngle(stocc4_r3, -0.0349F, 0.0F, 0.0F);
		stocc4_r3.cubeList.add(new ModelBox(stocc4_r3, 28, 15, -1.998F, -6.5F, -10.5F, 4, 3, 7, 0.0F, false));
		stocc4_r3.cubeList.add(new ModelBox(stocc4_r3, 58, 0, -1.998F, -6.5F, -3.5F, 4, 7, 7, 0.0F, false));

		stocc3_r2 = new ModelRenderer(this);
		stocc3_r2.setRotationPoint(0.0F, 4.4188F, 16.9927F);
		stocc.addChild(stocc3_r2);
		setRotationAngle(stocc3_r2, -0.0349F, 0.0F, 0.0F);
		stocc3_r2.cubeList.add(new ModelBox(stocc3_r2, 58, 14, -1.0F, -0.5F, -4.0F, 2, 1, 8, 0.001F, false));

		stocc1_r1 = new ModelRenderer(this);
		stocc1_r1.setRotationPoint(0.0F, -4.0349F, 4.0006F);
		stocc.addChild(stocc1_r1);
		setRotationAngle(stocc1_r1, -0.0349F, 0.0F, 0.0F);
		stocc1_r1.cubeList.add(new ModelBox(stocc1_r1, 137, 207, -2.0F, -0.5F, -17.0F, 4, 1, 34, 0.0F, false));

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 2.0F, -15.0F);
		gun.addChild(handguard);
		handguard.cubeList.add(new ModelBox(handguard, 58, 48, -3.999F, -36.5F, -55.5F, 5, 3, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 33, 57, 0.051F, -36.25F, -52.5F, 1, 2, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 50, 15, -4.051F, -36.25F, -52.5F, 1, 2, 2, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-4.251F, -34.6F, -51.75F);
		handguard.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.3665F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 20, 74, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 75, 73, 4.502F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun153_r1 = new ModelRenderer(this);
		gun153_r1.setRotationPoint(-4.151F, -34.6F, -43.75F);
		handguard.addChild(gun153_r1);
		setRotationAngle(gun153_r1, 0.3665F, 0.0F, 0.0F);
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 73, 50, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 68, 75, 4.302F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun152_r2 = new ModelRenderer(this);
		gun152_r2.setRotationPoint(-4.151F, -35.55F, -50.25F);
		handguard.addChild(gun152_r2);
		setRotationAngle(gun152_r2, 0.0F, 0.0F, 0.7854F);
		gun152_r2.cubeList.add(new ModelBox(gun152_r2, 97, 0, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));
		gun152_r2.cubeList.add(new ModelBox(gun152_r2, 58, 80, 0.0F, -1.0F, 7.5F, 1, 1, 8, 0.0F, false));

		gun153_r2 = new ModelRenderer(this);
		gun153_r2.setRotationPoint(-4.151F, -34.8F, -50.25F);
		handguard.addChild(gun153_r2);
		setRotationAngle(gun153_r2, 0.0F, 0.0F, 0.7854F);
		gun153_r2.cubeList.add(new ModelBox(gun153_r2, 96, 48, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));
		gun153_r2.cubeList.add(new ModelBox(gun153_r2, 26, 72, 0.0F, -1.0F, 7.5F, 1, 1, 8, 0.0F, false));

		gun155_r1 = new ModelRenderer(this);
		gun155_r1.setRotationPoint(-4.151F, -34.05F, -42.75F);
		handguard.addChild(gun155_r1);
		setRotationAngle(gun155_r1, 0.0F, 0.0F, 0.7854F);
		gun155_r1.cubeList.add(new ModelBox(gun155_r1, 83, 38, 0.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(-4.151F, -33.3F, -42.25F);
		handguard.addChild(gun156_r1);
		setRotationAngle(gun156_r1, 0.0F, 0.0F, 0.7854F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 38, 96, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun157_r1 = new ModelRenderer(this);
		gun157_r1.setRotationPoint(-4.151F, -32.55F, -40.7F);
		handguard.addChild(gun157_r1);
		setRotationAngle(gun157_r1, 0.0F, 0.0F, 0.7854F);
		gun157_r1.cubeList.add(new ModelBox(gun157_r1, 0, 57, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun158_r1 = new ModelRenderer(this);
		gun158_r1.setRotationPoint(-4.151F, -31.8F, -40.2F);
		handguard.addChild(gun158_r1);
		setRotationAngle(gun158_r1, 0.0F, 0.0F, 0.7854F);
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 26, 76, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun152_r3 = new ModelRenderer(this);
		gun152_r3.setRotationPoint(1.151F, -35.55F, -42.75F);
		handguard.addChild(gun152_r3);
		setRotationAngle(gun152_r3, 0.0F, 0.0F, -0.7854F);
		gun152_r3.cubeList.add(new ModelBox(gun152_r3, 38, 82, -1.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F, false));
		gun152_r3.cubeList.add(new ModelBox(gun152_r3, 96, 99, -1.0F, -1.0F, -7.5F, 1, 1, 6, 0.0F, false));

		gun157_r2 = new ModelRenderer(this);
		gun157_r2.setRotationPoint(1.151F, -31.8F, -40.2F);
		handguard.addChild(gun157_r2);
		setRotationAngle(gun157_r2, 0.0F, 0.0F, -0.7854F);
		gun157_r2.cubeList.add(new ModelBox(gun157_r2, 48, 80, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun156_r2 = new ModelRenderer(this);
		gun156_r2.setRotationPoint(1.151F, -32.55F, -40.7F);
		handguard.addChild(gun156_r2);
		setRotationAngle(gun156_r2, 0.0F, 0.0F, -0.7854F);
		gun156_r2.cubeList.add(new ModelBox(gun156_r2, 13, 57, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun155_r2 = new ModelRenderer(this);
		gun155_r2.setRotationPoint(1.151F, -33.3F, -42.25F);
		handguard.addChild(gun155_r2);
		setRotationAngle(gun155_r2, 0.0F, 0.0F, -0.7854F);
		gun155_r2.cubeList.add(new ModelBox(gun155_r2, 97, 27, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun154_r1 = new ModelRenderer(this);
		gun154_r1.setRotationPoint(1.151F, -34.05F, -42.75F);
		handguard.addChild(gun154_r1);
		setRotationAngle(gun154_r1, 0.0F, 0.0F, -0.7854F);
		gun154_r1.cubeList.add(new ModelBox(gun154_r1, 0, 91, -1.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun153_r3 = new ModelRenderer(this);
		gun153_r3.setRotationPoint(1.151F, -34.8F, -42.75F);
		handguard.addChild(gun153_r3);
		setRotationAngle(gun153_r3, 0.0F, 0.0F, -0.7854F);
		gun153_r3.cubeList.add(new ModelBox(gun153_r3, 0, 82, -1.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F, false));
		gun153_r3.cubeList.add(new ModelBox(gun153_r3, 99, 58, -1.0F, -1.0F, -7.5F, 1, 1, 6, 0.0F, false));

		gun220 = new ModelRenderer(this);
		gun220.setRotationPoint(-1.1F, -35.2F, -54.0F);
		handguard.addChild(gun220);
		gun220.cubeList.add(new ModelBox(gun220, 52, 22, 0.0F, -0.001F, -0.002F, 1, 2, 1, 0.0F, false));

		gun219 = new ModelRenderer(this);
		gun219.setRotationPoint(-2.9F, -35.2F, -54.0F);
		handguard.addChild(gun219);
		gun219.cubeList.add(new ModelBox(gun219, 87, 85, 0.0F, 0.0F, -0.001F, 2, 2, 1, 0.0F, false));

		gun193 = new ModelRenderer(this);
		gun193.setRotationPoint(-3.0F, -31.5F, -39.5F);
		handguard.addChild(gun193);
		gun193.cubeList.add(new ModelBox(gun193, 14, 53, -1.002F, 0.0F, 0.5F, 5, 1, 2, 0.0F, false));
		gun193.cubeList.add(new ModelBox(gun193, 38, 53, -0.001F, 0.3F, 0.5F, 3, 1, 2, 0.0F, false));

		gun196_r1 = new ModelRenderer(this);
		gun196_r1.setRotationPoint(3.3886F, 0.6464F, 1.0F);
		gun193.addChild(gun196_r1);
		setRotationAngle(gun196_r1, 0.0F, 0.0F, -0.2618F);
		gun196_r1.cubeList.add(new ModelBox(gun196_r1, 83, 42, -0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));

		gun195_r1 = new ModelRenderer(this);
		gun195_r1.setRotationPoint(-0.3886F, 0.6464F, 1.0F);
		gun193.addChild(gun195_r1);
		setRotationAngle(gun195_r1, 0.0F, 0.0F, 0.2618F);
		gun195_r1.cubeList.add(new ModelBox(gun195_r1, 0, 86, -0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));

		gun192 = new ModelRenderer(this);
		gun192.setRotationPoint(-3.0F, -30.5F, -39.5F);
		handguard.addChild(gun192);
		setRotationAngle(gun192, 2.6025F, 0.0F, 0.0F);
		gun192.cubeList.add(new ModelBox(gun192, 78, 48, -0.001F, 0.0F, -0.575F, 3, 2, 6, 0.0F, false));
		gun192.cubeList.add(new ModelBox(gun192, 0, 70, -1.001F, 0.2567F, -0.4291F, 5, 4, 5, 0.0F, false));
		gun192.cubeList.add(new ModelBox(gun192, 0, 105, -1.001F, 1.2834F, -2.1454F, 5, 5, 2, 0.0F, false));
		gun192.cubeList.add(new ModelBox(gun192, 0, 53, -1.002F, 6.0334F, -2.1454F, 5, 1, 2, 0.0F, false));

		gun194_r1 = new ModelRenderer(this);
		gun194_r1.setRotationPoint(6.3886F, 0.6102F, 2.0709F);
		gun192.addChild(gun194_r1);
		setRotationAngle(gun194_r1, 0.0F, 0.0F, 0.2618F);
		gun194_r1.cubeList.add(new ModelBox(gun194_r1, 26, 64, -3.3978F, 0.2765F, -2.5F, 1, 1, 5, 0.0F, false));

		gun193_r1 = new ModelRenderer(this);
		gun193_r1.setRotationPoint(-0.3886F, 0.6102F, 2.0709F);
		gun192.addChild(gun193_r1);
		setRotationAngle(gun193_r1, 0.0F, 0.0F, -0.2618F);
		gun193_r1.cubeList.add(new ModelBox(gun193_r1, 69, 40, -0.5F, -0.5F, -2.5F, 1, 1, 5, 0.0F, false));

		gun195_r2 = new ModelRenderer(this);
		gun195_r2.setRotationPoint(6.2592F, 4.2834F, -1.3089F);
		gun192.addChild(gun195_r2);
		setRotationAngle(gun195_r2, 0.0F, -0.2618F, 0.0F);
		gun195_r2.cubeList.add(new ModelBox(gun195_r2, 28, 15, -3.3978F, -3.0F, -0.2235F, 1, 6, 1, 0.0F, false));

		gun194_r2 = new ModelRenderer(this);
		gun194_r2.setRotationPoint(-0.2592F, 4.2834F, -1.3089F);
		gun192.addChild(gun194_r2);
		setRotationAngle(gun194_r2, 0.0F, 0.2618F, 0.0F);
		gun194_r2.cubeList.add(new ModelBox(gun194_r2, 52, 28, -0.5F, -3.0F, -1.0F, 1, 6, 1, 0.0F, false));

		gun159 = new ModelRenderer(this);
		gun159.setRotationPoint(-3.0F, -33.0F, -53.5F);
		handguard.addChild(gun159);
		setRotationAngle(gun159, 1.4871F, 0.0F, 0.0F);
		gun159.cubeList.add(new ModelBox(gun159, 106, 14, 0.0F, -4.9791F, -0.2491F, 3, 18, 1, 0.0F, false));
		gun159.cubeList.add(new ModelBox(gun159, 58, 58, -1.002F, -2.0209F, 0.2491F, 5, 15, 2, 0.0F, false));

		gun161_r1 = new ModelRenderer(this);
		gun161_r1.setRotationPoint(6.316F, 6.4791F, 0.4321F);
		gun159.addChild(gun161_r1);
		setRotationAngle(gun161_r1, 0.0F, -0.5236F, 0.0F);
		gun161_r1.cubeList.add(new ModelBox(gun161_r1, 72, 58, -3.0981F, -8.5F, 1.0F, 1, 15, 1, 0.0F, false));

		gun160_r1 = new ModelRenderer(this);
		gun160_r1.setRotationPoint(-0.316F, 6.4791F, 0.4321F);
		gun159.addChild(gun160_r1);
		setRotationAngle(gun160_r1, 0.0F, 0.5236F, 0.0F);
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 74, 24, -0.5F, -8.5F, -0.5F, 1, 15, 1, 0.0F, false));

		gun158 = new ModelRenderer(this);
		gun158.setRotationPoint(-3.0F, -34.0F, -53.5F);
		handguard.addChild(gun158);
		gun158.cubeList.add(new ModelBox(gun158, 26, 28, 0.0F, 0.0F, 0.0F, 3, 1, 12, 0.0F, false));

		gun148 = new ModelRenderer(this);
		gun148.setRotationPoint(-4.0F, -37.0F, -41.5F);
		handguard.addChild(gun148);
		gun148.cubeList.add(new ModelBox(gun148, 116, 0, 0.0F, 0.5F, -9.0F, 5, 3, 15, 0.0F, false));
		gun148.cubeList.add(new ModelBox(gun148, 0, 20, 0.0F, 3.5F, 1.0F, 5, 2, 4, 0.0F, false));
		gun148.cubeList.add(new ModelBox(gun148, 58, 41, 0.0F, 0.5F, 6.0F, 5, 1, 3, 0.0F, false));

		gun151_r1 = new ModelRenderer(this);
		gun151_r1.setRotationPoint(4.2929F, 0.5F, -2.0F);
		gun148.addChild(gun151_r1);
		setRotationAngle(gun151_r1, 0.0F, 0.0F, 0.7854F);
		gun151_r1.cubeList.add(new ModelBox(gun151_r1, 58, 0, -0.5F, -0.5F, -12.0F, 1, 1, 23, 0.0F, false));

		gun150_r1 = new ModelRenderer(this);
		gun150_r1.setRotationPoint(0.7071F, 0.5F, -2.0F);
		gun148.addChild(gun150_r1);
		setRotationAngle(gun150_r1, 0.0F, 0.0F, -0.7854F);
		gun150_r1.cubeList.add(new ModelBox(gun150_r1, 58, 24, -0.5F, -0.5F, -12.0F, 1, 1, 23, 0.0F, false));

		rail = new ModelRenderer(this);
		rail.setRotationPoint(-0.6082F, -40.7113F, -47.7F);
		gun.addChild(rail);
		rail.cubeList.add(new ModelBox(rail, 0, 215, -1.8918F, 0.1613F, -20.252F, 2, 1, 39, 0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 0, 82, -1.8908F, -0.5458F, 18.998F, 2, 2, 2, 0.0F, false));

		DustCover4_r1 = new ModelRenderer(this);
		DustCover4_r1.setRotationPoint(-2.0961F, 0.025F, -1.15F);
		rail.addChild(DustCover4_r1);
		setRotationAngle(DustCover4_r1, 0.0F, 0.0F, 1.1781F);
		DustCover4_r1.cubeList.add(new ModelBox(DustCover4_r1, 93, 207, -0.5F, -0.5F, -19.5F, 2, 1, 40, -0.3F, false));

		DustCover3_r2 = new ModelRenderer(this);
		DustCover3_r2.setRotationPoint(0.3126F, 0.025F, -1.15F);
		rail.addChild(DustCover3_r2);
		setRotationAngle(DustCover3_r2, 0.0F, 0.0F, -1.1781F);
		DustCover3_r2.cubeList.add(new ModelBox(DustCover3_r2, 210, 101, -1.5F, -0.5F, -19.5F, 2, 1, 40, -0.3F, false));

		DustCover5_r2 = new ModelRenderer(this);
		DustCover5_r2.setRotationPoint(-0.8918F, 0.8684F, 20.998F);
		rail.addChild(DustCover5_r2);
		setRotationAngle(DustCover5_r2, -0.7854F, 0.0F, 0.0F);
		DustCover5_r2.cubeList.add(new ModelBox(DustCover5_r2, 58, 80, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

		teeth = new ModelRenderer(this);
		teeth.setRotationPoint(-0.8918F, -0.2489F, 18.65F);
		rail.addChild(teeth);
		teeth.cubeList.add(new ModelBox(teeth, 15, 91, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 9, 91, -1.0F, -0.5F, -2.125F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 86, 90, -1.0F, -0.5F, -3.75F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 0, 91, -1.0F, -0.5F, -5.375F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 90, 52, -1.0F, -0.5F, -8.625F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 90, 65, -1.0F, -0.5F, -7.0F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 90, 48, -1.0F, -0.5F, -11.875F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 90, 50, -1.0F, -0.5F, -10.25F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 89, 21, -1.0F, -0.5F, -24.875F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 89, 34, -1.0F, -0.5F, -23.25F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 89, 58, -1.0F, -0.5F, -13.5F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 89, 62, -1.0F, -0.5F, -15.125F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 69, 89, -1.0F, -0.5F, -16.75F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 81, 89, -1.0F, -0.5F, -18.375F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 24, 90, -1.0F, -0.5F, -21.625F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 30, 90, -1.0F, -0.5F, -20.0F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 83, 18, -1.0F, -0.5F, -37.875F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 83, 21, -1.0F, -0.5F, -36.25F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 72, 84, -1.0F, -0.5F, -26.5F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 87, 32, -1.0F, -0.5F, -28.125F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 88, 24, -1.0F, -0.5F, -29.75F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 88, 28, -1.0F, -0.5F, -31.375F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 48, 88, -1.0F, -0.5F, -34.625F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 86, 88, -1.0F, -0.5F, -33.0F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 12, 79, -1.0F, -0.5F, -39.5F, 2, 1, 1, -0.1F, false));

		DustCover9_r1 = new ModelRenderer(this);
		DustCover9_r1.setRotationPoint(0.9F, 0.1657F, -38.998F);
		teeth.addChild(DustCover9_r1);
		setRotationAngle(DustCover9_r1, 0.0F, 0.0F, -0.7854F);
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 76, 14, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 4, 86, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 85, 72, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 62, 84, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 81, 82, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 75, 80, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 79, 48, -0.5F, -0.5F, 12.497F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 76, 42, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 76, 16, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 91, 67, -0.5F, -0.5F, 18.997F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 91, 30, -0.5F, -0.5F, 17.372F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 91, 26, -0.5F, -0.5F, 20.622F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 90, 8, -0.5F, -0.5F, 22.247F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 90, 0, -0.5F, -0.5F, 23.872F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 89, 80, -0.5F, -0.5F, 25.497F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 28, 87, -0.5F, -0.5F, 15.747F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 74, 86, -0.5F, -0.5F, 14.122F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 32, 92, -0.5F, -0.5F, 28.747F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 24, 92, -0.5F, -0.5F, 27.122F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 0, 93, -0.5F, -0.5F, 31.997F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 92, 40, -0.5F, -0.5F, 30.372F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 75, 93, -0.5F, -0.5F, 33.622F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 17, 93, -0.5F, -0.5F, 35.247F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 0, 95, -0.5F, -0.5F, 36.872F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 9, 95, -0.5F, -0.5F, 38.497F, 1, 1, 1, -0.1F, false));

		DustCover10_r1 = new ModelRenderer(this);
		DustCover10_r1.setRotationPoint(-0.9F, 0.1657F, -38.998F);
		teeth.addChild(DustCover10_r1);
		setRotationAngle(DustCover10_r1, 0.0F, 0.0F, 0.7854F);
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 75, 75, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 42, 86, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 85, 74, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 52, 84, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 81, 80, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 79, 50, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 77, 4, -0.5F, -0.5F, 12.497F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 51, 76, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 76, 40, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 69, 91, -0.5F, -0.5F, 18.997F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 58, 91, -0.5F, -0.5F, 17.372F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 74, 90, -0.5F, -0.5F, 20.622F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 90, 4, -0.5F, -0.5F, 22.247F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 89, 82, -0.5F, -0.5F, 23.872F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 58, 89, -0.5F, -0.5F, 25.497F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 75, 88, -0.5F, -0.5F, 15.747F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 14, 87, -0.5F, -0.5F, 14.122F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 92, 38, -0.5F, -0.5F, 28.747F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 28, 92, -0.5F, -0.5F, 27.122F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 9, 93, -0.5F, -0.5F, 31.997F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 72, 92, -0.5F, -0.5F, 30.372F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 50, 93, -0.5F, -0.5F, 33.622F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 13, 93, -0.5F, -0.5F, 35.247F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 3, 94, -0.5F, -0.5F, 36.872F, 1, 1, 1, -0.1F, false));
		DustCover10_r1.cubeList.add(new ModelBox(DustCover10_r1, 13, 95, -0.5F, -0.5F, 38.497F, 1, 1, 1, -0.1F, false));

		grip = new QRenderer(this);
		grip.setRotationPoint(0.0F, 25.0F, 0.0F);
		grip.cubeList.add(new ModelBox(grip, 58, 89, -2.999F, -31.5F, -5.001F, 3, 5, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 83, 14, -3.001F, -26.8F, -14.251F, 3, 1, 6, -0.2F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(-1.001F, -28.6F, -8.851F);
		grip.addChild(gun12_r1);
		setRotationAngle(gun12_r1, -0.8552F, 0.0F, 0.0F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 43, 15, -1.0F, 0.0F, -1.0F, 1, 2, 1, -0.001F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(-1.001F, -28.6F, -8.851F);
		grip.addChild(gun11_r1);
		setRotationAngle(gun11_r1, -0.1222F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 51, 8, -1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun10_r1 = new ModelRenderer(this);
		gun10_r1.setRotationPoint(-1.501F, -25.7F, -8.551F);
		grip.addChild(gun10_r1);
		setRotationAngle(gun10_r1, 0.4363F, 0.0F, 0.0F);
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 14, 20, -1.5F, -1.0F, 0.0F, 3, 1, 3, -0.2F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(0.001F, -26.5F, -7.001F);
		grip.addChild(gun9_r1);
		setRotationAngle(gun9_r1, -0.4014F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 28, 53, -3.0F, -1.0F, 0.0F, 3, 1, 2, -0.003F, false));

		gun9_r2 = new ModelRenderer(this);
		gun9_r2.setRotationPoint(0.001F, -26.5F, -7.001F);
		grip.addChild(gun9_r2);
		setRotationAngle(gun9_r2, 0.1571F, 0.0F, 0.0F);
		gun9_r2.cubeList.add(new ModelBox(gun9_r2, 0, 11, -3.0F, -1.0F, 0.0F, 3, 1, 3, -0.002F, false));

		gun10_r2 = new ModelRenderer(this);
		gun10_r2.setRotationPoint(-0.499F, -27.0F, -6.601F);
		grip.addChild(gun10_r2);
		setRotationAngle(gun10_r2, 0.1833F, 0.0F, 0.0F);
		gun10_r2.cubeList.add(new ModelBox(gun10_r2, 37, 41, -2.0F, -5.0F, 0.0F, 2, 5, 2, -0.002F, false));

		gun9_r3 = new ModelRenderer(this);
		gun9_r3.setRotationPoint(0.001F, -27.1F, -5.001F);
		grip.addChild(gun9_r3);
		setRotationAngle(gun9_r3, 0.3054F, 0.0F, 0.0F);
		gun9_r3.cubeList.add(new ModelBox(gun9_r3, 47, 41, -3.0F, -5.0F, 0.0F, 3, 5, 1, -0.002F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-3.5F, -28.5F, -1.5F);
		grip.addChild(gun5);
		setRotationAngle(gun5, 0.481F, 0.0F, 0.0F);
		gun5.cubeList.add(new ModelBox(gun5, 44, 28, 0.5F, 0.0F, 0.0F, 3, 11, 1, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.5F, -17.5F, -1.0F);
		grip.addChild(gun4);
		gun4.cubeList.add(new ModelBox(gun4, 0, 41, 0.501F, 0.0F, -7.5F, 3, 1, 8, 0.0F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(2.501F, -6.0302F, -11.5619F);
		gun4.addChild(gun6_r1);
		setRotationAngle(gun6_r1, -0.9163F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 116, 94, -2.0F, -0.5F, -7.5F, 3, 1, 15, 0.0F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(1.501F, -6.0302F, -10.6369F);
		gun4.addChild(gun5_r1);
		setRotationAngle(gun5_r1, -0.9599F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 116, 38, -1.001F, -0.5F, -8.25F, 3, 1, 16, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-3.5F, -30.0F, 2.0F);
		grip.addChild(gun3);
		setRotationAngle(gun3, -2.5281F, 0.0F, 0.0F);
		gun3.cubeList.add(new ModelBox(gun3, 10, 82, 0.499F, 0.8177F, -0.5757F, 3, 2, 3, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-3.5F, -26.5F, -6.0F);
		grip.addChild(gun2);
		setRotationAngle(gun2, 0.481F, 0.0F, 0.0F);
		gun2.cubeList.add(new ModelBox(gun2, 58, 24, 0.5F, -0.75F, 0.0F, 3, 12, 5, 0.0F, false));

		barrel = new QRenderer(this);
		barrel.setRotationPoint(0.0F, 25.5F, 0.0F);
		barrel.cubeList.add(new ModelBox(barrel, 116, 57, -2.0F, -35.0F, -46.0F, 1, 1, 56, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 0, -1.2929F, -35.7071F, -46.0F, 1, 1, 56, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 57, -2.0F, -36.4142F, -46.0F, 1, 1, 56, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 171, -2.0F, -38.9142F, -33.0F, 1, 1, 43, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 114, -2.7071F, -35.7071F, -46.0F, 1, 1, 56, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.0F, -35.7071F, -15.0F);
		barrel.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 58, 58, -0.5F, -0.5F, -31.0F, 1, 1, 56, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.0F, -35.7071F, -15.0F);
		barrel.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 58, 1, -0.5F, -0.5F, -31.0F, 1, 1, 56, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.0F, -34.7071F, -15.0F);
		barrel.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 58, 115, -0.5F, -0.5F, -31.0F, 1, 1, 56, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0F, -34.7071F, -15.0F);
		barrel.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 116, 0, -0.5F, -0.5F, -31.0F, 1, 1, 56, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -38.6881F, -34.501F);
		barrel.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 28, -0.5F, -0.5F, -1.5F, 1, 4, 4, 0.0F, false));

		rails = new QRenderer(this);
		rails.setRotationPoint(0.0F, 24.0F, 0.0F);
		rails.cubeList.add(new ModelBox(rails, 288, 28, -0.1F, -33.4602F, -32.05F, 2, 3, 16, -0.3F, false));
		rails.cubeList.add(new ModelBox(rails, 288, 28, -4.9F, -33.4602F, -32.05F, 2, 3, 16, -0.3F, true));
		rails.cubeList.add(new ModelBox(rails, 296, 62, -3.1398F, -29.5F, -34.25F, 3, 1, 16, -0.3F, true));

		griprails = new ModelRenderer(this);
		griprails.setRotationPoint(1.1F, -30.5946F, -30.426F);
		rails.addChild(griprails);
		setRotationAngle(griprails, 0.0F, 0.0F, 1.5708F);
		

		teeth2 = new ModelRenderer(this);
		teeth2.setRotationPoint(-1.4F, -0.6656F, 37.876F);
		griprails.addChild(teeth2);
		teeth2.cubeList.add(new ModelBox(teeth2, 6, 79, -1.0F, -0.5F, -37.875F, 2, 1, 1, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 0, 79, -1.0F, -0.5F, -36.25F, 2, 1, 1, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 83, 0, -1.0F, -0.5F, -26.5F, 2, 1, 3, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 74, 19, -1.0F, -0.5F, -28.125F, 2, 1, 1, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 64, 45, -1.0F, -0.5F, -29.75F, 2, 1, 1, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 49, 61, -1.0F, -0.5F, -31.375F, 2, 1, 1, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 41, 61, -1.0F, -0.5F, -34.625F, 2, 1, 1, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 58, 45, -1.0F, -0.5F, -33.0F, 2, 1, 1, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 18, 50, -1.0F, -0.5F, -39.5F, 2, 1, 1, -0.1F, false));

		DustCover10_r2 = new ModelRenderer(this);
		DustCover10_r2.setRotationPoint(0.9F, 0.1657F, -38.998F);
		teeth2.addChild(DustCover10_r2);
		setRotationAngle(DustCover10_r2, 0.0F, 0.0F, -0.7854F);
		DustCover10_r2.cubeList.add(new ModelBox(DustCover10_r2, 6, 62, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover10_r2.cubeList.add(new ModelBox(DustCover10_r2, 62, 19, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover10_r2.cubeList.add(new ModelBox(DustCover10_r2, 6, 64, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover10_r2.cubeList.add(new ModelBox(DustCover10_r2, 13, 64, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover10_r2.cubeList.add(new ModelBox(DustCover10_r2, 26, 64, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover10_r2.cubeList.add(new ModelBox(DustCover10_r2, 26, 66, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover10_r2.cubeList.add(new ModelBox(DustCover10_r2, 73, 0, -0.5F, -0.5F, 12.497F, 1, 1, 3, -0.1F, false));
		DustCover10_r2.cubeList.add(new ModelBox(DustCover10_r2, 0, 70, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover10_r2.cubeList.add(new ModelBox(DustCover10_r2, 70, 16, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));

		DustCover11_r1 = new ModelRenderer(this);
		DustCover11_r1.setRotationPoint(-0.9F, 0.1657F, -38.998F);
		teeth2.addChild(DustCover11_r1);
		setRotationAngle(DustCover11_r1, 0.0F, 0.0F, 0.7854F);
		DustCover11_r1.cubeList.add(new ModelBox(DustCover11_r1, 13, 62, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover11_r1.cubeList.add(new ModelBox(DustCover11_r1, 19, 62, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover11_r1.cubeList.add(new ModelBox(DustCover11_r1, 0, 64, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover11_r1.cubeList.add(new ModelBox(DustCover11_r1, 19, 64, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover11_r1.cubeList.add(new ModelBox(DustCover11_r1, 52, 65, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover11_r1.cubeList.add(new ModelBox(DustCover11_r1, 69, 24, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover11_r1.cubeList.add(new ModelBox(DustCover11_r1, 70, 74, -0.5F, -0.5F, 12.497F, 1, 1, 3, -0.1F, false));
		DustCover11_r1.cubeList.add(new ModelBox(DustCover11_r1, 69, 26, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover11_r1.cubeList.add(new ModelBox(DustCover11_r1, 70, 14, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));

		griprails2 = new ModelRenderer(this);
		griprails2.setRotationPoint(-4.1F, -30.5946F, -30.426F);
		rails.addChild(griprails2);
		setRotationAngle(griprails2, 0.0F, 0.0F, -1.5708F);
		

		teeth3 = new ModelRenderer(this);
		teeth3.setRotationPoint(1.4F, -0.6656F, 37.876F);
		griprails2.addChild(teeth3);
		teeth3.cubeList.add(new ModelBox(teeth3, 12, 50, -1.0F, -0.5F, -37.875F, 2, 1, 1, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 6, 50, -1.0F, -0.5F, -36.25F, 2, 1, 1, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 68, 80, -1.0F, -0.5F, -26.5F, 2, 1, 3, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 0, 50, -1.0F, -0.5F, -28.125F, 2, 1, 1, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 47, 47, -1.0F, -0.5F, -29.75F, 2, 1, 1, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 0, 37, -1.0F, -0.5F, -31.375F, 2, 1, 1, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 34, 11, -1.0F, -0.5F, -34.625F, 2, 1, 1, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 28, 11, -1.0F, -0.5F, -33.0F, 2, 1, 1, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 18, 24, -1.0F, -0.5F, -39.5F, 2, 1, 1, -0.1F, false));

		DustCover11_r2 = new ModelRenderer(this);
		DustCover11_r2.setRotationPoint(-0.9F, 0.1657F, -38.998F);
		teeth3.addChild(DustCover11_r2);
		setRotationAngle(DustCover11_r2, 0.0F, 0.0F, 0.7854F);
		DustCover11_r2.cubeList.add(new ModelBox(DustCover11_r2, 36, 53, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover11_r2.cubeList.add(new ModelBox(DustCover11_r2, 13, 57, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover11_r2.cubeList.add(new ModelBox(DustCover11_r2, 26, 57, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover11_r2.cubeList.add(new ModelBox(DustCover11_r2, 58, 24, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover11_r2.cubeList.add(new ModelBox(DustCover11_r2, 58, 48, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover11_r2.cubeList.add(new ModelBox(DustCover11_r2, 0, 59, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover11_r2.cubeList.add(new ModelBox(DustCover11_r2, 26, 72, -0.5F, -0.5F, 12.497F, 1, 1, 3, -0.1F, false));
		DustCover11_r2.cubeList.add(new ModelBox(DustCover11_r2, 19, 59, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover11_r2.cubeList.add(new ModelBox(DustCover11_r2, 0, 62, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));

		DustCover12_r1 = new ModelRenderer(this);
		DustCover12_r1.setRotationPoint(0.9F, 0.1657F, -38.998F);
		teeth3.addChild(DustCover12_r1);
		setRotationAngle(DustCover12_r1, 0.0F, 0.0F, -0.7854F);
		DustCover12_r1.cubeList.add(new ModelBox(DustCover12_r1, 0, 57, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover12_r1.cubeList.add(new ModelBox(DustCover12_r1, 6, 57, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover12_r1.cubeList.add(new ModelBox(DustCover12_r1, 19, 57, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover12_r1.cubeList.add(new ModelBox(DustCover12_r1, 58, 26, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover12_r1.cubeList.add(new ModelBox(DustCover12_r1, 58, 50, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover12_r1.cubeList.add(new ModelBox(DustCover12_r1, 6, 59, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover12_r1.cubeList.add(new ModelBox(DustCover12_r1, 47, 72, -0.5F, -0.5F, 12.497F, 1, 1, 3, -0.1F, false));
		DustCover12_r1.cubeList.add(new ModelBox(DustCover12_r1, 13, 59, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover12_r1.cubeList.add(new ModelBox(DustCover12_r1, 26, 59, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));

		griprails3 = new ModelRenderer(this);
		griprails3.setRotationPoint(-3.0F, -29.1054F, -32.426F);
		rails.addChild(griprails3);
		setRotationAngle(griprails3, 0.0F, 0.0F, 1.5708F);
		griprails3.cubeList.add(new ModelBox(griprails3, 23, 114, -1.2946F, -1.9F, -1.026F, 1, 1, 12, 0.299F, false));

		teeth4 = new ModelRenderer(this);
		teeth4.setRotationPoint(1.4F, 0.6656F, 37.876F);
		griprails3.addChild(teeth4);
		teeth4.cubeList.add(new ModelBox(teeth4, 43, 8, -1.2344F, -3.0656F, -37.875F, 1, 2, 1, -0.1F, false));
		teeth4.cubeList.add(new ModelBox(teeth4, 31, 41, -1.2344F, -3.0656F, -36.25F, 1, 2, 1, -0.1F, false));
		teeth4.cubeList.add(new ModelBox(teeth4, 58, 14, -1.2344F, -3.0656F, -29.6F, 1, 2, 3, -0.1F, false));
		teeth4.cubeList.add(new ModelBox(teeth4, 33, 28, -1.2344F, -3.0656F, -31.375F, 1, 2, 1, -0.1F, false));
		teeth4.cubeList.add(new ModelBox(teeth4, 26, 28, -1.2344F, -3.0656F, -34.625F, 1, 2, 1, -0.1F, false));
		teeth4.cubeList.add(new ModelBox(teeth4, 19, 28, -1.2344F, -3.0656F, -33.0F, 1, 2, 1, -0.1F, false));
		teeth4.cubeList.add(new ModelBox(teeth4, 13, 28, -1.2344F, -3.0656F, -39.5F, 1, 2, 1, -0.1F, false));

		DustCover12_r2 = new ModelRenderer(this);
		DustCover12_r2.setRotationPoint(-0.9F, -1.1656F, -38.998F);
		teeth4.addChild(DustCover12_r2);
		setRotationAngle(DustCover12_r2, 0.0F, 0.0F, -0.7854F);
		DustCover12_r2.cubeList.add(new ModelBox(DustCover12_r2, 7, 3, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover12_r2.cubeList.add(new ModelBox(DustCover12_r2, 6, 37, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover12_r2.cubeList.add(new ModelBox(DustCover12_r2, 45, 50, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover12_r2.cubeList.add(new ModelBox(DustCover12_r2, 52, 35, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover12_r2.cubeList.add(new ModelBox(DustCover12_r2, 47, 22, -0.5F, -0.5F, 9.397F, 1, 1, 3, -0.1F, false));
		DustCover12_r2.cubeList.add(new ModelBox(DustCover12_r2, 52, 52, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover12_r2.cubeList.add(new ModelBox(DustCover12_r2, 26, 53, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));

		DustCover13_r1 = new ModelRenderer(this);
		DustCover13_r1.setRotationPoint(-0.9F, -2.9656F, -38.998F);
		teeth4.addChild(DustCover13_r1);
		setRotationAngle(DustCover13_r1, 0.0F, 0.0F, 0.7854F);
		DustCover13_r1.cubeList.add(new ModelBox(DustCover13_r1, 26, 31, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover13_r1.cubeList.add(new ModelBox(DustCover13_r1, 33, 31, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover13_r1.cubeList.add(new ModelBox(DustCover13_r1, 43, 18, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover13_r1.cubeList.add(new ModelBox(DustCover13_r1, 52, 37, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover13_r1.cubeList.add(new ModelBox(DustCover13_r1, 15, 70, -0.5F, -0.5F, 9.397F, 1, 1, 3, -0.1F, false));
		DustCover13_r1.cubeList.add(new ModelBox(DustCover13_r1, 52, 50, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover13_r1.cubeList.add(new ModelBox(DustCover13_r1, 12, 53, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));

		action = new QRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 13, 36, 0.0F, -35.6F, -29.2F, 3, 1, 2, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 58, 19, 2.2F, -35.6F, -29.2F, 1, 1, 2, 0.2F, false));
		action.cubeList.add(new ModelBox(action, 58, 4, -0.2F, -35.6F, -29.2F, 1, 1, 2, 0.2F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.4F, -34.6F, -27.2F);
		action.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.0524F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 41, -1.0F, -1.0F, 0.0F, 1, 1, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		gun.render(f5);
//		grip.render(f5);
//		barrel.render(f5);
		rails.render(f5);
//		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
