package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MP7FrontSightFlipped extends ModelBase {
	private final QRenderer master;
	private final ModelRenderer rearsight;
	private final ModelRenderer rearsight27;
	private final ModelRenderer rearsight26;
	private final ModelRenderer rearsight17;
	private final ModelRenderer rearsight16;
	private final ModelRenderer rearsight14;
	private final ModelRenderer rearsight15;
	private final ModelRenderer rearsight13;
	private final ModelRenderer rearsight12;
	private final ModelRenderer rearsight11;
	private final ModelRenderer rearsight10;
	private final ModelRenderer rearsight9;
	private final ModelRenderer rearsight8;
	private final ModelRenderer flippable2;
	private final ModelRenderer rearsight1;
	private final ModelRenderer rearsight2;
	private final ModelRenderer rearsight3;
	private final ModelRenderer rearsight4;
	private final ModelRenderer rearsight5;
	private final ModelRenderer rearsight6;
	private final ModelRenderer rearsight7;
	private final ModelRenderer rearsight18;
	private final ModelRenderer rearsight19;
	private final ModelRenderer rearsight21;
	private final ModelRenderer rearsight20;
	private final ModelRenderer rearsight22;
	private final ModelRenderer rearsight23;
	private final ModelRenderer rearsight24;
	private final ModelRenderer rearsight25;
	private final ModelRenderer rearsight28;
	private final ModelRenderer rearsight29;
	private final ModelRenderer frontsight;
	private final ModelRenderer frontsight11;
	private final ModelRenderer frontsight6;
	private final ModelRenderer frontsight4;
	private final ModelRenderer frontsight5;
	private final ModelRenderer frontsight3;
	private final ModelRenderer frontsight2;
	private final ModelRenderer frontsight1;
	private final ModelRenderer flippable;
	private final ModelRenderer frontsight10;
	private final ModelRenderer frontsight9;
	private final ModelRenderer frontsight8;
	private final ModelRenderer frontsight13;
	private final ModelRenderer frontsight14;
	private final ModelRenderer frontsight15;

	public MP7FrontSightFlipped() {
		textureWidth = 128;
		textureHeight = 128;

		master = new QRenderer(this);
		master.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		rearsight = new ModelRenderer(this);
		rearsight.setRotationPoint(0.0F, 0.0F, 0.0F);
		master.addChild(rearsight);
		

		rearsight27 = new ModelRenderer(this);
		rearsight27.setRotationPoint(-11.0F, -21.5F, 4.0F);
		rearsight.addChild(rearsight27);
		setRotationAngle(rearsight27, -0.2974F, 0.0F, 0.0F);
		rearsight27.cubeList.add(new ModelBox(rearsight27, 96, 59, 0.0F, 0.0F, 0.0F, 5, 8, 8, 0.0F, false));

		rearsight26 = new ModelRenderer(this);
		rearsight26.setRotationPoint(-4.5F, -19.0F, 6.0F);
		rearsight.addChild(rearsight26);
		setRotationAngle(rearsight26, -0.409F, 0.0F, 0.0F);
		rearsight26.cubeList.add(new ModelBox(rearsight26, 29, 21, 0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F, false));

		rearsight17 = new ModelRenderer(this);
		rearsight17.setRotationPoint(-6.0F, -16.5F, -7.01F);
		rearsight.addChild(rearsight17);
		rearsight17.cubeList.add(new ModelBox(rearsight17, 58, 0, 0.0F, 0.0F, 0.0F, 12, 2, 16, 0.0F, false));

		rearsight16 = new ModelRenderer(this);
		rearsight16.setRotationPoint(-7.0F, -13.0F, -7.01F);
		rearsight.addChild(rearsight16);
		setRotationAngle(rearsight16, 0.0F, 0.0F, 2.3051F);
		rearsight16.cubeList.add(new ModelBox(rearsight16, 54, 81, -2.0F, -3.0F, 0.0F, 2, 3, 21, -0.002F, false));

		rearsight14 = new ModelRenderer(this);
		rearsight14.setRotationPoint(-7.0F, -19.5F, 4.0F);
		rearsight.addChild(rearsight14);
		rearsight14.cubeList.add(new ModelBox(rearsight14, 0, 17, 0.0F, 0.0F, 0.0F, 3, 2, 6, 0.0F, false));

		rearsight15 = new ModelRenderer(this);
		rearsight15.setRotationPoint(-7.0F, -16.0F, -7.01F);
		rearsight.addChild(rearsight15);
		rearsight15.cubeList.add(new ModelBox(rearsight15, 27, 65, 0.0F, 0.0F, 0.0F, 3, 3, 21, -0.001F, false));

		rearsight13 = new ModelRenderer(this);
		rearsight13.setRotationPoint(-7.0F, -17.5F, 9.01F);
		rearsight.addChild(rearsight13);
		setRotationAngle(rearsight13, 0.0F, 0.0F, -0.384F);
		rearsight13.cubeList.add(new ModelBox(rearsight13, 0, 7, 0.0F, 0.0F, 0.0F, 4, 5, 5, 0.0F, false));

		rearsight12 = new ModelRenderer(this);
		rearsight12.setRotationPoint(-7.01F, -17.5F, 1.0F);
		rearsight.addChild(rearsight12);
		rearsight12.cubeList.add(new ModelBox(rearsight12, 84, 39, 0.0F, 0.0F, 0.0F, 3, 4, 13, 0.0F, false));

		rearsight11 = new ModelRenderer(this);
		rearsight11.setRotationPoint(-3.3F, -19.0F, 9.0F);
		rearsight.addChild(rearsight11);
		rearsight11.cubeList.add(new ModelBox(rearsight11, 58, 18, 0.0F, 0.0F, 0.0F, 10, 5, 5, 0.0F, false));

		rearsight10 = new ModelRenderer(this);
		rearsight10.setRotationPoint(8.0F, -13.0F, -7.0F);
		rearsight.addChild(rearsight10);
		setRotationAngle(rearsight10, 0.0F, 0.0F, -2.3051F);
		rearsight10.cubeList.add(new ModelBox(rearsight10, 58, 34, 0.0F, -3.0F, 0.0F, 2, 3, 22, -0.001F, false));

		rearsight9 = new ModelRenderer(this);
		rearsight9.setRotationPoint(8.0F, -19.0F, -7.0F);
		rearsight.addChild(rearsight9);
		setRotationAngle(rearsight9, 0.0F, 0.0F, 2.3051F);
		rearsight9.cubeList.add(new ModelBox(rearsight9, 0, 59, 0.0F, 0.0F, 0.0F, 2, 3, 22, -0.001F, false));

		rearsight8 = new ModelRenderer(this);
		rearsight8.setRotationPoint(6.0F, -19.0F, -7.0F);
		rearsight.addChild(rearsight8);
		rearsight8.cubeList.add(new ModelBox(rearsight8, 32, 37, 0.0F, 0.0F, 0.0F, 2, 6, 22, 0.0F, false));

		flippable2 = new ModelRenderer(this);
		flippable2.setRotationPoint(0.0F, -19.0F, 6.0F);
		rearsight.addChild(flippable2);
		setRotationAngle(flippable2, -1.5708F, 0.0F, 0.0F);
		

		rearsight1 = new ModelRenderer(this);
		rearsight1.setRotationPoint(-4.0F, -3.5F, -9.0F);
		flippable2.addChild(rearsight1);
		rearsight1.cubeList.add(new ModelBox(rearsight1, 0, 0, 0.0F, 0.0F, 0.0F, 8, 3, 4, 0.0F, false));

		rearsight2 = new ModelRenderer(this);
		rearsight2.setRotationPoint(-4.0F, -5.5F, -9.0F);
		flippable2.addChild(rearsight2);
		rearsight2.cubeList.add(new ModelBox(rearsight2, 0, 39, 0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

		rearsight3 = new ModelRenderer(this);
		rearsight3.setRotationPoint(1.0F, -5.5F, -9.0F);
		flippable2.addChild(rearsight3);
		rearsight3.cubeList.add(new ModelBox(rearsight3, 10, 35, 0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

		rearsight4 = new ModelRenderer(this);
		rearsight4.setRotationPoint(-4.0F, -5.5F, -9.0F);
		flippable2.addChild(rearsight4);
		setRotationAngle(rearsight4, 0.0F, 0.0F, 0.7854F);
		rearsight4.cubeList.add(new ModelBox(rearsight4, 41, 7, 0.0F, 0.0F, 0.0F, 2, 2, 4, -0.001F, false));

		rearsight5 = new ModelRenderer(this);
		rearsight5.setRotationPoint(4.0F, -5.5F, -9.0F);
		flippable2.addChild(rearsight5);
		setRotationAngle(rearsight5, 0.0F, 0.0F, 0.7854F);
		rearsight5.cubeList.add(new ModelBox(rearsight5, 39, 0, 0.0F, 0.0F, 0.0F, 2, 2, 4, -0.001F, false));

		rearsight6 = new ModelRenderer(this);
		rearsight6.setRotationPoint(-5.4F, -4.0F, -9.01F);
		flippable2.addChild(rearsight6);
		rearsight6.cubeList.add(new ModelBox(rearsight6, 29, 34, 0.0F, 0.0F, 0.0F, 3, 4, 4, 0.0F, false));

		rearsight7 = new ModelRenderer(this);
		rearsight7.setRotationPoint(2.4F, -4.0F, -9.01F);
		flippable2.addChild(rearsight7);
		rearsight7.cubeList.add(new ModelBox(rearsight7, 0, 31, 0.0F, 0.0F, 0.0F, 3, 4, 4, 0.0F, false));

		rearsight18 = new ModelRenderer(this);
		rearsight18.setRotationPoint(-3.0F, -0.5F, -21.0F);
		flippable2.addChild(rearsight18);
		rearsight18.cubeList.add(new ModelBox(rearsight18, 79, 81, 0.0F, 0.0F, 7.0F, 6, 2, 16, 0.0F, false));

		rearsight19 = new ModelRenderer(this);
		rearsight19.setRotationPoint(-1.5F, -0.5F, -26.0F);
		flippable2.addChild(rearsight19);
		rearsight19.cubeList.add(new ModelBox(rearsight19, 10, 31, 0.0F, 0.0F, 7.0F, 3, 2, 1, 0.0F, false));

		rearsight21 = new ModelRenderer(this);
		rearsight21.setRotationPoint(2.0F, -0.49F, -24.5F);
		flippable2.addChild(rearsight21);
		rearsight21.cubeList.add(new ModelBox(rearsight21, 10, 41, 0.0F, 0.0F, 7.0F, 1, 2, 4, 0.001F, false));

		rearsight20 = new ModelRenderer(this);
		rearsight20.setRotationPoint(-3.0F, -0.5F, -24.5F);
		flippable2.addChild(rearsight20);
		rearsight20.cubeList.add(new ModelBox(rearsight20, 41, 13, 0.0F, 0.0F, 7.0F, 1, 2, 4, 0.001F, false));

		rearsight22 = new ModelRenderer(this);
		rearsight22.setRotationPoint(-1.5F, -0.5F, -26.0F);
		flippable2.addChild(rearsight22);
		setRotationAngle(rearsight22, 0.0F, -0.7854F, 0.0F);
		rearsight22.cubeList.add(new ModelBox(rearsight22, 19, 7, 4.9497F, 0.0F, 4.9497F, 1, 2, 2, -0.001F, false));

		rearsight23 = new ModelRenderer(this);
		rearsight23.setRotationPoint(1.5F, -0.5F, -26.0F);
		flippable2.addChild(rearsight23);
		setRotationAngle(rearsight23, 0.0F, -0.7854F, 0.0F);
		rearsight23.cubeList.add(new ModelBox(rearsight23, 29, 0, 4.9497F, 0.0F, 4.9497F, 2, 2, 1, -0.001F, false));

		rearsight24 = new ModelRenderer(this);
		rearsight24.setRotationPoint(-1.5F, -0.5F, -21.5F);
		flippable2.addChild(rearsight24);
		setRotationAngle(rearsight24, 0.0F, -0.7854F, 0.0F);
		rearsight24.cubeList.add(new ModelBox(rearsight24, 18, 22, 3.9497F, 0.0F, 4.9497F, 2, 2, 1, -0.001F, false));

		rearsight25 = new ModelRenderer(this);
		rearsight25.setRotationPoint(1.5F, -0.5F, -21.5F);
		flippable2.addChild(rearsight25);
		setRotationAngle(rearsight25, 0.0F, -0.7854F, 0.0F);
		rearsight25.cubeList.add(new ModelBox(rearsight25, 0, 17, 4.9497F, 0.0F, 3.9497F, 1, 2, 2, -0.001F, false));

		rearsight28 = new ModelRenderer(this);
		rearsight28.setRotationPoint(-3.0F, -5.0F, -5.9F);
		flippable2.addChild(rearsight28);
		rearsight28.cubeList.add(new ModelBox(rearsight28, 0, 7, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		rearsight29 = new ModelRenderer(this);
		rearsight29.setRotationPoint(2.0F, -5.0F, -5.9F);
		flippable2.addChild(rearsight29);
		rearsight29.cubeList.add(new ModelBox(rearsight29, 0, 2, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		frontsight = new ModelRenderer(this);
		frontsight.setRotationPoint(0.0F, 0.0F, 0.0F);
		master.addChild(frontsight);
		

		frontsight11 = new ModelRenderer(this);
		frontsight11.setRotationPoint(4.0F, -19.5F, -48.0F);
		frontsight.addChild(frontsight11);
		frontsight11.cubeList.add(new ModelBox(frontsight11, 26, 92, 0.0F, 0.0F, -1.0F, 2, 7, 14, 0.0F, false));

		frontsight6 = new ModelRenderer(this);
		frontsight6.setRotationPoint(-7.01F, -17.5F, -52.0F);
		frontsight.addChild(frontsight6);
		frontsight6.cubeList.add(new ModelBox(frontsight6, 84, 18, 0.0F, 0.0F, 0.0F, 3, 4, 17, 0.001F, false));

		frontsight4 = new ModelRenderer(this);
		frontsight4.setRotationPoint(-4.3F, -19.0F, -52.0F);
		frontsight.addChild(frontsight4);
		frontsight4.cubeList.add(new ModelBox(frontsight4, 44, 89, 0.0F, 0.0F, 0.0F, 11, 5, 3, 0.0F, false));

		frontsight5 = new ModelRenderer(this);
		frontsight5.setRotationPoint(-7.0F, -17.5F, -51.99F);
		frontsight.addChild(frontsight5);
		setRotationAngle(frontsight5, 0.0F, 0.0F, -0.384F);
		frontsight5.cubeList.add(new ModelBox(frontsight5, 0, 84, 0.0F, 0.0F, 0.0F, 3, 5, 17, 0.0F, false));

		frontsight3 = new ModelRenderer(this);
		frontsight3.setRotationPoint(8.0F, -13.0F, -53.0F);
		frontsight.addChild(frontsight3);
		setRotationAngle(frontsight3, 0.0F, 0.0F, -2.3051F);
		frontsight3.cubeList.add(new ModelBox(frontsight3, 29, 6, 0.0F, -3.0F, 0.0F, 2, 3, 25, -0.001F, false));

		frontsight2 = new ModelRenderer(this);
		frontsight2.setRotationPoint(8.0F, -19.0F, -53.0F);
		frontsight.addChild(frontsight2);
		setRotationAngle(frontsight2, 0.0F, 0.0F, 2.3051F);
		frontsight2.cubeList.add(new ModelBox(frontsight2, 0, 31, 0.0F, 0.0F, 0.0F, 2, 3, 25, -0.001F, false));

		frontsight1 = new ModelRenderer(this);
		frontsight1.setRotationPoint(6.0F, -19.0F, -53.0F);
		frontsight.addChild(frontsight1);
		frontsight1.cubeList.add(new ModelBox(frontsight1, 0, 0, 0.0F, 0.0F, 0.0F, 2, 6, 25, 0.0F, false));

		flippable = new ModelRenderer(this);
		flippable.setRotationPoint(0.0F, -18.0F, -43.5F);
		frontsight.addChild(flippable);
		setRotationAngle(flippable, 1.5708F, 0.0F, 0.0F);
		

		frontsight10 = new ModelRenderer(this);
		frontsight10.setRotationPoint(-4.0F, -1.0F, 10.0F);
		flippable.addChild(frontsight10);
		frontsight10.cubeList.add(new ModelBox(frontsight10, 13, 12, 0.0F, 0.0F, 3.9F, 1, 5, 5, 0.001F, false));
		frontsight10.cubeList.add(new ModelBox(frontsight10, 13, 7, 3.5F, 1.75F, 2.9F, 1, 1, 4, 0.0F, false));

		frontsight9 = new ModelRenderer(this);
		frontsight9.setRotationPoint(3.0F, -1.0F, 10.0F);
		flippable.addChild(frontsight9);
		frontsight9.cubeList.add(new ModelBox(frontsight9, 29, 11, 0.0F, 0.0F, 3.9F, 1, 5, 5, 0.001F, false));

		frontsight8 = new ModelRenderer(this);
		frontsight8.setRotationPoint(-4.0F, -1.0F, -3.0F);
		flippable.addChild(frontsight8);
		frontsight8.cubeList.add(new ModelBox(frontsight8, 63, 59, 0.0F, 0.0F, 0.0F, 8, 5, 17, 0.0F, false));

		frontsight13 = new ModelRenderer(this);
		frontsight13.setRotationPoint(-1.0F, -6.5F, 7.5F);
		flippable.addChild(frontsight13);
		setRotationAngle(frontsight13, -1.321F, 0.0F, 0.0F);
		frontsight13.cubeList.add(new ModelBox(frontsight13, 29, 0, 0.0F, 0.0F, 0.0F, 2, 5, 6, 0.0F, false));

		frontsight14 = new ModelRenderer(this);
		frontsight14.setRotationPoint(-1.0F, -5.2F, 2.6F);
		flippable.addChild(frontsight14);
		setRotationAngle(frontsight14, -0.4461F, 0.0F, 0.0F);
		frontsight14.cubeList.add(new ModelBox(frontsight14, 40, 39, 0.0F, 0.0F, 0.0F, 2, 5, 3, -0.001F, false));

		frontsight15 = new ModelRenderer(this);
		frontsight15.setRotationPoint(-0.5F, -6.5F, 7.5F);
		flippable.addChild(frontsight15);
		setRotationAngle(frontsight15, -1.321F, 0.0F, 0.0F);
		frontsight15.cubeList.add(new ModelBox(frontsight15, 0, 0, 0.0F, -0.1F, 0.7F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		frontsight.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
