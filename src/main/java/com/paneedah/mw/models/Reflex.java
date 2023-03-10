package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.1
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Reflex extends ModelBase {
	private final ModelRenderer gun1;
	private final ModelRenderer gun2;
	private final ModelRenderer gun3;
	private final ModelRenderer gun8;
	private final ModelRenderer bone10;
	private final ModelRenderer gun9;
	private final ModelRenderer gun11;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer gun10;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer gun14;
	private final ModelRenderer gun13;
	private final ModelRenderer gun15;
	private final ModelRenderer bone15;
	private final ModelRenderer bone17;
	private final ModelRenderer bone16;
	private final ModelRenderer bone18;
	private final ModelRenderer gun5;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer bone5;
	private final ModelRenderer gun7;
	private final ModelRenderer gun6;
	private final ModelRenderer bone6;
	private final ModelRenderer bone8;
	private final ModelRenderer bone7;
	private final ModelRenderer bone9;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;

	public Reflex() {
		textureWidth = 64;
		textureHeight = 64;

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-5.0F, -6.0F, -2.0F);
		gun1.cubeList.add(new ModelBox(gun1, 0, 0, 0.0F, 0.0F, 0.0F, 7, 2, 15, 0.0F, false));
		gun1.cubeList.add(new ModelBox(gun1, 0, 33, -0.01F, -0.3F, 10.9F, 7, 1, 4, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-4.0F, -4.0F, -1.5F);
		gun2.cubeList.add(new ModelBox(gun2, 28, 17, 0.0F, 0.0F, 0.0F, 5, 1, 13, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-5.0F, -3.0F, -2.0F);
		gun3.cubeList.add(new ModelBox(gun3, 28, 31, -0.01F, 1.0F, 0.0F, 1, 1, 14, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 29, 0, 6.01F, 1.0F, 0.0F, 1, 1, 14, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-5.0F, -3.5F, -2.0F);
		gun8.cubeList.add(new ModelBox(gun8, 0, 17, 0.0F, 0.0F, 0.0F, 7, 2, 14, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-5.0F, -6.0F, -2.0F);
		setRotationAngle(bone10, 0.0F, 0.0F, -2.3562F);
		bone10.cubeList.add(new ModelBox(bone10, 21, 48, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 13, 48, -4.9497F, 3.9497F, 0.0F, 1, 1, 3, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-4.5F, -6.0F, -2.0F);
		setRotationAngle(gun9, -0.0698F, 0.0F, 0.0F);
		gun9.cubeList.add(new ModelBox(gun9, 45, 0, 0.0F, -2.0F, 0.0F, 6, 2, 3, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(5.5F, -6.0F, 0.0F);
		gun9.addChild(gun11);
		gun11.cubeList.add(new ModelBox(gun11, 34, 35, 0.5F, 0.8005F, -0.014F, 1, 2, 3, 0.0F, false));
		gun11.cubeList.add(new ModelBox(gun11, 8, 46, 0.51F, 0.3005F, -0.014F, 1, 1, 3, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(1.5F, 0.5F, 0.0F);
		gun11.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -0.5236F);
		bone11.cubeList.add(new ModelBox(bone11, 34, 7, -0.9002F, -2.1728F, -0.014F, 1, 2, 3, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(1.5F, 3.0F, 0.0F);
		gun11.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, 0.5236F);
		bone12.cubeList.add(new ModelBox(bone12, 34, 2, -1.0998F, -0.1728F, -0.014F, 1, 2, 3, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(0.5F, -6.1995F, -0.014F);
		gun9.addChild(gun10);
		setRotationAngle(gun10, 0.0F, 3.1416F, 0.0F);
		gun10.cubeList.add(new ModelBox(gun10, 28, 33, 0.5F, 1.0F, -3.0F, 1, 2, 3, 0.0F, false));
		gun10.cubeList.add(new ModelBox(gun10, 29, 10, 0.51F, 0.5F, -3.0F, 1, 1, 3, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(1.5F, 0.5F, 0.0F);
		gun10.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, -0.5236F);
		bone13.cubeList.add(new ModelBox(bone13, 29, 5, -1.0F, -2.0F, -3.0F, 1, 2, 3, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(1.5F, 3.0F, 0.0F);
		gun10.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, 0.5236F);
		bone14.cubeList.add(new ModelBox(bone14, 29, 0, -1.0F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(5.0F, -7.0F, 0.0F);
		gun9.addChild(gun14);
		

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(0.0F, -7.0F, 0.0F);
		gun9.addChild(gun13);
		

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(0.5F, -7.5F, 0.0F);
		gun9.addChild(gun15);
		gun15.cubeList.add(new ModelBox(gun15, 24, 41, -0.5F, 0.07F, 0.0F, 6, 1, 3, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-0.65F, -6.2F, 3.25F);
		bone15.cubeList.add(new ModelBox(bone15, 44, 31, -3.85F, -1.0F, 0.25F, 6, 2, 3, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 16, 33, -2.35F, -1.0F, -1.25F, 3, 2, 6, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.4F, -0.3F, 0.25F);
		bone15.addChild(bone17);
		setRotationAngle(bone17, 0.0F, -0.7854F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 45, 5, -1.85F, -1.0F, 0.0F, 4, 2, 4, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-3.85F, 0.0F, 0.25F);
		bone15.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.7854F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 43, 46, 0.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 35, 46, -2.1213F, -1.0F, 2.1213F, 2, 2, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 27, 46, 0.1213F, -1.0F, 4.364F, 2, 2, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 0, 46, 2.2426F, -1.0F, 2.2426F, 2, 2, 2, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 24.0F, -0.6F);
		

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-4.0F, -32.0F, 12.0F);
		bone18.addChild(gun5);
		setRotationAngle(gun5, 0.0436F, 0.0F, 0.0F);
		gun5.cubeList.add(new ModelBox(gun5, 0, 38, 0.5F, 0.0654F, 1.4986F, 4, 3, 5, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(4.5F, -0.001F, -0.0436F);
		gun5.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -0.7854F);
		bone.cubeList.add(new ModelBox(bone, 28, 23, -1.0463F, 0.0463F, 1.4986F, 1, 1, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 28, 17, -3.8747F, -2.7822F, 1.4986F, 1, 1, 5, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(5.2F, 1.6984F, 4.9258F);
		gun5.addChild(bone2);
		setRotationAngle(bone2, 0.0698F, -0.1571F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 7, -0.7656F, -0.8315F, -4.528F, 1, 1, 6, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone2.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.4712F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 23, -0.7146F, 0.0437F, -3.528F, 1, 1, 5, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.2F, 1.6984F, 4.9258F);
		gun5.addChild(bone3);
		setRotationAngle(bone3, 0.0698F, 0.1571F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -0.2344F, -0.8315F, -4.528F, 1, 1, 6, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-0.0585F, -0.9691F, -0.0576F);
		bone3.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.4712F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 17, -0.2268F, 0.0437F, -3.528F, 1, 1, 5, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-0.5F, -32.0F, 12.0F);
		bone18.addChild(gun7);
		setRotationAngle(gun7, -1.0038F, -0.2618F, 0.0F);
		gun7.cubeList.add(new ModelBox(gun7, 0, 7, 0.3882F, -1.2222F, 0.7782F, 1, 4, 2, 0.0F, false));
		gun7.cubeList.add(new ModelBox(gun7, 8, 8, 1.0782F, -0.2222F, 0.7782F, 1, 3, 2, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-2.5F, -32.0F, 12.0F);
		bone18.addChild(gun6);
		setRotationAngle(gun6, -1.0038F, 0.2618F, 0.0F);
		gun6.cubeList.add(new ModelBox(gun6, 0, 0, -1.3882F, -1.2222F, 0.7782F, 1, 4, 2, 0.0F, false));
		gun6.cubeList.add(new ModelBox(gun6, 8, 0, -2.0782F, -0.2222F, 0.7782F, 1, 3, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(2.0F, -29.0F, 12.0F);
		bone18.addChild(bone6);
		setRotationAngle(bone6, 0.0F, -0.1658F, 0.0F);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(bone8);
		setRotationAngle(bone8, 0.1047F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 44, 36, -2.7424F, -0.8454F, 1.4713F, 3, 2, 5, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-5.0F, -29.0F, 12.0F);
		bone18.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.1658F, 0.0F);
		

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone9);
		setRotationAngle(bone9, 0.1047F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 13, 41, -0.2576F, -0.8454F, 1.4713F, 3, 2, 5, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(2.2F, -5.2F, 10.2F);
		setRotationAngle(bone19, -0.7854F, 0.0F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 10, 18, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 7, 17, -0.8F, 1.192F, 2.0506F, 1, 1, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 0, 17, -0.8F, 9.3945F, -6.1518F, 1, 1, 1, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-0.2F, -3.0F, 13.05F);
		setRotationAngle(bone20, 0.0F, -0.7854F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 39, 52, -2.0F, -1.6F, 0.0F, 4, 2, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun1.render(f5);
		gun2.render(f5);
		gun3.render(f5);
		gun8.render(f5);
		bone10.render(f5);
		gun9.render(f5);
		bone15.render(f5);
		bone18.render(f5);
		bone19.render(f5);
		bone20.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}