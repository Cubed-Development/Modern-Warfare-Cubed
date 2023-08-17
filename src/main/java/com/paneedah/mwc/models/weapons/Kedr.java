package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Kedr extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun2_r1;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun10_r1;
	private final ModelRenderer gun19_r1;
	private final ModelRenderer gun34_r1;
	private final ModelRenderer gun36_r1;
	private final ModelRenderer gun35_r1;
	private final ModelRenderer gun37_r1;
	private final ModelRenderer gun41_r1;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun38_r1;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun38_r2;
	private final ModelRenderer gun37_r2;
	private final ModelRenderer gun40_r2;
	private final ModelRenderer gun39_r2;
	private final ModelRenderer gun36_r2;
	private final ModelRenderer gun40_r3;
	private final ModelRenderer gun40_r4;
	private final ModelRenderer gun40_r5;
	private final ModelRenderer gun41_r2;
	private final ModelRenderer gun51_r1;
	private final ModelRenderer gun51_r2;
	private final ModelRenderer gun54_r1;
	private final ModelRenderer gun61_r1;
	private final ModelRenderer gun62_r1;
	private final ModelRenderer gun61_r2;
	private final ModelRenderer gun60_r1;
	private final ModelRenderer gun59_r1;
	private final ModelRenderer gun64_r1;
	private final ModelRenderer gun67_r1;
	private final ModelRenderer gun67_r2;
	private final ModelRenderer gun65_r1;
	private final ModelRenderer gun65_r2;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun65_r3;
	private final ModelRenderer gun64_r2;
	private final ModelRenderer gun62_r2;
	private final ModelRenderer gun61_r3;
	private final ModelRenderer gun75_r1;
	private final ModelRenderer gun74_r1;
	private final ModelRenderer gun86_r1;
	private final ModelRenderer gun87_r1;
	private final ModelRenderer gun88_r1;
	private final ModelRenderer gun96_r1;
	private final ModelRenderer gun98_r1;
	private final ModelRenderer gun97_r1;
	private final ModelRenderer grip;
	private final ModelRenderer gun9_r2;
	private final ModelRenderer gun20_r1;
	private final ModelRenderer gun37_r3;
	private final ModelRenderer gun22_r1;
	private final ModelRenderer gun17_r1;
	private final ModelRenderer gun63_r2;
	private final ModelRenderer gun21_r1;

	public Kedr() {
		textureWidth = 180;
		textureHeight = 180;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 17, 12, -3.501F, -31.4F, -13.0F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 11, 80, 0.3F, -35.501F, -15.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 28, -0.7F, -35.801F, 4.202F, 2, 4, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 16, -4.299F, -35.801F, 4.201F, 1, 4, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 21, 28, 0.101F, -36.5F, 0.001F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 68, -4.101F, -35.5F, -27.001F, 1, 1, 32, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 16, 0.101F, -36.5F, -27.002F, 1, 2, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 51, -4.198F, -34.45F, -10.001F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 34, 70, -4.1F, -37.0F, -12.002F, 1, 2, 17, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 13, 48, -4.1F, -37.0F, -27.002F, 1, 2, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 70, 0.1F, -37.0F, -27.001F, 1, 1, 32, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 81, -1.7F, -37.6F, -28.7F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 0, -0.6F, -37.701F, -27.001F, 1, 2, 32, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 134, -3.901F, -35.0F, -27.0F, 4, 3, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 70, -3.901F, -36.0F, -12.0F, 4, 4, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 16, -0.901F, -36.0F, -6.0F, 1, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 53, -3.901F, -36.0F, -1.0F, 4, 4, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 14, 70, -3.0F, -36.1F, -27.501F, 3, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 22, 70, -2.7F, -36.3F, -27.499F, 3, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 34, -3.0F, -36.6F, -27.499F, 3, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 33, -1.3F, -35.35F, -40.0F, 1, 1, 30, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, 0.3F, -36.501F, -14.5F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 35, -3.101F, -31.4F, -11.0F, 4, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 0, -0.301F, -33.2F, -3.25F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 42, -3.701F, -33.2F, -3.25F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 70, -3.95F, -32.65F, -2.75F, 1, 1, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 68, -0.05F, -32.65F, -2.75F, 1, 1, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 35, -3.101F, -32.4F, -11.0F, 4, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 34, -3.902F, -32.4F, -11.0F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 30, -3.102F, -33.9F, -4.0F, 4, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 16, -3.902F, -33.9F, -4.0F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 53, -3.101F, -33.4F, -1.5F, 4, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 64, 21, -3.903F, -33.4F, -1.5F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 64, 28, -0.351F, -32.4F, -1.0F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 10, -3.651F, -32.4F, -1.0F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 132, -3.4F, -37.7F, -11.999F, 3, 2, 17, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 57, 77, -2.5F, -38.5F, -2.599F, 2, 1, 4, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 44, -2.5F, -39.4F, 4.301F, 1, 2, 1, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 0, -2.4F, -39.401F, 4.302F, 1, 2, 1, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 35, -2.0F, -39.301F, -28.298F, 1, 2, 1, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 35, -1.5F, -39.4F, 4.301F, 1, 2, 1, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 6, 35, -1.6F, -39.401F, 4.302F, 1, 2, 1, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 64, -2.501F, -39.1F, 4.3F, 2, 2, 1, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 3, -2.62F, -38.9F, -2.499F, 1, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 41, 63, -2.82F, -39.3F, -29.099F, 1, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 50, 17, -2.82F, -38.9F, -29.099F, 1, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 61, -1.18F, -39.3F, -29.099F, 1, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 49, -1.18F, -38.9F, -29.099F, 1, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 0, -1.38F, -38.9F, -2.499F, 1, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 23, -2.5F, -38.2F, 0.801F, 2, 1, 4, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 25, -2.0F, -38.1F, 1.201F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 21, 59, -2.0F, -38.1F, -1.999F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 21, -3.4F, -37.7F, -27.0F, 3, 2, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 126, -3.099F, -34.0F, -27.002F, 4, 2, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 57, 72, -0.199F, -30.5F, -14.002F, 1, 1, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 57, 70, 0.301F, -36.0F, 3.898F, 1, 1, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 43, -4.301F, -36.0F, 3.898F, 1, 1, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 50, 12, -3.899F, -34.0F, -6.002F, 1, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 14, 61, -3.099F, -34.0F, -1.002F, 4, 2, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 74, 128, -3.1F, -34.5F, -27.001F, 4, 1, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 12, -3.9F, -34.5F, -6.001F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 44, -3.1F, -34.5F, -3.001F, 4, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 50, 12, -3.9F, -34.5F, -3.001F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 46, -3.899F, -31.401F, -11.0F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 0, -3.499F, -32.2F, -19.3F, 4, 4, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 38, -3.3F, -36.3F, -27.5F, 3, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 64, -2.7F, -35.35F, -40.0F, 1, 1, 30, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 81, -2.3F, -37.6F, -28.7F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 106, 95, -2.0F, -36.1F, -40.0F, 1, 1, 30, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 2, -2.0F, -34.6F, -40.0F, 1, 1, 30, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 0, -2.5F, -35.85F, -40.001F, 2, 2, 30, 0.0F, false));

		gun2_r1 = new ModelRenderer(this);
		gun2_r1.setRotationPoint(-2.5F, -27.0F, -12.5F);
		gun.addChild(gun2_r1);
		setRotationAngle(gun2_r1, -0.0288F, 0.0F, 0.0F);
		gun2_r1.cubeList.add(new ModelBox(gun2_r1, 70, 51, 0.0F, 0.0F, -0.1F, 2, 1, 7, 0.0F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(-2.5F, -31.4F, -14.1F);
		gun.addChild(gun3_r1);
		setRotationAngle(gun3_r1, -0.2231F, 0.0F, 0.0F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 14, 81, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-2.5F, -29.1F, -13.7F);
		gun.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 0.3301F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 0, 70, -0.001F, 0.2F, 0.0F, 2, 3, 1, 0.0F, false));

		gun10_r1 = new ModelRenderer(this);
		gun10_r1.setRotationPoint(-3.5F, -32.1F, -19.5F);
		gun.addChild(gun10_r1);
		setRotationAngle(gun10_r1, -1.2485F, 0.0F, 0.0F);
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 72, 75, 0.0F, -1.0F, -1.3F, 4, 2, 5, 0.0F, false));

		gun19_r1 = new ModelRenderer(this);
		gun19_r1.setRotationPoint(-3.5F, -34.0F, -26.0F);
		gun.addChild(gun19_r1);
		setRotationAngle(gun19_r1, -0.1784F, 0.0F, 0.0F);
		gun19_r1.cubeList.add(new ModelBox(gun19_r1, 70, 20, 0.001F, 0.0F, 0.0F, 4, 2, 6, 0.0F, false));

		gun34_r1 = new ModelRenderer(this);
		gun34_r1.setRotationPoint(0.801F, -29.5F, -14.602F);
		gun.addChild(gun34_r1);
		setRotationAngle(gun34_r1, 0.0F, 0.0873F, 0.0F);
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 70, 65, -1.0F, -1.001F, 0.0F, 1, 1, 1, -0.1F, false));

		gun36_r1 = new ModelRenderer(this);
		gun36_r1.setRotationPoint(-4.301F, -34.7F, 3.898F);
		gun.addChild(gun36_r1);
		setRotationAngle(gun36_r1, 0.0F, 0.0F, -0.1222F);
		gun36_r1.cubeList.add(new ModelBox(gun36_r1, 70, 28, 0.0F, -1.0F, 0.001F, 1, 1, 1, -0.1F, false));

		gun35_r1 = new ModelRenderer(this);
		gun35_r1.setRotationPoint(1.301F, -34.7F, 3.898F);
		gun.addChild(gun35_r1);
		setRotationAngle(gun35_r1, 0.0F, 0.0F, 0.1222F);
		gun35_r1.cubeList.add(new ModelBox(gun35_r1, 70, 45, -1.0F, -1.0F, 0.001F, 1, 1, 1, -0.1F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-2.1F, -38.1F, 1.001F);
		gun.addChild(gun37_r1);
		setRotationAngle(gun37_r1, 0.6458F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 70, 23, -0.401F, -0.4F, -0.6F, 2, 2, 1, -0.4F, false));

		gun41_r1 = new ModelRenderer(this);
		gun41_r1.setRotationPoint(-0.48F, -39.0F, -28.799F);
		gun.addChild(gun41_r1);
		setRotationAngle(gun41_r1, 0.0F, 0.0F, 1.2566F);
		gun41_r1.cubeList.add(new ModelBox(gun41_r1, 60, 29, -0.7F, -0.3F, -0.301F, 1, 1, 2, -0.3F, false));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(-2.52F, -39.0F, -28.799F);
		gun.addChild(gun40_r1);
		setRotationAngle(gun40_r1, 0.0F, 0.0F, -1.2566F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 61, 46, -0.3F, -0.3F, -0.301F, 1, 1, 2, -0.3F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(-0.68F, -38.2F, -2.199F);
		gun.addChild(gun38_r1);
		setRotationAngle(gun38_r1, 0.0F, 0.0F, 0.576F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 59, 64, -0.7F, -0.3F, -0.301F, 1, 1, 2, -0.3F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(-0.48F, -38.2F, -28.799F);
		gun.addChild(gun39_r1);
		setRotationAngle(gun39_r1, 0.0F, 0.0F, 0.9076F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 0, 57, -0.7F, -0.3F, -0.301F, 1, 2, 2, -0.3F, false));

		gun38_r2 = new ModelRenderer(this);
		gun38_r2.setRotationPoint(-2.52F, -38.2F, -28.799F);
		gun.addChild(gun38_r2);
		setRotationAngle(gun38_r2, 0.0F, 0.0F, -0.9076F);
		gun38_r2.cubeList.add(new ModelBox(gun38_r2, 13, 59, -0.3F, -0.3F, -0.301F, 1, 2, 2, -0.3F, false));

		gun37_r2 = new ModelRenderer(this);
		gun37_r2.setRotationPoint(-2.32F, -38.2F, -2.199F);
		gun.addChild(gun37_r2);
		setRotationAngle(gun37_r2, 0.0F, 0.0F, -0.576F);
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 70, 20, -0.3F, -0.3F, -0.301F, 1, 1, 2, -0.3F, false));

		gun40_r2 = new ModelRenderer(this);
		gun40_r2.setRotationPoint(-1.2F, -38.9F, 4.901F);
		gun.addChild(gun40_r2);
		setRotationAngle(gun40_r2, 0.0F, 0.0F, -1.0297F);
		gun40_r2.cubeList.add(new ModelBox(gun40_r2, 27, 12, -1.6F, -0.401F, -0.602F, 2, 1, 1, -0.4F, false));

		gun39_r2 = new ModelRenderer(this);
		gun39_r2.setRotationPoint(-1.8F, -38.9F, 4.901F);
		gun.addChild(gun39_r2);
		setRotationAngle(gun39_r2, 0.0F, 0.0F, 1.0297F);
		gun39_r2.cubeList.add(new ModelBox(gun39_r2, 36, 57, -0.4F, -0.401F, -0.602F, 2, 1, 1, -0.4F, false));

		gun36_r2 = new ModelRenderer(this);
		gun36_r2.setRotationPoint(-3.5F, -32.0F, -20.3F);
		gun.addChild(gun36_r2);
		setRotationAngle(gun36_r2, -0.7947F, 0.0F, 0.0F);
		gun36_r2.cubeList.add(new ModelBox(gun36_r2, 11, 30, -0.001F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun40_r3 = new ModelRenderer(this);
		gun40_r3.setRotationPoint(-1.901F, -30.4F, -11.0F);
		gun.addChild(gun40_r3);
		setRotationAngle(gun40_r3, -0.3665F, 0.0F, 0.0F);
		gun40_r3.cubeList.add(new ModelBox(gun40_r3, 52, 35, -1.999F, -2.0F, -5.0F, 2, 2, 5, 0.0F, false));
		gun40_r3.cubeList.add(new ModelBox(gun40_r3, 52, 44, 0.801F, -2.0F, -5.0F, 2, 2, 5, 0.0F, false));

		gun40_r4 = new ModelRenderer(this);
		gun40_r4.setRotationPoint(-1.901F, -30.4F, -1.0F);
		gun.addChild(gun40_r4);
		setRotationAngle(gun40_r4, 0.8901F, 0.0F, 0.0F);
		gun40_r4.cubeList.add(new ModelBox(gun40_r4, 0, 40, -1.997F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));
		gun40_r4.cubeList.add(new ModelBox(gun40_r4, 18, 40, 0.799F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

		gun40_r5 = new ModelRenderer(this);
		gun40_r5.setRotationPoint(-2.651F, -30.4F, 0.0F);
		gun.addChild(gun40_r5);
		setRotationAngle(gun40_r5, 0.3316F, 0.0F, 0.0F);
		gun40_r5.cubeList.add(new ModelBox(gun40_r5, 72, 68, -1.001F, -2.001F, 0.0F, 4, 2, 5, 0.0F, false));
		gun40_r5.cubeList.add(new ModelBox(gun40_r5, 57, 70, 2.299F, -2.0F, 0.0F, 1, 2, 5, 0.0F, false));

		gun41_r2 = new ModelRenderer(this);
		gun41_r2.setRotationPoint(1.3F, -36.5F, -14.5F);
		gun.addChild(gun41_r2);
		setRotationAngle(gun41_r2, 0.7854F, 0.0F, 0.0F);
		gun41_r2.cubeList.add(new ModelBox(gun41_r2, 78, 65, -0.998F, -0.001F, -1.4F, 1, 1, 1, 0.0F, false));
		gun41_r2.cubeList.add(new ModelBox(gun41_r2, 57, 79, -0.999F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun51_r1 = new ModelRenderer(this);
		gun51_r1.setRotationPoint(0.4F, -37.7F, -27.0F);
		gun.addChild(gun51_r1);
		setRotationAngle(gun51_r1, 0.0F, 0.0F, 0.7854F);
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 36, 35, 0.0F, 0.0F, 0.0F, 1, 1, 32, 0.0F, false));

		gun51_r2 = new ModelRenderer(this);
		gun51_r2.setRotationPoint(-3.4F, -37.7F, -27.0F);
		gun.addChild(gun51_r2);
		setRotationAngle(gun51_r2, 0.0F, 0.0F, 0.7854F);
		gun51_r2.cubeList.add(new ModelBox(gun51_r2, 47, 54, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));
		gun51_r2.cubeList.add(new ModelBox(gun51_r2, 68, 101, 0.0F, 0.0F, 15.0F, 1, 1, 17, 0.0F, false));

		gun54_r1 = new ModelRenderer(this);
		gun54_r1.setRotationPoint(-2.0F, -37.8F, -28.8F);
		gun.addChild(gun54_r1);
		setRotationAngle(gun54_r1, -0.0873F, 0.0F, 0.0F);
		gun54_r1.cubeList.add(new ModelBox(gun54_r1, 51, 21, -0.001F, -0.5F, 0.0F, 1, 3, 2, 0.0F, false));

		gun61_r1 = new ModelRenderer(this);
		gun61_r1.setRotationPoint(-4.1F, -36.0F, -11.902F);
		gun.addChild(gun61_r1);
		setRotationAngle(gun61_r1, -0.7854F, 0.0F, 0.0F);
		gun61_r1.cubeList.add(new ModelBox(gun61_r1, 28, 65, 0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun62_r1 = new ModelRenderer(this);
		gun62_r1.setRotationPoint(-1.1F, -37.7F, -11.902F);
		gun.addChild(gun62_r1);
		setRotationAngle(gun62_r1, 0.0F, 0.7854F, 0.0F);
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 63, 25, 0.001F, 0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		gun61_r2 = new ModelRenderer(this);
		gun61_r2.setRotationPoint(-1.1F, -37.7F, -18.102F);
		gun.addChild(gun61_r2);
		setRotationAngle(gun61_r2, 0.0F, 0.7854F, 0.0F);
		gun61_r2.cubeList.add(new ModelBox(gun61_r2, 63, 64, 0.001F, 0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		gun60_r1 = new ModelRenderer(this);
		gun60_r1.setRotationPoint(-4.1F, -36.0F, -18.102F);
		gun.addChild(gun60_r1);
		setRotationAngle(gun60_r1, -0.7854F, 0.0F, 0.0F);
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 0, 67, 0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun59_r1 = new ModelRenderer(this);
		gun59_r1.setRotationPoint(-4.8F, -34.3F, -9.002F);
		gun.addChild(gun59_r1);
		setRotationAngle(gun59_r1, 0.0F, 0.0F, 0.1571F);
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 70, 54, 0.0F, -2.0F, 0.0F, 2, 2, 1, -0.3F, false));

		gun64_r1 = new ModelRenderer(this);
		gun64_r1.setRotationPoint(-2.699F, -29.7F, -13.901F);
		gun.addChild(gun64_r1);
		setRotationAngle(gun64_r1, -0.4363F, 0.0F, 0.0F);
		gun64_r1.cubeList.add(new ModelBox(gun64_r1, 70, 13, -1.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun67_r1 = new ModelRenderer(this);
		gun67_r1.setRotationPoint(-4.199F, -31.45F, -10.201F);
		gun.addChild(gun67_r1);
		setRotationAngle(gun67_r1, -0.6807F, 0.0F, 0.0F);
		gun67_r1.cubeList.add(new ModelBox(gun67_r1, 63, 55, -0.001F, -2.0F, -1.5F, 1, 2, 1, 0.0F, false));
		gun67_r1.cubeList.add(new ModelBox(gun67_r1, 0, 23, 0.002F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));

		gun67_r2 = new ModelRenderer(this);
		gun67_r2.setRotationPoint(-4.199F, -34.45F, -8.001F);
		gun.addChild(gun67_r2);
		setRotationAngle(gun67_r2, -0.1745F, 0.0F, 0.0F);
		gun67_r2.cubeList.add(new ModelBox(gun67_r2, 8, 67, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun65_r1 = new ModelRenderer(this);
		gun65_r1.setRotationPoint(-4.199F, -33.25F, -11.601F);
		gun.addChild(gun65_r1);
		setRotationAngle(gun65_r1, -0.925F, 0.0F, 0.0F);
		gun65_r1.cubeList.add(new ModelBox(gun65_r1, 63, 59, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun65_r2 = new ModelRenderer(this);
		gun65_r2.setRotationPoint(-4.299F, -31.5F, -12.501F);
		gun.addChild(gun65_r2);
		setRotationAngle(gun65_r2, -0.4887F, 0.0F, 0.0F);
		gun65_r2.cubeList.add(new ModelBox(gun65_r2, 4, 67, -0.301F, -1.5F, 0.5F, 1, 1, 1, -0.2F, false));
		gun65_r2.cubeList.add(new ModelBox(gun65_r2, 61, 35, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-3.099F, -32.7F, -17.501F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.4363F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 74, 65, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 65, 77, 3.2F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun65_r3 = new ModelRenderer(this);
		gun65_r3.setRotationPoint(-3.099F, -32.4F, 2.999F);
		gun.addChild(gun65_r3);
		setRotationAngle(gun65_r3, -0.4363F, 0.0F, 0.0F);
		gun65_r3.cubeList.add(new ModelBox(gun65_r3, 0, 74, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));
		gun65_r3.cubeList.add(new ModelBox(gun65_r3, 14, 74, 3.2F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun64_r2 = new ModelRenderer(this);
		gun64_r2.setRotationPoint(-3.099F, -33.6F, 2.999F);
		gun.addChild(gun64_r2);
		setRotationAngle(gun64_r2, -0.4363F, 0.0F, 0.0F);
		gun64_r2.cubeList.add(new ModelBox(gun64_r2, 64, 73, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));
		gun64_r2.cubeList.add(new ModelBox(gun64_r2, 74, 28, 3.2F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun62_r2 = new ModelRenderer(this);
		gun62_r2.setRotationPoint(-3.099F, -32.7F, -22.001F);
		gun.addChild(gun62_r2);
		setRotationAngle(gun62_r2, -0.4363F, 0.0F, 0.0F);
		gun62_r2.cubeList.add(new ModelBox(gun62_r2, 57, 77, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));
		gun62_r2.cubeList.add(new ModelBox(gun62_r2, 72, 77, 3.2F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun61_r3 = new ModelRenderer(this);
		gun61_r3.setRotationPoint(-3.099F, -33.7F, -23.401F);
		gun.addChild(gun61_r3);
		setRotationAngle(gun61_r3, -0.4363F, 0.0F, 0.0F);
		gun61_r3.cubeList.add(new ModelBox(gun61_r3, 72, 75, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));
		gun61_r3.cubeList.add(new ModelBox(gun61_r3, 78, 28, 3.2F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun75_r1 = new ModelRenderer(this);
		gun75_r1.setRotationPoint(-3.5F, -29.9F, -13.3F);
		gun.addChild(gun75_r1);
		setRotationAngle(gun75_r1, 1.9074F, 0.0F, 0.0F);
		gun75_r1.cubeList.add(new ModelBox(gun75_r1, 0, 50, 0.002F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun74_r1 = new ModelRenderer(this);
		gun74_r1.setRotationPoint(-3.5F, -28.2F, -13.3F);
		gun.addChild(gun74_r1);
		setRotationAngle(gun74_r1, 2.9371F, 0.0F, 0.0F);
		gun74_r1.cubeList.add(new ModelBox(gun74_r1, 18, 35, 0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F, false));

		gun86_r1 = new ModelRenderer(this);
		gun86_r1.setRotationPoint(-2.0F, -31.2F, -9.4F);
		gun.addChild(gun86_r1);
		setRotationAngle(gun86_r1, -1.1525F, 0.0F, 0.0F);
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 80, 39, 0.0F, 0.1F, -0.3F, 1, 1, 2, -0.2F, false));

		gun87_r1 = new ModelRenderer(this);
		gun87_r1.setRotationPoint(-2.0F, -30.9F, -8.3F);
		gun.addChild(gun87_r1);
		setRotationAngle(gun87_r1, -1.673F, 0.0F, 0.0F);
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 26, 77, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun88_r1 = new ModelRenderer(this);
		gun88_r1.setRotationPoint(-2.0F, -28.9F, -8.5F);
		gun.addChild(gun88_r1);
		setRotationAngle(gun88_r1, -2.1564F, 0.0F, 0.0F);
		gun88_r1.cubeList.add(new ModelBox(gun88_r1, 26, 74, -0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun96_r1 = new ModelRenderer(this);
		gun96_r1.setRotationPoint(-2.1F, -35.5F, 6.3F);
		gun.addChild(gun96_r1);
		setRotationAngle(gun96_r1, -0.2434F, 0.0F, 0.0F);
		gun96_r1.cubeList.add(new ModelBox(gun96_r1, 14, 16, -0.801F, -0.2F, -1.8F, 1, 4, 2, -0.2F, false));
		gun96_r1.cubeList.add(new ModelBox(gun96_r1, 28, 16, 0.999F, -0.2F, -1.8F, 1, 4, 2, -0.2F, false));

		gun98_r1 = new ModelRenderer(this);
		gun98_r1.setRotationPoint(-2.1F, -36.5F, 6.0F);
		gun.addChild(gun98_r1);
		setRotationAngle(gun98_r1, -0.5061F, 0.0F, 0.0F);
		gun98_r1.cubeList.add(new ModelBox(gun98_r1, 50, 57, -0.401F, -0.201F, -0.8F, 2, 1, 1, -0.2F, false));

		gun97_r1 = new ModelRenderer(this);
		gun97_r1.setRotationPoint(-2.1F, -35.5F, 6.3F);
		gun.addChild(gun97_r1);
		setRotationAngle(gun97_r1, -1.5175F, 0.0F, 0.0F);
		gun97_r1.cubeList.add(new ModelBox(gun97_r1, 53, 64, -0.401F, -0.201F, -2.6F, 2, 2, 1, -0.2F, false));
		gun97_r1.cubeList.add(new ModelBox(gun97_r1, 63, 51, -0.801F, -0.201F, -3.2F, 1, 2, 1, -0.2F, false));
		gun97_r1.cubeList.add(new ModelBox(gun97_r1, 36, 35, -0.8F, -0.2F, -2.8F, 1, 2, 3, -0.2F, false));
		gun97_r1.cubeList.add(new ModelBox(gun97_r1, 29, 53, 0.999F, -0.201F, -3.2F, 1, 2, 1, -0.2F, false));
		gun97_r1.cubeList.add(new ModelBox(gun97_r1, 36, 44, 1.0F, -0.2F, -2.8F, 1, 2, 3, -0.2F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(-3.5F, -28.5F, -1.8F);
		gun.addChild(grip);
		grip.cubeList.add(new ModelBox(grip, 0, 57, 0.5F, -0.4F, -4.8F, 3, 3, 7, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 70, 43, 0.001F, -3.1F, -3.5F, 4, 3, 5, 0.0F, false));

		gun9_r2 = new ModelRenderer(this);
		gun9_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(gun9_r2);
		setRotationAngle(gun9_r2, 0.3407F, 0.0F, 0.0F);
		gun9_r2.cubeList.add(new ModelBox(gun9_r2, 17, 0, -0.1F, 2.2F, -3.5F, 4, 8, 4, 0.0F, false));
		gun9_r2.cubeList.add(new ModelBox(gun9_r2, 50, 0, 0.1F, 2.2F, -3.5F, 4, 8, 4, 0.0F, false));
		gun9_r2.cubeList.add(new ModelBox(gun9_r2, 0, 0, 0.0F, -0.9F, -0.1F, 4, 13, 2, 0.0F, false));

		gun20_r1 = new ModelRenderer(this);
		gun20_r1.setRotationPoint(0.0F, 2.5F, 3.0F);
		grip.addChild(gun20_r1);
		setRotationAngle(gun20_r1, -1.4735F, 0.0F, 0.0F);
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 14, 16, 0.002F, -0.1F, 3.0F, 4, 6, 6, 0.0F, false));

		gun37_r3 = new ModelRenderer(this);
		gun37_r3.setRotationPoint(0.0F, -2.0F, 5.3F);
		grip.addChild(gun37_r3);
		setRotationAngle(gun37_r3, -2.9371F, 0.0F, 0.0F);
		gun37_r3.cubeList.add(new ModelBox(gun37_r3, 70, 59, 0.001F, 0.0F, 0.5F, 4, 2, 3, 0.0F, false));

		gun22_r1 = new ModelRenderer(this);
		gun22_r1.setRotationPoint(0.0F, -2.0F, 3.2F);
		grip.addChild(gun22_r1);
		setRotationAngle(gun22_r1, -1.9333F, 0.0F, 0.0F);
		gun22_r1.cubeList.add(new ModelBox(gun22_r1, 0, 80, -0.001F, 0.0F, 0.0F, 4, 2, 3, 0.0F, false));

		gun17_r1 = new ModelRenderer(this);
		gun17_r1.setRotationPoint(0.0F, -2.8F, -5.2F);
		grip.addChild(gun17_r1);
		setRotationAngle(gun17_r1, 0.1244F, 0.0F, 0.0F);
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 80, 34, 0.002F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

		gun63_r2 = new ModelRenderer(this);
		gun63_r2.setRotationPoint(0.0F, 2.65F, -4.75F);
		grip.addChild(gun63_r2);
		setRotationAngle(gun63_r2, 1.1154F, 0.0F, 0.0F);
		gun63_r2.cubeList.add(new ModelBox(gun63_r2, 0, 46, -0.001F, 0.0F, 0.0F, 4, 3, 1, 0.0F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(0.0F, -2.0F, -2.6F);
		grip.addChild(gun21_r1);
		setRotationAngle(gun21_r1, -1.3384F, 0.0F, 0.0F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 70, 10, 0.001F, -3.0F, 4.0F, 4, 5, 5, 0.0F, false));
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
