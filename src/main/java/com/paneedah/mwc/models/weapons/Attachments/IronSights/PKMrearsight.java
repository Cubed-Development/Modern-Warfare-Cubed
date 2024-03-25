package com.paneedah.mwc.models.weapons;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMrearsight extends ModelBase {
	private final ModelRenderer PKIron;
	private final ModelRenderer rearsight;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public PKMrearsight() {
		textureWidth = 150;
		textureHeight = 150;

		PKIron = new ModelRenderer(this);
		PKIron.setRotationPoint(0.0F, 111.0F, 36.0F);
		

		rearsight = new ModelRenderer(this);
		rearsight.setRotationPoint(-2.6F, -90.0F, -24.0F);
		PKIron.addChild(rearsight);
		rearsight.cubeList.add(new ModelBox(rearsight, 0, 0, 2.0F, -2.0F, -1.0F, 1, 4, 3, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 0, 0, 5.0F, -4.6F, -22.0F, 1, 4, 3, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 0, 0, -6.0F, -4.6F, -22.0F, 1, 4, 3, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 0, 0, 4.0F, -4.6F, -24.0F, 1, 4, 1, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 0, 0, -5.0F, -4.6F, -24.0F, 1, 4, 1, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 0, 0, -4.0F, -2.6F, -24.0F, 8, 2, 1, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 0, 0, 1.0F, -4.6F, -22.0F, 2, 2, 1, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 0, 0, 2.5F, -4.6F, -22.0F, 1, 2, 1, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 0, 0, -3.0F, -4.6F, -22.0F, 2, 2, 1, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 0, 0, -3.5F, -4.6F, -22.0F, 1, 2, 1, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 0, 0, -2.0F, -2.0F, 1.0F, 4, 4, 1, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 0, 0, -3.0F, 0.0F, -15.0F, 1, 2, 14, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 0, 0, -3.0F, -2.0F, -1.0F, 1, 4, 3, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 0, 0, 2.0F, 0.0F, -15.0F, 1, 2, 14, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rearsight.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, -2.0F, -22.0F, 1, 1, 23, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.4F, -2.0F, -22.0F, 1, 1, 23, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.4F, -2.0F, -22.0F, 1, 1, 23, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 1.0F, -2.0F, -22.0F, 1, 1, 23, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, -1.7F, -22.0F, 4, 1, 23, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.9F, -1.9094F, -13.93F);
		rearsight.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.7418F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 3.3F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 4.8F, -1.0F, -1.0F, 1, 2, 2, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 2.4F, -1.0F, -1.0F, 2, 2, 2, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.4F, -1.0F, -1.0F, 1, 2, 2, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.2F, -1.0F, -1.0F, 3, 2, 2, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.8F, -6.2F, -6.3F, 1, 2, 2, 0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 4.4F, -6.2F, -6.3F, 2, 2, 2, -0.2F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.6F, -6.2F, -6.3F, 7, 2, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.5F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		rearsight.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 2.0F, -2.1F, -12.6F, 1, 2, 12, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -3.0F, -2.1F, -12.6F, 1, 2, 12, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(3.2F, -3.6F, -21.5F);
		rearsight.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3491F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -4.6F, -2.4F, -0.5F, 1, 2, 1, 0.0F, true));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.0F, -3.6F, -21.5F);
		rearsight.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.3491F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.3F, -0.6F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(10.6F, -2.6F, -21.9F);
		rearsight.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -1.0908F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -3.1255F, -2.0F, 4.0512F, 1, 4, 1, 0.0F, true));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -4.4255F, -2.0F, 4.0512F, 2, 4, 1, 0.0F, true));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-5.4F, -2.6F, -21.9F);
		rearsight.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 1.0908F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.2745F, -2.0F, -0.5488F, 1, 4, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0255F, -2.0F, -0.5488F, 2, 4, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		PKIron.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}