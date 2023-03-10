package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MP5A4Stock extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer reciever_upper;
	private final ModelRenderer bone19;
	private final ModelRenderer gun76_r1;
	private final ModelRenderer gun76_r2;
	private final ModelRenderer gun81_r1;
	private final ModelRenderer gun80_r1;
	private final ModelRenderer gun66_r1;
	private final ModelRenderer gun66_r2;
	private final ModelRenderer gun64_r1;
	private final ModelRenderer gun64_r2;
	private final ModelRenderer gun73_r1;
	private final ModelRenderer gun74_r1;
	private final ModelRenderer bone45;
	private final ModelRenderer gun62_r1;
	private final ModelRenderer gun61_r1;
	private final ModelRenderer gun60_r1;
	private final ModelRenderer gun59_r1;
	private final ModelRenderer gun64_r3;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun62_r2;
	private final ModelRenderer gun59_r2;
	private final ModelRenderer gun60_r2;
	private final ModelRenderer gun59_r3;
	private final ModelRenderer reciever_lower;
	private final ModelRenderer bone2;
	private final ModelRenderer gun34_r1;
	private final ModelRenderer gun34_r2;
	private final ModelRenderer gun13_r1;
	private final ModelRenderer gun33_r1;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun4_r1;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun8_r2;
	private final ModelRenderer gun7_r2;
	private final ModelRenderer gun25_r1;
	private final ModelRenderer gun24_r1;
	private final ModelRenderer gun25_r2;
	private final ModelRenderer bone18;
	private final ModelRenderer gun35_r1;
	private final ModelRenderer gun7_r3;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer gun25_r3;
	private final ModelRenderer gun26_r2;
	private final ModelRenderer handle_and_trigger;
	private final ModelRenderer gun238_r1;
	private final ModelRenderer gun240_r1;
	private final ModelRenderer gun239_r1;
	private final ModelRenderer gun238_r2;
	private final ModelRenderer gun237_r1;
	private final ModelRenderer bone62;
	private final ModelRenderer bone63;
	private final ModelRenderer mp5_standard_parts;
	private final ModelRenderer front_end_standard;
	private final ModelRenderer bone6;
	private final ModelRenderer gun62_r3;
	private final ModelRenderer gun75_r1;
	private final ModelRenderer gun74_r2;
	private final ModelRenderer gun76_r3;
	private final ModelRenderer gun75_r2;
	private final ModelRenderer gun78_r1;
	private final ModelRenderer gun63_r2;
	private final ModelRenderer gun76_r4;
	private final ModelRenderer gun75_r3;
	private final ModelRenderer gun77_r1;
	private final ModelRenderer gun76_r5;
	private final ModelRenderer bone9;
	private final ModelRenderer gun75_r4;
	private final ModelRenderer gun76_r6;
	private final ModelRenderer gun76_r7;
	private final ModelRenderer gun77_r2;
	private final ModelRenderer bone12;
	private final ModelRenderer gun76_r8;
	private final ModelRenderer gun75_r5;
	private final ModelRenderer gun77_r3;
	private final ModelRenderer gun76_r9;
	private final ModelRenderer bone14;
	private final ModelRenderer gun76_r10;
	private final ModelRenderer gun77_r4;
	private final ModelRenderer gun77_r5;
	private final ModelRenderer gun78_r2;
	private final ModelRenderer bone15;
	private final ModelRenderer gun77_r6;
	private final ModelRenderer gun78_r3;
	private final ModelRenderer gun78_r4;
	private final ModelRenderer gun79_r1;
	private final ModelRenderer bone13;
	private final ModelRenderer gun77_r7;
	private final ModelRenderer gun76_r11;
	private final ModelRenderer gun78_r5;
	private final ModelRenderer gun77_r8;
	private final ModelRenderer bone17;
	private final ModelRenderer bone16;
	private final ModelRenderer gun80_r2;
	private final ModelRenderer gun79_r2;
	private final ModelRenderer gun79_r3;
	private final ModelRenderer gun78_r6;
	private final ModelRenderer bone7;
	private final ModelRenderer gun75_r6;
	private final ModelRenderer gun74_r3;
	private final ModelRenderer gun76_r12;
	private final ModelRenderer gun75_r7;
	private final ModelRenderer bone4;
	private final ModelRenderer gun76_r13;
	private final ModelRenderer gun75_r8;
	private final ModelRenderer gun75_r9;
	private final ModelRenderer gun77_r9;
	private final ModelRenderer gun76_r14;
	private final ModelRenderer gun75_r10;
	private final ModelRenderer gun75_r11;
	private final ModelRenderer gun74_r4;
	private final ModelRenderer bone8;
	private final ModelRenderer gun74_r5;
	private final ModelRenderer gun75_r12;
	private final ModelRenderer gun73_r2;
	private final ModelRenderer gun74_r6;
	private final ModelRenderer mp5_navy_handguard;
	private final ModelRenderer gun34_r3;
	private final ModelRenderer bone10;
	private final ModelRenderer gun35_r2;
	private final ModelRenderer gun34_r4;
	private final ModelRenderer bone5;
	private final ModelRenderer gun36_r1;
	private final ModelRenderer gun35_r3;
	private final ModelRenderer bone11;
	private final ModelRenderer gun34_r5;
	private final ModelRenderer gun33_r2;
	private final ModelRenderer bone21;
	private final ModelRenderer gun35_r4;
	private final ModelRenderer gun34_r6;
	private final ModelRenderer mp5_blackmesa_handguard;
	private final ModelRenderer gun61_r2;
	private final ModelRenderer gun60_r3;
	private final ModelRenderer gun61_r3;
	private final ModelRenderer gun63_r3;
	private final ModelRenderer gun61_r4;
	private final ModelRenderer gun60_r4;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun60_r5;
	private final ModelRenderer mp5_a5_handguard;
	private final ModelRenderer gun63_r4;
	private final ModelRenderer gun61_r5;
	private final ModelRenderer gun63_r5;
	private final ModelRenderer gun62_r4;
	private final ModelRenderer gun61_r6;
	private final ModelRenderer gun62_r5;
	private final ModelRenderer gun64_r4;
	private final ModelRenderer gun62_r6;
	private final ModelRenderer gun61_r7;
	private final ModelRenderer gun62_r7;
	private final ModelRenderer gun61_r8;
	private final ModelRenderer gun66_r3;
	private final ModelRenderer gun64_r5;
	private final ModelRenderer gun68_r1;
	private final ModelRenderer mp5_mi_handguard;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
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
	private final ModelRenderer mp5_sd_handguard;
	private final ModelRenderer gun63_r6;
	private final ModelRenderer gun65_r1;
	private final ModelRenderer gun64_r6;
	private final ModelRenderer gun62_r8;
	private final ModelRenderer gun62_r9;
	private final ModelRenderer gun64_r7;
	private final ModelRenderer gun60_r6;
	private final ModelRenderer gun63_r7;
	private final ModelRenderer mp5_utg_tri_rail_handguard;
	private final ModelRenderer gun64_r8;
	private final ModelRenderer gun63_r8;
	private final ModelRenderer gun66_r4;
	private final ModelRenderer gun63_r9;
	private final ModelRenderer gun66_r5;
	private final ModelRenderer gun64_r9;
	private final ModelRenderer gun65_r2;
	private final ModelRenderer gun62_r10;
	private final ModelRenderer gun63_r10;
	private final ModelRenderer gun62_r11;
	private final ModelRenderer gun65_r3;
	private final ModelRenderer gun63_r11;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer mp5_stock;
	private final ModelRenderer gun168_r1;
	private final ModelRenderer gun167_r1;
	private final ModelRenderer gun167_r2;
	private final ModelRenderer gun166_r1;
	private final ModelRenderer gun153_r1;
	private final ModelRenderer gun154_r1;
	private final ModelRenderer gun153_r2;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun153_r3;
	private final ModelRenderer gun152_r2;
	private final ModelRenderer gun152_r3;
	private final ModelRenderer gun151_r1;
	private final ModelRenderer stock_mp5a5_connection2;
	private final ModelRenderer gun166_r2;
	private final ModelRenderer gun165_r1;
	private final ModelRenderer gun165_r2;
	private final ModelRenderer gun152_r4;
	private final ModelRenderer gun151_r2;
	private final ModelRenderer gun153_r4;
	private final ModelRenderer gun152_r5;
	private final ModelRenderer gun154_r2;
	private final ModelRenderer gun153_r5;
	private final ModelRenderer gun153_r6;
	private final ModelRenderer gun152_r6;
	private final ModelRenderer gun153_r7;
	private final ModelRenderer gun152_r7;
	private final ModelRenderer gun151_r3;
	private final ModelRenderer gun151_r4;
	private final ModelRenderer gun150_r1;
	private final ModelRenderer gun151_r5;
	private final ModelRenderer gun150_r2;
	private final ModelRenderer gun151_r6;
	private final ModelRenderer gun152_r8;
	private final ModelRenderer gun151_r7;
	private final ModelRenderer gun150_r3;
	private final ModelRenderer gun151_r8;
	private final ModelRenderer gun150_r4;
	private final ModelRenderer gun152_r9;
	private final ModelRenderer gun151_r9;
	private final ModelRenderer gun150_r5;
	private final ModelRenderer gun149_r1;
	private final ModelRenderer gun147_r1;
	private final ModelRenderer gun146_r1;
	private final ModelRenderer gun57_r1;
	private final ModelRenderer gun59_r4;
	private final ModelRenderer gun56_r1;
	private final ModelRenderer gun58_r2;
	private final ModelRenderer gun57_r2;
	private final ModelRenderer gun58_r3;
	private final ModelRenderer gun76_r15;
	private final ModelRenderer gun75_r13;
	private final ModelRenderer bone73;
	private final ModelRenderer gun148_r1;
	private final ModelRenderer gun148_r2;
	private final ModelRenderer bone74;
	private final ModelRenderer bone49;
	private final ModelRenderer bone47;
	private final ModelRenderer gun167_r3;
	private final ModelRenderer gun168_r2;
	private final ModelRenderer bone46;
	private final ModelRenderer gun166_r3;
	private final ModelRenderer gun167_r4;
	private final ModelRenderer bone48;
	private final ModelRenderer gun166_r4;
	private final ModelRenderer gun167_r5;
	private final ModelRenderer bone20;
	private final ModelRenderer gun165_r3;
	private final ModelRenderer gun166_r5;
	private final ModelRenderer mp5_stock_adapter;
	private final ModelRenderer stock_mp5a5_connection4;
	private final ModelRenderer gun167_r6;
	private final ModelRenderer gun166_r6;
	private final ModelRenderer gun166_r7;
	private final ModelRenderer gun153_r8;
	private final ModelRenderer gun152_r10;
	private final ModelRenderer gun154_r3;
	private final ModelRenderer gun153_r9;
	private final ModelRenderer gun155_r1;
	private final ModelRenderer gun154_r4;
	private final ModelRenderer gun154_r5;
	private final ModelRenderer gun153_r10;
	private final ModelRenderer gun154_r6;
	private final ModelRenderer gun153_r11;
	private final ModelRenderer gun152_r11;
	private final ModelRenderer gun152_r12;
	private final ModelRenderer gun151_r10;
	private final ModelRenderer gun152_r13;
	private final ModelRenderer gun151_r11;
	private final ModelRenderer gun152_r14;
	private final ModelRenderer gun153_r12;
	private final ModelRenderer gun152_r15;
	private final ModelRenderer gun151_r12;
	private final ModelRenderer gun152_r16;
	private final ModelRenderer gun151_r13;
	private final ModelRenderer gun153_r13;
	private final ModelRenderer gun152_r17;
	private final ModelRenderer gun151_r14;
	private final ModelRenderer gun150_r6;
	private final ModelRenderer gun148_r3;
	private final ModelRenderer gun147_r2;
	private final ModelRenderer gun58_r4;
	private final ModelRenderer gun60_r7;
	private final ModelRenderer gun57_r3;
	private final ModelRenderer gun59_r5;
	private final ModelRenderer gun58_r5;
	private final ModelRenderer gun59_r6;
	private final ModelRenderer gun77_r10;
	private final ModelRenderer gun76_r16;
	private final ModelRenderer bone3;
	private final ModelRenderer gun149_r2;
	private final ModelRenderer gun149_r3;
	private final ModelRenderer bone32;
	private final ModelRenderer mp5_competition_stock;
	private final ModelRenderer gun167_r7;
	private final ModelRenderer gun166_r8;
	private final ModelRenderer gun167_r8;
	private final ModelRenderer gun166_r9;
	private final ModelRenderer gun165_r4;
	private final ModelRenderer gun152_r18;
	private final ModelRenderer gun153_r14;
	private final ModelRenderer gun152_r19;
	private final ModelRenderer gun151_r15;
	private final ModelRenderer gun152_r20;
	private final ModelRenderer gun151_r16;
	private final ModelRenderer gun151_r17;
	private final ModelRenderer gun150_r7;
	private final ModelRenderer stock_mp5a5_connection3;
	private final ModelRenderer gun167_r9;
	private final ModelRenderer gun166_r10;
	private final ModelRenderer gun166_r11;
	private final ModelRenderer gun153_r15;
	private final ModelRenderer gun152_r21;
	private final ModelRenderer gun154_r7;
	private final ModelRenderer gun153_r16;
	private final ModelRenderer gun155_r2;
	private final ModelRenderer gun154_r8;
	private final ModelRenderer gun154_r9;
	private final ModelRenderer gun153_r17;
	private final ModelRenderer gun154_r10;
	private final ModelRenderer gun153_r18;
	private final ModelRenderer gun152_r22;
	private final ModelRenderer gun152_r23;
	private final ModelRenderer gun151_r18;
	private final ModelRenderer gun152_r24;
	private final ModelRenderer gun151_r19;
	private final ModelRenderer gun152_r25;
	private final ModelRenderer gun153_r19;
	private final ModelRenderer gun152_r26;
	private final ModelRenderer gun151_r20;
	private final ModelRenderer gun152_r27;
	private final ModelRenderer gun151_r21;
	private final ModelRenderer gun153_r20;
	private final ModelRenderer gun152_r28;
	private final ModelRenderer gun151_r22;
	private final ModelRenderer gun150_r8;
	private final ModelRenderer gun148_r4;
	private final ModelRenderer gun147_r3;
	private final ModelRenderer gun58_r6;
	private final ModelRenderer gun60_r8;
	private final ModelRenderer gun57_r4;
	private final ModelRenderer gun59_r7;
	private final ModelRenderer gun58_r7;
	private final ModelRenderer gun59_r8;
	private final ModelRenderer gun77_r11;
	private final ModelRenderer gun76_r17;
	private final ModelRenderer bone33;
	private final ModelRenderer gun149_r4;
	private final ModelRenderer gun149_r5;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer gun168_r3;
	private final ModelRenderer gun169_r1;
	private final ModelRenderer bone37;
	private final ModelRenderer gun167_r10;
	private final ModelRenderer gun168_r4;
	private final ModelRenderer bone38;
	private final ModelRenderer gun167_r11;
	private final ModelRenderer gun168_r5;
	private final ModelRenderer bone39;
	private final ModelRenderer gun166_r12;
	private final ModelRenderer gun167_r12;
	private final ModelRenderer mp5_a5_stock;
	private final ModelRenderer gun167_r13;
	private final ModelRenderer gun166_r13;
	private final ModelRenderer bone64;
	private final ModelRenderer bone65;
	private final ModelRenderer bone71;
	private final ModelRenderer gun154_r11;
	private final ModelRenderer gun155_r3;
	private final ModelRenderer gun154_r12;
	private final ModelRenderer gun153_r21;
	private final ModelRenderer gun155_r4;
	private final ModelRenderer bone72;
	private final ModelRenderer gun155_r5;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer gun155_r6;
	private final ModelRenderer gun154_r13;
	private final ModelRenderer gun156_r2;
	private final ModelRenderer bone67;
	private final ModelRenderer gun167_r14;
	private final ModelRenderer gun168_r6;
	private final ModelRenderer bone70;
	private final ModelRenderer gun168_r7;
	private final ModelRenderer gun169_r2;
	private final ModelRenderer bone69;
	private final ModelRenderer gun168_r8;
	private final ModelRenderer gun169_r3;
	private final ModelRenderer bone68;
	private final ModelRenderer gun168_r9;
	private final ModelRenderer gun169_r4;
	private final ModelRenderer bone66;
	private final ModelRenderer gun169_r5;
	private final ModelRenderer gun168_r10;
	private final ModelRenderer mp5_hogue_grip;
	private final ModelRenderer bone40;
	private final ModelRenderer gun240_r2;
	private final ModelRenderer gun240_r3;
	private final ModelRenderer magazine30;
	private final ModelRenderer bone23;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer bone26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer magazinedrum50;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer bone22;
	private final ModelRenderer bone27;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer bone30;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer bone31;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer action;
	private final ModelRenderer gun65_r4;
	private final ModelRenderer gun65_r5;
	private final ModelRenderer gun64_r10;
	private final ModelRenderer bolt;
	private final ModelRenderer action6_r1;
	private final ModelRenderer action5_r1;
	private final ModelRenderer action4_r1;
	private final ModelRenderer action3_r1;
	private final ModelRenderer action2;
	private final ModelRenderer action1;

	public MP5A4Stock() {
		textureWidth = 280;
		textureHeight = 300;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(-2.0F, -5.5F, -9.0F);
		

		reciever_upper = new ModelRenderer(this);
		reciever_upper.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(reciever_upper);
		

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.9846F, -8.9678F, -1.3F);
		reciever_upper.addChild(bone19);
		bone19.cubeList.add(new ModelBox(bone19, 27, 53, -0.4846F, 0.2678F, -12.7F, 1, 1, 25, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 82, 0, -0.0423F, -0.5621F, -11.7F, 1, 1, 23, -0.1F, false));
		bone19.cubeList.add(new ModelBox(bone19, 160, 221, -1.9269F, -0.5621F, -1.7F, 1, 1, 13, -0.1F, false));
		bone19.cubeList.add(new ModelBox(bone19, 83, 83, -0.2423F, -0.5621F, -9.7F, 1, 1, 22, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 82, 26, -0.9846F, -1.2322F, -9.7F, 1, 1, 22, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 54, 27, -0.9846F, -1.4322F, -11.7F, 1, 1, 10, -0.1F, false));
		bone19.cubeList.add(new ModelBox(bone19, 54, 131, -0.9846F, -1.6322F, -9.7F, 1, 1, 2, -0.2F, false));
		bone19.cubeList.add(new ModelBox(bone19, 0, 156, -0.9846F, -1.4322F, 1.05F, 1, 1, 5, -0.1F, false));
		bone19.cubeList.add(new ModelBox(bone19, 137, 97, -0.9846F, -1.5322F, -1.85F, 1, 1, 3, -0.1F, false));
		bone19.cubeList.add(new ModelBox(bone19, 216, 144, -1.5846F, 0.2678F, -1.7F, 1, 1, 14, 0.002F, false));
		bone19.cubeList.add(new ModelBox(bone19, 71, 137, -1.5846F, 0.2678F, -12.7F, 1, 1, 7, 0.002F, false));
		bone19.cubeList.add(new ModelBox(bone19, 213, 0, -1.7269F, -0.5621F, -1.7F, 1, 1, 14, 0.001F, false));
		bone19.cubeList.add(new ModelBox(bone19, 50, 159, -1.7269F, -0.5621F, -9.7F, 1, 1, 4, 0.001F, false));

		gun76_r1 = new ModelRenderer(this);
		gun76_r1.setRotationPoint(-1.0207F, -0.526F, -7.2F);
		bone19.addChild(gun76_r1);
		setRotationAngle(gun76_r1, 0.0F, 0.0F, -2.3051F);
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 92, 92, -0.4F, -0.4F, 1.0F, 1, 1, 5, -0.101F, false));
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 71, 159, -0.5F, -0.5F, -2.5F, 1, 1, 4, 0.0F, false));
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 213, 129, -0.5F, -0.5F, 5.5F, 1, 1, 14, 0.0F, false));

		gun76_r2 = new ModelRenderer(this);
		gun76_r2.setRotationPoint(-1.0291F, 0.5524F, -7.2F);
		bone19.addChild(gun76_r2);
		setRotationAngle(gun76_r2, 0.0F, 0.0F, -2.1935F);
		gun76_r2.cubeList.add(new ModelBox(gun76_r2, 27, 159, -0.5F, -0.5F, -2.5F, 1, 1, 4, 0.0F, false));
		gun76_r2.cubeList.add(new ModelBox(gun76_r2, 215, 18, -0.5F, -0.5F, 5.5F, 1, 1, 14, 0.0F, false));

		gun81_r1 = new ModelRenderer(this);
		gun81_r1.setRotationPoint(-0.4846F, -1.3822F, 0.825F);
		bone19.addChild(gun81_r1);
		setRotationAngle(gun81_r1, 0.1745F, 0.0F, 0.0F);
		gun81_r1.cubeList.add(new ModelBox(gun81_r1, 122, 26, -0.3F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));
		gun81_r1.cubeList.add(new ModelBox(gun81_r1, 122, 42, -0.7F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		gun80_r1 = new ModelRenderer(this);
		gun80_r1.setRotationPoint(-0.4846F, -1.3822F, -1.525F);
		bone19.addChild(gun80_r1);
		setRotationAngle(gun80_r1, -0.1745F, 0.0F, 0.0F);
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 122, 46, -0.3F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 116, 122, -0.7F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		gun66_r1 = new ModelRenderer(this);
		gun66_r1.setRotationPoint(-1.2769F, 0.4379F, -0.95F);
		bone19.addChild(gun66_r1);
		setRotationAngle(gun66_r1, 0.0F, 0.0F, 0.0524F);
		gun66_r1.cubeList.add(new ModelBox(gun66_r1, 120, 38, -0.6F, -0.3F, 0.0F, 1, 1, 1, -0.1F, false));
		gun66_r1.cubeList.add(new ModelBox(gun66_r1, 35, 120, -0.6F, -0.3F, -8.25F, 1, 1, 1, -0.1F, false));

		gun66_r2 = new ModelRenderer(this);
		gun66_r2.setRotationPoint(0.3077F, 0.4379F, -9.2F);
		bone19.addChild(gun66_r2);
		setRotationAngle(gun66_r2, 0.0F, 0.0F, -0.0524F);
		gun66_r2.cubeList.add(new ModelBox(gun66_r2, 123, 0, -0.4F, -0.3F, 0.0F, 1, 1, 1, -0.1F, false));
		gun66_r2.cubeList.add(new ModelBox(gun66_r2, 123, 2, -0.4F, -0.3F, 8.25F, 1, 1, 1, -0.1F, false));

		gun64_r1 = new ModelRenderer(this);
		gun64_r1.setRotationPoint(-1.5269F, 0.0379F, -8.7F);
		bone19.addChild(gun64_r1);
		setRotationAngle(gun64_r1, 0.0F, 0.0F, 0.1047F);
		gun64_r1.cubeList.add(new ModelBox(gun64_r1, 119, 53, -0.5F, -0.5F, -1.0F, 1, 1, 3, -0.1F, false));
		gun64_r1.cubeList.add(new ModelBox(gun64_r1, 44, 131, -0.5F, -0.5F, 7.25F, 1, 1, 2, -0.1F, false));

		gun64_r2 = new ModelRenderer(this);
		gun64_r2.setRotationPoint(0.5577F, 0.0379F, -0.45F);
		bone19.addChild(gun64_r2);
		setRotationAngle(gun64_r2, 0.0F, 0.0F, -0.1047F);
		gun64_r2.cubeList.add(new ModelBox(gun64_r2, 147, 96, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.1F, false));
		gun64_r2.cubeList.add(new ModelBox(gun64_r2, 147, 99, -0.5F, -0.5F, -9.25F, 1, 1, 2, -0.1F, false));

		gun73_r1 = new ModelRenderer(this);
		gun73_r1.setRotationPoint(0.0515F, -0.526F, -1.7F);
		bone19.addChild(gun73_r1);
		setRotationAngle(gun73_r1, 0.0F, 0.0F, 2.3051F);
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 0, 104, -0.5F, -0.5F, -8.0F, 1, 1, 22, 0.0F, false));

		gun74_r1 = new ModelRenderer(this);
		gun74_r1.setRotationPoint(0.0599F, 0.5524F, -1.7F);
		bone19.addChild(gun74_r1);
		setRotationAngle(gun74_r1, 0.0F, 0.0F, 2.1935F);
		gun74_r1.cubeList.add(new ModelBox(gun74_r1, 54, 104, -0.5F, -0.5F, -8.0F, 1, 1, 22, 0.0F, false));

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(1.732F, -5.7401F, -4.5818F);
		reciever_upper.addChild(bone45);
		bone45.cubeList.add(new ModelBox(bone45, 71, 129, -0.532F, -1.0099F, -3.4182F, 1, 2, 19, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 50, 127, -2.932F, -1.0099F, -3.4182F, 1, 2, 19, 0.0F, false));
		bone45.cubeList.add(new ModelBox(bone45, 67, 96, -1.732F, 1.2201F, -9.4182F, 1, 1, 5, 0.0F, false));

		gun62_r1 = new ModelRenderer(this);
		gun62_r1.setRotationPoint(-1.7265F, 2.2228F, -9.4182F);
		bone45.addChild(gun62_r1);
		setRotationAngle(gun62_r1, 0.0F, 0.0F, -2.5384F);
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 0, 26, 0.6445F, 0.0F, 0.0F, 1, 1, 25, -0.001F, false));
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 92, 139, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun61_r1 = new ModelRenderer(this);
		gun61_r1.setRotationPoint(-0.7375F, 2.2228F, -9.4182F);
		bone45.addChild(gun61_r1);
		setRotationAngle(gun61_r1, 0.0F, 0.0F, 2.5384F);
		gun61_r1.cubeList.add(new ModelBox(gun61_r1, 27, 27, -1.6445F, 0.0F, 0.0F, 1, 1, 25, -0.001F, false));
		gun61_r1.cubeList.add(new ModelBox(gun61_r1, 147, 88, -1.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun60_r1 = new ModelRenderer(this);
		gun60_r1.setRotationPoint(-3.4146F, -0.0654F, -9.4182F);
		bone45.addChild(gun60_r1);
		setRotationAngle(gun60_r1, 0.0F, 0.0F, 2.8875F);
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 0, 148, -1.0F, -1.4F, 0.0F, 1, 1, 7, -0.001F, false));
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 134, 147, -1.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, false));
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 131, 23, -0.9F, -1.5F, 6.1F, 1, 1, 19, -0.102F, false));

		gun59_r1 = new ModelRenderer(this);
		gun59_r1.setRotationPoint(-3.4146F, -0.0544F, -9.4182F);
		bone45.addChild(gun59_r1);
		setRotationAngle(gun59_r1, 0.0F, 0.0F, -2.8875F);
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 147, 116, -1.0F, 0.4F, 0.0F, 1, 1, 7, -0.001F, false));
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 147, 108, -1.0F, 0.0F, 0.0F, 1, 1, 7, 0.001F, false));
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 131, 0, -0.9F, 0.5F, 6.1F, 1, 1, 19, -0.102F, false));

		gun64_r3 = new ModelRenderer(this);
		gun64_r3.setRotationPoint(-1.232F, -2.7425F, 8.5818F);
		bone45.addChild(gun64_r3);
		setRotationAngle(gun64_r3, 0.0F, -0.5411F, 2.521F);
		gun64_r3.cubeList.add(new ModelBox(gun64_r3, 92, 130, -2.7F, -0.7063F, -8.0F, 1, 1, 2, -0.301F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-1.232F, -2.7425F, -9.4182F);
		bone45.addChild(gun63_r1);
		setRotationAngle(gun63_r1, 0.0F, 0.5411F, 2.521F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 130, 100, -2.7F, -0.7063F, 6.0F, 1, 1, 2, -0.301F, false));

		gun62_r2 = new ModelRenderer(this);
		gun62_r2.setRotationPoint(-1.232F, -2.7425F, -9.4182F);
		bone45.addChild(gun62_r2);
		setRotationAngle(gun62_r2, 0.0F, 0.0F, 2.521F);
		gun62_r2.cubeList.add(new ModelBox(gun62_r2, 93, 52, 1.55F, -0.7063F, 6.7F, 1, 1, 5, -0.3F, false));
		gun62_r2.cubeList.add(new ModelBox(gun62_r2, 126, 186, 0.25F, -1.0F, 11.0F, 2, 1, 14, -0.001F, false));
		gun62_r2.cubeList.add(new ModelBox(gun62_r2, 24, 118, 0.25F, -1.0F, 0.0F, 2, 1, 7, -0.001F, false));

		gun59_r2 = new ModelRenderer(this);
		gun59_r2.setRotationPoint(-1.232F, -2.7425F, -9.4182F);
		bone45.addChild(gun59_r2);
		setRotationAngle(gun59_r2, 0.0F, 0.0F, -2.521F);
		gun59_r2.cubeList.add(new ModelBox(gun59_r2, 0, 0, -2.25F, -1.0F, 0.0F, 2, 1, 25, -0.001F, false));

		gun60_r2 = new ModelRenderer(this);
		gun60_r2.setRotationPoint(0.9507F, -0.0654F, -9.3182F);
		bone45.addChild(gun60_r2);
		setRotationAngle(gun60_r2, 0.0F, 0.0F, -2.8875F);
		gun60_r2.cubeList.add(new ModelBox(gun60_r2, 92, 131, -0.1F, -1.5F, 6.0F, 1, 1, 19, -0.102F, false));
		gun60_r2.cubeList.add(new ModelBox(gun60_r2, 148, 136, 0.0F, -1.4F, -0.1F, 1, 1, 7, -0.001F, false));
		gun60_r2.cubeList.add(new ModelBox(gun60_r2, 148, 128, 0.0F, -1.0F, -0.1F, 1, 1, 7, 0.0F, false));

		gun59_r3 = new ModelRenderer(this);
		gun59_r3.setRotationPoint(0.9507F, -0.0544F, -9.5182F);
		bone45.addChild(gun59_r3);
		setRotationAngle(gun59_r3, 0.0F, 0.0F, 2.8875F);
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 134, 43, -0.1F, 0.5F, 6.2F, 1, 1, 19, -0.102F, false));
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 65, 150, 0.0F, 0.4F, 0.1F, 1, 1, 7, -0.001F, false));
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 151, 63, 0.0F, 0.0F, 0.1F, 1, 1, 7, 0.001F, false));

		reciever_lower = new ModelRenderer(this);
		reciever_lower.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(reciever_lower);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.4868F, -1.5125F, -1.2209F);
		reciever_lower.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 169, 138, -1.2868F, -1.9875F, 9.2209F, 2, 2, 3, 0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 216, 167, -1.2868F, -2.4875F, -2.2801F, 2, 5, 12, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 27, 59, -1.1848F, 1.2125F, 4.2199F, 2, 1, 1, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 54, 49, -1.1858F, 1.2125F, 3.7199F, 2, 1, 1, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 45, 49, -1.1858F, 0.0125F, 2.8199F, 2, 1, 1, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 39, 49, -1.1848F, 0.0125F, 3.3199F, 2, 1, 1, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 56, 0, -1.1838F, -2.1875F, -0.4801F, 2, 1, 9, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 162, 185, -0.2868F, -2.5875F, -2.7791F, 1, 1, 15, 0.002F, false));
		bone2.cubeList.add(new ModelBox(bone2, 100, 32, -0.0868F, -2.5875F, -3.0291F, 1, 5, 1, 0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 124, 98, 0.0132F, -0.6875F, -5.0791F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 118, 46, -0.1868F, -0.6875F, -4.1791F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 35, 118, 0.1132F, -0.6875F, -4.1791F, 1, 1, 1, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 104, 151, -0.0868F, 1.5125F, -4.0291F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 151, 63, -0.4368F, -3.8875F, -5.7791F, 1, 3, 18, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 12, 52, -2.5368F, -1.4865F, -4.7791F, 3, 4, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 65, 64, -1.0868F, -3.2875F, -9.4041F, 2, 4, 5, 0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 110, 120, -0.0868F, -3.2875F, -9.9041F, 1, 1, 1, -0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 11, 65, -2.8868F, -3.2875F, -9.4051F, 2, 4, 5, 0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 41, 120, -2.8868F, -3.2875F, -9.9041F, 1, 1, 1, -0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 67, 10, 0.3132F, -1.5875F, -6.9291F, 1, 3, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 82, 14, 0.3132F, 0.8125F, -6.9291F, 1, 1, 1, -0.3F, false));
		bone2.cubeList.add(new ModelBox(bone2, 54, 59, 0.3132F, -1.7875F, -9.1291F, 1, 1, 3, -0.301F, false));
		bone2.cubeList.add(new ModelBox(bone2, 87, 44, 0.3132F, -1.7875F, -9.7591F, 1, 1, 2, -0.302F, false));

		gun34_r1 = new ModelRenderer(this);
		gun34_r1.setRotationPoint(0.4132F, -1.7F, -2.8856F);
		bone2.addChild(gun34_r1);
		setRotationAngle(gun34_r1, 1.3756F, 0.0F, 0.0F);
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 82, 4, -0.5F, -0.5F, -0.8F, 1, 1, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 124, 100, -0.5F, -0.5F, -0.2F, 1, 1, 1, -0.001F, false));

		gun34_r2 = new ModelRenderer(this);
		gun34_r2.setRotationPoint(-1.8868F, -0.3306F, -6.6748F);
		bone2.addChild(gun34_r2);
		setRotationAngle(gun34_r2, 1.3756F, 0.0F, 0.0F);
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 54, 27, -1.0F, -0.5F, -1.8F, 1, 3, 1, -0.001F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 13, 0, -1.0F, -1.5F, -1.5F, 1, 4, 5, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 54, 53, 1.8F, -0.5F, -1.8F, 1, 3, 1, -0.001F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 13, 12, 1.8F, -1.5F, -1.5F, 1, 4, 5, 0.0F, false));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(-0.9868F, 0.1125F, -7.0291F);
		bone2.addChild(gun13_r1);
		setRotationAngle(gun13_r1, -0.2094F, 0.0F, 0.0F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 0, 65, -2.0F, -2.7F, -1.33F, 1, 3, 3, 0.0F, false));

		gun33_r1 = new ModelRenderer(this);
		gun33_r1.setRotationPoint(-1.6368F, 1.314F, -7.0655F);
		bone2.addChild(gun33_r1);
		setRotationAngle(gun33_r1, 1.2273F, 0.0F, 0.0F);
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 13, 9, -1.551F, -2.7F, -0.5F, 4, 1, 1, -0.201F, false));
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 43, 11, -1.551F, -2.3F, -0.5F, 4, 5, 1, -0.2F, false));
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 14, 119, 1.851F, -2.7005F, -0.5007F, 1, 1, 1, -0.201F, false));
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 101, 6, 1.851F, -2.3F, -0.5007F, 1, 5, 1, -0.2F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(-0.9868F, 0.1125F, -7.6291F);
		bone2.addChild(gun12_r1);
		setRotationAngle(gun12_r1, -0.1047F, 0.0F, 0.0F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 131, 36, 1.2F, -0.7F, -1.83F, 1, 1, 2, 0.0F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(-1.8868F, -2.7324F, -10.0141F);
		bone2.addChild(gun11_r1);
		setRotationAngle(gun11_r1, -0.7418F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 54, 70, -1.0F, -0.4991F, -0.4F, 2, 1, 2, 0.0F, false));
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 82, 31, 0.8F, -0.5F, -0.4F, 2, 1, 2, 0.0F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(0.6132F, 1.5995F, -3.4727F);
		bone2.addChild(gun7_r1);
		setRotationAngle(gun7_r1, 0.2182F, 0.0F, 0.0F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 10, 119, -0.5F, -0.2F, -0.5F, 1, 1, 1, -0.1F, false));
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 111, 123, -0.7F, -0.2F, -0.5F, 1, 1, 1, -0.001F, false));

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(1.0632F, 1.4125F, 5.7209F);
		bone2.addChild(gun4_r1);
		setRotationAngle(gun4_r1, -0.192F, 0.0F, 0.0F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 131, 26, -1.0F, -2.0F, 0.0F, 1, 1, 2, -0.101F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(1.1632F, 0.9125F, 4.7209F);
		bone2.addChild(gun3_r1);
		setRotationAngle(gun3_r1, -0.3142F, 0.0F, 0.0F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 0, 127, -1.0F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(0.4132F, 0.0125F, 3.2209F);
		bone2.addChild(gun8_r1);
		setRotationAngle(gun8_r1, 0.7156F, 0.0F, 0.0F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 23, 131, -0.299F, 2.0F, -0.301F, 1, 1, 2, -0.4F, false));

		gun8_r2 = new ModelRenderer(this);
		gun8_r2.setRotationPoint(0.4132F, 0.0125F, 3.2209F);
		bone2.addChild(gun8_r2);
		setRotationAngle(gun8_r2, -0.8203F, 0.0F, 0.0F);
		gun8_r2.cubeList.add(new ModelBox(gun8_r2, 131, 13, -0.299F, -2.6F, -0.401F, 1, 1, 2, -0.4F, false));

		gun7_r2 = new ModelRenderer(this);
		gun7_r2.setRotationPoint(0.4132F, 0.0125F, 3.2209F);
		bone2.addChild(gun7_r2);
		setRotationAngle(gun7_r2, 0.2269F, 0.0F, 0.0F);
		gun7_r2.cubeList.add(new ModelBox(gun7_r2, 131, 23, -0.299F, 0.3F, 0.299F, 1, 1, 2, -0.4F, false));

		gun25_r1 = new ModelRenderer(this);
		gun25_r1.setRotationPoint(0.2132F, 0.9658F, 9.5344F);
		bone2.addChild(gun25_r1);
		setRotationAngle(gun25_r1, 1.1781F, 0.0F, 0.0F);
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 0, 83, -1.5F, -0.5F, -1.5F, 2, 1, 2, -0.0015F, false));

		gun24_r1 = new ModelRenderer(this);
		gun24_r1.setRotationPoint(0.2132F, 0.3125F, 9.9709F);
		bone2.addChild(gun24_r1);
		setRotationAngle(gun24_r1, 0.7854F, 0.0F, 0.0F);
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 6, 75, -1.5F, -0.5F, -0.5F, 2, 1, 1, -0.0025F, false));

		gun25_r2 = new ModelRenderer(this);
		gun25_r2.setRotationPoint(0.2132F, -0.124F, 10.6242F);
		bone2.addChild(gun25_r2);
		setRotationAngle(gun25_r2, 0.3927F, 0.0F, 0.0F);
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 90, 20, -1.5F, -0.5F, -0.5F, 2, 1, 2, -0.0015F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-0.4868F, -1.5125F, -1.2209F);
		reciever_lower.addChild(bone18);
		bone18.cubeList.add(new ModelBox(bone18, 169, 128, -0.7132F, -1.9875F, 9.2209F, 2, 2, 3, 0.001F, false));
		bone18.cubeList.add(new ModelBox(bone18, 48, 109, -0.7132F, -2.4885F, -2.2791F, 2, 5, 12, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 107, 123, -0.9632F, 0.0125F, 4.7209F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 130, 88, -0.7132F, -2.5875F, -2.7791F, 1, 1, 15, 0.002F, false));
		bone18.cubeList.add(new ModelBox(bone18, 75, 63, -0.9132F, -2.5875F, -3.0291F, 1, 5, 1, 0.001F, false));
		bone18.cubeList.add(new ModelBox(bone18, 103, 123, -1.0132F, -0.6875F, -4.0791F, 1, 1, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 148, 128, -0.9132F, 1.5125F, -4.0291F, 1, 1, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 66, 150, -0.5632F, -3.8875F, -5.7791F, 1, 3, 18, 0.0F, false));

		gun35_r1 = new ModelRenderer(this);
		gun35_r1.setRotationPoint(-0.4132F, -1.7F, -2.8856F);
		bone18.addChild(gun35_r1);
		setRotationAngle(gun35_r1, 1.3756F, 0.0F, 0.0F);
		gun35_r1.cubeList.add(new ModelBox(gun35_r1, 123, 83, -0.5F, -0.5F, -0.8F, 1, 1, 1, 0.0F, false));
		gun35_r1.cubeList.add(new ModelBox(gun35_r1, 123, 85, -0.5F, -0.5F, -0.2F, 1, 1, 1, -0.001F, false));

		gun7_r3 = new ModelRenderer(this);
		gun7_r3.setRotationPoint(-0.4132F, 1.5995F, -3.4727F);
		bone18.addChild(gun7_r3);
		setRotationAngle(gun7_r3, 0.2182F, 0.0F, 0.0F);
		gun7_r3.cubeList.add(new ModelBox(gun7_r3, 99, 123, -0.5F, -0.2F, -0.5F, 1, 1, 1, -0.001F, false));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(-0.2132F, 0.9658F, 9.5344F);
		bone18.addChild(gun26_r1);
		setRotationAngle(gun26_r1, 1.1781F, 0.0F, 0.0F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 71, 59, -0.5F, -0.5F, -1.5F, 2, 1, 2, -0.001F, false));

		gun25_r3 = new ModelRenderer(this);
		gun25_r3.setRotationPoint(-0.2132F, 0.3125F, 9.9709F);
		bone18.addChild(gun25_r3);
		setRotationAngle(gun25_r3, 0.7854F, 0.0F, 0.0F);
		gun25_r3.cubeList.add(new ModelBox(gun25_r3, 66, 49, -0.5F, -0.5F, -0.5F, 2, 1, 1, -0.002F, false));

		gun26_r2 = new ModelRenderer(this);
		gun26_r2.setRotationPoint(-0.2132F, -0.124F, 10.6242F);
		bone18.addChild(gun26_r2);
		setRotationAngle(gun26_r2, 0.3927F, 0.0F, 0.0F);
		gun26_r2.cubeList.add(new ModelBox(gun26_r2, 82, 20, -0.5F, -0.5F, -0.5F, 2, 1, 2, -0.001F, false));

		handle_and_trigger = new ModelRenderer(this);
		handle_and_trigger.setRotationPoint(0.5F, 3.9581F, 4.1225F);
		gun.addChild(handle_and_trigger);
		handle_and_trigger.cubeList.add(new ModelBox(handle_and_trigger, 44, 141, -1.0F, 0.367F, -5.5431F, 2, 1, 4, 0.001F, false));

		gun238_r1 = new ModelRenderer(this);
		gun238_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		handle_and_trigger.addChild(gun238_r1);
		setRotationAngle(gun238_r1, 0.48F, 0.0F, 0.0F);
		gun238_r1.cubeList.add(new ModelBox(gun238_r1, 7, 156, -1.0F, -0.5F, -2.0F, 2, 1, 4, -0.001F, false));

		gun240_r1 = new ModelRenderer(this);
		gun240_r1.setRotationPoint(-0.5F, -1.896F, -1.5292F);
		handle_and_trigger.addChild(gun240_r1);
		setRotationAngle(gun240_r1, -0.1484F, 0.0F, 0.0F);
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 112, 49, 0.0F, -2.0F, -1.0F, 1, 2, 1, 0.001F, false));

		gun239_r1 = new ModelRenderer(this);
		gun239_r1.setRotationPoint(-0.5F, -1.896F, -1.5292F);
		handle_and_trigger.addChild(gun239_r1);
		setRotationAngle(gun239_r1, -0.3578F, 0.0F, 0.0F);
		gun239_r1.cubeList.add(new ModelBox(gun239_r1, 10, 113, 0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun238_r2 = new ModelRenderer(this);
		gun238_r2.setRotationPoint(0.0F, -1.696F, -8.6293F);
		handle_and_trigger.addChild(gun238_r2);
		setRotationAngle(gun238_r2, 0.2356F, 0.0F, 0.0F);
		gun238_r2.cubeList.add(new ModelBox(gun238_r2, 65, 79, -1.0F, -3.0F, -0.5F, 2, 4, 1, -0.2F, false));

		gun237_r1 = new ModelRenderer(this);
		gun237_r1.setRotationPoint(0.0F, -1.596F, -6.2293F);
		handle_and_trigger.addChild(gun237_r1);
		setRotationAngle(gun237_r1, 0.3927F, 0.0F, 0.0F);
		gun237_r1.cubeList.add(new ModelBox(gun237_r1, 26, 79, -1.0F, -3.0F, -0.5F, 2, 6, 1, 0.0F, false));

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(0.5F, -0.2979F, 3.6701F);
		handle_and_trigger.addChild(bone62);
		setRotationAngle(bone62, -0.9909F, 0.0F, 0.0F);
		bone62.cubeList.add(new ModelBox(bone62, 227, 51, -1.4997F, -2.1712F, -3.5039F, 2, 1, 11, 0.0F, false));
		bone62.cubeList.add(new ModelBox(bone62, 219, 204, -1.891F, -1.3762F, -4.5046F, 3, 2, 12, 0.0F, false));
		bone62.cubeList.add(new ModelBox(bone62, 176, 223, -2.108F, -1.3778F, -4.5039F, 1, 2, 12, 0.0F, false));

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(0.0F, 1.367F, 2.4569F);
		handle_and_trigger.addChild(bone63);
		setRotationAngle(bone63, -1.1396F, 0.0F, 0.0F);
		bone63.cubeList.add(new ModelBox(bone63, 216, 185, -1.3915F, -2.2941F, -5.5004F, 3, 3, 12, 0.0F, false));
		bone63.cubeList.add(new ModelBox(bone63, 43, 223, -1.6085F, -2.2934F, -5.5014F, 1, 3, 12, 0.0F, false));
		bone63.cubeList.add(new ModelBox(bone63, 227, 33, -1.0F, 0.5F, -5.5F, 2, 1, 11, 0.0F, false));
		bone63.cubeList.add(new ModelBox(bone63, 0, 21, -1.525F, 0.7F, 5.5F, 3, 1, 1, 0.0F, false));

		mp5_standard_parts = new ModelRenderer(this);
		mp5_standard_parts.setRotationPoint(2.0F, 29.5F, 9.0F);
		gun.addChild(mp5_standard_parts);
		

		front_end_standard = new ModelRenderer(this);
		front_end_standard.setRotationPoint(0.0F, 0.0F, 0.0F);
		mp5_standard_parts.addChild(front_end_standard);
		

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-1.0443F, -38.6598F, -35.25F);
		front_end_standard.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 141, 67, -1.6981F, -0.3701F, -1.75F, 1, 1, 3, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 141, 33, -0.9557F, -1.0402F, -1.75F, 1, 1, 3, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 141, 10, -0.2134F, -0.3701F, -1.75F, 1, 1, 3, 0.001F, false));

		gun62_r3 = new ModelRenderer(this);
		gun62_r3.setRotationPoint(-0.2494F, 0.1299F, -2.9445F);
		bone6.addChild(gun62_r3);
		setRotationAngle(gun62_r3, 0.0F, 0.3927F, 0.0F);
		gun62_r3.cubeList.add(new ModelBox(gun62_r3, 13, 123, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));

		gun75_r1 = new ModelRenderer(this);
		gun75_r1.setRotationPoint(-0.2787F, 0.0638F, -2.9445F);
		bone6.addChild(gun75_r1);
		setRotationAngle(gun75_r1, 0.0F, -0.3927F, 2.3051F);
		gun75_r1.cubeList.add(new ModelBox(gun75_r1, 123, 18, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));

		gun74_r2 = new ModelRenderer(this);
		gun74_r2.setRotationPoint(0.0804F, -0.334F, -0.25F);
		bone6.addChild(gun74_r2);
		setRotationAngle(gun74_r2, 0.0F, 0.0F, 2.3051F);
		gun74_r2.cubeList.add(new ModelBox(gun74_r2, 141, 23, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		gun76_r3 = new ModelRenderer(this);
		gun76_r3.setRotationPoint(-0.3466F, 0.4318F, -2.9445F);
		bone6.addChild(gun76_r3);
		setRotationAngle(gun76_r3, 0.3927F, 0.0F, 2.1935F);
		gun76_r3.cubeList.add(new ModelBox(gun76_r3, 123, 30, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));

		gun75_r2 = new ModelRenderer(this);
		gun75_r2.setRotationPoint(0.0888F, 0.7444F, -12.75F);
		bone6.addChild(gun75_r2);
		setRotationAngle(gun75_r2, 0.0F, 0.0F, 2.1935F);
		gun75_r2.cubeList.add(new ModelBox(gun75_r2, 31, 141, -0.5F, -0.5F, 11.0F, 1, 1, 3, 0.0F, false));

		gun78_r1 = new ModelRenderer(this);
		gun78_r1.setRotationPoint(-0.4557F, -0.0042F, -2.9445F);
		bone6.addChild(gun78_r1);
		setRotationAngle(gun78_r1, 0.3927F, 0.0F, 0.0F);
		gun78_r1.cubeList.add(new ModelBox(gun78_r1, 35, 123, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));

		gun63_r2 = new ModelRenderer(this);
		gun63_r2.setRotationPoint(-0.6621F, 0.1299F, -2.9445F);
		bone6.addChild(gun63_r2);
		setRotationAngle(gun63_r2, 0.0F, -0.3927F, 0.0F);
		gun63_r2.cubeList.add(new ModelBox(gun63_r2, 39, 123, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));

		gun76_r4 = new ModelRenderer(this);
		gun76_r4.setRotationPoint(-0.6328F, 0.0638F, -2.9445F);
		bone6.addChild(gun76_r4);
		setRotationAngle(gun76_r4, 0.0F, 0.3927F, -2.3051F);
		gun76_r4.cubeList.add(new ModelBox(gun76_r4, 123, 39, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));

		gun75_r3 = new ModelRenderer(this);
		gun75_r3.setRotationPoint(-0.9919F, -0.334F, -0.25F);
		bone6.addChild(gun75_r3);
		setRotationAngle(gun75_r3, 0.0F, 0.0F, -2.3051F);
		gun75_r3.cubeList.add(new ModelBox(gun75_r3, 141, 71, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		gun77_r1 = new ModelRenderer(this);
		gun77_r1.setRotationPoint(-0.5649F, 0.4318F, -2.9445F);
		bone6.addChild(gun77_r1);
		setRotationAngle(gun77_r1, 0.3927F, 0.0F, -2.1935F);
		gun77_r1.cubeList.add(new ModelBox(gun77_r1, 123, 63, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));

		gun76_r5 = new ModelRenderer(this);
		gun76_r5.setRotationPoint(-1.0003F, 0.7444F, -12.75F);
		bone6.addChild(gun76_r5);
		setRotationAngle(gun76_r5, 0.0F, 0.0F, -2.1935F);
		gun76_r5.cubeList.add(new ModelBox(gun76_r5, 56, 142, -0.5F, -0.5F, 11.0F, 1, 1, 3, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-1.5F, -38.5826F, -38.85F);
		front_end_standard.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 134, 147, -1.2423F, -0.4473F, -1.0F, 1, 1, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 147, 119, -0.5F, -1.1174F, -1.0F, 1, 1, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 147, 108, 0.2423F, -0.4473F, -1.0F, 1, 1, 2, 0.0F, false));

		gun75_r4 = new ModelRenderer(this);
		gun75_r4.setRotationPoint(0.5361F, -0.4112F, -0.5F);
		bone9.addChild(gun75_r4);
		setRotationAngle(gun75_r4, 0.0F, 0.0F, 2.3051F);
		gun75_r4.cubeList.add(new ModelBox(gun75_r4, 147, 111, -0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));

		gun76_r6 = new ModelRenderer(this);
		gun76_r6.setRotationPoint(0.5445F, 0.6672F, -13.0F);
		bone9.addChild(gun76_r6);
		setRotationAngle(gun76_r6, 0.0F, 0.0F, 2.1935F);
		gun76_r6.cubeList.add(new ModelBox(gun76_r6, 147, 116, -0.5F, -0.5F, 12.0F, 1, 1, 2, 0.0F, false));

		gun76_r7 = new ModelRenderer(this);
		gun76_r7.setRotationPoint(-0.5361F, -0.4112F, -0.5F);
		bone9.addChild(gun76_r7);
		setRotationAngle(gun76_r7, 0.0F, 0.0F, -2.3051F);
		gun76_r7.cubeList.add(new ModelBox(gun76_r7, 0, 148, -0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));

		gun77_r2 = new ModelRenderer(this);
		gun77_r2.setRotationPoint(-0.5445F, 0.6672F, -13.0F);
		bone9.addChild(gun77_r2);
		setRotationAngle(gun77_r2, 0.0F, 0.0F, -2.1935F);
		gun77_r2.cubeList.add(new ModelBox(gun77_r2, 65, 148, -0.5F, -0.5F, 12.0F, 1, 1, 2, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-1.0728F, -38.6457F, -38.15F);
		front_end_standard.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 108, 151, -0.3334F, -0.3683F, -5.0F, 1, 1, 6, -0.099F, false));
		bone12.cubeList.add(new ModelBox(bone12, 147, 96, -1.5211F, -0.3683F, -5.0F, 1, 1, 6, -0.099F, false));
		bone12.cubeList.add(new ModelBox(bone12, 151, 71, -0.9272F, -0.9043F, -5.0F, 1, 1, 6, -0.098F, false));
		bone12.cubeList.add(new ModelBox(bone12, 38, 66, -0.9272F, 0.2957F, -5.0F, 1, 1, 6, -0.098F, false));

		gun76_r8 = new ModelRenderer(this);
		gun76_r8.setRotationPoint(-0.8561F, -0.2394F, 0.0F);
		bone12.addChild(gun76_r8);
		setRotationAngle(gun76_r8, 0.0F, 0.0F, -2.3051F);
		gun76_r8.cubeList.add(new ModelBox(gun76_r8, 109, 58, -0.5F, -0.5F, -5.0F, 1, 1, 6, -0.1F, false));

		gun75_r5 = new ModelRenderer(this);
		gun75_r5.setRotationPoint(0.0017F, -0.2394F, 0.0F);
		bone12.addChild(gun75_r5);
		setRotationAngle(gun75_r5, 0.0F, 0.0F, 2.3051F);
		gun75_r5.cubeList.add(new ModelBox(gun75_r5, 152, 0, -0.5F, -0.5F, -5.0F, 1, 1, 6, -0.1F, false));

		gun77_r3 = new ModelRenderer(this);
		gun77_r3.setRotationPoint(-0.8629F, 0.6233F, 0.0F);
		bone12.addChild(gun77_r3);
		setRotationAngle(gun77_r3, 0.0F, 0.0F, -2.1935F);
		gun77_r3.cubeList.add(new ModelBox(gun77_r3, 130, 79, -0.5F, -0.5F, -5.0F, 1, 1, 6, -0.1F, false));

		gun76_r9 = new ModelRenderer(this);
		gun76_r9.setRotationPoint(0.0084F, 0.6233F, 0.0F);
		bone12.addChild(gun76_r9);
		setRotationAngle(gun76_r9, 0.0F, 0.0F, 2.1935F);
		gun76_r9.cubeList.add(new ModelBox(gun76_r9, 152, 7, -0.5F, -0.5F, -5.0F, 1, 1, 6, -0.1F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-1.5F, -38.5826F, -41.85F);
		front_end_standard.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 151, 71, -1.2423F, -0.4473F, -1.0F, 1, 1, 2, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 124, 115, -0.5F, -2.1174F, -1.0F, 1, 2, 2, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 151, 20, 0.2423F, -0.4473F, -1.0F, 1, 1, 2, 0.0F, false));

		gun76_r10 = new ModelRenderer(this);
		gun76_r10.setRotationPoint(0.5361F, -0.4112F, -0.5F);
		bone14.addChild(gun76_r10);
		setRotationAngle(gun76_r10, 0.0F, 0.0F, 2.3051F);
		gun76_r10.cubeList.add(new ModelBox(gun76_r10, 65, 151, -0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));

		gun77_r4 = new ModelRenderer(this);
		gun77_r4.setRotationPoint(0.5445F, 0.6672F, -13.0F);
		bone14.addChild(gun77_r4);
		setRotationAngle(gun77_r4, 0.0F, 0.0F, 2.1935F);
		gun77_r4.cubeList.add(new ModelBox(gun77_r4, 151, 65, -0.5F, -0.5F, 12.0F, 1, 1, 2, 0.0F, false));

		gun77_r5 = new ModelRenderer(this);
		gun77_r5.setRotationPoint(-0.5361F, -0.4112F, -0.5F);
		bone14.addChild(gun77_r5);
		setRotationAngle(gun77_r5, 0.0F, 0.0F, -2.3051F);
		gun77_r5.cubeList.add(new ModelBox(gun77_r5, 151, 74, -0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));

		gun78_r2 = new ModelRenderer(this);
		gun78_r2.setRotationPoint(-0.5445F, 0.6672F, -13.0F);
		bone14.addChild(gun78_r2);
		setRotationAngle(gun78_r2, 0.0F, 0.0F, -2.1935F);
		gun78_r2.cubeList.add(new ModelBox(gun78_r2, 151, 78, -0.5F, -0.5F, 12.0F, 1, 1, 2, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-1.5F, -35.5826F, -41.85F);
		front_end_standard.addChild(bone15);
		bone15.cubeList.add(new ModelBox(bone15, 149, 104, -1.2423F, -0.4473F, -1.0F, 1, 1, 2, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 54, 38, -0.5F, -2.6174F, -1.0F, 1, 4, 2, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 46, 53, -0.5F, -2.6174F, 2.0F, 1, 3, 2, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 148, 131, 0.2423F, -0.4473F, -1.0F, 1, 1, 2, 0.0F, false));

		gun77_r6 = new ModelRenderer(this);
		gun77_r6.setRotationPoint(0.5361F, -0.4112F, -0.5F);
		bone15.addChild(gun77_r6);
		setRotationAngle(gun77_r6, 0.0F, 0.0F, 2.3051F);
		gun77_r6.cubeList.add(new ModelBox(gun77_r6, 148, 136, -0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));

		gun78_r3 = new ModelRenderer(this);
		gun78_r3.setRotationPoint(0.5445F, 0.6672F, -13.0F);
		bone15.addChild(gun78_r3);
		setRotationAngle(gun78_r3, 0.0F, 0.0F, 2.1935F);
		gun78_r3.cubeList.add(new ModelBox(gun78_r3, 148, 139, -0.5F, -0.5F, 12.0F, 1, 1, 2, 0.0F, false));

		gun78_r4 = new ModelRenderer(this);
		gun78_r4.setRotationPoint(-0.5361F, -0.4112F, -0.5F);
		bone15.addChild(gun78_r4);
		setRotationAngle(gun78_r4, 0.0F, 0.0F, -2.3051F);
		gun78_r4.cubeList.add(new ModelBox(gun78_r4, 134, 150, -0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));

		gun79_r1 = new ModelRenderer(this);
		gun79_r1.setRotationPoint(-0.5445F, 0.6672F, -13.0F);
		bone15.addChild(gun79_r1);
		setRotationAngle(gun79_r1, 0.0F, 0.0F, -2.1935F);
		gun79_r1.cubeList.add(new ModelBox(gun79_r1, 0, 151, -0.5F, -0.5F, 12.0F, 1, 1, 2, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-1.0728F, -35.6457F, -39.15F);
		front_end_standard.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 0, 148, -0.3334F, -0.3683F, -2.0F, 1, 1, 19, -0.1F, false));
		bone13.cubeList.add(new ModelBox(bone13, 113, 147, -1.5211F, -0.3683F, -2.0F, 1, 1, 19, -0.1F, false));
		bone13.cubeList.add(new ModelBox(bone13, 147, 88, -0.9272F, -0.9043F, -2.0F, 1, 1, 19, -0.1F, false));
		bone13.cubeList.add(new ModelBox(bone13, 78, 106, -0.9272F, 0.2957F, -2.0F, 1, 1, 19, -0.1F, false));

		gun77_r7 = new ModelRenderer(this);
		gun77_r7.setRotationPoint(-0.8561F, -0.2394F, 0.0F);
		bone13.addChild(gun77_r7);
		setRotationAngle(gun77_r7, 0.0F, 0.0F, -2.3051F);
		gun77_r7.cubeList.add(new ModelBox(gun77_r7, 44, 148, -0.5F, -0.5F, -2.0F, 1, 1, 19, -0.1F, false));

		gun76_r11 = new ModelRenderer(this);
		gun76_r11.setRotationPoint(0.0017F, -0.2394F, 0.0F);
		bone13.addChild(gun76_r11);
		setRotationAngle(gun76_r11, 0.0F, 0.0F, 2.3051F);
		gun76_r11.cubeList.add(new ModelBox(gun76_r11, 148, 108, -0.5F, -0.5F, -2.0F, 1, 1, 19, -0.1F, false));

		gun78_r5 = new ModelRenderer(this);
		gun78_r5.setRotationPoint(-0.8629F, 0.6233F, 0.0F);
		bone13.addChild(gun78_r5);
		setRotationAngle(gun78_r5, 0.0F, 0.0F, -2.1935F);
		gun78_r5.cubeList.add(new ModelBox(gun78_r5, 148, 128, -0.5F, -0.5F, -2.0F, 1, 1, 19, -0.1F, false));

		gun77_r8 = new ModelRenderer(this);
		gun77_r8.setRotationPoint(0.0084F, 0.6233F, 0.0F);
		bone13.addChild(gun77_r8);
		setRotationAngle(gun77_r8, 0.0F, 0.0F, 2.1935F);
		gun77_r8.cubeList.add(new ModelBox(gun77_r8, 134, 148, -0.5F, -0.5F, -2.0F, 1, 1, 19, -0.1F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-1.5F, -35.4929F, -44.1F);
		front_end_standard.addChild(bone17);
		

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-1.5F, -35.5826F, -45.85F);
		front_end_standard.addChild(bone16);
		bone16.cubeList.add(new ModelBox(bone16, 78, 106, -1.2071F, -0.4103F, -5.0F, 1, 1, 8, 0.001F, false));
		bone16.cubeList.add(new ModelBox(bone16, 107, 92, -0.5F, -1.1174F, -5.0F, 1, 1, 8, 0.002F, false));
		bone16.cubeList.add(new ModelBox(bone16, 107, 0, -0.5F, 0.2968F, -5.0F, 1, 1, 8, 0.002F, false));
		bone16.cubeList.add(new ModelBox(bone16, 107, 9, 0.2071F, -0.4103F, -5.0F, 1, 1, 8, 0.001F, false));

		gun80_r2 = new ModelRenderer(this);
		gun80_r2.setRotationPoint(-0.5F, 0.5897F, 0.0F);
		bone16.addChild(gun80_r2);
		setRotationAngle(gun80_r2, 0.0F, 0.0F, 0.7854F);
		gun80_r2.cubeList.add(new ModelBox(gun80_r2, 106, 24, -0.5F, -0.5F, -5.0F, 1, 1, 8, 0.0F, false));

		gun79_r2 = new ModelRenderer(this);
		gun79_r2.setRotationPoint(-0.5F, -0.4103F, 0.0F);
		bone16.addChild(gun79_r2);
		setRotationAngle(gun79_r2, 0.0F, 0.0F, 0.7854F);
		gun79_r2.cubeList.add(new ModelBox(gun79_r2, 99, 106, -0.5F, -0.5F, -5.0F, 1, 1, 8, 0.0F, false));

		gun79_r3 = new ModelRenderer(this);
		gun79_r3.setRotationPoint(0.5F, 0.5897F, 0.0F);
		bone16.addChild(gun79_r3);
		setRotationAngle(gun79_r3, 0.0F, 0.0F, -0.7854F);
		gun79_r3.cubeList.add(new ModelBox(gun79_r3, 106, 33, -0.5F, -0.5F, -5.0F, 1, 1, 8, 0.0F, false));

		gun78_r6 = new ModelRenderer(this);
		gun78_r6.setRotationPoint(0.5F, -0.4103F, 0.0F);
		bone16.addChild(gun78_r6);
		setRotationAngle(gun78_r6, 0.0F, 0.0F, -0.7854F);
		gun78_r6.cubeList.add(new ModelBox(gun78_r6, 107, 83, -0.5F, -0.5F, -5.0F, 1, 1, 8, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.0443F, -38.6598F, -29.75F);
		front_end_standard.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 109, 67, -0.9557F, -0.9902F, -4.25F, 1, 1, 8, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 24, 109, -1.6981F, -0.3701F, -4.25F, 1, 1, 8, 0.0F, false));

		gun75_r6 = new ModelRenderer(this);
		gun75_r6.setRotationPoint(-0.9919F, -0.284F, -0.25F);
		bone7.addChild(gun75_r6);
		setRotationAngle(gun75_r6, 0.0F, 0.0F, -2.3051F);
		gun75_r6.cubeList.add(new ModelBox(gun75_r6, 0, 113, -0.5F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));

		gun74_r3 = new ModelRenderer(this);
		gun74_r3.setRotationPoint(0.0804F, -0.284F, -0.25F);
		bone7.addChild(gun74_r3);
		setRotationAngle(gun74_r3, 0.0F, 0.0F, 2.3051F);
		gun74_r3.cubeList.add(new ModelBox(gun74_r3, 78, 115, -0.5F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));

		gun76_r12 = new ModelRenderer(this);
		gun76_r12.setRotationPoint(-1.0003F, 0.7444F, -0.25F);
		bone7.addChild(gun76_r12);
		setRotationAngle(gun76_r12, 0.0F, 0.0F, -2.1935F);
		gun76_r12.cubeList.add(new ModelBox(gun76_r12, 109, 49, -0.5F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));

		gun75_r7 = new ModelRenderer(this);
		gun75_r7.setRotationPoint(0.0888F, 0.7444F, 1.25F);
		bone7.addChild(gun75_r7);
		setRotationAngle(gun75_r7, 0.0F, 0.0F, 2.1935F);
		gun75_r7.cubeList.add(new ModelBox(gun75_r7, 0, 12, -0.5F, -0.5F, -5.5F, 1, 1, 11, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.0443F, -38.6598F, -24.25F);
		front_end_standard.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 124, 49, -0.0134F, -0.5701F, 0.45F, 1, 1, 1, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 57, 226, 0.1866F, 0.0299F, -10.95F, 1, 1, 12, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 54, 53, 0.1866F, -0.7701F, -10.5F, 1, 1, 10, -0.4F, false));
		bone4.cubeList.add(new ModelBox(bone4, 42, 124, -0.0134F, -0.1701F, 0.45F, 1, 1, 1, -0.2F, false));

		gun76_r13 = new ModelRenderer(this);
		gun76_r13.setRotationPoint(0.2781F, -0.425F, 0.7418F);
		bone4.addChild(gun76_r13);
		setRotationAngle(gun76_r13, -0.5672F, 0.0F, 2.3051F);
		gun76_r13.cubeList.add(new ModelBox(gun76_r13, 66, 74, -0.5F, -0.5F, -0.5F, 2, 1, 1, -0.198F, false));

		gun75_r8 = new ModelRenderer(this);
		gun75_r8.setRotationPoint(0.3629F, -0.3485F, -10.55F);
		bone4.addChild(gun75_r8);
		setRotationAngle(gun75_r8, 0.0F, 0.0F, 2.3051F);
		gun75_r8.cubeList.add(new ModelBox(gun75_r8, 124, 58, -0.5F, -0.5F, 11.0F, 1, 1, 1, -0.2F, false));
		gun75_r8.cubeList.add(new ModelBox(gun75_r8, 0, 75, -0.5F, -0.5F, 8.6F, 2, 1, 1, -0.2F, false));

		gun75_r9 = new ModelRenderer(this);
		gun75_r9.setRotationPoint(0.5041F, -0.3557F, -12.6F);
		bone4.addChild(gun75_r9);
		setRotationAngle(gun75_r9, 0.0F, 0.0F, 2.3051F);
		gun75_r9.cubeList.add(new ModelBox(gun75_r9, 54, 74, -0.5008F, -0.5005F, 10.999F, 2, 1, 1, -0.3F, false));

		gun77_r9 = new ModelRenderer(this);
		gun77_r9.setRotationPoint(0.0598F, -0.7568F, -1.3911F);
		bone4.addChild(gun77_r9);
		setRotationAngle(gun77_r9, -0.5672F, 0.0F, 2.3051F);
		gun77_r9.cubeList.add(new ModelBox(gun77_r9, 72, 49, -0.5F, -0.6F, -0.5F, 2, 1, 1, -0.299F, false));

		gun76_r14 = new ModelRenderer(this);
		gun76_r14.setRotationPoint(0.3102F, -0.5307F, -1.1761F);
		bone4.addChild(gun76_r14);
		setRotationAngle(gun76_r14, -0.5672F, 0.0F, 2.3051F);
		gun76_r14.cubeList.add(new ModelBox(gun76_r14, 38, 73, -0.5F, -0.5F, -0.5F, 2, 1, 1, -0.298F, false));

		gun75_r10 = new ModelRenderer(this);
		gun75_r10.setRotationPoint(0.0719F, -0.7458F, 0.3888F);
		bone4.addChild(gun75_r10);
		setRotationAngle(gun75_r10, -0.5672F, 0.0F, 2.3051F);
		gun75_r10.cubeList.add(new ModelBox(gun75_r10, 60, 74, -0.5F, -0.55F, -0.5F, 2, 1, 1, -0.299F, false));

		gun75_r11 = new ModelRenderer(this);
		gun75_r11.setRotationPoint(0.0659F, -0.6165F, -10.65F);
		bone4.addChild(gun75_r11);
		setRotationAngle(gun75_r11, 0.0F, 0.0F, 2.3051F);
		gun75_r11.cubeList.add(new ModelBox(gun75_r11, 16, 124, -0.5007F, -0.5F, 11.0F, 1, 1, 1, -0.2F, false));
		gun75_r11.cubeList.add(new ModelBox(gun75_r11, 124, 53, -0.5F, -0.5F, 11.1F, 1, 1, 1, -0.201F, false));
		gun75_r11.cubeList.add(new ModelBox(gun75_r11, 124, 89, -0.5F, -0.5F, 8.7F, 1, 1, 1, -0.201F, false));

		gun74_r4 = new ModelRenderer(this);
		gun74_r4.setRotationPoint(0.0515F, -0.899F, -12.55F);
		bone4.addChild(gun74_r4);
		setRotationAngle(gun74_r4, 0.0F, 0.0F, 2.3051F);
		gun74_r4.cubeList.add(new ModelBox(gun74_r4, 31, 152, -0.5F, -0.5F, 11.0F, 1, 1, 3, -0.4F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-1.5111F, -38.3865F, -23.5F);
		front_end_standard.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 144, 46, 0.2534F, -0.6435F, 0.5F, 1, 1, 3, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 91, 83, -0.4889F, -1.3135F, -2.5F, 1, 1, 6, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 10, 87, -1.2312F, -0.6435F, -2.5F, 1, 1, 6, 0.0F, false));

		gun74_r5 = new ModelRenderer(this);
		gun74_r5.setRotationPoint(-0.525F, -0.6073F, 0.0F);
		bone8.addChild(gun74_r5);
		setRotationAngle(gun74_r5, 0.0F, 0.0F, -2.3051F);
		gun74_r5.cubeList.add(new ModelBox(gun74_r5, 36, 89, -0.5F, -0.5F, -2.5F, 1, 1, 6, 0.0F, false));

		gun75_r12 = new ModelRenderer(this);
		gun75_r12.setRotationPoint(-0.5334F, 0.471F, 0.0F);
		bone8.addChild(gun75_r12);
		setRotationAngle(gun75_r12, 0.0F, 0.0F, -2.1935F);
		gun75_r12.cubeList.add(new ModelBox(gun75_r12, 64, 89, -0.5F, -0.5F, -2.5F, 1, 1, 6, 0.0F, false));

		gun73_r2 = new ModelRenderer(this);
		gun73_r2.setRotationPoint(0.5472F, -0.6073F, 1.5F);
		bone8.addChild(gun73_r2);
		setRotationAngle(gun73_r2, 0.0F, 0.0F, 2.3051F);
		gun73_r2.cubeList.add(new ModelBox(gun73_r2, 144, 56, -0.5F, -0.5F, -1.0F, 1, 1, 3, 0.0F, false));

		gun74_r6 = new ModelRenderer(this);
		gun74_r6.setRotationPoint(0.5557F, 0.471F, 1.5F);
		bone8.addChild(gun74_r6);
		setRotationAngle(gun74_r6, 0.0F, 0.0F, 2.1935F);
		gun74_r6.cubeList.add(new ModelBox(gun74_r6, 44, 146, -0.5F, -0.5F, -1.0F, 1, 1, 3, 0.0F, false));

		mp5_navy_handguard = new ModelRenderer(this);
		mp5_navy_handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		mp5_navy_handguard.cubeList.add(new ModelBox(mp5_navy_handguard, 109, 46, -3.0F, -37.5F, -39.8F, 3, 2, 19, 0.0F, false));

		gun34_r3 = new ModelRenderer(this);
		gun34_r3.setRotationPoint(-4.6F, -34.4F, -30.2F);
		mp5_navy_handguard.addChild(gun34_r3);
		setRotationAngle(gun34_r3, -0.2618F, 0.0F, 0.0F);
		gun34_r3.cubeList.add(new ModelBox(gun34_r3, 119, 18, 1.5F, -0.5F, -9.5F, 1, 1, 1, 0.0F, false));
		gun34_r3.cubeList.add(new ModelBox(gun34_r3, 120, 29, 3.7F, -0.5F, -9.5F, 1, 1, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-0.2025F, -36.9129F, -30.3F);
		mp5_navy_handguard.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, -0.3054F);
		bone10.cubeList.add(new ModelBox(bone10, 189, 76, -0.5F, -0.5F, -7.5F, 1, 2, 17, 0.002F, false));
		bone10.cubeList.add(new ModelBox(bone10, 152, 20, -0.5F, 1.5F, 3.5F, 1, 1, 6, 0.001F, false));
		bone10.cubeList.add(new ModelBox(bone10, 169, 133, -0.5F, 1.0F, -0.5F, 1, 1, 4, 0.001F, false));

		gun35_r2 = new ModelRenderer(this);
		gun35_r2.setRotationPoint(0.0F, 1.9958F, 0.0002F);
		bone10.addChild(gun35_r2);
		setRotationAngle(gun35_r2, -0.0934F, -0.0475F, -0.469F);
		gun35_r2.cubeList.add(new ModelBox(gun35_r2, 109, 58, -0.7775F, -1.4029F, -9.5F, 1, 2, 2, 0.0F, false));

		gun34_r4 = new ModelRenderer(this);
		gun34_r4.setRotationPoint(0.0F, 1.9958F, 0.0002F);
		bone10.addChild(gun34_r4);
		setRotationAngle(gun34_r4, -0.1047F, 0.0F, 0.0F);
		gun34_r4.cubeList.add(new ModelBox(gun34_r4, 209, 96, -0.5F, -0.5F, -7.5F, 1, 1, 17, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-2.7975F, -36.9129F, -30.3F);
		mp5_navy_handguard.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.3054F);
		bone5.cubeList.add(new ModelBox(bone5, 61, 189, -0.5F, -0.5F, -7.5F, 1, 2, 17, 0.002F, false));
		bone5.cubeList.add(new ModelBox(bone5, 65, 79, -0.5F, 1.5F, 3.5F, 1, 1, 6, 0.001F, false));
		bone5.cubeList.add(new ModelBox(bone5, 159, 71, -0.5F, 1.0F, -0.5F, 1, 1, 4, 0.001F, false));

		gun36_r1 = new ModelRenderer(this);
		gun36_r1.setRotationPoint(0.0F, 1.9958F, 0.0002F);
		bone5.addChild(gun36_r1);
		setRotationAngle(gun36_r1, -0.0934F, 0.0475F, 0.469F);
		gun36_r1.cubeList.add(new ModelBox(gun36_r1, 0, 104, -0.2225F, -1.4029F, -9.5F, 1, 2, 2, 0.0F, false));

		gun35_r3 = new ModelRenderer(this);
		gun35_r3.setRotationPoint(0.0F, 1.9958F, 0.0002F);
		bone5.addChild(gun35_r3);
		setRotationAngle(gun35_r3, -0.1047F, 0.0F, 0.0F);
		gun35_r3.cubeList.add(new ModelBox(gun35_r3, 197, 186, -0.5F, -0.5F, -7.5F, 1, 1, 17, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-1.5F, -32.6977F, -30.5527F);
		mp5_navy_handguard.addChild(bone11);
		setRotationAngle(bone11, -0.1047F, 0.0F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 0, 127, -1.0F, -1.5F, -9.5F, 2, 2, 19, 0.0F, false));

		gun34_r5 = new ModelRenderer(this);
		gun34_r5.setRotationPoint(1.6279F, -1.3223F, 0.0F);
		bone11.addChild(gun34_r5);
		setRotationAngle(gun34_r5, -0.0262F, 0.0175F, -1.1781F);
		gun34_r5.cubeList.add(new ModelBox(gun34_r5, 125, 126, -1.0F, -1.5F, -9.5F, 2, 2, 19, 0.0F, false));

		gun33_r2 = new ModelRenderer(this);
		gun33_r2.setRotationPoint(0.9886F, -0.2184F, 0.0274F);
		bone11.addChild(gun33_r2);
		setRotationAngle(gun33_r2, -0.0192F, 0.0262F, -0.7854F);
		gun33_r2.cubeList.add(new ModelBox(gun33_r2, 23, 131, -0.5F, -1.5F, -9.5F, 1, 2, 19, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-1.5F, -32.6977F, -30.5527F);
		mp5_navy_handguard.addChild(bone21);
		setRotationAngle(bone21, -0.1047F, 0.0F, 0.0F);
		

		gun35_r4 = new ModelRenderer(this);
		gun35_r4.setRotationPoint(-1.6279F, -1.3223F, 0.0F);
		bone21.addChild(gun35_r4);
		setRotationAngle(gun35_r4, -0.0262F, -0.0175F, 1.1781F);
		gun35_r4.cubeList.add(new ModelBox(gun35_r4, 124, 105, -1.0F, -1.5F, -9.5F, 2, 2, 19, 0.0F, false));

		gun34_r6 = new ModelRenderer(this);
		gun34_r6.setRotationPoint(-0.9886F, -0.2184F, 0.0274F);
		bone21.addChild(gun34_r6);
		setRotationAngle(gun34_r6, -0.0192F, -0.0262F, 0.7854F);
		gun34_r6.cubeList.add(new ModelBox(gun34_r6, 130, 67, -0.5F, -1.5F, -9.5F, 1, 2, 19, 0.0F, false));

		mp5_blackmesa_handguard = new ModelRenderer(this);
		mp5_blackmesa_handguard.setRotationPoint(0.0F, 24.0F, -17.0F);
		mp5_blackmesa_handguard.cubeList.add(new ModelBox(mp5_blackmesa_handguard, 200, 205, -2.0F, -34.02F, -23.0F, 1, 1, 17, 0.0F, false));

		gun61_r2 = new ModelRenderer(this);
		gun61_r2.setRotationPoint(-1.5F, -37.9827F, -23.0F);
		mp5_blackmesa_handguard.addChild(gun61_r2);
		setRotationAngle(gun61_r2, 0.0F, 0.0F, 2.521F);
		gun61_r2.cubeList.add(new ModelBox(gun61_r2, 175, 22, 0.25F, -1.0F, 0.0F, 2, 1, 17, -0.001F, false));

		gun60_r3 = new ModelRenderer(this);
		gun60_r3.setRotationPoint(-3.6827F, -35.2945F, -23.0F);
		mp5_blackmesa_handguard.addChild(gun60_r3);
		setRotationAngle(gun60_r3, 0.0F, 0.0F, -2.8875F);
		gun60_r3.cubeList.add(new ModelBox(gun60_r3, 209, 78, -1.0F, 0.4F, 0.0F, 1, 1, 17, -0.001F, false));
		gun60_r3.cubeList.add(new ModelBox(gun60_r3, 76, 209, -1.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, false));

		gun61_r3 = new ModelRenderer(this);
		gun61_r3.setRotationPoint(-3.6827F, -35.3055F, -23.0F);
		mp5_blackmesa_handguard.addChild(gun61_r3);
		setRotationAngle(gun61_r3, 0.0F, 0.0F, 2.8875F);
		gun61_r3.cubeList.add(new ModelBox(gun61_r3, 208, 59, -1.0F, -1.4F, 0.0F, 1, 1, 17, -0.001F, false));
		gun61_r3.cubeList.add(new ModelBox(gun61_r3, 57, 208, -1.0F, -1.0F, 0.0F, 1, 1, 17, 0.0F, false));

		gun63_r3 = new ModelRenderer(this);
		gun63_r3.setRotationPoint(-1.9945F, -33.0173F, -23.0F);
		mp5_blackmesa_handguard.addChild(gun63_r3);
		setRotationAngle(gun63_r3, 0.0F, 0.0F, -2.5384F);
		gun63_r3.cubeList.add(new ModelBox(gun63_r3, 19, 208, 0.6445F, 0.0F, 0.0F, 1, 1, 17, -0.001F, false));
		gun63_r3.cubeList.add(new ModelBox(gun63_r3, 137, 206, 0.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, false));

		gun61_r4 = new ModelRenderer(this);
		gun61_r4.setRotationPoint(-1.0055F, -33.0173F, -23.0F);
		mp5_blackmesa_handguard.addChild(gun61_r4);
		setRotationAngle(gun61_r4, 0.0F, 0.0F, 2.5384F);
		gun61_r4.cubeList.add(new ModelBox(gun61_r4, 118, 205, -1.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, false));
		gun61_r4.cubeList.add(new ModelBox(gun61_r4, 38, 205, -1.6445F, 0.0F, 0.0F, 1, 1, 17, -0.001F, false));

		gun60_r4 = new ModelRenderer(this);
		gun60_r4.setRotationPoint(0.6827F, -35.3055F, -23.0F);
		mp5_blackmesa_handguard.addChild(gun60_r4);
		setRotationAngle(gun60_r4, 0.0F, 0.0F, -2.8875F);
		gun60_r4.cubeList.add(new ModelBox(gun60_r4, 0, 205, 0.0F, -1.4F, 0.0F, 1, 1, 17, -0.001F, false));
		gun60_r4.cubeList.add(new ModelBox(gun60_r4, 181, 204, 0.0F, -1.0F, 0.0F, 1, 1, 17, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(0.6827F, -35.2945F, -23.0F);
		mp5_blackmesa_handguard.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.0F, 0.0F, 2.8875F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 99, 204, 0.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, false));
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 162, 203, 0.0F, 0.4F, 0.0F, 1, 1, 17, -0.001F, false));

		gun60_r5 = new ModelRenderer(this);
		gun60_r5.setRotationPoint(-1.5F, -37.9827F, -23.0F);
		mp5_blackmesa_handguard.addChild(gun60_r5);
		setRotationAngle(gun60_r5, 0.0F, 0.0F, -2.521F);
		gun60_r5.cubeList.add(new ModelBox(gun60_r5, 86, 173, -2.25F, -1.0F, 0.0F, 2, 1, 17, -0.001F, false));

		mp5_a5_handguard = new ModelRenderer(this);
		mp5_a5_handguard.setRotationPoint(0.0F, 24.0F, -17.0F);
		mp5_a5_handguard.cubeList.add(new ModelBox(mp5_a5_handguard, 64, 89, -1.15F, -37.7327F, -22.0F, 1, 2, 2, -0.001F, false));
		mp5_a5_handguard.cubeList.add(new ModelBox(mp5_a5_handguard, 96, 32, -1.15F, -36.7327F, -23.0F, 1, 1, 1, -0.001F, false));
		mp5_a5_handguard.cubeList.add(new ModelBox(mp5_a5_handguard, 36, 89, -2.85F, -37.7327F, -22.0F, 1, 2, 2, -0.001F, false));
		mp5_a5_handguard.cubeList.add(new ModelBox(mp5_a5_handguard, 64, 93, -2.85F, -36.7327F, -23.0F, 1, 1, 1, -0.001F, false));
		mp5_a5_handguard.cubeList.add(new ModelBox(mp5_a5_handguard, 43, 6, -1.15F, -35.9327F, -23.0F, 2, 1, 3, -0.002F, false));
		mp5_a5_handguard.cubeList.add(new ModelBox(mp5_a5_handguard, 41, 33, -3.85F, -35.9327F, -23.0F, 2, 1, 3, -0.002F, false));
		mp5_a5_handguard.cubeList.add(new ModelBox(mp5_a5_handguard, 192, 41, -2.0F, -33.67F, -23.0F, 1, 1, 17, 0.0F, false));

		gun63_r4 = new ModelRenderer(this);
		gun63_r4.setRotationPoint(-1.5F, -37.9827F, -11.0F);
		mp5_a5_handguard.addChild(gun63_r4);
		setRotationAngle(gun63_r4, 0.0F, 0.0F, 2.521F);
		gun63_r4.cubeList.add(new ModelBox(gun63_r4, 39, 45, 0.35F, -0.65F, 3.0F, 2, 1, 2, -0.001F, false));
		gun63_r4.cubeList.add(new ModelBox(gun63_r4, 16, 48, 0.35F, -0.65F, -9.001F, 2, 1, 2, -0.001F, false));
		gun63_r4.cubeList.add(new ModelBox(gun63_r4, 29, 0, 0.1F, -0.65F, -7.0F, 2, 1, 10, -0.001F, false));
		gun63_r4.cubeList.add(new ModelBox(gun63_r4, 54, 84, 1.1F, -0.45F, -6.5F, 1, 1, 1, -0.2F, false));
		gun63_r4.cubeList.add(new ModelBox(gun63_r4, 16, 84, 1.1F, -0.45F, -4.5F, 1, 1, 1, -0.2F, false));
		gun63_r4.cubeList.add(new ModelBox(gun63_r4, 12, 84, 1.1F, -0.45F, -2.5F, 1, 1, 1, -0.2F, false));
		gun63_r4.cubeList.add(new ModelBox(gun63_r4, 73, 83, 1.1F, -0.45F, -0.5F, 1, 1, 1, -0.2F, false));
		gun63_r4.cubeList.add(new ModelBox(gun63_r4, 82, 49, 1.1F, -0.45F, 1.5F, 1, 1, 1, -0.2F, false));

		gun61_r5 = new ModelRenderer(this);
		gun61_r5.setRotationPoint(-3.6827F, -35.2945F, -11.0F);
		mp5_a5_handguard.addChild(gun61_r5);
		setRotationAngle(gun61_r5, 0.0F, 0.0F, -2.8875F);
		gun61_r5.cubeList.add(new ModelBox(gun61_r5, 97, 73, -0.65F, -0.1F, 3.0F, 1, 1, 2, 0.0F, false));
		gun61_r5.cubeList.add(new ModelBox(gun61_r5, 81, 96, -0.65F, 0.5F, 3.0F, 1, 1, 2, -0.001F, false));
		gun61_r5.cubeList.add(new ModelBox(gun61_r5, 31, 98, -0.65F, 0.5F, -9.0F, 1, 1, 2, -0.001F, false));
		gun61_r5.cubeList.add(new ModelBox(gun61_r5, 95, 68, -0.45F, -0.3F, -12.2F, 1, 1, 4, -0.201F, false));
		gun61_r5.cubeList.add(new ModelBox(gun61_r5, 0, 37, -0.65F, -0.1F, -7.0F, 1, 1, 10, 0.0F, false));
		gun61_r5.cubeList.add(new ModelBox(gun61_r5, 59, 98, -0.65F, -0.1F, -9.0F, 1, 1, 2, 0.0F, false));

		gun63_r5 = new ModelRenderer(this);
		gun63_r5.setRotationPoint(-3.6827F, -35.2945F, -21.0F);
		mp5_a5_handguard.addChild(gun63_r5);
		setRotationAngle(gun63_r5, 0.0F, 0.0F, -2.6257F);
		gun63_r5.cubeList.add(new ModelBox(gun63_r5, 0, 26, -1.55F, 0.7F, 3.0F, 2, 1, 10, -0.001F, false));

		gun62_r4 = new ModelRenderer(this);
		gun62_r4.setRotationPoint(0.6827F, -35.2945F, -21.0F);
		mp5_a5_handguard.addChild(gun62_r4);
		setRotationAngle(gun62_r4, 0.0F, 0.0F, 2.6257F);
		gun62_r4.cubeList.add(new ModelBox(gun62_r4, 27, 27, -0.45F, 0.7F, 3.0F, 2, 1, 10, -0.001F, false));

		gun61_r6 = new ModelRenderer(this);
		gun61_r6.setRotationPoint(0.6827F, -35.2945F, -11.0F);
		mp5_a5_handguard.addChild(gun61_r6);
		setRotationAngle(gun61_r6, 0.0F, 0.0F, 2.8875F);
		gun61_r6.cubeList.add(new ModelBox(gun61_r6, 8, 48, -0.35F, 0.5F, 3.0F, 2, 1, 2, -0.001F, false));
		gun61_r6.cubeList.add(new ModelBox(gun61_r6, 10, 96, -0.35F, -0.1F, 3.0F, 1, 1, 2, 0.0F, false));
		gun61_r6.cubeList.add(new ModelBox(gun61_r6, 40, 96, -0.55F, -0.3F, -12.2F, 1, 1, 4, -0.201F, false));
		gun61_r6.cubeList.add(new ModelBox(gun61_r6, 27, 38, -0.35F, -0.1F, -7.0F, 1, 1, 10, 0.0F, false));
		gun61_r6.cubeList.add(new ModelBox(gun61_r6, 65, 98, -0.35F, -0.1F, -9.0F, 1, 1, 2, 0.0F, false));
		gun61_r6.cubeList.add(new ModelBox(gun61_r6, 67, 16, -0.35F, 0.5F, -9.0F, 2, 1, 2, -0.001F, false));

		gun62_r5 = new ModelRenderer(this);
		gun62_r5.setRotationPoint(-3.6827F, -35.3055F, -23.0F);
		mp5_a5_handguard.addChild(gun62_r5);
		setRotationAngle(gun62_r5, 0.0F, 0.0F, 2.8875F);
		gun62_r5.cubeList.add(new ModelBox(gun62_r5, 65, 171, -1.65F, -1.5F, 0.0F, 2, 1, 17, -0.002F, false));
		gun62_r5.cubeList.add(new ModelBox(gun62_r5, 80, 191, -0.65F, -0.9F, 0.0F, 1, 1, 17, 0.0F, false));

		gun64_r4 = new ModelRenderer(this);
		gun64_r4.setRotationPoint(-1.9945F, -33.0173F, -23.0F);
		mp5_a5_handguard.addChild(gun64_r4);
		setRotationAngle(gun64_r4, 0.0F, 0.0F, -2.5384F);
		gun64_r4.cubeList.add(new ModelBox(gun64_r4, 0, 186, 0.7445F, -0.35F, 0.0F, 1, 2, 17, -0.001F, false));
		gun64_r4.cubeList.add(new ModelBox(gun64_r4, 42, 186, -0.1F, -0.35F, 0.0F, 1, 2, 17, 0.001F, false));

		gun62_r6 = new ModelRenderer(this);
		gun62_r6.setRotationPoint(-1.0055F, -33.0173F, -23.0F);
		mp5_a5_handguard.addChild(gun62_r6);
		setRotationAngle(gun62_r6, 0.0F, 0.0F, 2.5384F);
		gun62_r6.cubeList.add(new ModelBox(gun62_r6, 143, 186, -0.9F, -0.35F, 0.0F, 1, 2, 17, 0.002F, false));
		gun62_r6.cubeList.add(new ModelBox(gun62_r6, 19, 189, -1.7445F, -0.35F, 0.0F, 1, 2, 17, -0.001F, false));

		gun61_r7 = new ModelRenderer(this);
		gun61_r7.setRotationPoint(0.6827F, -35.3055F, -23.0F);
		mp5_a5_handguard.addChild(gun61_r7);
		setRotationAngle(gun61_r7, 0.0F, 0.0F, -2.8875F);
		gun61_r7.cubeList.add(new ModelBox(gun61_r7, 173, 2, -0.35F, -1.5F, 0.0F, 2, 1, 17, -0.002F, false));
		gun61_r7.cubeList.add(new ModelBox(gun61_r7, 194, 0, -0.35F, -0.9F, 0.0F, 1, 1, 17, 0.0F, false));

		gun62_r7 = new ModelRenderer(this);
		gun62_r7.setRotationPoint(-3.6827F, -35.2945F, -20.8F);
		mp5_a5_handguard.addChild(gun62_r7);
		setRotationAngle(gun62_r7, 0.5934F, 0.0F, -2.8875F);
		gun62_r7.cubeList.add(new ModelBox(gun62_r7, 29, 19, -1.65F, 0.6F, 0.0F, 2, 1, 1, -0.002F, false));

		gun61_r8 = new ModelRenderer(this);
		gun61_r8.setRotationPoint(0.6827F, -35.2945F, -20.8F);
		mp5_a5_handguard.addChild(gun61_r8);
		setRotationAngle(gun61_r8, 0.5934F, 0.0F, 2.8875F);
		gun61_r8.cubeList.add(new ModelBox(gun61_r8, 27, 35, -0.35F, 0.6F, 0.0F, 2, 1, 1, -0.002F, false));

		gun66_r3 = new ModelRenderer(this);
		gun66_r3.setRotationPoint(-2.85F, -36.7327F, -23.0F);
		mp5_a5_handguard.addChild(gun66_r3);
		setRotationAngle(gun66_r3, 0.7854F, 0.0F, 0.0F);
		gun66_r3.cubeList.add(new ModelBox(gun66_r3, 18, 94, 0.0F, 0.0F, 0.4F, 1, 1, 1, -0.003F, false));
		gun66_r3.cubeList.add(new ModelBox(gun66_r3, 36, 93, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));
		gun66_r3.cubeList.add(new ModelBox(gun66_r3, 94, 49, 1.7F, 0.0F, 0.4F, 1, 1, 1, -0.003F, false));
		gun66_r3.cubeList.add(new ModelBox(gun66_r3, 94, 73, 1.7F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

		gun64_r5 = new ModelRenderer(this);
		gun64_r5.setRotationPoint(-3.1F, -37.9827F, -23.0F);
		mp5_a5_handguard.addChild(gun64_r5);
		setRotationAngle(gun64_r5, -0.2618F, 0.0F, 0.0F);
		gun64_r5.cubeList.add(new ModelBox(gun64_r5, 92, 32, 0.15F, 0.25F, 1.0F, 1, 1, 1, -0.001F, false));
		gun64_r5.cubeList.add(new ModelBox(gun64_r5, 92, 41, 2.05F, 0.25F, 1.0F, 1, 1, 1, -0.001F, false));

		gun68_r1 = new ModelRenderer(this);
		gun68_r1.setRotationPoint(-1.5F, -37.9827F, -32.5F);
		mp5_a5_handguard.addChild(gun68_r1);
		setRotationAngle(gun68_r1, 0.0F, 0.0F, -2.521F);
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 86, 49, -2.1F, -0.45F, 23.0F, 1, 1, 1, -0.2F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 88, 20, -2.1F, -0.45F, 21.0F, 1, 1, 1, -0.2F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 90, 49, -2.1F, -0.45F, 19.0F, 1, 1, 1, -0.2F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 10, 91, -2.1F, -0.45F, 17.0F, 1, 1, 1, -0.2F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 91, 87, -2.1F, -0.45F, 15.0F, 1, 1, 1, -0.2F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 29, 11, -2.1F, -0.65F, 14.5F, 2, 1, 10, -0.001F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 0, 48, -2.35F, -0.65F, 12.499F, 2, 1, 2, -0.001F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 69, 6, -2.35F, -0.65F, 24.5F, 2, 1, 2, -0.001F, false));

		mp5_mi_handguard = new ModelRenderer(this);
		mp5_mi_handguard.setRotationPoint(0.7F, -10.3F, -40.0F);
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 17, 104, -1.0F, -2.0F, 16.0F, 1, 2, 1, -0.001F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 101, 68, -1.0F, -2.0F, 14.0F, 1, 2, 1, -0.001F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 100, 41, -1.0F, -2.0F, 11.5F, 1, 2, 1, -0.001F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 100, 26, -1.0F, -2.0F, 7.5F, 1, 2, 1, -0.001F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 211, 36, -0.8F, -2.2F, 3.0F, 1, 1, 14, -0.2F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 209, 114, -0.8F, -0.8F, 3.0F, 1, 1, 14, -0.2F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 117, 0, -1.0F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 116, 24, -1.0F, -1.5F, -1.0F, 1, 1, 4, -0.002F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 54, 79, -1.7F, -3.8F, 0.2F, 1, 3, 2, 0.0F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 81, 92, -1.0F, -2.0F, 2.4F, 1, 2, 2, -0.001F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 155, 148, -2.4F, 0.4F, -1.0F, 1, 1, 18, 0.0F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 155, 39, -3.0F, 0.4F, -1.0F, 1, 1, 18, 0.001F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 48, 33, -4.4F, -2.0F, 16.0F, 1, 2, 1, -0.001F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 38, 66, -3.7F, -3.8F, 0.2F, 1, 3, 2, 0.0F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 11, 104, -4.4F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 91, 83, -4.4F, -2.0F, 2.4F, 1, 2, 2, -0.001F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 113, 129, -4.6F, -2.2F, 3.0F, 1, 1, 14, -0.2F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 192, 59, -4.6F, -0.8F, 3.0F, 1, 1, 14, -0.2F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 21, 52, -4.4F, -2.0F, 14.0F, 1, 2, 1, -0.001F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 59, 59, -4.4F, -2.0F, 11.5F, 1, 2, 1, -0.001F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 5, 65, -4.4F, -2.0F, 7.5F, 1, 2, 1, -0.001F, false));
		mp5_mi_handguard.cubeList.add(new ModelBox(mp5_mi_handguard, 110, 115, -4.4F, -1.5F, -1.0F, 1, 1, 4, -0.002F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.4F, -2.0F, 15.5F);
		mp5_mi_handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.8552F, 0.0F, 0.3665F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 109, 62, -0.1F, -3.68F, -1.35F, 1, 1, 1, -0.102F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-4.4F, -2.0F, 0.0F);
		mp5_mi_handguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3665F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 56, 109, 0.0F, -2.0F, 3.0F, 1, 1, 1, -0.003F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 64, -0.2F, -2.2F, 3.5F, 1, 1, 9, -0.201F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 56, 10, -0.2F, -0.8F, 3.5F, 1, 1, 9, -0.201F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 78, 0.0F, -2.0F, 3.4F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 66, 0.0F, -2.0F, 11.5F, 1, 2, 1, 0.001F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 102, 49, 0.0F, -1.0F, 12.1F, 1, 1, 1, -0.002F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 101, 73, 0.0F, -1.5F, 12.1F, 1, 1, 1, -0.001F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 98, 21, 0.0F, -1.5F, 2.4F, 1, 1, 1, -0.001F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 96, 41, 0.0F, -1.0F, 2.4F, 1, 1, 1, -0.002F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 6, 0.0F, -2.0F, 7.5F, 1, 2, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.4F, -2.0F, 0.0F);
		mp5_mi_handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.8552F, 0.0F, 0.3665F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 109, -0.1F, -3.68F, 0.35F, 1, 1, 1, -0.102F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.4F, 0.0F, -1.0F);
		mp5_mi_handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 78, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 75, 10, 0.0F, 0.0F, 4.4F, 1, 2, 1, -0.003F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 75, 0, 0.0F, 0.0F, 8.5F, 1, 2, 1, -0.003F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 71, 0.0F, 0.0F, 12.5F, 1, 2, 1, -0.003F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 71, 20, 0.0F, 0.0F, 15.0F, 1, 2, 1, -0.003F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 196, 18, -0.2F, 1.2F, 0.5F, 1, 1, 17, -0.202F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 194, 131, -0.2F, -0.2F, 0.5F, 1, 1, 17, -0.202F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 69, 0, 0.0F, 0.0F, 17.0F, 1, 2, 1, -0.001F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.8F, -2.4F, 0.5F);
		mp5_mi_handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 107, 18, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 111, 101, 2.2F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.6F, -0.6F, 0.5F);
		mp5_mi_handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3491F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 106, 46, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 113, 76, 3.8F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-4.5F, -0.9F, 16.0F);
		mp5_mi_handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.7854F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 99, 87, -0.2F, -0.2F, -0.8F, 1, 1, 1, -0.302F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 113, 111, 3.8F, -0.2F, -0.8F, 1, 1, 1, -0.302F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-4.5F, -0.9F, 15.0F);
		mp5_mi_handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.7854F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 63, 98, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.302F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 114, 46, 3.8F, -0.2F, -0.2F, 1, 1, 1, -0.302F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-4.5F, -1.1F, 16.0F);
		mp5_mi_handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 98, 49, -0.2F, -0.8F, -0.8F, 1, 1, 1, -0.302F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 115, 18, 3.8F, -0.8F, -0.8F, 1, 1, 1, -0.302F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-4.5F, -1.1F, 15.0F);
		mp5_mi_handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.7854F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 98, -0.2F, -0.8F, -0.2F, 1, 1, 1, -0.302F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 115, 3.8F, -0.8F, -0.2F, 1, 1, 1, -0.302F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-4.4F, -2.0F, 0.0F);
		mp5_mi_handguard.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.4712F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 39, 53, 0.0F, -1.75F, 12.0F, 1, 1, 5, -0.001F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 109, 106, 0.0F, -1.0F, 13.0F, 1, 1, 4, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, -2.0F, 15.5F);
		mp5_mi_handguard.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.8552F, 0.0F, -0.3665F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 111, 18, -0.9F, -3.68F, -1.35F, 1, 1, 1, -0.102F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, -2.0F, 16.1F);
		mp5_mi_handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.3665F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 110, 46, -1.0F, -1.5F, -4.0F, 1, 1, 1, -0.001F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 109, 76, -1.0F, -1.0F, -4.0F, 1, 1, 1, -0.002F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 116, 24, -1.0F, -1.5F, -13.7F, 1, 1, 1, -0.001F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 116, 26, -1.0F, -1.0F, -13.7F, 1, 1, 1, -0.002F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 100, 0, -1.0F, -2.0F, -4.6F, 1, 2, 1, 0.001F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 72, 109, -1.0F, -2.0F, -13.1F, 1, 1, 1, -0.003F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 49, 79, -1.0F, -2.0F, -12.7F, 1, 2, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 65, -0.8F, -2.2F, -12.6F, 1, 1, 9, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 66, -0.8F, -0.8F, -12.6F, 1, 1, 9, -0.201F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 104, -1.0F, -2.0F, -8.6F, 1, 2, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, -2.0F, 0.0F);
		mp5_mi_handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.8552F, 0.0F, -0.3665F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 38, 115, -0.9F, -3.68F, 0.35F, 1, 1, 1, -0.102F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, -2.0F, 0.0F);
		mp5_mi_handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.4712F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 66, 27, -1.0F, -1.75F, 12.0F, 1, 1, 5, -0.001F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 116, 33, -1.0F, -1.0F, 13.0F, 1, 1, 4, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 16.0F);
		mp5_mi_handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 92, 26, -1.0F, 0.0F, -12.6F, 1, 2, 1, -0.003F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 92, 35, -1.0F, 0.0F, -8.5F, 1, 2, 1, -0.003F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 94, 0, -1.0F, 0.0F, -4.5F, 1, 2, 1, -0.003F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 96, -1.0F, 0.0F, -2.0F, 1, 2, 1, -0.003F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 96, -1.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 197, 149, -0.8F, 1.2F, -16.5F, 1, 1, 17, -0.202F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 197, 167, -0.8F, -0.2F, -16.5F, 1, 1, 17, -0.202F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 101, 98, -1.0F, 0.0F, -17.0F, 1, 2, 1, -0.001F, false));

		mp5_sd_handguard = new ModelRenderer(this);
		mp5_sd_handguard.setRotationPoint(0.0F, 24.0F, -17.0F);
		mp5_sd_handguard.cubeList.add(new ModelBox(mp5_sd_handguard, 74, 241, -2.0F, -33.62F, -25.8F, 1, 1, 19, 0.2F, false));
		mp5_sd_handguard.cubeList.add(new ModelBox(mp5_sd_handguard, 81, 66, -2.0F, -33.62F, -7.2F, 1, 1, 1, 0.201F, false));

		gun63_r6 = new ModelRenderer(this);
		gun63_r6.setRotationPoint(-3.6827F, -35.3055F, -23.0F);
		mp5_sd_handguard.addChild(gun63_r6);
		setRotationAngle(gun63_r6, 0.0F, 0.0F, 2.8875F);
		gun63_r6.cubeList.add(new ModelBox(gun63_r6, 23, 241, -1.4F, -1.6F, -3.0F, 2, 1, 20, -0.002F, false));
		gun63_r6.cubeList.add(new ModelBox(gun63_r6, 3, 264, -1.4F, -0.9F, -3.0F, 2, 1, 20, 0.0F, false));

		gun65_r1 = new ModelRenderer(this);
		gun65_r1.setRotationPoint(-1.9945F, -33.0173F, -23.0F);
		mp5_sd_handguard.addChild(gun65_r1);
		setRotationAngle(gun65_r1, 0.0F, 0.0F, -2.5384F);
		gun65_r1.cubeList.add(new ModelBox(gun65_r1, 49, 245, -0.1555F, -0.6F, -3.0F, 2, 2, 20, -0.001F, false));

		gun64_r6 = new ModelRenderer(this);
		gun64_r6.setRotationPoint(-1.0055F, -33.0173F, -23.0F);
		mp5_sd_handguard.addChild(gun64_r6);
		setRotationAngle(gun64_r6, 0.0F, 0.0F, 2.5384F);
		gun64_r6.cubeList.add(new ModelBox(gun64_r6, 96, 245, -1.8445F, -0.6F, -3.0F, 2, 2, 20, -0.003F, false));

		gun62_r8 = new ModelRenderer(this);
		gun62_r8.setRotationPoint(0.6827F, -35.3055F, -23.0F);
		mp5_sd_handguard.addChild(gun62_r8);
		setRotationAngle(gun62_r8, 0.0F, 0.0F, -2.8875F);
		gun62_r8.cubeList.add(new ModelBox(gun62_r8, 122, 240, -0.6F, -1.6F, -3.0F, 2, 1, 20, -0.002F, false));
		gun62_r8.cubeList.add(new ModelBox(gun62_r8, 148, 246, -0.6F, -0.9F, -3.0F, 2, 1, 20, 0.0F, false));

		gun62_r9 = new ModelRenderer(this);
		gun62_r9.setRotationPoint(-3.6827F, -35.2945F, -23.0F);
		mp5_sd_handguard.addChild(gun62_r9);
		setRotationAngle(gun62_r9, 0.0F, 0.0F, -2.8875F);
		gun62_r9.cubeList.add(new ModelBox(gun62_r9, 78, 277, -0.4F, 0.6F, -3.0F, 1, 1, 20, -0.001F, false));
		gun62_r9.cubeList.add(new ModelBox(gun62_r9, 51, 272, -1.4F, -0.2F, -3.0F, 2, 1, 20, 0.001F, false));

		gun64_r7 = new ModelRenderer(this);
		gun64_r7.setRotationPoint(-1.5F, -37.9827F, -35.0F);
		mp5_sd_handguard.addChild(gun64_r7);
		setRotationAngle(gun64_r7, 0.0F, 0.0F, 2.521F);
		gun64_r7.cubeList.add(new ModelBox(gun64_r7, 103, 270, 0.45F, -1.4F, 9.002F, 2, 2, 20, 0.0F, false));

		gun60_r6 = new ModelRenderer(this);
		gun60_r6.setRotationPoint(0.6827F, -35.2945F, -23.0F);
		mp5_sd_handguard.addChild(gun60_r6);
		setRotationAngle(gun60_r6, 0.0F, 0.0F, 2.8875F);
		gun60_r6.cubeList.add(new ModelBox(gun60_r6, 171, 239, -0.6F, -0.2F, -3.0F, 2, 1, 20, 0.001F, false));
		gun60_r6.cubeList.add(new ModelBox(gun60_r6, 197, 245, -0.6F, 0.6F, -3.0F, 1, 1, 20, -0.001F, false));

		gun63_r7 = new ModelRenderer(this);
		gun63_r7.setRotationPoint(-1.5F, -37.9827F, -35.0F);
		mp5_sd_handguard.addChild(gun63_r7);
		setRotationAngle(gun63_r7, 0.0F, 0.0F, -2.521F);
		gun63_r7.cubeList.add(new ModelBox(gun63_r7, 221, 240, -2.45F, -1.4F, 9.0F, 2, 2, 20, 0.0F, false));

		mp5_utg_tri_rail_handguard = new ModelRenderer(this);
		mp5_utg_tri_rail_handguard.setRotationPoint(0.0F, 24.0F, -17.0F);
		mp5_utg_tri_rail_handguard.cubeList.add(new ModelBox(mp5_utg_tri_rail_handguard, 44, 168, -0.9673F, -35.5555F, -23.0F, 2, 1, 17, 0.002F, false));
		mp5_utg_tri_rail_handguard.cubeList.add(new ModelBox(mp5_utg_tri_rail_handguard, 0, 168, -0.9673F, -36.0555F, -23.0F, 2, 1, 17, 0.003F, false));
		mp5_utg_tri_rail_handguard.cubeList.add(new ModelBox(mp5_utg_tri_rail_handguard, 82, 0, -1.2673F, -37.8055F, -8.0F, 1, 2, 2, 0.001F, false));
		mp5_utg_tri_rail_handguard.cubeList.add(new ModelBox(mp5_utg_tri_rail_handguard, 81, 62, -1.0673F, -37.8055F, -23.0F, 1, 2, 2, 0.001F, false));
		mp5_utg_tri_rail_handguard.cubeList.add(new ModelBox(mp5_utg_tri_rail_handguard, 70, 38, -1.0673F, -37.8055F, -11.0F, 1, 2, 3, 0.002F, false));
		mp5_utg_tri_rail_handguard.cubeList.add(new ModelBox(mp5_utg_tri_rail_handguard, 107, 185, -2.25F, -34.7055F, -23.0F, 1, 2, 17, 0.001F, false));
		mp5_utg_tri_rail_handguard.cubeList.add(new ModelBox(mp5_utg_tri_rail_handguard, 178, 165, -1.75F, -34.7055F, -23.0F, 1, 2, 17, 0.002F, false));
		mp5_utg_tri_rail_handguard.cubeList.add(new ModelBox(mp5_utg_tri_rail_handguard, 108, 167, -4.0327F, -35.5555F, -23.0F, 2, 1, 17, 0.002F, false));
		mp5_utg_tri_rail_handguard.cubeList.add(new ModelBox(mp5_utg_tri_rail_handguard, 46, 68, -2.9327F, -37.8055F, -23.0F, 1, 2, 2, 0.001F, false));
		mp5_utg_tri_rail_handguard.cubeList.add(new ModelBox(mp5_utg_tri_rail_handguard, 157, 167, -4.0327F, -36.0555F, -23.0F, 2, 1, 17, 0.003F, false));
		mp5_utg_tri_rail_handguard.cubeList.add(new ModelBox(mp5_utg_tri_rail_handguard, 27, 66, -2.9327F, -37.8055F, -11.0F, 1, 2, 3, 0.002F, false));

		gun64_r8 = new ModelRenderer(this);
		gun64_r8.setRotationPoint(-1.9945F, -33.0173F, -23.0F);
		mp5_utg_tri_rail_handguard.addChild(gun64_r8);
		setRotationAngle(gun64_r8, 0.0F, 0.0F, -2.5384F);
		gun64_r8.cubeList.add(new ModelBox(gun64_r8, 81, 52, -0.1F, -0.35F, 15.0F, 1, 2, 2, 0.002F, false));
		gun64_r8.cubeList.add(new ModelBox(gun64_r8, 73, 79, 0.7445F, -0.35F, 15.0F, 1, 2, 2, -0.001F, false));

		gun63_r8 = new ModelRenderer(this);
		gun63_r8.setRotationPoint(-3.6827F, -35.3055F, -23.0F);
		mp5_utg_tri_rail_handguard.addChild(gun63_r8);
		setRotationAngle(gun63_r8, 0.0F, 0.0F, 2.8875F);
		gun63_r8.cubeList.add(new ModelBox(gun63_r8, 37, 22, -1.65F, -1.5F, 15.0F, 2, 1, 2, -0.002F, false));

		gun66_r4 = new ModelRenderer(this);
		gun66_r4.setRotationPoint(-2.7327F, -37.8055F, -8.0F);
		mp5_utg_tri_rail_handguard.addChild(gun66_r4);
		setRotationAngle(gun66_r4, 0.0F, 0.0F, 0.7505F);
		gun66_r4.cubeList.add(new ModelBox(gun66_r4, 72, 73, 0.0F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));
		gun66_r4.cubeList.add(new ModelBox(gun66_r4, 71, 33, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.001F, false));

		gun63_r9 = new ModelRenderer(this);
		gun63_r9.setRotationPoint(-3.6827F, -35.2945F, -11.0F);
		mp5_utg_tri_rail_handguard.addChild(gun63_r9);
		setRotationAngle(gun63_r9, 0.0F, 0.0F, -2.8875F);
		gun63_r9.cubeList.add(new ModelBox(gun63_r9, 29, 22, -1.65F, 0.5F, 3.0F, 2, 1, 2, -0.001F, false));

		gun66_r5 = new ModelRenderer(this);
		gun66_r5.setRotationPoint(-1.9F, -37.9827F, -10.7F);
		mp5_utg_tri_rail_handguard.addChild(gun66_r5);
		setRotationAngle(gun66_r5, -0.2618F, 0.0F, 0.0F);
		gun66_r5.cubeList.add(new ModelBox(gun66_r5, 14, 48, -1.15F, 0.25F, 1.0F, 1, 1, 1, -0.001F, false));
		gun66_r5.cubeList.add(new ModelBox(gun66_r5, 60, 0, 0.95F, 0.25F, 1.0F, 1, 1, 1, -0.001F, false));

		gun64_r9 = new ModelRenderer(this);
		gun64_r9.setRotationPoint(-3.6327F, -34.5555F, -23.0F);
		mp5_utg_tri_rail_handguard.addChild(gun64_r9);
		setRotationAngle(gun64_r9, 0.0F, 0.0F, -0.7854F);
		gun64_r9.cubeList.add(new ModelBox(gun64_r9, 175, 146, 0.0F, 0.0F, 0.0F, 1, 2, 17, 0.0F, false));

		gun65_r2 = new ModelRenderer(this);
		gun65_r2.setRotationPoint(-1.9F, -37.9827F, -23.3F);
		mp5_utg_tri_rail_handguard.addChild(gun65_r2);
		setRotationAngle(gun65_r2, -0.2618F, 0.0F, 0.0F);
		gun65_r2.cubeList.add(new ModelBox(gun65_r2, 33, 35, -1.15F, 0.25F, 1.0F, 1, 1, 1, -0.001F, false));
		gun65_r2.cubeList.add(new ModelBox(gun65_r2, 75, 6, 0.95F, 0.25F, 1.0F, 1, 1, 1, -0.001F, false));

		gun62_r10 = new ModelRenderer(this);
		gun62_r10.setRotationPoint(0.6827F, -35.2945F, -11.0F);
		mp5_utg_tri_rail_handguard.addChild(gun62_r10);
		setRotationAngle(gun62_r10, 0.0F, 0.0F, 2.8875F);
		gun62_r10.cubeList.add(new ModelBox(gun62_r10, 12, 44, -0.35F, 0.5F, 3.0F, 2, 1, 2, -0.001F, false));

		gun63_r10 = new ModelRenderer(this);
		gun63_r10.setRotationPoint(-1.0055F, -33.0173F, -23.0F);
		mp5_utg_tri_rail_handguard.addChild(gun63_r10);
		setRotationAngle(gun63_r10, 0.0F, 0.0F, 2.5384F);
		gun63_r10.cubeList.add(new ModelBox(gun63_r10, 82, 10, -0.9F, -0.35F, 15.0F, 1, 2, 2, 0.002F, false));
		gun63_r10.cubeList.add(new ModelBox(gun63_r10, 10, 87, -1.7445F, -0.35F, 15.0F, 1, 2, 2, -0.001F, false));

		gun62_r11 = new ModelRenderer(this);
		gun62_r11.setRotationPoint(0.6827F, -35.3055F, -23.0F);
		mp5_utg_tri_rail_handguard.addChild(gun62_r11);
		setRotationAngle(gun62_r11, 0.0F, 0.0F, -2.8875F);
		gun62_r11.cubeList.add(new ModelBox(gun62_r11, 45, 22, -0.35F, -1.5F, 15.0F, 2, 1, 2, -0.002F, false));

		gun65_r3 = new ModelRenderer(this);
		gun65_r3.setRotationPoint(-0.2673F, -37.8055F, -8.0F);
		mp5_utg_tri_rail_handguard.addChild(gun65_r3);
		setRotationAngle(gun65_r3, 0.0F, 0.0F, -0.7505F);
		gun65_r3.cubeList.add(new ModelBox(gun65_r3, 18, 74, -1.0F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));
		gun65_r3.cubeList.add(new ModelBox(gun65_r3, 86, 72, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.001F, false));

		gun63_r11 = new ModelRenderer(this);
		gun63_r11.setRotationPoint(0.6327F, -34.5555F, -23.0F);
		mp5_utg_tri_rail_handguard.addChild(gun63_r11);
		setRotationAngle(gun63_r11, 0.0F, 0.0F, 0.7854F);
		gun63_r11.cubeList.add(new ModelBox(gun63_r11, 178, 184, -1.0F, 0.0F, 0.0F, 1, 2, 17, 0.0F, false));

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(0.0327F, -36.4055F, -11.8F);
		mp5_utg_tri_rail_handguard.addChild(bone41);
		setRotationAngle(bone41, 0.0F, 0.0F, -0.1745F);
		bone41.cubeList.add(new ModelBox(bone41, 60, 10, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.201F, false));
		bone41.cubeList.add(new ModelBox(bone41, 141, 225, -1.0F, -0.5F, -10.2F, 1, 1, 12, -0.2F, false));
		bone41.cubeList.add(new ModelBox(bone41, 225, 114, -1.1F, -1.0F, -10.2F, 1, 1, 12, -0.2F, false));
		bone41.cubeList.add(new ModelBox(bone41, 14, 226, -1.0F, -1.5F, -10.2F, 1, 1, 12, -0.2F, false));
		bone41.cubeList.add(new ModelBox(bone41, 20, 68, -1.0F, -1.0F, -9.4F, 1, 1, 1, -0.201F, false));

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(-3.0327F, -36.4055F, -11.8F);
		mp5_utg_tri_rail_handguard.addChild(bone42);
		setRotationAngle(bone42, 0.0F, 0.0F, 0.1745F);
		bone42.cubeList.add(new ModelBox(bone42, 60, 10, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.201F, true));
		bone42.cubeList.add(new ModelBox(bone42, 141, 225, 0.0F, -0.5F, -10.2F, 1, 1, 12, -0.2F, true));
		bone42.cubeList.add(new ModelBox(bone42, 225, 114, 0.1F, -1.0F, -10.2F, 1, 1, 12, -0.2F, true));
		bone42.cubeList.add(new ModelBox(bone42, 14, 226, 0.0F, -1.5F, -10.2F, 1, 1, 12, -0.2F, true));
		bone42.cubeList.add(new ModelBox(bone42, 20, 68, 0.0F, -1.0F, -9.4F, 1, 1, 1, -0.201F, true));

		mp5_stock = new ModelRenderer(this);
		mp5_stock.setRotationPoint(-1.4496F, -9.6871F, 25.296F);
		mp5_stock.cubeList.add(new ModelBox(mp5_stock, 0, 12, -1.5504F, -3.8012F, -1.296F, 3, 7, 2, 0.0F, false));

		gun168_r1 = new ModelRenderer(this);
		gun168_r1.setRotationPoint(-2.0504F, -0.9874F, -14.5328F);
		mp5_stock.addChild(gun168_r1);
		setRotationAngle(gun168_r1, 0.0F, 0.0F, -0.1745F);
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 55, 52, -0.5F, -1.15F, -12.0F, 1, 2, 24, -0.1F, false));

		gun167_r1 = new ModelRenderer(this);
		gun167_r1.setRotationPoint(1.9496F, -0.9874F, -14.5328F);
		mp5_stock.addChild(gun167_r1);
		setRotationAngle(gun167_r1, 0.0F, 0.0F, 0.1745F);
		gun167_r1.cubeList.add(new ModelBox(gun167_r1, 56, 0, -0.5F, -1.15F, -12.0F, 1, 2, 24, -0.1F, false));

		gun167_r2 = new ModelRenderer(this);
		gun167_r2.setRotationPoint(-0.0476F, 5.9113F, 0.3296F);
		mp5_stock.addChild(gun167_r2);
		setRotationAngle(gun167_r2, 0.2182F, 0.0F, 0.0F);
		gun167_r2.cubeList.add(new ModelBox(gun167_r2, 29, 0, -1.5028F, -3.0F, -1.0F, 3, 6, 2, 0.001F, false));

		gun166_r1 = new ModelRenderer(this);
		gun166_r1.setRotationPoint(-0.4033F, -1.8831F, -2.1293F);
		mp5_stock.addChild(gun166_r1);
		setRotationAngle(gun166_r1, 0.0873F, 0.0F, 0.0F);
		gun166_r1.cubeList.add(new ModelBox(gun166_r1, 54, 33, -1.5F, -2.0F, -1.0F, 2, 1, 3, 0.001F, false));
		gun166_r1.cubeList.add(new ModelBox(gun166_r1, 56, 20, 0.2057F, -2.0F, -1.0F, 2, 1, 3, 0.0F, false));

		gun153_r1 = new ModelRenderer(this);
		gun153_r1.setRotationPoint(-1.3678F, 4.1387F, -0.4792F);
		mp5_stock.addChild(gun153_r1);
		setRotationAngle(gun153_r1, 0.2182F, 0.0F, -0.0873F);
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 48, 109, -1.0F, -5.0F, -1.0F, 3, 10, 2, 0.001F, false));

		gun154_r1 = new ModelRenderer(this);
		gun154_r1.setRotationPoint(-1.6787F, 0.5849F, -1.3565F);
		mp5_stock.addChild(gun154_r1);
		setRotationAngle(gun154_r1, 1.0036F, 0.0F, -0.0873F);
		gun154_r1.cubeList.add(new ModelBox(gun154_r1, 135, 115, -1.0F, -1.5F, -1.0F, 2, 2, 2, 0.0F, false));

		gun153_r2 = new ModelRenderer(this);
		gun153_r2.setRotationPoint(1.5779F, 0.5849F, -1.3565F);
		mp5_stock.addChild(gun153_r2);
		setRotationAngle(gun153_r2, 1.0036F, 0.0F, 0.0873F);
		gun153_r2.cubeList.add(new ModelBox(gun153_r2, 141, 0, -1.0F, -1.5F, -1.0F, 2, 2, 2, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(1.267F, 4.1387F, -0.4792F);
		mp5_stock.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.2182F, 0.0F, 0.0873F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 64, 109, -2.0F, -5.0F, -1.0F, 3, 10, 2, 0.001F, false));

		gun153_r3 = new ModelRenderer(this);
		gun153_r3.setRotationPoint(-1.6577F, -2.3085F, -2.296F);
		mp5_stock.addChild(gun153_r3);
		setRotationAngle(gun153_r3, 0.0F, 0.0F, 0.6109F);
		gun153_r3.cubeList.add(new ModelBox(gun153_r3, 169, 108, -1.0F, -1.0F, -1.0F, 2, 2, 3, 0.001F, false));

		gun152_r2 = new ModelRenderer(this);
		gun152_r2.setRotationPoint(1.5569F, -2.3085F, -2.296F);
		mp5_stock.addChild(gun152_r2);
		setRotationAngle(gun152_r2, 0.0F, 0.0F, -0.6109F);
		gun152_r2.cubeList.add(new ModelBox(gun152_r2, 169, 113, -1.0F, -1.0F, -1.0F, 2, 2, 3, 0.001F, false));

		gun152_r3 = new ModelRenderer(this);
		gun152_r3.setRotationPoint(-1.8051F, -0.7593F, 0.204F);
		mp5_stock.addChild(gun152_r3);
		setRotationAngle(gun152_r3, 0.0F, 0.0F, -0.1745F);
		gun152_r3.cubeList.add(new ModelBox(gun152_r3, 94, 10, -1.0F, -1.5F, -3.5F, 2, 3, 3, 0.0F, false));

		gun151_r1 = new ModelRenderer(this);
		gun151_r1.setRotationPoint(1.7043F, -0.7593F, 0.204F);
		mp5_stock.addChild(gun151_r1);
		setRotationAngle(gun151_r1, 0.0F, 0.0F, 0.1745F);
		gun151_r1.cubeList.add(new ModelBox(gun151_r1, 14, 96, -1.0F, -1.5F, -3.5F, 2, 3, 3, 0.0F, false));

		stock_mp5a5_connection2 = new ModelRenderer(this);
		stock_mp5a5_connection2.setRotationPoint(1.3599F, -2.9372F, -21.2683F);
		mp5_stock.addChild(stock_mp5a5_connection2);
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 33, 131, -1.9103F, -3.1757F, -2.0277F, 1, 1, 3, 0.0F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 137, 129, -1.0993F, -2.4325F, -2.0277F, 1, 1, 2, 0.0F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 135, 119, -2.7213F, -2.4325F, -2.0277F, 1, 1, 2, 0.0F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 155, 160, -1.7103F, 3.1243F, -2.0277F, 2, 2, 3, 0.0F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 93, 160, -3.1103F, 3.1243F, -2.0277F, 2, 2, 3, 0.001F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 121, 14, -0.1603F, 3.6243F, -1.5277F, 1, 1, 1, 0.0F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 121, 5, -3.6603F, 3.6243F, -1.0277F, 1, 1, 1, 0.0F, false));
		stock_mp5a5_connection2.cubeList.add(new ModelBox(stock_mp5a5_connection2, 93, 62, -3.4103F, -0.5502F, -0.0145F, 4, 4, 2, 0.0F, false));

		gun166_r2 = new ModelRenderer(this);
		gun166_r2.setRotationPoint(-1.9103F, -2.5348F, 0.6735F);
		stock_mp5a5_connection2.addChild(gun166_r2);
		setRotationAngle(gun166_r2, 0.3491F, 0.0F, 0.0F);
		gun166_r2.cubeList.add(new ModelBox(gun166_r2, 114, 120, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun165_r1 = new ModelRenderer(this);
		gun165_r1.setRotationPoint(-1.4103F, -1.7887F, 1.0027F);
		stock_mp5a5_connection2.addChild(gun165_r1);
		setRotationAngle(gun165_r1, 0.3491F, 0.0F, 0.0F);
		gun165_r1.cubeList.add(new ModelBox(gun165_r1, 23, 134, -1.0F, -0.5F, -0.5F, 2, 2, 1, 0.0F, false));

		gun165_r2 = new ModelRenderer(this);
		gun165_r2.setRotationPoint(-2.1103F, 3.7513F, 0.6335F);
		stock_mp5a5_connection2.addChild(gun165_r2);
		setRotationAngle(gun165_r2, -2.1143F, 0.0F, 0.0F);
		gun165_r2.cubeList.add(new ModelBox(gun165_r2, 88, 119, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.001F, false));
		gun165_r2.cubeList.add(new ModelBox(gun165_r2, 0, 122, 0.4F, -1.0F, -1.0F, 2, 2, 2, -0.001F, false));

		gun152_r4 = new ModelRenderer(this);
		gun152_r4.setRotationPoint(-3.6805F, 0.9601F, -0.0277F);
		stock_mp5a5_connection2.addChild(gun152_r4);
		setRotationAngle(gun152_r4, 0.0F, 0.0F, -0.3927F);
		gun152_r4.cubeList.add(new ModelBox(gun152_r4, 8, 161, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		gun151_r2 = new ModelRenderer(this);
		gun151_r2.setRotationPoint(0.8599F, 0.9601F, -0.0277F);
		stock_mp5a5_connection2.addChild(gun151_r2);
		setRotationAngle(gun151_r2, 0.0F, 0.0F, 0.3927F);
		gun151_r2.cubeList.add(new ModelBox(gun151_r2, 134, 161, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		gun153_r4 = new ModelRenderer(this);
		gun153_r4.setRotationPoint(-3.3332F, 2.7581F, -0.0277F);
		stock_mp5a5_connection2.addChild(gun153_r4);
		setRotationAngle(gun153_r4, 0.0F, 0.0F, 0.3927F);
		gun153_r4.cubeList.add(new ModelBox(gun153_r4, 161, 161, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		gun152_r5 = new ModelRenderer(this);
		gun152_r5.setRotationPoint(0.5126F, 2.7581F, -0.0277F);
		stock_mp5a5_connection2.addChild(gun152_r5);
		setRotationAngle(gun152_r5, 0.0F, 0.0F, -0.3927F);
		gun152_r5.cubeList.add(new ModelBox(gun152_r5, 0, 162, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		gun154_r2 = new ModelRenderer(this);
		gun154_r2.setRotationPoint(-3.9324F, 2.8981F, -1.4277F);
		stock_mp5a5_connection2.addChild(gun154_r2);
		setRotationAngle(gun154_r2, 0.0F, 0.0F, -0.3927F);
		gun154_r2.cubeList.add(new ModelBox(gun154_r2, 44, 134, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.401F, false));

		gun153_r5 = new ModelRenderer(this);
		gun153_r5.setRotationPoint(1.1117F, 2.8981F, -1.4277F);
		stock_mp5a5_connection2.addChild(gun153_r5);
		setRotationAngle(gun153_r5, 0.0F, 0.0F, 0.3927F);
		gun153_r5.cubeList.add(new ModelBox(gun153_r5, 134, 46, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.401F, false));

		gun153_r6 = new ModelRenderer(this);
		gun153_r6.setRotationPoint(-3.9324F, 2.8981F, 0.3723F);
		stock_mp5a5_connection2.addChild(gun153_r6);
		setRotationAngle(gun153_r6, 0.0F, 0.0F, -0.3927F);
		gun153_r6.cubeList.add(new ModelBox(gun153_r6, 86, 163, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.4F, false));

		gun152_r6 = new ModelRenderer(this);
		gun152_r6.setRotationPoint(1.1117F, 2.8981F, 0.3723F);
		stock_mp5a5_connection2.addChild(gun152_r6);
		setRotationAngle(gun152_r6, 0.0F, 0.0F, 0.3927F);
		gun152_r6.cubeList.add(new ModelBox(gun152_r6, 0, 168, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.4F, false));

		gun153_r7 = new ModelRenderer(this);
		gun153_r7.setRotationPoint(-4.2797F, 0.8202F, -0.4277F);
		stock_mp5a5_connection2.addChild(gun153_r7);
		setRotationAngle(gun153_r7, 0.0F, 0.0F, 0.3927F);
		gun153_r7.cubeList.add(new ModelBox(gun153_r7, 134, 49, -0.5F, -0.5F, -2.0F, 1, 1, 2, -0.401F, false));
		gun153_r7.cubeList.add(new ModelBox(gun153_r7, 168, 84, -0.5F, -0.5F, -1.2F, 1, 1, 4, -0.4F, false));

		gun152_r7 = new ModelRenderer(this);
		gun152_r7.setRotationPoint(1.459F, 0.8202F, -0.4277F);
		stock_mp5a5_connection2.addChild(gun152_r7);
		setRotationAngle(gun152_r7, 0.0F, 0.0F, -0.3927F);
		gun152_r7.cubeList.add(new ModelBox(gun152_r7, 54, 134, -0.5F, -0.5F, -2.0F, 1, 1, 2, -0.401F, false));

		gun151_r3 = new ModelRenderer(this);
		gun151_r3.setRotationPoint(1.459F, 0.8202F, 0.3723F);
		stock_mp5a5_connection2.addChild(gun151_r3);
		setRotationAngle(gun151_r3, 0.0F, 0.0F, -0.3927F);
		gun151_r3.cubeList.add(new ModelBox(gun151_r3, 168, 89, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.4F, false));

		gun151_r4 = new ModelRenderer(this);
		gun151_r4.setRotationPoint(-3.7443F, 1.7723F, -0.0277F);
		stock_mp5a5_connection2.addChild(gun151_r4);
		setRotationAngle(gun151_r4, 0.0F, 0.0F, -0.1745F);
		gun151_r4.cubeList.add(new ModelBox(gun151_r4, 34, 109, -0.5F, -1.0F, -2.0F, 2, 2, 4, 0.002F, false));

		gun150_r1 = new ModelRenderer(this);
		gun150_r1.setRotationPoint(0.9236F, 1.7723F, -0.0277F);
		stock_mp5a5_connection2.addChild(gun150_r1);
		setRotationAngle(gun150_r1, 0.0F, 0.0F, 0.1745F);
		gun150_r1.cubeList.add(new ModelBox(gun150_r1, 10, 113, -1.5F, -1.0F, -2.0F, 2, 2, 4, 0.002F, false));

		gun151_r5 = new ModelRenderer(this);
		gun151_r5.setRotationPoint(-2.834F, -0.3144F, -0.0585F);
		stock_mp5a5_connection2.addChild(gun151_r5);
		setRotationAngle(gun151_r5, 0.0F, -0.7418F, 0.3927F);
		gun151_r5.cubeList.add(new ModelBox(gun151_r5, 15, 136, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		gun150_r2 = new ModelRenderer(this);
		gun150_r2.setRotationPoint(0.0134F, -0.3144F, -0.0585F);
		stock_mp5a5_connection2.addChild(gun150_r2);
		setRotationAngle(gun150_r2, 0.0F, 0.7418F, -0.3927F);
		gun150_r2.cubeList.add(new ModelBox(gun150_r2, 86, 136, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		gun151_r6 = new ModelRenderer(this);
		gun151_r6.setRotationPoint(-3.044F, -0.3469F, 1.1865F);
		stock_mp5a5_connection2.addChild(gun151_r6);
		setRotationAngle(gun151_r6, 0.3491F, 0.0F, 0.3927F);
		gun151_r6.cubeList.add(new ModelBox(gun151_r6, 60, 27, -0.5F, -2.0F, -0.5F, 1, 3, 1, 0.0F, false));

		gun152_r8 = new ModelRenderer(this);
		gun152_r8.setRotationPoint(-2.4147F, -1.2506F, 1.0678F);
		stock_mp5a5_connection2.addChild(gun152_r8);
		setRotationAngle(gun152_r8, 0.3491F, -0.4363F, 0.1745F);
		gun152_r8.cubeList.add(new ModelBox(gun152_r8, 115, 106, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		gun151_r7 = new ModelRenderer(this);
		gun151_r7.setRotationPoint(-0.4059F, -1.2506F, 1.0678F);
		stock_mp5a5_connection2.addChild(gun151_r7);
		setRotationAngle(gun151_r7, 0.3491F, 0.4363F, -0.1745F);
		gun151_r7.cubeList.add(new ModelBox(gun151_r7, 110, 115, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		gun150_r3 = new ModelRenderer(this);
		gun150_r3.setRotationPoint(0.2234F, -0.3469F, 1.1865F);
		stock_mp5a5_connection2.addChild(gun150_r3);
		setRotationAngle(gun150_r3, 0.3491F, 0.0F, -0.3927F);
		gun150_r3.cubeList.add(new ModelBox(gun150_r3, 60, 53, -0.5F, -2.0F, -0.5F, 1, 3, 1, 0.0F, false));

		gun151_r8 = new ModelRenderer(this);
		gun151_r8.setRotationPoint(-3.5031F, 0.7614F, 1.4723F);
		stock_mp5a5_connection2.addChild(gun151_r8);
		setRotationAngle(gun151_r8, 0.0F, 0.0F, 0.3927F);
		gun151_r8.cubeList.add(new ModelBox(gun151_r8, 117, 94, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.001F, false));

		gun150_r4 = new ModelRenderer(this);
		gun150_r4.setRotationPoint(0.6825F, 0.7614F, 1.4723F);
		stock_mp5a5_connection2.addChild(gun150_r4);
		setRotationAngle(gun150_r4, 0.0F, 0.0F, -0.3927F);
		gun150_r4.cubeList.add(new ModelBox(gun150_r4, 121, 76, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.001F, false));

		gun152_r9 = new ModelRenderer(this);
		gun152_r9.setRotationPoint(-0.0699F, -1.7793F, -1.5277F);
		stock_mp5a5_connection2.addChild(gun152_r9);
		setRotationAngle(gun152_r9, 0.0F, 0.0F, -0.3927F);
		gun152_r9.cubeList.add(new ModelBox(gun152_r9, 123, 32, -0.5F, -0.8F, -0.5F, 1, 4, 1, -0.4F, false));

		gun151_r9 = new ModelRenderer(this);
		gun151_r9.setRotationPoint(-2.7507F, -1.7793F, -1.5277F);
		stock_mp5a5_connection2.addChild(gun151_r9);
		setRotationAngle(gun151_r9, 0.0F, 0.0F, 0.3927F);
		gun151_r9.cubeList.add(new ModelBox(gun151_r9, 124, 91, -0.5F, -0.8F, -0.5F, 1, 4, 1, -0.4F, false));

		gun150_r5 = new ModelRenderer(this);
		gun150_r5.setRotationPoint(-2.4507F, -1.7793F, 0.4723F);
		stock_mp5a5_connection2.addChild(gun150_r5);
		setRotationAngle(gun150_r5, 0.0F, 0.0F, 0.3927F);
		gun150_r5.cubeList.add(new ModelBox(gun150_r5, 0, 137, -0.5F, -0.5F, -0.5F, 1, 4, 1, 0.001F, false));

		gun149_r1 = new ModelRenderer(this);
		gun149_r1.setRotationPoint(-0.3699F, -1.7793F, 0.4723F);
		stock_mp5a5_connection2.addChild(gun149_r1);
		setRotationAngle(gun149_r1, 0.0F, 0.0F, -0.3927F);
		gun149_r1.cubeList.add(new ModelBox(gun149_r1, 71, 137, -0.5F, -0.5F, -0.5F, 1, 4, 1, 0.001F, false));

		gun147_r1 = new ModelRenderer(this);
		gun147_r1.setRotationPoint(-1.9412F, -2.4693F, -0.5277F);
		stock_mp5a5_connection2.addChild(gun147_r1);
		setRotationAngle(gun147_r1, 0.0F, 0.0F, -0.7418F);
		gun147_r1.cubeList.add(new ModelBox(gun147_r1, 8, 122, -0.6F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));
		gun147_r1.cubeList.add(new ModelBox(gun147_r1, 81, 127, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.001F, false));

		gun146_r1 = new ModelRenderer(this);
		gun146_r1.setRotationPoint(-0.8795F, -2.4693F, -0.5277F);
		stock_mp5a5_connection2.addChild(gun146_r1);
		setRotationAngle(gun146_r1, 0.0F, 0.0F, 0.7418F);
		gun146_r1.cubeList.add(new ModelBox(gun146_r1, 48, 126, -0.4F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));
		gun146_r1.cubeList.add(new ModelBox(gun146_r1, 102, 129, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.001F, false));

		gun57_r1 = new ModelRenderer(this);
		gun57_r1.setRotationPoint(-3.1138F, 0.0022F, -13.0277F);
		stock_mp5a5_connection2.addChild(gun57_r1);
		setRotationAngle(gun57_r1, 0.0F, 0.0F, -2.5297F);
		gun57_r1.cubeList.add(new ModelBox(gun57_r1, 137, 137, -0.5F, -0.5F, 11.0F, 1, 1, 2, 0.0F, false));

		gun59_r4 = new ModelRenderer(this);
		gun59_r4.setRotationPoint(-3.431F, 0.7211F, -1.0277F);
		stock_mp5a5_connection2.addChild(gun59_r4);
		setRotationAngle(gun59_r4, 0.0F, 0.0F, -2.9224F);
		gun59_r4.cubeList.add(new ModelBox(gun59_r4, 92, 139, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		gun56_r1 = new ModelRenderer(this);
		gun56_r1.setRotationPoint(0.2932F, 0.0022F, -13.0277F);
		stock_mp5a5_connection2.addChild(gun56_r1);
		setRotationAngle(gun56_r1, 0.0F, 0.0F, 2.5297F);
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 121, 139, -0.5F, -0.5F, 11.0F, 1, 1, 2, 0.0F, false));

		gun58_r2 = new ModelRenderer(this);
		gun58_r2.setRotationPoint(0.6104F, 0.7211F, -1.0277F);
		stock_mp5a5_connection2.addChild(gun58_r2);
		setRotationAngle(gun58_r2, 0.0F, 0.0F, 2.9224F);
		gun58_r2.cubeList.add(new ModelBox(gun58_r2, 137, 140, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		gun57_r2 = new ModelRenderer(this);
		gun57_r2.setRotationPoint(-0.2749F, -0.5405F, -13.0277F);
		stock_mp5a5_connection2.addChild(gun57_r2);
		setRotationAngle(gun57_r2, 0.0F, 0.0F, 2.137F);
		gun57_r2.cubeList.add(new ModelBox(gun57_r2, 36, 141, -0.5F, -0.5F, 11.0F, 1, 1, 2, 0.0F, false));

		gun58_r3 = new ModelRenderer(this);
		gun58_r3.setRotationPoint(-2.5457F, -0.5405F, -13.0277F);
		stock_mp5a5_connection2.addChild(gun58_r3);
		setRotationAngle(gun58_r3, 0.0F, 0.0F, -2.137F);
		gun58_r3.cubeList.add(new ModelBox(gun58_r3, 52, 142, -0.5F, -0.5F, 11.0F, 1, 1, 2, 0.0F, false));

		gun76_r15 = new ModelRenderer(this);
		gun76_r15.setRotationPoint(-2.0235F, -1.318F, -1.0277F);
		stock_mp5a5_connection2.addChild(gun76_r15);
		setRotationAngle(gun76_r15, 0.0F, 0.0F, -2.1935F);
		gun76_r15.cubeList.add(new ModelBox(gun76_r15, 61, 142, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		gun75_r13 = new ModelRenderer(this);
		gun75_r13.setRotationPoint(-0.7971F, -1.318F, -14.0277F);
		stock_mp5a5_connection2.addChild(gun75_r13);
		setRotationAngle(gun75_r13, 0.0F, 0.0F, 2.1935F);
		gun75_r13.cubeList.add(new ModelBox(gun75_r13, 92, 142, -0.5F, -0.5F, 12.0F, 1, 1, 2, 0.0F, false));

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(1.2704F, 0.7603F, -0.2777F);
		stock_mp5a5_connection2.addChild(bone73);
		bone73.cubeList.add(new ModelBox(bone73, 60, 49, -2.3998F, -3.8795F, -0.5F, 2, 1, 1, -0.3F, false));

		gun148_r1 = new ModelRenderer(this);
		gun148_r1.setRotationPoint(-0.0351F, -0.0848F, 0.0F);
		bone73.addChild(gun148_r1);
		setRotationAngle(gun148_r1, 0.0F, 0.0F, -0.7854F);
		gun148_r1.cubeList.add(new ModelBox(gun148_r1, 39, 59, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.3F, false));

		gun148_r2 = new ModelRenderer(this);
		gun148_r2.setRotationPoint(-0.2341F, -1.9324F, 0.0F);
		bone73.addChild(gun148_r2);
		setRotationAngle(gun148_r2, 0.0F, 0.0F, -0.3927F);
		gun148_r2.cubeList.add(new ModelBox(gun148_r2, 137, 132, -0.5F, -2.0F, -0.5F, 1, 4, 1, -0.299F, false));

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone73.addChild(bone74);
		

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(0.0897F, 36.6243F, -4.0277F);
		stock_mp5a5_connection2.addChild(bone49);
		bone49.cubeList.add(new ModelBox(bone49, 131, 33, -2.5F, -36.4745F, 8.8132F, 2, 2, 1, -0.2F, false));
		bone49.cubeList.add(new ModelBox(bone49, 99, 90, -2.5F, -34.1745F, 5.0132F, 2, 3, 1, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 99, 83, -2.5F, -34.1745F, 5.6132F, 2, 3, 1, -0.001F, false));

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(-3.0F, -34.9245F, 6.0132F);
		bone49.addChild(bone47);
		setRotationAngle(bone47, 0.0F, 0.0F, -1.5708F);
		

		gun167_r3 = new ModelRenderer(this);
		gun167_r3.setRotationPoint(0.0F, -0.1755F, 0.0F);
		bone47.addChild(gun167_r3);
		setRotationAngle(gun167_r3, 0.0F, 0.0F, 0.4363F);
		gun167_r3.cubeList.add(new ModelBox(gun167_r3, 107, 92, 0.6125F, -0.169F, 0.0F, 1, 1, 3, 0.0F, false));
		gun167_r3.cubeList.add(new ModelBox(gun167_r3, 107, 96, 0.3625F, -0.169F, 0.0F, 1, 1, 3, 0.001F, false));

		gun168_r2 = new ModelRenderer(this);
		gun168_r2.setRotationPoint(0.0F, -0.1755F, 0.0F);
		bone47.addChild(gun168_r2);
		setRotationAngle(gun168_r2, 0.0F, 0.0F, -0.4363F);
		gun168_r2.cubeList.add(new ModelBox(gun168_r2, 109, 67, -0.8875F, 0.169F, 0.0F, 1, 1, 3, 0.0F, false));
		gun168_r2.cubeList.add(new ModelBox(gun168_r2, 109, 71, -0.6375F, 0.169F, 0.0F, 1, 1, 3, 0.002F, false));

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(0.0F, -34.9245F, 6.0132F);
		bone49.addChild(bone46);
		setRotationAngle(bone46, 0.0F, 0.0F, 1.5708F);
		

		gun166_r3 = new ModelRenderer(this);
		gun166_r3.setRotationPoint(0.0F, -0.1755F, 0.0F);
		bone46.addChild(gun166_r3);
		setRotationAngle(gun166_r3, 0.0F, 0.0F, -0.4363F);
		gun166_r3.cubeList.add(new ModelBox(gun166_r3, 88, 110, -1.6125F, -0.169F, 0.0F, 1, 1, 3, 0.0F, false));
		gun166_r3.cubeList.add(new ModelBox(gun166_r3, 99, 110, -1.3625F, -0.169F, 0.0F, 1, 1, 3, 0.002F, false));

		gun167_r4 = new ModelRenderer(this);
		gun167_r4.setRotationPoint(0.0F, -0.1755F, 0.0F);
		bone46.addChild(gun167_r4);
		setRotationAngle(gun167_r4, 0.0F, 0.0F, 0.4363F);
		gun167_r4.cubeList.add(new ModelBox(gun167_r4, 0, 113, -0.1125F, 0.169F, 0.0F, 1, 1, 3, 0.0F, false));
		gun167_r4.cubeList.add(new ModelBox(gun167_r4, 78, 115, -0.3625F, 0.169F, 0.0F, 1, 1, 3, 0.001F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(-1.5F, -33.4245F, 6.0132F);
		bone49.addChild(bone48);
		setRotationAngle(bone48, 0.0F, 0.0F, -3.1416F);
		

		gun166_r4 = new ModelRenderer(this);
		gun166_r4.setRotationPoint(0.0F, -0.1755F, 0.0F);
		bone48.addChild(gun166_r4);
		setRotationAngle(gun166_r4, 0.0F, 0.0F, -0.4363F);
		gun166_r4.cubeList.add(new ModelBox(gun166_r4, 107, 9, -1.419F, 0.3625F, 0.0F, 1, 1, 3, -0.001F, false));
		gun166_r4.cubeList.add(new ModelBox(gun166_r4, 107, 13, -1.169F, 0.3625F, 0.0F, 1, 1, 3, 0.002F, false));

		gun167_r5 = new ModelRenderer(this);
		gun167_r5.setRotationPoint(0.0F, -0.1755F, 0.0F);
		bone48.addChild(gun167_r5);
		setRotationAngle(gun167_r5, 0.0F, 0.0F, 0.4363F);
		gun167_r5.cubeList.add(new ModelBox(gun167_r5, 107, 83, 0.419F, 0.3625F, 0.0F, 1, 1, 3, -0.001F, false));
		gun167_r5.cubeList.add(new ModelBox(gun167_r5, 107, 87, 0.169F, 0.3625F, 0.0F, 1, 1, 3, 0.001F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-1.5F, -36.4245F, 6.0132F);
		bone49.addChild(bone20);
		

		gun165_r3 = new ModelRenderer(this);
		gun165_r3.setRotationPoint(0.0F, -0.5755F, 0.0F);
		bone20.addChild(gun165_r3);
		setRotationAngle(gun165_r3, 0.0F, 0.0F, -0.4363F);
		gun165_r3.cubeList.add(new ModelBox(gun165_r3, 0, 117, -1.25F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));
		gun165_r3.cubeList.add(new ModelBox(gun165_r3, 78, 119, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.002F, false));

		gun166_r5 = new ModelRenderer(this);
		gun166_r5.setRotationPoint(0.0F, -0.5755F, 0.0F);
		bone20.addChild(gun166_r5);
		setRotationAngle(gun166_r5, 0.0F, 0.0F, 0.4363F);
		gun166_r5.cubeList.add(new ModelBox(gun166_r5, 88, 115, 0.25F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));
		gun166_r5.cubeList.add(new ModelBox(gun166_r5, 119, 49, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.001F, false));

		mp5_stock_adapter = new ModelRenderer(this);
		mp5_stock_adapter.setRotationPoint(-1.4496F, -9.6871F, 25.296F);
		

		stock_mp5a5_connection4 = new ModelRenderer(this);
		stock_mp5a5_connection4.setRotationPoint(1.3599F, -2.9372F, -21.2683F);
		mp5_stock_adapter.addChild(stock_mp5a5_connection4);
		stock_mp5a5_connection4.cubeList.add(new ModelBox(stock_mp5a5_connection4, 33, 131, -1.9103F, -3.1757F, -2.0277F, 1, 1, 3, 0.0F, false));
		stock_mp5a5_connection4.cubeList.add(new ModelBox(stock_mp5a5_connection4, 137, 129, -1.0993F, -2.4325F, -2.0277F, 1, 1, 2, 0.0F, false));
		stock_mp5a5_connection4.cubeList.add(new ModelBox(stock_mp5a5_connection4, 135, 119, -2.7213F, -2.4325F, -2.0277F, 1, 1, 2, 0.0F, false));
		stock_mp5a5_connection4.cubeList.add(new ModelBox(stock_mp5a5_connection4, 155, 160, -1.7103F, 3.1243F, -2.0277F, 2, 2, 3, 0.0F, false));
		stock_mp5a5_connection4.cubeList.add(new ModelBox(stock_mp5a5_connection4, 93, 160, -3.1103F, 3.1243F, -2.0277F, 2, 2, 3, 0.001F, false));
		stock_mp5a5_connection4.cubeList.add(new ModelBox(stock_mp5a5_connection4, 121, 14, -0.1603F, 3.6243F, -1.5277F, 1, 1, 1, 0.0F, false));
		stock_mp5a5_connection4.cubeList.add(new ModelBox(stock_mp5a5_connection4, 121, 5, -3.6603F, 3.6243F, -1.0277F, 1, 1, 1, 0.0F, false));
		stock_mp5a5_connection4.cubeList.add(new ModelBox(stock_mp5a5_connection4, 93, 62, -3.4103F, -0.5502F, -0.0145F, 4, 4, 2, 0.0F, false));

		gun167_r6 = new ModelRenderer(this);
		gun167_r6.setRotationPoint(-1.9103F, -2.5348F, 0.6735F);
		stock_mp5a5_connection4.addChild(gun167_r6);
		setRotationAngle(gun167_r6, 0.3491F, 0.0F, 0.0F);
		gun167_r6.cubeList.add(new ModelBox(gun167_r6, 114, 120, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun166_r6 = new ModelRenderer(this);
		gun166_r6.setRotationPoint(-1.4103F, -1.7887F, 1.0027F);
		stock_mp5a5_connection4.addChild(gun166_r6);
		setRotationAngle(gun166_r6, 0.3491F, 0.0F, 0.0F);
		gun166_r6.cubeList.add(new ModelBox(gun166_r6, 23, 134, -1.0F, -0.5F, -0.5F, 2, 2, 1, 0.0F, false));

		gun166_r7 = new ModelRenderer(this);
		gun166_r7.setRotationPoint(-2.1103F, 3.7513F, 0.6335F);
		stock_mp5a5_connection4.addChild(gun166_r7);
		setRotationAngle(gun166_r7, -2.1143F, 0.0F, 0.0F);
		gun166_r7.cubeList.add(new ModelBox(gun166_r7, 88, 119, -1.0F, -1.001F, -1.0F, 2, 2, 2, -0.001F, false));
		gun166_r7.cubeList.add(new ModelBox(gun166_r7, 0, 122, 0.4F, -1.0F, -1.0F, 2, 2, 2, -0.001F, false));

		gun153_r8 = new ModelRenderer(this);
		gun153_r8.setRotationPoint(-3.6805F, 0.9601F, -0.0277F);
		stock_mp5a5_connection4.addChild(gun153_r8);
		setRotationAngle(gun153_r8, 0.0F, 0.0F, -0.3927F);
		gun153_r8.cubeList.add(new ModelBox(gun153_r8, 8, 161, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		gun152_r10 = new ModelRenderer(this);
		gun152_r10.setRotationPoint(0.8599F, 0.9601F, -0.0277F);
		stock_mp5a5_connection4.addChild(gun152_r10);
		setRotationAngle(gun152_r10, 0.0F, 0.0F, 0.3927F);
		gun152_r10.cubeList.add(new ModelBox(gun152_r10, 134, 161, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		gun154_r3 = new ModelRenderer(this);
		gun154_r3.setRotationPoint(-3.3332F, 2.7581F, -0.0277F);
		stock_mp5a5_connection4.addChild(gun154_r3);
		setRotationAngle(gun154_r3, 0.0F, 0.0F, 0.3927F);
		gun154_r3.cubeList.add(new ModelBox(gun154_r3, 161, 161, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		gun153_r9 = new ModelRenderer(this);
		gun153_r9.setRotationPoint(0.5126F, 2.7581F, -0.0277F);
		stock_mp5a5_connection4.addChild(gun153_r9);
		setRotationAngle(gun153_r9, 0.0F, 0.0F, -0.3927F);
		gun153_r9.cubeList.add(new ModelBox(gun153_r9, 0, 162, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		gun155_r1 = new ModelRenderer(this);
		gun155_r1.setRotationPoint(-3.9324F, 2.8981F, -1.4277F);
		stock_mp5a5_connection4.addChild(gun155_r1);
		setRotationAngle(gun155_r1, 0.0F, 0.0F, -0.3927F);
		gun155_r1.cubeList.add(new ModelBox(gun155_r1, 44, 134, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.401F, false));

		gun154_r4 = new ModelRenderer(this);
		gun154_r4.setRotationPoint(1.1117F, 2.8981F, -1.4277F);
		stock_mp5a5_connection4.addChild(gun154_r4);
		setRotationAngle(gun154_r4, 0.0F, 0.0F, 0.3927F);
		gun154_r4.cubeList.add(new ModelBox(gun154_r4, 134, 46, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.401F, false));

		gun154_r5 = new ModelRenderer(this);
		gun154_r5.setRotationPoint(-3.9324F, 2.8981F, 0.3723F);
		stock_mp5a5_connection4.addChild(gun154_r5);
		setRotationAngle(gun154_r5, 0.0F, 0.0F, -0.3927F);
		gun154_r5.cubeList.add(new ModelBox(gun154_r5, 86, 163, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.4F, false));

		gun153_r10 = new ModelRenderer(this);
		gun153_r10.setRotationPoint(1.1117F, 2.8981F, 0.3723F);
		stock_mp5a5_connection4.addChild(gun153_r10);
		setRotationAngle(gun153_r10, 0.0F, 0.0F, 0.3927F);
		gun153_r10.cubeList.add(new ModelBox(gun153_r10, 0, 168, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.4F, false));

		gun154_r6 = new ModelRenderer(this);
		gun154_r6.setRotationPoint(-4.2797F, 0.8202F, -0.4277F);
		stock_mp5a5_connection4.addChild(gun154_r6);
		setRotationAngle(gun154_r6, 0.0F, 0.0F, 0.3927F);
		gun154_r6.cubeList.add(new ModelBox(gun154_r6, 134, 49, -0.5F, -0.5F, -2.0F, 1, 1, 2, -0.401F, false));
		gun154_r6.cubeList.add(new ModelBox(gun154_r6, 168, 84, -0.5F, -0.5F, -1.2F, 1, 1, 4, -0.4F, false));

		gun153_r11 = new ModelRenderer(this);
		gun153_r11.setRotationPoint(1.459F, 0.8202F, -0.4277F);
		stock_mp5a5_connection4.addChild(gun153_r11);
		setRotationAngle(gun153_r11, 0.0F, 0.0F, -0.3927F);
		gun153_r11.cubeList.add(new ModelBox(gun153_r11, 54, 134, -0.5F, -0.5F, -2.0F, 1, 1, 2, -0.401F, false));

		gun152_r11 = new ModelRenderer(this);
		gun152_r11.setRotationPoint(1.459F, 0.8202F, 0.3723F);
		stock_mp5a5_connection4.addChild(gun152_r11);
		setRotationAngle(gun152_r11, 0.0F, 0.0F, -0.3927F);
		gun152_r11.cubeList.add(new ModelBox(gun152_r11, 168, 89, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.4F, false));

		gun152_r12 = new ModelRenderer(this);
		gun152_r12.setRotationPoint(-3.7443F, 1.7723F, -0.0277F);
		stock_mp5a5_connection4.addChild(gun152_r12);
		setRotationAngle(gun152_r12, 0.0F, 0.0F, -0.1745F);
		gun152_r12.cubeList.add(new ModelBox(gun152_r12, 34, 109, -0.5F, -1.0F, -2.0F, 2, 2, 4, 0.002F, false));

		gun151_r10 = new ModelRenderer(this);
		gun151_r10.setRotationPoint(0.9236F, 1.7723F, -0.0277F);
		stock_mp5a5_connection4.addChild(gun151_r10);
		setRotationAngle(gun151_r10, 0.0F, 0.0F, 0.1745F);
		gun151_r10.cubeList.add(new ModelBox(gun151_r10, 10, 113, -1.5F, -1.0F, -2.0F, 2, 2, 4, 0.002F, false));

		gun152_r13 = new ModelRenderer(this);
		gun152_r13.setRotationPoint(-2.834F, -0.3144F, -0.0585F);
		stock_mp5a5_connection4.addChild(gun152_r13);
		setRotationAngle(gun152_r13, 0.0F, -0.7418F, 0.3927F);
		gun152_r13.cubeList.add(new ModelBox(gun152_r13, 15, 136, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		gun151_r11 = new ModelRenderer(this);
		gun151_r11.setRotationPoint(0.0134F, -0.3144F, -0.0585F);
		stock_mp5a5_connection4.addChild(gun151_r11);
		setRotationAngle(gun151_r11, 0.0F, 0.7418F, -0.3927F);
		gun151_r11.cubeList.add(new ModelBox(gun151_r11, 86, 136, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		gun152_r14 = new ModelRenderer(this);
		gun152_r14.setRotationPoint(-3.044F, -0.3469F, 1.1865F);
		stock_mp5a5_connection4.addChild(gun152_r14);
		setRotationAngle(gun152_r14, 0.3491F, 0.0F, 0.3927F);
		gun152_r14.cubeList.add(new ModelBox(gun152_r14, 60, 27, -0.5F, -2.0F, -0.5F, 1, 3, 1, 0.0F, false));

		gun153_r12 = new ModelRenderer(this);
		gun153_r12.setRotationPoint(-2.4147F, -1.2506F, 1.0678F);
		stock_mp5a5_connection4.addChild(gun153_r12);
		setRotationAngle(gun153_r12, 0.3491F, -0.4363F, 0.1745F);
		gun153_r12.cubeList.add(new ModelBox(gun153_r12, 115, 106, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		gun152_r15 = new ModelRenderer(this);
		gun152_r15.setRotationPoint(-0.4059F, -1.2506F, 1.0678F);
		stock_mp5a5_connection4.addChild(gun152_r15);
		setRotationAngle(gun152_r15, 0.3491F, 0.4363F, -0.1745F);
		gun152_r15.cubeList.add(new ModelBox(gun152_r15, 110, 115, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		gun151_r12 = new ModelRenderer(this);
		gun151_r12.setRotationPoint(0.2234F, -0.3469F, 1.1865F);
		stock_mp5a5_connection4.addChild(gun151_r12);
		setRotationAngle(gun151_r12, 0.3491F, 0.0F, -0.3927F);
		gun151_r12.cubeList.add(new ModelBox(gun151_r12, 60, 53, -0.5F, -2.0F, -0.5F, 1, 3, 1, 0.0F, false));

		gun152_r16 = new ModelRenderer(this);
		gun152_r16.setRotationPoint(-3.5031F, 0.7614F, 1.4723F);
		stock_mp5a5_connection4.addChild(gun152_r16);
		setRotationAngle(gun152_r16, 0.0F, 0.0F, 0.3927F);
		gun152_r16.cubeList.add(new ModelBox(gun152_r16, 117, 94, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.001F, false));

		gun151_r13 = new ModelRenderer(this);
		gun151_r13.setRotationPoint(0.6825F, 0.7614F, 1.4723F);
		stock_mp5a5_connection4.addChild(gun151_r13);
		setRotationAngle(gun151_r13, 0.0F, 0.0F, -0.3927F);
		gun151_r13.cubeList.add(new ModelBox(gun151_r13, 121, 76, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.001F, false));

		gun153_r13 = new ModelRenderer(this);
		gun153_r13.setRotationPoint(-0.0699F, -1.7793F, -1.5277F);
		stock_mp5a5_connection4.addChild(gun153_r13);
		setRotationAngle(gun153_r13, 0.0F, 0.0F, -0.3927F);
		gun153_r13.cubeList.add(new ModelBox(gun153_r13, 123, 32, -0.5F, -0.8F, -0.5F, 1, 4, 1, -0.4F, false));

		gun152_r17 = new ModelRenderer(this);
		gun152_r17.setRotationPoint(-2.7507F, -1.7793F, -1.5277F);
		stock_mp5a5_connection4.addChild(gun152_r17);
		setRotationAngle(gun152_r17, 0.0F, 0.0F, 0.3927F);
		gun152_r17.cubeList.add(new ModelBox(gun152_r17, 124, 91, -0.5F, -0.8F, -0.5F, 1, 4, 1, -0.4F, false));

		gun151_r14 = new ModelRenderer(this);
		gun151_r14.setRotationPoint(-2.4507F, -1.7793F, 0.4723F);
		stock_mp5a5_connection4.addChild(gun151_r14);
		setRotationAngle(gun151_r14, 0.0F, 0.0F, 0.3927F);
		gun151_r14.cubeList.add(new ModelBox(gun151_r14, 0, 137, -0.5F, -0.5F, -0.5F, 1, 4, 1, 0.001F, false));

		gun150_r6 = new ModelRenderer(this);
		gun150_r6.setRotationPoint(-0.3699F, -1.7793F, 0.4723F);
		stock_mp5a5_connection4.addChild(gun150_r6);
		setRotationAngle(gun150_r6, 0.0F, 0.0F, -0.3927F);
		gun150_r6.cubeList.add(new ModelBox(gun150_r6, 71, 137, -0.5F, -0.5F, -0.5F, 1, 4, 1, 0.001F, false));

		gun148_r3 = new ModelRenderer(this);
		gun148_r3.setRotationPoint(-1.9412F, -2.4693F, -0.5277F);
		stock_mp5a5_connection4.addChild(gun148_r3);
		setRotationAngle(gun148_r3, 0.0F, 0.0F, -0.7418F);
		gun148_r3.cubeList.add(new ModelBox(gun148_r3, 8, 122, -0.6F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));
		gun148_r3.cubeList.add(new ModelBox(gun148_r3, 81, 127, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.001F, false));

		gun147_r2 = new ModelRenderer(this);
		gun147_r2.setRotationPoint(-0.8795F, -2.4693F, -0.5277F);
		stock_mp5a5_connection4.addChild(gun147_r2);
		setRotationAngle(gun147_r2, 0.0F, 0.0F, 0.7418F);
		gun147_r2.cubeList.add(new ModelBox(gun147_r2, 48, 126, -0.4F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));
		gun147_r2.cubeList.add(new ModelBox(gun147_r2, 102, 129, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.001F, false));

		gun58_r4 = new ModelRenderer(this);
		gun58_r4.setRotationPoint(-3.1138F, 0.0022F, -13.0277F);
		stock_mp5a5_connection4.addChild(gun58_r4);
		setRotationAngle(gun58_r4, 0.0F, 0.0F, -2.5297F);
		gun58_r4.cubeList.add(new ModelBox(gun58_r4, 137, 137, -0.5F, -0.5F, 11.0F, 1, 1, 2, 0.0F, false));

		gun60_r7 = new ModelRenderer(this);
		gun60_r7.setRotationPoint(-3.431F, 0.7211F, -1.0277F);
		stock_mp5a5_connection4.addChild(gun60_r7);
		setRotationAngle(gun60_r7, 0.0F, 0.0F, -2.9224F);
		gun60_r7.cubeList.add(new ModelBox(gun60_r7, 92, 139, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		gun57_r3 = new ModelRenderer(this);
		gun57_r3.setRotationPoint(0.2932F, 0.0022F, -13.0277F);
		stock_mp5a5_connection4.addChild(gun57_r3);
		setRotationAngle(gun57_r3, 0.0F, 0.0F, 2.5297F);
		gun57_r3.cubeList.add(new ModelBox(gun57_r3, 121, 139, -0.5F, -0.5F, 11.0F, 1, 1, 2, 0.0F, false));

		gun59_r5 = new ModelRenderer(this);
		gun59_r5.setRotationPoint(0.6104F, 0.7211F, -1.0277F);
		stock_mp5a5_connection4.addChild(gun59_r5);
		setRotationAngle(gun59_r5, 0.0F, 0.0F, 2.9224F);
		gun59_r5.cubeList.add(new ModelBox(gun59_r5, 137, 140, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		gun58_r5 = new ModelRenderer(this);
		gun58_r5.setRotationPoint(-0.2749F, -0.5405F, -13.0277F);
		stock_mp5a5_connection4.addChild(gun58_r5);
		setRotationAngle(gun58_r5, 0.0F, 0.0F, 2.137F);
		gun58_r5.cubeList.add(new ModelBox(gun58_r5, 36, 141, -0.5F, -0.5F, 11.0F, 1, 1, 2, 0.0F, false));

		gun59_r6 = new ModelRenderer(this);
		gun59_r6.setRotationPoint(-2.5457F, -0.5405F, -13.0277F);
		stock_mp5a5_connection4.addChild(gun59_r6);
		setRotationAngle(gun59_r6, 0.0F, 0.0F, -2.137F);
		gun59_r6.cubeList.add(new ModelBox(gun59_r6, 52, 142, -0.5F, -0.5F, 11.0F, 1, 1, 2, 0.0F, false));

		gun77_r10 = new ModelRenderer(this);
		gun77_r10.setRotationPoint(-2.0235F, -1.318F, -1.0277F);
		stock_mp5a5_connection4.addChild(gun77_r10);
		setRotationAngle(gun77_r10, 0.0F, 0.0F, -2.1935F);
		gun77_r10.cubeList.add(new ModelBox(gun77_r10, 61, 142, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		gun76_r16 = new ModelRenderer(this);
		gun76_r16.setRotationPoint(-0.7971F, -1.318F, -14.0277F);
		stock_mp5a5_connection4.addChild(gun76_r16);
		setRotationAngle(gun76_r16, 0.0F, 0.0F, 2.1935F);
		gun76_r16.cubeList.add(new ModelBox(gun76_r16, 92, 142, -0.5F, -0.5F, 12.0F, 1, 1, 2, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.2704F, 0.7603F, -0.2777F);
		stock_mp5a5_connection4.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 60, 49, -2.3998F, -3.8795F, -0.5F, 2, 1, 1, -0.3F, false));

		gun149_r2 = new ModelRenderer(this);
		gun149_r2.setRotationPoint(-0.0351F, -0.0848F, 0.0F);
		bone3.addChild(gun149_r2);
		setRotationAngle(gun149_r2, 0.0F, 0.0F, -0.7854F);
		gun149_r2.cubeList.add(new ModelBox(gun149_r2, 39, 59, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.3F, false));

		gun149_r3 = new ModelRenderer(this);
		gun149_r3.setRotationPoint(-0.2341F, -1.9324F, 0.0F);
		bone3.addChild(gun149_r3);
		setRotationAngle(gun149_r3, 0.0F, 0.0F, -0.3927F);
		gun149_r3.cubeList.add(new ModelBox(gun149_r3, 137, 132, -0.5F, -2.0F, -0.5F, 1, 4, 1, -0.299F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bone32);
		

		mp5_competition_stock = new ModelRenderer(this);
		mp5_competition_stock.setRotationPoint(-1.4496F, -9.6871F, 10.296F);
		mp5_competition_stock.cubeList.add(new ModelBox(mp5_competition_stock, 0, 26, -1.5504F, -3.8012F, 18.454F, 3, 7, 2, 0.0F, false));

		gun167_r7 = new ModelRenderer(this);
		gun167_r7.setRotationPoint(-2.0504F, -0.9874F, 0.4672F);
		mp5_competition_stock.addChild(gun167_r7);
		setRotationAngle(gun167_r7, 0.0F, 0.0F, -0.1745F);
		gun167_r7.cubeList.add(new ModelBox(gun167_r7, 0, 78, -0.5F, -1.15F, -12.0F, 1, 2, 24, -0.1F, false));

		gun166_r8 = new ModelRenderer(this);
		gun166_r8.setRotationPoint(1.9496F, -0.9874F, 0.4672F);
		mp5_competition_stock.addChild(gun166_r8);
		setRotationAngle(gun166_r8, 0.0F, 0.0F, 0.1745F);
		gun166_r8.cubeList.add(new ModelBox(gun166_r8, 55, 78, -0.5F, -1.15F, -12.0F, 1, 2, 24, -0.1F, false));

		gun167_r8 = new ModelRenderer(this);
		gun167_r8.setRotationPoint(-0.0476F, 6.8875F, 18.296F);
		mp5_competition_stock.addChild(gun167_r8);
		setRotationAngle(gun167_r8, 0.2182F, 0.0F, 0.0F);
		gun167_r8.cubeList.add(new ModelBox(gun167_r8, 124, 106, -0.5F, -1.0F, -1.25F, 1, 2, 2, 0.0F, false));

		gun166_r9 = new ModelRenderer(this);
		gun166_r9.setRotationPoint(0.0524F, 5.4231F, 19.9714F);
		mp5_competition_stock.addChild(gun166_r9);
		setRotationAngle(gun166_r9, 0.2182F, 0.0F, 0.0F);
		gun166_r9.cubeList.add(new ModelBox(gun166_r9, 29, 11, -1.6028F, -2.5F, -1.0F, 3, 6, 2, 0.0F, false));

		gun165_r4 = new ModelRenderer(this);
		gun165_r4.setRotationPoint(-0.4033F, -1.8831F, 12.8707F);
		mp5_competition_stock.addChild(gun165_r4);
		setRotationAngle(gun165_r4, 0.0873F, 0.0F, 0.0F);
		gun165_r4.cubeList.add(new ModelBox(gun165_r4, 119, 67, -1.5F, -2.0F, -1.0F, 2, 1, 7, 0.001F, false));
		gun165_r4.cubeList.add(new ModelBox(gun165_r4, 124, 115, 0.2057F, -2.0F, -1.0F, 2, 1, 7, 0.0F, false));

		gun152_r18 = new ModelRenderer(this);
		gun152_r18.setRotationPoint(-1.3678F, 4.1387F, 18.5208F);
		mp5_competition_stock.addChild(gun152_r18);
		setRotationAngle(gun152_r18, 0.2182F, 0.0F, -0.0873F);
		gun152_r18.cubeList.add(new ModelBox(gun152_r18, 130, 88, -1.0F, -5.0F, -1.0F, 3, 10, 2, 0.001F, false));

		gun153_r14 = new ModelRenderer(this);
		gun153_r14.setRotationPoint(-1.3678F, 4.1387F, 18.5208F);
		mp5_competition_stock.addChild(gun153_r14);
		setRotationAngle(gun153_r14, 1.0036F, 0.0F, -0.0873F);
		gun153_r14.cubeList.add(new ModelBox(gun153_r14, 0, 78, -1.0F, -5.0F, 1.0F, 2, 3, 2, 0.0F, false));

		gun152_r19 = new ModelRenderer(this);
		gun152_r19.setRotationPoint(1.267F, 4.1387F, 18.5208F);
		mp5_competition_stock.addChild(gun152_r19);
		setRotationAngle(gun152_r19, 1.0036F, 0.0F, 0.0873F);
		gun152_r19.cubeList.add(new ModelBox(gun152_r19, 82, 26, -1.0F, -5.0F, 1.0F, 2, 3, 2, 0.0F, false));

		gun151_r15 = new ModelRenderer(this);
		gun151_r15.setRotationPoint(1.267F, 4.1387F, 18.5208F);
		mp5_competition_stock.addChild(gun151_r15);
		setRotationAngle(gun151_r15, 0.2182F, 0.0F, 0.0873F);
		gun151_r15.cubeList.add(new ModelBox(gun151_r15, 86, 151, -2.0F, -5.0F, -1.0F, 3, 10, 2, 0.001F, false));

		gun152_r20 = new ModelRenderer(this);
		gun152_r20.setRotationPoint(-1.6577F, -2.3085F, 12.704F);
		mp5_competition_stock.addChild(gun152_r20);
		setRotationAngle(gun152_r20, 0.0F, 0.0F, 0.6109F);
		gun152_r20.cubeList.add(new ModelBox(gun152_r20, 81, 92, -1.0F, -1.0F, -0.999F, 2, 2, 7, 0.0F, false));

		gun151_r16 = new ModelRenderer(this);
		gun151_r16.setRotationPoint(1.5569F, -2.3085F, 12.704F);
		mp5_competition_stock.addChild(gun151_r16);
		setRotationAngle(gun151_r16, 0.0F, 0.0F, -0.6109F);
		gun151_r16.cubeList.add(new ModelBox(gun151_r16, 0, 104, -1.0F, -1.0F, -0.999F, 2, 2, 7, 0.0F, false));

		gun151_r17 = new ModelRenderer(this);
		gun151_r17.setRotationPoint(-1.8051F, -0.7593F, 15.204F);
		mp5_competition_stock.addChild(gun151_r17);
		setRotationAngle(gun151_r17, 0.0F, 0.0F, -0.1745F);
		gun151_r17.cubeList.add(new ModelBox(gun151_r17, 26, 79, -1.0F, -1.5F, -3.5F, 2, 3, 7, 0.0F, false));

		gun150_r7 = new ModelRenderer(this);
		gun150_r7.setRotationPoint(1.7043F, -0.7593F, 15.204F);
		mp5_competition_stock.addChild(gun150_r7);
		setRotationAngle(gun150_r7, 0.0F, 0.0F, 0.1745F);
		gun150_r7.cubeList.add(new ModelBox(gun150_r7, 54, 79, -1.0F, -1.5F, -3.5F, 2, 3, 7, 0.0F, false));

		stock_mp5a5_connection3 = new ModelRenderer(this);
		stock_mp5a5_connection3.setRotationPoint(1.3599F, -2.9372F, -6.2683F);
		mp5_competition_stock.addChild(stock_mp5a5_connection3);
		stock_mp5a5_connection3.cubeList.add(new ModelBox(stock_mp5a5_connection3, 33, 131, -1.9103F, -3.1757F, -2.0277F, 1, 1, 3, 0.0F, false));
		stock_mp5a5_connection3.cubeList.add(new ModelBox(stock_mp5a5_connection3, 137, 129, -1.0993F, -2.4325F, -2.0277F, 1, 1, 2, 0.0F, false));
		stock_mp5a5_connection3.cubeList.add(new ModelBox(stock_mp5a5_connection3, 135, 119, -2.7213F, -2.4325F, -2.0277F, 1, 1, 2, 0.0F, false));
		stock_mp5a5_connection3.cubeList.add(new ModelBox(stock_mp5a5_connection3, 155, 160, -1.7103F, 3.1243F, -2.0277F, 2, 2, 3, 0.0F, false));
		stock_mp5a5_connection3.cubeList.add(new ModelBox(stock_mp5a5_connection3, 93, 160, -3.1103F, 3.1243F, -2.0277F, 2, 2, 3, 0.001F, false));
		stock_mp5a5_connection3.cubeList.add(new ModelBox(stock_mp5a5_connection3, 121, 14, -0.1603F, 3.6243F, -1.5277F, 1, 1, 1, 0.0F, false));
		stock_mp5a5_connection3.cubeList.add(new ModelBox(stock_mp5a5_connection3, 121, 5, -3.6603F, 3.6243F, -1.0277F, 1, 1, 1, 0.0F, false));
		stock_mp5a5_connection3.cubeList.add(new ModelBox(stock_mp5a5_connection3, 93, 62, -3.4103F, -0.5502F, -0.0145F, 4, 4, 2, 0.0F, false));

		gun167_r9 = new ModelRenderer(this);
		gun167_r9.setRotationPoint(-1.9103F, -2.5348F, 0.6735F);
		stock_mp5a5_connection3.addChild(gun167_r9);
		setRotationAngle(gun167_r9, 0.3491F, 0.0F, 0.0F);
		gun167_r9.cubeList.add(new ModelBox(gun167_r9, 114, 120, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun166_r10 = new ModelRenderer(this);
		gun166_r10.setRotationPoint(-1.4103F, -1.7887F, 1.0027F);
		stock_mp5a5_connection3.addChild(gun166_r10);
		setRotationAngle(gun166_r10, 0.3491F, 0.0F, 0.0F);
		gun166_r10.cubeList.add(new ModelBox(gun166_r10, 23, 134, -1.0F, -0.5F, -0.5F, 2, 2, 1, 0.0F, false));

		gun166_r11 = new ModelRenderer(this);
		gun166_r11.setRotationPoint(-2.1103F, 3.7513F, 0.6335F);
		stock_mp5a5_connection3.addChild(gun166_r11);
		setRotationAngle(gun166_r11, -2.1143F, 0.0F, 0.0F);
		gun166_r11.cubeList.add(new ModelBox(gun166_r11, 88, 119, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.001F, false));
		gun166_r11.cubeList.add(new ModelBox(gun166_r11, 0, 122, 0.4F, -1.0F, -1.0F, 2, 2, 2, -0.001F, false));

		gun153_r15 = new ModelRenderer(this);
		gun153_r15.setRotationPoint(-3.6805F, 0.9601F, -0.0277F);
		stock_mp5a5_connection3.addChild(gun153_r15);
		setRotationAngle(gun153_r15, 0.0F, 0.0F, -0.3927F);
		gun153_r15.cubeList.add(new ModelBox(gun153_r15, 8, 161, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		gun152_r21 = new ModelRenderer(this);
		gun152_r21.setRotationPoint(0.8599F, 0.9601F, -0.0277F);
		stock_mp5a5_connection3.addChild(gun152_r21);
		setRotationAngle(gun152_r21, 0.0F, 0.0F, 0.3927F);
		gun152_r21.cubeList.add(new ModelBox(gun152_r21, 134, 161, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		gun154_r7 = new ModelRenderer(this);
		gun154_r7.setRotationPoint(-3.3332F, 2.7581F, -0.0277F);
		stock_mp5a5_connection3.addChild(gun154_r7);
		setRotationAngle(gun154_r7, 0.0F, 0.0F, 0.3927F);
		gun154_r7.cubeList.add(new ModelBox(gun154_r7, 161, 161, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		gun153_r16 = new ModelRenderer(this);
		gun153_r16.setRotationPoint(0.5126F, 2.7581F, -0.0277F);
		stock_mp5a5_connection3.addChild(gun153_r16);
		setRotationAngle(gun153_r16, 0.0F, 0.0F, -0.3927F);
		gun153_r16.cubeList.add(new ModelBox(gun153_r16, 0, 162, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		gun155_r2 = new ModelRenderer(this);
		gun155_r2.setRotationPoint(-3.9324F, 2.8981F, -1.4277F);
		stock_mp5a5_connection3.addChild(gun155_r2);
		setRotationAngle(gun155_r2, 0.0F, 0.0F, -0.3927F);
		gun155_r2.cubeList.add(new ModelBox(gun155_r2, 44, 134, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.401F, false));

		gun154_r8 = new ModelRenderer(this);
		gun154_r8.setRotationPoint(1.1117F, 2.8981F, -1.4277F);
		stock_mp5a5_connection3.addChild(gun154_r8);
		setRotationAngle(gun154_r8, 0.0F, 0.0F, 0.3927F);
		gun154_r8.cubeList.add(new ModelBox(gun154_r8, 134, 46, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.401F, false));

		gun154_r9 = new ModelRenderer(this);
		gun154_r9.setRotationPoint(-3.9324F, 2.8981F, 0.3723F);
		stock_mp5a5_connection3.addChild(gun154_r9);
		setRotationAngle(gun154_r9, 0.0F, 0.0F, -0.3927F);
		gun154_r9.cubeList.add(new ModelBox(gun154_r9, 86, 163, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.4F, false));

		gun153_r17 = new ModelRenderer(this);
		gun153_r17.setRotationPoint(1.1117F, 2.8981F, 0.3723F);
		stock_mp5a5_connection3.addChild(gun153_r17);
		setRotationAngle(gun153_r17, 0.0F, 0.0F, 0.3927F);
		gun153_r17.cubeList.add(new ModelBox(gun153_r17, 0, 168, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.4F, false));

		gun154_r10 = new ModelRenderer(this);
		gun154_r10.setRotationPoint(-4.2797F, 0.8202F, -0.4277F);
		stock_mp5a5_connection3.addChild(gun154_r10);
		setRotationAngle(gun154_r10, 0.0F, 0.0F, 0.3927F);
		gun154_r10.cubeList.add(new ModelBox(gun154_r10, 134, 49, -0.5F, -0.5F, -2.0F, 1, 1, 2, -0.401F, false));
		gun154_r10.cubeList.add(new ModelBox(gun154_r10, 168, 84, -0.5F, -0.5F, -1.2F, 1, 1, 4, -0.4F, false));

		gun153_r18 = new ModelRenderer(this);
		gun153_r18.setRotationPoint(1.459F, 0.8202F, -0.4277F);
		stock_mp5a5_connection3.addChild(gun153_r18);
		setRotationAngle(gun153_r18, 0.0F, 0.0F, -0.3927F);
		gun153_r18.cubeList.add(new ModelBox(gun153_r18, 54, 134, -0.5F, -0.5F, -2.0F, 1, 1, 2, -0.401F, false));

		gun152_r22 = new ModelRenderer(this);
		gun152_r22.setRotationPoint(1.459F, 0.8202F, 0.3723F);
		stock_mp5a5_connection3.addChild(gun152_r22);
		setRotationAngle(gun152_r22, 0.0F, 0.0F, -0.3927F);
		gun152_r22.cubeList.add(new ModelBox(gun152_r22, 168, 89, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.4F, false));

		gun152_r23 = new ModelRenderer(this);
		gun152_r23.setRotationPoint(-3.7443F, 1.7723F, -0.0277F);
		stock_mp5a5_connection3.addChild(gun152_r23);
		setRotationAngle(gun152_r23, 0.0F, 0.0F, -0.1745F);
		gun152_r23.cubeList.add(new ModelBox(gun152_r23, 34, 109, -0.5F, -1.0F, -2.0F, 2, 2, 4, 0.002F, false));

		gun151_r18 = new ModelRenderer(this);
		gun151_r18.setRotationPoint(0.9236F, 1.7723F, -0.0277F);
		stock_mp5a5_connection3.addChild(gun151_r18);
		setRotationAngle(gun151_r18, 0.0F, 0.0F, 0.1745F);
		gun151_r18.cubeList.add(new ModelBox(gun151_r18, 10, 113, -1.5F, -1.0F, -2.0F, 2, 2, 4, 0.002F, false));

		gun152_r24 = new ModelRenderer(this);
		gun152_r24.setRotationPoint(-2.834F, -0.3144F, -0.0585F);
		stock_mp5a5_connection3.addChild(gun152_r24);
		setRotationAngle(gun152_r24, 0.0F, -0.7418F, 0.3927F);
		gun152_r24.cubeList.add(new ModelBox(gun152_r24, 15, 136, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		gun151_r19 = new ModelRenderer(this);
		gun151_r19.setRotationPoint(0.0134F, -0.3144F, -0.0585F);
		stock_mp5a5_connection3.addChild(gun151_r19);
		setRotationAngle(gun151_r19, 0.0F, 0.7418F, -0.3927F);
		gun151_r19.cubeList.add(new ModelBox(gun151_r19, 86, 136, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		gun152_r25 = new ModelRenderer(this);
		gun152_r25.setRotationPoint(-3.044F, -0.3469F, 1.1865F);
		stock_mp5a5_connection3.addChild(gun152_r25);
		setRotationAngle(gun152_r25, 0.3491F, 0.0F, 0.3927F);
		gun152_r25.cubeList.add(new ModelBox(gun152_r25, 60, 27, -0.5F, -2.0F, -0.5F, 1, 3, 1, 0.0F, false));

		gun153_r19 = new ModelRenderer(this);
		gun153_r19.setRotationPoint(-2.4147F, -1.2506F, 1.0678F);
		stock_mp5a5_connection3.addChild(gun153_r19);
		setRotationAngle(gun153_r19, 0.3491F, -0.4363F, 0.1745F);
		gun153_r19.cubeList.add(new ModelBox(gun153_r19, 115, 106, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		gun152_r26 = new ModelRenderer(this);
		gun152_r26.setRotationPoint(-0.4059F, -1.2506F, 1.0678F);
		stock_mp5a5_connection3.addChild(gun152_r26);
		setRotationAngle(gun152_r26, 0.3491F, 0.4363F, -0.1745F);
		gun152_r26.cubeList.add(new ModelBox(gun152_r26, 110, 115, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		gun151_r20 = new ModelRenderer(this);
		gun151_r20.setRotationPoint(0.2234F, -0.3469F, 1.1865F);
		stock_mp5a5_connection3.addChild(gun151_r20);
		setRotationAngle(gun151_r20, 0.3491F, 0.0F, -0.3927F);
		gun151_r20.cubeList.add(new ModelBox(gun151_r20, 60, 53, -0.5F, -2.0F, -0.5F, 1, 3, 1, 0.0F, false));

		gun152_r27 = new ModelRenderer(this);
		gun152_r27.setRotationPoint(-3.5031F, 0.7614F, 1.4723F);
		stock_mp5a5_connection3.addChild(gun152_r27);
		setRotationAngle(gun152_r27, 0.0F, 0.0F, 0.3927F);
		gun152_r27.cubeList.add(new ModelBox(gun152_r27, 117, 94, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.001F, false));

		gun151_r21 = new ModelRenderer(this);
		gun151_r21.setRotationPoint(0.6825F, 0.7614F, 1.4723F);
		stock_mp5a5_connection3.addChild(gun151_r21);
		setRotationAngle(gun151_r21, 0.0F, 0.0F, -0.3927F);
		gun151_r21.cubeList.add(new ModelBox(gun151_r21, 121, 76, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.001F, false));

		gun153_r20 = new ModelRenderer(this);
		gun153_r20.setRotationPoint(-0.0699F, -1.7793F, -1.5277F);
		stock_mp5a5_connection3.addChild(gun153_r20);
		setRotationAngle(gun153_r20, 0.0F, 0.0F, -0.3927F);
		gun153_r20.cubeList.add(new ModelBox(gun153_r20, 123, 32, -0.5F, -0.8F, -0.5F, 1, 4, 1, -0.4F, false));

		gun152_r28 = new ModelRenderer(this);
		gun152_r28.setRotationPoint(-2.7507F, -1.7793F, -1.5277F);
		stock_mp5a5_connection3.addChild(gun152_r28);
		setRotationAngle(gun152_r28, 0.0F, 0.0F, 0.3927F);
		gun152_r28.cubeList.add(new ModelBox(gun152_r28, 124, 91, -0.5F, -0.8F, -0.5F, 1, 4, 1, -0.4F, false));

		gun151_r22 = new ModelRenderer(this);
		gun151_r22.setRotationPoint(-2.4507F, -1.7793F, 0.4723F);
		stock_mp5a5_connection3.addChild(gun151_r22);
		setRotationAngle(gun151_r22, 0.0F, 0.0F, 0.3927F);
		gun151_r22.cubeList.add(new ModelBox(gun151_r22, 0, 137, -0.5F, -0.5F, -0.5F, 1, 4, 1, 0.001F, false));

		gun150_r8 = new ModelRenderer(this);
		gun150_r8.setRotationPoint(-0.3699F, -1.7793F, 0.4723F);
		stock_mp5a5_connection3.addChild(gun150_r8);
		setRotationAngle(gun150_r8, 0.0F, 0.0F, -0.3927F);
		gun150_r8.cubeList.add(new ModelBox(gun150_r8, 71, 137, -0.5F, -0.5F, -0.5F, 1, 4, 1, 0.001F, false));

		gun148_r4 = new ModelRenderer(this);
		gun148_r4.setRotationPoint(-1.9412F, -2.4693F, -0.5277F);
		stock_mp5a5_connection3.addChild(gun148_r4);
		setRotationAngle(gun148_r4, 0.0F, 0.0F, -0.7418F);
		gun148_r4.cubeList.add(new ModelBox(gun148_r4, 8, 122, -0.6F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));
		gun148_r4.cubeList.add(new ModelBox(gun148_r4, 81, 127, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.001F, false));

		gun147_r3 = new ModelRenderer(this);
		gun147_r3.setRotationPoint(-0.8795F, -2.4693F, -0.5277F);
		stock_mp5a5_connection3.addChild(gun147_r3);
		setRotationAngle(gun147_r3, 0.0F, 0.0F, 0.7418F);
		gun147_r3.cubeList.add(new ModelBox(gun147_r3, 48, 126, -0.4F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));
		gun147_r3.cubeList.add(new ModelBox(gun147_r3, 102, 129, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.001F, false));

		gun58_r6 = new ModelRenderer(this);
		gun58_r6.setRotationPoint(-3.1138F, 0.0022F, -13.0277F);
		stock_mp5a5_connection3.addChild(gun58_r6);
		setRotationAngle(gun58_r6, 0.0F, 0.0F, -2.5297F);
		gun58_r6.cubeList.add(new ModelBox(gun58_r6, 137, 137, -0.5F, -0.5F, 11.0F, 1, 1, 2, 0.0F, false));

		gun60_r8 = new ModelRenderer(this);
		gun60_r8.setRotationPoint(-3.431F, 0.7211F, -1.0277F);
		stock_mp5a5_connection3.addChild(gun60_r8);
		setRotationAngle(gun60_r8, 0.0F, 0.0F, -2.9224F);
		gun60_r8.cubeList.add(new ModelBox(gun60_r8, 92, 139, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		gun57_r4 = new ModelRenderer(this);
		gun57_r4.setRotationPoint(0.2932F, 0.0022F, -13.0277F);
		stock_mp5a5_connection3.addChild(gun57_r4);
		setRotationAngle(gun57_r4, 0.0F, 0.0F, 2.5297F);
		gun57_r4.cubeList.add(new ModelBox(gun57_r4, 121, 139, -0.5F, -0.5F, 11.0F, 1, 1, 2, 0.0F, false));

		gun59_r7 = new ModelRenderer(this);
		gun59_r7.setRotationPoint(0.6104F, 0.7211F, -1.0277F);
		stock_mp5a5_connection3.addChild(gun59_r7);
		setRotationAngle(gun59_r7, 0.0F, 0.0F, 2.9224F);
		gun59_r7.cubeList.add(new ModelBox(gun59_r7, 137, 140, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		gun58_r7 = new ModelRenderer(this);
		gun58_r7.setRotationPoint(-0.2749F, -0.5405F, -13.0277F);
		stock_mp5a5_connection3.addChild(gun58_r7);
		setRotationAngle(gun58_r7, 0.0F, 0.0F, 2.137F);
		gun58_r7.cubeList.add(new ModelBox(gun58_r7, 36, 141, -0.5F, -0.5F, 11.0F, 1, 1, 2, 0.0F, false));

		gun59_r8 = new ModelRenderer(this);
		gun59_r8.setRotationPoint(-2.5457F, -0.5405F, -13.0277F);
		stock_mp5a5_connection3.addChild(gun59_r8);
		setRotationAngle(gun59_r8, 0.0F, 0.0F, -2.137F);
		gun59_r8.cubeList.add(new ModelBox(gun59_r8, 52, 142, -0.5F, -0.5F, 11.0F, 1, 1, 2, 0.0F, false));

		gun77_r11 = new ModelRenderer(this);
		gun77_r11.setRotationPoint(-2.0235F, -1.318F, -1.0277F);
		stock_mp5a5_connection3.addChild(gun77_r11);
		setRotationAngle(gun77_r11, 0.0F, 0.0F, -2.1935F);
		gun77_r11.cubeList.add(new ModelBox(gun77_r11, 61, 142, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		gun76_r17 = new ModelRenderer(this);
		gun76_r17.setRotationPoint(-0.7971F, -1.318F, -14.0277F);
		stock_mp5a5_connection3.addChild(gun76_r17);
		setRotationAngle(gun76_r17, 0.0F, 0.0F, 2.1935F);
		gun76_r17.cubeList.add(new ModelBox(gun76_r17, 92, 142, -0.5F, -0.5F, 12.0F, 1, 1, 2, 0.0F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(1.2704F, 0.7603F, -0.2777F);
		stock_mp5a5_connection3.addChild(bone33);
		bone33.cubeList.add(new ModelBox(bone33, 60, 49, -2.3998F, -3.8795F, -0.5F, 2, 1, 1, -0.3F, false));

		gun149_r4 = new ModelRenderer(this);
		gun149_r4.setRotationPoint(-0.0351F, -0.0848F, 0.0F);
		bone33.addChild(gun149_r4);
		setRotationAngle(gun149_r4, 0.0F, 0.0F, -0.7854F);
		gun149_r4.cubeList.add(new ModelBox(gun149_r4, 39, 59, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.3F, false));

		gun149_r5 = new ModelRenderer(this);
		gun149_r5.setRotationPoint(-0.2341F, -1.9324F, 0.0F);
		bone33.addChild(gun149_r5);
		setRotationAngle(gun149_r5, 0.0F, 0.0F, -0.3927F);
		gun149_r5.cubeList.add(new ModelBox(gun149_r5, 137, 132, -0.5F, -2.0F, -0.5F, 1, 4, 1, -0.299F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(bone34);
		

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.0897F, 36.6243F, -4.0277F);
		stock_mp5a5_connection3.addChild(bone35);
		bone35.cubeList.add(new ModelBox(bone35, 131, 33, -2.5F, -36.4745F, 8.8132F, 2, 2, 1, -0.2F, false));
		bone35.cubeList.add(new ModelBox(bone35, 99, 90, -2.5F, -34.1745F, 5.0132F, 2, 3, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 99, 83, -2.5F, -34.1745F, 5.6132F, 2, 3, 1, -0.001F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(-3.0F, -34.9245F, 6.0132F);
		bone35.addChild(bone36);
		setRotationAngle(bone36, 0.0F, 0.0F, -1.5708F);
		

		gun168_r3 = new ModelRenderer(this);
		gun168_r3.setRotationPoint(0.0F, -0.1755F, 0.0F);
		bone36.addChild(gun168_r3);
		setRotationAngle(gun168_r3, 0.0F, 0.0F, 0.4363F);
		gun168_r3.cubeList.add(new ModelBox(gun168_r3, 107, 92, 0.6125F, -0.169F, 0.0F, 1, 1, 3, 0.0F, false));
		gun168_r3.cubeList.add(new ModelBox(gun168_r3, 107, 96, 0.3625F, -0.169F, 0.0F, 1, 1, 3, 0.001F, false));

		gun169_r1 = new ModelRenderer(this);
		gun169_r1.setRotationPoint(0.0F, -0.1755F, 0.0F);
		bone36.addChild(gun169_r1);
		setRotationAngle(gun169_r1, 0.0F, 0.0F, -0.4363F);
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 109, 67, -0.8875F, 0.169F, 0.0F, 1, 1, 3, 0.0F, false));
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 109, 71, -0.6375F, 0.169F, 0.0F, 1, 1, 3, 0.002F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(0.0F, -34.9245F, 6.0132F);
		bone35.addChild(bone37);
		setRotationAngle(bone37, 0.0F, 0.0F, 1.5708F);
		

		gun167_r10 = new ModelRenderer(this);
		gun167_r10.setRotationPoint(0.0F, -0.1755F, 0.0F);
		bone37.addChild(gun167_r10);
		setRotationAngle(gun167_r10, 0.0F, 0.0F, -0.4363F);
		gun167_r10.cubeList.add(new ModelBox(gun167_r10, 88, 110, -1.6125F, -0.169F, 0.0F, 1, 1, 3, 0.0F, false));
		gun167_r10.cubeList.add(new ModelBox(gun167_r10, 99, 110, -1.3625F, -0.169F, 0.0F, 1, 1, 3, 0.002F, false));

		gun168_r4 = new ModelRenderer(this);
		gun168_r4.setRotationPoint(0.0F, -0.1755F, 0.0F);
		bone37.addChild(gun168_r4);
		setRotationAngle(gun168_r4, 0.0F, 0.0F, 0.4363F);
		gun168_r4.cubeList.add(new ModelBox(gun168_r4, 0, 113, -0.1125F, 0.169F, 0.0F, 1, 1, 3, 0.0F, false));
		gun168_r4.cubeList.add(new ModelBox(gun168_r4, 78, 115, -0.3625F, 0.169F, 0.0F, 1, 1, 3, 0.001F, false));

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(-1.5F, -33.4245F, 6.0132F);
		bone35.addChild(bone38);
		setRotationAngle(bone38, 0.0F, 0.0F, -3.1416F);
		

		gun167_r11 = new ModelRenderer(this);
		gun167_r11.setRotationPoint(0.0F, -0.1755F, 0.0F);
		bone38.addChild(gun167_r11);
		setRotationAngle(gun167_r11, 0.0F, 0.0F, -0.4363F);
		gun167_r11.cubeList.add(new ModelBox(gun167_r11, 107, 9, -1.419F, 0.3625F, 0.0F, 1, 1, 3, -0.001F, false));
		gun167_r11.cubeList.add(new ModelBox(gun167_r11, 107, 13, -1.169F, 0.3625F, 0.0F, 1, 1, 3, 0.002F, false));

		gun168_r5 = new ModelRenderer(this);
		gun168_r5.setRotationPoint(0.0F, -0.1755F, 0.0F);
		bone38.addChild(gun168_r5);
		setRotationAngle(gun168_r5, 0.0F, 0.0F, 0.4363F);
		gun168_r5.cubeList.add(new ModelBox(gun168_r5, 107, 83, 0.419F, 0.3625F, 0.0F, 1, 1, 3, -0.001F, false));
		gun168_r5.cubeList.add(new ModelBox(gun168_r5, 107, 87, 0.169F, 0.3625F, 0.0F, 1, 1, 3, 0.001F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-1.5F, -36.4245F, 6.0132F);
		bone35.addChild(bone39);
		

		gun166_r12 = new ModelRenderer(this);
		gun166_r12.setRotationPoint(0.0F, -0.5755F, 0.0F);
		bone39.addChild(gun166_r12);
		setRotationAngle(gun166_r12, 0.0F, 0.0F, -0.4363F);
		gun166_r12.cubeList.add(new ModelBox(gun166_r12, 0, 117, -1.25F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));
		gun166_r12.cubeList.add(new ModelBox(gun166_r12, 78, 119, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.002F, false));

		gun167_r12 = new ModelRenderer(this);
		gun167_r12.setRotationPoint(0.0F, -0.5755F, 0.0F);
		bone39.addChild(gun167_r12);
		setRotationAngle(gun167_r12, 0.0F, 0.0F, 0.4363F);
		gun167_r12.cubeList.add(new ModelBox(gun167_r12, 88, 115, 0.25F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));
		gun167_r12.cubeList.add(new ModelBox(gun167_r12, 119, 49, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.001F, false));

		mp5_a5_stock = new ModelRenderer(this);
		mp5_a5_stock.setRotationPoint(-0.0897F, -12.6243F, 4.0277F);
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 27, 53, -1.7103F, 0.1243F, -2.0277F, 2, 5, 8, 0.001F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 0, 52, -3.1103F, 0.1243F, -2.0277F, 2, 5, 8, 0.001F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 6, 122, -0.4103F, 3.6243F, -1.5277F, 1, 1, 1, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 122, 24, -3.4103F, 3.6243F, -1.0277F, 1, 1, 1, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 107, 0, -1.7103F, 0.4498F, 4.9855F, 2, 3, 20, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 12, 37, -1.7103F, -2.4502F, -2.0145F, 2, 3, 4, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 100, 106, -3.1103F, 0.4498F, 4.9855F, 2, 3, 20, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 39, 38, -3.1103F, -2.4502F, -2.0145F, 2, 3, 4, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 101, 222, -1.7103F, 3.4498F, 13.9855F, 2, 4, 11, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 0, 223, -3.1103F, 3.4498F, 13.9855F, 2, 4, 11, 0.0F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 129, 129, -1.7103F, 0.4498F, 24.9855F, 2, 12, 2, 0.001F, false));
		mp5_a5_stock.cubeList.add(new ModelBox(mp5_a5_stock, 113, 129, -3.1103F, 0.4498F, 24.9855F, 2, 12, 2, 0.002F, false));

		gun167_r13 = new ModelRenderer(this);
		gun167_r13.setRotationPoint(-1.2103F, 0.0557F, 2.9747F);
		mp5_a5_stock.addChild(gun167_r13);
		setRotationAngle(gun167_r13, -0.5236F, 0.0F, 0.0F);
		gun167_r13.cubeList.add(new ModelBox(gun167_r13, 131, 10, -0.5F, -1.5F, -2.5F, 2, 3, 6, -0.001F, false));
		gun167_r13.cubeList.add(new ModelBox(gun167_r13, 131, 33, -1.9F, -1.5F, -2.5F, 2, 3, 6, -0.001F, false));

		gun166_r13 = new ModelRenderer(this);
		gun166_r13.setRotationPoint(-1.7103F, 7.2781F, 15.1619F);
		mp5_a5_stock.addChild(gun166_r13);
		setRotationAngle(gun166_r13, -0.3491F, 0.0F, 0.0F);
		gun166_r13.cubeList.add(new ModelBox(gun166_r13, 28, 82, 0.0F, -3.5F, -11.0F, 2, 5, 22, -0.001F, false));
		gun166_r13.cubeList.add(new ModelBox(gun166_r13, 83, 56, -1.4F, -3.5F, -11.0F, 2, 5, 22, -0.001F, false));

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(1.2704F, 0.7603F, -0.2777F);
		mp5_a5_stock.addChild(bone64);
		

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone64.addChild(bone65);
		

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(0.4933F, 0.7515F, -0.7777F);
		mp5_a5_stock.addChild(bone71);
		bone71.cubeList.add(new ModelBox(bone71, 129, 168, -0.3036F, 0.1228F, -1.5F, 1, 1, 4, 0.0F, false));

		gun154_r11 = new ModelRenderer(this);
		gun154_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone71.addChild(gun154_r11);
		setRotationAngle(gun154_r11, 0.0F, 0.0F, -0.6109F);
		gun154_r11.cubeList.add(new ModelBox(gun154_r11, 94, 0, -0.5F, -1.5F, -1.5F, 1, 2, 4, 0.0F, false));

		gun155_r3 = new ModelRenderer(this);
		gun155_r3.setRotationPoint(-0.6928F, -0.2075F, 3.1054F);
		bone71.addChild(gun155_r3);
		setRotationAngle(gun155_r3, 0.0F, -0.5236F, -0.5672F);
		gun155_r3.cubeList.add(new ModelBox(gun155_r3, 119, 67, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		gun154_r12 = new ModelRenderer(this);
		gun154_r12.setRotationPoint(-0.6928F, 1.4531F, 3.1054F);
		bone71.addChild(gun154_r12);
		setRotationAngle(gun154_r12, 0.0F, -0.5236F, 0.5672F);
		gun154_r12.cubeList.add(new ModelBox(gun154_r12, 16, 120, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		gun153_r21 = new ModelRenderer(this);
		gun153_r21.setRotationPoint(-0.4398F, 0.6228F, 3.5996F);
		bone71.addChild(gun153_r21);
		setRotationAngle(gun153_r21, 0.0F, -0.48F, 0.0F);
		gun153_r21.cubeList.add(new ModelBox(gun153_r21, 150, 168, -0.5F, -0.5F, -1.5F, 1, 1, 4, 0.0F, false));

		gun155_r4 = new ModelRenderer(this);
		gun155_r4.setRotationPoint(0.0F, 1.2456F, 0.0F);
		bone71.addChild(gun155_r4);
		setRotationAngle(gun155_r4, 0.0F, 0.0F, 0.6109F);
		gun155_r4.cubeList.add(new ModelBox(gun155_r4, 69, 0, -0.5F, -0.5F, -1.5F, 1, 2, 4, 0.0F, false));

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(-3.3139F, 0.7515F, -0.7777F);
		mp5_a5_stock.addChild(bone72);
		bone72.cubeList.add(new ModelBox(bone72, 168, 94, -0.6964F, 0.1228F, -1.5F, 1, 1, 4, 0.0F, false));

		gun155_r5 = new ModelRenderer(this);
		gun155_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone72.addChild(gun155_r5);
		setRotationAngle(gun155_r5, 0.0F, 0.0F, 0.6109F);
		gun155_r5.cubeList.add(new ModelBox(gun155_r5, 54, 27, -0.5F, -1.5F, -1.5F, 1, 2, 4, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.6928F, -0.2075F, 3.1054F);
		bone72.addChild(gun156_r1);
		setRotationAngle(gun156_r1, 0.0F, 0.5236F, 0.5672F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 99, 115, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		gun155_r6 = new ModelRenderer(this);
		gun155_r6.setRotationPoint(0.6928F, 1.4531F, 3.1054F);
		bone72.addChild(gun155_r6);
		setRotationAngle(gun155_r6, 0.0F, 0.5236F, -0.5672F);
		gun155_r6.cubeList.add(new ModelBox(gun155_r6, 24, 118, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		gun154_r13 = new ModelRenderer(this);
		gun154_r13.setRotationPoint(0.4398F, 0.6228F, 3.5996F);
		bone72.addChild(gun154_r13);
		setRotationAngle(gun154_r13, 0.0F, 0.48F, 0.0F);
		gun154_r13.cubeList.add(new ModelBox(gun154_r13, 168, 102, -0.5F, -0.5F, -1.5F, 1, 1, 4, 0.0F, false));

		gun156_r2 = new ModelRenderer(this);
		gun156_r2.setRotationPoint(0.0F, 1.2456F, 0.0F);
		bone72.addChild(gun156_r2);
		setRotationAngle(gun156_r2, 0.0F, 0.0F, -0.6109F);
		gun156_r2.cubeList.add(new ModelBox(gun156_r2, 54, 53, -0.5F, -0.5F, -1.5F, 1, 2, 4, 0.0F, false));

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(-0.771F, 0.0963F, 14.4855F);
		mp5_a5_stock.addChild(bone67);
		bone67.cubeList.add(new ModelBox(bone67, 106, 24, -1.6393F, -0.3464F, -8.5F, 2, 1, 21, 0.0F, false));

		gun167_r14 = new ModelRenderer(this);
		gun167_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone67.addChild(gun167_r14);
		setRotationAngle(gun167_r14, 0.0F, 0.0F, 0.7854F);
		gun167_r14.cubeList.add(new ModelBox(gun167_r14, 25, 109, 0.0F, -0.5F, -8.5F, 1, 1, 21, -0.001F, false));

		gun168_r6 = new ModelRenderer(this);
		gun168_r6.setRotationPoint(-2.0F, 0.0F, 0.0F);
		bone67.addChild(gun168_r6);
		setRotationAngle(gun168_r6, 0.0F, 0.0F, 0.7854F);
		gun168_r6.cubeList.add(new ModelBox(gun168_r6, 107, 83, 0.0F, -0.5F, -8.5F, 1, 1, 21, -0.001F, false));

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(-1.3174F, -2.7526F, -0.0145F);
		mp5_a5_stock.addChild(bone70);
		bone70.cubeList.add(new ModelBox(bone70, 23, 141, -1.0929F, -0.3976F, -2.0F, 2, 1, 4, 0.0F, false));

		gun168_r7 = new ModelRenderer(this);
		gun168_r7.setRotationPoint(0.5464F, -0.0512F, -5.5F);
		bone70.addChild(gun168_r7);
		setRotationAngle(gun168_r7, 0.0F, 0.0F, 0.7854F);
		gun168_r7.cubeList.add(new ModelBox(gun168_r7, 160, 168, 0.0F, -0.5F, 3.5F, 1, 1, 4, 0.0F, false));

		gun169_r2 = new ModelRenderer(this);
		gun169_r2.setRotationPoint(-1.4536F, -0.0512F, -5.5F);
		bone70.addChild(gun169_r2);
		setRotationAngle(gun169_r2, 0.0F, 0.0F, 0.7854F);
		gun169_r2.cubeList.add(new ModelBox(gun169_r2, 6, 169, 0.0F, -0.5F, 3.5F, 1, 1, 4, 0.0F, false));

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(-1.3174F, -0.8526F, 5.9855F);
		mp5_a5_stock.addChild(bone69);
		setRotationAngle(bone69, -0.5236F, 0.0F, 0.0F);
		bone69.cubeList.add(new ModelBox(bone69, 0, 78, -1.0929F, 0.092F, -4.6534F, 2, 1, 8, 0.0F, false));

		gun168_r8 = new ModelRenderer(this);
		gun168_r8.setRotationPoint(0.5464F, 0.4384F, 7.8466F);
		bone69.addChild(gun168_r8);
		setRotationAngle(gun168_r8, 0.0F, 0.0F, 0.7854F);
		gun168_r8.cubeList.add(new ModelBox(gun168_r8, 26, 89, 0.0F, -0.5F, -12.5F, 1, 1, 8, 0.0F, false));

		gun169_r3 = new ModelRenderer(this);
		gun169_r3.setRotationPoint(-1.4536F, 0.4384F, 7.8466F);
		bone69.addChild(gun169_r3);
		setRotationAngle(gun169_r3, 0.0F, 0.0F, 0.7854F);
		gun169_r3.cubeList.add(new ModelBox(gun169_r3, 54, 89, 0.0F, -0.5F, -12.5F, 1, 1, 8, 0.0F, false));

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(-1.3174F, 12.8012F, 25.9855F);
		mp5_a5_stock.addChild(bone68);
		bone68.cubeList.add(new ModelBox(bone68, 0, 71, -1.0929F, -0.6024F, -1.0F, 2, 1, 2, 0.0F, false));

		gun168_r9 = new ModelRenderer(this);
		gun168_r9.setRotationPoint(0.5464F, 0.0512F, -11.5F);
		bone68.addChild(gun168_r9);
		setRotationAngle(gun168_r9, 0.0F, 0.0F, -0.7854F);
		gun168_r9.cubeList.add(new ModelBox(gun168_r9, 147, 88, 0.0F, -0.5F, 10.5F, 1, 1, 2, -0.001F, false));

		gun169_r4 = new ModelRenderer(this);
		gun169_r4.setRotationPoint(-1.4536F, 0.0512F, -11.5F);
		bone68.addChild(gun169_r4);
		setRotationAngle(gun169_r4, 0.0F, 0.0F, -0.7854F);
		gun169_r4.cubeList.add(new ModelBox(gun169_r4, 147, 91, 0.0F, -0.5F, 10.5F, 1, 1, 2, -0.001F, false));

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(-2.4603F, 7.2781F, 15.1619F);
		mp5_a5_stock.addChild(bone66);
		setRotationAngle(bone66, -0.3491F, 0.0F, 0.0F);
		bone66.cubeList.add(new ModelBox(bone66, 54, 27, 0.05F, 1.2F, -12.7F, 2, 1, 24, 0.0F, false));

		gun169_r5 = new ModelRenderer(this);
		gun169_r5.setRotationPoint(0.0571F, 1.5F, -1.2F);
		bone66.addChild(gun169_r5);
		setRotationAngle(gun169_r5, 0.0F, 0.0F, 0.7854F);
		gun169_r5.cubeList.add(new ModelBox(gun169_r5, 29, 1, -0.5F, -0.5F, -12.5F, 1, 1, 25, 0.0F, false));

		gun168_r10 = new ModelRenderer(this);
		gun168_r10.setRotationPoint(2.0429F, 1.5F, -1.2F);
		bone66.addChild(gun168_r10);
		setRotationAngle(gun168_r10, 0.0F, 0.0F, -0.7854F);
		gun168_r10.cubeList.add(new ModelBox(gun168_r10, 0, 52, -0.5F, -0.5F, -12.5F, 1, 1, 25, 0.0F, false));

		mp5_hogue_grip = new ModelRenderer(this);
		mp5_hogue_grip.setRotationPoint(0.0F, 32.9F, 0.0F);
		

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(-1.5F, -33.1749F, -2.4206F);
		mp5_hogue_grip.addChild(bone40);
		setRotationAngle(bone40, -1.1396F, 0.0F, 0.0F);
		bone40.cubeList.add(new ModelBox(bone40, 0, 127, 0.6085F, -2.2934F, -1.5F, 1, 3, 7, 0.2F, false));
		bone40.cubeList.add(new ModelBox(bone40, 124, 105, -1.6085F, -2.2934F, -1.5F, 1, 3, 7, 0.2F, false));
		bone40.cubeList.add(new ModelBox(bone40, 99, 115, -1.0F, 0.5F, -1.5F, 2, 1, 7, 0.201F, false));

		gun240_r2 = new ModelRenderer(this);
		gun240_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone40.addChild(gun240_r2);
		setRotationAngle(gun240_r2, 0.7156F, 0.0F, 0.0F);
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 19, 21, -0.8F, 3.1583F, 1.2103F, 2, 1, 1, -0.001F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 12, 75, -1.2F, 3.1583F, 1.2103F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 81, 56, -1.2F, 1.0F, -1.3F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 29, 8, -0.8F, 1.0F, -1.3F, 2, 1, 1, -0.001F, false));

		gun240_r3 = new ModelRenderer(this);
		gun240_r3.setRotationPoint(1.8915F, -0.7934F, 0.5F);
		bone40.addChild(gun240_r3);
		setRotationAngle(gun240_r3, 0.1571F, 0.0F, 0.0F);
		gun240_r3.cubeList.add(new ModelBox(gun240_r3, 53, 134, -3.5F, -2.0F, -1.8F, 1, 1, 7, 0.201F, false));
		gun240_r3.cubeList.add(new ModelBox(gun240_r3, 81, 83, -3.5F, -2.6F, -2.8F, 1, 1, 8, 0.2F, false));
		gun240_r3.cubeList.add(new ModelBox(gun240_r3, 0, 137, -1.283F, -2.0F, -1.8F, 1, 1, 7, 0.201F, false));
		gun240_r3.cubeList.add(new ModelBox(gun240_r3, 82, 26, -2.883F, -3.3F, -2.8F, 1, 1, 8, 0.201F, false));
		gun240_r3.cubeList.add(new ModelBox(gun240_r3, 82, 35, -1.883F, -3.3F, -2.8F, 1, 1, 8, 0.2F, false));
		gun240_r3.cubeList.add(new ModelBox(gun240_r3, 0, 87, -1.283F, -2.6F, -2.8F, 1, 1, 8, 0.2F, false));

		magazine30 = new ModelRenderer(this);
		magazine30.setRotationPoint(-1.5F, 2.7314F, -19.6454F);
		setRotationAngle(magazine30, 0.1309F, 0.0F, 0.0F);
		

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, -6.4236F, 4.0209F);
		magazine30.addChild(bone23);
		setRotationAngle(bone23, -0.3054F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 169, 118, -1.5F, -4.0F, -1.0F, 3, 3, 2, -0.1F, false));
		bone23.cubeList.add(new ModelBox(bone23, 43, 17, -1.5F, -5.5F, -1.0F, 3, 2, 2, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 43, 0, -1.5F, -1.5F, -1.0F, 3, 4, 2, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 107, 4, -1.3F, -4.0F, -1.2F, 3, 3, 1, -0.201F, false));
		bone23.cubeList.add(new ModelBox(bone23, 107, 0, -1.7F, -4.0F, -1.2F, 3, 3, 1, -0.201F, false));
		bone23.cubeList.add(new ModelBox(bone23, 20, 59, -0.5F, -5.4998F, -2.0F, 1, 8, 1, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 27, 38, -1.5F, -5.5008F, -3.0F, 3, 8, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(2.2776F, 0.0F, -2.8034F);
		bone23.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -0.3054F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 72, 86, -3.3612F, -5.5F, 0.9021F, 1, 8, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.7224F, 0.0F, -2.8034F);
		bone23.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.3054F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 62, 131, -0.5F, -5.5F, 0.0F, 1, 8, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(2.2776F, 0.0F, -1.8034F);
		bone23.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, -0.3054F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 107, -3.3612F, -5.5F, -0.0979F, 1, 8, 2, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.7224F, 0.0F, -1.8034F);
		bone23.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.3054F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 121, 129, -0.5F, -5.5F, -1.0F, 1, 8, 2, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone23.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.3491F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 131, 3, -6.1311F, -4.6048F, -1.0054F, 1, 1, 2, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone23.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.3491F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 131, 10, 2.312F, -5.6309F, -1.0054F, 1, 1, 2, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, -1.4664F, 3.3682F);
		magazine30.addChild(bone24);
		setRotationAngle(bone24, -0.4363F, 0.0F, 0.0F);
		

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0463F, 2.8216F, 1.253F);
		magazine30.addChild(bone25);
		setRotationAngle(bone25, -0.4712F, 0.0F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 0, 0, -1.5463F, -7.2855F, -2.3659F, 3, 8, 2, 0.001F, false));
		bone25.cubeList.add(new ModelBox(bone25, 0, 37, -1.5463F, -7.2855F, -4.3659F, 3, 8, 1, 0.001F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(2.2313F, -2.7855F, -4.1693F);
		bone25.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, -0.3054F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 47, 59, -3.3612F, -4.5F, 0.9021F, 1, 8, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.6762F, -2.7855F, -4.1693F);
		bone25.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.3054F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 84, -0.5F, -4.5F, 0.0F, 1, 8, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(2.2313F, -2.7855F, -3.1693F);
		bone25.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, -0.3054F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 44, 85, -3.3612F, -4.5F, -0.0979F, 1, 8, 2, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.6762F, -2.7855F, -3.1693F);
		bone25.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.3054F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 78, 104, -0.5F, -4.5F, -1.0F, 1, 8, 2, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0463F, 5.3158F, -0.4874F);
		magazine30.addChild(bone26);
		setRotationAngle(bone26, -0.6545F, 0.0F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 14, 26, -1.5463F, -2.2352F, -2.4001F, 3, 7, 2, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 96, 151, -1.5463F, 1.7648F, -3.4001F, 3, 3, 1, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 0, 52, -1.5463F, -2.2352F, -4.4001F, 3, 7, 1, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(2.2313F, 2.2648F, -4.2034F);
		bone26.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, -0.3054F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 76, 16, -3.3612F, -4.5F, 0.9021F, 1, 7, 1, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.6762F, 2.2648F, -4.2034F);
		bone26.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.3054F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 109, -0.5F, -4.5F, 0.0F, 1, 7, 1, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(2.2313F, 2.2648F, -3.2034F);
		bone26.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, -0.3054F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 56, 0, -3.3612F, -4.5F, -0.0979F, 1, 7, 2, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.6762F, 2.2648F, -3.2034F);
		bone26.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.3054F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 56, 10, -0.5F, -4.5F, -1.0F, 1, 7, 2, 0.0F, false));

		magazinedrum50 = new ModelRenderer(this);
		magazinedrum50.setRotationPoint(-1.5F, 2.2314F, -20.5454F);
		

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, -6.3236F, 4.1209F);
		magazinedrum50.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.1573F, 0.0517F, 0.3409F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 131, -3.312F, -5.7678F, -1.0354F, 1, 1, 2, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, -6.3236F, 4.1209F);
		magazinedrum50.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.1573F, -0.0517F, -0.3409F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 131, 0, 2.312F, -5.7678F, -1.0354F, 1, 1, 2, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, -6.4236F, 4.0209F);
		magazinedrum50.addChild(bone22);
		setRotationAngle(bone22, -0.1745F, 0.0F, 0.0F);
		bone22.cubeList.add(new ModelBox(bone22, 102, 49, -1.5F, -1.5F, -3.0F, 3, 3, 4, 0.001F, false));
		bone22.cubeList.add(new ModelBox(bone22, 41, 27, -1.5F, -5.5F, -1.0F, 3, 4, 2, 0.001F, false));
		bone22.cubeList.add(new ModelBox(bone22, 27, 27, -1.5F, -5.7F, -2.6F, 3, 6, 2, -0.2F, false));
		bone22.cubeList.add(new ModelBox(bone22, 54, 64, -1.3F, -5.7F, -3.2F, 3, 5, 1, -0.2F, false));
		bone22.cubeList.add(new ModelBox(bone22, 27, 53, -1.7F, -5.7F, -3.2F, 3, 5, 1, -0.201F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, -6.4236F, 4.0209F);
		magazinedrum50.addChild(bone27);
		setRotationAngle(bone27, -0.1745F, 0.0F, 0.0F);
		bone27.cubeList.add(new ModelBox(bone27, 155, 154, -1.5F, 0.5F, -3.0F, 3, 2, 4, -0.001F, false));
		bone27.cubeList.add(new ModelBox(bone27, 155, 148, -1.5F, 9.6962F, -3.0F, 3, 2, 4, -0.001F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-0.049F, 6.183F, 0.0F);
		bone27.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, 0.5236F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 21, 152, -1.5F, 3.5F, -3.0F, 3, 2, 4, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.049F, 6.183F, 0.0F);
		bone27.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, -0.5236F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 152, 27, -1.5F, 3.5F, -3.0F, 3, 2, 4, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-0.049F, 6.0131F, 0.0F);
		bone27.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, -0.5236F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 134, 56, -1.5F, -5.5F, -3.0F, 3, 2, 4, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.049F, 6.0131F, 0.0F);
		bone27.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, 0.5236F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 155, 43, -1.5F, -5.5F, -3.0F, 3, 2, 4, 0.0F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-0.0849F, 6.1471F, 0.0F);
		bone27.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 0.0F, 1.0472F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 113, 144, -1.5F, 3.5F, -3.0F, 3, 2, 4, 0.001F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.0849F, 6.1471F, 0.0F);
		bone27.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 0.0F, -1.0472F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 44, 152, -1.5F, 3.5F, -3.0F, 3, 2, 4, 0.001F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-0.0849F, 6.049F, 0.0F);
		bone27.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.0F, -1.0472F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 116, 151, -1.5F, -5.5F, -3.0F, 3, 2, 4, 0.001F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(0.0849F, 6.049F, 0.0F);
		bone27.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 0.0F, 1.0472F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 155, 49, -1.5F, -5.5F, -3.0F, 3, 2, 4, 0.001F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-4.5981F, 6.0981F, 0.0F);
		bone27.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, 0.0F, -1.5708F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 96, -1.5F, -1.0F, -3.0F, 3, 2, 4, -0.001F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(4.5981F, 6.0981F, 0.0F);
		bone27.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.0F, 1.5708F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 134, 155, -1.5F, -1.0F, -3.0F, 3, 2, 4, -0.001F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, -6.4236F, 4.2709F);
		magazinedrum50.addChild(bone28);
		setRotationAngle(bone28, -0.1745F, 0.0F, 0.0F);
		

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-2.116F, 2.783F, -3.5F);
		bone28.addChild(bone29);
		bone29.cubeList.add(new ModelBox(bone29, 82, 10, 0.616F, -0.933F, -1.5004F, 3, 4, 6, 0.001F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone29.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, 0.0F, -0.5236F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 131, 0, -1.0F, -0.5F, -1.5F, 2, 4, 6, -0.001F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(4.2321F, 0.0F, 0.0F);
		bone29.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, 0.0F, 0.5236F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 23, 131, -1.0F, -0.5F, -1.5F, 2, 4, 6, -0.001F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(3.3151F, 8.2141F, -3.5F);
		bone28.addChild(bone);
		

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, 0.0F, -1.0472F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 44, 131, -1.0F, -3.5F, -1.5F, 2, 4, 6, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(0.0F, -4.2321F, 0.0F);
		bone.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.0F, 1.0472F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 134, 46, -1.0F, -0.5F, -1.5F, 2, 4, 6, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.433F, -2.116F, 0.0F);
		bone.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, 1.5708F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 82, 0, -1.5F, -0.5F, -1.5F, 3, 4, 6, 0.001F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-3.3151F, 8.2141F, -3.5F);
		bone28.addChild(bone30);
		

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 0.0F, 1.0472F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 131, 23, -1.0F, -3.5F, -1.5F, 2, 4, 6, 0.0F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.0F, -4.2321F, 0.0F);
		bone30.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, 0.0F, -1.0472F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 131, 69, -1.0F, -0.5F, -1.5F, 2, 4, 6, 0.0F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-0.433F, -2.116F, 0.0F);
		bone30.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, -1.5708F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 54, 38, -2.5F, 1.25F, -1.575F, 5, 5, 6, 0.0F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 81, 62, -1.5F, -0.5F, -1.5F, 3, 4, 6, 0.001F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-2.116F, 9.4131F, -3.5F);
		bone28.addChild(bone31);
		bone31.cubeList.add(new ModelBox(bone31, 81, 52, 0.616F, -3.067F, -1.5004F, 3, 4, 6, 0.001F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, 0.5236F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 71, 127, -1.0F, -3.5F, -1.5F, 2, 4, 6, -0.001F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(4.2321F, 0.0F, 0.0F);
		bone31.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, -0.5236F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 92, 129, -1.0F, -3.5F, -1.5F, 2, 4, 6, -0.001F, false));

		action = new ModelRenderer(this);
		action.setRotationPoint(-2.6423F, -15.0299F, -16.0F);
		action.cubeList.add(new ModelBox(action, 108, 158, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.001F, false));
		action.cubeList.add(new ModelBox(action, 21, 158, 0.3423F, 1.0F, 0.0F, 1, 1, 4, 0.001F, false));

		gun65_r4 = new ModelRenderer(this);
		gun65_r4.setRotationPoint(0.0F, 1.0F, 0.0F);
		action.addChild(gun65_r4);
		setRotationAngle(gun65_r4, 0.0F, 0.0F, -0.6632F);
		gun65_r4.cubeList.add(new ModelBox(gun65_r4, 44, 158, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.001F, false));

		gun65_r5 = new ModelRenderer(this);
		gun65_r5.setRotationPoint(-0.4F, 2.3F, 0.0F);
		action.addChild(gun65_r5);
		setRotationAngle(gun65_r5, 0.0F, 0.0F, -0.6981F);
		gun65_r5.cubeList.add(new ModelBox(gun65_r5, 157, 136, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.001F, false));

		gun64_r10 = new ModelRenderer(this);
		gun64_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		action.addChild(gun64_r10);
		setRotationAngle(gun64_r10, 0.0F, 0.0F, -0.6981F);
		gun64_r10.cubeList.add(new ModelBox(gun64_r10, 65, 158, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.001F, false));

		bolt = new ModelRenderer(this);
		bolt.setRotationPoint(0.0F, 24.0F, -0.7F);
		

		action6_r1 = new ModelRenderer(this);
		action6_r1.setRotationPoint(2.8478F, -38.4543F, -33.3F);
		bolt.addChild(action6_r1);
		setRotationAngle(action6_r1, 0.0F, -0.3665F, -0.1798F);
		action6_r1.cubeList.add(new ModelBox(action6_r1, 35, 8, -2.2F, -1.0F, 0.8F, 1, 1, 1, 0.001F, false));

		action5_r1 = new ModelRenderer(this);
		action5_r1.setRotationPoint(2.8478F, -38.4543F, -33.3F);
		bolt.addChild(action5_r1);
		setRotationAngle(action5_r1, 0.0F, 0.0F, -0.1798F);
		action5_r1.cubeList.add(new ModelBox(action5_r1, 35, 19, -2.6F, -1.0F, 0.4F, 1, 1, 1, -0.001F, false));

		action4_r1 = new ModelRenderer(this);
		action4_r1.setRotationPoint(2.8478F, -38.4543F, -33.3F);
		bolt.addChild(action4_r1);
		setRotationAngle(action4_r1, 0.0F, 0.192F, -0.1798F);
		action4_r1.cubeList.add(new ModelBox(action4_r1, 35, 22, -1.9F, -1.0F, 0.05F, 1, 1, 1, 0.0F, false));

		action3_r1 = new ModelRenderer(this);
		action3_r1.setRotationPoint(1.1478F, -38.0543F, -33.0F);
		bolt.addChild(action3_r1);
		setRotationAngle(action3_r1, 0.0F, 0.0F, -0.0227F);
		action3_r1.cubeList.add(new ModelBox(action3_r1, 13, 21, -2.0F, -1.0F, 0.0F, 2, 1, 1, -0.2F, false));

		action2 = new ModelRenderer(this);
		action2.setRotationPoint(-0.4F, -38.95F, -26.9F);
		bolt.addChild(action2);
		setRotationAngle(action2, 0.0F, 0.0F, 2.3051F);
		action2.cubeList.add(new ModelBox(action2, 63, 20, 0.0F, 0.0F, 2.0F, 1, 1, 2, 0.0F, false));

		action1 = new ModelRenderer(this);
		action1.setRotationPoint(-0.8F, -38.95F, -37.0F);
		bolt.addChild(action1);
		action1.cubeList.add(new ModelBox(action1, 0, 0, -0.6F, 0.0F, 3.7F, 1, 1, 11, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		mp5_navy_handguard.render(f5);
//		mp5_blackmesa_handguard.render(f5);
//		mp5_a5_handguard.render(f5);
//		mp5_mi_handguard.render(f5);
//		mp5_sd_handguard.render(f5);
//		mp5_utg_tri_rail_handguard.render(f5);
//		mp5_stock.render(f5);
//		mp5_stock_adapter.render(f5);
		mp5_a5_stock.render(f5);
//		mp5_hogue_grip.render(f5);
//		magazine30.render(f5);
//		magazinedrum50.render(f5);
//		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
