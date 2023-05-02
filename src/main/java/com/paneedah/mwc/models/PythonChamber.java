package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PythonChamber extends ModelWithAttachments {
	private final QRenderer chamber;
	private final ModelRenderer gun100_r2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer chamber2_r1;
	private final ModelRenderer chamber55_r1;
	private final ModelRenderer chamber58_r1;
	private final ModelRenderer chamber57_r1;
	private final ModelRenderer chamber56_r1;
	private final ModelRenderer chamber54_r1;
	private final ModelRenderer chamber53_r1;
	private final ModelRenderer chamber14_r1;
	private final ModelRenderer chamber15_r1;
	private final ModelRenderer chamber18_r1;
	private final ModelRenderer chamber17_r1;
	private final ModelRenderer chamber38_r1;
	private final ModelRenderer chamber42_r1;
	private final ModelRenderer chamber41_r1;
	private final ModelRenderer chamber44_r1;
	private final ModelRenderer chamber40_r1;
	private final ModelRenderer chamber43_r1;
	private final ModelRenderer chamber9_r1;
	private final ModelRenderer chamber10_r1;
	private final ModelRenderer chamber7_r1;
	private final ModelRenderer chamber16_r1;
	private final ModelRenderer chamber17_r2;
	private final ModelRenderer chamber14_r2;
	private final ModelRenderer chamber13_r1;
	private final ModelRenderer chamber9_r2;
	private final ModelRenderer chamber6_r1;
	private final ModelRenderer chamber8_r1;
	private final ModelRenderer chamber5_r1;
	private final ModelRenderer chamber39_r1;
	private final ModelRenderer chamber40_r2;
	private final ModelRenderer chamber41_r2;
	private final ModelRenderer chamber42_r2;
	private final ModelRenderer chamber43_r2;
	private final ModelRenderer chamber50_r1;
	private final ModelRenderer chamber51_r1;
	private final ModelRenderer chamber53_r2;
	private final ModelRenderer chamber54_r2;
	private final ModelRenderer chamber55_r2;
	private final ModelRenderer chamber56_r2;
	private final ModelRenderer chamber57_r2;
	private final ModelRenderer chamber58_r2;

	public PythonChamber() {
		textureWidth = 160;
		textureHeight = 160;

		chamber = new QRenderer(this);
		chamber.setRotationPoint(0.0F, 24.0F, 0.0F);
		chamber.cubeList.add(new ModelBox(chamber, 0, 40, -1.2F, -36.0F, -21.5F, 1, 4, 3, 0.0F, false));
		chamber.cubeList.add(new ModelBox(chamber, 81, 0, -4.2F, -36.0F, -18.3F, 2, 2, 5, -0.002F, false));
		chamber.cubeList.add(new ModelBox(chamber, 13, 28, -0.8F, -36.0F, -18.3F, 2, 2, 5, -0.002F, false));
		chamber.cubeList.add(new ModelBox(chamber, 40, 64, -4.5F, -36.0F, -13.3F, 6, 2, 2, 0.001F, false));
		chamber.cubeList.add(new ModelBox(chamber, 55, 0, -2.5F, -38.0F, -18.3F, 2, 6, 7, 0.003F, false));
		chamber.cubeList.add(new ModelBox(chamber, 29, 2, -2.0F, -33.399F, -12.48F, 1, 1, 1, 0.2F, false));
		chamber.cubeList.add(new ModelBox(chamber, 23, 24, -2.0F, -37.601F, -12.48F, 1, 1, 1, 0.2F, false));
		chamber.cubeList.add(new ModelBox(chamber, 41, 39, -1.4F, -36.8F, -22.5F, 2, 2, 4, -0.003F, false));

		gun100_r2 = new ModelRenderer(this);
		gun100_r2.setRotationPoint(-3.3F, -44.8F, -12.5F);
		chamber.addChild(gun100_r2);
		setRotationAngle(gun100_r2, 0.0F, 0.0F, 2.2075F);
		gun100_r2.cubeList.add(new ModelBox(gun100_r2, 41, 28, 5.6626F, -9.1616F, -10.0F, 2, 2, 4, -0.001F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.4F, -36.7F, -11.3F);
		chamber.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.4014F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 28, 0.0F, -0.001F, -1.18F, 1, 1, 1, 0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.4F, -36.7F, -11.3F);
		chamber.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.4014F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 0, -1.0F, -0.001F, -1.18F, 1, 1, 1, 0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.4F, -33.3F, -11.3F);
		chamber.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.4014F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 30, -1.0F, -0.999F, -1.18F, 1, 1, 1, 0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.4F, -33.3F, -11.3F);
		chamber.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.4014F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 31, 0.0F, -0.999F, -1.18F, 1, 1, 1, 0.2F, false));

		chamber2_r1 = new ModelRenderer(this);
		chamber2_r1.setRotationPoint(-0.1F, -34.7F, -11.75F);
		chamber.addChild(chamber2_r1);
		setRotationAngle(chamber2_r1, 0.0F, 0.0F, -0.5585F);
		chamber2_r1.cubeList.add(new ModelBox(chamber2_r1, 55, 4, -2.0F, -2.0F, 0.0F, 2, 2, 1, -0.2F, false));

		chamber55_r1 = new ModelRenderer(this);
		chamber55_r1.setRotationPoint(-4.5F, -42.0F, -8.3F);
		chamber.addChild(chamber55_r1);
		setRotationAngle(chamber55_r1, 0.0F, 0.0F, 1.9101F);
		chamber55_r1.cubeList.add(new ModelBox(chamber55_r1, 55, 29, 7.0989F, -7.0999F, -10.0F, 1, 1, 5, -0.002F, false));

		chamber58_r1 = new ModelRenderer(this);
		chamber58_r1.setRotationPoint(-4.5F, -42.0F, -4.3F);
		chamber.addChild(chamber58_r1);
		setRotationAngle(chamber58_r1, 0.0F, 0.0F, 1.9844F);
		chamber58_r1.cubeList.add(new ModelBox(chamber58_r1, 35, 0, 6.5491F, -7.6819F, -10.0F, 1, 1, 1, 0.0F, false));

		chamber57_r1 = new ModelRenderer(this);
		chamber57_r1.setRotationPoint(-3.5F, -43.0F, -4.3F);
		chamber.addChild(chamber57_r1);
		setRotationAngle(chamber57_r1, 0.0F, 0.0F, 1.12F);
		chamber57_r1.cubeList.add(new ModelBox(chamber57_r1, 35, 2, 9.7437F, 0.7564F, -10.0F, 1, 1, 1, 0.0F, false));

		chamber56_r1 = new ModelRenderer(this);
		chamber56_r1.setRotationPoint(-3.5F, -43.0F, -8.3F);
		chamber.addChild(chamber56_r1);
		setRotationAngle(chamber56_r1, 0.0F, 0.0F, 1.1944F);
		chamber56_r1.cubeList.add(new ModelBox(chamber56_r1, 55, 35, 9.7702F, -0.0439F, -10.0F, 1, 1, 5, -0.001F, false));

		chamber54_r1 = new ModelRenderer(this);
		chamber54_r1.setRotationPoint(-4.5F, -42.3F, -8.3F);
		chamber.addChild(chamber54_r1);
		setRotationAngle(chamber54_r1, 0.0F, 0.0F, 2.3562F);
		chamber54_r1.cubeList.add(new ModelBox(chamber54_r1, 13, 13, 2.2426F, -9.8995F, -10.0F, 2, 2, 5, 0.002F, false));

		chamber53_r1 = new ModelRenderer(this);
		chamber53_r1.setRotationPoint(-2.5F, -44.0F, -8.3F);
		chamber.addChild(chamber53_r1);
		setRotationAngle(chamber53_r1, 0.0F, 0.0F, 0.7854F);
		chamber53_r1.cubeList.add(new ModelBox(chamber53_r1, 25, 56, 8.8995F, 4.7426F, -10.0F, 1, 1, 5, 0.003F, false));
		chamber53_r1.cubeList.add(new ModelBox(chamber53_r1, 25, 62, 8.8995F, 4.2426F, -10.0F, 1, 1, 5, 0.001F, false));

		chamber14_r1 = new ModelRenderer(this);
		chamber14_r1.setRotationPoint(-2.5F, -46.0F, -4.3F);
		chamber.addChild(chamber14_r1);
		setRotationAngle(chamber14_r1, 0.0F, 0.0F, 0.3718F);
		chamber14_r1.cubeList.add(new ModelBox(chamber14_r1, 23, 39, 6.3595F, 7.8637F, -10.0F, 1, 1, 1, 0.0F, false));

		chamber15_r1 = new ModelRenderer(this);
		chamber15_r1.setRotationPoint(-2.5F, -44.0F, -4.3F);
		chamber.addChild(chamber15_r1);
		setRotationAngle(chamber15_r1, 0.0F, 0.0F, 1.1897F);
		chamber15_r1.cubeList.add(new ModelBox(chamber15_r1, 41, 12, 9.7703F, 0.0062F, -10.0F, 1, 1, 1, 0.0F, false));

		chamber18_r1 = new ModelRenderer(this);
		chamber18_r1.setRotationPoint(-2.5F, -44.0F, -8.3F);
		chamber.addChild(chamber18_r1);
		setRotationAngle(chamber18_r1, 0.0F, 0.0F, 1.0782F);
		chamber18_r1.cubeList.add(new ModelBox(chamber18_r1, 13, 80, 9.7027F, 1.2049F, -10.0F, 1, 1, 4, -0.001F, false));

		chamber17_r1 = new ModelRenderer(this);
		chamber17_r1.setRotationPoint(-2.5F, -46.0F, -8.3F);
		chamber.addChild(chamber17_r1);
		setRotationAngle(chamber17_r1, 0.0F, 0.0F, 0.4833F);
		chamber17_r1.cubeList.add(new ModelBox(chamber17_r1, 92, 48, 7.1891F, 6.9957F, -10.0F, 1, 1, 4, -0.001F, false));

		chamber38_r1 = new ModelRenderer(this);
		chamber38_r1.setRotationPoint(-2.5F, -46.0F, -8.3F);
		chamber.addChild(chamber38_r1);
		setRotationAngle(chamber38_r1, 0.0F, 0.0F, 0.7854F);
		chamber38_r1.cubeList.add(new ModelBox(chamber38_r1, 66, 0, 8.8995F, 4.2426F, -10.0F, 1, 1, 5, 0.002F, false));
		chamber38_r1.cubeList.add(new ModelBox(chamber38_r1, 43, 70, 8.3995F, 4.2426F, -10.0F, 1, 1, 5, -0.001F, false));
		chamber38_r1.cubeList.add(new ModelBox(chamber38_r1, 39, 70, 7.8995F, 4.2426F, -5.0F, 2, 2, 2, -0.001F, false));

		chamber42_r1 = new ModelRenderer(this);
		chamber42_r1.setRotationPoint(-3.5F, -47.0F, -8.3F);
		chamber.addChild(chamber42_r1);
		setRotationAngle(chamber42_r1, 0.0F, 0.0F, 0.2649F);
		chamber42_r1.cubeList.add(new ModelBox(chamber42_r1, 70, 29, 5.4786F, 8.604F, -10.0F, 1, 1, 5, -0.002F, false));

		chamber41_r1 = new ModelRenderer(this);
		chamber41_r1.setRotationPoint(-4.5F, -48.0F, -8.3F);
		chamber.addChild(chamber41_r1);
		setRotationAngle(chamber41_r1, 0.0F, 0.0F, -0.3718F);
		chamber41_r1.cubeList.add(new ModelBox(chamber41_r1, 70, 35, -0.9061F, 10.7699F, -10.0F, 1, 1, 5, -0.001F, false));

		chamber44_r1 = new ModelRenderer(this);
		chamber44_r1.setRotationPoint(-4.5F, -48.0F, -4.3F);
		chamber.addChild(chamber44_r1);
		setRotationAngle(chamber44_r1, 0.0F, 0.0F, -0.4833F);
		chamber44_r1.cubeList.add(new ModelBox(chamber44_r1, 41, 14, -2.1054F, 10.7135F, -10.0F, 1, 1, 1, 0.0F, false));

		chamber40_r1 = new ModelRenderer(this);
		chamber40_r1.setRotationPoint(-4.5F, -47.7F, -8.3F);
		chamber.addChild(chamber40_r1);
		setRotationAngle(chamber40_r1, 0.0F, 0.0F, -0.7854F);
		chamber40_r1.cubeList.add(new ModelBox(chamber40_r1, 75, 80, -6.2426F, 9.8995F, -10.0F, 2, 2, 5, 0.001F, false));

		chamber43_r1 = new ModelRenderer(this);
		chamber43_r1.setRotationPoint(-3.5F, -47.0F, -4.3F);
		chamber.addChild(chamber43_r1);
		setRotationAngle(chamber43_r1, 0.0F, 0.0F, 0.4508F);
		chamber43_r1.cubeList.add(new ModelBox(chamber43_r1, 23, 41, 6.9572F, 7.2583F, -10.0F, 1, 1, 1, 0.0F, false));

		chamber9_r1 = new ModelRenderer(this);
		chamber9_r1.setRotationPoint(-4.5F, -48.0F, -3.3F);
		chamber.addChild(chamber9_r1);
		setRotationAngle(chamber9_r1, 0.0F, 0.0F, -0.7854F);
		chamber9_r1.cubeList.add(new ModelBox(chamber9_r1, 49, 60, -5.2426F, 9.8995F, -10.0F, 1, 1, 2, 0.001F, false));

		chamber10_r1 = new ModelRenderer(this);
		chamber10_r1.setRotationPoint(-4.5F, -22.0F, -3.3F);
		chamber.addChild(chamber10_r1);
		setRotationAngle(chamber10_r1, 0.0F, 0.0F, 0.7854F);
		chamber10_r1.cubeList.add(new ModelBox(chamber10_r1, 32, 62, -5.2426F, -10.8995F, -10.0F, 1, 1, 2, 0.001F, false));

		chamber7_r1 = new ModelRenderer(this);
		chamber7_r1.setRotationPoint(-2.5F, -24.0F, -3.3F);
		chamber.addChild(chamber7_r1);
		setRotationAngle(chamber7_r1, 0.0F, 0.0F, -0.7854F);
		chamber7_r1.cubeList.add(new ModelBox(chamber7_r1, 74, 72, 7.8995F, -6.2426F, -10.0F, 2, 2, 2, -0.001F, false));

		chamber16_r1 = new ModelRenderer(this);
		chamber16_r1.setRotationPoint(-0.5F, -46.0F, -8.3F);
		chamber.addChild(chamber16_r1);
		setRotationAngle(chamber16_r1, 0.0F, 0.0F, -0.4833F);
		chamber16_r1.cubeList.add(new ModelBox(chamber16_r1, 92, 56, -8.1891F, 6.9957F, -10.0F, 1, 1, 4, -0.001F, false));

		chamber17_r2 = new ModelRenderer(this);
		chamber17_r2.setRotationPoint(-0.5F, -44.0F, -8.3F);
		chamber.addChild(chamber17_r2);
		setRotationAngle(chamber17_r2, 0.0F, 0.0F, -1.0782F);
		chamber17_r2.cubeList.add(new ModelBox(chamber17_r2, 92, 62, -10.7027F, 1.2049F, -10.0F, 1, 1, 4, -0.001F, false));

		chamber14_r2 = new ModelRenderer(this);
		chamber14_r2.setRotationPoint(-0.5F, -44.0F, -4.3F);
		chamber.addChild(chamber14_r2);
		setRotationAngle(chamber14_r2, 0.0F, 0.0F, -1.1897F);
		chamber14_r2.cubeList.add(new ModelBox(chamber14_r2, 41, 28, -10.7703F, 0.0062F, -10.0F, 1, 1, 1, 0.0F, false));

		chamber13_r1 = new ModelRenderer(this);
		chamber13_r1.setRotationPoint(-0.5F, -46.0F, -4.3F);
		chamber.addChild(chamber13_r1);
		setRotationAngle(chamber13_r1, 0.0F, 0.0F, -0.3718F);
		chamber13_r1.cubeList.add(new ModelBox(chamber13_r1, 41, 30, -7.3595F, 7.8637F, -10.0F, 1, 1, 1, 0.0F, false));

		chamber9_r2 = new ModelRenderer(this);
		chamber9_r2.setRotationPoint(1.5F, -22.0F, -3.3F);
		chamber.addChild(chamber9_r2);
		setRotationAngle(chamber9_r2, 0.0F, 0.0F, -0.7854F);
		chamber9_r2.cubeList.add(new ModelBox(chamber9_r2, 62, 35, 4.2426F, -10.8995F, -10.0F, 1, 1, 2, 0.001F, false));

		chamber6_r1 = new ModelRenderer(this);
		chamber6_r1.setRotationPoint(-0.5F, -24.0F, -3.3F);
		chamber.addChild(chamber6_r1);
		setRotationAngle(chamber6_r1, 0.0F, 0.0F, 0.7854F);
		chamber6_r1.cubeList.add(new ModelBox(chamber6_r1, 75, 65, -9.8995F, -6.2426F, -10.0F, 2, 2, 2, -0.001F, false));

		chamber8_r1 = new ModelRenderer(this);
		chamber8_r1.setRotationPoint(1.5F, -48.0F, -3.3F);
		chamber.addChild(chamber8_r1);
		setRotationAngle(chamber8_r1, 0.0F, 0.0F, 0.7854F);
		chamber8_r1.cubeList.add(new ModelBox(chamber8_r1, 67, 43, 4.2426F, 9.8995F, -10.0F, 1, 1, 2, 0.001F, false));

		chamber5_r1 = new ModelRenderer(this);
		chamber5_r1.setRotationPoint(-0.5F, -46.0F, -3.3F);
		chamber.addChild(chamber5_r1);
		setRotationAngle(chamber5_r1, 0.0F, 0.0F, -0.7854F);
		chamber5_r1.cubeList.add(new ModelBox(chamber5_r1, 50, 79, -9.8995F, 4.2426F, -10.0F, 2, 2, 2, -0.001F, false));
		chamber5_r1.cubeList.add(new ModelBox(chamber5_r1, 60, 80, -9.8995F, 4.2426F, -15.0F, 1, 1, 5, 0.002F, false));
		chamber5_r1.cubeList.add(new ModelBox(chamber5_r1, 36, 82, -9.3995F, 4.2426F, -15.0F, 1, 1, 5, -0.001F, false));

		chamber39_r1 = new ModelRenderer(this);
		chamber39_r1.setRotationPoint(1.5F, -47.7F, -8.3F);
		chamber.addChild(chamber39_r1);
		setRotationAngle(chamber39_r1, 0.0F, 0.0F, 0.7854F);
		chamber39_r1.cubeList.add(new ModelBox(chamber39_r1, 81, 7, 4.2426F, 9.8995F, -10.0F, 2, 2, 5, 0.001F, false));

		chamber40_r2 = new ModelRenderer(this);
		chamber40_r2.setRotationPoint(1.5F, -48.0F, -8.3F);
		chamber.addChild(chamber40_r2);
		setRotationAngle(chamber40_r2, 0.0F, 0.0F, 0.3718F);
		chamber40_r2.cubeList.add(new ModelBox(chamber40_r2, 85, 48, -0.0939F, 10.7699F, -10.0F, 1, 1, 5, -0.001F, false));

		chamber41_r2 = new ModelRenderer(this);
		chamber41_r2.setRotationPoint(0.5F, -47.0F, -8.3F);
		chamber.addChild(chamber41_r2);
		setRotationAngle(chamber41_r2, 0.0F, 0.0F, -0.2649F);
		chamber41_r2.cubeList.add(new ModelBox(chamber41_r2, 85, 56, -6.4786F, 8.604F, -10.0F, 1, 1, 5, -0.002F, false));

		chamber42_r2 = new ModelRenderer(this);
		chamber42_r2.setRotationPoint(0.5F, -47.0F, -4.3F);
		chamber.addChild(chamber42_r2);
		setRotationAngle(chamber42_r2, 0.0F, 0.0F, -0.4508F);
		chamber42_r2.cubeList.add(new ModelBox(chamber42_r2, 41, 39, -7.9572F, 7.2583F, -10.0F, 1, 1, 1, 0.0F, false));

		chamber43_r2 = new ModelRenderer(this);
		chamber43_r2.setRotationPoint(1.5F, -48.0F, -4.3F);
		chamber.addChild(chamber43_r2);
		setRotationAngle(chamber43_r2, 0.0F, 0.0F, 0.4833F);
		chamber43_r2.cubeList.add(new ModelBox(chamber43_r2, 41, 41, 1.1054F, 10.7135F, -10.0F, 1, 1, 1, 0.0F, false));

		chamber50_r1 = new ModelRenderer(this);
		chamber50_r1.setRotationPoint(2.8F, -43.8F, -12.5F);
		chamber.addChild(chamber50_r1);
		setRotationAngle(chamber50_r1, 0.2094F, 0.0F, 0.0F);
		chamber50_r1.cubeList.add(new ModelBox(chamber50_r1, 17, 0, -4.0F, 7.7024F, -11.8106F, 1, 2, 1, -0.001F, false));

		chamber51_r1 = new ModelRenderer(this);
		chamber51_r1.setRotationPoint(-0.5F, -44.0F, -8.3F);
		chamber.addChild(chamber51_r1);
		setRotationAngle(chamber51_r1, 0.0F, 0.0F, -0.7854F);
		chamber51_r1.cubeList.add(new ModelBox(chamber51_r1, 85, 62, -9.8995F, 4.2426F, -10.0F, 1, 1, 5, 0.001F, false));
		chamber51_r1.cubeList.add(new ModelBox(chamber51_r1, 85, 72, -9.8995F, 4.7426F, -10.0F, 1, 1, 5, 0.003F, false));

		chamber53_r2 = new ModelRenderer(this);
		chamber53_r2.setRotationPoint(1.5F, -42.3F, -8.3F);
		chamber.addChild(chamber53_r2);
		setRotationAngle(chamber53_r2, 0.0F, 0.0F, -2.3562F);
		chamber53_r2.cubeList.add(new ModelBox(chamber53_r2, 81, 14, -4.2426F, -9.8995F, -10.0F, 2, 2, 5, 0.002F, false));

		chamber54_r2 = new ModelRenderer(this);
		chamber54_r2.setRotationPoint(1.5F, -42.0F, -8.3F);
		chamber.addChild(chamber54_r2);
		setRotationAngle(chamber54_r2, 0.0F, 0.0F, -1.9101F);
		chamber54_r2.cubeList.add(new ModelBox(chamber54_r2, 84, 85, -8.0989F, -7.0999F, -10.0F, 1, 1, 5, -0.002F, false));

		chamber55_r2 = new ModelRenderer(this);
		chamber55_r2.setRotationPoint(0.5F, -43.0F, -8.3F);
		chamber.addChild(chamber55_r2);
		setRotationAngle(chamber55_r2, 0.0F, 0.0F, -1.1944F);
		chamber55_r2.cubeList.add(new ModelBox(chamber55_r2, 25, 87, -10.7702F, -0.0439F, -10.0F, 1, 1, 5, -0.001F, false));

		chamber56_r2 = new ModelRenderer(this);
		chamber56_r2.setRotationPoint(0.5F, -43.0F, -4.3F);
		chamber.addChild(chamber56_r2);
		setRotationAngle(chamber56_r2, 0.0F, 0.0F, -1.12F);
		chamber56_r2.cubeList.add(new ModelBox(chamber56_r2, 48, 12, -10.7437F, 0.7564F, -10.0F, 1, 1, 1, 0.0F, false));

		chamber57_r2 = new ModelRenderer(this);
		chamber57_r2.setRotationPoint(1.5F, -42.0F, -4.3F);
		chamber.addChild(chamber57_r2);
		setRotationAngle(chamber57_r2, 0.0F, 0.0F, -1.9844F);
		chamber57_r2.cubeList.add(new ModelBox(chamber57_r2, 48, 14, -7.5491F, -7.6819F, -10.0F, 1, 1, 1, 0.0F, false));

		chamber58_r2 = new ModelRenderer(this);
		chamber58_r2.setRotationPoint(0.1766F, -35.0048F, -29.55F);
		chamber.addChild(chamber58_r2);
		setRotationAngle(chamber58_r2, 0.0F, 0.0F, -0.673F);
		chamber58_r2.cubeList.add(new ModelBox(chamber58_r2, 0, 13, -1.0F, -1.0F, 0.0F, 1, 1, 11, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		chamber.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
