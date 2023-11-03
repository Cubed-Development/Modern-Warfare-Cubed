package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M60Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer Bolt6_r1;

	public M60Action() {
		textureWidth = 340;
		textureHeight = 340;

		action = new ModelRenderer(this);
		action.setRotationPoint(-5.0833F, -10.4667F, -10.581F);
		action.cubeList.add(new ModelBox(action, 67, 100, -2.9167F, -0.3333F, -2.419F, 5, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 0, 55, 0.5833F, -0.8333F, -2.419F, 1, 2, 24, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 12, 100, -2.9167F, -0.7333F, -2.419F, 5, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 12, 98, -2.9167F, -0.5333F, -2.219F, 5, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 72, 8, -2.9167F, -0.5333F, -2.619F, 5, 1, 1, 0.0F, false));

		Bolt6_r1 = new ModelRenderer(this);
		Bolt6_r1.setRotationPoint(4.0833F, 36.4534F, -22.1281F);
		action.addChild(Bolt6_r1);
		setRotationAngle(Bolt6_r1, 0.7854F, 0.0F, 0.0F);
		Bolt6_r1.cubeList.add(new ModelBox(Bolt6_r1, 60, 14, -4.0F, -12.5F, 39.1F, 1, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}