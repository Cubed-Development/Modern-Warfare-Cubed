package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Dufflebag extends ModelBiped {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer dufflebag;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public Dufflebag() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 16, 40, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 36, 36, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 32, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		dufflebag = new ModelRenderer(this);
		dufflebag.setRotationPoint(0.0F, 0.0F, 0.0F);
		dufflebag.cubeList.add(new ModelBox(dufflebag, 30, 19, -3.75F, 0.0F, -2.0F, 1, 1, 4, 0.1F, false));
		dufflebag.cubeList.add(new ModelBox(dufflebag, 24, 18, 3.0F, 8.0F, -2.0F, 1, 1, 4, 0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.0F, 9.0F, -2.0F);
		dufflebag.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.8727F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -10.5F, -1.0F, -0.001F, 1, 1, 1, 0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 16, -10.0F, -1.0F, -0.002F, 10, 1, 1, 0.1F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(5.75F, 10.0F, 7.75F);
		dufflebag.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -0.6109F);
		bone.cubeList.add(new ModelBox(bone, 40, 16, -5.2543F, -13.001F, -5.75F, 5, 13, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 61, 16, -5.05F, -13.9F, -5.75F, 5, 15, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 48, -0.7F, -13.001F, -5.75F, 1, 13, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.5F, 0.0F, -3.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.3927F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 24, -5.0F, -13.0F, -3.0F, 5, 13, 3, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-6.5F, 0.0F, -3.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.3927F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 48, 0.0F, -13.0F, -3.0F, 3, 13, 3, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-6.5F, 0.0F, -3.0F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.3927F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 0, 0.0F, -13.0F, 0.0F, 3, 13, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.5F, 0.0F, -3.0F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.3927F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 52, -2.0F, -13.0F, 0.0F, 2, 13, 3, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.5F, 0.0F, 1.0F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.3927F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 49, 49, 0.0F, -13.0F, -3.0F, 3, 13, 3, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.5F, 0.0F, 1.0F);
		bone.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -0.3927F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 52, 29, -3.0F, -13.0F, -2.0F, 3, 13, 2, 0.0F, false));
	
		bipedLeftArm.isHidden = true;
		bipedRightArm.isHidden = true;
		bipedBody = dufflebag;
		bipedLeftLeg.isHidden = true;
		bipedRightLeg.isHidden = true;
		bipedHead.isHidden = true;
		bipedHeadwear.isHidden = true;
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
//		backpack.render(f5);
//		head.render(f5);
//		body.render(f5);
//		leftarm.render(f5);
//		rightarm.render(f5);
//		rightleg.render(f5);
//		leftleg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
