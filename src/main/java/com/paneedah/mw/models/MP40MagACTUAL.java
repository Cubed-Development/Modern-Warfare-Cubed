package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class MP40MagACTUAL extends ModelBase {
	private final ModelRenderer gun102;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;

	public MP40MagACTUAL() {
		textureWidth = 256;
		textureHeight = 128;

		gun102 = new ModelRenderer(this);
		gun102.setRotationPoint(1.2F, -9.0F, -19.5F);
		gun102.cubeList.add(new ModelBox(gun102, 0, 0, 0.0F, 0.0F, -0.01F, 2, 23, 1, 0.0F, true));
		gun102.cubeList.add(new ModelBox(gun102, 0, 0, 0.0F, 0.0F, 1.49F, 2, 18, 1, 0.0F, true));
		gun102.cubeList.add(new ModelBox(gun102, 0, 0, 0.0F, 0.0F, 2.99F, 2, 18, 1, 0.0F, true));
		gun102.cubeList.add(new ModelBox(gun102, 0, 0, 1.6F, 0.0F, 2.99F, 1, 18, 1, 0.0F, true));
		gun102.cubeList.add(new ModelBox(gun102, 0, 0, 1.6F, 18.0F, 0.99F, 1, 4, 3, 0.0F, true));
		gun102.cubeList.add(new ModelBox(gun102, 0, 0, 0.0F, 18.0F, 0.99F, 1, 4, 3, 0.0F, true));
		gun102.cubeList.add(new ModelBox(gun102, 0, 0, 1.6F, 0.0F, 1.49F, 1, 18, 1, 0.0F, true));
		gun102.cubeList.add(new ModelBox(gun102, 0, 0, 1.5F, 0.0F, 0.99F, 1, 23, 2, 0.0F, true));
		gun102.cubeList.add(new ModelBox(gun102, 0, 0, 0.1F, 0.0F, 0.99F, 1, 23, 2, 0.0F, true));
		gun102.cubeList.add(new ModelBox(gun102, 0, 0, 0.6F, 0.0F, 0.0F, 2, 23, 1, 0.0F, true));
		gun102.cubeList.add(new ModelBox(gun102, 0, 0, -0.2F, 22.0F, 0.1F, 3, 1, 4, 0.0F, true));
		gun102.cubeList.add(new ModelBox(gun102, 0, 0, 0.3F, -5.0F, 0.0F, 2, 5, 4, 0.0F, true));
		gun102.cubeList.add(new ModelBox(gun102, 0, 0, 0.8F, -5.25F, 3.15F, 1, 28, 1, 0.0F, true));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.25F, 0.0F, 0.5F);
		gun102.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -0.7854F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0607F, 0.0607F, 0.0F, 1, 1, 3, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(2.35F, -4.9F, 0.0F);
		gun102.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0698F, -2.0769F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -0.05F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.2F, -4.8F, 0.0F);
		gun102.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -0.0698F, 2.0769F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -1.05F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun102.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}