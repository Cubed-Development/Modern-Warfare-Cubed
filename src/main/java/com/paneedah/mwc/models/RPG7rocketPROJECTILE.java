package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
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
		rpg.setRotationPoint(0.0F, -37.2026F, 5.3765F);
		rpg.cubeList.add(new ModelBox(rpg, 150, 0, -0.5F, 22.7026F, -27.3765F, 2, 4, 30, 0.0F, true));
		rpg.cubeList.add(new ModelBox(rpg, 150, 0, -1.5F, 23.7026F, -27.3765F, 4, 2, 30, 0.0F, true));
		rpg.cubeList.add(new ModelBox(rpg, 150, 0, -0.5F, 20.7026F, -41.3765F, 2, 8, 3, 0.0F, true));
		rpg.cubeList.add(new ModelBox(rpg, 150, 0, -3.5F, 23.7026F, -41.3765F, 8, 2, 3, 0.0F, true));
		rpg.cubeList.add(new ModelBox(rpg, 150, 0, -0.5F, 23.7026F, -54.3765F, 2, 2, 4, 0.0F, true));

		rpg23_r1 = new ModelRenderer(this);
		rpg23_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rpg.addChild(rpg23_r1);
		setRotationAngle(rpg23_r1, 1.3384F, 0.0F, 0.0F);
		rpg23_r1.cubeList.add(new ModelBox(rpg23_r1, 150, 0, -1.5F, -40.0F, -36.0F, 4, 6, 2, 0.0F, true));

		rpg22_r1 = new ModelRenderer(this);
		rpg22_r1.setRotationPoint(0.0F, 66.2161F, -71.0383F);
		rpg.addChild(rpg22_r1);
		setRotationAngle(rpg22_r1, -1.3384F, 0.0F, 0.0F);
		rpg22_r1.cubeList.add(new ModelBox(rpg22_r1, 150, 0, -1.5F, -39.0F, -36.0F, 4, 6, 2, 0.0F, true));

		rpg21_r1 = new ModelRenderer(this);
		rpg21_r1.setRotationPoint(5.6924F, 61.2026F, -6.312F);
		rpg.addChild(rpg21_r1);
		setRotationAngle(rpg21_r1, 0.0F, 0.1745F, 0.0F);
		rpg21_r1.cubeList.add(new ModelBox(rpg21_r1, 150, 0, -2.5F, -38.5F, -33.0F, 1, 4, 6, 0.0F, true));

		rpg20_r1 = new ModelRenderer(this);
		rpg20_r1.setRotationPoint(0.0F, 54.5262F, 0.2466F);
		rpg.addChild(rpg20_r1);
		setRotationAngle(rpg20_r1, 0.1859F, 0.0F, 0.0F);
		rpg20_r1.cubeList.add(new ModelBox(rpg20_r1, 150, 0, -1.5F, -34.5F, -33.0F, 4, 1, 12, 0.0F, true));

		rpg19_r1 = new ModelRenderer(this);
		rpg19_r1.setRotationPoint(-5.6772F, 61.2026F, -6.4856F);
		rpg.addChild(rpg19_r1);
		setRotationAngle(rpg19_r1, 0.0F, -0.1745F, 0.0F);
		rpg19_r1.cubeList.add(new ModelBox(rpg19_r1, 150, 0, 2.5F, -38.5F, -33.0F, 1, 4, 6, 0.0F, true));

		rpg18_r1 = new ModelRenderer(this);
		rpg18_r1.setRotationPoint(0.0F, 66.6213F, -13.2456F);
		rpg.addChild(rpg18_r1);
		setRotationAngle(rpg18_r1, -0.1859F, 0.0F, 0.0F);
		rpg18_r1.cubeList.add(new ModelBox(rpg18_r1, 150, 0, -1.5F, -39.5F, -33.0F, 4, 1, 12, 0.0F, true));

		rpg17_r1 = new ModelRenderer(this);
		rpg17_r1.setRotationPoint(23.4203F, 52.7443F, -5.3765F);
		rpg.addChild(rpg17_r1);
		setRotationAngle(rpg17_r1, 0.0F, 0.0F, -0.7854F);
		rpg17_r1.cubeList.add(new ModelBox(rpg17_r1, 150, 0, 1.5F, -34.5F, -36.0F, 4, 2, 3, 0.0F, true));

		rpg16_r1 = new ModelRenderer(this);
		rpg16_r1.setRotationPoint(-23.1274F, 52.0372F, -5.3765F);
		rpg.addChild(rpg16_r1);
		setRotationAngle(rpg16_r1, 0.0F, 0.0F, 0.7854F);
		rpg16_r1.cubeList.add(new ModelBox(rpg16_r1, 150, 0, -4.5F, -34.5F, -36.0F, 4, 2, 3, 0.0F, true));

		rpg15_r1 = new ModelRenderer(this);
		rpg15_r1.setRotationPoint(28.4914F, 48.9869F, -5.3765F);
		rpg.addChild(rpg15_r1);
		setRotationAngle(rpg15_r1, 0.0F, 0.0F, -0.7854F);
		rpg15_r1.cubeList.add(new ModelBox(rpg15_r1, 150, 0, -4.5F, -40.5F, -36.0F, 4, 2, 3, 0.0F, true));

		rpg14_r1 = new ModelRenderer(this);
		rpg14_r1.setRotationPoint(-28.1985F, 48.2798F, -5.3765F);
		rpg.addChild(rpg14_r1);
		setRotationAngle(rpg14_r1, 0.0F, 0.0F, 0.7854F);
		rpg14_r1.cubeList.add(new ModelBox(rpg14_r1, 150, 0, 1.5F, -40.5F, -36.0F, 4, 2, 3, 0.0F, true));

		rpg12_r1 = new ModelRenderer(this);
		rpg12_r1.setRotationPoint(-31.9536F, 61.2026F, -36.9787F);
		rpg.addChild(rpg12_r1);
		setRotationAngle(rpg12_r1, 0.0F, -1.3384F, 0.0F);
		rpg12_r1.cubeList.add(new ModelBox(rpg12_r1, 150, 0, -6.0F, -37.5F, -36.0F, 10, 2, 1, 0.0F, true));

		rpg11_r1 = new ModelRenderer(this);
		rpg11_r1.setRotationPoint(32.7233F, 61.2026F, -36.0058F);
		rpg.addChild(rpg11_r1);
		setRotationAngle(rpg11_r1, 0.0F, 1.3384F, 0.0F);
		rpg11_r1.cubeList.add(new ModelBox(rpg11_r1, 150, 0, -3.0F, -37.5F, -36.0F, 10, 2, 1, 0.0F, true));

		rpg10_r1 = new ModelRenderer(this);
		rpg10_r1.setRotationPoint(0.0F, 0.7697F, -0.9731F);
		rpg.addChild(rpg10_r1);
		setRotationAngle(rpg10_r1, 1.3384F, 0.0F, 0.0F);
		rpg10_r1.cubeList.add(new ModelBox(rpg10_r1, 150, 0, -0.5F, -43.0F, -36.0F, 2, 10, 2, 0.0F, true));

		rpg9_r1 = new ModelRenderer(this);
		rpg9_r1.setRotationPoint(0.0F, 65.4463F, -72.0114F);
		rpg.addChild(rpg9_r1);
		setRotationAngle(rpg9_r1, -1.3384F, 0.0F, 0.0F);
		rpg9_r1.cubeList.add(new ModelBox(rpg9_r1, 150, 0, -0.5F, -40.0F, -36.0F, 2, 10, 2, 0.0F, true));

		rpg6_r1 = new ModelRenderer(this);
		rpg6_r1.setRotationPoint(-5.662F, 61.2026F, -6.6593F);
		rpg.addChild(rpg6_r1);
		setRotationAngle(rpg6_r1, 0.0F, -0.1745F, 0.0F);
		rpg6_r1.cubeList.add(new ModelBox(rpg6_r1, 150, 0, 3.5F, -37.5F, -33.0F, 1, 2, 12, 0.0F, true));

		rpg5_r1 = new ModelRenderer(this);
		rpg5_r1.setRotationPoint(5.6772F, 61.2026F, -6.4856F);
		rpg.addChild(rpg5_r1);
		setRotationAngle(rpg5_r1, 0.0F, 0.1745F, 0.0F);
		rpg5_r1.cubeList.add(new ModelBox(rpg5_r1, 150, 0, -3.5F, -37.5F, -33.0F, 1, 2, 12, 0.0F, true));

		rpg4_r1 = new ModelRenderer(this);
		rpg4_r1.setRotationPoint(0.0F, 54.5434F, 0.0618F);
		rpg.addChild(rpg4_r1);
		setRotationAngle(rpg4_r1, 0.1859F, 0.0F, 0.0F);
		rpg4_r1.cubeList.add(new ModelBox(rpg4_r1, 150, 0, -0.5F, -33.5F, -33.0F, 2, 1, 12, 0.0F, true));

		rpg3_r1 = new ModelRenderer(this);
		rpg3_r1.setRotationPoint(0.0F, 66.6041F, -13.4304F);
		rpg.addChild(rpg3_r1);
		setRotationAngle(rpg3_r1, -0.1859F, 0.0F, 0.0F);
		rpg3_r1.cubeList.add(new ModelBox(rpg3_r1, 150, 0, -0.5F, -40.5F, -33.0F, 2, 1, 12, 0.0F, true));
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