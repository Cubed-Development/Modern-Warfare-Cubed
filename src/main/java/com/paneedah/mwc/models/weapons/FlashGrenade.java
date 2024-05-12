package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FlashGrenade extends ModelBase {
	private final ModelRenderer grenade;
	private final ModelRenderer grenade1_r1;
	private final ModelRenderer grenade37_r1;
	private final ModelRenderer grenade36_r1;
	private final ModelRenderer grenade35_r1;
	private final ModelRenderer grenade34_r1;
	private final ModelRenderer grenade33_r1;
	private final ModelRenderer grenade28_r1;
	private final ModelRenderer grenade26_r1;
	private final ModelRenderer grenade25_r1;
	private final ModelRenderer grenade24_r1;
	private final ModelRenderer grenade23_r1;
	private final ModelRenderer grenade14_r1;
	private final ModelRenderer grenade13_r1;
	private final ModelRenderer grenade9_r1;
	private final ModelRenderer grenade7_r1;
	private final ModelRenderer grenade5_r1;

	public FlashGrenade() {
		textureWidth = 128;
		textureHeight = 128;

		grenade = new ModelRenderer(this);
		grenade.setRotationPoint(0.0F, 24.0F, 0.0F);
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -3.5F, -25.2F, 10.2F, 4, 1, 2, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -3.5F, -46.5F, -0.3F, 4, 1, 7, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -3.0F, -45.3F, -2.0F, 3, 1, 2, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 20, -3.0F, -45.5F, 1.7F, 3, 8, 3, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 20, -2.5F, -45.5F, 1.3F, 2, 8, 4, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 20, -3.5F, -45.5F, 2.2F, 4, 8, 2, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 20, -3.4F, -45.5F, 0.3F, 4, 2, 5, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 50, -6.5F, -36.5F, 0.3F, 10, 4, 6, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 60, 50, -3.0F, -32.5F, -0.7F, 3, 17, 8, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 50, -6.5F, -15.5F, 0.3F, 10, 4, 6, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 80, -5.5F, -32.5F, 1.8F, 8, 17, 3, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -3.5F, -38.2F, 12.2F, 4, 14, 1, 0.0F, true));

		grenade1_r1 = new ModelRenderer(this);
		grenade1_r1.setRotationPoint(0.0F, -2.5736F, 22.0416F);
		grenade.addChild(grenade1_r1);
		setRotationAngle(grenade1_r1, 0.4833F, 0.0F, 0.0F);
		grenade1_r1.cubeList.add(new ModelBox(grenade1_r1, 0, 0, -3.5F, -46.0F, 5.8F, 4, 9, 1, 0.0F, true));

		grenade37_r1 = new ModelRenderer(this);
		grenade37_r1.setRotationPoint(0.0F, -19.5181F, 44.6759F);
		grenade.addChild(grenade37_r1);
		setRotationAngle(grenade37_r1, 1.3384F, 0.0F, 0.0F);
		grenade37_r1.cubeList.add(new ModelBox(grenade37_r1, 0, 0, -3.5F, -38.0F, 10.0F, 4, 3, 1, 0.0F, true));

		grenade36_r1 = new ModelRenderer(this);
		grenade36_r1.setRotationPoint(-1.3737F, 0.0F, 1.9163F);
		grenade.addChild(grenade36_r1);
		setRotationAngle(grenade36_r1, 0.0F, -0.7854F, 0.0F);
		grenade36_r1.cubeList.add(new ModelBox(grenade36_r1, 50, 80, -3.0F, -32.5F, 1.8F, 1, 17, 1, 0.0F, true));
		grenade36_r1.cubeList.add(new ModelBox(grenade36_r1, 50, 50, -3.0F, -32.5F, -0.7F, 1, 17, 3, 0.0F, true));

		grenade35_r1 = new ModelRenderer(this);
		grenade35_r1.setRotationPoint(0.0406F, 0.0F, 14.5832F);
		grenade.addChild(grenade35_r1);
		setRotationAngle(grenade35_r1, -3.1416F, -0.7854F, 3.1416F);
		grenade35_r1.cubeList.add(new ModelBox(grenade35_r1, 50, 80, -4.0F, -32.5F, 9.8F, 1, 17, 1, 0.0F, true));
		grenade35_r1.cubeList.add(new ModelBox(grenade35_r1, 50, 50, -4.0F, -32.5F, 7.3F, 1, 17, 3, 0.0F, true));

		grenade34_r1 = new ModelRenderer(this);
		grenade34_r1.setRotationPoint(0.495F, 0.0F, -0.205F);
		grenade.addChild(grenade34_r1);
		setRotationAngle(grenade34_r1, 0.0F, 0.7854F, 0.0F);
		grenade34_r1.cubeList.add(new ModelBox(grenade34_r1, 50, 80, -1.0F, -32.5F, 1.8F, 1, 17, 1, 0.0F, true));
		grenade34_r1.cubeList.add(new ModelBox(grenade34_r1, 50, 50, -1.0F, -32.5F, -0.7F, 1, 17, 3, 0.0F, true));

		grenade33_r1 = new ModelRenderer(this);
		grenade33_r1.setRotationPoint(-5.1619F, 0.0F, 12.4619F);
		grenade.addChild(grenade33_r1);
		setRotationAngle(grenade33_r1, -3.1416F, 0.7854F, 3.1416F);
		grenade33_r1.cubeList.add(new ModelBox(grenade33_r1, 50, 80, 0.0F, -32.5F, 9.8F, 1, 17, 1, 0.0F, true));
		grenade33_r1.cubeList.add(new ModelBox(grenade33_r1, 50, 50, 0.0F, -32.5F, 7.3F, 1, 17, 3, 0.0F, true));

		grenade28_r1 = new ModelRenderer(this);
		grenade28_r1.setRotationPoint(-1.1464F, 0.0F, 0.7678F);
		grenade.addChild(grenade28_r1);
		setRotationAngle(grenade28_r1, 0.0F, -0.7854F, 0.0F);
		grenade28_r1.cubeList.add(new ModelBox(grenade28_r1, 0, 50, -1.5F, -37.5F, -1.0F, 6, 1, 6, 0.0F, true));

		grenade26_r1 = new ModelRenderer(this);
		grenade26_r1.setRotationPoint(-2.9293F, 0.0F, 3.0435F);
		grenade.addChild(grenade26_r1);
		setRotationAngle(grenade26_r1, 0.0F, 0.5949F, 0.0F);
		grenade26_r1.cubeList.add(new ModelBox(grenade26_r1, 0, 50, -2.5F, -15.49F, 2.3F, 6, 4, 4, 0.0F, true));
		grenade26_r1.cubeList.add(new ModelBox(grenade26_r1, 0, 50, -2.5F, -36.51F, 2.3F, 6, 4, 4, 0.0F, true));

		grenade25_r1 = new ModelRenderer(this);
		grenade25_r1.setRotationPoint(2.4139F, 0.0F, 4.7247F);
		grenade.addChild(grenade25_r1);
		setRotationAngle(grenade25_r1, 0.0F, -0.5949F, 0.0F);
		grenade25_r1.cubeList.add(new ModelBox(grenade25_r1, 0, 50, -6.5F, -15.5F, 3.3F, 6, 4, 3, 0.0F, true));
		grenade25_r1.cubeList.add(new ModelBox(grenade25_r1, 0, 50, -6.5F, -36.49F, 4.3F, 6, 4, 2, 0.0F, true));

		grenade24_r1 = new ModelRenderer(this);
		grenade24_r1.setRotationPoint(-1.2846F, 0.0F, -3.591F);
		grenade.addChild(grenade24_r1);
		setRotationAngle(grenade24_r1, 0.0F, 0.5949F, 0.0F);
		grenade24_r1.cubeList.add(new ModelBox(grenade24_r1, 0, 50, -6.5F, -15.5F, 0.3F, 6, 4, 3, 0.0F, true));
		grenade24_r1.cubeList.add(new ModelBox(grenade24_r1, 0, 50, -6.5F, -36.49F, 0.3F, 6, 4, 4, 0.0F, true));

		grenade23_r1 = new ModelRenderer(this);
		grenade23_r1.setRotationPoint(0.7693F, 0.0F, -1.9098F);
		grenade.addChild(grenade23_r1);
		setRotationAngle(grenade23_r1, 0.0F, -0.5949F, 0.0F);
		grenade23_r1.cubeList.add(new ModelBox(grenade23_r1, 0, 50, -2.5F, -15.5F, 0.3F, 6, 4, 2, 0.0F, true));
		grenade23_r1.cubeList.add(new ModelBox(grenade23_r1, 0, 50, -2.5F, -36.51F, 0.3F, 6, 4, 2, 0.0F, true));

		grenade14_r1 = new ModelRenderer(this);
		grenade14_r1.setRotationPoint(15.2329F, -2.4037F, 0.0F);
		grenade.addChild(grenade14_r1);
		setRotationAngle(grenade14_r1, 0.0F, 0.0F, -0.3346F);
		grenade14_r1.cubeList.add(new ModelBox(grenade14_r1, 0, 0, -0.5F, -46.3F, 0.7F, 1, 1, 6, 0.0F, true));

		grenade13_r1 = new ModelRenderer(this);
		grenade13_r1.setRotationPoint(-15.399F, -1.4184F, 0.0F);
		grenade.addChild(grenade13_r1);
		setRotationAngle(grenade13_r1, 0.0F, 0.0F, 0.3346F);
		grenade13_r1.cubeList.add(new ModelBox(grenade13_r1, 0, 0, -3.5F, -46.3F, 0.7F, 1, 1, 6, 0.0F, true));

		grenade9_r1 = new ModelRenderer(this);
		grenade9_r1.setRotationPoint(0.0F, -63.3801F, 38.0305F);
		grenade.addChild(grenade9_r1);
		setRotationAngle(grenade9_r1, 1.9705F, 0.0F, 0.0F);
		grenade9_r1.cubeList.add(new ModelBox(grenade9_r1, 0, 0, -3.0F, -44.3F, -2.0F, 3, 1, 1, 0.0F, true));

		grenade7_r1 = new ModelRenderer(this);
		grenade7_r1.setRotationPoint(0.0F, -2.4804F, -15.2872F);
		grenade.addChild(grenade7_r1);
		setRotationAngle(grenade7_r1, -0.3346F, 0.0F, 0.0F);
		grenade7_r1.cubeList.add(new ModelBox(grenade7_r1, 0, 0, -3.0F, -46.5F, -0.3F, 3, 2, 1, 0.0F, true));

		grenade5_r1 = new ModelRenderer(this);
		grenade5_r1.setRotationPoint(0.0F, -11.1518F, -24.7817F);
		grenade.addChild(grenade5_r1);
		setRotationAngle(grenade5_r1, -0.5949F, 0.0F, 0.0F);
		grenade5_r1.cubeList.add(new ModelBox(grenade5_r1, 0, 0, -3.5F, -45.0F, 7.5F, 4, 1, 2, 0.0F, true));
		grenade5_r1.cubeList.add(new ModelBox(grenade5_r1, 0, 0, -3.5F, -44.0F, 7.3F, 4, 1, 4, 0.0F, true));
		grenade5_r1.cubeList.add(new ModelBox(grenade5_r1, 0, 0, -3.5F, -43.0F, 7.8F, 4, 1, 5, 0.0F, true));
		grenade5_r1.cubeList.add(new ModelBox(grenade5_r1, 0, 0, -3.5F, -46.0F, 5.8F, 4, 4, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grenade.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
