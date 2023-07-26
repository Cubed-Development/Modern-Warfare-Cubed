package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SSG08BoltAction1 extends ModelBase {
	private final ModelRenderer bolt_action_1;
	private final ModelRenderer Innerslide;
	private final ModelRenderer bone147;
	private final ModelRenderer the_part_you_grab;
	private final ModelRenderer thebackpart;
	private final ModelRenderer bone153;
	private final ModelRenderer bone152;
	private final ModelRenderer bone154;
	private final ModelRenderer bone155;
	private final ModelRenderer bone194;
	private final ModelRenderer bone195;
	private final ModelRenderer bone196;
	private final ModelRenderer bone197;
	private final ModelRenderer bone198;
	private final ModelRenderer bone199;
	private final ModelRenderer bone212;
	private final ModelRenderer bone213;
	private final ModelRenderer bone214;
	private final ModelRenderer bone164;
	private final ModelRenderer bone165;
	private final ModelRenderer bone166;
	private final ModelRenderer bone167;
	private final ModelRenderer bone204;
	private final ModelRenderer bone205;
	private final ModelRenderer bone206;
	private final ModelRenderer bone160;
	private final ModelRenderer bone161;
	private final ModelRenderer bone162;
	private final ModelRenderer bone163;
	private final ModelRenderer bone172;
	private final ModelRenderer bone173;
	private final ModelRenderer bone174;
	private final ModelRenderer bone175;
	private final ModelRenderer bone184;
	private final ModelRenderer bone185;
	private final ModelRenderer bone186;
	private final ModelRenderer bone187;
	private final ModelRenderer bone188;
	private final ModelRenderer bone189;
	private final ModelRenderer bone190;
	private final ModelRenderer bone191;
	private final ModelRenderer bone176;
	private final ModelRenderer bone177;
	private final ModelRenderer bone178;
	private final ModelRenderer bone179;

	public SSG08BoltAction1() {
		textureWidth = 310;
		textureHeight = 310;

		bolt_action_1 = new ModelRenderer(this);
		bolt_action_1.setRotationPoint(1.0F, -14.25F, -37.0F);
		

		Innerslide = new ModelRenderer(this);
		Innerslide.setRotationPoint(0.0F, 0.0F, 22.0F);
		bolt_action_1.addChild(Innerslide);
		Innerslide.cubeList.add(new ModelBox(Innerslide, 200, 21, -4.0F, -0.5F, -13.0F, 3, 1, 17, 0.0F, false));

		bone147 = new ModelRenderer(this);
		bone147.setRotationPoint(-1.0F, -0.5F, -13.0F);
		Innerslide.addChild(bone147);
		setRotationAngle(bone147, 0.0F, 0.0F, -0.7854F);
		bone147.cubeList.add(new ModelBox(bone147, 88, 38, -2.1213F, -2.1213F, 0.0F, 1, 1, 16, 0.0F, false));
		bone147.cubeList.add(new ModelBox(bone147, 0, 86, -1.0F, -1.0F, 0.0F, 1, 1, 17, 0.0F, false));
		bone147.cubeList.add(new ModelBox(bone147, 88, 18, -1.7F, -2.121F, 0.0F, 1, 1, 16, 0.0F, false));
		bone147.cubeList.add(new ModelBox(bone147, 0, 57, -0.9929F, -1.4139F, 0.0F, 1, 1, 17, 0.0F, false));

		the_part_you_grab = new ModelRenderer(this);
		the_part_you_grab.setRotationPoint(-1.75F, 0.0F, 30.0F);
		bolt_action_1.addChild(the_part_you_grab);
		

		thebackpart = new ModelRenderer(this);
		thebackpart.setRotationPoint(0.75F, -1.0F, 15.75F);
		the_part_you_grab.addChild(thebackpart);
		

		bone153 = new ModelRenderer(this);
		bone153.setRotationPoint(0.0F, 39.5F, -8.75F);
		thebackpart.addChild(bone153);
		

		bone152 = new ModelRenderer(this);
		bone152.setRotationPoint(-1.5F, -40.0F, -11.75F);
		bone153.addChild(bone152);
		setRotationAngle(bone152, -0.1745F, 0.0F, 0.0F);
		bone152.cubeList.add(new ModelBox(bone152, 79, 76, -0.5F, -0.5792F, 0.4056F, 1, 1, 1, 0.0F, false));

		bone154 = new ModelRenderer(this);
		bone154.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone152.addChild(bone154);
		setRotationAngle(bone154, -0.1745F, 0.0F, 0.0F);
		bone154.cubeList.add(new ModelBox(bone154, 79, 5, -0.5F, -0.8145F, 1.2836F, 1, 1, 1, 0.0F, false));

		bone155 = new ModelRenderer(this);
		bone155.setRotationPoint(0.0F, -0.3145F, 1.7836F);
		bone154.addChild(bone155);
		setRotationAngle(bone155, -0.3054F, 0.0F, 0.0F);
		bone155.cubeList.add(new ModelBox(bone155, 78, 56, -0.5F, -0.6272F, 0.3265F, 1, 1, 1, 0.0F, false));

		bone194 = new ModelRenderer(this);
		bone194.setRotationPoint(0.0F, -0.3145F, 1.7836F);
		bone154.addChild(bone194);
		setRotationAngle(bone194, -0.5236F, 0.0F, 0.0F);
		bone194.cubeList.add(new ModelBox(bone194, 78, 14, -0.5F, -0.8995F, 1.1593F, 1, 1, 1, 0.0F, false));

		bone195 = new ModelRenderer(this);
		bone195.setRotationPoint(0.0F, -0.714F, 3.443F);
		bone154.addChild(bone195);
		setRotationAngle(bone195, -0.9599F, 0.0F, 0.0F);
		bone195.cubeList.add(new ModelBox(bone195, 40, 78, -0.5F, -0.1394F, 0.9523F, 1, 1, 1, 0.0F, false));

		bone196 = new ModelRenderer(this);
		bone196.setRotationPoint(-0.5F, 19.5F, -14.625F);
		thebackpart.addChild(bone196);
		setRotationAngle(bone196, 0.0F, 0.0F, -0.3927F);
		bone196.cubeList.add(new ModelBox(bone196, 34, 78, 5.4928F, -19.4571F, -6.375F, 1, 1, 1, 0.0F, false));

		bone197 = new ModelRenderer(this);
		bone197.setRotationPoint(-0.75F, -20.0F, -5.875F);
		bone196.addChild(bone197);
		setRotationAngle(bone197, -0.1745F, 0.0F, 0.0F);
		bone197.cubeList.add(new ModelBox(bone197, 76, 17, 6.2428F, 0.4478F, 0.5867F, 1, 1, 1, 0.0F, false));

		bone198 = new ModelRenderer(this);
		bone198.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone197.addChild(bone198);
		setRotationAngle(bone198, -0.1745F, 0.0F, 0.0F);
		bone198.cubeList.add(new ModelBox(bone198, 75, 35, 6.2428F, 0.1655F, 1.6403F, 1, 1, 1, 0.0F, false));

		bone199 = new ModelRenderer(this);
		bone199.setRotationPoint(0.0F, -0.3145F, 1.7836F);
		bone198.addChild(bone199);
		setRotationAngle(bone199, -0.3054F, 0.0F, 0.0F);
		bone199.cubeList.add(new ModelBox(bone199, 75, 28, 6.2428F, 0.2445F, 0.9614F, 1, 1, 1, 0.0F, false));

		bone212 = new ModelRenderer(this);
		bone212.setRotationPoint(2.7464F, 20.0214F, -14.625F);
		thebackpart.addChild(bone212);
		setRotationAngle(bone212, 0.0F, 0.0F, -1.1781F);
		

		bone213 = new ModelRenderer(this);
		bone213.setRotationPoint(-3.9964F, -20.5214F, -5.875F);
		bone212.addChild(bone213);
		setRotationAngle(bone213, -0.1745F, 0.0F, 0.0F);
		

		bone214 = new ModelRenderer(this);
		bone214.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone213.addChild(bone214);
		setRotationAngle(bone214, -0.1745F, 0.0F, 0.0F);
		bone214.cubeList.add(new ModelBox(bone214, 75, 5, 19.6F, 6.6067F, 3.9847F, 1, 1, 1, 0.0F, false));

		bone164 = new ModelRenderer(this);
		bone164.setRotationPoint(-1.0F, 19.5F, -14.625F);
		thebackpart.addChild(bone164);
		setRotationAngle(bone164, 0.0F, 0.0F, 0.3927F);
		

		bone165 = new ModelRenderer(this);
		bone165.setRotationPoint(-0.75F, -20.0F, -5.875F);
		bone164.addChild(bone165);
		setRotationAngle(bone165, -0.1745F, 0.0F, 0.0F);
		bone165.cubeList.add(new ModelBox(bone165, 74, 56, -7.1286F, 1.0131F, 0.6863F, 1, 1, 1, 0.0F, false));

		bone166 = new ModelRenderer(this);
		bone166.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone165.addChild(bone166);
		setRotationAngle(bone166, -0.1745F, 0.0F, 0.0F);
		bone166.cubeList.add(new ModelBox(bone166, 72, 34, -7.1286F, 0.7049F, 1.8367F, 1, 1, 1, 0.0F, false));

		bone167 = new ModelRenderer(this);
		bone167.setRotationPoint(0.0F, -0.3145F, 1.7836F);
		bone166.addChild(bone167);
		setRotationAngle(bone167, -0.3054F, 0.0F, 0.0F);
		bone167.cubeList.add(new ModelBox(bone167, 72, 17, -7.1286F, 0.6945F, 1.3108F, 1, 1, 1, 0.0F, false));

		bone204 = new ModelRenderer(this);
		bone204.setRotationPoint(-4.1893F, 20.3084F, -14.625F);
		thebackpart.addChild(bone204);
		setRotationAngle(bone204, 0.0F, 0.0F, 1.1781F);
		

		bone205 = new ModelRenderer(this);
		bone205.setRotationPoint(2.4393F, -20.8084F, -5.875F);
		bone204.addChild(bone205);
		setRotationAngle(bone205, -0.1745F, 0.0F, 0.0F);
		bone205.cubeList.add(new ModelBox(bone205, 71, 28, -20.01F, 8.7895F, 2.0575F, 1, 1, 1, 0.0F, false));

		bone206 = new ModelRenderer(this);
		bone206.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone205.addChild(bone206);
		setRotationAngle(bone206, -0.1745F, 0.0F, 0.0F);
		bone206.cubeList.add(new ModelBox(bone206, 71, 23, -19.92F, 8.125F, 4.5374F, 1, 1, 1, 0.0F, false));

		bone160 = new ModelRenderer(this);
		bone160.setRotationPoint(-20.25F, 1.5F, -14.625F);
		thebackpart.addChild(bone160);
		setRotationAngle(bone160, 0.0F, 0.0F, 1.5708F);
		

		bone161 = new ModelRenderer(this);
		bone161.setRotationPoint(-0.75F, -20.0F, -5.875F);
		bone160.addChild(bone161);
		setRotationAngle(bone161, -0.1745F, 0.0F, 0.0F);
		

		bone162 = new ModelRenderer(this);
		bone162.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone161.addChild(bone162);
		setRotationAngle(bone162, -0.1745F, 0.0F, 0.0F);
		

		bone163 = new ModelRenderer(this);
		bone163.setRotationPoint(0.0F, -0.3145F, 1.7836F);
		bone162.addChild(bone163);
		setRotationAngle(bone163, -0.5672F, 0.0F, 0.0F);
		

		bone172 = new ModelRenderer(this);
		bone172.setRotationPoint(-20.25F, 2.0F, -14.125F);
		thebackpart.addChild(bone172);
		setRotationAngle(bone172, 0.0F, 0.0F, 1.5708F);
		bone172.cubeList.add(new ModelBox(bone172, 71, 21, -1.45F, -20.501F, -5.875F, 1, 1, 1, 0.0F, false));

		bone173 = new ModelRenderer(this);
		bone173.setRotationPoint(-0.75F, -20.0F, -5.875F);
		bone172.addChild(bone173);
		setRotationAngle(bone173, -0.1745F, 0.0F, 0.0F);
		bone173.cubeList.add(new ModelBox(bone173, 39, 70, -0.6F, -0.5792F, 0.4056F, 1, 1, 1, 0.0F, false));

		bone174 = new ModelRenderer(this);
		bone174.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone173.addChild(bone174);
		setRotationAngle(bone174, -0.1745F, 0.0F, 0.0F);
		bone174.cubeList.add(new ModelBox(bone174, 32, 70, -0.5F, -0.8145F, 1.2836F, 1, 1, 1, 0.0F, false));

		bone175 = new ModelRenderer(this);
		bone175.setRotationPoint(0.0F, -0.3145F, 1.7836F);
		bone174.addChild(bone175);
		setRotationAngle(bone175, -0.5672F, 0.0F, 0.0F);
		bone175.cubeList.add(new ModelBox(bone175, 19, 70, -0.3F, -0.6903F, 0.153F, 1, 1, 1, 0.0F, false));

		bone184 = new ModelRenderer(this);
		bone184.setRotationPoint(-20.25F, 2.5F, -13.625F);
		thebackpart.addChild(bone184);
		setRotationAngle(bone184, 0.0F, 0.0F, 1.5708F);
		

		bone185 = new ModelRenderer(this);
		bone185.setRotationPoint(-0.75F, -20.0F, -5.875F);
		bone184.addChild(bone185);
		setRotationAngle(bone185, -0.1745F, 0.0F, 0.0F);
		

		bone186 = new ModelRenderer(this);
		bone186.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone185.addChild(bone186);
		setRotationAngle(bone186, -0.1745F, 0.0F, 0.0F);
		

		bone187 = new ModelRenderer(this);
		bone187.setRotationPoint(0.0F, -0.3145F, 1.7836F);
		bone186.addChild(bone187);
		setRotationAngle(bone187, -0.5672F, 0.0F, 0.0F);
		

		bone188 = new ModelRenderer(this);
		bone188.setRotationPoint(-20.25F, 2.5F, -13.625F);
		thebackpart.addChild(bone188);
		setRotationAngle(bone188, 0.0F, 0.0F, 1.5708F);
		

		bone189 = new ModelRenderer(this);
		bone189.setRotationPoint(-0.75F, -20.0F, -5.875F);
		bone188.addChild(bone189);
		setRotationAngle(bone189, -0.1745F, 0.0F, 0.0F);
		

		bone190 = new ModelRenderer(this);
		bone190.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone189.addChild(bone190);
		setRotationAngle(bone190, -0.1745F, 0.0F, 0.0F);
		

		bone191 = new ModelRenderer(this);
		bone191.setRotationPoint(0.0F, -0.3145F, 1.7836F);
		bone190.addChild(bone191);
		setRotationAngle(bone191, -0.5672F, 0.0F, 0.0F);
		

		bone176 = new ModelRenderer(this);
		bone176.setRotationPoint(17.25F, 0.5F, -14.125F);
		thebackpart.addChild(bone176);
		setRotationAngle(bone176, 0.0F, 0.0F, -1.5708F);
		

		bone177 = new ModelRenderer(this);
		bone177.setRotationPoint(-0.75F, -20.0F, -5.875F);
		bone176.addChild(bone177);
		setRotationAngle(bone177, -0.1745F, 0.0F, 0.0F);
		bone177.cubeList.add(new ModelBox(bone177, 68, 34, -0.5F, -0.5792F, 0.4056F, 1, 1, 1, 0.0F, false));

		bone178 = new ModelRenderer(this);
		bone178.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone177.addChild(bone178);
		setRotationAngle(bone178, -0.1745F, 0.0F, 0.0F);
		bone178.cubeList.add(new ModelBox(bone178, 68, 17, -0.5F, -0.8145F, 1.2836F, 1, 1, 1, 0.0F, false));

		bone179 = new ModelRenderer(this);
		bone179.setRotationPoint(0.0F, -0.3145F, 1.7836F);
		bone178.addChild(bone179);
		setRotationAngle(bone179, -0.5672F, 0.0F, 0.0F);
		bone179.cubeList.add(new ModelBox(bone179, 39, 68, -0.7F, -0.6903F, 0.153F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bolt_action_1.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}