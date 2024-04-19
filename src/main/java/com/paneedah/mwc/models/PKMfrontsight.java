package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMfrontsight extends ModelBase {
	private final ModelRenderer frontsight;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public PKMfrontsight() {
		textureWidth = 150;
		textureHeight = 150;

		frontsight = new ModelRenderer(this);
		frontsight.setRotationPoint(-3.3F, 35.0F, -7.0F);
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, -1.0F, -19.0F, 2.0F, 3, 1, 9, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, -0.5F, -31.0F, 2.0F, 2, 7, 5, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, 0.0F, -32.8F, 4.0F, 1, 2, 1, -0.2F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, -2.1F, -33.2F, 2.0F, 1, 2, 5, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, 2.1F, -33.2F, 2.0F, 1, 2, 5, 0.0F, true));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, -0.5F, -24.0F, 2.0F, 2, 5, 2, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, -1.0F, -12.6F, 2.0F, 3, 1, 9, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, -15.3F, 7.0F);
		frontsight.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 2.3562F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.5F, -3.7F, -5.0F, 3, 1, 9, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.5F, 2.7F, -5.0F, 3, 1, 9, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, -15.3F, 7.0F);
		frontsight.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.5F, -3.7F, -5.0F, 3, 1, 9, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.5F, 2.7F, -5.0F, 3, 1, 9, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.5F, -15.3F, 7.0F);
		frontsight.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.5F, -3.7F, -5.0F, 3, 1, 9, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.5F, 2.7F, -5.0F, 3, 1, 9, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.5F, -21.5F, 9.0F);
		frontsight.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.0F, -8.9F, -1.0F, 2, 12, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.7F, -32.2F, 4.5F);
		frontsight.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 1.4F, 0.0F, -2.5F, 1, 1, 5, 0.0F, true));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.7F, -32.2F, 4.5F);
		frontsight.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 1.4F, -1.0F, -2.5F, 1, 3, 5, 0.0F, true));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.3F, -32.2F, 4.5F);
		frontsight.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -2.4F, 0.0F, -2.5F, 1, 1, 5, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.3F, -32.2F, 4.5F);
		frontsight.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -2.4F, -1.0F, -2.5F, 1, 3, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		frontsight.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
