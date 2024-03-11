package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PP1901Action extends ModelWithAttachments {
	private final ModelRenderer Action;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public PP1901Action() {
		textureWidth = 256;
		textureHeight = 256;

		Action = new ModelRenderer(this);
		Action.setRotationPoint(-4.5059F, -13.4141F, -20.1211F);
		Action.cubeList.add(new ModelBox(Action, 64, 99, 1.1738F, -0.0859F, -4.668F, 2, 1, 13, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.0698F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 147, 6, -1.4746F, -0.1914F, -0.5F, 2, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 74, 94, -1.0254F, -0.168F, -0.5F, 3, 1, 1, -0.1F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.4804F, -0.6271F, -1.668F);
		Action.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3927F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 128, -1.0F, -2.0F, -3.0F, 2, 3, 11, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}