package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DeskRightAlt1 extends ModelBase implements IModernModel {
	private final ModelRenderer Desk;

	public DeskRightAlt1() {
		textureWidth = 256;
		textureHeight = 256;

		Desk = new ModelRenderer(this);
		Desk.setRotationPoint(0.0F, 24.0F, 0.0F);
		Desk.cubeList.add(new ModelBox(Desk, 0, 0, -2.0F, -11.5F, -6.5F, 8, 1, 1, 0.0F, true));
		Desk.cubeList.add(new ModelBox(Desk, 0, 0, -8.0F, -16.0F, 6.5F, 15, 15, 1, 0.0F, true));
		Desk.cubeList.add(new ModelBox(Desk, 0, 0, 6.9F, -16.0F, -6.5F, 1, 15, 14, 0.0F, true));
		Desk.cubeList.add(new ModelBox(Desk, 0, 0, -8.0F, -16.0F, -6.5F, 15, 1, 13, 0.0F, true));
		Desk.cubeList.add(new ModelBox(Desk, 0, 0, 6.0F, -15.95F, -6.6F, 2, 16, 2, 0.0F, true));
		Desk.cubeList.add(new ModelBox(Desk, 0, 0, -4.0F, -15.0F, -6.4F, 11, 8, 13, 0.0F, true));
		Desk.cubeList.add(new ModelBox(Desk, 0, 0, 6.0F, -15.95F, 5.6F, 2, 16, 2, 0.0F, true));
		Desk.cubeList.add(new ModelBox(Desk, 0, 0, -4.1F, -15.95F, -6.7F, 2, 16, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Desk.render(f5);
	}
}