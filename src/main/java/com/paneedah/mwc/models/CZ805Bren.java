package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class CZ805Bren extends ModelWithAttachments {
	private final QRenderer lowerreceiver;
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
	private final ModelRenderer rail;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;
	private final QRenderer grip;
	private final ModelRenderer grip2_r1;
	private final ModelRenderer grip7_r1;
	private final ModelRenderer grip6_r1;
	private final ModelRenderer grip7_r2;
	private final ModelRenderer grip10_r1;
	private final ModelRenderer grip9_r1;
	private final QRenderer barrel;

	public CZ805Bren() {
		textureWidth = 220;
		textureHeight = 220;

		lowerreceiver = new QRenderer(this);
		lowerreceiver.setRotationPoint(0.0F, 24.0F, 0.0F);
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 22, 162, -3.1F, -33.25F, -23.0F, 2, 3, 17, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 58, 0, -2.5F, -33.45F, -48.0F, 2, 1, 23, 0.001F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 69, 0, -2.5F, -34.45F, -47.9F, 2, 1, 4, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 43, 102, -2.5F, -34.45F, -33.25F, 2, 1, 1, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 85, 3, -2.5F, -34.45F, -29.35F, 2, 1, 2, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 25, 81, -3.25F, -33.25F, -24.0F, 3, 5, 11, 0.001F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 0, 0, -0.75F, -33.25F, -24.0F, 1, 5, 11, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 49, 7, -0.75F, -33.55F, -24.75F, 1, 3, 1, -0.001F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 81, 84, -3.25F, -33.55F, -24.75F, 3, 3, 1, 0.002F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 85, 0, -0.3F, -33.15F, -24.15F, 1, 1, 12, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 58, 24, -0.3F, -31.05F, -24.15F, 1, 3, 1, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 0, 0, -2.5F, -33.0F, -14.25F, 3, 7, 2, -0.002F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 102, 63, -0.5F, -30.3F, -14.25F, 2, 1, 1, -0.3F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 102, 26, -0.5F, -30.3F, -13.85F, 2, 1, 1, -0.3F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 25, 102, -0.5F, -30.3F, -13.45F, 2, 1, 1, -0.3F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 56, 56, -3.7F, -31.05F, -24.15F, 1, 3, 1, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 83, 56, -3.7F, -33.15F, -24.15F, 1, 1, 12, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 0, 66, -3.8F, -31.2F, -24.15F, 1, 1, 9, -0.303F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 95, 16, -0.2F, -31.2F, -24.15F, 1, 1, 6, -0.303F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 50, 27, -0.2F, -33.2F, -23.65F, 1, 3, 1, -0.304F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 49, 0, -3.8F, -33.2F, -23.65F, 1, 3, 1, -0.304F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 11, 66, -3.5F, -30.0F, -14.25F, 1, 4, 2, -0.002F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 83, 69, -2.5F, -27.25F, -14.25F, 2, 1, 7, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 81, 95, -3.5F, -33.5F, -14.25F, 1, 2, 2, -0.002F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 107, 40, -3.5F, -30.9F, -15.9F, 1, 1, 1, -0.002F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 40, 107, -3.5F, -31.6F, -15.9F, 1, 1, 1, -0.003F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 41, 61, -0.5F, -31.4F, -18.4F, 1, 1, 5, 0.001F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 94, 69, -0.4F, -31.15F, -18.5F, 1, 1, 6, 0.001F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 43, 97, -0.5F, -32.4F, -16.15F, 1, 1, 2, 0.001F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 27, 61, -0.5F, -31.0F, -18.4F, 1, 1, 5, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 27, 73, -3.1F, -33.55F, -0.7F, 2, 2, 3, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 71, 11, -1.9F, -33.55F, -0.7F, 2, 2, 3, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 162, 0, -2.0F, -33.25F, -23.0F, 2, 3, 17, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 56, 68, -1.9F, -33.25F, -8.0F, 2, 3, 2, 0.001F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 48, 87, -1.9F, -33.25F, -13.0F, 2, 3, 1, 0.001F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 58, 41, -1.9F, -32.25F, -11.0F, 2, 1, 3, 0.001F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 27, 7, -1.79F, -32.25F, -11.0F, 2, 1, 4, -0.1F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 0, 85, -1.79F, -31.35F, -7.6F, 2, 1, 1, -0.1F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 68, 84, -1.79F, -31.35F, -6.4F, 2, 1, 1, -0.1F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 12, 85, -1.9F, -31.5F, -9.0F, 2, 1, 1, 0.002F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 60, 163, -1.7F, -31.05F, -22.8F, 2, 1, 17, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 162, 25, -1.7F, -33.45F, -22.8F, 2, 1, 17, -0.2F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.4F, -32.35F, -5.9F);
		lowerreceiver.addChild(cube_r41);
		setRotationAngle(cube_r41, -0.495F, 0.1875F, -0.1108F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 16, 51, -1.7F, -0.7F, -0.3F, 2, 1, 2, -0.2F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(0.4F, -31.45F, -6.5F);
		lowerreceiver.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.2793F, 0.0F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 71, -1.7F, -1.7F, -0.3F, 2, 2, 2, -0.3F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(0.1F, -30.25F, -6.0F);
		lowerreceiver.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.2269F, 0.0F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 85, 13, -2.0F, -3.0F, 0.0F, 2, 3, 6, -0.001F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 87, 24, -3.2F, -3.0F, 0.0F, 2, 3, 6, -0.001F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(0.25F, -28.25F, -24.0F);
		lowerreceiver.addChild(cube_r44);
		setRotationAngle(cube_r44, -0.2269F, 0.0F, 0.0F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 27, -1.0F, -3.0F, 0.0F, 1, 3, 10, -0.001F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 25, 110, -3.5F, -3.0F, 0.0F, 3, 3, 10, 0.0F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-3.25F, -29.7F, -13.65F);
		lowerreceiver.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.5411F, 0.0F, 0.0F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 97, 59, -0.25F, 0.0F, -2.0F, 1, 1, 2, -0.001F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-3.25F, -31.8F, -13.65F);
		lowerreceiver.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.5411F, 0.0F, 0.0F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 60, 97, -0.25F, -1.0F, -2.0F, 1, 1, 2, -0.001F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.5F, -30.0F, -15.9F);
		lowerreceiver.addChild(cube_r47);
		setRotationAngle(cube_r47, -0.5411F, 0.0F, 0.0F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 97, 56, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.001F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(1.0F, -31.85F, -14.3F);
		lowerreceiver.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, -0.1396F, 0.0F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 37, 97, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.2F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.8F, -30.15F, -13.3F);
		lowerreceiver.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, -0.1571F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 107, 25, -1.1F, -1.0F, -0.5F, 1, 1, 1, 0.051F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 107, 27, -1.1F, -1.0F, 0.0F, 1, 1, 1, 0.05F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-3.7F, -30.25F, -14.2F);
		lowerreceiver.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.2094F, 0.0F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 107, 23, 0.0F, -1.0F, 0.75F, 1, 1, 1, 0.001F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 24, 107, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.002F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.5F, -30.7F, -19.1F);
		lowerreceiver.addChild(cube_r51);
		setRotationAngle(cube_r51, -0.7854F, 0.0F, 0.0F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 36, 107, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-2.5F, -26.25F, -7.25F);
		lowerreceiver.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.3142F, 0.0F, 0.0F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 66, 68, 0.0F, -1.0F, 0.0F, 2, 1, 4, -0.001F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(-2.5F, -27.25F, -11.25F);
		lowerreceiver.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.5585F, 0.0F, 0.0F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 97, 27, 0.0F, -2.0F, -1.0F, 2, 2, 1, -0.001F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(-3.5F, -28.25F, -23.95F);
		lowerreceiver.addChild(cube_r54);
		setRotationAngle(cube_r54, 1.3439F, 0.0F, 0.0F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 72, 24, -0.1F, 0.0F, -0.1F, 1, 10, 1, -0.101F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 74, 80, 3.1F, 0.0F, -0.1F, 1, 10, 1, -0.101F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(0.74F, -31.93F, -14.3F);
		lowerreceiver.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.0F, -1.4486F, 0.0F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 102, 61, -1.9F, -0.9F, -0.1F, 2, 1, 1, -0.1F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(0.55F, -32.1F, -14.4F);
		lowerreceiver.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.0F, 0.0F, 0.7854F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 31, 97, -0.75F, 0.0F, 0.0F, 1, 1, 2, -0.002F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(1.2F, -29.6F, -12.75F);
		lowerreceiver.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.0F, -1.2217F, 0.0F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 25, 97, -0.7F, -0.7F, -0.3F, 1, 1, 2, -0.302F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.5F, -32.3F, -25.4F);
		lowerreceiver.addChild(cube_r58);
		setRotationAngle(cube_r58, -0.4363F, 0.0F, 0.0F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 12, 35, -4.0F, -1.0F, 0.0F, 4, 1, 1, -0.002F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(0.25F, -32.05F, -26.15F);
		lowerreceiver.addChild(cube_r59);
		setRotationAngle(cube_r59, -0.4363F, 0.0F, 0.0F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 48, 55, -1.0F, -3.0F, 0.0F, 1, 3, 2, -0.002F, false));
		cube_r59.cubeList.add(new ModelBox(cube_r59, 68, 61, -3.5F, -3.0F, 0.0F, 3, 3, 2, 0.0F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-3.55F, -30.55F, -24.75F);
		lowerreceiver.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.6807F, 0.0F, 0.0F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 107, 31, -0.05F, -0.1F, -0.1F, 1, 1, 1, -0.104F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 28, 107, -0.15F, 0.5F, -0.2F, 1, 1, 1, -0.203F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 32, 107, 3.25F, 0.5F, -0.2F, 1, 1, 1, -0.203F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 107, 33, 3.15F, -0.1F, -0.1F, 1, 1, 1, -0.104F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 85, 6, 0.6F, 0.0F, 0.0F, 3, 2, 1, -0.002F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(-2.5F, -33.45F, -26.65F);
		lowerreceiver.addChild(cube_r61);
		setRotationAngle(cube_r61, 1.0472F, 0.0F, 0.0F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 31, 102, 0.0F, -1.0F, -1.0F, 2, 1, 1, -0.001F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-2.5F, -33.45F, -30.05F);
		lowerreceiver.addChild(cube_r62);
		setRotationAngle(cube_r62, -1.0472F, 0.0F, 0.0F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 37, 102, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.001F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(-2.1F, -29.55F, -7.9F);
		lowerreceiver.addChild(cube_r63);
		setRotationAngle(cube_r63, -0.5411F, 0.0F, 0.0F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 27, 68, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(-2.1F, -30.65F, -8.6F);
		lowerreceiver.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.2967F, 0.0F, 0.0F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 33, 68, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		rail = new ModelRenderer(this);
		rail.setRotationPoint(-2.3F, -32.6F, -48.0F);
		lowerreceiver.addChild(rail);
		rail.cubeList.add(new ModelBox(rail, 86, 98, -0.2F, -0.2F, 12.05F, 2, 1, 1, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 97, 95, -0.2F, -0.2F, 13.3F, 2, 1, 1, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 70, 97, -0.2F, -0.2F, 14.55F, 2, 1, 1, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 97, 66, -0.2F, -0.2F, 15.8F, 2, 1, 1, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 88, 83, -0.2F, -0.2F, 17.05F, 2, 1, 1, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 41, 7, -0.2F, -0.2F, 18.3F, 2, 1, 4, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 97, 64, -0.2F, -0.2F, 7.05F, 2, 1, 1, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 97, -0.2F, -0.2F, 8.3F, 2, 1, 1, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 97, 62, -0.2F, -0.2F, 9.55F, 2, 1, 1, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 47, 97, -0.2F, -0.2F, 10.8F, 2, 1, 1, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 95, 77, -0.2F, -0.2F, 5.8F, 2, 1, 1, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 95, 17, -0.2F, -0.2F, 4.55F, 2, 1, 1, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 94, 73, -0.2F, -0.2F, 3.3F, 2, 1, 1, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 89, 77, -0.2F, -0.2F, 2.05F, 2, 1, 1, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 40, 51, -0.2F, -0.2F, -0.2F, 2, 1, 2, -0.2F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(0.0F, 0.6F, 0.0F);
		rail.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.0F, 0.0F, -0.9425F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 96, 83, -0.2F, -0.8F, -0.2F, 1, 1, 2, -0.202F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 85, 95, -0.2F, -0.8F, 2.05F, 1, 1, 1, -0.202F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 29, 97, -0.2F, -0.8F, 3.3F, 1, 1, 1, -0.202F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 41, 97, -0.2F, -0.8F, 4.55F, 1, 1, 1, -0.202F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 102, 65, -0.2F, -0.8F, 5.8F, 1, 1, 1, -0.202F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 102, 73, -0.2F, -0.8F, 10.8F, 1, 1, 1, -0.202F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 103, 15, -0.2F, -0.8F, 9.55F, 1, 1, 1, -0.202F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 103, 19, -0.2F, -0.8F, 8.3F, 1, 1, 1, -0.202F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 103, 30, -0.2F, -0.8F, 7.05F, 1, 1, 1, -0.202F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 67, 47, -0.2F, -0.8F, 18.3F, 1, 1, 4, -0.202F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 95, 47, -0.2F, -0.8F, 17.05F, 1, 1, 1, -0.202F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 103, 39, -0.2F, -0.8F, 15.8F, 1, 1, 1, -0.202F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 103, 95, -0.2F, -0.8F, 14.55F, 1, 1, 1, -0.202F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 103, 103, -0.2F, -0.8F, 13.3F, 1, 1, 1, -0.202F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 104, 3, -0.2F, -0.8F, 12.05F, 1, 1, 1, -0.202F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 145, 84, -0.1F, -0.9F, 1.3F, 1, 1, 21, -0.3F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(1.6F, 0.6F, 0.0F);
		rail.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.0F, 0.0F, 0.9425F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 96, 86, -0.8F, -0.8F, -0.2F, 1, 1, 2, -0.202F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 91, 95, -0.8F, -0.8F, 2.05F, 1, 1, 1, -0.202F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 35, 97, -0.8F, -0.8F, 3.3F, 1, 1, 1, -0.202F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 19, 102, -0.8F, -0.8F, 4.55F, 1, 1, 1, -0.202F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 102, 69, -0.8F, -0.8F, 5.8F, 1, 1, 1, -0.202F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 102, 71, -0.8F, -0.8F, 10.8F, 1, 1, 1, -0.202F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 102, 100, -0.8F, -0.8F, 9.55F, 1, 1, 1, -0.202F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 103, 17, -0.8F, -0.8F, 8.3F, 1, 1, 1, -0.202F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 103, 28, -0.8F, -0.8F, 7.05F, 1, 1, 1, -0.202F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 27, 68, -0.8F, -0.8F, 18.3F, 1, 1, 4, -0.202F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 95, 49, -0.8F, -0.8F, 17.05F, 1, 1, 1, -0.202F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 103, 37, -0.8F, -0.8F, 15.8F, 1, 1, 1, -0.202F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 48, 103, -0.8F, -0.8F, 14.55F, 1, 1, 1, -0.202F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 103, 98, -0.8F, -0.8F, 13.3F, 1, 1, 1, -0.202F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 104, 1, -0.8F, -0.8F, 12.05F, 1, 1, 1, -0.202F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 145, 56, -0.9F, -0.9F, 1.3F, 1, 1, 21, -0.3F, false));

		grip = new QRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		grip2_r1 = new ModelRenderer(this);
		grip2_r1.setRotationPoint(-3.0F, -28.8F, -5.5F);
		grip.addChild(grip2_r1);
		setRotationAngle(grip2_r1, 0.4765F, 0.0F, 0.0F);
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 58, 24, 0.0F, -2.5F, 0.0F, 3, 13, 4, 0.002F, false));

		grip7_r1 = new ModelRenderer(this);
		grip7_r1.setRotationPoint(0.0F, -30.4F, 0.2F);
		grip.addChild(grip7_r1);
		setRotationAngle(grip7_r1, 0.3316F, 0.0F, 0.0F);
		grip7_r1.cubeList.add(new ModelBox(grip7_r1, 12, 81, -3.0F, -2.0F, 0.0F, 3, 2, 2, -0.002F, false));

		grip6_r1 = new ModelRenderer(this);
		grip6_r1.setRotationPoint(0.0F, -27.8F, -2.7F);
		grip.addChild(grip6_r1);
		setRotationAngle(grip6_r1, -0.3665F, 0.0F, 0.0F);
		grip6_r1.cubeList.add(new ModelBox(grip6_r1, 13, 0, -3.0F, -5.0F, -1.0F, 3, 5, 3, 0.0F, false));

		grip7_r2 = new ModelRenderer(this);
		grip7_r2.setRotationPoint(-3.0F, -29.0F, -1.0F);
		grip.addChild(grip7_r2);
		setRotationAngle(grip7_r2, -0.9909F, 0.0F, 0.0F);
		grip7_r2.cubeList.add(new ModelBox(grip7_r2, 31, 39, -0.001F, -1.0F, 0.0F, 3, 2, 8, 0.0F, false));

		grip10_r1 = new ModelRenderer(this);
		grip10_r1.setRotationPoint(0.0F, -18.4F, -1.729F);
		grip.addChild(grip10_r1);
		setRotationAngle(grip10_r1, -0.0213F, 0.0F, 0.0F);
		grip10_r1.cubeList.add(new ModelBox(grip10_r1, 25, 81, -3.0F, -4.0F, 0.0F, 3, 4, 1, -0.002F, false));

		grip9_r1 = new ModelRenderer(this);
		grip9_r1.setRotationPoint(0.0F, -23.0F, 4.171F);
		grip.addChild(grip9_r1);
		setRotationAngle(grip9_r1, 0.2929F, 0.0F, 0.0F);
		grip9_r1.cubeList.add(new ModelBox(grip9_r1, 56, 80, -3.0F, 0.0F, -6.0F, 3, 3, 6, 0.0F, false));

		barrel = new QRenderer(this);
		barrel.setRotationPoint(-2.0F, -11.25F, -73.0F);
		barrel.cubeList.add(new ModelBox(barrel, 0, 162, 0.0F, -1.05F, 5.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 161, 106, 0.0F, -0.65F, 5.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 160, 155, 0.2F, -0.85F, 5.0F, 1, 1, 20, 0.002F, false));
		barrel.cubeList.add(new ModelBox(barrel, 159, 134, -0.2F, -0.85F, 5.0F, 1, 1, 20, 0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 86, 47, -0.45F, -1.35F, 0.0F, 2, 2, 5, 0.002F, false));
		barrel.cubeList.add(new ModelBox(barrel, 72, 47, 0.05F, -1.55F, -1.0F, 1, 1, 6, 0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 11, 66, 0.05F, -0.15F, -1.0F, 1, 1, 6, 0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 41, 55, -0.65F, -0.9F, 0.0F, 1, 1, 5, 0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 27, 55, 0.75F, -0.9F, 0.0F, 1, 1, 5, 0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 64, 90, 0.0F, -3.25F, 19.0F, 1, 1, 6, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 56, 89, -0.5F, -3.75F, 20.25F, 2, 2, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 10, 76, -0.5F, -1.75F, 20.25F, 2, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 83, 64, 0.0F, 0.9F, 20.55F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 68, 56, -0.5F, -1.25F, 22.25F, 2, 2, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 58, 47, -0.5F, -1.25F, 18.75F, 2, 2, 5, 0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		lowerreceiver.render(f5);
		grip.render(f5);
		barrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
