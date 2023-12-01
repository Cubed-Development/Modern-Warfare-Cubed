package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M60Belt extends ModelWithAttachments {
	private final ModelRenderer belt;
	private final ModelRenderer Belt16_r1;
	private final ModelRenderer Belt15_r1;
	private final ModelRenderer Belt16_r2;
	private final ModelRenderer Belt15_r2;
	private final ModelRenderer Belt13_r1;
	private final ModelRenderer Belt12_r1;
	private final ModelRenderer Belt10_r1;
	private final ModelRenderer Belt8_r1;
	private final ModelRenderer Belt7_r1;
	private final ModelRenderer Belt2_r1;
	private final ModelRenderer Belt2_r2;

	public M60Belt() {
		textureWidth = 330;
		textureHeight = 330;

		belt = new ModelRenderer(this);
		belt.setRotationPoint(-17.3345F, -11.8642F, -53.0F);
		belt.cubeList.add(new ModelBox(belt, 99, 84, 19.8345F, -6.1358F, 37.8F, 1, 1, 2, -0.1F, false));
		belt.cubeList.add(new ModelBox(belt, 8, 144, 19.8345F, -6.1358F, 39.5F, 1, 1, 6, 0.0F, false));
		belt.cubeList.add(new ModelBox(belt, 0, 84, 19.8345F, -6.3358F, 41.0F, 1, 1, 4, 0.0F, false));

		Belt16_r1 = new ModelRenderer(this);
		Belt16_r1.setRotationPoint(17.1228F, -4.9911F, 40.9F);
		belt.addChild(Belt16_r1);
		setRotationAngle(Belt16_r1, 0.0F, 0.0F, 1.1525F);
		Belt16_r1.cubeList.add(new ModelBox(Belt16_r1, 69, 56, -0.593F, -0.2319F, 0.1F, 1, 1, 4, 0.0F, false));
		Belt16_r1.cubeList.add(new ModelBox(Belt16_r1, 95, 122, -0.493F, -0.2319F, -1.4F, 1, 1, 6, 0.0F, false));
		Belt16_r1.cubeList.add(new ModelBox(Belt16_r1, 60, 39, -0.493F, -0.2319F, -3.1F, 1, 1, 2, -0.1F, false));
		Belt16_r1.cubeList.add(new ModelBox(Belt16_r1, 70, 70, -0.493F, -0.1319F, 0.1F, 1, 1, 4, 0.0F, false));

		Belt15_r1 = new ModelRenderer(this);
		Belt15_r1.setRotationPoint(17.1228F, -4.9911F, 40.9F);
		belt.addChild(Belt15_r1);
		setRotationAngle(Belt15_r1, 0.0F, 0.0F, 1.1154F);
		Belt15_r1.cubeList.add(new ModelBox(Belt15_r1, 30, 13, -0.4933F, -1.3681F, 0.1F, 1, 2, 4, 0.0F, false));

		Belt16_r2 = new ModelRenderer(this);
		Belt16_r2.setRotationPoint(18.8249F, -5.626F, 40.9F);
		belt.addChild(Belt16_r2);
		setRotationAngle(Belt16_r2, 0.0F, 0.0F, 1.4143F);
		Belt16_r2.cubeList.add(new ModelBox(Belt16_r2, 69, 81, -0.5582F, -0.1198F, 0.1F, 1, 1, 4, 0.0F, false));
		Belt16_r2.cubeList.add(new ModelBox(Belt16_r2, 136, 143, -0.4582F, -0.1198F, -1.4F, 1, 1, 6, 0.0F, false));
		Belt16_r2.cubeList.add(new ModelBox(Belt16_r2, 99, 87, -0.4582F, -0.1198F, -3.1F, 1, 1, 2, -0.1F, false));
		Belt16_r2.cubeList.add(new ModelBox(Belt16_r2, 44, 92, -0.4582F, -0.1198F, 0.1F, 1, 1, 4, 0.0F, false));

		Belt15_r2 = new ModelRenderer(this);
		Belt15_r2.setRotationPoint(18.8249F, -5.626F, 40.9F);
		belt.addChild(Belt15_r2);
		setRotationAngle(Belt15_r2, 0.0F, 0.0F, 1.3772F);
		Belt15_r2.cubeList.add(new ModelBox(Belt15_r2, 60, 0, -0.4584F, -1.1198F, 0.1F, 1, 2, 4, 0.0F, false));

		Belt13_r1 = new ModelRenderer(this);
		Belt13_r1.setRotationPoint(13.4318F, 12.8285F, 0.0F);
		belt.addChild(Belt13_r1);
		setRotationAngle(Belt13_r1, 0.0F, 0.0F, 0.1487F);
		Belt13_r1.cubeList.add(new ModelBox(Belt13_r1, 14, 84, 4.5F, -20.0F, 41.0F, 1, 1, 4, 0.0F, false));
		Belt13_r1.cubeList.add(new ModelBox(Belt13_r1, 86, 30, 5.5F, -20.1F, 41.0F, 1, 1, 4, 0.0F, false));
		Belt13_r1.cubeList.add(new ModelBox(Belt13_r1, 25, 144, 5.5F, -20.0F, 39.5F, 1, 1, 6, 0.0F, false));
		Belt13_r1.cubeList.add(new ModelBox(Belt13_r1, 99, 81, 5.5F, -20.0F, 37.8F, 1, 1, 2, -0.1F, false));

		Belt12_r1 = new ModelRenderer(this);
		Belt12_r1.setRotationPoint(9.5493F, 10.1433F, 0.0F);
		belt.addChild(Belt12_r1);
		setRotationAngle(Belt12_r1, 0.0F, 0.0F, 0.3718F);
		Belt12_r1.cubeList.add(new ModelBox(Belt12_r1, 86, 25, 6.5F, -19.9F, 41.0F, 1, 1, 4, 0.0F, false));

		Belt10_r1 = new ModelRenderer(this);
		Belt10_r1.setRotationPoint(4.8224F, -3.0529F, 0.0F);
		belt.addChild(Belt10_r1);
		setRotationAngle(Belt10_r1, 0.0F, 0.0F, 1.041F);
		Belt10_r1.cubeList.add(new ModelBox(Belt10_r1, 86, 37, 10.0F, -18.5F, 41.0F, 1, 1, 4, 0.0F, false));
		Belt10_r1.cubeList.add(new ModelBox(Belt10_r1, 86, 42, 9.0F, -18.6F, 41.0F, 1, 1, 4, 0.0F, false));
		Belt10_r1.cubeList.add(new ModelBox(Belt10_r1, 56, 146, 9.0F, -18.5F, 39.5F, 1, 1, 6, 0.0F, false));
		Belt10_r1.cubeList.add(new ModelBox(Belt10_r1, 67, 99, 9.0F, -18.5F, 37.8F, 1, 1, 2, -0.1F, false));

		Belt8_r1 = new ModelRenderer(this);
		Belt8_r1.setRotationPoint(10.5109F, 10.3474F, 0.0F);
		belt.addChild(Belt8_r1);
		setRotationAngle(Belt8_r1, 0.0F, 0.0F, 0.3346F);
		Belt8_r1.cubeList.add(new ModelBox(Belt8_r1, 12, 91, 7.1F, -19.0F, 41.0F, 2, 1, 4, 0.0F, false));

		Belt7_r1 = new ModelRenderer(this);
		Belt7_r1.setRotationPoint(4.4767F, 2.224F, 0.0F);
		belt.addChild(Belt7_r1);
		setRotationAngle(Belt7_r1, 0.0F, 0.0F, 0.8179F);
		Belt7_r1.cubeList.add(new ModelBox(Belt7_r1, 0, 91, 7.5F, -19.6F, 41.0F, 1, 1, 4, 0.0F, false));
		Belt7_r1.cubeList.add(new ModelBox(Belt7_r1, 56, 99, 7.5F, -19.5F, 37.8F, 1, 1, 2, -0.1F, false));
		Belt7_r1.cubeList.add(new ModelBox(Belt7_r1, 112, 146, 7.5F, -19.5F, 39.5F, 1, 1, 6, 0.0F, false));

		Belt2_r1 = new ModelRenderer(this);
		Belt2_r1.setRotationPoint(25.849F, 3.1224F, 40.9F);
		belt.addChild(Belt2_r1);
		setRotationAngle(Belt2_r1, 0.0F, 0.0F, 1.3464F);
		Belt2_r1.cubeList.add(new ModelBox(Belt2_r1, 60, 42, -5.7457F, -1.7382F, -3.1F, 1, 1, 2, -0.1F, false));
		Belt2_r1.cubeList.add(new ModelBox(Belt2_r1, 96, 136, -5.7457F, -1.7382F, -1.4F, 1, 1, 6, 0.0F, false));
		Belt2_r1.cubeList.add(new ModelBox(Belt2_r1, 14, 79, -5.7457F, -1.8663F, 0.1F, 1, 1, 4, 0.0F, false));
		Belt2_r1.cubeList.add(new ModelBox(Belt2_r1, 0, 79, -4.7457F, -1.7663F, 0.1F, 1, 1, 4, 0.0F, false));

		Belt2_r2 = new ModelRenderer(this);
		Belt2_r2.setRotationPoint(26.459F, 0.1526F, 42.75F);
		belt.addChild(Belt2_r2);
		setRotationAngle(Belt2_r2, 0.0F, 0.0F, 1.4773F);
		Belt2_r2.cubeList.add(new ModelBox(Belt2_r2, 60, 18, -0.9861F, -0.3828F, -4.95F, 1, 1, 2, -0.1F, false));
		Belt2_r2.cubeList.add(new ModelBox(Belt2_r2, 95, 111, -0.9861F, -0.3828F, -3.25F, 1, 1, 6, 0.0F, false));
		Belt2_r2.cubeList.add(new ModelBox(Belt2_r2, 60, 30, -1.0861F, -0.5109F, -1.75F, 1, 1, 4, 0.0F, false));
		Belt2_r2.cubeList.add(new ModelBox(Belt2_r2, 60, 25, -0.0861F, -0.4109F, -1.75F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		belt.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}