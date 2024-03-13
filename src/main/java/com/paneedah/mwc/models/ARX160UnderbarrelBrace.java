package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ARX160UnderbarrelBrace extends ModelWithAttachments {
	private final ModelRenderer underbarrelbrace;
	private final ModelRenderer cube_r253;
	private final ModelRenderer cube_r254;
	private final ModelRenderer cube_r255;
	private final ModelRenderer cube_r256;
	private final ModelRenderer cube_r257;
	private final ModelRenderer cube_r258;

	public ARX160UnderbarrelBrace() {
		textureWidth = 200;
		textureHeight = 200;

		underbarrelbrace = new ModelRenderer(this);
		underbarrelbrace.setRotationPoint(0.0F, 20.0F, 0.0F);
		underbarrelbrace.cubeList.add(new ModelBox(underbarrelbrace, 10, 102, -0.6993F, -33.4724F, -44.0043F, 1, 1, 2, 0.0F, false));
		underbarrelbrace.cubeList.add(new ModelBox(underbarrelbrace, 98, 40, -0.6993F, -33.4724F, -41.0043F, 1, 1, 2, 0.0F, false));
		underbarrelbrace.cubeList.add(new ModelBox(underbarrelbrace, 34, 98, -0.6993F, -33.4724F, -38.2543F, 1, 1, 2, 0.0F, false));
		underbarrelbrace.cubeList.add(new ModelBox(underbarrelbrace, 28, 98, -0.6993F, -33.4724F, -35.2543F, 1, 1, 2, 0.0F, false));
		underbarrelbrace.cubeList.add(new ModelBox(underbarrelbrace, 92, 81, -3.0F, -32.5187F, -44.0043F, 3, 1, 2, 0.0F, false));
		underbarrelbrace.cubeList.add(new ModelBox(underbarrelbrace, 91, 64, -3.0F, -32.5187F, -41.0043F, 3, 1, 2, 0.0F, false));
		underbarrelbrace.cubeList.add(new ModelBox(underbarrelbrace, 92, 4, -3.0F, -32.5187F, -38.2543F, 3, 1, 2, 0.0F, false));
		underbarrelbrace.cubeList.add(new ModelBox(underbarrelbrace, 91, 57, -3.0F, -32.45F, -35.2543F, 3, 1, 2, 0.0F, false));
		underbarrelbrace.cubeList.add(new ModelBox(underbarrelbrace, 36, 102, -3.3007F, -33.4724F, -44.0043F, 1, 1, 2, 0.0F, false));
		underbarrelbrace.cubeList.add(new ModelBox(underbarrelbrace, 42, 102, -3.3007F, -33.4724F, -41.0043F, 1, 1, 2, 0.0F, false));
		underbarrelbrace.cubeList.add(new ModelBox(underbarrelbrace, 30, 102, -3.3007F, -33.4724F, -38.2543F, 1, 1, 2, 0.0F, false));
		underbarrelbrace.cubeList.add(new ModelBox(underbarrelbrace, 24, 102, -3.3007F, -33.4724F, -35.2543F, 1, 1, 2, 0.0F, false));

		cube_r253 = new ModelRenderer(this);
		cube_r253.setRotationPoint(-0.5F, -33.0281F, -45.0124F);
		underbarrelbrace.addChild(cube_r253);
		setRotationAngle(cube_r253, -1.3352F, 0.0F, 0.0F);
		cube_r253.cubeList.add(new ModelBox(cube_r253, 90, 47, -2.5F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

		cube_r254 = new ModelRenderer(this);
		cube_r254.setRotationPoint(-2.7384F, -33.335F, -38.7281F);
		underbarrelbrace.addChild(cube_r254);
		setRotationAngle(cube_r254, -0.0262F, 0.0F, -0.1745F);
		cube_r254.cubeList.add(new ModelBox(cube_r254, 52, 103, -0.5F, -1.5F, -6.5F, 1, 3, 13, 0.0F, false));

		cube_r255 = new ModelRenderer(this);
		cube_r255.setRotationPoint(-2.6735F, -32.1459F, -34.2543F);
		underbarrelbrace.addChild(cube_r255);
		setRotationAngle(cube_r255, 0.0F, 0.0F, 1.2654F);
		cube_r255.cubeList.add(new ModelBox(cube_r255, 58, 103, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r255.cubeList.add(new ModelBox(cube_r255, 52, 103, -0.5F, -0.5F, -4.0F, 1, 1, 2, 0.0F, false));
		cube_r255.cubeList.add(new ModelBox(cube_r255, 67, 103, -0.5F, -0.5F, -6.75F, 1, 1, 2, 0.0F, false));
		cube_r255.cubeList.add(new ModelBox(cube_r255, 73, 103, -0.5F, -0.5F, -9.75F, 1, 1, 2, 0.0F, false));

		cube_r256 = new ModelRenderer(this);
		cube_r256.setRotationPoint(-0.5F, -32.2687F, -38.7543F);
		underbarrelbrace.addChild(cube_r256);
		setRotationAngle(cube_r256, -0.0262F, 0.0F, 0.0F);
		cube_r256.cubeList.add(new ModelBox(cube_r256, 77, 133, -2.5F, -2.5F, -6.5F, 3, 3, 13, 0.0F, false));

		cube_r257 = new ModelRenderer(this);
		cube_r257.setRotationPoint(-0.3265F, -32.1459F, -34.2543F);
		underbarrelbrace.addChild(cube_r257);
		setRotationAngle(cube_r257, 0.0F, 0.0F, -1.2654F);
		cube_r257.cubeList.add(new ModelBox(cube_r257, 40, 98, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r257.cubeList.add(new ModelBox(cube_r257, 98, 22, -0.5F, -0.5F, -4.0F, 1, 1, 2, 0.0F, false));
		cube_r257.cubeList.add(new ModelBox(cube_r257, 98, 45, -0.5F, -0.5F, -6.75F, 1, 1, 2, 0.0F, false));
		cube_r257.cubeList.add(new ModelBox(cube_r257, 16, 102, -0.5F, -0.5F, -9.75F, 1, 1, 2, 0.0F, false));

		cube_r258 = new ModelRenderer(this);
		cube_r258.setRotationPoint(-0.2616F, -33.335F, -38.7281F);
		underbarrelbrace.addChild(cube_r258);
		setRotationAngle(cube_r258, -0.0262F, 0.0F, 0.1745F);
		cube_r258.cubeList.add(new ModelBox(cube_r258, 104, 52, -0.5F, -1.5F, -6.5F, 1, 3, 13, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		underbarrelbrace.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}