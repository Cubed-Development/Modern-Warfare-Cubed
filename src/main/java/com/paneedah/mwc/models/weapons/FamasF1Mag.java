package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FamasF1Mag extends ModelWithAttachments {
	private final ModelRenderer mag;
	private final ModelRenderer cube_r149;
	private final ModelRenderer cube_r150;
	private final ModelRenderer cube_r151;
	private final ModelRenderer bone89;
	private final ModelRenderer bone90;

	public FamasF1Mag() {
		textureWidth = 256;
		textureHeight = 256;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 24.0F, 0.0F);
		mag.cubeList.add(new ModelBox(mag, 88, 142, -3.0F, -34.113F, 10.8059F, 3, 18, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 104, -2.9F, -34.115F, 11.8059F, 2, 18, 7, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 22, 104, -1.1F, -34.11F, 11.8059F, 1, 18, 7, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 37, 143, -2.9F, -16.1142F, 13.0559F, 2, 1, 5, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 8, 143, -2.1F, -16.1142F, 13.0559F, 2, 1, 5, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 96, 142, -2.9F, -34.0F, 18.0F, 2, 20, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 129, 0, -1.1F, -34.001F, 18.001F, 1, 20, 1, 0.0F, false));

		cube_r149 = new ModelRenderer(this);
		cube_r149.setRotationPoint(-0.5F, -16.145F, 11.5123F);
		mag.addChild(cube_r149);
		setRotationAngle(cube_r149, -0.7418F, 0.0F, 0.0F);
		cube_r149.cubeList.add(new ModelBox(cube_r149, 8, 96, -2.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

		cube_r150 = new ModelRenderer(this);
		cube_r150.setRotationPoint(-0.5F, -14.8445F, 16.5328F);
		mag.addChild(cube_r150);
		setRotationAngle(cube_r150, -0.2182F, 0.0F, 0.0F);
		cube_r150.cubeList.add(new ModelBox(cube_r150, 0, 96, -2.5F, -0.5F, -5.0F, 3, 1, 1, 0.0F, false));

		cube_r151 = new ModelRenderer(this);
		cube_r151.setRotationPoint(0.4F, -14.7046F, 17.1319F);
		mag.addChild(cube_r151);
		setRotationAngle(cube_r151, -0.2182F, 0.0F, 0.0F);
		cube_r151.cubeList.add(new ModelBox(cube_r151, 85, 104, -2.5F, -0.5F, -5.0F, 2, 1, 6, 0.0F, false));
		cube_r151.cubeList.add(new ModelBox(cube_r151, 109, 76, -3.3F, -0.4984F, -5.0F, 2, 1, 6, 0.0F, false));

		bone89 = new ModelRenderer(this);
		bone89.setRotationPoint(0.25F, -15.1142F, 13.8059F);
		mag.addChild(bone89);
		bone89.cubeList.add(new ModelBox(bone89, 85, 118, -1.11F, -19.0F, -2.9059F, 1, 18, 2, 0.0F, false));
		bone89.cubeList.add(new ModelBox(bone89, 82, 142, -1.11F, -18.25F, 3.0F, 1, 19, 2, 0.0F, false));
		bone89.cubeList.add(new ModelBox(bone89, 137, 0, -1.11F, -19.0F, 0.0F, 1, 19, 2, 0.0F, false));

		bone90 = new ModelRenderer(this);
		bone90.setRotationPoint(-3.25F, -15.1142F, 13.8059F);
		mag.addChild(bone90);
		bone90.cubeList.add(new ModelBox(bone90, 86, 11, 0.11F, -19.0F, -2.9059F, 1, 18, 2, 0.0F, false));
		bone90.cubeList.add(new ModelBox(bone90, 123, 0, 0.11F, -18.25F, 3.0F, 1, 19, 2, 0.0F, false));
		bone90.cubeList.add(new ModelBox(bone90, 70, 114, 0.11F, -19.0F, 0.0F, 1, 19, 2, 0.0F, false));
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
