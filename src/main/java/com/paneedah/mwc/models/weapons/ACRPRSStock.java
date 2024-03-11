package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ACRPRSStock extends ModelWithAttachments {
	private final ModelRenderer PRSStock;
	private final ModelRenderer bone24_r3;
	private final ModelRenderer bone22_r3;
	private final ModelRenderer bone23_r3;
	private final ModelRenderer bone17_r4;
	private final ModelRenderer bone18_r3;
	private final ModelRenderer bone19_r4;
	private final ModelRenderer bone20_r4;
	private final ModelRenderer bone13_r3;
	private final ModelRenderer bone14_r5;
	private final ModelRenderer bone15_r5;
	private final ModelRenderer bone9_r4;
	private final ModelRenderer bone8_r4;
	private final ModelRenderer bone7_r4;
	private final ModelRenderer bone6_r3;
	private final ModelRenderer bone5_r3;
	private final ModelRenderer bone4_r3;
	private final ModelRenderer bone3_r4;
	private final ModelRenderer bone2_r4;
	private final ModelRenderer ACR175_r1;
	private final ModelRenderer bone10_r4;
	private final ModelRenderer bone11_r4;

	public ACRPRSStock() {
		textureWidth = 380;
		textureHeight = 380;

		PRSStock = new ModelRenderer(this);
		PRSStock.setRotationPoint(-1.4648F, -11.9198F, 13.8114F);
		PRSStock.cubeList.add(new ModelBox(PRSStock, 22, 129, -1.5352F, -3.9502F, -11.1114F, 3, 1, 7, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 115, 31, -2.0352F, -2.0802F, -4.1114F, 4, 2, 2, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 116, 94, -2.0352F, -3.0802F, -11.1114F, 4, 4, 7, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 114, 113, -1.5352F, 0.8698F, -11.1114F, 3, 1, 9, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 23, 23, -1.9352F, 0.9198F, 0.8886F, 1, 5, 10, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 141, 80, -2.6352F, 5.4198F, 1.8886F, 5, 1, 9, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 23, 0, 0.8648F, 0.9198F, 0.8886F, 1, 5, 10, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 92, 140, -1.9352F, -3.0802F, -4.1114F, 1, 4, 15, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 46, 139, 0.8648F, -3.0802F, -4.1114F, 1, 4, 15, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 94, 47, -1.5352F, -3.8302F, -4.1114F, 3, 5, 15, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 32, 199, 1.0648F, -3.4302F, -2.8114F, 1, 1, 13, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 64, 198, -2.1352F, -3.4302F, -2.8114F, 1, 1, 13, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 49, 20, -2.1252F, -2.8302F, 1.6886F, 1, 7, 6, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 57, 20, -2.1402F, -2.8302F, -1.7114F, 1, 2, 4, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 57, 0, 1.0598F, -2.8302F, -1.7114F, 1, 2, 4, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 49, 0, 1.0548F, -2.8302F, 1.6886F, 1, 7, 6, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 160, 211, -1.5352F, -4.2302F, -2.8114F, 3, 1, 13, 0.0F, false));
		PRSStock.cubeList.add(new ModelBox(PRSStock, 0, 92, -2.0352F, -3.9802F, 10.5886F, 4, 12, 2, 0.0F, false));

		bone24_r3 = new ModelRenderer(this);
		bone24_r3.setRotationPoint(-19.5798F, 26.1259F, -13.8114F);
		PRSStock.addChild(bone24_r3);
		setRotationAngle(bone24_r3, 0.0F, 0.0F, 0.7854F);
		bone24_r3.cubeList.add(new ModelBox(bone24_r3, 141, 80, -1.7F, -31.3F, 22.4F, 3, 3, 1, 0.0F, false));
		bone24_r3.cubeList.add(new ModelBox(bone24_r3, 10, 86, -3.7153F, -29.2847F, 22.4F, 3, 3, 1, 0.0F, false));

		bone22_r3 = new ModelRenderer(this);
		bone22_r3.setRotationPoint(1.4648F, 30.7304F, -20.3378F);
		PRSStock.addChild(bone22_r3);
		setRotationAngle(bone22_r3, -0.1745F, 0.0F, 0.0F);
		bone22_r3.cubeList.add(new ModelBox(bone22_r3, 19, 111, -3.49F, -39.9F, 26.4F, 4, 6, 1, 0.0F, false));

		bone23_r3 = new ModelRenderer(this);
		bone23_r3.setRotationPoint(1.4648F, 39.9696F, -7.5091F);
		PRSStock.addChild(bone23_r3);
		setRotationAngle(bone23_r3, 0.1745F, 0.0F, 0.0F);
		bone23_r3.cubeList.add(new ModelBox(bone23_r3, 67, 93, -3.49F, -34.0F, 25.3F, 4, 6, 1, 0.0F, false));

		bone17_r4 = new ModelRenderer(this);
		bone17_r4.setRotationPoint(25.6286F, 27.8344F, -13.8114F);
		PRSStock.addChild(bone17_r4);
		setRotationAngle(bone17_r4, 0.0F, 0.0F, -0.6458F);
		bone17_r4.cubeList.add(new ModelBox(bone17_r4, 95, 185, -1.0F, -40.15F, 11.0F, 1, 1, 13, 0.0F, false));

		bone18_r3 = new ModelRenderer(this);
		bone18_r3.setRotationPoint(-23.3031F, 29.6399F, -13.8114F);
		PRSStock.addChild(bone18_r3);
		setRotationAngle(bone18_r3, 0.0F, 0.0F, 0.6458F);
		bone18_r3.cubeList.add(new ModelBox(bone18_r3, 64, 184, -3.0F, -40.15F, 11.0F, 1, 1, 13, 0.0F, false));

		bone19_r4 = new ModelRenderer(this);
		bone19_r4.setRotationPoint(1.4648F, 9.8949F, -40.7564F);
		PRSStock.addChild(bone19_r4);
		setRotationAngle(bone19_r4, -0.9774F, 0.0F, 0.0F);
		bone19_r4.cubeList.add(new ModelBox(bone19_r4, 58, 87, -0.39F, -39.35F, 11.0F, 1, 1, 2, 0.0F, false));
		bone19_r4.cubeList.add(new ModelBox(bone19_r4, 46, 139, -0.4F, -41.35F, 13.0F, 1, 3, 6, 0.0F, false));
		bone19_r4.cubeList.add(new ModelBox(bone19_r4, 0, 138, -3.6F, -41.35F, 13.0F, 1, 3, 6, 0.0F, false));
		bone19_r4.cubeList.add(new ModelBox(bone19_r4, 81, 14, -3.61F, -39.35F, 11.0F, 1, 1, 2, 0.0F, false));

		bone20_r4 = new ModelRenderer(this);
		bone20_r4.setRotationPoint(1.4648F, -30.8779F, 45.366F);
		PRSStock.addChild(bone20_r4);
		setRotationAngle(bone20_r4, 2.81F, 0.0F, 0.0F);
		bone20_r4.cubeList.add(new ModelBox(bone20_r4, 35, 0, -0.39F, -45.35F, 24.0F, 1, 7, 3, 0.0F, false));
		bone20_r4.cubeList.add(new ModelBox(bone20_r4, 23, 23, -3.61F, -45.35F, 24.0F, 1, 7, 3, 0.0F, false));

		bone13_r3 = new ModelRenderer(this);
		bone13_r3.setRotationPoint(1.4648F, 34.5287F, -16.2621F);
		PRSStock.addChild(bone13_r3);
		setRotationAngle(bone13_r3, -0.0873F, 0.0F, 0.0F);
		bone13_r3.cubeList.add(new ModelBox(bone13_r3, 19, 111, -3.41F, -31.2301F, 14.4945F, 3, 3, 10, 0.0F, false));
		bone13_r3.cubeList.add(new ModelBox(bone13_r3, 71, 20, -0.59F, -31.2301F, 14.4945F, 1, 3, 10, 0.0F, false));

		bone14_r5 = new ModelRenderer(this);
		bone14_r5.setRotationPoint(1.4648F, 39.086F, 4.9007F);
		PRSStock.addChild(bone14_r5);
		setRotationAngle(bone14_r5, 0.576F, 0.0F, 0.0F);
		bone14_r5.cubeList.add(new ModelBox(bone14_r5, 20, 92, -3.41F, -36.0F, 14.7F, 1, 6, 3, 0.0F, false));
		bone14_r5.cubeList.add(new ModelBox(bone14_r5, 83, 20, -0.61F, -36.0F, 14.7F, 1, 6, 3, 0.0F, false));
		bone14_r5.cubeList.add(new ModelBox(bone14_r5, 47, 47, -2.51F, -36.0F, 14.2F, 2, 7, 1, 0.0F, false));

		bone15_r5 = new ModelRenderer(this);
		bone15_r5.setRotationPoint(1.4648F, 22.3354F, 24.9897F);
		PRSStock.addChild(bone15_r5);
		setRotationAngle(bone15_r5, 1.2217F, 0.0F, 0.0F);
		bone15_r5.cubeList.add(new ModelBox(bone15_r5, 81, 47, -3.409F, -36.5F, 9.7F, 3, 5, 2, 0.0F, false));
		bone15_r5.cubeList.add(new ModelBox(bone15_r5, 57, 57, -0.609F, -36.5F, 9.7F, 1, 5, 2, 0.0F, false));
		bone15_r5.cubeList.add(new ModelBox(bone15_r5, 47, 77, -2.509F, -35.329F, 9.2302F, 2, 4, 1, 0.0F, false));

		bone9_r4 = new ModelRenderer(this);
		bone9_r4.setRotationPoint(35.9897F, -22.1473F, -13.8114F);
		PRSStock.addChild(bone9_r4);
		setRotationAngle(bone9_r4, 0.0F, 0.0F, -2.0944F);
		bone9_r4.cubeList.add(new ModelBox(bone9_r4, 0, 111, 0.5F, -40.0F, 2.7F, 1, 1, 7, 0.0F, false));

		bone8_r4 = new ModelRenderer(this);
		bone8_r4.setRotationPoint(-37.5601F, -19.5493F, -13.8114F);
		PRSStock.addChild(bone8_r4);
		setRotationAngle(bone8_r4, 0.0F, 0.0F, 2.0944F);
		bone8_r4.cubeList.add(new ModelBox(bone8_r4, 96, 27, -4.5F, -40.0F, 2.7F, 1, 1, 7, 0.0F, false));

		bone7_r4 = new ModelRenderer(this);
		bone7_r4.setRotationPoint(6.0392F, 35.9198F, -10.7303F);
		PRSStock.addChild(bone7_r4);
		setRotationAngle(bone7_r4, -3.1416F, -1.4661F, 3.1416F);
		bone7_r4.cubeList.add(new ModelBox(bone7_r4, 19, 118, 0.9F, -39.0F, 3.6F, 4, 1, 1, 0.0F, false));
		bone7_r4.cubeList.add(new ModelBox(bone7_r4, 71, 28, 0.9F, -36.0F, 3.6F, 4, 1, 1, 0.0F, false));

		bone6_r3 = new ModelRenderer(this);
		bone6_r3.setRotationPoint(-6.4231F, 35.9198F, -13.7138F);
		PRSStock.addChild(bone6_r3);
		setRotationAngle(bone6_r3, -3.1416F, 1.4661F, 3.1416F);
		bone6_r3.cubeList.add(new ModelBox(bone6_r3, 70, 8, -7.9F, -39.0F, 3.6F, 4, 1, 1, 0.0F, false));
		bone6_r3.cubeList.add(new ModelBox(bone6_r3, 35, 31, -7.9F, -36.0F, 3.6F, 4, 1, 1, 0.0F, false));

		bone5_r3 = new ModelRenderer(this);
		bone5_r3.setRotationPoint(4.2809F, 35.9198F, -12.5865F);
		PRSStock.addChild(bone5_r3);
		setRotationAngle(bone5_r3, 0.0F, -1.1868F, 0.0F);
		bone5_r3.cubeList.add(new ModelBox(bone5_r3, 41, 22, 0.5F, -39.0F, 2.7F, 1, 4, 1, 0.0F, false));

		bone4_r3 = new ModelRenderer(this);
		bone4_r3.setRotationPoint(-3.2274F, 35.9198F, -15.3681F);
		PRSStock.addChild(bone4_r3);
		setRotationAngle(bone4_r3, 0.0F, 1.1868F, 0.0F);
		bone4_r3.cubeList.add(new ModelBox(bone4_r3, 14, 31, -4.5F, -39.0F, 2.7F, 1, 4, 1, 0.0F, false));

		bone3_r4 = new ModelRenderer(this);
		bone3_r4.setRotationPoint(1.4648F, -37.928F, -2.7686F);
		PRSStock.addChild(bone3_r4);
		setRotationAngle(bone3_r4, -2.81F, 0.0F, 0.0F);
		bone3_r4.cubeList.add(new ModelBox(bone3_r4, 47, 87, -3.49F, -36.0F, 11.7F, 4, 1, 3, 0.0F, false));

		bone2_r4 = new ModelRenderer(this);
		bone2_r4.setRotationPoint(1.4648F, -34.2012F, 21.3221F);
		PRSStock.addChild(bone2_r4);
		setRotationAngle(bone2_r4, 2.81F, 0.0F, 0.0F);
		bone2_r4.cubeList.add(new ModelBox(bone2_r4, 23, 38, -3.49F, -39.0F, 11.7F, 4, 1, 3, 0.0F, false));

		ACR175_r1 = new ModelRenderer(this);
		ACR175_r1.setRotationPoint(1.4648F, 32.3846F, -27.818F);
		PRSStock.addChild(ACR175_r1);
		setRotationAngle(ACR175_r1, -0.3498F, 0.0F, 0.0F);
		ACR175_r1.cubeList.add(new ModelBox(ACR175_r1, 111, 36, -2.5F, -41.4F, 3.0F, 2, 2, 5, 0.0F, false));

		bone10_r4 = new ModelRenderer(this);
		bone10_r4.setRotationPoint(10.7763F, -43.8586F, -0.0043F);
		PRSStock.addChild(bone10_r4);
		setRotationAngle(bone10_r4, 0.3302F, -0.1175F, -2.8121F);
		bone10_r4.cubeList.add(new ModelBox(bone10_r4, 82, 0, -3.5F, -43.4F, 3.0F, 1, 2, 5, 0.0F, false));

		bone11_r4 = new ModelRenderer(this);
		bone11_r4.setRotationPoint(-13.6657F, -42.8946F, -0.356F);
		PRSStock.addChild(bone11_r4);
		setRotationAngle(bone11_r4, 0.3302F, 0.1175F, 2.8121F);
		bone11_r4.cubeList.add(new ModelBox(bone11_r4, 33, 81, -0.5F, -43.4F, 3.0F, 1, 2, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		PRSStock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}