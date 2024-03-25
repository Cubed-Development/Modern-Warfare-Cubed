package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SCCYCPX2Laser extends ModelWithAttachments {
	private final ModelRenderer laser;
	private final ModelRenderer gun19_r1;
	private final ModelRenderer gun21_r3;
	private final ModelRenderer gun21_r4;
	private final ModelRenderer gun24_r1;
	private final ModelRenderer gun22_r2;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun16_r5;
	private final ModelRenderer gun17_r5;
	private final ModelRenderer gun17_r6;

	public SCCYCPX2Laser() {
		textureWidth = 170;
		textureHeight = 170;

		laser = new ModelRenderer(this);
		laser.setRotationPoint(0.0F, 24.0F, 0.0F);
		laser.cubeList.add(new ModelBox(laser, 31, 86, -3.0F, -32.7F, -17.5F, 3, 3, 2, 0.101F, false));
		laser.cubeList.add(new ModelBox(laser, 21, 57, -1.75F, -31.7F, -22.5F, 2, 3, 5, 0.001F, false));
		laser.cubeList.add(new ModelBox(laser, 62, 3, -2.5F, -30.9F, -22.85F, 2, 2, 1, -0.2F, false));
		laser.cubeList.add(new ModelBox(laser, 95, 0, -1.75F, -31.1F, -21.0F, 2, 5, 4, 0.0F, false));
		laser.cubeList.add(new ModelBox(laser, 86, 71, -3.25F, -31.1F, -21.0F, 2, 5, 4, -0.001F, false));
		laser.cubeList.add(new ModelBox(laser, 0, 56, -3.25F, -31.7F, -22.5F, 2, 3, 5, 0.0F, false));

		gun19_r1 = new ModelRenderer(this);
		gun19_r1.setRotationPoint(0.0F, -29.7F, -15.5F);
		laser.addChild(gun19_r1);
		setRotationAngle(gun19_r1, 0.576F, 0.0F, 0.0F);
		gun19_r1.cubeList.add(new ModelBox(gun19_r1, 9, 5, -3.0F, -1.0F, -1.1F, 3, 1, 1, 0.099F, false));

		gun21_r3 = new ModelRenderer(this);
		gun21_r3.setRotationPoint(-1.25F, -28.7F, -22.5F);
		laser.addChild(gun21_r3);
		setRotationAngle(gun21_r3, -1.0472F, 0.0F, 0.0F);
		gun21_r3.cubeList.add(new ModelBox(gun21_r3, 82, 16, -2.0F, -2.0F, 0.0F, 2, 2, 3, -0.002F, false));
		gun21_r3.cubeList.add(new ModelBox(gun21_r3, 34, 79, -0.5F, -2.0F, 0.0F, 2, 2, 3, -0.001F, false));

		gun21_r4 = new ModelRenderer(this);
		gun21_r4.setRotationPoint(-2.35F, -27.7F, -21.3F);
		laser.addChild(gun21_r4);
		setRotationAngle(gun21_r4, -0.6807F, 0.0F, 0.0F);
		gun21_r4.cubeList.add(new ModelBox(gun21_r4, 31, 47, -1.0F, -2.0F, 0.0F, 1, 2, 2, -0.001F, false));
		gun21_r4.cubeList.add(new ModelBox(gun21_r4, 50, 47, 1.7F, -2.0F, 0.0F, 1, 2, 2, -0.001F, false));

		gun24_r1 = new ModelRenderer(this);
		gun24_r1.setRotationPoint(-3.55F, -25.7F, -20.5F);
		laser.addChild(gun24_r1);
		setRotationAngle(gun24_r1, -0.6807F, 0.0F, 0.0F);
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 94, 80, 0.05F, -3.0F, 1.0F, 1, 1, 1, -0.2F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 86, 95, 3.05F, -3.0F, 1.0F, 1, 1, 1, -0.2F, false));

		gun22_r2 = new ModelRenderer(this);
		gun22_r2.setRotationPoint(-3.55F, -27.9F, -21.9F);
		laser.addChild(gun22_r2);
		setRotationAngle(gun22_r2, -0.6807F, 0.0F, 0.0F);
		gun22_r2.cubeList.add(new ModelBox(gun22_r2, 73, 94, 0.05F, -3.0F, 1.0F, 1, 1, 1, -0.2F, false));
		gun22_r2.cubeList.add(new ModelBox(gun22_r2, 24, 98, 3.05F, -3.0F, 1.0F, 1, 1, 1, -0.2F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(-3.55F, -29.1F, -24.6F);
		laser.addChild(gun23_r1);
		setRotationAngle(gun23_r1, -0.6807F, 0.0F, 0.0F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 63, 94, 0.05F, -3.0F, 1.0F, 1, 1, 1, -0.2F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 63, 97, 3.05F, -3.0F, 1.0F, 1, 1, 1, -0.2F, false));

		gun16_r5 = new ModelRenderer(this);
		gun16_r5.setRotationPoint(0.0F, -24.8F, -16.3F);
		laser.addChild(gun16_r5);
		setRotationAngle(gun16_r5, -0.0524F, 0.0F, 0.0F);
		gun16_r5.cubeList.add(new ModelBox(gun16_r5, 27, 131, -3.0F, -1.0F, 0.0F, 3, 1, 5, 0.1F, false));

		gun17_r5 = new ModelRenderer(this);
		gun17_r5.setRotationPoint(0.0F, -24.8F, -16.3F);
		laser.addChild(gun17_r5);
		setRotationAngle(gun17_r5, -0.7854F, 0.0F, 0.0F);
		gun17_r5.cubeList.add(new ModelBox(gun17_r5, 88, 88, -3.0F, -1.0F, -2.1F, 3, 1, 2, 0.099F, false));

		gun17_r6 = new ModelRenderer(this);
		gun17_r6.setRotationPoint(0.0F, -26.2F, -17.7F);
		laser.addChild(gun17_r6);
		setRotationAngle(gun17_r6, -0.1222F, 0.0F, 0.0F);
		gun17_r6.cubeList.add(new ModelBox(gun17_r6, 9, 9, -3.0F, -4.0F, 0.0F, 3, 4, 1, 0.1F, false));
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