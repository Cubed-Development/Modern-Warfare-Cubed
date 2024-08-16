package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class JLTVM1280wheel extends ModelBase {
	private final ModelRenderer wheel5;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone33;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;

	public JLTVM1280wheel() {
		textureWidth = 512;
		textureHeight = 512;

		wheel5 = new ModelRenderer(this);
		wheel5.setRotationPoint(25.0F, 24.0F, 0.0F);
		wheel5.cubeList.add(new ModelBox(wheel5, 0, 0, 1.0F, -26.0F, -10.5F, 8, 21, 21, 0.0F, true));
		wheel5.cubeList.add(new ModelBox(wheel5, 287, 427, 0.0F, -22.4853F, 9.4853F, 10, 14, 6, 0.0F, true));
		wheel5.cubeList.add(new ModelBox(wheel5, 248, 216, 0.0F, -22.4853F, -15.4853F, 10, 14, 6, 0.0F, true));
		wheel5.cubeList.add(new ModelBox(wheel5, 119, 399, 0.0F, -6.0F, -7.0F, 10, 6, 14, 0.0F, true));
		wheel5.cubeList.add(new ModelBox(wheel5, 375, 398, 0.0F, -30.9706F, -7.0F, 10, 6, 14, 0.0F, true));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.5F, -15.5F, 0.0F);
		wheel5.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 113, 154, -3.5F, -3.5F, -3.5F, 10, 7, 7, 0.0F, true));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(0.0F, 0.0F, 6.0F);
		wheel5.addChild(bone33);
		setRotationAngle(bone33, 0.7854F, 0.0F, 0.0F);
		bone33.cubeList.add(new ModelBox(bone33, 249, 412, 0.01F, -5.2929F, 0.7071F, 10, 6, 12, 0.0F, true));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(0.0F, 0.0F, -6.0F);
		wheel5.addChild(bone34);
		setRotationAngle(bone34, -0.7854F, 0.0F, 0.0F);
		bone34.cubeList.add(new ModelBox(bone34, 249, 412, 0.01F, -5.2929F, -12.7071F, 10, 6, 12, 0.0F, true));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.0F, -26.0F, 6.0F);
		wheel5.addChild(bone35);
		setRotationAngle(bone35, -0.7854F, 0.0F, 0.0F);
		bone35.cubeList.add(new ModelBox(bone35, 339, 411, 0.01F, -4.2218F, -2.8076F, 10, 6, 12, 0.0F, true));
		bone35.cubeList.add(new ModelBox(bone35, 444, 105, 0.01F, 5.6777F, -12.7071F, 10, 12, 6, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		wheel5.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
