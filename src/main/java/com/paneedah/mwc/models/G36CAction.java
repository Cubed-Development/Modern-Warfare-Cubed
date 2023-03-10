package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G36CAction extends ModelWithAttachments {
	private final QRenderer action;

	public G36CAction() {
		textureWidth = 220;
		textureHeight = 220;

		action = new QRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 71, 31, -2.5F, -40.5F, -36.5F, 2, 1, 5, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 110, 82, -2.5F, -40.3F, -31.5F, 2, 1, 2, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 72, 47, -3.0F, -40.3F, -29.5F, 3, 2, 6, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 116, 127, -3.0F, -40.5F, -23.5F, 3, 2, 11, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 94, 56, -3.3F, -36.9F, -24.5F, 2, 3, 13, 0.0F, false));
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
