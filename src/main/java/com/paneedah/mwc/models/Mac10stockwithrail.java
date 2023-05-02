package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Mac10stockwithrail extends ModelBase {
	private final QRenderer railplusstock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone74;
	private final ModelRenderer bone75;
	private final ModelRenderer bone76;
	private final ModelRenderer bone77;
	private final ModelRenderer bone73;
	private final ModelRenderer bone69;
	private final ModelRenderer bone70;
	private final ModelRenderer bone71;
	private final ModelRenderer bone72;
	private final ModelRenderer bone68;

	public Mac10stockwithrail() {
		textureWidth = 90;
		textureHeight = 90;

		railplusstock = new QRenderer(this);
		railplusstock.setRotationPoint(-4.0F, -12.25F, 12.5F);
		railplusstock.cubeList.add(new ModelBox(railplusstock, 42, 39, -1.0F, -1.0F, -1.0F, 7, 6, 2, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 0, 16, 1.0F, -6.9F, -16.0F, 3, 1, 11, 0.01F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 19, 29, -1.0F, -6.3F, -12.7F, 3, 1, 5, 0.01F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 0, 16, -1.6F, -5.4F, -12.7F, 1, 5, 3, 0.02F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 18, 0, -1.6F, -5.4F, -8.7F, 1, 5, 1, 0.02F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 29, 2, 1.5F, -7.4F, -16.0F, 2, 1, 1, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 29, 0, 1.5F, -7.4F, -14.0F, 2, 1, 1, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 28, 22, 1.5F, -7.4F, -12.0F, 2, 1, 1, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 28, 20, 1.5F, -7.4F, -10.0F, 2, 1, 1, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 27, 27, 1.5F, -7.4F, -8.0F, 2, 1, 1, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 17, 23, 1.5F, -7.4F, -6.0F, 2, 1, 1, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 0, 0, 0.0F, -1.1F, 0.0F, 5, 6, 2, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 0, 39, 1.0F, -0.25F, 1.25F, 3, 2, 36, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 0, 50, 1.5F, 2.25F, 35.25F, 2, 14, 2, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 0, 8, 1.5F, 16.25F, 33.55F, 2, 1, 4, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 29, 4, 1.5F, 1.25F, 36.25F, 2, 1, 1, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 24, 39, 1.5F, 2.25F, 31.25F, 2, 1, 4, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 17, 16, 1.5F, 1.25F, 18.25F, 2, 5, 2, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 8, 51, -1.0F, 0.0F, -2.0F, 7, 4, 1, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 0, 34, -1.0F, 1.0F, -3.0F, 7, 3, 1, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 18, 11, -1.0F, 2.0F, -4.0F, 7, 2, 1, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 16, 35, -1.0F, 3.0F, -5.0F, 7, 1, 1, 0.0F, false));
		railplusstock.cubeList.add(new ModelBox(railplusstock, 0, 28, -1.0F, 4.0F, -6.0F, 7, 1, 5, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.5F, -7.4F, -6.0F);
		railplusstock.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -1.0472F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 5, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 25, -1.0F, 0.0F, -2.0F, 1, 1, 1, -0.001F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 28, -1.0F, 0.0F, -4.0F, 1, 1, 1, -0.001F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 30, -1.0F, 0.0F, -6.0F, 1, 1, 1, -0.001F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 31, -1.0F, 0.0F, -8.0F, 1, 1, 1, -0.001F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 40, -0.9F, 0.3F, -9.3F, 1, 1, 10, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 16, -1.0F, 0.0F, -10.0F, 1, 1, 1, -0.001F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.5F, -7.4F, -6.0F);
		railplusstock.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.0472F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 10, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 23, 0.0F, 0.0F, -2.0F, 1, 1, 1, -0.001F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 28, 0.0F, 0.0F, -4.0F, 1, 1, 1, -0.001F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 30, 0.0F, 0.0F, -6.0F, 1, 1, 1, -0.001F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 29, 0.0F, 0.0F, -8.0F, 1, 1, 1, -0.001F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 14, 0.0F, 0.0F, -10.0F, 1, 1, 1, -0.001F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 39, -0.1F, 0.3F, -9.3F, 1, 1, 10, -0.3F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.6F, -5.4F, -9.0F);
		railplusstock.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3316F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 16, -1.0F, 3.0F, 0.0F, 1, 2, 9, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.0F, -6.3F, -12.7F);
		railplusstock.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.576F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 8, 0.0F, 0.0F, 4.0F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 16, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(0.6F, 1.35F, 37.25F);
		railplusstock.addChild(bone74);
		setRotationAngle(bone74, 0.0F, 0.0F, -0.0524F);
		bone74.cubeList.add(new ModelBox(bone74, 44, 19, 0.0F, -1.0F, 0.0F, 2, 17, 2, 0.002F, false));

		bone75 = new ModelRenderer(this);
		bone75.setRotationPoint(4.4F, 0.35F, 37.25F);
		railplusstock.addChild(bone75);
		setRotationAngle(bone75, 0.0F, 0.0F, 0.0524F);
		bone75.cubeList.add(new ModelBox(bone75, 44, 0, -2.0F, 0.0F, 0.0F, 2, 17, 2, 0.0F, false));

		bone76 = new ModelRenderer(this);
		bone76.setRotationPoint(4.4F, 0.35F, 37.25F);
		railplusstock.addChild(bone76);
		setRotationAngle(bone76, 0.0F, 0.0F, 1.2915F);
		bone76.cubeList.add(new ModelBox(bone76, 5, 16, -1.0F, 0.0F, 0.0F, 1, 1, 2, -0.001F, false));

		bone77 = new ModelRenderer(this);
		bone77.setRotationPoint(0.55F, 0.35F, 37.25F);
		railplusstock.addChild(bone77);
		setRotationAngle(bone77, 0.0F, 0.0F, -1.2915F);
		bone77.cubeList.add(new ModelBox(bone77, 8, 8, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.001F, false));

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(3.5F, 3.25F, 31.25F);
		railplusstock.addChild(bone73);
		setRotationAngle(bone73, 0.6632F, 0.0F, 0.0F);
		bone73.cubeList.add(new ModelBox(bone73, 0, 24, -2.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(4.0F, -1.0F, 2.25F);
		railplusstock.addChild(bone69);
		setRotationAngle(bone69, -0.0105F, 0.0F, 0.0F);
		bone69.cubeList.add(new ModelBox(bone69, 0, 0, -3.001F, 0.0F, -1.0F, 3, 1, 38, 0.0F, false));

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(4.0F, 3.75F, 2.0F);
		railplusstock.addChild(bone70);
		setRotationAngle(bone70, -0.1571F, 0.0F, 0.0F);
		bone70.cubeList.add(new ModelBox(bone70, 42, 39, -2.501F, -1.0F, 0.0F, 2, 2, 18, 0.0F, false));

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(4.0F, 5.55F, 19.9F);
		railplusstock.addChild(bone71);
		setRotationAngle(bone71, -0.3491F, 0.0F, 0.0F);
		bone71.cubeList.add(new ModelBox(bone71, 0, 0, -2.501F, 0.0F, 0.0F, 2, 2, 14, 0.0F, false));

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(3.499F, 10.8F, 31.65F);
		railplusstock.addChild(bone72);
		setRotationAngle(bone72, -1.309F, 0.0F, 0.0F);
		bone72.cubeList.add(new ModelBox(bone72, 18, 0, -2.0F, -4.1035F, -0.3864F, 2, 4, 7, 0.0F, false));

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(6.0F, -1.0F, -1.0F);
		railplusstock.addChild(bone68);
		setRotationAngle(bone68, -0.8029F, 0.0F, 0.0F);
		bone68.cubeList.add(new ModelBox(bone68, 42, 47, -6.999F, 0.0F, 0.0F, 7, 7, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		railplusstock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
