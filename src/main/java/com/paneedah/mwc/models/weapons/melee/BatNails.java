package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BatNails extends ModelWithAttachments {
	private final ModelRenderer bone;
	private final ModelRenderer Nail19_r1;
	private final ModelRenderer Nail18_r1;
	private final ModelRenderer Nail17_r1;
	private final ModelRenderer Nail16_r1;
	private final ModelRenderer Nail15_r1;
	private final ModelRenderer Nail14_r1;
	private final ModelRenderer Nail13_r1;
	private final ModelRenderer Nail12_r1;
	private final ModelRenderer Nail11_r1;
	private final ModelRenderer Nail10_r1;
	private final ModelRenderer Nail9_r1;
	private final ModelRenderer Nail8_r1;
	private final ModelRenderer Nail7_r1;
	private final ModelRenderer Nail6_r1;
	private final ModelRenderer Nail5_r1;
	private final ModelRenderer Nail4_r1;
	private final ModelRenderer Nail3_r1;
	private final ModelRenderer Nail2_r1;
	private final ModelRenderer Nail1_r1;
	private final ModelRenderer Handle6_r1;
	private final ModelRenderer Handle5_r1;
	private final ModelRenderer Nail20_r1;

	public BatNails() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-4.0905F, 24.0F, 5.2944F);
		bone.cubeList.add(new ModelBox(bone, 0, 50, 4.0905F, -5.0F, -5.2944F, 4, 1, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 4.5905F, -5.3F, -4.7944F, 3, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 5.5905F, -17.3F, -4.7944F, 1, 12, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 4.5905F, -17.3F, -3.7944F, 3, 12, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 50, 5.0905F, -50.0F, -5.2944F, 2, 33, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 50, 4.0905F, -50.0F, -4.2944F, 4, 33, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 50, 5.0905F, -50.5F, -4.2944F, 2, 1, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 50, 3.5905F, -48.0F, -4.2944F, 5, 24, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 50, 5.0905F, -48.0F, -5.7944F, 2, 24, 5, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 50, 4.0905F, -48.0F, -5.2944F, 4, 22, 4, 0.0F, true));

		Nail19_r1 = new ModelRenderer(this);
		Nail19_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(Nail19_r1);
		setRotationAngle(Nail19_r1, 0.0F, 1.4312F, 0.0F);
		Nail19_r1.cubeList.add(new ModelBox(Nail19_r1, 50, 50, 0.0F, -46.0F, 5.0F, 3, 1, 1, 0.0F, true));

		Nail18_r1 = new ModelRenderer(this);
		Nail18_r1.setRotationPoint(9.5245F, 0.0F, -5.662F);
		bone.addChild(Nail18_r1);
		setRotationAngle(Nail18_r1, 0.0F, -1.1519F, 0.0F);
		Nail18_r1.cubeList.add(new ModelBox(Nail18_r1, 50, 50, 2.0F, -42.0F, 4.0F, 3, 1, 1, 0.0F, true));

		Nail17_r1 = new ModelRenderer(this);
		Nail17_r1.setRotationPoint(0.0454F, 0.0F, -3.2333F);
		bone.addChild(Nail17_r1);
		setRotationAngle(Nail17_r1, 0.0F, 0.9425F, 0.0F);
		Nail17_r1.cubeList.add(new ModelBox(Nail17_r1, 50, 50, -1.0F, -45.0F, 5.0F, 3, 1, 1, 0.0F, true));

		Nail16_r1 = new ModelRenderer(this);
		Nail16_r1.setRotationPoint(9.0334F, 0.0F, -7.2047F);
		bone.addChild(Nail16_r1);
		setRotationAngle(Nail16_r1, 0.0F, -1.117F, 0.0F);
		Nail16_r1.cubeList.add(new ModelBox(Nail16_r1, 50, 50, 4.0F, -47.0F, 3.0F, 3, 1, 1, 0.0F, true));

		Nail15_r1 = new ModelRenderer(this);
		Nail15_r1.setRotationPoint(4.6173F, 0.0F, -5.918F);
		bone.addChild(Nail15_r1);
		setRotationAngle(Nail15_r1, 0.0F, -0.2269F, 0.0F);
		Nail15_r1.cubeList.add(new ModelBox(Nail15_r1, 50, 50, 4.0F, -43.0F, 2.0F, 3, 1, 1, 0.0F, true));

		Nail14_r1 = new ModelRenderer(this);
		Nail14_r1.setRotationPoint(4.0685F, 0.0F, -5.1367F);
		bone.addChild(Nail14_r1);
		setRotationAngle(Nail14_r1, 0.0F, 0.0524F, 0.0F);
		Nail14_r1.cubeList.add(new ModelBox(Nail14_r1, 50, 50, 3.0F, -41.0F, 0.5F, 3, 1, 1, 0.0F, true));

		Nail13_r1 = new ModelRenderer(this);
		Nail13_r1.setRotationPoint(4.2422F, 0.0F, -5.7744F);
		bone.addChild(Nail13_r1);
		setRotationAngle(Nail13_r1, 0.0F, -0.1222F, 0.0F);
		Nail13_r1.cubeList.add(new ModelBox(Nail13_r1, 50, 50, 4.0F, -47.0F, 1.0F, 3, 1, 1, 0.0F, true));

		Nail12_r1 = new ModelRenderer(this);
		Nail12_r1.setRotationPoint(4.1456F, 0.0F, -4.722F);
		bone.addChild(Nail12_r1);
		setRotationAngle(Nail12_r1, 0.0F, 0.192F, 0.0F);
		Nail12_r1.cubeList.add(new ModelBox(Nail12_r1, 50, 50, 3.0F, -46.0F, 0.0F, 3, 1, 1, 0.0F, true));

		Nail11_r1 = new ModelRenderer(this);
		Nail11_r1.setRotationPoint(5.5701F, 0.0F, -6.2552F);
		bone.addChild(Nail11_r1);
		setRotationAngle(Nail11_r1, 0.0F, -0.4189F, 0.0F);
		Nail11_r1.cubeList.add(new ModelBox(Nail11_r1, 50, 50, 3.0F, -45.0F, 3.0F, 3, 1, 1, 0.0F, true));

		Nail10_r1 = new ModelRenderer(this);
		Nail10_r1.setRotationPoint(4.3499F, 0.0F, -4.0742F);
		bone.addChild(Nail10_r1);
		setRotationAngle(Nail10_r1, 0.0F, 0.4189F, 0.0F);
		Nail10_r1.cubeList.add(new ModelBox(Nail10_r1, 50, 50, 3.0F, -43.0F, 0.0F, 3, 1, 1, 0.0F, true));

		Nail9_r1 = new ModelRenderer(this);
		Nail9_r1.setRotationPoint(4.0905F, 0.0F, -5.2944F);
		bone.addChild(Nail9_r1);
		setRotationAngle(Nail9_r1, -3.1416F, 0.5411F, 3.1416F);
		Nail9_r1.cubeList.add(new ModelBox(Nail9_r1, 50, 50, -1.0F, -47.0F, 0.0F, 3, 1, 1, 0.0F, true));

		Nail8_r1 = new ModelRenderer(this);
		Nail8_r1.setRotationPoint(5.765F, 0.0F, -3.4988F);
		bone.addChild(Nail8_r1);
		setRotationAngle(Nail8_r1, 0.0F, 1.501F, 0.0F);
		Nail8_r1.cubeList.add(new ModelBox(Nail8_r1, 50, 50, 1.8F, -40.0F, 0.0F, 3, 1, 1, 0.0F, true));

		Nail7_r1 = new ModelRenderer(this);
		Nail7_r1.setRotationPoint(3.6976F, 0.0F, -5.785F);
		bone.addChild(Nail7_r1);
		setRotationAngle(Nail7_r1, 0.0F, 0.1745F, 0.0F);
		Nail7_r1.cubeList.add(new ModelBox(Nail7_r1, 50, 50, -3.0F, -46.0F, 2.0F, 3, 1, 1, 0.0F, true));

		Nail6_r1 = new ModelRenderer(this);
		Nail6_r1.setRotationPoint(4.5905F, 0.0F, -4.4284F);
		bone.addChild(Nail6_r1);
		setRotationAngle(Nail6_r1, 0.0F, 1.0472F, 0.0F);
		Nail6_r1.cubeList.add(new ModelBox(Nail6_r1, 50, 50, 1.0F, -47.0F, 0.0F, 3, 1, 1, 0.0F, true));

		Nail5_r1 = new ModelRenderer(this);
		Nail5_r1.setRotationPoint(5.4159F, 0.0F, -4.101F);
		bone.addChild(Nail5_r1);
		setRotationAngle(Nail5_r1, -3.1416F, 1.4661F, 3.1416F);
		Nail5_r1.cubeList.add(new ModelBox(Nail5_r1, 50, 50, 1.2F, -44.0F, 0.0F, 3, 1, 1, 0.0F, true));

		Nail4_r1 = new ModelRenderer(this);
		Nail4_r1.setRotationPoint(4.0905F, 0.0F, -5.2944F);
		bone.addChild(Nail4_r1);
		setRotationAngle(Nail4_r1, -3.1416F, 1.0821F, 3.1416F);
		Nail4_r1.cubeList.add(new ModelBox(Nail4_r1, 50, 50, -1.0F, -41.0F, 0.0F, 3, 1, 1, 0.0F, true));

		Nail3_r1 = new ModelRenderer(this);
		Nail3_r1.setRotationPoint(4.3195F, 0.0F, -4.4724F);
		bone.addChild(Nail3_r1);
		setRotationAngle(Nail3_r1, 0.0F, -0.384F, 0.0F);
		Nail3_r1.cubeList.add(new ModelBox(Nail3_r1, 50, 50, -2.0F, -40.0F, 1.0F, 3, 1, 1, 0.0F, true));

		Nail2_r1 = new ModelRenderer(this);
		Nail2_r1.setRotationPoint(4.0829F, 0.0F, -5.1201F);
		bone.addChild(Nail2_r1);
		setRotationAngle(Nail2_r1, 0.0F, -0.0873F, 0.0F);
		Nail2_r1.cubeList.add(new ModelBox(Nail2_r1, 50, 50, -2.0F, -43.0F, 0.0F, 3, 1, 1, 0.0F, true));

		Nail1_r1 = new ModelRenderer(this);
		Nail1_r1.setRotationPoint(2.2907F, 0.0F, -5.7621F);
		bone.addChild(Nail1_r1);
		setRotationAngle(Nail1_r1, 0.0F, 0.4189F, 0.0F);
		Nail1_r1.cubeList.add(new ModelBox(Nail1_r1, 50, 50, -2.0F, -44.0F, 4.0F, 3, 1, 1, 0.0F, true));

		Handle6_r1 = new ModelRenderer(this);
		Handle6_r1.setRotationPoint(4.9325F, 0.0F, -7.3784F);
		bone.addChild(Handle6_r1);
		setRotationAngle(Handle6_r1, 0.0F, -0.7679F, 0.0F);
		Handle6_r1.cubeList.add(new ModelBox(Handle6_r1, 0, 0, 3.2F, -17.3F, 0.6F, 1, 12, 3, 0.0F, true));

		Handle5_r1 = new ModelRenderer(this);
		Handle5_r1.setRotationPoint(4.0905F, 0.0F, -5.2944F);
		bone.addChild(Handle5_r1);
		setRotationAngle(Handle5_r1, 0.0F, 0.7679F, 0.0F);
		Handle5_r1.cubeList.add(new ModelBox(Handle5_r1, 0, 0, -0.5F, -17.3F, 1.4F, 1, 12, 3, 0.0F, true));

		Nail20_r1 = new ModelRenderer(this);
		Nail20_r1.setRotationPoint(-0.691F, 0.0F, -1.7563F);
		bone.addChild(Nail20_r1);
		setRotationAngle(Nail20_r1, 0.0F, 1.2741F, 0.0F);
		Nail20_r1.cubeList.add(new ModelBox(Nail20_r1, 50, 50, -1.0F, -41.0F, 5.0F, 3, 1, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}