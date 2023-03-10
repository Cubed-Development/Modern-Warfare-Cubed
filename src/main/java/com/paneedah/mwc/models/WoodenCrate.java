package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class WoodenCrate extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;

	public WoodenCrate() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(7.0F, 16.0F, 0.0F);
		setRotationAngle(bone, -0.7854F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 20, -14.49F, -1.7071F, -9.7071F, 15, 2, 18, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(7.0F, 16.0F, 0.0F);
		setRotationAngle(bone2, 0.7854F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -14.5F, -1.7071F, -8.2929F, 15, 2, 18, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 16.0F, -6.75F);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.7854F);
		bone3.cubeList.add(new ModelBox(bone3, 48, 20, -9.7071F, -1.7071F, -0.75F, 18, 2, 15, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 16.0F, -6.75F);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.7854F);
		bone4.cubeList.add(new ModelBox(bone4, 48, 0, -8.2929F, -1.7071F, -0.76F, 18, 2, 15, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 9.0F, 0.0F);
		setRotationAngle(bone5, 0.0F, -0.7854F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 22, 70, -1.0F, -1.75F, -9.0F, 2, 2, 18, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 9.0F, 0.0F);
		setRotationAngle(bone6, 0.0F, 0.7854F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 0, 68, -1.0F, -1.76F, -9.0F, 2, 2, 18, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 80, 37, -8.0F, -3.0F, -8.0F, 2, 3, 16, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 40, 52, -6.0F, -3.0F, -8.0F, 12, 2, 16, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 80, 60, -6.0F, -17.0F, -8.0F, 12, 2, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 80, 56, -6.0F, -17.0F, 6.0F, 12, 2, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 44, 70, -8.0F, -17.0F, -6.0F, 2, 2, 12, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 54, 37, 6.0F, -17.0F, -6.0F, 2, 2, 12, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -8.0F, -17.0F, 6.0F, 2, 14, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 40, -7.0F, -16.0F, -7.0F, 14, 14, 14, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 8, 20, -8.0F, -17.0F, -8.0F, 2, 14, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 20, 6.0F, -17.0F, -8.0F, 2, 14, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 8, 0, 6.0F, -17.0F, 6.0F, 2, 14, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 62, 70, 6.0F, -3.0F, -8.0F, 2, 3, 16, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 82, 82, -1.0F, -1.0F, -8.0F, 2, 1, 16, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
		bone2.render(f5);
		bone3.render(f5);
		bone4.render(f5);
		bone5.render(f5);
		bone6.render(f5);
		bone7.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
