package com.paneedah.mw.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G11Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r111;
	private final ModelRenderer cube_r112;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r113;
	private final ModelRenderer cube_r114;

	public G11Action() {
		textureWidth = 256;
		textureHeight = 256;

		action = new ModelRenderer(this);
		action.setRotationPoint(-4.174F, -10.0F, 15.4F);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(5.3368F, 0.0F, 0.025F);
		action.addChild(bone3);
		

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(0.3372F, 0.85F, -2.0F);
		bone3.addChild(cube_r111);
		setRotationAngle(cube_r111, 0.0F, 0.0F, 0.48F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 61, 103, -0.75F, -0.75F, -0.25F, 1, 2, 1, 0.0F, false));
		cube_r111.cubeList.add(new ModelBox(cube_r111, 103, 58, -0.7501F, -0.75F, -0.75F, 1, 2, 1, 0.0F, false));
		cube_r111.cubeList.add(new ModelBox(cube_r111, 65, 103, -0.7501F, -0.75F, 3.25F, 1, 2, 1, 0.0F, false));
		cube_r111.cubeList.add(new ModelBox(cube_r111, 103, 65, -0.75F, -0.75F, 3.75F, 1, 2, 1, 0.0F, false));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(0.3372F, -0.85F, -2.0F);
		bone3.addChild(cube_r112);
		setRotationAngle(cube_r112, 0.0F, 0.0F, -0.48F);
		cube_r112.cubeList.add(new ModelBox(cube_r112, 57, 103, -0.7501F, -1.25F, 3.25F, 1, 2, 1, 0.0F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 103, 51, -0.75F, -1.25F, 3.75F, 1, 2, 1, 0.0F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 103, 44, -0.75F, -1.25F, -0.25F, 1, 2, 1, 0.0F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 30, 103, -0.7501F, -1.25F, -0.75F, 1, 2, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(5.9778F, -0.0415F, 0.0341F);
		action.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 59, 99, -0.5538F, -0.2335F, 2.9909F, 1, 3, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 106, 7, -0.5548F, 2.2165F, 2.9899F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 4, 106, -0.5548F, 2.2165F, -4.0081F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 91, 99, -0.5538F, -0.2335F, -4.0091F, 1, 3, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 96, 28, -0.5538F, 2.7665F, -2.0091F, 1, 1, 4, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 51, 90, -0.5538F, 1.7665F, -3.0091F, 1, 1, 6, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 62, 59, -0.7548F, -1.0325F, -3.9591F, 2, 2, 8, -0.8F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 62, -0.7548F, 0.7175F, -3.9591F, 2, 2, 8, -0.8F, false));
		bone8.cubeList.add(new ModelBox(bone8, 30, 74, -0.5538F, -0.2335F, -1.0091F, 1, 2, 2, 0.0F, false));

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(-0.0538F, 3.3182F, 0.1816F);
		bone8.addChild(cube_r113);
		setRotationAngle(cube_r113, -0.2618F, 0.0F, 0.0F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 10, 78, -0.502F, 0.0F, -4.0F, 1, 1, 2, 0.0F, false));

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(-0.0538F, 3.3182F, -0.1998F);
		bone8.addChild(cube_r114);
		setRotationAngle(cube_r114, 0.2618F, 0.0F, 0.0F);
		cube_r114.cubeList.add(new ModelBox(cube_r114, 78, 12, -0.502F, 0.0F, 2.0F, 1, 1, 2, 0.0F, false));
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