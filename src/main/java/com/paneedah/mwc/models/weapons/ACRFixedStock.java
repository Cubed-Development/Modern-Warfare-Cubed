package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ACRFixedStock extends ModelWithAttachments {
	private final ModelRenderer Fixed_stock;
	private final ModelRenderer bone27_r1_r1;
	private final ModelRenderer bone26_r1_r1;
	private final ModelRenderer bone25_r1_r1;
	private final ModelRenderer bone3_r1_r1;
	private final ModelRenderer bone11_r1_r1;
	private final ModelRenderer bone11_r1_r2;
	private final ModelRenderer bone11_r1_r3;
	private final ModelRenderer bone11_r1_r4;
	private final ModelRenderer bone10_r2;
	private final ModelRenderer bone17_r1;
	private final ModelRenderer bone18_r1;
	private final ModelRenderer bone15_r2;
	private final ModelRenderer bone12_r1;
	private final ModelRenderer bone14_r2;
	private final ModelRenderer bone16_r1;
	private final ModelRenderer bone19_r1;
	private final ModelRenderer bone20_r1;
	private final ModelRenderer bone24_r1;
	private final ModelRenderer bone2_r2;
	private final ModelRenderer bone29_r1;
	private final ModelRenderer bone28_r1;
	private final ModelRenderer bone22_r1;
	private final ModelRenderer bone23_r1;
	private final ModelRenderer bone7_r2;
	private final ModelRenderer bone6_r1;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer bone4_r1;
	private final ModelRenderer bone8_r2;
	private final ModelRenderer bone9_r2;

	public ACRFixedStock() {
		textureWidth = 380;
		textureHeight = 380;

		Fixed_stock = new ModelRenderer(this);
		Fixed_stock.setRotationPoint(-1.4559F, -12.7487F, 14.3973F);
		Fixed_stock.cubeList.add(new ModelBox(Fixed_stock, 161, 63, -1.5441F, 1.6987F, -11.6973F, 3, 1, 9, 0.0F, false));
		Fixed_stock.cubeList.add(new ModelBox(Fixed_stock, 161, 33, -1.0441F, -4.9513F, -11.6973F, 2, 2, 2, 0.0F, false));
		Fixed_stock.cubeList.add(new ModelBox(Fixed_stock, 21, 59, 1.6559F, -2.2513F, -11.4973F, 1, 4, 1, 0.0F, false));
		Fixed_stock.cubeList.add(new ModelBox(Fixed_stock, 0, 147, -2.0441F, -3.2513F, -11.6973F, 4, 3, 2, 0.0F, false));
		Fixed_stock.cubeList.add(new ModelBox(Fixed_stock, 217, 136, -2.0441F, 1.2487F, -11.6973F, 4, 1, 10, 0.0F, false));
		Fixed_stock.cubeList.add(new ModelBox(Fixed_stock, 31, 246, -2.0441F, -0.7513F, -11.6973F, 4, 2, 23, 0.0F, false));
		Fixed_stock.cubeList.add(new ModelBox(Fixed_stock, 20, 105, -2.0441F, 8.8487F, 5.2527F, 4, 1, 3, 0.0F, false));
		Fixed_stock.cubeList.add(new ModelBox(Fixed_stock, 71, 33, -2.0441F, 7.8487F, 8.2527F, 4, 2, 3, 0.0F, false));
		Fixed_stock.cubeList.add(new ModelBox(Fixed_stock, 94, 47, -2.0441F, -2.1513F, 11.2527F, 4, 12, 2, 0.0F, false));
		Fixed_stock.cubeList.add(new ModelBox(Fixed_stock, 141, 63, -2.0441F, -2.1513F, 13.2527F, 4, 12, 1, 0.0F, false));
		Fixed_stock.cubeList.add(new ModelBox(Fixed_stock, 179, 211, -2.5441F, -1.9012F, -6.9975F, 5, 2, 11, 0.0F, false));

		bone27_r1_r1 = new ModelRenderer(this);
		bone27_r1_r1.setRotationPoint(7.8275F, -28.011F, -88.0534F);
		Fixed_stock.addChild(bone27_r1_r1);
		setRotationAngle(bone27_r1_r1, -1.6293F, -0.0648F, -0.8359F);
		bone27_r1_r1.cubeList.add(new ModelBox(bone27_r1_r1, 0, 129, -17.4911F, -102.7226F, 5.5984F, 1, 5, 1, 0.0F, false));
		bone27_r1_r1.cubeList.add(new ModelBox(bone27_r1_r1, 85, 125, -17.5011F, -102.7226F, 5.9537F, 1, 5, 1, 0.0F, false));
		bone27_r1_r1.cubeList.add(new ModelBox(bone27_r1_r1, 40, 0, -17.4911F, -104.7226F, 5.5984F, 1, 2, 1, 0.0F, false));
		bone27_r1_r1.cubeList.add(new ModelBox(bone27_r1_r1, 28, 23, -17.5011F, -104.7226F, 5.9537F, 1, 2, 1, 0.0F, false));

		bone26_r1_r1 = new ModelRenderer(this);
		bone26_r1_r1.setRotationPoint(-5.3887F, -24.7319F, -86.1109F);
		Fixed_stock.addChild(bone26_r1_r1);
		setRotationAngle(bone26_r1_r1, -1.6293F, 0.0648F, 0.8359F);
		bone26_r1_r1.cubeList.add(new ModelBox(bone26_r1_r1, 94, 130, 12.4984F, -100.5016F, 5.404F, 1, 5, 1, 0.0F, false));
		bone26_r1_r1.cubeList.add(new ModelBox(bone26_r1_r1, 47, 130, 12.4884F, -100.5016F, 5.7593F, 1, 5, 1, 0.0F, false));
		bone26_r1_r1.cubeList.add(new ModelBox(bone26_r1_r1, 33, 67, 12.4984F, -102.5016F, 5.404F, 1, 2, 1, 0.0F, false));
		bone26_r1_r1.cubeList.add(new ModelBox(bone26_r1_r1, 15, 56, 12.4884F, -102.5016F, 5.7593F, 1, 2, 1, 0.0F, false));

		bone25_r1_r1 = new ModelRenderer(this);
		bone25_r1_r1.setRotationPoint(1.4559F, -18.8086F, -95.5329F);
		Fixed_stock.addChild(bone25_r1_r1);
		setRotationAngle(bone25_r1_r1, -1.6581F, 0.0F, 0.0F);
		bone25_r1_r1.cubeList.add(new ModelBox(bone25_r1_r1, 115, 6, -3.49F, -108.3508F, 7.0857F, 4, 4, 2, 0.0F, false));
		bone25_r1_r1.cubeList.add(new ModelBox(bone25_r1_r1, 58, 105, -2.49F, -111.3595F, 6.1853F, 2, 2, 1, 0.0F, false));
		bone25_r1_r1.cubeList.add(new ModelBox(bone25_r1_r1, 68, 59, -2.49F, -109.3595F, 6.1853F, 2, 5, 1, 0.0F, false));

		bone3_r1_r1 = new ModelRenderer(this);
		bone3_r1_r1.setRotationPoint(1.4559F, 57.5466F, -10.5055F);
		Fixed_stock.addChild(bone3_r1_r1);
		setRotationAngle(bone3_r1_r1, 0.6981F, 0.0F, 0.0F);
		bone3_r1_r1.cubeList.add(new ModelBox(bone3_r1_r1, 67, 80, -3.5F, -34.3477F, 48.7182F, 4, 2, 4, -0.002F, false));

		bone11_r1_r1 = new ModelRenderer(this);
		bone11_r1_r1.setRotationPoint(-108.9111F, -38.0692F, -13.6216F);
		Fixed_stock.addChild(bone11_r1_r1);
		setRotationAngle(bone11_r1_r1, 0.0489F, 0.0723F, 2.166F);
		bone11_r1_r1.cubeList.add(new ModelBox(bone11_r1_r1, 0, 183, -32.3329F, -108.6278F, 8.3416F, 1, 1, 14, 0.0F, false));

		bone11_r1_r2 = new ModelRenderer(this);
		bone11_r1_r2.setRotationPoint(-1.6926F, -2.4555F, -1.3393F);
		Fixed_stock.addChild(bone11_r1_r2);
		setRotationAngle(bone11_r1_r2, 0.0487F, 0.0453F, 2.1821F);
		bone11_r1_r2.cubeList.add(new ModelBox(bone11_r1_r2, 0, 215, -0.2F, -0.5F, -6.4F, 1, 1, 13, 0.0F, false));

		bone11_r1_r3 = new ModelRenderer(this);
		bone11_r1_r3.setRotationPoint(108.8229F, -38.0692F, -13.6216F);
		Fixed_stock.addChild(bone11_r1_r3);
		setRotationAngle(bone11_r1_r3, 0.0489F, -0.0723F, -2.166F);
		bone11_r1_r3.cubeList.add(new ModelBox(bone11_r1_r3, 141, 46, 32.3329F, -108.6278F, 7.3416F, 1, 1, 16, 0.0F, false));
		bone11_r1_r3.cubeList.add(new ModelBox(bone11_r1_r3, 32, 184, 31.3329F, -108.6278F, 8.3416F, 1, 1, 14, 0.0F, false));

		bone11_r1_r4 = new ModelRenderer(this);
		bone11_r1_r4.setRotationPoint(1.6044F, -2.4555F, -1.3393F);
		Fixed_stock.addChild(bone11_r1_r4);
		setRotationAngle(bone11_r1_r4, 0.0487F, -0.0453F, -2.1821F);
		bone11_r1_r4.cubeList.add(new ModelBox(bone11_r1_r4, 31, 216, -0.8F, -0.5F, -6.4F, 1, 1, 13, 0.0F, false));

		bone10_r2 = new ModelRenderer(this);
		bone10_r2.setRotationPoint(1.4559F, 36.132F, -18.0175F);
		Fixed_stock.addChild(bone10_r2);
		setRotationAngle(bone10_r2, -0.0873F, 0.0F, 0.0F);
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 94, 113, -2.5F, -41.75F, 5.25F, 2, 1, 16, 0.0F, false));
		bone10_r2.cubeList.add(new ModelBox(bone10_r2, 0, 0, -2.5F, -41.4511F, 4.2761F, 2, 4, 19, 0.0F, false));

		bone17_r1 = new ModelRenderer(this);
		bone17_r1.setRotationPoint(27.6341F, -38.5017F, 20.054F);
		Fixed_stock.addChild(bone17_r1);
		setRotationAngle(bone17_r1, -3.0617F, -0.7355F, 0.9089F);
		bone17_r1.cubeList.add(new ModelBox(bone17_r1, 160, 84, -1.0F, -41.994F, 21.2769F, 1, 1, 3, 0.0F, false));

		bone18_r1 = new ModelRenderer(this);
		bone18_r1.setRotationPoint(-6.2077F, -32.3187F, 41.9436F);
		Fixed_stock.addChild(bone18_r1);
		setRotationAngle(bone18_r1, 1.6598F, -0.6734F, 2.0415F);
		bone18_r1.cubeList.add(new ModelBox(bone18_r1, 63, 20, -4.0F, -43.8943F, 21.2856F, 1, 3, 1, 0.0F, false));

		bone15_r2 = new ModelRenderer(this);
		bone15_r2.setRotationPoint(39.4435F, -20.2743F, -8.544F);
		Fixed_stock.addChild(bone15_r2);
		setRotationAngle(bone15_r2, 0.145F, 0.4959F, -1.9691F);
		bone15_r2.cubeList.add(new ModelBox(bone15_r2, 8, 82, -2.9F, -41.8534F, 5.3284F, 3, 1, 2, 0.0F, false));

		bone12_r1 = new ModelRenderer(this);
		bone12_r1.setRotationPoint(-37.0546F, -26.6514F, -12.5225F);
		Fixed_stock.addChild(bone12_r1);
		setRotationAngle(bone12_r1, 0.0489F, 0.0723F, 2.166F);
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 138, 140, -2.5F, -42.75F, 5.25F, 1, 1, 16, 0.0F, false));

		bone14_r2 = new ModelRenderer(this);
		bone14_r2.setRotationPoint(-36.6254F, -26.07F, -9.9778F);
		Fixed_stock.addChild(bone14_r2);
		setRotationAngle(bone14_r2, 0.22F, 1.0478F, 2.2472F);
		bone14_r2.cubeList.add(new ModelBox(bone14_r2, 128, 79, -5.1F, -41.8534F, 5.3284F, 2, 1, 3, 0.0F, false));

		bone16_r1 = new ModelRenderer(this);
		bone16_r1.setRotationPoint(1.4559F, 7.2253F, -43.8604F);
		Fixed_stock.addChild(bone16_r1);
		setRotationAngle(bone16_r1, -1.1694F, 0.0F, 0.0F);
		bone16_r1.cubeList.add(new ModelBox(bone16_r1, 115, 13, -4.01F, -37.7173F, 5.8424F, 5, 1, 2, 0.0F, false));

		bone19_r1 = new ModelRenderer(this);
		bone19_r1.setRotationPoint(1.4559F, 34.3785F, 26.9829F);
		Fixed_stock.addChild(bone19_r1);
		setRotationAngle(bone19_r1, 1.0647F, 0.0F, 0.0F);
		bone19_r1.cubeList.add(new ModelBox(bone19_r1, 28, 88, -3.95F, -37.7173F, 18.8424F, 5, 1, 2, 0.0F, false));

		bone20_r1 = new ModelRenderer(this);
		bone20_r1.setRotationPoint(24.444F, 26.1464F, -14.8399F);
		Fixed_stock.addChild(bone20_r1);
		setRotationAngle(bone20_r1, 0.0F, 0.0F, -0.6632F);
		

		bone24_r1 = new ModelRenderer(this);
		bone24_r1.setRotationPoint(-22.1681F, 27.9934F, -14.8399F);
		Fixed_stock.addChild(bone24_r1);
		setRotationAngle(bone24_r1, 0.0F, 0.0F, 0.6632F);
		

		bone2_r2 = new ModelRenderer(this);
		bone2_r2.setRotationPoint(1.4559F, 22.7972F, -40.4149F);
		Fixed_stock.addChild(bone2_r2);
		setRotationAngle(bone2_r2, -0.7505F, 0.0F, 0.0F);
		bone2_r2.cubeList.add(new ModelBox(bone2_r2, 20, 79, -3.51F, -40.0F, 4.7F, 4, 2, 4, 0.0F, false));

		bone29_r1 = new ModelRenderer(this);
		bone29_r1.setRotationPoint(1.4559F, 45.7143F, 13.2579F);
		Fixed_stock.addChild(bone29_r1);
		setRotationAngle(bone29_r1, 0.7854F, 0.0F, 0.0F);
		bone29_r1.cubeList.add(new ModelBox(bone29_r1, 80, 76, -3.5F, -28.9F, 24.65F, 4, 1, 2, -0.01F, false));
		bone29_r1.cubeList.add(new ModelBox(bone29_r1, 67, 100, -3.5F, -33.6376F, 29.3876F, 4, 2, 1, -0.0015F, false));
		bone29_r1.cubeList.add(new ModelBox(bone29_r1, 70, 14, -3.51F, -41.9915F, 20.0337F, 4, 2, 3, 0.0F, false));

		bone28_r1 = new ModelRenderer(this);
		bone28_r1.setRotationPoint(1.4559F, -0.3743F, 41.8997F);
		Fixed_stock.addChild(bone28_r1);
		setRotationAngle(bone28_r1, 2.5656F, 0.0F, 0.0F);
		bone28_r1.cubeList.add(new ModelBox(bone28_r1, 0, 138, -3.49F, -26.9F, 22.65F, 4, 2, 14, 0.0F, false));
		bone28_r1.cubeList.add(new ModelBox(bone28_r1, 61, 87, -3.49F, -28.5339F, 25.166F, 4, 1, 3, 0.0F, false));
		bone28_r1.cubeList.add(new ModelBox(bone28_r1, 20, 75, -3.49F, -28.5339F, 28.166F, 4, 2, 1, 0.0F, false));

		bone22_r1 = new ModelRenderer(this);
		bone22_r1.setRotationPoint(1.4559F, 31.5593F, -20.9237F);
		Fixed_stock.addChild(bone22_r1);
		setRotationAngle(bone22_r1, -0.1745F, 0.0F, 0.0F);
		bone22_r1.cubeList.add(new ModelBox(bone22_r1, 128, 67, -3.49F, -39.3059F, 28.7895F, 4, 6, 1, 0.0F, false));

		bone23_r1 = new ModelRenderer(this);
		bone23_r1.setRotationPoint(1.4559F, 40.7985F, -8.095F);
		Fixed_stock.addChild(bone23_r1);
		setRotationAngle(bone23_r1, 0.1745F, 0.0F, 0.0F);
		bone23_r1.cubeList.add(new ModelBox(bone23_r1, 35, 128, -3.49F, -32.6245F, 27.3422F, 4, 6, 1, 0.0F, false));

		bone7_r2 = new ModelRenderer(this);
		bone7_r2.setRotationPoint(6.0302F, 36.7487F, -11.3162F);
		Fixed_stock.addChild(bone7_r2);
		setRotationAngle(bone7_r2, -3.1416F, -1.4661F, 3.1416F);
		bone7_r2.cubeList.add(new ModelBox(bone7_r2, 129, 119, 0.9F, -37.5F, 3.6F, 4, 1, 1, 0.0F, false));
		bone7_r2.cubeList.add(new ModelBox(bone7_r2, 128, 123, 0.2F, -35.5F, 3.6F, 4, 1, 1, 0.0F, false));

		bone6_r1 = new ModelRenderer(this);
		bone6_r1.setRotationPoint(-6.432F, 36.7487F, -14.2997F);
		Fixed_stock.addChild(bone6_r1);
		setRotationAngle(bone6_r1, -3.1416F, 1.4661F, 3.1416F);
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 128, 74, -7.9F, -37.5F, 3.6F, 4, 1, 1, 0.0F, false));
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 35, 118, -7.9F, -35.5F, 3.6F, 4, 1, 1, 0.0F, false));

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(4.272F, 36.7487F, -13.1724F);
		Fixed_stock.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.0F, -1.1868F, 0.0F);
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 63, 0, 0.5F, -37.5F, 2.7F, 1, 3, 1, 0.0F, false));

		bone4_r1 = new ModelRenderer(this);
		bone4_r1.setRotationPoint(-3.2363F, 36.7487F, -15.9539F);
		Fixed_stock.addChild(bone4_r1);
		setRotationAngle(bone4_r1, 0.0F, 1.1868F, 0.0F);
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 40, 59, -4.5F, -37.5F, 2.7F, 1, 3, 1, 0.0F, false));

		bone8_r2 = new ModelRenderer(this);
		bone8_r2.setRotationPoint(34.3469F, 13.7176F, -14.3973F);
		Fixed_stock.addChild(bone8_r2);
		setRotationAngle(bone8_r2, 0.0F, 0.0F, -1.0472F);
		bone8_r2.cubeList.add(new ModelBox(bone8_r2, 159, 59, -3.5F, -40.0F, 2.7F, 2, 1, 2, 0.0F, false));

		bone9_r2 = new ModelRenderer(this);
		bone9_r2.setRotationPoint(-32.9352F, 16.3156F, -14.3973F);
		Fixed_stock.addChild(bone9_r2);
		setRotationAngle(bone9_r2, 0.0F, 0.0F, 1.0472F);
		bone9_r2.cubeList.add(new ModelBox(bone9_r2, 133, 13, -1.5F, -40.0F, 2.7F, 2, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Fixed_stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}