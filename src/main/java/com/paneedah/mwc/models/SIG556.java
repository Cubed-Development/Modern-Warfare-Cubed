package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SIG556 extends ModelWithAttachments {
	private final QRenderer gun;
	private final ModelRenderer grip9_r1;
	private final ModelRenderer grip12_r1;
	private final ModelRenderer grip6_r2;
	private final ModelRenderer grip6_r3;
	private final ModelRenderer grip7_r1;
	private final ModelRenderer grip6_r4;
	private final ModelRenderer grip12_r2;
	private final ModelRenderer grip12_r3;
	private final ModelRenderer grip11_r1;
	private final ModelRenderer grip11_r2;
	private final ModelRenderer grip12_r4;
	private final ModelRenderer grip11_r3;
	private final ModelRenderer grip12_r5;
	private final ModelRenderer grip13_r1;
	private final ModelRenderer grip14_r1;
	private final ModelRenderer grip13_r2;
	private final ModelRenderer grip12_r6;
	private final ModelRenderer grip12_r7;
	private final ModelRenderer grip11_r4;
	private final ModelRenderer grip13_r3;
	private final ModelRenderer grip15_r1;
	private final ModelRenderer grip12_r8;
	private final ModelRenderer grip12_r9;
	private final ModelRenderer grip11_r5;
	private final ModelRenderer grip13_r4;
	private final ModelRenderer grip12_r10;
	private final ModelRenderer grip11_r6;
	private final ModelRenderer grip14_r2;
	private final ModelRenderer grip15_r2;
	private final ModelRenderer grip15_r3;
	private final ModelRenderer grip14_r3;
	private final ModelRenderer grip13_r5;
	private final ModelRenderer grip17_r1;
	private final ModelRenderer grip15_r4;
	private final ModelRenderer grip14_r4;
	private final ModelRenderer grip14_r5;
	private final ModelRenderer grip14_r6;
	private final ModelRenderer grip13_r6;
	private final ModelRenderer grip14_r7;
	private final ModelRenderer grip13_r7;
	private final ModelRenderer grip16_r1;
	private final ModelRenderer grip16_r2;
	private final ModelRenderer grip17_r2;
	private final ModelRenderer grip18_r1;
	private final ModelRenderer grip12_r11;
	private final ModelRenderer grip13_r8;
	private final ModelRenderer grip12_r12;
	private final ModelRenderer grip14_r8;
	private final ModelRenderer grip14_r9;
	private final ModelRenderer grip13_r9;
	private final ModelRenderer grip14_r10;
	private final ModelRenderer grip13_r10;
	private final ModelRenderer grip12_r13;
	private final ModelRenderer grip11_r7;
	private final ModelRenderer grip11_r8;
	private final ModelRenderer grip10_r1;
	private final ModelRenderer grip10_r2;
	private final ModelRenderer rail2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final QRenderer stock;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;

	public SIG556() {
		textureWidth = 350;
		textureHeight = 350;

		gun = new QRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 23, 0, -3.65F, -35.25F, -21.25F, 1, 4, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 30, 78, -3.45F, -37.55F, 2.55F, 4, 5, 2, -0.05F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 50, -3.35F, -35.25F, -21.25F, 4, 4, 5, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 67, 72, -0.35F, -35.25F, -16.25F, 1, 2, 5, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 14, -3.35F, -32.25F, -14.55F, 4, 1, 4, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 88, 258, -3.5F, -36.25F, -26.25F, 4, 3, 14, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 149, -0.25F, -37.25F, -26.25F, 1, 1, 28, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 121, 0, -2.5F, -41.0F, -26.25F, 2, 1, 28, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 160, 87, -2.5F, -41.9F, -26.35F, 2, 1, 27, -0.101F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 76, -3.0F, -41.0F, -15.25F, 1, 1, 8, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 118, 46, -3.75F, -38.05F, -14.25F, 1, 1, 7, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 30, 148, -3.75F, -37.25F, -26.25F, 1, 1, 28, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 207, 171, -3.75F, -37.75F, -24.25F, 1, 1, 26, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 208, 198, -0.25F, -37.75F, -24.25F, 1, 1, 26, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 115, 46, -0.5F, -37.75F, -26.25F, 1, 1, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 103, 109, -3.5F, -37.75F, -26.25F, 1, 1, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 28, -3.35F, -35.25F, -23.25F, 4, 3, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 7, -3.65F, -35.25F, -23.25F, 1, 3, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 131, -0.35F, -32.35F, -22.25F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 33, -4.0F, -35.25F, -25.25F, 5, 3, 2, 0.004F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 7, 0.0F, -34.75F, -23.25F, 1, 1, 6, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 117, 38, 0.2F, -32.65F, -23.05F, 1, 1, 7, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 129, -0.05F, -34.05F, -12.05F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 78, 129, -0.05F, -32.45F, -12.05F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 19, -0.05F, -34.25F, -11.75F, 1, 1, 3, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 113, -0.05F, -32.25F, -11.75F, 1, 1, 2, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 110, 30, -4.05F, -32.25F, -12.15F, 1, 1, 2, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 129, 65, -4.05F, -32.45F, -12.45F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 96, -4.05F, -34.05F, -12.45F, 1, 2, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 42, 112, -4.05F, -34.25F, -12.15F, 1, 1, 2, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 103, 8, -4.0F, -34.75F, -23.25F, 1, 1, 7, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 103, -4.2F, -32.65F, -23.05F, 1, 1, 9, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 92, 0, -4.0F, -35.25F, -23.25F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 83, 69, -0.35F, -36.25F, -12.25F, 1, 1, 5, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 81, 114, 0.35F, -35.95F, -12.55F, 1, 1, 2, -0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 66, 0, -0.35F, -37.05F, -7.25F, 1, 5, 2, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 37, -0.35F, -36.95F, -5.25F, 1, 1, 9, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 55, 83, -3.65F, -36.25F, -12.25F, 1, 1, 5, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 63, 47, -3.65F, -37.05F, -7.25F, 1, 5, 2, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 21, 78, -3.95F, -36.35F, -8.15F, 1, 2, 2, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 63, 55, -3.65F, -36.25F, -5.25F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -0.35F, -31.35F, -16.5F, 1, 4, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 26, -0.45F, -33.35F, -16.25F, 1, 2, 5, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 67, -3.0F, -31.75F, -4.75F, 3, 4, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 84, -1.5F, -31.55F, -7.45F, 1, 2, 1, -0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 76, -3.0F, -28.0F, -6.0F, 3, 1, 3, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 21, 58, -3.0F, -28.0F, -12.0F, 3, 1, 7, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 54, -3.0F, -28.0F, -12.0F, 3, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 15, -3.5F, -32.05F, -21.25F, 4, 4, 9, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 22, 42, -3.5F, -28.85F, -13.25F, 4, 2, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 0, -3.0F, -32.0F, -12.85F, 3, 5, 1, 0.0F, false));

		grip9_r1 = new ModelRenderer(this);
		grip9_r1.setRotationPoint(-0.5F, -28.15F, -21.15F);
		gun.addChild(grip9_r1);
		setRotationAngle(grip9_r1, -0.1571F, 0.0F, 0.0F);
		grip9_r1.cubeList.add(new ModelBox(grip9_r1, 36, 92, -3.0F, -1.9F, -0.1F, 4, 2, 8, 0.0F, false));

		grip12_r1 = new ModelRenderer(this);
		grip12_r1.setRotationPoint(-3.65F, -28.05F, -21.45F);
		gun.addChild(grip12_r1);
		setRotationAngle(grip12_r1, -0.1571F, 0.0F, 0.0F);
		grip12_r1.cubeList.add(new ModelBox(grip12_r1, 32, 42, 0.0F, -1.0F, 8.3F, 4, 1, 1, 0.0F, false));
		grip12_r1.cubeList.add(new ModelBox(grip12_r1, 94, 131, 3.4F, -1.0F, 8.3F, 1, 1, 1, -0.001F, false));
		grip12_r1.cubeList.add(new ModelBox(grip12_r1, 92, 84, 0.0F, -1.0F, 0.0F, 4, 1, 9, 0.0F, false));
		grip12_r1.cubeList.add(new ModelBox(grip12_r1, 103, 105, 3.4F, -1.0F, 0.0F, 1, 1, 9, 0.001F, false));

		grip6_r2 = new ModelRenderer(this);
		grip6_r2.setRotationPoint(0.0F, -28.0F, -11.2F);
		gun.addChild(grip6_r2);
		setRotationAngle(grip6_r2, 2.3387F, 0.0F, 0.0F);
		grip6_r2.cubeList.add(new ModelBox(grip6_r2, 21, 54, -3.0F, -1.0F, 0.0F, 3, 1, 1, -0.001F, false));

		grip6_r3 = new ModelRenderer(this);
		grip6_r3.setRotationPoint(0.0F, -28.0F, -5.45F);
		gun.addChild(grip6_r3);
		setRotationAngle(grip6_r3, -0.7854F, 0.0F, 0.0F);
		grip6_r3.cubeList.add(new ModelBox(grip6_r3, 59, 31, -3.0F, -1.0F, 0.0F, 3, 1, 1, -0.001F, false));

		grip7_r1 = new ModelRenderer(this);
		grip7_r1.setRotationPoint(-0.5F, -29.4F, -6.4F);
		gun.addChild(grip7_r1);
		setRotationAngle(grip7_r1, -0.8203F, 0.0F, 0.0F);
		grip7_r1.cubeList.add(new ModelBox(grip7_r1, 129, 91, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		grip6_r4 = new ModelRenderer(this);
		grip6_r4.setRotationPoint(-0.5F, -31.35F, -5.85F);
		gun.addChild(grip6_r4);
		setRotationAngle(grip6_r4, -0.2793F, 0.0F, 0.0F);
		grip6_r4.cubeList.add(new ModelBox(grip6_r4, 97, 88, -1.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

		grip12_r2 = new ModelRenderer(this);
		grip12_r2.setRotationPoint(-3.65F, -32.05F, -7.25F);
		gun.addChild(grip12_r2);
		setRotationAngle(grip12_r2, 0.0F, 0.0F, 0.8901F);
		grip12_r2.cubeList.add(new ModelBox(grip12_r2, 71, 113, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.001F, false));

		grip12_r3 = new ModelRenderer(this);
		grip12_r3.setRotationPoint(-3.65F, -32.95F, -7.25F);
		gun.addChild(grip12_r3);
		setRotationAngle(grip12_r3, 0.9076F, 0.0F, 0.0F);
		grip12_r3.cubeList.add(new ModelBox(grip12_r3, 21, 58, 0.0F, -5.0F, 0.0F, 1, 5, 2, 0.0F, false));
		grip12_r3.cubeList.add(new ModelBox(grip12_r3, 65, 16, 3.3F, -5.0F, 0.0F, 1, 5, 2, 0.0F, false));

		grip11_r1 = new ModelRenderer(this);
		grip11_r1.setRotationPoint(0.65F, -32.05F, -7.25F);
		gun.addChild(grip11_r1);
		setRotationAngle(grip11_r1, 0.0F, 0.0F, -0.8901F);
		grip11_r1.cubeList.add(new ModelBox(grip11_r1, 114, 100, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.001F, false));

		grip11_r2 = new ModelRenderer(this);
		grip11_r2.setRotationPoint(1.05F, -35.75F, -12.35F);
		gun.addChild(grip11_r2);
		setRotationAngle(grip11_r2, 0.0F, 0.0F, -0.576F);
		grip11_r2.cubeList.add(new ModelBox(grip11_r2, 77, 113, -0.8F, -0.8F, -0.2F, 1, 1, 2, -0.2F, false));

		grip12_r4 = new ModelRenderer(this);
		grip12_r4.setRotationPoint(1.0F, -35.65F, -24.15F);
		gun.addChild(grip12_r4);
		setRotationAngle(grip12_r4, 0.5672F, 0.0F, 0.0F);
		grip12_r4.cubeList.add(new ModelBox(grip12_r4, 41, 102, -1.0F, 2.0F, -1.0F, 1, 2, 1, 0.001F, false));

		grip11_r3 = new ModelRenderer(this);
		grip11_r3.setRotationPoint(1.0F, -35.25F, -23.25F);
		gun.addChild(grip11_r3);
		setRotationAngle(grip11_r3, 0.5672F, 0.0F, 0.0F);
		grip11_r3.cubeList.add(new ModelBox(grip11_r3, 118, 105, -1.0F, 0.0F, -1.0F, 1, 4, 1, 0.003F, false));

		grip12_r5 = new ModelRenderer(this);
		grip12_r5.setRotationPoint(-4.0F, -32.25F, -25.25F);
		gun.addChild(grip12_r5);
		setRotationAngle(grip12_r5, -0.3054F, 0.0F, 0.0F);
		grip12_r5.cubeList.add(new ModelBox(grip12_r5, 12, 42, 0.35F, -2.0F, 3.0F, 4, 2, 1, 0.001F, false));
		grip12_r5.cubeList.add(new ModelBox(grip12_r5, 46, 57, 0.0F, -1.0F, 0.0F, 4, 1, 3, 0.001F, false));
		grip12_r5.cubeList.add(new ModelBox(grip12_r5, 46, 112, 4.0F, -1.0F, 0.0F, 1, 1, 4, 0.002F, false));

		grip13_r1 = new ModelRenderer(this);
		grip13_r1.setRotationPoint(-4.0F, -33.75F, -23.25F);
		gun.addChild(grip13_r1);
		setRotationAngle(grip13_r1, 0.0F, 0.0F, -1.117F);
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 108, 37, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		grip14_r1 = new ModelRenderer(this);
		grip14_r1.setRotationPoint(-4.0F, -31.85F, -22.85F);
		gun.addChild(grip14_r1);
		setRotationAngle(grip14_r1, 0.0F, 0.0F, -1.1345F);
		grip14_r1.cubeList.add(new ModelBox(grip14_r1, 103, 95, -0.2F, -0.2F, -0.2F, 1, 1, 9, -0.201F, false));

		grip13_r2 = new ModelRenderer(this);
		grip13_r2.setRotationPoint(-4.0F, -32.45F, -22.85F);
		gun.addChild(grip13_r2);
		setRotationAngle(grip13_r2, 0.0F, 0.0F, 1.1345F);
		grip13_r2.cubeList.add(new ModelBox(grip13_r2, 36, 102, -0.2F, -0.8F, -0.2F, 1, 1, 9, -0.201F, false));

		grip12_r6 = new ModelRenderer(this);
		grip12_r6.setRotationPoint(-4.0F, -34.75F, -23.25F);
		gun.addChild(grip12_r6);
		setRotationAngle(grip12_r6, 0.0F, 0.0F, 1.117F);
		grip12_r6.cubeList.add(new ModelBox(grip12_r6, 103, 16, 0.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, false));

		grip12_r7 = new ModelRenderer(this);
		grip12_r7.setRotationPoint(-4.0F, -32.25F, -11.55F);
		gun.addChild(grip12_r7);
		setRotationAngle(grip12_r7, 0.0F, 0.1222F, 0.0F);
		grip12_r7.cubeList.add(new ModelBox(grip12_r7, 63, 129, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.001F, false));

		grip11_r4 = new ModelRenderer(this);
		grip11_r4.setRotationPoint(-4.1F, -34.05F, -24.85F);
		gun.addChild(grip11_r4);
		setRotationAngle(grip11_r4, -0.4538F, 0.0F, 0.0F);
		grip11_r4.cubeList.add(new ModelBox(grip11_r4, 129, 101, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.001F, false));
		grip11_r4.cubeList.add(new ModelBox(grip11_r4, 129, 103, 4.2F, -1.0F, 0.0F, 1, 1, 1, 0.001F, false));

		grip13_r3 = new ModelRenderer(this);
		grip13_r3.setRotationPoint(1.0F, -31.85F, -22.85F);
		gun.addChild(grip13_r3);
		setRotationAngle(grip13_r3, 0.0F, 0.0F, 1.1345F);
		grip13_r3.cubeList.add(new ModelBox(grip13_r3, 0, 111, -0.8F, -0.2F, -0.2F, 1, 1, 7, -0.201F, false));

		grip15_r1 = new ModelRenderer(this);
		grip15_r1.setRotationPoint(0.85F, -33.25F, -10.25F);
		gun.addChild(grip15_r1);
		setRotationAngle(grip15_r1, -0.3491F, 0.0F, 0.0F);
		grip15_r1.cubeList.add(new ModelBox(grip15_r1, 74, 129, -0.85F, -0.8F, -0.2F, 1, 1, 1, -0.2F, false));

		grip12_r8 = new ModelRenderer(this);
		grip12_r8.setRotationPoint(1.0F, -32.45F, -22.85F);
		gun.addChild(grip12_r8);
		setRotationAngle(grip12_r8, 0.0F, 0.0F, -1.1345F);
		grip12_r8.cubeList.add(new ModelBox(grip12_r8, 16, 111, -0.8F, -0.8F, -0.2F, 1, 1, 7, -0.201F, false));

		grip12_r9 = new ModelRenderer(this);
		grip12_r9.setRotationPoint(1.0F, -33.75F, -23.25F);
		gun.addChild(grip12_r9);
		setRotationAngle(grip12_r9, 0.0F, 0.0F, 1.117F);
		grip12_r9.cubeList.add(new ModelBox(grip12_r9, 23, 33, -1.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		grip11_r5 = new ModelRenderer(this);
		grip11_r5.setRotationPoint(1.0F, -34.75F, -23.25F);
		gun.addChild(grip11_r5);
		setRotationAngle(grip11_r5, 0.0F, 0.0F, -1.117F);
		grip11_r5.cubeList.add(new ModelBox(grip11_r5, 49, 0, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

		grip13_r4 = new ModelRenderer(this);
		grip13_r4.setRotationPoint(0.9F, -36.75F, -0.55F);
		gun.addChild(grip13_r4);
		setRotationAngle(grip13_r4, -0.4538F, 0.0F, 0.0F);
		grip13_r4.cubeList.add(new ModelBox(grip13_r4, 129, 87, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		grip12_r10 = new ModelRenderer(this);
		grip12_r10.setRotationPoint(0.9F, -36.75F, -19.55F);
		gun.addChild(grip12_r10);
		setRotationAngle(grip12_r10, -0.4538F, 0.0F, 0.0F);
		grip12_r10.cubeList.add(new ModelBox(grip12_r10, 129, 89, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		grip11_r6 = new ModelRenderer(this);
		grip11_r6.setRotationPoint(0.9F, -36.75F, -22.55F);
		gun.addChild(grip11_r6);
		setRotationAngle(grip11_r6, -0.4538F, 0.0F, 0.0F);
		grip11_r6.cubeList.add(new ModelBox(grip11_r6, 90, 129, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		grip14_r2 = new ModelRenderer(this);
		grip14_r2.setRotationPoint(-3.4F, -37.75F, -26.25F);
		gun.addChild(grip14_r2);
		setRotationAngle(grip14_r2, 0.0F, 0.0F, -1.3352F);
		grip14_r2.cubeList.add(new ModelBox(grip14_r2, 47, 107, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.001F, false));

		grip15_r2 = new ModelRenderer(this);
		grip15_r2.setRotationPoint(-3.3F, -37.75F, -26.25F);
		gun.addChild(grip15_r2);
		setRotationAngle(grip15_r2, 0.0F, 0.0F, -1.4573F);
		grip15_r2.cubeList.add(new ModelBox(grip15_r2, 109, 89, 1.64F, 0.0F, 0.0F, 1, 1, 2, 0.001F, false));

		grip15_r3 = new ModelRenderer(this);
		grip15_r3.setRotationPoint(-2.5F, -41.0F, -26.25F);
		gun.addChild(grip15_r3);
		setRotationAngle(grip15_r3, 0.0F, 0.0F, -0.8901F);
		grip15_r3.cubeList.add(new ModelBox(grip15_r3, 10, 80, -0.9F, -0.1F, -0.1F, 1, 1, 3, -0.1F, false));
		grip15_r3.cubeList.add(new ModelBox(grip15_r3, 56, 207, -1.0F, 0.0F, 2.0F, 1, 1, 26, 0.002F, false));

		grip14_r3 = new ModelRenderer(this);
		grip14_r3.setRotationPoint(0.3F, -37.75F, -26.25F);
		gun.addChild(grip14_r3);
		setRotationAngle(grip14_r3, 0.0F, 0.0F, 1.4573F);
		grip14_r3.cubeList.add(new ModelBox(grip14_r3, 114, 110, -2.64F, 0.0F, 0.0F, 1, 1, 2, 0.001F, false));

		grip13_r5 = new ModelRenderer(this);
		grip13_r5.setRotationPoint(0.4F, -37.75F, -26.25F);
		gun.addChild(grip13_r5);
		setRotationAngle(grip13_r5, 0.0F, 0.0F, 1.3352F);
		grip13_r5.cubeList.add(new ModelBox(grip13_r5, 65, 107, -2.0F, 0.0F, 0.0F, 2, 1, 2, 0.001F, false));

		grip17_r1 = new ModelRenderer(this);
		grip17_r1.setRotationPoint(-3.75F, -37.75F, -24.25F);
		gun.addChild(grip17_r1);
		setRotationAngle(grip17_r1, 0.0F, 0.0F, 0.2531F);
		grip17_r1.cubeList.add(new ModelBox(grip17_r1, 82, 131, 0.0F, -2.6F, 0.0F, 1, 1, 1, 0.0F, false));
		grip17_r1.cubeList.add(new ModelBox(grip17_r1, 102, 37, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.001F, false));
		grip17_r1.cubeList.add(new ModelBox(grip17_r1, 86, 131, 0.0F, -1.0F, 9.0F, 1, 1, 1, 0.001F, false));

		grip15_r4 = new ModelRenderer(this);
		grip15_r4.setRotationPoint(0.75F, -37.75F, -24.25F);
		gun.addChild(grip15_r4);
		setRotationAngle(grip15_r4, 0.0F, 0.0F, -0.7069F);
		grip15_r4.cubeList.add(new ModelBox(grip15_r4, 180, 199, -1.0F, -1.0F, 0.0F, 1, 1, 26, 0.001F, false));

		grip14_r4 = new ModelRenderer(this);
		grip14_r4.setRotationPoint(-3.75F, -37.75F, -7.25F);
		gun.addChild(grip14_r4);
		setRotationAngle(grip14_r4, 0.0F, 0.0F, 0.7069F);
		grip14_r4.cubeList.add(new ModelBox(grip14_r4, 92, 104, 0.0F, -1.0F, 0.0F, 1, 1, 9, 0.001F, false));

		grip14_r5 = new ModelRenderer(this);
		grip14_r5.setRotationPoint(0.65F, -37.45F, -24.25F);
		gun.addChild(grip14_r5);
		setRotationAngle(grip14_r5, 0.0F, 0.0F, -0.2269F);
		grip14_r5.cubeList.add(new ModelBox(grip14_r5, 92, 177, -1.0F, -3.0F, 0.0F, 1, 3, 26, 0.001F, false));

		grip14_r6 = new ModelRenderer(this);
		grip14_r6.setRotationPoint(0.13F, -40.22F, -26.25F);
		gun.addChild(grip14_r6);
		setRotationAngle(grip14_r6, 0.0F, 0.0F, 0.2443F);
		grip14_r6.cubeList.add(new ModelBox(grip14_r6, 148, 200, -1.0F, 0.0F, 2.0F, 1, 1, 26, 0.001F, false));

		grip13_r6 = new ModelRenderer(this);
		grip13_r6.setRotationPoint(-3.65F, -37.45F, -15.25F);
		gun.addChild(grip13_r6);
		setRotationAngle(grip13_r6, 0.0F, 0.0F, 0.2269F);
		grip13_r6.cubeList.add(new ModelBox(grip13_r6, 0, 92, 0.0F, -3.0F, 1.0F, 1, 3, 16, 0.001F, false));

		grip14_r7 = new ModelRenderer(this);
		grip14_r7.setRotationPoint(-0.5F, -41.0F, -26.25F);
		gun.addChild(grip14_r7);
		setRotationAngle(grip14_r7, 0.0F, 0.0F, 0.8901F);
		grip14_r7.cubeList.add(new ModelBox(grip14_r7, 65, 92, -0.1F, -0.1F, -0.1F, 1, 1, 3, -0.1F, false));
		grip14_r7.cubeList.add(new ModelBox(grip14_r7, 87, 206, 0.0F, 0.0F, 2.0F, 1, 1, 26, 0.002F, false));

		grip13_r7 = new ModelRenderer(this);
		grip13_r7.setRotationPoint(-3.13F, -40.22F, -24.25F);
		gun.addChild(grip13_r7);
		setRotationAngle(grip13_r7, 0.0F, 0.0F, -0.2443F);
		grip13_r7.cubeList.add(new ModelBox(grip13_r7, 28, 205, 0.0F, 0.0F, 0.0F, 1, 1, 26, 0.001F, false));

		grip16_r1 = new ModelRenderer(this);
		grip16_r1.setRotationPoint(-3.75F, -38.05F, -14.25F);
		gun.addChild(grip16_r1);
		setRotationAngle(grip16_r1, 0.0F, 0.0F, 0.2443F);
		grip16_r1.cubeList.add(new ModelBox(grip16_r1, 55, 129, 0.0F, -2.0F, 6.0F, 1, 1, 1, 0.001F, false));
		grip16_r1.cubeList.add(new ModelBox(grip16_r1, 0, 67, 0.0F, -3.0F, -1.0F, 1, 1, 8, 0.002F, false));
		grip16_r1.cubeList.add(new ModelBox(grip16_r1, 36, 118, 0.0F, -1.0F, 0.0F, 1, 1, 7, 0.001F, false));

		grip16_r2 = new ModelRenderer(this);
		grip16_r2.setRotationPoint(-3.75F, -38.05F, -14.15F);
		gun.addChild(grip16_r2);
		setRotationAngle(grip16_r2, -0.4363F, 0.0F, 0.2443F);
		grip16_r2.cubeList.add(new ModelBox(grip16_r2, 129, 40, -0.25F, -3.1F, -0.9F, 1, 1, 1, -0.2F, false));
		grip16_r2.cubeList.add(new ModelBox(grip16_r2, 51, 129, -0.25F, -1.2F, 0.0F, 1, 1, 1, -0.2F, false));

		grip17_r2 = new ModelRenderer(this);
		grip17_r2.setRotationPoint(-3.75F, -38.05F, -11.9F);
		gun.addChild(grip17_r2);
		setRotationAngle(grip17_r2, -0.4363F, 0.0F, 0.2443F);
		grip17_r2.cubeList.add(new ModelBox(grip17_r2, 39, 129, -0.25F, -3.1F, -0.9F, 1, 1, 1, -0.2F, false));
		grip17_r2.cubeList.add(new ModelBox(grip17_r2, 43, 129, -0.25F, -1.2F, 0.0F, 1, 1, 1, -0.2F, false));

		grip18_r1 = new ModelRenderer(this);
		grip18_r1.setRotationPoint(-3.75F, -38.05F, -9.65F);
		gun.addChild(grip18_r1);
		setRotationAngle(grip18_r1, -0.4363F, 0.0F, 0.2443F);
		grip18_r1.cubeList.add(new ModelBox(grip18_r1, 129, 38, -0.25F, -3.1F, -0.9F, 1, 1, 1, -0.2F, false));
		grip18_r1.cubeList.add(new ModelBox(grip18_r1, 129, 42, -0.25F, -1.2F, 0.0F, 1, 1, 1, -0.2F, false));

		grip12_r11 = new ModelRenderer(this);
		grip12_r11.setRotationPoint(-3.75F, -33.25F, -3.75F);
		gun.addChild(grip12_r11);
		setRotationAngle(grip12_r11, -0.2618F, 0.0244F, 0.0F);
		grip12_r11.cubeList.add(new ModelBox(grip12_r11, 46, 83, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.001F, false));

		grip13_r8 = new ModelRenderer(this);
		grip13_r8.setRotationPoint(-3.95F, -33.55F, -3.05F);
		gun.addChild(grip13_r8);
		setRotationAngle(grip13_r8, -0.6632F, 0.0244F, 0.0F);
		grip13_r8.cubeList.add(new ModelBox(grip13_r8, 36, 92, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.001F, false));

		grip12_r12 = new ModelRenderer(this);
		grip12_r12.setRotationPoint(0.95F, -33.55F, -3.05F);
		gun.addChild(grip12_r12);
		setRotationAngle(grip12_r12, -0.6632F, -0.0244F, 0.0F);
		grip12_r12.cubeList.add(new ModelBox(grip12_r12, 52, 92, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.001F, false));

		grip14_r8 = new ModelRenderer(this);
		grip14_r8.setRotationPoint(0.85F, -34.35F, 0.05F);
		gun.addChild(grip14_r8);
		setRotationAngle(grip14_r8, -0.2618F, -0.0244F, 0.0F);
		grip14_r8.cubeList.add(new ModelBox(grip14_r8, 94, 129, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		grip14_r9 = new ModelRenderer(this);
		grip14_r9.setRotationPoint(-3.75F, -34.25F, -1.05F);
		gun.addChild(grip14_r9);
		setRotationAngle(grip14_r9, -0.2618F, 0.0244F, 0.0F);
		grip14_r9.cubeList.add(new ModelBox(grip14_r9, 86, 129, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		grip13_r9 = new ModelRenderer(this);
		grip13_r9.setRotationPoint(0.65F, -34.85F, -1.45F);
		gun.addChild(grip13_r9);
		setRotationAngle(grip13_r9, -0.2618F, -0.0244F, 0.0F);
		grip13_r9.cubeList.add(new ModelBox(grip13_r9, 129, 99, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		grip14_r10 = new ModelRenderer(this);
		grip14_r10.setRotationPoint(-3.75F, -33.95F, -5.35F);
		gun.addChild(grip14_r10);
		setRotationAngle(grip14_r10, -0.2618F, 0.0244F, 0.0F);
		grip14_r10.cubeList.add(new ModelBox(grip14_r10, 129, 85, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));

		grip13_r10 = new ModelRenderer(this);
		grip13_r10.setRotationPoint(0.75F, -33.95F, -5.35F);
		gun.addChild(grip13_r10);
		setRotationAngle(grip13_r10, -0.2618F, -0.0244F, 0.0F);
		grip13_r10.cubeList.add(new ModelBox(grip13_r10, 129, 93, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));

		grip12_r13 = new ModelRenderer(this);
		grip12_r13.setRotationPoint(0.75F, -32.55F, -4.85F);
		gun.addChild(grip12_r13);
		setRotationAngle(grip12_r13, -0.0873F, -0.0244F, 0.0F);
		grip12_r13.cubeList.add(new ModelBox(grip12_r13, 100, 129, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		grip11_r7 = new ModelRenderer(this);
		grip11_r7.setRotationPoint(0.75F, -33.25F, -3.75F);
		gun.addChild(grip11_r7);
		setRotationAngle(grip11_r7, -0.2618F, -0.0244F, 0.0F);
		grip11_r7.cubeList.add(new ModelBox(grip11_r7, 62, 83, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.001F, false));

		grip11_r8 = new ModelRenderer(this);
		grip11_r8.setRotationPoint(-3.65F, -31.25F, -11.25F);
		gun.addChild(grip11_r8);
		setRotationAngle(grip11_r8, 0.0F, 0.0244F, 0.0F);
		grip11_r8.cubeList.add(new ModelBox(grip11_r8, 86, 0, 0.0F, -5.0F, 0.0F, 2, 5, 10, 0.0F, false));

		grip10_r1 = new ModelRenderer(this);
		grip10_r1.setRotationPoint(0.65F, -31.25F, -11.25F);
		gun.addChild(grip10_r1);
		setRotationAngle(grip10_r1, 0.0F, -0.0244F, 0.0F);
		grip10_r1.cubeList.add(new ModelBox(grip10_r1, 49, 16, -3.0F, -5.0F, 0.0F, 3, 5, 10, 0.002F, false));

		grip10_r2 = new ModelRenderer(this);
		grip10_r2.setRotationPoint(0.5F, -31.25F, -1.15F);
		gun.addChild(grip10_r2);
		setRotationAngle(grip10_r2, 0.2269F, 0.0F, 0.0F);
		grip10_r2.cubeList.add(new ModelBox(grip10_r2, 23, 0, -1.0F, -6.0F, 1.8F, 1, 6, 4, -0.001F, false));
		grip10_r2.cubeList.add(new ModelBox(grip10_r2, 23, 21, -4.0F, -5.9F, -0.2F, 4, 6, 6, -0.099F, false));

		rail2 = new ModelRenderer(this);
		rail2.setRotationPoint(-0.7F, -41.5F, -30.0F);
		gun.addChild(rail2);
		setRotationAngle(rail2, 0.0F, 0.0F, -3.1416F);
		rail2.cubeList.add(new ModelBox(rail2, 92, 123, -0.2F, -0.2F, 12.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 86, 123, -0.2F, -0.2F, 13.3F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 80, 123, -0.2F, -0.2F, 14.55F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 74, 123, -0.2F, -0.2F, 15.8F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 24, 123, -0.2F, -0.2F, 18.3F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 36, 123, -0.2F, -0.2F, 17.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 12, 123, -0.2F, -0.2F, 20.8F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 18, 123, -0.2F, -0.2F, 19.55F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 0, 123, -0.2F, -0.2F, 23.3F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 6, 123, -0.2F, -0.2F, 22.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 122, 77, -0.2F, -0.2F, 25.8F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 122, 80, -0.2F, -0.2F, 24.55F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 53, 108, -0.2F, -0.2F, 28.3F, 2, 1, 2, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 122, 74, -0.2F, -0.2F, 27.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 122, 71, -0.2F, -0.2F, 29.85F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 123, 65, -0.2F, -0.2F, 7.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 63, 123, -0.2F, -0.2F, 8.3F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 57, 123, -0.2F, -0.2F, 9.55F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 51, 123, -0.2F, -0.2F, 10.8F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 45, 123, -0.2F, -0.2F, 5.8F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 76, 108, -0.2F, -0.2F, 3.55F, 2, 1, 2, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.6F, 4.75F);
		rail2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.9425F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 118, -0.2F, -0.8F, -1.2F, 1, 1, 2, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 130, 73, -0.2F, -0.8F, 1.05F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 128, 130, -0.2F, -0.8F, 6.05F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 4, 131, -0.2F, -0.8F, 4.8F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 131, -0.2F, -0.8F, 3.55F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 131, -0.2F, -0.8F, 2.3F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 104, 129, -0.2F, -0.8F, 25.1F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 115, 84, -0.2F, -0.8F, 23.55F, 1, 1, 2, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 129, 107, -0.2F, -0.8F, 22.3F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 129, 111, -0.2F, -0.8F, 21.05F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 129, 109, -0.2F, -0.8F, 19.8F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 120, 129, -0.2F, -0.8F, 18.55F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 116, 129, -0.2F, -0.8F, 17.3F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 130, 51, -0.2F, -0.8F, 16.05F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 130, 49, -0.2F, -0.8F, 14.8F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 66, 130, -0.2F, -0.8F, 13.55F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 130, 59, -0.2F, -0.8F, 12.3F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 131, -0.2F, -0.8F, 11.05F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 43, 131, -0.2F, -0.8F, 9.8F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 55, 131, -0.2F, -0.8F, 8.55F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 131, 61, -0.2F, -0.8F, 7.3F, 1, 1, 1, -0.202F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 120, 189, -0.1F, -0.9F, -0.45F, 1, 1, 26, -0.3F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.6F, 0.6F, 4.75F);
		rail2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.9425F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 118, -0.8F, -0.8F, -1.2F, 1, 1, 2, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 130, 76, -0.8F, -0.8F, 1.05F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 130, 79, -0.8F, -0.8F, 6.05F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 131, -0.8F, -0.8F, 4.8F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 131, -0.8F, -0.8F, 3.55F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 131, -0.8F, -0.8F, 2.3F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 117, 87, -0.8F, -0.8F, 23.55F, 1, 1, 2, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 129, 105, -0.8F, -0.8F, 25.1F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 108, 129, -0.8F, -0.8F, 22.3F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 129, 113, -0.8F, -0.8F, 21.05F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 112, 129, -0.8F, -0.8F, 19.8F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 130, 47, -0.8F, -0.8F, 18.55F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 130, -0.8F, -0.8F, 17.3F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 130, 56, -0.8F, -0.8F, 16.05F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 130, 54, -0.8F, -0.8F, 14.8F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 130, 70, -0.8F, -0.8F, 13.55F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 130, 68, -0.8F, -0.8F, 12.3F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 131, -0.8F, -0.8F, 11.05F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 131, -0.8F, -0.8F, 9.8F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 131, -0.8F, -0.8F, 8.55F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 59, 131, -0.8F, -0.8F, 7.3F, 1, 1, 1, -0.202F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 189, 115, -0.9F, -0.9F, -0.45F, 1, 1, 26, -0.3F, false));

		stock = new QRenderer(this);
		stock.setRotationPoint(0.0F, -12.25F, 1.7F);
		stock.cubeList.add(new ModelBox(stock, 103, 94, -0.1F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 65, 103, -0.1F, -1.65F, 0.0F, 1, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 30, 87, -4.25F, -2.4F, 2.9F, 3, 2, 2, 0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 20, 87, -4.25F, -0.9F, 2.9F, 3, 2, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 92, 98, -3.9F, -1.65F, 0.0F, 1, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 82, 100, -3.9F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.9F, -1.65F, 0.0F);
		stock.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.8727F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 76, 97, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.7F, -1.65F, 0.0F);
		stock.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.2443F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 63, 131, 0.0F, -1.4F, 0.7F, 1, 1, 1, -0.001F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 97, 94, 0.0F, -2.2F, 0.0F, 1, 2, 1, 0.001F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 118, 49, 0.0F, -0.8F, 1.0F, 1, 1, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.7F, -1.65F, 0.0F);
		stock.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.6981F, 0.0F, 0.2443F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 97, 71, 0.0F, -2.5F, -1.2F, 1, 1, 3, 0.002F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.7F, -1.65F, 0.0F);
		stock.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.6981F, 0.0F, -0.2443F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 102, -1.0F, -2.5F, -1.2F, 1, 1, 3, 0.002F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.7F, -1.65F, 0.0F);
		stock.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.2443F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 51, 118, -1.0F, -0.8F, 1.0F, 1, 1, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 74, 131, -1.0F, -1.4F, 0.7F, 1, 1, 1, -0.001F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 97, 98, -1.0F, -2.2F, 0.0F, 1, 2, 1, 0.001F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.9F, -1.65F, 0.0F);
		stock.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.8727F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 53, 102, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.5F, -4.85F, 0.0F);
		stock.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.6981F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 71, 83, -2.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.5F, -0.6F, 4.9F);
		stock.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.2793F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 69, 36, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.5F, -2.65F, 1.9F);
		stock.addChild(bone);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.4014F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 97, 37, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.4014F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 65, 96, 0.5F, 0.0F, 0.0F, 1, 1, 3, -0.002F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 97, 41, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.5F, 1.35F, 1.9F);
		stock.addChild(bone4);
		

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.4014F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 82, 92, 0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 92, 84, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.001F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.4014F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 92, 88, -1.0F, -1.0F, 0.0F, 1, 1, 3, -0.001F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.5F, -0.65F, 1.9F);
		stock.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 1.5708F);
		

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.4014F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 92, 94, 0.5F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 10, 21, 0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.4014F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 96, -1.5F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 52, 96, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
		stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
