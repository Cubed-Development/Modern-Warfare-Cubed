package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Emp1911Slide extends ModelBase {
	private final ModelRenderer slide;
	private final ModelRenderer gun87_r1;
	private final ModelRenderer gun86_r1;
	private final ModelRenderer gun85_r1;
	private final ModelRenderer gun61_r1;
	private final ModelRenderer gun57_r1;
	private final ModelRenderer gun56_r1;
	private final ModelRenderer gun50_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun8_r1;

	public Emp1911Slide() {
		textureWidth = 512;
		textureHeight = 256;

		slide = new ModelRenderer(this);
		slide.setRotationPoint(0.0F, 24.0F, 0.0F);
		slide.cubeList.add(new ModelBox(slide, 0, 0, -3.6F, -36.5F, -3.5F, 1, 2, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -2.8F, -38.0F, -8.5F, 2, 3, 9, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -1.2F, -38.0F, -10.5F, 1, 3, 11, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.2F, -35.0F, -25.5F, 1, 2, 19, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.2F, -35.0F, -31.5F, 1, 1, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -3.7F, -35.0F, -31.5F, 1, 1, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -1.2F, -38.0F, -13.5F, 1, 4, 5, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.2F, -36.5F, -11.5F, 1, 1, 5, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -1.2F, -38.0F, -31.5F, 1, 4, 18, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -2.8F, -38.0F, -31.5F, 2, 4, 18, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -3.5F, -36.8F, -31.5F, 1, 2, 18, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -3.7F, -35.0F, -25.5F, 1, 2, 19, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -3.5F, -34.2F, -0.2F, 4, 1, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -3.7F, -36.0F, -1.5F, 1, 3, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.2F, -36.0F, -1.5F, 1, 3, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -3.7F, -36.5F, -1.5F, 1, 1, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.2F, -36.5F, -1.5F, 1, 1, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.2F, -36.5F, -3.0F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.2F, -36.5F, -4.5F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.2F, -36.0F, -6.0F, 1, 3, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.2F, -36.0F, -3.0F, 1, 3, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.2F, -36.0F, -4.5F, 1, 3, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.2F, -36.5F, -6.0F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -3.7F, -36.0F, -3.0F, 1, 3, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -3.7F, -35.0F, -6.0F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -3.7F, -36.0F, -4.5F, 1, 3, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -3.7F, -36.5F, -4.5F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -3.7F, -36.5F, -3.0F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -3.6F, -35.0F, -6.5F, 1, 2, 5, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.3F, -36.0F, -6.5F, 1, 3, 5, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.3F, -36.5F, -6.5F, 1, 1, 5, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.2F, -36.0F, -11.5F, 1, 1, 5, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.4F, -36.8F, -31.5F, 1, 2, 20, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.2F, -35.0F, -29.0F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.2F, -35.0F, -27.5F, 1, 1, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -3.7F, -35.0F, -27.5F, 1, 1, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -3.7F, -35.0F, -29.0F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -3.6F, -35.0F, -29.5F, 1, 1, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -0.3F, -35.0F, -29.5F, 1, 1, 2, 0.0F, true));

		gun87_r1 = new ModelRenderer(this);
		gun87_r1.setRotationPoint(-1.4387F, 0.0F, -22.8083F);
		slide.addChild(gun87_r1);
		setRotationAngle(gun87_r1, -3.1416F, -0.2649F, 3.1416F);
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 0, 0, 0.8F, -36.5F, -11.5F, 1, 2, 1, 0.0F, true));

		gun86_r1 = new ModelRenderer(this);
		gun86_r1.setRotationPoint(-20.5624F, -4.2904F, 0.0F);
		slide.addChild(gun86_r1);
		setRotationAngle(gun86_r1, 0.0F, 0.0F, 0.5585F);
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 0, 0, -2.8F, -37.6F, -31.5F, 1, 1, 18, 0.0F, true));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 0, 0, -2.8F, -38.0F, -31.5F, 1, 1, 18, 0.0F, true));

		gun85_r1 = new ModelRenderer(this);
		gun85_r1.setRotationPoint(-31.9606F, -17.136F, 0.0F);
		slide.addChild(gun85_r1);
		setRotationAngle(gun85_r1, 0.0F, 0.0F, 0.9948F);
		gun85_r1.cubeList.add(new ModelBox(gun85_r1, 0, 0, 0.25F, -38.0F, -31.5F, 1, 1, 20, 0.0F, true));
		gun85_r1.cubeList.add(new ModelBox(gun85_r1, 0, 0, -0.2F, -38.0F, -31.5F, 1, 1, 20, 0.0F, true));
		gun85_r1.cubeList.add(new ModelBox(gun85_r1, 0, 0, -0.2F, -38.0F, -11.5F, 1, 2, 12, 0.0F, true));

		gun61_r1 = new ModelRenderer(this);
		gun61_r1.setRotationPoint(0.0F, -65.5795F, -11.9188F);
		slide.addChild(gun61_r1);
		setRotationAngle(gun61_r1, -2.6769F, 0.0F, 0.0F);
		gun61_r1.cubeList.add(new ModelBox(gun61_r1, 0, 0, -0.5F, -34.2F, 1.8F, 1, 3, 2, 0.0F, true));
		gun61_r1.cubeList.add(new ModelBox(gun61_r1, 0, 0, -3.5F, -34.2F, 1.8F, 1, 3, 2, 0.0F, true));

		gun57_r1 = new ModelRenderer(this);
		gun57_r1.setRotationPoint(0.0F, -25.8622F, -32.3194F);
		slide.addChild(gun57_r1);
		setRotationAngle(gun57_r1, -1.2641F, 0.0F, 0.0F);
		gun57_r1.cubeList.add(new ModelBox(gun57_r1, 0, 0, -2.0F, -35.0F, 1.5F, 1, 2, 1, 0.0F, true));

		gun56_r1 = new ModelRenderer(this);
		gun56_r1.setRotationPoint(0.0F, -27.0031F, -35.8774F);
		slide.addChild(gun56_r1);
		setRotationAngle(gun56_r1, -1.2641F, 0.0F, 0.0F);
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 0, 0, -2.0F, -38.0F, 0.5F, 1, 2, 1, 0.0F, true));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 0, 0, -1.2F, -38.0F, 0.5F, 1, 3, 4, 0.0F, true));
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 0, 0, -2.8F, -38.0F, 0.5F, 1, 2, 4, 0.0F, true));

		gun50_r1 = new ModelRenderer(this);
		gun50_r1.setRotationPoint(0.0F, -74.6857F, -24.2526F);
		slide.addChild(gun50_r1);
		setRotationAngle(gun50_r1, 2.4538F, 0.0F, 0.0F);
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 0, 0, -3.7F, -33.0F, -25.5F, 1, 1, 2, 0.0F, true));
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 0, 0, -0.2F, -33.0F, -25.5F, 1, 1, 2, 0.0F, true));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-18.418F, -67.5412F, 0.0F);
		slide.addChild(gun28_r1);
		setRotationAngle(gun28_r1, 0.0F, 0.0F, 2.5653F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 0, 0, 0.8F, -36.5F, -11.5F, 1, 1, 12, 0.0F, true));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-20.5345F, -4.2757F, 0.0F);
		slide.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 0.0F, 0.0F, 0.5577F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 0, 0, -2.8F, -38.0F, -8.5F, 1, 1, 9, 0.0F, true));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(29.6661F, -21.2472F, 0.0F);
		slide.addChild(gun8_r1);
		setRotationAngle(gun8_r1, 0.0F, 0.0F, -1.041F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 0, 0, -3.7F, -36.5F, -8.5F, 1, 1, 9, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		slide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}