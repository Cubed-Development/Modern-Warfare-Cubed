package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK417Receiver extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun22_r1;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun30_r1;
	private final ModelRenderer gun29_r1;
	private final ModelRenderer gun29_r2;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun48_r1;
	private final ModelRenderer gun47_r1;
	private final ModelRenderer gun52_r1;
	private final ModelRenderer gun50_r1;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun66_r1;
	private final ModelRenderer gun82_r1;
	private final ModelRenderer gun119_r1;
	private final ModelRenderer gun116_r1;
	private final ModelRenderer gun117_r1;
	private final ModelRenderer gun116_r2;
	private final ModelRenderer gun115_r1;
	private final ModelRenderer gun118_r1;
	private final ModelRenderer gun117_r2;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun262_r1;
	private final ModelRenderer gun132;
	private final ModelRenderer gun67;
	private final ModelRenderer gun60;
	private final ModelRenderer receiver;
	private final ModelRenderer gun259_r1;
	private final ModelRenderer gun263_r1;
	private final ModelRenderer gun142_r1;
	private final ModelRenderer gun140_r1;
	private final ModelRenderer gun105_r1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer gun264;
	private final ModelRenderer gun170;
	private final ModelRenderer gun249;
	private final ModelRenderer handguard;
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
	private final ModelRenderer hk_grip;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip8_r1;
	private final ModelRenderer grip8_r2;
	private final ModelRenderer grip9_r1;
	private final ModelRenderer grip12_r1;
	private final ModelRenderer grip12_r2;
	private final ModelRenderer grip10_r1;
	private final ModelRenderer grip10_r2;
	private final ModelRenderer grip8_r3;
	private final ModelRenderer grip7_r1;
	private final ModelRenderer grip12_r3;
	private final ModelRenderer mag;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;

	public HK417Receiver() {
		textureWidth = 220;
		textureHeight = 220;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 45, 18, -1.8F, -37.2F, -66.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 26, -2.2F, -37.2F, -66.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 45, -2.2F, -37.6F, -66.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 53, -1.8F, -37.6F, -66.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 29, -1.6F, -37.4F, -66.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 56, -2.4F, -37.4F, -66.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 15, 88, -2.0F, -37.0F, -66.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 50, 89, -2.0F, -37.8F, -66.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -2.2F, -37.4F, -62.5F, 1, 1, 43, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 44, -1.8F, -37.4F, -62.5F, 1, 1, 43, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 1, -2.0F, -37.2F, -62.5F, 1, 1, 43, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 45, -2.0F, -37.6F, -62.5F, 1, 1, 43, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 54, 22, -0.5F, -33.7F, -5.5F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 74, 29, -0.15F, -36.2F, -12.75F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 75, 71, -0.3F, -35.3F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 75, 73, -0.3F, -35.3F, -12.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 63, -2.5F, -39.0F, 1.001F, 2, 4, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 49, -3.9F, -37.6F, 1.002F, 2, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 45, -1.1F, -37.6F, 1.002F, 2, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 39, 76, -3.7F, -33.6F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 64, -3.8F, -32.2F, -12.4F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 54, 29, -3.8F, -32.2F, -13.7F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 36, -3.8F, -34.2F, -14.7F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 64, 0, -3.8F, -35.0F, -21.4F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 36, -3.0F, -34.05F, -1.0F, 3, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 80, -3.0F, -31.7F, -4.0F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 36, -3.3F, -35.7F, -1.0F, 3, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 75, 64, -0.7F, -35.7F, -1.0F, 1, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 72, -3.5F, -35.4F, -24.5F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 0, -3.5F, -35.7F, -13.2F, 4, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 63, -3.5F, -35.7F, -23.2F, 4, 8, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 52, -3.0F, -35.7F, -24.501F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 75, 71, -0.349F, -32.85F, -17.25F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 36, -0.85F, -33.45F, -17.5F, 2, 1, 6, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 75, 25, -0.849F, -33.45F, -13.2F, 2, 1, 2, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 10, -0.85F, -32.25F, -17.5F, 2, 1, 6, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 34, 68, -0.849F, -32.25F, -13.2F, 2, 1, 2, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 49, -0.85F, -33.35F, -17.7F, 2, 2, 1, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 93, 97, -0.85F, -33.35F, -13.0F, 2, 2, 2, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 103, 98, -0.15F, -35.05F, -22.8F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 36, -3.5F, -27.7F, -19.2F, 4, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 62, -3.3F, -35.7F, -14.0F, 3, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 68, -0.7F, -35.7F, -14.0F, 1, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 93, 89, -3.0F, -31.7F, -13.8F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 70, -3.0F, -26.7F, -13.5F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 8, -3.001F, -26.7F, -7.6F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 14, -2.501F, -25.95F, -10.0F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 40, -2.502F, -25.951F, -10.2F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 95, -3.0F, -30.7F, -6.5F, 3, 5, 1, 0.0F, false));

		gun22_r1 = new ModelRenderer(this);
		gun22_r1.setRotationPoint(-0.5F, -26.65F, -11.65F);
		gun.addChild(gun22_r1);
		setRotationAngle(gun22_r1, 1.1781F, 0.0F, 0.0F);
		gun22_r1.cubeList.add(new ModelBox(gun22_r1, 30, 13, -2.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(-0.5F, -26.65F, -7.55F);
		gun.addChild(gun21_r1);
		setRotationAngle(gun21_r1, -1.1781F, 0.0F, 0.0F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 0, 31, -2.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-3.2F, -30.7F, -7.6F);
		gun.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 75, 52, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-3.2F, -26.7F, -7.6F);
		gun.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.3562F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 32, 52, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun29_r2 = new ModelRenderer(this);
		gun29_r2.setRotationPoint(-3.2F, -30.7F, -11.5F);
		gun.addChild(gun29_r2);
		setRotationAngle(gun29_r2, -2.3562F, 0.0F, 0.0F);
		gun29_r2.cubeList.add(new ModelBox(gun29_r2, 64, 6, 0.2F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -26.7F, -11.5F);
		gun.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 90, 39, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun48_r1 = new ModelRenderer(this);
		gun48_r1.setRotationPoint(0.85F, -34.05F, -22.8F);
		gun.addChild(gun48_r1);
		setRotationAngle(gun48_r1, 0.0F, 0.0F, 0.7854F);
		gun48_r1.cubeList.add(new ModelBox(gun48_r1, 103, 33, -1.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun47_r1 = new ModelRenderer(this);
		gun47_r1.setRotationPoint(0.85F, -35.05F, -22.8F);
		gun.addChild(gun47_r1);
		setRotationAngle(gun47_r1, 0.0F, 0.0F, 0.7854F);
		gun47_r1.cubeList.add(new ModelBox(gun47_r1, 103, 89, -1.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun52_r1 = new ModelRenderer(this);
		gun52_r1.setRotationPoint(1.05F, -33.05F, -12.3F);
		gun.addChild(gun52_r1);
		setRotationAngle(gun52_r1, -0.4363F, 0.0F, 0.0F);
		gun52_r1.cubeList.add(new ModelBox(gun52_r1, 75, 45, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun50_r1 = new ModelRenderer(this);
		gun50_r1.setRotationPoint(-3.9F, -27.2F, -23.2F);
		gun.addChild(gun50_r1);
		setRotationAngle(gun50_r1, 1.4192F, 0.0F, 0.0F);
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 19, 0, 0.1F, -0.1194F, 0.0981F, 4, 10, 1, 0.0F, false));
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 63, 53, 0.101F, -0.5F, 0.0981F, 4, 1, 1, 0.0F, false));
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 36, 75, 3.701F, -0.5F, 0.0981F, 1, 1, 1, 0.0F, false));
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 8, 88, 3.7F, -0.1194F, 0.0981F, 1, 10, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-3.5F, -31.7F, -11.2F);
		gun.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.7884F, 0.0F, 0.0F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 75, 98, 2.999F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-3.5F, -34.2F, -24.5F);
		gun.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.9082F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 63, 25, 0.0F, -0.123F, 0.1577F, 4, 2, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -29.9F, -8.95F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 0, 44, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun66_r1 = new ModelRenderer(this);
		gun66_r1.setRotationPoint(-0.7F, -33.7F, 1.8F);
		gun.addChild(gun66_r1);
		setRotationAngle(gun66_r1, -2.3423F, 0.0F, 0.0F);
		gun66_r1.cubeList.add(new ModelBox(gun66_r1, 85, 89, -0.01F, 0.0638F, -1.4959F, 1, 2, 6, 0.0F, false));

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(-3.8F, -34.0F, -14.7F);
		gun.addChild(gun82_r1);
		setRotationAngle(gun82_r1, 0.0F, 0.7436F, 0.0F);
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 45, 0, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun119_r1 = new ModelRenderer(this);
		gun119_r1.setRotationPoint(2.3F, -37.5F, 3.102F);
		gun.addChild(gun119_r1);
		setRotationAngle(gun119_r1, 0.0F, 0.0F, 0.2094F);
		gun119_r1.cubeList.add(new ModelBox(gun119_r1, 54, 49, -2.0F, 3.0F, 0.0F, 2, 1, 1, -0.3F, false));
		gun119_r1.cubeList.add(new ModelBox(gun119_r1, 54, 53, -2.0F, 0.0F, 0.0F, 2, 1, 1, -0.3F, false));
		gun119_r1.cubeList.add(new ModelBox(gun119_r1, 38, 13, -0.999F, -0.001F, -0.001F, 1, 4, 1, -0.3F, false));

		gun116_r1 = new ModelRenderer(this);
		gun116_r1.setRotationPoint(-3.9F, -36.6F, 1.002F);
		gun.addChild(gun116_r1);
		setRotationAngle(gun116_r1, 0.0F, 0.0F, -0.2618F);
		gun116_r1.cubeList.add(new ModelBox(gun116_r1, 64, 0, 0.0F, 0.0F, -0.003F, 2, 3, 3, 0.0F, false));

		gun117_r1 = new ModelRenderer(this);
		gun117_r1.setRotationPoint(-3.9F, -36.6F, 1.002F);
		gun.addChild(gun117_r1);
		setRotationAngle(gun117_r1, -0.6283F, 0.0F, -0.2618F);
		gun117_r1.cubeList.add(new ModelBox(gun117_r1, 15, 96, 0.001F, 0.0F, -0.003F, 2, 3, 2, 0.0F, false));

		gun116_r2 = new ModelRenderer(this);
		gun116_r2.setRotationPoint(0.9F, -36.6F, 1.002F);
		gun.addChild(gun116_r2);
		setRotationAngle(gun116_r2, -0.6283F, 0.0F, 0.2618F);
		gun116_r2.cubeList.add(new ModelBox(gun116_r2, 23, 96, -1.999F, 0.0F, -0.003F, 2, 3, 2, 0.0F, false));

		gun115_r1 = new ModelRenderer(this);
		gun115_r1.setRotationPoint(0.9F, -36.6F, 1.002F);
		gun.addChild(gun115_r1);
		setRotationAngle(gun115_r1, 0.0F, 0.0F, 0.2618F);
		gun115_r1.cubeList.add(new ModelBox(gun115_r1, 14, 80, -2.0F, 0.0F, -0.003F, 2, 3, 3, 0.0F, false));

		gun118_r1 = new ModelRenderer(this);
		gun118_r1.setRotationPoint(-3.9F, -37.6F, 1.0F);
		gun.addChild(gun118_r1);
		setRotationAngle(gun118_r1, 0.0F, 0.0F, -2.3562F);
		gun118_r1.cubeList.add(new ModelBox(gun118_r1, 75, 93, -1.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

		gun117_r2 = new ModelRenderer(this);
		gun117_r2.setRotationPoint(0.9F, -37.6F, 1.0F);
		gun.addChild(gun117_r2);
		setRotationAngle(gun117_r2, 0.0F, 0.0F, 2.3562F);
		gun117_r2.cubeList.add(new ModelBox(gun117_r2, 40, 97, 0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.6F, -33.2F, -6.3F);
		gun.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 75, 47, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun262_r1 = new ModelRenderer(this);
		gun262_r1.setRotationPoint(-4.3F, -36.2F, -21.0F);
		gun.addChild(gun262_r1);
		setRotationAngle(gun262_r1, 0.0F, 0.0F, -1.2641F);
		gun262_r1.cubeList.add(new ModelBox(gun262_r1, 72, 37, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-0.15F, -36.2F, -12.8F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -1.2641F);
		gun132.cubeList.add(new ModelBox(gun132, 55, 12, -0.9231F, 0.3973F, -0.25F, 2, 1, 1, -0.2F, false));
		gun132.cubeList.add(new ModelBox(gun132, 55, 10, -0.9231F, 0.3973F, 0.35F, 2, 1, 1, -0.2F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -33.5F, 1.5F);
		gun.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 0, 54, 0.01F, -0.1454F, -1.2808F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 64, 11, 0.299F, -0.8715F, -0.9123F, 3, 2, 4, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		gun.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		gun60.cubeList.add(new ModelBox(gun60, 39, 78, 0.0F, 0.8697F, -1.6043F, 1, 1, 1, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 36, 77, -3.2F, 0.8697F, -1.6043F, 1, 1, 1, 0.0F, false));

		receiver = new ModelRenderer(this);
		receiver.setRotationPoint(2.0F, -13.0F, -22.7F);
		receiver.cubeList.add(new ModelBox(receiver, 136, 110, -2.2F, -0.6F, -1.8F, 1, 1, 26, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 62, 36, -2.7F, -2.15F, 1.95F, 1, 2, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 45, 30, -4.3F, -1.88F, 21.95F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 45, 22, -3.7F, -1.88F, 21.95F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 85, 97, -5.8F, -0.6F, -1.8F, 1, 1, 3, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 75, 20, -5.8F, -0.6F, 0.7F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 90, 45, -5.8F, -0.6F, 12.2F, 1, 1, 12, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 90, 0, -2.199F, 0.4F, -1.8F, 1, 1, 13, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 70, 89, -5.799F, 0.4F, -1.8F, 1, 1, 13, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 154, 0, -4.5F, -3.1F, -1.8F, 2, 1, 23, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 143, 137, -4.6F, -2.8F, -1.801F, 2, 2, 24, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 54, 47, -4.6F, -2.8F, 22.199F, 2, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 75, 18, -3.4F, -2.801F, 22.2F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 152, -3.4F, -2.8F, -1.801F, 1, 2, 24, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 63, 45, -6.3F, -0.2F, 1.7F, 1, 1, 10, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 100, 142, -4.8F, -0.7F, 0.2F, 3, 2, 24, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 50, 153, -5.25F, 0.3F, 0.7F, 1, 1, 24, 0.0F, false));

		gun259_r1 = new ModelRenderer(this);
		gun259_r1.setRotationPoint(-4.8F, -2.0F, 10.7F);
		receiver.addChild(gun259_r1);
		setRotationAngle(gun259_r1, 0.0F, 0.0F, 0.632F);
		gun259_r1.cubeList.add(new ModelBox(gun259_r1, 64, 11, 0.0375F, 0.2204F, 0.0F, 1, 2, 1, 0.0F, false));
		gun259_r1.cubeList.add(new ModelBox(gun259_r1, 73, 56, 0.0375F, 0.2204F, -9.0F, 1, 2, 1, 0.0F, false));
		gun259_r1.cubeList.add(new ModelBox(gun259_r1, 63, 18, 0.0F, 0.0F, -9.0F, 1, 1, 10, 0.0F, false));

		gun263_r1 = new ModelRenderer(this);
		gun263_r1.setRotationPoint(-6.1F, 0.3F, 1.2F);
		receiver.addChild(gun263_r1);
		setRotationAngle(gun263_r1, 0.0F, 0.0F, -0.9295F);
		gun263_r1.cubeList.add(new ModelBox(gun263_r1, 19, 44, 0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		gun142_r1 = new ModelRenderer(this);
		gun142_r1.setRotationPoint(-6.7F, -0.6F, 18.1F);
		receiver.addChild(gun142_r1);
		setRotationAngle(gun142_r1, 0.0F, -0.2603F, 0.0F);
		gun142_r1.cubeList.add(new ModelBox(gun142_r1, 54, 26, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun140_r1 = new ModelRenderer(this);
		gun140_r1.setRotationPoint(-5.1F, -0.4F, 11.6F);
		receiver.addChild(gun140_r1);
		setRotationAngle(gun140_r1, 0.0F, -0.2603F, 0.0F);
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 46, 108, -0.01F, 0.0F, 0.0F, 2, 1, 7, 0.0F, false));
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 11, 108, -0.01F, -0.4F, 0.0F, 2, 1, 7, 0.0F, false));

		gun105_r1 = new ModelRenderer(this);
		gun105_r1.setRotationPoint(-2.5F, -3.1F, 21.2F);
		receiver.addChild(gun105_r1);
		setRotationAngle(gun105_r1, -0.3142F, 0.0F, 0.0F);
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 54, 45, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.8F, -0.6F, 0.45F);
		receiver.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.8203F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 63, 56, 0.0F, -2.0F, 0.25F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 92, 0.0F, -2.0F, -2.25F, 1, 2, 3, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-5.8F, -0.6F, 13.45F);
		receiver.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.8727F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 90, 14, 0.0F, -2.0F, -1.75F, 1, 2, 12, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.2F, -0.6F, -0.05F);
		receiver.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.8727F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 121, -1.0F, -2.0F, -1.75F, 1, 2, 26, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-5.8F, 0.4F, 11.2F);
		receiver.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.9076F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 88, 0.0F, -1.0F, 0.0F, 1, 1, 13, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.2F, 0.4F, 11.2F);
		receiver.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.9076F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 89, -1.0F, -1.0F, 0.0F, 1, 1, 13, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.7F, -0.15F, 1.95F);
		receiver.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.8727F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 62, -1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.7F, -0.15F, 2.95F);
		receiver.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -0.8727F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 62, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun264 = new ModelRenderer(this);
		gun264.setRotationPoint(-6.2F, -0.4F, 2.7F);
		receiver.addChild(gun264);
		setRotationAngle(gun264, 0.0F, 0.0F, 0.2974F);
		gun264.cubeList.add(new ModelBox(gun264, 100, 64, -0.0154F, 0.6322F, 0.0F, 1, 3, 8, 0.0F, false));
		gun264.cubeList.add(new ModelBox(gun264, 36, 72, -0.2528F, 1.438F, 3.5F, 1, 2, 1, 0.0F, false));
		gun264.cubeList.add(new ModelBox(gun264, 70, 96, -0.1121F, 0.9868F, 0.25F, 1, 2, 3, 0.0F, false));
		gun264.cubeList.add(new ModelBox(gun264, 35, 95, -0.1121F, 0.9868F, 4.75F, 1, 2, 3, 0.0F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(-5.9F, -2.2F, 12.7F);
		receiver.addChild(gun170);
		setRotationAngle(gun170, 0.0F, 0.0F, -0.192F);
		gun170.cubeList.add(new ModelBox(gun170, 90, 28, -1.3573F, 0.2945F, -1.0F, 3, 2, 1, 0.0F, false));

		gun249 = new ModelRenderer(this);
		gun249.setRotationPoint(-1.3F, 2.0F, 0.0F);
		gun170.addChild(gun249);
		setRotationAngle(gun249, 0.0F, 1.1154F, 0.0F);
		gun249.cubeList.add(new ModelBox(gun249, 78, 11, -0.0252F, -1.7055F, -0.0514F, 1, 2, 4, 0.0F, false));
		gun249.cubeList.add(new ModelBox(gun249, 54, 18, 0.9748F, -1.7055F, 1.9486F, 1, 2, 2, 0.0F, false));

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, -15.1F, -19.5F);
		handguard.cubeList.add(new ModelBox(handguard, 35, 89, -2.5F, -1.0F, -36.0F, 2, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 88, -2.5F, 3.8F, -36.001F, 2, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 120, -1.4F, 3.45F, -36.0F, 1, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 75, 45, -0.4F, 2.4F, -16.0F, 1, 2, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 75, 18, -3.6F, 2.4F, -16.0F, 1, 2, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 103, 78, -1.401F, 3.15F, -36.0F, 1, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 103, 110, -2.6F, 3.45F, -36.0F, 1, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 70, 90, -2.601F, 3.15F, -36.0F, 1, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 54, 0, 0.0F, 1.15F, -8.0F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 136, 64, 0.2F, 0.95F, -36.3F, 1, 2, 29, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 64, 122, -4.1F, 0.95F, -36.3F, 1, 2, 29, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 123, 33, 0.201F, 1.35F, -36.301F, 1, 2, 29, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 123, 0, -4.099F, 1.35F, -36.301F, 1, 2, 29, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 9, 44, -3.9F, 1.15F, -8.0F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 45, -1.3F, -0.7F, -36.0F, 1, 2, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 0, -2.7F, -0.7F, -36.0F, 1, 2, 31, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.0F, 3.15F, -8.0F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.5061F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 75, 77, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.0F, 1.15F, -8.0F);
		handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.5061F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 52, 83, -2.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.9F, 3.15F, -8.0F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.5061F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 76, 6, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.9F, 1.15F, -8.0F);
		handguard.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.5061F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 21, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.9F, 3.05F, -23.25F);
		handguard.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 1.0647F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 45, 45, -0.9F, -0.1F, -0.1F, 1, 2, 16, -0.1F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 58, 97, -0.899F, -0.1F, -6.45F, 1, 1, 3, -0.1F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 36, -0.9F, -0.1F, -3.85F, 1, 2, 2, -0.1F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 18, -0.9F, -0.1F, -12.85F, 1, 2, 7, -0.1F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.8F, 3.05F, -23.25F);
		handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -1.0647F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 45, 18, -0.1F, -0.1F, -0.1F, 1, 2, 16, -0.1F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 27, -0.1F, -0.1F, -3.85F, 1, 2, 2, -0.1F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 50, 97, -0.101F, -0.1F, -6.35F, 1, 1, 3, -0.1F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.1F, -0.1F, -12.85F, 1, 2, 7, -0.1F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.8F, 1.25F, -36.0F);
		handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 1.0647F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 45, 53, -0.1F, -1.9F, -0.1F, 1, 2, 2, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 18, -0.1F, -1.9F, 17.9F, 1, 2, 11, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 38, -0.1F, -1.9F, 13.4F, 1, 2, 2, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 45, 18, -0.1F, -1.9F, 8.9F, 1, 2, 2, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 45, 45, -0.1F, -1.9F, 4.4F, 1, 2, 2, -0.1F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.9F, 1.25F, -18.0F);
		handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -1.0647F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 0, -0.9F, -1.9F, -0.1F, 1, 2, 11, -0.1F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 34, -0.9F, -1.9F, -4.6F, 1, 2, 2, -0.1F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 45, 10, -0.9F, -1.9F, -9.1F, 1, 2, 2, -0.1F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 45, 26, -0.9F, -1.9F, -13.6F, 1, 2, 2, -0.1F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 18, -0.699F, -1.75F, -16.5F, 1, 1, 17, -0.3F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 45, 0, -0.699F, -0.7F, -16.5F, 1, 1, 17, -0.3F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 11, 54, -0.9F, -1.9F, -18.1F, 1, 2, 2, -0.1F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.8F, 1.25F, -34.4F);
		handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 1.0647F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -0.299F, -1.7F, -0.1F, 1, 1, 17, -0.3F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 44, -0.299F, -0.7F, -0.1F, 1, 1, 17, -0.3F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.6F, 4.4F, -11.0F);
		handguard.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.9163F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 56, 36, -0.999F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 19, 56, 2.201F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.6F, 4.4F, -16.0F);
		handguard.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.9163F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 45, 57, -0.999F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 57, 57, 2.201F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.9F, 4.1F, -12.0F);
		handguard.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.3142F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 69, 45, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 69, 63, 2.8F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-2.9F, 4.1F, -16.3F);
		handguard.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.3142F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 9, 64, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 39, 74, 2.8F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));

		hk_grip = new ModelRenderer(this);
		hk_grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		hk_grip.cubeList.add(new ModelBox(hk_grip, 90, 33, -3.0F, -30.7F, -1.0F, 3, 5, 1, 0.0F, false));
		hk_grip.cubeList.add(new ModelBox(hk_grip, 90, 78, -3.5F, -30.7F, -6.0F, 4, 5, 5, 0.0F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(-3.5F, -25.7F, -5.25F);
		hk_grip.addChild(grip3_r1);
		setRotationAngle(grip3_r1, 0.3194F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 19, 27, 0.001F, -0.2205F, -0.109F, 4, 1, 1, 0.0F, false));
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 90, 58, 0.0F, 0.7795F, -0.109F, 4, 9, 5, 0.0F, false));

		grip8_r1 = new ModelRenderer(this);
		grip8_r1.setRotationPoint(-2.1F, -29.7F, 0.0F);
		hk_grip.addChild(grip8_r1);
		setRotationAngle(grip8_r1, -0.7243F, 0.0F, 0.0F);
		grip8_r1.cubeList.add(new ModelBox(grip8_r1, 63, 18, -1.0F, -3.0F, -2.0F, 3, 5, 2, 0.0F, false));
		grip8_r1.cubeList.add(new ModelBox(grip8_r1, 0, 0, 1.2F, -3.0F, -2.0F, 1, 5, 2, 0.0F, false));

		grip8_r2 = new ModelRenderer(this);
		grip8_r2.setRotationPoint(-3.5F, -26.25F, -1.0F);
		hk_grip.addChild(grip8_r2);
		setRotationAngle(grip8_r2, -1.0345F, 0.0F, 0.0F);
		grip8_r2.cubeList.add(new ModelBox(grip8_r2, 14, 36, 0.0F, -0.8581F, -1.7357F, 4, 1, 5, 0.0F, false));

		grip9_r1 = new ModelRenderer(this);
		grip9_r1.setRotationPoint(-3.5F, -23.9F, 1.4F);
		hk_grip.addChild(grip9_r1);
		setRotationAngle(grip9_r1, -1.2789F, 0.0F, 0.0F);
		grip9_r1.cubeList.add(new ModelBox(grip9_r1, 19, 56, 0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

		grip12_r1 = new ModelRenderer(this);
		grip12_r1.setRotationPoint(-3.5F, -15.75F, 0.15F);
		hk_grip.addChild(grip12_r1);
		setRotationAngle(grip12_r1, 0.2269F, 0.0F, 0.0F);
		grip12_r1.cubeList.add(new ModelBox(grip12_r1, 63, 29, -0.001F, -2.0F, 0.0F, 4, 2, 3, 0.0F, false));

		grip12_r2 = new ModelRenderer(this);
		grip12_r2.setRotationPoint(-3.5F, -16.85F, -2.85F);
		hk_grip.addChild(grip12_r2);
		setRotationAngle(grip12_r2, -0.0349F, 0.0F, 0.0F);
		grip12_r2.cubeList.add(new ModelBox(grip12_r2, 30, 31, 0.001F, -1.0F, 1.0F, 4, 1, 2, 0.0F, false));
		grip12_r2.cubeList.add(new ModelBox(grip12_r2, 19, 13, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		grip10_r1 = new ModelRenderer(this);
		grip10_r1.setRotationPoint(-3.5F, -20.1F, 2.55F);
		hk_grip.addChild(grip10_r1);
		setRotationAngle(grip10_r1, -1.3662F, 0.0F, 0.0F);
		grip10_r1.cubeList.add(new ModelBox(grip10_r1, 19, 31, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		grip10_r2 = new ModelRenderer(this);
		grip10_r2.setRotationPoint(-3.0F, -20.3F, 3.05F);
		hk_grip.addChild(grip10_r2);
		setRotationAngle(grip10_r2, -1.3662F, 0.0F, 0.0F);
		grip10_r2.cubeList.add(new ModelBox(grip10_r2, 63, 71, 0.0F, 0.0F, 2.75F, 3, 1, 1, 0.0F, false));
		grip10_r2.cubeList.add(new ModelBox(grip10_r2, 31, 56, 0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

		grip8_r3 = new ModelRenderer(this);
		grip8_r3.setRotationPoint(-3.0F, -24.1F, 1.9F);
		hk_grip.addChild(grip8_r3);
		setRotationAngle(grip8_r3, -1.2789F, 0.0F, 0.0F);
		grip8_r3.cubeList.add(new ModelBox(grip8_r3, 63, 56, 0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

		grip7_r1 = new ModelRenderer(this);
		grip7_r1.setRotationPoint(-3.0F, -27.25F, -1.0F);
		hk_grip.addChild(grip7_r1);
		setRotationAngle(grip7_r1, -1.0345F, 0.0F, 0.0F);
		grip7_r1.cubeList.add(new ModelBox(grip7_r1, 73, 38, 0.0F, -0.8581F, 0.2643F, 3, 1, 4, 0.0F, false));

		grip12_r3 = new ModelRenderer(this);
		grip12_r3.setRotationPoint(-3.6F, -26.3F, -5.7F);
		hk_grip.addChild(grip12_r3);
		setRotationAngle(grip12_r3, 0.302F, 0.0F, 0.0F);
		grip12_r3.cubeList.add(new ModelBox(grip12_r3, 32, 14, 0.0F, 0.7795F, 0.891F, 1, 9, 4, 0.0F, false));
		grip12_r3.cubeList.add(new ModelBox(grip12_r3, 0, 62, 3.2F, 0.7795F, 0.891F, 1, 9, 4, 0.0F, false));

		mag = new ModelRenderer(this);
		mag.setRotationPoint(-2.25F, -7.0F, -13.7F);
		mag.cubeList.add(new ModelBox(mag, 90, 14, -0.9F, 0.299F, -1.999F, 2, 5, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 32, 0, -0.9F, 0.3F, -5.4F, 2, 5, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 9, 0, -0.9F, 0.3F, -8.9F, 2, 5, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 44, -0.7F, 0.298F, -6.9F, 2, 5, 5, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 90, 0, 0.4F, 0.3F, -2.0F, 2, 5, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 54, 55, -1.0F, 0.4F, -1.001F, 1, 2, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 55, 14, 1.501F, -0.5F, -1.001F, 1, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 27, 36, 1.501F, 0.2F, -8.801F, 1, 4, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 27, 1.501F, 0.2F, -7.801F, 1, 1, 7, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 39, 44, -1.0F, 3.0F, -1.0F, 1, 2, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 90, 72, -1.001F, 3.4F, -3.5F, 1, 1, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 74, 11, -1.001F, 1.4F, -3.5F, 1, 1, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 39, 0, -1.0F, 1.9F, -3.85F, 1, 2, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 90, 53, 1.501F, 3.4F, -3.5F, 1, 1, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 71, 64, 1.501F, 1.4F, -3.5F, 1, 1, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 26, 18, 1.5F, 1.9F, -3.85F, 1, 2, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 54, 1.5F, 0.4F, -1.001F, 1, 2, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 57, -1.001F, -0.5F, -1.001F, 1, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 14, 36, -1.001F, 0.2F, -8.801F, 1, 4, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 9, -1.001F, 0.2F, -7.801F, 1, 1, 7, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 26, 44, 1.5F, 3.0F, -1.0F, 1, 2, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 19, 44, 0.4F, 0.3F, -5.4F, 2, 5, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 9, 9, 0.4F, 0.3F, -8.9F, 2, 5, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 45, 0, 0.2F, 0.299F, -6.9F, 2, 5, 5, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.8F, 9.97F, -0.64F);
		mag.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.2531F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 60, -2.0F, 0.0F, -9.0F, 2, 6, 2, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 9, -2.0F, 0.0F, -4.0F, 2, 6, 1, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 63, 45, -2.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 19, 62, -0.1F, 0.0F, -9.0F, 2, 6, 2, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 73, -1.8F, 0.0F, -8.0F, 2, 6, 7, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 102, -0.3F, 0.0F, -8.0F, 2, 6, 7, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 63, 63, -0.1F, 0.0F, -2.0F, 2, 6, 2, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.8F, 5.0F, 0.0F);
		mag.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.1309F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 18, -2.0F, 0.0F, -9.0F, 2, 5, 2, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 18, -2.0F, 0.0F, -4.0F, 2, 5, 1, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 35, 88, -2.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 27, -0.1F, 0.0F, -9.0F, 2, 5, 2, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 35, 103, -1.8F, 0.0F, -8.0F, 2, 5, 7, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 70, 103, -0.3F, 0.0F, -8.0F, 2, 5, 7, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 70, 89, -0.1F, 0.0F, -2.0F, 2, 5, 2, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(1.2F, 9.87F, -0.84F);
		mag.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.2531F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 88, -1.95F, 0.0F, -9.0F, 3, 6, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.55F, 15.57F, -1.89F);
		mag.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.2531F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 19, 62, -2.0F, 0.0F, -9.0F, 3, 1, 9, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 90, 33, 0.4F, 0.0F, -9.0F, 2, 1, 9, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(2.7F, 13.39F, -10.19F);
		mag.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.2531F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 32, 27, -3.95F, 0.02F, -1.0F, 4, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(2.7F, 10.17F, -0.04F);
		mag.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.2531F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 19, 18, -2.0F, 0.0F, -6.0F, 2, 6, 3, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(1.3F, 5.0F, -0.2F);
		mag.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.1309F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 90, 7, -2.05F, 0.0F, -9.0F, 3, 5, 1, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(2.7F, 5.2F, 0.6F);
		mag.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.1309F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 32, 44, -2.0F, 0.0F, -6.0F, 2, 5, 3, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(2.1F, -0.5F, -5.0F);
		mag.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.2618F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 56, 36, -1.001F, 0.0F, -0.001F, 1, 1, 4, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-0.6F, -0.5F, -5.0F);
		mag.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, 0.2618F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 45, 81, -0.001F, 0.0F, -0.001F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		gun.render(f5);
		receiver.render(f5);
//		handguard.render(f5);
//		hk_grip.render(f5);
//		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
