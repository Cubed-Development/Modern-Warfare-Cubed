package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AUGGrip extends ModelWithAttachments {
	private final ModelRenderer grip;
	private final ModelRenderer grip8_r1;
	private final ModelRenderer grip7_r1;
	private final ModelRenderer grip6_r1;
	private final ModelRenderer grip5_r1;
	private final ModelRenderer grip4_r1;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip10_r1;

	public AUGGrip() {
		textureWidth = 300;
		textureHeight = 300;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(-1.501F, 0.3335F, -26.152F);
		grip.cubeList.add(new ModelBox(grip, 5, 39, -0.499F, -7.3335F, -0.348F, 1, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 89, 40, -1.509F, -6.3335F, -1.148F, 3, 12, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 88, 71, -1.499F, 4.6665F, -1.848F, 3, 1, 1, 0.0F, false));

		grip8_r1 = new ModelRenderer(this);
		grip8_r1.setRotationPoint(1.501F, 19.1661F, -24.2081F);
		grip.addChild(grip8_r1);
		setRotationAngle(grip8_r1, -1.8589F, 0.0F, 0.0F);
		grip8_r1.cubeList.add(new ModelBox(grip8_r1, 72, 82, -3.0F, -21.05F, -23.5F, 3, 1, 3, 0.0F, false));

		grip7_r1 = new ModelRenderer(this);
		grip7_r1.setRotationPoint(1.501F, 27.3539F, -17.9603F);
		grip.addChild(grip7_r1);
		setRotationAngle(grip7_r1, -1.3756F, 0.0F, 0.0F);
		grip7_r1.cubeList.add(new ModelBox(grip7_r1, 72, 60, -3.0F, -25.0F, -24.3F, 3, 1, 4, 0.0F, false));

		grip6_r1 = new ModelRenderer(this);
		grip6_r1.setRotationPoint(1.501F, 16.8667F, 30.5648F);
		grip.addChild(grip6_r1);
		setRotationAngle(grip6_r1, 0.2231F, 0.0F, 0.0F);
		grip6_r1.cubeList.add(new ModelBox(grip6_r1, 18, 74, -3.0F, -23.1F, -28.15F, 3, 4, 1, 0.0F, false));

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(1.501F, 30.5256F, 17.3337F);
		grip.addChild(grip5_r1);
		setRotationAngle(grip5_r1, -0.2974F, 0.0F, 0.0F);
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 86, 0, -3.0F, -26.0F, -27.3F, 3, 3, 1, 0.0F, false));

		grip4_r1 = new ModelRenderer(this);
		grip4_r1.setRotationPoint(1.501F, 29.9828F, 14.9523F);
		grip.addChild(grip4_r1);
		setRotationAngle(grip4_r1, -0.3346F, 0.0F, 0.0F);
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 30, 77, -3.0F, -30.0F, -24.3F, 3, 4, 1, 0.0F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(1.501F, 30.7983F, -17.4735F);
		grip.addChild(grip3_r1);
		setRotationAngle(grip3_r1, -1.1525F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 12, 97, -3.0F, -30.0F, -27.3F, 3, 1, 3, 0.0F, false));

		grip10_r1 = new ModelRenderer(this);
		grip10_r1.setRotationPoint(1.501F, 2.198F, 31.8996F);
		grip.addChild(grip10_r1);
		setRotationAngle(grip10_r1, 0.6692F, 0.0F, 0.0F);
		grip10_r1.cubeList.add(new ModelBox(grip10_r1, 88, 69, -3.0F, -19.0F, -28.0F, 3, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
