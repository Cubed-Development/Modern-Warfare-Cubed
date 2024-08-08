package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M202 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer Main106_r1;
	private final ModelRenderer Main105_r1;
	private final ModelRenderer Main104_r1;
	private final ModelRenderer Main103_r1;
	private final ModelRenderer Main102_r1;
	private final ModelRenderer Main101_r1;
	private final ModelRenderer Main100_r1;
	private final ModelRenderer Main99_r1;
	private final ModelRenderer Main97_r1;
	private final ModelRenderer Main96_r1;
	private final ModelRenderer Main95_r1;
	private final ModelRenderer Main94_r1;
	private final ModelRenderer Main89_r1;
	private final ModelRenderer Main86_r1;
	private final ModelRenderer Main84_r1;
	private final ModelRenderer Main83_r1;
	private final ModelRenderer Main107_r1;
	private final ModelRenderer Main35_r1;
	private final ModelRenderer Main34_r1;
	private final ModelRenderer Main33_r1;
	private final ModelRenderer Main32_r1;
	private final ModelRenderer Main31_r1;
	private final ModelRenderer Main30_r1;
	private final ModelRenderer Main29_r1;
	private final ModelRenderer Main28_r1;
	private final ModelRenderer Main27_r1;
	private final ModelRenderer Main26_r1;
	private final ModelRenderer Main25_r1;
	private final ModelRenderer Main24_r1;
	private final ModelRenderer Main23_r1;
	private final ModelRenderer Main22_r1;
	private final ModelRenderer Main21_r1;
	private final ModelRenderer Main20_r1;
	private final ModelRenderer Main19_r1;
	private final ModelRenderer Main18_r1;
	private final ModelRenderer Main17_r1;
	private final ModelRenderer Main16_r1;
	private final ModelRenderer Main15_r1;
	private final ModelRenderer Main14_r1;
	private final ModelRenderer Main12_r1;
	private final ModelRenderer Main11_r1;
	private final ModelRenderer Main76_r1;
	private final ModelRenderer Main74_r1;
	private final ModelRenderer Main70_r1;
	private final ModelRenderer Dot;
	private final ModelRenderer MAIN2DOT36_r1;
	private final ModelRenderer MAIN2DOT35_r1;
	private final ModelRenderer MAIN2DOT33_r1;
	private final ModelRenderer MAIN2DOT32_r1;
	private final ModelRenderer MAIN2DOT31_r1;
	private final ModelRenderer MAIN2DOT29_r1;
	private final ModelRenderer MAIN2DOT28_r1;
	private final ModelRenderer MAIN2DOT27_r1;
	private final ModelRenderer MAIN2DOT25_r1;
	private final ModelRenderer MAIN2DOT24_r1;
	private final ModelRenderer MAIN2DOT20_r1;
	private final ModelRenderer MAIN2DOT16_r1;
	private final ModelRenderer MAIN2DOT14_r1;
	private final ModelRenderer MAIN2DOT7_r1;
	private final ModelRenderer handle;
	private final ModelRenderer HANDLE3TRIGGER_r1;
	private final ModelRenderer HANDLE4_r1;
	private final ModelRenderer HANDLE5_r1;

	public M202() {
		textureWidth = 256;
		textureHeight = 256;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(-1.5619F, 25.3726F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 0, 0, -8.4381F, -16.3726F, -37.0F, 1, 1, 2, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, 2.0619F, -33.3726F, -43.0F, 1, 12, 3, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -17.9381F, -33.3726F, -43.0F, 1, 12, 3, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -13.4381F, -37.8726F, -43.0F, 12, 1, 3, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -13.4381F, -17.8726F, -43.0F, 12, 1, 3, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -13.4381F, -17.8726F, 29.0F, 12, 1, 3, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, 2.0619F, -33.3726F, 29.0F, 1, 12, 3, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -13.4381F, -37.8726F, 29.0F, 12, 1, 3, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -17.9381F, -33.3726F, 29.0F, 1, 12, 3, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -8.9381F, -39.8726F, 20.5F, 3, 1, 1, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, 1.5619F, -33.3726F, -42.0F, 1, 12, 71, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -13.4381F, -37.3726F, -42.0F, 12, 1, 74, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -13.4381F, -18.3726F, -42.0F, 12, 1, 74, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -17.4381F, -33.3726F, -42.0F, 1, 12, 74, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -8.4381F, -35.3726F, -42.0F, 2, 16, 74, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -15.4381F, -28.3726F, -42.0F, 16, 2, 74, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -15.4381F, -36.3726F, -42.0F, 16, 1, 74, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -15.4381F, -19.3726F, -42.0F, 16, 1, 74, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, 0.5619F, -35.3726F, -42.0F, 1, 16, 74, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -16.4381F, -35.3726F, -42.0F, 1, 16, 74, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, 0.5619F, -38.3726F, 0.0F, 3, 14, 6, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -8.9381F, -37.9726F, -41.0F, 3, 1, 6, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -9.4381F, -38.3726F, 26.0F, 4, 1, 6, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -8.4381F, -40.3726F, 27.0F, 2, 2, 4, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -8.4381F, -39.3726F, -39.0F, 2, 2, 3, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -9.4381F, -17.3726F, -39.0F, 4, 1, 6, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -9.4381F, -17.3726F, 21.0F, 4, 1, 10, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -6.4381F, -39.1726F, -38.0F, 1, 1, 8, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -9.4381F, -39.1726F, -38.0F, 1, 1, 8, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -8.9381F, -39.1726F, -30.5F, 3, 1, 1, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -6.4381F, -39.8726F, 21.0F, 1, 1, 8, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -9.4381F, -39.8726F, 21.0F, 1, 1, 8, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -7.4381F, -38.3726F, 0.0F, 8, 2, 6, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, 3.0619F, -37.3726F, 1.5F, 1, 5, 4, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, 4.0619F, -36.8726F, 2.0F, 2, 3, 3, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, 6.0619F, -36.6726F, 3.5F, 3, 2, 1, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 150, 8.5619F, -37.8726F, 1.5F, 1, 4, 6, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 150, 10.0619F, -39.3726F, 1.5F, 4, 1, 6, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 150, 10.0619F, -33.3726F, 1.5F, 4, 1, 6, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 150, 14.5619F, -37.8726F, 1.5F, 1, 4, 6, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 150, 10.0619F, -41.3726F, 2.0F, 4, 2, 1, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, 3.5619F, -33.3726F, 3.0F, 1, 7, 2, 0.0F, true));

		Main106_r1 = new ModelRenderer(this);
		Main106_r1.setRotationPoint(25.7425F, -4.5955F, 0.0F);
		gun.addChild(Main106_r1);
		setRotationAngle(Main106_r1, 0.0F, 0.0F, -0.7854F);
		Main106_r1.cubeList.add(new ModelBox(Main106_r1, 0, 150, 8.2F, -32.8F, 7.3F, 1, 2, 1, 0.0F, true));

		Main105_r1 = new ModelRenderer(this);
		Main105_r1.setRotationPoint(-23.0479F, -18.3594F, 0.0F);
		gun.addChild(Main105_r1);
		setRotationAngle(Main105_r1, 0.0F, 0.0F, 0.7854F);
		Main105_r1.cubeList.add(new ModelBox(Main105_r1, 0, 150, 8.2F, -38.2F, 7.3F, 1, 2, 1, 0.0F, true));

		Main104_r1 = new ModelRenderer(this);
		Main104_r1.setRotationPoint(32.3224F, -3.5102F, 0.0F);
		gun.addChild(Main104_r1);
		setRotationAngle(Main104_r1, 0.0F, 0.0F, -0.7854F);
		Main104_r1.cubeList.add(new ModelBox(Main104_r1, 0, 150, 11.8F, -38.2F, 7.3F, 1, 2, 1, 0.0F, true));

		Main103_r1 = new ModelRenderer(this);
		Main103_r1.setRotationPoint(1.5619F, -15.5485F, -20.2236F);
		gun.addChild(Main103_r1);
		setRotationAngle(Main103_r1, -0.7854F, 0.0F, 0.0F);
		Main103_r1.cubeList.add(new ModelBox(Main103_r1, 0, 150, 8.5F, -32.5F, 7.0F, 4, 1, 1, 0.0F, true));

		Main102_r1 = new ModelRenderer(this);
		Main102_r1.setRotationPoint(1.5619F, -7.4064F, 28.5668F);
		gun.addChild(Main102_r1);
		setRotationAngle(Main102_r1, 0.7854F, 0.0F, 0.0F);
		Main102_r1.cubeList.add(new ModelBox(Main102_r1, 0, 150, 8.5F, -37.5F, 7.0F, 4, 1, 1, 0.0F, true));

		Main101_r1 = new ModelRenderer(this);
		Main101_r1.setRotationPoint(-0.9261F, -1.3726F, 4.6568F);
		gun.addChild(Main101_r1);
		setRotationAngle(Main101_r1, 0.0F, 0.5205F, 0.0F);
		Main101_r1.cubeList.add(new ModelBox(Main101_r1, 0, 150, 6.5F, -36.5F, 7.0F, 1, 4, 1, 0.0F, true));

		Main100_r1 = new ModelRenderer(this);
		Main100_r1.setRotationPoint(6.8309F, -1.3726F, -5.7867F);
		gun.addChild(Main100_r1);
		setRotationAngle(Main100_r1, 0.0F, -0.5205F, 0.0F);
		Main100_r1.cubeList.add(new ModelBox(Main100_r1, 0, 150, 13.5F, -36.5F, 7.0F, 1, 4, 1, 0.0F, true));

		Main99_r1 = new ModelRenderer(this);
		Main99_r1.setRotationPoint(1.5619F, -37.9687F, -37.8889F);
		gun.addChild(Main99_r1);
		setRotationAngle(Main99_r1, -1.4128F, 0.0F, 0.0F);
		Main99_r1.cubeList.add(new ModelBox(Main99_r1, 0, 150, 7.5F, -40.5F, 2.5F, 6, 6, 1, 0.0F, true));

		Main97_r1 = new ModelRenderer(this);
		Main97_r1.setRotationPoint(25.9718F, -4.4419F, 0.0F);
		gun.addChild(Main97_r1);
		setRotationAngle(Main97_r1, 0.0F, 0.0F, -0.7854F);
		Main97_r1.cubeList.add(new ModelBox(Main97_r1, 0, 150, 8.5F, -33.0F, 1.5F, 1, 2, 6, 0.0F, true));

		Main96_r1 = new ModelRenderer(this);
		Main96_r1.setRotationPoint(-16.6973F, -19.2911F, 0.0F);
		gun.addChild(Main96_r1);
		setRotationAngle(Main96_r1, 0.0F, 0.0F, 0.7854F);
		Main96_r1.cubeList.add(new ModelBox(Main96_r1, 0, 150, 11.5F, -33.0F, 1.5F, 1, 2, 6, 0.0F, true));

		Main95_r1 = new ModelRenderer(this);
		Main95_r1.setRotationPoint(32.0931F, -3.6637F, 0.0F);
		gun.addChild(Main95_r1);
		setRotationAngle(Main95_r1, 0.0F, 0.0F, -0.7854F);
		Main95_r1.cubeList.add(new ModelBox(Main95_r1, 0, 150, 11.5F, -38.0F, 1.5F, 1, 2, 6, 0.0F, true));

		Main94_r1 = new ModelRenderer(this);
		Main94_r1.setRotationPoint(-22.8186F, -18.513F, 0.0F);
		gun.addChild(Main94_r1);
		setRotationAngle(Main94_r1, 0.0F, 0.0F, 0.7854F);
		Main94_r1.cubeList.add(new ModelBox(Main94_r1, 0, 150, 8.5F, -38.0F, 1.5F, 1, 2, 6, 0.0F, true));

		Main89_r1 = new ModelRenderer(this);
		Main89_r1.setRotationPoint(8.1637F, -1.1491F, 0.0F);
		gun.addChild(Main89_r1);
		setRotationAngle(Main89_r1, 0.0F, 0.0F, -0.1859F);
		Main89_r1.cubeList.add(new ModelBox(Main89_r1, 0, 0, 4.5F, -35.3F, 3.5F, 3, 1, 1, 0.0F, true));

		Main86_r1 = new ModelRenderer(this);
		Main86_r1.setRotationPoint(-1.933F, -1.7687F, 0.0F);
		gun.addChild(Main86_r1);
		setRotationAngle(Main86_r1, 0.0F, 0.0F, 0.1115F);
		Main86_r1.cubeList.add(new ModelBox(Main86_r1, 0, 0, 1.8F, -31.5F, 2.3F, 1, 5, 1, 0.0F, true));

		Main84_r1 = new ModelRenderer(this);
		Main84_r1.setRotationPoint(-15.2084F, -41.9655F, 0.0F);
		gun.addChild(Main84_r1);
		setRotationAngle(Main84_r1, 0.0F, 0.0F, 2.1192F);
		Main84_r1.cubeList.add(new ModelBox(Main84_r1, 0, 0, 3.0F, -25.0F, 3.0F, 3, 1, 2, 0.0F, true));

		Main83_r1 = new ModelRenderer(this);
		Main83_r1.setRotationPoint(-17.2343F, -34.3986F, 0.0F);
		gun.addChild(Main83_r1);
		setRotationAngle(Main83_r1, 0.0F, 0.0F, 1.9333F);
		Main83_r1.cubeList.add(new ModelBox(Main83_r1, 0, 0, 2.0F, -23.0F, 0.0F, 3, 1, 6, 0.0F, true));

		Main107_r1 = new ModelRenderer(this);
		Main107_r1.setRotationPoint(-16.468F, -19.4447F, 0.0F);
		gun.addChild(Main107_r1);
		setRotationAngle(Main107_r1, 0.0F, 0.0F, 0.7854F);
		Main107_r1.cubeList.add(new ModelBox(Main107_r1, 0, 150, 11.8F, -32.8F, 7.3F, 1, 2, 1, 0.0F, true));

		Main35_r1 = new ModelRenderer(this);
		Main35_r1.setRotationPoint(-45.1412F, -14.6588F, 0.0F);
		gun.addChild(Main35_r1);
		setRotationAngle(Main35_r1, 0.0F, 0.0F, 1.3439F);
		Main35_r1.cubeList.add(new ModelBox(Main35_r1, 0, 0, -15.0F, -36.0F, -42.0F, 1, 2, 74, 0.0F, true));
		Main35_r1.cubeList.add(new ModelBox(Main35_r1, 0, 0, -15.5F, -36.0F, -43.0F, 1, 2, 3, 0.0F, true));

		Main34_r1 = new ModelRenderer(this);
		Main34_r1.setRotationPoint(-4.5394F, 1.3657F, 0.0F);
		gun.addChild(Main34_r1);
		setRotationAngle(Main34_r1, 0.0F, 0.0F, 0.1745F);
		Main34_r1.cubeList.add(new ModelBox(Main34_r1, 0, 0, -18.7F, -33.5F, -42.0F, 1, 2, 74, 0.0F, true));
		Main34_r1.cubeList.add(new ModelBox(Main34_r1, 0, 0, -19.2F, -33.5F, -43.0F, 1, 2, 3, 0.0F, true));

		Main33_r1 = new ModelRenderer(this);
		Main33_r1.setRotationPoint(-16.8918F, -15.7834F, 0.0F);
		gun.addChild(Main33_r1);
		setRotationAngle(Main33_r1, 0.0F, 0.0F, 1.501F);
		Main33_r1.cubeList.add(new ModelBox(Main33_r1, 0, 0, -1.5F, -17.1F, -42.0F, 1, 2, 74, 0.0F, true));
		Main33_r1.cubeList.add(new ModelBox(Main33_r1, 0, 0, -1.0F, -17.1F, 29.0F, 1, 2, 3, 0.0F, true));
		Main33_r1.cubeList.add(new ModelBox(Main33_r1, 0, 0, -1.0F, -17.1F, -43.0F, 1, 2, 3, 0.0F, true));

		Main32_r1 = new ModelRenderer(this);
		Main32_r1.setRotationPoint(-1.9458F, -1.6795F, 0.0F);
		gun.addChild(Main32_r1);
		setRotationAngle(Main32_r1, 0.0F, 0.0F, 0.1745F);
		Main32_r1.cubeList.add(new ModelBox(Main32_r1, 0, 0, 0.0F, -20.2F, -42.0F, 1, 2, 74, 0.0F, true));
		Main32_r1.cubeList.add(new ModelBox(Main32_r1, 0, 0, 0.5F, -20.2F, 29.0F, 1, 2, 3, 0.0F, true));
		Main32_r1.cubeList.add(new ModelBox(Main32_r1, 0, 0, 0.5F, -20.2F, -43.0F, 1, 2, 3, 0.0F, true));

		Main31_r1 = new ModelRenderer(this);
		Main31_r1.setRotationPoint(-28.8732F, 0.104F, 0.0F);
		gun.addChild(Main31_r1);
		setRotationAngle(Main31_r1, 0.0F, 0.0F, 0.7854F);
		Main31_r1.cubeList.add(new ModelBox(Main31_r1, 0, 0, -16.5F, -36.0F, -42.0F, 1, 3, 74, 0.0F, true));
		Main31_r1.cubeList.add(new ModelBox(Main31_r1, 0, 0, -16.0F, -36.0F, -24.0F, 1, 3, 56, 0.0F, true));
		Main31_r1.cubeList.add(new ModelBox(Main31_r1, 0, 0, -17.0F, -36.0F, 29.0F, 1, 3, 3, 0.0F, true));
		Main31_r1.cubeList.add(new ModelBox(Main31_r1, 0, 0, -17.0F, -36.0F, -43.0F, 1, 3, 3, 0.0F, true));

		Main30_r1 = new ModelRenderer(this);
		Main30_r1.setRotationPoint(-11.8732F, -6.9376F, 0.0F);
		gun.addChild(Main30_r1);
		setRotationAngle(Main30_r1, 0.0F, 0.0F, 0.7854F);
		Main30_r1.cubeList.add(new ModelBox(Main30_r1, 0, 0, 0.0F, -19.0F, -42.0F, 1, 3, 74, 0.0F, true));
		Main30_r1.cubeList.add(new ModelBox(Main30_r1, 0, 0, 0.5F, -19.0F, 29.0F, 1, 3, 3, 0.0F, true));
		Main30_r1.cubeList.add(new ModelBox(Main30_r1, 0, 0, 0.5F, -19.0F, -43.0F, 1, 3, 3, 0.0F, true));

		Main29_r1 = new ModelRenderer(this);
		Main29_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(Main29_r1);
		setRotationAngle(Main29_r1, 0.0F, 0.0F, 0.0873F);
		Main29_r1.cubeList.add(new ModelBox(Main29_r1, 0, 0, -16.5F, -17.2F, -42.0F, 2, 1, 74, 0.0F, true));
		Main29_r1.cubeList.add(new ModelBox(Main29_r1, 0, 0, -16.5F, -16.7F, 29.0F, 2, 1, 3, 0.0F, true));
		Main29_r1.cubeList.add(new ModelBox(Main29_r1, 0, 0, -16.5F, -16.7F, -43.0F, 2, 1, 3, 0.0F, true));

		Main28_r1 = new ModelRenderer(this);
		Main28_r1.setRotationPoint(-33.0833F, 0.1823F, 0.0F);
		gun.addChild(Main28_r1);
		setRotationAngle(Main28_r1, 0.0F, 0.0F, 1.3439F);
		Main28_r1.cubeList.add(new ModelBox(Main28_r1, 0, 0, -17.8F, -22.0F, -42.0F, 2, 2, 74, 0.0F, true));
		Main28_r1.cubeList.add(new ModelBox(Main28_r1, 0, 0, -17.8F, -20.5F, 29.0F, 2, 1, 3, 0.0F, true));
		Main28_r1.cubeList.add(new ModelBox(Main28_r1, 0, 0, -17.8F, -20.5F, -43.0F, 2, 1, 3, 0.0F, true));

		Main27_r1 = new ModelRenderer(this);
		Main27_r1.setRotationPoint(-30.564F, -27.2534F, 0.0F);
		gun.addChild(Main27_r1);
		setRotationAngle(Main27_r1, 0.0F, 0.0F, 1.3265F);
		Main27_r1.cubeList.add(new ModelBox(Main27_r1, 0, 0, 0.5F, -33.6F, -42.0F, 2, 1, 74, 0.0F, true));

		Main26_r1 = new ModelRenderer(this);
		Main26_r1.setRotationPoint(-8.4773F, -1.9403F, 0.0F);
		gun.addChild(Main26_r1);
		setRotationAngle(Main26_r1, 0.0F, 0.0F, 0.2793F);
		Main26_r1.cubeList.add(new ModelBox(Main26_r1, 0, 0, -3.0F, -36.0F, -42.0F, 2, 1, 74, 0.0F, true));
		Main26_r1.cubeList.add(new ModelBox(Main26_r1, 0, 0, -3.0F, -36.5F, 29.0F, 2, 1, 3, 0.0F, true));
		Main26_r1.cubeList.add(new ModelBox(Main26_r1, 0, 0, -3.0F, -36.5F, -43.0F, 2, 1, 3, 0.0F, true));

		Main25_r1 = new ModelRenderer(this);
		Main25_r1.setRotationPoint(-17.1452F, 5.7903F, 0.0F);
		gun.addChild(Main25_r1);
		setRotationAngle(Main25_r1, 0.0F, 0.0F, 0.7854F);
		Main25_r1.cubeList.add(new ModelBox(Main25_r1, 0, 0, -18.0F, -19.0F, -42.0F, 3, 1, 74, 0.0F, true));
		Main25_r1.cubeList.add(new ModelBox(Main25_r1, 0, 0, -18.0F, -18.5F, 29.0F, 3, 1, 3, 0.0F, true));
		Main25_r1.cubeList.add(new ModelBox(Main25_r1, 0, 0, -18.0F, -18.5F, -43.0F, 3, 1, 3, 0.0F, true));

		Main24_r1 = new ModelRenderer(this);
		Main24_r1.setRotationPoint(-23.1869F, -11.6239F, 0.0F);
		gun.addChild(Main24_r1);
		setRotationAngle(Main24_r1, 0.0F, 0.0F, 0.7854F);
		Main24_r1.cubeList.add(new ModelBox(Main24_r1, 0, 0, -1.5F, -34.5F, -42.0F, 3, 1, 74, 0.0F, true));
		Main24_r1.cubeList.add(new ModelBox(Main24_r1, 0, 0, -1.5F, -35.0F, 29.0F, 3, 1, 3, 0.0F, true));
		Main24_r1.cubeList.add(new ModelBox(Main24_r1, 0, 0, -1.5F, -35.0F, -43.0F, 3, 1, 3, 0.0F, true));

		Main23_r1 = new ModelRenderer(this);
		Main23_r1.setRotationPoint(-26.2623F, -4.1993F, 0.0F);
		gun.addChild(Main23_r1);
		setRotationAngle(Main23_r1, 0.0F, 0.0F, 0.7854F);
		Main23_r1.cubeList.add(new ModelBox(Main23_r1, 0, 0, -10.5F, -35.0F, -24.0F, 2, 1, 56, 0.0F, true));

		Main22_r1 = new ModelRenderer(this);
		Main22_r1.setRotationPoint(-23.2163F, 2.4472F, 0.0F);
		gun.addChild(Main22_r1);
		setRotationAngle(Main22_r1, 0.0F, 0.0F, 0.7854F);
		Main22_r1.cubeList.add(new ModelBox(Main22_r1, 0, 0, -17.0F, -28.0F, -24.0F, 2, 1, 56, 0.0F, true));

		Main21_r1 = new ModelRenderer(this);
		Main21_r1.setRotationPoint(-17.2622F, -7.9272F, 0.0F);
		gun.addChild(Main21_r1);
		setRotationAngle(Main21_r1, 0.0F, 0.0F, 0.7854F);
		Main21_r1.cubeList.add(new ModelBox(Main21_r1, 0, 0, -1.5F, -26.0F, -24.0F, 2, 1, 56, 0.0F, true));

		Main20_r1 = new ModelRenderer(this);
		Main20_r1.setRotationPoint(-14.2163F, -1.2807F, 0.0F);
		gun.addChild(Main20_r1);
		setRotationAngle(Main20_r1, 0.0F, 0.0F, 0.7854F);
		Main20_r1.cubeList.add(new ModelBox(Main20_r1, 0, 0, -8.0F, -19.0F, -24.0F, 2, 1, 56, 0.0F, true));

		Main19_r1 = new ModelRenderer(this);
		Main19_r1.setRotationPoint(-21.8021F, 3.033F, 0.0F);
		gun.addChild(Main19_r1);
		setRotationAngle(Main19_r1, 0.0F, 0.0F, 0.7854F);
		Main19_r1.cubeList.add(new ModelBox(Main19_r1, 0, 0, -17.0F, -26.0F, -24.0F, 1, 2, 56, 0.0F, true));

		Main18_r1 = new ModelRenderer(this);
		Main18_r1.setRotationPoint(-25.53F, -5.967F, 0.0F);
		gun.addChild(Main18_r1);
		setRotationAngle(Main18_r1, 0.0F, 0.0F, 0.7854F);
		Main18_r1.cubeList.add(new ModelBox(Main18_r1, 0, 0, -8.0F, -35.0F, -24.0F, 1, 2, 56, 0.0F, true));

		Main17_r1 = new ModelRenderer(this);
		Main17_r1.setRotationPoint(-18.53F, -8.8665F, 0.0F);
		gun.addChild(Main17_r1);
		setRotationAngle(Main17_r1, 0.0F, 0.0F, 0.7854F);
		Main17_r1.cubeList.add(new ModelBox(Main17_r1, 0, 0, -1.0F, -28.0F, -24.0F, 1, 2, 56, 0.0F, true));

		Main16_r1 = new ModelRenderer(this);
		Main16_r1.setRotationPoint(-14.8021F, 0.1335F, 0.0F);
		gun.addChild(Main16_r1);
		setRotationAngle(Main16_r1, 0.0F, 0.0F, 0.7854F);
		Main16_r1.cubeList.add(new ModelBox(Main16_r1, 0, 0, -10.0F, -19.0F, -24.0F, 1, 2, 56, 0.0F, true));

		Main15_r1 = new ModelRenderer(this);
		Main15_r1.setRotationPoint(-16.8523F, 5.0832F, 0.0F);
		gun.addChild(Main15_r1);
		setRotationAngle(Main15_r1, 0.0F, 0.0F, 0.7854F);
		Main15_r1.cubeList.add(new ModelBox(Main15_r1, 0, 0, -18.0F, -19.0F, -24.0F, 3, 1, 56, 0.0F, true));

		Main14_r1 = new ModelRenderer(this);
		Main14_r1.setRotationPoint(-21.7727F, -11.0381F, 0.0F);
		gun.addChild(Main14_r1);
		setRotationAngle(Main14_r1, 0.0F, 0.0F, 0.7854F);
		Main14_r1.cubeList.add(new ModelBox(Main14_r1, 0, 0, -3.0F, -33.5F, -24.0F, 3, 1, 56, 0.0F, true));

		Main12_r1 = new ModelRenderer(this);
		Main12_r1.setRotationPoint(-12.5803F, -7.2305F, 0.0F);
		gun.addChild(Main12_r1);
		setRotationAngle(Main12_r1, 0.0F, 0.0F, 0.7854F);
		Main12_r1.cubeList.add(new ModelBox(Main12_r1, 0, 0, 0.0F, -19.0F, -24.0F, 1, 2, 56, 0.0F, true));

		Main11_r1 = new ModelRenderer(this);
		Main11_r1.setRotationPoint(-21.5803F, -3.5026F, 0.0F);
		gun.addChild(Main11_r1);
		setRotationAngle(Main11_r1, 0.0F, 0.0F, 0.7854F);
		Main11_r1.cubeList.add(new ModelBox(Main11_r1, 0, 0, -9.0F, -29.0F, -24.0F, 4, 4, 56, 0.0F, true));

		Main76_r1 = new ModelRenderer(this);
		Main76_r1.setRotationPoint(-4.5364F, 1.3309F, 0.0F);
		gun.addChild(Main76_r1);
		setRotationAngle(Main76_r1, 0.0F, 0.0F, 0.1745F);
		Main76_r1.cubeList.add(new ModelBox(Main76_r1, 0, 0, -19.0F, -33.5F, 29.0F, 1, 2, 3, 0.0F, true));

		Main74_r1 = new ModelRenderer(this);
		Main74_r1.setRotationPoint(-46.1156F, -15.4339F, 0.0F);
		gun.addChild(Main74_r1);
		setRotationAngle(Main74_r1, 0.0F, 0.0F, 1.3439F);
		Main74_r1.cubeList.add(new ModelBox(Main74_r1, 0, 0, -14.5F, -37.0F, 29.0F, 1, 2, 3, 0.0F, true));

		Main70_r1 = new ModelRenderer(this);
		Main70_r1.setRotationPoint(-31.3221F, -26.2831F, 0.0F);
		gun.addChild(Main70_r1);
		setRotationAngle(Main70_r1, 0.0F, 0.0F, 1.3265F);
		Main70_r1.cubeList.add(new ModelBox(Main70_r1, 0, 0, -0.5F, -35.0F, 29.0F, 2, 1, 3, 0.0F, true));
		Main70_r1.cubeList.add(new ModelBox(Main70_r1, 0, 0, -0.5F, -35.0F, -43.0F, 2, 1, 3, 0.0F, true));

		Dot = new ModelRenderer(this);
		Dot.setRotationPoint(-8.3376F, -5.4731F, 0.0F);
		gun.addChild(Dot);
		Dot.cubeList.add(new ModelBox(Dot, 0, 0, -5.1005F, 8.6005F, -40.0F, 12, 1, 2, 0.0F, true));
		Dot.cubeList.add(new ModelBox(Dot, 0, 0, -9.6005F, -6.8995F, -40.0F, 1, 12, 2, 0.0F, true));
		Dot.cubeList.add(new ModelBox(Dot, 0, 0, -5.1005F, -11.3995F, -40.0F, 12, 1, 2, 0.0F, true));
		Dot.cubeList.add(new ModelBox(Dot, 0, 0, 10.3995F, -6.8995F, -40.0F, 1, 12, 2, 0.0F, true));
		Dot.cubeList.add(new ModelBox(Dot, 0, 0, 10.3995F, -6.8995F, 27.0F, 1, 12, 3, 0.0F, true));
		Dot.cubeList.add(new ModelBox(Dot, 0, 0, -5.1005F, 8.6005F, 27.0F, 12, 1, 3, 0.0F, true));
		Dot.cubeList.add(new ModelBox(Dot, 0, 0, -9.6005F, -6.8995F, 27.0F, 1, 12, 3, 0.0F, true));
		Dot.cubeList.add(new ModelBox(Dot, 0, 0, -5.1005F, -11.3995F, 27.0F, 12, 1, 3, 0.0F, true));
		Dot.cubeList.add(new ModelBox(Dot, 0, 0, -0.1005F, -7.8995F, -34.5F, 2, 14, 2, 0.0F, true));
		Dot.cubeList.add(new ModelBox(Dot, 0, 0, -9.1005F, -10.8995F, -38.0F, 20, 20, 1, 0.0F, true));
		Dot.cubeList.add(new ModelBox(Dot, 0, 0, -9.1005F, -10.8995F, 26.0F, 20, 20, 1, 0.0F, true));
		Dot.cubeList.add(new ModelBox(Dot, 0, 0, -1.6005F, -8.8995F, -37.0F, 5, 1, 5, 0.0F, true));
		Dot.cubeList.add(new ModelBox(Dot, 0, 0, -1.6005F, 6.1005F, -37.0F, 5, 1, 5, 0.0F, true));

		MAIN2DOT36_r1 = new ModelRenderer(this);
		MAIN2DOT36_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Dot.addChild(MAIN2DOT36_r1);
		setRotationAngle(MAIN2DOT36_r1, 0.0F, 0.0F, 0.7854F);
		MAIN2DOT36_r1.cubeList.add(new ModelBox(MAIN2DOT36_r1, 0, 0, -1.5F, -14.0F, 27.0F, 3, 1, 3, 0.0F, true));
		MAIN2DOT36_r1.cubeList.add(new ModelBox(MAIN2DOT36_r1, 0, 0, -1.5F, -14.0F, -40.0F, 3, 1, 2, 0.0F, true));

		MAIN2DOT35_r1 = new ModelRenderer(this);
		MAIN2DOT35_r1.setRotationPoint(5.6487F, 4.3463F, 0.0F);
		Dot.addChild(MAIN2DOT35_r1);
		setRotationAngle(MAIN2DOT35_r1, 0.0F, 0.0F, 0.2793F);
		MAIN2DOT35_r1.cubeList.add(new ModelBox(MAIN2DOT35_r1, 0, 0, -3.0F, -15.5F, 27.0F, 2, 1, 3, 0.0F, true));
		MAIN2DOT35_r1.cubeList.add(new ModelBox(MAIN2DOT35_r1, 0, 0, -3.0F, -15.5F, -40.0F, 2, 1, 2, 0.0F, true));

		MAIN2DOT33_r1 = new ModelRenderer(this);
		MAIN2DOT33_r1.setRotationPoint(-17.3162F, 6.3153F, 0.0F);
		Dot.addChild(MAIN2DOT33_r1);
		setRotationAngle(MAIN2DOT33_r1, 0.0F, 0.0F, 1.3439F);
		MAIN2DOT33_r1.cubeList.add(new ModelBox(MAIN2DOT33_r1, 0, 0, -14.5F, -16.0F, 27.0F, 1, 2, 3, 0.0F, true));

		MAIN2DOT32_r1 = new ModelRenderer(this);
		MAIN2DOT32_r1.setRotationPoint(-5.6863F, 11.7279F, 0.0F);
		Dot.addChild(MAIN2DOT32_r1);
		setRotationAngle(MAIN2DOT32_r1, 0.0F, 0.0F, 0.7854F);
		MAIN2DOT32_r1.cubeList.add(new ModelBox(MAIN2DOT32_r1, 0, 0, -17.0F, -15.0F, 27.0F, 1, 3, 3, 0.0F, true));
		MAIN2DOT32_r1.cubeList.add(new ModelBox(MAIN2DOT32_r1, 0, 0, -17.0F, -15.0F, -40.0F, 1, 3, 2, 0.0F, true));

		MAIN2DOT31_r1 = new ModelRenderer(this);
		MAIN2DOT31_r1.setRotationPoint(7.4296F, 7.3315F, 0.0F);
		Dot.addChild(MAIN2DOT31_r1);
		setRotationAngle(MAIN2DOT31_r1, 0.0F, 0.0F, 0.1745F);
		MAIN2DOT31_r1.cubeList.add(new ModelBox(MAIN2DOT31_r1, 0, 0, -19.2F, -12.5F, 27.0F, 1, 2, 3, 0.0F, true));

		MAIN2DOT29_r1 = new ModelRenderer(this);
		MAIN2DOT29_r1.setRotationPoint(-4.2839F, 21.9315F, 0.0F);
		Dot.addChild(MAIN2DOT29_r1);
		setRotationAngle(MAIN2DOT29_r1, 0.0F, 0.0F, 1.3439F);
		MAIN2DOT29_r1.cubeList.add(new ModelBox(MAIN2DOT29_r1, 0, 0, -17.8F, 0.5F, 27.0F, 2, 1, 3, 0.0F, true));
		MAIN2DOT29_r1.cubeList.add(new ModelBox(MAIN2DOT29_r1, 0, 0, -17.8F, 0.5F, -40.0F, 2, 1, 2, 0.0F, true));

		MAIN2DOT28_r1 = new ModelRenderer(this);
		MAIN2DOT28_r1.setRotationPoint(6.0416F, 17.4142F, 0.0F);
		Dot.addChild(MAIN2DOT28_r1);
		setRotationAngle(MAIN2DOT28_r1, 0.0F, 0.0F, 0.7854F);
		MAIN2DOT28_r1.cubeList.add(new ModelBox(MAIN2DOT28_r1, 0, 0, -18.0F, 2.5F, 27.0F, 3, 1, 3, 0.0F, true));
		MAIN2DOT28_r1.cubeList.add(new ModelBox(MAIN2DOT28_r1, 0, 0, -18.0F, 2.5F, -40.0F, 3, 1, 2, 0.0F, true));

		MAIN2DOT27_r1 = new ModelRenderer(this);
		MAIN2DOT27_r1.setRotationPoint(10.1679F, 5.553F, 0.0F);
		Dot.addChild(MAIN2DOT27_r1);
		setRotationAngle(MAIN2DOT27_r1, 0.0F, 0.0F, 0.0873F);
		MAIN2DOT27_r1.cubeList.add(new ModelBox(MAIN2DOT27_r1, 0, 0, -16.5F, 4.3F, 27.0F, 2, 1, 3, 0.0F, true));
		MAIN2DOT27_r1.cubeList.add(new ModelBox(MAIN2DOT27_r1, 0, 0, -16.5F, 4.3F, -40.0F, 2, 1, 2, 0.0F, true));

		MAIN2DOT25_r1 = new ModelRenderer(this);
		MAIN2DOT25_r1.setRotationPoint(12.3946F, 9.2248F, 0.0F);
		Dot.addChild(MAIN2DOT25_r1);
		setRotationAngle(MAIN2DOT25_r1, 0.0F, 0.0F, 1.501F);
		MAIN2DOT25_r1.cubeList.add(new ModelBox(MAIN2DOT25_r1, 0, 0, -1.0F, 3.9F, 27.0F, 1, 2, 3, 0.0F, true));
		MAIN2DOT25_r1.cubeList.add(new ModelBox(MAIN2DOT25_r1, 0, 0, -1.0F, 3.9F, -40.0F, 1, 2, 2, 0.0F, true));

		MAIN2DOT24_r1 = new ModelRenderer(this);
		MAIN2DOT24_r1.setRotationPoint(10.0384F, 4.1127F, 0.0F);
		Dot.addChild(MAIN2DOT24_r1);
		setRotationAngle(MAIN2DOT24_r1, 0.0F, 0.0F, 0.1745F);
		MAIN2DOT24_r1.cubeList.add(new ModelBox(MAIN2DOT24_r1, 0, 0, 0.5F, 0.8F, 27.0F, 1, 2, 3, 0.0F, true));
		MAIN2DOT24_r1.cubeList.add(new ModelBox(MAIN2DOT24_r1, 0, 0, 0.5F, 0.8F, -40.0F, 1, 2, 2, 0.0F, true));

		MAIN2DOT20_r1 = new ModelRenderer(this);
		MAIN2DOT20_r1.setRotationPoint(-2.6082F, -4.8903F, 0.0F);
		Dot.addChild(MAIN2DOT20_r1);
		setRotationAngle(MAIN2DOT20_r1, 0.0F, 0.0F, 1.3265F);
		MAIN2DOT20_r1.cubeList.add(new ModelBox(MAIN2DOT20_r1, 0, 0, -0.5F, -14.0F, -40.0F, 2, 1, 2, 0.0F, true));
		MAIN2DOT20_r1.cubeList.add(new ModelBox(MAIN2DOT20_r1, 0, 0, -0.5F, -14.0F, 27.0F, 2, 1, 3, 0.0F, true));

		MAIN2DOT16_r1 = new ModelRenderer(this);
		MAIN2DOT16_r1.setRotationPoint(-16.3418F, 7.0903F, 0.0F);
		Dot.addChild(MAIN2DOT16_r1);
		setRotationAngle(MAIN2DOT16_r1, 0.0F, 0.0F, 1.3439F);
		MAIN2DOT16_r1.cubeList.add(new ModelBox(MAIN2DOT16_r1, 0, 0, -15.5F, -15.0F, -40.0F, 1, 2, 2, 0.0F, true));

		MAIN2DOT14_r1 = new ModelRenderer(this);
		MAIN2DOT14_r1.setRotationPoint(7.4448F, 7.1578F, 0.0F);
		Dot.addChild(MAIN2DOT14_r1);
		setRotationAngle(MAIN2DOT14_r1, 0.0F, 0.0F, 0.1745F);
		MAIN2DOT14_r1.cubeList.add(new ModelBox(MAIN2DOT14_r1, 0, 0, -19.2F, -12.5F, -40.0F, 1, 2, 2, 0.0F, true));

		MAIN2DOT7_r1 = new ModelRenderer(this);
		MAIN2DOT7_r1.setRotationPoint(11.3137F, 4.6863F, 0.0F);
		Dot.addChild(MAIN2DOT7_r1);
		setRotationAngle(MAIN2DOT7_r1, 0.0F, 0.0F, 0.7854F);
		MAIN2DOT7_r1.cubeList.add(new ModelBox(MAIN2DOT7_r1, 0, 0, 0.5F, 2.0F, 27.0F, 1, 3, 3, 0.0F, true));
		MAIN2DOT7_r1.cubeList.add(new ModelBox(MAIN2DOT7_r1, 0, 0, 0.5F, 2.0F, -40.0F, 1, 3, 2, 0.0F, true));

		handle = new ModelRenderer(this);
		handle.setRotationPoint(1.5619F, -24.5162F, -11.3416F);
		gun.addChild(handle);
		handle.cubeList.add(new ModelBox(handle, 0, 0, -11.5F, 6.6436F, -10.6584F, 5, 1, 8, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 0, 0, -10.0F, 7.1436F, -6.6584F, 2, 9, 3, 0.0F, true));

		HANDLE3TRIGGER_r1 = new ModelRenderer(this);
		HANDLE3TRIGGER_r1.setRotationPoint(0.0F, 25.9303F, 8.7502F);
		handle.addChild(HANDLE3TRIGGER_r1);
		setRotationAngle(HANDLE3TRIGGER_r1, -0.1487F, 0.0F, 0.0F);
		HANDLE3TRIGGER_r1.cubeList.add(new ModelBox(HANDLE3TRIGGER_r1, 0, 0, -9.5F, -16.0F, -20.0F, 1, 4, 3, 0.0F, true));

		HANDLE4_r1 = new ModelRenderer(this);
		HANDLE4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		handle.addChild(HANDLE4_r1);
		setRotationAngle(HANDLE4_r1, 1.7846F, 0.0F, 0.0F);
		HANDLE4_r1.cubeList.add(new ModelBox(HANDLE4_r1, 0, 0, -10.0F, -7.0F, -15.0F, 2, 2, 5, 0.0F, true));

		HANDLE5_r1 = new ModelRenderer(this);
		HANDLE5_r1.setRotationPoint(0.0F, 4.18F, -20.2426F);
		handle.addChild(HANDLE5_r1);
		setRotationAngle(HANDLE5_r1, -2.7884F, 0.0F, 0.0F);
		HANDLE5_r1.cubeList.add(new ModelBox(HANDLE5_r1, 0, 0, -10.0F, -12.3F, -14.1F, 2, 3, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
