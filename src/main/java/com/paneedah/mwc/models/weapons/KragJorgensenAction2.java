package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KragJorgensenAction2 extends ModelWithAttachments {
	private final ModelRenderer action2;
	private final ModelRenderer ACTION51_r1;

	public KragJorgensenAction2() {
		textureWidth = 512;
		textureHeight = 256;

		action2 = new ModelRenderer(this);
		action2.setRotationPoint(0.0F, 24.0F, 0.0F);
		action2.cubeList.add(new ModelBox(action2, 200, 0, -2.5F, -41.3F, -21.2F, 1, 2, 1, 0.0F, true));
		action2.cubeList.add(new ModelBox(action2, 200, 0, -2.4F, -40.9F, -31.5F, 1, 1, 17, 0.0F, true));
		action2.cubeList.add(new ModelBox(action2, 200, 0, -1.8F, -40.8F, -14.0F, 2, 1, 2, 0.0F, true));
		action2.cubeList.add(new ModelBox(action2, 200, 0, -2.5F, -41.0F, -31.5F, 1, 1, 10, 0.0F, true));
		action2.cubeList.add(new ModelBox(action2, 200, 0, -2.6F, -40.9F, -31.5F, 1, 1, 17, 0.0F, true));
		action2.cubeList.add(new ModelBox(action2, 200, 0, -2.5F, -40.9F, -14.0F, 1, 1, 2, 0.0F, true));
		action2.cubeList.add(new ModelBox(action2, 200, 0, -2.7F, -41.2F, -21.5F, 1, 2, 8, 0.0F, true));
		action2.cubeList.add(new ModelBox(action2, 200, 0, -2.3F, -41.2F, -21.5F, 1, 2, 8, 0.0F, true));

		ACTION51_r1 = new ModelRenderer(this);
		ACTION51_r1.setRotationPoint(0.0F, 3.9903F, -6.4356F);
		action2.addChild(ACTION51_r1);
		setRotationAngle(ACTION51_r1, -0.1487F, 0.0F, 0.0F);
		ACTION51_r1.cubeList.add(new ModelBox(ACTION51_r1, 200, 0, -2.5F, -41.2F, -30.0F, 1, 1, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
