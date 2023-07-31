package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class gasgrenade extends ModelBase {
	private final ModelRenderer grenade;
	private final ModelRenderer grenade81_r1;
	private final ModelRenderer grenade78_r1;
	private final ModelRenderer grenade77_r1;
	private final ModelRenderer grenade76_r1;
	private final ModelRenderer grenade75_r1;
	private final ModelRenderer grenade70_r1;
	private final ModelRenderer grenade69_r1;
	private final ModelRenderer grenade66_r1;
	private final ModelRenderer grenade65_r1;
	private final ModelRenderer grenade60_r1;
	private final ModelRenderer grenade59_r1;
	private final ModelRenderer grenade57_r1;
	private final ModelRenderer grenade56_r1;
	private final ModelRenderer grenade52_r1;
	private final ModelRenderer grenade42_r1;
	private final ModelRenderer grenade38_r1;
	private final ModelRenderer grenade34_r1;
	private final ModelRenderer grenade31_r1;
	private final ModelRenderer grenade30_r1;
	private final ModelRenderer grenade20_r1;
	private final ModelRenderer grenade19_r1;
	private final ModelRenderer grenade16_r1;
	private final ModelRenderer grenade15_r1;
	private final ModelRenderer grenade7_r1;
	private final ModelRenderer grenade82_r1;

	public gasgrenade() {
		textureWidth = 512;
		textureHeight = 256;

		grenade = new ModelRenderer(this);
		grenade.setRotationPoint(0.0F, 18.1914F, 26.4233F);
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -5.0F, -34.1914F, -28.4233F, 7, 17, 7, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -4.5F, -34.1914F, -28.9233F, 6, 17, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -3.5F, -33.1914F, -29.9233F, 4, 6, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -3.5F, -25.1914F, -29.9233F, 4, 7, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, 0.5F, -25.1914F, -29.9233F, 2, 2, 6, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 100, 0, -1.5F, -32.1914F, -30.4233F, 3, 4, 2, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 100, 0, 1.65F, -32.1914F, -28.3233F, 2, 4, 6, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -5.5F, -33.1914F, -27.9233F, 1, 15, 6, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -6.0F, -32.1914F, -27.4233F, 1, 2, 5, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -6.0F, -27.1914F, -27.4233F, 1, 1, 5, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -6.0F, -30.1914F, -27.4233F, 1, 3, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -6.0F, -30.1914F, -23.4233F, 1, 3, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -8.0F, -30.1914F, -26.9233F, 3, 5, 2, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 100, 0, -6.0F, -35.1914F, -28.5233F, 2, 3, 2, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 100, 0, -6.0F, -36.1914F, -24.4233F, 2, 3, 2, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 100, 0, -3.55F, -34.7414F, -24.4233F, 1, 1, 2, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, 0.0F, -34.4914F, -27.4233F, 1, 1, 5, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -2.0F, -34.4914F, -27.4233F, 1, 1, 5, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -1.0F, -34.4914F, -27.4233F, 1, 1, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -1.0F, -34.4914F, -23.4233F, 1, 1, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, 1.5F, -25.1914F, -28.4233F, 3, 6, 5, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, 1.5F, -27.1914F, -28.4233F, 3, 2, 3, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, 1.0F, -25.1914F, -29.4233F, 3, 6, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, 1.0F, -27.1914F, -29.2233F, 3, 2, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, 3.8F, -24.1914F, -28.2233F, 1, 4, 3, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, 3.8F, -26.1914F, -28.2233F, 1, 2, 2, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 50, 2.2F, -25.1914F, -23.4233F, 1, 5, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 50, 2.2F, -28.1914F, -26.4233F, 1, 2, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 50, 2.4F, -25.1914F, -23.4233F, 1, 5, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 50, 2.3F, -25.1914F, -23.3233F, 1, 5, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 50, 2.3F, -25.1914F, -23.5233F, 1, 5, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 50, 2.4F, -28.1914F, -26.4233F, 1, 2, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 50, 2.3F, -28.1914F, -26.3233F, 1, 2, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 50, 2.3F, -28.1914F, -26.5233F, 1, 2, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 50, 4.0F, -24.1914F, -27.9233F, 1, 2, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 50, 3.9F, -21.6914F, -27.9233F, 1, 1, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 50, 3.9F, -23.1914F, -26.6233F, 1, 2, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, 1.8F, -20.1914F, -24.9233F, 2, 2, 3, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, 2.3F, -20.1914F, -22.7233F, 1, 2, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, 3.0F, -20.1914F, -23.4233F, 1, 2, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 100, 0, -4.5F, -26.1914F, -31.4233F, 3, 5, 3, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 100, 0, -1.5F, -26.1914F, -30.9233F, 1, 5, 3, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 100, 0, -6.0F, -26.1914F, -29.9233F, 3, 5, 3, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 100, 0, -2.0F, -26.1914F, -31.4233F, 1, 5, 3, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -5.0F, -29.9914F, -22.1233F, 4, 5, 5, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -3.0F, -28.9914F, -22.1233F, 4, 10, 5, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 50, 0.5F, -28.1914F, -24.1233F, 2, 3, 7, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 50, -2.5F, -28.1914F, -18.1233F, 4, 3, 2, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 100, 0, 0.5F, -24.1914F, -21.1233F, 2, 3, 4, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 100, 0, -3.5F, -24.1914F, -18.1233F, 5, 3, 2, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, 0.3F, -25.9914F, -21.8233F, 2, 6, 4, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -4.0F, -29.1914F, -17.9233F, 3, 4, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -4.5F, -30.1914F, -17.4233F, 1, 4, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, -4.5F, -31.1914F, -18.4233F, 1, 1, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, 0.5F, -30.5914F, -19.5733F, 1, 3, 1, 0.0F, true));
		grenade.cubeList.add(new ModelBox(grenade, 0, 0, 0.5F, -28.9914F, -20.2233F, 1, 1, 1, 0.0F, true));

		grenade81_r1 = new ModelRenderer(this);
		grenade81_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		grenade.addChild(grenade81_r1);
		setRotationAngle(grenade81_r1, 0.7854F, 0.0F, 0.0F);
		grenade81_r1.cubeList.add(new ModelBox(grenade81_r1, 0, 0, 0.5F, -34.8F, 6.2F, 1, 1, 1, 0.0F, true));

		grenade78_r1 = new ModelRenderer(this);
		grenade78_r1.setRotationPoint(0.0F, -9.2083F, -52.6774F);
		grenade.addChild(grenade78_r1);
		setRotationAngle(grenade78_r1, -0.7854F, 0.0F, 0.0F);
		grenade78_r1.cubeList.add(new ModelBox(grenade78_r1, 0, 0, 0.5F, -39.2F, 5.0F, 1, 1, 4, 0.0F, true));

		grenade77_r1 = new ModelRenderer(this);
		grenade77_r1.setRotationPoint(0.0F, -55.8899F, -31.9796F);
		grenade.addChild(grenade77_r1);
		setRotationAngle(grenade77_r1, -2.3562F, 0.0F, 0.0F);
		grenade77_r1.cubeList.add(new ModelBox(grenade77_r1, 0, 0, -4.5F, -32.0F, 10.0F, 1, 1, 1, 0.0F, true));

		grenade76_r1 = new ModelRenderer(this);
		grenade76_r1.setRotationPoint(0.0F, -62.7183F, -34.808F);
		grenade.addChild(grenade76_r1);
		setRotationAngle(grenade76_r1, -2.3562F, 0.0F, 0.0F);
		grenade76_r1.cubeList.add(new ModelBox(grenade76_r1, 0, 0, -4.5F, -36.0F, 10.0F, 1, 1, 1, 0.0F, true));

		grenade75_r1 = new ModelRenderer(this);
		grenade75_r1.setRotationPoint(0.0F, -11.3924F, -49.9502F);
		grenade.addChild(grenade75_r1);
		setRotationAngle(grenade75_r1, -0.7854F, 0.0F, 0.0F);
		grenade75_r1.cubeList.add(new ModelBox(grenade75_r1, 0, 0, -4.5F, -37.0F, 9.0F, 1, 1, 1, 0.0F, true));

		grenade70_r1 = new ModelRenderer(this);
		grenade70_r1.setRotationPoint(10.8439F, 5.8086F, -12.3149F);
		grenade.addChild(grenade70_r1);
		setRotationAngle(grenade70_r1, -3.1416F, -0.7854F, 3.1416F);
		grenade70_r1.cubeList.add(new ModelBox(grenade70_r1, 100, 0, 2.5F, -30.0F, 9.3F, 1, 3, 1, 0.0F, true));

		grenade69_r1 = new ModelRenderer(this);
		grenade69_r1.setRotationPoint(-4.7225F, 5.8086F, -7.7794F);
		grenade.addChild(grenade69_r1);
		setRotationAngle(grenade69_r1, -3.1416F, 0.7854F, 3.1416F);
		grenade69_r1.cubeList.add(new ModelBox(grenade69_r1, 100, 0, 1.5F, -30.0F, 10.3F, 1, 3, 1, 0.0F, true));

		grenade66_r1 = new ModelRenderer(this);
		grenade66_r1.setRotationPoint(10.8439F, 5.8086F, -12.3149F);
		grenade.addChild(grenade66_r1);
		setRotationAngle(grenade66_r1, -3.1416F, -0.7854F, 3.1416F);
		grenade66_r1.cubeList.add(new ModelBox(grenade66_r1, 0, 50, 2.5F, -34.0F, 9.3F, 1, 3, 1, 0.0F, true));

		grenade65_r1 = new ModelRenderer(this);
		grenade65_r1.setRotationPoint(-4.7225F, 5.8086F, -7.7794F);
		grenade.addChild(grenade65_r1);
		setRotationAngle(grenade65_r1, -3.1416F, 0.7854F, 3.1416F);
		grenade65_r1.cubeList.add(new ModelBox(grenade65_r1, 0, 50, 1.5F, -34.0F, 10.3F, 1, 3, 1, 0.0F, true));

		grenade60_r1 = new ModelRenderer(this);
		grenade60_r1.setRotationPoint(0.0F, -9.1497F, -52.536F);
		grenade.addChild(grenade60_r1);
		setRotationAngle(grenade60_r1, -0.7854F, 0.0F, 0.0F);
		grenade60_r1.cubeList.add(new ModelBox(grenade60_r1, 0, 0, -2.0F, -39.0F, 5.0F, 3, 6, 6, 0.0F, true));

		grenade59_r1 = new ModelRenderer(this);
		grenade59_r1.setRotationPoint(0.0F, -9.4426F, -53.2431F);
		grenade.addChild(grenade59_r1);
		setRotationAngle(grenade59_r1, -0.7854F, 0.0F, 0.0F);
		grenade59_r1.cubeList.add(new ModelBox(grenade59_r1, 0, 0, -5.0F, -40.0F, 5.0F, 4, 6, 6, 0.0F, true));

		grenade57_r1 = new ModelRenderer(this);
		grenade57_r1.setRotationPoint(0.7175F, 5.8086F, -31.691F);
		grenade.addChild(grenade57_r1);
		setRotationAngle(grenade57_r1, 0.0F, 0.7854F, 0.0F);
		grenade57_r1.cubeList.add(new ModelBox(grenade57_r1, 100, 0, -6.0F, -32.0F, -3.5F, 1, 5, 1, 0.0F, true));

		grenade56_r1 = new ModelRenderer(this);
		grenade56_r1.setRotationPoint(-4.8536F, 5.8086F, -24.7057F);
		grenade.addChild(grenade56_r1);
		setRotationAngle(grenade56_r1, 0.0F, -0.7854F, 0.0F);
		grenade56_r1.cubeList.add(new ModelBox(grenade56_r1, 100, 0, -4.5F, -32.0F, -5.0F, 1, 5, 2, 0.0F, true));

		grenade52_r1 = new ModelRenderer(this);
		grenade52_r1.setRotationPoint(0.0F, -38.9737F, -12.8259F);
		grenade.addChild(grenade52_r1);
		setRotationAngle(grenade52_r1, 2.6769F, 0.0F, 0.0F);
		grenade52_r1.cubeList.add(new ModelBox(grenade52_r1, 0, 0, 1.8F, -24.0F, 1.5F, 2, 1, 3, 0.0F, true));

		grenade42_r1 = new ModelRenderer(this);
		grenade42_r1.setRotationPoint(0.0F, -46.6029F, -45.1126F);
		grenade.addChild(grenade42_r1);
		setRotationAngle(grenade42_r1, -2.1935F, 0.0F, 0.0F);
		grenade42_r1.cubeList.add(new ModelBox(grenade42_r1, 0, 50, 2.3F, -31.0F, 4.1F, 1, 4, 1, 0.0F, true));

		grenade38_r1 = new ModelRenderer(this);
		grenade38_r1.setRotationPoint(0.0F, -46.5217F, -45.271F);
		grenade.addChild(grenade38_r1);
		setRotationAngle(grenade38_r1, -2.1935F, 0.0F, 0.0F);
		grenade38_r1.cubeList.add(new ModelBox(grenade38_r1, 0, 50, 2.4F, -31.0F, 4.0F, 1, 4, 1, 0.0F, true));
		grenade38_r1.cubeList.add(new ModelBox(grenade38_r1, 0, 50, 2.2F, -31.0F, 4.0F, 1, 4, 1, 0.0F, true));

		grenade34_r1 = new ModelRenderer(this);
		grenade34_r1.setRotationPoint(0.0F, -45.967F, -45.8935F);
		grenade.addChild(grenade34_r1);
		setRotationAngle(grenade34_r1, -2.3423F, 0.0F, 0.0F);
		grenade34_r1.cubeList.add(new ModelBox(grenade34_r1, 0, 0, 3.8F, -30.0F, 1.2F, 1, 2, 1, 0.0F, true));

		grenade31_r1 = new ModelRenderer(this);
		grenade31_r1.setRotationPoint(0.0F, -42.0113F, -49.6357F);
		grenade.addChild(grenade31_r1);
		setRotationAngle(grenade31_r1, -2.0448F, 0.0F, 0.0F);
		grenade31_r1.cubeList.add(new ModelBox(grenade31_r1, 0, 0, 1.5F, -31.0F, 3.0F, 3, 2, 1, 0.0F, true));

		grenade30_r1 = new ModelRenderer(this);
		grenade30_r1.setRotationPoint(0.0F, -14.8437F, -56.0424F);
		grenade.addChild(grenade30_r1);
		setRotationAngle(grenade30_r1, -1.1572F, 0.0F, 0.0F);
		grenade30_r1.cubeList.add(new ModelBox(grenade30_r1, 0, 0, 1.5F, -33.0F, 1.0F, 3, 1, 3, 0.0F, true));

		grenade20_r1 = new ModelRenderer(this);
		grenade20_r1.setRotationPoint(-30.163F, -3.3716F, -26.4233F);
		grenade.addChild(grenade20_r1);
		setRotationAngle(grenade20_r1, 0.0F, 0.0F, 0.7854F);
		grenade20_r1.cubeList.add(new ModelBox(grenade20_r1, 100, 0, -4.0F, -41.0F, -2.1F, 2, 2, 2, 0.0F, true));

		grenade19_r1 = new ModelRenderer(this);
		grenade19_r1.setRotationPoint(-30.8701F, -3.6645F, -26.4233F);
		grenade.addChild(grenade19_r1);
		setRotationAngle(grenade19_r1, 0.0F, 0.0F, 0.7854F);
		grenade19_r1.cubeList.add(new ModelBox(grenade19_r1, 100, 0, -4.0F, -42.0F, 2.0F, 2, 2, 2, 0.0F, true));

		grenade16_r1 = new ModelRenderer(this);
		grenade16_r1.setRotationPoint(19.5772F, -8.9279F, -26.4233F);
		grenade.addChild(grenade16_r1);
		setRotationAngle(grenade16_r1, 0.0F, 0.0F, -0.7854F);
		grenade16_r1.cubeList.add(new ModelBox(grenade16_r1, 0, 0, -8.0F, -31.0F, -0.5F, 2, 4, 2, 0.0F, true));

		grenade15_r1 = new ModelRenderer(this);
		grenade15_r1.setRotationPoint(23.8271F, -11.5625F, -26.4233F);
		grenade.addChild(grenade15_r1);
		setRotationAngle(grenade15_r1, 0.0F, 0.0F, -0.8226F);
		grenade15_r1.cubeList.add(new ModelBox(grenade15_r1, 0, 0, -8.0F, -36.0F, -0.5F, 4, 2, 2, 0.0F, true));

		grenade7_r1 = new ModelRenderer(this);
		grenade7_r1.setRotationPoint(-2.3891F, 5.8086F, -28.6555F);
		grenade.addChild(grenade7_r1);
		setRotationAngle(grenade7_r1, 0.0F, -0.7854F, 0.0F);
		grenade7_r1.cubeList.add(new ModelBox(grenade7_r1, 100, 0, 1.5F, -38.0F, -4.0F, 3, 4, 2, 0.0F, true));

		grenade82_r1 = new ModelRenderer(this);
		grenade82_r1.setRotationPoint(25.1127F, -9.564F, -26.4233F);
		grenade.addChild(grenade82_r1);
		setRotationAngle(grenade82_r1, 0.0F, 0.0F, -0.7854F);
		grenade82_r1.cubeList.add(new ModelBox(grenade82_r1, 100, 0, -6.0F, -38.0F, -2.1F, 2, 3, 2, 0.0F, true));
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