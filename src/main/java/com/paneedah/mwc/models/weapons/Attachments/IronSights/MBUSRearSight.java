package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class MBUSRearSight extends ModelBase {
	private final ModelRenderer sight23;
	private final ModelRenderer sight26;
	private final ModelRenderer sight44;
	private final ModelRenderer bone10;
	private final ModelRenderer bone;
	private final ModelRenderer bone13;
	private final ModelRenderer bone11;
	private final ModelRenderer bone9;
	private final ModelRenderer bone8;
	private final ModelRenderer bone7;
	private final ModelRenderer bone5;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone14;
	private final ModelRenderer bone12;
	private final ModelRenderer bone6;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;

	public MBUSRearSight() {
		textureWidth = 64;
		textureHeight = 64;

		sight23 = new ModelRenderer(this);
		sight23.setRotationPoint(3.0F, -4.0F, -1.0F);
		setRotationAngle(sight23, 0.0F, 0.0F, 2.3562F);
		sight23.cubeList.add(new ModelBox(sight23, 43, 13, -0.7071F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		sight23.cubeList.add(new ModelBox(sight23, 42, 37, -0.7071F, 0.4F, 0.0F, 1, 1, 2, 0.0F, false));

		sight26 = new ModelRenderer(this);
		sight26.setRotationPoint(0.0F, -4.0F, -1.0F);
		setRotationAngle(sight26, 0.0F, 0.0F, -0.7854F);
		sight26.cubeList.add(new ModelBox(sight26, 42, 21, 0.0F, -0.7071F, 0.0F, 1, 1, 2, 0.0F, false));
		sight26.cubeList.add(new ModelBox(sight26, 5, 38, -1.4142F, 0.7071F, -0.01F, 1, 1, 2, 0.0F, false));
		sight26.cubeList.add(new ModelBox(sight26, 7, 32, 0.3889F, 2.5102F, -0.01F, 1, 1, 2, 0.0F, false));
		sight26.cubeList.add(new ModelBox(sight26, 39, 12, 0.4F, -0.7071F, 0.0F, 1, 1, 2, 0.0F, false));

		sight44 = new ModelRenderer(this);
		sight44.setRotationPoint(-3.7F, 5.0F, -2.8F);
		setRotationAngle(sight44, -1.3271F, 0.0F, 0.0F);
		sight44.cubeList.add(new ModelBox(sight44, 0, 10, 1.7F, 0.7291F, -1.2118F, 7, 5, 2, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(1.7F, 0.0F, 0.0F);
		sight44.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.7854F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 40, 43, -0.1432F, 0.7291F, -0.8568F, 1, 5, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 36, 43, 4.8066F, 0.7291F, 4.0929F, 1, 5, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 15, 15, -2.0F, -18.8F, -8.7F, 7, 3, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 34, 2, -2.7F, -17.0F, -8.71F, 2, 2, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 30, 34, 3.7F, -17.0F, -8.71F, 2, 2, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 4, -1.5F, -23.2F, -3.0F, 6, 2, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 4, -1.5F, -23.95F, -3.01F, 6, 1, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 14, 20, -2.0F, -21.2F, -3.01F, 7, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 22, 24, -2.5F, -26.2F, -3.0F, 1, 5, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 28, 20, -3.0F, -22.1F, -3.0F, 1, 4, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 40, 16, -2.5F, -22.1F, -0.5F, 2, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 38, 7, 3.5F, -22.1F, -0.5F, 2, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 32, 12, -3.0F, -18.1F, -3.0F, 2, 3, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 32, 4.0F, -18.1F, -3.0F, 2, 3, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 38, -2.0F, -19.1F, -1.0F, 1, 3, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 17, -0.5F, -20.1F, -1.0F, 1, 4, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 31, 32, -1.5F, -17.1F, 0.01F, 6, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 44, 3.5F, -19.1F, -0.24F, 1, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 44, -1.5F, -19.1F, -0.24F, 1, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 17, 2.5F, -20.1F, -1.0F, 1, 4, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 38, 4.0F, -19.1F, -1.0F, 1, 3, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 16, 7, -0.5F, -21.2F, -2.0F, 4, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 28, 3, 5.0F, -22.1F, -3.0F, 1, 4, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 24, 4.5F, -26.2F, -3.0F, 1, 5, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 16, 38, 0.5F, -26.5F, -1.0F, 2, 4, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 18, 12, -2.0F, -20.0F, -3.8F, 7, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 37, 34, 0.5F, -29.5F, -1.0F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 24, 38, 2.5F, -28.5F, -1.0F, 1, 6, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 30, 39, -0.5F, -28.5F, -1.0F, 1, 6, 2, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(5.7F, -17.2F, -3.0F);
		bone.addChild(bone13);
		setRotationAngle(bone13, -1.3788F, 0.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 38, 24, -1.0F, -1.0184F, -0.1908F, 1, 2, 2, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 26, 33, -8.4F, -1.0184F, -0.1908F, 1, 2, 2, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(5.7F, -17.0F, -7.7F);
		bone.addChild(bone11);
		setRotationAngle(bone11, 0.2443F, 0.0F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 0, 17, -0.99F, -1.2419F, -0.9703F, 1, 2, 6, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 16, 0, -8.41F, -1.2419F, -0.9703F, 1, 2, 6, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-2.25F, -25.2F, 1.0F);
		bone.addChild(bone9);
		setRotationAngle(bone9, 0.2967F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 0, 24, -2.0F, -2.3677F, -3.9842F, 2, 5, 5, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 41, 0, 7.1F, -0.9921F, -3.3161F, 1, 3, 3, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 0, -0.75F, 5.9681F, -9.1577F, 9, 2, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 8, 44, -0.26F, 0.3825F, -0.1169F, 1, 2, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-1.5F, -26.2F, 2.0F);
		bone.addChild(bone8);
		setRotationAngle(bone8, -1.4486F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 37, 37, -1.01F, 0.0F, -3.0F, 1, 4, 3, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 34, 18, 5.99F, 0.0F, -3.0F, 1, 4, 3, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.5F, -26.2F, -2.0F);
		bone.addChild(bone7);
		setRotationAngle(bone7, 1.3788F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 24, 2, -1.0F, -0.9816F, -0.1908F, 1, 1, 3, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 8, 24, 6.0F, -0.9816F, -0.1908F, 1, 1, 3, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.5F, -29.7F, 1.5F);
		bone.addChild(bone5);
		setRotationAngle(bone5, 0.192F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 16, 33, -1.0F, -0.1908F, -3.9816F, 1, 1, 4, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 18, 24, 6.0F, -0.1908F, -3.9816F, 1, 1, 4, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(6.0F, -15.9F, -2.0F);
		bone.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, -2.6354F);
		bone15.cubeList.add(new ModelBox(bone15, 0, 0, -0.7576F, -1.5627F, -1.0F, 4, 2, 4, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-3.0F, -15.9F, -2.0F);
		bone.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.0F, 2.6354F);
		bone16.cubeList.add(new ModelBox(bone16, 0, 0, -3.2424F, -1.5627F, -1.0F, 4, 2, 4, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(6.0F, -22.1F, 0.0F);
		bone.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, -0.7854F);
		bone14.cubeList.add(new ModelBox(bone14, 20, 33, -1.0F, -1.0F, -3.01F, 1, 1, 5, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 10, 33, -6.364F, -6.364F, -3.01F, 1, 1, 5, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(5.0F, -19.0F, -2.8F);
		bone.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, -0.7854F);
		bone12.cubeList.add(new ModelBox(bone12, 13, 38, -0.2929F, -0.7071F, -1.0F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 10, 35, -5.2426F, -5.6569F, -1.0F, 1, 1, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.5F, -24.9F, 0.7F);
		bone.addChild(bone6);
		setRotationAngle(bone6, 0.7854F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 32, 28, -1.99F, -1.4343F, -2.5657F, 6, 2, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 24, 0, -1.99F, 4.1619F, -6.1619F, 6, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.0F, -17.2F, 1.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.6981F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 24, -0.8071F, -4.3199F, 0.0F, 1, 3, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(5.0F, -17.2F, 1.0F);
		bone.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.6981F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 4, -0.1929F, -4.3199F, 0.0F, 1, 3, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-2.0F, -15.1F, 1.0F);
		bone.addChild(bone4);
		setRotationAngle(bone4, -0.6981F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 32, 30, -1.0F, -1.346F, -0.8987F, 2, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 16, 4, 6.0F, -1.346F, -0.8987F, 2, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sight23.render(f5);
		sight26.render(f5);
		sight44.render(f5);
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
