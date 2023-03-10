package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UTG547Vest extends ModelBiped {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer vest;
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
	private final ModelRenderer bone26;
	private final ModelRenderer cube_r15;

	public UTG547Vest() {
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

		vest = new ModelRenderer(this);
		vest.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.cubeList.add(new ModelBox(vest, 40, 16, -3.5F, 1.75F, -2.77F, 7, 9, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 43, 37, -4.1F, 6.25F, -2.52F, 1, 4, 5, 0.1F, false));
		vest.cubeList.add(new ModelBox(vest, 32, 42, 3.1F, 6.25F, -2.52F, 1, 4, 5, 0.1F, false));
		vest.cubeList.add(new ModelBox(vest, 32, 32, -3.5F, 1.75F, 1.48F, 7, 9, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, 1.75F, -2.75F);
		vest.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2091F, 0.0011F, 0.5519F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 16, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.5F, 1.75F, -2.75F);
		vest.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2091F, -0.0011F, -0.5519F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 16, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.3F, -0.15F, -3.1F);
		vest.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1213F, -0.0149F, 0.0882F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 0, -2.0F, 0.0F, -0.25F, 2, 3, 2, -0.3F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(3.5F, 1.75F, -2.5F);
		vest.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.192F, 0.0F, -0.1571F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 9, -2.0F, -2.0F, -0.25F, 2, 2, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.5F, 1.75F, -2.5F);
		vest.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.192F, 0.0F, 0.1571F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 12, 0.0F, -2.0F, -0.25F, 2, 2, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.0F, -0.05F, 2.2F);
		vest.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0698F, 0.0F, -0.1222F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 5, 0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(3.0F, -0.05F, 2.2F);
		vest.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0698F, 0.0F, 0.1222F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 48, -2.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-3.2F, -0.25F, -2.1F);
		vest.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0698F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 6, 0.0F, -0.1F, 3.3F, 2, 1, 1, 0.001F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 48, 0.0F, -0.1F, -0.05F, 2, 1, 4, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(3.2F, -0.25F, -2.1F);
		vest.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -0.0698F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 6, -2.0F, -0.1F, 3.3F, 2, 1, 1, 0.001F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 46, -2.0F, -0.1F, -0.05F, 2, 1, 4, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(3.2F, 2.85F, -3.0F);
		vest.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.1578F, -0.0621F, 0.0103F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 32, -2.95F, -0.2F, -0.22F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 0, -2.0F, -0.2F, -0.22F, 1, 2, 1, -0.1F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 32, -1.05F, -0.2F, -0.22F, 1, 2, 1, -0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(3.2F, 2.85F, -3.0F);
		vest.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.0531F, -0.0621F, 0.0103F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 16, -3.0F, 0.0F, -0.02F, 3, 2, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-3.2F, 2.45F, -2.9F);
		vest.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.1697F, 0.0665F, 0.077F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 32, 0.0F, 0.0F, -0.02F, 3, 2, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.0F, 6.35F, -3.9F);
		vest.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0487F, 0.0699F, -0.0221F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, 0.0F, -0.02F, 2, 4, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-4.3F, 6.35F, -3.0F);
		vest.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0536F, 0.436F, -0.0029F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 0, 0.0F, 0.0F, -0.02F, 2, 4, 2, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.2F, 1.0F, 0.5F);
		vest.addChild(bone26);
		setRotationAngle(bone26, -1.6692F, -0.2462F, 0.5014F);
		

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.0F, 0.0F, -4.0F);
		bone26.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.6632F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 47, 30, 7.8415F, 2.6643F, 4.6287F, 2, 2, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 40, 26, 7.6461F, 2.8039F, 3.0436F, 5, 2, 2, 0.0F, false));

		bipedLeftArm.isHidden = true;
		bipedRightArm.isHidden = true;
		bipedBody = vest;
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
