package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.1
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class M16A1RearSight extends ModelBase {
	private final ModelRenderer bone24;
	private final ModelRenderer bone23_r1;
	private final ModelRenderer bone3_r1;
	private final ModelRenderer bone2_r1;
	private final ModelRenderer bone4_r1;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer bone4;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone23;

	public M16A1RearSight() {
		textureWidth = 16;
		textureHeight = 16;

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 62, 0, -1.0F, -29.0F, -1.0F, 1, 5, 2, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 10, 54, 2.0F, -29.0F, -1.0F, 1, 5, 2, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 8, 36, 0.0F, -30.0F, -1.0F, 2, 1, 2, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 21, 23, 0.0F, -27.0F, -1.0F, 2, 3, 2, 0.0F, false));

		bone23_r1 = new ModelRenderer(this);
		bone23_r1.setRotationPoint(0.0F, -25.3F, 0.4F);
		bone24.addChild(bone23_r1);
		setRotationAngle(bone23_r1, 0.384F, 0.0F, 0.0F);
		

		bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(2.0F, -26.0F, 0.0F);
		bone24.addChild(bone3_r1);
		setRotationAngle(bone3_r1, 0.0F, 0.0F, 0.7854F);
		

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(0.0F, -26.0F, 0.0F);
		bone24.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.0F, 0.0F, 0.7854F);
		

		bone4_r1 = new ModelRenderer(this);
		bone4_r1.setRotationPoint(2.3F, -28.3F, 0.0F);
		bone24.addChild(bone4_r1);
		setRotationAngle(bone4_r1, 0.0F, 0.0F, 0.7854F);
		

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(-0.3F, -28.3F, 0.0F);
		bone24.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.0F, 0.0F, 0.7854F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-0.3F, -28.3F, 0.0F);
		bone24.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.7854F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 3, -1.0F, -1.0F, -0.99F, 1, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -1.0F, -1.4F, -1.01F, 1, 1, 2, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(2.3F, -28.3F, 0.0F);
		bone24.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.7854F);
		bone4.cubeList.add(new ModelBox(bone4, 10, 23, -1.0F, -1.0F, -0.99F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 23, -1.4F, -1.0F, -1.01F, 1, 1, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -26.0F, 0.0F);
		bone24.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.7854F);
		bone2.cubeList.add(new ModelBox(bone2, 10, 26, -1.4F, -1.0F, -1.01F, 1, 1, 2, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(2.0F, -26.0F, 0.0F);
		bone24.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.7854F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 26, -1.0F, -1.4F, -1.01F, 1, 1, 2, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, -25.3F, 0.4F);
		bone24.addChild(bone23);
		setRotationAngle(bone23, 0.384F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 0, 35, -0.99F, -1.0F, 0.0F, 4, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone24.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
