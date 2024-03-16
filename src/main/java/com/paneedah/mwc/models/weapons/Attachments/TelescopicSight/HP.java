package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HP extends ModelBase {
	private final ModelRenderer sight;
	private final ModelRenderer gun499_r1;
	private final ModelRenderer gun377_r1;
	private final ModelRenderer gun3666_r1;
	private final ModelRenderer gun311_r1;
	private final ModelRenderer gun422_r1;
	private final ModelRenderer gun366_r1;
	private final ModelRenderer gun92_r1;
	private final ModelRenderer gun90_r1;
	private final ModelRenderer gun89_r1;
	private final ModelRenderer gun87_r1;
	private final ModelRenderer gun86_r1;
	private final ModelRenderer gun84_r1;
	private final ModelRenderer gun83_r1;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun38_r1;
	private final ModelRenderer gun35_r1;
	private final ModelRenderer gun34_r1;
	private final ModelRenderer gun33_r1;
	private final ModelRenderer gun32_r1;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer gun25_r1;
	private final ModelRenderer gun24_r1;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun22_r1;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun20_r1;
	private final ModelRenderer gun19_r1;
	private final ModelRenderer gun500_r1;
	private final ModelRenderer sight20_r1;
	private final ModelRenderer sight19_r1;
	private final ModelRenderer sight18_r1;
	private final ModelRenderer sight17_r1;
	private final ModelRenderer sight16_r1;
	private final ModelRenderer sight15_r1;

	public HP() {
		textureWidth = 256;
		textureHeight = 128;

		sight = new ModelRenderer(this);
		sight.setRotationPoint(0.0F, 24.0F, 0.0F);
		sight.cubeList.add(new ModelBox(sight, 0, 0, 3.5F, -23.0F, -4.0F, 1, 1, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 3.5F, -23.0F, -12.0F, 1, 1, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 2.0F, -23.5F, -12.0F, 2, 1, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -30.3F, -16.1F, 3, 1, 7, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 4.5F, -29.3F, -16.1F, 1, 3, 7, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 4.8F, -28.8F, -16.1F, 1, 2, 12, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 5.0F, -29.3F, -12.1F, 1, 3, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -30.8F, -12.1F, 3, 1, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -25.8F, -12.1F, 3, 1, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 0.0F, -29.3F, -12.1F, 1, 3, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -25.3F, -4.1F, 3, 2, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 2.0F, -23.5F, -4.0F, 2, 1, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -31.3F, 4.9F, 3, 1, 10, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 5.5F, -29.3F, 4.9F, 1, 3, 10, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -25.4F, 4.9F, 3, 1, 10, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, -0.5F, -29.3F, 4.9F, 1, 3, 10, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, -1.0F, -28.8F, 4.9F, 1, 2, 10, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 6.0F, -28.8F, 4.9F, 1, 2, 10, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -23.0F, -12.0F, 1, 1, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -25.3F, -12.1F, 3, 2, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -26.3F, -16.1F, 3, 1, 15, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 4.5F, -29.3F, -10.1F, 1, 3, 9, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -30.3F, -10.1F, 3, 1, 9, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 0.5F, -29.3F, -16.1F, 1, 3, 15, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 2.0F, -25.9F, -16.1F, 2, 1, 15, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 4.8F, -28.8F, -10.1F, 1, 2, 9, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 0.1F, -28.8F, -16.1F, 1, 2, 15, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -25.4F, -27.1F, 3, 1, 8, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 5.5F, -29.3F, -27.1F, 1, 3, 8, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, -0.5F, -29.3F, -27.1F, 1, 3, 8, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 6.0F, -28.8F, -27.1F, 1, 2, 8, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, -1.0F, -28.8F, -27.1F, 1, 2, 8, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -31.3F, -27.1F, 3, 1, 8, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 5.0F, -29.3F, -8.1F, 1, 3, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -25.8F, -8.1F, 3, 1, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -30.8F, -8.1F, 3, 1, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 0.0F, -29.3F, -8.1F, 1, 3, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 2.0F, -32.8F, -8.1F, 2, 2, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 6.0F, -28.7F, -8.1F, 2, 2, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, -2.0F, -28.7F, -8.1F, 2, 2, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 5.0F, -29.3F, -4.1F, 1, 3, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -30.8F, -4.1F, 3, 1, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 0.0F, -29.3F, -4.1F, 1, 3, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -25.8F, -4.1F, 3, 1, 2, 0.0F, true));
		sight.cubeList.add(new ModelBox(sight, 0, 0, 1.5F, -23.0F, -4.0F, 1, 1, 2, 0.0F, true));

		gun499_r1 = new ModelRenderer(this);
		gun499_r1.setRotationPoint(-8.861F, 0.0F, -31.8373F);
		sight.addChild(gun499_r1);
		setRotationAngle(gun499_r1, -3.1416F, -1.2455F, 3.1416F);
		gun499_r1.cubeList.add(new ModelBox(gun499_r1, 0, 0, 7.0F, -28.8F, -19.1F, 4, 2, 1, 0.0F, true));

		gun377_r1 = new ModelRenderer(this);
		gun377_r1.setRotationPoint(5.5755F, 0.0F, -0.9852F);
		sight.addChild(gun377_r1);
		setRotationAngle(gun377_r1, 0.0F, 0.2974F, 0.0F);
		gun377_r1.cubeList.add(new ModelBox(gun377_r1, 0, 0, -0.5F, -29.3F, -19.1F, 1, 3, 4, 0.0F, true));

		gun3666_r1 = new ModelRenderer(this);
		gun3666_r1.setRotationPoint(-9.9655F, 0.0F, -30.7596F);
		sight.addChild(gun3666_r1);
		setRotationAngle(gun3666_r1, -3.1416F, -1.2827F, 3.1416F);
		gun3666_r1.cubeList.add(new ModelBox(gun3666_r1, 0, 0, 6.5F, -29.3F, -19.1F, 4, 3, 1, 0.0F, true));

		gun311_r1 = new ModelRenderer(this);
		gun311_r1.setRotationPoint(0.0F, -47.4896F, 1.565F);
		sight.addChild(gun311_r1);
		setRotationAngle(gun311_r1, 1.7474F, 0.0F, 0.0F);
		gun311_r1.cubeList.add(new ModelBox(gun311_r1, 0, 0, 1.5F, -24.4F, -19.1F, 3, 4, 1, 0.0F, true));

		gun422_r1 = new ModelRenderer(this);
		gun422_r1.setRotationPoint(0.0F, 3.8608F, -8.6974F);
		sight.addChild(gun422_r1);
		setRotationAngle(gun422_r1, -0.2602F, 0.0F, 0.0F);
		gun422_r1.cubeList.add(new ModelBox(gun422_r1, 0, 0, 1.5F, -31.3F, -19.1F, 3, 1, 4, 0.0F, true));

		gun366_r1 = new ModelRenderer(this);
		gun366_r1.setRotationPoint(-8.0642F, -55.5417F, 0.0F);
		sight.addChild(gun366_r1);
		setRotationAngle(gun366_r1, 0.0F, 0.0F, 2.4166F);
		gun366_r1.cubeList.add(new ModelBox(gun366_r1, 0, 0, 6.5F, -29.3F, -27.1F, 1, 1, 8, 0.0F, true));
		gun366_r1.cubeList.add(new ModelBox(gun366_r1, 0, 0, 6.5F, -29.3F, 4.9F, 1, 1, 10, 0.0F, true));

		gun92_r1 = new ModelRenderer(this);
		gun92_r1.setRotationPoint(19.7091F, -41.7032F, 0.0F);
		sight.addChild(gun92_r1);
		setRotationAngle(gun92_r1, 0.0F, 0.0F, -2.3794F);
		gun92_r1.cubeList.add(new ModelBox(gun92_r1, 0, 0, 1.5F, -24.8F, -4.1F, 2, 1, 2, 0.0F, true));
		gun92_r1.cubeList.add(new ModelBox(gun92_r1, 0, 0, 1.5F, -24.8F, -8.1F, 2, 1, 2, 0.0F, true));
		gun92_r1.cubeList.add(new ModelBox(gun92_r1, 0, 0, 1.5F, -24.8F, -12.1F, 2, 1, 2, 0.0F, true));

		gun90_r1 = new ModelRenderer(this);
		gun90_r1.setRotationPoint(19.8338F, -7.7336F, 0.0F);
		sight.addChild(gun90_r1);
		setRotationAngle(gun90_r1, 0.0F, 0.0F, -0.7436F);
		gun90_r1.cubeList.add(new ModelBox(gun90_r1, 0, 0, 0.0F, -29.3F, -4.1F, 2, 1, 2, 0.0F, true));
		gun90_r1.cubeList.add(new ModelBox(gun90_r1, 0, 0, 0.0F, -29.3F, -8.1F, 2, 1, 2, 0.0F, true));
		gun90_r1.cubeList.add(new ModelBox(gun90_r1, 0, 0, 0.0F, -29.3F, -12.1F, 2, 1, 2, 0.0F, true));

		gun89_r1 = new ModelRenderer(this);
		gun89_r1.setRotationPoint(-21.243F, -9.9759F, 0.0F);
		sight.addChild(gun89_r1);
		setRotationAngle(gun89_r1, 0.0F, 0.0F, 0.7808F);
		gun89_r1.cubeList.add(new ModelBox(gun89_r1, 0, 0, 1.5F, -30.8F, -4.1F, 1, 1, 2, 0.0F, true));
		gun89_r1.cubeList.add(new ModelBox(gun89_r1, 0, 0, 1.5F, -30.8F, -8.1F, 1, 1, 2, 0.0F, true));
		gun89_r1.cubeList.add(new ModelBox(gun89_r1, 0, 0, 1.5F, -30.8F, -12.1F, 1, 1, 2, 0.0F, true));

		gun87_r1 = new ModelRenderer(this);
		gun87_r1.setRotationPoint(-7.8197F, -49.4669F, 0.0F);
		sight.addChild(gun87_r1);
		setRotationAngle(gun87_r1, 0.0F, 0.0F, 2.3794F);
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 0, 0, 6.0F, -26.3F, -4.1F, 1, 1, 2, 0.0F, true));
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 0, 0, 6.0F, -26.3F, -8.1F, 1, 1, 2, 0.0F, true));
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 0, 0, 6.0F, -26.3F, -12.1F, 1, 1, 2, 0.0F, true));

		gun86_r1 = new ModelRenderer(this);
		gun86_r1.setRotationPoint(25.4163F, -38.864F, 0.0F);
		sight.addChild(gun86_r1);
		setRotationAngle(gun86_r1, 0.0F, 0.0F, -2.3423F);
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 0, 0, 4.5F, -24.8F, -4.1F, 1, 2, 2, 0.0F, true));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 0, 0, 4.5F, -24.8F, -8.1F, 1, 2, 2, 0.0F, true));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 0, 0, 4.5F, -24.8F, -12.1F, 1, 2, 2, 0.0F, true));

		gun84_r1 = new ModelRenderer(this);
		gun84_r1.setRotationPoint(-10.822F, -54.0287F, 0.0F);
		sight.addChild(gun84_r1);
		setRotationAngle(gun84_r1, 0.0F, 0.0F, 2.3423F);
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 0, 0, 6.0F, -29.3F, -4.1F, 1, 2, 2, 0.0F, true));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 0, 0, 6.0F, -29.3F, -8.1F, 1, 2, 2, 0.0F, true));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 0, 0, 6.0F, -29.3F, -12.1F, 1, 2, 2, 0.0F, true));

		gun83_r1 = new ModelRenderer(this);
		gun83_r1.setRotationPoint(-20.3742F, -12.0873F, 0.0F);
		sight.addChild(gun83_r1);
		setRotationAngle(gun83_r1, 0.0F, 0.0F, 0.7808F);
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 0, 0, 4.5F, -30.8F, -4.1F, 1, 1, 2, 0.0F, true));
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 0, 0, 4.5F, -30.8F, -8.1F, 1, 1, 2, 0.0F, true));
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 0, 0, 4.5F, -30.8F, -12.1F, 1, 1, 2, 0.0F, true));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(-21.5949F, -10.1207F, 0.0F);
		sight.addChild(gun40_r1);
		setRotationAngle(gun40_r1, 0.0F, 0.0F, 0.7808F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 0, 0, 1.5F, -31.3F, -27.1F, 1, 1, 8, 0.0F, true));
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 0, 0, 1.5F, -31.3F, 4.9F, 1, 1, 10, 0.0F, true));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(-11.2521F, -55.047F, 0.0F);
		sight.addChild(gun39_r1);
		setRotationAngle(gun39_r1, 0.0F, 0.0F, 2.3423F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 0, 0, 6.0F, -29.9F, -27.1F, 1, 2, 8, 0.0F, true));
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 0, 0, 6.0F, -29.9F, 4.9F, 1, 2, 10, 0.0F, true));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(20.4769F, -8.8376F, 0.0F);
		sight.addChild(gun38_r1);
		setRotationAngle(gun38_r1, 0.0F, 0.0F, -0.7808F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 0, 0, -0.5F, -29.3F, -27.1F, 2, 1, 8, 0.0F, true));
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 0, 0, -0.5F, -29.3F, 4.9F, 2, 1, 10, 0.0F, true));

		gun35_r1 = new ModelRenderer(this);
		gun35_r1.setRotationPoint(-6.9581F, -49.8121F, 0.0F);
		sight.addChild(gun35_r1);
		setRotationAngle(gun35_r1, 0.0F, 0.0F, 2.3794F);
		gun35_r1.cubeList.add(new ModelBox(gun35_r1, 0, 0, 6.5F, -26.3F, -27.1F, 1, 1, 8, 0.0F, true));
		gun35_r1.cubeList.add(new ModelBox(gun35_r1, 0, 0, 6.5F, -26.3F, 4.9F, 1, 1, 10, 0.0F, true));

		gun34_r1 = new ModelRenderer(this);
		gun34_r1.setRotationPoint(17.6711F, -7.2802F, 0.0F);
		sight.addChild(gun34_r1);
		setRotationAngle(gun34_r1, 0.0F, 0.0F, -0.7436F);
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 0, 0, -0.5F, -26.3F, -27.1F, 1, 1, 8, 0.0F, true));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 0, 0, -0.5F, -26.3F, 4.9F, 1, 1, 10, 0.0F, true));

		gun33_r1 = new ModelRenderer(this);
		gun33_r1.setRotationPoint(19.4329F, -41.0139F, 0.0F);
		sight.addChild(gun33_r1);
		setRotationAngle(gun33_r1, 0.0F, 0.0F, -2.3794F);
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 0, 0, 1.5F, -24.4F, -27.1F, 2, 1, 8, 0.0F, true));
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 0, 0, 1.5F, -24.4F, 4.9F, 2, 1, 10, 0.0F, true));

		gun32_r1 = new ModelRenderer(this);
		gun32_r1.setRotationPoint(25.1296F, -38.1851F, 0.0F);
		sight.addChild(gun32_r1);
		setRotationAngle(gun32_r1, 0.0F, 0.0F, -2.3423F);
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 0, 0, 4.5F, -24.4F, -27.1F, 1, 2, 8, 0.0F, true));
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 0, 0, 4.5F, -24.4F, 4.9F, 1, 2, 10, 0.0F, true));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(25.7748F, -39.7126F, 0.0F);
		sight.addChild(gun26_r1);
		setRotationAngle(gun26_r1, 0.0F, 0.0F, -2.3423F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 0, 0, 4.5F, -25.3F, -19.1F, 1, 1, 24, 0.0F, true));

		gun25_r1 = new ModelRenderer(this);
		gun25_r1.setRotationPoint(20.0543F, -42.5649F, 0.0F);
		sight.addChild(gun25_r1);
		setRotationAngle(gun25_r1, 0.0F, 0.0F, -2.3794F);
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 0, 0, 1.5F, -25.3F, -19.1F, 1, 1, 24, 0.0F, true));

		gun24_r1 = new ModelRenderer(this);
		gun24_r1.setRotationPoint(-20.8911F, -9.831F, 0.0F);
		sight.addChild(gun24_r1);
		setRotationAngle(gun24_r1, 0.0F, 0.0F, 0.7808F);
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 0, 0, 1.5F, -30.3F, -19.1F, 1, 1, 24, 0.0F, true));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(-20.0223F, -11.9425F, 0.0F);
		sight.addChild(gun23_r1);
		setRotationAngle(gun23_r1, 0.0F, 0.0F, 0.7808F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 0, 0, 4.5F, -30.3F, -10.1F, 1, 1, 15, 0.0F, true));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 0, 0, 4.5F, -30.3F, -19.1F, 1, 1, 10, 0.0F, true));

		gun22_r1 = new ModelRenderer(this);
		gun22_r1.setRotationPoint(17.935F, -6.6033F, 0.0F);
		sight.addChild(gun22_r1);
		setRotationAngle(gun22_r1, 0.0F, 0.0F, -0.7436F);
		gun22_r1.cubeList.add(new ModelBox(gun22_r1, 0, 0, 0.5F, -26.3F, -19.1F, 1, 1, 24, 0.0F, true));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(-8.6814F, -49.1217F, 0.0F);
		sight.addChild(gun21_r1);
		setRotationAngle(gun21_r1, 0.0F, 0.0F, 2.3794F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 0, 0, 5.5F, -26.3F, -19.1F, 1, 1, 24, 0.0F, true));

		gun20_r1 = new ModelRenderer(this);
		gun20_r1.setRotationPoint(-11.6706F, -53.6703F, 0.0F);
		sight.addChild(gun20_r1);
		setRotationAngle(gun20_r1, 0.0F, 0.0F, 2.3423F);
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 0, 0, 5.5F, -29.3F, -10.1F, 1, 1, 15, 0.0F, true));
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 0, 0, 5.5F, -29.3F, -19.1F, 1, 1, 10, 0.0F, true));

		gun19_r1 = new ModelRenderer(this);
		gun19_r1.setRotationPoint(19.9658F, -7.3951F, 0.0F);
		sight.addChild(gun19_r1);
		setRotationAngle(gun19_r1, 0.0F, 0.0F, -0.7436F);
		gun19_r1.cubeList.add(new ModelBox(gun19_r1, 0, 0, 0.5F, -29.3F, -19.1F, 1, 1, 24, 0.0F, true));

		gun500_r1 = new ModelRenderer(this);
		gun500_r1.setRotationPoint(5.5536F, 0.0F, -1.1317F);
		sight.addChild(gun500_r1);
		setRotationAngle(gun500_r1, 0.0F, 0.2974F, 0.0F);
		gun500_r1.cubeList.add(new ModelBox(gun500_r1, 0, 0, -1.0F, -28.8F, -19.1F, 1, 2, 4, 0.0F, true));

		sight20_r1 = new ModelRenderer(this);
		sight20_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		sight.addChild(sight20_r1);
		setRotationAngle(sight20_r1, 0.0F, 1.4128F, 0.0F);
		sight20_r1.cubeList.add(new ModelBox(sight20_r1, 0, 0, -1.0F, -28.8F, 4.9F, 7, 2, 1, 0.0F, true));

		sight19_r1 = new ModelRenderer(this);
		sight19_r1.setRotationPoint(14.7182F, 0.0F, 8.5659F);
		sight.addChild(sight19_r1);
		setRotationAngle(sight19_r1, -3.1416F, -0.1673F, 3.1416F);
		sight19_r1.cubeList.add(new ModelBox(sight19_r1, 0, 0, 7.0F, -28.8F, 4.9F, 1, 2, 7, 0.0F, true));

		sight18_r1 = new ModelRenderer(this);
		sight18_r1.setRotationPoint(-5.304F, 0.0F, 3.813F);
		sight.addChild(sight18_r1);
		setRotationAngle(sight18_r1, 0.0F, 1.45F, 0.0F);
		sight18_r1.cubeList.add(new ModelBox(sight18_r1, 0, 0, -0.5F, -29.3F, 4.9F, 7, 3, 1, 0.0F, true));

		sight17_r1 = new ModelRenderer(this);
		sight17_r1.setRotationPoint(13.5809F, 0.0F, 8.9151F);
		sight.addChild(sight17_r1);
		setRotationAngle(sight17_r1, -3.1416F, -0.1301F, 3.1416F);
		sight17_r1.cubeList.add(new ModelBox(sight17_r1, 0, 0, 6.5F, -29.3F, 4.9F, 1, 3, 7, 0.0F, true));

		sight16_r1 = new ModelRenderer(this);
		sight16_r1.setRotationPoint(0.0F, -48.4889F, 11.1524F);
		sight.addChild(sight16_r1);
		setRotationAngle(sight16_r1, 3.0858F, 0.0F, 0.0F);
		sight16_r1.cubeList.add(new ModelBox(sight16_r1, 0, 0, 1.5F, -24.4F, 4.9F, 3, 1, 8, 0.0F, true));

		sight15_r1 = new ModelRenderer(this);
		sight15_r1.setRotationPoint(0.0F, -32.3915F, -26.7624F);
		sight.addChild(sight15_r1);
		setRotationAngle(sight15_r1, -1.45F, 0.0F, 0.0F);
		sight15_r1.cubeList.add(new ModelBox(sight15_r1, 0, 0, 1.5F, -31.3F, 4.9F, 3, 7, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sight.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
