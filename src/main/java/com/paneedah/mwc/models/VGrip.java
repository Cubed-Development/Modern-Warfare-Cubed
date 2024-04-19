package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class VGrip extends ModelBase {
	private final ModelRenderer Vgrip;
	private final ModelRenderer gun14_r1;
	private final ModelRenderer gun14_r2;
	private final ModelRenderer gun13_r1;
	private final ModelRenderer gun13_r2;
	private final ModelRenderer gun13_r3;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun17_r1;

	public VGrip() {
		textureWidth = 32;
		textureHeight = 32;

		Vgrip = new ModelRenderer(this);
		Vgrip.setRotationPoint(0.0F, 24.0F, 0.0F);
		Vgrip.cubeList.add(new ModelBox(Vgrip, 22, 0, -1.0F, -27.5F, -1.5F, 4, 1, 1, 0.0F, false));
		Vgrip.cubeList.add(new ModelBox(Vgrip, 0, 18, -0.5F, -28.0F, -2.0F, 3, 11, 3, 0.0F, false));
		Vgrip.cubeList.add(new ModelBox(Vgrip, 20, 6, -0.5F, -17.7F, -2.0F, 3, 2, 3, -0.2F, false));
		Vgrip.cubeList.add(new ModelBox(Vgrip, 12, 19, 0.0F, -27.5F, -2.5F, 2, 10, 2, 0.0F, false));
		Vgrip.cubeList.add(new ModelBox(Vgrip, 20, 11, 0.0F, -28.5F, -2.7F, 2, 1, 3, 0.0F, false));
		Vgrip.cubeList.add(new ModelBox(Vgrip, 0, 0, -0.5F, -29.5F, -4.0F, 3, 1, 8, 0.0F, false));
		Vgrip.cubeList.add(new ModelBox(Vgrip, 10, 10, -0.5F, -30.5F, -4.0F, 1, 1, 8, 0.0F, false));
		Vgrip.cubeList.add(new ModelBox(Vgrip, 0, 9, 1.5F, -30.5F, -4.0F, 1, 1, 8, 0.0F, false));

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(1.0F, -27.8714F, -2.5767F);
		Vgrip.addChild(gun14_r1);
		setRotationAngle(gun14_r1, 0.48F, 0.0F, 0.0F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 0, 0, -1.0F, -1.0F, -0.4F, 2, 2, 1, 0.0F, false));

		gun14_r2 = new ModelRenderer(this);
		gun14_r2.setRotationPoint(1.0F, -28.3536F, 1.6393F);
		Vgrip.addChild(gun14_r2);
		setRotationAngle(gun14_r2, 0.6981F, 0.0F, 0.0F);
		gun14_r2.cubeList.add(new ModelBox(gun14_r2, 14, 0, -1.0F, -1.0F, -2.0F, 2, 2, 4, 0.0F, false));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(1.0F, -22.0011F, -2.4991F);
		Vgrip.addChild(gun13_r1);
		setRotationAngle(gun13_r1, -0.6283F, 0.0F, 0.0F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 0, 9, -1.0F, -2.9778F, -2.3973F, 2, 1, 1, -0.004F, false));
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 10, 9, -1.0F, -1.3778F, -1.2973F, 2, 1, 1, -0.004F, false));
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 0, 11, -1.0F, 0.4222F, -0.0973F, 2, 1, 1, -0.004F, false));

		gun13_r2 = new ModelRenderer(this);
		gun13_r2.setRotationPoint(1.0F, -22.0011F, -2.4991F);
		Vgrip.addChild(gun13_r2);
		setRotationAngle(gun13_r2, -0.4538F, 0.0F, 0.0F);
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 0, 3, -1.0F, 1.8113F, 0.8489F, 2, 2, 1, -0.004F, false));

		gun13_r3 = new ModelRenderer(this);
		gun13_r3.setRotationPoint(1.0F, -22.0011F, -2.4991F);
		Vgrip.addChild(gun13_r3);
		setRotationAngle(gun13_r3, -0.0175F, 0.0F, 0.0F);
		gun13_r3.cubeList.add(new ModelBox(gun13_r3, 26, 19, -1.0F, -4.4989F, -0.3009F, 2, 8, 1, -0.004F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(1.0F, -21.8122F, 0.9996F);
		Vgrip.addChild(gun6_r1);
		setRotationAngle(gun6_r1, 0.0436F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 0, 6, -1.0F, 3.9F, -0.6F, 2, 1, 1, -0.002F, false));
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 20, 19, -1.0F, -4.7F, -0.6F, 2, 9, 1, -0.002F, false));

		gun17_r1 = new ModelRenderer(this);
		gun17_r1.setRotationPoint(1.0F, -29.4F, -0.5F);
		Vgrip.addChild(gun17_r1);
		setRotationAngle(gun17_r1, 0.7418F, 0.0F, 0.0F);
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 20, 15, -2.0F, -0.5F, -0.5F, 4, 1, 1, -0.15F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Vgrip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
