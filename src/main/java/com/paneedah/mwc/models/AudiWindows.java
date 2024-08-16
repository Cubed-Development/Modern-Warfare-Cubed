package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AudiWindows extends ModelBase {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public AudiWindows() {
		textureWidth = 512;
		textureHeight = 512;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-31.5F, -38.5696F, 95.2786F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.1345F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 397, -25.5F, -14.5F, 0.0F, 51, 29, 0, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-55.55F, -38.0F, 59.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.5672F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 344, 0.0F, -8.0F, -48.0F, 0, 19, 91, 0.0F, true));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-7.0F, -38.0F, 59.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.5672F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 344, 0.0F, -8.0F, -48.0F, 0, 19, 91, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-32.0F, -34.6366F, 19.6412F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, -1.0472F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 397, -25.0F, -19.5F, -0.5F, 51, 29, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		
		//System.out.println("fuck off");
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
