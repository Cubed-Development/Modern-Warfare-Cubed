package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Laser2 extends ModelBase {
	private final ModelRenderer laser;
	private final ModelRenderer laser28_r1;
	private final ModelRenderer laser26_r1;
	private final ModelRenderer laser22_r1;
	private final ModelRenderer laser13_r1;

	public Laser2() {
		textureWidth = 512;
		textureHeight = 256;

		laser = new ModelRenderer(this);
		laser.setRotationPoint(0.0F, 24.0F, 0.0F);
		laser.cubeList.add(new ModelBox(laser, 0, 0, 2.0F, -25.0F, 0.0F, 3, 4, 10, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 100, 0, 0.0F, -24.5F, 4.0F, 2, 4, 4, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 2.5F, -25.5F, 0.0F, 2, 6, 10, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 4.0F, -25.5F, 3.0F, 1, 1, 2, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 100, 0, 4.3F, -22.5F, 7.5F, 1, 2, 2, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 100, 0, 4.4F, -24.1F, 4.5F, 1, 2, 2, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 100, 0, 2.5F, -25.0F, -1.5F, 2, 2, 12, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 100, 0, 3.0F, -23.7F, -1.5F, 1, 1, 12, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 100, 0, 3.0F, -25.3F, -1.5F, 1, 1, 12, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 100, 0, 2.2F, -24.5F, -1.5F, 1, 1, 12, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 100, 0, 3.8F, -24.5F, -1.5F, 1, 1, 12, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 4.05F, -24.2F, 0.5F, 1, 3, 2, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 100, 0, 4.1F, -25.4F, 3.5F, 1, 1, 1, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 100, 0, 4.1F, -21.0F, 3.5F, 1, 1, 1, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 3.0F, -20.4F, 3.5F, 1, 1, 1, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 4.0F, -22.6F, 9.2F, 1, 3, 1, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 4.0F, -21.6F, 3.2F, 1, 2, 6, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 4.05F, -24.2F, 2.0F, 1, 3, 1, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 3.0F, -25.6F, 3.5F, 1, 1, 1, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 3.4F, -20.2F, 0.5F, 1, 1, 1, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 2.9F, -20.2F, 0.5F, 1, 1, 1, 0.0F, true));
		laser.cubeList.add(new ModelBox(laser, 0, 0, 2.9F, -20.2F, 1.0F, 1, 1, 1, 0.0F, true));

		laser28_r1 = new ModelRenderer(this);
		laser28_r1.setRotationPoint(0.0F, 0.0144F, 0.3527F);
		laser.addChild(laser28_r1);
		setRotationAngle(laser28_r1, 0.0175F, 0.0F, 0.0F);
		laser28_r1.cubeList.add(new ModelBox(laser28_r1, 0, 0, 3.4F, -20.2F, 1.0F, 1, 1, 1, 0.0F, true));

		laser26_r1 = new ModelRenderer(this);
		laser26_r1.setRotationPoint(-13.3005F, -32.4495F, 0.0F);
		laser.addChild(laser26_r1);
		setRotationAngle(laser26_r1, 0.0F, 0.0F, 1.8961F);
		laser26_r1.cubeList.add(new ModelBox(laser26_r1, 0, 0, 5.7F, -21.2F, 0.8F, 1, 1, 1, 0.0F, true));
		laser26_r1.cubeList.add(new ModelBox(laser26_r1, 0, 0, 5.0F, -21.2F, 0.8F, 1, 1, 1, 0.0F, true));
		laser26_r1.cubeList.add(new ModelBox(laser26_r1, 0, 0, 5.5F, -21.0F, 0.2F, 1, 1, 3, 0.0F, true));
		laser26_r1.cubeList.add(new ModelBox(laser26_r1, 0, 0, 5.0F, -21.0F, 0.2F, 1, 1, 3, 0.0F, true));

		laser22_r1 = new ModelRenderer(this);
		laser22_r1.setRotationPoint(0.0F, -30.3576F, 19.8935F);
		laser.addChild(laser22_r1);
		setRotationAngle(laser22_r1, 2.3051F, 0.0F, 0.0F);
		laser22_r1.cubeList.add(new ModelBox(laser22_r1, 0, 0, 4.0F, -19.6F, 3.2F, 1, 1, 2, 0.0F, true));

		laser13_r1 = new ModelRenderer(this);
		laser13_r1.setRotationPoint(-4.1978F, -41.6705F, 0.0F);
		laser.addChild(laser13_r1);
		setRotationAngle(laser13_r1, 0.0F, 0.0F, 2.5281F);
		laser13_r1.cubeList.add(new ModelBox(laser13_r1, 100, 0, 4.5F, -21.5F, -1.0F, 2, 1, 1, 0.0F, true));
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
