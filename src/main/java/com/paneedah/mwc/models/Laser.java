package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Laser extends ModelBase {
	private final ModelRenderer laser;
	private final ModelRenderer laser9_r1;
	private final ModelRenderer laser8_r1;

	public Laser() {
		textureWidth = 512;
		textureHeight = 256;

		laser = new ModelRenderer(this);
		laser.setRotationPoint(-4.8501F, -17.0567F, 0.0F);
		laser.cubeList.add(new ModelBox(laser, 0, 0, 4.8501F, 16.5567F, 4.0F, 2, 4, 4, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 6.8501F, 17.0567F, 0.0F, 3, 3, 10, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 7.3501F, 16.7567F, 0.0F, 2, 1, 10, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 9.1501F, 17.5567F, 0.0F, 1, 2, 10, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 7.3501F, 19.3567F, 0.0F, 2, 1, 10, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 10.1501F, 17.5567F, 4.0F, 1, 2, 4, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 7.3501F, 15.7567F, 4.0F, 2, 1, 4, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 7.3501F, 20.3567F, 4.0F, 2, 1, 4, 0.0F, true));

		laser9_r1 = new ModelRenderer(this);
		laser9_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		laser.addChild(laser9_r1);
		setRotationAngle(laser9_r1, 0.0F, 0.0F, 2.3794F);
		laser9_r1.cubeList.add(new ModelBox(laser9_r1, 0, 0, 5.8F, -21.5F, 4.0F, 2, 1, 4, 0.0F, true));

		laser8_r1 = new ModelRenderer(this);
		laser8_r1.setRotationPoint(-1.381F, -3.4467F, 0.0F);
		laser.addChild(laser8_r1);
		setRotationAngle(laser8_r1, 0.0F, 0.0F, 2.3794F);
		laser8_r1.cubeList.add(new ModelBox(laser8_r1, 0, 0, 5.8F, -23.5F, 4.0F, 1, 2, 4, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		laser.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}