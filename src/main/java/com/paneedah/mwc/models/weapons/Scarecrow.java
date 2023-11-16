package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Scarecrow extends ModelBase implements IModernModel {
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;

	public Scarecrow() {
		textureWidth = 150;
		textureHeight = 150;

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.0F, -5.0F, -2.0F);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.0175F);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -3.75F, 2.0F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, -0.0175F, -0.1047F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 86, -1.0105F, -7.9983F, -0.0994F, 3, 41, 3, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(4.0F, -7.0F, -4.0F);
		bone2.addChild(bone);
		setRotationAngle(bone, 0.1571F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 37, -12.0F, -16.0F, 0.0F, 16, 16, 16, -2.5F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-18.0F, -9.5F, -1.0F);
		bone2.addChild(bone4);
		setRotationAngle(bone4, -0.1047F, -0.1047F, 0.0349F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, -6.0F, -1.0F, 0.0F, 49, 3, 3, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(3.9F, -20.1F, -5.65F);
		bone2.addChild(bone5);
		setRotationAngle(bone5, 0.1525F, -0.07F, -0.0868F);
		

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 60, 71, -7.0F, -1.0F, 0.0F, 7, 1, 16, 0.1F, false));
		bone6.cubeList.add(new ModelBox(bone6, 78, 59, -11.5F, -1.0F, 4.5F, 16, 1, 7, 0.1F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.25F, 0.0F, 0.0F);
		bone6.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.7854F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 78, 51, -16.0F, -1.01F, 0.0F, 16, 1, 7, 0.1F, false));
		bone7.cubeList.add(new ModelBox(bone7, 30, 70, -11.4194F, -1.02F, -4.6315F, 7, 1, 16, 0.1F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, -8.7F, 6.0F);
		bone5.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 80, 22, -7.0F, -1.0F, -1.0F, 7, 1, 7, 0.1F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, -1.0F, -1.0F);
		bone8.addChild(bone9);
		setRotationAngle(bone9, -0.2618F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 52, 88, -7.0F, 0.0F, 0.0F, 7, 9, 3, 0.1F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -1.0F, 6.0F);
		bone8.addChild(bone10);
		setRotationAngle(bone10, 0.2618F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 32, 87, -7.0F, 0.0F, -3.0F, 7, 9, 3, 0.1F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, -1.0F, -1.0F);
		bone8.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -0.2618F);
		bone11.cubeList.add(new ModelBox(bone11, 12, 86, -3.0F, 0.0F, 0.0F, 3, 9, 7, 0.1F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-7.0F, -1.0F, -1.0F);
		bone8.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, 0.2618F);
		bone12.cubeList.add(new ModelBox(bone12, 80, 6, 0.0F, 0.0F, 0.0F, 3, 9, 7, 0.1F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, -7.5F, -5.0F);
		bone2.addChild(bone13);
		setRotationAngle(bone13, 0.3142F, -0.1396F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 0, 69, -1.0086F, -0.5242F, -0.1533F, 7, 1, 16, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-6.6843F, -8.6999F, -3.8F);
		bone2.addChild(bone14);
		setRotationAngle(bone14, 0.3142F, 0.3316F, 0.1047F);
		bone14.cubeList.add(new ModelBox(bone14, 48, 53, -1.0083F, -0.5254F, -0.1572F, 7, 1, 16, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-11.75F, -10.15F, 1.95F);
		bone2.addChild(bone15);
		setRotationAngle(bone15, 0.2269F, 0.9076F, 0.1745F);
		bone15.cubeList.add(new ModelBox(bone15, 48, 37, -3.0F, -1.0F, 0.0F, 9, 1, 13, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(9.25F, -8.05F, -2.8F);
		bone2.addChild(bone16);
		setRotationAngle(bone16, 0.6283F, -1.0996F, -0.5411F);
		bone16.cubeList.add(new ModelBox(bone16, 79, 37, -1.0F, -1.0F, 0.0F, 11, 1, 10, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(20.0F, -9.6F, 2.5F);
		bone2.addChild(bone17);
		setRotationAngle(bone17, 0.0F, -0.1047F, 0.0297F);
		bone17.cubeList.add(new ModelBox(bone17, 0, 31, -40.0F, 0.0F, 0.0F, 40, 1, 5, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 1.0F, 0.0F);
		bone17.addChild(bone18);
		setRotationAngle(bone18, 0.0349F, 0.0F, -0.0175F);
		bone18.cubeList.add(new ModelBox(bone18, 0, 6, -40.0F, -1.0F, 0.0F, 40, 25, 0, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 51, 102, -40.0F, 24.0F, 0.0F, 40, 7, 0, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-39.9865F, 1.9923F, 5.0072F);
		bone17.addChild(bone19);
		setRotationAngle(bone19, 0.0349F, 3.1416F, -0.0175F);
		bone19.cubeList.add(new ModelBox(bone19, 0, 6, -40.0F, -1.0F, 0.0F, 40, 25, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone2.render(f5);
	}
}
