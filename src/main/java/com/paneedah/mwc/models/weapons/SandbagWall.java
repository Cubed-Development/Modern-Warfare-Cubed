package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class SandbagWall extends ModelBase implements IModernModel {
	private final ModelRenderer Sandbag;
	private final ModelRenderer bone2;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone3;
	private final ModelRenderer bone;
	private final ModelRenderer Sandbag2;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer Sandbag3;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer Sandbag4;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;

	public SandbagWall() {
		textureWidth = 64;
		textureHeight = 64;

		Sandbag = new ModelRenderer(this);
		Sandbag.setRotationPoint(0.0F, 24.0F, 0.0F);
		Sandbag.cubeList.add(new ModelBox(Sandbag, 0, 0, -8.0F, -4.9F, -4.5F, 16, 4, 8, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag.addChild(bone2);
		setRotationAngle(bone2, -0.1222F, 0.0F, 0.0873F);
		bone2.cubeList.add(new ModelBox(bone2, 28, 30, 0.0396F, 0.0F, 0.0F, 8, 2, 4, -0.001F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag.addChild(bone4);
		setRotationAngle(bone4, 0.1222F, 0.0F, 0.0873F);
		bone4.cubeList.add(new ModelBox(bone4, 28, 18, 0.0396F, 0.0F, -4.0F, 8, 2, 4, -0.001F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag.addChild(bone5);
		setRotationAngle(bone5, 0.1222F, 0.0F, -0.0873F);
		bone5.cubeList.add(new ModelBox(bone5, 24, 12, -7.9604F, 0.0F, -4.0F, 8, 2, 4, -0.001F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag.addChild(bone6);
		setRotationAngle(bone6, -0.1222F, 0.0F, -0.0873F);
		bone6.cubeList.add(new ModelBox(bone6, 24, 24, -7.9604F, 0.0F, 0.0F, 8, 2, 4, -0.001F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.1F, -8.0F, -1.0F);
		Sandbag.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.0873F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 22, -7.403F, 6.1725F, -3.5F, 8, 2, 8, -0.001F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -7.0F, 0.0F);
		Sandbag.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -0.0873F);
		bone.cubeList.add(new ModelBox(bone, 0, 12, -0.6576F, 5.1672F, -4.5F, 8, 2, 8, -0.001F, false));

		Sandbag2 = new ModelRenderer(this);
		Sandbag2.setRotationPoint(8.1F, 18.6F, 0.0F);
		Sandbag2.cubeList.add(new ModelBox(Sandbag2, 0, 0, -8.0F, -5.1F, -4.5F, 16, 4, 8, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag2.addChild(bone7);
		setRotationAngle(bone7, -0.1222F, 0.0F, 0.0873F);
		bone7.cubeList.add(new ModelBox(bone7, 28, 30, 0.0222F, -0.1978F, -0.0243F, 8, 2, 4, -0.001F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag2.addChild(bone8);
		setRotationAngle(bone8, 0.1222F, 0.0F, 0.0873F);
		bone8.cubeList.add(new ModelBox(bone8, 28, 18, 0.0222F, -0.1978F, -3.9757F, 8, 2, 4, -0.001F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag2.addChild(bone9);
		setRotationAngle(bone9, 0.1222F, 0.0F, -0.0873F);
		bone9.cubeList.add(new ModelBox(bone9, 24, 12, -7.9429F, -0.1978F, -3.9757F, 8, 2, 4, -0.001F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag2.addChild(bone10);
		setRotationAngle(bone10, -0.1222F, 0.0F, -0.0873F);
		bone10.cubeList.add(new ModelBox(bone10, 24, 24, -7.9429F, -0.1978F, -0.0243F, 8, 2, 4, -0.001F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.1F, -8.0F, -1.0F);
		Sandbag2.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, 0.0873F);
		bone11.cubeList.add(new ModelBox(bone11, 0, 22, -7.4205F, 5.9733F, -3.5F, 8, 2, 8, -0.001F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, -7.0F, 0.0F);
		Sandbag2.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, -0.0873F);
		bone12.cubeList.add(new ModelBox(bone12, 0, 12, -0.6402F, 4.968F, -4.5F, 8, 2, 8, -0.001F, false));

		Sandbag3 = new ModelRenderer(this);
		Sandbag3.setRotationPoint(-8.0F, 18.6F, 0.0F);
		Sandbag3.cubeList.add(new ModelBox(Sandbag3, 0, 0, -8.0F, -5.1F, -4.5F, 16, 4, 8, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag3.addChild(bone13);
		setRotationAngle(bone13, -0.1222F, 0.0F, 0.0873F);
		bone13.cubeList.add(new ModelBox(bone13, 28, 30, 0.0222F, -0.1978F, -0.0243F, 8, 2, 4, -0.001F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag3.addChild(bone14);
		setRotationAngle(bone14, 0.1222F, 0.0F, 0.0873F);
		bone14.cubeList.add(new ModelBox(bone14, 28, 18, 0.0222F, -0.1978F, -3.9757F, 8, 2, 4, -0.001F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag3.addChild(bone15);
		setRotationAngle(bone15, 0.1222F, 0.0F, -0.0873F);
		bone15.cubeList.add(new ModelBox(bone15, 24, 12, -7.9429F, -0.1978F, -3.9757F, 8, 2, 4, -0.001F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag3.addChild(bone16);
		setRotationAngle(bone16, -0.1222F, 0.0F, -0.0873F);
		bone16.cubeList.add(new ModelBox(bone16, 24, 24, -7.9429F, -0.1978F, -0.0243F, 8, 2, 4, -0.001F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.1F, -8.0F, -1.0F);
		Sandbag3.addChild(bone17);
		setRotationAngle(bone17, 0.0F, 0.0F, 0.0873F);
		bone17.cubeList.add(new ModelBox(bone17, 0, 22, -7.4205F, 5.9733F, -3.5F, 8, 2, 8, -0.001F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, -7.0F, 0.0F);
		Sandbag3.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0F, -0.0873F);
		bone18.cubeList.add(new ModelBox(bone18, 0, 12, -0.6402F, 4.968F, -4.5F, 8, 2, 8, -0.001F, false));

		Sandbag4 = new ModelRenderer(this);
		Sandbag4.setRotationPoint(0.0F, 12.7F, 0.0F);
		Sandbag4.cubeList.add(new ModelBox(Sandbag4, 0, 0, -8.0F, -4.9F, -4.5F, 16, 4, 8, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag4.addChild(bone19);
		setRotationAngle(bone19, -0.1222F, 0.0F, 0.0873F);
		bone19.cubeList.add(new ModelBox(bone19, 28, 30, 0.0396F, 0.0F, 0.0F, 8, 2, 4, -0.001F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag4.addChild(bone20);
		setRotationAngle(bone20, 0.1222F, 0.0F, 0.0873F);
		bone20.cubeList.add(new ModelBox(bone20, 28, 18, 0.0396F, 0.0F, -4.0F, 8, 2, 4, -0.001F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag4.addChild(bone21);
		setRotationAngle(bone21, 0.1222F, 0.0F, -0.0873F);
		bone21.cubeList.add(new ModelBox(bone21, 24, 12, -7.9604F, 0.0F, -4.0F, 8, 2, 4, -0.001F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag4.addChild(bone22);
		setRotationAngle(bone22, -0.1222F, 0.0F, -0.0873F);
		bone22.cubeList.add(new ModelBox(bone22, 24, 24, -7.9604F, 0.0F, 0.0F, 8, 2, 4, -0.001F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.1F, -8.0F, -1.0F);
		Sandbag4.addChild(bone23);
		setRotationAngle(bone23, 0.0F, 0.0F, 0.0873F);
		bone23.cubeList.add(new ModelBox(bone23, 0, 22, -7.403F, 6.1725F, -3.5F, 8, 2, 8, -0.001F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, -7.0F, 0.0F);
		Sandbag4.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.0F, -0.0873F);
		bone24.cubeList.add(new ModelBox(bone24, 0, 12, -0.6576F, 5.1672F, -4.5F, 8, 2, 8, -0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Sandbag.render(f5);
		Sandbag2.render(f5);
		Sandbag3.render(f5);
		Sandbag4.render(f5);
	}
}
