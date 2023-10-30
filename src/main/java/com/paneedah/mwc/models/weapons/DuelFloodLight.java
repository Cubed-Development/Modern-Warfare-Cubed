package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class DuelFloodLight extends ModelBase {
	private final ModelRenderer bone11;
	private final ModelRenderer bone10;
	private final ModelRenderer bone9;
	private final ModelRenderer bone8;
	private final ModelRenderer bone7;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;

	public DuelFloodLight() {
		textureWidth = 128;
		textureHeight = 128;

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone11, 0.0F, -0.7854F, 0.0F);
		

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.5F, -9.25F, 0.0F);
		bone11.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 28, 58, -1.0F, -12.0F, 0.0F, 1, 1, 1, 0.2F, false));
		bone10.cubeList.add(new ModelBox(bone10, 40, 0, -1.0F, -14.25F, 0.0F, 1, 22, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 0, 0, -10.0F, -15.25F, 0.0F, 19, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 16, 48, -8.0F, -15.5F, -1.0F, 1, 1, 3, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 12, 58, -8.0F, -18.25F, 0.0F, 1, 3, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 8, 58, 6.0F, -18.25F, 0.0F, 1, 3, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 4, 58, 1.0F, -19.25F, 0.0F, 1, 4, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 0, 58, -3.0F, -19.25F, 0.0F, 1, 4, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 8, 52, 6.0F, -15.5F, -1.0F, 1, 1, 3, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 8, 48, -1.0F, -15.5F, -1.0F, 1, 1, 3, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 4, 63, -1.0F, 4.0F, 0.0F, 1, 1, 1, 0.2F, false));
		bone10.cubeList.add(new ModelBox(bone10, 0, 63, -1.0F, -2.0F, 0.0F, 1, 1, 1, 0.2F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, -23.0F, 1.75F);
		bone11.addChild(bone9);
		setRotationAngle(bone9, -0.7854F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 16, 34, -2.5F, -0.1161F, -1.8839F, 5, 2, 2, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-4.5F, -30.0F, 0.3333F);
		bone11.addChild(bone8);
		setRotationAngle(bone8, -0.0873F, 0.1745F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 0, 23, -3.0F, -1.5F, -0.3333F, 6, 4, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 18, 38, -4.0434F, -2.5215F, -1.0881F, 1, 6, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 12, 38, 2.9566F, -2.5215F, -1.0881F, 1, 6, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 34, -3.0434F, 2.4785F, -1.0881F, 6, 1, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 29, -3.0434F, -2.5215F, -1.0881F, 6, 1, 2, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(4.5F, -30.0F, 0.3333F);
		bone11.addChild(bone7);
		setRotationAngle(bone7, -0.0873F, -0.1745F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 14, 23, -3.0F, -1.5F, -0.3333F, 6, 4, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 6, 38, 3.0434F, -2.5215F, -1.0881F, 1, 6, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 38, -3.9566F, -2.5215F, -1.0881F, 1, 6, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 30, 29, -2.9566F, 2.4785F, -1.0881F, 6, 1, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 28, 23, -2.9566F, -2.5215F, -1.0881F, 6, 1, 2, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.25F, -2.0F, -3.75F);
		bone11.addChild(bone3);
		setRotationAngle(bone3, -0.9599F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 24, 38, -0.7266F, -5.3943F, -0.5F, 1, 9, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 16, 63, -0.7266F, 2.6057F, -0.5F, 1, 1, 1, 0.2F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(4.005F, -2.5F, 2.8335F);
		bone11.addChild(bone2);
		setRotationAngle(bone2, 0.4538F, -0.192F, -1.0821F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 48, -0.9532F, -5.2887F, -0.5F, 1, 9, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 8, 63, -0.9532F, 2.7113F, -0.5F, 1, 1, 1, 0.2F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-3.6515F, -2.5F, 2.6213F);
		bone11.addChild(bone);
		setRotationAngle(bone, 0.4538F, 0.3316F, 1.0821F);
		bone.cubeList.add(new ModelBox(bone, 4, 48, -0.0468F, -5.2887F, -0.5F, 1, 9, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 63, -0.0468F, 2.7113F, -0.5F, 1, 1, 1, 0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone11.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
