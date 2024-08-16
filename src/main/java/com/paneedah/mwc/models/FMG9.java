package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FMG9 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun111_r1;
	private final ModelRenderer gun111_r2;
	private final ModelRenderer gun111_r3;
	private final ModelRenderer gun93_r1;
	private final ModelRenderer gun92_r1;
	private final ModelRenderer gun92_r2;
	private final ModelRenderer gun141_r1;
	private final ModelRenderer gun140_r1;
	private final ModelRenderer gun157_r1;
	private final ModelRenderer gun10_r1;
	private final ModelRenderer gun14_r1;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun12_r2;
	private final ModelRenderer gun13_r1;
	private final ModelRenderer gun10_r2;
	private final ModelRenderer gun9_r2;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun145_r1;
	private final ModelRenderer gun145_r2;
	private final ModelRenderer gun144_r1;
	private final ModelRenderer fmg9;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer bone;

	public FMG9() {
		textureWidth = 210;
		textureHeight = 210;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 86, 76, -2.5F, -17.5F, -4.8F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 21, 58, -3.0F, -19.5F, -3.7F, 4, 3, 6, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 32, -2.999F, -20.0F, 1.9F, 4, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 83, -2.5F, -20.0F, 2.9F, 3, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 55, 93, -3.0F, -32.0F, -8.5F, 4, 2, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 64, 58, -2.499F, -27.5F, -16.5F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 91, 147, -2.999F, -34.0F, -10.5F, 4, 2, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 31, -0.299F, -34.0F, -13.4F, 1, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 8, 31, -2.699F, -34.0F, -13.4F, 1, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 8, -2.499F, -31.6F, -16.1F, 3, 4, 1, 0.0F, false));

		gun111_r1 = new ModelRenderer(this);
		gun111_r1.setRotationPoint(1.501F, -31.2F, -19.5F);
		gun.addChild(gun111_r1);
		setRotationAngle(gun111_r1, 1.5184F, 0.0F, 0.0F);
		gun111_r1.cubeList.add(new ModelBox(gun111_r1, 86, 59, -4.001F, 0.0F, 0.0F, 3, 11, 1, 0.0F, false));

		gun111_r2 = new ModelRenderer(this);
		gun111_r2.setRotationPoint(0.501F, -29.8F, -15.6F);
		gun.addChild(gun111_r2);
		setRotationAngle(gun111_r2, 0.8727F, 0.0F, 0.0F);
		gun111_r2.cubeList.add(new ModelBox(gun111_r2, 51, 61, -3.002F, -2.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun111_r3 = new ModelRenderer(this);
		gun111_r3.setRotationPoint(1.101F, -32.85F, -7.5F);
		gun.addChild(gun111_r3);
		setRotationAngle(gun111_r3, 0.0F, 0.0F, 0.192F);
		gun111_r3.cubeList.add(new ModelBox(gun111_r3, 35, 61, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun93_r1 = new ModelRenderer(this);
		gun93_r1.setRotationPoint(0.5F, -27.5F, -13.6F);
		gun.addChild(gun93_r1);
		setRotationAngle(gun93_r1, -0.5934F, 0.0F, 0.0F);
		gun93_r1.cubeList.add(new ModelBox(gun93_r1, 71, 36, -3.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun92_r1 = new ModelRenderer(this);
		gun92_r1.setRotationPoint(0.5F, -27.5F, -16.5F);
		gun.addChild(gun92_r1);
		setRotationAngle(gun92_r1, -0.4538F, 0.0F, 0.0F);
		gun92_r1.cubeList.add(new ModelBox(gun92_r1, 53, 52, -3.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun92_r2 = new ModelRenderer(this);
		gun92_r2.setRotationPoint(0.501F, -26.5F, -9.5F);
		gun.addChild(gun92_r2);
		setRotationAngle(gun92_r2, 2.0246F, 0.0F, 0.0F);
		gun92_r2.cubeList.add(new ModelBox(gun92_r2, 43, 84, -3.0F, 0.0F, 0.0F, 3, 2, 1, -0.002F, false));

		gun141_r1 = new ModelRenderer(this);
		gun141_r1.setRotationPoint(-2.0F, -29.5F, -10.0F);
		gun.addChild(gun141_r1);
		setRotationAngle(gun141_r1, 3.0356F, 0.0F, 0.0F);
		gun141_r1.cubeList.add(new ModelBox(gun141_r1, 13, 64, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun140_r1 = new ModelRenderer(this);
		gun140_r1.setRotationPoint(-2.0F, -29.5F, -10.0F);
		gun.addChild(gun140_r1);
		setRotationAngle(gun140_r1, -2.3051F, 0.0F, 0.0F);
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 86, 80, 0.0F, 0.0F, 0.0F, 2, 1, 2, -0.001F, false));

		gun157_r1 = new ModelRenderer(this);
		gun157_r1.setRotationPoint(-0.2F, -31.3F, -12.3F);
		gun.addChild(gun157_r1);
		setRotationAngle(gun157_r1, 1.8218F, 0.0F, 0.0F);
		gun157_r1.cubeList.add(new ModelBox(gun157_r1, 64, 58, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun10_r1 = new ModelRenderer(this);
		gun10_r1.setRotationPoint(1.0F, -30.0F, -8.5F);
		gun.addChild(gun10_r1);
		setRotationAngle(gun10_r1, -0.5585F, 0.0F, 0.0F);
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 0, 65, -4.0F, -1.0F, 0.0F, 4, 1, 1, -0.001F, false));

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(0.5F, -31.0F, -0.45F);
		gun.addChild(gun14_r1);
		setRotationAngle(gun14_r1, 0.1396F, 0.0F, 0.0F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 8, 75, -2.999F, 0.0F, -2.0F, 3, 4, 2, 0.0F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-2.5F, -17.5F, -4.8F);
		gun.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 0.8029F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 72, 14, 0.001F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(1.001F, -20.0F, 2.9F);
		gun.addChild(gun11_r1);
		setRotationAngle(gun11_r1, -1.0996F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 21, 78, -4.0F, 0.0F, -6.0F, 4, 1, 6, 0.0F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(0.501F, -20.0F, 3.9F);
		gun.addChild(gun12_r1);
		setRotationAngle(gun12_r1, 0.4712F, 0.0F, 0.0F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 18, 91, -3.0F, -9.0F, -1.0F, 3, 9, 1, 0.0F, false));

		gun12_r2 = new ModelRenderer(this);
		gun12_r2.setRotationPoint(0.501F, -18.0F, 3.9F);
		gun.addChild(gun12_r2);
		setRotationAngle(gun12_r2, -0.7854F, 0.0F, 0.0F);
		gun12_r2.cubeList.add(new ModelBox(gun12_r2, 8, 82, -3.0F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(-1.699F, -17.8F, 2.5F);
		gun.addChild(gun13_r1);
		setRotationAngle(gun13_r1, -0.4014F, 0.0F, 0.0F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 55, 85, -1.001F, 0.0F, -1.0F, 1, 1, 1, 0.3F, false));
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 86, 0, 1.399F, 0.0F, -1.0F, 1, 1, 1, 0.3F, false));

		gun10_r2 = new ModelRenderer(this);
		gun10_r2.setRotationPoint(-5.1F, -31.45F, -8.8F);
		gun.addChild(gun10_r2);
		setRotationAngle(gun10_r2, 0.3543F, 0.0F, 0.0F);
		gun10_r2.cubeList.add(new ModelBox(gun10_r2, 86, 2, 2.0F, 3.0F, 1.0F, 1, 1, 1, 0.0F, false));

		gun9_r2 = new ModelRenderer(this);
		gun9_r2.setRotationPoint(-1.9F, -31.35F, -8.6F);
		gun.addChild(gun9_r2);
		setRotationAngle(gun9_r2, 0.3543F, 0.0F, 0.0F);
		gun9_r2.cubeList.add(new ModelBox(gun9_r2, 24, 31, 2.0F, 3.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(-2.3F, -31.2F, -9.0F);
		gun.addChild(gun8_r1);
		setRotationAngle(gun8_r1, 0.3543F, 0.0F, 0.0F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 14, 68, 2.0F, 3.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(-2.5F, -30.7F, -9.2F);
		gun.addChild(gun7_r1);
		setRotationAngle(gun7_r1, 0.3543F, 0.0F, 0.0F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 78, 120, 0.0F, 0.0F, 0.0F, 3, 14, 6, 0.0F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(-3.0F, -30.0F, -8.0F);
		gun.addChild(gun6_r1);
		setRotationAngle(gun6_r1, 0.3718F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 41, 93, 0.0F, -1.0F, 0.0F, 4, 15, 6, 0.0F, false));

		gun145_r1 = new ModelRenderer(this);
		gun145_r1.setRotationPoint(-2.6F, -30.0F, -5.8F);
		gun.addChild(gun145_r1);
		setRotationAngle(gun145_r1, 0.0F, 0.0F, 0.7854F);
		gun145_r1.cubeList.add(new ModelBox(gun145_r1, 80, 18, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun145_r2 = new ModelRenderer(this);
		gun145_r2.setRotationPoint(0.5F, -33.3F, -7.95F);
		gun.addChild(gun145_r2);
		setRotationAngle(gun145_r2, 0.0F, 0.0F, 0.7854F);
		gun145_r2.cubeList.add(new ModelBox(gun145_r2, 75, 68, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun144_r1 = new ModelRenderer(this);
		gun144_r1.setRotationPoint(0.6F, -30.0F, -5.8F);
		gun.addChild(gun144_r1);
		setRotationAngle(gun144_r1, 0.0F, 0.0F, 0.7854F);
		gun144_r1.cubeList.add(new ModelBox(gun144_r1, 80, 25, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		fmg9 = new ModelRenderer(this);
		fmg9.setRotationPoint(0.0F, 24.0F, 0.0F);
		fmg9.cubeList.add(new ModelBox(fmg9, 0, 0, -3.5F, -37.7F, -32.0F, 5, 7, 15, 0.0F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 75, 48, 0.25F, -36.7F, -37.5F, 1, 6, 2, 0.0F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 64, 23, 0.25F, -37.95F, -38.5F, 1, 8, 1, 0.0F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 51, 0, -2.0F, -39.5F, -38.4F, 2, 2, 39, 0.101F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 56, 74, -2.0F, -40.25F, -38.6F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 43, 72, -2.0F, -40.25F, -37.1F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 72, 29, -2.0F, -40.25F, -35.6F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 72, 27, -2.0F, -40.25F, -34.1F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 72, 25, -2.0F, -40.25F, -32.6F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 72, 9, -2.0F, -40.25F, -31.1F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 72, 11, -2.0F, -40.25F, -29.6F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 72, 18, -2.0F, -40.25F, -28.1F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 72, 20, -2.0F, -40.25F, -26.6F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 72, 22, -2.0F, -40.25F, -25.1F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 0, 72, -2.0F, -40.25F, -23.6F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 72, 0, -2.0F, -40.25F, -22.1F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 72, 2, -2.0F, -40.25F, -20.6F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 72, 4, -2.0F, -40.25F, -19.1F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 72, 7, -2.0F, -40.25F, -17.6F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 55, 65, -2.0F, -40.25F, -16.1F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 0, 68, -2.0F, -40.25F, -14.6F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 43, 68, -2.0F, -40.25F, -13.1F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 0, 70, -2.0F, -40.25F, -11.6F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 43, 70, -2.0F, -40.25F, -10.1F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 21, 55, -2.0F, -40.25F, -8.6F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 59, 13, -2.0F, -40.25F, -7.1F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 64, 61, -2.0F, -40.25F, -5.6F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 64, 63, -2.0F, -40.25F, -4.1F, 2, 1, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 82, 14, -2.0F, -40.25F, -2.6F, 2, 1, 2, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 82, 32, -2.0F, -39.0F, -0.1F, 2, 1, 2, 0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 0, 91, -2.0F, -39.0F, 2.35F, 2, 1, 37, 0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 0, 61, -2.0F, -38.75F, 1.85F, 2, 2, 1, 0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 43, 61, -2.0F, -39.0F, 39.15F, 2, 2, 4, 0.101F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 72, 0, 0.25F, -37.6F, -37.5F, 1, 1, 6, -0.001F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 99, 119, -3.5F, -37.7F, -5.0F, 5, 7, 7, 0.0F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 122, 0, -0.5F, -37.7F, -14.0F, 2, 6, 9, 0.0F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 51, 18, -3.5F, -37.7F, -14.0F, 1, 6, 5, 0.0F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 90, 67, -3.5F, -35.7F, -9.0F, 1, 4, 4, 0.0F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 24, 22, -3.5F, -37.45F, -17.0F, 5, 6, 3, 0.0F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 0, 48, -3.5F, -36.7F, -36.0F, 5, 6, 4, 0.001F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 89, 80, 0.6F, -31.7F, -36.0F, 1, 1, 38, 0.002F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 80, 7, 0.6F, -32.3F, -5.0F, 1, 1, 4, 0.001F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 80, 0, -3.6F, -32.3F, -5.0F, 1, 1, 4, 0.001F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 64, 68, 0.6F, -37.7F, 0.0F, 1, 6, 2, 0.002F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 0, 0, -3.5F, -37.7F, 2.25F, 5, 7, 41, 0.002F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 51, 0, -3.5F, -30.7F, 41.25F, 5, 7, 2, 0.002F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 0, 22, -3.0F, -39.15F, 2.25F, 4, 2, 16, 0.002F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 24, 31, -1.25F, -40.3F, 2.85F, 1, 1, 6, 0.002F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 0, 31, -1.75F, -40.3F, 2.85F, 1, 1, 6, 0.001F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 64, 78, -3.5F, -37.7F, 1.75F, 5, 7, 1, -0.1F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 51, 68, 0.7F, -32.6F, 0.1F, 1, 2, 4, 0.002F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 134, 146, 0.75F, -32.85F, -36.0F, 1, 1, 19, 0.001F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 0, 68, -3.75F, -32.85F, -36.0F, 1, 1, 19, 0.001F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 86, 41, -3.6F, -31.7F, -36.0F, 1, 1, 38, 0.002F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 32, 48, -3.25F, -36.7F, -37.5F, 1, 6, 2, 0.0F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 86, 48, -3.25F, -37.95F, -38.5F, 4, 8, 1, 0.002F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 25, 0, -2.15F, -30.15F, -38.5F, 2, 3, 1, 0.003F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 0, 10, -0.85F, -30.15F, -38.5F, 1, 3, 1, 0.001F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 0, 68, -3.25F, -37.6F, -37.5F, 1, 1, 6, -0.001F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 8, 68, -3.7F, -32.6F, 0.1F, 1, 2, 4, 0.002F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 64, 48, -3.6F, -37.7F, 0.0F, 1, 6, 2, 0.002F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 72, 18, 0.75F, -32.85F, -14.0F, 1, 1, 6, 0.001F, false));
		fmg9.cubeList.add(new ModelBox(fmg9, 43, 56, -3.5F, -37.2F, -36.0F, 5, 1, 4, -0.001F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.5F, -30.7F, -36.0F);
		fmg9.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1396F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 61, 36, -5.0F, -6.5F, 0.0F, 5, 1, 1, -0.002F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 91, -5.0F, -6.0F, 0.0F, 5, 6, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.75F, -32.85F, -14.0F);
		fmg9.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -1.0297F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 75, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 49, 130, -1.0F, -1.0F, -22.0F, 1, 1, 19, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.75F, -31.85F, -14.0F);
		fmg9.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.925F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 72, 25, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 70, 146, -1.0F, -1.0F, -22.0F, 1, 1, 19, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.6F, -37.7F, 0.0F);
		fmg9.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.4014F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 64, 18, 0.0F, 4.0F, 2.0F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 68, 0.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 68, 4.2F, 4.0F, 2.0F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 68, 4.2F, 0.0F, 0.0F, 1, 6, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.9F, -31.4F, 2.6F);
		fmg9.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.5236F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 85, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 33, 85, 4.8F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.9F, -31.4F, 0.3F);
		fmg9.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.5236F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 85, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 85, 4.8F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.5F, -37.7F, -5.0F);
		fmg9.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 22, 0.0F, -2.0F, 0.0F, 1, 2, 7, 0.001F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 58, 29, 0.0F, -2.0F, -4.0F, 1, 1, 4, 0.001F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 78, 0.0F, -2.0F, -9.0F, 1, 2, 5, 0.001F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 108, -0.2F, -2.2F, -22.5F, 1, 1, 14, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 51, 29, 0.0F, -2.0F, -27.0F, 1, 1, 5, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 94, 13, -0.2F, -0.8F, -22.8F, 1, 1, 11, -0.201F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 71, 81, 0.0F, -1.0F, -27.0F, 1, 1, 5, 0.001F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 43, 68, 0.0F, -2.0F, -32.6F, 1, 1, 6, -0.001F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 84, 0.0F, -2.0F, -33.5F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 78, 83, 0.0F, -1.35F, -33.5F, 1, 1, 1, 0.001F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 48, 0.0F, -2.0F, 7.25F, 1, 2, 41, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-3.75F, -32.85F, -36.0F);
		fmg9.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 1.0297F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 129, 0.0F, -1.0F, 0.0F, 1, 1, 19, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.75F, -31.85F, -36.0F);
		fmg9.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.925F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 43, 68, 0.0F, -1.0F, 0.0F, 1, 1, 19, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.0F, -39.15F, 2.25F);
		fmg9.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7505F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 86, 59, 0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 51, 9, 0.7F, 0.0F, 0.6F, 1, 1, 6, -0.001F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.0F, -39.15F, 18.25F);
		fmg9.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, -0.0733F, -0.7505F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 104, 59, 0.0F, 0.0F, -9.5F, 1, 1, 9, -0.001F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.0F, -39.15F, 2.25F);
		fmg9.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7505F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 58, -1.7F, 0.0F, 0.6F, 1, 1, 6, -0.001F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 91, -1.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.0F, -39.15F, 18.25F);
		fmg9.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0733F, 0.7505F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 106, 27, -1.0F, 0.0F, -9.5F, 1, 1, 9, -0.001F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.25F, -40.3F, 2.85F);
		fmg9.addChild(cube_r14);
		setRotationAngle(cube_r14, -1.0123F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 82, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 82, -1.5F, 0.0F, 0.0F, 1, 1, 1, 0.001F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.75F, -40.3F, 8.85F);
		fmg9.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.0524F, -0.0523F, 0.0027F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 68, 0.0F, 0.0F, 0.0F, 1, 1, 9, -0.001F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-0.25F, -40.3F, 8.85F);
		fmg9.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.0524F, 0.0523F, -0.0027F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 64, 68, -1.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.75F, -40.3F, 8.85F);
		fmg9.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.0524F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 99, 81, -1.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 78, 81, 0.0F, 0.0F, 8.4F, 1, 1, 1, -0.001F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 75, -1.5F, 0.0F, 8.4F, 2, 1, 1, 0.001F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 104, 41, -0.5F, 0.0F, 0.0F, 1, 1, 9, 0.002F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(1.5F, -23.7F, 41.25F);
		fmg9.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.2618F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -5.0F, -8.0F, 0.0F, 5, 8, 2, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(1.9F, -31.9F, -15.25F);
		fmg9.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, -0.1222F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 35, 82, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.1F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.7F, -31.9F, -16.75F);
		fmg9.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0524F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 21, 61, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.9F, -40.15F, -2.5F);
		fmg9.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 35, 58, -0.1F, -0.1F, -0.1F, 1, 1, 2, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 68, 48, -0.1F, -0.1F, -1.6F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 68, -0.1F, -0.1F, -3.1F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 63, 0, -0.1F, -0.1F, -4.6F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 51, 32, -0.1F, -0.1F, -6.1F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 69, 75, -0.1F, -0.1F, -7.6F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 37, 75, -0.1F, -0.1F, -9.1F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 57, 70, -0.1F, -0.1F, -10.6F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 69, 55, -0.1F, -0.1F, -12.1F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 57, 68, -0.1F, -0.1F, -13.6F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 79, -0.1F, -0.1F, -15.1F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 35, 78, -0.1F, -0.1F, -16.6F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 77, 62, -0.1F, -0.1F, -18.1F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 77, 58, -0.1F, -0.1F, -19.6F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 56, 76, -0.1F, -0.1F, -21.1F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 80, 20, -0.1F, -0.1F, -22.6F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 80, 14, -0.1F, -0.1F, -24.1F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 80, 7, -0.1F, -0.1F, -25.6F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 80, 0, -0.1F, -0.1F, -27.1F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 79, 48, -0.1F, -0.1F, -28.6F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 21, 80, -0.1F, -0.1F, -30.1F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 80, 27, -0.1F, -0.1F, -31.6F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 80, 55, -0.1F, -0.1F, -33.1F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 80, 59, -0.1F, -0.1F, -34.6F, 1, 1, 1, -0.101F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 80, 63, -0.1F, -0.1F, -36.1F, 1, 1, 1, -0.101F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.1F, -40.15F, -2.5F);
		fmg9.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 21, 58, -0.9F, -0.1F, -0.1F, 1, 1, 2, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 36, 68, -0.9F, -0.1F, -1.6F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 64, 15, -0.9F, -0.1F, -3.1F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 37, 55, -0.9F, -0.1F, -4.6F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 36, 48, -0.9F, -0.1F, -6.1F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 53, 75, -0.9F, -0.1F, -7.6F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 26, 75, -0.9F, -0.1F, -9.1F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 51, 70, -0.9F, -0.1F, -10.6F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 68, 68, -0.9F, -0.1F, -12.1F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 51, 68, -0.9F, -0.1F, -13.6F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 57, 78, -0.9F, -0.1F, -15.1F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 21, 78, -0.9F, -0.1F, -16.6F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 77, 60, -0.9F, -0.1F, -18.1F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 77, -0.9F, -0.1F, -19.6F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 75, 75, -0.9F, -0.1F, -21.1F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 80, 18, -0.9F, -0.1F, -22.6F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 80, 9, -0.9F, -0.1F, -24.1F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 80, 2, -0.9F, -0.1F, -25.6F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 79, 75, -0.9F, -0.1F, -27.1F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 79, 36, -0.9F, -0.1F, -28.6F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 80, 25, -0.9F, -0.1F, -30.1F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 35, 80, -0.9F, -0.1F, -31.6F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 57, 80, -0.9F, -0.1F, -33.1F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 80, 61, -0.9F, -0.1F, -34.6F, 1, 1, 1, -0.101F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 80, 68, -0.9F, -0.1F, -36.1F, 1, 1, 1, -0.101F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-3.25F, -29.95F, -38.5F);
		fmg9.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -0.3665F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 25, 8, 0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(1.25F, -29.95F, -38.5F);
		fmg9.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.3665F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 31, -2.0F, 0.0F, 0.0F, 2, 3, 1, -0.001F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(1.5F, -28.95F, -33.0F);
		fmg9.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.1222F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 8, 58, -4.0F, -3.0F, 0.0F, 3, 4, 2, -0.001F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 43, 75, -4.5F, 0.0F, 0.0F, 4, 6, 2, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(1.0F, -28.95F, -33.0F);
		fmg9.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.4712F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 51, 36, -4.0F, 5.0F, -3.5F, 4, 1, 2, -0.001F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(1.5F, -37.7F, -38.6F);
		fmg9.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 72, 7, -1.0F, -2.0F, 1.0F, 1, 1, 6, -0.001F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 29, 85, -1.0F, -1.35F, 0.1F, 1, 1, 1, 0.001F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 51, 85, -1.0F, -2.0F, 0.1F, 1, 1, 1, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 43, 50, -1.0F, -2.0F, 40.85F, 1, 2, 41, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 94, 0, -0.8F, -2.2F, 13.1F, 1, 1, 12, -0.201F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 86, 41, -1.0F, -2.0F, 24.6F, 1, 2, 16, 0.001F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 58, 18, -1.0F, -2.0F, 6.6F, 1, 1, 4, 0.001F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 94, 93, -1.0F, -1.0F, 6.6F, 1, 1, 15, 0.001F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(1.25F, -37.4F, -17.05F);
		fmg9.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 94, 27, -1.0F, -2.0F, -7.0F, 1, 2, 10, 0.1F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(1.15F, -37.6F, -37.7F);
		fmg9.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.7854F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 25, 8, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.001F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.5F, -39.25F, -24.7F);
		fmg9.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 10, -2.0F, -0.25F, -3.15F, 2, 1, 4, -0.001F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 35, -2.0F, 0.0F, -3.3F, 2, 1, 1, -0.002F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 82, -2.0F, 0.25F, -3.15F, 2, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 9, 27, -2.0F, 0.0F, 0.0F, 2, 1, 1, -0.002F, false));

		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
		fmg9.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
