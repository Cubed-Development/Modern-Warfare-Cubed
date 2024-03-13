package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class NinthSinCycleFront extends ModelWithAttachments {
	private final ModelRenderer cycler_front_RECEIVER;
	private final ModelRenderer cube_r63;
	private final ModelRenderer cube_r64;

	public NinthSinCycleFront() {
		textureWidth = 128;
		textureHeight = 128;

		cycler_front_RECEIVER = new ModelRenderer(this);
		cycler_front_RECEIVER.setRotationPoint(0.0F, -2.0F, -10.0F);
		cycler_front_RECEIVER.cubeList.add(new ModelBox(cycler_front_RECEIVER, 40, 19, -0.25F, 0.498F, -4.0F, 1, 1, 7, 0.0F, false));
		cycler_front_RECEIVER.cubeList.add(new ModelBox(cycler_front_RECEIVER, 52, 91, -1.0F, 0.5F, -2.0F, 2, 1, 4, 0.0F, false));
		cycler_front_RECEIVER.cubeList.add(new ModelBox(cycler_front_RECEIVER, 0, 49, -0.75F, 0.499F, -4.0F, 1, 1, 7, 0.0F, false));
		cycler_front_RECEIVER.cubeList.add(new ModelBox(cycler_front_RECEIVER, 61, 37, -1.0F, 0.5F, -5.0F, 2, 1, 1, 0.0F, false));
		cycler_front_RECEIVER.cubeList.add(new ModelBox(cycler_front_RECEIVER, 42, 52, -1.0F, 0.5F, 3.0F, 2, 1, 2, 0.0F, false));
		cycler_front_RECEIVER.cubeList.add(new ModelBox(cycler_front_RECEIVER, 80, 107, 1.5F, 1.5F, -5.0F, 1, 1, 8, 0.0F, false));
		cycler_front_RECEIVER.cubeList.add(new ModelBox(cycler_front_RECEIVER, 106, 35, -2.5F, 1.5F, -5.0F, 1, 1, 8, 0.0F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(1.0F, 0.5F, 3.0F);
		cycler_front_RECEIVER.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, 0.0F, -0.6981F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 49, 19, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 100, 59, -0.999F, 0.5F, -8.0F, 1, 1, 10, 0.0F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 46, 67, -1.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 36, 91, -1.0F, 0.0F, -5.0F, 1, 1, 4, 0.0F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(-1.0F, 0.5F, 3.0F);
		cycler_front_RECEIVER.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.0F, 0.0F, 0.6981F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 49, 22, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 100, -0.001F, 0.5F, -8.0F, 1, 1, 10, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 92, 19, 0.0F, 0.0F, -5.0F, 1, 1, 4, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 67, 5, 0.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		cycler_front_RECEIVER.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}