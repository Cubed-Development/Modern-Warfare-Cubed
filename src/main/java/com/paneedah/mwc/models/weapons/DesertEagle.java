package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DesertEagle extends ModelWithAttachments {
	private final ModelRenderer maingun;
	private final ModelRenderer Hammer;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r1_r1;
	private final ModelRenderer Grip;
	private final ModelRenderer mainbodygrip;
	private final ModelRenderer cube_r20_r1;
	private final ModelRenderer cube_r20_r2;
	private final ModelRenderer cube_r20_r3;
	private final ModelRenderer cube_r20_r4;
	private final ModelRenderer cube_r17_r1;
	private final ModelRenderer cube_r16_r1;
	private final ModelRenderer cube_r15_r1;
	private final ModelRenderer cube_r14_r1;
	private final ModelRenderer cube_r13_r1;
	private final ModelRenderer cube_r12_r1;
	private final ModelRenderer cube_r11_r1;
	private final ModelRenderer cube_r10_r1;
	private final ModelRenderer cube_r9_r1;
	private final ModelRenderer cube_r6_r1;
	private final ModelRenderer cube_r6_r2;
	private final ModelRenderer cube_r5_r1;
	private final ModelRenderer cube_r4_r1;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer cubes_r1;
	private final ModelRenderer cubes_r2;
	private final ModelRenderer cubes_r3;
	private final ModelRenderer cubes_r4;
	private final ModelRenderer MagBase2;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer laser_rail2;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer gripitself2;
	private final ModelRenderer cube_r7_r1;
	private final ModelRenderer cube_r26_r1;
	private final ModelRenderer cube_r23_r1;
	private final ModelRenderer cube_r22_r1;
	private final ModelRenderer cube_r22_r1_r1;
	private final ModelRenderer cube_r21_r1;
	private final ModelRenderer cube_r21_r2;
	private final ModelRenderer gripitself_r2_r1;
	private final ModelRenderer gripitself_r1_r1;
	private final ModelRenderer cube_r8_r1;
	private final ModelRenderer details2;
	private final ModelRenderer details_r1;
	private final ModelRenderer details_r2;
	private final ModelRenderer details_r3;
	private final ModelRenderer details_r4;
	private final ModelRenderer details_r5;
	private final ModelRenderer details_r6;
	private final ModelRenderer details_r7;
	private final ModelRenderer cube_r57;
	private final ModelRenderer Barrel;
	private final ModelRenderer cube_r42_r1;
	private final ModelRenderer cube_r42_r2;
	private final ModelRenderer Barrel_r1;
	private final ModelRenderer cube_r41_r1;
	private final ModelRenderer cube_r41_r2;
	private final ModelRenderer cube_r40_r1;
	private final ModelRenderer cube_r39_r1;
	private final ModelRenderer cube_r38_r1;
	private final ModelRenderer cube_r37_r1;
	private final ModelRenderer cube_r36_r1;
	private final ModelRenderer cube_r35_r1;
	private final ModelRenderer cube_r34_r1;
	private final ModelRenderer cube_r33_r1;
	private final ModelRenderer cube_r31_r1;
	private final ModelRenderer cube_r33_r2;
	private final ModelRenderer cube_r31_r2;
	private final ModelRenderer Barrel_r2;
	private final ModelRenderer Barrel_r3;
	private final ModelRenderer Barrel_r4;
	private final ModelRenderer Barrel_r5;
	private final ModelRenderer Barrel_r6;
	private final ModelRenderer Barrel_r7;
	private final ModelRenderer Barrel_r8;
	private final ModelRenderer Barrel_r9;
	private final ModelRenderer Barrel_r10;
	private final ModelRenderer sightrail2;
	private final ModelRenderer cube_r52_r1;
	private final ModelRenderer cube_r51_r1;
	private final ModelRenderer cube_r50_r1;
	private final ModelRenderer cube_r49_r1;
	private final ModelRenderer frontsight2;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer cube_r60;

	public DesertEagle() {
		textureWidth = 140;
		textureHeight = 140;

		maingun = new ModelRenderer(this);
		maingun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Hammer = new ModelRenderer(this);
		Hammer.setRotationPoint(-1.5F, -35.2F, 4.5F);
		maingun.addChild(Hammer);
		setRotationAngle(Hammer, -1.0908F, 0.0F, 0.0F);
		Hammer.cubeList.add(new ModelBox(Hammer, 81, 9, -0.4F, -3.5F, 0.3F, 1, 4, 1, 0.0F, false));
		Hammer.cubeList.add(new ModelBox(Hammer, 52, 71, -0.4F, -3.5F, 0.5F, 1, 4, 1, -0.001F, false));

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(1.5F, 27.0108F, -23.007F);
		Hammer.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, -0.576F, 0.0F, 0.0F);
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 81, 0, -1.9F, -39.8108F, 4.1794F, 1, 4, 1, -0.002F, false));

		cube_r1_r1 = new ModelRenderer(this);
		cube_r1_r1.setRotationPoint(0.1F, -3.3648F, 1.3688F);
		Hammer.addChild(cube_r1_r1);
		setRotationAngle(cube_r1_r1, 0.2618F, 0.0F, 0.0F);
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 0, 83, -0.5F, -0.4852F, -1.0F, 1, 1, 2, 0.0F, false));

		Grip = new ModelRenderer(this);
		Grip.setRotationPoint(-1.475F, -26.0F, -1.7F);
		maingun.addChild(Grip);
		

		mainbodygrip = new ModelRenderer(this);
		mainbodygrip.setRotationPoint(0.6F, 0.0F, 0.0F);
		Grip.addChild(mainbodygrip);
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 50, 23, -3.0F, -8.0F, -14.0F, 5, 2, 20, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 60, 36, -2.4F, -6.0F, -12.4F, 4, 5, 1, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 0, 46, -2.4F, -2.0F, -12.8F, 4, 1, 1, -0.002F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 72, 89, -2.4F, -2.0F, -11.4F, 4, 1, 8, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 53, 0, -3.0F, -8.0F, -32.0F, 5, 1, 18, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 36, 16, -2.0F, -9.1F, -33.3F, 3, 1, 2, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 52, 81, -2.1F, -7.0F, 5.4F, 3, 1, 5, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 10, 6, -2.1F, -7.0F, 9.9F, 3, 1, 1, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 74, 64, -3.0F, -8.0F, 5.4F, 5, 1, 3, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 42, 90, -3.0F, -6.0F, -4.2F, 5, 5, 9, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 35, 31, -3.0F, -2.0F, -4.8F, 5, 1, 1, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 100, 18, -3.0F, 6.0F, -0.875F, 5, 3, 9, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 10, 0, -2.0F, -6.0F, 4.3F, 3, 5, 1, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 9, 73, -2.0F, -9.0F, 5.9F, 3, 2, 1, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 94, 104, -0.9F, -10.0F, 5.9F, 1, 1, 1, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 84, 104, -1.4F, -10.0F, 5.0F, 1, 1, 1, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 94, 104, -0.7F, -10.0F, 5.0F, 1, 1, 1, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 84, 104, -1.2F, -10.0F, 5.9F, 1, 1, 1, 0.0F, false));

		cube_r20_r1 = new ModelRenderer(this);
		cube_r20_r1.setRotationPoint(1.2554F, 3.464F, -1.8575F);
		mainbodygrip.addChild(cube_r20_r1);
		setRotationAngle(cube_r20_r1, 0.2617F, 0.5315F, 0.1288F);
		cube_r20_r1.cubeList.add(new ModelBox(cube_r20_r1, 12, 91, -0.4554F, -5.0F, -0.7F, 1, 10, 1, 0.0F, false));

		cube_r20_r2 = new ModelRenderer(this);
		cube_r20_r2.setRotationPoint(-2.0054F, 3.464F, -2.4575F);
		mainbodygrip.addChild(cube_r20_r2);
		setRotationAngle(cube_r20_r2, 0.2617F, -0.5315F, -0.1288F);
		cube_r20_r2.cubeList.add(new ModelBox(cube_r20_r2, 68, 76, -0.5F, -5.0F, -0.7F, 1, 10, 1, 0.0F, false));

		cube_r20_r3 = new ModelRenderer(this);
		cube_r20_r3.setRotationPoint(-2.3054F, 3.464F, -1.8575F);
		mainbodygrip.addChild(cube_r20_r3);
		setRotationAngle(cube_r20_r3, 0.2617F, -0.5315F, -0.1288F);
		cube_r20_r3.cubeList.add(new ModelBox(cube_r20_r3, 19, 31, -0.5446F, -5.0F, -0.7F, 1, 10, 1, 0.0F, false));

		cube_r20_r4 = new ModelRenderer(this);
		cube_r20_r4.setRotationPoint(0.9554F, 3.464F, -2.4575F);
		mainbodygrip.addChild(cube_r20_r4);
		setRotationAngle(cube_r20_r4, 0.2617F, 0.5315F, 0.1288F);
		cube_r20_r4.cubeList.add(new ModelBox(cube_r20_r4, 112, 57, -0.5F, -5.0F, -0.7F, 1, 10, 1, 0.0F, false));

		cube_r17_r1 = new ModelRenderer(this);
		cube_r17_r1.setRotationPoint(0.875F, 21.5607F, 11.6742F);
		mainbodygrip.addChild(cube_r17_r1);
		setRotationAngle(cube_r17_r1, 0.3491F, 0.0F, 0.0F);
		cube_r17_r1.cubeList.add(new ModelBox(cube_r17_r1, 39, 80, -2.175F, -32.3F, -8.1F, 2, 2, 1, 0.0F, false));

		cube_r16_r1 = new ModelRenderer(this);
		cube_r16_r1.setRotationPoint(0.875F, 26.922F, -5.0826F);
		mainbodygrip.addChild(cube_r16_r1);
		setRotationAngle(cube_r16_r1, -0.2182F, 0.0F, 0.0F);
		cube_r16_r1.cubeList.add(new ModelBox(cube_r16_r1, 91, 83, -2.175F, -29.6F, -8.05F, 2, 1, 1, 0.0F, false));
		cube_r16_r1.cubeList.add(new ModelBox(cube_r16_r1, 91, 80, -2.175F, -30.6F, -8.05F, 2, 1, 1, 0.0F, false));

		cube_r15_r1 = new ModelRenderer(this);
		cube_r15_r1.setRotationPoint(0.875F, 27.7035F, -21.7874F);
		mainbodygrip.addChild(cube_r15_r1);
		setRotationAngle(cube_r15_r1, -0.7854F, 0.0F, 0.0F);
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 25, 44, -3.275F, -28.35F, -14.65F, 4, 1, 1, -0.002F, false));

		cube_r14_r1 = new ModelRenderer(this);
		cube_r14_r1.setRotationPoint(0.875F, 28.6875F, -16.2792F);
		mainbodygrip.addChild(cube_r14_r1);
		setRotationAngle(cube_r14_r1, -0.5672F, 0.0F, 0.0F);
		cube_r14_r1.cubeList.add(new ModelBox(cube_r14_r1, 100, 9, -3.275F, -32.475F, -14.625F, 4, 2, 1, 0.0F, false));

		cube_r13_r1 = new ModelRenderer(this);
		cube_r13_r1.setRotationPoint(0.875F, 14.0736F, 15.4199F);
		mainbodygrip.addChild(cube_r13_r1);
		setRotationAngle(cube_r13_r1, 0.5672F, 0.0F, 0.0F);
		cube_r13_r1.cubeList.add(new ModelBox(cube_r13_r1, 72, 103, -3.275F, -32.475F, -13.575F, 4, 2, 1, 0.0F, false));

		cube_r12_r1 = new ModelRenderer(this);
		cube_r12_r1.setRotationPoint(0.875F, 21.5054F, -8.7594F);
		mainbodygrip.addChild(cube_r12_r1);
		setRotationAngle(cube_r12_r1, -0.3316F, 0.0F, 0.0F);
		cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 99, 93, -2.975F, -33.5F, 6.6F, 3, 1, 3, 0.0F, false));

		cube_r11_r1 = new ModelRenderer(this);
		cube_r11_r1.setRotationPoint(-1.9459F, 21.4984F, -8.7801F);
		mainbodygrip.addChild(cube_r11_r1);
		setRotationAngle(cube_r11_r1, -0.3502F, 0.3211F, -0.1148F);
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 0, 50, -3.211F, -33.5F, 5.9007F, 1, 1, 3, -0.002F, false));

		cube_r10_r1 = new ModelRenderer(this);
		cube_r10_r1.setRotationPoint(3.6959F, 21.4984F, -8.7801F);
		mainbodygrip.addChild(cube_r10_r1);
		setRotationAngle(cube_r10_r1, -0.3502F, -0.3211F, 0.1148F);
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 53, 0, -0.439F, -33.5F, 6.8007F, 1, 1, 3, -0.002F, false));

		cube_r9_r1 = new ModelRenderer(this);
		cube_r9_r1.setRotationPoint(0.875F, 23.5427F, 11.7789F);
		mainbodygrip.addChild(cube_r9_r1);
		setRotationAngle(cube_r9_r1, 0.4014F, 0.0F, 0.0F);
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 99, 83, -3.875F, -28.7F, 2.8F, 5, 9, 1, 0.0F, false));

		cube_r6_r1 = new ModelRenderer(this);
		cube_r6_r1.setRotationPoint(0.875F, 23.2692F, 11.7233F);
		mainbodygrip.addChild(cube_r6_r1);
		setRotationAngle(cube_r6_r1, 0.4014F, 0.0F, 0.0F);
		cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 35, 44, -3.275F, -19.3F, -5.9F, 4, 1, 1, 0.0F, false));

		cube_r6_r2 = new ModelRenderer(this);
		cube_r6_r2.setRotationPoint(-0.5F, 3.2727F, -2.8477F);
		mainbodygrip.addChild(cube_r6_r2);
		setRotationAngle(cube_r6_r2, 0.2269F, 0.0F, 0.0F);
		cube_r6_r2.cubeList.add(new ModelBox(cube_r6_r2, 98, 43, -1.5F, -4.5F, -0.5F, 3, 10, 2, 0.0F, false));

		cube_r5_r1 = new ModelRenderer(this);
		cube_r5_r1.setRotationPoint(0.875F, 20.3223F, 16.3063F);
		mainbodygrip.addChild(cube_r5_r1);
		setRotationAngle(cube_r5_r1, 0.6109F, 0.0F, 0.0F);
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 31, 73, -3.875F, -34.2F, -2.5F, 5, 2, 1, -0.002F, false));

		cube_r4_r1 = new ModelRenderer(this);
		cube_r4_r1.setRotationPoint(0.875F, 15.4095F, 21.0104F);
		mainbodygrip.addChild(cube_r4_r1);
		setRotationAngle(cube_r4_r1, 0.8727F, 0.0F, 0.0F);
		cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 25, 20, -3.875F, -31.4F, -4.0F, 5, 1, 1, 0.0F, false));
		cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 67, 19, -3.875F, -31.4F, -3.5F, 5, 1, 2, 0.0F, false));

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(0.875F, 16.3126F, 20.3172F);
		mainbodygrip.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, 0.829F, 0.0F, 0.0F);
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 81, 9, -2.875F, -26.9F, 3.1F, 3, 2, 5, 0.0F, false));

		cubes_r1 = new ModelRenderer(this);
		cubes_r1.setRotationPoint(-0.5F, 1.5F, 2.2F);
		mainbodygrip.addChild(cubes_r1);
		setRotationAngle(cubes_r1, 0.288F, 0.0F, 0.0F);
		cubes_r1.cubeList.add(new ModelBox(cubes_r1, 0, 91, -2.5F, -2.5F, 2.5F, 5, 9, 1, -0.001F, false));

		cubes_r2 = new ModelRenderer(this);
		cubes_r2.setRotationPoint(-0.5F, 1.5F, 1.9F);
		mainbodygrip.addChild(cubes_r2);
		setRotationAngle(cubes_r2, 0.288F, 0.0F, 0.0F);
		cubes_r2.cubeList.add(new ModelBox(cubes_r2, 19, 91, -2.5F, -2.5F, 2.5F, 5, 9, 1, -0.001F, false));

		cubes_r3 = new ModelRenderer(this);
		cubes_r3.setRotationPoint(-0.5F, -0.8929F, -2.9303F);
		mainbodygrip.addChild(cubes_r3);
		setRotationAngle(cubes_r3, 0.6807F, 0.0F, 0.0F);
		cubes_r3.cubeList.add(new ModelBox(cubes_r3, 10, 55, -2.5F, -0.5F, -0.5F, 5, 2, 1, -0.001F, false));

		cubes_r4 = new ModelRenderer(this);
		cubes_r4.setRotationPoint(-0.5F, 1.5F, 1.3F);
		mainbodygrip.addChild(cubes_r4);
		setRotationAngle(cubes_r4, 0.2182F, 0.0F, 0.0F);
		cubes_r4.cubeList.add(new ModelBox(cubes_r4, 24, 50, -2.5F, -3.5F, -3.5F, 5, 10, 7, 0.0F, false));

		MagBase2 = new ModelRenderer(this);
		MagBase2.setRotationPoint(-0.625F, 10.0F, 3.0F);
		mainbodygrip.addChild(MagBase2);
		MagBase2.cubeList.add(new ModelBox(MagBase2, 112, 98, -2.35F, -1.4F, -4.0F, 5, 2, 8, 0.0F, false));
		MagBase2.cubeList.add(new ModelBox(MagBase2, 53, 19, -2.35F, -0.4F, -5.8F, 5, 1, 2, -0.002F, false));
		MagBase2.cubeList.add(new ModelBox(MagBase2, 23, 84, -2.35F, -1.4F, 2.8F, 5, 2, 2, -0.002F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.0F, 0.0F, 0.0F);
		MagBase2.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.9599F, 0.0F, 0.0F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 98, 38, -1.85F, 2.2F, 2.4F, 4, 2, 2, 0.0F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.0F, 0.0F, 0.0F);
		MagBase2.addChild(cube_r54);
		setRotationAngle(cube_r54, -0.2618F, 0.0F, 0.0F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 79, 83, -2.35F, -0.4F, -5.7F, 5, 2, 2, -0.003F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 80, 38, -2.35F, -0.8F, -5.7F, 5, 2, 2, 0.0F, false));

		laser_rail2 = new ModelRenderer(this);
		laser_rail2.setRotationPoint(0.5038F, -6.4972F, -15.5F);
		Grip.addChild(laser_rail2);
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 83, 55, -1.8038F, -0.4028F, -0.5F, 2, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 83, 53, -1.8038F, -0.4028F, -6.5F, 2, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 83, 49, -1.8038F, -0.4028F, -4.5F, 2, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 83, 47, -1.8038F, -0.4028F, -10.5F, 2, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 83, 45, -1.8038F, -0.4028F, -8.5F, 2, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 8, 83, -1.8038F, -0.4028F, -14.5F, 2, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 79, 80, -1.8038F, -0.4028F, -12.5F, 2, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 80, 61, -1.8038F, -0.4028F, -16.5F, 2, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 9, 83, -0.2038F, -0.4028F, -14.5F, 1, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 80, 80, -0.2038F, -0.4028F, -12.5F, 1, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 84, 47, -0.2038F, -0.4028F, -10.5F, 1, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 84, 45, -0.2038F, -0.4028F, -8.5F, 1, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 84, 53, -0.2038F, -0.4028F, -6.5F, 1, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 84, 49, -0.2038F, -0.4028F, -4.5F, 1, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 81, 23, -0.2038F, -0.4028F, -2.5F, 1, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 84, 55, -0.2038F, -0.4028F, -0.5F, 1, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 81, 61, -0.2038F, -0.4028F, -16.5F, 1, 1, 1, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 55, 70, -2.0038F, -1.0028F, -16.5F, 3, 1, 18, 0.0F, false));
		laser_rail2.cubeList.add(new ModelBox(laser_rail2, 80, 23, -1.8038F, -0.4028F, -2.5F, 2, 1, 1, 0.0F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(2.4462F, 0.0972F, 0.0F);
		laser_rail2.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.0F, 0.0F, -0.7854F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 99, 75, -3.3621F, -3.6621F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 99, 72, -3.3621F, -3.6621F, -2.5F, 1, 1, 1, 0.0F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 99, 68, -3.3621F, -3.6621F, -16.5F, 1, 1, 1, 0.0F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 99, 66, -3.3621F, -3.6621F, -12.5F, 1, 1, 1, 0.0F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 99, 64, -3.3621F, -3.6621F, -14.5F, 1, 1, 1, 0.0F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 33, 99, -3.3621F, -3.6621F, -8.5F, 1, 1, 1, 0.0F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 92, 98, -3.3621F, -3.6621F, -10.5F, 1, 1, 1, 0.0F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 88, 98, -3.3621F, -3.6621F, -4.5F, 1, 1, 1, 0.0F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 72, 98, -3.3621F, -3.6621F, -6.5F, 1, 1, 1, 0.0F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(0.5038F, -0.0972F, 0.0F);
		laser_rail2.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.0F, 0.0F, 0.7854F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 36, 98, -0.2879F, -0.7121F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r56.cubeList.add(new ModelBox(cube_r56, 65, 97, -0.2879F, -0.7121F, -2.5F, 1, 1, 1, 0.0F, false));
		cube_r56.cubeList.add(new ModelBox(cube_r56, 61, 97, -0.2879F, -0.7121F, -16.5F, 1, 1, 1, 0.0F, false));
		cube_r56.cubeList.add(new ModelBox(cube_r56, 45, 97, -0.2879F, -0.7121F, -12.5F, 1, 1, 1, 0.0F, false));
		cube_r56.cubeList.add(new ModelBox(cube_r56, 33, 97, -0.2879F, -0.7121F, -14.5F, 1, 1, 1, 0.0F, false));
		cube_r56.cubeList.add(new ModelBox(cube_r56, 36, 96, -0.2879F, -0.7121F, -8.5F, 1, 1, 1, 0.0F, false));
		cube_r56.cubeList.add(new ModelBox(cube_r56, 65, 95, -0.2879F, -0.7121F, -10.5F, 1, 1, 1, 0.0F, false));
		cube_r56.cubeList.add(new ModelBox(cube_r56, 61, 95, -0.2879F, -0.7121F, -4.5F, 1, 1, 1, 0.0F, false));
		cube_r56.cubeList.add(new ModelBox(cube_r56, 46, 95, -0.2879F, -0.7121F, -6.5F, 1, 1, 1, 0.0F, false));

		gripitself2 = new ModelRenderer(this);
		gripitself2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Grip.addChild(gripitself2);
		gripitself2.cubeList.add(new ModelBox(gripitself2, 79, 70, 1.95F, -6.1F, -2.8F, 1, 4, 6, 0.0F, false));
		gripitself2.cubeList.add(new ModelBox(gripitself2, 53, 11, 1.95F, -7.4F, 1.0F, 1, 2, 2, -0.001F, false));
		gripitself2.cubeList.add(new ModelBox(gripitself2, 0, 25, 1.95F, 3.6F, -1.2F, 1, 5, 8, -0.002F, false));
		gripitself2.cubeList.add(new ModelBox(gripitself2, 0, 50, 1.95F, 0.7F, -1.9F, 1, 3, 8, -0.002F, false));
		gripitself2.cubeList.add(new ModelBox(gripitself2, 25, 25, -2.7F, 0.7F, -1.9F, 1, 3, 8, -0.002F, false));
		gripitself2.cubeList.add(new ModelBox(gripitself2, 0, 61, 1.95F, -2.2F, -2.4F, 1, 3, 7, -0.002F, false));
		gripitself2.cubeList.add(new ModelBox(gripitself2, 23, 73, -2.7F, -3.2F, -1.4F, 1, 4, 6, -0.002F, false));
		gripitself2.cubeList.add(new ModelBox(gripitself2, 42, 95, -2.7F, 6.6F, 6.8F, 1, 2, 1, -0.002F, false));
		gripitself2.cubeList.add(new ModelBox(gripitself2, 91, 94, 1.95F, 6.6F, 6.8F, 1, 2, 1, -0.003F, false));
		gripitself2.cubeList.add(new ModelBox(gripitself2, 42, 25, -2.7F, -7.4F, 0.8F, 1, 2, 2, -0.001F, false));
		gripitself2.cubeList.add(new ModelBox(gripitself2, 0, 0, -2.7F, 3.6F, -1.2F, 1, 5, 8, -0.002F, false));
		gripitself2.cubeList.add(new ModelBox(gripitself2, 94, 57, -2.7F, 7.0F, 7.1F, 1, 2, 1, 0.0F, false));
		gripitself2.cubeList.add(new ModelBox(gripitself2, 81, 0, -2.7F, -6.2F, -2.8F, 1, 3, 6, 0.0F, false));

		cube_r7_r1 = new ModelRenderer(this);
		cube_r7_r1.setRotationPoint(1.475F, 25.4138F, 5.7469F);
		gripitself2.addChild(cube_r7_r1);
		setRotationAngle(cube_r7_r1, 0.1571F, 0.0F, 0.0F);
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 0, 21, -3.875F, -16.85F, 4.525F, 5, 1, 1, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 94, 51, -4.175F, -18.35F, 4.525F, 1, 2, 1, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 11, 43, -3.425F, -16.85F, 4.825F, 4, 1, 1, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 99, 98, -3.425F, -18.35F, 4.825F, 4, 2, 1, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 13, 107, 0.475F, -16.85F, 4.575F, 1, 1, 1, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 94, 48, 0.475F, -18.35F, 4.575F, 1, 2, 1, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 102, 106, -4.175F, -16.85F, 4.525F, 1, 1, 1, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 36, 67, -3.875F, -18.35F, 4.525F, 5, 2, 1, 0.0F, false));

		cube_r26_r1 = new ModelRenderer(this);
		cube_r26_r1.setRotationPoint(1.475F, 24.4463F, 9.0149F);
		gripitself2.addChild(cube_r26_r1);
		setRotationAngle(cube_r26_r1, 0.288F, 0.0F, 0.0F);
		cube_r26_r1.cubeList.add(new ModelBox(cube_r26_r1, 92, 9, 0.475F, -20.4F, 3.475F, 1, 3, 1, 0.0F, false));
		cube_r26_r1.cubeList.add(new ModelBox(cube_r26_r1, 88, 91, -4.175F, -20.4F, 3.475F, 1, 3, 1, 0.0F, false));
		cube_r26_r1.cubeList.add(new ModelBox(cube_r26_r1, 66, 91, 0.475F, -20.4F, 2.775F, 1, 3, 1, -0.003F, false));
		cube_r26_r1.cubeList.add(new ModelBox(cube_r26_r1, 38, 117, -3.425F, -20.4F, 3.775F, 4, 3, 1, 0.0F, false));
		cube_r26_r1.cubeList.add(new ModelBox(cube_r26_r1, 60, 6, -4.175F, -20.4F, 2.775F, 1, 3, 1, -0.001F, false));

		cube_r23_r1 = new ModelRenderer(this);
		cube_r23_r1.setRotationPoint(1.475F, 8.1642F, 24.7434F);
		gripitself2.addChild(cube_r23_r1);
		setRotationAngle(cube_r23_r1, 1.1868F, 0.0F, 0.0F);
		cube_r23_r1.cubeList.add(new ModelBox(cube_r23_r1, 107, 64, -4.175F, -29.8F, -0.15F, 1, 1, 1, -0.002F, false));
		cube_r23_r1.cubeList.add(new ModelBox(cube_r23_r1, 107, 13, -4.175F, -29.0F, -1.1F, 1, 1, 1, 0.0F, false));

		cube_r22_r1 = new ModelRenderer(this);
		cube_r22_r1.setRotationPoint(1.475F, 25.1978F, 6.6301F);
		gripitself2.addChild(cube_r22_r1);
		setRotationAngle(cube_r22_r1, 0.192F, 0.0F, 0.0F);
		cube_r22_r1.cubeList.add(new ModelBox(cube_r22_r1, 107, 72, -4.175F, -32.625F, -4.25F, 1, 1, 1, 0.0F, false));
		cube_r22_r1.cubeList.add(new ModelBox(cube_r22_r1, 107, 68, -4.175F, -32.625F, -4.4F, 1, 1, 1, 0.0F, false));
		cube_r22_r1.cubeList.add(new ModelBox(cube_r22_r1, 17, 25, -4.175F, -32.3F, -4.4F, 1, 3, 2, -0.002F, false));
		cube_r22_r1.cubeList.add(new ModelBox(cube_r22_r1, 16, 59, -4.175F, -28.3F, -4.4F, 1, 10, 2, -0.0015F, false));
		cube_r22_r1.cubeList.add(new ModelBox(cube_r22_r1, 18, 0, 0.475F, -32.3F, -4.4F, 1, 14, 1, -0.0015F, false));

		cube_r22_r1_r1 = new ModelRenderer(this);
		cube_r22_r1_r1.setRotationPoint(1.475F, 21.2856F, 14.7417F);
		gripitself2.addChild(cube_r22_r1_r1);
		setRotationAngle(cube_r22_r1_r1, 0.4713F, 0.0F, 0.0F);
		cube_r22_r1_r1.cubeList.add(new ModelBox(cube_r22_r1_r1, 107, 66, 0.475F, -32.425F, -4.2F, 1, 1, 1, -0.0025F, false));

		cube_r21_r1 = new ModelRenderer(this);
		cube_r21_r1.setRotationPoint(1.475F, 23.2692F, 11.7233F);
		gripitself2.addChild(cube_r21_r1);
		setRotationAngle(cube_r21_r1, 0.4014F, 0.0F, 0.0F);
		cube_r21_r1.cubeList.add(new ModelBox(cube_r21_r1, 0, 0, -4.175F, -31.7F, -2.9F, 1, 3, 3, -0.002F, false));
		cube_r21_r1.cubeList.add(new ModelBox(cube_r21_r1, 36, 0, -3.425F, -25.7F, 3.1F, 4, 6, 1, 0.0F, false));
		cube_r21_r1.cubeList.add(new ModelBox(cube_r21_r1, 119, 13, -4.175F, -31.7F, 1.8F, 1, 12, 2, -0.001F, false));

		cube_r21_r2 = new ModelRenderer(this);
		cube_r21_r2.setRotationPoint(2.45F, -1.482F, 4.3595F);
		gripitself2.addChild(cube_r21_r2);
		setRotationAngle(cube_r21_r2, 0.3839F, 0.0F, 0.0F);
		cube_r21_r2.cubeList.add(new ModelBox(cube_r21_r2, 118, 57, -0.5F, -6.0F, -1.0F, 1, 12, 2, -0.001F, false));

		gripitself_r2_r1 = new ModelRenderer(this);
		gripitself_r2_r1.setRotationPoint(5.1398F, 25.8405F, 1.7F);
		gripitself2.addChild(gripitself_r2_r1);
		setRotationAngle(gripitself_r2_r1, 0.0F, 0.0F, -0.2094F);
		gripitself_r2_r1.cubeList.add(new ModelBox(gripitself_r2_r1, 25, 0, 0.5735F, -18.0174F, -2.9F, 1, 1, 9, -0.001F, false));

		gripitself_r1_r1 = new ModelRenderer(this);
		gripitself_r1_r1.setRotationPoint(-2.2431F, 26.3817F, 1.7F);
		gripitself2.addChild(gripitself_r1_r1);
		setRotationAngle(gripitself_r1_r1, 0.0F, 0.0F, 0.2094F);
		gripitself_r1_r1.cubeList.add(new ModelBox(gripitself_r1_r1, 25, 10, -4.275F, -18.0F, -2.9F, 1, 1, 9, -0.001F, false));

		cube_r8_r1 = new ModelRenderer(this);
		cube_r8_r1.setRotationPoint(1.475F, 24.4463F, 9.7149F);
		gripitself2.addChild(cube_r8_r1);
		setRotationAngle(cube_r8_r1, 0.288F, 0.0F, 0.0F);
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 100, 0, -3.875F, -20.4F, 2.775F, 5, 3, 1, 0.0F, false));

		details2 = new ModelRenderer(this);
		details2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Grip.addChild(details2);
		details2.cubeList.add(new ModelBox(details2, 106, 6, 1.8F, -7.9F, -0.8F, 1, 1, 1, 0.0F, false));
		details2.cubeList.add(new ModelBox(details2, 106, 4, 1.8F, -7.9F, -0.2F, 1, 1, 1, 0.0F, false));
		details2.cubeList.add(new ModelBox(details2, 30, 76, 1.8F, -7.3F, -6.2F, 1, 1, 7, 0.0F, false));
		details2.cubeList.add(new ModelBox(details2, 80, 31, -2.9F, -8.0F, -11.8F, 1, 1, 2, 0.0F, false));
		details2.cubeList.add(new ModelBox(details2, 80, 28, -2.9F, -7.8F, -11.1F, 1, 1, 2, 0.0F, false));
		details2.cubeList.add(new ModelBox(details2, 31, 105, -2.6F, -7.8F, -11.5F, 1, 1, 1, 0.0F, false));
		details2.cubeList.add(new ModelBox(details2, 8, 105, -2.7F, -7.0F, -12.1F, 1, 1, 1, 0.0F, false));

		details_r1 = new ModelRenderer(this);
		details_r1.setRotationPoint(-2.05F, -2.0F, -4.3F);
		details2.addChild(details_r1);
		setRotationAngle(details_r1, 0.7854F, 0.0F, 0.0F);
		details_r1.cubeList.add(new ModelBox(details_r1, 35, 105, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		details_r2 = new ModelRenderer(this);
		details_r2.setRotationPoint(2.7F, -6.7F, -1.2F);
		details2.addChild(details_r2);
		setRotationAngle(details_r2, 0.0F, 0.0F, -0.6981F);
		details_r2.cubeList.add(new ModelBox(details_r2, 0, 116, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.1F, false));

		details_r3 = new ModelRenderer(this);
		details_r3.setRotationPoint(2.7F, -6.8F, -5.7F);
		details2.addChild(details_r3);
		setRotationAngle(details_r3, -0.7854F, 0.0F, 0.0F);
		details_r3.cubeList.add(new ModelBox(details_r3, 88, 48, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.16F, false));

		details_r4 = new ModelRenderer(this);
		details_r4.setRotationPoint(2.2F, -7.1F, -12.7F);
		details2.addChild(details_r4);
		setRotationAngle(details_r4, -0.6981F, 0.0F, 0.0F);
		details_r4.cubeList.add(new ModelBox(details_r4, 88, 50, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.03F, false));

		details_r5 = new ModelRenderer(this);
		details_r5.setRotationPoint(2.0F, -5.4F, -11.9F);
		details2.addChild(details_r5);
		setRotationAngle(details_r5, -0.6981F, 0.0F, 0.0F);
		details_r5.cubeList.add(new ModelBox(details_r5, 19, 106, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		details_r6 = new ModelRenderer(this);
		details_r6.setRotationPoint(-1.6F, -5.4F, -11.8F);
		details2.addChild(details_r6);
		setRotationAngle(details_r6, 0.7802F, -0.098F, -0.0155F);
		details_r6.cubeList.add(new ModelBox(details_r6, 106, 42, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		details_r7 = new ModelRenderer(this);
		details_r7.setRotationPoint(2.3F, -2.0F, -4.3F);
		details2.addChild(details_r7);
		setRotationAngle(details_r7, -0.7854F, 0.0F, 0.0F);
		details_r7.cubeList.add(new ModelBox(details_r7, 94, 106, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(-2.5F, -6.6F, -11.6F);
		details2.addChild(cube_r57);
		setRotationAngle(cube_r57, -0.7854F, 0.0F, 0.0F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 105, -0.1F, -0.975F, -0.2F, 1, 1, 1, 0.0F, false));
		cube_r57.cubeList.add(new ModelBox(cube_r57, 102, 104, -0.1F, -1.2F, -0.2F, 1, 1, 1, 0.0F, false));

		Barrel = new ModelRenderer(this);
		Barrel.setRotationPoint(-1.5F, -38.0F, -12.7F);
		maingun.addChild(Barrel);
		Barrel.cubeList.add(new ModelBox(Barrel, 53, 11, -0.9F, -2.69F, -2.5F, 2, 1, 6, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 0, 73, -1.4F, -1.6F, -19.475F, 3, 1, 17, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 94, 57, -0.9F, -2.25F, -23.575F, 2, 1, 4, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 99, 64, 1.35F, -1.2F, -2.5F, 1, 2, 6, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 25, 95, -2.2F, -1.2F, -2.5F, 1, 2, 6, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 62, 108, 1.6F, 3.0F, -22.6F, 1, 1, 4, -0.001F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 59, 23, 1.6F, 1.7F, -22.6F, 1, 2, 4, -0.002F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 36, 10, -2.4F, 1.7F, -22.6F, 1, 2, 4, -0.003F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 0, 6, -1.4F, 0.8F, -23.6F, 3, 1, 1, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 0, 111, -2.4F, 3.0F, -22.6F, 1, 1, 4, -0.002F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 22, 90, 1.125F, 2.3F, -19.0F, 1, 1, 18, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 80, 19, -1.825F, 2.3F, -19.0F, 1, 1, 18, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 25, 0, -1.4F, 0.4F, -23.6F, 3, 1, 22, -0.002F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 28, 71, -1.4F, -0.2F, -19.6F, 3, 1, 18, -0.003F, false));

		cube_r42_r1 = new ModelRenderer(this);
		cube_r42_r1.setRotationPoint(1.5055F, -1.6696F, 0.5F);
		Barrel.addChild(cube_r42_r1);
		setRotationAngle(cube_r42_r1, 0.0F, 0.0F, 1.0646F);
		cube_r42_r1.cubeList.add(new ModelBox(cube_r42_r1, 115, 82, -0.1755F, -0.5104F, -3.0F, 1, 1, 6, 0.0F, false));

		cube_r42_r2 = new ModelRenderer(this);
		cube_r42_r2.setRotationPoint(1.4055F, -1.8696F, 0.5F);
		Barrel.addChild(cube_r42_r2);
		setRotationAngle(cube_r42_r2, 0.0F, 0.0F, 1.0646F);
		cube_r42_r2.cubeList.add(new ModelBox(cube_r42_r2, 113, 75, -0.1755F, -0.5104F, -3.0F, 1, 1, 6, 0.0F, false));

		Barrel_r1 = new ModelRenderer(this);
		Barrel_r1.setRotationPoint(1.28F, -2.2F, 0.6F);
		Barrel.addChild(Barrel_r1);
		setRotationAngle(Barrel_r1, 0.0F, 0.0F, 0.5585F);
		Barrel_r1.cubeList.add(new ModelBox(Barrel_r1, 88, 46, -0.52F, -0.415F, 2.0F, 1, 1, 1, -0.1F, false));
		Barrel_r1.cubeList.add(new ModelBox(Barrel_r1, 113, 46, -0.52F, -0.415F, -3.2F, 1, 1, 6, -0.1F, false));

		cube_r41_r1 = new ModelRenderer(this);
		cube_r41_r1.setRotationPoint(1.95F, -0.0446F, -2.4423F);
		Barrel.addChild(cube_r41_r1);
		setRotationAngle(cube_r41_r1, 1.021F, 0.0F, 0.0F);
		cube_r41_r1.cubeList.add(new ModelBox(cube_r41_r1, 23, 73, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.101F, false));
		cube_r41_r1.cubeList.add(new ModelBox(cube_r41_r1, 0, 73, -4.24F, -0.5F, -1.0F, 1, 1, 2, -0.1F, false));

		cube_r41_r2 = new ModelRenderer(this);
		cube_r41_r2.setRotationPoint(-1.75F, 0.724F, -3.2801F);
		Barrel.addChild(cube_r41_r2);
		setRotationAngle(cube_r41_r2, 0.2182F, 0.0F, 0.0F);
		cube_r41_r2.cubeList.add(new ModelBox(cube_r41_r2, 25, 15, -0.54F, -0.5F, -2.5F, 1, 1, 3, -0.1F, false));
		cube_r41_r2.cubeList.add(new ModelBox(cube_r41_r2, 25, 29, 3.2F, -0.5F, -2.5F, 1, 1, 3, -0.1F, false));

		cube_r40_r1 = new ModelRenderer(this);
		cube_r40_r1.setRotationPoint(26.4877F, 28.6514F, 12.7F);
		Barrel.addChild(cube_r40_r1);
		setRotationAngle(cube_r40_r1, 0.0F, 0.0F, -0.7243F);
		cube_r40_r1.cubeList.add(new ModelBox(cube_r40_r1, 53, 104, -0.71F, -38.0F, -36.3F, 1, 1, 1, -0.002F, false));

		cube_r39_r1 = new ModelRenderer(this);
		cube_r39_r1.setRotationPoint(9.481F, 36.8629F, 12.7F);
		Barrel.addChild(cube_r39_r1);
		setRotationAngle(cube_r39_r1, 0.0F, 0.0F, -0.2182F);
		cube_r39_r1.cubeList.add(new ModelBox(cube_r39_r1, 10, 25, -0.3F, -36.85F, -36.3F, 1, 1, 5, 0.0F, false));
		cube_r39_r1.cubeList.add(new ModelBox(cube_r39_r1, 88, 54, -0.3F, -39.35F, -34.3F, 1, 1, 1, -0.001F, false));
		cube_r39_r1.cubeList.add(new ModelBox(cube_r39_r1, 76, 93, -0.3F, -38.55F, -34.3F, 1, 2, 1, 0.0F, false));

		cube_r38_r1 = new ModelRenderer(this);
		cube_r38_r1.setRotationPoint(1.5F, 21.5976F, 23.7259F);
		Barrel.addChild(cube_r38_r1);
		setRotationAngle(cube_r38_r1, 0.4014F, 0.0F, 0.0F);
		cube_r38_r1.cubeList.add(new ModelBox(cube_r38_r1, 36, 41, -3.9F, -36.7F, -35.8F, 4, 1, 1, 0.0F, false));
		cube_r38_r1.cubeList.add(new ModelBox(cube_r38_r1, 78, 98, -3.9F, -36.3F, -35.8F, 4, 2, 1, -0.001F, false));
		cube_r38_r1.cubeList.add(new ModelBox(cube_r38_r1, 93, 75, 0.1F, -36.3F, -35.8F, 1, 2, 1, 0.0F, false));
		cube_r38_r1.cubeList.add(new ModelBox(cube_r38_r1, 57, 104, 0.1F, -36.7F, -35.8F, 1, 1, 1, 0.0F, false));

		cube_r37_r1 = new ModelRenderer(this);
		cube_r37_r1.setRotationPoint(-4.4604F, 37.9244F, 12.7F);
		Barrel.addChild(cube_r37_r1);
		setRotationAngle(cube_r37_r1, 0.0F, 0.0F, 0.1571F);
		cube_r37_r1.cubeList.add(new ModelBox(cube_r37_r1, 47, 91, -3.0F, -39.4F, -36.3F, 1, 3, 1, 0.0F, false));

		cube_r36_r1 = new ModelRenderer(this);
		cube_r36_r1.setRotationPoint(6.4444F, 37.6366F, 12.7F);
		Barrel.addChild(cube_r36_r1);
		setRotationAngle(cube_r36_r1, 0.0F, 0.0F, -0.1309F);
		cube_r36_r1.cubeList.add(new ModelBox(cube_r36_r1, 52, 81, -0.8F, -39.4F, -36.3F, 1, 3, 1, 0.0F, false));

		cube_r35_r1 = new ModelRenderer(this);
		cube_r35_r1.setRotationPoint(-6.5474F, 37.469F, 12.7F);
		Barrel.addChild(cube_r35_r1);
		setRotationAngle(cube_r35_r1, 0.0F, 0.0F, 0.2182F);
		cube_r35_r1.cubeList.add(new ModelBox(cube_r35_r1, 61, 104, -3.5F, -39.35F, -34.3F, 1, 1, 1, 0.0F, false));
		cube_r35_r1.cubeList.add(new ModelBox(cube_r35_r1, 94, 45, -3.5F, -38.55F, -34.3F, 1, 2, 1, -0.002F, false));
		cube_r35_r1.cubeList.add(new ModelBox(cube_r35_r1, 35, 25, -3.5F, -36.85F, -36.3F, 1, 1, 5, 0.0F, false));

		cube_r34_r1 = new ModelRenderer(this);
		cube_r34_r1.setRotationPoint(-23.6171F, 29.6965F, 12.7F);
		Barrel.addChild(cube_r34_r1);
		setRotationAngle(cube_r34_r1, 0.0F, 0.0F, 0.7243F);
		cube_r34_r1.cubeList.add(new ModelBox(cube_r34_r1, 65, 104, -3.0F, -37.01F, -36.3F, 1, 1, 1, 0.0F, false));

		cube_r33_r1 = new ModelRenderer(this);
		cube_r33_r1.setRotationPoint(1.3422F, -0.418F, -11.0F);
		Barrel.addChild(cube_r33_r1);
		setRotationAngle(cube_r33_r1, 0.0F, 0.0F, -0.2531F);
		cube_r33_r1.cubeList.add(new ModelBox(cube_r33_r1, 94, 38, -0.4972F, -0.2946F, -8.5F, 1, 2, 17, 0.0F, false));

		cube_r31_r1 = new ModelRenderer(this);
		cube_r31_r1.setRotationPoint(-1.0422F, -0.818F, -11.0F);
		Barrel.addChild(cube_r31_r1);
		setRotationAngle(cube_r31_r1, 0.0F, 0.0F, 0.2531F);
		cube_r31_r1.cubeList.add(new ModelBox(cube_r31_r1, 81, 0, -0.5024F, -0.7054F, -8.5F, 1, 1, 17, 0.0F, false));

		cube_r33_r2 = new ModelRenderer(this);
		cube_r33_r2.setRotationPoint(-1.1422F, -0.418F, -11.0F);
		Barrel.addChild(cube_r33_r2);
		setRotationAngle(cube_r33_r2, 0.0F, 0.0F, 0.2531F);
		cube_r33_r2.cubeList.add(new ModelBox(cube_r33_r2, 0, 92, -0.5028F, -0.2946F, -8.5F, 1, 2, 17, 0.0F, false));

		cube_r31_r2 = new ModelRenderer(this);
		cube_r31_r2.setRotationPoint(1.2422F, -0.818F, -11.0F);
		Barrel.addChild(cube_r31_r2);
		setRotationAngle(cube_r31_r2, 0.0F, 0.0F, -0.2531F);
		cube_r31_r2.cubeList.add(new ModelBox(cube_r31_r2, 99, 57, -0.4976F, -0.7054F, -8.5F, 1, 1, 17, 0.0F, false));

		Barrel_r2 = new ModelRenderer(this);
		Barrel_r2.setRotationPoint(1.425F, 2.5F, -10.0F);
		Barrel.addChild(Barrel_r2);
		setRotationAngle(Barrel_r2, 0.0F, 0.0F, -0.4887F);
		Barrel_r2.cubeList.add(new ModelBox(Barrel_r2, 52, 89, -0.5F, -0.5F, -9.0F, 1, 1, 18, 0.0F, false));

		Barrel_r3 = new ModelRenderer(this);
		Barrel_r3.setRotationPoint(1.925F, 3.8F, -10.0F);
		Barrel.addChild(Barrel_r3);
		setRotationAngle(Barrel_r3, 0.0F, 0.0F, -0.5411F);
		Barrel_r3.cubeList.add(new ModelBox(Barrel_r3, 79, 83, -0.5F, -0.5F, -9.0F, 1, 1, 18, 0.0F, false));

		Barrel_r4 = new ModelRenderer(this);
		Barrel_r4.setRotationPoint(-1.125F, 2.5F, -10.0F);
		Barrel.addChild(Barrel_r4);
		setRotationAngle(Barrel_r4, 0.0F, 0.0F, 0.4887F);
		Barrel_r4.cubeList.add(new ModelBox(Barrel_r4, 79, 64, -0.5F, -0.5F, -9.0F, 1, 1, 18, 0.0F, false));

		Barrel_r5 = new ModelRenderer(this);
		Barrel_r5.setRotationPoint(-1.625F, 3.8F, -10.0F);
		Barrel.addChild(Barrel_r5);
		setRotationAngle(Barrel_r5, 0.0F, 0.0F, 0.5411F);
		Barrel_r5.cubeList.add(new ModelBox(Barrel_r5, 74, 45, -0.5F, -0.5F, -9.0F, 1, 1, 18, 0.0F, false));

		Barrel_r6 = new ModelRenderer(this);
		Barrel_r6.setRotationPoint(0.55F, -2.0F, -2.5F);
		Barrel.addChild(Barrel_r6);
		setRotationAngle(Barrel_r6, 0.7418F, 0.0F, 0.0F);
		Barrel_r6.cubeList.add(new ModelBox(Barrel_r6, 61, 76, -1.45F, -0.5F, -0.53F, 2, 1, 1, 0.0F, false));

		Barrel_r7 = new ModelRenderer(this);
		Barrel_r7.setRotationPoint(-1.5796F, -1.4004F, 0.5F);
		Barrel.addChild(Barrel_r7);
		setRotationAngle(Barrel_r7, 0.0F, 0.0F, -1.0646F);
		Barrel_r7.cubeList.add(new ModelBox(Barrel_r7, 113, 32, -0.4804F, -0.4396F, -3.0F, 1, 1, 6, 0.0F, false));

		Barrel_r8 = new ModelRenderer(this);
		Barrel_r8.setRotationPoint(-1.4796F, -1.5004F, 0.5F);
		Barrel.addChild(Barrel_r8);
		setRotationAngle(Barrel_r8, 0.0F, 0.0F, -1.0646F);
		Barrel_r8.cubeList.add(new ModelBox(Barrel_r8, 113, 39, -0.5154F, -0.4826F, -3.0F, 1, 1, 6, 0.0F, false));

		Barrel_r9 = new ModelRenderer(this);
		Barrel_r9.setRotationPoint(-1.0047F, -2.1779F, 0.4F);
		Barrel.addChild(Barrel_r9);
		setRotationAngle(Barrel_r9, 0.0F, 0.0F, -0.6021F);
		Barrel_r9.cubeList.add(new ModelBox(Barrel_r9, 100, 30, -0.5253F, -0.4621F, -3.0F, 1, 1, 6, -0.1F, false));
		Barrel_r9.cubeList.add(new ModelBox(Barrel_r9, 44, 43, -0.5253F, -0.4621F, 2.2F, 1, 1, 1, -0.1F, false));

		Barrel_r10 = new ModelRenderer(this);
		Barrel_r10.setRotationPoint(-1.1047F, -2.0779F, 0.6F);
		Barrel.addChild(Barrel_r10);
		setRotationAngle(Barrel_r10, 0.0F, 0.0F, -0.6021F);
		Barrel_r10.cubeList.add(new ModelBox(Barrel_r10, 65, 19, -0.5153F, -0.4821F, 2.0F, 1, 1, 1, -0.1F, false));
		Barrel_r10.cubeList.add(new ModelBox(Barrel_r10, 0, 101, -0.5153F, -0.4821F, -3.2F, 1, 1, 6, -0.1F, false));

		sightrail2 = new ModelRenderer(this);
		sightrail2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Barrel.addChild(sightrail2);
		sightrail2.cubeList.add(new ModelBox(sightrail2, 63, 14, -0.9F, -2.3F, -4.475F, 2, 1, 2, 0.0F, false));
		sightrail2.cubeList.add(new ModelBox(sightrail2, 72, 91, -0.9F, -2.3F, -6.475F, 2, 1, 1, 0.0F, false));
		sightrail2.cubeList.add(new ModelBox(sightrail2, 31, 91, -0.9F, -2.3F, -12.475F, 2, 1, 1, 0.0F, false));
		sightrail2.cubeList.add(new ModelBox(sightrail2, 61, 90, -0.9F, -2.3F, -10.475F, 2, 1, 1, 0.0F, false));
		sightrail2.cubeList.add(new ModelBox(sightrail2, 42, 90, -0.9F, -2.3F, -16.475F, 2, 1, 1, 0.0F, false));
		sightrail2.cubeList.add(new ModelBox(sightrail2, 63, 11, -0.9F, -2.3F, -19.475F, 2, 1, 2, 0.0F, false));
		sightrail2.cubeList.add(new ModelBox(sightrail2, 88, 89, -0.9F, -2.3F, -14.475F, 2, 1, 1, 0.0F, false));
		sightrail2.cubeList.add(new ModelBox(sightrail2, 72, 89, -0.9F, -2.3F, -8.475F, 2, 1, 1, 0.0F, false));

		cube_r52_r1 = new ModelRenderer(this);
		cube_r52_r1.setRotationPoint(-31.5276F, 23.6365F, 12.7F);
		sightrail2.addChild(cube_r52_r1);
		setRotationAngle(cube_r52_r1, 0.0F, 0.0F, 0.9425F);
		cube_r52_r1.cubeList.add(new ModelBox(cube_r52_r1, 62, 113, -2.95F, -39.991F, -36.275F, 1, 1, 4, -0.002F, false));

		cube_r51_r1 = new ModelRenderer(this);
		cube_r51_r1.setRotationPoint(32.2115F, 26.2091F, 12.7F);
		sightrail2.addChild(cube_r51_r1);
		setRotationAngle(cube_r51_r1, 0.0F, 0.0F, -0.8552F);
		cube_r51_r1.cubeList.add(new ModelBox(cube_r51_r1, 115, 89, 0.1192F, -42.191F, -36.275F, 1, 1, 4, 0.0F, false));

		cube_r50_r1 = new ModelRenderer(this);
		cube_r50_r1.setRotationPoint(-25.8094F, 27.9307F, 12.7F);
		sightrail2.addChild(cube_r50_r1);
		setRotationAngle(cube_r50_r1, 0.0F, 0.0F, 0.7854F);
		cube_r50_r1.cubeList.add(new ModelBox(cube_r50_r1, 103, 23, -3.775F, -38.975F, -21.175F, 1, 1, 1, -0.002F, false));
		cube_r50_r1.cubeList.add(new ModelBox(cube_r50_r1, 103, 21, -3.775F, -38.975F, -27.175F, 1, 1, 1, -0.002F, false));
		cube_r50_r1.cubeList.add(new ModelBox(cube_r50_r1, 9, 76, -3.775F, -38.975F, -32.175F, 1, 1, 2, -0.002F, false));
		cube_r50_r1.cubeList.add(new ModelBox(cube_r50_r1, 103, 19, -3.775F, -38.975F, -29.175F, 1, 1, 1, -0.002F, false));
		cube_r50_r1.cubeList.add(new ModelBox(cube_r50_r1, 19, 103, -3.775F, -38.975F, -23.175F, 1, 1, 1, -0.002F, false));
		cube_r50_r1.cubeList.add(new ModelBox(cube_r50_r1, 8, 103, -3.775F, -38.975F, -25.175F, 1, 1, 1, -0.002F, false));
		cube_r50_r1.cubeList.add(new ModelBox(cube_r50_r1, 0, 103, -3.775F, -38.975F, -19.175F, 1, 1, 1, -0.002F, false));
		cube_r50_r1.cubeList.add(new ModelBox(cube_r50_r1, 0, 76, -3.775F, -38.975F, -17.175F, 1, 1, 2, 0.0F, false));

		cube_r49_r1 = new ModelRenderer(this);
		cube_r49_r1.setRotationPoint(28.8094F, 27.9307F, 12.7F);
		sightrail2.addChild(cube_r49_r1);
		setRotationAngle(cube_r49_r1, 0.0F, 0.0F, -0.7854F);
		cube_r49_r1.cubeList.add(new ModelBox(cube_r49_r1, 11, 104, 0.775F, -40.975F, -21.175F, 1, 1, 1, 0.0F, false));
		cube_r49_r1.cubeList.add(new ModelBox(cube_r49_r1, 103, 72, 0.775F, -40.975F, -27.175F, 1, 1, 1, 0.0F, false));
		cube_r49_r1.cubeList.add(new ModelBox(cube_r49_r1, 31, 76, 0.775F, -40.975F, -32.175F, 1, 1, 2, 0.0F, false));
		cube_r49_r1.cubeList.add(new ModelBox(cube_r49_r1, 35, 103, 0.775F, -40.975F, -29.175F, 1, 1, 1, 0.0F, false));
		cube_r49_r1.cubeList.add(new ModelBox(cube_r49_r1, 31, 103, 0.775F, -40.975F, -23.175F, 1, 1, 1, 0.0F, false));
		cube_r49_r1.cubeList.add(new ModelBox(cube_r49_r1, 103, 25, 0.775F, -40.975F, -25.175F, 1, 1, 1, 0.0F, false));
		cube_r49_r1.cubeList.add(new ModelBox(cube_r49_r1, 25, 103, 0.775F, -40.975F, -19.175F, 1, 1, 1, 0.0F, false));
		cube_r49_r1.cubeList.add(new ModelBox(cube_r49_r1, 23, 76, 0.775F, -40.975F, -17.175F, 1, 1, 2, 0.0F, false));

		frontsight2 = new ModelRenderer(this);
		frontsight2.setRotationPoint(0.0F, 0.0F, -15.0F);
		Barrel.addChild(frontsight2);
		frontsight2.cubeList.add(new ModelBox(frontsight2, 49, 104, -0.4F, -3.2F, -8.175F, 1, 1, 1, 0.0F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(3.7F, -2.7F, -7.675F);
		frontsight2.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.0F, 0.0F, 0.384F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 79, 73, -2.96F, 1.3F, -0.6F, 1, 1, 2, -0.1F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(-0.7F, -2.7F, -7.675F);
		frontsight2.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.0F, 0.0F, -0.384F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 79, 70, -0.6F, 0.3F, -0.6F, 1, 1, 2, -0.1F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(0.0F, 0.0F, 0.0F);
		frontsight2.addChild(cube_r60);
		setRotationAngle(cube_r60, -0.7854F, 0.0F, 0.0F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 79, 20, -0.4F, 2.8F, -7.375F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		maingun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}