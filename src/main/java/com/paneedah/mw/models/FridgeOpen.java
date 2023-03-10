package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class FridgeOpen extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;

	public FridgeOpen() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -9.5F, 0.0F);
		setRotationAngle(bone, 0.0F, 0.0F, -0.2618F);
		bone.cubeList.add(new ModelBox(bone, 0, 63, -7.0F, -0.3628F, -7.5F, 4, 2, 15, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -9.5F, 0.0F);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.2618F);
		bone2.cubeList.add(new ModelBox(bone2, 38, 46, 3.0F, -0.3628F, -7.5F, 4, 2, 15, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.25F, -2.0F, -11.0F);
		setRotationAngle(bone3, 0.0F, -0.5236F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 26, 80, -4.7745F, -5.0F, -0.2745F, 12, 10, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 99, -3.7745F, -4.0F, -1.2745F, 1, 8, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(3.5F, 13.0F, -15.0F);
		setRotationAngle(bone4, 0.0F, -1.2217F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 100, 94, -2.8103F, 0.5F, 1.0F, 10, 2, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 100, 94, -2.8103F, -5.5F, 1.0F, 10, 2, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 80, -3.75F, -9.0F, 0.0F, 12, 18, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 52, 80, -2.75F, -8.0F, -1.0F, 1, 16, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 12, 99, -6.0F, -1.0F, 4.5F, 2, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 4, 105, -6.0F, -1.0F, -6.5F, 2, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -7.0F, -32.0F, -7.5F, 1, 31, 15, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 54, 103, -6.0F, -2.0F, -7.5F, 12, 1, 14, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 54, 103, -6.0F, -21.0F, -7.5F, 12, 1, 14, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 54, 103, -6.0F, -14.0F, -6.5F, 12, 1, 13, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 54, 103, -6.0F, -8.0F, -6.5F, 12, 1, 13, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 2, 111, -6.0F, -7.0F, -5.5F, 12, 5, 12, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 75, 6, -6.0F, -32.0F, 6.5F, 12, 31, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 96, 42, 6.0F, -32.0F, -7.5F, 1, 31, 15, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 46, -3.0F, -33.0353F, -7.5F, 6, 2, 15, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 4, 102, 4.0F, -1.0F, -6.5F, 2, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 4, 99, 4.0F, -1.0F, 4.5F, 2, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
		bone2.render(f5);
		bone3.render(f5);
		bone4.render(f5);
		bone5.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}