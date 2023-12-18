package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KBP9A91Action extends ModelWithAttachments {
	private final ModelRenderer Action;
	private final ModelRenderer cube_r142;
	private final ModelRenderer cube_r143;
	private final ModelRenderer cube_r144;
	private final ModelRenderer cube_r145;
	private final ModelRenderer cube_r146;
	private final ModelRenderer cube_r147;

	public KBP9A91Action() {
		textureWidth = 220;
		textureHeight = 220;

		Action = new ModelRenderer(this);
		Action.setRotationPoint(-2.45F, -11.2F, -29.5F);
		Action.cubeList.add(new ModelBox(Action, 149, 29, -1.0F, -2.1F, 0.0F, 1, 2, 11, 0.0F, false));
		Action.cubeList.add(new ModelBox(Action, 26, 63, -1.8F, -1.2F, -0.001F, 2, 1, 1, 0.0F, false));
		Action.cubeList.add(new ModelBox(Action, 7, 63, -1.8F, -1.2F, 3.5F, 2, 1, 1, 0.0F, false));
		Action.cubeList.add(new ModelBox(Action, 47, 57, -3.7F, -1.2F, 1.0F, 2, 1, 1, 0.0F, false));
		Action.cubeList.add(new ModelBox(Action, 7, 23, -1.0F, -2.0F, 12.0F, 1, 2, 2, 0.0F, false));

		cube_r142 = new ModelRenderer(this);
		cube_r142.setRotationPoint(-0.6F, -2.1F, 0.0F);
		Action.addChild(cube_r142);
		setRotationAngle(cube_r142, 0.0F, 0.0F, -1.2392F);
		cube_r142.cubeList.add(new ModelBox(cube_r142, 152, 86, 0.0F, 0.0F, 0.0F, 2, 1, 11, 0.0F, false));

		cube_r143 = new ModelRenderer(this);
		cube_r143.setRotationPoint(-1.0F, -2.1F, 0.0F);
		Action.addChild(cube_r143);
		setRotationAngle(cube_r143, 0.0F, 0.0F, -0.7505F);
		cube_r143.cubeList.add(new ModelBox(cube_r143, 152, 123, 0.0F, 0.0F, 0.0F, 2, 1, 11, 0.0F, false));

		cube_r144 = new ModelRenderer(this);
		cube_r144.setRotationPoint(0.2F, 0.8F, 2.7F);
		Action.addChild(cube_r144);
		setRotationAngle(cube_r144, 0.0F, 0.0F, -0.1745F);
		cube_r144.cubeList.add(new ModelBox(cube_r144, 104, 48, -1.6F, -2.4F, -2.0F, 1, 1, 3, 0.0F, false));

		cube_r145 = new ModelRenderer(this);
		cube_r145.setRotationPoint(-1.8F, -1.2F, 0.0F);
		Action.addChild(cube_r145);
		setRotationAngle(cube_r145, 0.0F, -0.7592F, 0.0F);
		cube_r145.cubeList.add(new ModelBox(cube_r145, 96, 108, 0.1F, 0.201F, -0.2F, 1, 1, 2, -0.203F, false));
		cube_r145.cubeList.add(new ModelBox(cube_r145, 90, 108, 0.1F, -0.199F, -0.2F, 1, 1, 2, -0.202F, false));
		cube_r145.cubeList.add(new ModelBox(cube_r145, 108, 108, -0.2F, -0.199F, -0.2F, 1, 1, 2, -0.2F, false));
		cube_r145.cubeList.add(new ModelBox(cube_r145, 102, 108, -0.2F, 0.201F, -0.2F, 1, 1, 2, -0.201F, false));

		cube_r146 = new ModelRenderer(this);
		cube_r146.setRotationPoint(-1.8F, -1.2F, 4.5F);
		Action.addChild(cube_r146);
		setRotationAngle(cube_r146, 0.0F, 0.2007F, 0.0F);
		cube_r146.cubeList.add(new ModelBox(cube_r146, 104, 36, -0.2F, -0.199F, -2.8F, 1, 1, 3, -0.2F, false));
		cube_r146.cubeList.add(new ModelBox(cube_r146, 104, 40, -0.2F, 0.201F, -2.8F, 1, 1, 3, -0.201F, false));

		cube_r147 = new ModelRenderer(this);
		cube_r147.setRotationPoint(-3.7F, -1.2F, 2.0F);
		Action.addChild(cube_r147);
		setRotationAngle(cube_r147, 0.0F, 0.8552F, 0.0F);
		cube_r147.cubeList.add(new ModelBox(cube_r147, 121, 42, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.001F, false));
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