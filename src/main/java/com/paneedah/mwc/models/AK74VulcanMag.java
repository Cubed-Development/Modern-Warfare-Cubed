package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class AK74VulcanMag extends ModelBase {
	private final ModelRenderer Magazine1;
	private final ModelRenderer Magazine4;
	private final ModelRenderer Magazine5;
	private final ModelRenderer Magazine7;

	public AK74VulcanMag() {
		textureWidth = 64;
		textureHeight = 64;

		Magazine1 = new ModelRenderer(this);
		Magazine1.setRotationPoint(-3.5F, -8.0F, -25.0F);
		setRotationAngle(Magazine1, -0.1859F, 0.0F, 0.0F);
		Magazine1.cubeList.add(new ModelBox(Magazine1, 21, 25, 0.01F, 0.0F, 0.0F, 4, 11, 7, 0.0F, false));

		Magazine4 = new ModelRenderer(this);
		Magazine4.setRotationPoint(-3.5F, 4.0F, -20.1F);
		setRotationAngle(Magazine4, -2.082F, 0.0F, 0.0F);
		Magazine4.cubeList.add(new ModelBox(Magazine4, 0, 0, 0.0F, 0.0F, 0.0F, 4, 7, 12, 0.0F, false));

		Magazine5 = new ModelRenderer(this);
		Magazine5.setRotationPoint(-3.0F, -8.3F, -26.6F);
		setRotationAngle(Magazine5, -0.1859F, 0.0F, 0.0F);
		Magazine5.cubeList.add(new ModelBox(Magazine5, 0, 32, 0.0F, 0.0F, 0.0F, 3, 11, 2, 0.0F, false));

		Magazine7 = new ModelRenderer(this);
		Magazine7.setRotationPoint(-3.0F, 1.6F, -26.5F);
		setRotationAngle(Magazine7, -2.082F, 0.0F, 0.0F);
		Magazine7.cubeList.add(new ModelBox(Magazine7, 0, 19, 0.0F, 0.0F, 0.0F, 3, 2, 11, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Magazine1.render(f5);
		Magazine4.render(f5);
		Magazine5.render(f5);
		Magazine7.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
