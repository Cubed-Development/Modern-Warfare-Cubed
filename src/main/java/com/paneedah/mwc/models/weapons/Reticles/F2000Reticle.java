package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class F2000Reticle extends ModelBase {
	private final ModelRenderer reticle;
	private final ModelRenderer reticle9_r1;
	private final ModelRenderer reticle8_r1;
	private final ModelRenderer reticle7_r1;
	private final ModelRenderer reticle10_r1;

	public F2000Reticle() {
		textureWidth = 256;
		textureHeight = 256;

		reticle = new ModelRenderer(this);
		reticle.setRotationPoint(16.6413F, 21.3592F, 0.0F);
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -16.6413F, -48.3592F, 0.0F, 1, 47, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -18.1413F, -36.3592F, 0.0F, 4, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -5.1413F, -48.3592F, 0.0F, 35, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -62.1413F, -48.3592F, 0.0F, 35, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -28.6413F, -47.8592F, 0.0F, 1, 2, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -4.6413F, -47.8592F, 0.0F, 1, 2, 0, 0.0F, true));

		reticle9_r1 = new ModelRenderer(this);
		reticle9_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		reticle.addChild(reticle9_r1);
		setRotationAngle(reticle9_r1, 0.0F, 0.0F, -0.4461F);
		reticle9_r1.cubeList.add(new ModelBox(reticle9_r1, 0, 0, 2.5F, -39.0F, 0.0F, 9, 1, 0, 0.0F, true));

		reticle8_r1 = new ModelRenderer(this);
		reticle8_r1.setRotationPoint(-32.0401F, -4.4496F, 0.0F);
		reticle.addChild(reticle8_r1);
		setRotationAngle(reticle8_r1, 0.0F, 0.0F, 0.3392F);
		reticle8_r1.cubeList.add(new ModelBox(reticle8_r1, 0, 0, 12.0F, -48.5F, 0.0F, 1, 7, 0, 0.0F, true));

		reticle7_r1 = new ModelRenderer(this);
		reticle7_r1.setRotationPoint(-1.1852F, -4.117F, 0.0F);
		reticle.addChild(reticle7_r1);
		setRotationAngle(reticle7_r1, 0.0F, 0.0F, -0.3393F);
		reticle7_r1.cubeList.add(new ModelBox(reticle7_r1, 0, 0, -12.0F, -48.5F, 0.0F, 1, 7, 0, 0.0F, true));

		reticle10_r1 = new ModelRenderer(this);
		reticle10_r1.setRotationPoint(-33.1847F, -0.4315F, 0.0F);
		reticle.addChild(reticle10_r1);
		setRotationAngle(reticle10_r1, 0.0F, 0.0F, 0.4461F);
		reticle10_r1.cubeList.add(new ModelBox(reticle10_r1, 0, 0, -10.5F, -39.0F, 0.0F, 9, 1, 0, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		reticle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}