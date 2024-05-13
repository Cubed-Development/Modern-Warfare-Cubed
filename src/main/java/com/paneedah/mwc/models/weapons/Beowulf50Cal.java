package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Beowulf50Cal extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun30_r1;
	private final ModelRenderer gun29_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun50_r1;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun66_r1;
	private final ModelRenderer gun80_r1;
	private final ModelRenderer gun82_r1;
	private final ModelRenderer gun118_r1;
	private final ModelRenderer gun117_r1;
	private final ModelRenderer gun118_r2;
	private final ModelRenderer gun119_r1;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun599_r1;
	private final ModelRenderer gun598_r1;
	private final ModelRenderer gun597_r1;
	private final ModelRenderer gun596_r1;
	private final ModelRenderer bone_r1;
	private final ModelRenderer gun132;
	private final ModelRenderer gun67;
	private final ModelRenderer gun60;
	private final ModelRenderer barrel;
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

	public Beowulf50Cal() {
		textureWidth = 256;
		textureHeight = 256;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 0, 0, -1.95F, -39.5F, -24.5F, 1, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 25, -3.45F, -38.0F, -24.5F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 46, 0, -0.5F, -34.0F, -5.5F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 18, -0.25F, -36.5F, -12.75F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 21, -0.3F, -35.6F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 43, -0.3F, -35.6F, -12.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 0, -2.2F, -39.451F, -0.997F, 1, 4, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 17, -1.8F, -39.45F, -0.999F, 1, 4, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 55, -3.9F, -38.4F, 1.002F, 2, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 29, 6, -3.9F, -37.4F, 1.002F, 2, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 16, 55, -1.1F, -38.4F, 1.002F, 2, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 35, -1.1F, -37.4F, 1.002F, 2, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 149, -2.5F, -40.1F, -22.5F, 2, 1, 22, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 0, -0.35F, -32.8F, -16.5F, 1, 6, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 8, 43, -3.7F, -33.9F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 44, -3.8F, -32.5F, -12.4F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 47, -3.8F, -32.5F, -13.7F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 17, -3.8F, -34.3F, -14.7F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 55, 18, -3.8F, -35.3F, -21.4F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 148, -3.25F, -37.0F, -22.0F, 1, 1, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 142, 30, -0.8F, -38.0F, -22.5F, 1, 2, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 33, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 79, -3.3F, -36.0F, -1.0F, 3, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 31, -0.7F, -36.0F, -1.0F, 1, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 26, -3.5F, -35.7F, -22.7F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 18, -0.4F, -33.5F, -16.3F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 0, -0.35F, -36.5F, -16.5F, 1, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 24, -3.5F, -36.0F, -13.2F, 4, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 55, -3.5F, -36.0F, -21.2F, 4, 8, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 10, -3.5F, -28.0F, -18.2F, 4, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 17, -3.3F, -36.0F, -14.0F, 3, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 0, -0.7F, -36.0F, -14.0F, 1, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 29, 0, -3.0F, -32.0F, -13.8F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 54, 56, -3.0F, -27.0F, -13.3F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 17, 39, -3.0F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-3.2F, -31.0F, -7.6F);
		gun.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 17, 45, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-3.2F, -27.0F, -7.6F);
		gun.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.3562F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 0, 35, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -27.0F, -11.5F);
		gun.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 55, 0, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun50_r1 = new ModelRenderer(this);
		gun50_r1.setRotationPoint(-3.9F, -27.5F, -21.2F);
		gun.addChild(gun50_r1);
		setRotationAngle(gun50_r1, 1.3756F, 0.0F, 0.0F);
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 28, 39, 0.1F, -0.1194F, 0.0981F, 4, 8, 1, 0.0F, false));
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 34, 25, 3.7F, -0.1194F, 0.0981F, 1, 8, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-3.5F, -32.0F, -11.2F);
		gun.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.7884F, 0.0F, 0.0F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 45, 9, 2.999F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-3.5F, -34.5F, -22.7F);
		gun.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.9082F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 10, 35, 0.0F, -0.123F, 0.1577F, 4, 2, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -30.2F, -8.95F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 0, 9, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun66_r1 = new ModelRenderer(this);
		gun66_r1.setRotationPoint(-0.7F, -33.5F, 1.5F);
		gun.addChild(gun66_r1);
		setRotationAngle(gun66_r1, -2.3423F, 0.0F, 0.0F);
		gun66_r1.cubeList.add(new ModelBox(gun66_r1, 0, 17, -0.01F, 0.0638F, -1.4959F, 1, 3, 5, 0.0F, false));

		gun80_r1 = new ModelRenderer(this);
		gun80_r1.setRotationPoint(-3.8F, -31.3F, -14.7F);
		gun.addChild(gun80_r1);
		setRotationAngle(gun80_r1, 0.0F, 0.0F, -0.2603F);
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 48, 48, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(-3.8F, -34.3F, -14.7F);
		gun.addChild(gun82_r1);
		setRotationAngle(gun82_r1, 0.0F, 0.7436F, 0.0F);
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 11, 9, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun118_r1 = new ModelRenderer(this);
		gun118_r1.setRotationPoint(-3.9F, -38.4F, 1.0F);
		gun.addChild(gun118_r1);
		setRotationAngle(gun118_r1, 0.0F, 0.0F, -2.1293F);
		gun118_r1.cubeList.add(new ModelBox(gun118_r1, 31, 10, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun117_r1 = new ModelRenderer(this);
		gun117_r1.setRotationPoint(0.9F, -38.4F, 1.0F);
		gun.addChild(gun117_r1);
		setRotationAngle(gun117_r1, 0.0F, 0.0F, 2.1293F);
		gun117_r1.cubeList.add(new ModelBox(gun117_r1, 40, 40, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun118_r2 = new ModelRenderer(this);
		gun118_r2.setRotationPoint(0.9F, -36.5F, 1.0F);
		gun.addChild(gun118_r2);
		setRotationAngle(gun118_r2, 0.0F, 0.0F, 2.0448F);
		gun118_r2.cubeList.add(new ModelBox(gun118_r2, 17, 49, 0.089F, -0.0456F, 0.0F, 2, 2, 2, 0.0F, false));

		gun119_r1 = new ModelRenderer(this);
		gun119_r1.setRotationPoint(-3.9F, -36.5F, 1.0F);
		gun.addChild(gun119_r1);
		setRotationAngle(gun119_r1, 0.0F, 0.0F, -0.4833F);
		gun119_r1.cubeList.add(new ModelBox(gun119_r1, 40, 8, -0.0465F, 0.0885F, 0.0F, 2, 2, 2, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.6F, -33.5F, -6.3F);
		gun.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 33, 19, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun599_r1 = new ModelRenderer(this);
		gun599_r1.setRotationPoint(-1.95F, -40.0F, -23.5F);
		gun.addChild(gun599_r1);
		setRotationAngle(gun599_r1, 0.0F, 0.0F, -2.3562F);
		gun599_r1.cubeList.add(new ModelBox(gun599_r1, 0, 39, -1.3452F, -2.3617F, -1.0F, 1, 2, 2, 0.0F, false));

		gun598_r1 = new ModelRenderer(this);
		gun598_r1.setRotationPoint(-0.95F, -40.0F, -23.5F);
		gun.addChild(gun598_r1);
		setRotationAngle(gun598_r1, 0.0F, 0.0F, -2.3562F);
		gun598_r1.cubeList.add(new ModelBox(gun598_r1, 25, 49, -2.3452F, -1.3617F, -1.0F, 2, 1, 2, 0.0F, false));

		gun597_r1 = new ModelRenderer(this);
		gun597_r1.setRotationPoint(-0.95F, -36.0F, -23.5F);
		gun.addChild(gun597_r1);
		setRotationAngle(gun597_r1, 0.0F, 0.0F, -2.3562F);
		gun597_r1.cubeList.add(new ModelBox(gun597_r1, 8, 39, -0.3452F, -0.3617F, -1.0F, 1, 2, 2, 0.0F, false));

		gun596_r1 = new ModelRenderer(this);
		gun596_r1.setRotationPoint(-1.95F, -36.0F, -23.5F);
		gun.addChild(gun596_r1);
		setRotationAngle(gun596_r1, 0.0F, 0.0F, -2.3562F);
		gun596_r1.cubeList.add(new ModelBox(gun596_r1, 50, 33, -0.3452F, -0.3617F, -1.0F, 2, 1, 2, 0.0F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.2F, -32.8F, -16.5F);
		gun.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 0.0F, 0.7854F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 0, 46, -0.3636F, -0.3636F, 0.0F, 1, 1, 2, 0.0F, false));
		bone_r1.cubeList.add(new ModelBox(bone_r1, 8, 46, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-0.15F, -36.2F, -12.8F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -1.2641F);
		gun132.cubeList.add(new ModelBox(gun132, 30, 53, -0.7277F, 0.0207F, -0.45F, 2, 1, 2, -0.2F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -33.5F, 1.5F);
		gun.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 0, 9, 0.01F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 0, 71, 0.3F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		gun.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		gun60.cubeList.add(new ModelBox(gun60, 48, 40, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 47, 21, -3.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(-0.5F, -12.8F, -29.0F);
		barrel.cubeList.add(new ModelBox(barrel, 80, 0, -1.5F, -2.0F, -33.5F, 1, 1, 38, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 78, -2.0F, -2.6F, -39.2F, 1, 1, 6, -0.3F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 46, -2.0F, 0.0F, -39.2F, 1, 1, 6, -0.3F, false));
		barrel.cubeList.add(new ModelBox(barrel, 30, 28, -1.3F, -2.3F, -39.5F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 9, 5, -1.3F, -0.3F, -39.5F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 4, 28, -1.3F, -2.3F, -37.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 7, -1.3F, -2.3F, -34.5F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 29, 26, -1.7F, -2.301F, -39.501F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 40, 33, -0.449F, -1.801F, -39.501F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 18, 10, -2.549F, -1.801F, -39.501F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 40, 18, -0.449F, -1.801F, -37.001F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 27, 17, -2.549F, -1.801F, -37.001F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 40, 0, -0.449F, -1.801F, -34.501F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 33, 16, -2.549F, -1.801F, -34.501F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 18, 13, -1.7F, -0.301F, -39.501F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 8, 28, -1.7F, -2.301F, -37.001F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 22, 0, -1.7F, -0.301F, -37.001F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 28, -1.7F, -2.301F, -34.501F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 19, 23, -1.7F, -0.301F, -34.501F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 57, 40, -1.0F, -2.599F, -39.2F, 1, 1, 6, -0.3F, false));
		barrel.cubeList.add(new ModelBox(barrel, 40, 47, -1.0F, 0.001F, -39.2F, 1, 1, 6, -0.3F, false));
		barrel.cubeList.add(new ModelBox(barrel, 48, 70, -0.25F, -2.0F, -39.3F, 1, 1, 6, -0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 19, 19, -2.75F, -2.0F, -39.3F, 1, 1, 6, -0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 40, 40, -0.25F, -0.6F, -39.3F, 1, 1, 6, -0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 39, -2.75F, -0.6F, -39.3F, 1, 1, 6, -0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 40, 1, -1.5F, -0.6F, -33.5F, 1, 1, 38, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 40, 79, -0.8F, -1.3F, -33.5F, 1, 1, 38, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 120, 69, -0.58F, -1.3F, -24.5F, 1, 1, 29, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 93, 120, -1.5F, -2.2F, -24.5F, 1, 1, 29, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 62, 119, -1.5F, -0.4F, -24.5F, 1, 1, 29, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 120, 0, -2.42F, -1.3F, -24.5F, 1, 1, 29, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 39, -2.2F, -1.3F, -33.5F, 1, 1, 38, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.5F, -1.0F, -33.5F);
		barrel.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 78, -1.0F, 0.0F, 0.0F, 1, 1, 38, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.5F, -1.0F, -33.5F);
		barrel.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.0F, 0.0F, 0.0F, 1, 1, 38, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5F, -2.0F, -33.5F);
		barrel.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 40, -1.0F, 0.0F, 0.0F, 1, 1, 38, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 117, -1.0F, 0.0F, 9.15F, 1, 1, 29, 0.15F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.5F, -1.0F, -24.4F);
		barrel.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 80, 40, -1.0F, 0.0F, 0.05F, 1, 1, 29, 0.15F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.5F, -1.0F, -24.4F);
		barrel.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 111, 39, -1.0F, 0.0F, 0.05F, 1, 1, 29, 0.15F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.5F, -2.0F, -24.4F);
		barrel.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 31, 118, -1.0F, 0.0F, 0.05F, 1, 1, 29, 0.15F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 80, 80, -1.0F, 0.0F, -9.1F, 1, 1, 38, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.7F, -2.3F, -39.5F);
		barrel.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 1.0297F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 60, 64, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.7F, 0.7F, -39.5F);
		barrel.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -1.0297F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 57, 47, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.3F, 0.7F, -39.5F);
		barrel.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 1.0297F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 62, 29, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.3F, -2.3F, -39.5F);
		barrel.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -1.0297F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 40, 69, -1.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
		barrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
