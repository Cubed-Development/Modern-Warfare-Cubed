package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HKS20Handguard extends ModelWithAttachments {
	private final ModelRenderer handguard;
	private final ModelRenderer handguard60_r1;
	private final ModelRenderer handguard59_r1;
	private final ModelRenderer handguard58_r1;
	private final ModelRenderer handguard57_r1;
	private final ModelRenderer handguard56_r1;
	private final ModelRenderer handguard55_r1;
	private final ModelRenderer handguard42_r1;
	private final ModelRenderer handguard41_r1;
	private final ModelRenderer handguard37_r1;
	private final ModelRenderer handguard36_r1;
	private final ModelRenderer handguard33_r1;
	private final ModelRenderer handguard32_r1;
	private final ModelRenderer handguard31_r1;
	private final ModelRenderer handguard30_r1;
	private final ModelRenderer handguard29_r1;
	private final ModelRenderer handguard28_r1;
	private final ModelRenderer handguard11_r1;
	private final ModelRenderer handguard9_r1;

	public HKS20Handguard() {
		textureWidth = 512;
		textureHeight = 256;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 37.3133F, -17.3114F);
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -2.5F, -55.1633F, -39.1886F, 2, 2, 17, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 100, -2.5F, -54.4133F, -40.1786F, 2, 3, 27, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 100, -4.0F, -52.3133F, -43.1886F, 5, 1, 30, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -3.5F, -54.1633F, -39.1886F, 4, 2, 17, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -4.5F, -52.9133F, -39.1886F, 6, 2, 17, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -4.5F, -50.9133F, -39.1886F, 6, 6, 3, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -4.5F, -45.9133F, -36.1886F, 6, 1, 10, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -4.5F, -50.9133F, -25.1886F, 6, 4, 3, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -4.5F, -47.9133F, -36.1886F, 6, 1, 9, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, 0.4F, -50.9133F, -36.1886F, 1, 1, 11, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, 0.4F, -48.9133F, -36.1886F, 1, 3, 11, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, 0.4F, -49.9133F, -36.1886F, 1, 1, 1, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, 0.4F, -49.9133F, -33.1886F, 1, 1, 1, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, 0.4F, -49.9133F, -30.1886F, 1, 1, 1, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, 0.4F, -49.9133F, -27.1886F, 1, 1, 2, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -4.4F, -50.9133F, -36.1886F, 1, 1, 11, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -4.4F, -48.9133F, -36.1886F, 1, 3, 11, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -4.4F, -49.9133F, -36.1886F, 1, 1, 1, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -4.4F, -49.9133F, -33.1886F, 1, 1, 1, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -4.4F, -49.9133F, -30.1886F, 1, 1, 1, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -4.4F, -49.9133F, -27.1886F, 1, 1, 2, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 100, -2.5F, -46.3133F, -43.1786F, 2, 2, 30, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 100, -4.0F, -50.3133F, -43.1886F, 5, 2, 30, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 100, -4.0F, -47.3133F, -43.1886F, 5, 1, 30, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 100, -3.8F, -51.3133F, -43.1986F, 4, 4, 30, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 100, -0.2F, -51.3133F, -43.1986F, 1, 4, 30, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -4.3F, -46.3133F, -17.6886F, 4, 2, 5, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -1.7F, -46.3133F, -17.6886F, 3, 2, 5, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -1.705F, -45.3133F, -31.6886F, 3, 2, 17, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -4.3F, -45.3133F, -31.6886F, 3, 2, 17, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -1.705F, -44.8133F, -32.1886F, 3, 1, 1, 0.0F, true));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -4.3F, -44.8133F, -32.1886F, 3, 1, 1, 0.0F, true));

		handguard60_r1 = new ModelRenderer(this);
		handguard60_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard.addChild(handguard60_r1);
		setRotationAngle(handguard60_r1, -0.4461F, 0.0F, 0.0F);
		handguard60_r1.cubeList.add(new ModelBox(handguard60_r1, 0, 0, -4.5F, -31.5F, -38.0F, 6, 1, 1, 0.0F, true));

		handguard59_r1 = new ModelRenderer(this);
		handguard59_r1.setRotationPoint(0.0F, 1.2945F, -0.2936F);
		handguard.addChild(handguard59_r1);
		setRotationAngle(handguard59_r1, -0.4461F, 0.0F, 0.0F);
		handguard59_r1.cubeList.add(new ModelBox(handguard59_r1, 0, 0, -4.5F, -31.5F, -41.0F, 6, 1, 1, 0.0F, true));

		handguard58_r1 = new ModelRenderer(this);
		handguard58_r1.setRotationPoint(0.0F, 2.5889F, -0.5873F);
		handguard.addChild(handguard58_r1);
		setRotationAngle(handguard58_r1, -0.4461F, 0.0F, 0.0F);
		handguard58_r1.cubeList.add(new ModelBox(handguard58_r1, 0, 0, -4.5F, -31.5F, -44.0F, 6, 1, 1, 0.0F, true));

		handguard57_r1 = new ModelRenderer(this);
		handguard57_r1.setRotationPoint(0.0F, 3.8834F, -0.8809F);
		handguard.addChild(handguard57_r1);
		setRotationAngle(handguard57_r1, -0.4461F, 0.0F, 0.0F);
		handguard57_r1.cubeList.add(new ModelBox(handguard57_r1, 0, 0, -4.5F, -31.5F, -47.0F, 6, 1, 1, 0.0F, true));

		handguard56_r1 = new ModelRenderer(this);
		handguard56_r1.setRotationPoint(0.0F, 1.7699F, -16.2743F);
		handguard.addChild(handguard56_r1);
		setRotationAngle(handguard56_r1, -0.7854F, 0.0F, 0.0F);
		handguard56_r1.cubeList.add(new ModelBox(handguard56_r1, 0, 0, -4.3F, -33.0F, -35.0F, 3, 2, 1, 0.0F, true));
		handguard56_r1.cubeList.add(new ModelBox(handguard56_r1, 0, 0, -1.7F, -33.0F, -35.0F, 3, 2, 1, 0.0F, true));

		handguard55_r1 = new ModelRenderer(this);
		handguard55_r1.setRotationPoint(0.0F, -85.0008F, -1.0446F);
		handguard.addChild(handguard55_r1);
		setRotationAngle(handguard55_r1, 2.0076F, 0.0F, 0.0F);
		handguard55_r1.cubeList.add(new ModelBox(handguard55_r1, 0, 0, -4.3F, -30.0F, -32.0F, 3, 3, 1, 0.0F, true));
		handguard55_r1.cubeList.add(new ModelBox(handguard55_r1, 0, 0, -1.705F, -30.0F, -32.0F, 3, 3, 1, 0.0F, true));

		handguard42_r1 = new ModelRenderer(this);
		handguard42_r1.setRotationPoint(18.8358F, -22.1571F, 17.3114F);
		handguard.addChild(handguard42_r1);
		setRotationAngle(handguard42_r1, 0.0F, 0.0F, -0.6367F);
		handguard42_r1.cubeList.add(new ModelBox(handguard42_r1, 0, 100, -4.0F, -31.5F, -60.5F, 1, 1, 30, 0.0F, true));
		handguard42_r1.cubeList.add(new ModelBox(handguard42_r1, 0, 100, -4.0F, -33.0F, -60.5F, 2, 2, 30, 0.0F, true));

		handguard41_r1 = new ModelRenderer(this);
		handguard41_r1.setRotationPoint(-19.4235F, -20.3734F, 17.3114F);
		handguard.addChild(handguard41_r1);
		setRotationAngle(handguard41_r1, 0.0F, 0.0F, 0.6367F);
		handguard41_r1.cubeList.add(new ModelBox(handguard41_r1, 0, 100, 0.0F, -31.5F, -60.5F, 1, 1, 30, 0.0F, true));
		handguard41_r1.cubeList.add(new ModelBox(handguard41_r1, 0, 100, -1.0F, -33.0F, -60.5F, 2, 2, 30, 0.0F, true));

		handguard37_r1 = new ModelRenderer(this);
		handguard37_r1.setRotationPoint(-33.0542F, -29.3839F, 17.3114F);
		handguard.addChild(handguard37_r1);
		setRotationAngle(handguard37_r1, 0.0F, 0.0F, 0.9295F);
		handguard37_r1.cubeList.add(new ModelBox(handguard37_r1, 0, 100, 0.5F, -41.0F, -33.49F, 1, 1, 3, 0.0F, true));
		handguard37_r1.cubeList.add(new ModelBox(handguard37_r1, 0, 100, 0.3F, -40.8F, -57.49F, 1, 1, 24, 0.0F, true));
		handguard37_r1.cubeList.add(new ModelBox(handguard37_r1, 0, 100, 1.0F, -41.0F, -60.49F, 1, 1, 30, 0.0F, true));
		handguard37_r1.cubeList.add(new ModelBox(handguard37_r1, 0, 100, -0.5F, -41.0F, -57.49F, 1, 1, 27, 0.0F, true));

		handguard36_r1 = new ModelRenderer(this);
		handguard36_r1.setRotationPoint(31.8488F, -31.7875F, 17.3114F);
		handguard.addChild(handguard36_r1);
		setRotationAngle(handguard36_r1, 0.0F, 0.0F, -0.9295F);
		handguard36_r1.cubeList.add(new ModelBox(handguard36_r1, 0, 100, -4.5F, -41.0F, -33.49F, 1, 1, 3, 0.0F, true));
		handguard36_r1.cubeList.add(new ModelBox(handguard36_r1, 0, 100, -4.2F, -40.8F, -57.49F, 1, 1, 24, 0.0F, true));
		handguard36_r1.cubeList.add(new ModelBox(handguard36_r1, 0, 100, -3.5F, -41.0F, -57.49F, 1, 1, 27, 0.0F, true));
		handguard36_r1.cubeList.add(new ModelBox(handguard36_r1, 0, 100, -5.0F, -41.0F, -60.49F, 1, 1, 30, 0.0F, true));

		handguard33_r1 = new ModelRenderer(this);
		handguard33_r1.setRotationPoint(16.2857F, -16.4833F, 17.3114F);
		handguard.addChild(handguard33_r1);
		setRotationAngle(handguard33_r1, 0.0F, 0.0F, -0.409F);
		handguard33_r1.cubeList.add(new ModelBox(handguard33_r1, 0, 0, -0.5F, -40.85F, -56.5F, 1, 2, 17, 0.0F, true));

		handguard32_r1 = new ModelRenderer(this);
		handguard32_r1.setRotationPoint(-16.533F, -15.2903F, 17.3114F);
		handguard.addChild(handguard32_r1);
		setRotationAngle(handguard32_r1, 0.0F, 0.0F, 0.409F);
		handguard32_r1.cubeList.add(new ModelBox(handguard32_r1, 0, 0, -3.5F, -40.85F, -56.5F, 1, 2, 17, 0.0F, true));

		handguard31_r1 = new ModelRenderer(this);
		handguard31_r1.setRotationPoint(-18.231F, -18.5462F, 17.3114F);
		handguard.addChild(handguard31_r1);
		setRotationAngle(handguard31_r1, 0.0F, 0.0F, 0.4833F);
		handguard31_r1.cubeList.add(new ModelBox(handguard31_r1, 0, 0, -0.5F, -39.6F, -56.5F, 2, 1, 17, 0.0F, true));

		handguard30_r1 = new ModelRenderer(this);
		handguard30_r1.setRotationPoint(17.8876F, -19.9405F, 17.3114F);
		handguard.addChild(handguard30_r1);
		setRotationAngle(handguard30_r1, 0.0F, 0.0F, -0.4833F);
		handguard30_r1.cubeList.add(new ModelBox(handguard30_r1, 0, 0, -4.5F, -39.6F, -56.5F, 2, 1, 17, 0.0F, true));

		handguard29_r1 = new ModelRenderer(this);
		handguard29_r1.setRotationPoint(32.0328F, -74.618F, 17.3114F);
		handguard.addChild(handguard29_r1);
		setRotationAngle(handguard29_r1, 0.0F, 0.0F, -2.0077F);
		handguard29_r1.cubeList.add(new ModelBox(handguard29_r1, 0, 0, -4.5F, -40.85F, -56.5F, 1, 2, 17, 0.0F, true));

		handguard28_r1 = new ModelRenderer(this);
		handguard28_r1.setRotationPoint(-36.3022F, -71.8994F, 17.3114F);
		handguard.addChild(handguard28_r1);
		setRotationAngle(handguard28_r1, 0.0F, 0.0F, 2.0076F);
		handguard28_r1.cubeList.add(new ModelBox(handguard28_r1, 0, 0, 0.5F, -40.85F, -56.5F, 1, 2, 17, 0.0F, true));

		handguard11_r1 = new ModelRenderer(this);
		handguard11_r1.setRotationPoint(0.0F, -102.2404F, -34.1253F);
		handguard.addChild(handguard11_r1);
		setRotationAngle(handguard11_r1, 2.3423F, 0.0F, 0.0F);
		handguard11_r1.cubeList.add(new ModelBox(handguard11_r1, 0, 0, -4.5F, -33.6F, -44.5F, 6, 4, 1, 0.0F, true));

		handguard9_r1 = new ModelRenderer(this);
		handguard9_r1.setRotationPoint(0.0F, -98.1292F, -33.8619F);
		handguard.addChild(handguard9_r1);
		setRotationAngle(handguard9_r1, 2.3423F, 0.0F, 0.0F);
		handguard9_r1.cubeList.add(new ModelBox(handguard9_r1, 0, 0, -4.5F, -31.6F, -43.5F, 6, 3, 1, 0.0F, true));
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
