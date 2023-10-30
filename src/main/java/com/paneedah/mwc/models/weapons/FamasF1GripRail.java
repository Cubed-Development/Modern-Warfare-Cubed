package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FamasF1GripRail extends ModelWithAttachments {
	private final ModelRenderer grip_rail;
	private final ModelRenderer cube_r163;
	private final ModelRenderer cube_r164;

	public FamasF1GripRail() {
		textureWidth = 256;
		textureHeight = 256;

		grip_rail = new ModelRenderer(this);
		grip_rail.setRotationPoint(0.0F, -7.7F, -36.0F);
		grip_rail.cubeList.add(new ModelBox(grip_rail, 133, 41, -3.0F, -1.0F, 0.0F, 3, 1, 11, 0.0F, false));
		grip_rail.cubeList.add(new ModelBox(grip_rail, 130, 127, -0.8F, -1.4F, -0.001F, 3, 1, 11, 0.0F, false));
		grip_rail.cubeList.add(new ModelBox(grip_rail, 85, 127, -5.2F, -1.4F, -0.001F, 3, 1, 11, 0.0F, false));
		grip_rail.cubeList.add(new ModelBox(grip_rail, 168, 169, -6.0F, -4.4F, 0.0F, 9, 2, 14, 0.0F, false));

		cube_r163 = new ModelRenderer(this);
		cube_r163.setRotationPoint(-5.6F, -2.4F, 0.0F);
		grip_rail.addChild(cube_r163);
		setRotationAngle(cube_r163, 0.0F, 0.0F, -0.1745F);
		cube_r163.cubeList.add(new ModelBox(cube_r163, 65, 52, 0.0F, 0.0F, 0.0F, 1, 2, 11, 0.0F, false));

		cube_r164 = new ModelRenderer(this);
		cube_r164.setRotationPoint(2.6F, -2.4F, 0.0F);
		grip_rail.addChild(cube_r164);
		setRotationAngle(cube_r164, 0.0F, 0.0F, 0.1745F);
		cube_r164.cubeList.add(new ModelBox(cube_r164, 69, 20, -1.0F, 0.0F, 0.0F, 1, 2, 11, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip_rail.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
