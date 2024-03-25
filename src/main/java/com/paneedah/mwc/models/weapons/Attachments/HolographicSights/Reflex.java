package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Reflex extends ModelBase {
	private final ModelRenderer reflex;
	private final ModelRenderer bone20_r1;
	private final ModelRenderer bone19_r1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone2_r1;
	private final ModelRenderer bone4_r1;
	private final ModelRenderer bone3_r1;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone17_r1;
	private final ModelRenderer bone16_r1;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone12_r1;
	private final ModelRenderer gun10_r1;
	private final ModelRenderer bone13_r1;
	private final ModelRenderer bone14_r1;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer bone10_r1;

	public Reflex() {
		textureWidth = 64;
		textureHeight = 64;

		reflex = new ModelRenderer(this);
		reflex.setRotationPoint(9.1692F, 24.0F, 3.9637F);
		reflex.cubeList.add(new ModelBox(reflex, 0, 33, -14.1792F, -30.3F, 4.9363F, 7, 1, 4, 0.0F, false));
		reflex.cubeList.add(new ModelBox(reflex, 0, 0, -14.1692F, -30.0F, -5.9637F, 7, 2, 15, 0.0F, false));
		reflex.cubeList.add(new ModelBox(reflex, 28, 17, -13.1692F, -28.0F, -5.4637F, 5, 1, 13, 0.0F, false));
		reflex.cubeList.add(new ModelBox(reflex, 29, 0, -8.1592F, -26.0F, -5.9637F, 1, 1, 14, 0.0F, false));
		reflex.cubeList.add(new ModelBox(reflex, 28, 31, -14.1792F, -26.0F, -5.9637F, 1, 1, 14, 0.0F, false));
		reflex.cubeList.add(new ModelBox(reflex, 0, 17, -14.1692F, -27.5F, -5.9637F, 7, 2, 14, 0.0F, false));
		reflex.cubeList.add(new ModelBox(reflex, 16, 33, -12.1692F, -31.2F, -1.9637F, 3, 2, 6, 0.0F, false));
		reflex.cubeList.add(new ModelBox(reflex, 44, 31, -13.6692F, -31.2F, -0.4637F, 6, 2, 3, 0.0F, false));

		bone20_r1 = new ModelRenderer(this);
		bone20_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		reflex.addChild(bone20_r1);
		setRotationAngle(bone20_r1, 0.0F, -0.7854F, 0.0F);
		bone20_r1.cubeList.add(new ModelBox(bone20_r1, 39, 52, -2.2F, -28.6F, 13.05F, 4, 2, 4, 0.0F, false));

		bone19_r1 = new ModelRenderer(this);
		bone19_r1.setRotationPoint(-9.1692F, -15.765F, -21.6237F);
		reflex.addChild(bone19_r1);
		setRotationAngle(bone19_r1, -0.7854F, 0.0F, 0.0F);
		bone19_r1.cubeList.add(new ModelBox(bone19_r1, 10, 18, 1.2F, -30.2F, 10.2F, 1, 1, 1, 0.0F, false));
		bone19_r1.cubeList.add(new ModelBox(bone19_r1, 7, 17, 1.4F, -28.008F, 12.2506F, 1, 1, 1, 0.0F, false));
		bone19_r1.cubeList.add(new ModelBox(bone19_r1, 0, 17, 1.4F, -19.8055F, 4.0482F, 1, 1, 1, 0.0F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(-9.1692F, 0.4665F, -2.5581F);
		reflex.addChild(gun5_r1);
		setRotationAngle(gun5_r1, 0.0436F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 0, 38, -3.5F, -31.9346F, 12.8986F, 4, 3, 5, 0.0F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(13.6055F, -8.5443F, -2.9512F);
		reflex.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0308F, 0.0308F, -0.7849F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 28, 23, -0.5463F, -31.9547F, 12.855F, 1, 1, 5, 0.0F, false));
		bone_r1.cubeList.add(new ModelBox(bone_r1, 28, 17, -3.3747F, -34.7832F, 12.855F, 1, 1, 5, 0.0F, false));

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(-6.937F, 1.437F, -0.3738F);
		reflex.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.1139F, -0.1569F, -0.0069F);
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 0, 7, 0.4344F, -31.1331F, 11.7978F, 1, 1, 6, 0.0F, false));

		bone4_r1 = new ModelRenderer(this);
		bone4_r1.setRotationPoint(-20.7993F, -2.3976F, -3.0187F);
		reflex.addChild(bone4_r1);
		setRotationAngle(bone4_r1, 0.0297F, -0.1914F, 0.4704F);
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 0, 23, 0.4854F, -31.2579F, 12.7978F, 1, 1, 5, 0.0F, false));

		bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(-11.4383F, 1.4575F, -0.8427F);
		reflex.addChild(bone3_r1);
		setRotationAngle(bone3_r1, 0.1139F, 0.1569F, 0.0069F);
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 0, 0, -4.4344F, -31.1331F, 11.7978F, 1, 1, 6, 0.0F, false));

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(2.0658F, -3.7557F, -3.5888F);
		reflex.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.0297F, 0.1914F, -0.4704F);
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 0, 17, -4.4853F, -31.227F, 12.7402F, 1, 1, 5, 0.0F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(-0.6153F, -24.4289F, -24.4214F);
		reflex.addChild(gun7_r1);
		setRotationAngle(gun7_r1, -1.0038F, -0.2618F, 0.0F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 0, 7, -0.1118F, -33.2222F, 12.1782F, 1, 4, 2, 0.0F, false));
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 8, 8, 0.5782F, -32.2222F, 12.1782F, 1, 3, 2, 0.0F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(-17.8253F, -24.4289F, -25.1979F);
		reflex.addChild(gun6_r1);
		setRotationAngle(gun6_r1, -1.0038F, 0.2618F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 0, 0, -3.8882F, -33.2222F, 12.1782F, 1, 4, 2, 0.0F, false));
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 8, 0, -4.5782F, -32.2222F, 12.1782F, 1, 3, 2, 0.0F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(-7.7708F, 1.0326F, -1.0867F);
		reflex.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.1047F, -0.1658F, 0.0F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 44, 36, -0.7424F, -29.8454F, 12.8713F, 3, 2, 5, 0.0F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(-10.6087F, 1.0326F, -1.5818F);
		reflex.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.1047F, 0.1658F, 0.0F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 13, 41, -5.2576F, -29.8454F, 12.8713F, 3, 2, 5, 0.0F, false));

		bone17_r1 = new ModelRenderer(this);
		bone17_r1.setRotationPoint(-6.7675F, 0.0F, -2.7618F);
		reflex.addChild(bone17_r1);
		setRotationAngle(bone17_r1, 0.0F, -0.7854F, 0.0F);
		bone17_r1.cubeList.add(new ModelBox(bone17_r1, 45, 5, -2.1F, -31.5F, 3.5F, 4, 2, 4, 0.0F, false));

		bone16_r1 = new ModelRenderer(this);
		bone16_r1.setRotationPoint(-12.9621F, 0.0F, -6.1206F);
		reflex.addChild(bone16_r1);
		setRotationAngle(bone16_r1, 0.0F, 0.7854F, 0.0F);
		bone16_r1.cubeList.add(new ModelBox(bone16_r1, 43, 46, -4.5F, -31.2F, 3.5F, 2, 2, 2, 0.0F, false));
		bone16_r1.cubeList.add(new ModelBox(bone16_r1, 35, 46, -6.6213F, -31.2F, 5.6213F, 2, 2, 2, 0.0F, false));
		bone16_r1.cubeList.add(new ModelBox(bone16_r1, 27, 46, -4.3787F, -31.2F, 7.864F, 2, 2, 2, 0.0F, false));
		bone16_r1.cubeList.add(new ModelBox(bone16_r1, 0, 46, -2.2574F, -31.2F, 5.7426F, 2, 2, 2, 0.0F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-9.1692F, 0.0664F, -6.0609F);
		reflex.addChild(gun9_r1);
		setRotationAngle(gun9_r1, -0.0698F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 45, 0, -4.5F, -32.0F, -2.0F, 6, 2, 3, 0.0F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(-9.1692F, 0.0664F, -6.0608F);
		reflex.addChild(gun11_r1);
		setRotationAngle(gun11_r1, -0.0698F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 34, 35, 1.5F, -35.1995F, -2.014F, 1, 2, 3, 0.0F, false));
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 8, 46, 1.51F, -35.6995F, -2.014F, 1, 1, 3, 0.0F, false));

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(8.9158F, -3.4311F, -5.8163F);
		reflex.addChild(bone11_r1);
		setRotationAngle(bone11_r1, -0.0605F, -0.0349F, -0.5225F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 34, 7, 1.5998F, -37.6728F, -2.014F, 1, 2, 3, 0.0F, false));

		bone12_r1 = new ModelRenderer(this);
		bone12_r1.setRotationPoint(-25.3343F, -5.5909F, -5.6653F);
		reflex.addChild(bone12_r1);
		setRotationAngle(bone12_r1, -0.0605F, 0.0349F, 0.5225F);
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 34, 2, 1.4002F, -33.1728F, -2.014F, 1, 2, 3, 0.0F, false));

		gun10_r1 = new ModelRenderer(this);
		gun10_r1.setRotationPoint(-17.1692F, -0.2145F, -10.079F);
		reflex.addChild(gun10_r1);
		setRotationAngle(gun10_r1, -3.0718F, 0.0F, 3.1416F);
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 28, 33, -3.5F, -35.1995F, -5.014F, 1, 2, 3, 0.0F, false));
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 29, 10, -3.49F, -35.6995F, -5.014F, 1, 1, 3, 0.0F, false));

		bone13_r1 = new ModelRenderer(this);
		bone13_r1.setRotationPoint(-34.684F, -6.2326F, -9.6581F);
		reflex.addChild(bone13_r1);
		setRotationAngle(bone13_r1, -3.0811F, -0.0349F, -2.619F);
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 29, 5, -3.5F, -37.6995F, -5.014F, 1, 2, 3, 0.0F, false));

		bone14_r1 = new ModelRenderer(this);
		bone14_r1.setRotationPoint(-0.2345F, -3.4046F, -9.8561F);
		reflex.addChild(bone14_r1);
		setRotationAngle(bone14_r1, -3.0811F, 0.0349F, 2.619F);
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 29, 0, -3.5F, -33.1995F, -5.014F, 1, 2, 3, 0.0F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(-9.1692F, 0.0664F, -6.0608F);
		reflex.addChild(gun15_r1);
		setRotationAngle(gun15_r1, -0.0698F, 0.0F, 0.0F);
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 24, 41, -4.5F, -37.43F, -2.0F, 6, 1, 3, 0.0F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(3.5084F, -54.7488F, -3.9637F);
		reflex.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.0F, 0.0F, -2.3562F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 21, 48, -6.0F, -30.0F, -2.0F, 1, 1, 3, 0.0F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 13, 48, -9.9497F, -26.0503F, -2.0F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		reflex.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}