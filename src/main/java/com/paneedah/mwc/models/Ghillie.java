package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Ghillie extends ModelBiped {
	private final ModelRenderer hood;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer head_r6;
	private final ModelRenderer head_r7;
	private final ModelRenderer head_r8;
	private final ModelRenderer head_r9;
	private final ModelRenderer head_r10;
	private final ModelRenderer head_r11;
	private final ModelRenderer torso;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer leftarm_ghillie;
	private final ModelRenderer leftarm_r1;
	private final ModelRenderer leftarm_r2;
	private final ModelRenderer rightarm_ghillie;
	private final ModelRenderer leftarm_r3;
	private final ModelRenderer leftarm_r4;
	private final ModelRenderer leftleg_ghillie;
	private final ModelRenderer leftleg_r1;
	private final ModelRenderer leftleg_r2;
	private final ModelRenderer leftleg_r3;
	private final ModelRenderer rightleg_ghillie;
	private final ModelRenderer leftleg_r4;
	private final ModelRenderer leftleg_r5;
	private final ModelRenderer leftleg_r6;
//	private final ModelRenderer head;
//	private final ModelRenderer rightarm;
//	private final ModelRenderer leftarm;
//	private final ModelRenderer rightleg;
//	private final ModelRenderer leftleg;
		
		public Ghillie()
	    {
	        super(0.02f, 0, 115, 115);
	      textureWidth = 115;
	      textureHeight = 115;

		hood = new ModelRenderer(this);
		hood.setRotationPoint(0.0F, 0.0F, 0.0F);
		hood.cubeList.add(new ModelBox(hood, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(5.4F, -3.8F, -3.6F);
		hood.addChild(head_r1);
		setRotationAngle(head_r1, 0.0162F, -0.05F, 0.0861F);
		head_r1.cubeList.add(new ModelBox(head_r1, 46, 0, -1.0F, 0.0F, 0.0F, 1, 4, 8, 0.0F, false));

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(-5.4F, -3.8F, -3.6F);
		hood.addChild(head_r2);
		setRotationAngle(head_r2, 0.0162F, 0.05F, -0.0861F);
		head_r2.cubeList.add(new ModelBox(head_r2, 46, 15, 0.0F, 0.0F, 0.0F, 1, 4, 8, 0.0F, false));

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(4.0F, -3.5F, 6.3F);
		hood.addChild(head_r3);
		setRotationAngle(head_r3, -1.8675F, 0.0F, 0.0F);
		head_r3.cubeList.add(new ModelBox(head_r3, 24, 0, -8.0F, 0.0F, 0.0F, 8, 3, 5, 0.0F, false));

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(4.0F, -9.2F, 3.9F);
		hood.addChild(head_r4);
		setRotationAngle(head_r4, -1.1694F, 0.0F, 0.0F);
		head_r4.cubeList.add(new ModelBox(head_r4, 24, 26, -8.0F, 0.0F, 0.0F, 8, 3, 6, 0.1F, false));

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(4.0F, -8.1F, -5.2F);
		hood.addChild(head_r5);
		setRotationAngle(head_r5, 0.1571F, 0.0F, 0.0F);
		head_r5.cubeList.add(new ModelBox(head_r5, 0, 16, -8.0F, 0.0F, 0.0F, 8, 1, 9, 0.0F, false));

		head_r6 = new ModelRenderer(this);
		head_r6.setRotationPoint(4.7F, -7.9F, 1.2F);
		hood.addChild(head_r6);
		setRotationAngle(head_r6, 0.4528F, -1.3252F, -0.7897F);
		head_r6.cubeList.add(new ModelBox(head_r6, 22, 65, -5.0F, 0.0F, 0.0F, 5, 7, 0, 0.0F, false));

		head_r7 = new ModelRenderer(this);
		head_r7.setRotationPoint(-4.9F, -8.0F, 2.1F);
		hood.addChild(head_r7);
		setRotationAngle(head_r7, 0.3563F, 1.261F, 0.6894F);
		head_r7.cubeList.add(new ModelBox(head_r7, 64, 21, 0.0F, 0.0F, 0.0F, 5, 6, 0, 0.0F, false));

		head_r8 = new ModelRenderer(this);
		head_r8.setRotationPoint(-4.9F, -8.0F, -3.9F);
		hood.addChild(head_r8);
		setRotationAngle(head_r8, 0.1436F, 0.7331F, 0.4452F);
		head_r8.cubeList.add(new ModelBox(head_r8, 45, 0, 0.0F, 0.0F, 0.0F, 3, 5, 0, 0.0F, false));

		head_r9 = new ModelRenderer(this);
		head_r9.setRotationPoint(4.9F, -8.0F, -4.1F);
		hood.addChild(head_r9);
		setRotationAngle(head_r9, -0.0769F, -0.4091F, -0.125F);
		head_r9.cubeList.add(new ModelBox(head_r9, 50, 65, -5.0F, 0.0F, 0.0F, 5, 5, 0, 0.0F, false));

		head_r10 = new ModelRenderer(this);
		head_r10.setRotationPoint(-4.2F, -8.0F, -4.9F);
		hood.addChild(head_r10);
		setRotationAngle(head_r10, 0.0847F, 0.0196F, 0.2641F);
		head_r10.cubeList.add(new ModelBox(head_r10, 15, 35, 0.0F, 0.0F, 0.0F, 1, 5, 9, 0.0F, false));

		head_r11 = new ModelRenderer(this);
		head_r11.setRotationPoint(4.2F, -8.0F, -4.9F);
		hood.addChild(head_r11);
		setRotationAngle(head_r11, 0.0847F, -0.0196F, -0.2641F);
		head_r11.cubeList.add(new ModelBox(head_r11, 35, 35, -1.0F, 0.0F, 0.0F, 1, 5, 9, 0.0F, false));

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 0.0F, 0.0F);
		torso.cubeList.add(new ModelBox(torso, 0, 26, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.14F, false));
		torso.cubeList.add(new ModelBox(torso, 26, 10, -3.5F, 2.0F, -1.0F, 7, 7, 4, 0.0F, false));
		torso.cubeList.add(new ModelBox(torso, 46, 27, -4.0F, 9.25F, -2.0F, 8, 1, 4, 0.3F, false));

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(3.7F, 2.1F, 3.3F);
		torso.addChild(body_r1);
		setRotationAngle(body_r1, 0.0119F, -0.2267F, 0.155F);
		body_r1.cubeList.add(new ModelBox(body_r1, 0, 61, -7.0F, -2.0F, 0.0F, 7, 13, 0, 0.0F, false));

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(4.0F, 2.0F, 1.8F);
		torso.addChild(body_r2);
		setRotationAngle(body_r2, 0.1222F, 0.1222F, 0.0F);
		body_r2.cubeList.add(new ModelBox(body_r2, 64, 45, -7.0F, -2.0F, 0.0F, 7, 13, 0, 0.0F, false));

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(-3.5F, 2.0F, -3.0F);
		torso.addChild(body_r3);
		setRotationAngle(body_r3, -0.2443F, 0.0F, 0.0F);
		body_r3.cubeList.add(new ModelBox(body_r3, 34, 23, 0.0F, -2.0F, 1.0F, 2, 2, 0, -0.01F, false));
		body_r3.cubeList.add(new ModelBox(body_r3, 40, 23, 5.0F, -2.0F, 1.0F, 2, 2, 0, -0.01F, false));

		leftarm_ghillie = new ModelRenderer(this);
		leftarm_ghillie.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_ghillie.cubeList.add(new ModelBox(leftarm_ghillie, 48, 49, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		leftarm_ghillie.cubeList.add(new ModelBox(leftarm_ghillie, 60, 8, -1.0F, -2.0F, -2.0F, 4, 9, 4, 0.1F, false));

		leftarm_r1 = new ModelRenderer(this);
		leftarm_r1.setRotationPoint(4.6F, 6.4F, 0.1F);
		leftarm_ghillie.addChild(leftarm_r1);
		setRotationAngle(leftarm_r1, -0.3629F, -0.2914F, 1.3906F);
		leftarm_r1.cubeList.add(new ModelBox(leftarm_r1, 22, 39, -7.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

		leftarm_r2 = new ModelRenderer(this);
		leftarm_r2.setRotationPoint(3.3F, 1.6F, -4.0F);
		leftarm_ghillie.addChild(leftarm_r2);
		setRotationAngle(leftarm_r2, 0.2429F, 0.2435F, 1.1165F);
		leftarm_r2.cubeList.add(new ModelBox(leftarm_r2, 52, 0, -5.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, false));

		rightarm_ghillie = new ModelRenderer(this);
		rightarm_ghillie.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_ghillie.cubeList.add(new ModelBox(rightarm_ghillie, 0, 45, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		rightarm_ghillie.cubeList.add(new ModelBox(rightarm_ghillie, 55, 32, -3.0F, -2.0F, -2.0F, 4, 9, 4, 0.1F, false));

		leftarm_r3 = new ModelRenderer(this);
		leftarm_r3.setRotationPoint(-4.6F, 6.4F, 0.1F);
		rightarm_ghillie.addChild(leftarm_r3);
		setRotationAngle(leftarm_r3, -0.3629F, 0.2914F, -1.3906F);
		leftarm_r3.cubeList.add(new ModelBox(leftarm_r3, 22, 35, 0.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

		leftarm_r4 = new ModelRenderer(this);
		leftarm_r4.setRotationPoint(-3.4F, 1.9F, -3.5F);
		rightarm_ghillie.addChild(leftarm_r4);
		setRotationAngle(leftarm_r4, 0.2079F, -0.2435F, -1.1165F);
		leftarm_r4.cubeList.add(new ModelBox(leftarm_r4, 16, 26, 0.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, false));

		leftleg_ghillie = new ModelRenderer(this);
		leftleg_ghillie.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_ghillie.cubeList.add(new ModelBox(leftleg_ghillie, 32, 49, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.13F, false));

		leftleg_r1 = new ModelRenderer(this);
		leftleg_r1.setRotationPoint(-1.8F, 15.3F, 0.1F);
		leftleg_ghillie.addChild(leftleg_r1);
		setRotationAngle(leftleg_r1, 0.0302F, -0.244F, -0.0263F);
		leftleg_r1.cubeList.add(new ModelBox(leftleg_r1, 64, 58, 0.0F, -14.0F, 2.0F, 4, 10, 0, 0.0F, false));

		leftleg_r2 = new ModelRenderer(this);
		leftleg_r2.setRotationPoint(2.7F, 14.3F, 1.9F);
		leftleg_ghillie.addChild(leftleg_r2);
		setRotationAngle(leftleg_r2, -3.1345F, 1.2979F, 2.9536F);
		leftleg_r2.cubeList.add(new ModelBox(leftleg_r2, 42, 65, 0.0F, -12.0F, 2.0F, 4, 8, 0, 0.0F, false));

		leftleg_r3 = new ModelRenderer(this);
		leftleg_r3.setRotationPoint(0.0F, 12.0F, 2.7F);
		leftleg_ghillie.addChild(leftleg_r3);
		setRotationAngle(leftleg_r3, 0.1745F, 0.576F, 0.0F);
		leftleg_r3.cubeList.add(new ModelBox(leftleg_r3, 46, 35, 0.0F, -12.0F, 2.0F, 4, 9, 0, 0.0F, false));

		rightleg_ghillie = new ModelRenderer(this);
		rightleg_ghillie.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_ghillie.cubeList.add(new ModelBox(rightleg_ghillie, 16, 49, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.13F, false));

		leftleg_r4 = new ModelRenderer(this);
		leftleg_r4.setRotationPoint(1.8F, 15.3F, 0.1F);
		rightleg_ghillie.addChild(leftleg_r4);
		setRotationAngle(leftleg_r4, 0.0302F, 0.244F, 0.0263F);
		leftleg_r4.cubeList.add(new ModelBox(leftleg_r4, 14, 65, -4.0F, -14.0F, 2.0F, 4, 10, 0, 0.0F, false));

		leftleg_r5 = new ModelRenderer(this);
		leftleg_r5.setRotationPoint(-2.7F, 14.3F, 1.9F);
		rightleg_ghillie.addChild(leftleg_r5);
		setRotationAngle(leftleg_r5, -3.1345F, -1.2979F, -2.9536F);
		leftleg_r5.cubeList.add(new ModelBox(leftleg_r5, 0, 0, -4.0F, -12.0F, 2.0F, 4, 8, 0, 0.0F, false));

		leftleg_r6 = new ModelRenderer(this);
		leftleg_r6.setRotationPoint(0.0F, 12.0F, 2.7F);
		rightleg_ghillie.addChild(leftleg_r6);
		setRotationAngle(leftleg_r6, 0.1745F, -0.576F, 0.0F);
		leftleg_r6.cubeList.add(new ModelBox(leftleg_r6, 0, 16, -4.0F, -12.0F, 2.0F, 4, 9, 0, 0.0F, false));

//		head = new ModelRenderer(this);
//		head.setRotationPoint(0.0F, 0.0F, 0.0F);
//		head.cubeList.add(new ModelBox(head, 0, 78, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));
//
		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 99, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 99, 24, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
//
		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 99, 53, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 99, 70, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		
		this.bipedHead.addChild(hood);
		this.bipedBody.addChild(torso);
		this.bipedLeftArm.addChild(leftarm_ghillie);
		this.bipedRightArm.addChild(rightarm_ghillie);
		this.bipedLeftLeg.addChild(leftleg_ghillie);
		this.bipedRightLeg.addChild(rightleg_ghillie);
		
		this.bipedHeadwear.isHidden = true;
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		hood.render(f5);
//		torso.render(f5);
//		leftarm_ghillie.render(f5);
//		rightarm_ghillie.render(f5);
//		leftleg_ghillie.render(f5);
//		rightleg_ghillie.render(f5);
//		head.render(f5);
//		rightarm.render(f5);
//		leftarm.render(f5);
//		rightleg.render(f5);
//		leftleg.render(f5);
		
		super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
