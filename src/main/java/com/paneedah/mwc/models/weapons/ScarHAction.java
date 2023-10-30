package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ScarHAction extends ModelWithAttachments {
	private final ModelRenderer action;

	public ScarHAction() {
		textureWidth = 300;
		textureHeight = 300;

		action = new ModelRenderer(this);
		action.setRotationPoint(-0.25F, -15.7F, -45.0F);
		action.cubeList.add(new ModelBox(action, 197, 160, -1.0F, -2.0F, -2.0F, 1, 2, 31, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 90, 76, -0.5F, -1.35F, 11.8F, 3, 1, 1, -0.05F, false));
		action.cubeList.add(new ModelBox(action, 96, 73, -0.5F, -1.35F, 11.8F, 1, 1, 1, 0.05F, false));
		action.cubeList.add(new ModelBox(action, 34, 103, 1.9F, -0.95F, 11.4F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 22, 103, 1.9F, -0.95F, 11.8F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 28, 103, 1.9F, -0.95F, 12.2F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 4, 103, 1.9F, -1.75F, 11.8F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 10, 103, 1.9F, -1.75F, 11.4F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 16, 103, 1.9F, -1.75F, 12.2F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 49, 98, 1.9F, -1.35F, 12.2F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 97, 77, 1.9F, -1.35F, 11.4F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 100, 166, -2.5F, -2.0F, -2.0F, 1, 2, 31, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 26, 0, -3.3F, 1.5F, 19.0F, 1, 2, 12, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
