package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M60Mag extends ModelWithAttachments {
	private final ModelRenderer magazine;

	public M60Mag() {
		textureWidth = 340;
		textureHeight = 340;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(-1.0F, 2.0F, -53.0F);
		magazine.cubeList.add(new ModelBox(magazine, 218, 140, 12.0F, -17.8F, 38.0F, 10, 3, 8, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 116, 48, 6.0F, -17.8F, 37.1F, 16, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 60, 50, 6.0F, -17.8F, 45.9F, 16, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 116, 34, 6.0F, -17.8F, 38.0F, 1, 3, 8, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 25, 6.0F, -14.0F, 37.0F, 16, 14, 10, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 168, 133, 7.0F, -15.0F, 37.0F, 14, 1, 10, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 60, 0, 5.0F, -17.5F, 37.0F, 1, 4, 10, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 147, 65, 5.0F, -17.5F, 46.3F, 6, 4, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 120, 145, 5.0F, -11.5F, 36.5F, 6, 4, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 56, 56, 5.0F, -11.5F, 37.0F, 1, 4, 10, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 8, 135, 5.0F, -11.5F, 46.4F, 6, 4, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 49, 5.0F, -17.5F, 36.7F, 17, 4, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 168, 144, 10.2F, -18.0F, 37.0F, 12, 1, 10, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, 21.7F, -18.0F, 37.0F, 1, 8, 10, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 86, 14, 10.7F, -18.0F, 46.5F, 12, 8, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 82, 101, 10.7F, -18.0F, 36.5F, 12, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}