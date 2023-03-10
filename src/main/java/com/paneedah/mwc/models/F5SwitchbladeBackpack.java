package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class F5SwitchbladeBackpack extends ModelBiped {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer backpack;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone5;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone6;
	private final ModelRenderer bone;
	private final ModelRenderer bone4;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;

	public F5SwitchbladeBackpack() {
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

		backpack = new ModelRenderer(this);
		backpack.setRotationPoint(0.0F, 0.0F, 0.0F);
		backpack.cubeList.add(new ModelBox(backpack, 16, 40, -3.0F, 1.0F, 2.0F, 6, 5, 3, 0.0F, false));
		backpack.cubeList.add(new ModelBox(backpack, 4, 53, 2.35F, 0.0F, 1.25F, 1, 5, 1, 0.0F, false));
		backpack.cubeList.add(new ModelBox(backpack, 0, 53, -3.35F, 0.0F, 1.25F, 1, 5, 1, 0.0F, false));
		backpack.cubeList.add(new ModelBox(backpack, 48, 48, -3.35F, -0.25F, -2.0F, 1, 1, 4, 0.0F, false));
		backpack.cubeList.add(new ModelBox(backpack, 12, 48, 2.35F, -0.25F, -2.0F, 1, 1, 4, 0.0F, false));
		backpack.cubeList.add(new ModelBox(backpack, 4, 6, 2.35F, 0.0F, -2.25F, 1, 1, 1, 0.0F, false));
		backpack.cubeList.add(new ModelBox(backpack, 0, 6, -3.35F, 0.0F, -2.25F, 1, 1, 1, 0.0F, false));
		backpack.cubeList.add(new ModelBox(backpack, 40, 52, -3.85F, 0.75F, -2.401F, 2, 5, 1, 0.0F, false));
		backpack.cubeList.add(new ModelBox(backpack, 24, 22, -2.0F, 4.3F, -2.5F, 4, 1, 1, 0.0F, false));
		backpack.cubeList.add(new ModelBox(backpack, 48, 8, 1.85F, 0.75F, -2.401F, 2, 5, 1, 0.0F, false));
		backpack.cubeList.add(new ModelBox(backpack, 40, 26, -3.0F, 6.0F, 3.75F, 6, 4, 1, 0.0F, false));
		backpack.cubeList.add(new ModelBox(backpack, 36, 16, -3.5F, 2.0F, 2.0F, 7, 8, 2, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(1.85F, 5.75F, -2.4F);
		backpack.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, -0.4014F);
		bone14.cubeList.add(new ModelBox(bone14, 9, 48, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 29, 47, 0.5745F, 1.3626F, 0.05F, 1, 1, 5, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-1.85F, 5.75F, -2.4F);
		backpack.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, 0.4014F);
		bone15.cubeList.add(new ModelBox(bone15, 12, 32, -2.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 24, 16, -1.6722F, 1.1324F, 0.05F, 1, 1, 5, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(2.9F, 10.25F, 4.75F);
		backpack.addChild(bone11);
		setRotationAngle(bone11, -0.2443F, 0.0F, 1.3614F);
		bone11.cubeList.add(new ModelBox(bone11, 16, 32, -1.0F, 0.0F, -3.0F, 1, 3, 3, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-2.9F, 10.25F, 4.75F);
		backpack.addChild(bone12);
		setRotationAngle(bone12, -0.2443F, 0.0F, -1.3614F);
		bone12.cubeList.add(new ModelBox(bone12, 0, 0, 0.0F, 0.0F, -3.0F, 1, 3, 3, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-1.0F, 10.85F, 4.3F);
		backpack.addChild(bone13);
		setRotationAngle(bone13, 0.0524F, 0.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 24, 0, 0.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(4.1F, 6.0F, 2.5F);
		backpack.addChild(bone5);
		setRotationAngle(bone5, 0.0F, -0.1571F, 0.0873F);
		bone5.cubeList.add(new ModelBox(bone5, 52, 12, -1.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(3.9F, 6.0F, 1.8F);
		backpack.addChild(bone7);
		setRotationAngle(bone7, -0.0873F, -0.1571F, 0.8029F);
		bone7.cubeList.add(new ModelBox(bone7, 24, 4, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.9F, 6.0F, 1.8F);
		backpack.addChild(bone8);
		setRotationAngle(bone8, -0.0873F, 0.1571F, -0.8029F);
		bone8.cubeList.add(new ModelBox(bone8, 20, 16, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-4.1F, 6.0F, 2.5F);
		backpack.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.1571F, -0.0873F);
		bone6.cubeList.add(new ModelBox(bone6, 50, 34, 0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.4F, 4.9F);
		backpack.addChild(bone);
		setRotationAngle(bone, -0.1745F, 0.0524F, 0.2094F);
		bone.cubeList.add(new ModelBox(bone, 0, 48, 0.0F, 0.0F, -3.0F, 3, 2, 3, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.75F, 5.4F);
		backpack.addChild(bone4);
		setRotationAngle(bone4, 0.1222F, -0.1047F, -0.0873F);
		bone4.cubeList.add(new ModelBox(bone4, 52, 40, -3.0F, 0.0F, -1.0F, 3, 2, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 2.7F, 5.6F);
		backpack.addChild(bone9);
		setRotationAngle(bone9, -0.0524F, -0.1047F, -0.0349F);
		bone9.cubeList.add(new ModelBox(bone9, 48, 0, -2.0F, 0.0F, -1.0F, 2, 7, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 2.7F, 5.6F);
		backpack.addChild(bone10);
		setRotationAngle(bone10, -0.0524F, 0.1047F, 0.0349F);
		bone10.cubeList.add(new ModelBox(bone10, 22, 48, 0.0F, 0.0F, -1.0F, 2, 7, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.75F, 5.4F);
		backpack.addChild(bone3);
		setRotationAngle(bone3, 0.1222F, 0.1047F, 0.0873F);
		bone3.cubeList.add(new ModelBox(bone3, 49, 31, 0.0F, 0.0F, -1.0F, 3, 2, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.4F, 4.9F);
		backpack.addChild(bone2);
		setRotationAngle(bone2, -0.1745F, -0.0349F, -0.2269F);
		bone2.cubeList.add(new ModelBox(bone2, 40, 31, -3.0F, 0.0F, -3.0F, 3, 2, 3, 0.0F, false));
	
		bipedLeftArm.isHidden = true;
		bipedRightArm.isHidden = true;
		bipedBody = backpack;
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
