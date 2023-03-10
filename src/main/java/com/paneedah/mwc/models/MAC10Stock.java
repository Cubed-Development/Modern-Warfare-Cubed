package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class MAC10Stock extends ModelWithAttachments {
	private final ModelRenderer grip;
	private final ModelRenderer bone8;
	private final ModelRenderer bone7;
	private final ModelRenderer bone6;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer body;
	private final ModelRenderer bone18;
	private final ModelRenderer bone9;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer frontsight;
	private final ModelRenderer bone78;
	private final ModelRenderer bone79;
	private final ModelRenderer stock;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone27;
	private final ModelRenderer bone24;
	private final ModelRenderer action;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer mag;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer extendedmag;
	private final ModelRenderer bone30;
	private final ModelRenderer bone31;
	private final ModelRenderer ARstockAdapter;
	private final ModelRenderer M10_45_body;
	private final ModelRenderer bone32;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone39;
	private final ModelRenderer frontsight2;
	private final ModelRenderer bone80;
	private final ModelRenderer bone81;
	private final ModelRenderer M10_45_Action;
	private final ModelRenderer MAX10_Mk2_Grip;
	private final ModelRenderer bone33;
	private final ModelRenderer bone40;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone45;
	private final ModelRenderer bone46;
	private final ModelRenderer MPA_30_body;
	private final ModelRenderer bone58;
	private final ModelRenderer bone57;
	private final ModelRenderer bone56;
	private final ModelRenderer bone47;
	private final ModelRenderer bone53;
	private final ModelRenderer bone52;
	private final ModelRenderer bone54;
	private final ModelRenderer bone48;
	private final ModelRenderer bone55;
	private final ModelRenderer bone49;
	private final ModelRenderer bone50;
	private final ModelRenderer bone51;
	private final ModelRenderer frontsight3;
	private final ModelRenderer bone82;
	private final ModelRenderer bone83;
	private final ModelRenderer MAX11_body;
	private final ModelRenderer bone65;
	private final ModelRenderer bone59;
	private final ModelRenderer bone67;
	private final ModelRenderer bone66;
	private final ModelRenderer bone61;
	private final ModelRenderer bone60;
	private final ModelRenderer bone62;
	private final ModelRenderer bone63;
	private final ModelRenderer bone64;
	private final ModelRenderer MAX11_action;
	private final ModelRenderer MAX11_stock;
	private final ModelRenderer bone74;
	private final ModelRenderer bone75;
	private final ModelRenderer bone76;
	private final ModelRenderer bone77;
	private final ModelRenderer bone73;
	private final ModelRenderer bone69;
	private final ModelRenderer bone70;
	private final ModelRenderer bone71;
	private final ModelRenderer bone72;
	private final ModelRenderer bone68;

	public MAC10Stock() {
		textureWidth = 150;
		textureHeight = 150;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(-3.5F, -7.5F, -7.0F);
		grip.cubeList.add(new ModelBox(grip, 34, 40, -0.5F, 0.0F, 0.0F, 5, 14, 6, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 40, 0.0F, -0.001F, -0.5F, 4, 14, 7, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 59, 21, 0.0F, 4.5F, -7.5F, 4, 1, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 47, 17, 0.0F, -0.9F, -8.9F, 4, 5, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 75, 67, 0.0F, 0.0F, 6.5F, 4, 1, 3, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(4.0F, 2.8F, -4.6F);
		grip.addChild(bone8);
		setRotationAngle(bone8, -0.2793F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 20, 7, -3.0F, -5.0F, 0.0F, 2, 5, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(4.0F, 5.5F, -7.5F);
		grip.addChild(bone7);
		setRotationAngle(bone7, -0.7854F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 79, 15, -4.0F, -1.0F, -2.0F, 4, 1, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(4.0F, 5.5F, -2.5F);
		grip.addChild(bone6);
		setRotationAngle(bone6, 0.5236F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 18, 30, -3.999F, -1.0F, 0.0F, 4, 1, 3, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(3.5F, 13.8F, 8.5F);
		grip.addChild(bone);
		setRotationAngle(bone, 0.0698F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 65, 0, -3.5F, -5.0F, -2.0F, 4, 5, 2, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(3.5F, 1.0F, 9.5F);
		grip.addChild(bone3);
		setRotationAngle(bone3, 0.7156F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 15, 40, -3.51F, -2.0F, -4.0F, 4, 2, 4, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(3.5F, 8.8F, 8.1F);
		grip.addChild(bone2);
		setRotationAngle(bone2, 0.5061F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 79, 0, -3.51F, -4.0F, -2.0F, 4, 4, 2, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(1.0F, -7.5F, -25.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -5.5F, -5.0F, -1.0F, 6, 5, 35, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 30, -5.0F, -3.0F, 7.75F, 6, 1, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 24, 74, -5.499F, -9.95F, 33.001F, 6, 6, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 20, 0, -5.499F, -10.25F, 29.001F, 6, 6, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 47, 0, -0.75F, -9.5F, -1.0F, 1, 5, 30, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 92, 46, -0.35F, -8.5F, 3.0F, 1, 1, 22, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 92, 23, -0.35F, -6.5F, 3.0F, 1, 1, 22, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 56, 46, -4.75F, -9.5F, -1.001F, 4, 5, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 16, 54, -5.25F, -9.5F, 22.0F, 1, 5, 7, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 48, 74, -5.25F, -9.5F, -1.0F, 1, 5, 17, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 20, 7, -5.25F, -9.5F, 16.0F, 1, 1, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 68, 58, -4.79F, -9.9F, -1.0F, 4, 1, 8, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 15, -4.79F, -9.9F, 7.0F, 1, 1, 14, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 34, 60, -4.29F, -9.901F, 9.0F, 1, 1, 10, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 47, 17, -1.69F, -9.902F, 9.0F, 1, 1, 10, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 61, -4.79F, -9.9F, 21.0F, 4, 1, 8, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 73, -1.19F, -9.901F, -1.0F, 1, 1, 8, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 68, 35, -1.19F, -9.901F, 7.0F, 1, 1, 22, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 56, 57, -3.999F, -11.15F, 33.0F, 3, 2, 1, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.501F, -10.25F, 30.001F);
		body.addChild(bone18);
		setRotationAngle(bone18, -0.0698F, 0.0F, 0.0F);
		bone18.cubeList.add(new ModelBox(bone18, 46, 60, -6.002F, 0.0F, 0.0F, 6, 6, 4, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.65F, -6.5F, 3.0F);
		body.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, -0.7854F);
		bone9.cubeList.add(new ModelBox(bone9, 79, 0, -1.0F, -1.0F, 0.0F, 1, 1, 22, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 70, 74, -1.7071F, -0.2929F, 0.0F, 1, 1, 22, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 24, 74, -0.2929F, -1.7071F, 0.0F, 1, 1, 22, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 73, 0.4142F, -2.4142F, 0.0F, 1, 1, 22, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -10.0F, 29.0F);
		body.addChild(bone4);
		setRotationAngle(bone4, -0.6283F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 68, 40, -5.502F, -0.2023F, -0.1469F, 6, 7, 4, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-4.8F, -10.2F, -0.75F);
		body.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.7854F);
		bone5.cubeList.add(new ModelBox(bone5, 34, 41, -1.0F, 0.0F, -1.06F, 1, 1, 32, -0.8F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 40, 2.2527F, 3.2527F, -1.06F, 1, 1, 32, -0.8F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.25F, -0.8F, 0.1F);
		body.addChild(bone10);
		setRotationAngle(bone10, -0.5236F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 34, 40, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 29, 29, -0.5F, -6.1495F, 4.6872F, 1, 2, 2, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 12, 70, -0.7F, -9.7075F, 11.5819F, 1, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 69, 14, -0.7F, -16.7075F, 23.7062F, 1, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 26, 69, -5.8F, -16.7075F, 23.7062F, 1, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 4, 70, -0.8F, -6.168F, -3.3487F, 1, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 0, 70, -5.7F, -6.168F, -3.3487F, 1, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 8, 70, -5.8F, -9.7075F, 11.5819F, 1, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 29, 15, -6.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-0.75F, -5.25F, -1.0F);
		body.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -0.7854F);
		bone11.cubeList.add(new ModelBox(bone11, 68, 58, -2.5F, -3.0F, -1.0F, 3, 3, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 47, 23, -1.9697F, -2.5303F, -3.0F, 2, 2, 2, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 33, 76, -1.8182F, -1.7425F, -8.0F, 1, 1, 5, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 74, 75, -1.1818F, -2.3789F, -8.0F, 1, 1, 5, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 67, 74, -1.1111F, -1.6718F, -8.0F, 1, 1, 5, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 48, 74, -1.8889F, -2.4496F, -8.0F, 1, 1, 5, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.501F, -10.0F, 33.001F);
		body.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.0F, -0.9076F);
		bone16.cubeList.add(new ModelBox(bone16, 46, 60, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 29, 19, -1.0F, -2.55F, 0.0F, 1, 1, 1, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-5.499F, -10.0F, 33.001F);
		body.addChild(bone17);
		setRotationAngle(bone17, 0.0F, 0.0F, 0.9076F);
		bone17.cubeList.add(new ModelBox(bone17, 59, 21, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 31, 33, 0.0F, -2.55F, 0.0F, 1, 1, 1, 0.0F, false));

		frontsight = new ModelRenderer(this);
		frontsight.setRotationPoint(-3.5F, -9.25F, -0.75F);
		body.addChild(frontsight);
		frontsight.cubeList.add(new ModelBox(frontsight, 79, 12, -1.0F, -1.0F, 0.0F, 4, 1, 2, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 7, 0, 0.5F, -2.6F, 0.0F, 1, 2, 2, -0.3F, false));

		bone78 = new ModelRenderer(this);
		bone78.setRotationPoint(-1.05F, -1.5F, 0.1F);
		frontsight.addChild(bone78);
		setRotationAngle(bone78, -0.1745F, 0.0F, -0.0524F);
		bone78.cubeList.add(new ModelBox(bone78, 28, 7, 0.0F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));

		bone79 = new ModelRenderer(this);
		bone79.setRotationPoint(-1.05F, -1.5F, 0.1F);
		frontsight.addChild(bone79);
		setRotationAngle(bone79, -0.1745F, 0.0F, 0.0524F);
		bone79.cubeList.add(new ModelBox(bone79, 8, 25, 3.1F, -1.2113F, -0.0373F, 1, 2, 2, 0.0F, false));

		stock = new ModelRenderer(this);
		stock.setRotationPoint(1.0F, -8.75F, 9.0F);
		stock.cubeList.add(new ModelBox(stock, 62, 60, -1.0F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 62, 40, -5.0F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 79, 9, -5.5F, -1.25F, 1.0F, 6, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 79, 6, -5.5F, 2.75F, 1.0F, 6, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 69, 7, -0.5F, -1.25F, 2.0F, 1, 6, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 4, 61, -5.5F, -1.25F, 2.0F, 1, 6, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 57, 40, -5.5F, 2.75F, 3.0F, 1, 2, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 56, 52, -0.5F, 2.75F, 3.0F, 1, 2, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 26, 66, -5.5F, 0.75F, 1.0F, 2, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 16, 66, -1.5F, 0.75F, 1.0F, 2, 2, 1, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.5F, 2.75F, 6.0F);
		stock.addChild(bone12);
		setRotationAngle(bone12, 0.6458F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 25, 54, -0.999F, -5.0F, -2.0F, 1, 5, 2, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 0, 40, -5.999F, -5.0F, -2.0F, 1, 5, 2, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 61, 52, -0.999F, -3.0F, -3.0F, 1, 2, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 60, 0, -5.999F, -3.0F, -3.0F, 1, 2, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.6F, 4.15F, 4.7F);
		stock.addChild(bone13);
		setRotationAngle(bone13, 0.9948F, 0.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 68, 64, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 68, 62, -6.2F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, 0.75F, 3.5F);
		stock.addChild(bone19);
		setRotationAngle(bone19, -0.1396F, 0.0F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 34, 60, -1.0F, -9.0F, 0.0F, 1, 9, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 8, 15, -5.0F, -9.0F, 0.0F, 1, 9, 1, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, -8.05F, 5.7F);
		stock.addChild(bone20);
		setRotationAngle(bone20, 0.3665F, 0.0F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 50, 40, -1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 47, 0, -5.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, -9.95F, 5.0F);
		stock.addChild(bone21);
		setRotationAngle(bone21, 1.0996F, 0.0F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 27, 40, -1.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 15, 40, -5.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, -11.25F, 2.33F);
		stock.addChild(bone22);
		setRotationAngle(bone22, 1.7453F, 0.0F, 0.0F);
		bone22.cubeList.add(new ModelBox(bone22, 0, 61, -1.0F, -7.0F, -0.95F, 1, 7, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 38, 60, -5.0F, -7.0F, -0.95F, 1, 7, 1, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, -9.15F, -4.42F);
		stock.addChild(bone23);
		setRotationAngle(bone23, 1.6581F, 0.1745F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 16, 16, -1.0F, -4.0F, 0.0F, 1, 4, 1, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-0.67F, -8.85F, -8.32F);
		stock.addChild(bone25);
		setRotationAngle(bone25, 1.6581F, 0.5934F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 28, 11, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-4.37F, -8.85F, -8.32F);
		stock.addChild(bone26);
		setRotationAngle(bone26, 1.6581F, -0.5934F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 10, 12, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-3.72F, -8.85F, -8.12F);
		stock.addChild(bone27);
		setRotationAngle(bone27, 1.6581F, 0.0F, 0.0F);
		bone27.cubeList.add(new ModelBox(bone27, 0, 12, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 6, 12, 1.4F, -1.001F, 0.001F, 1, 1, 1, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-5.0F, -9.15F, -4.42F);
		stock.addChild(bone24);
		setRotationAngle(bone24, 1.6581F, -0.1745F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 0, 0, 0.0F, -4.0F, 0.0F, 1, 4, 1, 0.0F, false));

		action = new ModelRenderer(this);
		action.setRotationPoint(-3.0F, -15.0F, -11.0F);
		action.cubeList.add(new ModelBox(action, 59, 9, -1.0F, -1.0F, 0.0F, 1, 4, 8, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 0, 0, 0.0F, -2.15F, -7.0F, 3, 1, 14, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 68, 53, 1.25F, -2.65F, -6.75F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 47, 28, 0.75F, -2.65F, -6.75F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 47, 3, 0.75F, -2.65F, -6.25F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 34, 44, 1.25F, -2.65F, -6.25F, 1, 1, 1, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(3.0F, -2.5F, -6.0F);
		action.addChild(bone14);
		setRotationAngle(bone14, 0.0F, -0.4189F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 68, 51, -1.0507F, -1.0F, 0.132F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 63, 28, -0.868F, -1.75F, -0.0813F, 1, 1, 1, -0.2F, false));
		bone14.cubeList.add(new ModelBox(bone14, 55, 28, -0.869F, -1.75F, 0.3507F, 1, 1, 1, -0.2F, false));
		bone14.cubeList.add(new ModelBox(bone14, 67, 28, -1.8635F, -1.0F, -0.7102F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 68, 68, -2.7057F, -1.0F, 0.1027F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 59, 24, -2.932F, -1.75F, 0.2754F, 1, 1, 1, -0.2F, false));
		bone14.cubeList.add(new ModelBox(bone14, 51, 28, -2.912F, -1.75F, -0.1207F, 1, 1, 1, -0.2F, false));
		bone14.cubeList.add(new ModelBox(bone14, 15, 30, -1.8929F, -1.0F, -0.0551F, 1, 1, 2, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(2.8F, -2.5F, -6.0F);
		action.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.4189F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 68, 42, -0.868F, -1.001F, -1.0507F, 1, 1, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 60, 3, -0.688F, -1.751F, -0.8373F, 1, 1, 1, -0.2F, false));
		bone15.cubeList.add(new ModelBox(bone15, 53, 23, -0.678F, -1.751F, -1.2841F, 1, 1, 1, -0.2F, false));
		bone15.cubeList.add(new ModelBox(bone15, 38, 68, -1.6808F, -1.001F, -0.2085F, 1, 1, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 68, 40, -2.523F, -1.001F, -1.0213F, 1, 1, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 59, 28, -2.732F, -1.751F, -1.2347F, 1, 1, 1, -0.2F, false));
		bone15.cubeList.add(new ModelBox(bone15, 50, 43, -2.733F, -1.751F, -0.7879F, 1, 1, 1, -0.2F, false));
		bone15.cubeList.add(new ModelBox(bone15, 65, 7, -1.7102F, -1.001F, -1.8635F, 1, 1, 1, 0.0F, false));

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.5F, 6.6F, -6.9F);
		mag.cubeList.add(new ModelBox(mag, 47, 0, -4.0F, -12.0F, 0.0F, 4, 12, 5, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 19, 66, -1.4F, -12.8F, -0.1F, 1, 1, 5, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 50, 40, -3.6F, -12.8F, -0.1F, 1, 1, 5, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 16, 16, -3.75F, 0.0F, 0.0F, 4, 7, 5, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 68, 51, -4.5F, 5.99F, -0.25F, 5, 1, 5, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -4.25F, 0.0F, 0.0F, 1, 7, 5, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 22, 46, -4.0F, 0.0F, -0.5F, 4, 7, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 15, -3.5F, -12.0F, -0.45F, 3, 12, 1, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.1F, -11.7F, 0.0F);
		mag.addChild(bone28);
		setRotationAngle(bone28, 0.0698F, 0.0175F, -0.4538F);
		bone28.cubeList.add(new ModelBox(bone28, 10, 73, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-4.1F, -11.7F, 0.0F);
		mag.addChild(bone29);
		setRotationAngle(bone29, 0.0698F, -0.0175F, 0.4538F);
		bone29.cubeList.add(new ModelBox(bone29, 68, 67, 0.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

		extendedmag = new ModelRenderer(this);
		extendedmag.setRotationPoint(0.5F, 6.6F, -6.9F);
		extendedmag.cubeList.add(new ModelBox(extendedmag, 0, 0, -4.0F, -12.0F, 0.0F, 4, 12, 5, 0.0F, false));
		extendedmag.cubeList.add(new ModelBox(extendedmag, 0, 0, -1.4F, -12.8F, -0.1F, 1, 1, 5, 0.0F, false));
		extendedmag.cubeList.add(new ModelBox(extendedmag, 0, 0, -3.6F, -12.8F, -0.1F, 1, 1, 5, 0.0F, false));
		extendedmag.cubeList.add(new ModelBox(extendedmag, 0, 0, -3.75F, 0.0F, 0.0F, 4, 15, 5, 0.0F, false));
		extendedmag.cubeList.add(new ModelBox(extendedmag, 0, 0, -4.5F, 13.99F, -0.25F, 5, 1, 5, 0.0F, false));
		extendedmag.cubeList.add(new ModelBox(extendedmag, 0, 0, -4.25F, 0.0F, 0.0F, 1, 7, 5, 0.0F, false));
		extendedmag.cubeList.add(new ModelBox(extendedmag, 0, 0, -4.0F, 0.0F, -0.5F, 4, 15, 1, 0.0F, false));
		extendedmag.cubeList.add(new ModelBox(extendedmag, 0, 0, -3.5F, -12.0F, -0.45F, 3, 12, 1, 0.0F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(0.1F, -11.7F, 0.0F);
		extendedmag.addChild(bone30);
		setRotationAngle(bone30, 0.0698F, 0.0175F, -0.4538F);
		bone30.cubeList.add(new ModelBox(bone30, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-4.1F, -11.7F, 0.0F);
		extendedmag.addChild(bone31);
		setRotationAngle(bone31, 0.0698F, -0.0175F, 0.4538F);
		bone31.cubeList.add(new ModelBox(bone31, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

		ARstockAdapter = new ModelRenderer(this);
		ARstockAdapter.setRotationPoint(1.0F, -6.5F, 5.5F);
		ARstockAdapter.cubeList.add(new ModelBox(ARstockAdapter, 0, 0, -5.0F, -10.0F, -0.5F, 5, 10, 5, 0.0F, false));
		ARstockAdapter.cubeList.add(new ModelBox(ARstockAdapter, 0, 0, -4.0F, -9.5F, 4.0F, 3, 8, 1, 0.0F, false));
		ARstockAdapter.cubeList.add(new ModelBox(ARstockAdapter, 0, 0, -4.5F, -9.0F, 4.001F, 4, 4, 1, 0.0F, false));

		M10_45_body = new ModelRenderer(this);
		M10_45_body.setRotationPoint(1.0F, -7.5F, -25.0F);
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -5.5F, -5.0F, -1.0F, 6, 5, 35, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -5.0F, -3.0F, 7.75F, 6, 1, 3, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -5.499F, -9.95F, 33.001F, 6, 6, 1, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -5.499F, -10.25F, 29.001F, 6, 6, 1, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -0.75F, -9.5F, -1.0F, 1, 5, 30, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -0.25F, -9.0F, -0.75F, 1, 1, 23, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -0.25F, -7.0F, -0.75F, 1, 1, 23, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -0.25F, -8.0F, -0.75F, 1, 1, 2, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -0.25F, -8.0F, 20.25F, 1, 1, 2, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -4.75F, -9.5F, -1.001F, 4, 5, 1, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -5.25F, -9.5F, 22.0F, 1, 5, 7, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -5.25F, -9.5F, -1.0F, 1, 5, 17, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -5.25F, -9.5F, 16.0F, 1, 1, 6, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -4.79F, -9.9F, -1.0F, 4, 1, 30, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -3.5F, -10.15F, 4.0F, 2, 1, 3, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -3.5F, -10.15F, 23.0F, 2, 1, 3, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -1.19F, -9.901F, -1.0F, 1, 1, 30, 0.0F, false));
		M10_45_body.cubeList.add(new ModelBox(M10_45_body, 0, 0, -3.999F, -11.15F, 33.0F, 3, 2, 1, 0.0F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.501F, -10.25F, 30.001F);
		M10_45_body.addChild(bone32);
		setRotationAngle(bone32, -0.0698F, 0.0F, 0.0F);
		bone32.cubeList.add(new ModelBox(bone32, 0, 0, -6.002F, 0.0F, 0.0F, 6, 6, 4, 0.0F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(0.0F, -10.0F, 29.0F);
		M10_45_body.addChild(bone34);
		setRotationAngle(bone34, -0.6283F, 0.0F, 0.0F);
		bone34.cubeList.add(new ModelBox(bone34, 0, 0, -5.502F, -0.2023F, -0.1469F, 6, 7, 4, 0.0F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(-4.8F, -10.2F, -0.75F);
		M10_45_body.addChild(bone35);
		setRotationAngle(bone35, 0.0F, 0.0F, -0.7854F);
		bone35.cubeList.add(new ModelBox(bone35, 0, 0, -1.0F, 0.0F, -1.06F, 1, 1, 32, -0.8F, false));
		bone35.cubeList.add(new ModelBox(bone35, 0, 0, 2.2527F, 3.2527F, -1.06F, 1, 1, 32, -0.8F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(0.25F, -0.8F, 0.1F);
		M10_45_body.addChild(bone36);
		setRotationAngle(bone36, -0.5236F, 0.0F, 0.0F);
		bone36.cubeList.add(new ModelBox(bone36, 0, 0, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 0, 0, -0.5F, -6.1495F, 4.6872F, 1, 2, 2, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 0, 0, -0.7F, -9.7075F, 11.5819F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 0, 0, -0.7F, -16.7075F, 23.7062F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 0, 0, -5.8F, -16.7075F, 23.7062F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 0, 0, -5.7F, -6.168F, -3.3487F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 0, 0, -5.8F, -9.7075F, 11.5819F, 1, 1, 1, 0.0F, false));
		bone36.cubeList.add(new ModelBox(bone36, 0, 0, -6.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(-0.75F, -5.25F, -1.0F);
		M10_45_body.addChild(bone37);
		setRotationAngle(bone37, 0.0F, 0.0F, -0.7854F);
		bone37.cubeList.add(new ModelBox(bone37, 0, 0, -2.5F, -3.0F, -1.0F, 3, 3, 1, 0.0F, false));
		bone37.cubeList.add(new ModelBox(bone37, 0, 0, -1.9697F, -2.5303F, -3.0F, 2, 2, 2, 0.0F, false));
		bone37.cubeList.add(new ModelBox(bone37, 0, 0, -1.8182F, -1.7425F, -8.0F, 1, 1, 5, 0.0F, false));
		bone37.cubeList.add(new ModelBox(bone37, 0, 0, -1.1818F, -2.3789F, -8.0F, 1, 1, 5, 0.0F, false));
		bone37.cubeList.add(new ModelBox(bone37, 0, 0, -1.1111F, -1.6718F, -8.0F, 1, 1, 5, 0.0F, false));
		bone37.cubeList.add(new ModelBox(bone37, 0, 0, -1.8889F, -2.4496F, -8.0F, 1, 1, 5, 0.0F, false));

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.501F, -10.0F, 33.001F);
		M10_45_body.addChild(bone38);
		setRotationAngle(bone38, 0.0F, 0.0F, -0.9076F);
		bone38.cubeList.add(new ModelBox(bone38, 0, 0, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		bone38.cubeList.add(new ModelBox(bone38, 0, 0, -1.0F, -2.55F, 0.0F, 1, 1, 1, 0.0F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-5.499F, -10.0F, 33.001F);
		M10_45_body.addChild(bone39);
		setRotationAngle(bone39, 0.0F, 0.0F, 0.9076F);
		bone39.cubeList.add(new ModelBox(bone39, 0, 0, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 0, 0, 0.0F, -2.55F, 0.0F, 1, 1, 1, 0.0F, false));

		frontsight2 = new ModelRenderer(this);
		frontsight2.setRotationPoint(-3.5F, -9.25F, -0.75F);
		M10_45_body.addChild(frontsight2);
		frontsight2.cubeList.add(new ModelBox(frontsight2, 0, 0, -1.0F, -1.0F, 0.0F, 4, 1, 2, 0.0F, false));
		frontsight2.cubeList.add(new ModelBox(frontsight2, 0, 0, 0.5F, -2.6F, 0.0F, 1, 2, 2, -0.3F, false));

		bone80 = new ModelRenderer(this);
		bone80.setRotationPoint(-1.05F, -1.5F, 0.1F);
		frontsight2.addChild(bone80);
		setRotationAngle(bone80, -0.1745F, 0.0F, -0.0524F);
		bone80.cubeList.add(new ModelBox(bone80, 0, 0, 0.0F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));

		bone81 = new ModelRenderer(this);
		bone81.setRotationPoint(-1.05F, -1.5F, 0.1F);
		frontsight2.addChild(bone81);
		setRotationAngle(bone81, -0.1745F, 0.0F, 0.0524F);
		bone81.cubeList.add(new ModelBox(bone81, 0, 0, 3.1F, -1.2113F, -0.0373F, 1, 2, 2, 0.0F, false));

		M10_45_Action = new ModelRenderer(this);
		M10_45_Action.setRotationPoint(2.0F, -14.5F, -25.0F);
		M10_45_Action.cubeList.add(new ModelBox(M10_45_Action, 0, 0, -1.0F, -1.0F, 1.0F, 1, 1, 1, 0.0F, false));
		M10_45_Action.cubeList.add(new ModelBox(M10_45_Action, 0, 0, -1.35F, -1.0F, 2.0F, 1, 1, 3, 0.0F, false));
		M10_45_Action.cubeList.add(new ModelBox(M10_45_Action, 0, 0, 0.0F, -1.25F, 1.0F, 3, 1, 1, 0.0F, false));
		M10_45_Action.cubeList.add(new ModelBox(M10_45_Action, 0, 0, 0.0F, -0.75F, 1.0F, 3, 1, 1, 0.0F, false));
		M10_45_Action.cubeList.add(new ModelBox(M10_45_Action, 0, 0, 0.01F, -1.0F, 0.75F, 3, 1, 1, 0.0F, false));
		M10_45_Action.cubeList.add(new ModelBox(M10_45_Action, 0, 0, 0.01F, -1.0F, 1.25F, 3, 1, 1, 0.0F, false));
		M10_45_Action.cubeList.add(new ModelBox(M10_45_Action, 0, 0, -6.0F, -1.5F, 14.0F, 1, 4, 8, 0.0F, false));

		MAX10_Mk2_Grip = new ModelRenderer(this);
		MAX10_Mk2_Grip.setRotationPoint(-3.5F, -7.5F, -7.0F);
		MAX10_Mk2_Grip.cubeList.add(new ModelBox(MAX10_Mk2_Grip, 0, 0, -0.5F, 0.0F, 0.0F, 5, 14, 6, 0.0F, true));
		MAX10_Mk2_Grip.cubeList.add(new ModelBox(MAX10_Mk2_Grip, 0, 0, 0.0F, 0.0F, -0.5F, 4, 14, 7, 0.0F, true));
		MAX10_Mk2_Grip.cubeList.add(new ModelBox(MAX10_Mk2_Grip, 0, 0, 0.0F, 4.5F, -7.5F, 4, 1, 5, 0.0F, true));
		MAX10_Mk2_Grip.cubeList.add(new ModelBox(MAX10_Mk2_Grip, 0, 0, 0.0F, -0.9F, -8.9F, 4, 5, 1, 0.0F, true));
		MAX10_Mk2_Grip.cubeList.add(new ModelBox(MAX10_Mk2_Grip, 0, 0, 0.0F, 0.0F, 6.5F, 4, 1, 3, 0.0F, true));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(4.0F, 2.8F, -4.6F);
		MAX10_Mk2_Grip.addChild(bone33);
		setRotationAngle(bone33, -0.2793F, 0.0F, 0.0F);
		bone33.cubeList.add(new ModelBox(bone33, 0, 0, -3.0F, -5.0F, 0.0F, 2, 5, 1, 0.0F, true));

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(4.0F, 5.5F, -7.5F);
		MAX10_Mk2_Grip.addChild(bone40);
		setRotationAngle(bone40, -0.7854F, 0.0F, 0.0F);
		bone40.cubeList.add(new ModelBox(bone40, 0, 0, -4.0F, -1.0F, -2.0F, 4, 1, 2, 0.0F, true));

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(4.0F, 5.5F, -2.5F);
		MAX10_Mk2_Grip.addChild(bone41);
		setRotationAngle(bone41, 0.5236F, 0.0F, 0.0F);
		bone41.cubeList.add(new ModelBox(bone41, 0, 0, -3.999F, -1.0F, 0.0F, 4, 1, 3, 0.0F, true));

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(3.5F, 11.4F, 8.5F);
		MAX10_Mk2_Grip.addChild(bone42);
		setRotationAngle(bone42, 1.3265F, 0.0F, 0.0F);
		bone42.cubeList.add(new ModelBox(bone42, 0, 0, -3.5F, -2.0F, -3.0F, 4, 2, 3, 0.0F, true));

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(3.5F, 1.0F, 9.5F);
		MAX10_Mk2_Grip.addChild(bone43);
		setRotationAngle(bone43, 0.7156F, 0.0F, 0.0F);
		bone43.cubeList.add(new ModelBox(bone43, 0, 0, -3.51F, -2.0F, -4.0F, 4, 2, 4, 0.0F, true));

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(3.5F, 11.4F, 8.5F);
		MAX10_Mk2_Grip.addChild(bone44);
		setRotationAngle(bone44, 0.3491F, 0.0F, 0.0F);
		bone44.cubeList.add(new ModelBox(bone44, 0, 0, -3.51F, -6.0F, -2.0F, 4, 6, 2, 0.0F, true));

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(4.5F, 4.3F, -0.9F);
		MAX10_Mk2_Grip.addChild(bone45);
		setRotationAngle(bone45, -0.7854F, 0.0F, 0.0F);
		bone45.cubeList.add(new ModelBox(bone45, 0, 0, -4.99F, -2.0F, 0.0F, 5, 2, 2, 0.0F, true));
		bone45.cubeList.add(new ModelBox(bone45, 0, 0, -4.99F, 0.4042F, 2.4042F, 5, 2, 2, 0.0F, true));
		bone45.cubeList.add(new ModelBox(bone45, 0, 0, -4.99F, 4.5054F, 6.5054F, 5, 2, 1, 0.0F, true));

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(4.6F, 13.3F, 0.5F);
		MAX10_Mk2_Grip.addChild(bone46);
		setRotationAngle(bone46, 0.0873F, 0.0F, 0.0F);
		bone46.cubeList.add(new ModelBox(bone46, 0, 0, -1.0F, -9.0F, 0.0F, 1, 9, 5, 0.0F, true));
		bone46.cubeList.add(new ModelBox(bone46, 0, 0, -5.2F, -9.0F, 0.0F, 1, 9, 5, 0.0F, true));

		MPA_30_body = new ModelRenderer(this);
		MPA_30_body.setRotationPoint(1.0F, -7.5F, -25.0F);
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -5.5F, -5.0F, -1.0F, 6, 5, 40, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -3.999F, 0.0F, 34.9F, 3, 1, 4, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -0.4F, -4.0F, 25.01F, 1, 3, 14, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -0.399F, -3.5F, 24.51F, 1, 2, 1, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -5.599F, -3.5F, 24.51F, 1, 2, 1, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -5.6F, -4.0F, 25.01F, 1, 3, 14, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -5.0F, -10.0F, 33.001F, 5, 5, 6, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -5.0F, -3.0F, 7.75F, 6, 1, 3, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -0.75F, -9.25F, -1.0F, 1, 5, 34, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -0.25F, -9.0F, -0.75F, 1, 1, 23, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -0.25F, -7.0F, -0.75F, 1, 1, 23, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -0.25F, -8.0F, -0.75F, 1, 1, 2, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -0.25F, -8.0F, 20.25F, 1, 1, 2, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -4.75F, -9.25F, -1.001F, 4, 5, 1, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -5.25F, -9.25F, 22.0F, 1, 5, 11, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -5.25F, -9.25F, -1.0F, 1, 5, 17, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -5.25F, -9.25F, 16.0F, 1, 1, 6, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -4.79F, -9.65F, -1.0F, 4, 1, 34, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -3.5F, -10.15F, 4.0F, 2, 1, 3, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -3.5F, -10.15F, 23.0F, 2, 1, 3, 0.0F, false));
		MPA_30_body.cubeList.add(new ModelBox(MPA_30_body, 0, 0, -1.19F, -9.651F, -1.0F, 1, 1, 34, 0.0F, false));

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(-0.999F, 1.0F, 34.9F);
		MPA_30_body.addChild(bone58);
		setRotationAngle(bone58, 1.1694F, 0.0F, 0.0F);
		bone58.cubeList.add(new ModelBox(bone58, 0, 0, -3.0F, -3.0F, 0.0F, 3, 3, 1, 0.0F, false));

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(-0.5F, 0.0F, 29.9F);
		MPA_30_body.addChild(bone57);
		setRotationAngle(bone57, -0.1047F, 0.0F, 0.0F);
		bone57.cubeList.add(new ModelBox(bone57, 0, 0, -4.999F, -1.0F, 0.0F, 6, 1, 9, 0.0F, false));

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(0.0F, -10.0F, 33.001F);
		MPA_30_body.addChild(bone56);
		setRotationAngle(bone56, -0.5411F, 0.0F, 0.0F);
		bone56.cubeList.add(new ModelBox(bone56, 0, 0, -5.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, false));

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(0.5F, -5.0F, 33.0F);
		MPA_30_body.addChild(bone47);
		setRotationAngle(bone47, 0.0F, 0.0F, -0.0524F);
		bone47.cubeList.add(new ModelBox(bone47, 0, 0, -1.0F, -5.0F, 0.0F, 1, 5, 6, 0.0F, false));

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(-5.5F, -5.0F, 33.0F);
		MPA_30_body.addChild(bone53);
		setRotationAngle(bone53, 0.0F, 0.0F, 0.0524F);
		bone53.cubeList.add(new ModelBox(bone53, 0, 0, 0.0F, -5.0F, 0.0F, 1, 5, 6, 0.0F, false));

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(0.5F, -5.0F, 31.5F);
		MPA_30_body.addChild(bone52);
		setRotationAngle(bone52, -0.2793F, 0.0F, -0.0524F);
		bone52.cubeList.add(new ModelBox(bone52, 0, 0, -0.999F, -5.0F, 0.0F, 1, 5, 2, 0.0F, false));

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(-5.5F, -5.0F, 31.5F);
		MPA_30_body.addChild(bone54);
		setRotationAngle(bone54, -0.2793F, 0.0F, 0.0524F);
		bone54.cubeList.add(new ModelBox(bone54, 0, 0, 0.001F, -5.0F, 0.0F, 1, 5, 2, 0.0F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(0.5F, -5.0F, 28.1F);
		MPA_30_body.addChild(bone48);
		setRotationAngle(bone48, -0.9948F, 0.0F, -0.0524F);
		bone48.cubeList.add(new ModelBox(bone48, 0, 0, -1.0F, -5.0F, 0.0F, 1, 5, 2, 0.0F, false));

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(-5.5F, -5.0F, 28.1F);
		MPA_30_body.addChild(bone55);
		setRotationAngle(bone55, -0.9948F, 0.0F, 0.0524F);
		bone55.cubeList.add(new ModelBox(bone55, 0, 0, 0.0F, -5.0F, 0.0F, 1, 5, 2, 0.0F, false));

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(-4.8F, -10.2F, -0.75F);
		MPA_30_body.addChild(bone49);
		setRotationAngle(bone49, 0.0F, 0.0F, -0.7854F);
		bone49.cubeList.add(new ModelBox(bone49, 0, 0, -1.1768F, 0.1768F, -1.06F, 1, 1, 36, -0.8F, false));
		bone49.cubeList.add(new ModelBox(bone49, 0, 0, 2.0759F, 3.4295F, -1.06F, 1, 1, 36, -0.8F, false));

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(0.25F, -0.8F, 0.1F);
		MPA_30_body.addChild(bone50);
		setRotationAngle(bone50, -0.5236F, 0.0F, 0.0F);
		bone50.cubeList.add(new ModelBox(bone50, 0, 0, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 0, 0, -0.5F, -6.1495F, 4.6872F, 1, 2, 2, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 0, 0, -0.7F, -9.7075F, 11.5819F, 1, 1, 1, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 0, 0, -0.55F, -15.5111F, 20.7019F, 1, 2, 2, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 0, 0, -5.95F, -15.5111F, 20.7019F, 1, 2, 2, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 0, 0, -5.7F, -5.9515F, -3.2237F, 1, 1, 1, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 0, 0, -5.8F, -9.7075F, 11.5819F, 1, 1, 1, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 0, 0, -6.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(-0.75F, -5.25F, -1.0F);
		MPA_30_body.addChild(bone51);
		setRotationAngle(bone51, 0.0F, 0.0F, -0.7854F);
		bone51.cubeList.add(new ModelBox(bone51, 0, 0, -2.5F, -3.0F, -1.0F, 3, 3, 1, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 0, 0, -1.9697F, -2.5303F, -3.0F, 2, 2, 2, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 0, 0, -1.8182F, -1.7425F, -8.0F, 1, 1, 5, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 0, 0, -1.1818F, -2.3789F, -8.0F, 1, 1, 5, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 0, 0, -1.1111F, -1.6718F, -8.0F, 1, 1, 5, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 0, 0, -1.8889F, -2.4496F, -8.0F, 1, 1, 5, 0.0F, false));

		frontsight3 = new ModelRenderer(this);
		frontsight3.setRotationPoint(-3.5F, -9.25F, -0.75F);
		MPA_30_body.addChild(frontsight3);
		frontsight3.cubeList.add(new ModelBox(frontsight3, 0, 0, -1.0F, -1.0F, 0.0F, 4, 1, 2, 0.0F, false));
		frontsight3.cubeList.add(new ModelBox(frontsight3, 0, 0, 0.5F, -2.6F, 0.0F, 1, 2, 2, -0.3F, false));

		bone82 = new ModelRenderer(this);
		bone82.setRotationPoint(-1.05F, -1.5F, 0.1F);
		frontsight3.addChild(bone82);
		setRotationAngle(bone82, -0.1745F, 0.0F, -0.0524F);
		bone82.cubeList.add(new ModelBox(bone82, 0, 0, 0.0F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));

		bone83 = new ModelRenderer(this);
		bone83.setRotationPoint(-1.05F, -1.5F, 0.1F);
		frontsight3.addChild(bone83);
		setRotationAngle(bone83, -0.1745F, 0.0F, 0.0524F);
		bone83.cubeList.add(new ModelBox(bone83, 0, 0, 3.1F, -1.2113F, -0.0373F, 1, 2, 2, 0.0F, false));

		MAX11_body = new ModelRenderer(this);
		MAX11_body.setRotationPoint(1.0F, -7.5F, -25.0F);
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.5F, -5.0F, 3.0F, 6, 5, 35, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -6.0F, -5.25F, -14.0F, 7, 5, 17, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.9F, -5.25F, -13.75F, 7, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -6.1F, -5.25F, -13.75F, 1, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.9F, -5.25F, -7.75F, 7, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -6.1F, -5.25F, -7.75F, 1, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.9F, -5.25F, -1.75F, 7, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -6.1F, -5.25F, -1.75F, 1, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.9F, -5.25F, -12.25F, 7, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -6.1F, -5.25F, -12.25F, 1, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.9F, -5.25F, -6.25F, 7, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -6.1F, -5.25F, -6.25F, 1, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.9F, -5.25F, -0.25F, 7, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -6.1F, -5.25F, -0.25F, 1, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.9F, -5.25F, -10.75F, 7, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -6.1F, -5.25F, -10.75F, 1, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.9F, -5.25F, -4.75F, 7, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -6.1F, -5.25F, -4.75F, 1, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.9F, -5.25F, 1.25F, 7, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -6.1F, -5.25F, 1.25F, 1, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.9F, -5.25F, -9.25F, 7, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -6.1F, -5.25F, -9.25F, 1, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.9F, -5.25F, -3.25F, 7, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -6.1F, -5.25F, -3.25F, 1, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.0F, -0.25F, -14.0F, 5, 1, 17, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.0F, -3.0F, 5.75F, 6, 1, 3, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.499F, -7.95F, 34.001F, 6, 4, 4, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -0.75F, -7.75F, -14.0F, 1, 3, 52, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -0.75F, -8.25F, -14.0F, 1, 1, 52, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -0.75F, -9.75F, -14.0F, 1, 1, 52, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -0.74F, -9.0F, -14.0F, 1, 1, 2, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -0.85F, -9.0F, -12.0F, 1, 1, 18, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -0.74F, -9.0F, -9.0F, 1, 1, 2, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -0.74F, -9.0F, -4.0F, 1, 1, 2, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -0.74F, -9.0F, 1.0F, 1, 1, 2, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -0.74F, -9.0F, 6.0F, 1, 1, 2, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -0.74F, -9.0F, 23.0F, 1, 1, 15, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.5F, -8.0F, -13.75F, 6, 2, 15, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -0.45F, -7.9F, 9.0F, 1, 1, 20, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.55F, -7.9F, 4.0F, 1, 1, 11, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.55F, -7.9F, 23.0F, 1, 1, 7, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -0.45F, -6.4F, 9.0F, 1, 1, 20, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.55F, -6.4F, 4.0F, 1, 1, 11, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.55F, -6.4F, 23.0F, 1, 1, 7, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -4.75F, -9.5F, -14.001F, 4, 5, 1, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.25F, -9.75F, 22.0F, 5, 5, 16, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.25F, -9.75F, -14.0F, 1, 5, 30, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -5.25F, -9.75F, 16.0F, 1, 1, 6, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -4.79F, -10.15F, -14.0F, 4, 1, 52, 0.0F, false));
		MAX11_body.cubeList.add(new ModelBox(MAX11_body, 0, 0, -1.19F, -10.151F, -14.0F, 1, 1, 52, 0.0F, false));

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(1.0F, -5.25F, -14.0F);
		MAX11_body.addChild(bone65);
		setRotationAngle(bone65, 0.0F, 0.0F, 0.7854F);
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -1.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -0.9293F, -0.0707F, 0.25F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -0.9293F, -0.0707F, 6.25F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -0.9293F, -0.0707F, 12.25F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -0.9293F, -0.0707F, 1.75F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -0.9293F, -0.0707F, 7.75F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -0.9293F, -0.0707F, 13.75F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -0.9293F, -0.0707F, 3.25F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -0.9293F, -0.0707F, 9.25F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -0.9293F, -0.0707F, 15.25F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -0.9293F, -0.0707F, 4.75F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -0.9293F, -0.0707F, 10.75F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, 2.5355F, 3.5355F, 0.0F, 1, 1, 17, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, 2.5355F, 3.95F, 0.0F, 1, 1, 17, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -1.4142F, 7.4853F, 0.0F, 1, 1, 17, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -1.0F, 7.4853F, 0.0F, 1, 1, 17, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -4.9497F, 3.9497F, 0.0F, 1, 1, 17, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -5.0205F, 4.0205F, 0.25F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -5.0205F, 4.0205F, 6.25F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -5.0205F, 4.0205F, 12.25F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -5.0205F, 4.0205F, 1.75F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -5.0205F, 4.0205F, 7.75F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -5.0205F, 4.0205F, 13.75F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -5.0205F, 4.0205F, 3.25F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -5.0205F, 4.0205F, 9.25F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -5.0205F, 4.0205F, 15.25F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -5.0205F, 4.0205F, 4.75F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 0, 0, -5.0205F, 4.0205F, 10.75F, 1, 1, 1, 0.0F, false));

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(0.501F, -7.95F, 30.001F);
		MAX11_body.addChild(bone59);
		setRotationAngle(bone59, -0.9076F, 0.0F, 0.0F);
		bone59.cubeList.add(new ModelBox(bone59, 0, 0, -5.999F, -3.152F, 2.4626F, 6, 5, 3, 0.0F, false));

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(-5.55F, -6.9F, 23.0F);
		MAX11_body.addChild(bone67);
		setRotationAngle(bone67, 0.0F, 0.0F, -0.9599F);
		bone67.cubeList.add(new ModelBox(bone67, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));
		bone67.cubeList.add(new ModelBox(bone67, 0, 0, -1.2287F, 0.8604F, 0.0F, 1, 1, 7, 0.0F, false));
		bone67.cubeList.add(new ModelBox(bone67, 0, 0, -1.2287F, 0.8604F, -19.0F, 1, 1, 11, 0.0F, false));
		bone67.cubeList.add(new ModelBox(bone67, 0, 0, 0.0F, 0.0F, -19.0F, 1, 1, 11, 0.0F, false));

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(-5.55F, -7.9F, 23.0F);
		MAX11_body.addChild(bone66);
		setRotationAngle(bone66, 0.0F, 0.0F, 0.9599F);
		bone66.cubeList.add(new ModelBox(bone66, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, false));
		bone66.cubeList.add(new ModelBox(bone66, 0, 0, 0.0F, -1.0F, -19.0F, 1, 1, 11, 0.0F, false));
		bone66.cubeList.add(new ModelBox(bone66, 0, 0, 1.2287F, -0.1396F, -19.0F, 1, 1, 11, 0.0F, false));
		bone66.cubeList.add(new ModelBox(bone66, 0, 0, 1.2287F, -0.1396F, 0.0F, 1, 1, 7, 0.0F, false));

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(0.55F, -6.9F, 3.0F);
		MAX11_body.addChild(bone61);
		setRotationAngle(bone61, 0.0F, 0.0F, 0.9599F);
		bone61.cubeList.add(new ModelBox(bone61, 0, 0, -1.0F, 0.0F, 6.0F, 1, 1, 20, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 0, 0, 0.2287F, 0.8604F, 6.0F, 1, 1, 20, 0.0F, false));

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(0.55F, -6.4F, 3.0F);
		MAX11_body.addChild(bone60);
		setRotationAngle(bone60, 0.0F, 0.0F, -0.9599F);
		bone60.cubeList.add(new ModelBox(bone60, 0, 0, -1.0F, -1.0F, 6.0F, 1, 1, 20, 0.0F, false));
		bone60.cubeList.add(new ModelBox(bone60, 0, 0, 0.2287F, -1.8604F, 6.0F, 1, 1, 20, 0.0F, false));

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(-4.8F, -10.2F, -0.75F);
		MAX11_body.addChild(bone62);
		setRotationAngle(bone62, 0.0F, 0.0F, -0.7854F);
		bone62.cubeList.add(new ModelBox(bone62, 0, 0, -0.8232F, -0.1768F, -14.06F, 1, 1, 53, -0.8F, false));
		bone62.cubeList.add(new ModelBox(bone62, 0, 0, 2.4295F, 3.0759F, -14.06F, 1, 1, 53, -0.8F, false));

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(0.25F, -0.8F, 0.1F);
		MAX11_body.addChild(bone63);
		setRotationAngle(bone63, -0.5236F, 0.0F, 0.0F);
		bone63.cubeList.add(new ModelBox(bone63, 0, 0, -0.5F, -5.1495F, 2.9551F, 1, 2, 2, 0.0F, false));
		bone63.cubeList.add(new ModelBox(bone63, 0, 0, -0.7F, -9.7075F, 11.5819F, 1, 1, 1, 0.0F, false));
		bone63.cubeList.add(new ModelBox(bone63, 0, 0, -0.1F, -3.183F, -0.951F, 1, 2, 2, 0.0F, false));
		bone63.cubeList.add(new ModelBox(bone63, 0, 0, -6.4F, -3.183F, -0.951F, 1, 2, 2, 0.0F, false));
		bone63.cubeList.add(new ModelBox(bone63, 0, 0, -0.7F, -16.7075F, 23.7062F, 1, 1, 1, 0.0F, false));
		bone63.cubeList.add(new ModelBox(bone63, 0, 0, -5.8F, -16.7075F, 23.7062F, 1, 1, 1, 0.0F, false));
		bone63.cubeList.add(new ModelBox(bone63, 0, 0, -5.8F, -9.7075F, 11.5819F, 1, 1, 1, 0.0F, false));

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(-0.75F, -5.25F, -11.0F);
		MAX11_body.addChild(bone64);
		setRotationAngle(bone64, 0.0F, 0.0F, -0.7854F);
		bone64.cubeList.add(new ModelBox(bone64, 0, 0, -1.8182F, -1.7425F, -9.0F, 1, 1, 6, 0.0F, false));
		bone64.cubeList.add(new ModelBox(bone64, 0, 0, -1.1818F, -2.3789F, -9.0F, 1, 1, 6, 0.0F, false));
		bone64.cubeList.add(new ModelBox(bone64, 0, 0, -1.1111F, -1.6718F, -9.0F, 1, 1, 6, 0.0F, false));
		bone64.cubeList.add(new ModelBox(bone64, 0, 0, -1.8889F, -2.4496F, -9.0F, 1, 1, 6, 0.0F, false));

		MAX11_action = new ModelRenderer(this);
		MAX11_action.setRotationPoint(-3.0F, -15.25F, -11.0F);
		MAX11_action.cubeList.add(new ModelBox(MAX11_action, 0, 0, -1.0F, -1.0F, 0.0F, 1, 4, 8, 0.0F, false));
		MAX11_action.cubeList.add(new ModelBox(MAX11_action, 0, 0, 3.0F, -1.0F, -6.0F, 1, 1, 15, 0.0F, false));
		MAX11_action.cubeList.add(new ModelBox(MAX11_action, 0, 0, 3.5F, -1.25F, -6.0F, 1, 1, 1, 0.0F, false));
		MAX11_action.cubeList.add(new ModelBox(MAX11_action, 0, 0, 4.5F, -1.5F, -6.0F, 3, 1, 1, 0.0F, false));
		MAX11_action.cubeList.add(new ModelBox(MAX11_action, 0, 0, 4.5F, -1.0F, -6.0F, 3, 1, 1, 0.0F, false));
		MAX11_action.cubeList.add(new ModelBox(MAX11_action, 0, 0, 4.5F, -1.25F, -5.75F, 3, 1, 1, 0.0F, false));
		MAX11_action.cubeList.add(new ModelBox(MAX11_action, 0, 0, 4.5F, -1.25F, -6.25F, 3, 1, 1, 0.0F, false));

		MAX11_stock = new ModelRenderer(this);
		MAX11_stock.setRotationPoint(-4.0F, -12.25F, 12.5F);
		MAX11_stock.cubeList.add(new ModelBox(MAX11_stock, 0, 0, -1.0F, -1.0F, -1.0F, 7, 6, 2, 0.0F, false));
		MAX11_stock.cubeList.add(new ModelBox(MAX11_stock, 0, 0, 0.0F, -1.1F, 0.0F, 5, 6, 2, 0.0F, false));
		MAX11_stock.cubeList.add(new ModelBox(MAX11_stock, 0, 0, 1.0F, -0.25F, 1.25F, 3, 2, 36, 0.0F, false));
		MAX11_stock.cubeList.add(new ModelBox(MAX11_stock, 0, 0, 1.5F, 2.25F, 35.25F, 2, 14, 2, 0.0F, false));
		MAX11_stock.cubeList.add(new ModelBox(MAX11_stock, 0, 0, 1.5F, 16.25F, 33.55F, 2, 1, 4, 0.0F, false));
		MAX11_stock.cubeList.add(new ModelBox(MAX11_stock, 0, 0, 1.5F, 1.25F, 36.25F, 2, 1, 1, 0.0F, false));
		MAX11_stock.cubeList.add(new ModelBox(MAX11_stock, 0, 0, 1.5F, 2.25F, 31.25F, 2, 1, 4, 0.0F, false));
		MAX11_stock.cubeList.add(new ModelBox(MAX11_stock, 0, 0, 1.5F, 1.25F, 18.25F, 2, 5, 2, 0.0F, false));
		MAX11_stock.cubeList.add(new ModelBox(MAX11_stock, 0, 0, -1.0F, 0.0F, -2.0F, 7, 4, 1, 0.0F, false));
		MAX11_stock.cubeList.add(new ModelBox(MAX11_stock, 0, 0, -1.0F, 1.0F, -3.0F, 7, 3, 1, 0.0F, false));
		MAX11_stock.cubeList.add(new ModelBox(MAX11_stock, 0, 0, -1.0F, 2.0F, -4.0F, 7, 2, 1, 0.0F, false));
		MAX11_stock.cubeList.add(new ModelBox(MAX11_stock, 0, 0, -1.0F, 3.0F, -5.0F, 7, 1, 1, 0.0F, false));
		MAX11_stock.cubeList.add(new ModelBox(MAX11_stock, 0, 0, -1.0F, 4.0F, -6.0F, 7, 1, 5, 0.0F, false));

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(0.6F, 1.35F, 37.25F);
		MAX11_stock.addChild(bone74);
		setRotationAngle(bone74, 0.0F, 0.0F, -0.0524F);
		bone74.cubeList.add(new ModelBox(bone74, 0, 0, 0.0F, -1.0F, 0.0F, 2, 17, 2, 0.0F, false));

		bone75 = new ModelRenderer(this);
		bone75.setRotationPoint(4.4F, 0.35F, 37.25F);
		MAX11_stock.addChild(bone75);
		setRotationAngle(bone75, 0.0F, 0.0F, 0.0524F);
		bone75.cubeList.add(new ModelBox(bone75, 0, 0, -2.0F, 0.0F, 0.0F, 2, 17, 2, 0.0F, false));

		bone76 = new ModelRenderer(this);
		bone76.setRotationPoint(4.4F, 0.35F, 37.25F);
		MAX11_stock.addChild(bone76);
		setRotationAngle(bone76, 0.0F, 0.0F, 1.2915F);
		bone76.cubeList.add(new ModelBox(bone76, 0, 0, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone77 = new ModelRenderer(this);
		bone77.setRotationPoint(0.55F, 0.35F, 37.25F);
		MAX11_stock.addChild(bone77);
		setRotationAngle(bone77, 0.0F, 0.0F, -1.2915F);
		bone77.cubeList.add(new ModelBox(bone77, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(3.5F, 3.25F, 31.25F);
		MAX11_stock.addChild(bone73);
		setRotationAngle(bone73, 0.6632F, 0.0F, 0.0F);
		bone73.cubeList.add(new ModelBox(bone73, 0, 0, -2.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(4.0F, -1.0F, 2.25F);
		MAX11_stock.addChild(bone69);
		setRotationAngle(bone69, -0.0105F, 0.0F, 0.0F);
		bone69.cubeList.add(new ModelBox(bone69, 0, 0, -3.001F, 0.0F, -1.0F, 3, 1, 38, 0.0F, false));

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(4.0F, 3.75F, 2.0F);
		MAX11_stock.addChild(bone70);
		setRotationAngle(bone70, -0.1571F, 0.0F, 0.0F);
		bone70.cubeList.add(new ModelBox(bone70, 0, 0, -2.501F, -1.0F, 0.0F, 2, 2, 18, 0.0F, false));

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(4.0F, 5.55F, 19.9F);
		MAX11_stock.addChild(bone71);
		setRotationAngle(bone71, -0.3491F, 0.0F, 0.0F);
		bone71.cubeList.add(new ModelBox(bone71, 0, 0, -2.501F, 0.0F, 0.0F, 2, 2, 14, 0.0F, false));

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(3.499F, 10.8F, 31.65F);
		MAX11_stock.addChild(bone72);
		setRotationAngle(bone72, -1.309F, 0.0F, 0.0F);
		bone72.cubeList.add(new ModelBox(bone72, 0, 0, -2.0F, -4.1035F, -0.3864F, 2, 4, 7, 0.0F, false));

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(6.0F, -1.0F, -1.0F);
		MAX11_stock.addChild(bone68);
		setRotationAngle(bone68, -0.8029F, 0.0F, 0.0F);
		bone68.cubeList.add(new ModelBox(bone68, 0, 0, -6.999F, 0.0F, 0.0F, 7, 7, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		grip.render(f5);
//		body.render(f5);
		stock.render(f5);
//		action.render(f5);
//		mag.render(f5);
		
//		extendedmag.render(f5);
//		ARstockAdapter.render(f5);
//		M10_45_body.render(f5);
//		M10_45_Action.render(f5);
//		MAX10_Mk2_Grip.render(f5);
//		MPA_30_body.render(f5);
//		MAX11_body.render(f5);
//		MAX11_action.render(f5);
//		MAX11_stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
