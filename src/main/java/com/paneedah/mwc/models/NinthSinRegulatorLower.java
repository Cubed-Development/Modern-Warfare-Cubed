package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class NinthSinRegulatorLower extends ModelWithAttachments {
	private final ModelRenderer regulator_lower_EXTRA4;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;

	public NinthSinRegulatorLower() {
		textureWidth = 128;
		textureHeight = 128;

		regulator_lower_EXTRA4 = new ModelRenderer(this);
		regulator_lower_EXTRA4.setRotationPoint(6.25F, 10.0F, -22.0F);
		regulator_lower_EXTRA4.cubeList.add(new ModelBox(regulator_lower_EXTRA4, 9, 40, -1.001F, -0.75F, 1.5F, 1, 3, 3, 0.0F, false));
		regulator_lower_EXTRA4.cubeList.add(new ModelBox(regulator_lower_EXTRA4, 27, 13, -1.001F, -0.75F, 4.4F, 1, 3, 1, 0.0F, false));
		regulator_lower_EXTRA4.cubeList.add(new ModelBox(regulator_lower_EXTRA4, 60, 17, -1.001F, 0.25F, 5.4F, 1, 2, 3, 0.0F, false));
		regulator_lower_EXTRA4.cubeList.add(new ModelBox(regulator_lower_EXTRA4, 90, 108, -0.251F, 0.45F, 3.3F, 1, 1, 5, 0.0F, false));
		regulator_lower_EXTRA4.cubeList.add(new ModelBox(regulator_lower_EXTRA4, 9, 66, -0.051F, 0.35F, 5.6F, 1, 1, 1, 0.0F, false));
		regulator_lower_EXTRA4.cubeList.add(new ModelBox(regulator_lower_EXTRA4, 25, 58, -1.0F, 0.25F, 8.1F, 1, 1, 2, 0.0F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(0.0F, 2.25F, 8.4F);
		regulator_lower_EXTRA4.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.5236F, 0.0F, 0.0F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 33, 58, -1.001F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(0.75F, 1.45F, 3.3F);
		regulator_lower_EXTRA4.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.0F, 0.0F, -0.6632F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 64, 10, -1.001F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(0.95F, 0.35F, 5.6F);
		regulator_lower_EXTRA4.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.0F, 0.0F, 0.4363F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 66, -1.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.0F, 2.25F, 1.5F);
		regulator_lower_EXTRA4.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.6545F, 0.0F, 0.0F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 54, 75, -1.0F, -3.0F, 0.0F, 1, 3, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		regulator_lower_EXTRA4.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}