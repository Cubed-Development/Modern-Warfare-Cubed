package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PoliceBaton extends ModelWithAttachments {
	private final ModelRenderer bone;

	public PoliceBaton() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -69.0F, 0.0F, 3, 47, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 3.0F, -26.0F, 0.0F, 14, 3, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 17.0F, -27.0F, -0.5F, 2, 5, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.5F, -70.0F, 0.5F, 2, 1, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.5F, -10.0F, 0.5F, 2, 1, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -21.0F, 0.0F, 3, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -19.0F, 0.0F, 3, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -17.0F, 0.0F, 3, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -15.0F, 0.0F, 3, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -13.0F, 0.0F, 3, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -11.0F, 0.0F, 3, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.5F, -22.0F, 0.5F, 2, 11, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}