package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKErgoGrip extends ModelBase {
	private final ModelRenderer gun1;
	private final ModelRenderer gun2;
	private final ModelRenderer gun3;
	private final ModelRenderer gun4;
	private final ModelRenderer gun5;
	private final ModelRenderer gun6;
	private final ModelRenderer gun7;
	private final ModelRenderer gun8;
	private final ModelRenderer gun9;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;
	private final ModelRenderer gun31;
	private final ModelRenderer gun32;
	private final ModelRenderer gun33;
	private final ModelRenderer gun34;
	private final ModelRenderer gun35;
	private final ModelRenderer gun36;
	private final ModelRenderer gun37;
	private final ModelRenderer gun38;
	private final ModelRenderer gun39;
	private final ModelRenderer gun40;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun41;
	private final ModelRenderer gun42;

	public AKErgoGrip() {
		textureWidth = 50;
		textureHeight = 50;

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-3.5F, -7.0F, -7.0F);
		gun1.cubeList.add(new ModelBox(gun1, 0, 0, 0.001F, 0.0F, -0.001F, 4, 1, 9, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-3.5F, -2.5F, -6.0F);
		setRotationAngle(gun2, 0.481F, 0.0F, 0.0F);
		gun2.cubeList.add(new ModelBox(gun2, 0, 10, 0.002F, 0.0F, 0.0F, 4, 12, 5, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-3.5F, -6.0F, 2.0F);
		setRotationAngle(gun3, -2.5281F, 0.0F, 0.0F);
		gun3.cubeList.add(new ModelBox(gun3, 26, 6, -0.001F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.5F, 6.5F, -1.0F);
		gun4.cubeList.add(new ModelBox(gun4, 17, 0, 0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-3.5F, -4.5F, -1.5F);
		setRotationAngle(gun5, 0.481F, 0.0F, 0.0F);
		gun5.cubeList.add(new ModelBox(gun5, 7, 27, -0.001F, 1.0F, 0.0F, 4, 3, 1, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-3.5F, 8.5F, 3.0F);
		setRotationAngle(gun6, 2.491F, 0.0F, 0.0F);
		gun6.cubeList.add(new ModelBox(gun6, 13, 10, 0.001F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.5F, 5.2F, 4.2F);
		setRotationAngle(gun7, -0.6692F, 0.0F, 0.0F);
		

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-3.5F, -6.5F, -7.0F);
		gun8.cubeList.add(new ModelBox(gun8, 18, 10, 0.0F, 0.0F, 0.0F, 4, 4, 7, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-3.5F, -2.5F, -7.0F);
		setRotationAngle(gun9, 1.2269F, 0.0F, 0.0F);
		gun9.cubeList.add(new ModelBox(gun9, 30, 33, 0.001F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-3.5F, -6.0F, -0.4F);
		gun10.cubeList.add(new ModelBox(gun10, 33, 4, 0.002F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-3.5F, -5.2F, 0.67F);
		setRotationAngle(gun11, -2.1564F, 0.0F, 0.0F);
		gun11.cubeList.add(new ModelBox(gun11, 17, 6, 0.001F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-3.6F, -3.5F, -5.9F);
		setRotationAngle(gun31, 0.481F, 0.0F, 0.0F);
		gun31.cubeList.add(new ModelBox(gun31, 0, 27, 0.0F, 2.8463F, 0.0887F, 1, 10, 5, 0.0F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-0.4F, -3.5F, -5.9F);
		setRotationAngle(gun32, 0.481F, 0.0F, 0.0F);
		gun32.cubeList.add(new ModelBox(gun32, 18, 21, 0.0F, 2.8463F, 0.0887F, 1, 10, 5, 0.0F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-0.4F, -5.8F, -6.5F);
		

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(-3.6F, -5.8F, -6.5F);
		

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-3.6F, -4.8F, -6.5F);
		setRotationAngle(gun35, 0.4461F, 0.0F, 0.0F);
		

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(-0.4F, -4.8F, -6.5F);
		setRotationAngle(gun36, 0.4461F, 0.0F, 0.0F);
		

		gun37 = new ModelRenderer(this);
		gun37.setRotationPoint(-0.4F, -4.8F, -5.0F);
		

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(-3.6F, -4.8F, -5.0F);
		

		gun39 = new ModelRenderer(this);
		gun39.setRotationPoint(-3.5F, -3.7F, -1.5F);
		setRotationAngle(gun39, 0.7041F, 0.0F, 0.0F);
		gun39.cubeList.add(new ModelBox(gun39, 33, 10, 0.001F, 1.0F, 0.0F, 4, 4, 1, 0.0F, false));

		gun40 = new ModelRenderer(this);
		gun40.setRotationPoint(-3.5F, -0.2F, 1.5F);
		setRotationAngle(gun40, 0.4067F, 0.0F, 0.0F);
		

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(4.0F, 0.0F, 1.0F);
		gun40.addChild(gun40_r1);
		setRotationAngle(gun40_r1, -0.0524F, 0.0F, 0.0F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 30, 21, -4.0F, 0.0F, -1.0F, 4, 7, 1, 0.0F, false));

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(-3.5F, -1.0F, -4.3F);
		setRotationAngle(gun41, -0.4856F, 0.0F, 0.0F);
		gun41.cubeList.add(new ModelBox(gun41, 30, 29, 0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F, false));

		gun42 = new ModelRenderer(this);
		gun42.setRotationPoint(-3.5F, 3.0F, -2.2F);
		setRotationAngle(gun42, -0.4856F, 0.0F, 0.0F);
		gun42.cubeList.add(new ModelBox(gun42, 29, 0, 0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun1.render(f5);
		gun2.render(f5);
		gun3.render(f5);
		gun4.render(f5);
		gun5.render(f5);
		gun6.render(f5);
		gun7.render(f5);
		gun8.render(f5);
		gun9.render(f5);
		gun10.render(f5);
		gun11.render(f5);
		gun31.render(f5);
		gun32.render(f5);
		gun33.render(f5);
		gun34.render(f5);
		gun35.render(f5);
		gun36.render(f5);
		gun37.render(f5);
		gun38.render(f5);
		gun39.render(f5);
		gun40.render(f5);
		gun41.render(f5);
		gun42.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}