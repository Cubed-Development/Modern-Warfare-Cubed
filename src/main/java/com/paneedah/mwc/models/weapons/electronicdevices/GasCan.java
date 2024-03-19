package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class GasCan extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer can11_r1;
	private final ModelRenderer can10_r1;
	private final ModelRenderer can9_r1;
	private final ModelRenderer can6_r1;
	private final ModelRenderer can5_r1;
	private final ModelRenderer can12_r1;

	public GasCan() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -10.3403F, -27.415F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.5F, 0.3403F, 25.415F, 2, 1, 7, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -0.1597F, 23.415F, 3, 4, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -0.1597F, 32.415F, 3, 4, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, 3.8403F, 19.415F, 5, 18, 17, 0.0F, true));

		can11_r1 = new ModelRenderer(this);
		can11_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(can11_r1);
		setRotationAngle(can11_r1, -1.3384F, 0.0F, 0.0F);
		can11_r1.cubeList.add(new ModelBox(can11_r1, 0, 0, -1.0F, -34.5F, 8.0F, 3, 1, 4, 0.0F, true));

		can10_r1 = new ModelRenderer(this);
		can10_r1.setRotationPoint(-8.376F, 33.5574F, 27.415F);
		bone.addChild(can10_r1);
		setRotationAngle(can10_r1, 0.0F, 0.0F, 0.2443F);
		can10_r1.cubeList.add(new ModelBox(can10_r1, 0, 0, -1.0F, -34.5F, 5.0F, 2, 4, 3, 0.0F, true));
		can10_r1.cubeList.add(new ModelBox(can10_r1, 0, 0, -1.0F, -34.5F, -4.0F, 2, 4, 2, 0.0F, true));

		can9_r1 = new ModelRenderer(this);
		can9_r1.setRotationPoint(8.4057F, 33.7993F, 27.415F);
		bone.addChild(can9_r1);
		setRotationAngle(can9_r1, 0.0F, 0.0F, -0.2443F);
		can9_r1.cubeList.add(new ModelBox(can9_r1, 0, 0, 0.0F, -34.5F, 5.0F, 2, 4, 3, 0.0F, true));
		can9_r1.cubeList.add(new ModelBox(can9_r1, 0, 0, 0.0F, -34.5F, -4.0F, 2, 4, 2, 0.0F, true));

		can6_r1 = new ModelRenderer(this);
		can6_r1.setRotationPoint(0.0F, 28.6438F, 38.8839F);
		bone.addChild(can6_r1);
		setRotationAngle(can6_r1, 0.409F, 0.0F, 0.0F);
		can6_r1.cubeList.add(new ModelBox(can6_r1, 0, 0, -2.0F, -30.5F, -8.0F, 5, 2, 4, 0.0F, true));

		can5_r1 = new ModelRenderer(this);
		can5_r1.setRotationPoint(0.0F, 32.6893F, 12.1371F);
		bone.addChild(can5_r1);
		setRotationAngle(can5_r1, -0.4461F, 0.0F, 0.0F);
		can5_r1.cubeList.add(new ModelBox(can5_r1, 0, 0, -1.0F, -34.5F, -4.0F, 3, 4, 2, 0.0F, true));

		can12_r1 = new ModelRenderer(this);
		can12_r1.setRotationPoint(0.0F, 21.2078F, 47.1868F);
		bone.addChild(can12_r1);
		setRotationAngle(can12_r1, 0.6692F, 0.0F, 0.0F);
		can12_r1.cubeList.add(new ModelBox(can12_r1, 0, 50, -0.5F, -35.0F, -9.0F, 2, 5, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}