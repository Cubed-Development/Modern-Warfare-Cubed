package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AR15Action extends ModelBase {
	private final ModelRenderer Action1;
	private final ModelRenderer Action2;
	private final ModelRenderer Action3;
	private final ModelRenderer Action4;
	private final ModelRenderer Action5;
	private final ModelRenderer Action6;
	private final ModelRenderer Action7;
	private final ModelRenderer bone;
	private final ModelRenderer Action7_r1;
	private final ModelRenderer Action9_r1;

	public AR15Action() {
		textureWidth = 40;
		textureHeight = 40;

		Action1 = new ModelRenderer(this);
		Action1.setRotationPoint(-0.3F, 0.0F, 0.0F);
		Action1.cubeList.add(new ModelBox(Action1, 0, 0, 0.0F, -0.001F, -0.099F, 2, 1, 15, 0.0F, false));

		Action2 = new ModelRenderer(this);
		Action2.setRotationPoint(-2.0F, -0.5F, 14.5F);
		Action2.cubeList.add(new ModelBox(Action2, 0, 11, 0.0F, -0.001F, 0.0F, 3, 2, 1, 0.0F, false));
		Action2.cubeList.add(new ModelBox(Action2, 0, 9, 2.1F, -0.102F, 0.101F, 4, 1, 1, -0.1F, false));
		Action2.cubeList.add(new ModelBox(Action2, 0, 3, 2.2F, 1.198F, 0.201F, 4, 1, 1, -0.2F, false));
		Action2.cubeList.add(new ModelBox(Action2, 0, 7, 2.101F, -0.103F, -0.099F, 4, 1, 1, -0.1F, false));
		Action2.cubeList.add(new ModelBox(Action2, 0, 5, 2.201F, 1.197F, -0.199F, 4, 1, 1, -0.2F, false));

		Action3 = new ModelRenderer(this);
		Action3.setRotationPoint(-2.0F, -0.5F, 14.5F);
		setRotationAngle(Action3, 0.0F, 0.5577F, 0.0F);
		Action3.cubeList.add(new ModelBox(Action3, 0, 16, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		Action4 = new ModelRenderer(this);
		Action4.setRotationPoint(4.0F, -0.5F, 14.5F);
		setRotationAngle(Action4, 0.0F, -2.1192F, 0.0F);
		Action4.cubeList.add(new ModelBox(Action4, 8, 9, -0.1F, -0.1F, -0.1F, 1, 1, 2, -0.1F, false));
		Action4.cubeList.add(new ModelBox(Action4, 9, 5, -0.2F, 1.2F, -0.2F, 1, 1, 2, -0.2F, false));
		Action4.cubeList.add(new ModelBox(Action4, 10, 16, -0.099F, -0.101F, 1.1F, 1, 1, 1, -0.1F, false));
		Action4.cubeList.add(new ModelBox(Action4, 6, 16, -0.199F, 1.199F, 1.2F, 1, 1, 1, -0.2F, false));

		Action5 = new ModelRenderer(this);
		Action5.setRotationPoint(-1.0F, -0.5F, 14.0F);
		Action5.cubeList.add(new ModelBox(Action5, 0, 0, 0.0F, 0.001F, 0.0F, 4, 2, 1, 0.0F, false));

		Action6 = new ModelRenderer(this);
		Action6.setRotationPoint(1.5F, 0.0F, 13.7F);
		setRotationAngle(Action6, 0.0F, 0.0744F, 0.0F);
		Action6.cubeList.add(new ModelBox(Action6, 7, 13, 0.2F, 0.098F, 0.0F, 3, 1, 1, -0.2F, false));

		Action7 = new ModelRenderer(this);
		Action7.setRotationPoint(1.3F, 0.0F, 0.0F);
		Action7.cubeList.add(new ModelBox(Action7, 0, 16, 0.0F, 0.0F, -0.1F, 1, 1, 15, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(2.7F, 1.098F, 11.7F);
		

		Action7_r1 = new ModelRenderer(this);
		Action7_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(Action7_r1);
		setRotationAngle(Action7_r1, 0.0F, 0.1222F, 0.0F);
		Action7_r1.cubeList.add(new ModelBox(Action7_r1, 9, 1, -1.1F, -0.999F, 0.4F, 1, 1, 2, -0.2F, false));

		Action9_r1 = new ModelRenderer(this);
		Action9_r1.setRotationPoint(1.9F, 0.152F, 2.8F);
		bone.addChild(Action9_r1);
		setRotationAngle(Action9_r1, 0.0F, -1.0297F, 0.0F);
		Action9_r1.cubeList.add(new ModelBox(Action9_r1, 5, 18, -1.0F, -1.1F, -1.6F, 1, 1, 1, 0.0F, false));
		Action9_r1.cubeList.add(new ModelBox(Action9_r1, 9, 18, -1.001F, -1.101F, -1.0F, 1, 1, 1, 0.0F, false));
		Action9_r1.cubeList.add(new ModelBox(Action9_r1, 17, 16, -0.998F, -1.401F, -1.599F, 1, 1, 1, 0.0F, false));
		Action9_r1.cubeList.add(new ModelBox(Action9_r1, 17, 18, -0.999F, -1.4F, -0.999F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Action1.render(f5);
		Action2.render(f5);
		Action3.render(f5);
		Action4.render(f5);
		Action5.render(f5);
		Action6.render(f5);
		Action7.render(f5);
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
