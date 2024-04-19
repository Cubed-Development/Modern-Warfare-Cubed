package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ImpactGrenade extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer ImpactGrenade43_r1;
	private final ModelRenderer ImpactGrenade42_r1;
	private final ModelRenderer ImpactGrenade41_r1;
	private final ModelRenderer ImpactGrenade40_r1;

	public ImpactGrenade() {
		textureWidth = 256;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, -38.5F, -1.5F, 2, 1, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -2.5F, -38.0F, 0.5F, 2, 13, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -2.5F, -33.0F, -5.5F, 2, 2, 14, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -2.5F, -35.0F, -5.0F, 2, 6, 13, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -8.5F, -33.0F, 0.5F, 14, 2, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -8.0F, -35.0F, 0.5F, 13, 6, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -4.5F, -33.0F, -5.0F, 6, 2, 13, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -8.0F, -33.0F, -1.5F, 13, 2, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -4.5F, -37.5F, 0.5F, 6, 12, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -2.5F, -37.5F, -1.5F, 2, 12, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -7.0F, -33.0F, -3.0F, 11, 2, 9, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -6.0F, -33.0F, -4.0F, 9, 2, 11, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -6.0F, -37.5F, 0.5F, 9, 11, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -7.0F, -36.5F, 0.5F, 11, 9, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -2.5F, -37.5F, -3.0F, 2, 11, 9, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -2.5F, -36.5F, -4.0F, 2, 9, 11, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -4.5F, -37.5F, -1.5F, 6, 11, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -5.0F, -36.5F, -3.0F, 7, 9, 9, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -7.0F, -35.0F, -1.5F, 11, 6, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -4.5F, -35.0F, -4.0F, 6, 6, 11, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -6.0F, -36.5F, -2.0F, 9, 9, 7, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -6.0F, -35.0F, -3.0F, 9, 6, 9, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, -39.0F, 0.5F, 2, 1, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.5F, -38.5F, 0.5F, 6, 1, 2, 0.0F, true));

		ImpactGrenade43_r1 = new ModelRenderer(this);
		ImpactGrenade43_r1.setRotationPoint(-1.5104F, 0.0F, -2.6704F);
		bone.addChild(ImpactGrenade43_r1);
		setRotationAngle(ImpactGrenade43_r1, 0.0F, 0.7808F, 0.0F);
		ImpactGrenade43_r1.cubeList.add(new ModelBox(ImpactGrenade43_r1, 0, 0, -4.0F, -38.5F, 0.5F, 2, 1, 2, 0.0F, true));

		ImpactGrenade42_r1 = new ModelRenderer(this);
		ImpactGrenade42_r1.setRotationPoint(-2.918F, 0.0F, -2.0912F);
		bone.addChild(ImpactGrenade42_r1);
		setRotationAngle(ImpactGrenade42_r1, 0.0F, 0.7808F, 0.0F);
		ImpactGrenade42_r1.cubeList.add(new ModelBox(ImpactGrenade42_r1, 0, 0, -4.0F, -38.5F, 2.5F, 2, 1, 2, 0.0F, true));

		ImpactGrenade41_r1 = new ModelRenderer(this);
		ImpactGrenade41_r1.setRotationPoint(3.4894F, 0.0F, 3.5261F);
		bone.addChild(ImpactGrenade41_r1);
		setRotationAngle(ImpactGrenade41_r1, -3.1416F, -0.7993F, 3.1416F);
		ImpactGrenade41_r1.cubeList.add(new ModelBox(ImpactGrenade41_r1, 0, 0, 1.0F, -38.5F, 2.5F, 2, 1, 2, 0.0F, true));

		ImpactGrenade40_r1 = new ModelRenderer(this);
		ImpactGrenade40_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(ImpactGrenade40_r1);
		setRotationAngle(ImpactGrenade40_r1, 0.0F, -0.7808F, 0.0F);
		ImpactGrenade40_r1.cubeList.add(new ModelBox(ImpactGrenade40_r1, 0, 0, -0.5F, -38.5F, -1.0F, 2, 1, 2, 0.0F, true));
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