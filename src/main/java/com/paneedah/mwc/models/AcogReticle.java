package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class AcogReticle extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer reticle16;
	private final ModelRenderer reticle15;
	private final ModelRenderer reticle14;
	private final ModelRenderer reticle13;
	private final ModelRenderer reticle12;
	private final ModelRenderer reticle11;
	private final ModelRenderer reticle10;
	private final ModelRenderer reticle9;
	private final ModelRenderer reticle8;
	private final ModelRenderer reticle6;
	private final ModelRenderer reticle7;
	private final ModelRenderer reticle55;
	private final ModelRenderer reticle5;
	private final ModelRenderer reticle4;
	private final ModelRenderer reticle3;
	private final ModelRenderer reticle2;
	private final ModelRenderer reticle1;

	public AcogReticle() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, 26.25F, 0.0F);
		

		reticle16 = new ModelRenderer(this);
		reticle16.setRotationPoint(14.0F, -60.0F, 0.0F);
		bone.addChild(reticle16);
		reticle16.cubeList.add(new ModelBox(reticle16, 2, 8, 0.0F, 0.0F, 0.0F, 1, 5, 0, 0.0F, false));

		reticle15 = new ModelRenderer(this);
		reticle15.setRotationPoint(24.0F, -60.0F, 0.0F);
		bone.addChild(reticle15);
		reticle15.cubeList.add(new ModelBox(reticle15, 4, 8, 0.0F, 0.0F, 0.0F, 1, 5, 0, 0.0F, false));

		reticle14 = new ModelRenderer(this);
		reticle14.setRotationPoint(34.0F, -60.0F, 0.0F);
		bone.addChild(reticle14);
		reticle14.cubeList.add(new ModelBox(reticle14, 6, 8, 0.0F, 0.0F, 0.0F, 1, 5, 0, 0.0F, false));

		reticle13 = new ModelRenderer(this);
		reticle13.setRotationPoint(-14.0F, -60.0F, 0.0F);
		bone.addChild(reticle13);
		reticle13.cubeList.add(new ModelBox(reticle13, 8, 8, 0.0F, 0.0F, 0.0F, 1, 5, 0, 0.0F, false));

		reticle12 = new ModelRenderer(this);
		reticle12.setRotationPoint(-24.0F, -60.0F, 0.0F);
		bone.addChild(reticle12);
		reticle12.cubeList.add(new ModelBox(reticle12, 10, 10, 0.0F, 0.0F, 0.0F, 1, 5, 0, 0.0F, false));

		reticle11 = new ModelRenderer(this);
		reticle11.setRotationPoint(-34.0F, -60.0F, 0.0F);
		bone.addChild(reticle11);
		reticle11.cubeList.add(new ModelBox(reticle11, 12, 12, 0.0F, 0.0F, 0.0F, 1, 5, 0, 0.0F, false));

		reticle10 = new ModelRenderer(this);
		reticle10.setRotationPoint(-1.5F, -22.0F, 0.0F);
		bone.addChild(reticle10);
		reticle10.cubeList.add(new ModelBox(reticle10, 2, 6, 0.0F, 0.0F, 0.0F, 4, 1, 0, 0.0F, false));

		reticle9 = new ModelRenderer(this);
		reticle9.setRotationPoint(-2.0F, -32.0F, 0.0F);
		bone.addChild(reticle9);
		reticle9.cubeList.add(new ModelBox(reticle9, 2, 4, 0.0F, 0.0F, 0.0F, 5, 1, 0, 0.0F, false));

		reticle8 = new ModelRenderer(this);
		reticle8.setRotationPoint(-2.5F, -41.0F, 0.0F);
		bone.addChild(reticle8);
		reticle8.cubeList.add(new ModelBox(reticle8, 2, 3, 0.0F, 0.0F, 0.0F, 6, 1, 0, 0.0F, false));

		reticle6 = new ModelRenderer(this);
		reticle6.setRotationPoint(0.9F, -57.0F, 0.0F);
		bone.addChild(reticle6);
		setRotationAngle(reticle6, 0.0F, 0.0F, 0.7854F);
		reticle6.cubeList.add(new ModelBox(reticle6, 2, 7, 0.0F, 0.0F, 0.0F, 4, 1, 0, 0.0F, false));

		reticle7 = new ModelRenderer(this);
		reticle7.setRotationPoint(-3.5F, -47.0F, 0.0F);
		bone.addChild(reticle7);
		reticle7.cubeList.add(new ModelBox(reticle7, 2, 2, 0.0F, 0.0F, 0.0F, 8, 1, 0, 0.0F, false));

		reticle55 = new ModelRenderer(this);
		reticle55.setRotationPoint(0.1F, -57.0F, 0.0F);
		bone.addChild(reticle55);
		setRotationAngle(reticle55, 0.0F, 0.0F, 0.7854F);
		reticle55.cubeList.add(new ModelBox(reticle55, 10, 6, 0.0F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

		reticle5 = new ModelRenderer(this);
		reticle5.setRotationPoint(0.5F, -58.0F, 0.0F);
		bone.addChild(reticle5);
		setRotationAngle(reticle5, 0.0F, 0.0F, 0.7854F);
		reticle5.cubeList.add(new ModelBox(reticle5, 12, 4, 0.0F, 0.0F, 0.0F, 1, 5, 0, 0.0F, false));

		reticle4 = new ModelRenderer(this);
		reticle4.setRotationPoint(0.5F, -58.0F, 0.0F);
		bone.addChild(reticle4);
		setRotationAngle(reticle4, 0.0F, 0.0F, 0.7854F);
		reticle4.cubeList.add(new ModelBox(reticle4, 2, 5, 0.0F, 0.0F, 0.0F, 5, 1, 0, 0.0F, false));

		reticle3 = new ModelRenderer(this);
		reticle3.setRotationPoint(-34.0F, -58.0F, 0.0F);
		bone.addChild(reticle3);
		reticle3.cubeList.add(new ModelBox(reticle3, 0, 0, 0.0F, 0.0F, 0.0F, 30, 1, 0, 0.0F, false));

		reticle2 = new ModelRenderer(this);
		reticle2.setRotationPoint(5.0F, -58.0F, 0.0F);
		bone.addChild(reticle2);
		reticle2.cubeList.add(new ModelBox(reticle2, 0, 1, 0.0F, 0.0F, 0.0F, 30, 1, 0, 0.0F, false));

		reticle1 = new ModelRenderer(this);
		reticle1.setRotationPoint(0.0F, -54.0F, 0.0F);
		bone.addChild(reticle1);
		reticle1.cubeList.add(new ModelBox(reticle1, 0, 2, 0.0F, 0.0F, 0.0F, 1, 41, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
