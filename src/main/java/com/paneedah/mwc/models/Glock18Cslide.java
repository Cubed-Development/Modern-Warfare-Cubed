package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Glock18Cslide extends ModelBase {
	private final QRenderer mag13rnd;
	private final ModelRenderer mag3_r1;
	private final ModelRenderer mag5_r1;
	private final ModelRenderer mag4_r1;
	private final QRenderer mag20rnd;
	private final ModelRenderer mag4_r2;
	private final ModelRenderer mag6_r1;
	private final ModelRenderer mag5_r2;
	private final QRenderer G18slide;
	private final ModelRenderer slide55_r1;
	private final ModelRenderer slide53_r1;
	private final ModelRenderer slide19_r1;
	private final ModelRenderer slide18_r1;
	private final ModelRenderer slide22_r1;
	private final ModelRenderer slide21_r1;
	private final ModelRenderer slide20_r1;
	private final ModelRenderer slide20_r2;
	private final ModelRenderer slide19_r2;
	private final QRenderer G18cncslide;
	private final ModelRenderer slide56_r1;
	private final ModelRenderer slide54_r1;
	private final ModelRenderer slide20_r3;
	private final ModelRenderer slide19_r3;
	private final ModelRenderer slide23_r1;
	private final ModelRenderer slide22_r2;
	private final ModelRenderer slide21_r2;
	private final ModelRenderer slide21_r3;
	private final ModelRenderer slide20_r4;

	public Glock18Cslide() {
		textureWidth = 128;
		textureHeight = 128;

		mag13rnd = new QRenderer(this);
		mag13rnd.setRotationPoint(0.0F, 24.0F, 0.0F);
		mag13rnd.cubeList.add(new ModelBox(mag13rnd, 52, 65, -3.0F, -16.2F, -3.5F, 4, 2, 6, 0.0F, false));
		mag13rnd.cubeList.add(new ModelBox(mag13rnd, 0, 36, -2.5F, -16.2F, -4.25F, 3, 2, 1, 0.0F, false));

		mag3_r1 = new ModelRenderer(this);
		mag3_r1.setRotationPoint(-2.5F, -30.0F, -7.0F);
		mag13rnd.addChild(mag3_r1);
		setRotationAngle(mag3_r1, 0.2974F, 0.0F, 0.0F);
		mag3_r1.cubeList.add(new ModelBox(mag3_r1, 58, 32, 0.0F, 0.0F, 0.0F, 3, 16, 5, 0.0F, false));
		mag3_r1.cubeList.add(new ModelBox(mag3_r1, 44, 70, 0.5F, 0.0F, -0.5F, 2, 15, 1, -0.001F, false));

		mag5_r1 = new ModelRenderer(this);
		mag5_r1.setRotationPoint(0.5F, -14.1F, -4.35F);
		mag13rnd.addChild(mag5_r1);
		setRotationAngle(mag5_r1, -1.2741F, 0.0F, 0.0F);
		mag5_r1.cubeList.add(new ModelBox(mag5_r1, 17, 25, -3.0F, -1.0F, -2.0F, 3, 1, 2, -0.1F, false));

		mag4_r1 = new ModelRenderer(this);
		mag4_r1.setRotationPoint(1.0F, -16.3F, 2.6F);
		mag13rnd.addChild(mag4_r1);
		setRotationAngle(mag4_r1, -1.2392F, 0.0F, 0.0F);
		mag4_r1.cubeList.add(new ModelBox(mag4_r1, 15, 9, -4.0F, 0.0F, 0.0F, 4, 1, 2, -0.1F, false));

		mag20rnd = new QRenderer(this);
		mag20rnd.setRotationPoint(0.0F, 24.0F, 0.0F);
		mag20rnd.cubeList.add(new ModelBox(mag20rnd, 26, 62, -3.0F, -5.2F, -0.2F, 4, 2, 6, 0.0F, false));
		mag20rnd.cubeList.add(new ModelBox(mag20rnd, 32, 35, -2.5F, -5.2F, -0.95F, 3, 2, 1, 0.0F, false));

		mag4_r2 = new ModelRenderer(this);
		mag4_r2.setRotationPoint(-2.5F, -30.0F, -7.0F);
		mag20rnd.addChild(mag4_r2);
		setRotationAngle(mag4_r2, 0.2974F, 0.0F, 0.0F);
		mag4_r2.cubeList.add(new ModelBox(mag4_r2, 76, 65, 0.0F, 0.0F, 0.0F, 3, 28, 5, 0.0F, false));
		mag4_r2.cubeList.add(new ModelBox(mag4_r2, 84, 32, 0.5F, 0.0F, -0.5F, 2, 27, 1, -0.001F, false));

		mag6_r1 = new ModelRenderer(this);
		mag6_r1.setRotationPoint(0.5F, -3.1F, -1.05F);
		mag20rnd.addChild(mag6_r1);
		setRotationAngle(mag6_r1, -1.2741F, 0.0F, 0.0F);
		mag6_r1.cubeList.add(new ModelBox(mag6_r1, 0, 25, -3.0F, -1.0F, -2.0F, 3, 1, 2, -0.1F, false));

		mag5_r2 = new ModelRenderer(this);
		mag5_r2.setRotationPoint(1.0F, -5.3F, 5.9F);
		mag20rnd.addChild(mag5_r2);
		setRotationAngle(mag5_r2, -1.2392F, 0.0F, 0.0F);
		mag5_r2.cubeList.add(new ModelBox(mag5_r2, 0, 10, -4.0F, 0.0F, 0.0F, 4, 1, 2, -0.1F, false));

		G18slide = new QRenderer(this);
		G18slide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G18slide.cubeList.add(new ModelBox(G18slide, 37, 0, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 23, 0, -2.3F, -37.5F, -28.499F, 2, 5, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 23, 31, -0.7F, -37.5F, -28.501F, 1, 5, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 47, 14, 0.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 47, 0, -3.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 26, 79, 0.101F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 62, 73, -3.099F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 64, 14, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 32, 1, -0.6F, -38.101F, -28.5F, 1, 1, 30, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 26, 63, 0.2F, -37.501F, -28.5F, 1, 1, 24, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 0, 47, -3.2F, -37.501F, -28.5F, 1, 1, 13, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 40, 7, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 40, 3, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 32, 0, -3.2F, -37.501F, -7.5F, 1, 2, 3, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 58, 38, 0.201F, -37.001F, -28.5F, 1, 3, 24, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 0, 31, -3.199F, -37.001F, -28.5F, 1, 3, 13, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 0, 16, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 39, 39, -3.099F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 39, 34, -1.5F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 39, 37, 0.1F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 8, 0, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 32, 50, 0.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 4, 47, -3.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 47, 14, -3.45F, -37.75F, -2.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 49, 37, 0.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 8, 47, -3.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 49, 32, 0.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 15, 47, -3.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 48, 45, 0.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 23, 47, -3.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 0, 62, -3.199F, -36.001F, -15.5F, 1, 2, 11, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 32, 22, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 40, 20, -0.6F, -38.1F, 1.002F, 1, 1, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 24, 21, -2.4F, -38.099F, 1.003F, 2, 1, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 0, 16, -2.4F, -38.1F, -28.5F, 2, 1, 13, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 39, 25, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 23, 16, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));

		slide55_r1 = new ModelRenderer(this);
		slide55_r1.setRotationPoint(-2.4F, -38.1F, -28.5F);
		G18slide.addChild(slide55_r1);
		setRotationAngle(slide55_r1, 0.0F, 0.0F, -0.6545F);
		slide55_r1.cubeList.add(new ModelBox(slide55_r1, 80, 13, -1.0F, 0.0F, 18.0F, 1, 1, 12, 0.0F, false));
		slide55_r1.cubeList.add(new ModelBox(slide55_r1, 64, 0, -1.0F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));
		slide55_r1.cubeList.add(new ModelBox(slide55_r1, 40, 11, -1.0F, 0.0F, 29.5F, 1, 1, 1, -0.001F, false));

		slide53_r1 = new ModelRenderer(this);
		slide53_r1.setRotationPoint(0.4F, -38.1F, -28.5F);
		G18slide.addChild(slide53_r1);
		setRotationAngle(slide53_r1, 0.0F, 0.0F, 0.6545F);
		slide53_r1.cubeList.add(new ModelBox(slide53_r1, 0, 31, 0.0F, 0.0F, 0.0F, 1, 1, 30, 0.0F, false));
		slide53_r1.cubeList.add(new ModelBox(slide53_r1, 40, 16, 0.0F, 0.0F, 29.5F, 1, 1, 1, -0.001F, false));

		slide19_r1 = new ModelRenderer(this);
		slide19_r1.setRotationPoint(1.5F, -34.301F, -2.2F);
		G18slide.addChild(slide19_r1);
		setRotationAngle(slide19_r1, 0.4189F, 0.0F, 0.0F);
		slide19_r1.cubeList.add(new ModelBox(slide19_r1, 32, 18, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		slide18_r1 = new ModelRenderer(this);
		slide18_r1.setRotationPoint(1.4F, -34.201F, -1.1F);
		G18slide.addChild(slide18_r1);
		setRotationAngle(slide18_r1, 0.4189F, 0.0F, 0.0F);
		slide18_r1.cubeList.add(new ModelBox(slide18_r1, 6, 16, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		slide22_r1 = new ModelRenderer(this);
		slide22_r1.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G18slide.addChild(slide22_r1);
		setRotationAngle(slide22_r1, -0.7854F, 0.0F, 0.0F);
		slide22_r1.cubeList.add(new ModelBox(slide22_r1, 37, 22, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r1 = new ModelRenderer(this);
		slide21_r1.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G18slide.addChild(slide21_r1);
		setRotationAngle(slide21_r1, -0.7854F, 0.0F, 0.0F);
		slide21_r1.cubeList.add(new ModelBox(slide21_r1, 0, 39, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide20_r1 = new ModelRenderer(this);
		slide20_r1.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G18slide.addChild(slide20_r1);
		setRotationAngle(slide20_r1, -0.7854F, 0.0F, 0.0F);
		slide20_r1.cubeList.add(new ModelBox(slide20_r1, 15, 40, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide20_r2 = new ModelRenderer(this);
		slide20_r2.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G18slide.addChild(slide20_r2);
		setRotationAngle(slide20_r2, -0.7854F, 0.0F, 0.0F);
		slide20_r2.cubeList.add(new ModelBox(slide20_r2, 32, 38, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide19_r2 = new ModelRenderer(this);
		slide19_r2.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G18slide.addChild(slide19_r2);
		setRotationAngle(slide19_r2, -0.7854F, 0.0F, 0.0F);
		slide19_r2.cubeList.add(new ModelBox(slide19_r2, 40, 28, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		G18cncslide = new QRenderer(this);
		G18cncslide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 32, 32, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 15, 0, -2.3F, -37.5F, -28.499F, 2, 5, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 15, 31, -0.7F, -37.5F, -28.501F, 1, 5, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 15, 31, 0.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 15, 0, -3.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 68, 47, 0.101F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 15, 47, -3.099F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 5, 31, -2.4F, -38.1F, -10.5F, 2, 1, 2, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 75, -2.0F, -37.85F, -8.75F, 2, 1, 7, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 21, -2.4F, -38.1F, -18.5F, 2, 1, 3, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 32, 14, -0.6F, -38.101F, -28.5F, 1, 1, 3, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 32, 45, -0.6F, -38.101F, -18.5F, 1, 1, 10, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 62, 0.2F, -37.501F, -28.5F, 1, 1, 24, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 32, 14, -3.2F, -37.501F, -28.5F, 1, 1, 13, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 26, 27, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 9, 27, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 31, -3.2F, -37.501F, -7.5F, 1, 2, 3, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 32, 32, 0.201F, -37.001F, -28.5F, 1, 3, 24, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 0, -3.199F, -37.001F, -28.5F, 1, 3, 13, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 5, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 26, 11, -3.099F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 25, 25, -1.5F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 25, 9, 0.1F, -35.901F, 0.9F, 1, 1, 1, -0.001F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 0, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 47, 0, 0.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 47, -3.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 44, 45, -3.45F, -37.75F, -2.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 45, 37, 0.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 36, 45, -3.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 45, 32, 0.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 32, 45, -3.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 8, 39, 0.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 8, 34, -3.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 32, 32, -3.199F, -36.001F, -15.5F, 1, 2, 11, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 32, 5, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 17, 16, -0.6F, -38.1F, -1.997F, 1, 1, 4, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 0, -2.4F, -38.099F, -1.998F, 2, 1, 4, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 17, 21, -2.4F, -38.1F, -28.5F, 2, 1, 3, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 17, 16, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 7, 21, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 52, 73, -2.65F, -38.351F, -26.0F, 1, 1, 8, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 87, -2.65F, -38.351F, -8.75F, 1, 1, 7, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 26, 70, -0.35F, -38.35F, -26.0F, 1, 1, 8, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 84, 53, -0.35F, -38.35F, -8.75F, 1, 1, 7, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 16, -0.85F, -38.35F, -22.25F, 1, 1, 4, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 5, -2.15F, -38.35F, -22.25F, 1, 1, 4, -0.25F, false));

		slide56_r1 = new ModelRenderer(this);
		slide56_r1.setRotationPoint(-2.4F, -38.1F, -28.5F);
		G18cncslide.addChild(slide56_r1);
		setRotationAngle(slide56_r1, 0.0F, 0.0F, -0.6545F);
		slide56_r1.cubeList.add(new ModelBox(slide56_r1, 79, 0, -1.0F, 0.0F, 18.0F, 1, 1, 12, 0.0F, false));
		slide56_r1.cubeList.add(new ModelBox(slide56_r1, 32, 0, -1.0F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));
		slide56_r1.cubeList.add(new ModelBox(slide56_r1, 17, 18, -1.0F, 0.0F, 29.5F, 1, 1, 1, -0.001F, false));

		slide54_r1 = new ModelRenderer(this);
		slide54_r1.setRotationPoint(0.4F, -38.1F, -28.5F);
		G18cncslide.addChild(slide54_r1);
		setRotationAngle(slide54_r1, 0.0F, 0.0F, 0.6545F);
		slide54_r1.cubeList.add(new ModelBox(slide54_r1, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 30, 0.0F, false));
		slide54_r1.cubeList.add(new ModelBox(slide54_r1, 9, 24, 0.0F, 0.0F, 29.5F, 1, 1, 1, -0.001F, false));

		slide20_r3 = new ModelRenderer(this);
		slide20_r3.setRotationPoint(1.5F, -34.301F, -2.2F);
		G18cncslide.addChild(slide20_r3);
		setRotationAngle(slide20_r3, 0.4189F, 0.0F, 0.0F);
		slide20_r3.cubeList.add(new ModelBox(slide20_r3, 32, 9, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		slide19_r3 = new ModelRenderer(this);
		slide19_r3.setRotationPoint(1.4F, -34.201F, -1.1F);
		G18cncslide.addChild(slide19_r3);
		setRotationAngle(slide19_r3, 0.4189F, 0.0F, 0.0F);
		slide19_r3.cubeList.add(new ModelBox(slide19_r3, 6, 5, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		slide23_r1 = new ModelRenderer(this);
		slide23_r1.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G18cncslide.addChild(slide23_r1);
		setRotationAngle(slide23_r1, -0.7854F, 0.0F, 0.0F);
		slide23_r1.cubeList.add(new ModelBox(slide23_r1, 32, 28, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r2 = new ModelRenderer(this);
		slide22_r2.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G18cncslide.addChild(slide22_r2);
		setRotationAngle(slide22_r2, -0.7854F, 0.0F, 0.0F);
		slide22_r2.cubeList.add(new ModelBox(slide22_r2, 37, 5, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r2 = new ModelRenderer(this);
		slide21_r2.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G18cncslide.addChild(slide21_r2);
		setRotationAngle(slide21_r2, -0.7854F, 0.0F, 0.0F);
		slide21_r2.cubeList.add(new ModelBox(slide21_r2, 37, 9, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r3 = new ModelRenderer(this);
		slide21_r3.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G18cncslide.addChild(slide21_r3);
		setRotationAngle(slide21_r3, -0.7854F, 0.0F, 0.0F);
		slide21_r3.cubeList.add(new ModelBox(slide21_r3, 37, 14, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide20_r4 = new ModelRenderer(this);
		slide20_r4.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G18cncslide.addChild(slide20_r4);
		setRotationAngle(slide20_r4, -0.7854F, 0.0F, 0.0F);
		slide20_r4.cubeList.add(new ModelBox(slide20_r4, 37, 18, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		mag13rnd.render(f5);
//		mag20rnd.render(f5);
		G18slide.render(f5);
//		G18cncslide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
