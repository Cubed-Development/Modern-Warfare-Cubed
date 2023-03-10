package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class FNFALActionLever extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer bone26;
	private final ModelRenderer bone87;
	private final ModelRenderer stock;
	private final ModelRenderer bone93;
	private final ModelRenderer bone94;
	private final ModelRenderer bone97;
	private final ModelRenderer bone98;
	private final ModelRenderer bone12;
	private final ModelRenderer bone95;
	private final ModelRenderer bone96;
	private final ModelRenderer bone86;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer grip;
	private final ModelRenderer grip9;
	private final ModelRenderer grip11;
	private final ModelRenderer grip8;
	private final ModelRenderer grip5;
	private final ModelRenderer grip4;
	private final ModelRenderer grip6;
	private final ModelRenderer grip3;
	private final ModelRenderer grip2;
	private final ModelRenderer grip12;
	private final ModelRenderer grip1;
	private final ModelRenderer grip7;
	private final ModelRenderer grip10;
	private final ModelRenderer grip13;
	private final ModelRenderer grip14;
	private final ModelRenderer grip15;
	private final ModelRenderer grip16;
	private final ModelRenderer grip17;
	private final ModelRenderer grip18;
	private final ModelRenderer grip19;
	private final ModelRenderer grip20;
	private final ModelRenderer action;
	private final ModelRenderer bone74;
	private final ModelRenderer bone92;
	private final ModelRenderer gun;
	private final ModelRenderer bone65;
	private final ModelRenderer bone84;
	private final ModelRenderer bone78;
	private final ModelRenderer bone79;
	private final ModelRenderer bone85;
	private final ModelRenderer bone88;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone8;
	private final ModelRenderer bone11;
	private final ModelRenderer bone71;
	private final ModelRenderer bone83;
	private final ModelRenderer bone72;
	private final ModelRenderer bone81;
	private final ModelRenderer bone19;
	private final ModelRenderer bone25;
	private final ModelRenderer bone62;
	private final ModelRenderer bone90;
	private final ModelRenderer bone91;
	private final ModelRenderer bone66;
	private final ModelRenderer bone67;
	private final ModelRenderer bone68;
	private final ModelRenderer bone69;
	private final ModelRenderer bone70;
	private final ModelRenderer bone73;
	private final ModelRenderer bone75;
	private final ModelRenderer bone77;
	private final ModelRenderer bone76;
	private final ModelRenderer bone80;
	private final ModelRenderer bone82;
	private final ModelRenderer trigger;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone24;
	private final ModelRenderer bone23;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer mainbarrel;
	private final ModelRenderer barrel;
	private final ModelRenderer mainbarrel2;
	private final ModelRenderer barrel2;
	private final ModelRenderer dustcover;
	private final ModelRenderer bone60;
	private final ModelRenderer bone61;
	private final ModelRenderer bone89;
	private final ModelRenderer bone63;
	private final ModelRenderer bone64;
	private final ModelRenderer handguard;
	private final ModelRenderer bone31;
	private final ModelRenderer bone41;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone45;
	private final ModelRenderer bone46;
	private final ModelRenderer bone47;
	private final ModelRenderer bone48;
	private final ModelRenderer bone49;
	private final ModelRenderer bone50;
	private final ModelRenderer bone51;
	private final ModelRenderer bone52;
	private final ModelRenderer bone42;
	private final ModelRenderer bone29;
	private final ModelRenderer bone28;
	private final ModelRenderer bone27;
	private final ModelRenderer bone35;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone53;
	private final ModelRenderer bone54;
	private final ModelRenderer bone55;
	private final ModelRenderer bone56;
	private final ModelRenderer bone57;
	private final ModelRenderer bone58;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone36;
	private final ModelRenderer bone30;
	private final ModelRenderer bone32;
	private final ModelRenderer bone7;
	private final ModelRenderer bone59;
	private final ModelRenderer bone34;
	private final ModelRenderer bone33;
	private final ModelRenderer bone10;
	private final ModelRenderer actionlever;
	private final ModelRenderer Bolt;
	private final ModelRenderer bone9;

	public FNFALActionLever() {
		textureWidth = 400;
		textureHeight = 400;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(2.75F, -6.5F, -18.5F);
		mag.cubeList.add(new ModelBox(mag, 0, 0, -5.75F, -3.952F, -11.3533F, 3, 18, 10, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 130, -6.0F, -3.952F, -10.3533F, 1, 18, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 52, 68, -3.5F, -3.952F, -10.3533F, 1, 18, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 14, 99, -3.5F, -3.952F, -5.3533F, 1, 18, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 81, 96, -6.0F, -3.952F, -5.3533F, 1, 18, 3, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-4.25F, 15.048F, -6.3533F);
		mag.addChild(bone26);
		setRotationAngle(bone26, -0.1745F, 0.0F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 69, 29, -1.5F, -2.1166F, -5.0977F, 3, 2, 10, 0.0F, false));

		bone87 = new ModelRenderer(this);
		bone87.setRotationPoint(-3.25F, -7.452F, -6.3533F);
		mag.addChild(bone87);
		setRotationAngle(bone87, 0.0F, 0.0F, 0.7854F);
		bone87.cubeList.add(new ModelBox(bone87, 63, 81, 1.8284F, 2.1213F, -5.0F, 1, 1, 10, 0.0F, false));
		bone87.cubeList.add(new ModelBox(bone87, 69, 41, 0.7071F, 3.2426F, -5.0F, 1, 1, 10, 0.0F, false));

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, -11.4587F, 38.6064F);
		stock.cubeList.add(new ModelBox(stock, 0, 42, -3.5F, 13.4972F, -4.7316F, 4, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 48, 60, -3.499F, -3.1028F, -33.8816F, 4, 3, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 22, 59, -2.999F, -4.0028F, -33.8816F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 58, 56, -2.999F, -4.0028F, -34.2816F, 3, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 68, -3.498F, -3.1028F, -34.2816F, 4, 6, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 69, 0, -3.5F, -0.6538F, -28.1804F, 4, 5, 24, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 63, 68, -3.0F, -1.5538F, -28.1804F, 3, 1, 27, 0.0F, false));

		bone93 = new ModelRenderer(this);
		bone93.setRotationPoint(0.001F, -4.0028F, -33.8815F);
		stock.addChild(bone93);
		setRotationAngle(bone93, 0.0F, 0.0F, -0.4538F);
		bone93.cubeList.add(new ModelBox(bone93, 27, 46, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone93.cubeList.add(new ModelBox(bone93, 10, 46, -1.001F, 0.0F, -0.4F, 1, 1, 1, 0.0F, false));

		bone94 = new ModelRenderer(this);
		bone94.setRotationPoint(-2.999F, -4.0028F, -33.8815F);
		stock.addChild(bone94);
		setRotationAngle(bone94, 0.0F, 0.0F, 0.4538F);
		bone94.cubeList.add(new ModelBox(bone94, 43, 14, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone94.cubeList.add(new ModelBox(bone94, 18, 28, -0.001F, 0.0F, -0.4F, 1, 1, 1, 0.0F, false));

		bone97 = new ModelRenderer(this);
		bone97.setRotationPoint(0.0F, -1.5537F, -28.1804F);
		stock.addChild(bone97);
		setRotationAngle(bone97, 0.0F, 0.0F, -0.4538F);
		bone97.cubeList.add(new ModelBox(bone97, 63, 96, -1.0F, 0.0F, 0.0F, 1, 1, 27, 0.0F, false));

		bone98 = new ModelRenderer(this);
		bone98.setRotationPoint(-3.0F, -1.5537F, -28.1804F);
		stock.addChild(bone98);
		setRotationAngle(bone98, 0.0F, 0.0F, 0.4538F);
		bone98.cubeList.add(new ModelBox(bone98, 69, 29, 0.0F, 0.0F, 0.0F, 1, 1, 27, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, -3.9129F, -34.0743F);
		stock.addChild(bone12);
		setRotationAngle(bone12, -0.3927F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 101, 0, -3.5F, 0.4076F, 1.9617F, 4, 5, 6, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 0, 28, -3.5F, 0.4076F, 0.9617F, 4, 2, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 101, 11, -3.0F, -0.5F, 1.0F, 3, 3, 7, 0.0F, false));

		bone95 = new ModelRenderer(this);
		bone95.setRotationPoint(0.0F, -0.5F, 1.0F);
		bone12.addChild(bone95);
		setRotationAngle(bone95, 0.0F, 0.0F, -0.4538F);
		bone95.cubeList.add(new ModelBox(bone95, 33, 42, -1.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		bone96 = new ModelRenderer(this);
		bone96.setRotationPoint(-3.0F, -0.5F, 1.0F);
		bone12.addChild(bone96);
		setRotationAngle(bone96, 0.0F, 0.0F, 0.4538F);
		bone96.cubeList.add(new ModelBox(bone96, 33, 34, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		bone86 = new ModelRenderer(this);
		bone86.setRotationPoint(-1.5F, 11.5F, -11.25F);
		stock.addChild(bone86);
		setRotationAngle(bone86, 0.0F, -0.7854F, 0.0F);
		bone86.cubeList.add(new ModelBox(bone86, 41, 18, -0.5F, -1.25F, -0.5F, 1, 2, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(bone13);
		setRotationAngle(bone13, -0.0873F, 0.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 63, 96, -3.5F, -0.749F, -4.5218F, 4, 15, 5, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 92, 96, -3.501F, 4.251F, -16.5218F, 4, 5, 12, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, -0.5F, 0.0F);
		stock.addChild(bone14);
		setRotationAngle(bone14, -0.7418F, 0.0F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 57, 27, -3.5F, -0.5167F, -0.7388F, 4, 1, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, -0.8801F, -0.6956F);
		stock.addChild(bone15);
		setRotationAngle(bone15, -0.1745F, 0.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 0, 46, -3.5F, -0.5792F, -0.5944F, 4, 1, 1, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 13.8699F, -0.9456F);
		stock.addChild(bone16);
		setRotationAngle(bone16, -1.309F, 0.0F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 33, 14, -3.5F, -0.0784F, -0.5975F, 4, 1, 1, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 13.3699F, -4.9456F);
		stock.addChild(bone17);
		setRotationAngle(bone17, -0.3927F, 0.0F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 0, 68, -3.499F, -4.0404F, -25.3709F, 4, 5, 26, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 11.3295F, -33.3165F);
		stock.addChild(bone18);
		setRotationAngle(bone18, -0.1745F, 0.0F, 0.0F);
		bone18.cubeList.add(new ModelBox(bone18, 0, 85, -3.5F, -9.3785F, -2.3892F, 4, 2, 7, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.2F, 24.0F, 0.0F);
		

		grip9 = new ModelRenderer(this);
		grip9.setRotationPoint(0.1F, 0.0F, 0.0F);
		grip.addChild(grip9);
		setRotationAngle(grip9, 0.1309F, 0.0F, 0.0F);
		

		grip11 = new ModelRenderer(this);
		grip11.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip9.addChild(grip11);
		setRotationAngle(grip11, 0.2603F, 0.0F, 0.0F);
		grip11.cubeList.add(new ModelBox(grip11, 76, 53, 0.0F, 9.0F, -1.0F, 3, 1, 1, 0.0F, false));

		grip8 = new ModelRenderer(this);
		grip8.setRotationPoint(-3.5F, -27.5F, -7.0F);
		grip9.addChild(grip8);
		setRotationAngle(grip8, 1.041F, 0.0F, 0.0F);
		

		grip5 = new ModelRenderer(this);
		grip5.setRotationPoint(-3.5F, -35.9421F, -2.6803F);
		grip9.addChild(grip5);
		setRotationAngle(grip5, -0.48F, 0.0F, 0.0F);
		grip5.cubeList.add(new ModelBox(grip5, 16, 42, 0.001F, 2.8223F, 2.547F, 3, 2, 3, 0.0F, false));

		grip4 = new ModelRenderer(this);
		grip4.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip9.addChild(grip4);
		setRotationAngle(grip4, -2.6769F, 0.0F, 0.0F);
		grip4.cubeList.add(new ModelBox(grip4, 0, 49, 0.0F, -4.8492F, -0.5117F, 3, 10, 2, 0.0F, false));

		grip6 = new ModelRenderer(this);
		grip6.setRotationPoint(-3.5F, -24.1417F, -3.803F);
		grip9.addChild(grip6);
		setRotationAngle(grip6, -2.8078F, 0.0F, 0.0F);
		grip6.cubeList.add(new ModelBox(grip6, 34, 68, -0.001F, -4.8492F, -4.5117F, 3, 16, 6, 0.0F, false));

		grip3 = new ModelRenderer(this);
		grip3.setRotationPoint(-1.5F, -30.9726F, 7.7963F);
		grip9.addChild(grip3);
		setRotationAngle(grip3, -2.5165F, 0.0F, 0.0F);
		grip3.cubeList.add(new ModelBox(grip3, 16, 0, -2.0F, 3.7874F, 3.0476F, 3, 5, 4, 0.0F, false));

		grip2 = new ModelRenderer(this);
		grip2.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip9.addChild(grip2);
		setRotationAngle(grip2, 0.2603F, 0.0F, 0.0F);
		grip2.cubeList.add(new ModelBox(grip2, 42, 107, 0.0F, 8.0F, 0.0F, 3, 2, 6, 0.0F, false));

		grip12 = new ModelRenderer(this);
		grip12.setRotationPoint(-3.5F, -18.5F, -4.2F);
		grip9.addChild(grip12);
		setRotationAngle(grip12, 0.9295F, 0.0F, 0.0F);
		grip12.cubeList.add(new ModelBox(grip12, 69, 47, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		grip1 = new ModelRenderer(this);
		grip1.setRotationPoint(-3.5F, -31.5F, -7.0F);
		grip9.addChild(grip1);
		grip1.cubeList.add(new ModelBox(grip1, 63, 81, -0.002F, 0.1305F, 5.9914F, 3, 4, 1, 0.0F, false));

		grip7 = new ModelRenderer(this);
		grip7.setRotationPoint(0.2F, 0.0F, 0.0F);
		grip.addChild(grip7);
		setRotationAngle(grip7, 0.1309F, 0.0F, 0.0F);
		

		grip10 = new ModelRenderer(this);
		grip10.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip7.addChild(grip10);
		setRotationAngle(grip10, 0.2603F, 0.0F, 0.0F);
		grip10.cubeList.add(new ModelBox(grip10, 69, 60, 2.3F, 9.0F, -1.0F, 1, 1, 1, 0.0F, false));

		grip13 = new ModelRenderer(this);
		grip13.setRotationPoint(-3.5F, -27.5F, -7.0F);
		grip7.addChild(grip13);
		setRotationAngle(grip13, 1.041F, 0.0F, 0.0F);
		

		grip14 = new ModelRenderer(this);
		grip14.setRotationPoint(-3.5F, -35.9421F, -2.6803F);
		grip7.addChild(grip14);
		setRotationAngle(grip14, -0.48F, 0.0F, 0.0F);
		grip14.cubeList.add(new ModelBox(grip14, 58, 51, 2.299F, 2.8223F, 2.547F, 1, 2, 3, 0.0F, false));

		grip15 = new ModelRenderer(this);
		grip15.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip7.addChild(grip15);
		setRotationAngle(grip15, -2.6769F, 0.0F, 0.0F);
		grip15.cubeList.add(new ModelBox(grip15, 51, 34, 2.3F, -4.8492F, -0.5117F, 1, 10, 2, 0.0F, false));

		grip16 = new ModelRenderer(this);
		grip16.setRotationPoint(-3.5F, -24.1417F, -3.803F);
		grip7.addChild(grip16);
		setRotationAngle(grip16, -2.8078F, 0.0F, 0.0F);
		grip16.cubeList.add(new ModelBox(grip16, 0, 99, 2.301F, -4.8492F, -4.5117F, 1, 16, 6, 0.0F, false));

		grip17 = new ModelRenderer(this);
		grip17.setRotationPoint(-1.5F, -30.9726F, 7.7963F);
		grip7.addChild(grip17);
		setRotationAngle(grip17, -2.5165F, 0.0F, 0.0F);
		grip17.cubeList.add(new ModelBox(grip17, 0, 0, 0.3F, 3.7874F, 3.0476F, 1, 5, 4, 0.0F, false));

		grip18 = new ModelRenderer(this);
		grip18.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip7.addChild(grip18);
		setRotationAngle(grip18, 0.2603F, 0.0F, 0.0F);
		grip18.cubeList.add(new ModelBox(grip18, 16, 34, 2.3F, 8.0F, 0.0F, 1, 2, 6, 0.0F, false));

		grip19 = new ModelRenderer(this);
		grip19.setRotationPoint(-3.5F, -18.5F, -4.2F);
		grip7.addChild(grip19);
		setRotationAngle(grip19, 0.9295F, 0.0F, 0.0F);
		grip19.cubeList.add(new ModelBox(grip19, 51, 4, 2.3F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		grip20 = new ModelRenderer(this);
		grip20.setRotationPoint(-3.5F, -31.5F, -7.0F);
		grip7.addChild(grip20);
		grip20.cubeList.add(new ModelBox(grip20, 34, 68, 2.302F, 0.1305F, 5.9914F, 1, 4, 1, 0.0F, false));

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(-3.0F, -39.3F, -29.7F);
		action.addChild(bone74);
		setRotationAngle(bone74, 0.0F, 0.0F, 0.3142F);
		bone74.cubeList.add(new ModelBox(bone74, 98, 44, 0.0F, -0.05F, 1.0F, 1, 2, 9, 0.0F, false));

		bone92 = new ModelRenderer(this);
		bone92.setRotationPoint(-0.3F, -40.0F, -29.75F);
		action.addChild(bone92);
		setRotationAngle(bone92, 0.0F, 0.0F, 0.7854F);
		bone92.cubeList.add(new ModelBox(bone92, 37, 116, -1.4293F, 1.3435F, 1.0F, 1, 1, 9, 0.0F, false));

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.25F, -15.75F, 15.5F);
		gun.cubeList.add(new ModelBox(gun, 130, 45, -2.749F, 4.798F, -45.5533F, 3, 2, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 57, 34, -2.75F, -1.7087F, -48.1436F, 2, 5, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 8, -2.75F, 0.5894F, -48.1436F, 2, 5, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 63, 68, -1.8265F, 0.0653F, -48.1436F, 2, 4, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 13, 68, -3.6735F, 0.0653F, -48.1436F, 2, 4, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 18, -2.75F, -1.4587F, -15.1436F, 2, 8, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 184, 189, -0.2653F, 1.4454F, -48.1436F, 1, 2, 33, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 222, 0, -0.265F, 2.8454F, -48.1436F, 1, 1, 33, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 54, -0.265F, 3.9454F, -34.3436F, 1, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 25, -4.25F, 2.9454F, -34.3436F, 1, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 42, 46, -0.465F, 4.9454F, -31.8436F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 42, 38, -3.965F, 4.9454F, -31.8436F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 55, 222, -4.227F, 2.8454F, -48.1436F, 1, 1, 33, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 126, 68, -4.227F, 1.8454F, -44.1436F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 99, -0.4653F, 4.1454F, -31.1436F, 1, 1, 16, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 34, -3.9653F, 4.1454F, -31.1436F, 1, 1, 16, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 131, -4.2347F, 1.4454F, -35.1436F, 1, 2, 20, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 16, 57, -4.2347F, 1.4454F, -48.1436F, 1, 2, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 6, 0, -5.6989F, 2.552F, -47.1436F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 49, -5.4489F, 5.052F, -45.6436F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 34, -5.6989F, 5.302F, -45.6436F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 98, 29, -5.9489F, 5.052F, -45.6436F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 181, -6.1989F, 4.802F, -45.6436F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 69, 181, -5.1989F, 4.802F, -45.6436F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 186, 46, -5.4489F, 4.552F, -45.6436F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 186, 61, -5.9489F, 4.552F, -45.6436F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 144, 189, -5.6989F, 4.302F, -45.6436F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 75, 8, -5.6989F, 4.552F, -46.1436F, 1, 1, 1, 0.0F, false));

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(0.0F, -0.9587F, -15.1436F);
		gun.addChild(bone65);
		setRotationAngle(bone65, -0.1047F, 0.0F, 0.0F);
		bone65.cubeList.add(new ModelBox(bone65, 77, 74, -1.5F, 0.0F, 0.0F, 1, 2, 4, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 69, 60, -2.65F, -1.2536F, -0.0312F, 1, 2, 4, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 69, 41, -1.9F, -1.2543F, -0.0312F, 1, 2, 4, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 61, 29, -2.05F, -1.2383F, 3.7756F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 55, 34, -2.45F, -1.2393F, 3.7766F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 26, 61, -2.25F, -0.5361F, 3.7435F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 77, 68, -3.0F, 0.0F, 0.0F, 1, 2, 4, 0.0F, false));

		bone84 = new ModelRenderer(this);
		bone84.setRotationPoint(0.735F, 5.9454F, -34.3436F);
		gun.addChild(bone84);
		setRotationAngle(bone84, 0.7854F, 0.0F, 0.0F);
		bone84.cubeList.add(new ModelBox(bone84, 0, 34, -0.999F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		bone84.cubeList.add(new ModelBox(bone84, 48, 51, -0.999F, 0.1213F, 2.1214F, 1, 2, 3, 0.0F, false));
		bone84.cubeList.add(new ModelBox(bone84, 49, 18, -4.984F, 0.1213F, 2.1214F, 1, 2, 3, 0.0F, false));
		bone84.cubeList.add(new ModelBox(bone84, 33, 42, -4.984F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));
		bone84.cubeList.add(new ModelBox(bone84, 33, 46, -1.199F, 2.182F, 3.182F, 1, 1, 2, 0.0F, false));
		bone84.cubeList.add(new ModelBox(bone84, 25, 42, -4.699F, 2.182F, 3.182F, 1, 1, 2, 0.0F, false));

		bone78 = new ModelRenderer(this);
		bone78.setRotationPoint(0.735F, 3.9454F, -48.1436F);
		gun.addChild(bone78);
		setRotationAngle(bone78, 0.0F, 0.0F, 0.576F);
		bone78.cubeList.add(new ModelBox(bone78, 219, 219, -1.0545F, -0.0839F, 0.0F, 1, 1, 33, 0.0F, false));

		bone79 = new ModelRenderer(this);
		bone79.setRotationPoint(-4.265F, 3.9454F, -48.1436F);
		gun.addChild(bone79);
		setRotationAngle(bone79, 0.0F, 0.0F, -0.576F);
		bone79.cubeList.add(new ModelBox(bone79, 190, 154, 0.0915F, -0.0839F, 0.0F, 1, 1, 33, 0.0F, false));

		bone85 = new ModelRenderer(this);
		bone85.setRotationPoint(1.085F, 3.9454F, -48.1436F);
		gun.addChild(bone85);
		setRotationAngle(bone85, 0.0F, 0.0F, -0.5934F);
		bone85.cubeList.add(new ModelBox(bone85, 98, 153, -1.0F, -1.0F, 0.0F, 1, 1, 18, 0.0F, false));

		bone88 = new ModelRenderer(this);
		bone88.setRotationPoint(0.485F, 2.7454F, -48.1436F);
		gun.addChild(bone88);
		setRotationAngle(bone88, 0.0F, 0.0F, 0.7505F);
		bone88.cubeList.add(new ModelBox(bone88, 130, 23, -1.0F, -1.0F, 0.0F, 1, 1, 20, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-0.25F, 8.298F, -30.8533F);
		gun.addChild(bone5);
		setRotationAngle(bone5, -0.829F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 33, 0, -3.501F, -1.7439F, -5.6273F, 4, 5, 4, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-0.25F, 5.8785F, -45.4679F);
		gun.addChild(bone6);
		setRotationAngle(bone6, -1.2217F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 33, 9, -3.5F, -1.5855F, -2.2349F, 4, 2, 3, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-1.75F, 5.048F, -50.3533F);
		gun.addChild(bone8);
		setRotationAngle(bone8, -0.0175F, 0.7854F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 77, 76, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-0.25F, -0.5F, -29.5F);
		gun.addChild(bone11);
		setRotationAngle(bone11, -0.0087F, 0.0F, 0.0F);
		

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(bone71);
		bone71.cubeList.add(new ModelBox(bone71, 53, 42, -0.7F, 1.2914F, 14.3455F, 1, 4, 4, 0.0F, false));
		bone71.cubeList.add(new ModelBox(bone71, 69, 29, -0.4F, 0.9914F, 14.3429F, 1, 8, 2, 0.0F, false));
		bone71.cubeList.add(new ModelBox(bone71, 10, 34, -0.399F, 5.2993F, 13.4281F, 1, 2, 1, 0.0F, false));
		bone71.cubeList.add(new ModelBox(bone71, 10, 54, -0.399F, 4.987F, 15.8429F, 1, 4, 1, 0.0F, false));
		bone71.cubeList.add(new ModelBox(bone71, 33, 51, -3.3F, 1.2914F, 14.3455F, 1, 4, 4, 0.0F, false));

		bone83 = new ModelRenderer(this);
		bone83.setRotationPoint(0.6F, 4.9532F, 16.8439F);
		bone71.addChild(bone83);
		setRotationAngle(bone83, 1.693F, 0.0F, 0.0F);
		bone83.cubeList.add(new ModelBox(bone83, 33, 59, -0.999F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(0.3F, 1.2752F, 14.3117F);
		bone71.addChild(bone72);
		setRotationAngle(bone72, 0.0F, 0.0F, -0.925F);
		bone72.cubeList.add(new ModelBox(bone72, 63, 75, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		bone81 = new ModelRenderer(this);
		bone81.setRotationPoint(-3.3F, 1.2752F, 14.3117F);
		bone71.addChild(bone81);
		setRotationAngle(bone81, 0.0F, 0.0F, 0.925F);
		bone81.cubeList.add(new ModelBox(bone81, 69, 6, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-0.25F, 7.4924F, -11.5F);
		gun.addChild(bone19);
		setRotationAngle(bone19, 0.0785F, 0.0F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 130, 0, -3.5F, -4.5F, -21.0F, 4, 5, 18, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 0, 34, -2.699F, -3.5F, -3.0F, 3, 4, 4, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 16, 49, -3.299F, -3.5F, -3.0F, 1, 4, 4, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-3.25F, 10.2042F, -36.4637F);
		gun.addChild(bone25);
		setRotationAngle(bone25, -0.2618F, 0.0F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 0, 68, -0.502F, -5.727F, -9.7246F, 1, 6, 11, 0.0F, false));

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(-0.9691F, -1.402F, -30.1565F);
		gun.addChild(bone62);
		setRotationAngle(bone62, 0.0F, 0.0F, -0.48F);
		bone62.cubeList.add(new ModelBox(bone62, 60, 0, -0.6641F, -0.1708F, -17.9871F, 1, 2, 2, 0.0F, false));
		bone62.cubeList.add(new ModelBox(bone62, 26, 20, -0.6641F, -0.1708F, -15.9871F, 1, 4, 1, 0.0F, false));

		bone90 = new ModelRenderer(this);
		bone90.setRotationPoint(0.297F, 3.4707F, -16.9871F);
		bone62.addChild(bone90);
		setRotationAngle(bone90, -0.6109F, 0.0F, 0.0F);
		bone90.cubeList.add(new ModelBox(bone90, 33, 0, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone91 = new ModelRenderer(this);
		bone91.setRotationPoint(0.297F, 3.4707F, -13.9871F);
		bone62.addChild(bone91);
		setRotationAngle(bone91, 0.6109F, 0.0F, 0.0F);
		bone91.cubeList.add(new ModelBox(bone91, 26, 0, -1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(-1.1332F, -0.5729F, -46.6436F);
		gun.addChild(bone66);
		setRotationAngle(bone66, 0.0F, 0.0F, 0.48F);
		bone66.cubeList.add(new ModelBox(bone66, 39, 59, -1.9586F, -0.2609F, -1.5F, 1, 2, 2, 0.0F, false));
		bone66.cubeList.add(new ModelBox(bone66, 26, 15, -1.9586F, -0.2609F, 0.5F, 1, 4, 1, 0.0F, false));

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(0.8668F, 1.4271F, -46.6436F);
		gun.addChild(bone67);
		setRotationAngle(bone67, 0.0F, 0.0F, -1.0908F);
		bone67.cubeList.add(new ModelBox(bone67, 190, 119, -1.0772F, -2.1088F, -1.5F, 1, 2, 33, 0.0F, false));

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(0.8668F, 5.4271F, -46.6436F);
		gun.addChild(bone68);
		setRotationAngle(bone68, 0.0F, 0.0F, 1.0908F);
		bone68.cubeList.add(new ModelBox(bone68, 33, 0, -1.8164F, -0.5579F, -1.5F, 1, 2, 16, 0.0F, false));

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(-1.1332F, 7.4271F, -46.6436F);
		gun.addChild(bone69);
		setRotationAngle(bone69, 0.0F, 0.0F, 0.48F);
		bone69.cubeList.add(new ModelBox(bone69, 69, 14, -1.5087F, -3.807F, -1.5F, 1, 2, 3, 0.0F, false));

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(-0.9691F, -1.402F, -30.1565F);
		gun.addChild(bone70);
		setRotationAngle(bone70, 0.0F, 0.0F, -0.48F);
		bone70.cubeList.add(new ModelBox(bone70, 59, 18, -4.808F, 3.3791F, -17.9871F, 1, 2, 3, 0.0F, false));

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(-0.5F, 14.248F, -21.1533F);
		gun.addChild(bone73);
		setRotationAngle(bone73, 1.309F, 0.0F, 0.0F);
		bone73.cubeList.add(new ModelBox(bone73, 39, 51, 0.25F, -5.3437F, 5.0508F, 1, 2, 2, 0.0F, false));
		bone73.cubeList.add(new ModelBox(bone73, 16, 0, 0.0F, -6.874F, 5.5811F, 1, 2, 1, 0.0F, false));
		bone73.cubeList.add(new ModelBox(bone73, 75, 34, 0.25F, -7.5205F, 5.5811F, 1, 1, 1, 0.0F, false));

		bone75 = new ModelRenderer(this);
		bone75.setRotationPoint(-4.3668F, 1.4271F, -46.6436F);
		gun.addChild(bone75);
		setRotationAngle(bone75, 0.0F, 0.0F, 1.0908F);
		bone75.cubeList.add(new ModelBox(bone75, 98, 131, 0.0772F, -2.1088F, 11.5F, 1, 2, 20, 0.0F, false));
		bone75.cubeList.add(new ModelBox(bone75, 69, 0, 0.0772F, -2.1088F, -1.5F, 1, 2, 4, 0.0F, false));

		bone77 = new ModelRenderer(this);
		bone77.setRotationPoint(-4.0F, 6.048F, -31.8533F);
		gun.addChild(bone77);
		setRotationAngle(bone77, -0.7854F, 0.0F, 0.0F);
		bone77.cubeList.add(new ModelBox(bone77, 75, 62, 0.0F, -0.6768F, 1.7374F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 75, 41, 3.5F, -0.3939F, 1.4546F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 75, 60, 0.0F, -1.5607F, 3.682F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 75, 36, 3.5F, -1.2778F, 3.3991F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 59, 23, 0.75F, -17.6827F, 7.6418F, 3, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 42, 34, 3.5F, -16.6927F, 9.056F, 1, 2, 2, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 75, 6, 0.0F, -12.1673F, 11.4602F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 75, 2, 3.5F, -12.8744F, 12.1673F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 75, 43, 0.0F, -4.2123F, 5.273F, 1, 1, 1, 0.0F, false));

		bone76 = new ModelRenderer(this);
		bone76.setRotationPoint(-0.5F, 6.048F, -32.0533F);
		gun.addChild(bone76);
		setRotationAngle(bone76, -0.7854F, 0.0F, 0.0F);
		bone76.cubeList.add(new ModelBox(bone76, 51, 0, 0.0F, 0.5607F, -0.5F, 1, 2, 2, 0.0F, false));
		bone76.cubeList.add(new ModelBox(bone76, 42, 42, -3.5F, 0.5607F, -0.5F, 1, 2, 2, 0.0F, false));

		bone80 = new ModelRenderer(this);
		bone80.setRotationPoint(-1.3832F, -0.5729F, -47.6436F);
		gun.addChild(bone80);
		setRotationAngle(bone80, 0.0F, 0.0F, 0.5236F);
		bone80.cubeList.add(new ModelBox(bone80, 26, 9, -2.1751F, -0.1359F, 0.5F, 1, 5, 1, 0.0F, false));

		bone82 = new ModelRenderer(this);
		bone82.setRotationPoint(-1.2191F, -1.652F, -40.1565F);
		gun.addChild(bone82);
		setRotationAngle(bone82, -0.0087F, 0.0F, 0.3491F);
		bone82.cubeList.add(new ModelBox(bone82, 0, 0, -1.5893F, 1.0768F, -4.9733F, 1, 3, 1, 0.0F, false));

		trigger = new ModelRenderer(this);
		trigger.setRotationPoint(-0.25F, 39.75F, -15.5F);
		gun.addChild(trigger);
		trigger.cubeList.add(new ModelBox(trigger, 33, 34, -2.5F, -31.452F, -17.9524F, 2, 4, 1, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 24, 34, -3.5F, -32.952F, -19.8024F, 1, 4, 2, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 10, 49, -3.502F, -32.952F, -18.3024F, 1, 4, 1, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 16, 34, -0.5F, -32.952F, -19.8024F, 1, 4, 2, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 58, 60, -3.0F, -30.952F, -12.1033F, 3, 3, 1, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 49, 27, -3.0F, -27.6008F, -14.5779F, 3, 1, 2, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 10, 28, -3.0F, -27.6008F, -16.3279F, 3, 1, 2, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 79, 81, -2.05F, -31.2434F, -14.0084F, 1, 1, 1, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, -8.75F, -4.0F);
		trigger.addChild(bone20);
		bone20.cubeList.add(new ModelBox(bone20, 49, 23, -3.0F, -21.202F, -13.8024F, 3, 2, 1, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-1.5F, -30.452F, -15.8024F);
		trigger.addChild(bone21);
		setRotationAngle(bone21, -1.0472F, 0.0F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 59, 42, -1.5F, -1.0179F, -0.567F, 3, 3, 1, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-1.25F, -30.702F, -18.5524F);
		trigger.addChild(bone22);
		setRotationAngle(bone22, 0.0F, 0.0F, -0.2182F);
		bone22.cubeList.add(new ModelBox(bone22, 61, 11, -1.0F, -1.5F, -0.5F, 2, 3, 1, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-0.25F, -30.702F, -19.0524F);
		trigger.addChild(bone24);
		setRotationAngle(bone24, -0.1309F, 0.0F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 75, 29, -2.25F, -2.5326F, -0.2521F, 1, 4, 1, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.75F, -30.702F, -18.5524F);
		trigger.addChild(bone23);
		setRotationAngle(bone23, 0.0F, 0.0F, 0.0873F);
		bone23.cubeList.add(new ModelBox(bone23, 33, 39, -1.5F, 0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.2F, -23.848F, -11.8033F);
		trigger.addChild(bone2);
		setRotationAngle(bone2, 0.829F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 48, 56, -3.2F, -7.1957F, -1.0271F, 3, 2, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.2F, -25.152F, -11.8033F);
		trigger.addChild(bone);
		setRotationAngle(bone, -0.829F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 58, 8, -3.2F, -2.4077F, -2.5915F, 3, 2, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.2F, -29.902F, -13.5533F);
		trigger.addChild(bone4);
		setRotationAngle(bone4, -1.0472F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 78, 65, -2.25F, 0.7716F, 0.391F, 1, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.2F, -29.902F, -13.5533F);
		trigger.addChild(bone3);
		setRotationAngle(bone3, -0.2618F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 69, 41, -2.25F, -0.4708F, -0.562F, 1, 2, 1, 0.0F, false));

		mainbarrel = new ModelRenderer(this);
		mainbarrel.setRotationPoint(-1.5F, 3.75F, -94.5F);
		gun.addChild(mainbarrel);
		

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 0.0F, 0.0F);
		mainbarrel.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 0, 130, -0.5F, -1.5F, -10.0F, 1, 1, 50, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 126, 60, -0.25F, -1.25F, -22.0F, 1, 1, 58, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 68, -1.25F, -1.25F, -23.0F, 1, 1, 61, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 104, 177, -0.5F, -1.0F, -22.0F, 1, 1, 38, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 0, -0.75F, -1.75F, -22.0F, 1, 1, 67, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 186, 89, -0.75F, -2.0F, -31.0F, 1, 1, 22, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 33, 18, -1.25F, -3.25F, 36.0F, 2, 1, 12, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 83, 68, -0.75F, -2.0F, 0.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 165, 119, -0.25F, -1.75F, -31.0F, 1, 1, 22, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 33, 51, 0.25F, -2.75F, 35.0F, 1, 1, 13, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 83, 74, -0.25F, -1.75F, 0.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 153, 0.0F, -1.25F, -31.0F, 1, 1, 22, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 69, 0, 0.5F, -2.25F, 37.0F, 1, 3, 11, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 75, 84, 0.0F, -1.25F, 0.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 126, 83, -0.75F, -0.5F, -31.0F, 1, 1, 22, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 69, 14, -1.25F, 0.5F, 42.0F, 2, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 82, 14, -0.75F, -0.5F, 0.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 77, 74, -0.75F, -0.25F, 1.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 22, 49, -0.75F, -0.25F, -12.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 69, 6, -0.75F, -2.5F, -10.0F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 126, 60, -1.25F, -0.75F, -31.0F, 1, 1, 22, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 104, 177, -1.75F, 0.25F, 34.0F, 1, 1, 15, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 82, 17, -1.25F, -0.75F, 0.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 99, -0.25F, -0.75F, -31.0F, 1, 1, 22, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 63, 68, 0.25F, 0.25F, 37.0F, 1, 1, 12, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 82, 6, -0.25F, -0.75F, 0.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 130, -1.5F, -1.25F, -31.0F, 1, 1, 22, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 68, -2.0F, -2.25F, 35.0F, 1, 3, 13, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 82, 20, -1.5F, -1.25F, 0.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 63, 69, -0.75F, -0.75F, -23.0F, 1, 1, 61, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 69, 0, -1.0F, -1.5F, -22.0F, 1, 1, 59, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 45, 181, -1.25F, -1.75F, -31.0F, 1, 1, 22, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 84, -1.75F, -2.75F, 38.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 82, 53, -1.25F, -1.75F, 0.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 147, 189, -1.0F, -1.0F, -23.0F, 1, 1, 35, 0.0F, false));

		mainbarrel2 = new ModelRenderer(this);
		mainbarrel2.setRotationPoint(0.0F, -3.5F, 36.0F);
		mainbarrel.addChild(mainbarrel2);
		

		barrel2 = new ModelRenderer(this);
		barrel2.setRotationPoint(0.0F, -0.25F, 0.0F);
		mainbarrel2.addChild(barrel2);
		barrel2.cubeList.add(new ModelBox(barrel2, 58, 177, -0.5F, -1.5F, -31.0F, 1, 1, 44, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 176, 1, -0.35F, -1.25F, -31.0F, 1, 1, 44, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 144, 144, -1.15F, -1.25F, -31.0F, 1, 1, 44, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 98, 132, -0.5F, -1.0F, -31.0F, 1, 1, 44, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 186, 46, -0.75F, -1.65F, -31.0F, 1, 1, 42, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 52, 131, -0.75F, -0.85F, -31.0F, 1, 1, 44, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 130, 0, -1.0F, -1.5F, -31.0F, 1, 1, 44, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 0, 181, -1.0F, -1.0F, -31.0F, 1, 1, 43, 0.0F, false));

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(0.0F, 24.0F, 0.0F);
		dustcover.cubeList.add(new ModelBox(dustcover, 258, 78, -2.0F, -41.1087F, -29.647F, 1, 1, 30, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 257, 0, -1.3F, -40.4087F, -29.647F, 1, 1, 30, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 34, 256, -2.7F, -40.4087F, -29.647F, 1, 1, 30, 0.0F, false));

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(-1.0F, -41.1F, -29.6F);
		dustcover.addChild(bone60);
		setRotationAngle(bone60, 0.0F, 0.0F, 0.7854F);
		bone60.cubeList.add(new ModelBox(bone60, 126, 258, 0.0F, 0.0F, 0.0F, 1, 1, 30, 0.0F, false));
		bone60.cubeList.add(new ModelBox(bone60, 257, 186, -0.7071F, 0.7071F, 0.0F, 1, 1, 30, 0.0F, false));

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(-0.5F, -40.0F, -29.75F);
		dustcover.addChild(bone61);
		setRotationAngle(bone61, 0.0F, 0.0F, 0.7854F);
		bone61.cubeList.add(new ModelBox(bone61, 254, 219, 0.0F, 0.0F, 0.0F, 1, 1, 30, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 52, 153, -1.4293F, 1.3435F, 10.0F, 1, 1, 20, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 92, 113, -1.4293F, 0.85F, 1.0F, 1, 1, 9, 0.0F, false));

		bone89 = new ModelRenderer(this);
		bone89.setRotationPoint(-0.4293F, 2.3435F, 10.0F);
		bone61.addChild(bone89);
		setRotationAngle(bone89, 1.1694F, 0.0F, 0.0F);
		bone89.cubeList.add(new ModelBox(bone89, 33, 18, -1.0007F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(0.2F, -39.3F, -29.7F);
		dustcover.addChild(bone63);
		setRotationAngle(bone63, 0.0F, 0.0F, -0.3142F);
		bone63.cubeList.add(new ModelBox(bone63, 228, 253, -1.0F, 0.0F, 0.0F, 1, 1, 30, 0.0F, false));

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(-3.2F, -39.3F, -29.7F);
		dustcover.addChild(bone64);
		setRotationAngle(bone64, 0.0F, 0.0F, 0.3142F);
		bone64.cubeList.add(new ModelBox(bone64, 144, 144, 0.0F, -0.05F, 10.0F, 1, 1, 20, 0.0F, false));

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguard.cubeList.add(new ModelBox(handguard, 225, 89, -2.0F, -41.9587F, -66.5436F, 1, 2, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 222, -3.7351F, -35.6034F, -66.5436F, 4, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 219, 188, -3.5F, -35.4494F, -65.7533F, 4, 1, 30, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 162, 227, -0.2649F, -35.6034F, -66.5436F, 1, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 126, 83, -3.5F, -39.4535F, -72.5382F, 4, 4, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 79, 60, -3.5F, -39.5777F, -73.3147F, 4, 4, 1, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-11.0F, -50.7087F, -54.0436F);
		handguard.addChild(bone31);
		setRotationAngle(bone31, 0.0F, 0.0F, -0.2182F);
		bone31.cubeList.add(new ModelBox(bone31, 0, 0, 7.5447F, 14.4443F, -12.5F, 1, 3, 31, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 77, 57, 7.5447F, 13.4443F, -12.5F, 1, 1, 1, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 150, 60, 7.5447F, 13.4443F, 2.5F, 1, 1, 16, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 0, 34, 7.5447F, 11.4443F, -12.5F, 1, 2, 31, 0.0F, false));

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(8.0447F, 13.9443F, -6.0F);
		bone31.addChild(bone41);
		setRotationAngle(bone41, -0.7854F, 0.0F, 0.0F);
		bone41.cubeList.add(new ModelBox(bone41, 254, 295, -0.5007F, 0.7071F, -1.4142F, 1, 2, 2, 0.0F, false));

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(8.0447F, 13.9443F, -6.0F);
		bone31.addChild(bone43);
		setRotationAngle(bone43, -0.7854F, 0.0F, 0.0F);
		bone43.cubeList.add(new ModelBox(bone43, 81, 41, -0.5007F, 0.0F, -0.7071F, 1, 1, 2, 0.0F, false));

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(8.0447F, 13.9443F, -6.0F);
		bone31.addChild(bone44);
		setRotationAngle(bone44, -0.7854F, 0.0F, 0.0F);
		bone44.cubeList.add(new ModelBox(bone44, 254, 295, -0.5007F, -2.8284F, 2.1213F, 1, 2, 2, 0.0F, false));

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(8.0447F, 13.9443F, -6.0F);
		bone31.addChild(bone45);
		setRotationAngle(bone45, -0.7854F, 0.0F, 0.0F);
		bone45.cubeList.add(new ModelBox(bone45, 81, 81, -0.5007F, -3.5355F, 2.8284F, 1, 1, 2, 0.0F, false));

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(8.0447F, 13.9443F, -6.0F);
		bone31.addChild(bone46);
		setRotationAngle(bone46, -0.7854F, 0.0F, 0.0F);
		bone46.cubeList.add(new ModelBox(bone46, 10, 59, -0.5007F, -6.364F, 5.6569F, 1, 2, 1, 0.0F, false));

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(8.0447F, 13.9443F, -6.0F);
		bone31.addChild(bone47);
		setRotationAngle(bone47, -0.7854F, 0.0F, 0.0F);
		bone47.cubeList.add(new ModelBox(bone47, 75, 81, -0.5007F, -6.6569F, 4.364F, 1, 1, 2, 0.0F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(8.0447F, 13.9443F, -6.0F);
		bone31.addChild(bone48);
		setRotationAngle(bone48, -0.7854F, 0.0F, 0.0F);
		bone48.cubeList.add(new ModelBox(bone48, 243, 296, -0.5007F, -4.8284F, 1.5355F, 1, 2, 2, 0.0F, false));

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(8.0447F, 13.9443F, -6.0F);
		bone31.addChild(bone49);
		setRotationAngle(bone49, -0.7854F, 0.0F, 0.0F);
		bone49.cubeList.add(new ModelBox(bone49, 69, 75, -0.5007F, -3.1213F, 0.8284F, 1, 1, 2, 0.0F, false));

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(8.0447F, 13.9443F, -6.0F);
		bone31.addChild(bone50);
		setRotationAngle(bone50, -0.7854F, 0.0F, 0.0F);
		bone50.cubeList.add(new ModelBox(bone50, 243, 296, -0.5007F, -1.2929F, -2.0F, 1, 2, 2, 0.0F, false));

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(8.0447F, 13.9443F, -6.0F);
		bone31.addChild(bone51);
		setRotationAngle(bone51, -0.7854F, 0.0F, 0.0F);
		bone51.cubeList.add(new ModelBox(bone51, 19, 75, -0.5007F, 0.4142F, -2.7071F, 1, 1, 2, 0.0F, false));

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(8.0447F, 13.9443F, -6.0F);
		bone31.addChild(bone52);
		setRotationAngle(bone52, -0.7854F, 0.0F, 0.0F);
		bone52.cubeList.add(new ModelBox(bone52, 27, 49, -0.5007F, 2.2426F, -4.5355F, 1, 2, 1, 0.0F, false));

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(8.0447F, 13.9443F, -6.0F);
		bone31.addChild(bone42);
		setRotationAngle(bone42, -0.7854F, 0.0F, 0.0F);
		bone42.cubeList.add(new ModelBox(bone42, 81, 44, -0.5007F, 3.5355F, -4.2426F, 1, 1, 2, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-3.5F, -41.25F, -57.9F);
		handguard.addChild(bone29);
		setRotationAngle(bone29, 0.0F, 0.0F, -0.9599F);
		bone29.cubeList.add(new ModelBox(bone29, 230, 46, 1.0145F, 1.6414F, -8.6436F, 1, 1, 31, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-3.5F, -41.25F, -57.9F);
		handguard.addChild(bone28);
		setRotationAngle(bone28, 0.0F, 0.0F, 0.9599F);
		bone28.cubeList.add(new ModelBox(bone28, 92, 254, 0.2799F, -1.6352F, -8.6436F, 1, 1, 31, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-0.3327F, -40.1446F, -51.0393F);
		handguard.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.0F, 0.2182F);
		bone27.cubeList.add(new ModelBox(bone27, 0, 225, -2.696F, 2.327F, -15.5043F, 1, 3, 31, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 77, 70, -2.696F, 1.327F, -15.5043F, 1, 1, 1, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 4, 77, -2.696F, 1.327F, -10.5043F, 1, 1, 1, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 77, 68, -2.696F, 1.327F, -5.5043F, 1, 1, 1, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 150, 83, -2.696F, 1.327F, -0.5043F, 1, 1, 16, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 129, 225, -2.696F, -0.673F, -15.5043F, 1, 2, 31, 0.0F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(-2.196F, 1.827F, -6.0043F);
		bone27.addChild(bone35);
		setRotationAngle(bone35, 0.7854F, 0.0F, 0.0F);
		bone35.cubeList.add(new ModelBox(bone35, 69, 0, -0.5001F, -2.8284F, -3.1213F, 1, 2, 1, 0.0F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(-2.196F, 1.827F, -6.0043F);
		bone27.addChild(bone37);
		setRotationAngle(bone37, 0.7854F, 0.0F, 0.0F);
		bone37.cubeList.add(new ModelBox(bone37, 63, 51, -0.5001F, 0.7071F, 0.4142F, 1, 2, 1, 0.0F, false));

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(-2.196F, 1.827F, -6.0043F);
		bone27.addChild(bone38);
		setRotationAngle(bone38, 0.7854F, 0.0F, 0.0F);
		bone38.cubeList.add(new ModelBox(bone38, 82, 3, -0.5001F, 3.5355F, 2.2426F, 1, 1, 2, 0.0F, false));

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(-2.196F, 1.827F, -6.0043F);
		bone27.addChild(bone53);
		setRotationAngle(bone53, 0.7854F, 0.0F, 0.0F);
		bone53.cubeList.add(new ModelBox(bone53, 16, 49, -0.5001F, 2.2426F, 3.5355F, 1, 2, 1, 0.0F, false));

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(-2.196F, 1.827F, -10.0043F);
		bone27.addChild(bone54);
		setRotationAngle(bone54, 0.7854F, 0.0F, 0.0F);
		bone54.cubeList.add(new ModelBox(bone54, 46, 70, -0.5001F, 3.2426F, 3.5355F, 1, 1, 2, 0.0F, false));

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(-2.196F, 1.827F, -15.0043F);
		bone27.addChild(bone55);
		setRotationAngle(bone55, 0.7854F, 0.0F, 0.0F);
		bone55.cubeList.add(new ModelBox(bone55, 20, 68, -0.5001F, 3.2426F, 3.5355F, 1, 1, 2, 0.0F, false));

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(-2.196F, 1.827F, -20.0043F);
		bone27.addChild(bone56);
		setRotationAngle(bone56, 0.7854F, 0.0F, 0.0F);
		bone56.cubeList.add(new ModelBox(bone56, 60, 4, -0.5001F, 3.2426F, 3.5355F, 1, 1, 2, 0.0F, false));

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(-2.196F, 1.827F, -16.0043F);
		bone27.addChild(bone57);
		setRotationAngle(bone57, 0.7854F, 0.0F, 0.0F);
		bone57.cubeList.add(new ModelBox(bone57, 45, 0, -0.5001F, 2.2426F, 3.5355F, 1, 2, 1, 0.0F, false));

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(-2.196F, 1.827F, -11.0043F);
		bone27.addChild(bone58);
		setRotationAngle(bone58, 0.7854F, 0.0F, 0.0F);
		bone58.cubeList.add(new ModelBox(bone58, 44, 9, -0.5001F, 2.2426F, 3.5355F, 1, 2, 1, 0.0F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-2.196F, 1.827F, -6.0043F);
		bone27.addChild(bone39);
		setRotationAngle(bone39, 0.7854F, 0.0F, 0.0F);
		bone39.cubeList.add(new ModelBox(bone39, 82, 0, -0.5001F, 0.0F, -1.2929F, 1, 1, 2, 0.0F, false));

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(-2.196F, 1.827F, -6.0043F);
		bone27.addChild(bone40);
		setRotationAngle(bone40, 0.7854F, 0.0F, 0.0F);
		bone40.cubeList.add(new ModelBox(bone40, 81, 47, -0.5001F, -3.5355F, -4.8284F, 1, 1, 2, 0.0F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(-2.196F, 1.827F, -6.0043F);
		bone27.addChild(bone36);
		setRotationAngle(bone36, 0.7854F, 0.0F, 0.0F);
		bone36.cubeList.add(new ModelBox(bone36, 57, 68, -0.5001F, -6.364F, -6.6569F, 1, 2, 1, 0.0F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-3.9099F, -35.6584F, -51.2495F);
		handguard.addChild(bone30);
		setRotationAngle(bone30, 0.0F, 0.0F, 1.1781F);
		bone30.cubeList.add(new ModelBox(bone30, 195, 253, 0.0416F, -0.7578F, -15.2941F, 1, 1, 31, 0.0F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(3.9099F, -35.6584F, -51.2495F);
		handguard.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, -1.1781F);
		bone32.cubeList.add(new ModelBox(bone32, 225, 154, -2.1896F, -3.5294F, -15.2941F, 1, 1, 31, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -34.952F, -34.6033F);
		handguard.addChild(bone7);
		setRotationAngle(bone7, -0.0175F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 42, 99, -2.7929F, -0.243F, -38.7041F, 2, 1, 7, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 51, 0, -1.2071F, -0.243F, -38.7041F, 1, 1, 7, 0.0F, false));

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(0.25F, -1.9489F, -35.4519F);
		bone7.addChild(bone59);
		setRotationAngle(bone59, 0.7854F, 0.0F, 0.0F);
		bone59.cubeList.add(new ModelBox(bone59, 0, 77, -0.5F, -1.0395F, 0.021F, 1, 1, 1, 0.0F, false));
		bone59.cubeList.add(new ModelBox(bone59, 7, 76, -4.0F, -1.0395F, 0.021F, 1, 1, 1, 0.0F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(1.0F, -25.9494F, -69.2533F);
		handguard.addChild(bone34);
		setRotationAngle(bone34, 0.0F, 0.0F, 0.7854F);
		bone34.cubeList.add(new ModelBox(bone34, 49, 18, -8.1618F, -6.4547F, -4.0614F, 1, 1, 8, 0.0F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-2.0F, -25.9494F, -69.2533F);
		handguard.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, 0.7854F);
		bone33.cubeList.add(new ModelBox(bone33, 48, 51, -7.8689F, -6.7476F, -4.0614F, 1, 1, 8, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -40.952F, -72.3533F);
		handguard.addChild(bone10);
		setRotationAngle(bone10, 0.5672F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 0, 61, -3.5F, 0.6425F, -1.5493F, 4, 1, 1, 0.0F, false));

		actionlever = new ModelRenderer(this);
		actionlever.setRotationPoint(0.0F, 24.0F, 0.0F);
		actionlever.cubeList.add(new ModelBox(actionlever, 176, 0, 0.535F, -37.0046F, -30.444F, 1, 1, 15, 0.0F, false));
		actionlever.cubeList.add(new ModelBox(actionlever, 176, 16, 0.5347F, -37.6046F, -30.4436F, 1, 1, 15, 0.0F, false));
		actionlever.cubeList.add(new ModelBox(actionlever, 63, 75, 1.0347F, -37.6046F, -30.6436F, 1, 1, 1, 0.0F, false));
		actionlever.cubeList.add(new ModelBox(actionlever, 74, 14, 1.035F, -37.0046F, -30.6436F, 1, 1, 1, 0.0F, false));

		Bolt = new ModelRenderer(this);
		Bolt.setRotationPoint(12.8F, -35.75F, -14.0F);
		actionlever.addChild(Bolt);
		Bolt.cubeList.add(new ModelBox(Bolt, 13, 75, -10.7653F, -1.9546F, -18.1436F, 3, 1, 1, 0.0F, false));
		Bolt.cubeList.add(new ModelBox(Bolt, 75, 0, -11.7653F, -1.5546F, -18.1436F, 1, 1, 1, 0.0F, false));
		Bolt.cubeList.add(new ModelBox(Bolt, 0, 75, -10.7653F, -1.8046F, -18.3936F, 3, 1, 1, 0.0F, false));
		Bolt.cubeList.add(new ModelBox(Bolt, 69, 57, -10.7653F, -1.5546F, -18.5436F, 3, 1, 1, 0.0F, false));
		Bolt.cubeList.add(new ModelBox(Bolt, 69, 54, -10.7653F, -1.3046F, -18.3936F, 3, 1, 1, 0.0F, false));
		Bolt.cubeList.add(new ModelBox(Bolt, 69, 52, -10.7653F, -1.1546F, -18.1436F, 3, 1, 1, 0.0F, false));
		Bolt.cubeList.add(new ModelBox(Bolt, 69, 21, -10.7653F, -1.3046F, -17.8936F, 3, 1, 1, 0.0F, false));
		Bolt.cubeList.add(new ModelBox(Bolt, 69, 19, -10.7653F, -1.8046F, -17.8936F, 3, 1, 1, 0.0F, false));
		Bolt.cubeList.add(new ModelBox(Bolt, 46, 68, -10.7653F, -1.5546F, -17.7436F, 3, 1, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(2.3F, -36.6F, -28.85F);
		actionlever.addChild(bone9);
		setRotationAngle(bone9, 0.0F, -0.5585F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 70, 68, -1.6359F, -1.0F, -0.546F, 1, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 69, 62, -1.6349F, -0.4F, -0.546F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		mag.render(f5);
//		stock.render(f5);
//		grip.render(f5);
//		action.render(f5);
//		gun.render(f5);
//		dustcover.render(f5);
//		handguard.render(f5);
		actionlever.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
