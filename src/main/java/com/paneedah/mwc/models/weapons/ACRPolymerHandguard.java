package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ACRPolymerHandguard extends ModelBase {
	private final ModelRenderer Polymer_Handguard;
	private final ModelRenderer bone17_r1;
	private final ModelRenderer bone16_r1;
	private final ModelRenderer bone15_r1;
	private final ModelRenderer bone14_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer bone4_r1;
	private final ModelRenderer bone6_r1;
	private final ModelRenderer bone3_r1;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone13_r1;
	private final ModelRenderer bone21_r1;
	private final ModelRenderer bone2_r1;
	private final ModelRenderer bone20_r1;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone12_r1;
	private final ModelRenderer bone19_r1;
	private final ModelRenderer bone22_r1;
	private final ModelRenderer bone18_r1;
	private final ModelRenderer bone23_r1;
	private final ModelRenderer bone24_r1;
	private final ModelRenderer bone26_r1;
	private final ModelRenderer bone25_r1;

	public ACRPolymerHandguard() {
		textureWidth = 400;
		textureHeight = 400;

		Polymer_Handguard = new ModelRenderer(this);
		Polymer_Handguard.setRotationPoint(-1.4942F, -13.5916F, -39.8955F);
		Polymer_Handguard.cubeList.add(new ModelBox(Polymer_Handguard, 181, 91, -1.6058F, 2.2916F, -14.1045F, 2, 1, 31, 0.0F, false));
		Polymer_Handguard.cubeList.add(new ModelBox(Polymer_Handguard, 83, 27, -2.1058F, 1.6916F, -14.3045F, 4, 2, 1, 0.0F, false));
		Polymer_Handguard.cubeList.add(new ModelBox(Polymer_Handguard, 69, 87, -1.5058F, -4.3084F, -11.5545F, 3, 1, 3, 0.0F, false));
		Polymer_Handguard.cubeList.add(new ModelBox(Polymer_Handguard, 57, 63, -1.5058F, -4.8084F, -9.2545F, 3, 1, 1, 0.0F, false));
		Polymer_Handguard.cubeList.add(new ModelBox(Polymer_Handguard, 151, 179, -0.4058F, 2.2916F, -14.1045F, 2, 1, 31, 0.0F, false));
		Polymer_Handguard.cubeList.add(new ModelBox(Polymer_Handguard, 141, 128, 0.1942F, 2.9916F, 12.8955F, 1, 1, 3, 0.0F, false));
		Polymer_Handguard.cubeList.add(new ModelBox(Polymer_Handguard, 75, 106, -1.2058F, 2.9916F, 12.8955F, 2, 1, 3, 0.0F, false));
		Polymer_Handguard.cubeList.add(new ModelBox(Polymer_Handguard, 28, 86, 0.2942F, 2.7916F, 13.8955F, 1, 1, 1, 0.0F, false));
		Polymer_Handguard.cubeList.add(new ModelBox(Polymer_Handguard, 85, 36, -1.3058F, 2.7916F, 13.8955F, 1, 1, 1, 0.0F, false));
		Polymer_Handguard.cubeList.add(new ModelBox(Polymer_Handguard, 58, 216, -2.5058F, -2.2084F, -13.1045F, 1, 3, 28, 0.0F, false));
		Polymer_Handguard.cubeList.add(new ModelBox(Polymer_Handguard, 0, 215, 1.4942F, -2.2084F, -13.1045F, 1, 3, 28, 0.0F, false));

		bone17_r1 = new ModelRenderer(this);
		bone17_r1.setRotationPoint(-24.0235F, 24.2788F, 39.8955F);
		Polymer_Handguard.addChild(bone17_r1);
		setRotationAngle(bone17_r1, 0.0F, 0.0F, 0.8203F);
		bone17_r1.cubeList.add(new ModelBox(bone17_r1, 121, 84, 0.55F, -36.0F, -54.21F, 2, 3, 1, 0.0F, false));

		bone16_r1 = new ModelRenderer(this);
		bone16_r1.setRotationPoint(26.058F, 22.0847F, 39.8955F);
		Polymer_Handguard.addChild(bone16_r1);
		setRotationAngle(bone16_r1, 0.0F, 0.0F, -0.8203F);
		bone16_r1.cubeList.add(new ModelBox(bone16_r1, 94, 121, -5.55F, -36.0F, -54.21F, 2, 3, 1, 0.0F, false));

		bone15_r1 = new ModelRenderer(this);
		bone15_r1.setRotationPoint(-7.1611F, 37.7562F, 39.8955F);
		Polymer_Handguard.addChild(bone15_r1);
		setRotationAngle(bone15_r1, 0.0F, 0.0F, 0.2269F);
		bone15_r1.cubeList.add(new ModelBox(bone15_r1, 75, 0, -5.05F, -37.9F, -54.2F, 2, 2, 1, 0.0F, false));

		bone14_r1 = new ModelRenderer(this);
		bone14_r1.setRotationPoint(10.0752F, 37.1039F, 39.8955F);
		Polymer_Handguard.addChild(bone14_r1);
		setRotationAngle(bone14_r1, 0.0F, 0.0F, -0.2269F);
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 31, 80, 0.0526F, -37.9225F, -54.2F, 2, 2, 1, 0.0F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(28.8286F, 18.0592F, 39.8955F);
		Polymer_Handguard.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.0F, 0.0F, -0.9774F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 182, 0, -4.7F, -35.47F, -54.0F, 1, 2, 30, 0.0F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 62, 57, -4.9776F, -35.524F, -25.0F, 1, 2, 1, 0.0F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(-27.1538F, 20.5298F, 39.8955F);
		Polymer_Handguard.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.0F, 0.0F, 0.9774F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 0, 183, 0.72F, -35.47F, -54.0F, 1, 2, 30, 0.0F, false));
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 82, 59, 0.9976F, -35.524F, -25.0F, 1, 2, 1, 0.0F, false));

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(25.7538F, 23.3594F, 39.8955F);
		Polymer_Handguard.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.0F, 0.0F, -0.7854F);
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 32, 185, -5.05F, -36.4F, -54.0F, 1, 1, 30, 0.0F, false));

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(13.6403F, 33.6686F, 39.8955F);
		Polymer_Handguard.addChild(bone7_r1);
		setRotationAngle(bone7_r1, 0.0F, 0.0F, -0.3491F);
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 94, 185, -5.05F, -36.4F, -54.0F, 1, 1, 30, 0.0F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 77, 9, -5.3063F, -36.2805F, -25.0F, 1, 1, 1, 0.0F, false));

		bone4_r1 = new ModelRenderer(this);
		bone4_r1.setRotationPoint(27.8334F, 28.3798F, 39.8955F);
		Polymer_Handguard.addChild(bone4_r1);
		setRotationAngle(bone4_r1, 0.0F, 0.0F, -0.7854F);
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 186, 171, 1.05F, -37.4F, -54.0F, 1, 1, 30, 0.0F, false));

		bone6_r1 = new ModelRenderer(this);
		bone6_r1.setRotationPoint(37.0475F, 15.5685F, 39.8955F);
		Polymer_Handguard.addChild(bone6_r1);
		setRotationAngle(bone6_r1, 0.0F, 0.0F, -1.2217F);
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 187, 38, 1.05F, -37.4F, -54.0F, 1, 1, 30, 0.0F, false));
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 74, 77, 0.9305F, -37.1437F, -25.0F, 1, 1, 1, 0.0F, false));

		bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(-7.0358F, 37.6566F, 39.8955F);
		Polymer_Handguard.addChild(bone3_r1);
		setRotationAngle(bone3_r1, 0.0F, 0.0F, 0.2269F);
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 64, 185, -4.55F, -37.4F, -54.0F, 1, 1, 29, 0.0F, false));
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 155, 150, -4.55F, -38.0F, -54.0F, 1, 1, 4, 0.0F, false));
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 216, 69, -4.551F, -39.85F, -53.0F, 1, 2, 28, 0.0F, false));
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 33, 81, -4.552F, -41.3F, -52.5F, 1, 2, 5, 0.0F, false));
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 80, 82, -4.55F, -38.4F, -30.0F, 1, 2, 5, 0.0F, false));
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 0, 86, -4.55F, -38.4F, -25.2F, 1, 2, 1, 0.0F, false));
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 141, 94, -4.55F, -38.4F, -37.5F, 1, 2, 6, 0.0F, false));
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 103, 121, -4.55F, -38.4F, -43.0F, 1, 2, 2, 0.0F, false));
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 85, 125, -4.55F, -38.4F, -47.5F, 1, 2, 2, 0.0F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(-5.5527F, 22.9023F, 54.2605F);
		Polymer_Handguard.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.4887F, 0.0F, 0.3142F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 0, 129, -4.8423F, -39.3325F, -24.0F, 2, 3, 1, 0.0F, false));
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 14, 83, -4.8423F, -40.2325F, -24.0F, 1, 1, 1, 0.0F, false));

		bone13_r1 = new ModelRenderer(this);
		bone13_r1.setRotationPoint(-21.4848F, 53.5202F, 16.4744F);
		Polymer_Handguard.addChild(bone13_r1);
		setRotationAngle(bone13_r1, -0.4538F, 0.0F, 0.4014F);
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 96, 0, -4.5279F, -41.3051F, -52.5F, 2, 4, 1, 0.0F, false));

		bone21_r1 = new ModelRenderer(this);
		bone21_r1.setRotationPoint(-10.3541F, 52.0292F, 20.7754F);
		Polymer_Handguard.addChild(bone21_r1);
		setRotationAngle(bone21_r1, -0.384F, 0.0F, 0.2269F);
		bone21_r1.cubeList.add(new ModelBox(bone21_r1, 8, 67, -4.54F, -41.3305F, -47.3091F, 1, 2, 4, 0.0F, false));

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(9.9474F, 36.9817F, 39.8955F);
		Polymer_Handguard.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.0F, 0.0F, -0.2269F);
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 127, 211, 0.55F, -37.4F, -54.0F, 1, 1, 29, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 217, 123, 0.551F, -39.85F, -53.0F, 1, 2, 28, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 33, 106, 0.552F, -41.3F, -52.5F, 1, 2, 5, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 115, 18, 0.551F, -38.0F, -30.0F, 1, 1, 5, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 113, 84, 0.551F, -38.0F, -37.5F, 1, 1, 6, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 78, 82, 0.551F, -38.0F, -43.0F, 1, 1, 2, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 47, 116, 0.551F, -38.0F, -47.5F, 1, 1, 2, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 123, 158, 0.551F, -38.0F, -54.0F, 1, 1, 4, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 87, 65, 0.55F, -38.4F, -25.3F, 1, 2, 1, 0.0F, false));

		bone20_r1 = new ModelRenderer(this);
		bone20_r1.setRotationPoint(13.2741F, 51.391F, 20.9693F);
		Polymer_Handguard.addChild(bone20_r1);
		setRotationAngle(bone20_r1, -0.384F, 0.0F, -0.2269F);
		bone20_r1.cubeList.add(new ModelBox(bone20_r1, 82, 59, 0.55F, -41.2857F, -47.5F, 1, 2, 4, 0.0F, false));

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(8.3943F, 21.9751F, 54.2605F);
		Polymer_Handguard.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 0.4887F, 0.0F, -0.3142F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 94, 130, -0.1577F, -39.3325F, -24.0F, 2, 3, 1, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 34, 83, 0.8423F, -40.2325F, -24.0F, 1, 1, 1, 0.0F, false));

		bone12_r1 = new ModelRenderer(this);
		bone12_r1.setRotationPoint(12.303F, 24.2365F, -72.4891F);
		Polymer_Handguard.addChild(bone12_r1);
		setRotationAngle(bone12_r1, -2.0159F, 0.0F, -0.4014F);
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 153, 133, -0.4721F, -42.3051F, -52.5F, 2, 1, 4, 0.0F, false));

		bone19_r1 = new ModelRenderer(this);
		bone19_r1.setRotationPoint(-27.8877F, 28.3811F, 39.8955F);
		Polymer_Handguard.addChild(bone19_r1);
		setRotationAngle(bone19_r1, 0.0F, 0.0F, 0.7505F);
		bone19_r1.cubeList.add(new ModelBox(bone19_r1, 17, 159, -3.0F, -41.9F, -51.45F, 1, 1, 4, 0.0F, false));

		bone22_r1 = new ModelRenderer(this);
		bone22_r1.setRotationPoint(-2.8818F, 1.1907F, 54.6239F);
		Polymer_Handguard.addChild(bone22_r1);
		setRotationAngle(bone22_r1, 0.6109F, 0.0F, 0.8029F);
		bone22_r1.cubeList.add(new ModelBox(bone22_r1, 13, 39, -3.0F, -41.9F, -52.45F, 2, 1, 1, 0.0F, false));

		bone18_r1 = new ModelRenderer(this);
		bone18_r1.setRotationPoint(30.0702F, 26.3351F, 39.8955F);
		Polymer_Handguard.addChild(bone18_r1);
		setRotationAngle(bone18_r1, 0.0F, 0.0F, -0.7505F);
		bone18_r1.cubeList.add(new ModelBox(bone18_r1, 160, 26, -1.0F, -41.9F, -51.45F, 1, 1, 4, 0.0F, false));

		bone23_r1 = new ModelRenderer(this);
		bone23_r1.setRotationPoint(9.7717F, 3.9691F, 53.7577F);
		Polymer_Handguard.addChild(bone23_r1);
		setRotationAngle(bone23_r1, 0.5061F, 0.0F, -0.7854F);
		bone23_r1.cubeList.add(new ModelBox(bone23_r1, 94, 89, -2.0F, -41.9F, -52.45F, 2, 1, 1, 0.0F, false));

		bone24_r1 = new ModelRenderer(this);
		bone24_r1.setRotationPoint(1.4942F, 8.5323F, 53.5441F);
		Polymer_Handguard.addChild(bone24_r1);
		setRotationAngle(bone24_r1, 0.4887F, 0.0F, 0.0F);
		bone24_r1.cubeList.add(new ModelBox(bone24_r1, 47, 63, -3.0F, -41.9F, -52.45F, 3, 1, 1, 0.0F, false));

		bone26_r1 = new ModelRenderer(this);
		bone26_r1.setRotationPoint(16.7197F, 46.82F, 26.9171F);
		Polymer_Handguard.addChild(bone26_r1);
		setRotationAngle(bone26_r1, -0.2094F, 0.4014F, 0.0F);
		bone26_r1.cubeList.add(new ModelBox(bone26_r1, 116, 98, -0.8828F, -42.3426F, -49.1201F, 1, 1, 2, 0.0F, false));

		bone25_r1 = new ModelRenderer(this);
		bone25_r1.setRotationPoint(-13.9697F, 46.82F, 28.0893F);
		Polymer_Handguard.addChild(bone25_r1);
		setRotationAngle(bone25_r1, -0.2094F, -0.4014F, 0.0F);
		bone25_r1.cubeList.add(new ModelBox(bone25_r1, 94, 117, -3.1172F, -42.3426F, -49.1201F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Polymer_Handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
