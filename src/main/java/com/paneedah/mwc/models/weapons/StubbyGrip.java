package com.paneedah.mwc.models.weapons;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class StubbyGrip extends ModelBase {
	private final ModelRenderer StubbyGrip;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun21_r2;
	private final ModelRenderer gun21_r3;

	public StubbyGrip() {
		textureWidth = 32;
		textureHeight = 32;

		StubbyGrip = new ModelRenderer(this);
		StubbyGrip.setRotationPoint(0.0F, 24.0F, 0.0F);
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 0, 7, -1.0F, -30.5F, -4.0F, 4, 1, 6, 0.0F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 0, 0, -1.0F, -29.8F, -4.0F, 4, 1, 6, -0.2F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 0, 14, 0.0F, -28.5F, -2.5F, 2, 5, 3, 0.0F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 14, 7, -0.5F, -24.5F, -2.3F, 3, 3, 2, 0.0F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 14, 0, -0.5F, -21.7F, -2.5F, 3, 1, 3, -0.2F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 20, 12, 1.8F, -26.5F, -2.0F, 1, 5, 2, 0.0F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 18, 19, -0.8F, -26.5F, -2.0F, 1, 5, 2, 0.0F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 0, 7, 0.0F, -26.5F, -2.8F, 2, 5, 1, 0.0F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 22, 4, -1.2F, -24.0F, -2.1F, 1, 2, 2, -0.2F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 12, 23, -1.2F, -26.0F, -2.1F, 1, 2, 2, -0.2F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 8, 21, 2.2F, -24.0F, -2.1F, 1, 2, 2, -0.2F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 0, 22, 2.2F, -26.0F, -2.1F, 1, 2, 2, -0.2F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 0, 0, 0.0F, -26.5F, -0.2F, 2, 5, 1, 0.0F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 26, 15, 1.8F, -29.0F, -2.0F, 1, 1, 2, -0.002F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 26, 12, -0.8F, -29.0F, -2.0F, 1, 1, 2, -0.002F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 12, 21, 0.0F, -29.0F, -0.2F, 2, 1, 1, -0.002F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 14, 4, 0.0F, -29.0F, -2.8F, 2, 1, 1, -0.002F, false));
		StubbyGrip.cubeList.add(new ModelBox(StubbyGrip, 10, 14, -0.5F, -28.5F, -2.0F, 3, 5, 2, 0.0F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(-0.0915F, -24.0F, -2.0785F);
		StubbyGrip.addChild(gun21_r1);
		setRotationAngle(gun21_r1, 0.0F, 0.7854F, 0.0F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 9, 26, -0.5485F, -2.5F, -0.4465F, 1, 5, 1, 0.0F, false));
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 17, 26, -0.4185F, -2.5F, -0.4465F, 1, 5, 1, 0.0F, false));

		gun21_r2 = new ModelRenderer(this);
		gun21_r2.setRotationPoint(-0.0915F, -24.0F, -2.0785F);
		StubbyGrip.addChild(gun21_r2);
		setRotationAngle(gun21_r2, 0.0F, -0.7854F, 0.0F);
		gun21_r2.cubeList.add(new ModelBox(gun21_r2, 26, 0, 2.5215F, -2.5F, -0.5715F, 1, 5, 1, 0.0F, false));
		gun21_r2.cubeList.add(new ModelBox(gun21_r2, 0, 26, 2.5215F, -2.5F, -0.4465F, 1, 5, 1, 0.0F, false));

		gun21_r3 = new ModelRenderer(this);
		gun21_r3.setRotationPoint(0.0915F, -24.0F, -2.0785F);
		StubbyGrip.addChild(gun21_r3);
		setRotationAngle(gun21_r3, 0.0F, -0.7854F, 0.0F);
		gun21_r3.cubeList.add(new ModelBox(gun21_r3, 23, 25, 0.8185F, -2.5F, -1.8465F, 1, 5, 1, 0.0F, false));
		gun21_r3.cubeList.add(new ModelBox(gun21_r3, 24, 19, 0.9485F, -2.5F, 1.0985F, 1, 5, 1, 0.0F, false));
		gun21_r3.cubeList.add(new ModelBox(gun21_r3, 24, 8, 0.8185F, -2.5F, 1.0985F, 1, 5, 1, 0.0F, false));
		gun21_r3.cubeList.add(new ModelBox(gun21_r3, 5, 25, 0.9485F, -2.5F, -1.8465F, 1, 5, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		StubbyGrip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}