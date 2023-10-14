package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Saiga12Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action7_r1;
	private final ModelRenderer action5_r1;
	private final ModelRenderer action4_r1;
	private final ModelRenderer action3_r1;
	private final ModelRenderer action1_r1;
	private final ModelRenderer action9_r1;

	public Saiga12Action() {
		textureWidth = 150;
		textureHeight = 150;

		action = new ModelRenderer(this);
		action.setRotationPoint(-3.1F, -13.0035F, -27.5005F);
		action.cubeList.add(new ModelBox(action, 0, 0, -0.4F, 0.0035F, -5.9995F, 1, 2, 23, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 0, 0, -0.6F, 0.0035F, -5.9995F, 1, 1, 4, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 0, 0, -2.9F, 0.0035F, -5.4995F, 3, 1, 1, 0.0F, false));

		action7_r1 = new ModelRenderer(this);
		action7_r1.setRotationPoint(10.6943F, 37.0035F, 25.5028F);
		action.addChild(action7_r1);
		setRotationAngle(action7_r1, 0.0F, 0.2649F, 0.0F);
		action7_r1.cubeList.add(new ModelBox(action7_r1, 0, 0, -3.7F, -37.0F, -29.5F, 1, 1, 1, 0.0F, false));

		action5_r1 = new ModelRenderer(this);
		action5_r1.setRotationPoint(-9.923F, 35.7161F, 27.5005F);
		action.addChild(action5_r1);
		setRotationAngle(action5_r1, 0.0F, 0.0F, 0.3346F);
		action5_r1.cubeList.add(new ModelBox(action5_r1, 0, 0, -2.7F, -39.2F, -26.5F, 1, 2, 6, 0.0F, false));

		action4_r1 = new ModelRenderer(this);
		action4_r1.setRotationPoint(33.8032F, 14.33F, 27.5005F);
		action.addChild(action4_r1);
		setRotationAngle(action4_r1, 0.0F, 0.0F, -1.0782F);
		action4_r1.cubeList.add(new ModelBox(action4_r1, 0, 0, -3.6F, -37.0F, -26.5F, 1, 1, 7, 0.0F, false));

		action3_r1 = new ModelRenderer(this);
		action3_r1.setRotationPoint(33.8559F, 14.4181F, 27.5005F);
		action.addChild(action3_r1);
		setRotationAngle(action3_r1, 0.0F, 0.0F, -1.0782F);
		action3_r1.cubeList.add(new ModelBox(action3_r1, 0, 0, -3.5F, -37.0F, -33.5F, 2, 1, 15, 0.0F, false));

		action1_r1 = new ModelRenderer(this);
		action1_r1.setRotationPoint(-9.9175F, 35.6832F, 27.5005F);
		action.addChild(action1_r1);
		setRotationAngle(action1_r1, 0.0F, 0.0F, 0.3346F);
		action1_r1.cubeList.add(new ModelBox(action1_r1, 0, 0, -2.6F, -39.2F, -33.5F, 1, 2, 13, 0.0F, false));

		action9_r1 = new ModelRenderer(this);
		action9_r1.setRotationPoint(13.6764F, 37.0035F, 24.1268F);
		action.addChild(action9_r1);
		setRotationAngle(action9_r1, 0.0F, 0.3346F, 0.0F);
		action9_r1.cubeList.add(new ModelBox(action9_r1, 0, 0, -4.7F, -37.0F, -33.0F, 2, 1, 1, 0.0F, false));
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