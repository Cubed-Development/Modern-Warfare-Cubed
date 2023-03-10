package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK74Stock extends ModelBase {
	private final QRenderer stock;
	private final ModelRenderer gun365_r1;
	private final ModelRenderer gun349_r1;
	private final ModelRenderer gun245_r1;
	private final ModelRenderer gun244_r1;
	private final ModelRenderer gun241_r1;
	private final ModelRenderer gun240_r1;
	private final ModelRenderer gun239_r1;
	private final ModelRenderer gun238_r1;
	private final ModelRenderer gun237_r1;
	private final ModelRenderer gun236_r1;
	private final ModelRenderer gun234_r1;
	private final ModelRenderer gun233_r1;
	private final ModelRenderer gun366_r1;

	public AK74Stock() {
		textureWidth = 85;
		textureHeight = 85;

		stock = new QRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 10, 17, -3.501F, -32.3F, 10.5F, 4, 2, 3, 0.0F, false));

		gun365_r1 = new ModelRenderer(this);
		gun365_r1.setRotationPoint(-2.5F, -36.0F, 3.5F);
		stock.addChild(gun365_r1);
		setRotationAngle(gun365_r1, -0.1859F, 0.0F, 0.0F);
		gun365_r1.cubeList.add(new ModelBox(gun365_r1, 6, 22, 0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

		gun349_r1 = new ModelRenderer(this);
		gun349_r1.setRotationPoint(-0.1F, -33.5F, 8.5F);
		stock.addChild(gun349_r1);
		setRotationAngle(gun349_r1, -0.1859F, 0.0F, 0.0F);
		gun349_r1.cubeList.add(new ModelBox(gun349_r1, 0, 0, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun245_r1 = new ModelRenderer(this);
		gun245_r1.setRotationPoint(-1.1F, -33.9F, 30.8F);
		stock.addChild(gun245_r1);
		setRotationAngle(gun245_r1, -0.0873F, 0.0F, 0.0F);
		gun245_r1.cubeList.add(new ModelBox(gun245_r1, 10, 10, 0.0F, -1.301F, 0.018F, 1, 3, 1, 0.0F, false));
		gun245_r1.cubeList.add(new ModelBox(gun245_r1, 0, 23, -1.8F, -1.3008F, 0.0174F, 2, 3, 1, 0.0F, false));

		gun244_r1 = new ModelRenderer(this);
		gun244_r1.setRotationPoint(-0.6F, -32.9F, 29.7F);
		stock.addChild(gun244_r1);
		setRotationAngle(gun244_r1, -0.0873F, 0.0F, 0.0F);
		gun244_r1.cubeList.add(new ModelBox(gun244_r1, 21, 0, 0.0F, -1.0996F, -0.008F, 1, 11, 2, 0.0F, false));
		gun244_r1.cubeList.add(new ModelBox(gun244_r1, 0, 10, -2.8F, -1.0996F, -0.0087F, 3, 11, 2, 0.0F, false));

		gun241_r1 = new ModelRenderer(this);
		gun241_r1.setRotationPoint(-3.5F, -23.9F, 28.6F);
		stock.addChild(gun241_r1);
		setRotationAngle(gun241_r1, -0.1115F, 0.0F, 0.0F);
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 14, 22, 0.001F, -1.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun240_r1 = new ModelRenderer(this);
		gun240_r1.setRotationPoint(-3.5F, -29.7F, 26.4F);
		stock.addChild(gun240_r1);
		setRotationAngle(gun240_r1, -0.1115F, 0.0F, 0.0F);
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 0, 0, 0.002F, -1.0F, 0.0F, 4, 6, 4, 0.0F, false));

		gun239_r1 = new ModelRenderer(this);
		gun239_r1.setRotationPoint(-3.5F, -33.6F, 3.5F);
		stock.addChild(gun239_r1);
		setRotationAngle(gun239_r1, -0.2231F, 0.0F, 0.0F);
		gun239_r1.cubeList.add(new ModelBox(gun239_r1, 50, 31, -0.001F, 2.0F, 0.0F, 4, 1, 11, 0.0F, false));

		gun238_r1 = new ModelRenderer(this);
		gun238_r1.setRotationPoint(-3.5F, -34.6F, 12.75F);
		stock.addChild(gun238_r1);
		setRotationAngle(gun238_r1, -0.0129F, 0.0F, 0.0F);
		gun238_r1.cubeList.add(new ModelBox(gun238_r1, 0, 31, 0.0F, 0.0F, 0.0F, 4, 5, 18, 0.0F, false));

		gun237_r1 = new ModelRenderer(this);
		gun237_r1.setRotationPoint(-3.0F, -35.5F, 12.95F);
		stock.addChild(gun237_r1);
		setRotationAngle(gun237_r1, -0.0129F, 0.0F, 0.0F);
		gun237_r1.cubeList.add(new ModelBox(gun237_r1, 26, 36, 0.0F, 0.0F, 0.0F, 3, 2, 18, 0.0F, false));

		gun236_r1 = new ModelRenderer(this);
		gun236_r1.setRotationPoint(-3.0F, -33.2F, 8.5F);
		stock.addChild(gun236_r1);
		setRotationAngle(gun236_r1, 0.4833F, 0.0F, 0.0F);
		gun236_r1.cubeList.add(new ModelBox(gun236_r1, 10, 10, -0.001F, 0.0F, 0.0F, 3, 2, 5, 0.0F, false));

		gun234_r1 = new ModelRenderer(this);
		gun234_r1.setRotationPoint(-3.0F, -35.9F, 3.5F);
		stock.addChild(gun234_r1);
		setRotationAngle(gun234_r1, -0.1859F, 0.0F, 0.0F);
		gun234_r1.cubeList.add(new ModelBox(gun234_r1, 0, 54, 0.0F, 0.0F, 0.0F, 3, 2, 11, 0.0F, false));

		gun233_r1 = new ModelRenderer(this);
		gun233_r1.setRotationPoint(-3.5F, -34.9F, 3.5F);
		stock.addChild(gun233_r1);
		setRotationAngle(gun233_r1, -0.1859F, 0.0F, 0.0F);
		gun233_r1.cubeList.add(new ModelBox(gun233_r1, 0, 0, 0.001F, 0.0F, 0.0F, 4, 4, 27, 0.0F, false));

		gun366_r1 = new ModelRenderer(this);
		gun366_r1.setRotationPoint(-3.5F, -31.6F, 12.5F);
		stock.addChild(gun366_r1);
		setRotationAngle(gun366_r1, -0.3346F, 0.0F, 0.0F);
		gun366_r1.cubeList.add(new ModelBox(gun366_r1, 35, 0, -0.002F, 0.0F, 0.0F, 4, 3, 18, 0.0F, false));
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
