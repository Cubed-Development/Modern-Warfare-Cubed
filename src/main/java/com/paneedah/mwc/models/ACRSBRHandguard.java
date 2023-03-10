package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ACRSBRHandguard extends ModelBase {
	private final ModelRenderer handguard1;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone6;
	private final ModelRenderer bone2;
	private final ModelRenderer ACR109;
	private final ModelRenderer bone5;
	private final ModelRenderer ACR2;
	private final ModelRenderer bone7;
	private final ModelRenderer ACR111;

	public ACRSBRHandguard() {
		textureWidth = 128;
		textureHeight = 128;

		handguard1 = new ModelRenderer(this);
		handguard1.setRotationPoint(0.3F, -15.4F, -49.0F);
		handguard1.cubeList.add(new ModelBox(handguard1, 0, 0, -3.1F, 4.1F, -3.0F, 2, 1, 29, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 0, 30, -1.5F, 4.1F, -3.0F, 1, 1, 29, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 8, 1, -1.6F, 4.8F, 21.0F, 1, 1, 4, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 0, 0, -3.0F, 4.8F, 21.0F, 2, 1, 4, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 5, 11, -1.5F, 4.6F, 23.0F, 1, 1, 1, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 8, 2, -3.1F, 4.6F, 23.0F, 1, 1, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard1.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 89, 0.0F, 1.15F, -3.0F, 1, 1, 27, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 11, 0.01F, -0.3F, 21.0F, 1, 3, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 0, 0.01F, 1.7F, 24.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 6, 6, -4.59F, 1.7F, 24.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 22, 0, 0.01F, -0.3F, 15.0F, 1, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 22, 22, 0.01F, -0.3F, 9.0F, 1, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 6, 22, 0.01F, -0.3F, 3.0F, 1, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 21, 0.01F, -0.3F, -3.0F, 1, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 30, 62, 0.0F, 2.7F, -3.0F, 1, 1, 28, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 60, 62, 0.0F, -0.4F, -3.0F, 1, 1, 27, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.0F, 3.7F, -3.0F);
		bone.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.8203F);
		bone3.cubeList.add(new ModelBox(bone3, 34, 2, -1.0F, 0.0F, 0.0F, 1, 2, 28, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-4.6F, 3.7F, -3.0F);
		bone.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.8203F);
		bone4.cubeList.add(new ModelBox(bone4, 32, 32, 0.0F, 0.0F, 0.0F, 1, 2, 28, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-4.6F, 0.0F, 0.0F);
		handguard1.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 64, 0, 0.0F, 1.15F, -3.0F, 1, 1, 27, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 62, 32, 0.0F, -0.4F, -3.0F, 1, 1, 27, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 6, 6, 4.5F, 0.3F, -1.0F, 1, 1, 4, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 5, 0.1F, 0.3F, -1.0F, 1, 1, 4, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 10, -0.01F, -0.3F, 21.0F, 1, 3, 3, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 19, 11, -0.01F, -0.3F, 15.0F, 1, 3, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 18, 19, -0.01F, -0.3F, 9.0F, 1, 3, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 12, 19, -0.01F, -0.3F, 3.0F, 1, 3, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 18, 3, -0.01F, -0.3F, -3.0F, 1, 3, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 60, 0.0F, 2.7F, -3.0F, 1, 1, 28, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.0F, -1.1F, 24.0F);
		handguard1.addChild(bone2);
		setRotationAngle(bone2, -0.7679F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 13, 14, -1.0F, 0.5035F, 0.4863F, 1, 2, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 13, 8, -5.6F, 0.5035F, 0.4863F, 1, 2, 3, 0.0F, false));

		ACR109 = new ModelRenderer(this);
		ACR109.setRotationPoint(1.0F, -15.8F, -49.0F);
		setRotationAngle(ACR109, 0.0F, 0.0F, 2.5133F);
		ACR109.cubeList.add(new ModelBox(ACR109, 6, 17, 0.0F, 0.0F, -2.0F, 1, 3, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 3.0F, -2.0F);
		ACR109.addChild(bone5);
		setRotationAngle(bone5, 0.3316F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 5, 0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

		ACR2 = new ModelRenderer(this);
		ACR2.setRotationPoint(-4.0F, -15.8F, -49.0F);
		setRotationAngle(ACR2, 0.0F, 0.0F, -2.5133F);
		ACR2.cubeList.add(new ModelBox(ACR2, 0, 16, -1.0F, 0.0F, -2.0F, 1, 3, 2, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 3.0F, -2.0F);
		ACR2.addChild(bone7);
		setRotationAngle(bone7, 0.3316F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -1.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

		ACR111 = new ModelRenderer(this);
		ACR111.setRotationPoint(-1.3F, -18.3F, -51.0F);
		ACR111.cubeList.add(new ModelBox(ACR111, 18, 8, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		ACR111.cubeList.add(new ModelBox(ACR111, 14, 0, -1.4F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard1.render(f5);
		ACR109.render(f5);
		ACR2.render(f5);
		ACR111.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
