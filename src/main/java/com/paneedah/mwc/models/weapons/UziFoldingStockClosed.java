package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziFoldingStockClosed extends ModelWithAttachments {
	private final ModelRenderer FoldingStockClosed;
	private final ModelRenderer gun179_r1_r1;
	private final ModelRenderer gun179_r1_r2;
	private final ModelRenderer gun179_r1_r3;
	private final ModelRenderer gun179_r1_r4;
	private final ModelRenderer gun179_r1_r5;
	private final ModelRenderer gun181_r1_r1;
	private final ModelRenderer gun183_r1_r1;
	private final ModelRenderer gun184_r1_r1;
	private final ModelRenderer gun185_r1_r1;
	private final ModelRenderer gun186_r1_r1;
	private final ModelRenderer gun187_r1_r1;
	private final ModelRenderer gun188_r1_r1;
	private final ModelRenderer gun219_r1_r1;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun_r5;
	private final ModelRenderer gun212_r1_r1;
	private final ModelRenderer gun_r6;
	private final ModelRenderer gun220_r1_r1;
	private final ModelRenderer gun_r7;
	private final ModelRenderer gun212_r1_r2;
	private final ModelRenderer gun212_r1_r3;

	public UziFoldingStockClosed() {
		textureWidth = 240;
		textureHeight = 240;

		FoldingStockClosed = new ModelRenderer(this);
		FoldingStockClosed.setRotationPoint(0.0F, -37.5627F, 83.2903F);
		FoldingStockClosed.cubeList.add(new ModelBox(FoldingStockClosed, 137, 81, -3.0F, 24.5627F, -69.7903F, 3, 3, 2, 0.0F, false));

		gun179_r1_r1 = new ModelRenderer(this);
		gun179_r1_r1.setRotationPoint(-1.5F, 29.4188F, -73.1353F);
		FoldingStockClosed.addChild(gun179_r1_r1);
		setRotationAngle(gun179_r1_r1, -3.1164F, 0.0F, 0.0F);
		gun179_r1_r1.cubeList.add(new ModelBox(gun179_r1_r1, 138, 19, -2.0F, -0.3514F, -7.9537F, 1, 2, 3, 0.0F, false));
		gun179_r1_r1.cubeList.add(new ModelBox(gun179_r1_r1, 118, 141, 1.0F, -0.3514F, -7.9537F, 1, 2, 3, 0.0F, false));

		gun179_r1_r2 = new ModelRenderer(this);
		gun179_r1_r2.setRotationPoint(-1.5F, 29.7482F, -79.6991F);
		FoldingStockClosed.addChild(gun179_r1_r2);
		setRotationAngle(gun179_r1_r2, -2.331F, 0.0F, 0.0F);
		gun179_r1_r2.cubeList.add(new ModelBox(gun179_r1_r2, 110, 51, -2.5F, -0.575F, -0.425F, 5, 1, 1, -0.05F, false));

		gun179_r1_r3 = new ModelRenderer(this);
		gun179_r1_r3.setRotationPoint(-1.5F, 29.4188F, -73.1353F);
		FoldingStockClosed.addChild(gun179_r1_r3);
		setRotationAngle(gun179_r1_r3, -2.331F, 0.0F, 0.0F);
		gun179_r1_r3.cubeList.add(new ModelBox(gun179_r1_r3, 50, 104, 1.0F, -4.3646F, -6.7784F, 1, 2, 2, 0.0F, false));
		gun179_r1_r3.cubeList.add(new ModelBox(gun179_r1_r3, 58, 104, -2.0F, -4.4146F, -6.7784F, 1, 2, 2, 0.0F, false));

		gun179_r1_r4 = new ModelRenderer(this);
		gun179_r1_r4.setRotationPoint(-1.5F, 28.1482F, -67.3991F);
		FoldingStockClosed.addChild(gun179_r1_r4);
		setRotationAngle(gun179_r1_r4, 0.5967F, 0.0F, 0.0F);
		gun179_r1_r4.cubeList.add(new ModelBox(gun179_r1_r4, 50, 116, -2.5F, -0.375F, -0.325F, 5, 1, 1, -0.1F, false));

		gun179_r1_r5 = new ModelRenderer(this);
		gun179_r1_r5.setRotationPoint(-1.5F, 29.4188F, -73.1353F);
		FoldingStockClosed.addChild(gun179_r1_r5);
		setRotationAngle(gun179_r1_r5, -1.3013F, 0.0F, 0.0F);
		gun179_r1_r5.cubeList.add(new ModelBox(gun179_r1_r5, 52, 142, -2.0F, -8.1613F, 0.3599F, 1, 2, 3, 0.0F, false));
		gun179_r1_r5.cubeList.add(new ModelBox(gun179_r1_r5, 126, 142, 1.0F, -8.1613F, 0.4599F, 1, 2, 3, 0.0F, false));

		gun181_r1_r1 = new ModelRenderer(this);
		gun181_r1_r1.setRotationPoint(0.0F, 43.9131F, -149.2454F);
		FoldingStockClosed.addChild(gun181_r1_r1);
		setRotationAngle(gun181_r1_r1, -1.4128F, 0.0F, 0.0F);
		gun181_r1_r1.cubeList.add(new ModelBox(gun181_r1_r1, 136, 44, -3.0F, -84.2724F, -6.1354F, 3, 1, 3, 0.0F, false));

		gun183_r1_r1 = new ModelRenderer(this);
		gun183_r1_r1.setRotationPoint(-1.5F, 31.5608F, -73.8534F);
		FoldingStockClosed.addChild(gun183_r1_r1);
		setRotationAngle(gun183_r1_r1, -0.4356F, 0.0F, 0.0F);
		gun183_r1_r1.cubeList.add(new ModelBox(gun183_r1_r1, 136, 49, -1.5F, -7.7058F, 3.9449F, 3, 1, 3, 0.0F, false));

		gun184_r1_r1 = new ModelRenderer(this);
		gun184_r1_r1.setRotationPoint(-1.5F, 31.5608F, -73.8534F);
		FoldingStockClosed.addChild(gun184_r1_r1);
		setRotationAngle(gun184_r1_r1, -1.6315F, 0.0F, 0.0F);
		gun184_r1_r1.cubeList.add(new ModelBox(gun184_r1_r1, 197, 128, -1.5F, -9.3144F, -4.6591F, 3, 2, 14, -0.01F, false));

		gun185_r1_r1 = new ModelRenderer(this);
		gun185_r1_r1.setRotationPoint(-1.5F, 31.5608F, -73.8534F);
		FoldingStockClosed.addChild(gun185_r1_r1);
		setRotationAngle(gun185_r1_r1, -1.5199F, 0.0F, 0.0F);
		gun185_r1_r1.cubeList.add(new ModelBox(gun185_r1_r1, 198, 92, -1.5F, -7.7789F, -3.6877F, 3, 2, 14, 0.0F, false));

		gun186_r1_r1 = new ModelRenderer(this);
		gun186_r1_r1.setRotationPoint(-1.5F, 31.5608F, -73.8534F);
		FoldingStockClosed.addChild(gun186_r1_r1);
		setRotationAngle(gun186_r1_r1, 1.1198F, 0.0F, 0.0F);
		gun186_r1_r1.cubeList.add(new ModelBox(gun186_r1_r1, 144, 123, 0.5F, -3.0561F, 0.7787F, 1, 6, 2, 0.0F, false));
		gun186_r1_r1.cubeList.add(new ModelBox(gun186_r1_r1, 147, 0, -1.5F, -3.0561F, 0.7787F, 1, 6, 2, 0.0F, false));

		gun187_r1_r1 = new ModelRenderer(this);
		gun187_r1_r1.setRotationPoint(-1.5F, 31.5608F, -73.8534F);
		FoldingStockClosed.addChild(gun187_r1_r1);
		setRotationAngle(gun187_r1_r1, 0.4134F, 0.0F, 0.0F);
		gun187_r1_r1.cubeList.add(new ModelBox(gun187_r1_r1, 146, 54, 0.5F, 0.4982F, 2.0158F, 1, 6, 2, 0.0F, false));
		gun187_r1_r1.cubeList.add(new ModelBox(gun187_r1_r1, 78, 147, -1.5F, 0.4982F, 2.0158F, 1, 6, 2, 0.0F, false));

		gun188_r1_r1 = new ModelRenderer(this);
		gun188_r1_r1.setRotationPoint(-1.5F, 31.5608F, -73.8534F);
		FoldingStockClosed.addChild(gun188_r1_r1);
		setRotationAngle(gun188_r1_r1, 1.1941F, 0.0F, 0.0F);
		gun188_r1_r1.cubeList.add(new ModelBox(gun188_r1_r1, 26, 106, -1.5F, 6.0473F, -3.1306F, 1, 2, 2, 0.0F, false));
		gun188_r1_r1.cubeList.add(new ModelBox(gun188_r1_r1, 34, 106, 0.5F, 6.0473F, -3.1306F, 1, 2, 2, 0.0F, false));

		gun219_r1_r1 = new ModelRenderer(this);
		gun219_r1_r1.setRotationPoint(-1.5F, 29.4188F, -73.1353F);
		FoldingStockClosed.addChild(gun219_r1_r1);
		setRotationAngle(gun219_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun219_r1_r1.cubeList.add(new ModelBox(gun219_r1_r1, 159, 101, -1.5689F, -1.5675F, -2.6061F, 1, 1, 8, 0.0F, false));
		gun219_r1_r1.cubeList.add(new ModelBox(gun219_r1_r1, 204, 54, -2.276F, -0.8353F, -2.6061F, 1, 1, 8, 0.0F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(-1.5F, 29.4188F, -73.1353F);
		FoldingStockClosed.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.0F, 0.0F, 0.0F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 204, 168, -2.2F, 0.0187F, -2.6061F, 1, 1, 8, 0.0F, false));
		gun_r1.cubeList.add(new ModelBox(gun_r1, 201, 108, -2.0F, 1.1187F, -6.5061F, 1, 1, 14, 0.0F, false));
		gun_r1.cubeList.add(new ModelBox(gun_r1, 155, 201, -2.0F, -0.8813F, -7.3061F, 1, 2, 15, 0.0F, false));
		gun_r1.cubeList.add(new ModelBox(gun_r1, 204, 39, 1.0F, 1.1187F, -6.5061F, 1, 1, 14, 0.0F, false));
		gun_r1.cubeList.add(new ModelBox(gun_r1, 19, 202, 1.0F, -0.8813F, -7.3061F, 1, 2, 15, 0.0F, false));
		gun_r1.cubeList.add(new ModelBox(gun_r1, 128, 208, 1.2F, 0.0187F, -2.6061F, 1, 1, 8, 0.0F, false));
		gun_r1.cubeList.add(new ModelBox(gun_r1, 107, 12, 1.0F, -0.7858F, -8.2281F, 1, 1, 1, 0.0F, false));
		gun_r1.cubeList.add(new ModelBox(gun_r1, 107, 14, -2.0F, -0.8858F, -8.2281F, 1, 1, 1, 0.0F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-1.5F, 27.8627F, -68.7903F);
		FoldingStockClosed.addChild(gun_r2);
		setRotationAngle(gun_r2, -0.1047F, 0.0F, 0.0F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 54, 119, -1.5F, -0.6F, 1.2F, 3, 1, 1, 0.0F, false));
		gun_r2.cubeList.add(new ModelBox(gun_r2, 57, 59, -1.5F, -0.4F, -1.5F, 3, 2, 3, 0.0F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(-1.5F, 27.8627F, -68.7903F);
		FoldingStockClosed.addChild(gun_r3);
		setRotationAngle(gun_r3, 0.6807F, 0.0F, 0.0F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 120, 79, -1.5F, 1.1F, -0.1F, 3, 1, 1, 0.0F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(-1.5F, 31.5608F, -73.8534F);
		FoldingStockClosed.addChild(gun_r4);
		setRotationAngle(gun_r4, 3.1241F, 0.0F, 0.0F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 198, 150, -1.5F, 2.399F, -7.0809F, 1, 3, 15, 0.0F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 141, 111, -1.5F, 1.799F, 1.0191F, 1, 1, 7, 0.0F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 198, 190, 0.5F, 2.399F, -7.0809F, 1, 3, 15, 0.0F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 203, 84, 0.5F, 1.799F, 1.0191F, 1, 1, 7, 0.0F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(-1.5F, 29.4188F, -73.1353F);
		FoldingStockClosed.addChild(gun_r5);
		setRotationAngle(gun_r5, -2.9278F, 0.0F, 0.0F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 138, 54, -2.0F, -1.1561F, -7.555F, 1, 1, 3, 0.0F, false));

		gun212_r1_r1 = new ModelRenderer(this);
		gun212_r1_r1.setRotationPoint(-1.5F, 29.3188F, -73.0353F);
		FoldingStockClosed.addChild(gun212_r1_r1);
		setRotationAngle(gun212_r1_r1, 2.3562F, 0.0F, 0.0F);
		gun212_r1_r1.cubeList.add(new ModelBox(gun212_r1_r1, 104, 62, 1.0F, -6.111F, 4.9351F, 1, 1, 1, 0.0F, false));
		gun212_r1_r1.cubeList.add(new ModelBox(gun212_r1_r1, 105, 29, 1.0F, -6.111F, 3.1351F, 1, 1, 2, 0.0F, false));

		gun_r6 = new ModelRenderer(this);
		gun_r6.setRotationPoint(-1.5F, 29.8627F, -72.3486F);
		FoldingStockClosed.addChild(gun_r6);
		setRotationAngle(gun_r6, 0.0F, 0.0F, 0.0F);
		gun_r6.cubeList.add(new ModelBox(gun_r6, 105, 65, 1.0F, -0.5F, -7.4417F, 1, 1, 1, 0.0F, false));

		gun220_r1_r1 = new ModelRenderer(this);
		gun220_r1_r1.setRotationPoint(-1.5F, 29.4188F, -73.1353F);
		FoldingStockClosed.addChild(gun220_r1_r1);
		setRotationAngle(gun220_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun220_r1_r1.cubeList.add(new ModelBox(gun220_r1_r1, 188, 204, 1.276F, -0.8353F, -2.6061F, 1, 1, 8, 0.0F, false));
		gun220_r1_r1.cubeList.add(new ModelBox(gun220_r1_r1, 198, 208, 0.5689F, -1.5425F, -2.6061F, 1, 1, 8, 0.0F, false));

		gun_r7 = new ModelRenderer(this);
		gun_r7.setRotationPoint(-1.5F, 29.3188F, -73.0353F);
		FoldingStockClosed.addChild(gun_r7);
		setRotationAngle(gun_r7, -2.9278F, 0.0F, 0.0F);
		gun_r7.cubeList.add(new ModelBox(gun_r7, 108, 140, 1.0F, -1.1561F, -7.555F, 1, 1, 3, 0.0F, false));

		gun212_r1_r2 = new ModelRenderer(this);
		gun212_r1_r2.setRotationPoint(-1.5F, 31.5608F, -73.8534F);
		FoldingStockClosed.addChild(gun212_r1_r2);
		setRotationAngle(gun212_r1_r2, -0.8028F, 0.0F, 0.0F);
		gun212_r1_r2.cubeList.add(new ModelBox(gun212_r1_r2, 44, 119, -2.0F, -0.1639F, -7.3168F, 4, 1, 1, -0.15F, false));

		gun212_r1_r3 = new ModelRenderer(this);
		gun212_r1_r3.setRotationPoint(-1.5F, 29.4188F, -73.1353F);
		FoldingStockClosed.addChild(gun212_r1_r3);
		setRotationAngle(gun212_r1_r3, 2.3562F, 0.0F, 0.0F);
		gun212_r1_r3.cubeList.add(new ModelBox(gun212_r1_r3, 110, 33, -2.0F, -6.111F, 3.1351F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		FoldingStockClosed.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}