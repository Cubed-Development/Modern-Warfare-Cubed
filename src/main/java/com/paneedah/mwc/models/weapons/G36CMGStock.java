package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G36CMGStock extends ModelWithAttachments {
	private final ModelRenderer MG36stock;
	private final ModelRenderer cube_r110;
	private final ModelRenderer cube_r111;
	private final ModelRenderer cube_r112;
	private final ModelRenderer cube_r33_r1;
	private final ModelRenderer cube_r113;
	private final ModelRenderer cube_r114;
	private final ModelRenderer cube_r115;
	private final ModelRenderer cube_r116;
	private final ModelRenderer cube_r37_r1;
	private final ModelRenderer cube_r117;
	private final ModelRenderer cube_r118;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r121;

	public G36CMGStock() {
		textureWidth = 256;
		textureHeight = 256;

		MG36stock = new ModelRenderer(this);
		MG36stock.setRotationPoint(0.0F, 24.0F, 17.05F);
		MG36stock.cubeList.add(new ModelBox(MG36stock, 124, 32, -1.625F, -41.0F, -12.5F, 2, 1, 2, 0.002F, false));
		MG36stock.cubeList.add(new ModelBox(MG36stock, 123, 51, -3.375F, -40.999F, -12.5F, 2, 1, 2, 0.001F, false));
		MG36stock.cubeList.add(new ModelBox(MG36stock, 47, 67, -3.5F, -40.0F, -12.5F, 4, 9, 3, 0.0F, false));
		MG36stock.cubeList.add(new ModelBox(MG36stock, 41, 14, -4.5F, -40.0F, -12.5F, 1, 9, 1, 0.0F, false));
		MG36stock.cubeList.add(new ModelBox(MG36stock, 10, 87, -3.5F, -40.0F, -10.075F, 4, 1, 1, -0.001F, false));
		MG36stock.cubeList.add(new ModelBox(MG36stock, 94, 60, -3.5F, -39.0F, -9.5F, 4, 8, 2, 0.0F, false));
		MG36stock.cubeList.add(new ModelBox(MG36stock, 18, 130, -3.5F, -37.0F, -0.5F, 4, 6, 1, 0.0F, false));
		MG36stock.cubeList.add(new ModelBox(MG36stock, 168, 114, -3.5F, -38.0F, 19.5F, 4, 18, 3, 0.002F, false));
		MG36stock.cubeList.add(new ModelBox(MG36stock, 73, 111, -2.5F, -37.0F, 18.3F, 2, 10, 2, 0.0F, false));
		MG36stock.cubeList.add(new ModelBox(MG36stock, 0, 201, -3.5F, -38.0F, -0.5F, 4, 1, 20, 0.0F, false));
		MG36stock.cubeList.add(new ModelBox(MG36stock, 144, 132, -3.5F, -32.0F, -7.5F, 4, 1, 7, 0.0F, false));
		MG36stock.cubeList.add(new ModelBox(MG36stock, 69, 23, -3.5F, -38.0F, -7.5F, 4, 2, 7, 0.0F, false));

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(-1.5F, -27.7705F, 12.0186F);
		MG36stock.addChild(cube_r110);
		setRotationAngle(cube_r110, -1.0908F, 0.0F, 0.0F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 47, 57, -1.999F, -5.048F, 5.3471F, 4, 2, 5, 0.0F, false));

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(-1.5F, -29.1864F, 8.1633F);
		MG36stock.addChild(cube_r111);
		setRotationAngle(cube_r111, -0.6981F, 0.0F, 0.0F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 171, 0, -1.998F, -2.9711F, 4.0643F, 4, 1, 8, -0.003F, false));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(-1.5F, -29.1864F, 8.1633F);
		MG36stock.addChild(cube_r112);
		setRotationAngle(cube_r112, -0.3054F, 0.0F, 0.0F);
		cube_r112.cubeList.add(new ModelBox(cube_r112, 18, 11, -2.0F, 0.2973F, 8.5649F, 4, 1, 4, 0.0F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 157, 148, -1.999F, -0.7027F, 6.3149F, 4, 1, 6, 0.0F, false));

		cube_r33_r1 = new ModelRenderer(this);
		cube_r33_r1.setRotationPoint(0.001F, 0.0F, 0.0F);
		cube_r112.addChild(cube_r33_r1);
		setRotationAngle(cube_r33_r1, 0.0698F, 0.0F, 0.0F);
		cube_r33_r1.cubeList.add(new ModelBox(cube_r33_r1, 140, 183, -2.0F, -0.8F, -8.2F, 4, 1, 20, 0.0F, false));

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(-0.5F, -39.7301F, -9.5581F);
		MG36stock.addChild(cube_r113);
		setRotationAngle(cube_r113, -0.5585F, 0.0F, 0.0F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 111, 70, -3.001F, -0.5F, 0.275F, 4, 1, 3, -0.002F, false));

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(0.625F, -39.7301F, -9.5581F);
		MG36stock.addChild(cube_r114);
		setRotationAngle(cube_r114, -0.6109F, 0.0F, 0.0F);
		cube_r114.cubeList.add(new ModelBox(cube_r114, 122, 64, -4.0F, -0.4989F, -1.5F, 2, 1, 2, 0.0F, false));
		cube_r114.cubeList.add(new ModelBox(cube_r114, 116, 32, -2.25F, -0.4999F, -1.5F, 2, 1, 2, 0.0F, false));

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(-1.5F, -37.5F, -2.5F);
		MG36stock.addChild(cube_r115);
		setRotationAngle(cube_r115, -0.1745F, 0.0F, 0.0F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 0, 31, -2.001F, -0.5F, -5.0F, 4, 1, 5, 0.0F, false));

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(-1.501F, -27.8224F, 13.5659F);
		MG36stock.addChild(cube_r116);
		setRotationAngle(cube_r116, -0.2618F, 0.0F, 0.0F);
		

		cube_r37_r1 = new ModelRenderer(this);
		cube_r37_r1.setRotationPoint(0.0F, -1.5353F, 3.8637F);
		cube_r116.addChild(cube_r37_r1);
		setRotationAngle(cube_r37_r1, 0.2182F, 0.0F, 0.0F);
		cube_r37_r1.cubeList.add(new ModelBox(cube_r37_r1, 80, 32, -1.0F, -0.9826F, -1.0996F, 2, 2, 1, 0.001F, false));

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(-1.501F, -29.0482F, 14.1175F);
		MG36stock.addChild(cube_r117);
		setRotationAngle(cube_r117, 0.2182F, 0.0F, 0.0F);
		cube_r117.cubeList.add(new ModelBox(cube_r117, 28, 106, -1.0F, 0.2793F, 2.6146F, 2, 1, 2, 0.0F, false));

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(-1.5F, -33.5747F, 15.459F);
		MG36stock.addChild(cube_r118);
		setRotationAngle(cube_r118, -0.5672F, 0.0F, 0.0F);
		

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(-1.5F, -29.0F, 17.0F);
		MG36stock.addChild(cube_r119);
		setRotationAngle(cube_r119, 0.1309F, 0.0F, 0.0F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 0, 67, -2.001F, 0.5221F, 2.4658F, 4, 9, 3, 0.0F, false));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(-1.5F, -29.0F, 17.0F);
		MG36stock.addChild(cube_r120);
		setRotationAngle(cube_r120, -0.0873F, 0.0F, 0.0F);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 114, 77, -2.001F, -9.4738F, 4.4848F, 4, 9, 1, 0.0F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(-0.2071F, -40.0F, -4.0F);
		MG36stock.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.0F, 0.0F, 0.7854F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 11, 67, -0.5F, -0.5F, -8.5F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		MG36stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}