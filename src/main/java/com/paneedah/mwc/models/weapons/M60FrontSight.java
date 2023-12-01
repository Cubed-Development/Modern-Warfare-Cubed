package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M60FrontSight extends ModelWithAttachments {
	private final ModelRenderer ironsight;
	private final ModelRenderer Ironsight17_r1;
	private final ModelRenderer Ironsight16_r1;
	private final ModelRenderer Ironsight15_r1;
	private final ModelRenderer Ironsight6_r1;
	private final ModelRenderer Ironsight4_r1;
	private final ModelRenderer Ironsightconnection;

	public M60FrontSight() {
		textureWidth = 330;
		textureHeight = 330;

		ironsight = new ModelRenderer(this);
		ironsight.setRotationPoint(-1.0F, 2.0F, -53.0F);
		ironsight.cubeList.add(new ModelBox(ironsight, 82, 94, -1.0F, -25.5F, 30.5F, 3, 3, 1, 0.0F, false));
		ironsight.cubeList.add(new ModelBox(ironsight, 44, 19, -1.2F, -26.5F, 30.0F, 3, 2, 2, 0.0F, false));
		ironsight.cubeList.add(new ModelBox(ironsight, 48, 49, 1.2F, -26.5F, 30.0F, 1, 2, 2, 0.0F, false));
		ironsight.cubeList.add(new ModelBox(ironsight, 20, 79, -1.6F, -22.9F, 30.5F, 1, 1, 1, 0.0F, false));
		ironsight.cubeList.add(new ModelBox(ironsight, 14, 79, -1.4F, -26.3F, 30.5F, 1, 1, 1, 0.0F, false));
		ironsight.cubeList.add(new ModelBox(ironsight, 76, 70, -1.1F, -29.5F, 30.5F, 1, 3, 1, 0.0F, false));
		ironsight.cubeList.add(new ModelBox(ironsight, 75, 56, 1.1F, -29.5F, 30.5F, 1, 3, 1, 0.0F, false));
		ironsight.cubeList.add(new ModelBox(ironsight, 0, 31, 0.1F, -30.5F, 30.5F, 2, 1, 1, 0.0F, false));
		ironsight.cubeList.add(new ModelBox(ironsight, 18, 29, -1.1F, -30.5F, 30.5F, 2, 1, 1, -0.002F, false));
		ironsight.cubeList.add(new ModelBox(ironsight, 100, 37, 0.0F, -27.0F, 30.0F, 1, 1, 2, 0.0F, false));
		ironsight.cubeList.add(new ModelBox(ironsight, 30, 19, -1.0F, -21.0F, 32.0F, 3, 2, 2, 0.0F, false));

		Ironsight17_r1 = new ModelRenderer(this);
		Ironsight17_r1.setRotationPoint(0.0F, 14.2696F, 24.5503F);
		ironsight.addChild(Ironsight17_r1);
		setRotationAngle(Ironsight17_r1, 0.7854F, 0.0F, 0.0F);
		Ironsight17_r1.cubeList.add(new ModelBox(Ironsight17_r1, 6, 79, 2.1F, -22.0F, 30.0F, 1, 1, 1, 0.0F, false));
		Ironsight17_r1.cubeList.add(new ModelBox(Ironsight17_r1, 47, 43, 2.0F, -22.5F, 29.5F, 1, 2, 2, 0.0F, false));

		Ironsight16_r1 = new ModelRenderer(this);
		Ironsight16_r1.setRotationPoint(24.6726F, -16.0336F, 0.0F);
		ironsight.addChild(Ironsight16_r1);
		setRotationAngle(Ironsight16_r1, 0.0F, 0.0F, -1.1525F);
		Ironsight16_r1.cubeList.add(new ModelBox(Ironsight16_r1, 100, 25, -1.0F, -27.0F, 30.0F, 1, 1, 2, 0.0F, false));

		Ironsight15_r1 = new ModelRenderer(this);
		Ironsight15_r1.setRotationPoint(-24.0787F, -16.9472F, 0.0F);
		ironsight.addChild(Ironsight15_r1);
		setRotationAngle(Ironsight15_r1, 0.0F, 0.0F, 1.1525F);
		Ironsight15_r1.cubeList.add(new ModelBox(Ironsight15_r1, 100, 28, 1.0F, -27.0F, 30.0F, 1, 1, 2, 0.0F, false));

		Ironsight6_r1 = new ModelRenderer(this);
		Ironsight6_r1.setRotationPoint(0.0F, -29.2175F, -6.5373F);
		ironsight.addChild(Ironsight6_r1);
		setRotationAngle(Ironsight6_r1, -0.7854F, 0.0F, 0.0F);
		Ironsight6_r1.cubeList.add(new ModelBox(Ironsight6_r1, 74, 22, -1.5F, -22.5F, 30.6F, 4, 1, 1, 0.0F, false));
		Ironsight6_r1.cubeList.add(new ModelBox(Ironsight6_r1, 74, 47, -1.5F, -22.5F, 31.0F, 4, 1, 1, 0.0F, false));

		Ironsight4_r1 = new ModelRenderer(this);
		Ironsight4_r1.setRotationPoint(0.0F, 14.6231F, 24.6967F);
		ironsight.addChild(Ironsight4_r1);
		setRotationAngle(Ironsight4_r1, 0.7854F, 0.0F, 0.0F);
		Ironsight4_r1.cubeList.add(new ModelBox(Ironsight4_r1, 82, 92, -1.5F, -22.5F, 30.0F, 4, 1, 1, 0.0F, false));

		Ironsightconnection = new ModelRenderer(this);
		Ironsightconnection.setRotationPoint(0.0F, 0.0F, 0.0F);
		ironsight.addChild(Ironsightconnection);
		Ironsightconnection.cubeList.add(new ModelBox(Ironsightconnection, 12, 0, -1.5F, -22.5F, 30.0F, 4, 5, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ironsight.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}