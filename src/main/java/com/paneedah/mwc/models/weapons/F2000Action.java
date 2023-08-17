package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class F2000Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action3_r1;

	public F2000Action() {
		textureWidth = 300;
		textureHeight = 300;

		action = new ModelRenderer(this);
		action.setRotationPoint(2.3942F, -5.1945F, -14.05F);
		

		action3_r1 = new ModelRenderer(this);
		action3_r1.setRotationPoint(12.3525F, 26.173F, 14.05F);
		action.addChild(action3_r1);
		setRotationAngle(action3_r1, 0.0F, 0.0F, -0.5205F);
		action3_r1.cubeList.add(new ModelBox(action3_r1, 86, 16, 1.9F, -29.8F, -14.2F, 1, 1, 2, 0.0F, false));
		action3_r1.cubeList.add(new ModelBox(action3_r1, 53, 32, 1.7F, -29.6F, -17.4F, 1, 1, 5, 0.0F, false));
		action3_r1.cubeList.add(new ModelBox(action3_r1, 0, 70, 1.6983F, -29.1F, -17.4F, 1, 1, 5, 0.0F, false));
		action3_r1.cubeList.add(new ModelBox(action3_r1, 14, 86, 1.9F, -28.9F, -14.2F, 1, 1, 2, 0.0F, false));
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
