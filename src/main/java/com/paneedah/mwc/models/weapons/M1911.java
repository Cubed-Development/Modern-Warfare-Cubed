package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1911 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer Cubes;
	private final ModelRenderer cube_r30_r1;
	private final ModelRenderer cube_r29_r1;
	private final ModelRenderer cube_r28_r1;
	private final ModelRenderer cube_r27_r1;
	private final ModelRenderer cube_r26_r1;
	private final ModelRenderer cube_r25_r1;
	private final ModelRenderer cube_r24_r1;
	private final ModelRenderer cube_r23_r1;
	private final ModelRenderer cube_r22_r1;
	private final ModelRenderer cube_r21_r1;
	private final ModelRenderer cube_r20_r1;
	private final ModelRenderer cube_r19_r1;
	private final ModelRenderer cube_r18_r1;
	private final ModelRenderer cube_r17_r1;
	private final ModelRenderer cube_r16_r1;
	private final ModelRenderer cube_r15_r1;
	private final ModelRenderer cube_r14_r1;
	private final ModelRenderer cube_r13_r1;
	private final ModelRenderer cube_r12_r1;
	private final ModelRenderer cube_r11_r1;
	private final ModelRenderer cube_r10_r1;
	private final ModelRenderer cube_r9_r1;
	private final ModelRenderer cube_r8_r1;
	private final ModelRenderer cube_r7_r1;
	private final ModelRenderer cube_r6_r1;
	private final ModelRenderer cube_r5_r1;
	private final ModelRenderer cube_r4_r1;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r1_r1;
	private final ModelRenderer Trigger;
	private final ModelRenderer cube_r32_r1;
	private final ModelRenderer cube_r31_r1;
	private final ModelRenderer Details;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer gripidk;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer bones;
	private final ModelRenderer gun109_r2_r1;
	private final ModelRenderer gun110_r1_r1;
	private final ModelRenderer gun109_r1_r1;
	private final ModelRenderer gun108_r1_r1;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer hammer;
	private final ModelRenderer cube_r15;
	private final ModelRenderer slide_r1;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;

	public M1911() {
		textureWidth = 280;
		textureHeight = 280;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(-2.3313F, -5.9604F, -6.1731F);
		

		Cubes = new ModelRenderer(this);
		Cubes.setRotationPoint(-0.3187F, -3.1396F, 11.7731F);
		gun.addChild(Cubes);
		Cubes.cubeList.add(new ModelBox(Cubes, 219, 0, -1.35F, -2.0F, -20.6F, 3, 2, 17, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 46, 2, 1.35F, -2.0F, -20.6F, 0, 2, 17, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 84, 0, 1.35F, -2.0F, -20.6F, 1, 2, 17, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 149, 27, -1.35F, -2.0F, -3.8F, 1, 2, 1, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 149, 24, 1.35F, -2.0F, -3.8F, 1, 2, 1, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 132, 54, -1.35F, -2.0F, -30.6F, 3, 1, 10, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 148, 103, -1.35F, -2.0F, -31.4F, 1, 1, 2, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 148, 68, 1.35F, -2.0F, -31.4F, 1, 1, 2, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 89, 156, 1.35F, -2.0F, -30.6F, 1, 1, 10, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 36, 5, 2.45F, -2.0F, -31.4F, 0, 1, 2, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 49, 164, -0.5F, -0.502F, -30.6F, 2, 1, 9, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 102, 28, -0.5F, 0.7F, -20.9F, 2, 3, 1, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 97, 130, -0.5F, 4.9F, -18.9F, 2, 1, 7, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 9, 94, -0.5F, -0.5F, -31.4F, 2, 1, 2, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 46, 82, -0.825F, -0.1F, -21.0F, 2, 1, 6, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 21, 79, -0.125F, -0.1F, -21.0F, 2, 1, 6, 0.0F, false));

		cube_r30_r1 = new ModelRenderer(this);
		cube_r30_r1.setRotationPoint(2.65F, 32.7415F, -26.8301F);
		Cubes.addChild(cube_r30_r1);
		setRotationAngle(cube_r30_r1, -0.5672F, 0.0F, 0.0F);
		cube_r30_r1.cubeList.add(new ModelBox(cube_r30_r1, 26, 14, -0.3F, -31.95F, -14.3F, 0, 1, 2, 0.0F, false));
		cube_r30_r1.cubeList.add(new ModelBox(cube_r30_r1, 138, 105, -4.0F, -31.95F, -14.3F, 3, 1, 2, 0.0F, false));

		cube_r29_r1 = new ModelRenderer(this);
		cube_r29_r1.setRotationPoint(2.65F, 29.4511F, -34.4091F);
		Cubes.addChild(cube_r29_r1);
		setRotationAngle(cube_r29_r1, -0.7854F, 0.0F, 0.0F);
		cube_r29_r1.cubeList.add(new ModelBox(cube_r29_r1, 84, 76, -4.0F, -37.1F, -6.575F, 3, 2, 3, 0.0F, false));
		cube_r29_r1.cubeList.add(new ModelBox(cube_r29_r1, 55, 47, -0.3F, -37.1F, -6.575F, 0, 2, 3, 0.0F, false));
		cube_r29_r1.cubeList.add(new ModelBox(cube_r29_r1, 130, 113, -3.0F, -37.1F, -6.575F, 2, 2, 3, 0.0F, false));

		cube_r28_r1 = new ModelRenderer(this);
		cube_r28_r1.setRotationPoint(15.4291F, 26.7552F, -32.4583F);
		Cubes.addChild(cube_r28_r1);
		setRotationAngle(cube_r28_r1, -0.7674F, -0.2562F, -0.2586F);
		cube_r28_r1.cubeList.add(new ModelBox(cube_r28_r1, 77, 114, -4.425F, -35.625F, -6.475F, 3, 1, 3, 0.0F, false));
		cube_r28_r1.cubeList.add(new ModelBox(cube_r28_r1, 65, 114, -4.425F, -35.225F, -6.475F, 3, 1, 3, 0.0F, false));

		cube_r27_r1 = new ModelRenderer(this);
		cube_r27_r1.setRotationPoint(-1.4083F, 33.1F, -5.4004F);
		Cubes.addChild(cube_r27_r1);
		setRotationAngle(cube_r27_r1, 0.0F, -0.5236F, 0.0F);
		cube_r27_r1.cubeList.add(new ModelBox(cube_r27_r1, 93, 66, -3.3016F, -31.1516F, -7.673F, 3, 3, 1, 0.0F, false));

		cube_r26_r1 = new ModelRenderer(this);
		cube_r26_r1.setRotationPoint(-10.4078F, 27.8189F, -33.5479F);
		Cubes.addChild(cube_r26_r1);
		setRotationAngle(cube_r26_r1, -0.7674F, 0.2562F, 0.2586F);
		cube_r26_r1.cubeList.add(new ModelBox(cube_r26_r1, 115, 125, -2.875F, -35.225F, -6.475F, 3, 1, 3, 0.0F, false));
		cube_r26_r1.cubeList.add(new ModelBox(cube_r26_r1, 113, 114, -2.875F, -35.625F, -6.475F, 3, 1, 3, -0.001F, false));

		cube_r25_r1 = new ModelRenderer(this);
		cube_r25_r1.setRotationPoint(6.1322F, 33.1F, -7.5504F);
		Cubes.addChild(cube_r25_r1);
		setRotationAngle(cube_r25_r1, 0.0F, 0.5236F, 0.0F);
		cube_r25_r1.cubeList.add(new ModelBox(cube_r25_r1, 38, 94, -3.9984F, -31.1516F, -7.673F, 3, 3, 1, 0.0F, false));

		cube_r24_r1 = new ModelRenderer(this);
		cube_r24_r1.setRotationPoint(2.65F, 31.3845F, 7.6246F);
		Cubes.addChild(cube_r24_r1);
		setRotationAngle(cube_r24_r1, 0.3927F, 0.0F, 0.0F);
		cube_r24_r1.cubeList.add(new ModelBox(cube_r24_r1, 138, 43, -1.3F, -34.825F, 2.2F, 1, 2, 1, 0.0F, false));
		cube_r24_r1.cubeList.add(new ModelBox(cube_r24_r1, 137, 113, -4.0F, -34.825F, 2.2F, 1, 2, 1, 0.0F, false));

		cube_r23_r1 = new ModelRenderer(this);
		cube_r23_r1.setRotationPoint(2.65F, -13.3259F, 28.5775F);
		Cubes.addChild(cube_r23_r1);
		setRotationAngle(cube_r23_r1, 2.0071F, 0.0F, 0.0F);
		cube_r23_r1.cubeList.add(new ModelBox(cube_r23_r1, 83, 141, -1.3F, -34.725F, -0.2F, 1, 2, 1, 0.0F, false));
		cube_r23_r1.cubeList.add(new ModelBox(cube_r23_r1, 140, 0, -4.0F, -34.725F, -0.2F, 1, 2, 1, 0.0F, false));

		cube_r22_r1 = new ModelRenderer(this);
		cube_r22_r1.setRotationPoint(2.65F, 11.4465F, 28.5306F);
		Cubes.addChild(cube_r22_r1);
		setRotationAngle(cube_r22_r1, 1.2654F, 0.0F, 0.0F);
		cube_r22_r1.cubeList.add(new ModelBox(cube_r22_r1, 83, 145, -1.3F, -33.425F, 1.4F, 1, 2, 1, 0.0F, false));
		cube_r22_r1.cubeList.add(new ModelBox(cube_r22_r1, 142, 26, -4.0F, -33.425F, 1.4F, 1, 2, 1, 0.0F, false));

		cube_r21_r1 = new ModelRenderer(this);
		cube_r21_r1.setRotationPoint(2.65F, -26.0529F, 19.9476F);
		Cubes.addChild(cube_r21_r1);
		setRotationAngle(cube_r21_r1, 2.4609F, 0.0F, 0.0F);
		cube_r21_r1.cubeList.add(new ModelBox(cube_r21_r1, 101, 94, -4.0F, -36.825F, 3.3F, 3, 1, 1, 0.0F, false));
		cube_r21_r1.cubeList.add(new ModelBox(cube_r21_r1, 21, 45, -1.301F, -38.125F, 0.3F, 1, 4, 3, 0.0F, false));
		cube_r21_r1.cubeList.add(new ModelBox(cube_r21_r1, 10, 45, -4.0F, -38.125F, 0.3F, 1, 4, 3, 0.0F, false));
		cube_r21_r1.cubeList.add(new ModelBox(cube_r21_r1, 4, 158, -1.3F, -36.825F, 3.3F, 1, 1, 1, 0.0F, false));

		cube_r20_r1 = new ModelRenderer(this);
		cube_r20_r1.setRotationPoint(2.65F, -33.9571F, 5.7516F);
		Cubes.addChild(cube_r20_r1);
		setRotationAngle(cube_r20_r1, 2.9409F, 0.0F, 0.0F);
		cube_r20_r1.cubeList.add(new ModelBox(cube_r20_r1, 149, 21, -4.0F, -39.125F, 1.9F, 1, 2, 1, 0.0F, false));
		cube_r20_r1.cubeList.add(new ModelBox(cube_r20_r1, 147, 113, -1.3F, -39.125F, 1.9F, 1, 2, 1, 0.0F, false));

		cube_r19_r1 = new ModelRenderer(this);
		cube_r19_r1.setRotationPoint(2.65F, -16.5353F, -14.1317F);
		Cubes.addChild(cube_r19_r1);
		setRotationAngle(cube_r19_r1, -2.8536F, 0.0F, 0.0F);
		cube_r19_r1.cubeList.add(new ModelBox(cube_r19_r1, 37, 164, -4.0F, -35.3362F, 1.9327F, 3, 12, 1, 0.0F, false));
		cube_r19_r1.cubeList.add(new ModelBox(cube_r19_r1, 154, 39, -1.3F, -35.3362F, 1.9327F, 1, 12, 1, 0.0F, false));

		cube_r18_r1 = new ModelRenderer(this);
		cube_r18_r1.setRotationPoint(2.65F, -2.4011F, -16.6599F);
		Cubes.addChild(cube_r18_r1);
		setRotationAngle(cube_r18_r1, -2.8536F, 0.0F, 0.0F);
		cube_r18_r1.cubeList.add(new ModelBox(cube_r18_r1, 27, 108, -3.125F, -21.7022F, -4.2058F, 2, 13, 2, 0.0F, false));

		cube_r17_r1 = new ModelRenderer(this);
		cube_r17_r1.setRotationPoint(2.65F, -3.3639F, -14.2227F);
		Cubes.addChild(cube_r17_r1);
		setRotationAngle(cube_r17_r1, -2.9932F, 0.0F, 0.0F);
		cube_r17_r1.cubeList.add(new ModelBox(cube_r17_r1, 93, 61, -3.125F, -22.3352F, -4.6702F, 2, 1, 2, 0.0F, false));

		cube_r16_r1 = new ModelRenderer(this);
		cube_r16_r1.setRotationPoint(2.65F, -13.7863F, -8.9862F);
		Cubes.addChild(cube_r16_r1);
		setRotationAngle(cube_r16_r1, -2.9932F, 0.0F, 0.0F);
		cube_r16_r1.cubeList.add(new ModelBox(cube_r16_r1, 102, 23, -4.0F, -31.869F, -5.2505F, 3, 1, 1, 0.0F, false));
		cube_r16_r1.cubeList.add(new ModelBox(cube_r16_r1, 189, 30, -4.0F, -31.869F, -4.8505F, 3, 2, 7, 0.0F, false));
		cube_r16_r1.cubeList.add(new ModelBox(cube_r16_r1, 0, 90, -1.3F, -31.869F, -4.8505F, 1, 2, 7, 0.0F, false));
		cube_r16_r1.cubeList.add(new ModelBox(cube_r16_r1, 38, 158, -1.3F, -31.869F, -5.2505F, 1, 1, 1, 0.0F, false));

		cube_r15_r1 = new ModelRenderer(this);
		cube_r15_r1.setRotationPoint(2.65F, -33.6596F, -13.3722F);
		Cubes.addChild(cube_r15_r1);
		setRotationAngle(cube_r15_r1, -2.7751F, 0.0F, 0.0F);
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 145, 94, -4.0F, -36.125F, 11.475F, 1, 1, 2, 0.0F, false));
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 48, 94, -4.0F, -52.125F, 4.675F, 3, 3, 1, 0.0F, false));
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 102, 25, -4.0F, -52.325F, 4.075F, 3, 1, 1, 0.0F, false));
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 27, 90, -4.0F, -52.125F, 4.075F, 3, 15, 1, 0.0F, false));
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 0, 127, -4.0F, -50.125F, 4.675F, 3, 18, 7, -0.001F, false));
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 24, 13, -0.2985F, -50.125F, 4.675F, 0, 18, 7, 0.0F, false));
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 90, 119, -1.3F, -52.125F, 4.075F, 1, 15, 1, 0.0F, false));
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 145, 81, -1.3F, -36.125F, 11.475F, 1, 1, 2, 0.0F, false));
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 38, 112, -1.3F, -52.125F, 4.675F, 1, 3, 1, 0.0F, false));
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 42, 158, -1.3F, -52.325F, 4.075F, 1, 1, 1, -0.002F, false));
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 56, 127, -3.0F, -50.125F, 4.675F, 2, 18, 7, 0.0F, false));
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 14, 35, -1.0F, -36.125F, 11.475F, 0, 1, 2, 0.0F, false));

		cube_r14_r1 = new ModelRenderer(this);
		cube_r14_r1.setRotationPoint(2.65F, -1.6606F, -41.4786F);
		Cubes.addChild(cube_r14_r1);
		setRotationAngle(cube_r14_r1, -1.9897F, 0.0F, 0.0F);
		cube_r14_r1.cubeList.add(new ModelBox(cube_r14_r1, 16, 10, -4.0F, -30.0299F, -8.3527F, 0, 1, 1, 0.0F, false));
		cube_r14_r1.cubeList.add(new ModelBox(cube_r14_r1, 9, 99, -4.0F, -29.0299F, -9.3527F, 1, 1, 3, 0.0F, false));
		cube_r14_r1.cubeList.add(new ModelBox(cube_r14_r1, 10, 67, -1.3F, -30.0299F, -9.3527F, 1, 2, 3, -0.001F, false));
		cube_r14_r1.cubeList.add(new ModelBox(cube_r14_r1, 0, 14, -1.0F, -29.0299F, -9.3527F, 0, 1, 3, 0.0F, false));
		cube_r14_r1.cubeList.add(new ModelBox(cube_r14_r1, 3, 10, -3.0F, -30.0299F, -8.3527F, 0, 1, 1, 0.0F, false));

		cube_r13_r1 = new ModelRenderer(this);
		cube_r13_r1.setRotationPoint(2.65F, -23.2224F, -0.3316F);
		Cubes.addChild(cube_r13_r1);
		setRotationAngle(cube_r13_r1, 2.5045F, 0.0F, 0.0F);
		cube_r13_r1.cubeList.add(new ModelBox(cube_r13_r1, 65, 11, -4.0F, -30.1299F, -10.5527F, 3, 2, 4, 0.0F, false));
		cube_r13_r1.cubeList.add(new ModelBox(cube_r13_r1, 110, 28, -1.3F, -30.1299F, -10.5527F, 1, 2, 4, -0.001F, false));
		cube_r13_r1.cubeList.add(new ModelBox(cube_r13_r1, 115, 119, -3.0F, -30.1299F, -10.5527F, 2, 2, 4, 0.0F, false));

		cube_r12_r1 = new ModelRenderer(this);
		cube_r12_r1.setRotationPoint(14.1225F, 33.5735F, -25.8438F);
		Cubes.addChild(cube_r12_r1);
		setRotationAngle(cube_r12_r1, -0.5831F, -0.2201F, -0.2933F);
		cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 118, 145, -3.8529F, -33.9748F, -17.0048F, 1, 1, 2, 0.0F, false));
		cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 112, 145, -3.8529F, -33.9748F, -17.0048F, 1, 1, 2, 0.0F, false));

		cube_r11_r1 = new ModelRenderer(this);
		cube_r11_r1.setRotationPoint(20.5481F, 26.6965F, -5.6F);
		Cubes.addChild(cube_r11_r1);
		setRotationAngle(cube_r11_r1, 0.0F, 0.0F, -0.5236F);
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 146, 128, -5.125F, -34.925F, -25.8F, 1, 1, 2, 0.0F, false));
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 170, 183, -5.125F, -34.225F, -25.0F, 1, 1, 9, 0.0F, false));
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 122, 146, -5.125F, -34.225F, -25.8F, 1, 1, 2, 0.0F, false));
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 0, 174, -5.125F, -34.925F, -25.0F, 1, 1, 9, -0.002F, false));
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 46, 158, -5.625F, -34.05F, -15.0F, 1, 1, 1, 0.0F, false));
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 148, 99, -5.625F, -34.05F, -14.9F, 1, 1, 8, 0.0F, false));

		cube_r10_r1 = new ModelRenderer(this);
		cube_r10_r1.setRotationPoint(-9.1055F, 34.7867F, -26.7826F);
		Cubes.addChild(cube_r10_r1);
		setRotationAngle(cube_r10_r1, -0.5831F, 0.2201F, 0.2933F);
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 146, 137, -1.4471F, -33.9748F, -17.0048F, 1, 1, 2, 0.0F, false));

		cube_r9_r1 = new ModelRenderer(this);
		cube_r9_r1.setRotationPoint(-15.8242F, 28.8465F, -5.6F);
		Cubes.addChild(cube_r9_r1);
		setRotationAngle(cube_r9_r1, 0.0F, 0.0F, 0.5236F);
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 22, 148, -0.175F, -34.925F, -25.8F, 1, 1, 2, 0.0F, false));
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 146, 144, -0.175F, -34.225F, -25.8F, 1, 1, 2, 0.0F, false));
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 181, 184, -0.175F, -34.925F, -25.0F, 1, 1, 9, -0.0002F, false));
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 111, 184, -0.175F, -34.225F, -25.0F, 1, 1, 9, -0.004F, false));
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 114, 150, 0.3F, -34.075F, -14.9F, 1, 1, 8, 0.0F, false));
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 50, 158, 0.3F, -34.075F, -15.6F, 1, 1, 1, 0.0F, false));

		cube_r8_r1 = new ModelRenderer(this);
		cube_r8_r1.setRotationPoint(2.65F, 38.5854F, -28.2037F);
		Cubes.addChild(cube_r8_r1);
		setRotationAngle(cube_r8_r1, -0.6109F, 0.0F, 0.0F);
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 93, 70, -3.15F, -35.6F, -17.3F, 2, 1, 2, 0.0F, false));

		cube_r7_r1 = new ModelRenderer(this);
		cube_r7_r1.setRotationPoint(2.65F, 33.9951F, -31.6209F);
		Cubes.addChild(cube_r7_r1);
		setRotationAngle(cube_r7_r1, -0.8421F, 0.0F, 0.0F);
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 76, 145, -3.15F, -29.1795F, -15.5098F, 2, 1, 3, 0.0F, false));

		cube_r6_r1 = new ModelRenderer(this);
		cube_r6_r1.setRotationPoint(2.65F, 31.9988F, -10.1513F);
		Cubes.addChild(cube_r6_r1);
		setRotationAngle(cube_r6_r1, -0.1396F, 0.0F, 0.0F);
		cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 139, 66, -2.3F, -33.4F, 2.1F, 1, 1, 5, 0.0F, false));
		cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 132, 65, -3.0F, -33.4F, 2.1F, 1, 1, 5, 0.0F, false));

		cube_r5_r1 = new ModelRenderer(this);
		cube_r5_r1.setRotationPoint(2.65F, -5.6001F, -33.1F);
		Cubes.addChild(cube_r5_r1);
		setRotationAngle(cube_r5_r1, -1.5708F, 0.0F, 0.0F);
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 97, 119, -2.2F, -30.6F, 7.0F, 1, 2, 4, 0.0F, false));
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 38, 112, -3.1F, -30.6F, 7.0F, 1, 2, 4, 0.0F, false));

		cube_r4_r1 = new ModelRenderer(this);
		cube_r4_r1.setRotationPoint(2.65F, 7.208F, -32.7874F);
		Cubes.addChild(cube_r4_r1);
		setRotationAngle(cube_r4_r1, -1.1868F, 0.0F, 0.0F);
		cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 96, 142, -2.2F, -29.2F, 7.0F, 1, 1, 5, 0.0F, false));
		cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 89, 141, -3.1F, -29.2F, 7.0F, 1, 1, 5, 0.0F, false));

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(2.65F, 16.1802F, -23.4859F);
		Cubes.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, -1.117F, 0.0F, 0.0F);
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 103, 8, -2.2F, -23.2718F, 2.0959F, 1, 1, 7, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 103, 0, -3.1F, -23.2718F, 2.0959F, 1, 1, 7, 0.0F, false));

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(2.65F, 10.162F, -24.2345F);
		Cubes.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, -1.3788F, 0.0F, 0.0F);
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 58, 158, -2.2F, -24.4718F, 8.7959F, 1, 1, 1, 0.0F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 54, 158, -3.1F, -24.4718F, 8.7959F, 1, 1, 1, 0.0F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 148, 33, -2.2F, -24.4718F, 9.2959F, 1, 1, 2, 0.0F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 28, 148, -3.1F, -24.4718F, 9.2959F, 1, 1, 2, 0.0F, false));

		cube_r1_r1 = new ModelRenderer(this);
		cube_r1_r1.setRotationPoint(2.65F, 30.3255F, 14.3992F);
		Cubes.addChild(cube_r1_r1);
		setRotationAngle(cube_r1_r1, 0.6109F, 0.0F, 0.0F);
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 148, 61, -3.0F, -33.4F, 3.4F, 1, 1, 2, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 130, 118, -2.3F, -33.4F, 0.3F, 1, 1, 4, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 66, 158, -3.0F, -34.4F, 2.2F, 1, 1, 1, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 62, 158, -2.3F, -34.4F, 2.2F, 1, 1, 1, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 118, 130, -3.0F, -33.4F, 0.3F, 1, 1, 4, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 148, 58, -2.3F, -33.4F, 3.4F, 1, 1, 2, 0.0F, false));

		Trigger = new ModelRenderer(this);
		Trigger.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(Trigger);
		Trigger.cubeList.add(new ModelBox(Trigger, 0, 0, -0.3187F, -2.4396F, -3.1269F, 1, 5, 2, 0.0F, false));

		cube_r32_r1 = new ModelRenderer(this);
		cube_r32_r1.setRotationPoint(2.3313F, 22.3059F, 20.7031F);
		Trigger.addChild(cube_r32_r1);
		setRotationAngle(cube_r32_r1, 0.4363F, 0.0F, 0.0F);
		cube_r32_r1.cubeList.add(new ModelBox(cube_r32_r1, 0, 67, -2.65F, -32.8F, -11.9F, 1, 2, 3, -0.002F, false));

		cube_r31_r1 = new ModelRenderer(this);
		cube_r31_r1.setRotationPoint(2.3313F, 30.7577F, -10.2304F);
		Trigger.addChild(cube_r31_r1);
		setRotationAngle(cube_r31_r1, -0.4363F, 0.0F, 0.0F);
		cube_r31_r1.cubeList.add(new ModelBox(cube_r31_r1, 137, 76, -2.65F, -30.7F, -6.4F, 1, 2, 1, -0.002F, false));

		Details = new ModelRenderer(this);
		Details.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(Details);
		Details.cubeList.add(new ModelBox(Details, 144, 108, -1.8F, -4.8F, -7.2F, 4, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 156, 132, 1.2F, 0.6F, -1.1F, 1, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 49, 127, 1.6F, -5.0F, -0.2F, 1, 1, 6, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 58, 119, 1.4F, -4.8F, -6.9F, 1, 1, 6, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 71, 107, -1.8F, -4.7F, 7.8F, 2, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 156, 129, -1.8F, -4.7F, 7.8F, 1, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 136, 156, -1.8F, -3.3F, 6.4F, 1, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 156, 125, -2.3F, -1.6F, 3.3F, 1, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 124, 156, -2.3F, 11.9F, 7.8F, 1, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 118, 156, 1.775F, -1.6F, 3.3F, 1, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 156, 123, 1.775F, 11.9F, 7.8F, 1, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 156, 134, -1.8F, -3.5F, 9.6F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.9F, -2.8F, 6.9F);
		Details.addChild(cube_r1);
		setRotationAngle(cube_r1, -2.522F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 130, -0.5F, -2.2F, -2.8F, 1, 1, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.9F, -2.8F, 6.9F);
		Details.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.4224F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 57, 130, -0.5F, -0.9F, -1.4F, 1, 1, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.9F, -2.8F, 6.9F);
		Details.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 102, 19, -0.5F, -1.4F, 0.2F, 1, 2, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 128, 156, -0.5F, -1.9F, 2.4F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 130, -0.1F, -1.9F, -1.5F, 1, 1, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 130, 94, -0.5F, -1.9F, -1.5F, 1, 1, 4, -0.001F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.9F, -2.8F, 6.9F);
		Details.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.4327F, -0.6169F, 0.2611F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 156, 127, 0.025F, -1.9F, -0.2F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.3F, -4.3F, -2.0F);
		Details.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 130, -0.5F, -0.5F, -0.9F, 1, 1, 2, -0.05F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.9F, -3.8F, -4.0F);
		Details.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 53, 112, -0.5F, -0.7F, -2.9F, 1, 1, 5, -0.001F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.2F, -3.6F, -6.7F);
		Details.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 143, 126, -2.0F, -0.4F, -0.4F, 4, 1, 1, -0.01F, false));

		gripidk = new ModelRenderer(this);
		gripidk.setRotationPoint(-0.6687F, 7.3604F, 5.8731F);
		gun.addChild(gripidk);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.2F, 1.1F);
		gripidk.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.3695F, -0.3272F, -0.1238F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 188, 148, -2.0F, -10.7F, -2.8F, 1, 17, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.8F, 0.2F, 1.1F);
		gripidk.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.3878F, -0.4407F, -0.1725F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 188, 74, 1.125F, -10.7F, 0.65F, 1, 17, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.8F, 0.2F, 1.1F);
		gripidk.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.3695F, 0.3272F, 0.1238F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 186, 111, 1.0F, -10.7F, -2.8F, 1, 17, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.2F, 1.1F);
		gripidk.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.3878F, 0.4407F, 0.1725F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 40, 55, -2.125F, -10.7F, 0.65F, 0, 17, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.2F, 1.1F);
		gripidk.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.3491F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 130, 126, -1.6F, -11.7F, -1.45F, 5, 18, 3, 0.0F, false));

		bones = new ModelRenderer(this);
		bones.setRotationPoint(2.3313F, 29.9604F, 6.1731F);
		gun.addChild(bones);
		bones.cubeList.add(new ModelBox(bones, 168, 84, -3.8F, -38.9233F, -17.1907F, 2, 2, 8, 0.0F, false));
		bones.cubeList.add(new ModelBox(bones, 223, 82, -3.6F, -38.6F, -34.4F, 1, 1, 26, 0.0F, false));
		bones.cubeList.add(new ModelBox(bones, 0, 219, -2.6F, -39.6F, -34.4F, 1, 1, 26, 0.0F, false));
		bones.cubeList.add(new ModelBox(bones, 28, 217, -2.6F, -37.6F, -34.4F, 1, 1, 26, 0.0F, false));
		bones.cubeList.add(new ModelBox(bones, 217, 27, -1.6F, -38.6F, -34.4F, 1, 1, 26, 0.0F, false));

		gun109_r2_r1 = new ModelRenderer(this);
		gun109_r2_r1.setRotationPoint(-27.9145F, -11.4572F, 0.1F);
		bones.addChild(gun109_r2_r1);
		setRotationAngle(gun109_r2_r1, 0.0F, 0.0F, 0.7854F);
		gun109_r2_r1.cubeList.add(new ModelBox(gun109_r2_r1, 177, 203, -2.0F, -37.4F, -34.5F, 1, 1, 26, -0.002F, false));
		gun109_r2_r1.cubeList.add(new ModelBox(gun109_r2_r1, 204, 156, -2.0F, -37.8F, -34.5F, 1, 1, 26, -0.001F, false));

		gun110_r1_r1 = new ModelRenderer(this);
		gun110_r1_r1.setRotationPoint(23.4216F, -13.4069F, 0.1F);
		bones.addChild(gun110_r1_r1);
		setRotationAngle(gun110_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun110_r1_r1.cubeList.add(new ModelBox(gun110_r1_r1, 205, 183, -2.0F, -36.2F, -34.5F, 1, 1, 26, -0.002F, false));
		gun110_r1_r1.cubeList.add(new ModelBox(gun110_r1_r1, 111, 210, -2.0F, -35.8F, -34.5F, 1, 1, 26, -0.001F, false));

		gun109_r1_r1 = new ModelRenderer(this);
		gun109_r1_r1.setRotationPoint(-25.5003F, -11.2856F, 0.1F);
		bones.addChild(gun109_r1_r1);
		setRotationAngle(gun109_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun109_r1_r1.cubeList.add(new ModelBox(gun109_r1_r1, 205, 210, -2.0F, -36.2F, -34.5F, 1, 1, 26, -0.002F, false));
		gun109_r1_r1.cubeList.add(new ModelBox(gun109_r1_r1, 58, 211, -2.0F, -35.8F, -34.5F, 1, 1, 26, -0.001F, false));

		gun108_r1_r1 = new ModelRenderer(this);
		gun108_r1_r1.setRotationPoint(25.8358F, -13.5785F, 0.1F);
		bones.addChild(gun108_r1_r1);
		setRotationAngle(gun108_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun108_r1_r1.cubeList.add(new ModelBox(gun108_r1_r1, 224, 54, -2.0F, -37.8F, -34.5F, 1, 1, 26, -0.001F, false));
		gun108_r1_r1.cubeList.add(new ModelBox(gun108_r1_r1, 224, 109, -2.0F, -37.4F, -34.5F, 1, 1, 26, -0.002F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.15F, -37.3233F, -10.7657F);
		bones.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 67, -0.025F, -2.275F, -6.425F, 1, 2, 8, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.9488F, -38.7655F, -13.1907F);
		bones.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.2269F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 168, 148, -0.9F, -1.0845F, -4.0F, 2, 2, 8, 0.0F, false));

		hammer = new ModelRenderer(this);
		hammer.setRotationPoint(2.3313F, -4.4396F, 8.1731F);
		gun.addChild(hammer);
		setRotationAngle(hammer, -1.2741F, 0.0F, 0.0F);
		

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.15F, -0.0883F, -1.9668F);
		hammer.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.1309F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 67, 130, -0.5F, -0.6F, -1.0F, 1, 1, 2, 0.0F, false));

		slide_r1 = new ModelRenderer(this);
		slide_r1.setRotationPoint(-2.125F, -1.2209F, -2.431F);
		hammer.addChild(slide_r1);
		setRotationAngle(slide_r1, 0.829F, 0.0F, 0.0F);
		slide_r1.cubeList.add(new ModelBox(slide_r1, 136, 118, -0.5F, -1.0F, -0.9F, 1, 2, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-2.15F, -1.2F, -2.0F);
		hammer.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.6545F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 136, 94, -0.5F, -1.1F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.1375F, -1.5595F, -2.0468F);
		hammer.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.3142F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 114, 156, -0.5125F, -2.5777F, -1.6621F, 1, 1, 1, -0.001F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 156, 138, -0.5125F, -2.0777F, -1.6621F, 1, 1, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.1375F, -1.5595F, -2.0468F);
		hammer.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0349F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 156, 136, -0.5125F, -1.6276F, -1.1554F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 140, 156, -0.5125F, -0.9276F, -1.1554F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}