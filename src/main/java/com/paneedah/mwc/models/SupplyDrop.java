package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SupplyDrop extends ModelBase {
	private final ModelRenderer belts;
	private final ModelRenderer Belt79_r1;
	private final ModelRenderer Belt74_r1;
	private final ModelRenderer Belt65_r1;
	private final ModelRenderer Belt55_r1;
	private final ModelRenderer Belt54_r1;
	private final ModelRenderer Belt43_r1;
	private final ModelRenderer Belt14_r1;
	private final ModelRenderer CardboardBox;
	private final ModelRenderer shape;
	private final ModelRenderer lock;

	public SupplyDrop() {
		textureWidth = 512;
		textureHeight = 512;

		belts = new ModelRenderer(this);
		belts.setRotationPoint(3.6675F, 26.3984F, 0.0F);
		belts.cubeList.add(new ModelBox(belts, 200, 300, -7.6675F, -43.3984F, -20.0F, 2, 1, 68, 0.0F, true));
		belts.cubeList.add(new ModelBox(belts, 200, 300, 6.3325F, -43.3984F, -20.0F, 2, 1, 68, 0.0F, true));
		belts.cubeList.add(new ModelBox(belts, 200, 300, 20.3325F, -43.3984F, -20.0F, 2, 1, 68, 0.0F, true));
		belts.cubeList.add(new ModelBox(belts, 200, 300, -18.6675F, -43.3984F, -8.0F, 45, 1, 2, 0.0F, true));
		belts.cubeList.add(new ModelBox(belts, 200, 300, -18.6675F, -43.3984F, 6.0F, 45, 1, 2, 0.0F, true));
		belts.cubeList.add(new ModelBox(belts, 200, 300, -18.6675F, -43.3984F, 20.0F, 45, 1, 2, 0.0F, true));
		belts.cubeList.add(new ModelBox(belts, 200, 300, -18.6675F, -43.3984F, 34.0F, 45, 1, 2, 0.0F, true));
		belts.cubeList.add(new ModelBox(belts, 200, 300, -18.6675F, -43.3984F, -1.5F, 45, 1, 2, 0.0F, true));
		belts.cubeList.add(new ModelBox(belts, 200, 300, -18.6675F, -43.3984F, 13.0F, 45, 1, 2, 0.0F, true));
		belts.cubeList.add(new ModelBox(belts, 200, 300, -18.6675F, -43.3984F, 27.0F, 45, 1, 2, 0.0F, true));
		belts.cubeList.add(new ModelBox(belts, 200, 300, -18.6675F, -43.3984F, 40.0F, 45, 1, 2, 0.0F, true));
		belts.cubeList.add(new ModelBox(belts, 200, 300, -18.6675F, -43.3984F, -14.0F, 45, 1, 2, 0.0F, true));
		belts.cubeList.add(new ModelBox(belts, 200, 300, -13.6675F, -43.3984F, -20.0F, 2, 1, 68, 0.0F, true));
		belts.cubeList.add(new ModelBox(belts, 200, 300, -0.6675F, -43.3984F, -20.0F, 2, 1, 68, 0.0F, true));
		belts.cubeList.add(new ModelBox(belts, 200, 300, 13.3325F, -43.3984F, -20.0F, 2, 1, 68, 0.0F, true));

		Belt79_r1 = new ModelRenderer(this);
		Belt79_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		belts.addChild(Belt79_r1);
		setRotationAngle(Belt79_r1, 0.0F, 0.0F, -0.0873F);
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 400, 29.8F, -16.8F, 20.0F, 1, 6, 2, 0.0F, true));
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 400, 29.8F, -16.8F, 6.0F, 1, 6, 2, 0.0F, true));
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 400, 29.8F, -16.8F, 6.0F, 1, 6, 2, 0.0F, true));
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 400, 29.8F, -16.8F, -8.0F, 1, 6, 2, 0.0F, true));
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 29.3F, -40.8F, 40.0F, 1, 19, 2, 0.0F, true));
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 29.3F, -40.8F, 13.0F, 1, 19, 2, 0.0F, true));
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 29.3F, -40.8F, -14.0F, 1, 19, 2, 0.0F, true));
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 29.3F, -40.8F, -1.5F, 1, 19, 2, 0.0F, true));
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 29.3F, -14.8F, -21.0F, 1, 2, 71, 0.0F, true));
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 29.3F, -23.8F, -21.0F, 1, 2, 70, 0.0F, true));
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 29.3F, -28.8F, -21.0F, 1, 2, 70, 0.0F, true));
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 29.3F, -33.8F, -20.0F, 1, 2, 68, 0.0F, true));
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 29.3F, -38.8F, -20.0F, 1, 2, 68, 0.0F, true));
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 29.3F, -40.8F, 20.0F, 1, 37, 2, 0.0F, true));
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 29.3F, -40.8F, 6.0F, 1, 37, 2, 0.0F, true));
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 29.3F, -40.8F, -8.0F, 1, 37, 2, 0.0F, true));
		Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 400, 29.8F, -16.8F, 34.0F, 1, 6, 2, 0.0F, true));

		Belt74_r1 = new ModelRenderer(this);
		Belt74_r1.setRotationPoint(0.1569F, -0.0068F, 0.0F);
		belts.addChild(Belt74_r1);
		setRotationAngle(Belt74_r1, 0.0F, 0.0F, -0.0873F);
		Belt74_r1.cubeList.add(new ModelBox(Belt74_r1, 200, 300, 29.3F, -40.6F, 27.0F, 1, 19, 2, 0.0F, true));

		Belt65_r1 = new ModelRenderer(this);
		Belt65_r1.setRotationPoint(-3.6675F, 0.0316F, 2.2004F);
		belts.addChild(Belt65_r1);
		setRotationAngle(Belt65_r1, 0.0524F, 0.0F, 0.0F);
		Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 400, 24.0F, -16.8F, 48.0F, 2, 6, 1, 0.0F, true));
		Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 400, 10.0F, -16.8F, 48.0F, 2, 6, 1, 0.0F, true));
		Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 400, -4.0F, -16.8F, 48.0F, 2, 6, 1, 0.0F, true));
		Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, 17.0F, -40.8F, 47.5F, 2, 19, 1, 0.0F, true));
		Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, 3.0F, -40.8F, 47.5F, 2, 19, 1, 0.0F, true));
		Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, -10.0F, -40.8F, 47.5F, 2, 19, 1, 0.0F, true));
		Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, -17.0F, -14.8F, 47.5F, 49, 2, 1, 0.0F, true));
		Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, -16.0F, -23.8F, 47.5F, 48, 2, 1, 0.0F, true));
		Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, -16.0F, -28.8F, 47.5F, 47, 2, 1, 0.0F, true));
		Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, -15.0F, -33.8F, 47.5F, 46, 2, 1, 0.0F, true));
		Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, 24.0F, -40.8F, 47.5F, 2, 37, 1, 0.0F, true));
		Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, 10.0F, -40.8F, 47.5F, 2, 37, 1, 0.0F, true));
		Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, -4.0F, -40.8F, 47.5F, 2, 37, 1, 0.0F, true));

		Belt55_r1 = new ModelRenderer(this);
		Belt55_r1.setRotationPoint(-3.6675F, 0.0344F, 2.0957F);
		belts.addChild(Belt55_r1);
		setRotationAngle(Belt55_r1, 0.0524F, 0.0F, 0.0F);
		Belt55_r1.cubeList.add(new ModelBox(Belt55_r1, 200, 300, -15.0F, -38.8F, 47.5F, 45, 2, 1, 0.0F, true));

		Belt54_r1 = new ModelRenderer(this);
		Belt54_r1.setRotationPoint(-3.6675F, -1.3814F, -2.1634F);
		belts.addChild(Belt54_r1);
		setRotationAngle(Belt54_r1, -0.0524F, 0.0F, 0.0F);
		Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 400, 24.0F, -16.8F, -21.0F, 2, 6, 1, 0.0F, true));
		Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 400, 10.0F, -16.8F, -21.0F, 2, 6, 1, 0.0F, true));
		Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 400, -4.0F, -16.8F, -21.0F, 2, 6, 1, 0.0F, true));
		Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, 17.0F, -40.8F, -20.5F, 2, 19, 1, 0.0F, true));
		Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, 3.0F, -40.8F, -20.5F, 2, 19, 1, 0.0F, true));
		Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, -10.0F, -40.8F, -20.5F, 2, 19, 1, 0.0F, true));
		Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, -17.0F, -14.8F, -20.5F, 49, 2, 1, 0.0F, true));
		Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, -16.0F, -23.8F, -20.5F, 48, 2, 1, 0.0F, true));
		Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, -16.0F, -28.8F, -20.5F, 47, 2, 1, 0.0F, true));
		Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, -15.0F, -33.8F, -20.5F, 46, 2, 1, 0.0F, true));
		Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, -15.0F, -38.8F, -20.5F, 45, 2, 1, 0.0F, true));
		Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, 24.0F, -40.8F, -20.5F, 2, 37, 1, 0.0F, true));
		Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, 10.0F, -40.8F, -20.5F, 2, 37, 1, 0.0F, true));
		Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, -4.0F, -40.8F, -20.5F, 2, 37, 1, 0.0F, true));

		Belt43_r1 = new ModelRenderer(this);
		Belt43_r1.setRotationPoint(-7.2816F, -1.2202F, 0.0F);
		belts.addChild(Belt43_r1);
		setRotationAngle(Belt43_r1, 0.0F, 0.0F, 0.0873F);
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 400, -15.8F, -16.8F, 34.0F, 1, 6, 2, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 400, -15.8F, -16.8F, 20.0F, 1, 6, 2, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 400, -15.8F, -16.8F, 6.0F, 1, 6, 2, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 400, -15.8F, -16.8F, -8.0F, 1, 6, 2, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -15.3F, -40.8F, 40.0F, 1, 19, 2, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -15.3F, -40.8F, 27.0F, 1, 19, 2, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -15.3F, -40.8F, 13.0F, 1, 19, 2, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -15.3F, -40.8F, -14.0F, 1, 19, 2, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -15.3F, -40.8F, -1.5F, 1, 19, 2, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -15.3F, -38.8F, -20.0F, 1, 2, 68, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -15.3F, -33.8F, -20.0F, 1, 2, 68, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -15.3F, -28.8F, -20.0F, 1, 2, 68, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -15.3F, -23.8F, -21.0F, 1, 2, 70, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -15.3F, -14.8F, -21.0F, 1, 2, 70, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -15.3F, -40.8F, 34.0F, 1, 37, 2, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -15.3F, -40.8F, 20.0F, 1, 37, 2, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -15.3F, -40.8F, 6.0F, 1, 37, 2, 0.0F, true));
		Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -15.3F, -40.8F, -8.0F, 1, 37, 2, 0.0F, true));

		Belt14_r1 = new ModelRenderer(this);
		Belt14_r1.setRotationPoint(-0.0436F, 0.0019F, 0.0F);
		belts.addChild(Belt14_r1);
		setRotationAngle(Belt14_r1, 0.0F, 0.0F, -0.0873F);
		Belt14_r1.cubeList.add(new ModelBox(Belt14_r1, 200, 300, 29.3F, -40.3F, 34.0F, 1, 37, 2, 0.0F, true));

		CardboardBox = new ModelRenderer(this);
		CardboardBox.setRotationPoint(0.0F, 24.0F, 0.0F);
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, 13.0F, -16.0F, -20.0F, 18, 12, 24, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, 13.0F, -16.0F, 4.5F, 18, 12, 24, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -2.0F, -16.0F, 29.0F, 33, 12, 19, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -15.0F, -16.0F, -20.0F, 27, 12, 48, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -15.0F, -16.0F, 29.0F, 12, 12, 19, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, 4.0F, -28.1F, 0.0F, 27, 12, 24, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, 13.0F, -28.1F, 25.0F, 18, 12, 23, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -14.5F, -28.1F, -20.0F, 18, 12, 24, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, 4.0F, -28.1F, -20.0F, 27, 12, 19, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -15.0F, -28.1F, 4.5F, 18, 12, 33, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, 3.5F, -28.1F, 25.0F, 9, 12, 23, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -15.0F, -28.1F, 38.0F, 18, 12, 10, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -14.0F, -40.2F, 22.0F, 25, 12, 25, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, 12.0F, -40.2F, -19.0F, 18, 12, 24, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -0.5F, -40.2F, -19.0F, 12, 12, 24, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -14.0F, -40.2F, -19.0F, 13, 12, 40, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, 0.0F, -40.2F, 5.5F, 30, 12, 16, 0.0F, true));
		CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, 12.0F, -40.2F, 22.0F, 18, 12, 25, 0.0F, true));

		shape = new ModelRenderer(this);
		shape.setRotationPoint(0.0F, 24.0F, 0.0F);
		shape.cubeList.add(new ModelBox(shape, 0, 0, -19.0F, -3.5F, 43.0F, 53, 1, 5, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -18.0F, -4.0F, -22.0F, 51, 2, 72, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -16.0F, -3.5F, -23.0F, 5, 1, 74, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -9.0F, -3.5F, -23.0F, 5, 1, 74, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -2.0F, -3.5F, -23.0F, 5, 1, 74, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 5.0F, -3.5F, -23.0F, 5, 1, 74, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 12.0F, -3.5F, -23.0F, 5, 1, 74, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 19.0F, -3.5F, -23.0F, 5, 1, 74, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 26.0F, -3.5F, -23.0F, 5, 1, 74, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -19.0F, -3.5F, -20.0F, 53, 1, 5, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -19.0F, -3.5F, -13.0F, 53, 1, 5, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -19.0F, -3.5F, -6.0F, 53, 1, 5, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -19.0F, -3.5F, 1.0F, 53, 1, 5, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -19.0F, -3.5F, 15.0F, 53, 1, 5, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -19.0F, -3.5F, 8.0F, 53, 1, 5, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -19.0F, -3.5F, 22.0F, 53, 1, 5, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -19.0F, -3.5F, 29.0F, 53, 1, 5, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -19.0F, -3.5F, 36.0F, 53, 1, 5, 0.0F, true));

		lock = new ModelRenderer(this);
		lock.setRotationPoint(0.0F, 24.0F, 0.0F);
		lock.cubeList.add(new ModelBox(lock, 0, 0, -18.5F, -3.8F, 47.5F, 52, 1, 2, 0.0F, true));
		lock.cubeList.add(new ModelBox(lock, 0, 100, -17.3F, -3.8F, -22.5F, 2, 1, 73, 0.0F, true));
		lock.cubeList.add(new ModelBox(lock, 0, 100, -4.0F, -3.8F, -22.5F, 2, 1, 73, 0.0F, true));
		lock.cubeList.add(new ModelBox(lock, 0, 100, 10.0F, -3.8F, -22.5F, 2, 1, 73, 0.0F, true));
		lock.cubeList.add(new ModelBox(lock, 0, 100, 24.0F, -3.8F, -22.5F, 2, 1, 73, 0.0F, true));
		lock.cubeList.add(new ModelBox(lock, 0, 100, 30.7F, -3.8F, -22.5F, 2, 1, 73, 0.0F, true));
		lock.cubeList.add(new ModelBox(lock, 0, 0, -18.5F, -3.8F, -21.3F, 52, 1, 2, 0.0F, true));
		lock.cubeList.add(new ModelBox(lock, 0, 0, -18.5F, -3.8F, -8.0F, 52, 1, 2, 0.0F, true));
		lock.cubeList.add(new ModelBox(lock, 0, 0, -18.5F, -3.8F, 6.0F, 52, 1, 2, 0.0F, true));
		lock.cubeList.add(new ModelBox(lock, 0, 0, -18.5F, -3.8F, 20.0F, 52, 1, 2, 0.0F, true));
		lock.cubeList.add(new ModelBox(lock, 0, 0, -18.5F, -3.8F, 34.0F, 52, 1, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		belts.render(f5);
		CardboardBox.render(f5);
		shape.render(f5);
		lock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
