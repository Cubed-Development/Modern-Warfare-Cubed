package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Glock19XSlide extends ModelWithAttachments {
	private final QRenderer gun;
	private final ModelRenderer gun31_r1;
	private final ModelRenderer gun110_r1;
	private final ModelRenderer gun109_r1;
	private final ModelRenderer gun113_r1;
	private final ModelRenderer gun112_r1;
	private final ModelRenderer gun111_r1;
	private final ModelRenderer gun110_r2;
	private final ModelRenderer gun111_r2;
	private final ModelRenderer gun110_r3;
	private final ModelRenderer gun111_r3;
	private final ModelRenderer gun110_r4;
	private final ModelRenderer gun111_r4;
	private final ModelRenderer gun110_r5;
	private final ModelRenderer gun111_r5;
	private final ModelRenderer gun111_r6;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun38_r1;
	private final ModelRenderer gun37_r1;
	private final ModelRenderer gun93_r1;
	private final ModelRenderer gun92_r1;
	private final ModelRenderer gun92_r2;
	private final ModelRenderer gun141_r1;
	private final ModelRenderer gun140_r1;
	private final ModelRenderer gun157_r1;
	private final ModelRenderer gun10_r1;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun13_r1;
	private final ModelRenderer gun13_r2;
	private final ModelRenderer gun14_r1;
	private final ModelRenderer gun13_r3;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun10_r2;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun11_r2;
	private final ModelRenderer gun12_r2;
	private final ModelRenderer gun12_r3;
	private final ModelRenderer gun13_r4;
	private final ModelRenderer gun10_r3;
	private final ModelRenderer gun9_r2;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun145_r1;
	private final ModelRenderer gun145_r2;
	private final ModelRenderer gun144_r1;
	private final QRenderer G19slide;
	private final ModelRenderer slide56_r1;
	private final ModelRenderer slide54_r1;
	private final ModelRenderer slide23_r1;
	private final ModelRenderer slide22_r1;
	private final ModelRenderer slide21_r1;
	private final ModelRenderer slide21_r2;
	private final ModelRenderer slide20_r1;
	private final QRenderer G19razorbackbody;
	private final ModelRenderer gun32_r1;
	private final ModelRenderer gun111_r7;
	private final ModelRenderer gun110_r6;
	private final ModelRenderer gun114_r1;
	private final ModelRenderer gun113_r2;
	private final ModelRenderer gun112_r2;
	private final ModelRenderer gun111_r8;
	private final ModelRenderer gun112_r3;
	private final ModelRenderer gun111_r9;
	private final ModelRenderer gun112_r4;
	private final ModelRenderer gun111_r10;
	private final ModelRenderer gun112_r5;
	private final ModelRenderer gun111_r11;
	private final ModelRenderer gun112_r6;
	private final ModelRenderer gun112_r7;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun39_r2;
	private final ModelRenderer gun38_r2;
	private final ModelRenderer gun94_r1;
	private final ModelRenderer gun93_r2;
	private final ModelRenderer gun93_r3;
	private final ModelRenderer gun142_r1;
	private final ModelRenderer gun141_r2;
	private final ModelRenderer gun158_r1;
	private final ModelRenderer gun11_r3;
	private final ModelRenderer gun13_r5;
	private final ModelRenderer gun14_r2;
	private final ModelRenderer gun14_r3;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer gun14_r4;
	private final ModelRenderer gun12_r4;
	private final ModelRenderer gun11_r4;
	private final ModelRenderer gun10_r4;
	private final ModelRenderer gun12_r5;
	private final ModelRenderer gun13_r6;
	private final ModelRenderer gun13_r7;
	private final ModelRenderer gun14_r5;
	private final ModelRenderer gun11_r5;
	private final ModelRenderer gun10_r5;
	private final ModelRenderer gun9_r3;
	private final ModelRenderer gun8_r2;
	private final ModelRenderer gun7_r2;
	private final ModelRenderer gun146_r1;
	private final ModelRenderer gun146_r2;
	private final ModelRenderer gun145_r3;
	private final QRenderer G19razorbackslide;
	private final ModelRenderer slide59_r1;
	private final ModelRenderer slide70_r1;
	private final ModelRenderer slide57_r1;
	private final ModelRenderer slide58_r1;
	private final ModelRenderer slide57_r2;
	private final ModelRenderer slide57_r3;
	private final ModelRenderer slide16_r1;
	private final ModelRenderer slide15_r1;
	private final ModelRenderer slide19_r1;
	private final ModelRenderer slide23_r2;
	private final ModelRenderer slide22_r2;
	private final ModelRenderer slide21_r3;
	private final ModelRenderer slide21_r4;
	private final ModelRenderer slide20_r2;
	private final ModelRenderer slide19_r2;
	private final ModelRenderer slide17_r1;
	private final ModelRenderer slide16_r2;
	private final ModelRenderer slide15_r2;
	private final ModelRenderer slide14_r1;
	private final ModelRenderer slide15_r3;
	private final ModelRenderer slide14_r2;
	private final ModelRenderer slide34_r1;
	private final ModelRenderer slide34_r2;
	private final ModelRenderer slide34_r3;
	private final ModelRenderer slide33_r1;
	private final ModelRenderer slide32_r1;
	private final ModelRenderer slide33_r2;
	private final ModelRenderer slide32_r2;
	private final ModelRenderer slide31_r1;
	private final ModelRenderer slide42_r1;
	private final ModelRenderer slide41_r1;
	private final ModelRenderer slide38_r1;
	private final ModelRenderer slide35_r1;
	private final ModelRenderer slide35_r2;
	private final ModelRenderer slide34_r4;
	private final ModelRenderer slide29_r1;
	private final ModelRenderer slide29_r2;
	private final ModelRenderer slide30_r1;
	private final ModelRenderer slide28_r1;
	private final QRenderer G19rockslide;
	private final ModelRenderer slide16_r3;
	private final ModelRenderer slide17_r2;
	private final ModelRenderer slide16_r4;
	private final ModelRenderer slide17_r3;
	private final ModelRenderer slide18_r1;
	private final ModelRenderer slide19_r3;
	private final ModelRenderer slide57_r4;
	private final ModelRenderer slide55_r1;
	private final ModelRenderer slide25_r1;
	private final ModelRenderer slide24_r1;
	private final ModelRenderer slide27_r1;
	private final ModelRenderer slide29_r3;
	private final ModelRenderer slide28_r2;
	private final ModelRenderer slide27_r2;
	private final ModelRenderer slide26_r1;
	private final ModelRenderer slide25_r2;
	private final ModelRenderer slide24_r2;
	private final ModelRenderer slide23_r3;
	private final ModelRenderer slide22_r3;
	private final ModelRenderer slide22_r4;
	private final ModelRenderer slide21_r5;
	private final ModelRenderer slide25_r3;
	private final ModelRenderer slide24_r3;
	private final ModelRenderer slide17_r4;
	private final ModelRenderer slide16_r5;
	private final ModelRenderer slide19_r4;
	private final ModelRenderer slide18_r2;
	private final ModelRenderer slide20_r3;
	private final ModelRenderer slide19_r5;
	private final ModelRenderer slide18_r3;
	private final ModelRenderer slide17_r5;
	private final QRenderer G19ghostprecisionslide;
	private final ModelRenderer slide18_r4;
	private final ModelRenderer slide17_r6;
	private final ModelRenderer slide16_r6;
	private final ModelRenderer slide15_r4;
	private final ModelRenderer slide15_r5;
	private final ModelRenderer slide16_r7;
	private final ModelRenderer slide59_r2;
	private final ModelRenderer slide56_r2;
	private final ModelRenderer slide26_r2;
	private final ModelRenderer slide28_r3;
	private final ModelRenderer slide27_r3;
	private final ModelRenderer slide28_r4;
	private final ModelRenderer slide29_r4;
	private final ModelRenderer slide30_r2;
	private final ModelRenderer slide28_r5;
	private final ModelRenderer slide35_r3;
	private final ModelRenderer slide34_r5;
	private final ModelRenderer slide33_r3;
	private final ModelRenderer slide32_r3;
	private final ModelRenderer slide31_r2;
	private final ModelRenderer slide30_r3;
	private final ModelRenderer slide29_r5;
	private final ModelRenderer slide27_r4;
	private final ModelRenderer slide27_r5;
	private final ModelRenderer slide26_r3;
	private final ModelRenderer slide25_r4;
	private final ModelRenderer slide26_r4;
	private final ModelRenderer slide25_r5;
	private final ModelRenderer slide24_r4;
	private final ModelRenderer slide23_r4;
	private final ModelRenderer slide23_r5;
	private final ModelRenderer slide22_r5;
	private final QRenderer G19Xbody;
	private final ModelRenderer gun32_r2;
	private final ModelRenderer gun111_r12;
	private final ModelRenderer gun110_r7;
	private final ModelRenderer gun114_r2;
	private final ModelRenderer gun113_r3;
	private final ModelRenderer gun112_r8;
	private final ModelRenderer gun111_r13;
	private final ModelRenderer gun112_r9;
	private final ModelRenderer gun111_r14;
	private final ModelRenderer gun112_r10;
	private final ModelRenderer gun111_r15;
	private final ModelRenderer gun112_r11;
	private final ModelRenderer gun111_r16;
	private final ModelRenderer gun112_r12;
	private final ModelRenderer gun112_r13;
	private final ModelRenderer gun40_r2;
	private final ModelRenderer gun39_r3;
	private final ModelRenderer gun38_r3;
	private final ModelRenderer gun94_r2;
	private final ModelRenderer gun93_r4;
	private final ModelRenderer gun93_r5;
	private final ModelRenderer gun142_r2;
	private final ModelRenderer gun141_r3;
	private final ModelRenderer gun158_r2;
	private final ModelRenderer gun11_r6;
	private final ModelRenderer gun13_r8;
	private final ModelRenderer gun14_r6;
	private final ModelRenderer gun14_r7;
	private final ModelRenderer gun15_r2;
	private final ModelRenderer gun14_r8;
	private final ModelRenderer gun12_r6;
	private final ModelRenderer gun11_r7;
	private final ModelRenderer gun10_r6;
	private final ModelRenderer gun12_r7;
	private final ModelRenderer gun13_r9;
	private final ModelRenderer gun13_r10;
	private final ModelRenderer gun14_r9;
	private final ModelRenderer gun11_r8;
	private final ModelRenderer gun10_r7;
	private final ModelRenderer gun9_r4;
	private final ModelRenderer gun8_r3;
	private final ModelRenderer gun7_r3;
	private final ModelRenderer gun146_r3;
	private final ModelRenderer gun146_r4;
	private final ModelRenderer gun145_r4;
	private final QRenderer G19Xslide;
	private final ModelRenderer slide57_r5;
	private final ModelRenderer slide55_r2;
	private final ModelRenderer slide24_r5;
	private final ModelRenderer slide23_r6;
	private final ModelRenderer slide22_r6;
	private final ModelRenderer slide22_r7;
	private final ModelRenderer slide21_r6;

	public Glock19XSlide() {
		textureWidth = 200;
		textureHeight = 200;

		gun = new QRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 0, 123, -3.0F, -31.0F, -6.8F, 4, 1, 4, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 133, -2.5F, -17.5F, -4.8F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 160, 124, -3.0F, -19.5F, -3.7F, 4, 3, 6, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 113, 67, -2.999F, -20.0F, 1.9F, 4, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 121, 60, -2.5F, -20.0F, 2.9F, 3, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 78, 27, -3.0F, -32.0F, -8.5F, 4, 2, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 20, -3.0F, -34.0F, 0.25F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 121, 63, -2.5F, -35.7F, 0.8F, 3, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 130, 19, -0.1F, -32.0F, -6.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 129, 44, -2.9F, -32.0F, -6.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 161, 81, -2.499F, -27.5F, -16.5F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 121, -2.3F, -37.9F, -15.5F, 2, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 132, 72, -3.0F, -34.7F, -28.4F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 131, 0.0F, -34.7F, -28.4F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 161, 0, -2.999F, -33.8F, -19.4F, 4, 2, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 134, 58, -2.999F, -34.0F, -10.5F, 4, 1, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 148, 33, -3.0F, -33.0F, -10.5F, 4, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 93, -0.299F, -34.0F, -13.4F, 1, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 69, 93, -2.699F, -34.0F, -13.4F, 1, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 99, 102, -2.499F, -31.6F, -16.1F, 3, 4, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 133, 28, -2.0F, -32.3F, -26.8F, 2, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 34, 116, -2.0F, -32.3F, -22.8F, 2, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 117, 137, -2.0F, -32.5F, -23.8F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 46, 159, -2.8F, -34.0F, -28.4F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 103, 158, -0.2F, -34.0F, -28.4F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 117, 135, -2.5F, -33.2F, -27.4F, 3, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 45, -2.6F, -37.6F, -15.5F, 1, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 88, 115, -2.0F, -35.0F, -29.0F, 2, 2, 17, -0.3F, false));

		gun31_r1 = new ModelRenderer(this);
		gun31_r1.setRotationPoint(-2.0F, -37.3F, -28.8F);
		gun.addChild(gun31_r1);
		setRotationAngle(gun31_r1, -0.0372F, 0.0F, 0.0F);
		gun31_r1.cubeList.add(new ModelBox(gun31_r1, 0, 116, 0.0F, 0.0F, 0.0F, 2, 2, 17, 0.0F, false));

		gun110_r1 = new ModelRenderer(this);
		gun110_r1.setRotationPoint(1.0F, -33.7F, -28.4F);
		gun.addChild(gun110_r1);
		setRotationAngle(gun110_r1, 0.0F, 0.0F, 0.9774F);
		gun110_r1.cubeList.add(new ModelBox(gun110_r1, 145, 159, -1.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun109_r1 = new ModelRenderer(this);
		gun109_r1.setRotationPoint(-3.0F, -33.7F, -28.4F);
		gun.addChild(gun109_r1);
		setRotationAngle(gun109_r1, 0.0F, 0.0F, -0.9774F);
		gun109_r1.cubeList.add(new ModelBox(gun109_r1, 160, 67, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun113_r1 = new ModelRenderer(this);
		gun113_r1.setRotationPoint(-1.3F, -32.2F, -27.4F);
		gun.addChild(gun113_r1);
		setRotationAngle(gun113_r1, 0.0F, 0.0F, -0.7854F);
		gun113_r1.cubeList.add(new ModelBox(gun113_r1, 161, 133, -1.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun112_r1 = new ModelRenderer(this);
		gun112_r1.setRotationPoint(0.7F, -32.2F, -27.4F);
		gun.addChild(gun112_r1);
		setRotationAngle(gun112_r1, 0.0F, 0.0F, -0.7854F);
		gun112_r1.cubeList.add(new ModelBox(gun112_r1, 0, 162, -1.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun111_r1 = new ModelRenderer(this);
		gun111_r1.setRotationPoint(0.8F, -33.0F, -28.4F);
		gun.addChild(gun111_r1);
		setRotationAngle(gun111_r1, 0.0F, 0.0F, -0.7854F);
		gun111_r1.cubeList.add(new ModelBox(gun111_r1, 15, 158, -1.0F, -1.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun110_r2 = new ModelRenderer(this);
		gun110_r2.setRotationPoint(-2.8F, -33.0F, -28.4F);
		gun.addChild(gun110_r2);
		setRotationAngle(gun110_r2, 0.0F, 0.0F, -0.7854F);
		gun110_r2.cubeList.add(new ModelBox(gun110_r2, 35, 158, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun111_r2 = new ModelRenderer(this);
		gun111_r2.setRotationPoint(0.0F, -31.53F, -27.8F);
		gun.addChild(gun111_r2);
		setRotationAngle(gun111_r2, 0.6632F, 0.0F, 0.0F);
		gun111_r2.cubeList.add(new ModelBox(gun111_r2, 137, 62, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun110_r3 = new ModelRenderer(this);
		gun110_r3.setRotationPoint(0.0F, -31.3F, -26.8F);
		gun.addChild(gun110_r3);
		setRotationAngle(gun110_r3, 1.3439F, 0.0F, 0.0F);
		gun110_r3.cubeList.add(new ModelBox(gun110_r3, 137, 67, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun111_r3 = new ModelRenderer(this);
		gun111_r3.setRotationPoint(1.501F, -31.2F, -19.5F);
		gun.addChild(gun111_r3);
		setRotationAngle(gun111_r3, 1.5184F, 0.0F, 0.0F);
		gun111_r3.cubeList.add(new ModelBox(gun111_r3, 32, 0, -4.001F, 0.0F, 0.0F, 3, 11, 1, 0.0F, false));

		gun110_r4 = new ModelRenderer(this);
		gun110_r4.setRotationPoint(1.001F, -31.8F, -19.4F);
		gun.addChild(gun110_r4);
		setRotationAngle(gun110_r4, 1.501F, 0.0F, 0.0F);
		gun110_r4.cubeList.add(new ModelBox(gun110_r4, 93, 78, -4.001F, 0.0F, 0.0F, 4, 6, 1, -0.002F, false));

		gun111_r4 = new ModelRenderer(this);
		gun111_r4.setRotationPoint(-2.999F, -31.8F, -19.4F);
		gun.addChild(gun111_r4);
		setRotationAngle(gun111_r4, 0.0F, -0.7854F, 0.0F);
		gun111_r4.cubeList.add(new ModelBox(gun111_r4, 44, 141, 0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun110_r5 = new ModelRenderer(this);
		gun110_r5.setRotationPoint(1.001F, -31.8F, -19.4F);
		gun.addChild(gun110_r5);
		setRotationAngle(gun110_r5, 0.0F, -0.7854F, 0.0F);
		gun110_r5.cubeList.add(new ModelBox(gun110_r5, 141, 44, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun111_r5 = new ModelRenderer(this);
		gun111_r5.setRotationPoint(0.501F, -29.8F, -15.6F);
		gun.addChild(gun111_r5);
		setRotationAngle(gun111_r5, 0.8727F, 0.0F, 0.0F);
		gun111_r5.cubeList.add(new ModelBox(gun111_r5, 132, 111, -3.002F, -2.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun111_r6 = new ModelRenderer(this);
		gun111_r6.setRotationPoint(1.101F, -32.85F, -7.5F);
		gun.addChild(gun111_r6);
		setRotationAngle(gun111_r6, 0.0F, 0.0F, 0.192F);
		gun111_r6.cubeList.add(new ModelBox(gun111_r6, 134, 122, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(-3.0F, -30.9F, -10.7F);
		gun.addChild(gun39_r1);
		setRotationAngle(gun39_r1, -0.1222F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 0, 24, 0.0F, -2.0F, 0.0F, 4, 2, 3, -0.001F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(-3.0F, -30.9F, -10.7F);
		gun.addChild(gun38_r1);
		setRotationAngle(gun38_r1, 1.8218F, 0.0F, 0.0F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 64, 20, 0.0F, 0.0F, 0.0F, 4, 1, 3, -0.002F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-3.0F, -30.9F, -13.5F);
		gun.addChild(gun37_r1);
		setRotationAngle(gun37_r1, 1.8218F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 64, 27, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun93_r1 = new ModelRenderer(this);
		gun93_r1.setRotationPoint(0.5F, -27.5F, -13.6F);
		gun.addChild(gun93_r1);
		setRotationAngle(gun93_r1, -0.5934F, 0.0F, 0.0F);
		gun93_r1.cubeList.add(new ModelBox(gun93_r1, 70, 133, -3.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun92_r1 = new ModelRenderer(this);
		gun92_r1.setRotationPoint(0.5F, -27.5F, -16.5F);
		gun.addChild(gun92_r1);
		setRotationAngle(gun92_r1, -0.4538F, 0.0F, 0.0F);
		gun92_r1.cubeList.add(new ModelBox(gun92_r1, 133, 35, -3.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun92_r2 = new ModelRenderer(this);
		gun92_r2.setRotationPoint(0.501F, -26.5F, -9.5F);
		gun.addChild(gun92_r2);
		setRotationAngle(gun92_r2, 2.0246F, 0.0F, 0.0F);
		gun92_r2.cubeList.add(new ModelBox(gun92_r2, 122, 53, -3.0F, 0.0F, 0.0F, 3, 2, 1, -0.002F, false));

		gun141_r1 = new ModelRenderer(this);
		gun141_r1.setRotationPoint(-2.0F, -29.5F, -10.0F);
		gun.addChild(gun141_r1);
		setRotationAngle(gun141_r1, 3.0356F, 0.0F, 0.0F);
		gun141_r1.cubeList.add(new ModelBox(gun141_r1, 135, 14, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun140_r1 = new ModelRenderer(this);
		gun140_r1.setRotationPoint(-2.0F, -29.5F, -10.0F);
		gun.addChild(gun140_r1);
		setRotationAngle(gun140_r1, -2.3051F, 0.0F, 0.0F);
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 124, 0, 0.0F, 0.0F, 0.0F, 2, 1, 2, -0.001F, false));

		gun157_r1 = new ModelRenderer(this);
		gun157_r1.setRotationPoint(-0.2F, -31.3F, -12.3F);
		gun.addChild(gun157_r1);
		setRotationAngle(gun157_r1, 1.8218F, 0.0F, 0.0F);
		gun157_r1.cubeList.add(new ModelBox(gun157_r1, 135, 10, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun157_r1.cubeList.add(new ModelBox(gun157_r1, 15, 135, -2.6F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun10_r1 = new ModelRenderer(this);
		gun10_r1.setRotationPoint(1.0F, -30.0F, -8.5F);
		gun.addChild(gun10_r1);
		setRotationAngle(gun10_r1, -0.5585F, 0.0F, 0.0F);
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 93, 90, -4.0F, -1.0F, 0.0F, 4, 1, 1, -0.001F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(1.0F, -31.7F, -1.4F);
		gun.addChild(gun12_r1);
		setRotationAngle(gun12_r1, -1.0647F, 0.0F, 0.0F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 132, 105, -4.0F, -3.0F, -1.0F, 4, 3, 1, -0.003F, false));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(1.0F, -33.0F, 2.25F);
		gun.addChild(gun13_r1);
		setRotationAngle(gun13_r1, 0.1745F, 0.0F, 0.0F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 85, 58, -4.001F, -1.0F, -2.0F, 4, 1, 2, 0.0F, false));

		gun13_r2 = new ModelRenderer(this);
		gun13_r2.setRotationPoint(1.0F, -34.0F, 2.25F);
		gun.addChild(gun13_r2);
		setRotationAngle(gun13_r2, 1.0123F, 0.0F, 0.0F);
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 62, 90, -4.0F, -1.0F, -1.0F, 4, 1, 1, -0.001F, false));

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(0.5F, -31.0F, -0.45F);
		gun.addChild(gun14_r1);
		setRotationAngle(gun14_r1, 0.1396F, 0.0F, 0.0F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 35, 104, -2.999F, 0.0F, -2.0F, 3, 4, 2, 0.0F, false));

		gun13_r3 = new ModelRenderer(this);
		gun13_r3.setRotationPoint(0.5F, -33.0F, 2.25F);
		gun.addChild(gun13_r3);
		setRotationAngle(gun13_r3, 0.5236F, 0.0F, 0.0F);
		gun13_r3.cubeList.add(new ModelBox(gun13_r3, 76, 58, -3.0F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(0.5F, -30.0F, -0.8F);
		gun.addChild(gun11_r1);
		setRotationAngle(gun11_r1, -0.576F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 128, 127, -3.001F, -3.0F, -2.0F, 3, 3, 2, 0.0F, false));

		gun10_r2 = new ModelRenderer(this);
		gun10_r2.setRotationPoint(1.0F, -30.0F, -1.8F);
		gun.addChild(gun10_r2);
		setRotationAngle(gun10_r2, -0.576F, 0.0F, 0.0F);
		gun10_r2.cubeList.add(new ModelBox(gun10_r2, 102, 28, -4.0F, -3.0F, -2.0F, 4, 3, 2, -0.002F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-2.5F, -17.5F, -4.8F);
		gun.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 0.8029F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 116, 14, 0.001F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun11_r2 = new ModelRenderer(this);
		gun11_r2.setRotationPoint(1.001F, -20.0F, 2.9F);
		gun.addChild(gun11_r2);
		setRotationAngle(gun11_r2, -1.0996F, 0.0F, 0.0F);
		gun11_r2.cubeList.add(new ModelBox(gun11_r2, 161, 111, -4.0F, 0.0F, -6.0F, 4, 1, 6, 0.0F, false));

		gun12_r2 = new ModelRenderer(this);
		gun12_r2.setRotationPoint(0.501F, -20.0F, 3.9F);
		gun.addChild(gun12_r2);
		setRotationAngle(gun12_r2, 0.4712F, 0.0F, 0.0F);
		gun12_r2.cubeList.add(new ModelBox(gun12_r2, 51, 48, -3.0F, -9.0F, -1.0F, 3, 9, 1, 0.0F, false));

		gun12_r3 = new ModelRenderer(this);
		gun12_r3.setRotationPoint(0.501F, -18.0F, 3.9F);
		gun.addChild(gun12_r3);
		setRotationAngle(gun12_r3, -0.7854F, 0.0F, 0.0F);
		gun12_r3.cubeList.add(new ModelBox(gun12_r3, 132, 101, -3.0F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

		gun13_r4 = new ModelRenderer(this);
		gun13_r4.setRotationPoint(-1.699F, -17.8F, 2.5F);
		gun.addChild(gun13_r4);
		setRotationAngle(gun13_r4, -0.4014F, 0.0F, 0.0F);
		gun13_r4.cubeList.add(new ModelBox(gun13_r4, 111, 148, -1.001F, 0.0F, -1.0F, 1, 1, 1, 0.3F, false));
		gun13_r4.cubeList.add(new ModelBox(gun13_r4, 148, 111, 1.399F, 0.0F, -1.0F, 1, 1, 1, 0.3F, false));

		gun10_r3 = new ModelRenderer(this);
		gun10_r3.setRotationPoint(-5.1F, -31.45F, -8.8F);
		gun.addChild(gun10_r3);
		setRotationAngle(gun10_r3, 0.3543F, 0.0F, 0.0F);
		gun10_r3.cubeList.add(new ModelBox(gun10_r3, 115, 148, 2.0F, 3.0F, 1.0F, 1, 1, 1, 0.0F, false));

		gun9_r2 = new ModelRenderer(this);
		gun9_r2.setRotationPoint(-1.9F, -31.35F, -8.6F);
		gun.addChild(gun9_r2);
		setRotationAngle(gun9_r2, 0.3543F, 0.0F, 0.0F);
		gun9_r2.cubeList.add(new ModelBox(gun9_r2, 39, 32, 2.0F, 3.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(-2.3F, -31.2F, -9.0F);
		gun.addChild(gun8_r1);
		setRotationAngle(gun8_r1, 0.3543F, 0.0F, 0.0F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 40, 141, 2.0F, 3.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(-2.5F, -30.7F, -9.2F);
		gun.addChild(gun7_r1);
		setRotationAngle(gun7_r1, 0.3543F, 0.0F, 0.0F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 0, 93, 0.0F, 0.0F, 0.0F, 3, 14, 6, 0.0F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(-3.0F, -30.0F, -8.0F);
		gun.addChild(gun6_r1);
		setRotationAngle(gun6_r1, 0.3718F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 64, 32, 0.0F, 0.0F, 0.0F, 4, 14, 6, 0.0F, false));

		gun145_r1 = new ModelRenderer(this);
		gun145_r1.setRotationPoint(-2.6F, -30.0F, -5.8F);
		gun.addChild(gun145_r1);
		setRotationAngle(gun145_r1, 0.0F, 0.0F, 0.7854F);
		gun145_r1.cubeList.add(new ModelBox(gun145_r1, 128, 122, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun145_r2 = new ModelRenderer(this);
		gun145_r2.setRotationPoint(0.5F, -33.3F, -7.95F);
		gun.addChild(gun145_r2);
		setRotationAngle(gun145_r2, 0.0F, 0.0F, 0.7854F);
		gun145_r2.cubeList.add(new ModelBox(gun145_r2, 59, 115, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun144_r1 = new ModelRenderer(this);
		gun144_r1.setRotationPoint(0.6F, -30.0F, -5.8F);
		gun.addChild(gun144_r1);
		setRotationAngle(gun144_r1, 0.0F, 0.0F, 0.7854F);
		gun144_r1.cubeList.add(new ModelBox(gun144_r1, 40, 131, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		G19slide = new QRenderer(this);
		G19slide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G19slide.cubeList.add(new ModelBox(G19slide, 120, 103, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 16, 15, -2.3F, -37.5F, -28.499F, 2, 5, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 40, 0, -0.7F, -37.5F, -28.501F, 1, 5, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 15, 62, 0.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 47, 32, -3.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 116, 28, 0.101F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 116, 7, -3.099F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 145, 111, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 0, 62, -0.6F, -38.101F, -28.5F, 1, 1, 30, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 90, 28, 0.2F, -37.501F, -28.5F, 1, 1, 24, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 130, 133, -3.2F, -37.501F, -28.5F, 1, 1, 13, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 142, 5, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 142, 2, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 89, 102, -3.2F, -37.501F, -7.5F, 1, 2, 3, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 64, 0, 0.201F, -37.001F, -28.5F, 1, 3, 24, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 32, 32, -3.199F, -37.001F, -28.5F, 1, 3, 13, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 12, 93, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 139, 141, -3.099F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 135, 141, -1.5F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 109, 141, 0.101F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 84, 48, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 135, 5, 0.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 4, 135, -3.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 135, 0, -3.45F, -37.75F, -2.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 0, 135, 0.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 134, 58, 0.45F, -37.75F, -2.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 105, 134, -3.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 101, 134, 0.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 93, 134, -3.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 89, 134, 0.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 134, 63, -3.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 63, 149, -3.199F, -36.001F, -15.5F, 1, 2, 11, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 103, 58, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 141, 108, -0.6F, -38.1F, 1.002F, 1, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 62, 136, -2.4F, -38.099F, 1.003F, 2, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 32, 16, -2.4F, -38.1F, -28.5F, 2, 1, 13, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 78, 141, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 46, 131, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));

		slide56_r1 = new ModelRenderer(this);
		slide56_r1.setRotationPoint(-2.4F, -38.1F, -28.5F);
		G19slide.addChild(slide56_r1);
		setRotationAngle(slide56_r1, 0.0F, 0.0F, -0.6545F);
		slide56_r1.cubeList.add(new ModelBox(slide56_r1, 148, 14, -1.0F, 0.0F, 18.0F, 1, 1, 12, -0.001F, false));
		slide56_r1.cubeList.add(new ModelBox(slide56_r1, 55, 133, -1.0F, 0.0F, 0.0F, 1, 1, 13, -0.001F, false));
		slide56_r1.cubeList.add(new ModelBox(slide56_r1, 141, 85, -1.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide54_r1 = new ModelRenderer(this);
		slide54_r1.setRotationPoint(0.4F, -38.1F, -28.5F);
		G19slide.addChild(slide54_r1);
		setRotationAngle(slide54_r1, 0.0F, 0.0F, 0.6545F);
		slide54_r1.cubeList.add(new ModelBox(slide54_r1, 32, 32, 0.0F, 0.0F, 0.0F, 1, 1, 30, 0.0F, false));
		slide54_r1.cubeList.add(new ModelBox(slide54_r1, 141, 104, 0.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide23_r1 = new ModelRenderer(this);
		slide23_r1.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G19slide.addChild(slide23_r1);
		setRotationAngle(slide23_r1, -0.7854F, 0.0F, 0.0F);
		slide23_r1.cubeList.add(new ModelBox(slide23_r1, 54, 127, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r1 = new ModelRenderer(this);
		slide22_r1.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G19slide.addChild(slide22_r1);
		setRotationAngle(slide22_r1, -0.7854F, 0.0F, 0.0F);
		slide22_r1.cubeList.add(new ModelBox(slide22_r1, 129, 49, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r1 = new ModelRenderer(this);
		slide21_r1.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G19slide.addChild(slide21_r1);
		setRotationAngle(slide21_r1, -0.7854F, 0.0F, 0.0F);
		slide21_r1.cubeList.add(new ModelBox(slide21_r1, 70, 130, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r2 = new ModelRenderer(this);
		slide21_r2.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G19slide.addChild(slide21_r2);
		setRotationAngle(slide21_r2, -0.7854F, 0.0F, 0.0F);
		slide21_r2.cubeList.add(new ModelBox(slide21_r2, 78, 130, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide20_r1 = new ModelRenderer(this);
		slide20_r1.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G19slide.addChild(slide20_r1);
		setRotationAngle(slide20_r1, -0.7854F, 0.0F, 0.0F);
		slide20_r1.cubeList.add(new ModelBox(slide20_r1, 86, 130, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		G19razorbackbody = new QRenderer(this);
		G19razorbackbody.setRotationPoint(0.0F, 24.0F, 0.0F);
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 112, 83, -2.999F, -31.0F, -6.8F, 4, 1, 4, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 111, 110, -2.5F, -17.5F, -4.8F, 3, 1, 2, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 156, 159, -3.0F, -19.5F, -3.7F, 4, 3, 6, -0.002F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 35, 110, -2.999F, -20.0F, 1.9F, 4, 2, 1, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 110, 53, -2.5F, -20.0F, 2.9F, 3, 2, 1, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 76, 52, -3.0F, -32.0F, -8.5F, 4, 2, 2, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 44, 83, -3.0F, -34.0F, 0.25F, 4, 1, 2, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 99, 107, -2.5F, -35.7F, 0.8F, 3, 2, 1, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 87, 124, -0.1F, -32.0F, -6.5F, 1, 1, 4, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 34, 121, -2.9F, -32.0F, -6.5F, 1, 1, 4, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 160, 103, -2.499F, -27.5F, -16.5F, 3, 1, 7, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 113, 53, -2.3F, -37.9F, -15.5F, 2, 2, 5, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 111, 119, -3.0F, -34.7F, -28.4F, 1, 1, 15, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 116, 28, 0.0F, -34.7F, -28.4F, 1, 1, 15, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 160, 146, -2.999F, -33.8F, -19.4F, 4, 2, 6, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 93, 78, -2.999F, -34.0F, -10.5F, 4, 1, 11, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 46, 147, -3.0F, -33.0F, -10.5F, 4, 1, 10, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 93, 67, -0.299F, -34.0F, -13.4F, 1, 3, 3, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 58, 93, -2.699F, -34.0F, -13.4F, 1, 3, 3, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 99, 96, -2.499F, -31.6F, -16.1F, 3, 4, 1, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 93, 124, -2.0F, -32.3F, -26.8F, 2, 1, 3, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 0, 76, -2.0F, -32.3F, -22.8F, 2, 1, 4, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 90, 32, -2.0F, -32.5F, -23.8F, 2, 1, 1, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 134, 157, -2.8F, -34.0F, -28.4F, 1, 1, 9, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 149, 70, -0.2F, -34.0F, -28.4F, 1, 1, 9, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 15, 135, -2.5F, -33.2F, -27.4F, 3, 1, 8, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 32, 32, -2.6F, -37.6F, -15.5F, 1, 2, 5, 0.0F, false));
		G19razorbackbody.cubeList.add(new ModelBox(G19razorbackbody, 111, 98, -2.0F, -35.0F, -29.0F, 2, 2, 17, -0.3F, false));

		gun32_r1 = new ModelRenderer(this);
		gun32_r1.setRotationPoint(-2.0F, -37.3F, -28.8F);
		G19razorbackbody.addChild(gun32_r1);
		setRotationAngle(gun32_r1, -0.0372F, 0.0F, 0.0F);
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 113, 53, 0.0F, 0.0F, 0.0F, 2, 2, 17, 0.0F, false));

		gun111_r7 = new ModelRenderer(this);
		gun111_r7.setRotationPoint(1.0F, -33.7F, -28.4F);
		G19razorbackbody.addChild(gun111_r7);
		setRotationAngle(gun111_r7, 0.0F, 0.0F, 0.9774F);
		gun111_r7.cubeList.add(new ModelBox(gun111_r7, 76, 148, -1.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun110_r6 = new ModelRenderer(this);
		gun110_r6.setRotationPoint(-3.0F, -33.7F, -28.4F);
		G19razorbackbody.addChild(gun110_r6);
		setRotationAngle(gun110_r6, 0.0F, 0.0F, -0.9774F);
		gun110_r6.cubeList.add(new ModelBox(gun110_r6, 100, 148, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun114_r1 = new ModelRenderer(this);
		gun114_r1.setRotationPoint(-1.3F, -32.2F, -27.4F);
		G19razorbackbody.addChild(gun114_r1);
		setRotationAngle(gun114_r1, 0.0F, 0.0F, -0.7854F);
		gun114_r1.cubeList.add(new ModelBox(gun114_r1, 69, 93, -1.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun113_r2 = new ModelRenderer(this);
		gun113_r2.setRotationPoint(0.7F, -32.2F, -27.4F);
		G19razorbackbody.addChild(gun113_r2);
		setRotationAngle(gun113_r2, 0.0F, 0.0F, -0.7854F);
		gun113_r2.cubeList.add(new ModelBox(gun113_r2, 89, 93, -1.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun112_r2 = new ModelRenderer(this);
		gun112_r2.setRotationPoint(0.8F, -33.0F, -28.4F);
		G19razorbackbody.addChild(gun112_r2);
		setRotationAngle(gun112_r2, 0.0F, 0.0F, -0.7854F);
		gun112_r2.cubeList.add(new ModelBox(gun112_r2, 150, 0, -1.0F, -1.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun111_r8 = new ModelRenderer(this);
		gun111_r8.setRotationPoint(-2.8F, -33.0F, -28.4F);
		G19razorbackbody.addChild(gun111_r8);
		setRotationAngle(gun111_r8, 0.0F, 0.0F, -0.7854F);
		gun111_r8.cubeList.add(new ModelBox(gun111_r8, 153, 57, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun112_r3 = new ModelRenderer(this);
		gun112_r3.setRotationPoint(0.0F, -31.53F, -27.8F);
		G19razorbackbody.addChild(gun112_r3);
		setRotationAngle(gun112_r3, 0.6632F, 0.0F, 0.0F);
		gun112_r3.cubeList.add(new ModelBox(gun112_r3, 95, 58, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun111_r9 = new ModelRenderer(this);
		gun111_r9.setRotationPoint(0.0F, -31.3F, -26.8F);
		G19razorbackbody.addChild(gun111_r9);
		setRotationAngle(gun111_r9, 1.3439F, 0.0F, 0.0F);
		gun111_r9.cubeList.add(new ModelBox(gun111_r9, 108, 21, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun112_r4 = new ModelRenderer(this);
		gun112_r4.setRotationPoint(1.501F, -31.2F, -19.5F);
		G19razorbackbody.addChild(gun112_r4);
		setRotationAngle(gun112_r4, 1.5184F, 0.0F, 0.0F);
		gun112_r4.cubeList.add(new ModelBox(gun112_r4, 17, 31, -4.001F, 0.0F, 0.0F, 3, 11, 1, 0.0F, false));

		gun111_r10 = new ModelRenderer(this);
		gun111_r10.setRotationPoint(1.001F, -31.8F, -19.4F);
		G19razorbackbody.addChild(gun111_r10);
		setRotationAngle(gun111_r10, 1.501F, 0.0F, 0.0F);
		gun111_r10.cubeList.add(new ModelBox(gun111_r10, 0, 81, -4.001F, 0.0F, 0.0F, 4, 6, 1, -0.002F, false));

		gun112_r5 = new ModelRenderer(this);
		gun112_r5.setRotationPoint(-2.999F, -31.8F, -19.4F);
		G19razorbackbody.addChild(gun112_r5);
		setRotationAngle(gun112_r5, 0.0F, -0.7854F, 0.0F);
		gun112_r5.cubeList.add(new ModelBox(gun112_r5, 26, 54, 0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun111_r11 = new ModelRenderer(this);
		gun111_r11.setRotationPoint(1.001F, -31.8F, -19.4F);
		G19razorbackbody.addChild(gun111_r11);
		setRotationAngle(gun111_r11, 0.0F, -0.7854F, 0.0F);
		gun111_r11.cubeList.add(new ModelBox(gun111_r11, 58, 9, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun112_r6 = new ModelRenderer(this);
		gun112_r6.setRotationPoint(0.501F, -29.8F, -15.6F);
		G19razorbackbody.addChild(gun112_r6);
		setRotationAngle(gun112_r6, 0.8727F, 0.0F, 0.0F);
		gun112_r6.cubeList.add(new ModelBox(gun112_r6, 6, 128, -3.002F, -2.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun112_r7 = new ModelRenderer(this);
		gun112_r7.setRotationPoint(1.101F, -32.85F, -7.5F);
		G19razorbackbody.addChild(gun112_r7);
		setRotationAngle(gun112_r7, 0.0F, 0.0F, 0.192F);
		gun112_r7.cubeList.add(new ModelBox(gun112_r7, 32, 63, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(-3.0F, -30.9F, -10.7F);
		G19razorbackbody.addChild(gun40_r1);
		setRotationAngle(gun40_r1, -0.1222F, 0.0F, 0.0F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 16, 9, 0.0F, -2.0F, 0.0F, 4, 2, 3, -0.001F, false));

		gun39_r2 = new ModelRenderer(this);
		gun39_r2.setRotationPoint(-3.0F, -30.9F, -10.7F);
		G19razorbackbody.addChild(gun39_r2);
		setRotationAngle(gun39_r2, 1.8218F, 0.0F, 0.0F);
		gun39_r2.cubeList.add(new ModelBox(gun39_r2, 47, 41, 0.0F, 0.0F, 0.0F, 4, 1, 3, -0.002F, false));

		gun38_r2 = new ModelRenderer(this);
		gun38_r2.setRotationPoint(-3.0F, -30.9F, -13.5F);
		G19razorbackbody.addChild(gun38_r2);
		setRotationAngle(gun38_r2, 1.8218F, 0.0F, 0.0F);
		gun38_r2.cubeList.add(new ModelBox(gun38_r2, 15, 54, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun94_r1 = new ModelRenderer(this);
		gun94_r1.setRotationPoint(0.5F, -27.5F, -13.6F);
		G19razorbackbody.addChild(gun94_r1);
		setRotationAngle(gun94_r1, -0.5934F, 0.0F, 0.0F);
		gun94_r1.cubeList.add(new ModelBox(gun94_r1, 100, 53, -3.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun93_r2 = new ModelRenderer(this);
		gun93_r2.setRotationPoint(0.5F, -27.5F, -16.5F);
		G19razorbackbody.addChild(gun93_r2);
		setRotationAngle(gun93_r2, -0.4538F, 0.0F, 0.0F);
		gun93_r2.cubeList.add(new ModelBox(gun93_r2, 111, 90, -3.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun93_r3 = new ModelRenderer(this);
		gun93_r3.setRotationPoint(0.501F, -26.5F, -9.5F);
		G19razorbackbody.addChild(gun93_r3);
		setRotationAngle(gun93_r3, 2.0246F, 0.0F, 0.0F);
		gun93_r3.cubeList.add(new ModelBox(gun93_r3, 79, 107, -3.0F, 0.0F, 0.0F, 3, 2, 1, -0.002F, false));

		gun142_r1 = new ModelRenderer(this);
		gun142_r1.setRotationPoint(-2.0F, -29.5F, -10.0F);
		G19razorbackbody.addChild(gun142_r1);
		setRotationAngle(gun142_r1, 3.0356F, 0.0F, 0.0F);
		gun142_r1.cubeList.add(new ModelBox(gun142_r1, 58, 63, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun141_r2 = new ModelRenderer(this);
		gun141_r2.setRotationPoint(-2.0F, -29.5F, -10.0F);
		G19razorbackbody.addChild(gun141_r2);
		setRotationAngle(gun141_r2, -2.3051F, 0.0F, 0.0F);
		gun141_r2.cubeList.add(new ModelBox(gun141_r2, 89, 107, 0.0F, 0.0F, 0.0F, 2, 1, 2, -0.001F, false));

		gun158_r1 = new ModelRenderer(this);
		gun158_r1.setRotationPoint(-0.2F, -31.3F, -12.3F);
		G19razorbackbody.addChild(gun158_r1);
		setRotationAngle(gun158_r1, 1.8218F, 0.0F, 0.0F);
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 64, 0, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 64, 3, -2.6F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun11_r3 = new ModelRenderer(this);
		gun11_r3.setRotationPoint(1.0F, -30.0F, -8.5F);
		G19razorbackbody.addChild(gun11_r3);
		setRotationAngle(gun11_r3, -0.5585F, 0.0F, 0.0F);
		gun11_r3.cubeList.add(new ModelBox(gun11_r3, 10, 90, -3.999F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun13_r5 = new ModelRenderer(this);
		gun13_r5.setRotationPoint(1.0F, -31.7F, -1.4F);
		G19razorbackbody.addChild(gun13_r5);
		setRotationAngle(gun13_r5, -1.0647F, 0.0F, 0.0F);
		gun13_r5.cubeList.add(new ModelBox(gun13_r5, 21, 129, -4.0F, -3.0F, -1.0F, 4, 3, 1, -0.003F, false));

		gun14_r2 = new ModelRenderer(this);
		gun14_r2.setRotationPoint(1.0F, -33.0F, 2.25F);
		G19razorbackbody.addChild(gun14_r2);
		setRotationAngle(gun14_r2, 0.1745F, 0.0F, 0.0F);
		gun14_r2.cubeList.add(new ModelBox(gun14_r2, 32, 83, -4.001F, -1.0F, -2.0F, 4, 1, 2, 0.0F, false));

		gun14_r3 = new ModelRenderer(this);
		gun14_r3.setRotationPoint(1.0F, -34.0F, 2.25F);
		G19razorbackbody.addChild(gun14_r3);
		setRotationAngle(gun14_r3, 1.0123F, 0.0F, 0.0F);
		gun14_r3.cubeList.add(new ModelBox(gun14_r3, 20, 90, -4.0F, -1.0F, -1.0F, 4, 1, 1, -0.001F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(0.5F, -31.0F, -0.45F);
		G19razorbackbody.addChild(gun15_r1);
		setRotationAngle(gun15_r1, 0.1396F, 0.0F, 0.0F);
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 78, 0, -2.999F, 0.0F, -2.0F, 3, 4, 2, -0.001F, false));

		gun14_r4 = new ModelRenderer(this);
		gun14_r4.setRotationPoint(0.5F, -33.0F, 2.25F);
		G19razorbackbody.addChild(gun14_r4);
		setRotationAngle(gun14_r4, 0.5236F, 0.0F, 0.0F);
		gun14_r4.cubeList.add(new ModelBox(gun14_r4, 15, 71, -3.0F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

		gun12_r4 = new ModelRenderer(this);
		gun12_r4.setRotationPoint(0.5F, -30.0F, -0.8F);
		G19razorbackbody.addChild(gun12_r4);
		setRotationAngle(gun12_r4, -0.576F, 0.0F, 0.0F);
		gun12_r4.cubeList.add(new ModelBox(gun12_r4, 109, 124, -3.001F, -3.0F, -2.0F, 3, 3, 2, 0.0F, false));

		gun11_r4 = new ModelRenderer(this);
		gun11_r4.setRotationPoint(1.0F, -30.0F, -1.8F);
		G19razorbackbody.addChild(gun11_r4);
		setRotationAngle(gun11_r4, -0.576F, 0.0F, 0.0F);
		gun11_r4.cubeList.add(new ModelBox(gun11_r4, 69, 81, -4.0F, -3.0F, -2.0F, 4, 3, 2, -0.002F, false));

		gun10_r4 = new ModelRenderer(this);
		gun10_r4.setRotationPoint(-2.5F, -17.5F, -4.8F);
		G19razorbackbody.addChild(gun10_r4);
		setRotationAngle(gun10_r4, 0.8029F, 0.0F, 0.0F);
		gun10_r4.cubeList.add(new ModelBox(gun10_r4, 110, 0, 0.001F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun12_r5 = new ModelRenderer(this);
		gun12_r5.setRotationPoint(1.001F, -20.0F, 2.9F);
		G19razorbackbody.addChild(gun12_r5);
		setRotationAngle(gun12_r5, -1.0996F, 0.0F, 0.0F);
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 91, 160, -4.0F, 0.0F, -6.0F, 4, 1, 6, 0.0F, false));

		gun13_r6 = new ModelRenderer(this);
		gun13_r6.setRotationPoint(0.501F, -20.0F, 3.9F);
		G19razorbackbody.addChild(gun13_r6);
		setRotationAngle(gun13_r6, 0.4712F, 0.0F, 0.0F);
		gun13_r6.cubeList.add(new ModelBox(gun13_r6, 49, 16, -3.0F, -9.0F, -1.0F, 3, 9, 1, 0.0F, false));

		gun13_r7 = new ModelRenderer(this);
		gun13_r7.setRotationPoint(0.501F, -18.0F, 3.9F);
		G19razorbackbody.addChild(gun13_r7);
		setRotationAngle(gun13_r7, -0.7854F, 0.0F, 0.0F);
		gun13_r7.cubeList.add(new ModelBox(gun13_r7, 131, 74, -3.0F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

		gun14_r5 = new ModelRenderer(this);
		gun14_r5.setRotationPoint(-1.699F, -17.8F, 2.5F);
		G19razorbackbody.addChild(gun14_r5);
		setRotationAngle(gun14_r5, -0.4014F, 0.0F, 0.0F);
		gun14_r5.cubeList.add(new ModelBox(gun14_r5, 72, 90, -1.001F, 0.0F, -1.0F, 1, 1, 1, 0.3F, false));
		gun14_r5.cubeList.add(new ModelBox(gun14_r5, 97, 48, 1.399F, 0.0F, -1.0F, 1, 1, 1, 0.3F, false));

		gun11_r5 = new ModelRenderer(this);
		gun11_r5.setRotationPoint(-5.1F, -31.45F, -8.8F);
		G19razorbackbody.addChild(gun11_r5);
		setRotationAngle(gun11_r5, 0.3543F, 0.0F, 0.0F);
		gun11_r5.cubeList.add(new ModelBox(gun11_r5, 98, 53, 2.0F, 3.0F, 1.0F, 1, 1, 1, 0.0F, false));

		gun10_r5 = new ModelRenderer(this);
		gun10_r5.setRotationPoint(-1.9F, -31.35F, -8.6F);
		G19razorbackbody.addChild(gun10_r5);
		setRotationAngle(gun10_r5, 0.3543F, 0.0F, 0.0F);
		gun10_r5.cubeList.add(new ModelBox(gun10_r5, 39, 23, 2.0F, 3.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun9_r3 = new ModelRenderer(this);
		gun9_r3.setRotationPoint(-2.3F, -31.2F, -9.0F);
		G19razorbackbody.addChild(gun9_r3);
		setRotationAngle(gun9_r3, 0.3543F, 0.0F, 0.0F);
		gun9_r3.cubeList.add(new ModelBox(gun9_r3, 58, 41, 2.0F, 3.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun8_r2 = new ModelRenderer(this);
		gun8_r2.setRotationPoint(-2.5F, -30.7F, -9.2F);
		G19razorbackbody.addChild(gun8_r2);
		setRotationAngle(gun8_r2, 0.3543F, 0.0F, 0.0F);
		gun8_r2.cubeList.add(new ModelBox(gun8_r2, 90, 28, 0.0F, 0.0F, 0.0F, 3, 14, 6, 0.0F, false));

		gun7_r2 = new ModelRenderer(this);
		gun7_r2.setRotationPoint(-3.0F, -30.0F, -8.0F);
		G19razorbackbody.addChild(gun7_r2);
		setRotationAngle(gun7_r2, 0.3718F, 0.0F, 0.0F);
		gun7_r2.cubeList.add(new ModelBox(gun7_r2, 64, 0, 0.0F, 0.0F, 0.0F, 4, 14, 6, 0.0F, false));

		gun146_r1 = new ModelRenderer(this);
		gun146_r1.setRotationPoint(-2.6F, -30.0F, -5.8F);
		G19razorbackbody.addChild(gun146_r1);
		setRotationAngle(gun146_r1, 0.0F, 0.0F, 0.7854F);
		gun146_r1.cubeList.add(new ModelBox(gun146_r1, 48, 125, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun146_r2 = new ModelRenderer(this);
		gun146_r2.setRotationPoint(0.5F, -33.3F, -7.95F);
		G19razorbackbody.addChild(gun146_r2);
		setRotationAngle(gun146_r2, 0.0F, 0.0F, 0.7854F);
		gun146_r2.cubeList.add(new ModelBox(gun146_r2, 22, 40, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun145_r3 = new ModelRenderer(this);
		gun145_r3.setRotationPoint(0.6F, -30.0F, -5.8F);
		G19razorbackbody.addChild(gun145_r3);
		setRotationAngle(gun145_r3, 0.0F, 0.0F, 0.7854F);
		gun145_r3.cubeList.add(new ModelBox(gun145_r3, 58, 125, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		G19razorbackslide = new QRenderer(this);
		G19razorbackslide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 117, 120, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 24, 0, -2.3F, -37.5F, -28.499F, 2, 5, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 15, 45, -0.7F, -37.5F, -28.501F, 1, 5, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 69, 93, -3.1F, -36.0F, -16.5F, 1, 2, 18, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 93, 58, 0.1F, -36.0F, -16.5F, 1, 2, 18, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 115, 160, -3.1F, -35.0F, -28.5F, 1, 1, 8, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 26, 158, 0.1F, -35.0F, -28.5F, 1, 1, 8, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 12, 93, -3.1F, -37.0F, -28.5F, 1, 2, 4, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 78, 32, 0.1F, -37.0F, -28.5F, 1, 2, 4, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 128, 117, -3.101F, -35.5F, -20.5F, 1, 1, 4, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 128, 0.099F, -35.5F, -20.5F, 1, 1, 4, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 24, 93, -3.099F, -37.5F, -7.5F, 1, 2, 9, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 116, 0, 0.101F, -37.5F, -15.5F, 1, 2, 17, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 145, 133, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 52, 90, -3.0F, -38.2F, -2.75F, 4, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 111, 97, -2.5F, -38.201F, -4.75F, 3, 1, 5, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 93, -0.6F, -38.101F, -20.5F, 1, 1, 22, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 103, 62, -0.6F, -38.101F, -28.5F, 1, 1, 3, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 109, 117, -0.35F, -38.35F, -25.75F, 1, 1, 6, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 116, 35, -2.65F, -38.351F, -25.75F, 1, 1, 6, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 135, 0, -3.099F, -37.501F, -28.5F, 1, 1, 13, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 70, 134, 0.101F, -37.501F, -28.5F, 1, 1, 13, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 104, 148, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 131, 147, -3.201F, -37.501F, 0.601F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 147, 97, 0.199F, -37.501F, 0.601F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 100, 148, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 141, 22, -3.4F, -37.001F, -7.8F, 1, 2, 1, -0.2F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 139, 0, -3.401F, -37.7F, -7.801F, 1, 2, 1, -0.2F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 34, 121, 0.399F, -37.7F, -7.801F, 1, 2, 1, -0.2F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 103, 67, 0.399F, -37.7F, -10.401F, 1, 1, 3, -0.2F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 91, 148, -3.199F, -37.501F, -16.5F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 147, 33, 0.201F, -37.501F, -16.5F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 112, 78, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 87, 148, -3.099F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 80, 148, -1.5F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 76, 148, 0.101F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 102, 0, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 141, 14, -3.45F, -35.75F, -0.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 44, 138, 0.45F, -35.75F, -0.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 8, 141, -3.45F, -35.75F, -2.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 48, 125, 0.45F, -35.75F, -2.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 131, 140, -3.45F, -35.75F, -1.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 40, 138, 0.45F, -35.75F, -1.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 105, 140, -3.45F, -35.75F, -3.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 100, 124, 0.45F, -35.75F, -3.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 4, 140, -3.45F, -35.75F, -5.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 124, 83, 0.45F, -35.75F, -5.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 140, 47, -3.45F, -35.75F, -4.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 87, 124, 0.45F, -35.75F, -4.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 140, 26, -3.45F, -35.75F, -6.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 124, 78, 0.45F, -35.75F, -6.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 140, -3.45F, -35.75F, -7.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 123, 0.45F, -35.75F, -7.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 139, 138, -3.45F, -35.75F, -21.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 42, 116, 0.45F, -35.75F, -21.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 148, 21, -3.45F, -34.75F, -22.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 47, 147, 0.45F, -34.75F, -22.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 135, 147, -3.45F, -34.75F, -24.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 36, 147, 0.45F, -34.75F, -24.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 146, 147, -3.45F, -34.75F, -23.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 147, 37, 0.45F, -34.75F, -23.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 139, 124, -3.45F, -35.75F, -25.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 34, 116, 0.45F, -35.75F, -25.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 121, 139, -3.45F, -35.75F, -26.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 64, 115, 0.45F, -35.75F, -26.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 117, 139, -3.45F, -35.75F, -27.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 53, 115, 0.45F, -35.75F, -27.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 148, 19, -3.45F, -35.25F, -22.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 40, 147, 0.45F, -35.25F, -22.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 142, 147, -3.45F, -35.25F, -24.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 147, 35, 0.45F, -35.25F, -24.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 148, 15, -3.45F, -35.25F, -23.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 147, 39, 0.45F, -35.25F, -23.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 15, -3.45F, -34.75F, -20.75F, 1, 1, 14, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 0, 0.45F, -34.75F, -20.75F, 1, 1, 14, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 24, 108, -3.451F, -34.75F, -27.25F, 1, 1, 3, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 58, 107, 0.449F, -34.75F, -27.25F, 1, 1, 3, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 32, 39, -3.199F, -36.001F, -16.0F, 1, 1, 5, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 32, 23, 0.201F, -36.001F, -16.0F, 1, 1, 5, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 31, 144, 0.199F, -36.001F, -11.75F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 48, 115, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 67, 148, -0.6F, -38.1F, 1.002F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 29, 137, -2.4F, -38.099F, 1.003F, 2, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 15, 83, -2.4F, -38.1F, -20.5F, 2, 1, 5, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 132, 97, -2.4F, -38.1F, -28.5F, 2, 1, 3, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 85, 141, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 133, 37, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));

		slide59_r1 = new ModelRenderer(this);
		slide59_r1.setRotationPoint(-2.75F, -38.15F, -2.1F);
		G19razorbackslide.addChild(slide59_r1);
		setRotationAngle(slide59_r1, 0.0F, 0.0F, -0.6545F);
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 146, 88, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 145, 139, -0.5F, 0.0F, -2.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 146, 92, -1.0F, 0.0F, -2.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 117, 144, -0.5F, 0.0F, -17.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 145, 14, -0.5F, 0.0F, -21.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 145, 126, -0.5F, 0.0F, -25.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 145, 135, -0.5F, 0.0F, -4.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 144, 111, -1.0F, 0.0F, -17.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 0, 145, -1.0F, 0.0F, -21.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 145, 128, -1.0F, 0.0F, -25.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 146, 113, -1.0F, 0.0F, -4.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 145, 141, -0.5F, 0.0F, 1.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 15, 146, -1.0F, 0.0F, 1.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 19, 146, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 101, 144, -0.5F, 0.0F, -16.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 24, 104, -0.5F, 0.0F, -20.0F, 1, 1, 3, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 145, 121, -0.5F, 0.0F, -24.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 145, 137, -0.5F, 0.0F, -3.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 121, 144, -1.0F, 0.0F, -16.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 103, 71, -1.0F, 0.0F, -20.0F, 1, 1, 3, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 145, 119, -1.0F, 0.0F, -24.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 146, 90, -1.0F, 0.0F, -3.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 125, 144, -0.5F, 0.0F, -23.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 4, 145, -0.5F, 0.0F, -22.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 145, 130, -0.5F, 0.0F, -26.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 145, 133, -0.5F, 0.0F, -5.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 129, 144, -1.0F, 0.0F, -23.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 133, 144, -1.0F, 0.0F, -22.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 145, 124, -1.0F, 0.0F, -26.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 148, 23, -1.0F, 0.0F, -5.0F, 1, 1, 1, -0.25F, false));

		slide70_r1 = new ModelRenderer(this);
		slide70_r1.setRotationPoint(1.55F, -37.53F, -28.1F);
		G19razorbackslide.addChild(slide70_r1);
		setRotationAngle(slide70_r1, 0.0F, 0.0F, 0.6545F);
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 142, 77, -1.5F, 0.0F, 0.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 101, 142, -1.5F, 0.0F, 2.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 4, 143, -1.5F, 0.0F, 4.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 60, 143, -1.5F, 0.0F, 9.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 142, 54, -1.5F, 0.0F, 1.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 92, 142, -1.5F, 0.0F, 3.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 143, 0, -1.5F, 0.0F, 5.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 70, 143, -1.5F, 0.0F, 10.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 74, 143, -1.5F, 0.0F, 21.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 142, 80, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 142, 113, -1.0F, 0.0F, 2.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 47, 143, -1.0F, 0.0F, 4.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 56, 143, -1.0F, 0.0F, 9.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 142, 50, -1.0F, 0.0F, 1.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 88, 142, -1.0F, 0.0F, 3.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 0, 143, -1.0F, 0.0F, 5.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 64, 143, -1.0F, 0.0F, 10.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 108, 143, -1.0F, 0.0F, 21.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 85, 143, -1.5F, 0.0F, 24.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 15, 144, -1.0F, 0.0F, 24.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 19, 144, -1.0F, 0.0F, 26.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 78, 143, -1.5F, 0.0F, 22.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 104, 143, -1.0F, 0.0F, 22.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 143, 82, -1.5F, 0.0F, 23.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 138, 143, -1.0F, 0.0F, 23.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 7, 144, -1.0F, 0.0F, 25.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 143, 72, -1.5F, 0.0F, 27.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 23, 144, -1.0F, 0.0F, 27.0F, 1, 1, 1, -0.25F, false));

		slide57_r1 = new ModelRenderer(this);
		slide57_r1.setRotationPoint(0.4F, -38.1F, -34.75F);
		G19razorbackslide.addChild(slide57_r1);
		setRotationAngle(slide57_r1, 0.0F, 0.0F, 0.6545F);
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 143, 52, 0.0F, -0.001F, 13.0F, 1, 1, 1, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 134, 53, 0.0F, -0.001F, 13.5F, 1, 1, 2, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 134, 117, 0.0F, -0.001F, 18.25F, 1, 1, 2, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 161, 89, 0.0F, 0.0F, 19.75F, 1, 1, 8, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 27, 144, 0.0F, -0.001F, 35.0F, 1, 1, 1, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 148, 29, 0.0F, 0.0F, 35.75F, 1, 1, 1, 0.0F, false));

		slide58_r1 = new ModelRenderer(this);
		slide58_r1.setRotationPoint(0.31F, -38.1F, -28.5F);
		G19razorbackslide.addChild(slide58_r1);
		setRotationAngle(slide58_r1, 0.0F, 0.0F, 0.6545F);
		slide58_r1.cubeList.add(new ModelBox(slide58_r1, 62, 63, 0.0F, -0.001F, 0.0F, 1, 1, 29, 0.0F, false));

		slide57_r2 = new ModelRenderer(this);
		slide57_r2.setRotationPoint(-2.3F, -38.1F, -28.5F);
		G19razorbackslide.addChild(slide57_r2);
		setRotationAngle(slide57_r2, 0.0F, 0.0F, -0.6545F);
		slide57_r2.cubeList.add(new ModelBox(slide57_r2, 134, 44, -1.0F, -0.001F, 0.0F, 1, 1, 13, 0.0F, false));
		slide57_r2.cubeList.add(new ModelBox(slide57_r2, 111, 148, -1.0F, -0.001F, 21.0F, 1, 1, 8, 0.0F, false));

		slide57_r3 = new ModelRenderer(this);
		slide57_r3.setRotationPoint(-2.4F, -38.1F, -8.0F);
		G19razorbackslide.addChild(slide57_r3);
		setRotationAngle(slide57_r3, 0.0F, 0.0F, -0.6545F);
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 145, 143, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 145, 117, -1.0F, -0.001F, -8.5F, 1, 1, 1, 0.0F, false));
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 47, 107, -1.0F, -0.001F, -2.5F, 1, 1, 3, 0.0F, false));
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 7, 146, -1.0F, -0.001F, 8.25F, 1, 1, 1, 0.0F, false));
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 148, 27, -1.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));

		slide16_r1 = new ModelRenderer(this);
		slide16_r1.setRotationPoint(-0.9F, -38.2F, -20.5F);
		G19razorbackslide.addChild(slide16_r1);
		setRotationAngle(slide16_r1, 0.0F, 0.8378F, 0.0F);
		slide16_r1.cubeList.add(new ModelBox(slide16_r1, 142, 8, 0.0F, -0.001F, 0.0F, 1, 1, 1, -0.1F, false));

		slide15_r1 = new ModelRenderer(this);
		slide15_r1.setRotationPoint(-1.1F, -38.2F, -20.5F);
		G19razorbackslide.addChild(slide15_r1);
		setRotationAngle(slide15_r1, 0.0F, -0.8378F, 0.0F);
		slide15_r1.cubeList.add(new ModelBox(slide15_r1, 142, 11, -1.0F, -0.001F, 0.0F, 1, 1, 1, -0.1F, false));

		slide19_r1 = new ModelRenderer(this);
		slide19_r1.setRotationPoint(-3.2F, -36.201F, -10.5F);
		G19razorbackslide.addChild(slide19_r1);
		setRotationAngle(slide19_r1, -1.2915F, 0.0F, 0.0F);
		slide19_r1.cubeList.add(new ModelBox(slide19_r1, 147, 105, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide23_r2 = new ModelRenderer(this);
		slide23_r2.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G19razorbackslide.addChild(slide23_r2);
		setRotationAngle(slide23_r2, -0.7854F, 0.0F, 0.0F);
		slide23_r2.cubeList.add(new ModelBox(slide23_r2, 94, 130, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r2 = new ModelRenderer(this);
		slide22_r2.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G19razorbackslide.addChild(slide22_r2);
		setRotationAngle(slide22_r2, -0.7854F, 0.0F, 0.0F);
		slide22_r2.cubeList.add(new ModelBox(slide22_r2, 109, 130, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r3 = new ModelRenderer(this);
		slide21_r3.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G19razorbackslide.addChild(slide21_r3);
		setRotationAngle(slide21_r3, -0.7854F, 0.0F, 0.0F);
		slide21_r3.cubeList.add(new ModelBox(slide21_r3, 117, 130, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r4 = new ModelRenderer(this);
		slide21_r4.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G19razorbackslide.addChild(slide21_r4);
		setRotationAngle(slide21_r4, -0.7854F, 0.0F, 0.0F);
		slide21_r4.cubeList.add(new ModelBox(slide21_r4, 131, 72, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide20_r2 = new ModelRenderer(this);
		slide20_r2.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G19razorbackslide.addChild(slide20_r2);
		setRotationAngle(slide20_r2, -0.7854F, 0.0F, 0.0F);
		slide20_r2.cubeList.add(new ModelBox(slide20_r2, 133, 33, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide19_r2 = new ModelRenderer(this);
		slide19_r2.setRotationPoint(0.201F, -36.501F, -16.5F);
		G19razorbackslide.addChild(slide19_r2);
		setRotationAngle(slide19_r2, 0.3316F, 0.0F, 0.0F);
		slide19_r2.cubeList.add(new ModelBox(slide19_r2, 51, 147, -0.001F, 0.601F, 0.0F, 1, 1, 1, 0.0F, false));
		slide19_r2.cubeList.add(new ModelBox(slide19_r2, 147, 101, -3.401F, 0.601F, 0.0F, 1, 1, 1, 0.0F, false));
		slide19_r2.cubeList.add(new ModelBox(slide19_r2, 64, 147, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		slide19_r2.cubeList.add(new ModelBox(slide19_r2, 147, 103, -3.4F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide17_r1 = new ModelRenderer(this);
		slide17_r1.setRotationPoint(1.0F, -38.2F, -2.75F);
		G19razorbackslide.addChild(slide17_r1);
		setRotationAngle(slide17_r1, 0.0F, -1.2043F, 0.0F);
		slide17_r1.cubeList.add(new ModelBox(slide17_r1, 70, 136, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide16_r2 = new ModelRenderer(this);
		slide16_r2.setRotationPoint(1.0F, -38.2F, -1.75F);
		G19razorbackslide.addChild(slide16_r2);
		setRotationAngle(slide16_r2, 0.0F, 1.2043F, 0.0F);
		slide16_r2.cubeList.add(new ModelBox(slide16_r2, 76, 136, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide15_r2 = new ModelRenderer(this);
		slide15_r2.setRotationPoint(-3.0F, -38.2F, -1.75F);
		G19razorbackslide.addChild(slide15_r2);
		setRotationAngle(slide15_r2, 0.0F, -1.2043F, 0.0F);
		slide15_r2.cubeList.add(new ModelBox(slide15_r2, 136, 127, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide14_r1 = new ModelRenderer(this);
		slide14_r1.setRotationPoint(-3.0F, -38.2F, -2.75F);
		G19razorbackslide.addChild(slide14_r1);
		setRotationAngle(slide14_r1, 0.0F, 1.2043F, 0.0F);
		slide14_r1.cubeList.add(new ModelBox(slide14_r1, 136, 136, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide15_r3 = new ModelRenderer(this);
		slide15_r3.setRotationPoint(0.0F, -38.3F, -2.95F);
		G19razorbackslide.addChild(slide15_r3);
		setRotationAngle(slide15_r3, 0.0F, -0.5411F, 0.0F);
		slide15_r3.cubeList.add(new ModelBox(slide15_r3, 88, 144, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide14_r2 = new ModelRenderer(this);
		slide14_r2.setRotationPoint(-2.0F, -38.3F, -2.95F);
		G19razorbackslide.addChild(slide14_r2);
		setRotationAngle(slide14_r2, 0.0F, 0.5411F, 0.0F);
		slide14_r2.cubeList.add(new ModelBox(slide14_r2, 92, 144, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide34_r1 = new ModelRenderer(this);
		slide34_r1.setRotationPoint(1.45F, -34.95F, -3.1F);
		G19razorbackslide.addChild(slide34_r1);
		setRotationAngle(slide34_r1, 0.384F, 0.0F, 0.0F);
		slide34_r1.cubeList.add(new ModelBox(slide34_r1, 0, 128, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r1.cubeList.add(new ModelBox(slide34_r1, 29, 139, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r1.cubeList.add(new ModelBox(slide34_r1, 8, 138, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r1.cubeList.add(new ModelBox(slide34_r1, 85, 138, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide34_r2 = new ModelRenderer(this);
		slide34_r2.setRotationPoint(1.45F, -34.95F, -7.1F);
		G19razorbackslide.addChild(slide34_r2);
		setRotationAngle(slide34_r2, 0.384F, 0.0F, 0.0F);
		slide34_r2.cubeList.add(new ModelBox(slide34_r2, 40, 131, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r2.cubeList.add(new ModelBox(slide34_r2, 135, 138, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide34_r3 = new ModelRenderer(this);
		slide34_r3.setRotationPoint(1.45F, -35.95F, -11.1F);
		G19razorbackslide.addChild(slide34_r3);
		setRotationAngle(slide34_r3, -0.384F, 0.0F, 0.0F);
		slide34_r3.cubeList.add(new ModelBox(slide34_r3, 18, 93, -1.0F, -2.0F, 0.0F, 1, 3, 1, -0.25F, false));

		slide33_r1 = new ModelRenderer(this);
		slide33_r1.setRotationPoint(1.45F, -34.95F, -6.1F);
		G19razorbackslide.addChild(slide33_r1);
		setRotationAngle(slide33_r1, 0.384F, 0.0F, 0.0F);
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 130, 19, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 139, 78, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 8, 135, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 70, 138, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide32_r1 = new ModelRenderer(this);
		slide32_r1.setRotationPoint(1.45F, -34.95F, -27.1F);
		G19razorbackslide.addChild(slide32_r1);
		setRotationAngle(slide32_r1, 0.384F, 0.0F, 0.0F);
		slide32_r1.cubeList.add(new ModelBox(slide32_r1, 112, 83, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r1.cubeList.add(new ModelBox(slide32_r1, 139, 82, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r1.cubeList.add(new ModelBox(slide32_r1, 110, 49, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r1.cubeList.add(new ModelBox(slide32_r1, 138, 58, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide33_r2 = new ModelRenderer(this);
		slide33_r2.setRotationPoint(1.45F, -34.95F, -2.1F);
		G19razorbackslide.addChild(slide33_r2);
		setRotationAngle(slide33_r2, 0.384F, 0.0F, 0.0F);
		slide33_r2.cubeList.add(new ModelBox(slide33_r2, 64, 125, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r2.cubeList.add(new ModelBox(slide33_r2, 139, 9, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r2.cubeList.add(new ModelBox(slide33_r2, 15, 138, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r2.cubeList.add(new ModelBox(slide33_r2, 108, 138, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide32_r2 = new ModelRenderer(this);
		slide32_r2.setRotationPoint(1.45F, -34.95F, -5.1F);
		G19razorbackslide.addChild(slide32_r2);
		setRotationAngle(slide32_r2, 0.384F, 0.0F, 0.0F);
		slide32_r2.cubeList.add(new ModelBox(slide32_r2, 129, 44, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r2.cubeList.add(new ModelBox(slide32_r2, 139, 72, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r2.cubeList.add(new ModelBox(slide32_r2, 109, 135, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r2.cubeList.add(new ModelBox(slide32_r2, 74, 138, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide31_r1 = new ModelRenderer(this);
		slide31_r1.setRotationPoint(1.45F, -34.95F, -26.1F);
		G19razorbackslide.addChild(slide31_r1);
		setRotationAngle(slide31_r1, 0.384F, 0.0F, 0.0F);
		slide31_r1.cubeList.add(new ModelBox(slide31_r1, 63, 107, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide31_r1.cubeList.add(new ModelBox(slide31_r1, 89, 139, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide31_r1.cubeList.add(new ModelBox(slide31_r1, 29, 108, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide31_r1.cubeList.add(new ModelBox(slide31_r1, 60, 138, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide42_r1 = new ModelRenderer(this);
		slide42_r1.setRotationPoint(1.45F, -34.95F, -25.1F);
		G19razorbackslide.addChild(slide42_r1);
		setRotationAngle(slide42_r1, 0.384F, 0.0F, 0.0F);
		slide42_r1.cubeList.add(new ModelBox(slide42_r1, 29, 104, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide42_r1.cubeList.add(new ModelBox(slide42_r1, 64, 138, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide42_r1.cubeList.add(new ModelBox(slide42_r1, 52, 107, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide42_r1.cubeList.add(new ModelBox(slide42_r1, 93, 139, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide41_r1 = new ModelRenderer(this);
		slide41_r1.setRotationPoint(1.45F, -34.95F, -21.1F);
		G19razorbackslide.addChild(slide41_r1);
		setRotationAngle(slide41_r1, 0.384F, 0.0F, 0.0F);
		slide41_r1.cubeList.add(new ModelBox(slide41_r1, 27, 121, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide41_r1.cubeList.add(new ModelBox(slide41_r1, 138, 64, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide38_r1 = new ModelRenderer(this);
		slide38_r1.setRotationPoint(1.45F, -34.95F, -4.1F);
		G19razorbackslide.addChild(slide38_r1);
		setRotationAngle(slide38_r1, 0.384F, 0.0F, 0.0F);
		slide38_r1.cubeList.add(new ModelBox(slide38_r1, 131, 137, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide38_r1.cubeList.add(new ModelBox(slide38_r1, 78, 138, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide38_r1.cubeList.add(new ModelBox(slide38_r1, 128, 122, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide38_r1.cubeList.add(new ModelBox(slide38_r1, 139, 52, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide35_r1 = new ModelRenderer(this);
		slide35_r1.setRotationPoint(1.45F, -34.95F, -1.1F);
		G19razorbackslide.addChild(slide35_r1);
		setRotationAngle(slide35_r1, 0.384F, 0.0F, 0.0F);
		slide35_r1.cubeList.add(new ModelBox(slide35_r1, 19, 138, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide35_r1.cubeList.add(new ModelBox(slide35_r1, 138, 120, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide35_r1.cubeList.add(new ModelBox(slide35_r1, 34, 138, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide35_r1.cubeList.add(new ModelBox(slide35_r1, 139, 6, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide35_r2 = new ModelRenderer(this);
		slide35_r2.setRotationPoint(1.45F, -34.95F, 0.9F);
		G19razorbackslide.addChild(slide35_r2);
		setRotationAngle(slide35_r2, 0.384F, 0.0F, 0.0F);
		slide35_r2.cubeList.add(new ModelBox(slide35_r2, 35, 93, -1.001F, -2.75F, 0.0F, 1, 3, 1, -0.25F, false));
		slide35_r2.cubeList.add(new ModelBox(slide35_r2, 41, 93, -4.901F, -2.75F, 0.0F, 1, 3, 1, -0.25F, false));

		slide34_r4 = new ModelRenderer(this);
		slide34_r4.setRotationPoint(1.45F, -34.95F, -0.1F);
		G19razorbackslide.addChild(slide34_r4);
		setRotationAngle(slide34_r4, 0.384F, 0.0F, 0.0F);
		slide34_r4.cubeList.add(new ModelBox(slide34_r4, 56, 138, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r4.cubeList.add(new ModelBox(slide34_r4, 138, 129, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r4.cubeList.add(new ModelBox(slide34_r4, 48, 138, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r4.cubeList.add(new ModelBox(slide34_r4, 139, 3, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide29_r1 = new ModelRenderer(this);
		slide29_r1.setRotationPoint(1.45F, -34.95F, -21.1F);
		G19razorbackslide.addChild(slide29_r1);
		setRotationAngle(slide29_r1, 0.384F, 0.0F, 0.0F);
		slide29_r1.cubeList.add(new ModelBox(slide29_r1, 21, 121, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide29_r1.cubeList.add(new ModelBox(slide29_r1, 139, 97, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide29_r2 = new ModelRenderer(this);
		slide29_r2.setRotationPoint(1.099F, -34.75F, -16.1F);
		G19razorbackslide.addChild(slide29_r2);
		setRotationAngle(slide29_r2, 0.384F, 0.0F, 0.0F);
		slide29_r2.cubeList.add(new ModelBox(slide29_r2, 52, 103, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide29_r2.cubeList.add(new ModelBox(slide29_r2, 63, 103, -4.2F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		slide30_r1 = new ModelRenderer(this);
		slide30_r1.setRotationPoint(-2.101F, -34.35F, -24.7F);
		G19razorbackslide.addChild(slide30_r1);
		setRotationAngle(slide30_r1, 0.384F, 0.0F, 0.0F);
		slide30_r1.cubeList.add(new ModelBox(slide30_r1, 29, 93, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide30_r1.cubeList.add(new ModelBox(slide30_r1, 52, 93, 2.2F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		slide28_r1 = new ModelRenderer(this);
		slide28_r1.setRotationPoint(1.099F, -34.75F, -21.2F);
		G19razorbackslide.addChild(slide28_r1);
		setRotationAngle(slide28_r1, 0.384F, 0.0F, 0.0F);
		slide28_r1.cubeList.add(new ModelBox(slide28_r1, 63, 93, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide28_r1.cubeList.add(new ModelBox(slide28_r1, 101, 139, -4.2F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		G19rockslide = new QRenderer(this);
		G19rockslide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 59, 119, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 16, 0, -2.3F, -37.5F, -28.499F, 2, 5, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 25, 31, -0.7F, -37.5F, -28.501F, 1, 5, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 47, 0, 0.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 15, 45, -3.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 116, 0, 0.101F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 0, 116, -3.099F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 101, 135, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 47, 93, -0.6F, -38.101F, -18.5F, 1, 1, 20, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 40, 121, -0.6F, -38.101F, -28.5F, 1, 1, 2, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 116, 3, -0.6F, -38.1F, -27.0F, 1, 1, 2, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 141, 20, -0.6F, -38.101F, -21.0F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 15, 141, -2.45F, -38.1F, -21.0F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 140, 111, -2.45F, -38.1F, -23.5F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 19, 141, -0.6F, -38.101F, -23.5F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 87, 115, -1.5F, -38.099F, -26.5F, 1, 1, 8, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 58, 63, 0.2F, -37.501F, -10.5F, 1, 2, 6, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 141, 75, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 74, 141, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 79, 102, -3.2F, -37.501F, -7.5F, 1, 2, 3, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 64, 32, 0.201F, -36.001F, -28.5F, 1, 2, 24, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 0, 45, -3.199F, -36.001F, -28.5F, 1, 2, 13, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 133, 19, -3.2F, -36.25F, -28.5F, 1, 1, 13, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 50, 114, 0.2F, -36.25F, -28.5F, 1, 1, 18, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 84, 32, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 70, 141, -3.099F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 64, 141, -1.5F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 141, 60, 0.101F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 84, 16, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 149, 44, -3.199F, -36.001F, -15.5F, 1, 2, 11, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 58, 103, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 60, 141, -0.6F, -38.1F, 1.002F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 56, 136, -2.4F, -38.099F, 1.003F, 2, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 48, 119, -2.4F, -38.1F, -28.5F, 2, 1, 2, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 8, 116, -2.4F, -38.101F, -27.0F, 2, 1, 2, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 132, 82, -2.4F, -38.1F, -18.5F, 2, 1, 3, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 32, 141, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 123, 67, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 32, 90, -3.0F, -38.2F, -2.75F, 4, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 75, 71, -2.5F, -38.201F, -4.75F, 3, 1, 5, 0.0F, false));

		slide16_r3 = new ModelRenderer(this);
		slide16_r3.setRotationPoint(-2.0F, -38.3F, -2.95F);
		G19rockslide.addChild(slide16_r3);
		setRotationAngle(slide16_r3, 0.0F, 0.5411F, 0.0F);
		slide16_r3.cubeList.add(new ModelBox(slide16_r3, 114, 56, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide17_r2 = new ModelRenderer(this);
		slide17_r2.setRotationPoint(-3.0F, -38.2F, -1.75F);
		G19rockslide.addChild(slide17_r2);
		setRotationAngle(slide17_r2, 0.0F, -1.2043F, 0.0F);
		slide17_r2.cubeList.add(new ModelBox(slide17_r2, 116, 49, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide16_r4 = new ModelRenderer(this);
		slide16_r4.setRotationPoint(-3.0F, -38.2F, -2.75F);
		G19rockslide.addChild(slide16_r4);
		setRotationAngle(slide16_r4, 0.0F, 1.2043F, 0.0F);
		slide16_r4.cubeList.add(new ModelBox(slide16_r4, 62, 130, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide17_r3 = new ModelRenderer(this);
		slide17_r3.setRotationPoint(0.0F, -38.3F, -2.95F);
		G19rockslide.addChild(slide17_r3);
		setRotationAngle(slide17_r3, 0.0F, -0.5411F, 0.0F);
		slide17_r3.cubeList.add(new ModelBox(slide17_r3, 118, 0, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide18_r1 = new ModelRenderer(this);
		slide18_r1.setRotationPoint(1.0F, -38.2F, -1.75F);
		G19rockslide.addChild(slide18_r1);
		setRotationAngle(slide18_r1, 0.0F, 1.2043F, 0.0F);
		slide18_r1.cubeList.add(new ModelBox(slide18_r1, 31, 131, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide19_r3 = new ModelRenderer(this);
		slide19_r3.setRotationPoint(1.0F, -38.2F, -2.75F);
		G19rockslide.addChild(slide19_r3);
		setRotationAngle(slide19_r3, 0.0F, -1.2043F, 0.0F);
		slide19_r3.cubeList.add(new ModelBox(slide19_r3, 29, 135, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide57_r4 = new ModelRenderer(this);
		slide57_r4.setRotationPoint(-2.4F, -38.1F, -28.5F);
		G19rockslide.addChild(slide57_r4);
		setRotationAngle(slide57_r4, 0.0F, 0.0F, -0.6545F);
		slide57_r4.cubeList.add(new ModelBox(slide57_r4, 147, 88, -1.0F, 0.0F, 18.0F, 1, 1, 12, -0.001F, false));
		slide57_r4.cubeList.add(new ModelBox(slide57_r4, 48, 141, -1.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide55_r1 = new ModelRenderer(this);
		slide55_r1.setRotationPoint(0.4F, -38.1F, -28.5F);
		G19rockslide.addChild(slide55_r1);
		setRotationAngle(slide55_r1, 0.0F, 0.0F, 0.6545F);
		slide55_r1.cubeList.add(new ModelBox(slide55_r1, 117, 147, 0.0F, 0.0F, 18.0F, 1, 1, 12, 0.0F, false));
		slide55_r1.cubeList.add(new ModelBox(slide55_r1, 56, 141, 0.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide25_r1 = new ModelRenderer(this);
		slide25_r1.setRotationPoint(-2.7F, -37.5F, -4.75F);
		G19rockslide.addChild(slide25_r1);
		setRotationAngle(slide25_r1, 0.192F, 0.0F, 0.0F);
		slide25_r1.cubeList.add(new ModelBox(slide25_r1, 124, 35, -0.748F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide25_r1.cubeList.add(new ModelBox(slide25_r1, 132, 88, 3.149F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide24_r1 = new ModelRenderer(this);
		slide24_r1.setRotationPoint(-2.7F, -37.5F, -4.5F);
		G19rockslide.addChild(slide24_r1);
		setRotationAngle(slide24_r1, 0.192F, 0.0F, 0.0F);
		slide24_r1.cubeList.add(new ModelBox(slide24_r1, 124, 88, -0.751F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide24_r1.cubeList.add(new ModelBox(slide24_r1, 85, 133, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide27_r1 = new ModelRenderer(this);
		slide27_r1.setRotationPoint(-2.7F, -37.5F, -2.5F);
		G19rockslide.addChild(slide27_r1);
		setRotationAngle(slide27_r1, 0.192F, 0.0F, 0.0F);
		slide27_r1.cubeList.add(new ModelBox(slide27_r1, 116, 19, -0.749F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide27_r1.cubeList.add(new ModelBox(slide27_r1, 122, 97, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide29_r3 = new ModelRenderer(this);
		slide29_r3.setRotationPoint(-2.7F, -37.5F, 1.0F);
		G19rockslide.addChild(slide29_r3);
		setRotationAngle(slide29_r3, 0.192F, 0.0F, 0.0F);
		slide29_r3.cubeList.add(new ModelBox(slide29_r3, 109, 117, -0.75F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide29_r3.cubeList.add(new ModelBox(slide29_r3, 70, 121, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide28_r2 = new ModelRenderer(this);
		slide28_r2.setRotationPoint(-2.7F, -37.5F, 0.5F);
		G19rockslide.addChild(slide28_r2);
		setRotationAngle(slide28_r2, 0.192F, 0.0F, 0.0F);
		slide28_r2.cubeList.add(new ModelBox(slide28_r2, 116, 44, -0.749F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide28_r2.cubeList.add(new ModelBox(slide28_r2, 79, 121, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide27_r2 = new ModelRenderer(this);
		slide27_r2.setRotationPoint(-2.7F, -37.5F, -0.5F);
		G19rockslide.addChild(slide27_r2);
		setRotationAngle(slide27_r2, 0.192F, 0.0F, 0.0F);
		slide27_r2.cubeList.add(new ModelBox(slide27_r2, 116, 35, -0.749F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide27_r2.cubeList.add(new ModelBox(slide27_r2, 13, 122, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide26_r1 = new ModelRenderer(this);
		slide26_r1.setRotationPoint(-2.7F, -37.5F, -1.5F);
		G19rockslide.addChild(slide26_r1);
		setRotationAngle(slide26_r1, 0.192F, 0.0F, 0.0F);
		slide26_r1.cubeList.add(new ModelBox(slide26_r1, 116, 28, -0.749F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide26_r1.cubeList.add(new ModelBox(slide26_r1, 122, 123, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide25_r2 = new ModelRenderer(this);
		slide25_r2.setRotationPoint(-2.7F, -37.5F, -3.5F);
		G19rockslide.addChild(slide25_r2);
		setRotationAngle(slide25_r2, 0.192F, 0.0F, 0.0F);
		slide25_r2.cubeList.add(new ModelBox(slide25_r2, 116, 7, -0.749F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide25_r2.cubeList.add(new ModelBox(slide25_r2, 124, 28, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide24_r2 = new ModelRenderer(this);
		slide24_r2.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G19rockslide.addChild(slide24_r2);
		setRotationAngle(slide24_r2, -0.7854F, 0.0F, 0.0F);
		slide24_r2.cubeList.add(new ModelBox(slide24_r2, 124, 7, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide23_r3 = new ModelRenderer(this);
		slide23_r3.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G19rockslide.addChild(slide23_r3);
		setRotationAngle(slide23_r3, -0.7854F, 0.0F, 0.0F);
		slide23_r3.cubeList.add(new ModelBox(slide23_r3, 124, 9, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r3 = new ModelRenderer(this);
		slide22_r3.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G19rockslide.addChild(slide22_r3);
		setRotationAngle(slide22_r3, -0.7854F, 0.0F, 0.0F);
		slide22_r3.cubeList.add(new ModelBox(slide22_r3, 124, 11, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r4 = new ModelRenderer(this);
		slide22_r4.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G19rockslide.addChild(slide22_r4);
		setRotationAngle(slide22_r4, -0.7854F, 0.0F, 0.0F);
		slide22_r4.cubeList.add(new ModelBox(slide22_r4, 124, 14, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r5 = new ModelRenderer(this);
		slide21_r5.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G19rockslide.addChild(slide21_r5);
		setRotationAngle(slide21_r5, -0.7854F, 0.0F, 0.0F);
		slide21_r5.cubeList.add(new ModelBox(slide21_r5, 54, 125, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide25_r3 = new ModelRenderer(this);
		slide25_r3.setRotationPoint(1.201F, -36.25F, -38.5F);
		G19rockslide.addChild(slide25_r3);
		setRotationAngle(slide25_r3, 0.0F, 0.0F, 1.1694F);
		slide25_r3.cubeList.add(new ModelBox(slide25_r3, 117, 117, -2.001F, -0.001F, 10.001F, 2, 1, 2, 0.0F, false));
		slide25_r3.cubeList.add(new ModelBox(slide25_r3, 97, 118, -2.001F, 0.0F, 11.5F, 2, 1, 2, 0.0F, false));
		slide25_r3.cubeList.add(new ModelBox(slide25_r3, 136, 24, -2.001F, 0.0F, 15.0F, 2, 1, 1, 0.0F, false));
		slide25_r3.cubeList.add(new ModelBox(slide25_r3, 136, 50, -2.001F, 0.0F, 17.5F, 2, 1, 1, 0.0F, false));
		slide25_r3.cubeList.add(new ModelBox(slide25_r3, 79, 160, -2.001F, 0.0F, 20.0F, 2, 1, 8, 0.0F, false));

		slide24_r3 = new ModelRenderer(this);
		slide24_r3.setRotationPoint(-3.199F, -36.25F, -38.5F);
		G19rockslide.addChild(slide24_r3);
		setRotationAngle(slide24_r3, 0.0F, 0.0F, -1.1694F);
		slide24_r3.cubeList.add(new ModelBox(slide24_r3, 87, 118, -0.001F, -0.001F, 10.001F, 2, 1, 2, 0.0F, false));
		slide24_r3.cubeList.add(new ModelBox(slide24_r3, 8, 119, -0.001F, 0.0F, 11.5F, 2, 1, 2, 0.0F, false));
		slide24_r3.cubeList.add(new ModelBox(slide24_r3, 40, 136, -0.001F, 0.0F, 15.0F, 2, 1, 1, 0.0F, false));
		slide24_r3.cubeList.add(new ModelBox(slide24_r3, 46, 136, -0.001F, 0.0F, 17.5F, 2, 1, 1, 0.0F, false));
		slide24_r3.cubeList.add(new ModelBox(slide24_r3, 132, 78, -0.001F, 0.0F, 20.0F, 2, 1, 3, -0.001F, false));

		slide17_r4 = new ModelRenderer(this);
		slide17_r4.setRotationPoint(1.2F, -37.501F, -10.5F);
		G19rockslide.addChild(slide17_r4);
		setRotationAngle(slide17_r4, -1.309F, -0.2094F, 0.6632F);
		slide17_r4.cubeList.add(new ModelBox(slide17_r4, 0, 15, -1.001F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

		slide16_r5 = new ModelRenderer(this);
		slide16_r5.setRotationPoint(1.2F, -37.501F, -10.5F);
		G19rockslide.addChild(slide16_r5);
		setRotationAngle(slide16_r5, -1.2392F, 0.0F, 0.0F);
		slide16_r5.cubeList.add(new ModelBox(slide16_r5, 8, 15, -1.001F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

		slide19_r4 = new ModelRenderer(this);
		slide19_r4.setRotationPoint(0.4F, -38.1F, -23.5F);
		G19rockslide.addChild(slide19_r4);
		setRotationAngle(slide19_r4, 0.0F, 0.9076F, 0.0F);
		slide19_r4.cubeList.add(new ModelBox(slide19_r4, 58, 66, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		slide18_r2 = new ModelRenderer(this);
		slide18_r2.setRotationPoint(0.4F, -38.1F, -21.0F);
		G19rockslide.addChild(slide18_r2);
		setRotationAngle(slide18_r2, 0.0F, 0.9076F, 0.0F);
		slide18_r2.cubeList.add(new ModelBox(slide18_r2, 24, 71, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		slide20_r3 = new ModelRenderer(this);
		slide20_r3.setRotationPoint(-2.4F, -38.1F, -23.5F);
		G19rockslide.addChild(slide20_r3);
		setRotationAngle(slide20_r3, 0.0F, -0.9076F, 0.0F);
		slide20_r3.cubeList.add(new ModelBox(slide20_r3, 15, 65, 0.0F, -0.001F, -2.0F, 1, 1, 2, 0.0F, false));

		slide19_r5 = new ModelRenderer(this);
		slide19_r5.setRotationPoint(-2.4F, -38.1F, -21.0F);
		G19rockslide.addChild(slide19_r5);
		setRotationAngle(slide19_r5, 0.0F, -0.9076F, 0.0F);
		slide19_r5.cubeList.add(new ModelBox(slide19_r5, 23, 65, 0.0F, -0.001F, -2.0F, 1, 1, 2, 0.0F, false));

		slide18_r3 = new ModelRenderer(this);
		slide18_r3.setRotationPoint(-2.4F, -38.1F, -18.5F);
		G19rockslide.addChild(slide18_r3);
		setRotationAngle(slide18_r3, 0.0F, -0.9076F, 0.0F);
		slide18_r3.cubeList.add(new ModelBox(slide18_r3, 32, 66, 0.0F, -0.001F, -2.0F, 1, 1, 2, 0.0F, false));

		slide17_r5 = new ModelRenderer(this);
		slide17_r5.setRotationPoint(0.4F, -38.1F, -18.5F);
		G19rockslide.addChild(slide17_r5);
		setRotationAngle(slide17_r5, 0.0F, 0.9076F, 0.0F);
		slide17_r5.cubeList.add(new ModelBox(slide17_r5, 90, 28, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		G19ghostprecisionslide = new QRenderer(this);
		G19ghostprecisionslide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 97, 115, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 8, 0, -2.3F, -37.5F, -28.499F, 2, 5, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 8, 31, -0.7F, -37.5F, -28.501F, 1, 5, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 16, 15, 0.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 16, 0, -3.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 70, 114, 0.101F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 113, 60, -3.099F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 85, 134, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 24, 93, -0.6F, -38.101F, -19.5F, 1, 1, 21, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 64, 32, -0.6F, -38.101F, -28.5F, 1, 1, 2, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 127, 39, -0.6F, -38.1F, -27.0F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 128, 117, 0.2F, -37.501F, -19.5F, 1, 1, 15, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 101, 129, 0.2F, -37.501F, -28.5F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 128, 119, -3.2F, -37.501F, -28.5F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 140, 101, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 140, 29, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 69, 102, -3.2F, -37.501F, -7.5F, 1, 2, 3, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 115, 125, -3.2F, -37.501F, -19.499F, 1, 1, 4, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 58, 63, 0.201F, -37.001F, -19.5F, 1, 3, 15, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 8, 76, 0.201F, -37.001F, -28.5F, 1, 3, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 76, -3.199F, -37.001F, -28.5F, 1, 3, 1, -0.001F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 89, 102, -3.099F, -35.001F, -27.5F, 1, 1, 8, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 69, 102, 0.101F, -35.001F, -27.5F, 1, 1, 8, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 35, 93, -3.199F, -37.001F, -19.5F, 1, 3, 4, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 52, 79, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 139, 55, -3.099F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 138, 117, -1.5F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 137, 37, 0.101F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 78, 32, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 149, -3.199F, -36.001F, -15.5F, 1, 2, 11, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 47, 103, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 34, 136, -0.6F, -38.1F, 1.002F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 136, 21, -2.4F, -38.099F, 1.003F, 2, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 102, 0, -2.4F, -38.1F, -19.5F, 2, 1, 4, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 87, 115, -2.4F, -38.1F, -28.5F, 2, 1, 2, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 136, 19, -2.4F, -38.101F, -27.0F, 2, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 64, 133, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 64, 35, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 75, 83, -0.35F, -38.351F, -26.25F, 1, 1, 7, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 97, 121, -2.6F, -38.35F, -25.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 119, 110, -2.6F, -38.35F, -23.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 113, -2.6F, -38.35F, -21.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 87, 121, -2.6F, -38.35F, -24.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 120, 106, -2.6F, -38.35F, -22.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 8, 113, -2.6F, -38.35F, -20.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 75, 63, -2.65F, -38.351F, -26.25F, 1, 1, 7, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 42, 90, -3.0F, -38.2F, -2.75F, 4, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 58, 81, -2.5F, -38.201F, -4.75F, 3, 1, 5, 0.0F, false));

		slide18_r4 = new ModelRenderer(this);
		slide18_r4.setRotationPoint(1.0F, -38.2F, -2.75F);
		G19ghostprecisionslide.addChild(slide18_r4);
		setRotationAngle(slide18_r4, 0.0F, -1.2043F, 0.0F);
		slide18_r4.cubeList.add(new ModelBox(slide18_r4, 135, 44, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide17_r6 = new ModelRenderer(this);
		slide17_r6.setRotationPoint(1.0F, -38.2F, -1.75F);
		G19ghostprecisionslide.addChild(slide17_r6);
		setRotationAngle(slide17_r6, 0.0F, 1.2043F, 0.0F);
		slide17_r6.cubeList.add(new ModelBox(slide17_r6, 135, 46, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide16_r6 = new ModelRenderer(this);
		slide16_r6.setRotationPoint(0.0F, -38.3F, -2.95F);
		G19ghostprecisionslide.addChild(slide16_r6);
		setRotationAngle(slide16_r6, 0.0F, -0.5411F, 0.0F);
		slide16_r6.cubeList.add(new ModelBox(slide16_r6, 81, 118, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide15_r4 = new ModelRenderer(this);
		slide15_r4.setRotationPoint(-2.0F, -38.3F, -2.95F);
		G19ghostprecisionslide.addChild(slide15_r4);
		setRotationAngle(slide15_r4, 0.0F, 0.5411F, 0.0F);
		slide15_r4.cubeList.add(new ModelBox(slide15_r4, 127, 32, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide15_r5 = new ModelRenderer(this);
		slide15_r5.setRotationPoint(-3.0F, -38.2F, -2.75F);
		G19ghostprecisionslide.addChild(slide15_r5);
		setRotationAngle(slide15_r5, 0.0F, 1.2043F, 0.0F);
		slide15_r5.cubeList.add(new ModelBox(slide15_r5, 117, 135, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide16_r7 = new ModelRenderer(this);
		slide16_r7.setRotationPoint(-3.0F, -38.2F, -1.75F);
		G19ghostprecisionslide.addChild(slide16_r7);
		setRotationAngle(slide16_r7, 0.0F, -1.2043F, 0.0F);
		slide16_r7.cubeList.add(new ModelBox(slide16_r7, 131, 135, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide59_r2 = new ModelRenderer(this);
		slide59_r2.setRotationPoint(-2.4F, -38.1F, -46.5F);
		G19ghostprecisionslide.addChild(slide59_r2);
		setRotationAngle(slide59_r2, 0.0F, 0.0F, -0.6545F);
		slide59_r2.cubeList.add(new ModelBox(slide59_r2, 132, 97, -1.0F, 0.0F, 18.0F, 1, 1, 13, -0.001F, false));
		slide59_r2.cubeList.add(new ModelBox(slide59_r2, 86, 147, -1.0F, 0.0F, 36.0F, 1, 1, 12, -0.001F, false));
		slide59_r2.cubeList.add(new ModelBox(slide59_r2, 78, 133, -1.0F, 0.0F, 47.5F, 1, 1, 1, 0.0F, false));

		slide56_r2 = new ModelRenderer(this);
		slide56_r2.setRotationPoint(0.4F, -38.1F, -28.5F);
		G19ghostprecisionslide.addChild(slide56_r2);
		setRotationAngle(slide56_r2, 0.0F, 0.0F, 0.6545F);
		slide56_r2.cubeList.add(new ModelBox(slide56_r2, 32, 1, 0.0F, 0.0F, 0.0F, 1, 1, 30, 0.0F, false));
		slide56_r2.cubeList.add(new ModelBox(slide56_r2, 19, 135, 0.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide26_r2 = new ModelRenderer(this);
		slide26_r2.setRotationPoint(-2.7F, -37.4F, -4.1F);
		G19ghostprecisionslide.addChild(slide26_r2);
		setRotationAngle(slide26_r2, -0.192F, 0.0F, 0.0F);
		slide26_r2.cubeList.add(new ModelBox(slide26_r2, 0, 93, -0.751F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide26_r2.cubeList.add(new ModelBox(slide26_r2, 78, 114, 3.149F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide28_r3 = new ModelRenderer(this);
		slide28_r3.setRotationPoint(-2.7F, -37.4F, -27.05F);
		G19ghostprecisionslide.addChild(slide28_r3);
		setRotationAngle(slide28_r3, -0.192F, 0.0F, 0.0F);
		slide28_r3.cubeList.add(new ModelBox(slide28_r3, 15, 76, -0.7489F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide28_r3.cubeList.add(new ModelBox(slide28_r3, 57, 16, 3.1511F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide27_r3 = new ModelRenderer(this);
		slide27_r3.setRotationPoint(-2.7F, -37.4F, -26.55F);
		G19ghostprecisionslide.addChild(slide27_r3);
		setRotationAngle(slide27_r3, -0.192F, 0.0F, 0.0F);
		slide27_r3.cubeList.add(new ModelBox(slide27_r3, 23, 76, -0.751F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide27_r3.cubeList.add(new ModelBox(slide27_r3, 15, 83, 3.149F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide28_r4 = new ModelRenderer(this);
		slide28_r4.setRotationPoint(-2.7F, -37.4F, -1.85F);
		G19ghostprecisionslide.addChild(slide28_r4);
		setRotationAngle(slide28_r4, -0.192F, 0.0F, 0.0F);
		slide28_r4.cubeList.add(new ModelBox(slide28_r4, 108, 5, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide28_r4.cubeList.add(new ModelBox(slide28_r4, 111, 103, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide29_r4 = new ModelRenderer(this);
		slide29_r4.setRotationPoint(-2.7F, -37.4F, 1.65F);
		G19ghostprecisionslide.addChild(slide29_r4);
		setRotationAngle(slide29_r4, -0.192F, 0.0F, 0.0F);
		slide29_r4.cubeList.add(new ModelBox(slide29_r4, 18, 109, -0.749F, -0.28F, -0.75F, 1, 4, 1, -0.251F, false));
		slide29_r4.cubeList.add(new ModelBox(slide29_r4, 110, 15, 3.151F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide30_r2 = new ModelRenderer(this);
		slide30_r2.setRotationPoint(-2.7F, -37.4F, -18.6F);
		G19ghostprecisionslide.addChild(slide30_r2);
		setRotationAngle(slide30_r2, -0.192F, 0.0F, 0.0F);
		slide30_r2.cubeList.add(new ModelBox(slide30_r2, 57, 21, -0.751F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide30_r2.cubeList.add(new ModelBox(slide30_r2, 86, 71, 3.149F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide28_r5 = new ModelRenderer(this);
		slide28_r5.setRotationPoint(-2.7F, -37.4F, 1.15F);
		G19ghostprecisionslide.addChild(slide28_r5);
		setRotationAngle(slide28_r5, -0.192F, 0.0F, 0.0F);
		slide28_r5.cubeList.add(new ModelBox(slide28_r5, 108, 38, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide28_r5.cubeList.add(new ModelBox(slide28_r5, 110, 43, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide35_r3 = new ModelRenderer(this);
		slide35_r3.setRotationPoint(-2.7F, -37.4F, -25.1F);
		G19ghostprecisionslide.addChild(slide35_r3);
		setRotationAngle(slide35_r3, -0.192F, 0.0F, 0.0F);
		slide35_r3.cubeList.add(new ModelBox(slide35_r3, 75, 71, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide35_r3.cubeList.add(new ModelBox(slide35_r3, 84, 6, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide34_r5 = new ModelRenderer(this);
		slide34_r5.setRotationPoint(-2.7F, -37.4F, -24.1F);
		G19ghostprecisionslide.addChild(slide34_r5);
		setRotationAngle(slide34_r5, -0.192F, 0.0F, 0.0F);
		slide34_r5.cubeList.add(new ModelBox(slide34_r5, 75, 63, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide34_r5.cubeList.add(new ModelBox(slide34_r5, 84, 11, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide33_r3 = new ModelRenderer(this);
		slide33_r3.setRotationPoint(-2.7F, -37.4F, -23.1F);
		G19ghostprecisionslide.addChild(slide33_r3);
		setRotationAngle(slide33_r3, -0.192F, 0.0F, 0.0F);
		slide33_r3.cubeList.add(new ModelBox(slide33_r3, 52, 74, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide33_r3.cubeList.add(new ModelBox(slide33_r3, 84, 38, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide32_r3 = new ModelRenderer(this);
		slide32_r3.setRotationPoint(-2.7F, -37.4F, -22.1F);
		G19ghostprecisionslide.addChild(slide32_r3);
		setRotationAngle(slide32_r3, -0.192F, 0.0F, 0.0F);
		slide32_r3.cubeList.add(new ModelBox(slide32_r3, 66, 71, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide32_r3.cubeList.add(new ModelBox(slide32_r3, 84, 43, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide31_r2 = new ModelRenderer(this);
		slide31_r2.setRotationPoint(-2.7F, -37.4F, -21.1F);
		G19ghostprecisionslide.addChild(slide31_r2);
		setRotationAngle(slide31_r2, -0.192F, 0.0F, 0.0F);
		slide31_r2.cubeList.add(new ModelBox(slide31_r2, 58, 71, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide31_r2.cubeList.add(new ModelBox(slide31_r2, 84, 63, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide30_r3 = new ModelRenderer(this);
		slide30_r3.setRotationPoint(-2.7F, -37.4F, -20.1F);
		G19ghostprecisionslide.addChild(slide30_r3);
		setRotationAngle(slide30_r3, -0.192F, 0.0F, 0.0F);
		slide30_r3.cubeList.add(new ModelBox(slide30_r3, 52, 69, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide30_r3.cubeList.add(new ModelBox(slide30_r3, 84, 83, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide29_r5 = new ModelRenderer(this);
		slide29_r5.setRotationPoint(-2.7F, -37.4F, -19.1F);
		G19ghostprecisionslide.addChild(slide29_r5);
		setRotationAngle(slide29_r5, -0.192F, 0.0F, 0.0F);
		slide29_r5.cubeList.add(new ModelBox(slide29_r5, 66, 63, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide29_r5.cubeList.add(new ModelBox(slide29_r5, 90, 0, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide27_r4 = new ModelRenderer(this);
		slide27_r4.setRotationPoint(-2.7F, -37.4F, 0.15F);
		G19ghostprecisionslide.addChild(slide27_r4);
		setRotationAngle(slide27_r4, -0.192F, 0.0F, 0.0F);
		slide27_r4.cubeList.add(new ModelBox(slide27_r4, 108, 33, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide27_r4.cubeList.add(new ModelBox(slide27_r4, 113, 60, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide27_r5 = new ModelRenderer(this);
		slide27_r5.setRotationPoint(-2.7F, -37.4F, -2.85F);
		G19ghostprecisionslide.addChild(slide27_r5);
		setRotationAngle(slide27_r5, -0.192F, 0.0F, 0.0F);
		slide27_r5.cubeList.add(new ModelBox(slide27_r5, 18, 104, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide27_r5.cubeList.add(new ModelBox(slide27_r5, 111, 97, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide26_r3 = new ModelRenderer(this);
		slide26_r3.setRotationPoint(-2.7F, -37.4F, -0.85F);
		G19ghostprecisionslide.addChild(slide26_r3);
		setRotationAngle(slide26_r3, -0.192F, 0.0F, 0.0F);
		slide26_r3.cubeList.add(new ModelBox(slide26_r3, 108, 10, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide26_r3.cubeList.add(new ModelBox(slide26_r3, 70, 114, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide25_r4 = new ModelRenderer(this);
		slide25_r4.setRotationPoint(-2.7F, -37.4F, -3.85F);
		G19ghostprecisionslide.addChild(slide25_r4);
		setRotationAngle(slide25_r4, -0.192F, 0.0F, 0.0F);
		slide25_r4.cubeList.add(new ModelBox(slide25_r4, 18, 99, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide25_r4.cubeList.add(new ModelBox(slide25_r4, 0, 116, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide26_r4 = new ModelRenderer(this);
		slide26_r4.setRotationPoint(-2.7F, -37.4F, -26.1F);
		G19ghostprecisionslide.addChild(slide26_r4);
		setRotationAngle(slide26_r4, -0.192F, 0.0F, 0.0F);
		slide26_r4.cubeList.add(new ModelBox(slide26_r4, 58, 81, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide26_r4.cubeList.add(new ModelBox(slide26_r4, 24, 83, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide25_r5 = new ModelRenderer(this);
		slide25_r5.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G19ghostprecisionslide.addChild(slide25_r5);
		setRotationAngle(slide25_r5, -0.7854F, 0.0F, 0.0F);
		slide25_r5.cubeList.add(new ModelBox(slide25_r5, 48, 122, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide24_r4 = new ModelRenderer(this);
		slide24_r4.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G19ghostprecisionslide.addChild(slide24_r4);
		setRotationAngle(slide24_r4, -0.7854F, 0.0F, 0.0F);
		slide24_r4.cubeList.add(new ModelBox(slide24_r4, 122, 56, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide23_r4 = new ModelRenderer(this);
		slide23_r4.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G19ghostprecisionslide.addChild(slide23_r4);
		setRotationAngle(slide23_r4, -0.7854F, 0.0F, 0.0F);
		slide23_r4.cubeList.add(new ModelBox(slide23_r4, 59, 122, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide23_r5 = new ModelRenderer(this);
		slide23_r5.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G19ghostprecisionslide.addChild(slide23_r5);
		setRotationAngle(slide23_r5, -0.7854F, 0.0F, 0.0F);
		slide23_r5.cubeList.add(new ModelBox(slide23_r5, 123, 117, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r5 = new ModelRenderer(this);
		slide22_r5.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G19ghostprecisionslide.addChild(slide22_r5);
		setRotationAngle(slide22_r5, -0.7854F, 0.0F, 0.0F);
		slide22_r5.cubeList.add(new ModelBox(slide22_r5, 124, 3, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		G19Xbody = new QRenderer(this);
		G19Xbody.setRotationPoint(0.0F, 24.0F, 0.0F);
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 112, 78, -2.999F, -31.0F, -6.8F, 4, 1, 4, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 100, 21, -2.5F, -17.5F, -4.8F, 3, 1, 2, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 147, 101, -3.001F, -19.5F, -3.7F, 4, 3, 6, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 100, 49, -2.999F, -20.0F, 1.9F, 4, 2, 1, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 69, 107, -2.5F, -20.0F, 2.9F, 3, 2, 1, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 64, 58, -3.0F, -32.0F, -8.5F, 4, 2, 2, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 75, 20, -3.0F, -34.0F, 0.25F, 4, 1, 2, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 58, 99, -2.5F, -35.7F, 0.8F, 3, 2, 1, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 104, 44, -0.1F, -32.0F, -6.5F, 1, 1, 4, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 104, 16, -2.9F, -32.0F, -6.5F, 1, 1, 4, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 116, 44, -2.499F, -27.5F, -16.5F, 3, 1, 7, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 111, 103, -2.3F, -37.9F, -15.5F, 2, 2, 5, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 31, 115, -3.0F, -34.7F, -28.4F, 1, 1, 15, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 70, 114, 0.0F, -34.7F, -28.4F, 1, 1, 15, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 116, 19, -2.999F, -33.8F, -19.4F, 4, 2, 6, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 32, 48, -2.999F, -34.0F, -10.5F, 4, 1, 11, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 18, 147, -3.0F, -33.0F, -10.5F, 4, 1, 10, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 47, 93, -0.299F, -34.0F, -13.4F, 1, 3, 3, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 24, 93, -2.699F, -34.0F, -13.4F, 1, 3, 3, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 89, 93, -2.499F, -31.6F, -16.1F, 3, 4, 1, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 90, 48, -2.0F, -32.3F, -26.8F, 2, 1, 3, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 0, 52, -2.0F, -32.3F, -22.8F, 2, 1, 4, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 75, 68, -2.0F, -32.5F, -23.8F, 2, 1, 1, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 131, 147, -2.8F, -34.0F, -28.4F, 1, 1, 9, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 24, 104, -0.2F, -34.0F, -28.4F, 1, 1, 9, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 133, 33, -2.5F, -33.2F, -27.4F, 3, 1, 8, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 32, 16, -2.6F, -37.6F, -15.5F, 1, 2, 5, 0.0F, false));
		G19Xbody.cubeList.add(new ModelBox(G19Xbody, 90, 96, -2.0F, -35.0F, -29.0F, 2, 2, 17, -0.3F, false));

		gun32_r2 = new ModelRenderer(this);
		gun32_r2.setRotationPoint(-2.0F, -37.3F, -28.8F);
		G19Xbody.addChild(gun32_r2);
		setRotationAngle(gun32_r2, -0.0372F, 0.0F, 0.0F);
		gun32_r2.cubeList.add(new ModelBox(gun32_r2, 111, 78, 0.0F, 0.0F, 0.0F, 2, 2, 17, 0.0F, false));

		gun111_r12 = new ModelRenderer(this);
		gun111_r12.setRotationPoint(1.0F, -33.7F, -28.4F);
		G19Xbody.addChild(gun111_r12);
		setRotationAngle(gun111_r12, 0.0F, 0.0F, 0.9774F);
		gun111_r12.cubeList.add(new ModelBox(gun111_r12, 47, 93, -1.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun110_r7 = new ModelRenderer(this);
		gun110_r7.setRotationPoint(-3.0F, -33.7F, -28.4F);
		G19Xbody.addChild(gun110_r7);
		setRotationAngle(gun110_r7, 0.0F, 0.0F, -0.9774F);
		gun110_r7.cubeList.add(new ModelBox(gun110_r7, 47, 103, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun114_r2 = new ModelRenderer(this);
		gun114_r2.setRotationPoint(-1.3F, -32.2F, -27.4F);
		G19Xbody.addChild(gun114_r2);
		setRotationAngle(gun114_r2, 0.0F, 0.0F, -0.7854F);
		gun114_r2.cubeList.add(new ModelBox(gun114_r2, 93, 58, -1.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun113_r3 = new ModelRenderer(this);
		gun113_r3.setRotationPoint(0.7F, -32.2F, -27.4F);
		G19Xbody.addChild(gun113_r3);
		setRotationAngle(gun113_r3, 0.0F, 0.0F, -0.7854F);
		gun113_r3.cubeList.add(new ModelBox(gun113_r3, 93, 67, -1.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun112_r8 = new ModelRenderer(this);
		gun112_r8.setRotationPoint(0.8F, -33.0F, -28.4F);
		G19Xbody.addChild(gun112_r8);
		setRotationAngle(gun112_r8, 0.0F, 0.0F, -0.7854F);
		gun112_r8.cubeList.add(new ModelBox(gun112_r8, 48, 115, -1.0F, -1.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun111_r13 = new ModelRenderer(this);
		gun111_r13.setRotationPoint(-2.8F, -33.0F, -28.4F);
		G19Xbody.addChild(gun111_r13);
		setRotationAngle(gun111_r13, 0.0F, 0.0F, -0.7854F);
		gun111_r13.cubeList.add(new ModelBox(gun111_r13, 36, 147, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun112_r9 = new ModelRenderer(this);
		gun112_r9.setRotationPoint(0.0F, -31.53F, -27.8F);
		G19Xbody.addChild(gun112_r9);
		setRotationAngle(gun112_r9, 0.6632F, 0.0F, 0.0F);
		gun112_r9.cubeList.add(new ModelBox(gun112_r9, 84, 68, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun111_r14 = new ModelRenderer(this);
		gun111_r14.setRotationPoint(0.0F, -31.3F, -26.8F);
		G19Xbody.addChild(gun111_r14);
		setRotationAngle(gun111_r14, 1.3439F, 0.0F, 0.0F);
		gun111_r14.cubeList.add(new ModelBox(gun111_r14, 84, 88, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun112_r10 = new ModelRenderer(this);
		gun112_r10.setRotationPoint(1.501F, -31.2F, -19.5F);
		G19Xbody.addChild(gun112_r10);
		setRotationAngle(gun112_r10, 1.5184F, 0.0F, 0.0F);
		gun112_r10.cubeList.add(new ModelBox(gun112_r10, 0, 31, -4.001F, 0.0F, 0.0F, 3, 11, 1, 0.0F, false));

		gun111_r15 = new ModelRenderer(this);
		gun111_r15.setRotationPoint(1.001F, -31.8F, -19.4F);
		G19Xbody.addChild(gun111_r15);
		setRotationAngle(gun111_r15, 1.501F, 0.0F, 0.0F);
		gun111_r15.cubeList.add(new ModelBox(gun111_r15, 0, 62, -4.001F, 0.0F, 0.0F, 4, 6, 1, -0.002F, false));

		gun112_r11 = new ModelRenderer(this);
		gun112_r11.setRotationPoint(-2.999F, -31.8F, -19.4F);
		G19Xbody.addChild(gun112_r11);
		setRotationAngle(gun112_r11, 0.0F, -0.7854F, 0.0F);
		gun112_r11.cubeList.add(new ModelBox(gun112_r11, 8, 37, 0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun111_r16 = new ModelRenderer(this);
		gun111_r16.setRotationPoint(1.001F, -31.8F, -19.4F);
		G19Xbody.addChild(gun111_r16);
		setRotationAngle(gun111_r16, 0.0F, -0.7854F, 0.0F);
		gun111_r16.cubeList.add(new ModelBox(gun111_r16, 25, 37, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun112_r12 = new ModelRenderer(this);
		gun112_r12.setRotationPoint(0.501F, -29.8F, -15.6F);
		G19Xbody.addChild(gun112_r12);
		setRotationAngle(gun112_r12, 0.8727F, 0.0F, 0.0F);
		gun112_r12.cubeList.add(new ModelBox(gun112_r12, 93, 85, -3.002F, -2.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun112_r13 = new ModelRenderer(this);
		gun112_r13.setRotationPoint(1.101F, -32.85F, -7.5F);
		G19Xbody.addChild(gun112_r13);
		setRotationAngle(gun112_r13, 0.0F, 0.0F, 0.192F);
		gun112_r13.cubeList.add(new ModelBox(gun112_r13, 55, 32, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun40_r2 = new ModelRenderer(this);
		gun40_r2.setRotationPoint(-3.0F, -30.9F, -10.7F);
		G19Xbody.addChild(gun40_r2);
		setRotationAngle(gun40_r2, -0.1222F, 0.0F, 0.0F);
		gun40_r2.cubeList.add(new ModelBox(gun40_r2, 0, 9, 0.0F, -2.0F, 0.0F, 4, 2, 3, -0.001F, false));

		gun39_r3 = new ModelRenderer(this);
		gun39_r3.setRotationPoint(-3.0F, -30.9F, -10.7F);
		G19Xbody.addChild(gun39_r3);
		setRotationAngle(gun39_r3, 1.8218F, 0.0F, 0.0F);
		gun39_r3.cubeList.add(new ModelBox(gun39_r3, 16, 24, 0.0F, 0.0F, 0.0F, 4, 1, 3, -0.002F, false));

		gun38_r3 = new ModelRenderer(this);
		gun38_r3.setRotationPoint(-3.0F, -30.9F, -13.5F);
		G19Xbody.addChild(gun38_r3);
		setRotationAngle(gun38_r3, 1.8218F, 0.0F, 0.0F);
		gun38_r3.cubeList.add(new ModelBox(gun38_r3, 47, 9, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun94_r2 = new ModelRenderer(this);
		gun94_r2.setRotationPoint(0.5F, -27.5F, -13.6F);
		G19Xbody.addChild(gun94_r2);
		setRotationAngle(gun94_r2, -0.5934F, 0.0F, 0.0F);
		gun94_r2.cubeList.add(new ModelBox(gun94_r2, 90, 53, -3.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun93_r4 = new ModelRenderer(this);
		gun93_r4.setRotationPoint(0.5F, -27.5F, -16.5F);
		G19Xbody.addChild(gun93_r4);
		setRotationAngle(gun93_r4, -0.4538F, 0.0F, 0.0F);
		gun93_r4.cubeList.add(new ModelBox(gun93_r4, 107, 93, -3.0F, -1.0F, 0.0F, 3, 1, 1, -0.002F, false));

		gun93_r5 = new ModelRenderer(this);
		gun93_r5.setRotationPoint(0.501F, -26.5F, -9.5F);
		G19Xbody.addChild(gun93_r5);
		setRotationAngle(gun93_r5, 2.0246F, 0.0F, 0.0F);
		gun93_r5.cubeList.add(new ModelBox(gun93_r5, 24, 99, -3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun142_r2 = new ModelRenderer(this);
		gun142_r2.setRotationPoint(-2.0F, -29.5F, -10.0F);
		G19Xbody.addChild(gun142_r2);
		setRotationAngle(gun142_r2, 3.0356F, 0.0F, 0.0F);
		gun142_r2.cubeList.add(new ModelBox(gun142_r2, 55, 35, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun141_r3 = new ModelRenderer(this);
		gun141_r3.setRotationPoint(-2.0F, -29.5F, -10.0F);
		G19Xbody.addChild(gun141_r3);
		setRotationAngle(gun141_r3, -2.3051F, 0.0F, 0.0F);
		gun141_r3.cubeList.add(new ModelBox(gun141_r3, 47, 99, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun158_r2 = new ModelRenderer(this);
		gun158_r2.setRotationPoint(-0.2F, -31.3F, -12.3F);
		G19Xbody.addChild(gun158_r2);
		setRotationAngle(gun158_r2, 1.8218F, 0.0F, 0.0F);
		gun158_r2.cubeList.add(new ModelBox(gun158_r2, 15, 62, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun158_r2.cubeList.add(new ModelBox(gun158_r2, 23, 62, -2.6F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun11_r6 = new ModelRenderer(this);
		gun11_r6.setRotationPoint(1.0F, -30.0F, -8.5F);
		G19Xbody.addChild(gun11_r6);
		setRotationAngle(gun11_r6, -0.5585F, 0.0F, 0.0F);
		gun11_r6.cubeList.add(new ModelBox(gun11_r6, 79, 81, -3.999F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun13_r8 = new ModelRenderer(this);
		gun13_r8.setRotationPoint(1.0F, -31.7F, -1.4F);
		G19Xbody.addChild(gun13_r8);
		setRotationAngle(gun13_r8, -1.0647F, 0.0F, 0.0F);
		gun13_r8.cubeList.add(new ModelBox(gun13_r8, 113, 72, -4.0F, -3.0F, -1.0F, 4, 3, 1, -0.003F, false));

		gun14_r6 = new ModelRenderer(this);
		gun14_r6.setRotationPoint(1.0F, -33.0F, 2.25F);
		G19Xbody.addChild(gun14_r6);
		setRotationAngle(gun14_r6, 0.1745F, 0.0F, 0.0F);
		gun14_r6.cubeList.add(new ModelBox(gun14_r6, 49, 26, -4.001F, -1.0F, -2.0F, 4, 1, 2, 0.0F, false));

		gun14_r7 = new ModelRenderer(this);
		gun14_r7.setRotationPoint(1.0F, -34.0F, 2.25F);
		G19Xbody.addChild(gun14_r7);
		setRotationAngle(gun14_r7, 1.0123F, 0.0F, 0.0F);
		gun14_r7.cubeList.add(new ModelBox(gun14_r7, 0, 90, -4.001F, -1.0F, -1.0F, 4, 1, 1, 0.0F, false));

		gun15_r2 = new ModelRenderer(this);
		gun15_r2.setRotationPoint(0.5F, -31.0F, -0.45F);
		G19Xbody.addChild(gun15_r2);
		setRotationAngle(gun15_r2, 0.1396F, 0.0F, 0.0F);
		gun15_r2.cubeList.add(new ModelBox(gun15_r2, 46, 63, -2.999F, 0.0F, -2.0F, 3, 4, 2, 0.0F, false));

		gun14_r8 = new ModelRenderer(this);
		gun14_r8.setRotationPoint(0.5F, -33.0F, 2.25F);
		G19Xbody.addChild(gun14_r8);
		setRotationAngle(gun14_r8, 0.5236F, 0.0F, 0.0F);
		gun14_r8.cubeList.add(new ModelBox(gun14_r8, 64, 52, -3.0F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

		gun12_r6 = new ModelRenderer(this);
		gun12_r6.setRotationPoint(0.5F, -30.0F, -0.8F);
		G19Xbody.addChild(gun12_r6);
		setRotationAngle(gun12_r6, -0.576F, 0.0F, 0.0F);
		gun12_r6.cubeList.add(new ModelBox(gun12_r6, 21, 116, -3.001F, -3.0F, -2.0F, 3, 3, 2, 0.0F, false));

		gun11_r7 = new ModelRenderer(this);
		gun11_r7.setRotationPoint(1.0F, -30.0F, -1.8F);
		G19Xbody.addChild(gun11_r7);
		setRotationAngle(gun11_r7, -0.576F, 0.0F, 0.0F);
		gun11_r7.cubeList.add(new ModelBox(gun11_r7, 0, 69, -4.0F, -3.0F, -2.0F, 4, 3, 2, -0.002F, false));

		gun10_r6 = new ModelRenderer(this);
		gun10_r6.setRotationPoint(-2.5F, -17.5F, -4.8F);
		G19Xbody.addChild(gun10_r6);
		setRotationAngle(gun10_r6, 0.8029F, 0.0F, 0.0F);
		gun10_r6.cubeList.add(new ModelBox(gun10_r6, 99, 93, 0.001F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun12_r7 = new ModelRenderer(this);
		gun12_r7.setRotationPoint(1.001F, -20.0F, 2.9F);
		G19Xbody.addChild(gun12_r7);
		setRotationAngle(gun12_r7, -1.0996F, 0.0F, 0.0F);
		gun12_r7.cubeList.add(new ModelBox(gun12_r7, 132, 88, -4.0F, 0.0F, -6.0F, 4, 1, 6, 0.0F, false));

		gun13_r9 = new ModelRenderer(this);
		gun13_r9.setRotationPoint(0.501F, -20.0F, 3.9F);
		G19Xbody.addChild(gun13_r9);
		setRotationAngle(gun13_r9, 0.4712F, 0.0F, 0.0F);
		gun13_r9.cubeList.add(new ModelBox(gun13_r9, 32, 48, -3.0F, -9.0F, -1.0F, 3, 9, 1, 0.0F, false));

		gun13_r10 = new ModelRenderer(this);
		gun13_r10.setRotationPoint(0.501F, -18.0F, 3.9F);
		G19Xbody.addChild(gun13_r10);
		setRotationAngle(gun13_r10, -0.7854F, 0.0F, 0.0F);
		gun13_r10.cubeList.add(new ModelBox(gun13_r10, 123, 72, -3.0F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

		gun14_r9 = new ModelRenderer(this);
		gun14_r9.setRotationPoint(-1.699F, -17.8F, 2.5F);
		G19Xbody.addChild(gun14_r9);
		setRotationAngle(gun14_r9, -0.4014F, 0.0F, 0.0F);
		gun14_r9.cubeList.add(new ModelBox(gun14_r9, 26, 80, -1.001F, 0.0F, -1.0F, 1, 1, 1, 0.3F, false));
		gun14_r9.cubeList.add(new ModelBox(gun14_r9, 42, 83, 1.399F, 0.0F, -1.0F, 1, 1, 1, 0.3F, false));

		gun11_r8 = new ModelRenderer(this);
		gun11_r8.setRotationPoint(-5.1F, -31.45F, -8.8F);
		G19Xbody.addChild(gun11_r8);
		setRotationAngle(gun11_r8, 0.3543F, 0.0F, 0.0F);
		gun11_r8.cubeList.add(new ModelBox(gun11_r8, 9, 87, 2.0F, 3.0F, 1.0F, 1, 1, 1, 0.0F, false));

		gun10_r7 = new ModelRenderer(this);
		gun10_r7.setRotationPoint(-1.9F, -31.35F, -8.6F);
		G19Xbody.addChild(gun10_r7);
		setRotationAngle(gun10_r7, 0.3543F, 0.0F, 0.0F);
		gun10_r7.cubeList.add(new ModelBox(gun10_r7, 39, 16, 2.0F, 3.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun9_r4 = new ModelRenderer(this);
		gun9_r4.setRotationPoint(-2.3F, -31.2F, -9.0F);
		G19Xbody.addChild(gun9_r4);
		setRotationAngle(gun9_r4, 0.3543F, 0.0F, 0.0F);
		gun9_r4.cubeList.add(new ModelBox(gun9_r4, 40, 6, 2.0F, 3.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun8_r3 = new ModelRenderer(this);
		gun8_r3.setRotationPoint(-2.5F, -30.7F, -9.2F);
		G19Xbody.addChild(gun8_r3);
		setRotationAngle(gun8_r3, 0.3543F, 0.0F, 0.0F);
		gun8_r3.cubeList.add(new ModelBox(gun8_r3, 90, 0, 0.0F, 0.0F, 0.0F, 3, 14, 6, 0.0F, false));

		gun7_r3 = new ModelRenderer(this);
		gun7_r3.setRotationPoint(-3.0F, -30.0F, -8.0F);
		G19Xbody.addChild(gun7_r3);
		setRotationAngle(gun7_r3, 0.3718F, 0.0F, 0.0F);
		gun7_r3.cubeList.add(new ModelBox(gun7_r3, 32, 63, 0.0F, 0.0F, 0.0F, 4, 14, 6, 0.0F, false));

		gun146_r3 = new ModelRenderer(this);
		gun146_r3.setRotationPoint(-2.6F, -30.0F, -5.8F);
		G19Xbody.addChild(gun146_r3);
		setRotationAngle(gun146_r3, 0.0F, 0.0F, 0.7854F);
		gun146_r3.cubeList.add(new ModelBox(gun146_r3, 118, 90, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun146_r4 = new ModelRenderer(this);
		gun146_r4.setRotationPoint(0.5F, -33.3F, -7.95F);
		G19Xbody.addChild(gun146_r4);
		setRotationAngle(gun146_r4, 0.0F, 0.0F, 0.7854F);
		gun146_r4.cubeList.add(new ModelBox(gun146_r4, 5, 40, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun145_r4 = new ModelRenderer(this);
		gun145_r4.setRotationPoint(0.6F, -30.0F, -5.8F);
		G19Xbody.addChild(gun145_r4);
		setRotationAngle(gun145_r4, 0.0F, 0.0F, 0.7854F);
		gun145_r4.cubeList.add(new ModelBox(gun145_r4, 21, 121, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		G19Xslide = new QRenderer(this);
		G19Xslide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 89, 98, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 0, 0, -2.3F, -37.5F, -28.499F, 2, 5, 1, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 24, 15, -0.7F, -37.5F, -28.501F, 1, 5, 1, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 0, 15, 0.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 0, 0, -3.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 15, 76, 0.101F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 58, 71, -3.099F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 40, 133, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 0, 31, -0.6F, -38.101F, -28.5F, 1, 1, 30, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 90, 3, 0.2F, -37.501F, -28.5F, 1, 1, 24, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 0, 76, -3.2F, -37.501F, -28.5F, 1, 1, 13, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 69, 75, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 75, 27, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 93, 61, -3.2F, -37.501F, -7.5F, 1, 2, 3, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 32, 63, 0.201F, -37.001F, -28.5F, 1, 3, 24, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 32, 0, -3.199F, -37.001F, -28.5F, 1, 3, 13, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 8, 52, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 74, 58, -3.099F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 73, 52, -1.5F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 69, 67, 0.101F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 0, 52, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 55, 0, 0.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 47, 32, -3.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 47, 0, -3.45F, -37.75F, -2.25F, 1, 4, 1, -0.25F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 23, 45, 0.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 7, 45, 0.45F, -37.75F, -2.25F, 1, 4, 1, -0.25F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 0, 45, -3.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 32, 39, 0.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 32, 32, -3.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 32, 23, 0.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 32, 16, -3.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 21, 116, -3.199F, -36.001F, -15.5F, 1, 2, 11, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 37, 9, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 58, 57, -0.6F, -38.1F, 1.002F, 1, 1, 1, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 39, 42, -2.4F, -38.099F, 1.003F, 2, 1, 1, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 0, 31, -2.4F, -38.1F, -28.5F, 2, 1, 13, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 26, 49, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G19Xslide.cubeList.add(new ModelBox(G19Xslide, 39, 39, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));

		slide57_r5 = new ModelRenderer(this);
		slide57_r5.setRotationPoint(-2.4F, -38.1F, -28.5F);
		G19Xslide.addChild(slide57_r5);
		setRotationAngle(slide57_r5, 0.0F, 0.0F, -0.6545F);
		slide57_r5.cubeList.add(new ModelBox(slide57_r5, 146, 146, -1.0F, 0.0F, 18.0F, 1, 1, 12, -0.001F, false));
		slide57_r5.cubeList.add(new ModelBox(slide57_r5, 0, 62, -1.0F, 0.0F, 0.0F, 1, 1, 13, -0.001F, false));
		slide57_r5.cubeList.add(new ModelBox(slide57_r5, 39, 57, -1.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide55_r2 = new ModelRenderer(this);
		slide55_r2.setRotationPoint(0.4F, -38.1F, -28.5F);
		G19Xslide.addChild(slide55_r2);
		setRotationAngle(slide55_r2, 0.0F, 0.0F, 0.6545F);
		slide55_r2.cubeList.add(new ModelBox(slide55_r2, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 30, 0.0F, false));
		slide55_r2.cubeList.add(new ModelBox(slide55_r2, 58, 4, 0.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide24_r5 = new ModelRenderer(this);
		slide24_r5.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G19Xslide.addChild(slide24_r5);
		setRotationAngle(slide24_r5, -0.7854F, 0.0F, 0.0F);
		slide24_r5.cubeList.add(new ModelBox(slide24_r5, 93, 73, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide23_r6 = new ModelRenderer(this);
		slide23_r6.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G19Xslide.addChild(slide23_r6);
		setRotationAngle(slide23_r6, -0.7854F, 0.0F, 0.0F);
		slide23_r6.cubeList.add(new ModelBox(slide23_r6, 69, 99, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r6 = new ModelRenderer(this);
		slide22_r6.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G19Xslide.addChild(slide22_r6);
		setRotationAngle(slide22_r6, -0.7854F, 0.0F, 0.0F);
		slide22_r6.cubeList.add(new ModelBox(slide22_r6, 79, 99, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r7 = new ModelRenderer(this);
		slide22_r7.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G19Xslide.addChild(slide22_r7);
		setRotationAngle(slide22_r7, -0.7854F, 0.0F, 0.0F);
		slide22_r7.cubeList.add(new ModelBox(slide22_r7, 35, 100, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r6 = new ModelRenderer(this);
		slide21_r6.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G19Xslide.addChild(slide21_r6);
		setRotationAngle(slide21_r6, -0.7854F, 0.0F, 0.0F);
		slide21_r6.cubeList.add(new ModelBox(slide21_r6, 103, 90, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		gun.render(f5);
//		G19slide.render(f5);
//		G19razorbackbody.render(f5);
//		G19razorbackslide.render(f5);
//		G19rockslide.render(f5);
//		G19ghostprecisionslide.render(f5);
//		G19Xbody.render(f5);
		G19Xslide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
