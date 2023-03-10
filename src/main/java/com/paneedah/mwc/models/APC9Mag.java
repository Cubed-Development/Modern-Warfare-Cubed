package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class APC9Mag extends ModelWithAttachments {
	private final ModelRenderer stock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone10;
	private final ModelRenderer bone9;
	private final ModelRenderer bone47;
	private final ModelRenderer bone51;
	private final ModelRenderer bone48;
	private final ModelRenderer bone49;
	private final ModelRenderer bone50;
	private final ModelRenderer bone34;
	private final ModelRenderer bone38;
	private final ModelRenderer bone8;
	private final ModelRenderer bone7;
	private final ModelRenderer bone6;
	private final ModelRenderer bone5;
	private final ModelRenderer bone25;
	private final ModelRenderer bone31;
	private final ModelRenderer bone33;
	private final ModelRenderer bone32;
	private final ModelRenderer bone30;
	private final ModelRenderer bone26;
	private final ModelRenderer bone27;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer maingun;
	private final ModelRenderer bone24;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone17;
	private final ModelRenderer bone16;
	private final ModelRenderer bone18;
	private final ModelRenderer bone4;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone42;
	private final ModelRenderer bone43;
	private final ModelRenderer bone41;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer bone2;
	private final ModelRenderer bone21;
	private final ModelRenderer bone3;
	private final ModelRenderer bone;
	private final ModelRenderer maingun2;
	private final ModelRenderer maingun3;
	private final ModelRenderer maingun4;
	private final ModelRenderer maingun6;
	private final ModelRenderer maingun5;
	private final ModelRenderer maingun7;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone44;
	private final ModelRenderer bone46;
	private final ModelRenderer bone45;
	private final ModelRenderer trigger;
	private final ModelRenderer bone52;
	private final ModelRenderer bone53;
	private final ModelRenderer bone54;
	private final ModelRenderer bone55;
	private final ModelRenderer bone56;
	private final ModelRenderer grip;
	private final ModelRenderer grip12;
	private final ModelRenderer grip11;
	private final ModelRenderer grip8;
	private final ModelRenderer grip5;
	private final ModelRenderer grip4;
	private final ModelRenderer grip6;
	private final ModelRenderer grip3;
	private final ModelRenderer grip7;
	private final ModelRenderer grip2;
	private final ModelRenderer grip1;
	private final ModelRenderer barrel;
	private final ModelRenderer mag;

	public APC9Mag() {
		textureWidth = 256;
		textureHeight = 256;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.5F, 24.0F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 130, 0, -3.5F, -38.3177F, 11.7357F, 3, 2, 21, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 77, 50, -3.5F, -37.4103F, 11.6343F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 22, 0, -3.5F, -39.035F, 7.466F, 3, 6, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 33, 0, -3.5F, -39.035F, 4.466F, 2, 6, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 20, 70, -3.5F, -39.809F, 7.3895F, 3, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 45, 34, -3.5F, -34.0255F, 7.7073F, 3, 1, 5, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 88, -3.5F, -37.6106F, 32.6928F, 3, 12, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 64, -3.5F, -37.6106F, 32.4428F, 3, 13, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 88, 22, -3.5F, -24.9035F, 29.9857F, 3, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 78, 16, -3.5F, -25.6106F, 32.6928F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 78, 20, -3.5F, -38.3177F, 31.9857F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 11, 0, -2.5F, -36.7189F, 20.2679F, 1, 7, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 0, -2.5F, -37.9689F, 3.7679F, 1, 5, 9, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 11, 14, -3.5F, -41.4689F, 2.7679F, 2, 3, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 0, -2.5F, -37.9689F, 12.7679F, 1, 2, 20, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 73, 90, -2.5F, -29.7189F, 21.2679F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 92, 66, -2.5F, -30.7189F, 19.2679F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 63, 17, -1.249F, -42.2189F, 1.7679F, 1, 3, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 45, 0, -4.75F, -40.4689F, 3.7679F, 1, 6, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 14, -4.75F, -39.7189F, 2.7679F, 1, 4, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 70, 54, -3.751F, -42.2189F, 1.7679F, 3, 3, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 32, 93, -4.0429F, -41.676F, 2.7679F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 73, 93, -4.75F, -40.9689F, 2.7679F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 92, 68, -4.75F, -36.2189F, 2.7679F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 21, 93, -4.75F, -34.9689F, 2.7679F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 12, 58, -0.75F, -38.0F, 2.25F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 72, 12, -3.999F, -39.7189F, 1.7679F, 4, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.5F, -40.25F, -31.75F);
		stock.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.2618F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 163, -3.5442F, -1.1641F, 33.5F, 1, 1, 2, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-0.5F, -27.3021F, 25.3978F);
		stock.addChild(bone10);
		setRotationAngle(bone10, -0.48F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 42, 88, -3.0F, -0.1039F, -14.3611F, 3, 1, 20, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-0.5F, -37.8177F, 33.2357F);
		stock.addChild(bone9);
		setRotationAngle(bone9, -0.7854F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 78, 22, -3.0F, -0.1768F, -0.5303F, 3, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 78, 18, -3.0F, 9.0156F, 8.6621F, 3, 1, 1, 0.0F, false));

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(bone47);
		bone47.cubeList.add(new ModelBox(bone47, 61, 65, -2.5F, -32.75F, 12.0F, 1, 1, 3, 0.0F, false));
		bone47.cubeList.add(new ModelBox(bone47, 63, 0, -2.5F, -27.25F, 30.0F, 1, 3, 3, 0.0F, false));
		bone47.cubeList.add(new ModelBox(bone47, 0, 22, -2.5F, -37.516F, 29.6072F, 1, 3, 1, 0.0F, false));
		bone47.cubeList.add(new ModelBox(bone47, 0, 0, -2.5F, -33.75F, 31.25F, 1, 7, 2, 0.0F, false));
		bone47.cubeList.add(new ModelBox(bone47, 26, 53, -2.5F, -36.75F, 30.25F, 1, 3, 3, 0.0F, false));

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(-1.0F, -33.0F, 33.25F);
		bone47.addChild(bone51);
		setRotationAngle(bone51, -0.7854F, 0.0F, 0.0F);
		bone51.cubeList.add(new ModelBox(bone51, 77, 37, -2.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 77, 35, -2.5F, -1.2071F, -1.2071F, 3, 1, 1, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 77, 6, -2.5F, -1.9142F, -1.9142F, 3, 1, 1, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 77, 4, -2.5F, -2.6213F, -2.6213F, 3, 1, 1, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 77, 2, -2.5F, 0.2071F, 0.2071F, 3, 1, 1, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 77, 0, -2.5F, 0.9142F, 0.9142F, 3, 1, 1, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 72, 72, -2.5F, 1.6213F, 1.6213F, 3, 1, 1, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 63, 50, -2.5F, 2.3284F, 2.3284F, 3, 1, 1, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 63, 6, -2.5F, 3.0355F, 3.0355F, 3, 1, 1, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 10, 38, -2.5F, 3.7426F, 3.7426F, 3, 1, 1, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 22, 7, -2.5F, 4.4497F, 4.4497F, 3, 1, 1, 0.0F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(-2.0F, -32.25F, 12.0F);
		bone47.addChild(bone48);
		setRotationAngle(bone48, -0.6981F, 0.0F, 0.0F);
		bone48.cubeList.add(new ModelBox(bone48, 69, 76, -0.5F, -0.617F, -1.6786F, 1, 1, 2, 0.0F, false));

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(-2.0F, -25.25F, 30.0F);
		bone47.addChild(bone49);
		setRotationAngle(bone49, -0.6981F, 0.0F, 0.0F);
		bone49.cubeList.add(new ModelBox(bone49, 12, 22, -0.5F, -1.5321F, -1.2856F, 1, 2, 2, 0.0F, false));

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(-2.0F, -36.75F, 30.0F);
		bone47.addChild(bone50);
		setRotationAngle(bone50, 0.6981F, 0.0F, 0.0F);
		bone50.cubeList.add(new ModelBox(bone50, 39, 44, -0.5F, -0.4679F, -1.2856F, 1, 2, 1, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 56, 37, -0.5F, 1.4588F, -1.7369F, 1, 1, 1, 0.0F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-2.0F, -33.4689F, 13.0179F);
		stock.addChild(bone34);
		setRotationAngle(bone34, 1.0908F, 0.0F, 0.0F);
		bone34.cubeList.add(new ModelBox(bone34, 81, 54, -0.5F, -0.9526F, -0.1719F, 1, 21, 1, 0.0F, false));

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(-2.0F, -37.4689F, 10.5179F);
		stock.addChild(bone38);
		setRotationAngle(bone38, -1.0908F, 0.0F, 0.0F);
		bone38.cubeList.add(new ModelBox(bone38, 12, 55, -0.5F, -2.9051F, 1.7317F, 1, 2, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-1.0F, -39.4689F, 5.7679F);
		stock.addChild(bone8);
		setRotationAngle(bone8, -0.3054F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 12, 79, -2.5F, -0.847F, 3.5147F, 3, 2, 3, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.0F, -40.2189F, 5.7679F);
		stock.addChild(bone7);
		setRotationAngle(bone7, -0.48F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 90, 90, -2.5F, -0.847F, 1.5147F, 2, 2, 3, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 61, 69, -1.5F, -0.847F, 2.5147F, 2, 2, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-1.0F, -40.4689F, 5.7679F);
		stock.addChild(bone6);
		setRotationAngle(bone6, -0.6109F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 35, 22, -2.5F, -0.847F, 0.5147F, 2, 5, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.25F, -40.4689F, 5.7679F);
		stock.addChild(bone5);
		setRotationAngle(bone5, -0.3054F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 20, 64, -2.25F, -0.653F, -1.2544F, 2, 4, 2, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, -37.0F, -17.0F);
		stock.addChild(bone25);
		bone25.cubeList.add(new ModelBox(bone25, 45, 8, -0.75F, -1.8049F, 20.8047F, 1, 6, 1, 0.0F, false));
		bone25.cubeList.add(new ModelBox(bone25, 45, 17, -3.999F, -1.8049F, 18.8047F, 4, 6, 3, 0.0F, false));
		bone25.cubeList.add(new ModelBox(bone25, 29, 44, -3.0F, 3.4958F, 18.8047F, 2, 1, 2, 0.0F, false));
		bone25.cubeList.add(new ModelBox(bone25, 35, 11, -2.5F, -0.3049F, 20.8047F, 2, 3, 2, 0.0F, false));
		bone25.cubeList.add(new ModelBox(bone25, 53, 65, -2.5F, 0.6951F, 22.8047F, 2, 1, 1, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-0.25F, 4.1951F, 21.3047F);
		bone25.addChild(bone31);
		setRotationAngle(bone31, 0.0F, 0.0F, 1.2654F);
		bone31.cubeList.add(new ModelBox(bone31, 94, 7, -0.8496F, -0.4769F, -0.5F, 1, 1, 1, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 79, 88, -0.9248F, -0.2384F, -2.5F, 1, 1, 2, 0.0F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-0.75F, 4.1951F, 21.3047F);
		bone25.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, -1.2654F);
		bone33.cubeList.add(new ModelBox(bone33, 68, 88, -0.9773F, -3.0996F, -2.5F, 1, 1, 2, 0.0F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(-0.25F, 4.1951F, 21.3047F);
		bone25.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, 1.789F);
		bone32.cubeList.add(new ModelBox(bone32, 79, 94, -0.6082F, 0.3779F, -0.5F, 1, 1, 1, 0.0F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-1.5F, 1.1951F, 23.3047F);
		bone25.addChild(bone30);
		setRotationAngle(bone30, -0.7854F, 0.0F, 0.0F);
		bone30.cubeList.add(new ModelBox(bone30, 63, 22, -1.0F, 0.4142F, -0.2929F, 2, 1, 1, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 54, 5, -1.0F, -0.7071F, -1.4142F, 2, 1, 1, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 55, 54, -1.0F, 0.0F, -0.2929F, 2, 1, 1, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 54, 13, -1.0F, -0.7071F, -1.0F, 2, 1, 1, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-2.0F, -40.2189F, 4.2679F);
		stock.addChild(bone26);
		setRotationAngle(bone26, -0.4363F, 0.0F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 20, 38, -1.75F, 0.6645F, -0.2418F, 4, 1, 1, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-2.0F, -37.8771F, 5.8652F);
		stock.addChild(bone27);
		setRotationAngle(bone27, -1.4399F, 0.0F, 0.0F);
		bone27.cubeList.add(new ModelBox(bone27, 0, 38, -1.75F, 0.9956F, -1.5625F, 4, 1, 1, 0.0F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(-4.25F, -37.4689F, 6.2679F);
		stock.addChild(bone35);
		setRotationAngle(bone35, 0.0F, 0.6545F, 0.0F);
		bone35.cubeList.add(new ModelBox(bone35, 12, 44, 0.5165F, -3.0F, -1.4944F, 1, 6, 1, 0.0F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(-4.25F, -37.4689F, 6.2679F);
		stock.addChild(bone36);
		setRotationAngle(bone36, 0.0F, 1.2217F, 0.0F);
		bone36.cubeList.add(new ModelBox(bone36, 20, 22, 0.7012F, -3.0F, -0.1395F, 1, 6, 1, 0.0F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(-4.25F, -41.4689F, 3.2679F);
		stock.addChild(bone37);
		setRotationAngle(bone37, 0.0F, 0.0F, 0.7854F);
		bone37.cubeList.add(new ModelBox(bone37, 58, 93, 0.0F, -0.2929F, -0.5F, 1, 1, 1, 0.0F, false));
		bone37.cubeList.add(new ModelBox(bone37, 47, 93, 4.9497F, 4.6569F, -0.5F, 1, 1, 1, 0.0F, false));

		maingun = new ModelRenderer(this);
		maingun.setRotationPoint(0.0F, 24.0F, 0.0F);
		maingun.cubeList.add(new ModelBox(maingun, 20, 80, -2.5F, -27.25F, -13.0F, 2, 1, 4, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 72, 65, -3.0F, -31.0F, -15.5F, 3, 3, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 20, 22, -3.499F, -37.25F, -24.0F, 4, 9, 7, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 104, 0, -2.5F, -42.25F, -24.0F, 2, 5, 7, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 68, 88, -0.75F, -37.25F, -17.0F, 1, 2, 9, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 42, 88, -3.25F, -37.25F, -17.0F, 1, 2, 9, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 45, 65, -3.0F, -37.25F, -17.0F, 3, 9, 2, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 30, 75, -3.5F, -35.3642F, -24.7177F, 4, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 31, 71, -3.5F, -35.1358F, -24.7177F, 4, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 0, 64, -3.25F, -36.25F, -39.5F, 3, 1, 14, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 90, 90, -0.75F, -36.25F, -39.5F, 1, 1, 14, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 45, 45, -3.5F, -39.75F, -39.75F, 1, 4, 16, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 73, 28, -2.5F, -36.75F, -39.75F, 2, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 0, 88, -0.25F, -39.25F, -39.751F, 1, 3, 14, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 55, 44, -4.0F, -39.25F, -39.5F, 1, 3, 2, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 18, 53, -4.0F, -39.25F, -28.0F, 1, 3, 2, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 18, 44, -4.0F, -39.25F, -31.25F, 1, 3, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 39, 39, -4.0F, -39.25F, -33.0F, 1, 3, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 22, 11, -4.0F, -39.25F, -34.75F, 1, 3, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 54, 0, 0.0F, -39.25F, -39.5F, 1, 3, 2, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 98, 66, 0.0F, -39.25F, -36.5F, 1, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 90, 95, -4.0F, -39.25F, -36.5F, 1, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 94, 18, -4.0F, -39.25F, -29.5F, 1, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 82, 95, -4.0F, -37.25F, -36.5F, 1, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 94, 87, -4.0F, -37.25F, -29.5F, 1, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 98, 36, 0.0F, -37.25F, -36.5F, 1, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 98, 38, 0.0F, -39.25F, -29.5F, 1, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 98, 19, 0.0F, -37.25F, -29.5F, 1, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 12, 51, 0.0F, -39.25F, -31.25F, 1, 3, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 45, 34, 0.0F, -39.25F, -33.0F, 1, 3, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 45, 26, 0.0F, -39.25F, -34.75F, 1, 3, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 54, 8, 0.0F, -39.25F, -28.0F, 1, 3, 2, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 45, 65, -3.75F, -39.25F, -39.751F, 1, 3, 14, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 0, 44, -0.5F, -39.75F, -39.75F, 1, 4, 16, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 72, 69, -2.5F, -35.5F, -39.25F, 2, 1, 2, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 45, 45, -3.25F, -42.4689F, -38.4821F, 3, 1, 41, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 45, 0, -0.75F, -42.4689F, -38.4821F, 1, 1, 41, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 92, 66, -3.0F, -43.4689F, -37.7321F, 1, 1, 4, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 84, 93, -2.0F, -43.4689F, -34.7321F, 1, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 51, 56, -1.0F, -43.4689F, -37.7321F, 1, 1, 4, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 158, 113, -3.5F, -39.7189F, -15.732F, 3, 3, 18, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 74, 29, -3.5F, -37.7189F, -20.7321F, 1, 1, 5, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 63, 44, -3.5F, -39.7189F, -23.7321F, 1, 3, 3, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 188, 73, -3.25F, -40.7189F, -37.7321F, 1, 1, 27, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 48, 87, -0.75F, -40.7189F, -37.7321F, 1, 2, 40, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 88, 16, -0.75F, -41.7189F, -24.7321F, 1, 2, 4, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 88, 7, -3.25F, -41.7189F, -24.7321F, 1, 2, 4, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 88, 16, -0.75F, -41.7189F, -11.7321F, 1, 2, 14, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 201, 110, -3.25F, -41.7189F, -11.732F, 3, 2, 14, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 20, 64, -1.0F, -41.7189F, -20.7321F, 1, 2, 9, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 22, 0, -3.0F, -41.7189F, -20.7321F, 1, 2, 9, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 64, 129, -0.5F, -39.7189F, -23.7321F, 1, 3, 26, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 0, 88, -3.0F, -43.2189F, -33.7321F, 3, 1, 36, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 63, 28, -3.5F, -36.7189F, -0.4821F, 4, 3, 2, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 77, 77, -2.5F, -35.5F, -27.5F, 2, 1, 2, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 92, 84, -2.5F, -35.5F, -29.0F, 2, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 92, 81, -2.5F, -35.5F, -35.25F, 2, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 22, 85, -2.5F, -35.5F, -33.75F, 2, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 57, 84, -2.5F, -35.5F, -32.25F, 2, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 77, 83, -2.5F, -35.5F, -30.75F, 2, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 75, 59, -2.5F, -35.5F, -29.25F, 2, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 90, 42, -2.5F, -35.5F, -36.75F, 2, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 63, 0, -3.0F, -37.0F, -15.0F, 3, 4, 8, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 63, 44, -3.001F, -33.0F, -15.0F, 3, 2, 8, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 53, 88, -0.75F, -35.0F, -16.5F, 1, 1, 2, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 27, 88, -3.25F, -35.0F, -16.5F, 1, 1, 2, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 55, 76, -3.5F, -35.0F, -16.0F, 1, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 39, 76, -0.5F, -35.0F, -16.0F, 1, 1, 1, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 42, 88, -0.25F, -39.0F, -18.0F, 1, 1, 2, 0.0F, false));
		maingun.cubeList.add(new ModelBox(maingun, 63, 54, -3.25F, -39.75F, -20.75F, 1, 2, 5, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-0.25F, -36.5F, -7.5F);
		maingun.addChild(bone24);
		setRotationAngle(bone24, 0.2182F, 0.0F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 16, 88, -0.5F, -0.9183F, -5.2863F, 1, 2, 9, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 61, 65, -3.0F, -0.9183F, -5.2863F, 1, 2, 9, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-1.5F, -32.75F, -17.0F);
		maingun.addChild(bone22);
		setRotationAngle(bone22, -0.0436F, 0.0F, 0.0F);
		bone22.cubeList.add(new ModelBox(bone22, 33, 78, -1.998F, -4.4891F, -0.7498F, 4, 8, 1, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-1.5F, -28.75F, -16.0F);
		maingun.addChild(bone23);
		setRotationAngle(bone23, 0.9599F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 88, 36, -2.0F, -1.5F, -0.5F, 4, 3, 1, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 30, 38, -2.0F, -0.9264F, -1.3192F, 4, 1, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-3.0F, -40.25F, -31.75F);
		maingun.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, 0.2618F);
		bone13.cubeList.add(new ModelBox(bone13, 0, 207, -0.3536F, -0.3876F, -7.5F, 1, 1, 41, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(3.0F, -40.25F, -31.75F);
		maingun.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, -0.2618F);
		bone14.cubeList.add(new ModelBox(bone14, 0, 163, -3.5442F, -1.1641F, -7.5F, 1, 1, 41, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(5.0266F, -39.1541F, -36.0F);
		maingun.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, 0.2618F);
		bone15.cubeList.add(new ModelBox(bone15, 98, 10, -4.9142F, 0.9495F, -0.5F, 1, 1, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 98, 4, -4.9142F, 0.9495F, 1.25F, 1, 1, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 98, 2, -4.9142F, 0.9495F, 3.0F, 1, 1, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 98, 0, -4.9142F, 0.9495F, 4.75F, 1, 1, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 97, 98, -4.9142F, 0.9495F, 6.5F, 1, 1, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 16, 94, -4.9142F, 0.9495F, 8.0F, 1, 1, 2, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 8, 94, -4.9142F, 0.9495F, -3.5F, 1, 1, 2, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-8.0266F, -39.1541F, -36.0F);
		maingun.addChild(bone17);
		setRotationAngle(bone17, 0.0F, 0.0F, -0.2618F);
		bone17.cubeList.add(new ModelBox(bone17, 97, 23, 3.9142F, 0.9495F, -0.5F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 97, 21, 3.9142F, 0.9495F, 1.25F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 97, 17, 3.9142F, 0.9495F, 3.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 97, 12, 3.9142F, 0.9495F, 4.75F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 97, 8, 3.9142F, 0.9495F, 6.5F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 53, 91, 3.9142F, 0.9495F, 8.0F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 42, 91, 3.9142F, 0.9495F, -3.5F, 1, 1, 2, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(5.0266F, -36.3459F, -36.0F);
		maingun.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.0F, -0.2618F);
		bone16.cubeList.add(new ModelBox(bone16, 97, 96, -4.9142F, -1.9495F, -0.5F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 97, 90, -4.9142F, -1.9495F, 1.25F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 97, 88, -4.9142F, -1.9495F, 3.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 97, 32, -4.9142F, -1.9495F, 4.75F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 97, 26, -4.9142F, -1.9495F, 6.5F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 79, 91, -4.9142F, -1.9495F, 8.0F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 68, 91, -4.9142F, -1.9495F, -3.5F, 1, 1, 2, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-8.0266F, -36.3459F, -36.0F);
		maingun.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0F, 0.2618F);
		bone18.cubeList.add(new ModelBox(bone18, 97, 6, 3.9142F, -1.9495F, -0.5F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 94, 97, 3.9142F, -1.9495F, 1.25F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 90, 97, 3.9142F, -1.9495F, 3.0F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 8, 97, 3.9142F, -1.9495F, 4.75F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 94, 95, 3.9142F, -1.9495F, 6.5F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 27, 91, 3.9142F, -1.9495F, 8.0F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 16, 91, 3.9142F, -1.9495F, -3.5F, 1, 1, 2, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.5F, -41.75F, -39.25F);
		maingun.addChild(bone4);
		setRotationAngle(bone4, -0.4363F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 8, 64, -2.75F, -0.9761F, 0.3921F, 1, 3, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 55, 49, -0.25F, -0.9761F, 0.3921F, 1, 3, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 81, 31, -0.25F, -2.3496F, 4.3376F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 57, 57, -2.75F, -2.3496F, 4.3376F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 28, 79, -0.25F, -3.6174F, 7.0565F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 56, 34, -2.75F, -3.6174F, 7.0565F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 75, 30, -0.25F, -4.8853F, 9.7754F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 56, 26, -2.75F, -4.8853F, 9.7754F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 55, 70, -0.25F, -6.1531F, 12.4944F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 56, 17, -2.75F, -6.1531F, 12.4944F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 21, 90, -2.5F, -2.1993F, 0.6492F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 88, 16, -0.5F, -2.1993F, 0.6492F, 1, 2, 1, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.589F, -36.3852F, -38.25F);
		maingun.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -1.2217F);
		bone11.cubeList.add(new ModelBox(bone11, 68, 94, -2.0585F, -1.1436F, -1.0F, 1, 1, 2, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 58, 99, -2.0585F, -1.1436F, 1.5F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 54, 99, -2.0585F, -1.1436F, 3.0F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 50, 99, -2.0585F, -1.1436F, 4.5F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 46, 99, -2.0585F, -1.1436F, 6.0F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 42, 99, -2.0585F, -1.1436F, 7.5F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 32, 99, -2.0585F, -1.1436F, 9.0F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 28, 99, -2.0585F, -1.1436F, 9.25F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 53, 94, -2.0585F, -1.1436F, 10.75F, 1, 1, 2, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-3.589F, -36.3852F, -38.25F);
		maingun.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, 1.2217F);
		bone12.cubeList.add(new ModelBox(bone12, 42, 94, 1.0585F, -1.1436F, -1.0F, 1, 1, 2, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 24, 99, 1.0585F, -1.1436F, 1.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 20, 99, 1.0585F, -1.1436F, 3.0F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 16, 99, 1.0585F, -1.1436F, 4.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 8, 99, 1.0585F, -1.1436F, 6.0F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 98, 84, 1.0585F, -1.1436F, 7.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 98, 81, 1.0585F, -1.1436F, 9.0F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 98, 68, 1.0585F, -1.1436F, 9.25F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 27, 94, 1.0585F, -1.1436F, 10.75F, 1, 1, 2, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-0.25F, -40.4689F, -37.7321F);
		maingun.addChild(bone19);
		setRotationAngle(bone19, 0.4363F, 0.0F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 94, 16, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 88, 7, -0.5F, -0.1265F, 2.9455F, 1, 2, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 81, 28, -0.5F, 1.1414F, 5.6644F, 1, 2, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 55, 73, -0.5F, 2.4092F, 8.3833F, 1, 2, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 70, 34, -0.5F, 3.6771F, 11.1023F, 1, 2, 1, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-2.75F, -40.4689F, -37.7321F);
		maingun.addChild(bone20);
		setRotationAngle(bone20, 0.4363F, 0.0F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 94, 9, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 55, 67, -0.5F, -0.1265F, 2.9455F, 1, 2, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 66, 65, -0.5F, 1.1414F, 5.6644F, 1, 2, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 63, 54, -0.5F, 2.4092F, 8.3833F, 1, 2, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 63, 34, -0.5F, 3.6771F, 11.1023F, 1, 2, 1, 0.0F, false));

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(-0.25F, -40.2189F, -11.9821F);
		maingun.addChild(bone42);
		setRotationAngle(bone42, -0.7854F, 0.0F, 0.0F);
		bone42.cubeList.add(new ModelBox(bone42, 72, 88, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
		bone42.cubeList.add(new ModelBox(bone42, 28, 82, -3.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
		bone42.cubeList.add(new ModelBox(bone42, 46, 88, -0.5F, 5.364F, -6.864F, 1, 1, 1, 0.0F, false));
		bone42.cubeList.add(new ModelBox(bone42, 82, 12, -3.0F, 5.364F, -6.864F, 1, 1, 1, 0.0F, false));

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(-0.25F, -41.2189F, -11.9821F);
		maingun.addChild(bone43);
		setRotationAngle(bone43, -0.7854F, 0.0F, 0.0F);
		bone43.cubeList.add(new ModelBox(bone43, 57, 88, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 81, 80, -3.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 31, 88, -0.5F, 5.364F, -6.864F, 1, 1, 1, 0.0F, false));
		bone43.cubeList.add(new ModelBox(bone43, 82, 82, -3.0F, 5.364F, -6.864F, 1, 1, 1, 0.0F, false));

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(0.75F, -41.2189F, -20.2321F);
		maingun.addChild(bone41);
		setRotationAngle(bone41, 0.0F, -0.1745F, 0.0F);
		bone41.cubeList.add(new ModelBox(bone41, 77, 44, -1.4566F, -0.5F, -0.2538F, 3, 1, 1, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-3.0F, -32.2189F, 0.5179F);
		maingun.addChild(bone28);
		setRotationAngle(bone28, 0.0F, 0.0F, -0.6545F);
		bone28.cubeList.add(new ModelBox(bone28, 8, 91, 0.5165F, -1.4944F, -1.0F, 1, 1, 2, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, -32.2189F, 0.5179F);
		maingun.addChild(bone29);
		setRotationAngle(bone29, 0.0F, 0.0F, 0.6545F);
		bone29.cubeList.add(new ModelBox(bone29, 90, 87, -1.5165F, -1.4944F, -1.0F, 1, 1, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.5F, -35.75F, -26.0F);
		maingun.addChild(bone2);
		setRotationAngle(bone2, 0.9163F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 54, 82, -3.0F, 2.0F, -0.5F, 4, 1, 1, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-0.5F, -33.25F, -26.0F);
		maingun.addChild(bone21);
		setRotationAngle(bone21, -0.9163F, 0.0F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 61, 76, -3.0F, -3.3044F, -0.8967F, 4, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.5F, -35.25F, -27.0F);
		maingun.addChild(bone3);
		setRotationAngle(bone3, 1.2654F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 8, 73, -2.25F, 1.0F, -0.5F, 1, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 8, 69, -0.75F, 1.0F, -0.5F, 1, 2, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.5F, -28.25F, -19.25F);
		maingun.addChild(bone);
		setRotationAngle(bone, -0.0873F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 105, -3.25F, -0.5F, -5.0F, 4, 1, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 92, 73, -2.75F, -0.5F, -5.0F, 4, 1, 10, 0.0F, false));

		maingun2 = new ModelRenderer(this);
		maingun2.setRotationPoint(-0.5F, -26.75F, -10.0F);
		maingun.addChild(maingun2);
		setRotationAngle(maingun2, 0.5672F, 0.0F, 0.0F);
		maingun2.cubeList.add(new ModelBox(maingun2, 92, 77, -2.0F, -0.041F, 0.5747F, 2, 1, 3, 0.0F, false));

		maingun3 = new ModelRenderer(this);
		maingun3.setRotationPoint(-0.5F, -26.75F, -10.0F);
		maingun.addChild(maingun3);
		setRotationAngle(maingun3, -0.5672F, 0.0F, 0.0F);
		maingun3.cubeList.add(new ModelBox(maingun3, 92, 73, -2.0F, 1.0336F, -5.2615F, 2, 1, 3, 0.0F, false));

		maingun4 = new ModelRenderer(this);
		maingun4.setRotationPoint(-0.5F, -30.5F, -4.25F);
		maingun.addChild(maingun4);
		setRotationAngle(maingun4, -0.5672F, 0.0F, 0.0F);
		maingun4.cubeList.add(new ModelBox(maingun4, 88, 32, -2.5F, 1.0336F, -5.2615F, 3, 1, 3, 0.0F, false));

		maingun6 = new ModelRenderer(this);
		maingun6.setRotationPoint(-0.5F, -30.5F, -17.75F);
		maingun.addChild(maingun6);
		setRotationAngle(maingun6, 0.5672F, 0.0F, 0.0F);
		maingun6.cubeList.add(new ModelBox(maingun6, 45, 82, -2.5F, 1.0336F, 2.2615F, 3, 1, 3, 0.0F, false));

		maingun5 = new ModelRenderer(this);
		maingun5.setRotationPoint(-0.5F, -30.7164F, -7.7615F);
		maingun.addChild(maingun5);
		setRotationAngle(maingun5, -0.829F, 0.0F, 0.0F);
		maingun5.cubeList.add(new ModelBox(maingun5, 88, 26, -2.5F, -0.5F, -1.5F, 3, 1, 3, 0.0F, false));

		maingun7 = new ModelRenderer(this);
		maingun7.setRotationPoint(-0.5F, -30.7164F, -14.2385F);
		maingun.addChild(maingun7);
		setRotationAngle(maingun7, 0.829F, 0.0F, 0.0F);
		maingun7.cubeList.add(new ModelBox(maingun7, 63, 12, -2.5F, -0.5F, -1.5F, 3, 1, 3, 0.0F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(0.5F, -34.75F, -23.75F);
		maingun.addChild(bone39);
		setRotationAngle(bone39, -0.7854F, 0.0F, 0.0F);
		bone39.cubeList.add(new ModelBox(bone39, 58, 90, -0.75F, -0.6768F, -0.3232F, 1, 1, 1, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 20, 88, -1.25F, -8.8085F, 10.2834F, 1, 1, 1, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 63, 57, -0.75F, -18.708F, 15.9402F, 1, 1, 1, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 63, 37, -4.25F, -18.708F, 15.9402F, 1, 1, 1, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 39, 74, -0.75F, -13.4047F, 12.7583F, 1, 1, 1, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 70, 37, -4.25F, -13.4047F, 12.7583F, 1, 1, 1, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 82, 39, -3.75F, -9.5156F, 9.5763F, 1, 1, 1, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 32, 90, -4.0F, -5.6265F, -4.5659F, 1, 1, 1, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 28, 85, -1.0F, -5.6265F, -4.5659F, 1, 1, 1, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 47, 90, -4.25F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(-0.25F, -1.9445F, -3.3588F);
		bone39.addChild(bone40);
		setRotationAngle(bone40, -0.3491F, 0.0F, 0.0F);
		bone40.cubeList.add(new ModelBox(bone40, 83, 88, -0.5F, -5.7113F, 1.9301F, 1, 1, 1, 0.0F, false));
		bone40.cubeList.add(new ModelBox(bone40, 10, 79, -4.0F, -9.5631F, 3.7262F, 1, 1, 1, 0.0F, false));

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(0.25F, -30.0F, -16.75F);
		maingun.addChild(bone44);
		setRotationAngle(bone44, -0.1309F, 0.0F, 0.0F);
		bone44.cubeList.add(new ModelBox(bone44, 16, 88, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 8, 88, -3.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(0.75F, -34.0F, -5.25F);
		maingun.addChild(bone46);
		setRotationAngle(bone46, 0.2618F, 0.0F, 0.0F);
		bone46.cubeList.add(new ModelBox(bone46, 86, 42, -1.15F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		bone46.cubeList.add(new ModelBox(bone46, 77, 80, -4.4F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(0.0F, -36.5F, -22.5F);
		maingun.addChild(bone45);
		setRotationAngle(bone45, 0.0F, 0.0F, -0.7854F);
		bone45.cubeList.add(new ModelBox(bone45, 55, 34, -0.5F, -0.5F, -1.25F, 1, 1, 6, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 18, 53, -2.6213F, -2.6213F, -1.25F, 1, 1, 6, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 104, 16, -0.8536F, -0.5F, 5.75F, 1, 1, 9, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 66, 76, -2.6213F, -2.2678F, 5.75F, 1, 1, 9, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 45, 8, -1.0303F, 0.0303F, -1.25F, 1, 1, 7, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 45, 0, -3.1517F, -2.091F, -1.25F, 1, 1, 7, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 70, 35, -1.5607F, 0.5607F, 0.5F, 1, 1, 5, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 63, 34, -3.682F, -1.5607F, 0.5F, 1, 1, 5, 0.0F, false));

		trigger = new ModelRenderer(this);
		trigger.setRotationPoint(0.0F, 0.0F, 0.0F);
		maingun.addChild(trigger);
		

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(-1.5F, -31.0F, -10.0F);
		trigger.addChild(bone52);
		setRotationAngle(bone52, 0.7854F, 0.0F, 0.0F);
		bone52.cubeList.add(new ModelBox(bone52, 56, 29, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(-1.5F, -30.0F, -10.0F);
		trigger.addChild(bone53);
		setRotationAngle(bone53, 0.3491F, 0.0F, 0.0F);
		bone53.cubeList.add(new ModelBox(bone53, 29, 47, -0.5F, -0.6978F, 0.0065F, 1, 1, 1, 0.0F, false));

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(-1.5F, -30.0F, -10.0F);
		trigger.addChild(bone54);
		setRotationAngle(bone54, -0.0436F, 0.0F, 0.0F);
		bone54.cubeList.add(new ModelBox(bone54, 39, 18, -0.5F, -0.106F, 0.0455F, 1, 1, 1, 0.0F, false));

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(-1.5F, -30.0F, -10.0F);
		trigger.addChild(bone55);
		setRotationAngle(bone55, -0.3054F, 0.0F, 0.0F);
		bone55.cubeList.add(new ModelBox(bone55, 15, 0, -0.5F, 0.5929F, 0.2413F, 1, 1, 1, 0.0F, false));

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(-1.5F, -30.0F, -10.0F);
		trigger.addChild(bone56);
		setRotationAngle(bone56, -0.6545F, 0.0F, 0.0F);
		bone56.cubeList.add(new ModelBox(bone56, 4, 0, -0.5F, 1.0723F, 0.7112F, 1, 1, 1, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 0.0F, 0.0F);
		maingun.addChild(grip);
		

		grip12 = new ModelRenderer(this);
		grip12.setRotationPoint(-3.5F, -18.5F, -4.2F);
		grip.addChild(grip12);
		setRotationAngle(grip12, 0.9295F, 0.0F, 0.0F);
		grip12.cubeList.add(new ModelBox(grip12, 64, 82, 0.0F, 0.0124F, 0.0663F, 4, 1, 1, 0.0F, false));

		grip11 = new ModelRenderer(this);
		grip11.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip.addChild(grip11);
		setRotationAngle(grip11, 0.2603F, 0.0F, 0.0F);
		grip11.cubeList.add(new ModelBox(grip11, 12, 85, 0.0F, 9.0F, -1.0F, 4, 1, 1, 0.0F, false));

		grip8 = new ModelRenderer(this);
		grip8.setRotationPoint(-3.5F, -27.5F, -7.0F);
		grip.addChild(grip8);
		setRotationAngle(grip8, 1.041F, 0.0F, 0.0F);
		

		grip5 = new ModelRenderer(this);
		grip5.setRotationPoint(-1.5F, -31.0F, -2.634F);
		grip.addChild(grip5);
		setRotationAngle(grip5, 0.0436F, 0.0F, 0.0F);
		grip5.cubeList.add(new ModelBox(grip5, 22, 11, -2.0F, -2.0F, -4.5F, 4, 3, 5, 0.0F, false));

		grip4 = new ModelRenderer(this);
		grip4.setRotationPoint(-3.5F, -24.2F, 2.0F);
		grip.addChild(grip4);
		setRotationAngle(grip4, -2.7205F, 0.0F, 0.0F);
		grip4.cubeList.add(new ModelBox(grip4, 45, 45, 0.0F, -4.5943F, 1.162F, 4, 14, 1, 0.0F, false));

		grip6 = new ModelRenderer(this);
		grip6.setRotationPoint(-3.5F, -24.2F, -3.75F);
		grip.addChild(grip6);
		setRotationAngle(grip6, -2.8078F, 0.0F, 0.0F);
		grip6.cubeList.add(new ModelBox(grip6, 0, 44, 0.0F, -5.6842F, -0.0405F, 4, 14, 2, 0.0F, false));

		grip3 = new ModelRenderer(this);
		grip3.setRotationPoint(-1.5F, -33.8156F, -1.0986F);
		grip.addChild(grip3);
		setRotationAngle(grip3, -2.2547F, 0.0F, 0.0F);
		grip3.cubeList.add(new ModelBox(grip3, 20, 75, -2.0F, -0.5F, 0.5F, 4, 1, 2, 0.0F, false));

		grip7 = new ModelRenderer(this);
		grip7.setRotationPoint(-1.5F, -33.3156F, -1.0986F);
		grip.addChild(grip7);
		grip7.cubeList.add(new ModelBox(grip7, 63, 17, -2.0F, -3.4F, -6.5F, 4, 4, 7, 0.0F, false));
		grip7.cubeList.add(new ModelBox(grip7, 164, 80, -1.5F, -3.5F, 0.5F, 3, 4, 3, 0.0F, false));
		grip7.cubeList.add(new ModelBox(grip7, 0, 79, -2.001F, -3.099F, -7.2276F, 4, 5, 2, 0.0F, false));
		grip7.cubeList.add(new ModelBox(grip7, 0, 79, -1.999F, -3.449F, -7.2276F, 4, 1, 2, 0.0F, false));

		grip2 = new ModelRenderer(this);
		grip2.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip.addChild(grip2);
		setRotationAngle(grip2, 0.2603F, 0.0F, 0.0F);
		grip2.cubeList.add(new ModelBox(grip2, 0, 22, 0.001F, -2.0F, 0.0F, 4, 12, 4, 0.0F, false));
		grip2.cubeList.add(new ModelBox(grip2, 88, 0, 0.0F, 4.0F, 4.0F, 4, 6, 1, 0.0F, false));

		grip1 = new ModelRenderer(this);
		grip1.setRotationPoint(-3.5F, -31.5F, -7.0F);
		grip.addChild(grip1);
		grip1.cubeList.add(new ModelBox(grip1, 45, 76, 0.0F, 1.0F, 1.25F, 4, 1, 2, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(-4.0F, 0.0F, 0.0F);
		maingun.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 90, 90, 1.5F, -38.0F, -45.0F, 2, 1, 30, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 32, 129, 1.75F, -38.25F, -45.0F, 1, 1, 30, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 124, 72, 2.25F, -38.25F, -45.0F, 1, 1, 30, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 100, 121, 2.0F, -38.5F, -45.0F, 1, 1, 30, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 124, 41, 2.25F, -37.75F, -45.0F, 1, 1, 30, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 92, 42, 2.0F, -37.5F, -45.0F, 1, 1, 30, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 125, 1.75F, -37.75F, -45.0F, 1, 1, 30, 0.0F, false));

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 13.5F, -19.95F);
		setRotationAngle(mag, -0.0873F, 0.0F, 0.0F);
		mag.cubeList.add(new ModelBox(mag, 179, 38, -3.0F, -24.0F, -4.0F, 3, 24, 5, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 108, 42, -0.9F, -24.9346F, -2.3F, 1, 24, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 34, 44, -3.15F, -24.9346F, -2.3F, 1, 24, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 45, 26, -2.75F, -1.0F, -4.0F, 3, 1, 5, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 77, 48, -2.75F, -1.0654F, -4.2529F, 3, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 77, 46, -2.75F, -0.9595F, 0.2736F, 3, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 84, 90, -3.25F, -0.9595F, 0.2736F, 1, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 92, 44, -3.25F, -1.0654F, -4.2529F, 1, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 14, -3.25F, -1.0F, -4.0F, 3, 1, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		stock.render(f5);
//		maingun.render(f5);
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
