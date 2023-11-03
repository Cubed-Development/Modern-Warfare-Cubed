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
	private final ModelRenderer Belt13_r1;
	private final ModelRenderer Belt12_r1;
	private final ModelRenderer Belt10_r1;
	private final ModelRenderer Belt8_r1;
	private final ModelRenderer Belt7_r1;

	public M60Belt() {
		textureWidth = 340;
		textureHeight = 340;

		belt = new ModelRenderer(this);
		belt.setRotationPoint(-17.3345F, -11.8642F, -53.0F);
		belt.cubeList.add(new ModelBox(belt, 56, 74, 19.8345F, -6.1358F, 37.8F, 1, 1, 2, -0.1F, false));
		belt.cubeList.add(new ModelBox(belt, 112, 145, 19.8345F, -6.1358F, 39.5F, 1, 1, 6, 0.0F, false));
		belt.cubeList.add(new ModelBox(belt, 0, 73, 19.8345F, -6.3358F, 41.0F, 1, 1, 4, 0.0F, false));

		Belt16_r1 = new ModelRenderer(this);
		Belt16_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		belt.addChild(Belt16_r1);
		setRotationAngle(Belt16_r1, 0.0F, 0.0F, 1.1525F);
		Belt16_r1.cubeList.add(new ModelBox(Belt16_r1, 14, 68, 2.4F, -19.5F, 41.0F, 1, 1, 4, 0.0F, false));
		Belt16_r1.cubeList.add(new ModelBox(Belt16_r1, 25, 145, 2.5F, -19.5F, 39.5F, 1, 1, 6, 0.0F, false));
		Belt16_r1.cubeList.add(new ModelBox(Belt16_r1, 60, 18, 2.5F, -19.5F, 37.8F, 1, 1, 2, -0.1F, false));
		Belt16_r1.cubeList.add(new ModelBox(Belt16_r1, 0, 68, 2.5F, -19.4F, 41.0F, 1, 1, 4, 0.0F, false));

		Belt15_r1 = new ModelRenderer(this);
		Belt15_r1.setRotationPoint(0.3336F, -0.4819F, 0.0F);
		belt.addChild(Belt15_r1);
		setRotationAngle(Belt15_r1, 0.0F, 0.0F, 1.1154F);
		Belt15_r1.cubeList.add(new ModelBox(Belt15_r1, 60, 0, 3.5F, -20.0F, 41.0F, 1, 2, 4, 0.0F, false));

		Belt13_r1 = new ModelRenderer(this);
		Belt13_r1.setRotationPoint(13.4318F, 12.8285F, 0.0F);
		belt.addChild(Belt13_r1);
		setRotationAngle(Belt13_r1, 0.0F, 0.0F, 0.1487F);
		Belt13_r1.cubeList.add(new ModelBox(Belt13_r1, 14, 73, 4.5F, -20.0F, 41.0F, 1, 1, 4, 0.0F, false));
		Belt13_r1.cubeList.add(new ModelBox(Belt13_r1, 73, 43, 5.5F, -20.1F, 41.0F, 1, 1, 4, 0.0F, false));
		Belt13_r1.cubeList.add(new ModelBox(Belt13_r1, 145, 119, 5.5F, -20.0F, 39.5F, 1, 1, 6, 0.0F, false));
		Belt13_r1.cubeList.add(new ModelBox(Belt13_r1, 77, 14, 5.5F, -20.0F, 37.8F, 1, 1, 2, -0.1F, false));

		Belt12_r1 = new ModelRenderer(this);
		Belt12_r1.setRotationPoint(9.5493F, 10.1433F, 0.0F);
		belt.addChild(Belt12_r1);
		setRotationAngle(Belt12_r1, 0.0F, 0.0F, 0.3718F);
		Belt12_r1.cubeList.add(new ModelBox(Belt12_r1, 73, 25, 6.5F, -19.9F, 41.0F, 1, 1, 4, 0.0F, false));

		Belt10_r1 = new ModelRenderer(this);
		Belt10_r1.setRotationPoint(4.8224F, -3.0529F, 0.0F);
		belt.addChild(Belt10_r1);
		setRotationAngle(Belt10_r1, 0.0F, 0.0F, 1.041F);
		Belt10_r1.cubeList.add(new ModelBox(Belt10_r1, 0, 81, 10.0F, -18.5F, 41.0F, 1, 1, 4, 0.0F, false));
		Belt10_r1.cubeList.add(new ModelBox(Belt10_r1, 14, 81, 9.0F, -18.6F, 41.0F, 1, 1, 4, 0.0F, false));
		Belt10_r1.cubeList.add(new ModelBox(Belt10_r1, 145, 126, 9.0F, -18.5F, 39.5F, 1, 1, 6, 0.0F, false));
		Belt10_r1.cubeList.add(new ModelBox(Belt10_r1, 77, 17, 9.0F, -18.5F, 37.8F, 1, 1, 2, -0.1F, false));

		Belt8_r1 = new ModelRenderer(this);
		Belt8_r1.setRotationPoint(10.5109F, 10.3474F, 0.0F);
		belt.addChild(Belt8_r1);
		setRotationAngle(Belt8_r1, 0.0F, 0.0F, 0.3346F);
		Belt8_r1.cubeList.add(new ModelBox(Belt8_r1, 12, 93, 7.1F, -19.0F, 41.0F, 2, 1, 4, 0.0F, false));

		Belt7_r1 = new ModelRenderer(this);
		Belt7_r1.setRotationPoint(4.4767F, 2.224F, 0.0F);
		belt.addChild(Belt7_r1);
		setRotationAngle(Belt7_r1, 0.0F, 0.0F, 0.8179F);
		Belt7_r1.cubeList.add(new ModelBox(Belt7_r1, 69, 81, 7.5F, -19.6F, 41.0F, 1, 1, 4, 0.0F, false));
		Belt7_r1.cubeList.add(new ModelBox(Belt7_r1, 78, 39, 7.5F, -19.5F, 37.8F, 1, 1, 2, -0.1F, false));
		Belt7_r1.cubeList.add(new ModelBox(Belt7_r1, 33, 146, 7.5F, -19.5F, 39.5F, 1, 1, 6, 0.0F, false));
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