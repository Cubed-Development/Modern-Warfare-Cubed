package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KobraMount extends ModelBase {
	private final ModelRenderer kobra;
	private final ModelRenderer gun49;
	private final ModelRenderer gun48;
	private final ModelRenderer gun46;
	private final ModelRenderer gun45;
	private final ModelRenderer gun47;
	private final ModelRenderer gun44;
	private final ModelRenderer gun43;
	private final ModelRenderer gun41;
	private final ModelRenderer gun42;
	private final ModelRenderer gun40;
	private final ModelRenderer gun39;
	private final ModelRenderer gun38;
	private final ModelRenderer gun31;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun37_r1;
	private final ModelRenderer gun35_r1;
	private final ModelRenderer gun37_r2;
	private final ModelRenderer gun38_r1;
	private final ModelRenderer gun34_r1;
	private final ModelRenderer gun33_r1;
	private final ModelRenderer gun32_r1;
	private final ModelRenderer gun30;
	private final ModelRenderer gun29;
	private final ModelRenderer gun28;
	private final ModelRenderer gun27;
	private final ModelRenderer gun26;
	private final ModelRenderer gun25;
	private final ModelRenderer gun24;
	private final ModelRenderer gun23;
	private final ModelRenderer gun22;
	private final ModelRenderer gun21;
	private final ModelRenderer gun20;
	private final ModelRenderer gun19;
	private final ModelRenderer gun18;
	private final ModelRenderer gun17;
	private final ModelRenderer gun16;
	private final ModelRenderer gun15;
	private final ModelRenderer gun14;
	private final ModelRenderer gun13;
	private final ModelRenderer gun12;
	private final ModelRenderer gun11;
	private final ModelRenderer gun10;
	private final ModelRenderer gun9;
	private final ModelRenderer gun8;
	private final ModelRenderer gun7;
	private final ModelRenderer gun6;
	private final ModelRenderer gun5;
	private final ModelRenderer gun4;
	private final ModelRenderer gun3;
	private final ModelRenderer gun1;
	private final ModelRenderer mount;
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
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r26;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r27;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;

	public KobraMount() {
		textureWidth = 115;
		textureHeight = 115;

		kobra = new ModelRenderer(this);
		kobra.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun49 = new ModelRenderer(this);
		gun49.setRotationPoint(-3.0F, -28.8F, -12.0F);
		kobra.addChild(gun49);
		gun49.cubeList.add(new ModelBox(gun49, 22, 21, 0.0F, 0.0F, 0.0F, 3, 1, 3, -0.001F, false));

		gun48 = new ModelRenderer(this);
		gun48.setRotationPoint(-4.5F, -30.0F, -12.0F);
		kobra.addChild(gun48);
		setRotationAngle(gun48, 0.0F, 0.0F, -0.4833F);
		gun48.cubeList.add(new ModelBox(gun48, 23, 38, 0.0F, 0.0F, 0.0F, 1, 3, 3, -0.002F, false));

		gun46 = new ModelRenderer(this);
		gun46.setRotationPoint(0.5F, -29.4F, -12.0F);
		kobra.addChild(gun46);
		setRotationAngle(gun46, 0.0F, 0.0F, 1.041F);
		gun46.cubeList.add(new ModelBox(gun46, 35, 41, 0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

		gun45 = new ModelRenderer(this);
		gun45.setRotationPoint(-3.5F, -29.4F, -12.0F);
		kobra.addChild(gun45);
		setRotationAngle(gun45, 0.0F, 0.0F, -1.041F);
		gun45.cubeList.add(new ModelBox(gun45, 18, 41, -1.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

		gun47 = new ModelRenderer(this);
		gun47.setRotationPoint(0.5F, -30.3F, -12.0F);
		kobra.addChild(gun47);
		setRotationAngle(gun47, 0.0F, 0.0F, 0.3346F);
		gun47.cubeList.add(new ModelBox(gun47, 40, 38, 0.0F, 0.0F, 0.0F, 1, 3, 3, -0.002F, false));

		gun44 = new ModelRenderer(this);
		gun44.setRotationPoint(-4.2F, -32.7F, -12.0F);
		kobra.addChild(gun44);
		setRotationAngle(gun44, 0.0F, 0.0F, -0.8179F);
		gun44.cubeList.add(new ModelBox(gun44, 8, 51, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(1.2F, -32.7F, -12.0F);
		kobra.addChild(gun43);
		setRotationAngle(gun43, 0.0F, 0.0F, 2.4166F);
		gun43.cubeList.add(new ModelBox(gun43, 18, 51, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(1.5F, -31.8F, -12.0F);
		kobra.addChild(gun41);
		setRotationAngle(gun41, 0.0F, 0.0F, 2.7884F);
		gun41.cubeList.add(new ModelBox(gun41, 41, 51, 0.0F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));

		gun42 = new ModelRenderer(this);
		gun42.setRotationPoint(-4.5F, -31.8F, -12.0F);
		kobra.addChild(gun42);
		setRotationAngle(gun42, 0.0F, 0.0F, -1.2269F);
		gun42.cubeList.add(new ModelBox(gun42, 33, 51, 0.0F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));

		gun40 = new ModelRenderer(this);
		gun40.setRotationPoint(-3.0F, -33.8F, -12.0F);
		kobra.addChild(gun40);
		setRotationAngle(gun40, 0.0F, 0.0F, 0.9295F);
		gun40.cubeList.add(new ModelBox(gun40, 52, 9, 0.0F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));

		gun39 = new ModelRenderer(this);
		gun39.setRotationPoint(0.0F, -33.8F, -12.0F);
		kobra.addChild(gun39);
		setRotationAngle(gun39, 0.0F, 0.0F, 0.6692F);
		gun39.cubeList.add(new ModelBox(gun39, 23, 52, 0.0F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(-3.0F, -33.8F, -12.0F);
		kobra.addChild(gun38);
		gun38.cubeList.add(new ModelBox(gun38, 22, 25, 0.0F, 0.0F, 0.0F, 3, 1, 3, 0.001F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(0.5F, -31.8F, -12.0F);
		kobra.addChild(gun31);
		gun31.cubeList.add(new ModelBox(gun31, 18, 34, 0.0F, 0.0F, 0.0F, 1, 4, 3, 0.001F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
		gun31.addChild(gun39_r1);
		setRotationAngle(gun39_r1, 0.0F, 0.0F, 1.405F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 47, 11, 2.3F, 0.0F, 2.05F, 1, 1, 3, -0.301F, false));
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 44, 29, 2.3F, 0.3F, 2.05F, 1, 1, 3, -0.3F, false));
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 44, 24, 2.3F, -0.3F, 2.05F, 1, 1, 3, -0.299F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
		gun31.addChild(gun37_r1);
		setRotationAngle(gun37_r1, 0.0F, 0.2967F, 1.405F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 53, 13, 0.8F, 0.3F, 3.6F, 1, 1, 2, -0.3F, false));
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 38, 51, 0.8F, 0.0F, 3.6F, 1, 1, 2, -0.301F, false));
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 5, 51, 0.8F, -0.3F, 3.6F, 1, 1, 2, -0.3F, false));

		gun35_r1 = new ModelRenderer(this);
		gun35_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
		gun31.addChild(gun35_r1);
		setRotationAngle(gun35_r1, 0.0F, 1.0996F, 1.405F);
		gun35_r1.cubeList.add(new ModelBox(gun35_r1, 41, 44, -2.3F, 0.0F, 1.9F, 1, 1, 2, -0.001F, false));

		gun37_r2 = new ModelRenderer(this);
		gun37_r2.setRotationPoint(-5.0F, 0.0F, 0.0F);
		gun31.addChild(gun37_r2);
		setRotationAngle(gun37_r2, 0.0F, -0.2967F, -1.405F);
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 53, 45, -1.8F, 0.0F, 3.6F, 1, 1, 2, -0.301F, false));
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 54, 0, -1.8F, 0.3F, 3.6F, 1, 1, 2, -0.3F, false));
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 54, 5, -1.8F, -0.3F, 3.6F, 1, 1, 2, -0.3F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(-5.0F, 0.0F, 0.0F);
		gun31.addChild(gun38_r1);
		setRotationAngle(gun38_r1, 0.0F, 0.0F, -1.405F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 49, 1, -3.3F, 0.0F, 2.05F, 1, 1, 3, -0.301F, false));
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 49, 5, -3.3F, 0.3F, 2.05F, 1, 1, 3, -0.3F, false));
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 0, 51, -3.3F, -0.3F, 2.05F, 1, 1, 3, -0.299F, false));

		gun34_r1 = new ModelRenderer(this);
		gun34_r1.setRotationPoint(-5.0F, 0.0F, 0.0F);
		gun31.addChild(gun34_r1);
		setRotationAngle(gun34_r1, 0.0F, -1.0996F, -1.405F);
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 0, 55, 1.3F, 0.0F, 1.9F, 1, 1, 2, -0.001F, false));

		gun33_r1 = new ModelRenderer(this);
		gun33_r1.setRotationPoint(-5.0F, 0.0F, 0.0F);
		gun31.addChild(gun33_r1);
		setRotationAngle(gun33_r1, 0.0F, 0.0F, -1.405F);
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 0, 7, -3.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

		gun32_r1 = new ModelRenderer(this);
		gun32_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
		gun31.addChild(gun32_r1);
		setRotationAngle(gun32_r1, 0.0F, 0.0F, 1.405F);
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 22, 17, 0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(-4.5F, -31.8F, -12.0F);
		kobra.addChild(gun30);
		gun30.cubeList.add(new ModelBox(gun30, 35, 34, 0.0F, 0.0F, 0.0F, 1, 4, 3, 0.001F, false));

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(-0.5F, -27.5F, 7.0F);
		kobra.addChild(gun29);
		setRotationAngle(gun29, -2.5653F, 0.0F, 0.0F);
		gun29.cubeList.add(new ModelBox(gun29, 0, 33, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(-1.2F, -27.5F, 7.0F);
		kobra.addChild(gun28);
		setRotationAngle(gun28, -2.5653F, 0.0F, 0.0F);
		gun28.cubeList.add(new ModelBox(gun28, 6, 33, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.001F, false));

		gun27 = new ModelRenderer(this);
		gun27.setRotationPoint(-3.5F, -27.5F, 7.0F);
		kobra.addChild(gun27);
		setRotationAngle(gun27, -2.5653F, 0.0F, 0.0F);
		gun27.cubeList.add(new ModelBox(gun27, 36, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-2.8F, -27.5F, 7.0F);
		kobra.addChild(gun26);
		setRotationAngle(gun26, -2.5653F, 0.0F, 0.0F);
		gun26.cubeList.add(new ModelBox(gun26, 5, 38, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.001F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(-0.5F, -27.5F, 6.0F);
		kobra.addChild(gun25);
		gun25.cubeList.add(new ModelBox(gun25, 45, 38, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-1.2F, -27.5F, 6.0F);
		kobra.addChild(gun24);
		gun24.cubeList.add(new ModelBox(gun24, 12, 46, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.002F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-2.8F, -27.5F, 6.0F);
		kobra.addChild(gun23);
		gun23.cubeList.add(new ModelBox(gun23, 49, 23, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.002F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-3.5F, -27.5F, 6.0F);
		kobra.addChild(gun22);
		gun22.cubeList.add(new ModelBox(gun22, 46, 51, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(0.0F, -28.8F, -12.0F);
		kobra.addChild(gun21);
		setRotationAngle(gun21, 0.0F, 0.0F, 1.0782F);
		gun21.cubeList.add(new ModelBox(gun21, 80, 0, 0.0F, 0.0F, 0.0F, 1, 1, 12, -0.002F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-3.0F, -28.8F, -12.0F);
		kobra.addChild(gun20);
		setRotationAngle(gun20, 0.0F, 0.0F, 0.4461F);
		gun20.cubeList.add(new ModelBox(gun20, 0, 85, 0.0F, 0.0F, 0.0F, 1, 1, 12, -0.002F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-3.0F, -28.5F, -12.0F);
		kobra.addChild(gun19);
		gun19.cubeList.add(new ModelBox(gun19, 70, 35, 0.0F, 0.0F, 0.0F, 3, 1, 12, -0.002F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(0.0F, -28.8F, -12.0F);
		kobra.addChild(gun18);
		gun18.cubeList.add(new ModelBox(gun18, 68, 69, 0.0F, 0.0F, 0.0F, 2, 1, 15, -0.001F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-4.5F, -29.2F, 0.0F);
		kobra.addChild(gun17);
		setRotationAngle(gun17, -0.5949F, 0.0F, 0.0F);
		gun17.cubeList.add(new ModelBox(gun17, 0, 16, 0.0F, 0.0F, 0.0F, 6, 2, 1, -0.002F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-4.0F, -29.5F, 0.0F);
		kobra.addChild(gun16);
		setRotationAngle(gun16, -0.5949F, 0.0F, 0.0F);
		gun16.cubeList.add(new ModelBox(gun16, 27, 9, 0.0F, 0.0F, 0.0F, 5, 2, 1, -0.001F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-5.0F, -26.3F, 2.0F);
		kobra.addChild(gun15);
		gun15.cubeList.add(new ModelBox(gun15, 6, 55, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-5.0F, -28.7F, 2.0F);
		kobra.addChild(gun14);
		gun14.cubeList.add(new ModelBox(gun14, 18, 55, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-5.0F, -28.0F, 3.7F);
		kobra.addChild(gun13);
		gun13.cubeList.add(new ModelBox(gun13, 12, 55, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-5.0F, -28.0F, 1.3F);
		kobra.addChild(gun12);
		gun12.cubeList.add(new ModelBox(gun12, 45, 55, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-5.0F, -28.5F, 1.5F);
		kobra.addChild(gun11);
		gun11.cubeList.add(new ModelBox(gun11, 5, 41, 0.0F, 0.0F, 0.0F, 1, 3, 3, 0.001F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(0.2F, -30.0F, 1.5F);
		kobra.addChild(gun10);
		gun10.cubeList.add(new ModelBox(gun10, 33, 55, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-2.2F, -30.0F, 1.5F);
		kobra.addChild(gun9);
		gun9.cubeList.add(new ModelBox(gun9, 39, 55, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-1.5F, -30.0F, 3.2F);
		kobra.addChild(gun8);
		gun8.cubeList.add(new ModelBox(gun8, 0, 11, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-1.5F, -30.0F, 0.8F);
		kobra.addChild(gun7);
		gun7.cubeList.add(new ModelBox(gun7, 6, 11, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-2.0F, -30.0F, 1.0F);
		kobra.addChild(gun6);
		gun6.cubeList.add(new ModelBox(gun6, 27, 0, 0.0F, 0.0F, 0.0F, 3, 1, 3, 0.001F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-4.5F, -29.2F, 0.0F);
		kobra.addChild(gun5);
		gun5.cubeList.add(new ModelBox(gun5, 85, 17, 0.0F, 0.0F, 0.0F, 6, 2, 6, -0.001F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-4.0F, -29.5F, 0.0F);
		kobra.addChild(gun4);
		gun4.cubeList.add(new ModelBox(gun4, 48, 85, 0.0F, 0.0F, 0.0F, 5, 2, 6, -0.002F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-4.0F, -28.8F, -12.0F);
		kobra.addChild(gun3);
		gun3.cubeList.add(new ModelBox(gun3, 18, 34, -1.0F, 0.0F, 0.0F, 2, 1, 13, -0.001F, false));

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-4.5F, -28.0F, -12.0F);
		kobra.addChild(gun1);
		gun1.cubeList.add(new ModelBox(gun1, 0, 0, -0.5F, 0.0F, -0.002F, 7, 3, 13, 0.0F, false));
		gun1.cubeList.add(new ModelBox(gun1, 26, 85, 0.0F, 0.0F, 12.998F, 6, 3, 5, 0.0F, false));

		mount = new ModelRenderer(this);
		mount.setRotationPoint(3.5F, -2.55F, -13.0F);
		mount.cubeList.add(new ModelBox(mount, 22, 17, -2.3F, -0.4F, 0.0F, 3, 1, 16, 0.0F, false));
		mount.cubeList.add(new ModelBox(mount, 52, 69, -0.3F, 8.3F, 0.5F, 1, 2, 13, 0.0F, false));
		mount.cubeList.add(new ModelBox(mount, 74, 88, -3.1F, 8.3F, 0.5F, 3, 2, 13, -0.2F, false));
		mount.cubeList.add(new ModelBox(mount, 0, 0, 0.65F, 8.2F, 4.3F, 1, 3, 4, 0.0F, false));
		mount.cubeList.add(new ModelBox(mount, 71, 17, -0.4F, 12.4F, 1.1F, 1, 1, 12, -0.201F, false));
		mount.cubeList.add(new ModelBox(mount, 85, 48, -0.2F, 13.8F, 1.1F, 2, 1, 7, -0.201F, false));
		mount.cubeList.add(new ModelBox(mount, 0, 33, 0.9F, 13.9F, -0.8F, 1, 1, 4, -0.201F, false));
		mount.cubeList.add(new ModelBox(mount, 8, 29, 0.9F, 14.5F, -0.8F, 1, 1, 2, -0.201F, false));
		mount.cubeList.add(new ModelBox(mount, 2, 29, 0.9F, 14.1F, 0.1F, 1, 1, 2, -0.203F, false));
		mount.cubeList.add(new ModelBox(mount, 4, 19, -0.302F, 0.3F, 0.5F, 1, 8, 2, 0.0F, false));
		mount.cubeList.add(new ModelBox(mount, 0, 19, 0.4F, 0.1F, 0.2F, 1, 11, 1, -0.3F, false));
		mount.cubeList.add(new ModelBox(mount, 10, 33, 0.4F, 0.1F, 1.8F, 1, 10, 1, -0.3F, false));
		mount.cubeList.add(new ModelBox(mount, 14, 85, 0.4F, 8.1F, 2.2F, 1, 1, 10, -0.301F, false));
		mount.cubeList.add(new ModelBox(mount, 44, 18, 0.4F, 9.6F, 2.2F, 1, 1, 10, -0.301F, false));
		mount.cubeList.add(new ModelBox(mount, 34, 17, 0.4F, 0.1F, 12.8F, 1, 9, 1, -0.3F, false));
		mount.cubeList.add(new ModelBox(mount, 12, 29, 0.4F, 7.35F, 12.8F, 1, 1, 1, -0.302F, false));
		mount.cubeList.add(new ModelBox(mount, 53, 35, 0.4F, 9.0F, 13.5F, 1, 4, 1, -0.3F, false));
		mount.cubeList.add(new ModelBox(mount, 53, 40, 0.4F, 6.1F, 11.2F, 1, 4, 1, -0.3F, false));
		mount.cubeList.add(new ModelBox(mount, 24, 56, 0.4F, 0.1F, 3.55F, 1, 1, 1, -0.3F, false));
		mount.cubeList.add(new ModelBox(mount, 56, 22, 0.4F, 0.5F, 3.55F, 1, 1, 1, -0.3F, false));
		mount.cubeList.add(new ModelBox(mount, 4, 55, 0.4F, 0.1F, 6.95F, 1, 1, 1, -0.3F, false));
		mount.cubeList.add(new ModelBox(mount, 37, 55, 0.4F, 0.5F, 6.95F, 1, 1, 1, -0.3F, false));
		mount.cubeList.add(new ModelBox(mount, 24, 44, -1.3F, 3.3F, 0.5F, 1, 1, 2, 0.0F, false));
		mount.cubeList.add(new ModelBox(mount, 32, 27, -0.8F, 5.3F, 0.5F, 1, 3, 2, -0.001F, false));
		mount.cubeList.add(new ModelBox(mount, 10, 19, -0.302F, 0.3F, 11.5F, 1, 8, 2, 0.0F, false));
		mount.cubeList.add(new ModelBox(mount, 44, 8, -0.3F, 9.3F, 12.2F, 1, 4, 2, -0.001F, false));
		mount.cubeList.add(new ModelBox(mount, 52, 29, -0.3F, 1.3F, 9.5F, 1, 2, 2, 0.0F, false));
		mount.cubeList.add(new ModelBox(mount, 9, 6, -0.3F, 4.1F, 10.5F, 1, 2, 1, 0.0F, false));
		mount.cubeList.add(new ModelBox(mount, 0, 16, -2.3F, 0.3F, 0.0F, 3, 1, 16, -0.001F, false));
		mount.cubeList.add(new ModelBox(mount, 34, 34, -1.55F, 1.3F, 0.7F, 2, 2, 15, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.25F, 1.3F, 0.7F);
		mount.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.5061F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 70, 52, 0.0F, 0.0F, 0.0F, 1, 1, 13, -0.002F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.55F, 3.3F, 0.7F);
		mount.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.2269F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 68, 0.0F, -2.0F, 0.0F, 1, 2, 13, -0.001F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.7F, 9.3F, 14.2F);
		mount.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.0996F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 34, -1.0F, 0.0F, -2.0F, 1, 1, 2, -0.003F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.7F, 13.3F, 12.2F);
		mount.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2967F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 18, -0.3F, -3.7F, -0.3F, 1, 4, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 52, -1.0F, -4.0F, 0.0F, 1, 4, 1, -0.002F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.3F, 4.3F, 0.5F);
		mount.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.2269F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 44, 18, 0.0F, 0.0F, 0.0F, 1, 4, 2, -0.002F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.1F, 0.4F, 0.5F);
		mount.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.5236F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 39, -0.7F, -0.7F, -0.3F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 29, -0.7F, -1.1F, -0.3F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 20, -0.7F, -1.1F, 6.45F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 18, -0.7F, -0.7F, 6.45F, 1, 1, 1, -0.301F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 26, -0.7F, -1.1F, 3.05F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 24, -0.7F, -0.7F, 3.05F, 1, 1, 1, -0.301F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 52, -0.7F, -1.1F, 12.3F, 1, 1, 1, -0.3F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 54, -0.7F, -0.7F, 12.3F, 1, 1, 1, -0.3F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.1F, 1.2F, 7.25F);
		mount.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.8378F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 4, -0.7F, -0.3F, -0.3F, 1, 2, 1, -0.301F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 29, -0.7F, -0.3F, -3.7F, 1, 2, 1, -0.301F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.1F, 6.4F, 11.5F);
		mount.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.5236F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 45, 44, -0.7F, -1.1F, -0.3F, 1, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 14, -0.7F, -0.7F, -0.3F, 1, 1, 1, -0.3F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.1F, 9.3F, 14.2F);
		mount.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.0996F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 27, 34, -0.7F, -0.3F, -1.9F, 1, 1, 1, -0.301F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 29, -0.7F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.1F, 15.3F, -0.6F);
		mount.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.3316F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 27, 4, -0.2F, -0.2F, -0.2F, 1, 1, 4, -0.202F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.4F, 13.2F, 1.3F);
		mount.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.8378F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 4, -0.8F, -0.8F, -2.8F, 1, 1, 3, -0.202F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.4F, 11.25F, -0.45F);
		mount.addChild(cube_r12);
		setRotationAngle(cube_r12, -1.7628F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 44, -0.8F, -0.8F, -2.8F, 1, 1, 3, -0.201F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.55F, 10.4F, 5.8F);
		mount.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -0.3491F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -1.5F, 0.0F, 0.5F, 1, 2, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 44, 0, -2.0F, 2.0F, 0.0F, 2, 2, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(1.1F, 13.5F, 12.1F);
		mount.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.2269F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 6, 0, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.001F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(1.1F, 10.1F, 11.3F);
		mount.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.2269F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 33, 4, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.001F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(1.1F, 9.9F, 0.0F);
		mount.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.2269F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 34, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.001F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(1.1F, 10.2F, 0.6F);
		mount.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.2269F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 43, 34, -0.999F, -2.0F, 0.0F, 1, 2, 2, 0.001F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.7F, 4.8F, 8.8F);
		mount.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.2269F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 38, -1.0F, -3.0F, 0.0F, 1, 3, 3, 0.001F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(1.2F, 0.8F, 8.8F);
		mount.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.5585F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 7, 47, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.2F, 0.8F, 5.1F);
		mount.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.5585F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 49, 29, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(1.7F, 10.6F, 6.7F);
		mount.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.3491F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 8, 19, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(1.7F, 10.6F, 4.6F);
		mount.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.3491F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 6, 29, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(1.2F, 0.8F, 1.6F);
		mount.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.5585F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 50, 9, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.5F, -2.0F, 0.0F);
		mount.addChild(bone);
		

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 1.1519F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 62, 0, 0.0F, 0.25F, 0.0F, 1, 1, 16, -0.001F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 68, 0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -1.1519F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 34, 68, -1.0F, 0.25F, 0.0F, 1, 1, 16, -0.002F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 24, 0, -2.0F, 0.0F, 0.0F, 2, 1, 16, 0.001F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.5F, 1.2F, 0.0F);
		mount.addChild(bone4);
		

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -1.1519F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 44, 1, 0.0F, -1.25F, 0.0F, 1, 1, 16, -0.002F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.1F, -0.4F, 0.0F);
		mount.addChild(bone2);
		

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 1.1519F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 53, 18, -1.25F, 0.0F, 0.0F, 1, 1, 16, -0.001F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 33, -1.0F, 0.0F, 0.0F, 1, 2, 16, 0.002F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-3.1F, -0.4F, 0.0F);
		mount.addChild(bone3);
		

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -1.1519F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 51, 0.25F, 0.0F, 0.0F, 1, 1, 16, -0.001F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 34, 51, 0.0F, 0.0F, 0.0F, 1, 1, 16, -0.002F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, 1.1519F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 52, 35, 0.25F, -1.0F, 0.0F, 1, 1, 16, -0.001F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 52, 52, 0.0F, -1.0F, 0.0F, 1, 1, 16, 0.003F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		kobra.render(f5);
		mount.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
