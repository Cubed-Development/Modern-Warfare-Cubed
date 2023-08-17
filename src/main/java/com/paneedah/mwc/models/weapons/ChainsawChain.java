package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ChainsawChain extends ModelWithAttachments {
	private final ModelRenderer chain;
	private final ModelRenderer chain23_r1;
	private final ModelRenderer chain12_r1;
	private final ModelRenderer chain11_r1;
	private final ModelRenderer chain10_r1;
	private final ModelRenderer chain9_r1;
	private final ModelRenderer chain8_r1;
	private final ModelRenderer chain7_r1;
	private final ModelRenderer chain6_r1;
	private final ModelRenderer chain5_r1;
	private final ModelRenderer chain4_r1;
	private final ModelRenderer chain3_r1;
	private final ModelRenderer chain2_r1;

	public ChainsawChain() {
		textureWidth = 256;
		textureHeight = 256;

		chain = new ModelRenderer(this);
		chain.setRotationPoint(22.1766F, 11.6103F, 0.0F);
		

		chain23_r1 = new ModelRenderer(this);
		chain23_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		chain.addChild(chain23_r1);
		setRotationAngle(chain23_r1, 0.0F, 0.0F, -1.0038F);
		chain23_r1.cubeList.add(new ModelBox(chain23_r1, 0, 100, -0.2F, -26.4F, -0.6F, 1, 1, 2, 0.0F, true));
		chain23_r1.cubeList.add(new ModelBox(chain23_r1, 0, 100, -0.2F, -26.4F, -4.1F, 1, 1, 2, 0.0F, true));
		chain23_r1.cubeList.add(new ModelBox(chain23_r1, 0, 100, -0.2F, -26.4F, -7.6F, 1, 1, 2, 0.0F, true));
		chain23_r1.cubeList.add(new ModelBox(chain23_r1, 0, 100, -0.2F, -26.4F, -11.1F, 1, 1, 2, 0.0F, true));
		chain23_r1.cubeList.add(new ModelBox(chain23_r1, 0, 100, -0.2F, -26.4F, -14.6F, 1, 1, 2, 0.0F, true));
		chain23_r1.cubeList.add(new ModelBox(chain23_r1, 0, 100, -0.2F, -26.4F, -18.1F, 1, 1, 2, 0.0F, true));
		chain23_r1.cubeList.add(new ModelBox(chain23_r1, 0, 100, -0.2F, -26.4F, -21.6F, 1, 1, 2, 0.0F, true));
		chain23_r1.cubeList.add(new ModelBox(chain23_r1, 0, 100, -0.2F, -26.4F, -25.1F, 1, 1, 2, 0.0F, true));
		chain23_r1.cubeList.add(new ModelBox(chain23_r1, 0, 100, -0.2F, -26.4F, -28.6F, 1, 1, 2, 0.0F, true));
		chain23_r1.cubeList.add(new ModelBox(chain23_r1, 0, 100, -0.2F, -26.4F, -32.1F, 1, 1, 2, 0.0F, true));
		chain23_r1.cubeList.add(new ModelBox(chain23_r1, 0, 100, -0.2F, -26.4F, 2.9F, 1, 1, 2, 0.0F, true));

		chain12_r1 = new ModelRenderer(this);
		chain12_r1.setRotationPoint(-22.1766F, 12.5025F, 1.9681F);
		chain.addChild(chain12_r1);
		setRotationAngle(chain12_r1, 0.0744F, 0.0F, 0.0F);
		chain12_r1.cubeList.add(new ModelBox(chain12_r1, 0, 100, 0.0F, -26.4F, 2.5F, 1, 1, 3, 0.0F, true));

		chain11_r1 = new ModelRenderer(this);
		chain11_r1.setRotationPoint(-22.1766F, 12.2425F, 1.9585F);
		chain.addChild(chain11_r1);
		setRotationAngle(chain11_r1, 0.0744F, 0.0F, 0.0F);
		chain11_r1.cubeList.add(new ModelBox(chain11_r1, 0, 100, 0.0F, -26.4F, -1.0F, 1, 1, 3, 0.0F, true));

		chain10_r1 = new ModelRenderer(this);
		chain10_r1.setRotationPoint(-22.1766F, 11.9825F, 1.9488F);
		chain.addChild(chain10_r1);
		setRotationAngle(chain10_r1, 0.0744F, 0.0F, 0.0F);
		chain10_r1.cubeList.add(new ModelBox(chain10_r1, 0, 100, 0.0F, -26.4F, -4.5F, 1, 1, 3, 0.0F, true));

		chain9_r1 = new ModelRenderer(this);
		chain9_r1.setRotationPoint(-22.1766F, 11.7225F, 1.9391F);
		chain.addChild(chain9_r1);
		setRotationAngle(chain9_r1, 0.0744F, 0.0F, 0.0F);
		chain9_r1.cubeList.add(new ModelBox(chain9_r1, 0, 100, 0.0F, -26.4F, -8.0F, 1, 1, 3, 0.0F, true));

		chain8_r1 = new ModelRenderer(this);
		chain8_r1.setRotationPoint(-22.1766F, 11.4625F, 1.9294F);
		chain.addChild(chain8_r1);
		setRotationAngle(chain8_r1, 0.0744F, 0.0F, 0.0F);
		chain8_r1.cubeList.add(new ModelBox(chain8_r1, 0, 100, 0.0F, -26.4F, -11.5F, 1, 1, 3, 0.0F, true));

		chain7_r1 = new ModelRenderer(this);
		chain7_r1.setRotationPoint(-22.1766F, 11.2025F, 1.9198F);
		chain.addChild(chain7_r1);
		setRotationAngle(chain7_r1, 0.0744F, 0.0F, 0.0F);
		chain7_r1.cubeList.add(new ModelBox(chain7_r1, 0, 100, 0.0F, -26.4F, -15.0F, 1, 1, 3, 0.0F, true));

		chain6_r1 = new ModelRenderer(this);
		chain6_r1.setRotationPoint(-22.1766F, 10.9424F, 1.9101F);
		chain.addChild(chain6_r1);
		setRotationAngle(chain6_r1, 0.0744F, 0.0F, 0.0F);
		chain6_r1.cubeList.add(new ModelBox(chain6_r1, 0, 100, 0.0F, -26.4F, -18.5F, 1, 1, 3, 0.0F, true));

		chain5_r1 = new ModelRenderer(this);
		chain5_r1.setRotationPoint(-22.1766F, 10.6824F, 1.9004F);
		chain.addChild(chain5_r1);
		setRotationAngle(chain5_r1, 0.0744F, 0.0F, 0.0F);
		chain5_r1.cubeList.add(new ModelBox(chain5_r1, 0, 100, 0.0F, -26.4F, -22.0F, 1, 1, 3, 0.0F, true));

		chain4_r1 = new ModelRenderer(this);
		chain4_r1.setRotationPoint(-22.1766F, 10.4224F, 1.8908F);
		chain.addChild(chain4_r1);
		setRotationAngle(chain4_r1, 0.0744F, 0.0F, 0.0F);
		chain4_r1.cubeList.add(new ModelBox(chain4_r1, 0, 100, 0.0F, -26.4F, -25.5F, 1, 1, 3, 0.0F, true));

		chain3_r1 = new ModelRenderer(this);
		chain3_r1.setRotationPoint(-22.1766F, 10.1624F, 1.8811F);
		chain.addChild(chain3_r1);
		setRotationAngle(chain3_r1, 0.0744F, 0.0F, 0.0F);
		chain3_r1.cubeList.add(new ModelBox(chain3_r1, 0, 100, 0.0F, -26.4F, -29.0F, 1, 1, 3, 0.0F, true));

		chain2_r1 = new ModelRenderer(this);
		chain2_r1.setRotationPoint(-22.1766F, 9.9024F, 1.8714F);
		chain.addChild(chain2_r1);
		setRotationAngle(chain2_r1, 0.0744F, 0.0F, 0.0F);
		chain2_r1.cubeList.add(new ModelBox(chain2_r1, 0, 100, 0.0F, -26.4F, -32.5F, 1, 1, 3, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		chain.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
