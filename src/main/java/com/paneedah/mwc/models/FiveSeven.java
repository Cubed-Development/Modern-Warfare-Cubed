package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FiveSeven extends ModelWithAttachments {
	private final QRenderer gun_body;
	private final ModelRenderer gun22_r1;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun22_r2;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun23_r2;
	private final ModelRenderer gun24_r1;
	private final ModelRenderer gun23_r3;
	private final ModelRenderer gun24_r2;
	private final ModelRenderer gun23_r4;
	private final ModelRenderer gun21_r2;
	private final ModelRenderer gun20_r1;
	private final ModelRenderer gun22_r3;
	private final ModelRenderer gun21_r3;
	private final ModelRenderer gun23_r5;
	private final ModelRenderer gun21_r4;
	private final ModelRenderer gun22_r4;
	private final ModelRenderer gun25_r1;
	private final ModelRenderer gun24_r3;
	private final ModelRenderer gun21_r5;
	private final ModelRenderer gun21_r6;
	private final ModelRenderer gun22_r5;
	private final ModelRenderer gun21_r7;
	private final ModelRenderer gun20_r2;
	private final ModelRenderer gun19_r1;
	private final ModelRenderer gun20_r3;
	private final ModelRenderer gun20_r4;
	private final ModelRenderer gun21_r8;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer gun27_r1;
	private final ModelRenderer gun24_r4;
	private final ModelRenderer gun20_r5;
	private final ModelRenderer gun21_r9;
	private final ModelRenderer gun23_r6;
	private final ModelRenderer gun22_r6;
	private final ModelRenderer gun23_r7;
	private final ModelRenderer gun24_r5;
	private final ModelRenderer gun22_r7;
	private final ModelRenderer gun22_r8;
	private final ModelRenderer gun22_r9;
	private final ModelRenderer gun22_r10;
	private final ModelRenderer gun21_r10;
	private final ModelRenderer gun23_r8;
	private final ModelRenderer gun25_r2;
	private final ModelRenderer gun24_r6;
	private final ModelRenderer gun21_r11;
	private final ModelRenderer gun20_r6;
	private final ModelRenderer gun20_r7;
	private final ModelRenderer gun19_r2;
	private final ModelRenderer gun18_r1;
	private final ModelRenderer gun17_r1;
	private final ModelRenderer gun17_r2;
	private final ModelRenderer gun18_r2;
	private final ModelRenderer gun18_r3;
	private final ModelRenderer gun17_r3;
	private final ModelRenderer gun20_r8;
	private final ModelRenderer gun20_r9;
	private final ModelRenderer gun19_r3;
	private final ModelRenderer gun20_r10;
	private final ModelRenderer gun18_r4;
	private final ModelRenderer gun18_r5;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer gun17_r4;
	private final ModelRenderer gun16_r1;
	private final ModelRenderer gun14_r1;
	private final ModelRenderer gun91_r1;
	private final ModelRenderer gun91_r2;
	private final ModelRenderer gun91_r3;
	private final ModelRenderer gun90_r1;

	public FiveSeven() {
		textureWidth = 128;
		textureHeight = 128;

		gun_body = new QRenderer(this);
		gun_body.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun_body.cubeList.add(new ModelBox(gun_body, 86, 47, -4.0F, -19.1F, -3.3F, 5, 2, 6, -0.001F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 0, 62, -3.0F, -19.1F, -4.3F, 3, 2, 1, -0.001F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 41, 56, -3.0F, -26.9F, -9.45F, 3, 1, 3, -0.001F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 73, 52, -2.0F, -30.65F, -10.65F, 1, 2, 1, 0.0F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 0, 0, -4.0F, -34.05F, -17.75F, 5, 2, 21, 0.0F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 48, 42, -4.0F, -34.05F, 2.95F, 5, 1, 1, -0.002F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 84, 13, -3.8F, -34.0F, -28.1F, 1, 1, 10, 0.0F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 12, 31, -3.5F, -34.0F, -29.1F, 4, 1, 2, 0.001F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 23, 48, -2.5F, -36.75F, -29.6F, 2, 2, 14, 0.0F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 62, 87, -3.6F, -36.4F, -16.25F, 1, 2, 7, 0.001F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 36, 11, -2.6F, -37.4F, -16.25F, 1, 2, 7, 0.001F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 29, 78, -3.0F, -32.55F, -26.95F, 3, 1, 9, 0.0F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 60, 67, -3.0F, -32.05F, -26.95F, 3, 1, 1, -0.001F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 50, 66, -3.0F, -32.05F, -25.2F, 3, 1, 1, -0.001F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 8, 66, -3.0F, -32.05F, -23.45F, 3, 1, 1, -0.001F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 0, 66, -3.0F, -32.05F, -21.7F, 3, 1, 1, -0.001F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 60, 65, -3.0F, -32.05F, -19.95F, 3, 1, 1, -0.001F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 58, 54, -3.0F, -33.55F, -19.95F, 3, 1, 2, 0.0F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 58, 37, -3.0F, -33.55F, -27.2F, 3, 1, 2, 0.0F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 71, 87, -2.9F, -33.55F, -25.7F, 1, 1, 6, 0.0F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 55, 87, -1.1F, -33.55F, -25.7F, 1, 1, 6, 0.0F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 83, 26, -0.2F, -34.0F, -28.1F, 1, 1, 10, 0.0F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 58, 51, -4.0F, -34.05F, -18.5F, 5, 2, 1, -0.001F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 54, 15, -4.0F, -32.05F, -6.5F, 5, 1, 7, 0.0F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 54, 0, -3.75F, -31.05F, -5.5F, 1, 3, 5, 0.0F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 33, 64, -3.0F, -32.6F, -16.9F, 3, 2, 11, 0.0F, false));
		gun_body.cubeList.add(new ModelBox(gun_body, 41, 48, -0.25F, -31.05F, -5.5F, 1, 3, 5, 0.0F, false));

		gun22_r1 = new ModelRenderer(this);
		gun22_r1.setRotationPoint(1.0F, -31.05F, 0.5F);
		gun_body.addChild(gun22_r1);
		setRotationAngle(gun22_r1, 0.1562F, 0.211F, -0.9259F);
		gun22_r1.cubeList.add(new ModelBox(gun22_r1, 11, 47, -1.0F, -1.0F, 0.0F, 1, 1, 4, -0.002F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(-4.0F, -31.05F, 0.5F);
		gun_body.addChild(gun21_r1);
		setRotationAngle(gun21_r1, 0.1562F, -0.211F, 0.9259F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 10, 57, 0.0F, -1.0F, 0.0F, 1, 1, 4, -0.002F, false));

		gun22_r2 = new ModelRenderer(this);
		gun22_r2.setRotationPoint(-3.0F, -30.85F, 2.4F);
		gun_body.addChild(gun22_r2);
		setRotationAngle(gun22_r2, 0.9076F, 0.0F, 0.0F);
		gun22_r2.cubeList.add(new ModelBox(gun22_r2, 54, 8, 0.0F, -2.05F, -3.0F, 3, 2, 3, -0.002F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(-3.0F, -32.05F, 4.95F);
		gun_body.addChild(gun23_r1);
		setRotationAngle(gun23_r1, -0.3665F, 0.0F, 0.0F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 69, 0, 0.0F, 0.0F, -1.0F, 3, 1, 1, -0.002F, false));

		gun23_r2 = new ModelRenderer(this);
		gun23_r2.setRotationPoint(-4.0F, -31.95F, 4.35F);
		gun_body.addChild(gun23_r2);
		setRotationAngle(gun23_r2, 0.192F, 0.0F, 0.0F);
		gun23_r2.cubeList.add(new ModelBox(gun23_r2, 58, 48, 0.0F, -2.0F, -1.0F, 5, 2, 1, -0.001F, false));

		gun24_r1 = new ModelRenderer(this);
		gun24_r1.setRotationPoint(0.0F, -32.05F, 4.95F);
		gun_body.addChild(gun24_r1);
		setRotationAngle(gun24_r1, 0.3516F, -0.9835F, -0.2964F);
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 73, 34, -1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun23_r3 = new ModelRenderer(this);
		gun23_r3.setRotationPoint(-3.0F, -32.05F, 4.95F);
		gun_body.addChild(gun23_r3);
		setRotationAngle(gun23_r3, 0.3516F, 0.9835F, 0.2964F);
		gun23_r3.cubeList.add(new ModelBox(gun23_r3, 73, 46, 0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun24_r2 = new ModelRenderer(this);
		gun24_r2.setRotationPoint(-3.0F, -32.25F, 4.25F);
		gun_body.addChild(gun24_r2);
		setRotationAngle(gun24_r2, 0.192F, 0.0F, 0.0F);
		gun24_r2.cubeList.add(new ModelBox(gun24_r2, 50, 68, 0.0F, -2.7F, -0.8F, 3, 1, 1, 0.0F, false));

		gun23_r4 = new ModelRenderer(this);
		gun23_r4.setRotationPoint(-3.0F, -32.05F, 4.95F);
		gun_body.addChild(gun23_r4);
		setRotationAngle(gun23_r4, 0.192F, 0.0F, 0.0F);
		gun23_r4.cubeList.add(new ModelBox(gun23_r4, 0, 69, 0.0F, -2.7F, -0.8F, 3, 1, 1, -0.201F, false));
		gun23_r4.cubeList.add(new ModelBox(gun23_r4, 48, 38, 0.0F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun21_r2 = new ModelRenderer(this);
		gun21_r2.setRotationPoint(-3.0F, -31.05F, 0.5F);
		gun_body.addChild(gun21_r2);
		setRotationAngle(gun21_r2, 0.2618F, 0.0F, 0.0F);
		gun21_r2.cubeList.add(new ModelBox(gun21_r2, 18, 92, 0.0F, -0.05F, 0.0F, 3, 1, 4, -0.001F, false));
		gun21_r2.cubeList.add(new ModelBox(gun21_r2, 37, 88, -1.0F, -1.0F, 0.0F, 5, 1, 3, -0.001F, false));

		gun20_r1 = new ModelRenderer(this);
		gun20_r1.setRotationPoint(-4.0F, -31.05F, -6.5F);
		gun_body.addChild(gun20_r1);
		setRotationAngle(gun20_r1, -0.3665F, 0.0F, 0.0F);
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 23, 64, 0.0F, -1.0F, -3.0F, 5, 1, 3, -0.001F, false));

		gun22_r3 = new ModelRenderer(this);
		gun22_r3.setRotationPoint(0.75F, -31.05F, -0.5F);
		gun_body.addChild(gun22_r3);
		setRotationAngle(gun22_r3, 0.0F, -0.4538F, 0.0F);
		gun22_r3.cubeList.add(new ModelBox(gun22_r3, 42, 24, -1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun21_r3 = new ModelRenderer(this);
		gun21_r3.setRotationPoint(-3.75F, -31.05F, -0.5F);
		gun_body.addChild(gun21_r3);
		setRotationAngle(gun21_r3, 0.0F, 0.4538F, 0.0F);
		gun21_r3.cubeList.add(new ModelBox(gun21_r3, 11, 47, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun23_r5 = new ModelRenderer(this);
		gun23_r5.setRotationPoint(-3.0F, -30.6F, -16.9F);
		gun_body.addChild(gun23_r5);
		setRotationAngle(gun23_r5, -0.6458F, 0.0F, 0.0F);
		gun23_r5.cubeList.add(new ModelBox(gun23_r5, 58, 33, 0.0F, -2.0F, -2.0F, 3, 2, 2, 0.001F, false));

		gun21_r4 = new ModelRenderer(this);
		gun21_r4.setRotationPoint(-3.0F, -30.35F, -7.9F);
		gun_body.addChild(gun21_r4);
		setRotationAngle(gun21_r4, 0.2443F, 0.0F, 0.0F);
		gun21_r4.cubeList.add(new ModelBox(gun21_r4, 12, 23, 0.0F, -1.0F, 0.0F, 3, 6, 2, -0.002F, false));

		gun22_r4 = new ModelRenderer(this);
		gun22_r4.setRotationPoint(0.75F, -31.05F, -5.5F);
		gun_body.addChild(gun22_r4);
		setRotationAngle(gun22_r4, 0.0F, 0.4189F, 0.0F);
		gun22_r4.cubeList.add(new ModelBox(gun22_r4, 0, 35, -1.0F, 0.0F, -2.0F, 1, 4, 2, 0.0F, false));

		gun25_r1 = new ModelRenderer(this);
		gun25_r1.setRotationPoint(1.25F, -27.3F, -5.5F);
		gun_body.addChild(gun25_r1);
		setRotationAngle(gun25_r1, 0.2793F, 0.4189F, 0.0F);
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 74, 17, -1.4F, 0.0F, -2.0F, 1, 1, 1, -0.002F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 4, 74, -1.0F, 0.0F, -1.5F, 1, 1, 1, -0.001F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 0, 74, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun24_r3 = new ModelRenderer(this);
		gun24_r3.setRotationPoint(-4.25F, -27.3F, -5.5F);
		gun_body.addChild(gun24_r3);
		setRotationAngle(gun24_r3, 0.2793F, -0.4189F, 0.0F);
		gun24_r3.cubeList.add(new ModelBox(gun24_r3, 44, 79, 0.4F, 0.0F, -2.0F, 1, 1, 1, -0.002F, false));
		gun24_r3.cubeList.add(new ModelBox(gun24_r3, 79, 49, 0.0F, 0.0F, -1.5F, 1, 1, 1, -0.001F, false));
		gun24_r3.cubeList.add(new ModelBox(gun24_r3, 79, 52, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun21_r5 = new ModelRenderer(this);
		gun21_r5.setRotationPoint(-3.75F, -31.05F, -5.5F);
		gun_body.addChild(gun21_r5);
		setRotationAngle(gun21_r5, 0.0F, -0.4189F, 0.0F);
		gun21_r5.cubeList.add(new ModelBox(gun21_r5, 16, 35, 0.0F, 0.0F, -2.0F, 1, 4, 2, 0.0F, false));

		gun21_r6 = new ModelRenderer(this);
		gun21_r6.setRotationPoint(1.0F, -31.05F, -0.5F);
		gun_body.addChild(gun21_r6);
		setRotationAngle(gun21_r6, 0.0F, 0.0F, 0.4363F);
		gun21_r6.cubeList.add(new ModelBox(gun21_r6, 87, 79, -1.0F, 0.0F, -6.0F, 1, 1, 6, -0.001F, false));

		gun22_r5 = new ModelRenderer(this);
		gun22_r5.setRotationPoint(1.0F, -31.05F, -0.5F);
		gun_body.addChild(gun22_r5);
		setRotationAngle(gun22_r5, -0.0192F, -0.121F, 0.5593F);
		gun22_r5.cubeList.add(new ModelBox(gun22_r5, 67, 79, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

		gun21_r7 = new ModelRenderer(this);
		gun21_r7.setRotationPoint(-4.0F, -31.05F, -0.5F);
		gun_body.addChild(gun21_r7);
		setRotationAngle(gun21_r7, -0.0192F, 0.121F, -0.5593F);
		gun21_r7.cubeList.add(new ModelBox(gun21_r7, 75, 79, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

		gun20_r2 = new ModelRenderer(this);
		gun20_r2.setRotationPoint(-4.0F, -31.05F, -0.5F);
		gun_body.addChild(gun20_r2);
		setRotationAngle(gun20_r2, 0.0F, 0.0F, -0.4363F);
		gun20_r2.cubeList.add(new ModelBox(gun20_r2, 87, 87, 0.0F, 0.0F, -6.0F, 1, 1, 6, -0.001F, false));

		gun19_r1 = new ModelRenderer(this);
		gun19_r1.setRotationPoint(-4.0F, -32.05F, -18.5F);
		gun_body.addChild(gun19_r1);
		setRotationAngle(gun19_r1, -1.309F, 0.0F, 0.0F);
		gun19_r1.cubeList.add(new ModelBox(gun19_r1, 0, 18, 0.0F, -1.0F, -2.0F, 5, 1, 2, -0.002F, false));

		gun20_r3 = new ModelRenderer(this);
		gun20_r3.setRotationPoint(1.0F, -32.05F, -5.9F);
		gun_body.addChild(gun20_r3);
		setRotationAngle(gun20_r3, 0.0F, 0.0F, 0.5934F);
		gun20_r3.cubeList.add(new ModelBox(gun20_r3, 50, 75, -1.0F, 0.0F, -11.0F, 1, 1, 11, 0.0F, false));
		gun20_r3.cubeList.add(new ModelBox(gun20_r3, 73, 46, -1.0F, 0.75F, -11.0F, 1, 1, 11, -0.001F, false));

		gun20_r4 = new ModelRenderer(this);
		gun20_r4.setRotationPoint(-4.0F, -32.05F, -5.9F);
		gun_body.addChild(gun20_r4);
		setRotationAngle(gun20_r4, 0.0F, 0.0F, -0.5934F);
		gun20_r4.cubeList.add(new ModelBox(gun20_r4, 75, 58, 0.0F, 0.75F, -11.0F, 1, 1, 11, -0.001F, false));
		gun20_r4.cubeList.add(new ModelBox(gun20_r4, 74, 75, 0.0F, 0.0F, -11.0F, 1, 1, 11, 0.0F, false));

		gun21_r8 = new ModelRenderer(this);
		gun21_r8.setRotationPoint(-3.0F, -31.55F, -26.95F);
		gun_body.addChild(gun21_r8);
		setRotationAngle(gun21_r8, -1.1868F, 0.0F, 0.0F);
		gun21_r8.cubeList.add(new ModelBox(gun21_r8, 10, 62, 0.0F, -1.0F, -2.0F, 3, 1, 2, -0.001F, false));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(-3.0F, -31.05F, -18.95F);
		gun_body.addChild(gun26_r1);
		setRotationAngle(gun26_r1, 0.0F, 0.0F, 0.9076F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 63, 75, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 75, 65, -1.0F, -1.0F, -2.75F, 1, 1, 1, 0.0F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 75, 67, -1.0F, -1.0F, -4.5F, 1, 1, 1, 0.0F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 75, 75, -1.0F, -1.0F, -6.25F, 1, 1, 1, 0.0F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 28, 88, -1.2F, -1.0F, -7.3F, 1, 1, 7, -0.201F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 76, 1, -1.0F, -1.0F, -8.0F, 1, 1, 1, 0.0F, false));

		gun27_r1 = new ModelRenderer(this);
		gun27_r1.setRotationPoint(0.0F, -31.05F, -18.95F);
		gun_body.addChild(gun27_r1);
		setRotationAngle(gun27_r1, 0.0F, 0.0F, -0.9076F);
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 75, 61, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 75, 63, 0.0F, -1.0F, -2.75F, 1, 1, 1, 0.0F, false));
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 67, 75, 0.0F, -1.0F, -4.5F, 1, 1, 1, 0.0F, false));
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 75, 70, 0.0F, -1.0F, -6.25F, 1, 1, 1, 0.0F, false));
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 0, 76, 0.0F, -1.0F, -8.0F, 1, 1, 1, 0.0F, false));
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 19, 81, 0.2F, -1.0F, -7.3F, 1, 1, 7, -0.201F, false));

		gun24_r4 = new ModelRenderer(this);
		gun24_r4.setRotationPoint(-3.6F, -36.4F, -16.25F);
		gun_body.addChild(gun24_r4);
		setRotationAngle(gun24_r4, 0.0F, 0.0F, -0.7854F);
		gun24_r4.cubeList.add(new ModelBox(gun24_r4, 44, 77, 0.4F, 0.0F, 0.0F, 1, 2, 7, -0.001F, false));
		gun24_r4.cubeList.add(new ModelBox(gun24_r4, 46, 87, 0.0F, 0.0F, 0.0F, 1, 2, 7, 0.0F, false));

		gun20_r5 = new ModelRenderer(this);
		gun20_r5.setRotationPoint(1.15F, -33.25F, 3.25F);
		gun_body.addChild(gun20_r5);
		setRotationAngle(gun20_r5, 0.4189F, 0.0F, 0.0F);
		gun20_r5.cubeList.add(new ModelBox(gun20_r5, 14, 75, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.1F, false));
		gun20_r5.cubeList.add(new ModelBox(gun20_r5, 27, 75, -5.3F, 0.0F, -1.0F, 1, 1, 1, -0.1F, false));

		gun21_r9 = new ModelRenderer(this);
		gun21_r9.setRotationPoint(1.15F, -33.25F, -0.35F);
		gun_body.addChild(gun21_r9);
		setRotationAngle(gun21_r9, 0.4189F, 0.0F, 0.0F);
		gun21_r9.cubeList.add(new ModelBox(gun21_r9, 7, 75, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.1F, false));
		gun21_r9.cubeList.add(new ModelBox(gun21_r9, 75, 23, -5.3F, 0.0F, -1.0F, 1, 1, 1, -0.1F, false));

		gun23_r6 = new ModelRenderer(this);
		gun23_r6.setRotationPoint(1.05F, -32.35F, -15.75F);
		gun_body.addChild(gun23_r6);
		setRotationAngle(gun23_r6, 0.4189F, 0.0F, 0.0F);
		gun23_r6.cubeList.add(new ModelBox(gun23_r6, 74, 26, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
		gun23_r6.cubeList.add(new ModelBox(gun23_r6, 75, 15, -5.1F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun22_r6 = new ModelRenderer(this);
		gun22_r6.setRotationPoint(1.05F, -32.35F, -9.25F);
		gun_body.addChild(gun22_r6);
		setRotationAngle(gun22_r6, 0.4189F, 0.0F, 0.0F);
		gun22_r6.cubeList.add(new ModelBox(gun22_r6, 74, 20, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
		gun22_r6.cubeList.add(new ModelBox(gun22_r6, 21, 75, -5.1F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun23_r7 = new ModelRenderer(this);
		gun23_r7.setRotationPoint(1.4F, -32.85F, -12.65F);
		gun_body.addChild(gun23_r7);
		setRotationAngle(gun23_r7, 0.1777F, 0.189F, 0.0337F);
		gun23_r7.cubeList.add(new ModelBox(gun23_r7, 67, 68, -1.0F, 0.0F, -1.35F, 1, 1, 1, -0.201F, false));
		gun23_r7.cubeList.add(new ModelBox(gun23_r7, 67, 64, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.2F, false));

		gun24_r5 = new ModelRenderer(this);
		gun24_r5.setRotationPoint(1.4F, -32.85F, -12.65F);
		gun_body.addChild(gun24_r5);
		setRotationAngle(gun24_r5, -0.3284F, 0.189F, 0.0337F);
		gun24_r5.cubeList.add(new ModelBox(gun24_r5, 67, 66, -1.0F, -0.9F, -1.35F, 1, 1, 1, -0.201F, false));
		gun24_r5.cubeList.add(new ModelBox(gun24_r5, 67, 56, -1.0F, -0.9F, -1.0F, 1, 1, 1, -0.2F, false));

		gun22_r7 = new ModelRenderer(this);
		gun22_r7.setRotationPoint(-4.4F, -32.85F, -12.65F);
		gun_body.addChild(gun22_r7);
		setRotationAngle(gun22_r7, -0.3284F, -0.189F, -0.0337F);
		gun22_r7.cubeList.add(new ModelBox(gun22_r7, 73, 28, 0.0F, -0.9F, -1.0F, 1, 1, 1, -0.2F, false));
		gun22_r7.cubeList.add(new ModelBox(gun22_r7, 38, 72, 0.0F, -0.9F, -1.35F, 1, 1, 1, -0.201F, false));

		gun22_r8 = new ModelRenderer(this);
		gun22_r8.setRotationPoint(-4.4F, -32.85F, -12.65F);
		gun_body.addChild(gun22_r8);
		setRotationAngle(gun22_r8, 0.1777F, -0.189F, -0.0337F);
		gun22_r8.cubeList.add(new ModelBox(gun22_r8, 73, 31, 0.0F, 0.0F, -1.35F, 1, 1, 1, -0.201F, false));
		gun22_r8.cubeList.add(new ModelBox(gun22_r8, 73, 55, 0.0F, 0.0F, -1.0F, 1, 1, 1, -0.2F, false));

		gun22_r9 = new ModelRenderer(this);
		gun22_r9.setRotationPoint(1.2F, -33.35F, -3.65F);
		gun_body.addChild(gun22_r9);
		setRotationAngle(gun22_r9, -0.0109F, 0.069F, -0.1575F);
		gun22_r9.cubeList.add(new ModelBox(gun22_r9, 58, 71, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun22_r10 = new ModelRenderer(this);
		gun22_r10.setRotationPoint(1.2F, -31.35F, -2.65F);
		gun_body.addChild(gun22_r10);
		setRotationAngle(gun22_r10, 0.0485F, 0.0F, 0.7666F);
		gun22_r10.cubeList.add(new ModelBox(gun22_r10, 54, 19, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		gun21_r10 = new ModelRenderer(this);
		gun21_r10.setRotationPoint(1.5F, -32.45F, -2.65F);
		gun_body.addChild(gun21_r10);
		setRotationAngle(gun21_r10, 0.0145F, 0.0683F, 0.2099F);
		gun21_r10.cubeList.add(new ModelBox(gun21_r10, 31, 59, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		gun23_r8 = new ModelRenderer(this);
		gun23_r8.setRotationPoint(1.1F, -33.75F, -18.85F);
		gun_body.addChild(gun23_r8);
		setRotationAngle(gun23_r8, 0.2094F, 0.192F, 0.0F);
		gun23_r8.cubeList.add(new ModelBox(gun23_r8, 39, 66, -1.0F, 0.7F, 0.0F, 1, 1, 1, -0.001F, false));
		gun23_r8.cubeList.add(new ModelBox(gun23_r8, 66, 54, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun25_r2 = new ModelRenderer(this);
		gun25_r2.setRotationPoint(1.3F, -33.95F, -17.95F);
		gun_body.addChild(gun25_r2);
		setRotationAngle(gun25_r2, 0.0F, 0.0F, 0.0F);
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 31, 18, -1.17F, 0.2F, 0.6F, 1, 1, 2, -0.101F, false));

		gun24_r6 = new ModelRenderer(this);
		gun24_r6.setRotationPoint(1.3F, -33.95F, -17.95F);
		gun_body.addChild(gun24_r6);
		setRotationAngle(gun24_r6, 0.1571F, 0.0F, 0.0F);
		gun24_r6.cubeList.add(new ModelBox(gun24_r6, 54, 3, -1.0F, 0.7F, 0.0F, 1, 1, 1, -0.101F, false));
		gun24_r6.cubeList.add(new ModelBox(gun24_r6, 63, 27, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun21_r11 = new ModelRenderer(this);
		gun21_r11.setRotationPoint(1.1F, -33.15F, -10.75F);
		gun_body.addChild(gun21_r11);
		setRotationAngle(gun21_r11, 0.2693F, -0.0305F, -0.0519F);
		gun21_r11.cubeList.add(new ModelBox(gun21_r11, 45, 15, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		gun20_r6 = new ModelRenderer(this);
		gun20_r6.setRotationPoint(-4.3F, -33.15F, -10.75F);
		gun_body.addChild(gun20_r6);
		setRotationAngle(gun20_r6, 0.2712F, -0.1209F, 0.0099F);
		gun20_r6.cubeList.add(new ModelBox(gun20_r6, 61, 0, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		gun20_r7 = new ModelRenderer(this);
		gun20_r7.setRotationPoint(1.3F, -34.15F, -10.15F);
		gun_body.addChild(gun20_r7);
		setRotationAngle(gun20_r7, 0.3665F, 0.0F, 0.0F);
		gun20_r7.cubeList.add(new ModelBox(gun20_r7, 38, 0, -1.05F, 0.0F, -2.0F, 1, 2, 2, -0.2F, false));
		gun20_r7.cubeList.add(new ModelBox(gun20_r7, 48, 48, -5.55F, 0.0F, -2.0F, 1, 2, 2, -0.2F, false));

		gun19_r2 = new ModelRenderer(this);
		gun19_r2.setRotationPoint(1.7F, -28.4F, -1.15F);
		gun_body.addChild(gun19_r2);
		setRotationAngle(gun19_r2, -0.1193F, 0.2981F, 0.4624F);
		gun19_r2.cubeList.add(new ModelBox(gun19_r2, 11, 0, -1.0F, 0.0F, -4.0F, 1, 1, 4, -0.002F, false));

		gun18_r1 = new ModelRenderer(this);
		gun18_r1.setRotationPoint(-4.7F, -28.4F, -1.15F);
		gun_body.addChild(gun18_r1);
		setRotationAngle(gun18_r1, -0.1193F, -0.2981F, -0.4624F);
		gun18_r1.cubeList.add(new ModelBox(gun18_r1, 36, 24, 0.0F, 0.0F, -4.0F, 1, 1, 4, -0.002F, false));

		gun17_r1 = new ModelRenderer(this);
		gun17_r1.setRotationPoint(-4.0F, -28.7F, -0.25F);
		gun_body.addChild(gun17_r1);
		setRotationAngle(gun17_r1, -0.2443F, 0.0F, 0.0F);
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 48, 24, 0.0F, 0.0F, -5.0F, 5, 4, 5, -0.002F, false));

		gun17_r2 = new ModelRenderer(this);
		gun17_r2.setRotationPoint(1.0F, -25.0F, 1.3F);
		gun_body.addChild(gun17_r2);
		setRotationAngle(gun17_r2, 0.2747F, -0.593F, -0.1562F);
		gun17_r2.cubeList.add(new ModelBox(gun17_r2, 24, 36, -1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F, false));
		gun17_r2.cubeList.add(new ModelBox(gun17_r2, 16, 5, -1.0F, 0.0F, 0.6F, 1, 6, 1, -0.001F, false));

		gun18_r2 = new ModelRenderer(this);
		gun18_r2.setRotationPoint(1.0F, -25.0F, 1.3F);
		gun_body.addChild(gun18_r2);
		setRotationAngle(gun18_r2, 0.6371F, 0.8542F, 0.509F);
		gun18_r2.cubeList.add(new ModelBox(gun18_r2, 31, 0, -1.0F, -4.0F, -1.0F, 1, 4, 1, -0.001F, false));
		gun18_r2.cubeList.add(new ModelBox(gun18_r2, 0, 0, -1.6F, -4.0F, -1.0F, 1, 4, 1, -0.002F, false));

		gun18_r3 = new ModelRenderer(this);
		gun18_r3.setRotationPoint(-4.0F, -25.0F, 1.3F);
		gun_body.addChild(gun18_r3);
		setRotationAngle(gun18_r3, 0.6371F, -0.8542F, -0.509F);
		gun18_r3.cubeList.add(new ModelBox(gun18_r3, 48, 24, 0.6F, -4.0F, -1.0F, 1, 4, 1, -0.002F, false));
		gun18_r3.cubeList.add(new ModelBox(gun18_r3, 41, 48, 0.0F, -4.0F, -1.0F, 1, 4, 1, -0.001F, false));

		gun17_r3 = new ModelRenderer(this);
		gun17_r3.setRotationPoint(-4.0F, -25.0F, 1.3F);
		gun_body.addChild(gun17_r3);
		setRotationAngle(gun17_r3, 0.4014F, 0.0F, 0.0F);
		gun17_r3.cubeList.add(new ModelBox(gun17_r3, 0, 57, 1.0F, -4.0F, -7.0F, 3, 4, 1, -0.001F, false));
		gun17_r3.cubeList.add(new ModelBox(gun17_r3, 0, 35, 0.0F, -4.0F, -6.0F, 5, 4, 6, -0.001F, false));

		gun20_r8 = new ModelRenderer(this);
		gun20_r8.setRotationPoint(-3.0F, -26.17F, -14.45F);
		gun_body.addChild(gun20_r8);
		setRotationAngle(gun20_r8, -0.5061F, 0.0F, 0.0F);
		gun20_r8.cubeList.add(new ModelBox(gun20_r8, 69, 2, 0.0F, -1.0F, -1.7F, 3, 1, 1, -0.002F, false));
		gun20_r8.cubeList.add(new ModelBox(gun20_r8, 69, 4, 0.0F, -1.0F, -1.0F, 3, 1, 1, -0.001F, false));

		gun20_r9 = new ModelRenderer(this);
		gun20_r9.setRotationPoint(-3.0F, -30.65F, -16.85F);
		gun_body.addChild(gun20_r9);
		setRotationAngle(gun20_r9, -0.5411F, 0.0F, 0.0F);
		gun20_r9.cubeList.add(new ModelBox(gun20_r9, 60, 62, 0.0F, -1.6F, 0.6F, 3, 2, 1, -0.001F, false));

		gun19_r3 = new ModelRenderer(this);
		gun19_r3.setRotationPoint(-3.0F, -30.65F, -16.85F);
		gun_body.addChild(gun19_r3);
		setRotationAngle(gun19_r3, 0.2443F, 0.0F, 0.0F);
		gun19_r3.cubeList.add(new ModelBox(gun19_r3, 48, 33, 0.0F, -0.2F, 0.0F, 3, 4, 1, 0.0F, false));

		gun20_r10 = new ModelRenderer(this);
		gun20_r10.setRotationPoint(-2.0F, -28.65F, -9.65F);
		gun_body.addChild(gun20_r10);
		setRotationAngle(gun20_r10, -0.6807F, 0.0F, 0.0F);
		gun20_r10.cubeList.add(new ModelBox(gun20_r10, 73, 49, 0.0F, 0.0F, -1.0F, 1, 2, 1, -0.001F, false));

		gun18_r4 = new ModelRenderer(this);
		gun18_r4.setRotationPoint(-3.0F, -25.9F, -9.45F);
		gun_body.addChild(gun18_r4);
		setRotationAngle(gun18_r4, -0.0524F, 0.0F, 0.0F);
		gun18_r4.cubeList.add(new ModelBox(gun18_r4, 27, 69, 0.0F, -1.0F, -5.0F, 3, 1, 5, 0.0F, false));

		gun18_r5 = new ModelRenderer(this);
		gun18_r5.setRotationPoint(-3.0F, -25.9F, -6.45F);
		gun_body.addChild(gun18_r5);
		setRotationAngle(gun18_r5, 0.7505F, 0.0F, 0.0F);
		gun18_r5.cubeList.add(new ModelBox(gun18_r5, 36, 29, 0.0F, -1.8F, -0.5F, 3, 3, 2, 0.0F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(-3.0F, -25.0F, 2.8F);
		gun_body.addChild(gun15_r1);
		setRotationAngle(gun15_r1, 0.4014F, 0.0F, 0.0F);
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 24, 24, 0.0F, -5.0F, -2.0F, 3, 5, 2, -0.001F, false));

		gun17_r4 = new ModelRenderer(this);
		gun17_r4.setRotationPoint(-4.0F, -25.0F, 1.3F);
		gun_body.addChild(gun17_r4);
		setRotationAngle(gun17_r4, 0.2747F, 0.593F, 0.1562F);
		gun17_r4.cubeList.add(new ModelBox(gun17_r4, 39, 36, 0.0F, 0.0F, 0.6F, 1, 6, 1, -0.001F, false));
		gun17_r4.cubeList.add(new ModelBox(gun17_r4, 31, 48, 0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F, false));

		gun16_r1 = new ModelRenderer(this);
		gun16_r1.setRotationPoint(-4.0F, -25.0F, 1.3F);
		gun_body.addChild(gun16_r1);
		setRotationAngle(gun16_r1, 0.2269F, 0.0F, 0.0F);
		gun16_r1.cubeList.add(new ModelBox(gun16_r1, 0, 47, 1.0F, 0.0F, -7.0F, 3, 6, 1, 0.0F, false));
		gun16_r1.cubeList.add(new ModelBox(gun16_r1, 0, 83, 0.0F, 0.0F, -6.0F, 5, 6, 6, 0.0F, false));

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(-3.0F, -25.0F, 2.8F);
		gun_body.addChild(gun14_r1);
		setRotationAngle(gun14_r1, 0.2269F, 0.0F, 0.0F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 0, 23, 0.0F, 0.0F, -2.0F, 3, 7, 2, -0.001F, false));

		gun91_r1 = new ModelRenderer(this);
		gun91_r1.setRotationPoint(-4.0F, -18.1F, 2.7F);
		gun_body.addChild(gun91_r1);
		setRotationAngle(gun91_r1, 0.0F, 0.6283F, 0.0F);
		gun91_r1.cubeList.add(new ModelBox(gun91_r1, 79, 55, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));
		gun91_r1.cubeList.add(new ModelBox(gun91_r1, 53, 79, 0.0F, -1.0F, 0.7F, 1, 1, 1, -0.002F, false));

		gun91_r2 = new ModelRenderer(this);
		gun91_r2.setRotationPoint(1.0F, -18.1F, 2.7F);
		gun_body.addChild(gun91_r2);
		setRotationAngle(gun91_r2, 0.0F, -0.6283F, 0.0F);
		gun91_r2.cubeList.add(new ModelBox(gun91_r2, 57, 79, -1.0F, -1.0F, 0.7F, 1, 1, 1, -0.002F, false));
		gun91_r2.cubeList.add(new ModelBox(gun91_r2, 63, 79, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		gun91_r3 = new ModelRenderer(this);
		gun91_r3.setRotationPoint(0.0F, -18.2F, 4.4F);
		gun_body.addChild(gun91_r3);
		setRotationAngle(gun91_r3, -0.1047F, 0.0F, 0.0F);
		gun91_r3.cubeList.add(new ModelBox(gun91_r3, 11, 52, -3.0F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

		gun90_r1 = new ModelRenderer(this);
		gun90_r1.setRotationPoint(1.0F, -16.3F, -0.3F);
		gun_body.addChild(gun90_r1);
		setRotationAngle(gun90_r1, -0.1047F, 0.0F, 0.0F);
		gun90_r1.cubeList.add(new ModelBox(gun90_r1, 70, 38, -5.0F, -2.0F, 0.0F, 5, 2, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun_body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
