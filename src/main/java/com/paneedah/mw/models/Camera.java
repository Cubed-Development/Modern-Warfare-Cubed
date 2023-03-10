package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Camera extends ModelBase {
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone6;

	public Camera() {
		textureWidth = 80;
		textureHeight = 80;

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-4.0F, 18.5F, -5.75F);
		setRotationAngle(bone3, -0.4363F, -0.7854F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 30, 15, 5.2592F, -0.4377F, -6.0019F, 3, 1, 11, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, 4.2592F, -3.7126F, -6.0F, 5, 1, 11, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 20, 0, 8.5F, -3.92F, -6.451F, 1, 3, 12, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 12, 5.75F, -4.3617F, -6.45F, 2, 1, 12, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 29, 44, 7.97F, -3.15F, -6.0019F, 1, 3, 11, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 39, 5.2592F, -3.4377F, -6.002F, 3, 3, 10, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 16, 33, 4.58F, -3.15F, -6.0019F, 1, 3, 11, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 16, 16, 4.0F, -3.92F, -6.451F, 1, 3, 12, -0.2F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(12.5374F, 0.9588F, -2.4245F);
		bone3.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.7854F);
		bone4.cubeList.add(new ModelBox(bone4, 44, 27, -2.7448F, -4.3055F, -3.5755F, 1, 1, 11, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 34, 0, -4.8674F, -6.4088F, -3.5755F, 1, 1, 11, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(3.936F, -6.0859F, -1.0709F);
		bone3.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, 1.309F);
		bone.cubeList.add(new ModelBox(bone, 30, 30, 2.1751F, -1.6334F, -5.3791F, 1, 2, 12, -0.2F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(14.5426F, -1.6033F, -10.6837F);
		bone3.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -1.309F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 25, -0.1185F, -7.6607F, 4.2337F, 1, 2, 12, -0.2F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, 0.75F, -6.5F, -2.75F, 2, 2, 2, 0.2F, false));
		bone6.cubeList.add(new ModelBox(bone6, 42, 44, 0.75F, -4.35F, -7.75F, 2, 1, 7, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 4, 0.25F, -5.5F, -7.75F, 3, 4, 0, 0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone3.render(f5);
		bone6.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}