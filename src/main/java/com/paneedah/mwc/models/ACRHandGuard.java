package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ACRHandGuard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer handguard32_r1;
	private final ModelRenderer ACR166_r1;
	private final ModelRenderer ACR145_r1;
	private final ModelRenderer ACR146_r1;
	private final ModelRenderer ACR165_r1;
	private final ModelRenderer ACR164_r1;
	private final ModelRenderer ACR160_r1;
	private final ModelRenderer ACR159_r1;
	private final ModelRenderer ACR158_r1;

	public ACRHandGuard() {
		textureWidth = 400;
		textureHeight = 400;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(-1.4695F, -12.2797F, -36.3269F);
		handguard.cubeList.add(new ModelBox(handguard, 145, 269, 1.7495F, -0.8203F, -12.6731F, 1, 1, 26, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 248, 172, -1.2305F, 0.9797F, -12.6731F, 2, 1, 26, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 117, 268, 0.1695F, 0.9797F, -12.6731F, 1, 1, 26, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 284, 277, 1.7695F, -3.1203F, -12.6731F, 1, 3, 24, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 278, 145, 1.4695F, -3.5203F, -12.6731F, 1, 2, 24, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 84, 278, -2.5305F, -3.5203F, -12.6731F, 1, 2, 24, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 251, 284, -2.8305F, -3.1203F, -12.6731F, 1, 3, 24, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 274, -2.8105F, -0.8203F, -12.6731F, 1, 1, 26, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 163, 65, 0.1695F, 1.6797F, 9.3269F, 1, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 66, 125, -1.2305F, 1.6797F, 9.3269F, 2, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 109, 159, -1.3305F, 1.4797F, 10.3269F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 102, 159, 0.2695F, 1.4797F, 10.3269F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 24, 86, 1.7695F, -2.1203F, 11.3269F, 1, 2, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 24, 86, -2.8305F, -2.1203F, 11.3269F, 1, 2, 2, 0.0F, false));

		handguard32_r1 = new ModelRenderer(this);
		handguard32_r1.setRotationPoint(1.4695F, -5.8352F, -31.2798F);
		handguard.addChild(handguard32_r1);
		setRotationAngle(handguard32_r1, -2.1935F, 0.0F, 0.0F);
		handguard32_r1.cubeList.add(new ModelBox(handguard32_r1, 29, 46, 0.3F, -37.0F, -23.0F, 1, 1, 1, 0.0F, false));
		handguard32_r1.cubeList.add(new ModelBox(handguard32_r1, 29, 48, -4.3F, -37.0F, -23.0F, 1, 1, 1, 0.0F, false));
		handguard32_r1.cubeList.add(new ModelBox(handguard32_r1, 27, 55, 0.3F, -38.4F, -23.0F, 1, 2, 2, -0.001F, false));
		handguard32_r1.cubeList.add(new ModelBox(handguard32_r1, 12, 59, -4.3F, -38.4F, -23.0F, 1, 2, 2, -0.001F, false));

		ACR166_r1 = new ModelRenderer(this);
		ACR166_r1.setRotationPoint(19.0021F, -28.6711F, 36.3269F);
		handguard.addChild(ACR166_r1);
		setRotationAngle(ACR166_r1, 0.0F, 0.0F, -2.4166F);
		ACR166_r1.cubeList.add(new ModelBox(ACR166_r1, 67, 68, -3.55F, -35.8F, -46.0F, 1, 1, 11, 0.0F, false));

		ACR145_r1 = new ModelRenderer(this);
		ACR145_r1.setRotationPoint(-39.4094F, -15.4115F, 36.3269F);
		handguard.addChild(ACR145_r1);
		setRotationAngle(ACR145_r1, 0.0F, 0.0F, 1.9705F);
		ACR145_r1.cubeList.add(new ModelBox(ACR145_r1, 303, 115, -3.3F, -39.4F, -49.0F, 1, 1, 24, 0.0F, false));

		ACR146_r1 = new ModelRenderer(this);
		ACR146_r1.setRotationPoint(17.1621F, 33.1498F, 36.3269F);
		handguard.addChild(ACR146_r1);
		setRotationAngle(ACR146_r1, 0.0F, 0.0F, -0.409F);
		ACR146_r1.cubeList.add(new ModelBox(ACR146_r1, 303, 83, 0.3F, -39.4F, -49.0F, 1, 1, 24, 0.0F, false));

		ACR165_r1 = new ModelRenderer(this);
		ACR165_r1.setRotationPoint(20.4794F, -25.7108F, 36.3269F);
		handguard.addChild(ACR165_r1);
		setRotationAngle(ACR165_r1, 0.0F, 0.0F, -2.4166F);
		ACR165_r1.cubeList.add(new ModelBox(ACR165_r1, 70, 0, -2.25F, -34.6F, -46.0F, 1, 1, 11, 0.0F, false));

		ACR164_r1 = new ModelRenderer(this);
		ACR164_r1.setRotationPoint(19.9578F, -26.7086F, 36.3269F);
		handguard.addChild(ACR164_r1);
		setRotationAngle(ACR164_r1, 0.0F, 0.0F, -2.4166F);
		ACR164_r1.cubeList.add(new ModelBox(ACR164_r1, 217, 123, -2.7F, -35.0F, -35.0F, 2, 1, 11, 0.0F, false));
		ACR164_r1.cubeList.add(new ModelBox(ACR164_r1, 32, 106, -2.7F, -35.0F, -39.0F, 2, 1, 1, 0.0F, false));
		ACR164_r1.cubeList.add(new ModelBox(ACR164_r1, 47, 106, -2.7F, -35.0F, -43.0F, 2, 1, 1, 0.0F, false));
		ACR164_r1.cubeList.add(new ModelBox(ACR164_r1, 127, 13, -2.7F, -35.0F, -49.0F, 2, 1, 3, 0.0F, false));

		ACR160_r1 = new ModelRenderer(this);
		ACR160_r1.setRotationPoint(25.0861F, -22.9446F, 36.3269F);
		handguard.addChild(ACR160_r1);
		setRotationAngle(ACR160_r1, 0.0F, 0.0F, -2.3423F);
		ACR160_r1.cubeList.add(new ModelBox(ACR160_r1, 60, 216, -0.7F, -34.6F, -46.0F, 1, 1, 12, 0.0F, false));

		ACR159_r1 = new ModelRenderer(this);
		ACR159_r1.setRotationPoint(28.0679F, -24.0851F, 36.3269F);
		handguard.addChild(ACR159_r1);
		setRotationAngle(ACR159_r1, 0.0F, 0.0F, -2.3423F);
		ACR159_r1.cubeList.add(new ModelBox(ACR159_r1, 20, 92, 0.55F, -35.8F, -46.0F, 1, 1, 11, 0.0F, false));

		ACR158_r1 = new ModelRenderer(this);
		ACR158_r1.setRotationPoint(26.0517F, -23.3367F, 36.3269F);
		handguard.addChild(ACR158_r1);
		setRotationAngle(ACR158_r1, 0.0F, 0.0F, -2.3423F);
		ACR158_r1.cubeList.add(new ModelBox(ACR158_r1, 20, 67, -0.3F, -35.0F, -35.0F, 1, 2, 11, 0.0F, false));
		ACR158_r1.cubeList.add(new ModelBox(ACR158_r1, 131, 146, -0.3F, -35.0F, -39.0F, 1, 2, 1, 0.0F, false));
		ACR158_r1.cubeList.add(new ModelBox(ACR158_r1, 0, 147, -0.3F, -35.0F, -43.0F, 1, 2, 1, 0.0F, false));
		ACR158_r1.cubeList.add(new ModelBox(ACR158_r1, 141, 80, -0.3F, -35.0F, -49.0F, 1, 2, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}