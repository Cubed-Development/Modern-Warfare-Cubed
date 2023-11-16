package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class GunRack extends ModelBase implements IModernModel {
	private final ModelRenderer bone;

	public GunRack() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 187, 117, -2.0F, -48.0F, 28.0F, 11, 44, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 187, 117, -2.0F, -48.0F, -19.0F, 11, 44, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 61, 10.5F, -48.0F, -17.0F, 0, 44, 43, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 52, 10.0F, -32.0F, 22.5F, 1, 11, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 83, 40, -1.0F, -39.0F, -15.0F, 7, 2, 7, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 83, 71, -1.0F, -39.0F, -7.0F, 7, 2, 7, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 83, 83, -2.0F, -35.0F, -11.0F, 10, 4, 12, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 86, 104, -2.0F, -23.0F, -12.0F, 6, 4, 13, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 72, -2.0F, -29.0F, -17.0F, 10, 4, 12, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 52, -2.0F, -17.0F, -16.0F, 8, 4, 16, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 88, 0.0F, -11.0F, -9.0F, 7, 4, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 28, 168, -2.0F, -24.0F, 21.0F, 6, 20, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 14, 168, -2.0F, -24.0F, 18.0F, 6, 20, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 163, 0, -2.0F, -24.0F, 12.0F, 6, 20, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 48, 163, -2.0F, -24.0F, 8.75F, 6, 20, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 32, 52, -2.0F, -41.0F, 21.0F, 6, 4, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 32, 57, -2.0F, -41.0F, 18.0F, 6, 4, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 32, 72, -2.0F, -41.0F, 12.0F, 6, 4, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 83, 0, -2.0F, -41.0F, 9.25F, 6, 4, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 123, 41, -2.0F, -37.0F, -17.0F, 11, 1, 18, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 123, 22, -2.0F, -31.0F, -17.0F, 11, 1, 18, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 83, 21, -2.0F, -25.0F, -17.0F, 11, 1, 18, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 83, 52, -2.0F, -19.0F, -17.0F, 11, 1, 18, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 123, 3, -2.0F, -13.0F, -17.0F, 11, 1, 18, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 83, 0, -2.0F, -7.0F, -17.0F, 11, 3, 18, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -48.0F, 1.0F, 10, 44, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 89, 89, -3.0F, -48.0F, -17.0F, 1, 44, 43, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 24, 0, -5.0F, -48.0F, 26.0F, 3, 44, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 36, 0, 9.0F, -48.0F, 26.0F, 3, 44, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 134, 79, 9.0F, -48.0F, -20.0F, 3, 44, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 146, 79, -5.0F, -48.0F, -20.0F, 3, 44, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -5.0F, -51.0F, -20.0F, 17, 3, 49, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 52, -5.0F, -4.0F, -20.0F, 17, 3, 49, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}
}
