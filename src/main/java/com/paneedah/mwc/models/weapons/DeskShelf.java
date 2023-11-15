package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DeskShelf extends ModelBase implements IModernModel {
	private final ModelRenderer deskShelf;
	private final ModelRenderer shelf2_r1;

	public DeskShelf() {
		textureWidth = 256;
		textureHeight = 256;

		deskShelf = new ModelRenderer(this);
		deskShelf.setRotationPoint(0.0955F, 24.0F, 1.3627F);
		deskShelf.cubeList.add(new ModelBox(deskShelf, 0, 90, -6.1955F, -13.0F, 0.6373F, 6, 2, 4, 0.0F, true));
		deskShelf.cubeList.add(new ModelBox(deskShelf, 0, 0, -8.0955F, -9.0F, -1.3627F, 16, 2, 8, 0.0F, true));

		shelf2_r1 = new ModelRenderer(this);
		shelf2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		deskShelf.addChild(shelf2_r1);
		setRotationAngle(shelf2_r1, 0.0F, -0.2974F, 0.0F);
		shelf2_r1.cubeList.add(new ModelBox(shelf2_r1, 0, 50, -4.5F, -11.0F, 1.0F, 5, 2, 4, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		deskShelf.render(f5);
	}
}