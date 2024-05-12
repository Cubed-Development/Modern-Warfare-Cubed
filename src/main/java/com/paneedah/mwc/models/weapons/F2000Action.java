package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class F2000Action extends ModelWithAttachments {
	private final ModelRenderer bone3;
	private final ModelRenderer action;
	private final ModelRenderer action3_r1_r1;

	public F2000Action() {
		textureWidth = 290;
		textureHeight = 290;

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		action = new ModelRenderer(this);
		action.setRotationPoint(2.3942F, -29.1945F, -14.05F);
		bone3.addChild(action);
		

		action3_r1_r1 = new ModelRenderer(this);
		action3_r1_r1.setRotationPoint(1.0613F, 36.1281F, 14.05F);
		action.addChild(action3_r1_r1);
		setRotationAngle(action3_r1_r1, 0.0F, 0.0F, -0.5205F);
		action3_r1_r1.cubeList.add(new ModelBox(action3_r1_r1, 128, 82, 20.1279F, -38.8945F, -21.2F, 1, 1, 2, 0.0F, false));
		action3_r1_r1.cubeList.add(new ModelBox(action3_r1_r1, 103, 38, 19.9279F, -38.6945F, -24.4F, 1, 1, 5, 0.0F, false));
		action3_r1_r1.cubeList.add(new ModelBox(action3_r1_r1, 103, 32, 19.9262F, -38.1945F, -24.4F, 1, 1, 5, 0.0F, false));
		action3_r1_r1.cubeList.add(new ModelBox(action3_r1_r1, 128, 78, 20.1279F, -37.9945F, -21.2F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}