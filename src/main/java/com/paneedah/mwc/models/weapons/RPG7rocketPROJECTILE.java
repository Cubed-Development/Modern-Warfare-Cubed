package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class RPG7rocketPROJECTILE extends ModelWithAttachments {
	private final ModelRenderer rpg;
	private final ModelRenderer rpg23_r1;
	private final ModelRenderer rpg22_r1;
	private final ModelRenderer rpg21_r1;
	private final ModelRenderer rpg20_r1;
	private final ModelRenderer rpg19_r1;
	private final ModelRenderer rpg18_r1;
	private final ModelRenderer rpg17_r1;
	private final ModelRenderer rpg16_r1;
	private final ModelRenderer rpg15_r1;
	private final ModelRenderer rpg14_r1;
	private final ModelRenderer rpg12_r1;
	private final ModelRenderer rpg11_r1;
	private final ModelRenderer rpg10_r1;
	private final ModelRenderer rpg9_r1;
	private final ModelRenderer rpg6_r1;
	private final ModelRenderer rpg5_r1;
	private final ModelRenderer rpg4_r1;
	private final ModelRenderer rpg3_r1;

	public RPG7rocketPROJECTILE() {
		textureWidth = 256;
		textureHeight = 128;

		rpg = new ModelRenderer(this);
		rpg.setRotationPoint(0.5F, -15.5F, -16.0F);
		setRotationAngle(rpg, -1.5708F, 0.0F, 0.0F);
		rpg.cubeList.add(new ModelBox(rpg, 150, 0, -1.0F, -18.0F, 9.9999F, 2, 4, 30, 0.0F, true));
		rpg.cubeList.add(new ModelBox(rpg, 150, 0, -2.0F, -17.0F, 9.9999F, 4, 2, 30, 0.0F, true));
		rpg.cubeList.add(new ModelBox(rpg, 150, 0, -1.0F, -20.0F, -4.0001F, 2, 8, 3, 0.0F, true));
		rpg.cubeList.add(new ModelBox(rpg, 150, 0, -4.0F, -17.0F, -4.0001F, 8, 2, 3, 0.0F, true));
		rpg.cubeList.add(new ModelBox(rpg, 150, 0, -1.0F, -17.0F, -17.0001F, 2, 2, 4, 0.0F, true));

		rpg23_r1 = new ModelRenderer(this);
		rpg23_r1.setRotationPoint(-0.5F, -24.7026F, 31.3765F);
		rpg.addChild(rpg23_r1);
		setRotationAngle(rpg23_r1, 1.3384F, 0.0F, 0.0F);
		rpg23_r1.cubeList.add(new ModelBox(rpg23_r1, 150, 0, -1.5F, -37.8463F, -19.0482F, 4, 6, 2, 0.0F, true));

		rpg22_r1 = new ModelRenderer(this);
		rpg22_r1.setRotationPoint(-0.5F, 41.5135F, -39.6618F);
		rpg.addChild(rpg22_r1);
		setRotationAngle(rpg22_r1, -1.3384F, 0.0F, 0.0F);
		rpg22_r1.cubeList.add(new ModelBox(rpg22_r1, 150, 0, -1.5F, -48.5236F, -50.1881F, 4, 6, 2, 0.0F, true));

		rpg21_r1 = new ModelRenderer(this);
		rpg21_r1.setRotationPoint(5.1924F, 36.5F, 25.0645F);
		rpg.addChild(rpg21_r1);
		setRotationAngle(rpg21_r1, 0.0F, 0.1745F, 0.0F);
		rpg21_r1.cubeList.add(new ModelBox(rpg21_r1, 150, 0, -3.5417F, -54.5F, -27.0912F, 1, 4, 6, 0.0F, true));

		rpg20_r1 = new ModelRenderer(this);
		rpg20_r1.setRotationPoint(-0.5F, 29.8236F, 31.6231F);
		rpg.addChild(rpg20_r1);
		setRotationAngle(rpg20_r1, 0.1859F, 0.0F, 0.0F);
		rpg20_r1.cubeList.add(new ModelBox(rpg20_r1, 150, 0, -1.5F, -49.1153F, -24.1462F, 4, 1, 12, 0.0F, true));

		rpg19_r1 = new ModelRenderer(this);
		rpg19_r1.setRotationPoint(-6.1772F, 36.5F, 24.8909F);
		rpg.addChild(rpg19_r1);
		setRotationAngle(rpg19_r1, 0.0F, -0.1745F, 0.0F);
		rpg19_r1.cubeList.add(new ModelBox(rpg19_r1, 150, 0, 3.5417F, -54.5F, -27.0912F, 1, 4, 6, 0.0F, true));

		rpg18_r1 = new ModelRenderer(this);
		rpg18_r1.setRotationPoint(-0.5F, 41.9187F, 18.1309F);
		rpg.addChild(rpg18_r1);
		setRotationAngle(rpg18_r1, -0.1859F, 0.0F, 0.0F);
		rpg18_r1.cubeList.add(new ModelBox(rpg18_r1, 150, 0, -1.5F, -56.3333F, -30.0608F, 4, 1, 12, 0.0F, true));

		rpg17_r1 = new ModelRenderer(this);
		rpg17_r1.setRotationPoint(22.9203F, 28.0417F, 26.0F);
		rpg.addChild(rpg17_r1);
		setRotationAngle(rpg17_r1, 0.0F, 0.0F, -0.7854F);
		rpg17_r1.cubeList.add(new ModelBox(rpg17_r1, 150, 0, 12.8137F, -45.8137F, -30.0001F, 4, 2, 3, 0.0F, true));

		rpg16_r1 = new ModelRenderer(this);
		rpg16_r1.setRotationPoint(-23.6274F, 27.3346F, 26.0F);
		rpg.addChild(rpg16_r1);
		setRotationAngle(rpg16_r1, 0.0F, 0.0F, 0.7854F);
		rpg16_r1.cubeList.add(new ModelBox(rpg16_r1, 150, 0, -15.8137F, -45.8137F, -30.0001F, 4, 2, 3, 0.0F, true));

		rpg15_r1 = new ModelRenderer(this);
		rpg15_r1.setRotationPoint(27.9914F, 24.2843F, 26.0F);
		rpg.addChild(rpg15_r1);
		setRotationAngle(rpg15_r1, 0.0F, 0.0F, -0.7854F);
		rpg15_r1.cubeList.add(new ModelBox(rpg15_r1, 150, 0, 6.8137F, -51.8137F, -30.0001F, 4, 2, 3, 0.0F, true));

		rpg14_r1 = new ModelRenderer(this);
		rpg14_r1.setRotationPoint(-28.6985F, 23.5772F, 26.0F);
		rpg.addChild(rpg14_r1);
		setRotationAngle(rpg14_r1, 0.0F, 0.0F, 0.7854F);
		rpg14_r1.cubeList.add(new ModelBox(rpg14_r1, 150, 0, -9.8137F, -51.8137F, -30.0001F, 4, 2, 3, 0.0F, true));

		rpg12_r1 = new ModelRenderer(this);
		rpg12_r1.setRotationPoint(-32.4536F, 36.5F, -5.6022F);
		rpg.addChild(rpg12_r1);
		setRotationAngle(rpg12_r1, 0.0F, -1.3384F, 0.0F);
		rpg12_r1.cubeList.add(new ModelBox(rpg12_r1, 150, 0, -0.1614F, -53.5F, -34.6181F, 10, 2, 1, 0.0F, true));

		rpg11_r1 = new ModelRenderer(this);
		rpg11_r1.setRotationPoint(32.2233F, 36.5F, -4.6293F);
		rpg.addChild(rpg11_r1);
		setRotationAngle(rpg11_r1, 0.0F, 1.3384F, 0.0F);
		rpg11_r1.cubeList.add(new ModelBox(rpg11_r1, 150, 0, -8.8386F, -53.5F, -34.6181F, 10, 2, 1, 0.0F, true));

		rpg10_r1 = new ModelRenderer(this);
		rpg10_r1.setRotationPoint(-0.5F, -23.9329F, 30.4034F);
		rpg.addChild(rpg10_r1);
		setRotationAngle(rpg10_r1, 1.3384F, 0.0F, 0.0F);
		rpg10_r1.cubeList.add(new ModelBox(rpg10_r1, 150, 0, -0.5F, -40.8463F, -19.0482F, 2, 10, 2, 0.0F, true));

		rpg9_r1 = new ModelRenderer(this);
		rpg9_r1.setRotationPoint(-0.5F, 40.7437F, -40.6349F);
		rpg.addChild(rpg9_r1);
		setRotationAngle(rpg9_r1, -1.3384F, 0.0F, 0.0F);
		rpg9_r1.cubeList.add(new ModelBox(rpg9_r1, 150, 0, -0.5F, -49.5236F, -50.1881F, 2, 10, 2, 0.0F, true));

		rpg6_r1 = new ModelRenderer(this);
		rpg6_r1.setRotationPoint(-6.162F, 36.5F, 24.7172F);
		rpg.addChild(rpg6_r1);
		setRotationAngle(rpg6_r1, 0.0F, -0.1745F, 0.0F);
		rpg6_r1.cubeList.add(new ModelBox(rpg6_r1, 150, 0, 4.5417F, -53.5F, -27.0912F, 1, 2, 12, 0.0F, true));

		rpg5_r1 = new ModelRenderer(this);
		rpg5_r1.setRotationPoint(5.1772F, 36.5F, 24.8909F);
		rpg.addChild(rpg5_r1);
		setRotationAngle(rpg5_r1, 0.0F, 0.1745F, 0.0F);
		rpg5_r1.cubeList.add(new ModelBox(rpg5_r1, 150, 0, -4.5417F, -53.5F, -27.0912F, 1, 2, 12, 0.0F, true));

		rpg4_r1 = new ModelRenderer(this);
		rpg4_r1.setRotationPoint(-0.5F, 29.8408F, 31.4383F);
		rpg.addChild(rpg4_r1);
		setRotationAngle(rpg4_r1, 0.1859F, 0.0F, 0.0F);
		rpg4_r1.cubeList.add(new ModelBox(rpg4_r1, 150, 0, -0.5F, -48.1153F, -24.1462F, 2, 1, 12, 0.0F, true));

		rpg3_r1 = new ModelRenderer(this);
		rpg3_r1.setRotationPoint(-0.5F, 41.9015F, 17.9461F);
		rpg.addChild(rpg3_r1);
		setRotationAngle(rpg3_r1, -0.1859F, 0.0F, 0.0F);
		rpg3_r1.cubeList.add(new ModelBox(rpg3_r1, 150, 0, -0.5F, -57.3333F, -30.0608F, 2, 1, 12, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		rpg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}