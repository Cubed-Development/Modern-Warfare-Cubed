package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M60Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r1;

	public M60Action() {
		textureWidth = 850;
		textureHeight = 850;

		action = new ModelRenderer(this);
		action.setRotationPoint(-1.0F, -11.0F, -3.0F);
		action.cubeList.add(new ModelBox(action, 312, 138, -3.2F, -1.3F, -13.0F, 1, 1, 32, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 312, 104, -3.2F, -2.5F, -13.0F, 1, 2, 32, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 208, 310, -2.2F, -7.5F, -15.0F, 4, 3, 32, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 51, 131, -0.7F, -4.5F, 8.0F, 2, 3, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.7F, -1.5F, -12.0F);
		action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 104, 39, -7.0F, -1.8F, -1.875F, 7, 2, 2, -0.4F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 104, 132, -7.3F, -1.8F, -1.875F, 1, 2, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 135, 12, -1.0F, -1.8F, -1.875F, 1, 2, 2, 0.0F, false));
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
