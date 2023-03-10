package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M4CarbineHandGuard extends ModelBase {
	private final ModelRenderer handguard_carbine;
	private final ModelRenderer handguard244_r1;
	private final ModelRenderer handguard243_r1;
	private final ModelRenderer handguard243_r2;
	private final ModelRenderer handguard242_r1;
	private final ModelRenderer handguard243_r3;
	private final ModelRenderer handguard242_r2;
	private final ModelRenderer handguard242_r3;
	private final ModelRenderer handguard241_r1;
	private final ModelRenderer handguard202_r1;
	private final ModelRenderer handguard204_r1;
	private final ModelRenderer handguard203_r1;
	private final ModelRenderer handguard202_r2;
	private final ModelRenderer handguard203_r2;
	private final ModelRenderer handguard204_r2;
	private final ModelRenderer handguard202_r3;
	private final ModelRenderer handguard205_r1;
	private final ModelRenderer handguard200_r1;
	private final ModelRenderer handguard204_r3;
	private final ModelRenderer handguard203_r3;
	private final ModelRenderer handguard206_r1;
	private final ModelRenderer handguard205_r2;
	private final ModelRenderer handguard201_r1;
	private final ModelRenderer handguard199_r1;
	private final ModelRenderer handguard201_r2;
	private final ModelRenderer handguard200_r2;
	private final ModelRenderer handguard201_r3;
	private final ModelRenderer handguard203_r4;
	private final ModelRenderer handguard202_r4;

	public M4CarbineHandGuard() {
		textureWidth = 100;
		textureHeight = 100;

		handguard_carbine = new ModelRenderer(this);
		handguard_carbine.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguard_carbine.cubeList.add(new ModelBox(handguard_carbine, 25, 24, 0.1F, -38.5F, -46.0F, 1, 2, 21, 0.0F, false));
		handguard_carbine.cubeList.add(new ModelBox(handguard_carbine, 25, 1, -4.1F, -38.5F, -46.0F, 1, 2, 21, 0.0F, false));
		handguard_carbine.cubeList.add(new ModelBox(handguard_carbine, 0, 22, -2.5F, -40.1F, -46.0F, 2, 1, 21, 0.0F, false));
		handguard_carbine.cubeList.add(new ModelBox(handguard_carbine, 0, 0, -2.5F, -35.9F, -46.0F, 2, 1, 21, 0.0F, false));

		handguard244_r1 = new ModelRenderer(this);
		handguard244_r1.setRotationPoint(-4.1F, -37.0F, -28.0F);
		handguard_carbine.addChild(handguard244_r1);
		setRotationAngle(handguard244_r1, 0.0F, 0.0F, -0.4363F);
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 4, 26, 0.011F, 0.58F, 1.997F, 1, 1, 1, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 15, 0, 0.01F, 0.58F, 0.499F, 1, 1, 2, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 29, 8, 0.01F, 0.58F, -2.002F, 1, 1, 1, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 29, 11, 0.01F, 0.58F, -7.002F, 1, 1, 1, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 29, 14, 0.01F, 0.58F, -12.002F, 1, 1, 1, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 29, 17, 0.01F, 0.58F, -4.502F, 1, 1, 1, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 29, 24, 0.01F, 0.58F, -9.502F, 1, 1, 1, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 29, 27, 0.01F, 0.58F, -14.502F, 1, 1, 1, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 15, 4, 0.01F, 0.58F, -18.002F, 1, 1, 2, 0.0F, false));
		handguard244_r1.cubeList.add(new ModelBox(handguard244_r1, 0, 44, 0.009F, -0.2F, -18.001F, 1, 1, 21, 0.0F, false));

		handguard243_r1 = new ModelRenderer(this);
		handguard243_r1.setRotationPoint(1.1F, -37.0F, -28.0F);
		handguard_carbine.addChild(handguard243_r1);
		setRotationAngle(handguard243_r1, 0.0F, 0.0F, 0.4363F);
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 32, 25, -1.011F, 0.58F, 1.997F, 1, 1, 1, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 25, 14, -1.01F, 0.58F, 0.499F, 1, 1, 2, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 32, 28, -1.01F, 0.58F, -2.002F, 1, 1, 1, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 29, 32, -1.01F, 0.58F, -7.002F, 1, 1, 1, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 32, 31, -1.01F, 0.58F, -12.002F, 1, 1, 1, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 0, 33, -1.01F, 0.58F, -4.502F, 1, 1, 1, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 33, 1, -1.01F, 0.58F, -9.502F, 1, 1, 1, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 33, 3, -1.01F, 0.58F, -14.502F, 1, 1, 1, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 25, 17, -1.01F, 0.58F, -18.002F, 1, 1, 2, 0.0F, false));
		handguard243_r1.cubeList.add(new ModelBox(handguard243_r1, 48, 44, -1.009F, -0.2F, -18.001F, 1, 1, 21, 0.0F, false));

		handguard243_r2 = new ModelRenderer(this);
		handguard243_r2.setRotationPoint(-4.1F, -38.0F, -28.0F);
		handguard_carbine.addChild(handguard243_r2);
		setRotationAngle(handguard243_r2, 0.0F, 0.0F, 0.4363F);
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 0, 29, 0.011F, -1.58F, 1.997F, 1, 1, 1, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 5, 22, 0.01F, -1.58F, 0.499F, 1, 1, 2, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 4, 31, 0.01F, -1.58F, -2.002F, 1, 1, 1, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 32, 9, 0.01F, -1.58F, -7.002F, 1, 1, 1, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 32, 12, 0.01F, -1.58F, -12.002F, 1, 1, 1, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 29, 30, 0.01F, -1.58F, -4.502F, 1, 1, 1, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 7, 32, 0.01F, -1.58F, -9.502F, 1, 1, 1, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 17, 32, 0.01F, -1.58F, -14.502F, 1, 1, 1, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 25, 11, 0.01F, -1.58F, -18.002F, 1, 1, 2, 0.0F, false));
		handguard243_r2.cubeList.add(new ModelBox(handguard243_r2, 48, 0, 0.009F, -0.8F, -18.001F, 1, 1, 21, 0.0F, false));

		handguard242_r1 = new ModelRenderer(this);
		handguard242_r1.setRotationPoint(1.1F, -38.0F, -28.0F);
		handguard_carbine.addChild(handguard242_r1);
		setRotationAngle(handguard242_r1, 0.0F, 0.0F, -0.4363F);
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 17, 34, -1.011F, -1.58F, 1.997F, 1, 1, 1, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 10, 27, -1.01F, -1.58F, 0.499F, 1, 1, 2, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 0, 35, -1.01F, -1.58F, -2.002F, 1, 1, 1, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 35, 13, -1.01F, -1.58F, -7.002F, 1, 1, 1, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 35, 24, -1.01F, -1.58F, -12.002F, 1, 1, 1, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 25, 34, -1.01F, -1.58F, -4.502F, 1, 1, 1, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 35, 8, -1.01F, -1.58F, -9.502F, 1, 1, 1, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 35, 29, -1.01F, -1.58F, -14.502F, 1, 1, 1, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 14, 28, -1.01F, -1.58F, -18.002F, 1, 1, 2, 0.0F, false));
		handguard242_r1.cubeList.add(new ModelBox(handguard242_r1, 46, 66, -1.009F, -0.8F, -18.001F, 1, 1, 21, 0.0F, false));

		handguard243_r3 = new ModelRenderer(this);
		handguard243_r3.setRotationPoint(-2.0F, -34.9F, -28.0F);
		handguard_carbine.addChild(handguard243_r3);
		setRotationAngle(handguard243_r3, 0.0F, 0.0F, 0.4363F);
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 17, 19, -1.58F, -1.011F, 1.998F, 1, 1, 1, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 15, 8, -1.58F, -1.01F, 0.5F, 1, 1, 2, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 30, 0, -1.58F, -1.01F, -2.001F, 1, 1, 1, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 30, 4, -1.58F, -1.01F, -7.001F, 1, 1, 1, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 7, 30, -1.58F, -1.01F, -12.001F, 1, 1, 1, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 11, 30, -1.58F, -1.01F, -4.501F, 1, 1, 1, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 30, 19, -1.58F, -1.01F, -9.501F, 1, 1, 1, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 25, 30, -1.58F, -1.01F, -14.501F, 1, 1, 1, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 15, 12, -1.58F, -1.01F, -18.0F, 1, 1, 2, 0.0F, false));
		handguard243_r3.cubeList.add(new ModelBox(handguard243_r3, 23, 47, -0.8F, -1.009F, -18.001F, 1, 1, 21, 0.0F, false));

		handguard242_r2 = new ModelRenderer(this);
		handguard242_r2.setRotationPoint(-1.0F, -34.9F, -28.0F);
		handguard_carbine.addChild(handguard242_r2);
		setRotationAngle(handguard242_r2, 0.0F, 0.0F, -0.4363F);
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 4, 33, 0.58F, -1.011F, 1.998F, 1, 1, 1, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 25, 24, 0.58F, -1.01F, 0.5F, 1, 1, 2, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 33, 5, 0.58F, -1.01F, -2.001F, 1, 1, 1, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 14, 33, 0.58F, -1.01F, -7.001F, 1, 1, 1, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 33, 17, 0.58F, -1.01F, -12.001F, 1, 1, 1, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 32, 33, 0.58F, -1.01F, -4.501F, 1, 1, 1, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 7, 34, 0.58F, -1.01F, -9.501F, 1, 1, 1, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 11, 34, 0.58F, -1.01F, -14.501F, 1, 1, 1, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 0, 26, 0.58F, -1.01F, -18.0F, 1, 1, 2, 0.0F, false));
		handguard242_r2.cubeList.add(new ModelBox(handguard242_r2, 0, 66, -0.2F, -1.009F, -18.001F, 1, 1, 21, 0.0F, false));

		handguard242_r3 = new ModelRenderer(this);
		handguard242_r3.setRotationPoint(-2.0F, -40.1F, -28.0F);
		handguard_carbine.addChild(handguard242_r3);
		setRotationAngle(handguard242_r3, 0.0F, 0.0F, -0.4363F);
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 4, 29, -1.58F, 0.011F, 1.998F, 1, 1, 1, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 25, 8, -1.58F, 0.01F, 0.5F, 1, 1, 2, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 14, 31, -1.58F, 0.01F, -2.001F, 1, 1, 1, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 11, 32, -1.58F, 0.01F, -7.001F, 1, 1, 1, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 32, 15, -1.58F, 0.01F, -12.001F, 1, 1, 1, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 0, 31, -1.58F, 0.01F, -4.501F, 1, 1, 1, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 32, 7, -1.58F, 0.01F, -9.501F, 1, 1, 1, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 25, 32, -1.58F, 0.01F, -14.501F, 1, 1, 1, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 15, 16, -1.58F, 0.01F, -18.0F, 1, 1, 2, 0.0F, false));
		handguard242_r3.cubeList.add(new ModelBox(handguard242_r3, 48, 22, -0.8F, 0.009F, -18.001F, 1, 1, 21, 0.0F, false));

		handguard241_r1 = new ModelRenderer(this);
		handguard241_r1.setRotationPoint(-1.0F, -40.1F, -28.0F);
		handguard_carbine.addChild(handguard241_r1);
		setRotationAngle(handguard241_r1, 0.0F, 0.0F, 0.4363F);
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 34, 19, 0.58F, 0.011F, 1.998F, 1, 1, 1, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 25, 27, 0.58F, 0.01F, 0.5F, 1, 1, 2, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 4, 35, 0.58F, 0.01F, -2.001F, 1, 1, 1, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 14, 35, 0.58F, 0.01F, -7.001F, 1, 1, 1, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 35, 26, 0.58F, 0.01F, -12.001F, 1, 1, 1, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 29, 34, 0.58F, 0.01F, -4.501F, 1, 1, 1, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 35, 10, 0.58F, 0.01F, -9.501F, 1, 1, 1, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 32, 35, 0.58F, 0.01F, -14.501F, 1, 1, 1, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 6, 26, 0.58F, 0.01F, -18.0F, 1, 1, 2, 0.0F, false));
		handguard241_r1.cubeList.add(new ModelBox(handguard241_r1, 23, 69, -0.2F, 0.009F, -18.001F, 1, 1, 21, 0.0F, false));

		handguard202_r1 = new ModelRenderer(this);
		handguard202_r1.setRotationPoint(-2.0F, -39.6F, -26.0F);
		handguard_carbine.addChild(handguard202_r1);
		setRotationAngle(handguard202_r1, 0.0925F, -0.0349F, -0.4538F);
		handguard202_r1.cubeList.add(new ModelBox(handguard202_r1, 10, 16, -1.2F, 0.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard204_r1 = new ModelRenderer(this);
		handguard204_r1.setRotationPoint(-3.6F, -38.0F, -26.0F);
		handguard_carbine.addChild(handguard204_r1);
		setRotationAngle(handguard204_r1, 0.0349F, -0.096F, 0.4538F);
		handguard204_r1.cubeList.add(new ModelBox(handguard204_r1, 5, 1, -0.001F, -1.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r1 = new ModelRenderer(this);
		handguard203_r1.setRotationPoint(-3.6F, -38.0F, -26.0F);
		handguard_carbine.addChild(handguard203_r1);
		setRotationAngle(handguard203_r1, -0.0436F, -0.096F, 0.4538F);
		handguard203_r1.cubeList.add(new ModelBox(handguard203_r1, 10, 0, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard202_r2 = new ModelRenderer(this);
		handguard202_r2.setRotationPoint(-3.6F, -37.0F, -26.0F);
		handguard_carbine.addChild(handguard202_r2);
		setRotationAngle(handguard202_r2, 0.0F, -0.1047F, 0.0F);
		handguard202_r2.cubeList.add(new ModelBox(handguard202_r2, 10, 8, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard203_r2 = new ModelRenderer(this);
		handguard203_r2.setRotationPoint(-2.0F, -35.4F, -26.0F);
		handguard_carbine.addChild(handguard203_r2);
		setRotationAngle(handguard203_r2, -0.0925F, -0.0349F, 0.4538F);
		handguard203_r2.cubeList.add(new ModelBox(handguard203_r2, 0, 16, -1.2F, -1.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard204_r2 = new ModelRenderer(this);
		handguard204_r2.setRotationPoint(-3.6F, -37.0F, -26.0F);
		handguard_carbine.addChild(handguard204_r2);
		setRotationAngle(handguard204_r2, 0.0436F, -0.096F, -0.4538F);
		handguard204_r2.cubeList.add(new ModelBox(handguard204_r2, 5, 9, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard202_r3 = new ModelRenderer(this);
		handguard202_r3.setRotationPoint(-2.0F, -35.4F, -26.0F);
		handguard_carbine.addChild(handguard202_r3);
		setRotationAngle(handguard202_r3, -0.0925F, 0.0524F, 0.4538F);
		handguard202_r3.cubeList.add(new ModelBox(handguard202_r3, 8, 22, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard205_r1 = new ModelRenderer(this);
		handguard205_r1.setRotationPoint(-3.6F, -37.0F, -26.0F);
		handguard_carbine.addChild(handguard205_r1);
		setRotationAngle(handguard205_r1, -0.0349F, -0.096F, -0.4538F);
		handguard205_r1.cubeList.add(new ModelBox(handguard205_r1, 0, 4, -0.001F, 0.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard200_r1 = new ModelRenderer(this);
		handguard200_r1.setRotationPoint(-2.0F, -35.4F, -26.0F);
		handguard_carbine.addChild(handguard200_r1);
		setRotationAngle(handguard200_r1, -0.1047F, 0.0F, 0.0F);
		handguard200_r1.cubeList.add(new ModelBox(handguard200_r1, 10, 12, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard204_r3 = new ModelRenderer(this);
		handguard204_r3.setRotationPoint(-1.0F, -35.4F, -26.0F);
		handguard_carbine.addChild(handguard204_r3);
		setRotationAngle(handguard204_r3, -0.0925F, 0.0349F, -0.4538F);
		handguard204_r3.cubeList.add(new ModelBox(handguard204_r3, 5, 13, 0.2F, -1.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r3 = new ModelRenderer(this);
		handguard203_r3.setRotationPoint(-1.0F, -35.4F, -26.0F);
		handguard_carbine.addChild(handguard203_r3);
		setRotationAngle(handguard203_r3, -0.0925F, -0.0524F, -0.4538F);
		handguard203_r3.cubeList.add(new ModelBox(handguard203_r3, 0, 22, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard206_r1 = new ModelRenderer(this);
		handguard206_r1.setRotationPoint(0.6F, -37.0F, -26.0F);
		handguard_carbine.addChild(handguard206_r1);
		setRotationAngle(handguard206_r1, -0.0349F, 0.096F, 0.4538F);
		handguard206_r1.cubeList.add(new ModelBox(handguard206_r1, 0, 0, -0.999F, 0.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard205_r2 = new ModelRenderer(this);
		handguard205_r2.setRotationPoint(0.6F, -37.0F, -26.0F);
		handguard_carbine.addChild(handguard205_r2);
		setRotationAngle(handguard205_r2, 0.0436F, 0.096F, 0.4538F);
		handguard205_r2.cubeList.add(new ModelBox(handguard205_r2, 0, 8, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard201_r1 = new ModelRenderer(this);
		handguard201_r1.setRotationPoint(0.6F, -37.0F, -26.0F);
		handguard_carbine.addChild(handguard201_r1);
		setRotationAngle(handguard201_r1, 0.0F, 0.1047F, 0.0F);
		handguard201_r1.cubeList.add(new ModelBox(handguard201_r1, 0, 12, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard199_r1 = new ModelRenderer(this);
		handguard199_r1.setRotationPoint(-2.0F, -39.6F, -26.0F);
		handguard_carbine.addChild(handguard199_r1);
		setRotationAngle(handguard199_r1, 0.1047F, 0.0F, 0.0F);
		handguard199_r1.cubeList.add(new ModelBox(handguard199_r1, 25, 4, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard201_r2 = new ModelRenderer(this);
		handguard201_r2.setRotationPoint(-2.0F, -39.6F, -26.0F);
		handguard_carbine.addChild(handguard201_r2);
		setRotationAngle(handguard201_r2, 0.0925F, 0.0524F, -0.4538F);
		handguard201_r2.cubeList.add(new ModelBox(handguard201_r2, 13, 23, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard200_r2 = new ModelRenderer(this);
		handguard200_r2.setRotationPoint(-1.0F, -39.6F, -26.0F);
		handguard_carbine.addChild(handguard200_r2);
		setRotationAngle(handguard200_r2, 0.0925F, -0.0524F, 0.4538F);
		handguard200_r2.cubeList.add(new ModelBox(handguard200_r2, 25, 0, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		handguard201_r3 = new ModelRenderer(this);
		handguard201_r3.setRotationPoint(-1.0F, -39.6F, -26.0F);
		handguard_carbine.addChild(handguard201_r3);
		setRotationAngle(handguard201_r3, 0.0925F, 0.0349F, 0.4538F);
		handguard201_r3.cubeList.add(new ModelBox(handguard201_r3, 5, 17, 0.2F, 0.0F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard203_r4 = new ModelRenderer(this);
		handguard203_r4.setRotationPoint(0.6F, -38.0F, -26.0F);
		handguard_carbine.addChild(handguard203_r4);
		setRotationAngle(handguard203_r4, 0.0349F, 0.096F, -0.4538F);
		handguard203_r4.cubeList.add(new ModelBox(handguard203_r4, 5, 5, -0.999F, -1.2F, 0.05F, 1, 1, 3, 0.0F, false));

		handguard202_r4 = new ModelRenderer(this);
		handguard202_r4.setRotationPoint(0.6F, -38.0F, -26.0F);
		handguard_carbine.addChild(handguard202_r4);
		setRotationAngle(handguard202_r4, -0.0436F, 0.096F, -0.4538F);
		handguard202_r4.cubeList.add(new ModelBox(handguard202_r4, 10, 4, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard_carbine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
