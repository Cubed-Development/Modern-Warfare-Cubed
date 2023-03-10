package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TaurusBullets extends ModelWithAttachments {
	private final QRenderer bullets;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public TaurusBullets() {
		textureWidth = 128;
		textureHeight = 128;

		bullets = new QRenderer(this);
		bullets.setRotationPoint(-1.5F, -10.5F, -11.0F);
		bullets.cubeList.add(new ModelBox(bullets, 76, 76, -0.5F, -3.101F, -4.303F, 1, 1, 4, 0.1F, false));
		bullets.cubeList.add(new ModelBox(bullets, 26, 75, -0.5F, -3.101F, -5.303F, 1, 1, 1, 0.0F, false));
		bullets.cubeList.add(new ModelBox(bullets, 55, 55, -0.5F, 1.099F, -4.303F, 1, 1, 4, 0.1F, false));
		bullets.cubeList.add(new ModelBox(bullets, 69, 30, -0.5F, 1.099F, -5.303F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.9F, 1.3F, -4.3F);
		bullets.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.4014F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 69, 32, 0.0F, -1.101F, -1.003F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 62, 43, 0.0F, -1.101F, -0.003F, 1, 1, 4, 0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.9F, 1.3F, -4.3F);
		bullets.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.4014F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 69, 51, -1.0F, -1.101F, -1.003F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 75, 42, -1.0F, -1.101F, -0.003F, 1, 1, 4, 0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.9F, -2.2F, -4.3F);
		bullets.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.4014F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 75, 0.0F, -0.001F, -1.003F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 75, 47, 0.0F, -0.001F, -0.003F, 1, 1, 4, 0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.9F, -2.2F, -4.3F);
		bullets.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.4014F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 75, -1.0F, -0.001F, -1.003F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 76, -1.0F, -0.001F, -0.003F, 1, 1, 4, 0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bullets.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
