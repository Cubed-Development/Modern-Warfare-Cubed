package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M712action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action6_r1;
	private final ModelRenderer action5_r1;

	public M712action() {
		textureWidth = 512;
		textureHeight = 256;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 0, 0, -1.7F, -45.5F, -28.2F, 2, 2, 25, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 0, -4.2F, -46.1F, -3.5F, 2, 4, 1, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 0, -0.8F, -46.1F, -3.5F, 2, 4, 1, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 0, -2.5F, -46.1F, -3.5F, 2, 1, 1, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 0, -2.5F, -43.1F, -3.5F, 2, 1, 1, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 0, -2.5F, -45.6F, -3.6F, 2, 3, 1, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 0, -3.3F, -45.5F, -28.2F, 3, 2, 25, 0.0F, true));

		action6_r1 = new ModelRenderer(this);
		action6_r1.setRotationPoint(-5.4021F, 0.0F, -7.2376F);
		action.addChild(action6_r1);
		setRotationAngle(action6_r1, -3.1416F, 0.7854F, 3.1416F);
		action6_r1.cubeList.add(new ModelBox(action6_r1, 0, 0, -4.2F, -46.1F, -2.5F, 1, 4, 1, 0.0F, true));

		action5_r1 = new ModelRenderer(this);
		action5_r1.setRotationPoint(3.8163F, 0.0F, -3.4192F);
		action.addChild(action5_r1);
		setRotationAngle(action5_r1, -3.1416F, 0.7854F, 3.1416F);
		action5_r1.cubeList.add(new ModelBox(action5_r1, 0, 0, 1.2F, -46.1F, -2.5F, 1, 4, 1, 0.0F, true));
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