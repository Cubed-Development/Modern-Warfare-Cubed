package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class APS extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun182;
	private final ModelRenderer gun181;
	private final ModelRenderer gun180;
	private final ModelRenderer gun165;
	private final ModelRenderer gun164;
	private final ModelRenderer gun163;
	private final ModelRenderer gun162;
	private final ModelRenderer gun161;
	private final ModelRenderer gun160;
	private final ModelRenderer gun159;
	private final ModelRenderer gun158;
	private final ModelRenderer gun157;
	private final ModelRenderer gun156;
	private final ModelRenderer gun155;
	private final ModelRenderer gun154;
	private final ModelRenderer gun153;
	private final ModelRenderer gun152;
	private final ModelRenderer gun151;
	private final ModelRenderer gun150;
	private final ModelRenderer gun149;
	private final ModelRenderer gun148;
	private final ModelRenderer gun142;
	private final ModelRenderer gun141;
	private final ModelRenderer gun140;
	private final ModelRenderer gun137;
	private final ModelRenderer gun1811;
	private final ModelRenderer gun1800;
	private final ModelRenderer gun1799;
	private final ModelRenderer gun1588;
	private final ModelRenderer gun133;
	private final ModelRenderer gun132;
	private final ModelRenderer gun131;
	private final ModelRenderer gun130;
	private final ModelRenderer gun126;
	private final ModelRenderer gun92;
	private final ModelRenderer gun86;
	private final ModelRenderer gun85;
	private final ModelRenderer gun84;
	private final ModelRenderer gun83;
	private final ModelRenderer gun15;
	private final ModelRenderer gun14;
	private final ModelRenderer gun12;
	private final ModelRenderer gun6;
	private final ModelRenderer gun2;

	public APS() {
		textureWidth = 150;
		textureHeight = 150;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun182 = new ModelRenderer(this);
		gun182.setRotationPoint(-3.0F, -17.6F, 3.0F);
		gun.addChild(gun182);
		setRotationAngle(gun182, -3.0486F, 0.0F, 0.0F);
		gun182.cubeList.add(new ModelBox(gun182, 23, 0, 0.0F, -1.0F, 0.0F, 3, 8, 2, 0.0F, false));

		gun181 = new ModelRenderer(this);
		gun181.setRotationPoint(-3.0F, -23.7F, 2.3F);
		gun.addChild(gun181);
		setRotationAngle(gun181, -3.0486F, 0.0F, 0.0F);
		gun181.cubeList.add(new ModelBox(gun181, 50, 60, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun180 = new ModelRenderer(this);
		gun180.setRotationPoint(-2.5F, -30.5F, 0.6F);
		gun.addChild(gun180);
		setRotationAngle(gun180, -1.3013F, 0.0F, 0.0F);
		gun180.cubeList.add(new ModelBox(gun180, 10, 75, 0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F, false));

		gun165 = new ModelRenderer(this);
		gun165.setRotationPoint(-3.0F, -32.6F, -24.5F);
		gun.addChild(gun165);
		setRotationAngle(gun165, 0.7854F, 0.0F, 0.0F);
		gun165.cubeList.add(new ModelBox(gun165, 35, 8, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun164 = new ModelRenderer(this);
		gun164.setRotationPoint(-3.0F, -31.6F, -23.5F);
		gun.addChild(gun164);
		setRotationAngle(gun164, 2.3562F, 0.0F, 0.0F);
		gun164.cubeList.add(new ModelBox(gun164, 37, 26, -0.001F, -0.001F, 0.0F, 3, 1, 1, 0.0F, false));

		gun163 = new ModelRenderer(this);
		gun163.setRotationPoint(-0.3F, -32.0F, -8.5F);
		gun.addChild(gun163);
		setRotationAngle(gun163, 1.2641F, 0.0F, 0.0F);
		gun163.cubeList.add(new ModelBox(gun163, 0, 22, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun162 = new ModelRenderer(this);
		gun162.setRotationPoint(-3.7F, -32.0F, -8.5F);
		gun.addChild(gun162);
		setRotationAngle(gun162, 1.2641F, 0.0F, 0.0F);
		gun162.cubeList.add(new ModelBox(gun162, 9, 22, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun161 = new ModelRenderer(this);
		gun161.setRotationPoint(-3.7F, -34.0F, -10.7F);
		gun.addChild(gun161);
		gun161.cubeList.add(new ModelBox(gun161, 54, 13, 0.0F, 0.0F, 0.0F, 1, 2, 11, 0.0F, false));

		gun160 = new ModelRenderer(this);
		gun160.setRotationPoint(-0.3F, -34.0F, -10.7F);
		gun.addChild(gun160);
		gun160.cubeList.add(new ModelBox(gun160, 54, 33, 0.002F, 0.0F, 0.0F, 1, 2, 11, 0.0F, false));

		gun159 = new ModelRenderer(this);
		gun159.setRotationPoint(-3.5F, -16.5F, -4.4F);
		gun.addChild(gun159);
		setRotationAngle(gun159, 1.1897F, 0.0F, 0.0F);
		gun159.cubeList.add(new ModelBox(gun159, 0, 38, 0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun158 = new ModelRenderer(this);
		gun158.setRotationPoint(-3.5F, -17.0F, 0.0F);
		gun.addChild(gun158);
		gun158.cubeList.add(new ModelBox(gun158, 28, 42, 0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun157 = new ModelRenderer(this);
		gun157.setRotationPoint(-2.5F, -25.6F, -12.5F);
		gun.addChild(gun157);
		setRotationAngle(gun157, 2.3562F, 0.0F, 0.0F);
		gun157.cubeList.add(new ModelBox(gun157, 12, 39, 0.001F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun156 = new ModelRenderer(this);
		gun156.setRotationPoint(-2.5F, -26.6F, -13.5F);
		gun.addChild(gun156);
		setRotationAngle(gun156, 0.7854F, 0.0F, 0.0F);
		gun156.cubeList.add(new ModelBox(gun156, 67, 22, -0.001F, 0.0F, -0.001F, 2, 1, 1, 0.0F, false));

		gun155 = new ModelRenderer(this);
		gun155.setRotationPoint(-3.5F, -31.0F, -10.0F);
		gun.addChild(gun155);
		setRotationAngle(gun155, 1.2641F, 0.0F, 0.0F);
		gun155.cubeList.add(new ModelBox(gun155, 34, 11, 0.002F, 0.0F, 0.0F, 4, 5, 2, 0.0F, false));

		gun154 = new ModelRenderer(this);
		gun154.setRotationPoint(-3.5F, -31.0F, -13.5F);
		gun.addChild(gun154);
		setRotationAngle(gun154, 2.0448F, 0.0F, 0.0F);
		gun154.cubeList.add(new ModelBox(gun154, 0, 42, -0.001F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun153 = new ModelRenderer(this);
		gun153.setRotationPoint(-0.3F, -33.5F, 0.3F);
		gun.addChild(gun153);
		setRotationAngle(gun153, -1.3384F, 0.0F, 0.0F);
		gun153.cubeList.add(new ModelBox(gun153, 0, 53, 0.001F, 0.0F, 0.0F, 1, 7, 3, 0.0F, false));

		gun152 = new ModelRenderer(this);
		gun152.setRotationPoint(-3.7F, -33.5F, 0.3F);
		gun.addChild(gun152);
		setRotationAngle(gun152, -1.3384F, 0.0F, 0.0F);
		gun152.cubeList.add(new ModelBox(gun152, 34, 53, -0.001F, 0.0F, 0.0F, 1, 7, 3, 0.0F, false));

		gun151 = new ModelRenderer(this);
		gun151.setRotationPoint(-2.5F, -30.6F, -13.5F);
		gun.addChild(gun151);
		gun151.cubeList.add(new ModelBox(gun151, 0, 14, 0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F, false));

		gun150 = new ModelRenderer(this);
		gun150.setRotationPoint(-3.0F, -30.5F, -4.3F);
		gun.addChild(gun150);
		setRotationAngle(gun150, -1.3384F, 0.0F, 0.0F);
		gun150.cubeList.add(new ModelBox(gun150, 92, 40, 0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F, false));

		gun149 = new ModelRenderer(this);
		gun149.setRotationPoint(-3.5F, -16.0F, 2.0F);
		gun.addChild(gun149);
		setRotationAngle(gun149, 2.167F, 0.0F, 0.0F);
		gun149.cubeList.add(new ModelBox(gun149, 34, 18, 0.001F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun148 = new ModelRenderer(this);
		gun148.setRotationPoint(-3.5F, -16.5F, -4.4F);
		gun.addChild(gun148);
		gun148.cubeList.add(new ModelBox(gun148, 54, 26, -0.001F, 0.0F, 0.0F, 4, 1, 5, 0.0F, false));

		gun142 = new ModelRenderer(this);
		gun142.setRotationPoint(0.0F, -34.2F, -8.0F);
		gun.addChild(gun142);
		setRotationAngle(gun142, 0.2231F, 0.0F, 0.0F);
		

		gun141 = new ModelRenderer(this);
		gun141.setRotationPoint(-3.0F, -30.5F, -10.2F);
		gun.addChild(gun141);
		setRotationAngle(gun141, 1.2641F, 0.0F, 0.0F);
		gun141.cubeList.add(new ModelBox(gun141, 50, 53, -0.001F, 0.0F, 0.0F, 3, 5, 2, 0.0F, false));

		gun140 = new ModelRenderer(this);
		gun140.setRotationPoint(-3.5F, -33.5F, -24.5F);
		gun.addChild(gun140);
		gun140.cubeList.add(new ModelBox(gun140, 0, 53, 0.0F, 0.0F, 0.0F, 4, 1, 11, 0.0F, false));

		gun137 = new ModelRenderer(this);
		gun137.setRotationPoint(0.0F, -33.5F, -8.0F);
		gun.addChild(gun137);
		setRotationAngle(gun137, 0.0311F, 0.0F, 0.0F);
		gun137.cubeList.add(new ModelBox(gun137, 74, 69, 0.0F, 0.5F, 0.0F, 1, 1, 3, 0.0F, false));

		gun1811 = new ModelRenderer(this);
		gun1811.setRotationPoint(-2.0F, -36.7F, -11.5F);
		gun.addChild(gun1811);
		gun1811.cubeList.add(new ModelBox(gun1811, 74, 64, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun1800 = new ModelRenderer(this);
		gun1800.setRotationPoint(-2.9F, -35.9F, -11.5F);
		gun.addChild(gun1800);
		setRotationAngle(gun1800, 0.0F, 0.0F, 0.5205F);
		gun1800.cubeList.add(new ModelBox(gun1800, 75, 53, 0.0F, -0.2F, 0.0F, 1, 1, 4, 0.0F, false));

		gun1799 = new ModelRenderer(this);
		gun1799.setRotationPoint(-2.0F, -36.7F, -11.5F);
		gun.addChild(gun1799);
		setRotationAngle(gun1799, 0.0F, 0.0F, 0.9295F);
		gun1799.cubeList.add(new ModelBox(gun1799, 75, 58, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun1588 = new ModelRenderer(this);
		gun1588.setRotationPoint(-2.5F, -35.85F, -31.0F);
		gun.addChild(gun1588);
		gun1588.cubeList.add(new ModelBox(gun1588, 43, 81, 0.0F, 0.0F, 0.0F, 2, 2, 23, 0.0F, false));

		gun133 = new ModelRenderer(this);
		gun133.setRotationPoint(-3.0F, -31.6F, -23.5F);
		gun.addChild(gun133);
		setRotationAngle(gun133, 0.0F, 0.0F, -2.0448F);
		gun133.cubeList.add(new ModelBox(gun133, 23, 0, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(0.0F, -31.6F, -23.5F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -2.6545F);
		gun132.cubeList.add(new ModelBox(gun132, 63, 53, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun131 = new ModelRenderer(this);
		gun131.setRotationPoint(-3.0F, -33.6F, -23.5F);
		gun.addChild(gun131);
		gun131.cubeList.add(new ModelBox(gun131, 34, 53, 0.0F, 0.0F, 0.0F, 3, 2, 10, 0.0F, false));

		gun130 = new ModelRenderer(this);
		gun130.setRotationPoint(-3.0F, -30.5F, -13.5F);
		gun.addChild(gun130);
		setRotationAngle(gun130, 2.6769F, 0.0F, 0.0F);
		gun130.cubeList.add(new ModelBox(gun130, 97, 33, 0.001F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

		gun126 = new ModelRenderer(this);
		gun126.setRotationPoint(-3.0F, -31.5F, -13.5F);
		gun.addChild(gun126);
		gun126.cubeList.add(new ModelBox(gun126, 50, 106, 0.0F, 0.0F, 0.0F, 3, 1, 14, 0.0F, false));

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(-3.5F, -30.5F, -4.0F);
		gun.addChild(gun92);
		setRotationAngle(gun92, -1.3384F, 0.0F, 0.0F);
		gun92.cubeList.add(new ModelBox(gun92, 25, 86, 0.001F, 0.0F, -1.0F, 4, 3, 15, 0.0F, false));

		gun86 = new ModelRenderer(this);
		gun86.setRotationPoint(-3.5F, -30.5F, 1.4F);
		gun.addChild(gun86);
		setRotationAngle(gun86, -1.9333F, 0.0F, 0.0F);
		gun86.cubeList.add(new ModelBox(gun86, 98, 77, 0.001F, 0.0F, 0.0F, 4, 4, 3, 0.0F, false));

		gun85 = new ModelRenderer(this);
		gun85.setRotationPoint(-3.5F, -31.5F, 3.5F);
		gun.addChild(gun85);
		setRotationAngle(gun85, -2.9371F, 0.0F, 0.0F);
		gun85.cubeList.add(new ModelBox(gun85, 67, 41, 0.001F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun84 = new ModelRenderer(this);
		gun84.setRotationPoint(-3.5F, -33.5F, -0.5F);
		gun.addChild(gun84);
		gun84.cubeList.add(new ModelBox(gun84, 80, 81, 0.0F, 1.0F, 0.0F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 54, 5, -0.002F, 0.2F, -0.001F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 54, 38, 3.0F, 1.0F, 0.0F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 36, 41, 3.002F, 0.2F, -0.001F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 54, 33, 2.55F, 1.0F, 0.1F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 54, 0, 2.551F, 0.2F, 0.099F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 54, 18, 0.45F, 1.0F, 0.1F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 54, 13, 0.449F, 0.2F, 0.099F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 34, 75, 0.95F, 1.0F, 0.099F, 2, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 19, 59, 0.95F, 0.5F, 0.098F, 2, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 0, 65, 0.95F, -2.6F, 1.198F, 2, 3, 1, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 80, 2, 1.5F, -2.6F, 1.498F, 1, 1, 1, -0.2F, false));

		gun83 = new ModelRenderer(this);
		gun83.setRotationPoint(-3.5F, -29.5F, 0.5F);
		gun.addChild(gun83);
		setRotationAngle(gun83, 2.4166F, 0.0F, 0.0F);
		gun83.cubeList.add(new ModelBox(gun83, 98, 84, -0.001F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-2.5F, -26.6F, -12.5F);
		gun.addChild(gun15);
		gun15.cubeList.add(new ModelBox(gun15, 79, 35, 0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-3.0F, -26.0F, -7.5F);
		gun.addChild(gun14);
		setRotationAngle(gun14, 0.8923F, 0.0F, 0.0F);
		gun14.cubeList.add(new ModelBox(gun14, 96, 20, -0.001F, 0.0F, 0.0F, 3, 3, 3, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-3.5F, -34.0F, -24.5F);
		gun.addChild(gun12);
		

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-3.5F, -34.0F, -13.5F);
		gun.addChild(gun6);
		gun6.cubeList.add(new ModelBox(gun6, 54, 0, 0.0F, 0.0F, 0.0F, 4, 3, 10, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-2.0F, -31.0F, -8.0F);
		gun.addChild(gun2);
		setRotationAngle(gun2, -0.5205F, 0.0F, 0.0F);
		gun2.cubeList.add(new ModelBox(gun2, 0, 0, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
