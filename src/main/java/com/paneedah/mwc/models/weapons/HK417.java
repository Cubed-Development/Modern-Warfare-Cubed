package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK417 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun22_r1;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun30_r1;
	private final ModelRenderer gun29_r1;
	private final ModelRenderer gun29_r2;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun48_r1;
	private final ModelRenderer gun47_r1;
	private final ModelRenderer gun52_r1;
	private final ModelRenderer gun50_r1;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun66_r1;
	private final ModelRenderer gun82_r1;
	private final ModelRenderer gun119_r1;
	private final ModelRenderer gun116_r1;
	private final ModelRenderer gun117_r1;
	private final ModelRenderer gun116_r2;
	private final ModelRenderer gun115_r1;
	private final ModelRenderer gun118_r1;
	private final ModelRenderer gun117_r2;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun262_r1;
	private final ModelRenderer gun132;
	private final ModelRenderer gun67;
	private final ModelRenderer gun60;

	public HK417() {
		textureWidth = 220;
		textureHeight = 220;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 45, 18, -1.8F, -37.2F, -66.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 26, -2.2F, -37.2F, -66.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 45, -2.2F, -37.6F, -66.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 53, -1.8F, -37.6F, -66.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 29, -1.6F, -37.4F, -66.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 56, -2.4F, -37.4F, -66.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 15, 88, -2.0F, -37.0F, -66.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 50, 89, -2.0F, -37.8F, -66.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -2.2F, -37.4F, -62.5F, 1, 1, 43, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 44, -1.8F, -37.4F, -62.5F, 1, 1, 43, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 1, -2.0F, -37.2F, -62.5F, 1, 1, 43, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 45, -2.0F, -37.6F, -62.5F, 1, 1, 43, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 54, 22, -0.5F, -33.7F, -5.5F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 74, 29, -0.15F, -36.2F, -12.75F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 75, 71, -0.3F, -35.3F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 75, 73, -0.3F, -35.3F, -12.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 63, -2.5F, -39.0F, 1.001F, 2, 4, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 49, -3.9F, -37.6F, 1.002F, 2, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 45, -1.1F, -37.6F, 1.002F, 2, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 39, 76, -3.7F, -33.6F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 64, -3.8F, -32.2F, -12.4F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 54, 29, -3.8F, -32.2F, -13.7F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 36, -3.8F, -34.2F, -14.7F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 64, 0, -3.8F, -35.0F, -21.4F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 36, -3.0F, -34.05F, -1.0F, 3, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 80, -3.0F, -31.7F, -4.0F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 36, -3.3F, -35.7F, -1.0F, 3, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 75, 64, -0.7F, -35.7F, -1.0F, 1, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 72, -3.5F, -35.4F, -24.5F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 0, -3.5F, -35.7F, -13.2F, 4, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 63, -3.5F, -35.7F, -23.2F, 4, 8, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 52, -3.0F, -35.7F, -24.501F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 75, 71, -0.349F, -32.85F, -17.25F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 36, -0.85F, -33.45F, -17.5F, 2, 1, 6, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 75, 25, -0.849F, -33.45F, -13.2F, 2, 1, 2, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 10, -0.85F, -32.25F, -17.5F, 2, 1, 6, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 34, 68, -0.849F, -32.25F, -13.2F, 2, 1, 2, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 49, -0.85F, -33.35F, -17.7F, 2, 2, 1, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 93, 97, -0.85F, -33.35F, -13.0F, 2, 2, 2, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 103, 98, -0.15F, -35.05F, -22.8F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 36, -3.5F, -27.7F, -19.2F, 4, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 62, -3.3F, -35.7F, -14.0F, 3, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 68, -0.7F, -35.7F, -14.0F, 1, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 93, 89, -3.0F, -31.7F, -13.8F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 70, -3.0F, -26.7F, -13.5F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 8, -3.001F, -26.7F, -7.6F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 14, -2.501F, -25.95F, -10.0F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 40, -2.502F, -25.951F, -10.2F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 95, -3.0F, -30.7F, -6.5F, 3, 5, 1, 0.0F, false));

		gun22_r1 = new ModelRenderer(this);
		gun22_r1.setRotationPoint(-0.5F, -26.65F, -11.65F);
		gun.addChild(gun22_r1);
		setRotationAngle(gun22_r1, 1.1781F, 0.0F, 0.0F);
		gun22_r1.cubeList.add(new ModelBox(gun22_r1, 30, 13, -2.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(-0.5F, -26.65F, -7.55F);
		gun.addChild(gun21_r1);
		setRotationAngle(gun21_r1, -1.1781F, 0.0F, 0.0F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 0, 31, -2.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-3.2F, -30.7F, -7.6F);
		gun.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 75, 52, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-3.2F, -26.7F, -7.6F);
		gun.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.3562F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 32, 52, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun29_r2 = new ModelRenderer(this);
		gun29_r2.setRotationPoint(-3.2F, -30.7F, -11.5F);
		gun.addChild(gun29_r2);
		setRotationAngle(gun29_r2, -2.3562F, 0.0F, 0.0F);
		gun29_r2.cubeList.add(new ModelBox(gun29_r2, 64, 6, 0.2F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -26.7F, -11.5F);
		gun.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 90, 39, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun48_r1 = new ModelRenderer(this);
		gun48_r1.setRotationPoint(0.85F, -34.05F, -22.8F);
		gun.addChild(gun48_r1);
		setRotationAngle(gun48_r1, 0.0F, 0.0F, 0.7854F);
		gun48_r1.cubeList.add(new ModelBox(gun48_r1, 103, 33, -1.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun47_r1 = new ModelRenderer(this);
		gun47_r1.setRotationPoint(0.85F, -35.05F, -22.8F);
		gun.addChild(gun47_r1);
		setRotationAngle(gun47_r1, 0.0F, 0.0F, 0.7854F);
		gun47_r1.cubeList.add(new ModelBox(gun47_r1, 103, 89, -1.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun52_r1 = new ModelRenderer(this);
		gun52_r1.setRotationPoint(1.05F, -33.05F, -12.3F);
		gun.addChild(gun52_r1);
		setRotationAngle(gun52_r1, -0.4363F, 0.0F, 0.0F);
		gun52_r1.cubeList.add(new ModelBox(gun52_r1, 75, 45, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun50_r1 = new ModelRenderer(this);
		gun50_r1.setRotationPoint(-3.9F, -27.2F, -23.2F);
		gun.addChild(gun50_r1);
		setRotationAngle(gun50_r1, 1.4192F, 0.0F, 0.0F);
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 19, 0, 0.1F, -0.1194F, 0.0981F, 4, 10, 1, 0.0F, false));
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 63, 53, 0.101F, -0.5F, 0.0981F, 4, 1, 1, 0.0F, false));
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 36, 75, 3.701F, -0.5F, 0.0981F, 1, 1, 1, 0.0F, false));
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 8, 88, 3.7F, -0.1194F, 0.0981F, 1, 10, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-3.5F, -31.7F, -11.2F);
		gun.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.7884F, 0.0F, 0.0F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 75, 98, 2.999F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-3.5F, -34.2F, -24.5F);
		gun.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.9082F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 63, 25, 0.0F, -0.123F, 0.1577F, 4, 2, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -29.9F, -8.95F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 0, 44, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun66_r1 = new ModelRenderer(this);
		gun66_r1.setRotationPoint(-0.7F, -33.7F, 1.8F);
		gun.addChild(gun66_r1);
		setRotationAngle(gun66_r1, -2.3423F, 0.0F, 0.0F);
		gun66_r1.cubeList.add(new ModelBox(gun66_r1, 85, 89, -0.01F, 0.0638F, -1.4959F, 1, 2, 6, 0.0F, false));

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(-3.8F, -34.0F, -14.7F);
		gun.addChild(gun82_r1);
		setRotationAngle(gun82_r1, 0.0F, 0.7436F, 0.0F);
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 45, 0, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun119_r1 = new ModelRenderer(this);
		gun119_r1.setRotationPoint(2.3F, -37.5F, 3.102F);
		gun.addChild(gun119_r1);
		setRotationAngle(gun119_r1, 0.0F, 0.0F, 0.2094F);
		gun119_r1.cubeList.add(new ModelBox(gun119_r1, 54, 49, -2.0F, 3.0F, 0.0F, 2, 1, 1, -0.3F, false));
		gun119_r1.cubeList.add(new ModelBox(gun119_r1, 54, 53, -2.0F, 0.0F, 0.0F, 2, 1, 1, -0.3F, false));
		gun119_r1.cubeList.add(new ModelBox(gun119_r1, 38, 13, -0.999F, -0.001F, -0.001F, 1, 4, 1, -0.3F, false));

		gun116_r1 = new ModelRenderer(this);
		gun116_r1.setRotationPoint(-3.9F, -36.6F, 1.002F);
		gun.addChild(gun116_r1);
		setRotationAngle(gun116_r1, 0.0F, 0.0F, -0.2618F);
		gun116_r1.cubeList.add(new ModelBox(gun116_r1, 64, 0, 0.0F, 0.0F, -0.003F, 2, 3, 3, 0.0F, false));

		gun117_r1 = new ModelRenderer(this);
		gun117_r1.setRotationPoint(-3.9F, -36.6F, 1.002F);
		gun.addChild(gun117_r1);
		setRotationAngle(gun117_r1, -0.6283F, 0.0F, -0.2618F);
		gun117_r1.cubeList.add(new ModelBox(gun117_r1, 15, 96, 0.001F, 0.0F, -0.003F, 2, 3, 2, 0.0F, false));

		gun116_r2 = new ModelRenderer(this);
		gun116_r2.setRotationPoint(0.9F, -36.6F, 1.002F);
		gun.addChild(gun116_r2);
		setRotationAngle(gun116_r2, -0.6283F, 0.0F, 0.2618F);
		gun116_r2.cubeList.add(new ModelBox(gun116_r2, 23, 96, -1.999F, 0.0F, -0.003F, 2, 3, 2, 0.0F, false));

		gun115_r1 = new ModelRenderer(this);
		gun115_r1.setRotationPoint(0.9F, -36.6F, 1.002F);
		gun.addChild(gun115_r1);
		setRotationAngle(gun115_r1, 0.0F, 0.0F, 0.2618F);
		gun115_r1.cubeList.add(new ModelBox(gun115_r1, 14, 80, -2.0F, 0.0F, -0.003F, 2, 3, 3, 0.0F, false));

		gun118_r1 = new ModelRenderer(this);
		gun118_r1.setRotationPoint(-3.9F, -37.6F, 1.0F);
		gun.addChild(gun118_r1);
		setRotationAngle(gun118_r1, 0.0F, 0.0F, -2.3562F);
		gun118_r1.cubeList.add(new ModelBox(gun118_r1, 75, 93, -1.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

		gun117_r2 = new ModelRenderer(this);
		gun117_r2.setRotationPoint(0.9F, -37.6F, 1.0F);
		gun.addChild(gun117_r2);
		setRotationAngle(gun117_r2, 0.0F, 0.0F, 2.3562F);
		gun117_r2.cubeList.add(new ModelBox(gun117_r2, 40, 97, 0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.6F, -33.2F, -6.3F);
		gun.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 75, 47, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun262_r1 = new ModelRenderer(this);
		gun262_r1.setRotationPoint(-4.3F, -36.2F, -21.0F);
		gun.addChild(gun262_r1);
		setRotationAngle(gun262_r1, 0.0F, 0.0F, -1.2641F);
		gun262_r1.cubeList.add(new ModelBox(gun262_r1, 72, 37, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-0.15F, -36.2F, -12.8F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -1.2641F);
		gun132.cubeList.add(new ModelBox(gun132, 55, 12, -0.9231F, 0.3973F, -0.25F, 2, 1, 1, -0.2F, false));
		gun132.cubeList.add(new ModelBox(gun132, 55, 10, -0.9231F, 0.3973F, 0.35F, 2, 1, 1, -0.2F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -33.5F, 1.5F);
		gun.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 0, 54, 0.01F, -0.1454F, -1.2808F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 64, 11, 0.299F, -0.8715F, -0.9123F, 3, 2, 4, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		gun.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		gun60.cubeList.add(new ModelBox(gun60, 39, 78, 0.0F, 0.8697F, -1.6043F, 1, 1, 1, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 36, 77, -3.2F, 0.8697F, -1.6043F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
