package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Bulletcaseless extends ModelBase {
	private final QRenderer bullet;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public Bulletcaseless() {
		textureWidth = 32;
		textureHeight = 32;

		bullet = new QRenderer(this);
		bullet.setRotationPoint(0.5F, 24.0F, -0.8F);
		bullet.cubeList.add(new ModelBox(bullet, 8, 0, -2.0F, -8.0F, 0.0F, 2, 1, 2, 0.0F, false));
		bullet.cubeList.add(new ModelBox(bullet, 0, 0, -2.0F, -5.0F, 0.0F, 2, 5, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.0F, -7.0F, 2.0F);
		bullet.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1396F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 3, 0.0F, -0.2F, -0.8F, 2, 3, 1, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, -5.0F, 2.0F);
		bullet.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1396F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 11, 0.0F, -1.8F, -0.8F, 2, 2, 1, -0.201F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.0F, -7.0F, 0.0F);
		bullet.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1396F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 10, 0.0F, -0.2F, -0.2F, 2, 3, 1, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0F, -5.0F, 0.0F);
		bullet.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1396F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 14, 0.0F, -1.8F, -0.2F, 2, 2, 1, -0.201F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -5.0F, 0.0F);
		bullet.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.1396F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 12, -0.8F, -1.8F, 0.0F, 1, 2, 2, -0.201F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.0F, -5.0F, 0.0F);
		bullet.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.1396F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 7, -0.2F, -1.8F, 0.0F, 1, 2, 2, -0.201F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.0F, -7.0F, 0.0F);
		bullet.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.1396F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 5, -0.2F, -0.2F, 0.0F, 1, 3, 2, -0.2F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -7.0F, 0.0F);
		bullet.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.1396F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 7, -0.8F, -0.2F, 0.0F, 1, 3, 2, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bullet.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
