package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK416Stock extends ModelBase {
	private final ModelRenderer gun365;
	private final ModelRenderer gun366;
	private final ModelRenderer gun367;
	private final ModelRenderer gun368;
	private final ModelRenderer gun369;
	private final ModelRenderer gun370;
	private final ModelRenderer gun371;
	private final ModelRenderer gun372;
	private final ModelRenderer gun373;
	private final ModelRenderer gun374;
	private final ModelRenderer gun375;
	private final ModelRenderer gun376;
	private final ModelRenderer gun378;
	private final ModelRenderer gun380;
	private final ModelRenderer gun381;
	private final ModelRenderer gun382;
	private final ModelRenderer gun383;
	private final ModelRenderer gun384;
	private final ModelRenderer gun385;
	private final ModelRenderer gun386;
	private final ModelRenderer gun394;
	private final ModelRenderer gun395;
	private final ModelRenderer gun407;
	private final ModelRenderer gun408;
	private final ModelRenderer gun409;
	private final ModelRenderer gun410;
	private final ModelRenderer gun411;
	private final ModelRenderer gun412;
	private final ModelRenderer gun413;
	private final ModelRenderer gun414;
	private final ModelRenderer gun415;
	private final ModelRenderer gun416;
	private final ModelRenderer gun417;
	private final ModelRenderer gun418;
	private final ModelRenderer gun419;
	private final ModelRenderer gun420;
	private final ModelRenderer gun421;
	private final ModelRenderer gun422;
	private final ModelRenderer gun423;
	private final ModelRenderer gun424;
	private final ModelRenderer gun425;
	private final ModelRenderer gun426;
	private final ModelRenderer gun427;
	private final ModelRenderer gun428;
	private final ModelRenderer gun429;
	private final ModelRenderer gun430;
	private final ModelRenderer gun431;
	private final ModelRenderer gun432;
	private final ModelRenderer gun433;
	private final ModelRenderer gun434;

	public HK416Stock() {
		textureWidth = 120;
		textureHeight = 120;

		gun365 = new ModelRenderer(this);
		gun365.setRotationPoint(-2.0F, -11.5F, 3.5F);
		gun365.cubeList.add(new ModelBox(gun365, 10, 34, 0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F, false));

		gun366 = new ModelRenderer(this);
		gun366.setRotationPoint(-3.0F, -10.5F, 3.5F);
		gun366.cubeList.add(new ModelBox(gun366, 0, 33, 0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

		gun367 = new ModelRenderer(this);
		gun367.setRotationPoint(-2.0F, -11.7F, 8.0F);
		gun367.cubeList.add(new ModelBox(gun367, 24, 23, 0.0F, 0.0F, 0.0F, 1, 3, 20, 0.0F, false));

		gun368 = new ModelRenderer(this);
		gun368.setRotationPoint(-2.5F, -9.3F, 7.5F);
		gun368.cubeList.add(new ModelBox(gun368, 0, 0, 0.0F, 0.0F, 0.0F, 2, 2, 20, 0.0F, false));

		gun369 = new ModelRenderer(this);
		gun369.setRotationPoint(-3.2F, -10.5F, 7.5F);
		gun369.cubeList.add(new ModelBox(gun369, 24, 2, 0.0F, 0.0F, 0.0F, 2, 1, 20, 0.0F, false));

		gun370 = new ModelRenderer(this);
		gun370.setRotationPoint(-1.8F, -10.5F, 7.5F);
		gun370.cubeList.add(new ModelBox(gun370, 0, 22, 0.0F, 0.0F, 0.0F, 2, 1, 20, 0.0F, false));

		gun371 = new ModelRenderer(this);
		gun371.setRotationPoint(-1.0F, -11.7F, 7.5F);
		setRotationAngle(gun371, 0.0F, 0.0F, 0.7854F);
		gun371.cubeList.add(new ModelBox(gun371, 22, 67, 0.0F, -0.001F, 0.0F, 1, 1, 20, 0.0F, false));

		gun372 = new ModelRenderer(this);
		gun372.setRotationPoint(-2.0F, -11.7F, 7.5F);
		setRotationAngle(gun372, 0.0F, 0.0F, 0.7854F);
		gun372.cubeList.add(new ModelBox(gun372, 0, 65, -0.001F, 0.0F, 0.0F, 1, 1, 20, 0.0F, false));

		gun373 = new ModelRenderer(this);
		gun373.setRotationPoint(-3.2F, -10.5F, 7.5F);
		setRotationAngle(gun373, 0.0F, 0.0F, -0.7854F);
		gun373.cubeList.add(new ModelBox(gun373, 48, 0, 0.0F, 0.0F, 0.0F, 1, 1, 20, 0.0F, false));

		gun374 = new ModelRenderer(this);
		gun374.setRotationPoint(-3.2F, -9.5F, 7.5F);
		setRotationAngle(gun374, 0.0F, 0.0F, -0.7854F);
		gun374.cubeList.add(new ModelBox(gun374, 46, 47, 0.0F, 0.0F, 0.0F, 1, 1, 20, 0.0F, false));

		gun375 = new ModelRenderer(this);
		gun375.setRotationPoint(0.2F, -10.5F, 7.5F);
		setRotationAngle(gun375, 0.0F, 0.0F, 2.3562F);
		gun375.cubeList.add(new ModelBox(gun375, 46, 26, 0.0F, 0.0F, 0.0F, 1, 1, 20, 0.0F, false));

		gun376 = new ModelRenderer(this);
		gun376.setRotationPoint(0.2F, -9.5F, 7.5F);
		setRotationAngle(gun376, 0.0F, 0.0F, 2.3562F);
		gun376.cubeList.add(new ModelBox(gun376, 24, 46, 0.0F, 0.0F, 0.0F, 1, 1, 20, 0.0F, false));

		gun378 = new ModelRenderer(this);
		gun378.setRotationPoint(-3.0F, -5.3F, 10.5F);
		gun378.cubeList.add(new ModelBox(gun378, 0, 13, 0.0F, 0.0F, 0.0F, 3, 1, 6, 0.0F, false));

		gun380 = new ModelRenderer(this);
		gun380.setRotationPoint(-3.0F, -0.1F, 22.0F);
		gun380.cubeList.add(new ModelBox(gun380, 24, 23, 0.0F, 0.0F, 0.0F, 3, 2, 5, 0.0F, false));

		gun381 = new ModelRenderer(this);
		gun381.setRotationPoint(-3.3F, -10.9F, 27.5F);
		setRotationAngle(gun381, -0.1115F, 0.0F, 0.0F);
		gun381.cubeList.add(new ModelBox(gun381, 0, 43, 0.0F, 0.0F, 0.001F, 3, 12, 1, 0.0F, false));

		gun382 = new ModelRenderer(this);
		gun382.setRotationPoint(-0.7F, -10.9F, 27.5F);
		setRotationAngle(gun382, -0.1115F, 0.0F, 0.0F);
		gun382.cubeList.add(new ModelBox(gun382, 39, 29, 0.0F, 0.0F, 0.0F, 1, 12, 1, 0.0F, false));

		gun383 = new ModelRenderer(this);
		gun383.setRotationPoint(-2.5F, -11.8F, 27.6F);
		setRotationAngle(gun383, -0.1115F, 0.0F, 0.0F);
		gun383.cubeList.add(new ModelBox(gun383, 11, 4, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun384 = new ModelRenderer(this);
		gun384.setRotationPoint(-3.0F, -11.4F, 27.55F);
		setRotationAngle(gun384, -0.1115F, 0.0F, 0.0F);
		gun384.cubeList.add(new ModelBox(gun384, 0, 4, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun385 = new ModelRenderer(this);
		gun385.setRotationPoint(-2.0F, -11.7F, 7.5F);
		gun385.cubeList.add(new ModelBox(gun385, 11, 0, 0.0F, -0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		gun386 = new ModelRenderer(this);
		gun386.setRotationPoint(-2.5F, -7.8F, 10.8F);
		gun386.cubeList.add(new ModelBox(gun386, 0, 22, -0.001F, 0.0F, 0.0F, 2, 3, 8, 0.0F, false));

		gun394 = new ModelRenderer(this);
		gun394.setRotationPoint(-2.5F, 1.0F, 26.2F);
		setRotationAngle(gun394, -0.1115F, 0.0F, 0.0F);
		gun394.cubeList.add(new ModelBox(gun394, 0, 6, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun395 = new ModelRenderer(this);
		gun395.setRotationPoint(-3.0F, 0.5F, 26.25F);
		setRotationAngle(gun395, -0.1115F, 0.0F, 0.0F);
		gun395.cubeList.add(new ModelBox(gun395, 0, 2, -0.001F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun407 = new ModelRenderer(this);
		gun407.setRotationPoint(-1.0F, -11.5F, 3.5F);
		setRotationAngle(gun407, 0.0F, 0.0F, 0.7854F);
		gun407.cubeList.add(new ModelBox(gun407, 48, 0, 0.0F, -0.001F, 0.0F, 1, 1, 4, 0.0F, false));

		gun408 = new ModelRenderer(this);
		gun408.setRotationPoint(-2.0F, -11.5F, 3.5F);
		setRotationAngle(gun408, 0.0F, 0.0F, 0.7854F);
		gun408.cubeList.add(new ModelBox(gun408, 46, 47, -0.001F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun409 = new ModelRenderer(this);
		gun409.setRotationPoint(-3.0F, -10.5F, 3.5F);
		setRotationAngle(gun409, 0.0F, 0.0F, -0.7854F);
		gun409.cubeList.add(new ModelBox(gun409, 33, 47, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun410 = new ModelRenderer(this);
		gun410.setRotationPoint(-3.0F, -9.5F, 3.5F);
		setRotationAngle(gun410, 0.0F, 0.0F, -0.7854F);
		gun410.cubeList.add(new ModelBox(gun410, 46, 38, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun411 = new ModelRenderer(this);
		gun411.setRotationPoint(0.0F, -10.5F, 3.5F);
		setRotationAngle(gun411, 0.0F, 0.0F, 2.3562F);
		gun411.cubeList.add(new ModelBox(gun411, 46, 33, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun412 = new ModelRenderer(this);
		gun412.setRotationPoint(0.0F, -9.5F, 3.5F);
		setRotationAngle(gun412, 0.0F, 0.0F, 2.3562F);
		gun412.cubeList.add(new ModelBox(gun412, 46, 28, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun413 = new ModelRenderer(this);
		gun413.setRotationPoint(-2.0F, -8.5F, 3.5F);
		setRotationAngle(gun413, 0.0F, 0.0F, -2.3562F);
		gun413.cubeList.add(new ModelBox(gun413, 27, 46, 0.0F, -0.001F, 0.0F, 1, 1, 4, 0.0F, false));

		gun414 = new ModelRenderer(this);
		gun414.setRotationPoint(-1.0F, -8.5F, 3.5F);
		setRotationAngle(gun414, 0.0F, 0.0F, -2.3562F);
		gun414.cubeList.add(new ModelBox(gun414, 46, 23, -0.001F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun415 = new ModelRenderer(this);
		gun415.setRotationPoint(0.2F, -10.0F, 10.5F);
		setRotationAngle(gun415, 0.0F, 0.0F, 0.6692F);
		gun415.cubeList.add(new ModelBox(gun415, 63, 69, 0.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, false));

		gun416 = new ModelRenderer(this);
		gun416.setRotationPoint(-3.2F, -10.0F, 10.5F);
		setRotationAngle(gun416, 0.0F, 0.0F, -0.6692F);
		gun416.cubeList.add(new ModelBox(gun416, 44, 68, -1.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, false));

		gun417 = new ModelRenderer(this);
		gun417.setRotationPoint(-4.0F, -9.4F, 10.5F);
		gun417.cubeList.add(new ModelBox(gun417, 0, 46, 0.0F, 0.0F, 0.001F, 5, 2, 17, 0.0F, false));

		gun418 = new ModelRenderer(this);
		gun418.setRotationPoint(-4.0F, -7.4F, 10.5F);
		setRotationAngle(gun418, 0.0F, 0.0F, -1.1897F);
		gun418.cubeList.add(new ModelBox(gun418, 68, 47, 0.0F, 0.0F, 0.0F, 1, 3, 17, 0.0F, false));

		gun419 = new ModelRenderer(this);
		gun419.setRotationPoint(1.0F, -7.4F, 10.5F);
		setRotationAngle(gun419, 0.0F, 0.0F, 1.1897F);
		gun419.cubeList.add(new ModelBox(gun419, 68, 21, -1.0F, 0.0F, 0.0F, 1, 3, 17, 0.0F, false));

		gun420 = new ModelRenderer(this);
		gun420.setRotationPoint(-4.0F, -9.4F, 10.5F);
		setRotationAngle(gun420, 0.0F, 0.9295F, 0.0F);
		gun420.cubeList.add(new ModelBox(gun420, 48, 13, 0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun421 = new ModelRenderer(this);
		gun421.setRotationPoint(1.0F, -9.4F, 10.5F);
		setRotationAngle(gun421, 0.0F, -0.9295F, 0.0F);
		gun421.cubeList.add(new ModelBox(gun421, 48, 9, -3.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun422 = new ModelRenderer(this);
		gun422.setRotationPoint(-2.5F, -4.8F, 10.8F);
		setRotationAngle(gun422, 1.8961F, 0.0F, 0.0F);
		gun422.cubeList.add(new ModelBox(gun422, 48, 5, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

		gun423 = new ModelRenderer(this);
		gun423.setRotationPoint(-3.0F, -5.3F, 16.5F);
		setRotationAngle(gun423, -0.8179F, 0.0F, 0.0F);
		gun423.cubeList.add(new ModelBox(gun423, 85, 0, -0.001F, 0.0F, 0.0F, 3, 1, 9, 0.0F, false));

		gun424 = new ModelRenderer(this);
		gun424.setRotationPoint(-2.5F, -5.8F, 17.8F);
		setRotationAngle(gun424, -0.8179F, 0.0F, 0.0F);
		gun424.cubeList.add(new ModelBox(gun424, 0, 86, -0.002F, -0.5F, 0.0F, 2, 2, 9, 0.0F, false));

		gun425 = new ModelRenderer(this);
		gun425.setRotationPoint(-3.0F, -0.1F, 21.0F);
		gun425.cubeList.add(new ModelBox(gun425, 0, 0, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun426 = new ModelRenderer(this);
		gun426.setRotationPoint(-2.5F, -4.8F, 27.1F);
		setRotationAngle(gun426, -1.7102F, 0.0F, 0.0F);
		gun426.cubeList.add(new ModelBox(gun426, 24, 9, -0.001F, 0.0F, -2.0F, 2, 1, 7, 0.0F, false));

		gun427 = new ModelRenderer(this);
		gun427.setRotationPoint(-2.5F, -0.8F, 23.1F);
		gun427.cubeList.add(new ModelBox(gun427, 0, 38, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

		gun428 = new ModelRenderer(this);
		gun428.setRotationPoint(-2.5F, -2.8F, 21.1F);
		gun428.cubeList.add(new ModelBox(gun428, 24, 30, 0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));

		gun429 = new ModelRenderer(this);
		gun429.setRotationPoint(-2.5F, -4.8F, 19.1F);
		gun429.cubeList.add(new ModelBox(gun429, 24, 0, 0.0F, 0.0F, 0.0F, 2, 1, 8, 0.0F, false));

		gun430 = new ModelRenderer(this);
		gun430.setRotationPoint(-2.0F, -6.8F, 18.1F);
		gun430.cubeList.add(new ModelBox(gun430, 0, 0, 0.0F, 0.0F, 0.0F, 1, 4, 9, 0.0F, false));

		gun431 = new ModelRenderer(this);
		gun431.setRotationPoint(-2.0F, -1.8F, 22.1F);
		gun431.cubeList.add(new ModelBox(gun431, 24, 36, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun432 = new ModelRenderer(this);
		gun432.setRotationPoint(-2.5F, -6.8F, 18.1F);
		gun432.cubeList.add(new ModelBox(gun432, 87, 15, 0.0F, 0.0F, 0.0F, 2, 1, 9, 0.0F, false));

		gun433 = new ModelRenderer(this);
		gun433.setRotationPoint(-2.8F, -5.8F, 17.8F);
		setRotationAngle(gun433, -0.8179F, 0.0F, 0.0F);
		gun433.cubeList.add(new ModelBox(gun433, 82, 67, 0.0F, -0.2F, -4.0F, 1, 2, 13, 0.0F, false));

		gun434 = new ModelRenderer(this);
		gun434.setRotationPoint(-1.2F, -5.8F, 17.8F);
		setRotationAngle(gun434, -0.8179F, 0.0F, 0.0F);
		gun434.cubeList.add(new ModelBox(gun434, 70, 0, 0.0F, -0.2F, -4.0F, 1, 2, 13, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun365.render(f5);
		gun366.render(f5);
		gun367.render(f5);
		gun368.render(f5);
		gun369.render(f5);
		gun370.render(f5);
		gun371.render(f5);
		gun372.render(f5);
		gun373.render(f5);
		gun374.render(f5);
		gun375.render(f5);
		gun376.render(f5);
		gun378.render(f5);
		gun380.render(f5);
		gun381.render(f5);
		gun382.render(f5);
		gun383.render(f5);
		gun384.render(f5);
		gun385.render(f5);
		gun386.render(f5);
		gun394.render(f5);
		gun395.render(f5);
		gun407.render(f5);
		gun408.render(f5);
		gun409.render(f5);
		gun410.render(f5);
		gun411.render(f5);
		gun412.render(f5);
		gun413.render(f5);
		gun414.render(f5);
		gun415.render(f5);
		gun416.render(f5);
		gun417.render(f5);
		gun418.render(f5);
		gun419.render(f5);
		gun420.render(f5);
		gun421.render(f5);
		gun422.render(f5);
		gun423.render(f5);
		gun424.render(f5);
		gun425.render(f5);
		gun426.render(f5);
		gun427.render(f5);
		gun428.render(f5);
		gun429.render(f5);
		gun430.render(f5);
		gun431.render(f5);
		gun432.render(f5);
		gun433.render(f5);
		gun434.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
