package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TacticalTomahawk extends ModelWithAttachments {
	private final ModelRenderer AxeHead;
	private final ModelRenderer AxeHead41_r1;
	private final ModelRenderer AxeHead37_r1;
	private final ModelRenderer AxeHead34_r1;
	private final ModelRenderer AxeHead33_r1;
	private final ModelRenderer AxeHead32_r1;
	private final ModelRenderer AxeHead25_r1;
	private final ModelRenderer AxeHead21_r1;
	private final ModelRenderer AxeHead20_r1;
	private final ModelRenderer AxeHead15_r1;
	private final ModelRenderer AxeHead14_r1;
	private final ModelRenderer AxeHead9_r1;
	private final ModelRenderer AxeHead8_r1;
	private final ModelRenderer AxeHead7_r1;
	private final ModelRenderer AxeHead3_r1;
	private final ModelRenderer AxeHead2_r1;
	private final ModelRenderer AxeHead43_r1;
	private final ModelRenderer shape;
	private final ModelRenderer Shape10_r1;
	private final ModelRenderer Shape9_r1;
	private final ModelRenderer Shape7_r1;
	private final ModelRenderer Shape6_r1;
	private final ModelRenderer handle;

	public TacticalTomahawk() {
		textureWidth = 256;
		textureHeight = 256;

		AxeHead = new ModelRenderer(this);
		AxeHead.setRotationPoint(0.0F, 24.0F, 0.0F);
		AxeHead.cubeList.add(new ModelBox(AxeHead, 0, 0, -7.0F, -67.0F, 0.0F, 18, 2, 4, 0.0F, true));
		AxeHead.cubeList.add(new ModelBox(AxeHead, 0, 0, -5.0F, -62.0F, 0.0F, 5, 3, 4, 0.0F, true));
		AxeHead.cubeList.add(new ModelBox(AxeHead, 0, 0, -13.8F, -57.0F, 1.5F, 1, 2, 1, 0.0F, true));
		AxeHead.cubeList.add(new ModelBox(AxeHead, 0, 0, 11.0F, -67.0F, 0.5F, 3, 1, 3, 0.0F, true));
		AxeHead.cubeList.add(new ModelBox(AxeHead, 0, 0, 14.0F, -67.0F, 1.0F, 4, 3, 2, 0.0F, true));
		AxeHead.cubeList.add(new ModelBox(AxeHead, 0, 0, 18.0F, -67.0F, 1.5F, 3, 1, 1, 0.0F, true));
		AxeHead.cubeList.add(new ModelBox(AxeHead, 0, 0, 4.0F, -65.0F, 0.0F, 7, 4, 4, 0.0F, true));

		AxeHead41_r1 = new ModelRenderer(this);
		AxeHead41_r1.setRotationPoint(-0.3538F, 0.0F, 1.9557F);
		AxeHead.addChild(AxeHead41_r1);
		setRotationAngle(AxeHead41_r1, 0.0F, 0.1745F, 0.0F);
		AxeHead41_r1.cubeList.add(new ModelBox(AxeHead41_r1, 0, 0, 10.8F, -67.0F, 3.0F, 3, 5, 1, 0.0F, true));

		AxeHead37_r1 = new ModelRenderer(this);
		AxeHead37_r1.setRotationPoint(32.4994F, -3.4109F, 0.0F);
		AxeHead.addChild(AxeHead37_r1);
		setRotationAngle(AxeHead37_r1, 0.0F, 0.0F, -0.5411F);
		AxeHead37_r1.cubeList.add(new ModelBox(AxeHead37_r1, 0, 0, 18.1F, -60.3F, 1.5F, 4, 1, 1, 0.0F, true));
		AxeHead37_r1.cubeList.add(new ModelBox(AxeHead37_r1, 0, 0, 14.1F, -62.3F, 1.0F, 4, 3, 2, 0.0F, true));
		AxeHead37_r1.cubeList.add(new ModelBox(AxeHead37_r1, 0, 0, 10.1F, -62.3F, 0.5F, 4, 3, 3, 0.0F, true));

		AxeHead34_r1 = new ModelRenderer(this);
		AxeHead34_r1.setRotationPoint(-17.5728F, -5.0175F, 0.0F);
		AxeHead.addChild(AxeHead34_r1);
		setRotationAngle(AxeHead34_r1, 0.0F, 0.0F, 0.2967F);
		AxeHead34_r1.cubeList.add(new ModelBox(AxeHead34_r1, 0, 0, 8.0F, -62.3F, 0.0F, 3, 2, 4, 0.0F, true));

		AxeHead33_r1 = new ModelRenderer(this);
		AxeHead33_r1.setRotationPoint(15.6314F, -1.268F, 0.0F);
		AxeHead.addChild(AxeHead33_r1);
		setRotationAngle(AxeHead33_r1, 0.0F, 0.0F, -0.2618F);
		AxeHead33_r1.cubeList.add(new ModelBox(AxeHead33_r1, 0, 0, 3.0F, -61.0F, 0.0F, 5, 2, 4, 0.0F, true));

		AxeHead32_r1 = new ModelRenderer(this);
		AxeHead32_r1.setRotationPoint(0.1045F, 0.0F, 2.1051F);
		AxeHead.addChild(AxeHead32_r1);
		setRotationAngle(AxeHead32_r1, 0.0F, -0.1396F, 0.0F);
		AxeHead32_r1.cubeList.add(new ModelBox(AxeHead32_r1, 0, 0, -15.2F, -70.0F, 1.8F, 2, 2, 1, 0.0F, true));
		AxeHead32_r1.cubeList.add(new ModelBox(AxeHead32_r1, 0, 0, -15.2F, -68.0F, 1.8F, 3, 1, 1, 0.0F, true));
		AxeHead32_r1.cubeList.add(new ModelBox(AxeHead32_r1, 0, 0, -15.2F, -56.0F, 1.8F, 2, 2, 1, 0.0F, true));
		AxeHead32_r1.cubeList.add(new ModelBox(AxeHead32_r1, 0, 0, -15.2F, -57.0F, 1.8F, 3, 1, 1, 0.0F, true));
		AxeHead32_r1.cubeList.add(new ModelBox(AxeHead32_r1, 0, 0, -15.2F, -58.0F, 1.8F, 4, 1, 1, 0.0F, true));
		AxeHead32_r1.cubeList.add(new ModelBox(AxeHead32_r1, 0, 0, -15.4F, -59.0F, 1.8F, 7, 1, 1, 0.0F, true));
		AxeHead32_r1.cubeList.add(new ModelBox(AxeHead32_r1, 0, 0, -15.2F, -67.0F, 1.8F, 9, 1, 1, 0.0F, true));
		AxeHead32_r1.cubeList.add(new ModelBox(AxeHead32_r1, 0, 0, -14.4F, -65.0F, 1.8F, 7, 2, 1, 0.0F, true));
		AxeHead32_r1.cubeList.add(new ModelBox(AxeHead32_r1, 0, 0, -15.4F, -66.0F, 1.8F, 9, 1, 1, 0.0F, true));
		AxeHead32_r1.cubeList.add(new ModelBox(AxeHead32_r1, 0, 0, -15.4F, -63.0F, 1.8F, 11, 4, 1, 0.0F, true));

		AxeHead25_r1 = new ModelRenderer(this);
		AxeHead25_r1.setRotationPoint(-0.313F, 0.0F, -2.0759F);
		AxeHead.addChild(AxeHead25_r1);
		setRotationAngle(AxeHead25_r1, 0.0F, 0.1396F, 0.0F);
		AxeHead25_r1.cubeList.add(new ModelBox(AxeHead25_r1, 0, 0, -15.3F, -56.0F, 1.2F, 2, 2, 1, 0.0F, true));
		AxeHead25_r1.cubeList.add(new ModelBox(AxeHead25_r1, 0, 0, -15.3F, -57.0F, 1.2F, 3, 1, 1, 0.0F, true));
		AxeHead25_r1.cubeList.add(new ModelBox(AxeHead25_r1, 0, 0, -15.3F, -58.0F, 1.2F, 4, 1, 1, 0.0F, true));
		AxeHead25_r1.cubeList.add(new ModelBox(AxeHead25_r1, 0, 0, -15.6F, -59.0F, 1.2F, 7, 1, 1, 0.0F, true));
		AxeHead25_r1.cubeList.add(new ModelBox(AxeHead25_r1, 0, 0, -15.3F, -70.0F, 1.2F, 2, 2, 1, 0.0F, true));
		AxeHead25_r1.cubeList.add(new ModelBox(AxeHead25_r1, 0, 0, -15.3F, -68.0F, 1.2F, 3, 1, 1, 0.0F, true));
		AxeHead25_r1.cubeList.add(new ModelBox(AxeHead25_r1, 0, 0, -15.3F, -67.0F, 1.2F, 9, 1, 1, 0.0F, true));
		AxeHead25_r1.cubeList.add(new ModelBox(AxeHead25_r1, 0, 0, -15.6F, -65.0F, 1.2F, 8, 2, 1, 0.0F, true));
		AxeHead25_r1.cubeList.add(new ModelBox(AxeHead25_r1, 0, 0, -15.6F, -66.0F, 1.2F, 9, 1, 1, 0.0F, true));
		AxeHead25_r1.cubeList.add(new ModelBox(AxeHead25_r1, 0, 0, -15.6F, -63.0F, 1.2F, 11, 4, 1, 0.0F, true));

		AxeHead21_r1 = new ModelRenderer(this);
		AxeHead21_r1.setRotationPoint(38.8912F, -28.6611F, 0.0F);
		AxeHead.addChild(AxeHead21_r1);
		setRotationAngle(AxeHead21_r1, 0.0F, 0.0F, -0.8552F);
		AxeHead21_r1.cubeList.add(new ModelBox(AxeHead21_r1, 0, 0, -17.0F, -57.0F, 1.5F, 6, 1, 1, 0.0F, true));

		AxeHead20_r1 = new ModelRenderer(this);
		AxeHead20_r1.setRotationPoint(32.6903F, -18.2991F, 0.0F);
		AxeHead.addChild(AxeHead20_r1);
		setRotationAngle(AxeHead20_r1, 0.0F, 0.0F, -0.6458F);
		AxeHead20_r1.cubeList.add(new ModelBox(AxeHead20_r1, 0, 0, -13.0F, -59.0F, 1.0F, 4, 2, 2, 0.0F, true));

		AxeHead15_r1 = new ModelRenderer(this);
		AxeHead15_r1.setRotationPoint(21.6744F, -8.2792F, 0.0F);
		AxeHead.addChild(AxeHead15_r1);
		setRotationAngle(AxeHead15_r1, 0.0F, 0.0F, -0.3316F);
		AxeHead15_r1.cubeList.add(new ModelBox(AxeHead15_r1, 0, 0, -13.9F, -70.9F, 1.5F, 1, 4, 1, 0.0F, true));

		AxeHead14_r1 = new ModelRenderer(this);
		AxeHead14_r1.setRotationPoint(-35.5309F, -3.1969F, 0.0F);
		AxeHead.addChild(AxeHead14_r1);
		setRotationAngle(AxeHead14_r1, 0.0F, 0.0F, 0.5236F);
		AxeHead14_r1.cubeList.add(new ModelBox(AxeHead14_r1, 0, 0, -12.8F, -67.9F, 1.0F, 2, 1, 2, 0.0F, true));

		AxeHead9_r1 = new ModelRenderer(this);
		AxeHead9_r1.setRotationPoint(-6.0126F, 0.0F, -10.5158F);
		AxeHead.addChild(AxeHead9_r1);
		setRotationAngle(AxeHead9_r1, 0.0F, 0.7854F, 0.0F);
		AxeHead9_r1.cubeList.add(new ModelBox(AxeHead9_r1, 0, 0, -15.7F, -71.0F, 2.0F, 1, 18, 1, 0.0F, true));

		AxeHead8_r1 = new ModelRenderer(this);
		AxeHead8_r1.setRotationPoint(-6.1884F, 0.0F, -10.9401F);
		AxeHead.addChild(AxeHead8_r1);
		setRotationAngle(AxeHead8_r1, 0.0F, 0.7854F, 0.0F);
		AxeHead8_r1.cubeList.add(new ModelBox(AxeHead8_r1, 0, 0, -16.3F, -66.0F, 2.0F, 1, 8, 1, 0.0F, true));

		AxeHead7_r1 = new ModelRenderer(this);
		AxeHead7_r1.setRotationPoint(15.3588F, -3.3385F, 0.0F);
		AxeHead.addChild(AxeHead7_r1);
		setRotationAngle(AxeHead7_r1, 0.0F, 0.0F, -0.2618F);
		AxeHead7_r1.cubeList.add(new ModelBox(AxeHead7_r1, 0, 0, -10.0F, -60.0F, 1.0F, 5, 1, 2, 0.0F, true));

		AxeHead3_r1 = new ModelRenderer(this);
		AxeHead3_r1.setRotationPoint(-8.2371F, 0.4748F, 0.0F);
		AxeHead.addChild(AxeHead3_r1);
		setRotationAngle(AxeHead3_r1, 0.0F, 0.0F, 0.1222F);
		AxeHead3_r1.cubeList.add(new ModelBox(AxeHead3_r1, 0, 0, -11.0F, -67.1F, 1.0F, 4, 2, 2, 0.0F, true));

		AxeHead2_r1 = new ModelRenderer(this);
		AxeHead2_r1.setRotationPoint(-6.1005F, 0.0F, -10.7279F);
		AxeHead.addChild(AxeHead2_r1);
		setRotationAngle(AxeHead2_r1, 0.0F, 0.7854F, 0.0F);
		AxeHead2_r1.cubeList.add(new ModelBox(AxeHead2_r1, 0, 0, -16.0F, -69.0F, 2.0F, 1, 14, 1, 0.0F, true));

		AxeHead43_r1 = new ModelRenderer(this);
		AxeHead43_r1.setRotationPoint(0.1354F, 0.0F, -1.7208F);
		AxeHead.addChild(AxeHead43_r1);
		setRotationAngle(AxeHead43_r1, 0.0F, -0.1571F, 0.0F);
		AxeHead43_r1.cubeList.add(new ModelBox(AxeHead43_r1, 0, 0, 11.0F, -67.0F, 0.0F, 3, 5, 1, 0.0F, true));

		shape = new ModelRenderer(this);
		shape.setRotationPoint(-0.2212F, 24.0F, 2.1896F);
		shape.cubeList.add(new ModelBox(shape, 0, 0, -0.7788F, -65.0F, -2.1896F, 5, 3, 4, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -4.7788F, -63.0F, -2.1896F, 4, 1, 4, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -8.2788F, -65.0F, -1.1896F, 1, 2, 2, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -5.7788F, -65.0F, -2.1896F, 1, 2, 4, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -3.2788F, -65.0F, -2.1896F, 1, 2, 4, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -4.7788F, -67.5F, -1.1896F, 16, 1, 2, 0.0F, true));

		Shape10_r1 = new ModelRenderer(this);
		Shape10_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		shape.addChild(Shape10_r1);
		setRotationAngle(Shape10_r1, 0.0F, 0.1571F, 0.0F);
		Shape10_r1.cubeList.add(new ModelBox(Shape10_r1, 0, 0, 13.8F, -67.0F, 2.5F, 3, 3, 1, 0.0F, true));

		Shape9_r1 = new ModelRenderer(this);
		Shape9_r1.setRotationPoint(0.272F, 0.0F, 2.2244F);
		shape.addChild(Shape9_r1);
		setRotationAngle(Shape9_r1, 0.0F, 0.2443F, 0.0F);
		Shape9_r1.cubeList.add(new ModelBox(Shape9_r1, 0, 0, 18.0F, -67.0F, 2.0F, 2, 2, 1, 0.0F, true));

		Shape7_r1 = new ModelRenderer(this);
		Shape7_r1.setRotationPoint(0.9978F, 0.0F, -6.5145F);
		shape.addChild(Shape7_r1);
		setRotationAngle(Shape7_r1, 0.0F, -0.2443F, 0.0F);
		Shape7_r1.cubeList.add(new ModelBox(Shape7_r1, 0, 0, 18.0F, -67.0F, 1.0F, 2, 2, 1, 0.0F, true));

		Shape6_r1 = new ModelRenderer(this);
		Shape6_r1.setRotationPoint(0.4718F, 0.0F, -4.3735F);
		shape.addChild(Shape6_r1);
		setRotationAngle(Shape6_r1, 0.0F, -0.1571F, 0.0F);
		Shape6_r1.cubeList.add(new ModelBox(Shape6_r1, 0, 0, 14.0F, -67.0F, 0.5F, 3, 3, 1, 0.0F, true));

		handle = new ModelRenderer(this);
		handle.setRotationPoint(0.0F, 24.0F, 0.0F);
		handle.cubeList.add(new ModelBox(handle, 100, 100, -1.0F, -39.0F, 0.0F, 6, 3, 4, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, -1.5F, -38.0F, 1.0F, 1, 1, 2, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 4.5F, -38.0F, 1.0F, 1, 1, 2, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 0.0F, -4.0F, -0.5F, 4, 2, 5, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 0.5F, -30.0F, 0.0F, 3, 29, 4, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 0.0F, -29.0F, -0.5F, 4, 1, 5, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 0.0F, -27.0F, -0.5F, 4, 1, 5, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 0.0F, -25.0F, -0.5F, 4, 1, 5, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 0.0F, -23.0F, -0.5F, 4, 1, 5, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 0.0F, -21.0F, -0.5F, 4, 1, 5, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 0.0F, -17.0F, -0.5F, 4, 3, 5, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 0.0F, -19.0F, -0.5F, 4, 1, 5, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 0.0F, -13.0F, -0.5F, 4, 1, 5, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 0.0F, -11.0F, -0.5F, 4, 1, 5, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 0.0F, -9.0F, -0.5F, 4, 1, 5, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 0.0F, -7.0F, -0.5F, 4, 2, 5, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 1.0F, -60.0F, -1.0F, 2, 2, 6, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 1.0F, -53.0F, -1.0F, 2, 2, 6, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 1.0F, -46.0F, -1.0F, 2, 2, 6, 0.0F, true));
		handle.cubeList.add(new ModelBox(handle, 100, 100, 0.0F, -62.0F, -0.5F, 4, 32, 5, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		AxeHead.render(f5);
		shape.render(f5);
		handle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
