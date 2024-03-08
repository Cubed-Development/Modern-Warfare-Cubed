package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziAction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action3_r1_r1;

	public UziAction() {
		textureWidth = 240;
		textureHeight = 240;

		action = new ModelRenderer(this);
		action.setRotationPoint(26.2399F, 10.1487F, 0.0F);
		action.cubeList.add(new ModelBox(action, 54, 0, -29.7399F, -23.9487F, -8.5F, 1, 3, 6, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 88, 72, -29.8399F, -24.7487F, -8.5F, 1, 1, 6, 0.0F, false));

		action3_r1_r1 = new ModelRenderer(this);
		action3_r1_r1.setRotationPoint(-8.76F, 28.3488F, 0.0F);
		action.addChild(action3_r1_r1);
		setRotationAngle(action3_r1_r1, 0.0F, 0.0F, -0.7854F);
		action3_r1_r1.cubeList.add(new ModelBox(action3_r1_r1, 88, 65, 22.6399F, -52.4513F, -8.5F, 1, 1, 6, 0.0F, false));
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