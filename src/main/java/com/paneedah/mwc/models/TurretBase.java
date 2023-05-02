package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.6.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TurretBase extends ModelBase {
	private final QRenderer stand;
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

	public TurretBase() {
		textureWidth = 64;
		textureHeight = 64;

		stand = new QRenderer(this);
		stand.setRotationPoint(0.0F, 25.0F, 0.25F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -4.0F, -7.75F);
		stand.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.4363F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 19, 0.0F, 0.0F, 0.0F, 5, 3, 3, -0.001F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -4.0F, -7.75F);
		stand.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.4363F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 19, -5.0F, 0.0F, 0.0F, 5, 3, 3, 0.001F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-7.5F, -4.0F, -0.25F);
		stand.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.4363F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 8, 0.0F, 0.0F, 0.0F, 3, 3, 5, 0.002F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-7.5F, -4.0F, -0.25F);
		stand.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.4363F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, 0.0F, -5.0F, 3, 3, 5, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -3.25F, -0.25F);
		stand.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.7854F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 0, -4.5F, 0.0F, -0.5F, 9, 1, 1, 0.2F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 25, -1.5F, -2.75F, -1.5F, 3, 5, 3, 0.001F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(7.5F, -4.0F, -0.25F);
		stand.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.4363F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 11, -3.0F, 0.0F, 0.0F, 3, 3, 5, 0.001F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(7.5F, -4.0F, -0.25F);
		stand.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.4363F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 3, -3.0F, 0.0F, -5.0F, 3, 3, 5, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(7.0F, -5.1F, -4.75F);
		stand.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.3142F, -0.7854F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 25, -3.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-7.0F, -5.1F, -4.75F);
		stand.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3142F, 0.7854F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 25, 0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-7.0F, -5.1F, 4.25F);
		stand.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.3142F, -0.7854F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 29, 14, 0.0F, 0.0F, -3.0F, 3, 4, 3, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(7.0F, -5.1F, 4.25F);
		stand.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.3142F, 0.7854F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 32, -3.0F, 0.0F, -3.0F, 3, 4, 3, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, -4.0F, 7.25F);
		stand.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, -0.4363F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 2, -5.0F, 0.0F, -3.0F, 5, 3, 3, 0.001F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, -4.0F, 7.25F);
		stand.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.4363F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 8, 0.0F, 0.0F, -3.0F, 5, 3, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stand.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
