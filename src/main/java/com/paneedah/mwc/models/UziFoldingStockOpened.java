package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziFoldingStockOpened extends ModelWithAttachments {
	private final ModelRenderer FoldingStockOpened;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun179_r1_r1;
	private final ModelRenderer gun179_r1_r2;
	private final ModelRenderer gun179_r1_r3;
	private final ModelRenderer gun181_r1_r1;
	private final ModelRenderer gun183_r1_r1;
	private final ModelRenderer gun184_r1_r1;
	private final ModelRenderer gun185_r1_r1;
	private final ModelRenderer gun186_r1_r1;
	private final ModelRenderer gun187_r1_r1;
	private final ModelRenderer gun188_r1_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun212_r1_r1;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun220_r1_r1;
	private final ModelRenderer gun220_r1_r2;
	private final ModelRenderer gun220_r1_r3;
	private final ModelRenderer gun220_r1_r4;

	public UziFoldingStockOpened() {
		textureWidth = 240;
		textureHeight = 240;

		FoldingStockOpened = new ModelRenderer(this);
		FoldingStockOpened.setRotationPoint(0.2F, -37.5627F, 83.2903F);
		FoldingStockOpened.cubeList.add(new ModelBox(FoldingStockOpened, 47, 98, -0.5F, 26.5627F, -68.2903F, 1, 1, 3, 0.0F, false));
		FoldingStockOpened.cubeList.add(new ModelBox(FoldingStockOpened, 53, 59, -4.0F, 26.5627F, -68.2903F, 1, 1, 2, 0.0F, false));
		FoldingStockOpened.cubeList.add(new ModelBox(FoldingStockOpened, 54, 9, -3.25F, 24.5627F, -69.9903F, 3, 3, 3, 0.0F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(-1.7F, 27.8627F, -68.7903F);
		FoldingStockOpened.addChild(gun_r1);
		setRotationAngle(gun_r1, -0.1047F, 0.0F, 0.0F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 51, 33, -1.5F, -0.6F, 1.2F, 3, 1, 1, 0.0F, false));
		gun_r1.cubeList.add(new ModelBox(gun_r1, 72, 88, -1.55F, -0.4F, -1.5F, 3, 2, 3, 0.0F, false));

		gun179_r1_r1 = new ModelRenderer(this);
		gun179_r1_r1.setRotationPoint(-1.5F, 28.0627F, -60.9486F);
		FoldingStockOpened.addChild(gun179_r1_r1);
		setRotationAngle(gun179_r1_r1, -0.1887F, 0.0F, 0.0F);
		gun179_r1_r1.cubeList.add(new ModelBox(gun179_r1_r1, 56, 44, -2.5F, -0.5792F, -7.8087F, 1, 1, 2, 0.0F, false));
		gun179_r1_r1.cubeList.add(new ModelBox(gun179_r1_r1, 89, 33, 1.0F, -0.5792F, -7.8087F, 1, 1, 3, 0.0F, false));

		gun179_r1_r2 = new ModelRenderer(this);
		gun179_r1_r2.setRotationPoint(-1.5F, 28.0627F, -60.9486F);
		FoldingStockOpened.addChild(gun179_r1_r2);
		setRotationAngle(gun179_r1_r2, 0.5967F, 0.0F, 0.0F);
		gun179_r1_r2.cubeList.add(new ModelBox(gun179_r1_r2, 29, 29, 1.0F, -4.7292F, -6.4087F, 1, 2, 2, 0.0F, false));
		gun179_r1_r2.cubeList.add(new ModelBox(gun179_r1_r2, 37, 33, -3.3F, -3.9292F, -5.8087F, 6, 1, 1, -0.07F, false));
		gun179_r1_r2.cubeList.add(new ModelBox(gun179_r1_r2, 45, 0, -2.5F, -4.7292F, -6.4087F, 1, 2, 2, 0.0F, false));

		gun179_r1_r3 = new ModelRenderer(this);
		gun179_r1_r3.setRotationPoint(-1.75F, 25.6337F, -68.4246F);
		FoldingStockOpened.addChild(gun179_r1_r3);
		setRotationAngle(gun179_r1_r3, 1.6701F, 0.0F, 0.0F);
		gun179_r1_r3.cubeList.add(new ModelBox(gun179_r1_r3, 19, 29, -2.25F, -1.0F, -2.0F, 1, 2, 1, 0.0F, false));
		gun179_r1_r3.cubeList.add(new ModelBox(gun179_r1_r3, 30, 19, 1.25F, -1.0F, -2.0F, 1, 2, 1, 0.0F, false));
		gun179_r1_r3.cubeList.add(new ModelBox(gun179_r1_r3, 42, 72, -2.25F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		gun179_r1_r3.cubeList.add(new ModelBox(gun179_r1_r3, 23, 80, 1.25F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));

		gun181_r1_r1 = new ModelRenderer(this);
		gun181_r1_r1.setRotationPoint(0.0F, 43.9131F, -149.2454F);
		FoldingStockOpened.addChild(gun181_r1_r1);
		setRotationAngle(gun181_r1_r1, -1.4128F, 0.0F, 0.0F);
		gun181_r1_r1.cubeList.add(new ModelBox(gun181_r1_r1, 16, 66, -3.0F, -84.2724F, -6.1354F, 3, 1, 3, 0.0F, false));

		gun183_r1_r1 = new ModelRenderer(this);
		gun183_r1_r1.setRotationPoint(-1.8F, 31.1505F, -41.5939F);
		FoldingStockOpened.addChild(gun183_r1_r1);
		setRotationAngle(gun183_r1_r1, -0.5796F, 0.0F, 0.0F);
		gun183_r1_r1.cubeList.add(new ModelBox(gun183_r1_r1, 15, 49, -2.0F, -0.5F, -1.5F, 4, 1, 3, 0.0F, false));

		gun184_r1_r1 = new ModelRenderer(this);
		gun184_r1_r1.setRotationPoint(-1.3F, 34.6286F, -45.9008F);
		FoldingStockOpened.addChild(gun184_r1_r1);
		setRotationAngle(gun184_r1_r1, -1.8279F, 0.0F, 0.0F);
		gun184_r1_r1.cubeList.add(new ModelBox(gun184_r1_r1, 78, 148, -2.5F, -4.8842F, -4.3916F, 4, 2, 14, 0.0F, false));

		gun185_r1_r1 = new ModelRenderer(this);
		gun185_r1_r1.setRotationPoint(-1.3F, 34.6286F, -45.9008F);
		FoldingStockOpened.addChild(gun185_r1_r1);
		setRotationAngle(gun185_r1_r1, -1.7163F, 0.0F, 0.0F);
		gun185_r1_r1.cubeList.add(new ModelBox(gun185_r1_r1, 118, 149, -2.5F, -3.3465F, -3.9153F, 4, 2, 14, 0.0F, false));

		gun186_r1_r1 = new ModelRenderer(this);
		gun186_r1_r1.setRotationPoint(-0.5F, 34.6286F, -45.9008F);
		FoldingStockOpened.addChild(gun186_r1_r1);
		setRotationAngle(gun186_r1_r1, 0.9234F, 0.0F, 0.0F);
		gun186_r1_r1.cubeList.add(new ModelBox(gun186_r1_r1, 105, 87, -0.5F, -7.0514F, -1.1541F, 1, 6, 2, 0.0F, false));
		gun186_r1_r1.cubeList.add(new ModelBox(gun186_r1_r1, 71, 123, -3.0F, -7.0514F, -1.1541F, 1, 6, 2, 0.0F, false));

		gun187_r1_r1 = new ModelRenderer(this);
		gun187_r1_r1.setRotationPoint(-0.5F, 34.6286F, -45.9008F);
		FoldingStockOpened.addChild(gun187_r1_r1);
		setRotationAngle(gun187_r1_r1, 0.217F, 0.0F, 0.0F);
		gun187_r1_r1.cubeList.add(new ModelBox(gun187_r1_r1, 26, 119, -0.5F, -1.2864F, -2.0479F, 1, 6, 2, 0.0F, false));
		gun187_r1_r1.cubeList.add(new ModelBox(gun187_r1_r1, 81, 123, -3.0F, -1.2864F, -2.0479F, 1, 6, 2, 0.0F, false));

		gun188_r1_r1 = new ModelRenderer(this);
		gun188_r1_r1.setRotationPoint(-0.5F, 34.6286F, -45.9008F);
		FoldingStockOpened.addChild(gun188_r1_r1);
		setRotationAngle(gun188_r1_r1, 0.9977F, 0.0F, 0.0F);
		gun188_r1_r1.cubeList.add(new ModelBox(gun188_r1_r1, 47, 40, -3.0F, 1.9196F, -4.7615F, 1, 2, 2, 0.0F, false));
		gun188_r1_r1.cubeList.add(new ModelBox(gun188_r1_r1, 54, 0, -0.5F, 1.9196F, -4.7615F, 1, 2, 2, 0.0F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-2.8F, 27.8627F, -68.7903F);
		FoldingStockOpened.addChild(gun_r2);
		setRotationAngle(gun_r2, 0.6807F, 0.0F, 0.0F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 59, 33, -0.65F, 1.1F, -0.1F, 3, 1, 1, 0.0F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(-1.5F, 28.0627F, -60.9486F);
		FoldingStockOpened.addChild(gun_r3);
		setRotationAngle(gun_r3, 2.9278F, 0.0F, 0.0F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 0, 72, -2.5F, 1.5F, -6.6417F, 1, 1, 14, 0.0F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 162, 101, -2.0F, -0.5F, -18.3417F, 1, 1, 15, 0.0F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 34, 164, 0.5F, -0.5F, -18.3417F, 1, 1, 15, 0.0F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 157, 155, -2.0F, 0.1F, -18.3417F, 1, 2, 15, 0.0F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 138, 149, -2.0F, -1.6F, -10.3417F, 1, 1, 16, 0.0F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 17, 158, 0.5F, 0.1F, -18.3417F, 1, 2, 15, 0.0F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 66, 98, 0.5F, -1.6F, -10.3417F, 1, 1, 17, 0.0F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 158, 79, -2.5F, -0.5F, -7.4417F, 1, 2, 15, 0.0F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 72, 65, 1.0F, 1.5F, -6.6417F, 1, 1, 14, 0.0F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 159, 0, 1.0F, -0.5F, -7.4417F, 1, 2, 15, 0.0F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 98, 136, -2.7F, 0.4F, -2.7417F, 1, 1, 8, 0.0F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 144, 123, 1.2F, 0.4F, -2.7417F, 1, 1, 8, 0.0F, false));

		gun212_r1_r1 = new ModelRenderer(this);
		gun212_r1_r1.setRotationPoint(-1.5F, 28.2627F, -60.0486F);
		FoldingStockOpened.addChild(gun212_r1_r1);
		setRotationAngle(gun212_r1_r1, -0.9992F, 0.0F, 0.0F);
		gun212_r1_r1.cubeList.add(new ModelBox(gun212_r1_r1, 10, 0, 1.0F, -5.8277F, 3.7063F, 1, 1, 1, 0.0F, false));
		gun212_r1_r1.cubeList.add(new ModelBox(gun212_r1_r1, 63, 9, 1.0F, -5.8277F, 2.3063F, 1, 1, 2, 0.0F, false));
		gun212_r1_r1.cubeList.add(new ModelBox(gun212_r1_r1, 0, 50, -2.75F, -5.4277F, 2.6063F, 5, 1, 1, -0.13F, false));
		gun212_r1_r1.cubeList.add(new ModelBox(gun212_r1_r1, 10, 19, -2.5F, -5.8277F, 3.7063F, 1, 1, 1, 0.0F, false));
		gun212_r1_r1.cubeList.add(new ModelBox(gun212_r1_r1, 65, 44, -2.5F, -5.8277F, 2.3063F, 1, 1, 2, 0.0F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(-1.5F, 28.2627F, -60.0486F);
		FoldingStockOpened.addChild(gun_r4);
		setRotationAngle(gun_r4, 2.9278F, 0.0F, 0.0F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 11, 13, 1.0F, -0.2F, -7.4417F, 1, 1, 1, 0.0F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 30, 22, -2.5F, -0.2F, -7.4417F, 1, 1, 1, 0.0F, false));

		gun220_r1_r1 = new ModelRenderer(this);
		gun220_r1_r1.setRotationPoint(-5.6143F, 28.5006F, -62.3314F);
		FoldingStockOpened.addChild(gun220_r1_r1);
		setRotationAngle(gun220_r1_r1, -0.1555F, -0.1536F, -0.7734F);
		gun220_r1_r1.cubeList.add(new ModelBox(gun220_r1_r1, 71, 123, 1.8F, 0.2F, -4.0F, 1, 1, 8, 0.0F, false));

		gun220_r1_r2 = new ModelRenderer(this);
		gun220_r1_r2.setRotationPoint(-3.4929F, 26.4276F, -61.8813F);
		FoldingStockOpened.addChild(gun220_r1_r2);
		setRotationAngle(gun220_r1_r2, 2.9893F, 0.1506F, 0.7739F);
		gun220_r1_r2.cubeList.add(new ModelBox(gun220_r1_r2, 124, 133, -0.5F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));

		gun220_r1_r3 = new ModelRenderer(this);
		gun220_r1_r3.setRotationPoint(2.1143F, 28.5006F, -62.3314F);
		FoldingStockOpened.addChild(gun220_r1_r3);
		setRotationAngle(gun220_r1_r3, -0.1555F, 0.1536F, 0.7734F);
		gun220_r1_r3.cubeList.add(new ModelBox(gun220_r1_r3, 6, 139, -2.8F, 0.2F, -4.0F, 1, 1, 8, 0.0F, false));

		gun220_r1_r4 = new ModelRenderer(this);
		gun220_r1_r4.setRotationPoint(-0.0071F, 26.4276F, -61.8813F);
		FoldingStockOpened.addChild(gun220_r1_r4);
		setRotationAngle(gun220_r1_r4, 2.9893F, -0.1506F, -0.7739F);
		gun220_r1_r4.cubeList.add(new ModelBox(gun220_r1_r4, 139, 10, -0.5F, -0.5F, -4.0F, 1, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		FoldingStockOpened.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
