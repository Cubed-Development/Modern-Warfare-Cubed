package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class F2000TRHandguard extends ModelWithAttachments {
	private final ModelRenderer bone3;
	private final ModelRenderer handguard;
	private final ModelRenderer cube_r1;
	private final ModelRenderer gun27_r1_r1;
	private final ModelRenderer gun76_r1_r1;
	private final ModelRenderer gun81_r1_r1;
	private final ModelRenderer gun2_r1_r1;
	private final ModelRenderer gun5_r1_r1;
	private final ModelRenderer gun22_r1_r1;
	private final ModelRenderer gun23_r1_r1;
	private final ModelRenderer gun24_r1_r1;
	private final ModelRenderer gun29_r1_r1;
	private final ModelRenderer gun34_r1_r1;
	private final ModelRenderer gun40_r1_r1;
	private final ModelRenderer gun77_r1_r1;
	private final ModelRenderer gun78_r1_r1;
	private final ModelRenderer gun82_r1_r1;
	private final ModelRenderer gun83_r1_r1;
	private final ModelRenderer tr_rail;
	private final ModelRenderer rail;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;

	public F2000TRHandguard() {
		textureWidth = 290;
		textureHeight = 290;

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 0.1415F, 0.0773F);
		bone3.addChild(handguard);
		handguard.cubeList.add(new ModelBox(handguard, 0, 32, -1.45F, -30.5415F, -30.7773F, 3, 3, 12, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 142, 116, -1.9F, -27.5415F, -25.4773F, 3, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 53, 39, -1.9F, -26.5415F, -18.4773F, 1, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 142, 108, -1.1F, -27.5415F, -25.4773F, 3, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 53, 21, -1.1F, -27.5415F, -18.4773F, 3, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 142, 100, -1.1F, -26.5415F, -25.4773F, 3, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 18, 40, -1.1F, -26.5415F, -18.4773F, 3, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 33, 93, -1.9F, -26.5415F, -25.4773F, 1, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 60, -1.9F, -30.1415F, -31.2773F, 3, 1, 1, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 122, 37, -1.5F, -30.5415F, -18.5773F, 3, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 16, -1.5F, -31.5415F, -31.8773F, 3, 2, 12, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -1.5F, -31.5415F, -29.8773F, 3, 4, 12, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 50, 54, -1.1F, -30.1415F, -31.2773F, 3, 1, 1, -0.0015F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.1F, -22.5415F, 17.1227F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7418F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 79, 41, -0.95F, -32.0F, -29.1F, 1, 1, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 4, 83, -0.95F, -26.0F, -22.1F, 1, 1, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 72, 35, -4.25F, -32.0F, -29.1F, 1, 1, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 72, 22, -4.3F, -28.0F, -24.6F, 1, 1, 1, -0.2F, false));

		gun27_r1_r1 = new ModelRenderer(this);
		gun27_r1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard.addChild(gun27_r1_r1);
		setRotationAngle(gun27_r1_r1, 0.0873F, 0.0F, 0.0F);
		gun27_r1_r1.cubeList.add(new ModelBox(gun27_r1_r1, 52, 78, -1.1F, -27.7984F, -13.2046F, 3, 1, 4, 0.0F, false));
		gun27_r1_r1.cubeList.add(new ModelBox(gun27_r1_r1, 51, 8, -1.9F, -27.7984F, -13.2046F, 1, 1, 4, 0.0F, false));

		gun76_r1_r1 = new ModelRenderer(this);
		gun76_r1_r1.setRotationPoint(56.174F, -67.2941F, -0.0773F);
		handguard.addChild(gun76_r1_r1);
		setRotationAngle(gun76_r1_r1, 0.0F, 0.0F, -2.5281F);
		gun76_r1_r1.cubeList.add(new ModelBox(gun76_r1_r1, 50, 44, 23.482F, -60.7492F, -32.4F, 1, 1, 7, 0.0F, false));
		gun76_r1_r1.cubeList.add(new ModelBox(gun76_r1_r1, 131, 143, 23.482F, -61.7492F, -31.4F, 1, 1, 15, 0.0F, false));
		gun76_r1_r1.cubeList.add(new ModelBox(gun76_r1_r1, 72, 19, 23.482F, -61.2492F, -26.4F, 1, 1, 5, 0.0F, false));

		gun81_r1_r1 = new ModelRenderer(this);
		gun81_r1_r1.setRotationPoint(-56.174F, -67.2941F, -0.0773F);
		handguard.addChild(gun81_r1_r1);
		setRotationAngle(gun81_r1_r1, 0.0F, 0.0F, 2.5281F);
		gun81_r1_r1.cubeList.add(new ModelBox(gun81_r1_r1, 14, 70, -24.482F, -60.7492F, -32.4F, 1, 1, 7, 0.0F, false));
		gun81_r1_r1.cubeList.add(new ModelBox(gun81_r1_r1, 144, 0, -24.482F, -61.7492F, -31.4F, 1, 1, 15, 0.0F, false));
		gun81_r1_r1.cubeList.add(new ModelBox(gun81_r1_r1, 72, 32, -24.482F, -61.2492F, -26.4F, 1, 1, 5, 0.0F, false));

		gun2_r1_r1 = new ModelRenderer(this);
		gun2_r1_r1.setRotationPoint(0.0F, -62.6755F, 28.9461F);
		handguard.addChild(gun2_r1_r1);
		setRotationAngle(gun2_r1_r1, 2.2864F, 0.0F, 0.0F);
		gun2_r1_r1.cubeList.add(new ModelBox(gun2_r1_r1, 18, 8, -1.5F, -57.5706F, 1.6383F, 3, 1, 3, -0.001F, false));

		gun5_r1_r1 = new ModelRenderer(this);
		gun5_r1_r1.setRotationPoint(0.0F, 11.9701F, -4.1321F);
		handguard.addChild(gun5_r1_r1);
		setRotationAngle(gun5_r1_r1, -0.6981F, 0.0F, 0.0F);
		gun5_r1_r1.cubeList.add(new ModelBox(gun5_r1_r1, 86, 20, -1.5F, -25.7777F, -38.5282F, 3, 3, 2, 0.0F, false));

		gun22_r1_r1 = new ModelRenderer(this);
		gun22_r1_r1.setRotationPoint(0.0F, 0.983F, 0.7156F);
		handguard.addChild(gun22_r1_r1);
		setRotationAngle(gun22_r1_r1, -0.2094F, 0.0F, 0.0F);
		gun22_r1_r1.cubeList.add(new ModelBox(gun22_r1_r1, 72, 92, -1.9F, -22.4569F, -36.3563F, 3, 1, 5, -0.0015F, false));

		gun23_r1_r1 = new ModelRenderer(this);
		gun23_r1_r1.setRotationPoint(0.0F, 1.8394F, 11.3283F);
		handguard.addChild(gun23_r1_r1);
		setRotationAngle(gun23_r1_r1, 0.576F, 0.0F, 0.0F);
		gun23_r1_r1.cubeList.add(new ModelBox(gun23_r1_r1, 23, 70, -1.9F, -52.3438F, -19.3116F, 1, 6, 1, 0.0F, false));
		gun23_r1_r1.cubeList.add(new ModelBox(gun23_r1_r1, 72, 72, -1.1F, -52.3438F, -19.3116F, 3, 6, 1, 0.0F, false));

		gun24_r1_r1 = new ModelRenderer(this);
		gun24_r1_r1.setRotationPoint(0.0F, 6.7685F, 2.3468F);
		handguard.addChild(gun24_r1_r1);
		setRotationAngle(gun24_r1_r1, -0.4887F, 0.0F, 0.0F);
		gun24_r1_r1.cubeList.add(new ModelBox(gun24_r1_r1, 18, 24, -1.1F, -15.778F, -45.112F, 3, 1, 3, -0.0027F, false));

		gun29_r1_r1 = new ModelRenderer(this);
		gun29_r1_r1.setRotationPoint(0.0F, 0.9394F, 0.7204F);
		handguard.addChild(gun29_r1_r1);
		setRotationAngle(gun29_r1_r1, -0.2094F, 0.0F, 0.0F);
		gun29_r1_r1.cubeList.add(new ModelBox(gun29_r1_r1, 46, 93, -1.1F, -21.4559F, -36.0462F, 3, 1, 5, 0.0F, false));
		gun29_r1_r1.cubeList.add(new ModelBox(gun29_r1_r1, 83, 93, -1.9F, -21.4559F, -36.0462F, 1, 1, 5, -0.001F, false));

		gun34_r1_r1 = new ModelRenderer(this);
		gun34_r1_r1.setRotationPoint(0.0F, 17.7642F, 1.004F);
		handguard.addChild(gun34_r1_r1);
		setRotationAngle(gun34_r1_r1, -0.7505F, 0.0F, 0.0F);
		gun34_r1_r1.cubeList.add(new ModelBox(gun34_r1_r1, 0, 40, -1.9F, -13.02F, -56.2807F, 3, 1, 3, -0.002F, false));

		gun40_r1_r1 = new ModelRenderer(this);
		gun40_r1_r1.setRotationPoint(0.0F, 6.1016F, 2.1025F);
		handguard.addChild(gun40_r1_r1);
		setRotationAngle(gun40_r1_r1, -0.4538F, 0.0F, 0.0F);
		gun40_r1_r1.cubeList.add(new ModelBox(gun40_r1_r1, 48, 148, -1.9F, -18.3804F, -44.9908F, 3, 2, 6, -0.002F, false));
		gun40_r1_r1.cubeList.add(new ModelBox(gun40_r1_r1, 0, 158, -1.1F, -18.3804F, -44.9908F, 3, 2, 6, -0.0015F, false));

		gun77_r1_r1 = new ModelRenderer(this);
		gun77_r1_r1.setRotationPoint(57.639F, -22.5812F, -0.0773F);
		handguard.addChild(gun77_r1_r1);
		setRotationAngle(gun77_r1_r1, 0.0F, 0.0F, -1.8589F);
		gun77_r1_r1.cubeList.add(new ModelBox(gun77_r1_r1, 68, 161, 23.1538F, -54.7487F, -23.6F, 2, 1, 7, 0.0F, false));

		gun78_r1_r1 = new ModelRenderer(this);
		gun78_r1_r1.setRotationPoint(-59.2607F, -31.2067F, -0.0773F);
		handguard.addChild(gun78_r1_r1);
		setRotationAngle(gun78_r1_r1, 0.0F, 0.0F, 1.9705F);
		gun78_r1_r1.cubeList.add(new ModelBox(gun78_r1_r1, 72, 26, -23.7785F, -56.4572F, -26.6F, 2, 1, 3, 0.0F, false));

		gun82_r1_r1 = new ModelRenderer(this);
		gun82_r1_r1.setRotationPoint(-57.6389F, -22.5811F, -0.0773F);
		handguard.addChild(gun82_r1_r1);
		setRotationAngle(gun82_r1_r1, 0.0F, 0.0F, 1.8589F);
		gun82_r1_r1.cubeList.add(new ModelBox(gun82_r1_r1, 97, 162, -25.1538F, -54.7486F, -23.6F, 2, 1, 7, 0.0F, false));

		gun83_r1_r1 = new ModelRenderer(this);
		gun83_r1_r1.setRotationPoint(59.2606F, -31.2063F, -0.0773F);
		handguard.addChild(gun83_r1_r1);
		setRotationAngle(gun83_r1_r1, 0.0F, 0.0F, -1.9705F);
		gun83_r1_r1.cubeList.add(new ModelBox(gun83_r1_r1, 72, 62, 21.7786F, -56.457F, -26.6F, 2, 1, 3, 0.0F, false));

		tr_rail = new ModelRenderer(this);
		tr_rail.setRotationPoint(0.0F, 0.1415F, 0.0773F);
		bone3.addChild(tr_rail);
		

		rail = new ModelRenderer(this);
		rail.setRotationPoint(0.0F, -26.0F, -30.0F);
		tr_rail.addChild(rail);
		rail.cubeList.add(new ModelBox(rail, 0, 94, -1.0F, -0.7F, -2.7F, 2, 1, 5, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 0, 47, -2.0F, -2.7F, -2.7F, 1, 2, 5, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 36, 44, 1.0F, -2.7F, -2.7F, 1, 2, 5, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 72, 113, -2.6F, -2.4F, -4.7F, 1, 2, 9, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 0, 113, -2.6F, -3.3F, -4.7F, 1, 2, 9, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 86, 38, 2.0F, -2.533F, -4.7F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 86, 82, 2.0F, -2.533F, -4.3F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 27, 87, 2.0F, -2.533F, -3.9F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 87, 72, 2.0F, -3.15F, -4.3F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 72, 92, 2.0F, -3.15F, -4.7F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 83, 92, 2.0F, -3.15F, -3.9F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 46, 93, 2.0F, -2.533F, -3.0F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 62, 93, 2.0F, -3.15F, -3.0F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 0, 94, 2.0F, -3.15F, -2.7F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 94, 45, 2.0F, -2.533F, -2.7F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 94, 72, 2.0F, -2.533F, -1.8F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 95, 56, 2.0F, -2.533F, -1.5F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 97, 0, 2.0F, -3.15F, -1.8F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 98, 23, 2.0F, -3.15F, -1.5F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 101, 72, 2.0F, -3.15F, -0.6F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 29, 102, 2.0F, -3.15F, -0.3F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 39, 102, 2.0F, -2.533F, -0.6F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 76, 102, 2.0F, -2.533F, -0.3F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 101, 102, 2.0F, -2.533F, 0.6F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 103, 32, 2.0F, -2.533F, 0.9F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 103, 38, 2.0F, -3.15F, 0.6F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 104, 6, 2.0F, -3.15F, 0.9F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 104, 23, 2.0F, -3.15F, 2.1F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 76, 105, 2.0F, -3.15F, 1.8F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 76, 108, 2.0F, -2.533F, 2.1F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 62, 110, 2.0F, -2.533F, 1.8F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 0, 102, 1.6F, -2.4F, -4.7F, 1, 2, 9, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 111, 72, 2.0F, -2.533F, 3.0F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 111, 102, 2.0F, -2.533F, 3.3F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 5, 113, 2.0F, -3.15F, 3.3F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 11, 113, 2.0F, -3.15F, 3.0F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 72, 102, 1.6F, -3.3F, -4.7F, 1, 2, 9, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 92, 130, -3.0F, -3.15F, 3.3F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 44, 130, -3.0F, -3.15F, 1.8F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 48, 130, -3.0F, -2.533F, 1.8F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 72, 130, -3.0F, -2.533F, 2.1F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 76, 130, -3.0F, -3.15F, 2.1F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 28, 130, -3.0F, -3.15F, 0.6F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 32, 130, -3.0F, -2.533F, 0.6F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 36, 130, -3.0F, -2.533F, 0.9F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 40, 130, -3.0F, -3.15F, 0.9F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 12, 130, -3.0F, -3.15F, -0.6F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 16, 130, -3.0F, -2.533F, -0.6F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 20, 130, -3.0F, -2.533F, -0.3F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 24, 130, -3.0F, -3.15F, -0.3F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 129, 61, -3.0F, -3.15F, -1.8F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 0, 130, -3.0F, -2.533F, -1.8F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 4, 130, -3.0F, -2.533F, -1.5F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 8, 130, -3.0F, -3.15F, -1.5F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 22, 121, -3.0F, -3.15F, -3.0F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 122, 114, -3.0F, -2.533F, -3.0F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 13, 124, -3.0F, -2.533F, -2.7F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 128, 128, -3.0F, -3.15F, -2.7F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 5, 117, -3.0F, -3.15F, -4.3F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 77, 117, -3.0F, -2.533F, -4.3F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 77, 113, -3.0F, -3.15F, -4.7F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 95, 114, -3.0F, -2.533F, -4.7F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 22, 118, -3.0F, -2.533F, -3.9F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 94, 119, -3.0F, -3.15F, -3.9F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 88, 130, -3.0F, -2.533F, 3.3F, 1, 2, 1, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 80, 130, -3.0F, -3.15F, 3.0F, 1, 2, 1, -0.301F, false));
		rail.cubeList.add(new ModelBox(rail, 84, 130, -3.0F, -2.533F, 3.0F, 1, 2, 1, -0.3F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.5F, -2.65F, -0.2F);
		rail.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 150, 20, -0.6F, -0.7F, 3.5F, 1, 1, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 150, 12, -0.6F, -0.7F, 3.2F, 1, 1, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 72, 149, -0.6F, -0.7F, -3.7F, 1, 1, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 149, -0.6F, -0.7F, -4.5F, 1, 1, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 149, -0.6F, -0.7F, -4.1F, 1, 1, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 90, 149, -0.6F, -0.7F, -2.5F, 1, 1, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 78, 149, -0.6F, -0.7F, -2.8F, 1, 1, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 111, 149, -0.6F, -0.7F, -1.3F, 1, 1, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 97, 149, -0.6F, -0.7F, -1.6F, 1, 1, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 135, 149, -0.6F, -0.7F, -0.1F, 1, 1, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 117, 149, -0.6F, -0.7F, -0.4F, 1, 1, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 150, 2, -0.6F, -0.7F, 1.1F, 1, 1, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 139, 149, -0.6F, -0.7F, 0.8F, 1, 1, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 150, 10, -0.6F, -0.7F, 2.3F, 1, 1, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 150, 4, -0.6F, -0.7F, 2.0F, 1, 1, 1, -0.3F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.5F, -1.033F, -0.5F);
		rail.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 150, 16, -0.6F, -0.3F, 3.5F, 1, 1, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 150, 18, -0.6F, -0.3F, 3.8F, 1, 1, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 68, 149, -0.6F, -0.3F, -3.4F, 1, 1, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 149, -0.6F, -0.3F, -4.2F, 1, 1, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 41, 149, -0.6F, -0.3F, -3.8F, 1, 1, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 86, 149, -0.6F, -0.3F, -2.2F, 1, 1, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 82, 149, -0.6F, -0.3F, -2.5F, 1, 1, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 107, 149, -0.6F, -0.3F, -1.0F, 1, 1, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 101, 149, -0.6F, -0.3F, -1.3F, 1, 1, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 131, 149, -0.6F, -0.3F, 0.2F, 1, 1, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 121, 149, -0.6F, -0.3F, -0.1F, 1, 1, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 150, 0, -0.6F, -0.3F, 1.4F, 1, 1, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 148, 149, -0.6F, -0.3F, 1.1F, 1, 1, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 150, 8, -0.6F, -0.3F, 2.6F, 1, 1, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 150, 6, -0.6F, -0.3F, 2.3F, 1, 1, 1, -0.3F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.5585F, -0.2F);
		rail.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 1.5708F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 11, 85, -0.7F, -1.4585F, -4.5F, 1, 2, 9, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 86, 32, -0.3F, -1.3085F, 3.2F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 86, 7, -0.3F, -1.3085F, 3.5F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 86, 0, -0.3F, -0.6915F, 3.5F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 85, 45, -0.3F, -0.6915F, 3.2F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 83, -0.7F, -0.5585F, -4.5F, 1, 2, 9, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 79, 45, -0.3F, -0.6915F, 2.0F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 79, 38, -0.3F, -0.6915F, 2.3F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 79, 32, -0.3F, -1.3085F, 2.0F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 79, 19, -0.3F, -1.3085F, 2.3F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 79, 6, -0.3F, -1.3085F, 1.1F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 79, 0, -0.3F, -1.3085F, 0.8F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 62, 78, -0.3F, -0.6915F, 1.1F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 78, -0.3F, -0.6915F, 0.8F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 76, -0.3F, -0.6915F, -0.1F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 76, -0.3F, -0.6915F, -0.4F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 76, -0.3F, -1.3085F, -0.1F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 72, 38, -0.3F, -1.3085F, -0.4F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 72, 32, -0.3F, -1.3085F, -1.3F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 72, 19, -0.3F, -1.3085F, -1.6F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 72, 6, -0.3F, -0.6915F, -1.3F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 72, 0, -0.3F, -0.6915F, -1.6F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 70, -0.3F, -0.6915F, -2.5F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 70, -0.3F, -1.3085F, -2.5F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 70, -0.3F, -1.3085F, -2.8F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 62, 39, -0.3F, -0.6915F, -2.8F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 62, 21, -0.3F, -1.3085F, -3.7F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 62, 14, -0.3F, -1.3085F, -4.5F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 61, 32, -0.3F, -1.3085F, -4.1F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 61, 8, -0.3F, -0.6915F, -3.7F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 54, -0.3F, -0.6915F, -4.1F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 54, -0.3F, -0.6915F, -4.5F, 1, 2, 1, -0.3F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.5585F, -0.2F);
		rail.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 147, 61, 0.3131F, -1.1303F, 3.2F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 147, 59, 0.3131F, -1.1303F, 3.5F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 147, 43, 0.3131F, -1.1303F, 2.3F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 147, 41, 0.3131F, -1.1303F, 2.0F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 41, 147, 0.3131F, -1.1303F, 0.8F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 147, 39, 0.3131F, -1.1303F, 1.1F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 147, 25, 0.3131F, -1.1303F, -0.4F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 147, 23, 0.3131F, -1.1303F, -0.1F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 147, 21, 0.3131F, -1.1303F, -1.3F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 147, 0.3131F, -1.1303F, -1.6F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 147, 9, 0.3131F, -1.1303F, -2.8F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 147, 7, 0.3131F, -1.1303F, -2.5F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 147, 5, 0.3131F, -1.1303F, -4.5F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 147, 3, 0.3131F, -1.1303F, -4.1F, 1, 1, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 147, 1, 0.3131F, -1.1303F, -3.7F, 1, 1, 1, -0.3F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.5585F, -0.2F);
		rail.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 2.3562F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 147, 57, 0.3131F, 0.1303F, 3.5F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 147, 52, 0.3131F, 0.1303F, 3.2F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 147, 50, 0.3131F, 0.1303F, 2.3F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 147, 48, 0.3131F, 0.1303F, 2.0F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 147, 35, 0.3131F, 0.1303F, 1.1F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 147, 33, 0.3131F, 0.1303F, 0.8F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 147, 31, 0.3131F, 0.1303F, -0.1F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 147, 27, 0.3131F, 0.1303F, -0.4F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 147, 19, 0.3131F, 0.1303F, -1.3F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 147, 17, 0.3131F, 0.1303F, -1.6F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 147, 13, 0.3131F, 0.1303F, -2.8F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 147, 11, 0.3131F, 0.1303F, -2.5F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 142, 146, 0.3131F, 0.1303F, -4.5F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 146, 0.3131F, 0.1303F, -4.1F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 139, 145, 0.3131F, 0.1303F, -3.7F, 1, 1, 1, -0.3F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.5F, -2.65F, -0.5F);
		rail.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 149, -0.4F, -0.7F, 3.5F, 1, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 149, -0.4F, -0.7F, 3.8F, 1, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 148, 124, -0.4F, -0.7F, 2.6F, 1, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 148, 96, -0.4F, -0.7F, 2.3F, 1, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 148, 94, -0.4F, -0.7F, 1.1F, 1, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 148, 92, -0.4F, -0.7F, 1.4F, 1, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 135, 147, -0.4F, -0.7F, -0.1F, 1, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 131, 147, -0.4F, -0.7F, 0.2F, 1, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 121, 147, -0.4F, -0.7F, -1.0F, 1, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 117, 147, -0.4F, -0.7F, -1.3F, 1, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 90, 147, -0.4F, -0.7F, -2.5F, 1, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 86, 147, -0.4F, -0.7F, -2.2F, 1, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 82, 147, -0.4F, -0.7F, -4.2F, 1, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 78, 147, -0.4F, -0.7F, -3.8F, 1, 1, 1, -0.3F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 72, 147, -0.4F, -0.7F, -3.4F, 1, 1, 1, -0.3F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.5F, -1.033F, -0.2F);
		rail.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 148, 147, -0.4F, -0.3F, 3.5F, 1, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 148, 145, -0.4F, -0.3F, 3.2F, 1, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 148, 143, -0.4F, -0.3F, 2.3F, 1, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 142, 148, -0.4F, -0.3F, 2.0F, 1, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 60, 148, -0.4F, -0.3F, 1.1F, 1, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 148, -0.4F, -0.3F, 0.8F, 1, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 23, 148, -0.4F, -0.3F, -0.1F, 1, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 139, 147, -0.4F, -0.3F, -0.4F, 1, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 111, 147, -0.4F, -0.3F, -1.3F, 1, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 107, 147, -0.4F, -0.3F, -1.6F, 1, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 101, 147, -0.4F, -0.3F, -2.8F, 1, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 97, 147, -0.4F, -0.3F, -2.5F, 1, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 68, 147, -0.4F, -0.3F, -4.5F, 1, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 147, 67, -0.4F, -0.3F, -4.1F, 1, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 147, 65, -0.4F, -0.3F, -3.7F, 1, 1, 1, -0.3F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, -0.2F);
		rail.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 33, 70, 1.0F, -0.2F, -2.7F, 1, 1, 5, -0.2F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 70, 0.6F, -0.2F, -2.7F, 1, 1, 5, -0.2F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, -0.2F);
		rail.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 72, 0, -2.0F, -0.2F, -2.7F, 1, 1, 5, -0.2F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 72, 6, -1.6F, -0.2F, -2.7F, 1, 1, 5, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}