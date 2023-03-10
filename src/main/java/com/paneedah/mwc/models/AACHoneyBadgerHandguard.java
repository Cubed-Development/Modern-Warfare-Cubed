package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class AACHoneyBadgerHandguard extends ModelWithAttachments {
	private final ModelRenderer gun13;
	private final ModelRenderer gun17;
	private final ModelRenderer gun19;
	private final ModelRenderer gun21;
	private final ModelRenderer gun22;
	private final ModelRenderer gun24;
	private final ModelRenderer gun26;
	private final ModelRenderer gun28;
	private final ModelRenderer gun30;
	private final ModelRenderer gun35;
	private final ModelRenderer gun36;
	private final ModelRenderer gun45;
	private final ModelRenderer gun47;
	private final ModelRenderer gun48;
	private final ModelRenderer gun49;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer gun52;
	private final ModelRenderer gun53;
	private final ModelRenderer gun54;
	private final ModelRenderer gun55;
	private final ModelRenderer gun57;
	private final ModelRenderer gun58;
	private final ModelRenderer gun60;
	private final ModelRenderer gun62;
	private final ModelRenderer gun63;
	private final ModelRenderer gun65;
	private final ModelRenderer gun66;
	private final ModelRenderer gun67;
	private final ModelRenderer gun68;
	private final ModelRenderer gun69;
	private final ModelRenderer gun70;
	private final ModelRenderer gun71;
	private final ModelRenderer gun72;
	private final ModelRenderer gun73;
	private final ModelRenderer gun74;
	private final ModelRenderer gun75;
	private final ModelRenderer gun76;
	private final ModelRenderer gun77;
	private final ModelRenderer gun79;
	private final ModelRenderer gun81;
	private final ModelRenderer gun82;
	private final ModelRenderer gun83;
	private final ModelRenderer gun84;
	private final ModelRenderer gun85;
	private final ModelRenderer gun87;
	private final ModelRenderer gun89;
	private final ModelRenderer gun90;
	private final ModelRenderer gun91;
	private final ModelRenderer gun92;
	private final ModelRenderer gun93;
	private final ModelRenderer gun94;
	private final ModelRenderer gun95;
	private final ModelRenderer gun96;
	private final ModelRenderer gun98;
	private final ModelRenderer gun101;
	private final ModelRenderer gun103;
	private final ModelRenderer gun104;
	private final ModelRenderer gun109;
	private final ModelRenderer gun111;
	private final ModelRenderer gun112;
	private final ModelRenderer gun113;
	private final ModelRenderer gun114;
	private final ModelRenderer gun121;
	private final ModelRenderer gun125;
	private final ModelRenderer gun126;
	private final ModelRenderer gun127;
	private final ModelRenderer gun129;
	private final ModelRenderer gun130;
	private final ModelRenderer gun132;
	private final ModelRenderer gun153;
	private final ModelRenderer gun156;
	private final ModelRenderer gun157;
	private final ModelRenderer gun170;
	private final ModelRenderer gun248;
	private final ModelRenderer gun249;
	private final ModelRenderer gun251;
	private final ModelRenderer gun252;
	private final ModelRenderer gun254;
	private final ModelRenderer gun255;
	private final ModelRenderer gun260;
	private final ModelRenderer gun263;
	private final ModelRenderer gun264;
	private final ModelRenderer gun266;
	private final ModelRenderer gun267;
	private final ModelRenderer gun270;
	private final ModelRenderer gun271;
	private final ModelRenderer gun272;
	private final ModelRenderer gun273;
	private final ModelRenderer gun274;
	private final ModelRenderer gun303;
	private final ModelRenderer gun319;
	private final ModelRenderer gun343;
	private final ModelRenderer gun346;
	private final ModelRenderer gun745;
	private final ModelRenderer gun765;
	private final ModelRenderer gun766;
	private final ModelRenderer silencer;
	private final ModelRenderer gun865;
	private final ModelRenderer gun866;
	private final ModelRenderer gun868;
	private final ModelRenderer gun867;
	private final ModelRenderer gun861;
	private final ModelRenderer gun859;
	private final ModelRenderer gun871;
	private final ModelRenderer gun872;
	private final ModelRenderer gun862;
	private final ModelRenderer gun863;
	private final ModelRenderer gun873;
	private final ModelRenderer gun874;
	private final ModelRenderer gun864;
	private final ModelRenderer gun869;
	private final ModelRenderer gun870;
	private final ModelRenderer gun860;
	private final ModelRenderer handguard;
	private final ModelRenderer bone4;
	private final ModelRenderer bone6;
	private final ModelRenderer bone5;
	private final ModelRenderer stock;
	private final ModelRenderer gun789;
	private final ModelRenderer gun808;
	private final ModelRenderer gun792;
	private final ModelRenderer gun796;
	private final ModelRenderer gun786;
	private final ModelRenderer gun787;
	private final ModelRenderer gun798;
	private final ModelRenderer gun799;
	private final ModelRenderer gun806;
	private final ModelRenderer gun790;
	private final ModelRenderer gun793;
	private final ModelRenderer gun791;
	private final ModelRenderer gun795;
	private final ModelRenderer gun800;
	private final ModelRenderer gun801;
	private final ModelRenderer gun804;
	private final ModelRenderer gun815;
	private final ModelRenderer gun814;
	private final ModelRenderer gun813;
	private final ModelRenderer gun812;
	private final ModelRenderer gun807;
	private final ModelRenderer gun809;
	private final ModelRenderer gun810;
	private final ModelRenderer gun811;
	private final ModelRenderer gun794;
	private final ModelRenderer gun788;
	private final ModelRenderer gun802;
	private final ModelRenderer gun803;
	private final ModelRenderer gun805;
	private final ModelRenderer gun797;
	private final ModelRenderer gun831;
	private final ModelRenderer gun832;
	private final ModelRenderer gun821;
	private final ModelRenderer gun820;
	private final ModelRenderer gun822;
	private final ModelRenderer gun823;
	private final ModelRenderer gun824;
	private final ModelRenderer gun825;
	private final ModelRenderer gun828;
	private final ModelRenderer gun826;
	private final ModelRenderer gun829;
	private final ModelRenderer gun827;
	private final ModelRenderer gun830;
	private final ModelRenderer gun816;
	private final ModelRenderer gun819;
	private final ModelRenderer gun817;
	private final ModelRenderer gun818;
	private final ModelRenderer gun772;
	private final ModelRenderer gun773;
	private final ModelRenderer gun774;
	private final ModelRenderer gun775;
	private final ModelRenderer gun779;
	private final ModelRenderer gun780;
	private final ModelRenderer gun777;
	private final ModelRenderer gun778;
	private final ModelRenderer receiver;
	private final ModelRenderer gun767;
	private final ModelRenderer gun769;
	private final ModelRenderer gun770;
	private final ModelRenderer gun768;
	private final ModelRenderer gun771;
	private final ModelRenderer gun764;
	private final ModelRenderer gun97;
	private final ModelRenderer gun100;
	private final ModelRenderer gun135;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer gun138;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer gun735;
	private final ModelRenderer gun736;
	private final ModelRenderer gun108;
	private final ModelRenderer gun106;
	private final ModelRenderer gun107;
	private final ModelRenderer gun99;
	private final ModelRenderer gun737;
	private final ModelRenderer gun738;
	private final ModelRenderer gun776;
	private final ModelRenderer gun781;
	private final ModelRenderer gun782;
	private final ModelRenderer gun783;
	private final ModelRenderer gun785;
	private final ModelRenderer gun784;

	public AACHoneyBadgerHandguard() {
		textureWidth = 256;
		textureHeight = 256;

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-3.2F, -7.0F, -6.5F);
		gun13.cubeList.add(new ModelBox(gun13, 16, 16, 0.2F, 0.0F, 0.0F, 3, 5, 1, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-3.2F, -6.0F, -6.5F);
		setRotationAngle(gun17, 2.3423F, 0.0F, 0.0F);
		gun17.cubeList.add(new ModelBox(gun17, 12, 45, 0.2F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-3.2F, -3.0F, -7.3F);
		gun19.cubeList.add(new ModelBox(gun19, 0, 22, 0.2F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-3.2F, -3.0F, -7.3F);
		setRotationAngle(gun21, 0.8923F, 0.0F, 0.0F);
		gun21.cubeList.add(new ModelBox(gun21, 0, 45, 0.2F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-3.0F, -3.1F, -12.3F);
		gun22.cubeList.add(new ModelBox(gun22, 80, 0, 0.5F, 0.0F, 0.0F, 2, 1, 6, 0.0F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-3.2F, -3.0F, -13.3F);
		gun24.cubeList.add(new ModelBox(gun24, 0, 6, 0.2F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-3.2F, -7.0F, -13.8F);
		gun26.cubeList.add(new ModelBox(gun26, 0, 0, 0.19F, 0.0F, 0.0F, 3, 5, 1, 0.0F, false));

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(-3.2F, -3.0F, -12.3F);
		setRotationAngle(gun28, -2.8256F, 0.0F, 0.0F);
		gun28.cubeList.add(new ModelBox(gun28, 54, 50, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(-3.2F, -5.5F, -12.8F);
		setRotationAngle(gun30, 2.6769F, 0.0F, 0.0F);
		gun30.cubeList.add(new ModelBox(gun30, 64, 58, 0.2F, 0.0F, 0.0F, 3, 3, 1, 0.0F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-0.7F, -12.0F, -12.0F);
		gun35.cubeList.add(new ModelBox(gun35, 157, 131, 0.0F, 0.0F, -2.0F, 1, 5, 13, 0.0F, false));

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(-3.3F, -12.0F, -12.0F);
		gun36.cubeList.add(new ModelBox(gun36, 138, 156, 0.0F, 0.0F, -2.0F, 3, 5, 13, 0.0F, false));

		gun45 = new ModelRenderer(this);
		gun45.setRotationPoint(-3.5F, -12.0F, -21.2F);
		gun45.cubeList.add(new ModelBox(gun45, 0, 0, 0.0F, 0.0F, 0.0F, 4, 8, 8, 0.0F, false));

		gun47 = new ModelRenderer(this);
		gun47.setRotationPoint(-3.5F, -4.5F, -21.2F);
		gun47.cubeList.add(new ModelBox(gun47, 0, 16, 0.0F, 0.0F, 0.0F, 4, 1, 8, 0.0F, false));

		gun48 = new ModelRenderer(this);
		gun48.setRotationPoint(-3.5F, -3.7F, -16.2F);
		gun48.cubeList.add(new ModelBox(gun48, 26, 73, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun49 = new ModelRenderer(this);
		gun49.setRotationPoint(-0.3F, -3.5F, -21.2F);
		setRotationAngle(gun49, 1.3756F, 0.0F, 0.0F);
		gun49.cubeList.add(new ModelBox(gun49, 13, 27, -3.7F, -0.15F, 0.0F, 5, 8, 1, 0.0F, false));
		gun49.cubeList.add(new ModelBox(gun49, 27, 35, -3.2F, -0.6F, 0.0F, 4, 3, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.3F, 7.8437F, 1.0F);
		gun49.addChild(bone);
		setRotationAngle(bone, 0.0F, -0.5411F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 52, 54, -1.0F, -8.0F, 0.0F, 1, 8, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-3.7F, 7.8437F, 1.0F);
		gun49.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.5411F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 6, 27, 0.0F, -8.0F, 0.0F, 1, 8, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.5F, -0.6057F, 1.0015F);
		gun49.addChild(bone3);
		setRotationAngle(bone3, -1.7977F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 13, 36, -2.69F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun52 = new ModelRenderer(this);
		gun52.setRotationPoint(-3.5F, -12.0F, -15.2F);
		gun52.cubeList.add(new ModelBox(gun52, 80, 80, 0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F, false));

		gun53 = new ModelRenderer(this);
		gun53.setRotationPoint(-3.5F, -8.0F, -11.2F);
		setRotationAngle(gun53, -2.7884F, 0.0F, 0.0F);
		gun53.cubeList.add(new ModelBox(gun53, 0, 72, 0.001F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun54 = new ModelRenderer(this);
		gun54.setRotationPoint(-0.35F, -12.0F, -16.5F);
		gun54.cubeList.add(new ModelBox(gun54, 45, 29, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun55 = new ModelRenderer(this);
		gun55.setRotationPoint(-0.4F, -9.5F, -16.3F);
		gun55.cubeList.add(new ModelBox(gun55, 39, 0, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun57 = new ModelRenderer(this);
		gun57.setRotationPoint(-3.5F, -11.5F, -22.7F);
		gun57.cubeList.add(new ModelBox(gun57, 39, 6, 0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun58 = new ModelRenderer(this);
		gun58.setRotationPoint(-3.5F, -10.5F, -22.7F);
		setRotationAngle(gun58, 0.9955F, 0.0F, 0.0F);
		gun58.cubeList.add(new ModelBox(gun58, 39, 35, 0.01F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -11.5F, -22.4F);
		gun60.cubeList.add(new ModelBox(gun60, 59, 4, 0.0F, 0.03F, 0.0F, 1, 1, 1, 0.0F, false));

		gun62 = new ModelRenderer(this);
		gun62.setRotationPoint(-2.0F, -7.5F, -9.5F);
		setRotationAngle(gun62, 0.2603F, 0.0F, 0.0F);
		gun62.cubeList.add(new ModelBox(gun62, 32, 46, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun63 = new ModelRenderer(this);
		gun63.setRotationPoint(-2.0F, -6.2F, -8.95F);
		setRotationAngle(gun63, -0.409F, 0.0F, 0.0F);
		gun63.cubeList.add(new ModelBox(gun63, 39, 45, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun65 = new ModelRenderer(this);
		gun65.setRotationPoint(-0.7F, -12.0F, -1.0F);
		gun65.cubeList.add(new ModelBox(gun65, 27, 12, 0.0F, -0.5F, 0.0F, 1, 3, 4, 0.0F, false));

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(-0.7F, -9.5F, 1.5F);
		setRotationAngle(gun66, -2.3423F, 0.0F, 0.0F);
		gun66.cubeList.add(new ModelBox(gun66, 27, 40, 0.01F, 0.0F, 0.0F, 1, 2, 4, 0.0F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -9.5F, 1.5F);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 80, 14, -0.01F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

		gun68 = new ModelRenderer(this);
		gun68.setRotationPoint(-3.0F, -9.0F, 1.8F);
		setRotationAngle(gun68, -2.3423F, 0.0F, 0.0F);
		gun68.cubeList.add(new ModelBox(gun68, 79, 71, 0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

		gun69 = new ModelRenderer(this);
		gun69.setRotationPoint(-3.3F, -12.0F, -1.0F);
		gun69.cubeList.add(new ModelBox(gun69, 79, 64, 0.0F, 0.5F, 0.0F, 3, 2, 4, 0.0F, false));

		gun70 = new ModelRenderer(this);
		gun70.setRotationPoint(-0.75F, -14.0F, -22.0F);
		gun70.cubeList.add(new ModelBox(gun70, 28, 3, 0.0F, 0.0F, 0.0F, 1, 2, 24, 0.0F, false));

		gun71 = new ModelRenderer(this);
		gun71.setRotationPoint(-3.25F, -13.0F, -22.0F);
		gun71.cubeList.add(new ModelBox(gun71, 54, 0, 0.0F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

		gun72 = new ModelRenderer(this);
		gun72.setRotationPoint(-1.45F, -14.0F, -21.2F);
		gun72.cubeList.add(new ModelBox(gun72, 27, 12, 0.0F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));

		gun73 = new ModelRenderer(this);
		gun73.setRotationPoint(-0.55F, -14.0F, -21.2F);
		gun73.cubeList.add(new ModelBox(gun73, 27, 0, 0.0F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));

		gun74 = new ModelRenderer(this);
		gun74.setRotationPoint(-0.4F, -12.5F, -16.5F);
		gun74.cubeList.add(new ModelBox(gun74, 65, 11, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun75 = new ModelRenderer(this);
		gun75.setRotationPoint(-3.7F, -11.5F, -22.4F);
		gun75.cubeList.add(new ModelBox(gun75, 59, 0, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun76 = new ModelRenderer(this);
		gun76.setRotationPoint(-3.8F, -11.3F, -21.4F);
		gun76.cubeList.add(new ModelBox(gun76, 54, 0, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun77 = new ModelRenderer(this);
		gun77.setRotationPoint(-3.8F, -10.3F, -21.4F);
		setRotationAngle(gun77, 0.0F, 0.0F, -0.8551F);
		gun77.cubeList.add(new ModelBox(gun77, 52, 54, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun79 = new ModelRenderer(this);
		gun79.setRotationPoint(-3.8F, -10.3F, -14.7F);
		gun79.cubeList.add(new ModelBox(gun79, 39, 40, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun81 = new ModelRenderer(this);
		gun81.setRotationPoint(-3.8F, -10.3F, -13.7F);
		setRotationAngle(gun81, 0.0F, 0.7808F, 0.0F);
		gun81.cubeList.add(new ModelBox(gun81, 33, 40, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun82 = new ModelRenderer(this);
		gun82.setRotationPoint(-3.8F, -10.3F, -14.7F);
		setRotationAngle(gun82, 0.0F, 0.7436F, 0.0F);
		gun82.cubeList.add(new ModelBox(gun82, 27, 40, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun83 = new ModelRenderer(this);
		gun83.setRotationPoint(-3.8F, -8.4F, -13.7F);
		gun83.cubeList.add(new ModelBox(gun83, 58, 59, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun84 = new ModelRenderer(this);
		gun84.setRotationPoint(-3.8F, -8.3F, -14.7F);
		setRotationAngle(gun84, 0.7854F, 0.0F, 0.0F);
		gun84.cubeList.add(new ModelBox(gun84, 31, 59, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun85 = new ModelRenderer(this);
		gun85.setRotationPoint(-3.7F, -10.0F, -12.7F);
		gun85.cubeList.add(new ModelBox(gun85, 58, 25, 0.0F, 0.3F, 0.0F, 1, 1, 1, 0.0F, false));

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(-0.35F, -8.0F, -16.5F);
		gun87.cubeList.add(new ModelBox(gun87, 16, 0, 0.0F, -0.5F, 0.0F, 1, 5, 2, 0.0F, false));

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(-0.35F, -10.3F, -16.5F);
		gun89.cubeList.add(new ModelBox(gun89, 62, 65, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun90 = new ModelRenderer(this);
		gun90.setRotationPoint(-0.35F, -9.5F, -16.5F);
		gun90.cubeList.add(new ModelBox(gun90, 5, 58, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun91 = new ModelRenderer(this);
		gun91.setRotationPoint(-0.6F, -9.5F, -15.5F);
		setRotationAngle(gun91, 0.0F, 0.0F, -0.7436F);
		gun91.cubeList.add(new ModelBox(gun91, 56, 54, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(-0.6F, -8.5F, -15.5F);
		setRotationAngle(gun92, 0.0F, 0.0F, -0.8551F);
		gun92.cubeList.add(new ModelBox(gun92, 32, 56, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun93 = new ModelRenderer(this);
		gun93.setRotationPoint(-0.6F, -9.5F, -16.0F);
		setRotationAngle(gun93, 0.0F, 0.0F, -0.7436F);
		gun93.cubeList.add(new ModelBox(gun93, 26, 56, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun94 = new ModelRenderer(this);
		gun94.setRotationPoint(-0.6F, -8.5F, -16.0F);
		setRotationAngle(gun94, 0.0F, 0.0F, -0.8551F);
		gun94.cubeList.add(new ModelBox(gun94, 12, 55, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun95 = new ModelRenderer(this);
		gun95.setRotationPoint(-0.75F, -14.0F, -22.7F);
		gun95.cubeList.add(new ModelBox(gun95, 39, 29, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun96 = new ModelRenderer(this);
		gun96.setRotationPoint(-3.25F, -14.0F, -22.7F);
		gun96.cubeList.add(new ModelBox(gun96, 39, 17, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun98 = new ModelRenderer(this);
		gun98.setRotationPoint(-3.7F, -13.8F, -22.7F);
		gun98.cubeList.add(new ModelBox(gun98, 52, 65, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun101 = new ModelRenderer(this);
		gun101.setRotationPoint(-3.7F, -12.8F, -22.0F);
		setRotationAngle(gun101, 0.0F, 0.0F, -0.7854F);
		gun101.cubeList.add(new ModelBox(gun101, 28, 29, 0.0F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

		gun103 = new ModelRenderer(this);
		gun103.setRotationPoint(-2.7F, -15.3F, -22.0F);
		gun103.cubeList.add(new ModelBox(gun103, 52, 54, 0.0F, 0.0F, 0.0F, 2, 1, 23, 0.0F, false));

		gun104 = new ModelRenderer(this);
		gun104.setRotationPoint(-2.5F, -16.1F, -22.0F);
		gun104.cubeList.add(new ModelBox(gun104, 0, 78, 0.0F, 0.0F, 0.0F, 2, 1, 21, 0.0F, false));

		gun109 = new ModelRenderer(this);
		gun109.setRotationPoint(-2.7F, -15.3F, -22.7F);
		gun109.cubeList.add(new ModelBox(gun109, 39, 65, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun111 = new ModelRenderer(this);
		gun111.setRotationPoint(-2.5F, -16.1F, -22.7F);
		gun111.cubeList.add(new ModelBox(gun111, 54, 8, -0.001F, -0.001F, 0.0F, 2, 1, 1, 0.0F, false));

		gun112 = new ModelRenderer(this);
		gun112.setRotationPoint(-3.7F, -14.4F, -22.7F);
		setRotationAngle(gun112, 0.0F, 0.0F, 1.2269F);
		gun112.cubeList.add(new ModelBox(gun112, 45, 17, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun113 = new ModelRenderer(this);
		gun113.setRotationPoint(-3.7F, -14.4F, -22.7F);
		gun113.cubeList.add(new ModelBox(gun113, 26, 65, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun114 = new ModelRenderer(this);
		gun114.setRotationPoint(-3.7F, -12.8F, -22.7F);
		setRotationAngle(gun114, 0.0F, 0.0F, -0.7854F);
		gun114.cubeList.add(new ModelBox(gun114, 54, 25, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun121 = new ModelRenderer(this);
		gun121.setRotationPoint(-2.5F, -15.3F, 1.0F);
		gun121.cubeList.add(new ModelBox(gun121, 0, 16, 0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F, false));

		gun125 = new ModelRenderer(this);
		gun125.setRotationPoint(-2.5F, -16.1F, -1.0F);
		setRotationAngle(gun125, -0.632F, 0.0F, 0.0F);
		gun125.cubeList.add(new ModelBox(gun125, 54, 45, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun126 = new ModelRenderer(this);
		gun126.setRotationPoint(-0.3F, -11.6F, -12.5F);
		gun126.cubeList.add(new ModelBox(gun126, 46, 54, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun127 = new ModelRenderer(this);
		gun127.setRotationPoint(-0.3F, -11.6F, -13.0F);
		gun127.cubeList.add(new ModelBox(gun127, 32, 54, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun129 = new ModelRenderer(this);
		gun129.setRotationPoint(-0.25F, -11.5F, -12.75F);
		gun129.cubeList.add(new ModelBox(gun129, 39, 12, 0.0F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun130 = new ModelRenderer(this);
		gun130.setRotationPoint(0.75F, -10.5F, -12.75F);
		setRotationAngle(gun130, 0.0F, 0.0F, 2.3051F);
		gun130.cubeList.add(new ModelBox(gun130, 26, 54, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-0.25F, -12.1F, -12.9F);
		setRotationAngle(gun132, 0.0F, 0.0F, -1.2641F);
		gun132.cubeList.add(new ModelBox(gun132, 54, 21, -0.3162F, -0.0048F, -0.31F, 2, 1, 2, 0.0F, false));

		gun153 = new ModelRenderer(this);
		gun153.setRotationPoint(-0.6F, -9.7F, -6.3F);
		setRotationAngle(gun153, 0.5934F, 0.0F, 0.0F);
		gun153.cubeList.add(new ModelBox(gun153, 12, 53, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156 = new ModelRenderer(this);
		gun156.setRotationPoint(-0.5F, -10.1F, -5.5F);
		setRotationAngle(gun156, -0.1396F, 0.1047F, 0.0F);
		gun156.cubeList.add(new ModelBox(gun156, 0, 64, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun157 = new ModelRenderer(this);
		gun157.setRotationPoint(-3.0F, -14.5F, -22.6F);
		gun157.cubeList.add(new ModelBox(gun157, 38, 54, 0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(-3.0F, -10.0F, 1.0F);
		gun170.cubeList.add(new ModelBox(gun170, 27, 19, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun248 = new ModelRenderer(this);
		gun248.setRotationPoint(-4.3F, -15.0F, -11.0F);
		gun248.cubeList.add(new ModelBox(gun248, 50, 0, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun249 = new ModelRenderer(this);
		gun249.setRotationPoint(-4.3F, -15.0F, -10.0F);
		setRotationAngle(gun249, 0.0F, 0.5205F, 0.0F);
		gun249.cubeList.add(new ModelBox(gun249, 64, 54, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun251 = new ModelRenderer(this);
		gun251.setRotationPoint(-4.3F, -15.0F, -11.0F);
		setRotationAngle(gun251, 0.0F, 0.0F, -0.1859F);
		gun251.cubeList.add(new ModelBox(gun251, 18, 50, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun252 = new ModelRenderer(this);
		gun252.setRotationPoint(-4.3F, -13.5F, -11.0F);
		setRotationAngle(gun252, 0.0F, 0.0F, -1.3384F);
		gun252.cubeList.add(new ModelBox(gun252, 39, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun254 = new ModelRenderer(this);
		gun254.setRotationPoint(-4.3F, -14.5F, -11.0F);
		gun254.cubeList.add(new ModelBox(gun254, 12, 50, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun255 = new ModelRenderer(this);
		gun255.setRotationPoint(-4.3F, -14.5F, -10.0F);
		setRotationAngle(gun255, 0.0F, 0.5205F, 0.0F);
		gun255.cubeList.add(new ModelBox(gun255, 13, 64, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun260 = new ModelRenderer(this);
		gun260.setRotationPoint(-4.1F, -13.65F, -20.5F);
		setRotationAngle(gun260, 0.0F, 0.0F, 0.1115F);
		gun260.cubeList.add(new ModelBox(gun260, 54, 11, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun263 = new ModelRenderer(this);
		gun263.setRotationPoint(-4.1F, -13.0F, -21.5F);
		setRotationAngle(gun263, 0.0F, 0.0F, -0.9295F);
		gun263.cubeList.add(new ModelBox(gun263, 0, 27, 0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		gun264 = new ModelRenderer(this);
		gun264.setRotationPoint(-4.2F, -13.4F, -20.0F);
		setRotationAngle(gun264, 0.0F, 0.0F, 0.2974F);
		gun264.cubeList.add(new ModelBox(gun264, 52, 65, 0.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F, false));

		gun266 = new ModelRenderer(this);
		gun266.setRotationPoint(-3.7F, -13.8F, -11.0F);
		gun266.cubeList.add(new ModelBox(gun266, 92, 154, 0.0F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));

		gun267 = new ModelRenderer(this);
		gun267.setRotationPoint(-4.7F, -11.8F, -20.0F);
		setRotationAngle(gun267, 0.0F, 0.0F, 0.2974F);
		gun267.cubeList.add(new ModelBox(gun267, 25, 79, 0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun270 = new ModelRenderer(this);
		gun270.setRotationPoint(-4.6F, -12.9F, -16.5F);
		setRotationAngle(gun270, 0.0F, 0.0F, 0.2974F);
		gun270.cubeList.add(new ModelBox(gun270, 20, 39, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun271 = new ModelRenderer(this);
		gun271.setRotationPoint(-4.4F, -13.0F, -19.7F);
		setRotationAngle(gun271, 0.0F, 0.0F, 0.2974F);
		gun271.cubeList.add(new ModelBox(gun271, 53, 60, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun272 = new ModelRenderer(this);
		gun272.setRotationPoint(-4.4F, -13.0F, -15.3F);
		setRotationAngle(gun272, 0.0F, 0.0F, 0.2974F);
		gun272.cubeList.add(new ModelBox(gun272, 38, 59, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun273 = new ModelRenderer(this);
		gun273.setRotationPoint(-4.62F, -12.3F, -19.7F);
		setRotationAngle(gun273, 0.0F, 0.0F, 0.2974F);
		gun273.cubeList.add(new ModelBox(gun273, 26, 59, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun274 = new ModelRenderer(this);
		gun274.setRotationPoint(-4.62F, -12.3F, -15.3F);
		setRotationAngle(gun274, 0.0F, 0.0F, 0.2974F);
		gun274.cubeList.add(new ModelBox(gun274, 12, 58, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun303 = new ModelRenderer(this);
		gun303.setRotationPoint(-1.3F, -15.3F, -22.0F);
		gun303.cubeList.add(new ModelBox(gun303, 55, 25, 0.0F, 0.0F, 0.0F, 1, 2, 23, 0.0F, false));

		gun319 = new ModelRenderer(this);
		gun319.setRotationPoint(-2.0F, -16.3F, -1.0F);
		gun319.cubeList.add(new ModelBox(gun319, 62, 50, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun343 = new ModelRenderer(this);
		gun343.setRotationPoint(-1.3F, -15.3F, -22.7F);
		gun343.cubeList.add(new ModelBox(gun343, 12, 39, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun346 = new ModelRenderer(this);
		gun346.setRotationPoint(-2.8F, -15.3F, -21.0F);
		gun346.cubeList.add(new ModelBox(gun346, 26, 54, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun745 = new ModelRenderer(this);
		gun745.setRotationPoint(-3.8F, -8.3F, -14.7F);
		setRotationAngle(gun745, 0.7854F, 0.0F, 0.0F);
		gun745.cubeList.add(new ModelBox(gun745, 6, 53, 0.0F, 0.3F, 0.0F, 1, 1, 1, 0.0F, false));

		gun765 = new ModelRenderer(this);
		gun765.setRotationPoint(0.1F, -13.7F, -8.9F);
		gun765.cubeList.add(new ModelBox(gun765, 158, 114, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		gun766 = new ModelRenderer(this);
		gun766.setRotationPoint(0.1F, -13.2F, -8.9F);
		gun766.cubeList.add(new ModelBox(gun766, 158, 97, 0.01F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		silencer = new ModelRenderer(this);
		silencer.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun865 = new ModelRenderer(this);
		gun865.setRotationPoint(-0.5F, -37.3F, -52.7F);
		silencer.addChild(gun865);
		gun865.cubeList.add(new ModelBox(gun865, 140, 97, 0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun866 = new ModelRenderer(this);
		gun866.setRotationPoint(-0.5F, -37.9F, -52.7F);
		silencer.addChild(gun866);
		gun866.cubeList.add(new ModelBox(gun866, 140, 80, 0.01F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun868 = new ModelRenderer(this);
		gun868.setRotationPoint(-0.7F, -39.1F, -52.7F);
		silencer.addChild(gun868);
		setRotationAngle(gun868, 0.0F, 0.0F, 0.7854F);
		gun868.cubeList.add(new ModelBox(gun868, 139, 139, 0.7F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun867 = new ModelRenderer(this);
		gun867.setRotationPoint(-0.7F, -39.1F, -52.7F);
		silencer.addChild(gun867);
		setRotationAngle(gun867, 0.0F, 0.0F, 0.7854F);
		gun867.cubeList.add(new ModelBox(gun867, 18, 140, 0.0F, -0.01F, 0.0F, 1, 1, 16, 0.0F, false));

		gun861 = new ModelRenderer(this);
		gun861.setRotationPoint(-1.7F, -39.1F, -52.7F);
		silencer.addChild(gun861);
		gun861.cubeList.add(new ModelBox(gun861, 142, 54, 0.0F, -0.01F, 0.0F, 1, 1, 16, 0.0F, false));

		gun859 = new ModelRenderer(this);
		gun859.setRotationPoint(-2.3F, -39.1F, -52.7F);
		silencer.addChild(gun859);
		gun859.cubeList.add(new ModelBox(gun859, 149, 36, 0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun871 = new ModelRenderer(this);
		gun871.setRotationPoint(-2.3F, -39.1F, -52.7F);
		silencer.addChild(gun871);
		setRotationAngle(gun871, 0.0F, 0.0F, 0.7854F);
		gun871.cubeList.add(new ModelBox(gun871, 86, 137, -0.01F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun872 = new ModelRenderer(this);
		gun872.setRotationPoint(-2.3F, -39.1F, -52.7F);
		silencer.addChild(gun872);
		setRotationAngle(gun872, 0.0F, 0.0F, 0.7854F);
		gun872.cubeList.add(new ModelBox(gun872, 121, 136, 0.0F, 0.7F, 0.0F, 1, 1, 16, 0.0F, false));

		gun862 = new ModelRenderer(this);
		gun862.setRotationPoint(-3.5F, -37.9F, -52.7F);
		silencer.addChild(gun862);
		gun862.cubeList.add(new ModelBox(gun862, 142, 2, 0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun863 = new ModelRenderer(this);
		gun863.setRotationPoint(-3.5F, -37.3F, -52.7F);
		silencer.addChild(gun863);
		gun863.cubeList.add(new ModelBox(gun863, 56, 141, -0.01F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun873 = new ModelRenderer(this);
		gun873.setRotationPoint(-2.3F, -35.1F, -52.7F);
		silencer.addChild(gun873);
		setRotationAngle(gun873, 0.0F, 0.0F, -2.3562F);
		gun873.cubeList.add(new ModelBox(gun873, 131, 37, 0.7F, -0.01F, 0.0F, 1, 1, 16, 0.0F, false));

		gun874 = new ModelRenderer(this);
		gun874.setRotationPoint(-2.3F, -36.1F, -52.7F);
		silencer.addChild(gun874);
		gun874.cubeList.add(new ModelBox(gun874, 124, 63, 0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun864 = new ModelRenderer(this);
		gun864.setRotationPoint(-1.7F, -36.1F, -52.7F);
		silencer.addChild(gun864);
		gun864.cubeList.add(new ModelBox(gun864, 140, 114, 0.0F, -0.01F, 0.0F, 1, 1, 16, 0.0F, false));

		gun869 = new ModelRenderer(this);
		gun869.setRotationPoint(-0.7F, -35.1F, -52.7F);
		silencer.addChild(gun869);
		setRotationAngle(gun869, 0.0F, 0.0F, -2.3562F);
		gun869.cubeList.add(new ModelBox(gun869, 38, 138, 0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun870 = new ModelRenderer(this);
		gun870.setRotationPoint(-0.7F, -35.1F, -52.7F);
		silencer.addChild(gun870);
		setRotationAngle(gun870, 0.0F, 0.0F, -2.3562F);
		gun870.cubeList.add(new ModelBox(gun870, 0, 138, 0.01F, 0.7F, 0.0F, 1, 1, 16, 0.0F, false));

		gun860 = new ModelRenderer(this);
		gun860.setRotationPoint(-2.3F, -35.1F, -52.7F);
		silencer.addChild(gun860);
		setRotationAngle(gun860, 0.0F, 0.0F, -2.3562F);
		gun860.cubeList.add(new ModelBox(gun860, 146, 19, 0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguard.cubeList.add(new ModelBox(handguard, 102, 71, -4.0F, -38.5F, -42.7F, 1, 1, 20, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 22, 101, 0.0F, -38.5F, -42.7F, 1, 1, 20, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 54, 11, 0.01F, -37.5F, -42.7F, 1, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 54, 0, -3.99F, -37.5F, -42.7F, 1, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 39, 40, 0.01F, -37.5F, -26.7F, 1, 1, 4, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 124, 22, -3.49F, -37.5F, -36.7F, 4, 1, 14, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 39, 17, -3.99F, -37.5F, -26.7F, 1, 1, 4, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 54, 4, 0.01F, -37.5F, -34.7F, 1, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 27, 46, -3.99F, -37.5F, -34.7F, 1, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 26, 80, -2.5F, -40.1F, -42.7F, 2, 1, 20, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 102, 22, -4.0F, -36.9F, -42.7F, 1, 1, 20, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 72, 102, 0.0F, -36.9F, -42.7F, 1, 1, 20, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 79, 50, -2.4F, -35.51F, -42.7F, 2, 1, 20, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 102, 1, -2.6F, -35.5F, -42.7F, 1, 1, 20, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(1.0F, -38.5F, -42.7F);
		handguard.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.8727F);
		bone4.cubeList.add(new ModelBox(bone4, 39, 3, -1.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 100, -0.99F, -2.5F, 0.0F, 1, 1, 20, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 17, 58, -1.0F, -2.0F, 5.0F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 44, 101, -1.5F, -2.0F, 7.0F, 1, 1, 12, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 56, 56, -1.0F, -2.0F, 12.0F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 54, 40, -1.0F, -2.0F, 18.0F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 50, 99, -1.0F, -1.0F, 0.0F, 1, 1, 20, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(1.0F, -35.9F, -42.7F);
		handguard.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, 0.7854F);
		bone6.cubeList.add(new ModelBox(bone6, 80, 80, -1.0F, 0.0F, 0.0F, 1, 2, 20, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 56, 78, -3.5355F, 2.5355F, 0.0F, 2, 1, 20, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-4.0F, -38.5F, -42.7F);
		handguard.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.8727F);
		bone5.cubeList.add(new ModelBox(bone5, 6, 36, 0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 80, 25, 0.0F, -1.0F, 0.0F, 1, 1, 20, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 80, 0, -0.01F, -2.5F, 0.0F, 1, 1, 20, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 54, 37, 0.0F, -2.0F, 5.0F, 1, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 38, 122, 0.5F, -2.0F, 6.0F, 1, 1, 12, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 18, 53, 0.0F, -2.0F, 12.0F, 1, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 45, 40, 0.0F, -2.0F, 18.0F, 1, 1, 2, 0.0F, false));

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun789 = new ModelRenderer(this);
		gun789.setRotationPoint(-0.5F, -39.2F, 3.0F);
		stock.addChild(gun789);
		setRotationAngle(gun789, 0.0F, 0.0F, 0.7854F);
		gun789.cubeList.add(new ModelBox(gun789, 36, 155, 0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun808 = new ModelRenderer(this);
		gun808.setRotationPoint(-0.5F, -39.2F, 18.7F);
		stock.addChild(gun808);
		setRotationAngle(gun808, 0.0F, 0.0F, 0.7854F);
		gun808.cubeList.add(new ModelBox(gun808, 47, 14, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun792 = new ModelRenderer(this);
		gun792.setRotationPoint(-0.5F, -38.15F, 3.0F);
		stock.addChild(gun792);
		setRotationAngle(gun792, 0.0F, 0.0F, -0.3346F);
		gun792.cubeList.add(new ModelBox(gun792, 68, 123, 0.0F, 0.0F, 0.0F, 1, 2, 16, 0.0F, false));

		gun796 = new ModelRenderer(this);
		gun796.setRotationPoint(1.5F, -37.7F, 3.0F);
		stock.addChild(gun796);
		setRotationAngle(gun796, 0.0F, 0.0F, 1.9705F);
		gun796.cubeList.add(new ModelBox(gun796, 122, 92, 0.0F, 0.0F, 0.0F, 1, 2, 16, 0.0F, false));

		gun786 = new ModelRenderer(this);
		gun786.setRotationPoint(-4.5F, -37.7F, 3.7F);
		stock.addChild(gun786);
		gun786.cubeList.add(new ModelBox(gun786, 103, 46, 0.0F, 0.0F, 0.0F, 6, 1, 16, 0.0F, false));

		gun787 = new ModelRenderer(this);
		gun787.setRotationPoint(-4.5F, -37.2F, 3.7F);
		stock.addChild(gun787);
		gun787.cubeList.add(new ModelBox(gun787, 94, 102, 0.01F, 0.0F, 0.0F, 6, 1, 16, 0.0F, false));

		gun798 = new ModelRenderer(this);
		gun798.setRotationPoint(1.5F, -36.2F, 3.0F);
		stock.addChild(gun798);
		setRotationAngle(gun798, 0.0F, 0.0F, 2.714F);
		gun798.cubeList.add(new ModelBox(gun798, 120, 119, 0.0F, 0.0F, 0.0F, 2, 1, 16, 0.0F, false));

		gun799 = new ModelRenderer(this);
		gun799.setRotationPoint(-3.0F, -36.3F, 2.7F);
		stock.addChild(gun799);
		gun799.cubeList.add(new ModelBox(gun799, 97, 119, 0.0F, 0.0F, 0.0F, 3, 1, 17, 0.0F, false));

		gun806 = new ModelRenderer(this);
		gun806.setRotationPoint(-2.0F, -33.0F, 3.0F);
		stock.addChild(gun806);
		setRotationAngle(gun806, 2.0076F, 0.0F, 0.0F);
		gun806.cubeList.add(new ModelBox(gun806, 27, 0, 0.0F, 0.0F, 0.0F, 1, 6, 3, 0.0F, false));

		gun790 = new ModelRenderer(this);
		gun790.setRotationPoint(-2.5F, -39.2F, 3.0F);
		stock.addChild(gun790);
		setRotationAngle(gun790, 0.0F, 0.0F, 0.7854F);
		gun790.cubeList.add(new ModelBox(gun790, 0, 155, 0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun793 = new ModelRenderer(this);
		gun793.setRotationPoint(-3.5F, -38.5F, 3.0F);
		stock.addChild(gun793);
		setRotationAngle(gun793, 0.0F, 0.0F, -0.2974F);
		gun793.cubeList.add(new ModelBox(gun793, 74, 154, 0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun791 = new ModelRenderer(this);
		gun791.setRotationPoint(-3.5F, -38.5F, 3.0F);
		stock.addChild(gun791);
		setRotationAngle(gun791, 0.0F, 0.0F, 0.3346F);
		gun791.cubeList.add(new ModelBox(gun791, 124, 0, 0.0F, 0.0F, 0.0F, 1, 2, 16, 0.0F, false));

		gun795 = new ModelRenderer(this);
		gun795.setRotationPoint(-4.5F, -37.7F, 3.0F);
		stock.addChild(gun795);
		setRotationAngle(gun795, 0.0F, 0.0F, -0.409F);
		gun795.cubeList.add(new ModelBox(gun795, 0, 121, 0.0F, 0.0F, 0.0F, 2, 1, 16, 0.0F, false));

		gun800 = new ModelRenderer(this);
		gun800.setRotationPoint(-4.7F, -36.4F, 12.0F);
		stock.addChild(gun800);
		gun800.cubeList.add(new ModelBox(gun800, 26, 65, 0.0F, 0.0F, 0.0F, 3, 1, 7, 0.0F, false));

		gun801 = new ModelRenderer(this);
		gun801.setRotationPoint(-4.7F, -36.7F, 12.0F);
		stock.addChild(gun801);
		gun801.cubeList.add(new ModelBox(gun801, 0, 64, 0.0F, 0.0F, 0.0F, 3, 1, 7, 0.0F, false));

		gun804 = new ModelRenderer(this);
		gun804.setRotationPoint(-4.8F, -36.55F, 12.5F);
		stock.addChild(gun804);
		gun804.cubeList.add(new ModelBox(gun804, 80, 25, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun815 = new ModelRenderer(this);
		gun815.setRotationPoint(-4.5F, -37.7F, 18.7F);
		stock.addChild(gun815);
		setRotationAngle(gun815, 0.0F, 0.0F, -0.409F);
		gun815.cubeList.add(new ModelBox(gun815, 0, 50, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun814 = new ModelRenderer(this);
		gun814.setRotationPoint(-3.5F, -38.5F, 18.7F);
		stock.addChild(gun814);
		setRotationAngle(gun814, 0.0F, 0.0F, 0.3346F);
		gun814.cubeList.add(new ModelBox(gun814, 33, 12, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun813 = new ModelRenderer(this);
		gun813.setRotationPoint(-3.5F, -38.5F, 18.7F);
		stock.addChild(gun813);
		setRotationAngle(gun813, 0.0F, 0.0F, -0.2974F);
		gun813.cubeList.add(new ModelBox(gun813, 20, 45, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun812 = new ModelRenderer(this);
		gun812.setRotationPoint(-2.5F, -39.2F, 18.7F);
		stock.addChild(gun812);
		setRotationAngle(gun812, 0.0F, 0.0F, 0.7854F);
		gun812.cubeList.add(new ModelBox(gun812, 21, 47, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun807 = new ModelRenderer(this);
		gun807.setRotationPoint(-2.5F, -39.2F, 18.7F);
		stock.addChild(gun807);
		gun807.cubeList.add(new ModelBox(gun807, 43, 59, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun809 = new ModelRenderer(this);
		gun809.setRotationPoint(-0.5F, -38.75F, 18.7F);
		stock.addChild(gun809);
		setRotationAngle(gun809, 0.0F, 0.0F, 0.2974F);
		gun809.cubeList.add(new ModelBox(gun809, 47, 12, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun810 = new ModelRenderer(this);
		gun810.setRotationPoint(-0.5F, -38.15F, 18.7F);
		stock.addChild(gun810);
		setRotationAngle(gun810, 0.0F, 0.0F, -0.3346F);
		gun810.cubeList.add(new ModelBox(gun810, 0, 39, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun811 = new ModelRenderer(this);
		gun811.setRotationPoint(1.5F, -37.7F, 18.7F);
		stock.addChild(gun811);
		setRotationAngle(gun811, 0.0F, 0.0F, 1.9705F);
		gun811.cubeList.add(new ModelBox(gun811, 33, 29, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun794 = new ModelRenderer(this);
		gun794.setRotationPoint(-0.5F, -38.75F, 3.0F);
		stock.addChild(gun794);
		setRotationAngle(gun794, 0.0F, 0.0F, 0.2974F);
		gun794.cubeList.add(new ModelBox(gun794, 104, 153, 0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun788 = new ModelRenderer(this);
		gun788.setRotationPoint(-2.5F, -39.2F, 3.0F);
		stock.addChild(gun788);
		gun788.cubeList.add(new ModelBox(gun788, 48, 120, 0.0F, 0.0F, 0.0F, 2, 2, 16, 0.0F, false));

		gun802 = new ModelRenderer(this);
		gun802.setRotationPoint(-1.3F, -36.7F, 12.0F);
		stock.addChild(gun802);
		gun802.cubeList.add(new ModelBox(gun802, 54, 37, 0.0F, 0.0F, 0.0F, 3, 1, 7, 0.0F, false));

		gun803 = new ModelRenderer(this);
		gun803.setRotationPoint(-1.3F, -36.4F, 12.0F);
		stock.addChild(gun803);
		gun803.cubeList.add(new ModelBox(gun803, 54, 29, 0.0F, 0.0F, 0.0F, 3, 1, 7, 0.0F, false));

		gun805 = new ModelRenderer(this);
		gun805.setRotationPoint(0.8F, -36.55F, 12.5F);
		stock.addChild(gun805);
		gun805.cubeList.add(new ModelBox(gun805, 80, 7, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun797 = new ModelRenderer(this);
		gun797.setRotationPoint(-4.5F, -36.2F, 3.0F);
		stock.addChild(gun797);
		setRotationAngle(gun797, 0.0F, 0.0F, -1.1154F);
		gun797.cubeList.add(new ModelBox(gun797, 20, 122, 0.0F, 0.0F, 0.0F, 1, 2, 16, 0.0F, false));

		gun831 = new ModelRenderer(this);
		gun831.setRotationPoint(-4.5F, -36.2F, 18.7F);
		stock.addChild(gun831);
		setRotationAngle(gun831, 0.0F, 0.0F, -1.1154F);
		gun831.cubeList.add(new ModelBox(gun831, 32, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun832 = new ModelRenderer(this);
		gun832.setRotationPoint(1.5F, -36.2F, 18.7F);
		stock.addChild(gun832);
		setRotationAngle(gun832, 0.0F, 0.0F, 2.714F);
		gun832.cubeList.add(new ModelBox(gun832, 16, 22, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun821 = new ModelRenderer(this);
		gun821.setRotationPoint(-0.5F, -39.2F, 19.8F);
		stock.addChild(gun821);
		setRotationAngle(gun821, 0.0F, 0.0F, 0.7854F);
		gun821.cubeList.add(new ModelBox(gun821, 0, 53, 0.0F, 0.0F, 5.0F, 1, 1, 4, 0.0F, false));

		gun820 = new ModelRenderer(this);
		gun820.setRotationPoint(-2.5F, -39.2F, 19.8F);
		stock.addChild(gun820);
		gun820.cubeList.add(new ModelBox(gun820, 12, 39, 0.0F, 0.0F, 5.0F, 2, 2, 4, 0.0F, false));

		gun822 = new ModelRenderer(this);
		gun822.setRotationPoint(-0.5F, -38.75F, 19.8F);
		stock.addChild(gun822);
		setRotationAngle(gun822, 0.0F, 0.0F, 0.2974F);
		gun822.cubeList.add(new ModelBox(gun822, 39, 45, 0.0F, 0.0F, 5.0F, 1, 1, 4, 0.0F, false));

		gun823 = new ModelRenderer(this);
		gun823.setRotationPoint(-0.5F, -38.15F, 19.8F);
		stock.addChild(gun823);
		setRotationAngle(gun823, 0.0F, 0.0F, -0.3346F);
		gun823.cubeList.add(new ModelBox(gun823, 0, 39, 0.0F, 0.0F, 5.0F, 1, 2, 4, 0.0F, false));

		gun824 = new ModelRenderer(this);
		gun824.setRotationPoint(1.5F, -37.7F, 19.8F);
		stock.addChild(gun824);
		setRotationAngle(gun824, 0.0F, 0.0F, 1.9705F);
		gun824.cubeList.add(new ModelBox(gun824, 27, 29, 0.0F, 0.0F, 5.0F, 1, 2, 4, 0.0F, false));

		gun825 = new ModelRenderer(this);
		gun825.setRotationPoint(-4.5F, -37.7F, 19.8F);
		stock.addChild(gun825);
		gun825.cubeList.add(new ModelBox(gun825, 0, 78, 0.0F, 0.0F, 5.0F, 6, 3, 4, 0.0F, false));

		gun828 = new ModelRenderer(this);
		gun828.setRotationPoint(-0.5F, -34.7F, 19.8F);
		stock.addChild(gun828);
		setRotationAngle(gun828, 0.2231F, 0.0F, 0.0F);
		gun828.cubeList.add(new ModelBox(gun828, 0, 27, 0.0F, 1.1061F, 4.8761F, 1, 9, 2, 0.0F, false));

		gun826 = new ModelRenderer(this);
		gun826.setRotationPoint(-3.5F, -38.2F, 23.8F);
		stock.addChild(gun826);
		setRotationAngle(gun826, -0.0744F, 0.0F, 0.0F);
		gun826.cubeList.add(new ModelBox(gun826, 79, 50, 0.0F, -0.3714F, 3.9862F, 4, 12, 2, 0.0F, false));

		gun829 = new ModelRenderer(this);
		gun829.setRotationPoint(-0.5F, -34.7F, 20.8F);
		stock.addChild(gun829);
		setRotationAngle(gun829, 0.2231F, 0.0F, 0.0F);
		gun829.cubeList.add(new ModelBox(gun829, 54, 29, 0.01F, 1.1061F, 4.8761F, 1, 3, 2, 0.0F, false));

		gun827 = new ModelRenderer(this);
		gun827.setRotationPoint(-3.5F, -34.7F, 19.8F);
		stock.addChild(gun827);
		setRotationAngle(gun827, 0.2231F, 0.0F, 0.0F);
		gun827.cubeList.add(new ModelBox(gun827, 50, 79, 0.0F, 1.1061F, 4.8761F, 1, 9, 2, 0.0F, false));

		gun830 = new ModelRenderer(this);
		gun830.setRotationPoint(-3.5F, -34.7F, 20.8F);
		stock.addChild(gun830);
		setRotationAngle(gun830, 0.2231F, 0.0F, 0.0F);
		gun830.cubeList.add(new ModelBox(gun830, 46, 0, 0.0F, 1.1061F, 4.8761F, 1, 3, 2, 0.0F, false));

		gun816 = new ModelRenderer(this);
		gun816.setRotationPoint(-4.5F, -37.7F, 19.8F);
		stock.addChild(gun816);
		setRotationAngle(gun816, 0.0F, 0.0F, -0.409F);
		gun816.cubeList.add(new ModelBox(gun816, 39, 12, 0.0F, 0.0F, 5.0F, 2, 1, 4, 0.0F, false));

		gun819 = new ModelRenderer(this);
		gun819.setRotationPoint(-2.5F, -39.2F, 19.8F);
		stock.addChild(gun819);
		setRotationAngle(gun819, 0.0F, 0.0F, 0.7854F);
		gun819.cubeList.add(new ModelBox(gun819, 12, 53, 0.0F, 0.0F, 5.0F, 1, 1, 4, 0.0F, false));

		gun817 = new ModelRenderer(this);
		gun817.setRotationPoint(-3.5F, -38.5F, 19.8F);
		stock.addChild(gun817);
		setRotationAngle(gun817, 0.0F, 0.0F, 0.3346F);
		gun817.cubeList.add(new ModelBox(gun817, 39, 29, 0.0F, 0.0F, 5.0F, 1, 2, 4, 0.0F, false));

		gun818 = new ModelRenderer(this);
		gun818.setRotationPoint(-3.5F, -38.5F, 19.8F);
		stock.addChild(gun818);
		setRotationAngle(gun818, 0.0F, 0.0F, -0.2974F);
		gun818.cubeList.add(new ModelBox(gun818, 26, 54, 0.0F, 0.0F, 5.0F, 1, 1, 4, 0.0F, false));

		gun772 = new ModelRenderer(this);
		gun772.setRotationPoint(0.4F, -37.6F, -5.5F);
		stock.addChild(gun772);
		gun772.cubeList.add(new ModelBox(gun772, 0, 53, 0.0F, 0.0F, 5.0F, 1, 1, 10, 0.0F, false));

		gun773 = new ModelRenderer(this);
		gun773.setRotationPoint(0.4F, -37.3F, -5.5F);
		stock.addChild(gun773);
		gun773.cubeList.add(new ModelBox(gun773, 27, 40, 0.01F, 0.0F, 5.0F, 1, 1, 10, 0.0F, false));

		gun774 = new ModelRenderer(this);
		gun774.setRotationPoint(1.4F, -37.6F, -5.5F);
		stock.addChild(gun774);
		setRotationAngle(gun774, 0.0F, -3.0301F, 0.0F);
		gun774.cubeList.add(new ModelBox(gun774, 0, 58, 0.5665F, 0.0F, -4.9689F, 1, 1, 3, 0.0F, false));

		gun775 = new ModelRenderer(this);
		gun775.setRotationPoint(1.4F, -37.3F, -5.5F);
		stock.addChild(gun775);
		setRotationAngle(gun775, 0.0F, -3.0301F, 0.0F);
		gun775.cubeList.add(new ModelBox(gun775, 54, 15, 0.5565F, 0.0F, -4.9689F, 1, 1, 3, 0.0F, false));

		gun779 = new ModelRenderer(this);
		gun779.setRotationPoint(-4.1F, -37.2F, -8.9F);
		stock.addChild(gun779);
		gun779.cubeList.add(new ModelBox(gun779, 157, 156, 0.0F, 0.0F, 5.0F, 1, 1, 12, 0.0F, false));

		gun780 = new ModelRenderer(this);
		gun780.setRotationPoint(-4.1F, -37.7F, -8.9F);
		stock.addChild(gun780);
		gun780.cubeList.add(new ModelBox(gun780, 18, 157, 0.0F, 0.0F, 5.0F, 1, 1, 12, 0.0F, false));

		gun777 = new ModelRenderer(this);
		gun777.setRotationPoint(-4.4F, -37.6F, -5.5F);
		stock.addChild(gun777);
		gun777.cubeList.add(new ModelBox(gun777, 0, 39, 0.0F, 0.0F, 5.0F, 1, 1, 10, 0.0F, false));

		gun778 = new ModelRenderer(this);
		gun778.setRotationPoint(-4.4F, -37.3F, -5.5F);
		stock.addChild(gun778);
		gun778.cubeList.add(new ModelBox(gun778, 27, 29, 0.0F, 0.0F, 5.0F, 1, 1, 10, 0.0F, false));
		gun778.cubeList.add(new ModelBox(gun778, 27, 29, 0.0F, -0.1F, 21.0F, 1, 1, 10, 0.0F, false));
		gun778.cubeList.add(new ModelBox(gun778, 27, 29, 4.8F, -0.1F, 21.0F, 1, 1, 10, 0.0F, false));

		receiver = new ModelRenderer(this);
		receiver.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun767 = new ModelRenderer(this);
		gun767.setRotationPoint(0.5F, -36.9F, -9.0F);
		receiver.addChild(gun767);
		setRotationAngle(gun767, 0.0F, 0.0F, 0.7854F);
		gun767.cubeList.add(new ModelBox(gun767, 50, 79, 0.0F, 0.0F, 0.0F, 1, 2, 12, 0.0F, false));

		gun769 = new ModelRenderer(this);
		gun769.setRotationPoint(0.2F, -37.2F, -9.0F);
		receiver.addChild(gun769);
		gun769.cubeList.add(new ModelBox(gun769, 48, 50, 0.01F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun770 = new ModelRenderer(this);
		gun770.setRotationPoint(1.2F, -37.2F, -9.0F);
		receiver.addChild(gun770);
		setRotationAngle(gun770, 0.0F, -2.3562F, 0.0F);
		gun770.cubeList.add(new ModelBox(gun770, 62, 45, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun768 = new ModelRenderer(this);
		gun768.setRotationPoint(0.2F, -37.7F, -9.0F);
		receiver.addChild(gun768);
		gun768.cubeList.add(new ModelBox(gun768, 0, 53, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun771 = new ModelRenderer(this);
		gun771.setRotationPoint(1.2F, -37.7F, -9.0F);
		receiver.addChild(gun771);
		setRotationAngle(gun771, 0.0F, -2.3562F, 0.0F);
		gun771.cubeList.add(new ModelBox(gun771, 62, 21, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun764 = new ModelRenderer(this);
		gun764.setRotationPoint(0.5F, -38.4F, -9.0F);
		receiver.addChild(gun764);
		setRotationAngle(gun764, 0.0F, 0.0F, 0.7854F);
		gun764.cubeList.add(new ModelBox(gun764, 58, 160, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		gun97 = new ModelRenderer(this);
		gun97.setRotationPoint(-0.3F, -37.8F, -22.0F);
		receiver.addChild(gun97);
		gun97.cubeList.add(new ModelBox(gun97, 26, 54, 0.01F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

		gun100 = new ModelRenderer(this);
		gun100.setRotationPoint(-0.3F, -38.4F, -22.0F);
		receiver.addChild(gun100);
		gun100.cubeList.add(new ModelBox(gun100, 0, 27, 0.0F, 0.0F, 0.0F, 1, 1, 25, 0.0F, false));

		gun135 = new ModelRenderer(this);
		gun135.setRotationPoint(-0.3F, -39.1F, -19.5F);
		receiver.addChild(gun135);
		gun135.cubeList.add(new ModelBox(gun135, 18, 64, 0.01F, 0.0F, 1.0F, 1, 1, 2, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(1.0F, 0.0F, 3.0F);
		gun135.addChild(bone9);
		setRotationAngle(bone9, -0.9076F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 21, 6, -1.01F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(1.0F, 0.0F, 3.0F);
		gun135.addChild(bone10);
		setRotationAngle(bone10, 0.9076F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 20, 0, -1.01F, -1.576F, -2.2313F, 1, 1, 1, 0.0F, false));

		gun138 = new ModelRenderer(this);
		gun138.setRotationPoint(0.7F, -39.1F, -18.5F);
		receiver.addChild(gun138);
		setRotationAngle(gun138, 0.0F, 0.0F, 1.9333F);
		gun138.cubeList.add(new ModelBox(gun138, 45, 45, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0076F, 0.0199F, 2.0F);
		gun138.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.925F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 27, 29, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0076F, 0.0199F, 0.0F);
		gun138.addChild(bone8);
		setRotationAngle(bone8, 0.0F, -0.925F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 27, 12, 0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun735 = new ModelRenderer(this);
		gun735.setRotationPoint(0.7F, -38.4F, -22.0F);
		receiver.addChild(gun735);
		setRotationAngle(gun735, 0.0F, 0.0F, 1.9333F);
		gun735.cubeList.add(new ModelBox(gun735, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 25, 0.0F, false));

		gun736 = new ModelRenderer(this);
		gun736.setRotationPoint(0.7F, -38.4F, -22.5F);
		receiver.addChild(gun736);
		setRotationAngle(gun736, 0.0F, 0.0F, 1.9333F);
		gun736.cubeList.add(new ModelBox(gun736, 6, 39, 0.01F, 0.0F, -0.2F, 1, 2, 1, 0.0F, false));

		gun108 = new ModelRenderer(this);
		gun108.setRotationPoint(-0.3F, -38.4F, -22.7F);
		receiver.addChild(gun108);
		gun108.cubeList.add(new ModelBox(gun108, 54, 34, -0.01F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun106 = new ModelRenderer(this);
		gun106.setRotationPoint(-0.3F, -37.8F, -22.7F);
		receiver.addChild(gun106);
		gun106.cubeList.add(new ModelBox(gun106, 6, 55, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun107 = new ModelRenderer(this);
		gun107.setRotationPoint(0.7F, -36.8F, -22.7F);
		receiver.addChild(gun107);
		setRotationAngle(gun107, 0.0F, 0.0F, 2.3562F);
		gun107.cubeList.add(new ModelBox(gun107, 0, 55, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun99 = new ModelRenderer(this);
		gun99.setRotationPoint(0.7F, -36.8F, -22.0F);
		receiver.addChild(gun99);
		setRotationAngle(gun99, 0.0F, 0.0F, 2.3562F);
		gun99.cubeList.add(new ModelBox(gun99, 0, 53, 0.0F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

		gun737 = new ModelRenderer(this);
		gun737.setRotationPoint(-3.7F, -38.4F, -10.0F);
		receiver.addChild(gun737);
		setRotationAngle(gun737, 0.0F, 0.0F, 1.2269F);
		gun737.cubeList.add(new ModelBox(gun737, 104, 137, 0.0F, -2.0F, 0.0F, 1, 2, 13, 0.0F, false));

		gun738 = new ModelRenderer(this);
		gun738.setRotationPoint(-3.7F, -38.4F, -11.0F);
		receiver.addChild(gun738);
		gun738.cubeList.add(new ModelBox(gun738, 122, 153, 0.0F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));

		gun776 = new ModelRenderer(this);
		gun776.setRotationPoint(-3.5F, -38.4F, -9.0F);
		receiver.addChild(gun776);
		setRotationAngle(gun776, 0.0F, 0.0F, 0.7854F);
		gun776.cubeList.add(new ModelBox(gun776, 158, 71, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		gun781 = new ModelRenderer(this);
		gun781.setRotationPoint(-4.2F, -37.7F, -9.0F);
		receiver.addChild(gun781);
		gun781.cubeList.add(new ModelBox(gun781, 48, 37, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun782 = new ModelRenderer(this);
		gun782.setRotationPoint(-4.2F, -37.2F, -9.0F);
		receiver.addChild(gun782);
		gun782.cubeList.add(new ModelBox(gun782, 48, 34, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun783 = new ModelRenderer(this);
		gun783.setRotationPoint(-3.5F, -36.9F, -9.0F);
		receiver.addChild(gun783);
		setRotationAngle(gun783, 0.0F, 0.0F, 0.7854F);
		gun783.cubeList.add(new ModelBox(gun783, 86, 123, 0.0F, 0.0F, 0.0F, 2, 1, 12, 0.0F, false));

		gun785 = new ModelRenderer(this);
		gun785.setRotationPoint(-4.2F, -37.2F, -9.0F);
		receiver.addChild(gun785);
		setRotationAngle(gun785, 0.0F, 0.7854F, 0.0F);
		gun785.cubeList.add(new ModelBox(gun785, 6, 50, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun784 = new ModelRenderer(this);
		gun784.setRotationPoint(-4.2F, -37.7F, -9.0F);
		receiver.addChild(gun784);
		setRotationAngle(gun784, 0.0F, 0.7854F, 0.0F);
		gun784.cubeList.add(new ModelBox(gun784, 48, 23, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		gun13.render(f5);
//		gun17.render(f5);
//		gun19.render(f5);
//		gun21.render(f5);
//		gun22.render(f5);
//		gun24.render(f5);
//		gun26.render(f5);
//		gun28.render(f5);
//		gun30.render(f5);
//		gun35.render(f5);
//		gun36.render(f5);
//		gun45.render(f5);
//		gun47.render(f5);
//		gun48.render(f5);
//		gun49.render(f5);
//		gun52.render(f5);
//		gun53.render(f5);
//		gun54.render(f5);
//		gun55.render(f5);
//		gun57.render(f5);
//		gun58.render(f5);
//		gun60.render(f5);
//		gun62.render(f5);
//		gun63.render(f5);
//		gun65.render(f5);
//		gun66.render(f5);
//		gun67.render(f5);
//		gun68.render(f5);
//		gun69.render(f5);
//		gun70.render(f5);
//		gun71.render(f5);
//		gun72.render(f5);
//		gun73.render(f5);
//		gun74.render(f5);
//		gun75.render(f5);
//		gun76.render(f5);
//		gun77.render(f5);
//		gun79.render(f5);
//		gun81.render(f5);
//		gun82.render(f5);
//		gun83.render(f5);
//		gun84.render(f5);
//		gun85.render(f5);
//		gun87.render(f5);
//		gun89.render(f5);
//		gun90.render(f5);
//		gun91.render(f5);
//		gun92.render(f5);
//		gun93.render(f5);
//		gun94.render(f5);
//		gun95.render(f5);
//		gun96.render(f5);
//		gun98.render(f5);
//		gun101.render(f5);
//		gun103.render(f5);
//		gun104.render(f5);
//		gun109.render(f5);
//		gun111.render(f5);
//		gun112.render(f5);
//		gun113.render(f5);
//		gun114.render(f5);
//		gun121.render(f5);
//		gun125.render(f5);
//		gun126.render(f5);
//		gun127.render(f5);
//		gun129.render(f5);
//		gun130.render(f5);
//		gun132.render(f5);
//		gun153.render(f5);
//		gun156.render(f5);
//		gun157.render(f5);
//		gun170.render(f5);
//		gun248.render(f5);
//		gun249.render(f5);
//		gun251.render(f5);
//		gun252.render(f5);
//		gun254.render(f5);
//		gun255.render(f5);
//		gun260.render(f5);
//		gun263.render(f5);
//		gun264.render(f5);
//		gun266.render(f5);
//		gun267.render(f5);
//		gun270.render(f5);
//		gun271.render(f5);
//		gun272.render(f5);
//		gun273.render(f5);
//		gun274.render(f5);
//		gun303.render(f5);
//		gun319.render(f5);
//		gun343.render(f5);
//		gun346.render(f5);
//		gun745.render(f5);
//		gun765.render(f5);
//		gun766.render(f5);
//		silencer.render(f5);
		handguard.render(f5);
//		stock.render(f5);
//		receiver.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
