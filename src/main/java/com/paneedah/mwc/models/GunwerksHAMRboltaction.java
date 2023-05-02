package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class GunwerksHAMRboltaction extends ModelBase {
	private final QRenderer boltaction;
	private final ModelRenderer BoltAction45;
	private final ModelRenderer BoltAction44;
	private final ModelRenderer BoltAction43;
	private final ModelRenderer BoltAction42;
	private final ModelRenderer BoltAction41;
	private final ModelRenderer BoltAction40;
	private final ModelRenderer BoltAction30;
	private final ModelRenderer BoltAction29;
	private final ModelRenderer BoltAction28;
	private final ModelRenderer BoltAction27;
	private final ModelRenderer BoltAction26;
	private final ModelRenderer BoltAction24;
	private final ModelRenderer BoltAction23;
	private final ModelRenderer BoltAction22;
	private final ModelRenderer BoltAction21;
	private final ModelRenderer BoltAction20;
	private final ModelRenderer BoltAction19;
	private final ModelRenderer BoltAction18;
	private final ModelRenderer BoltAction17;
	private final ModelRenderer BoltAction16;
	private final ModelRenderer BoltAction15;
	private final ModelRenderer BoltAction14;
	private final ModelRenderer BoltAction13;
	private final ModelRenderer BoltAction12;
	private final ModelRenderer BoltAction11;
	private final ModelRenderer BoltAction10;
	private final ModelRenderer BoltAction9;
	private final ModelRenderer BoltAction8;
	private final ModelRenderer BoltAction7;
	private final ModelRenderer BoltAction6;
	private final ModelRenderer BoltAction5;
	private final ModelRenderer BoltAction4;
	private final ModelRenderer BoltAction3;
	private final ModelRenderer BoltAction2;
	private final ModelRenderer BoltAction1;
	private final QRenderer boltprime;
	private final ModelRenderer BoltAction39;
	private final ModelRenderer BoltAction35;
	private final ModelRenderer BoltAction37;
	private final ModelRenderer BoltAction36;
	private final ModelRenderer BoltAction34;
	private final ModelRenderer BoltAction38;

	public GunwerksHAMRboltaction() {
		textureWidth = 320;
		textureHeight = 320;

		boltaction = new QRenderer(this);
		boltaction.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		BoltAction45 = new ModelRenderer(this);
		BoltAction45.setRotationPoint(1.5F, -45.0F, 9.3F);
		boltaction.addChild(BoltAction45);
		setRotationAngle(BoltAction45, 0.0F, 0.0F, 0.7854F);
		BoltAction45.cubeList.add(new ModelBox(BoltAction45, 91, 102, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		BoltAction44 = new ModelRenderer(this);
		BoltAction44.setRotationPoint(3.2F, -43.0F, 8.0F);
		boltaction.addChild(BoltAction44);
		setRotationAngle(BoltAction44, 0.0F, 0.0F, 2.3562F);
		BoltAction44.cubeList.add(new ModelBox(BoltAction44, 20, 111, 0.0F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));

		BoltAction43 = new ModelRenderer(this);
		BoltAction43.setRotationPoint(3.2F, -44.0F, 8.0F);
		boltaction.addChild(BoltAction43);
		setRotationAngle(BoltAction43, 0.0F, 0.0F, 2.3562F);
		BoltAction43.cubeList.add(new ModelBox(BoltAction43, 111, 29, 0.001F, 0.0F, 0.001F, 1, 1, 2, 0.0F, false));

		BoltAction42 = new ModelRenderer(this);
		BoltAction42.setRotationPoint(-0.2F, -43.0F, 8.0F);
		boltaction.addChild(BoltAction42);
		setRotationAngle(BoltAction42, 0.0F, 0.0F, -0.7854F);
		BoltAction42.cubeList.add(new ModelBox(BoltAction42, 111, 71, 0.001F, 0.0F, 0.001F, 1, 1, 2, 0.0F, false));

		BoltAction41 = new ModelRenderer(this);
		BoltAction41.setRotationPoint(-0.2F, -44.0F, 8.0F);
		boltaction.addChild(BoltAction41);
		setRotationAngle(BoltAction41, 0.0F, 0.0F, -0.7854F);
		BoltAction41.cubeList.add(new ModelBox(BoltAction41, 112, 0, 0.0F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));

		BoltAction40 = new ModelRenderer(this);
		BoltAction40.setRotationPoint(2.0F, -41.8F, 8.0F);
		boltaction.addChild(BoltAction40);
		setRotationAngle(BoltAction40, 0.0F, 0.0F, -2.3562F);
		BoltAction40.cubeList.add(new ModelBox(BoltAction40, 112, 84, 0.0F, 0.0F, -0.001F, 1, 1, 2, 0.0F, false));

		BoltAction30 = new ModelRenderer(this);
		BoltAction30.setRotationPoint(3.5F, -43.0F, -17.0F);
		boltaction.addChild(BoltAction30);
		setRotationAngle(BoltAction30, 0.0F, 0.0F, 2.3562F);
		BoltAction30.cubeList.add(new ModelBox(BoltAction30, 212, 174, 0.0F, -0.001F, -0.001F, 1, 1, 24, 0.0F, false));

		BoltAction29 = new ModelRenderer(this);
		BoltAction29.setRotationPoint(3.5F, -44.0F, -17.0F);
		boltaction.addChild(BoltAction29);
		setRotationAngle(BoltAction29, 0.0F, 0.0F, 2.3562F);
		BoltAction29.cubeList.add(new ModelBox(BoltAction29, 212, 237, 0.001F, 0.0F, -0.002F, 1, 1, 24, 0.0F, false));

		BoltAction28 = new ModelRenderer(this);
		BoltAction28.setRotationPoint(-0.5F, -43.0F, -17.0F);
		boltaction.addChild(BoltAction28);
		setRotationAngle(BoltAction28, 0.0F, 0.0F, -0.7854F);
		BoltAction28.cubeList.add(new ModelBox(BoltAction28, 238, 175, 0.001F, 0.0F, -0.001F, 1, 1, 24, 0.0F, false));

		BoltAction27 = new ModelRenderer(this);
		BoltAction27.setRotationPoint(-0.5F, -44.0F, -17.0F);
		boltaction.addChild(BoltAction27);
		setRotationAngle(BoltAction27, 0.0F, 0.0F, -0.7854F);
		BoltAction27.cubeList.add(new ModelBox(BoltAction27, 238, 238, 0.0F, -0.001F, -0.002F, 1, 1, 24, 0.0F, false));

		BoltAction26 = new ModelRenderer(this);
		BoltAction26.setRotationPoint(1.0F, -45.2F, 8.0F);
		boltaction.addChild(BoltAction26);
		setRotationAngle(BoltAction26, 0.0F, 0.0F, 0.7854F);
		BoltAction26.cubeList.add(new ModelBox(BoltAction26, 0, 113, 0.0F, 0.0F, -0.001F, 1, 1, 2, 0.0F, false));

		BoltAction24 = new ModelRenderer(this);
		BoltAction24.setRotationPoint(2.0F, -45.2F, 8.0F);
		boltaction.addChild(BoltAction24);
		setRotationAngle(BoltAction24, 0.0F, 0.0F, 0.7854F);
		BoltAction24.cubeList.add(new ModelBox(BoltAction24, 113, 40, 0.0F, 0.0F, -0.001F, 1, 1, 2, 0.0F, false));

		BoltAction23 = new ModelRenderer(this);
		BoltAction23.setRotationPoint(1.0F, -41.8F, 8.0F);
		boltaction.addChild(BoltAction23);
		setRotationAngle(BoltAction23, 0.0F, 0.0F, -2.3562F);
		BoltAction23.cubeList.add(new ModelBox(BoltAction23, 72, 113, 0.0F, 0.0F, -0.001F, 1, 1, 2, 0.0F, false));

		BoltAction22 = new ModelRenderer(this);
		BoltAction22.setRotationPoint(2.2F, -44.0F, 8.0F);
		boltaction.addChild(BoltAction22);
		BoltAction22.cubeList.add(new ModelBox(BoltAction22, 4, 114, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		BoltAction21 = new ModelRenderer(this);
		BoltAction21.setRotationPoint(1.0F, -42.8F, 8.0F);
		boltaction.addChild(BoltAction21);
		BoltAction21.cubeList.add(new ModelBox(BoltAction21, 114, 11, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		BoltAction20 = new ModelRenderer(this);
		BoltAction20.setRotationPoint(-0.2F, -44.0F, 8.0F);
		boltaction.addChild(BoltAction20);
		BoltAction20.cubeList.add(new ModelBox(BoltAction20, 19, 114, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		BoltAction19 = new ModelRenderer(this);
		BoltAction19.setRotationPoint(1.0F, -45.2F, 8.0F);
		boltaction.addChild(BoltAction19);
		BoltAction19.cubeList.add(new ModelBox(BoltAction19, 114, 74, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		BoltAction18 = new ModelRenderer(this);
		BoltAction18.setRotationPoint(3.7F, -43.0F, 7.0F);
		boltaction.addChild(BoltAction18);
		setRotationAngle(BoltAction18, 0.0F, 0.0F, 2.3562F);
		BoltAction18.cubeList.add(new ModelBox(BoltAction18, 48, 50, 0.0F, 0.0F, 0.001F, 2, 1, 1, 0.0F, false));

		BoltAction17 = new ModelRenderer(this);
		BoltAction17.setRotationPoint(3.7F, -44.0F, 7.0F);
		boltaction.addChild(BoltAction17);
		setRotationAngle(BoltAction17, 0.0F, 0.0F, 2.3562F);
		BoltAction17.cubeList.add(new ModelBox(BoltAction17, 117, 49, 0.001F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		BoltAction16 = new ModelRenderer(this);
		BoltAction16.setRotationPoint(-0.7F, -43.0F, 7.0F);
		boltaction.addChild(BoltAction16);
		setRotationAngle(BoltAction16, 0.0F, 0.0F, -0.7854F);
		BoltAction16.cubeList.add(new ModelBox(BoltAction16, 27, 50, 0.001F, 0.0F, 0.001F, 1, 2, 1, 0.0F, false));

		BoltAction15 = new ModelRenderer(this);
		BoltAction15.setRotationPoint(-0.7F, -44.0F, 7.0F);
		boltaction.addChild(BoltAction15);
		setRotationAngle(BoltAction15, 0.0F, 0.0F, -0.7854F);
		BoltAction15.cubeList.add(new ModelBox(BoltAction15, 50, 117, 0.0F, -0.001F, 0.001F, 1, 1, 1, 0.0F, false));

		BoltAction14 = new ModelRenderer(this);
		BoltAction14.setRotationPoint(1.0F, -41.3F, 7.0F);
		boltaction.addChild(BoltAction14);
		setRotationAngle(BoltAction14, 0.0F, 0.0F, -2.3562F);
		BoltAction14.cubeList.add(new ModelBox(BoltAction14, 117, 51, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		BoltAction13 = new ModelRenderer(this);
		BoltAction13.setRotationPoint(2.0F, -41.3F, 7.0F);
		boltaction.addChild(BoltAction13);
		setRotationAngle(BoltAction13, 0.0F, 0.0F, -2.3562F);
		BoltAction13.cubeList.add(new ModelBox(BoltAction13, 117, 60, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		BoltAction12 = new ModelRenderer(this);
		BoltAction12.setRotationPoint(2.0F, -45.7F, 7.0F);
		boltaction.addChild(BoltAction12);
		setRotationAngle(BoltAction12, 0.0F, 0.0F, 0.7854F);
		BoltAction12.cubeList.add(new ModelBox(BoltAction12, 58, 0, 0.0F, 0.0F, 0.001F, 2, 1, 1, 0.0F, false));

		BoltAction11 = new ModelRenderer(this);
		BoltAction11.setRotationPoint(1.0F, -45.7F, 7.0F);
		boltaction.addChild(BoltAction11);
		setRotationAngle(BoltAction11, 0.0F, 0.0F, 0.7854F);
		BoltAction11.cubeList.add(new ModelBox(BoltAction11, 34, 58, 0.0F, 0.0F, 0.002F, 1, 2, 1, 0.0F, false));

		BoltAction10 = new ModelRenderer(this);
		BoltAction10.setRotationPoint(1.0F, -42.3F, 7.0F);
		boltaction.addChild(BoltAction10);
		BoltAction10.cubeList.add(new ModelBox(BoltAction10, 63, 117, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		BoltAction9 = new ModelRenderer(this);
		BoltAction9.setRotationPoint(1.0F, -45.7F, 7.0F);
		boltaction.addChild(BoltAction9);
		BoltAction9.cubeList.add(new ModelBox(BoltAction9, 75, 117, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		BoltAction8 = new ModelRenderer(this);
		BoltAction8.setRotationPoint(2.7F, -44.0F, 7.0F);
		boltaction.addChild(BoltAction8);
		BoltAction8.cubeList.add(new ModelBox(BoltAction8, 100, 117, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		BoltAction7 = new ModelRenderer(this);
		BoltAction7.setRotationPoint(-0.7F, -44.0F, 7.0F);
		boltaction.addChild(BoltAction7);
		BoltAction7.cubeList.add(new ModelBox(BoltAction7, 104, 117, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		BoltAction6 = new ModelRenderer(this);
		BoltAction6.setRotationPoint(2.0F, -41.5F, -17.0F);
		boltaction.addChild(BoltAction6);
		setRotationAngle(BoltAction6, 0.0F, 0.0F, -2.3562F);
		BoltAction6.cubeList.add(new ModelBox(BoltAction6, 0, 170, 0.0F, 0.0F, 0.001F, 1, 2, 24, 0.0F, false));

		BoltAction5 = new ModelRenderer(this);
		BoltAction5.setRotationPoint(1.0F, -41.5F, -17.0F);
		boltaction.addChild(BoltAction5);
		setRotationAngle(BoltAction5, 0.0F, 0.0F, -2.3562F);
		BoltAction5.cubeList.add(new ModelBox(BoltAction5, 144, 41, 0.0F, 0.0F, 0.001F, 2, 1, 24, 0.0F, false));

		BoltAction4 = new ModelRenderer(this);
		BoltAction4.setRotationPoint(2.0F, -45.5F, -17.0F);
		boltaction.addChild(BoltAction4);
		setRotationAngle(BoltAction4, 0.0F, 0.0F, 0.7854F);
		BoltAction4.cubeList.add(new ModelBox(BoltAction4, 144, 166, 0.0F, 0.0F, 0.0F, 2, 1, 24, 0.0F, false));

		BoltAction3 = new ModelRenderer(this);
		BoltAction3.setRotationPoint(1.0F, -45.5F, -17.0F);
		boltaction.addChild(BoltAction3);
		setRotationAngle(BoltAction3, 0.0F, 0.0F, 0.7854F);
		BoltAction3.cubeList.add(new ModelBox(BoltAction3, 80, 211, 0.0F, 0.0F, 0.0F, 1, 2, 24, 0.0F, false));

		BoltAction2 = new ModelRenderer(this);
		BoltAction2.setRotationPoint(1.0F, -45.5F, -17.0F);
		boltaction.addChild(BoltAction2);
		BoltAction2.cubeList.add(new ModelBox(BoltAction2, 144, 138, 0.0F, 0.0F, 0.0F, 1, 4, 24, 0.0F, false));

		BoltAction1 = new ModelRenderer(this);
		BoltAction1.setRotationPoint(-0.5F, -44.0F, -17.0F);
		boltaction.addChild(BoltAction1);
		BoltAction1.cubeList.add(new ModelBox(BoltAction1, 140, 95, 0.0F, 0.0F, 0.0F, 4, 1, 24, 0.0F, false));

		boltprime = new QRenderer(this);
		boltprime.setRotationPoint(6.0F, 21.0F, 0.0F);
		

		BoltAction39 = new ModelRenderer(this);
		BoltAction39.setRotationPoint(-7.5F, -39.8F, 4.5F);
		boltprime.addChild(BoltAction39);
		setRotationAngle(BoltAction39, 0.0F, 0.0F, -0.5577F);
		BoltAction39.cubeList.add(new ModelBox(BoltAction39, 39, 102, -7.0F, 0.1F, 0.0F, 2, 2, 2, 0.0F, false));

		BoltAction35 = new ModelRenderer(this);
		BoltAction35.setRotationPoint(-7.5F, -39.8F, 5.0F);
		boltprime.addChild(BoltAction35);
		setRotationAngle(BoltAction35, 0.0F, 0.0F, -0.5577F);
		BoltAction35.cubeList.add(new ModelBox(BoltAction35, 76, 68, -5.0F, 0.3F, 0.0F, 5, 1, 1, 0.0F, false));

		BoltAction37 = new ModelRenderer(this);
		BoltAction37.setRotationPoint(-7.5F, -39.8F, 5.0F);
		boltprime.addChild(BoltAction37);
		setRotationAngle(BoltAction37, 0.0F, 0.0F, -0.5577F);
		BoltAction37.cubeList.add(new ModelBox(BoltAction37, 57, 66, -5.0F, 0.6F, 0.2F, 5, 1, 1, 0.0F, false));

		BoltAction36 = new ModelRenderer(this);
		BoltAction36.setRotationPoint(-7.5F, -39.8F, 5.0F);
		boltprime.addChild(BoltAction36);
		setRotationAngle(BoltAction36, 0.0F, 0.0F, -0.5577F);
		BoltAction36.cubeList.add(new ModelBox(BoltAction36, 76, 53, -5.0F, 0.9F, 0.0F, 5, 1, 1, 0.0F, false));

		BoltAction34 = new ModelRenderer(this);
		BoltAction34.setRotationPoint(-7.5F, -39.8F, 4.0F);
		boltprime.addChild(BoltAction34);
		setRotationAngle(BoltAction34, 0.0F, 0.0F, -0.5577F);
		BoltAction34.cubeList.add(new ModelBox(BoltAction34, 76, 41, 0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

		BoltAction38 = new ModelRenderer(this);
		BoltAction38.setRotationPoint(-7.5F, -39.8F, 5.0F);
		boltprime.addChild(BoltAction38);
		setRotationAngle(BoltAction38, 0.0F, 0.0F, -0.5577F);
		BoltAction38.cubeList.add(new ModelBox(BoltAction38, 48, 54, -5.0F, 0.6F, -0.2F, 5, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		boltaction.render(f5);
//		boltprime.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
