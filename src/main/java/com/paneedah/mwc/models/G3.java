package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G3 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun5_r2;
	private final ModelRenderer gun4_r1;
	private final ModelRenderer gun5_r3;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun9_r2;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun5_r4;
	private final ModelRenderer gun7_r2;
	private final ModelRenderer gun6_r2;
	private final ModelRenderer gun5_r5;
	private final ModelRenderer gun4_r2;
	private final ModelRenderer gun6_r3;
	private final ModelRenderer gun5_r6;
	private final ModelRenderer gun4_r3;
	private final ModelRenderer gun4_r4;
	private final ModelRenderer gun9_r3;
	private final ModelRenderer gun8_r2;
	private final ModelRenderer gun8_r3;
	private final ModelRenderer gun6_r4;
	private final ModelRenderer gun9_r4;
	private final ModelRenderer gun8_r4;
	private final ModelRenderer gun8_r5;
	private final ModelRenderer gun7_r3;
	private final ModelRenderer gun6_r5;
	private final ModelRenderer gun4_r5;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun4_r6;
	private final ModelRenderer gun4_r7;
	private final ModelRenderer gun3_r2;
	private final ModelRenderer grip;
	private final ModelRenderer gun241_r1;
	private final ModelRenderer gun240_r1;
	private final ModelRenderer gun241_r2;
	private final ModelRenderer gun242_r1;
	private final ModelRenderer gun245_r1;
	private final ModelRenderer gun244_r1;
	private final ModelRenderer gun243_r1;
	private final ModelRenderer gun241_r3;
	private final ModelRenderer barrel;
	private final ModelRenderer gun7_r4;
	private final ModelRenderer gun8_r7;
	private final ModelRenderer gun9_r7;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer gun16_r1;
	private final ModelRenderer gun15_r2;
	private final ModelRenderer gun14_r1;
	private final ModelRenderer gun9_r8;
	private final ModelRenderer gun15_r3;
	private final ModelRenderer gun14_r2;
	private final ModelRenderer gun13_r1;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun12_r2;
	private final ModelRenderer gun14_r3;
	private final ModelRenderer gun16_r2;
	private final ModelRenderer gun14_r4;
	private final ModelRenderer gun13_r2;
	private final ModelRenderer gun12_r3;
	private final ModelRenderer gun12_r4;
	private final ModelRenderer gun11_r2;
	private final ModelRenderer bone;
	private final ModelRenderer gun17_r1;
	private final ModelRenderer gun16_r3;
	private final ModelRenderer gun16_r4;
	private final ModelRenderer gun15_r4;

	public G3() {
		textureWidth = 300;
		textureHeight = 300;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 38, 37, -2.6F, -35.0F, -15.5F, 3, 5, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 25, -0.1F, -35.65F, -30.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 105, -0.95F, -38.65F, -30.5F, 1, 1, 34, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 57, -3.3F, -38.551F, -4.25F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 89, 49, -0.7F, -38.551F, -4.25F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 112, -2.0F, -39.751F, -4.45F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 54, -3.3F, -38.551F, -13.25F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 89, 52, -0.7F, -38.551F, -13.25F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 41, -3.3F, -38.551F, -27.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 84, -0.7F, -38.551F, -27.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 48, -2.0F, -39.851F, -13.25F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 146, 33, -0.75F, -38.65F, -27.5F, 1, 1, 28, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 200, -2.0F, -39.8F, -27.5F, 1, 1, 23, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 44, 224, -3.25F, -38.65F, -16.5F, 1, 1, 17, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 71, -3.25F, -38.65F, -27.5F, 1, 1, 3, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 72, -1.2F, -37.65F, -30.5F, 1, 1, 34, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 9, -2.8F, -37.65F, -30.5F, 2, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 216, 145, -2.8F, -37.65F, -16.5F, 1, 1, 20, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 70, -2.1F, -39.601F, -30.5F, 1, 1, 34, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 74, -1.9F, -39.6F, -30.5F, 1, 1, 34, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 123, 94, -2.5F, -35.25F, -30.5F, 2, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 125, 117, -3.05F, -38.65F, -30.5F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 217, 189, -3.05F, -38.65F, -16.5F, 1, 1, 20, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 8, -0.099F, -36.15F, -30.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 175, -0.349F, -36.15F, -23.5F, 1, 1, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 132, 174, -3.649F, -36.15F, -23.5F, 1, 1, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 174, 137, -0.35F, -35.65F, -23.5F, 1, 1, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 103, 173, -3.65F, -35.65F, -23.5F, 1, 1, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 17, -3.9F, -35.65F, -30.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 0, -3.91F, -36.15F, -30.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 37, -0.5F, -33.5F, -6.5F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 37, -2.75F, -34.0F, -17.5F, 3, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 9, -3.25F, -34.0F, -17.5F, 1, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 98, 31, -2.599F, -31.0F, -16.9F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 94, -2.45F, -34.2F, -25.8F, 3, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 8, 14, -2.45F, -33.6F, -25.8F, 3, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 91, -2.45F, -33.2F, -24.4F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 61, -3.55F, -33.2F, -24.4F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 101, -2.45F, -32.2F, -20.8F, 3, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 63, -0.35F, -32.55F, -18.6F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 7, 94, -0.65F, -32.55F, -16.9F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 98, 83, -0.099F, -33.8F, -18.25F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 25, -0.099F, -33.3F, -18.25F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 21, -0.099F, -31.8F, -18.25F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 19, -3.899F, -33.8F, -18.25F, 1, 3, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 98, -0.098F, -33.8F, -24.1F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 42, 96, -3.898F, -33.8F, -24.1F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 67, -0.099F, -33.35F, -24.1F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 96, -3.899F, -33.35F, -24.1F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 127, -0.099F, -34.23F, -23.67F, 1, 1, 6, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 126, 45, -3.899F, -34.23F, -23.67F, 1, 1, 6, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 35, -3.55F, -34.2F, -25.8F, 2, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 5, -3.55F, -33.6F, -25.8F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 0, -3.55F, -32.2F, -20.8F, 2, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 74, -3.4F, -35.0F, -15.5F, 1, 5, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 70, -3.401F, -31.0F, -16.9F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 72, -3.0F, -26.0F, -11.5F, 3, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 130, -2.6F, -35.0F, -1.5F, 3, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 44, 74, -3.4F, -35.0F, -1.5F, 1, 3, 3, 0.0F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(0.0F, -25.0F, -11.5F);
		gun.addChild(gun5_r1);
		setRotationAngle(gun5_r1, 0.3229F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 26, 55, -3.0F, -6.0F, 0.0F, 3, 6, 1, 0.0F, false));

		gun5_r2 = new ModelRenderer(this);
		gun5_r2.setRotationPoint(0.0F, -30.3F, -6.0F);
		gun.addChild(gun5_r2);
		setRotationAngle(gun5_r2, 0.3665F, 0.0F, 0.0F);
		gun5_r2.cubeList.add(new ModelBox(gun5_r2, 76, 21, -3.0F, 0.0F, 0.0F, 3, 4, 2, 0.0F, false));

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(0.0F, -25.0F, -6.5F);
		gun.addChild(gun4_r1);
		setRotationAngle(gun4_r1, 0.6545F, 0.0F, 0.0F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 0, 45, -3.0F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

		gun5_r3 = new ModelRenderer(this);
		gun5_r3.setRotationPoint(-2.55F, -28.9F, -17.5F);
		gun.addChild(gun5_r3);
		setRotationAngle(gun5_r3, -0.2443F, 0.0F, 0.0F);
		gun5_r3.cubeList.add(new ModelBox(gun5_r3, 108, 97, -1.001F, -5.3F, -1.001F, 2, 2, 1, 0.0F, false));
		gun5_r3.cubeList.add(new ModelBox(gun5_r3, 49, 0, -1.0F, -5.03F, -1.0F, 2, 4, 1, 0.0F, false));
		gun5_r3.cubeList.add(new ModelBox(gun5_r3, 62, 95, 0.101F, -5.3F, -1.001F, 3, 2, 1, 0.0F, false));
		gun5_r3.cubeList.add(new ModelBox(gun5_r3, 62, 81, 0.1015F, -5.03F, -1.0F, 3, 4, 1, 0.0F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-3.1F, -31.0F, -17.45F);
		gun.addChild(gun9_r1);
		setRotationAngle(gun9_r1, -0.7854F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 95, 93, -0.8F, -0.2F, -0.8F, 1, 1, 1, -0.2F, false));
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 42, 98, 3.0F, -0.2F, -0.8F, 1, 1, 1, -0.2F, false));

		gun9_r2 = new ModelRenderer(this);
		gun9_r2.setRotationPoint(-3.1F, -33.6F, -23.05F);
		gun.addChild(gun9_r2);
		setRotationAngle(gun9_r2, -0.7854F, 0.0F, 0.0F);
		gun9_r2.cubeList.add(new ModelBox(gun9_r2, 96, 61, -0.8F, -0.2F, -0.8F, 1, 1, 1, -0.2F, false));
		gun9_r2.cubeList.add(new ModelBox(gun9_r2, 96, 70, 3.0F, -0.2F, -0.8F, 1, 1, 1, -0.2F, false));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(-3.1F, -33.6F, -17.45F);
		gun.addChild(gun8_r1);
		setRotationAngle(gun8_r1, -0.7854F, 0.0F, 0.0F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 95, 95, -0.8F, -0.2F, -0.8F, 1, 1, 1, -0.2F, false));
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 79, 98, 3.0F, -0.2F, -0.8F, 1, 1, 1, -0.2F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(-3.1F, -32.55F, -23.9F);
		gun.addChild(gun11_r1);
		setRotationAngle(gun11_r1, 1.2566F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 47, 47, -0.799F, 4.55F, -0.2F, 1, 2, 1, -0.2F, false));
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 10, 55, 3.001F, 4.55F, -0.2F, 1, 2, 1, -0.2F, false));
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 40, 0, -0.8F, -0.2F, -0.2F, 1, 6, 1, -0.2F, false));
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 40, 8, 3.0F, -0.2F, -0.2F, 1, 6, 1, -0.2F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(-0.55F, -33.2F, -25.8F);
		gun.addChild(gun7_r1);
		setRotationAngle(gun7_r1, 0.7069F, 0.0F, 0.0F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 0, 67, -2.999F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 67, 0, -1.899F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(1.55F, -30.1F, -18.1F);
		gun.addChild(gun6_r1);
		setRotationAngle(gun6_r1, -0.3142F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 89, 37, -3.001F, -1.0F, -8.0F, 2, 1, 8, 0.0F, false));
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 112, 45, -5.101F, -1.0F, -8.0F, 3, 1, 8, 0.0F, false));

		gun5_r4 = new ModelRenderer(this);
		gun5_r4.setRotationPoint(-0.4F, -31.0F, -16.9F);
		gun.addChild(gun5_r4);
		setRotationAngle(gun5_r4, -0.9599F, 0.0F, 0.0F);
		gun5_r4.cubeList.add(new ModelBox(gun5_r4, 100, 46, -2.999F, -2.0F, 0.0F, 3, 2, 1, 0.0F, false));
		gun5_r4.cubeList.add(new ModelBox(gun5_r4, 36, 103, -2.201F, -2.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun7_r2 = new ModelRenderer(this);
		gun7_r2.setRotationPoint(-0.6F, -32.0F, -8.1F);
		gun.addChild(gun7_r2);
		setRotationAngle(gun7_r2, -1.8326F, 0.0F, 0.0F);
		gun7_r2.cubeList.add(new ModelBox(gun7_r2, 93, 0, -3.001F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun6_r2 = new ModelRenderer(this);
		gun6_r2.setRotationPoint(-0.6F, -31.2F, -16.7F);
		gun.addChild(gun6_r2);
		setRotationAngle(gun6_r2, -1.8326F, 0.0F, 0.0F);
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 38, 68, -3.001F, -1.0F, 0.0F, 3, 1, 1, -0.1F, false));
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 46, 68, -1.801F, -1.0F, 0.0F, 3, 1, 1, -0.1F, false));

		gun5_r5 = new ModelRenderer(this);
		gun5_r5.setRotationPoint(0.5F, -33.5F, -5.5F);
		gun.addChild(gun5_r5);
		setRotationAngle(gun5_r5, 0.8552F, 0.0F, 0.0F);
		gun5_r5.cubeList.add(new ModelBox(gun5_r5, 79, 93, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun4_r2 = new ModelRenderer(this);
		gun4_r2.setRotationPoint(0.5F, -31.5F, -5.5F);
		gun.addChild(gun4_r2);
		setRotationAngle(gun4_r2, -0.8552F, 0.0F, 0.0F);
		gun4_r2.cubeList.add(new ModelBox(gun4_r2, 11, 45, -1.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun6_r3 = new ModelRenderer(this);
		gun6_r3.setRotationPoint(0.75F, -32.5F, -5.65F);
		gun.addChild(gun6_r3);
		setRotationAngle(gun6_r3, -0.2443F, 0.4014F, -0.0873F);
		gun6_r3.cubeList.add(new ModelBox(gun6_r3, 93, 46, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun5_r6 = new ModelRenderer(this);
		gun5_r6.setRotationPoint(0.75F, -32.75F, -6.75F);
		gun.addChild(gun5_r6);
		setRotationAngle(gun5_r6, -0.2269F, 0.0F, 0.0F);
		gun5_r6.cubeList.add(new ModelBox(gun5_r6, 59, 112, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun4_r3 = new ModelRenderer(this);
		gun4_r3.setRotationPoint(0.75F, -32.75F, -6.75F);
		gun.addChild(gun4_r3);
		setRotationAngle(gun4_r3, 0.1396F, 0.0F, 0.0F);
		gun4_r3.cubeList.add(new ModelBox(gun4_r3, 93, 58, -0.999F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun4_r4 = new ModelRenderer(this);
		gun4_r4.setRotationPoint(-3.9F, -34.65F, -29.5F);
		gun.addChild(gun4_r4);
		setRotationAngle(gun4_r4, 0.0F, 0.0F, -0.7854F);
		gun4_r4.cubeList.add(new ModelBox(gun4_r4, 0, 36, 0.0F, 0.0F, -1.0F, 2, 2, 34, 0.0F, false));

		gun9_r3 = new ModelRenderer(this);
		gun9_r3.setRotationPoint(-3.05F, -38.65F, -29.5F);
		gun.addChild(gun9_r3);
		setRotationAngle(gun9_r3, 0.0F, 0.0F, 0.7854F);
		gun9_r3.cubeList.add(new ModelBox(gun9_r3, 72, 75, 0.0F, -1.35F, -1.0F, 1, 1, 34, 0.0F, false));
		gun9_r3.cubeList.add(new ModelBox(gun9_r3, 213, 214, -0.001F, -1.0F, 13.0F, 1, 1, 20, 0.0F, false));
		gun9_r3.cubeList.add(new ModelBox(gun9_r3, 125, 35, -0.001F, -1.0F, -1.0F, 1, 1, 6, 0.0F, false));

		gun8_r2 = new ModelRenderer(this);
		gun8_r2.setRotationPoint(-3.0F, -37.65F, -29.5F);
		gun.addChild(gun8_r2);
		setRotationAngle(gun8_r2, 0.0F, 0.0F, 0.7854F);
		gun8_r2.cubeList.add(new ModelBox(gun8_r2, 216, 166, 0.0F, -1.0F, 13.0F, 1, 1, 20, 0.0F, false));
		gun8_r2.cubeList.add(new ModelBox(gun8_r2, 125, 110, 0.0F, -1.0F, -1.0F, 1, 1, 6, 0.0F, false));

		gun8_r3 = new ModelRenderer(this);
		gun8_r3.setRotationPoint(0.05F, -38.65F, -29.5F);
		gun.addChild(gun8_r3);
		setRotationAngle(gun8_r3, 0.0F, 0.0F, 0.7854F);
		gun8_r3.cubeList.add(new ModelBox(gun8_r3, 76, 0, -1.35F, 0.0F, -1.0F, 1, 1, 34, 0.0F, false));
		gun8_r3.cubeList.add(new ModelBox(gun8_r3, 76, 35, -1.0F, -0.001F, -1.0F, 1, 1, 34, 0.0F, false));

		gun6_r4 = new ModelRenderer(this);
		gun6_r4.setRotationPoint(0.05F, -37.65F, -29.5F);
		gun.addChild(gun6_r4);
		setRotationAngle(gun6_r4, 0.0F, 0.0F, 0.7854F);
		gun6_r4.cubeList.add(new ModelBox(gun6_r4, 0, 107, -1.0F, 0.0F, -1.0F, 1, 1, 34, 0.0F, false));

		gun9_r4 = new ModelRenderer(this);
		gun9_r4.setRotationPoint(-1.0F, -39.751F, -2.25F);
		gun.addChild(gun9_r4);
		setRotationAngle(gun9_r4, -0.1222F, 0.0F, 0.0F);
		gun9_r4.cubeList.add(new ModelBox(gun9_r4, 93, 2, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun8_r4 = new ModelRenderer(this);
		gun8_r4.setRotationPoint(-1.0F, -39.751F, -4.45F);
		gun.addChild(gun8_r4);
		setRotationAngle(gun8_r4, 0.1222F, 0.0F, 0.0F);
		gun8_r4.cubeList.add(new ModelBox(gun8_r4, 18, 93, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun8_r5 = new ModelRenderer(this);
		gun8_r5.setRotationPoint(-3.9F, -36.15F, -16.9F);
		gun.addChild(gun8_r5);
		setRotationAngle(gun8_r5, 0.0F, 0.6632F, -0.7854F);
		gun8_r5.cubeList.add(new ModelBox(gun8_r5, 112, 38, 0.0F, -0.001F, 0.0F, 1, 1, 2, 0.0F, false));

		gun7_r3 = new ModelRenderer(this);
		gun7_r3.setRotationPoint(-3.9F, -36.15F, -29.5F);
		gun.addChild(gun7_r3);
		setRotationAngle(gun7_r3, 0.0F, 0.0F, -0.7854F);
		gun7_r3.cubeList.add(new ModelBox(gun7_r3, 82, 123, 0.0F, 0.0F, 5.0F, 1, 1, 8, 0.0F, false));
		gun7_r3.cubeList.add(new ModelBox(gun7_r3, 56, 176, 0.0F, 0.0F, 13.0F, 2, 1, 20, 0.0F, false));
		gun7_r3.cubeList.add(new ModelBox(gun7_r3, 55, 56, 0.0F, 0.0F, -1.0F, 2, 2, 6, 0.0F, false));

		gun6_r5 = new ModelRenderer(this);
		gun6_r5.setRotationPoint(-3.9F, -36.15F, -23.25F);
		gun.addChild(gun6_r5);
		setRotationAngle(gun6_r5, 0.0F, 0.672F, -0.7854F);
		gun6_r5.cubeList.add(new ModelBox(gun6_r5, 65, 60, 1.0F, -0.001F, -1.0F, 2, 1, 1, 0.0F, false));

		gun4_r5 = new ModelRenderer(this);
		gun4_r5.setRotationPoint(0.9F, -36.15F, -29.5F);
		gun.addChild(gun4_r5);
		setRotationAngle(gun4_r5, 0.0F, 0.0F, 0.7854F);
		gun4_r5.cubeList.add(new ModelBox(gun4_r5, 0, 0, -3.0F, 0.0F, -1.0F, 3, 2, 34, 0.0F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(0.9F, -34.65F, -29.5F);
		gun.addChild(gun3_r1);
		setRotationAngle(gun3_r1, 0.0F, 0.0F, 0.7854F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 38, 38, -2.0F, 0.0F, -1.0F, 2, 2, 34, 0.0F, false));

		gun4_r6 = new ModelRenderer(this);
		gun4_r6.setRotationPoint(-0.5F, -27.8F, -7.0F);
		gun.addChild(gun4_r6);
		setRotationAngle(gun4_r6, -0.7505F, 0.0F, 0.0F);
		gun4_r6.cubeList.add(new ModelBox(gun4_r6, 112, 45, -2.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

		gun4_r7 = new ModelRenderer(this);
		gun4_r7.setRotationPoint(-0.5F, -30.8F, -15.7F);
		gun.addChild(gun4_r7);
		setRotationAngle(gun4_r7, 0.2618F, 0.0F, 0.0F);
		gun4_r7.cubeList.add(new ModelBox(gun4_r7, 66, 37, -2.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		gun3_r2 = new ModelRenderer(this);
		gun3_r2.setRotationPoint(-0.5F, -30.8F, -7.5F);
		gun.addChild(gun3_r2);
		setRotationAngle(gun3_r2, 0.1571F, 0.0F, 0.0F);
		gun3_r2.cubeList.add(new ModelBox(gun3_r2, 66, 44, -2.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(-0.25F, 23.0F, 0.0F);
		grip.cubeList.add(new ModelBox(grip, 88, 83, -3.252F, -29.5F, -1.9F, 4, 3, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 29, -3.25F, -31.0F, -1.65F, 4, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 16, 29, -3.25F, -29.0F, -4.65F, 4, 1, 3, 0.0F, false));

		gun241_r1 = new ModelRenderer(this);
		gun241_r1.setRotationPoint(-2.25F, -29.0F, -5.65F);
		grip.addChild(gun241_r1);
		setRotationAngle(gun241_r1, 0.3491F, 0.0F, 0.0F);
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 0, 0, -0.999F, 1.0F, 0.0F, 4, 10, 4, 0.0F, false));

		gun240_r1 = new ModelRenderer(this);
		gun240_r1.setRotationPoint(-2.25F, -29.0F, -4.65F);
		grip.addChild(gun240_r1);
		setRotationAngle(gun240_r1, 0.3491F, 0.0F, 0.0F);
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 0, 55, -1.0F, 0.0F, -1.0F, 4, 11, 1, 0.0F, false));

		gun241_r2 = new ModelRenderer(this);
		gun241_r2.setRotationPoint(-2.25F, -31.0F, -1.65F);
		grip.addChild(gun241_r2);
		setRotationAngle(gun241_r2, -0.7854F, 0.0F, 0.0F);
		gun241_r2.cubeList.add(new ModelBox(gun241_r2, 0, 85, -0.999F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun242_r1 = new ModelRenderer(this);
		gun242_r1.setRotationPoint(-2.25F, -30.3F, -2.35F);
		grip.addChild(gun242_r1);
		setRotationAngle(gun242_r1, -0.2618F, 0.0F, 0.0F);
		gun242_r1.cubeList.add(new ModelBox(gun242_r1, 12, 101, -0.9985F, 0.0F, 0.0F, 4, 2, 2, 0.0F, false));

		gun245_r1 = new ModelRenderer(this);
		gun245_r1.setRotationPoint(-2.25F, -21.1F, 4.0F);
		grip.addChild(gun245_r1);
		setRotationAngle(gun245_r1, -1.0123F, 0.0F, 0.0F);
		gun245_r1.cubeList.add(new ModelBox(gun245_r1, 92, 122, -1.0F, 0.0F, -2.0F, 4, 6, 2, 0.0F, false));

		gun244_r1 = new ModelRenderer(this);
		gun244_r1.setRotationPoint(-2.25F, -25.6F, 1.9F);
		grip.addChild(gun244_r1);
		setRotationAngle(gun244_r1, 0.4363F, 0.0F, 0.0F);
		gun244_r1.cubeList.add(new ModelBox(gun244_r1, 16, 19, -0.998F, 0.0F, -5.0F, 4, 5, 5, 0.0F, false));

		gun243_r1 = new ModelRenderer(this);
		gun243_r1.setRotationPoint(-2.25F, -28.0F, 0.1F);
		grip.addChild(gun243_r1);
		setRotationAngle(gun243_r1, 0.6545F, 0.0F, 0.0F);
		gun243_r1.cubeList.add(new ModelBox(gun243_r1, 112, 24, -1.001F, 0.0F, -5.0F, 4, 3, 5, 0.0F, false));

		gun241_r3 = new ModelRenderer(this);
		gun241_r3.setRotationPoint(-2.25F, -30.0F, 1.35F);
		grip.addChild(gun241_r3);
		setRotationAngle(gun241_r3, -1.0559F, 0.0F, 0.0F);
		gun241_r3.cubeList.add(new ModelBox(gun241_r3, 100, 21, -0.998F, 0.0F, -1.0F, 4, 3, 1, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(-1.0F, -14.5F, -62.5F);
		barrel.cubeList.add(new ModelBox(barrel, 36, 112, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 112, 35, -1.0F, -1.0F, -2.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 112, 15, -1.5F, -0.5F, -2.75F, 2, 2, 1, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 49, 99, -1.5F, 1.0F, -2.5F, 2, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 125, 12, -1.0F, -1.0F, 3.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 112, 12, -1.0F, -0.9F, -0.5F, 1, 1, 11, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 125, 0, -1.0F, -1.0F, 26.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 36, 81, -1.851F, -0.15F, 3.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 5, 107, -1.851F, -0.15F, 0.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 49, 94, -1.851F, -0.15F, -2.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 54, 74, -0.15F, -0.15F, 3.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 108, 85, -0.15F, -0.15F, 0.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 72, 105, -0.15F, -0.15F, -2.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 10, 36, 0.1F, 1.4F, 0.0F, 1, 3, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 36, -2.1F, 1.4F, 0.0F, 1, 3, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 112, 0, -0.3F, -0.15F, -0.5F, 1, 1, 11, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 72, 110, -1.7F, -0.15F, -0.5F, 1, 1, 11, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 92, 70, -0.15F, -0.15F, 31.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 54, 99, -1.851F, -0.15F, 26.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 36, 96, -0.05F, -0.15F, 10.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 40, 2, -1.0F, 2.6F, -0.5F, 1, 1, 34, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 191, 213, -1.0F, 2.35F, -20.5F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 130, 24, -1.0F, 1.85F, -4.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 125, 129, -1.0F, 3.35F, -4.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 12, 129, -0.25F, 2.6F, -4.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 118, 128, -1.75F, 2.6F, -4.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 205, 0, -1.0F, 2.85F, -20.5F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 145, 203, -0.75F, 2.6F, -20.5F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 203, 124, -1.25F, 2.6F, -20.5F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 203, 87, -1.15F, 2.45F, -20.5F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 123, 202, -1.15F, 2.75F, -20.5F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 203, 24, -0.85F, 2.45F, -20.5F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 203, -0.85F, 2.75F, -20.5F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 63, 225, -1.0F, -1.1F, 10.0F, 1, 1, 18, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 106, 223, -1.95F, -0.15F, 10.0F, 1, 1, 18, 0.0F, false));

		gun7_r4 = new ModelRenderer(this);
		gun7_r4.setRotationPoint(0.95F, 0.85F, 11.0F);
		barrel.addChild(gun7_r4);
		setRotationAngle(gun7_r4, 0.0F, 0.0F, 0.7854F);
		gun7_r4.cubeList.add(new ModelBox(gun7_r4, 100, 144, -1.0F, 0.0F, -1.0F, 1, 1, 18, 0.0F, false));

		gun8_r7 = new ModelRenderer(this);
		gun8_r7.setRotationPoint(-1.95F, 0.85F, 11.0F);
		barrel.addChild(gun8_r7);
		setRotationAngle(gun8_r7, 0.0F, 0.0F, 0.7854F);
		gun8_r7.cubeList.add(new ModelBox(gun8_r7, 104, 201, 0.0F, -1.0F, -1.0F, 1, 1, 18, 0.0F, false));

		gun9_r7 = new ModelRenderer(this);
		gun9_r7.setRotationPoint(-1.95F, -0.15F, 11.0F);
		barrel.addChild(gun9_r7);
		setRotationAngle(gun9_r7, 0.0F, 0.0F, 0.7854F);
		gun9_r7.cubeList.add(new ModelBox(gun9_r7, 126, 224, -0.001F, -1.0F, -1.0F, 1, 1, 18, 0.0F, false));
		gun9_r7.cubeList.add(new ModelBox(gun9_r7, 225, 21, 0.0F, -1.35F, -1.0F, 1, 1, 18, 0.0F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(0.75F, 3.6F, -4.5F);
		barrel.addChild(gun15_r1);
		setRotationAngle(gun15_r1, 0.0F, 0.0F, -0.7854F);
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 56, 127, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun16_r1 = new ModelRenderer(this);
		gun16_r1.setRotationPoint(-1.75F, 3.6F, -4.5F);
		barrel.addChild(gun16_r1);
		setRotationAngle(gun16_r1, 0.0F, 0.0F, -0.7854F);
		gun16_r1.cubeList.add(new ModelBox(gun16_r1, 86, 0, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun15_r2 = new ModelRenderer(this);
		gun15_r2.setRotationPoint(-1.75F, 2.6F, -4.5F);
		barrel.addChild(gun15_r2);
		setRotationAngle(gun15_r2, 0.0F, 0.0F, -0.7854F);
		gun15_r2.cubeList.add(new ModelBox(gun15_r2, 91, 102, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(0.75F, 2.6F, -4.5F);
		barrel.addChild(gun14_r1);
		setRotationAngle(gun14_r1, 0.0F, 0.0F, -0.7854F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 106, 128, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun9_r8 = new ModelRenderer(this);
		gun9_r8.setRotationPoint(0.95F, -0.15F, 11.0F);
		barrel.addChild(gun9_r8);
		setRotationAngle(gun9_r8, 0.0F, 0.0F, 0.7854F);
		gun9_r8.cubeList.add(new ModelBox(gun9_r8, 225, 78, -1.35F, 0.0F, -1.0F, 1, 1, 18, 0.0F, false));
		gun9_r8.cubeList.add(new ModelBox(gun9_r8, 225, 108, -1.0F, -0.001F, -1.0F, 1, 1, 18, 0.0F, false));

		gun15_r3 = new ModelRenderer(this);
		gun15_r3.setRotationPoint(-1.85F, 0.85F, 27.5F);
		barrel.addChild(gun15_r3);
		setRotationAngle(gun15_r3, 0.0F, 0.0F, 0.7854F);
		gun15_r3.cubeList.add(new ModelBox(gun15_r3, 18, 99, -0.001F, -1.0F, -1.0F, 1, 1, 6, 0.0F, false));
		gun15_r3.cubeList.add(new ModelBox(gun15_r3, 49, 91, -0.001F, -1.0F, -30.0F, 1, 1, 2, 0.0F, false));
		gun15_r3.cubeList.add(new ModelBox(gun15_r3, 84, 105, -0.001F, -1.0F, -27.5F, 1, 1, 2, 0.0F, false));
		gun15_r3.cubeList.add(new ModelBox(gun15_r3, 20, 79, -0.001F, -1.0F, -24.0F, 1, 1, 6, 0.0F, false));

		gun14_r2 = new ModelRenderer(this);
		gun14_r2.setRotationPoint(-1.85F, -0.15F, 27.5F);
		barrel.addChild(gun14_r2);
		setRotationAngle(gun14_r2, 0.0F, 0.0F, 0.7854F);
		gun14_r2.cubeList.add(new ModelBox(gun14_r2, 106, 117, -0.001F, -1.0F, -1.0F, 1, 1, 6, 0.0F, false));
		gun14_r2.cubeList.add(new ModelBox(gun14_r2, 44, 103, -0.001F, -1.0F, -30.0F, 1, 1, 2, 0.0F, false));
		gun14_r2.cubeList.add(new ModelBox(gun14_r2, 108, 75, -0.001F, -1.0F, -27.5F, 1, 1, 2, 0.0F, false));
		gun14_r2.cubeList.add(new ModelBox(gun14_r2, 54, 81, -0.001F, -1.0F, -24.0F, 1, 1, 6, 0.0F, false));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(0.85F, 0.85F, 28.0F);
		barrel.addChild(gun13_r1);
		setRotationAngle(gun13_r1, 0.0F, 0.0F, -0.7854F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 76, 54, -1.001F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 78, 105, -1.001F, -1.0F, -30.5F, 1, 1, 2, 0.0F, false));
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 108, 88, -1.001F, -1.0F, -28.0F, 1, 1, 2, 0.0F, false));
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 36, 74, -1.001F, -1.0F, -24.5F, 1, 1, 6, 0.0F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(0.85F, -0.15F, 31.0F);
		barrel.addChild(gun12_r1);
		setRotationAngle(gun12_r1, 0.0F, 0.0F, -0.7854F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 84, 70, -1.001F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 103, 49, -1.001F, -1.0F, -33.5F, 1, 1, 2, 0.0F, false));
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 108, 78, -1.001F, -1.0F, -31.0F, 1, 1, 2, 0.0F, false));
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 72, 74, -1.001F, -1.0F, -27.5F, 1, 1, 6, 0.0F, false));

		gun12_r2 = new ModelRenderer(this);
		gun12_r2.setRotationPoint(-1.2F, 2.6F, 0.4F);
		barrel.addChild(gun12_r2);
		setRotationAngle(gun12_r2, -0.3142F, 0.0F, 0.0F);
		gun12_r2.cubeList.add(new ModelBox(gun12_r2, 89, 66, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun12_r2.cubeList.add(new ModelBox(gun12_r2, 0, 91, 1.4F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun14_r3 = new ModelRenderer(this);
		gun14_r3.setRotationPoint(-1.0F, -1.0F, -1.5F);
		barrel.addChild(gun14_r3);
		setRotationAngle(gun14_r3, 0.0F, 0.0F, -0.7854F);
		gun14_r3.cubeList.add(new ModelBox(gun14_r3, 100, 83, -1.0F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));
		gun14_r3.cubeList.add(new ModelBox(gun14_r3, 18, 107, -1.0F, 0.0F, 1.5F, 1, 1, 2, 0.0F, false));
		gun14_r3.cubeList.add(new ModelBox(gun14_r3, 72, 81, -1.0F, 0.0F, 5.0F, 1, 1, 6, 0.0F, false));
		gun14_r3.cubeList.add(new ModelBox(gun14_r3, 106, 110, -1.0F, 0.0F, 28.0F, 1, 1, 6, 0.0F, false));

		gun16_r2 = new ModelRenderer(this);
		gun16_r2.setRotationPoint(0.0F, -1.0F, 3.5F);
		barrel.addChild(gun16_r2);
		setRotationAngle(gun16_r2, 0.0F, 0.0F, -0.7854F);
		gun16_r2.cubeList.add(new ModelBox(gun16_r2, 103, 52, -1.0F, 0.0F, -6.0F, 1, 1, 2, 0.0F, false));
		gun16_r2.cubeList.add(new ModelBox(gun16_r2, 108, 82, -1.0F, 0.0F, -3.5F, 1, 1, 2, 0.0F, false));
		gun16_r2.cubeList.add(new ModelBox(gun16_r2, 0, 78, -1.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));
		gun16_r2.cubeList.add(new ModelBox(gun16_r2, 10, 85, -1.0F, 0.0F, 27.5F, 1, 1, 1, 0.0F, false));
		gun16_r2.cubeList.add(new ModelBox(gun16_r2, 108, 94, -1.0F, 0.0F, 22.75F, 1, 1, 2, 0.0F, false));

		gun14_r4 = new ModelRenderer(this);
		gun14_r4.setRotationPoint(0.0F, -1.42F, 31.7F);
		barrel.addChild(gun14_r4);
		setRotationAngle(gun14_r4, 0.0F, 0.0F, -0.7854F);
		gun14_r4.cubeList.add(new ModelBox(gun14_r4, 76, 49, -1.0F, 0.0F, -4.0F, 1, 1, 4, -0.3F, false));

		gun13_r2 = new ModelRenderer(this);
		gun13_r2.setRotationPoint(-1.0F, 0.2F, 0.5F);
		barrel.addChild(gun13_r2);
		setRotationAngle(gun13_r2, 0.0F, 0.0F, -0.7854F);
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 76, 37, -1.0F, 0.0F, -1.0F, 1, 1, 11, 0.0F, false));

		gun12_r3 = new ModelRenderer(this);
		gun12_r3.setRotationPoint(-1.0F, -0.9F, 0.5F);
		barrel.addChild(gun12_r3);
		setRotationAngle(gun12_r3, 0.0F, 0.0F, -0.7854F);
		gun12_r3.cubeList.add(new ModelBox(gun12_r3, 76, 49, -1.0F, 0.0F, -1.0F, 1, 1, 11, 0.0F, false));

		gun12_r4 = new ModelRenderer(this);
		gun12_r4.setRotationPoint(0.0F, 0.2F, 0.5F);
		barrel.addChild(gun12_r4);
		setRotationAngle(gun12_r4, 0.0F, 0.0F, -0.7854F);
		gun12_r4.cubeList.add(new ModelBox(gun12_r4, 76, 21, -1.0F, 0.0F, -1.0F, 1, 1, 11, 0.0F, false));

		gun11_r2 = new ModelRenderer(this);
		gun11_r2.setRotationPoint(0.0F, -0.9F, 0.5F);
		barrel.addChild(gun11_r2);
		setRotationAngle(gun11_r2, 0.0F, 0.0F, -0.7854F);
		gun11_r2.cubeList.add(new ModelBox(gun11_r2, 0, 89, -1.0F, 0.0F, -1.0F, 1, 1, 11, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.75F, 3.6F, -27.5F);
		barrel.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 10, 120, 0.75F, -1.65F, 5.4F, 1, 1, 8, -0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 52, 118, 1.4F, -1.0F, 5.4F, 1, 1, 8, -0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 85, 110, 0.75F, -0.35F, 5.4F, 1, 1, 8, -0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 49, 109, 0.1F, -1.0F, 5.4F, 1, 1, 8, -0.1F, false));

		gun17_r1 = new ModelRenderer(this);
		gun17_r1.setRotationPoint(0.1F, 0.0F, 5.4F);
		bone.addChild(gun17_r1);
		setRotationAngle(gun17_r1, 0.0F, 0.0F, -0.7854F);
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 92, 58, 0.0F, 0.0F, 0.0F, 1, 1, 8, -0.1F, false));

		gun16_r3 = new ModelRenderer(this);
		gun16_r3.setRotationPoint(0.1F, -1.0F, 5.4F);
		bone.addChild(gun16_r3);
		setRotationAngle(gun16_r3, 0.0F, 0.0F, -0.7854F);
		gun16_r3.cubeList.add(new ModelBox(gun16_r3, 85, 93, 0.0F, 0.0F, 0.0F, 1, 1, 8, -0.1F, false));

		gun16_r4 = new ModelRenderer(this);
		gun16_r4.setRotationPoint(2.4F, 0.0F, 5.4F);
		bone.addChild(gun16_r4);
		setRotationAngle(gun16_r4, 0.0F, 0.0F, -0.7854F);
		gun16_r4.cubeList.add(new ModelBox(gun16_r4, 112, 54, -1.0F, -1.0F, 0.0F, 1, 1, 8, -0.1F, false));

		gun15_r4 = new ModelRenderer(this);
		gun15_r4.setRotationPoint(2.4F, -1.0F, 5.4F);
		bone.addChild(gun15_r4);
		setRotationAngle(gun15_r4, 0.0F, 0.0F, -0.7854F);
		gun15_r4.cubeList.add(new ModelBox(gun15_r4, 0, 119, -1.0F, -1.0F, 0.0F, 1, 1, 8, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
		grip.render(f5);
		barrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}