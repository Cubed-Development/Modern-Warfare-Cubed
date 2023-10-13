package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class m45a1Iron extends ModelWithAttachments {
	private final ModelRenderer FrontSight;
	private final ModelRenderer cube_r1;
	private final ModelRenderer RearSight;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public m45a1Iron() {
		textureWidth = 16;
		textureHeight = 16;

		FrontSight = new ModelRenderer(this);
		FrontSight.setRotationPoint(0.0F, 19.0F, -34.0F);
		FrontSight.cubeList.add(new ModelBox(FrontSight, -3, -3, -0.525F, -0.6F, -2.6F, 1, 2, 5, 0.0F, false));
		FrontSight.cubeList.add(new ModelBox(FrontSight, 0, 0, -1.525F, 1.0F, -1.6F, 3, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.475F, 0.4F, -0.1F);
		FrontSight.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3142F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.0F, -0.2F, 1.7F, 1, 2, 1, 0.0F, false));

		RearSight = new ModelRenderer(this);
		RearSight.setRotationPoint(0.0F, 19.1F, 28.5F);
		RearSight.cubeList.add(new ModelBox(RearSight, -6, -6, -1.4F, 0.3F, -5.7F, 3, 2, 8, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 0, 0, 0.9F, -1.7F, -0.7F, 1, 4, 2, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 0, 0, -1.9F, -1.7F, -0.7F, 1, 4, 2, 0.0F, true));
		RearSight.cubeList.add(new ModelBox(RearSight, 0, 0, -1.1F, -0.7F, -0.7F, 2, 3, 2, 0.0F, true));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		RearSight.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.2793F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.4F, -1.875F, -0.7F, 1, 2, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		RearSight.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.2793F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.4F, -1.875F, -0.7F, 1, 2, 2, 0.0F, true));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.4F, -0.5F, -0.2F);
		RearSight.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.0F, 2.6F, -4.8F, 1, 2, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 2.8F, 2.6F, -4.8F, 1, 2, 2, 0.0F, true));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.4F, -0.5F, -0.2F);
		RearSight.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.2296F, 0.2163F, -0.7429F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, -3, -3, 0.0F, -1.0F, -5.3F, 1, 1, 5, 0.0F, true));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.4F, -0.5F, -0.2F);
		RearSight.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.2296F, -0.2163F, 0.7429F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, -3, -3, -1.0F, -1.0F, -5.3F, 1, 1, 5, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.4F, -0.5F, -0.2F);
		RearSight.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.3142F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, -5, -5, -1.0F, -1.4F, -5.3F, 1, 4, 7, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, -5, -5, 2.8F, -1.4F, -5.3F, 1, 4, 7, 0.0F, true));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.4F, -0.5F, -0.2F);
		RearSight.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.4887F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, -1.1F, -0.1F, 1, 4, 2, 0.0F, true));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -2.8F, 0.9F, -0.1F, 3, 2, 2, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -3.8F, -1.1F, -0.1F, 1, 4, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		FrontSight.render(f5);
		RearSight.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}