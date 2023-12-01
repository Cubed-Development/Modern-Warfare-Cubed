package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Saiga12Stock extends ModelWithAttachments {
	private final ModelRenderer stock;
	private final ModelRenderer gun409_r1;
	private final ModelRenderer gun408_r1;
	private final ModelRenderer gun407_r1;
	private final ModelRenderer gun406_r1;
	private final ModelRenderer gun405_r1;
	private final ModelRenderer gun245_r1;
	private final ModelRenderer gun244_r1;
	private final ModelRenderer gun241_r1;
	private final ModelRenderer gun240_r1;
	private final ModelRenderer gun239_r1;
	private final ModelRenderer gun236_r1;
	private final ModelRenderer gun235_r1;
	private final ModelRenderer gun234_r1;

	public Saiga12Stock() {
		textureWidth = 150;
		textureHeight = 150;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(-1.4118F, -7.1431F, 21.704F);
		stock.cubeList.add(new ModelBox(stock, 0, 0, -1.5882F, -4.3569F, -8.754F, 3, 2, 18, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 0, -2.0882F, -3.4569F, -8.954F, 4, 2, 18, 0.0F, false));

		gun409_r1 = new ModelRenderer(this);
		gun409_r1.setRotationPoint(1.4118F, 28.892F, -26.4231F);
		stock.addChild(gun409_r1);
		setRotationAngle(gun409_r1, -0.1487F, 0.0F, 0.0F);
		gun409_r1.cubeList.add(new ModelBox(gun409_r1, 0, 0, -3.0F, -32.8F, 12.75F, 3, 2, 16, 0.0F, false));

		gun408_r1 = new ModelRenderer(this);
		gun408_r1.setRotationPoint(1.4118F, 28.0658F, -25.2278F);
		stock.addChild(gun408_r1);
		setRotationAngle(gun408_r1, -0.1115F, 0.0F, 0.0F);
		gun408_r1.cubeList.add(new ModelBox(gun408_r1, 0, 0, -3.5F, -33.1F, 25.8F, 4, 1, 2, 0.0F, false));

		gun407_r1 = new ModelRenderer(this);
		gun407_r1.setRotationPoint(1.4118F, 28.9096F, -26.186F);
		stock.addChild(gun407_r1);
		setRotationAngle(gun407_r1, -0.1487F, 0.0F, 0.0F);
		gun407_r1.cubeList.add(new ModelBox(gun407_r1, 0, 0, -3.5F, -31.2F, 12.75F, 4, 3, 15, 0.0F, false));

		gun406_r1 = new ModelRenderer(this);
		gun406_r1.setRotationPoint(1.4118F, 28.8721F, -26.6898F);
		stock.addChild(gun406_r1);
		setRotationAngle(gun406_r1, -0.1487F, 0.0F, 0.0F);
		gun406_r1.cubeList.add(new ModelBox(gun406_r1, 0, 0, -3.5F, -34.6F, 12.75F, 4, 2, 18, 0.0F, false));

		gun405_r1 = new ModelRenderer(this);
		gun405_r1.setRotationPoint(1.4118F, 29.895F, -28.094F);
		stock.addChild(gun405_r1);
		setRotationAngle(gun405_r1, -0.1859F, 0.0F, 0.0F);
		gun405_r1.cubeList.add(new ModelBox(gun405_r1, 0, 0, -3.5F, -34.9F, 3.5F, 4, 4, 12, 0.0F, false));

		gun245_r1 = new ModelRenderer(this);
		gun245_r1.setRotationPoint(1.4118F, 28.3153F, -24.6717F);
		stock.addChild(gun245_r1);
		setRotationAngle(gun245_r1, -0.0873F, 0.0F, 0.0F);
		gun245_r1.cubeList.add(new ModelBox(gun245_r1, 0, 0, -1.1F, -35.4F, 30.9F, 1, 3, 1, 0.0F, false));
		gun245_r1.cubeList.add(new ModelBox(gun245_r1, 0, 0, -2.9F, -35.4F, 30.9F, 2, 3, 1, 0.0F, false));

		gun244_r1 = new ModelRenderer(this);
		gun244_r1.setRotationPoint(1.4118F, 28.4146F, -24.5974F);
		stock.addChild(gun244_r1);
		setRotationAngle(gun244_r1, -0.0873F, 0.0F, 0.0F);
		gun244_r1.cubeList.add(new ModelBox(gun244_r1, 0, 0, -0.6F, -34.5F, 29.8F, 1, 11, 2, 0.0F, false));
		gun244_r1.cubeList.add(new ModelBox(gun244_r1, 0, 0, -3.4F, -34.5F, 29.8F, 3, 11, 2, 0.0F, false));

		gun241_r1 = new ModelRenderer(this);
		gun241_r1.setRotationPoint(1.4118F, 27.8113F, -24.1864F);
		stock.addChild(gun241_r1);
		setRotationAngle(gun241_r1, -0.1115F, 0.0F, 0.0F);
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 0, 0, -3.5F, -23.9F, 28.6F, 4, 1, 1, 0.0F, false));

		gun240_r1 = new ModelRenderer(this);
		gun240_r1.setRotationPoint(1.4118F, 27.9545F, -25.2216F);
		stock.addChild(gun240_r1);
		setRotationAngle(gun240_r1, -0.1115F, 0.0F, 0.0F);
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 0, 0, -3.5F, -33.1F, 26.8F, 4, 9, 4, 0.0F, false));

		gun239_r1 = new ModelRenderer(this);
		gun239_r1.setRotationPoint(1.4118F, 28.6422F, -31.3972F);
		stock.addChild(gun239_r1);
		setRotationAngle(gun239_r1, -0.2974F, 0.0F, 0.0F);
		gun239_r1.cubeList.add(new ModelBox(gun239_r1, 0, 0, -3.5F, -33.6F, 3.5F, 4, 3, 27, -0.01F, false));

		gun236_r1 = new ModelRenderer(this);
		gun236_r1.setRotationPoint(1.4118F, 31.2904F, -5.3015F);
		stock.addChild(gun236_r1);
		setRotationAngle(gun236_r1, 0.4833F, 0.0F, 0.0F);
		gun236_r1.cubeList.add(new ModelBox(gun236_r1, 0, 0, -3.0F, -33.2F, 8.5F, 3, 2, 5, 0.0F, false));

		gun235_r1 = new ModelRenderer(this);
		gun235_r1.setRotationPoint(1.4118F, 31.3935F, -5.7198F);
		stock.addChild(gun235_r1);
		setRotationAngle(gun235_r1, 0.4833F, 0.0F, 0.0F);
		gun235_r1.cubeList.add(new ModelBox(gun235_r1, 0, 0, -3.5F, -32.3F, 8.5F, 4, 2, 5, 0.0F, false));

		gun234_r1 = new ModelRenderer(this);
		gun234_r1.setRotationPoint(1.4118F, 29.8778F, -28.2788F);
		stock.addChild(gun234_r1);
		setRotationAngle(gun234_r1, -0.1859F, 0.0F, 0.0F);
		gun234_r1.cubeList.add(new ModelBox(gun234_r1, 0, 0, -3.0F, -35.9F, 3.5F, 3, 2, 11, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}