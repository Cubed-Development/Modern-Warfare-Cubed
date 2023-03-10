package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SIG556Grip extends ModelWithAttachments {
	private final QRenderer grip;
	private final ModelRenderer grip5_r1;
	private final ModelRenderer grip6_r1;
	private final ModelRenderer grip4_r1;
	private final ModelRenderer grip4_r2;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip5_r2;
	private final ModelRenderer grip4_r3;
	private final ModelRenderer grip4_r4;
	private final ModelRenderer grip3_r2;

	public SIG556Grip() {
		textureWidth = 350;
		textureHeight = 350;

		grip = new QRenderer(this);
		grip.setRotationPoint(0.5F, -3.5F, -7.0F);
		grip.cubeList.add(new ModelBox(grip, 0, 47, -3.27F, -4.0F, 3.0F, 3, 4, 6, 0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 46, 47, -3.73F, -4.0F, 3.0F, 1, 4, 6, 0.002F, false));

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(-3.73F, -5.0F, 10.55F);
		grip.addChild(grip5_r1);
		setRotationAngle(grip5_r1, 0.2618F, 0.0F, 0.0F);
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 114, 90, 0.0F, 0.0F, -4.0F, 1, 1, 4, 0.001F, false));
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 0, 34, 0.46F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

		grip6_r1 = new ModelRenderer(this);
		grip6_r1.setRotationPoint(-3.73F, -4.7F, 9.35F);
		grip.addChild(grip6_r1);
		setRotationAngle(grip6_r1, 1.021F, 0.0F, 0.0F);
		grip6_r1.cubeList.add(new ModelBox(grip6_r1, 36, 106, 0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
		grip6_r1.cubeList.add(new ModelBox(grip6_r1, 46, 76, 0.46F, 0.0F, -3.0F, 3, 1, 3, -0.001F, false));

		grip4_r1 = new ModelRenderer(this);
		grip4_r1.setRotationPoint(-1.0F, -1.7F, 9.0F);
		grip.addChild(grip4_r1);
		setRotationAngle(grip4_r1, 0.6807F, 0.0F, 0.0F);
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 93, 76, -3.0F, 5.1F, -1.0F, 4, 3, 1, 0.0F, false));

		grip4_r2 = new ModelRenderer(this);
		grip4_r2.setRotationPoint(0.0F, 4.9F, -1.5F);
		grip.addChild(grip4_r2);
		setRotationAngle(grip4_r2, 1.3177F, 0.0F, 0.0F);
		grip4_r2.cubeList.add(new ModelBox(grip4_r2, 0, 42, -4.0F, 9.0F, -1.0F, 4, 1, 2, -0.001F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(0.0F, 0.0F, 3.0F);
		grip.addChild(grip3_r1);
		setRotationAngle(grip3_r1, 0.5672F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 49, 31, -4.0F, 9.0F, -1.0F, 4, 1, 1, 0.0F, false));
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 49, 36, -4.0F, 7.0F, 0.0F, 4, 3, 6, 0.001F, false));

		grip5_r2 = new ModelRenderer(this);
		grip5_r2.setRotationPoint(-4.0F, 5.9F, 6.8F);
		grip.addChild(grip5_r2);
		setRotationAngle(grip5_r2, 0.6891F, -0.017F, 0.0354F);
		grip5_r2.cubeList.add(new ModelBox(grip5_r2, 10, 57, 0.0F, -6.3F, 5.5F, 2, 7, 1, 0.0F, false));

		grip4_r3 = new ModelRenderer(this);
		grip4_r3.setRotationPoint(-4.0F, 5.9F, 6.8F);
		grip.addChild(grip4_r3);
		setRotationAngle(grip4_r3, 0.567F, -0.0188F, 0.0341F);
		grip4_r3.cubeList.add(new ModelBox(grip4_r3, 0, 0, 0.0F, -7.0F, 0.0F, 2, 7, 6, 0.0F, false));

		grip4_r4 = new ModelRenderer(this);
		grip4_r4.setRotationPoint(0.0F, 5.9F, 6.8F);
		grip.addChild(grip4_r4);
		setRotationAngle(grip4_r4, 0.6891F, 0.017F, -0.0354F);
		grip4_r4.cubeList.add(new ModelBox(grip4_r4, 60, 63, -2.0F, -6.3F, 5.5F, 2, 7, 1, 0.0F, false));

		grip3_r2 = new ModelRenderer(this);
		grip3_r2.setRotationPoint(0.0F, 5.9F, 6.8F);
		grip.addChild(grip3_r2);
		setRotationAngle(grip3_r2, 0.567F, 0.0188F, -0.0341F);
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 0, 21, -2.0F, -7.0F, 0.0F, 2, 7, 6, 0.0F, false));

		
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
