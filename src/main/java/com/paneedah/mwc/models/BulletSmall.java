package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BulletSmall extends ModelBase {
	private final QRenderer shell;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final QRenderer bullet;
	private final ModelRenderer bullet_r1;
	private final ModelRenderer bullet_r2;
	private final ModelRenderer bullet_r3;
	private final ModelRenderer bullet_r4;
	private final ModelRenderer bullet_r5;
	private final ModelRenderer bullet_r6;
	private final ModelRenderer bullet_r7;
	private final ModelRenderer bullet_r8;

	public BulletSmall() {
		textureWidth = 32;
		textureHeight = 32;

		shell = new QRenderer(this);
		shell.setRotationPoint(0.0F, 24.0F, 0.0F);
		shell.cubeList.add(new ModelBox(shell, 0, 10, -1.0F, -8.6F, -0.78F, 1, 4, 1, -0.099F, false));
		shell.cubeList.add(new ModelBox(shell, 4, 5, -1.0F, -8.6F, 0.22F, 1, 4, 1, -0.099F, false));
		shell.cubeList.add(new ModelBox(shell, 8, 5, -0.53F, -8.6F, -0.28F, 1, 4, 1, -0.099F, false));
		shell.cubeList.add(new ModelBox(shell, 4, 0, -1.47F, -8.6F, -0.28F, 1, 4, 1, -0.099F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.1F, -6.6F, 1.22F);
		shell.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 14, -0.93F, 1.05F, -0.9F, 1, 1, 1, -0.149F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 0, -0.93F, -2.05F, -0.9F, 1, 4, 1, -0.15F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.9F, -6.6F, 1.22F);
		shell.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.7854F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 11, -0.07F, 1.05F, -0.9F, 1, 1, 1, -0.149F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 5, -0.07F, -2.05F, -0.9F, 1, 4, 1, -0.15F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.9F, -6.6F, -0.82F);
		shell.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 7, -0.05F, 1.05F, -0.07F, 1, 1, 1, -0.149F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.05F, -2.05F, -0.07F, 1, 4, 1, -0.15F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.1F, -6.6F, -0.82F);
		shell.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.7854F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 3, -0.95F, 1.05F, -0.07F, 1, 1, 1, -0.149F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 4, 10, -0.95F, -2.05F, -0.07F, 1, 4, 1, -0.15F, false));

		bullet = new QRenderer(this);
		bullet.setRotationPoint(0.0F, 25.75F, 0.0F);
		bullet.cubeList.add(new ModelBox(bullet, 11, 15, -1.0F, -11.4F, -0.7F, 1, 2, 1, -0.1F, false));
		bullet.cubeList.add(new ModelBox(bullet, 0, 15, -1.0F, -11.4F, 0.1F, 1, 2, 1, -0.1F, false));
		bullet.cubeList.add(new ModelBox(bullet, 7, 14, -1.4F, -11.4F, -0.3F, 1, 2, 1, -0.1F, false));
		bullet.cubeList.add(new ModelBox(bullet, 12, 12, -0.6F, -11.4F, -0.3F, 1, 2, 1, -0.1F, false));

		bullet_r1 = new ModelRenderer(this);
		bullet_r1.setRotationPoint(-0.1F, -9.5F, 1.0F);
		bullet.addChild(bullet_r1);
		setRotationAngle(bullet_r1, 0.0F, -0.7854F, 0.0F);
		bullet_r1.cubeList.add(new ModelBox(bullet_r1, 12, 0, -0.8F, -2.0F, -0.8F, 1, 3, 1, -0.201F, false));

		bullet_r2 = new ModelRenderer(this);
		bullet_r2.setRotationPoint(-0.1F, -9.5F, -0.6F);
		bullet.addChild(bullet_r2);
		setRotationAngle(bullet_r2, 0.0F, 0.7854F, 0.0F);
		bullet_r2.cubeList.add(new ModelBox(bullet_r2, 8, 10, -0.8F, -2.0F, -0.2F, 1, 3, 1, -0.201F, false));

		bullet_r3 = new ModelRenderer(this);
		bullet_r3.setRotationPoint(-0.9F, -9.5F, 1.0F);
		bullet.addChild(bullet_r3);
		setRotationAngle(bullet_r3, 0.0F, 0.7854F, 0.0F);
		bullet_r3.cubeList.add(new ModelBox(bullet_r3, 12, 4, -0.2F, -2.0F, -0.8F, 1, 3, 1, -0.201F, false));

		bullet_r4 = new ModelRenderer(this);
		bullet_r4.setRotationPoint(-0.9F, -9.5F, -0.6F);
		bullet.addChild(bullet_r4);
		setRotationAngle(bullet_r4, 0.0F, -0.7854F, 0.0F);
		bullet_r4.cubeList.add(new ModelBox(bullet_r4, 12, 8, -0.2F, -2.0F, -0.2F, 1, 3, 1, -0.201F, false));

		bullet_r5 = new ModelRenderer(this);
		bullet_r5.setRotationPoint(-1.3F, -11.3F, 0.6F);
		bullet.addChild(bullet_r5);
		setRotationAngle(bullet_r5, 0.0F, 0.0F, 0.3491F);
		bullet_r5.cubeList.add(new ModelBox(bullet_r5, 16, 0, -0.1F, -0.9F, -0.9F, 1, 1, 1, -0.1F, false));

		bullet_r6 = new ModelRenderer(this);
		bullet_r6.setRotationPoint(0.3F, -11.3F, 0.6F);
		bullet.addChild(bullet_r6);
		setRotationAngle(bullet_r6, 0.0F, 0.0F, -0.3491F);
		bullet_r6.cubeList.add(new ModelBox(bullet_r6, 4, 16, -0.9F, -0.9F, -0.9F, 1, 1, 1, -0.1F, false));

		bullet_r7 = new ModelRenderer(this);
		bullet_r7.setRotationPoint(-0.9F, -11.3F, 1.0F);
		bullet.addChild(bullet_r7);
		setRotationAngle(bullet_r7, 0.3491F, 0.0F, 0.0F);
		bullet_r7.cubeList.add(new ModelBox(bullet_r7, 16, 5, -0.1F, -0.9F, -0.9F, 1, 1, 1, -0.1F, false));

		bullet_r8 = new ModelRenderer(this);
		bullet_r8.setRotationPoint(-0.9F, -11.3F, -0.6F);
		bullet.addChild(bullet_r8);
		setRotationAngle(bullet_r8, -0.3491F, 0.0F, 0.0F);
		bullet_r8.cubeList.add(new ModelBox(bullet_r8, 16, 9, -0.1F, -0.9F, -0.1F, 1, 1, 1, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		shell.render(f5);
		bullet.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
