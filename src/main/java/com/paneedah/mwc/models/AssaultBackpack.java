package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AssaultBackpack extends ModelBiped {
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
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;

	public AssaultBackpack() {
		textureWidth = 64;
		textureHeight = 64;

		backpack = new ModelRenderer(this);
		backpack.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.5F, 2.0F, 5.8F);
		backpack.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1041F, -0.8351F, 0.0773F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 48, -1.0F, 0.0F, -1.0F, 1, 9, 1, -0.001F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.5F, 2.0F, 5.8F);
		backpack.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1041F, 0.8351F, -0.0773F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 48, 0.0F, 0.0F, -1.0F, 1, 9, 1, -0.001F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.5F, 2.0F, 5.8F);
		backpack.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0698F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 16, -0.25F, 0.0F, -4.7F, 1, 9, 4, 0.001F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 45, -5.75F, 0.0F, -4.7F, 1, 9, 4, 0.001F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 32, -5.0F, 0.0F, -4.0F, 5, 9, 4, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.55F, -0.15F, -2.35F);
		backpack.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0361F, 0.1557F, 0.0788F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.35F, 5.25F, -2.45F);
		backpack.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0754F, 0.1957F, 0.4489F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 16, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(3.35F, 5.25F, -2.45F);
		backpack.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0754F, -0.1957F, -0.4489F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 32, -1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(3.55F, -0.15F, -2.35F);
		backpack.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.0361F, -0.1557F, -0.0788F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 48, 4, -2.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.85F, -0.15F, 2.75F);
		backpack.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0524F, -0.1396F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 45, 24, -2.0F, 0.0F, -5.0F, 2, 1, 5, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.85F, -0.15F, 2.75F);
		backpack.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0524F, 0.1396F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 46, 11, 0.0F, 0.0F, -5.0F, 2, 1, 5, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(3.3F, 9.15F, 5.0F);
		backpack.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.1577F, 0.4995F, -0.0956F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 36, 16, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.001F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.3F, 9.15F, 5.0F);
		backpack.addChild(cube_r11);
		setRotationAngle(cube_r11, -1.1227F, -1.2438F, 1.1436F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 32, -3.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(3.3F, 9.15F, 5.0F);
		backpack.addChild(cube_r12);
		setRotationAngle(cube_r12, -1.1227F, 1.2438F, -1.1436F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 32, 0.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.3F, 9.15F, 5.0F);
		backpack.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.1577F, -0.4995F, 0.0956F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 18, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.001F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.3F, 5.15F, 5.3F);
		backpack.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.7805F, -1.3737F, 0.7903F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 34, -3.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-3.3F, 5.15F, 5.3F);
		backpack.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.1577F, -0.4995F, 0.0956F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 39, 17, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.001F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(3.3F, 5.15F, 5.3F);
		backpack.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.1577F, 0.4995F, -0.0956F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 29, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.001F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-4.4F, 8.25F, 2.7F);
		backpack.addChild(cube_r17);
		setRotationAngle(cube_r17, -1.2376F, -1.3512F, 1.2596F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 24, 0, -5.0F, 0.0F, -1.0F, 5, 1, 1, -0.2F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(4.4F, 8.25F, 2.7F);
		backpack.addChild(cube_r18);
		setRotationAngle(cube_r18, -1.2376F, 1.3512F, -1.2596F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 2, 0.0F, 0.0F, -1.0F, 5, 1, 1, -0.2F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(3.3F, 5.15F, 5.3F);
		backpack.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.7805F, 1.3737F, -0.7903F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 34, 0.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-2.5F, 2.45F, 6.2F);
		backpack.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.1047F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 46, 30, 0.0F, 0.0F, -2.0F, 5, 3, 2, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.5F, 4.75F, 6.2F);
		backpack.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0175F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 38, 45, 0.0F, 1.0F, -2.0F, 5, 5, 2, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(2.7F, 0.5F, 2.1F);
		backpack.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.2012F, -0.0409F, -0.3995F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 16, -2.0F, 0.0F, 0.0F, 2, 1, 2, 0.001F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-2.7F, 0.5F, 2.1F);
		backpack.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.2012F, 0.0409F, 0.3995F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 24, 4, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.001F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-2.5F, 0.4F, 2.1F);
		backpack.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.1047F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 44, 0, 0.0F, 0.0F, 0.0F, 5, 2, 2, 0.002F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-2.5F, 2.0F, 5.8F);
		backpack.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.576F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 48, 0.0F, 0.0F, -2.0F, 5, 2, 2, 0.001F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 24, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 32, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 16, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		
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
