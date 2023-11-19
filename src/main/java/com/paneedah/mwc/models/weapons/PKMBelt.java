package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMBelt extends ModelWithAttachments {
	private final ModelRenderer Belt;
	private final ModelRenderer Boolet3;
	private final ModelRenderer cube_r5_r1;
	private final ModelRenderer cube_r4_r1;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r1_r1;
	private final ModelRenderer Boolet2;
	private final ModelRenderer cube_r10_r1;
	private final ModelRenderer cube_r9_r1;
	private final ModelRenderer cube_r8_r1;
	private final ModelRenderer cube_r7_r1;
	private final ModelRenderer cube_r6_r1;
	private final ModelRenderer Boolet;
	private final ModelRenderer cube_r15_r1;
	private final ModelRenderer cube_r14_r1;
	private final ModelRenderer cube_r13_r1;
	private final ModelRenderer cube_r12_r1;
	private final ModelRenderer cube_r11_r1;
	private final ModelRenderer cube_r12_r2;
	private final ModelRenderer cube_r13_r2;
	private final ModelRenderer cube_r14_r2;
	private final ModelRenderer cube_r15_r2;
	private final ModelRenderer cube_r11_r2;
	private final ModelRenderer Boolet4;
	private final ModelRenderer cube_r20_r1;
	private final ModelRenderer cube_r19_r1;
	private final ModelRenderer cube_r18_r1;
	private final ModelRenderer cube_r17_r1;
	private final ModelRenderer cube_r16_r1;
	private final ModelRenderer Boolet5;
	private final ModelRenderer cube_r25_r1;
	private final ModelRenderer cube_r24_r1;
	private final ModelRenderer cube_r23_r1;
	private final ModelRenderer cube_r22_r1;
	private final ModelRenderer cube_r21_r1;
	private final ModelRenderer Boolet6;
	private final ModelRenderer cube_r30_r1;
	private final ModelRenderer cube_r29_r1;
	private final ModelRenderer cube_r28_r1;
	private final ModelRenderer cube_r27_r1;
	private final ModelRenderer cube_r26_r1;
	private final ModelRenderer Boolet7;
	private final ModelRenderer cube_r32_r1;
	private final ModelRenderer cube_r33_r1;
	private final ModelRenderer cube_r34_r1;
	private final ModelRenderer cube_r35_r1;
	private final ModelRenderer cube_r31_r1;
	private final ModelRenderer Boolet8;
	private final ModelRenderer cube_r25_r2;
	private final ModelRenderer cube_r24_r2;
	private final ModelRenderer cube_r23_r2;
	private final ModelRenderer cube_r22_r2;
	private final ModelRenderer cube_r21_r2;
	private final ModelRenderer Boolet9;
	private final ModelRenderer cube_r30_r2;
	private final ModelRenderer cube_r29_r2;
	private final ModelRenderer cube_r28_r2;
	private final ModelRenderer cube_r27_r2;
	private final ModelRenderer cube_r26_r2;
	private final ModelRenderer Boolet10;
	private final ModelRenderer cube_r5_r2;
	private final ModelRenderer cube_r4_r2;
	private final ModelRenderer cube_r3_r2;
	private final ModelRenderer cube_r2_r2;
	private final ModelRenderer cube_r1_r2;
	private final ModelRenderer Boolet11;
	private final ModelRenderer cube_r30_r3;
	private final ModelRenderer cube_r29_r3;
	private final ModelRenderer cube_r28_r3;
	private final ModelRenderer cube_r27_r3;
	private final ModelRenderer cube_r26_r3;
	private final ModelRenderer beltbullet;
	private final ModelRenderer cube_r38_r1;
	private final ModelRenderer cube_r38_r2;
	private final ModelRenderer cube_r38_r3;
	private final ModelRenderer cube_r38_r4;
	private final ModelRenderer cube_r38_r5;
	private final ModelRenderer cube_r38_r6;
	private final ModelRenderer cube_r38_r7;
	private final ModelRenderer cube_r38_r8;
	private final ModelRenderer cube_r38_r9;
	private final ModelRenderer cube_r38_r10;
	private final ModelRenderer cube_r38_r11;

	public PKMBelt() {
		textureWidth = 400;
		textureHeight = 400;

		Belt = new ModelRenderer(this);
		Belt.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Boolet3 = new ModelRenderer(this);
		Boolet3.setRotationPoint(-16.5924F, -31.5043F, -33.0641F);
		Belt.addChild(Boolet3);
		setRotationAngle(Boolet3, 0.0F, 0.0F, 1.501F);
		

		cube_r5_r1 = new ModelRenderer(this);
		cube_r5_r1.setRotationPoint(33.3175F, -11.0716F, 33.0641F);
		Boolet3.addChild(cube_r5_r1);
		setRotationAngle(cube_r5_r1, 0.0F, 0.0F, -1.3963F);
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 144, 2, -16.6895F, -32.053F, -36.5F, 1, 1, 4, -0.15F, false));
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 72, 129, -17.1895F, -32.553F, -33.0F, 2, 2, 6, -0.31F, false));

		cube_r4_r1 = new ModelRenderer(this);
		cube_r4_r1.setRotationPoint(19.6491F, -13.4812F, 42.8393F);
		Boolet3.addChild(cube_r4_r1);
		setRotationAngle(cube_r4_r1, 0.3927F, 0.0F, -1.3963F);
		cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 72, 91, -16.6895F, -33.3967F, -33.0145F, 1, 1, 1, -0.15F, false));

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(31.1052F, 1.4781F, 37.1282F);
		Boolet3.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, 0.0F, -0.3927F, -1.3963F);
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 64, 90, -18.0667F, -32.053F, -33.1827F, 1, 1, 1, -0.15F, false));

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(42.2615F, -9.4949F, 18.7216F);
		Boolet3.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, -0.3927F, 0.0F, -1.3963F);
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 56, 90, -16.6895F, -30.7279F, -33.0464F, 1, 1, 1, -0.15F, false));

		cube_r1_r1 = new ModelRenderer(this);
		cube_r1_r1.setRotationPoint(35.0915F, -21.1343F, 24.4328F);
		Boolet3.addChild(cube_r1_r1);
		setRotationAngle(cube_r1_r1, 0.0F, 0.3927F, -1.3963F);
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 43, 90, -15.4228F, -32.053F, -32.8782F, 1, 1, 1, -0.15F, false));

		Boolet2 = new ModelRenderer(this);
		Boolet2.setRotationPoint(-15.1123F, -29.4794F, -33.0641F);
		Belt.addChild(Boolet2);
		setRotationAngle(Boolet2, 0.0F, 0.0F, 1.1781F);
		

		cube_r10_r1 = new ModelRenderer(this);
		cube_r10_r1.setRotationPoint(31.3664F, -9.8655F, 33.0641F);
		Boolet2.addChild(cube_r10_r1);
		setRotationAngle(cube_r10_r1, 0.0F, 0.0F, -1.3963F);
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 144, 7, -16.0414F, -30.7996F, -36.5F, 1, 1, 4, -0.15F, false));
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 88, 129, -16.5414F, -31.2996F, -33.0F, 2, 2, 6, -0.31F, false));

		cube_r9_r1 = new ModelRenderer(this);
		cube_r9_r1.setRotationPoint(17.8498F, -12.2483F, 42.0644F);
		Boolet2.addChild(cube_r9_r1);
		setRotationAngle(cube_r9_r1, 0.3927F, 0.0F, -1.3963F);
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 64, 92, -16.0414F, -32.0846F, -32.7192F, 1, 1, 1, -0.15F, false));

		cube_r8_r1 = new ModelRenderer(this);
		cube_r8_r1.setRotationPoint(29.1736F, 2.5732F, 36.5618F);
		Boolet2.addChild(cube_r8_r1);
		setRotationAngle(cube_r8_r1, 0.0F, -0.3927F, -1.3963F);
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 56, 92, -17.3553F, -30.7996F, -32.8643F, 1, 1, 1, -0.15F, false));

		cube_r7_r1 = new ModelRenderer(this);
		cube_r7_r1.setRotationPoint(40.4622F, -8.262F, 19.4965F);
		Boolet2.addChild(cube_r7_r1);
		setRotationAngle(cube_r7_r1, -0.3927F, 0.0F, -1.3963F);
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 43, 92, -16.0414F, -29.4158F, -33.3417F, 1, 1, 1, -0.15F, false));

		cube_r6_r1 = new ModelRenderer(this);
		cube_r6_r1.setRotationPoint(33.1599F, -20.0392F, 24.9992F);
		Boolet2.addChild(cube_r6_r1);
		setRotationAngle(cube_r6_r1, 0.0F, 0.3927F, -1.3963F);
		cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 80, 91, -14.7115F, -30.7996F, -33.1966F, 1, 1, 1, -0.15F, false));

		Boolet = new ModelRenderer(this);
		Boolet.setRotationPoint(-13.1488F, -27.5254F, -30.0F);
		Belt.addChild(Boolet);
		

		cube_r15_r1 = new ModelRenderer(this);
		cube_r15_r1.setRotationPoint(28.0902F, -9.4704F, 30.0F);
		Boolet.addChild(cube_r15_r1);
		setRotationAngle(cube_r15_r1, 0.0F, 0.0F, -1.3963F);
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 144, 14, -13.6488F, -28.0254F, -36.5F, 1, 1, 4, -0.15F, false));
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 104, 129, -14.1488F, -28.5254F, -33.0F, 2, 2, 6, -0.31F, false));

		cube_r14_r1 = new ModelRenderer(this);
		cube_r14_r1.setRotationPoint(14.7206F, -11.8273F, 38.2499F);
		Boolet.addChild(cube_r14_r1);
		setRotationAngle(cube_r14_r1, 0.3927F, 0.0F, -1.3963F);
		cube_r14_r1.cubeList.add(new ModelBox(cube_r14_r1, 72, 93, -13.6488F, -29.3723F, -33.0304F, 1, 1, 1, -0.15F, false));

		cube_r13_r1 = new ModelRenderer(this);
		cube_r13_r1.setRotationPoint(25.9233F, 2.8215F, 32.7482F);
		Boolet.addChild(cube_r13_r1);
		setRotationAngle(cube_r13_r1, 0.0F, -0.3927F, -1.3963F);
		cube_r13_r1.cubeList.add(new ModelBox(cube_r13_r1, 80, 93, -14.9957F, -28.0254F, -33.0304F, 1, 1, 1, -0.15F, false));

		cube_r12_r1 = new ModelRenderer(this);
		cube_r12_r1.setRotationPoint(37.3329F, -7.841F, 17.1828F);
		Boolet.addChild(cube_r12_r1);
		setRotationAngle(cube_r12_r1, -0.3927F, 0.0F, -1.3963F);
		cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 95, 0, -13.6488F, -26.7035F, -33.0304F, 1, 1, 1, -0.15F, false));

		cube_r11_r1 = new ModelRenderer(this);
		cube_r11_r1.setRotationPoint(-0.2114F, 0.2227F, -2.25F);
		Boolet.addChild(cube_r11_r1);
		setRotationAngle(cube_r11_r1, 0.0F, 0.3927F, -0.3927F);
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 95, 2, -0.0416F, -0.4928F, -0.9424F, 1, 1, 1, -0.15F, false));

		cube_r12_r2 = new ModelRenderer(this);
		cube_r12_r2.setRotationPoint(-0.2114F, 0.2227F, -2.25F);
		Boolet.addChild(cube_r12_r2);
		setRotationAngle(cube_r12_r2, -0.3927F, 0.0F, -0.3927F);
		cube_r12_r2.cubeList.add(new ModelBox(cube_r12_r2, 95, 0, -0.4756F, -0.0324F, -0.9489F, 1, 1, 1, -0.15F, false));

		cube_r13_r2 = new ModelRenderer(this);
		cube_r13_r2.setRotationPoint(-0.2114F, 0.2227F, -2.25F);
		Boolet.addChild(cube_r13_r2);
		setRotationAngle(cube_r13_r2, 0.0F, -0.3927F, -0.3927F);
		cube_r13_r2.cubeList.add(new ModelBox(cube_r13_r2, 80, 93, -0.9633F, -0.4928F, -0.9611F, 1, 1, 1, -0.15F, false));

		cube_r14_r2 = new ModelRenderer(this);
		cube_r14_r2.setRotationPoint(-0.2114F, 0.2227F, -2.25F);
		Boolet.addChild(cube_r14_r2);
		setRotationAngle(cube_r14_r2, 0.3927F, 0.0F, -0.3927F);
		cube_r14_r2.cubeList.add(new ModelBox(cube_r14_r2, 72, 93, -0.4756F, -0.9792F, -0.9545F, 1, 1, 1, -0.15F, false));

		cube_r15_r2 = new ModelRenderer(this);
		cube_r15_r2.setRotationPoint(-0.2114F, 0.2227F, -2.25F);
		Boolet.addChild(cube_r15_r2);
		setRotationAngle(cube_r15_r2, 0.0F, 0.0F, -0.3927F);
		cube_r15_r2.cubeList.add(new ModelBox(cube_r15_r2, 144, 14, -0.4756F, -0.4928F, -4.25F, 1, 1, 4, -0.15F, false));
		cube_r15_r2.cubeList.add(new ModelBox(cube_r15_r2, 104, 129, -0.9756F, -0.9928F, -0.75F, 2, 2, 6, -0.31F, false));

		cube_r11_r2 = new ModelRenderer(this);
		cube_r11_r2.setRotationPoint(29.9096F, -19.7909F, 22.6845F);
		Boolet.addChild(cube_r11_r2);
		setRotationAngle(cube_r11_r2, 0.0F, 0.3927F, -1.3963F);
		cube_r11_r2.cubeList.add(new ModelBox(cube_r11_r2, 95, 2, -12.3519F, -28.0254F, -33.0304F, 1, 1, 1, -0.15F, false));

		Boolet4 = new ModelRenderer(this);
		Boolet4.setRotationPoint(-15.143F, -33.7749F, -33.0641F);
		Belt.addChild(Boolet4);
		setRotationAngle(Boolet4, 0.0F, 0.0F, 2.4871F);
		

		cube_r20_r1 = new ModelRenderer(this);
		cube_r20_r1.setRotationPoint(35.602F, -8.65F, 33.0641F);
		Boolet4.addChild(cube_r20_r1);
		setRotationAngle(cube_r20_r1, 0.0F, 0.0F, -1.3963F);
		cube_r20_r1.cubeList.add(new ModelBox(cube_r20_r1, 140, 142, -16.0169F, -35.7193F, -36.5F, 1, 1, 4, -0.15F, false));
		cube_r20_r1.cubeList.add(new ModelBox(cube_r20_r1, 124, 80, -16.5169F, -36.2193F, -33.0F, 2, 2, 6, -0.31F, false));

		cube_r19_r1 = new ModelRenderer(this);
		cube_r19_r1.setRotationPoint(21.7634F, -11.0896F, 43.7082F);
		Boolet4.addChild(cube_r19_r1);
		setRotationAngle(cube_r19_r1, 0.3927F, 0.0F, -1.3963F);
		cube_r19_r1.cubeList.add(new ModelBox(cube_r19_r1, 88, 21, -16.0169F, -36.9568F, -32.4803F, 1, 1, 1, -0.15F, false));

		cube_r18_r1 = new ModelRenderer(this);
		cube_r18_r1.setRotationPoint(33.4088F, 3.791F, 36.5735F);
		Boolet4.addChild(cube_r18_r1);
		setRotationAngle(cube_r18_r1, 0.0F, -0.3927F, -1.3963F);
		cube_r18_r1.cubeList.add(new ModelBox(cube_r18_r1, 88, 19, -17.335F, -35.7193F, -32.8854F, 1, 1, 1, -0.15F, false));

		cube_r17_r1 = new ModelRenderer(this);
		cube_r17_r1.setRotationPoint(44.3758F, -7.1033F, 17.8527F);
		Boolet4.addChild(cube_r17_r1);
		setRotationAngle(cube_r17_r1, -0.3927F, 0.0F, -1.3963F);
		cube_r17_r1.cubeList.add(new ModelBox(cube_r17_r1, 88, 15, -16.0169F, -34.2879F, -33.5805F, 1, 1, 1, -0.15F, false));

		cube_r16_r1 = new ModelRenderer(this);
		cube_r16_r1.setRotationPoint(37.3951F, -18.8214F, 24.9874F);
		Boolet4.addChild(cube_r16_r1);
		setRotationAngle(cube_r16_r1, 0.0F, 0.3927F, -1.3963F);
		cube_r16_r1.cubeList.add(new ModelBox(cube_r16_r1, 88, 13, -14.6912F, -35.7193F, -33.1755F, 1, 1, 1, -0.15F, false));

		Boolet5 = new ModelRenderer(this);
		Boolet5.setRotationPoint(-15.1123F, -29.4794F, -33.0641F);
		Belt.addChild(Boolet5);
		setRotationAngle(Boolet5, 0.0F, 0.0F, 1.1781F);
		

		cube_r25_r1 = new ModelRenderer(this);
		cube_r25_r1.setRotationPoint(33.1024F, 3.6772F, 33.0641F);
		Boolet5.addChild(cube_r25_r1);
		setRotationAngle(cube_r25_r1, 0.0F, 0.0F, -0.829F);
		cube_r25_r1.cubeList.add(new ModelBox(cube_r25_r1, 84, 142, -20.4567F, -34.914F, -36.5F, 1, 1, 4, -0.15F, false));
		cube_r25_r1.cubeList.add(new ModelBox(cube_r25_r1, 124, 72, -20.9567F, -35.414F, -33.0F, 2, 2, 6, -0.31F, false));

		cube_r24_r1 = new ModelRenderer(this);
		cube_r24_r1.setRotationPoint(22.0052F, -6.4922F, 43.3355F);
		Boolet5.addChild(cube_r24_r1);
		setRotationAngle(cube_r24_r1, 0.3927F, 0.0F, -0.829F);
		cube_r24_r1.cubeList.add(new ModelBox(cube_r24_r1, 88, 8, -20.4567F, -35.1464F, -32.8268F, 1, 1, 1, -0.15F, false));

		cube_r23_r1 = new ModelRenderer(this);
		cube_r23_r1.setRotationPoint(23.6026F, 14.0438F, 38.3535F);
		Boolet5.addChild(cube_r23_r1);
		setRotationAngle(cube_r23_r1, 0.0F, -0.3927F, -0.829F);
		cube_r23_r1.cubeList.add(new ModelBox(cube_r23_r1, 88, 6, -20.7985F, -34.914F, -33.3774F, 1, 1, 1, -0.15F, false));

		cube_r22_r1 = new ModelRenderer(this);
		cube_r22_r1.setRotationPoint(40.4569F, 10.4168F, 17.8144F);
		Boolet5.addChild(cube_r22_r1);
		setRotationAngle(cube_r22_r1, -0.3927F, 0.0F, -0.829F);
		cube_r22_r1.cubeList.add(new ModelBox(cube_r22_r1, 88, 2, -20.4567F, -34.544F, -33.6451F, 1, 1, 1, -0.15F, false));

		cube_r21_r1 = new ModelRenderer(this);
		cube_r21_r1.setRotationPoint(40.5115F, -4.408F, 22.7964F);
		Boolet5.addChild(cube_r21_r1);
		setRotationAngle(cube_r21_r1, 0.0F, 0.3927F, -0.829F);
		cube_r21_r1.cubeList.add(new ModelBox(cube_r21_r1, 88, 0, -20.2212F, -34.914F, -33.0945F, 1, 1, 1, -0.15F, false));

		Boolet6 = new ModelRenderer(this);
		Boolet6.setRotationPoint(-15.1123F, -29.4794F, -33.0641F);
		Belt.addChild(Boolet6);
		setRotationAngle(Boolet6, 0.0F, 0.0F, 1.1781F);
		

		cube_r30_r1 = new ModelRenderer(this);
		cube_r30_r1.setRotationPoint(34.7537F, 3.5364F, 33.0641F);
		Boolet6.addChild(cube_r30_r1);
		setRotationAngle(cube_r30_r1, 0.0F, 0.0F, -0.829F);
		cube_r30_r1.cubeList.add(new ModelBox(cube_r30_r1, 16, 140, -20.3576F, -37.6834F, -36.5F, 1, 1, 4, -0.15F, false));
		cube_r30_r1.cubeList.add(new ModelBox(cube_r30_r1, 124, 48, -20.8576F, -38.1834F, -33.0F, 2, 2, 6, -0.31F, false));

		cube_r29_r1 = new ModelRenderer(this);
		cube_r29_r1.setRotationPoint(23.4351F, -6.8358F, 44.345F);
		Boolet6.addChild(cube_r29_r1);
		setRotationAngle(cube_r29_r1, 0.3927F, 0.0F, -0.829F);
		cube_r29_r1.cubeList.add(new ModelBox(cube_r29_r1, 79, 87, -20.3576F, -37.8138F, -32.8146F, 1, 1, 1, -0.15F, false));

		cube_r28_r1 = new ModelRenderer(this);
		cube_r28_r1.setRotationPoint(25.1845F, 13.9788F, 38.3702F);
		Boolet6.addChild(cube_r28_r1);
		setRotationAngle(cube_r28_r1, 0.0F, -0.3927F, -0.829F);
		cube_r28_r1.cubeList.add(new ModelBox(cube_r28_r1, 72, 87, -20.6184F, -37.6834F, -33.4701F, 1, 1, 1, -0.15F, false));

		cube_r27_r1 = new ModelRenderer(this);
		cube_r27_r1.setRotationPoint(42.0279F, 10.2024F, 16.7668F);
		Boolet6.addChild(cube_r27_r1);
		setRotationAngle(cube_r27_r1, -0.3927F, 0.0F, -0.829F);
		cube_r27_r1.cubeList.add(new ModelBox(cube_r27_r1, 87, 31, -20.3576F, -37.4028F, -33.6954F, 1, 1, 1, -0.15F, false));

		cube_r26_r1 = new ModelRenderer(this);
		cube_r26_r1.setRotationPoint(42.2227F, -4.614F, 22.7417F);
		Boolet6.addChild(cube_r26_r1);
		setRotationAngle(cube_r26_r1, 0.0F, 0.3927F, -0.829F);
		cube_r26_r1.cubeList.add(new ModelBox(cube_r26_r1, 87, 29, -20.2324F, -37.6834F, -33.0399F, 1, 1, 1, -0.15F, false));

		Boolet7 = new ModelRenderer(this);
		Boolet7.setRotationPoint(16.4345F, 7.8449F, -17.2923F);
		Belt.addChild(Boolet7);
		

		cube_r32_r1 = new ModelRenderer(this);
		cube_r32_r1.setRotationPoint(0.7F, -0.9F, 0.0F);
		Boolet7.addChild(cube_r32_r1);
		setRotationAngle(cube_r32_r1, -0.3927F, 0.0F, -0.0873F);
		cube_r32_r1.cubeList.add(new ModelBox(cube_r32_r1, 79, 85, -21.4955F, -38.9371F, -33.2539F, 1, 1, 1, -0.15F, false));

		cube_r33_r1 = new ModelRenderer(this);
		cube_r33_r1.setRotationPoint(-14.2984F, -9.293F, 22.828F);
		Boolet7.addChild(cube_r33_r1);
		setRotationAngle(cube_r33_r1, 0.0F, -0.3927F, -0.0873F);
		cube_r33_r1.cubeList.add(new ModelBox(cube_r33_r1, 7, 86, -21.7153F, -39.1298F, -33.2642F, 1, 1, 1, -0.15F, false));

		cube_r34_r1 = new ModelRenderer(this);
		cube_r34_r1.setRotationPoint(-1.4988F, -26.0229F, 29.5682F);
		Boolet7.addChild(cube_r34_r1);
		setRotationAngle(cube_r34_r1, 0.3927F, 0.0F, -0.0873F);
		cube_r34_r1.cubeList.add(new ModelBox(cube_r34_r1, 0, 87, -21.4955F, -39.348F, -33.256F, 1, 1, 1, -0.15F, false));

		cube_r35_r1 = new ModelRenderer(this);
		cube_r35_r1.setRotationPoint(-0.143F, -10.5319F, 17.2923F);
		Boolet7.addChild(cube_r35_r1);
		setRotationAngle(cube_r35_r1, 0.0F, 0.0F, -0.0873F);
		cube_r35_r1.cubeList.add(new ModelBox(cube_r35_r1, 122, 39, -21.9955F, -39.6298F, -33.0F, 2, 2, 6, -0.31F, false));
		cube_r35_r1.cubeList.add(new ModelBox(cube_r35_r1, 0, 140, -21.4955F, -39.1298F, -36.5F, 1, 1, 4, -0.15F, false));

		cube_r31_r1 = new ModelRenderer(this);
		cube_r31_r1.setRotationPoint(10.8245F, -11.4918F, 6.7402F);
		Boolet7.addChild(cube_r31_r1);
		setRotationAngle(cube_r31_r1, 0.0F, 0.3927F, -0.0873F);
		cube_r31_r1.cubeList.add(new ModelBox(cube_r31_r1, 72, 85, -21.3293F, -39.1298F, -33.2457F, 1, 1, 1, -0.15F, false));

		Boolet8 = new ModelRenderer(this);
		Boolet8.setRotationPoint(-6.1123F, -32.4794F, -33.0641F);
		Belt.addChild(Boolet8);
		setRotationAngle(Boolet8, 0.0F, 0.0F, 0.7854F);
		

		cube_r25_r2 = new ModelRenderer(this);
		cube_r25_r2.setRotationPoint(33.4024F, 2.8772F, 33.0641F);
		Boolet8.addChild(cube_r25_r2);
		setRotationAngle(cube_r25_r2, 0.0F, 0.0F, -0.829F);
		cube_r25_r2.cubeList.add(new ModelBox(cube_r25_r2, 84, 142, -20.9803F, -34.437F, -36.5F, 1, 1, 4, -0.15F, false));
		cube_r25_r2.cubeList.add(new ModelBox(cube_r25_r2, 124, 72, -21.4803F, -34.937F, -33.0F, 2, 2, 6, -0.31F, false));

		cube_r24_r2 = new ModelRenderer(this);
		cube_r24_r2.setRotationPoint(22.3052F, -7.2922F, 43.3355F);
		Boolet8.addChild(cube_r24_r2);
		setRotationAngle(cube_r24_r2, 0.3927F, 0.0F, -0.829F);
		cube_r24_r2.cubeList.add(new ModelBox(cube_r24_r2, 88, 8, -20.9803F, -34.7057F, -33.0093F, 1, 1, 1, -0.15F, false));

		cube_r23_r2 = new ModelRenderer(this);
		cube_r23_r2.setRotationPoint(23.9026F, 13.2438F, 38.3535F);
		Boolet8.addChild(cube_r23_r2);
		setRotationAngle(cube_r23_r2, 0.0F, -0.3927F, -0.829F);
		cube_r23_r2.cubeList.add(new ModelBox(cube_r23_r2, 88, 6, -21.2823F, -34.437F, -33.177F, 1, 1, 1, -0.15F, false));

		cube_r22_r2 = new ModelRenderer(this);
		cube_r22_r2.setRotationPoint(40.7569F, 9.6168F, 17.8144F);
		Boolet8.addChild(cube_r22_r2);
		setRotationAngle(cube_r22_r2, -0.3927F, 0.0F, -0.829F);
		cube_r22_r2.cubeList.add(new ModelBox(cube_r22_r2, 88, 2, -20.9803F, -34.1033F, -33.4626F, 1, 1, 1, -0.15F, false));

		cube_r21_r2 = new ModelRenderer(this);
		cube_r21_r2.setRotationPoint(40.8115F, -5.208F, 22.7964F);
		Boolet8.addChild(cube_r21_r2);
		setRotationAngle(cube_r21_r2, 0.0F, 0.3927F, -0.829F);
		cube_r21_r2.cubeList.add(new ModelBox(cube_r21_r2, 88, 0, -20.7049F, -34.437F, -33.2949F, 1, 1, 1, -0.15F, false));

		Boolet9 = new ModelRenderer(this);
		Boolet9.setRotationPoint(-15.0123F, -29.4794F, -33.0641F);
		Belt.addChild(Boolet9);
		setRotationAngle(Boolet9, 0.0F, 0.0F, 1.1781F);
		

		cube_r30_r2 = new ModelRenderer(this);
		cube_r30_r2.setRotationPoint(-5.8073F, -7.4532F, 0.8141F);
		Boolet9.addChild(cube_r30_r2);
		setRotationAngle(cube_r30_r2, 0.0F, 0.0F, -1.658F);
		cube_r30_r2.cubeList.add(new ModelBox(cube_r30_r2, 16, 140, 0.7379F, -0.88F, -4.25F, 1, 1, 4, -0.15F, false));
		cube_r30_r2.cubeList.add(new ModelBox(cube_r30_r2, 124, 48, 0.2379F, -1.38F, -0.75F, 2, 2, 6, -0.31F, false));

		cube_r29_r2 = new ModelRenderer(this);
		cube_r29_r2.setRotationPoint(-5.8073F, -7.4532F, 0.8141F);
		Boolet9.addChild(cube_r29_r2);
		setRotationAngle(cube_r29_r2, 0.3927F, 0.0F, -1.658F);
		cube_r29_r2.cubeList.add(new ModelBox(cube_r29_r2, 79, 87, 0.7379F, -1.3369F, -0.8063F, 1, 1, 1, -0.15F, false));

		cube_r28_r2 = new ModelRenderer(this);
		cube_r28_r2.setRotationPoint(-5.8073F, -7.4532F, 0.8141F);
		Boolet9.addChild(cube_r28_r2);
		setRotationAngle(cube_r28_r2, 0.0F, -0.3927F, -1.658F);
		cube_r28_r2.cubeList.add(new ModelBox(cube_r28_r2, 72, 87, 0.1579F, -0.88F, -1.4255F, 1, 1, 1, -0.15F, false));

		cube_r27_r2 = new ModelRenderer(this);
		cube_r27_r2.setRotationPoint(-5.8073F, -7.4532F, 0.8141F);
		Boolet9.addChild(cube_r27_r2);
		setRotationAngle(cube_r27_r2, -0.3927F, 0.0F, -1.658F);
		cube_r27_r2.cubeList.add(new ModelBox(cube_r27_r2, 87, 31, 0.7379F, -0.3902F, -1.0971F, 1, 1, 1, -0.15F, false));

		cube_r26_r2 = new ModelRenderer(this);
		cube_r26_r2.setRotationPoint(-5.8073F, -7.4532F, 0.8141F);
		Boolet9.addChild(cube_r26_r2);
		setRotationAngle(cube_r26_r2, 0.0F, 0.3927F, -1.658F);
		cube_r26_r2.cubeList.add(new ModelBox(cube_r26_r2, 87, 29, 1.0796F, -0.88F, -0.4779F, 1, 1, 1, -0.15F, false));

		Boolet10 = new ModelRenderer(this);
		Boolet10.setRotationPoint(-16.5924F, -31.5043F, -33.0641F);
		Belt.addChild(Boolet10);
		setRotationAngle(Boolet10, 0.0F, 0.0F, 1.501F);
		

		cube_r5_r2 = new ModelRenderer(this);
		cube_r5_r2.setRotationPoint(-2.3079F, -0.9848F, 0.8141F);
		Boolet10.addChild(cube_r5_r2);
		setRotationAngle(cube_r5_r2, 0.0F, 0.0F, -1.9635F);
		cube_r5_r2.cubeList.add(new ModelBox(cube_r5_r2, 144, 2, -0.118F, -0.3125F, -4.25F, 1, 1, 4, -0.15F, false));
		cube_r5_r2.cubeList.add(new ModelBox(cube_r5_r2, 72, 129, -0.618F, -0.8125F, -0.75F, 2, 2, 6, -0.31F, false));

		cube_r4_r2 = new ModelRenderer(this);
		cube_r4_r2.setRotationPoint(-2.3079F, -0.9848F, 0.8141F);
		Boolet10.addChild(cube_r4_r2);
		setRotationAngle(cube_r4_r2, 0.3927F, 0.0F, -1.9635F);
		cube_r4_r2.cubeList.add(new ModelBox(cube_r4_r2, 72, 91, -0.118F, -0.8126F, -1.0235F, 1, 1, 1, -0.15F, false));

		cube_r3_r2 = new ModelRenderer(this);
		cube_r3_r2.setRotationPoint(-2.3079F, -0.9848F, 0.8141F);
		Boolet10.addChild(cube_r3_r2);
		setRotationAngle(cube_r3_r2, 0.0F, -0.3927F, -1.9635F);
		cube_r3_r2.cubeList.add(new ModelBox(cube_r3_r2, 64, 90, -0.6329F, -0.3125F, -1.0979F, 1, 1, 1, -0.15F, false));

		cube_r2_r2 = new ModelRenderer(this);
		cube_r2_r2.setRotationPoint(-2.3079F, -0.9848F, 0.8141F);
		Boolet10.addChild(cube_r2_r2);
		setRotationAngle(cube_r2_r2, -0.3927F, 0.0F, -1.9635F);
		cube_r2_r2.cubeList.add(new ModelBox(cube_r2_r2, 56, 90, -0.118F, 0.1341F, -0.8799F, 1, 1, 1, -0.15F, false));

		cube_r1_r2 = new ModelRenderer(this);
		cube_r1_r2.setRotationPoint(-2.3079F, -0.9848F, 0.8141F);
		Boolet10.addChild(cube_r1_r2);
		setRotationAngle(cube_r1_r2, 0.0F, 0.3927F, -1.9635F);
		cube_r1_r2.cubeList.add(new ModelBox(cube_r1_r2, 43, 90, 0.2888F, -0.3125F, -0.8055F, 1, 1, 1, -0.15F, false));

		Boolet11 = new ModelRenderer(this);
		Boolet11.setRotationPoint(-4.827F, -39.6569F, -32.6474F);
		Belt.addChild(Boolet11);
		setRotationAngle(Boolet11, 0.0F, 0.0F, 0.9599F);
		

		cube_r30_r3 = new ModelRenderer(this);
		cube_r30_r3.setRotationPoint(40.8378F, 10.4784F, 32.6474F);
		Boolet11.addChild(cube_r30_r3);
		setRotationAngle(cube_r30_r3, 0.0F, 0.0F, -0.829F);
		cube_r30_r3.cubeList.add(new ModelBox(cube_r30_r3, 16, 140, -20.3576F, -37.6834F, -36.5F, 1, 1, 4, -0.15F, false));
		cube_r30_r3.cubeList.add(new ModelBox(cube_r30_r3, 124, 48, -20.8576F, -38.1834F, -33.0F, 2, 2, 6, -0.31F, false));

		cube_r29_r3 = new ModelRenderer(this);
		cube_r29_r3.setRotationPoint(29.5192F, 0.1062F, 43.9283F);
		Boolet11.addChild(cube_r29_r3);
		setRotationAngle(cube_r29_r3, 0.3927F, 0.0F, -0.829F);
		cube_r29_r3.cubeList.add(new ModelBox(cube_r29_r3, 79, 87, -20.3576F, -37.8138F, -32.8146F, 1, 1, 1, -0.15F, false));

		cube_r28_r3 = new ModelRenderer(this);
		cube_r28_r3.setRotationPoint(31.2685F, 20.9207F, 37.9535F);
		Boolet11.addChild(cube_r28_r3);
		setRotationAngle(cube_r28_r3, 0.0F, -0.3927F, -0.829F);
		cube_r28_r3.cubeList.add(new ModelBox(cube_r28_r3, 72, 87, -20.6184F, -37.6834F, -33.4701F, 1, 1, 1, -0.15F, false));

		cube_r27_r3 = new ModelRenderer(this);
		cube_r27_r3.setRotationPoint(48.112F, 17.1444F, 16.3501F);
		Boolet11.addChild(cube_r27_r3);
		setRotationAngle(cube_r27_r3, -0.3927F, 0.0F, -0.829F);
		cube_r27_r3.cubeList.add(new ModelBox(cube_r27_r3, 87, 31, -20.3576F, -37.4028F, -33.6954F, 1, 1, 1, -0.15F, false));

		cube_r26_r3 = new ModelRenderer(this);
		cube_r26_r3.setRotationPoint(48.3067F, 2.3279F, 22.3249F);
		Boolet11.addChild(cube_r26_r3);
		setRotationAngle(cube_r26_r3, 0.0F, 0.3927F, -0.829F);
		cube_r26_r3.cubeList.add(new ModelBox(cube_r26_r3, 87, 29, -20.2324F, -37.6834F, -33.0399F, 1, 1, 1, -0.15F, false));

		beltbullet = new ModelRenderer(this);
		beltbullet.setRotationPoint(-4.7158F, -40.808F, -30.2F);
		Belt.addChild(beltbullet);
		

		cube_r38_r1 = new ModelRenderer(this);
		cube_r38_r1.setRotationPoint(-8.6007F, 13.4629F, 0.4F);
		beltbullet.addChild(cube_r38_r1);
		setRotationAngle(cube_r38_r1, 0.0F, 0.0F, -1.9635F);
		cube_r38_r1.cubeList.add(new ModelBox(cube_r38_r1, 90, 162, -1.0135F, -1.0199F, -2.5F, 2, 2, 5, -0.29F, false));

		cube_r38_r2 = new ModelRenderer(this);
		cube_r38_r2.setRotationPoint(-9.8401F, 11.7716F, 0.4F);
		beltbullet.addChild(cube_r38_r2);
		setRotationAngle(cube_r38_r2, 0.0F, 0.0F, -1.3963F);
		cube_r38_r2.cubeList.add(new ModelBox(cube_r38_r2, 90, 162, -1.1741F, -0.8636F, -2.5F, 2, 2, 5, -0.29F, false));

		cube_r38_r3 = new ModelRenderer(this);
		cube_r38_r3.setRotationPoint(-10.9657F, 10.2401F, 0.4F);
		beltbullet.addChild(cube_r38_r3);
		setRotationAngle(cube_r38_r3, 0.0F, 0.0F, -1.789F);
		cube_r38_r3.cubeList.add(new ModelBox(cube_r38_r3, 90, 162, -1.0584F, -1.0521F, -2.5F, 2, 2, 5, -0.29F, false));

		cube_r38_r4 = new ModelRenderer(this);
		cube_r38_r4.setRotationPoint(-11.3322F, 8.7112F, 0.4F);
		beltbullet.addChild(cube_r38_r4);
		setRotationAngle(cube_r38_r4, 0.0F, 0.0F, -1.4661F);
		cube_r38_r4.cubeList.add(new ModelBox(cube_r38_r4, 90, 162, -0.972F, -0.9732F, -2.5F, 2, 2, 5, -0.29F, false));

		cube_r38_r5 = new ModelRenderer(this);
		cube_r38_r5.setRotationPoint(-10.6399F, 6.8971F, 0.4F);
		beltbullet.addChild(cube_r38_r5);
		setRotationAngle(cube_r38_r5, 0.0F, 0.0F, -0.4625F);
		cube_r38_r5.cubeList.add(new ModelBox(cube_r38_r5, 90, 162, -1.0F, -1.0F, -2.5F, 2, 2, 5, -0.29F, false));

		cube_r38_r6 = new ModelRenderer(this);
		cube_r38_r6.setRotationPoint(-9.3683F, 5.5588F, 0.4F);
		beltbullet.addChild(cube_r38_r6);
		setRotationAngle(cube_r38_r6, 0.0F, 0.0F, -0.48F);
		cube_r38_r6.cubeList.add(new ModelBox(cube_r38_r6, 90, 162, -0.9659F, -1.0F, -2.5F, 2, 2, 5, -0.29F, false));

		cube_r38_r7 = new ModelRenderer(this);
		cube_r38_r7.setRotationPoint(-6.0241F, 2.204F, 0.4F);
		beltbullet.addChild(cube_r38_r7);
		setRotationAngle(cube_r38_r7, 0.0F, 0.0F, -1.2392F);
		cube_r38_r7.cubeList.add(new ModelBox(cube_r38_r7, 90, 162, -3.5F, -2.356F, -2.5F, 2, 2, 5, -0.29F, false));
		cube_r38_r7.cubeList.add(new ModelBox(cube_r38_r7, 90, 162, -1.9F, -1.0F, -2.5F, 2, 2, 5, -0.29F, false));

		cube_r38_r8 = new ModelRenderer(this);
		cube_r38_r8.setRotationPoint(-4.7354F, 2.1748F, 0.4F);
		beltbullet.addChild(cube_r38_r8);
		setRotationAngle(cube_r38_r8, 0.0F, 0.0F, -0.48F);
		cube_r38_r8.cubeList.add(new ModelBox(cube_r38_r8, 90, 162, -1.0F, -1.0F, -2.5F, 2, 2, 5, -0.29F, false));

		cube_r38_r9 = new ModelRenderer(this);
		cube_r38_r9.setRotationPoint(-3.3549F, 1.1189F, 0.4F);
		beltbullet.addChild(cube_r38_r9);
		setRotationAngle(cube_r38_r9, 0.0F, 0.0F, -0.096F);
		cube_r38_r9.cubeList.add(new ModelBox(cube_r38_r9, 90, 162, -0.9593F, -0.7F, -2.5F, 2, 2, 5, -0.29F, false));

		cube_r38_r10 = new ModelRenderer(this);
		cube_r38_r10.setRotationPoint(-0.0602F, 0.8147F, 0.4F);
		beltbullet.addChild(cube_r38_r10);
		setRotationAngle(cube_r38_r10, 0.0F, 0.0F, 0.1309F);
		cube_r38_r10.cubeList.add(new ModelBox(cube_r38_r10, 90, 162, -1.0F, -0.6568F, -2.5F, 2, 2, 5, -0.29F, false));

		cube_r38_r11 = new ModelRenderer(this);
		cube_r38_r11.setRotationPoint(-1.7F, 0.4F, 0.0F);
		beltbullet.addChild(cube_r38_r11);
		setRotationAngle(cube_r38_r11, 0.0F, 0.0F, -0.0524F);
		cube_r38_r11.cubeList.add(new ModelBox(cube_r38_r11, 90, 162, -1.0842F, -0.5F, -2.1F, 2, 2, 5, -0.29F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Belt.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}