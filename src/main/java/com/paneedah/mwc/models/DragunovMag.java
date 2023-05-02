package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DragunovMag extends ModelWithAttachments {
	private final QRenderer mag;
	private final ModelRenderer cube_r101;
	private final ModelRenderer cube_r102;
	private final ModelRenderer cube_r103;
	private final ModelRenderer cube_r104;
	private final ModelRenderer cube_r105;
	private final ModelRenderer cube_r106;
	private final ModelRenderer cube_r107;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer cube_r110;
	private final ModelRenderer cube_r111;
	private final ModelRenderer cube_r112;
	private final ModelRenderer cube_r113;
	private final ModelRenderer cube_r114;
	private final ModelRenderer cube_r115;
	private final ModelRenderer cube_r116;
	private final ModelRenderer cube_r117;
	private final ModelRenderer cube_r118;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final ModelRenderer cube_r123;
	private final ModelRenderer cube_r124;
	private final ModelRenderer cube_r125;
	private final ModelRenderer cube_r126;
	private final ModelRenderer cube_r127;
	private final ModelRenderer cube_r128;
	private final ModelRenderer cube_r129;
	private final ModelRenderer cube_r130;
	private final ModelRenderer cube_r131;
	private final ModelRenderer cube_r132;
	private final ModelRenderer cube_r133;
	private final ModelRenderer cube_r134;
	private final ModelRenderer cube_r135;

	public DragunovMag() {
		textureWidth = 350;
		textureHeight = 350;

		mag = new QRenderer(this);
		mag.setRotationPoint(-1.0F, 0.0F, -36.0F);
		mag.cubeList.add(new ModelBox(mag, 25, 11, -1.8F, -9.5F, 4.5F, 3, 3, 7, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 71, 9, -2.2F, -9.5F, 4.5F, 1, 3, 7, 0.001F, false));

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(-0.5F, -1.2F, 12.8F);
		mag.addChild(cube_r101);
		setRotationAngle(cube_r101, -0.1571F, 0.0F, 0.0F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 112, 111, -1.0F, 0.0F, -12.5F, 2, 8, 1, 0.001F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 71, 28, -1.5F, 0.0F, -8.0F, 3, 4, 5, 0.001F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 69, 101, -1.75F, 6.2F, -7.9F, 1, 1, 7, 0.001F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 69, 93, -1.75F, 4.6F, -7.9F, 1, 1, 7, 0.001F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 0, 102, 0.75F, 6.2F, -7.9F, 1, 1, 7, 0.001F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 21, 102, 0.75F, 4.6F, -7.9F, 1, 1, 7, 0.001F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 25, 0, -1.5F, 4.0F, -8.0F, 3, 4, 7, 0.001F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 46, 57, -1.5F, 0.0F, -2.0F, 3, 4, 1, 0.001F, false));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(-2.0F, -6.5F, 4.5F);
		mag.addChild(cube_r102);
		setRotationAngle(cube_r102, 0.0526F, -0.1046F, -0.0055F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 16, 6, 0.0F, -1.0F, -1.0F, 1, 7, 1, 0.002F, false));
		cube_r102.cubeList.add(new ModelBox(cube_r102, 48, 0, 0.0F, -1.0F, -4.0F, 1, 6, 2, 0.002F, false));

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(-2.0F, -1.5F, 4.75F);
		mag.addChild(cube_r103);
		setRotationAngle(cube_r103, -0.1579F, -0.1034F, 0.0164F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 56, 57, 0.0F, 3.0F, -4.0F, 1, 4, 4, 0.001F, false));
		cube_r103.cubeList.add(new ModelBox(cube_r103, 48, 31, 0.0F, 0.0F, -1.0F, 1, 3, 1, 0.001F, false));
		cube_r103.cubeList.add(new ModelBox(cube_r103, 25, 11, 0.0F, 0.0F, -4.0F, 1, 3, 2, 0.001F, false));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(1.0F, -1.5F, 4.75F);
		mag.addChild(cube_r104);
		setRotationAngle(cube_r104, -0.1579F, 0.1034F, -0.0164F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 36, 24, -1.0F, 3.0F, -4.0F, 1, 4, 4, 0.001F, false));
		cube_r104.cubeList.add(new ModelBox(cube_r104, 56, 57, -1.0F, 0.0F, -1.0F, 1, 3, 1, 0.001F, false));
		cube_r104.cubeList.add(new ModelBox(cube_r104, 0, 47, -1.0F, 0.0F, -4.0F, 1, 3, 2, 0.001F, false));

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(1.0F, -6.5F, 4.5F);
		mag.addChild(cube_r105);
		setRotationAngle(cube_r105, 0.0526F, 0.1046F, 0.0055F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 16, 24, -1.0F, -1.0F, -1.0F, 1, 7, 1, 0.002F, false));
		cube_r105.cubeList.add(new ModelBox(cube_r105, 48, 10, -1.0F, -1.0F, -4.0F, 1, 6, 2, 0.002F, false));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(-0.5F, -1.2F, 12.6F);
		mag.addChild(cube_r106);
		setRotationAngle(cube_r106, -0.1571F, 0.0F, 0.0F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 46, 47, -1.0F, 0.0F, -1.0F, 2, 8, 1, 0.001F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(-0.5F, -7.0F, 1.1F);
		mag.addChild(cube_r107);
		setRotationAngle(cube_r107, -0.0524F, 0.0F, 0.0F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 36, 68, -1.0F, 0.0F, 1.5F, 2, 10, 2, 0.2F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 138, 149, -1.0F, 0.0F, 8.0F, 2, 10, 2, 0.2F, false));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(1.1F, -1.1F, 5.2F);
		mag.addChild(cube_r108);
		setRotationAngle(cube_r108, -0.2094F, 0.0F, 0.0F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 36, 24, -1.0F, 0.0F, 0.0F, 1, 3, 1, 0.002F, false));
		cube_r108.cubeList.add(new ModelBox(cube_r108, 48, 20, -1.0F, -1.0F, 2.7F, 1, 4, 1, 0.002F, false));
		cube_r108.cubeList.add(new ModelBox(cube_r108, 71, 28, -3.2F, -1.0F, 2.7F, 1, 4, 1, 0.002F, false));
		cube_r108.cubeList.add(new ModelBox(cube_r108, 42, 24, -3.2F, 0.0F, 0.0F, 1, 3, 1, 0.002F, false));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(1.1F, -5.0F, 4.4F);
		mag.addChild(cube_r109);
		setRotationAngle(cube_r109, -0.0873F, 0.0F, 0.0F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 30, 93, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.003F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 78, 101, -3.2F, -1.0F, 0.0F, 1, 1, 5, 0.003F, false));

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(1.1F, -1.1F, 5.2F);
		mag.addChild(cube_r110);
		setRotationAngle(cube_r110, 0.0349F, 0.0F, 0.0F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 71, 20, -1.0F, -4.0F, 0.0F, 1, 4, 1, 0.002F, false));
		cube_r110.cubeList.add(new ModelBox(cube_r110, 46, 77, -3.2F, -4.0F, 0.0F, 1, 4, 1, 0.002F, false));

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(1.1F, -0.7F, 4.4F);
		mag.addChild(cube_r111);
		setRotationAngle(cube_r111, 0.0175F, 0.0F, 0.0F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 9, 0, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.003F, false));
		cube_r111.cubeList.add(new ModelBox(cube_r111, 78, 93, -3.2F, -1.0F, 0.0F, 1, 1, 5, 0.003F, false));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(1.1F, -0.9F, 8.1F);
		mag.addChild(cube_r112);
		setRotationAngle(cube_r112, 0.0349F, 0.0F, 0.0F);
		cube_r112.cubeList.add(new ModelBox(cube_r112, 71, 0, -1.0F, -4.0F, 0.0F, 1, 4, 1, 0.002F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 57, 77, -3.2F, -4.0F, 0.0F, 1, 4, 1, 0.002F, false));

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(0.0F, -6.5F, -0.5F);
		mag.addChild(cube_r113);
		setRotationAngle(cube_r113, 0.0524F, 0.0F, 0.0F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 48, 20, -2.0F, 0.0F, 5.0F, 3, 6, 5, 0.002F, false));
		cube_r113.cubeList.add(new ModelBox(cube_r113, 0, 0, -1.5F, 0.0F, 0.5F, 2, 6, 1, 0.0F, false));
		cube_r113.cubeList.add(new ModelBox(cube_r113, 22, 24, -2.0F, 0.0F, 11.0F, 3, 6, 1, 0.002F, false));

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(-2.25F, 4.7F, 3.9F);
		mag.addChild(cube_r114);
		setRotationAngle(cube_r114, -0.1579F, -0.1034F, 0.0164F);
		cube_r114.cubeList.add(new ModelBox(cube_r114, 105, 82, 0.0F, -1.0F, -4.0F, 1, 1, 4, 0.001F, false));
		cube_r114.cubeList.add(new ModelBox(cube_r114, 80, 9, 0.0F, -2.6F, -4.0F, 1, 1, 4, 0.001F, false));

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(1.25F, 4.7F, 3.9F);
		mag.addChild(cube_r115);
		setRotationAngle(cube_r115, -0.1579F, 0.1034F, -0.0164F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 53, 106, -1.0F, -2.6F, -4.0F, 1, 1, 4, 0.001F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 69, 109, -1.0F, -1.0F, -4.0F, 1, 1, 4, 0.001F, false));

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(-2.0F, -6.5F, 4.5F);
		mag.addChild(cube_r116);
		setRotationAngle(cube_r116, 0.0701F, -0.1046F, -0.0055F);
		cube_r116.cubeList.add(new ModelBox(cube_r116, 9, 0, -0.1F, 1.3F, -4.1F, 1, 4, 1, 0.0F, false));

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(-2.0F, -6.5F, 4.5F);
		mag.addChild(cube_r117);
		setRotationAngle(cube_r117, 0.1574F, -0.1046F, -0.0055F);
		cube_r117.cubeList.add(new ModelBox(cube_r117, 37, 51, -0.1F, 0.5F, -4.2F, 1, 1, 2, 0.002F, false));

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(-2.0F, -6.5F, 4.5F);
		mag.addChild(cube_r118);
		setRotationAngle(cube_r118, 0.0003F, -0.1046F, -0.0055F);
		cube_r118.cubeList.add(new ModelBox(cube_r118, 22, 51, -0.1F, 4.8F, -4.2F, 1, 1, 2, 0.002F, false));

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(-2.0F, -6.5F, 4.5F);
		mag.addChild(cube_r119);
		setRotationAngle(cube_r119, -0.176F, -0.1015F, 0.0118F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 0, 24, 0.0F, 5.4F, -2.8F, 1, 3, 1, 0.0F, false));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(1.0F, -6.5F, 4.5F);
		mag.addChild(cube_r120);
		setRotationAngle(cube_r120, -0.176F, 0.1015F, -0.0118F);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 12, 24, -1.0F, 5.4F, -2.8F, 1, 3, 1, 0.0F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(1.0F, -6.5F, 4.5F);
		mag.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.0701F, 0.1046F, 0.0055F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 16, 0, -0.9F, 1.3F, -4.1F, 1, 4, 1, 0.0F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(1.0F, -6.5F, 4.5F);
		mag.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.0003F, 0.1046F, 0.0055F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 59, 39, -0.9F, 4.8F, -4.2F, 1, 1, 2, 0.002F, false));

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(1.0F, -6.5F, 4.5F);
		mag.addChild(cube_r123);
		setRotationAngle(cube_r123, 0.1574F, 0.1046F, 0.0055F);
		cube_r123.cubeList.add(new ModelBox(cube_r123, 71, 13, -0.9F, 0.5F, -4.2F, 1, 1, 2, 0.002F, false));

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(0.5F, -4.1F, 13.0F);
		mag.addChild(cube_r124);
		setRotationAngle(cube_r124, 0.1745F, 0.0F, 0.0F);
		cube_r124.cubeList.add(new ModelBox(cube_r124, 10, 68, -2.0F, -2.0F, -1.0F, 2, 2, 2, -0.2F, false));

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(-0.5F, -6.5F, -0.7F);
		mag.addChild(cube_r125);
		setRotationAngle(cube_r125, 0.0524F, 0.0F, 0.0F);
		cube_r125.cubeList.add(new ModelBox(cube_r125, 57, 47, -1.0F, -2.0F, 12.0F, 2, 8, 1, 0.002F, false));

		cube_r126 = new ModelRenderer(this);
		cube_r126.setRotationPoint(1.1F, -5.5F, 1.5F);
		mag.addChild(cube_r126);
		setRotationAngle(cube_r126, -0.9604F, 0.0386F, 0.0057F);
		cube_r126.cubeList.add(new ModelBox(cube_r126, 16, 39, -1.06F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r127 = new ModelRenderer(this);
		cube_r127.setRotationPoint(1.0F, -5.5F, 1.5F);
		mag.addChild(cube_r127);
		setRotationAngle(cube_r127, 0.0F, 0.0524F, 0.0F);
		cube_r127.cubeList.add(new ModelBox(cube_r127, 58, 5, -1.95F, -1.0F, -2.0F, 2, 1, 2, 0.001F, false));

		cube_r128 = new ModelRenderer(this);
		cube_r128.setRotationPoint(-2.5F, -6.8F, 2.7F);
		mag.addChild(cube_r128);
		setRotationAngle(cube_r128, -0.0349F, -0.0524F, 0.0F);
		cube_r128.cubeList.add(new ModelBox(cube_r128, 12, 87, 0.0F, -1.0F, -3.0F, 2, 1, 3, 0.001F, false));

		cube_r129 = new ModelRenderer(this);
		cube_r129.setRotationPoint(1.5F, -6.8F, 2.7F);
		mag.addChild(cube_r129);
		setRotationAngle(cube_r129, -0.0349F, 0.0524F, 0.0F);
		cube_r129.cubeList.add(new ModelBox(cube_r129, 22, 87, -2.0F, -1.0F, -3.0F, 2, 1, 3, 0.001F, false));

		cube_r130 = new ModelRenderer(this);
		cube_r130.setRotationPoint(1.2F, -8.5F, 4.5F);
		mag.addChild(cube_r130);
		setRotationAngle(cube_r130, 0.0F, 0.0524F, 0.0F);
		cube_r130.cubeList.add(new ModelBox(cube_r130, 113, 28, -2.0F, -1.0F, -5.0F, 2, 3, 5, 0.001F, false));

		cube_r131 = new ModelRenderer(this);
		cube_r131.setRotationPoint(-2.1F, -5.5F, 1.5F);
		mag.addChild(cube_r131);
		setRotationAngle(cube_r131, -0.9604F, -0.0386F, -0.0057F);
		cube_r131.cubeList.add(new ModelBox(cube_r131, 62, 57, 0.06F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r132 = new ModelRenderer(this);
		cube_r132.setRotationPoint(-2.0F, -5.5F, 1.5F);
		mag.addChild(cube_r132);
		setRotationAngle(cube_r132, 0.0F, -0.0524F, 0.0F);
		cube_r132.cubeList.add(new ModelBox(cube_r132, 0, 73, -0.05F, -1.0F, -2.0F, 1, 1, 2, 0.001F, false));

		cube_r133 = new ModelRenderer(this);
		cube_r133.setRotationPoint(-2.2F, -8.5F, 4.5F);
		mag.addChild(cube_r133);
		setRotationAngle(cube_r133, 0.0F, -0.0524F, 0.0F);
		cube_r133.cubeList.add(new ModelBox(cube_r133, 113, 44, 0.0F, -1.0F, -5.0F, 2, 3, 5, 0.002F, false));

		cube_r134 = new ModelRenderer(this);
		cube_r134.setRotationPoint(-2.2F, -9.5F, 4.5F);
		mag.addChild(cube_r134);
		setRotationAngle(cube_r134, 0.0F, 0.0F, 0.4363F);
		cube_r134.cubeList.add(new ModelBox(cube_r134, 91, 54, 0.0F, -1.0F, 0.0F, 1, 1, 7, -0.002F, false));

		cube_r135 = new ModelRenderer(this);
		cube_r135.setRotationPoint(1.2F, -9.5F, 4.5F);
		mag.addChild(cube_r135);
		setRotationAngle(cube_r135, 0.0F, 0.0F, -0.4363F);
		cube_r135.cubeList.add(new ModelBox(cube_r135, 91, 73, -1.0F, -1.0F, 0.0F, 1, 1, 7, -0.002F, false));
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
