package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class GravestoneSkull extends ModelBase implements IModernModel {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;

	public GravestoneSkull() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-6.0F, 24.0F, -3.5F);
		bone.cubeList.add(new ModelBox(bone, 0, 21, -1.0F, -2.0F, 0.0F, 14, 2, 7, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 30, -0.5F, -3.0F, 1.0F, 13, 1, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 36, 0.25F, -12.0F, 1.0F, 1, 9, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 35, 10, 10.75F, -12.0F, 1.0F, 1, 9, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 42, 11.3F, -17.0F, 1.0F, 1, 5, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 38, 39, -0.3F, -17.0F, 1.0F, 1, 5, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 45, 45, 0.25F, -18.5F, 1.0F, 1, 2, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 24, 44, 10.75F, -18.5F, 1.0F, 1, 2, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 25, 38, 4.0F, -20.5F, 1.0F, 4, 1, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.5F, -18.75F, 1.0F, 11, 16, 5, -0.2F, false));
		bone.cubeList.add(new ModelBox(bone, 31, 31, 2.0F, -19.75F, 1.001F, 8, 2, 5, -0.2F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(4.0F, -20.5F, 1.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.4712F);
		bone2.cubeList.add(new ModelBox(bone2, 37, 25, -4.0F, 0.0F, -0.001F, 4, 1, 5, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(8.0F, -20.5F, 1.0F);
		bone.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.4712F);
		bone3.cubeList.add(new ModelBox(bone3, 12, 36, 0.0F, 0.0F, -0.001F, 4, 1, 5, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(9.0F, -11.0F, 0.0F);
		bone.addChild(bone4);
		setRotationAngle(bone4, 0.1571F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 32, 0, -6.0F, -6.0F, 0.0F, 6, 6, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}
}
