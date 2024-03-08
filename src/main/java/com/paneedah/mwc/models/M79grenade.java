package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M79grenade extends ModelWithAttachments {
	private final ModelRenderer grenade;
	private final ModelRenderer GRENADE15_r1;
	private final ModelRenderer GRENADE14_r1;
	private final ModelRenderer GRENADE13_r1;
	private final ModelRenderer GRENADE12_r1;
	private final ModelRenderer GRENADE11_r1;

	public M79grenade() {
		textureWidth = 256;
		textureHeight = 200;

		grenade = new ModelRenderer(this);
		grenade.setRotationPoint(0.5F, 7.3951F, 43.4933F);
		

		GRENADE15_r1 = new ModelRenderer(this);
		GRENADE15_r1.setRotationPoint(-0.0001F, 0.1049F, -37.0434F);
		grenade.addChild(GRENADE15_r1);
		setRotationAngle(GRENADE15_r1, 1.5708F, 0.7679F, 0.0F);
		GRENADE15_r1.cubeList.add(new ModelBox(GRENADE15_r1, 75, 15, 19.2339F, -20.3505F, 15.0502F, 2, 1, 2, 0.0F, false));

		GRENADE14_r1 = new ModelRenderer(this);
		GRENADE14_r1.setRotationPoint(-0.0001F, 0.1049F, -37.0434F);
		grenade.addChild(GRENADE14_r1);
		setRotationAngle(GRENADE14_r1, 1.5708F, -0.7679F, 0.0F);
		GRENADE14_r1.cubeList.add(new ModelBox(GRENADE14_r1, 73, 73, -21.2109F, -20.3266F, 15.0502F, 2, 1, 2, 0.0F, false));

		GRENADE13_r1 = new ModelRenderer(this);
		GRENADE13_r1.setRotationPoint(-0.0001F, 0.1049F, -37.0434F);
		grenade.addChild(GRENADE13_r1);
		setRotationAngle(GRENADE13_r1, 0.8029F, 0.0F, 0.0F);
		GRENADE13_r1.cubeList.add(new ModelBox(GRENADE13_r1, 42, 73, -0.9999F, -31.4754F, -9.6649F, 2, 1, 2, 0.0F, false));

		GRENADE12_r1 = new ModelRenderer(this);
		GRENADE12_r1.setRotationPoint(-0.0001F, 0.1049F, -37.0434F);
		grenade.addChild(GRENADE12_r1);
		setRotationAngle(GRENADE12_r1, 2.3387F, 0.0F, 0.0F);
		GRENADE12_r1.cubeList.add(new ModelBox(GRENADE12_r1, 61, 72, -0.9999F, -9.2712F, 30.708F, 2, 1, 2, 0.0F, false));

		GRENADE11_r1 = new ModelRenderer(this);
		GRENADE11_r1.setRotationPoint(-0.0001F, 0.1049F, -37.0434F);
		grenade.addChild(GRENADE11_r1);
		setRotationAngle(GRENADE11_r1, 1.5708F, 0.0F, 0.0F);
		GRENADE11_r1.cubeList.add(new ModelBox(GRENADE11_r1, 0, 51, -1.4999F, -28.7999F, 14.5502F, 3, 4, 3, 0.0F, false));
		GRENADE11_r1.cubeList.add(new ModelBox(GRENADE11_r1, 56, 8, -1.9999F, -28.4999F, 15.0502F, 4, 3, 2, 0.0F, false));
		GRENADE11_r1.cubeList.add(new ModelBox(GRENADE11_r1, 24, 42, -0.9999F, -28.4999F, 14.0502F, 2, 3, 4, 0.0F, false));
		GRENADE11_r1.cubeList.add(new ModelBox(GRENADE11_r1, 56, 68, -1.4999F, -20.4999F, 14.5502F, 3, 1, 3, 0.0F, false));
		GRENADE11_r1.cubeList.add(new ModelBox(GRENADE11_r1, 0, 35, -1.9999F, -19.4999F, 14.0502F, 4, 1, 4, 0.0F, false));
		GRENADE11_r1.cubeList.add(new ModelBox(GRENADE11_r1, 31, 11, -1.4999F, -19.4999F, 13.5502F, 3, 1, 5, 0.0F, false));
		GRENADE11_r1.cubeList.add(new ModelBox(GRENADE11_r1, 87, 97, -2.4999F, -19.4999F, 14.5502F, 5, 1, 3, 0.0F, false));
		GRENADE11_r1.cubeList.add(new ModelBox(GRENADE11_r1, 90, 69, -1.9999F, -25.4999F, 14.0502F, 4, 5, 4, 0.0F, false));
		GRENADE11_r1.cubeList.add(new ModelBox(GRENADE11_r1, 5, 70, -0.9999F, -29.4999F, 15.0502F, 2, 1, 2, 0.0F, false));
		GRENADE11_r1.cubeList.add(new ModelBox(GRENADE11_r1, 0, 25, -1.4999F, -25.4999F, 13.5502F, 3, 5, 5, 0.0F, false));
		GRENADE11_r1.cubeList.add(new ModelBox(GRENADE11_r1, 112, 28, -2.4999F, -25.4999F, 14.5502F, 5, 5, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grenade.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}