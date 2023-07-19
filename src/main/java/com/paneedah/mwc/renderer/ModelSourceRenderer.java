package com.paneedah.mwc.renderer;

import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public abstract class ModelSourceRenderer implements IBakedModel {

	private ModelResourceLocation resourceLocation;

	public ModelResourceLocation getResourceLocation() {
		return resourceLocation;
	}

	public void setResourceLocation(ModelResourceLocation resourceLocation) {
		this.resourceLocation = resourceLocation;
	}
}
