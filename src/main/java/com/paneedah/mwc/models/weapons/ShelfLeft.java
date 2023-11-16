package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ShelfLeft extends ModelBase implements IModernModel {
	private final ModelRenderer bone;

	public ShelfLeft() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -8.1F, -16.0F, 3.1F, 2, 16, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -3.0F, -5.0F, 16, 2, 10, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -8.1F, -16.0F, -5.1F, 2, 16, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}
}