package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M43AChestHarness extends ModelBiped {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer chestharness;
	private final ModelRenderer bone10;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone11;
	private final ModelRenderer bone6;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone7;
	private final ModelRenderer bone5;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone2;

	public M43AChestHarness() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 36, 36, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 32, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 24, 24, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		chestharness = new ModelRenderer(this);
		chestharness.setRotationPoint(0.0F, 0.0F, 0.0F);
		chestharness.cubeList.add(new ModelBox(chestharness, 24, 16, -3.999F, 6.0F, -2.75F, 8, 5, 1, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 20, 16, -3.4F, 3.25F, -2.65F, 1, 3, 1, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 0, 16, 2.4F, 3.25F, -2.65F, 1, 3, 1, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 38, 20, 1.9F, -0.25F, -2.25F, 2, 1, 4, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 16, 41, 1.9F, -0.251F, 1.15F, 2, 1, 1, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 30, 0, -3.9F, -0.251F, 1.15F, 2, 1, 1, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 16, 36, -3.9F, -0.25F, -2.25F, 2, 1, 4, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 0, 32, 3.1F, 9.7F, 1.25F, 1, 1, 1, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 24, 22, -4.1F, 9.7F, 1.251F, 8, 1, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-2.6F, 11.5F, -4.15F);
		chestharness.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.3316F, 0.0524F);
		bone10.cubeList.add(new ModelBox(bone10, 24, 0, -2.0F, -5.0F, 0.0F, 2, 5, 2, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-0.2F, 11.6F, -4.35F);
		chestharness.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.1047F, 0.0175F);
		bone12.cubeList.add(new ModelBox(bone12, 0, 0, -2.0F, -5.0F, 0.0F, 2, 5, 2, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.2F, 11.6F, -4.35F);
		chestharness.addChild(bone13);
		setRotationAngle(bone13, 0.0F, -0.1047F, -0.0175F);
		bone13.cubeList.add(new ModelBox(bone13, 46, 18, 0.0F, -4.0F, 0.0F, 2, 4, 2, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 22, 41, -0.0716F, -5.0016F, 0.1081F, 2, 2, 1, -0.1F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(2.6F, 11.5F, -4.15F);
		chestharness.addChild(bone11);
		setRotationAngle(bone11, 0.0F, -0.3316F, -0.0524F);
		bone11.cubeList.add(new ModelBox(bone11, 24, 47, 0.0F, -4.0F, 0.0F, 2, 4, 2, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 36, 25, -0.0025F, -5.2036F, 0.1066F, 2, 2, 1, -0.1F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(3.9F, 0.45F, 2.55F);
		chestharness.addChild(bone6);
		setRotationAngle(bone6, -0.0524F, 0.0F, 0.2793F);
		bone6.cubeList.add(new ModelBox(bone6, 18, 32, -2.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(2.9F, 3.05F, 2.35F);
		chestharness.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, 0.8727F);
		bone8.cubeList.add(new ModelBox(bone8, 0, 48, -1.0F, 0.0F, -0.97F, 1, 8, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 24, 26, -1.0F, 7.75F, -1.0F, 1, 1, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-2.9F, 3.05F, 2.35F);
		chestharness.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, -0.8727F);
		bone9.cubeList.add(new ModelBox(bone9, 32, 47, 0.0F, 0.0F, -1.0F, 1, 8, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 24, 24, 0.0F, 7.75F, -1.0F, 1, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-3.9F, 0.45F, 2.55F);
		chestharness.addChild(bone7);
		setRotationAngle(bone7, -0.0524F, 0.0F, -0.2793F);
		bone7.cubeList.add(new ModelBox(bone7, 12, 32, 0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(3.9F, 3.25F, -2.75F);
		chestharness.addChild(bone5);
		setRotationAngle(bone5, -0.1047F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 40, 32, -2.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 30, 40, -7.8F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(4.65F, 6.0F, -2.25F);
		chestharness.addChild(bone);
		setRotationAngle(bone, -0.2967F, -0.0349F, 0.0349F);
		bone.cubeList.add(new ModelBox(bone, 44, 12, -0.986F, -0.0209F, 0.1984F, 1, 2, 4, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(4.65F, 8.0F, -2.5516F);
		chestharness.addChild(bone3);
		setRotationAngle(bone3, -0.0175F, -0.0349F, 0.1222F);
		bone3.cubeList.add(new ModelBox(bone3, 40, 25, -0.986F, -0.0209F, 0.0F, 1, 3, 4, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-4.65F, 8.0F, -2.5516F);
		chestharness.addChild(bone4);
		setRotationAngle(bone4, -0.0175F, 0.0349F, -0.1222F);
		bone4.cubeList.add(new ModelBox(bone4, 24, 40, 0.014F, -0.0209F, 0.0F, 1, 3, 4, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-4.65F, 6.0F, -2.25F);
		chestharness.addChild(bone2);
		setRotationAngle(bone2, -0.2967F, 0.0349F, -0.0349F);
		bone2.cubeList.add(new ModelBox(bone2, 16, 43, 0.014F, -0.0209F, 0.1984F, 1, 2, 4, 0.0F, false));

		bipedLeftArm.isHidden = true;
		bipedRightArm.isHidden = true;
		bipedBody = chestharness;
		bipedLeftLeg.isHidden = true;
		bipedRightLeg.isHidden = true;
		bipedHead.isHidden = true;
		bipedHeadwear.isHidden = true;
		
    }

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		if(entity != null) {
//			super.render(entity, f, f1, f2, f3, f4, f5);
//		} else vest.render(f5);
		
		super.render(entity, f, f1, f2, f3, f4, f5);
//		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
//		vest.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
