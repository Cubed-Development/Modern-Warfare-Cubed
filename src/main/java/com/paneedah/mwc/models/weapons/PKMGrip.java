package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMGrip extends ModelWithAttachments {
	private final ModelRenderer Grip;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer Grip16;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public PKMGrip() {
		textureWidth = 400;
		textureHeight = 400;

		Grip = new ModelRenderer(this);
		Grip.setRotationPoint(-0.9F, -5.0F, -3.0F);
		Grip.cubeList.add(new ModelBox(Grip, 102, 48, -2.5F, -2.0F, -4.0F, 4, 2, 7, 0.0F, false));
		Grip.cubeList.add(new ModelBox(Grip, 34, 9, -2.5F, 11.4F, 0.8F, 4, 1, 2, 0.0F, false));
		Grip.cubeList.add(new ModelBox(Grip, 122, 16, -2.5F, 11.4F, 0.7F, 4, 1, 1, -0.001F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, 11.9F, 1.2F);
		Grip.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 172, 81, -3.0F, -2.15F, -1.15F, 4, 2, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, 11.9F, 1.2F);
		Grip.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.8727F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 72, 98, -3.0F, -0.3F, -0.9F, 4, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.5F, 11.5255F, 4.1235F);
		Grip.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.8727F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 82, 98, -3.0F, 0.3F, 0.95F, 4, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 102, 45, -3.0F, 0.3F, 1.15F, 4, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.5F, 0.0F, 0.0F);
		Grip.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 168, 146, -3.0F, 11.7F, -0.5F, 4, 1, 3, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 99, -3.0F, -1.0F, -2.5F, 4, 13, 6, -0.002F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 52, -3.0F, -0.55F, -3.85F, 4, 1, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 53, -3.0F, -1.05F, -3.85F, 4, 1, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.5F, 0.0F, 0.0F);
		Grip.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.4363F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 130, 115, -3.0F, -2.85F, 2.525F, 4, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 172, 86, -3.0F, -2.85F, 2.725F, 4, 2, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.5F, 0.3504F, -3.4932F);
		Grip.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.5672F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 39, -3.0F, -0.025F, 0.475F, 4, 1, 2, 0.0F, false));

		Grip16 = new ModelRenderer(this);
		Grip16.setRotationPoint(0.0F, 0.0F, 0.0F);
		Grip.addChild(Grip16);
		Grip16.cubeList.add(new ModelBox(Grip16, 102, 90, -3.5F, -2.0F, -4.4F, 6, 1, 9, 0.002F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.3F, 0.0F, 1.6F);
		Grip16.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.6109F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 123, 90, -1.4F, -0.925F, -5.0F, 1, 2, 7, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.5F, 0.0F, 1.6F);
		Grip16.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.6109F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 124, 19, -2.7F, -3.1F, -5.0F, 1, 2, 7, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}