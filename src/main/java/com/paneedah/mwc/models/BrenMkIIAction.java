package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BrenMkIIAction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer Action2_r1;

	public BrenMkIIAction() {
		textureWidth = 256;
		textureHeight = 256;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 0, 0, -1.6F, -22.0F, 16.0F, 1, 2, 4, 0.0F, true));

		Action2_r1 = new ModelRenderer(this);
		Action2_r1.setRotationPoint(3.2186F, 0.0F, 1.193F);
		action.addChild(Action2_r1);
		setRotationAngle(Action2_r1, 0.0F, -0.2082F, 0.0F);
		Action2_r1.cubeList.add(new ModelBox(Action2_r1, 0, 0, -4.1F, -22.0F, 16.0F, 3, 2, 2, 0.0F, true));
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