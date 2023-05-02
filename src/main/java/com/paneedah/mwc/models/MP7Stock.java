package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MP7Stock extends ModelWithAttachments {
	private final ModelRenderer mag_40;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer mag_20;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer action;
	private final ModelRenderer milspec_stock;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final QRenderer stock;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun9_r2;
	private final ModelRenderer gun8_r2;
	private final ModelRenderer gun8_r3;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun10_r1;
	private final ModelRenderer gun10_r2;
	private final ModelRenderer gun10_r3;
	private final ModelRenderer gun9_r3;
	private final ModelRenderer gun10_r4;
	private final ModelRenderer gun9_r4;
	private final ModelRenderer gun10_r5;
	private final ModelRenderer gun9_r5;
	private final ModelRenderer grip;
	private final ModelRenderer bone9;
	private final ModelRenderer gun9_r6;
	private final ModelRenderer gun8_r4;
	private final ModelRenderer gun8_r5;
	private final ModelRenderer gun7_r2;
	private final ModelRenderer gun9_r7;
	private final ModelRenderer gun7_r3;
	private final ModelRenderer mp7_body;
	private final ModelRenderer gun7_r4;
	private final ModelRenderer universal_parts;
	private final ModelRenderer receiver;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun7_r5;
	private final ModelRenderer gun7_r6;
	private final ModelRenderer gun7_r7;
	private final ModelRenderer gun9_r8;
	private final ModelRenderer gun9_r9;
	private final ModelRenderer gun9_r10;
	private final ModelRenderer gun8_r6;
	private final ModelRenderer gun8_r7;
	private final ModelRenderer gun8_r8;
	private final ModelRenderer gun8_r9;
	private final ModelRenderer gun9_r11;
	private final ModelRenderer gun9_r12;
	private final ModelRenderer gun8_r10;
	private final ModelRenderer gun7_r8;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun5_r2;
	private final ModelRenderer gun10_r6;
	private final ModelRenderer gun9_r13;
	private final ModelRenderer gun7_r9;
	private final ModelRenderer gun7_r10;
	private final ModelRenderer gun10_r7;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun9_r14;
	private final ModelRenderer gun8_r11;
	private final ModelRenderer gun7_r11;
	private final ModelRenderer gun6_r2;
	private final ModelRenderer gun7_r12;
	private final ModelRenderer gun6_r3;
	private final ModelRenderer gun7_r13;
	private final ModelRenderer gun6_r4;
	private final ModelRenderer gun5_r3;
	private final ModelRenderer gun5_r4;
	private final ModelRenderer gun6_r5;
	private final ModelRenderer gun11_r2;
	private final ModelRenderer gun10_r8;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun11_r3;
	private final ModelRenderer gun10_r9;
	private final ModelRenderer gun9_r15;
	private final ModelRenderer gun11_r4;
	private final ModelRenderer gun10_r10;
	private final ModelRenderer gun9_r16;
	private final ModelRenderer gun10_r11;
	private final ModelRenderer gun9_r17;
	private final ModelRenderer gun8_r12;
	private final ModelRenderer receiver2;
	private final ModelRenderer gun6_r6;
	private final ModelRenderer gun8_r13;
	private final ModelRenderer gun8_r14;
	private final ModelRenderer gun8_r15;
	private final ModelRenderer gun10_r12;
	private final ModelRenderer gun10_r13;
	private final ModelRenderer gun10_r14;
	private final ModelRenderer gun9_r18;
	private final ModelRenderer gun9_r19;
	private final ModelRenderer gun9_r20;
	private final ModelRenderer gun9_r21;
	private final ModelRenderer gun10_r15;
	private final ModelRenderer gun9_r22;
	private final ModelRenderer gun8_r16;
	private final ModelRenderer gun8_r17;
	private final ModelRenderer gun9_r23;
	private final ModelRenderer gun8_r18;
	private final ModelRenderer gun9_r24;
	private final ModelRenderer gun10_r16;
	private final ModelRenderer gun8_r19;
	private final ModelRenderer gun7_r14;
	private final ModelRenderer gun7_r15;
	private final ModelRenderer gun9_r25;
	private final ModelRenderer gun7_r16;
	private final ModelRenderer gun8_r20;
	private final ModelRenderer gun10_r17;
	private final ModelRenderer gun7_r17;
	private final ModelRenderer gun11_r5;
	private final ModelRenderer gun10_r18;
	private final ModelRenderer gun8_r21;
	private final ModelRenderer gun7_r18;
	private final ModelRenderer gun9_r26;
	private final ModelRenderer gun8_r22;
	private final ModelRenderer gun7_r19;
	private final ModelRenderer gun8_r23;
	private final ModelRenderer gun7_r20;
	private final ModelRenderer gun8_r24;
	private final ModelRenderer gun7_r21;
	private final ModelRenderer gun6_r7;
	private final ModelRenderer gun6_r8;
	private final ModelRenderer gun25_r1;
	private final ModelRenderer gun12_r2;
	private final ModelRenderer gun11_r6;
	private final ModelRenderer gun13_r1;
	private final ModelRenderer gun12_r3;
	private final ModelRenderer gun11_r7;
	private final ModelRenderer gun10_r19;
	private final ModelRenderer gun12_r4;
	private final ModelRenderer gun11_r8;
	private final ModelRenderer gun10_r20;
	private final ModelRenderer gun11_r9;
	private final ModelRenderer gun10_r21;
	private final ModelRenderer gun9_r27;
	private final ModelRenderer bone;
	private final ModelRenderer gun12_r5;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer gun13_r2;
	private final ModelRenderer gun24_r1;
	private final ModelRenderer gun22_r1;
	private final ModelRenderer bone8;
	private final ModelRenderer gun14_r1;
	private final ModelRenderer gun25_r2;
	private final ModelRenderer gun23_r2;
	private final ModelRenderer bone3;
	private final ModelRenderer gun240_r1;
	private final ModelRenderer gun239_r1;
	private final ModelRenderer gun237_r1;
	private final ModelRenderer handle_and_trigger;
	private final ModelRenderer bone63;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone4;
	private final ModelRenderer bone7;
	private final ModelRenderer bone12;
	private final ModelRenderer gun76_r1;
	private final ModelRenderer gun77_r1;
	private final ModelRenderer gun76_r2;
	private final ModelRenderer gun75_r1;
	private final ModelRenderer pully;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;

	public MP7Stock() {
		textureWidth = 200;
		textureHeight = 200;

		mag_40 = new ModelRenderer(this);
		mag_40.setRotationPoint(0.2F, 7.9F, -2.8F);
		mag_40.cubeList.add(new ModelBox(mag_40, 39, 77, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));
		mag_40.cubeList.add(new ModelBox(mag_40, 39, 32, -2.45F, -0.999F, 0.55F, 2, 1, 4, 0.0F, false));
		mag_40.cubeList.add(new ModelBox(mag_40, 23, 56, -2.65F, -0.998F, -0.7F, 2, 1, 2, 0.0F, false));
		mag_40.cubeList.add(new ModelBox(mag_40, 16, 56, -2.7F, -9.799F, 1.55F, 2, 5, 3, 0.0F, false));
		mag_40.cubeList.add(new ModelBox(mag_40, 10, 63, -2.2F, -9.999F, 3.75F, 1, 5, 1, 0.0F, false));
		mag_40.cubeList.add(new ModelBox(mag_40, 6, 76, -1.5F, -10.599F, 1.75F, 1, 1, 3, -0.2F, false));
		mag_40.cubeList.add(new ModelBox(mag_40, 67, 9, -2.9F, -10.599F, 1.75F, 1, 1, 3, -0.2F, false));
		mag_40.cubeList.add(new ModelBox(mag_40, 19, 0, -2.7F, -9.799F, -0.05F, 2, 5, 1, 0.0F, false));
		mag_40.cubeList.add(new ModelBox(mag_40, 0, 43, -2.7F, -9.799F, 0.75F, 2, 1, 1, -0.001F, false));
		mag_40.cubeList.add(new ModelBox(mag_40, 49, 16, -1.8F, -8.799F, 0.75F, 1, 8, 1, -0.001F, false));
		mag_40.cubeList.add(new ModelBox(mag_40, 12, 19, -2.6F, -8.799F, 0.75F, 1, 8, 1, -0.001F, false));
		mag_40.cubeList.add(new ModelBox(mag_40, 26, 76, -2.95F, -0.997F, 0.55F, 1, 1, 4, 0.001F, false));
		mag_40.cubeList.add(new ModelBox(mag_40, 63, 16, -2.75F, -0.998F, -0.7F, 1, 1, 2, 0.001F, false));
		mag_40.cubeList.add(new ModelBox(mag_40, 16, 76, -3.4F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-7.3F, -7.199F, 4.55F);
		mag_40.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.9599F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 68, 0, -0.2F, -6.4F, -2.8F, 1, 1, 3, -0.201F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.9F, -7.199F, 4.55F);
		mag_40.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.9599F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 68, 4, -0.8F, -6.4F, -2.8F, 1, 1, 3, -0.201F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.2F, -4.999F, 4.75F);
		mag_40.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0524F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 47, -1.0F, 0.0F, -1.0F, 1, 5, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.7F, -4.799F, 4.55F);
		mag_40.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0524F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 38, -2.0F, 0.2F, -4.6F, 2, 4, 1, 0.001F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 63, 21, -2.0F, 0.0F, -3.0F, 2, 4, 3, 0.001F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.75F, 0.0F, 0.3F);
		mag_40.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 0, -2.0F, 0.002F, -1.0F, 1, 8, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 70, 15, -1.9F, 0.002F, -1.0F, 2, 8, 1, -0.001F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.2F, 0.0F, 4.0F);
		mag_40.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -2.0F, 0.002F, -4.0F, 2, 9, 4, -0.001F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 9, -2.1F, 8.202F, -4.8F, 2, 1, 5, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 39, -0.9F, 8.202F, -4.8F, 2, 1, 5, -0.001F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 19, -1.0F, 0.002F, -4.0F, 2, 9, 4, -0.001F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.2F, 0.25F, 4.65F);
		mag_40.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 38, -2.0F, 8.002F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.7F, 0.0F, 4.55F);
		mag_40.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 65, -2.0F, 0.002F, -1.0F, 2, 9, 1, -0.001F, false));

		mag_20 = new ModelRenderer(this);
		mag_20.setRotationPoint(0.2F, 7.9F, -2.8F);
		mag_20.cubeList.add(new ModelBox(mag_20, 78, 0, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 51, 32, -2.45F, -0.999F, 0.55F, 2, 1, 4, 0.0F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 55, 66, -2.65F, -0.998F, -0.7F, 2, 1, 2, 0.0F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 56, 16, -2.7F, -9.799F, 1.55F, 2, 5, 3, 0.0F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 88, 62, -2.2F, -9.999F, 3.75F, 1, 5, 1, 0.0F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 22, 81, -1.5F, -10.599F, 1.75F, 1, 1, 3, -0.2F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 45, 77, -2.9F, -10.599F, 1.75F, 1, 1, 3, -0.2F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 19, 9, -2.7F, -9.799F, -0.05F, 2, 5, 1, 0.0F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 47, 51, -2.7F, -9.799F, 0.75F, 2, 1, 1, -0.001F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 72, 27, -1.8F, -8.799F, 0.75F, 1, 8, 1, -0.001F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 33, 56, -2.6F, -8.799F, 0.75F, 1, 8, 1, -0.001F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 55, 77, -2.95F, -0.997F, 0.55F, 1, 1, 4, 0.001F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 24, 65, -2.75F, -0.998F, -0.7F, 1, 1, 2, 0.001F, false));
		mag_20.cubeList.add(new ModelBox(mag_20, 65, 77, -3.4F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-7.3F, -7.199F, 4.55F);
		mag_20.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.9599F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 76, -0.2F, -6.4F, -2.8F, 1, 1, 3, -0.201F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(3.9F, -7.199F, 4.55F);
		mag_20.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.9599F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 61, 77, -0.8F, -6.4F, -2.8F, 1, 1, 3, -0.201F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.2F, -4.999F, 4.75F);
		mag_20.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.0524F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 86, -1.0F, 0.0F, -1.0F, 1, 5, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.7F, -4.799F, 4.55F);
		mag_20.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.0524F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 47, -2.0F, 0.2F, -4.6F, 2, 4, 1, 0.001F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 66, 39, -2.0F, 0.0F, -3.0F, 2, 4, 3, 0.001F, false));

		action = new ModelRenderer(this);
		action.setRotationPoint(-2.0F, -6.0F, -3.6F);
		action.cubeList.add(new ModelBox(action, 0, 38, -1.0F, -1.0F, 0.0F, 1, 2, 7, 0.0F, false));

		milspec_stock = new ModelRenderer(this);
		milspec_stock.setRotationPoint(-0.5F, -9.0F, 13.2F);
		milspec_stock.cubeList.add(new ModelBox(milspec_stock, 0, 63, -2.0F, 0.0F, 0.0F, 2, 4, 3, 0.001F, false));
		milspec_stock.cubeList.add(new ModelBox(milspec_stock, 78, 10, -2.0F, 3.7F, 0.0F, 2, 1, 3, 0.002F, false));
		milspec_stock.cubeList.add(new ModelBox(milspec_stock, 29, 19, -0.3F, 0.7F, 0.0F, 1, 4, 3, 0.0F, false));
		milspec_stock.cubeList.add(new ModelBox(milspec_stock, 12, 34, -2.7F, 4.7F, 0.0F, 1, 1, 1, 0.0F, false));
		milspec_stock.cubeList.add(new ModelBox(milspec_stock, 12, 15, -0.3F, 4.7F, 0.0F, 1, 1, 1, 0.0F, false));
		milspec_stock.cubeList.add(new ModelBox(milspec_stock, 19, 19, -2.7F, 0.7F, 0.0F, 1, 4, 3, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.0F, 0.0F, 0.0F);
		milspec_stock.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 47, 32, -1.0F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		milspec_stock.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 59, 32, -1.0F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.7F, 4.7F, 3.0F);
		milspec_stock.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.4712F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 56, 5, -3.3F, -1.1F, -2.1F, 2, 1, 2, 0.099F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 46, 62, -1.1F, -1.1F, -2.1F, 1, 1, 2, 0.099F, false));

		stock = new QRenderer(this);
		stock.setRotationPoint(-2.0F, -3.05F, 34.05F);
		stock.cubeList.add(new ModelBox(stock, 78, 20, 1.7F, -5.4F, -2.8F, 1, 1, 4, 0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 84, 59, 0.2F, -6.6F, -2.8F, 2, 1, 2, 0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 16, 72, 0.2F, -6.8F, -0.8F, 2, 1, 2, 0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 72, -1.2F, -6.8F, -0.8F, 2, 1, 2, 0.002F, false));
		stock.cubeList.add(new ModelBox(stock, 19, 38, -0.5F, -6.5F, -0.799F, 2, 13, 2, 0.003F, false));
		stock.cubeList.add(new ModelBox(stock, 29, 28, -1.0F, -6.5F, 0.2F, 3, 5, 1, 0.003F, false));
		stock.cubeList.add(new ModelBox(stock, 78, 15, -1.7F, -5.4F, -2.8F, 1, 1, 4, 0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 8, 72, -1.2F, -6.6F, -2.8F, 2, 1, 2, 0.002F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(2.5F, -5.0F, -40.0F);
		stock.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 0.0F, 0.0F, -0.7854F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 39, 1, -0.8F, -0.8F, 0.8F, 1, 1, 37, -0.2F, false));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(2.5F, -5.0F, -40.0F);
		stock.addChild(gun8_r1);
		setRotationAngle(gun8_r1, 0.0F, 0.0F, 0.1047F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 0, 38, -1.0F, 0.0F, 1.0F, 1, 1, 37, 0.0F, false));

		gun9_r2 = new ModelRenderer(this);
		gun9_r2.setRotationPoint(2.4F, -4.0F, -40.0F);
		stock.addChild(gun9_r2);
		setRotationAngle(gun9_r2, 0.0F, 0.0F, 0.5411F);
		gun9_r2.cubeList.add(new ModelBox(gun9_r2, 0, 0, -0.7F, -0.3F, 0.7F, 1, 1, 37, -0.3F, false));

		gun8_r2 = new ModelRenderer(this);
		gun8_r2.setRotationPoint(-1.4F, -4.0F, -40.0F);
		stock.addChild(gun8_r2);
		setRotationAngle(gun8_r2, 0.0F, 0.0F, -0.5411F);
		gun8_r2.cubeList.add(new ModelBox(gun8_r2, 0, 76, -0.3F, -0.3F, 0.7F, 1, 1, 37, -0.3F, false));

		gun8_r3 = new ModelRenderer(this);
		gun8_r3.setRotationPoint(-1.5F, -5.0F, -40.0F);
		stock.addChild(gun8_r3);
		setRotationAngle(gun8_r3, 0.0F, 0.0F, 0.7854F);
		gun8_r3.cubeList.add(new ModelBox(gun8_r3, 39, 39, -0.2F, -0.8F, 0.8F, 1, 1, 37, -0.2F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(-1.5F, -5.0F, -40.0F);
		stock.addChild(gun7_r1);
		setRotationAngle(gun7_r1, 0.0F, 0.0F, -0.1047F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 39, 77, 0.0F, 0.0F, 1.0F, 1, 1, 37, 0.0F, false));

		gun10_r1 = new ModelRenderer(this);
		gun10_r1.setRotationPoint(-1.7F, -5.4F, -2.8F);
		stock.addChild(gun10_r1);
		setRotationAngle(gun10_r1, 0.0F, 0.0F, 0.384F);
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 27, 93, 0.0F, -1.25F, 0.0F, 1, 1, 2, -0.001F, false));
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 6, 92, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun10_r2 = new ModelRenderer(this);
		gun10_r2.setRotationPoint(-1.7F, -4.4F, -2.8F);
		stock.addChild(gun10_r2);
		setRotationAngle(gun10_r2, 0.0F, 0.0F, -0.0873F);
		gun10_r2.cubeList.add(new ModelBox(gun10_r2, 61, 92, 0.0F, 3.45F, 0.0F, 1, 1, 2, 0.001F, false));
		gun10_r2.cubeList.add(new ModelBox(gun10_r2, 19, 28, 0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));
		gun10_r2.cubeList.add(new ModelBox(gun10_r2, 27, 38, 0.0F, 0.0F, 2.0F, 2, 11, 2, 0.0F, false));

		gun10_r3 = new ModelRenderer(this);
		gun10_r3.setRotationPoint(-1.7F, -5.4F, -0.8F);
		stock.addChild(gun10_r3);
		setRotationAngle(gun10_r3, 0.0F, 0.0F, 0.2967F);
		gun10_r3.cubeList.add(new ModelBox(gun10_r3, 62, 87, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun10_r3.cubeList.add(new ModelBox(gun10_r3, 86, 85, 0.0F, -1.4F, 0.0F, 1, 1, 2, -0.001F, false));

		gun9_r3 = new ModelRenderer(this);
		gun9_r3.setRotationPoint(2.7F, -5.4F, -2.8F);
		stock.addChild(gun9_r3);
		setRotationAngle(gun9_r3, 0.0F, 0.0F, -0.384F);
		gun9_r3.cubeList.add(new ModelBox(gun9_r3, 94, 3, -1.0F, -1.25F, 0.0F, 1, 1, 2, -0.001F, false));
		gun9_r3.cubeList.add(new ModelBox(gun9_r3, 94, 6, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun10_r4 = new ModelRenderer(this);
		gun10_r4.setRotationPoint(2.7F, -5.4F, -0.8F);
		stock.addChild(gun10_r4);
		setRotationAngle(gun10_r4, 0.0F, 0.0F, -0.2967F);
		gun10_r4.cubeList.add(new ModelBox(gun10_r4, 65, 93, -1.0F, -1.4F, 0.0F, 1, 1, 2, -0.001F, false));
		gun10_r4.cubeList.add(new ModelBox(gun10_r4, 84, 93, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun9_r4 = new ModelRenderer(this);
		gun9_r4.setRotationPoint(2.7F, -4.4F, -2.8F);
		stock.addChild(gun9_r4);
		setRotationAngle(gun9_r4, 0.0F, 0.0F, 0.0873F);
		gun9_r4.cubeList.add(new ModelBox(gun9_r4, 94, 0, -1.0F, 3.45F, 0.0F, 1, 1, 2, 0.001F, false));
		gun9_r4.cubeList.add(new ModelBox(gun9_r4, 39, 16, -2.0F, 0.0F, 2.0F, 2, 11, 2, 0.0F, false));
		gun9_r4.cubeList.add(new ModelBox(gun9_r4, 30, 0, -1.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

		gun10_r5 = new ModelRenderer(this);
		gun10_r5.setRotationPoint(-1.7F, -4.4F, -2.8F);
		stock.addChild(gun10_r5);
		setRotationAngle(gun10_r5, 0.2618F, 0.0F, -0.0873F);
		gun10_r5.cubeList.add(new ModelBox(gun10_r5, 55, 39, 0.0F, 4.1F, -1.0F, 2, 7, 2, -0.001F, false));

		gun9_r5 = new ModelRenderer(this);
		gun9_r5.setRotationPoint(2.7F, -4.4F, -2.8F);
		stock.addChild(gun9_r5);
		setRotationAngle(gun9_r5, 0.2618F, 0.0F, 0.0873F);
		gun9_r5.cubeList.add(new ModelBox(gun9_r5, 55, 55, -2.0F, 4.1F, -1.0F, 2, 7, 2, -0.001F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(-2.2F, -2.75F, -20.1F);
		

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.5F, 0.7518F, 0.0F);
		grip.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 39, 0, -1.3F, -0.2518F, -2.0F, 3, 5, 4, 0.002F, false));
		bone9.cubeList.add(new ModelBox(bone9, 56, 0, -0.8F, 4.7482F, -0.2F, 2, 3, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 39, 92, -1.3F, 4.7482F, -2.0F, 3, 3, 2, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 55, 87, -0.1F, 4.6982F, -0.7F, 2, 1, 3, -0.3F, false));
		bone9.cubeList.add(new ModelBox(bone9, 78, 64, -0.1F, 5.3982F, -0.7F, 2, 1, 3, -0.3F, false));
		bone9.cubeList.add(new ModelBox(bone9, 78, 25, -0.1F, 6.7982F, -0.7F, 2, 1, 3, -0.3F, false));
		bone9.cubeList.add(new ModelBox(bone9, 78, 49, -0.1F, 6.0982F, -0.7F, 2, 1, 3, -0.3F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 32, -1.5F, 4.6982F, -0.7F, 3, 1, 3, -0.301F, false));
		bone9.cubeList.add(new ModelBox(bone9, 24, 51, -1.5F, 5.3982F, -0.7F, 3, 1, 3, -0.301F, false));
		bone9.cubeList.add(new ModelBox(bone9, 39, 71, -1.5F, 6.0982F, -0.7F, 3, 1, 3, -0.301F, false));
		bone9.cubeList.add(new ModelBox(bone9, 51, 71, -1.5F, 6.7982F, -0.7F, 3, 1, 3, -0.301F, false));
		bone9.cubeList.add(new ModelBox(bone9, 39, 87, -1.3F, -1.9018F, -1.0F, 3, 2, 2, 0.001F, false));

		gun9_r6 = new ModelRenderer(this);
		gun9_r6.setRotationPoint(0.0F, -0.0576F, -1.2756F);
		bone9.addChild(gun9_r6);
		setRotationAngle(gun9_r6, 1.309F, 0.0F, 0.0F);
		gun9_r6.cubeList.add(new ModelBox(gun9_r6, 39, 51, -1.3F, -0.75F, 0.0F, 3, 1, 1, -0.001F, false));

		gun8_r4 = new ModelRenderer(this);
		gun8_r4.setRotationPoint(0.0F, -0.0576F, 1.2756F);
		bone9.addChild(gun8_r4);
		setRotationAngle(gun8_r4, -1.309F, 0.0F, 0.0F);
		gun8_r4.cubeList.add(new ModelBox(gun8_r4, 66, 46, -1.3F, -0.75F, -1.0F, 3, 1, 1, -0.001F, false));

		gun8_r5 = new ModelRenderer(this);
		gun8_r5.setRotationPoint(0.0F, -0.6647F, -1.2345F);
		bone9.addChild(gun8_r5);
		setRotationAngle(gun8_r5, 0.7418F, 0.0F, 0.0F);
		gun8_r5.cubeList.add(new ModelBox(gun8_r5, 61, 66, -1.3F, -0.75F, 0.0F, 3, 1, 1, 0.0F, false));

		gun7_r2 = new ModelRenderer(this);
		gun7_r2.setRotationPoint(0.0F, -0.6647F, 1.2345F);
		bone9.addChild(gun7_r2);
		setRotationAngle(gun7_r2, -0.7418F, 0.0F, 0.0F);
		gun7_r2.cubeList.add(new ModelBox(gun7_r2, 22, 72, -1.3F, -0.75F, -1.0F, 3, 1, 1, 0.0F, false));

		gun9_r7 = new ModelRenderer(this);
		gun9_r7.setRotationPoint(-1.7F, 0.1982F, -1.4F);
		bone9.addChild(gun9_r7);
		setRotationAngle(gun9_r7, -0.4538F, 0.0F, 0.0F);
		gun9_r7.cubeList.add(new ModelBox(gun9_r7, 46, 55, 0.0F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));
		gun9_r7.cubeList.add(new ModelBox(gun9_r7, 8, 56, 2.8F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));

		gun7_r3 = new ModelRenderer(this);
		gun7_r3.setRotationPoint(0.0F, 3.7878F, 0.0734F);
		bone9.addChild(gun7_r3);
		setRotationAngle(gun7_r3, 0.2182F, 0.0F, 0.0F);
		gun7_r3.cubeList.add(new ModelBox(gun7_r3, 0, 13, -1.3F, 3.4825F, -1.8763F, 3, 1, 3, -0.2F, false));
		gun7_r3.cubeList.add(new ModelBox(gun7_r3, 55, 50, -1.3F, 3.2836F, -2.8763F, 3, 1, 2, 0.0F, false));

		mp7_body = new ModelRenderer(this);
		mp7_body.setRotationPoint(-2.0F, -5.5F, -9.0F);
		mp7_body.cubeList.add(new ModelBox(mp7_body, 84, 39, -0.5F, -2.0F, -18.15F, 2, 2, 2, -0.4F, false));
		mp7_body.cubeList.add(new ModelBox(mp7_body, 0, 56, -0.5F, 0.25F, -13.1F, 2, 3, 4, 0.001F, false));

		gun7_r4 = new ModelRenderer(this);
		gun7_r4.setRotationPoint(0.3F, 1.3806F, -13.0202F);
		mp7_body.addChild(gun7_r4);
		setRotationAngle(gun7_r4, 0.6109F, 0.0F, 0.0F);
		gun7_r4.cubeList.add(new ModelBox(gun7_r4, 78, 98, -0.8F, -1.0F, -0.6F, 2, 2, 1, 0.0F, false));

		universal_parts = new ModelRenderer(this);
		universal_parts.setRotationPoint(0.0F, 0.0F, 0.0F);
		mp7_body.addChild(universal_parts);
		

		receiver = new ModelRenderer(this);
		receiver.setRotationPoint(-0.4868F, -1.5125F, -1.2209F);
		universal_parts.addChild(receiver);
		receiver.cubeList.add(new ModelBox(receiver, 55, 55, -0.0132F, -4.1375F, -1.2791F, 1, 2, 9, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 67, 97, -0.0132F, -4.1375F, -5.5291F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 31, 97, 0.2868F, -4.1375F, -3.3291F, 1, 1, 2, 0.2F, false));
		receiver.cubeList.add(new ModelBox(receiver, 45, 97, -0.0132F, -4.1375F, -9.7791F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 78, 15, -0.0132F, -4.1375F, -13.0291F, 1, 2, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 78, 77, -0.0132F, -3.3125F, -14.4791F, 1, 1, 14, -0.001F, false));
		receiver.cubeList.add(new ModelBox(receiver, 78, 39, -0.2132F, -4.7375F, -13.2291F, 1, 1, 36, -0.198F, false));
		receiver.cubeList.add(new ModelBox(receiver, 59, 95, -0.2132F, -4.7375F, 21.6709F, 1, 1, 2, -0.196F, false));
		receiver.cubeList.add(new ModelBox(receiver, 117, 111, -0.7703F, 0.2625F, -14.2791F, 1, 1, 20, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 39, 16, -0.7703F, 1.2625F, -14.2791F, 1, 1, 15, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 39, 62, -0.7703F, 0.8125F, 0.7209F, 1, 1, 5, -0.001F, false));
		receiver.cubeList.add(new ModelBox(receiver, 56, 9, -0.5132F, 1.7125F, 0.7209F, 3, 1, 5, -0.001F, false));
		receiver.cubeList.add(new ModelBox(receiver, 109, 16, -0.7703F, 1.2625F, -15.0791F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 92, 92, -0.7703F, 1.7625F, -1.2791F, 2, 1, 2, -0.001F, false));
		receiver.cubeList.add(new ModelBox(receiver, 84, 20, -0.7703F, 0.7625F, 4.7209F, 2, 2, 2, 0.001F, false));
		receiver.cubeList.add(new ModelBox(receiver, 78, 54, 0.2297F, 1.7625F, -15.2791F, 1, 1, 14, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 76, -0.4632F, -1.3375F, -15.2791F, 1, 2, 4, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 78, 77, -0.4632F, -0.7375F, -11.2791F, 1, 1, 4, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 56, -0.4632F, -1.3375F, -7.2791F, 1, 2, 14, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 39, 97, -0.7132F, -1.4056F, -15.3791F, 1, 1, 2, -0.101F, false));
		receiver.cubeList.add(new ModelBox(receiver, 24, 109, 0.2368F, -3.9891F, -14.5415F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 36, 115, -0.7632F, 0.9625F, 13.4709F, 2, 3, 10, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 19, 0, -0.7632F, 1.9625F, 6.4709F, 2, 2, 7, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 19, 9, -0.7632F, 1.7625F, 6.4709F, 2, 1, 7, 0.001F, false));
		receiver.cubeList.add(new ModelBox(receiver, 138, 21, -1.4092F, -1.7294F, 5.7709F, 1, 1, 18, -0.301F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 47, -1.1092F, -1.4294F, 17.4709F, 2, 1, 6, 0.001F, false));
		receiver.cubeList.add(new ModelBox(receiver, 78, 69, -1.1092F, -1.4294F, 11.4709F, 1, 1, 4, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 109, 1, -1.1092F, -1.4294F, 14.9709F, 1, 1, 1, 0.001F, false));
		receiver.cubeList.add(new ModelBox(receiver, 65, 82, -1.1092F, -1.4294F, 6.0209F, 1, 1, 4, 0.001F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(0.7368F, 2.9018F, 6.1173F);
		receiver.addChild(gun5_r1);
		setRotationAngle(gun5_r1, 0.7854F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 53, 98, -1.5F, -1.0F, -0.5F, 2, 2, 1, -0.001F, false));

		gun7_r5 = new ModelRenderer(this);
		gun7_r5.setRotationPoint(-1.1092F, -1.4294F, 6.4709F);
		receiver.addChild(gun7_r5);
		setRotationAngle(gun7_r5, 0.0F, 0.0F, 0.3142F);
		gun7_r5.cubeList.add(new ModelBox(gun7_r5, 0, 38, 0.0F, -2.75F, 0.0F, 1, 1, 17, 0.001F, false));
		gun7_r5.cubeList.add(new ModelBox(gun7_r5, 0, 0, 0.0F, -2.0F, 0.0F, 1, 2, 17, 0.0F, false));

		gun7_r6 = new ModelRenderer(this);
		gun7_r6.setRotationPoint(-0.2632F, -4.0375F, 6.4709F);
		receiver.addChild(gun7_r6);
		setRotationAngle(gun7_r6, 0.0F, 0.0F, 1.117F);
		gun7_r6.cubeList.add(new ModelBox(gun7_r6, 141, 41, 0.0F, -1.0F, 0.0F, 2, 1, 17, 0.001F, false));

		gun7_r7 = new ModelRenderer(this);
		gun7_r7.setRotationPoint(-1.1092F, -1.4294F, 6.0209F);
		receiver.addChild(gun7_r7);
		setRotationAngle(gun7_r7, -0.1571F, 0.0F, 0.3142F);
		gun7_r7.cubeList.add(new ModelBox(gun7_r7, 39, 39, 0.0F, -3.0F, 0.0F, 1, 3, 1, -0.002F, false));

		gun9_r8 = new ModelRenderer(this);
		gun9_r8.setRotationPoint(-1.3092F, -2.3294F, -13.0291F);
		receiver.addChild(gun9_r8);
		setRotationAngle(gun9_r8, 0.0F, 0.0F, 0.7854F);
		gun9_r8.cubeList.add(new ModelBox(gun9_r8, 6, 100, -0.2F, -0.8F, -0.2F, 2, 1, 1, -0.199F, false));

		gun9_r9 = new ModelRenderer(this);
		gun9_r9.setRotationPoint(-1.3092F, -2.3294F, -13.0291F);
		receiver.addChild(gun9_r9);
		setRotationAngle(gun9_r9, 0.0F, 0.0F, 0.3142F);
		gun9_r9.cubeList.add(new ModelBox(gun9_r9, 98, 107, -0.2F, -1.2F, -0.2F, 1, 1, 1, -0.201F, false));
		gun9_r9.cubeList.add(new ModelBox(gun9_r9, 107, 96, -0.2F, -0.8F, -0.2F, 1, 1, 1, -0.2F, false));

		gun9_r10 = new ModelRenderer(this);
		gun9_r10.setRotationPoint(-1.0092F, -3.2875F, -13.0291F);
		receiver.addChild(gun9_r10);
		setRotationAngle(gun9_r10, 0.0F, 0.0F, 1.2566F);
		gun9_r10.cubeList.add(new ModelBox(gun9_r10, 39, 77, -0.2F, -1.8F, -0.2F, 1, 2, 1, -0.202F, false));

		gun8_r6 = new ModelRenderer(this);
		gun8_r6.setRotationPoint(-1.5092F, -3.2294F, 19.4709F);
		receiver.addChild(gun8_r6);
		setRotationAngle(gun8_r6, 0.0F, 0.0F, 0.3142F);
		gun8_r6.cubeList.add(new ModelBox(gun8_r6, 108, 12, -0.2F, -1.1F, -0.2F, 1, 1, 1, -0.201F, false));
		gun8_r6.cubeList.add(new ModelBox(gun8_r6, 27, 108, -0.2F, -0.8F, -0.2F, 1, 1, 1, -0.2F, false));

		gun8_r7 = new ModelRenderer(this);
		gun8_r7.setRotationPoint(-1.5092F, -3.2294F, 19.4709F);
		receiver.addChild(gun8_r7);
		setRotationAngle(gun8_r7, 0.0F, 0.0F, 0.7854F);
		gun8_r7.cubeList.add(new ModelBox(gun8_r7, 15, 100, -0.2F, -0.8F, -0.2F, 2, 1, 1, -0.199F, false));

		gun8_r8 = new ModelRenderer(this);
		gun8_r8.setRotationPoint(-1.2092F, -4.0875F, 19.4709F);
		receiver.addChild(gun8_r8);
		setRotationAngle(gun8_r8, 0.0F, 0.0F, 1.5184F);
		gun8_r8.cubeList.add(new ModelBox(gun8_r8, 55, 77, -0.2F, -1.78F, -0.2F, 1, 2, 1, -0.202F, false));

		gun8_r9 = new ModelRenderer(this);
		gun8_r9.setRotationPoint(-1.1092F, -0.4294F, 7.4709F);
		receiver.addChild(gun8_r9);
		setRotationAngle(gun8_r9, 0.0F, 0.0F, -0.192F);
		gun8_r9.cubeList.add(new ModelBox(gun8_r9, 19, 19, -0.1F, -0.1F, -1.3F, 1, 1, 8, -0.101F, false));
		gun8_r9.cubeList.add(new ModelBox(gun8_r9, 15, 92, 0.0F, 0.0F, 6.0F, 1, 2, 10, 0.0F, false));
		gun8_r9.cubeList.add(new ModelBox(gun8_r9, 56, 24, 0.0F, 0.0F, -1.8F, 1, 2, 1, -0.002F, false));
		gun8_r9.cubeList.add(new ModelBox(gun8_r9, 78, 20, 0.0F, 0.0F, -2.0F, 1, 2, 1, 0.0F, false));

		gun9_r11 = new ModelRenderer(this);
		gun9_r11.setRotationPoint(-1.9092F, 0.2706F, 13.8709F);
		receiver.addChild(gun9_r11);
		setRotationAngle(gun9_r11, 0.0F, 0.2443F, -0.1396F);
		gun9_r11.cubeList.add(new ModelBox(gun9_r11, 96, 30, -0.2F, -0.2F, -0.2F, 2, 2, 1, -0.201F, false));

		gun9_r12 = new ModelRenderer(this);
		gun9_r12.setRotationPoint(-1.7092F, 1.2706F, 13.8709F);
		receiver.addChild(gun9_r12);
		setRotationAngle(gun9_r12, 0.0F, 0.0F, 0.1222F);
		gun9_r12.cubeList.add(new ModelBox(gun9_r12, 99, 94, -0.1F, -0.2F, -0.2F, 2, 1, 1, -0.2F, false));

		gun8_r10 = new ModelRenderer(this);
		gun8_r10.setRotationPoint(-1.9092F, 0.2706F, 13.8709F);
		receiver.addChild(gun8_r10);
		setRotationAngle(gun8_r10, 0.0F, 0.0F, -0.1396F);
		gun8_r10.cubeList.add(new ModelBox(gun8_r10, 96, 69, -0.2F, -0.2F, -0.2F, 2, 2, 1, -0.2F, false));

		gun7_r8 = new ModelRenderer(this);
		gun7_r8.setRotationPoint(-1.1092F, -0.4294F, 5.4709F);
		receiver.addChild(gun7_r8);
		setRotationAngle(gun7_r8, -0.5061F, 0.0F, 0.0F);
		gun7_r8.cubeList.add(new ModelBox(gun7_r8, 109, 18, -0.1F, -1.2F, -0.1F, 1, 1, 1, -0.101F, false));
		gun7_r8.cubeList.add(new ModelBox(gun7_r8, 20, 109, -0.1F, -0.9F, -0.1F, 1, 1, 1, -0.1F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(0.7368F, -3.4888F, -13.6403F);
		receiver.addChild(gun6_r1);
		setRotationAngle(gun6_r1, -0.2618F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 39, 109, -0.5F, -0.25F, -1.0F, 1, 1, 1, 0.0F, false));

		gun5_r2 = new ModelRenderer(this);
		gun5_r2.setRotationPoint(0.5368F, 0.7284F, -15.2879F);
		receiver.addChild(gun5_r2);
		setRotationAngle(gun5_r2, -0.2618F, 0.0F, 0.0F);
		gun5_r2.cubeList.add(new ModelBox(gun5_r2, 109, 40, -0.05F, -3.8F, -0.5F, 1, 1, 1, -0.001F, false));

		gun10_r6 = new ModelRenderer(this);
		gun10_r6.setRotationPoint(-0.8086F, -0.9556F, -14.3791F);
		receiver.addChild(gun10_r6);
		setRotationAngle(gun10_r6, -0.7957F, 1.2051F, -0.7615F);
		gun10_r6.cubeList.add(new ModelBox(gun10_r6, 39, 9, 0.0F, 0.0F, 0.0F, 1, 3, 1, -0.001F, false));

		gun9_r13 = new ModelRenderer(this);
		gun9_r13.setRotationPoint(-0.8086F, -0.9556F, -14.3791F);
		receiver.addChild(gun9_r13);
		setRotationAngle(gun9_r13, -0.2583F, 0.0F, 0.0F);
		gun9_r13.cubeList.add(new ModelBox(gun9_r13, 39, 32, 0.0F, 0.0F, 0.0F, 1, 3, 1, -0.001F, false));

		gun7_r9 = new ModelRenderer(this);
		gun7_r9.setRotationPoint(-0.6132F, -1.3056F, -13.2791F);
		receiver.addChild(gun7_r9);
		setRotationAngle(gun7_r9, -0.2583F, 0.0F, 0.0F);
		gun7_r9.cubeList.add(new ModelBox(gun7_r9, 71, 77, -0.3F, -0.2F, -0.68F, 1, 2, 1, -0.3F, false));

		gun7_r10 = new ModelRenderer(this);
		gun7_r10.setRotationPoint(-0.6132F, -1.3056F, -15.2791F);
		receiver.addChild(gun7_r10);
		setRotationAngle(gun7_r10, -0.2583F, 0.0F, 0.0F);
		gun7_r10.cubeList.add(new ModelBox(gun7_r10, 16, 107, 1.1F, 0.1F, 0.1F, 1, 1, 1, 0.1F, false));
		gun7_r10.cubeList.add(new ModelBox(gun7_r10, 12, 107, 2.2F, 2.5F, 0.0F, 1, 1, 1, -0.001F, false));
		gun7_r10.cubeList.add(new ModelBox(gun7_r10, 28, 59, 1.35F, 3.4F, 0.0F, 1, 2, 1, 0.0F, false));
		gun7_r10.cubeList.add(new ModelBox(gun7_r10, 66, 57, 0.85F, 3.4F, 0.0F, 1, 2, 1, -0.003F, false));
		gun7_r10.cubeList.add(new ModelBox(gun7_r10, 9, 43, 0.0F, 2.5F, 0.0F, 3, 1, 1, -0.002F, false));
		gun7_r10.cubeList.add(new ModelBox(gun7_r10, 39, 0, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun10_r7 = new ModelRenderer(this);
		gun10_r7.setRotationPoint(2.3368F, -1.3056F, -15.2791F);
		receiver.addChild(gun10_r7);
		setRotationAngle(gun10_r7, -0.251F, 0.0618F, 0.2365F);
		gun10_r7.cubeList.add(new ModelBox(gun10_r7, 39, 62, -0.25F, 3.3581F, 0.0F, 1, 2, 1, -0.004F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(1.2368F, 4.1944F, -15.6791F);
		receiver.addChild(gun11_r1);
		setRotationAngle(gun11_r1, 0.9425F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 27, 96, -1.0F, -1.0219F, 0.02F, 1, 1, 2, 0.001F, false));
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 63, 96, -0.5F, -1.0219F, 0.02F, 1, 1, 2, 0.0F, false));

		gun9_r14 = new ModelRenderer(this);
		gun9_r14.setRotationPoint(-0.3632F, -1.3056F, -15.2791F);
		receiver.addChild(gun9_r14);
		setRotationAngle(gun9_r14, -0.251F, -0.0618F, -0.2365F);
		gun9_r14.cubeList.add(new ModelBox(gun9_r14, 16, 64, -0.75F, 3.3581F, 0.0F, 1, 2, 1, -0.004F, false));

		gun8_r11 = new ModelRenderer(this);
		gun8_r11.setRotationPoint(-0.6132F, -1.3056F, -15.2791F);
		receiver.addChild(gun8_r11);
		setRotationAngle(gun8_r11, -0.2589F, 0.0675F, 0.2963F);
		gun8_r11.cubeList.add(new ModelBox(gun8_r11, 109, 14, 0.0F, -2.9F, 0.0F, 1, 1, 1, -0.001F, false));
		gun8_r11.cubeList.add(new ModelBox(gun8_r11, 78, 0, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun7_r11 = new ModelRenderer(this);
		gun7_r11.setRotationPoint(-0.6132F, -1.3056F, -15.2791F);
		receiver.addChild(gun7_r11);
		setRotationAngle(gun7_r11, -0.2583F, 0.0F, 0.3142F);
		gun7_r11.cubeList.add(new ModelBox(gun7_r11, 16, 109, 0.0F, -2.9F, 0.0F, 1, 1, 1, -0.002F, false));
		gun7_r11.cubeList.add(new ModelBox(gun7_r11, 78, 5, 0.0F, -2.2F, 0.0F, 1, 2, 1, -0.001F, false));

		gun6_r2 = new ModelRenderer(this);
		gun6_r2.setRotationPoint(-0.6132F, -1.3056F, -7.2791F);
		receiver.addChild(gun6_r2);
		setRotationAngle(gun6_r2, 0.0F, 0.0F, 0.3142F);
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 0, 76, 0.0F, -2.0F, 0.0F, 1, 2, 14, 0.0F, false));
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 16, 81, 0.0F, -1.5F, -4.0F, 1, 1, 4, -0.001F, false));
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 26, 81, 0.0F, -2.0F, -4.0F, 1, 1, 4, 0.0F, false));
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 9, 29, 0.0F, -2.0F, -7.0F, 1, 2, 3, 0.0F, false));

		gun7_r12 = new ModelRenderer(this);
		gun7_r12.setRotationPoint(-0.6132F, -1.3056F, -7.2791F);
		receiver.addChild(gun7_r12);
		setRotationAngle(gun7_r12, 0.7854F, 0.0F, 0.3142F);
		gun7_r12.cubeList.add(new ModelBox(gun7_r12, 8, 109, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.002F, false));

		gun6_r3 = new ModelRenderer(this);
		gun6_r3.setRotationPoint(-0.6132F, -1.3056F, -11.2791F);
		receiver.addChild(gun6_r3);
		setRotationAngle(gun6_r3, 0.7854F, 0.0F, 0.3142F);
		gun6_r3.cubeList.add(new ModelBox(gun6_r3, 12, 109, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.002F, false));

		gun7_r13 = new ModelRenderer(this);
		gun7_r13.setRotationPoint(-0.4632F, -1.1375F, -7.2791F);
		receiver.addChild(gun7_r13);
		setRotationAngle(gun7_r13, 0.7854F, 0.0F, 0.0F);
		gun7_r13.cubeList.add(new ModelBox(gun7_r13, 109, 3, 0.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		gun6_r4 = new ModelRenderer(this);
		gun6_r4.setRotationPoint(-0.4632F, -1.1375F, -11.2791F);
		receiver.addChild(gun6_r4);
		setRotationAngle(gun6_r4, 0.7854F, 0.0F, 0.0F);
		gun6_r4.cubeList.add(new ModelBox(gun6_r4, 4, 109, 0.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		gun5_r3 = new ModelRenderer(this);
		gun5_r3.setRotationPoint(-0.7703F, 2.2625F, -15.2791F);
		receiver.addChild(gun5_r3);
		setRotationAngle(gun5_r3, 0.0F, 0.0F, -1.0472F);
		gun5_r3.cubeList.add(new ModelBox(gun5_r3, 78, 39, 0.0F, 0.0F, 0.0F, 1, 1, 14, 0.0F, false));

		gun5_r4 = new ModelRenderer(this);
		gun5_r4.setRotationPoint(-0.7703F, 0.2625F, -13.2791F);
		receiver.addChild(gun5_r4);
		setRotationAngle(gun5_r4, 0.0F, 0.0F, -0.4538F);
		gun5_r4.cubeList.add(new ModelBox(gun5_r4, 116, 37, 0.0F, 0.0F, -1.0F, 1, 1, 20, 0.0F, false));

		gun6_r5 = new ModelRenderer(this);
		gun6_r5.setRotationPoint(-0.0132F, -3.3125F, -14.4791F);
		receiver.addChild(gun6_r5);
		setRotationAngle(gun6_r5, 0.733F, 0.0F, 0.0F);
		gun6_r5.cubeList.add(new ModelBox(gun6_r5, 78, 92, 0.0F, 0.0F, 0.0F, 2, 1, 2, -0.002F, false));

		gun11_r2 = new ModelRenderer(this);
		gun11_r2.setRotationPoint(-0.0132F, -3.5375F, -1.2791F);
		receiver.addChild(gun11_r2);
		setRotationAngle(gun11_r2, -0.7854F, 0.0F, 0.0F);
		gun11_r2.cubeList.add(new ModelBox(gun11_r2, 108, 51, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		gun10_r8 = new ModelRenderer(this);
		gun10_r8.setRotationPoint(-0.0132F, -4.5375F, -1.2791F);
		receiver.addChild(gun10_r8);
		setRotationAngle(gun10_r8, -0.7854F, 0.0F, 0.0F);
		gun10_r8.cubeList.add(new ModelBox(gun10_r8, 108, 32, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.201F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(-0.0132F, -3.5375F, -3.5291F);
		receiver.addChild(gun12_r1);
		setRotationAngle(gun12_r1, 0.7854F, 0.0F, 0.0F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 31, 108, -0.2F, -0.2F, -0.8F, 1, 1, 1, -0.202F, false));

		gun11_r3 = new ModelRenderer(this);
		gun11_r3.setRotationPoint(-0.0132F, -4.5375F, -3.5291F);
		receiver.addChild(gun11_r3);
		setRotationAngle(gun11_r3, 0.7854F, 0.0F, 0.0F);
		gun11_r3.cubeList.add(new ModelBox(gun11_r3, 108, 27, -0.2F, -0.2F, -0.8F, 1, 1, 1, -0.201F, false));

		gun10_r9 = new ModelRenderer(this);
		gun10_r9.setRotationPoint(-0.0132F, -3.5375F, -5.5291F);
		receiver.addChild(gun10_r9);
		setRotationAngle(gun10_r9, -0.7854F, 0.0F, 0.0F);
		gun10_r9.cubeList.add(new ModelBox(gun10_r9, 108, 71, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		gun9_r15 = new ModelRenderer(this);
		gun9_r15.setRotationPoint(-0.0132F, -4.5375F, -5.5291F);
		receiver.addChild(gun9_r15);
		setRotationAngle(gun9_r15, -0.7854F, 0.0F, 0.0F);
		gun9_r15.cubeList.add(new ModelBox(gun9_r15, 108, 66, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.201F, false));

		gun11_r4 = new ModelRenderer(this);
		gun11_r4.setRotationPoint(-0.0132F, -3.5375F, -7.7791F);
		receiver.addChild(gun11_r4);
		setRotationAngle(gun11_r4, 0.7854F, 0.0F, 0.0F);
		gun11_r4.cubeList.add(new ModelBox(gun11_r4, 66, 108, -0.2F, -0.2F, -0.8F, 1, 1, 1, -0.202F, false));

		gun10_r10 = new ModelRenderer(this);
		gun10_r10.setRotationPoint(-0.0132F, -4.5375F, -7.7791F);
		receiver.addChild(gun10_r10);
		setRotationAngle(gun10_r10, 0.7854F, 0.0F, 0.0F);
		gun10_r10.cubeList.add(new ModelBox(gun10_r10, 62, 108, -0.2F, -0.2F, -0.8F, 1, 1, 1, -0.201F, false));

		gun9_r16 = new ModelRenderer(this);
		gun9_r16.setRotationPoint(-0.0132F, -4.5375F, -12.0291F);
		receiver.addChild(gun9_r16);
		setRotationAngle(gun9_r16, 0.7854F, 0.0F, 0.0F);
		gun9_r16.cubeList.add(new ModelBox(gun9_r16, 101, 108, -0.2F, -0.2F, -0.8F, 1, 1, 1, -0.201F, false));

		gun10_r11 = new ModelRenderer(this);
		gun10_r11.setRotationPoint(-0.0132F, -3.5375F, -12.0291F);
		receiver.addChild(gun10_r11);
		setRotationAngle(gun10_r11, 0.7854F, 0.0F, 0.0F);
		gun10_r11.cubeList.add(new ModelBox(gun10_r11, 72, 108, -0.2F, -0.2F, -0.8F, 1, 1, 1, -0.202F, false));

		gun9_r17 = new ModelRenderer(this);
		gun9_r17.setRotationPoint(-0.0132F, -3.5375F, -9.7791F);
		receiver.addChild(gun9_r17);
		setRotationAngle(gun9_r17, -0.7854F, 0.0F, 0.0F);
		gun9_r17.cubeList.add(new ModelBox(gun9_r17, 105, 108, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		gun8_r12 = new ModelRenderer(this);
		gun8_r12.setRotationPoint(-0.0132F, -4.5375F, -9.7791F);
		receiver.addChild(gun8_r12);
		setRotationAngle(gun8_r12, -0.7854F, 0.0F, 0.0F);
		gun8_r12.cubeList.add(new ModelBox(gun8_r12, 0, 109, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.201F, false));

		receiver2 = new ModelRenderer(this);
		receiver2.setRotationPoint(1.4868F, -1.5125F, -1.2209F);
		universal_parts.addChild(receiver2);
		receiver2.cubeList.add(new ModelBox(receiver2, 55, 39, -0.9868F, -4.1375F, -1.2791F, 1, 2, 9, 0.0F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 15, 97, -0.9868F, -4.1375F, -5.5291F, 1, 1, 2, 0.0F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 6, 97, -1.2868F, -4.1375F, -3.3291F, 1, 1, 2, 0.2F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 0, 97, -0.9868F, -4.1375F, -9.7791F, 1, 1, 2, 0.0F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 32, 76, -0.9868F, -4.1375F, -13.0291F, 1, 2, 1, 0.0F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 78, 15, -0.9868F, -3.3125F, -14.4791F, 1, 1, 14, -0.001F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 78, 0, -1.7868F, -4.7375F, -13.2291F, 2, 1, 36, -0.199F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 94, 86, -1.8868F, -5.2375F, 19.8709F, 1, 1, 2, -0.099F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 53, 95, -1.0868F, -5.2375F, 19.8709F, 1, 1, 2, -0.099F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 53, 101, -0.8368F, -5.2375F, 21.2709F, 1, 1, 1, -0.299F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 101, 32, -2.1368F, -5.2375F, 21.2709F, 1, 1, 1, -0.299F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 68, 100, -0.8368F, -5.2375F, 21.0709F, 1, 1, 1, -0.298F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 100, 96, -2.1368F, -5.2375F, 21.0709F, 1, 1, 1, -0.298F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 39, 100, -0.8368F, -5.2375F, -12.6291F, 1, 1, 1, -0.298F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 43, 100, -0.8368F, -5.2375F, -12.8291F, 1, 1, 1, -0.299F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 47, 100, -2.1368F, -5.2375F, -12.8291F, 1, 1, 1, -0.299F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 64, 100, -2.1368F, -5.2375F, -12.6291F, 1, 1, 1, -0.298F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 9, 38, -1.7868F, -4.7375F, 21.6709F, 2, 3, 2, -0.197F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 36, 115, -0.2297F, 0.2625F, -14.2791F, 1, 1, 25, 0.0F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 39, 0, -0.2297F, 1.2625F, -14.2791F, 1, 1, 15, 0.0F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 21, 59, -0.2297F, 0.8125F, 0.7209F, 1, 1, 5, -0.001F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 107, 64, -0.2297F, 1.2625F, -15.0791F, 1, 1, 1, 0.0F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 53, 92, -1.2297F, 1.7625F, -1.2791F, 2, 1, 2, -0.001F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 84, 15, -1.2297F, 0.7625F, 4.7209F, 2, 2, 2, 0.001F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 39, 77, -1.2297F, 1.7625F, -15.2791F, 1, 1, 14, -0.001F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 65, 67, -0.5368F, -1.3375F, -15.2791F, 1, 2, 4, 0.0F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 78, 59, -0.5368F, -0.7375F, -11.2791F, 1, 1, 4, 0.0F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 39, 55, -0.5368F, -1.3375F, -7.2791F, 1, 2, 14, 0.0F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 66, 57, -0.7368F, -1.9375F, -11.2791F, 1, 2, 4, 0.0F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 66, 51, -2.2368F, -1.9375F, -11.2791F, 1, 2, 4, 0.0F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 96, 96, -0.2868F, -1.4056F, -15.3791F, 1, 1, 2, -0.101F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 43, 107, -1.2368F, -3.9891F, -14.5415F, 1, 1, 1, 0.001F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 118, 0, -1.2368F, 0.9625F, 6.4709F, 2, 3, 17, 0.001F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 48, 9, -1.9868F, -0.7875F, 23.2209F, 2, 3, 1, 0.001F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 48, 71, -1.9868F, -2.7875F, 22.8209F, 2, 2, 1, 0.001F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 85, 10, -1.9868F, 2.0125F, 23.1209F, 2, 2, 1, -0.2F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 56, 12, -0.1278F, 0.2625F, 8.8709F, 1, 1, 1, -0.1F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 19, 53, -0.1278F, 0.2625F, 9.3709F, 1, 1, 1, -0.101F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 48, 42, -0.1338F, 1.6625F, 9.7709F, 1, 1, 1, -0.101F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 48, 48, -0.1338F, 1.6625F, 9.2709F, 1, 1, 1, -0.1F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 78, 5, -0.1338F, 2.8625F, 9.2709F, 1, 1, 4, -0.1F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 138, 2, 0.4092F, -1.7294F, 5.7709F, 1, 1, 18, -0.301F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 19, 28, -0.8908F, -1.4294F, 17.4709F, 2, 1, 6, 0.001F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 78, 39, 0.1092F, -1.4294F, 11.4709F, 1, 1, 4, 0.0F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 39, 107, 0.1092F, -1.4294F, 14.9709F, 1, 1, 1, 0.001F, false));
		receiver2.cubeList.add(new ModelBox(receiver2, 78, 30, 0.1092F, -1.4294F, 6.0209F, 1, 1, 4, 0.001F, false));

		gun6_r6 = new ModelRenderer(this);
		gun6_r6.setRotationPoint(-0.7368F, 2.9018F, 6.1173F);
		receiver2.addChild(gun6_r6);
		setRotationAngle(gun6_r6, 0.7854F, 0.0F, 0.0F);
		gun6_r6.cubeList.add(new ModelBox(gun6_r6, 84, 96, -0.5F, -1.0F, -0.5F, 2, 2, 1, 0.0F, false));

		gun8_r13 = new ModelRenderer(this);
		gun8_r13.setRotationPoint(1.1092F, -1.4294F, 6.4709F);
		receiver2.addChild(gun8_r13);
		setRotationAngle(gun8_r13, 0.0F, 0.0F, -0.3142F);
		gun8_r13.cubeList.add(new ModelBox(gun8_r13, 0, 19, -1.0F, -2.75F, 0.0F, 1, 1, 17, 0.001F, false));
		gun8_r13.cubeList.add(new ModelBox(gun8_r13, 133, 132, -2.0F, -2.0F, 0.0F, 2, 2, 17, 0.0F, false));

		gun8_r14 = new ModelRenderer(this);
		gun8_r14.setRotationPoint(0.2632F, -4.0375F, 6.4709F);
		receiver2.addChild(gun8_r14);
		setRotationAngle(gun8_r14, 0.0F, 0.0F, -1.117F);
		gun8_r14.cubeList.add(new ModelBox(gun8_r14, 139, 109, -2.0F, -1.0F, 0.0F, 2, 1, 17, 0.0F, false));

		gun8_r15 = new ModelRenderer(this);
		gun8_r15.setRotationPoint(1.1092F, -1.4294F, 6.0209F);
		receiver2.addChild(gun8_r15);
		setRotationAngle(gun8_r15, -0.1571F, 0.0F, -0.3142F);
		gun8_r15.cubeList.add(new ModelBox(gun8_r15, 0, 0, -1.0F, -3.0F, 0.0F, 1, 3, 1, -0.002F, false));

		gun10_r12 = new ModelRenderer(this);
		gun10_r12.setRotationPoint(1.3092F, -2.3294F, -13.0291F);
		receiver2.addChild(gun10_r12);
		setRotationAngle(gun10_r12, 0.0F, 0.0F, -0.7854F);
		gun10_r12.cubeList.add(new ModelBox(gun10_r12, 98, 99, -1.8F, -0.8F, -0.2F, 2, 1, 1, -0.199F, false));

		gun10_r13 = new ModelRenderer(this);
		gun10_r13.setRotationPoint(1.3092F, -2.3294F, -13.0291F);
		receiver2.addChild(gun10_r13);
		setRotationAngle(gun10_r13, 0.0F, 0.0F, -0.3142F);
		gun10_r13.cubeList.add(new ModelBox(gun10_r13, 20, 107, -0.8F, -1.2F, -0.2F, 1, 1, 1, -0.201F, false));
		gun10_r13.cubeList.add(new ModelBox(gun10_r13, 107, 22, -0.8F, -0.8F, -0.2F, 1, 1, 1, -0.2F, false));

		gun10_r14 = new ModelRenderer(this);
		gun10_r14.setRotationPoint(1.0092F, -3.2875F, -13.0291F);
		receiver2.addChild(gun10_r14);
		setRotationAngle(gun10_r14, 0.0F, 0.0F, -1.2566F);
		gun10_r14.cubeList.add(new ModelBox(gun10_r14, 71, 66, -0.8F, -1.8F, -0.2F, 1, 2, 1, -0.202F, false));

		gun9_r18 = new ModelRenderer(this);
		gun9_r18.setRotationPoint(1.5092F, -3.2294F, 19.4709F);
		receiver2.addChild(gun9_r18);
		setRotationAngle(gun9_r18, 0.0F, 0.0F, -0.3142F);
		gun9_r18.cubeList.add(new ModelBox(gun9_r18, 24, 107, -0.8F, -1.1F, -0.2F, 1, 1, 1, -0.201F, false));
		gun9_r18.cubeList.add(new ModelBox(gun9_r18, 107, 25, -0.8F, -0.8F, -0.2F, 1, 1, 1, -0.2F, false));

		gun9_r19 = new ModelRenderer(this);
		gun9_r19.setRotationPoint(1.5092F, -3.2294F, 19.4709F);
		receiver2.addChild(gun9_r19);
		setRotationAngle(gun9_r19, 0.0F, 0.0F, -0.7854F);
		gun9_r19.cubeList.add(new ModelBox(gun9_r19, 0, 100, -1.8F, -0.8F, -0.2F, 2, 1, 1, -0.199F, false));

		gun9_r20 = new ModelRenderer(this);
		gun9_r20.setRotationPoint(1.2092F, -4.0875F, 19.4709F);
		receiver2.addChild(gun9_r20);
		setRotationAngle(gun9_r20, 0.0F, 0.0F, -1.5184F);
		gun9_r20.cubeList.add(new ModelBox(gun9_r20, 72, 9, -0.8F, -1.78F, -0.2F, 1, 2, 1, -0.202F, false));

		gun9_r21 = new ModelRenderer(this);
		gun9_r21.setRotationPoint(-3.5828F, -2.0294F, 22.4709F);
		receiver2.addChild(gun9_r21);
		setRotationAngle(gun9_r21, 0.0F, 0.0F, 0.5236F);
		gun9_r21.cubeList.add(new ModelBox(gun9_r21, 48, 39, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.2F, false));

		gun10_r15 = new ModelRenderer(this);
		gun10_r15.setRotationPoint(-3.5828F, -1.6294F, 22.4709F);
		receiver2.addChild(gun10_r15);
		setRotationAngle(gun10_r15, 0.0F, 0.0F, 0.3142F);
		gun10_r15.cubeList.add(new ModelBox(gun10_r15, 28, 62, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun9_r22 = new ModelRenderer(this);
		gun9_r22.setRotationPoint(1.6092F, -1.6294F, 22.4709F);
		receiver2.addChild(gun9_r22);
		setRotationAngle(gun9_r22, 0.0F, 0.0F, -0.3142F);
		gun9_r22.cubeList.add(new ModelBox(gun9_r22, 39, 65, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun8_r16 = new ModelRenderer(this);
		gun8_r16.setRotationPoint(1.6092F, -2.0294F, 22.4709F);
		receiver2.addChild(gun8_r16);
		setRotationAngle(gun8_r16, 0.0F, 0.0F, -0.5236F);
		gun8_r16.cubeList.add(new ModelBox(gun8_r16, 48, 45, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.2F, false));

		gun8_r17 = new ModelRenderer(this);
		gun8_r17.setRotationPoint(1.1092F, -0.4294F, 11.4709F);
		receiver2.addChild(gun8_r17);
		setRotationAngle(gun8_r17, 0.0F, 0.0F, 0.192F);
		gun8_r17.cubeList.add(new ModelBox(gun8_r17, 0, 92, -1.0F, 0.0F, -1.0F, 1, 2, 13, 0.0F, false));
		gun8_r17.cubeList.add(new ModelBox(gun8_r17, 56, 24, -0.8F, -0.2F, -5.2F, 1, 1, 5, -0.201F, false));
		gun8_r17.cubeList.add(new ModelBox(gun8_r17, 72, 50, -1.0F, 0.0F, -6.0F, 1, 2, 1, 0.0F, false));

		gun9_r23 = new ModelRenderer(this);
		gun9_r23.setRotationPoint(1.1092F, -0.4294F, 8.3709F);
		receiver2.addChild(gun9_r23);
		setRotationAngle(gun9_r23, -0.9425F, 0.0F, 0.192F);
		gun9_r23.cubeList.add(new ModelBox(gun9_r23, 39, 58, -0.8F, 1.3F, -1.3F, 1, 1, 1, -0.202F, false));
		gun9_r23.cubeList.add(new ModelBox(gun9_r23, 39, 45, -0.8F, 0.7F, -0.7F, 1, 2, 1, -0.202F, false));

		gun8_r18 = new ModelRenderer(this);
		gun8_r18.setRotationPoint(1.1092F, -0.4294F, 5.4709F);
		receiver2.addChild(gun8_r18);
		setRotationAngle(gun8_r18, -0.5061F, 0.0F, 0.0F);
		gun8_r18.cubeList.add(new ModelBox(gun8_r18, 107, 29, -0.9F, -1.2F, -0.1F, 1, 1, 1, -0.101F, false));
		gun8_r18.cubeList.add(new ModelBox(gun8_r18, 107, 34, -0.9F, -0.9F, -0.1F, 1, 1, 1, -0.1F, false));

		gun9_r24 = new ModelRenderer(this);
		gun9_r24.setRotationPoint(-2.8828F, -3.2294F, 20.9709F);
		receiver2.addChild(gun9_r24);
		setRotationAngle(gun9_r24, -0.3316F, 0.0F, 0.0F);
		gun9_r24.cubeList.add(new ModelBox(gun9_r24, 8, 107, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun9_r24.cubeList.add(new ModelBox(gun9_r24, 107, 10, 2.792F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun10_r16 = new ModelRenderer(this);
		gun10_r16.setRotationPoint(-2.8828F, 2.2706F, 20.9709F);
		receiver2.addChild(gun10_r16);
		setRotationAngle(gun10_r16, -0.3316F, 0.0F, 0.0F);
		gun10_r16.cubeList.add(new ModelBox(gun10_r16, 4, 107, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun10_r16.cubeList.add(new ModelBox(gun10_r16, 107, 7, 2.792F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun8_r19 = new ModelRenderer(this);
		gun8_r19.setRotationPoint(1.2132F, 2.2625F, 7.9709F);
		receiver2.addChild(gun8_r19);
		setRotationAngle(gun8_r19, 0.152F, -1.218F, -0.1428F);
		gun8_r19.cubeList.add(new ModelBox(gun8_r19, 56, 27, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.001F, false));

		gun7_r14 = new ModelRenderer(this);
		gun7_r14.setRotationPoint(1.2132F, 2.2625F, 7.9709F);
		receiver2.addChild(gun7_r14);
		setRotationAngle(gun7_r14, 0.0524F, 0.0F, 0.0F);
		gun7_r14.cubeList.add(new ModelBox(gun7_r14, 29, 56, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.001F, false));

		gun7_r15 = new ModelRenderer(this);
		gun7_r15.setRotationPoint(0.9632F, 3.2625F, 5.9709F);
		receiver2.addChild(gun7_r15);
		setRotationAngle(gun7_r15, 0.5061F, 0.0F, 0.0F);
		gun7_r15.cubeList.add(new ModelBox(gun7_r15, 8, 86, -1.0F, -1.15F, 0.0F, 1, 1, 2, 0.0F, false));
		gun7_r15.cubeList.add(new ModelBox(gun7_r15, 47, 86, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.001F, false));

		gun9_r25 = new ModelRenderer(this);
		gun9_r25.setRotationPoint(-2.0368F, 3.2625F, 6.5709F);
		receiver2.addChild(gun9_r25);
		setRotationAngle(gun9_r25, 0.0175F, 0.0F, 0.0F);
		gun9_r25.cubeList.add(new ModelBox(gun9_r25, 85, 25, -1.2F, -1.2F, 1.1F, 1, 1, 2, -0.2F, false));
		gun9_r25.cubeList.add(new ModelBox(gun9_r25, 85, 49, -0.9F, -1.2F, 0.0F, 1, 1, 2, -0.1F, false));

		gun7_r16 = new ModelRenderer(this);
		gun7_r16.setRotationPoint(-1.9368F, 3.2625F, 5.9709F);
		receiver2.addChild(gun7_r16);
		setRotationAngle(gun7_r16, 0.2269F, 0.0F, 0.0F);
		gun7_r16.cubeList.add(new ModelBox(gun7_r16, 39, 48, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.001F, false));

		gun8_r20 = new ModelRenderer(this);
		gun8_r20.setRotationPoint(0.9632F, 2.7625F, 4.1709F);
		receiver2.addChild(gun8_r20);
		setRotationAngle(gun8_r20, 0.0698F, 0.0F, 0.0F);
		gun8_r20.cubeList.add(new ModelBox(gun8_r20, 6, 82, -1.0F, -1.0F, -3.0F, 1, 1, 3, -0.25F, false));

		gun10_r17 = new ModelRenderer(this);
		gun10_r17.setRotationPoint(-1.9368F, 2.7625F, 4.6709F);
		receiver2.addChild(gun10_r17);
		setRotationAngle(gun10_r17, 0.0698F, 0.0F, 0.0F);
		gun10_r17.cubeList.add(new ModelBox(gun10_r17, 66, 28, -1.3F, -1.0F, -3.9F, 1, 1, 2, -0.201F, false));
		gun10_r17.cubeList.add(new ModelBox(gun10_r17, 60, 71, -1.0F, -1.0F, -2.7F, 1, 1, 2, -0.2F, false));
		gun10_r17.cubeList.add(new ModelBox(gun10_r17, 33, 38, -0.9F, -1.0F, -1.0F, 1, 1, 1, -0.1F, false));
		gun10_r17.cubeList.add(new ModelBox(gun10_r17, 45, 16, 1.9F, -1.0F, -1.0F, 1, 1, 1, -0.1F, false));

		gun7_r17 = new ModelRenderer(this);
		gun7_r17.setRotationPoint(-0.7368F, -3.4888F, -13.6403F);
		receiver2.addChild(gun7_r17);
		setRotationAngle(gun7_r17, -0.2618F, 0.0F, 0.0F);
		gun7_r17.cubeList.add(new ModelBox(gun7_r17, 107, 46, -0.5F, -0.25F, -1.0F, 1, 1, 1, 0.001F, false));

		gun11_r5 = new ModelRenderer(this);
		gun11_r5.setRotationPoint(0.8086F, -0.9556F, -14.3791F);
		receiver2.addChild(gun11_r5);
		setRotationAngle(gun11_r5, -0.7957F, -1.2051F, 0.7615F);
		gun11_r5.cubeList.add(new ModelBox(gun11_r5, 8, 0, -1.0F, 0.0F, 0.0F, 1, 3, 1, -0.001F, false));

		gun10_r18 = new ModelRenderer(this);
		gun10_r18.setRotationPoint(0.8086F, -0.9556F, -14.3791F);
		receiver2.addChild(gun10_r18);
		setRotationAngle(gun10_r18, -0.2583F, 0.0F, 0.0F);
		gun10_r18.cubeList.add(new ModelBox(gun10_r18, 0, 19, -1.0F, 0.0F, 0.0F, 1, 3, 1, -0.001F, false));

		gun8_r21 = new ModelRenderer(this);
		gun8_r21.setRotationPoint(0.6132F, -1.3056F, -13.2791F);
		receiver2.addChild(gun8_r21);
		setRotationAngle(gun8_r21, -0.2583F, 0.0F, 0.0F);
		gun8_r21.cubeList.add(new ModelBox(gun8_r21, 72, 57, -0.7F, -0.2F, -0.68F, 1, 2, 1, -0.3F, false));

		gun7_r18 = new ModelRenderer(this);
		gun7_r18.setRotationPoint(0.6132F, -1.3056F, -15.2791F);
		receiver2.addChild(gun7_r18);
		setRotationAngle(gun7_r18, -0.2583F, 0.0F, 0.0F);
		gun7_r18.cubeList.add(new ModelBox(gun7_r18, 8, 19, -1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun9_r26 = new ModelRenderer(this);
		gun9_r26.setRotationPoint(0.6132F, -1.3056F, -15.2791F);
		receiver2.addChild(gun9_r26);
		setRotationAngle(gun9_r26, -0.2589F, -0.0675F, -0.2963F);
		gun9_r26.cubeList.add(new ModelBox(gun9_r26, 47, 107, -1.0F, -2.9F, 0.0F, 1, 1, 1, -0.001F, false));
		gun9_r26.cubeList.add(new ModelBox(gun9_r26, 0, 76, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun8_r22 = new ModelRenderer(this);
		gun8_r22.setRotationPoint(0.6132F, -1.3056F, -15.2791F);
		receiver2.addChild(gun8_r22);
		setRotationAngle(gun8_r22, -0.2583F, 0.0F, -0.3142F);
		gun8_r22.cubeList.add(new ModelBox(gun8_r22, 107, 49, -1.0F, -2.9F, 0.0F, 1, 1, 1, -0.002F, false));
		gun8_r22.cubeList.add(new ModelBox(gun8_r22, 16, 76, -1.0F, -2.2F, 0.0F, 1, 2, 1, -0.001F, false));

		gun7_r19 = new ModelRenderer(this);
		gun7_r19.setRotationPoint(0.6132F, -1.3056F, -7.2791F);
		receiver2.addChild(gun7_r19);
		setRotationAngle(gun7_r19, 0.0F, 0.0F, -0.3142F);
		gun7_r19.cubeList.add(new ModelBox(gun7_r19, 39, 39, -1.0F, -2.0F, 0.0F, 1, 2, 14, 0.0F, false));
		gun7_r19.cubeList.add(new ModelBox(gun7_r19, 78, 44, -1.0F, -1.5F, -4.0F, 1, 1, 4, -0.001F, false));
		gun7_r19.cubeList.add(new ModelBox(gun7_r19, 78, 54, -1.0F, -2.0F, -4.0F, 1, 1, 4, 0.0F, false));
		gun7_r19.cubeList.add(new ModelBox(gun7_r19, 9, 10, -1.0F, -2.0F, -7.0F, 1, 2, 3, 0.0F, false));

		gun8_r23 = new ModelRenderer(this);
		gun8_r23.setRotationPoint(0.6132F, -1.3056F, -7.2791F);
		receiver2.addChild(gun8_r23);
		setRotationAngle(gun8_r23, 0.7854F, 0.0F, -0.3142F);
		gun8_r23.cubeList.add(new ModelBox(gun8_r23, 51, 107, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.002F, false));

		gun7_r20 = new ModelRenderer(this);
		gun7_r20.setRotationPoint(0.6132F, -1.3056F, -11.2791F);
		receiver2.addChild(gun7_r20);
		setRotationAngle(gun7_r20, 0.7854F, 0.0F, -0.3142F);
		gun7_r20.cubeList.add(new ModelBox(gun7_r20, 55, 107, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.002F, false));

		gun8_r24 = new ModelRenderer(this);
		gun8_r24.setRotationPoint(0.4632F, -1.1375F, -7.2791F);
		receiver2.addChild(gun8_r24);
		setRotationAngle(gun8_r24, 0.7854F, 0.0F, 0.0F);
		gun8_r24.cubeList.add(new ModelBox(gun8_r24, 59, 107, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		gun7_r21 = new ModelRenderer(this);
		gun7_r21.setRotationPoint(0.4632F, -1.1375F, -11.2791F);
		receiver2.addChild(gun7_r21);
		setRotationAngle(gun7_r21, 0.7854F, 0.0F, 0.0F);
		gun7_r21.cubeList.add(new ModelBox(gun7_r21, 107, 61, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		gun6_r7 = new ModelRenderer(this);
		gun6_r7.setRotationPoint(0.7703F, 2.2625F, -15.2791F);
		receiver2.addChild(gun6_r7);
		setRotationAngle(gun6_r7, 0.0F, 0.0F, 1.0472F);
		gun6_r7.cubeList.add(new ModelBox(gun6_r7, 78, 0, -1.0F, 0.0F, 0.0F, 1, 1, 14, 0.0F, false));

		gun6_r8 = new ModelRenderer(this);
		gun6_r8.setRotationPoint(0.7703F, 0.2625F, -13.2791F);
		receiver2.addChild(gun6_r8);
		setRotationAngle(gun6_r8, 0.0F, 0.0F, 0.4538F);
		gun6_r8.cubeList.add(new ModelBox(gun6_r8, 63, 115, -1.0F, 0.0F, -1.0F, 1, 1, 22, 0.0F, false));

		gun25_r1 = new ModelRenderer(this);
		gun25_r1.setRotationPoint(-0.6868F, -5.3375F, 21.5709F);
		receiver2.addChild(gun25_r1);
		setRotationAngle(gun25_r1, -0.6981F, 0.0F, 0.0F);
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 84, 0, -1.45F, -0.3F, -0.3F, 1, 1, 3, -0.3F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 92, 99, -1.3F, -0.3F, -0.3F, 2, 1, 1, -0.301F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 84, 5, -0.15F, -0.3F, -0.3F, 1, 1, 3, -0.3F, false));

		gun12_r2 = new ModelRenderer(this);
		gun12_r2.setRotationPoint(0.0132F, -3.5375F, -1.2791F);
		receiver2.addChild(gun12_r2);
		setRotationAngle(gun12_r2, -0.7854F, 0.0F, 0.0F);
		gun12_r2.cubeList.add(new ModelBox(gun12_r2, 107, 68, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		gun11_r6 = new ModelRenderer(this);
		gun11_r6.setRotationPoint(0.0132F, -4.5375F, -1.2791F);
		receiver2.addChild(gun11_r6);
		setRotationAngle(gun11_r6, -0.7854F, 0.0F, 0.0F);
		gun11_r6.cubeList.add(new ModelBox(gun11_r6, 69, 107, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.201F, false));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(0.0132F, -3.5375F, -3.5291F);
		receiver2.addChild(gun13_r1);
		setRotationAngle(gun13_r1, 0.7854F, 0.0F, 0.0F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 107, 73, -0.8F, -0.2F, -0.8F, 1, 1, 1, -0.202F, false));

		gun12_r3 = new ModelRenderer(this);
		gun12_r3.setRotationPoint(0.0132F, -4.5375F, -3.5291F);
		receiver2.addChild(gun12_r3);
		setRotationAngle(gun12_r3, 0.7854F, 0.0F, 0.0F);
		gun12_r3.cubeList.add(new ModelBox(gun12_r3, 78, 107, -0.8F, -0.2F, -0.8F, 1, 1, 1, -0.201F, false));

		gun11_r7 = new ModelRenderer(this);
		gun11_r7.setRotationPoint(0.0132F, -3.5375F, -5.5291F);
		receiver2.addChild(gun11_r7);
		setRotationAngle(gun11_r7, -0.7854F, 0.0F, 0.0F);
		gun11_r7.cubeList.add(new ModelBox(gun11_r7, 82, 107, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		gun10_r19 = new ModelRenderer(this);
		gun10_r19.setRotationPoint(0.0132F, -4.5375F, -5.5291F);
		receiver2.addChild(gun10_r19);
		setRotationAngle(gun10_r19, -0.7854F, 0.0F, 0.0F);
		gun10_r19.cubeList.add(new ModelBox(gun10_r19, 107, 84, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.201F, false));

		gun12_r4 = new ModelRenderer(this);
		gun12_r4.setRotationPoint(0.0132F, -3.5375F, -7.7791F);
		receiver2.addChild(gun12_r4);
		setRotationAngle(gun12_r4, 0.7854F, 0.0F, 0.0F);
		gun12_r4.cubeList.add(new ModelBox(gun12_r4, 86, 107, -0.8F, -0.2F, -0.8F, 1, 1, 1, -0.202F, false));

		gun11_r8 = new ModelRenderer(this);
		gun11_r8.setRotationPoint(0.0132F, -4.5375F, -7.7791F);
		receiver2.addChild(gun11_r8);
		setRotationAngle(gun11_r8, 0.7854F, 0.0F, 0.0F);
		gun11_r8.cubeList.add(new ModelBox(gun11_r8, 107, 87, -0.8F, -0.2F, -0.8F, 1, 1, 1, -0.201F, false));

		gun10_r20 = new ModelRenderer(this);
		gun10_r20.setRotationPoint(0.0132F, -4.5375F, -12.0291F);
		receiver2.addChild(gun10_r20);
		setRotationAngle(gun10_r20, 0.7854F, 0.0F, 0.0F);
		gun10_r20.cubeList.add(new ModelBox(gun10_r20, 90, 107, -0.8F, -0.2F, -0.8F, 1, 1, 1, -0.201F, false));

		gun11_r9 = new ModelRenderer(this);
		gun11_r9.setRotationPoint(0.0132F, -3.5375F, -12.0291F);
		receiver2.addChild(gun11_r9);
		setRotationAngle(gun11_r9, 0.7854F, 0.0F, 0.0F);
		gun11_r9.cubeList.add(new ModelBox(gun11_r9, 107, 91, -0.8F, -0.2F, -0.8F, 1, 1, 1, -0.202F, false));

		gun10_r21 = new ModelRenderer(this);
		gun10_r21.setRotationPoint(0.0132F, -3.5375F, -9.7791F);
		receiver2.addChild(gun10_r21);
		setRotationAngle(gun10_r21, -0.7854F, 0.0F, 0.0F);
		gun10_r21.cubeList.add(new ModelBox(gun10_r21, 107, 93, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		gun9_r27 = new ModelRenderer(this);
		gun9_r27.setRotationPoint(0.0132F, -4.5375F, -9.7791F);
		receiver2.addChild(gun9_r27);
		setRotationAngle(gun9_r27, -0.7854F, 0.0F, 0.0F);
		gun9_r27.cubeList.add(new ModelBox(gun9_r27, 94, 107, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.201F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.1868F, -5.4375F, 11.2209F);
		receiver2.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 84, 88, -1.8F, -0.2F, 8.55F, 2, 1, 2, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 99, 88, -1.8F, -0.2F, 7.3F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 84, 99, -1.8F, -0.2F, 6.05F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 99, 73, -1.8F, -0.2F, 4.8F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 99, 65, -1.8F, -0.2F, 3.55F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 59, 99, -1.8F, -0.2F, 2.3F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 99, 50, -1.8F, -0.2F, 1.05F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 99, 34, -1.8F, -0.2F, -0.2F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 99, 26, -1.8F, -0.2F, -1.45F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 99, 11, -1.8F, -0.2F, -2.7F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 98, 92, -1.8F, -0.2F, -3.95F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 98, 86, -1.8F, -0.2F, -5.2F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 98, 83, -1.8F, -0.2F, -6.45F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 98, 80, -1.8F, -0.2F, -7.7F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 98, 77, -1.8F, -0.2F, -8.95F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 98, 63, -1.8F, -0.2F, -10.2F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 98, 60, -1.8F, -0.2F, -11.45F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 98, 57, -1.8F, -0.2F, -12.7F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 98, 54, -1.8F, -0.2F, -13.95F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 98, 48, -1.8F, -0.2F, -15.2F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 98, 45, -1.8F, -0.2F, -16.45F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 98, 42, -1.8F, -0.2F, -17.7F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 98, 39, -1.8F, -0.2F, -18.95F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 98, 24, -1.8F, -0.2F, -20.2F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 98, 21, -1.8F, -0.2F, -21.45F, 2, 1, 1, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 78, 87, -1.8F, -0.2F, -23.7F, 2, 1, 2, -0.201F, false));
		bone.cubeList.add(new ModelBox(bone, 82, 111, -0.9F, 0.2F, -23.65F, 1, 1, 33, -0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 78, 77, -1.7F, 0.2F, -23.65F, 1, 1, 33, -0.1F, false));

		gun12_r5 = new ModelRenderer(this);
		gun12_r5.setRotationPoint(0.0F, 0.0F, 9.75F);
		bone.addChild(gun12_r5);
		setRotationAngle(gun12_r5, 0.0F, 0.0F, -0.7505F);
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 105, 106, -0.7F, -0.3F, -0.1F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 94, 80, -0.7F, -0.3F, -1.3F, 1, 1, 2, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 90, 105, -0.7F, -0.3F, -10.05F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 94, 105, -0.7F, -0.3F, -9.85F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 105, 70, -0.7F, -0.3F, -11.1F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 59, 105, -0.7F, -0.3F, -11.3F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 51, 105, -0.7F, -0.3F, -12.55F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 55, 105, -0.7F, -0.3F, -12.35F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 39, 105, -0.7F, -0.3F, -13.6F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 105, 31, -0.7F, -0.3F, -13.8F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 104, 86, -0.7F, -0.3F, -15.05F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 104, 72, -0.7F, -0.3F, -14.85F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 68, 104, -0.7F, -0.3F, -16.1F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 104, 66, -0.7F, -0.3F, -16.3F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 32, 104, -0.7F, -0.3F, -17.55F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 104, 33, -0.7F, -0.3F, -17.35F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 28, 104, -0.7F, -0.3F, -18.6F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 104, 27, -0.7F, -0.3F, -18.8F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 104, 9, -0.7F, -0.3F, -19.85F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 103, 102, -0.7F, -0.3F, -20.05F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 71, 103, -0.7F, -0.3F, -21.1F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 103, 78, -0.7F, -0.3F, -21.3F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 103, 61, -0.7F, -0.3F, -22.35F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 103, 58, -0.7F, -0.3F, -22.55F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 103, 22, -0.7F, -0.3F, -23.6F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 103, 19, -0.7F, -0.3F, -23.8F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 103, 16, -0.7F, -0.3F, -24.85F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 103, 7, -0.7F, -0.3F, -25.05F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 102, 69, -0.7F, -0.3F, -26.1F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 68, 102, -0.7F, -0.3F, -26.3F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 8, 102, -0.7F, -0.3F, -27.35F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 102, 30, -0.7F, -0.3F, -27.55F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 4, 102, -0.7F, -0.3F, -28.6F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 0, 102, -0.7F, -0.3F, -28.8F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 82, 101, -0.7F, -0.3F, -29.85F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 78, 101, -0.7F, -0.3F, -30.05F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 71, 101, -0.7F, -0.3F, -31.3F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 101, 71, -0.7F, -0.3F, -31.1F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 94, 63, -0.7F, -0.3F, -33.35F, 1, 1, 2, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 69, 94, -0.7F, -0.3F, -33.55F, 1, 1, 2, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 0, 114, -1.7F, -0.2F, -32.55F, 2, 1, 32, -0.4F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 101, 106, -0.7F, -0.3F, -2.55F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 106, 101, -0.7F, -0.3F, -2.35F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 106, 82, -0.7F, -0.3F, -3.6F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 106, 77, -0.7F, -0.3F, -3.8F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 106, 56, -0.7F, -0.3F, -5.05F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 106, 54, -0.7F, -0.3F, -4.85F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 106, 39, -0.7F, -0.3F, -6.3F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 31, 106, -0.7F, -0.3F, -6.1F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 106, 17, -0.7F, -0.3F, -7.55F, 1, 1, 1, -0.302F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 106, 15, -0.7F, -0.3F, -7.35F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 98, 105, -0.7F, -0.3F, -8.6F, 1, 1, 1, -0.303F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 106, 0, -0.7F, -0.3F, -8.8F, 1, 1, 1, -0.302F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(-1.6F, 0.0F, -23.5F);
		bone.addChild(gun23_r1);
		setRotationAngle(gun23_r1, 0.0F, 0.0F, 0.7505F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 113, 76, -0.3F, -0.2F, 0.7F, 2, 1, 32, -0.4F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 94, 60, -0.3F, -0.3F, -0.1F, 1, 1, 2, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 94, 77, -0.3F, -0.3F, -0.3F, 1, 1, 2, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 57, 101, -0.3F, -0.3F, 1.95F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 61, 101, -0.3F, -0.3F, 2.15F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 86, 101, -0.3F, -0.3F, 3.2F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 92, 101, -0.3F, -0.3F, 3.4F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 96, 101, -0.3F, -0.3F, 4.45F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 100, 101, -0.3F, -0.3F, 4.65F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 39, 102, -0.3F, -0.3F, 5.9F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 43, 102, -0.3F, -0.3F, 5.7F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 47, 102, -0.3F, -0.3F, 6.95F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 64, 102, -0.3F, -0.3F, 7.15F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 103, 1, -0.3F, -0.3F, 8.2F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 103, 4, -0.3F, -0.3F, 8.4F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 103, 40, -0.3F, -0.3F, 9.45F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 103, 43, -0.3F, -0.3F, 9.65F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 103, 46, -0.3F, -0.3F, 10.7F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 103, 55, -0.3F, -0.3F, 10.9F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 103, 81, -0.3F, -0.3F, 12.15F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 103, 84, -0.3F, -0.3F, 11.95F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 103, 97, -0.3F, -0.3F, 13.2F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 103, 100, -0.3F, -0.3F, 13.4F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 104, 12, -0.3F, -0.3F, 14.45F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 104, 24, -0.3F, -0.3F, 14.65F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 104, 48, -0.3F, -0.3F, 15.7F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 104, 51, -0.3F, -0.3F, 15.9F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 104, 63, -0.3F, -0.3F, 16.95F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 64, 104, -0.3F, -0.3F, 17.15F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 104, 89, -0.3F, -0.3F, 18.4F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 104, 92, -0.3F, -0.3F, 18.2F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 104, 95, -0.3F, -0.3F, 19.45F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 103, 104, -0.3F, -0.3F, 19.65F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 43, 105, -0.3F, -0.3F, 20.7F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 47, 105, -0.3F, -0.3F, 20.9F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 71, 105, -0.3F, -0.3F, 21.95F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 78, 105, -0.3F, -0.3F, 22.15F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 82, 105, -0.3F, -0.3F, 23.2F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 86, 105, -0.3F, -0.3F, 23.4F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 106, 2, -0.3F, -0.3F, 24.65F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 106, 5, -0.3F, -0.3F, 24.45F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 106, 20, -0.3F, -0.3F, 25.9F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 27, 106, -0.3F, -0.3F, 25.7F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 106, 41, -0.3F, -0.3F, 27.15F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 106, 44, -0.3F, -0.3F, 26.95F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 106, 59, -0.3F, -0.3F, 28.4F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 62, 106, -0.3F, -0.3F, 28.2F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 66, 106, -0.3F, -0.3F, 29.45F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 106, 79, -0.3F, -0.3F, 29.65F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 106, 98, -0.3F, -0.3F, 30.7F, 1, 1, 1, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 106, 103, -0.3F, -0.3F, 30.9F, 1, 1, 1, -0.303F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 94, 83, -0.3F, -0.3F, 31.95F, 1, 1, 2, -0.302F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 0, 107, -0.3F, -0.3F, 33.15F, 1, 1, 1, -0.303F, false));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(-0.6F, 0.1F, -23.35F);
		bone.addChild(gun26_r1);
		setRotationAngle(gun26_r1, 0.6981F, 0.0F, 0.0F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 98, 18, -1.2F, -0.3F, -0.7F, 2, 1, 1, -0.301F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 45, 82, -0.05F, -0.3F, -2.7F, 1, 1, 3, -0.3F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 61, 82, -1.35F, -0.3F, -2.7F, 1, 1, 3, -0.3F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(6.6132F, 1.8625F, 9.9209F);
		receiver2.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 1.5708F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 87, -1.8F, 4.8F, -12.7F, 2, 1, 2, -0.201F, false));
		bone2.cubeList.add(new ModelBox(bone2, 98, 15, -1.8F, 4.8F, -13.95F, 2, 1, 1, -0.201F, false));
		bone2.cubeList.add(new ModelBox(bone2, 98, 9, -1.8F, 4.8F, -15.2F, 2, 1, 1, -0.201F, false));
		bone2.cubeList.add(new ModelBox(bone2, 98, 6, -1.8F, 4.8F, -16.45F, 2, 1, 1, -0.201F, false));
		bone2.cubeList.add(new ModelBox(bone2, 98, 3, -1.8F, 4.8F, -17.7F, 2, 1, 1, -0.201F, false));
		bone2.cubeList.add(new ModelBox(bone2, 98, 0, -1.8F, 4.8F, -18.95F, 2, 1, 1, -0.201F, false));
		bone2.cubeList.add(new ModelBox(bone2, 19, 97, -1.8F, 4.8F, -20.2F, 2, 1, 1, -0.201F, false));
		bone2.cubeList.add(new ModelBox(bone2, 94, 89, -1.8F, 4.8F, -21.45F, 2, 1, 1, -0.201F, false));
		bone2.cubeList.add(new ModelBox(bone2, 23, 86, -1.8F, 4.8F, -23.7F, 2, 1, 2, -0.201F, false));
		bone2.cubeList.add(new ModelBox(bone2, 113, 89, -0.9F, 5.2F, -23.25F, 1, 1, 12, -0.1F, false));
		bone2.cubeList.add(new ModelBox(bone2, 113, 76, -1.7F, 5.2F, -23.25F, 1, 1, 12, -0.1F, false));

		gun13_r2 = new ModelRenderer(this);
		gun13_r2.setRotationPoint(0.0F, 5.0F, -8.25F);
		bone2.addChild(gun13_r2);
		setRotationAngle(gun13_r2, 0.0F, 0.0F, -0.7505F);
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 55, 84, -0.7F, -0.3F, -3.35F, 1, 1, 1, -0.303F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 94, 39, -0.7F, -0.3F, -4.55F, 1, 1, 2, -0.302F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 84, 69, -0.7F, -0.3F, -9.35F, 1, 1, 1, -0.303F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 71, 84, -0.7F, -0.3F, -9.55F, 1, 1, 1, -0.302F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 84, 71, -0.7F, -0.3F, -10.6F, 1, 1, 1, -0.303F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 78, 84, -0.7F, -0.3F, -10.8F, 1, 1, 1, -0.302F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 29, 86, -0.7F, -0.3F, -11.85F, 1, 1, 1, -0.303F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 71, 87, -0.7F, -0.3F, -12.05F, 1, 1, 1, -0.302F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 88, 80, -0.7F, -0.3F, -13.3F, 1, 1, 1, -0.302F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 49, 89, -0.7F, -0.3F, -13.1F, 1, 1, 1, -0.303F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 94, 42, -0.7F, -0.3F, -15.35F, 1, 1, 2, -0.303F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 94, 45, -0.7F, -0.3F, -15.55F, 1, 1, 2, -0.302F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 116, 58, -1.7F, -0.2F, -14.15F, 2, 1, 11, -0.4F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 71, 89, -0.7F, -0.3F, -5.8F, 1, 1, 1, -0.302F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 90, 30, -0.7F, -0.3F, -5.6F, 1, 1, 1, -0.303F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 90, 32, -0.7F, -0.3F, -6.85F, 1, 1, 1, -0.303F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 90, 69, -0.7F, -0.3F, -7.05F, 1, 1, 1, -0.302F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 90, 71, -0.7F, -0.3F, -8.3F, 1, 1, 1, -0.302F, false));
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 0, 92, -0.7F, -0.3F, -8.1F, 1, 1, 1, -0.303F, false));

		gun24_r1 = new ModelRenderer(this);
		gun24_r1.setRotationPoint(-1.6F, 5.0F, -23.5F);
		bone2.addChild(gun24_r1);
		setRotationAngle(gun24_r1, 0.0F, 0.0F, 0.7505F);
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 118, 20, -0.3F, -0.2F, 1.1F, 2, 1, 11, -0.4F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 94, 48, -0.3F, -0.3F, -0.1F, 1, 1, 2, -0.303F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 94, 54, -0.3F, -0.3F, -0.3F, 1, 1, 2, -0.302F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 15, 92, -0.3F, -0.3F, 1.95F, 1, 1, 1, -0.302F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 21, 92, -0.3F, -0.3F, 2.15F, 1, 1, 1, -0.303F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 47, 92, -0.3F, -0.3F, 3.2F, 1, 1, 1, -0.302F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 59, 92, -0.3F, -0.3F, 3.4F, 1, 1, 1, -0.303F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 0, 94, -0.3F, -0.3F, 4.45F, 1, 1, 1, -0.302F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 15, 94, -0.3F, -0.3F, 4.65F, 1, 1, 1, -0.303F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 21, 94, -0.3F, -0.3F, 5.9F, 1, 1, 1, -0.303F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 57, 95, -0.3F, -0.3F, 5.7F, 1, 1, 1, -0.302F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 4, 97, -0.3F, -0.3F, 7.15F, 1, 1, 1, -0.303F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 43, 97, -0.3F, -0.3F, 6.95F, 1, 1, 1, -0.302F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 71, 97, -0.3F, -0.3F, 8.2F, 1, 1, 1, -0.302F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 20, 99, -0.3F, -0.3F, 8.4F, 1, 1, 1, -0.303F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 27, 99, -0.3F, -0.3F, 9.45F, 1, 1, 1, -0.302F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 72, 99, -0.3F, -0.3F, 9.65F, 1, 1, 1, -0.303F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 94, 57, -0.3F, -0.3F, 10.7F, 1, 1, 2, -0.302F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 30, 100, -0.3F, -0.3F, 11.9F, 1, 1, 1, -0.303F, false));

		gun22_r1 = new ModelRenderer(this);
		gun22_r1.setRotationPoint(-1.6F, 5.0F, -23.5F);
		bone2.addChild(gun22_r1);
		setRotationAngle(gun22_r1, 0.0F, -0.384F, 0.0F);
		gun22_r1.cubeList.add(new ModelBox(gun22_r1, 84, 32, 4.7945F, -0.2F, 10.2931F, 1, 1, 1, -0.1F, false));
		gun22_r1.cubeList.add(new ModelBox(gun22_r1, 39, 84, 0.524F, -0.2F, -0.2768F, 1, 1, 1, -0.1F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-8.5868F, 1.8625F, 9.9209F);
		receiver2.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, -1.5708F);
		bone8.cubeList.add(new ModelBox(bone8, 84, 82, -0.2F, 4.8F, -12.7F, 2, 1, 2, -0.201F, false));
		bone8.cubeList.add(new ModelBox(bone8, 94, 66, -0.2F, 4.8F, -13.95F, 2, 1, 1, -0.201F, false));
		bone8.cubeList.add(new ModelBox(bone8, 94, 51, -0.2F, 4.8F, -15.2F, 2, 1, 1, -0.201F, false));
		bone8.cubeList.add(new ModelBox(bone8, 94, 27, -0.2F, 4.8F, -16.45F, 2, 1, 1, -0.201F, false));
		bone8.cubeList.add(new ModelBox(bone8, 94, 12, -0.2F, 4.8F, -17.7F, 2, 1, 1, -0.201F, false));
		bone8.cubeList.add(new ModelBox(bone8, 65, 73, -0.2F, 4.8F, -18.95F, 2, 1, 1, -0.201F, false));
		bone8.cubeList.add(new ModelBox(bone8, 46, 65, -0.2F, 4.8F, -20.2F, 2, 1, 1, -0.201F, false));
		bone8.cubeList.add(new ModelBox(bone8, 63, 50, -0.2F, 4.8F, -21.45F, 2, 1, 1, -0.201F, false));
		bone8.cubeList.add(new ModelBox(bone8, 84, 77, -0.2F, 4.8F, -23.7F, 2, 1, 2, -0.201F, false));
		bone8.cubeList.add(new ModelBox(bone8, 78, 92, -0.1F, 5.2F, -23.25F, 1, 1, 12, -0.1F, false));
		bone8.cubeList.add(new ModelBox(bone8, 39, 92, 0.7F, 5.2F, -23.25F, 1, 1, 12, -0.1F, false));

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(0.0F, 5.0F, -8.25F);
		bone8.addChild(gun14_r1);
		setRotationAngle(gun14_r1, 0.0F, 0.0F, 0.7505F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 71, 69, -0.3F, -0.3F, -3.35F, 1, 1, 1, -0.303F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 94, 9, -0.3F, -0.3F, -4.55F, 1, 1, 2, -0.302F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 6, 72, -0.3F, -0.3F, -9.35F, 1, 1, 1, -0.303F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 72, 13, -0.3F, -0.3F, -9.55F, 1, 1, 1, -0.302F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 14, 72, -0.3F, -0.3F, -10.6F, 1, 1, 1, -0.303F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 72, 53, -0.3F, -0.3F, -10.8F, 1, 1, 1, -0.302F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 71, 73, -0.3F, -0.3F, -11.85F, 1, 1, 1, -0.303F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 78, 30, -0.3F, -0.3F, -12.05F, 1, 1, 1, -0.302F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 78, 32, -0.3F, -0.3F, -13.3F, 1, 1, 1, -0.302F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 78, 39, -0.3F, -0.3F, -13.1F, 1, 1, 1, -0.303F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 94, 15, -0.3F, -0.3F, -15.35F, 1, 1, 2, -0.303F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 94, 18, -0.3F, -0.3F, -15.55F, 1, 1, 2, -0.302F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 0, 114, -0.3F, -0.2F, -14.15F, 2, 1, 11, -0.4F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 78, 41, -0.3F, -0.3F, -5.8F, 1, 1, 1, -0.302F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 78, 44, -0.3F, -0.3F, -5.6F, 1, 1, 1, -0.303F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 78, 46, -0.3F, -0.3F, -6.85F, 1, 1, 1, -0.303F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 78, 54, -0.3F, -0.3F, -7.05F, 1, 1, 1, -0.302F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 78, 56, -0.3F, -0.3F, -8.3F, 1, 1, 1, -0.302F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 78, 59, -0.3F, -0.3F, -8.1F, 1, 1, 1, -0.303F, false));

		gun25_r2 = new ModelRenderer(this);
		gun25_r2.setRotationPoint(1.6F, 5.0F, -23.5F);
		bone8.addChild(gun25_r2);
		setRotationAngle(gun25_r2, 0.0F, 0.0F, -0.7505F);
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 87, 115, -1.7F, -0.2F, 1.1F, 2, 1, 11, -0.4F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 94, 21, -0.7F, -0.3F, -0.1F, 1, 1, 2, -0.303F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 94, 24, -0.7F, -0.3F, -0.3F, 1, 1, 2, -0.302F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 78, 71, -0.7F, -0.3F, 1.95F, 1, 1, 1, -0.302F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 78, 77, -0.7F, -0.3F, 2.15F, 1, 1, 1, -0.303F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 78, 79, -0.7F, -0.3F, 3.2F, 1, 1, 1, -0.302F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 10, 80, -0.7F, -0.3F, 3.4F, 1, 1, 1, -0.303F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 16, 81, -0.7F, -0.3F, 4.45F, 1, 1, 1, -0.302F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 32, 81, -0.7F, -0.3F, 4.65F, 1, 1, 1, -0.303F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 0, 82, -0.7F, -0.3F, 5.9F, 1, 1, 1, -0.303F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 39, 82, -0.7F, -0.3F, 5.7F, 1, 1, 1, -0.302F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 55, 82, -0.7F, -0.3F, 7.15F, 1, 1, 1, -0.303F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 71, 82, -0.7F, -0.3F, 6.95F, 1, 1, 1, -0.302F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 78, 82, -0.7F, -0.3F, 8.2F, 1, 1, 1, -0.302F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 16, 83, -0.7F, -0.3F, 8.4F, 1, 1, 1, -0.303F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 32, 83, -0.7F, -0.3F, 9.45F, 1, 1, 1, -0.302F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 0, 84, -0.7F, -0.3F, 9.65F, 1, 1, 1, -0.303F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 31, 94, -0.7F, -0.3F, 10.7F, 1, 1, 2, -0.302F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 84, 30, -0.7F, -0.3F, 11.9F, 1, 1, 1, -0.303F, false));

		gun23_r2 = new ModelRenderer(this);
		gun23_r2.setRotationPoint(1.6F, 5.0F, -23.5F);
		bone8.addChild(gun23_r2);
		setRotationAngle(gun23_r2, 0.0F, 0.384F, 0.0F);
		gun23_r2.cubeList.add(new ModelBox(gun23_r2, 78, 61, -5.7945F, -0.2F, 10.2931F, 1, 1, 1, -0.1F, false));
		gun23_r2.cubeList.add(new ModelBox(gun23_r2, 78, 69, -1.524F, -0.2F, -0.2768F, 1, 1, 1, -0.1F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.5F, 3.9581F, 4.1225F);
		universal_parts.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 56, 0, -1.0F, 0.367F, -5.5431F, 2, 1, 8, 0.0F, false));

		gun240_r1 = new ModelRenderer(this);
		gun240_r1.setRotationPoint(1.0F, -1.433F, -0.8431F);
		bone3.addChild(gun240_r1);
		setRotationAngle(gun240_r1, -0.6458F, 0.0F, 0.0F);
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 78, 95, -2.0F, 0.0F, -1.0594F, 2, 2, 1, -0.101F, false));

		gun239_r1 = new ModelRenderer(this);
		gun239_r1.setRotationPoint(1.0F, -3.233F, -0.4431F);
		bone3.addChild(gun239_r1);
		setRotationAngle(gun239_r1, -0.2618F, 0.0F, 0.0F);
		gun239_r1.cubeList.add(new ModelBox(gun239_r1, 92, 95, -2.0F, 0.0F, -1.0F, 2, 2, 1, -0.1F, false));

		gun237_r1 = new ModelRenderer(this);
		gun237_r1.setRotationPoint(0.0F, -1.182F, -5.5961F);
		bone3.addChild(gun237_r1);
		setRotationAngle(gun237_r1, 0.2182F, 0.0F, 0.0F);
		gun237_r1.cubeList.add(new ModelBox(gun237_r1, 30, 9, -1.0F, -2.5F, -0.5F, 2, 5, 1, 0.001F, false));

		handle_and_trigger = new ModelRenderer(this);
		handle_and_trigger.setRotationPoint(2.0F, 29.5F, 9.0F);
		universal_parts.addChild(handle_and_trigger);
		

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(-1.4869F, -25.0904F, 1.1627F);
		handle_and_trigger.addChild(bone63);
		setRotationAngle(bone63, 1.5708F, 0.0F, 0.0F);
		bone63.cubeList.add(new ModelBox(bone63, 84, 54, 0.5954F, -0.6278F, -0.8333F, 1, 1, 3, 0.0F, false));
		bone63.cubeList.add(new ModelBox(bone63, 84, 44, -1.6216F, -0.6278F, -0.8333F, 1, 1, 3, 0.0F, false));
		bone63.cubeList.add(new ModelBox(bone63, 16, 86, -1.0131F, 0.1655F, -0.8333F, 2, 1, 3, 0.099F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.4869F, -25.0904F, 1.1627F);
		handle_and_trigger.addChild(bone5);
		setRotationAngle(bone5, 1.7017F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 39, 55, 0.5954F, -1.6278F, -4.8333F, 1, 2, 5, -0.001F, false));
		bone5.cubeList.add(new ModelBox(bone5, 42, 24, -1.6216F, -1.6278F, -4.8333F, 1, 2, 5, -0.001F, false));
		bone5.cubeList.add(new ModelBox(bone5, 39, 45, -1.0131F, 0.1655F, -4.8333F, 2, 1, 5, 0.1F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-1.4869F, -25.0904F, 1.1627F);
		handle_and_trigger.addChild(bone6);
		setRotationAngle(bone6, 1.4835F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 15, 92, 0.5954F, 0.3907F, -8.4665F, 1, 1, 4, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 92, -1.6216F, 0.3907F, -8.4665F, 1, 1, 4, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 16, 65, -1.0131F, 1.184F, -8.4665F, 2, 1, 4, 0.099F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.4869F, -23.0904F, -2.5127F);
		handle_and_trigger.addChild(bone4);
		setRotationAngle(bone4, -1.5708F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 132, 60, 0.5954F, -3.6496F, -3.9667F, 1, 4, 10, 0.001F, false));
		bone4.cubeList.add(new ModelBox(bone4, 63, 115, -1.6216F, -3.6496F, -3.9667F, 1, 4, 10, 0.001F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 126, -1.0131F, 0.1655F, -4.1667F, 2, 1, 11, 0.1F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.4869F, -22.9904F, -2.1127F);
		handle_and_trigger.addChild(bone7);
		setRotationAngle(bone7, -1.7017F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 90, 69, 0.5954F, -0.6278F, 2.8333F, 1, 1, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 90, 30, -1.6216F, -0.6278F, 2.8333F, 1, 1, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 63, 32, -1.0131F, 0.1655F, 2.8333F, 2, 1, 4, 0.101F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.9272F, -1.1457F, -18.65F);
		mp7_body.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 84, 70, -0.3334F, -0.3683F, -3.0F, 1, 1, 4, -0.099F, false));
		bone12.cubeList.add(new ModelBox(bone12, 84, 31, -1.5211F, -0.3683F, -3.0F, 1, 1, 4, -0.099F, false));
		bone12.cubeList.add(new ModelBox(bone12, 78, 82, -0.9272F, -0.9043F, -3.0F, 1, 1, 4, -0.098F, false));
		bone12.cubeList.add(new ModelBox(bone12, 55, 82, -0.9272F, 0.1957F, -3.0F, 1, 1, 4, -0.098F, false));

		gun76_r1 = new ModelRenderer(this);
		gun76_r1.setRotationPoint(0.0017F, 0.5307F, 1.0F);
		bone12.addChild(gun76_r1);
		setRotationAngle(gun76_r1, 0.0F, 0.0F, -2.3051F);
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 39, 82, -0.5F, -0.5F, -4.0F, 1, 1, 4, -0.1F, false));

		gun77_r1 = new ModelRenderer(this);
		gun77_r1.setRotationPoint(-0.8561F, 0.5307F, 1.0F);
		bone12.addChild(gun77_r1);
		setRotationAngle(gun77_r1, 0.0F, 0.0F, 2.3051F);
		gun77_r1.cubeList.add(new ModelBox(gun77_r1, 0, 82, -0.5F, -0.5F, -4.0F, 1, 1, 4, -0.1F, false));

		gun76_r2 = new ModelRenderer(this);
		gun76_r2.setRotationPoint(-0.8561F, -0.2394F, 1.0F);
		bone12.addChild(gun76_r2);
		setRotationAngle(gun76_r2, 0.0F, 0.0F, -2.3051F);
		gun76_r2.cubeList.add(new ModelBox(gun76_r2, 27, 88, -0.5F, -0.5F, -4.0F, 1, 1, 4, -0.1F, false));

		gun75_r1 = new ModelRenderer(this);
		gun75_r1.setRotationPoint(0.0017F, -0.2394F, 1.0F);
		bone12.addChild(gun75_r1);
		setRotationAngle(gun75_r1, 0.0F, 0.0F, 2.3051F);
		gun75_r1.cubeList.add(new ModelBox(gun75_r1, 65, 88, -0.5F, -0.5F, -4.0F, 1, 1, 4, -0.1F, false));

		pully = new ModelRenderer(this);
		pully.setRotationPoint(0.7F, -6.25F, 23.3F);
		mp7_body.addChild(pully);
		pully.cubeList.add(new ModelBox(pully, 56, 9, 0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));
		pully.cubeList.add(new ModelBox(pully, 16, 67, 0.1F, 0.3F, -0.7F, 1, 1, 1, -0.2F, false));
		pully.cubeList.add(new ModelBox(pully, 39, 55, 0.25F, 0.0F, -1.0F, 1, 2, 1, -0.001F, false));
		pully.cubeList.add(new ModelBox(pully, 49, 0, -1.4F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));
		pully.cubeList.add(new ModelBox(pully, 66, 19, -1.5F, 0.3F, -0.7F, 1, 1, 1, -0.2F, false));
		pully.cubeList.add(new ModelBox(pully, 33, 51, -1.65F, 0.0F, -1.0F, 1, 2, 1, -0.001F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.65F, 0.0F, 0.0F);
		pully.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -0.2618F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 49, 25, -1.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(1.25F, 0.0F, 0.0F);
		pully.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.2618F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 56, 0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		mag_40.render(f5);
//		mag_20.render(f5);
//		action.render(f5);
		stock.render(f5);
//		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
