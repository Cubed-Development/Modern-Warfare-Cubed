package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PechenegBipod extends ModelWithAttachments {
	private final ModelRenderer PechenegBipod;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public PechenegBipod() {
		textureWidth = 400;
		textureHeight = 400;

		PechenegBipod = new ModelRenderer(this);
		PechenegBipod.setRotationPoint(-1.4767F, -7.8409F, -79.0F);
		PechenegBipod.cubeList.add(new ModelBox(PechenegBipod, 152, 133, -0.8733F, -3.1091F, -2.0F, 1, 1, 4, 0.0F, false));
		PechenegBipod.cubeList.add(new ModelBox(PechenegBipod, 140, 147, -0.5733F, -3.3091F, -2.0F, 1, 1, 4, 0.0F, false));
		PechenegBipod.cubeList.add(new ModelBox(PechenegBipod, 0, 145, 0.1267F, -3.1091F, -2.0F, 1, 1, 4, 0.0F, false));
		PechenegBipod.cubeList.add(new ModelBox(PechenegBipod, 144, 102, -0.1733F, -3.3091F, -2.0F, 1, 1, 4, 0.0F, false));
		PechenegBipod.cubeList.add(new ModelBox(PechenegBipod, 144, 88, -0.8733F, -2.0091F, -2.0F, 1, 1, 4, 0.0F, false));
		PechenegBipod.cubeList.add(new ModelBox(PechenegBipod, 79, 13, 0.1267F, -2.0091F, 1.0F, 1, 2, 1, 0.0F, false));
		PechenegBipod.cubeList.add(new ModelBox(PechenegBipod, 64, 22, -0.8733F, -2.0091F, 1.0F, 1, 2, 1, 0.0F, false));
		PechenegBipod.cubeList.add(new ModelBox(PechenegBipod, 64, 8, 0.1267F, -2.0091F, -2.0F, 1, 2, 1, 0.0F, false));
		PechenegBipod.cubeList.add(new ModelBox(PechenegBipod, 51, 58, -0.8733F, -2.0091F, -2.0F, 1, 2, 1, 0.0F, false));
		PechenegBipod.cubeList.add(new ModelBox(PechenegBipod, 144, 83, -0.5733F, -1.8091F, -2.0F, 1, 1, 4, 0.0F, false));
		PechenegBipod.cubeList.add(new ModelBox(PechenegBipod, 144, 26, 0.1267F, -2.0091F, -2.0F, 1, 1, 4, 0.0F, false));
		PechenegBipod.cubeList.add(new ModelBox(PechenegBipod, 144, 19, -0.1733F, -1.8091F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.3267F, -1.8091F, 12.5F);
		PechenegBipod.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 144, 31, -0.5F, -1.0F, -14.5F, 1, 1, 4, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.1267F, -1.0091F, 0.5F);
		PechenegBipod.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.48F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 209, -1.0F, -1.0F, 0.0F, 1, 44, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 117, 211, -1.0F, -1.0F, -2.0F, 1, 44, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 152, -2.0F, 43.0F, -5.0F, 4, 1, 9, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 209, 0.0F, -1.0F, -2.0F, 1, 44, 3, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.8267F, -1.0091F, 0.5F);
		PechenegBipod.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.48F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 128, -4.5F, 44.0F, -5.0F, 4, 1, 9, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.1267F, -1.0091F, 0.5F);
		PechenegBipod.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.48F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 260, 0, 0.0F, -1.0F, -2.0F, 1, 44, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 264, 0, 0.0F, -1.0F, 0.0F, 1, 44, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 109, 211, -1.0F, -1.0F, -2.0F, 1, 44, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.0733F, -1.8091F, 12.5F);
		PechenegBipod.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -1.5708F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 144, 97, -0.5F, -1.0F, -14.5F, 1, 1, 4, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.3267F, -2.3091F, 12.5F);
		PechenegBipod.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -1.5708F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 145, -0.5F, 0.0F, -14.5F, 1, 1, 4, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.0733F, -2.3091F, 12.5F);
		PechenegBipod.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 1.5708F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 153, 153, -0.5F, 0.0F, -14.5F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		PechenegBipod.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
