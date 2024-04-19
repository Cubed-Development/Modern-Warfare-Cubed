package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M79Sight extends ModelWithAttachments {
	private final ModelRenderer sight;
	private final ModelRenderer MAIN2SCNDSCOPE6_r1_r1;
	private final ModelRenderer Cartridge_r1;

	public M79Sight() {
		textureWidth = 256;
		textureHeight = 200;

		sight = new ModelRenderer(this);
		sight.setRotationPoint(0.0F, 24.0F, 0.0F);
		sight.cubeList.add(new ModelBox(sight, 60, 15, -2.0F, -51.0F, -41.5F, 1, 14, 1, 0.0F, false));
		sight.cubeList.add(new ModelBox(sight, 56, 15, 2.0F, -51.0F, -41.5F, 1, 14, 1, 0.0F, false));
		sight.cubeList.add(new ModelBox(sight, 74, 48, -1.0F, -51.0F, -41.5F, 3, 1, 1, 0.0F, false));
		sight.cubeList.add(new ModelBox(sight, 46, 38, 1.6F, -50.2F, -41.5F, 1, 1, 1, -0.002F, false));
		sight.cubeList.add(new ModelBox(sight, 112, 43, -2.8F, -42.7F, -42.0F, 6, 1, 2, -0.2F, false));
		sight.cubeList.add(new ModelBox(sight, 0, 37, 0.6F, -43.1F, -42.1F, 1, 1, 1, -0.36F, false));
		sight.cubeList.add(new ModelBox(sight, 31, 14, -0.6F, -43.1F, -42.1F, 1, 1, 1, -0.36F, false));
		sight.cubeList.add(new ModelBox(sight, 40, 46, -0.4F, -42.9F, -42.1F, 2, 1, 2, -0.36F, false));
		sight.cubeList.add(new ModelBox(sight, 11, 28, -0.6F, -42.9F, -40.9F, 1, 1, 1, -0.36F, false));
		sight.cubeList.add(new ModelBox(sight, 30, 30, -0.4F, -42.9F, -40.9F, 2, 1, 1, -0.36F, false));
		sight.cubeList.add(new ModelBox(sight, 43, 29, -0.6F, -42.9F, -42.1F, 1, 1, 2, -0.36F, false));
		sight.cubeList.add(new ModelBox(sight, 0, 35, -0.4F, -43.1F, -42.1F, 1, 1, 1, -0.36F, false));
		sight.cubeList.add(new ModelBox(sight, 12, 35, 0.4F, -43.1F, -42.1F, 1, 1, 1, -0.36F, false));
		sight.cubeList.add(new ModelBox(sight, 24, 44, -3.0F, -43.0F, -41.3F, 1, 1, 1, 0.1F, false));
		sight.cubeList.add(new ModelBox(sight, 0, 44, -3.0F, -43.0F, -41.7F, 1, 1, 1, 0.1F, false));
		sight.cubeList.add(new ModelBox(sight, 12, 37, 3.0F, -43.0F, -41.3F, 1, 1, 1, 0.1F, false));
		sight.cubeList.add(new ModelBox(sight, 24, 42, 3.0F, -43.0F, -41.7F, 1, 1, 1, 0.1F, false));
		sight.cubeList.add(new ModelBox(sight, 0, 42, -4.5F, -37.7F, -41.5F, 10, 1, 1, 0.0F, false));

		MAIN2SCNDSCOPE6_r1_r1 = new ModelRenderer(this);
		MAIN2SCNDSCOPE6_r1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		sight.addChild(MAIN2SCNDSCOPE6_r1_r1);
		setRotationAngle(MAIN2SCNDSCOPE6_r1_r1, 0.7854F, 0.0F, 0.0F);
		MAIN2SCNDSCOPE6_r1_r1.cubeList.add(new ModelBox(MAIN2SCNDSCOPE6_r1_r1, 43, 25, -5.5F, -56.2843F, -3.6568F, 1, 2, 2, 0.0F, false));

		Cartridge_r1 = new ModelRenderer(this);
		Cartridge_r1.setRotationPoint(-1.5F, -50.5F, -40.2F);
		sight.addChild(Cartridge_r1);
		setRotationAngle(Cartridge_r1, 0.0F, 0.0F, -0.829F);
		Cartridge_r1.cubeList.add(new ModelBox(Cartridge_r1, 0, 46, -0.6F, -0.4F, -0.7F, 1, 1, 1, -0.15F, false));
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
