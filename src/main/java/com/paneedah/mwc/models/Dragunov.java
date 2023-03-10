package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Dragunov extends ModelWithAttachments {
	private final QRenderer gun;
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
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;

	public Dragunov() {
		textureWidth = 350;
		textureHeight = 350;

		gun = new QRenderer(this);
		gun.setRotationPoint(0.0F, -11.0F, 3.0F);
		gun.cubeList.add(new ModelBox(gun, 44, 117, -3.5F, 3.9F, -25.0F, 4, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 72, -3.0F, 5.15F, -18.0F, 3, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 10, -3.0F, 4.65F, -10.0F, 3, 4, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 136, -3.7F, 0.0F, -11.0F, 1, 4, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 72, -3.7F, 4.0F, -11.0F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -3.7F, -0.75F, -46.0F, 1, 1, 46, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 137, 20, -3.7F, 0.0F, -27.0F, 1, 4, 16, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 87, 14, -3.85F, 1.0F, -14.1F, 1, 2, 1, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 91, 76, -3.7F, 0.0F, -28.0F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 0, -3.7F, 0.0F, -46.0F, 1, 2, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 113, 19, -3.0F, 2.0F, -46.0F, 3, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 181, 186, -3.5F, 0.0F, -38.0F, 4, 2, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 178, -3.7F, 2.0F, -38.0F, 1, 1, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 91, 54, -3.7F, 4.0F, -26.7F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 121, 99, -3.1F, 4.9F, -26.7F, 3, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 137, 0, -0.3F, 0.0F, -27.0F, 1, 4, 16, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 58, -0.2F, 0.6F, -15.1F, 1, 2, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 117, 0.2F, 0.0F, -14.9F, 1, 1, 4, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 68, 0.2F, 0.6F, -11.9F, 1, 2, 1, -0.198F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 65, 0.2F, 0.0F, -15.3F, 1, 1, 1, -0.198F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 44, 0.2F, 1.8F, -15.3F, 1, 1, 1, -0.198F, false));
		gun.cubeList.add(new ModelBox(gun, 66, 117, 0.2F, 1.8F, -14.9F, 1, 1, 4, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 20, 0.2F, 0.0F, -19.4F, 1, 1, 2, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 23, 0.2F, 1.8F, -19.4F, 1, 1, 2, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 30, 102, 0.2F, 0.0F, -24.4F, 1, 1, 5, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 121, 52, 0.2F, 1.8F, -24.4F, 1, 1, 5, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 113, 0.2F, 0.0F, -28.8F, 1, 1, 4, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 115, 82, 0.2F, 1.8F, -28.8F, 1, 1, 4, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 66, 117, -0.2F, 0.4F, -28.6F, 1, 2, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 135, -0.3F, 0.0F, -11.0F, 1, 4, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 93, 28, -0.3F, 0.0F, -34.0F, 1, 2, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 68, 56, -0.3F, 1.0F, -46.0F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 87, -0.3F, 0.0F, -40.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 111, -0.3F, 2.0F, -38.0F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 179, 85, -0.3F, -0.75F, -40.0F, 1, 1, 40, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 143, -0.3F, -1.75F, -46.0F, 1, 1, 6, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 143, -0.3F, -0.95F, -46.0F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 88, 142, -0.55F, 0.05F, -46.0F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 39, -3.3F, 4.0F, -11.0F, 4, 1, 3, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 87, -0.3F, 4.0F, -26.7F, 1, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.3F, 5.0F, -24.7F);
		gun.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7679F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 91, 73, 0.0F, -2.0F, -1.0F, 1, 2, 1, -0.001F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 91, 82, -3.4F, -2.0F, -1.0F, 1, 2, 1, -0.001F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.3F, 5.0F, -11.0F);
		gun.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.6283F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 76, 87, 0.0F, -1.0F, -2.0F, 1, 1, 2, -0.001F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 91, 47, -3.4F, -1.0F, -2.0F, 1, 1, 2, -0.001F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.7F, 1.0F, -40.0F);
		gun.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.6458F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 137, -1.0F, -1.0F, -6.0F, 1, 1, 6, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.7F, 0.05F, -40.0F);
		gun.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.6458F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 138, 139, -1.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.3F, 3.0F, -38.0F);
		gun.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 72, 0.0F, -1.0F, -3.0F, 1, 1, 3, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 80, -3.4F, -1.0F, -3.0F, 1, 1, 3, -0.001F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.3F, 5.0F, -26.7F);
		gun.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.8552F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 31, -3.0F, -2.0F, -4.0F, 4, 2, 4, -0.003F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 68, -3.4F, -2.0F, -3.0F, 1, 2, 3, -0.002F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.7F, 0.0F, -40.0F);
		gun.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.2618F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 92, 93, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.15F, 6.0F, -24.9F);
		gun.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 93, -0.8F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 93, -3.1F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.4F, 7.9F, -25.6F);
		gun.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.4712F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 84, 0, -0.2F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.9F, 3.9F, -24.7F);
		gun.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.2967F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 86, 28, 0.0F, 0.0F, -1.0F, 1, 1, 1, -0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.7F, 0.0F, -28.0F);
		gun.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, -0.2094F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 59, 20, 0.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.7F, 0.0F, -34.0F);
		gun.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.2094F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 47, -1.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.7F, 0.0F, -38.0F);
		gun.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -0.2094F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 37, 47, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.7F, 0.0F, -38.0F);
		gun.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.2094F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 71, 9, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.7F, 2.0F, -46.0F);
		gun.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.6109F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 58, -1.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 10, -1.0F, 0.2F, 0.0F, 1, 1, 8, -0.001F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.7F, 2.0F, -46.0F);
		gun.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.6109F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 68, 0.0F, 0.2F, 0.0F, 1, 1, 8, -0.001F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 68, 47, 0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-4.2F, 0.2F, -18.1F);
		gun.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.192F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 46, 57, -0.05F, 0.0F, -8.0F, 1, 2, 8, -0.3F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 68, 0.35F, 0.0F, -8.0F, 1, 2, 8, -0.001F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-3.95F, 2.9F, -13.6F);
		gun.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.0349F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 113, 99, 0.0F, -1.0F, -6.0F, 1, 1, 6, 0.001F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-3.85F, 3.4F, -13.4F);
		gun.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.0349F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 93, 9, 0.0F, -2.0F, -7.0F, 1, 2, 7, 0.001F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-4.25F, 1.4F, -13.0F);
		gun.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.3142F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 14, 47, 0.0F, 0.0F, -2.0F, 1, 2, 2, -0.2F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-3.95F, 0.9F, -13.7F);
		gun.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.1222F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 44, 117, 0.0F, 0.0F, -6.0F, 1, 1, 6, -0.001F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-3.85F, 1.4F, -3.5F);
		gun.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.1047F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 44, 104, 0.0F, 0.0F, -7.0F, 1, 1, 7, 0.001F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-3.85F, 0.6F, -3.5F);
		gun.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.0349F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 68, 47, 0.0F, -0.3F, -7.0F, 1, 1, 3, -0.001F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 92, 111, 0.0F, 0.0F, -7.0F, 1, 1, 7, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-0.05F, 2.2F, -15.2F);
		gun.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.3665F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 32, 70, -0.15F, 0.5F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-0.15F, 0.8F, -3.5F);
		gun.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.3665F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 4, 73, -0.15F, 0.5F, -1.0F, 1, 1, 1, 0.1F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-3.85F, 0.6F, -3.5F);
		gun.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.3665F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 87, 17, -0.2F, 0.5F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-3.85F, 0.6F, -13.5F);
		gun.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.1222F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 113, 0.0F, 0.0F, -7.0F, 1, 1, 7, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-1.0F, 10.65F, -11.2F);
		gun.addChild(cube_r28);
		setRotationAngle(cube_r28, 2.3038F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 68, 56, -2.0F, 0.0F, 0.0F, 3, 3, 1, -0.001F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-1.0F, 10.55F, -16.2F);
		gun.addChild(cube_r29);
		setRotationAngle(cube_r29, 1.5533F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 38, 0, -2.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-1.0F, 8.15F, -18.0F);
		gun.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.6283F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 68, 60, -2.0F, 0.0F, 0.0F, 3, 3, 1, -0.001F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-1.0F, 4.75F, -17.3F);
		gun.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.0873F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 91, 82, -2.0F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, 6.45F, -12.7F);
		gun.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.3491F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 63, 0, -2.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, 4.55F, -14.0F);
		gun.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.4538F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 10, 58, -2.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));
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
