package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AACHoneyBadgerSilencer extends ModelWithAttachments {
	private final ModelRenderer silencer;
	private final ModelRenderer gun860_r1;
	private final ModelRenderer gun870_r1;
	private final ModelRenderer gun872_r1;
	private final ModelRenderer gun867_r1;

	public AACHoneyBadgerSilencer() {
		textureWidth = 256;
		textureHeight = 256;

		silencer = new ModelRenderer(this);
		silencer.setRotationPoint(0.0F, 24.0F, 0.0F);
		silencer.cubeList.add(new ModelBox(silencer, 140, 97, -0.5F, -37.3F, -52.7F, 1, 1, 16, 0.0F, false));
		silencer.cubeList.add(new ModelBox(silencer, 140, 80, -0.49F, -37.9F, -52.7F, 1, 1, 16, 0.0F, false));
		silencer.cubeList.add(new ModelBox(silencer, 142, 54, -1.7F, -39.11F, -52.7F, 1, 1, 16, 0.0F, false));
		silencer.cubeList.add(new ModelBox(silencer, 149, 36, -2.3F, -39.1F, -52.7F, 1, 1, 16, 0.0F, false));
		silencer.cubeList.add(new ModelBox(silencer, 142, 2, -3.5F, -37.9F, -52.7F, 1, 1, 16, 0.0F, false));
		silencer.cubeList.add(new ModelBox(silencer, 56, 141, -3.51F, -37.3F, -52.7F, 1, 1, 16, 0.0F, false));
		silencer.cubeList.add(new ModelBox(silencer, 124, 63, -2.3F, -36.1F, -52.7F, 1, 1, 16, 0.0F, false));
		silencer.cubeList.add(new ModelBox(silencer, 140, 114, -1.7F, -36.11F, -52.7F, 1, 1, 16, 0.0F, false));

		gun860_r1 = new ModelRenderer(this);
		gun860_r1.setRotationPoint(20.893F, -61.5459F, 0.0F);
		silencer.addChild(gun860_r1);
		setRotationAngle(gun860_r1, 0.0F, 0.0F, -2.3562F);
		gun860_r1.cubeList.add(new ModelBox(gun860_r1, 146, 19, -2.3F, -35.1F, -52.7F, 1, 1, 16, 0.0F, false));
		gun860_r1.cubeList.add(new ModelBox(gun860_r1, 131, 37, -1.6F, -35.11F, -52.7F, 1, 1, 16, 0.0F, false));

		gun870_r1 = new ModelRenderer(this);
		gun870_r1.setRotationPoint(23.6243F, -60.4146F, 0.0F);
		silencer.addChild(gun870_r1);
		setRotationAngle(gun870_r1, 0.0F, 0.0F, -2.3562F);
		gun870_r1.cubeList.add(new ModelBox(gun870_r1, 0, 138, -0.69F, -34.4F, -52.7F, 1, 1, 16, 0.0F, false));
		gun870_r1.cubeList.add(new ModelBox(gun870_r1, 38, 138, -0.7F, -35.1F, -52.7F, 1, 1, 16, 0.0F, false));

		gun872_r1 = new ModelRenderer(this);
		gun872_r1.setRotationPoint(-28.3216F, -9.8258F, 0.0F);
		silencer.addChild(gun872_r1);
		setRotationAngle(gun872_r1, 0.0F, 0.0F, 0.7854F);
		gun872_r1.cubeList.add(new ModelBox(gun872_r1, 121, 136, -2.3F, -38.4F, -52.7F, 1, 1, 16, 0.0F, false));
		gun872_r1.cubeList.add(new ModelBox(gun872_r1, 86, 137, -2.31F, -39.1F, -52.7F, 1, 1, 16, 0.0F, false));

		gun867_r1 = new ModelRenderer(this);
		gun867_r1.setRotationPoint(-27.853F, -10.9572F, 0.0F);
		silencer.addChild(gun867_r1);
		setRotationAngle(gun867_r1, 0.0F, 0.0F, 0.7854F);
		gun867_r1.cubeList.add(new ModelBox(gun867_r1, 18, 140, -0.7F, -39.11F, -52.7F, 1, 1, 16, 0.0F, false));
		gun867_r1.cubeList.add(new ModelBox(gun867_r1, 139, 139, 0.0F, -39.1F, -52.7F, 1, 1, 16, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		silencer.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}