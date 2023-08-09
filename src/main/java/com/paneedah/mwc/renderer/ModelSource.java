package com.paneedah.mwc.renderer;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Getter
@Setter
@SideOnly(Side.CLIENT)
public abstract class ModelSource implements IBakedModel {

	private ModelResourceLocation modelResourceLocation;
}
