package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G36KHandguard extends ModelWithAttachments {
	private final ModelRenderer G36Khandguard;
	private final ModelRenderer DustCover8_r1_r1;
	private final ModelRenderer DustCover7_r1_r1;
	private final ModelRenderer cube_r134;
	private final ModelRenderer cube_r135;
	private final ModelRenderer cube_r136;
	private final ModelRenderer cube_r137;
	private final ModelRenderer cube_r138;
	private final ModelRenderer cube_r139;
	private final ModelRenderer cube_r140;
	private final ModelRenderer cube_r141;
	private final ModelRenderer cube_r142;
	private final ModelRenderer cube_r143;
	private final ModelRenderer cube_r144;
	private final ModelRenderer cube_r145;
	private final ModelRenderer cube_r146;
	private final ModelRenderer cube_r147;
	private final ModelRenderer cube_r148;
	private final ModelRenderer cube_r149;
	private final ModelRenderer DustCover7_r2;
	private final ModelRenderer DustCover8_r4;
	private final ModelRenderer DustCover5_r3;
	private final ModelRenderer DustCover4_r3;
	private final ModelRenderer cube_r150;
	private final ModelRenderer cube_r151;
	private final ModelRenderer cube_r152;
	private final ModelRenderer cube_r153;
	private final ModelRenderer cube_r154;
	private final ModelRenderer cube_r155;
	private final ModelRenderer cube_r156;
	private final ModelRenderer cube_r157;
	private final ModelRenderer cube_r158;
	private final ModelRenderer cube_r159;
	private final ModelRenderer cube_r160;
	private final ModelRenderer cube_r161;
	private final ModelRenderer cube_r162;
	private final ModelRenderer cube_r163;
	private final ModelRenderer cube_r164;
	private final ModelRenderer cube_r165;
	private final ModelRenderer rail3;
	private final ModelRenderer DustCover6_r2;
	private final ModelRenderer DustCover5_r4;
	private final ModelRenderer teeth2;
	private final ModelRenderer DustCover8_r5;
	private final ModelRenderer DustCover9_r3;

	public G36KHandguard() {
		textureWidth = 256;
		textureHeight = 256;

		G36Khandguard = new ModelRenderer(this);
		G36Khandguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 25, 67, 0.25F, -40.999F, -41.751F, 1, 2, 1, 0.0F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 13, 39, -3.5F, -41.0F, -41.5F, 4, 4, 1, 0.001F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 134, 114, -1.7071F, -41.0F, -44.4571F, 2, 1, 3, 0.0F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 109, 148, -2.0F, -37.25F, -68.7F, 1, 1, 33, 0.0F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 136, 0, -1.2929F, -36.5429F, -68.7F, 1, 1, 33, 0.0F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 133, 114, -2.7071F, -36.5429F, -68.7F, 1, 1, 33, 0.0F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 37, 131, -2.0F, -35.8358F, -68.7F, 1, 1, 33, 0.0F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 0, 114, -2.0F, -39.25F, -63.95F, 1, 1, 14, 0.0F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 10, 79, 0.75F, -36.5F, -51.75F, 1, 2, 2, 0.0F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 60, 57, 0.75F, -36.5F, -63.75F, 1, 2, 2, 0.0F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 200, 64, -2.0F, -32.45F, -64.452F, 1, 1, 23, 0.3F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 139, 73, -2.5F, -31.5398F, -50.05F, 2, 1, 1, -0.1F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 139, 61, -2.5F, -31.5398F, -51.675F, 2, 1, 1, -0.1F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 138, 118, -2.5F, -31.5398F, -53.3F, 2, 1, 1, -0.1F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 137, 123, -2.5F, -31.5398F, -54.925F, 2, 1, 1, -0.1F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 136, 91, -2.5F, -31.5398F, -58.175F, 2, 1, 1, -0.1F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 136, 31, -2.5F, -31.5398F, -56.55F, 2, 1, 1, -0.1F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 136, 24, -2.5F, -31.5398F, -61.425F, 2, 1, 1, -0.1F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 136, 10, -2.5F, -31.5398F, -59.8F, 2, 1, 1, -0.1F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 128, 128, -2.5F, -31.5398F, -63.05F, 2, 1, 1, -0.1F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 50, 126, -2.5F, -31.5398F, -64.675F, 2, 1, 1, -0.1F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 44, 92, -4.0F, -41.0F, -43.75F, 5, 5, 3, 0.002F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 60, 47, -4.75F, -36.5F, -42.75F, 1, 2, 2, 0.0F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 30, 11, -4.75F, -36.5F, -63.75F, 1, 2, 2, 0.0F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 50, 111, -3.2929F, -41.0F, -44.4571F, 2, 1, 3, 0.0F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 15, 62, -4.25F, -40.999F, -41.751F, 1, 2, 1, 0.0F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 72, 132, -2.5F, -37.0F, -68.7F, 2, 2, 33, 0.01F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 86, 108, -2.5F, -31.5398F, -48.55F, 2, 1, 1, -0.1F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 70, 54, -2.5F, -31.5398F, -46.925F, 2, 1, 1, -0.1F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 59, 64, -2.5F, -31.5398F, -45.3F, 2, 1, 1, -0.1F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 34, 54, -2.5F, -31.5398F, -43.675F, 2, 1, 1, -0.1F, false));
		G36Khandguard.cubeList.add(new ModelBox(G36Khandguard, 23, 54, -2.5F, -31.5398F, -42.05F, 2, 1, 1, -0.1F, false));

		DustCover8_r1_r1 = new ModelRenderer(this);
		DustCover8_r1_r1.setRotationPoint(-2.4F, -31.2054F, -44.801F);
		G36Khandguard.addChild(DustCover8_r1_r1);
		setRotationAngle(DustCover8_r1_r1, 0.0F, 0.0F, -0.7854F);
		DustCover8_r1_r1.cubeList.add(new ModelBox(DustCover8_r1_r1, 25, 70, -0.5F, -0.5F, 2.75F, 1, 1, 1, -0.1F, false));
		DustCover8_r1_r1.cubeList.add(new ModelBox(DustCover8_r1_r1, 25, 80, -0.5F, -0.5F, 1.125F, 1, 1, 1, -0.1F, false));
		DustCover8_r1_r1.cubeList.add(new ModelBox(DustCover8_r1_r1, 38, 80, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));
		DustCover8_r1_r1.cubeList.add(new ModelBox(DustCover8_r1_r1, 85, 47, -0.5F, -0.5F, -2.125F, 1, 1, 1, -0.1F, false));
		DustCover8_r1_r1.cubeList.add(new ModelBox(DustCover8_r1_r1, 94, 70, -0.5F, -0.5F, -3.75F, 1, 1, 1, -0.1F, false));

		DustCover7_r1_r1 = new ModelRenderer(this);
		DustCover7_r1_r1.setRotationPoint(-0.6F, -31.2054F, -43.9885F);
		G36Khandguard.addChild(DustCover7_r1_r1);
		setRotationAngle(DustCover7_r1_r1, 0.0F, 0.0F, 0.829F);
		DustCover7_r1_r1.cubeList.add(new ModelBox(DustCover7_r1_r1, 38, 70, -0.5F, -0.5F, 1.9375F, 1, 1, 1, -0.1F, false));
		DustCover7_r1_r1.cubeList.add(new ModelBox(DustCover7_r1_r1, 73, 15, -0.5F, -0.5F, 0.3125F, 1, 1, 1, -0.1F, false));
		DustCover7_r1_r1.cubeList.add(new ModelBox(DustCover7_r1_r1, 84, 15, -0.5F, -0.5F, -1.3125F, 1, 1, 1, -0.1F, false));
		DustCover7_r1_r1.cubeList.add(new ModelBox(DustCover7_r1_r1, 39, 88, -0.5F, -0.5F, -4.5515F, 1, 1, 1, -0.1F, false));
		DustCover7_r1_r1.cubeList.add(new ModelBox(DustCover7_r1_r1, 86, 88, -0.5F, -0.5F, -2.9375F, 1, 1, 1, -0.1F, false));

		cube_r134 = new ModelRenderer(this);
		cube_r134.setRotationPoint(-2.2642F, -40.28F, -47.25F);
		G36Khandguard.addChild(cube_r134);
		setRotationAngle(cube_r134, 0.0F, 0.0F, -0.2182F);
		cube_r134.cubeList.add(new ModelBox(cube_r134, 47, 47, -1.0F, -0.5F, -15.5F, 2, 1, 19, -0.001F, false));

		cube_r135 = new ModelRenderer(this);
		cube_r135.setRotationPoint(-2.4079F, -37.8251F, -30.4401F);
		G36Khandguard.addChild(cube_r135);
		setRotationAngle(cube_r135, 1.1345F, 0.0F, 0.1745F);
		cube_r135.cubeList.add(new ModelBox(cube_r135, 127, 60, -1.3999F, -0.5F, -0.6F, 1, 1, 1, -0.001F, false));

		cube_r136 = new ModelRenderer(this);
		cube_r136.setRotationPoint(-3.7393F, -35.4572F, -29.183F);
		G36Khandguard.addChild(cube_r136);
		setRotationAngle(cube_r136, 0.5236F, 0.0F, 0.1745F);
		cube_r136.cubeList.add(new ModelBox(cube_r136, 20, 91, -0.5001F, -2.75F, -0.25F, 1, 5, 1, 0.001F, false));

		cube_r137 = new ModelRenderer(this);
		cube_r137.setRotationPoint(-3.7245F, -35.5409F, -30.0F);
		G36Khandguard.addChild(cube_r137);
		setRotationAngle(cube_r137, 0.0F, 0.0F, 0.1745F);
		cube_r137.cubeList.add(new ModelBox(cube_r137, 39, 47, -0.5F, 0.0F, 0.5F, 1, 2, 1, 0.0F, false));
		cube_r137.cubeList.add(new ModelBox(cube_r137, 0, 31, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r138 = new ModelRenderer(this);
		cube_r138.setRotationPoint(-3.6377F, -36.0333F, -35.5F);
		G36Khandguard.addChild(cube_r138);
		setRotationAngle(cube_r138, 0.0F, 0.0F, 0.1745F);
		cube_r138.cubeList.add(new ModelBox(cube_r138, 0, 167, -0.5F, -2.5F, -5.0F, 1, 5, 10, 0.0F, false));

		cube_r139 = new ModelRenderer(this);
		cube_r139.setRotationPoint(-3.5509F, -36.5257F, -50.0F);
		G36Khandguard.addChild(cube_r139);
		setRotationAngle(cube_r139, 0.0F, 0.0F, 0.1745F);
		cube_r139.cubeList.add(new ModelBox(cube_r139, 127, 54, -0.5F, -3.0F, -9.0F, 1, 1, 1, 0.0F, false));
		cube_r139.cubeList.add(new ModelBox(cube_r139, 108, 26, -0.5F, -3.0F, -5.0F, 1, 1, 2, 0.0F, false));
		cube_r139.cubeList.add(new ModelBox(cube_r139, 100, 125, -0.5F, -3.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r139.cubeList.add(new ModelBox(cube_r139, 108, 18, -0.5F, -3.0F, 4.0F, 1, 1, 2, 0.0F, false));
		cube_r139.cubeList.add(new ModelBox(cube_r139, 57, 125, -0.5F, -3.0F, -13.0F, 1, 1, 1, 0.0F, false));
		cube_r139.cubeList.add(new ModelBox(cube_r139, 28, 47, -0.5F, 1.0F, -14.5F, 1, 2, 1, 0.0F, false));
		cube_r139.cubeList.add(new ModelBox(cube_r139, 84, 58, -0.5F, -2.0F, -13.5F, 1, 5, 1, 0.0F, false));
		cube_r139.cubeList.add(new ModelBox(cube_r139, 0, 91, -0.5F, -2.0F, -12.5F, 1, 5, 18, 0.0F, false));

		cube_r140 = new ModelRenderer(this);
		cube_r140.setRotationPoint(-2.9697F, -39.8215F, -53.3206F);
		G36Khandguard.addChild(cube_r140);
		setRotationAngle(cube_r140, 0.3927F, 0.0F, 0.1745F);
		cube_r140.cubeList.add(new ModelBox(cube_r140, 34, 125, -0.5F, -3.9442F, -8.8149F, 1, 1, 1, 0.0F, false));

		cube_r141 = new ModelRenderer(this);
		cube_r141.setRotationPoint(-2.9431F, -39.9725F, -49.0F);
		G36Khandguard.addChild(cube_r141);
		setRotationAngle(cube_r141, 0.0F, 0.0F, 0.1745F);
		cube_r141.cubeList.add(new ModelBox(cube_r141, 86, 92, -0.5F, -0.5F, -13.05F, 1, 1, 18, 0.0F, false));

		cube_r142 = new ModelRenderer(this);
		cube_r142.setRotationPoint(-3.5235F, -36.6807F, -54.7011F);
		G36Khandguard.addChild(cube_r142);
		setRotationAngle(cube_r142, -0.3491F, 0.0F, 0.1745F);
		cube_r142.cubeList.add(new ModelBox(cube_r142, 87, 0, -0.5F, -0.4215F, -8.9571F, 1, 7, 1, 0.001F, false));

		cube_r143 = new ModelRenderer(this);
		cube_r143.setRotationPoint(-3.3062F, -37.9133F, -41.0303F);
		G36Khandguard.addChild(cube_r143);
		setRotationAngle(cube_r143, 0.6545F, 0.0F, 0.1745F);
		cube_r143.cubeList.add(new ModelBox(cube_r143, 100, 123, -0.5F, -0.5F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r144 = new ModelRenderer(this);
		cube_r144.setRotationPoint(-3.464F, -37.0181F, -46.5F);
		G36Khandguard.addChild(cube_r144);
		setRotationAngle(cube_r144, 0.0F, 0.0F, 0.1745F);
		cube_r144.cubeList.add(new ModelBox(cube_r144, 63, 111, -0.5F, -3.5F, 2.0F, 1, 7, 4, 0.0F, false));

		cube_r145 = new ModelRenderer(this);
		cube_r145.setRotationPoint(-2.4135F, -32.7268F, -40.0F);
		G36Khandguard.addChild(cube_r145);
		setRotationAngle(cube_r145, 0.0F, 0.0F, 0.3927F);
		cube_r145.cubeList.add(new ModelBox(cube_r145, 0, 91, -1.5F, -0.5F, -25.5F, 3, 1, 38, -0.001F, false));

		cube_r146 = new ModelRenderer(this);
		cube_r146.setRotationPoint(-3.8678F, -33.5353F, -55.875F);
		G36Khandguard.addChild(cube_r146);
		setRotationAngle(cube_r146, 0.0F, 0.0F, 0.9599F);
		cube_r146.cubeList.add(new ModelBox(cube_r146, 34, 123, -0.5F, -0.5F, -9.5F, 1, 1, 1, -0.001F, false));
		cube_r146.cubeList.add(new ModelBox(cube_r146, 97, 0, -0.5F, -0.5F, -8.625F, 1, 1, 37, 0.0F, false));

		cube_r147 = new ModelRenderer(this);
		cube_r147.setRotationPoint(-3.5429F, -39.999F, -41.751F);
		G36Khandguard.addChild(cube_r147);
		setRotationAngle(cube_r147, 0.0F, -0.7854F, 0.0F);
		cube_r147.cubeList.add(new ModelBox(cube_r147, 41, 34, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.001F, false));

		cube_r148 = new ModelRenderer(this);
		cube_r148.setRotationPoint(-1.4216F, -37.5848F, -41.251F);
		G36Khandguard.addChild(cube_r148);
		setRotationAngle(cube_r148, 0.0F, 0.0F, 0.7854F);
		cube_r148.cubeList.add(new ModelBox(cube_r148, 122, 32, -3.0F, 0.0F, -0.5F, 1, 1, 1, -0.001F, false));

		cube_r149 = new ModelRenderer(this);
		cube_r149.setRotationPoint(-3.2929F, -38.5F, -43.75F);
		G36Khandguard.addChild(cube_r149);
		setRotationAngle(cube_r149, 0.0F, -0.7854F, 0.0F);
		cube_r149.cubeList.add(new ModelBox(cube_r149, 61, 77, -0.5F, -2.5F, -0.5F, 1, 5, 1, -0.001F, false));

		DustCover7_r2 = new ModelRenderer(this);
		DustCover7_r2.setRotationPoint(-0.6F, -31.2054F, -55.173F);
		G36Khandguard.addChild(DustCover7_r2);
		setRotationAngle(DustCover7_r2, 0.0F, 0.0F, 0.7854F);
		DustCover7_r2.cubeList.add(new ModelBox(DustCover7_r2, 120, 116, -0.5F, -0.5F, -9.503F, 1, 1, 1, -0.1F, false));
		DustCover7_r2.cubeList.add(new ModelBox(DustCover7_r2, 120, 113, -0.5F, -0.5F, -7.878F, 1, 1, 1, -0.1F, false));
		DustCover7_r2.cubeList.add(new ModelBox(DustCover7_r2, 120, 111, -0.5F, -0.5F, -4.628F, 1, 1, 1, -0.1F, false));
		DustCover7_r2.cubeList.add(new ModelBox(DustCover7_r2, 120, 94, -0.5F, -0.5F, -6.253F, 1, 1, 1, -0.1F, false));
		DustCover7_r2.cubeList.add(new ModelBox(DustCover7_r2, 120, 92, -0.5F, -0.5F, -1.378F, 1, 1, 1, -0.1F, false));
		DustCover7_r2.cubeList.add(new ModelBox(DustCover7_r2, 119, 41, -0.5F, -0.5F, -3.003F, 1, 1, 1, -0.1F, false));
		DustCover7_r2.cubeList.add(new ModelBox(DustCover7_r2, 116, 65, -0.5F, -0.5F, 0.247F, 1, 1, 1, -0.1F, false));
		DustCover7_r2.cubeList.add(new ModelBox(DustCover7_r2, 116, 60, -0.5F, -0.5F, 1.872F, 1, 1, 1, -0.1F, false));
		DustCover7_r2.cubeList.add(new ModelBox(DustCover7_r2, 0, 116, -0.5F, -0.5F, 3.497F, 1, 1, 1, -0.1F, false));
		DustCover7_r2.cubeList.add(new ModelBox(DustCover7_r2, 114, 113, -0.5F, -0.5F, 5.122F, 1, 1, 1, -0.1F, false));

		DustCover8_r4 = new ModelRenderer(this);
		DustCover8_r4.setRotationPoint(-2.4F, -31.2054F, -55.173F);
		G36Khandguard.addChild(DustCover8_r4);
		setRotationAngle(DustCover8_r4, 0.0F, 0.0F, -0.7854F);
		DustCover8_r4.cubeList.add(new ModelBox(DustCover8_r4, 114, 111, -0.5F, -0.5F, -9.503F, 1, 1, 1, -0.1F, false));
		DustCover8_r4.cubeList.add(new ModelBox(DustCover8_r4, 114, 102, -0.5F, -0.5F, -7.878F, 1, 1, 1, -0.1F, false));
		DustCover8_r4.cubeList.add(new ModelBox(DustCover8_r4, 114, 100, -0.5F, -0.5F, -4.628F, 1, 1, 1, -0.1F, false));
		DustCover8_r4.cubeList.add(new ModelBox(DustCover8_r4, 114, 94, -0.5F, -0.5F, -6.253F, 1, 1, 1, -0.1F, false));
		DustCover8_r4.cubeList.add(new ModelBox(DustCover8_r4, 114, 92, -0.5F, -0.5F, -1.378F, 1, 1, 1, -0.1F, false));
		DustCover8_r4.cubeList.add(new ModelBox(DustCover8_r4, 0, 114, -0.5F, -0.5F, -3.003F, 1, 1, 1, -0.1F, false));
		DustCover8_r4.cubeList.add(new ModelBox(DustCover8_r4, 100, 113, -0.5F, -0.5F, 0.247F, 1, 1, 1, -0.1F, false));
		DustCover8_r4.cubeList.add(new ModelBox(DustCover8_r4, 94, 113, -0.5F, -0.5F, 1.872F, 1, 1, 1, -0.1F, false));
		DustCover8_r4.cubeList.add(new ModelBox(DustCover8_r4, 69, 113, -0.5F, -0.5F, 3.497F, 1, 1, 1, -0.1F, false));
		DustCover8_r4.cubeList.add(new ModelBox(DustCover8_r4, 63, 113, -0.5F, -0.5F, 5.122F, 1, 1, 1, -0.1F, false));

		DustCover5_r3 = new ModelRenderer(this);
		DustCover5_r3.setRotationPoint(-2.7044F, -31.3137F, -61.35F);
		G36Khandguard.addChild(DustCover5_r3);
		setRotationAngle(DustCover5_r3, 0.0F, 0.0F, -1.1781F);
		DustCover5_r3.cubeList.add(new ModelBox(DustCover5_r3, 192, 197, -0.5F, -0.5F, -3.5F, 1, 1, 24, -0.3F, false));

		DustCover4_r3 = new ModelRenderer(this);
		DustCover4_r3.setRotationPoint(-0.2956F, -31.3137F, -61.35F);
		G36Khandguard.addChild(DustCover4_r3);
		setRotationAngle(DustCover4_r3, 0.0F, 0.0F, 1.1781F);
		DustCover4_r3.cubeList.add(new ModelBox(DustCover4_r3, 192, 172, -0.5F, -0.5F, -3.5F, 1, 1, 24, -0.3F, false));

		cube_r150 = new ModelRenderer(this);
		cube_r150.setRotationPoint(0.2929F, -38.5F, -43.75F);
		G36Khandguard.addChild(cube_r150);
		setRotationAngle(cube_r150, 0.0F, 0.7854F, 0.0F);
		cube_r150.cubeList.add(new ModelBox(cube_r150, 70, 58, -0.5F, -2.5F, -0.5F, 1, 5, 1, -0.001F, false));

		cube_r151 = new ModelRenderer(this);
		cube_r151.setRotationPoint(0.5429F, -39.999F, -41.751F);
		G36Khandguard.addChild(cube_r151);
		setRotationAngle(cube_r151, 0.0F, 0.7854F, 0.0F);
		cube_r151.cubeList.add(new ModelBox(cube_r151, 16, 17, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.001F, false));

		cube_r152 = new ModelRenderer(this);
		cube_r152.setRotationPoint(-1.5784F, -37.5848F, -41.251F);
		G36Khandguard.addChild(cube_r152);
		setRotationAngle(cube_r152, 0.0F, 0.0F, -0.7854F);
		cube_r152.cubeList.add(new ModelBox(cube_r152, 113, 52, 2.0F, 0.0F, -0.5F, 1, 1, 1, -0.001F, false));

		cube_r153 = new ModelRenderer(this);
		cube_r153.setRotationPoint(0.8678F, -33.5353F, -55.875F);
		G36Khandguard.addChild(cube_r153);
		setRotationAngle(cube_r153, 0.0F, 0.0F, -0.9599F);
		cube_r153.cubeList.add(new ModelBox(cube_r153, 113, 50, -0.5F, -0.5F, -9.5F, 1, 1, 1, -0.001F, false));
		cube_r153.cubeList.add(new ModelBox(cube_r153, 94, 39, -0.5F, -0.5F, -8.625F, 1, 1, 37, 0.0F, false));

		cube_r154 = new ModelRenderer(this);
		cube_r154.setRotationPoint(-0.0303F, -39.8215F, -53.3206F);
		G36Khandguard.addChild(cube_r154);
		setRotationAngle(cube_r154, 0.3927F, 0.0F, -0.1745F);
		cube_r154.cubeList.add(new ModelBox(cube_r154, 44, 113, -0.5F, -3.9442F, -8.8149F, 1, 1, 1, 0.0F, false));

		cube_r155 = new ModelRenderer(this);
		cube_r155.setRotationPoint(0.5509F, -36.5257F, -48.5F);
		G36Khandguard.addChild(cube_r155);
		setRotationAngle(cube_r155, 0.0F, 0.0F, -0.1745F);
		cube_r155.cubeList.add(new ModelBox(cube_r155, 5, 17, -0.5F, 1.0F, -16.0F, 1, 2, 1, 0.0F, false));
		cube_r155.cubeList.add(new ModelBox(cube_r155, 65, 10, -0.5F, -2.0F, -15.0F, 1, 5, 1, 0.0F, false));
		cube_r155.cubeList.add(new ModelBox(cube_r155, 108, 0, -0.5F, -3.0F, -6.5F, 1, 1, 2, 0.0F, false));
		cube_r155.cubeList.add(new ModelBox(cube_r155, 56, 107, -0.5F, -3.0F, 2.5F, 1, 1, 2, 0.0F, false));
		cube_r155.cubeList.add(new ModelBox(cube_r155, 113, 41, -0.5F, -3.0F, -10.5F, 1, 1, 1, 0.0F, false));
		cube_r155.cubeList.add(new ModelBox(cube_r155, 113, 39, -0.5F, -3.0F, -1.5F, 1, 1, 1, 0.0F, false));
		cube_r155.cubeList.add(new ModelBox(cube_r155, 100, 111, -0.5F, -3.0F, -14.5F, 1, 1, 1, 0.0F, false));
		cube_r155.cubeList.add(new ModelBox(cube_r155, 53, 0, -0.5F, -2.0F, -14.0F, 1, 5, 18, 0.0F, false));

		cube_r156 = new ModelRenderer(this);
		cube_r156.setRotationPoint(0.5235F, -36.6807F, -54.7011F);
		G36Khandguard.addChild(cube_r156);
		setRotationAngle(cube_r156, -0.3491F, 0.0F, -0.1745F);
		cube_r156.cubeList.add(new ModelBox(cube_r156, 85, 67, -0.5F, -0.4215F, -8.9571F, 1, 7, 1, 0.001F, false));

		cube_r157 = new ModelRenderer(this);
		cube_r157.setRotationPoint(0.3062F, -37.9133F, -41.0303F);
		G36Khandguard.addChild(cube_r157);
		setRotationAngle(cube_r157, 0.6545F, 0.0F, -0.1745F);
		cube_r157.cubeList.add(new ModelBox(cube_r157, 94, 111, -0.5F, -0.5F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r158 = new ModelRenderer(this);
		cube_r158.setRotationPoint(-0.5865F, -32.7268F, -40.0F);
		G36Khandguard.addChild(cube_r158);
		setRotationAngle(cube_r158, 0.0F, 0.0F, -0.3927F);
		cube_r158.cubeList.add(new ModelBox(cube_r158, 53, 0, -1.5F, -0.5F, -25.5F, 3, 1, 38, 0.0F, false));

		cube_r159 = new ModelRenderer(this);
		cube_r159.setRotationPoint(0.7245F, -35.5409F, -30.0F);
		G36Khandguard.addChild(cube_r159);
		setRotationAngle(cube_r159, 0.0F, 0.0F, -0.1745F);
		cube_r159.cubeList.add(new ModelBox(cube_r159, 11, 0, -0.5F, 0.0F, 0.5F, 1, 2, 1, 0.0F, false));
		cube_r159.cubeList.add(new ModelBox(cube_r159, 18, 0, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r160 = new ModelRenderer(this);
		cube_r160.setRotationPoint(-0.5921F, -37.8251F, -30.4401F);
		G36Khandguard.addChild(cube_r160);
		setRotationAngle(cube_r160, 1.1345F, 0.0F, -0.1745F);
		cube_r160.cubeList.add(new ModelBox(cube_r160, 63, 111, 0.3999F, -0.5F, -0.6F, 1, 1, 1, -0.001F, false));

		cube_r161 = new ModelRenderer(this);
		cube_r161.setRotationPoint(0.7393F, -35.4572F, -29.183F);
		G36Khandguard.addChild(cube_r161);
		setRotationAngle(cube_r161, 0.5236F, 0.0F, -0.1745F);
		cube_r161.cubeList.add(new ModelBox(cube_r161, 53, 10, -0.4999F, -2.75F, -0.25F, 1, 5, 1, 0.001F, false));

		cube_r162 = new ModelRenderer(this);
		cube_r162.setRotationPoint(-0.0569F, -39.9725F, -49.0F);
		G36Khandguard.addChild(cube_r162);
		setRotationAngle(cube_r162, 0.0F, 0.0F, -0.1745F);
		cube_r162.cubeList.add(new ModelBox(cube_r162, 44, 92, -0.5F, -0.5F, -13.05F, 1, 1, 18, 0.0F, false));

		cube_r163 = new ModelRenderer(this);
		cube_r163.setRotationPoint(0.6377F, -36.0333F, -35.5F);
		G36Khandguard.addChild(cube_r163);
		setRotationAngle(cube_r163, 0.0F, 0.0F, -0.1745F);
		cube_r163.cubeList.add(new ModelBox(cube_r163, 165, 83, -0.5F, -2.5F, -5.0F, 1, 5, 10, 0.0F, false));

		cube_r164 = new ModelRenderer(this);
		cube_r164.setRotationPoint(-0.7358F, -40.28F, -47.25F);
		G36Khandguard.addChild(cube_r164);
		setRotationAngle(cube_r164, 0.0F, 0.0F, 0.2182F);
		cube_r164.cubeList.add(new ModelBox(cube_r164, 0, 47, -1.0F, -0.5F, -15.5F, 2, 1, 19, 0.0F, false));

		cube_r165 = new ModelRenderer(this);
		cube_r165.setRotationPoint(0.464F, -37.0181F, -46.5F);
		G36Khandguard.addChild(cube_r165);
		setRotationAngle(cube_r165, 0.0F, 0.0F, -0.1745F);
		cube_r165.cubeList.add(new ModelBox(cube_r165, 44, 111, -0.5F, -3.5F, 2.0F, 1, 7, 4, 0.0F, false));

		rail3 = new ModelRenderer(this);
		rail3.setRotationPoint(1.5F, -35.5258F, -47.884F);
		G36Khandguard.addChild(rail3);
		setRotationAngle(rail3, 0.0F, 0.0F, -1.5708F);
		rail3.cubeList.add(new ModelBox(rail3, 53, 23, -0.5F, -0.9242F, -15.568F, 1, 1, 14, 0.3F, false));

		DustCover6_r2 = new ModelRenderer(this);
		DustCover6_r2.setRotationPoint(-1.2044F, 0.2121F, -13.466F);
		rail3.addChild(DustCover6_r2);
		setRotationAngle(DustCover6_r2, 0.0F, 0.0F, -1.1781F);
		DustCover6_r2.cubeList.add(new ModelBox(DustCover6_r2, 128, 77, -0.5F, -0.5F, -3.5F, 1, 1, 16, -0.3F, false));

		DustCover5_r4 = new ModelRenderer(this);
		DustCover5_r4.setRotationPoint(1.2044F, 0.2121F, -13.466F);
		rail3.addChild(DustCover5_r4);
		setRotationAngle(DustCover5_r4, 0.0F, 0.0F, 1.1781F);
		DustCover5_r4.cubeList.add(new ModelBox(DustCover5_r4, 0, 0, -0.5F, -0.5F, -3.5F, 1, 1, 16, -0.3F, false));

		teeth2 = new ModelRenderer(this);
		teeth2.setRotationPoint(0.0F, -3.014F, 20.334F);
		rail3.addChild(teeth2);
		teeth2.cubeList.add(new ModelBox(teeth2, 44, 126, -1.0F, 3.0F, -22.5F, 2, 1, 1, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 122, 67, -1.0F, 3.0F, -24.125F, 2, 1, 1, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 120, 87, -1.0F, 3.0F, -25.75F, 2, 1, 1, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 119, 39, -1.0F, 3.0F, -27.375F, 2, 1, 1, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 86, 115, -1.0F, 3.0F, -30.625F, 2, 1, 1, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 114, 87, -1.0F, 3.0F, -29.0F, 2, 1, 1, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 112, 108, -1.0F, 3.0F, -33.875F, 2, 1, 1, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 69, 111, -1.0F, 3.0F, -32.25F, 2, 1, 1, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 106, 108, -1.0F, 3.0F, -35.5F, 2, 1, 1, -0.1F, false));
		teeth2.cubeList.add(new ModelBox(teeth2, 92, 108, -1.0F, 3.0F, -37.125F, 2, 1, 1, -0.1F, false));

		DustCover8_r5 = new ModelRenderer(this);
		DustCover8_r5.setRotationPoint(0.9F, 3.3343F, -27.623F);
		teeth2.addChild(DustCover8_r5);
		setRotationAngle(DustCover8_r5, 0.0F, 0.0F, 0.7854F);
		DustCover8_r5.cubeList.add(new ModelBox(DustCover8_r5, 57, 111, -0.5F, -0.5F, -9.503F, 1, 1, 1, -0.1F, false));
		DustCover8_r5.cubeList.add(new ModelBox(DustCover8_r5, 44, 111, -0.5F, -0.5F, -7.878F, 1, 1, 1, -0.1F, false));
		DustCover8_r5.cubeList.add(new ModelBox(DustCover8_r5, 110, 33, -0.5F, -0.5F, -4.628F, 1, 1, 1, -0.1F, false));
		DustCover8_r5.cubeList.add(new ModelBox(DustCover8_r5, 110, 15, -0.5F, -0.5F, -6.253F, 1, 1, 1, -0.1F, false));
		DustCover8_r5.cubeList.add(new ModelBox(DustCover8_r5, 74, 108, -0.5F, -0.5F, -1.378F, 1, 1, 1, -0.1F, false));
		DustCover8_r5.cubeList.add(new ModelBox(DustCover8_r5, 107, 43, -0.5F, -0.5F, -3.003F, 1, 1, 1, -0.1F, false));
		DustCover8_r5.cubeList.add(new ModelBox(DustCover8_r5, 14, 107, -0.5F, -0.5F, 0.247F, 1, 1, 1, -0.1F, false));
		DustCover8_r5.cubeList.add(new ModelBox(DustCover8_r5, 34, 106, -0.5F, -0.5F, 1.872F, 1, 1, 1, -0.1F, false));
		DustCover8_r5.cubeList.add(new ModelBox(DustCover8_r5, 0, 105, -0.5F, -0.5F, 3.497F, 1, 1, 1, -0.1F, false));
		DustCover8_r5.cubeList.add(new ModelBox(DustCover8_r5, 104, 72, -0.5F, -0.5F, 5.122F, 1, 1, 1, -0.1F, false));

		DustCover9_r3 = new ModelRenderer(this);
		DustCover9_r3.setRotationPoint(-0.9F, 3.3343F, -27.623F);
		teeth2.addChild(DustCover9_r3);
		setRotationAngle(DustCover9_r3, 0.0F, 0.0F, -0.7854F);
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 104, 70, -0.5F, -0.5F, -9.503F, 1, 1, 1, -0.1F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 104, 60, -0.5F, -0.5F, -7.878F, 1, 1, 1, -0.1F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 0, 103, -0.5F, -0.5F, -4.628F, 1, 1, 1, -0.1F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 86, 102, -0.5F, -0.5F, -6.253F, 1, 1, 1, -0.1F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 64, 102, -0.5F, -0.5F, -1.378F, 1, 1, 1, -0.1F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 14, 101, -0.5F, -0.5F, -3.003F, 1, 1, 1, -0.1F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 86, 100, -0.5F, -0.5F, 0.247F, 1, 1, 1, -0.1F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 64, 100, -0.5F, -0.5F, 1.872F, 1, 1, 1, -0.1F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 14, 99, -0.5F, -0.5F, 3.497F, 1, 1, 1, -0.1F, false));
		DustCover9_r3.cubeList.add(new ModelBox(DustCover9_r3, 94, 72, -0.5F, -0.5F, 5.122F, 1, 1, 1, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		G36Khandguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
