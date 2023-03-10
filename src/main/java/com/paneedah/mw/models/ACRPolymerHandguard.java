package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ACRPolymerHandguard extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone24;
	private final ModelRenderer bone18;
	private final ModelRenderer bone23;
	private final ModelRenderer bone19;
	private final ModelRenderer bone22;
	private final ModelRenderer bone2;
	private final ModelRenderer bone20;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone3;
	private final ModelRenderer bone10;
	private final ModelRenderer bone13;
	private final ModelRenderer bone21;
	private final ModelRenderer bone4;
	private final ModelRenderer bone6;
	private final ModelRenderer bone5;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;

	public ACRPolymerHandguard() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.25F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 32, -3.35F, -35.3F, -54.0F, 2, 1, 31, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 0, -3.85F, -35.9F, -54.2F, 4, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 15, 22, -3.25F, -41.9F, -51.45F, 3, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 16, 12, -3.25F, -42.4F, -49.15F, 3, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.15F, -35.3F, -54.0F, 2, 1, 31, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 23, 5, -1.55F, -34.6F, -27.0F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 21, 12, -2.95F, -34.6F, -27.0F, 2, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 32, -1.45F, -34.8F, -26.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 27, 18, -3.05F, -34.8F, -26.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 96, 96, -4.25F, -39.8F, -53.0F, 1, 3, 28, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 95, 62, -0.25F, -39.8F, -53.0F, 1, 3, 28, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-3.25F, -42.4F, -48.85F);
		bone.addChild(bone25);
		setRotationAngle(bone25, -0.2094F, -0.4014F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 23, 18, -0.1172F, 0.0574F, -0.2701F, 1, 1, 2, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-0.25F, -42.4F, -48.85F);
		bone.addChild(bone26);
		setRotationAngle(bone26, -0.2094F, 0.4014F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 8, 3, -0.8828F, 0.0574F, -0.2701F, 1, 1, 2, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-2.3F, -41.9F, -51.45F);
		bone.addChild(bone24);
		setRotationAngle(bone24, 0.4887F, 0.0F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 23, 16, -0.95F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-0.25F, -41.9F, -52.45F);
		bone.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0F, -0.7505F);
		bone18.cubeList.add(new ModelBox(bone18, 6, 24, -1.0F, 0.0F, 1.0F, 1, 1, 4, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 0.0F, 1.0F);
		bone18.addChild(bone23);
		setRotationAngle(bone23, 0.5061F, 0.0F, -0.0349F);
		bone23.cubeList.add(new ModelBox(bone23, 0, 12, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-3.25F, -41.9F, -52.45F);
		bone.addChild(bone19);
		setRotationAngle(bone19, 0.0F, 0.0F, 0.7505F);
		bone19.cubeList.add(new ModelBox(bone19, 0, 22, 0.0F, 0.0F, 1.0F, 1, 1, 4, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, 0.0F, 1.0F);
		bone19.addChild(bone22);
		setRotationAngle(bone22, 0.6109F, 0.0F, 0.0524F);
		bone22.cubeList.add(new ModelBox(bone22, 5, 29, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.3F, -37.4F, -49.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.2269F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 95, -1.0F, 0.0F, -5.0F, 1, 1, 29, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 100, 0, -0.999F, -2.45F, -4.0F, 1, 2, 28, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 9, 10, -0.998F, -3.9F, -3.5F, 1, 2, 5, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 16, 16, -0.999F, -0.6F, 19.0F, 1, 1, 5, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 8, -0.999F, -0.6F, 11.5F, 1, 1, 6, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 12, 32, -0.999F, -0.6F, 6.0F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 6, 32, -0.999F, -0.6F, 1.5F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 32, -0.999F, -0.6F, -5.0F, 1, 1, 4, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 22, -1.0F, -1.0F, 23.7F, 1, 2, 1, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-0.0522F, -3.8857F, 1.5F);
		bone2.addChild(bone20);
		setRotationAngle(bone20, -0.384F, 0.0F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 8, 18, -0.9478F, 0.0F, 0.0F, 1, 2, 4, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.2923F, 1.0675F, 26.0F);
		bone2.addChild(bone11);
		setRotationAngle(bone11, 0.4887F, 0.0F, -0.0873F);
		bone11.cubeList.add(new ModelBox(bone11, 18, 26, -2.0F, -3.0F, -1.0F, 2, 3, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 27, 9, -1.0F, -3.9F, -1.0F, 1, 1, 1, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-0.0221F, -3.9051F, -3.5F);
		bone2.addChild(bone12);
		setRotationAngle(bone12, -2.0159F, 0.0F, -0.1745F);
		bone12.cubeList.add(new ModelBox(bone12, 16, 0, -2.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-4.8F, -37.4F, -49.0F);
		bone.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.2269F);
		bone3.cubeList.add(new ModelBox(bone3, 64, 68, 0.0F, 0.0F, -5.0F, 1, 1, 29, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 12, 26, 0.0F, -0.6F, -5.0F, 1, 1, 4, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 32, 99, -0.001F, -2.45F, -4.0F, 1, 2, 28, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 9, 3, -0.002F, -3.9F, -3.5F, 1, 2, 5, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 15, 0.0F, -1.0F, 19.0F, 1, 2, 5, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 15, 0.0F, -1.0F, 23.8F, 1, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, 0.0F, -1.0F, 11.5F, 1, 2, 6, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 8, 10, 0.0F, -1.0F, 6.0F, 1, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 8, 0.0F, -1.0F, 1.5F, 1, 2, 2, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-0.2923F, 1.0675F, 26.0F);
		bone3.addChild(bone10);
		setRotationAngle(bone10, 0.4887F, 0.0F, 0.0873F);
		bone10.cubeList.add(new ModelBox(bone10, 24, 26, 0.0F, -3.0F, -1.0F, 2, 3, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 12, 25, 0.0F, -3.9F, -1.0F, 1, 1, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0221F, -3.9051F, -3.5F);
		bone3.addChild(bone13);
		setRotationAngle(bone13, -0.4538F, 0.0F, 0.1745F);
		bone13.cubeList.add(new ModelBox(bone13, 0, 0, 0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-0.0907F, -4.4031F, 1.5F);
		bone3.addChild(bone21);
		setRotationAngle(bone21, -0.384F, 0.0F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 17, 6, 0.1007F, 0.4726F, 0.1909F, 1, 2, 4, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(1.8F, -36.4F, -49.0F);
		bone.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.7854F);
		bone4.cubeList.add(new ModelBox(bone4, 68, 31, -1.0F, -1.0F, -5.0F, 1, 1, 30, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, -1.0F);
		bone4.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -0.4363F);
		bone6.cubeList.add(new ModelBox(bone6, 32, 68, -1.0F, -1.0F, -4.0F, 1, 1, 30, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 6, 24, -1.1195F, -0.7437F, 25.0F, 1, 1, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-5.3F, -36.4F, -49.0F);
		bone.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.7854F);
		bone5.cubeList.add(new ModelBox(bone5, 68, 0, 0.0F, 0.0F, -5.0F, 1, 1, 30, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, 0.4363F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 64, 0.0F, 0.0F, -5.0F, 1, 1, 30, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 18, -0.2563F, 0.1195F, 24.0F, 1, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(1.47F, -35.47F, -49.0F);
		bone.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, 0.9774F);
		bone8.cubeList.add(new ModelBox(bone8, 36, 2, -1.0F, 0.0F, -5.0F, 1, 2, 30, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 7, 17, -0.7224F, -0.054F, 24.0F, 1, 2, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-4.95F, -35.47F, -49.0F);
		bone.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, -0.9774F);
		bone9.cubeList.add(new ModelBox(bone9, 36, 36, 0.0F, 0.0F, -5.0F, 1, 2, 30, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 16, 5, -0.2776F, -0.054F, 24.0F, 1, 2, 1, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(1.9F, -37.9F, -54.2F);
		bone.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, -0.2269F);
		bone14.cubeList.add(new ModelBox(bone14, 0, 27, -2.0974F, -0.0225F, 0.0F, 2, 2, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-5.3F, -37.9F, -54.2F);
		bone.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, 0.2269F);
		bone15.cubeList.add(new ModelBox(bone15, 24, 22, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-5.8F, -36.0F, -54.2F);
		bone.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.0F, -0.8203F);
		bone16.cubeList.add(new ModelBox(bone16, 24, 0, 0.0F, 0.0F, -0.01F, 2, 3, 1, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(2.3F, -36.0F, -54.2F);
		bone.addChild(bone17);
		setRotationAngle(bone17, 0.0F, 0.0F, 0.8203F);
		bone17.cubeList.add(new ModelBox(bone17, 14, 17, -2.0F, 0.0F, -0.01F, 2, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}