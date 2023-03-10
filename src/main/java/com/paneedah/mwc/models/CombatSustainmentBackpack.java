package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class CombatSustainmentBackpack extends ModelBiped {
	private final ModelRenderer backpack;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;

	public CombatSustainmentBackpack() {
		textureWidth = 64;
		textureHeight = 64;

		backpack = new ModelRenderer(this);
		backpack.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.0F, 4.0F, 5.0F);
		backpack.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1589F, -0.6919F, -0.1019F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 23, -1.0F, -4.0F, -1.0F, 1, 4, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.0F, 4.0F, 5.0F);
		backpack.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1567F, -0.6747F, 0.0984F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 48, -1.0F, 0.0F, -1.0F, 1, 6, 1, -0.001F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.0F, 4.0F, 5.0F);
		backpack.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1589F, 0.6919F, 0.1019F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 41, 0.0F, -4.0F, -1.0F, 1, 4, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.5F, 4.0F, 5.0F);
		backpack.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1222F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 47, -0.15F, 0.0F, -3.8F, 1, 6, 3, 0.001F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 48, 6.15F, 0.0F, -3.8F, 1, 6, 3, 0.001F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 32, 0.5F, 0.0F, -3.0F, 6, 6, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(3.5F, 4.0F, 5.0F);
		backpack.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1222F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.85F, -4.0F, -3.8F, 1, 4, 3, 0.002F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 0, -7.15F, -4.0F, -3.8F, 1, 4, 3, 0.002F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 16, -6.5F, -4.0F, -3.0F, 6, 4, 3, 0.001F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.3F, 0.2F, -2.6F);
		backpack.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0349F, -0.0012F, 0.2269F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 48, -1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.3F, 0.2F, -2.6F);
		backpack.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0349F, 0.0012F, -0.2269F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 41, 48, 0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(3.5F, -0.4F, 2.5F);
		backpack.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0349F, 0.0349F, 0.0018F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 23, -1.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.5F, -0.4F, 2.5F);
		backpack.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0349F, -0.0349F, -0.0018F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 41, 0.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(4.25F, 7.0F, 2.3F);
		backpack.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.4019F, -0.0482F, 0.0205F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 42, -1.0F, -1.0F, -5.0F, 1, 1, 5, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-4.25F, 7.0F, 2.3F);
		backpack.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.4019F, 0.0482F, -0.0205F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 45, 36, 0.0F, -1.0F, -5.0F, 1, 1, 5, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-3.2F, 1.6F, 4.7F);
		backpack.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0527F, -0.0693F, -0.0085F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 29, 0.0F, -1.0F, -2.0F, 5, 1, 2, 0.001F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.0F, 4.0F, 5.0F);
		backpack.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.1567F, 0.6747F, -0.0984F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 22, 48, 0.0F, 0.0F, -1.0F, 1, 6, 1, -0.001F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 2.2F, 6.4F);
		backpack.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.1464F, -0.2224F, -0.0329F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 48, 4, -3.0F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 2.2F, 6.4F);
		backpack.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.1464F, 0.2224F, 0.0329F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 0, 0.0F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 7.7F, 6.5F);
		backpack.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.14F, 0.2227F, -0.0307F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 8, 48, 0.0F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 4.5F, 6.7F);
		backpack.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.0462F, -0.2226F, 0.0067F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 46, 42, -3.0F, 0.0F, -2.0F, 3, 3, 2, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 4.5F, 6.7F);
		backpack.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.0462F, 0.2226F, -0.0067F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 47, 23, 0.0F, 0.0F, -2.0F, 3, 3, 2, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 7.7F, 6.5F);
		backpack.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.14F, -0.2227F, 0.0307F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 48, 8, -3.0F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 16, 32, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 32, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 24, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		
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
//		rightarm.render(f5);
//		leftarm.render(f5);
//		rightleg.render(f5);
//		leftleg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
