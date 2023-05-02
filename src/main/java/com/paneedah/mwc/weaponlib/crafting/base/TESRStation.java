package com.paneedah.mwc.weaponlib.crafting.base;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class TESRStation<T extends TileEntityStation> extends TileEntitySpecialRenderer<T> {
	
	protected ModelBase model;
	protected ResourceLocation location;
	
	public TESRStation(ModelBase model, ResourceLocation location) {
		this.model = model;
		this.location = location;
	}
	
	@Override
	public void render(T te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
		// TODO Auto-generated method stub
		super.render(te, x, y, z, partialTicks, destroyStage, alpha);
	}

}
