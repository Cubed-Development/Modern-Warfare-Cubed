package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Origin12 extends ModelWithAttachments {
	private final QRenderer gun;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer gun76_r1;
	private final ModelRenderer gun74_r1;
	private final ModelRenderer gun73_r1;
	private final ModelRenderer gun68_r1;
	private final ModelRenderer gun66_r1;
	private final ModelRenderer gun65_r1;
	private final ModelRenderer gun60_r1;
	private final ModelRenderer gun59_r1;
	private final ModelRenderer gun57_r1;
	private final ModelRenderer gun688_r1;
	private final ModelRenderer gun655_r1;
	private final ModelRenderer gun546_r1;
	private final ModelRenderer gun545_r1;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun52_r1;
	private final ModelRenderer gun49_r1;
	private final ModelRenderer gun44_r1;
	private final ModelRenderer gun41_r1;
	private final ModelRenderer gun37_r1;
	private final ModelRenderer grip32_r1;
	private final ModelRenderer grip33_r1;
	private final ModelRenderer grip33_r2;
	private final ModelRenderer grip32_r2;
	private final ModelRenderer grip31_r1;
	private final ModelRenderer grip30_r1;
	private final ModelRenderer grip29_r1;
	private final ModelRenderer grip27_r1;
	private final ModelRenderer grip25_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun25_r1;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer gun22_r1;
	private final ModelRenderer gun22_r2;
	private final ModelRenderer gun20_r1;
	private final ModelRenderer gun16_r1;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer gun17_r1;
	private final ModelRenderer gun16_r2;
	private final ModelRenderer gun14_r1;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun6_r2;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun1_r1;
	private final QRenderer handguard;
	private final ModelRenderer grip33_r3;
	private final ModelRenderer grip34_r1;
	private final ModelRenderer handguard51_r1;
	private final ModelRenderer bone4;
	private final ModelRenderer handguard126_r1;
	private final ModelRenderer handguard121_r1;
	private final ModelRenderer handguard116_r1;
	private final ModelRenderer handguard111_r1;
	private final ModelRenderer handguard103_r1;
	private final ModelRenderer handguard95_r1;
	private final ModelRenderer handguard93_r1;
	private final ModelRenderer handguard92_r1;
	private final ModelRenderer handguard83_r1;
	private final ModelRenderer handguard71_r1;
	private final ModelRenderer handguard68_r1;
	private final ModelRenderer handguard67_r1;
	private final ModelRenderer handguard66_r1;
	private final ModelRenderer handguard65_r1;
	private final ModelRenderer handguard64_r1;
	private final ModelRenderer handguard63_r1;
	private final ModelRenderer handguard56_r1;
	private final ModelRenderer handguard50_r1;
	private final ModelRenderer handguard38_r1;
	private final ModelRenderer handguard37_r1;
	private final ModelRenderer handguard36_r1;
	private final ModelRenderer handguard35_r1;
	private final ModelRenderer handguard34_r1;
	private final ModelRenderer handguard33_r1;
	private final ModelRenderer handguard22_r1;
	private final ModelRenderer handguard23_r1;
	private final ModelRenderer handguard5_r1;
	private final QRenderer stock;
	private final ModelRenderer grip53_r1;
	private final ModelRenderer grip48_r1;
	private final ModelRenderer grip52_r1;
	private final ModelRenderer grip51_r1;
	private final ModelRenderer grip50_r1;
	private final ModelRenderer grip49_r1;
	private final ModelRenderer grip47_r1;
	private final ModelRenderer grip46_r1;
	private final ModelRenderer grip40_r1;
	private final ModelRenderer stock51_r1;
	private final ModelRenderer stock49_r1;
	private final ModelRenderer stock48_r1;
	private final ModelRenderer stock47_r1;
	private final ModelRenderer stock42_r1;
	private final ModelRenderer stock41_r1;
	private final ModelRenderer stock39_r1;
	private final ModelRenderer stock35_r1;
	private final ModelRenderer stock31_r1;
	private final ModelRenderer stock30_r1;
	private final ModelRenderer stock29_r1;
	private final ModelRenderer stock28_r1;
	private final ModelRenderer stock25_r1;
	private final ModelRenderer stock20_r1;
	private final ModelRenderer stock19_r1;
	private final ModelRenderer stock14_r1;
	private final ModelRenderer stock12_r1;
	private final ModelRenderer stock11_r1;
	private final ModelRenderer stock10_r1;
	private final ModelRenderer stock8_r1;
	private final QRenderer grip;
	private final ModelRenderer grip12_r1;
	private final ModelRenderer grip9_r1;
	private final ModelRenderer grip8_r1;
	private final ModelRenderer grip7_r1;
	private final ModelRenderer grip4_r1;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip2_r1;
	private final QRenderer mag;
	private final ModelRenderer mag11_r1;
	private final ModelRenderer mag22_r1;
	private final ModelRenderer mag19_r1;
	private final QRenderer action;
	private final ModelRenderer action5_r1;
	private final ModelRenderer action8_r1;
	private final ModelRenderer action6_r1;

	public Origin12() {
		textureWidth = 200;
		textureHeight = 200;

		gun = new QRenderer(this);
		gun.setRotationPoint(-0.5F, -3.6462F, -13.5263F);
		gun.cubeList.add(new ModelBox(gun, 0, 134, -4.0F, -6.8538F, -16.5727F, 6, 2, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 66, -4.001F, -4.8538F, -3.5737F, 6, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 95, 1.502F, -4.5538F, -10.9747F, 1, 4, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 34, 80, 1.502F, -4.5538F, -14.9747F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 57, 1.5F, -6.1538F, -13.9737F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 54, 68, -4.0F, -5.1538F, -16.5737F, 6, 4, 2, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 52, 1.5F, -5.1538F, -10.9737F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 48, 1.5F, -5.1538F, -14.9737F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 40, -4.2F, -6.5038F, -15.6737F, 1, 4, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 63, 0, -4.202F, -6.5038F, -16.1737F, 1, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 132, 85, 0.7F, -7.8538F, 5.5263F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 132, 82, 0.7F, -5.8538F, 5.5263F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 132, 17, -3.7F, -5.8538F, 5.5263F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 131, -3.7F, -7.8538F, 5.5263F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 91, 13, 0.701F, -7.3538F, 3.5263F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 0, -3.701F, -7.3538F, 3.5263F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 107, 0.8F, -9.8538F, -10.4737F, 1, 1, 26, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 122, 0.8F, -11.8538F, -16.4737F, 1, 2, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 125, 0, 0.8F, -11.8538F, -9.4737F, 1, 1, 23, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 106, 57, 0.799F, -10.3538F, -9.4737F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 136, -3.8F, -9.8538F, -1.4737F, 1, 1, 17, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 150, 0, -3.8F, -11.8538F, -1.4737F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 110, -3.8F, -10.8538F, -1.4737F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 84, 121, -4.1F, -10.7538F, -1.4747F, 1, 2, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 37, -3.7F, -10.8538F, 7.5263F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 122, 0.7F, -10.8538F, -9.4737F, 1, 1, 23, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 84, 0, -4.1F, -10.7538F, -16.4737F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 41, -3.8F, -11.8538F, -16.4737F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 40, -2.0F, -14.2038F, -16.4737F, 2, 1, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 72, 0.6099F, -14.5716F, -32.4737F, 3, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 67, 53, 0.6099F, -14.5716F, -31.8737F, 3, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 50, 70, 2.6099F, -14.5716F, -32.7737F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 22, 72, -1.999F, -14.2048F, 10.0263F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -3.3F, -9.2538F, -16.4737F, 4, 6, 34, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 40, 0.3F, -9.2538F, -16.4737F, 1, 6, 34, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 84, 0.6F, -9.8538F, -16.4737F, 1, 2, 6, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 130, 120, -2.0F, -13.2038F, -16.9737F, 2, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 42, 0, -3.0F, -11.8538F, -16.9737F, 4, 8, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 13, -4.301F, -8.8538F, -0.4737F, 1, 4, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 74, 102, -4.301F, -9.8538F, 0.5263F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 57, 19, -4.5F, -7.8538F, 0.5263F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 111, -4.7F, -8.6538F, -12.4737F, 2, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 110, -4.7F, -8.6538F, -8.4737F, 2, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 34, 118, -4.7F, -8.6538F, -2.4737F, 2, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 95, -3.5F, -9.8538F, -16.4737F, 1, 1, 6, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0161F, 6.1839F);
		gun.addChild(cube_r1);
		setRotationAngle(cube_r1, 2.138F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 54, 80, -2.5F, -0.5F, -0.5F, 3, 2, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.829F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 85, -2.5F, -3.5F, -0.5F, 3, 4, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.2064F, 2.0308F);
		gun.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.5708F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 55, 56, -2.5F, -2.0F, -0.5F, 3, 6, 1, 0.001F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.0F, -2.6116F, -1.2727F);
		gun.addChild(cube_r4);
		setRotationAngle(cube_r4, 1.2654F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 11, 16, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.001F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.0F, -1.7436F, 0.2308F);
		gun.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.829F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 40, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.0F, -3.1038F, 5.2263F);
		gun.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.9599F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 99, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.0F, -1.3936F, 4.3308F);
		gun.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.7854F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 49, 20, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.0F, -2.8038F, 5.0263F);
		gun.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 65, 80, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.001F, false));

		gun76_r1 = new ModelRenderer(this);
		gun76_r1.setRotationPoint(16.7029F, -45.8887F, 13.5263F);
		gun.addChild(gun76_r1);
		setRotationAngle(gun76_r1, 0.0F, 0.0F, -2.491F);
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 0, 80, -5.3F, -37.5F, -26.0F, 1, 1, 11, 0.0F, false));
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 72, 0, -5.4F, -39.5F, -13.0F, 1, 3, 10, 0.0F, false));
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 0, 80, -5.4F, -39.5F, -28.0F, 1, 3, 1, 0.0F, false));
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 130, 123, -5.2999F, -39.5F, -2.5F, 1, 1, 2, 0.0F, false));
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 53, 85, -5.3F, -39.5F, -3.0F, 1, 2, 1, 0.0F, false));
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 49, 40, -5.3F, -39.5F, -6.0F, 1, 3, 2, 0.0F, false));
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 0, 56, -5.3F, -39.5F, -9.0F, 1, 3, 2, 0.0F, false));
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 8, 56, -5.3F, -39.5F, -12.0F, 1, 3, 2, 0.0F, false));
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 57, 40, -5.3F, -39.5F, -15.0F, 1, 3, 2, 0.0F, false));
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 6, 80, -5.3F, -39.5F, -27.0F, 1, 3, 1, 0.0F, false));
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 85, 84, -5.3F, -39.5F, -30.0F, 1, 3, 2, 0.0F, false));

		gun74_r1 = new ModelRenderer(this);
		gun74_r1.setRotationPoint(-8.8716F, 27.8593F, 13.5263F);
		gun.addChild(gun74_r1);
		setRotationAngle(gun74_r1, 0.0F, 0.0F, 0.2602F);
		gun74_r1.cubeList.add(new ModelBox(gun74_r1, 94, 67, -5.5F, -34.7F, -26.2F, 1, 2, 2, 0.0F, false));
		gun74_r1.cubeList.add(new ModelBox(gun74_r1, 102, 68, -5.5F, -35.7F, -24.2F, 1, 3, 9, 0.0F, false));

		gun73_r1 = new ModelRenderer(this);
		gun73_r1.setRotationPoint(-33.1206F, -21.6551F, 13.5263F);
		gun.addChild(gun73_r1);
		setRotationAngle(gun73_r1, 0.0F, 0.0F, 2.2679F);
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 67, 29, -5.3F, -32.5F, -26.2F, 2, 1, 11, 0.0F, false));

		gun68_r1 = new ModelRenderer(this);
		gun68_r1.setRotationPoint(0.5F, 25.2427F, 18.1894F);
		gun.addChild(gun68_r1);
		setRotationAngle(gun68_r1, 0.1487F, 0.0F, 0.0F);
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 97, 37, -5.2F, -32.5F, -13.8F, 1, 2, 2, 0.0F, false));

		gun66_r1 = new ModelRenderer(this);
		gun66_r1.setRotationPoint(0.5F, 25.148F, -16.5049F);
		gun.addChild(gun66_r1);
		setRotationAngle(gun66_r1, -0.7854F, 0.0F, 0.0F);
		gun66_r1.cubeList.add(new ModelBox(gun66_r1, 62, 100, -4.799F, -37.5F, -11.6F, 1, 1, 1, 0.0F, false));
		gun66_r1.cubeList.add(new ModelBox(gun66_r1, 62, 102, -4.8F, -37.5F, -12.0F, 1, 1, 1, -0.002F, false));

		gun65_r1 = new ModelRenderer(this);
		gun65_r1.setRotationPoint(0.5F, 25.8551F, -16.7978F);
		gun.addChild(gun65_r1);
		setRotationAngle(gun65_r1, -0.7854F, 0.0F, 0.0F);
		gun65_r1.cubeList.add(new ModelBox(gun65_r1, 101, 46, -4.799F, -37.1F, -13.0F, 1, 1, 1, 0.0F, false));
		gun65_r1.cubeList.add(new ModelBox(gun65_r1, 79, 101, -4.8F, -37.5F, -13.0F, 1, 1, 1, -0.002F, false));

		gun60_r1 = new ModelRenderer(this);
		gun60_r1.setRotationPoint(23.211F, 14.8915F, 13.5263F);
		gun.addChild(gun60_r1);
		setRotationAngle(gun60_r1, 0.0F, 0.0F, -0.7436F);
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 85, 153, -5.0F, -35.5F, -25.0F, 1, 1, 13, 0.0F, false));

		gun59_r1 = new ModelRenderer(this);
		gun59_r1.setRotationPoint(24.5371F, 19.4596F, 13.5263F);
		gun.addChild(gun59_r1);
		setRotationAngle(gun59_r1, 0.0F, 0.0F, -0.632F);
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 105, 13, -1.5F, -40.15F, -30.5F, 1, 1, 1, -0.001F, false));
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 105, 15, -1.5F, -40.85F, -30.5F, 1, 1, 1, 0.001F, false));

		gun57_r1 = new ModelRenderer(this);
		gun57_r1.setRotationPoint(-24.1167F, 21.232F, 13.5263F);
		gun.addChild(gun57_r1);
		setRotationAngle(gun57_r1, 0.0F, 0.0F, 0.632F);
		gun57_r1.cubeList.add(new ModelBox(gun57_r1, 105, 17, -2.5F, -40.15F, -30.5F, 1, 1, 1, -0.001F, false));
		gun57_r1.cubeList.add(new ModelBox(gun57_r1, 105, 34, -2.5F, -40.85F, -30.5F, 1, 1, 1, 0.001F, false));

		gun688_r1 = new ModelRenderer(this);
		gun688_r1.setRotationPoint(-21.0901F, -44.0716F, 13.5263F);
		gun.addChild(gun688_r1);
		setRotationAngle(gun688_r1, 0.0F, 0.0F, 2.491F);
		gun688_r1.cubeList.add(new ModelBox(gun688_r1, 130, 24, 1.4F, -39.5F, -25.0F, 1, 3, 22, 0.0F, false));
		gun688_r1.cubeList.add(new ModelBox(gun688_r1, 130, 126, 1.2991F, -39.5F, -2.5F, 1, 1, 2, 0.0F, false));
		gun688_r1.cubeList.add(new ModelBox(gun688_r1, 88, 41, 1.3F, -39.5F, -3.0F, 1, 2, 1, 0.0F, false));
		gun688_r1.cubeList.add(new ModelBox(gun688_r1, 12, 92, 1.3F, -39.5F, -6.0F, 1, 3, 2, 0.0F, false));
		gun688_r1.cubeList.add(new ModelBox(gun688_r1, 20, 92, 1.3F, -39.5F, -9.0F, 1, 3, 2, 0.0F, false));
		gun688_r1.cubeList.add(new ModelBox(gun688_r1, 93, 84, 1.3F, -39.5F, -12.0F, 1, 3, 2, 0.0F, false));
		gun688_r1.cubeList.add(new ModelBox(gun688_r1, 48, 95, 1.3F, -39.5F, -15.0F, 1, 3, 2, 0.0F, false));
		gun688_r1.cubeList.add(new ModelBox(gun688_r1, 85, 95, 1.3F, -39.5F, -18.0F, 1, 3, 2, 0.0F, false));
		gun688_r1.cubeList.add(new ModelBox(gun688_r1, 93, 95, 1.3F, -39.5F, -21.0F, 1, 3, 2, 0.0F, false));
		gun688_r1.cubeList.add(new ModelBox(gun688_r1, 97, 30, 1.3F, -39.5F, -24.0F, 1, 3, 2, 0.0F, false));
		gun688_r1.cubeList.add(new ModelBox(gun688_r1, 57, 29, 1.3F, -38.8F, -30.0F, 1, 1, 2, -0.001F, false));
		gun688_r1.cubeList.add(new ModelBox(gun688_r1, 48, 103, 1.3F, -39.5F, -30.0F, 1, 1, 2, 0.0F, false));
		gun688_r1.cubeList.add(new ModelBox(gun688_r1, 86, 13, 1.3F, -39.5F, -28.0F, 1, 3, 3, 0.0F, false));

		gun655_r1 = new ModelRenderer(this);
		gun655_r1.setRotationPoint(0.5F, 16.2064F, -14.2743F);
		gun.addChild(gun655_r1);
		setRotationAngle(gun655_r1, -0.7808F, 0.0F, 0.0F);
		gun655_r1.cubeList.add(new ModelBox(gun655_r1, 116, 111, -3.5F, -39.5F, -2.0F, 1, 1, 5, 0.0F, false));
		gun655_r1.cubeList.add(new ModelBox(gun655_r1, 115, 120, -0.5F, -39.5F, -2.0F, 1, 1, 5, 0.0F, false));
		gun655_r1.cubeList.add(new ModelBox(gun655_r1, 130, 40, -2.5F, -39.5F, -3.4F, 2, 1, 4, 0.0F, false));
		gun655_r1.cubeList.add(new ModelBox(gun655_r1, 106, 111, -4.301F, -39.5002F, 0.0F, 1, 1, 3, 0.0F, false));
		gun655_r1.cubeList.add(new ModelBox(gun655_r1, 56, 114, 0.301F, -39.5002F, 0.0F, 1, 1, 3, 0.0F, false));

		gun546_r1 = new ModelRenderer(this);
		gun546_r1.setRotationPoint(0.1099F, -13.6715F, -33.2737F);
		gun.addChild(gun546_r1);
		setRotationAngle(gun546_r1, 0.0F, 0.0F, -0.9076F);
		gun546_r1.cubeList.add(new ModelBox(gun546_r1, 28, 98, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun545_r1 = new ModelRenderer(this);
		gun545_r1.setRotationPoint(-0.5901F, -13.0715F, -33.9737F);
		gun.addChild(gun545_r1);
		setRotationAngle(gun545_r1, 0.0F, 0.0F, 2.3513F);
		gun545_r1.cubeList.add(new ModelBox(gun545_r1, 84, 111, -1.0F, -1.0F, 0.0F, 1, 1, 20, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-14.7689F, 23.334F, 13.5263F);
		gun.addChild(gun53_r1);
		setRotationAngle(gun53_r1, 0.0F, 0.0F, 0.4636F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 109, 134, 0.5F, -34.5F, -30.1F, 1, 1, 15, 0.0F, false));

		gun52_r1 = new ModelRenderer(this);
		gun52_r1.setRotationPoint(15.4523F, 21.9924F, 13.5263F);
		gun.addChild(gun52_r1);
		setRotationAngle(gun52_r1, 0.0F, 0.0F, -0.4636F);
		gun52_r1.cubeList.add(new ModelBox(gun52_r1, 148, 148, -4.5F, -34.5F, -30.1F, 1, 1, 15, 0.0F, false));

		gun49_r1 = new ModelRenderer(this);
		gun49_r1.setRotationPoint(33.8967F, -3.5448F, 13.5263F);
		gun.addChild(gun49_r1);
		setRotationAngle(gun49_r1, 0.0F, 0.0F, -1.2641F);
		gun49_r1.cubeList.add(new ModelBox(gun49_r1, 82, 46, -4.6F, -38.4F, -29.99F, 1, 1, 4, 0.0F, false));
		gun49_r1.cubeList.add(new ModelBox(gun49_r1, 105, 41, -4.6F, -38.4F, -15.001F, 1, 1, 1, 0.0F, false));

		gun44_r1 = new ModelRenderer(this);
		gun44_r1.setRotationPoint(3.3019F, 27.6462F, 11.0373F);
		gun.addChild(gun44_r1);
		setRotationAngle(gun44_r1, 0.0F, 0.409F, 0.0F);
		gun44_r1.cubeList.add(new ModelBox(gun44_r1, 88, 46, -4.6F, -38.4F, -8.0F, 1, 2, 1, 0.0F, false));

		gun41_r1 = new ModelRenderer(this);
		gun41_r1.setRotationPoint(0.5F, 7.868F, -21.2016F);
		gun.addChild(gun41_r1);
		setRotationAngle(gun41_r1, -1.0607F, 0.0F, 0.0F);
		gun41_r1.cubeList.add(new ModelBox(gun41_r1, 60, 131, -4.299F, -39.5F, 0.0F, 1, 1, 2, 0.0F, false));
		gun41_r1.cubeList.add(new ModelBox(gun41_r1, 66, 131, 0.299F, -39.5F, 0.0F, 1, 1, 2, 0.0F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(0.5F, 27.8338F, -30.1464F);
		gun.addChild(gun37_r1);
		setRotationAngle(gun37_r1, -1.041F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 96, 105, 0.298F, -38.0F, -22.0F, 1, 1, 1, 0.0F, false));

		grip32_r1 = new ModelRenderer(this);
		grip32_r1.setRotationPoint(0.5F, 28.945F, 6.1232F);
		gun.addChild(grip32_r1);
		setRotationAngle(grip32_r1, -0.2231F, 0.0F, 0.0F);
		grip32_r1.cubeList.add(new ModelBox(grip32_r1, 106, 68, -0.05F, -32.4F, -9.5F, 1, 1, 1, 0.0F, false));

		grip33_r1 = new ModelRenderer(this);
		grip33_r1.setRotationPoint(1.3F, 35.5363F, 1.4666F);
		gun.addChild(grip33_r1);
		setRotationAngle(grip33_r1, -0.2231F, 0.0F, 0.0F);
		grip33_r1.cubeList.add(new ModelBox(grip33_r1, 87, 53, -0.1F, -33.0F, -14.5F, 1, 1, 1, -0.1F, false));

		grip33_r2 = new ModelRenderer(this);
		grip33_r2.setRotationPoint(-0.5F, 30.8363F, -5.6334F);
		gun.addChild(grip33_r2);
		setRotationAngle(grip33_r2, -0.2247F, -0.1191F, 0.0272F);
		grip33_r2.cubeList.add(new ModelBox(grip33_r2, 115, 52, -0.1F, -33.0F, -15.5F, 1, 1, 2, -0.1F, false));

		grip32_r2 = new ModelRenderer(this);
		grip32_r2.setRotationPoint(1.3F, 31.4363F, 3.9666F);
		gun.addChild(grip32_r2);
		setRotationAngle(grip32_r2, -0.2231F, 0.0F, 0.0F);
		grip32_r2.cubeList.add(new ModelBox(grip32_r2, 90, 19, -0.1F, -33.0F, -14.5F, 1, 1, 1, -0.1F, false));

		grip31_r1 = new ModelRenderer(this);
		grip31_r1.setRotationPoint(1.1F, 24.0363F, -8.8334F);
		gun.addChild(grip31_r1);
		setRotationAngle(grip31_r1, -0.2231F, 0.0F, 0.0F);
		grip31_r1.cubeList.add(new ModelBox(grip31_r1, 90, 80, -0.05F, -33.0F, -14.5F, 1, 1, 1, 0.0F, false));

		grip30_r1 = new ModelRenderer(this);
		grip30_r1.setRotationPoint(0.5F, 30.0363F, 5.8666F);
		gun.addChild(grip30_r1);
		setRotationAngle(grip30_r1, -0.2231F, 0.0F, 0.0F);
		grip30_r1.cubeList.add(new ModelBox(grip30_r1, 106, 75, -0.05F, -33.0F, -14.5F, 1, 1, 1, 0.0F, false));

		grip29_r1 = new ModelRenderer(this);
		grip29_r1.setRotationPoint(0.5F, 19.4137F, 29.4418F);
		gun.addChild(grip29_r1);
		setRotationAngle(grip29_r1, 0.5205F, 0.0F, 0.0F);
		grip29_r1.cubeList.add(new ModelBox(grip29_r1, 0, 32, -4.5F, -33.0F, -6.0F, 6, 1, 1, 0.0F, false));
		grip29_r1.cubeList.add(new ModelBox(grip29_r1, 60, 29, -4.5F, -34.0F, -7.5F, 6, 1, 3, 0.0F, false));

		grip27_r1 = new ModelRenderer(this);
		grip27_r1.setRotationPoint(0.5F, 28.731F, -1.6916F);
		gun.addChild(grip27_r1);
		setRotationAngle(grip27_r1, -0.4461F, 0.0F, 0.0F);
		grip27_r1.cubeList.add(new ModelBox(grip27_r1, 0, 107, -4.2F, -34.0F, -10.0F, 1, 1, 1, 0.0F, false));
		grip27_r1.cubeList.add(new ModelBox(grip27_r1, 13, 107, 0.2F, -34.0F, -10.0F, 1, 1, 1, 0.0F, false));

		grip25_r1 = new ModelRenderer(this);
		grip25_r1.setRotationPoint(0.5F, 19.9054F, 27.6496F);
		gun.addChild(grip25_r1);
		setRotationAngle(grip25_r1, 0.4461F, 0.0F, 0.0F);
		grip25_r1.cubeList.add(new ModelBox(grip25_r1, 22, 107, -4.2F, -35.0F, -10.0F, 1, 1, 1, 0.0F, false));
		grip25_r1.cubeList.add(new ModelBox(grip25_r1, 107, 46, 0.2F, -35.0F, -10.0F, 1, 1, 1, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(0.5F, 32.0291F, 6.2594F);
		gun.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -0.2231F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 0, 56, -4.701F, -30.15F, -29.2F, 1, 3, 6, 0.0F, false));
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 28, 80, -4.501F, -30.75F, -23.2F, 1, 3, 1, 0.0F, false));

		gun25_r1 = new ModelRenderer(this);
		gun25_r1.setRotationPoint(0.5F, -1.8662F, 30.0548F);
		gun.addChild(gun25_r1);
		setRotationAngle(gun25_r1, 0.7854F, 0.0F, 0.0F);
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 33, 98, 1.01F, -34.2F, -29.1F, 1, 1, 1, -0.001F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 108, 59, 1.01F, -34.2F, -29.5F, 1, 1, 1, 0.0F, false));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(0.5F, -1.8662F, 33.6548F);
		gun.addChild(gun26_r1);
		setRotationAngle(gun26_r1, 0.7854F, 0.0F, 0.0F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 96, 77, 1.01F, -34.6F, -29.5F, 1, 1, 1, -0.001F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 97, 41, 1.01F, -34.2F, -29.5F, 1, 1, 1, 0.0F, false));

		gun22_r1 = new ModelRenderer(this);
		gun22_r1.setRotationPoint(0.5F, 8.7175F, -35.5234F);
		gun.addChild(gun22_r1);
		setRotationAngle(gun22_r1, -1.7474F, 0.0F, 0.0F);
		gun22_r1.cubeList.add(new ModelBox(gun22_r1, 17, 52, -4.501F, -30.0F, -16.6F, 6, 1, 2, 0.0F, false));

		gun22_r2 = new ModelRenderer(this);
		gun22_r2.setRotationPoint(0.5F, -28.4823F, -18.915F);
		gun.addChild(gun22_r2);
		setRotationAngle(gun22_r2, 2.9371F, 0.0F, 0.0F);
		gun22_r2.cubeList.add(new ModelBox(gun22_r2, 12, 92, 0.5F, -26.4F, -19.9F, 1, 1, 6, 0.001F, false));
		gun22_r2.cubeList.add(new ModelBox(gun22_r2, 36, 40, 0.3F, -26.4F, -19.9F, 1, 5, 11, 0.0F, false));
		gun22_r2.cubeList.add(new ModelBox(gun22_r2, 67, 110, -4.3F, -26.4F, -19.9F, 1, 4, 5, 0.0F, false));

		gun20_r1 = new ModelRenderer(this);
		gun20_r1.setRotationPoint(0.5F, -28.2844F, -18.9353F);
		gun.addChild(gun20_r1);
		setRotationAngle(gun20_r1, 2.9371F, 0.0F, 0.0F);
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 14, 32, -4.5F, -26.3F, -9.6F, 6, 1, 1, 0.0F, false));
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 49, 49, -4.499F, -26.3F, -8.8F, 6, 1, 1, 0.0F, false));

		gun16_r1 = new ModelRenderer(this);
		gun16_r1.setRotationPoint(-12.3761F, 23.4866F, 13.0263F);
		gun.addChild(gun16_r1);
		setRotationAngle(gun16_r1, 0.0F, 0.0F, 0.4833F);
		gun16_r1.cubeList.add(new ModelBox(gun16_r1, 108, 61, 1.0F, -28.2F, -24.0F, 1, 1, 1, 0.0F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(-14.2534F, 22.4454F, 14.0263F);
		gun.addChild(gun15_r1);
		setRotationAngle(gun15_r1, 0.0F, 0.0F, 0.5411F);
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 108, 63, 1.0F, -29.2F, -29.0F, 1, 1, 1, 0.0F, false));

		gun17_r1 = new ModelRenderer(this);
		gun17_r1.setRotationPoint(2.5F, -6.1538F, -10.9737F);
		gun.addChild(gun17_r1);
		setRotationAngle(gun17_r1, -0.6613F, -0.41F, -0.5123F);
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 94, 80, -1.0F, -1.0F, 0.4F, 1, 1, 1, -0.001F, false));
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 34, 93, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun16_r2 = new ModelRenderer(this);
		gun16_r2.setRotationPoint(2.5F, -6.1538F, -13.9737F);
		gun.addChild(gun16_r2);
		setRotationAngle(gun16_r2, 0.6613F, 0.41F, -0.5123F);
		gun16_r2.cubeList.add(new ModelBox(gun16_r2, 94, 92, -1.0F, -1.0F, -1.4F, 1, 1, 1, -0.001F, false));
		gun16_r2.cubeList.add(new ModelBox(gun16_r2, 78, 95, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(2.5F, -6.1538F, -13.9737F);
		gun.addChild(gun14_r1);
		setRotationAngle(gun14_r1, 0.0F, 0.0F, -0.6981F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 28, 107, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(2.502F, -1.2538F, -14.9727F);
		gun.addChild(gun12_r1);
		setRotationAngle(gun12_r1, 0.0F, 0.576F, 0.0F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 144, 66, -1.0F, -4.0F, -1.0F, 1, 1, 1, -0.001F, false));
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 57, 13, -1.0F, -3.3F, -1.0F, 1, 3, 1, 0.0F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(2.502F, -1.2538F, -9.9747F);
		gun.addChild(gun11_r1);
		setRotationAngle(gun11_r1, 0.0F, -0.576F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 6, 92, -1.0F, -4.0F, 0.0F, 1, 1, 1, -0.001F, false));
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 63, 6, -1.0F, -3.3F, 0.0F, 1, 4, 1, 0.0F, false));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(0.5F, 23.8193F, 17.8971F);
		gun.addChild(gun8_r1);
		setRotationAngle(gun8_r1, 0.1487F, 0.0F, 0.0F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 48, 80, 0.5F, -30.25F, -23.5F, 1, 3, 1, 0.0F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(0.5F, -28.1854F, -18.9454F);
		gun.addChild(gun7_r1);
		setRotationAngle(gun7_r1, 2.9371F, 0.0F, 0.0F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 125, 17, -4.5F, -26.25F, -19.2F, 1, 1, 5, 0.0F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(0.5F, 11.003F, -35.2914F);
		gun.addChild(gun6_r1);
		setRotationAngle(gun6_r1, -1.7846F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 98, 26, -4.5F, -28.0F, -17.9F, 6, 1, 2, 0.0F, false));

		gun6_r2 = new ModelRenderer(this);
		gun6_r2.setRotationPoint(2.001F, -0.3308F, -5.1241F);
		gun.addChild(gun6_r2);
		setRotationAngle(gun6_r2, -2.5858F, 0.0F, 0.0F);
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 0, 13, -6.0F, -1.0F, 0.0F, 6, 1, 1, -0.002F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(0.5F, -23.8308F, -23.7241F);
		gun.addChild(gun5_r1);
		setRotationAngle(gun5_r1, -2.8999F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 125, 13, -4.499F, -27.8F, -15.6F, 6, 1, 3, 0.0F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(0.5F, 5.9667F, -34.6268F);
		gun.addChild(gun3_r1);
		setRotationAngle(gun3_r1, -1.7474F, 0.0F, 0.0F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 42, 29, -4.5F, -31.0F, -15.2F, 6, 2, 3, 0.0F, false));

		gun1_r1 = new ModelRenderer(this);
		gun1_r1.setRotationPoint(0.5F, 30.011F, 9.6875F);
		gun.addChild(gun1_r1);
		setRotationAngle(gun1_r1, -0.1115F, 0.0F, 0.0F);
		gun1_r1.cubeList.add(new ModelBox(gun1_r1, 36, 56, -4.499F, -33.2F, -23.1F, 6, 3, 7, 0.0F, false));

		handguard = new QRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.3F);
		handguard.cubeList.add(new ModelBox(handguard, 19, 0, -4.3F, -39.5F, -32.5F, 5, 9, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 57, 0, 0.3F, -39.5F, -32.5F, 1, 9, 2, 0.0F, false));

		grip33_r3 = new ModelRenderer(this);
		grip33_r3.setRotationPoint(-3.6F, -3.4099F, -25.0597F);
		handguard.addChild(grip33_r3);
		setRotationAngle(grip33_r3, -0.2231F, 0.0F, 0.0F);
		grip33_r3.cubeList.add(new ModelBox(grip33_r3, 75, 53, -0.9F, -33.0F, -14.5F, 1, 1, 1, -0.1F, false));
		grip33_r3.cubeList.add(new ModelBox(grip33_r3, 74, 80, 4.1F, -33.0F, -14.5F, 1, 1, 1, -0.1F, false));

		grip34_r1 = new ModelRenderer(this);
		grip34_r1.setRotationPoint(-3.6F, 1.2901F, -25.0597F);
		handguard.addChild(grip34_r1);
		setRotationAngle(grip34_r1, -0.2231F, 0.0F, 0.0F);
		grip34_r1.cubeList.add(new ModelBox(grip34_r1, 28, 72, -0.9F, -33.0F, -14.5F, 1, 1, 1, -0.1F, false));
		grip34_r1.cubeList.add(new ModelBox(grip34_r1, 79, 53, 4.1F, -33.0F, -14.5F, 1, 1, 1, -0.1F, false));

		handguard51_r1 = new ModelRenderer(this);
		handguard51_r1.setRotationPoint(24.9671F, -68.8227F, 0.0F);
		handguard.addChild(handguard51_r1);
		setRotationAngle(handguard51_r1, 0.0F, 0.0F, -2.234F);
		handguard51_r1.cubeList.add(new ModelBox(handguard51_r1, 81, 73, -5.3F, -40.5F, -31.499F, 1, 2, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 103, 82, -2.5F, -41.85F, -55.501F, 2, 2, 25, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 102, 57, -4.3F, -40.5F, -40.5F, 1, 1, 10, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 105, 109, 0.3F, -39.0F, -55.501F, 1, 2, 23, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 102, 57, -4.3F, -39.0F, -55.5F, 5, 2, 23, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 130, 117, 0.2F, -40.6F, -43.5F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 84, 105, -4.2F, -40.6F, -55.501F, 5, 2, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 56, 130, 0.2F, -40.6F, -46.5F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 130, 53, 0.2F, -40.6F, -49.5F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 130, 0.2F, -40.6F, -52.5F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 28, 122, 0.2F, -40.6F, -55.502F, 1, 2, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 97, 30, 0.1F, -40.55F, -54.5F, 1, 2, 14, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 122, 126, -4.2F, -40.6F, -52.5F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 56, 126, -4.2F, -40.6F, -49.5F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 46, 126, -4.2F, -40.6F, -46.5F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 37, 126, -4.2F, -40.6F, -43.5F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 99, 11, -2.7F, -41.7F, -40.5F, 1, 1, 10, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 99, 0, -1.3F, -41.7F, -40.5F, 1, 1, 10, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 46, 146, -4.1F, -40.55F, -53.5F, 1, 2, 13, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 28, 126, 0.3F, -34.5F, -51.0F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 82, 29, 0.301F, -37.5F, -55.498F, 1, 4, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 125, 6, -4.301F, -37.5F, -55.499F, 5, 4, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 85, 0.301F, -37.0F, -35.5F, 1, 3, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 93, 125, 0.3F, -34.5F, -47.5F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 84, 125, 0.3F, -34.5F, -40.5F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 113, 36, 0.299F, -34.5F, -37.0F, 1, 1, 5, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 74, 125, 0.3F, -34.5F, -44.0F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 72, 0, -2.5F, -34.2F, -54.0F, 2, 3, 23, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 65, 125, -4.3F, -34.5F, -51.0F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 9, 125, -4.3F, -34.5F, -44.0F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 48, 80, -4.299F, -34.5F, -37.0F, 1, 1, 4, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 74, 84, -4.301F, -37.0F, -35.5F, 1, 3, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 135, 57, 0.2F, -37.55F, -52.5F, 1, 4, 17, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 125, -4.3F, -34.5F, -47.5F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 106, 124, -4.3F, -34.5F, -40.5F, 1, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 127, 134, -4.2F, -37.55F, -52.5F, 1, 4, 17, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 74, 95, 0.2F, -39.5F, -40.5F, 1, 1, 9, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 74, 84, -4.2F, -39.5F, -40.5F, 1, 1, 9, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 74, 73, -2.5F, -37.5F, -58.5F, 2, 2, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 67, 62, -2.5F, -36.1F, -58.501F, 2, 1, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 89, 68, -2.7F, -37.3F, -58.499F, 1, 2, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 48, 85, -1.3F, -37.3F, -58.499F, 1, 2, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 42, 20, -2.5F, -40.5F, -58.0F, 2, 1, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 74, 111, -2.0F, -40.7F, -58.001F, 1, 1, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 28, 93, 0.7F, -38.0F, -53.5F, 1, 2, 10, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 92, -4.7F, -38.0F, -53.5F, 1, 2, 10, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 48, 83, 0.3F, -40.5F, -40.5F, 1, 1, 10, 0.0F, false));

		handguard126_r1 = new ModelRenderer(this);
		handguard126_r1.setRotationPoint(-18.1011F, -71.9623F, 0.0F);
		bone4.addChild(handguard126_r1);
		setRotationAngle(handguard126_r1, 0.0F, 0.0F, 2.9174F);
		handguard126_r1.cubeList.add(new ModelBox(handguard126_r1, 102, 75, -6.0F, -38.0F, -53.499F, 1, 1, 1, 0.0F, false));
		handguard126_r1.cubeList.add(new ModelBox(handguard126_r1, 102, 84, -6.0F, -38.0F, -51.5F, 1, 1, 1, 0.0F, false));
		handguard126_r1.cubeList.add(new ModelBox(handguard126_r1, 85, 102, -6.0F, -38.0F, -49.5F, 1, 1, 1, 0.0F, false));
		handguard126_r1.cubeList.add(new ModelBox(handguard126_r1, 102, 86, -6.0F, -38.0F, -47.5F, 1, 1, 1, 0.0F, false));
		handguard126_r1.cubeList.add(new ModelBox(handguard126_r1, 40, 118, -6.0F, -38.0F, -45.501F, 1, 1, 2, 0.0F, false));

		handguard121_r1 = new ModelRenderer(this);
		handguard121_r1.setRotationPoint(-1.0001F, -74.1214F, 0.0F);
		bone4.addChild(handguard121_r1);
		setRotationAngle(handguard121_r1, 0.0F, 0.0F, -2.8999F);
		handguard121_r1.cubeList.add(new ModelBox(handguard121_r1, 119, 0, -6.0F, -37.0F, -45.501F, 1, 1, 2, 0.0F, false));
		handguard121_r1.cubeList.add(new ModelBox(handguard121_r1, 89, 102, -6.0F, -37.0F, -47.5F, 1, 1, 1, 0.0F, false));
		handguard121_r1.cubeList.add(new ModelBox(handguard121_r1, 103, 0, -6.0F, -37.0F, -49.5F, 1, 1, 1, 0.0F, false));
		handguard121_r1.cubeList.add(new ModelBox(handguard121_r1, 103, 11, -6.0F, -37.0F, -51.5F, 1, 1, 1, 0.0F, false));
		handguard121_r1.cubeList.add(new ModelBox(handguard121_r1, 102, 103, -6.0F, -37.0F, -53.499F, 1, 1, 1, 0.0F, false));

		handguard116_r1 = new ModelRenderer(this);
		handguard116_r1.setRotationPoint(12.7965F, -72.4462F, 0.0F);
		bone4.addChild(handguard116_r1);
		setRotationAngle(handguard116_r1, 0.0F, 0.0F, -2.8999F);
		handguard116_r1.cubeList.add(new ModelBox(handguard116_r1, 119, 57, 2.0F, -38.0F, -45.501F, 1, 1, 2, 0.0F, false));
		handguard116_r1.cubeList.add(new ModelBox(handguard116_r1, 0, 104, 2.0F, -38.0F, -47.5F, 1, 1, 1, 0.0F, false));
		handguard116_r1.cubeList.add(new ModelBox(handguard116_r1, 4, 104, 2.0F, -38.0F, -49.5F, 1, 1, 1, 0.0F, false));
		handguard116_r1.cubeList.add(new ModelBox(handguard116_r1, 8, 104, 2.0F, -38.0F, -51.5F, 1, 1, 1, 0.0F, false));
		handguard116_r1.cubeList.add(new ModelBox(handguard116_r1, 12, 104, 2.0F, -38.0F, -53.499F, 1, 1, 1, 0.0F, false));

		handguard111_r1 = new ModelRenderer(this);
		handguard111_r1.setRotationPoint(-4.9128F, -73.4035F, 0.0F);
		bone4.addChild(handguard111_r1);
		setRotationAngle(handguard111_r1, 0.0F, 0.0F, 2.8999F);
		handguard111_r1.cubeList.add(new ModelBox(handguard111_r1, 16, 104, 2.0F, -37.0F, -53.499F, 1, 1, 1, 0.0F, false));
		handguard111_r1.cubeList.add(new ModelBox(handguard111_r1, 105, 2, 2.0F, -37.0F, -51.5F, 1, 1, 1, 0.0F, false));
		handguard111_r1.cubeList.add(new ModelBox(handguard111_r1, 105, 4, 2.0F, -37.0F, -49.5F, 1, 1, 1, 0.0F, false));
		handguard111_r1.cubeList.add(new ModelBox(handguard111_r1, 105, 6, 2.0F, -37.0F, -47.5F, 1, 1, 1, 0.0F, false));
		handguard111_r1.cubeList.add(new ModelBox(handguard111_r1, 121, 52, 2.0F, -37.0F, -45.501F, 1, 1, 2, 0.0F, false));

		handguard103_r1 = new ModelRenderer(this);
		handguard103_r1.setRotationPoint(0.0F, -80.7859F, -1.2574F);
		bone4.addChild(handguard103_r1);
		setRotationAngle(handguard103_r1, 1.2269F, 0.0F, 0.0F);
		handguard103_r1.cubeList.add(new ModelBox(handguard103_r1, 102, 99, -2.501F, -39.5F, -58.0F, 2, 3, 1, 0.0F, false));

		handguard95_r1 = new ModelRenderer(this);
		handguard95_r1.setRotationPoint(18.8266F, -58.3092F, 0.0F);
		bone4.addChild(handguard95_r1);
		setRotationAngle(handguard95_r1, 0.0F, 0.0F, -2.2679F);
		handguard95_r1.cubeList.add(new ModelBox(handguard95_r1, 26, 146, -6.2F, -33.55F, -52.5F, 2, 1, 16, 0.0F, false));

		handguard93_r1 = new ModelRenderer(this);
		handguard93_r1.setRotationPoint(-23.5501F, -56.0036F, 0.0F);
		bone4.addChild(handguard93_r1);
		setRotationAngle(handguard93_r1, 0.0F, 0.0F, 2.2679F);
		handguard93_r1.cubeList.add(new ModelBox(handguard93_r1, 59, 111, 3.2F, -33.5F, -53.5F, 1, 1, 23, 0.0F, false));
		handguard93_r1.cubeList.add(new ModelBox(handguard93_r1, 28, 93, 1.3F, -33.5F, -54.5F, 2, 3, 2, 0.0F, false));
		handguard93_r1.cubeList.add(new ModelBox(handguard93_r1, 113, 74, 1.3F, -33.5F, -47.5F, 2, 1, 2, 0.0F, false));
		handguard93_r1.cubeList.add(new ModelBox(handguard93_r1, 114, 26, 1.3F, -33.5F, -40.5F, 2, 1, 2, 0.0F, false));
		handguard93_r1.cubeList.add(new ModelBox(handguard93_r1, 130, 30, 1.3F, -33.5F, -37.0F, 2, 1, 4, 0.0F, false));
		handguard93_r1.cubeList.add(new ModelBox(handguard93_r1, 114, 61, 1.3F, -33.5F, -44.0F, 2, 1, 2, 0.0F, false));
		handguard93_r1.cubeList.add(new ModelBox(handguard93_r1, 114, 64, 1.3F, -33.5F, -51.0F, 2, 1, 2, 0.0F, false));

		handguard92_r1 = new ModelRenderer(this);
		handguard92_r1.setRotationPoint(18.6241F, -58.3038F, 0.0F);
		bone4.addChild(handguard92_r1);
		setRotationAngle(handguard92_r1, 0.0F, 0.0F, -2.2679F);
		handguard92_r1.cubeList.add(new ModelBox(handguard92_r1, 130, 109, -7.2F, -33.5F, -53.5F, 1, 1, 21, 0.0F, false));
		handguard92_r1.cubeList.add(new ModelBox(handguard92_r1, 115, 84, -6.3F, -33.5F, -37.0F, 2, 1, 4, 0.0F, false));
		handguard92_r1.cubeList.add(new ModelBox(handguard92_r1, 56, 102, -6.3F, -33.5F, -40.5F, 2, 1, 2, 0.0F, false));
		handguard92_r1.cubeList.add(new ModelBox(handguard92_r1, 102, 64, -6.3F, -33.5F, -47.5F, 2, 1, 2, 0.0F, false));
		handguard92_r1.cubeList.add(new ModelBox(handguard92_r1, 111, 7, -6.3F, -33.5F, -44.0F, 2, 1, 2, 0.0F, false));
		handguard92_r1.cubeList.add(new ModelBox(handguard92_r1, 111, 18, -6.3F, -33.5F, -51.0F, 2, 1, 2, 0.0F, false));
		handguard92_r1.cubeList.add(new ModelBox(handguard92_r1, 0, 92, -6.3F, -33.5F, -54.5F, 2, 3, 2, 0.0F, false));

		handguard83_r1 = new ModelRenderer(this);
		handguard83_r1.setRotationPoint(-23.7527F, -56.009F, 0.0F);
		bone4.addChild(handguard83_r1);
		setRotationAngle(handguard83_r1, 0.0F, 0.0F, 2.2679F);
		handguard83_r1.cubeList.add(new ModelBox(handguard83_r1, 146, 131, 1.2F, -33.55F, -52.5F, 2, 1, 16, 0.0F, false));

		handguard71_r1 = new ModelRenderer(this);
		handguard71_r1.setRotationPoint(0.0F, -73.3389F, -20.1984F);
		bone4.addChild(handguard71_r1);
		setRotationAngle(handguard71_r1, 2.0448F, 0.0F, 0.0F);
		handguard71_r1.cubeList.add(new ModelBox(handguard71_r1, 107, 46, -4.29F, -30.5F, -32.5F, 5, 2, 4, 0.0F, false));
		handguard71_r1.cubeList.add(new ModelBox(handguard71_r1, 67, 56, 0.29F, -30.5001F, -32.5F, 1, 2, 4, 0.0F, false));

		handguard68_r1 = new ModelRenderer(this);
		handguard68_r1.setRotationPoint(0.0F, -90.2882F, -77.0562F);
		bone4.addChild(handguard68_r1);
		setRotationAngle(handguard68_r1, 2.6025F, 0.0F, 0.0F);
		handguard68_r1.cubeList.add(new ModelBox(handguard68_r1, 18, 56, -4.29F, -34.5F, -53.0F, 1, 5, 2, 0.0F, false));
		handguard68_r1.cubeList.add(new ModelBox(handguard68_r1, 102, 57, 0.29F, -34.5F, -53.0F, 1, 5, 2, 0.0F, false));

		handguard67_r1 = new ModelRenderer(this);
		handguard67_r1.setRotationPoint(0.0F, -86.6947F, -64.049F);
		bone4.addChild(handguard67_r1);
		setRotationAngle(handguard67_r1, 2.6025F, 0.0F, 0.0F);
		handguard67_r1.cubeList.add(new ModelBox(handguard67_r1, 27, 56, -4.29F, -34.5F, -46.0F, 1, 5, 2, 0.0F, false));
		handguard67_r1.cubeList.add(new ModelBox(handguard67_r1, 99, 0, 0.29F, -34.5F, -46.0F, 1, 5, 2, 0.0F, false));

		handguard66_r1 = new ModelRenderer(this);
		handguard66_r1.setRotationPoint(0.0F, -83.1012F, -51.0418F);
		bone4.addChild(handguard66_r1);
		setRotationAngle(handguard66_r1, 2.6025F, 0.0F, 0.0F);
		handguard66_r1.cubeList.add(new ModelBox(handguard66_r1, 36, 56, -4.29F, -34.5F, -39.0F, 1, 5, 2, 0.0F, false));
		handguard66_r1.cubeList.add(new ModelBox(handguard66_r1, 0, 40, 0.29F, -34.5F, -39.0F, 1, 4, 2, 0.0F, false));

		handguard65_r1 = new ModelRenderer(this);
		handguard65_r1.setRotationPoint(0.0F, -84.898F, -57.5454F);
		bone4.addChild(handguard65_r1);
		setRotationAngle(handguard65_r1, 2.6025F, 0.0F, 0.0F);
		handguard65_r1.cubeList.add(new ModelBox(handguard65_r1, 40, 93, -4.29F, -34.5F, -42.5F, 1, 5, 2, 0.0F, false));
		handguard65_r1.cubeList.add(new ModelBox(handguard65_r1, 97, 46, 0.29F, -34.5F, -42.5F, 1, 5, 2, 0.0F, false));

		handguard64_r1 = new ModelRenderer(this);
		handguard64_r1.setRotationPoint(0.0F, -88.4914F, -70.5526F);
		bone4.addChild(handguard64_r1);
		setRotationAngle(handguard64_r1, 2.6025F, 0.0F, 0.0F);
		handguard64_r1.cubeList.add(new ModelBox(handguard64_r1, 56, 95, -4.29F, -34.5F, -49.5F, 1, 5, 2, 0.0F, false));
		handguard64_r1.cubeList.add(new ModelBox(handguard64_r1, 99, 11, 0.29F, -34.5F, -49.5F, 1, 5, 2, 0.0F, false));

		handguard63_r1 = new ModelRenderer(this);
		handguard63_r1.setRotationPoint(0.0F, -92.0849F, -83.5599F);
		bone4.addChild(handguard63_r1);
		setRotationAngle(handguard63_r1, 2.6025F, 0.0F, 0.0F);
		handguard63_r1.cubeList.add(new ModelBox(handguard63_r1, 74, 95, -4.29F, -34.5F, -56.5F, 1, 5, 2, 0.0F, false));
		handguard63_r1.cubeList.add(new ModelBox(handguard63_r1, 102, 68, 0.29F, -34.5F, -56.5F, 1, 5, 2, 0.0F, false));

		handguard56_r1 = new ModelRenderer(this);
		handguard56_r1.setRotationPoint(25.3296F, -68.7459F, 0.0F);
		bone4.addChild(handguard56_r1);
		setRotationAngle(handguard56_r1, 0.0F, 0.0F, -2.234F);
		handguard56_r1.cubeList.add(new ModelBox(handguard56_r1, 0, 151, -5.1F, -40.55F, -53.5F, 1, 2, 13, 0.0F, false));
		handguard56_r1.cubeList.add(new ModelBox(handguard56_r1, 0, 121, -5.1F, -40.7F, -38.5F, 1, 2, 7, 0.0F, false));

		handguard50_r1 = new ModelRenderer(this);
		handguard50_r1.setRotationPoint(24.9671F, -68.8227F, 0.0F);
		bone4.addChild(handguard50_r1);
		setRotationAngle(handguard50_r1, 0.0F, 0.0F, -2.234F);
		handguard50_r1.cubeList.add(new ModelBox(handguard50_r1, 105, 37, -5.3F, -40.5F, -34.5F, 1, 2, 2, 0.0F, false));
		handguard50_r1.cubeList.add(new ModelBox(handguard50_r1, 84, 111, -5.3F, -40.5F, -37.5F, 1, 2, 2, 0.0F, false));
		handguard50_r1.cubeList.add(new ModelBox(handguard50_r1, 98, 111, -5.3F, -40.5F, -40.5F, 1, 2, 2, 0.0F, false));
		handguard50_r1.cubeList.add(new ModelBox(handguard50_r1, 48, 115, -5.3F, -40.35F, -43.5F, 1, 2, 2, 0.0F, false));
		handguard50_r1.cubeList.add(new ModelBox(handguard50_r1, 106, 115, -5.3F, -40.35F, -46.5F, 1, 2, 2, 0.0F, false));
		handguard50_r1.cubeList.add(new ModelBox(handguard50_r1, 18, 120, -5.3F, -40.35F, -49.5F, 1, 2, 2, 0.0F, false));
		handguard50_r1.cubeList.add(new ModelBox(handguard50_r1, 120, 36, -5.3F, -40.35F, -52.5F, 1, 2, 2, 0.0F, false));
		handguard50_r1.cubeList.add(new ModelBox(handguard50_r1, 120, 89, -5.3F, -40.35F, -55.5F, 1, 2, 2, 0.0F, false));

		handguard38_r1 = new ModelRenderer(this);
		handguard38_r1.setRotationPoint(0.0F, 9.1341F, -71.4522F);
		bone4.addChild(handguard38_r1);
		setRotationAngle(handguard38_r1, -1.3384F, 0.0F, 0.0F);
		handguard38_r1.cubeList.add(new ModelBox(handguard38_r1, 120, 93, -4.201F, -40.6F, -41.5F, 1, 2, 2, 0.0F, false));
		handguard38_r1.cubeList.add(new ModelBox(handguard38_r1, 121, 46, 0.201F, -40.6F, -41.5F, 1, 2, 2, 0.0F, false));

		handguard37_r1 = new ModelRenderer(this);
		handguard37_r1.setRotationPoint(0.0F, 12.0534F, -73.7613F);
		bone4.addChild(handguard37_r1);
		setRotationAngle(handguard37_r1, -1.3384F, 0.0F, 0.0F);
		handguard37_r1.cubeList.add(new ModelBox(handguard37_r1, 106, 120, -4.201F, -40.6F, -44.5F, 1, 2, 2, 0.0F, false));
		handguard37_r1.cubeList.add(new ModelBox(handguard37_r1, 84, 121, 0.201F, -40.6F, -44.5F, 1, 2, 2, 0.0F, false));

		handguard36_r1 = new ModelRenderer(this);
		handguard36_r1.setRotationPoint(0.0F, 14.9728F, -76.0705F);
		bone4.addChild(handguard36_r1);
		setRotationAngle(handguard36_r1, -1.3384F, 0.0F, 0.0F);
		handguard36_r1.cubeList.add(new ModelBox(handguard36_r1, 0, 121, -4.201F, -40.6F, -47.5F, 1, 2, 2, 0.0F, false));
		handguard36_r1.cubeList.add(new ModelBox(handguard36_r1, 93, 121, 0.201F, -40.6F, -47.5F, 1, 2, 2, 0.0F, false));

		handguard35_r1 = new ModelRenderer(this);
		handguard35_r1.setRotationPoint(0.0F, 17.8922F, -78.3797F);
		bone4.addChild(handguard35_r1);
		setRotationAngle(handguard35_r1, -1.3384F, 0.0F, 0.0F);
		handguard35_r1.cubeList.add(new ModelBox(handguard35_r1, 9, 121, -4.201F, -40.6F, -50.5F, 1, 2, 2, 0.0F, false));
		handguard35_r1.cubeList.add(new ModelBox(handguard35_r1, 121, 97, 0.201F, -40.6F, -50.5F, 1, 2, 2, 0.0F, false));

		handguard34_r1 = new ModelRenderer(this);
		handguard34_r1.setRotationPoint(0.0F, 20.8115F, -80.6888F);
		bone4.addChild(handguard34_r1);
		setRotationAngle(handguard34_r1, -1.3384F, 0.0F, 0.0F);
		handguard34_r1.cubeList.add(new ModelBox(handguard34_r1, 18, 127, -4.201F, -40.6F, -53.5F, 1, 1, 2, 0.0F, false));
		handguard34_r1.cubeList.add(new ModelBox(handguard34_r1, 98, 128, 0.201F, -40.6F, -53.5F, 1, 1, 2, 0.0F, false));

		handguard33_r1 = new ModelRenderer(this);
		handguard33_r1.setRotationPoint(-30.1766F, -66.3819F, 0.0F);
		bone4.addChild(handguard33_r1);
		setRotationAngle(handguard33_r1, 0.0F, 0.0F, 2.234F);
		handguard33_r1.cubeList.add(new ModelBox(handguard33_r1, 111, 11, 1.1F, -40.55F, -53.5F, 1, 2, 5, 0.0F, false));

		handguard22_r1 = new ModelRenderer(this);
		handguard22_r1.setRotationPoint(-29.8141F, -66.4587F, 0.0F);
		bone4.addChild(handguard22_r1);
		setRotationAngle(handguard22_r1, 0.0F, 0.0F, 2.234F);
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 37, 122, 1.3F, -40.35F, -55.5F, 1, 2, 2, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 46, 122, 1.3F, -40.35F, -52.5F, 1, 2, 2, 0.0F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 78, 80, 1.2F, -40.45F, -34.6F, 1, 1, 1, -0.1F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 57, 19, 1.2F, -40.45F, -34.4F, 1, 1, 4, -0.101F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 82, 80, 1.2F, -40.45F, -37.6F, 1, 1, 1, -0.1F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 5, 85, 1.2F, -40.45F, -37.4F, 1, 1, 2, -0.101F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 83, 53, 1.2F, -40.45F, -40.6F, 1, 1, 1, -0.1F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 87, 29, 1.2F, -40.45F, -40.4F, 1, 1, 2, -0.101F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 86, 19, 1.2F, -40.45F, -43.6F, 1, 1, 1, -0.1F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 94, 73, 1.2F, -40.45F, -43.4F, 1, 1, 2, -0.101F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 94, 102, 1.2F, -40.45F, -46.4F, 1, 1, 2, -0.101F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 89, 134, 1.0F, -39.05F, -48.2F, 1, 1, 18, -0.301F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 86, 80, 1.2F, -40.45F, -46.6F, 1, 1, 1, -0.1F, false));
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 56, 122, 1.3F, -40.35F, -49.5F, 1, 2, 2, 0.0F, false));

		handguard23_r1 = new ModelRenderer(this);
		handguard23_r1.setRotationPoint(-29.9141F, -66.4587F, 3.0F);
		bone4.addChild(handguard23_r1);
		setRotationAngle(handguard23_r1, 0.0F, 0.0F, 2.234F);
		handguard23_r1.cubeList.add(new ModelBox(handguard23_r1, 0, 40, 1.2F, -40.4913F, -51.4F, 1, 1, 15, -0.101F, false));

		handguard5_r1 = new ModelRenderer(this);
		handguard5_r1.setRotationPoint(0.0F, 14.7778F, -25.5046F);
		bone4.addChild(handguard5_r1);
		setRotationAngle(handguard5_r1, -0.5205F, 0.0F, 0.0F);
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 82, 41, -4.299F, -40.5F, -40.5F, 1, 2, 1, 0.0F, false));
		handguard5_r1.cubeList.add(new ModelBox(handguard5_r1, 82, 46, 0.299F, -40.5F, -40.5F, 1, 2, 1, 0.0F, false));

		stock = new QRenderer(this);
		stock.setRotationPoint(0.0F, 32.7316F, 35.7447F);
		stock.cubeList.add(new ModelBox(stock, 102, 30, -2.0F, -50.0316F, -28.7447F, 1, 1, 26, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 74, 56, -2.0F, -48.7316F, -28.7447F, 1, 2, 26, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 44, 68, -3.2F, -49.2316F, -28.7447F, 2, 1, 26, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 42, 13, -1.8F, -48.2316F, -13.7447F, 2, 2, 11, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 42, 0, -3.2F, -48.2316F, -13.7447F, 2, 2, 11, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 67, 29, -1.8F, -49.2316F, -28.7447F, 2, 1, 26, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 74, 68, -1.8F, -45.7316F, -13.7447F, 2, 1, 11, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 67, 41, -3.2F, -45.7316F, -13.7447F, 2, 1, 11, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 153, 105, -3.0F, -46.7316F, -13.7447F, 3, 1, 11, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 42, 0, -2.5F, -47.2316F, -28.7447F, 2, 3, 26, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 99, 18, -2.498F, -34.3316F, -8.6437F, 2, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 99, 7, -2.501F, -33.9316F, -8.6447F, 2, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 16, 72, -2.499F, -33.9316F, -7.1447F, 2, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 132, 82, -2.0F, -44.7316F, -24.7447F, 1, 3, 20, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 74, 68, -2.4F, -44.6316F, -22.7447F, 1, 3, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 73, 56, -1.6F, -44.6316F, -22.7447F, 1, 3, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 67, 47, -2.4F, -44.6316F, -19.7447F, 1, 3, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 67, 41, -1.6F, -44.6316F, -19.7447F, 1, 3, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 28, 80, -2.201F, -42.6306F, -17.2447F, 1, 1, 4, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 80, -1.8F, -42.6316F, -17.2447F, 1, 1, 4, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 42, 13, -3.0F, -49.2316F, -2.7447F, 3, 5, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 122, 121, -2.0F, -49.9316F, -2.7447F, 1, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 82, 36, -3.001F, -33.9316F, -6.0447F, 3, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 130, 35, -3.0F, -47.2316F, -34.2447F, 3, 2, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 97, -3.0F, -47.2316F, -31.2447F, 3, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 102, 99, -3.0F, -49.2316F, -34.7447F, 3, 1, 6, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 49, 40, -2.0F, -50.2316F, -34.7447F, 1, 3, 6, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 79, 84, -2.0F, -50.2316F, -35.7347F, 1, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 19, 26, -4.0F, -45.7316F, -32.7447F, 5, 3, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 130, 109, -4.0F, -42.7316F, -31.7447F, 5, 3, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 28, -3.999F, -40.5316F, -32.7437F, 5, 1, 2, 0.0F, false));

		grip53_r1 = new ModelRenderer(this);
		grip53_r1.setRotationPoint(0.0F, -21.2242F, -6.9203F);
		stock.addChild(grip53_r1);
		setRotationAngle(grip53_r1, 0.8179F, 0.0F, 0.0F);
		grip53_r1.cubeList.add(new ModelBox(grip53_r1, 84, 0, -2.001F, -39.5F, 0.0F, 1, 2, 1, 0.0F, false));

		grip48_r1 = new ModelRenderer(this);
		grip48_r1.setRotationPoint(0.0F, -25.9268F, -2.7821F);
		stock.addChild(grip48_r1);
		setRotationAngle(grip48_r1, 0.9666F, 0.0F, 0.0F);
		grip48_r1.cubeList.add(new ModelBox(grip48_r1, 8, 72, -3.01F, -40.0F, 0.1F, 3, 1, 1, 0.0F, false));

		grip52_r1 = new ModelRenderer(this);
		grip52_r1.setRotationPoint(-37.1098F, -36.9792F, -35.7447F);
		stock.addChild(grip52_r1);
		setRotationAngle(grip52_r1, 0.0F, 0.0F, 1.3012F);
		grip52_r1.cubeList.add(new ModelBox(grip52_r1, 113, 68, -1.0F, -38.5F, 1.5F, 1, 1, 5, 0.0F, false));

		grip51_r1 = new ModelRenderer(this);
		grip51_r1.setRotationPoint(34.9087F, -39.871F, -35.7447F);
		stock.addChild(grip51_r1);
		setRotationAngle(grip51_r1, 0.0F, 0.0F, -1.3013F);
		grip51_r1.cubeList.add(new ModelBox(grip51_r1, 114, 99, -3.0F, -38.5F, 1.5F, 1, 1, 5, 0.0F, false));

		grip50_r1 = new ModelRenderer(this);
		grip50_r1.setRotationPoint(-27.9307F, -20.3009F, -35.7447F);
		stock.addChild(grip50_r1);
		setRotationAngle(grip50_r1, 0.0F, 0.0F, 0.7854F);
		grip50_r1.cubeList.add(new ModelBox(grip50_r1, 85, 95, -1.0F, -39.5F, 1.0F, 1, 1, 6, 0.0F, false));

		grip49_r1 = new ModelRenderer(this);
		grip49_r1.setRotationPoint(27.052F, -22.4223F, -35.7447F);
		stock.addChild(grip49_r1);
		setRotationAngle(grip49_r1, 0.0F, 0.0F, -0.7854F);
		grip49_r1.cubeList.add(new ModelBox(grip49_r1, 97, 30, -3.0F, -39.5F, 1.0F, 1, 1, 6, 0.0F, false));

		grip47_r1 = new ModelRenderer(this);
		grip47_r1.setRotationPoint(-29.9307F, -19.4725F, -35.7447F);
		stock.addChild(grip47_r1);
		setRotationAngle(grip47_r1, 0.0F, 0.0F, 0.7854F);
		grip47_r1.cubeList.add(new ModelBox(grip47_r1, 56, 122, -2.0F, -41.1F, 0.0F, 1, 1, 7, 0.0F, false));
		grip47_r1.cubeList.add(new ModelBox(grip47_r1, 65, 123, -2.0003F, -41.5F, 0.001F, 1, 1, 7, 0.0F, false));

		grip46_r1 = new ModelRenderer(this);
		grip46_r1.setRotationPoint(-29.6378F, -20.1796F, -35.7447F);
		stock.addChild(grip46_r1);
		setRotationAngle(grip46_r1, 0.0F, 0.0F, 0.7854F);
		grip46_r1.cubeList.add(new ModelBox(grip46_r1, 9, 123, -0.6F, -41.5F, 0.0F, 1, 1, 7, 0.0F, false));
		grip46_r1.cubeList.add(new ModelBox(grip46_r1, 37, 124, -1.0F, -41.501F, 0.001F, 1, 1, 7, 0.0F, false));

		grip40_r1 = new ModelRenderer(this);
		grip40_r1.setRotationPoint(0.0F, -83.8948F, -34.721F);
		stock.addChild(grip40_r1);
		setRotationAngle(grip40_r1, -2.8256F, 0.0F, 0.0F);
		grip40_r1.cubeList.add(new ModelBox(grip40_r1, 130, 49, -3.01F, -37.5F, 6.5F, 3, 1, 3, 0.0F, false));

		stock51_r1 = new ModelRenderer(this);
		stock51_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(stock51_r1);
		setRotationAngle(stock51_r1, 0.8923F, 0.0F, 0.0F);
		stock51_r1.cubeList.add(new ModelBox(stock51_r1, 8, 40, -2.001F, -33.0F, 27.0F, 1, 3, 2, 0.0F, false));

		stock49_r1 = new ModelRenderer(this);
		stock49_r1.setRotationPoint(0.0F, -79.4783F, -8.0295F);
		stock.addChild(stock49_r1);
		setRotationAngle(stock49_r1, -2.1192F, 0.0F, 0.0F);
		stock49_r1.cubeList.add(new ModelBox(stock49_r1, 113, 30, -3.0F, -27.6F, 33.7F, 3, 2, 4, 0.0F, false));

		stock48_r1 = new ModelRenderer(this);
		stock48_r1.setRotationPoint(-23.8122F, -15.609F, -35.7447F);
		stock.addChild(stock48_r1);
		setRotationAngle(stock48_r1, 0.0F, 0.0F, 0.6109F);
		stock48_r1.cubeList.add(new ModelBox(stock48_r1, 121, 101, -0.8F, -41.2F, 32.99F, 1, 1, 2, 0.0F, false));
		stock48_r1.cubeList.add(new ModelBox(stock48_r1, 122, 118, -1.0F, -41.2006F, 33.001F, 1, 1, 2, 0.0F, false));

		stock47_r1 = new ModelRenderer(this);
		stock47_r1.setRotationPoint(23.2697F, -17.3297F, -35.7447F);
		stock.addChild(stock47_r1);
		setRotationAngle(stock47_r1, 0.0F, 0.0F, -0.6109F);
		stock47_r1.cubeList.add(new ModelBox(stock47_r1, 65, 122, -3.2F, -41.2F, 32.99F, 1, 1, 2, 0.0F, false));
		stock47_r1.cubeList.add(new ModelBox(stock47_r1, 74, 122, -3.0F, -41.2009F, 33.001F, 1, 1, 2, 0.0F, false));

		stock42_r1 = new ModelRenderer(this);
		stock42_r1.setRotationPoint(0.0F, -84.924F, -29.5437F);
		stock.addChild(stock42_r1);
		setRotationAngle(stock42_r1, -1.7474F, 0.0F, 0.0F);
		stock42_r1.cubeList.add(new ModelBox(stock42_r1, 72, 13, -2.999F, -35.5F, 35.0F, 3, 2, 8, 0.0F, false));

		stock41_r1 = new ModelRenderer(this);
		stock41_r1.setRotationPoint(0.0F, -78.1252F, -33.1361F);
		stock.addChild(stock41_r1);
		setRotationAngle(stock41_r1, -2.0448F, 0.0F, 0.0F);
		stock41_r1.cubeList.add(new ModelBox(stock41_r1, 63, 13, -1.799F, -33.9F, 22.5F, 1, 3, 1, 0.0F, false));
		stock41_r1.cubeList.add(new ModelBox(stock41_r1, 63, 19, -2.2F, -33.9F, 22.5F, 1, 3, 1, 0.0F, false));

		stock39_r1 = new ModelRenderer(this);
		stock39_r1.setRotationPoint(0.0F, -34.617F, 19.8424F);
		stock.addChild(stock39_r1);
		setRotationAngle(stock39_r1, 1.8961F, 0.0F, 0.0F);
		stock39_r1.cubeList.add(new ModelBox(stock39_r1, 20, 102, -2.202F, -32.9F, 18.5F, 1, 2, 2, 0.0F, false));
		stock39_r1.cubeList.add(new ModelBox(stock39_r1, 105, 30, -1.801F, -32.9F, 18.5F, 1, 2, 2, 0.0F, false));

		stock35_r1 = new ModelRenderer(this);
		stock35_r1.setRotationPoint(0.0F, -10.9088F, -39.7431F);
		stock.addChild(stock35_r1);
		setRotationAngle(stock35_r1, -0.1115F, 0.0F, 0.0F);
		stock35_r1.cubeList.add(new ModelBox(stock35_r1, 57, 13, -2.6F, -36.9F, 17.5F, 1, 2, 4, 0.0F, false));
		stock35_r1.cubeList.add(new ModelBox(stock35_r1, 67, 41, -1.4F, -36.9F, 17.5F, 1, 2, 4, 0.0F, false));

		stock31_r1 = new ModelRenderer(this);
		stock31_r1.setRotationPoint(-16.1006F, -8.7316F, -17.996F);
		stock.addChild(stock31_r1);
		setRotationAngle(stock31_r1, -3.1416F, 1.1339F, 3.1416F);
		stock31_r1.cubeList.add(new ModelBox(stock31_r1, 67, 56, -3.4F, -35.9F, 14.0F, 1, 3, 1, 0.0F, false));

		stock30_r1 = new ModelRenderer(this);
		stock30_r1.setRotationPoint(8.3637F, -8.7316F, -15.0699F);
		stock.addChild(stock30_r1);
		setRotationAngle(stock30_r1, -3.1416F, -1.1339F, 3.1416F);
		stock30_r1.cubeList.add(new ModelBox(stock30_r1, 36, 68, -3.4F, -35.9F, 12.0F, 1, 3, 1, 0.0F, false));

		stock29_r1 = new ModelRenderer(this);
		stock29_r1.setRotationPoint(-12.633F, -8.7316F, -17.7881F);
		stock.addChild(stock29_r1);
		setRotationAngle(stock29_r1, -3.1416F, 1.1339F, 3.1416F);
		stock29_r1.cubeList.add(new ModelBox(stock29_r1, 73, 41, -0.6F, -35.9F, 12.0F, 1, 3, 1, 0.0F, false));

		stock28_r1 = new ModelRenderer(this);
		stock28_r1.setRotationPoint(11.8314F, -8.7316F, -15.2778F);
		stock.addChild(stock28_r1);
		setRotationAngle(stock28_r1, -3.1416F, -1.1339F, 3.1416F);
		stock28_r1.cubeList.add(new ModelBox(stock28_r1, 73, 47, -0.6F, -35.9F, 14.0F, 1, 3, 1, 0.0F, false));

		stock25_r1 = new ModelRenderer(this);
		stock25_r1.setRotationPoint(0.0F, -50.8023F, 8.8369F);
		stock.addChild(stock25_r1);
		setRotationAngle(stock25_r1, 2.1564F, 0.0F, 0.0F);
		stock25_r1.cubeList.add(new ModelBox(stock25_r1, 89, 73, -2.0F, -33.0F, 11.0F, 1, 2, 3, -0.001F, false));

		stock20_r1 = new ModelRenderer(this);
		stock20_r1.setRotationPoint(0.0F, -77.7715F, -11.0721F);
		stock.addChild(stock20_r1);
		setRotationAngle(stock20_r1, -2.1192F, 0.0F, 0.0F);
		stock20_r1.cubeList.add(new ModelBox(stock20_r1, 111, 0, -2.5F, -27.6F, 31.7F, 2, 3, 4, 0.0F, false));

		stock19_r1 = new ModelRenderer(this);
		stock19_r1.setRotationPoint(0.0F, -82.9551F, -31.895F);
		stock.addChild(stock19_r1);
		setRotationAngle(stock19_r1, -1.7474F, 0.0F, 0.0F);
		stock19_r1.cubeList.add(new ModelBox(stock19_r1, 28, 107, -2.499F, -35.5F, 33.0F, 2, 3, 8, 0.0F, false));

		stock14_r1 = new ModelRenderer(this);
		stock14_r1.setRotationPoint(0.0F, -3.5367F, -16.6453F);
		stock.addChild(stock14_r1);
		setRotationAngle(stock14_r1, 0.4461F, 0.0F, 0.0F);
		stock14_r1.cubeList.add(new ModelBox(stock14_r1, 18, 124, -1.801F, -39.5F, 21.0F, 2, 2, 1, 0.0F, false));
		stock14_r1.cubeList.add(new ModelBox(stock14_r1, 98, 124, -3.199F, -39.5F, 21.0F, 2, 2, 1, 0.0F, false));

		stock12_r1 = new ModelRenderer(this);
		stock12_r1.setRotationPoint(31.2368F, -67.8428F, -35.7447F);
		stock.addChild(stock12_r1);
		setRotationAngle(stock12_r1, 0.0F, 0.0F, -2.0076F);
		stock12_r1.cubeList.add(new ModelBox(stock12_r1, 0, 0, -5.2F, -39.5F, 7.0F, 2, 1, 15, 0.0F, false));

		stock11_r1 = new ModelRenderer(this);
		stock11_r1.setRotationPoint(-35.5059F, -65.1248F, -35.7447F);
		stock.addChild(stock11_r1);
		setRotationAngle(stock11_r1, 0.0F, 0.0F, 2.0076F);
		stock11_r1.cubeList.add(new ModelBox(stock11_r1, 0, 16, 0.2F, -39.5F, 7.0F, 2, 1, 15, 0.0F, false));

		stock10_r1 = new ModelRenderer(this);
		stock10_r1.setRotationPoint(22.4628F, -16.696F, -35.7447F);
		stock.addChild(stock10_r1);
		setRotationAngle(stock10_r1, 0.0F, 0.0F, -0.5847F);
		stock10_r1.cubeList.add(new ModelBox(stock10_r1, 0, 80, -3.45F, -41.3F, 7.0F, 1, 1, 26, 0.0F, false));
		stock10_r1.cubeList.add(new ModelBox(stock10_r1, 74, 84, -3.0F, -41.3006F, 7.0F, 1, 1, 26, 0.0F, false));

		stock8_r1 = new ModelRenderer(this);
		stock8_r1.setRotationPoint(-22.9611F, -15.0402F, -35.7447F);
		stock.addChild(stock8_r1);
		setRotationAngle(stock8_r1, 0.0F, 0.0F, 0.5847F);
		stock8_r1.cubeList.add(new ModelBox(stock8_r1, 28, 95, -0.55F, -41.3F, 7.0F, 1, 1, 26, 0.0F, false));
		stock8_r1.cubeList.add(new ModelBox(stock8_r1, 97, 3, -1.0F, -41.3004F, 7.0F, 1, 1, 26, 0.0F, false));

		grip = new QRenderer(this);
		grip.setRotationPoint(-0.5F, -3.6301F, -7.3424F);
		grip.cubeList.add(new ModelBox(grip, 84, 111, -2.999F, -3.8699F, 0.3424F, 4, 4, 6, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 84, 5, -3.001F, -3.8699F, 5.8424F, 4, 4, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 12, 99, -2.999F, -3.8699F, 6.8424F, 4, 1, 2, 0.0F, false));

		grip12_r1 = new ModelRenderer(this);
		grip12_r1.setRotationPoint(4.0F, 9.5589F, 33.043F);
		grip.addChild(grip12_r1);
		setRotationAngle(grip12_r1, 0.7854F, 0.0F, 0.0F);
		grip12_r1.cubeList.add(new ModelBox(grip12_r1, 42, 9, -7.001F, -23.3F, -19.1F, 4, 1, 1, 0.0F, false));

		grip9_r1 = new ModelRenderer(this);
		grip9_r1.setRotationPoint(0.5F, 10.1344F, 25.5899F);
		grip.addChild(grip9_r1);
		setRotationAngle(grip9_r1, 1.0782F, 0.0F, 0.0F);
		grip9_r1.cubeList.add(new ModelBox(grip9_r1, 130, 113, -3.501F, -24.0F, -5.5F, 4, 2, 2, 0.0F, false));

		grip8_r1 = new ModelRenderer(this);
		grip8_r1.setRotationPoint(0.5F, 7.987F, 27.61F);
		grip.addChild(grip8_r1);
		setRotationAngle(grip8_r1, 1.041F, 0.0F, 0.0F);
		grip8_r1.cubeList.add(new ModelBox(grip8_r1, 72, 6, -3.501F, -27.5F, -7.0F, 4, 3, 1, 0.0F, false));

		grip7_r1 = new ModelRenderer(this);
		grip7_r1.setRotationPoint(0.5F, -30.8074F, -3.4863F);
		grip.addChild(grip7_r1);
		setRotationAngle(grip7_r1, -2.6769F, 0.0F, 0.0F);
		grip7_r1.cubeList.add(new ModelBox(grip7_r1, 125, 24, -3.5F, -30.5F, 1.5F, 4, 1, 3, 0.0F, false));

		grip4_r1 = new ModelRenderer(this);
		grip4_r1.setRotationPoint(0.5F, -18.8756F, -0.6627F);
		grip.addChild(grip4_r1);
		setRotationAngle(grip4_r1, -2.6769F, 0.0F, 0.0F);
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 72, 0, -3.5F, -24.2F, 1.5F, 4, 5, 1, -0.001F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(0.5F, 7.5432F, -15.0526F);
		grip.addChild(grip3_r1);
		setRotationAngle(grip3_r1, -1.3384F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 125, 0, -3.499F, -24.2F, 1.5F, 4, 1, 5, 0.0F, false));

		grip2_r1 = new ModelRenderer(this);
		grip2_r1.setRotationPoint(0.5F, 25.2888F, 14.2336F);
		grip.addChild(grip2_r1);
		setRotationAngle(grip2_r1, 0.2602F, 0.0F, 0.0F);
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 102, 84, -3.5F, -27.5F, -5.5F, 4, 10, 5, 0.0F, false));

		mag = new QRenderer(this);
		mag.setRotationPoint(0.0F, 11.325F, -49.1489F);
		

		mag11_r1 = new ModelRenderer(this);
		mag11_r1.setRotationPoint(0.0F, 18.9157F, 40.6374F);
		mag.addChild(mag11_r1);
		setRotationAngle(mag11_r1, -0.2602F, 0.0F, 0.0F);
		mag11_r1.cubeList.add(new ModelBox(mag11_r1, 19, 16, -4.0F, -34.4107F, -28.9F, 5, 8, 2, 0.0F, false));
		mag11_r1.cubeList.add(new ModelBox(mag11_r1, 40, 107, -4.0F, -34.3607F, -25.9F, 5, 7, 1, 0.0F, false));
		mag11_r1.cubeList.add(new ModelBox(mag11_r1, 60, 80, -0.199F, -34.4F, -24.1F, 1, 9, 3, 0.0F, false));
		mag11_r1.cubeList.add(new ModelBox(mag11_r1, 13, 80, -3.99F, -34.4107F, -26.9F, 5, 9, 1, 0.0F, false));
		mag11_r1.cubeList.add(new ModelBox(mag11_r1, 87, 56, -3.99F, -34.4107F, -24.9F, 5, 9, 1, 0.0F, false));
		mag11_r1.cubeList.add(new ModelBox(mag11_r1, 0, 107, -3.5F, -34.4F, -29.2F, 4, 9, 5, 0.0F, false));
		mag11_r1.cubeList.add(new ModelBox(mag11_r1, 36, 40, -3.5F, -34.4F, -19.5F, 4, 9, 1, 0.0F, false));
		mag11_r1.cubeList.add(new ModelBox(mag11_r1, 17, 40, -3.99F, -34.4107F, -21.9F, 5, 9, 3, 0.0F, false));

		mag22_r1 = new ModelRenderer(this);
		mag22_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(mag22_r1);
		setRotationAngle(mag22_r1, -1.9333F, 0.0F, 0.0F);
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 18, 107, 0.2F, -23.8F, -10.2F, 1, 11, 2, 0.0F, false));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 0, 0, -4.2F, -23.799F, -10.2001F, 5, 11, 2, 0.0F, false));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 18, 56, -3.8F, -20.8F, -20.2F, 1, 3, 7, 0.0F, false));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 106, 120, -0.2F, -20.8F, -20.2F, 1, 3, 7, 0.0F, false));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 36, 68, -4.0F, -20.3F, -14.2F, 5, 2, 4, 0.0F, false));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 19, 11, -4.0F, -15.3F, -12.2F, 5, 2, 2, 0.0F, false));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 0, 50, -4.0F, -15.3F, -15.7F, 5, 2, 2, 0.0F, false));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 0, 65, -4.0F, -15.3F, -19.2F, 5, 2, 2, 0.0F, false));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 67, 56, -4.0F, -16.3F, -20.2F, 5, 1, 10, 0.0F, false));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 100, 153, -4.0F, -18.3F, -20.2F, 5, 1, 10, 0.0F, false));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 56, 95, -3.5F, -18.0F, -20.2F, 4, 5, 10, -0.001F, false));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 153, 117, -3.5F, -23.7F, -20.2F, 4, 1, 10, 0.0F, false));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 28, 80, -4.0F, -23.3F, -20.2F, 5, 3, 10, 0.0F, false));

		mag19_r1 = new ModelRenderer(this);
		mag19_r1.setRotationPoint(0.0F, 18.915F, 40.6374F);
		mag.addChild(mag19_r1);
		setRotationAngle(mag19_r1, -0.2602F, 0.0F, 0.0F);
		mag19_r1.cubeList.add(new ModelBox(mag19_r1, 0, 16, -3.801F, -34.39F, -24.1F, 4, 9, 3, 0.0F, false));

		action = new QRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 4, 100, -3.7F, -38.4F, -18.001F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 67, 47, -3.7F, -37.4F, -21.0F, 1, 1, 4, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 80, 68, -3.7F, -38.4F, -22.01F, 1, 2, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 0, 100, -4.7F, -38.1F, -24.5F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 74, 68, -3.7F, -38.4F, -26.0F, 1, 1, 4, 0.0F, false));

		action5_r1 = new ModelRenderer(this);
		action5_r1.setRotationPoint(34.2987F, -31.7407F, 0.0F);
		action.addChild(action5_r1);
		setRotationAngle(action5_r1, 0.0F, 0.0F, -1.3013F);
		action5_r1.cubeList.add(new ModelBox(action5_r1, 74, 90, -3.7F, -38.4F, -26.0F, 2, 1, 2, 0.0F, false));
		action5_r1.cubeList.add(new ModelBox(action5_r1, 50, 68, -3.7F, -38.4F, -22.0F, 2, 1, 1, 0.0F, false));
		action5_r1.cubeList.add(new ModelBox(action5_r1, 28, 32, -3.7F, -38.4F, -18.0F, 2, 1, 1, 0.0F, false));
		action5_r1.cubeList.add(new ModelBox(action5_r1, 106, 111, -2.7F, -38.4003F, -26.0F, 1, 1, 8, 0.001F, false));

		action8_r1 = new ModelRenderer(this);
		action8_r1.setRotationPoint(11.7245F, 0.0F, -6.0479F);
		action.addChild(action8_r1);
		setRotationAngle(action8_r1, 0.0F, 0.5577F, 0.0F);
		action8_r1.cubeList.add(new ModelBox(action8_r1, 28, 118, -4.7F, -38.1F, -23.5F, 1, 1, 2, 0.0F, false));

		action6_r1 = new ModelRenderer(this);
		action6_r1.setRotationPoint(27.4659F, -13.8533F, 0.0F);
		action.addChild(action6_r1);
		setRotationAngle(action6_r1, 0.0F, 0.0F, -0.7808F);
		action6_r1.cubeList.add(new ModelBox(action6_r1, 97, 46, -3.1F, -40.3F, -26.0F, 1, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
//		handguard.render(f5);
//		stock.render(f5);
//		grip.render(f5);
//		mag.render(f5);
//		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
