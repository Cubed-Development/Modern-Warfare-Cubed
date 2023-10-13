package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HardballerIron extends ModelWithAttachments {
	private final ModelRenderer IronSights;
	private final ModelRenderer RearSight;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer FrontSight;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public HardballerIron() {
		textureWidth = 16;
		textureHeight = 16;

		IronSights = new ModelRenderer(this);
		IronSights.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		RearSight = new ModelRenderer(this);
		RearSight.setRotationPoint(0.0F, 0.0F, 0.0F);
		IronSights.addChild(RearSight);
		RearSight.cubeList.add(new ModelBox(RearSight, -3, -3, -1.3F, -5.0F, 35.1F, 2, 2, 5, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 0, 0, -3.3F, -5.0F, 40.1F, 6, 2, 2, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 1, 1, -3.3F, -4.2F, 39.1F, 6, 3, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 0, 0, 1.7F, -5.0F, 40.0F, 1, 1, 2, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 0, 0, -3.3F, -5.0F, 40.0F, 1, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.3F, -4.0F, 40.6F);
		RearSight.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2632F, -0.0944F, -0.3366F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -2.25F, -4.075F, 1.2F, 1, 2, 1, 0.0F, true));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.3F, -4.0F, 40.6F);
		RearSight.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2632F, 0.0944F, 0.3366F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.7F, -3.85F, 1.2F, 1, 2, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.3F, -4.0F, 40.6F);
		RearSight.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2793F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 2.0F, -3.4F, 1.2F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -2.0F, -1.9F, 1.2F, 4, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 2.0F, -2.9F, 1.2F, 1, 3, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -3.0F, -2.9F, 1.2F, 1, 3, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -3.0F, -3.4F, 1.2F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.3F, -5.3F, 41.5F);
		RearSight.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, -1, -1, -3.0F, 1.3F, -3.0F, 6, 1, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.3F, -5.3F, 41.5F);
		RearSight.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.6981F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 1, 1, -3.0F, -0.725F, -2.55F, 6, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 1, 1, -3.0F, -0.725F, -2.325F, 6, 1, 1, 0.0F, false));

		FrontSight = new ModelRenderer(this);
		FrontSight.setRotationPoint(0.0F, 0.0F, 0.0F);
		IronSights.addChild(FrontSight);
		FrontSight.cubeList.add(new ModelBox(FrontSight, 25, 25, -0.8F, -6.1466F, -47.5315F, 1, 2, 3, 0.0F, false));
		FrontSight.cubeList.add(new ModelBox(FrontSight, 27, 27, -0.8F, -5.5466F, -48.5315F, 1, 2, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.3F, -5.1466F, -46.0315F);
		FrontSight.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.4538F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 24, -0.5F, -1.5F, 0.9F, 1, 2, 4, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.3F, -4.5466F, -48.0315F);
		FrontSight.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.0472F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 27, -0.5F, -1.025F, -1.2F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 27, -0.5F, -1.225F, -1.2F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		IronSights.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}