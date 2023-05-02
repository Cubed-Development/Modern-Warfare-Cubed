package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BulletBig extends ModelBase {
	private final QRenderer shell;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final QRenderer bullet;
	private final ModelRenderer bullet_r1;
	private final ModelRenderer bullet_r2;
	private final ModelRenderer bullet_r3;
	private final ModelRenderer bullet_r4;
	private final ModelRenderer bullet_r5;
	private final ModelRenderer bullet_r6;
	private final ModelRenderer bullet_r7;
	private final ModelRenderer bullet_r8;

	public BulletBig() {
		textureWidth = 32;
		textureHeight = 32;

		shell = new QRenderer(this);
		shell.setRotationPoint(0.0F, 24.0F, 0.0F);
		shell.cubeList.add(new ModelBox(shell, 4, 14, -1.0F, -7.0F, -1.0F, 1, 7, 1, 0.0F, false));
		shell.cubeList.add(new ModelBox(shell, 11, 8, -0.29F, -7.0F, -0.28F, 1, 7, 1, 0.001F, false));
		shell.cubeList.add(new ModelBox(shell, 0, 0, -1.71F, -7.0F, -0.28F, 1, 7, 1, 0.001F, false));
		shell.cubeList.add(new ModelBox(shell, 19, 19, -1.0F, -9.6F, -0.78F, 1, 3, 1, -0.099F, false));
		shell.cubeList.add(new ModelBox(shell, 8, 19, -1.0F, -9.6F, 0.22F, 1, 3, 1, -0.099F, false));
		shell.cubeList.add(new ModelBox(shell, 19, 12, -0.53F, -9.6F, -0.28F, 1, 3, 1, -0.099F, false));
		shell.cubeList.add(new ModelBox(shell, 19, 8, -1.47F, -9.6F, -0.28F, 1, 3, 1, -0.099F, false));
		shell.cubeList.add(new ModelBox(shell, 10, 0, -1.0F, -7.0F, 0.45F, 1, 7, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, -7.0F, 1.43F);
		shell.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.4389F, 0.6743F, 0.6447F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 22, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -7.0F, 1.43F);
		shell.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.4389F, -0.6743F, -0.6447F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 11, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -7.0F, -1.0F);
		shell.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.4389F, 0.6743F, -0.6447F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 7, 23, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.0F, -7.0F, -1.0F);
		shell.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.4389F, -0.6743F, 0.6447F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 9, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.0F, 0.0F, -1.0F);
		shell.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.7854F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 7, 0.0F, -7.0F, 0.0F, 1, 7, 1, -0.001F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.0F, 0.0F, 1.45F);
		shell.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.7854F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 4, 0, 0.0F, -7.0F, -1.0F, 1, 7, 1, -0.001F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.1F, -6.7F, -0.82F);
		shell.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.7854F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 16, -0.95F, -2.95F, -0.07F, 1, 3, 1, -0.15F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.9F, -6.7F, -0.82F);
		shell.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -0.7854F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 16, -0.05F, -2.95F, -0.07F, 1, 3, 1, -0.15F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.1F, -6.7F, 1.22F);
		shell.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -0.7854F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 0, -0.93F, -2.95F, -0.9F, 1, 3, 1, -0.15F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.9F, -6.7F, 1.22F);
		shell.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.7854F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 4, -0.07F, -2.95F, -0.9F, 1, 3, 1, -0.15F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 1.45F);
		shell.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, -0.7854F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 8, -1.0F, -7.0F, -1.0F, 1, 7, 1, -0.001F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, -1.0F);
		shell.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.7854F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 0, -1.0F, -7.0F, 0.0F, 1, 7, 1, -0.001F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.03F, -7.0F, -1.0F);
		shell.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.4538F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 23, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.001F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.03F, -7.0F, 1.46F);
		shell.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.4538F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 23, 13, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.001F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.71F, -7.0F, -0.28F);
		shell.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.4538F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 15, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.001F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.71F, -7.0F, -0.28F);
		shell.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.4538F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 18, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.001F, false));

		bullet = new QRenderer(this);
		bullet.setRotationPoint(0.0F, 24.0F, 0.0F);
		bullet.cubeList.add(new ModelBox(bullet, 15, 22, -1.0F, -11.4F, -0.7F, 1, 2, 1, -0.1F, false));
		bullet.cubeList.add(new ModelBox(bullet, 22, 6, -1.0F, -11.4F, 0.1F, 1, 2, 1, -0.1F, false));
		bullet.cubeList.add(new ModelBox(bullet, 22, 3, -1.4F, -11.4F, -0.3F, 1, 2, 1, -0.1F, false));
		bullet.cubeList.add(new ModelBox(bullet, 3, 22, -0.6F, -11.4F, -0.3F, 1, 2, 1, -0.1F, false));

		bullet_r1 = new ModelRenderer(this);
		bullet_r1.setRotationPoint(-0.1F, -9.5F, 1.0F);
		bullet.addChild(bullet_r1);
		setRotationAngle(bullet_r1, 0.0F, -0.7854F, 0.0F);
		bullet_r1.cubeList.add(new ModelBox(bullet_r1, 15, 8, -0.8F, -2.0F, -0.8F, 1, 3, 1, -0.201F, false));

		bullet_r2 = new ModelRenderer(this);
		bullet_r2.setRotationPoint(-0.1F, -9.5F, -0.6F);
		bullet.addChild(bullet_r2);
		setRotationAngle(bullet_r2, 0.0F, 0.7854F, 0.0F);
		bullet_r2.cubeList.add(new ModelBox(bullet_r2, 8, 15, -0.8F, -2.0F, -0.2F, 1, 3, 1, -0.201F, false));

		bullet_r3 = new ModelRenderer(this);
		bullet_r3.setRotationPoint(-0.9F, -9.5F, 1.0F);
		bullet.addChild(bullet_r3);
		setRotationAngle(bullet_r3, 0.0F, 0.7854F, 0.0F);
		bullet_r3.cubeList.add(new ModelBox(bullet_r3, 15, 12, -0.2F, -2.0F, -0.8F, 1, 3, 1, -0.201F, false));

		bullet_r4 = new ModelRenderer(this);
		bullet_r4.setRotationPoint(-0.9F, -9.5F, -0.6F);
		bullet.addChild(bullet_r4);
		setRotationAngle(bullet_r4, 0.0F, -0.7854F, 0.0F);
		bullet_r4.cubeList.add(new ModelBox(bullet_r4, 0, 16, -0.2F, -2.0F, -0.2F, 1, 3, 1, -0.201F, false));

		bullet_r5 = new ModelRenderer(this);
		bullet_r5.setRotationPoint(-1.3F, -11.3F, 0.6F);
		bullet.addChild(bullet_r5);
		setRotationAngle(bullet_r5, 0.0F, 0.0F, 0.2443F);
		bullet_r5.cubeList.add(new ModelBox(bullet_r5, 0, 20, -0.1F, -1.9F, -0.9F, 1, 2, 1, -0.1F, false));

		bullet_r6 = new ModelRenderer(this);
		bullet_r6.setRotationPoint(0.3F, -11.3F, 0.6F);
		bullet.addChild(bullet_r6);
		setRotationAngle(bullet_r6, 0.0F, 0.0F, -0.2443F);
		bullet_r6.cubeList.add(new ModelBox(bullet_r6, 12, 20, -0.9F, -1.9F, -0.9F, 1, 2, 1, -0.1F, false));

		bullet_r7 = new ModelRenderer(this);
		bullet_r7.setRotationPoint(-0.9F, -11.3F, 1.0F);
		bullet.addChild(bullet_r7);
		setRotationAngle(bullet_r7, 0.2443F, 0.0F, 0.0F);
		bullet_r7.cubeList.add(new ModelBox(bullet_r7, 20, 16, -0.1F, -1.9F, -0.9F, 1, 2, 1, -0.1F, false));

		bullet_r8 = new ModelRenderer(this);
		bullet_r8.setRotationPoint(-0.9F, -11.3F, -0.6F);
		bullet.addChild(bullet_r8);
		setRotationAngle(bullet_r8, -0.2443F, 0.0F, 0.0F);
		bullet_r8.cubeList.add(new ModelBox(bullet_r8, 22, 0, -0.1F, -1.9F, -0.1F, 1, 2, 1, -0.1F, false));
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
