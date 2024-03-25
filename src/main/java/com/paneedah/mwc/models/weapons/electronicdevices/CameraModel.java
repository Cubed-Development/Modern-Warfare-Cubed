package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class CameraModel extends ModelBase implements IModernModel {
	private final ModelRenderer camaramodel;

	public CameraModel() {
		textureWidth = 64;
		textureHeight = 64;

		camaramodel = new ModelRenderer(this);
		camaramodel.setRotationPoint(0.0F, 24.0F, 0.0F);
		camaramodel.cubeList.add(new ModelBox(camaramodel, 0, 0, 0.5F, -24.5F, 0.5F, 3, 5, 3, 0.0F, true));
		camaramodel.cubeList.add(new ModelBox(camaramodel, 0, 0, 0.0F, -24.0F, 0.0F, 4, 4, 4, 0.0F, true));
		camaramodel.cubeList.add(new ModelBox(camaramodel, 0, 0, 0.5F, -23.5F, -0.5F, 3, 3, 5, 0.0F, true));
		camaramodel.cubeList.add(new ModelBox(camaramodel, 0, 0, -0.5F, -23.5F, 0.5F, 5, 3, 3, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		camaramodel.render(f5);
	}
}