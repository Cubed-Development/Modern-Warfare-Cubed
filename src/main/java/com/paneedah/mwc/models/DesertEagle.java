package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DesertEagle extends ModelWithAttachments {
	private final ModelRenderer Hammer;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Grip;
	private final ModelRenderer cube_r21_r1;
	private final ModelRenderer cubes;
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
	private final ModelRenderer laser_rail;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer gripitself;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer details;
	private final ModelRenderer cube_r28;
	private final ModelRenderer MagBase;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer Barrel;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer frontsight;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer sightrail;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;

	public DesertEagle() {
		textureWidth = 128;
		textureHeight = 128;

		Hammer = new ModelRenderer(this);
		Hammer.setRotationPoint(-1.5F, -10.5F, 3.9F);
		setRotationAngle(Hammer, -1.0908F, 0.0F, 0.0F);
		Hammer.cubeList.add(new ModelBox(Hammer, 19, 17, -0.4F, -3.5F, 0.4F, 1, 4, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.4F, 0.5F, 1.4F);
		Hammer.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0524F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 25, 0.0F, -4.5F, -1.6F, 1, 1, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.4F, 0.5F, 1.4F);
		Hammer.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.576F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 25, 0.0F, -4.5F, -2.0F, 1, 3, 1, -0.002F, false));

		Grip = new ModelRenderer(this);
		Grip.setRotationPoint(-1.475F, -2.0F, -1.7F);
		Grip.cubeList.add(new ModelBox(Grip, 25, 38, -0.925F, -14.0F, 4.1F, 2, 5, 1, 0.0F, false));

		cube_r21_r1 = new ModelRenderer(this);
		cube_r21_r1.setRotationPoint(-26.3708F, 15.6256F, 1.7F);
		Grip.addChild(cube_r21_r1);
		setRotationAngle(cube_r21_r1, 0.0F, 0.0F, 0.7854F);
		cube_r21_r1.cubeList.add(new ModelBox(cube_r21_r1, 25, 78, -1.9F, -39.3F, 2.8F, 1, 1, 1, -0.1F, false));

		cubes = new ModelRenderer(this);
		cubes.setRotationPoint(0.6F, 0.0F, 0.0F);
		Grip.addChild(cubes);
		cubes.cubeList.add(new ModelBox(cubes, 50, 23, -3.0F, -8.0F, -14.0F, 5, 2, 20, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 86, 89, -2.4F, -6.0F, -12.4F, 4, 5, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 103, 102, -2.4F, -2.0F, -12.8F, 4, 1, 1, -0.002F, false));
		cubes.cubeList.add(new ModelBox(cubes, 24, 50, -2.4F, -2.0F, -11.4F, 4, 1, 8, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 53, 0, -3.0F, -8.0F, -32.0F, 5, 1, 18, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 80, 37, -2.1F, -7.0F, 5.4F, 3, 1, 5, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 0, 54, -2.1F, -7.0F, 9.9F, 3, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 0, 18, -3.0F, -8.0F, 5.4F, 5, 1, 3, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 94, 37, -3.0F, -6.0F, -4.2F, 5, 5, 9, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 61, 76, -3.0F, -2.0F, -4.8F, 5, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 94, 51, -3.0F, 6.0F, -0.875F, 5, 3, 9, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 0, 25, -2.0F, -6.0F, 4.3F, 3, 5, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		cubes.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.829F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 80, 28, -2.0F, -0.9F, 4.8F, 3, 2, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.0F, 0.0F, 0.0F);
		cubes.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.8727F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 59, 65, -4.0F, -5.4F, -2.3F, 5, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 67, 19, -4.0F, -5.4F, -1.8F, 5, 1, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.0F, 0.0F, 0.0F);
		cubes.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.6109F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 65, -4.0F, -8.2F, -0.8F, 5, 2, 1, -0.002F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.0F, 0.0F, 0.0F);
		cubes.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.4014F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 103, -3.4F, 6.7F, -4.2F, 4, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 94, -4.0F, -2.7F, -3.2F, 5, 9, 8, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.0F, 0.0F, 0.0F);
		cubes.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.1571F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 74, 61, -4.0F, 9.15F, 6.225F, 5, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 74, 66, -4.0F, 7.65F, 6.225F, 5, 2, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.0F, 0.0F, 0.0F);
		cubes.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.288F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 90, -4.0F, 5.6F, -2.525F, 5, 3, 8, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.0F, 0.0F, 0.7F);
		cubes.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.4014F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 72, 89, -4.0F, -2.7F, 3.8F, 5, 9, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.35F, -7.5F, 9.9F);
		cubes.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.3502F, -0.3211F, 0.1148F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 50, -1.914F, 0.0F, -1.3993F, 1, 1, 3, -0.002F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.6F, -7.5F, 9.9F);
		cubes.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.3502F, 0.3211F, -0.1148F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 50, 27, -1.736F, 0.0F, -2.2993F, 1, 1, 3, -0.002F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.9F, -7.5F, 9.9F);
		cubes.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.3316F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 85, -3.0F, 0.0F, -1.6F, 3, 1, 3, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.6F, -3.5F, -11.9F);
		cubes.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.5672F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 102, 78, -3.0F, -2.975F, 0.025F, 4, 2, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.6F, -3.5F, -11.9F);
		cubes.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.5672F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 93, 102, -3.0F, -2.975F, -1.025F, 4, 2, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.4F, -1.5F, -12.1F);
		cubes.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.7854F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 103, -2.0F, -0.85F, -0.85F, 4, 1, 1, -0.002F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.2F, -4.5F, -5.9F);
		cubes.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.2182F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 79, -1.5F, 0.9F, -0.45F, 2, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 37, 79, -1.5F, -0.1F, -0.45F, 2, 1, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.2F, -4.5F, -5.9F);
		cubes.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.3491F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 61, 29, -1.5F, -1.8F, -0.5F, 2, 2, 1, 0.0F, false));

		laser_rail = new ModelRenderer(this);
		laser_rail.setRotationPoint(0.5038F, -6.5972F, -15.5F);
		Grip.addChild(laser_rail);
		laser_rail.cubeList.add(new ModelBox(laser_rail, 79, 19, -1.5038F, -0.4028F, -0.5F, 2, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 37, 77, -1.5038F, -0.4028F, -6.5F, 2, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 20, 77, -1.5038F, -0.4028F, -4.5F, 2, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 9, 77, -1.5038F, -0.4028F, -10.5F, 2, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 0, 77, -1.5038F, -0.4028F, -8.5F, 2, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 52, 75, -1.5038F, -0.4028F, -14.5F, 2, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 37, 75, -1.5038F, -0.4028F, -12.5F, 2, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 20, 75, -1.5038F, -0.4028F, -16.5F, 2, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 28, 71, -2.0038F, -1.0028F, -16.5F, 3, 1, 18, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 9, 75, -1.5038F, -0.4028F, -2.5F, 2, 1, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(2.4462F, 0.0972F, 0.0F);
		laser_rail.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 94, -3.15F, -3.45F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 94, 51, -3.15F, -3.45F, -2.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 94, 55, -3.15F, -3.45F, -16.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 62, 94, -3.15F, -3.45F, -12.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 96, -3.15F, -3.45F, -14.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 96, -3.15F, -3.45F, -8.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 96, -3.15F, -3.45F, -10.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 48, 96, -3.15F, -3.45F, -4.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 66, 96, -3.15F, -3.45F, -6.5F, 1, 1, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.5038F, -0.0972F, 0.0F);
		laser_rail.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 94, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 48, 94, -0.5F, -0.5F, -2.5F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 94, 53, -0.5F, -0.5F, -16.5F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 94, 57, -0.5F, -0.5F, -12.5F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 66, 94, -0.5F, -0.5F, -14.5F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 4, 96, -0.5F, -0.5F, -8.5F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 96, -0.5F, -0.5F, -10.5F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 96, -0.5F, -0.5F, -4.5F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 62, 96, -0.5F, -0.5F, -6.5F, 1, 1, 1, 0.0F, false));

		gripitself = new ModelRenderer(this);
		gripitself.setRotationPoint(0.0F, 0.0F, 0.0F);
		Grip.addChild(gripitself);
		gripitself.cubeList.add(new ModelBox(gripitself, 35, 25, 1.95F, -6.2F, -2.8F, 1, 4, 4, -0.003F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 25, 13, 1.95F, -7.5F, 1.2F, 1, 5, 2, -0.001F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 50, 23, 1.95F, 8.0F, -1.2F, 1, 1, 9, -0.001F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 83, 45, 1.95F, 7.0F, 7.1F, 1, 2, 1, 0.0F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 25, 25, 1.95F, 3.6F, -1.2F, 1, 5, 8, -0.002F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 60, 81, -2.7F, 6.6F, 6.8F, 1, 2, 1, -0.002F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 52, 81, 1.95F, 6.6F, 6.8F, 1, 2, 1, -0.03F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 25, 0, -2.7F, -7.5F, 1.2F, 1, 5, 2, -0.001F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 25, 0, -2.7F, 3.6F, -1.2F, 1, 5, 8, -0.002F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 0, 50, -2.7F, 8.0F, -1.2F, 1, 1, 9, -0.001F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 81, 11, -2.7F, 7.0F, 7.1F, 1, 2, 1, 0.0F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 11, 50, -2.7F, -6.2F, -2.8F, 1, 3, 4, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.8F, 0.0F, 0.0F);
		gripitself.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.6371F, -0.8542F, -0.509F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 43, 6, -4.875F, -2.7F, -0.45F, 1, 10, 1, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 43, 33, -4.875F, -2.7F, -0.15F, 1, 10, 1, -0.002F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(1.0F, 0.0F, 0.0F);
		gripitself.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.4014F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 102, 66, -2.4F, -3.7F, -4.2F, 3, 11, 1, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -3.7F, -5.7F, -1.2F, 1, 3, 3, -0.002F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 50, 33, -3.7F, -5.7F, 3.8F, 1, 3, 2, -0.002F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 59, 33, -2.95F, 0.3F, 4.8F, 4, 6, 1, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -3.7F, -2.7F, -3.5F, 1, 9, 9, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 100, 12, -2.4F, 4.1F, -5.8F, 3, 2, 2, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 54, 101, -2.4F, 1.3F, -5.0F, 3, 2, 2, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 25, 0.95F, -2.7F, -3.5F, 1, 9, 9, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 40, 50, 0.95F, -5.7F, 3.8F, 1, 3, 2, -0.002F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.8F, 0.0F, 0.0F);
		gripitself.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.192F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 92, 81, -3.5F, -6.625F, -2.55F, 1, 1, 1, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 93, 84, -3.5F, -6.625F, -2.7F, 1, 1, 1, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 34, 38, -3.5F, -6.3F, -2.7F, 1, 4, 2, -0.002F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 25, 25, 1.15F, -6.3F, -2.7F, 1, 5, 2, -0.001F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 94, 14, 1.15F, -6.625F, -2.7F, 1, 1, 1, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 18, 94, 1.15F, -6.625F, -2.55F, 1, 1, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.8F, 0.0F, 0.0F);
		gripitself.addChild(cube_r23);
		setRotationAngle(cube_r23, 1.1868F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 94, -3.5F, -3.8F, 1.55F, 1, 1, 1, -0.002F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 4, 94, -3.5F, -3.0F, 0.6F, 1, 1, 1, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 11, 0, -2.2F, -1.4F, -7.5F, 3, 4, 3, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 11, 25, -2.2F, -3.4F, -4.5F, 3, 4, 3, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(2.1F, 0.0F, 0.0F);
		gripitself.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.2094F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 86, 95, -3.5F, 6.3F, -1.2F, 3, 2, 2, -0.002F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.8F, 0.0F, 0.0F);
		gripitself.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.1571F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 14, 81, -3.5F, 7.65F, 6.225F, 1, 2, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 102, 81, -2.75F, 9.15F, 6.525F, 4, 1, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 99, 98, -2.75F, 7.65F, 6.525F, 4, 2, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 94, 7, 1.15F, 9.15F, 6.275F, 1, 1, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 66, 81, 1.15F, 7.65F, 6.275F, 1, 2, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 26, 94, -3.5F, 9.15F, 6.225F, 1, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-0.55F, 0.0F, 0.0F);
		gripitself.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.288F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 18, 68, 2.5F, 5.6F, 5.175F, 1, 3, 1, 0.0F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 61, 71, -2.15F, 5.6F, 5.175F, 1, 3, 1, 0.0F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 24, 59, 2.5F, 5.6F, -2.525F, 1, 3, 8, -0.03F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 20, 73, -1.4F, 5.6F, -2.525F, 4, 3, 9, 0.0F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 60, -2.15F, 5.6F, -2.525F, 1, 3, 8, -0.001F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-0.55F, 0.0F, 0.0F);
		gripitself.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.6371F, 0.8542F, 0.509F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 67, 52, 3.875F, -2.7F, -0.45F, 1, 10, 1, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 89, 102, 3.875F, -2.7F, -0.15F, 1, 10, 1, 0.0F, false));

		details = new ModelRenderer(this);
		details.setRotationPoint(0.0F, 0.0F, 0.0F);
		Grip.addChild(details);
		details.cubeList.add(new ModelBox(details, 66, 92, 2.0F, -2.5F, -4.8F, 1, 1, 1, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 62, 92, -2.1F, -5.9F, -12.3F, 1, 1, 1, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 48, 92, 1.5F, -5.9F, -12.3F, 1, 1, 1, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 44, 92, 1.8F, -7.9F, -0.8F, 1, 1, 1, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 92, 11, 1.8F, -7.9F, -0.2F, 1, 1, 1, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 79, 70, 1.8F, -7.3F, -6.2F, 1, 1, 7, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 100, 7, 2.1F, -7.3F, -3.2F, 1, 1, 4, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 92, 9, -2.45F, -2.5F, -4.8F, 1, 1, 1, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 61, 26, -2.8F, -8.0F, -11.8F, 1, 1, 2, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 61, 23, -2.8F, -7.8F, -11.1F, 1, 1, 2, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 92, 3, -2.6F, -7.8F, -11.5F, 1, 1, 1, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 92, 1, -2.7F, -7.0F, -12.1F, 1, 1, 1, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-2.5F, -6.6F, -11.6F);
		details.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.7854F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 91, 78, -0.1F, -0.975F, -0.2F, 1, 1, 1, 0.0F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 91, 86, -0.1F, -1.2F, -0.2F, 1, 1, 1, 0.0F, false));

		MagBase = new ModelRenderer(this);
		MagBase.setRotationPoint(-0.025F, 10.0F, 3.0F);
		Grip.addChild(MagBase);
		MagBase.cubeList.add(new ModelBox(MagBase, 99, 18, -2.35F, -1.4F, -4.0F, 5, 2, 8, 0.0F, false));
		MagBase.cubeList.add(new ModelBox(MagBase, 53, 19, -2.35F, -0.4F, -5.8F, 5, 1, 2, -0.002F, false));
		MagBase.cubeList.add(new ModelBox(MagBase, 0, 43, -2.35F, -1.4F, 2.8F, 5, 2, 2, -0.002F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
		MagBase.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.9599F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 79, 84, -1.85F, 2.2F, 2.4F, 4, 2, 2, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
		MagBase.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.2618F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 53, 13, -2.35F, -0.4F, -5.7F, 5, 2, 2, -0.003F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 79, 78, -2.35F, -0.8F, -5.7F, 5, 2, 2, 0.0F, false));

		Barrel = new ModelRenderer(this);
		Barrel.setRotationPoint(-1.5F, -14.0F, -12.7F);
		Barrel.cubeList.add(new ModelBox(Barrel, 100, 0, -0.45F, -2.4F, -2.5F, 1, 1, 6, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 79, 66, -1.4F, -1.6F, -19.475F, 3, 1, 17, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 61, 71, -0.9F, -2.25F, -23.575F, 2, 1, 4, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 81, 0, 1.35F, -1.2F, -2.5F, 1, 2, 6, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 34, 59, -2.24F, -1.2F, -2.5F, 1, 2, 6, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 91, 37, 1.6F, 3.0F, -22.6F, 1, 1, 4, -0.001F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 60, 81, 1.6F, 1.7F, -22.6F, 1, 2, 4, -0.002F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 8, 81, -2.4F, 1.7F, -22.6F, 1, 2, 4, -0.003F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 35, 6, -1.4F, 0.8F, -23.6F, 3, 1, 1, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 12, 18, -2.4F, 3.0F, -22.6F, 1, 1, 4, -0.002F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 74, 45, -1.375F, 1.0F, -19.0F, 1, 3, 18, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 0, 73, 0.625F, 1.0F, -19.0F, 1, 3, 18, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 25, 0, -1.4F, 0.4F, -23.6F, 3, 1, 22, -0.002F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 55, 70, -1.4F, -0.2F, -19.6F, 3, 1, 18, -0.003F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 0, 6, -1.375F, 3.0F, 16.9F, 3, 2, 1, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 89, 8, -0.275F, 2.0F, 16.9F, 1, 1, 1, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 89, 4, -0.575F, 2.0F, 16.9F, 1, 1, 1, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 52, 73, -0.925F, 1.6F, 14.8F, 2, 1, 1, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(3.1F, 0.4F, 8.0F);
		Barrel.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, -0.2182F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 80, 19, -1.95F, -2.275F, -27.5F, 1, 1, 17, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-0.1F, 0.4F, 8.0F);
		Barrel.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.2182F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 81, 0, -1.775F, -1.65F, -27.5F, 1, 1, 17, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(3.1F, 1.0F, 8.0F);
		Barrel.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, -0.2182F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 80, 84, -1.825F, -2.45F, -27.5F, 1, 1, 17, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-0.1F, 0.7F, 8.0F);
		Barrel.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, 0.7243F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 89, 10, -1.4F, 0.29F, -31.6F, 1, 1, 1, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-0.1F, 1.0F, 8.0F);
		Barrel.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, 0.2182F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 81, -1.9F, -1.55F, -27.6F, 1, 2, 1, -0.002F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 89, 12, -1.9F, -2.35F, -29.6F, 1, 1, 1, 0.0F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 81, 0, -1.9F, -1.55F, -29.6F, 1, 2, 1, -0.002F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 35, 0, -1.9F, 0.15F, -31.6F, 1, 1, 5, 0.0F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 53, 89, -1.9F, -1.85F, -27.5F, 1, 1, 17, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(1.2F, 0.1F, -23.1F);
		Barrel.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, -0.1309F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 66, 0, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-1.0F, 0.1F, -23.1F);
		Barrel.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 0.0F, 0.1571F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 67, 47, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-1.9F, 2.7F, -22.1F);
		Barrel.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.4014F, 0.0F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 81, 15, -0.5F, -1.4F, -1.0F, 4, 1, 1, 0.0F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 86, 66, -0.5F, -1.0F, -1.0F, 4, 2, 1, -0.001F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 81, 8, 3.5F, -1.0F, -1.0F, 1, 2, 1, 0.0F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 24, 89, 3.5F, -1.4F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(0.3F, 1.0F, 8.0F);
		Barrel.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.0F, -0.2182F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 34, 13, 0.9F, 0.15F, -31.6F, 1, 1, 5, 0.0F, false));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 13, 89, 0.9F, -2.35F, -29.6F, 1, 1, 1, -0.001F, false));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 81, 3, 0.9F, -1.55F, -29.6F, 1, 2, 1, 0.0F, false));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 8, 81, 0.9F, -1.55F, -27.6F, 1, 2, 1, 0.0F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(1.656F, 0.3482F, -23.1F);
		Barrel.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 0.0F, -0.7243F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 20, 89, -0.866F, -0.3482F, -0.5F, 1, 1, 1, -0.002F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-1.65F, 0.7684F, -3.5116F);
		Barrel.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.3927F, 0.0F, 0.0F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 89, 84, -0.65F, -0.5F, -1.4F, 1, 1, 1, -0.1F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 53, 3, -0.65F, -0.5F, -0.6F, 1, 1, 2, -0.1F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 44, 90, 3.1F, -0.5F, -1.4F, 1, 1, 1, -0.1F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 24, 54, 3.1F, -0.5F, -0.6F, 1, 1, 2, -0.1F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(0.1F, 0.0F, 0.0F);
		Barrel.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.0F, 0.8552F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 52, 81, -0.4F, -2.45F, -2.5F, 1, 1, 6, 0.0F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 78, 93, -0.7F, -2.45F, -2.5F, 1, 1, 6, -0.002F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(0.1F, 0.0F, 0.0F);
		Barrel.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, 0.0F, 0.2618F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 18, 94, -0.2F, -2.425F, -2.5F, 1, 1, 6, 0.0F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(0.0F, 0.0F, 0.0F);
		Barrel.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, 0.0F, -0.8552F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 99, 28, -0.6F, -2.45F, -2.5F, 1, 1, 6, 0.0F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 99, 84, -0.3F, -2.45F, -2.5F, 1, 1, 6, 0.0F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(0.0F, 0.0F, 0.0F);
		Barrel.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, 0.0F, -0.2618F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 99, 91, -0.8F, -2.425F, -2.5F, 1, 1, 6, 0.0F, false));

		frontsight = new ModelRenderer(this);
		frontsight.setRotationPoint(0.0F, 0.0F, -15.0F);
		Barrel.addChild(frontsight);
		frontsight.cubeList.add(new ModelBox(frontsight, 91, 75, -0.4F, -3.2F, -8.175F, 1, 1, 1, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(3.7F, -2.7F, -7.675F);
		frontsight.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.0F, 0.384F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 42, 59, -2.96F, 1.3F, -0.6F, 1, 1, 2, -0.1F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-0.7F, -2.7F, -7.675F);
		frontsight.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, -0.384F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 60, -0.6F, 0.3F, -0.6F, 1, 1, 2, -0.1F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
		frontsight.addChild(cube_r48);
		setRotationAngle(cube_r48, -0.7854F, 0.0F, 0.0F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 50, 60, -0.4F, 2.8F, -7.375F, 1, 1, 2, 0.0F, false));

		sightrail = new ModelRenderer(this);
		sightrail.setRotationPoint(0.0F, 0.0F, 0.0F);
		Barrel.addChild(sightrail);
		sightrail.cubeList.add(new ModelBox(sightrail, 39, 19, -0.9F, -2.3F, -4.475F, 2, 1, 2, 0.0F, false));
		sightrail.cubeList.add(new ModelBox(sightrail, 0, 75, -0.9F, -2.3F, -6.475F, 2, 1, 1, 0.0F, false));
		sightrail.cubeList.add(new ModelBox(sightrail, 74, 57, -0.9F, -2.3F, -12.475F, 2, 1, 1, 0.0F, false));
		sightrail.cubeList.add(new ModelBox(sightrail, 74, 55, -0.9F, -2.3F, -10.475F, 2, 1, 1, 0.0F, false));
		sightrail.cubeList.add(new ModelBox(sightrail, 74, 53, -0.9F, -2.3F, -16.475F, 2, 1, 1, 0.0F, false));
		sightrail.cubeList.add(new ModelBox(sightrail, 0, 31, -0.9F, -2.3F, -19.475F, 2, 1, 2, 0.0F, false));
		sightrail.cubeList.add(new ModelBox(sightrail, 74, 49, -0.9F, -2.3F, -14.475F, 2, 1, 1, 0.0F, false));
		sightrail.cubeList.add(new ModelBox(sightrail, 74, 47, -0.9F, -2.3F, -8.475F, 2, 1, 1, 0.0F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(3.0F, 0.0F, -5.0F);
		sightrail.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, 0.0F, -0.7854F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 48, 90, -0.725F, -2.975F, -3.475F, 1, 1, 1, 0.0F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 66, 90, -0.725F, -2.975F, -9.475F, 1, 1, 1, 0.0F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 40, 55, -0.725F, -2.975F, -14.475F, 1, 1, 2, 0.0F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 91, 20, -0.725F, -2.975F, -11.475F, 1, 1, 1, 0.0F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 91, 28, -0.725F, -2.975F, -5.475F, 1, 1, 1, 0.0F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 91, 37, -0.725F, -2.975F, -7.475F, 1, 1, 1, 0.0F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 91, 71, -0.725F, -2.975F, -1.475F, 1, 1, 1, 0.0F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 34, 59, -0.725F, -2.975F, 0.525F, 1, 1, 2, 0.0F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(0.0F, 0.0F, -5.0F);
		sightrail.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.7854F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 62, 90, -2.275F, -0.975F, -3.475F, 1, 1, 1, -0.002F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 91, 15, -2.275F, -0.975F, -9.475F, 1, 1, 1, -0.002F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 56, -2.275F, -0.975F, -14.475F, 1, 1, 2, -0.002F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 91, 22, -2.275F, -0.975F, -11.475F, 1, 1, 1, -0.002F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 91, 30, -2.275F, -0.975F, -5.475F, 1, 1, 1, -0.002F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 91, 39, -2.275F, -0.975F, -7.475F, 1, 1, 1, -0.002F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 91, 73, -2.275F, -0.975F, -1.475F, 1, 1, 1, -0.002F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 24, 59, -2.275F, -0.975F, 0.525F, 1, 1, 2, 0.0F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(3.9192F, -1.591F, -21.575F);
		sightrail.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, -0.8552F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 26, 94, -2.3F, -2.6F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-0.9192F, -1.591F, -21.575F);
		sightrail.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, 0.9425F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 72, 99, -0.5308F, -0.4F, -2.0F, 1, 1, 4, -0.002F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Hammer.render(f5);
		Grip.render(f5);
		Barrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}