package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Bullet44 extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer Shape18_r1;
	private final ModelRenderer Shape17_r1;
	private final ModelRenderer Shape16_r1;
	private final ModelRenderer Shape19_r1;

	public Bullet44() {
		textureWidth = 64;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-7.9602F, 22.8274F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, 7.9602F, -27.8274F, 0.0F, 3, 9, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 8.4602F, -27.8274F, -0.2F, 2, 9, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 8.4602F, -27.8274F, 2.2F, 2, 9, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 7.7602F, -27.8274F, 0.5F, 1, 9, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 10.1602F, -27.8274F, 0.5F, 1, 9, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 7.9602F, -19.3274F, -0.4F, 3, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 7.9602F, -19.3274F, 2.4F, 3, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 10.3602F, -19.3274F, 0.0F, 1, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 7.5602F, -19.3274F, 0.0F, 1, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 20, 0, 8.4602F, -29.8274F, 0.5F, 2, 2, 2, 0.0F, true));

		Shape18_r1 = new ModelRenderer(this);
		Shape18_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(Shape18_r1);
		setRotationAngle(Shape18_r1, 0.0F, 0.0F, 0.2602F);
		Shape18_r1.cubeList.add(new ModelBox(Shape18_r1, 20, 0, 0.5F, -31.0F, 0.5F, 1, 2, 2, 0.0F, true));

		Shape17_r1 = new ModelRenderer(this);
		Shape17_r1.setRotationPoint(7.9602F, 0.0F, -7.9602F);
		bone.addChild(Shape17_r1);
		setRotationAngle(Shape17_r1, -0.2602F, 0.0F, 0.0F);
		Shape17_r1.cubeList.add(new ModelBox(Shape17_r1, 20, 0, 0.5F, -31.0F, 0.5F, 2, 2, 1, 0.0F, true));

		Shape16_r1 = new ModelRenderer(this);
		Shape16_r1.setRotationPoint(-20.0862F, -23.9821F, 0.0F);
		bone.addChild(Shape16_r1);
		setRotationAngle(Shape16_r1, 0.0F, 0.0F, 1.3013F);
		Shape16_r1.cubeList.add(new ModelBox(Shape16_r1, 20, 0, 2.5F, -31.0F, 0.5F, 2, 1, 2, 0.0F, true));

		Shape19_r1 = new ModelRenderer(this);
		Shape19_r1.setRotationPoint(7.9602F, -25.1215F, -28.2426F);
		bone.addChild(Shape19_r1);
		setRotationAngle(Shape19_r1, -1.3384F, 0.0F, 0.0F);
		Shape19_r1.cubeList.add(new ModelBox(Shape19_r1, 20, 0, 0.5F, -31.0F, 2.5F, 2, 1, 2, 0.0F, true));
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