package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M38HandGuard extends ModelWithAttachments {
	private final ModelRenderer handguard;
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r2;
	private final ModelRenderer bone_r3;
	private final ModelRenderer bone_r4;
	private final ModelRenderer bone_r5;
	private final ModelRenderer bone_r6;
	private final ModelRenderer bone_r7;
	private final ModelRenderer bone_r8;
	private final ModelRenderer bone_r9;
	private final ModelRenderer bone_r10;
	private final ModelRenderer bone_r11;
	private final ModelRenderer bone_r12;
	private final ModelRenderer bone_r13;
	private final ModelRenderer bone_r14;
	private final ModelRenderer bone_r15;
	private final ModelRenderer handguard10;
	private final ModelRenderer gun;
	private final ModelRenderer receiver17_r1;
	private final ModelRenderer receiver16_r1;
	private final ModelRenderer receiver18_r1;
	private final ModelRenderer receiver17_r2;
	private final ModelRenderer receiver17_r3;
	private final ModelRenderer receiver16_r2;
	private final ModelRenderer receiver15_r1;
	private final ModelRenderer receiver14_r1;
	private final ModelRenderer receiver16_r3;
	private final ModelRenderer receiver15_r2;
	private final ModelRenderer receiver16_r4;
	private final ModelRenderer receiver15_r3;
	private final ModelRenderer receiver14_r2;
	private final ModelRenderer receiver14_r3;
	private final ModelRenderer receiver17_r4;
	private final ModelRenderer receiver16_r5;
	private final ModelRenderer receiver16_r6;
	private final ModelRenderer receiver15_r4;
	private final ModelRenderer receiver15_r5;
	private final ModelRenderer gun30_r1;
	private final ModelRenderer gun29_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun38_r1;
	private final ModelRenderer gun37_r1;
	private final ModelRenderer gun37_r2;
	private final ModelRenderer gun51_r1;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun80_r1;
	private final ModelRenderer gun82_r1;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer bone_r16;
	private final ModelRenderer gun132;
	private final ModelRenderer gun67;
	private final ModelRenderer gun60;

	public M38HandGuard() {
		textureWidth = 190;
		textureHeight = 190;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 19, 46, -1.3F, -36.8F, -27.2F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 18, -3.7F, -36.8F, -27.2F, 1, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 116, 30, 0.101F, -37.4F, -50.702F, 1, 1, 28, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 86, 0, -4.099F, -37.4F, -50.702F, 1, 1, 28, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 113, 0.1F, -37.9F, -50.7F, 1, 1, 28, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 86, 43, -4.1F, -37.9F, -50.7F, 1, 1, 28, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 124, 60, -2.3F, -36.1F, -47.703F, 2, 1, 25, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 13, -2.3F, -36.1F, -50.701F, 2, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 116, 1, -2.7F, -40.0F, -50.699F, 1, 1, 28, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 60, 115, -1.3F, -40.0F, -50.699F, 1, 1, 28, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 32, 85, -2.5F, -35.6F, -50.7F, 2, 1, 28, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 84, -2.5F, -40.75F, -50.699F, 2, 1, 28, 0.0F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(-2.7F, -40.0F, -50.7F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 0.0F, 0.9774F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 30, 114, 0.0F, -1.0F, 0.0F, 1, 1, 28, 0.0F, false));

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(-0.3F, -40.0F, -50.7F);
		bone.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.0F, 0.0F, -0.9774F);
		bone_r2.cubeList.add(new ModelBox(bone_r2, 94, 114, -1.0F, -1.0F, 0.0F, 1, 1, 28, 0.0F, false));

		bone_r3 = new ModelRenderer(this);
		bone_r3.setRotationPoint(-2.55F, -39.1F, -29.7F);
		bone.addChild(bone_r3);
		setRotationAngle(bone_r3, 0.0F, 0.0F, -0.4014F);
		bone_r3.cubeList.add(new ModelBox(bone_r3, 10, 59, -1.0F, 0.0F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r3.cubeList.add(new ModelBox(bone_r3, 0, 59, -1.0F, 0.0F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r3.cubeList.add(new ModelBox(bone_r3, 10, 59, -1.0F, 0.0F, -10.001F, 1, 1, 2, 0.0F, false));
		bone_r3.cubeList.add(new ModelBox(bone_r3, 59, 43, -1.0F, 0.0F, -16.001F, 1, 1, 2, 0.0F, false));
		bone_r3.cubeList.add(new ModelBox(bone_r3, 64, 86, -0.4F, -0.001F, -21.002F, 1, 1, 28, 0.0F, false));
		bone_r3.cubeList.add(new ModelBox(bone_r3, 43, 26, -1.0F, 0.0F, -21.0F, 1, 1, 1, 0.0F, false));

		bone_r4 = new ModelRenderer(this);
		bone_r4.setRotationPoint(-2.55F, -35.2F, -29.7F);
		bone.addChild(bone_r4);
		setRotationAngle(bone_r4, 0.0F, 0.0F, 0.4014F);
		bone_r4.cubeList.add(new ModelBox(bone_r4, 0, 0, -1.0F, -1.0F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 0, 22, -1.0F, -1.0F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 19, 26, -1.0F, -1.0F, -10.001F, 1, 1, 2, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 36, 26, -1.0F, -1.0F, -18.001F, 1, 1, 1, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 35, 49, -1.0F, -1.0F, -16.001F, 1, 1, 2, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 124, 114, -0.4F, -0.999F, -17.002F, 1, 1, 24, 0.0F, false));
		bone_r4.cubeList.add(new ModelBox(bone_r4, 37, 4, -1.0F, -1.0F, -21.0F, 1, 1, 1, 0.0F, false));

		bone_r5 = new ModelRenderer(this);
		bone_r5.setRotationPoint(-0.45F, -35.2F, -29.7F);
		bone.addChild(bone_r5);
		setRotationAngle(bone_r5, 0.0F, 0.0F, -0.4014F);
		bone_r5.cubeList.add(new ModelBox(bone_r5, 0, 18, 0.0F, -1.0F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 50, 0, 0.0F, -1.0F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 50, 24, 0.0F, -1.0F, -10.001F, 1, 1, 2, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 43, 2, 0.0F, -1.0F, -18.001F, 1, 1, 1, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 58, 18, 0.0F, -1.0F, -16.001F, 1, 1, 2, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 128, 139, -0.6F, -0.999F, -17.002F, 1, 1, 24, 0.0F, false));
		bone_r5.cubeList.add(new ModelBox(bone_r5, 43, 18, 0.0F, -1.0F, -21.0F, 1, 1, 1, 0.0F, false));

		bone_r6 = new ModelRenderer(this);
		bone_r6.setRotationPoint(-0.45F, -39.1F, -29.7F);
		bone.addChild(bone_r6);
		setRotationAngle(bone_r6, 0.0F, 0.0F, 0.4014F);
		bone_r6.cubeList.add(new ModelBox(bone_r6, 64, 29, 0.0F, 0.0F, -0.001F, 1, 1, 7, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 53, 59, 0.0F, 0.0F, -4.001F, 1, 1, 2, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 61, 37, 0.0F, 0.0F, -10.001F, 1, 1, 2, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 62, 0, 0.0F, 0.0F, -16.001F, 1, 1, 2, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 94, 85, -0.6F, -0.001F, -21.002F, 1, 1, 28, 0.0F, false));
		bone_r6.cubeList.add(new ModelBox(bone_r6, 0, 44, 0.0F, 0.0F, -21.0F, 1, 1, 1, 0.0F, false));

		bone_r7 = new ModelRenderer(this);
		bone_r7.setRotationPoint(-3.85F, -37.8F, -29.7F);
		bone.addChild(bone_r7);
		setRotationAngle(bone_r7, 0.0F, 0.0F, 0.4014F);
		bone_r7.cubeList.add(new ModelBox(bone_r7, 59, 43, 0.0F, -1.0F, -0.002F, 1, 1, 7, 0.0F, false));
		bone_r7.cubeList.add(new ModelBox(bone_r7, 58, 27, 0.0F, -1.0F, -4.0F, 1, 1, 2, 0.0F, false));
		bone_r7.cubeList.add(new ModelBox(bone_r7, 19, 59, 0.0F, -1.0F, -10.0F, 1, 1, 2, 0.0F, false));
		bone_r7.cubeList.add(new ModelBox(bone_r7, 43, 59, 0.0F, -1.0F, -16.0F, 1, 1, 2, 0.0F, false));
		bone_r7.cubeList.add(new ModelBox(bone_r7, 0, 142, -0.001F, -0.55F, -21.001F, 1, 1, 21, 0.0F, false));
		bone_r7.cubeList.add(new ModelBox(bone_r7, 43, 24, 0.0F, -1.0F, -20.999F, 1, 1, 1, 0.0F, false));

		bone_r8 = new ModelRenderer(this);
		bone_r8.setRotationPoint(-3.85F, -36.5F, -29.7F);
		bone.addChild(bone_r8);
		setRotationAngle(bone_r8, 0.0F, 0.0F, -0.4014F);
		bone_r8.cubeList.add(new ModelBox(bone_r8, 0, 8, 0.0F, 0.0F, -0.003F, 1, 1, 7, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 19, 22, 0.0F, 0.0F, -4.0F, 1, 1, 2, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 19, 29, 0.0F, 0.0F, -10.0F, 1, 1, 2, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 37, 2, 0.0F, 0.0F, -18.0F, 1, 1, 1, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 0, 30, 0.0F, 0.0F, -16.0F, 1, 1, 2, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 37, 11, -0.001F, -0.45F, -21.001F, 1, 1, 1, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 0, 0, -0.001F, -0.45F, -17.001F, 1, 1, 17, 0.0F, false));
		bone_r8.cubeList.add(new ModelBox(bone_r8, 37, 6, 0.0F, 0.0F, -20.999F, 1, 1, 1, 0.0F, false));

		bone_r9 = new ModelRenderer(this);
		bone_r9.setRotationPoint(0.85F, -36.5F, -29.7F);
		bone.addChild(bone_r9);
		setRotationAngle(bone_r9, 0.0F, 0.0F, 0.4014F);
		bone_r9.cubeList.add(new ModelBox(bone_r9, 0, 26, -1.0F, 0.0F, -0.003F, 1, 1, 7, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 50, 6, -1.0F, 0.0F, -4.0F, 1, 1, 2, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 50, 18, -1.0F, 0.0F, -10.0F, 1, 1, 2, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 43, 6, -1.0F, 0.0F, -18.0F, 1, 1, 1, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 58, 21, -1.0F, 0.0F, -16.0F, 1, 1, 2, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 43, 8, -0.999F, -0.45F, -21.001F, 1, 1, 1, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 0, 18, -0.999F, -0.45F, -17.001F, 1, 1, 17, 0.0F, false));
		bone_r9.cubeList.add(new ModelBox(bone_r9, 43, 20, -1.0F, 0.0F, -20.999F, 1, 1, 1, 0.0F, false));

		bone_r10 = new ModelRenderer(this);
		bone_r10.setRotationPoint(0.85F, -37.8F, -29.7F);
		bone.addChild(bone_r10);
		setRotationAngle(bone_r10, 0.0F, 0.0F, -0.4014F);
		bone_r10.cubeList.add(new ModelBox(bone_r10, 63, 60, -1.0F, -1.0F, -0.002F, 1, 1, 7, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 59, 46, -1.0F, -1.0F, -4.0F, 1, 1, 2, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 35, 60, -1.0F, -1.0F, -10.0F, 1, 1, 2, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 0, 62, -1.0F, -1.0F, -16.0F, 1, 1, 2, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 23, 143, -0.999F, -0.55F, -21.001F, 1, 1, 21, 0.0F, false));
		bone_r10.cubeList.add(new ModelBox(bone_r10, 10, 44, -1.0F, -1.0F, -20.999F, 1, 1, 1, 0.0F, false));

		bone_r11 = new ModelRenderer(this);
		bone_r11.setRotationPoint(-3.85F, -36.5F, -47.0F);
		bone.addChild(bone_r11);
		setRotationAngle(bone_r11, -0.7854F, 0.0F, -0.4014F);
		bone_r11.cubeList.add(new ModelBox(bone_r11, 36, 34, 0.0001F, -0.05F, -1.001F, 1, 1, 1, 0.0F, false));

		bone_r12 = new ModelRenderer(this);
		bone_r12.setRotationPoint(0.85F, -36.5F, -47.0F);
		bone.addChild(bone_r12);
		setRotationAngle(bone_r12, -0.7854F, 0.0F, 0.4014F);
		bone_r12.cubeList.add(new ModelBox(bone_r12, 10, 42, -1.0001F, -0.05F, -1.001F, 1, 1, 1, 0.0F, false));

		bone_r13 = new ModelRenderer(this);
		bone_r13.setRotationPoint(-3.85F, -36.5F, -49.1F);
		bone.addChild(bone_r13);
		setRotationAngle(bone_r13, -0.7854F, 0.0F, -0.4014F);
		bone_r13.cubeList.add(new ModelBox(bone_r13, 36, 28, 0.0001F, -0.05F, -1.001F, 1, 1, 1, 0.0F, false));

		bone_r14 = new ModelRenderer(this);
		bone_r14.setRotationPoint(0.85F, -36.5F, -49.1F);
		bone.addChild(bone_r14);
		setRotationAngle(bone_r14, -0.7854F, 0.0F, 0.4014F);
		bone_r14.cubeList.add(new ModelBox(bone_r14, 43, 0, -1.0001F, -0.05F, -1.001F, 1, 1, 1, 0.0F, false));

		bone_r15 = new ModelRenderer(this);
		bone_r15.setRotationPoint(-3.9F, -35.3F, -26.8F);
		bone.addChild(bone_r15);
		setRotationAngle(bone_r15, -0.3316F, 0.0F, 0.0F);
		bone_r15.cubeList.add(new ModelBox(bone_r15, 20, 36, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));
		bone_r15.cubeList.add(new ModelBox(bone_r15, 0, 42, 3.8F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		handguard10 = new ModelRenderer(this);
		handguard10.setRotationPoint(-2.7F, -36.2F, -50.7F);
		bone.addChild(handguard10);
		handguard10.cubeList.add(new ModelBox(handguard10, 26, 54, 0.0F, 0.099F, 0.001F, 1, 1, 1, 0.0F, false));
		handguard10.cubeList.add(new ModelBox(handguard10, 124, 86, 0.0F, 0.099F, 2.998F, 1, 1, 25, 0.0F, false));

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 43, 68, -1.8F, -37.8F, -67.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 0, -1.8F, -37.55F, -53.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 68, 18, -2.2F, -37.8F, -67.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 53, 60, -2.2F, -37.55F, -53.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 60, -2.2F, -38.2F, -67.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 51, -2.2F, -38.45F, -53.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 29, 54, -1.8F, -38.2F, -67.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 59, -1.8F, -38.45F, -53.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 51, -1.6F, -38.0F, -67.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 59, -1.35F, -38.0F, -53.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 24, -2.4F, -38.0F, -67.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 59, -2.65F, -38.0F, -53.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 18, -2.0F, -37.6F, -67.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 18, -2.0F, -36.85F, -53.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 6, -2.0F, -38.4F, -67.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 42, -2.0F, -38.9F, -53.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 43, -2.2F, -38.0F, -62.499F, 1, 1, 41, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 1, -1.8F, -38.0F, -62.501F, 1, 1, 41, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 42, -2.0F, -37.8F, -62.5F, 1, 1, 41, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -2.0F, -38.2F, -62.5F, 1, 1, 41, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 36, -0.05F, -36.1F, -12.75F, 1, 2, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 53, 0.0F, -34.6F, -12.751F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 34, 52, -0.3F, -35.6F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 51, -0.3F, -35.6F, -12.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 0, -0.35F, -32.8F, -16.5F, 1, 6, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 51, -3.7F, -33.9F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 51, -3.801F, -32.501F, -12.4F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 69, 51, -3.8F, -32.5F, -13.7F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 30, 26, -3.8F, -34.3F, -14.7F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 0, -3.8F, -35.3F, -21.4F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 36, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 42, -3.3F, -36.0F, -1.001F, 3, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 30, 26, -0.7F, -36.0F, -0.998F, 1, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 36, -3.501F, -35.7F, -22.7F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 0, -0.4F, -33.5F, -16.3F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 8, -0.35F, -36.5F, -16.5F, 1, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 29, 42, -3.5F, -36.0F, -13.2F, 4, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 43, -3.5F, -36.0F, -21.2F, 4, 8, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 11, -3.5F, -28.0F, -18.2F, 4, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 49, -0.3F, -34.5F, -6.3F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 49, -0.3F, -34.5F, -2.8F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 48, -0.3F, -34.5F, -5.9F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 29, 48, -0.3F, -34.5F, -2.4F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 0, -3.3F, -36.0F, -14.0F, 3, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 18, -0.7F, -36.0F, -14.0F, 1, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 18, -3.001F, -32.0F, -13.8F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 18, -3.001F, -27.0F, -13.3F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 8, -2.999F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 0, -2.6F, -39.401F, 1.0015F, 2, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -1.4F, -39.4F, 1.0025F, 1, 4, 2, 0.0F, false));

		receiver17_r1 = new ModelRenderer(this);
		receiver17_r1.setRotationPoint(0.25F, -37.5F, 2.35F);
		gun.addChild(receiver17_r1);
		setRotationAngle(receiver17_r1, 0.0F, 0.0F, 0.4014F);
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 62, 3, -0.999F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 10, 62, -1.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver16_r1 = new ModelRenderer(this);
		receiver16_r1.setRotationPoint(-3.25F, -37.5F, 2.35F);
		gun.addChild(receiver16_r1);
		setRotationAngle(receiver16_r1, 0.0F, 0.0F, -0.4014F);
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 62, 9, -0.001F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 19, 62, 0.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver18_r1 = new ModelRenderer(this);
		receiver18_r1.setRotationPoint(-1.5F, -35.75F, 2.35F);
		gun.addChild(receiver18_r1);
		setRotationAngle(receiver18_r1, 0.0F, 0.0F, -0.4014F);
		receiver18_r1.cubeList.add(new ModelBox(receiver18_r1, 62, 28, 0.35F, -0.999F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver18_r1.cubeList.add(new ModelBox(receiver18_r1, 63, 63, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r2 = new ModelRenderer(this);
		receiver17_r2.setRotationPoint(-1.5F, -39.25F, 2.35F);
		gun.addChild(receiver17_r2);
		setRotationAngle(receiver17_r2, 0.0F, 0.0F, 0.4014F);
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 43, 62, 0.35F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 65, 38, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r3 = new ModelRenderer(this);
		receiver17_r3.setRotationPoint(-1.5F, -35.75F, 2.35F);
		gun.addChild(receiver17_r3);
		setRotationAngle(receiver17_r3, 0.0F, 0.0F, 0.4014F);
		receiver17_r3.cubeList.add(new ModelBox(receiver17_r3, 53, 62, -1.35F, -0.999F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver17_r3.cubeList.add(new ModelBox(receiver17_r3, 66, 10, -1.0F, -1.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver16_r2 = new ModelRenderer(this);
		receiver16_r2.setRotationPoint(-1.5F, -39.25F, 2.35F);
		gun.addChild(receiver16_r2);
		setRotationAngle(receiver16_r2, 0.0F, 0.0F, -0.4014F);
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 63, 60, -1.35F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 34, 66, -1.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver15_r1 = new ModelRenderer(this);
		receiver15_r1.setRotationPoint(0.25F, -37.5F, 2.35F);
		gun.addChild(receiver15_r1);
		setRotationAngle(receiver15_r1, 0.0F, 0.0F, -0.4014F);
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 11, 68, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 68, 43, -0.999F, -1.35F, -0.0001F, 1, 1, 2, 0.0F, false));

		receiver14_r1 = new ModelRenderer(this);
		receiver14_r1.setRotationPoint(-3.25F, -37.5F, 2.35F);
		gun.addChild(receiver14_r1);
		setRotationAngle(receiver14_r1, 0.0F, 0.0F, 0.4014F);
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 27, 68, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 68, 46, -0.001F, -1.35F, -0.0001F, 1, 1, 2, 0.0F, false));

		receiver16_r3 = new ModelRenderer(this);
		receiver16_r3.setRotationPoint(-3.8F, -37.5F, 1.0F);
		gun.addChild(receiver16_r3);
		setRotationAngle(receiver16_r3, -0.925F, 0.0F, -0.2618F);
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 19, 18, 0.001F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver15_r2 = new ModelRenderer(this);
		receiver15_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		gun.addChild(receiver15_r2);
		setRotationAngle(receiver15_r2, -0.925F, 0.0F, 0.2618F);
		receiver15_r2.cubeList.add(new ModelBox(receiver15_r2, 0, 26, -0.999F, -0.2F, 0.7F, 1, 2, 2, 0.0F, false));

		receiver16_r4 = new ModelRenderer(this);
		receiver16_r4.setRotationPoint(-3.37F, -35.9F, 0.0F);
		gun.addChild(receiver16_r4);
		setRotationAngle(receiver16_r4, 0.0F, 0.0F, -0.0524F);
		receiver16_r4.cubeList.add(new ModelBox(receiver16_r4, 9, 26, 0.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver15_r3 = new ModelRenderer(this);
		receiver15_r3.setRotationPoint(0.37F, -35.9F, 0.0F);
		gun.addChild(receiver15_r3);
		setRotationAngle(receiver15_r3, 0.0F, 0.0F, 0.0524F);
		receiver15_r3.cubeList.add(new ModelBox(receiver15_r3, 32, 11, -1.0F, 0.0F, 0.001F, 1, 2, 3, 0.0F, false));

		receiver14_r2 = new ModelRenderer(this);
		receiver14_r2.setRotationPoint(0.8F, -37.5F, 1.0F);
		gun.addChild(receiver14_r2);
		setRotationAngle(receiver14_r2, 0.0F, 0.0F, 0.2618F);
		receiver14_r2.cubeList.add(new ModelBox(receiver14_r2, 19, 42, -2.0F, 0.0F, 0.0012F, 2, 2, 2, 0.0F, false));

		receiver14_r3 = new ModelRenderer(this);
		receiver14_r3.setRotationPoint(0.8F, -37.5F, 1.0F);
		gun.addChild(receiver14_r3);
		setRotationAngle(receiver14_r3, 0.0F, 0.0F, -0.4014F);
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 43, 47, -1.999F, -1.3F, 0.001F, 2, 1, 2, 0.0F, false));
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 50, 69, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r4 = new ModelRenderer(this);
		receiver17_r4.setRotationPoint(-2.6F, -39.4F, 1.0F);
		gun.addChild(receiver17_r4);
		setRotationAngle(receiver17_r4, 0.0F, 0.0F, -0.8029F);
		receiver17_r4.cubeList.add(new ModelBox(receiver17_r4, 15, 69, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver16_r5 = new ModelRenderer(this);
		receiver16_r5.setRotationPoint(-0.4F, -39.4F, 1.0F);
		gun.addChild(receiver16_r5);
		setRotationAngle(receiver16_r5, 0.0F, 0.0F, 0.8029F);
		receiver16_r5.cubeList.add(new ModelBox(receiver16_r5, 31, 69, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver16_r6 = new ModelRenderer(this);
		receiver16_r6.setRotationPoint(-1.5F, -37.5F, 3.1F);
		gun.addChild(receiver16_r6);
		setRotationAngle(receiver16_r6, 0.0F, 0.0F, -0.3316F);
		receiver16_r6.cubeList.add(new ModelBox(receiver16_r6, 19, 26, -1.0F, -1.001F, 8.0015F, 2, 2, 7, -0.1F, false));
		receiver16_r6.cubeList.add(new ModelBox(receiver16_r6, 0, 42, -1.0F, -1.001F, -0.2985F, 2, 2, 15, -0.2F, false));

		receiver15_r4 = new ModelRenderer(this);
		receiver15_r4.setRotationPoint(-3.8F, -37.5F, 1.0F);
		gun.addChild(receiver15_r4);
		setRotationAngle(receiver15_r4, 0.0F, 0.0F, -0.2618F);
		receiver15_r4.cubeList.add(new ModelBox(receiver15_r4, 43, 36, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		receiver15_r5 = new ModelRenderer(this);
		receiver15_r5.setRotationPoint(-3.8F, -37.5F, 1.0F);
		gun.addChild(receiver15_r5);
		setRotationAngle(receiver15_r5, 0.0F, 0.0F, 0.4014F);
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 69, 37, -0.001F, -1.3F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 49, 38, 0.0F, -1.0F, -0.001F, 2, 1, 2, 0.0F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-3.2F, -31.0F, -7.6F);
		gun.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 26, 51, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-3.2F, -27.0F, -7.6F);
		gun.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.3562F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 22, 36, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -27.0F, -11.5F);
		gun.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 55, 36, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(0.5F, -33.7F, -11.3F);
		gun.addChild(gun39_r1);
		setRotationAngle(gun39_r1, -0.3665F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 49, 36, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(0.5F, -32.7F, -7.6F);
		gun.addChild(gun38_r1);
		setRotationAngle(gun38_r1, -0.3665F, 0.0F, 0.0F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 50, 3, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-3.4F, -33.0F, -4.2F);
		gun.addChild(gun37_r1);
		setRotationAngle(gun37_r1, -0.3665F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 9, 31, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun37_r2 = new ModelRenderer(this);
		gun37_r2.setRotationPoint(-2.6F, -34.7F, -0.6F);
		gun.addChild(gun37_r2);
		setRotationAngle(gun37_r2, -0.3665F, 0.0F, 0.0F);
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 30, 36, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 14, 39, -0.8F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun51_r1 = new ModelRenderer(this);
		gun51_r1.setRotationPoint(-3.9F, -27.5F, -21.2F);
		gun.addChild(gun51_r1);
		setRotationAngle(gun51_r1, 1.3756F, 0.0F, 0.0F);
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 19, 0, 0.1F, 0.0806F, 0.0981F, 4, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 31, 8, 0.101F, -0.4194F, 0.098F, 4, 1, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 36, 16, 3.7F, 0.08F, 0.098F, 1, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 50, 9, 3.699F, -0.42F, 0.1F, 1, 1, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-3.5F, -32.0F, -11.2F);
		gun.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.7884F, 0.0F, 0.0F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 43, 43, 2.999F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-3.5F, -34.5F, -22.7F);
		gun.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.9082F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 31, 38, -0.002F, -0.123F, 0.1577F, 4, 2, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -30.2F, -8.95F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 19, 11, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun80_r1 = new ModelRenderer(this);
		gun80_r1.setRotationPoint(-3.8F, -31.3F, -14.7F);
		gun.addChild(gun80_r1);
		setRotationAngle(gun80_r1, 0.0F, 0.0F, -0.2603F);
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 32, 22, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(-3.8F, -34.3F, -14.7F);
		gun.addChild(gun82_r1);
		setRotationAngle(gun82_r1, 0.0F, 0.7436F, 0.0F);
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 32, 18, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.7F, -33.5F, -4.7F);
		gun.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 37, 53, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.6F, -33.4F, -4.5F);
		gun.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -1.5708F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 69, 54, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone_r16 = new ModelRenderer(this);
		bone_r16.setRotationPoint(0.2F, -32.8F, -16.5F);
		gun.addChild(bone_r16);
		setRotationAngle(bone_r16, 0.0F, 0.0F, 0.7854F);
		bone_r16.cubeList.add(new ModelBox(bone_r16, 56, 69, -0.3636F, -0.3636F, -0.001F, 1, 1, 2, 0.0F, false));
		bone_r16.cubeList.add(new ModelBox(bone_r16, 62, 69, -1.0F, -1.0F, -0.001F, 1, 1, 2, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-0.15F, -36.2F, -12.8F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -1.2641F);
		gun132.cubeList.add(new ModelBox(gun132, 22, 39, -0.7277F, 0.2207F, -0.15F, 2, 1, 1, -0.2F, false));
		gun132.cubeList.add(new ModelBox(gun132, 35, 0, -0.727F, 0.22F, 0.25F, 2, 1, 1, -0.2F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -33.5F, 1.5F);
		gun.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 16, 68, 0.001F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 0, 68, 0.599F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 0, 49, 0.299F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		gun.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		gun60.cubeList.add(new ModelBox(gun60, 50, 27, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 50, 21, -3.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
//		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
