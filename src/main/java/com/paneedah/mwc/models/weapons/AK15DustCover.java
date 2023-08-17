package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK15DustCover extends ModelBase {
	private final ModelRenderer DustCover19;
	private final ModelRenderer DustCover17;
	private final ModelRenderer DustCover18;
	private final ModelRenderer DustCover37;
	private final ModelRenderer DustCover38;
	private final ModelRenderer DustCover20;
	private final ModelRenderer DustCover13;
	private final ModelRenderer DustCover11;
	private final ModelRenderer DustCover12;
	private final ModelRenderer DustCover36;
	private final ModelRenderer DustCover21;
	private final ModelRenderer DustCover14;
	private final ModelRenderer DustCover15;
	private final ModelRenderer DustCover47;
	private final ModelRenderer DustCover16;
	private final ModelRenderer DustCover22_r1;
	private final ModelRenderer DustCover20_r1;
	private final ModelRenderer DustCover1;
	private final ModelRenderer DustCover2;
	private final ModelRenderer DustCover4;
	private final ModelRenderer DustCover3;
	private final ModelRenderer DustCover22;
	private final ModelRenderer DustCover35;
	private final ModelRenderer DustCover5;
	private final ModelRenderer DustCover44;
	private final ModelRenderer DustCover10;
	private final ModelRenderer DustCover9;
	private final ModelRenderer DustCover8;
	private final ModelRenderer DustCover42;
	private final ModelRenderer DustCover41;
	private final ModelRenderer DustCover43;
	private final ModelRenderer DustCover39;
	private final ModelRenderer DustCover40;

	public AK15DustCover() {
		textureWidth = 128;
		textureHeight = 128;

		DustCover19 = new ModelRenderer(this);
		DustCover19.setRotationPoint(-0.2F, -12.0F, -24.5F);
		DustCover19.cubeList.add(new ModelBox(DustCover19, 72, 36, 0.0F, 0.0F, 0.0F, 1, 1, 26, 0.0F, false));

		DustCover17 = new ModelRenderer(this);
		DustCover17.setRotationPoint(-3.8F, -12.0F, -9.5F);
		DustCover17.cubeList.add(new ModelBox(DustCover17, 0, 35, -0.001F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover18 = new ModelRenderer(this);
		DustCover18.setRotationPoint(-3.8F, -12.0F, 2.5F);
		DustCover18.cubeList.add(new ModelBox(DustCover18, 16, 7, -0.1F, 0.099F, 0.001F, 4, 1, 1, 0.0F, false));
		DustCover18.cubeList.add(new ModelBox(DustCover18, 7, 0, 3.7F, 0.098F, 0.002F, 1, 1, 1, 0.0F, false));

		DustCover37 = new ModelRenderer(this);
		DustCover37.setRotationPoint(-0.2F, -13.0F, -33.5F);
		DustCover37.cubeList.add(new ModelBox(DustCover37, 0, 48, 0.001F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover38 = new ModelRenderer(this);
		DustCover38.setRotationPoint(-0.2F, -13.5F, -33.5F);
		DustCover38.cubeList.add(new ModelBox(DustCover38, 38, 21, 0.002F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover20 = new ModelRenderer(this);
		DustCover20.setRotationPoint(-0.3F, -13.5F, -25.0F);
		DustCover20.cubeList.add(new ModelBox(DustCover20, 0, 70, 0.001F, 0.0F, 0.0F, 1, 2, 27, 0.0F, false));

		DustCover13 = new ModelRenderer(this);
		DustCover13.setRotationPoint(-3.8F, -11.0F, -9.5F);
		setRotationAngle(DustCover13, 2.1935F, 0.0F, 0.0F);
		DustCover13.cubeList.add(new ModelBox(DustCover13, 6, 22, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		DustCover11 = new ModelRenderer(this);
		DustCover11.setRotationPoint(-3.8F, -13.5F, -19.1F);
		DustCover11.cubeList.add(new ModelBox(DustCover11, 14, 35, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover12 = new ModelRenderer(this);
		DustCover12.setRotationPoint(-3.8F, -13.5F, -10.1F);
		setRotationAngle(DustCover12, -0.8923F, 0.0F, 0.0F);
		DustCover12.cubeList.add(new ModelBox(DustCover12, 0, 8, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		DustCover36 = new ModelRenderer(this);
		DustCover36.setRotationPoint(-0.2F, -13.5F, -24.5F);
		setRotationAngle(DustCover36, -1.1525F, 0.0F, 0.0F);
		DustCover36.cubeList.add(new ModelBox(DustCover36, 6, 19, -0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		DustCover21 = new ModelRenderer(this);
		DustCover21.setRotationPoint(-0.2F, -13.2F, -22.5F);
		DustCover21.cubeList.add(new ModelBox(DustCover21, 29, 71, 0.0F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

		DustCover14 = new ModelRenderer(this);
		DustCover14.setRotationPoint(-3.7F, -13.5F, -10.1F);
		DustCover14.cubeList.add(new ModelBox(DustCover14, 0, 13, -0.001F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover15 = new ModelRenderer(this);
		DustCover15.setRotationPoint(-3.7F, -12.5F, -9.1F);
		DustCover15.cubeList.add(new ModelBox(DustCover15, 36, 36, -0.001F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		DustCover47 = new ModelRenderer(this);
		DustCover47.setRotationPoint(-3.7F, -12.5F, -9.5F);
		DustCover47.cubeList.add(new ModelBox(DustCover47, 7, 2, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		DustCover16 = new ModelRenderer(this);
		DustCover16.setRotationPoint(-3.8F, -13.2F, -8.1F);
		DustCover16.cubeList.add(new ModelBox(DustCover16, 38, 0, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));
		DustCover16.cubeList.add(new ModelBox(DustCover16, 0, 21, 2.699F, 1.3F, 9.45F, 2, 1, 2, 0.0F, false));
		DustCover16.cubeList.add(new ModelBox(DustCover16, 14, 17, -0.101F, 1.3F, 9.45F, 2, 1, 2, 0.0F, false));
		DustCover16.cubeList.add(new ModelBox(DustCover16, 6, 13, 2.7F, -0.301F, 9.45F, 2, 2, 1, 0.0F, false));
		DustCover16.cubeList.add(new ModelBox(DustCover16, 6, 6, -0.1F, -0.301F, 9.45F, 2, 2, 1, 0.0F, false));

		DustCover22_r1 = new ModelRenderer(this);
		DustCover22_r1.setRotationPoint(3.3F, -0.3F, 10.45F);
		DustCover16.addChild(DustCover22_r1);
		setRotationAngle(DustCover22_r1, -0.9425F, 0.0F, 0.0F);
		DustCover22_r1.cubeList.add(new ModelBox(DustCover22_r1, 0, 6, -1.5F, 0.0F, -2.2F, 1, 1, 1, 0.0F, false));
		DustCover22_r1.cubeList.add(new ModelBox(DustCover22_r1, 16, 9, -2.0F, -0.002F, -1.6F, 2, 1, 2, 0.0F, false));
		DustCover22_r1.cubeList.add(new ModelBox(DustCover22_r1, 16, 4, -3.399F, -0.001F, 0.0F, 3, 1, 2, 0.0F, false));
		DustCover22_r1.cubeList.add(new ModelBox(DustCover22_r1, 0, 18, -0.599F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		DustCover20_r1 = new ModelRenderer(this);
		DustCover20_r1.setRotationPoint(0.6F, 0.5F, 10.25F);
		DustCover16.addChild(DustCover20_r1);
		setRotationAngle(DustCover20_r1, -0.384F, 0.0F, 0.0F);
		DustCover20_r1.cubeList.add(new ModelBox(DustCover20_r1, 0, 0, -0.9F, -0.001F, 0.0F, 1, 1, 1, -0.1F, false));
		DustCover20_r1.cubeList.add(new ModelBox(DustCover20_r1, 0, 2, 3.3F, -0.001F, 0.0F, 1, 1, 1, -0.1F, false));

		DustCover1 = new ModelRenderer(this);
		DustCover1.setRotationPoint(-2.0F, -15.8F, -33.5F);
		DustCover1.cubeList.add(new ModelBox(DustCover1, 38, 1, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));

		DustCover2 = new ModelRenderer(this);
		DustCover2.setRotationPoint(-1.0F, -15.8F, -33.5F);
		setRotationAngle(DustCover2, 0.0F, 0.0F, 0.5949F);
		DustCover2.cubeList.add(new ModelBox(DustCover2, 36, 36, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));

		DustCover4 = new ModelRenderer(this);
		DustCover4.setRotationPoint(-2.0F, -15.8F, -33.5F);
		setRotationAngle(DustCover4, 0.0F, 0.0F, 0.9295F);
		DustCover4.cubeList.add(new ModelBox(DustCover4, 0, 35, 0.0F, 0.0F, 0.0F, 1, 1, 34, 0.0F, false));

		DustCover3 = new ModelRenderer(this);
		DustCover3.setRotationPoint(-0.17F, -15.25F, -33.5F);
		setRotationAngle(DustCover3, 0.0F, 0.0F, 1.4871F);
		DustCover3.cubeList.add(new ModelBox(DustCover3, 0, 0, 0.0F, 0.0F, -0.001F, 2, 1, 34, 0.0F, false));

		DustCover22 = new ModelRenderer(this);
		DustCover22.setRotationPoint(0.7F, -13.5F, -25.0F);
		setRotationAngle(DustCover22, 0.0F, 0.0F, 2.3051F);
		DustCover22.cubeList.add(new ModelBox(DustCover22, 56, 71, 0.0F, 0.0F, 0.0F, 1, 2, 26, 0.0F, false));

		DustCover35 = new ModelRenderer(this);
		DustCover35.setRotationPoint(0.8F, -13.5F, -33.5F);
		setRotationAngle(DustCover35, 0.0F, 0.0F, 2.3051F);
		DustCover35.cubeList.add(new ModelBox(DustCover35, 14, 13, 0.0F, 0.0F, 0.0F, 1, 2, 9, 0.0F, false));

		DustCover5 = new ModelRenderer(this);
		DustCover5.setRotationPoint(-2.8F, -15.2F, -21.5F);
		setRotationAngle(DustCover5, 0.0F, 0.0F, 0.1115F);
		DustCover5.cubeList.add(new ModelBox(DustCover5, 74, 0, 0.0F, 0.0F, -0.001F, 1, 2, 22, 0.0F, false));

		DustCover44 = new ModelRenderer(this);
		DustCover44.setRotationPoint(-3.7F, -13.5F, -11.0F);
		setRotationAngle(DustCover44, 0.0F, 0.0F, -0.7436F);
		DustCover44.cubeList.add(new ModelBox(DustCover44, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 12, 0.0F, false));

		DustCover10 = new ModelRenderer(this);
		DustCover10.setRotationPoint(-3.8F, -13.5F, -19.1F);
		setRotationAngle(DustCover10, 0.0F, 0.0F, -0.7436F);
		DustCover10.cubeList.add(new ModelBox(DustCover10, 38, 11, 0.0F, 0.0F, 0.0F, 2, 1, 9, 0.0F, false));

		DustCover9 = new ModelRenderer(this);
		DustCover9.setRotationPoint(-3.9F, -13.5F, -21.5F);
		DustCover9.cubeList.add(new ModelBox(DustCover9, 14, 13, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		DustCover8 = new ModelRenderer(this);
		DustCover8.setRotationPoint(-3.9F, -13.5F, -21.5F);
		setRotationAngle(DustCover8, 0.0F, 0.0F, -0.7808F);
		DustCover8.cubeList.add(new ModelBox(DustCover8, 16, 0, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

		DustCover42 = new ModelRenderer(this);
		DustCover42.setRotationPoint(-2.0F, -15.8F, 0.5F);
		setRotationAngle(DustCover42, -0.9295F, 0.0F, 0.0F);
		DustCover42.cubeList.add(new ModelBox(DustCover42, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		DustCover41 = new ModelRenderer(this);
		DustCover41.setRotationPoint(-2.8F, -15.3F, 0.88F);
		setRotationAngle(DustCover41, -0.9295F, 0.0F, 0.0F);
		DustCover41.cubeList.add(new ModelBox(DustCover41, 0, 13, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		DustCover43 = new ModelRenderer(this);
		DustCover43.setRotationPoint(-1.2F, -15.3F, 0.88F);
		setRotationAngle(DustCover43, -0.9295F, 0.0F, 0.0F);
		DustCover43.cubeList.add(new ModelBox(DustCover43, 0, 6, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		DustCover39 = new ModelRenderer(this);
		DustCover39.setRotationPoint(-1.3F, -13.5F, 2.2F);
		setRotationAngle(DustCover39, -0.9295F, 0.0F, 0.0F);
		

		DustCover40 = new ModelRenderer(this);
		DustCover40.setRotationPoint(-3.7F, -13.5F, 2.2F);
		setRotationAngle(DustCover40, -0.9295F, 0.0F, 0.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		DustCover19.render(f5);
		DustCover17.render(f5);
		DustCover18.render(f5);
		DustCover37.render(f5);
		DustCover38.render(f5);
		DustCover20.render(f5);
		DustCover13.render(f5);
		DustCover11.render(f5);
		DustCover12.render(f5);
		DustCover36.render(f5);
		DustCover21.render(f5);
		DustCover14.render(f5);
		DustCover15.render(f5);
		DustCover47.render(f5);
		DustCover16.render(f5);
		DustCover1.render(f5);
		DustCover2.render(f5);
		DustCover4.render(f5);
		DustCover3.render(f5);
		DustCover22.render(f5);
		DustCover35.render(f5);
		DustCover5.render(f5);
		DustCover44.render(f5);
		DustCover10.render(f5);
		DustCover9.render(f5);
		DustCover8.render(f5);
		DustCover42.render(f5);
		DustCover41.render(f5);
		DustCover43.render(f5);
		DustCover39.render(f5);
		DustCover40.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
