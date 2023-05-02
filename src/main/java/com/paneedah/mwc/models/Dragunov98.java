package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Dragunov98 extends ModelBase {
	private final QRenderer dustcover;
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
	private final ModelRenderer rail2;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;

	public Dragunov98() {
		textureWidth = 370;
		textureHeight = 370;

		dustcover = new QRenderer(this);
		dustcover.setRotationPoint(0.0F, -15.0F, 0.0F);
		dustcover.cubeList.add(new ModelBox(dustcover, 179, 220, -2.5F, -1.0F, -43.0F, 2, 1, 43, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 75, 7, -0.1F, 2.8F, -2.0F, 1, 1, 5, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 53, 71, -1.1F, 2.8F, 0.0F, 2, 1, 3, 0.1F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 13, 18, -3.9F, 2.8F, 0.0F, 3, 1, 3, 0.101F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 121, 129, -3.9F, 2.8F, -15.0F, 4, 1, 18, 0.001F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 54, 20, -0.1F, 1.8F, -0.5F, 1, 1, 3, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 227, 101, -0.1F, 1.8F, -43.0F, 1, 2, 41, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 0, 27, 0.8F, 3.6F, -27.0F, 1, 1, 11, 0.002F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 0, 11, 0.8F, 5.6F, -27.0F, 1, 1, 11, 0.002F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 79, 40, 0.8F, 4.6F, -18.0F, 1, 1, 2, 0.002F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 46, 71, 0.8F, 4.6F, -27.0F, 1, 1, 5, 0.002F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 130, 65, -3.9F, 1.8F, -15.5F, 1, 1, 18, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 22, 0, -3.9F, 1.8F, -43.0F, 1, 2, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 0, 39, -4.1F, 1.6F, -25.2F, 1, 1, 11, -0.201F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.15F, -0.5F, 1.0F);
		dustcover.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.0472F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 67, -2.35F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.8F, 1.8F, 2.5F);
		dustcover.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.4538F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 88, 31, -0.1F, 0.1F, -1.0F, 1, 1, 1, -0.002F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 88, 29, -0.1F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 49, 0.7F, 0.1F, -1.0F, 4, 1, 1, -0.003F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 60, 0.7F, 0.0F, -1.0F, 4, 1, 1, 0.001F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 1.8F, 2.5F);
		dustcover.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.9076F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 71, -3.0F, 0.0F, -1.0F, 3, 1, 1, -0.001F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.9F, 1.8F, 1.75F);
		dustcover.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -1.0123F, -1.117F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 79, 47, -0.6F, 0.0F, -2.9F, 1, 1, 2, -0.002F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.9F, 1.8F, 1.75F);
		dustcover.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -1.117F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 79, 43, 0.0F, 0.0F, -2.0F, 1, 1, 2, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 70, 0.0F, 0.0F, -2.25F, 3, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 128, 2.0F, 0.0F, -43.75F, 1, 1, 18, 0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 67, 61, 0.0F, 0.0F, -44.75F, 3, 1, 1, 0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 67, 28, 0.0F, 0.0F, -26.75F, 3, 1, 25, 0.001F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.9F, 1.8F, 1.75F);
		dustcover.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 1.0123F, 1.117F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 79, 55, -0.4F, 0.0F, -2.9F, 1, 1, 2, -0.002F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.9F, 1.8F, 1.75F);
		dustcover.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 1.117F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 79, 59, -1.0F, 0.0F, -2.0F, 1, 1, 2, -0.001F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 54, 64, -3.0F, 0.0F, -4.25F, 2, 1, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 71, -3.0F, 0.0F, -2.25F, 3, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 56, 0.0F, 0.0F, -28.75F, 2, 1, 5, 0.001F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 64, 0.0F, 0.0F, -19.75F, 2, 1, 2, 0.001F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 226, 220, -3.0F, 0.0F, -44.75F, 3, 1, 41, 0.001F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-3.9F, 1.8F, -42.0F);
		dustcover.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.2269F, -1.117F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 32, 1.0F, 0.0F, 0.0F, 1, 1, 4, -0.001F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.9F, 1.8F, -42.0F);
		dustcover.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.2967F, -1.117F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 43, 45, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.65F, 3.3F, -18.8F);
		dustcover.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -0.576F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 27, -1.0F, 0.0F, 0.0F, 1, 3, 1, 0.002F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.65F, 3.3F, -20.2F);
		dustcover.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, -0.576F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 6, 27, -1.0F, 0.0F, 0.0F, 1, 3, 1, 0.002F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.65F, 3.3F, -21.6F);
		dustcover.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, -0.576F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 27, -1.0F, 0.0F, 0.0F, 1, 3, 1, 0.002F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.9F, 4.5F, -25.8F);
		dustcover.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.3491F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 87, 83, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.002F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.9F, 2.8F, -0.95F);
		dustcover.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.7854F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 88, 14, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.9F, 2.8F, -1.55F);
		dustcover.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.7854F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 15, 88, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.7F, 2.8F, -0.5F);
		dustcover.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 1.1519F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 67, -2.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(1.1F, 2.8F, 2.1F);
		dustcover.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.5061F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 87, 87, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.5F, -1.0F, 0.0F);
		dustcover.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.4712F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 65, 83, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		rail2 = new ModelRenderer(this);
		rail2.setRotationPoint(-0.7F, -2.0F, -59.0F);
		dustcover.addChild(rail2);
		setRotationAngle(rail2, 0.0F, 0.0F, -3.1416F);
		rail2.cubeList.add(new ModelBox(rail2, 81, 19, -0.2F, -1.2F, 22.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 12, 81, -0.2F, -1.2F, 23.3F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 6, 81, -0.2F, -1.2F, 24.55F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 0, 81, -0.2F, -1.2F, 25.8F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 17, 80, -0.2F, -1.2F, 28.3F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 77, 79, -0.2F, -1.2F, 27.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 79, 75, -0.2F, -1.2F, 30.8F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 78, 68, -0.2F, -1.2F, 29.55F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 34, 78, -0.2F, -1.2F, 33.3F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 28, 78, -0.2F, -1.2F, 32.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 7, 78, -0.2F, -1.2F, 35.8F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 16, 60, -0.2F, -1.2F, 34.55F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 13, 34, -0.2F, -1.2F, 38.3F, 2, 1, 3, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 56, 39, -0.2F, -1.2F, 37.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 56, 32, -0.2F, -1.2F, 17.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 20, 51, -0.2F, -1.2F, 18.3F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 28, 40, -0.2F, -1.2F, 19.55F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 20, 30, -0.2F, -1.2F, 20.8F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 30, 13, -0.2F, -1.2F, 15.8F, 2, 1, 1, -0.2F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 0.6F, 6.0F);
		rail2.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.9425F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 22, 5, 0.609F, -1.3878F, 9.8F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 30, 0, 0.609F, -1.3878F, 14.8F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 32, 0.609F, -1.3878F, 13.55F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 34, 0.609F, -1.3878F, 12.3F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 38, 31, 0.609F, -1.3878F, 11.05F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 34, 27, 0.609F, -1.3878F, 32.3F, 1, 1, 3, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 38, 35, 0.609F, -1.3878F, 31.05F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 22, 39, 0.609F, -1.3878F, 29.8F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 39, 27, 0.609F, -1.3878F, 28.55F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 40, 8, 0.609F, -1.3878F, 27.3F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 40, 24, 0.609F, -1.3878F, 26.05F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 6, 41, 0.609F, -1.3878F, 24.8F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 44, 0.609F, -1.3878F, 23.55F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 6, 46, 0.609F, -1.3878F, 22.3F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 47, 0, 0.609F, -1.3878F, 21.05F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 47, 36, 0.609F, -1.3878F, 19.8F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 52, 44, 0.609F, -1.3878F, 18.55F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 56, 0.609F, -1.3878F, 17.3F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 58, 0.609F, -1.3878F, 16.05F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 65, 93, 0.709F, -1.4878F, 10.3F, 1, 1, 24, -0.3F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.6F, 0.6F, 6.0F);
		rail2.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.9425F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 18, -1.609F, -1.3878F, 9.8F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 8, 23, -1.609F, -1.3878F, 14.8F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 30, 2, -1.609F, -1.3878F, 13.55F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 6, 32, -1.609F, -1.3878F, 12.3F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 6, 34, -1.609F, -1.3878F, 11.05F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 17, 5, -1.609F, -1.3878F, 32.3F, 1, 1, 3, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 38, 33, -1.609F, -1.3878F, 31.05F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 39, -1.609F, -1.3878F, 29.8F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 6, 39, -1.609F, -1.3878F, 28.55F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 4, -1.609F, -1.3878F, 27.3F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 6, -1.609F, -1.3878F, 26.05F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 41, -1.609F, -1.3878F, 24.8F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 41, 0, -1.609F, -1.3878F, 23.55F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 6, 44, -1.609F, -1.3878F, 22.3F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 46, -1.609F, -1.3878F, 21.05F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 47, 2, -1.609F, -1.3878F, 19.8F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 47, 38, -1.609F, -1.3878F, 18.55F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 52, 46, -1.609F, -1.3878F, 17.3F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 38, 56, -1.609F, -1.3878F, 16.05F, 1, 1, 1, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 93, -1.709F, -1.4878F, 10.3F, 1, 1, 24, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		dustcover.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
