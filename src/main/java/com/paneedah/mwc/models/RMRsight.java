package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class RMRsight extends ModelBase {
	private final ModelRenderer Sight;
	private final ModelRenderer sight37_r1;
	private final ModelRenderer sight36_r1;
	private final ModelRenderer sight26_r1;
	private final ModelRenderer sight24_r1;
	private final ModelRenderer sight23_r1;
	private final ModelRenderer sight22_r1;
	private final ModelRenderer sight21_r1;
	private final ModelRenderer stand;
	private final ModelRenderer sight40_r1;
	private final ModelRenderer sight39_r1;
	private final ModelRenderer sight8_r1;
	private final ModelRenderer sight7_r1;

	public RMRsight() {
		textureWidth = 80;
		textureHeight = 80;

		Sight = new ModelRenderer(this);
		Sight.setRotationPoint(2.1762F, -3.0914F, -5.4192F);
		Sight.cubeList.add(new ModelBox(Sight, 0, 0, -4.6762F, 3.0914F, -3.9808F, 9, 2, 15, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 33, 12, -3.1762F, 3.0914F, -4.2808F, 6, 2, 1, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 25, 43, -3.2762F, 2.2914F, -4.5808F, 6, 1, 1, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 0, 4, 1.9238F, 2.2914F, -4.5808F, 1, 1, 1, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 48, 38, -0.5762F, 2.2914F, -4.1808F, 5, 1, 7, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 19, 35, -4.7762F, 2.3114F, -4.1808F, 5, 1, 7, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 16, 55, -4.7762F, 1.5914F, -4.1808F, 1, 1, 7, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 0, 55, 3.4238F, 1.5914F, -4.1808F, 1, 1, 7, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 0, 35, 3.4238F, -3.4086F, -4.1808F, 1, 5, 5, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 29, 17, -4.7762F, -3.4086F, -4.1808F, 1, 5, 5, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 48, 32, -4.1762F, -3.9086F, -4.1908F, 8, 1, 5, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 60, 58, -4.5762F, 1.5914F, 2.8192F, 2, 2, 4, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 9, 55, 2.2238F, 1.5914F, 2.8192F, 2, 2, 4, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 30, 51, -4.5762F, 1.5914F, 6.8192F, 7, 2, 4, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 0, 45, 2.2238F, 1.5914F, 6.8192F, 2, 2, 4, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 0, 26, -4.1762F, -3.4086F, -4.1808F, 1, 1, 5, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 0, 9, 2.8238F, -3.4086F, -4.1808F, 1, 1, 5, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 25, 57, -2.5762F, 2.4914F, 2.8192F, 5, 1, 4, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 60, 47, 3.5238F, -3.5086F, -3.5808F, 1, 5, 4, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 50, 58, -4.8762F, -3.5086F, -3.5808F, 1, 5, 4, 0.0F, false));
		Sight.cubeList.add(new ModelBox(Sight, 48, 12, -4.1762F, -4.0086F, -3.5808F, 8, 1, 4, 0.0F, false));

		sight37_r1 = new ModelRenderer(this);
		sight37_r1.setRotationPoint(7.9885F, -34.6413F, 5.4192F);
		Sight.addChild(sight37_r1);
		setRotationAngle(sight37_r1, 0.0F, 0.0F, 3.0369F);
		sight37_r1.cubeList.add(new ModelBox(sight37_r1, 58, 17, 6.7F, -30.6F, -9.0F, 4, 1, 4, 0.0F, false));

		sight36_r1 = new ModelRenderer(this);
		sight36_r1.setRotationPoint(25.8282F, -2.5665F, 5.4192F);
		Sight.addChild(sight36_r1);
		setRotationAngle(sight36_r1, 0.0F, 0.0F, -1.4521F);
		sight36_r1.cubeList.add(new ModelBox(sight36_r1, 19, 43, -2.7F, -30.6F, -9.0F, 1, 4, 4, 0.0F, false));

		sight26_r1 = new ModelRenderer(this);
		sight26_r1.setRotationPoint(-2.1762F, 15.9741F, -23.1749F);
		Sight.addChild(sight26_r1);
		setRotationAngle(sight26_r1, -1.041F, 0.0F, 0.0F);
		sight26_r1.cubeList.add(new ModelBox(sight26_r1, 0, 0, 5.6F, -30.5F, -4.6F, 1, 3, 6, 0.0F, false));
		sight26_r1.cubeList.add(new ModelBox(sight26_r1, 0, 17, -2.6F, -30.5F, -4.6F, 1, 3, 6, 0.0F, false));

		sight24_r1 = new ModelRenderer(this);
		sight24_r1.setRotationPoint(25.8379F, 13.9227F, 5.4192F);
		Sight.addChild(sight24_r1);
		setRotationAngle(sight24_r1, 0.0F, 0.0F, -1.0782F);
		sight24_r1.cubeList.add(new ModelBox(sight24_r1, 58, 22, 3.0F, -30.0F, -9.6F, 1, 3, 5, 0.0F, false));

		sight23_r1 = new ModelRenderer(this);
		sight23_r1.setRotationPoint(-14.7326F, -29.6897F, 5.4192F);
		Sight.addChild(sight23_r1);
		setRotationAngle(sight23_r1, 0.0F, 0.0F, 2.6397F);
		sight23_r1.cubeList.add(new ModelBox(sight23_r1, 58, 1, 1.0F, -30.0F, -9.6F, 3, 1, 5, 0.0F, false));

		sight22_r1 = new ModelRenderer(this);
		sight22_r1.setRotationPoint(7.7995F, -34.4314F, 5.4192F);
		Sight.addChild(sight22_r1);
		setRotationAngle(sight22_r1, 0.0F, 0.0F, 3.0369F);
		sight22_r1.cubeList.add(new ModelBox(sight22_r1, 47, 52, 6.6F, -30.5F, -9.6F, 4, 1, 5, 0.0F, false));

		sight21_r1 = new ModelRenderer(this);
		sight21_r1.setRotationPoint(25.8171F, -2.379F, 5.4192F);
		Sight.addChild(sight21_r1);
		setRotationAngle(sight21_r1, 0.0F, 0.0F, -1.4521F);
		sight21_r1.cubeList.add(new ModelBox(sight21_r1, 38, 57, -2.6F, -30.5F, -9.6F, 1, 4, 5, 0.0F, false));

		stand = new ModelRenderer(this);
		stand.setRotationPoint(2.0F, 3.3271F, 0.3318F);
		stand.cubeList.add(new ModelBox(stand, 0, 36, -5.0F, -0.8271F, -9.8318F, 2, 4, 15, 0.0F, false));
		stand.cubeList.add(new ModelBox(stand, 0, 17, -3.5F, -0.8271F, -9.8318F, 7, 3, 15, 0.0F, false));
		stand.cubeList.add(new ModelBox(stand, 29, 32, 3.0F, -0.8271F, -9.8318F, 2, 4, 15, 0.0F, false));
		stand.cubeList.add(new ModelBox(stand, 29, 17, -4.0F, -2.8271F, -8.8318F, 8, 2, 13, 0.0F, false));
		stand.cubeList.add(new ModelBox(stand, 7, 26, -1.5F, -1.7271F, 4.2682F, 3, 2, 1, 0.0F, false));

		sight40_r1 = new ModelRenderer(this);
		sight40_r1.setRotationPoint(-2.0F, 20.6729F, -0.3318F);
		stand.addChild(sight40_r1);
		setRotationAngle(sight40_r1, -0.7854F, 0.0F, 0.0F);
		sight40_r1.cubeList.add(new ModelBox(sight40_r1, 33, 0, -3.5F, -16.0F, -14.5F, 11, 3, 3, -0.3F, false));

		sight39_r1 = new ModelRenderer(this);
		sight39_r1.setRotationPoint(-2.0F, 20.6729F, -0.3318F);
		stand.addChild(sight39_r1);
		setRotationAngle(sight39_r1, 0.7854F, 0.0F, 0.0F);
		sight39_r1.cubeList.add(new ModelBox(sight39_r1, 33, 6, -3.5F, -19.0F, 8.4F, 11, 3, 3, -0.3F, false));

		sight8_r1 = new ModelRenderer(this);
		sight8_r1.setRotationPoint(13.2785F, -13.7986F, -0.3318F);
		stand.addChild(sight8_r1);
		setRotationAngle(sight8_r1, 0.0F, 0.0F, -2.3562F);
		sight8_r1.cubeList.add(new ModelBox(sight8_r1, 7, 9, 0.5F, -20.4F, 4.6F, 3, 2, 1, 0.0F, false));

		sight7_r1 = new ModelRenderer(this);
		sight7_r1.setRotationPoint(18.3999F, -11.6772F, -0.3318F);
		stand.addChild(sight7_r1);
		setRotationAngle(sight7_r1, 0.0F, 0.0F, -2.3562F);
		sight7_r1.cubeList.add(new ModelBox(sight7_r1, 0, 0, 3.5F, -20.4F, 4.6F, 2, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Sight.render(f5);
		stand.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}