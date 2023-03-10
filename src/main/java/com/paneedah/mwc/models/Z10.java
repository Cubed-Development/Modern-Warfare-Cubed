package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Z10 extends ModelWithAttachments {
	private final QRenderer gun;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer gun154_r1;
	private final ModelRenderer gun153_r1;
	private final ModelRenderer gun19_r1;
	private final ModelRenderer gun30_r1;
	private final ModelRenderer gun29_r1;
	private final ModelRenderer gun42_r1;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun41_r1;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun39_r2;
	private final ModelRenderer gun41_r2;
	private final ModelRenderer gun40_r2;
	private final ModelRenderer gun39_r3;
	private final ModelRenderer gun43_r1;
	private final ModelRenderer gun45_r1;
	private final ModelRenderer gun44_r1;
	private final ModelRenderer gun41_r3;
	private final ModelRenderer gun41_r4;
	private final ModelRenderer gun40_r3;
	private final ModelRenderer gun52_r1;
	private final ModelRenderer gun51_r1;
	private final ModelRenderer gun52_r2;
	private final ModelRenderer gun50_r1;
	private final ModelRenderer gun49_r1;
	private final ModelRenderer gun49_r2;
	private final ModelRenderer gun48_r1;
	private final ModelRenderer gun48_r2;
	private final ModelRenderer gun51_r2;
	private final ModelRenderer gun51_r3;
	private final ModelRenderer gun51_r4;
	private final ModelRenderer gun50_r2;
	private final ModelRenderer gun54_r1;
	private final ModelRenderer gun54_r2;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer bone11;
	private final ModelRenderer gun705_r1;
	private final ModelRenderer gun704_r1;
	private final ModelRenderer gun704_r2;
	private final ModelRenderer gun703_r1;
	private final ModelRenderer gun132;
	private final ModelRenderer gun60;
	private final ModelRenderer bone;
	private final ModelRenderer gun51_r5;
	private final ModelRenderer bone2;
	private final ModelRenderer gun42_r2;
	private final ModelRenderer gun43_r2;
	private final ModelRenderer bone3;
	private final ModelRenderer gun45_r2;
	private final ModelRenderer gun44_r2;
	private final ModelRenderer gun43_r3;
	private final ModelRenderer gun42_r3;
	private final ModelRenderer gun44_r3;
	private final ModelRenderer gun43_r4;
	private final ModelRenderer bone4;
	private final ModelRenderer gun46_r1;
	private final ModelRenderer gun45_r3;
	private final ModelRenderer gun44_r4;
	private final ModelRenderer gun43_r5;
	private final ModelRenderer gun45_r4;
	private final ModelRenderer gun44_r5;
	private final ModelRenderer gun67;
	private final ModelRenderer bone12;
	private final ModelRenderer receiver15_r1;
	private final ModelRenderer receiver14_r1;
	private final ModelRenderer receiver17_r1;
	private final ModelRenderer receiver17_r2;
	private final ModelRenderer receiver16_r1;
	private final ModelRenderer receiver16_r2;
	private final ModelRenderer receiver16_r3;
	private final ModelRenderer receiver15_r2;
	private final ModelRenderer receiver16_r4;
	private final ModelRenderer handguard;
	private final ModelRenderer gun54_r3;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun53_r2;
	private final ModelRenderer gun52_r3;
	private final ModelRenderer gun53_r3;
	private final ModelRenderer gun54_r4;
	private final ModelRenderer gun52_r4;
	private final ModelRenderer gun51_r6;
	private final ModelRenderer gun52_r5;
	private final ModelRenderer gun53_r4;
	private final ModelRenderer gun51_r7;
	private final ModelRenderer gun50_r3;
	private final ModelRenderer gun51_r8;
	private final ModelRenderer gun52_r6;
	private final ModelRenderer gun50_r4;
	private final ModelRenderer gun51_r9;
	private final ModelRenderer gun45_r5;
	private final ModelRenderer gun45_r6;
	private final ModelRenderer gun45_r7;
	private final ModelRenderer gun45_r8;
	private final ModelRenderer gun55_r1;
	private final ModelRenderer gun49_r3;
	private final ModelRenderer gun49_r4;
	private final ModelRenderer gun48_r3;
	private final ModelRenderer gun48_r4;
	private final ModelRenderer gun44_r6;
	private final ModelRenderer gun45_r9;
	private final ModelRenderer gun46_r2;
	private final ModelRenderer gun47_r1;
	private final ModelRenderer gun48_r5;
	private final ModelRenderer gun49_r5;
	private final ModelRenderer bone5;
	private final ModelRenderer gun46_r3;
	private final ModelRenderer gun45_r10;
	private final ModelRenderer gun47_r2;
	private final ModelRenderer gun48_r6;
	private final ModelRenderer gun46_r4;
	private final ModelRenderer gun49_r6;
	private final ModelRenderer gun50_r5;
	private final ModelRenderer gun48_r7;
	private final ModelRenderer gun49_r7;
	private final ModelRenderer gun47_r3;
	private final ModelRenderer gun53_r5;
	private final ModelRenderer gun54_r5;
	private final ModelRenderer gun52_r7;
	private final ModelRenderer gun53_r6;
	private final ModelRenderer gun51_r10;
	private final ModelRenderer gun52_r8;
	private final ModelRenderer gun50_r6;
	private final ModelRenderer gun51_r11;
	private final ModelRenderer gun54_r6;
	private final ModelRenderer gun55_r2;
	private final ModelRenderer bone7;
	private final ModelRenderer gun49_r8;
	private final ModelRenderer le_hand_guard2;
	private final ModelRenderer gun55_r3;
	private final ModelRenderer gun54_r7;
	private final ModelRenderer gun54_r8;
	private final ModelRenderer gun53_r7;
	private final ModelRenderer gun54_r9;
	private final ModelRenderer gun55_r4;
	private final ModelRenderer gun53_r8;
	private final ModelRenderer gun52_r9;
	private final ModelRenderer gun53_r9;
	private final ModelRenderer gun54_r10;
	private final ModelRenderer gun52_r10;
	private final ModelRenderer gun51_r12;
	private final ModelRenderer gun52_r11;
	private final ModelRenderer gun53_r10;
	private final ModelRenderer gun51_r13;
	private final ModelRenderer gun52_r12;
	private final ModelRenderer gun46_r5;
	private final ModelRenderer gun46_r6;
	private final ModelRenderer gun46_r7;
	private final ModelRenderer gun56_r1;
	private final ModelRenderer gun50_r7;
	private final ModelRenderer gun50_r8;
	private final ModelRenderer gun49_r9;
	private final ModelRenderer gun49_r10;
	private final ModelRenderer bone9;
	private final ModelRenderer gun47_r4;
	private final ModelRenderer gun46_r8;
	private final ModelRenderer gun48_r8;
	private final ModelRenderer gun49_r11;
	private final ModelRenderer gun47_r5;
	private final ModelRenderer gun50_r9;
	private final ModelRenderer gun51_r14;
	private final ModelRenderer gun49_r12;
	private final ModelRenderer gun50_r10;
	private final ModelRenderer gun48_r9;
	private final ModelRenderer gun54_r11;
	private final ModelRenderer gun55_r5;
	private final ModelRenderer gun53_r11;
	private final ModelRenderer gun54_r12;
	private final ModelRenderer gun52_r13;
	private final ModelRenderer gun53_r12;
	private final ModelRenderer gun51_r15;
	private final ModelRenderer gun52_r14;
	private final ModelRenderer gun55_r6;
	private final ModelRenderer gun56_r2;
	private final ModelRenderer bone10;
	private final ModelRenderer gun50_r11;
	private final QRenderer stock;
	private final ModelRenderer gun71_r1;
	private final ModelRenderer gun70_r1;
	private final ModelRenderer gun70_r2;
	private final ModelRenderer gun69_r1;
	private final ModelRenderer gun73_r1;
	private final ModelRenderer gun72_r1;
	private final ModelRenderer gun73_r2;
	private final ModelRenderer gun73_r3;
	private final ModelRenderer gun72_r2;
	private final ModelRenderer gun72_r3;
	private final ModelRenderer gun72_r4;
	private final ModelRenderer gun72_r5;
	private final ModelRenderer gun71_r2;
	private final ModelRenderer gun71_r3;
	private final ModelRenderer gun72_r6;
	private final ModelRenderer gun71_r4;
	private final ModelRenderer gun71_r5;
	private final ModelRenderer gun70_r3;
	private final ModelRenderer gun70_r4;
	private final ModelRenderer gun69_r2;
	private final ModelRenderer gun69_r3;
	private final ModelRenderer gun74_r1;
	private final ModelRenderer gun73_r4;
	private final ModelRenderer gun73_r5;
	private final ModelRenderer gun72_r7;
	private final ModelRenderer gun73_r6;
	private final ModelRenderer gun73_r7;
	private final ModelRenderer gun72_r8;
	private final ModelRenderer gun76_r1;
	private final ModelRenderer gun75_r1;
	private final ModelRenderer gun73_r8;
	private final ModelRenderer gun74_r2;
	private final ModelRenderer gun73_r9;
	private final ModelRenderer gun75_r2;
	private final ModelRenderer gun73_r10;
	private final ModelRenderer gun72_r9;
	private final ModelRenderer gun72_r10;
	private final ModelRenderer gun71_r6;
	private final ModelRenderer gun70_r5;
	private final ModelRenderer bone6;
	private final ModelRenderer gun70_r6;
	private final ModelRenderer gun69_r4;
	private final ModelRenderer bone8;
	private final ModelRenderer gun71_r7;
	private final ModelRenderer gun70_r7;
	private final ModelRenderer mag;
	private final ModelRenderer gun50_r12;
	private final ModelRenderer gun52_r15;
	private final ModelRenderer gun50_r13;
	private final ModelRenderer gun52_r16;
	private final ModelRenderer gun51_r16;
	private final ModelRenderer gun49_r13;
	private final ModelRenderer gun47_r6;
	private final ModelRenderer gun49_r14;
	private final ModelRenderer gun56_r3;
	private final ModelRenderer gun55_r7;
	private final ModelRenderer gun54_r13;
	private final ModelRenderer gun53_r13;
	private final ModelRenderer gun50_r14;
	private final ModelRenderer gun51_r17;
	private final ModelRenderer gun50_r15;
	private final ModelRenderer gun50_r16;
	private final ModelRenderer gun51_r18;
	private final ModelRenderer gun52_r17;
	private final ModelRenderer gun51_r19;
	private final ModelRenderer gun50_r17;
	private final ModelRenderer gun49_r15;
	private final ModelRenderer gun48_r10;
	private final ModelRenderer action;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public Z10() {
		textureWidth = 300;
		textureHeight = 300;

		gun = new QRenderer(this);
		gun.setRotationPoint(-1.4157F, -10.7703F, -9.8009F);
		gun.cubeList.add(new ModelBox(gun, 5, 81, 1.3657F, -1.0797F, -2.9491F, 1, 2, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 99, 1.4157F, 0.4203F, -2.9501F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 33, -1.8853F, 1.7703F, 8.8009F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 5, 77, 0.7167F, 1.7703F, 8.8009F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 104, -1.2843F, -1.8797F, 10.3009F, 3, 3, 3, 0.004F, false));
		gun.cubeList.add(new ModelBox(gun, 22, 53, -1.8843F, -0.8797F, 10.3009F, 1, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 13, -2.0863F, -0.1797F, -12.8991F, 4, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 62, 0.9157F, -0.2297F, -3.3991F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 84, 36, -2.0843F, -0.2297F, -4.3991F, 1, 1, 3, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 0, -2.0843F, 3.7703F, -11.6491F, 1, 2, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -2.0843F, -0.2297F, -11.6491F, 1, 4, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 11, 0, -2.0843F, -0.2297F, -12.5491F, 4, 6, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 42, 76, -2.3343F, -0.2297F, -12.5491F, 1, 6, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 61, -1.0843F, 3.7703F, -2.6491F, 3, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 95, 0.9157F, 3.0203F, -11.6491F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 8, 47, 0.9167F, 0.0203F, -5.6491F, 1, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 48, 0.8157F, 0.5203F, -3.3991F, 1, 3, 2, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 0, -1.9843F, 0.5203F, -3.3991F, 1, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 22, 1.0907F, 1.5203F, -5.3991F, 1, 1, 4, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 81, 102, -2.0843F, 5.7703F, -6.6491F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 17, -1.8843F, -0.2297F, -2.1991F, 3, 4, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 204, 240, -1.0843F, -5.3547F, -12.6991F, 2, 1, 22, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 76, -1.0843F, -4.7547F, 9.3009F, 2, 2, 4, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 56, -0.8843F, -1.8297F, 11.3009F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 83, 86, -2.2843F, -1.8297F, 11.3009F, 2, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 95, 1.1147F, -1.8297F, -1.6991F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 67, 118, 0.7147F, -1.9297F, -3.4991F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 25, -2.2833F, -1.8297F, -12.6991F, 1, 1, 18, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 13, 94, 1.1147F, -1.8297F, -12.1991F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 66, -0.8833F, -3.5797F, 11.3009F, 3, 2, 2, 0.003F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 36, 1.0407F, -3.5797F, 4.3009F, 1, 2, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 56, 1.0406F, -1.8297F, 5.3009F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 47, 1.1157F, -3.5797F, -12.6991F, 1, 2, 17, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 64, -2.2843F, -3.5797F, -1.6991F, 1, 2, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 85, -2.2843F, -3.5797F, -12.6991F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 84, -2.2853F, -3.5797F, 11.3009F, 2, 2, 2, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 27, -2.2093F, -3.5797F, 4.3009F, 1, 2, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 102, -2.2092F, -1.8297F, 5.3009F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 44, -1.8863F, -1.8297F, 4.8009F, 4, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 83, 1.1139F, -3.5797F, 3.9009F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 48, 1.1138F, -2.5797F, 3.4009F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 104, 1.1137F, -1.8297F, 10.8009F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 39, 1.1139F, -3.5797F, 9.9009F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 80, 1.1138F, -2.5797F, 10.4009F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 104, -2.2824F, -2.5797F, 10.4009F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 69, -2.2823F, -1.8297F, 4.8009F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 104, -2.2825F, -3.5797F, 3.9009F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 30, -2.2824F, -2.5797F, 3.4009F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 71, -2.2823F, -1.8297F, 10.8009F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 36, -2.2825F, -3.5797F, 9.9009F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 55, 1.1147F, -3.8297F, -9.4491F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, 0.7157F, -0.2297F, -12.1991F, 1, 4, 21, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 67, 0, -1.5843F, 3.0203F, 3.3009F, 3, 4, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 59, -1.5843F, 1.0203F, 9.3009F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 47, -0.5843F, -3.1297F, -57.8991F, 1, 1, 46, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 0, -0.9843F, -2.7297F, -57.8991F, 1, 1, 46, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 95, -0.7843F, -2.9297F, -57.8991F, 1, 1, 46, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 94, -0.7843F, -2.5297F, -57.8991F, 1, 1, 46, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 48, -0.5843F, -2.3297F, -57.8991F, 1, 1, 46, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 1, -0.3843F, -2.9297F, -57.8991F, 1, 1, 46, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 47, -0.1843F, -2.7297F, -57.8991F, 1, 1, 46, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -0.3843F, -2.5297F, -57.8991F, 1, 1, 46, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(2.0157F, 1.6703F, 5.3009F);
		gun.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -1.5708F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 56, 29, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun154_r1 = new ModelRenderer(this);
		gun154_r1.setRotationPoint(0.7157F, 0.6703F, 7.2009F);
		gun.addChild(gun154_r1);
		setRotationAngle(gun154_r1, 1.1694F, 0.0F, 0.0F);
		gun154_r1.cubeList.add(new ModelBox(gun154_r1, 11, 7, -2.8F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun153_r1 = new ModelRenderer(this);
		gun153_r1.setRotationPoint(-0.6843F, 1.7703F, 5.1009F);
		gun.addChild(gun153_r1);
		setRotationAngle(gun153_r1, 0.7854F, 0.0F, 0.0F);
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 0, 74, -1.2F, 0.0F, 0.0F, 1, 1, 1, 0.2F, false));
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 48, 76, 1.4F, 0.0F, 0.0F, 1, 1, 1, 0.2F, false));

		gun19_r1 = new ModelRenderer(this);
		gun19_r1.setRotationPoint(-0.0843F, 7.7703F, -1.4991F);
		gun.addChild(gun19_r1);
		setRotationAngle(gun19_r1, -0.1745F, 0.0F, 0.0F);
		gun19_r1.cubeList.add(new ModelBox(gun19_r1, 67, 11, -1.5F, -1.0F, -1.0F, 3, 1, 3, 0.001F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-1.7843F, 3.2703F, 2.2009F);
		gun.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 10, 88, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-0.0843F, 7.3758F, 1.307F);
		gun.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.8798F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 104, 55, -1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F, false));

		gun42_r1 = new ModelRenderer(this);
		gun42_r1.setRotationPoint(-1.5879F, -3.457F, 0.8009F);
		gun.addChild(gun42_r1);
		setRotationAngle(gun42_r1, 0.0F, 0.0F, 0.9599F);
		gun42_r1.cubeList.add(new ModelBox(gun42_r1, 96, 27, -0.5F, -0.5F, -13.5F, 1, 1, 2, -0.001F, false));
		gun42_r1.cubeList.add(new ModelBox(gun42_r1, 48, 64, -0.5F, -0.5F, -2.5F, 1, 1, 15, -0.001F, false));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(1.4194F, -3.457F, 11.8009F);
		gun.addChild(gun40_r1);
		setRotationAngle(gun40_r1, 0.0F, 0.0F, -0.9599F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 132, 181, -0.5F, -0.5F, -24.5F, 1, 1, 26, -0.001F, false));

		gun41_r1 = new ModelRenderer(this);
		gun41_r1.setRotationPoint(-1.1783F, -3.7437F, 11.3009F);
		gun.addChild(gun41_r1);
		setRotationAngle(gun41_r1, 0.0F, 0.0F, 0.9599F);
		gun41_r1.cubeList.add(new ModelBox(gun41_r1, 48, 17, -0.4959F, -0.5F, -13.0F, 1, 1, 15, 0.001F, false));
		gun41_r1.cubeList.add(new ModelBox(gun41_r1, 61, 33, -0.6959F, -0.7F, -22.6F, 1, 1, 10, -0.2F, false));
		gun41_r1.cubeList.add(new ModelBox(gun41_r1, 96, 51, -0.4959F, -0.5F, -24.0F, 1, 1, 2, 0.001F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(1.0098F, -3.7437F, 0.3009F);
		gun.addChild(gun39_r1);
		setRotationAngle(gun39_r1, 0.0F, 0.0F, -0.9599F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 148, 223, -0.5041F, -0.5F, -13.0F, 1, 1, 26, 0.0F, false));

		gun39_r2 = new ModelRenderer(this);
		gun39_r2.setRotationPoint(-1.631F, -0.5591F, 11.8009F);
		gun.addChild(gun39_r2);
		setRotationAngle(gun39_r2, 0.0F, 0.0F, -0.3927F);
		gun39_r2.cubeList.add(new ModelBox(gun39_r2, 88, 142, -0.5F, -0.5F, -24.5F, 1, 1, 26, 0.001F, false));

		gun41_r2 = new ModelRenderer(this);
		gun41_r2.setRotationPoint(1.4625F, -0.5591F, -12.1991F);
		gun.addChild(gun41_r2);
		setRotationAngle(gun41_r2, 0.0F, 0.0F, 0.3927F);
		gun41_r2.cubeList.add(new ModelBox(gun41_r2, 96, 85, -0.5007F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun40_r2 = new ModelRenderer(this);
		gun40_r2.setRotationPoint(1.4625F, -0.5591F, -7.6991F);
		gun.addChild(gun40_r2);
		setRotationAngle(gun40_r2, 0.0F, 0.0F, 0.3927F);
		gun40_r2.cubeList.add(new ModelBox(gun40_r2, 59, 81, -0.5F, -0.5F, -4.5F, 1, 1, 9, 0.0F, false));

		gun39_r3 = new ModelRenderer(this);
		gun39_r3.setRotationPoint(-0.306F, -0.2093F, -1.1991F);
		gun.addChild(gun39_r3);
		setRotationAngle(gun39_r3, 0.0F, 0.0F, 0.3927F);
		gun39_r3.cubeList.add(new ModelBox(gun39_r3, 48, 48, 1.0F, -1.5F, -0.5F, 1, 1, 15, 0.001F, false));

		gun43_r1 = new ModelRenderer(this);
		gun43_r1.setRotationPoint(1.4404F, -3.6171F, -8.4491F);
		gun.addChild(gun43_r1);
		setRotationAngle(gun43_r1, 0.0F, 0.0F, 0.48F);
		gun43_r1.cubeList.add(new ModelBox(gun43_r1, 96, 3, -1.25F, -0.4926F, -1.0F, 1, 1, 2, 0.0F, false));
		gun43_r1.cubeList.add(new ModelBox(gun43_r1, 96, 9, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		gun45_r1 = new ModelRenderer(this);
		gun45_r1.setRotationPoint(-1.7843F, -1.6226F, -1.6991F);
		gun.addChild(gun45_r1);
		setRotationAngle(gun45_r1, 0.7854F, 0.0F, 0.0F);
		gun45_r1.cubeList.add(new ModelBox(gun45_r1, 8, 104, -0.49F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun44_r1 = new ModelRenderer(this);
		gun44_r1.setRotationPoint(-1.7843F, -1.6226F, -10.6991F);
		gun.addChild(gun44_r1);
		setRotationAngle(gun44_r1, 0.7854F, 0.0F, 0.0F);
		gun44_r1.cubeList.add(new ModelBox(gun44_r1, 18, 104, -0.49F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun41_r3 = new ModelRenderer(this);
		gun41_r3.setRotationPoint(-1.7843F, -2.5797F, 0.3009F);
		gun.addChild(gun41_r3);
		setRotationAngle(gun41_r3, -0.0215F, -0.6286F, 0.3257F);
		gun41_r3.cubeList.add(new ModelBox(gun41_r3, 48, 84, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

		gun41_r4 = new ModelRenderer(this);
		gun41_r4.setRotationPoint(0.1157F, -1.9119F, -3.1991F);
		gun.addChild(gun41_r4);
		setRotationAngle(gun41_r4, -0.7854F, 0.0F, 0.0F);
		gun41_r4.cubeList.add(new ModelBox(gun41_r4, 21, 105, 0.998F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun40_r3 = new ModelRenderer(this);
		gun40_r3.setRotationPoint(0.1157F, -1.9119F, -1.6991F);
		gun.addChild(gun40_r3);
		setRotationAngle(gun40_r3, -0.7854F, 0.0F, 0.0F);
		gun40_r3.cubeList.add(new ModelBox(gun40_r3, 25, 105, 0.998F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun52_r1 = new ModelRenderer(this);
		gun52_r1.setRotationPoint(-1.6593F, 2.6703F, 1.1009F);
		gun.addChild(gun52_r1);
		setRotationAngle(gun52_r1, -0.4887F, 0.0F, 0.0F);
		gun52_r1.cubeList.add(new ModelBox(gun52_r1, 75, 75, -0.465F, -1.25F, 1.5F, 1, 1, 1, -0.2F, false));
		gun52_r1.cubeList.add(new ModelBox(gun52_r1, 56, 76, 2.615F, -1.25F, 1.5F, 1, 1, 1, -0.2F, false));

		gun51_r1 = new ModelRenderer(this);
		gun51_r1.setRotationPoint(-1.6593F, 0.9703F, -2.7991F);
		gun.addChild(gun51_r1);
		setRotationAngle(gun51_r1, -0.4887F, 0.0F, 0.0F);
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 4, 74, -0.465F, -1.25F, 1.5F, 1, 1, 1, -0.2F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 77, 39, 2.615F, -1.25F, 1.5F, 1, 1, 1, -0.2F, false));

		gun52_r2 = new ModelRenderer(this);
		gun52_r2.setRotationPoint(-2.1593F, 0.0703F, -14.1991F);
		gun.addChild(gun52_r2);
		setRotationAngle(gun52_r2, -0.4887F, 0.0F, 0.0F);
		gun52_r2.cubeList.add(new ModelBox(gun52_r2, 4, 0, -0.475F, -1.25F, 1.55F, 1, 1, 1, -0.2F, false));
		gun52_r2.cubeList.add(new ModelBox(gun52_r2, 29, 0, 3.375F, -1.25F, 1.55F, 1, 1, 1, -0.2F, false));

		gun50_r1 = new ModelRenderer(this);
		gun50_r1.setRotationPoint(1.4157F, 3.2985F, -11.2785F);
		gun.addChild(gun50_r1);
		setRotationAngle(gun50_r1, -0.3927F, 0.0F, 0.0F);
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 29, 105, -0.501F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun49_r1 = new ModelRenderer(this);
		gun49_r1.setRotationPoint(1.4157F, 2.7985F, -11.8285F);
		gun.addChild(gun49_r1);
		setRotationAngle(gun49_r1, 0.3927F, 0.0F, 0.0F);
		gun49_r1.cubeList.add(new ModelBox(gun49_r1, 105, 29, -0.502F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun49_r2 = new ModelRenderer(this);
		gun49_r2.setRotationPoint(1.4157F, 2.7985F, -5.3697F);
		gun.addChild(gun49_r2);
		setRotationAngle(gun49_r2, -0.3927F, 0.0F, 0.0F);
		gun49_r2.cubeList.add(new ModelBox(gun49_r2, 105, 27, -0.502F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun48_r1 = new ModelRenderer(this);
		gun48_r1.setRotationPoint(1.4157F, 3.2985F, -5.9197F);
		gun.addChild(gun48_r1);
		setRotationAngle(gun48_r1, 0.3927F, 0.0F, 0.0F);
		gun48_r1.cubeList.add(new ModelBox(gun48_r1, 105, 31, -0.501F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun48_r2 = new ModelRenderer(this);
		gun48_r2.setRotationPoint(-0.5843F, 3.6546F, -2.7611F);
		gun.addChild(gun48_r2);
		setRotationAngle(gun48_r2, -0.5672F, 0.0F, 0.0F);
		gun48_r2.cubeList.add(new ModelBox(gun48_r2, 96, 18, -1.5F, -0.5F, -1.0F, 1, 1, 2, -0.001F, false));
		gun48_r2.cubeList.add(new ModelBox(gun48_r2, 96, 58, 1.5F, -0.5F, -1.0F, 1, 1, 2, -0.001F, false));

		gun51_r2 = new ModelRenderer(this);
		gun51_r2.setRotationPoint(2.1157F, 6.9788F, -2.2864F);
		gun.addChild(gun51_r2);
		setRotationAngle(gun51_r2, 1.4192F, 0.0F, 0.0F);
		gun51_r2.cubeList.add(new ModelBox(gun51_r2, 33, 105, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun51_r3 = new ModelRenderer(this);
		gun51_r3.setRotationPoint(0.2157F, 5.469F, -12.0717F);
		gun.addChild(gun51_r3);
		setRotationAngle(gun51_r3, 1.4192F, 0.0F, 0.0F);
		gun51_r3.cubeList.add(new ModelBox(gun51_r3, 10, 44, -2.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

		gun51_r4 = new ModelRenderer(this);
		gun51_r4.setRotationPoint(-1.5593F, 6.2239F, -7.1291F);
		gun.addChild(gun51_r4);
		setRotationAngle(gun51_r4, 1.4192F, 0.0F, 0.0F);
		gun51_r4.cubeList.add(new ModelBox(gun51_r4, 58, 17, -0.5F, -5.5007F, -0.5F, 1, 11, 1, 0.0F, false));

		gun50_r2 = new ModelRenderer(this);
		gun50_r2.setRotationPoint(-1.8843F, 6.2239F, -7.2291F);
		gun.addChild(gun50_r2);
		setRotationAngle(gun50_r2, 1.4192F, 0.0F, 0.0F);
		gun50_r2.cubeList.add(new ModelBox(gun50_r2, 42, 64, -0.5F, -5.4F, -0.5F, 1, 11, 1, 0.0F, false));

		gun54_r1 = new ModelRenderer(this);
		gun54_r1.setRotationPoint(1.9157F, -0.2297F, -0.3991F);
		gun.addChild(gun54_r1);
		setRotationAngle(gun54_r1, -2.7884F, 0.0F, 0.0F);
		gun54_r1.cubeList.add(new ModelBox(gun54_r1, 96, 21, -3.999F, 0.0F, 0.0F, 1, 1, 2, -0.002F, false));

		gun54_r2 = new ModelRenderer(this);
		gun54_r2.setRotationPoint(1.9157F, 0.7703F, -1.3991F);
		gun.addChild(gun54_r2);
		setRotationAngle(gun54_r2, -2.7884F, 0.0F, 0.0F);
		gun54_r2.cubeList.add(new ModelBox(gun54_r2, 96, 12, -3.999F, 0.0F, 0.0F, 1, 1, 2, -0.002F, false));
		gun54_r2.cubeList.add(new ModelBox(gun54_r2, 96, 65, -1.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-0.0843F, 1.1518F, -12.2746F);
		gun.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.3671F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 20, 44, -2.001F, -0.5216F, -0.4545F, 4, 1, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-0.5843F, 4.5703F, 0.8509F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 41, 47, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-0.5843F, -2.2726F, -35.1991F);
		gun.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 96, 95, 0.0F, -0.4571F, -26.5F, 1, 1, 6, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 96, 62, 0.0F, -1.2071F, -26.5F, 1, 1, 6, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 96, 55, 0.0F, 0.2071F, -26.5F, 1, 1, 6, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 96, 76, 0.7071F, -0.5F, -26.5F, 1, 1, 6, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 96, 69, -0.7071F, -0.5F, -26.5F, 1, 1, 6, 0.0F, false));

		gun705_r1 = new ModelRenderer(this);
		gun705_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
		bone11.addChild(gun705_r1);
		setRotationAngle(gun705_r1, 0.0F, 0.0F, -0.7854F);
		gun705_r1.cubeList.add(new ModelBox(gun705_r1, 31, 78, -0.5F, -0.5F, -26.5F, 1, 1, 6, 0.0F, false));

		gun704_r1 = new ModelRenderer(this);
		gun704_r1.setRotationPoint(0.4697F, 1.0303F, 0.0F);
		bone11.addChild(gun704_r1);
		setRotationAngle(gun704_r1, 0.0F, 0.0F, 0.7854F);
		gun704_r1.cubeList.add(new ModelBox(gun704_r1, 96, 48, -0.5F, -1.25F, -26.5F, 1, 1, 6, 0.0F, false));

		gun704_r2 = new ModelRenderer(this);
		gun704_r2.setRotationPoint(0.5303F, 0.0303F, 0.0F);
		bone11.addChild(gun704_r2);
		setRotationAngle(gun704_r2, 0.0F, 0.0F, -0.7854F);
		gun704_r2.cubeList.add(new ModelBox(gun704_r2, 48, 72, -0.5F, -1.25F, -26.5F, 1, 1, 6, 0.0F, false));

		gun703_r1 = new ModelRenderer(this);
		gun703_r1.setRotationPoint(0.4697F, 0.0303F, 0.0F);
		bone11.addChild(gun703_r1);
		setRotationAngle(gun703_r1, 0.0F, 0.0F, 0.7854F);
		gun703_r1.cubeList.add(new ModelBox(gun703_r1, 96, 83, -0.5F, -1.25F, -26.5F, 1, 1, 6, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(1.2657F, -0.9297F, -2.9991F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -1.2641F);
		gun132.cubeList.add(new ModelBox(gun132, 48, 60, -1.2277F, 0.1457F, -0.15F, 2, 1, 1, -0.2F, false));
		gun132.cubeList.add(new ModelBox(gun132, 56, 52, -1.227F, 0.145F, 0.25F, 2, 1, 1, -0.2F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(1.0157F, -0.8297F, -12.2991F);
		gun.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.3157F, 4.123F, -3.0484F);
		gun.addChild(bone);
		

		gun51_r5 = new ModelRenderer(this);
		gun51_r5.setRotationPoint(-2.8F, -0.6336F, 0.9429F);
		bone.addChild(gun51_r5);
		setRotationAngle(gun51_r5, -0.829F, 0.0F, 0.0F);
		gun51_r5.cubeList.add(new ModelBox(gun51_r5, 0, 104, -0.499F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		gun51_r5.cubeList.add(new ModelBox(gun51_r5, 104, 97, 2.299F, -0.5F, -0.5F, 1, 1, 1, -0.002F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.7534F, -3.4333F, -12.1991F);
		gun.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 104, 76, -0.3876F, 0.7536F, -0.5F, 1, 1, 1, 0.0F, false));

		gun42_r2 = new ModelRenderer(this);
		gun42_r2.setRotationPoint(0.0F, 0.4F, 0.0F);
		bone2.addChild(gun42_r2);
		setRotationAngle(gun42_r2, 0.0F, 0.0F, -0.2618F);
		gun42_r2.cubeList.add(new ModelBox(gun42_r2, 75, 104, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun43_r2 = new ModelRenderer(this);
		gun43_r2.setRotationPoint(0.0F, 2.1071F, 0.0F);
		bone2.addChild(gun43_r2);
		setRotationAngle(gun43_r2, 0.0F, 0.0F, 0.2618F);
		gun43_r2.cubeList.add(new ModelBox(gun43_r2, 104, 73, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.8407F, -3.1547F, 10.0509F);
		gun.addChild(bone3);
		

		gun45_r2 = new ModelRenderer(this);
		gun45_r2.setRotationPoint(0.0F, 0.4F, 0.0F);
		bone3.addChild(gun45_r2);
		setRotationAngle(gun45_r2, 0.5236F, 0.0F, 0.0F);
		gun45_r2.cubeList.add(new ModelBox(gun45_r2, 54, 38, -0.526F, -1.025F, -0.5F, 1, 3, 1, -0.2F, false));
		gun45_r2.cubeList.add(new ModelBox(gun45_r2, 104, 78, -0.527F, 1.325F, -0.501F, 1, 1, 1, -0.197F, false));

		gun44_r2 = new ModelRenderer(this);
		gun44_r2.setRotationPoint(0.0F, 0.4F, -1.0F);
		bone3.addChild(gun44_r2);
		setRotationAngle(gun44_r2, 0.5236F, 0.0F, 0.0F);
		gun44_r2.cubeList.add(new ModelBox(gun44_r2, 19, 59, -0.526F, -1.025F, -0.5F, 1, 3, 1, -0.2F, false));
		gun44_r2.cubeList.add(new ModelBox(gun44_r2, 104, 85, -0.527F, 1.325F, -0.501F, 1, 1, 1, -0.2F, false));

		gun43_r3 = new ModelRenderer(this);
		gun43_r3.setRotationPoint(0.0F, 0.4F, -2.0F);
		bone3.addChild(gun43_r3);
		setRotationAngle(gun43_r3, 0.5236F, 0.0F, 0.0F);
		gun43_r3.cubeList.add(new ModelBox(gun43_r3, 29, 59, -0.526F, -1.025F, -0.5F, 1, 3, 1, -0.2F, false));
		gun43_r3.cubeList.add(new ModelBox(gun43_r3, 104, 87, -0.527F, 1.325F, -0.501F, 1, 1, 1, -0.2F, false));

		gun42_r3 = new ModelRenderer(this);
		gun42_r3.setRotationPoint(0.0F, 0.4F, -3.0F);
		bone3.addChild(gun42_r3);
		setRotationAngle(gun42_r3, 0.5236F, 0.0F, 0.0F);
		gun42_r3.cubeList.add(new ModelBox(gun42_r3, 61, 33, -0.526F, -1.025F, -0.5F, 1, 3, 1, -0.2F, false));
		gun42_r3.cubeList.add(new ModelBox(gun42_r3, 88, 104, -0.527F, 1.325F, -0.501F, 1, 1, 1, -0.2F, false));

		gun44_r3 = new ModelRenderer(this);
		gun44_r3.setRotationPoint(0.0F, 0.4F, -4.0F);
		bone3.addChild(gun44_r3);
		setRotationAngle(gun44_r3, 0.5236F, 0.0F, 0.0F);
		gun44_r3.cubeList.add(new ModelBox(gun44_r3, 104, 95, -0.527F, 1.325F, -0.501F, 1, 1, 1, -0.2F, false));
		gun44_r3.cubeList.add(new ModelBox(gun44_r3, 61, 38, -0.526F, -1.025F, -0.5F, 1, 3, 1, -0.2F, false));

		gun43_r4 = new ModelRenderer(this);
		gun43_r4.setRotationPoint(0.0F, 0.4F, -5.0F);
		bone3.addChild(gun43_r4);
		setRotationAngle(gun43_r4, 0.5236F, 0.0F, 0.0F);
		gun43_r4.cubeList.add(new ModelBox(gun43_r4, 96, 104, -0.527F, 1.325F, -0.501F, 1, 1, 1, -0.2F, false));
		gun43_r4.cubeList.add(new ModelBox(gun43_r4, 54, 33, -0.526F, -1.025F, -0.5F, 1, 3, 1, -0.2F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-2.0093F, -3.1547F, 10.0509F);
		gun.addChild(bone4);
		

		gun46_r1 = new ModelRenderer(this);
		gun46_r1.setRotationPoint(0.0F, 0.4F, 0.0F);
		bone4.addChild(gun46_r1);
		setRotationAngle(gun46_r1, 0.5236F, 0.0F, 0.0F);
		gun46_r1.cubeList.add(new ModelBox(gun46_r1, 20, 37, -0.474F, -1.025F, -0.5F, 1, 3, 1, -0.2F, false));
		gun46_r1.cubeList.add(new ModelBox(gun46_r1, 48, 104, -0.473F, 1.325F, -0.501F, 1, 1, 1, -0.197F, false));

		gun45_r3 = new ModelRenderer(this);
		gun45_r3.setRotationPoint(0.0F, 0.4F, -1.0F);
		bone4.addChild(gun45_r3);
		setRotationAngle(gun45_r3, 0.5236F, 0.0F, 0.0F);
		gun45_r3.cubeList.add(new ModelBox(gun45_r3, 41, 0, -0.474F, -1.025F, -0.5F, 1, 3, 1, -0.2F, false));
		gun45_r3.cubeList.add(new ModelBox(gun45_r3, 104, 48, -0.473F, 1.325F, -0.501F, 1, 1, 1, -0.2F, false));

		gun44_r4 = new ModelRenderer(this);
		gun44_r4.setRotationPoint(0.0F, 0.4F, -2.0F);
		bone4.addChild(gun44_r4);
		setRotationAngle(gun44_r4, 0.5236F, 0.0F, 0.0F);
		gun44_r4.cubeList.add(new ModelBox(gun44_r4, 41, 5, -0.474F, -1.025F, -0.5F, 1, 3, 1, -0.2F, false));
		gun44_r4.cubeList.add(new ModelBox(gun44_r4, 104, 50, -0.473F, 1.325F, -0.501F, 1, 1, 1, -0.2F, false));

		gun43_r5 = new ModelRenderer(this);
		gun43_r5.setRotationPoint(0.0F, 0.4F, -3.0F);
		bone4.addChild(gun43_r5);
		setRotationAngle(gun43_r5, 0.5236F, 0.0F, 0.0F);
		gun43_r5.cubeList.add(new ModelBox(gun43_r5, 41, 25, -0.474F, -1.025F, -0.5F, 1, 3, 1, -0.2F, false));
		gun43_r5.cubeList.add(new ModelBox(gun43_r5, 104, 55, -0.473F, 1.325F, -0.501F, 1, 1, 1, -0.2F, false));

		gun45_r4 = new ModelRenderer(this);
		gun45_r4.setRotationPoint(0.0F, 0.4F, -4.0F);
		bone4.addChild(gun45_r4);
		setRotationAngle(gun45_r4, 0.5236F, 0.0F, 0.0F);
		gun45_r4.cubeList.add(new ModelBox(gun45_r4, 57, 104, -0.473F, 1.325F, -0.501F, 1, 1, 1, -0.2F, false));
		gun45_r4.cubeList.add(new ModelBox(gun45_r4, 48, 38, -0.474F, -1.025F, -0.5F, 1, 3, 1, -0.2F, false));

		gun44_r5 = new ModelRenderer(this);
		gun44_r5.setRotationPoint(0.0F, 0.4F, -5.0F);
		bone4.addChild(gun44_r5);
		setRotationAngle(gun44_r5, 0.5236F, 0.0F, 0.0F);
		gun44_r5.cubeList.add(new ModelBox(gun44_r5, 104, 57, -0.473F, 1.325F, -0.501F, 1, 1, 1, -0.2F, false));
		gun44_r5.cubeList.add(new ModelBox(gun44_r5, 48, 33, -0.474F, -1.025F, -0.5F, 1, 3, 1, -0.2F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-1.8843F, 1.2703F, 11.3009F);
		gun.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 82, 16, 0.001F, 0.0638F, -0.4959F, 3, 3, 3, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 82, 22, 0.599F, 0.0638F, -0.4959F, 3, 3, 3, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 20, 37, 0.299F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-1.8343F, -2.6297F, 12.0509F);
		gun.addChild(bone12);
		

		receiver15_r1 = new ModelRenderer(this);
		receiver15_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(receiver15_r1);
		setRotationAngle(receiver15_r1, 0.0F, 0.0F, -0.4014F);
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 78, 4, 0.0F, 0.0F, 0.05F, 1, 1, 2, 0.002F, false));
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 11, 81, -0.001F, 0.3F, 0.05F, 1, 1, 2, -0.001F, false));

		receiver14_r1 = new ModelRenderer(this);
		receiver14_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(receiver14_r1);
		setRotationAngle(receiver14_r1, 0.0F, 0.0F, 0.4014F);
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 78, 52, 0.0F, -1.0F, 0.05F, 1, 1, 2, 0.001F, false));
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 16, 89, -0.001F, -1.35F, 0.05F, 1, 1, 2, -0.001F, false));

		receiver17_r1 = new ModelRenderer(this);
		receiver17_r1.setRotationPoint(1.75F, 1.75F, 0.0F);
		bone12.addChild(receiver17_r1);
		setRotationAngle(receiver17_r1, 0.0F, 0.0F, 0.4014F);
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 87, 0, -1.35F, -0.999F, 0.05F, 1, 1, 2, -0.002F, false));
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 87, 3, -1.0F, -1.0F, 0.05F, 1, 1, 2, 0.001F, false));

		receiver17_r2 = new ModelRenderer(this);
		receiver17_r2.setRotationPoint(1.75F, 1.75F, 0.0F);
		bone12.addChild(receiver17_r2);
		setRotationAngle(receiver17_r2, 0.0F, 0.0F, -0.4014F);
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 87, 48, 0.0F, -1.0F, 0.05F, 1, 1, 2, 0.002F, false));
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 87, 51, 0.35F, -0.999F, 0.05F, 1, 1, 2, -0.002F, false));

		receiver16_r1 = new ModelRenderer(this);
		receiver16_r1.setRotationPoint(1.75F, -1.75F, 0.0F);
		bone12.addChild(receiver16_r1);
		setRotationAngle(receiver16_r1, 0.0F, 0.0F, -0.4014F);
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 22, 89, -1.35F, -0.001F, 0.05F, 1, 1, 2, -0.002F, false));
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 28, 89, -1.0F, 0.0F, 0.05F, 1, 1, 2, 0.002F, false));

		receiver16_r2 = new ModelRenderer(this);
		receiver16_r2.setRotationPoint(1.75F, -1.75F, 0.0F);
		bone12.addChild(receiver16_r2);
		setRotationAngle(receiver16_r2, 0.0F, 0.0F, 0.4014F);
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 34, 89, 0.0F, 0.0F, 0.05F, 1, 1, 2, 0.001F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 40, 89, 0.35F, -0.001F, 0.05F, 1, 1, 2, -0.002F, false));

		receiver16_r3 = new ModelRenderer(this);
		receiver16_r3.setRotationPoint(3.5F, 0.0F, 0.0F);
		bone12.addChild(receiver16_r3);
		setRotationAngle(receiver16_r3, 0.0F, 0.0F, 0.4014F);
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 83, 89, -1.0F, 0.0F, 0.05F, 1, 1, 2, 0.001F, false));
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 54, 90, -0.999F, 0.3F, 0.05F, 1, 1, 2, -0.001F, false));

		receiver15_r2 = new ModelRenderer(this);
		receiver15_r2.setRotationPoint(3.5F, 0.0F, 0.0F);
		bone12.addChild(receiver15_r2);
		setRotationAngle(receiver15_r2, 0.0F, 0.0F, -0.4014F);
		receiver15_r2.cubeList.add(new ModelBox(receiver15_r2, 48, 90, -1.0F, -1.0F, 0.05F, 1, 1, 2, 0.002F, false));
		receiver15_r2.cubeList.add(new ModelBox(receiver15_r2, 0, 94, -0.999F, -1.35F, 0.05F, 1, 1, 2, -0.001F, false));

		receiver16_r4 = new ModelRenderer(this);
		receiver16_r4.setRotationPoint(1.75F, 0.0F, 0.75F);
		bone12.addChild(receiver16_r4);
		setRotationAngle(receiver16_r4, 0.0F, 0.0F, -0.3316F);
		receiver16_r4.cubeList.add(new ModelBox(receiver16_r4, 11, 77, -1.0F, -1.001F, 8.0015F, 2, 2, 7, -0.1F, false));
		receiver16_r4.cubeList.add(new ModelBox(receiver16_r4, 48, 0, -1.0F, -1.001F, -0.7F, 2, 2, 15, -0.2F, false));

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(-0.412F, -12.1156F, -31.0F);
		handguard.cubeList.add(new ModelBox(handguard, 78, 48, 0.11F, -1.8594F, 1.5F, 1, 2, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 75, 80, 0.11F, -1.8594F, -5.5F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 64, 80, 0.11F, -1.8594F, -12.5F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 80, 61, 0.11F, -1.8594F, -19.5F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 53, 80, 0.11F, -1.8594F, -26.5F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 77, 36, 0.1115F, -2.2337F, -33.5F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 96, 83, 0.111F, -0.4844F, -33.5F, 1, 1, 1, 0.002F, false));
		handguard.cubeList.add(new ModelBox(handguard, 190, 133, 0.212F, -0.3844F, -33.4F, 1, 1, 42, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 188, 44, 0.212F, -2.3344F, -33.4F, 1, 1, 42, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 100, 138, -2.088F, -4.0094F, -33.5F, 2, 1, 42, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 96, 95, -2.088F, 0.8906F, -33.5F, 2, 1, 42, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 73, 86, -2.088F, 1.8906F, 2.5F, 2, 1, 6, 0.0F, false));

		gun54_r3 = new ModelRenderer(this);
		gun54_r3.setRotationPoint(0.2717F, 1.4624F, -28.6328F);
		handguard.addChild(gun54_r3);
		setRotationAngle(gun54_r3, 0.0F, 0.7854F, -1.0036F);
		gun54_r3.cubeList.add(new ModelBox(gun54_r3, 60, 98, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(0.7284F, 0.7455F, -28.6328F);
		handguard.addChild(gun53_r1);
		setRotationAngle(gun53_r1, 0.0F, 0.7854F, -1.0036F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 52, 98, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun53_r2 = new ModelRenderer(this);
		gun53_r2.setRotationPoint(0.2717F, 1.4624F, -21.6328F);
		handguard.addChild(gun53_r2);
		setRotationAngle(gun53_r2, 0.0F, 0.7854F, -1.0036F);
		gun53_r2.cubeList.add(new ModelBox(gun53_r2, 24, 99, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun52_r3 = new ModelRenderer(this);
		gun52_r3.setRotationPoint(0.7284F, 0.7455F, -21.6328F);
		handguard.addChild(gun52_r3);
		setRotationAngle(gun52_r3, 0.0F, 0.7854F, -1.0036F);
		gun52_r3.cubeList.add(new ModelBox(gun52_r3, 15, 99, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun53_r3 = new ModelRenderer(this);
		gun53_r3.setRotationPoint(0.7284F, 0.7455F, -23.0078F);
		handguard.addChild(gun53_r3);
		setRotationAngle(gun53_r3, 0.0F, 0.7854F, -1.0036F);
		gun53_r3.cubeList.add(new ModelBox(gun53_r3, 0, 99, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun54_r4 = new ModelRenderer(this);
		gun54_r4.setRotationPoint(0.2717F, 1.4624F, -23.0078F);
		handguard.addChild(gun54_r4);
		setRotationAngle(gun54_r4, 0.0F, 0.7854F, -1.0036F);
		gun54_r4.cubeList.add(new ModelBox(gun54_r4, 69, 98, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun52_r4 = new ModelRenderer(this);
		gun52_r4.setRotationPoint(0.2717F, 1.4624F, -14.6328F);
		handguard.addChild(gun52_r4);
		setRotationAngle(gun52_r4, 0.0F, 0.7854F, -1.0036F);
		gun52_r4.cubeList.add(new ModelBox(gun52_r4, 99, 91, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun51_r6 = new ModelRenderer(this);
		gun51_r6.setRotationPoint(0.7284F, 0.7455F, -14.6328F);
		handguard.addChild(gun51_r6);
		setRotationAngle(gun51_r6, 0.0F, 0.7854F, -1.0036F);
		gun51_r6.cubeList.add(new ModelBox(gun51_r6, 72, 99, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun52_r5 = new ModelRenderer(this);
		gun52_r5.setRotationPoint(0.7284F, 0.7455F, -16.0078F);
		handguard.addChild(gun52_r5);
		setRotationAngle(gun52_r5, 0.0F, 0.7854F, -1.0036F);
		gun52_r5.cubeList.add(new ModelBox(gun52_r5, 63, 99, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun53_r4 = new ModelRenderer(this);
		gun53_r4.setRotationPoint(0.2717F, 1.4624F, -16.0078F);
		handguard.addChild(gun53_r4);
		setRotationAngle(gun53_r4, 0.0F, 0.7854F, -1.0036F);
		gun53_r4.cubeList.add(new ModelBox(gun53_r4, 35, 99, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun51_r7 = new ModelRenderer(this);
		gun51_r7.setRotationPoint(0.2717F, 1.4624F, -7.6328F);
		handguard.addChild(gun51_r7);
		setRotationAngle(gun51_r7, 0.0F, 0.7854F, -1.0036F);
		gun51_r7.cubeList.add(new ModelBox(gun51_r7, 100, 6, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun50_r3 = new ModelRenderer(this);
		gun50_r3.setRotationPoint(0.7284F, 0.7455F, -7.6328F);
		handguard.addChild(gun50_r3);
		setRotationAngle(gun50_r3, 0.0F, 0.7854F, -1.0036F);
		gun50_r3.cubeList.add(new ModelBox(gun50_r3, 100, 3, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun51_r8 = new ModelRenderer(this);
		gun51_r8.setRotationPoint(0.7284F, 0.7455F, -9.0078F);
		handguard.addChild(gun51_r8);
		setRotationAngle(gun51_r8, 0.0F, 0.7854F, -1.0036F);
		gun51_r8.cubeList.add(new ModelBox(gun51_r8, 100, 0, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun52_r6 = new ModelRenderer(this);
		gun52_r6.setRotationPoint(0.2717F, 1.4624F, -9.0078F);
		handguard.addChild(gun52_r6);
		setRotationAngle(gun52_r6, 0.0F, 0.7854F, -1.0036F);
		gun52_r6.cubeList.add(new ModelBox(gun52_r6, 96, 99, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun50_r4 = new ModelRenderer(this);
		gun50_r4.setRotationPoint(0.7284F, 0.7455F, -2.0078F);
		handguard.addChild(gun50_r4);
		setRotationAngle(gun50_r4, 0.0F, 0.7854F, -1.0036F);
		gun50_r4.cubeList.add(new ModelBox(gun50_r4, 100, 12, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun51_r9 = new ModelRenderer(this);
		gun51_r9.setRotationPoint(0.2717F, 1.4624F, -2.0078F);
		handguard.addChild(gun51_r9);
		setRotationAngle(gun51_r9, 0.0F, 0.7854F, -1.0036F);
		gun51_r9.cubeList.add(new ModelBox(gun51_r9, 100, 9, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun45_r5 = new ModelRenderer(this);
		gun45_r5.setRotationPoint(0.1643F, 1.6311F, -12.8F);
		handguard.addChild(gun45_r5);
		setRotationAngle(gun45_r5, 0.0F, 0.0F, -1.0036F);
		gun45_r5.cubeList.add(new ModelBox(gun45_r5, 0, 184, -0.5F, -0.5F, -21.0F, 1, 1, 42, -0.299F, false));

		gun45_r6 = new ModelRenderer(this);
		gun45_r6.setRotationPoint(0.8359F, 0.5768F, -12.8F);
		handguard.addChild(gun45_r6);
		setRotationAngle(gun45_r6, 0.0F, 0.0F, -1.0036F);
		gun45_r6.cubeList.add(new ModelBox(gun45_r6, 88, 181, -0.5F, -0.5F, -21.0F, 1, 1, 42, -0.3F, false));

		gun45_r7 = new ModelRenderer(this);
		gun45_r7.setRotationPoint(-1.088F, 0.4157F, 4.2678F);
		handguard.addChild(gun45_r7);
		setRotationAngle(gun45_r7, 0.7854F, 0.0F, 0.0F);
		gun45_r7.cubeList.add(new ModelBox(gun45_r7, 30, 37, -1.001F, -1.5F, -3.0F, 2, 2, 2, 0.0F, false));

		gun45_r8 = new ModelRenderer(this);
		gun45_r8.setRotationPoint(0.8335F, -2.1853F, -12.6F);
		handguard.addChild(gun45_r8);
		setRotationAngle(gun45_r8, 0.0F, 0.0F, -0.9599F);
		gun45_r8.cubeList.add(new ModelBox(gun45_r8, 186, 90, -0.5F, -1.725F, -21.0F, 1, 1, 42, -0.3F, false));
		gun45_r8.cubeList.add(new ModelBox(gun45_r8, 188, 1, -0.5F, -0.5F, -21.0F, 1, 1, 42, -0.3F, false));

		gun55_r1 = new ModelRenderer(this);
		gun55_r1.setRotationPoint(0.3318F, -2.5366F, -15.3578F);
		handguard.addChild(gun55_r1);
		setRotationAngle(gun55_r1, 0.7854F, 0.0F, -0.9599F);
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 96, 90, -0.525F, -10.2139F, -9.6305F, 1, 1, 1, -0.3F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 96, 87, -0.525F, -9.6305F, -10.2139F, 1, 1, 1, -0.3F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 24, 97, -0.525F, -5.2641F, -4.6808F, 1, 1, 1, -0.3F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 15, 97, -0.525F, -4.6808F, -5.2641F, 1, 1, 1, -0.3F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 0, 97, -0.525F, -6.2187F, -5.6354F, 1, 1, 1, -0.3F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 96, 95, -0.525F, -5.6354F, -6.2187F, 1, 1, 1, -0.3F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 96, 97, -0.525F, -0.3144F, 0.269F, 1, 1, 1, -0.3F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 90, 97, -0.525F, 0.269F, -0.3144F, 1, 1, 1, -0.3F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 78, 97, -0.525F, -1.269F, -0.6856F, 1, 1, 1, -0.3F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 35, 97, -0.525F, -0.6856F, -1.269F, 1, 1, 1, -0.3F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 38, 98, -0.525F, 4.6354F, 5.2187F, 1, 1, 1, -0.3F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 27, 98, -0.525F, 5.2187F, 4.6354F, 1, 1, 1, -0.3F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 18, 98, -0.525F, 3.6808F, 4.2641F, 1, 1, 1, -0.3F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 3, 98, -0.525F, 4.2641F, 3.6808F, 1, 1, 1, -0.3F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 48, 98, -0.525F, 8.6305F, 9.2139F, 1, 1, 1, -0.3F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 42, 98, -0.525F, 9.2139F, 8.6305F, 1, 1, 1, -0.3F, false));

		gun49_r3 = new ModelRenderer(this);
		gun49_r3.setRotationPoint(0.4239F, -2.4721F, -8.35F);
		handguard.addChild(gun49_r3);
		setRotationAngle(gun49_r3, 0.0F, 0.0F, -0.9599F);
		gun49_r3.cubeList.add(new ModelBox(gun49_r3, 82, 9, -0.5009F, -1.0F, -25.0F, 1, 2, 5, -0.3F, false));
		gun49_r3.cubeList.add(new ModelBox(gun49_r3, 22, 78, -0.5009F, -1.0F, -15.0F, 1, 2, 2, -0.3F, false));
		gun49_r3.cubeList.add(new ModelBox(gun49_r3, 31, 78, -0.5009F, -1.0F, -8.0F, 1, 2, 2, -0.3F, false));
		gun49_r3.cubeList.add(new ModelBox(gun49_r3, 65, 48, -0.5009F, -1.0F, 6.0F, 1, 2, 11, -0.3F, false));
		gun49_r3.cubeList.add(new ModelBox(gun49_r3, 78, 48, -0.5009F, -1.0F, -1.0F, 1, 2, 2, -0.3F, false));

		gun49_r4 = new ModelRenderer(this);
		gun49_r4.setRotationPoint(-0.1451F, 0.0704F, 7.3F);
		handguard.addChild(gun49_r4);
		setRotationAngle(gun49_r4, 0.0F, 0.0F, -1.0036F);
		gun49_r4.cubeList.add(new ModelBox(gun49_r4, 40, 42, -1.5F, 0.4994F, -41.0F, 2, 1, 1, -0.201F, false));

		gun48_r3 = new ModelRenderer(this);
		gun48_r3.setRotationPoint(-0.1456F, 0.0701F, 7.45F);
		handguard.addChild(gun48_r3);
		setRotationAngle(gun48_r3, 0.0F, 0.0F, -1.0036F);
		gun48_r3.cubeList.add(new ModelBox(gun48_r3, 56, 4, -1.5F, 0.4995F, 0.25F, 2, 1, 1, -0.2F, false));

		gun48_r4 = new ModelRenderer(this);
		gun48_r4.setRotationPoint(0.4239F, -2.4721F, 8.3F);
		handguard.addChild(gun48_r4);
		setRotationAngle(gun48_r4, 0.0F, 0.0F, -0.9599F);
		gun48_r4.cubeList.add(new ModelBox(gun48_r4, 0, 47, -0.5009F, -2.0F, -42.1F, 1, 3, 2, -0.301F, false));
		gun48_r4.cubeList.add(new ModelBox(gun48_r4, 0, 37, -0.5F, -2.0F, -0.5F, 1, 3, 1, -0.3F, false));

		gun44_r6 = new ModelRenderer(this);
		gun44_r6.setRotationPoint(-3.586F, -0.6594F, 1.5F);
		handguard.addChild(gun44_r6);
		setRotationAngle(gun44_r6, -0.4887F, 0.0F, 0.0F);
		gun44_r6.cubeList.add(new ModelBox(gun44_r6, 56, 68, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));
		gun44_r6.cubeList.add(new ModelBox(gun44_r6, 73, 61, 3.996F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun45_r9 = new ModelRenderer(this);
		gun45_r9.setRotationPoint(-3.586F, -0.6594F, -5.7F);
		handguard.addChild(gun45_r9);
		setRotationAngle(gun45_r9, -0.4887F, 0.0F, 0.0F);
		gun45_r9.cubeList.add(new ModelBox(gun45_r9, 48, 68, 0.0F, -1.0F, 0.05F, 1, 1, 1, -0.2F, false));
		gun45_r9.cubeList.add(new ModelBox(gun45_r9, 18, 73, 3.996F, -1.0F, 0.05F, 1, 1, 1, -0.2F, false));

		gun46_r2 = new ModelRenderer(this);
		gun46_r2.setRotationPoint(-3.586F, -0.6594F, -12.7F);
		handguard.addChild(gun46_r2);
		setRotationAngle(gun46_r2, -0.4887F, 0.0F, 0.0F);
		gun46_r2.cubeList.add(new ModelBox(gun46_r2, 65, 61, 0.0F, -1.0F, 0.05F, 1, 1, 1, -0.2F, false));
		gun46_r2.cubeList.add(new ModelBox(gun46_r2, 69, 72, 3.996F, -1.0F, 0.05F, 1, 1, 1, -0.2F, false));

		gun47_r1 = new ModelRenderer(this);
		gun47_r1.setRotationPoint(-3.586F, -0.6594F, -19.7F);
		handguard.addChild(gun47_r1);
		setRotationAngle(gun47_r1, -0.4887F, 0.0F, 0.0F);
		gun47_r1.cubeList.add(new ModelBox(gun47_r1, 56, 60, 0.0F, -1.0F, 0.05F, 1, 1, 1, -0.2F, false));
		gun47_r1.cubeList.add(new ModelBox(gun47_r1, 65, 72, 3.996F, -1.0F, 0.05F, 1, 1, 1, -0.2F, false));

		gun48_r5 = new ModelRenderer(this);
		gun48_r5.setRotationPoint(-3.586F, -0.6594F, -26.7F);
		handguard.addChild(gun48_r5);
		setRotationAngle(gun48_r5, -0.4887F, 0.0F, 0.0F);
		gun48_r5.cubeList.add(new ModelBox(gun48_r5, 58, 13, 0.0F, -1.0F, 0.05F, 1, 1, 1, -0.2F, false));
		gun48_r5.cubeList.add(new ModelBox(gun48_r5, 72, 44, 3.996F, -1.0F, 0.05F, 1, 1, 1, -0.2F, false));

		gun49_r5 = new ModelRenderer(this);
		gun49_r5.setRotationPoint(-3.586F, -0.6594F, -33.7F);
		handguard.addChild(gun49_r5);
		setRotationAngle(gun49_r5, -0.4887F, 0.0F, 0.0F);
		gun49_r5.cubeList.add(new ModelBox(gun49_r5, 34, 41, 0.0F, -1.0F, 0.05F, 1, 1, 1, -0.2F, false));
		gun49_r5.cubeList.add(new ModelBox(gun49_r5, 69, 61, 3.996F, -1.0F, 0.05F, 1, 1, 1, -0.2F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.713F, -0.4501F, 1.5F);
		handguard.addChild(bone5);
		

		gun46_r3 = new ModelRenderer(this);
		gun46_r3.setRotationPoint(0.0F, 0.4F, 0.0F);
		bone5.addChild(gun46_r3);
		setRotationAngle(gun46_r3, -0.7854F, 0.0F, 0.0F);
		gun46_r3.cubeList.add(new ModelBox(gun46_r3, 102, 90, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun45_r10 = new ModelRenderer(this);
		gun45_r10.setRotationPoint(0.0F, -1.225F, 0.0F);
		bone5.addChild(gun45_r10);
		setRotationAngle(gun45_r10, -0.7854F, 0.0F, 0.0F);
		gun45_r10.cubeList.add(new ModelBox(gun45_r10, 96, 102, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun47_r2 = new ModelRenderer(this);
		gun47_r2.setRotationPoint(0.0F, 0.4F, -6.0F);
		bone5.addChild(gun47_r2);
		setRotationAngle(gun47_r2, -0.7854F, 0.0F, 0.0F);
		gun47_r2.cubeList.add(new ModelBox(gun47_r2, 42, 102, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun48_r6 = new ModelRenderer(this);
		gun48_r6.setRotationPoint(0.0F, 0.4F, -7.0F);
		bone5.addChild(gun48_r6);
		setRotationAngle(gun48_r6, -0.7854F, 0.0F, 0.0F);
		gun48_r6.cubeList.add(new ModelBox(gun48_r6, 8, 102, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun46_r4 = new ModelRenderer(this);
		gun46_r4.setRotationPoint(0.0F, -1.225F, -6.0F);
		bone5.addChild(gun46_r4);
		setRotationAngle(gun46_r4, -0.7854F, 0.0F, 0.0F);
		gun46_r4.cubeList.add(new ModelBox(gun46_r4, 88, 102, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun49_r6 = new ModelRenderer(this);
		gun49_r6.setRotationPoint(0.0F, -1.225F, -14.0F);
		bone5.addChild(gun49_r6);
		setRotationAngle(gun49_r6, -0.7854F, 0.0F, 0.0F);
		gun49_r6.cubeList.add(new ModelBox(gun49_r6, 24, 101, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun50_r5 = new ModelRenderer(this);
		gun50_r5.setRotationPoint(0.0F, 0.4F, -14.0F);
		bone5.addChild(gun50_r5);
		setRotationAngle(gun50_r5, -0.7854F, 0.0F, 0.0F);
		gun50_r5.cubeList.add(new ModelBox(gun50_r5, 69, 100, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun48_r7 = new ModelRenderer(this);
		gun48_r7.setRotationPoint(0.0F, -1.225F, -13.0F);
		bone5.addChild(gun48_r7);
		setRotationAngle(gun48_r7, -0.7854F, 0.0F, 0.0F);
		gun48_r7.cubeList.add(new ModelBox(gun48_r7, 0, 102, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun49_r7 = new ModelRenderer(this);
		gun49_r7.setRotationPoint(0.0F, 0.4F, -13.0F);
		bone5.addChild(gun49_r7);
		setRotationAngle(gun49_r7, -0.7854F, 0.0F, 0.0F);
		gun49_r7.cubeList.add(new ModelBox(gun49_r7, 35, 101, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun47_r3 = new ModelRenderer(this);
		gun47_r3.setRotationPoint(0.0F, -1.225F, -7.0F);
		bone5.addChild(gun47_r3);
		setRotationAngle(gun47_r3, -0.7854F, 0.0F, 0.0F);
		gun47_r3.cubeList.add(new ModelBox(gun47_r3, 38, 102, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun53_r5 = new ModelRenderer(this);
		gun53_r5.setRotationPoint(0.0F, -1.225F, -28.0F);
		bone5.addChild(gun53_r5);
		setRotationAngle(gun53_r5, -0.7854F, 0.0F, 0.0F);
		gun53_r5.cubeList.add(new ModelBox(gun53_r5, 100, 24, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun54_r5 = new ModelRenderer(this);
		gun54_r5.setRotationPoint(0.0F, 0.4F, -28.0F);
		bone5.addChild(gun54_r5);
		setRotationAngle(gun54_r5, -0.7854F, 0.0F, 0.0F);
		gun54_r5.cubeList.add(new ModelBox(gun54_r5, 100, 21, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun52_r7 = new ModelRenderer(this);
		gun52_r7.setRotationPoint(0.0F, -1.225F, -27.0F);
		bone5.addChild(gun52_r7);
		setRotationAngle(gun52_r7, -0.7854F, 0.0F, 0.0F);
		gun52_r7.cubeList.add(new ModelBox(gun52_r7, 38, 100, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun53_r6 = new ModelRenderer(this);
		gun53_r6.setRotationPoint(0.0F, 0.4F, -27.0F);
		bone5.addChild(gun53_r6);
		setRotationAngle(gun53_r6, -0.7854F, 0.0F, 0.0F);
		gun53_r6.cubeList.add(new ModelBox(gun53_r6, 27, 100, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun51_r10 = new ModelRenderer(this);
		gun51_r10.setRotationPoint(0.0F, -1.225F, -21.0F);
		bone5.addChild(gun51_r10);
		setRotationAngle(gun51_r10, -0.7854F, 0.0F, 0.0F);
		gun51_r10.cubeList.add(new ModelBox(gun51_r10, 48, 100, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun52_r8 = new ModelRenderer(this);
		gun52_r8.setRotationPoint(0.0F, 0.4F, -21.0F);
		bone5.addChild(gun52_r8);
		setRotationAngle(gun52_r8, -0.7854F, 0.0F, 0.0F);
		gun52_r8.cubeList.add(new ModelBox(gun52_r8, 42, 100, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun50_r6 = new ModelRenderer(this);
		gun50_r6.setRotationPoint(0.0F, -1.225F, -20.0F);
		bone5.addChild(gun50_r6);
		setRotationAngle(gun50_r6, -0.7854F, 0.0F, 0.0F);
		gun50_r6.cubeList.add(new ModelBox(gun50_r6, 60, 100, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun51_r11 = new ModelRenderer(this);
		gun51_r11.setRotationPoint(0.0F, 0.4F, -20.0F);
		bone5.addChild(gun51_r11);
		setRotationAngle(gun51_r11, -0.7854F, 0.0F, 0.0F);
		gun51_r11.cubeList.add(new ModelBox(gun51_r11, 52, 100, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun54_r6 = new ModelRenderer(this);
		gun54_r6.setRotationPoint(0.0F, -1.225F, -34.0F);
		bone5.addChild(gun54_r6);
		setRotationAngle(gun54_r6, -0.7854F, 0.0F, 0.0F);
		gun54_r6.cubeList.add(new ModelBox(gun54_r6, 100, 18, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun55_r2 = new ModelRenderer(this);
		gun55_r2.setRotationPoint(0.0F, 0.4F, -34.0F);
		bone5.addChild(gun55_r2);
		setRotationAngle(gun55_r2, -0.7854F, 0.0F, 0.0F);
		gun55_r2.cubeList.add(new ModelBox(gun55_r2, 100, 15, -0.503F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.4329F, 0.8094F, -15.8F);
		handguard.addChild(bone7);
		

		gun49_r8 = new ModelRenderer(this);
		gun49_r8.setRotationPoint(0.0F, 0.4F, -6.5F);
		bone7.addChild(gun49_r8);
		setRotationAngle(gun49_r8, 0.0F, 0.0F, -1.0036F);
		gun49_r8.cubeList.add(new ModelBox(gun49_r8, 81, 43, -1.0F, -0.5007F, -1.0F, 2, 1, 2, -0.3F, false));
		gun49_r8.cubeList.add(new ModelBox(gun49_r8, 19, 47, -1.0F, -0.5007F, 20.0F, 2, 1, 11, -0.3F, false));
		gun49_r8.cubeList.add(new ModelBox(gun49_r8, 86, 65, -1.0F, -0.5007F, 13.0F, 2, 1, 2, -0.3F, false));
		gun49_r8.cubeList.add(new ModelBox(gun49_r8, 70, 86, -1.0F, -0.5007F, 6.0F, 2, 1, 2, -0.3F, false));
		gun49_r8.cubeList.add(new ModelBox(gun49_r8, 104, 48, -1.0F, -0.5007F, -11.0F, 2, 1, 5, -0.3F, false));

		le_hand_guard2 = new ModelRenderer(this);
		le_hand_guard2.setRotationPoint(-2.1759F, 0.0F, 0.0F);
		handguard.addChild(le_hand_guard2);
		le_hand_guard2.cubeList.add(new ModelBox(le_hand_guard2, 77, 61, -1.11F, -1.8594F, 1.5F, 1, 2, 7, 0.0F, false));
		le_hand_guard2.cubeList.add(new ModelBox(le_hand_guard2, 71, 22, -1.11F, -1.8594F, -5.5F, 1, 2, 1, 0.0F, false));
		le_hand_guard2.cubeList.add(new ModelBox(le_hand_guard2, 71, 17, -1.11F, -1.8594F, -12.5F, 1, 2, 1, 0.0F, false));
		le_hand_guard2.cubeList.add(new ModelBox(le_hand_guard2, 5, 70, -1.11F, -1.8594F, -19.5F, 1, 2, 1, 0.0F, false));
		le_hand_guard2.cubeList.add(new ModelBox(le_hand_guard2, 67, 38, -1.11F, -1.8594F, -26.5F, 1, 2, 1, 0.0F, false));
		le_hand_guard2.cubeList.add(new ModelBox(le_hand_guard2, 67, 33, -1.1115F, -2.2337F, -33.5F, 1, 2, 1, 0.0F, false));
		le_hand_guard2.cubeList.add(new ModelBox(le_hand_guard2, 52, 90, -1.111F, -0.4844F, -33.5F, 1, 1, 1, 0.002F, false));
		le_hand_guard2.cubeList.add(new ModelBox(le_hand_guard2, 146, 180, -1.212F, -0.3844F, -33.4F, 1, 1, 42, -0.1F, false));
		le_hand_guard2.cubeList.add(new ModelBox(le_hand_guard2, 146, 137, -1.212F, -2.3344F, -33.4F, 1, 1, 42, -0.1F, false));

		gun55_r3 = new ModelRenderer(this);
		gun55_r3.setRotationPoint(-0.2717F, 1.4624F, -28.6328F);
		le_hand_guard2.addChild(gun55_r3);
		setRotationAngle(gun55_r3, 0.0F, -0.7854F, 1.0036F);
		gun55_r3.cubeList.add(new ModelBox(gun55_r3, 76, 77, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun54_r7 = new ModelRenderer(this);
		gun54_r7.setRotationPoint(-0.7284F, 0.7455F, -28.6328F);
		le_hand_guard2.addChild(gun54_r7);
		setRotationAngle(gun54_r7, 0.0F, -0.7854F, 1.0036F);
		gun54_r7.cubeList.add(new ModelBox(gun54_r7, 78, 57, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun54_r8 = new ModelRenderer(this);
		gun54_r8.setRotationPoint(-0.2717F, 1.4624F, -21.6328F);
		le_hand_guard2.addChild(gun54_r8);
		setRotationAngle(gun54_r8, 0.0F, -0.7854F, 1.0036F);
		gun54_r8.cubeList.add(new ModelBox(gun54_r8, 82, 11, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun53_r7 = new ModelRenderer(this);
		gun53_r7.setRotationPoint(-0.7284F, 0.7455F, -21.6328F);
		le_hand_guard2.addChild(gun53_r7);
		setRotationAngle(gun53_r7, 0.0F, -0.7854F, 1.0036F);
		gun53_r7.cubeList.add(new ModelBox(gun53_r7, 22, 82, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun54_r9 = new ModelRenderer(this);
		gun54_r9.setRotationPoint(-0.7284F, 0.7455F, -23.0078F);
		le_hand_guard2.addChild(gun54_r9);
		setRotationAngle(gun54_r9, 0.0F, -0.7854F, 1.0036F);
		gun54_r9.cubeList.add(new ModelBox(gun54_r9, 31, 82, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun55_r4 = new ModelRenderer(this);
		gun55_r4.setRotationPoint(-0.2717F, 1.4624F, -23.0078F);
		le_hand_guard2.addChild(gun55_r4);
		setRotationAngle(gun55_r4, 0.0F, -0.7854F, 1.0036F);
		gun55_r4.cubeList.add(new ModelBox(gun55_r4, 39, 82, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun53_r8 = new ModelRenderer(this);
		gun53_r8.setRotationPoint(-0.2717F, 1.4624F, -14.6328F);
		le_hand_guard2.addChild(gun53_r8);
		setRotationAngle(gun53_r8, 0.0F, -0.7854F, 1.0036F);
		gun53_r8.cubeList.add(new ModelBox(gun53_r8, 82, 57, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun52_r9 = new ModelRenderer(this);
		gun52_r9.setRotationPoint(-0.7284F, 0.7455F, -14.6328F);
		le_hand_guard2.addChild(gun52_r9);
		setRotationAngle(gun52_r9, 0.0F, -0.7854F, 1.0036F);
		gun52_r9.cubeList.add(new ModelBox(gun52_r9, 82, 70, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun53_r9 = new ModelRenderer(this);
		gun53_r9.setRotationPoint(-0.7284F, 0.7455F, -16.0078F);
		le_hand_guard2.addChild(gun53_r9);
		setRotationAngle(gun53_r9, 0.0F, -0.7854F, 1.0036F);
		gun53_r9.cubeList.add(new ModelBox(gun53_r9, 82, 76, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun54_r10 = new ModelRenderer(this);
		gun54_r10.setRotationPoint(-0.2717F, 1.4624F, -16.0078F);
		le_hand_guard2.addChild(gun54_r10);
		setRotationAngle(gun54_r10, 0.0F, -0.7854F, 1.0036F);
		gun54_r10.cubeList.add(new ModelBox(gun54_r10, 82, 78, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun52_r10 = new ModelRenderer(this);
		gun52_r10.setRotationPoint(-0.2717F, 1.4624F, -7.6328F);
		le_hand_guard2.addChild(gun52_r10);
		setRotationAngle(gun52_r10, 0.0F, -0.7854F, 1.0036F);
		gun52_r10.cubeList.add(new ModelBox(gun52_r10, 82, 82, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun51_r12 = new ModelRenderer(this);
		gun51_r12.setRotationPoint(-0.7284F, 0.7455F, -7.6328F);
		le_hand_guard2.addChild(gun51_r12);
		setRotationAngle(gun51_r12, 0.0F, -0.7854F, 1.0036F);
		gun51_r12.cubeList.add(new ModelBox(gun51_r12, 31, 85, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun52_r11 = new ModelRenderer(this);
		gun52_r11.setRotationPoint(-0.7284F, 0.7455F, -9.0078F);
		le_hand_guard2.addChild(gun52_r11);
		setRotationAngle(gun52_r11, 0.0F, -0.7854F, 1.0036F);
		gun52_r11.cubeList.add(new ModelBox(gun52_r11, 35, 85, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun53_r10 = new ModelRenderer(this);
		gun53_r10.setRotationPoint(-0.2717F, 1.4624F, -9.0078F);
		le_hand_guard2.addChild(gun53_r10);
		setRotationAngle(gun53_r10, 0.0F, -0.7854F, 1.0036F);
		gun53_r10.cubeList.add(new ModelBox(gun53_r10, 86, 57, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun51_r13 = new ModelRenderer(this);
		gun51_r13.setRotationPoint(-0.7284F, 0.7455F, -2.0078F);
		le_hand_guard2.addChild(gun51_r13);
		setRotationAngle(gun51_r13, 0.0F, -0.7854F, 1.0036F);
		gun51_r13.cubeList.add(new ModelBox(gun51_r13, 86, 82, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun52_r12 = new ModelRenderer(this);
		gun52_r12.setRotationPoint(-0.2717F, 1.4624F, -2.0078F);
		le_hand_guard2.addChild(gun52_r12);
		setRotationAngle(gun52_r12, 0.0F, -0.7854F, 1.0036F);
		gun52_r12.cubeList.add(new ModelBox(gun52_r12, 87, 43, -0.5F, -0.525F, -0.5F, 1, 1, 1, -0.3F, false));

		gun46_r5 = new ModelRenderer(this);
		gun46_r5.setRotationPoint(-0.1643F, 1.6311F, -12.8F);
		le_hand_guard2.addChild(gun46_r5);
		setRotationAngle(gun46_r5, 0.0F, 0.0F, 1.0036F);
		gun46_r5.cubeList.add(new ModelBox(gun46_r5, 0, 141, -0.5F, -0.5F, -21.0F, 1, 1, 42, -0.299F, false));

		gun46_r6 = new ModelRenderer(this);
		gun46_r6.setRotationPoint(-0.8359F, 0.5768F, -12.8F);
		le_hand_guard2.addChild(gun46_r6);
		setRotationAngle(gun46_r6, 0.0F, 0.0F, 1.0036F);
		gun46_r6.cubeList.add(new ModelBox(gun46_r6, 44, 142, -0.5F, -0.5F, -21.0F, 1, 1, 42, -0.3F, false));

		gun46_r7 = new ModelRenderer(this);
		gun46_r7.setRotationPoint(-0.8335F, -2.1853F, -12.6F);
		le_hand_guard2.addChild(gun46_r7);
		setRotationAngle(gun46_r7, 0.0F, 0.0F, 0.9599F);
		gun46_r7.cubeList.add(new ModelBox(gun46_r7, 144, 0, -0.5F, -1.725F, -21.0F, 1, 1, 42, -0.3F, false));
		gun46_r7.cubeList.add(new ModelBox(gun46_r7, 144, 47, -0.5F, -0.5F, -21.0F, 1, 1, 42, -0.3F, false));

		gun56_r1 = new ModelRenderer(this);
		gun56_r1.setRotationPoint(-0.3318F, -2.5366F, -15.3578F);
		le_hand_guard2.addChild(gun56_r1);
		setRotationAngle(gun56_r1, 0.7854F, 0.0F, 0.9599F);
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 0, 88, -0.475F, -10.2139F, -9.6305F, 1, 1, 1, -0.3F, false));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 89, 9, -0.475F, -9.6305F, -10.2139F, 1, 1, 1, -0.3F, false));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 89, 11, -0.475F, -5.2641F, -4.6808F, 1, 1, 1, -0.3F, false));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 20, 89, -0.475F, -4.6808F, -5.2641F, 1, 1, 1, -0.3F, false));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 26, 89, -0.475F, -6.2187F, -5.6354F, 1, 1, 1, -0.3F, false));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 32, 89, -0.475F, -5.6354F, -6.2187F, 1, 1, 1, -0.3F, false));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 89, 32, -0.475F, -0.3144F, 0.269F, 1, 1, 1, -0.3F, false));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 89, 36, -0.475F, 0.269F, -0.3144F, 1, 1, 1, -0.3F, false));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 38, 89, -0.475F, -1.269F, -0.6856F, 1, 1, 1, -0.3F, false));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 89, 58, -0.475F, -0.6856F, -1.269F, 1, 1, 1, -0.3F, false));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 89, 70, -0.475F, 4.6354F, 5.2187F, 1, 1, 1, -0.3F, false));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 89, 72, -0.475F, 5.2187F, 4.6354F, 1, 1, 1, -0.3F, false));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 89, 86, -0.475F, 3.6808F, 4.2641F, 1, 1, 1, -0.3F, false));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 87, 89, -0.475F, 4.2641F, 3.6808F, 1, 1, 1, -0.3F, false));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 0, 90, -0.475F, 8.6305F, 9.2139F, 1, 1, 1, -0.3F, false));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 90, 44, -0.475F, 9.2139F, 8.6305F, 1, 1, 1, -0.3F, false));

		gun50_r7 = new ModelRenderer(this);
		gun50_r7.setRotationPoint(-0.4239F, -2.4721F, -8.35F);
		le_hand_guard2.addChild(gun50_r7);
		setRotationAngle(gun50_r7, 0.0F, 0.0F, 0.9599F);
		gun50_r7.cubeList.add(new ModelBox(gun50_r7, 34, 47, -0.4991F, -1.0F, -25.0F, 1, 2, 5, -0.3F, false));
		gun50_r7.cubeList.add(new ModelBox(gun50_r7, 56, 64, -0.4991F, -1.0F, -15.0F, 1, 2, 2, -0.3F, false));
		gun50_r7.cubeList.add(new ModelBox(gun50_r7, 48, 72, -0.4991F, -1.0F, -8.0F, 1, 2, 2, -0.3F, false));
		gun50_r7.cubeList.add(new ModelBox(gun50_r7, 48, 33, -0.4991F, -1.0F, 6.0F, 1, 2, 11, -0.3F, false));
		gun50_r7.cubeList.add(new ModelBox(gun50_r7, 56, 72, -0.4991F, -1.0F, -1.0F, 1, 2, 2, -0.3F, false));

		gun50_r8 = new ModelRenderer(this);
		gun50_r8.setRotationPoint(0.1451F, 0.0704F, 7.3F);
		le_hand_guard2.addChild(gun50_r8);
		setRotationAngle(gun50_r8, 0.0F, 0.0F, 1.0036F);
		gun50_r8.cubeList.add(new ModelBox(gun50_r8, 23, 17, -0.5F, 0.4994F, -41.0F, 2, 1, 1, -0.201F, false));

		gun49_r9 = new ModelRenderer(this);
		gun49_r9.setRotationPoint(0.1456F, 0.0701F, 7.45F);
		le_hand_guard2.addChild(gun49_r9);
		setRotationAngle(gun49_r9, 0.0F, 0.0F, 1.0036F);
		gun49_r9.cubeList.add(new ModelBox(gun49_r9, 0, 30, -0.5F, 0.4995F, 0.25F, 2, 1, 1, -0.2F, false));

		gun49_r10 = new ModelRenderer(this);
		gun49_r10.setRotationPoint(-0.4239F, -2.4721F, 8.3F);
		le_hand_guard2.addChild(gun49_r10);
		setRotationAngle(gun49_r10, 0.0F, 0.0F, 0.9599F);
		gun49_r10.cubeList.add(new ModelBox(gun49_r10, 23, 12, -0.4991F, -2.0F, -42.1F, 1, 3, 2, -0.301F, false));
		gun49_r10.cubeList.add(new ModelBox(gun49_r10, 35, 25, -0.5F, -2.0F, -0.5F, 1, 3, 1, -0.3F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-0.713F, -0.4501F, 1.5F);
		le_hand_guard2.addChild(bone9);
		

		gun47_r4 = new ModelRenderer(this);
		gun47_r4.setRotationPoint(0.0F, 0.4F, 0.0F);
		bone9.addChild(gun47_r4);
		setRotationAngle(gun47_r4, -0.7854F, 0.0F, 0.0F);
		gun47_r4.cubeList.add(new ModelBox(gun47_r4, 90, 76, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun46_r8 = new ModelRenderer(this);
		gun46_r8.setRotationPoint(0.0F, -1.225F, 0.0F);
		bone9.addChild(gun46_r8);
		setRotationAngle(gun46_r8, -0.7854F, 0.0F, 0.0F);
		gun46_r8.cubeList.add(new ModelBox(gun46_r8, 90, 78, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun48_r8 = new ModelRenderer(this);
		gun48_r8.setRotationPoint(0.0F, 0.4F, -6.0F);
		bone9.addChild(gun48_r8);
		setRotationAngle(gun48_r8, -0.7854F, 0.0F, 0.0F);
		gun48_r8.cubeList.add(new ModelBox(gun48_r8, 90, 82, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun49_r11 = new ModelRenderer(this);
		gun49_r11.setRotationPoint(0.0F, 0.4F, -7.0F);
		bone9.addChild(gun49_r11);
		setRotationAngle(gun49_r11, -0.7854F, 0.0F, 0.0F);
		gun49_r11.cubeList.add(new ModelBox(gun49_r11, 90, 88, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun47_r5 = new ModelRenderer(this);
		gun47_r5.setRotationPoint(0.0F, -1.225F, -6.0F);
		bone9.addChild(gun47_r5);
		setRotationAngle(gun47_r5, -0.7854F, 0.0F, 0.0F);
		gun47_r5.cubeList.add(new ModelBox(gun47_r5, 90, 90, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun50_r9 = new ModelRenderer(this);
		gun50_r9.setRotationPoint(0.0F, -1.225F, -14.0F);
		bone9.addChild(gun50_r9);
		setRotationAngle(gun50_r9, -0.7854F, 0.0F, 0.0F);
		gun50_r9.cubeList.add(new ModelBox(gun50_r9, 60, 91, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun51_r14 = new ModelRenderer(this);
		gun51_r14.setRotationPoint(0.0F, 0.4F, -14.0F);
		bone9.addChild(gun51_r14);
		setRotationAngle(gun51_r14, -0.7854F, 0.0F, 0.0F);
		gun51_r14.cubeList.add(new ModelBox(gun51_r14, 64, 91, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun49_r12 = new ModelRenderer(this);
		gun49_r12.setRotationPoint(0.0F, -1.225F, -13.0F);
		bone9.addChild(gun49_r12);
		setRotationAngle(gun49_r12, -0.7854F, 0.0F, 0.0F);
		gun49_r12.cubeList.add(new ModelBox(gun49_r12, 68, 91, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun50_r10 = new ModelRenderer(this);
		gun50_r10.setRotationPoint(0.0F, 0.4F, -13.0F);
		bone9.addChild(gun50_r10);
		setRotationAngle(gun50_r10, -0.7854F, 0.0F, 0.0F);
		gun50_r10.cubeList.add(new ModelBox(gun50_r10, 78, 95, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun48_r9 = new ModelRenderer(this);
		gun48_r9.setRotationPoint(0.0F, -1.225F, -7.0F);
		bone9.addChild(gun48_r9);
		setRotationAngle(gun48_r9, -0.7854F, 0.0F, 0.0F);
		gun48_r9.cubeList.add(new ModelBox(gun48_r9, 90, 95, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun54_r11 = new ModelRenderer(this);
		gun54_r11.setRotationPoint(0.0F, -1.225F, -28.0F);
		bone9.addChild(gun54_r11);
		setRotationAngle(gun54_r11, -0.7854F, 0.0F, 0.0F);
		gun54_r11.cubeList.add(new ModelBox(gun54_r11, 96, 6, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun55_r5 = new ModelRenderer(this);
		gun55_r5.setRotationPoint(0.0F, 0.4F, -28.0F);
		bone9.addChild(gun55_r5);
		setRotationAngle(gun55_r5, -0.7854F, 0.0F, 0.0F);
		gun55_r5.cubeList.add(new ModelBox(gun55_r5, 96, 15, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun53_r11 = new ModelRenderer(this);
		gun53_r11.setRotationPoint(0.0F, -1.225F, -27.0F);
		bone9.addChild(gun53_r11);
		setRotationAngle(gun53_r11, -0.7854F, 0.0F, 0.0F);
		gun53_r11.cubeList.add(new ModelBox(gun53_r11, 96, 24, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun54_r12 = new ModelRenderer(this);
		gun54_r12.setRotationPoint(0.0F, 0.4F, -27.0F);
		bone9.addChild(gun54_r12);
		setRotationAngle(gun54_r12, -0.7854F, 0.0F, 0.0F);
		gun54_r12.cubeList.add(new ModelBox(gun54_r12, 29, 96, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun52_r13 = new ModelRenderer(this);
		gun52_r13.setRotationPoint(0.0F, -1.225F, -21.0F);
		bone9.addChild(gun52_r13);
		setRotationAngle(gun52_r13, -0.7854F, 0.0F, 0.0F);
		gun52_r13.cubeList.add(new ModelBox(gun52_r13, 96, 69, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun53_r12 = new ModelRenderer(this);
		gun53_r12.setRotationPoint(0.0F, 0.4F, -21.0F);
		bone9.addChild(gun53_r12);
		setRotationAngle(gun53_r12, -0.7854F, 0.0F, 0.0F);
		gun53_r12.cubeList.add(new ModelBox(gun53_r12, 96, 71, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun51_r15 = new ModelRenderer(this);
		gun51_r15.setRotationPoint(0.0F, -1.225F, -20.0F);
		bone9.addChild(gun51_r15);
		setRotationAngle(gun51_r15, -0.7854F, 0.0F, 0.0F);
		gun51_r15.cubeList.add(new ModelBox(gun51_r15, 96, 73, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun52_r14 = new ModelRenderer(this);
		gun52_r14.setRotationPoint(0.0F, 0.4F, -20.0F);
		bone9.addChild(gun52_r14);
		setRotationAngle(gun52_r14, -0.7854F, 0.0F, 0.0F);
		gun52_r14.cubeList.add(new ModelBox(gun52_r14, 96, 76, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun55_r6 = new ModelRenderer(this);
		gun55_r6.setRotationPoint(0.0F, -1.225F, -34.0F);
		bone9.addChild(gun55_r6);
		setRotationAngle(gun55_r6, -0.7854F, 0.0F, 0.0F);
		gun55_r6.cubeList.add(new ModelBox(gun55_r6, 96, 78, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		gun56_r2 = new ModelRenderer(this);
		gun56_r2.setRotationPoint(0.0F, 0.4F, -34.0F);
		bone9.addChild(gun56_r2);
		setRotationAngle(gun56_r2, -0.7854F, 0.0F, 0.0F);
		gun56_r2.cubeList.add(new ModelBox(gun56_r2, 96, 80, -0.497F, -0.5F, -0.5F, 1, 1, 1, -0.101F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-0.4329F, 0.8094F, -15.8F);
		le_hand_guard2.addChild(bone10);
		

		gun50_r11 = new ModelRenderer(this);
		gun50_r11.setRotationPoint(0.0F, 0.4F, -6.5F);
		bone10.addChild(gun50_r11);
		setRotationAngle(gun50_r11, 0.0F, 0.0F, 1.0036F);
		gun50_r11.cubeList.add(new ModelBox(gun50_r11, 9, 60, -1.0F, -0.5007F, -1.0F, 2, 1, 2, -0.3F, false));
		gun50_r11.cubeList.add(new ModelBox(gun50_r11, 20, 25, -1.0F, -0.5007F, 20.0F, 2, 1, 11, -0.3F, false));
		gun50_r11.cubeList.add(new ModelBox(gun50_r11, 12, 73, -1.0F, -0.5007F, 13.0F, 2, 1, 2, -0.3F, false));
		gun50_r11.cubeList.add(new ModelBox(gun50_r11, 76, 11, -1.0F, -0.5007F, 6.0F, 2, 1, 2, -0.3F, false));
		gun50_r11.cubeList.add(new ModelBox(gun50_r11, 96, 102, -1.0F, -0.5007F, -11.0F, 2, 1, 5, -0.3F, false));

		stock = new QRenderer(this);
		stock.setRotationPoint(0.0F, 23.3F, 4.5F);
		stock.cubeList.add(new ModelBox(stock, 0, 60, -3.0F, -33.95F, -1.0F, 3, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 221, 176, -2.0F, -38.5F, 0.0F, 1, 1, 28, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 48, 17, -3.0F, -36.7F, 26.0F, 3, 12, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 48, 0, -3.0F, -34.7F, 20.0F, 1, 7, 6, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 47, -1.0F, -34.7F, 20.0F, 1, 7, 6, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 82, 70, -2.0F, -34.95F, 3.0F, 1, 1, 5, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 38, 12, -3.3F, -36.25F, -1.0F, 1, 3, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 9, 25, -0.7F, -36.25F, -1.0F, 1, 3, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 59, 80, -3.299F, -36.85F, -1.75F, 1, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 77, 70, -0.701F, -36.85F, -1.75F, 1, 1, 3, 0.0F, false));

		gun71_r1 = new ModelRenderer(this);
		gun71_r1.setRotationPoint(0.017F, -34.3694F, 3.0021F);
		stock.addChild(gun71_r1);
		setRotationAngle(gun71_r1, 0.6155F, -0.5236F, 0.6155F);
		gun71_r1.cubeList.add(new ModelBox(gun71_r1, 84, 32, -0.5F, -0.5F, -2.0F, 1, 1, 3, -0.3F, false));

		gun70_r1 = new ModelRenderer(this);
		gun70_r1.setRotationPoint(-0.2001F, -35.9957F, 1.0929F);
		stock.addChild(gun70_r1);
		setRotationAngle(gun70_r1, 0.7854F, 0.0F, 0.0F);
		gun70_r1.cubeList.add(new ModelBox(gun70_r1, 0, 25, -0.5F, -0.5F, -1.5F, 1, 3, 2, 0.0F, false));
		gun70_r1.cubeList.add(new ModelBox(gun70_r1, 40, 37, -3.0998F, -0.5F, -1.5F, 1, 3, 2, 0.0F, false));

		gun70_r2 = new ModelRenderer(this);
		gun70_r2.setRotationPoint(-3.017F, -34.3694F, 3.0021F);
		stock.addChild(gun70_r2);
		setRotationAngle(gun70_r2, 0.6155F, 0.5236F, -0.6155F);
		gun70_r2.cubeList.add(new ModelBox(gun70_r2, 61, 33, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.3F, false));

		gun69_r1 = new ModelRenderer(this);
		gun69_r1.setRotationPoint(-1.5F, -34.3642F, 2.7071F);
		stock.addChild(gun69_r1);
		setRotationAngle(gun69_r1, 0.7854F, 0.0F, 0.0F);
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 0, 88, -1.5F, -0.5F, -1.5F, 3, 1, 4, 0.0F, false));

		gun73_r1 = new ModelRenderer(this);
		gun73_r1.setRotationPoint(-0.9877F, -38.3591F, 13.4F);
		stock.addChild(gun73_r1);
		setRotationAngle(gun73_r1, 0.0F, 0.0F, 2.2689F);
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 190, 180, -0.5F, -0.5F, -14.0F, 1, 1, 29, -0.4F, false));

		gun72_r1 = new ModelRenderer(this);
		gun72_r1.setRotationPoint(-2.0123F, -38.3591F, 13.4F);
		stock.addChild(gun72_r1);
		setRotationAngle(gun72_r1, 0.0F, 0.0F, -2.2689F);
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 203, 210, -0.5F, -0.5F, -14.0F, 1, 1, 29, -0.4F, false));

		gun73_r2 = new ModelRenderer(this);
		gun73_r2.setRotationPoint(1.058F, -35.6515F, 5.2325F);
		stock.addChild(gun73_r2);
		setRotationAngle(gun73_r2, 0.0F, 0.0F, 1.4399F);
		gun73_r2.cubeList.add(new ModelBox(gun73_r2, 39, 95, -0.5F, -0.4999F, -1.0F, 1, 1, 2, -0.4F, false));
		gun73_r2.cubeList.add(new ModelBox(gun73_r2, 230, 87, -0.5F, -0.5F, -0.2F, 1, 1, 23, -0.4F, false));

		gun73_r3 = new ModelRenderer(this);
		gun73_r3.setRotationPoint(-0.4016F, -36.9388F, 1.2F);
		stock.addChild(gun73_r3);
		setRotationAngle(gun73_r3, 0.0F, 0.3927F, 0.9163F);
		gun73_r3.cubeList.add(new ModelBox(gun73_r3, 35, 5, -0.5F, -0.5F, -0.1F, 1, 1, 4, 0.0F, false));

		gun72_r2 = new ModelRenderer(this);
		gun72_r2.setRotationPoint(-0.4016F, -36.9388F, 1.3F);
		stock.addChild(gun72_r2);
		setRotationAngle(gun72_r2, 0.0F, 0.0F, 0.9163F);
		gun72_r2.cubeList.add(new ModelBox(gun72_r2, 9, 104, -1.5F, -0.5F, -1.5F, 2, 1, 5, 0.001F, false));
		gun72_r2.cubeList.add(new ModelBox(gun72_r2, 106, 224, -1.425F, -0.5F, 2.4F, 3, 1, 24, -0.001F, false));

		gun72_r3 = new ModelRenderer(this);
		gun72_r3.setRotationPoint(0.4431F, -35.856F, 16.1325F);
		stock.addChild(gun72_r3);
		setRotationAngle(gun72_r3, 0.0F, 0.0F, 0.9163F);
		gun72_r3.cubeList.add(new ModelBox(gun72_r3, 232, 0, -0.5F, -0.5F, -11.5F, 1, 1, 23, 0.0F, false));

		gun72_r4 = new ModelRenderer(this);
		gun72_r4.setRotationPoint(-4.058F, -35.6515F, 5.2325F);
		stock.addChild(gun72_r4);
		setRotationAngle(gun72_r4, 0.0F, 0.0F, -1.4399F);
		gun72_r4.cubeList.add(new ModelBox(gun72_r4, 96, 0, -0.5F, -0.4999F, -1.0F, 1, 1, 2, -0.4F, false));
		gun72_r4.cubeList.add(new ModelBox(gun72_r4, 234, 133, -0.5F, -0.5F, -0.2F, 1, 1, 23, -0.4F, false));

		gun72_r5 = new ModelRenderer(this);
		gun72_r5.setRotationPoint(-2.5984F, -36.9388F, 1.2F);
		stock.addChild(gun72_r5);
		setRotationAngle(gun72_r5, 0.0F, -0.3927F, -0.9163F);
		gun72_r5.cubeList.add(new ModelBox(gun72_r5, 48, 33, -0.5F, -0.5F, -0.1F, 1, 1, 4, 0.0F, false));

		gun71_r2 = new ModelRenderer(this);
		gun71_r2.setRotationPoint(-2.5984F, -36.9388F, 1.3F);
		stock.addChild(gun71_r2);
		setRotationAngle(gun71_r2, 0.0F, 0.0F, -0.9163F);
		gun71_r2.cubeList.add(new ModelBox(gun71_r2, 48, 104, -0.5F, -0.5F, -1.5F, 2, 1, 5, 0.001F, false));
		gun71_r2.cubeList.add(new ModelBox(gun71_r2, 0, 227, -1.575F, -0.5F, 2.4F, 3, 1, 24, -0.001F, false));

		gun71_r3 = new ModelRenderer(this);
		gun71_r3.setRotationPoint(-3.4431F, -35.856F, 16.1325F);
		stock.addChild(gun71_r3);
		setRotationAngle(gun71_r3, 0.0F, 0.0F, -0.9163F);
		gun71_r3.cubeList.add(new ModelBox(gun71_r3, 232, 44, -0.5F, -0.5F, -11.5F, 1, 1, 23, 0.0F, false));

		gun72_r6 = new ModelRenderer(this);
		gun72_r6.setRotationPoint(-0.5009F, -34.5918F, 4.2665F);
		stock.addChild(gun72_r6);
		setRotationAngle(gun72_r6, 0.1561F, 0.523F, -0.2987F);
		gun72_r6.cubeList.add(new ModelBox(gun72_r6, 60, 95, 0.0F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		gun71_r4 = new ModelRenderer(this);
		gun71_r4.setRotationPoint(-2.4991F, -34.5918F, 4.2665F);
		stock.addChild(gun71_r4);
		setRotationAngle(gun71_r4, 0.1561F, -0.523F, 0.2987F);
		gun71_r4.cubeList.add(new ModelBox(gun71_r4, 69, 95, -1.0F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		gun71_r5 = new ModelRenderer(this);
		gun71_r5.setRotationPoint(-0.1569F, -34.717F, 16.1325F);
		stock.addChild(gun71_r5);
		setRotationAngle(gun71_r5, 0.0F, 0.0F, -0.3491F);
		gun71_r5.cubeList.add(new ModelBox(gun71_r5, 176, 223, -1.0F, -0.5F, -11.5F, 2, 1, 23, 0.0F, false));

		gun70_r3 = new ModelRenderer(this);
		gun70_r3.setRotationPoint(-2.8431F, -34.717F, 16.1325F);
		stock.addChild(gun70_r3);
		setRotationAngle(gun70_r3, 0.0F, 0.0F, 0.3491F);
		gun70_r3.cubeList.add(new ModelBox(gun70_r3, 54, 228, -1.0F, -0.5F, -11.5F, 2, 1, 23, 0.0F, false));

		gun70_r4 = new ModelRenderer(this);
		gun70_r4.setRotationPoint(0.5739F, -35.1855F, 15.6325F);
		stock.addChild(gun70_r4);
		setRotationAngle(gun70_r4, 0.0F, 0.0F, 0.2182F);
		gun70_r4.cubeList.add(new ModelBox(gun70_r4, 81, 229, -0.5F, -0.5F, -11.0F, 1, 1, 23, 0.0F, false));

		gun69_r2 = new ModelRenderer(this);
		gun69_r2.setRotationPoint(-3.5739F, -35.1855F, 15.6325F);
		stock.addChild(gun69_r2);
		setRotationAngle(gun69_r2, 0.0F, 0.0F, -0.2182F);
		gun69_r2.cubeList.add(new ModelBox(gun69_r2, 234, 205, -0.5F, -0.5F, -11.0F, 1, 1, 23, 0.0F, false));

		gun69_r3 = new ModelRenderer(this);
		gun69_r3.setRotationPoint(-3.017F, -33.2501F, 0.3F);
		stock.addChild(gun69_r3);
		setRotationAngle(gun69_r3, 0.0F, 0.0F, -0.7854F);
		gun69_r3.cubeList.add(new ModelBox(gun69_r3, 65, 17, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.3F, false));

		gun74_r1 = new ModelRenderer(this);
		gun74_r1.setRotationPoint(-1.036F, -34.264F, 11.5518F);
		stock.addChild(gun74_r1);
		setRotationAngle(gun74_r1, -0.3655F, 0.147F, 0.3655F);
		gun74_r1.cubeList.add(new ModelBox(gun74_r1, 71, 75, -0.5F, -1.5F, -3.25F, 1, 2, 9, 0.0F, false));

		gun73_r4 = new ModelRenderer(this);
		gun73_r4.setRotationPoint(-1.964F, -34.264F, 11.5518F);
		stock.addChild(gun73_r4);
		setRotationAngle(gun73_r4, -0.3655F, -0.147F, -0.3655F);
		gun73_r4.cubeList.add(new ModelBox(gun73_r4, 0, 77, -0.5F, -1.5F, -3.25F, 1, 2, 9, 0.0F, false));

		gun73_r5 = new ModelRenderer(this);
		gun73_r5.setRotationPoint(-1.25F, -32.7307F, 11.8045F);
		stock.addChild(gun73_r5);
		setRotationAngle(gun73_r5, -0.3927F, 0.0F, 0.0F);
		gun73_r5.cubeList.add(new ModelBox(gun73_r5, 73, 32, -0.5F, -1.5F, -4.5F, 1, 2, 9, -0.001F, false));
		gun73_r5.cubeList.add(new ModelBox(gun73_r5, 20, 78, -1.0F, -1.5F, -4.5F, 1, 2, 9, 0.0F, false));

		gun72_r7 = new ModelRenderer(this);
		gun72_r7.setRotationPoint(-1.25F, -28.4284F, 16.6481F);
		stock.addChild(gun72_r7);
		setRotationAngle(gun72_r7, 0.3927F, 0.0F, 0.0F);
		gun72_r7.cubeList.add(new ModelBox(gun72_r7, 0, 0, -0.49F, -3.5F, -0.5F, 1, 7, 2, -0.001F, false));
		gun72_r7.cubeList.add(new ModelBox(gun72_r7, 19, 47, -0.99F, -3.5F, -0.5F, 1, 7, 2, 0.0F, false));

		gun73_r6 = new ModelRenderer(this);
		gun73_r6.setRotationPoint(-1.25F, -25.0658F, 22.5501F);
		stock.addChild(gun73_r6);
		setRotationAngle(gun73_r6, -0.0873F, 0.0F, 0.0F);
		gun73_r6.cubeList.add(new ModelBox(gun73_r6, 65, 64, -0.5F, -0.5F, -5.0F, 1, 1, 10, -0.001F, false));
		gun73_r6.cubeList.add(new ModelBox(gun73_r6, 0, 66, -1.0F, -0.5F, -5.0F, 1, 1, 10, 0.0F, false));

		gun73_r7 = new ModelRenderer(this);
		gun73_r7.setRotationPoint(-0.8446F, -30.1152F, 17.7925F);
		stock.addChild(gun73_r7);
		setRotationAngle(gun73_r7, 0.4215F, 0.3614F, 0.1572F);
		gun73_r7.cubeList.add(new ModelBox(gun73_r7, 35, 64, -0.5F, -3.0F, -1.0F, 1, 6, 2, 0.0F, false));

		gun72_r8 = new ModelRenderer(this);
		gun72_r8.setRotationPoint(-2.1554F, -30.1152F, 17.7925F);
		stock.addChild(gun72_r8);
		setRotationAngle(gun72_r8, 0.4215F, -0.3614F, -0.1572F);
		gun72_r8.cubeList.add(new ModelBox(gun72_r8, 65, 64, -0.5F, -3.0F, -1.0F, 1, 6, 2, 0.0F, false));

		gun76_r1 = new ModelRenderer(this);
		gun76_r1.setRotationPoint(-0.6409F, -26.9776F, 23.5761F);
		stock.addChild(gun76_r1);
		setRotationAngle(gun76_r1, -0.082F, 0.0298F, 0.3478F);
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 96, 0, -0.5F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));

		gun75_r1 = new ModelRenderer(this);
		gun75_r1.setRotationPoint(-2.3591F, -26.9776F, 23.5761F);
		stock.addChild(gun75_r1);
		setRotationAngle(gun75_r1, -0.082F, -0.0298F, -0.3478F);
		gun75_r1.cubeList.add(new ModelBox(gun75_r1, 96, 9, -0.5F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));

		gun73_r8 = new ModelRenderer(this);
		gun73_r8.setRotationPoint(-1.5F, -26.7286F, 23.5462F);
		stock.addChild(gun73_r8);
		setRotationAngle(gun73_r8, -0.0873F, 0.0F, 0.0F);
		gun73_r8.cubeList.add(new ModelBox(gun73_r8, 48, 95, -1.0F, -0.5F, -5.0F, 2, 1, 8, 0.0F, false));

		gun74_r2 = new ModelRenderer(this);
		gun74_r2.setRotationPoint(-1.0F, -34.6651F, 16.3181F);
		stock.addChild(gun74_r2);
		setRotationAngle(gun74_r2, -0.3927F, 0.0F, 0.0F);
		gun74_r2.cubeList.add(new ModelBox(gun74_r2, 67, 5, 0.0F, 0.0F, -1.5F, 1, 1, 3, 0.0F, false));
		gun74_r2.cubeList.add(new ModelBox(gun74_r2, 48, 80, -2.0F, 0.0F, -1.5F, 1, 1, 3, 0.0F, false));

		gun73_r9 = new ModelRenderer(this);
		gun73_r9.setRotationPoint(-1.0F, -31.6228F, 20.1257F);
		stock.addChild(gun73_r9);
		setRotationAngle(gun73_r9, 0.3927F, 0.0F, 0.0F);
		gun73_r9.cubeList.add(new ModelBox(gun73_r9, 20, 25, -0.001F, -3.5F, -2.0F, 1, 7, 4, 0.0F, false));
		gun73_r9.cubeList.add(new ModelBox(gun73_r9, 35, 25, -1.999F, -3.5F, -2.0F, 1, 7, 4, 0.0F, false));

		gun75_r2 = new ModelRenderer(this);
		gun75_r2.setRotationPoint(-0.5F, -27.7734F, 23.6457F);
		stock.addChild(gun75_r2);
		setRotationAngle(gun75_r2, -0.0873F, 0.0F, 0.0F);
		gun75_r2.cubeList.add(new ModelBox(gun75_r2, 68, 95, -0.502F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));
		gun75_r2.cubeList.add(new ModelBox(gun75_r2, 96, 18, -2.498F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));

		gun73_r10 = new ModelRenderer(this);
		gun73_r10.setRotationPoint(-0.5F, -32.7F, 26.5F);
		stock.addChild(gun73_r10);
		setRotationAngle(gun73_r10, 0.0F, 0.0F, 0.0873F);
		gun73_r10.cubeList.add(new ModelBox(gun73_r10, 25, 47, -0.25F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		gun72_r9 = new ModelRenderer(this);
		gun72_r9.setRotationPoint(-2.5F, -32.7F, 26.5F);
		stock.addChild(gun72_r9);
		setRotationAngle(gun72_r9, 0.0F, 0.0F, -0.0873F);
		gun72_r9.cubeList.add(new ModelBox(gun72_r9, 34, 47, -0.75F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		gun72_r10 = new ModelRenderer(this);
		gun72_r10.setRotationPoint(-0.6941F, -35.9349F, 27.5F);
		stock.addChild(gun72_r10);
		setRotationAngle(gun72_r10, 0.0F, 0.0F, -0.5672F);
		gun72_r10.cubeList.add(new ModelBox(gun72_r10, 77, 64, -1.0F, -2.0F, -0.5F, 2, 3, 1, 0.002F, false));

		gun71_r6 = new ModelRenderer(this);
		gun71_r6.setRotationPoint(-2.3059F, -35.9349F, 27.5F);
		stock.addChild(gun71_r6);
		setRotationAngle(gun71_r6, 0.0F, 0.0F, 0.5672F);
		gun71_r6.cubeList.add(new ModelBox(gun71_r6, 78, 0, -1.0F, -2.0F, -0.5F, 2, 3, 1, 0.001F, false));

		gun70_r5 = new ModelRenderer(this);
		gun70_r5.setRotationPoint(0.017F, -33.2501F, 0.3F);
		stock.addChild(gun70_r5);
		setRotationAngle(gun70_r5, 0.0F, 0.0F, 0.7854F);
		gun70_r5.cubeList.add(new ModelBox(gun70_r5, 61, 38, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.3F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-2.975F, -34.6687F, 2.4017F);
		stock.addChild(bone6);
		setRotationAngle(bone6, 0.0662F, -0.2979F, -0.2284F);
		bone6.cubeList.add(new ModelBox(bone6, 70, 80, -0.2412F, -1.0965F, -0.498F, 1, 1, 3, 0.0F, false));

		gun70_r6 = new ModelRenderer(this);
		gun70_r6.setRotationPoint(0.0F, -0.4055F, -0.0326F);
		bone6.addChild(gun70_r6);
		setRotationAngle(gun70_r6, -0.3054F, 0.0F, 0.0F);
		gun70_r6.cubeList.add(new ModelBox(gun70_r6, 48, 38, -0.2412F, -1.4212F, -1.7905F, 1, 1, 4, 0.001F, false));

		gun69_r4 = new ModelRenderer(this);
		gun69_r4.setRotationPoint(0.0F, 0.9126F, 0.9215F);
		bone6.addChild(gun69_r4);
		setRotationAngle(gun69_r4, 0.3491F, 0.0F, 0.0F);
		gun69_r4.cubeList.add(new ModelBox(gun69_r4, 0, 81, -0.2412F, -1.4077F, -1.1696F, 1, 1, 3, -0.001F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-0.025F, -34.6687F, 2.4017F);
		stock.addChild(bone8);
		setRotationAngle(bone8, 0.0662F, 0.2979F, 0.2284F);
		bone8.cubeList.add(new ModelBox(bone8, 0, 70, -0.7588F, -1.0965F, -0.498F, 1, 1, 3, 0.0F, false));

		gun71_r7 = new ModelRenderer(this);
		gun71_r7.setRotationPoint(0.0F, -0.4055F, -0.0326F);
		bone8.addChild(gun71_r7);
		setRotationAngle(gun71_r7, -0.3054F, 0.0F, 0.0F);
		gun71_r7.cubeList.add(new ModelBox(gun71_r7, 35, 0, -0.7588F, -1.4212F, -1.7905F, 1, 1, 4, 0.001F, false));

		gun70_r7 = new ModelRenderer(this);
		gun70_r7.setRotationPoint(0.0F, 0.9126F, 0.9215F);
		bone8.addChild(gun70_r7);
		setRotationAngle(gun70_r7, 0.3491F, 0.0F, 0.0F);
		gun70_r7.cubeList.add(new ModelBox(gun70_r7, 0, 77, -0.7588F, -1.4077F, -1.1696F, 1, 1, 3, -0.001F, false));

		mag = new ModelRenderer(this);
		mag.setRotationPoint(-1.5F, -2.1972F, -16.9893F);
		mag.cubeList.add(new ModelBox(mag, 22, 66, -1.75F, -5.8028F, -2.4607F, 3, 5, 7, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 23, 0, -1.0F, -5.8028F, -4.3607F, 2, 5, 2, 0.001F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 25, 0.75F, -5.8028F, -2.4607F, 1, 5, 7, -0.001F, false));

		gun50_r12 = new ModelRenderer(this);
		gun50_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(gun50_r12);
		setRotationAngle(gun50_r12, -0.1745F, 0.0F, 0.0F);
		gun50_r12.cubeList.add(new ModelBox(gun50_r12, 0, 94, -1.999F, -1.75F, -2.675F, 4, 1, 7, 0.0F, false));

		gun52_r15 = new ModelRenderer(this);
		gun52_r15.setRotationPoint(0.25F, 1.0986F, -0.0654F);
		mag.addChild(gun52_r15);
		setRotationAngle(gun52_r15, -0.0436F, 0.0F, 0.0F);
		gun52_r15.cubeList.add(new ModelBox(gun52_r15, 71, 64, -2.0F, -2.0F, -0.5F, 1, 7, 1, 0.1F, false));
		gun52_r15.cubeList.add(new ModelBox(gun52_r15, 73, 33, 0.5F, -2.0F, -0.5F, 1, 7, 1, 0.1F, false));

		gun50_r13 = new ModelRenderer(this);
		gun50_r13.setRotationPoint(0.0F, 1.4986F, -0.0654F);
		mag.addChild(gun50_r13);
		setRotationAngle(gun50_r13, -0.0436F, 0.0F, 0.0F);
		gun50_r13.cubeList.add(new ModelBox(gun50_r13, 34, 54, -2.0F, -3.0F, -2.5F, 4, 2, 2, 0.0F, false));
		gun50_r13.cubeList.add(new ModelBox(gun50_r13, 0, 37, -2.0F, -2.5F, 0.5F, 4, 2, 4, 0.0F, false));

		gun52_r16 = new ModelRenderer(this);
		gun52_r16.setRotationPoint(-0.85F, 0.1981F, -0.0622F);
		mag.addChild(gun52_r16);
		setRotationAngle(gun52_r16, -0.1134F, 0.0F, 0.0F);
		gun52_r16.cubeList.add(new ModelBox(gun52_r16, 12, 66, -0.5F, 4.5991F, -4.3F, 1, 2, 1, 0.001F, false));
		gun52_r16.cubeList.add(new ModelBox(gun52_r16, 15, 94, -0.15F, 6.5991F, -4.3F, 2, 2, 1, 0.0F, false));
		gun52_r16.cubeList.add(new ModelBox(gun52_r16, 24, 94, 0.2F, 4.5991F, -4.3F, 2, 2, 1, 0.0F, false));

		gun51_r16 = new ModelRenderer(this);
		gun51_r16.setRotationPoint(-0.85F, 0.1981F, -0.0622F);
		mag.addChild(gun51_r16);
		setRotationAngle(gun51_r16, -0.0436F, 0.0F, 0.0F);
		gun51_r16.cubeList.add(new ModelBox(gun51_r16, 24, 66, -0.5F, -2.2009F, -4.5F, 1, 2, 1, 0.001F, false));
		gun51_r16.cubeList.add(new ModelBox(gun51_r16, 35, 94, 0.2F, -2.2009F, -4.5F, 2, 2, 1, 0.0F, false));

		gun49_r13 = new ModelRenderer(this);
		gun49_r13.setRotationPoint(0.5F, 1.9981F, -0.0622F);
		mag.addChild(gun49_r13);
		setRotationAngle(gun49_r13, -0.0436F, 0.0F, 0.0F);
		gun49_r13.cubeList.add(new ModelBox(gun49_r13, 11, 77, -1.5F, -2.25F, -4.5F, 2, 3, 1, 0.0F, false));

		gun47_r6 = new ModelRenderer(this);
		gun47_r6.setRotationPoint(0.5F, 5.2917F, -0.3109F);
		mag.addChild(gun47_r6);
		setRotationAngle(gun47_r6, -0.0873F, 0.0F, 0.0F);
		gun47_r6.cubeList.add(new ModelBox(gun47_r6, 48, 95, -1.5F, -2.5F, -4.5F, 2, 2, 1, 0.0F, false));

		gun49_r14 = new ModelRenderer(this);
		gun49_r14.setRotationPoint(0.0F, 1.9981F, -0.0872F);
		mag.addChild(gun49_r14);
		setRotationAngle(gun49_r14, -0.0436F, 0.0F, 0.0F);
		gun49_r14.cubeList.add(new ModelBox(gun49_r14, 78, 95, -1.999F, -2.0F, 0.5F, 4, 3, 4, 0.003F, false));
		gun49_r14.cubeList.add(new ModelBox(gun49_r14, 104, 62, -1.999F, -2.0F, -2.5F, 4, 3, 2, 0.003F, false));

		gun56_r3 = new ModelRenderer(this);
		gun56_r3.setRotationPoint(-0.5F, 3.7981F, -1.0872F);
		mag.addChild(gun56_r3);
		setRotationAngle(gun56_r3, -0.1154F, 0.2964F, -0.0133F);
		gun56_r3.cubeList.add(new ModelBox(gun56_r3, 14, 25, 1.65F, -1.0F, -2.8F, 1, 2, 1, 0.003F, false));

		gun55_r7 = new ModelRenderer(this);
		gun55_r7.setRotationPoint(0.5F, 3.7981F, -1.0872F);
		mag.addChild(gun55_r7);
		setRotationAngle(gun55_r7, -0.1154F, -0.2964F, 0.0133F);
		gun55_r7.cubeList.add(new ModelBox(gun55_r7, 13, 47, -2.65F, -1.0F, -2.8F, 1, 2, 1, 0.003F, false));

		gun54_r13 = new ModelRenderer(this);
		gun54_r13.setRotationPoint(0.0F, 3.7981F, -0.1872F);
		mag.addChild(gun54_r13);
		setRotationAngle(gun54_r13, -0.1154F, -0.2964F, 0.0133F);
		gun54_r13.cubeList.add(new ModelBox(gun54_r13, 65, 17, -2.65F, -1.0F, -2.8F, 1, 2, 1, 0.003F, false));
		gun54_r13.cubeList.add(new ModelBox(gun54_r13, 56, 48, -2.65F, 1.0F, -3.8F, 1, 2, 2, 0.003F, false));

		gun53_r13 = new ModelRenderer(this);
		gun53_r13.setRotationPoint(0.0F, 3.7981F, -0.1872F);
		mag.addChild(gun53_r13);
		setRotationAngle(gun53_r13, -0.1154F, 0.2964F, -0.0133F);
		gun53_r13.cubeList.add(new ModelBox(gun53_r13, 65, 22, 1.65F, -1.0F, -2.8F, 1, 2, 1, 0.003F, false));
		gun53_r13.cubeList.add(new ModelBox(gun53_r13, 48, 56, 1.65F, 1.0F, -3.8F, 1, 2, 2, 0.003F, false));

		gun50_r14 = new ModelRenderer(this);
		gun50_r14.setRotationPoint(0.0F, 1.9981F, -0.0872F);
		mag.addChild(gun50_r14);
		setRotationAngle(gun50_r14, -0.0456F, -0.2964F, 0.0133F);
		gun50_r14.cubeList.add(new ModelBox(gun50_r14, 56, 56, -2.65F, -4.0F, -3.8F, 1, 2, 2, 0.003F, false));
		gun50_r14.cubeList.add(new ModelBox(gun50_r14, 35, 0, -2.65F, -2.0F, -2.8F, 1, 3, 1, 0.003F, false));
		gun50_r14.cubeList.add(new ModelBox(gun50_r14, 20, 25, -2.45F, -2.0F, -3.8F, 1, 3, 1, 0.003F, false));

		gun51_r17 = new ModelRenderer(this);
		gun51_r17.setRotationPoint(0.0F, 1.9981F, -0.0872F);
		mag.addChild(gun51_r17);
		setRotationAngle(gun51_r17, -0.0456F, 0.2964F, -0.0133F);
		gun51_r17.cubeList.add(new ModelBox(gun51_r17, 26, 25, 1.45F, -2.0F, -3.8F, 1, 3, 1, 0.003F, false));
		gun51_r17.cubeList.add(new ModelBox(gun51_r17, 35, 5, 1.65F, -2.0F, -2.8F, 1, 3, 1, 0.003F, false));
		gun51_r17.cubeList.add(new ModelBox(gun51_r17, 48, 64, 1.65F, -4.0F, -3.8F, 1, 2, 2, 0.003F, false));

		gun50_r15 = new ModelRenderer(this);
		gun50_r15.setRotationPoint(0.0F, 7.6149F, -0.3279F);
		mag.addChild(gun50_r15);
		setRotationAngle(gun50_r15, -0.1309F, 0.0F, 0.0F);
		gun50_r15.cubeList.add(new ModelBox(gun50_r15, 65, 75, -2.0F, 1.9923F, -4.9F, 4, 1, 2, 0.0F, false));
		gun50_r15.cubeList.add(new ModelBox(gun50_r15, 65, 48, -1.5F, 0.9993F, -5.0F, 3, 2, 2, 0.0F, false));
		gun50_r15.cubeList.add(new ModelBox(gun50_r15, 78, 0, -2.0499F, 1.0F, -2.9997F, 1, 2, 7, 0.0F, false));
		gun50_r15.cubeList.add(new ModelBox(gun50_r15, 72, 5, -2.05F, 1.0F, 3.5073F, 1, 2, 1, 0.0F, false));
		gun50_r15.cubeList.add(new ModelBox(gun50_r15, 23, 7, -1.9501F, 1.0F, 3.5F, 4, 2, 1, 0.001F, false));
		gun50_r15.cubeList.add(new ModelBox(gun50_r15, 23, 12, -1.95F, 0.9993F, -3.0F, 4, 2, 7, 0.0F, false));

		gun50_r16 = new ModelRenderer(this);
		gun50_r16.setRotationPoint(0.0F, 5.2917F, -0.3359F);
		mag.addChild(gun50_r16);
		setRotationAngle(gun50_r16, -0.0873F, 0.0F, 0.0F);
		gun50_r16.cubeList.add(new ModelBox(gun50_r16, 12, 66, -2.0F, -2.5F, 0.5F, 4, 3, 4, 0.0F, false));
		gun50_r16.cubeList.add(new ModelBox(gun50_r16, 33, 59, -2.0F, -2.5F, -2.5F, 4, 3, 2, 0.0F, false));
		gun50_r16.cubeList.add(new ModelBox(gun50_r16, 0, 13, -2.0F, 0.5F, -2.5F, 4, 1, 6, 0.0F, false));
		gun50_r16.cubeList.add(new ModelBox(gun50_r16, 65, 52, -2.0F, 0.5F, 3.5F, 4, 3, 1, 0.0F, false));

		gun51_r18 = new ModelRenderer(this);
		gun51_r18.setRotationPoint(-0.1F, 5.9917F, -0.3359F);
		mag.addChild(gun51_r18);
		setRotationAngle(gun51_r18, -0.0864F, -0.0121F, -0.1391F);
		gun51_r18.cubeList.add(new ModelBox(gun51_r18, 32, 38, -2.0F, 0.5F, -2.5F, 1, 2, 6, 0.0F, false));

		gun52_r17 = new ModelRenderer(this);
		gun52_r17.setRotationPoint(-0.3F, 5.8917F, -1.7359F);
		mag.addChild(gun52_r17);
		setRotationAngle(gun52_r17, -0.0907F, -0.3077F, -0.1126F);
		gun52_r17.cubeList.add(new ModelBox(gun52_r17, 12, 37, -2.03F, 0.5F, -2.5F, 1, 2, 2, 0.0F, false));

		gun51_r19 = new ModelRenderer(this);
		gun51_r19.setRotationPoint(0.3F, 5.8917F, -1.7359F);
		mag.addChild(gun51_r19);
		setRotationAngle(gun51_r19, -0.0907F, 0.3077F, 0.1126F);
		gun51_r19.cubeList.add(new ModelBox(gun51_r19, 56, 0, 1.03F, 0.5F, -2.5F, 1, 2, 2, 0.0F, false));

		gun50_r17 = new ModelRenderer(this);
		gun50_r17.setRotationPoint(0.1F, 5.9917F, -0.3359F);
		mag.addChild(gun50_r17);
		setRotationAngle(gun50_r17, -0.0864F, 0.0121F, 0.1391F);
		gun50_r17.cubeList.add(new ModelBox(gun50_r17, 48, 48, 1.0F, 0.5F, -2.5F, 1, 2, 6, 0.0F, false));

		gun49_r15 = new ModelRenderer(this);
		gun49_r15.setRotationPoint(1.0F, -4.8028F, 0.5393F);
		mag.addChild(gun49_r15);
		setRotationAngle(gun49_r15, 0.0F, -0.2967F, 0.0F);
		gun49_r15.cubeList.add(new ModelBox(gun49_r15, 0, 13, -3.5F, -1.0F, -4.0F, 1, 4, 2, -0.001F, false));

		gun48_r10 = new ModelRenderer(this);
		gun48_r10.setRotationPoint(-1.0F, -4.8028F, 0.5393F);
		mag.addChild(gun48_r10);
		setRotationAngle(gun48_r10, 0.0F, 0.2967F, 0.0F);
		gun48_r10.cubeList.add(new ModelBox(gun48_r10, 14, 13, 2.5F, -1.0F, -4.0F, 1, 4, 2, -0.002F, false));

		action = new ModelRenderer(this);
		action.setRotationPoint(-2.3F, -13.2F, -20.5F);
		setRotationAngle(action, 0.0F, 0.0F, 0.2269F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, -1.0F, 0.0F);
		action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -1.117F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 80, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.0F, -1.0F, 0.0F);
		action.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.1222F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 67, 0, 0.0F, 0.0F, 0.0F, 1, 2, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
//		handguard.render(f5);
		stock.render(f5);
//		mag.render(f5);
//		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
