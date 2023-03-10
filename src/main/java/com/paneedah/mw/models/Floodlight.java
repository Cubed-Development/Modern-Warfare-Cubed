package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Floodlight extends ModelBase {
	private final ModelRenderer bone5;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;

	public Floodlight() {
		textureWidth = 64;
		textureHeight = 64;

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone5, 0.0F, -0.3927F, 0.0F);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, -4.0F);
		bone5.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 0, 40, -3.0F, -1.0F, 7.0F, 6, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 22, 0, -1.0F, -2.75F, -0.5F, 2, 2, 9, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 14, -1.0F, -3.25F, -0.5F, 2, 1, 9, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 6, 46, -1.0F, -5.75F, -0.5F, 2, 3, 1, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 46, -1.0F, -5.75F, 7.5F, 2, 3, 1, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 36, 34, -3.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.0683F, -12.6342F, 4.5F);
		bone5.addChild(bone3);
		setRotationAngle(bone3, -0.7854F, 0.0F, -0.3927F);
		bone3.cubeList.add(new ModelBox(bone3, 20, 46, -4.4692F, 4.6723F, -6.4092F, 1, 2, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.0683F, -12.6342F, 4.5F);
		bone5.addChild(bone2);
		setRotationAngle(bone2, 0.7854F, 0.0F, -0.3927F);
		bone2.cubeList.add(new ModelBox(bone2, 24, 46, -4.4692F, -1.6917F, -0.9548F, 1, 2, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.25F, -6.0F, 0.0F);
		bone5.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -0.3927F);
		bone.cubeList.add(new ModelBox(bone, 0, 24, -2.0F, -3.0F, -3.5F, 1, 3, 7, 0.2F, false));
		bone.cubeList.add(new ModelBox(bone, 22, 14, -3.0F, -3.0F, -3.5F, 1, 3, 7, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -4.0F, -4.5F, 2, 5, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 46, 0.443F, -3.9604F, -5.01F, 1, 4, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 33, 42, 0.4424F, -4.1F, -5.0F, 1, 1, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 32, 40, -0.7125F, -5.4387F, -4.75F, 1, 5, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 24, 40, -0.7125F, -6.8529F, 0.3358F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 14, 40, -0.7125F, -6.8529F, -3.3358F, 1, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 16, 24, -0.7125F, -6.8529F, -2.5858F, 1, 1, 5, 0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 33, 42, 0.4424F, 0.0396F, -5.0F, 1, 1, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 16, 46, 0.443F, -3.9604F, 4.01F, 1, 4, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 36, 40, -0.7125F, -5.4387F, 3.75F, 1, 5, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone5.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}