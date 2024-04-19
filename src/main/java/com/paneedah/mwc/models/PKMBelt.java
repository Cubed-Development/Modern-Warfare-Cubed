package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMBelt extends ModelWithAttachments {
	private final ModelRenderer belt;
	private final ModelRenderer bullet8;
	private final ModelRenderer cube_r38_r7_r2_r1;
	private final ModelRenderer cube_r26_r1_r1;
	private final ModelRenderer cube_r27_r1_r1;
	private final ModelRenderer cube_r28_r1_r1;
	private final ModelRenderer cube_r29_r1_r1;
	private final ModelRenderer cube_r30_r1_r1;
	private final ModelRenderer bullet9;
	private final ModelRenderer cube_r38_r9_r1_r1;
	private final ModelRenderer cube_r31_r1_r1;
	private final ModelRenderer cube_r35_r1_r1;
	private final ModelRenderer cube_r34_r1_r1;
	private final ModelRenderer cube_r33_r1_r1;
	private final ModelRenderer cube_r32_r1_r1;
	private final ModelRenderer bullet10;
	private final ModelRenderer cube_r38_r11_r1_r1;
	private final ModelRenderer cube_r21_r2_r1;
	private final ModelRenderer cube_r22_r2_r1;
	private final ModelRenderer cube_r23_r2_r1;
	private final ModelRenderer cube_r24_r2_r1;
	private final ModelRenderer cube_r25_r2_r1;
	private final ModelRenderer bullet11;
	private final ModelRenderer cube_r26_r2_r1;
	private final ModelRenderer cube_r27_r2_r1;
	private final ModelRenderer cube_r28_r2_r1;
	private final ModelRenderer cube_r29_r2_r1;
	private final ModelRenderer cube_r30_r2_r1;
	private final ModelRenderer cube_r38_r8_r1_r1;
	private final ModelRenderer bullet12;
	private final ModelRenderer cube_r38_r10_r3_r1;
	private final ModelRenderer cube_r26_r3_r1;
	private final ModelRenderer cube_r27_r3_r1;
	private final ModelRenderer cube_r28_r3_r1;
	private final ModelRenderer cube_r29_r3_r1;
	private final ModelRenderer cube_r30_r3_r1;
	private final ModelRenderer bullet13;
	private final ModelRenderer cube_r38_r10_r2_r1;
	private final ModelRenderer cube_r26_r3_r1_r1;
	private final ModelRenderer cube_r27_r3_r1_r1;
	private final ModelRenderer cube_r28_r3_r1_r1;
	private final ModelRenderer cube_r29_r3_r1_r1;
	private final ModelRenderer cube_r30_r3_r1_r1;
	private final ModelRenderer bullet14;
	private final ModelRenderer cube_r38_r10_r1_r1;
	private final ModelRenderer cube_r30_r5_r1;
	private final ModelRenderer cube_r29_r5_r1;
	private final ModelRenderer cube_r28_r5_r1;
	private final ModelRenderer cube_r27_r5_r1;
	private final ModelRenderer cube_r26_r5_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r38_r10_r9_r1;
	private final ModelRenderer cube_r38_r10_r5_r1;
	private final ModelRenderer cube_r38_r10_r4_r1;

	public PKMBelt() {
		textureWidth = 400;
		textureHeight = 400;

		belt = new ModelRenderer(this);
		belt.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bullet8 = new ModelRenderer(this);
		bullet8.setRotationPoint(-26.1774F, 32.5845F, 9.589F);
		belt.addChild(bullet8);
		

		cube_r38_r7_r2_r1 = new ModelRenderer(this);
		cube_r38_r7_r2_r1.setRotationPoint(80.332F, -29.0462F, -9.589F);
		bullet8.addChild(cube_r38_r7_r2_r1);
		setRotationAngle(cube_r38_r7_r2_r1, 0.0F, 0.0F, -1.2392F);
		cube_r38_r7_r2_r1.cubeList.add(new ModelBox(cube_r38_r7_r2_r1, 90, 162, 16.9176F, -75.7952F, -32.3F, 2, 2, 5, -0.29F, false));

		cube_r26_r1_r1 = new ModelRenderer(this);
		cube_r26_r1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bullet8.addChild(cube_r26_r1_r1);
		setRotationAngle(cube_r26_r1_r1, 0.0F, 0.3927F, 0.3491F);
		cube_r26_r1_r1.cubeList.add(new ModelBox(cube_r26_r1_r1, 87, 29, 7.1384F, -71.8794F, -43.2544F, 1, 1, 1, -0.15F, false));

		cube_r27_r1_r1 = new ModelRenderer(this);
		cube_r27_r1_r1.setRotationPoint(-15.7946F, -5.9415F, -18.2065F);
		bullet8.addChild(cube_r27_r1_r1);
		setRotationAngle(cube_r27_r1_r1, -0.3927F, 0.0F, 0.3491F);
		cube_r27_r1_r1.cubeList.add(new ModelBox(cube_r27_r1_r1, 87, 31, 6.8399F, -56.7746F, -50.032F, 1, 1, 1, -0.15F, false));

		cube_r28_r1_r1 = new ModelRenderer(this);
		cube_r28_r1_r1.setRotationPoint(-4.3501F, -21.3698F, -13.0395F);
		bullet8.addChild(cube_r28_r1_r1);
		setRotationAngle(cube_r28_r1_r1, 0.0F, -0.3927F, 0.3491F);
		cube_r28_r1_r1.cubeList.add(new ModelBox(cube_r28_r1_r1, 72, 87, -10.2858F, -53.2866F, -28.2719F, 1, 1, 1, -0.15F, false));

		cube_r29_r1_r1 = new ModelRenderer(this);
		cube_r29_r1_r1.setRotationPoint(5.5752F, -10.2917F, 5.167F);
		bullet8.addChild(cube_r29_r1_r1);
		setRotationAngle(cube_r29_r1_r1, 0.3927F, 0.0F, 0.3491F);
		cube_r29_r1_r1.cubeList.add(new ModelBox(cube_r29_r1_r1, 79, 87, -11.7529F, -74.2238F, -21.4944F, 1, 1, 1, -0.15F, false));

		cube_r30_r1_r1 = new ModelRenderer(this);
		cube_r30_r1_r1.setRotationPoint(-6.233F, -10.9425F, -9.589F);
		bullet8.addChild(cube_r30_r1_r1);
		setRotationAngle(cube_r30_r1_r1, 0.0F, 0.0F, 0.3491F);
		cube_r30_r1_r1.cubeList.add(new ModelBox(cube_r30_r1_r1, 16, 140, -0.4343F, -63.729F, -36.5F, 1, 1, 4, -0.15F, false));
		cube_r30_r1_r1.cubeList.add(new ModelBox(cube_r30_r1_r1, 124, 48, -0.9343F, -64.229F, -33.0F, 2, 2, 6, -0.31F, false));

		bullet9 = new ModelRenderer(this);
		bullet9.setRotationPoint(6.5116F, 1.8298F, 9.6284F);
		belt.addChild(bullet9);
		

		cube_r38_r9_r1_r1 = new ModelRenderer(this);
		cube_r38_r9_r1_r1.setRotationPoint(-6.3998F, -1.4156F, -9.6284F);
		bullet9.addChild(cube_r38_r9_r1_r1);
		setRotationAngle(cube_r38_r9_r1_r1, 0.0F, 0.0F, -0.096F);
		cube_r38_r9_r1_r1.cubeList.add(new ModelBox(cube_r38_r9_r1_r1, 90, 162, -4.6629F, -41.3454F, -32.3F, 2, 2, 5, -0.29F, false));

		cube_r31_r1_r1 = new ModelRenderer(this);
		cube_r31_r1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bullet9.addChild(cube_r31_r1_r1);
		setRotationAngle(cube_r31_r1_r1, 0.0F, 0.3927F, -0.0873F);
		cube_r31_r1_r1.cubeList.add(new ModelBox(cube_r31_r1_r1, 72, 85, 6.4819F, -42.7244F, -43.5691F, 1, 1, 1, -0.15F, false));

		cube_r35_r1_r1 = new ModelRenderer(this);
		cube_r35_r1_r1.setRotationPoint(-6.2153F, -0.4196F, -9.6284F);
		bullet9.addChild(cube_r35_r1_r1);
		setRotationAngle(cube_r35_r1_r1, 0.0F, 0.0F, -0.0873F);
		cube_r35_r1_r1.cubeList.add(new ModelBox(cube_r35_r1_r1, 122, 39, -5.1063F, -42.2645F, -33.0F, 2, 2, 6, -0.31F, false));
		cube_r35_r1_r1.cubeList.add(new ModelBox(cube_r35_r1_r1, 0, 140, -4.6063F, -41.7645F, -36.5F, 1, 1, 4, -0.15F, false));

		cube_r34_r1_r1 = new ModelRenderer(this);
		cube_r34_r1_r1.setRotationPoint(-4.5808F, 2.7046F, -1.7375F);
		bullet9.addChild(cube_r34_r1_r1);
		setRotationAngle(cube_r34_r1_r1, 0.3927F, 0.0F, -0.0873F);
		cube_r34_r1_r1.cubeList.add(new ModelBox(cube_r34_r1_r1, 0, 87, -5.9621F, -57.4777F, -21.0001F, 1, 1, 1, -0.15F, false));

		cube_r33_r1_r1 = new ModelRenderer(this);
		cube_r33_r1_r1.setRotationPoint(-4.1049F, -1.848F, -10.0244F);
		bullet9.addChild(cube_r33_r1_r1);
		setRotationAngle(cube_r33_r1_r1, 0.0F, -0.3927F, -0.0873F);
		cube_r33_r1_r1.cubeList.add(new ModelBox(cube_r33_r1_r1, 7, 86, -19.027F, -40.5256F, -27.9572F, 1, 1, 1, -0.15F, false));

		cube_r32_r1_r1 = new ModelRenderer(this);
		cube_r32_r1_r1.setRotationPoint(-6.4288F, 6.8095F, -8.287F);
		bullet9.addChild(cube_r32_r1_r1);
		setRotationAngle(cube_r32_r1_r1, -0.3927F, 0.0F, -0.0873F);
		cube_r32_r1_r1.cubeList.add(new ModelBox(cube_r32_r1_r1, 79, 85, -3.7633F, -31.9439F, -50.5262F, 1, 1, 1, -0.15F, false));

		bullet10 = new ModelRenderer(this);
		bullet10.setRotationPoint(-0.0308F, 31.5737F, 12.4973F);
		belt.addChild(bullet10);
		

		cube_r38_r11_r1_r1 = new ModelRenderer(this);
		cube_r38_r11_r1_r1.setRotationPoint(0.0556F, -31.4115F, -12.4973F);
		bullet10.addChild(cube_r38_r11_r1_r1);
		setRotationAngle(cube_r38_r11_r1_r1, 0.0F, 0.0F, -0.0524F);
		cube_r38_r11_r1_r1.cubeList.add(new ModelBox(cube_r38_r11_r1_r1, 90, 162, -4.3924F, -41.2995F, -32.3F, 2, 2, 5, -0.29F, false));

		cube_r21_r2_r1 = new ModelRenderer(this);
		cube_r21_r2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bullet10.addChild(cube_r21_r2_r1);
		setRotationAngle(cube_r21_r2_r1, 0.0F, 0.3927F, -0.0436F);
		cube_r21_r2_r1.cubeList.add(new ModelBox(cube_r21_r2_r1, 88, 0, 14.9173F, -72.0808F, -43.1803F, 1, 1, 1, -0.15F, false));

		cube_r22_r2_r1 = new ModelRenderer(this);
		cube_r22_r2_r1.setRotationPoint(-17.4988F, 0.009F, -22.4072F);
		bullet10.addChild(cube_r22_r2_r1);
		setRotationAngle(cube_r22_r2_r1, -0.3927F, 0.0F, -0.0436F);
		cube_r22_r2_r1.cubeList.add(new ModelBox(cube_r22_r2_r1, 88, 2, 14.6633F, -56.9256F, -48.6956F, 1, 1, 1, -0.15F, false));

		cube_r23_r2_r1 = new ModelRenderer(this);
		cube_r23_r2_r1.setRotationPoint(-12.1044F, -17.9412F, -18.9027F);
		bullet10.addChild(cube_r23_r2_r1);
		setRotationAngle(cube_r23_r2_r1, 0.0F, -0.3927F, -0.0436F);
		cube_r23_r2_r1.cubeList.add(new ModelBox(cube_r23_r2_r1, 88, 6, -2.569F, -53.629F, -28.2699F, 1, 1, 1, -0.15F, false));

		cube_r24_r2_r1 = new ModelRenderer(this);
		cube_r24_r2_r1.setRotationPoint(0.4424F, -12.0953F, 3.5046F);
		bullet10.addChild(cube_r24_r2_r1);
		setRotationAngle(cube_r24_r2_r1, 0.3927F, 0.0F, -0.0436F);
		cube_r24_r2_r1.cubeList.add(new ModelBox(cube_r24_r2_r1, 88, 8, -3.7884F, -74.437F, -22.7546F, 1, 1, 1, -0.15F, false));

		cube_r25_r2_r1 = new ModelRenderer(this);
		cube_r25_r2_r1.setRotationPoint(-10.4708F, -7.636F, -12.4973F);
		bullet10.addChild(cube_r25_r2_r1);
		setRotationAngle(cube_r25_r2_r1, 0.0F, 0.0F, -0.0436F);
		cube_r25_r2_r1.cubeList.add(new ModelBox(cube_r25_r2_r1, 84, 142, 7.3088F, -63.9956F, -36.5F, 1, 1, 4, -0.15F, false));
		cube_r25_r2_r1.cubeList.add(new ModelBox(cube_r25_r2_r1, 124, 72, 6.8088F, -64.4956F, -33.0F, 2, 2, 6, -0.31F, false));

		bullet11 = new ModelRenderer(this);
		bullet11.setRotationPoint(34.7122F, -19.5146F, -10.4222F);
		belt.addChild(bullet11);
		

		cube_r26_r2_r1 = new ModelRenderer(this);
		cube_r26_r2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bullet11.addChild(cube_r26_r2_r1);
		setRotationAngle(cube_r26_r2_r1, 0.0F, 0.3927F, -0.4799F);
		cube_r26_r2_r1.cubeList.add(new ModelBox(cube_r26_r2_r1, 87, 29, -19.1237F, -37.5781F, -32.4726F, 1, 1, 1, -0.15F, false));

		cube_r27_r2_r1 = new ModelRenderer(this);
		cube_r27_r2_r1.setRotationPoint(-5.1417F, 13.42F, -6.1662F);
		bullet11.addChild(cube_r27_r2_r1);
		setRotationAngle(cube_r27_r2_r1, -0.3927F, 0.0F, -0.4799F);
		cube_r27_r2_r1.cubeList.add(new ModelBox(cube_r27_r2_r1, 87, 31, -19.4146F, -37.1062F, -33.2574F, 1, 1, 1, -0.15F, false));

		cube_r28_r2_r1 = new ModelRenderer(this);
		cube_r28_r2_r1.setRotationPoint(-21.895F, 11.396F, 15.9347F);
		bullet11.addChild(cube_r28_r2_r1);
		setRotationAngle(cube_r28_r2_r1, 0.0F, -0.3927F, -0.4799F);
		cube_r28_r2_r1.cubeList.add(new ModelBox(cube_r28_r2_r1, 72, 87, -20.0454F, -37.5781F, -33.9308F, 1, 1, 1, -0.15F, false));

		cube_r29_r2_r1 = new ModelRenderer(this);
		cube_r29_r2_r1.setRotationPoint(-16.5376F, -8.475F, 22.1009F);
		bullet11.addChild(cube_r29_r2_r1);
		setRotationAngle(cube_r29_r2_r1, 0.3927F, 0.0F, -0.4799F);
		cube_r29_r2_r1.cubeList.add(new ModelBox(cube_r29_r2_r1, 79, 87, -19.4146F, -38.0529F, -33.146F, 1, 1, 1, -0.15F, false));

		cube_r30_r2_r1 = new ModelRenderer(this);
		cube_r30_r2_r1.setRotationPoint(-9.5417F, 4.9663F, 10.4222F);
		bullet11.addChild(cube_r30_r2_r1);
		setRotationAngle(cube_r30_r2_r1, 0.0F, 0.0F, -0.4799F);
		cube_r30_r2_r1.cubeList.add(new ModelBox(cube_r30_r2_r1, 16, 140, -19.4146F, -37.5781F, -36.5F, 1, 1, 4, -0.15F, false));
		cube_r30_r2_r1.cubeList.add(new ModelBox(cube_r30_r2_r1, 124, 48, -19.9146F, -38.0781F, -33.0F, 2, 2, 6, -0.31F, false));

		cube_r38_r8_r1_r1 = new ModelRenderer(this);
		cube_r38_r8_r1_r1.setRotationPoint(-28.6602F, 26.585F, 10.4222F);
		bullet11.addChild(cube_r38_r8_r1_r1);
		setRotationAngle(cube_r38_r8_r1_r1, 0.0F, 0.0F, -0.48F);
		cube_r38_r8_r1_r1.cubeList.add(new ModelBox(cube_r38_r8_r1_r1, 90, 162, 7.0208F, -48.4633F, -32.3F, 2, 2, 5, -0.29F, false));

		bullet12 = new ModelRenderer(this);
		bullet12.setRotationPoint(-6.8734F, 35.0194F, 15.8532F);
		belt.addChild(bullet12);
		

		cube_r38_r10_r3_r1 = new ModelRenderer(this);
		cube_r38_r10_r3_r1.setRotationPoint(6.8868F, -34.9002F, -15.8532F);
		bullet12.addChild(cube_r38_r10_r3_r1);
		setRotationAngle(cube_r38_r10_r3_r1, 0.0F, 0.0F, -0.0436F);
		cube_r38_r10_r3_r1.cubeList.add(new ModelBox(cube_r38_r10_r3_r1, 90, 162, -3.1969F, -41.2006F, -32.3F, 2, 2, 5, -0.29F, false));

		cube_r26_r3_r1 = new ModelRenderer(this);
		cube_r26_r3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bullet12.addChild(cube_r26_r3_r1);
		setRotationAngle(cube_r26_r3_r1, 0.0F, 0.3927F, -0.0436F);
		cube_r26_r3_r1.cubeList.add(new ModelBox(cube_r26_r3_r1, 87, 29, 24.0901F, -75.2729F, -43.0133F, 1, 1, 1, -0.15F, false));

		cube_r27_r3_r1 = new ModelRenderer(this);
		cube_r27_r3_r1.setRotationPoint(-18.1217F, 0.3634F, -25.709F);
		bullet12.addChild(cube_r27_r3_r1);
		setRotationAngle(cube_r27_r3_r1, -0.3927F, 0.0F, -0.0436F);
		cube_r27_r3_r1.cubeList.add(new ModelBox(cube_r27_r3_r1, 87, 31, 23.8396F, -60.1559F, -50.0924F, 1, 1, 1, -0.15F, false));

		cube_r28_r3_r1 = new ModelRenderer(this);
		cube_r28_r3_r1.setRotationPoint(-12.1969F, -18.0783F, -25.5681F);
		bullet12.addChild(cube_r28_r3_r1);
		setRotationAngle(cube_r28_r3_r1, 0.0F, -0.3927F, -0.0436F);
		cube_r28_r3_r1.cubeList.add(new ModelBox(cube_r28_r3_r1, 72, 87, 6.6659F, -56.6801F, -28.5131F, 1, 1, 1, -0.15F, false));

		cube_r29_r3_r1 = new ModelRenderer(this);
		cube_r29_r3_r1.setRotationPoint(-0.0434F, -11.8335F, 0.1409F);
		bullet12.addChild(cube_r29_r3_r1);
		setRotationAngle(cube_r29_r3_r1, 0.3927F, 0.0F, -0.0436F);
		cube_r29_r3_r1.cubeList.add(new ModelBox(cube_r29_r3_r1, 79, 87, 5.2468F, -77.6051F, -21.434F, 1, 1, 1, -0.15F, false));

		cube_r30_r3_r1 = new ModelRenderer(this);
		cube_r30_r3_r1.setRotationPoint(-11.1911F, -7.6699F, -15.8532F);
		bullet12.addChild(cube_r30_r3_r1);
		setRotationAngle(cube_r30_r3_r1, 0.0F, 0.0F, -0.0436F);
		cube_r30_r3_r1.cubeList.add(new ModelBox(cube_r30_r3_r1, 16, 140, 16.5654F, -67.1224F, -36.5F, 1, 1, 4, -0.15F, false));
		cube_r30_r3_r1.cubeList.add(new ModelBox(cube_r30_r3_r1, 124, 48, 16.0654F, -67.6224F, -33.0F, 2, 2, 6, -0.31F, false));

		bullet13 = new ModelRenderer(this);
		bullet13.setRotationPoint(-16.4734F, 33.7417F, 16.6168F);
		belt.addChild(bullet13);
		

		cube_r38_r10_r2_r1 = new ModelRenderer(this);
		cube_r38_r10_r2_r1.setRotationPoint(12.9754F, -33.7253F, -16.6168F);
		bullet13.addChild(cube_r38_r10_r2_r1);
		setRotationAngle(cube_r38_r10_r2_r1, 0.0F, 0.0F, 0.0873F);
		cube_r38_r10_r2_r1.cubeList.add(new ModelBox(cube_r38_r10_r2_r1, 90, 162, -3.1F, -41.0344F, -32.3F, 2, 2, 5, -0.29F, false));

		cube_r26_r3_r1_r1 = new ModelRenderer(this);
		cube_r26_r3_r1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bullet13.addChild(cube_r26_r3_r1_r1);
		setRotationAngle(cube_r26_r3_r1_r1, 0.0F, 0.3927F, 0.0873F);
		cube_r26_r3_r1_r1.cubeList.add(new ModelBox(cube_r26_r3_r1_r1, 87, 29, 25.906F, -75.2554F, -43.0896F, 1, 1, 1, -0.15F, false));

		cube_r27_r3_r1_r1 = new ModelRenderer(this);
		cube_r27_r3_r1_r1.setRotationPoint(-18.162F, -2.0188F, -26.4716F);
		bullet13.addChild(cube_r27_r3_r1_r1);
		setRotationAngle(cube_r27_r3_r1_r1, -0.3927F, 0.0F, 0.0873F);
		cube_r27_r3_r1_r1.cubeList.add(new ModelBox(cube_r27_r3_r1_r1, 87, 31, 25.6404F, -60.1398F, -50.0857F, 1, 1, 1, -0.15F, false));

		cube_r28_r3_r1_r1 = new ModelRenderer(this);
		cube_r28_r3_r1_r1.setRotationPoint(-9.7305F, -19.5172F, -27.0953F);
		bullet13.addChild(cube_r28_r3_r1_r1);
		setRotationAngle(cube_r28_r3_r1_r1, 0.0F, -0.3927F, 0.0873F);
		cube_r28_r3_r1_r1.cubeList.add(new ModelBox(cube_r28_r3_r1_r1, 72, 87, 8.4818F, -56.6626F, -28.4368F, 1, 1, 1, -0.15F, false));

		cube_r29_r3_r1_r1 = new ModelRenderer(this);
		cube_r29_r3_r1_r1.setRotationPoint(1.3561F, -11.75F, -0.624F);
		bullet13.addChild(cube_r29_r3_r1_r1);
		setRotationAngle(cube_r29_r3_r1_r1, 0.3927F, 0.0F, 0.0873F);
		cube_r29_r3_r1_r1.cubeList.add(new ModelBox(cube_r29_r3_r1_r1, 79, 87, 7.0476F, -77.589F, -21.4407F, 1, 1, 1, -0.15F, false));

		cube_r30_r3_r1_r1 = new ModelRenderer(this);
		cube_r30_r3_r1_r1.setRotationPoint(-10.2429F, -9.0789F, -16.6168F);
		bullet13.addChild(cube_r30_r3_r1_r1);
		setRotationAngle(cube_r30_r3_r1_r1, 0.0F, 0.0F, 0.0873F);
		cube_r30_r3_r1_r1.cubeList.add(new ModelBox(cube_r30_r3_r1_r1, 124, 48, 17.8662F, -67.6049F, -33.0F, 2, 2, 6, -0.31F, false));
		cube_r30_r3_r1_r1.cubeList.add(new ModelBox(cube_r30_r3_r1_r1, 16, 140, 18.3662F, -67.1049F, -36.5F, 1, 1, 4, -0.15F, false));

		bullet14 = new ModelRenderer(this);
		bullet14.setRotationPoint(-40.2886F, 18.0895F, 0.0F);
		belt.addChild(bullet14);
		

		cube_r38_r10_r1_r1 = new ModelRenderer(this);
		cube_r38_r10_r1_r1.setRotationPoint(28.1616F, -19.3597F, 0.0F);
		bullet14.addChild(cube_r38_r10_r1_r1);
		setRotationAngle(cube_r38_r10_r1_r1, 0.0F, 0.0F, 0.3054F);
		cube_r38_r10_r1_r1.cubeList.add(new ModelBox(cube_r38_r10_r1_r1, 90, 162, -1.54F, -41.1344F, -32.3F, 2, 2, 5, -0.29F, false));

		cube_r30_r5_r1 = new ModelRenderer(this);
		cube_r30_r5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bullet14.addChild(cube_r30_r5_r1);
		setRotationAngle(cube_r30_r5_r1, 0.0F, 0.0F, 0.3054F);
		cube_r30_r5_r1.cubeList.add(new ModelBox(cube_r30_r5_r1, 124, 48, 19.508F, -68.0713F, -33.0F, 2, 2, 6, -0.31F, false));
		cube_r30_r5_r1.cubeList.add(new ModelBox(cube_r30_r5_r1, 16, 140, 20.008F, -67.5713F, -36.5F, 1, 1, 4, -0.15F, false));

		cube_r29_r5_r1 = new ModelRenderer(this);
		cube_r29_r5_r1.setRotationPoint(11.9154F, -0.1513F, 16.2621F);
		bullet14.addChild(cube_r29_r5_r1);
		setRotationAngle(cube_r29_r5_r1, 0.3927F, 0.0F, 0.3054F);
		cube_r29_r5_r1.cubeList.add(new ModelBox(cube_r29_r5_r1, 79, 87, 8.6894F, -78.0732F, -21.5301F, 1, 1, 1, -0.15F, false));

		cube_r28_r5_r1 = new ModelRenderer(this);
		cube_r28_r5_r1.setRotationPoint(2.7738F, -10.0745F, -10.5568F);
		bullet14.addChild(cube_r28_r5_r1);
		setRotationAngle(cube_r28_r5_r1, 0.0F, -0.3927F, 0.3054F);
		cube_r28_r5_r1.cubeList.add(new ModelBox(cube_r28_r5_r1, 72, 87, 10.0138F, -57.129F, -28.9886F, 1, 1, 1, -0.15F, false));

		cube_r27_r5_r1 = new ModelRenderer(this);
		cube_r27_r5_r1.setRotationPoint(-9.2439F, 5.1283F, -10.1236F);
		bullet14.addChild(cube_r27_r5_r1);
		setRotationAngle(cube_r27_r5_r1, -0.3927F, 0.0F, 0.3054F);
		cube_r27_r5_r1.cubeList.add(new ModelBox(cube_r27_r5_r1, 87, 31, 27.2822F, -60.624F, -49.9963F, 1, 1, 1, -0.15F, false));

		cube_r26_r5_r1 = new ModelRenderer(this);
		cube_r26_r5_r1.setRotationPoint(8.0534F, 11.0848F, 16.6952F);
		bullet14.addChild(cube_r26_r5_r1);
		setRotationAngle(cube_r26_r5_r1, 0.0F, 0.3927F, 0.3054F);
		cube_r26_r5_r1.cubeList.add(new ModelBox(cube_r26_r5_r1, 87, 29, 27.438F, -75.7218F, -42.5378F, 1, 1, 1, -0.15F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(16.5541F, -8.7427F, 0.0F);
		belt.addChild(bone2);
		

		cube_r38_r10_r9_r1 = new ModelRenderer(this);
		cube_r38_r10_r9_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r38_r10_r9_r1);
		setRotationAngle(cube_r38_r10_r9_r1, 0.0F, 0.0F, -0.48F);
		cube_r38_r10_r9_r1.cubeList.add(new ModelBox(cube_r38_r10_r9_r1, 90, 162, -10.6859F, -38.6443F, -32.3F, 2, 1, 5, -0.3F, false));
		cube_r38_r10_r9_r1.cubeList.add(new ModelBox(cube_r38_r10_r9_r1, 90, 162, -10.6859F, -38.9443F, -32.3F, 2, 1, 5, -0.3F, false));

		cube_r38_r10_r5_r1 = new ModelRenderer(this);
		cube_r38_r10_r5_r1.setRotationPoint(-8.1104F, 6.4071F, 0.0F);
		bone2.addChild(cube_r38_r10_r5_r1);
		setRotationAngle(cube_r38_r10_r5_r1, 0.0F, 0.0F, -0.2182F);
		cube_r38_r10_r5_r1.cubeList.add(new ModelBox(cube_r38_r10_r5_r1, 90, 162, -7.4397F, -40.3613F, -32.3F, 2, 1, 5, -0.3F, false));
		cube_r38_r10_r5_r1.cubeList.add(new ModelBox(cube_r38_r10_r5_r1, 90, 162, -7.4397F, -40.0613F, -32.3F, 2, 1, 5, -0.3F, false));

		cube_r38_r10_r4_r1 = new ModelRenderer(this);
		cube_r38_r10_r4_r1.setRotationPoint(-13.0989F, 8.3622F, 0.0F);
		bone2.addChild(cube_r38_r10_r4_r1);
		setRotationAngle(cube_r38_r10_r4_r1, 0.0F, 0.0F, -0.0873F);
		cube_r38_r10_r4_r1.cubeList.add(new ModelBox(cube_r38_r10_r4_r1, 90, 162, -3.828F, -40.6936F, -32.3F, 2, 1, 5, -0.3F, false));
		cube_r38_r10_r4_r1.cubeList.add(new ModelBox(cube_r38_r10_r4_r1, 90, 162, -3.828F, -40.3936F, -32.3F, 2, 1, 5, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		belt.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
