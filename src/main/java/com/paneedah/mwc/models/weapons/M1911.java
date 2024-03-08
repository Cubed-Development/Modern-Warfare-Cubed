package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1911 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer slide_r3_r1;
	private final ModelRenderer Cubes;
	private final ModelRenderer cube_r1_r1_r1;
	private final ModelRenderer cube_r2_r1_r1;
	private final ModelRenderer cube_r3_r1_r1;
	private final ModelRenderer cube_r4_r1_r1;
	private final ModelRenderer cube_r5_r1_r1;
	private final ModelRenderer cube_r6_r1_r1;
	private final ModelRenderer cube_r7_r1_r1;
	private final ModelRenderer cube_r8_r2_r1;
	private final ModelRenderer cube_r8_r1_r1;
	private final ModelRenderer cube_r9_r1_r1;
	private final ModelRenderer cube_r10_r1_r1;
	private final ModelRenderer cube_r11_r1_r1;
	private final ModelRenderer cube_r12_r1_r1;
	private final ModelRenderer cube_r13_r1_r1;
	private final ModelRenderer cube_r14_r1_r1;
	private final ModelRenderer cube_r15_r1_r1;
	private final ModelRenderer cube_r16_r1_r1;
	private final ModelRenderer cube_r17_r1_r1;
	private final ModelRenderer cube_r18_r1_r1;
	private final ModelRenderer cube_r19_r1_r1;
	private final ModelRenderer cube_r20_r1_r1;
	private final ModelRenderer cube_r21_r1_r1;
	private final ModelRenderer cube_r22_r1_r1;
	private final ModelRenderer cube_r23_r1_r1;
	private final ModelRenderer cube_r24_r1_r1;
	private final ModelRenderer cube_r26_r1_r1;
	private final ModelRenderer cube_r26_r1_r2;
	private final ModelRenderer cube_r27_r1_r1;
	private final ModelRenderer cube_r28_r1_r1;
	private final ModelRenderer cube_r29_r1_r1;
	private final ModelRenderer cube_r30_r1_r1;
	private final ModelRenderer Trigger;
	private final ModelRenderer cube_r31_r1_r1;
	private final ModelRenderer cube_r32_r1_r1;
	private final ModelRenderer Details;
	private final ModelRenderer cube_r7_r1;
	private final ModelRenderer cube_r6_r1;
	private final ModelRenderer cube_r4_r1;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r1_r1;
	private final ModelRenderer gripidk;
	private final ModelRenderer cube_r12_r1;
	private final ModelRenderer cube_r11_r1;
	private final ModelRenderer cube_r10_r1;
	private final ModelRenderer cube_r10_r2;
	private final ModelRenderer cube_r9_r1;
	private final ModelRenderer bones;
	private final ModelRenderer cube_r14_r1;
	private final ModelRenderer cube_r13_r1;
	private final ModelRenderer gun108_r1_r1_r1;
	private final ModelRenderer gun109_r1_r1_r1;
	private final ModelRenderer gun110_r1_r1_r1;
	private final ModelRenderer gun109_r2_r1_r1;
	private final ModelRenderer hammer;
	private final ModelRenderer cube_r18_r1;
	private final ModelRenderer cube_r17_r1;
	private final ModelRenderer cube_r16_r1;
	private final ModelRenderer slide_r1_r1;
	private final ModelRenderer cube_r15_r1;

	public M1911() {
		textureWidth = 160;
		textureHeight = 160;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(-2.3313F, -5.9604F, -6.1731F);
		gun.cubeList.add(new ModelBox(gun, 72, 69, -1.267F, -6.2273F, 5.8731F, 3, 1, 2, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 19, -1.267F, -9.5273F, 5.8731F, 3, 4, 2, 0.0F, false));

		slide_r3_r1 = new ModelRenderer(this);
		slide_r3_r1.setRotationPoint(-25.1447F, 20.3177F, 6.1731F);
		gun.addChild(slide_r3_r1);
		setRotationAngle(slide_r3_r1, 0.0F, 0.0F, 0.7854F);
		slide_r3_r1.cubeList.add(new ModelBox(slide_r3_r1, 4, 79, -2.8F, -38.3877F, 0.9F, 1, 1, 1, -0.15F, false));

		Cubes = new ModelRenderer(this);
		Cubes.setRotationPoint(-0.3187F, -3.1396F, 11.7731F);
		gun.addChild(Cubes);
		Cubes.cubeList.add(new ModelBox(Cubes, 56, 89, -2.1F, -3.0F, -20.6F, 4, 3, 17, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 0, 0, 1.35F, -2.0F, -20.6F, 0, 2, 17, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 120, 19, 1.35F, -2.0F, -20.6F, 1, 2, 17, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 22, 78, -2.1F, -2.0F, -3.8F, 1, 2, 1, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 75, 77, 1.35F, -2.0F, -3.8F, 1, 2, 1, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 72, 62, -2.1F, -2.0F, -30.6F, 3, 1, 10, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 93, 13, -2.1F, -2.0F, -31.4F, 1, 1, 2, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 93, 10, 1.35F, -2.0F, -31.4F, 1, 1, 2, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 47, 70, 1.35F, -2.0F, -30.6F, 1, 1, 10, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 24, 20, 2.45F, -2.0F, -31.4F, 0, 1, 2, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 28, 97, -0.5F, -0.502F, -30.6F, 2, 1, 9, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 92, 43, -1.5F, 0.7F, -20.9F, 3, 3, 1, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 28, 88, -1.5F, 4.9F, -18.9F, 3, 1, 7, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 93, 3, -0.5F, -0.5F, -31.4F, 2, 1, 2, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 114, 0, -0.825F, -0.1F, -21.0F, 2, 1, 6, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 54, 62, -0.125F, -0.1F, -21.0F, 2, 1, 6, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 0, 97, -1.2528F, -0.5167F, -30.6F, 2, 1, 9, 0.0F, false));
		Cubes.cubeList.add(new ModelBox(Cubes, 74, 21, -1.2528F, -0.5147F, -31.4F, 2, 1, 2, 0.0F, false));

		cube_r1_r1_r1 = new ModelRenderer(this);
		cube_r1_r1_r1.setRotationPoint(2.65F, 44.0698F, -0.3913F);
		Cubes.addChild(cube_r1_r1_r1);
		setRotationAngle(cube_r1_r1_r1, 0.6109F, 0.0F, 0.0F);
		cube_r1_r1_r1.cubeList.add(new ModelBox(cube_r1_r1_r1, 0, 91, -4.0F, -36.1745F, 23.3992F, 2, 1, 2, -0.002F, false));
		cube_r1_r1_r1.cubeList.add(new ModelBox(cube_r1_r1_r1, 47, 70, -2.3F, -36.1745F, 20.2992F, 1, 1, 4, 0.0F, false));
		cube_r1_r1_r1.cubeList.add(new ModelBox(cube_r1_r1_r1, 41, 97, -3.0F, -37.1745F, 22.1992F, 1, 1, 1, 0.0F, false));
		cube_r1_r1_r1.cubeList.add(new ModelBox(cube_r1_r1_r1, 32, 97, -2.3F, -37.1745F, 22.1992F, 1, 1, 1, 0.0F, false));
		cube_r1_r1_r1.cubeList.add(new ModelBox(cube_r1_r1_r1, 0, 12, -4.0F, -36.1745F, 20.2992F, 2, 1, 4, 0.0F, false));
		cube_r1_r1_r1.cubeList.add(new ModelBox(cube_r1_r1_r1, 84, 48, -2.3F, -36.1745F, 23.3992F, 1, 1, 2, -0.002F, false));

		cube_r2_r1_r1 = new ModelRenderer(this);
		cube_r2_r1_r1.setRotationPoint(2.65F, 32.8311F, -43.1952F);
		Cubes.addChild(cube_r2_r1_r1);
		setRotationAngle(cube_r2_r1_r1, -1.3788F, 0.0F, 0.0F);
		cube_r2_r1_r1.cubeList.add(new ModelBox(cube_r2_r1_r1, 45, 97, -2.2F, -47.4098F, -9.8386F, 1, 1, 1, 0.0F, false));
		cube_r2_r1_r1.cubeList.add(new ModelBox(cube_r2_r1_r1, 36, 40, -4.1F, -47.4098F, -9.8386F, 2, 1, 1, 0.0F, false));
		cube_r2_r1_r1.cubeList.add(new ModelBox(cube_r2_r1_r1, 84, 51, -2.2F, -47.4098F, -9.3386F, 1, 1, 2, 0.0F, false));
		cube_r2_r1_r1.cubeList.add(new ModelBox(cube_r2_r1_r1, 92, 35, -4.1F, -47.4098F, -9.3386F, 2, 1, 2, 0.0F, false));

		cube_r3_r1_r1 = new ModelRenderer(this);
		cube_r3_r1_r1.setRotationPoint(2.65F, 39.6732F, -30.8524F);
		Cubes.addChild(cube_r3_r1_r1);
		setRotationAngle(cube_r3_r1_r1, -1.117F, 0.0F, 0.0F);
		cube_r3_r1_r1.cubeList.add(new ModelBox(cube_r3_r1_r1, 84, 110, -2.2F, -40.1916F, -15.79F, 1, 1, 7, 0.0F, false));
		cube_r3_r1_r1.cubeList.add(new ModelBox(cube_r3_r1_r1, 28, 107, -4.1F, -40.1916F, -15.79F, 2, 1, 7, 0.0F, false));

		cube_r4_r1_r1 = new ModelRenderer(this);
		cube_r4_r1_r1.setRotationPoint(2.65F, 42.1154F, -46.6086F);
		Cubes.addChild(cube_r4_r1_r1);
		setRotationAngle(cube_r4_r1_r1, -1.1868F, 0.0F, 0.0F);
		cube_r4_r1_r1.cubeList.add(new ModelBox(cube_r4_r1_r1, 13, 83, -2.2F, -55.092F, -20.1874F, 1, 1, 5, 0.0F, false));
		cube_r4_r1_r1.cubeList.add(new ModelBox(cube_r4_r1_r1, 20, 60, -4.1F, -55.092F, -20.1874F, 2, 1, 5, 0.0F, false));

		cube_r5_r1_r1 = new ModelRenderer(this);
		cube_r5_r1_r1.setRotationPoint(2.65F, 21.8998F, -71.8002F);
		Cubes.addChild(cube_r5_r1_r1);
		setRotationAngle(cube_r5_r1_r1, -1.5708F, 0.0F, 0.0F);
		cube_r5_r1_r1.cubeList.add(new ModelBox(cube_r5_r1_r1, 24, 19, -2.2F, -69.3001F, -20.5F, 1, 2, 4, -0.002F, false));
		cube_r5_r1_r1.cubeList.add(new ModelBox(cube_r5_r1_r1, 85, 73, -4.1F, -69.3001F, -20.5F, 2, 2, 4, -0.002F, false));

		cube_r6_r1_r1 = new ModelRenderer(this);
		cube_r6_r1_r1.setRotationPoint(2.65F, 33.7226F, -5.7975F);
		Cubes.addChild(cube_r6_r1_r1);
		setRotationAngle(cube_r6_r1_r1, -0.1396F, 0.0F, 0.0F);
		cube_r6_r1_r1.cubeList.add(new ModelBox(cube_r6_r1_r1, 41, 89, -2.3F, -34.5012F, -2.4513F, 1, 1, 5, 0.0F, false));
		cube_r6_r1_r1.cubeList.add(new ModelBox(cube_r6_r1_r1, 56, 100, -4.0F, -34.5012F, -2.4513F, 2, 1, 5, 0.0F, false));

		cube_r7_r1_r1 = new ModelRenderer(this);
		cube_r7_r1_r1.setRotationPoint(2.65F, 52.8118F, -13.6259F);
		Cubes.addChild(cube_r7_r1_r1);
		setRotationAngle(cube_r7_r1_r1, -0.8421F, 0.0F, 0.0F);
		cube_r7_r1_r1.cubeList.add(new ModelBox(cube_r7_r1_r1, 45, 30, -4.15F, -28.2844F, -41.5307F, 3, 1, 3, 0.0F, false));

		cube_r8_r2_r1 = new ModelRenderer(this);
		cube_r8_r2_r1.setRotationPoint(1.8972F, 47.0431F, -6.5418F);
		Cubes.addChild(cube_r8_r2_r1);
		setRotationAngle(cube_r8_r2_r1, -0.6109F, 0.0F, 0.0F);
		cube_r8_r2_r1.cubeList.add(new ModelBox(cube_r8_r2_r1, 0, 66, -3.15F, -30.1146F, -39.9037F, 2, 1, 2, 0.0F, false));

		cube_r8_r1_r1 = new ModelRenderer(this);
		cube_r8_r1_r1.setRotationPoint(2.65F, 47.0577F, -6.5418F);
		Cubes.addChild(cube_r8_r1_r1);
		setRotationAngle(cube_r8_r1_r1, -0.6109F, 0.0F, 0.0F);
		cube_r8_r1_r1.cubeList.add(new ModelBox(cube_r8_r1_r1, 93, 0, -3.15F, -30.1146F, -39.9037F, 2, 1, 2, 0.0F, false));

		cube_r9_r1_r1 = new ModelRenderer(this);
		cube_r9_r1_r1.setRotationPoint(-1.9518F, 41.7673F, -5.6F);
		Cubes.addChild(cube_r9_r1_r1);
		setRotationAngle(cube_r9_r1_r1, 0.0F, 0.0F, 0.5236F);
		cube_r9_r1_r1.cubeList.add(new ModelBox(cube_r9_r1_r1, 85, 22, -18.6492F, -39.1785F, -25.8F, 1, 1, 2, 0.0F, false));
		cube_r9_r1_r1.cubeList.add(new ModelBox(cube_r9_r1_r1, 85, 19, -18.6492F, -38.4785F, -25.8F, 1, 1, 2, 0.0F, false));
		cube_r9_r1_r1.cubeList.add(new ModelBox(cube_r9_r1_r1, 56, 116, -18.6492F, -39.1785F, -25.0F, 1, 1, 9, -0.0002F, false));
		cube_r9_r1_r1.cubeList.add(new ModelBox(cube_r9_r1_r1, 103, 110, -18.6492F, -38.4785F, -25.0F, 1, 1, 9, -0.004F, false));
		cube_r9_r1_r1.cubeList.add(new ModelBox(cube_r9_r1_r1, 128, 65, -18.1742F, -38.3285F, -14.9F, 1, 1, 8, 0.0F, false));
		cube_r9_r1_r1.cubeList.add(new ModelBox(cube_r9_r1_r1, 49, 97, -18.1742F, -38.3285F, -15.6F, 1, 1, 1, 0.0F, false));

		cube_r10_r1_r1 = new ModelRenderer(this);
		cube_r10_r1_r1.setRotationPoint(2.8013F, 49.0956F, -11.187F);
		Cubes.addChild(cube_r10_r1_r1);
		setRotationAngle(cube_r10_r1_r1, -0.5831F, 0.2201F, 0.2933F);
		cube_r10_r1_r1.cubeList.add(new ModelBox(cube_r10_r1_r1, 5, 87, -13.2026F, -32.2881F, -38.1874F, 1, 1, 2, 0.0F, false));

		cube_r11_r1_r1 = new ModelRenderer(this);
		cube_r11_r1_r1.setRotationPoint(7.4997F, 41.1912F, -5.6F);
		Cubes.addChild(cube_r11_r1_r1);
		setRotationAngle(cube_r11_r1_r1, 0.0F, 0.0F, -0.5236F);
		cube_r11_r1_r1.cubeList.add(new ModelBox(cube_r11_r1_r1, 48, 89, 12.7731F, -41.3285F, -25.8F, 1, 1, 2, 0.0F, false));
		cube_r11_r1_r1.cubeList.add(new ModelBox(cube_r11_r1_r1, 19, 126, 12.7731F, -40.6285F, -25.0F, 1, 1, 9, 0.0F, false));
		cube_r11_r1_r1.cubeList.add(new ModelBox(cube_r11_r1_r1, 28, 88, 12.7731F, -40.6285F, -25.8F, 1, 1, 2, 0.0F, false));
		cube_r11_r1_r1.cubeList.add(new ModelBox(cube_r11_r1_r1, 120, 38, 12.7731F, -41.3285F, -25.0F, 1, 1, 9, -0.002F, false));
		cube_r11_r1_r1.cubeList.add(new ModelBox(cube_r11_r1_r1, 98, 35, 12.2731F, -40.4535F, -15.0F, 1, 1, 1, 0.0F, false));
		cube_r11_r1_r1.cubeList.add(new ModelBox(cube_r11_r1_r1, 128, 81, 12.2731F, -40.4535F, -14.9F, 1, 1, 8, 0.0F, false));

		cube_r12_r1_r1 = new ModelRenderer(this);
		cube_r12_r1_r1.setRotationPoint(2.1768F, 48.1856F, -11.6031F);
		Cubes.addChild(cube_r12_r1_r1);
		setRotationAngle(cube_r12_r1_r1, -0.5831F, -0.2201F, -0.2933F);
		cube_r12_r1_r1.cubeList.add(new ModelBox(cube_r12_r1_r1, 56, 89, 7.6196F, -33.5013F, -37.2486F, 1, 1, 2, 0.0F, false));

		cube_r13_r1_r1 = new ModelRenderer(this);
		cube_r13_r1_r1.setRotationPoint(1.9F, -65.362F, 37.4073F);
		Cubes.addChild(cube_r13_r1_r1);
		setRotationAngle(cube_r13_r1_r1, 2.5045F, 0.0F, 0.0F);
		cube_r13_r1_r1.cubeList.add(new ModelBox(cube_r13_r1_r1, 39, 107, -4.0F, -86.4523F, -5.2843F, 3, 2, 4, 0.0F, false));
		cube_r13_r1_r1.cubeList.add(new ModelBox(cube_r13_r1_r1, 0, 70, -0.55F, -86.4523F, -5.2843F, 1, 2, 4, -0.001F, false));
		cube_r13_r1_r1.cubeList.add(new ModelBox(cube_r13_r1_r1, 13, 97, -2.25F, -86.4523F, -5.2843F, 2, 2, 4, 0.0F, false));

		cube_r14_r1_r1 = new ModelRenderer(this);
		cube_r14_r1_r1.setRotationPoint(1.9F, 16.9766F, -87.8276F);
		Cubes.addChild(cube_r14_r1_r1);
		setRotationAngle(cube_r14_r1_r1, -1.9897F, 0.0F, 0.0F);
		cube_r14_r1_r1.cubeList.add(new ModelBox(cube_r14_r1_r1, 0, 1, -4.0F, -64.7905F, -44.2313F, 0, 1, 1, 0.0F, false));
		cube_r14_r1_r1.cubeList.add(new ModelBox(cube_r14_r1_r1, 92, 27, -4.0F, -63.7905F, -45.2313F, 1, 1, 3, 0.0F, false));
		cube_r14_r1_r1.cubeList.add(new ModelBox(cube_r14_r1_r1, 59, 75, -0.55F, -64.7905F, -45.2313F, 1, 2, 3, -0.001F, false));
		cube_r14_r1_r1.cubeList.add(new ModelBox(cube_r14_r1_r1, 12, 13, -0.25F, -63.7905F, -45.2313F, 0, 1, 3, 0.0F, false));
		cube_r14_r1_r1.cubeList.add(new ModelBox(cube_r14_r1_r1, 0, 0, -2.25F, -64.7905F, -44.2313F, 0, 1, 1, 0.0F, false));

		cube_r15_r1_r1 = new ModelRenderer(this);
		cube_r15_r1_r1.setRotationPoint(1.9F, -93.2006F, -44.5511F);
		Cubes.addChild(cube_r15_r1_r1);
		setRotationAngle(cube_r15_r1_r1, -2.7751F, 0.0F, 0.0F);
		cube_r15_r1_r1.cubeList.add(new ModelBox(cube_r15_r1_r1, 92, 79, -4.0F, -102.8846F, 3.7028F, 1, 1, 2, -0.001F, false));
		cube_r15_r1_r1.cubeList.add(new ModelBox(cube_r15_r1_r1, 92, 31, -4.0F, -118.8846F, -3.0972F, 3, 3, 1, 0.0F, false));
		cube_r15_r1_r1.cubeList.add(new ModelBox(cube_r15_r1_r1, 44, 25, -4.0F, -119.0846F, -3.6972F, 3, 1, 1, 0.0F, false));
		cube_r15_r1_r1.cubeList.add(new ModelBox(cube_r15_r1_r1, 90, 56, -4.0F, -118.8846F, -3.6972F, 3, 15, 1, 0.0F, false));
		cube_r15_r1_r1.cubeList.add(new ModelBox(cube_r15_r1_r1, 36, 0, -4.0F, -116.8846F, -3.0972F, 3, 18, 7, -0.0015F, false));
		cube_r15_r1_r1.cubeList.add(new ModelBox(cube_r15_r1_r1, 18, 28, 0.4515F, -116.8846F, -3.0972F, 0, 18, 7, 0.0F, false));
		cube_r15_r1_r1.cubeList.add(new ModelBox(cube_r15_r1_r1, 56, 0, -1.55F, -118.8846F, -3.6972F, 2, 15, 1, 0.0F, false));
		cube_r15_r1_r1.cubeList.add(new ModelBox(cube_r15_r1_r1, 56, 92, -0.55F, -102.8846F, 3.7028F, 1, 1, 2, 0.0F, false));
		cube_r15_r1_r1.cubeList.add(new ModelBox(cube_r15_r1_r1, 0, 12, -0.55F, -118.8846F, -3.0972F, 1, 3, 1, 0.0F, false));
		cube_r15_r1_r1.cubeList.add(new ModelBox(cube_r15_r1_r1, 47, 40, -1.55F, -119.0846F, -3.6972F, 2, 1, 1, -0.002F, false));
		cube_r15_r1_r1.cubeList.add(new ModelBox(cube_r15_r1_r1, 36, 35, -2.25F, -116.8846F, -3.0972F, 2, 18, 7, 0.0F, false));
		cube_r15_r1_r1.cubeList.add(new ModelBox(cube_r15_r1_r1, 17, 6, -0.25F, -102.8846F, 3.7028F, 0, 1, 2, 0.0F, false));

		cube_r16_r1_r1 = new ModelRenderer(this);
		cube_r16_r1_r1.setRotationPoint(1.9F, -59.6567F, -19.2673F);
		Cubes.addChild(cube_r16_r1_r1);
		setRotationAngle(cube_r16_r1_r1, -2.9932F, 0.0F, 0.0F);
		cube_r16_r1_r1.cubeList.add(new ModelBox(cube_r16_r1_r1, 18, 53, -4.0F, -78.7553F, -8.6367F, 3, 1, 1, 0.0F, false));
		cube_r16_r1_r1.cubeList.add(new ModelBox(cube_r16_r1_r1, 72, 73, -4.0F, -78.7553F, -8.2367F, 3, 2, 7, 0.0F, false));
		cube_r16_r1_r1.cubeList.add(new ModelBox(cube_r16_r1_r1, 128, 90, -1.55F, -78.7553F, -8.2367F, 2, 2, 7, 0.0F, false));
		cube_r16_r1_r1.cubeList.add(new ModelBox(cube_r16_r1_r1, 28, 75, -1.55F, -78.7553F, -8.6367F, 2, 1, 1, 0.0F, false));

		cube_r17_r1_r1 = new ModelRenderer(this);
		cube_r17_r1_r1.setRotationPoint(2.65F, -38.1522F, -28.1418F);
		Cubes.addChild(cube_r17_r1_r1);
		setRotationAngle(cube_r17_r1_r1, -2.9932F, 0.0F, 0.0F);
		cube_r17_r1_r1.cubeList.add(new ModelBox(cube_r17_r1_r1, 0, 76, -4.125F, -58.7991F, -13.2929F, 3, 1, 2, 0.0F, false));

		cube_r18_r1_r1 = new ModelRenderer(this);
		cube_r18_r1_r1.setRotationPoint(2.65F, -33.2988F, -37.3476F);
		Cubes.addChild(cube_r18_r1_r1);
		setRotationAngle(cube_r18_r1_r1, -2.8536F, 0.0F, 0.0F);
		cube_r18_r1_r1.cubeList.add(new ModelBox(cube_r18_r1_r1, 81, 89, -4.125F, -57.2033F, -15.2657F, 3, 13, 2, 0.0F, false));

		cube_r19_r1_r1 = new ModelRenderer(this);
		cube_r19_r1_r1.setRotationPoint(1.9F, -61.7032F, -36.4099F);
		Cubes.addChild(cube_r19_r1_r1);
		setRotationAngle(cube_r19_r1_r1, -2.8536F, 0.0F, 0.0F);
		cube_r19_r1_r1.cubeList.add(new ModelBox(cube_r19_r1_r1, 120, 22, -4.0F, -84.9715F, -6.599F, 3, 12, 1, 0.0F, false));
		cube_r19_r1_r1.cubeList.add(new ModelBox(cube_r19_r1_r1, 91, 89, -1.55F, -84.9715F, -6.599F, 2, 12, 1, 0.0F, false));

		cube_r20_r1_r1 = new ModelRenderer(this);
		cube_r20_r1_r1.setRotationPoint(1.9F, -97.4054F, 30.2431F);
		Cubes.addChild(cube_r20_r1_r1);
		setRotationAngle(cube_r20_r1_r1, 2.9409F, 0.0F, 0.0F);
		cube_r20_r1_r1.cubeList.add(new ModelBox(cube_r20_r1_r1, 58, 21, -4.0F, -106.1821F, 13.2516F, 1, 2, 1, 0.0F, false));
		cube_r20_r1_r1.cubeList.add(new ModelBox(cube_r20_r1_r1, 30, 29, -0.55F, -106.1821F, 13.2516F, 1, 2, 1, 0.0F, false));

		cube_r21_r1_r1 = new ModelRenderer(this);
		cube_r21_r1_r1.setRotationPoint(1.9F, -55.9449F, 77.0284F);
		Cubes.addChild(cube_r21_r1_r1);
		setRotationAngle(cube_r21_r1_r1, 2.4609F, 0.0F, 0.0F);
		cube_r21_r1_r1.cubeList.add(new ModelBox(cube_r21_r1_r1, 64, 53, -4.0F, -95.9779F, 28.8476F, 3, 1, 1, 0.0F, false));
		cube_r21_r1_r1.cubeList.add(new ModelBox(cube_r21_r1_r1, 13, 19, -0.551F, -97.2779F, 25.8476F, 1, 4, 3, 0.0F, false));
		cube_r21_r1_r1.cubeList.add(new ModelBox(cube_r21_r1_r1, 0, 0, -4.0F, -97.2779F, 25.8476F, 1, 4, 3, -0.001F, false));
		cube_r21_r1_r1.cubeList.add(new ModelBox(cube_r21_r1_r1, 0, 99, -0.55F, -95.9779F, 28.8476F, 1, 1, 1, 0.0F, false));

		cube_r22_r1_r1 = new ModelRenderer(this);
		cube_r22_r1_r1.setRotationPoint(2.65F, 50.5084F, 38.9201F);
		Cubes.addChild(cube_r22_r1_r1);
		setRotationAngle(cube_r22_r1_r1, 1.2654F, 0.0F, 0.0F);
		cube_r22_r1_r1.cubeList.add(new ModelBox(cube_r22_r1_r1, 6, 70, -1.3F, -55.0785F, 35.5306F, 1, 2, 1, 0.0F, false));
		cube_r22_r1_r1.cubeList.add(new ModelBox(cube_r22_r1_r1, 0, 70, -4.75F, -55.0785F, 35.5306F, 1, 2, 1, 0.0F, false));

		cube_r23_r1_r1 = new ModelRenderer(this);
		cube_r23_r1_r1.setRotationPoint(2.65F, -1.9694F, 85.0974F);
		Cubes.addChild(cube_r23_r1_r1);
		setRotationAngle(cube_r23_r1_r1, 2.0071F, 0.0F, 0.0F);
		cube_r23_r1_r1.cubeList.add(new ModelBox(cube_r23_r1_r1, 53, 70, -1.3F, -81.1509F, 33.9775F, 1, 2, 1, 0.0F, false));
		cube_r23_r1_r1.cubeList.add(new ModelBox(cube_r23_r1_r1, 47, 70, -4.75F, -81.1509F, 33.9775F, 1, 2, 1, 0.0F, false));

		cube_r24_r1_r1 = new ModelRenderer(this);
		cube_r24_r1_r1.setRotationPoint(2.65F, 38.0303F, -3.9368F);
		Cubes.addChild(cube_r24_r1_r1);
		setRotationAngle(cube_r24_r1_r1, 0.3927F, 0.0F, 0.0F);
		cube_r24_r1_r1.cubeList.add(new ModelBox(cube_r24_r1_r1, 52, 75, -1.3F, -36.5405F, 15.4246F, 1, 2, 1, 0.0F, false));
		cube_r24_r1_r1.cubeList.add(new ModelBox(cube_r24_r1_r1, 66, 70, -4.75F, -36.5405F, 15.4246F, 1, 2, 1, 0.0F, false));

		cube_r26_r1_r1 = new ModelRenderer(this);
		cube_r26_r1_r1.setRotationPoint(-0.8507F, 54.5477F, -20.9456F);
		Cubes.addChild(cube_r26_r1_r1);
		setRotationAngle(cube_r26_r1_r1, -0.7674F, 0.2562F, 0.2586F);
		cube_r26_r1_r1.cubeList.add(new ModelBox(cube_r26_r1_r1, 64, 56, -15.9328F, -40.5061F, -34.4229F, 3, 1, 3, 0.0F, false));

		cube_r26_r1_r2 = new ModelRenderer(this);
		cube_r26_r1_r2.setRotationPoint(-0.1007F, 54.5477F, -20.9456F);
		Cubes.addChild(cube_r26_r1_r2);
		setRotationAngle(cube_r26_r1_r2, -0.7674F, 0.2562F, 0.2586F);
		cube_r26_r1_r2.cubeList.add(new ModelBox(cube_r26_r1_r2, 54, 29, -15.9328F, -40.9061F, -34.4229F, 3, 1, 3, -0.001F, false));

		cube_r27_r1_r1 = new ModelRenderer(this);
		cube_r27_r1_r1.setRotationPoint(2.2061F, 33.1F, -3.5441F);
		Cubes.addChild(cube_r27_r1_r1);
		setRotationAngle(cube_r27_r1_r1, 0.0F, -0.5236F, 0.0F);
		cube_r27_r1_r1.cubeList.add(new ModelBox(cube_r27_r1_r1, 92, 39, -7.3599F, -31.1516F, -7.4734F, 3, 3, 1, 0.0F, false));

		cube_r28_r1_r1 = new ModelRenderer(this);
		cube_r28_r1_r1.setRotationPoint(5.008F, 53.3251F, -21.2583F);
		Cubes.addChild(cube_r28_r1_r1);
		setRotationAngle(cube_r28_r1_r1, -0.7674F, -0.2562F, -0.2586F);
		cube_r28_r1_r1.cubeList.add(new ModelBox(cube_r28_r1_r1, 73, 57, 8.3541F, -41.9698F, -33.3333F, 3, 1, 3, 0.0F, false));
		cube_r28_r1_r1.cubeList.add(new ModelBox(cube_r28_r1_r1, 65, 21, 8.3541F, -41.5698F, -33.3333F, 3, 1, 3, 0.0F, false));

		cube_r29_r1_r1 = new ModelRenderer(this);
		cube_r29_r1_r1.setRotationPoint(1.9F, 52.4024F, -16.6182F);
		Cubes.addChild(cube_r29_r1_r1);
		setRotationAngle(cube_r29_r1_r1, -0.7854F, 0.0F, 0.0F);
		cube_r29_r1_r1.cubeList.add(new ModelBox(cube_r29_r1_r1, 21, 29, -4.0F, -40.7489F, -35.3841F, 3, 2, 3, -0.001F, false));
		cube_r29_r1_r1.cubeList.add(new ModelBox(cube_r29_r1_r1, 0, 4, 0.45F, -40.7489F, -35.3841F, 0, 2, 3, 0.0F, false));
		cube_r29_r1_r1.cubeList.add(new ModelBox(cube_r29_r1_r1, 59, 70, -2.25F, -40.7489F, -35.3841F, 2, 2, 3, 0.0F, false));

		cube_r30_r1_r1 = new ModelRenderer(this);
		cube_r30_r1_r1.setRotationPoint(2.65F, 44.4502F, -9.1171F);
		Cubes.addChild(cube_r30_r1_r1);
		setRotationAngle(cube_r30_r1_r1, -0.5672F, 0.0F, 0.0F);
		cube_r30_r1_r1.cubeList.add(new ModelBox(cube_r30_r1_r1, 21, 6, -0.3F, -32.3085F, -35.5301F, 0, 1, 2, 0.0F, false));
		cube_r30_r1_r1.cubeList.add(new ModelBox(cube_r30_r1_r1, 13, 76, -4.75F, -32.3085F, -35.5301F, 3, 1, 2, 0.0F, false));

		Trigger = new ModelRenderer(this);
		Trigger.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(Trigger);
		Trigger.cubeList.add(new ModelBox(Trigger, 17, 0, -0.5687F, -2.4396F, -3.1269F, 1, 5, 2, 0.0F, false));

		cube_r31_r1_r1 = new ModelRenderer(this);
		cube_r31_r1_r1.setRotationPoint(2.0813F, 36.967F, 4.9734F);
		Trigger.addChild(cube_r31_r1_r1);
		setRotationAngle(cube_r31_r1_r1, -0.4363F, 0.0F, 0.0F);
		cube_r31_r1_r1.cubeList.add(new ModelBox(cube_r31_r1_r1, 30, 19, -2.65F, -29.9027F, -22.8035F, 1, 2, 1, -0.002F, false));

		cube_r32_r1_r1 = new ModelRenderer(this);
		cube_r32_r1_r1.setRotationPoint(2.0813F, 35.3836F, 10.769F);
		Trigger.addChild(cube_r32_r1_r1);
		setRotationAngle(cube_r32_r1_r1, 0.4363F, 0.0F, 0.0F);
		cube_r32_r1_r1.cubeList.add(new ModelBox(cube_r32_r1_r1, 47, 75, -2.65F, -40.4545F, 2.63F, 1, 2, 3, -0.002F, false));

		Details = new ModelRenderer(this);
		Details.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(Details);
		Details.cubeList.add(new ModelBox(Details, 0, 32, -2.55F, -4.8F, -7.2F, 4, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 28, 97, 1.2F, 0.6F, -1.1F, 1, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 12, 107, 1.6F, -5.0F, -0.2F, 1, 1, 6, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 77, 19, 1.4F, -4.8F, -6.9F, 1, 1, 6, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 36, 5, -2.5587F, -4.7F, 7.8F, 2, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 97, 27, -2.55F, -4.7F, 7.8F, 1, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 21, 97, -2.55F, -3.3F, 6.4F, 1, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 97, 16, -3.55F, -1.6F, 3.3F, 1, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 97, 13, -3.55F, 11.9F, 7.8F, 1, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 13, 97, 1.775F, -1.6F, 3.3F, 1, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 97, 10, 1.775F, 11.9F, 7.8F, 1, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 97, 6, -2.55F, -3.5F, 9.6F, 1, 1, 1, 0.0F, false));
		Details.cubeList.add(new ModelBox(Details, 28, 56, 1.8F, -4.8F, -2.9F, 1, 1, 2, -0.05F, false));

		cube_r7_r1 = new ModelRenderer(this);
		cube_r7_r1.setRotationPoint(1.5813F, 25.485F, 14.4205F);
		Details.addChild(cube_r7_r1);
		setRotationAngle(cube_r7_r1, 0.2618F, 0.0F, 0.0F);
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 19, 15, -4.1313F, -33.9604F, -13.2731F, 4, 1, 1, -0.01F, false));

		cube_r6_r1 = new ModelRenderer(this);
		cube_r6_r1.setRotationPoint(2.3313F, 28.3437F, 10.4927F);
		Details.addChild(cube_r6_r1);
		setRotationAngle(cube_r6_r1, 0.1309F, 0.0F, 0.0F);
		cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 13, 70, -0.9313F, -34.4604F, -13.0731F, 1, 1, 5, -0.001F, false));

		cube_r4_r1 = new ModelRenderer(this);
		cube_r4_r1.setRotationPoint(2.6877F, 27.8795F, -4.5939F);
		Details.addChild(cube_r4_r1);
		setRotationAngle(cube_r4_r1, -0.4327F, -0.6169F, 0.2611F);
		cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 0, 97, -0.4063F, -34.6604F, 0.5269F, 1, 1, 1, 0.0F, false));

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(2.3313F, 27.7357F, -4.9888F);
		Details.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, -0.3491F, 0.0F, 0.0F);
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 49, 0, -0.9313F, -34.1604F, 0.9269F, 1, 2, 2, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 4, 97, -0.9313F, -34.6604F, 3.1269F, 1, 1, 1, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 64, 75, -0.5313F, -34.6604F, -0.7731F, 1, 1, 2, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 0, 25, -0.9313F, -34.6604F, -0.7731F, 1, 1, 4, -0.001F, false));

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(2.3313F, 1.3248F, -25.6078F);
		Details.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, -1.4224F, 0.0F, 0.0F);
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 5, 83, -0.9313F, -33.6604F, -0.6731F, 1, 1, 2, 0.0F, false));

		cube_r1_r1 = new ModelRenderer(this);
		cube_r1_r1.setRotationPoint(2.3313F, -29.8928F, -11.5323F);
		Details.addChild(cube_r1_r1);
		setRotationAngle(cube_r1_r1, -2.522F, 0.0F, 0.0F);
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 77, 83, -0.9313F, -34.9604F, -2.0731F, 1, 1, 2, 0.0F, false));

		gripidk = new ModelRenderer(this);
		gripidk.setRotationPoint(-0.6687F, 7.3604F, 5.8731F);
		gun.addChild(gripidk);
		

		cube_r12_r1 = new ModelRenderer(this);
		cube_r12_r1.setRotationPoint(3.0F, 21.5225F, 8.0102F);
		gripidk.addChild(cube_r12_r1);
		setRotationAngle(cube_r12_r1, 0.3491F, 0.0F, 0.0F);
		cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 65, 0, -5.6F, -34.1F, -0.65F, 6, 18, 3, 0.0F, false));

		cube_r11_r1 = new ModelRenderer(this);
		cube_r11_r1.setRotationPoint(-1.8565F, 21.6445F, 7.6744F);
		gripidk.addChild(cube_r11_r1);
		setRotationAngle(cube_r11_r1, 0.3695F, -0.3272F, -0.1238F);
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 82, 29, -0.8F, -33.1F, -2.0F, 2, 17, 2, 0.0F, false));

		cube_r10_r1 = new ModelRenderer(this);
		cube_r10_r1.setRotationPoint(-2.4338F, 21.3044F, 8.6093F);
		gripidk.addChild(cube_r10_r1);
		setRotationAngle(cube_r10_r1, 0.3878F, 0.4407F, 0.1725F);
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 54, 35, -0.925F, -33.1F, 1.45F, 2, 17, 2, 0.0F, false));

		cube_r10_r2 = new ModelRenderer(this);
		cube_r10_r2.setRotationPoint(2.6548F, 21.6468F, 7.6684F);
		gripidk.addChild(cube_r10_r2);
		setRotationAngle(cube_r10_r2, 0.3695F, 0.3272F, 0.1238F);
		cube_r10_r2.cubeList.add(new ModelBox(cube_r10_r2, 83, 0, -1.2F, -33.1F, -2.0F, 2, 17, 2, 0.0F, false));

		cube_r9_r1 = new ModelRenderer(this);
		cube_r9_r1.setRotationPoint(3.232F, 21.3066F, 8.6033F);
		gripidk.addChild(cube_r9_r1);
		setRotationAngle(cube_r9_r1, 0.3878F, -0.4407F, -0.1725F);
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 128, 54, -1.075F, -33.1F, 1.45F, 2, 17, 2, 0.0F, false));

		bones = new ModelRenderer(this);
		bones.setRotationPoint(2.6313F, 29.9604F, 6.1731F);
		gun.addChild(bones);
		bones.cubeList.add(new ModelBox(bones, 0, 107, -4.3F, -38.9233F, -17.1907F, 2, 2, 8, 0.0F, false));
		bones.cubeList.add(new ModelBox(bones, 100, 81, -4.1F, -38.6F, -34.4F, 1, 1, 26, 0.0F, false));
		bones.cubeList.add(new ModelBox(bones, 100, 54, -3.1F, -39.6F, -34.4F, 1, 1, 26, 0.0F, false));
		bones.cubeList.add(new ModelBox(bones, 0, 97, -3.1F, -37.6F, -34.4F, 1, 1, 26, 0.0F, false));
		bones.cubeList.add(new ModelBox(bones, 92, 27, -2.1F, -38.6F, -34.4F, 1, 1, 26, 0.0F, false));
		bones.cubeList.add(new ModelBox(bones, 128, 108, -2.0704F, -40.1703F, -17.1907F, 1, 2, 8, -0.1F, false));

		cube_r14_r1 = new ModelRenderer(this);
		cube_r14_r1.setRotationPoint(-2.6704F, -38.8703F, -13.1907F);
		bones.addChild(cube_r14_r1);
		setRotationAngle(cube_r14_r1, 0.0F, 0.0F, -0.2269F);
		cube_r14_r1.cubeList.add(new ModelBox(cube_r14_r1, 100, 93, -1.0F, -1.0F, -4.0F, 2, 2, 8, 0.0F, false));

		cube_r13_r1 = new ModelRenderer(this);
		cube_r13_r1.setRotationPoint(24.9619F, -12.4521F, 0.0F);
		bones.addChild(cube_r13_r1);
		setRotationAngle(cube_r13_r1, 0.0F, 0.0F, -0.7854F);
		cube_r13_r1.cubeList.add(new ModelBox(cube_r13_r1, 93, 0, -2.175F, -39.5983F, -17.1907F, 1, 2, 8, 0.0F, false));

		gun108_r1_r1_r1 = new ModelRenderer(this);
		gun108_r1_r1_r1.setRotationPoint(16.6686F, 14.2916F, 0.0F);
		bones.addChild(gun108_r1_r1_r1);
		setRotationAngle(gun108_r1_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun108_r1_r1_r1.cubeList.add(new ModelBox(gun108_r1_r1_r1, 44, 62, 23.8358F, -51.3785F, -34.4F, 1, 1, 26, -0.001F, false));
		gun108_r1_r1_r1.cubeList.add(new ModelBox(gun108_r1_r1_r1, 36, 35, 23.8358F, -50.9785F, -34.4F, 1, 1, 26, -0.002F, false));

		gun109_r1_r1_r1 = new ModelRenderer(this);
		gun109_r1_r1_r1.setRotationPoint(-15.949F, 14.726F, 0.0F);
		bones.addChild(gun109_r1_r1_r1);
		setRotationAngle(gun109_r1_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun109_r1_r1_r1.cubeList.add(new ModelBox(gun109_r1_r1_r1, 65, 0, -27.5003F, -47.4856F, -34.4F, 1, 1, 26, -0.002F, false));
		gun109_r1_r1_r1.cubeList.add(new ModelBox(gun109_r1_r1_r1, 64, 29, -27.5003F, -47.0856F, -34.4F, 1, 1, 26, -0.001F, false));

		gun110_r1_r1_r1 = new ModelRenderer(this);
		gun110_r1_r1_r1.setRotationPoint(15.8402F, 12.6348F, 0.0F);
		bones.addChild(gun110_r1_r1_r1);
		setRotationAngle(gun110_r1_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun110_r1_r1_r1.cubeList.add(new ModelBox(gun110_r1_r1_r1, 72, 56, 21.4216F, -49.6069F, -34.4F, 1, 1, 26, -0.002F, false));
		gun110_r1_r1_r1.cubeList.add(new ModelBox(gun110_r1_r1_r1, 0, 70, 21.4216F, -49.2069F, -34.4F, 1, 1, 26, -0.001F, false));

		gun109_r2_r1_r1 = new ModelRenderer(this);
		gun109_r2_r1_r1.setRotationPoint(-16.7775F, 16.3828F, 0.0F);
		bones.addChild(gun109_r2_r1_r1);
		setRotationAngle(gun109_r2_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun109_r2_r1_r1.cubeList.add(new ModelBox(gun109_r2_r1_r1, 28, 89, -29.9145F, -48.8572F, -34.4F, 1, 1, 26, -0.002F, false));
		gun109_r2_r1_r1.cubeList.add(new ModelBox(gun109_r2_r1_r1, 72, 83, -29.9145F, -49.2572F, -34.4F, 1, 1, 26, -0.001F, false));

		hammer = new ModelRenderer(this);
		hammer.setRotationPoint(-0.0151F, -4.9119F, 11.1057F);
		gun.addChild(hammer);
		setRotationAngle(hammer, -1.9286F, 0.0F, 0.0F);
		

		cube_r18_r1 = new ModelRenderer(this);
		cube_r18_r1.setRotationPoint(2.1464F, 36.4242F, 1.7367F);
		hammer.addChild(cube_r18_r1);
		setRotationAngle(cube_r18_r1, 0.0349F, 0.0F, 0.0F);
		cube_r18_r1.cubeList.add(new ModelBox(cube_r18_r1, 93, 75, -2.65F, -37.5871F, -1.2022F, 1, 1, 1, 0.1F, false));
		cube_r18_r1.cubeList.add(new ModelBox(cube_r18_r1, 93, 73, -2.65F, -36.8871F, -1.2022F, 1, 1, 1, 0.1F, false));

		cube_r17_r1 = new ModelRenderer(this);
		cube_r17_r1.setRotationPoint(2.1464F, 34.7018F, -10.6338F);
		hammer.addChild(cube_r17_r1);
		setRotationAngle(cube_r17_r1, -0.3142F, 0.0F, 0.0F);
		cube_r17_r1.cubeList.add(new ModelBox(cube_r17_r1, 96, 51, -2.65F, -38.5372F, -1.7089F, 1, 1, 1, 0.1F, false));
		cube_r17_r1.cubeList.add(new ModelBox(cube_r17_r1, 96, 23, -2.65F, -38.2372F, -1.7089F, 1, 1, 1, 0.1F, false));

		cube_r16_r1 = new ModelRenderer(this);
		cube_r16_r1.setRotationPoint(2.1464F, 29.0911F, 22.154F);
		hammer.addChild(cube_r16_r1);
		setRotationAngle(cube_r16_r1, 0.6545F, 0.0F, 0.0F);
		cube_r16_r1.cubeList.add(new ModelBox(cube_r16_r1, 0, 25, -2.65F, -36.7F, -0.5F, 1, 2, 1, 0.1F, false));

		slide_r1_r1 = new ModelRenderer(this);
		slide_r1_r1.setRotationPoint(2.1464F, 24.575F, 26.6039F);
		hammer.addChild(slide_r1_r1);
		setRotationAngle(slide_r1_r1, 0.829F, 0.0F, 0.0F);
		slide_r1_r1.cubeList.add(new ModelBox(slide_r1_r1, 6, 25, -2.625F, -36.6209F, -1.331F, 1, 2, 1, 0.1F, false));

		cube_r15_r1 = new ModelRenderer(this);
		cube_r15_r1.setRotationPoint(2.1464F, 36.157F, 4.9839F);
		hammer.addChild(cube_r15_r1);
		setRotationAngle(cube_r15_r1, 0.1309F, 0.0F, 0.0F);
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 20, 55, -2.65F, -35.0883F, -0.9668F, 1, 1, 2, 0.1F, false));
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