package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Saiga12Mag extends ModelWithAttachments {
	private final ModelRenderer mag;
	private final ModelRenderer Mag25_r1;
	private final ModelRenderer Mag24_r1;
	private final ModelRenderer Mag23_r1;
	private final ModelRenderer Mag22_r1;
	private final ModelRenderer Mag21_r1;
	private final ModelRenderer Mag20_r1;
	private final ModelRenderer Mag19_r1;
	private final ModelRenderer Mag18_r1;
	private final ModelRenderer Mag14_r1;
	private final ModelRenderer Mag13_r1;
	private final ModelRenderer Mag12_r1;
	private final ModelRenderer Mag11_r1;
	private final ModelRenderer Mag10_r1;
	private final ModelRenderer Mag9_r1;
	private final ModelRenderer Mag8_r1;
	private final ModelRenderer Mag7_r1;
	private final ModelRenderer Mag6_r1;
	private final ModelRenderer Mag3_r1;
	private final ModelRenderer Mag3_r2;
	private final ModelRenderer Mag2_r1;

	public Saiga12Mag() {
		textureWidth = 150;
		textureHeight = 150;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(-1.4F, -4.7521F, -25.3963F);
		mag.cubeList.add(new ModelBox(mag, 0, 0, -1.8F, -2.2479F, -5.6037F, 3, 2, 10, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -1.9F, -2.9479F, -5.7037F, 1, 1, 4, -0.1F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, 0.9F, -3.9479F, 1.1963F, 1, 2, 3, -0.1F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -2.1F, -2.9479F, -0.6037F, 1, 1, 2, -0.1F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -2.1F, -3.9479F, 1.1963F, 1, 2, 3, -0.1F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, 0.9F, -2.9479F, -0.6037F, 1, 1, 2, -0.1F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, 0.7F, -2.9479F, -5.7037F, 1, 1, 4, -0.1F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -2.1F, -0.2479F, 3.3963F, 4, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, 0.6F, -2.2479F, -5.6037F, 1, 2, 10, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -2.1F, -2.2479F, -0.6037F, 4, 2, 5, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -2.1F, -2.2479F, 3.5963F, 4, 2, 1, 0.0F, false));

		Mag25_r1 = new ModelRenderer(this);
		Mag25_r1.setRotationPoint(1.4F, 28.2276F, 20.4064F);
		mag.addChild(Mag25_r1);
		setRotationAngle(Mag25_r1, -0.2094F, 0.0F, 0.0F);
		Mag25_r1.cubeList.add(new ModelBox(Mag25_r1, 0, 0, -0.35F, -26.0966F, -21.7081F, 1, 2, 1, 0.0F, false));

		Mag24_r1 = new ModelRenderer(this);
		Mag24_r1.setRotationPoint(1.4F, 32.4309F, 18.5982F);
		mag.addChild(Mag24_r1);
		setRotationAngle(Mag24_r1, -0.2094F, 0.0F, 0.0F);
		Mag24_r1.cubeList.add(new ModelBox(Mag24_r1, 0, 0, -3.65F, -30.5F, -20.9F, 1, 2, 1, 0.0F, false));

		Mag23_r1 = new ModelRenderer(this);
		Mag23_r1.setRotationPoint(-21.1404F, 21.5694F, 25.3963F);
		mag.addChild(Mag23_r1);
		setRotationAngle(Mag23_r1, 0.0F, 0.0F, 0.7854F);
		Mag23_r1.cubeList.add(new ModelBox(Mag23_r1, 0, 0, -2.6F, -30.8F, -30.7F, 1, 1, 5, 0.0F, false));

		Mag22_r1 = new ModelRenderer(this);
		Mag22_r1.setRotationPoint(-20.496F, 20.0138F, 25.3963F);
		mag.addChild(Mag22_r1);
		setRotationAngle(Mag22_r1, 0.0F, 0.0F, 0.7854F);
		Mag22_r1.cubeList.add(new ModelBox(Mag22_r1, 0, 0, -0.4F, -30.8F, -30.7F, 1, 1, 5, 0.0F, false));

		Mag21_r1 = new ModelRenderer(this);
		Mag21_r1.setRotationPoint(-20.7161F, 21.7452F, 25.3963F);
		mag.addChild(Mag21_r1);
		setRotationAngle(Mag21_r1, 0.0F, 0.0F, 0.7854F);
		Mag21_r1.cubeList.add(new ModelBox(Mag21_r1, 0, 0, -2.6F, -30.2F, -31.0F, 1, 1, 5, 0.0F, false));

		Mag20_r1 = new ModelRenderer(this);
		Mag20_r1.setRotationPoint(-20.2919F, 21.9209F, 25.3963F);
		mag.addChild(Mag20_r1);
		setRotationAngle(Mag20_r1, 0.0F, 0.0F, 0.7854F);
		Mag20_r1.cubeList.add(new ModelBox(Mag20_r1, 0, 0, -2.6F, -29.6F, -31.3F, 1, 1, 5, 0.0F, false));

		Mag19_r1 = new ModelRenderer(this);
		Mag19_r1.setRotationPoint(-20.0718F, 20.1895F, 25.3963F);
		mag.addChild(Mag19_r1);
		setRotationAngle(Mag19_r1, 0.0F, 0.0F, 0.7854F);
		Mag19_r1.cubeList.add(new ModelBox(Mag19_r1, 0, 0, -0.4F, -30.2F, -31.0F, 1, 1, 5, 0.0F, false));

		Mag18_r1 = new ModelRenderer(this);
		Mag18_r1.setRotationPoint(-19.6475F, 20.3653F, 25.3963F);
		mag.addChild(Mag18_r1);
		setRotationAngle(Mag18_r1, 0.0F, 0.0F, 0.7854F);
		Mag18_r1.cubeList.add(new ModelBox(Mag18_r1, 0, 0, -0.4F, -29.6F, -31.3F, 1, 1, 5, 0.0F, false));

		Mag14_r1 = new ModelRenderer(this);
		Mag14_r1.setRotationPoint(1.4F, 40.9234F, 14.1983F);
		mag.addChild(Mag14_r1);
		setRotationAngle(Mag14_r1, -0.4325F, 0.0F, 0.0F);
		Mag14_r1.cubeList.add(new ModelBox(Mag14_r1, 0, 0, -0.8F, -19.4F, -33.3F, 1, 5, 1, 0.0F, false));
		Mag14_r1.cubeList.add(new ModelBox(Mag14_r1, 0, 0, -3.2F, -19.4F, -33.3F, 3, 5, 1, 0.0F, false));

		Mag13_r1 = new ModelRenderer(this);
		Mag13_r1.setRotationPoint(1.4F, 33.4804F, 18.3828F);
		mag.addChild(Mag13_r1);
		setRotationAngle(Mag13_r1, -0.2094F, 0.0F, 0.0F);
		Mag13_r1.cubeList.add(new ModelBox(Mag13_r1, 0, 0, -3.5F, -31.0F, -26.0F, 4, 18, 6, 0.0F, false));

		Mag12_r1 = new ModelRenderer(this);
		Mag12_r1.setRotationPoint(1.4F, 34.5199F, 18.2736F);
		mag.addChild(Mag12_r1);
		setRotationAngle(Mag12_r1, -0.2094F, 0.0F, 0.0F);
		Mag12_r1.cubeList.add(new ModelBox(Mag12_r1, 0, 0, -0.8F, -31.0F, -31.0F, 1, 17, 5, 0.0F, false));
		Mag12_r1.cubeList.add(new ModelBox(Mag12_r1, 0, 0, -3.2F, -31.0F, -31.0F, 3, 17, 5, 0.0F, false));

		Mag11_r1 = new ModelRenderer(this);
		Mag11_r1.setRotationPoint(-19.5597F, 20.1532F, 25.3963F);
		mag.addChild(Mag11_r1);
		setRotationAngle(Mag11_r1, 0.0F, 0.0F, 0.7854F);
		Mag11_r1.cubeList.add(new ModelBox(Mag11_r1, 0, 0, -0.1F, -29.6F, -26.5F, 1, 1, 6, 0.0F, false));

		Mag10_r1 = new ModelRenderer(this);
		Mag10_r1.setRotationPoint(-19.9839F, 19.9774F, 25.3963F);
		mag.addChild(Mag10_r1);
		setRotationAngle(Mag10_r1, 0.0F, 0.0F, 0.7854F);
		Mag10_r1.cubeList.add(new ModelBox(Mag10_r1, 0, 0, -0.1F, -30.2F, -26.3F, 1, 1, 6, 0.0F, false));

		Mag9_r1 = new ModelRenderer(this);
		Mag9_r1.setRotationPoint(-20.4082F, 19.8017F, 25.3963F);
		mag.addChild(Mag9_r1);
		setRotationAngle(Mag9_r1, 0.0F, 0.0F, 0.7854F);
		Mag9_r1.cubeList.add(new ModelBox(Mag9_r1, 0, 0, -0.1F, -30.8F, -26.2F, 1, 1, 6, 0.0F, false));

		Mag8_r1 = new ModelRenderer(this);
		Mag8_r1.setRotationPoint(-20.3798F, 22.1331F, 25.3963F);
		mag.addChild(Mag8_r1);
		setRotationAngle(Mag8_r1, 0.0F, 0.0F, 0.7854F);
		Mag8_r1.cubeList.add(new ModelBox(Mag8_r1, 0, 0, -2.9F, -29.6F, -26.5F, 1, 1, 6, 0.0F, false));

		Mag7_r1 = new ModelRenderer(this);
		Mag7_r1.setRotationPoint(-20.804F, 21.9573F, 25.3963F);
		mag.addChild(Mag7_r1);
		setRotationAngle(Mag7_r1, 0.0F, 0.0F, 0.7854F);
		Mag7_r1.cubeList.add(new ModelBox(Mag7_r1, 0, 0, -2.9F, -30.2F, -26.3F, 1, 1, 6, 0.0F, false));

		Mag6_r1 = new ModelRenderer(this);
		Mag6_r1.setRotationPoint(-21.2283F, 21.7816F, 25.3963F);
		mag.addChild(Mag6_r1);
		setRotationAngle(Mag6_r1, 0.0F, 0.0F, 0.7854F);
		Mag6_r1.cubeList.add(new ModelBox(Mag6_r1, 0, 0, -2.9F, -30.8F, -26.2F, 1, 1, 6, 0.0F, false));

		Mag3_r1 = new ModelRenderer(this);
		Mag3_r1.setRotationPoint(-1.6F, -2.8198F, 1.2375F);
		mag.addChild(Mag3_r1);
		setRotationAngle(Mag3_r1, 1.0908F, 0.0F, 0.0F);
		Mag3_r1.cubeList.add(new ModelBox(Mag3_r1, 0, 0, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.1F, false));
		Mag3_r1.cubeList.add(new ModelBox(Mag3_r1, 0, 0, 2.5F, -0.5F, -1.0F, 1, 1, 2, -0.1F, false));

		Mag3_r2 = new ModelRenderer(this);
		Mag3_r2.setRotationPoint(-1.6F, -2.8458F, 4.1224F);
		mag.addChild(Mag3_r2);
		setRotationAngle(Mag3_r2, 0.2618F, 0.0F, 0.0F);
		Mag3_r2.cubeList.add(new ModelBox(Mag3_r2, 0, 0, -0.5F, -1.0F, -0.7F, 1, 2, 1, -0.1F, false));
		Mag3_r2.cubeList.add(new ModelBox(Mag3_r2, 0, 0, 2.5F, -1.0F, -0.7F, 1, 2, 1, -0.1F, false));

		Mag2_r1 = new ModelRenderer(this);
		Mag2_r1.setRotationPoint(1.4F, 32.3992F, 18.4965F);
		mag.addChild(Mag2_r1);
		setRotationAngle(Mag2_r1, -0.2094F, 0.0F, 0.0F);
		Mag2_r1.cubeList.add(new ModelBox(Mag2_r1, 0, 0, -3.5F, -31.0F, -20.8F, 4, 3, 1, 0.0F, false));
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
