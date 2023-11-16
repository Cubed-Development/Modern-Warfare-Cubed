package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Gravestone extends ModelBase implements IModernModel {
	private final ModelRenderer bone;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone2;
	private final ModelRenderer bone5;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;

	public Gravestone() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, -3.5F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -6.0F, -2.0F, 0.0F, 12, 2, 7, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 22, 22, -5.0F, -3.0F, 0.5F, 10, 1, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 28, 9, -3.5F, -17.75F, 1.5F, 7, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 9, -5.0F, -15.9F, 1.5F, 10, 14, 4, -0.2F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 27, -4.0F, -17.1F, 1.499F, 8, 2, 4, -0.2F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-3.5F, -17.75F, 1.5F);
		bone.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -1.0647F);
		bone6.cubeList.add(new ModelBox(bone6, 31, 0, -2.0F, 0.0F, -0.001F, 2, 1, 4, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(3.5F, -17.75F, 1.5F);
		bone.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, 1.0647F);
		bone7.cubeList.add(new ModelBox(bone7, 28, 14, 0.0F, 0.0F, -0.001F, 2, 1, 4, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-5.75F, -15.0F, 1.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.0698F);
		bone2.cubeList.add(new ModelBox(bone2, 30, 30, 0.0F, 0.0F, 0.5F, 1, 13, 4, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-5.75F, -15.0F, 1.0F);
		bone.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.6981F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 33, 0.0F, 0.0F, 0.501F, 2, 1, 4, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(5.75F, -15.0F, 1.0F);
		bone.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.0698F);
		bone3.cubeList.add(new ModelBox(bone3, 20, 29, -1.0F, 0.0F, 0.5F, 1, 13, 4, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(5.75F, -15.0F, 1.0F);
		bone.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.6981F);
		bone4.cubeList.add(new ModelBox(bone4, 8, 34, -2.0F, 0.0F, 0.501F, 2, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}
}
