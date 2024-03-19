package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class EotechScopeRing extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer scope15_r1;
	private final ModelRenderer scope14_r1;
	private final ModelRenderer scope13_r1;
	private final ModelRenderer scope12_r1;
	private final ModelRenderer scope11_r1;
	private final ModelRenderer scope10_r1;
	private final ModelRenderer scope9_r1;
	private final ModelRenderer scope8_r1;
	private final ModelRenderer scope7_r1;
	private final ModelRenderer scope6_r1;
	private final ModelRenderer scope5_r1;
	private final ModelRenderer scope16_r1;

	public EotechScopeRing() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-18.1963F, 17.8298F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, 18.1963F, -17.8298F, 0.0F, 4, 1, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 15.1963F, -23.8298F, 0.0F, 1, 4, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 24.1963F, -23.8298F, 0.0F, 1, 4, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 18.1963F, -26.8298F, 0.0F, 4, 1, 4, 0.0F, true));

		scope15_r1 = new ModelRenderer(this);
		scope15_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(scope15_r1);
		setRotationAngle(scope15_r1, 0.0F, 0.0F, 0.7854F);
		scope15_r1.cubeList.add(new ModelBox(scope15_r1, 0, 0, -1.65F, -25.05F, 0.0F, 1, 1, 4, 0.0F, true));

		scope14_r1 = new ModelRenderer(this);
		scope14_r1.setRotationPoint(-5.1619F, -2.1381F, 0.0F);
		bone.addChild(scope14_r1);
		setRotationAngle(scope14_r1, 0.0F, 0.0F, 0.7854F);
		scope14_r1.cubeList.add(new ModelBox(scope14_r1, 0, 0, -1.65F, -32.35F, 0.0F, 1, 1, 4, 0.0F, true));

		scope13_r1 = new ModelRenderer(this);
		scope13_r1.setRotationPoint(-3.0238F, -7.3F, 0.0F);
		bone.addChild(scope13_r1);
		setRotationAngle(scope13_r1, 0.0F, 0.0F, 0.7854F);
		scope13_r1.cubeList.add(new ModelBox(scope13_r1, 0, 0, 5.65F, -32.35F, 0.0F, 1, 1, 4, 0.0F, true));

		scope12_r1 = new ModelRenderer(this);
		scope12_r1.setRotationPoint(8.4344F, 1.2425F, 0.0F);
		bone.addChild(scope12_r1);
		setRotationAngle(scope12_r1, 0.0F, 0.0F, 0.409F);
		scope12_r1.cubeList.add(new ModelBox(scope12_r1, 0, 0, 6.0F, -26.0F, 0.0F, 1, 2, 4, 0.0F, true));

		scope11_r1 = new ModelRenderer(this);
		scope11_r1.setRotationPoint(28.2881F, 2.8331F, 0.0F);
		bone.addChild(scope11_r1);
		setRotationAngle(scope11_r1, 0.0F, 0.0F, -0.409F);
		scope11_r1.cubeList.add(new ModelBox(scope11_r1, 0, 0, -3.0F, -26.0F, 0.0F, 1, 2, 4, 0.0F, true));

		scope10_r1 = new ModelRenderer(this);
		scope10_r1.setRotationPoint(6.0191F, 4.8892F, 0.0F);
		bone.addChild(scope10_r1);
		setRotationAngle(scope10_r1, 0.0F, 0.0F, 0.409F);
		scope10_r1.cubeList.add(new ModelBox(scope10_r1, 0, 0, -3.0F, -32.0F, 0.0F, 1, 2, 4, 0.0F, true));

		scope9_r1 = new ModelRenderer(this);
		scope9_r1.setRotationPoint(30.7034F, 6.4799F, 0.0F);
		bone.addChild(scope9_r1);
		setRotationAngle(scope9_r1, 0.0F, 0.0F, -0.409F);
		scope9_r1.cubeList.add(new ModelBox(scope9_r1, 0, 0, 6.0F, -32.0F, 0.0F, 1, 2, 4, 0.0F, true));

		scope8_r1 = new ModelRenderer(this);
		scope8_r1.setRotationPoint(27.6724F, 5.8641F, 0.0F);
		bone.addChild(scope8_r1);
		setRotationAngle(scope8_r1, 0.0F, 0.0F, -0.409F);
		scope8_r1.cubeList.add(new ModelBox(scope8_r1, 0, 0, 4.0F, -24.0F, 0.0F, 2, 1, 4, 0.0F, true));

		scope7_r1 = new ModelRenderer(this);
		scope7_r1.setRotationPoint(9.0501F, 4.2735F, 0.0F);
		bone.addChild(scope7_r1);
		setRotationAngle(scope7_r1, 0.0F, 0.0F, 0.409F);
		scope7_r1.cubeList.add(new ModelBox(scope7_r1, 0, 0, -2.0F, -24.0F, 0.0F, 2, 1, 4, 0.0F, true));

		scope6_r1 = new ModelRenderer(this);
		scope6_r1.setRotationPoint(31.3191F, 3.4488F, 0.0F);
		bone.addChild(scope6_r1);
		setRotationAngle(scope6_r1, 0.0F, 0.0F, -0.409F);
		scope6_r1.cubeList.add(new ModelBox(scope6_r1, 0, 0, -2.0F, -33.0F, 0.0F, 2, 1, 4, 0.0F, true));

		scope5_r1 = new ModelRenderer(this);
		scope5_r1.setRotationPoint(5.4034F, 1.8582F, 0.0F);
		bone.addChild(scope5_r1);
		setRotationAngle(scope5_r1, 0.0F, 0.0F, 0.409F);
		scope5_r1.cubeList.add(new ModelBox(scope5_r1, 0, 0, 4.0F, -33.0F, 0.0F, 2, 1, 4, 0.0F, true));

		scope16_r1 = new ModelRenderer(this);
		scope16_r1.setRotationPoint(2.1381F, -5.1619F, 0.0F);
		bone.addChild(scope16_r1);
		setRotationAngle(scope16_r1, 0.0F, 0.0F, 0.7854F);
		scope16_r1.cubeList.add(new ModelBox(scope16_r1, 0, 0, 5.65F, -25.05F, 0.0F, 1, 1, 4, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}