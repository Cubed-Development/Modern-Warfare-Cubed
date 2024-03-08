package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMStock extends ModelWithAttachments {
	private final ModelRenderer Stock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;

	public PKMStock() {
		textureWidth = 400;
		textureHeight = 400;

		Stock = new ModelRenderer(this);
		Stock.setRotationPoint(-1.3821F, -8.3977F, 26.087F);
		Stock.cubeList.add(new ModelBox(Stock, 144, 38, -2.5679F, -5.9023F, -22.087F, 5, 7, 6, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 70, 142, -1.5679F, -5.9023F, -16.087F, 3, 7, 8, -0.002F, false));
		Stock.cubeList.add(new ModelBox(Stock, 0, 99, -0.5679F, -7.4773F, -11.237F, 1, 1, 28, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 144, 9, -0.5679F, -7.4773F, -11.737F, 1, 1, 1, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 168, 142, -0.5679F, -5.1773F, -7.737F, 1, 1, 19, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 34, 189, -0.5679F, 1.8227F, -4.737F, 1, 1, 16, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 87, 114, -1.5679F, 4.7977F, -6.987F, 3, 2, 3, -0.001F, false));
		Stock.cubeList.add(new ModelBox(Stock, 130, 142, -0.5679F, 6.7477F, -6.887F, 1, 2, 3, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 34, 179, -1.5679F, 4.7977F, -4.687F, 3, 2, 1, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 130, 120, -1.5679F, -5.9023F, -8.387F, 3, 7, 1, -0.002F, false));
		Stock.cubeList.add(new ModelBox(Stock, 72, 78, -0.5679F, -3.9023F, -7.987F, 1, 3, 1, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 0, 0, -1.5679F, -6.6023F, -11.187F, 3, 2, 28, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 26, 168, -1.5679F, 2.1977F, -6.187F, 3, 3, 18, 0.001F, false));
		Stock.cubeList.add(new ModelBox(Stock, 144, 97, -0.5679F, 5.1977F, -1.187F, 1, 1, 10, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 30, 99, -1.5679F, -4.8023F, 11.813F, 3, 13, 5, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 88, 13, -0.5679F, 7.8977F, 11.113F, 1, 1, 5, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 144, 14, -0.5679F, 7.8977F, 15.813F, 1, 1, 1, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 94, 43, -0.5679F, -3.2023F, 11.413F, 1, 5, 1, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 179, 55, -1.5679F, 6.1977F, 15.813F, 3, 2, 1, -0.002F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.3679F, -6.599F, -4.9793F);
		Stock.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7418F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 114, 143, 1.65F, 1.2467F, -6.7577F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 70, 1.65F, 1.2467F, -6.2577F, 1, 1, 28, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 72, 0, 1.35F, 1.2467F, -6.2577F, 1, 1, 28, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 144, 2, 1.35F, 1.2467F, -6.7577F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.0679F, 8.3977F, 14.963F);
		Stock.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.6283F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 170, 97, 0.125F, -0.275F, -2.85F, 1, 1, 4, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 165, 169, 0.325F, -0.275F, -2.85F, 1, 1, 4, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 111, 142, 0.125F, -0.275F, 0.85F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 101, 142, 0.325F, -0.275F, 0.85F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.0679F, 5.7484F, 10.0254F);
		Stock.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.5942F, 0.5484F, 0.6572F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 72, 85, 0.4F, -0.375F, -2.0F, 1, 1, 5, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 84, 0.4F, -0.775F, -2.0F, 1, 1, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.0679F, 7.7477F, -5.387F);
		Stock.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7418F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 72, 72, -1.625F, -2.9F, 4.1F, 1, 1, 12, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 72, 43, -1.625F, -2.5F, 4.1F, 1, 1, 12, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.0679F, 6.5663F, -2.3421F);
		Stock.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3503F, 0.4557F, -0.8779F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 72, 78, -0.6F, -0.1F, -2.5F, 1, 1, 5, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 150, 169, 0.325F, -0.1F, -1.5F, 1, 1, 4, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.0679F, 7.7477F, -5.387F);
		Stock.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.4363F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 132, 99, -0.1F, -1.5F, -1.5F, 1, 2, 3, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 178, 35, -0.1F, -0.3F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.0679F, -2.4023F, -12.087F);
		Stock.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.7126F, -0.6062F, -0.4575F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 90, 142, -0.2F, 9.5F, -1.4F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 84, 142, -0.8F, 9.5F, -1.4F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 123, 171, -0.8F, 1.2F, -1.4F, 1, 9, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 119, 171, -0.2F, 1.2F, -1.4F, 1, 9, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.0679F, 8.3977F, 14.963F);
		Stock.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.6283F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 170, 102, -1.125F, -0.275F, -2.85F, 1, 1, 4, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 120, 142, -1.125F, -0.275F, 0.85F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 103, 170, -1.325F, -0.275F, -2.85F, 1, 1, 4, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 140, 142, -1.325F, -0.275F, 0.85F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.0679F, 5.7484F, 10.0254F);
		Stock.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.5942F, -0.5484F, -0.6572F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 87, 29, -1.4F, -0.375F, -2.0F, 1, 1, 5, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 88, 0, -1.4F, -0.775F, -2.0F, 1, 1, 5, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.0679F, 5.7484F, 10.0254F);
		Stock.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.7854F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 112, -0.5F, -1.5F, -3.0F, 1, 3, 6, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.0679F, 3.6977F, 2.813F);
		Stock.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 51, 166, -1.5F, -6.15F, 4.55F, 3, 3, 5, -0.002F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.0679F, -2.4023F, -7.887F);
		Stock.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.7854F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 152, 94, -1.5F, -14.9F, 13.2F, 3, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 80, 19, -0.5F, -11.7F, 15.8F, 1, 2, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 179, 52, -1.5F, -11.7F, 16.2F, 3, 2, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 117, 48, -1.5F, -15.9F, 10.6F, 3, 2, 3, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 179, -1.5F, -2.9F, -1.4F, 3, 2, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 84, -0.5F, -2.6F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.0679F, 7.7477F, -5.387F);
		Stock.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.4363F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 70, 142, -0.9F, -1.5F, -1.5F, 1, 2, 3, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 178, 39, -0.9F, -0.3F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.0679F, -2.4023F, -12.087F);
		Stock.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.7126F, 0.6062F, 0.4575F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 131, 171, -0.8F, 1.2F, -1.4F, 1, 9, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 127, 171, -0.2F, 1.2F, -1.4F, 1, 9, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 43, 143, -0.2F, 9.5F, -1.4F, 1, 1, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 64, 143, -0.8F, 9.5F, -1.4F, 1, 1, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.0679F, 6.5663F, -2.3421F);
		Stock.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.3503F, -0.4557F, 0.8779F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 170, 116, -1.325F, -0.1F, -1.5F, 1, 1, 4, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 88, 6, -0.4F, -0.1F, -2.5F, 1, 1, 5, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-0.0679F, 6.5663F, -2.3421F);
		Stock.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.5672F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 70, -0.5F, -1.0F, -2.5F, 1, 2, 5, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.0679F, -2.4023F, -12.087F);
		Stock.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.5672F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 87, 119, -1.5F, 10.2F, 2.1F, 3, 2, 3, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 94, 72, -0.5F, 3.2F, 3.0F, 1, 5, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 70, -0.5F, 1.2F, -1.6F, 1, 11, 2, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 102, 72, -1.5F, 1.2F, -0.4F, 3, 9, 4, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.0679F, 7.7477F, -5.387F);
		Stock.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7418F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 84, 0.625F, -2.5F, 4.1F, 1, 1, 12, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 72, 85, 0.625F, -2.9F, 4.1F, 1, 1, 12, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(3.2321F, -6.599F, -4.9793F);
		Stock.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.7418F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 72, 72, -2.65F, 1.2467F, -6.2577F, 1, 1, 28, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 144, 4, -2.35F, 1.2467F, -6.7577F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 72, 29, -2.35F, 1.2467F, -6.2577F, 1, 1, 28, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 144, 7, -2.65F, 1.2467F, -6.7577F, 1, 1, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.3821F, -1.6023F, -19.087F);
		Stock.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.5672F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 178, 45, -1.95F, -0.975F, 6.35F, 1, 1, 3, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 172, 72, -2.95F, 0.025F, 7.35F, 3, 1, 2, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(1.3821F, -1.6023F, -19.087F);
		Stock.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, -0.4363F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 16, 1.25F, -4.3F, 2.3F, 1, 7, 3, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(1.3821F, -1.6023F, -19.087F);
		Stock.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.4363F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 30, -4.85F, -4.3F, 0.9F, 1, 7, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}