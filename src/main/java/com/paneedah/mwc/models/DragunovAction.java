package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DragunovAction extends ModelWithAttachments {
	private final QRenderer action;
	private final ModelRenderer cube_r97;
	private final ModelRenderer cube_r98;
	private final ModelRenderer cube_r99;
	private final ModelRenderer cube_r100;

	public DragunovAction() {
		textureWidth = 350;
		textureHeight = 350;

		action = new QRenderer(this);
		action.setRotationPoint(-3.5F, -11.75F, -22.0F);
		action.cubeList.add(new ModelBox(action, 46, 47, 0.3F, -1.0F, -20.0F, 1, 1, 20, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 46, 68, 0.0F, -1.0F, -19.5F, 1, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 0, 47, 0.3F, -1.5F, -20.0F, 1, 1, 20, -0.001F, false));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(0.3F, -1.5F, 0.0F);
		action.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.0F, 0.0F, 0.2443F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 0, 24, 0.0F, -2.0F, -20.0F, 1, 2, 20, -0.001F, false));

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(-2.3F, 0.0F, -18.6F);
		action.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.0F, 0.192F, 0.0F);
		cube_r98.cubeList.add(new ModelBox(cube_r98, 48, 44, 0.0F, -1.0F, 0.0F, 3, 1, 1, -0.001F, false));

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(0.0F, 0.0F, -16.5F);
		action.addChild(cube_r99);
		setRotationAngle(cube_r99, 0.0F, 0.3491F, 0.0F);
		cube_r99.cubeList.add(new ModelBox(cube_r99, 73, 39, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.002F, false));

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(0.0F, 0.0F, -19.5F);
		action.addChild(cube_r100);
		setRotationAngle(cube_r100, 0.0F, -0.5934F, 0.0F);
		cube_r100.cubeList.add(new ModelBox(cube_r100, 42, 44, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.001F, false));
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
