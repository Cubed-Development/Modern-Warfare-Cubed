package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ServerRackLeftAlt extends ModelBase implements IModernModel {
	private final ModelRenderer bone;

	public ServerRackLeftAlt() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 100, 90, -2.5F, -9.0F, -5.5F, 1, 5, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -4.0F, -6.0F, 16, 2, 13, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -8.2F, -16.0F, -6.1F, 2, 16, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -8.2F, -16.0F, 5.1F, 2, 16, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 50, -8.1F, -16.0F, -4.1F, 1, 15, 9, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -7.2F, -6.0F, -5.0F, 15, 2, 11, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -7.2F, -9.0F, -5.0F, 15, 2, 11, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -7.2F, -12.0F, -5.0F, 15, 2, 11, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -7.2F, -15.0F, -5.0F, 15, 2, 11, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 0, -7.2F, -13.0F, -4.8F, 15, 7, 11, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 50, -5.2F, -14.5F, -5.2F, 2, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 50, -2.2F, -14.5F, -5.2F, 2, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 50, 0.8F, -14.5F, -5.2F, 2, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 50, 3.8F, -14.5F, -5.2F, 2, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 50, -5.2F, -11.5F, -5.2F, 2, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 50, -2.2F, -11.5F, -5.2F, 2, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 50, 0.8F, -11.5F, -5.2F, 2, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 50, 3.8F, -11.5F, -5.2F, 2, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 70, -5.2F, -9.2F, -5.3F, 5, 5, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 90, -5.0F, -9.0F, -5.5F, 1, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 90, -5.0F, -7.0F, -5.5F, 1, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 100, 90, -5.0F, -5.4F, -5.4F, 2, 1, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}
}