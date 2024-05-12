package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Remington870MagpulPump extends ModelWithAttachments {
	private final ModelRenderer pumpMagpulPump;
	private final ModelRenderer pump76_r1;
	private final ModelRenderer pump72_r1;
	private final ModelRenderer pump49_r1;
	private final ModelRenderer pump48_r1;
	private final ModelRenderer pump47_r1;
	private final ModelRenderer pump46_r1;
	private final ModelRenderer pump40_r1;
	private final ModelRenderer pump39_r1;
	private final ModelRenderer pump37_r1;
	private final ModelRenderer pump34_r1;
	private final ModelRenderer pump33_r1;
	private final ModelRenderer pump31_r1;
	private final ModelRenderer pump27_r1;
	private final ModelRenderer pump26_r1;
	private final ModelRenderer pump25_r1;
	private final ModelRenderer pump24_r1;
	private final ModelRenderer pump15_r1;
	private final ModelRenderer pump14_r1;
	private final ModelRenderer pump3_r1;
	private final ModelRenderer pump1_r1;

	public Remington870MagpulPump() {
		textureWidth = 410;
		textureHeight = 410;

		pumpMagpulPump = new ModelRenderer(this);
		pumpMagpulPump.setRotationPoint(11.7028F, -21.1525F, 0.0F);
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 118, 25, -14.4028F, 15.5525F, -12.0F, 1, 1, 8, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 7, 29, -11.1028F, 18.1525F, -42.0F, 1, 2, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 0, 29, -15.3028F, 18.1525F, -42.0F, 1, 2, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 57, 100, -15.2028F, 18.1525F, -41.0F, 5, 2, 4, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 0, 234, -11.3028F, 19.1525F, -37.0F, 1, 1, 12, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 142, 225, -15.1028F, 19.1525F, -37.0F, 1, 1, 12, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 61, 49, -11.1028F, 18.6525F, -25.5F, 1, 1, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 42, 61, -15.3028F, 18.6525F, -25.5F, 1, 1, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 27, 61, -15.3028F, 19.1525F, -25.5F, 1, 1, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 14, 61, -11.1028F, 19.1525F, -25.5F, 1, 1, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 178, 360, -11.6028F, 16.1525F, -41.0F, 1, 1, 15, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 357, 51, -14.8028F, 17.6525F, -41.0F, 1, 2, 16, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 61, 32, -14.2028F, 21.6525F, -25.5F, 3, 1, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 114, 76, -14.4028F, 18.6525F, -25.7F, 3, 3, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 28, 11, -12.0028F, 18.6525F, -25.7F, 1, 3, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 61, 15, -14.5028F, 21.0525F, -42.0F, 3, 1, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 46, 34, -11.9028F, 21.0525F, -42.0F, 1, 1, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 328, 103, -13.7028F, 20.5525F, -41.0F, 2, 1, 16, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 217, 73, -11.6028F, 17.6525F, -41.0F, 1, 2, 16, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 128, 359, -14.8028F, 16.1525F, -41.0F, 1, 1, 15, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 66, 87, -11.6028F, 17.1525F, -41.0F, 1, 1, 2, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 46, 18, -11.6028F, 17.1525F, -37.0F, 1, 1, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 4, 41, -11.6028F, 17.1525F, -34.0F, 1, 1, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 10, 128, -11.6028F, 17.1525F, -31.0F, 1, 1, 6, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 57, 87, -14.8028F, 17.1525F, -41.0F, 1, 1, 2, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 34, 8, -14.8028F, 17.1525F, -37.0F, 1, 1, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 34, 0, -14.8028F, 17.1525F, -34.0F, 1, 1, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 124, 92, -14.8028F, 17.1525F, -31.0F, 1, 1, 6, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 83, 52, -15.2028F, 19.1525F, -36.0F, 5, 1, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 72, 53, -15.2028F, 19.1525F, -34.0F, 5, 1, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 42, 66, -15.2028F, 19.1525F, -32.0F, 5, 1, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 27, 66, -15.2028F, 19.1525F, -30.0F, 5, 1, 1, 0.0F, false));
		pumpMagpulPump.cubeList.add(new ModelBox(pumpMagpulPump, 61, 52, -15.2028F, 19.1525F, -28.0F, 5, 1, 1, 0.0F, false));

		pump76_r1 = new ModelRenderer(this);
		pump76_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		pumpMagpulPump.addChild(pump76_r1);
		setRotationAngle(pump76_r1, 0.0F, 0.0F, -2.3562F);
		pump76_r1.cubeList.add(new ModelBox(pump76_r1, 61, 41, -5.5F, -25.0F, -30.0F, 2, 1, 1, 0.0F, false));
		pump76_r1.cubeList.add(new ModelBox(pump76_r1, 77, 48, -5.5F, -25.0F, -32.0F, 2, 1, 1, 0.0F, false));
		pump76_r1.cubeList.add(new ModelBox(pump76_r1, 79, 30, -5.5F, -25.0F, -34.0F, 2, 1, 1, 0.0F, false));
		pump76_r1.cubeList.add(new ModelBox(pump76_r1, 12, 92, -5.5F, -25.0F, -36.0F, 2, 1, 1, 0.0F, false));
		pump76_r1.cubeList.add(new ModelBox(pump76_r1, 0, 109, -5.5F, -25.0F, -28.0F, 2, 1, 1, 0.0F, false));

		pump72_r1 = new ModelRenderer(this);
		pump72_r1.setRotationPoint(-26.8198F, 1.4142F, 0.0F);
		pumpMagpulPump.addChild(pump72_r1);
		setRotationAngle(pump72_r1, 0.0F, 0.0F, 2.3562F);
		pump72_r1.cubeList.add(new ModelBox(pump72_r1, 94, 26, 1.5F, -25.0F, -28.0F, 2, 1, 1, 0.0F, false));
		pump72_r1.cubeList.add(new ModelBox(pump72_r1, 94, 48, 1.5F, -25.0F, -30.0F, 2, 1, 1, 0.0F, false));
		pump72_r1.cubeList.add(new ModelBox(pump72_r1, 84, 103, 1.5F, -25.0F, -32.0F, 2, 1, 1, 0.0F, false));
		pump72_r1.cubeList.add(new ModelBox(pump72_r1, 104, 77, 1.5F, -25.0F, -34.0F, 2, 1, 1, 0.0F, false));
		pump72_r1.cubeList.add(new ModelBox(pump72_r1, 39, 105, 1.5F, -25.0F, -36.0F, 2, 1, 1, 0.0F, false));

		pump49_r1 = new ModelRenderer(this);
		pump49_r1.setRotationPoint(-28.9704F, 36.8403F, 0.0F);
		pumpMagpulPump.addChild(pump49_r1);
		setRotationAngle(pump49_r1, 0.0F, 0.0F, 0.7854F);
		pump49_r1.cubeList.add(new ModelBox(pump49_r1, 191, 259, 0.4F, -25.0F, -41.0F, 1, 2, 16, 0.0F, false));

		pump48_r1 = new ModelRenderer(this);
		pump48_r1.setRotationPoint(4.979F, 35.426F, 0.0F);
		pumpMagpulPump.addChild(pump48_r1);
		setRotationAngle(pump48_r1, 0.0F, 0.0F, -0.7854F);
		pump48_r1.cubeList.add(new ModelBox(pump48_r1, 333, 26, -3.4F, -25.0F, -41.0F, 1, 2, 16, 0.0F, false));

		pump47_r1 = new ModelRenderer(this);
		pump47_r1.setRotationPoint(6.4042F, 1.588F, 0.0F);
		pumpMagpulPump.addChild(pump47_r1);
		setRotationAngle(pump47_r1, 0.0F, 0.0F, -2.0959F);
		pump47_r1.cubeList.add(new ModelBox(pump47_r1, 106, 14, -4.5F, -27.0F, -41.0F, 1, 1, 4, 0.0F, false));

		pump46_r1 = new ModelRenderer(this);
		pump46_r1.setRotationPoint(-32.8125F, 3.3185F, 0.0F);
		pumpMagpulPump.addChild(pump46_r1);
		setRotationAngle(pump46_r1, 0.0F, 0.0F, 2.0959F);
		pump46_r1.cubeList.add(new ModelBox(pump46_r1, 106, 19, 1.5F, -27.0F, -41.0F, 1, 1, 4, 0.0F, false));

		pump40_r1 = new ModelRenderer(this);
		pump40_r1.setRotationPoint(-29.6775F, 36.5474F, 0.0F);
		pumpMagpulPump.addChild(pump40_r1);
		setRotationAngle(pump40_r1, 0.0F, 0.0F, 0.7854F);
		pump40_r1.cubeList.add(new ModelBox(pump40_r1, 217, 91, 0.4F, -26.0F, -37.0F, 1, 1, 12, 0.0F, false));

		pump39_r1 = new ModelRenderer(this);
		pump39_r1.setRotationPoint(5.6861F, 35.1331F, 0.0F);
		pumpMagpulPump.addChild(pump39_r1);
		setRotationAngle(pump39_r1, 0.0F, 0.0F, -0.7854F);
		pump39_r1.cubeList.add(new ModelBox(pump39_r1, 114, 225, -3.4F, -26.0F, -37.0F, 1, 1, 12, 0.0F, false));

		pump37_r1 = new ModelRenderer(this);
		pump37_r1.setRotationPoint(-11.7028F, -12.2848F, -2.4201F);
		pumpMagpulPump.addChild(pump37_r1);
		setRotationAngle(pump37_r1, 1.2269F, 0.0F, 0.0F);
		pump37_r1.cubeList.add(new ModelBox(pump37_r1, 5, 48, -3.4F, -27.0F, -41.0F, 1, 1, 1, 0.0F, false));
		pump37_r1.cubeList.add(new ModelBox(pump37_r1, 44, 48, 0.4F, -27.0F, -41.0F, 1, 1, 1, 0.0F, false));
		pump37_r1.cubeList.add(new ModelBox(pump37_r1, 27, 63, -3.6F, -27.0F, -42.0F, 1, 1, 1, 0.0F, false));
		pump37_r1.cubeList.add(new ModelBox(pump37_r1, 42, 63, 0.6F, -27.0F, -42.0F, 1, 1, 1, 0.0F, false));

		pump34_r1 = new ModelRenderer(this);
		pump34_r1.setRotationPoint(11.199F, 22.2394F, 0.0F);
		pumpMagpulPump.addChild(pump34_r1);
		setRotationAngle(pump34_r1, 0.0F, 0.0F, -1.3012F);
		pump34_r1.cubeList.add(new ModelBox(pump34_r1, 12, 51, -3.2F, -26.5F, -25.5F, 1, 1, 1, 0.0F, false));
		pump34_r1.cubeList.add(new ModelBox(pump34_r1, 51, 37, -3.6F, -26.5F, -25.5F, 1, 1, 1, 0.0F, false));

		pump33_r1 = new ModelRenderer(this);
		pump33_r1.setRotationPoint(-11.7028F, 10.6099F, -60.6511F);
		pumpMagpulPump.addChild(pump33_r1);
		setRotationAngle(pump33_r1, -2.491F, 0.0F, 0.0F);
		pump33_r1.cubeList.add(new ModelBox(pump33_r1, 28, 16, -3.3F, -27.5F, -24.5F, 1, 2, 1, 0.0F, false));
		pump33_r1.cubeList.add(new ModelBox(pump33_r1, 28, 27, 0.3F, -27.5F, -24.5F, 1, 2, 1, 0.0F, false));

		pump31_r1 = new ModelRenderer(this);
		pump31_r1.setRotationPoint(-36.072F, 24.167F, 0.0F);
		pumpMagpulPump.addChild(pump31_r1);
		setRotationAngle(pump31_r1, 0.0F, 0.0F, 1.3013F);
		pump31_r1.cubeList.add(new ModelBox(pump31_r1, 51, 43, 0.2F, -26.5F, -25.5F, 1, 1, 1, 0.0F, false));
		pump31_r1.cubeList.add(new ModelBox(pump31_r1, 4, 61, 0.6F, -26.5F, -25.5F, 1, 1, 1, 0.0F, false));

		pump27_r1 = new ModelRenderer(this);
		pump27_r1.setRotationPoint(7.8004F, 12.2865F, 0.0F);
		pumpMagpulPump.addChild(pump27_r1);
		setRotationAngle(pump27_r1, 0.0F, 0.0F, -1.8218F);
		pump27_r1.cubeList.add(new ModelBox(pump27_r1, 45, 105, -4.5F, -24.0F, -25.5F, 2, 1, 1, 0.0F, false));

		pump26_r1 = new ModelRenderer(this);
		pump26_r1.setRotationPoint(-33.7027F, 14.2239F, 0.0F);
		pumpMagpulPump.addChild(pump26_r1);
		setRotationAngle(pump26_r1, 0.0F, 0.0F, 1.8218F);
		pump26_r1.cubeList.add(new ModelBox(pump26_r1, 105, 93, 0.5F, -24.0F, -25.5F, 2, 1, 1, 0.0F, false));

		pump25_r1 = new ModelRenderer(this);
		pump25_r1.setRotationPoint(5.2973F, 5.5376F, 0.0F);
		pumpMagpulPump.addChild(pump25_r1);
		setRotationAngle(pump25_r1, 0.0F, 0.0F, -2.0448F);
		pump25_r1.cubeList.add(new ModelBox(pump25_r1, 57, 106, -5.6F, -25.0F, -25.5F, 2, 1, 1, 0.0F, false));

		pump24_r1 = new ModelRenderer(this);
		pump24_r1.setRotationPoint(-31.6159F, 7.3171F, 0.0F);
		pumpMagpulPump.addChild(pump24_r1);
		setRotationAngle(pump24_r1, 0.0F, 0.0F, 2.0448F);
		pump24_r1.cubeList.add(new ModelBox(pump24_r1, 63, 106, 1.6F, -25.0F, -25.5F, 2, 1, 1, 0.0F, false));

		pump15_r1 = new ModelRenderer(this);
		pump15_r1.setRotationPoint(6.3262F, 7.1086F, 0.0F);
		pumpMagpulPump.addChild(pump15_r1);
		setRotationAngle(pump15_r1, 0.0F, 0.0F, -1.9705F);
		pump15_r1.cubeList.add(new ModelBox(pump15_r1, 107, 52, -5.6F, -25.0F, -42.0F, 2, 1, 1, 0.0F, false));

		pump14_r1 = new ModelRenderer(this);
		pump14_r1.setRotationPoint(-32.51F, 8.9508F, 0.0F);
		pumpMagpulPump.addChild(pump14_r1);
		setRotationAngle(pump14_r1, 0.0F, 0.0F, 1.9705F);
		pump14_r1.cubeList.add(new ModelBox(pump14_r1, 107, 57, 1.6F, -25.0F, -42.0F, 2, 1, 1, 0.0F, false));

		pump3_r1 = new ModelRenderer(this);
		pump3_r1.setRotationPoint(3.9634F, 38.6417F, 0.0F);
		pumpMagpulPump.addChild(pump3_r1);
		setRotationAngle(pump3_r1, 0.0F, 0.0F, -0.5995F);
		pump3_r1.cubeList.add(new ModelBox(pump3_r1, 0, 273, -2.7F, -28.6F, -12.0F, 1, 2, 18, 0.0F, false));

		pump1_r1 = new ModelRenderer(this);
		pump1_r1.setRotationPoint(8.4367F, 34.5737F, 0.0F);
		pumpMagpulPump.addChild(pump1_r1);
		setRotationAngle(pump1_r1, 0.0F, 0.0F, -0.7854F);
		pump1_r1.cubeList.add(new ModelBox(pump1_r1, 118, 34, -2.7F, -29.6F, -12.0F, 1, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		pumpMagpulPump.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
