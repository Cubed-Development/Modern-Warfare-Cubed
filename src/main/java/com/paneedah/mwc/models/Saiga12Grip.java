package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Saiga12Grip extends ModelWithAttachments {
	private final ModelRenderer grip;
	private final ModelRenderer gun36_r1;
	private final ModelRenderer gun32_r1;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun4_r1;
	private final ModelRenderer gun4_r2;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun2_r1;

	public Saiga12Grip() {
		textureWidth = 150;
		textureHeight = 150;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		grip.cubeList.add(new ModelBox(grip, 0, 0, -3.5F, -31.0F, -7.0F, 4, 1, 9, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 0, -3.5F, -17.5F, -1.0F, 4, 2, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 0, -3.5F, -30.5F, -7.0F, 4, 4, 7, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 0, -3.5F, -30.0F, -0.4F, 4, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 0, -3.2F, -31.5F, -7.5F, 3, 5, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 0, -0.4F, -29.8F, -6.5F, 1, 1, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 0, -3.6F, -29.8F, -6.5F, 1, 1, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 0, -0.4F, -28.8F, -5.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 0, -3.6F, -28.8F, -5.0F, 1, 1, 2, 0.0F, false));

		gun36_r1 = new ModelRenderer(this);
		gun36_r1.setRotationPoint(0.0F, -5.6237F, 11.7907F);
		grip.addChild(gun36_r1);
		setRotationAngle(gun36_r1, 0.4461F, 0.0F, 0.0F);
		gun36_r1.cubeList.add(new ModelBox(gun36_r1, 0, 0, -0.4F, -28.8F, -6.5F, 1, 3, 2, 0.0F, false));
		gun36_r1.cubeList.add(new ModelBox(gun36_r1, 0, 0, -3.6F, -28.8F, -6.5F, 1, 3, 2, 0.0F, false));

		gun32_r1 = new ModelRenderer(this);
		gun32_r1.setRotationPoint(0.0F, -5.851F, 12.0549F);
		grip.addChild(gun32_r1);
		setRotationAngle(gun32_r1, 0.481F, 0.0F, 0.0F);
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 0, 0, -0.4F, -27.5F, -5.9F, 1, 13, 5, 0.0F, false));
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 0, 0, -3.6F, -27.5F, -5.9F, 1, 13, 5, 0.0F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(0.0F, -45.8963F, -23.295F);
		grip.addChild(gun11_r1);
		setRotationAngle(gun11_r1, -2.1564F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 0, 0, -3.5F, -29.2F, 0.67F, 4, 1, 2, 0.0F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(0.0F, -24.1553F, 20.3085F);
		grip.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 1.2269F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 0, 0, -3.5F, -26.5F, -7.0F, 4, 2, 1, 0.0F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(0.0F, -6.6605F, -10.7571F);
		grip.addChild(gun7_r1);
		setRotationAngle(gun7_r1, -0.6692F, 0.0F, 0.0F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 0, 0, -3.5F, -18.8F, 4.2F, 4, 1, 1, 0.0F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(0.0F, -26.0164F, 14.7752F);
		grip.addChild(gun6_r1);
		setRotationAngle(gun6_r1, 2.491F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 0, 0, -3.5F, -15.5F, 3.0F, 4, 3, 2, 0.0F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(0.0F, -3.9285F, 13.017F);
		grip.addChild(gun5_r1);
		setRotationAngle(gun5_r1, 0.481F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 0, 0, -3.5F, -28.5F, -1.5F, 4, 12, 1, 0.0F, false));

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(-1.5F, -18.4F, -1.2F);
		grip.addChild(gun4_r1);
		setRotationAngle(gun4_r1, 0.3054F, 0.0F, 0.0F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 0, 0, -2.0F, -4.0F, -1.3F, 4, 5, 2, 0.0F, false));

		gun4_r2 = new ModelRenderer(this);
		gun4_r2.setRotationPoint(-1.5F, -16.5F, -1.6F);
		grip.addChild(gun4_r2);
		setRotationAngle(gun4_r2, -0.6981F, 0.0F, 0.0F);
		gun4_r2.cubeList.add(new ModelBox(gun4_r2, 0, 0, -2.0F, -1.5F, -1.0F, 4, 2, 2, 0.0F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(0.0F, -55.6814F, -13.6353F);
		grip.addChild(gun3_r1);
		setRotationAngle(gun3_r1, -2.5281F, 0.0F, 0.0F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 0, 0, -3.5F, -30.0F, 2.0F, 4, 1, 3, 0.0F, false));

		gun2_r1 = new ModelRenderer(this);
		gun2_r1.setRotationPoint(0.0F, -5.7838F, 11.5809F);
		grip.addChild(gun2_r1);
		setRotationAngle(gun2_r1, 0.481F, 0.0F, 0.0F);
		gun2_r1.cubeList.add(new ModelBox(gun2_r1, 0, 0, -3.5F, -26.5F, -6.0F, 4, 12, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
