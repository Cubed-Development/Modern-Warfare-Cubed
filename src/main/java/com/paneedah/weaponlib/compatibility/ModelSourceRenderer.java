package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public abstract class ModelSourceRenderer implements IBakedModel {
	private ModelResourceLocation resourceLocation;

	public ModelResourceLocation getResourceLocation() {
		return resourceLocation;
	}

	public void setResourceLocation(ModelResourceLocation resourceLocation) {
		this.resourceLocation = resourceLocation;
	}

}
