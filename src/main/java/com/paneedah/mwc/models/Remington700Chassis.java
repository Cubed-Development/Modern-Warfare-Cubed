package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.0.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Remington700Chassis extends ModelWithAttachments {
	private final QRenderer gun;
	private final ModelRenderer gun25_r1;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer gun22_r1;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun22_r2;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun25_r2;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun27_r1;
	private final ModelRenderer gun25_r3;
	private final ModelRenderer gun24_r1;
	private final ModelRenderer gun24_r2;
	private final ModelRenderer gun23_r2;
	private final ModelRenderer gun42_r1;
	private final ModelRenderer gun41_r1;
	private final ModelRenderer gun41_r2;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun44_r1;
	private final ModelRenderer gun44;
	private final ModelRenderer gun43;
	private final ModelRenderer gun41;
	private final ModelRenderer gun38;
	private final ModelRenderer gun37;
	private final ModelRenderer gun23;
	private final ModelRenderer gun21;
	private final ModelRenderer gun19;
	private final ModelRenderer gun18;
	private final ModelRenderer gun17;
	private final ModelRenderer gun16;
	private final ModelRenderer gun15;
	private final ModelRenderer gun14;
	private final ModelRenderer gun13;
	private final ModelRenderer gun12;
	private final ModelRenderer gun11;
	private final ModelRenderer gun10;
	private final ModelRenderer gun9;
	private final ModelRenderer gun8;
	private final ModelRenderer gun7;
	private final ModelRenderer gun6;
	private final ModelRenderer gun5;
	private final ModelRenderer gun4;
	private final ModelRenderer gun3;
	private final ModelRenderer gun2;
	private final ModelRenderer gun1;
	private final QRenderer mag_5rnd;
	private final QRenderer mag_10rnd;
	private final QRenderer chassis;
	private final ModelRenderer chassis48_r1;
	private final ModelRenderer chassis4_r1;
	private final ModelRenderer chassis3_r1;
	private final ModelRenderer chassis1_r1;
	private final ModelRenderer chassis9_r1;
	private final ModelRenderer chassis8_r1;
	private final ModelRenderer chassis7_r1;
	private final ModelRenderer chassis10_r1;
	private final ModelRenderer chassis9_r2;
	private final ModelRenderer chassis8_r2;
	private final ModelRenderer chassis11_r1;
	private final ModelRenderer chassis10_r2;
	private final ModelRenderer chassis9_r3;
	private final ModelRenderer chassis47_r1;
	private final ModelRenderer chassis46_r1;
	private final ModelRenderer chassis54_r1;
	private final ModelRenderer chassis54_r2;
	private final ModelRenderer chassis52_r1;
	private final ModelRenderer chassis55_r1;
	private final ModelRenderer chassis54_r3;
	private final ModelRenderer chassis53_r1;
	private final ModelRenderer chassis53_r2;
	private final ModelRenderer chassis51_r1;
	private final ModelRenderer chassis57;
	private final ModelRenderer chassis56;
	private final ModelRenderer chassis55;
	private final ModelRenderer chassis48;
	private final ModelRenderer chassis46;
	private final ModelRenderer chassis36;
	private final ModelRenderer chassis45;
	private final ModelRenderer chassis44;
	private final ModelRenderer chassis39;
	private final ModelRenderer chassis38;
	private final ModelRenderer chassis37;
	private final ModelRenderer chassis35;
	private final ModelRenderer chassis34;
	private final ModelRenderer chassis33;
	private final ModelRenderer chassis31;
	private final ModelRenderer chassis30;
	private final ModelRenderer chassis29;
	private final ModelRenderer chassis23;
	private final ModelRenderer chassis22;
	private final ModelRenderer chassis21;
	private final ModelRenderer chassis20;
	private final ModelRenderer chassis19;
	private final ModelRenderer chassis18;
	private final ModelRenderer chassis17;
	private final ModelRenderer chassis16;
	private final ModelRenderer chassis15;
	private final ModelRenderer chassis14;
	private final ModelRenderer chassis13;
	private final ModelRenderer chassis12;
	private final ModelRenderer chassis11;
	private final ModelRenderer chassis10;
	private final ModelRenderer chassis6;
	private final ModelRenderer chassis5;
	private final ModelRenderer chassis4;
	private final ModelRenderer chassis3;
	private final ModelRenderer chassis2;
	private final ModelRenderer chassis1;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer gun30;
	private final ModelRenderer gun33;
	private final ModelRenderer gun34;
	private final ModelRenderer gun32;
	private final ModelRenderer gun29;
	private final ModelRenderer gun31;
	private final ModelRenderer gun35;
	private final ModelRenderer gun36;
	private final QRenderer apac_chassis;
	private final ModelRenderer gun43_r1;
	private final ModelRenderer gun42_r2;
	private final ModelRenderer gun43_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final QRenderer mdt_xrs_chassis;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;
	private final ModelRenderer cube_r67;
	private final ModelRenderer cube_r68;
	private final ModelRenderer cube_r69;
	private final ModelRenderer cube_r70;
	private final ModelRenderer cube_r71;
	private final ModelRenderer cube_r72;
	private final ModelRenderer cube_r73;
	private final ModelRenderer cube_r74;
	private final ModelRenderer cube_r75;
	private final ModelRenderer cube_r76;
	private final ModelRenderer cube_r77;
	private final ModelRenderer cube_r78;
	private final ModelRenderer cube_r79;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
	private final QRenderer boltactiongrabby;
	private final ModelRenderer cube_r87;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final QRenderer boltaction;
	private final ModelRenderer cube_r90;
	private final ModelRenderer cube_r91;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;
	private final ModelRenderer cube_r94;
	private final ModelRenderer cube_r95;
	private final ModelRenderer cube_r96;
	private final ModelRenderer cube_r97;

	public Remington700Chassis() {
		textureWidth = 400;
		textureHeight = 400;

		gun = new QRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 9, 70, -1.55F, -29.57F, 8.97F, 1, 1, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 153, -0.9F, -30.4F, -81.7F, 1, 1, 75, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 154, 76, -1.5F, -31.0F, -81.7F, 1, 1, 75, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 6, -1.5F, -31.8F, 2.6F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 113, -2.2F, -32.5F, -7.9F, 2, 1, 16, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 117, 54, -1.75F, -32.6F, 7.0F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 117, 49, -1.25F, -32.6F, 7.0F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 116, -1.75F, -32.6F, 5.75F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 117, -1.25F, -32.6F, 5.75F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 116, -1.75F, -32.6F, 4.5F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 57, 116, -1.25F, -32.6F, 4.5F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 116, -1.75F, -32.6F, 3.25F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 116, -1.25F, -32.6F, 3.25F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 113, -1.75F, -32.6F, 2.0F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 115, -1.25F, -32.6F, 2.0F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 98, -1.75F, -32.6F, 0.75F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 100, -1.25F, -32.6F, 0.75F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 83, -1.75F, -32.6F, -0.5F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 85, -1.25F, -32.6F, -0.5F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 63, -1.75F, -32.6F, -1.75F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 65, -1.25F, -32.6F, -1.75F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 50, -1.75F, -32.6F, -3.0F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 53, -1.25F, -32.6F, -3.0F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 38, -1.75F, -32.6F, -4.25F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 40, -1.25F, -32.6F, -4.25F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 113, -1.75F, -32.6F, -5.5F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 113, 72, -1.25F, -32.6F, -5.5F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 108, -1.75F, -32.6F, -6.75F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 110, 73, -1.25F, -32.6F, -6.75F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 46, -1.75F, -32.6F, -8.0F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 82, -1.25F, -32.6F, -8.0F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 35, -0.8F, -32.5F, -7.9F, 1, 1, 16, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 27, -0.8F, -32.5F, -8.1F, 1, 1, 1, -0.299F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 40, -2.2F, -32.5F, -8.1F, 2, 1, 1, -0.299F, false));

		gun25_r1 = new ModelRenderer(this);
		gun25_r1.setRotationPoint(-0.45F, -32.4F, -7.7F);
		gun.addChild(gun25_r1);
		setRotationAngle(gun25_r1, 0.0F, 0.0F, -1.0472F);
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 108, 93, -0.7F, -0.3F, -0.2F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 108, 85, -0.7F, -0.3F, -0.4F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 8, 112, -0.7F, -0.3F, 1.05F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 71, 111, -0.7F, -0.3F, 0.85F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 86, 113, -0.7F, -0.3F, 2.3F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 82, 113, -0.7F, -0.3F, 2.1F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 44, -0.7F, -0.3F, 3.55F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 42, -0.7F, -0.3F, 3.35F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 57, -0.7F, -0.3F, 4.8F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 55, -0.7F, -0.3F, 4.6F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 77, -0.7F, -0.3F, 6.05F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 67, -0.7F, -0.3F, 5.85F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 89, -0.7F, -0.3F, 7.3F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 87, -0.7F, -0.3F, 7.1F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 104, -0.7F, -0.3F, 8.55F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 102, -0.7F, -0.3F, 8.35F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 115, -0.7F, -0.3F, 9.8F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 85, 115, -0.7F, -0.3F, 9.6F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 37, 116, -0.7F, -0.3F, 11.05F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 28, 116, -0.7F, -0.3F, 10.85F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 65, 116, -0.7F, -0.3F, 12.3F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 61, 116, -0.7F, -0.3F, 12.1F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 117, 39, -0.7F, -0.3F, 13.55F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 117, 37, -0.7F, -0.3F, 13.35F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 117, 47, -0.7F, -0.3F, 14.8F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 117, 45, -0.7F, -0.3F, 14.6F, 1, 1, 1, -0.304F, false));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(-1.55F, -32.4F, -7.7F);
		gun.addChild(gun26_r1);
		setRotationAngle(gun26_r1, 0.0F, 0.0F, 1.0472F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 108, 36, -0.3F, -0.3F, -0.2F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 30, 108, -0.3F, -0.3F, -0.4F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 108, 102, -0.3F, -0.3F, 1.05F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 108, 95, -0.3F, -0.3F, 0.85F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 62, 112, -0.3F, -0.3F, 2.3F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 50, 112, -0.3F, -0.3F, 2.1F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 36, -0.3F, -0.3F, 3.55F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 10, 114, -0.3F, -0.3F, 3.35F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 48, -0.3F, -0.3F, 4.8F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 46, -0.3F, -0.3F, 4.6F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 61, -0.3F, -0.3F, 6.05F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 59, -0.3F, -0.3F, 5.85F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 81, -0.3F, -0.3F, 7.3F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 79, -0.3F, -0.3F, 7.1F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 96, -0.3F, -0.3F, 8.55F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 91, -0.3F, -0.3F, 8.35F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 108, -0.3F, -0.3F, 9.8F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 106, -0.3F, -0.3F, 9.6F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 16, 116, -0.3F, -0.3F, 11.05F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 10, 116, -0.3F, -0.3F, 10.85F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 45, 116, -0.3F, -0.3F, 12.3F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 41, 116, -0.3F, -0.3F, 12.1F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 116, 73, -0.3F, -0.3F, 13.55F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 69, 116, -0.3F, -0.3F, 13.35F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 117, 43, -0.3F, -0.3F, 14.8F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 117, 41, -0.3F, -0.3F, 14.6F, 1, 1, 1, -0.304F, false));

		gun22_r1 = new ModelRenderer(this);
		gun22_r1.setRotationPoint(0.1F, -29.4F, -81.7F);
		gun.addChild(gun22_r1);
		setRotationAngle(gun22_r1, 0.0F, 0.0F, 0.7854F);
		gun22_r1.cubeList.add(new ModelBox(gun22_r1, 0, 76, -0.92F, -0.08F, -0.08F, 1, 1, 75, -0.08F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(-2.1F, -29.4F, -81.7F);
		gun.addChild(gun23_r1);
		setRotationAngle(gun23_r1, 0.0F, 0.0F, -0.7854F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 0, 0, -0.08F, -0.08F, -0.08F, 1, 1, 75, -0.081F, false));

		gun22_r2 = new ModelRenderer(this);
		gun22_r2.setRotationPoint(-2.1F, -30.4F, -81.7F);
		gun.addChild(gun22_r2);
		setRotationAngle(gun22_r2, 0.0F, 0.0F, 0.7854F);
		gun22_r2.cubeList.add(new ModelBox(gun22_r2, 77, 1, -0.08F, -0.92F, -0.08F, 1, 1, 75, -0.081F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(0.1F, -30.4F, -81.7F);
		gun.addChild(gun21_r1);
		setRotationAngle(gun21_r1, 0.0F, 0.0F, -0.7854F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 0, 152, -0.92F, -0.92F, -0.081F, 1, 1, 75, -0.08F, false));

		gun25_r2 = new ModelRenderer(this);
		gun25_r2.setRotationPoint(-2.1F, -30.4F, -27.7F);
		gun.addChild(gun25_r2);
		setRotationAngle(gun25_r2, -0.0055F, -0.0163F, 0.8814F);
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 70, 269, -0.1F, -0.9F, -0.9F, 1, 1, 21, -0.1F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-1.5F, -31.0F, -27.7F);
		gun.addChild(gun28_r1);
		setRotationAngle(gun28_r1, 0.0133F, 0.0138F, -0.8203F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 185, 194, -0.9F, -0.1F, -0.9F, 1, 1, 21, -0.1F, false));

		gun27_r1 = new ModelRenderer(this);
		gun27_r1.setRotationPoint(-0.5F, -31.0F, -27.7F);
		gun.addChild(gun27_r1);
		setRotationAngle(gun27_r1, 0.0133F, -0.0138F, 0.8203F);
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 137, 270, -0.1F, -0.1F, -0.9F, 1, 1, 21, -0.1F, false));

		gun25_r3 = new ModelRenderer(this);
		gun25_r3.setRotationPoint(-1.5F, -31.0F, -27.7F);
		gun.addChild(gun25_r3);
		setRotationAngle(gun25_r3, 0.0192F, 0.0F, 0.0F);
		gun25_r3.cubeList.add(new ModelBox(gun25_r3, 110, 189, 0.0F, 0.0F, 0.0F, 1, 1, 20, -0.001F, false));

		gun24_r1 = new ModelRenderer(this);
		gun24_r1.setRotationPoint(-2.1F, -29.4F, -27.7F);
		gun.addChild(gun24_r1);
		setRotationAngle(gun24_r1, 0.0087F, -0.0148F, 0.0F);
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 116, 270, 0.0F, -1.0F, 0.0F, 1, 1, 20, -0.001F, false));

		gun24_r2 = new ModelRenderer(this);
		gun24_r2.setRotationPoint(0.1F, -30.4F, -27.7F);
		gun.addChild(gun24_r2);
		setRotationAngle(gun24_r2, -0.0055F, 0.0163F, -0.8814F);
		gun24_r2.cubeList.add(new ModelBox(gun24_r2, 93, 270, -0.9F, -0.9F, -0.9F, 1, 1, 21, -0.1F, false));

		gun23_r2 = new ModelRenderer(this);
		gun23_r2.setRotationPoint(0.1F, -29.4F, -27.7F);
		gun.addChild(gun23_r2);
		setRotationAngle(gun23_r2, 0.0087F, 0.0148F, 0.0F);
		gun23_r2.cubeList.add(new ModelBox(gun23_r2, 261, 270, -1.0F, -1.0F, 0.0F, 1, 1, 20, -0.001F, false));

		gun42_r1 = new ModelRenderer(this);
		gun42_r1.setRotationPoint(-2.3F, -30.2F, 9.35F);
		gun.addChild(gun42_r1);
		setRotationAngle(gun42_r1, -0.3837F, 0.2435F, -0.097F);
		gun42_r1.cubeList.add(new ModelBox(gun42_r1, 0, 79, -0.39F, -0.1F, 0.85F, 1, 1, 2, -0.101F, false));

		gun41_r1 = new ModelRenderer(this);
		gun41_r1.setRotationPoint(0.3F, -30.2F, 9.35F);
		gun.addChild(gun41_r1);
		setRotationAngle(gun41_r1, -0.3837F, -0.2435F, 0.097F);
		gun41_r1.cubeList.add(new ModelBox(gun41_r1, 18, 79, -0.61F, -0.1F, 0.85F, 1, 1, 2, -0.101F, false));

		gun41_r2 = new ModelRenderer(this);
		gun41_r2.setRotationPoint(-2.4F, -30.2F, 9.35F);
		gun.addChild(gun41_r2);
		setRotationAngle(gun41_r2, -0.3726F, 0.065F, -0.0254F);
		gun41_r2.cubeList.add(new ModelBox(gun41_r2, 117, 84, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(0.4F, -30.2F, 9.35F);
		gun.addChild(gun40_r1);
		setRotationAngle(gun40_r1, -0.3726F, -0.065F, 0.0254F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 117, 88, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun44_r1 = new ModelRenderer(this);
		gun44_r1.setRotationPoint(-1.65F, -29.67F, 9.67F);
		gun.addChild(gun44_r1);
		setRotationAngle(gun44_r1, 1.0297F, 0.0F, 0.0F);
		gun44_r1.cubeList.add(new ModelBox(gun44_r1, 117, 58, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.3F, false));

		gun44 = new ModelRenderer(this);
		gun44.setRotationPoint(-0.7F, -30.2F, 8.35F);
		gun.addChild(gun44);
		gun44.cubeList.add(new ModelBox(gun44, 37, 79, 0.1F, 0.0F, -1.0F, 1, 1, 2, 0.002F, false));

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(-2.3F, -30.2F, 7.35F);
		gun.addChild(gun43);
		gun43.cubeList.add(new ModelBox(gun43, 85, 117, -0.1F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(-2.0F, -30.2F, 9.35F);
		gun.addChild(gun41);
		setRotationAngle(gun41, -0.3718F, 0.0F, 0.0F);
		gun41.cubeList.add(new ModelBox(gun41, 117, 86, 0.85F, -0.01F, 1.73F, 1, 1, 1, 0.0F, false));
		gun41.cubeList.add(new ModelBox(gun41, 81, 117, 1.05F, -0.11F, 0.83F, 1, 1, 1, -0.1F, false));
		gun41.cubeList.add(new ModelBox(gun41, 117, 80, -0.05F, -0.11F, 0.83F, 1, 1, 1, -0.1F, false));
		gun41.cubeList.add(new ModelBox(gun41, 117, 82, 0.15F, -0.01F, 1.73F, 1, 1, 1, 0.001F, false));

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(-1.5F, -24.1F, 8.4F);
		gun.addChild(gun38);
		setRotationAngle(gun38, -1.9333F, 0.0F, 0.0F);
		gun38.cubeList.add(new ModelBox(gun38, 117, 90, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun37 = new ModelRenderer(this);
		gun37.setRotationPoint(-1.5F, -25.0F, 7.3F);
		gun.addChild(gun37);
		setRotationAngle(gun37, 0.1115F, 0.0F, 0.0F);
		gun37.cubeList.add(new ModelBox(gun37, 57, 90, 0.0F, -1.0F, 0.0F, 1, 2, 1, 0.001F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-2.0F, -30.4F, -81.7F);
		gun.addChild(gun23);
		gun23.cubeList.add(new ModelBox(gun23, 77, 77, -0.1F, 0.0F, 0.0F, 1, 1, 75, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-1.5F, -29.8F, -81.7F);
		gun.addChild(gun21);
		gun21.cubeList.add(new ModelBox(gun21, 154, 0, 0.0F, 0.0F, 0.0F, 1, 1, 75, 0.001F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-2.4F, -30.6F, 6.95F);
		gun.addChild(gun19);
		setRotationAngle(gun19, 0.0F, 0.0F, -0.7064F);
		gun19.cubeList.add(new ModelBox(gun19, 117, 92, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.003F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(-1.5F, -31.4F, 6.95F);
		gun.addChild(gun18);
		setRotationAngle(gun18, 0.0F, 0.0F, 0.8378F);
		gun18.cubeList.add(new ModelBox(gun18, 93, 117, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(0.4F, -30.6F, 6.95F);
		gun.addChild(gun17);
		setRotationAngle(gun17, 0.0F, 0.0F, 2.3051F);
		gun17.cubeList.add(new ModelBox(gun17, 97, 117, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-0.5F, -31.4F, 6.95F);
		gun.addChild(gun16);
		setRotationAngle(gun16, 0.0F, 0.0F, 0.7436F);
		gun16.cubeList.add(new ModelBox(gun16, 117, 97, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-1.5F, -31.4F, 6.95F);
		gun.addChild(gun15);
		gun15.cubeList.add(new ModelBox(gun15, 117, 99, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.001F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-2.4F, -30.6F, 2.3F);
		gun.addChild(gun14);
		setRotationAngle(gun14, 0.0F, 0.0F, -0.7064F);
		gun14.cubeList.add(new ModelBox(gun14, 94, 16, 0.0F, 0.0F, 0.0F, 1, 1, 5, -0.002F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-1.5F, -31.4F, 2.3F);
		gun.addChild(gun13);
		setRotationAngle(gun13, 0.0F, 0.0F, 0.8378F);
		gun13.cubeList.add(new ModelBox(gun13, 94, 22, 0.0F, 0.0F, 0.0F, 1, 1, 5, -0.001F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-2.4F, -30.6F, -6.7F);
		gun.addChild(gun12);
		setRotationAngle(gun12, 0.0F, 0.0F, -0.7064F);
		gun12.cubeList.add(new ModelBox(gun12, 114, 8, 0.0F, 0.0F, -1.0F, 1, 1, 3, -0.002F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-1.5F, -31.4F, -6.7F);
		gun.addChild(gun11);
		setRotationAngle(gun11, 0.0F, 0.0F, 0.8378F);
		gun11.cubeList.add(new ModelBox(gun11, 114, 12, 0.0F, 0.0F, -1.0F, 1, 1, 3, -0.001F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(0.4F, -30.6F, -6.7F);
		gun.addChild(gun10);
		setRotationAngle(gun10, 0.0F, 0.0F, 2.3051F);
		gun10.cubeList.add(new ModelBox(gun10, 77, 36, 0.0F, 0.0F, -1.0F, 1, 1, 15, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-0.5F, -31.4F, 2.3F);
		gun.addChild(gun9);
		setRotationAngle(gun9, 0.0F, 0.0F, 0.7436F);
		gun9.cubeList.add(new ModelBox(gun9, 94, 36, 0.0F, 0.0F, 0.0F, 1, 1, 5, -0.001F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-1.5F, -31.4F, 2.3F);
		gun.addChild(gun8);
		gun8.cubeList.add(new ModelBox(gun8, 94, 42, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
		gun8.cubeList.add(new ModelBox(gun8, 69, 25, 0.0F, -0.4F, -9.2F, 1, 1, 2, 0.0F, false));
		gun8.cubeList.add(new ModelBox(gun8, 117, 56, 0.0F, -0.4F, -10.0F, 1, 1, 1, 0.001F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-0.5F, -31.4F, -6.7F);
		gun.addChild(gun7);
		setRotationAngle(gun7, 0.0F, 0.0F, 0.7436F);
		gun7.cubeList.add(new ModelBox(gun7, 114, 17, 0.0F, 0.0F, -1.0F, 1, 1, 3, -0.001F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-1.5F, -31.4F, -6.7F);
		gun.addChild(gun6);
		gun6.cubeList.add(new ModelBox(gun6, 114, 21, 0.0F, 0.0F, -1.0F, 1, 1, 3, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-2.4F, -30.6F, 6.95F);
		gun.addChild(gun5);
		gun5.cubeList.add(new ModelBox(gun5, 101, 117, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.001F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-0.6F, -30.6F, 6.95F);
		gun.addChild(gun4);
		gun4.cubeList.add(new ModelBox(gun4, 117, 101, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.001F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-0.6F, -30.6F, -6.7F);
		gun.addChild(gun3);
		gun3.cubeList.add(new ModelBox(gun3, 77, 52, 0.0F, 0.0F, -1.0F, 1, 1, 15, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-2.4F, -30.6F, -6.7F);
		gun.addChild(gun2);
		gun2.cubeList.add(new ModelBox(gun2, 114, 25, 0.0F, 0.0F, -1.0F, 1, 1, 3, 0.0F, false));

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-2.4F, -30.6F, 2.4F);
		gun.addChild(gun1);
		gun1.cubeList.add(new ModelBox(gun1, 94, 52, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		mag_5rnd = new QRenderer(this);
		mag_5rnd.setRotationPoint(0.0F, -2.0F, 0.4F);
		setRotationAngle(mag_5rnd, -0.0349F, 0.0F, 0.0F);
		mag_5rnd.cubeList.add(new ModelBox(mag_5rnd, 27, 35, -2.25F, -1.5F, -5.8F, 2, 4, 1, 0.0F, false));
		mag_5rnd.cubeList.add(new ModelBox(mag_5rnd, 57, 76, -2.25F, -1.5F, -3.8F, 2, 4, 7, 0.0F, false));
		mag_5rnd.cubeList.add(new ModelBox(mag_5rnd, 0, 35, -0.75F, -1.5F, -3.8F, 1, 4, 7, 0.001F, false));
		mag_5rnd.cubeList.add(new ModelBox(mag_5rnd, 58, 25, -0.9F, -1.5F, -4.8F, 1, 4, 1, 0.001F, false));
		mag_5rnd.cubeList.add(new ModelBox(mag_5rnd, 18, 35, -2.1F, -1.5F, -4.8F, 2, 4, 1, 0.0F, false));
		mag_5rnd.cubeList.add(new ModelBox(mag_5rnd, 40, 10, -0.75F, -1.5F, -5.8F, 1, 4, 1, 0.001F, false));
		mag_5rnd.cubeList.add(new ModelBox(mag_5rnd, 169, 141, -0.65F, 2.5F, -5.8F, 1, 1, 9, 0.0F, false));
		mag_5rnd.cubeList.add(new ModelBox(mag_5rnd, 130, 96, -2.35F, 2.5F, -5.8F, 2, 1, 9, -0.001F, false));

		mag_10rnd = new QRenderer(this);
		mag_10rnd.setRotationPoint(0.0F, 1.0F, 0.3F);
		setRotationAngle(mag_10rnd, -0.0349F, 0.0F, 0.0F);
		mag_10rnd.cubeList.add(new ModelBox(mag_10rnd, 26, 93, -2.25F, -4.5F, -5.8F, 2, 7, 1, 0.0F, false));
		mag_10rnd.cubeList.add(new ModelBox(mag_10rnd, 37, 76, -2.25F, -4.5F, -3.8F, 2, 7, 7, 0.0F, false));
		mag_10rnd.cubeList.add(new ModelBox(mag_10rnd, 0, 0, -0.75F, -4.5F, -3.8F, 1, 7, 7, 0.001F, false));
		mag_10rnd.cubeList.add(new ModelBox(mag_10rnd, 10, 54, -0.9F, -4.5F, -4.8F, 1, 7, 1, 0.001F, false));
		mag_10rnd.cubeList.add(new ModelBox(mag_10rnd, 15, 93, -2.1F, -4.5F, -4.8F, 2, 7, 1, 0.0F, false));
		mag_10rnd.cubeList.add(new ModelBox(mag_10rnd, 70, 52, -0.75F, -4.5F, -5.8F, 1, 7, 1, 0.001F, false));
		mag_10rnd.cubeList.add(new ModelBox(mag_10rnd, 190, 24, -0.65F, 2.5F, -5.8F, 1, 1, 9, 0.0F, false));
		mag_10rnd.cubeList.add(new ModelBox(mag_10rnd, 130, 130, -2.35F, 2.5F, -5.8F, 2, 1, 9, -0.001F, false));

		chassis = new QRenderer(this);
		chassis.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		chassis48_r1 = new ModelRenderer(this);
		chassis48_r1.setRotationPoint(-3.0F, -28.1F, 10.15F);
		chassis.addChild(chassis48_r1);
		setRotationAngle(chassis48_r1, 0.2586F, -0.1441F, -2.6463F);
		chassis48_r1.cubeList.add(new ModelBox(chassis48_r1, 180, 140, -1.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		chassis4_r1 = new ModelRenderer(this);
		chassis4_r1.setRotationPoint(-2.5F, -30.1F, 9.35F);
		chassis.addChild(chassis4_r1);
		setRotationAngle(chassis4_r1, -0.1263F, -0.3506F, -1.2168F);
		chassis4_r1.cubeList.add(new ModelBox(chassis4_r1, 0, 76, -1.5F, 0.0F, 1.4F, 1, 1, 6, -0.001F, false));
		chassis4_r1.cubeList.add(new ModelBox(chassis4_r1, 131, 172, -1.0F, 0.0F, 1.0F, 1, 1, 9, 0.0F, false));

		chassis3_r1 = new ModelRenderer(this);
		chassis3_r1.setRotationPoint(0.5F, -30.1F, 9.35F);
		chassis.addChild(chassis3_r1);
		setRotationAngle(chassis3_r1, -0.1263F, 0.3506F, 1.2168F);
		chassis3_r1.cubeList.add(new ModelBox(chassis3_r1, 18, 76, 0.5F, 0.0F, 1.4F, 1, 1, 6, -0.001F, false));
		chassis3_r1.cubeList.add(new ModelBox(chassis3_r1, 110, 189, 0.0F, 0.0F, 1.0F, 1, 1, 9, 0.0F, false));

		chassis1_r1 = new ModelRenderer(this);
		chassis1_r1.setRotationPoint(-2.5F, -30.1F, 9.35F);
		chassis.addChild(chassis1_r1);
		setRotationAngle(chassis1_r1, -0.3718F, 0.0F, 0.0F);
		chassis1_r1.cubeList.add(new ModelBox(chassis1_r1, 53, 134, 0.0F, 0.0F, 2.0F, 3, 2, 8, 0.0F, false));

		chassis9_r1 = new ModelRenderer(this);
		chassis9_r1.setRotationPoint(0.5F, -27.76F, 23.35F);
		chassis.addChild(chassis9_r1);
		setRotationAngle(chassis9_r1, -0.0976F, -0.054F, -0.5035F);
		chassis9_r1.cubeList.add(new ModelBox(chassis9_r1, 260, 41, -1.0F, 0.0F, 0.0F, 1, 1, 27, 0.0F, false));

		chassis8_r1 = new ModelRenderer(this);
		chassis8_r1.setRotationPoint(-2.5F, -27.76F, 23.35F);
		chassis.addChild(chassis8_r1);
		setRotationAngle(chassis8_r1, -0.0976F, 0.054F, 0.5035F);
		chassis8_r1.cubeList.add(new ModelBox(chassis8_r1, 260, 116, 0.0F, 0.0F, 0.0F, 1, 1, 27, 0.0F, false));

		chassis7_r1 = new ModelRenderer(this);
		chassis7_r1.setRotationPoint(-2.5F, -27.76F, 23.35F);
		chassis.addChild(chassis7_r1);
		setRotationAngle(chassis7_r1, -0.1115F, 0.0F, 0.0F);
		chassis7_r1.cubeList.add(new ModelBox(chassis7_r1, 77, 189, 0.0F, 0.0F, 0.0F, 3, 1, 27, 0.0F, false));

		chassis10_r1 = new ModelRenderer(this);
		chassis10_r1.setRotationPoint(0.5F, -27.76F, 23.35F);
		chassis.addChild(chassis10_r1);
		setRotationAngle(chassis10_r1, -1.2033F, 0.2045F, -0.4855F);
		chassis10_r1.cubeList.add(new ModelBox(chassis10_r1, 49, 35, -1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F, false));

		chassis9_r2 = new ModelRenderer(this);
		chassis9_r2.setRotationPoint(-2.5F, -27.76F, 23.35F);
		chassis.addChild(chassis9_r2);
		setRotationAngle(chassis9_r2, -1.2033F, -0.2045F, 0.4855F);
		chassis9_r2.cubeList.add(new ModelBox(chassis9_r2, 49, 43, 0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F, false));

		chassis8_r2 = new ModelRenderer(this);
		chassis8_r2.setRotationPoint(-2.5F, -27.76F, 23.35F);
		chassis.addChild(chassis8_r2);
		setRotationAngle(chassis8_r2, -1.1525F, 0.0F, 0.0F);
		chassis8_r2.cubeList.add(new ModelBox(chassis8_r2, 26, 76, 0.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F, false));

		chassis11_r1 = new ModelRenderer(this);
		chassis11_r1.setRotationPoint(0.5F, -26.76F, 21.35F);
		chassis.addChild(chassis11_r1);
		setRotationAngle(chassis11_r1, -1.4983F, 0.0418F, -0.5221F);
		chassis11_r1.cubeList.add(new ModelBox(chassis11_r1, 18, 62, -1.0F, 0.0F, 0.0F, 1, 4, 1, 0.001F, false));

		chassis10_r2 = new ModelRenderer(this);
		chassis10_r2.setRotationPoint(-2.5F, -26.76F, 21.35F);
		chassis.addChild(chassis10_r2);
		setRotationAngle(chassis10_r2, -1.4983F, -0.0418F, 0.5221F);
		chassis10_r2.cubeList.add(new ModelBox(chassis10_r2, 77, 59, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.001F, false));

		chassis9_r3 = new ModelRenderer(this);
		chassis9_r3.setRotationPoint(-2.5F, -26.76F, 21.35F);
		chassis.addChild(chassis9_r3);
		setRotationAngle(chassis9_r3, -1.4871F, 0.0F, 0.0F);
		chassis9_r3.cubeList.add(new ModelBox(chassis9_r3, 114, 29, 0.0F, 0.0F, 0.0F, 3, 3, 1, 0.001F, false));

		chassis47_r1 = new ModelRenderer(this);
		chassis47_r1.setRotationPoint(1.0F, -28.1F, 10.15F);
		chassis.addChild(chassis47_r1);
		setRotationAngle(chassis47_r1, 0.2586F, 0.1441F, 2.6463F);
		chassis47_r1.cubeList.add(new ModelBox(chassis47_r1, 132, 189, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		chassis46_r1 = new ModelRenderer(this);
		chassis46_r1.setRotationPoint(1.0F, -28.1F, -6.65F);
		chassis.addChild(chassis46_r1);
		setRotationAngle(chassis46_r1, 0.0F, 0.0F, 2.8999F);
		chassis46_r1.cubeList.add(new ModelBox(chassis46_r1, 114, 77, 0.0F, 0.0F, -1.0F, 1, 2, 17, 0.0F, false));

		chassis54_r1 = new ModelRenderer(this);
		chassis54_r1.setRotationPoint(-2.8F, -28.1F, -44.65F);
		chassis.addChild(chassis54_r1);
		setRotationAngle(chassis54_r1, 0.0012F, -0.0056F, 0.0F);
		chassis54_r1.cubeList.add(new ModelBox(chassis54_r1, 40, 52, 0.0F, 0.6F, 21.0F, 1, 1, 16, 0.002F, false));
		chassis54_r1.cubeList.add(new ModelBox(chassis54_r1, 205, 236, 0.0F, 0.0F, 0.0F, 1, 1, 37, 0.0F, false));

		chassis54_r2 = new ModelRenderer(this);
		chassis54_r2.setRotationPoint(-2.8F, -27.6F, -44.65F);
		chassis.addChild(chassis54_r2);
		setRotationAngle(chassis54_r2, -0.0227F, -0.0056F, 0.0F);
		chassis54_r2.cubeList.add(new ModelBox(chassis54_r2, 240, 152, 0.0F, 0.0F, 0.03F, 1, 1, 37, 0.001F, false));

		chassis52_r1 = new ModelRenderer(this);
		chassis52_r1.setRotationPoint(-2.8F, -28.1F, -44.65F);
		chassis.addChild(chassis52_r1);
		setRotationAngle(chassis52_r1, 0.0F, 0.0056F, -2.8972F);
		chassis52_r1.cubeList.add(new ModelBox(chassis52_r1, 166, 234, -1.0F, 0.0F, 0.0F, 1, 2, 37, 0.0F, false));

		chassis55_r1 = new ModelRenderer(this);
		chassis55_r1.setRotationPoint(-2.8F, -26.6F, -44.65F);
		chassis.addChild(chassis55_r1);
		setRotationAngle(chassis55_r1, -0.0079F, -0.0211F, -0.9948F);
		chassis55_r1.cubeList.add(new ModelBox(chassis55_r1, 123, 230, 0.0F, 0.0F, 0.03F, 1, 1, 39, 0.001F, false));

		chassis54_r3 = new ModelRenderer(this);
		chassis54_r3.setRotationPoint(0.8F, -26.6F, -44.65F);
		chassis.addChild(chassis54_r3);
		setRotationAngle(chassis54_r3, -0.0079F, 0.0211F, 0.9948F);
		chassis54_r3.cubeList.add(new ModelBox(chassis54_r3, 231, 0, -1.0F, 0.0F, 0.03F, 1, 1, 39, 0.001F, false));

		chassis53_r1 = new ModelRenderer(this);
		chassis53_r1.setRotationPoint(0.8F, -27.6F, -44.65F);
		chassis.addChild(chassis53_r1);
		setRotationAngle(chassis53_r1, -0.0227F, 0.0056F, 0.0F);
		chassis53_r1.cubeList.add(new ModelBox(chassis53_r1, 244, 232, -1.0F, 0.0F, 0.03F, 1, 1, 37, 0.001F, false));

		chassis53_r2 = new ModelRenderer(this);
		chassis53_r2.setRotationPoint(0.8F, -28.1F, -44.65F);
		chassis.addChild(chassis53_r2);
		setRotationAngle(chassis53_r2, 0.0012F, 0.0056F, 0.0F);
		chassis53_r2.cubeList.add(new ModelBox(chassis53_r2, 0, 76, -1.0F, 0.6F, 21.0F, 1, 1, 16, 0.002F, false));
		chassis53_r2.cubeList.add(new ModelBox(chassis53_r2, 0, 269, -1.0F, 0.0F, 0.0F, 1, 1, 37, 0.0F, false));

		chassis51_r1 = new ModelRenderer(this);
		chassis51_r1.setRotationPoint(0.8F, -28.1F, -44.65F);
		chassis.addChild(chassis51_r1);
		setRotationAngle(chassis51_r1, 0.0F, -0.0056F, 2.8972F);
		chassis51_r1.cubeList.add(new ModelBox(chassis51_r1, 235, 193, 0.0F, 0.0F, 0.0F, 1, 2, 37, 0.0F, false));

		chassis57 = new ModelRenderer(this);
		chassis57.setRotationPoint(-2.5F, -30.1F, 7.0F);
		chassis.addChild(chassis57);
		chassis57.cubeList.add(new ModelBox(chassis57, 117, 103, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.002F, false));

		chassis56 = new ModelRenderer(this);
		chassis56.setRotationPoint(-3.0F, -28.1F, 7.0F);
		chassis.addChild(chassis56);
		setRotationAngle(chassis56, 0.0F, 0.0F, -1.3384F);
		chassis56.cubeList.add(new ModelBox(chassis56, 85, 16, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.001F, false));

		chassis55 = new ModelRenderer(this);
		chassis55.setRotationPoint(-3.0F, -28.1F, -3.65F);
		chassis.addChild(chassis55);
		setRotationAngle(chassis55, 0.0F, 0.0F, -1.3384F);
		chassis55.cubeList.add(new ModelBox(chassis55, 58, 17, 0.0F, 0.0F, -1.0F, 1, 1, 7, 0.0F, false));
		chassis55.cubeList.add(new ModelBox(chassis55, 58, 8, 0.5F, 0.0F, -1.0F, 1, 1, 7, -0.001F, false));

		chassis48 = new ModelRenderer(this);
		chassis48.setRotationPoint(-3.0F, -28.1F, 7.35F);
		chassis.addChild(chassis48);
		setRotationAngle(chassis48, 0.0F, 0.0F, -1.3384F);
		chassis48.cubeList.add(new ModelBox(chassis48, 85, 18, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		chassis46 = new ModelRenderer(this);
		chassis46.setRotationPoint(1.0F, -28.1F, -6.65F);
		chassis.addChild(chassis46);
		setRotationAngle(chassis46, 0.0F, 0.0F, 2.8999F);
		chassis46.cubeList.add(new ModelBox(chassis46, 117, 78, 0.0F, 0.0F, 15.9F, 1, 1, 1, -0.001F, false));
		chassis46.cubeList.add(new ModelBox(chassis46, 77, 117, 0.0F, 0.7F, 15.9F, 1, 1, 1, -0.002F, false));

		chassis36 = new ModelRenderer(this);
		chassis36.setRotationPoint(-3.0F, -28.1F, -6.65F);
		chassis.addChild(chassis36);
		setRotationAngle(chassis36, 0.0F, 0.0F, -2.8999F);
		chassis36.cubeList.add(new ModelBox(chassis36, 117, 66, -1.0F, 0.0F, 15.9F, 1, 1, 1, -0.001F, false));
		chassis36.cubeList.add(new ModelBox(chassis36, 117, 64, -1.0F, 0.7F, 15.9F, 1, 1, 1, -0.002F, false));

		chassis45 = new ModelRenderer(this);
		chassis45.setRotationPoint(-3.0F, -28.1F, 2.35F);
		chassis.addChild(chassis45);
		setRotationAngle(chassis45, 0.0F, 0.0F, -1.3384F);
		chassis45.cubeList.add(new ModelBox(chassis45, 40, 10, 0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));

		chassis44 = new ModelRenderer(this);
		chassis44.setRotationPoint(-3.0F, -28.1F, -6.65F);
		chassis.addChild(chassis44);
		setRotationAngle(chassis44, 0.0F, 0.0F, -1.3384F);
		chassis44.cubeList.add(new ModelBox(chassis44, 37, 105, 0.0F, 0.0F, -1.0F, 2, 1, 3, -0.001F, false));

		chassis39 = new ModelRenderer(this);
		chassis39.setRotationPoint(-3.0F, -28.5F, 9.2F);
		chassis.addChild(chassis39);
		chassis39.cubeList.add(new ModelBox(chassis39, 77, 68, 0.0F, 0.4F, 0.0F, 4, 2, 1, -0.001F, false));

		chassis38 = new ModelRenderer(this);
		chassis38.setRotationPoint(-3.0F, -28.1F, -4.65F);
		chassis.addChild(chassis38);
		chassis38.cubeList.add(new ModelBox(chassis38, 271, 76, 0.0F, 0.0F, -3.0F, 4, 2, 17, 0.0F, false));

		chassis37 = new ModelRenderer(this);
		chassis37.setRotationPoint(-2.0F, -30.1F, -44.65F);
		chassis.addChild(chassis37);
		setRotationAngle(chassis37, 0.0F, -0.0124F, 0.0F);
		chassis37.cubeList.add(new ModelBox(chassis37, 0, 228, 0.0F, 0.0F, 0.0F, 1, 1, 40, 0.0F, false));

		chassis35 = new ModelRenderer(this);
		chassis35.setRotationPoint(0.0F, -30.1F, -44.65F);
		chassis.addChild(chassis35);
		setRotationAngle(chassis35, 0.0F, 0.0124F, 0.0F);
		chassis35.cubeList.add(new ModelBox(chassis35, 198, 152, -1.0F, 0.0F, 0.0F, 1, 1, 40, 0.0F, false));

		chassis34 = new ModelRenderer(this);
		chassis34.setRotationPoint(-2.5F, -25.9F, -44.65F);
		chassis.addChild(chassis34);
		setRotationAngle(chassis34, 1.5533F, 0.0F, 0.0F);
		chassis34.cubeList.add(new ModelBox(chassis34, 181, 273, 0.6F, 0.0F, 0.0F, 2, 58, 1, 0.0F, false));
		chassis34.cubeList.add(new ModelBox(chassis34, 224, 0, 0.4F, 0.0F, 0.0F, 1, 58, 1, 0.001F, false));

		chassis33 = new ModelRenderer(this);
		chassis33.setRotationPoint(-3.0F, -26.0F, -21.65F);
		chassis.addChild(chassis33);
		setRotationAngle(chassis33, 1.5533F, 0.0F, 0.0F);
		chassis33.cubeList.add(new ModelBox(chassis33, 97, 153, 0.0F, 14.0F, 0.0F, 4, 19, 1, 0.001F, false));

		chassis31 = new ModelRenderer(this);
		chassis31.setRotationPoint(-0.5F, -30.1F, -4.65F);
		chassis.addChild(chassis31);
		chassis31.cubeList.add(new ModelBox(chassis31, 0, 152, 0.0F, 0.0F, 0.0F, 1, 1, 14, -0.001F, false));

		chassis30 = new ModelRenderer(this);
		chassis30.setRotationPoint(-2.0F, -30.1F, -44.65F);
		chassis.addChild(chassis30);
		chassis30.cubeList.add(new ModelBox(chassis30, 154, 153, 0.0F, 0.0F, 0.0F, 2, 1, 40, 0.001F, false));

		chassis29 = new ModelRenderer(this);
		chassis29.setRotationPoint(-2.5F, -30.1F, 2.35F);
		chassis.addChild(chassis29);
		chassis29.cubeList.add(new ModelBox(chassis29, 94, 58, 0.0F, 0.0F, 0.0F, 1, 1, 5, -0.001F, false));
		chassis29.cubeList.add(new ModelBox(chassis29, 58, 0, -0.1F, 0.5F, -7.0F, 1, 1, 7, 0.0F, false));

		chassis23 = new ModelRenderer(this);
		chassis23.setRotationPoint(-3.0F, -21.2F, 25.2F);
		chassis.addChild(chassis23);
		setRotationAngle(chassis23, 1.2641F, 0.0F, 0.0F);
		chassis23.cubeList.add(new ModelBox(chassis23, 77, 153, 0.0F, 0.0F, -1.0F, 4, 20, 5, 0.001F, false));

		chassis22 = new ModelRenderer(this);
		chassis22.setRotationPoint(-3.0F, -26.0F, 23.35F);
		chassis.addChild(chassis22);
		setRotationAngle(chassis22, -0.1115F, 0.0F, 0.0F);
		chassis22.cubeList.add(new ModelBox(chassis22, 39, 269, 0.0F, 0.0F, 0.0F, 4, 5, 23, 0.0F, false));

		chassis21 = new ModelRenderer(this);
		chassis21.setRotationPoint(-3.0F, -23.3F, 48.1F);
		chassis.addChild(chassis21);
		setRotationAngle(chassis21, -1.7299F, 0.0F, 0.0F);
		chassis21.cubeList.add(new ModelBox(chassis21, 114, 153, 0.0F, -2.0F, 0.0F, 4, 5, 10, -0.001F, false));

		chassis20 = new ModelRenderer(this);
		chassis20.setRotationPoint(-3.0F, -21.2F, 23.8F);
		chassis.addChild(chassis20);
		setRotationAngle(chassis20, 1.2641F, 0.0F, 0.0F);
		chassis20.cubeList.add(new ModelBox(chassis20, 142, 153, 0.0F, 0.0F, -1.0F, 4, 26, 1, 0.0F, false));

		chassis19 = new ModelRenderer(this);
		chassis19.setRotationPoint(-3.0F, -20.25F, 24.4F);
		chassis.addChild(chassis19);
		setRotationAngle(chassis19, -1.2641F, 0.0F, 0.0F);
		chassis19.cubeList.add(new ModelBox(chassis19, 77, 98, 0.0F, 0.0F, -1.0F, 4, 6, 1, -0.002F, false));

		chassis18 = new ModelRenderer(this);
		chassis18.setRotationPoint(-3.0F, -21.5F, 18.4F);
		chassis.addChild(chassis18);
		setRotationAngle(chassis18, 0.409F, 0.0F, 0.0F);
		chassis18.cubeList.add(new ModelBox(chassis18, 48, 70, 0.0F, 0.0F, -1.0F, 4, 3, 2, 0.001F, false));

		chassis17 = new ModelRenderer(this);
		chassis17.setRotationPoint(-3.0F, -23.3F, 16.75F);
		chassis.addChild(chassis17);
		setRotationAngle(chassis17, 0.632F, 0.0F, 0.0F);
		chassis17.cubeList.add(new ModelBox(chassis17, 77, 0, 0.0F, 0.0F, -1.0F, 4, 4, 3, 0.003F, false));

		chassis16 = new ModelRenderer(this);
		chassis16.setRotationPoint(-3.0F, -25.2F, 13.5F);
		chassis.addChild(chassis16);
		setRotationAngle(chassis16, 1.041F, 0.0F, 0.0F);
		chassis16.cubeList.add(new ModelBox(chassis16, 0, 83, 0.0F, 0.0F, -1.0F, 4, 5, 2, -0.001F, false));

		chassis15 = new ModelRenderer(this);
		chassis15.setRotationPoint(-3.0F, -26.4F, 10.3F);
		chassis.addChild(chassis15);
		setRotationAngle(chassis15, 1.2269F, 0.0F, 0.0F);
		chassis15.cubeList.add(new ModelBox(chassis15, 56, 98, 0.0F, 0.0F, -1.0F, 4, 4, 2, 0.0F, false));

		chassis14 = new ModelRenderer(this);
		chassis14.setRotationPoint(-2.0F, -20.3F, 23.5F);
		chassis.addChild(chassis14);
		setRotationAngle(chassis14, 1.2641F, 0.0F, 0.0F);
		chassis14.cubeList.add(new ModelBox(chassis14, 67, 152, 0.0F, 0.0F, -1.0F, 2, 26, 1, 0.0F, false));

		chassis13 = new ModelRenderer(this);
		chassis13.setRotationPoint(-2.0F, -19.2F, 23.8F);
		chassis.addChild(chassis13);
		setRotationAngle(chassis13, -1.2641F, 0.0F, 0.0F);
		chassis13.cubeList.add(new ModelBox(chassis13, 9, 0, 0.0F, 0.0F, -1.0F, 2, 6, 1, 0.001F, false));

		chassis12 = new ModelRenderer(this);
		chassis12.setRotationPoint(-3.0F, -27.0F, 23.35F);
		chassis.addChild(chassis12);
		setRotationAngle(chassis12, -0.1115F, 0.0F, 0.0F);
		chassis12.cubeList.add(new ModelBox(chassis12, 154, 112, 0.0F, 0.1F, 0.0F, 4, 1, 27, 0.0F, false));

		chassis11 = new ModelRenderer(this);
		chassis11.setRotationPoint(-3.0F, -27.0F, 23.35F);
		chassis.addChild(chassis11);
		setRotationAngle(chassis11, -1.1525F, 0.0F, 0.0F);
		chassis11.cubeList.add(new ModelBox(chassis11, 190, 59, 0.0F, 0.0F, 0.1F, 4, 4, 6, -0.001F, false));

		chassis10 = new ModelRenderer(this);
		chassis10.setRotationPoint(-3.0F, -26.0F, 22.0F);
		chassis.addChild(chassis10);
		setRotationAngle(chassis10, -1.4871F, 0.0F, 0.0F);
		chassis10.cubeList.add(new ModelBox(chassis10, 190, 77, 0.0F, 0.0F, 0.0F, 4, 4, 6, 0.0F, false));

		chassis6 = new ModelRenderer(this);
		chassis6.setRotationPoint(-2.0F, -20.5F, 17.8F);
		chassis.addChild(chassis6);
		setRotationAngle(chassis6, 0.409F, 0.0F, 0.0F);
		chassis6.cubeList.add(new ModelBox(chassis6, 18, 54, 0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		chassis5 = new ModelRenderer(this);
		chassis5.setRotationPoint(-2.0F, -22.7F, 16.0F);
		chassis.addChild(chassis5);
		setRotationAngle(chassis5, 0.632F, 0.0F, 0.0F);
		chassis5.cubeList.add(new ModelBox(chassis5, 40, 0, 0.0F, 0.0F, -1.0F, 2, 4, 1, -0.001F, false));

		chassis4 = new ModelRenderer(this);
		chassis4.setRotationPoint(-2.0F, -24.4F, 13.0F);
		chassis.addChild(chassis4);
		setRotationAngle(chassis4, 1.041F, 0.0F, 0.0F);
		chassis4.cubeList.add(new ModelBox(chassis4, 40, 17, 0.0F, 0.0F, -1.0F, 2, 4, 1, 0.001F, false));

		chassis3 = new ModelRenderer(this);
		chassis3.setRotationPoint(-2.0F, -25.5F, 10.0F);
		chassis.addChild(chassis3);
		setRotationAngle(chassis3, 1.2269F, 0.0F, 0.0F);
		chassis3.cubeList.add(new ModelBox(chassis3, 0, 35, 0.0F, -1.0F, -1.0F, 2, 5, 1, 0.0F, false));

		chassis2 = new ModelRenderer(this);
		chassis2.setRotationPoint(-3.0F, -28.5F, 11.2F);
		chassis.addChild(chassis2);
		setRotationAngle(chassis2, -0.2952F, 0.0F, 0.0F);
		chassis2.cubeList.add(new ModelBox(chassis2, 37, 98, 0.0F, 0.6909F, -0.9568F, 4, 2, 11, 0.002F, false));

		chassis1 = new ModelRenderer(this);
		chassis1.setRotationPoint(-2.5F, -30.1F, 10.35F);
		chassis.addChild(chassis1);
		setRotationAngle(chassis1, -0.3718F, 0.0F, 0.0F);
		chassis1.cubeList.add(new ModelBox(chassis1, 49, 52, 2.0F, 0.3633F, -0.9317F, 1, 2, 2, 0.0F, false));
		chassis1.cubeList.add(new ModelBox(chassis1, 40, 52, 0.0F, 0.3633F, -0.9317F, 1, 2, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.5F, -25.1F, -7.0F);
		chassis.addChild(bone);
		setRotationAngle(bone, -0.0262F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 154, 140, -3.01F, -1.0F, 1.0F, 3, 1, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 114, 4, -3.01F, -1.1F, 10.0F, 3, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 90, -3.01F, 0.0F, 1.0F, 3, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5411F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 114, 0, -3.01F, 3.8F, 7.6F, 3, 3, 1, -0.001F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.5236F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 93, 72, -3.01F, -2.15F, 1.25F, 3, 2, 1, -0.001F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(-2.0F, -24.7F, 10.0F);
		chassis.addChild(gun30);
		setRotationAngle(gun30, -1.8961F, 0.0F, 0.0F);
		gun30.cubeList.add(new ModelBox(gun30, 94, 12, 0.0F, 0.0F, 0.0F, 2, 1, 2, -0.001F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-2.0F, -22.8F, 9.4F);
		chassis.addChild(gun33);
		setRotationAngle(gun33, -2.4166F, 0.0F, 0.0F);
		gun33.cubeList.add(new ModelBox(gun33, 27, 40, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(-2.0F, -22.3F, 8.8F);
		chassis.addChild(gun34);
		setRotationAngle(gun34, -2.4166F, 0.0F, 0.0F);
		gun34.cubeList.add(new ModelBox(gun34, 40, 22, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.001F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-2.0F, -23.1F, 5.2F);
		chassis.addChild(gun32);
		setRotationAngle(gun32, -0.1487F, 0.0F, 0.0F);
		gun32.cubeList.add(new ModelBox(gun32, 56, 104, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(-2.0F, -24.7F, 4.0F);
		chassis.addChild(gun29);
		setRotationAngle(gun29, 0.1487F, 0.0F, 0.0F);
		gun29.cubeList.add(new ModelBox(gun29, 48, 79, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-2.0F, -22.7F, 4.3F);
		chassis.addChild(gun31);
		setRotationAngle(gun31, 0.9295F, 0.0F, 0.0F);
		gun31.cubeList.add(new ModelBox(gun31, 69, 28, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.001F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-2.0F, -24.5F, 3.3F);
		chassis.addChild(gun35);
		setRotationAngle(gun35, 1.5533F, 0.0F, 0.0F);
		gun35.cubeList.add(new ModelBox(gun35, 0, 0, 0.0F, 0.0F, 0.0F, 2, 6, 1, 0.001F, false));

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(-2.0F, -24.5F, 3.3F);
		chassis.addChild(gun36);
		setRotationAngle(gun36, 1.0328F, 0.0F, 0.0F);
		gun36.cubeList.add(new ModelBox(gun36, 18, 40, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.001F, false));

		apac_chassis = new QRenderer(this);
		apac_chassis.setRotationPoint(-2.5F, -5.6F, -7.7F);
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 114, 36, 0.0F, 0.0F, 0.0F, 3, 1, 16, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 87, 48, -0.25F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 0, 188, -0.251F, 1.8F, -10.8F, 1, 1, 12, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 190, 47, -0.45F, 0.5F, -11.0F, 1, 1, 11, -0.201F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 190, 35, -0.25F, 1.1F, -11.0F, 1, 1, 11, -0.1F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 87, 42, -0.45F, 0.85F, -11.4F, 1, 2, 1, -0.202F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 87, 23, -0.45F, 0.85F, -6.4F, 1, 2, 1, -0.202F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 86, 7, 2.45F, 0.85F, -11.4F, 1, 2, 1, -0.202F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 86, 52, 2.45F, 0.85F, -6.4F, 1, 2, 1, -0.202F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 190, 0, 2.25F, 1.1F, -11.0F, 1, 1, 11, -0.1F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 190, 12, 2.45F, 0.5F, -11.0F, 1, 1, 11, -0.201F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 168, 175, 2.251F, 1.8F, -10.8F, 1, 1, 12, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 0, 35, 0.0F, 1.3F, -34.0F, 3, 1, 34, -0.2F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 0, 0, 0.2F, 1.8F, -34.0F, 3, 1, 34, -0.199F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 154, 77, -0.2F, 1.8F, -34.0F, 1, 1, 34, -0.198F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 12, 87, 2.25F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 101, 58, 0.0F, 1.0F, 15.0F, 3, 2, 2, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 12, 83, 2.0F, 0.0F, 17.0F, 1, 3, 1, 0.002F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 94, 54, 1.95F, 0.05F, 16.0F, 1, 1, 1, 0.002F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 31, 82, 0.0F, 0.0F, 17.0F, 1, 3, 1, 0.002F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 85, 36, 2.3F, -0.2F, 17.2F, 1, 2, 1, -0.2F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 94, 52, 2.1F, 0.6F, 18.0F, 1, 1, 1, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 94, 48, 2.1F, 0.6F, 18.5F, 1, 1, 1, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 94, 42, -0.1F, 0.6F, 18.5F, 1, 1, 1, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 94, 44, -0.1F, 0.6F, 18.0F, 1, 1, 1, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 85, 20, -0.3F, -0.2F, 17.2F, 1, 2, 1, -0.2F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 18, 54, -0.2F, 0.3F, 17.1F, 1, 1, 7, -0.201F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 66, 66, -0.15F, 0.8F, 21.4F, 3, 1, 1, -0.2F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 94, 38, 2.15F, 0.8F, 21.4F, 1, 1, 1, -0.201F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 40, 60, -0.2F, 1.9F, 20.3F, 1, 1, 2, -0.201F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 58, 42, -0.2F, 2.7F, 18.2F, 1, 1, 2, -0.201F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 107, 72, 0.0F, 1.1F, 22.9F, 1, 1, 1, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 58, 38, 0.0F, 0.9F, 17.7F, 1, 1, 2, 0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 49, 0, 0.0F, 1.5F, 17.2F, 1, 2, 2, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 40, 0, -0.1F, 0.9F, 17.1F, 1, 3, 7, -0.201F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 40, 52, 2.2F, 0.3F, 17.1F, 1, 1, 7, -0.201F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 18, 35, 2.1F, 0.9F, 17.1F, 1, 3, 7, -0.201F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 107, 23, 2.0F, 1.1F, 22.9F, 1, 1, 1, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 18, 58, 2.2F, 1.9F, 20.3F, 1, 1, 2, -0.201F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 58, 20, 2.2F, 2.7F, 18.2F, 1, 1, 2, -0.201F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 28, 45, 2.0F, 1.5F, 17.2F, 1, 2, 2, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 58, 35, 2.0F, 0.9F, 17.7F, 1, 1, 2, 0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 93, 77, 0.5F, 1.05F, 16.9F, 2, 1, 7, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 77, 179, 0.0F, 0.55F, 23.9F, 3, 2, 7, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 0, 19, 0.0F, 0.2F, 30.9F, 3, 1, 14, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 0, 54, 0.5F, -2.8F, 29.9F, 2, 1, 14, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 114, 130, 2.5F, -2.05F, 29.9F, 1, 1, 14, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 77, 128, -0.5F, -2.05F, 29.9F, 1, 1, 14, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 40, 60, -0.5F, -1.55F, 37.9F, 1, 1, 6, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 58, 42, 2.5F, -1.55F, 37.9F, 1, 1, 6, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 57, 87, 0.0F, 2.2F, 37.9F, 3, 1, 6, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 66, 49, 0.0F, 1.2F, 37.9F, 3, 1, 1, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 25, 83, 1.0F, -1.8F, 40.4F, 1, 2, 1, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 18, 83, 1.0F, -1.8F, 31.4F, 1, 2, 1, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 0, 66, 0.0F, 1.2F, 42.9F, 3, 1, 1, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 58, 49, 0.0F, 1.2F, 43.4F, 3, 1, 1, 0.1F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 0, 46, -0.5F, 1.2F, 39.4F, 4, 1, 3, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 77, 77, 0.0F, 0.5F, 43.9F, 3, 10, 1, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 77, 16, 0.0F, -0.5F, 46.5F, 3, 11, 1, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 58, 52, -0.5F, -0.3F, 47.1F, 4, 11, 1, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 0, 54, -0.5F, -0.3F, 47.6F, 4, 11, 1, -0.002F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 0, 14, -0.5F, -0.3F, 48.1F, 4, 1, 1, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 77, 32, 0.0F, -1.2F, 47.1F, 3, 1, 2, -0.002F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 67, 17, 0.0F, 2.5F, 41.9F, 3, 5, 1, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 101, 52, -0.5F, 3.5F, 42.9F, 4, 3, 1, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 40, 25, 1.0F, 4.5F, 39.6F, 1, 1, 7, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 40, 17, 1.0F, 6.7F, 39.6F, 1, 1, 7, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 66, 42, 0.0F, 2.5F, 39.9F, 3, 5, 1, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 100, 85, 0.0F, 0.6F, 30.9F, 3, 3, 2, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 16, 112, 0.0F, 1.4F, 32.7F, 3, 3, 1, -0.2F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 18, 45, 0.0F, 6.4F, 33.2F, 3, 1, 4, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 190, 95, 0.0F, 9.5F, 37.6F, 3, 1, 7, -0.003F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 190, 87, 0.0F, 7.4F, 37.4F, 3, 1, 7, -0.003F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 94, 36, 2.25F, 0.55F, 25.9F, 1, 1, 1, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 94, 28, -0.25F, 0.55F, 25.9F, 1, 1, 1, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 85, 80, -0.5F, 0.65F, 24.4F, 1, 2, 1, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 58, 35, 0.5F, 2.55F, 23.9F, 2, 1, 6, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 114, 17, 0.0F, 3.5F, 2.0F, 3, 1, 16, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 114, 0, 0.0F, 2.75F, 2.0F, 3, 1, 16, 0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 0, 90, 0.0F, 1.95F, 8.5F, 3, 1, 1, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 94, 60, -0.1F, 1.95F, 8.2F, 1, 1, 1, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 94, 58, 2.1F, 1.95F, 8.2F, 1, 1, 1, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 0, 35, 0.2F, 0.8F, 2.0F, 1, 3, 16, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 88, 0, 0.2F, 0.8F, 1.1F, 1, 2, 1, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 87, 83, 1.8F, 0.8F, 1.1F, 1, 2, 1, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 0, 0, 1.8F, 0.8F, 2.0F, 1, 3, 16, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 18, 89, 0.0F, 4.5F, 11.0F, 3, 2, 1, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 37, 112, 0.0F, 3.75F, 11.5F, 3, 3, 1, -0.2F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 24, 112, 0.0F, 4.25F, 17.5F, 3, 3, 1, -0.2F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 93, 92, 0.0F, 6.85F, 12.7F, 3, 1, 6, -0.2F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 77, 189, 0.0F, 3.4F, 2.6F, 3, 3, 9, -0.1F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 87, 68, 0.0F, 4.5F, 2.0F, 3, 2, 1, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 15, 167, -0.2F, 5.7F, 2.65F, 1, 1, 9, -0.201F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 15, 93, 2.2F, 5.7F, 2.65F, 1, 1, 9, -0.201F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 0, 112, 0.0F, 3.6F, 18.1F, 3, 4, 2, 0.1F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 77, 7, 0.0F, 3.7F, 19.8F, 3, 5, 3, 0.0F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 8, 76, 0.0F, 3.7F, 19.5F, 3, 5, 1, -0.001F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 20, 19, 0.0F, 6.5F, 20.5F, 3, 8, 3, 0.099F, false));
		apac_chassis.cubeList.add(new ModelBox(apac_chassis, 67, 8, 0.0F, 8.5F, 19.5F, 3, 6, 1, 0.098F, false));

		gun43_r1 = new ModelRenderer(this);
		gun43_r1.setRotationPoint(0.5F, -0.6F, 17.05F);
		apac_chassis.addChild(gun43_r1);
		setRotationAngle(gun43_r1, -0.3718F, 0.0F, 0.0F);
		gun43_r1.cubeList.add(new ModelBox(gun43_r1, 107, 90, 0.5F, 0.079F, 2.73F, 1, 1, 1, 0.05F, false));

		gun42_r2 = new ModelRenderer(this);
		gun42_r2.setRotationPoint(2.8F, -0.6F, 17.05F);
		apac_chassis.addChild(gun42_r2);
		setRotationAngle(gun42_r2, -0.3837F, -0.2435F, 0.097F);
		gun42_r2.cubeList.add(new ModelBox(gun42_r2, 8, 64, -0.61F, -0.1F, 1.95F, 1, 1, 2, -0.13F, false));

		gun43_r2 = new ModelRenderer(this);
		gun43_r2.setRotationPoint(0.2F, -0.6F, 17.05F);
		apac_chassis.addChild(gun43_r2);
		setRotationAngle(gun43_r2, -0.3837F, 0.2435F, -0.097F);
		gun43_r2.cubeList.add(new ModelBox(gun43_r2, 40, 63, -0.39F, -0.1F, 1.95F, 1, 1, 2, -0.131F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.1F, 6.4F, 23.6F);
		apac_chassis.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.8029F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 77, 29, -3.1F, 0.1F, -1.1F, 3, 1, 1, -0.001F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.8F, 6.55F, 11.7F);
		apac_chassis.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7505F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 77, 48, -2.8F, -0.8F, -0.2F, 3, 1, 2, -0.199F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.5F, 8.4F, 12.1F);
		apac_chassis.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.576F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 5, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.5F, 8.1F, 12.2F);
		apac_chassis.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.576F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 58, 3, 0.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(3.0F, 1.95F, 9.5F);
		apac_chassis.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.8326F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 99, 107, -1.1F, 0.1F, 0.1F, 1, 1, 1, 0.098F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 108, 11, -2.9F, 0.1F, 0.1F, 1, 1, 1, 0.098F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 1.0F, 14.0F);
		apac_chassis.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.5236F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 93, 113, 0.0F, 0.0F, 0.0F, 3, 3, 1, -0.001F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 1.0F, 7.0F);
		apac_chassis.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.5236F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 113, 0.0F, 0.0F, 0.0F, 3, 3, 1, -0.001F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 1.0F, 0.0F);
		apac_chassis.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.5236F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 77, 107, 0.0F, 0.0F, 0.0F, 3, 4, 1, -0.001F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.5F, 0.0F, 18.0F);
		apac_chassis.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.3491F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 68, 35, -0.8F, -0.2F, -0.2F, 1, 1, 2, -0.199F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 68, 38, 1.8F, -0.2F, -0.2F, 1, 1, 2, -0.199F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 2.55F, 23.9F);
		apac_chassis.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.4538F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 35, 0.0F, 0.0F, 0.0F, 1, 1, 7, -0.001F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(3.0F, 2.55F, 23.9F);
		apac_chassis.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.4538F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 40, 43, -1.0F, 0.0F, 0.0F, 1, 1, 7, -0.001F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.5F, 0.65F, 25.4F);
		apac_chassis.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -0.6807F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 85, 39, 0.0F, 0.0F, -1.0F, 1, 2, 1, -0.001F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.5F, 0.65F, 24.4F);
		apac_chassis.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.6807F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 85, 77, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(3.25F, 0.55F, 26.9F);
		apac_chassis.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -0.3142F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 94, 22, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.25F, 0.55F, 26.9F);
		apac_chassis.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.3142F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 94, 24, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(3.0F, 3.6F, 31.9F);
		apac_chassis.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.3316F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 67, 106, -3.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(3.0F, 6.4F, 37.2F);
		apac_chassis.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.3316F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 104, 77, -3.0F, 0.0F, -1.0F, 3, 4, 1, -0.002F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, -1.2F, 47.1F);
		apac_chassis.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.5236F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 27, 57, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.003F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(3.0F, -1.2F, 47.1F);
		apac_chassis.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.5236F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 58, 0, -1.0F, 0.0F, 0.0F, 1, 1, 2, -0.003F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(3.5F, 0.7F, 49.1F);
		apac_chassis.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.1745F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 101, 42, -4.0F, 0.0F, -1.0F, 4, 3, 1, -0.003F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.5F, -2.8F, 29.9F);
		apac_chassis.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.925F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 77, 113, 0.0F, 0.25F, 0.0F, 1, 1, 14, -0.001F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 112, 0.0F, 0.0F, 0.0F, 1, 1, 14, -0.002F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(2.5F, -2.8F, 29.9F);
		apac_chassis.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.925F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 114, 96, -1.0F, 0.25F, 0.0F, 1, 1, 14, -0.001F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 127, -1.0F, 0.0F, 0.0F, 1, 1, 14, -0.002F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(3.0F, 1.9F, 19.7F);
		apac_chassis.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.5236F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 107, 32, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 107, 68, -3.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(2.4F, 2.1F, 20.5F);
		apac_chassis.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.6109F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 57, 87, -0.2F, -0.2F, -0.2F, 1, 2, 1, -0.202F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 69, 87, -2.6F, -0.2F, -0.2F, 1, 2, 1, -0.202F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(2.4F, 2.7F, 22.1F);
		apac_chassis.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.5411F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 58, 17, -0.2F, -0.8F, -0.2F, 1, 1, 2, -0.202F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 58, 45, -2.6F, -0.8F, -0.2F, 1, 1, 2, -0.202F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(3.25F, 0.0F, 0.0F);
		apac_chassis.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.9948F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 58, 8, -1.15F, 0.15F, 0.15F, 1, 1, 2, 0.148F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 58, 11, -3.35F, 0.15F, 0.15F, 1, 1, 2, 0.148F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(3.0F, 2.0F, -33.8F);
		apac_chassis.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, 0.6981F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 154, 0, -0.8F, -0.2F, -0.2F, 1, 1, 34, -0.202F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, 2.0F, -33.8F);
		apac_chassis.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, -0.6981F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 154, 35, -0.2F, -0.2F, -0.2F, 1, 1, 34, -0.202F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.5F, -2.25F, -36.8F);
		apac_chassis.addChild(bone2);
		

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, 0.0F, 32.25F);
		bone2.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, -0.4363F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 65, 112, -1.65F, 0.0F, 0.0F, 1, 1, 3, -0.002F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 70, 100, -1.65F, 0.0F, -2.25F, 1, 1, 1, -0.002F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 101, 2, -1.65F, 0.0F, -4.5F, 1, 1, 1, -0.002F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 101, 16, -1.65F, 0.0F, -6.75F, 1, 1, 1, -0.002F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 101, 32, -1.65F, 0.0F, -9.0F, 1, 1, 1, -0.002F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 70, 102, -1.65F, 0.0F, -11.25F, 1, 1, 1, -0.002F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 23, 103, -1.65F, 0.0F, -13.5F, 1, 1, 1, -0.002F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 9, 104, -1.65F, 0.0F, -15.75F, 1, 1, 1, -0.002F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 104, 82, -1.65F, 0.0F, -18.0F, 1, 1, 1, -0.002F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 105, 92, -1.65F, 0.0F, -20.25F, 1, 1, 1, -0.002F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 106, 40, -1.65F, 0.0F, -22.5F, 1, 1, 1, -0.002F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 107, 2, -1.65F, 0.0F, -24.75F, 1, 1, 1, -0.002F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 107, 21, -1.65F, 0.0F, -27.0F, 1, 1, 1, -0.002F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 101, 16, -1.65F, 0.0F, -32.25F, 1, 1, 4, -0.002F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 152, -1.0F, 0.0F, -32.25F, 1, 1, 35, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, 0.0F, 32.25F);
		bone2.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.4363F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 57, 112, 0.65F, 0.0F, 0.0F, 1, 1, 3, -0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 100, 64, 0.65F, 0.0F, -2.25F, 1, 1, 1, -0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 101, 0, 0.65F, 0.0F, -4.5F, 1, 1, 1, -0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 101, 8, 0.65F, 0.0F, -6.75F, 1, 1, 1, -0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 101, 24, 0.65F, 0.0F, -9.0F, 1, 1, 1, -0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 93, 101, 0.65F, 0.0F, -11.25F, 1, 1, 1, -0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 19, 103, 0.65F, 0.0F, -13.5F, 1, 1, 1, -0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 103, 103, 0.65F, 0.0F, -15.75F, 1, 1, 1, -0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 104, 73, 0.65F, 0.0F, -18.0F, 1, 1, 1, -0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 44, 105, 0.65F, 0.0F, -20.25F, 1, 1, 1, -0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 31, 106, 0.65F, 0.0F, -22.5F, 1, 1, 1, -0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 107, 0, 0.65F, 0.0F, -24.75F, 1, 1, 1, -0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 107, 18, 0.65F, 0.0F, -27.0F, 1, 1, 1, -0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 101, 22, 0.65F, 0.0F, -32.25F, 1, 1, 4, -0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 77, 153, 0.0F, 0.0F, -32.25F, 1, 1, 35, 0.001F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(1.5F, 2.15F, -36.8F);
		apac_chassis.addChild(bone5);
		

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, -0.4363F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 76, 0.65F, -1.0F, 0.0F, 1, 1, 35, -0.002F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 77, 0, 0.0F, -1.0F, 0.0F, 1, 1, 35, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, 0.4363F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 77, 36, -1.65F, -1.0F, 0.0F, 1, 1, 35, -0.002F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 77, 77, -1.0F, -1.0F, 0.0F, 1, 1, 35, 0.001F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(3.7F, -0.05F, -36.8F);
		apac_chassis.addChild(bone3);
		

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, 0.4363F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 112, -1.0F, 0.65F, 0.0F, 1, 1, 35, -0.001F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 96, 82, -1.0F, 0.0F, 22.0F, 1, 1, 1, 0.001F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 77, 94, -1.0F, 0.0F, 28.0F, 1, 1, 1, 0.001F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 7, 95, -1.0F, 0.0F, 25.0F, 1, 1, 1, 0.001F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 66, 98, -1.0F, 0.0F, 16.0F, 1, 1, 1, 0.001F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 97, 29, -1.0F, 0.0F, 19.0F, 1, 1, 1, 0.001F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 70, 98, -1.0F, 0.0F, 13.0F, 1, 1, 1, 0.001F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 93, 99, -1.0F, 0.0F, 10.0F, 1, 1, 1, 0.001F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 100, 28, -1.0F, 0.0F, 7.0F, 1, 1, 1, 0.001F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 80, 23, -1.0F, 0.0F, 31.0F, 1, 1, 5, 0.001F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 77, 92, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.001F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.0F, 0.0F, 22.0F);
		bone3.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, -0.4363F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 96, 80, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.002F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 94, 64, -1.0F, -1.0F, 6.0F, 1, 1, 1, 0.002F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 95, -1.0F, -1.0F, 3.0F, 1, 1, 1, 0.002F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 43, 98, -1.0F, -1.0F, -6.0F, 1, 1, 1, 0.002F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 93, 96, -1.0F, -1.0F, -3.0F, 1, 1, 1, 0.002F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 98, 69, -1.0F, -1.0F, -9.0F, 1, 1, 1, 0.002F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 6, 99, -1.0F, -1.0F, -12.0F, 1, 1, 1, 0.002F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 20, 100, -1.0F, -1.0F, -15.0F, 1, 1, 1, 0.002F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 18, 62, -1.0F, -1.0F, 9.0F, 1, 1, 5, 0.002F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 45, 112, -1.0F, -1.65F, 10.25F, 1, 1, 3, -0.001F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 43, 100, -1.0F, -1.65F, 8.0F, 1, 1, 1, -0.001F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 101, -1.0F, -1.65F, 5.75F, 1, 1, 1, -0.001F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 101, 6, -1.0F, -1.65F, 3.5F, 1, 1, 1, -0.001F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 101, 22, -1.0F, -1.65F, 1.25F, 1, 1, 1, -0.001F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 101, 72, -1.0F, -1.65F, -1.0F, 1, 1, 1, -0.001F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 15, 103, -1.0F, -1.65F, -3.25F, 1, 1, 1, -0.001F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 31, 103, -1.0F, -1.65F, -5.5F, 1, 1, 1, -0.001F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 104, 69, -1.0F, -1.65F, -7.75F, 1, 1, 1, -0.001F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 28, 105, -1.0F, -1.65F, -10.0F, 1, 1, 1, -0.001F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 105, 96, -1.0F, -1.65F, -12.25F, 1, 1, 1, -0.001F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 106, 99, -1.0F, -1.65F, -14.5F, 1, 1, 1, -0.001F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 107, 7, -1.0F, -1.65F, -16.75F, 1, 1, 1, -0.001F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 101, 0, -1.0F, -1.65F, -22.0F, 1, 1, 4, -0.001F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 231, 40, -0.8F, -1.2F, -17.2F, 1, 1, 27, -0.2F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 93, -1.0F, -1.0F, -22.0F, 1, 1, 5, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.7F, -0.05F, -36.8F);
		apac_chassis.addChild(bone4);
		

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(0.0F, 0.0F, 26.75F);
		bone4.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 0.0F, 0.4363F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 77, 113, 0.0F, -1.65F, 5.5F, 1, 1, 3, -0.001F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 87, 100, 0.0F, -1.65F, 3.25F, 1, 1, 1, -0.001F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 6, 101, 0.0F, -1.65F, 1.0F, 1, 1, 1, -0.001F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 101, 18, 0.0F, -1.65F, -1.25F, 1, 1, 1, -0.001F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 101, 68, 0.0F, -1.65F, -3.5F, 1, 1, 1, -0.001F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 87, 102, 0.0F, -1.65F, -5.75F, 1, 1, 1, -0.001F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 27, 103, 0.0F, -1.65F, -8.0F, 1, 1, 1, -0.001F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 104, 33, 0.0F, -1.65F, -10.25F, 1, 1, 1, -0.001F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 86, 104, 0.0F, -1.65F, -12.5F, 1, 1, 1, -0.001F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 105, 94, 0.0F, -1.65F, -14.75F, 1, 1, 1, -0.001F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 106, 56, 0.0F, -1.65F, -17.0F, 1, 1, 1, -0.001F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 107, 5, 0.0F, -1.65F, -19.25F, 1, 1, 1, -0.001F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 107, 16, 0.0F, -1.65F, -21.5F, 1, 1, 1, -0.001F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 101, 6, 0.0F, -1.65F, -26.75F, 1, 1, 4, -0.001F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 231, 115, -0.2F, -1.2F, -21.95F, 1, 1, 27, -0.2F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 87, 95, 0.0F, -1.0F, -4.75F, 1, 1, 1, 0.002F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 93, 94, 0.0F, -1.0F, 1.25F, 1, 1, 1, 0.002F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 95, 32, 0.0F, -1.0F, -1.75F, 1, 1, 1, 0.002F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 98, 33, 0.0F, -1.0F, -10.75F, 1, 1, 1, 0.002F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 97, 49, 0.0F, -1.0F, -7.75F, 1, 1, 1, 0.002F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 87, 98, 0.0F, -1.0F, -13.75F, 1, 1, 1, 0.002F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 9, 100, 0.0F, -1.0F, -16.75F, 1, 1, 1, 0.002F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 31, 100, 0.0F, -1.0F, -19.75F, 1, 1, 1, 0.002F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 80, 42, 0.0F, -1.0F, 4.25F, 1, 1, 5, 0.002F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 93, 85, 0.0F, -1.0F, -26.75F, 1, 1, 5, 0.0F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.0F, 0.0F, 22.0F);
		bone4.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 0.0F, -0.4363F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 96, 78, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.001F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 84, 94, 0.0F, 0.0F, 6.0F, 1, 1, 1, 0.001F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 95, 68, 0.0F, 0.0F, 3.0F, 1, 1, 1, 0.001F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 37, 98, 0.0F, 0.0F, -6.0F, 1, 1, 1, 0.001F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 97, 65, 0.0F, 0.0F, -3.0F, 1, 1, 1, 0.001F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 99, 0.0F, 0.0F, -9.0F, 1, 1, 1, 0.001F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 100, 12, 0.0F, 0.0F, -12.0F, 1, 1, 1, 0.001F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 37, 100, 0.0F, 0.0F, -15.0F, 1, 1, 1, 0.001F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 18, 83, 0.0F, 0.0F, 9.0F, 1, 1, 5, 0.001F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 77, 113, 0.0F, 0.65F, -22.0F, 1, 1, 35, -0.001F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 94, 0, 0.0F, 0.0F, -22.0F, 1, 1, 5, 0.001F, false));

		mdt_xrs_chassis = new QRenderer(this);
		mdt_xrs_chassis.setRotationPoint(-2.55F, -5.6F, -8.7F);
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 0, 93, -0.15F, 0.5F, 1.0F, 1, 4, 13, 0.001F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 154, 0, -0.15F, 0.05F, 1.0F, 1, 1, 13, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 40, 43, -0.15F, 1.75F, 13.5F, 1, 2, 2, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 67, 0, 0.0F, 0.0F, 14.0F, 1, 4, 3, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 9, 35, 0.0F, 1.0F, 17.0F, 1, 3, 2, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 37, 98, -0.2F, 0.3F, 18.8F, 1, 3, 4, -0.2F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 37, 90, 0.55F, 0.4F, 19.5F, 2, 1, 3, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 93, 99, -0.2F, 2.2F, 18.8F, 1, 2, 4, -0.201F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 0, 99, 2.3F, 2.2F, 18.8F, 1, 2, 4, -0.201F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 81, 84, 2.3F, 0.3F, 18.8F, 1, 3, 4, -0.2F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 154, 194, 0.05F, 6.8F, 25.0F, 3, 3, 25, -0.001F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 37, 152, 0.05F, 9.8F, 38.0F, 3, 2, 12, -0.001F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 32, 188, 0.05F, 1.8F, 32.0F, 3, 5, 18, -0.001F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 114, 53, 0.55F, 0.9F, 34.0F, 2, 1, 16, -0.002F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 37, 134, 0.55F, 0.9F, 32.0F, 2, 1, 12, 0.1F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 154, 125, -0.05F, 1.97F, 32.0F, 1, 1, 12, 0.1F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 154, 112, 2.15F, 1.97F, 32.0F, 1, 1, 12, 0.1F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 20, 30, 0.05F, 5.0F, 20.8F, 3, 1, 2, 0.051F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 27, 54, 0.55F, 4.0F, 18.5F, 2, 2, 1, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 24, 70, 0.55F, 3.35F, 14.5F, 2, 1, 4, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 104, 62, 0.55F, 4.0F, 12.4F, 2, 3, 2, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 85, 107, 0.55F, 3.5F, 12.4F, 2, 2, 2, 0.1F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 36, 70, 0.55F, 6.75F, 14.5F, 2, 1, 4, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 18, 0, 2.1F, 1.0F, 19.0F, 1, 3, 1, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 48, 60, 2.35F, 1.0F, 18.8F, 1, 3, 3, -0.1F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 101, 36, -0.15F, 4.0F, 1.0F, 2, 1, 3, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 99, 99, 1.1F, 3.999F, 0.999F, 2, 1, 3, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 77, 59, -0.35F, -0.0001F, -36.0F, 1, 2, 5, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 189, 112, -0.35F, -0.0001F, -17.0F, 1, 2, 19, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 93, 79, -0.35F, 0.2999F, 2.0F, 1, 1, 1, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 0, 93, 2.45F, 0.2999F, 2.0F, 1, 1, 1, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 154, 153, 2.45F, -0.0001F, -17.0F, 1, 2, 19, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 77, 92, 2.35F, 0.3499F, -31.0F, 1, 1, 14, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 77, 77, -0.25F, 0.3499F, -31.0F, 1, 1, 14, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 63, 59, 2.45F, 0.0F, -36.0F, 1, 2, 5, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 94, 8, 2.45F, 0.25F, -27.0F, 1, 1, 1, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 94, 16, -0.35F, 0.2499F, -27.0F, 1, 1, 1, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 94, 2, 2.45F, 0.25F, -22.0F, 1, 1, 1, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 94, 6, -0.35F, 0.2499F, -22.0F, 1, 1, 1, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 77, 16, 2.65F, -0.2F, -31.3F, 1, 1, 15, -0.201F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 77, 0, -0.55F, -0.2F, -31.3F, 1, 1, 15, -0.201F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 190, 194, 0.45F, 1.25F, -36.0F, 3, 1, 39, 0.001F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 82, 229, -0.35F, 1.25F, -36.0F, 1, 1, 39, 0.002F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 25, 107, -0.35F, 1.75F, 0.0F, 1, 1, 3, -0.001F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 60, 70, 0.45F, 1.75F, 0.0F, 3, 1, 3, -0.001F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 94, 18, 0.0F, 0.0F, 18.0F, 1, 1, 1, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 37, 112, 2.1F, 0.0F, 1.0F, 1, 4, 18, 0.0F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 37, 76, 2.35F, 0.0F, 1.0F, 1, 4, 18, -0.1F, false));
		mdt_xrs_chassis.cubeList.add(new ModelBox(mdt_xrs_chassis, 0, 188, 0.55F, 1.9F, -35.2F, 2, 1, 28, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(3.1F, 0.0F, 19.0F);
		mdt_xrs_chassis.addChild(cube_r39);
		setRotationAngle(cube_r39, -0.2967F, 0.0F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 103, 46, -0.65F, -0.1F, -0.2F, 1, 2, 3, -0.201F, false));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 25, 83, -0.8F, -0.2F, -0.2F, 1, 1, 4, -0.201F, false));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 64, 100, -3.3F, -0.2F, -0.2F, 1, 2, 4, -0.201F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(3.45F, 2.75F, 0.0F);
		mdt_xrs_chassis.addChild(cube_r40);
		setRotationAngle(cube_r40, 1.2741F, 0.0F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 87, 32, -3.0F, -2.0F, 0.0F, 3, 2, 1, -0.002F, false));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 11, 46, -3.8F, -2.0F, 0.0F, 1, 2, 1, -0.003F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-0.45F, 0.7F, -34.0F);
		mdt_xrs_chassis.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.2094F, 0.0F, 0.0F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 87, 93, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 94, 0, 3.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-0.45F, 0.7F, -15.0F);
		mdt_xrs_chassis.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.2094F, 0.0F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 93, 85, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 93, 92, 3.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(3.35F, 1.95F, 4.0F);
		mdt_xrs_chassis.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.2094F, 0.0F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 69, 90, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 84, 92, -3.6F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(3.35F, 1.95F, 14.0F);
		mdt_xrs_chassis.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.2094F, 0.0F, 0.0F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 26, 89, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 77, 92, -3.6F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(5.15F, 5.95F, 23.3F);
		mdt_xrs_chassis.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.2094F, 0.0F, 0.0F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 87, 86, -3.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r45.cubeList.add(new ModelBox(cube_r45, 87, 45, -3.0F, 6.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r45.cubeList.add(new ModelBox(cube_r45, 88, 38, -5.2F, 6.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r45.cubeList.add(new ModelBox(cube_r45, 88, 65, -5.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-0.05F, 8.95F, 33.7F);
		mdt_xrs_chassis.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.2094F, 0.0F, 0.0F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 52, 48, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 52, 40, 2.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-0.05F, 10.45F, 42.7F);
		mdt_xrs_chassis.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.2094F, 0.0F, 0.0F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 58, 70, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r47.cubeList.add(new ModelBox(cube_r47, 10, 62, 2.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-0.05F, 6.45F, 45.7F);
		mdt_xrs_chassis.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.2094F, 0.0F, 0.0F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 85, 29, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r48.cubeList.add(new ModelBox(cube_r48, 71, 73, 2.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(3.15F, 4.45F, 35.0F);
		mdt_xrs_chassis.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.2094F, 0.0F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 18, 86, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 87, 26, -3.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-0.45F, 0.7F, -2.0F);
		mdt_xrs_chassis.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.2094F, 0.0F, 0.0F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 93, 81, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 93, 87, 3.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(3.45F, 0.0F, -36.0F);
		mdt_xrs_chassis.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, 0.4712F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 42, 229, -1.0F, -0.0001F, 0.0F, 1, 1, 38, 0.0F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-0.35F, 0.0F, -36.0F);
		mdt_xrs_chassis.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, -0.4712F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 231, 76, 0.0F, -0.0001F, 0.0F, 1, 1, 38, 0.0F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(2.45F, 0.2999F, 3.0F);
		mdt_xrs_chassis.addChild(cube_r53);
		setRotationAngle(cube_r53, -0.2967F, 0.0F, 0.0F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 7, 93, 0.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 93, 77, -2.8F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(3.1F, 5.0F, 1.0F);
		mdt_xrs_chassis.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.192F, 0.0F, 0.0F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 70, 60, -1.0F, -3.0F, 0.0F, 1, 3, 1, -0.001F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 68, 79, -3.25F, -3.0F, 0.0F, 1, 3, 1, -0.001F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(3.1F, 5.0F, 1.0F);
		mdt_xrs_chassis.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.2278F, -0.5641F, -0.1233F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 44, 70, -1.0F, -3.1F, 0.0F, 1, 3, 1, -0.001F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(0.0F, 5.0F, 1.0F);
		mdt_xrs_chassis.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.2278F, 0.5641F, 0.1233F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 57, 79, 0.0F, -3.1F, 0.0F, 1, 3, 1, -0.001F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(1.0F, 5.0F, 0.4F);
		mdt_xrs_chassis.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.192F, 0.0F, 0.0F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 18, 45, 0.05F, -3.2F, 0.25F, 1, 3, 1, 0.2F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(3.1F, 5.0F, 4.0F);
		mdt_xrs_chassis.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.6109F, 0.0F, 0.0F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 40, 56, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.001F, false));
		cube_r58.cubeList.add(new ModelBox(cube_r58, 49, 56, -3.25F, -1.0F, 0.0F, 1, 1, 2, -0.001F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(0.55F, 6.0F, 19.5F);
		mdt_xrs_chassis.addChild(cube_r59);
		setRotationAngle(cube_r59, -0.5236F, 0.0F, 0.0F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 49, 29, 0.0F, 0.0F, -1.0F, 2, 2, 1, -0.001F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(0.55F, 7.75F, 14.5F);
		mdt_xrs_chassis.addChild(cube_r60);
		setRotationAngle(cube_r60, -0.4014F, 0.0F, 0.0F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 85, 72, 0.0F, -1.0F, -2.0F, 2, 1, 2, -0.001F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(0.55F, 4.35F, 15.0F);
		mdt_xrs_chassis.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.7854F, 0.0F, 0.0F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 8, 30, 0.0F, -1.0F, -1.0F, 2, 1, 1, -0.001F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(0.55F, 4.35F, 18.0F);
		mdt_xrs_chassis.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.7854F, 0.0F, 0.0F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 28, 30, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.001F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(2.8F, 4.0F, 19.5F);
		mdt_xrs_chassis.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, 0.1222F, 0.0F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 93, 107, -2.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(0.3F, 4.0F, 19.5F);
		mdt_xrs_chassis.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.0F, -0.1222F, 0.0F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 101, 108, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.001F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(0.05F, 4.0F, 21.0F);
		mdt_xrs_chassis.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.2182F, 0.0F, 0.0F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 26, 13, 0.0F, 9.0F, -0.6F, 3, 1, 1, 0.049F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 19, 0.0F, 2.0F, 0.0F, 3, 8, 3, 0.05F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 30, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 40, 35, 0.5F, -1.4F, 3.2F, 2, 3, 1, -0.201F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 77, 52, 0.0F, 6.0F, 4.0F, 3, 4, 3, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 18, 0, 0.0F, 1.0F, 0.0F, 3, 9, 4, 0.0F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(0.05F, 4.0F, 19.8F);
		mdt_xrs_chassis.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.7941F, 0.0F, 0.0F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 77, 72, 0.0F, 0.0F, 0.0F, 3, 2, 1, -0.001F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(3.05F, 3.6F, 23.0F);
		mdt_xrs_chassis.addChild(cube_r67);
		setRotationAngle(cube_r67, -0.1517F, 0.1449F, 0.7569F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 49, 4, -1.0F, 0.0F, -0.2F, 1, 1, 2, -0.001F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(0.05F, 3.6F, 23.0F);
		mdt_xrs_chassis.addChild(cube_r68);
		setRotationAngle(cube_r68, -0.1517F, -0.1449F, -0.7569F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 49, 21, 0.0F, 0.0F, -0.2F, 1, 1, 2, -0.001F, false));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(0.05F, 3.6F, 23.0F);
		mdt_xrs_chassis.addChild(cube_r69);
		setRotationAngle(cube_r69, -0.2094F, 0.0F, 0.0F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 18, 13, 0.0F, 0.0F, 0.0F, 3, 1, 2, -0.001F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(2.55F, 0.9F, 34.0F);
		mdt_xrs_chassis.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.0F, 0.0F, -0.4887F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 40, 0, -1.0F, 0.0F, 0.0F, 1, 1, 16, -0.003F, false));
		cube_r70.cubeList.add(new ModelBox(cube_r70, 114, 168, -0.95F, 0.08F, -2.0F, 1, 1, 12, 0.099F, false));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(0.55F, 0.9F, 32.0F);
		mdt_xrs_chassis.addChild(cube_r71);
		setRotationAngle(cube_r71, 0.0F, 0.0F, 0.4887F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 154, 174, -0.05F, 0.08F, 0.0F, 1, 1, 12, 0.099F, false));
		cube_r71.cubeList.add(new ModelBox(cube_r71, 40, 17, 0.0F, 0.0F, 2.0F, 1, 1, 16, -0.003F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(3.15F, 1.4F, 45.5F);
		mdt_xrs_chassis.addChild(cube_r72);
		setRotationAngle(cube_r72, -0.384F, 0.0F, 0.0F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 28, 0, -1.0F, 0.0F, 0.0F, 1, 2, 2, -0.001F, false));
		cube_r72.cubeList.add(new ModelBox(cube_r72, 40, 25, -3.2F, 0.0F, 0.0F, 1, 2, 2, -0.001F, false));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(0.05F, 11.8F, 38.0F);
		mdt_xrs_chassis.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.4189F, 0.0F, 0.0F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 32, 70, 0.0F, -3.0F, 0.0F, 3, 3, 1, -0.003F, false));

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(0.05F, 9.8F, 39.0F);
		mdt_xrs_chassis.addChild(cube_r74);
		setRotationAngle(cube_r74, -1.4835F, 0.0F, 0.0F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 77, 36, 0.0F, 0.0F, -1.0F, 3, 10, 1, -0.002F, false));

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(0.55F, 6.8F, 30.2F);
		mdt_xrs_chassis.addChild(cube_r75);
		setRotationAngle(cube_r75, 1.2915F, 0.0F, 0.0F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 40, 47, 0.0F, 0.0F, 5.0F, 2, 2, 1, -0.003F, false));
		cube_r75.cubeList.add(new ModelBox(cube_r75, 58, 25, -0.5F, 0.0F, 0.0F, 3, 2, 5, -0.003F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(0.05F, 6.8F, 26.9F);
		mdt_xrs_chassis.addChild(cube_r76);
		setRotationAngle(cube_r76, -0.7505F, 0.0F, 0.0F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 0, 70, 0.0F, 0.0F, -3.0F, 3, 2, 3, -0.002F, false));

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(0.05F, 6.8F, 29.0F);
		mdt_xrs_chassis.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.8378F, 0.0F, 0.0F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 12, 70, 0.0F, 0.0F, 0.0F, 3, 2, 3, -0.002F, false));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(3.1F, 0.5F, 22.6F);
		mdt_xrs_chassis.addChild(cube_r78);
		setRotationAngle(cube_r78, -0.6804F, -0.193F, 0.0669F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 47, 90, -0.8F, -0.2F, -0.2F, 1, 1, 3, -0.2F, false));
		cube_r78.cubeList.add(new ModelBox(cube_r78, 25, 62, -0.8F, 0.8F, 0.7F, 1, 2, 3, -0.201F, false));
		cube_r78.cubeList.add(new ModelBox(cube_r78, 27, 88, -0.8F, 0.4F, 0.3F, 1, 1, 3, -0.2F, false));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(3.1F, 0.5F, 22.6F);
		mdt_xrs_chassis.addChild(cube_r79);
		setRotationAngle(cube_r79, -1.3437F, -0.193F, 0.0669F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 58, 64, -0.8F, -1.8F, 1.9F, 1, 1, 3, -0.199F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(0.0F, 0.5F, 22.6F);
		mdt_xrs_chassis.addChild(cube_r80);
		setRotationAngle(cube_r80, -0.6804F, 0.193F, -0.0669F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 84, 59, -0.2F, 0.8F, 0.7F, 1, 2, 3, -0.201F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 103, 27, -0.2F, 0.4F, 0.3F, 1, 1, 3, -0.2F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 104, 104, -0.2F, -0.2F, -0.2F, 1, 1, 3, -0.2F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(0.0F, 0.5F, 22.6F);
		mdt_xrs_chassis.addChild(cube_r81);
		setRotationAngle(cube_r81, -1.3437F, 0.193F, -0.0669F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 103, 11, -0.2F, -1.8F, 1.9F, 1, 1, 3, -0.199F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(2.55F, 0.4F, 22.5F);
		mdt_xrs_chassis.addChild(cube_r82);
		setRotationAngle(cube_r82, -0.6898F, -0.1488F, 0.1217F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 40, 29, -0.82F, 0.0F, 0.8F, 1, 1, 2, -0.002F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(0.55F, 0.4F, 22.5F);
		mdt_xrs_chassis.addChild(cube_r83);
		setRotationAngle(cube_r83, -0.6898F, 0.1488F, -0.1217F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 40, 39, -0.18F, 0.0F, 0.8F, 1, 1, 2, -0.001F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.55F, 0.4F, 22.5F);
		mdt_xrs_chassis.addChild(cube_r84);
		setRotationAngle(cube_r84, -0.6807F, 0.0F, 0.0F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 10, 14, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(-0.15F, 3.75F, 15.5F);
		mdt_xrs_chassis.addChild(cube_r85);
		setRotationAngle(cube_r85, -1.0996F, 0.0F, 0.0F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 9, 19, -0.15F, -0.15F, -0.85F, 1, 2, 1, -0.151F, false));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(-0.15F, 1.75F, 15.5F);
		mdt_xrs_chassis.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.7156F, 0.0F, 0.0F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 29, 19, 0.15F, -2.15F, -1.15F, 1, 2, 1, 0.15F, false));

		boltactiongrabby = new QRenderer(this);
		boltactiongrabby.setRotationPoint(-2.25F, -6.3F, 10.05F);
		boltactiongrabby.cubeList.add(new ModelBox(boltactiongrabby, 44, 90, 0.05F, -0.4F, -1.75F, 1, 2, 1, -0.1F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(0.0F, 0.0F, 0.0F);
		boltactiongrabby.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0F, 0.0F, 0.8203F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 49, 10, 0.45F, 2.1F, -1.95F, 1, 2, 2, -0.301F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 49, 25, 0.25F, 2.1F, -1.95F, 1, 2, 2, -0.3F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 49, 17, -0.15F, 2.1F, -1.95F, 1, 2, 2, -0.3F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(0.2F, 0.2F, -0.5F);
		boltactiongrabby.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.2618F, 0.0F, 0.8203F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 30, 62, -0.15F, 0.8F, -1.55F, 1, 2, 1, -0.101F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(0.2F, 0.2F, -0.5F);
		boltactiongrabby.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.0F, 0.0F, 0.8203F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 77, 88, -0.15F, -0.6F, -1.25F, 1, 2, 1, -0.101F, false));

		boltaction = new QRenderer(this);
		boltaction.setRotationPoint(-1.5F, -7.2F, -4.85F);
		boltaction.cubeList.add(new ModelBox(boltaction, 0, 167, 0.0F, -0.1F, 0.0F, 1, 1, 13, -0.1F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 68, 76, 0.0F, -0.1F, 12.5F, 1, 1, 2, -0.15F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 117, 62, 0.0F, 0.4F, 13.8F, 1, 1, 1, 0.08F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 117, 60, 0.0F, 0.4F, 14.1F, 1, 1, 1, -0.1F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 48, 76, -0.55F, 0.45F, 12.5F, 1, 1, 2, -0.151F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 37, 76, 0.55F, 0.45F, 12.5F, 1, 1, 2, -0.151F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 57, 76, 0.0F, 1.0F, 12.5F, 1, 1, 2, -0.15F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 154, 91, -0.57F, 0.47F, 0.0F, 1, 1, 13, -0.099F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 154, 77, 0.57F, 0.47F, 0.0F, 1, 1, 13, -0.099F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 154, 35, 0.0F, 1.05F, 0.0F, 1, 1, 13, -0.1F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(0.9F, 1.95F, 0.0F);
		boltaction.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0F, 0.0F, -0.7854F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 154, 49, -0.1F, -0.9F, 0.0F, 1, 1, 13, -0.101F, false));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(0.1F, 1.95F, 0.0F);
		boltaction.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.0F, 0.0F, -0.7854F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 154, 14, -0.1F, -0.9F, 0.0F, 1, 1, 13, -0.101F, false));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(0.9F, 0.0F, 0.0F);
		boltaction.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.0F, 0.0F, 0.7854F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 82, 165, -0.1F, -0.1F, 0.0F, 1, 1, 13, -0.101F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(0.1F, 0.0F, 0.0F);
		boltaction.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.0F, 0.0F, 0.7854F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 37, 166, -0.1F, -0.1F, 0.0F, 1, 1, 13, -0.101F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(0.15F, 1.85F, 13.7F);
		boltaction.addChild(cube_r94);
		setRotationAngle(cube_r94, 0.0F, 0.0F, -0.7854F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 69, 70, -0.12F, -0.88F, -1.23F, 1, 1, 2, -0.122F, false));

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(0.85F, 1.85F, 13.7F);
		boltaction.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.0F, 0.0F, 0.7854F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 21, 70, -0.88F, -0.88F, -1.23F, 1, 1, 2, -0.122F, false));

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(0.85F, 0.05F, 13.7F);
		boltaction.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.0F, 0.0F, -0.7854F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 0, 76, -0.88F, -0.12F, -1.23F, 1, 1, 2, -0.122F, false));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(0.15F, 0.05F, 13.7F);
		boltaction.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.0F, 0.0F, 0.7854F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 18, 76, -0.12F, -0.12F, -1.23F, 1, 1, 2, -0.122F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		gun.render(f5);
//		mag_5rnd.render(f5);
//		mag_10rnd.render(f5);
		chassis.render(f5);
//		apac_chassis.render(f5);
//		mdt_xrs_chassis.render(f5);
//		boltactiongrabby.render(f5);
//		boltaction.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
