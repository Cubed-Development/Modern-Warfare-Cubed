package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class NinthSinRegulatorActionLower extends ModelWithAttachments {
	private final ModelRenderer regulatorlower_lower_EXTRA7;

	public NinthSinRegulatorActionLower() {
		textureWidth = 128;
		textureHeight = 128;

		regulatorlower_lower_EXTRA7 = new ModelRenderer(this);
		regulatorlower_lower_EXTRA7.setRotationPoint(7.0F, 10.1F, -18.5F);
		setRotationAngle(regulatorlower_lower_EXTRA7, 0.6632F, 0.0F, 0.0F);
		regulatorlower_lower_EXTRA7.cubeList.add(new ModelBox(regulatorlower_lower_EXTRA7, 100, 64, -1.0F, -1.0F, -4.0F, 1, 1, 4, -0.1F, false));
		regulatorlower_lower_EXTRA7.cubeList.add(new ModelBox(regulatorlower_lower_EXTRA7, 100, 59, -1.0F, -2.0F, -4.0F, 1, 1, 4, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		regulatorlower_lower_EXTRA7.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}