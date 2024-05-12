package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Beowulf50CalReceiver extends ModelWithAttachments {
	private final ModelRenderer receiver;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public Beowulf50CalReceiver() {
		textureWidth = 256;
		textureHeight = 256;

		receiver = new ModelRenderer(this);
		receiver.setRotationPoint(2.0F, -13.0F, -22.7F);
		receiver.cubeList.add(new ModelBox(receiver, 0, 147, -2.2F, -1.35F, 0.0F, 1, 1, 24, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 19, 19, -5.8F, -1.35F, 0.0F, 1, 2, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 14, 78, -6.0F, -1.55F, 11.15F, 1, 1, 6, -0.2F, false));
		receiver.cubeList.add(new ModelBox(receiver, 17, 39, -2.199F, -0.4F, 0.0F, 1, 1, 9, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 0, -5.899F, -0.3F, 1.9F, 1, 1, 16, -0.1F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 0, -5.8F, -1.35F, 16.9F, 1, 2, 7, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 12, 59, -2.199F, -0.4F, 12.0F, 1, 1, 12, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.2F, 0.6F, 11.95F);
		receiver.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.8116F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 56, -0.999F, 0.0F, 0.05F, 1, 1, 12, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 0, -0.999F, 0.0F, -11.95F, 1, 1, 9, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-5.8F, 0.6F, -0.05F);
		receiver.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.8116F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 129, 145, 0.001F, 0.0F, 0.05F, 1, 1, 24, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-5.8F, -1.35F, -0.05F);
		receiver.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.9948F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 55, 0, -0.001F, -2.0F, 2.05F, 1, 1, 10, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 18, 0.0F, -2.0F, 11.45F, 1, 2, 13, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 7, 17, 0.0F, -2.0F, 0.05F, 1, 2, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.2F, -1.35F, -0.05F);
		receiver.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.9948F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 124, 119, -1.0F, -2.0F, 0.05F, 1, 2, 24, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		receiver.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
