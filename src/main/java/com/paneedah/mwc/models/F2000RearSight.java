package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class F2000RearSight extends ModelWithAttachments {
	private final ModelRenderer ironsight;
	private final ModelRenderer rearsight;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r1_r1;

	public F2000RearSight() {
		textureWidth = 290;
		textureHeight = 290;

		ironsight = new ModelRenderer(this);
		ironsight.setRotationPoint(0.0F, 17.0F, -6.0F);
		

		rearsight = new ModelRenderer(this);
		rearsight.setRotationPoint(0.0F, 0.0F, 0.0F);
		ironsight.addChild(rearsight);
		rearsight.cubeList.add(new ModelBox(rearsight, 1, 1, -1.0F, -34.0F, 8.0F, 2, 2, 1, -0.4F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 1, 1, 0.2F, -34.3F, 8.0F, 1, 2, 1, -0.4F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 1, 1, -1.025F, -34.0F, 8.0F, 2, 2, 1, -0.4F, true));
		rearsight.cubeList.add(new ModelBox(rearsight, 1, 1, -1.125F, -34.1F, 8.0F, 1, 1, 1, -0.4F, true));
		rearsight.cubeList.add(new ModelBox(rearsight, 1, 1, -1.225F, -34.3F, 8.0F, 1, 2, 1, -0.4F, true));
		rearsight.cubeList.add(new ModelBox(rearsight, 1, 1, 0.1F, -34.1F, 8.0F, 1, 1, 1, -0.4F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.275F, -34.2F, 8.5F);
		rearsight.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 1, 1, 0.0F, -1.2F, -0.5F, 1, 1, 1, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 1, 1, -0.475F, 0.2F, -0.5F, 1, 1, 1, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 1, 1, -0.4F, 0.2F, -0.5F, 1, 1, 1, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 1, 1, -0.2F, 0.2F, -0.5F, 1, 1, 1, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 1, 1, 0.0F, 0.2F, -0.5F, 1, 1, 1, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 1, 1, -0.2F, -1.2F, -0.5F, 1, 1, 1, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 1, 1, -0.4F, -1.2F, -0.5F, 1, 1, 1, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 1, 1, -0.475F, -1.2F, -0.5F, 1, 1, 1, -0.4F, false));

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(24.4544F, 24.1742F, -8.5F);
		bone4.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, 0.0F, 0.0F, -0.7854F);
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 1, 1, -0.275F, -35.4F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 1, 1, -0.75F, -34.0F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 1, 1, -0.675F, -34.0F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 1, 1, -0.475F, -34.0F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 1, 1, -0.275F, -34.0F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 1, 1, -0.475F, -35.4F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 1, 1, -0.675F, -35.4F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 1, 1, -0.75F, -35.4F, 8.0F, 1, 1, 1, -0.4F, false));

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(34.4625F, -0.0126F, -8.5F);
		bone4.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, 0.0F, 0.0F, -1.5708F);
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 1, 1, -0.275F, -35.4F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 1, 1, -0.75F, -34.0F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 1, 1, -0.675F, -34.0F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 1, 1, -0.475F, -34.0F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 1, 1, -0.275F, -34.0F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 1, 1, -0.475F, -35.4F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 1, 1, -0.675F, -35.4F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 1, 1, -0.75F, -35.4F, 8.0F, 1, 1, 1, -0.4F, false));

		cube_r1_r1 = new ModelRenderer(this);
		cube_r1_r1.setRotationPoint(24.4366F, -24.192F, -8.5F);
		bone4.addChild(cube_r1_r1);
		setRotationAngle(cube_r1_r1, 0.0F, 0.0F, -2.3562F);
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 1, 1, -0.275F, -35.4F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 1, 1, -0.75F, -34.0F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 1, 1, -0.675F, -34.0F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 1, 1, -0.475F, -34.0F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 1, 1, -0.275F, -34.0F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 1, 1, -0.475F, -35.4F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 1, 1, -0.675F, -35.4F, 8.0F, 1, 1, 1, -0.4F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 1, 1, -0.75F, -35.4F, 8.0F, 1, 1, 1, -0.4F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ironsight.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}