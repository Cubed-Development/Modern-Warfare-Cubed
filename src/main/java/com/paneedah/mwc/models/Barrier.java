package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Barrier extends ModelBase {
	private final ModelRenderer bone3;
	private final ModelRenderer bone5;
	private final ModelRenderer bone4;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;

	public Barrier() {
		textureWidth = 90;
		textureHeight = 90;

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(4.5F, 21.0F, 0.0F);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.6981F);
		bone3.cubeList.add(new ModelBox(bone3, 44, 44, -3.4421F, -0.8409F, -7.999F, 6, 3, 16, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(4.5F, 21.0F, 0.0F);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.6981F);
		bone5.cubeList.add(new ModelBox(bone5, 40, 0, -9.4523F, -6.626F, -7.999F, 6, 3, 16, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-2.7057F, 19.2234F, 0.0F);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.0873F);
		bone4.cubeList.add(new ModelBox(bone4, 24, 24, -0.5019F, -9.0436F, -8.001F, 2, 12, 16, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-3.0F, 27.75F, 13.0F);
		setRotationAngle(bone6, 0.0F, 0.0F, -0.0873F);
		bone6.cubeList.add(new ModelBox(bone6, 0, 36, 4.6621F, -17.0285F, -21.001F, 2, 12, 16, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 38, 8, -7.0F, -2.0F, 4.0F, 5, 2, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 24, 6, 2.0F, -2.0F, 4.0F, 5, 2, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 38, 2, -7.0F, -2.0F, -8.0F, 5, 2, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 29, 2.0F, -2.0F, -8.0F, 5, 2, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 18, 29, -7.0F, -2.0F, -2.0F, 5, 2, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 9, -7.0F, -2.0F, 2.0F, 5, 1, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 6, -7.0F, -2.0F, -4.0F, 5, 1, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 3, 2.0F, -2.0F, -4.0F, 5, 1, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, 2.0F, -2.0F, 2.0F, 5, 1, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 24, 0, 2.0F, -2.0F, -2.0F, 5, 2, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -2.0397F, -13.9737F, -8.01F, 4, 13, 16, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone3.render(f5);
		bone5.render(f5);
		bone4.render(f5);
		bone6.render(f5);
		bone7.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
