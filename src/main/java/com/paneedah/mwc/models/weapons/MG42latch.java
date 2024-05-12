package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MG42latch extends ModelWithAttachments {
	private final ModelRenderer latch;
	private final ModelRenderer latch55_r1;
	private final ModelRenderer latch54_r1;
	private final ModelRenderer latch52_r1;
	private final ModelRenderer latch51_r1;
	private final ModelRenderer latch50_r1;
	private final ModelRenderer latch49_r1;
	private final ModelRenderer latch47_r1;
	private final ModelRenderer latch46_r1;
	private final ModelRenderer latch45_r1;
	private final ModelRenderer latch39_r1;
	private final ModelRenderer latch38_r1;
	private final ModelRenderer latch36_r1;
	private final ModelRenderer latch35_r1;
	private final ModelRenderer latch34_r1;
	private final ModelRenderer latch33_r1;
	private final ModelRenderer latch12_r1;
	private final ModelRenderer latch10_r1;

	public MG42latch() {
		textureWidth = 256;
		textureHeight = 128;

		latch = new ModelRenderer(this);
		latch.setRotationPoint(0.0F, 24.0F, 0.0F);
		latch.cubeList.add(new ModelBox(latch, 100, 0, -0.6F, -38.0F, 0.0F, 1, 2, 30, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, -0.6F, -38.6F, 0.0F, 1, 1, 30, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 5.6F, -38.0F, 2.0F, 1, 2, 28, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 5.6F, -38.6F, 2.0F, 1, 1, 28, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 0.4F, -39.6F, 23.0F, 3, 1, 7, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 2.6F, -39.6F, 23.0F, 3, 1, 7, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 5.6F, -41.3F, 1.0F, 1, 3, 4, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, -0.6F, -41.3F, 0.0F, 1, 3, 5, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 0.4F, -42.3F, -10.0F, 3, 1, 15, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 2.6F, -42.3F, -10.0F, 3, 1, 15, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, -0.6F, -40.3F, 5.0F, 1, 2, 7, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 5.6F, -40.3F, 5.0F, 1, 2, 7, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, -0.6F, -39.3F, 12.0F, 1, 1, 7, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 5.6F, -39.3F, 12.0F, 1, 1, 7, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, -0.6F, -41.3F, -5.0F, 1, 1, 5, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, -0.6F, -41.3F, -10.0F, 1, 3, 5, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, -0.6F, -39.0F, -10.0F, 1, 3, 5, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, -0.6F, -40.8F, -5.0F, 1, 1, 5, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 5.6F, -42.3F, -9.0F, 3, 1, 10, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, -0.4F, -41.3F, -9.0F, 9, 2, 1, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 5.6F, -41.3F, 0.0F, 3, 2, 1, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 7.6F, -41.5F, -9.0F, 1, 1, 9, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 7.8F, -42.0F, -7.0F, 1, 1, 1, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 7.8F, -42.0F, -2.0F, 1, 1, 1, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 7.8F, -42.0F, -4.5F, 1, 1, 1, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 1.5F, -42.5F, -6.0F, 3, 1, 11, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 2.5F, -42.5F, 5.0F, 1, 1, 1, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 4.5F, -42.5F, -4.0F, 2, 1, 1, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 5.0F, -42.7F, -4.0F, 1, 1, 1, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 2.5F, -42.7F, -4.0F, 1, 1, 1, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 2.5F, -42.7F, 3.0F, 1, 1, 1, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, -0.7F, -40.0F, -9.5F, 1, 3, 2, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, -0.7F, -39.5F, 0.2F, 1, 3, 3, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, -0.4F, -41.3F, -10.0F, 7, 3, 1, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 1.5F, -42.5F, -10.0F, 1, 1, 4, 0.0F, true));
		latch.cubeList.add(new ModelBox(latch, 100, 0, 3.5F, -42.5F, -10.0F, 1, 1, 4, 0.0F, true));

		latch55_r1 = new ModelRenderer(this);
		latch55_r1.setRotationPoint(17.1431F, 0.0F, -0.4057F);
		latch.addChild(latch55_r1);
		setRotationAngle(latch55_r1, -3.1416F, -0.2788F, 3.1416F);
		latch55_r1.cubeList.add(new ModelBox(latch55_r1, 100, 0, 8.6F, -42.3F, 1.0F, 3, 3, 1, 0.0F, true));

		latch54_r1 = new ModelRenderer(this);
		latch54_r1.setRotationPoint(-17.9366F, -75.1704F, 0.0F);
		latch.addChild(latch54_r1);
		setRotationAngle(latch54_r1, 0.0F, 0.0F, 2.3562F);
		latch54_r1.cubeList.add(new ModelBox(latch54_r1, 100, 0, 6.6F, -41.3F, -10.0F, 1, 1, 1, 0.0F, true));
		latch54_r1.cubeList.add(new ModelBox(latch54_r1, 100, 0, 6.6F, -41.3F, 1.0F, 1, 1, 4, 0.0F, true));

		latch52_r1 = new ModelRenderer(this);
		latch52_r1.setRotationPoint(27.1186F, -11.7299F, 0.0F);
		latch.addChild(latch52_r1);
		setRotationAngle(latch52_r1, 0.0F, 0.0F, -0.7854F);
		latch52_r1.cubeList.add(new ModelBox(latch52_r1, 100, 0, -0.6F, -38.6F, 21.0F, 1, 1, 9, 0.0F, true));

		latch51_r1 = new ModelRenderer(this);
		latch51_r1.setRotationPoint(-16.0274F, -70.5612F, 0.0F);
		latch.addChild(latch51_r1);
		setRotationAngle(latch51_r1, 0.0F, 0.0F, 2.3562F);
		latch51_r1.cubeList.add(new ModelBox(latch51_r1, 100, 0, 6.6F, -38.6F, 21.0F, 1, 1, 9, 0.0F, true));

		latch50_r1 = new ModelRenderer(this);
		latch50_r1.setRotationPoint(-27.8843F, -11.8814F, 0.0F);
		latch.addChild(latch50_r1);
		setRotationAngle(latch50_r1, 0.0F, 0.0F, 0.7854F);
		latch50_r1.cubeList.add(new ModelBox(latch50_r1, 100, 0, 0.4F, -39.6F, 16.0F, 1, 1, 14, 0.0F, true));

		latch49_r1 = new ModelRenderer(this);
		latch49_r1.setRotationPoint(-26.3612F, -15.5584F, 0.0F);
		latch.addChild(latch49_r1);
		setRotationAngle(latch49_r1, 0.0F, 0.0F, 0.7854F);
		latch49_r1.cubeList.add(new ModelBox(latch49_r1, 100, 0, 5.6F, -39.6F, 16.0F, 1, 1, 14, 0.0F, true));

		latch47_r1 = new ModelRenderer(this);
		latch47_r1.setRotationPoint(-28.2704F, -16.3492F, 0.0F);
		latch.addChild(latch47_r1);
		setRotationAngle(latch47_r1, 0.0F, 0.0F, 0.7854F);
		latch47_r1.cubeList.add(new ModelBox(latch47_r1, 100, 0, 5.6F, -42.3F, -10.0F, 1, 1, 15, 0.0F, true));

		latch46_r1 = new ModelRenderer(this);
		latch46_r1.setRotationPoint(-29.7935F, -12.6722F, 0.0F);
		latch.addChild(latch46_r1);
		setRotationAngle(latch46_r1, 0.0F, 0.0F, 0.7854F);
		latch46_r1.cubeList.add(new ModelBox(latch46_r1, 100, 0, 0.4F, -42.3F, -10.0F, 1, 1, 15, 0.0F, true));

		latch45_r1 = new ModelRenderer(this);
		latch45_r1.setRotationPoint(29.0278F, -12.5208F, 0.0F);
		latch.addChild(latch45_r1);
		setRotationAngle(latch45_r1, 0.0F, 0.0F, -0.7854F);
		latch45_r1.cubeList.add(new ModelBox(latch45_r1, 100, 0, -0.6F, -41.3F, -10.0F, 1, 1, 15, 0.0F, true));

		latch39_r1 = new ModelRenderer(this);
		latch39_r1.setRotationPoint(10.8349F, 0.0F, -8.6973F);
		latch.addChild(latch39_r1);
		setRotationAngle(latch39_r1, -3.1416F, -0.488F, 3.1416F);
		latch39_r1.cubeList.add(new ModelBox(latch39_r1, 100, 0, 6.5F, -42.5F, -3.0F, 3, 1, 1, 0.0F, true));

		latch38_r1 = new ModelRenderer(this);
		latch38_r1.setRotationPoint(6.0143F, 0.0F, -11.6167F);
		latch.addChild(latch38_r1);
		setRotationAngle(latch38_r1, -3.1416F, -1.0828F, 3.1416F);
		latch38_r1.cubeList.add(new ModelBox(latch38_r1, 100, 0, 6.5F, -42.5F, -4.0F, 1, 1, 3, 0.0F, true));

		latch36_r1 = new ModelRenderer(this);
		latch36_r1.setRotationPoint(1.7322F, 0.0F, 12.7175F);
		latch.addChild(latch36_r1);
		setRotationAngle(latch36_r1, -3.1416F, 0.7854F, 3.1416F);
		latch36_r1.cubeList.add(new ModelBox(latch36_r1, 100, 0, 3.5F, -42.5F, 6.0F, 1, 1, 1, 0.0F, true));

		latch35_r1 = new ModelRenderer(this);
		latch35_r1.setRotationPoint(11.2175F, 0.0F, 5.3536F);
		latch.addChild(latch35_r1);
		setRotationAngle(latch35_r1, -3.1416F, -0.7854F, 3.1416F);
		latch35_r1.cubeList.add(new ModelBox(latch35_r1, 100, 0, 4.5F, -42.5F, 5.0F, 1, 1, 1, 0.0F, true));

		latch34_r1 = new ModelRenderer(this);
		latch34_r1.setRotationPoint(0.0251F, 0.0F, 12.0104F);
		latch.addChild(latch34_r1);
		setRotationAngle(latch34_r1, -3.1416F, 0.7854F, 3.1416F);
		latch34_r1.cubeList.add(new ModelBox(latch34_r1, 100, 0, 2.5F, -42.5F, 6.0F, 1, 1, 1, 0.0F, true));

		latch33_r1 = new ModelRenderer(this);
		latch33_r1.setRotationPoint(-3.0962F, 0.0F, 2.5251F);
		latch.addChild(latch33_r1);
		setRotationAngle(latch33_r1, 0.0F, 0.7854F, 0.0F);
		latch33_r1.cubeList.add(new ModelBox(latch33_r1, 100, 0, 1.5F, -42.5F, 5.0F, 1, 1, 1, 0.0F, true));

		latch12_r1 = new ModelRenderer(this);
		latch12_r1.setRotationPoint(0.0F, -1.1075F, -5.8384F);
		latch.addChild(latch12_r1);
		setRotationAngle(latch12_r1, -0.1396F, 0.0F, 0.0F);
		latch12_r1.cubeList.add(new ModelBox(latch12_r1, 100, 0, 2.6F, -42.3F, 5.0F, 3, 1, 20, 0.0F, true));
		latch12_r1.cubeList.add(new ModelBox(latch12_r1, 100, 0, 0.4F, -42.3F, 5.0F, 3, 1, 20, 0.0F, true));

		latch10_r1 = new ModelRenderer(this);
		latch10_r1.setRotationPoint(0.0F, -1.0978F, -5.6992F);
		latch.addChild(latch10_r1);
		setRotationAngle(latch10_r1, -0.1396F, 0.0F, 0.0F);
		latch10_r1.cubeList.add(new ModelBox(latch10_r1, 100, 0, -0.6F, -41.3F, 5.0F, 1, 1, 20, 0.0F, true));
		latch10_r1.cubeList.add(new ModelBox(latch10_r1, 100, 0, 5.6F, -41.3F, 5.0F, 1, 1, 20, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		latch.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
