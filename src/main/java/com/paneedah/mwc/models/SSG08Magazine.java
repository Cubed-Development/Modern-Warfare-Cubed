package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SSG08Magazine extends ModelBase {
	private final ModelRenderer Magazine;
	private final ModelRenderer bone224;

	public SSG08Magazine() {
		textureWidth = 512;
		textureHeight = 512;

		Magazine = new ModelRenderer(this);
		Magazine.setRotationPoint(-0.5F, 17.0F, 0.0F);
		Magazine.cubeList.add(new ModelBox(Magazine, 88, 55, -2.4F, -29.0F, -30.5F, 2, 7, 13, 0.0F, false));
		Magazine.cubeList.add(new ModelBox(Magazine, 86, 125, -0.6F, -29.0F, -30.5F, 1, 7, 13, 0.0F, false));
		Magazine.cubeList.add(new ModelBox(Magazine, 39, 95, -2.4F, -22.25F, -25.5F, 1, 1, 8, 0.0F, false));
		Magazine.cubeList.add(new ModelBox(Magazine, 39, 86, -0.601F, -22.25F, -25.5F, 1, 1, 8, 0.0F, false));
		Magazine.cubeList.add(new ModelBox(Magazine, 60, 21, -2.4F, -29.0F, -18.01F, 2, 8, 1, 0.0F, false));
		Magazine.cubeList.add(new ModelBox(Magazine, 57, 60, -1.61F, -29.0F, -18.0F, 2, 8, 1, 0.0F, false));

		bone224 = new ModelRenderer(this);
		bone224.setRotationPoint(-1.0F, -28.0F, -24.5F);
		Magazine.addChild(bone224);
		setRotationAngle(bone224, -0.0873F, 0.0F, 0.0F);
		bone224.cubeList.add(new ModelBox(bone224, 39, 60, -1.7F, 6.063F, -5.7657F, 2, 1, 14, 0.0F, false));
		bone224.cubeList.add(new ModelBox(bone224, 0, 22, -0.3F, 6.063F, -5.7657F, 2, 1, 14, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}