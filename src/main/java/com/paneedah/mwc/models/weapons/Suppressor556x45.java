package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Suppressor556x45 extends ModelBase {
	private final ModelRenderer suppressor;
	private final ModelRenderer gun46_r1;
	private final ModelRenderer gun45_r1;
	private final ModelRenderer gun44_r1;
	private final ModelRenderer gun43_r1;
	private final ModelRenderer gun37_r1;
	private final ModelRenderer gun35_r1;
	private final ModelRenderer gun33_r1;
	private final ModelRenderer gun32_r1;
	private final ModelRenderer gun31_r1;
	private final ModelRenderer gun30_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun27_r1;
	private final ModelRenderer gun13_r1;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun5_r1;

	public Suppressor556x45() {
		textureWidth = 256;
		textureHeight = 128;

		suppressor = new ModelRenderer(this);
		suppressor.setRotationPoint(0.0F, 24.0F, 0.0F);
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 0.0F, -24.0F, -2.0F, 2, 3, 22, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 2.0F, -23.0F, -2.0F, 1, 2, 22, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, -1.0F, -23.0F, -2.0F, 1, 2, 22, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 0.0F, -21.0F, -2.0F, 2, 1, 22, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 0.0F, -24.1F, -1.8F, 2, 1, 8, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 2.1F, -23.0F, -1.8F, 1, 2, 8, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 0.0F, -20.9F, -1.8F, 2, 1, 8, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, -1.1F, -23.0F, -1.8F, 1, 2, 8, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 0.0F, -24.1F, 13.0F, 2, 1, 7, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 2.1F, -23.0F, 13.0F, 1, 2, 7, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, -1.1F, -23.0F, 13.0F, 1, 2, 7, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, -1.1F, -23.0F, 13.0F, 1, 2, 7, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 0.0F, -20.9F, 13.0F, 2, 1, 7, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 0.5F, -24.2F, 13.5F, 1, 1, 3, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 0.5F, -20.8F, 13.5F, 1, 1, 3, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 2.2F, -22.5F, 13.5F, 1, 1, 3, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, -1.2F, -22.5F, 13.5F, 1, 1, 3, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 2.2F, -23.0F, 18.5F, 1, 2, 1, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, -1.2F, -23.0F, 18.5F, 1, 2, 1, 0.0F, true));

		gun46_r1 = new ModelRenderer(this);
		gun46_r1.setRotationPoint(-15.105F, -6.0922F, 0.0F);
		suppressor.addChild(gun46_r1);
		setRotationAngle(gun46_r1, 0.0F, 0.0F, 0.7808F);
		gun46_r1.cubeList.add(new ModelBox(gun46_r1, 0, 0, -0.15F, -21.4F, 13.5F, 1, 1, 3, 0.0F, true));

		gun45_r1 = new ModelRenderer(this);
		gun45_r1.setRotationPoint(-9.1921F, -37.917F, 0.0F);
		suppressor.addChild(gun45_r1);
		setRotationAngle(gun45_r1, 0.0F, 0.0F, 2.3794F);
		gun45_r1.cubeList.add(new ModelBox(gun45_r1, 0, 0, 3.0F, -20.8F, 13.5F, 1, 1, 3, 0.0F, true));

		gun44_r1 = new ModelRenderer(this);
		gun44_r1.setRotationPoint(-16.2192F, -8.4847F, 0.0F);
		suppressor.addChild(gun44_r1);
		setRotationAngle(gun44_r1, 0.0F, 0.0F, 0.7808F);
		gun44_r1.cubeList.add(new ModelBox(gun44_r1, 0, 0, 2.2F, -23.95F, 13.5F, 1, 1, 3, 0.0F, true));

		gun43_r1 = new ModelRenderer(this);
		gun43_r1.setRotationPoint(-16.9287F, -6.7603F, 0.0F);
		suppressor.addChild(gun43_r1);
		setRotationAngle(gun43_r1, 0.0F, 0.0F, 0.7808F);
		gun43_r1.cubeList.add(new ModelBox(gun43_r1, 0, 0, -0.25F, -23.95F, 13.5F, 1, 1, 3, 0.0F, true));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-14.9912F, -6.1688F, 0.0F);
		suppressor.addChild(gun37_r1);
		setRotationAngle(gun37_r1, 0.0F, 0.0F, 0.7808F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 0, 0, 0.0F, -21.3F, 13.0F, 1, 1, 7, 0.0F, true));
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 0, 0, 0.0F, -21.3F, -1.8F, 1, 1, 8, 0.0F, true));

		gun35_r1 = new ModelRenderer(this);
		gun35_r1.setRotationPoint(-13.9832F, -36.3974F, 0.0F);
		suppressor.addChild(gun35_r1);
		setRotationAngle(gun35_r1, 0.0F, 0.0F, 2.3794F);
		gun35_r1.cubeList.add(new ModelBox(gun35_r1, 0, 0, 0.3F, -21.0F, 13.0F, 1, 1, 7, 0.0F, true));
		gun35_r1.cubeList.add(new ModelBox(gun35_r1, 0, 0, 0.3F, -21.0F, -1.8F, 1, 1, 8, 0.0F, true));

		gun33_r1 = new ModelRenderer(this);
		gun33_r1.setRotationPoint(-15.3642F, -39.8441F, 0.0F);
		suppressor.addChild(gun33_r1);
		setRotationAngle(gun33_r1, 0.0F, 0.0F, 2.3794F);
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 0, 0, 0.3F, -23.0F, 13.0F, 1, 1, 7, 0.0F, true));
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 0, 0, 0.3F, -23.0F, -1.8F, 1, 1, 8, 0.0F, true));

		gun32_r1 = new ModelRenderer(this);
		gun32_r1.setRotationPoint(-16.9619F, -6.9797F, 0.0F);
		suppressor.addChild(gun32_r1);
		setRotationAngle(gun32_r1, 0.0F, 0.0F, 0.7808F);
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 0, 0, 0.0F, -24.1F, 13.0F, 1, 1, 7, 0.0F, true));
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 0, 0, 0.0F, -24.1F, -1.8F, 1, 1, 8, 0.0F, true));

		gun31_r1 = new ModelRenderer(this);
		gun31_r1.setRotationPoint(-14.412F, -7.5764F, 0.0F);
		suppressor.addChild(gun31_r1);
		setRotationAngle(gun31_r1, 0.0F, 0.0F, 0.7808F);
		gun31_r1.cubeList.add(new ModelBox(gun31_r1, 0, 0, 2.0F, -21.3F, 13.0F, 1, 1, 7, 0.0F, true));
		gun31_r1.cubeList.add(new ModelBox(gun31_r1, 0, 0, 2.0F, -21.3F, -1.8F, 1, 1, 8, 0.0F, true));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-9.1579F, -38.3308F, 0.0F);
		suppressor.addChild(gun30_r1);
		setRotationAngle(gun30_r1, 0.0F, 0.0F, 2.3794F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 0, 0, 3.1F, -21.0F, 13.0F, 1, 1, 7, 0.0F, true));
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 0, 0, 3.1F, -21.0F, -1.8F, 1, 1, 8, 0.0F, true));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-10.5388F, -41.7774F, 0.0F);
		suppressor.addChild(gun28_r1);
		setRotationAngle(gun28_r1, 0.0F, 0.0F, 2.3794F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 0, 0, 3.1F, -23.0F, 13.0F, 1, 1, 7, 0.0F, true));
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 0, 0, 3.1F, -23.0F, -1.8F, 1, 1, 8, 0.0F, true));

		gun27_r1 = new ModelRenderer(this);
		gun27_r1.setRotationPoint(-16.3827F, -8.3873F, 0.0F);
		suppressor.addChild(gun27_r1);
		setRotationAngle(gun27_r1, 0.0F, 0.0F, 0.7808F);
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 0, 0, 2.0F, -24.1F, 13.0F, 1, 1, 7, 0.0F, true));
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 0, 0, 2.0F, -24.1F, -1.8F, 1, 1, 8, 0.0F, true));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(-16.8915F, -6.9508F, 0.0F);
		suppressor.addChild(gun13_r1);
		setRotationAngle(gun13_r1, 0.0F, 0.0F, 0.7808F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 0, 0, 0.0F, -24.0F, -2.0F, 1, 1, 22, 0.0F, true));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(-15.1919F, -39.9131F, 0.0F);
		suppressor.addChild(gun12_r1);
		setRotationAngle(gun12_r1, 0.0F, 0.0F, 2.3794F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 0, 0, 0.4F, -23.0F, -2.0F, 1, 1, 22, 0.0F, true));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(-13.8109F, -36.4664F, 0.0F);
		suppressor.addChild(gun11_r1);
		setRotationAngle(gun11_r1, 0.0F, 0.0F, 2.3794F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 0, 0, 0.4F, -21.0F, 0.0F, 1, 1, 20, 0.0F, true));
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 0, 0, 0.4F, -21.0F, -2.0F, 1, 1, 22, 0.0F, true));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-15.0616F, -6.1978F, 0.0F);
		suppressor.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 0.0F, 0.0F, 0.7808F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 0, 0, 0.0F, -21.4F, -2.0F, 1, 1, 22, 0.0F, true));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(-14.4824F, -7.6054F, 0.0F);
		suppressor.addChild(gun8_r1);
		setRotationAngle(gun8_r1, 0.0F, 0.0F, 0.7808F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 0, 0, 2.0F, -21.4F, -2.0F, 1, 1, 22, 0.0F, true));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(-16.3123F, -8.3584F, 0.0F);
		suppressor.addChild(gun7_r1);
		setRotationAngle(gun7_r1, 0.0F, 0.0F, 0.7808F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 0, 0, 2.0F, -24.0F, -2.0F, 1, 1, 22, 0.0F, true));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(-9.3302F, -38.2617F, 0.0F);
		suppressor.addChild(gun6_r1);
		setRotationAngle(gun6_r1, 0.0F, 0.0F, 2.3794F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 0, 0, 3.0F, -21.0F, -2.0F, 1, 1, 22, 0.0F, true));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(-10.7112F, -41.7084F, 0.0F);
		suppressor.addChild(gun5_r1);
		setRotationAngle(gun5_r1, 0.0F, 0.0F, 2.3794F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 0, 0, 3.0F, -23.0F, -2.0F, 1, 1, 22, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		suppressor.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
