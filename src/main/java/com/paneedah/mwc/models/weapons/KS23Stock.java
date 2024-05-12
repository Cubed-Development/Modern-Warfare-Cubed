package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KS23Stock extends ModelWithAttachments {
	private final ModelRenderer stock;
	private final ModelRenderer gun95;
	private final ModelRenderer gun94;
	private final ModelRenderer gun93;
	private final ModelRenderer gun92;
	private final ModelRenderer gun91;
	private final ModelRenderer gun90;
	private final ModelRenderer gun89;
	private final ModelRenderer gun88;
	private final ModelRenderer gun87;
	private final ModelRenderer gun86;
	private final ModelRenderer gun85;
	private final ModelRenderer gun84;
	private final ModelRenderer gun83;
	private final ModelRenderer gun82;
	private final ModelRenderer gun81;
	private final ModelRenderer gun80;
	private final ModelRenderer gun79;
	private final ModelRenderer gun78;
	private final ModelRenderer gun77;
	private final ModelRenderer gun76;
	private final ModelRenderer gun75;
	private final ModelRenderer gun74;
	private final ModelRenderer gun73;

	public KS23Stock() {
		textureWidth = 300;
		textureHeight = 300;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun95 = new ModelRenderer(this);
		gun95.setRotationPoint(-3.0F, -21.2F, 25.2F);
		stock.addChild(gun95);
		setRotationAngle(gun95, 1.2641F, 0.0F, 0.0F);
		gun95.cubeList.add(new ModelBox(gun95, 83, 121, 0.0F, 0.0F, -1.0F, 4, 20, 5, 0.0F, false));

		gun94 = new ModelRenderer(this);
		gun94.setRotationPoint(-3.0F, -26.0F, 23.35F);
		stock.addChild(gun94);
		setRotationAngle(gun94, -0.1115F, 0.0F, 0.0F);
		gun94.cubeList.add(new ModelBox(gun94, 228, 121, 0.0015F, 0.0F, 0.0F, 4, 5, 23, 0.0F, false));

		gun93 = new ModelRenderer(this);
		gun93.setRotationPoint(-3.0F, -23.3F, 48.1F);
		stock.addChild(gun93);
		setRotationAngle(gun93, -1.7299F, 0.0F, 0.0F);
		gun93.cubeList.add(new ModelBox(gun93, 22, 74, -0.001F, -2.0F, 0.0F, 4, 5, 10, 0.0F, false));

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(-3.0F, -21.2F, 23.8F);
		stock.addChild(gun92);
		setRotationAngle(gun92, 1.2641F, 0.0F, 0.0F);
		gun92.cubeList.add(new ModelBox(gun92, 52, 122, 0.002F, 0.0F, -1.0F, 4, 26, 1, 0.0F, false));

		gun91 = new ModelRenderer(this);
		gun91.setRotationPoint(-3.0F, -20.25F, 24.4F);
		stock.addChild(gun91);
		setRotationAngle(gun91, -1.2641F, 0.0F, 0.0F);
		gun91.cubeList.add(new ModelBox(gun91, 0, 0, 0.001F, 0.0F, -1.0F, 4, 6, 1, 0.0F, false));

		gun90 = new ModelRenderer(this);
		gun90.setRotationPoint(-3.0F, -21.5F, 18.4F);
		stock.addChild(gun90);
		setRotationAngle(gun90, 0.409F, 0.0F, 0.0F);
		gun90.cubeList.add(new ModelBox(gun90, 52, 90, -0.001F, 0.0F, -1.0F, 4, 3, 2, 0.0F, false));

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(-3.0F, -23.3F, 16.75F);
		stock.addChild(gun89);
		setRotationAngle(gun89, 0.632F, 0.0F, 0.0F);
		gun89.cubeList.add(new ModelBox(gun89, 74, 87, 0.001F, 0.0F, -1.0F, 4, 4, 3, 0.0F, false));

		gun88 = new ModelRenderer(this);
		gun88.setRotationPoint(-3.0F, -25.2F, 13.5F);
		stock.addChild(gun88);
		setRotationAngle(gun88, 1.041F, 0.0F, 0.0F);
		gun88.cubeList.add(new ModelBox(gun88, 81, 11, -0.001F, 0.0F, -1.0F, 4, 5, 3, 0.0F, false));

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(-3.0F, -26.4F, 10.3F);
		stock.addChild(gun87);
		setRotationAngle(gun87, 1.2269F, 0.0F, 0.0F);
		gun87.cubeList.add(new ModelBox(gun87, 38, 36, 0.001F, 0.0F, -1.0F, 4, 4, 2, 0.0F, false));

		gun86 = new ModelRenderer(this);
		gun86.setRotationPoint(-2.0F, -20.3F, 23.5F);
		stock.addChild(gun86);
		setRotationAngle(gun86, 1.2641F, 0.0F, 0.0F);
		gun86.cubeList.add(new ModelBox(gun86, 101, 11, -0.001F, 0.0F, -1.0F, 2, 26, 1, 0.0F, false));

		gun85 = new ModelRenderer(this);
		gun85.setRotationPoint(-2.0F, -19.2F, 23.8F);
		stock.addChild(gun85);
		setRotationAngle(gun85, -1.2641F, 0.0F, 0.0F);
		gun85.cubeList.add(new ModelBox(gun85, 57, 30, 0.001F, 0.0F, -1.0F, 2, 6, 1, 0.0F, false));

		gun84 = new ModelRenderer(this);
		gun84.setRotationPoint(-3.0F, -27.0F, 23.35F);
		stock.addChild(gun84);
		setRotationAngle(gun84, -0.1115F, 0.0F, 0.0F);
		gun84.cubeList.add(new ModelBox(gun84, 197, 0, 0.001F, 0.0F, 0.0F, 4, 1, 27, 0.0F, false));

		gun83 = new ModelRenderer(this);
		gun83.setRotationPoint(-3.0F, -27.0F, 23.35F);
		stock.addChild(gun83);
		setRotationAngle(gun83, -1.1525F, 0.0F, 0.0F);
		gun83.cubeList.add(new ModelBox(gun83, 57, 0, -0.001F, 0.0F, 0.0F, 4, 4, 6, 0.0F, false));

		gun82 = new ModelRenderer(this);
		gun82.setRotationPoint(-3.0F, -26.0F, 22.0F);
		stock.addChild(gun82);
		setRotationAngle(gun82, -1.4871F, 0.0F, 0.0F);
		gun82.cubeList.add(new ModelBox(gun82, 57, 10, 0.002F, 0.0F, 0.0F, 4, 4, 6, 0.0F, false));

		gun81 = new ModelRenderer(this);
		gun81.setRotationPoint(-2.0F, -26.76F, 21.35F);
		stock.addChild(gun81);
		setRotationAngle(gun81, -1.4871F, 0.0F, 0.0F);
		gun81.cubeList.add(new ModelBox(gun81, 92, 92, 0.001F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun80 = new ModelRenderer(this);
		gun80.setRotationPoint(-2.0F, -27.76F, 23.35F);
		stock.addChild(gun80);
		setRotationAngle(gun80, -1.1525F, 0.0F, 0.0F);
		gun80.cubeList.add(new ModelBox(gun80, 57, 0, -0.001F, 0.0F, 0.0F, 2, 5, 1, 0.0F, false));

		gun79 = new ModelRenderer(this);
		gun79.setRotationPoint(-2.0F, -27.76F, 23.35F);
		stock.addChild(gun79);
		setRotationAngle(gun79, -0.1115F, 0.0F, 0.0F);
		gun79.cubeList.add(new ModelBox(gun79, 93, 228, 0.0F, 0.0F, 0.0F, 2, 1, 27, 0.0F, false));

		gun78 = new ModelRenderer(this);
		gun78.setRotationPoint(-2.0F, -20.5F, 17.8F);
		stock.addChild(gun78);
		setRotationAngle(gun78, 0.409F, 0.0F, 0.0F);
		gun78.cubeList.add(new ModelBox(gun78, 74, 80, 0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		gun77 = new ModelRenderer(this);
		gun77.setRotationPoint(-2.0F, -22.7F, 16.0F);
		stock.addChild(gun77);
		setRotationAngle(gun77, 0.632F, 0.0F, 0.0F);
		gun77.cubeList.add(new ModelBox(gun77, 69, 30, -0.001F, 0.0F, -1.0F, 2, 4, 1, 0.0F, false));

		gun76 = new ModelRenderer(this);
		gun76.setRotationPoint(-2.0F, -24.4F, 13.0F);
		stock.addChild(gun76);
		setRotationAngle(gun76, 1.041F, 0.0F, 0.0F);
		gun76.cubeList.add(new ModelBox(gun76, 71, 0, 0.0F, 0.0F, -1.0F, 2, 4, 1, 0.0F, false));

		gun75 = new ModelRenderer(this);
		gun75.setRotationPoint(-2.0F, -25.5F, 10.0F);
		stock.addChild(gun75);
		setRotationAngle(gun75, 1.2269F, 0.0F, 0.0F);
		gun75.cubeList.add(new ModelBox(gun75, 71, 10, -0.001F, 0.0F, -1.0F, 2, 4, 1, 0.0F, false));

		gun74 = new ModelRenderer(this);
		gun74.setRotationPoint(-3.0F, -29.0F, 11.2F);
		stock.addChild(gun74);
		setRotationAngle(gun74, -0.3718F, 0.0F, 0.0F);
		gun74.cubeList.add(new ModelBox(gun74, 74, 76, 0.003F, 0.0F, 0.0F, 4, 2, 9, 0.0F, false));

		gun73 = new ModelRenderer(this);
		gun73.setRotationPoint(-2.0F, -29.76F, 11.35F);
		stock.addChild(gun73);
		setRotationAngle(gun73, -0.3718F, 0.0F, 0.0F);
		gun73.cubeList.add(new ModelBox(gun73, 125, 69, 0.0F, 0.0F, 0.0F, 2, 1, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
