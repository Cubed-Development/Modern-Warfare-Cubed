package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class GunCaseSmall extends ModelBase {
	private final ModelRenderer Shape22;
	private final ModelRenderer Shape23;
	private final ModelRenderer Shape24;
	private final ModelRenderer Shape25;
	private final ModelRenderer Shape32Hatch;
	private final ModelRenderer Shape39Hatch;
	private final ModelRenderer Shape44Hatch;
	private final ModelRenderer Shape46Hatch;
	private final ModelRenderer Shape51Hatch;
	private final ModelRenderer bone;

	public GunCaseSmall() {
		textureWidth = 128;
		textureHeight = 128;

		Shape22 = new ModelRenderer(this);
		Shape22.setRotationPoint(9.0F, 18.0F, -15.0F);
		setRotationAngle(Shape22, 0.0F, -0.8203F, 0.0F);
		Shape22.cubeList.add(new ModelBox(Shape22, 52, 29, 1.0F, 0.0F, 4.8F, 1, 4, 1, 0.0F, false));

		Shape23 = new ModelRenderer(this);
		Shape23.setRotationPoint(-11.0F, 18.0F, -10.0F);
		setRotationAngle(Shape23, 0.0F, 0.733F, 0.0F);
		Shape23.cubeList.add(new ModelBox(Shape23, 14, 52, 1.0F, 0.0F, 0.5F, 1, 4, 1, 0.0F, false));

		Shape24 = new ModelRenderer(this);
		Shape24.setRotationPoint(4.0F, 18.0F, 10.0F);
		setRotationAngle(Shape24, 0.0F, 0.733F, 0.0F);
		Shape24.cubeList.add(new ModelBox(Shape24, 0, 52, 1.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

		Shape25 = new ModelRenderer(this);
		Shape25.setRotationPoint(-9.0F, 18.0F, 8.0F);
		setRotationAngle(Shape25, 0.0F, -0.8203F, 0.0F);
		Shape25.cubeList.add(new ModelBox(Shape25, 16, 10, 1.0F, 0.0F, 0.3F, 1, 4, 2, 0.0F, false));

		Shape32Hatch = new ModelRenderer(this);
		Shape32Hatch.setRotationPoint(9.0F, 15.9F, -15.0F);
		setRotationAngle(Shape32Hatch, 0.0F, -0.8203F, 0.0F);
		Shape32Hatch.cubeList.add(new ModelBox(Shape32Hatch, 8, 40, 0.0F, 0.0F, 3.8F, 3, 2, 2, 0.0F, false));

		Shape39Hatch = new ModelRenderer(this);
		Shape39Hatch.setRotationPoint(6.5F, 15.9F, -5.0F);
		Shape39Hatch.cubeList.add(new ModelBox(Shape39Hatch, 56, 0, 0.0F, 0.0F, -1.0F, 2, 2, 12, 0.0F, false));

		Shape44Hatch = new ModelRenderer(this);
		Shape44Hatch.setRotationPoint(4.0F, 15.9F, 10.0F);
		setRotationAngle(Shape44Hatch, 0.0F, 0.733F, 0.0F);
		Shape44Hatch.cubeList.add(new ModelBox(Shape44Hatch, 0, 34, 0.0F, 0.0F, 1.0F, 3, 2, 2, 0.0F, false));

		Shape46Hatch = new ModelRenderer(this);
		Shape46Hatch.setRotationPoint(-9.0F, 15.9F, 8.0F);
		setRotationAngle(Shape46Hatch, 0.0F, -0.8203F, 0.0F);
		Shape46Hatch.cubeList.add(new ModelBox(Shape46Hatch, 12, 25, 0.0F, 0.0F, 1.3F, 3, 2, 2, 0.0F, false));

		Shape51Hatch = new ModelRenderer(this);
		Shape51Hatch.setRotationPoint(-11.0F, 15.9F, -10.0F);
		setRotationAngle(Shape51Hatch, 0.0F, 0.733F, 0.0F);
		Shape51Hatch.cubeList.add(new ModelBox(Shape51Hatch, 0, 18, 0.0F, 0.0F, -0.5F, 3, 2, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 56, 14, -9.99F, -10.3F, -10.0F, 17, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 56, 17, -9.99F, -10.3F, 8.0F, 17, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 52, 25, -9.99F, -10.3F, -6.0F, 17, 1, 12, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 7.0F, -9.3F, 6.0F, 2, 6, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 11, 0, 7.0F, -9.3F, -8.0F, 2, 6, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 54, 38, -11.5F, -8.1F, -10.0F, 2, 2, 20, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 54, 60, -9.0F, -8.1F, -12.5F, 15, 2, 25, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -10.0F, -10.1F, -11.0F, 17, 3, 22, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 36, 6.5F, -8.1F, -10.0F, 3, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 38, 6.5F, -8.1F, 8.0F, 3, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 10, -12.0F, -8.5F, 4.0F, 2, 3, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 13, -12.0F, -8.5F, -8.0F, 2, 3, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 42, 6.7F, -5.8F, -1.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 52, -10.0F, -7.01F, -10.0F, 17, 5, 20, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 25, -9.0F, -7.0F, -11.0F, 15, 5, 22, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 11.0F, -5.6F, -4.5F, 1, 1, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 10, 8.0F, -5.6F, 4.0F, 3, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 10, 20, 8.0F, -5.6F, -5.0F, 3, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 6, 52, 6.5F, -6.0F, -9.0F, 3, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 52, 25, 6.5F, -6.0F, 8.0F, 3, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 25, 6.7F, -7.0F, 3.0F, 3, 4, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 9, 29, 6.7F, -7.0F, -6.0F, 3, 4, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Shape22.render(f5);
		Shape23.render(f5);
		Shape24.render(f5);
		Shape25.render(f5);
		Shape32Hatch.render(f5);
		Shape39Hatch.render(f5);
		Shape44Hatch.render(f5);
		Shape46Hatch.render(f5);
		Shape51Hatch.render(f5);
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}