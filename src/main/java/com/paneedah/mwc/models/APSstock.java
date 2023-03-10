package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class APSstock extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun182;
	private final ModelRenderer gun181;
	private final ModelRenderer gun180;
	private final ModelRenderer gun165;
	private final ModelRenderer gun164;
	private final ModelRenderer gun163;
	private final ModelRenderer gun162;
	private final ModelRenderer gun161;
	private final ModelRenderer gun160;
	private final ModelRenderer gun159;
	private final ModelRenderer gun158;
	private final ModelRenderer gun157;
	private final ModelRenderer gun156;
	private final ModelRenderer gun155;
	private final ModelRenderer gun154;
	private final ModelRenderer gun153;
	private final ModelRenderer gun152;
	private final ModelRenderer gun151;
	private final ModelRenderer gun150;
	private final ModelRenderer gun149;
	private final ModelRenderer gun148;
	private final ModelRenderer gun142;
	private final ModelRenderer gun141;
	private final ModelRenderer gun140;
	private final ModelRenderer gun137;
	private final ModelRenderer gun1811;
	private final ModelRenderer gun1800;
	private final ModelRenderer gun1799;
	private final ModelRenderer gun1588;
	private final ModelRenderer gun133;
	private final ModelRenderer gun132;
	private final ModelRenderer gun131;
	private final ModelRenderer gun130;
	private final ModelRenderer gun126;
	private final ModelRenderer gun92;
	private final ModelRenderer gun86;
	private final ModelRenderer gun85;
	private final ModelRenderer gun84;
	private final ModelRenderer gun83;
	private final ModelRenderer gun15;
	private final ModelRenderer gun14;
	private final ModelRenderer gun12;
	private final ModelRenderer gun6;
	private final ModelRenderer gun2;
	private final ModelRenderer slide;
	private final ModelRenderer slide96;
	private final ModelRenderer slide95;
	private final ModelRenderer slide94;
	private final ModelRenderer slide93;
	private final ModelRenderer slide92;
	private final ModelRenderer slide91;
	private final ModelRenderer slide90;
	private final ModelRenderer slide89;
	private final ModelRenderer slide88;
	private final ModelRenderer slide87;
	private final ModelRenderer slide86;
	private final ModelRenderer slide85;
	private final ModelRenderer slide84;
	private final ModelRenderer slide83;
	private final ModelRenderer slide82;
	private final ModelRenderer slide81;
	private final ModelRenderer slide80;
	private final ModelRenderer slide79;
	private final ModelRenderer slide78;
	private final ModelRenderer slide77;
	private final ModelRenderer slide75;
	private final ModelRenderer slide73;
	private final ModelRenderer slide72;
	private final ModelRenderer slide71;
	private final ModelRenderer slide70;
	private final ModelRenderer slide69;
	private final ModelRenderer slide68;
	private final ModelRenderer slide67;
	private final ModelRenderer slide66;
	private final ModelRenderer slide65;
	private final ModelRenderer slide64;
	private final ModelRenderer slide63;
	private final ModelRenderer slide62;
	private final ModelRenderer slide61;
	private final ModelRenderer slide60;
	private final ModelRenderer slide59;
	private final ModelRenderer slide58;
	private final ModelRenderer slide57;
	private final ModelRenderer slide56;
	private final ModelRenderer slide55;
	private final ModelRenderer slide54;
	private final ModelRenderer slide53;
	private final ModelRenderer slide52;
	private final ModelRenderer slide51;
	private final ModelRenderer slide50;
	private final ModelRenderer slide49;
	private final ModelRenderer slide48;
	private final ModelRenderer slide47;
	private final ModelRenderer slide46;
	private final ModelRenderer slide45;
	private final ModelRenderer slide44;
	private final ModelRenderer slide43;
	private final ModelRenderer slide42;
	private final ModelRenderer slide41;
	private final ModelRenderer slide40;
	private final ModelRenderer slide39;
	private final ModelRenderer slide38;
	private final ModelRenderer slide37;
	private final ModelRenderer slide36;
	private final ModelRenderer slide35;
	private final ModelRenderer slide34;
	private final ModelRenderer slide33;
	private final ModelRenderer slide32;
	private final ModelRenderer slide31;
	private final ModelRenderer slide30;
	private final ModelRenderer slide29;
	private final ModelRenderer slide28;
	private final ModelRenderer slide27;
	private final ModelRenderer slide26;
	private final ModelRenderer slide29_r1;
	private final ModelRenderer slide25;
	private final ModelRenderer slide24;
	private final ModelRenderer slide23;
	private final ModelRenderer slide22;
	private final ModelRenderer slide21;
	private final ModelRenderer slide20;
	private final ModelRenderer slide19;
	private final ModelRenderer slide18;
	private final ModelRenderer slide17;
	private final ModelRenderer slide16;
	private final ModelRenderer slide15;
	private final ModelRenderer slide14;
	private final ModelRenderer slide13;
	private final ModelRenderer slide12;
	private final ModelRenderer slide11;
	private final ModelRenderer slide10;
	private final ModelRenderer slide9;
	private final ModelRenderer slide8;
	private final ModelRenderer slide7;
	private final ModelRenderer slide6;
	private final ModelRenderer slide5;
	private final ModelRenderer slide4;
	private final ModelRenderer slide3;
	private final ModelRenderer slide2;
	private final ModelRenderer slide1;
	private final ModelRenderer mag;
	private final ModelRenderer mag7;
	private final ModelRenderer mag6;
	private final ModelRenderer mag5;
	private final ModelRenderer mag3;
	private final ModelRenderer mag2;
	private final ModelRenderer mag4;
	private final ModelRenderer mag1;
	private final ModelRenderer hammer;
	private final ModelRenderer gun1822;
	private final ModelRenderer gun168;
	private final ModelRenderer gun169;
	private final ModelRenderer gun167;
	private final ModelRenderer gun183;
	private final ModelRenderer grip;
	private final ModelRenderer gun13;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer gun145;
	private final ModelRenderer gun143;
	private final ModelRenderer gun144;
	private final ModelRenderer gun135;
	private final ModelRenderer gun87;
	private final ModelRenderer gun127;
	private final ModelRenderer gun91;
	private final ModelRenderer gun178;
	private final ModelRenderer gun174;
	private final ModelRenderer gun89;
	private final ModelRenderer gun93;
	private final ModelRenderer gun172;
	private final ModelRenderer gun175;
	private final ModelRenderer gun173;
	private final ModelRenderer gun171;
	private final ModelRenderer gun179;
	private final ModelRenderer gun176;
	private final ModelRenderer gun177;
	private final ModelRenderer gun170;
	private final ModelRenderer stock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public APSstock() {
		textureWidth = 150;
		textureHeight = 150;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun182 = new ModelRenderer(this);
		gun182.setRotationPoint(-3.0F, -17.6F, 3.0F);
		gun.addChild(gun182);
		setRotationAngle(gun182, -3.0486F, 0.0F, 0.0F);
		gun182.cubeList.add(new ModelBox(gun182, 23, 0, 0.0F, -1.0F, 0.0F, 3, 8, 2, 0.0F, false));

		gun181 = new ModelRenderer(this);
		gun181.setRotationPoint(-3.0F, -23.7F, 2.3F);
		gun.addChild(gun181);
		setRotationAngle(gun181, -3.0486F, 0.0F, 0.0F);
		gun181.cubeList.add(new ModelBox(gun181, 50, 60, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun180 = new ModelRenderer(this);
		gun180.setRotationPoint(-2.5F, -30.5F, 0.6F);
		gun.addChild(gun180);
		setRotationAngle(gun180, -1.3013F, 0.0F, 0.0F);
		gun180.cubeList.add(new ModelBox(gun180, 10, 75, 0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F, false));

		gun165 = new ModelRenderer(this);
		gun165.setRotationPoint(-3.0F, -32.6F, -24.5F);
		gun.addChild(gun165);
		setRotationAngle(gun165, 0.7854F, 0.0F, 0.0F);
		gun165.cubeList.add(new ModelBox(gun165, 35, 8, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun164 = new ModelRenderer(this);
		gun164.setRotationPoint(-3.0F, -31.6F, -23.5F);
		gun.addChild(gun164);
		setRotationAngle(gun164, 2.3562F, 0.0F, 0.0F);
		gun164.cubeList.add(new ModelBox(gun164, 37, 26, -0.001F, -0.001F, 0.0F, 3, 1, 1, 0.0F, false));

		gun163 = new ModelRenderer(this);
		gun163.setRotationPoint(-0.3F, -32.0F, -8.5F);
		gun.addChild(gun163);
		setRotationAngle(gun163, 1.2641F, 0.0F, 0.0F);
		gun163.cubeList.add(new ModelBox(gun163, 0, 22, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun162 = new ModelRenderer(this);
		gun162.setRotationPoint(-3.7F, -32.0F, -8.5F);
		gun.addChild(gun162);
		setRotationAngle(gun162, 1.2641F, 0.0F, 0.0F);
		gun162.cubeList.add(new ModelBox(gun162, 9, 22, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun161 = new ModelRenderer(this);
		gun161.setRotationPoint(-3.7F, -34.0F, -10.7F);
		gun.addChild(gun161);
		gun161.cubeList.add(new ModelBox(gun161, 54, 13, 0.0F, 0.0F, 0.0F, 1, 2, 11, 0.0F, false));

		gun160 = new ModelRenderer(this);
		gun160.setRotationPoint(-0.3F, -34.0F, -10.7F);
		gun.addChild(gun160);
		gun160.cubeList.add(new ModelBox(gun160, 54, 33, 0.002F, 0.0F, 0.0F, 1, 2, 11, 0.0F, false));

		gun159 = new ModelRenderer(this);
		gun159.setRotationPoint(-3.5F, -16.5F, -4.4F);
		gun.addChild(gun159);
		setRotationAngle(gun159, 1.1897F, 0.0F, 0.0F);
		gun159.cubeList.add(new ModelBox(gun159, 0, 38, 0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun158 = new ModelRenderer(this);
		gun158.setRotationPoint(-3.5F, -17.0F, 0.0F);
		gun.addChild(gun158);
		gun158.cubeList.add(new ModelBox(gun158, 28, 42, 0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun157 = new ModelRenderer(this);
		gun157.setRotationPoint(-2.5F, -25.6F, -12.5F);
		gun.addChild(gun157);
		setRotationAngle(gun157, 2.3562F, 0.0F, 0.0F);
		gun157.cubeList.add(new ModelBox(gun157, 12, 39, 0.001F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun156 = new ModelRenderer(this);
		gun156.setRotationPoint(-2.5F, -26.6F, -13.5F);
		gun.addChild(gun156);
		setRotationAngle(gun156, 0.7854F, 0.0F, 0.0F);
		gun156.cubeList.add(new ModelBox(gun156, 67, 22, -0.001F, 0.0F, -0.001F, 2, 1, 1, 0.0F, false));

		gun155 = new ModelRenderer(this);
		gun155.setRotationPoint(-3.5F, -31.0F, -10.0F);
		gun.addChild(gun155);
		setRotationAngle(gun155, 1.2641F, 0.0F, 0.0F);
		gun155.cubeList.add(new ModelBox(gun155, 34, 11, 0.002F, 0.0F, 0.0F, 4, 5, 2, 0.0F, false));

		gun154 = new ModelRenderer(this);
		gun154.setRotationPoint(-3.5F, -31.0F, -13.5F);
		gun.addChild(gun154);
		setRotationAngle(gun154, 2.0448F, 0.0F, 0.0F);
		gun154.cubeList.add(new ModelBox(gun154, 0, 42, -0.001F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun153 = new ModelRenderer(this);
		gun153.setRotationPoint(-0.3F, -33.5F, 0.3F);
		gun.addChild(gun153);
		setRotationAngle(gun153, -1.3384F, 0.0F, 0.0F);
		gun153.cubeList.add(new ModelBox(gun153, 0, 53, 0.001F, 0.0F, 0.0F, 1, 7, 3, 0.0F, false));

		gun152 = new ModelRenderer(this);
		gun152.setRotationPoint(-3.7F, -33.5F, 0.3F);
		gun.addChild(gun152);
		setRotationAngle(gun152, -1.3384F, 0.0F, 0.0F);
		gun152.cubeList.add(new ModelBox(gun152, 34, 53, -0.001F, 0.0F, 0.0F, 1, 7, 3, 0.0F, false));

		gun151 = new ModelRenderer(this);
		gun151.setRotationPoint(-2.5F, -30.6F, -13.5F);
		gun.addChild(gun151);
		gun151.cubeList.add(new ModelBox(gun151, 0, 14, 0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F, false));

		gun150 = new ModelRenderer(this);
		gun150.setRotationPoint(-3.0F, -30.5F, -4.3F);
		gun.addChild(gun150);
		setRotationAngle(gun150, -1.3384F, 0.0F, 0.0F);
		gun150.cubeList.add(new ModelBox(gun150, 92, 40, 0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F, false));

		gun149 = new ModelRenderer(this);
		gun149.setRotationPoint(-3.5F, -16.0F, 2.0F);
		gun.addChild(gun149);
		setRotationAngle(gun149, 2.167F, 0.0F, 0.0F);
		gun149.cubeList.add(new ModelBox(gun149, 34, 18, 0.001F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun148 = new ModelRenderer(this);
		gun148.setRotationPoint(-3.5F, -16.5F, -4.4F);
		gun.addChild(gun148);
		gun148.cubeList.add(new ModelBox(gun148, 54, 26, -0.001F, 0.0F, 0.0F, 4, 1, 5, 0.0F, false));

		gun142 = new ModelRenderer(this);
		gun142.setRotationPoint(0.0F, -34.2F, -8.0F);
		gun.addChild(gun142);
		setRotationAngle(gun142, 0.2231F, 0.0F, 0.0F);
		

		gun141 = new ModelRenderer(this);
		gun141.setRotationPoint(-3.0F, -30.5F, -10.2F);
		gun.addChild(gun141);
		setRotationAngle(gun141, 1.2641F, 0.0F, 0.0F);
		gun141.cubeList.add(new ModelBox(gun141, 50, 53, -0.001F, 0.0F, 0.0F, 3, 5, 2, 0.0F, false));

		gun140 = new ModelRenderer(this);
		gun140.setRotationPoint(-3.5F, -33.5F, -24.5F);
		gun.addChild(gun140);
		gun140.cubeList.add(new ModelBox(gun140, 0, 53, 0.0F, 0.0F, 0.0F, 4, 1, 11, 0.0F, false));

		gun137 = new ModelRenderer(this);
		gun137.setRotationPoint(0.0F, -33.5F, -8.0F);
		gun.addChild(gun137);
		setRotationAngle(gun137, 0.0311F, 0.0F, 0.0F);
		gun137.cubeList.add(new ModelBox(gun137, 74, 69, 0.0F, 0.5F, 0.0F, 1, 1, 3, 0.0F, false));

		gun1811 = new ModelRenderer(this);
		gun1811.setRotationPoint(-2.0F, -36.7F, -11.5F);
		gun.addChild(gun1811);
		gun1811.cubeList.add(new ModelBox(gun1811, 74, 64, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun1800 = new ModelRenderer(this);
		gun1800.setRotationPoint(-2.9F, -35.9F, -11.5F);
		gun.addChild(gun1800);
		setRotationAngle(gun1800, 0.0F, 0.0F, 0.5205F);
		gun1800.cubeList.add(new ModelBox(gun1800, 75, 53, 0.0F, -0.2F, 0.0F, 1, 1, 4, 0.0F, false));

		gun1799 = new ModelRenderer(this);
		gun1799.setRotationPoint(-2.0F, -36.7F, -11.5F);
		gun.addChild(gun1799);
		setRotationAngle(gun1799, 0.0F, 0.0F, 0.9295F);
		gun1799.cubeList.add(new ModelBox(gun1799, 75, 58, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun1588 = new ModelRenderer(this);
		gun1588.setRotationPoint(-2.5F, -35.85F, -31.0F);
		gun.addChild(gun1588);
		gun1588.cubeList.add(new ModelBox(gun1588, 43, 81, 0.0F, 0.0F, 0.0F, 2, 2, 23, 0.0F, false));

		gun133 = new ModelRenderer(this);
		gun133.setRotationPoint(-3.0F, -31.6F, -23.5F);
		gun.addChild(gun133);
		setRotationAngle(gun133, 0.0F, 0.0F, -2.0448F);
		gun133.cubeList.add(new ModelBox(gun133, 23, 0, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(0.0F, -31.6F, -23.5F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -2.6545F);
		gun132.cubeList.add(new ModelBox(gun132, 63, 53, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun131 = new ModelRenderer(this);
		gun131.setRotationPoint(-3.0F, -33.6F, -23.5F);
		gun.addChild(gun131);
		gun131.cubeList.add(new ModelBox(gun131, 34, 53, 0.0F, 0.0F, 0.0F, 3, 2, 10, 0.0F, false));

		gun130 = new ModelRenderer(this);
		gun130.setRotationPoint(-3.0F, -30.5F, -13.5F);
		gun.addChild(gun130);
		setRotationAngle(gun130, 2.6769F, 0.0F, 0.0F);
		gun130.cubeList.add(new ModelBox(gun130, 97, 33, 0.001F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

		gun126 = new ModelRenderer(this);
		gun126.setRotationPoint(-3.0F, -31.5F, -13.5F);
		gun.addChild(gun126);
		gun126.cubeList.add(new ModelBox(gun126, 50, 106, 0.0F, 0.0F, 0.0F, 3, 1, 14, 0.0F, false));

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(-3.5F, -30.5F, -4.0F);
		gun.addChild(gun92);
		setRotationAngle(gun92, -1.3384F, 0.0F, 0.0F);
		gun92.cubeList.add(new ModelBox(gun92, 25, 86, 0.001F, 0.0F, -1.0F, 4, 3, 15, 0.0F, false));

		gun86 = new ModelRenderer(this);
		gun86.setRotationPoint(-3.5F, -30.5F, 1.4F);
		gun.addChild(gun86);
		setRotationAngle(gun86, -1.9333F, 0.0F, 0.0F);
		gun86.cubeList.add(new ModelBox(gun86, 98, 77, 0.001F, 0.0F, 0.0F, 4, 4, 3, 0.0F, false));

		gun85 = new ModelRenderer(this);
		gun85.setRotationPoint(-3.5F, -31.5F, 3.5F);
		gun.addChild(gun85);
		setRotationAngle(gun85, -2.9371F, 0.0F, 0.0F);
		gun85.cubeList.add(new ModelBox(gun85, 67, 41, 0.001F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun84 = new ModelRenderer(this);
		gun84.setRotationPoint(-3.5F, -33.5F, -0.5F);
		gun.addChild(gun84);
		gun84.cubeList.add(new ModelBox(gun84, 80, 81, 0.0F, 1.0F, 0.0F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 54, 5, -0.002F, 0.2F, -0.001F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 54, 38, 3.0F, 1.0F, 0.0F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 36, 41, 3.002F, 0.2F, -0.001F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 54, 33, 2.55F, 1.0F, 0.1F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 54, 0, 2.551F, 0.2F, 0.099F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 54, 18, 0.45F, 1.0F, 0.1F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 54, 13, 0.449F, 0.2F, 0.099F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 34, 75, 0.95F, 1.0F, 0.099F, 2, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 19, 59, 0.95F, 0.5F, 0.098F, 2, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 0, 65, 0.95F, -2.6F, 1.198F, 2, 3, 1, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 80, 2, 1.5F, -2.6F, 1.498F, 1, 1, 1, -0.2F, false));

		gun83 = new ModelRenderer(this);
		gun83.setRotationPoint(-3.5F, -29.5F, 0.5F);
		gun.addChild(gun83);
		setRotationAngle(gun83, 2.4166F, 0.0F, 0.0F);
		gun83.cubeList.add(new ModelBox(gun83, 98, 84, -0.001F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-2.5F, -26.6F, -12.5F);
		gun.addChild(gun15);
		gun15.cubeList.add(new ModelBox(gun15, 79, 35, 0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-3.0F, -26.0F, -7.5F);
		gun.addChild(gun14);
		setRotationAngle(gun14, 0.8923F, 0.0F, 0.0F);
		gun14.cubeList.add(new ModelBox(gun14, 96, 20, -0.001F, 0.0F, 0.0F, 3, 3, 3, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-3.5F, -34.0F, -24.5F);
		gun.addChild(gun12);
		

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-3.5F, -34.0F, -13.5F);
		gun.addChild(gun6);
		gun6.cubeList.add(new ModelBox(gun6, 54, 0, 0.0F, 0.0F, 0.0F, 4, 3, 10, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-2.0F, -31.0F, -8.0F);
		gun.addChild(gun2);
		setRotationAngle(gun2, -0.5205F, 0.0F, 0.0F);
		gun2.cubeList.add(new ModelBox(gun2, 0, 0, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

		slide = new ModelRenderer(this);
		slide.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		slide96 = new ModelRenderer(this);
		slide96.setRotationPoint(0.9F, -35.5F, 0.5F);
		slide.addChild(slide96);
		setRotationAngle(slide96, 0.0F, 0.0F, 0.3718F);
		slide96.cubeList.add(new ModelBox(slide96, 80, 4, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide95 = new ModelRenderer(this);
		slide95.setRotationPoint(0.9F, -35.5F, -1.1F);
		slide.addChild(slide95);
		setRotationAngle(slide95, 0.0F, 0.0F, 0.3718F);
		slide95.cubeList.add(new ModelBox(slide95, 67, 36, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		slide94 = new ModelRenderer(this);
		slide94.setRotationPoint(0.9F, -35.5F, -4.9F);
		slide.addChild(slide94);
		setRotationAngle(slide94, 0.0F, 0.0F, 0.3718F);
		slide94.cubeList.add(new ModelBox(slide94, 80, 8, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide93 = new ModelRenderer(this);
		slide93.setRotationPoint(0.9F, -35.5F, -25.5F);
		slide.addChild(slide93);
		setRotationAngle(slide93, 0.0F, 0.0F, 0.3718F);
		slide93.cubeList.add(new ModelBox(slide93, 0, 0, -1.0F, -0.001F, 0.0F, 1, 1, 21, 0.0F, false));

		slide92 = new ModelRenderer(this);
		slide92.setRotationPoint(-3.9F, -35.5F, -25.5F);
		slide.addChild(slide92);
		setRotationAngle(slide92, 0.0F, 0.0F, -0.3718F);
		slide92.cubeList.add(new ModelBox(slide92, 34, 53, 0.0F, 0.0F, 0.0F, 1, 1, 27, 0.0F, false));

		slide91 = new ModelRenderer(this);
		slide91.setRotationPoint(-3.9F, -35.5F, -25.5F);
		slide.addChild(slide91);
		setRotationAngle(slide91, 0.0F, 0.7854F, 0.0F);
		slide91.cubeList.add(new ModelBox(slide91, 80, 14, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		slide91.cubeList.add(new ModelBox(slide91, 80, 14, 0.0F, 0.7F, -0.001F, 1, 1, 1, 0.0F, false));

		slide90 = new ModelRenderer(this);
		slide90.setRotationPoint(0.9F, -35.5F, -25.5F);
		slide.addChild(slide90);
		setRotationAngle(slide90, 0.0F, -2.3562F, 0.0F);
		slide90.cubeList.add(new ModelBox(slide90, 80, 16, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		slide90.cubeList.add(new ModelBox(slide90, 80, 16, 0.001F, 0.7F, 0.0F, 1, 1, 1, 0.0F, false));

		slide89 = new ModelRenderer(this);
		slide89.setRotationPoint(-2.0F, -36.8F, -7.5F);
		slide.addChild(slide89);
		setRotationAngle(slide89, 0.0F, 0.0F, 1.2269F);
		slide89.cubeList.add(new ModelBox(slide89, 37, 22, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		slide88 = new ModelRenderer(this);
		slide88.setRotationPoint(-1.0F, -36.8F, -7.5F);
		slide.addChild(slide88);
		setRotationAngle(slide88, 0.0F, 0.0F, -1.2269F);
		slide88.cubeList.add(new ModelBox(slide88, 24, 65, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		slide87 = new ModelRenderer(this);
		slide87.setRotationPoint(-1.0F, -36.9F, -4.5F);
		slide.addChild(slide87);
		setRotationAngle(slide87, 0.0F, 0.0F, -1.2269F);
		slide87.cubeList.add(new ModelBox(slide87, 89, 33, -1.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		slide86 = new ModelRenderer(this);
		slide86.setRotationPoint(-1.8F, -37.1F, -28.2F);
		slide.addChild(slide86);
		setRotationAngle(slide86, -0.7854F, 0.0F, 0.0F);
		slide86.cubeList.add(new ModelBox(slide86, 80, 18, -0.001F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		slide85 = new ModelRenderer(this);
		slide85.setRotationPoint(-2.2F, -37.1F, -28.2F);
		slide.addChild(slide85);
		setRotationAngle(slide85, -0.7854F, 0.0F, 0.0F);
		slide85.cubeList.add(new ModelBox(slide85, 80, 64, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide84 = new ModelRenderer(this);
		slide84.setRotationPoint(-1.8F, -37.1F, -30.2F);
		slide.addChild(slide84);
		slide84.cubeList.add(new ModelBox(slide84, 67, 60, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		slide83 = new ModelRenderer(this);
		slide83.setRotationPoint(-2.2F, -37.1F, -30.2F);
		slide.addChild(slide83);
		slide83.cubeList.add(new ModelBox(slide83, 34, 68, 0.0F, -0.001F, -0.001F, 1, 1, 2, 0.0F, false));

		slide82 = new ModelRenderer(this);
		slide82.setRotationPoint(-3.1F, -36.7F, 1.5F);
		slide.addChild(slide82);
		setRotationAngle(slide82, -0.8551F, 0.0F, 0.0F);
		

		slide81 = new ModelRenderer(this);
		slide81.setRotationPoint(-0.9F, -36.7F, 1.5F);
		slide.addChild(slide81);
		setRotationAngle(slide81, -1.0995F, 0.0F, 0.0F);
		slide81.cubeList.add(new ModelBox(slide81, 45, 68, 0.001F, 0.0F, 0.3F, 1, 1, 2, 0.0F, false));
		slide81.cubeList.add(new ModelBox(slide81, 5, 53, -2.201F, 0.0F, 0.3F, 1, 1, 2, 0.0F, false));
		slide81.cubeList.add(new ModelBox(slide81, 20, 78, -2.001F, -0.201F, -0.2F, 1, 1, 1, -0.2F, false));
		slide81.cubeList.add(new ModelBox(slide81, 3, 78, -0.201F, -0.201F, -0.2F, 1, 1, 1, -0.2F, false));

		slide80 = new ModelRenderer(this);
		slide80.setRotationPoint(-0.9F, -35.0F, 3.4F);
		slide.addChild(slide80);
		setRotationAngle(slide80, -1.45F, 0.0F, 0.0F);
		slide80.cubeList.add(new ModelBox(slide80, 80, 66, 0.0F, 0.0F, 0.8F, 1, 1, 1, 0.0F, false));

		slide79 = new ModelRenderer(this);
		slide79.setRotationPoint(-3.1F, -35.0F, 3.4F);
		slide.addChild(slide79);
		setRotationAngle(slide79, -1.45F, 0.0F, 0.0F);
		slide79.cubeList.add(new ModelBox(slide79, 0, 81, 0.0F, 0.0F, 0.8F, 1, 1, 1, 0.0F, false));

		slide78 = new ModelRenderer(this);
		slide78.setRotationPoint(-0.9F, -35.0F, 3.4F);
		slide.addChild(slide78);
		setRotationAngle(slide78, -1.45F, 0.0F, 0.0F);
		

		slide77 = new ModelRenderer(this);
		slide77.setRotationPoint(-3.1F, -35.0F, 3.4F);
		slide.addChild(slide77);
		setRotationAngle(slide77, -1.45F, 0.0F, 0.0F);
		

		slide75 = new ModelRenderer(this);
		slide75.setRotationPoint(-3.1F, -35.0F, 3.4F);
		slide.addChild(slide75);
		setRotationAngle(slide75, -2.1192F, 0.0F, 0.0F);
		

		slide73 = new ModelRenderer(this);
		slide73.setRotationPoint(-0.1F, -34.2F, 3.4F);
		slide.addChild(slide73);
		setRotationAngle(slide73, -2.3112F, 0.0F, 0.0F);
		slide73.cubeList.add(new ModelBox(slide73, 42, 22, 0.001F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide73.cubeList.add(new ModelBox(slide73, 14, 27, -3.799F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide73.cubeList.add(new ModelBox(slide73, 14, 30, -0.8F, -0.0738F, -0.0675F, 1, 2, 1, 0.0F, false));
		slide73.cubeList.add(new ModelBox(slide73, 15, 22, -3.0F, -0.0738F, -0.0675F, 1, 2, 1, 0.0F, false));

		slide72 = new ModelRenderer(this);
		slide72.setRotationPoint(-0.1F, -35.0F, 3.3F);
		slide.addChild(slide72);
		setRotationAngle(slide72, -1.45F, 0.0F, 0.0F);
		slide72.cubeList.add(new ModelBox(slide72, 4, 81, 0.0F, 0.0F, 0.8F, 1, 1, 1, 0.0F, false));

		slide71 = new ModelRenderer(this);
		slide71.setRotationPoint(-3.9F, -35.0F, 3.3F);
		slide.addChild(slide71);
		setRotationAngle(slide71, -1.45F, 0.0F, 0.0F);
		slide71.cubeList.add(new ModelBox(slide71, 81, 12, 0.0F, 0.0F, 0.8F, 1, 1, 1, 0.0F, false));

		slide70 = new ModelRenderer(this);
		slide70.setRotationPoint(-3.9F, -35.0F, 3.3F);
		slide.addChild(slide70);
		setRotationAngle(slide70, -1.45F, 0.0F, 0.0F);
		

		slide69 = new ModelRenderer(this);
		slide69.setRotationPoint(-0.1F, -35.0F, 3.3F);
		slide.addChild(slide69);
		setRotationAngle(slide69, -1.45F, 0.0F, 0.0F);
		

		slide68 = new ModelRenderer(this);
		slide68.setRotationPoint(0.0F, -36.2F, -2.5F);
		slide.addChild(slide68);
		setRotationAngle(slide68, -1.041F, 0.0F, 0.0F);
		slide68.cubeList.add(new ModelBox(slide68, 81, 22, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide67 = new ModelRenderer(this);
		slide67.setRotationPoint(0.1F, -36.0F, -1.5F);
		slide.addChild(slide67);
		setRotationAngle(slide67, -1.8264F, 0.0F, 0.0F);
		slide67.cubeList.add(new ModelBox(slide67, 54, 69, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		slide66 = new ModelRenderer(this);
		slide66.setRotationPoint(-0.1F, -35.0F, -1.1F);
		slide.addChild(slide66);
		setRotationAngle(slide66, -0.7854F, 0.0F, 0.0F);
		slide66.cubeList.add(new ModelBox(slide66, 81, 25, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide65 = new ModelRenderer(this);
		slide65.setRotationPoint(-0.1F, -35.0F, -3.9F);
		slide.addChild(slide65);
		setRotationAngle(slide65, -0.7854F, 0.0F, 0.0F);
		slide65.cubeList.add(new ModelBox(slide65, 26, 81, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide64 = new ModelRenderer(this);
		slide64.setRotationPoint(-3.8F, -35.5F, -6.5F);
		slide.addChild(slide64);
		slide64.cubeList.add(new ModelBox(slide64, 14, 65, 0.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F, false));
		slide64.cubeList.add(new ModelBox(slide64, 67, 13, -0.001F, 1.4F, 0.0F, 1, 1, 8, 0.0F, false));

		slide63 = new ModelRenderer(this);
		slide63.setRotationPoint(0.9F, -35.5F, -5.1F);
		slide.addChild(slide63);
		setRotationAngle(slide63, 0.0F, -2.3562F, 0.0F);
		slide63.cubeList.add(new ModelBox(slide63, 42, 40, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide63.cubeList.add(new ModelBox(slide63, 78, 78, 0.001F, 1.4F, -0.001F, 1, 1, 1, 0.0F, false));

		slide62 = new ModelRenderer(this);
		slide62.setRotationPoint(-3.9F, -35.5F, -6.3F);
		slide.addChild(slide62);
		setRotationAngle(slide62, 0.0F, 0.7854F, 0.0F);
		slide62.cubeList.add(new ModelBox(slide62, 19, 53, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide62.cubeList.add(new ModelBox(slide62, 77, 22, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide61 = new ModelRenderer(this);
		slide61.setRotationPoint(-3.9F, -35.5F, -5.9F);
		slide.addChild(slide61);
		setRotationAngle(slide61, 0.0F, 0.7854F, 0.0F);
		slide61.cubeList.add(new ModelBox(slide61, 39, 53, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide61.cubeList.add(new ModelBox(slide61, 63, 77, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide60 = new ModelRenderer(this);
		slide60.setRotationPoint(-3.9F, -35.5F, -5.5F);
		slide.addChild(slide60);
		setRotationAngle(slide60, 0.0F, 0.7854F, 0.0F);
		slide60.cubeList.add(new ModelBox(slide60, 54, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide60.cubeList.add(new ModelBox(slide60, 67, 77, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide59 = new ModelRenderer(this);
		slide59.setRotationPoint(-3.9F, -35.5F, -5.1F);
		slide.addChild(slide59);
		setRotationAngle(slide59, 0.0F, 0.7854F, 0.0F);
		slide59.cubeList.add(new ModelBox(slide59, 54, 5, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide59.cubeList.add(new ModelBox(slide59, 77, 19, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide58 = new ModelRenderer(this);
		slide58.setRotationPoint(-3.9F, -35.5F, -4.7F);
		slide.addChild(slide58);
		setRotationAngle(slide58, 0.0F, 0.7854F, 0.0F);
		slide58.cubeList.add(new ModelBox(slide58, 54, 13, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide58.cubeList.add(new ModelBox(slide58, 77, 17, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide57 = new ModelRenderer(this);
		slide57.setRotationPoint(-3.9F, -35.5F, -4.3F);
		slide.addChild(slide57);
		setRotationAngle(slide57, 0.0F, 0.7854F, 0.0F);
		slide57.cubeList.add(new ModelBox(slide57, 54, 18, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide57.cubeList.add(new ModelBox(slide57, 77, 15, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide56 = new ModelRenderer(this);
		slide56.setRotationPoint(-3.9F, -35.5F, -3.9F);
		slide.addChild(slide56);
		setRotationAngle(slide56, 0.0F, 0.7854F, 0.0F);
		slide56.cubeList.add(new ModelBox(slide56, 54, 26, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide56.cubeList.add(new ModelBox(slide56, 77, 13, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide55 = new ModelRenderer(this);
		slide55.setRotationPoint(-3.9F, -35.5F, -3.5F);
		slide.addChild(slide55);
		setRotationAngle(slide55, 0.0F, 0.7854F, 0.0F);
		slide55.cubeList.add(new ModelBox(slide55, 54, 33, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide55.cubeList.add(new ModelBox(slide55, 76, 8, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide54 = new ModelRenderer(this);
		slide54.setRotationPoint(-3.9F, -35.5F, -3.1F);
		slide.addChild(slide54);
		setRotationAngle(slide54, 0.0F, 0.7854F, 0.0F);
		slide54.cubeList.add(new ModelBox(slide54, 54, 38, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide54.cubeList.add(new ModelBox(slide54, 73, 22, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide53 = new ModelRenderer(this);
		slide53.setRotationPoint(-3.9F, -35.5F, -2.7F);
		slide.addChild(slide53);
		setRotationAngle(slide53, 0.0F, 0.7854F, 0.0F);
		slide53.cubeList.add(new ModelBox(slide53, 19, 59, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide53.cubeList.add(new ModelBox(slide53, 72, 8, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide52 = new ModelRenderer(this);
		slide52.setRotationPoint(-3.9F, -35.5F, -2.3F);
		slide.addChild(slide52);
		setRotationAngle(slide52, 0.0F, 0.7854F, 0.0F);
		slide52.cubeList.add(new ModelBox(slide52, 27, 59, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide52.cubeList.add(new ModelBox(slide52, 16, 69, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide51 = new ModelRenderer(this);
		slide51.setRotationPoint(-3.9F, -35.5F, -1.9F);
		slide.addChild(slide51);
		setRotationAngle(slide51, 0.0F, 0.7854F, 0.0F);
		slide51.cubeList.add(new ModelBox(slide51, 60, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide51.cubeList.add(new ModelBox(slide51, 0, 69, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide50 = new ModelRenderer(this);
		slide50.setRotationPoint(-3.9F, -35.5F, -1.5F);
		slide.addChild(slide50);
		setRotationAngle(slide50, 0.0F, 0.7854F, 0.0F);
		slide50.cubeList.add(new ModelBox(slide50, 60, 5, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide50.cubeList.add(new ModelBox(slide50, 67, 64, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide49 = new ModelRenderer(this);
		slide49.setRotationPoint(-3.9F, -35.5F, -1.1F);
		slide.addChild(slide49);
		setRotationAngle(slide49, 0.0F, 0.7854F, 0.0F);
		slide49.cubeList.add(new ModelBox(slide49, 60, 13, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide49.cubeList.add(new ModelBox(slide49, 7, 62, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide48 = new ModelRenderer(this);
		slide48.setRotationPoint(-3.9F, -35.5F, -0.7F);
		slide.addChild(slide48);
		setRotationAngle(slide48, 0.0F, 0.7854F, 0.0F);
		slide48.cubeList.add(new ModelBox(slide48, 60, 18, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide48.cubeList.add(new ModelBox(slide48, 19, 56, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide47 = new ModelRenderer(this);
		slide47.setRotationPoint(-3.9F, -35.5F, -0.3F);
		slide.addChild(slide47);
		setRotationAngle(slide47, 0.0F, 0.7854F, 0.0F);
		slide47.cubeList.add(new ModelBox(slide47, 60, 33, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide47.cubeList.add(new ModelBox(slide47, 54, 29, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide46 = new ModelRenderer(this);
		slide46.setRotationPoint(-3.9F, -35.5F, 0.1F);
		slide.addChild(slide46);
		setRotationAngle(slide46, 0.0F, 0.7854F, 0.0F);
		slide46.cubeList.add(new ModelBox(slide46, 60, 38, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide46.cubeList.add(new ModelBox(slide46, 42, 43, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide45 = new ModelRenderer(this);
		slide45.setRotationPoint(-3.9F, -35.5F, 0.5F);
		slide.addChild(slide45);
		setRotationAngle(slide45, 0.0F, 0.7854F, 0.0F);
		slide45.cubeList.add(new ModelBox(slide45, 67, 26, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide45.cubeList.add(new ModelBox(slide45, 26, 42, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide44 = new ModelRenderer(this);
		slide44.setRotationPoint(-3.9F, -35.5F, 0.9F);
		slide.addChild(slide44);
		setRotationAngle(slide44, 0.0F, 0.7854F, 0.0F);
		slide44.cubeList.add(new ModelBox(slide44, 69, 53, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide44.cubeList.add(new ModelBox(slide44, 11, 42, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide43 = new ModelRenderer(this);
		slide43.setRotationPoint(-3.9F, -35.5F, 1.3F);
		slide.addChild(slide43);
		setRotationAngle(slide43, 0.0F, 0.7854F, 0.0F);
		slide43.cubeList.add(new ModelBox(slide43, 69, 56, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide43.cubeList.add(new ModelBox(slide43, 14, 33, -0.001F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));

		slide42 = new ModelRenderer(this);
		slide42.setRotationPoint(-0.2F, -35.5F, -6.5F);
		slide.addChild(slide42);
		slide42.cubeList.add(new ModelBox(slide42, 16, 65, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));
		slide42.cubeList.add(new ModelBox(slide42, 34, 65, 0.001F, 1.4F, 0.0F, 1, 1, 2, 0.0F, false));

		slide41 = new ModelRenderer(this);
		slide41.setRotationPoint(-0.2F, -35.5F, -0.5F);
		slide.addChild(slide41);
		slide41.cubeList.add(new ModelBox(slide41, 26, 53, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));
		slide41.cubeList.add(new ModelBox(slide41, 55, 66, 0.001F, 1.4F, 0.0F, 1, 1, 2, 0.0F, false));

		slide40 = new ModelRenderer(this);
		slide40.setRotationPoint(-0.3F, -35.5F, -4.0F);
		slide.addChild(slide40);
		slide40.cubeList.add(new ModelBox(slide40, 67, 13, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		slide39 = new ModelRenderer(this);
		slide39.setRotationPoint(-0.1F, -34.5F, -4.1F);
		slide.addChild(slide39);
		slide39.cubeList.add(new ModelBox(slide39, 67, 17, 0.001F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		slide38 = new ModelRenderer(this);
		slide38.setRotationPoint(-0.1F, -35.5F, -4.9F);
		slide.addChild(slide38);
		slide38.cubeList.add(new ModelBox(slide38, 9, 73, 0.003F, 0.0F, -0.001F, 1, 2, 1, 0.0F, false));

		slide37 = new ModelRenderer(this);
		slide37.setRotationPoint(-0.1F, -35.5F, -1.1F);
		slide.addChild(slide37);
		slide37.cubeList.add(new ModelBox(slide37, 74, 64, 0.001F, 0.0F, -0.001F, 1, 2, 1, 0.0F, false));

		slide36 = new ModelRenderer(this);
		slide36.setRotationPoint(0.9F, -35.5F, -5.5F);
		slide.addChild(slide36);
		setRotationAngle(slide36, 0.0F, -2.3562F, 0.0F);
		slide36.cubeList.add(new ModelBox(slide36, 12, 75, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide36.cubeList.add(new ModelBox(slide36, 57, 78, 0.001F, 1.4F, -0.001F, 1, 1, 1, 0.0F, false));

		slide35 = new ModelRenderer(this);
		slide35.setRotationPoint(0.9F, -35.5F, -5.9F);
		slide.addChild(slide35);
		setRotationAngle(slide35, 0.0F, -2.3562F, 0.0F);
		slide35.cubeList.add(new ModelBox(slide35, 20, 75, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide35.cubeList.add(new ModelBox(slide35, 78, 43, 0.001F, 1.4F, -0.001F, 1, 1, 1, 0.0F, false));

		slide34 = new ModelRenderer(this);
		slide34.setRotationPoint(0.9F, -35.5F, -6.3F);
		slide.addChild(slide34);
		setRotationAngle(slide34, 0.0F, -2.3562F, 0.0F);
		slide34.cubeList.add(new ModelBox(slide34, 27, 75, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide34.cubeList.add(new ModelBox(slide34, 27, 78, 0.001F, 1.4F, -0.001F, 1, 1, 1, 0.0F, false));

		slide33 = new ModelRenderer(this);
		slide33.setRotationPoint(0.9F, -35.5F, 0.1F);
		slide.addChild(slide33);
		setRotationAngle(slide33, 0.0F, -2.3562F, 0.0F);
		slide33.cubeList.add(new ModelBox(slide33, 34, 75, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide33.cubeList.add(new ModelBox(slide33, 79, 69, 0.001F, 1.4F, 0.001F, 1, 1, 1, 0.0F, false));

		slide32 = new ModelRenderer(this);
		slide32.setRotationPoint(0.9F, -35.5F, 0.5F);
		slide.addChild(slide32);
		setRotationAngle(slide32, 0.0F, -2.3562F, 0.0F);
		slide32.cubeList.add(new ModelBox(slide32, 75, 53, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide32.cubeList.add(new ModelBox(slide32, 79, 37, 0.001F, 1.4F, 0.001F, 1, 1, 1, 0.0F, false));

		slide31 = new ModelRenderer(this);
		slide31.setRotationPoint(0.9F, -35.5F, 0.9F);
		slide.addChild(slide31);
		setRotationAngle(slide31, 0.0F, -2.3562F, 0.0F);
		slide31.cubeList.add(new ModelBox(slide31, 75, 58, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide31.cubeList.add(new ModelBox(slide31, 79, 35, 0.001F, 1.4F, 0.001F, 1, 1, 1, 0.0F, false));

		slide30 = new ModelRenderer(this);
		slide30.setRotationPoint(0.9F, -35.5F, 1.3F);
		slide.addChild(slide30);
		setRotationAngle(slide30, 0.0F, -2.3562F, 0.0F);
		slide30.cubeList.add(new ModelBox(slide30, 0, 76, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide30.cubeList.add(new ModelBox(slide30, 79, 33, 0.001F, 1.4F, 0.001F, 1, 1, 1, 0.0F, false));

		slide29 = new ModelRenderer(this);
		slide29.setRotationPoint(-0.1F, -33.5F, -24.5F);
		slide.addChild(slide29);
		setRotationAngle(slide29, 2.3562F, 0.0F, 0.0F);
		

		slide28 = new ModelRenderer(this);
		slide28.setRotationPoint(-3.9F, -33.5F, -24.5F);
		slide.addChild(slide28);
		setRotationAngle(slide28, 2.3562F, 0.0F, 0.0F);
		

		slide27 = new ModelRenderer(this);
		slide27.setRotationPoint(-3.9F, -35.5F, -25.5F);
		slide.addChild(slide27);
		slide27.cubeList.add(new ModelBox(slide27, 81, 27, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		slide27.cubeList.add(new ModelBox(slide27, 81, 27, -0.001F, 0.7F, 0.0F, 1, 1, 1, 0.0F, false));

		slide26 = new ModelRenderer(this);
		slide26.setRotationPoint(-0.1F, -35.5F, -25.5F);
		slide.addChild(slide26);
		slide26.cubeList.add(new ModelBox(slide26, 34, 81, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		slide26.cubeList.add(new ModelBox(slide26, 34, 81, 0.001F, 0.7F, 0.0F, 1, 1, 1, 0.0F, false));

		slide29_r1 = new ModelRenderer(this);
		slide29_r1.setRotationPoint(1.001F, 1.7F, 0.0F);
		slide26.addChild(slide29_r1);
		setRotationAngle(slide29_r1, -0.5585F, 0.0F, 0.0F);
		slide29_r1.cubeList.add(new ModelBox(slide29_r1, 13, 92, -4.799F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		slide29_r1.cubeList.add(new ModelBox(slide29_r1, 13, 92, -0.999F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide25 = new ModelRenderer(this);
		slide25.setRotationPoint(-0.1F, -34.5F, -25.5F);
		slide.addChild(slide25);
		setRotationAngle(slide25, 0.7854F, 0.0F, 0.0F);
		

		slide24 = new ModelRenderer(this);
		slide24.setRotationPoint(-3.9F, -34.5F, -25.5F);
		slide.addChild(slide24);
		setRotationAngle(slide24, 0.7854F, 0.0F, 0.0F);
		

		slide23 = new ModelRenderer(this);
		slide23.setRotationPoint(-3.6F, -33.7F, -30.5F);
		slide.addChild(slide23);
		setRotationAngle(slide23, 0.0F, 0.0F, -2.1192F);
		slide23.cubeList.add(new ModelBox(slide23, 45, 68, -1.0F, 0.0F, -0.001F, 1, 1, 7, 0.0F, false));

		slide22 = new ModelRenderer(this);
		slide22.setRotationPoint(0.6F, -33.7F, -30.5F);
		slide.addChild(slide22);
		setRotationAngle(slide22, 0.0F, 0.0F, 2.1192F);
		slide22.cubeList.add(new ModelBox(slide22, 0, 73, 0.0F, 0.0F, -0.001F, 1, 1, 7, 0.0F, false));

		slide21 = new ModelRenderer(this);
		slide21.setRotationPoint(-3.0F, -34.7F, -30.5F);
		slide.addChild(slide21);
		slide21.cubeList.add(new ModelBox(slide21, 67, 33, 0.0F, 0.0F, -0.002F, 3, 2, 6, 0.0F, false));

		slide20 = new ModelRenderer(this);
		slide20.setRotationPoint(-0.4F, -35.5F, -30.5F);
		slide.addChild(slide20);
		slide20.cubeList.add(new ModelBox(slide20, 19, 53, 0.001F, 0.0F, -0.001F, 1, 1, 5, 0.0F, false));

		slide19 = new ModelRenderer(this);
		slide19.setRotationPoint(-0.4F, -34.7F, -30.5F);
		slide.addChild(slide19);
		slide19.cubeList.add(new ModelBox(slide19, 93, 54, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		slide18 = new ModelRenderer(this);
		slide18.setRotationPoint(-3.6F, -34.7F, -30.5F);
		slide.addChild(slide18);
		slide18.cubeList.add(new ModelBox(slide18, 93, 61, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		slide17 = new ModelRenderer(this);
		slide17.setRotationPoint(-3.6F, -35.5F, -30.5F);
		slide.addChild(slide17);
		slide17.cubeList.add(new ModelBox(slide17, 20, 75, -0.001F, 0.0F, -0.001F, 1, 1, 5, 0.0F, false));

		slide16 = new ModelRenderer(this);
		slide16.setRotationPoint(0.6F, -35.5F, -30.5F);
		slide.addChild(slide16);
		setRotationAngle(slide16, 0.0F, 0.0F, 1.041F);
		slide16.cubeList.add(new ModelBox(slide16, 0, 53, -1.22F, 0.0F, 0.0F, 1, 1, 32, 0.0F, false));

		slide15 = new ModelRenderer(this);
		slide15.setRotationPoint(0.6F, -35.5F, -30.5F);
		slide.addChild(slide15);
		setRotationAngle(slide15, 0.0F, 0.0F, 1.041F);
		slide15.cubeList.add(new ModelBox(slide15, 54, 0, -1.0F, 0.001F, 0.001F, 1, 1, 32, 0.0F, false));

		slide14 = new ModelRenderer(this);
		slide14.setRotationPoint(-1.0F, -36.9F, -30.5F);
		slide.addChild(slide14);
		setRotationAngle(slide14, 0.0F, 0.0F, -1.2269F);
		slide14.cubeList.add(new ModelBox(slide14, 0, 86, -1.0F, 0.0F, -0.001F, 1, 1, 23, 0.0F, false));

		slide13 = new ModelRenderer(this);
		slide13.setRotationPoint(-3.6F, -35.5F, -7.5F);
		slide.addChild(slide13);
		setRotationAngle(slide13, 0.0F, 0.0F, -1.041F);
		slide13.cubeList.add(new ModelBox(slide13, 23, 11, 0.2F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		slide12 = new ModelRenderer(this);
		slide12.setRotationPoint(-2.0F, -36.9F, -4.5F);
		slide.addChild(slide12);
		setRotationAngle(slide12, 0.0F, 0.0F, 1.2269F);
		slide12.cubeList.add(new ModelBox(slide12, 25, 94, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		slide11 = new ModelRenderer(this);
		slide11.setRotationPoint(-3.6F, -35.5F, -7.5F);
		slide.addChild(slide11);
		setRotationAngle(slide11, 0.0F, 0.0F, -1.041F);
		slide11.cubeList.add(new ModelBox(slide11, 63, 64, 0.0F, 0.001F, -0.001F, 1, 1, 9, 0.0F, false));

		slide10 = new ModelRenderer(this);
		slide10.setRotationPoint(-2.0F, -36.9F, -7.5F);
		slide.addChild(slide10);
		slide10.cubeList.add(new ModelBox(slide10, 24, 69, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		slide9 = new ModelRenderer(this);
		slide9.setRotationPoint(-3.6F, -35.5F, -30.5F);
		slide.addChild(slide9);
		setRotationAngle(slide9, 0.0F, 0.0F, -1.041F);
		slide9.cubeList.add(new ModelBox(slide9, 0, 22, 0.2F, 0.0F, 0.0F, 1, 1, 19, 0.0F, false));
		slide9.cubeList.add(new ModelBox(slide9, 9, 22, -0.4F, 0.0F, 19.0F, 1, 1, 4, 0.0F, false));

		slide8 = new ModelRenderer(this);
		slide8.setRotationPoint(-3.6F, -35.5F, -30.5F);
		slide.addChild(slide8);
		setRotationAngle(slide8, 0.0F, 0.0F, -1.041F);
		slide8.cubeList.add(new ModelBox(slide8, 88, 0, 0.0F, 0.001F, 0.001F, 1, 1, 19, 0.0F, false));

		slide7 = new ModelRenderer(this);
		slide7.setRotationPoint(-2.0F, -36.9F, -30.5F);
		slide.addChild(slide7);
		setRotationAngle(slide7, 0.0F, 0.0F, 1.2269F);
		slide7.cubeList.add(new ModelBox(slide7, 93, 34, 0.0F, 0.0F, -0.001F, 1, 1, 19, 0.0F, false));

		slide6 = new ModelRenderer(this);
		slide6.setRotationPoint(-2.0F, -37.0F, -4.5F);
		slide.addChild(slide6);
		slide6.cubeList.add(new ModelBox(slide6, 48, 94, 0.0F, 0.0F, 0.001F, 1, 1, 6, 0.0F, false));

		slide5 = new ModelRenderer(this);
		slide5.setRotationPoint(-2.0F, -37.0F, -30.5F);
		slide.addChild(slide5);
		slide5.cubeList.add(new ModelBox(slide5, 93, 54, 0.0F, 0.0F, 0.0F, 1, 1, 19, 0.0F, false));

		slide4 = new ModelRenderer(this);
		slide4.setRotationPoint(-3.9F, -35.5F, -24.5F);
		slide.addChild(slide4);
		slide4.cubeList.add(new ModelBox(slide4, 98, 74, 0.0F, 0.0F, 0.0F, 1, 2, 18, 0.0F, false));

		slide3 = new ModelRenderer(this);
		slide3.setRotationPoint(-0.1F, -35.5F, -24.5F);
		slide.addChild(slide3);
		slide3.cubeList.add(new ModelBox(slide3, 100, 94, 0.0F, 0.0F, 0.0F, 1, 2, 18, 0.0F, false));
		slide3.cubeList.add(new ModelBox(slide3, 30, 106, 0.001F, 1.4F, -0.001F, 1, 1, 18, 0.0F, false));
		slide3.cubeList.add(new ModelBox(slide3, 75, 104, -3.799F, 1.4F, -0.001F, 1, 1, 18, 0.0F, false));
		slide3.cubeList.add(new ModelBox(slide3, 11, 35, 0.002F, 1.4F, 19.599F, 1, 1, 3, 0.0F, false));
		slide3.cubeList.add(new ModelBox(slide3, 67, 33, 0.003F, 1.4F, 22.399F, 1, 1, 2, 0.0F, false));

		slide2 = new ModelRenderer(this);
		slide2.setRotationPoint(-0.1F, -35.5F, 1.5F);
		slide.addChild(slide2);
		slide2.cubeList.add(new ModelBox(slide2, 80, 0, 0.0F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));
		slide2.cubeList.add(new ModelBox(slide2, 75, 77, -3.8F, 1.4F, 0.0F, 1, 1, 1, 0.0F, false));
		slide2.cubeList.add(new ModelBox(slide2, 78, 24, -0.001F, 0.7F, 0.0F, 1, 1, 1, 0.0F, false));
		slide2.cubeList.add(new ModelBox(slide2, 71, 77, -3.801F, 0.7F, 0.0F, 1, 1, 1, 0.0F, false));

		slide1 = new ModelRenderer(this);
		slide1.setRotationPoint(-3.9F, -35.5F, 1.5F);
		slide.addChild(slide1);
		

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		mag7 = new ModelRenderer(this);
		mag7.setRotationPoint(-2.5F, -28.7F, -5.4F);
		mag.addChild(mag7);
		setRotationAngle(mag7, 0.2231F, 0.0F, 0.0F);
		mag7.cubeList.add(new ModelBox(mag7, 70, 81, -0.4F, 0.3F, 0.2F, 2, 13, 3, 0.0F, false));
		mag7.cubeList.add(new ModelBox(mag7, 70, 81, 0.4F, 0.3F, 0.2F, 2, 13, 3, 0.0F, false));

		mag6 = new ModelRenderer(this);
		mag6.setRotationPoint(-3.0F, -17.7F, -2.4F);
		mag.addChild(mag6);
		mag6.cubeList.add(new ModelBox(mag6, 93, 68, 0.0F, 0.9F, 0.0F, 3, 2, 3, 0.0F, false));
		mag6.cubeList.add(new ModelBox(mag6, 118, 62, -0.001F, 0.899F, 2.6F, 3, 2, 1, 0.0F, false));

		mag5 = new ModelRenderer(this);
		mag5.setRotationPoint(-3.0F, -30.4F, -5.6F);
		mag.addChild(mag5);
		setRotationAngle(mag5, 0.1487F, 0.0F, 0.0F);
		mag5.cubeList.add(new ModelBox(mag5, 88, 8, 0.001F, 0.0F, 0.0F, 3, 3, 4, 0.0F, false));

		mag3 = new ModelRenderer(this);
		mag3.setRotationPoint(-3.0F, -29.9F, -6.4F);
		mag.addChild(mag3);
		setRotationAngle(mag3, 0.2231F, 0.0F, 0.0F);
		mag3.cubeList.add(new ModelBox(mag3, 0, 111, -0.001F, 0.3F, 0.0F, 3, 15, 1, 0.0F, false));

		mag2 = new ModelRenderer(this);
		mag2.setRotationPoint(-0.3F, -15.9F, -4.6F);
		mag.addChild(mag2);
		setRotationAngle(mag2, -0.0744F, 0.0F, 0.0F);
		

		mag4 = new ModelRenderer(this);
		mag4.setRotationPoint(-3.0F, -29.9F, -3.4F);
		mag.addChild(mag4);
		setRotationAngle(mag4, 0.2231F, 0.0F, 0.0F);
		mag4.cubeList.add(new ModelBox(mag4, 12, 111, 0.0F, 0.3F, 0.9F, 3, 15, 1, 0.0F, false));

		mag1 = new ModelRenderer(this);
		mag1.setRotationPoint(-3.7F, -15.9F, -4.6F);
		mag.addChild(mag1);
		setRotationAngle(mag1, -0.0744F, 0.0F, 0.0F);
		mag1.cubeList.add(new ModelBox(mag1, 0, 14, 0.2F, 0.1F, 0.0F, 4, 1, 6, 0.0F, false));

		hammer = new ModelRenderer(this);
		hammer.setRotationPoint(0.0F, -9.4F, 2.3F);
		setRotationAngle(hammer, -0.8378F, 0.0F, 0.0F);
		

		gun1822 = new ModelRenderer(this);
		gun1822.setRotationPoint(-2.0F, -2.0F, 0.7F);
		hammer.addChild(gun1822);
		setRotationAngle(gun1822, -0.7436F, 0.0F, 0.0F);
		gun1822.cubeList.add(new ModelBox(gun1822, 9, 77, -0.001F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun168 = new ModelRenderer(this);
		gun168.setRotationPoint(-2.0F, -2.0F, 0.7F);
		hammer.addChild(gun168);
		setRotationAngle(gun168, -0.7436F, 0.0F, 0.0F);
		gun168.cubeList.add(new ModelBox(gun168, 54, 76, -0.002F, 0.3F, 0.2F, 1, 2, 1, 0.0F, false));

		gun169 = new ModelRenderer(this);
		gun169.setRotationPoint(-2.0F, -2.0F, 0.7F);
		hammer.addChild(gun169);
		setRotationAngle(gun169, -0.7436F, 0.0F, 0.0F);
		gun169.cubeList.add(new ModelBox(gun169, 50, 76, 0.0F, 0.3F, -0.2F, 1, 2, 1, 0.0F, false));

		gun167 = new ModelRenderer(this);
		gun167.setRotationPoint(-2.5F, -0.4F, 1.2F);
		hammer.addChild(gun167);
		setRotationAngle(gun167, -2.1192F, 0.0F, 0.0F);
		gun167.cubeList.add(new ModelBox(gun167, 21, 26, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun183 = new ModelRenderer(this);
		gun183.setRotationPoint(-2.5F, -0.4F, 1.2F);
		hammer.addChild(gun183);
		setRotationAngle(gun183, -1.45F, 0.0F, 0.0F);
		gun183.cubeList.add(new ModelBox(gun183, 42, 76, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-4.0F, -29.0F, -6.0F);
		grip.addChild(gun13);
		setRotationAngle(gun13, 0.2231F, 0.0F, 0.0F);
		gun13.cubeList.add(new ModelBox(gun13, 21, 22, 0.002F, 0.0F, 0.0F, 5, 13, 6, 0.0F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(4.0F, 29.0F, 6.0F);
		gun13.addChild(gun15_r1);
		setRotationAngle(gun15_r1, -0.0873F, 0.0F, 0.0F);
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 14, 14, -4.298F, -19.1981F, -4.6314F, 1, 2, 2, -0.2F, false));
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 21, 22, 0.302F, -19.1981F, -4.6314F, 1, 2, 2, -0.2F, false));

		gun145 = new ModelRenderer(this);
		gun145.setRotationPoint(-4.0F, -31.1F, -3.4F);
		grip.addChild(gun145);
		setRotationAngle(gun145, -0.1115F, 0.0F, 0.0F);
		gun145.cubeList.add(new ModelBox(gun145, 14, 42, 0.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F, false));

		gun143 = new ModelRenderer(this);
		gun143.setRotationPoint(-4.0F, -30.0F, -6.2F);
		grip.addChild(gun143);
		setRotationAngle(gun143, 0.3718F, 0.0F, 0.0F);
		gun143.cubeList.add(new ModelBox(gun143, 88, 27, 0.001F, 0.0F, 0.0F, 5, 2, 3, 0.0F, false));

		gun144 = new ModelRenderer(this);
		gun144.setRotationPoint(-4.0F, -30.0F, -6.2F);
		grip.addChild(gun144);
		setRotationAngle(gun144, 0.2231F, 0.0F, 0.0F);
		gun144.cubeList.add(new ModelBox(gun144, 45, 65, 0.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, false));

		gun135 = new ModelRenderer(this);
		gun135.setRotationPoint(-4.0F, -30.5F, -3.2F);
		grip.addChild(gun135);
		gun135.cubeList.add(new ModelBox(gun135, 67, 26, 0.0015F, 0.0F, 0.0F, 5, 1, 4, 0.0F, false));

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(-4.0F, -30.5F, 0.8F);
		grip.addChild(gun87);
		setRotationAngle(gun87, -1.3013F, 0.0F, 0.0F);
		gun87.cubeList.add(new ModelBox(gun87, 88, 0, 0.0F, 0.0F, 0.0F, 1, 2, 6, 0.0F, false));

		gun127 = new ModelRenderer(this);
		gun127.setRotationPoint(-4.0F, -23.7F, 2.5F);
		grip.addChild(gun127);
		setRotationAngle(gun127, -3.0486F, 0.0F, 0.0F);
		gun127.cubeList.add(new ModelBox(gun127, 0, 73, -0.001F, 0.0F, 0.001F, 1, 1, 2, 0.0F, false));

		gun91 = new ModelRenderer(this);
		gun91.setRotationPoint(-4.0F, -17.6F, 3.2F);
		grip.addChild(gun91);
		setRotationAngle(gun91, -3.0486F, 0.0F, 0.0F);
		gun91.cubeList.add(new ModelBox(gun91, 63, 64, 0.001F, 0.0F, 0.0F, 1, 7, 2, 0.0F, false));

		gun178 = new ModelRenderer(this);
		gun178.setRotationPoint(-3.5F, -17.6F, 3.2F);
		grip.addChild(gun178);
		setRotationAngle(gun178, -3.0486F, 0.0F, 0.0F);
		

		gun174 = new ModelRenderer(this);
		gun174.setRotationPoint(-3.5F, -30.5F, 0.8F);
		grip.addChild(gun174);
		setRotationAngle(gun174, -1.3013F, 0.0F, 0.0F);
		gun174.cubeList.add(new ModelBox(gun174, 25, 86, 0.0F, -0.001F, 0.0F, 1, 2, 6, 0.0F, false));

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(-4.0F, -18.5F, -3.3F);
		grip.addChild(gun89);
		gun89.cubeList.add(new ModelBox(gun89, 0, 65, 0.0F, 0.0F, 0.0F, 5, 2, 6, 0.0F, false));

		gun93 = new ModelRenderer(this);
		gun93.setRotationPoint(-4.0F, -17.6F, 2.2F);
		grip.addChild(gun93);
		gun93.cubeList.add(new ModelBox(gun93, 42, 81, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun172 = new ModelRenderer(this);
		gun172.setRotationPoint(0.0F, -30.5F, 0.8F);
		grip.addChild(gun172);
		setRotationAngle(gun172, -1.3013F, 0.0F, 0.0F);
		gun172.cubeList.add(new ModelBox(gun172, 48, 86, 0.0F, 0.0F, 0.0F, 1, 2, 6, 0.0F, false));

		gun175 = new ModelRenderer(this);
		gun175.setRotationPoint(-0.5F, -30.5F, 0.8F);
		grip.addChild(gun175);
		setRotationAngle(gun175, -1.3013F, 0.0F, 0.0F);
		gun175.cubeList.add(new ModelBox(gun175, 72, 0, 0.0F, -0.001F, 0.0F, 1, 2, 6, 0.0F, false));

		gun173 = new ModelRenderer(this);
		gun173.setRotationPoint(0.0F, -23.7F, 2.5F);
		grip.addChild(gun173);
		setRotationAngle(gun173, -3.0486F, 0.0F, 0.0F);
		gun173.cubeList.add(new ModelBox(gun173, 54, 72, 0.001F, 0.0F, 0.001F, 1, 1, 2, 0.0F, false));

		gun171 = new ModelRenderer(this);
		gun171.setRotationPoint(0.0F, -17.6F, 3.2F);
		grip.addChild(gun171);
		setRotationAngle(gun171, -3.0486F, 0.0F, 0.0F);
		gun171.cubeList.add(new ModelBox(gun171, 63, 53, -0.001F, 0.0F, 0.0F, 1, 7, 2, 0.0F, false));

		gun179 = new ModelRenderer(this);
		gun179.setRotationPoint(-0.5F, -17.6F, 3.2F);
		grip.addChild(gun179);
		setRotationAngle(gun179, -3.0486F, 0.0F, 0.0F);
		

		gun176 = new ModelRenderer(this);
		gun176.setRotationPoint(-3.5F, -23.7F, 2.5F);
		grip.addChild(gun176);
		setRotationAngle(gun176, -3.0486F, 0.0F, 0.0F);
		gun176.cubeList.add(new ModelBox(gun176, 72, 3, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun177 = new ModelRenderer(this);
		gun177.setRotationPoint(-0.5F, -23.7F, 2.5F);
		grip.addChild(gun177);
		setRotationAngle(gun177, -3.0486F, 0.0F, 0.0F);
		gun177.cubeList.add(new ModelBox(gun177, 72, 0, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(0.0F, -17.6F, 2.2F);
		grip.addChild(gun170);
		gun170.cubeList.add(new ModelBox(gun170, 38, 81, 0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 7.2F, 3.0F);
		stock.cubeList.add(new ModelBox(stock, 63, 53, -3.499F, -7.1F, 1.0F, 4, 2, 22, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, -12.7F, 27.7F);
		stock.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7679F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -4.002F, 0.0F, 0.0F, 4, 9, 5, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.8F, 3.4F, -7.9F);
		stock.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0524F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 22, -0.901F, -15.9F, 49.0F, 2, 11, 5, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 65, -1.001F, -10.1F, 42.0F, 2, 3, 7, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.2F, 2.6F, -6.8F);
		stock.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0524F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 18, -1.001F, -8.1F, 42.0F, 2, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.2F, 3.5F, 0.0F);
		stock.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0524F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 0, -1.001F, -9.1F, 42.0F, 2, 2, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.5F, 0.0F, 0.0F);
		stock.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 70, 77, -4.001F, -14.1F, 27.0F, 4, 7, 20, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -4.001F, -7.1F, 1.0F, 4, 7, 46, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.5F, 0.0F, 0.0F);
		stock.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 0, -4.0F, -7.0F, 0.8F, 4, 7, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 11, -3.5F, -7.0F, -0.1F, 3, 7, 1, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		gun.render(f5);
//		slide.render(f5);
//		mag.render(f5);
//		hammer.render(f5);
//		grip.render(f5);
		stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
