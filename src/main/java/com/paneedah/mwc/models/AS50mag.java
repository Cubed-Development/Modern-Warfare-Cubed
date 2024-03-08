package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AS50mag extends ModelWithAttachments {
	private final ModelRenderer magazine;
	private final ModelRenderer Mag1_r1;

	public AS50mag() {
		textureWidth = 352;
		textureHeight = 352;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.0F, 24.0F, 0.0F);
		magazine.cubeList.add(new ModelBox(magazine, 84, 37, -4.0F, -31.3F, -29.0F, 4, 11, 10, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 125, -4.5F, -31.3F, -36.0F, 5, 10, 7, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 84, 116, -4.5F, -31.3F, -27.5F, 5, 11, 7, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 35, -4.5F, -31.3F, -19.0F, 5, 12, 1, 0.0F, false));

		Mag1_r1 = new ModelRenderer(this);
		Mag1_r1.setRotationPoint(-4.0F, 18.0924F, -4.9886F);
		magazine.addChild(Mag1_r1);
		setRotationAngle(Mag1_r1, -0.1571F, 0.0F, 0.0F);
		Mag1_r1.cubeList.add(new ModelBox(Mag1_r1, 84, 145, -0.5F, -36.0F, -36.7F, 5, 2, 18, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}