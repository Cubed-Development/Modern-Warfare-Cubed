package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KS23Mstock extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun145;
	private final ModelRenderer gun144;
	private final ModelRenderer gun143;
	private final ModelRenderer gun142;
	private final ModelRenderer gun1422;
	private final ModelRenderer gun141;
	private final ModelRenderer gun140;
	private final ModelRenderer gun139;
	private final ModelRenderer gun138;
	private final ModelRenderer gun14;
	private final ModelRenderer gun137;
	private final ModelRenderer gun136;
	private final ModelRenderer gun135;
	private final ModelRenderer gun134;
	private final ModelRenderer gun132;
	private final ModelRenderer gun131;
	private final ModelRenderer gun129;
	private final ModelRenderer gun123;
	private final ModelRenderer gun122;
	private final ModelRenderer gun121;
	private final ModelRenderer gun120;
	private final ModelRenderer gun119;
	private final ModelRenderer gun118;
	private final ModelRenderer gun117;
	private final ModelRenderer gun115;
	private final ModelRenderer gun114;
	private final ModelRenderer gun113;
	private final ModelRenderer gun112;
	private final ModelRenderer gun111;
	private final ModelRenderer gun109;
	private final ModelRenderer gun108;
	private final ModelRenderer gun107;
	private final ModelRenderer gun106;
	private final ModelRenderer gun72;
	private final ModelRenderer gun70;
	private final ModelRenderer gun68;
	private final ModelRenderer gun67;
	private final ModelRenderer gun49;
	private final ModelRenderer gun48;
	private final ModelRenderer gun47;
	private final ModelRenderer gun46;
	private final ModelRenderer gun45;
	private final ModelRenderer gun44;
	private final ModelRenderer gun43;
	private final ModelRenderer gun42;
	private final ModelRenderer gun22;
	private final ModelRenderer gun21;
	private final ModelRenderer gun19;
	private final ModelRenderer gun18;
	private final ModelRenderer gun16;
	private final ModelRenderer gun13;
	private final ModelRenderer gun12;
	private final ModelRenderer gun11;
	private final ModelRenderer gun126;
	private final ModelRenderer gun13_r1;
	private final ModelRenderer gun127;
	private final ModelRenderer gun14_r1;
	private final ModelRenderer gun10;
	private final ModelRenderer gun9;
	private final ModelRenderer gun8;
	private final ModelRenderer gun71;
	private final ModelRenderer barrel;
	private final ModelRenderer gun148_r1;
	private final ModelRenderer gun147;
	private final ModelRenderer gun146;
	private final ModelRenderer gun64;
	private final ModelRenderer gun63;
	private final ModelRenderer gun62;
	private final ModelRenderer gun61;
	private final ModelRenderer gun60;
	private final ModelRenderer gun59;
	private final ModelRenderer gun58;
	private final ModelRenderer gun57;
	private final ModelRenderer gun51;
	private final ModelRenderer gun50;
	private final ModelRenderer gun41;
	private final ModelRenderer gun40;
	private final ModelRenderer gun39;
	private final ModelRenderer gun38;
	private final ModelRenderer gun37;
	private final ModelRenderer gun36;
	private final ModelRenderer pump;
	private final ModelRenderer pump34_r1;
	private final ModelRenderer pump30;
	private final ModelRenderer pump29;
	private final ModelRenderer pump28;
	private final ModelRenderer pump27;
	private final ModelRenderer pump26;
	private final ModelRenderer pump25;
	private final ModelRenderer pump24;
	private final ModelRenderer pump23;
	private final ModelRenderer pump22;
	private final ModelRenderer pump21;
	private final ModelRenderer pump20;
	private final ModelRenderer pump19;
	private final ModelRenderer pump18;
	private final ModelRenderer pump17;
	private final ModelRenderer pump16;
	private final ModelRenderer pump15;
	private final ModelRenderer pump14;
	private final ModelRenderer pump13;
	private final ModelRenderer pump12;
	private final ModelRenderer pump11;
	private final ModelRenderer pump10;
	private final ModelRenderer pump6;
	private final ModelRenderer pump5;
	private final ModelRenderer stock;
	private final ModelRenderer gun95;
	private final ModelRenderer gun94;
	private final ModelRenderer gun93;
	private final ModelRenderer gun92;
	private final ModelRenderer gun91;
	private final ModelRenderer gun90;
	private final ModelRenderer gun89;
	private final ModelRenderer gun88;
	private final ModelRenderer gun87;
	private final ModelRenderer gun86;
	private final ModelRenderer gun85;
	private final ModelRenderer gun84;
	private final ModelRenderer gun83;
	private final ModelRenderer gun82;
	private final ModelRenderer gun81;
	private final ModelRenderer gun80;
	private final ModelRenderer gun79;
	private final ModelRenderer gun78;
	private final ModelRenderer gun77;
	private final ModelRenderer gun76;
	private final ModelRenderer gun75;
	private final ModelRenderer gun74;
	private final ModelRenderer gun73;
	private final ModelRenderer extendedbarrel;
	private final ModelRenderer gun149_r1;
	private final ModelRenderer gun2;
	private final ModelRenderer gun3;
	private final ModelRenderer gun4;
	private final ModelRenderer gun5;
	private final ModelRenderer gun6;
	private final ModelRenderer gun7;
	private final ModelRenderer gun15;
	private final ModelRenderer gun17;
	private final ModelRenderer gun20;
	private final ModelRenderer gun23;
	private final ModelRenderer gun24;
	private final ModelRenderer gun25;
	private final ModelRenderer gun26;
	private final ModelRenderer gun27;
	private final ModelRenderer gun28;
	private final ModelRenderer gun29;
	private final ModelRenderer gun30;
	private final ModelRenderer gun31;
	private final ModelRenderer sawedstock;
	private final ModelRenderer gun84_r1;
	private final ModelRenderer gun52;
	private final ModelRenderer gun53;
	private final ModelRenderer gun54;
	private final ModelRenderer gun55;
	private final ModelRenderer gun56;
	private final ModelRenderer gun66;
	private final ModelRenderer gun101;
	private final ModelRenderer gun102;
	private final ModelRenderer gun103;
	private final ModelRenderer gun104;
	private final ModelRenderer gun105;
	private final ModelRenderer gun110;
	private final ModelRenderer gripstock;
	private final ModelRenderer gun90_r1;
	private final ModelRenderer gun91_r1;
	private final ModelRenderer gun90_r2;
	private final ModelRenderer gun87_r1;
	private final ModelRenderer gun85_r1;
	private final ModelRenderer gun32;
	private final ModelRenderer gun33;
	private final ModelRenderer gun34;
	private final ModelRenderer gun35;
	private final ModelRenderer gun65;
	private final ModelRenderer gun69;
	private final ModelRenderer gun96;
	private final ModelRenderer gun97;
	private final ModelRenderer gun98;
	private final ModelRenderer gun99;
	private final ModelRenderer gun100;
	private final ModelRenderer gun124;

	public KS23Mstock() {
		textureWidth = 300;
		textureHeight = 300;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 26, 36, -1.8F, -31.2F, -6.0F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 25, -1.2F, -31.201F, -6.001F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 52, 0.2F, -27.4F, -12.0F, 1, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 109, 0, 0.2F, -26.9F, -9.0F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 104, -3.2F, -26.85F, -11.001F, 1, 1, 17, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 16, 121, -2.0F, -25.3F, -3.0F, 2, 1, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 31, -2.0F, -26.4F, -45.001F, 2, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 42, -2.0F, -27.8F, -45.002F, 2, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 74, 67, -0.3F, -27.1F, -45.003F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 74, 76, -2.7F, -27.1F, -45.003F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 88, 155, -2.5F, -26.6F, -43.0F, 3, 1, 29, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 125, 191, -1.5F, -27.6F, -43.0F, 1, 3, 29, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 229, 28, -3.001F, -27.5F, -14.0F, 4, 2, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 62, -2.001F, -26.0F, -12.0F, 2, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 109, 16, -2.0F, -25.5F, -4.0F, 2, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 74, 63, -3.0F, -27.7F, -12.0F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 52, 0.0F, -30.0F, -14.001F, 1, 4, 20, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 57, -2.0F, -24.5F, -14.0F, 2, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 0, -3.0F, -30.0F, -4.0F, 1, 3, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 173, -3.0F, -30.0F, -14.002F, 3, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 57, 0, -2.0F, -31.0F, -14.0F, 2, 1, 20, 0.0F, false));

		gun145 = new ModelRenderer(this);
		gun145.setRotationPoint(0.7F, -25.1F, -41.0F);
		gun.addChild(gun145);
		setRotationAngle(gun145, 0.0F, 0.0F, 2.3794F);
		gun145.cubeList.add(new ModelBox(gun145, 10, 91, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun144 = new ModelRenderer(this);
		gun144.setRotationPoint(-0.3F, -27.1F, -41.0F);
		gun.addChild(gun144);
		gun144.cubeList.add(new ModelBox(gun144, 70, 42, 0.0F, 0.0F, -0.002F, 1, 2, 2, 0.0F, false));

		gun143 = new ModelRenderer(this);
		gun143.setRotationPoint(0.7F, -27.1F, -41.0F);
		gun.addChild(gun143);
		setRotationAngle(gun143, 0.0F, 0.0F, 2.3423F);
		gun143.cubeList.add(new ModelBox(gun143, 74, 52, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun142 = new ModelRenderer(this);
		gun142.setRotationPoint(-2.0F, -24.4F, -41.0F);
		gun.addChild(gun142);
		setRotationAngle(gun142, 0.0F, 0.0F, -2.3423F);
		gun142.cubeList.add(new ModelBox(gun142, 91, 52, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun1422 = new ModelRenderer(this);
		gun1422.setRotationPoint(-2.0F, -26.4F, -41.0F);
		gun.addChild(gun1422);
		gun1422.cubeList.add(new ModelBox(gun1422, 12, 31, 0.0F, 0.0F, -0.001F, 2, 2, 2, 0.0F, false));

		gun141 = new ModelRenderer(this);
		gun141.setRotationPoint(-2.7F, -27.1F, -41.0F);
		gun.addChild(gun141);
		setRotationAngle(gun141, 0.0F, 0.0F, -0.7436F);
		gun141.cubeList.add(new ModelBox(gun141, 43, 6, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun140 = new ModelRenderer(this);
		gun140.setRotationPoint(-2.7F, -27.1F, -41.0F);
		gun.addChild(gun140);
		gun140.cubeList.add(new ModelBox(gun140, 12, 6, 0.0F, 0.0F, -0.001F, 3, 2, 2, 0.0F, false));

		gun139 = new ModelRenderer(this);
		gun139.setRotationPoint(0.2F, -25.9F, -14.0F);
		gun.addChild(gun139);
		gun139.cubeList.add(new ModelBox(gun139, 91, 55, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun139.cubeList.add(new ModelBox(gun139, 66, 90, -3.199F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun138 = new ModelRenderer(this);
		gun138.setRotationPoint(1.2F, -24.9F, -14.0F);
		gun.addChild(gun138);
		setRotationAngle(gun138, 0.0F, 0.0F, 2.3562F);
		gun138.cubeList.add(new ModelBox(gun138, 43, 19, 0.0F, -0.001F, 0.001F, 2, 1, 2, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-3.0F, -24.9F, -14.0F);
		gun.addChild(gun14);
		setRotationAngle(gun14, 0.0F, 0.0F, -2.3562F);
		gun14.cubeList.add(new ModelBox(gun14, 0, 7, -2.0F, -0.001F, 0.001F, 2, 1, 2, 0.0F, false));

		gun137 = new ModelRenderer(this);
		gun137.setRotationPoint(1.2F, -29.8F, -14.0F);
		gun.addChild(gun137);
		setRotationAngle(gun137, 0.0F, 0.0F, 2.3562F);
		gun137.cubeList.add(new ModelBox(gun137, 91, 58, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun136 = new ModelRenderer(this);
		gun136.setRotationPoint(0.2F, -29.8F, -14.0F);
		gun.addChild(gun136);
		gun136.cubeList.add(new ModelBox(gun136, 52, 52, 0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

		gun135 = new ModelRenderer(this);
		gun135.setRotationPoint(1.2F, -25.4F, -12.0F);
		gun.addChild(gun135);
		setRotationAngle(gun135, 0.0F, 0.0F, 2.6908F);
		gun135.cubeList.add(new ModelBox(gun135, 38, 6, 0.0F, 0.0F, -0.001F, 1, 1, 3, 0.0F, false));

		gun134 = new ModelRenderer(this);
		gun134.setRotationPoint(1.2F, -27.4F, -12.0F);
		gun.addChild(gun134);
		setRotationAngle(gun134, 0.0F, 0.0F, 2.3562F);
		gun134.cubeList.add(new ModelBox(gun134, 38, 19, 0.0F, 0.0F, -0.001F, 1, 1, 3, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(1.2F, -26.9F, -9.0F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, 2.3562F);
		gun132.cubeList.add(new ModelBox(gun132, 104, 85, 0.0F, 0.0F, -0.001F, 1, 1, 15, 0.0F, false));

		gun131 = new ModelRenderer(this);
		gun131.setRotationPoint(1.2F, -25.9F, -9.0F);
		gun.addChild(gun131);
		setRotationAngle(gun131, 0.0F, 0.0F, 2.3562F);
		gun131.cubeList.add(new ModelBox(gun131, 104, 104, 0.0F, 0.0F, -0.001F, 1, 1, 15, 0.0F, false));

		gun129 = new ModelRenderer(this);
		gun129.setRotationPoint(-3.2F, -26.85F, -11.0F);
		gun.addChild(gun129);
		setRotationAngle(gun129, 0.0F, 0.0F, -0.7854F);
		gun129.cubeList.add(new ModelBox(gun129, 104, 51, 0.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, false));
		gun129.cubeList.add(new ModelBox(gun129, 0, 103, -0.7071F, 0.7071F, 0.0F, 1, 1, 17, 0.0F, false));

		gun123 = new ModelRenderer(this);
		gun123.setRotationPoint(-1.5F, -23.3F, 8.0F);
		gun.addChild(gun123);
		setRotationAngle(gun123, -2.3423F, 0.0F, 0.0F);
		gun123.cubeList.add(new ModelBox(gun123, 32, 25, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun122 = new ModelRenderer(this);
		gun122.setRotationPoint(-1.5F, -24.5F, 7.3F);
		gun.addChild(gun122);
		setRotationAngle(gun122, -0.2603F, 0.0F, 0.0F);
		gun122.cubeList.add(new ModelBox(gun122, 32, 27, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun121 = new ModelRenderer(this);
		gun121.setRotationPoint(-2.0F, -24.3F, 8.0F);
		gun.addChild(gun121);
		setRotationAngle(gun121, 0.7064F, 0.0F, 0.0F);
		gun121.cubeList.add(new ModelBox(gun121, 34, 47, -0.001F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun120 = new ModelRenderer(this);
		gun120.setRotationPoint(-2.0F, -23.3F, 3.7F);
		gun.addChild(gun120);
		setRotationAngle(gun120, -0.9295F, 0.0F, 0.0F);
		gun120.cubeList.add(new ModelBox(gun120, 40, 47, -0.001F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun119 = new ModelRenderer(this);
		gun119.setRotationPoint(-2.0F, -24.3F, 4.5F);
		gun.addChild(gun119);
		setRotationAngle(gun119, -2.5281F, 0.0F, 0.0F);
		gun119.cubeList.add(new ModelBox(gun119, 57, 39, -0.001F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun118 = new ModelRenderer(this);
		gun118.setRotationPoint(-2.0F, -24.3F, 4.0F);
		gun.addChild(gun118);
		setRotationAngle(gun118, -1.8961F, 0.0F, 0.0F);
		gun118.cubeList.add(new ModelBox(gun118, 12, 44, 0.001F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun117 = new ModelRenderer(this);
		gun117.setRotationPoint(-2.0F, -22.0F, 3.05F);
		gun.addChild(gun117);
		setRotationAngle(gun117, 1.2641F, 0.0F, 0.0F);
		gun117.cubeList.add(new ModelBox(gun117, 57, 48, -0.002F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));
		gun117.cubeList.add(new ModelBox(gun117, 44, 42, -0.003F, -0.3F, 0.0F, 2, 1, 1, 0.0F, false));

		gun115 = new ModelRenderer(this);
		gun115.setRotationPoint(-2.0F, -24.0F, 0.4F);
		gun.addChild(gun115);
		setRotationAngle(gun115, 0.8923F, 0.0F, 0.0F);
		gun115.cubeList.add(new ModelBox(gun115, 74, 63, -0.001F, 0.0F, 0.0F, 2, 3, 1, 0.0F, false));

		gun114 = new ModelRenderer(this);
		gun114.setRotationPoint(-2.0F, -24.3F, -3.0F);
		gun.addChild(gun114);
		setRotationAngle(gun114, 1.4128F, 0.0F, 0.0F);
		gun114.cubeList.add(new ModelBox(gun114, 57, 21, 0.002F, 0.0F, 0.0F, 2, 6, 1, 0.0F, false));

		gun113 = new ModelRenderer(this);
		gun113.setRotationPoint(-2.0F, -22.7F, 4.1F);
		gun.addChild(gun113);
		setRotationAngle(gun113, -0.1115F, 0.0F, 0.0F);
		gun113.cubeList.add(new ModelBox(gun113, 34, 89, 0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

		gun112 = new ModelRenderer(this);
		gun112.setRotationPoint(-2.0F, -22.7F, 9.34F);
		gun.addChild(gun112);
		setRotationAngle(gun112, -0.7436F, 0.0F, 0.0F);
		gun112.cubeList.add(new ModelBox(gun112, 91, 76, -0.001F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

		gun111 = new ModelRenderer(this);
		gun111.setRotationPoint(-2.0F, -24.6F, 10.0F);
		gun.addChild(gun111);
		setRotationAngle(gun111, -0.3346F, 0.0F, 0.0F);
		gun111.cubeList.add(new ModelBox(gun111, 91, 79, 0.001F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

		gun109 = new ModelRenderer(this);
		gun109.setRotationPoint(0.7F, -25.1F, -45.0F);
		gun.addChild(gun109);
		setRotationAngle(gun109, 0.0F, 0.0F, 2.3794F);
		gun109.cubeList.add(new ModelBox(gun109, 91, 82, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun108 = new ModelRenderer(this);
		gun108.setRotationPoint(0.7F, -27.1F, -45.0F);
		gun.addChild(gun108);
		setRotationAngle(gun108, 0.0F, 0.0F, 2.3423F);
		gun108.cubeList.add(new ModelBox(gun108, 92, 11, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun107 = new ModelRenderer(this);
		gun107.setRotationPoint(-2.7F, -27.1F, -45.0F);
		gun.addChild(gun107);
		setRotationAngle(gun107, 0.0F, 0.0F, -0.7436F);
		gun107.cubeList.add(new ModelBox(gun107, 44, 92, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun106 = new ModelRenderer(this);
		gun106.setRotationPoint(-2.0F, -24.4F, -45.0F);
		gun.addChild(gun106);
		setRotationAngle(gun106, 0.0F, 0.0F, -2.3423F);
		gun106.cubeList.add(new ModelBox(gun106, 86, 92, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun72 = new ModelRenderer(this);
		gun72.setRotationPoint(-3.0F, -29.0F, 6.0F);
		gun.addChild(gun72);
		gun72.cubeList.add(new ModelBox(gun72, 75, 42, 0.001F, 0.0F, 0.0F, 4, 3, 4, 0.0F, false));

		gun70 = new ModelRenderer(this);
		gun70.setRotationPoint(-2.0F, -31.0F, 6.0F);
		gun.addChild(gun70);
		setRotationAngle(gun70, -0.2231F, 0.0F, 0.0F);
		gun70.cubeList.add(new ModelBox(gun70, 88, 35, 0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));

		gun68 = new ModelRenderer(this);
		gun68.setRotationPoint(-3.0F, -30.0F, 6.0F);
		gun.addChild(gun68);
		setRotationAngle(gun68, -0.1859F, 0.0F, 0.0F);
		gun68.cubeList.add(new ModelBox(gun68, 57, 42, -0.001F, 0.0F, 0.0F, 4, 1, 5, 0.0F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.0F, -29.0F, 11.2F);
		gun.addChild(gun67);
		setRotationAngle(gun67, -1.8961F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 87, 45, 0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

		gun49 = new ModelRenderer(this);
		gun49.setRotationPoint(-1.5F, -24.6F, -43.0F);
		gun.addChild(gun49);
		setRotationAngle(gun49, 0.0F, 0.0F, -2.3562F);
		gun49.cubeList.add(new ModelBox(gun49, 197, 138, 0.0F, -0.001F, 0.0F, 1, 1, 29, 0.0F, false));

		gun48 = new ModelRenderer(this);
		gun48.setRotationPoint(-2.5F, -25.6F, -43.0F);
		gun.addChild(gun48);
		setRotationAngle(gun48, 0.0F, 0.0F, -0.7854F);
		gun48.cubeList.add(new ModelBox(gun48, 198, 190, 0.0F, 0.0F, 0.0F, 1, 1, 29, 0.0F, false));

		gun47 = new ModelRenderer(this);
		gun47.setRotationPoint(-2.5F, -26.6F, -43.0F);
		gun.addChild(gun47);
		setRotationAngle(gun47, 0.0F, 0.0F, -0.7854F);
		gun47.cubeList.add(new ModelBox(gun47, 0, 204, 0.0F, -0.001F, 0.0F, 1, 1, 29, 0.0F, false));

		gun46 = new ModelRenderer(this);
		gun46.setRotationPoint(-1.5F, -27.6F, -43.0F);
		gun.addChild(gun46);
		setRotationAngle(gun46, 0.0F, 0.0F, 0.7854F);
		gun46.cubeList.add(new ModelBox(gun46, 31, 205, 0.0F, 0.0F, 0.0F, 1, 1, 29, 0.0F, false));

		gun45 = new ModelRenderer(this);
		gun45.setRotationPoint(-0.5F, -24.6F, -43.0F);
		gun.addChild(gun45);
		setRotationAngle(gun45, 0.0F, 0.0F, -2.3562F);
		gun45.cubeList.add(new ModelBox(gun45, 204, 220, 0.001F, 0.0F, 0.0F, 1, 1, 29, 0.0F, false));

		gun44 = new ModelRenderer(this);
		gun44.setRotationPoint(0.5F, -25.6F, -43.0F);
		gun.addChild(gun44);
		setRotationAngle(gun44, 0.0F, 0.0F, 2.3562F);
		gun44.cubeList.add(new ModelBox(gun44, 130, 223, 0.0F, 0.0F, 0.0F, 1, 1, 29, 0.0F, false));

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(0.5F, -26.6F, -43.0F);
		gun.addChild(gun43);
		setRotationAngle(gun43, 0.0F, 0.0F, 2.3562F);
		gun43.cubeList.add(new ModelBox(gun43, 161, 226, 0.0F, 0.0F, 0.0F, 1, 1, 29, 0.0F, false));

		gun42 = new ModelRenderer(this);
		gun42.setRotationPoint(-0.5F, -27.6F, -43.0F);
		gun.addChild(gun42);
		setRotationAngle(gun42, 0.0F, 0.0F, 0.8029F);
		gun42.cubeList.add(new ModelBox(gun42, 62, 228, 0.0F, 0.0F, 0.0F, 1, 1, 29, 0.0F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-2.0F, -23.5F, -12.0F);
		gun.addChild(gun22);
		setRotationAngle(gun22, -2.618F, 0.0F, 0.0F);
		gun22.cubeList.add(new ModelBox(gun22, 91, 26, 0.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-2.0F, -24.5F, -4.0F);
		gun.addChild(gun21);
		setRotationAngle(gun21, -2.0944F, 0.0F, 0.0F);
		gun21.cubeList.add(new ModelBox(gun21, 63, 48, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-2.0F, -24.5F, -3.0F);
		gun.addChild(gun19);
		setRotationAngle(gun19, 0.0F, 0.0F, -2.3562F);
		gun19.cubeList.add(new ModelBox(gun19, 121, 104, 0.0F, -0.001F, -1.001F, 1, 1, 14, 0.0F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(0.0F, -24.5F, -3.0F);
		gun.addChild(gun18);
		setRotationAngle(gun18, 0.0F, 0.0F, -2.3562F);
		gun18.cubeList.add(new ModelBox(gun18, 120, 121, 0.001F, 0.0F, -1.001F, 1, 1, 14, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-3.0F, -25.5F, -14.0F);
		gun.addChild(gun16);
		setRotationAngle(gun16, 0.0F, 0.0F, -0.7854F);
		gun16.cubeList.add(new ModelBox(gun16, 0, 0, 0.0F, 0.0F, 0.001F, 1, 1, 24, 0.0F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(1.0F, -25.5F, -14.0F);
		gun.addChild(gun13);
		setRotationAngle(gun13, 0.0F, 0.0F, 2.3562F);
		gun13.cubeList.add(new ModelBox(gun13, 0, 25, 0.0F, 0.0F, 0.001F, 1, 1, 24, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(1.0F, -30.0F, -14.0F);
		gun.addChild(gun12);
		setRotationAngle(gun12, 0.0F, 0.0F, 2.3562F);
		gun12.cubeList.add(new ModelBox(gun12, 57, 21, 0.0F, 0.0F, -0.001F, 1, 1, 20, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(0.0F, -31.0F, -14.0F);
		gun.addChild(gun11);
		setRotationAngle(gun11, 0.0F, 0.0F, 0.7854F);
		gun11.cubeList.add(new ModelBox(gun11, 0, 74, 0.0F, -0.001F, 0.0F, 1, 1, 20, 0.0F, false));

		gun126 = new ModelRenderer(this);
		gun126.setRotationPoint(0.0F, -31.0F, 6.0F);
		gun.addChild(gun126);
		setRotationAngle(gun126, 0.0F, 0.0F, 0.7854F);
		

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(0.0F, -0.001F, 0.0F);
		gun126.addChild(gun13_r1);
		setRotationAngle(gun13_r1, -0.1571F, 0.1571F, 0.0F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 38, 0, 0.4F, 0.001F, 0.001F, 1, 1, 5, 0.0F, false));
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 12, 38, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun127 = new ModelRenderer(this);
		gun127.setRotationPoint(-2.0F, -31.0F, 6.0F);
		gun.addChild(gun127);
		setRotationAngle(gun127, 0.0F, 0.0F, -0.7854F);
		

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(0.0F, -0.001F, 0.0F);
		gun127.addChild(gun14_r1);
		setRotationAngle(gun14_r1, -0.1571F, -0.1571F, 0.0F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 12, 0, -1.4F, 0.001F, 0.001F, 1, 1, 5, 0.0F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 12, 25, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-3.0F, -30.0F, -4.0F);
		gun.addChild(gun10);
		setRotationAngle(gun10, 0.0F, 0.0F, -0.7854F);
		gun10.cubeList.add(new ModelBox(gun10, 26, 13, 0.0F, 0.001F, -0.001F, 1, 1, 10, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-3.0F, -30.0F, -14.0F);
		gun.addChild(gun9);
		setRotationAngle(gun9, 0.0F, 0.0F, -0.7854F);
		gun9.cubeList.add(new ModelBox(gun9, 93, 0, 0.0F, 0.001F, -0.001F, 1, 1, 2, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-2.0F, -31.0F, -14.0F);
		gun.addChild(gun8);
		setRotationAngle(gun8, 0.0F, 0.0F, 0.7854F);
		gun8.cubeList.add(new ModelBox(gun8, 52, 76, 0.0F, 0.0F, 0.0F, 1, 1, 20, 0.0F, false));

		gun71 = new ModelRenderer(this);
		gun71.setRotationPoint(-2.0F, -30.0F, 10.4F);
		gun.addChild(gun71);
		setRotationAngle(gun71, -0.2231F, 0.0F, 0.0F);
		gun71.cubeList.add(new ModelBox(gun71, 63, 39, -0.001F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 24.0F, 0.0F);
		barrel.cubeList.add(new ModelBox(barrel, 81, 5, -0.4F, -29.6F, -51.001F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 10, 86, -2.6F, -29.6F, -51.001F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 91, 15, -1.5F, -28.5F, -51.001F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 91, 21, -1.5F, -30.7F, -51.001F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 118, 154, -2.5F, -29.6F, -50.0F, 3, 1, 36, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 89, 191, -1.5F, -30.6F, -48.0F, 1, 3, 34, 0.0F, false));

		gun148_r1 = new ModelRenderer(this);
		gun148_r1.setRotationPoint(-1.5F, -31.2F, -48.0F);
		barrel.addChild(gun148_r1);
		setRotationAngle(gun148_r1, -0.1487F, 0.0F, 0.0F);
		gun148_r1.cubeList.add(new ModelBox(gun148_r1, 0, 43, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun147 = new ModelRenderer(this);
		gun147.setRotationPoint(-1.5F, -31.2F, -49.0F);
		barrel.addChild(gun147);
		setRotationAngle(gun147, -1.3756F, 0.0F, 0.0F);
		gun147.cubeList.add(new ModelBox(gun147, 32, 5, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun146 = new ModelRenderer(this);
		gun146.setRotationPoint(-1.5F, -31.2F, -49.0F);
		barrel.addChild(gun146);
		gun146.cubeList.add(new ModelBox(gun146, 20, 6, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun64 = new ModelRenderer(this);
		gun64.setRotationPoint(-1.5F, -27.5F, -51.0F);
		barrel.addChild(gun64);
		setRotationAngle(gun64, 0.0F, 0.0F, -2.3562F);
		gun64.cubeList.add(new ModelBox(gun64, 40, 52, 0.0F, -0.001F, 0.001F, 1, 1, 4, 0.0F, false));

		gun63 = new ModelRenderer(this);
		gun63.setRotationPoint(-2.6F, -28.6F, -51.0F);
		barrel.addChild(gun63);
		setRotationAngle(gun63, 0.0F, 0.0F, -0.7854F);
		gun63.cubeList.add(new ModelBox(gun63, 62, 62, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun62 = new ModelRenderer(this);
		gun62.setRotationPoint(-2.6F, -29.6F, -51.0F);
		barrel.addChild(gun62);
		setRotationAngle(gun62, 0.0F, 0.0F, -0.7854F);
		gun62.cubeList.add(new ModelBox(gun62, 10, 74, 0.0F, -0.001F, 0.0F, 1, 1, 4, 0.0F, false));

		gun61 = new ModelRenderer(this);
		gun61.setRotationPoint(-1.5F, -30.7F, -51.0F);
		barrel.addChild(gun61);
		setRotationAngle(gun61, 0.0F, 0.0F, 0.7854F);
		gun61.cubeList.add(new ModelBox(gun61, 22, 74, 0.0F, 0.0F, -0.002F, 1, 1, 4, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.5F, -27.5F, -51.0F);
		barrel.addChild(gun60);
		setRotationAngle(gun60, 0.0F, 0.0F, -2.3562F);
		gun60.cubeList.add(new ModelBox(gun60, 79, 21, 0.001F, 0.0F, 0.001F, 1, 1, 4, 0.0F, false));

		gun59 = new ModelRenderer(this);
		gun59.setRotationPoint(0.6F, -28.6F, -51.0F);
		barrel.addChild(gun59);
		setRotationAngle(gun59, 0.0F, 0.0F, 2.3562F);
		gun59.cubeList.add(new ModelBox(gun59, 22, 79, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun58 = new ModelRenderer(this);
		gun58.setRotationPoint(0.6F, -29.6F, -51.0F);
		barrel.addChild(gun58);
		setRotationAngle(gun58, 0.0F, 0.0F, 2.3562F);
		gun58.cubeList.add(new ModelBox(gun58, 79, 26, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun57 = new ModelRenderer(this);
		gun57.setRotationPoint(-0.5F, -30.7F, -51.0F);
		barrel.addChild(gun57);
		setRotationAngle(gun57, 0.0F, 0.0F, 0.7854F);
		gun57.cubeList.add(new ModelBox(gun57, 81, 0, 0.0F, -0.001F, -0.003F, 1, 1, 4, 0.0F, false));

		gun51 = new ModelRenderer(this);
		gun51.setRotationPoint(-1.5F, -27.6F, -51.0F);
		barrel.addChild(gun51);
		setRotationAngle(gun51, 0.0F, 0.0F, -2.3562F);
		gun51.cubeList.add(new ModelBox(gun51, 156, 50, 0.0F, -0.001F, 2.0F, 1, 1, 35, 0.0F, false));

		gun50 = new ModelRenderer(this);
		gun50.setRotationPoint(-2.5F, -28.6F, -51.0F);
		barrel.addChild(gun50);
		setRotationAngle(gun50, 0.0F, 0.0F, -0.7854F);
		gun50.cubeList.add(new ModelBox(gun50, 51, 156, 0.0F, 0.0F, 2.0F, 1, 1, 35, 0.0F, false));

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(-2.5F, -29.6F, -51.0F);
		barrel.addChild(gun41);
		setRotationAngle(gun41, 0.0F, 0.0F, -0.7854F);
		gun41.cubeList.add(new ModelBox(gun41, 193, 36, 0.0F, -0.001F, 3.0F, 1, 1, 34, 0.0F, false));

		gun40 = new ModelRenderer(this);
		gun40.setRotationPoint(-1.5F, -30.6F, -51.0F);
		barrel.addChild(gun40);
		setRotationAngle(gun40, 0.0F, 0.0F, 0.7854F);
		gun40.cubeList.add(new ModelBox(gun40, 193, 86, 0.0F, 0.0F, 3.0F, 1, 1, 34, 0.0F, false));

		gun39 = new ModelRenderer(this);
		gun39.setRotationPoint(-0.5F, -27.6F, -51.0F);
		barrel.addChild(gun39);
		setRotationAngle(gun39, 0.0F, 0.0F, -2.3562F);
		gun39.cubeList.add(new ModelBox(gun39, 156, 102, 0.001F, 0.0F, 2.0F, 1, 1, 35, 0.0F, false));

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(0.5F, -28.6F, -51.0F);
		barrel.addChild(gun38);
		setRotationAngle(gun38, 0.0F, 0.0F, 2.3562F);
		gun38.cubeList.add(new ModelBox(gun38, 160, 0, 0.0F, 0.0F, 2.0F, 1, 1, 35, 0.0F, false));

		gun37 = new ModelRenderer(this);
		gun37.setRotationPoint(0.5F, -29.6F, -51.0F);
		barrel.addChild(gun37);
		setRotationAngle(gun37, 0.0F, 0.0F, 2.3562F);
		gun37.cubeList.add(new ModelBox(gun37, 160, 154, 0.0F, 0.0F, 2.0F, 1, 1, 35, 0.0F, false));

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(-0.5F, -30.6F, -51.0F);
		barrel.addChild(gun36);
		setRotationAngle(gun36, 0.0F, 0.0F, 0.8029F);
		gun36.cubeList.add(new ModelBox(gun36, 161, 190, 0.0F, 0.0F, 2.0F, 1, 1, 35, 0.0F, false));

		pump = new ModelRenderer(this);
		pump.setRotationPoint(0.0F, 24.0F, 0.0F);
		pump.cubeList.add(new ModelBox(pump, 104, 69, -2.5F, -24.4F, -29.002F, 3, 1, 15, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 19, 103, 0.41F, -27.4F, -29.0F, 1, 3, 14, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 0, 13, -2.0F, -24.6F, -39.0F, 2, 1, 10, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 0, 25, -3.0F, -27.4F, -39.0F, 1, 3, 10, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 0, 0, 0.0F, -27.4F, -39.0F, 1, 3, 10, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 71, 104, -3.41F, -27.4F, -29.0F, 1, 3, 14, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 52, 62, -2.601F, -29.6F, -12.0F, 1, 2, 8, 0.0F, false));

		pump34_r1 = new ModelRenderer(this);
		pump34_r1.setRotationPoint(-2.601F, -29.6F, -12.0F);
		pump.addChild(pump34_r1);
		setRotationAngle(pump34_r1, 0.0F, 0.0F, -0.7854F);
		pump34_r1.cubeList.add(new ModelBox(pump34_r1, 0, 74, 0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		pump30 = new ModelRenderer(this);
		pump30.setRotationPoint(-3.5F, -27.4F, -18.5F);
		pump.addChild(pump30);
		pump30.cubeList.add(new ModelBox(pump30, 12, 25, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));
		pump30.cubeList.add(new ModelBox(pump30, 0, 25, 4.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump29 = new ModelRenderer(this);
		pump29.setRotationPoint(-3.5F, -27.4F, -21.5F);
		pump.addChild(pump29);
		pump29.cubeList.add(new ModelBox(pump29, 19, 25, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));
		pump29.cubeList.add(new ModelBox(pump29, 19, 0, 4.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump28 = new ModelRenderer(this);
		pump28.setRotationPoint(-3.5F, -27.4F, -24.5F);
		pump.addChild(pump28);
		pump28.cubeList.add(new ModelBox(pump28, 26, 0, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));
		pump28.cubeList.add(new ModelBox(pump28, 6, 18, 4.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump27 = new ModelRenderer(this);
		pump27.setRotationPoint(-3.5F, -27.4F, -27.5F);
		pump.addChild(pump27);
		pump27.cubeList.add(new ModelBox(pump27, 26, 5, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));
		pump27.cubeList.add(new ModelBox(pump27, 12, 0, 4.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump26 = new ModelRenderer(this);
		pump26.setRotationPoint(-3.5F, -27.4F, -26.0F);
		pump.addChild(pump26);
		pump26.cubeList.add(new ModelBox(pump26, 26, 13, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));
		pump26.cubeList.add(new ModelBox(pump26, 0, 18, 4.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump25 = new ModelRenderer(this);
		pump25.setRotationPoint(-3.5F, -27.4F, -23.0F);
		pump.addChild(pump25);
		pump25.cubeList.add(new ModelBox(pump25, 26, 18, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));
		pump25.cubeList.add(new ModelBox(pump25, 14, 18, 4.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump24 = new ModelRenderer(this);
		pump24.setRotationPoint(-3.5F, -27.4F, -20.0F);
		pump.addChild(pump24);
		pump24.cubeList.add(new ModelBox(pump24, 26, 25, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));
		pump24.cubeList.add(new ModelBox(pump24, 20, 18, 4.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump23 = new ModelRenderer(this);
		pump23.setRotationPoint(-3.5F, -27.4F, -17.0F);
		pump.addChild(pump23);
		pump23.cubeList.add(new ModelBox(pump23, 0, 30, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));
		pump23.cubeList.add(new ModelBox(pump23, 6, 25, 4.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump22 = new ModelRenderer(this);
		pump22.setRotationPoint(-3.6F, -24.4F, -15.0F);
		pump.addChild(pump22);
		setRotationAngle(pump22, 0.0F, 0.0F, -0.7854F);
		pump22.cubeList.add(new ModelBox(pump22, 32, 13, -0.001F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		pump21 = new ModelRenderer(this);
		pump21.setRotationPoint(-2.5F, -23.3F, -15.0F);
		pump.addChild(pump21);
		setRotationAngle(pump21, 0.0F, 0.0F, -2.3562F);
		pump21.cubeList.add(new ModelBox(pump21, 32, 15, 0.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		pump20 = new ModelRenderer(this);
		pump20.setRotationPoint(0.5F, -23.3F, -15.0F);
		pump.addChild(pump20);
		setRotationAngle(pump20, 0.0F, 0.0F, -2.3562F);
		pump20.cubeList.add(new ModelBox(pump20, 32, 18, 0.001F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		pump19 = new ModelRenderer(this);
		pump19.setRotationPoint(1.6F, -24.4F, -15.0F);
		pump.addChild(pump19);
		setRotationAngle(pump19, 0.0F, 0.0F, 2.3562F);
		pump19.cubeList.add(new ModelBox(pump19, 32, 20, 0.0F, 0.0F, -0.002F, 1, 1, 1, 0.0F, false));

		pump18 = new ModelRenderer(this);
		pump18.setRotationPoint(-2.5F, -24.3F, -15.0F);
		pump.addChild(pump18);
		pump18.cubeList.add(new ModelBox(pump18, 26, 47, 0.0F, 0.0F, 0.002F, 3, 1, 1, 0.0F, false));

		pump17 = new ModelRenderer(this);
		pump17.setRotationPoint(0.6F, -27.4F, -15.0F);
		pump.addChild(pump17);
		pump17.cubeList.add(new ModelBox(pump17, 6, 30, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		pump16 = new ModelRenderer(this);
		pump16.setRotationPoint(-3.6F, -27.4F, -15.0F);
		pump.addChild(pump16);
		pump16.cubeList.add(new ModelBox(pump16, 26, 30, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump15 = new ModelRenderer(this);
		pump15.setRotationPoint(-3.4F, -27.4F, -29.0F);
		pump.addChild(pump15);
		setRotationAngle(pump15, 0.0F, 1.3059F, 0.0F);
		pump15.cubeList.add(new ModelBox(pump15, 74, 56, 0.0F, 0.001F, 0.0F, 2, 3, 1, 0.0F, false));

		pump14 = new ModelRenderer(this);
		pump14.setRotationPoint(1.4F, -27.4F, -29.0F);
		pump.addChild(pump14);
		setRotationAngle(pump14, 0.0F, -2.8767F, 0.0F);
		pump14.cubeList.add(new ModelBox(pump14, 69, 21, 0.0F, 0.001F, 0.0F, 1, 3, 2, 0.0F, false));

		pump13 = new ModelRenderer(this);
		pump13.setRotationPoint(1.0F, -24.4F, -39.0F);
		pump.addChild(pump13);
		setRotationAngle(pump13, 0.0F, 0.0F, 2.4784F);
		pump13.cubeList.add(new ModelBox(pump13, 0, 38, 0.3F, -0.001F, -0.001F, 1, 1, 10, 0.0F, false));

		pump12 = new ModelRenderer(this);
		pump12.setRotationPoint(1.0F, -24.4F, -39.0F);
		pump.addChild(pump12);
		setRotationAngle(pump12, 0.0F, 0.0F, 2.4784F);
		pump12.cubeList.add(new ModelBox(pump12, 79, 21, 0.0F, 0.0F, 0.001F, 1, 1, 10, 0.0F, false));

		pump11 = new ModelRenderer(this);
		pump11.setRotationPoint(-3.0F, -24.4F, -39.0F);
		pump.addChild(pump11);
		setRotationAngle(pump11, 0.0F, 0.0F, -0.8901F);
		pump11.cubeList.add(new ModelBox(pump11, 81, 0, -0.001F, 0.3F, -0.001F, 1, 1, 10, 0.0F, false));

		pump10 = new ModelRenderer(this);
		pump10.setRotationPoint(-3.0F, -24.4F, -39.0F);
		pump.addChild(pump10);
		setRotationAngle(pump10, 0.0F, 0.0F, -0.8901F);
		pump10.cubeList.add(new ModelBox(pump10, 123, 51, 0.0F, 0.0F, 0.001F, 1, 1, 10, 0.0F, false));

		pump6 = new ModelRenderer(this);
		pump6.setRotationPoint(-2.5F, -23.4F, -29.0F);
		pump.addChild(pump6);
		setRotationAngle(pump6, 0.0F, 0.0F, -2.3038F);
		pump6.cubeList.add(new ModelBox(pump6, 121, 85, 0.0F, 0.0F, 0.0F, 1, 1, 14, 0.0F, false));
		pump6.cubeList.add(new ModelBox(pump6, 0, 121, 0.35F, -0.001F, -0.001F, 1, 1, 14, 0.0F, false));

		pump5 = new ModelRenderer(this);
		pump5.setRotationPoint(0.5F, -23.4F, -29.0F);
		pump.addChild(pump5);
		setRotationAngle(pump5, 0.0F, 0.0F, 2.3038F);
		pump5.cubeList.add(new ModelBox(pump5, 104, 120, -1.0F, 0.0F, 0.0F, 1, 1, 14, 0.0F, false));
		pump5.cubeList.add(new ModelBox(pump5, 109, 31, -1.35F, -0.001F, -0.001F, 1, 1, 14, 0.0F, false));

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun95 = new ModelRenderer(this);
		gun95.setRotationPoint(-3.0F, -21.2F, 25.2F);
		stock.addChild(gun95);
		setRotationAngle(gun95, 1.2641F, 0.0F, 0.0F);
		gun95.cubeList.add(new ModelBox(gun95, 83, 121, 0.0F, 0.0F, -1.0F, 4, 20, 5, 0.0F, false));

		gun94 = new ModelRenderer(this);
		gun94.setRotationPoint(-3.0F, -26.0F, 23.35F);
		stock.addChild(gun94);
		setRotationAngle(gun94, -0.1115F, 0.0F, 0.0F);
		gun94.cubeList.add(new ModelBox(gun94, 228, 121, 0.0015F, 0.0F, 0.0F, 4, 5, 23, 0.0F, false));

		gun93 = new ModelRenderer(this);
		gun93.setRotationPoint(-3.0F, -23.3F, 48.1F);
		stock.addChild(gun93);
		setRotationAngle(gun93, -1.7299F, 0.0F, 0.0F);
		gun93.cubeList.add(new ModelBox(gun93, 22, 74, -0.001F, -2.0F, 0.0F, 4, 5, 10, 0.0F, false));

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(-3.0F, -21.2F, 23.8F);
		stock.addChild(gun92);
		setRotationAngle(gun92, 1.2641F, 0.0F, 0.0F);
		gun92.cubeList.add(new ModelBox(gun92, 52, 122, 0.002F, 0.0F, -1.0F, 4, 26, 1, 0.0F, false));

		gun91 = new ModelRenderer(this);
		gun91.setRotationPoint(-3.0F, -20.25F, 24.4F);
		stock.addChild(gun91);
		setRotationAngle(gun91, -1.2641F, 0.0F, 0.0F);
		gun91.cubeList.add(new ModelBox(gun91, 0, 0, 0.001F, 0.0F, -1.0F, 4, 6, 1, 0.0F, false));

		gun90 = new ModelRenderer(this);
		gun90.setRotationPoint(-3.0F, -21.5F, 18.4F);
		stock.addChild(gun90);
		setRotationAngle(gun90, 0.409F, 0.0F, 0.0F);
		gun90.cubeList.add(new ModelBox(gun90, 52, 90, -0.001F, 0.0F, -1.0F, 4, 3, 2, 0.0F, false));

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(-3.0F, -23.3F, 16.75F);
		stock.addChild(gun89);
		setRotationAngle(gun89, 0.632F, 0.0F, 0.0F);
		gun89.cubeList.add(new ModelBox(gun89, 74, 87, 0.001F, 0.0F, -1.0F, 4, 4, 3, 0.0F, false));

		gun88 = new ModelRenderer(this);
		gun88.setRotationPoint(-3.0F, -25.2F, 13.5F);
		stock.addChild(gun88);
		setRotationAngle(gun88, 1.041F, 0.0F, 0.0F);
		gun88.cubeList.add(new ModelBox(gun88, 81, 11, -0.001F, 0.0F, -1.0F, 4, 5, 3, 0.0F, false));

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(-3.0F, -26.4F, 10.3F);
		stock.addChild(gun87);
		setRotationAngle(gun87, 1.2269F, 0.0F, 0.0F);
		gun87.cubeList.add(new ModelBox(gun87, 38, 36, 0.001F, 0.0F, -1.0F, 4, 4, 2, 0.0F, false));

		gun86 = new ModelRenderer(this);
		gun86.setRotationPoint(-2.0F, -20.3F, 23.5F);
		stock.addChild(gun86);
		setRotationAngle(gun86, 1.2641F, 0.0F, 0.0F);
		gun86.cubeList.add(new ModelBox(gun86, 101, 11, -0.001F, 0.0F, -1.0F, 2, 26, 1, 0.0F, false));

		gun85 = new ModelRenderer(this);
		gun85.setRotationPoint(-2.0F, -19.2F, 23.8F);
		stock.addChild(gun85);
		setRotationAngle(gun85, -1.2641F, 0.0F, 0.0F);
		gun85.cubeList.add(new ModelBox(gun85, 57, 30, 0.001F, 0.0F, -1.0F, 2, 6, 1, 0.0F, false));

		gun84 = new ModelRenderer(this);
		gun84.setRotationPoint(-3.0F, -27.0F, 23.35F);
		stock.addChild(gun84);
		setRotationAngle(gun84, -0.1115F, 0.0F, 0.0F);
		gun84.cubeList.add(new ModelBox(gun84, 197, 0, 0.001F, 0.0F, 0.0F, 4, 1, 27, 0.0F, false));

		gun83 = new ModelRenderer(this);
		gun83.setRotationPoint(-3.0F, -27.0F, 23.35F);
		stock.addChild(gun83);
		setRotationAngle(gun83, -1.1525F, 0.0F, 0.0F);
		gun83.cubeList.add(new ModelBox(gun83, 57, 0, -0.001F, 0.0F, 0.0F, 4, 4, 6, 0.0F, false));

		gun82 = new ModelRenderer(this);
		gun82.setRotationPoint(-3.0F, -26.0F, 22.0F);
		stock.addChild(gun82);
		setRotationAngle(gun82, -1.4871F, 0.0F, 0.0F);
		gun82.cubeList.add(new ModelBox(gun82, 57, 10, 0.002F, 0.0F, 0.0F, 4, 4, 6, 0.0F, false));

		gun81 = new ModelRenderer(this);
		gun81.setRotationPoint(-2.0F, -26.76F, 21.35F);
		stock.addChild(gun81);
		setRotationAngle(gun81, -1.4871F, 0.0F, 0.0F);
		gun81.cubeList.add(new ModelBox(gun81, 92, 92, 0.001F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun80 = new ModelRenderer(this);
		gun80.setRotationPoint(-2.0F, -27.76F, 23.35F);
		stock.addChild(gun80);
		setRotationAngle(gun80, -1.1525F, 0.0F, 0.0F);
		gun80.cubeList.add(new ModelBox(gun80, 57, 0, -0.001F, 0.0F, 0.0F, 2, 5, 1, 0.0F, false));

		gun79 = new ModelRenderer(this);
		gun79.setRotationPoint(-2.0F, -27.76F, 23.35F);
		stock.addChild(gun79);
		setRotationAngle(gun79, -0.1115F, 0.0F, 0.0F);
		gun79.cubeList.add(new ModelBox(gun79, 93, 228, 0.0F, 0.0F, 0.0F, 2, 1, 27, 0.0F, false));

		gun78 = new ModelRenderer(this);
		gun78.setRotationPoint(-2.0F, -20.5F, 17.8F);
		stock.addChild(gun78);
		setRotationAngle(gun78, 0.409F, 0.0F, 0.0F);
		gun78.cubeList.add(new ModelBox(gun78, 74, 80, 0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		gun77 = new ModelRenderer(this);
		gun77.setRotationPoint(-2.0F, -22.7F, 16.0F);
		stock.addChild(gun77);
		setRotationAngle(gun77, 0.632F, 0.0F, 0.0F);
		gun77.cubeList.add(new ModelBox(gun77, 69, 30, -0.001F, 0.0F, -1.0F, 2, 4, 1, 0.0F, false));

		gun76 = new ModelRenderer(this);
		gun76.setRotationPoint(-2.0F, -24.4F, 13.0F);
		stock.addChild(gun76);
		setRotationAngle(gun76, 1.041F, 0.0F, 0.0F);
		gun76.cubeList.add(new ModelBox(gun76, 71, 0, 0.0F, 0.0F, -1.0F, 2, 4, 1, 0.0F, false));

		gun75 = new ModelRenderer(this);
		gun75.setRotationPoint(-2.0F, -25.5F, 10.0F);
		stock.addChild(gun75);
		setRotationAngle(gun75, 1.2269F, 0.0F, 0.0F);
		gun75.cubeList.add(new ModelBox(gun75, 71, 10, -0.001F, 0.0F, -1.0F, 2, 4, 1, 0.0F, false));

		gun74 = new ModelRenderer(this);
		gun74.setRotationPoint(-3.0F, -29.0F, 11.2F);
		stock.addChild(gun74);
		setRotationAngle(gun74, -0.3718F, 0.0F, 0.0F);
		gun74.cubeList.add(new ModelBox(gun74, 74, 76, 0.003F, 0.0F, 0.0F, 4, 2, 9, 0.0F, false));

		gun73 = new ModelRenderer(this);
		gun73.setRotationPoint(-2.0F, -29.76F, 11.35F);
		stock.addChild(gun73);
		setRotationAngle(gun73, -0.3718F, 0.0F, 0.0F);
		gun73.cubeList.add(new ModelBox(gun73, 125, 69, 0.0F, 0.0F, 0.0F, 2, 1, 9, 0.0F, false));

		extendedbarrel = new ModelRenderer(this);
		extendedbarrel.setRotationPoint(0.0F, 24.0F, 0.0F);
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 26, 0, -0.4F, -29.6F, -67.001F, 1, 1, 4, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 87, 42, -0.4F, -29.6F, -45.001F, 1, 1, 2, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 0, 25, -2.6F, -29.6F, -67.001F, 1, 1, 4, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 6, 90, -2.6F, -29.6F, -45.001F, 1, 1, 2, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 14, 18, -1.5F, -28.5F, -67.001F, 1, 1, 4, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 61, 76, -1.5F, -28.5F, -45.001F, 1, 1, 2, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 0, 18, -1.5F, -30.7F, -67.001F, 1, 1, 4, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 62, 89, -1.5F, -30.7F, -45.001F, 1, 1, 2, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 0, 0, -2.5F, -29.6F, -65.0F, 3, 1, 51, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 105, 102, -1.5F, -30.6F, -63.0F, 1, 3, 49, 0.0F, false));

		gun149_r1 = new ModelRenderer(this);
		gun149_r1.setRotationPoint(-1.5F, -31.2F, -64.0F);
		extendedbarrel.addChild(gun149_r1);
		setRotationAngle(gun149_r1, -0.1487F, 0.0F, 0.0F);
		gun149_r1.cubeList.add(new ModelBox(gun149_r1, 26, 41, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-1.5F, -31.2F, -49.0F);
		extendedbarrel.addChild(gun2);
		setRotationAngle(gun2, -1.3756F, 0.0F, 0.0F);
		gun2.cubeList.add(new ModelBox(gun2, 32, 0, 0.0F, 15.6962F, -3.1032F, 1, 2, 1, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-1.5F, -31.2F, -49.0F);
		extendedbarrel.addChild(gun3);
		gun3.cubeList.add(new ModelBox(gun3, 6, 7, 0.0F, 0.0F, -16.0F, 1, 1, 1, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-1.5F, -27.5F, -51.0F);
		extendedbarrel.addChild(gun4);
		setRotationAngle(gun4, 0.0F, 0.0F, -2.3562F);
		gun4.cubeList.add(new ModelBox(gun4, 0, 38, 0.0F, -0.001F, -15.999F, 1, 1, 4, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 0, 79, 0.0F, -0.001F, 6.001F, 1, 1, 2, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-2.6F, -28.6F, -51.0F);
		extendedbarrel.addChild(gun5);
		setRotationAngle(gun5, 0.0F, 0.0F, -0.7854F);
		gun5.cubeList.add(new ModelBox(gun5, 26, 36, 0.0F, 0.0F, -16.0F, 1, 1, 4, 0.0F, false));
		gun5.cubeList.add(new ModelBox(gun5, 10, 79, 0.0F, 0.0F, 6.0F, 1, 1, 2, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-2.6F, -29.6F, -51.0F);
		extendedbarrel.addChild(gun6);
		setRotationAngle(gun6, 0.0F, 0.0F, -0.7854F);
		gun6.cubeList.add(new ModelBox(gun6, 26, 30, 0.0F, -0.001F, -16.0F, 1, 1, 4, 0.0F, false));
		gun6.cubeList.add(new ModelBox(gun6, 90, 32, 0.0F, -0.001F, 6.0F, 1, 1, 2, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-1.5F, -30.7F, -51.0F);
		extendedbarrel.addChild(gun7);
		setRotationAngle(gun7, 0.0F, 0.0F, 0.7854F);
		gun7.cubeList.add(new ModelBox(gun7, 0, 30, 0.0F, 0.0F, -16.002F, 1, 1, 4, 0.0F, false));
		gun7.cubeList.add(new ModelBox(gun7, 0, 90, 0.0F, 0.0F, 5.998F, 1, 1, 2, 0.0F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-0.5F, -27.5F, -51.0F);
		extendedbarrel.addChild(gun15);
		setRotationAngle(gun15, 0.0F, 0.0F, -2.3562F);
		gun15.cubeList.add(new ModelBox(gun15, 26, 25, 0.001F, 0.0F, -15.999F, 1, 1, 4, 0.0F, false));
		gun15.cubeList.add(new ModelBox(gun15, 69, 26, 0.001F, 0.0F, 6.001F, 1, 1, 2, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(0.6F, -28.6F, -51.0F);
		extendedbarrel.addChild(gun17);
		setRotationAngle(gun17, 0.0F, 0.0F, 2.3562F);
		gun17.cubeList.add(new ModelBox(gun17, 26, 18, 0.0F, 0.0F, -16.0F, 1, 1, 4, 0.0F, false));
		gun17.cubeList.add(new ModelBox(gun17, 69, 35, 0.0F, 0.0F, 6.0F, 1, 1, 2, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(0.6F, -29.6F, -51.0F);
		extendedbarrel.addChild(gun20);
		setRotationAngle(gun20, 0.0F, 0.0F, 2.3562F);
		gun20.cubeList.add(new ModelBox(gun20, 26, 13, 0.0F, 0.0F, -16.0F, 1, 1, 4, 0.0F, false));
		gun20.cubeList.add(new ModelBox(gun20, 11, 83, 0.0F, 0.0F, 6.0F, 1, 1, 2, 0.0F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-0.5F, -30.7F, -51.0F);
		extendedbarrel.addChild(gun23);
		setRotationAngle(gun23, 0.0F, 0.0F, 0.7854F);
		gun23.cubeList.add(new ModelBox(gun23, 26, 5, 0.0F, -0.001F, -16.003F, 1, 1, 4, 0.0F, false));
		gun23.cubeList.add(new ModelBox(gun23, 42, 89, 0.0F, -0.001F, 5.997F, 1, 1, 2, 0.0F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-1.5F, -27.6F, -51.0F);
		extendedbarrel.addChild(gun24);
		setRotationAngle(gun24, 0.0F, 0.0F, -2.3562F);
		gun24.cubeList.add(new ModelBox(gun24, 52, 104, 0.0F, -0.001F, -13.0F, 1, 1, 50, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(-2.5F, -28.6F, -51.0F);
		extendedbarrel.addChild(gun25);
		setRotationAngle(gun25, 0.0F, 0.0F, -0.7854F);
		gun25.cubeList.add(new ModelBox(gun25, 104, 51, 0.0F, 0.0F, -13.0F, 1, 1, 50, 0.0F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-2.5F, -29.6F, -51.0F);
		extendedbarrel.addChild(gun26);
		setRotationAngle(gun26, 0.0F, 0.0F, -0.7854F);
		gun26.cubeList.add(new ModelBox(gun26, 0, 154, 0.0F, -0.001F, -12.0F, 1, 1, 49, 0.0F, false));

		gun27 = new ModelRenderer(this);
		gun27.setRotationPoint(-1.5F, -30.6F, -51.0F);
		extendedbarrel.addChild(gun27);
		setRotationAngle(gun27, 0.0F, 0.0F, 0.7854F);
		gun27.cubeList.add(new ModelBox(gun27, 109, 0, 0.0F, 0.0F, -12.0F, 1, 1, 49, 0.0F, false));

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(-0.5F, -27.6F, -51.0F);
		extendedbarrel.addChild(gun28);
		setRotationAngle(gun28, 0.0F, 0.0F, -2.3562F);
		gun28.cubeList.add(new ModelBox(gun28, 0, 103, 0.001F, 0.0F, -13.0F, 1, 1, 50, 0.0F, false));

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(0.5F, -28.6F, -51.0F);
		extendedbarrel.addChild(gun29);
		setRotationAngle(gun29, 0.0F, 0.0F, 2.3562F);
		gun29.cubeList.add(new ModelBox(gun29, 57, 0, 0.0F, 0.0F, -13.0F, 1, 1, 50, 0.0F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(0.5F, -29.6F, -51.0F);
		extendedbarrel.addChild(gun30);
		setRotationAngle(gun30, 0.0F, 0.0F, 2.3562F);
		gun30.cubeList.add(new ModelBox(gun30, 52, 53, 0.0F, 0.0F, -13.0F, 1, 1, 50, 0.0F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-0.5F, -30.6F, -51.0F);
		extendedbarrel.addChild(gun31);
		setRotationAngle(gun31, 0.0F, 0.0F, 0.8029F);
		gun31.cubeList.add(new ModelBox(gun31, 0, 52, 0.0F, 0.0F, -13.0F, 1, 1, 50, 0.0F, false));

		sawedstock = new ModelRenderer(this);
		sawedstock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun84_r1 = new ModelRenderer(this);
		gun84_r1.setRotationPoint(1.002F, -25.7F, 19.6F);
		sawedstock.addChild(gun84_r1);
		setRotationAngle(gun84_r1, -1.0996F, 0.0F, 0.0F);
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 57, 30, -3.0F, -0.5F, -0.6F, 2, 1, 8, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 52, 52, -4.0F, 0.0F, 0.0F, 4, 4, 6, 0.0F, false));

		gun52 = new ModelRenderer(this);
		gun52.setRotationPoint(-3.0F, -20.25F, 24.4F);
		sawedstock.addChild(gun52);
		setRotationAngle(gun52, -1.2641F, 0.0F, 0.0F);
		gun52.cubeList.add(new ModelBox(gun52, 14, 13, 0.001F, 2.0F, -1.0F, 4, 4, 1, 0.0F, false));

		gun53 = new ModelRenderer(this);
		gun53.setRotationPoint(-3.0F, -21.5F, 18.4F);
		sawedstock.addChild(gun53);
		setRotationAngle(gun53, 0.409F, 0.0F, 0.0F);
		gun53.cubeList.add(new ModelBox(gun53, 22, 89, -0.001F, 0.0F, -1.0F, 4, 3, 2, 0.0F, false));

		gun54 = new ModelRenderer(this);
		gun54.setRotationPoint(-3.0F, -23.3F, 16.75F);
		sawedstock.addChild(gun54);
		setRotationAngle(gun54, 0.632F, 0.0F, 0.0F);
		gun54.cubeList.add(new ModelBox(gun54, 84, 63, 0.001F, 0.0F, -1.0F, 4, 4, 3, 0.0F, false));

		gun55 = new ModelRenderer(this);
		gun55.setRotationPoint(-3.0F, -25.2F, 13.5F);
		sawedstock.addChild(gun55);
		setRotationAngle(gun55, 1.041F, 0.0F, 0.0F);
		gun55.cubeList.add(new ModelBox(gun55, 79, 32, -0.001F, 0.0F, -1.0F, 4, 5, 3, 0.0F, false));

		gun56 = new ModelRenderer(this);
		gun56.setRotationPoint(-3.0F, -26.4F, 10.3F);
		sawedstock.addChild(gun56);
		setRotationAngle(gun56, 1.2269F, 0.0F, 0.0F);
		gun56.cubeList.add(new ModelBox(gun56, 38, 25, 0.001F, 0.0F, -1.0F, 4, 4, 2, 0.0F, false));

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(-2.0F, -19.2F, 23.8F);
		sawedstock.addChild(gun66);
		setRotationAngle(gun66, -1.2641F, 0.0F, 0.0F);
		gun66.cubeList.add(new ModelBox(gun66, 14, 52, 0.001F, 1.0F, -1.0F, 2, 5, 1, 0.0F, false));

		gun101 = new ModelRenderer(this);
		gun101.setRotationPoint(-2.0F, -20.5F, 17.8F);
		sawedstock.addChild(gun101);
		setRotationAngle(gun101, 0.409F, 0.0F, 0.0F);
		gun101.cubeList.add(new ModelBox(gun101, 23, 68, 0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		gun102 = new ModelRenderer(this);
		gun102.setRotationPoint(-2.0F, -22.7F, 16.0F);
		sawedstock.addChild(gun102);
		setRotationAngle(gun102, 0.632F, 0.0F, 0.0F);
		gun102.cubeList.add(new ModelBox(gun102, 66, 52, -0.001F, 0.0F, -1.0F, 2, 4, 1, 0.0F, false));

		gun103 = new ModelRenderer(this);
		gun103.setRotationPoint(-2.0F, -24.4F, 13.0F);
		sawedstock.addChild(gun103);
		setRotationAngle(gun103, 1.041F, 0.0F, 0.0F);
		gun103.cubeList.add(new ModelBox(gun103, 23, 63, 0.0F, 0.0F, -1.0F, 2, 4, 1, 0.0F, false));

		gun104 = new ModelRenderer(this);
		gun104.setRotationPoint(-2.0F, -25.5F, 10.0F);
		sawedstock.addChild(gun104);
		setRotationAngle(gun104, 1.2269F, 0.0F, 0.0F);
		gun104.cubeList.add(new ModelBox(gun104, 52, 62, -0.001F, 0.0F, -1.0F, 2, 4, 1, 0.0F, false));

		gun105 = new ModelRenderer(this);
		gun105.setRotationPoint(-3.0F, -29.0F, 11.2F);
		sawedstock.addChild(gun105);
		setRotationAngle(gun105, -0.3718F, 0.0F, 0.0F);
		gun105.cubeList.add(new ModelBox(gun105, 74, 52, 0.003F, 0.0F, 0.0F, 4, 2, 9, 0.0F, false));

		gun110 = new ModelRenderer(this);
		gun110.setRotationPoint(-2.0F, -29.76F, 11.35F);
		sawedstock.addChild(gun110);
		setRotationAngle(gun110, -0.3718F, 0.0F, 0.0F);
		gun110.cubeList.add(new ModelBox(gun110, 125, 31, 0.0F, 0.0F, 0.0F, 2, 1, 9, 0.0F, false));

		gripstock = new ModelRenderer(this);
		gripstock.setRotationPoint(0.0F, 24.0F, 0.0F);
		gripstock.cubeList.add(new ModelBox(gripstock, 0, 52, -1.498F, -22.4F, 21.6F, 1, 1, 21, 0.0F, false));

		gun90_r1 = new ModelRenderer(this);
		gun90_r1.setRotationPoint(-1.998F, -24.9F, 41.2F);
		gripstock.addChild(gun90_r1);
		setRotationAngle(gun90_r1, 0.0349F, 0.0F, 0.0F);
		gun90_r1.cubeList.add(new ModelBox(gun90_r1, 42, 71, -1.0F, -2.0F, 1.0F, 1, 10, 3, 0.0F, false));
		gun90_r1.cubeList.add(new ModelBox(gun90_r1, 64, 76, 2.0F, -2.0F, 1.0F, 1, 10, 3, 0.0F, false));
		gun90_r1.cubeList.add(new ModelBox(gun90_r1, 0, 62, -1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F, false));
		gun90_r1.cubeList.add(new ModelBox(gun90_r1, 4, 62, 2.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F, false));

		gun91_r1 = new ModelRenderer(this);
		gun91_r1.setRotationPoint(-1.998F, -18.9F, 41.4F);
		gripstock.addChild(gun91_r1);
		setRotationAngle(gun91_r1, -1.117F, 0.0F, 0.0F);
		gun91_r1.cubeList.add(new ModelBox(gun91_r1, 12, 67, -1.001F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun91_r1.cubeList.add(new ModelBox(gun91_r1, 52, 67, 1.999F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun90_r2 = new ModelRenderer(this);
		gun90_r2.setRotationPoint(-1.998F, -24.9F, 41.2F);
		gripstock.addChild(gun90_r2);
		setRotationAngle(gun90_r2, 1.117F, 0.0F, 0.0F);
		gun90_r2.cubeList.add(new ModelBox(gun90_r2, 18, 45, -1.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun90_r2.cubeList.add(new ModelBox(gun90_r2, 62, 67, 1.999F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun87_r1 = new ModelRenderer(this);
		gun87_r1.setRotationPoint(0.502F, -27.4F, 42.2F);
		gripstock.addChild(gun87_r1);
		setRotationAngle(gun87_r1, 0.0349F, 0.0F, 0.0F);
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 52, 76, -3.0F, 0.0F, 0.0F, 3, 11, 3, 0.0F, false));

		gun85_r1 = new ModelRenderer(this);
		gun85_r1.setRotationPoint(1.002F, -25.7F, 19.6F);
		gripstock.addChild(gun85_r1);
		setRotationAngle(gun85_r1, -1.0996F, 0.0F, 0.0F);
		gun85_r1.cubeList.add(new ModelBox(gun85_r1, 57, 21, -3.0F, -0.5F, -0.6F, 2, 1, 8, 0.0F, false));
		gun85_r1.cubeList.add(new ModelBox(gun85_r1, 0, 52, -4.0F, 0.0F, 0.0F, 4, 4, 6, 0.0F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-3.0F, -20.25F, 24.4F);
		gripstock.addChild(gun32);
		setRotationAngle(gun32, -1.2641F, 0.0F, 0.0F);
		gun32.cubeList.add(new ModelBox(gun32, 0, 13, 0.001F, 2.0F, -1.0F, 4, 4, 1, 0.0F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-3.0F, -21.5F, 18.4F);
		gripstock.addChild(gun33);
		setRotationAngle(gun33, 0.409F, 0.0F, 0.0F);
		gun33.cubeList.add(new ModelBox(gun33, 88, 87, -0.001F, 0.0F, -1.0F, 4, 3, 2, 0.0F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(-3.0F, -23.3F, 16.75F);
		gripstock.addChild(gun34);
		setRotationAngle(gun34, 0.632F, 0.0F, 0.0F);
		gun34.cubeList.add(new ModelBox(gun34, 0, 83, 0.001F, 0.0F, -1.0F, 4, 4, 3, 0.0F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-3.0F, -25.2F, 13.5F);
		gripstock.addChild(gun35);
		setRotationAngle(gun35, 1.041F, 0.0F, 0.0F);
		gun35.cubeList.add(new ModelBox(gun35, 36, 63, -0.001F, 0.0F, -1.0F, 4, 5, 3, 0.0F, false));

		gun65 = new ModelRenderer(this);
		gun65.setRotationPoint(-3.0F, -26.4F, 10.3F);
		gripstock.addChild(gun65);
		setRotationAngle(gun65, 1.2269F, 0.0F, 0.0F);
		gun65.cubeList.add(new ModelBox(gun65, 38, 13, 0.001F, 0.0F, -1.0F, 4, 4, 2, 0.0F, false));

		gun69 = new ModelRenderer(this);
		gun69.setRotationPoint(-2.0F, -19.2F, 23.8F);
		gripstock.addChild(gun69);
		setRotationAngle(gun69, -1.2641F, 0.0F, 0.0F);
		gun69.cubeList.add(new ModelBox(gun69, 0, 52, 0.001F, 1.0F, -1.0F, 2, 5, 1, 0.0F, false));

		gun96 = new ModelRenderer(this);
		gun96.setRotationPoint(-2.0F, -20.5F, 17.8F);
		gripstock.addChild(gun96);
		setRotationAngle(gun96, 0.409F, 0.0F, 0.0F);
		gun96.cubeList.add(new ModelBox(gun96, 40, 57, 0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		gun97 = new ModelRenderer(this);
		gun97.setRotationPoint(-2.0F, -22.7F, 16.0F);
		gripstock.addChild(gun97);
		setRotationAngle(gun97, 0.632F, 0.0F, 0.0F);
		gun97.cubeList.add(new ModelBox(gun97, 12, 62, -0.001F, 0.0F, -1.0F, 2, 4, 1, 0.0F, false));

		gun98 = new ModelRenderer(this);
		gun98.setRotationPoint(-2.0F, -24.4F, 13.0F);
		gripstock.addChild(gun98);
		setRotationAngle(gun98, 1.041F, 0.0F, 0.0F);
		gun98.cubeList.add(new ModelBox(gun98, 57, 10, 0.0F, 0.0F, -1.0F, 2, 4, 1, 0.0F, false));

		gun99 = new ModelRenderer(this);
		gun99.setRotationPoint(-2.0F, -25.5F, 10.0F);
		gripstock.addChild(gun99);
		setRotationAngle(gun99, 1.2269F, 0.0F, 0.0F);
		gun99.cubeList.add(new ModelBox(gun99, 45, 0, -0.001F, 0.0F, -1.0F, 2, 4, 1, 0.0F, false));

		gun100 = new ModelRenderer(this);
		gun100.setRotationPoint(-3.0F, -29.0F, 11.2F);
		gripstock.addChild(gun100);
		setRotationAngle(gun100, -0.3718F, 0.0F, 0.0F);
		gun100.cubeList.add(new ModelBox(gun100, 23, 52, 0.003F, 0.0F, 0.0F, 4, 2, 9, 0.0F, false));

		gun124 = new ModelRenderer(this);
		gun124.setRotationPoint(-2.0F, -29.76F, 11.35F);
		gripstock.addChild(gun124);
		setRotationAngle(gun124, -0.3718F, 0.0F, 0.0F);
		gun124.cubeList.add(new ModelBox(gun124, 23, 63, 0.0F, 0.0F, 0.0F, 2, 1, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		gun.render(f5);
//		barrel.render(f5);
//		pump.render(f5);
//		stock.render(f5);
//		extendedbarrel.render(f5);
//		sawedstock.render(f5);
		gripstock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
