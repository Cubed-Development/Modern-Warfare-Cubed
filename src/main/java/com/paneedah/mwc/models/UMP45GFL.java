package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UMP45GFL extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer body_r5;
	private final ModelRenderer body_r6;
	private final ModelRenderer body_r7;
	private final ModelRenderer rightarm;
	private final ModelRenderer rightarm_r1;
	private final ModelRenderer bone;
	private final ModelRenderer rightarm_r2;
	private final ModelRenderer gun;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer leftarm;
	private final ModelRenderer leftarm_r1;
	private final ModelRenderer rightleg;
	private final ModelRenderer rightleg_r1;
	private final ModelRenderer leftleg;
	private final ModelRenderer leftleg_r1;
	private final ModelRenderer leftleg_r2;
	private final ModelRenderer leftleg_r3;

	public UMP45GFL() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.5F, -0.3F);
		setRotationAngle(head, 0.0873F, -0.1047F, -0.0873F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 14, 73, -4.5F, -8.25F, -4.5F, 9, 7, 0, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 25, 77, -4.5F, -8.25F, -4.5F, 0, 7, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 35, 77, 4.5F, -8.25F, -4.5F, 0, 7, 8, 0.0F, false));

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-5.0F, -6.0F, 0.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0782F, -0.2641F, 0.5486F);
		head_r1.cubeList.add(new ModelBox(head_r1, 24, 26, -0.7411F, 0.456F, 3.2878F, 10, 13, 0, 0.0F, false));

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(5.0F, -6.0F, 0.0F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.1571F, 0.2269F, -0.2269F);
		head_r2.cubeList.add(new ModelBox(head_r2, 34, 39, -7.6589F, 2.256F, 3.2878F, 8, 13, 0, 0.0F, false));

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(5.0F, -6.0F, 0.0F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, -0.4264F, -0.2084F, 1.3779F);
		head_r3.cubeList.add(new ModelBox(head_r3, 60, 6, 2.6215F, -1.6302F, 0.387F, 6, 1, 2, 0.0F, false));

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(5.0F, -6.0F, 0.0F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, -0.4233F, -0.2333F, 1.1729F);
		head_r4.cubeList.add(new ModelBox(head_r4, 56, 20, -2.5785F, -1.5302F, 0.387F, 6, 2, 2, 0.0F, false));

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(5.0F, -6.0F, 0.0F);
		head.addChild(head_r5);
		setRotationAngle(head_r5, 0.0F, -0.1745F, -0.384F);
		head_r5.cubeList.add(new ModelBox(head_r5, 20, 16, -1.8785F, -3.1302F, 0.287F, 2, 2, 2, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.5F, -0.4F);
		setRotationAngle(body, 0.0349F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 11, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 31, -4.0F, 0.0F, 1.0F, 8, 11, 1, 0.201F, false));

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 0.0F, -0.0873F);
		body_r1.cubeList.add(new ModelBox(body_r1, 48, 0, 2.9F, -23.6F, -2.0F, 3, 11, 3, 0.2F, false));

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, -0.0098F, -0.2314F, -0.0654F);
		body_r2.cubeList.add(new ModelBox(body_r2, 58, 43, 3.285F, -14.8982F, -2.8104F, 3, 4, 4, 0.0F, false));

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, 0.0F, -0.1745F, -0.2618F);
		body_r3.cubeList.add(new ModelBox(body_r3, 74, 13, -3.9351F, -13.7821F, -2.3491F, 3, 4, 4, 0.0F, false));

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(body_r4);
		setRotationAngle(body_r4, 0.0F, 0.0F, 0.1047F);
		body_r4.cubeList.add(new ModelBox(body_r4, 16, 45, -6.3F, -23.7F, -2.0F, 3, 11, 3, 0.2F, false));

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(4.0F, 4.0F, 7.0F);
		body.addChild(body_r5);
		setRotationAngle(body_r5, -1.1834F, -0.1294F, -0.0526F);
		body_r5.cubeList.add(new ModelBox(body_r5, 24, 16, -8.556F, 0.3414F, -7.4568F, 8, 6, 4, 0.2F, false));

		body_r6 = new ModelRenderer(this);
		body_r6.setRotationPoint(0.0F, 15.9927F, 0.8F);
		body.addChild(body_r6);
		setRotationAngle(body_r6, 0.1922F, 0.0334F, 0.0102F);
		body_r6.cubeList.add(new ModelBox(body_r6, 62, 31, -3.955F, -4.784F, 2.2125F, 8, 3, 0, 0.0F, false));

		body_r7 = new ModelRenderer(this);
		body_r7.setRotationPoint(0.0F, 15.9927F, 0.0F);
		body.addChild(body_r7);
		setRotationAngle(body_r7, -0.3318F, -0.0334F, 0.0102F);
		body_r7.cubeList.add(new ModelBox(body_r7, 62, 34, -4.1045F, -4.3267F, -3.633F, 8, 3, 0, 0.0F, false));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, 2.5F, -0.3F);
		setRotationAngle(rightarm, -0.3229F, -0.3491F, 0.5061F);
		

		rightarm_r1 = new ModelRenderer(this);
		rightarm_r1.setRotationPoint(1.0F, 4.0F, -2.0F);
		rightarm.addChild(rightarm_r1);
		setRotationAngle(rightarm_r1, 0.0698F, 0.0F, 0.0F);
		rightarm_r1.cubeList.add(new ModelBox(rightarm_r1, 38, 58, -2.8063F, -5.765F, 0.3021F, 3, 6, 4, 0.1F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, 4.0F, 0.0F);
		rightarm.addChild(bone);
		setRotationAngle(bone, -0.5585F, -0.5236F, -0.384F);
		

		rightarm_r2 = new ModelRenderer(this);
		rightarm_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(rightarm_r2);
		setRotationAngle(rightarm_r2, -0.0873F, -0.1396F, 0.0087F);
		rightarm_r2.cubeList.add(new ModelBox(rightarm_r2, 28, 52, -1.0F, 0.0F, -2.0F, 3, 6, 4, 0.0F, false));

		gun = new ModelRenderer(this);
		gun.setRotationPoint(1.3F, 5.5F, -2.7F);
		bone.addChild(gun);
		setRotationAngle(gun, 0.0873F, -0.2094F, -0.3316F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 4.0F);
		gun.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 43, -0.4303F, -7.7474F, -6.0643F, 1, 1, 2, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 58, -0.4303F, -7.7474F, -6.6643F, 1, 5, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 4, -0.9303F, -2.0474F, -8.5643F, 2, 2, 2, -0.301F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 14, -0.9303F, -2.2474F, -7.7643F, 2, 3, 2, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 59, -0.9303F, -3.2474F, -7.0643F, 2, 10, 2, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 64, -0.9303F, -3.2474F, -6.1643F, 2, 10, 1, -0.101F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 45, -0.4303F, 6.5526F, -6.1643F, 1, 5, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 17, -0.4303F, 4.5526F, -4.8643F, 1, 1, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 64, -0.9303F, -3.2474F, -5.7643F, 2, 10, 1, -0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.9303F, -2.2474F, -5.6643F, 2, 5, 2, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 4.0F);
		gun.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4014F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 52, -0.4303F, -5.9474F, -6.6643F, 1, 5, 1, -0.199F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 4.0F);
		gun.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 60, -0.3803F, 1.9526F, -3.1643F, 1, 2, 5, -0.2499F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 62, -0.0803F, 1.9526F, -3.1643F, 1, 2, 5, -0.25F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 59, 62, -0.7803F, 1.9526F, -3.1643F, 1, 2, 5, -0.25F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 33, -0.9303F, 1.9526F, -4.7643F, 2, 2, 2, -0.12F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 4.0F);
		gun.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0698F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 57, 53, -1.0F, -2.0F, -4.1F, 2, 2, 5, -0.2F, false));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 2.5F, -0.35F);
		setRotationAngle(leftarm, 0.0436F, 0.0F, -0.2967F);
		leftarm.cubeList.add(new ModelBox(leftarm, 56, 10, -1.0F, -2.0F, -2.0F, 3, 6, 4, 0.1F, false));
		leftarm.cubeList.add(new ModelBox(leftarm, 60, 0, -1.0F, 0.0F, -2.0F, 3, 2, 4, 0.3F, false));

		leftarm_r1 = new ModelRenderer(this);
		leftarm_r1.setRotationPoint(1.0F, 4.0F, 0.0F);
		leftarm.addChild(leftarm_r1);
		setRotationAngle(leftarm_r1, -0.1308F, -0.0046F, -0.1131F);
		leftarm_r1.cubeList.add(new ModelBox(leftarm_r1, 0, 54, -2.0F, 0.0F, -2.0F, 3, 6, 4, 0.0F, false));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 11.7F, 0.05F);
		setRotationAngle(rightleg, -0.198F, -0.1582F, 0.1693F);
		rightleg.cubeList.add(new ModelBox(rightleg, 44, 22, -2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F, false));

		rightleg_r1 = new ModelRenderer(this);
		rightleg_r1.setRotationPoint(0.0F, 7.0F, 0.0F);
		rightleg.addChild(rightleg_r1);
		setRotationAngle(rightleg_r1, 0.4538F, 0.0F, -0.0436F);
		rightleg_r1.cubeList.add(new ModelBox(rightleg_r1, 46, 48, -2.0001F, -0.2479F, -1.9673F, 4, 6, 4, 0.0F, false));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 11.7F, -0.05F);
		setRotationAngle(leftleg, -0.1484F, 0.0F, -0.1745F);
		leftleg.cubeList.add(new ModelBox(leftleg, 0, 43, -2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F, false));

		leftleg_r1 = new ModelRenderer(this);
		leftleg_r1.setRotationPoint(0.0F, 7.0F, 0.0F);
		leftleg.addChild(leftleg_r1);
		setRotationAngle(leftleg_r1, 0.1396F, 0.0F, 0.0436F);
		leftleg_r1.cubeList.add(new ModelBox(leftleg_r1, 50, 33, -1.9997F, -0.249F, -1.9779F, 4, 6, 4, 0.0F, false));

		leftleg_r2 = new ModelRenderer(this);
		leftleg_r2.setRotationPoint(-2.0F, 12.0F, 0.0F);
		leftleg.addChild(leftleg_r2);
		setRotationAngle(leftleg_r2, -0.1607F, -0.0358F, 0.086F);
		leftleg_r2.cubeList.add(new ModelBox(leftleg_r2, 42, 0, 3.0926F, -1.641F, -0.6543F, 1, 1, 2, 0.0F, false));
		leftleg_r2.cubeList.add(new ModelBox(leftleg_r2, 18, 31, 4.0926F, -6.641F, -0.6543F, 1, 6, 2, 0.0F, false));

		leftleg_r3 = new ModelRenderer(this);
		leftleg_r3.setRotationPoint(-2.0F, 12.0F, 0.0F);
		leftleg.addChild(leftleg_r3);
		setRotationAngle(leftleg_r3, 0.0009F, -0.0524F, -0.0175F);
		leftleg_r3.cubeList.add(new ModelBox(leftleg_r3, 34, 66, 4.3743F, -12.7355F, -1.0363F, 1, 7, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
