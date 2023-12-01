package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M60E4Guard extends ModelWithAttachments {
	private final ModelRenderer m60e4guard;
	private final ModelRenderer Guard10_r1;
	private final ModelRenderer Guard9_r1;
	private final ModelRenderer Guard4_r1;
	private final ModelRenderer Guard3_r1;

	public M60E4Guard() {
		textureWidth = 330;
		textureHeight = 330;

		m60e4guard = new ModelRenderer(this);
		m60e4guard.setRotationPoint(-1.0F, 2.0F, -53.0F);
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 60, 14, -2.0F, -9.5F, -7.0F, 5, 1, 7, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 0, 135, 2.5F, -14.5F, 0.0F, 1, 1, 23, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 116, 24, -2.5F, -14.5F, 0.0F, 1, 1, 23, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 94, 95, -2.5F, -15.5F, 0.0F, 1, 1, 2, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 94, 92, -2.5F, -15.5F, 4.0F, 1, 1, 2, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 74, 86, -2.5F, -15.5F, 8.0F, 1, 1, 2, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 48, 82, -2.5F, -15.5F, 12.0F, 1, 1, 2, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 40, 82, -2.5F, -15.5F, 16.0F, 1, 1, 2, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 56, 86, -2.5F, -15.5F, 20.0F, 1, 1, 3, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 48, 79, 2.5F, -15.5F, 0.0F, 1, 1, 2, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 40, 79, 2.5F, -15.5F, 4.0F, 1, 1, 2, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 77, 17, 2.5F, -15.5F, 8.0F, 1, 1, 2, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 77, 14, 2.5F, -15.5F, 12.0F, 1, 1, 2, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 74, 75, 2.5F, -15.5F, 16.0F, 1, 1, 2, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 69, 75, 2.5F, -15.5F, 20.0F, 1, 1, 3, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 56, 74, 2.2F, -12.0F, 1.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 72, 25, 2.2F, -12.0F, 3.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 72, 0, 2.2F, -12.0F, 5.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 69, 56, 2.2F, -12.0F, 7.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 66, 30, 2.2F, -12.0F, 9.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 66, 25, 2.2F, -12.0F, 11.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 66, 0, 2.2F, -12.0F, 13.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 60, 30, 2.2F, -12.0F, 15.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 60, 25, 2.2F, -12.0F, 17.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 60, 0, 2.2F, -12.0F, 19.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 56, 55, 2.2F, -12.0F, 21.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 49, 55, -2.2F, -12.0F, 1.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 42, 55, -2.2F, -12.0F, 3.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 6, 55, -2.2F, -12.0F, 5.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 0, 55, -2.2F, -12.0F, 7.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 50, 13, -2.2F, -12.0F, 9.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 49, 0, -2.2F, -12.0F, 11.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 44, 13, -2.2F, -12.0F, 13.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 26, 43, -2.2F, -12.0F, 15.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 36, 13, -2.2F, -12.0F, 17.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 30, 13, -2.2F, -12.0F, 19.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 0, 18, -2.2F, -12.0F, 21.0F, 1, 3, 1, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 36, 221, -1.0333F, -9.0F, -7.0F, 3, 1, 31, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 260, 0, -2.0F, -13.5F, 0.0F, 5, 5, 24, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 112, 82, -2.5F, -18.5F, 0.0F, 1, 3, 23, 0.0F, false));
		m60e4guard.cubeList.add(new ModelBox(m60e4guard, 112, 56, 2.5F, -18.5F, 0.0F, 1, 3, 23, 0.0F, false));

		Guard10_r1 = new ModelRenderer(this);
		Guard10_r1.setRotationPoint(7.5883F, -22.8127F, 0.0F);
		m60e4guard.addChild(Guard10_r1);
		setRotationAngle(Guard10_r1, 0.0F, 0.0F, -2.1331F);
		Guard10_r1.cubeList.add(new ModelBox(Guard10_r1, 112, 112, -3.5F, -13.5F, 0.0F, 1, 1, 23, 0.0F, false));

		Guard9_r1 = new ModelRenderer(this);
		Guard9_r1.setRotationPoint(-6.0552F, -23.6587F, 0.0F);
		m60e4guard.addChild(Guard9_r1);
		setRotationAngle(Guard9_r1, 0.0F, 0.0F, 2.1331F);
		Guard9_r1.cubeList.add(new ModelBox(Guard9_r1, 116, 0, 3.5F, -13.5F, 0.0F, 1, 1, 23, 0.0F, false));

		Guard4_r1 = new ModelRenderer(this);
		Guard4_r1.setRotationPoint(0.1393F, -16.033F, 0.0F);
		m60e4guard.addChild(Guard4_r1);
		setRotationAngle(Guard4_r1, 0.0F, 0.0F, 2.6769F);
		Guard4_r1.cubeList.add(new ModelBox(Guard4_r1, 228, 256, 0.9667F, -8.0F, -7.0F, 1, 1, 31, 0.0F, false));

		Guard3_r1 = new ModelRenderer(this);
		Guard3_r1.setRotationPoint(1.6284F, -15.6147F, 0.0F);
		m60e4guard.addChild(Guard3_r1);
		setRotationAngle(Guard3_r1, 0.0F, 0.0F, -2.6769F);
		Guard3_r1.cubeList.add(new ModelBox(Guard3_r1, 0, 258, -1.0333F, -8.0F, -7.0F, 1, 1, 31, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		m60e4guard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}