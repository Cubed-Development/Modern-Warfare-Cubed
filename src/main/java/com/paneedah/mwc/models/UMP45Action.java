package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UMP45Action extends ModelWithAttachments {
	
	private final QRenderer action;
	private final ModelRenderer cube_r78;
	private final ModelRenderer cube_r79;

	public UMP45Action() {
		textureWidth = 200;
		textureHeight = 200;

		action = new QRenderer(this);
		action.setRotationPoint(0.25F, -16.05F, -40.5F);
		action.cubeList.add(new ModelBox(action, 26, 90, -1.0F, -1.1F, 0.0F, 1, 1, 12, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 40, 43, 1.3F, -1.1F, 0.0F, 1, 1, 1, 0.01F, false));
		action.cubeList.add(new ModelBox(action, 24, 36, -0.65F, -1.1F, 0.2F, 2, 1, 1, -0.1F, false));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(0.0F, -1.1F, 9.0F);
		action.addChild(cube_r78);
		setRotationAngle(cube_r78, 0.0F, 0.0F, -0.7854F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 89, 101, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(2.3F, -0.1F, 0.0F);
		action.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.0F, 0.2094F, 0.0F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 30, 36, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));
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
