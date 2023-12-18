package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SV98Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer Action18_r1;
	private final ModelRenderer Action19_r1_r1;
	private final ModelRenderer Action12_r2_r1;
	private final ModelRenderer Action13_r1_r1;
	private final ModelRenderer Action11_r3_r1;
	private final ModelRenderer Action12_r1_r1;
	private final ModelRenderer Action10_r2_r1;
	private final ModelRenderer Action11_r2_r1;
	private final ModelRenderer Action9_r1_r1;
	private final ModelRenderer Action10_r1_r1;
	private final ModelRenderer Action11_r1_r1;
	private final ModelRenderer Action2_r1_r1;
	private final ModelRenderer Action3_r2_r1;
	private final ModelRenderer Action3_r1_r1;
	private final ModelRenderer Action4_r1_r1;

	public SV98Action() {
		textureWidth = 430;
		textureHeight = 430;

		action = new ModelRenderer(this);
		action.setRotationPoint(-0.1F, 24.1F, 0.1F);
		action.cubeList.add(new ModelBox(action, 86, 138, -2.6F, -39.3F, -28.4F, 1, 1, 18, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 122, 0, -1.2F, -39.3F, -28.4F, 1, 1, 18, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 42, 132, -1.9F, -40.0F, -28.4F, 1, 1, 18, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 120, 30, -1.9F, -38.6F, -28.4F, 1, 1, 18, 0.0F, false));

		Action18_r1 = new ModelRenderer(this);
		Action18_r1.setRotationPoint(-24.9822F, -6.9806F, -0.1F);
		action.addChild(Action18_r1);
		setRotationAngle(Action18_r1, 0.0F, 0.0F, 0.679F);
		Action18_r1.cubeList.add(new ModelBox(Action18_r1, 47, 94, -3.0406F, -38.0156F, -13.3F, 1, 5, 1, 0.0F, false));
		Action18_r1.cubeList.add(new ModelBox(Action18_r1, 122, 13, -3.5406F, -33.2656F, -13.8F, 2, 2, 2, -0.2F, false));

		Action19_r1_r1 = new ModelRenderer(this);
		Action19_r1_r1.setRotationPoint(-24.9526F, -6.9216F, -0.1F);
		action.addChild(Action19_r1_r1);
		setRotationAngle(Action19_r1_r1, 0.0F, 0.0F, 0.8884F);
		Action19_r1_r1.cubeList.add(new ModelBox(Action19_r1_r1, 77, 0, -10.8844F, -38.3594F, -13.3F, 1, 2, 1, 0.1F, false));

		Action12_r2_r1 = new ModelRenderer(this);
		Action12_r2_r1.setRotationPoint(16.4167F, -3.8944F, -0.1F);
		action.addChild(Action12_r2_r1);
		setRotationAngle(Action12_r2_r1, 0.0F, 0.0F, -0.4363F);
		Action12_r2_r1.cubeList.add(new ModelBox(Action12_r2_r1, 103, 51, -1.3F, -39.6F, -11.0F, 1, 1, 1, -0.1F, false));

		Action13_r1_r1 = new ModelRenderer(this);
		Action13_r1_r1.setRotationPoint(15.6914F, -74.0438F, -0.1F);
		action.addChild(Action13_r1_r1);
		setRotationAngle(Action13_r1_r1, 0.0F, 0.0F, -2.7053F);
		Action13_r1_r1.cubeList.add(new ModelBox(Action13_r1_r1, 86, 103, -0.5F, -39.6F, -11.0F, 1, 1, 1, -0.098F, false));

		Action11_r3_r1 = new ModelRenderer(this);
		Action11_r3_r1.setRotationPoint(-16.4977F, -2.6266F, -0.1F);
		action.addChild(Action11_r3_r1);
		setRotationAngle(Action11_r3_r1, 0.0F, 0.0F, 0.4363F);
		Action11_r3_r1.cubeList.add(new ModelBox(Action11_r3_r1, 93, 103, -2.7F, -39.6F, -11.0F, 1, 1, 1, -0.098F, false));

		Action12_r1_r1 = new ModelRenderer(this);
		Action12_r1_r1.setRotationPoint(-21.2104F, -72.7761F, -0.1F);
		action.addChild(Action12_r1_r1);
		setRotationAngle(Action12_r1_r1, 0.0F, 0.0F, 2.7053F);
		Action12_r1_r1.cubeList.add(new ModelBox(Action12_r1_r1, 104, 60, -3.5F, -39.6F, -11.0F, 1, 1, 1, -0.1F, false));

		Action10_r2_r1 = new ModelRenderer(this);
		Action10_r2_r1.setRotationPoint(33.3116F, -23.1703F, -0.1F);
		action.addChild(Action10_r2_r1);
		setRotationAngle(Action10_r2_r1, 0.0F, 0.0F, -1.1345F);
		Action10_r2_r1.cubeList.add(new ModelBox(Action10_r2_r1, 104, 64, -1.6F, -38.5F, -11.0F, 1, 1, 1, -0.099F, false));

		Action11_r2_r1 = new ModelRenderer(this);
		Action11_r2_r1.setRotationPoint(-34.8439F, -20.4513F, -0.1F);
		action.addChild(Action11_r2_r1);
		setRotationAngle(Action11_r2_r1, 0.0F, 0.0F, 1.1345F);
		Action11_r2_r1.cubeList.add(new ModelBox(Action11_r2_r1, 69, 104, -2.4F, -38.5F, -11.0F, 1, 1, 1, -0.1F, false));

		Action9_r1_r1 = new ModelRenderer(this);
		Action9_r1_r1.setRotationPoint(-36.8378F, -21.7216F, -0.1F);
		action.addChild(Action9_r1_r1);
		setRotationAngle(Action9_r1_r1, 0.0F, 0.0F, 1.1345F);
		Action9_r1_r1.cubeList.add(new ModelBox(Action9_r1_r1, 106, 15, -1.6F, -39.9F, -11.0F, 1, 1, 1, -0.1F, false));

		Action10_r1_r1 = new ModelRenderer(this);
		Action10_r1_r1.setRotationPoint(35.3055F, -24.4406F, -0.1F);
		action.addChild(Action10_r1_r1);
		setRotationAngle(Action10_r1_r1, 0.0F, 0.0F, -1.1345F);
		Action10_r1_r1.cubeList.add(new ModelBox(Action10_r1_r1, 104, 69, -2.4F, -39.9F, -11.0F, 1, 1, 1, -0.099F, false));

		Action11_r1_r1 = new ModelRenderer(this);
		Action11_r1_r1.setRotationPoint(19.5192F, -6.0268F, -0.1F);
		action.addChild(Action11_r1_r1);
		setRotationAngle(Action11_r1_r1, 0.0F, 0.0F, -0.5236F);
		Action11_r1_r1.cubeList.add(new ModelBox(Action11_r1_r1, 103, 49, -2.25F, -39.3F, -10.9F, 1, 1, 1, -0.099F, false));

		Action2_r1_r1 = new ModelRenderer(this);
		Action2_r1_r1.setRotationPoint(27.7278F, -13.2007F, -0.1F);
		action.addChild(Action2_r1_r1);
		setRotationAngle(Action2_r1_r1, 0.0F, 0.0F, -0.7854F);
		Action2_r1_r1.cubeList.add(new ModelBox(Action2_r1_r1, 126, 131, -3.0F, -39.9F, -28.3F, 1, 1, 18, -0.001F, false));

		Action3_r2_r1 = new ModelRenderer(this);
		Action3_r2_r1.setRotationPoint(28.0207F, -12.4936F, -0.1F);
		action.addChild(Action3_r2_r1);
		setRotationAngle(Action3_r2_r1, 0.0F, 0.0F, -0.7854F);
		Action3_r2_r1.cubeList.add(new ModelBox(Action3_r2_r1, 130, 61, -2.0F, -39.9F, -28.3F, 1, 1, 18, -0.001F, false));

		Action3_r1_r1 = new ModelRenderer(this);
		Action3_r1_r1.setRotationPoint(-27.0023F, -9.6693F, -0.1F);
		action.addChild(Action3_r1_r1);
		setRotationAngle(Action3_r1_r1, 0.0F, 0.0F, 0.7854F);
		Action3_r1_r1.cubeList.add(new ModelBox(Action3_r1_r1, 119, 82, -3.0F, -38.5F, -28.3F, 1, 1, 18, -0.001F, false));

		Action4_r1_r1 = new ModelRenderer(this);
		Action4_r1_r1.setRotationPoint(-26.7094F, -10.3764F, -0.1F);
		action.addChild(Action4_r1_r1);
		setRotationAngle(Action4_r1_r1, 0.0F, 0.0F, 0.7854F);
		Action4_r1_r1.cubeList.add(new ModelBox(Action4_r1_r1, 120, 112, -2.0F, -38.5F, -28.3F, 1, 1, 18, -0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}