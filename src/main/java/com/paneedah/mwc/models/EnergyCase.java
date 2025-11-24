package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class EnergyCase extends ModelBase implements IModernModel {
	private final ModelRenderer bone;

	public EnergyCase() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.5F, -24.0F, 0.0F, 2, 8, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.6F, -20.0F, 0.1F, 1, 4, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.0F, -24.0F, -0.1F, 1, 8, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.4F, -20.0F, 0.1F, 1, 4, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.0F, -24.3F, 0.1F, 1, 6, 3, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}
}