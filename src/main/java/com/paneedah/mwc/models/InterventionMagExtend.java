package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class InterventionMagExtend extends ModelWithAttachments {
	private final ModelRenderer maganize_10rnd;
	private final ModelRenderer Mag18_r1;
	private final ModelRenderer Mag18_r2;
	private final ModelRenderer Mag18_r3;
	private final ModelRenderer Mag10_r1;
	private final ModelRenderer Mag10_r2;
	private final ModelRenderer Mag10_r3;

	public InterventionMagExtend() {
		textureWidth = 512;
		textureHeight = 512;

		maganize_10rnd = new ModelRenderer(this);
		maganize_10rnd.setRotationPoint(1.5F, -7.2064F, -10.4511F);
		maganize_10rnd.cubeList.add(new ModelBox(maganize_10rnd, 28, 147, -1.5F, -7.2936F, 4.4511F, 3, 15, 2, 0.0F, false));
		maganize_10rnd.cubeList.add(new ModelBox(maganize_10rnd, 141, 117, -1.5F, -7.2936F, 1.4511F, 3, 15, 2, 0.0F, false));
		maganize_10rnd.cubeList.add(new ModelBox(maganize_10rnd, 56, 172, -1.5F, -7.2936F, -7.5489F, 3, 13, 2, 0.0F, false));
		maganize_10rnd.cubeList.add(new ModelBox(maganize_10rnd, 42, 172, -1.52F, -7.2936F, 2.9511F, 3, 15, 1, 0.0F, false));
		maganize_10rnd.cubeList.add(new ModelBox(maganize_10rnd, 66, 172, -1.52F, -7.2936F, -0.0489F, 3, 14, 1, 0.0F, false));
		maganize_10rnd.cubeList.add(new ModelBox(maganize_10rnd, 32, 172, -1.5F, -7.2936F, -1.5489F, 3, 14, 2, 0.0F, false));
		maganize_10rnd.cubeList.add(new ModelBox(maganize_10rnd, 69, 143, -1.5F, -7.2936F, -4.5489F, 3, 13, 2, 0.0F, false));
		maganize_10rnd.cubeList.add(new ModelBox(maganize_10rnd, 0, 85, -1.0F, -7.2936F, -5.5489F, 2, 13, 10, 0.01F, false));
		maganize_10rnd.cubeList.add(new ModelBox(maganize_10rnd, 32, 203, 0.2F, -8.0936F, -1.0489F, 1, 1, 7, -0.15F, false));
		maganize_10rnd.cubeList.add(new ModelBox(maganize_10rnd, 107, 211, -1.3F, -7.7936F, -7.5489F, 1, 1, 5, -0.15F, false));
		maganize_10rnd.cubeList.add(new ModelBox(maganize_10rnd, 185, 199, -1.4441F, -8.0766F, -1.0489F, 1, 1, 7, -0.15F, false));
		maganize_10rnd.cubeList.add(new ModelBox(maganize_10rnd, 109, 203, 0.3F, -7.7936F, -7.5489F, 1, 1, 5, -0.15F, false));

		Mag18_r1 = new ModelRenderer(this);
		Mag18_r1.setRotationPoint(0.7F, -7.2401F, -0.8954F);
		maganize_10rnd.addChild(Mag18_r1);
		setRotationAngle(Mag18_r1, 1.0036F, 0.0F, 0.0F);
		Mag18_r1.cubeList.add(new ModelBox(Mag18_r1, 112, 134, -2.1F, -0.5F, -0.3F, 1, 1, 1, -0.15F, false));
		Mag18_r1.cubeList.add(new ModelBox(Mag18_r1, 135, 4, -0.5F, -0.5F, -0.3F, 1, 1, 1, -0.15F, false));

		Mag18_r2 = new ModelRenderer(this);
		Mag18_r2.setRotationPoint(0.7F, -10.3199F, 5.8095F);
		maganize_10rnd.addChild(Mag18_r2);
		setRotationAngle(Mag18_r2, -1.0036F, 0.0F, 0.0F);
		Mag18_r2.cubeList.add(new ModelBox(Mag18_r2, 134, 78, -2.15F, 1.1F, 1.9F, 1, 1, 1, -0.15F, false));
		Mag18_r2.cubeList.add(new ModelBox(Mag18_r2, 96, 134, -0.5F, 1.1F, 1.9F, 1, 1, 1, -0.15F, false));

		Mag18_r3 = new ModelRenderer(this);
		Mag18_r3.setRotationPoint(-1.5F, 31.2064F, 10.4511F);
		maganize_10rnd.addChild(Mag18_r3);
		setRotationAngle(Mag18_r3, 1.4629F, 0.0F, 0.0F);
		Mag18_r3.cubeList.add(new ModelBox(Mag18_r3, 152, 111, 0.5F, -20.8F, 22.8F, 2, 14, 2, -0.01F, false));

		Mag10_r1 = new ModelRenderer(this);
		Mag10_r1.setRotationPoint(0.0F, 6.5549F, -0.8746F);
		maganize_10rnd.addChild(Mag10_r1);
		setRotationAngle(Mag10_r1, 1.4629F, 0.0F, 0.0F);
		Mag10_r1.cubeList.add(new ModelBox(Mag10_r1, 16, 26, -2.0F, -0.8F, -1.4F, 4, 8, 1, 0.0F, false));
		Mag10_r1.cubeList.add(new ModelBox(Mag10_r1, 12, 172, -2.0F, -6.8F, -1.5F, 4, 5, 1, 0.0F, false));

		Mag10_r2 = new ModelRenderer(this);
		Mag10_r2.setRotationPoint(-4.5F, 6.0918F, -5.1496F);
		maganize_10rnd.addChild(Mag10_r2);
		setRotationAngle(Mag10_r2, 1.4943F, 0.0762F, 0.7825F);
		Mag10_r2.cubeList.add(new ModelBox(Mag10_r2, 24, 94, 2.1F, 3.5F, 1.4F, 1, 8, 1, 0.0F, false));
		Mag10_r2.cubeList.add(new ModelBox(Mag10_r2, 18, 0, 2.1F, -2.5F, 1.4F, 1, 5, 1, 0.0F, false));

		Mag10_r3 = new ModelRenderer(this);
		Mag10_r3.setRotationPoint(1.5F, 6.0918F, -5.1496F);
		maganize_10rnd.addChild(Mag10_r3);
		setRotationAngle(Mag10_r3, 1.4943F, -0.0762F, -0.7825F);
		Mag10_r3.cubeList.add(new ModelBox(Mag10_r3, 24, 103, -1.0F, 3.5F, -0.7F, 1, 8, 1, 0.0F, false));
		Mag10_r3.cubeList.add(new ModelBox(Mag10_r3, 90, 75, -1.0F, -2.5F, -0.7F, 1, 5, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		maganize_10rnd.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
