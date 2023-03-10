package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class AudiS4SteeringWheel extends ModelBase {
	private final ModelRenderer interior_wheel;
	private final ModelRenderer bone111;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone110;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone112;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone116;
	private final ModelRenderer bone117;
	private final ModelRenderer bone118;
	private final ModelRenderer bone115;
	private final ModelRenderer bone114;
	private final ModelRenderer bone113;
	private final ModelRenderer bone109;

	public AudiS4SteeringWheel() {
		textureWidth = 512;
		textureHeight = 512;

		interior_wheel = new ModelRenderer(this);
		interior_wheel.setRotationPoint(-16.0F, -5.0F, 29.0F);
		

		bone111 = new ModelRenderer(this);
		bone111.setRotationPoint(-52.5F, -2.0F, 0.5F);
		interior_wheel.addChild(bone111);
		setRotationAngle(bone111, -1.2043F, -0.3142F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.5F, -1.3584F, 1.5664F);
		bone111.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 37, 48.9542F, 15.3347F, -16.396F, 4, 2, 2, 0.0F, false));

		bone110 = new ModelRenderer(this);
		bone110.setRotationPoint(-59.5F, -2.0F, 0.5F);
		interior_wheel.addChild(bone110);
		setRotationAngle(bone110, -1.2043F, 0.3142F, 0.0F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -1.3584F, 1.5664F);
		bone110.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.1745F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 101, 110, 49.7921F, -16.9764F, 14.3154F, 4, 2, 2, 0.0F, false));

		bone112 = new ModelRenderer(this);
		bone112.setRotationPoint(-53.5F, 0.0F, -1.7F);
		interior_wheel.addChild(bone112);
		setRotationAngle(bone112, -1.0123F, 0.0F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.0F, -3.5F, 5.5F);
		bone112.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.1309F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 102, 52.0466F, -0.5F, 4.4179F, 1, 1, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.0F, -3.5F, 5.5F);
		bone112.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.1309F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 117, 129, 55.0209F, -0.5F, -9.8095F, 1, 1, 5, 0.0F, false));

		bone116 = new ModelRenderer(this);
		bone116.setRotationPoint(-57.0F, -7.0F, -0.3F);
		interior_wheel.addChild(bone116);
		setRotationAngle(bone116, 0.2269F, -0.1745F, 1.2217F);
		bone116.cubeList.add(new ModelBox(bone116, 62, 132, 18.8621F, -53.0222F, 8.5969F, 2, 7, 2, 0.0F, false));

		bone117 = new ModelRenderer(this);
		bone117.setRotationPoint(-55.5F, 5.0F, 4.3F);
		interior_wheel.addChild(bone117);
		setRotationAngle(bone117, -0.0698F, 0.4189F, -1.8151F);
		bone117.cubeList.add(new ModelBox(bone117, 150, 121, -14.3764F, 53.5886F, -1.7066F, 2, 6, 2, 0.0F, false));

		bone118 = new ModelRenderer(this);
		bone118.setRotationPoint(-56.5F, 5.0F, 4.3F);
		interior_wheel.addChild(bone118);
		setRotationAngle(bone118, -0.0698F, -0.4189F, 1.8151F);
		bone118.cubeList.add(new ModelBox(bone118, 160, 142, -12.3764F, -55.5886F, 1.7066F, 2, 6, 2, 0.0F, false));

		bone115 = new ModelRenderer(this);
		bone115.setRotationPoint(-55.0F, -7.0F, -0.3F);
		interior_wheel.addChild(bone115);
		setRotationAngle(bone115, 0.2269F, 0.1745F, -1.2217F);
		bone115.cubeList.add(new ModelBox(bone115, 101, 142, 16.8621F, 51.0222F, -8.5969F, 2, 7, 2, 0.0F, false));

		bone114 = new ModelRenderer(this);
		bone114.setRotationPoint(-61.5F, 1.0F, 2.9F);
		interior_wheel.addChild(bone114);
		setRotationAngle(bone114, 0.3665F, 0.3142F, 0.0F);
		bone114.cubeList.add(new ModelBox(bone114, 60, 35, 51.2592F, 0.2015F, 16.1556F, 2, 10, 2, 0.0F, false));

		bone113 = new ModelRenderer(this);
		bone113.setRotationPoint(-50.5F, 1.0F, 2.9F);
		interior_wheel.addChild(bone113);
		setRotationAngle(bone113, 0.3665F, -0.3142F, 0.0F);
		bone113.cubeList.add(new ModelBox(bone113, 176, 101, 53.2592F, -12.2015F, -16.1556F, 2, 10, 2, 0.0F, false));

		bone109 = new ModelRenderer(this);
		bone109.setRotationPoint(-55.5F, -4.0F, -1.0F);
		interior_wheel.addChild(bone109);
		setRotationAngle(bone109, -1.4137F, 0.0F, 0.0F);
		bone109.cubeList.add(new ModelBox(bone109, 102, 287, 53.0F, -4.0F, 2.0F, 5, 4, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		interior_wheel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}