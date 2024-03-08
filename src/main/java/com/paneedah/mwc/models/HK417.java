package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK417 extends ModelWithAttachments {
	private final ModelRenderer barrel;

	public HK417() {
		textureWidth = 220;
		textureHeight = 220;

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 24.0F, 0.0F);
		barrel.cubeList.add(new ModelBox(barrel, 45, 18, -1.8F, -37.2F, -66.5F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 45, 26, -2.2F, -37.2F, -66.5F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 45, 45, -2.2F, -37.6F, -66.5F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 45, 53, -1.8F, -37.6F, -66.5F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 72, 29, -1.6F, -37.4F, -66.5F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 72, 56, -2.4F, -37.4F, -66.5F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 15, 88, -2.0F, -37.0F, -66.5F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 50, 89, -2.0F, -37.8F, -66.5F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 0, -2.2F, -37.4F, -62.5F, 1, 1, 43, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 44, -1.8F, -37.4F, -62.5F, 1, 1, 43, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 45, 1, -2.0F, -37.2F, -62.5F, 1, 1, 43, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 45, 45, -2.0F, -37.6F, -62.5F, 1, 1, 43, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}