package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M82Mag extends ModelWithAttachments {
	private final QRenderer gun;
	private final ModelRenderer gun173_r1;
	private final ModelRenderer gun169_r1;
	private final ModelRenderer gun168_r1;
	private final ModelRenderer gun167_r1;
	private final ModelRenderer gun166_r1;
	private final ModelRenderer gun165_r1;
	private final ModelRenderer gun164_r1;
	private final ModelRenderer gun163_r1;
	private final ModelRenderer gun162_r1;
	private final ModelRenderer gun161_r1;
	private final ModelRenderer gun160_r1;
	private final ModelRenderer gun151_r1;
	private final ModelRenderer gun147_r1;
	private final ModelRenderer gun146_r1;
	private final ModelRenderer gun142_r1;
	private final ModelRenderer gun141_r1;
	private final ModelRenderer gun140_r1;
	private final ModelRenderer gun138_r1;
	private final ModelRenderer gun137_r1;
	private final ModelRenderer gun135_r1;
	private final ModelRenderer gun134_r1;
	private final ModelRenderer gun133_r1;
	private final ModelRenderer gun132_r1;
	private final ModelRenderer gun131_r1;
	private final ModelRenderer gun130_r1;
	private final ModelRenderer gun129_r1;
	private final ModelRenderer gun128_r1;
	private final ModelRenderer gun127_r1;
	private final ModelRenderer gun117_r1;
	private final ModelRenderer gun110_r1;
	private final ModelRenderer gun109_r1;
	private final ModelRenderer gun87_r1;
	private final ModelRenderer gun84_r1;
	private final ModelRenderer gun83_r1;
	private final ModelRenderer gun73_r1;
	private final ModelRenderer gun72_r1;
	private final ModelRenderer gun64_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun69_r1;
	private final ModelRenderer gun68_r1;
	private final ModelRenderer gun61_r1;
	private final ModelRenderer gun50_r1;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun29_r1;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun20_r1;
	private final ModelRenderer gun18_r1;
	private final ModelRenderer gun14_r1;
	private final ModelRenderer gun13_r1;
	private final QRenderer barrel;
	private final ModelRenderer gun198_r1;
	private final ModelRenderer gun198_r2;
	private final ModelRenderer gun178_r1;
	private final ModelRenderer gun178_r2;
	private final ModelRenderer gun177_r1;
	private final ModelRenderer gun177_r2;
	private final QRenderer action;
	private final ModelRenderer action10_r1;
	private final ModelRenderer action2_r1;
	private final ModelRenderer action14_r1;
	private final QRenderer mag;
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

	public M82Mag() {
		textureWidth = 410;
		textureHeight = 410;

		gun = new QRenderer(this);
		gun.setRotationPoint(-3.5F, -7.0F, -6.0F);
		gun.cubeList.add(new ModelBox(gun, 0, 0, 1.0F, 0.0F, -0.5F, 2, 5, 1, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 30, 25, 1.0F, -0.5F, -7.5F, 2, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 52, 0.1F, -5.0F, -7.1F, 3, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 84, 0, 2.9F, -5.0F, -7.1F, 1, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 25, -0.5F, -5.0F, -27.1F, 5, 5, 20, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 69, 0, -0.5F, -0.5F, -8.1F, 5, 5, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 93, 116, -0.5F, 0.0F, -21.1F, 5, 2, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 102, 7, 0.0F, -3.0F, 1.1F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 34, 3.3F, -2.9F, 1.5F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 42, 0.0F, -2.0F, -2.1F, 4, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 42, 0.0F, -4.4F, 3.4F, 4, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 73, -0.5F, 2.5F, -8.7F, 5, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 102, 5, -0.6F, 3.1667F, -8.4F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 102, 3, 3.6F, 3.1667F, -8.4F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 19, -0.5F, -5.0F, -30.1F, 5, 1, 3, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 284, -1.5F, -7.5F, 5.0F, 7, 1, 38, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 268, 0, -1.5F, -7.5F, -72.0F, 7, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 93, 157, 4.5F, -7.5F, -27.0F, 1, 1, 32, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 286, 247, 0.0F, -5.0F, -72.0F, 4, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, 0.0F, -5.0F, -8.0F, 4, 1, 51, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, 0.0F, -10.0F, -72.0F, 4, 1, 115, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 186, 89, 1.4F, -11.45F, -72.0F, 2, 2, 77, -0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 196, 168, 0.6F, -11.45F, -72.0F, 1, 2, 77, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 70, 1.8F, -11.8F, -72.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 99, 93, 1.2F, -11.8F, -72.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 99, 58, 1.2F, -11.8F, -70.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 99, 62, 1.8F, -11.8F, -70.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 99, 45, 1.2F, -11.8F, -68.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 99, 54, 1.8F, -11.8F, -68.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 99, 4, 1.2F, -11.8F, -66.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 99, 8, 1.8F, -11.8F, -66.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 98, 74, 1.2F, -11.8F, -64.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 99, 0, 1.8F, -11.8F, -64.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 98, 19, 1.2F, -11.8F, -62.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 98, 41, 1.8F, -11.8F, -62.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 81, 97, 1.2F, -11.8F, -60.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 89, 97, 1.8F, -11.8F, -60.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 43, 1.2F, -11.8F, -58.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 68, 97, 1.8F, -11.8F, -58.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 64, 95, 1.8F, -11.8F, -48.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 68, 95, 1.2F, -11.8F, -48.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 95, 1.2F, -11.8F, -50.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 89, 95, 1.8F, -11.8F, -50.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 96, 1.8F, -11.8F, -52.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 13, 96, 1.2F, -11.8F, -52.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 29, 96, 1.8F, -11.8F, -54.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 96, 1.2F, -11.8F, -54.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 94, 1.8F, -11.8F, -56.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 96, 1.2F, -11.8F, -56.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 92, 1.2F, -11.8F, -26.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 17, 92, 1.8F, -11.8F, -26.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 92, 26, 1.8F, -11.8F, -28.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 92, 28, 1.2F, -11.8F, -28.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 92, 32, 1.2F, -11.8F, -30.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 92, 1.8F, -11.8F, -30.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 93, 8, 1.8F, -11.8F, -32.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 93, 10, 1.2F, -11.8F, -32.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 93, 1.2F, -11.8F, -34.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 89, 93, 1.8F, -11.8F, -34.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 94, 1.8F, -11.8F, -36.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 13, 94, 1.2F, -11.8F, -36.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 29, 94, 1.8F, -11.8F, -38.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 94, 1.2F, -11.8F, -38.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 95, 1.8F, -11.8F, -40.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 6, 95, 1.2F, -11.8F, -40.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 84, 63, 1.2F, -11.8F, -10.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 83, 84, 1.8F, -11.8F, -10.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 79, 1.8F, -11.8F, -12.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 81, 1.2F, -11.8F, -12.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 86, 1.2F, -11.8F, -14.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 83, 86, 1.8F, -11.8F, -14.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 87, 87, 1.8F, -11.8F, -16.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 12, 88, 1.2F, -11.8F, -16.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 88, 78, 1.2F, -11.8F, -18.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 88, 80, 1.8F, -11.8F, -18.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 89, 1.8F, -11.8F, -20.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 81, 89, 1.2F, -11.8F, -20.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 88, 90, 1.8F, -11.8F, -22.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 91, 1.2F, -11.8F, -22.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 92, 2, 1.8F, -11.8F, -24.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 3, 92, 1.2F, -11.8F, -24.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 69, 1.8F, -11.8F, 4.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 71, 1.2F, -11.8F, 4.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 54, 1.2F, -11.8F, 2.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 73, 1.8F, -11.8F, 2.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 77, 1.8F, -11.8F, 0.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 77, 1.2F, -11.8F, 0.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 35, 78, 1.2F, -11.8F, -2.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 78, 1.8F, -11.8F, -2.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 79, 1.8F, -11.8F, -4.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 79, 1.2F, -11.8F, -4.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 80, 1.8F, -11.8F, -6.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 63, 1.2F, -11.8F, -6.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 46, 81, 1.8F, -11.8F, -8.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 81, 1.2F, -11.8F, -8.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 84, 18, 0.0F, -4.3F, -39.0F, 4, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 15, -0.5F, -3.65F, -38.5F, 5, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 84, 44, 0.0F, -4.0F, -61.0F, 4, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 84, 34, 0.0F, -4.0F, -56.0F, 4, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 0, 1.5F, -3.5F, -61.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 64, 90, 0.0F, -9.0F, -72.0F, 4, 4, 1, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 70, 0.2F, -11.85F, -45.5F, 3, 2, 4, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 66, 52, 2.8F, -11.85F, -45.5F, 1, 2, 4, 0.003F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 76, 0.0F, -5.0F, 42.0F, 4, 12, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 52, 1.0F, -4.0F, 39.5F, 2, 8, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 8, 60, 1.0F, -9.0F, 43.0F, 2, 13, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 52, 0.5F, -8.0F, 43.0F, 3, 13, 3, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 11, 25, 0.5F, -8.0F, 45.8F, 3, 4, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 12, 87, 1.5F, -12.45F, -45.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 5, 60, 2.9F, -11.5F, -44.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 27, 0.1F, -11.5F, -44.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 25, 1.5F, -12.0F, -41.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 6, -2.9F, -9.7F, -41.5F, 1, 8, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 84, 25, -3.4F, -1.6F, -40.5F, 2, 2, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 35, 76, -3.4F, -2.3F, -40.5F, 2, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 29, -3.4F, -2.3F, -38.0F, 2, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 27, -3.4F, -2.3F, -35.5F, 2, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 25, -3.4F, -2.3F, -33.0F, 2, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 25, 76, -3.4F, -2.3F, -30.5F, 2, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 74, -3.4F, -2.3F, -28.0F, 2, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 2, -3.4F, -1.6F, -28.0F, 2, 2, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 123, 0, -3.4F, -1.9F, -40.5F, 2, 1, 13, 0.002F, false));

		gun173_r1 = new ModelRenderer(this);
		gun173_r1.setRotationPoint(-1.9F, -1.7F, -41.5F);
		gun.addChild(gun173_r1);
		setRotationAngle(gun173_r1, 0.8551F, 0.0F, 0.0F);
		gun173_r1.cubeList.add(new ModelBox(gun173_r1, 100, 89, -1.0F, 0.5F, 0.0F, 1, 1, 1, 0.0F, false));
		gun173_r1.cubeList.add(new ModelBox(gun173_r1, 101, 20, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.002F, false));

		gun169_r1 = new ModelRenderer(this);
		gun169_r1.setRotationPoint(-1.4F, -2.3F, -39.5F);
		gun.addChild(gun169_r1);
		setRotationAngle(gun169_r1, 0.6692F, 0.0F, 0.0F);
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 30, 39, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		gun168_r1 = new ModelRenderer(this);
		gun168_r1.setRotationPoint(-1.4F, -2.3F, -37.0F);
		gun.addChild(gun168_r1);
		setRotationAngle(gun168_r1, 0.6692F, 0.0F, 0.0F);
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 59, 25, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		gun167_r1 = new ModelRenderer(this);
		gun167_r1.setRotationPoint(-1.4F, -2.3F, -34.5F);
		gun.addChild(gun167_r1);
		setRotationAngle(gun167_r1, 0.6692F, 0.0F, 0.0F);
		gun167_r1.cubeList.add(new ModelBox(gun167_r1, 59, 27, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		gun166_r1 = new ModelRenderer(this);
		gun166_r1.setRotationPoint(-1.4F, -2.3F, -32.0F);
		gun.addChild(gun166_r1);
		setRotationAngle(gun166_r1, 0.6692F, 0.0F, 0.0F);
		gun166_r1.cubeList.add(new ModelBox(gun166_r1, 59, 29, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		gun165_r1 = new ModelRenderer(this);
		gun165_r1.setRotationPoint(-1.4F, -2.3F, -29.5F);
		gun.addChild(gun165_r1);
		setRotationAngle(gun165_r1, 0.6692F, 0.0F, 0.0F);
		gun165_r1.cubeList.add(new ModelBox(gun165_r1, 57, 59, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		gun164_r1 = new ModelRenderer(this);
		gun164_r1.setRotationPoint(-1.4F, -2.3F, -35.5F);
		gun.addChild(gun164_r1);
		setRotationAngle(gun164_r1, -0.6692F, 0.0F, 0.0F);
		gun164_r1.cubeList.add(new ModelBox(gun164_r1, 68, 25, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun163_r1 = new ModelRenderer(this);
		gun163_r1.setRotationPoint(-1.4F, -2.3F, -38.0F);
		gun.addChild(gun163_r1);
		setRotationAngle(gun163_r1, -0.6692F, 0.0F, 0.0F);
		gun163_r1.cubeList.add(new ModelBox(gun163_r1, 68, 27, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun162_r1 = new ModelRenderer(this);
		gun162_r1.setRotationPoint(-1.4F, -2.3F, -33.0F);
		gun.addChild(gun162_r1);
		setRotationAngle(gun162_r1, -0.6692F, 0.0F, 0.0F);
		gun162_r1.cubeList.add(new ModelBox(gun162_r1, 68, 29, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun161_r1 = new ModelRenderer(this);
		gun161_r1.setRotationPoint(-1.4F, -2.3F, -30.5F);
		gun.addChild(gun161_r1);
		setRotationAngle(gun161_r1, -0.6692F, 0.0F, 0.0F);
		gun161_r1.cubeList.add(new ModelBox(gun161_r1, 43, 73, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun160_r1 = new ModelRenderer(this);
		gun160_r1.setRotationPoint(-1.4F, -2.3F, -28.0F);
		gun.addChild(gun160_r1);
		setRotationAngle(gun160_r1, -0.6692F, 0.0F, 0.0F);
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 74, 11, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun151_r1 = new ModelRenderer(this);
		gun151_r1.setRotationPoint(1.5F, -12.0F, -41.5F);
		gun.addChild(gun151_r1);
		setRotationAngle(gun151_r1, 0.0F, 0.0F, -0.4833F);
		gun151_r1.cubeList.add(new ModelBox(gun151_r1, 69, 6, -5.0F, 0.0F, 0.0F, 5, 1, 1, -0.002F, false));

		gun147_r1 = new ModelRenderer(this);
		gun147_r1.setRotationPoint(1.5F, -12.45F, -45.5F);
		gun.addChild(gun147_r1);
		setRotationAngle(gun147_r1, 0.0F, 0.0F, -0.7064F);
		gun147_r1.cubeList.add(new ModelBox(gun147_r1, 77, 84, -1.0F, 0.0F, 0.0F, 1, 1, 4, -0.002F, false));

		gun146_r1 = new ModelRenderer(this);
		gun146_r1.setRotationPoint(2.5F, -12.45F, -45.5F);
		gun.addChild(gun146_r1);
		setRotationAngle(gun146_r1, 0.0F, 0.0F, 0.7064F);
		gun146_r1.cubeList.add(new ModelBox(gun146_r1, 6, 86, 0.0F, 0.0F, 0.0F, 1, 1, 4, -0.002F, false));

		gun142_r1 = new ModelRenderer(this);
		gun142_r1.setRotationPoint(0.5F, 4.0F, 47.0F);
		gun.addChild(gun142_r1);
		setRotationAngle(gun142_r1, -2.0076F, 0.0F, 0.0F);
		gun142_r1.cubeList.add(new ModelBox(gun142_r1, 59, 0, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun141_r1 = new ModelRenderer(this);
		gun141_r1.setRotationPoint(0.5F, 4.0F, 47.0F);
		gun.addChild(gun141_r1);
		setRotationAngle(gun141_r1, -3.0672F, 0.0F, 0.0F);
		gun141_r1.cubeList.add(new ModelBox(gun141_r1, 84, 0, 0.0F, 0.0F, 0.0F, 3, 8, 1, -0.001F, false));

		gun140_r1 = new ModelRenderer(this);
		gun140_r1.setRotationPoint(0.5F, -7.9F, 47.8F);
		gun.addChild(gun140_r1);
		setRotationAngle(gun140_r1, -1.7846F, 0.0F, 0.0F);
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 0, 52, 0.0F, 0.0F, 0.0F, 3, 1, 7, -0.002F, false));

		gun138_r1 = new ModelRenderer(this);
		gun138_r1.setRotationPoint(0.5F, 6.9F, 43.0F);
		gun.addChild(gun138_r1);
		setRotationAngle(gun138_r1, 2.082F, 0.0F, 0.0F);
		gun138_r1.cubeList.add(new ModelBox(gun138_r1, 14, 0, 0.0F, 0.0F, 0.0F, 3, 4, 2, -0.001F, false));

		gun137_r1 = new ModelRenderer(this);
		gun137_r1.setRotationPoint(1.0F, -9.0F, 45.0F);
		gun.addChild(gun137_r1);
		setRotationAngle(gun137_r1, -0.3718F, 0.0F, 0.0F);
		gun137_r1.cubeList.add(new ModelBox(gun137_r1, 13, 52, 0.0F, 0.0F, 0.0F, 2, 3, 3, -0.001F, false));

		gun135_r1 = new ModelRenderer(this);
		gun135_r1.setRotationPoint(0.0F, 5.0F, 23.6F);
		gun.addChild(gun135_r1);
		setRotationAngle(gun135_r1, 2.1192F, 0.0F, 0.0F);
		gun135_r1.cubeList.add(new ModelBox(gun135_r1, 90, 70, 0.0F, 0.0F, 0.0F, 4, 3, 1, -0.001F, false));

		gun134_r1 = new ModelRenderer(this);
		gun134_r1.setRotationPoint(0.0F, 4.3F, 22.8F);
		gun.addChild(gun134_r1);
		setRotationAngle(gun134_r1, 1.1154F, 0.0F, 0.0F);
		gun134_r1.cubeList.add(new ModelBox(gun134_r1, 59, 44, 0.0F, 0.0F, 0.0F, 4, 1, 3, -0.001F, false));

		gun133_r1 = new ModelRenderer(this);
		gun133_r1.setRotationPoint(0.0F, 4.3F, 22.8F);
		gun.addChild(gun133_r1);
		setRotationAngle(gun133_r1, 0.8551F, 0.0F, 0.0F);
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 84, 40, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun132_r1 = new ModelRenderer(this);
		gun132_r1.setRotationPoint(0.0F, -4.5F, 22.5F);
		gun.addChild(gun132_r1);
		setRotationAngle(gun132_r1, 0.2602F, 0.0F, 0.0F);
		gun132_r1.cubeList.add(new ModelBox(gun132_r1, 10, 76, 0.0F, 0.0F, 0.0F, 4, 8, 2, 0.001F, false));

		gun131_r1 = new ModelRenderer(this);
		gun131_r1.setRotationPoint(0.0F, 7.0F, 42.0F);
		gun.addChild(gun131_r1);
		setRotationAngle(gun131_r1, 2.9671F, 0.0F, 0.0F);
		gun131_r1.cubeList.add(new ModelBox(gun131_r1, 42, 116, 0.0F, 0.0F, 0.0F, 4, 3, 18, 0.002F, false));

		gun130_r1 = new ModelRenderer(this);
		gun130_r1.setRotationPoint(-1.5F, -6.5F, 42.0F);
		gun.addChild(gun130_r1);
		setRotationAngle(gun130_r1, 0.0F, 0.0F, -1.7975F);
		gun130_r1.cubeList.add(new ModelBox(gun130_r1, 74, 9, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun129_r1 = new ModelRenderer(this);
		gun129_r1.setRotationPoint(5.5F, -6.5F, 42.0F);
		gun.addChild(gun129_r1);
		setRotationAngle(gun129_r1, 0.0F, 0.0F, 1.7975F);
		gun129_r1.cubeList.add(new ModelBox(gun129_r1, 43, 76, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun128_r1 = new ModelRenderer(this);
		gun128_r1.setRotationPoint(0.0F, 7.0F, 42.0F);
		gun.addChild(gun128_r1);
		setRotationAngle(gun128_r1, 0.0F, 0.0F, 3.0486F);
		gun128_r1.cubeList.add(new ModelBox(gun128_r1, 52, 85, -2.0F, 0.0F, 0.0F, 2, 13, 1, 0.002F, false));

		gun127_r1 = new ModelRenderer(this);
		gun127_r1.setRotationPoint(4.0F, 7.0F, 42.0F);
		gun.addChild(gun127_r1);
		setRotationAngle(gun127_r1, 0.0F, 0.0F, -3.0486F);
		gun127_r1.cubeList.add(new ModelBox(gun127_r1, 58, 85, 0.0F, 0.0F, 0.0F, 2, 13, 1, 0.002F, false));

		gun117_r1 = new ModelRenderer(this);
		gun117_r1.setRotationPoint(4.0F, -2.3F, -39.0F);
		gun.addChild(gun117_r1);
		setRotationAngle(gun117_r1, -1.0472F, 0.0F, 0.0F);
		gun117_r1.cubeList.add(new ModelBox(gun117_r1, 30, 42, -4.0F, -1.0F, -2.0F, 4, 1, 2, 0.0F, false));

		gun110_r1 = new ModelRenderer(this);
		gun110_r1.setRotationPoint(0.0F, -10.0F, -5.6F);
		gun.addChild(gun110_r1);
		setRotationAngle(gun110_r1, 0.0F, 0.0F, 0.5411F);
		gun110_r1.cubeList.add(new ModelBox(gun110_r1, 42, 29, 0.0F, 1.0F, 0.0F, 1, 1, 3, -0.001F, false));
		gun110_r1.cubeList.add(new ModelBox(gun110_r1, 0, 0, 0.0F, 0.0F, -21.4F, 1, 1, 24, 0.0F, false));
		gun110_r1.cubeList.add(new ModelBox(gun110_r1, 102, 284, 0.0F, 0.0F, 2.6F, 2, 3, 46, 0.0F, false));

		gun109_r1 = new ModelRenderer(this);
		gun109_r1.setRotationPoint(-0.7F, -6.9F, -3.0F);
		gun.addChild(gun109_r1);
		setRotationAngle(gun109_r1, -0.3491F, 0.0F, 0.5411F);
		gun109_r1.cubeList.add(new ModelBox(gun109_r1, 77, 77, -1.0F, -1.0F, -6.0F, 1, 1, 6, 0.0F, false));

		gun87_r1 = new ModelRenderer(this);
		gun87_r1.setRotationPoint(0.1F, 0.0F, 5.9F);
		gun.addChild(gun87_r1);
		setRotationAngle(gun87_r1, 2.3562F, 0.0F, 0.0F);
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 25, 83, 0.0F, 0.0F, 0.0F, 3, 6, 3, -0.001F, false));
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 84, 25, 2.8F, 0.0F, 0.0F, 1, 6, 3, -0.002F, false));

		gun84_r1 = new ModelRenderer(this);
		gun84_r1.setRotationPoint(-1.5F, -6.5F, -44.0F);
		gun.addChild(gun84_r1);
		setRotationAngle(gun84_r1, 0.0F, 0.0F, -2.1192F);
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 0, 116, -3.0F, 0.0F, 0.0F, 3, 2, 87, -0.002F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 47, 17, -2.0F, 0.0F, -15.0F, 1, 2, 1, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 47, 0, -2.0F, 0.0F, -3.0F, 1, 2, 1, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 16, 39, -2.0F, 0.0F, -6.0F, 1, 2, 1, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 16, 36, -2.0F, 0.0F, -9.0F, 1, 2, 1, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 16, 33, -2.0F, 0.0F, -12.0F, 1, 2, 1, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 16, 30, -2.0F, 0.0F, -18.0F, 1, 2, 1, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 52, 77, -3.0F, 0.0F, -23.0F, 1, 2, 23, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 26, 0, -2.0F, 0.0F, -21.0F, 1, 2, 1, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 0, 76, -1.0F, 0.0F, -23.0F, 1, 2, 23, 0.0F, false));

		gun83_r1 = new ModelRenderer(this);
		gun83_r1.setRotationPoint(5.5F, -6.5F, -44.0F);
		gun.addChild(gun83_r1);
		setRotationAngle(gun83_r1, 0.0F, 0.0F, 2.1192F);
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 123, 0, 0.0F, 0.0F, 0.0F, 3, 2, 87, -0.002F, false));
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 123, 89, 2.0F, 0.0F, -23.0F, 1, 2, 23, 0.0F, false));
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 47, 25, 1.0F, 0.0F, -3.0F, 1, 2, 1, 0.0F, false));
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 47, 29, 1.0F, 0.0F, -6.0F, 1, 2, 1, 0.0F, false));
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 59, 9, 1.0F, 0.0F, -9.0F, 1, 2, 1, 0.0F, false));
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 59, 15, 1.0F, 0.0F, -12.0F, 1, 2, 1, 0.0F, false));
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 60, 61, 1.0F, 0.0F, -15.0F, 1, 2, 1, 0.0F, false));
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 66, 52, 1.0F, 0.0F, -18.0F, 1, 2, 1, 0.0F, false));
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 60, 66, 1.0F, 0.0F, -21.0F, 1, 2, 1, 0.0F, false));
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 34, 157, 0.0F, 0.0F, -23.0F, 1, 2, 23, 0.0F, false));
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 27, 68, 0.0F, 0.0F, -28.0F, 3, 2, 5, -0.002F, false));

		gun73_r1 = new ModelRenderer(this);
		gun73_r1.setRotationPoint(0.0F, -10.0F, -47.0F);
		gun.addChild(gun73_r1);
		setRotationAngle(gun73_r1, 0.0F, 0.0F, -1.041F);
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 100, 87, -2.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 100, 85, -2.0F, 0.0F, -3.0F, 1, 1, 1, 0.0F, false));
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 100, 83, -2.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, false));
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 59, 25, -3.0F, 0.0F, -20.0F, 1, 2, 23, 0.0F, false));
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 0, 116, -3.0F, 0.0F, 3.0F, 3, 2, 17, 0.0F, false));
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 60, 59, -3.0F, 0.0F, -25.0F, 3, 2, 5, -0.002F, false));
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 100, 81, -2.0F, 0.0F, -18.0F, 1, 1, 1, 0.0F, false));
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 100, 79, -2.0F, 0.0F, -15.0F, 1, 1, 1, 0.0F, false));
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 100, 77, -2.0F, 0.0F, -12.0F, 1, 1, 1, 0.0F, false));
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 100, 72, -2.0F, 0.0F, -9.0F, 1, 1, 1, 0.0F, false));
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 59, 0, -1.0F, 0.0F, -20.0F, 1, 2, 23, 0.0F, false));

		gun72_r1 = new ModelRenderer(this);
		gun72_r1.setRotationPoint(4.0F, -10.0F, -47.0F);
		gun.addChild(gun72_r1);
		setRotationAngle(gun72_r1, 0.0F, 0.0F, 1.041F);
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 101, 29, 1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 101, 31, 1.0F, 0.0F, -3.0F, 1, 1, 1, 0.0F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 101, 33, 1.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 101, 35, 1.0F, 0.0F, -9.0F, 1, 1, 1, 0.0F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 101, 40, 1.0F, 0.0F, -12.0F, 1, 1, 1, 0.0F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 101, 42, 1.0F, 0.0F, -15.0F, 1, 1, 1, 0.0F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 102, 1, 1.0F, 0.0F, -18.0F, 1, 1, 1, 0.0F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 93, 118, 0.0F, 0.0F, 3.0F, 3, 2, 87, 0.0F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 127, 157, 2.0F, 0.0F, -20.0F, 1, 2, 23, 0.0F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 171, 89, 0.0F, 0.0F, -20.0F, 1, 2, 23, 0.0F, false));
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 60, 66, 0.0F, 0.0F, -25.0F, 3, 2, 5, -0.002F, false));

		gun64_r1 = new ModelRenderer(this);
		gun64_r1.setRotationPoint(-0.5F, -4.7F, -30.1F);
		gun.addChild(gun64_r1);
		setRotationAngle(gun64_r1, 0.0F, 0.0F, -2.1564F);
		gun64_r1.cubeList.add(new ModelBox(gun64_r1, 0, 52, 0.0F, 0.0F, 0.0F, 2, 1, 23, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-1.5F, -6.5F, -72.0F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, 0.0F, 0.0F, -0.5577F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 52, 77, 0.0F, 0.0F, 0.0F, 2, 3, 5, -0.002F, false));

		gun69_r1 = new ModelRenderer(this);
		gun69_r1.setRotationPoint(1.25F, -11.8F, -8.0F);
		gun.addChild(gun69_r1);
		setRotationAngle(gun69_r1, 0.0F, 0.0F, 1.2043F);
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 34, 84, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 35, 80, 0.0F, 0.0F, 2.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 25, 80, 0.0F, 0.0F, 4.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 25, 78, 0.0F, 0.0F, 6.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 77, 77, 0.0F, 0.0F, 8.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 72, 52, 0.0F, 0.0F, 10.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 71, 69, 0.0F, 0.0F, 12.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 92, 4, 0.0F, 0.0F, -16.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 3, 90, 0.0F, 0.0F, -14.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 85, 89, 0.0F, 0.0F, -12.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 88, 63, 0.0F, 0.0F, -10.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 18, 88, 0.0F, 0.0F, -8.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 18, 86, 0.0F, 0.0F, -6.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 12, 86, 0.0F, 0.0F, -4.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 77, 84, 0.0F, 0.0F, -2.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 95, 18, 0.0F, 0.0F, -32.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 25, 94, 0.0F, 0.0F, -30.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 17, 94, 0.0F, 0.0F, -28.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 81, 93, 0.0F, 0.0F, -26.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 77, 93, 0.0F, 0.0F, -24.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 92, 30, 0.0F, 0.0F, -22.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 29, 92, 0.0F, 0.0F, -20.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 13, 92, 0.0F, 0.0F, -18.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 0, 97, 0.0F, 0.0F, -48.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 25, 96, 0.0F, 0.0F, -46.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 17, 96, 0.0F, 0.0F, -44.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 81, 95, 0.0F, 0.0F, -42.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 77, 95, 0.0F, 0.0F, -40.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 64, 97, 0.0F, 0.0F, -50.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 85, 97, 0.0F, 0.0F, -52.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 98, 21, 0.0F, 0.0F, -54.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 96, 98, 0.0F, 0.0F, -56.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 99, 6, 0.0F, 0.0F, -58.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 99, 52, 0.0F, 0.0F, -60.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 99, 60, 0.0F, 0.0F, -62.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 99, 95, 0.0F, 0.0F, -64.0F, 1, 1, 1, -0.002F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 0, 205, 0.0F, 0.2F, -63.2F, 1, 1, 76, -0.2F, false));

		gun68_r1 = new ModelRenderer(this);
		gun68_r1.setRotationPoint(2.75F, -11.8F, -8.0F);
		gun.addChild(gun68_r1);
		setRotationAngle(gun68_r1, 0.0F, 0.0F, -1.2043F);
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 80, 72, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 80, 70, -1.0F, 0.0F, 2.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 52, 79, -1.0F, 0.0F, 4.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 46, 79, -1.0F, 0.0F, 6.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 77, 19, -1.0F, 0.0F, 8.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 77, 17, -1.0F, 0.0F, 10.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 14, 60, -1.0F, 0.0F, 12.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 92, 0, -1.0F, 0.0F, -16.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 6, 91, -1.0F, 0.0F, -14.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 89, 25, -1.0F, 0.0F, -12.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 0, 89, -1.0F, 0.0F, -10.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 87, 52, -1.0F, 0.0F, -8.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 86, 85, -1.0F, 0.0F, -6.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 85, 77, -1.0F, 0.0F, -4.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 41, 84, -1.0F, 0.0F, -2.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 94, 74, -1.0F, 0.0F, -32.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 94, 44, -1.0F, 0.0F, -30.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 3, 94, -1.0F, 0.0F, -28.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 93, 93, -1.0F, 0.0F, -26.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 6, 93, -1.0F, 0.0F, -24.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 0, 93, -1.0F, 0.0F, -22.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 25, 92, -1.0F, 0.0F, -20.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 92, 6, -1.0F, 0.0F, -18.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 71, 96, -1.0F, 0.0F, -48.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 96, 46, -1.0F, 0.0F, -46.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 3, 96, -1.0F, 0.0F, -44.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 93, 95, -1.0F, 0.0F, -42.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 95, 40, -1.0F, 0.0F, -40.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 6, 97, -1.0F, 0.0F, -50.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 77, 97, -1.0F, 0.0F, -52.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 93, 97, -1.0F, 0.0F, -54.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 71, 98, -1.0F, 0.0F, -56.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 99, 2, -1.0F, 0.0F, -58.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 99, 10, -1.0F, 0.0F, -60.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 99, 56, -1.0F, 0.0F, -62.0F, 1, 1, 1, -0.003F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 78, 207, -1.0F, 0.2F, -63.2F, 1, 1, 76, -0.2F, false));
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 99, 97, -1.0F, 0.0F, -64.0F, 1, 1, 1, -0.003F, false));

		gun61_r1 = new ModelRenderer(this);
		gun61_r1.setRotationPoint(4.5F, -4.7F, -30.1F);
		gun.addChild(gun61_r1);
		setRotationAngle(gun61_r1, 0.0F, 0.0F, -2.6025F);
		gun61_r1.cubeList.add(new ModelBox(gun61_r1, 186, 116, 0.0F, 0.0F, 0.0F, 1, 2, 23, 0.0F, false));

		gun50_r1 = new ModelRenderer(this);
		gun50_r1.setRotationPoint(-0.5F, -4.0F, -30.1F);
		gun.addChild(gun50_r1);
		setRotationAngle(gun50_r1, 0.5577F, 0.0F, 0.0F);
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 59, 35, 0.0F, 0.0F, 0.0F, 5, 6, 3, 0.0F, false));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(4.1F, -1.0F, 1.5F);
		gun.addChild(gun40_r1);
		setRotationAngle(gun40_r1, 0.576F, 0.0F, 0.0F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 0, 52, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(4.5F, 1.0F, -27.1F);
		gun.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -0.1571F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 186, 141, -5.0F, -2.0F, 0.0F, 5, 2, 19, -0.002F, false));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(2.7F, 0.0F, -27.1F);
		gun.addChild(gun26_r1);
		setRotationAngle(gun26_r1, -0.1859F, 0.0F, 0.0F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 135, 116, 0.0F, 0.0F, 0.0F, 2, 1, 19, 0.0F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 148, 89, -3.4F, 0.0F, 0.0F, 4, 1, 19, 0.0F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(1.0F, 0.5F, -1.5F);
		gun.addChild(gun23_r1);
		setRotationAngle(gun23_r1, 0.7854F, 0.0F, 0.0F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 59, 5, 0.0F, 0.0F, 0.0F, 2, 2, 1, -0.001F, false));

		gun20_r1 = new ModelRenderer(this);
		gun20_r1.setRotationPoint(1.5F, 1.0F, -3.35F);
		gun.addChild(gun20_r1);
		setRotationAngle(gun20_r1, 0.2602F, 0.0F, 0.0F);
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 0, 25, 0.0F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun18_r1 = new ModelRenderer(this);
		gun18_r1.setRotationPoint(1.5F, 1.5F, -2.0F);
		gun.addChild(gun18_r1);
		setRotationAngle(gun18_r1, -1.8589F, 0.0F, 0.0F);
		gun18_r1.cubeList.add(new ModelBox(gun18_r1, 70, 17, 0.0F, 0.0F, -2.0F, 1, 1, 5, 0.001F, false));

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(1.0F, 6.45F, -3.2F);
		gun.addChild(gun14_r1);
		setRotationAngle(gun14_r1, 2.7884F, 0.0F, 0.0F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 25, 76, 0.0F, 0.05F, 0.1F, 2, 1, 6, 0.002F, false));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(1.0F, 5.0F, 0.5F);
		gun.addChild(gun13_r1);
		setRotationAngle(gun13_r1, -2.7884F, 0.0F, 0.0F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 12, 19, 0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

		barrel = new QRenderer(this);
		barrel.setRotationPoint(-2.0F, -15.5F, -128.0F);
		barrel.cubeList.add(new ModelBox(barrel, 30, 25, 0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 84, 9, -1.0F, 1.0F, -0.1F, 3, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 123, 41, -0.9F, 1.0F, 3.0F, 1, 1, 40, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 123, 0, 0.9F, 1.0F, 3.0F, 1, 1, 40, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 30, 34, -1.0F, 1.0F, 43.0F, 3, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 93, 116, 0.0F, 0.1F, 3.0F, 1, 1, 40, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 59, 25, 0.0F, 0.0F, 43.0F, 1, 3, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 116, 0.0F, 1.9F, 3.0F, 1, 1, 40, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 71, 66, -0.2F, -0.3F, -7.0F, 1, 2, 1, 0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 71, 61, 0.2F, 1.3F, -7.0F, 1, 2, 1, -0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 38, 69, -2.0F, -0.3F, -6.0F, 5, 3, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 26, 16, -2.0F, 2.3F, -6.0F, 5, 1, 6, -0.002F, false));
		barrel.cubeList.add(new ModelBox(barrel, 59, 9, -2.0F, -0.3F, -5.0F, 5, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 20, 19, -2.0F, -0.3F, -0.5F, 1, 3, 1, -0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 20, 15, 2.0F, -0.3F, -0.5F, 1, 3, 1, -0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 71, 58, -0.2F, 1.3F, -7.0F, 1, 2, 1, 0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 70, 44, 0.2F, -0.3F, -7.0F, 1, 2, 1, -0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 101, 18, -2.0F, 2.3F, -0.5F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 100, 99, 2.0F, 2.3F, -0.5F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 70, 17, 2.0F, 0.7F, -3.0F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 27, 68, -2.0F, 0.7F, -3.0F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 52, 52, -0.5F, 0.5F, -7.2F, 2, 2, 1, 0.0F, false));

		gun198_r1 = new ModelRenderer(this);
		gun198_r1.setRotationPoint(-2.0F, -0.3F, -6.0F);
		barrel.addChild(gun198_r1);
		setRotationAngle(gun198_r1, 0.0F, 2.082F, 0.0F);
		gun198_r1.cubeList.add(new ModelBox(gun198_r1, 26, 16, -1.0F, 0.0F, 0.0F, 1, 3, 2, -0.002F, false));
		gun198_r1.cubeList.add(new ModelBox(gun198_r1, 52, 55, -1.0F, 2.6F, 0.0F, 1, 1, 2, 0.0F, false));

		gun198_r2 = new ModelRenderer(this);
		gun198_r2.setRotationPoint(3.0F, -0.3F, -6.0F);
		barrel.addChild(gun198_r2);
		setRotationAngle(gun198_r2, 0.0F, -2.082F, 0.0F);
		gun198_r2.cubeList.add(new ModelBox(gun198_r2, 0, 56, 0.0F, 2.6F, 0.0F, 1, 1, 2, 0.0F, false));
		gun198_r2.cubeList.add(new ModelBox(gun198_r2, 30, 34, 0.0F, 0.0F, 0.0F, 1, 3, 2, -0.002F, false));

		gun178_r1 = new ModelRenderer(this);
		gun178_r1.setRotationPoint(1.0F, 3.0F, 0.0F);
		barrel.addChild(gun178_r1);
		setRotationAngle(gun178_r1, 0.0F, 0.0F, -0.7854F);
		gun178_r1.cubeList.add(new ModelBox(gun178_r1, 234, 248, 0.4F, -1.0F, 0.0F, 1, 1, 50, 0.0F, false));
		gun178_r1.cubeList.add(new ModelBox(gun178_r1, 182, 247, 0.0F, -1.0F, 0.0F, 1, 1, 50, 0.0F, false));

		gun178_r2 = new ModelRenderer(this);
		gun178_r2.setRotationPoint(0.0F, 3.0F, 0.0F);
		barrel.addChild(gun178_r2);
		setRotationAngle(gun178_r2, 0.0F, 0.0F, 0.7854F);
		gun178_r2.cubeList.add(new ModelBox(gun178_r2, 216, 0, -1.0F, -1.0F, 0.0F, 1, 1, 50, 0.0F, false));
		gun178_r2.cubeList.add(new ModelBox(gun178_r2, 0, 52, -1.4F, -1.0F, 0.0F, 1, 1, 50, 0.0F, false));

		gun177_r1 = new ModelRenderer(this);
		gun177_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel.addChild(gun177_r1);
		setRotationAngle(gun177_r1, 0.0F, 0.0F, -0.7854F);
		gun177_r1.cubeList.add(new ModelBox(gun177_r1, 267, 102, -1.0F, 0.0F, 0.0F, 1, 1, 50, 0.0F, false));
		gun177_r1.cubeList.add(new ModelBox(gun177_r1, 267, 51, -1.4F, 0.0F, 0.0F, 1, 1, 50, 0.0F, false));

		gun177_r2 = new ModelRenderer(this);
		gun177_r2.setRotationPoint(1.0F, 0.0F, 0.0F);
		barrel.addChild(gun177_r2);
		setRotationAngle(gun177_r2, 0.0F, 0.0F, 0.7854F);
		gun177_r2.cubeList.add(new ModelBox(gun177_r2, 275, 168, 0.4F, 0.0F, 0.0F, 1, 1, 50, 0.0F, false));
		gun177_r2.cubeList.add(new ModelBox(gun177_r2, 0, 282, 0.0F, 0.0F, 0.0F, 1, 1, 50, 0.0F, false));

		action = new QRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 0, 157, -4.8F, -38.5F, -33.0F, 1, 1, 32, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 59, 18, -4.9F, -38.5F, -8.0F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 59, 12, -4.9F, -38.5F, -6.0F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 47, 22, -4.9F, -38.5F, -4.0F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 0, 28, -4.9F, -38.5F, -2.0F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 30, 31, -7.3F, -38.5F, -33.0F, 3, 1, 1, 0.0F, false));

		action10_r1 = new ModelRenderer(this);
		action10_r1.setRotationPoint(-7.3F, -37.5F, -33.0F);
		action.addChild(action10_r1);
		setRotationAngle(action10_r1, 1.9333F, 0.0F, 0.0F);
		action10_r1.cubeList.add(new ModelBox(action10_r1, 44, 52, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.001F, false));

		action2_r1 = new ModelRenderer(this);
		action2_r1.setRotationPoint(-4.8F, -38.5F, -33.0F);
		action.addChild(action2_r1);
		setRotationAngle(action2_r1, 0.0F, 0.0F, -1.041F);
		action2_r1.cubeList.add(new ModelBox(action2_r1, 52, 52, 0.0F, 0.0F, 0.0F, 2, 1, 24, 0.0F, false));

		action14_r1 = new ModelRenderer(this);
		action14_r1.setRotationPoint(-9.3F, -39.0F, -33.55F);
		action.addChild(action14_r1);
		setRotationAngle(action14_r1, 1.9333F, 0.0F, 0.0F);
		action14_r1.cubeList.add(new ModelBox(action14_r1, 43, 38, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		mag = new QRenderer(this);
		mag.setRotationPoint(0.5F, 5.0F, -31.0F);
		mag.cubeList.add(new ModelBox(mag, 26, 0, -4.0F, -12.0F, 0.0F, 4, 12, 4, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 43, 84, -4.15F, -11.8F, 1.0F, 1, 12, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 37, 84, -0.85F, -11.8F, 1.0F, 1, 12, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 42, 0, -0.85F, -11.9F, 10.5F, 1, 14, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 39, 52, -4.15F, -11.9F, 10.5F, 1, 14, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -4.0F, -12.0F, 9.0F, 4, 13, 6, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 25, -3.5F, -12.0F, 4.0F, 3, 12, 5, 0.002F, false));
		mag.cubeList.add(new ModelBox(mag, 52, 52, -4.0F, 0.8F, 9.0F, 4, 1, 6, -0.001F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 42, -4.0F, 1.7F, 13.0F, 4, 1, 2, -0.002F, false));
		mag.cubeList.add(new ModelBox(mag, 66, 77, -3.5F, -12.0F, -0.25F, 3, 12, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.5F, 0.2F, 4.3F);
		mag.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2269F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 59, 15, -3.0F, -2.0F, 0.0F, 3, 2, 5, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-4.0F, 1.0F, 9.0F);
		mag.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.2618F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 60, 0.0F, -13.0F, -2.0F, 1, 13, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 1.0F, 9.0F);
		mag.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.2618F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 75, 32, -1.0F, -13.0F, -2.0F, 1, 13, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.0F, -12.0F, 9.0F);
		mag.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.5061F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 68, 25, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.002F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.0F, -12.0F, 9.0F);
		mag.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1376F, -0.2448F, 0.4986F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 0, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.002F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -12.0F, 9.0F);
		mag.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1376F, 0.2448F, -0.4986F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 52, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.002F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -12.0F, 9.0F);
		mag.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.5061F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 35, 77, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.002F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-4.0F, 0.0F, 4.0F);
		mag.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.2269F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 52, 59, 0.0F, -12.0F, 0.0F, 1, 12, 3, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 17, 0.0F, -0.5F, 0.0F, 1, 1, 3, 0.002F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.5F, 4.0F);
		mag.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -0.2269F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 25, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.002F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 60, -1.0F, -12.5F, 0.0F, 1, 12, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.2094F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 77, 77, -4.0F, -1.0F, 0.0F, 4, 1, 15, 0.002F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
