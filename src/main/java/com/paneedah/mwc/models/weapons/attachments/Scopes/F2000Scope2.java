package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class F2000Scope2 extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer Shape14_r1;
	private final ModelRenderer Shape13_r1;
	private final ModelRenderer Shape11_r1;
	private final ModelRenderer Shape9_r1;

	public F2000Scope2() {
		textureWidth = 64;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(23.2383F, -10.3744F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -23.7383F, 10.3744F, 0.0F, 5, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -27.2383F, 3.8744F, 0.0F, 2, 5, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -17.2383F, 3.8744F, 0.0F, 2, 5, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -23.7383F, 0.3744F, 0.0F, 5, 2, 1, 0.0F, true));

		Shape14_r1 = new ModelRenderer(this);
		Shape14_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(Shape14_r1);
		setRotationAngle(Shape14_r1, 0.0F, 0.0F, -2.3562F);
		Shape14_r1.cubeList.add(new ModelBox(Shape14_r1, 0, 0, 4.5F, -22.0F, 0.0F, 2, 3, 1, 0.0F, true));
		Shape14_r1.cubeList.add(new ModelBox(Shape14_r1, 0, 0, 4.5F, -19.1F, 0.0F, 2, 2, 1, 0.0F, true));

		Shape13_r1 = new ModelRenderer(this);
		Shape13_r1.setRotationPoint(-45.9619F, 21.234F, 0.0F);
		bone.addChild(Shape13_r1);
		setRotationAngle(Shape13_r1, 0.0F, 0.0F, 0.7854F);
		Shape13_r1.cubeList.add(new ModelBox(Shape13_r1, 0, 0, 7.4F, -34.0F, 0.0F, 2, 2, 1, 0.0F, true));
		Shape13_r1.cubeList.add(new ModelBox(Shape13_r1, 0, 0, 4.5F, -34.0F, 0.0F, 3, 2, 1, 0.0F, true));

		Shape11_r1 = new ModelRenderer(this);
		Shape11_r1.setRotationPoint(-2.8432F, 22.6127F, 0.0F);
		bone.addChild(Shape11_r1);
		setRotationAngle(Shape11_r1, 0.0F, 0.0F, -0.7854F);
		Shape11_r1.cubeList.add(new ModelBox(Shape11_r1, 0, 0, -1.1F, -30.5F, 0.0F, 2, 2, 1, 0.0F, true));
		Shape11_r1.cubeList.add(new ModelBox(Shape11_r1, 0, 0, -4.0F, -30.5F, 0.0F, 3, 2, 1, 0.0F, true));

		Shape9_r1 = new ModelRenderer(this);
		Shape9_r1.setRotationPoint(-8.5355F, -3.5355F, 0.0F);
		bone.addChild(Shape9_r1);
		setRotationAngle(Shape9_r1, 0.0F, 0.0F, -2.3562F);
		Shape9_r1.cubeList.add(new ModelBox(Shape9_r1, 0, 0, 2.4F, -22.0F, 0.0F, 2, 2, 1, 0.0F, true));
		Shape9_r1.cubeList.add(new ModelBox(Shape9_r1, 0, 0, -0.5F, -22.0F, 0.0F, 3, 2, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}