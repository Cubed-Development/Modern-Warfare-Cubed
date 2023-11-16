package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class OperatingTable extends ModelBase implements IModernModel {
	private final ModelRenderer table;
	private final ModelRenderer table13_r1;
	private final ModelRenderer table11_r1;
	private final ModelRenderer table8_r1;
	private final ModelRenderer table6_r1;
	private final ModelRenderer table4_r1;
	private final ModelRenderer table3_r1;

	public OperatingTable() {
		textureWidth = 256;
		textureHeight = 256;

		table = new ModelRenderer(this);
		table.setRotationPoint(0.0F, 9.8388F, 22.9888F);
		table.cubeList.add(new ModelBox(table, 0, 0, -4.0F, 4.1612F, -26.9888F, 8, 6, 8, 0.0F, true));
		table.cubeList.add(new ModelBox(table, 0, 30, -5.0F, 10.1612F, -28.9888F, 10, 2, 15, 0.0F, true));
		table.cubeList.add(new ModelBox(table, 0, 60, -3.5F, 0.1612F, -26.4888F, 7, 4, 7, 0.0F, true));
		table.cubeList.add(new ModelBox(table, 0, 0, -5.5F, -1.8388F, -40.4888F, 11, 2, 23, 0.0F, true));
		table.cubeList.add(new ModelBox(table, 0, 90, -6.0F, -3.8388F, -40.9888F, 12, 2, 24, 0.0F, true));

		table13_r1 = new ModelRenderer(this);
		table13_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		table.addChild(table13_r1);
		setRotationAngle(table13_r1, 1.8218F, 0.0F, 0.0F);
		table13_r1.cubeList.add(new ModelBox(table13_r1, 0, 90, -6.0F, -16.0F, 6.0F, 12, 12, 2, 0.0F, true));

		table11_r1 = new ModelRenderer(this);
		table11_r1.setRotationPoint(0.0F, 2.0123F, -2.5615F);
		table.addChild(table11_r1);
		setRotationAngle(table11_r1, 1.8218F, 0.0F, 0.0F);
		table11_r1.cubeList.add(new ModelBox(table11_r1, 0, 0, -5.5F, -14.0F, 5.5F, 11, 13, 2, 0.0F, true));

		table8_r1 = new ModelRenderer(this);
		table8_r1.setRotationPoint(0.0F, 18.4645F, -20.3779F);
		table.addChild(table8_r1);
		setRotationAngle(table8_r1, 0.7854F, 0.0F, 0.0F);
		table8_r1.cubeList.add(new ModelBox(table8_r1, 0, 30, -4.5F, -1.0F, 6.5F, 2, 2, 2, 0.0F, true));
		table8_r1.cubeList.add(new ModelBox(table8_r1, 0, 30, 2.5F, -1.0F, 6.5F, 2, 2, 2, 0.0F, true));

		table6_r1 = new ModelRenderer(this);
		table6_r1.setRotationPoint(0.0F, 5.7366F, -25.65F);
		table.addChild(table6_r1);
		setRotationAngle(table6_r1, 0.7854F, 0.0F, 0.0F);
		table6_r1.cubeList.add(new ModelBox(table6_r1, 0, 30, -5.5F, -1.0F, -11.5F, 2, 2, 2, 0.0F, true));
		table6_r1.cubeList.add(new ModelBox(table6_r1, 0, 30, 3.5F, -1.0F, -11.5F, 2, 2, 2, 0.0F, true));

		table4_r1 = new ModelRenderer(this);
		table4_r1.setRotationPoint(-1.9297F, 14.1612F, -24.2873F);
		table.addChild(table4_r1);
		setRotationAngle(table4_r1, 0.0F, -0.1859F, 0.0F);
		table4_r1.cubeList.add(new ModelBox(table4_r1, 0, 30, 3.0F, -4.0F, -11.0F, 3, 2, 6, 0.0F, true));

		table3_r1 = new ModelRenderer(this);
		table3_r1.setRotationPoint(1.9297F, 14.1612F, -24.2872F);
		table.addChild(table3_r1);
		setRotationAngle(table3_r1, 0.0F, 0.1859F, 0.0F);
		table3_r1.cubeList.add(new ModelBox(table3_r1, 0, 30, -6.0F, -4.0F, -11.0F, 3, 2, 6, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		table.render(f5);
	}
}