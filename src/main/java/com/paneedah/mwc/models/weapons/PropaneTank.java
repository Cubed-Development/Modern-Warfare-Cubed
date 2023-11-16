package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class PropaneTank extends ModelBase implements IModernModel {
	private final ModelRenderer bone5;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;

	public PropaneTank() {
		textureWidth = 128;
		textureHeight = 128;

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-0.25F, 22.0F, -7.75F);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 0, 98, -2.25F, -18.0F, 12.8211F, 5, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 94, -2.25F, -22.0F, 12.8211F, 5, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 12, 98, -2.25F, -18.0F, 1.75F, 4, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 12, 94, -2.25F, -22.0F, 1.75F, 4, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 36, 68, -3.2929F, -16.0F, -0.7071F, 7, 17, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 18, 68, -3.2929F, -16.0F, 14.1924F, 7, 17, 2, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.25F, 1.5F, 3.25F);
		bone5.addChild(bone3);
		setRotationAngle(bone3, 0.0F, -2.3562F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 62, 91, 0.7071F, -20.5F, -9.2426F, 5, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 12, 102, 0.7071F, -21.5F, -9.2426F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 12, 100, 4.7071F, -21.5F, -9.2426F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 38, 91, 0.7071F, -23.5F, -9.2426F, 5, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 50, 91, 0.7071F, -20.5F, 1.8284F, 5, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 87, 1.5303F, -19.5F, -4.7626F, 3, 1, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 54, 68, 1.5303F, -22.75F, -4.7626F, 3, 1, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 100, 2.5303F, -21.5F, -3.7626F, 1, 3, 1, 0.5F, false));
		bone3.cubeList.add(new ModelBox(bone3, 43, 96, 0.5303F, -20.5F, -3.7626F, 3, 0, 1, 0.3F, false));
		bone3.cubeList.add(new ModelBox(bone3, 4, 102, 4.7071F, -21.5F, 1.8284F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 4, 100, 0.7071F, -21.5F, 1.8284F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 14, 91, 0.7071F, -23.5F, 1.8284F, 5, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 18, 49, -0.2929F, -17.5F, -11.5962F, 7, 17, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 82, 53, 0.2021F, -18.501F, -10.677F, 6, 19, 15, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 82, 53, -4.35F, -18.505F, -6.2F, 15, 19, 6, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 49, -0.2929F, -17.5F, 3.3033F, 7, 17, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.25F, 1.5F, 3.25F);
		bone5.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -1.5708F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 96, 2.0355F, -23.5F, 5.0355F, 5, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 86, 91, 2.0355F, -19.5F, 5.0355F, 5, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 22, 94, 3.0355F, -19.5F, -6.0355F, 4, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 12, 96, 3.0355F, -23.5F, -6.0355F, 4, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 54, 49, 0.9926F, -17.5F, -8.4069F, 7, 17, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 81, 58, 1.5F, -18.5F, -7.5F, 6, 19, 15, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 81, 58, -3.0F, -18.51F, -3.0F, 15, 19, 6, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 36, 49, 0.9926F, -17.5F, 6.4926F, 7, 17, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.25F, 1.5F, 3.25F);
		bone5.addChild(bone);
		setRotationAngle(bone, 0.0F, -0.7854F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 74, 91, 0.7071F, -20.5F, 8.2426F, 5, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 102, 4.7071F, -21.5F, 8.2426F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 100, 0.7071F, -21.5F, 8.2426F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 26, 91, 0.7071F, -23.5F, 8.2426F, 5, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 36, 94, 5.4142F, -23.5F, -2.1213F, 1, 5, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 32, 94, 0.0F, -23.5F, -2.1213F, 1, 5, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 68, -0.3536F, -17.5F, -5.2426F, 7, 17, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 80, 30, -0.3536F, -17.5F, 9.6569F, 7, 17, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone5.render(f5);
	}
}