package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKRail extends ModelBase {
	private final QRenderer rail;
	private final ModelRenderer Rail5;
	private final ModelRenderer Rail87;
	private final ModelRenderer Rail86;
	private final ModelRenderer Rail85;
	private final ModelRenderer Rail83;
	private final ModelRenderer Rail82;
	private final ModelRenderer Rail81;
	private final ModelRenderer Rail80;
	private final ModelRenderer Rail79;
	private final ModelRenderer Rail76;
	private final ModelRenderer Rail77;
	private final ModelRenderer Rail75;
	private final ModelRenderer Rail74;
	private final ModelRenderer Rail73;
	private final ModelRenderer Rail72;
	private final ModelRenderer Rail71;
	private final ModelRenderer Rail70;
	private final ModelRenderer Rail69;
	private final ModelRenderer Rail68;
	private final ModelRenderer Rail67;
	private final ModelRenderer Rail66;
	private final ModelRenderer Rail64;
	private final ModelRenderer Rail63;
	private final ModelRenderer Rail62;
	private final ModelRenderer Rail61;
	private final ModelRenderer Rail59;
	private final ModelRenderer Rail58;
	private final ModelRenderer Rail57;
	private final ModelRenderer Rail55;
	private final ModelRenderer Rail53;
	private final ModelRenderer Rail51;
	private final ModelRenderer Rail50;
	private final ModelRenderer Rail49;
	private final ModelRenderer Rail48;
	private final ModelRenderer Rail47;
	private final ModelRenderer Rail46;
	private final ModelRenderer Rail45;
	private final ModelRenderer Rail43;
	private final ModelRenderer Rail42;
	private final ModelRenderer Rail40;
	private final ModelRenderer Rail39;
	private final ModelRenderer Rail38;
	private final ModelRenderer Rail36;
	private final ModelRenderer Rail34;
	private final ModelRenderer Rail32;
	private final ModelRenderer Rail30;
	private final ModelRenderer Rail29;
	private final ModelRenderer Rail28;
	private final ModelRenderer Rail26;
	private final ModelRenderer Rail24;
	private final ModelRenderer Rail22;
	private final ModelRenderer Rail21;
	private final ModelRenderer Rail20;
	private final ModelRenderer Rail19;
	private final ModelRenderer Rail18;
	private final ModelRenderer Rail17;
	private final ModelRenderer Rail15;
	private final ModelRenderer Rail14;
	private final ModelRenderer Rail12;
	private final ModelRenderer Rail11;
	private final ModelRenderer Rail10;
	private final ModelRenderer Rail8;
	private final ModelRenderer Rail6;
	private final ModelRenderer Rail4;
	private final ModelRenderer Rail3;
	private final ModelRenderer Rail2;
	private final ModelRenderer Rail1;

	public AKRail() {
		textureWidth = 80;
		textureHeight = 50;

		rail = new QRenderer(this);
		rail.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Rail5 = new ModelRenderer(this);
		Rail5.setRotationPoint(-0.35F, -23.45F, 0.5F);
		rail.addChild(Rail5);
		setRotationAngle(Rail5, 0.0F, 0.0F, -2.176F);
		Rail5.cubeList.add(new ModelBox(Rail5, 16, 0, -1.01F, 0.0F, 0.0F, 1, 0, 30, 0.0F, true));

		Rail87 = new ModelRenderer(this);
		Rail87.setRotationPoint(0.5F, -24.0F, 30.5F);
		rail.addChild(Rail87);
		setRotationAngle(Rail87, -0.8179F, 0.0F, 0.0F);
		Rail87.cubeList.add(new ModelBox(Rail87, 6, 13, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Rail86 = new ModelRenderer(this);
		Rail86.setRotationPoint(1.0F, -24.0F, 30.5F);
		rail.addChild(Rail86);
		setRotationAngle(Rail86, -0.8179F, 0.0F, 0.0F);
		Rail86.cubeList.add(new ModelBox(Rail86, 6, 0, 0.0F, -0.001F, 0.001F, 2, 1, 1, 0.0F, false));

		Rail85 = new ModelRenderer(this);
		Rail85.setRotationPoint(3.85F, -23.45F, 0.5F);
		rail.addChild(Rail85);
		setRotationAngle(Rail85, 0.0F, 0.0F, 2.176F);
		Rail85.cubeList.add(new ModelBox(Rail85, 16, 0, 0.01F, 0.0F, 0.0F, 1, 0, 30, 0.0F, false));

		Rail83 = new ModelRenderer(this);
		Rail83.setRotationPoint(1.85F, -23.45F, 0.5F);
		rail.addChild(Rail83);
		Rail83.cubeList.add(new ModelBox(Rail83, 12, 0, 0.0F, -0.001F, 0.0F, 2, 0, 30, 0.0F, false));

		Rail82 = new ModelRenderer(this);
		Rail82.setRotationPoint(-0.35F, -23.45F, 0.5F);
		rail.addChild(Rail82);
		Rail82.cubeList.add(new ModelBox(Rail82, 6, 0, 0.0F, 0.0F, 0.0F, 3, 0, 30, 0.0F, false));

		Rail81 = new ModelRenderer(this);
		Rail81.setRotationPoint(0.2F, -23.2F, 0.5F);
		rail.addChild(Rail81);
		Rail81.cubeList.add(new ModelBox(Rail81, 0, 0, 0.05F, 0.0F, 0.0F, 3, 1, 30, 0.0F, false));

		Rail80 = new ModelRenderer(this);
		Rail80.setRotationPoint(0.5F, -24.0F, 25.5F);
		rail.addChild(Rail80);
		setRotationAngle(Rail80, 0.0F, 0.0F, 0.9689F);
		Rail80.cubeList.add(new ModelBox(Rail80, 14, 4, 0.0F, 0.0F, 0.999F, 1, 1, 1, 0.0F, false));

		Rail79 = new ModelRenderer(this);
		Rail79.setRotationPoint(0.5F, -24.0F, 22.5F);
		rail.addChild(Rail79);
		setRotationAngle(Rail79, 0.0F, 0.0F, 0.9689F);
		Rail79.cubeList.add(new ModelBox(Rail79, 9, 14, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		Rail76 = new ModelRenderer(this);
		Rail76.setRotationPoint(0.5F, -24.0F, 13.5F);
		rail.addChild(Rail76);
		setRotationAngle(Rail76, 0.0F, 0.0F, 0.9689F);
		Rail76.cubeList.add(new ModelBox(Rail76, 0, 15, 0.0F, 0.0F, 0.999F, 1, 1, 1, 0.0F, false));

		Rail77 = new ModelRenderer(this);
		Rail77.setRotationPoint(0.5F, -24.0F, 16.5F);
		rail.addChild(Rail77);
		setRotationAngle(Rail77, 0.0F, 0.0F, 0.9689F);
		Rail77.cubeList.add(new ModelBox(Rail77, 13, 14, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		Rail75 = new ModelRenderer(this);
		Rail75.setRotationPoint(0.5F, -24.0F, 10.5F);
		rail.addChild(Rail75);
		setRotationAngle(Rail75, 0.0F, 0.0F, 0.9689F);
		Rail75.cubeList.add(new ModelBox(Rail75, 4, 15, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		Rail74 = new ModelRenderer(this);
		Rail74.setRotationPoint(0.5F, -24.0F, 7.5F);
		rail.addChild(Rail74);
		setRotationAngle(Rail74, 0.0F, 0.0F, 0.9689F);
		Rail74.cubeList.add(new ModelBox(Rail74, 7, 16, 0.0F, 0.0F, 0.999F, 1, 1, 1, 0.0F, false));

		Rail73 = new ModelRenderer(this);
		Rail73.setRotationPoint(0.5F, -24.0F, 4.5F);
		rail.addChild(Rail73);
		setRotationAngle(Rail73, 0.0F, 0.0F, 0.9689F);
		Rail73.cubeList.add(new ModelBox(Rail73, 16, 7, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		Rail72 = new ModelRenderer(this);
		Rail72.setRotationPoint(0.5F, -24.0F, 1.5F);
		rail.addChild(Rail72);
		setRotationAngle(Rail72, 0.0F, 0.0F, 0.9689F);
		Rail72.cubeList.add(new ModelBox(Rail72, 16, 9, 0.0F, 0.0F, 0.999F, 1, 1, 1, 0.0F, false));

		Rail71 = new ModelRenderer(this);
		Rail71.setRotationPoint(0.5F, -23.999F, 1.5F);
		rail.addChild(Rail71);
		Rail71.cubeList.add(new ModelBox(Rail71, 11, 16, 0.0F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));

		Rail70 = new ModelRenderer(this);
		Rail70.setRotationPoint(0.5F, -23.999F, 4.5F);
		rail.addChild(Rail70);
		Rail70.cubeList.add(new ModelBox(Rail70, 16, 11, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Rail69 = new ModelRenderer(this);
		Rail69.setRotationPoint(0.5F, -23.999F, 7.5F);
		rail.addChild(Rail69);
		Rail69.cubeList.add(new ModelBox(Rail69, 16, 13, 0.0F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));

		Rail68 = new ModelRenderer(this);
		Rail68.setRotationPoint(0.5F, -23.999F, 10.5F);
		rail.addChild(Rail68);
		Rail68.cubeList.add(new ModelBox(Rail68, 15, 16, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Rail67 = new ModelRenderer(this);
		Rail67.setRotationPoint(0.5F, -23.999F, 13.5F);
		rail.addChild(Rail67);
		Rail67.cubeList.add(new ModelBox(Rail67, 0, 17, 0.0F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));

		Rail66 = new ModelRenderer(this);
		Rail66.setRotationPoint(0.5F, -23.999F, 16.5F);
		rail.addChild(Rail66);
		Rail66.cubeList.add(new ModelBox(Rail66, 4, 17, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Rail64 = new ModelRenderer(this);
		Rail64.setRotationPoint(0.5F, -23.999F, 22.5F);
		rail.addChild(Rail64);
		Rail64.cubeList.add(new ModelBox(Rail64, 17, 5, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Rail63 = new ModelRenderer(this);
		Rail63.setRotationPoint(0.5F, -23.999F, 25.5F);
		rail.addChild(Rail63);
		Rail63.cubeList.add(new ModelBox(Rail63, 18, 0, 0.0F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));

		Rail62 = new ModelRenderer(this);
		Rail62.setRotationPoint(0.5F, -23.999F, 28.5F);
		rail.addChild(Rail62);
		Rail62.cubeList.add(new ModelBox(Rail62, 0, 3, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		Rail61 = new ModelRenderer(this);
		Rail61.setRotationPoint(0.5F, -24.0F, 28.5F);
		rail.addChild(Rail61);
		setRotationAngle(Rail61, 0.0F, 0.0F, 0.9689F);
		Rail61.cubeList.add(new ModelBox(Rail61, 4, 4, 0.0F, 0.0F, 0.001F, 1, 1, 2, 0.0F, false));

		Rail59 = new ModelRenderer(this);
		Rail59.setRotationPoint(0.5F, -24.0F, 24.0F);
		rail.addChild(Rail59);
		setRotationAngle(Rail59, 0.0F, 0.0F, 0.9689F);
		Rail59.cubeList.add(new ModelBox(Rail59, 18, 3, 0.0F, 0.0F, 0.499F, 1, 1, 1, 0.0F, false));

		Rail58 = new ModelRenderer(this);
		Rail58.setRotationPoint(0.5F, -24.0F, 21.0F);
		rail.addChild(Rail58);
		setRotationAngle(Rail58, 0.0F, 0.0F, 0.9689F);
		Rail58.cubeList.add(new ModelBox(Rail58, 7, 18, 0.0F, 0.0F, -0.501F, 1, 1, 1, 0.0F, false));

		Rail57 = new ModelRenderer(this);
		Rail57.setRotationPoint(0.5F, -24.0F, 18.0F);
		rail.addChild(Rail57);
		setRotationAngle(Rail57, 0.0F, 0.0F, 0.9689F);
		Rail57.cubeList.add(new ModelBox(Rail57, 11, 18, 0.0F, 0.0F, 0.499F, 1, 1, 1, 0.0F, false));

		Rail55 = new ModelRenderer(this);
		Rail55.setRotationPoint(0.5F, -24.0F, 12.0F);
		rail.addChild(Rail55);
		setRotationAngle(Rail55, 0.0F, 0.0F, 0.9689F);
		Rail55.cubeList.add(new ModelBox(Rail55, 15, 18, 0.0F, 0.0F, 0.499F, 1, 1, 1, 0.0F, false));

		Rail53 = new ModelRenderer(this);
		Rail53.setRotationPoint(0.5F, -24.0F, 6.0F);
		rail.addChild(Rail53);
		setRotationAngle(Rail53, 0.0F, 0.0F, 0.9689F);
		Rail53.cubeList.add(new ModelBox(Rail53, 18, 15, 0.0F, 0.0F, 0.499F, 1, 1, 1, 0.0F, false));

		Rail51 = new ModelRenderer(this);
		Rail51.setRotationPoint(3.0F, -24.0F, 28.5F);
		rail.addChild(Rail51);
		setRotationAngle(Rail51, 0.0F, 0.0F, 0.5949F);
		Rail51.cubeList.add(new ModelBox(Rail51, 0, 6, 0.0F, 0.0F, 0.001F, 1, 1, 2, 0.0F, false));

		Rail50 = new ModelRenderer(this);
		Rail50.setRotationPoint(3.0F, -24.0F, 1.5F);
		rail.addChild(Rail50);
		setRotationAngle(Rail50, 0.0F, 0.0F, 0.5949F);
		Rail50.cubeList.add(new ModelBox(Rail50, 18, 17, 0.0F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));

		Rail49 = new ModelRenderer(this);
		Rail49.setRotationPoint(3.0F, -24.0F, 4.5F);
		rail.addChild(Rail49);
		setRotationAngle(Rail49, 0.0F, 0.0F, 0.5949F);
		Rail49.cubeList.add(new ModelBox(Rail49, 0, 19, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Rail48 = new ModelRenderer(this);
		Rail48.setRotationPoint(3.0F, -24.0F, 7.5F);
		rail.addChild(Rail48);
		setRotationAngle(Rail48, 0.0F, 0.0F, 0.5949F);
		Rail48.cubeList.add(new ModelBox(Rail48, 4, 19, 0.0F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));

		Rail47 = new ModelRenderer(this);
		Rail47.setRotationPoint(3.0F, -24.0F, 10.5F);
		rail.addChild(Rail47);
		setRotationAngle(Rail47, 0.0F, 0.0F, 0.5949F);
		Rail47.cubeList.add(new ModelBox(Rail47, 19, 8, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Rail46 = new ModelRenderer(this);
		Rail46.setRotationPoint(3.0F, -24.0F, 13.5F);
		rail.addChild(Rail46);
		setRotationAngle(Rail46, 0.0F, 0.0F, 0.5949F);
		Rail46.cubeList.add(new ModelBox(Rail46, 19, 10, 0.0F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));

		Rail45 = new ModelRenderer(this);
		Rail45.setRotationPoint(3.0F, -24.0F, 16.5F);
		rail.addChild(Rail45);
		setRotationAngle(Rail45, 0.0F, 0.0F, 0.5949F);
		Rail45.cubeList.add(new ModelBox(Rail45, 19, 12, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		Rail43 = new ModelRenderer(this);
		Rail43.setRotationPoint(3.0F, -24.0F, 22.5F);
		rail.addChild(Rail43);
		setRotationAngle(Rail43, 0.0F, 0.0F, 0.5949F);
		Rail43.cubeList.add(new ModelBox(Rail43, 18, 19, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		Rail42 = new ModelRenderer(this);
		Rail42.setRotationPoint(3.0F, -24.0F, 25.5F);
		rail.addChild(Rail42);
		setRotationAngle(Rail42, 0.0F, 0.0F, 0.5949F);
		Rail42.cubeList.add(new ModelBox(Rail42, 20, 6, 0.0F, 0.0F, 0.999F, 1, 1, 1, 0.0F, false));

		Rail40 = new ModelRenderer(this);
		Rail40.setRotationPoint(0.5F, -23.999F, 24.0F);
		rail.addChild(Rail40);
		Rail40.cubeList.add(new ModelBox(Rail40, 7, 20, 0.0F, 0.0F, 0.5F, 1, 1, 1, 0.0F, false));

		Rail39 = new ModelRenderer(this);
		Rail39.setRotationPoint(0.5F, -23.999F, 21.0F);
		rail.addChild(Rail39);
		Rail39.cubeList.add(new ModelBox(Rail39, 11, 20, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

		Rail38 = new ModelRenderer(this);
		Rail38.setRotationPoint(0.5F, -23.999F, 18.0F);
		rail.addChild(Rail38);
		Rail38.cubeList.add(new ModelBox(Rail38, 15, 20, 0.0F, 0.0F, 0.5F, 1, 1, 1, 0.0F, false));

		Rail36 = new ModelRenderer(this);
		Rail36.setRotationPoint(0.5F, -23.999F, 12.0F);
		rail.addChild(Rail36);
		Rail36.cubeList.add(new ModelBox(Rail36, 0, 21, 0.0F, 0.0F, 0.5F, 1, 1, 1, 0.0F, false));

		Rail34 = new ModelRenderer(this);
		Rail34.setRotationPoint(0.5F, -23.999F, 6.0F);
		rail.addChild(Rail34);
		Rail34.cubeList.add(new ModelBox(Rail34, 21, 1, 0.0F, 0.0F, 0.5F, 1, 1, 1, 0.0F, false));

		Rail32 = new ModelRenderer(this);
		Rail32.setRotationPoint(0.5F, -23.999F, 0.0F);
		rail.addChild(Rail32);
		Rail32.cubeList.add(new ModelBox(Rail32, 4, 21, 0.0F, 0.0F, 0.502F, 1, 1, 1, 0.0F, false));

		Rail30 = new ModelRenderer(this);
		Rail30.setRotationPoint(3.0F, -24.0F, 24.0F);
		rail.addChild(Rail30);
		setRotationAngle(Rail30, 0.0F, 0.0F, 0.5949F);
		Rail30.cubeList.add(new ModelBox(Rail30, 21, 4, 0.0F, 0.0F, 0.499F, 1, 1, 1, 0.0F, false));

		Rail29 = new ModelRenderer(this);
		Rail29.setRotationPoint(3.0F, -24.0F, 21.0F);
		rail.addChild(Rail29);
		setRotationAngle(Rail29, 0.0F, 0.0F, 0.5949F);
		Rail29.cubeList.add(new ModelBox(Rail29, 21, 14, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

		Rail28 = new ModelRenderer(this);
		Rail28.setRotationPoint(3.0F, -24.0F, 18.0F);
		rail.addChild(Rail28);
		setRotationAngle(Rail28, 0.0F, 0.0F, 0.5949F);
		Rail28.cubeList.add(new ModelBox(Rail28, 21, 16, 0.0F, 0.0F, 0.5F, 1, 1, 1, 0.0F, false));

		Rail26 = new ModelRenderer(this);
		Rail26.setRotationPoint(3.0F, -24.0F, 12.0F);
		rail.addChild(Rail26);
		setRotationAngle(Rail26, 0.0F, 0.0F, 0.5949F);
		Rail26.cubeList.add(new ModelBox(Rail26, 18, 21, 0.0F, 0.0F, 0.5F, 1, 1, 1, 0.0F, false));

		Rail24 = new ModelRenderer(this);
		Rail24.setRotationPoint(3.0F, -24.0F, 6.0F);
		rail.addChild(Rail24);
		setRotationAngle(Rail24, 0.0F, 0.0F, 0.5949F);
		Rail24.cubeList.add(new ModelBox(Rail24, 21, 18, 0.0F, 0.0F, 0.5F, 1, 1, 1, 0.0F, false));

		Rail22 = new ModelRenderer(this);
		Rail22.setRotationPoint(1.0F, -24.0F, 28.5F);
		rail.addChild(Rail22);
		Rail22.cubeList.add(new ModelBox(Rail22, 0, 0, 0.0F, 0.0F, 0.001F, 2, 1, 2, 0.0F, false));

		Rail21 = new ModelRenderer(this);
		Rail21.setRotationPoint(1.0F, -24.0F, 4.5F);
		rail.addChild(Rail21);
		Rail21.cubeList.add(new ModelBox(Rail21, 7, 2, 0.0F, 0.0F, 0.001F, 2, 1, 1, 0.0F, false));

		Rail20 = new ModelRenderer(this);
		Rail20.setRotationPoint(1.0F, -24.0F, 7.5F);
		rail.addChild(Rail20);
		Rail20.cubeList.add(new ModelBox(Rail20, 6, 7, 0.0F, 0.0F, 1.001F, 2, 1, 1, 0.0F, false));

		Rail19 = new ModelRenderer(this);
		Rail19.setRotationPoint(1.0F, -24.0F, 10.5F);
		rail.addChild(Rail19);
		Rail19.cubeList.add(new ModelBox(Rail19, 8, 4, 0.0F, 0.0F, 0.001F, 2, 1, 1, 0.0F, false));

		Rail18 = new ModelRenderer(this);
		Rail18.setRotationPoint(1.0F, -24.0F, 13.5F);
		rail.addChild(Rail18);
		Rail18.cubeList.add(new ModelBox(Rail18, 0, 9, 0.0F, 0.0F, 1.001F, 2, 1, 1, 0.0F, false));

		Rail17 = new ModelRenderer(this);
		Rail17.setRotationPoint(1.0F, -24.0F, 16.5F);
		rail.addChild(Rail17);
		Rail17.cubeList.add(new ModelBox(Rail17, 6, 9, 0.0F, 0.0F, 0.001F, 2, 1, 1, 0.0F, false));

		Rail15 = new ModelRenderer(this);
		Rail15.setRotationPoint(1.0F, -24.0F, 22.5F);
		rail.addChild(Rail15);
		Rail15.cubeList.add(new ModelBox(Rail15, 0, 11, 0.0F, 0.0F, 0.001F, 2, 1, 1, 0.0F, false));

		Rail14 = new ModelRenderer(this);
		Rail14.setRotationPoint(1.0F, -24.0F, 25.5F);
		rail.addChild(Rail14);
		Rail14.cubeList.add(new ModelBox(Rail14, 6, 11, 0.0F, 0.0F, 1.001F, 2, 1, 1, 0.0F, false));

		Rail12 = new ModelRenderer(this);
		Rail12.setRotationPoint(1.0F, -24.0F, 24.0F);
		rail.addChild(Rail12);
		Rail12.cubeList.add(new ModelBox(Rail12, 11, 6, 0.0F, 0.0F, 0.501F, 2, 1, 1, 0.0F, false));

		Rail11 = new ModelRenderer(this);
		Rail11.setRotationPoint(1.0F, -24.0F, 21.0F);
		rail.addChild(Rail11);
		Rail11.cubeList.add(new ModelBox(Rail11, 11, 8, 0.0F, 0.0F, -0.499F, 2, 1, 1, 0.0F, false));

		Rail10 = new ModelRenderer(this);
		Rail10.setRotationPoint(1.0F, -24.0F, 18.0F);
		rail.addChild(Rail10);
		Rail10.cubeList.add(new ModelBox(Rail10, 11, 10, 0.0F, 0.0F, 0.501F, 2, 1, 1, 0.0F, false));

		Rail8 = new ModelRenderer(this);
		Rail8.setRotationPoint(1.0F, -24.0F, 12.0F);
		rail.addChild(Rail8);
		Rail8.cubeList.add(new ModelBox(Rail8, 12, 0, 0.0F, 0.0F, 0.501F, 2, 1, 1, 0.0F, false));

		Rail6 = new ModelRenderer(this);
		Rail6.setRotationPoint(1.0F, -24.0F, 6.0F);
		rail.addChild(Rail6);
		Rail6.cubeList.add(new ModelBox(Rail6, 11, 12, 0.0F, 0.0F, 0.501F, 2, 1, 1, 0.0F, false));

		Rail4 = new ModelRenderer(this);
		Rail4.setRotationPoint(1.0F, -24.0F, 1.5F);
		rail.addChild(Rail4);
		Rail4.cubeList.add(new ModelBox(Rail4, 0, 13, 0.0F, 0.0F, 1.001F, 2, 1, 1, 0.0F, false));

		Rail3 = new ModelRenderer(this);
		Rail3.setRotationPoint(3.0F, -24.0F, 0.0F);
		rail.addChild(Rail3);
		setRotationAngle(Rail3, 0.0F, 0.0F, 0.5949F);
		Rail3.cubeList.add(new ModelBox(Rail3, 21, 20, 0.0F, 0.0F, 0.499F, 1, 1, 1, 0.0F, false));

		Rail2 = new ModelRenderer(this);
		Rail2.setRotationPoint(0.5F, -24.0F, 0.0F);
		rail.addChild(Rail2);
		setRotationAngle(Rail2, 0.0F, 0.0F, 0.9689F);
		Rail2.cubeList.add(new ModelBox(Rail2, 7, 22, 0.0F, 0.0F, 0.499F, 1, 1, 1, 0.0F, false));

		Rail1 = new ModelRenderer(this);
		Rail1.setRotationPoint(1.0F, -24.0F, 0.0F);
		rail.addChild(Rail1);
		Rail1.cubeList.add(new ModelBox(Rail1, 13, 2, 0.0F, 0.0F, 0.501F, 2, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		rail.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
