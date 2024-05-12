package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FamasF1Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r152;
	private final ModelRenderer bolt2;
	private final ModelRenderer cube_r153;
	private final ModelRenderer cube_r154;
	private final ModelRenderer cube_r155;
	private final ModelRenderer cube_r156;
	private final ModelRenderer cube_r157;
	private final ModelRenderer cube_r158;
	private final ModelRenderer cube_r159;
	private final ModelRenderer cube_r160;
	private final ModelRenderer cube_r161;
	private final ModelRenderer cube_r162;

	public FamasF1Action() {
		textureWidth = 256;
		textureHeight = 256;

		action = new ModelRenderer(this);
		action.setRotationPoint(-3.5F, -3.5F, -4.0F);
		setRotationAngle(action, 1.041F, 0.0F, 0.0F);
		

		cube_r152 = new ModelRenderer(this);
		cube_r152.setRotationPoint(4.0F, -15.8072F, -19.3301F);
		action.addChild(cube_r152);
		setRotationAngle(cube_r152, -1.041F, 0.0F, 0.0F);
		cube_r152.cubeList.add(new ModelBox(cube_r152, 0, 0, -3.25F, -19.4437F, 38.1696F, 1, 3, 9, 0.0F, false));

		bolt2 = new ModelRenderer(this);
		bolt2.setRotationPoint(2.5F, -20.5008F, 3.1234F);
		action.addChild(bolt2);
		

		cube_r153 = new ModelRenderer(this);
		cube_r153.setRotationPoint(0.5F, 2.3058F, 2.7368F);
		bolt2.addChild(cube_r153);
		setRotationAngle(cube_r153, -1.7828F, 0.0F, 0.0F);
		cube_r153.cubeList.add(new ModelBox(cube_r153, 50, 136, -2.001F, -0.6535F, 0.0375F, 2, 2, 1, 0.0F, false));

		cube_r154 = new ModelRenderer(this);
		cube_r154.setRotationPoint(0.5F, 0.7659F, 5.5496F);
		bolt2.addChild(cube_r154);
		setRotationAngle(cube_r154, -0.0811F, 0.0F, 0.0F);
		cube_r154.cubeList.add(new ModelBox(cube_r154, 16, 96, -2.001F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r155 = new ModelRenderer(this);
		cube_r155.setRotationPoint(0.5F, 1.5216F, 5.3345F);
		bolt2.addChild(cube_r155);
		setRotationAngle(cube_r155, -0.4738F, 0.0F, 0.0F);
		cube_r155.cubeList.add(new ModelBox(cube_r155, 22, 96, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r156 = new ModelRenderer(this);
		cube_r156.setRotationPoint(0.5F, 2.1374F, 4.8465F);
		bolt2.addChild(cube_r156);
		setRotationAngle(cube_r156, -0.8665F, 0.0F, 0.0F);
		cube_r156.cubeList.add(new ModelBox(cube_r156, 28, 96, -2.001F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r157 = new ModelRenderer(this);
		cube_r157.setRotationPoint(1.0F, 4.6936F, -22.4535F);
		bolt2.addChild(cube_r157);
		setRotationAngle(cube_r157, -1.056F, 0.1312F, -0.2272F);
		cube_r157.cubeList.add(new ModelBox(cube_r157, 5, 0, -4.9944F, -23.2437F, 10.3673F, 1, 2, 1, -0.2F, false));

		cube_r158 = new ModelRenderer(this);
		cube_r158.setRotationPoint(1.0F, 4.6936F, -22.4535F);
		bolt2.addChild(cube_r158);
		setRotationAngle(cube_r158, -1.041F, 0.0F, 0.0F);
		cube_r158.cubeList.add(new ModelBox(cube_r158, 113, 136, -2.5F, -24.4437F, 11.1696F, 2, 2, 1, 0.0F, false));

		cube_r159 = new ModelRenderer(this);
		cube_r159.setRotationPoint(0.5F, 2.3356F, 1.6861F);
		bolt2.addChild(cube_r159);
		setRotationAngle(cube_r159, -2.2627F, 0.0F, 0.0F);
		cube_r159.cubeList.add(new ModelBox(cube_r159, 137, 29, -2.002F, -0.8204F, -0.6494F, 2, 2, 1, 0.0F, false));

		cube_r160 = new ModelRenderer(this);
		cube_r160.setRotationPoint(1.0F, 2.4684F, -26.0744F);
		bolt2.addChild(cube_r160);
		setRotationAngle(cube_r160, -1.041F, 0.0F, 0.0F);
		cube_r160.cubeList.add(new ModelBox(cube_r160, 0, 40, -2.501F, -24.8437F, 10.4696F, 2, 1, 2, -0.2F, false));
		cube_r160.cubeList.add(new ModelBox(cube_r160, 137, 22, -2.5F, -25.0437F, 10.2696F, 2, 1, 5, -0.2F, false));
		cube_r160.cubeList.add(new ModelBox(cube_r160, 107, 67, -2.5F, -24.4437F, 12.1696F, 2, 1, 2, 0.0F, false));

		cube_r161 = new ModelRenderer(this);
		cube_r161.setRotationPoint(1.0F, 2.4684F, -26.0744F);
		bolt2.addChild(cube_r161);
		setRotationAngle(cube_r161, -1.0934F, 0.0F, 0.0F);
		cube_r161.cubeList.add(new ModelBox(cube_r161, 82, 11, -2.5F, -24.5339F, 5.1594F, 2, 1, 1, 0.0F, false));

		cube_r162 = new ModelRenderer(this);
		cube_r162.setRotationPoint(0.0F, 0.0F, 0.0F);
		bolt2.addChild(cube_r162);
		setRotationAngle(cube_r162, -0.4301F, 0.0F, 0.0F);
		cube_r162.cubeList.add(new ModelBox(cube_r162, 34, 96, -1.501F, 0.0736F, 0.3192F, 2, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
