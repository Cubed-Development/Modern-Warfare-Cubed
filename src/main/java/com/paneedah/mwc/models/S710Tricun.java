package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class S710Tricun extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun20_r1;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun22_r1;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun48_r1;
	private final ModelRenderer gun49_r1;
	private final ModelRenderer gun48_r2;
	private final ModelRenderer gun49_r2;
	private final ModelRenderer gun48_r3;
	private final ModelRenderer gun47_r1;
	private final ModelRenderer gun45_r1;
	private final ModelRenderer gun54_r1;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun60_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun69_r1;
	private final ModelRenderer gun69_r2;
	private final ModelRenderer gun66_r1;
	private final ModelRenderer gun67_r1;
	private final ModelRenderer gun77_r1;
	private final ModelRenderer gun76_r1;
	private final ModelRenderer gun77_r2;
	private final ModelRenderer gun76_r2;
	private final ModelRenderer gun84_r1;
	private final ModelRenderer gun118_r1;
	private final ModelRenderer gun117_r1;
	private final ModelRenderer gun118_r2;
	private final ModelRenderer gun119_r1;
	private final ModelRenderer gun133_r1;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r2;
	private final ModelRenderer barrel;
	private final ModelRenderer rail;
	private final ModelRenderer gun64_r1;
	private final ModelRenderer gun63_r3;
	private final ModelRenderer gun62_r2;
	private final ModelRenderer gun61_r1;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;

	public S710Tricun() {
		textureWidth = 200;
		textureHeight = 200;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 0, 26, -0.05F, -36.7F, -13.9F, 1, 3, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 91, -0.3F, -35.2F, -14.1F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 91, 7, -0.3F, -35.2F, -13.7F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 0, -2.5F, -39.3F, 0.001F, 2, 4, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 49, -3.9F, -37.9F, 1.0025F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 3, -0.1F, -37.9F, 1.002F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 0, -3.9F, -34.35F, -13.7F, 1, 2, 2, -0.25F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 64, -3.7F, -32.5F, -14.6F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 25, -3.7F, -35.2F, -20.6F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 26, -0.55F, -37.7F, -21.6F, 1, 3, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 25, 52, -3.45F, -36.7F, -21.6F, 1, 2, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 26, -0.8F, -36.7F, -22.4F, 1, 2, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 78, 81, -1.3F, -39.5F, -1.4F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 55, 73, -1.301F, -40.0F, -22.4F, 1, 2, 21, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 0, -1.302F, -40.0F, -1.9F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 0, -2.702F, -40.0F, -1.9F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 94, -1.4F, -40.5F, -22.4F, 1, 1, 20, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 21, -2.6F, -40.5F, -22.4F, 1, 1, 20, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 91, -2.5F, -40.8F, -4.52F, 2, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 55, -2.0F, -40.8F, -0.65F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 25, -2.701F, -40.0F, -22.4F, 1, 2, 21, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 80, -2.7F, -39.5F, -1.4F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -3.2F, -36.7F, -22.4F, 1, 2, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 78, 73, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 86, -3.5F, -36.0F, 1.0F, 4, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 20, -3.499F, -34.0F, -1.0F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 57, -3.5F, -32.1F, -5.85F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 26, -0.45F, -33.7F, -16.6F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 78, 86, -3.499F, -34.3F, -15.6F, 4, 2, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 26, -3.499F, -35.3F, -22.4F, 4, 1, 22, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 16, -3.501F, -34.3F, -21.05F, 4, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 94, -3.3F, -35.0F, -14.0F, 3, 4, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 74, -0.7F, -35.0F, -14.0F, 1, 4, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 76, -3.0F, -27.0F, -12.3F, 3, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 41, 12, -3.0F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));

		gun20_r1 = new ModelRenderer(this);
		gun20_r1.setRotationPoint(0.0F, -26.0F, -12.3F);
		gun.addChild(gun20_r1);
		setRotationAngle(gun20_r1, 0.2269F, 0.0F, 0.0F);
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 15, 0, -3.0F, -6.0F, 0.0F, 3, 6, 1, 0.0F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(-3.2F, -31.0F, -14.3F);
		gun.addChild(gun23_r1);
		setRotationAngle(gun23_r1, 0.7854F, 0.0F, 0.0F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 38, 7, 0.2F, 1.1414F, 0.1414F, 3, 1, 2, 0.0F, false));

		gun22_r1 = new ModelRenderer(this);
		gun22_r1.setRotationPoint(-3.2F, -31.0F, -7.8F);
		gun.addChild(gun22_r1);
		setRotationAngle(gun22_r1, 0.7854F, 0.0F, 0.0F);
		gun22_r1.cubeList.add(new ModelBox(gun22_r1, 79, 42, 0.2F, 0.1414F, 0.1414F, 3, 2, 1, 0.0F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(-3.2F, -27.0F, -7.8F);
		gun.addChild(gun21_r1);
		setRotationAngle(gun21_r1, 0.7854F, 0.0F, 0.0F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 38, 59, 0.2F, 0.1414F, 0.1414F, 3, 1, 2, 0.0F, false));

		gun48_r1 = new ModelRenderer(this);
		gun48_r1.setRotationPoint(0.5F, -32.35F, -17.0F);
		gun.addChild(gun48_r1);
		setRotationAngle(gun48_r1, 0.2182F, 0.0F, 0.0F);
		gun48_r1.cubeList.add(new ModelBox(gun48_r1, 79, 28, -1.0F, -4.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun48_r1.cubeList.add(new ModelBox(gun48_r1, 40, 91, -0.9F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun48_r1.cubeList.add(new ModelBox(gun48_r1, 0, 76, -0.9F, -3.0F, 0.0F, 1, 2, 2, 0.0F, false));
		gun48_r1.cubeList.add(new ModelBox(gun48_r1, 26, 39, -0.9F, 0.0F, 0.0F, 1, 6, 2, 0.0F, false));

		gun49_r1 = new ModelRenderer(this);
		gun49_r1.setRotationPoint(-3.75F, -25.4F, -19.25F);
		gun.addChild(gun49_r1);
		setRotationAngle(gun49_r1, 0.1536F, 0.1553F, -0.7854F);
		gun49_r1.cubeList.add(new ModelBox(gun49_r1, 76, 8, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun48_r2 = new ModelRenderer(this);
		gun48_r2.setRotationPoint(0.75F, -25.4F, -19.25F);
		gun.addChild(gun48_r2);
		setRotationAngle(gun48_r2, 0.1536F, -0.1553F, 0.7854F);
		gun48_r2.cubeList.add(new ModelBox(gun48_r2, 77, 48, -1.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun49_r2 = new ModelRenderer(this);
		gun49_r2.setRotationPoint(0.5F, -25.33F, -19.55F);
		gun.addChild(gun49_r2);
		setRotationAngle(gun49_r2, 0.9599F, 0.0F, 0.0F);
		gun49_r2.cubeList.add(new ModelBox(gun49_r2, 25, 60, -3.999F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun48_r3 = new ModelRenderer(this);
		gun48_r3.setRotationPoint(0.5F, -25.33F, -19.55F);
		gun.addChild(gun48_r3);
		setRotationAngle(gun48_r3, 0.2182F, 0.0F, 0.0F);
		gun48_r3.cubeList.add(new ModelBox(gun48_r3, 66, 40, -4.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun47_r1 = new ModelRenderer(this);
		gun47_r1.setRotationPoint(0.75F, -25.4F, -19.25F);
		gun.addChild(gun47_r1);
		setRotationAngle(gun47_r1, 0.2182F, 0.0F, 0.0F);
		gun47_r1.cubeList.add(new ModelBox(gun47_r1, 77, 56, -1.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));
		gun47_r1.cubeList.add(new ModelBox(gun47_r1, 26, 12, -4.5F, 0.0F, 0.0F, 4, 1, 7, 0.0F, false));

		gun45_r1 = new ModelRenderer(this);
		gun45_r1.setRotationPoint(0.5F, -33.7F, -21.1F);
		gun.addChild(gun45_r1);
		setRotationAngle(gun45_r1, 0.2182F, 0.0F, 0.0F);
		gun45_r1.cubeList.add(new ModelBox(gun45_r1, 0, 0, -4.0F, 0.0F, 0.0F, 4, 9, 7, 0.0F, false));

		gun54_r1 = new ModelRenderer(this);
		gun54_r1.setRotationPoint(0.501F, -34.3F, -22.4F);
		gun.addChild(gun54_r1);
		setRotationAngle(gun54_r1, 0.8727F, 0.0F, 0.0F);
		gun54_r1.cubeList.add(new ModelBox(gun54_r1, 38, 20, -4.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(0.501F, -32.3F, -12.8F);
		gun.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.3562F, 0.0F, 0.0F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 11, 59, -4.001F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun60_r1 = new ModelRenderer(this);
		gun60_r1.setRotationPoint(-0.4F, -35.1F, -21.7F);
		gun.addChild(gun60_r1);
		setRotationAngle(gun60_r1, -0.3316F, 0.0F, 0.0F);
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 91, 15, -3.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 91, 22, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -30.2F, -8.95F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 38, 52, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun69_r1 = new ModelRenderer(this);
		gun69_r1.setRotationPoint(0.5F, -31.1F, -2.85F);
		gun.addChild(gun69_r1);
		setRotationAngle(gun69_r1, -0.7854F, 0.0F, 0.0F);
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 26, 26, -0.999F, -4.0F, -1.0F, 1, 2, 1, 0.0F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 11, 52, -3.999F, -4.0F, -1.0F, 1, 4, 1, 0.0F, false));

		gun69_r2 = new ModelRenderer(this);
		gun69_r2.setRotationPoint(-3.5F, -32.1F, -5.85F);
		gun.addChild(gun69_r2);
		setRotationAngle(gun69_r2, 0.0F, -0.1047F, 0.0F);
		gun69_r2.cubeList.add(new ModelBox(gun69_r2, 77, 59, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		gun66_r1 = new ModelRenderer(this);
		gun66_r1.setRotationPoint(0.5F, -36.0F, 1.0F);
		gun.addChild(gun66_r1);
		setRotationAngle(gun66_r1, -1.1781F, 0.0F, 0.0F);
		gun66_r1.cubeList.add(new ModelBox(gun66_r1, 85, 104, -4.0F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

		gun67_r1 = new ModelRenderer(this);
		gun67_r1.setRotationPoint(-3.3F, -33.5F, 1.5F);
		gun.addChild(gun67_r1);
		setRotationAngle(gun67_r1, -2.3423F, 0.0F, 0.0F);
		gun67_r1.cubeList.add(new ModelBox(gun67_r1, 99, 44, 0.3F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));
		gun67_r1.cubeList.add(new ModelBox(gun67_r1, 62, 62, 2.599F, 0.0638F, -1.4959F, 1, 2, 5, 0.0F, false));
		gun67_r1.cubeList.add(new ModelBox(gun67_r1, 24, 83, 0.01F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));

		gun77_r1 = new ModelRenderer(this);
		gun77_r1.setRotationPoint(-0.5F, -40.8F, -6.9F);
		gun.addChild(gun77_r1);
		setRotationAngle(gun77_r1, 0.0F, 0.0F, -0.9163F);
		gun77_r1.cubeList.add(new ModelBox(gun77_r1, 63, 49, -0.7F, -0.3F, -0.2F, 1, 1, 5, -0.3F, false));

		gun76_r1 = new ModelRenderer(this);
		gun76_r1.setRotationPoint(-2.5F, -40.8F, -6.9F);
		gun.addChild(gun76_r1);
		setRotationAngle(gun76_r1, 0.0F, 0.0F, 0.9163F);
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 63, 55, -0.3F, -0.3F, -0.2F, 1, 1, 5, -0.3F, false));

		gun77_r2 = new ModelRenderer(this);
		gun77_r2.setRotationPoint(-0.5F, -40.8F, -0.52F);
		gun.addChild(gun77_r2);
		setRotationAngle(gun77_r2, 0.0F, -0.5236F, 0.0F);
		gun77_r2.cubeList.add(new ModelBox(gun77_r2, 30, 39, -1.0F, 0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		gun76_r2 = new ModelRenderer(this);
		gun76_r2.setRotationPoint(-2.5F, -40.8F, -0.52F);
		gun.addChild(gun76_r2);
		setRotationAngle(gun76_r2, 0.0F, 0.5236F, 0.0F);
		gun76_r2.cubeList.add(new ModelBox(gun76_r2, 44, 46, 0.0F, 0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		gun84_r1 = new ModelRenderer(this);
		gun84_r1.setRotationPoint(-3.7F, -32.5F, -14.6F);
		gun.addChild(gun84_r1);
		setRotationAngle(gun84_r1, -1.3439F, 0.0F, 0.0F);
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 18, 52, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun118_r1 = new ModelRenderer(this);
		gun118_r1.setRotationPoint(-3.9F, -37.9F, 1.0F);
		gun.addChild(gun118_r1);
		setRotationAngle(gun118_r1, 0.0F, 0.0F, -2.3562F);
		gun118_r1.cubeList.add(new ModelBox(gun118_r1, 69, 74, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun117_r1 = new ModelRenderer(this);
		gun117_r1.setRotationPoint(0.9F, -37.9F, 1.0F);
		gun.addChild(gun117_r1);
		setRotationAngle(gun117_r1, 0.0F, 0.0F, 2.3562F);
		gun117_r1.cubeList.add(new ModelBox(gun117_r1, 24, 76, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun118_r2 = new ModelRenderer(this);
		gun118_r2.setRotationPoint(0.9F, -37.0F, 1.0F);
		gun.addChild(gun118_r2);
		setRotationAngle(gun118_r2, 0.0F, 0.0F, 2.0448F);
		gun118_r2.cubeList.add(new ModelBox(gun118_r2, 36, 76, 0.089F, -0.0456F, 0.0F, 2, 2, 2, 0.0F, false));

		gun119_r1 = new ModelRenderer(this);
		gun119_r1.setRotationPoint(-3.9F, -37.0F, 1.0F);
		gun.addChild(gun119_r1);
		setRotationAngle(gun119_r1, 0.0F, 0.0F, -0.4833F);
		gun119_r1.cubeList.add(new ModelBox(gun119_r1, 9, 76, -0.0465F, 0.0885F, 0.0F, 2, 2, 2, 0.0F, false));

		gun133_r1 = new ModelRenderer(this);
		gun133_r1.setRotationPoint(-0.15F, -36.35F, -13.4F);
		gun.addChild(gun133_r1);
		setRotationAngle(gun133_r1, 0.0F, 0.0F, -1.2641F);
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 86, 50, -0.7277F, 0.0207F, -0.35F, 2, 1, 1, -0.1F, false));
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 86, 58, -0.7277F, 0.0207F, -0.65F, 2, 1, 1, -0.1F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.6F, -33.1F, -6.0F);
		gun.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 67, 91, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.8F, -32.7F, -5.6F);
		gun.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -0.7505F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 35, 85, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.1F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.1F, -32.8F, -17.1F);
		gun.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 0.0F, 0.7854F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 59, 91, -0.3636F, -0.3636F, 1.0F, 1, 1, 1, 0.0F, false));

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(0.1F, -33.0F, -17.3F);
		gun.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.0F, 0.0F, 0.7854F);
		bone_r2.cubeList.add(new ModelBox(bone_r2, 63, 91, -1.0F, -1.0F, 0.95F, 1, 1, 1, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 24.4F, 17.0F);
		barrel.cubeList.add(new ModelBox(barrel, 101, 21, -1.8F, -37.8F, -67.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 101, 27, -2.2F, -37.8F, -67.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 101, 94, -2.2F, -38.2F, -67.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 3, 105, -1.8F, -38.2F, -67.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 18, 105, -1.6F, -38.0F, -67.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 36, 105, -2.4F, -38.0F, -67.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 52, 105, -2.0F, -37.6F, -67.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 106, 60, -2.0F, -38.4F, -67.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 26, 0, -2.2F, -38.0F, -62.5F, 1, 1, 23, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 1, -1.8F, -38.0F, -62.5F, 1, 1, 23, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 52, -2.0F, -37.8F, -62.5F, 1, 1, 23, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 52, 49, -2.0F, -38.2F, -62.5F, 1, 1, 23, 0.0F, false));

		rail = new ModelRenderer(this);
		rail.setRotationPoint(-0.1F, -16.0F, -19.5F);
		rail.cubeList.add(new ModelBox(rail, 100, 69, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 76, 0, -0.801F, -0.8F, 4.5F, 1, 1, 7, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 100, 6, -1.0F, -1.0F, 5.5F, 1, 1, 5, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 0, 57, -1.0F, -1.0F, 11.0F, 1, 1, 3, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 76, 0, -2.4F, -1.75F, -4.9F, 2, 1, 20, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 78, 73, -1.5F, -1.25F, -4.899F, 1, 1, 20, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 77, 48, -2.3F, -1.25F, -4.899F, 1, 1, 20, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 24, 90, -2.4F, -1.75F, -20.9F, 2, 1, 5, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 52, 98, -0.9F, -1.25F, -21.15F, 1, 1, 6, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 18, 98, -2.9F, -1.25F, -21.15F, 1, 1, 6, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 116, 127, -2.601F, -1.95F, -16.4F, 1, 1, 12, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 102, 126, -1.201F, -1.95F, -16.4F, 1, 1, 12, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 52, 113, -2.8F, -1.0F, 0.0F, 1, 1, 14, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 51, 19, -2.701F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 26, 16, -2.801F, -0.5F, 12.0F, 1, 1, 2, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 87, 82, -3.7F, -0.75F, 0.5F, 1, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 87, 80, -3.7F, -0.75F, 12.5F, 1, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 0, 16, -4.1F, -1.25F, 12.0F, 1, 2, 2, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 0, 0, -4.1F, -1.25F, 0.0F, 1, 2, 2, -0.3F, false));

		gun64_r1 = new ModelRenderer(this);
		gun64_r1.setRotationPoint(-3.2F, -1.4F, -20.4F);
		rail.addChild(gun64_r1);
		setRotationAngle(gun64_r1, -0.3316F, 0.0F, 0.0F);
		gun64_r1.cubeList.add(new ModelBox(gun64_r1, 39, 85, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));
		gun64_r1.cubeList.add(new ModelBox(gun64_r1, 24, 86, 2.6F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun63_r3 = new ModelRenderer(this);
		gun63_r3.setRotationPoint(-3.2F, -1.4F, -16.4F);
		rail.addChild(gun63_r3);
		setRotationAngle(gun63_r3, -0.3316F, 0.0F, 0.0F);
		gun63_r3.cubeList.add(new ModelBox(gun63_r3, 16, 81, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));
		gun63_r3.cubeList.add(new ModelBox(gun63_r3, 87, 16, 2.6F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun62_r2 = new ModelRenderer(this);
		gun62_r2.setRotationPoint(-0.7F, -1.1F, 12.8F);
		rail.addChild(gun62_r2);
		setRotationAngle(gun62_r2, -0.3316F, 0.0F, 0.0F);
		gun62_r2.cubeList.add(new ModelBox(gun62_r2, 87, 42, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun61_r1 = new ModelRenderer(this);
		gun61_r1.setRotationPoint(-0.7F, -1.1F, 0.6F);
		rail.addChild(gun61_r1);
		setRotationAngle(gun61_r1, -0.3316F, 0.0F, 0.0F);
		gun61_r1.cubeList.add(new ModelBox(gun61_r1, 87, 78, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, -1.0F, 11.0F);
		rail.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.6109F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 56, 30, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 100, 0, -1.0F, 0.0F, -5.5F, 1, 1, 5, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 99, 59, -1.0F, 0.0F, -11.0F, 1, 1, 5, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-2.8F, -1.0F, 0.0F);
		rail.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.6109F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 36, 99, 0.0F, 0.0F, 0.0F, 1, 1, 14, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-2.9F, -1.25F, -21.15F);
		rail.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.4363F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 36, 65, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.1F, -1.25F, -21.15F);
		rail.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.4363F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 36, 98, -1.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
		barrel.render(f5);
		rail.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}