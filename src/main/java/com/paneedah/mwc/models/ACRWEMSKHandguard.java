package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ACRWEMSKHandguard extends ModelWithAttachments {
	private final ModelRenderer Wemsk_Handguard;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone2_r1;
	private final ModelRenderer bone3_r1;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone13_r1;
	private final ModelRenderer bone14_r1;
	private final ModelRenderer bone15_r1;

	public ACRWEMSKHandguard() {
		textureWidth = 380;
		textureHeight = 380;

		Wemsk_Handguard = new ModelRenderer(this);
		Wemsk_Handguard.setRotationPoint(-1.5348F, -12.7169F, -39.2587F);
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 214, 0, -0.9652F, 1.4169F, -12.7413F, 2, 1, 29, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 115, 18, 0.2348F, 2.1169F, 10.2587F, 1, 1, 5, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 114, 123, -1.1652F, 2.1169F, 10.2587F, 2, 1, 5, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 129, 162, 0.3348F, 1.9169F, 13.2587F, 1, 1, 1, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 162, 127, -1.2652F, 1.9169F, 13.2587F, 1, 1, 1, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 121, 241, 2.3348F, -0.3831F, -12.7413F, 1, 1, 28, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 84, 145, 2.3348F, -1.3831F, -12.7413F, 1, 1, 2, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 138, 144, 2.3348F, -1.3831F, -6.7413F, 1, 1, 2, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 143, 41, 2.3348F, -1.3831F, -0.7413F, 1, 1, 2, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 143, 38, 2.3348F, -1.3831F, 5.2587F, 1, 1, 2, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 163, 119, 2.3348F, -1.3831F, 11.2587F, 1, 1, 4, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 253, 233, 2.3348F, -2.3831F, -11.7413F, 1, 1, 27, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 191, 233, -3.2652F, -0.3831F, -12.7413F, 1, 1, 28, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 143, 27, -3.2652F, -1.3831F, -12.7413F, 1, 1, 2, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 143, 24, -3.2652F, -1.3831F, -6.7413F, 1, 1, 2, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 143, 20, -3.2652F, -1.3831F, -0.7413F, 1, 1, 2, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 143, 17, -3.2652F, -1.3831F, 5.2587F, 1, 1, 2, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 63, 163, -3.2652F, -1.3831F, 11.2587F, 1, 1, 4, 0.0F, false));
		Wemsk_Handguard.cubeList.add(new ModelBox(Wemsk_Handguard, 252, 204, -3.2652F, -2.3831F, -11.7413F, 1, 1, 27, 0.0F, false));

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(1.5348F, -5.9107F, 52.1707F);
		Wemsk_Handguard.addChild(bone7_r1);
		setRotationAngle(bone7_r1, 0.7854F, 0.0F, 0.0F);
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 123, 162, -4.9F, -37.9F, -45.0F, 1, 1, 1, -0.05F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 103, 162, -4.9F, -33.6574F, -40.7574F, 1, 1, 1, -0.05F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 57, 162, -4.9F, -29.4147F, -36.5147F, 1, 1, 1, -0.05F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 23, 162, -4.9F, -25.1721F, -32.2721F, 1, 1, 1, -0.05F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 17, 162, -4.9F, -42.1426F, -49.2426F, 1, 1, 1, -0.05F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 162, 12, 0.9F, -37.9F, -45.0F, 1, 1, 1, -0.07F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 11, 162, 0.9F, -33.6574F, -40.7574F, 1, 1, 1, -0.07F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 162, 10, 0.9F, -29.4147F, -36.5147F, 1, 1, 1, -0.07F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 162, 8, 0.9F, -25.1721F, -32.2721F, 1, 1, 1, -0.07F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 162, 4, 0.9F, -42.1426F, -49.2426F, 1, 1, 1, -0.07F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(-23.5543F, 31.3838F, 39.2587F);
		Wemsk_Handguard.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.0F, 0.0F, 0.6632F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 276, 87, -4.8F, -40.1F, -50.0F, 1, 1, 26, 0.0F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 281, 202, -4.79F, -40.5F, -49.0F, 1, 1, 25, 0.0F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(-35.7187F, 46.9543F, -29.9926F);
		Wemsk_Handguard.addChild(bone9_r1);
		setRotationAngle(bone9_r1, -1.2043F, 0.0F, 0.6632F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 123, 140, -4.8F, -40.5F, -49.0F, 1, 2, 1, 0.0F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(1.5348F, 61.3273F, -3.3268F);
		Wemsk_Handguard.addChild(bone10_r1);
		setRotationAngle(bone10_r1, -0.7854F, 0.0F, 0.0F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 162, 2, -4.8F, -39.1F, -51.0F, 1, 1, 1, 0.0F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 162, 0, -4.8F, -38.7F, -51.0F, 1, 1, 1, 0.0F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 160, 161, 0.8F, -39.1F, -51.0F, 1, 1, 1, 0.0F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 161, 144, 0.8F, -38.7F, -51.0F, 1, 1, 1, 0.0F, false));

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(25.988F, 29.5369F, 39.2587F);
		Wemsk_Handguard.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.0F, 0.0F, -0.6632F);
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 276, 0, 0.8F, -40.1F, -50.0F, 1, 1, 26, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 280, 261, 0.81F, -40.5F, -49.0F, 1, 1, 25, 0.0F, false));

		bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(38.1524F, 45.1074F, -29.9926F);
		Wemsk_Handguard.addChild(bone3_r1);
		setRotationAngle(bone3_r1, -1.2043F, 0.0F, -0.6632F);
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 116, 140, 0.8F, -40.5F, -49.0F, 1, 2, 1, 0.0F, false));

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(23.6236F, 30.5304F, 39.2587F);
		Wemsk_Handguard.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 0.0F, 0.0F, -0.6458F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 115, 54, -1.2F, -37.1F, -52.0F, 3, 1, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 162, 151, -0.2F, -37.1F, -28.0F, 1, 1, 4, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 143, 11, -0.2F, -37.1F, -34.0F, 1, 1, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 143, 8, -0.2F, -37.1F, -40.0F, 1, 1, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 37, 142, -0.2F, -37.1F, -46.0F, 1, 1, 2, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 305, 114, -1.2F, -37.1F, -50.0F, 1, 1, 23, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 161, 102, 0.8F, -37.1F, -50.0F, 1, 1, 4, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 82, 275, 0.4F, -37.11F, -50.0F, 1, 1, 26, 0.0F, false));

		bone13_r1 = new ModelRenderer(this);
		bone13_r1.setRotationPoint(6.8572F, -1.2253F, 51.5102F);
		Wemsk_Handguard.addChild(bone13_r1);
		setRotationAngle(bone13_r1, 0.7854F, 0.0F, 0.8988F);
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 161, 140, -1.6821F, -36.9659F, -45.0F, 1, 1, 1, -0.07F, false));
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 132, 161, -1.6821F, -32.7233F, -40.7574F, 1, 1, 1, -0.07F, false));
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 115, 161, -1.6821F, -28.4806F, -36.5147F, 1, 1, 1, -0.07F, false));
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 109, 161, -1.6821F, -24.238F, -32.2721F, 1, 1, 1, -0.07F, false));
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 161, 104, -1.6821F, -41.2085F, -49.2426F, 1, 1, 1, -0.07F, false));

		bone14_r1 = new ModelRenderer(this);
		bone14_r1.setRotationPoint(-21.1581F, 32.3359F, 39.2587F);
		Wemsk_Handguard.addChild(bone14_r1);
		setRotationAngle(bone14_r1, 0.0F, 0.0F, 0.6458F);
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 79, 100, -4.8F, -37.1F, -52.0F, 3, 1, 2, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 123, 160, -3.8F, -37.1F, -28.0F, 1, 1, 4, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 22, 142, -3.8F, -37.1F, -34.0F, 1, 1, 2, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 141, 58, -3.8F, -37.1F, -40.0F, 1, 1, 2, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 127, 59, -3.8F, -37.1F, -46.0F, 1, 1, 2, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 160, 26, -4.8F, -37.1F, -50.0F, 1, 1, 4, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 307, 170, -4.4F, -37.1F, -46.0F, 1, 1, 22, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 17, 160, -2.8F, -37.1F, -50.0F, 1, 1, 4, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 54, 274, -3.2F, -37.11F, -50.0F, 1, 1, 26, 0.0F, false));

		bone15_r1 = new ModelRenderer(this);
		bone15_r1.setRotationPoint(-0.0373F, 4.5074F, 53.6789F);
		Wemsk_Handguard.addChild(bone15_r1);
		setRotationAngle(bone15_r1, 0.7854F, 0.0F, 2.1904F);
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 161, 102, -2.1879F, -40.0328F, -45.0F, 1, 1, 1, -0.05F, false));
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 100, 161, -2.1879F, -35.7902F, -40.7574F, 1, 1, 1, -0.05F, false));
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 161, 98, -2.1879F, -31.5475F, -36.5147F, 1, 1, 1, -0.05F, false));
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 161, 96, -2.1879F, -27.3049F, -32.2721F, 1, 1, 1, -0.05F, false));
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 161, 94, -2.1879F, -44.2754F, -49.2426F, 1, 1, 1, -0.05F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Wemsk_Handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}