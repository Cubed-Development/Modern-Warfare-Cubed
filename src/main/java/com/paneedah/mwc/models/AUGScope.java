package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AUGScope extends ModelWithAttachments {
	private final ModelRenderer scope;
	private final ModelRenderer scope6_r1;
	private final ModelRenderer scope5_r1;
	private final ModelRenderer scope4_r1;
	private final ModelRenderer scope3_r1;
	private final ModelRenderer scope2_r1;
	private final ModelRenderer scope1_r1;
	private final ModelRenderer scope13_r1;
	private final ModelRenderer scope12_r1;
	private final ModelRenderer scope11_r1;

	public AUGScope() {
		textureWidth = 300;
		textureHeight = 300;

		scope = new ModelRenderer(this);
		scope.setRotationPoint(-1.4231F, -14.0812F, -15.3907F);
		scope.cubeList.add(new ModelBox(scope, 14, 7, -1.2769F, 1.5812F, -10.3093F, 2, 1, 4, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 74, 87, 0.1231F, 1.5812F, -10.3093F, 1, 1, 4, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 15, 91, -1.0769F, 0.0812F, 9.7907F, 2, 2, 1, 0.0F, false));

		scope6_r1 = new ModelRenderer(this);
		scope6_r1.setRotationPoint(1.4231F, -30.5821F, 33.7018F);
		scope.addChild(scope6_r1);
		setRotationAngle(scope6_r1, 2.3794F, 0.0F, 0.0F);
		scope6_r1.cubeList.add(new ModelBox(scope6_r1, 32, 45, -2.5F, -38.0F, -4.6F, 2, 5, 1, 0.0F, false));

		scope5_r1 = new ModelRenderer(this);
		scope5_r1.setRotationPoint(1.4231F, -40.0547F, 29.3772F);
		scope.addChild(scope5_r1);
		setRotationAngle(scope5_r1, 2.6025F, 0.0F, 0.0F);
		scope5_r1.cubeList.add(new ModelBox(scope5_r1, 77, 44, -2.5F, -41.0F, -3.8F, 2, 2, 2, 0.0F, false));

		scope4_r1 = new ModelRenderer(this);
		scope4_r1.setRotationPoint(1.4231F, 14.3294F, 45.2261F);
		scope.addChild(scope4_r1);
		setRotationAngle(scope4_r1, 1.041F, 0.0F, 0.0F);
		scope4_r1.cubeList.add(new ModelBox(scope4_r1, 109, 49, -2.5F, -37.9F, -5.8F, 2, 1, 6, 0.0F, false));

		scope3_r1 = new ModelRenderer(this);
		scope3_r1.setRotationPoint(1.4231F, 2.9812F, 45.7096F);
		scope.addChild(scope3_r1);
		setRotationAngle(scope3_r1, 1.3756F, 0.0F, 0.0F);
		scope3_r1.cubeList.add(new ModelBox(scope3_r1, 0, 45, -2.5F, -36.0F, -6.2F, 2, 1, 2, 0.0F, false));

		scope2_r1 = new ModelRenderer(this);
		scope2_r1.setRotationPoint(1.4231F, 13.4196F, 34.2388F);
		scope.addChild(scope2_r1);
		setRotationAngle(scope2_r1, 0.7436F, 0.0F, 0.0F);
		scope2_r1.cubeList.add(new ModelBox(scope2_r1, 32, 87, -2.5F, -36.5F, -22.2F, 2, 1, 9, 0.0F, false));

		scope1_r1 = new ModelRenderer(this);
		scope1_r1.setRotationPoint(1.4231F, 10.2937F, 35.5059F);
		scope.addChild(scope1_r1);
		setRotationAngle(scope1_r1, 0.8179F, 0.0F, 0.0F);
		scope1_r1.cubeList.add(new ModelBox(scope1_r1, 16, 134, -2.5F, -37.1F, -22.0F, 2, 1, 8, 0.0F, false));

		scope13_r1 = new ModelRenderer(this);
		scope13_r1.setRotationPoint(1.4231F, 31.872F, 23.2297F);
		scope.addChild(scope13_r1);
		setRotationAngle(scope13_r1, 0.2231F, 0.0F, 0.0F);
		scope13_r1.cubeList.add(new ModelBox(scope13_r1, 88, 66, -3.0F, -38.1F, -23.8F, 3, 1, 1, 0.0F, false));

		scope12_r1 = new ModelRenderer(this);
		scope12_r1.setRotationPoint(1.4231F, 31.9582F, 23.0602F);
		scope.addChild(scope12_r1);
		setRotationAngle(scope12_r1, 0.2231F, 0.0F, 0.0F);
		scope12_r1.cubeList.add(new ModelBox(scope12_r1, 38, 14, -2.0F, -37.3F, -23.5F, 1, 1, 1, 0.0F, false));

		scope11_r1 = new ModelRenderer(this);
		scope11_r1.setRotationPoint(1.4231F, 31.4913F, 22.8287F);
		scope.addChild(scope11_r1);
		setRotationAngle(scope11_r1, 0.2231F, 0.0F, 0.0F);
		scope11_r1.cubeList.add(new ModelBox(scope11_r1, 0, 7, -2.7F, -36.5F, -25.7F, 2, 1, 4, 0.0F, false));
		scope11_r1.cubeList.add(new ModelBox(scope11_r1, 45, 87, -1.3F, -36.5F, -25.7F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		scope.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}