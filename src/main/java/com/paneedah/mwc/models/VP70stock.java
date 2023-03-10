package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class VP70stock extends ModelWithAttachments {
	private final ModelRenderer slide;
	private final ModelRenderer gun14_r1;
	private final ModelRenderer gun13_r1;
	private final ModelRenderer gun16_r1;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer gun17_r1;
	private final ModelRenderer gun16_r2;
	private final ModelRenderer gun16_r3;
	private final ModelRenderer gun15_r2;
	private final ModelRenderer gun17_r2;
	private final ModelRenderer gun16_r4;
	private final ModelRenderer gun15_r3;
	private final ModelRenderer gun14_r2;
	private final ModelRenderer gun13_r2;
	private final ModelRenderer gun17_r3;
	private final ModelRenderer gun15_r4;
	private final ModelRenderer gun15_r5;
	private final ModelRenderer gun20_r1;
	private final ModelRenderer gun16_r5;
	private final ModelRenderer gun15_r6;
	private final ModelRenderer gun14_r3;
	private final ModelRenderer gun13_r3;
	private final ModelRenderer gun14_r4;
	private final ModelRenderer slide56_r1;
	private final ModelRenderer slide58_r1;
	private final ModelRenderer slide57_r1;
	private final ModelRenderer slide56_r2;
	private final ModelRenderer slide58_r2;
	private final ModelRenderer slide58_r3;
	private final ModelRenderer slide56_r3;
	private final ModelRenderer slide56_r4;
	private final ModelRenderer slide56_r5;
	private final ModelRenderer slide58_r4;
	private final ModelRenderer slide57_r2;
	private final ModelRenderer slide57_r3;
	private final ModelRenderer slide56_r6;
	private final ModelRenderer slide56_r7;
	private final ModelRenderer slide55_r1;
	private final ModelRenderer slide56_r8;
	private final ModelRenderer slide57_r4;
	private final ModelRenderer bone;
	private final ModelRenderer slide58_r5;
	private final ModelRenderer slide57_r5;
	private final ModelRenderer bone3;
	private final ModelRenderer slide59_r1;
	private final ModelRenderer slide58_r6;
	private final ModelRenderer bone2;
	private final ModelRenderer gun15_r7;
	private final ModelRenderer slide2;
	private final ModelRenderer gun18_r1;
	private final ModelRenderer gun17_r4;
	private final ModelRenderer gun18_r2;
	private final ModelRenderer gun16_r6;
	private final ModelRenderer gun15_r8;
	private final ModelRenderer gun14_r5;
	private final ModelRenderer gun18_r3;
	private final ModelRenderer gun16_r7;
	private final ModelRenderer gun16_r8;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun16_r9;
	private final ModelRenderer gun16_r10;
	private final ModelRenderer gun17_r5;
	private final ModelRenderer gun16_r11;
	private final ModelRenderer gun15_r9;
	private final ModelRenderer gun15_r10;
	private final ModelRenderer gun16_r12;
	private final ModelRenderer gun15_r11;
	private final ModelRenderer slide57_r6;
	private final ModelRenderer slide59_r2;
	private final ModelRenderer slide58_r7;
	private final ModelRenderer slide59_r3;
	private final ModelRenderer slide57_r7;
	private final ModelRenderer bone8;
	private final ModelRenderer gun16_r13;
	private final ModelRenderer gun;
	private final ModelRenderer gun4_r1;
	private final ModelRenderer gun2_r1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun4_r2;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun10_r1;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun11_r2;
	private final ModelRenderer gun10_r2;
	private final ModelRenderer gun10_r3;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun5_r2;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun5_r3;
	private final ModelRenderer gun5_r4;
	private final ModelRenderer gun6_r2;
	private final ModelRenderer gun11_r3;
	private final ModelRenderer gun13_r4;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun12_r2;
	private final ModelRenderer gun13_r5;
	private final ModelRenderer gun12_r3;
	private final ModelRenderer gun3_r2;
	private final ModelRenderer gun3_r3;
	private final ModelRenderer gun3_r4;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun6_r3;
	private final ModelRenderer gun6_r4;
	private final ModelRenderer gun3_r5;
	private final ModelRenderer gun12_r4;
	private final ModelRenderer gun14_r6;
	private final ModelRenderer gun13_r6;
	private final ModelRenderer gun13_r7;
	private final ModelRenderer gun14_r7;
	private final ModelRenderer gun13_r8;
	private final ModelRenderer gun4_r3;
	private final ModelRenderer gun4_r4;
	private final ModelRenderer gun12_r5;
	private final ModelRenderer gun11_r4;
	private final ModelRenderer gun13_r9;
	private final ModelRenderer gun12_r6;
	private final ModelRenderer gun13_r10;
	private final ModelRenderer gun33_r1;
	private final ModelRenderer gun41_r1;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun42_r1;
	private final ModelRenderer gun41_r2;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun62_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun62_r2;
	private final ModelRenderer gun61_r1;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer gun18_r4;
	private final ModelRenderer gun19_r1;
	private final ModelRenderer gun21_r2;
	private final QRenderer stock;
	private final ModelRenderer gun19_r2;
	private final ModelRenderer gun18_r5;
	private final ModelRenderer gun18_r6;
	private final ModelRenderer gun17_r6;
	private final ModelRenderer gun18_r7;
	private final ModelRenderer gun17_r7;
	private final ModelRenderer gun17_r8;
	private final ModelRenderer gun16_r14;
	private final ModelRenderer gun20_r2;
	private final ModelRenderer gun19_r3;
	private final ModelRenderer gun18_r8;
	private final ModelRenderer gun17_r9;
	private final ModelRenderer gun18_r9;
	private final ModelRenderer gun17_r10;
	private final ModelRenderer gun18_r10;
	private final ModelRenderer gun18_r11;
	private final ModelRenderer gun17_r11;
	private final ModelRenderer gun18_r12;
	private final ModelRenderer gun18_r13;
	private final ModelRenderer gun14_r8;
	private final ModelRenderer bone6;
	private final ModelRenderer gun16_r15;
	private final ModelRenderer gun18_r14;
	private final ModelRenderer gun20_r3;
	private final ModelRenderer gun20_r4;
	private final ModelRenderer gun19_r4;
	private final ModelRenderer gun19_r5;
	private final ModelRenderer gun17_r12;
	private final ModelRenderer gun18_r15;
	private final ModelRenderer gun17_r13;
	private final ModelRenderer gun17_r14;
	private final ModelRenderer gun16_r16;
	private final ModelRenderer gun15_r12;
	private final ModelRenderer bone7;
	private final ModelRenderer gun17_r15;
	private final ModelRenderer gun19_r6;
	private final ModelRenderer gun18_r16;
	private final ModelRenderer gun16_r17;
	private final ModelRenderer mag;
	private final ModelRenderer gun5_r5;

	public VP70stock() {
		textureWidth = 180;
		textureHeight = 180;

		slide = new ModelRenderer(this);
		slide.setRotationPoint(0.0F, 24.0F, 0.0F);
		slide.cubeList.add(new ModelBox(slide, 100, 75, -1.249F, -38.075F, 0.375F, 1, 1, 2, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 80, 100, -1.749F, -38.075F, 0.375F, 1, 1, 2, 0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 60, 100, 0.8F, -37.05F, -24.05F, 1, 1, 2, -0.301F, false));
		slide.cubeList.add(new ModelBox(slide, 17, 108, 0.3403F, -34.9415F, -26.25F, 1, 1, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 32, 79, 0.3403F, -36.9415F, -27.25F, 1, 2, 4, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 21, 108, 0.3403F, -36.9415F, -28.25F, 1, 1, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 80, 0, 0.3402F, -35.1165F, -25.925F, 1, 2, 4, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 84, 48, -3.498F, -36.75F, 2.625F, 5, 1, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 80, 73, -3.497F, -36.05F, 2.625F, 5, 1, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 72, 48, -3.499F, -36.05F, -7.0F, 5, 1, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 38, 48, -3.5F, -36.75F, -7.0F, 5, 1, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 63, 66, -1.749F, -38.251F, -27.824F, 1, 1, 29, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 32, 65, -1.249F, -38.25F, -27.825F, 1, 1, 29, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 45, 24, -1.5F, -38.0F, -28.75F, 1, 3, 1, -0.002F, false));
		slide.cubeList.add(new ModelBox(slide, 107, 17, -1.5F, -35.5F, -28.75F, 1, 1, 1, -0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 112, 29, 0.501F, -36.75F, -23.0F, 1, 2, 16, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 20, 44, -3.498F, -36.75F, -11.25F, 1, 2, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 60, 0, -3.499F, -36.75F, -11.0F, 1, 2, 4, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 22, 135, -3.499F, -36.75F, -23.25F, 1, 2, 7, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 134, 128, 0.3402F, -36.9415F, -6.25F, 1, 1, 9, -0.002F, false));
		slide.cubeList.add(new ModelBox(slide, 134, 47, 0.3403F, -36.1915F, -6.25F, 1, 1, 9, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 34, 125, 0.3653F, -35.1915F, -7.0F, 1, 1, 10, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 0, 96, -0.1F, -34.85F, -7.475F, 2, 1, 11, -0.4F, false));
		slide.cubeList.add(new ModelBox(slide, 0, 96, 0.626F, -34.25F, -22.0F, 1, 1, 27, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 29, 108, 0.625F, -34.25F, -22.5F, 1, 1, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 60, 32, -3.5F, -35.25F, -22.0F, 5, 1, 15, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 93, 13, -3.5F, -36.25F, -16.25F, 1, 1, 5, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 32, 91, -3.498F, -35.25F, 3.0F, 5, 1, 2, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 123, 11, -0.1F, -35.65F, -6.975F, 2, 1, 10, -0.4F, false));

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(-1.0F, -34.6287F, -17.6642F);
		slide.addChild(gun14_r1);
		setRotationAngle(gun14_r1, 0.7854F, 0.0F, 0.0F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 44, 91, -2.499F, -0.5F, 1.5F, 1, 1, 1, 0.0F, false));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(-0.998F, -34.6287F, -12.6642F);
		slide.addChild(gun13_r1);
		setRotationAngle(gun13_r1, 0.7854F, 0.0F, 0.0F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 93, 16, -2.499F, -0.5F, 1.5F, 1, 1, 1, 0.0F, false));

		gun16_r1 = new ModelRenderer(this);
		gun16_r1.setRotationPoint(-1.0F, -36.5F, -28.25F);
		slide.addChild(gun16_r1);
		setRotationAngle(gun16_r1, 0.0F, 0.0F, -0.6458F);
		gun16_r1.cubeList.add(new ModelBox(gun16_r1, 0, 24, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(-1.0F, -36.5F, -28.25F);
		slide.addChild(gun15_r1);
		setRotationAngle(gun15_r1, 0.0F, 0.0F, 0.6458F);
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 40, 36, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.001F, false));

		gun17_r1 = new ModelRenderer(this);
		gun17_r1.setRotationPoint(1.0869F, -35.7814F, -27.3358F);
		slide.addChild(gun17_r1);
		setRotationAngle(gun17_r1, 0.7854F, 0.0F, -1.2392F);
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 107, 19, -0.5F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun16_r2 = new ModelRenderer(this);
		gun16_r2.setRotationPoint(-1.0F, -36.5F, -28.25F);
		slide.addChild(gun16_r2);
		setRotationAngle(gun16_r2, 0.0F, 0.0F, -1.2392F);
		gun16_r2.cubeList.add(new ModelBox(gun16_r2, 6, 24, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.002F, false));

		gun16_r3 = new ModelRenderer(this);
		gun16_r3.setRotationPoint(0.2525F, -36.907F, -28.067F);
		slide.addChild(gun16_r3);
		setRotationAngle(gun16_r3, 0.5236F, 0.0F, 1.2566F);
		gun16_r3.cubeList.add(new ModelBox(gun16_r3, 107, 21, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun15_r2 = new ModelRenderer(this);
		gun15_r2.setRotationPoint(-1.0F, -36.5F, -28.25F);
		slide.addChild(gun15_r2);
		setRotationAngle(gun15_r2, 0.0F, 0.0F, 1.2566F);
		gun15_r2.cubeList.add(new ModelBox(gun15_r2, 39, 24, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		gun17_r2 = new ModelRenderer(this);
		gun17_r2.setRotationPoint(-0.4077F, -35.0183F, -28.0623F);
		slide.addChild(gun17_r2);
		setRotationAngle(gun17_r2, -0.3243F, -0.1945F, -0.6749F);
		gun17_r2.cubeList.add(new ModelBox(gun17_r2, 5, 96, -0.25F, -0.55F, -0.55F, 1, 1, 2, 0.0F, false));

		gun16_r4 = new ModelRenderer(this);
		gun16_r4.setRotationPoint(-1.0F, -35.0F, -28.25F);
		slide.addChild(gun16_r4);
		setRotationAngle(gun16_r4, -0.3054F, 0.0F, 0.0F);
		gun16_r4.cubeList.add(new ModelBox(gun16_r4, 107, 15, -0.5F, -0.4F, 0.0F, 1, 1, 1, 0.0F, false));

		gun15_r3 = new ModelRenderer(this);
		gun15_r3.setRotationPoint(1.2182F, -34.8196F, -23.1558F);
		slide.addChild(gun15_r3);
		setRotationAngle(gun15_r3, 0.5299F, 0.7119F, 0.3655F);
		gun15_r3.cubeList.add(new ModelBox(gun15_r3, 29, 105, -0.5002F, -2.275F, -0.5F, 1, 2, 1, -0.3F, false));

		gun14_r2 = new ModelRenderer(this);
		gun14_r2.setRotationPoint(0.7939F, -35.0967F, -23.2706F);
		slide.addChild(gun14_r2);
		setRotationAngle(gun14_r2, 0.5299F, 0.7119F, 0.3655F);
		gun14_r2.cubeList.add(new ModelBox(gun14_r2, 46, 36, -0.5F, -1.025F, -0.5F, 1, 3, 1, 0.0F, false));

		gun13_r2 = new ModelRenderer(this);
		gun13_r2.setRotationPoint(1.001F, -35.2881F, -22.8087F);
		slide.addChild(gun13_r2);
		setRotationAngle(gun13_r2, 0.3927F, 0.0F, 0.0F);
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 60, 0, -0.501F, -1.35F, -0.5F, 1, 3, 1, 0.0F, false));

		gun17_r3 = new ModelRenderer(this);
		gun17_r3.setRotationPoint(0.5125F, -37.4613F, 2.4326F);
		slide.addChild(gun17_r3);
		setRotationAngle(gun17_r3, 0.6109F, 0.0F, -0.6981F);
		gun17_r3.cubeList.add(new ModelBox(gun17_r3, 80, 107, -0.5F, 0.35F, -0.5F, 1, 1, 1, -0.197F, false));
		gun17_r3.cubeList.add(new ModelBox(gun17_r3, 90, 107, -0.5F, -0.075F, -0.5F, 1, 1, 1, -0.198F, false));

		gun15_r4 = new ModelRenderer(this);
		gun15_r4.setRotationPoint(0.7011F, -37.3922F, 1.7915F);
		slide.addChild(gun15_r4);
		setRotationAngle(gun15_r4, 0.6109F, 0.0F, -0.6981F);
		gun15_r4.cubeList.add(new ModelBox(gun15_r4, 108, 66, -0.5F, 0.9F, 0.225F, 1, 1, 1, -0.299F, false));

		gun15_r5 = new ModelRenderer(this);
		gun15_r5.setRotationPoint(0.7966F, -36.8116F, -10.0F);
		slide.addChild(gun15_r5);
		setRotationAngle(gun15_r5, 0.0F, 0.0F, -0.6981F);
		gun15_r5.cubeList.add(new ModelBox(gun15_r5, 60, 0, -0.4999F, -0.75F, -18.25F, 1, 1, 31, 0.0F, false));
		gun15_r5.cubeList.add(new ModelBox(gun15_r5, 50, 96, -0.5001F, -0.5F, -14.0F, 1, 1, 18, 0.0F, false));

		gun20_r1 = new ModelRenderer(this);
		gun20_r1.setRotationPoint(1.3601F, -36.7623F, -15.6F);
		slide.addChild(gun20_r1);
		setRotationAngle(gun20_r1, 0.0F, 0.0F, -0.6981F);
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 88, 89, -0.5F, -0.7F, 17.825F, 1, 1, 1, -0.4F, false));
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 106, 35, -0.5F, -0.5F, 17.825F, 1, 1, 1, -0.4F, false));
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 106, 91, -0.5F, -0.5F, 17.875F, 1, 1, 1, -0.401F, false));
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 93, 106, -0.5F, -0.5F, 18.075F, 1, 1, 1, -0.4F, false));
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 107, 13, -0.5F, -0.5F, 18.275F, 1, 1, 1, -0.4F, false));
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 84, 107, -0.5F, -0.5F, 18.475F, 1, 1, 1, -0.4F, false));

		gun16_r5 = new ModelRenderer(this);
		gun16_r5.setRotationPoint(-0.2704F, -37.7838F, 1.9589F);
		slide.addChild(gun16_r5);
		setRotationAngle(gun16_r5, 0.0F, -0.3403F, 0.3927F);
		gun16_r5.cubeList.add(new ModelBox(gun16_r5, 99, 107, -0.15F, -0.5F, -0.375F, 1, 1, 1, -0.2F, false));
		gun16_r5.cubeList.add(new ModelBox(gun16_r5, 103, 107, 0.125F, -0.5F, -0.375F, 1, 1, 1, -0.202F, false));

		gun15_r6 = new ModelRenderer(this);
		gun15_r6.setRotationPoint(0.3755F, -37.1915F, -12.85F);
		slide.addChild(gun15_r6);
		setRotationAngle(gun15_r6, 0.0F, 0.0F, 0.3927F);
		gun15_r6.cubeList.add(new ModelBox(gun15_r6, 29, 100, -0.5F, -1.0F, 13.925F, 1, 1, 2, -0.401F, false));

		gun14_r3 = new ModelRenderer(this);
		gun14_r3.setRotationPoint(0.0442F, -37.437F, -13.25F);
		slide.addChild(gun14_r3);
		setRotationAngle(gun14_r3, 0.0F, 0.0F, 0.3927F);
		gun14_r3.cubeList.add(new ModelBox(gun14_r3, 25, 91, -0.5F, -0.5F, 14.5F, 1, 1, 1, 0.001F, false));
		gun14_r3.cubeList.add(new ModelBox(gun14_r3, 0, 65, -0.5F, -0.5F, -15.0F, 1, 1, 30, 0.0F, false));

		gun13_r3 = new ModelRenderer(this);
		gun13_r3.setRotationPoint(-0.999F, -37.75F, -26.825F);
		slide.addChild(gun13_r3);
		setRotationAngle(gun13_r3, -0.1309F, 0.0F, 0.0F);
		gun13_r3.cubeList.add(new ModelBox(gun13_r3, 86, 83, -0.751F, -0.501F, -1.4F, 1, 1, 2, 0.0F, false));

		gun14_r4 = new ModelRenderer(this);
		gun14_r4.setRotationPoint(-0.749F, -37.8022F, -27.2216F);
		slide.addChild(gun14_r4);
		setRotationAngle(gun14_r4, -0.1309F, 0.0F, 0.0F);
		gun14_r4.cubeList.add(new ModelBox(gun14_r4, 85, 35, -0.501F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		slide56_r1 = new ModelRenderer(this);
		slide56_r1.setRotationPoint(-1.0F, -35.501F, -27.125F);
		slide.addChild(slide56_r1);
		setRotationAngle(slide56_r1, -0.9163F, 0.0F, 0.0F);
		slide56_r1.cubeList.add(new ModelBox(slide56_r1, 100, 96, 0.35F, -0.5F, 1.625F, 2, 1, 1, 0.0F, false));
		slide56_r1.cubeList.add(new ModelBox(slide56_r1, 60, 6, 0.35F, -0.5F, -1.175F, 2, 1, 3, 0.001F, false));

		slide58_r1 = new ModelRenderer(this);
		slide58_r1.setRotationPoint(0.3316F, -34.6844F, -26.3362F);
		slide.addChild(slide58_r1);
		setRotationAngle(slide58_r1, -0.3069F, -0.3751F, -0.8576F);
		slide58_r1.cubeList.add(new ModelBox(slide58_r1, 20, 96, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		slide57_r1 = new ModelRenderer(this);
		slide57_r1.setRotationPoint(-0.2294F, -34.3026F, -26.535F);
		slide.addChild(slide57_r1);
		setRotationAngle(slide57_r1, -0.4483F, -0.1776F, -0.3521F);
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 21, 99, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		slide56_r2 = new ModelRenderer(this);
		slide56_r2.setRotationPoint(-1.0F, -35.4182F, -27.9272F);
		slide.addChild(slide56_r2);
		setRotationAngle(slide56_r2, -0.48F, 0.0F, 0.0F);
		slide56_r2.cubeList.add(new ModelBox(slide56_r2, 70, 100, -0.5F, 0.0F, 0.75F, 1, 1, 2, 0.0F, false));

		slide58_r2 = new ModelRenderer(this);
		slide58_r2.setRotationPoint(0.812F, -36.5295F, 3.1489F);
		slide.addChild(slide58_r2);
		setRotationAngle(slide58_r2, -0.9102F, 0.3661F, -0.4317F);
		slide58_r2.cubeList.add(new ModelBox(slide58_r2, 100, 91, -1.5F, -0.5001F, -1.025F, 2, 1, 1, 0.0F, false));
		slide58_r2.cubeList.add(new ModelBox(slide58_r2, 74, 107, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		slide58_r3 = new ModelRenderer(this);
		slide58_r3.setRotationPoint(1.749F, -37.3891F, 2.3612F);
		slide.addChild(slide58_r3);
		setRotationAngle(slide58_r3, -0.829F, 0.0F, 0.0F);
		slide58_r3.cubeList.add(new ModelBox(slide58_r3, 99, 72, -3.5F, -0.5001F, -0.5F, 1, 1, 2, 0.001F, false));
		slide58_r3.cubeList.add(new ModelBox(slide58_r3, 99, 79, -2.998F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));

		slide56_r3 = new ModelRenderer(this);
		slide56_r3.setRotationPoint(-0.999F, -35.6565F, 3.9488F);
		slide.addChild(slide56_r3);
		setRotationAngle(slide56_r3, -0.829F, 0.0F, 0.0F);
		slide56_r3.cubeList.add(new ModelBox(slide56_r3, 60, 48, -2.501F, -0.4999F, -1.025F, 5, 1, 1, 0.0F, false));

		slide56_r4 = new ModelRenderer(this);
		slide56_r4.setRotationPoint(-0.999F, -35.6495F, 3.9558F);
		slide.addChild(slide56_r4);
		setRotationAngle(slide56_r4, -0.829F, 0.0F, 0.0F);
		slide56_r4.cubeList.add(new ModelBox(slide56_r4, 46, 91, -2.5F, -0.5F, -1.0F, 5, 1, 2, 0.0F, false));

		slide56_r5 = new ModelRenderer(this);
		slide56_r5.setRotationPoint(0.0255F, -37.1426F, 2.4038F);
		slide.addChild(slide56_r5);
		setRotationAngle(slide56_r5, -1.1427F, 0.6141F, -0.9235F);
		slide56_r5.cubeList.add(new ModelBox(slide56_r5, 70, 107, -0.5F, -0.625F, -0.575F, 1, 1, 1, 0.0F, false));

		slide58_r4 = new ModelRenderer(this);
		slide58_r4.setRotationPoint(-1.995F, -36.4262F, 3.1971F);
		slide.addChild(slide58_r4);
		setRotationAngle(slide58_r4, -1.9403F, -0.659F, 2.1348F);
		slide58_r4.cubeList.add(new ModelBox(slide58_r4, 90, 105, -0.5F, -0.7499F, -0.5F, 1, 1, 1, -0.122F, false));

		slide57_r2 = new ModelRenderer(this);
		slide57_r2.setRotationPoint(-0.005F, -36.4262F, 3.1971F);
		slide.addChild(slide57_r2);
		setRotationAngle(slide57_r2, -1.9403F, 0.659F, -2.1348F);
		slide57_r2.cubeList.add(new ModelBox(slide57_r2, 54, 107, -0.5F, -0.7499F, -0.5F, 1, 1, 1, -0.122F, false));

		slide57_r3 = new ModelRenderer(this);
		slide57_r3.setRotationPoint(-1.6838F, -36.6556F, 2.9868F);
		slide.addChild(slide57_r3);
		setRotationAngle(slide57_r3, -2.2638F, -0.2895F, 2.8105F);
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 80, 105, -0.5F, -0.75F, -0.5F, 1, 1, 1, -0.12F, false));

		slide56_r6 = new ModelRenderer(this);
		slide56_r6.setRotationPoint(-0.3162F, -36.6556F, 2.9868F);
		slide.addChild(slide56_r6);
		setRotationAngle(slide56_r6, -2.2638F, 0.2895F, -2.8105F);
		slide56_r6.cubeList.add(new ModelBox(slide56_r6, 64, 107, -0.5F, -0.75F, -0.5F, 1, 1, 1, -0.12F, false));

		slide56_r7 = new ModelRenderer(this);
		slide56_r7.setRotationPoint(-1.0F, -36.0098F, 3.7549F);
		slide.addChild(slide56_r7);
		setRotationAngle(slide56_r7, -1.5708F, 0.7418F, -1.5708F);
		slide56_r7.cubeList.add(new ModelBox(slide56_r7, 84, 105, -0.5F, -0.5F, -1.5F, 1, 1, 1, 0.0F, false));

		slide55_r1 = new ModelRenderer(this);
		slide55_r1.setRotationPoint(-1.0F, -36.0098F, 3.7549F);
		slide.addChild(slide55_r1);
		setRotationAngle(slide55_r1, -1.5708F, -0.7418F, 1.5708F);
		slide55_r1.cubeList.add(new ModelBox(slide55_r1, 60, 107, -0.5F, -0.5F, -1.5F, 1, 1, 1, 0.0F, false));

		slide56_r8 = new ModelRenderer(this);
		slide56_r8.setRotationPoint(1.7F, -35.6535F, 3.8101F);
		slide.addChild(slide56_r8);
		setRotationAngle(slide56_r8, -0.829F, 0.0F, 0.0F);
		slide56_r8.cubeList.add(new ModelBox(slide56_r8, 52, 142, -3.175F, -0.9465F, -1.75F, 1, 1, 3, -0.3F, false));
		slide56_r8.cubeList.add(new ModelBox(slide56_r8, 29, 96, -3.575F, -1.0001F, -1.75F, 1, 1, 3, -0.298F, false));
		slide56_r8.cubeList.add(new ModelBox(slide56_r8, 0, 96, -3.975F, -1.0001F, -1.75F, 1, 1, 3, -0.298F, false));
		slide56_r8.cubeList.add(new ModelBox(slide56_r8, 15, 96, -2.425F, -1.0001F, -1.75F, 1, 1, 3, -0.298F, false));
		slide56_r8.cubeList.add(new ModelBox(slide56_r8, 39, 96, -2.825F, -1.0001F, -1.75F, 1, 1, 3, -0.298F, false));

		slide57_r4 = new ModelRenderer(this);
		slide57_r4.setRotationPoint(-0.875F, -35.4692F, 3.979F);
		slide.addChild(slide57_r4);
		setRotationAngle(slide57_r4, -0.829F, 0.0F, 0.0F);
		slide57_r4.cubeList.add(new ModelBox(slide57_r4, 74, 105, -0.925F, -1.0001F, -2.35F, 1, 1, 1, -0.3F, false));
		slide57_r4.cubeList.add(new ModelBox(slide57_r4, 70, 105, -0.325F, -1.0001F, -2.35F, 1, 1, 1, -0.3F, false));
		slide57_r4.cubeList.add(new ModelBox(slide57_r4, 64, 105, -0.625F, -1.0F, -2.35F, 1, 1, 1, -0.3F, false));
		slide57_r4.cubeList.add(new ModelBox(slide57_r4, 107, 23, -0.625F, -1.0F, 0.25F, 1, 1, 1, -0.3F, false));
		slide57_r4.cubeList.add(new ModelBox(slide57_r4, 32, 107, -0.925F, -1.0001F, 0.25F, 1, 1, 1, -0.3F, false));
		slide57_r4.cubeList.add(new ModelBox(slide57_r4, 39, 107, -0.325F, -1.0001F, 0.25F, 1, 1, 1, -0.3F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.5F, -37.5427F, 5.4293F);
		slide.addChild(bone);
		setRotationAngle(bone, 3.1416F, 0.0F, 0.0F);
		

		slide58_r5 = new ModelRenderer(this);
		slide58_r5.setRotationPoint(0.995F, -0.956F, -0.876F);
		bone.addChild(slide58_r5);
		setRotationAngle(slide58_r5, -1.9403F, 0.659F, -2.1348F);
		slide58_r5.cubeList.add(new ModelBox(slide58_r5, 50, 107, -1.2677F, -2.6499F, -0.3063F, 1, 1, 1, -0.122F, false));

		slide57_r5 = new ModelRenderer(this);
		slide57_r5.setRotationPoint(0.4725F, -0.8513F, -0.7801F);
		bone.addChild(slide57_r5);
		setRotationAngle(slide57_r5, -2.2638F, 0.2895F, -2.8105F);
		slide57_r5.cubeList.add(new ModelBox(slide57_r5, 43, 107, -1.2126F, -2.6501F, -0.3451F, 1, 1, 1, -0.12F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.5F, -37.5427F, 5.4293F);
		slide.addChild(bone3);
		setRotationAngle(bone3, 3.1416F, 0.0F, 0.0F);
		

		slide59_r1 = new ModelRenderer(this);
		slide59_r1.setRotationPoint(-0.995F, -0.956F, -0.876F);
		bone3.addChild(slide59_r1);
		setRotationAngle(slide59_r1, -1.9403F, -0.659F, 2.1348F);
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 99, 105, -0.1549F, -2.6499F, -1.2126F, 1, 1, 1, -0.122F, false));

		slide58_r6 = new ModelRenderer(this);
		slide58_r6.setRotationPoint(-0.4725F, -0.8513F, -0.7801F);
		bone3.addChild(slide58_r6);
		setRotationAngle(slide58_r6, -2.2638F, -0.2895F, 2.8105F);
		slide58_r6.cubeList.add(new ModelBox(slide58_r6, 103, 105, -0.6937F, -2.6501F, -0.7677F, 1, 1, 1, -0.12F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.599F, -36.85F, 0.35F);
		slide.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 32, 85, 2.499F, 0.0F, 1.0F, 1, 2, 1, -0.4F, false));
		bone2.cubeList.add(new ModelBox(bone2, 38, 85, 2.5F, -0.3F, 0.999F, 1, 2, 1, -0.4F, false));
		bone2.cubeList.add(new ModelBox(bone2, 7, 99, 2.499F, 0.0F, -2.0F, 1, 2, 1, -0.4F, false));
		bone2.cubeList.add(new ModelBox(bone2, 100, 13, 2.5F, -0.3F, -2.001F, 1, 2, 1, -0.4F, false));
		bone2.cubeList.add(new ModelBox(bone2, 93, 13, 2.499F, 0.0F, -1.0F, 1, 2, 1, -0.4F, false));
		bone2.cubeList.add(new ModelBox(bone2, 93, 19, 2.5F, -0.3F, -1.001F, 1, 2, 1, -0.4F, false));
		bone2.cubeList.add(new ModelBox(bone2, 56, 86, 2.499F, 0.0F, 0.0F, 1, 2, 1, -0.4F, false));
		bone2.cubeList.add(new ModelBox(bone2, 87, 6, 2.5F, -0.3F, -0.001F, 1, 2, 1, -0.4F, false));
		bone2.cubeList.add(new ModelBox(bone2, 101, 19, 2.499F, 0.0F, -3.0F, 1, 2, 1, -0.4F, false));
		bone2.cubeList.add(new ModelBox(bone2, 100, 101, 2.5F, -0.3F, -3.001F, 1, 2, 1, -0.4F, false));
		bone2.cubeList.add(new ModelBox(bone2, 102, 35, 2.5F, -0.3F, -4.001F, 1, 2, 1, -0.4F, false));
		bone2.cubeList.add(new ModelBox(bone2, 22, 102, 2.499F, 0.0F, -4.0F, 1, 2, 1, -0.4F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 103, 2.499F, 0.0F, -5.0F, 1, 2, 1, -0.4F, false));
		bone2.cubeList.add(new ModelBox(bone2, 15, 103, 2.5F, -0.3F, -5.001F, 1, 2, 1, -0.4F, false));
		bone2.cubeList.add(new ModelBox(bone2, 19, 104, 2.5F, -0.3F, -6.001F, 1, 2, 1, -0.4F, false));
		bone2.cubeList.add(new ModelBox(bone2, 104, 46, 2.499F, 0.0F, -6.0F, 1, 2, 1, -0.4F, false));

		gun15_r7 = new ModelRenderer(this);
		gun15_r7.setRotationPoint(2.6377F, -0.2953F, -5.501F);
		bone2.addChild(gun15_r7);
		setRotationAngle(gun15_r7, 0.0F, 0.0F, -0.6981F);
		gun15_r7.cubeList.add(new ModelBox(gun15_r7, 4, 104, -0.5001F, -1.0F, -0.5F, 1, 2, 1, -0.4F, false));
		gun15_r7.cubeList.add(new ModelBox(gun15_r7, 102, 68, -0.5001F, -1.0F, 0.5F, 1, 2, 1, -0.4F, false));
		gun15_r7.cubeList.add(new ModelBox(gun15_r7, 7, 102, -0.5001F, -1.0F, 1.5F, 1, 2, 1, -0.4F, false));
		gun15_r7.cubeList.add(new ModelBox(gun15_r7, 100, 98, -0.5001F, -1.0F, 2.5F, 1, 2, 1, -0.4F, false));
		gun15_r7.cubeList.add(new ModelBox(gun15_r7, 44, 96, -0.5001F, -1.0F, 3.5F, 1, 2, 1, -0.4F, false));
		gun15_r7.cubeList.add(new ModelBox(gun15_r7, 86, 0, -0.5001F, -1.0F, 5.5F, 1, 2, 1, -0.4F, false));
		gun15_r7.cubeList.add(new ModelBox(gun15_r7, 88, 66, -0.5001F, -1.0F, 4.5F, 1, 2, 1, -0.4F, false));
		gun15_r7.cubeList.add(new ModelBox(gun15_r7, 80, 83, -0.5001F, -1.0F, 6.5F, 1, 2, 1, -0.4F, false));

		slide2 = new ModelRenderer(this);
		slide2.setRotationPoint(-3.0F, 0.0F, 0.0F);
		slide.addChild(slide2);
		slide2.cubeList.add(new ModelBox(slide2, 84, 16, -0.8F, -37.05F, -24.05F, 1, 1, 2, -0.301F, false));
		slide2.cubeList.add(new ModelBox(slide2, 101, 83, -0.3403F, -34.9415F, -26.25F, 1, 1, 1, 0.0F, false));
		slide2.cubeList.add(new ModelBox(slide2, 63, 77, -0.3403F, -36.9415F, -27.25F, 1, 2, 4, 0.0F, false));
		slide2.cubeList.add(new ModelBox(slide2, 84, 100, -0.3403F, -36.9415F, -28.25F, 1, 1, 1, 0.0F, false));
		slide2.cubeList.add(new ModelBox(slide2, 63, 65, -0.3402F, -35.1165F, -25.925F, 1, 2, 4, 0.0F, false));
		slide2.cubeList.add(new ModelBox(slide2, 132, 94, -0.3402F, -36.9415F, -6.25F, 1, 1, 9, -0.002F, false));
		slide2.cubeList.add(new ModelBox(slide2, 130, 29, -0.3403F, -36.1915F, -6.25F, 1, 1, 9, 0.0F, false));
		slide2.cubeList.add(new ModelBox(slide2, 22, 124, -0.3653F, -35.1915F, -7.0F, 1, 1, 10, 0.0F, false));
		slide2.cubeList.add(new ModelBox(slide2, 94, 79, -0.9F, -34.85F, -7.475F, 2, 1, 11, -0.4F, false));
		slide2.cubeList.add(new ModelBox(slide2, 94, 66, -0.626F, -34.25F, -22.0F, 1, 1, 27, 0.0F, false));
		slide2.cubeList.add(new ModelBox(slide2, 33, 100, -0.625F, -34.25F, -22.5F, 1, 1, 1, 0.0F, false));
		slide2.cubeList.add(new ModelBox(slide2, 123, 0, -0.9F, -35.65F, -6.975F, 2, 1, 10, -0.4F, false));

		gun18_r1 = new ModelRenderer(this);
		gun18_r1.setRotationPoint(-0.0869F, -35.7814F, -27.3358F);
		slide2.addChild(gun18_r1);
		setRotationAngle(gun18_r1, 0.7854F, 0.0F, 1.2392F);
		gun18_r1.cubeList.add(new ModelBox(gun18_r1, 64, 100, -0.5F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun17_r4 = new ModelRenderer(this);
		gun17_r4.setRotationPoint(0.7475F, -36.907F, -28.067F);
		slide2.addChild(gun17_r4);
		setRotationAngle(gun17_r4, 0.5236F, 0.0F, -1.2566F);
		gun17_r4.cubeList.add(new ModelBox(gun17_r4, 74, 100, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun18_r2 = new ModelRenderer(this);
		gun18_r2.setRotationPoint(1.4077F, -35.0183F, -28.0623F);
		slide2.addChild(gun18_r2);
		setRotationAngle(gun18_r2, -0.3243F, 0.1945F, 0.6749F);
		gun18_r2.cubeList.add(new ModelBox(gun18_r2, 44, 41, -0.75F, -0.55F, -0.55F, 1, 1, 2, 0.0F, false));

		gun16_r6 = new ModelRenderer(this);
		gun16_r6.setRotationPoint(-0.2182F, -34.8196F, -23.1558F);
		slide2.addChild(gun16_r6);
		setRotationAngle(gun16_r6, 0.5299F, -0.7119F, -0.3655F);
		gun16_r6.cubeList.add(new ModelBox(gun16_r6, 69, 83, -0.4998F, -2.275F, -0.5F, 1, 2, 1, -0.3F, false));

		gun15_r8 = new ModelRenderer(this);
		gun15_r8.setRotationPoint(0.2061F, -35.0967F, -23.2706F);
		slide2.addChild(gun15_r8);
		setRotationAngle(gun15_r8, 0.5299F, -0.7119F, -0.3655F);
		gun15_r8.cubeList.add(new ModelBox(gun15_r8, 0, 0, -0.5F, -1.025F, -0.5F, 1, 3, 1, 0.0F, false));

		gun14_r5 = new ModelRenderer(this);
		gun14_r5.setRotationPoint(-0.001F, -35.2881F, -22.8087F);
		slide2.addChild(gun14_r5);
		setRotationAngle(gun14_r5, 0.3927F, 0.0F, 0.0F);
		gun14_r5.cubeList.add(new ModelBox(gun14_r5, 6, 0, -0.499F, -1.35F, -0.5F, 1, 3, 1, 0.0F, false));

		gun18_r3 = new ModelRenderer(this);
		gun18_r3.setRotationPoint(0.4875F, -37.4613F, 2.4326F);
		slide2.addChild(gun18_r3);
		setRotationAngle(gun18_r3, 0.6109F, 0.0F, 0.6981F);
		gun18_r3.cubeList.add(new ModelBox(gun18_r3, 101, 88, -0.5F, 0.35F, -0.5F, 1, 1, 1, -0.197F, false));
		gun18_r3.cubeList.add(new ModelBox(gun18_r3, 44, 102, -0.5F, -0.075F, -0.5F, 1, 1, 1, -0.198F, false));

		gun16_r7 = new ModelRenderer(this);
		gun16_r7.setRotationPoint(0.2989F, -37.3922F, 1.7915F);
		slide2.addChild(gun16_r7);
		setRotationAngle(gun16_r7, 0.6109F, 0.0F, 0.6981F);
		gun16_r7.cubeList.add(new ModelBox(gun16_r7, 90, 102, -0.5F, 0.9F, 0.225F, 1, 1, 1, -0.299F, false));

		gun16_r8 = new ModelRenderer(this);
		gun16_r8.setRotationPoint(0.3641F, -37.0031F, -12.75F);
		slide2.addChild(gun16_r8);
		setRotationAngle(gun16_r8, 0.0F, 0.0F, 0.6981F);
		gun16_r8.cubeList.add(new ModelBox(gun16_r8, 60, 16, -0.5F, -0.5F, 1.5F, 1, 1, 14, 0.0F, false));
		gun16_r8.cubeList.add(new ModelBox(gun16_r8, 94, 66, -0.5F, -0.5F, -15.5F, 1, 1, 12, 0.0F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(-0.3601F, -36.7623F, -15.6F);
		slide2.addChild(gun21_r1);
		setRotationAngle(gun21_r1, 0.0F, 0.0F, 0.6981F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 94, 102, -0.5F, -0.7F, 17.825F, 1, 1, 1, -0.401F, false));
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 104, 43, -0.5F, -0.5F, 17.825F, 1, 1, 1, -0.4F, false));
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 23, 105, -0.5F, -0.5F, 17.875F, 1, 1, 1, -0.401F, false));
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 105, 26, -0.5F, -0.5F, 18.075F, 1, 1, 1, -0.4F, false));
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 105, 29, -0.5F, -0.5F, 18.275F, 1, 1, 1, -0.4F, false));
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 33, 105, -0.5F, -0.5F, 18.475F, 1, 1, 1, -0.4F, false));

		gun16_r9 = new ModelRenderer(this);
		gun16_r9.setRotationPoint(0.2034F, -36.8116F, -10.75F);
		slide2.addChild(gun16_r9);
		setRotationAngle(gun16_r9, 0.0F, 0.0F, 0.6981F);
		gun16_r9.cubeList.add(new ModelBox(gun16_r9, 84, 19, -0.4998F, -0.5F, 2.75F, 1, 1, 2, 0.0F, false));

		gun16_r10 = new ModelRenderer(this);
		gun16_r10.setRotationPoint(0.2035F, -36.8116F, -20.25F);
		slide2.addChild(gun16_r10);
		setRotationAngle(gun16_r10, 0.0F, 0.0F, 0.6981F);
		gun16_r10.cubeList.add(new ModelBox(gun16_r10, 70, 105, -0.5F, -0.5F, -4.0F, 1, 1, 8, -0.001F, false));
		gun16_r10.cubeList.add(new ModelBox(gun16_r10, 32, 85, -0.5F, -0.5F, 8.9999F, 1, 1, 4, -0.001F, false));

		gun17_r5 = new ModelRenderer(this);
		gun17_r5.setRotationPoint(1.2704F, -37.7838F, 1.9589F);
		slide2.addChild(gun17_r5);
		setRotationAngle(gun17_r5, 0.0F, 0.3403F, -0.3927F);
		gun17_r5.cubeList.add(new ModelBox(gun17_r5, 105, 37, -0.85F, -0.5F, -0.375F, 1, 1, 1, -0.2F, false));
		gun17_r5.cubeList.add(new ModelBox(gun17_r5, 39, 105, -1.125F, -0.5F, -0.375F, 1, 1, 1, -0.202F, false));

		gun16_r11 = new ModelRenderer(this);
		gun16_r11.setRotationPoint(0.6245F, -37.1915F, -12.85F);
		slide2.addChild(gun16_r11);
		setRotationAngle(gun16_r11, 0.0F, 0.0F, -0.3927F);
		gun16_r11.cubeList.add(new ModelBox(gun16_r11, 84, 23, -0.5F, -1.0F, 13.925F, 1, 1, 2, -0.401F, false));

		gun15_r9 = new ModelRenderer(this);
		gun15_r9.setRotationPoint(0.9558F, -37.437F, -13.25F);
		slide2.addChild(gun15_r9);
		setRotationAngle(gun15_r9, 0.0F, 0.0F, -0.3927F);
		gun15_r9.cubeList.add(new ModelBox(gun15_r9, 43, 105, -0.5F, -0.5F, 14.5F, 1, 1, 1, 0.001F, false));

		gun15_r10 = new ModelRenderer(this);
		gun15_r10.setRotationPoint(0.9558F, -37.437F, -22.25F);
		slide2.addChild(gun15_r10);
		setRotationAngle(gun15_r10, 0.0F, 0.0F, -0.3927F);
		gun15_r10.cubeList.add(new ModelBox(gun15_r10, 93, 13, -0.5F, -0.5F, -6.0F, 1, 1, 12, 0.0F, false));
		gun15_r10.cubeList.add(new ModelBox(gun15_r10, 32, 65, -0.5F, -0.5F, 11.0F, 1, 1, 13, 0.0F, false));

		gun16_r12 = new ModelRenderer(this);
		gun16_r12.setRotationPoint(0.5106F, -36.9279F, -16.4268F);
		slide2.addChild(gun16_r12);
		setRotationAngle(gun16_r12, 0.0F, -0.7854F, -0.3927F);
		gun16_r12.cubeList.add(new ModelBox(gun16_r12, 26, 93, 0.375F, -0.9991F, -1.15F, 1, 1, 1, -0.2F, false));

		gun15_r11 = new ModelRenderer(this);
		gun15_r11.setRotationPoint(0.5106F, -36.9279F, -11.0732F);
		slide2.addChild(gun15_r11);
		setRotationAngle(gun15_r11, 0.0F, 0.7854F, -0.3927F);
		gun15_r11.cubeList.add(new ModelBox(gun15_r11, 100, 16, 0.375F, -0.9991F, 0.15F, 1, 1, 1, -0.2F, false));

		slide57_r6 = new ModelRenderer(this);
		slide57_r6.setRotationPoint(2.0F, -35.501F, -27.125F);
		slide2.addChild(slide57_r6);
		setRotationAngle(slide57_r6, -0.9163F, 0.0F, 0.0F);
		slide57_r6.cubeList.add(new ModelBox(slide57_r6, 93, 26, -2.35F, -0.5F, 1.625F, 2, 1, 1, 0.0F, false));
		slide57_r6.cubeList.add(new ModelBox(slide57_r6, 39, 30, -2.35F, -0.5F, -1.175F, 2, 1, 3, 0.001F, false));

		slide59_r2 = new ModelRenderer(this);
		slide59_r2.setRotationPoint(0.6684F, -34.6844F, -26.3362F);
		slide2.addChild(slide59_r2);
		setRotationAngle(slide59_r2, -0.3069F, 0.3751F, 0.8576F);
		slide59_r2.cubeList.add(new ModelBox(slide59_r2, 84, 26, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		slide58_r7 = new ModelRenderer(this);
		slide58_r7.setRotationPoint(1.2294F, -34.3026F, -26.535F);
		slide2.addChild(slide58_r7);
		setRotationAngle(slide58_r7, -0.4483F, 0.1776F, 0.3521F);
		slide58_r7.cubeList.add(new ModelBox(slide58_r7, 85, 32, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		slide59_r3 = new ModelRenderer(this);
		slide59_r3.setRotationPoint(0.188F, -36.5295F, 3.1489F);
		slide2.addChild(slide59_r3);
		setRotationAngle(slide59_r3, -0.9102F, -0.3661F, 0.4317F);
		slide59_r3.cubeList.add(new ModelBox(slide59_r3, 93, 29, -0.5F, -0.5001F, -1.025F, 2, 1, 1, 0.0F, false));
		slide59_r3.cubeList.add(new ModelBox(slide59_r3, 50, 105, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		slide57_r7 = new ModelRenderer(this);
		slide57_r7.setRotationPoint(0.9745F, -37.1426F, 2.4038F);
		slide2.addChild(slide57_r7);
		setRotationAngle(slide57_r7, -1.1427F, -0.6141F, 0.9235F);
		slide57_r7.cubeList.add(new ModelBox(slide57_r7, 54, 105, -0.5F, -0.625F, -0.575F, 1, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(1.599F, -36.85F, 0.35F);
		slide2.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 80, 66, -2.499F, 0.0F, 1.0F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 80, 0, -2.5F, -0.3F, 0.999F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 57, 79, -2.499F, 0.0F, -2.0F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 49, 79, -2.5F, -0.3F, -2.001F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 32, 79, -2.499F, 0.0F, -1.0F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 69, 77, -2.5F, -0.3F, -1.001F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 41, 74, -2.499F, 0.0F, 0.0F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 69, 71, -2.5F, -0.3F, -0.001F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 63, 71, -2.499F, 0.0F, -3.0F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 70, 41, -2.5F, -0.3F, -3.001F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 69, 65, -2.5F, -0.3F, -4.001F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 40, 65, -2.499F, 0.0F, -4.0F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 32, 65, -2.499F, 0.0F, -5.0F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 26, 65, -2.5F, -0.3F, -5.001F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 60, 41, -2.5F, -0.3F, -6.001F, 1, 2, 1, -0.4F, false));
		bone8.cubeList.add(new ModelBox(bone8, 46, 30, -2.499F, 0.0F, -6.0F, 1, 2, 1, -0.4F, false));

		gun16_r13 = new ModelRenderer(this);
		gun16_r13.setRotationPoint(-1.6377F, -0.2953F, -5.501F);
		bone8.addChild(gun16_r13);
		setRotationAngle(gun16_r13, 0.0F, 0.0F, 0.6981F);
		gun16_r13.cubeList.add(new ModelBox(gun16_r13, 60, 25, -0.4999F, -1.0F, -0.5F, 1, 2, 1, -0.4F, false));
		gun16_r13.cubeList.add(new ModelBox(gun16_r13, 12, 65, -0.4999F, -1.0F, 0.5F, 1, 2, 1, -0.4F, false));
		gun16_r13.cubeList.add(new ModelBox(gun16_r13, 63, 65, -0.4999F, -1.0F, 1.5F, 1, 2, 1, -0.4F, false));
		gun16_r13.cubeList.add(new ModelBox(gun16_r13, 66, 0, -0.4999F, -1.0F, 2.5F, 1, 2, 1, -0.4F, false));
		gun16_r13.cubeList.add(new ModelBox(gun16_r13, 70, 25, -0.4999F, -1.0F, 3.5F, 1, 2, 1, -0.4F, false));
		gun16_r13.cubeList.add(new ModelBox(gun16_r13, 63, 77, -0.4999F, -1.0F, 5.5F, 1, 2, 1, -0.4F, false));
		gun16_r13.cubeList.add(new ModelBox(gun16_r13, 38, 79, -0.4999F, -1.0F, 4.5F, 1, 2, 1, -0.4F, false));
		gun16_r13.cubeList.add(new ModelBox(gun16_r13, 63, 83, -0.4999F, -1.0F, 6.5F, 1, 2, 1, -0.4F, false));

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 25, 24, -1.501F, -31.9161F, -13.0465F, 1, 6, 3, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 128, -3.499F, -33.5F, -7.0F, 5, 3, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 44, -3.499F, -33.5F, -1.25F, 5, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 99, 26, -0.751F, -34.2706F, 3.9033F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 91, -3.249F, -34.2706F, 3.9033F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 98, -1.5F, -34.3858F, 3.4193F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 105, -3.2501F, -19.3463F, -3.976F, 1, 3, 7, -0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 16, -3.601F, -33.25F, -17.0F, 3, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 16, -3.249F, -30.3463F, -3.351F, 1, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 32, 0.2753F, -19.3463F, -3.976F, 1, 3, 7, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 40, -1.399F, -33.25F, -17.0F, 3, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 32, 0.249F, -30.3463F, -3.351F, 1, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 117, -3.499F, -34.0F, -16.0F, 5, 2, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 122, 114, -2.499F, -33.5F, -16.0F, 3, 2, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 65, -2.0F, -31.5F, -10.75F, 2, 5, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 4, 108, -0.75F, -27.5F, -10.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 96, -2.501F, -29.5F, -1.5F, 3, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 66, 116, -2.0F, -26.5F, -17.75F, 2, 1, 7, 0.0F, false));

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(-0.951F, -32.3122F, 4.0015F);
		gun.addChild(gun4_r1);
		setRotationAngle(gun4_r1, -0.6109F, 0.0F, 0.0F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 79, 92, -2.075F, -0.5F, -0.5F, 4, 1, 1, -0.2F, false));

		gun2_r1 = new ModelRenderer(this);
		gun2_r1.setRotationPoint(-1.001F, -30.25F, 0.0F);
		gun.addChild(gun2_r1);
		setRotationAngle(gun2_r1, -0.6545F, 0.0F, 0.0F);
		gun2_r1.cubeList.add(new ModelBox(gun2_r1, 94, 84, -1.5F, -2.5F, -0.5F, 3, 4, 1, 0.0F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(-1.001F, -18.2901F, 3.0452F);
		gun.addChild(gun5_r1);
		setRotationAngle(gun5_r1, -1.2819F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 47, 72, -2.0F, -1.0F, -1.25F, 4, 2, 3, 0.0F, false));

		gun4_r2 = new ModelRenderer(this);
		gun4_r2.setRotationPoint(-1.001F, -23.0829F, 0.6207F);
		gun.addChild(gun4_r2);
		setRotationAngle(gun4_r2, -1.0637F, 0.0F, 0.0F);
		gun4_r2.cubeList.add(new ModelBox(gun4_r2, 123, 76, -1.5F, -1.0F, -4.5F, 3, 1, 9, 0.0F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(-1.0F, -25.75F, -7.25F);
		gun.addChild(gun11_r1);
		setRotationAngle(gun11_r1, -0.829F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 98, 47, -1.002F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		gun10_r1 = new ModelRenderer(this);
		gun10_r1.setRotationPoint(-1.0F, -26.25F, -8.25F);
		gun.addChild(gun10_r1);
		setRotationAngle(gun10_r1, -0.1309F, 0.0F, 0.0F);
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 90, 99, -1.001F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-1.0F, -26.2418F, -9.9135F);
		gun.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 0.2618F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 0, 100, -1.002F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		gun11_r2 = new ModelRenderer(this);
		gun11_r2.setRotationPoint(-1.0F, -30.8981F, -10.6009F);
		gun.addChild(gun11_r2);
		setRotationAngle(gun11_r2, 0.7854F, 0.0F, 0.0F);
		gun11_r2.cubeList.add(new ModelBox(gun11_r2, 39, 100, -1.002F, -1.5F, -0.5F, 2, 2, 1, 0.0F, false));

		gun10_r2 = new ModelRenderer(this);
		gun10_r2.setRotationPoint(-1.0F, -27.1019F, -10.6009F);
		gun.addChild(gun10_r2);
		setRotationAngle(gun10_r2, -0.7854F, 0.0F, 0.0F);
		gun10_r2.cubeList.add(new ModelBox(gun10_r2, 50, 100, -1.002F, -0.5F, -0.5F, 2, 2, 1, 0.0F, false));

		gun10_r3 = new ModelRenderer(this);
		gun10_r3.setRotationPoint(-1.0F, -27.6075F, -19.9554F);
		gun.addChild(gun10_r3);
		setRotationAngle(gun10_r3, -0.6196F, 0.0F, 0.0F);
		gun10_r3.cubeList.add(new ModelBox(gun10_r3, 49, 86, -1.0F, -0.5F, -0.25F, 2, 1, 3, 0.001F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(-1.001F, -32.6195F, 1.7586F);
		gun.addChild(gun3_r1);
		setRotationAngle(gun3_r1, 0.2618F, 0.0F, 0.0F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 80, 66, -0.25F, -1.7F, -1.95F, 2, 3, 4, 0.0F, false));
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 49, 79, -1.748F, -1.7F, -1.95F, 2, 3, 4, 0.0F, false));

		gun5_r2 = new ModelRenderer(this);
		gun5_r2.setRotationPoint(0.75F, -28.3463F, -2.351F);
		gun.addChild(gun5_r2);
		setRotationAngle(gun5_r2, -0.6545F, 0.0F, 0.0F);
		gun5_r2.cubeList.add(new ModelBox(gun5_r2, 104, 101, -0.5F, -3.25F, -0.75F, 1, 2, 1, 0.0F, false));
		gun5_r2.cubeList.add(new ModelBox(gun5_r2, 30, 24, -4.0F, -3.25F, -0.75F, 1, 2, 1, 0.0F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(0.3447F, -30.1747F, 0.1942F);
		gun.addChild(gun6_r1);
		setRotationAngle(gun6_r1, -0.7132F, -0.3751F, 0.3069F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 29, 13, -0.5F, -2.0F, -1.0F, 1, 4, 1, 0.0F, false));

		gun5_r3 = new ModelRenderer(this);
		gun5_r3.setRotationPoint(0.4054F, -28.3463F, -0.6185F);
		gun.addChild(gun5_r3);
		setRotationAngle(gun5_r3, 0.0F, -0.3927F, 0.0F);
		gun5_r3.cubeList.add(new ModelBox(gun5_r3, 29, 0, -0.5F, -2.0F, -1.0F, 1, 4, 1, 0.0F, false));

		gun5_r4 = new ModelRenderer(this);
		gun5_r4.setRotationPoint(-0.1368F, -22.037F, 0.6972F);
		gun.addChild(gun5_r4);
		setRotationAngle(gun5_r4, -1.0294F, -0.3411F, -0.1985F);
		gun5_r4.cubeList.add(new ModelBox(gun5_r4, 12, 124, 0.5F, -1.0F, -5.5F, 1, 1, 9, 0.0F, false));

		gun6_r2 = new ModelRenderer(this);
		gun6_r2.setRotationPoint(-0.251F, -22.5829F, -0.3793F);
		gun.addChild(gun6_r2);
		setRotationAngle(gun6_r2, -1.0637F, 0.0F, 0.0F);
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 47, 127, 0.5001F, -1.25F, -4.5F, 1, 3, 9, 0.0F, false));
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 123, 125, -2.9981F, -1.25F, -4.5F, 1, 3, 9, 0.0F, false));

		gun11_r3 = new ModelRenderer(this);
		gun11_r3.setRotationPoint(-1.3274F, -29.7929F, -4.0F);
		gun.addChild(gun11_r3);
		setRotationAngle(gun11_r3, 0.0F, 0.0F, -0.7854F);
		gun11_r3.cubeList.add(new ModelBox(gun11_r3, 60, 32, 1.5F, -1.5F, -3.0F, 1, 3, 6, 0.0F, false));

		gun13_r4 = new ModelRenderer(this);
		gun13_r4.setRotationPoint(0.384F, -31.192F, -8.3325F);
		gun.addChild(gun13_r4);
		setRotationAngle(gun13_r4, -0.281F, 0.4478F, 0.9828F);
		gun13_r4.cubeList.add(new ModelBox(gun13_r4, 94, 79, -0.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(0.383F, -31.7563F, -9.5541F);
		gun.addChild(gun12_r1);
		setRotationAngle(gun12_r1, -0.2042F, 0.3378F, 1.0123F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 76, 23, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		gun12_r2 = new ModelRenderer(this);
		gun12_r2.setRotationPoint(0.8107F, -32.153F, -11.5F);
		gun.addChild(gun12_r2);
		setRotationAngle(gun12_r2, 0.0F, 0.0F, 1.0036F);
		gun12_r2.cubeList.add(new ModelBox(gun12_r2, 0, 135, -0.5F, -0.5F, -4.5F, 1, 1, 9, 0.0F, false));

		gun13_r5 = new ModelRenderer(this);
		gun13_r5.setRotationPoint(0.7939F, -32.1635F, 2.4918F);
		gun.addChild(gun13_r5);
		setRotationAngle(gun13_r5, 0.1872F, 0.1841F, -0.7681F);
		gun13_r5.cubeList.add(new ModelBox(gun13_r5, 50, 96, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		gun12_r3 = new ModelRenderer(this);
		gun12_r3.setRotationPoint(-0.6206F, -32.7241F, 0.0253F);
		gun.addChild(gun12_r3);
		setRotationAngle(gun12_r3, 0.3876F, -0.3614F, 0.7137F);
		gun12_r3.cubeList.add(new ModelBox(gun12_r3, 0, 91, -2.501F, -0.5F, -2.0F, 5, 1, 3, 0.0F, false));

		gun3_r2 = new ModelRenderer(this);
		gun3_r2.setRotationPoint(-0.2598F, -21.9813F, -5.1074F);
		gun.addChild(gun3_r2);
		setRotationAngle(gun3_r2, 0.411F, 0.8296F, 0.3111F);
		gun3_r2.cubeList.add(new ModelBox(gun3_r2, 20, 71, 0.0F, -9.5F, -0.5F, 1, 15, 1, 0.0F, false));

		gun3_r3 = new ModelRenderer(this);
		gun3_r3.setRotationPoint(0.3041F, -23.8388F, -5.8908F);
		gun.addChild(gun3_r3);
		setRotationAngle(gun3_r3, 0.2944F, 0.3774F, 0.1113F);
		gun3_r3.cubeList.add(new ModelBox(gun3_r3, 71, 136, -0.5001F, -7.5F, 0.0F, 1, 15, 1, 0.0F, false));
		gun3_r3.cubeList.add(new ModelBox(gun3_r3, 24, 71, -0.5F, -7.5F, 0.25F, 1, 15, 1, 0.001F, false));

		gun3_r4 = new ModelRenderer(this);
		gun3_r4.setRotationPoint(-0.75F, -24.3463F, -2.476F);
		gun.addChild(gun3_r4);
		setRotationAngle(gun3_r4, 0.2732F, 0.0F, 0.0F);
		gun3_r4.cubeList.add(new ModelBox(gun3_r4, 0, 24, 1.0F, -8.0F, -2.5F, 1, 15, 4, 0.0F, false));
		gun3_r4.cubeList.add(new ModelBox(gun3_r4, 0, 0, -2.5F, -8.0F, -2.5F, 1, 15, 4, 0.0F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(-2.3447F, -30.1747F, 0.1942F);
		gun.addChild(gun7_r1);
		setRotationAngle(gun7_r1, -0.7132F, 0.3751F, -0.3069F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 25, 36, -0.5F, -2.0F, -1.0F, 1, 4, 1, 0.0F, false));

		gun6_r3 = new ModelRenderer(this);
		gun6_r3.setRotationPoint(-2.4054F, -28.3463F, -0.6185F);
		gun.addChild(gun6_r3);
		setRotationAngle(gun6_r3, 0.0F, 0.3927F, 0.0F);
		gun6_r3.cubeList.add(new ModelBox(gun6_r3, 0, 44, -0.5F, -2.0F, -1.0F, 1, 4, 1, 0.0F, false));

		gun6_r4 = new ModelRenderer(this);
		gun6_r4.setRotationPoint(-1.8632F, -22.037F, 0.6972F);
		gun.addChild(gun6_r4);
		setRotationAngle(gun6_r4, -1.0294F, 0.3411F, 0.1985F);
		gun6_r4.cubeList.add(new ModelBox(gun6_r4, 93, 128, -1.5F, -1.0F, -5.5F, 1, 1, 9, 0.0F, false));

		gun3_r5 = new ModelRenderer(this);
		gun3_r5.setRotationPoint(-1.0F, -21.8228F, -5.673F);
		gun.addChild(gun3_r5);
		setRotationAngle(gun3_r5, 0.2732F, 0.0F, 0.0F);
		gun3_r5.cubeList.add(new ModelBox(gun3_r5, 10, 0, -1.0F, -9.5F, -0.5F, 2, 15, 1, 0.0F, false));

		gun12_r4 = new ModelRenderer(this);
		gun12_r4.setRotationPoint(-0.6726F, -29.7929F, -4.0F);
		gun.addChild(gun12_r4);
		setRotationAngle(gun12_r4, 0.0F, 0.0F, 0.7854F);
		gun12_r4.cubeList.add(new ModelBox(gun12_r4, 60, 16, -2.5F, -1.5F, -3.0F, 1, 3, 6, 0.0F, false));

		gun14_r6 = new ModelRenderer(this);
		gun14_r6.setRotationPoint(-2.384F, -31.192F, -8.3325F);
		gun.addChild(gun14_r6);
		setRotationAngle(gun14_r6, -0.281F, -0.4478F, -0.9828F);
		gun14_r6.cubeList.add(new ModelBox(gun14_r6, 94, 72, -0.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));

		gun13_r6 = new ModelRenderer(this);
		gun13_r6.setRotationPoint(-2.383F, -31.7563F, -9.5541F);
		gun.addChild(gun13_r6);
		setRotationAngle(gun13_r6, -0.2042F, -0.3378F, -1.0123F);
		gun13_r6.cubeList.add(new ModelBox(gun13_r6, 44, 13, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		gun13_r7 = new ModelRenderer(this);
		gun13_r7.setRotationPoint(-2.8107F, -32.153F, -11.5F);
		gun.addChild(gun13_r7);
		setRotationAngle(gun13_r7, 0.0F, 0.0F, -1.0036F);
		gun13_r7.cubeList.add(new ModelBox(gun13_r7, 104, 129, -0.5F, -0.5F, -4.5F, 1, 1, 9, 0.0F, false));

		gun14_r7 = new ModelRenderer(this);
		gun14_r7.setRotationPoint(-2.7939F, -32.1635F, 2.4918F);
		gun.addChild(gun14_r7);
		setRotationAngle(gun14_r7, 0.1872F, -0.1841F, 0.7681F);
		gun14_r7.cubeList.add(new ModelBox(gun14_r7, 15, 44, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		gun13_r8 = new ModelRenderer(this);
		gun13_r8.setRotationPoint(-1.3794F, -32.7241F, 0.0253F);
		gun.addChild(gun13_r8);
		setRotationAngle(gun13_r8, 0.3876F, 0.3614F, -0.7137F);
		gun13_r8.cubeList.add(new ModelBox(gun13_r8, 34, 44, -2.499F, -0.5F, -2.0F, 5, 1, 3, 0.0F, false));

		gun4_r3 = new ModelRenderer(this);
		gun4_r3.setRotationPoint(-1.7402F, -21.9813F, -5.1074F);
		gun.addChild(gun4_r3);
		setRotationAngle(gun4_r3, 0.411F, -0.8296F, -0.3111F);
		gun4_r3.cubeList.add(new ModelBox(gun4_r3, 38, 136, -1.0F, -9.5F, -0.5F, 1, 15, 1, 0.0F, false));

		gun4_r4 = new ModelRenderer(this);
		gun4_r4.setRotationPoint(-2.3041F, -23.8388F, -5.8908F);
		gun.addChild(gun4_r4);
		setRotationAngle(gun4_r4, 0.2944F, -0.3774F, -0.1113F);
		gun4_r4.cubeList.add(new ModelBox(gun4_r4, 42, 136, -0.4999F, -7.5F, 0.0F, 1, 15, 1, 0.0F, false));
		gun4_r4.cubeList.add(new ModelBox(gun4_r4, 67, 136, -0.5F, -7.5F, 0.25F, 1, 15, 1, 0.001F, false));

		gun12_r5 = new ModelRenderer(this);
		gun12_r5.setRotationPoint(-0.999F, -33.049F, -8.4151F);
		gun.addChild(gun12_r5);
		setRotationAngle(gun12_r5, -0.5236F, 0.0F, 0.0F);
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 63, 89, -2.501F, -0.5F, -0.5F, 5, 2, 3, 0.0F, false));

		gun11_r4 = new ModelRenderer(this);
		gun11_r4.setRotationPoint(-0.999F, -33.3722F, -9.426F);
		gun.addChild(gun11_r4);
		setRotationAngle(gun11_r4, -0.3927F, 0.0F, 0.0F);
		gun11_r4.cubeList.add(new ModelBox(gun11_r4, 102, 32, -2.502F, 0.475F, -0.5F, 5, 1, 2, 0.0F, false));

		gun13_r9 = new ModelRenderer(this);
		gun13_r9.setRotationPoint(-1.0F, -32.366F, 0.2321F);
		gun.addChild(gun13_r9);
		setRotationAngle(gun13_r9, 0.5236F, 0.0F, 0.0F);
		gun13_r9.cubeList.add(new ModelBox(gun13_r9, 12, 65, -2.5F, -1.0F, -2.0F, 5, 2, 4, 0.0F, false));

		gun12_r6 = new ModelRenderer(this);
		gun12_r6.setRotationPoint(-0.999F, -33.0F, 1.75F);
		gun.addChild(gun12_r6);
		setRotationAngle(gun12_r6, 0.2618F, 0.0F, 0.0F);
		gun12_r6.cubeList.add(new ModelBox(gun12_r6, 85, 43, -2.5F, 0.0F, -1.0F, 5, 1, 3, -0.003F, false));

		gun13_r10 = new ModelRenderer(this);
		gun13_r10.setRotationPoint(0.499F, -33.0F, 4.25F);
		gun.addChild(gun13_r10);
		setRotationAngle(gun13_r10, -0.3927F, 0.0F, 0.0F);
		gun13_r10.cubeList.add(new ModelBox(gun13_r10, 99, 29, -4.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
		gun13_r10.cubeList.add(new ModelBox(gun13_r10, 100, 66, -0.998F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		gun33_r1 = new ModelRenderer(this);
		gun33_r1.setRotationPoint(-0.999F, -32.8467F, -20.9412F);
		gun.addChild(gun33_r1);
		setRotationAngle(gun33_r1, -0.0873F, 0.0F, 0.0F);
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 104, 117, -2.0F, -0.5F, -4.5F, 4, 1, 10, 0.0F, false));

		gun41_r1 = new ModelRenderer(this);
		gun41_r1.setRotationPoint(-1.0F, -31.914F, -20.7218F);
		gun.addChild(gun41_r1);
		setRotationAngle(gun41_r1, 1.9785F, 0.0F, 0.0F);
		gun41_r1.cubeList.add(new ModelBox(gun41_r1, 93, 19, -1.003F, -1.5F, -2.0F, 2, 2, 4, 0.0F, false));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(-1.0F, -29.3215F, -20.4192F);
		gun.addChild(gun40_r1);
		setRotationAngle(gun40_r1, 1.9785F, 0.0F, 0.0F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 98, 43, -1.002F, -0.75F, -1.5F, 2, 1, 2, 0.0F, false));

		gun42_r1 = new ModelRenderer(this);
		gun42_r1.setRotationPoint(-1.0F, -32.06F, -16.6935F);
		gun.addChild(gun42_r1);
		setRotationAngle(gun42_r1, 1.8039F, 0.0F, 0.0F);
		gun42_r1.cubeList.add(new ModelBox(gun42_r1, 94, 66, -1.0F, -3.5F, -0.7F, 2, 4, 2, 0.0F, false));

		gun41_r2 = new ModelRenderer(this);
		gun41_r2.setRotationPoint(-1.0F, -29.1903F, -20.1687F);
		gun.addChild(gun41_r2);
		setRotationAngle(gun41_r2, 0.8876F, 0.0F, 0.0F);
		gun41_r2.cubeList.add(new ModelBox(gun41_r2, 80, 6, -1.001F, -0.75F, -0.5F, 2, 1, 3, -0.003F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(-1.0F, -29.1903F, -20.1687F);
		gun.addChild(gun39_r1);
		setRotationAngle(gun39_r1, 1.673F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 15, 100, -1.001F, -0.5F, -1.5F, 2, 1, 2, 0.0F, false));

		gun62_r1 = new ModelRenderer(this);
		gun62_r1.setRotationPoint(-1.001F, -31.8827F, -14.8203F);
		gun.addChild(gun62_r1);
		setRotationAngle(gun62_r1, -0.2618F, 0.0F, 0.0F);
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 60, 96, -0.5F, 0.0F, -1.5F, 1, 1, 3, -0.001F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-1.001F, -30.7736F, -12.7294F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.7854F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 76, 16, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		gun62_r2 = new ModelRenderer(this);
		gun62_r2.setRotationPoint(-1.001F, -27.0673F, -12.5703F);
		gun.addChild(gun62_r2);
		setRotationAngle(gun62_r2, 0.7854F, 0.0F, 0.0F);
		gun62_r2.cubeList.add(new ModelBox(gun62_r2, 44, 0, -0.5F, -1.225F, -1.0F, 1, 2, 2, 0.0F, false));

		gun61_r1 = new ModelRenderer(this);
		gun61_r1.setRotationPoint(-1.001F, -26.6003F, -14.9497F);
		gun.addChild(gun61_r1);
		setRotationAngle(gun61_r1, 0.2618F, 0.0F, 0.0F);
		gun61_r1.cubeList.add(new ModelBox(gun61_r1, 70, 96, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.001F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.5F, -37.5F, -18.0F);
		gun.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 25, 24, -0.5F, 0.0F, -11.0F, 2, 2, 10, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-3.1359F, -37.7531F, -3.25F);
		gun.addChild(bone5);
		

		gun18_r4 = new ModelRenderer(this);
		gun18_r4.setRotationPoint(0.9388F, 0.6766F, -8.0F);
		bone5.addChild(gun18_r4);
		setRotationAngle(gun18_r4, 0.0F, 0.0F, -0.3927F);
		gun18_r4.cubeList.add(new ModelBox(gun18_r4, 76, 20, -0.5F, -0.5F, -0.5001F, 2, 1, 1, 0.0F, false));
		gun18_r4.cubeList.add(new ModelBox(gun18_r4, 93, 6, -0.5F, -0.5F, -5.5001F, 2, 1, 1, 0.0F, false));

		gun19_r1 = new ModelRenderer(this);
		gun19_r1.setRotationPoint(0.4829F, 1.3595F, -8.0F);
		bone5.addChild(gun19_r1);
		setRotationAngle(gun19_r1, 0.0F, 0.0F, -1.2654F);
		gun19_r1.cubeList.add(new ModelBox(gun19_r1, 68, 36, -1.15F, -0.475F, -0.5F, 2, 1, 1, 0.0F, false));
		gun19_r1.cubeList.add(new ModelBox(gun19_r1, 76, 27, -1.15F, -0.475F, -5.5F, 2, 1, 1, 0.0F, false));

		gun21_r2 = new ModelRenderer(this);
		gun21_r2.setRotationPoint(0.9671F, 1.0656F, -10.5F);
		bone5.addChild(gun21_r2);
		setRotationAngle(gun21_r2, 0.0F, 0.0F, 0.7418F);
		gun21_r2.cubeList.add(new ModelBox(gun21_r2, 39, 24, -0.5F, -1.0F, -2.0F, 1, 2, 4, 0.0F, false));

		stock = new QRenderer(this);
		stock.setRotationPoint(-1.498F, -11.75F, 15.0F);
		stock.cubeList.add(new ModelBox(stock, 112, 47, -1.998F, 0.5F, -10.0F, 5, 4, 12, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 13, 91, -1.873F, 2.0F, -9.0F, 5, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 76, 89, -1.698F, 2.0F, -7.5F, 5, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 68, 32, -1.0F, -0.379F, -3.0392F, 1, 2, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 85, 32, -2.0F, 16.5F, -11.0F, 5, 4, 7, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 0, -1.998F, 5.5F, -4.0F, 5, 15, 50, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 80, 77, -2.0F, 8.5F, -4.25F, 5, 5, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 93, 0, -1.0F, 8.5F, -5.25F, 3, 5, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 58, 127, -1.0F, 0.5F, 39.0F, 3, 1, 8, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 93, 0, -2.0F, 1.3284F, 39.0976F, 5, 5, 8, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 63, 65, -1.0F, 4.5F, 11.0F, 3, 1, 11, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 46, 116, -2.0F, 5.0F, 14.0F, 5, 1, 10, 0.0F, false));

		gun19_r2 = new ModelRenderer(this);
		gun19_r2.setRotationPoint(-1.2166F, 4.5519F, 10.9493F);
		stock.addChild(gun19_r2);
		setRotationAngle(gun19_r2, -0.1551F, -0.0803F, -0.4737F);
		gun19_r2.cubeList.add(new ModelBox(gun19_r2, 47, 65, -0.5F, -0.5F, -2.5F, 1, 1, 6, 0.0F, false));

		gun18_r5 = new ModelRenderer(this);
		gun18_r5.setRotationPoint(2.2126F, 4.5519F, 10.9493F);
		stock.addChild(gun18_r5);
		setRotationAngle(gun18_r5, -0.1551F, 0.0803F, 0.4737F);
		gun18_r5.cubeList.add(new ModelBox(gun18_r5, 76, 16, -0.5F, -0.5F, -2.5F, 1, 1, 6, 0.0F, false));

		gun18_r6 = new ModelRenderer(this);
		gun18_r6.setRotationPoint(0.5F, 4.8802F, 10.9796F);
		stock.addChild(gun18_r6);
		setRotationAngle(gun18_r6, -0.1745F, 0.0F, 0.0F);
		gun18_r6.cubeList.add(new ModelBox(gun18_r6, 20, 44, -2.499F, -0.5F, -0.5F, 5, 2, 4, 0.0F, false));

		gun17_r6 = new ModelRenderer(this);
		gun17_r6.setRotationPoint(0.5F, 4.3802F, 10.9796F);
		stock.addChild(gun17_r6);
		setRotationAngle(gun17_r6, -0.1745F, 0.0F, 0.0F);
		gun17_r6.cubeList.add(new ModelBox(gun17_r6, 63, 77, -1.5F, -0.5F, -5.5F, 3, 1, 11, 0.0F, false));

		gun18_r7 = new ModelRenderer(this);
		gun18_r7.setRotationPoint(-1.4345F, 3.123F, 6.8667F);
		stock.addChild(gun18_r7);
		setRotationAngle(gun18_r7, -0.3897F, -0.05F, -0.121F);
		gun18_r7.cubeList.add(new ModelBox(gun18_r7, 8, 80, -0.5F, -0.5F, -5.5F, 1, 1, 10, 0.0F, false));

		gun17_r7 = new ModelRenderer(this);
		gun17_r7.setRotationPoint(2.4305F, 3.123F, 6.8667F);
		stock.addChild(gun17_r7);
		setRotationAngle(gun17_r7, -0.3897F, 0.05F, 0.121F);
		gun17_r7.cubeList.add(new ModelBox(gun17_r7, 0, 124, -0.5F, -0.5F, -5.5F, 1, 1, 10, 0.0F, false));

		gun17_r8 = new ModelRenderer(this);
		gun17_r8.setRotationPoint(0.5F, 3.3167F, 6.89F);
		stock.addChild(gun17_r8);
		setRotationAngle(gun17_r8, -0.3927F, 0.0F, 0.0F);
		gun17_r8.cubeList.add(new ModelBox(gun17_r8, 60, 0, -2.5F, -0.5F, -5.5F, 5, 6, 10, 0.0F, false));

		gun16_r14 = new ModelRenderer(this);
		gun16_r14.setRotationPoint(0.5F, 3.0667F, 6.89F);
		stock.addChild(gun16_r14);
		setRotationAngle(gun16_r14, -0.3927F, 0.0F, 0.0F);
		gun16_r14.cubeList.add(new ModelBox(gun16_r14, 32, 79, -1.5F, -0.5F, -5.5F, 3, 1, 11, 0.0F, false));

		gun20_r2 = new ModelRenderer(this);
		gun20_r2.setRotationPoint(-1.0656F, 3.2439F, 29.8777F);
		stock.addChild(gun20_r2);
		setRotationAngle(gun20_r2, 0.1682F, 0.1396F, -0.6863F);
		gun20_r2.cubeList.add(new ModelBox(gun20_r2, 29, 96, -0.75F, -0.4999F, -9.5F, 1, 1, 19, 0.0F, false));
		gun20_r2.cubeList.add(new ModelBox(gun20_r2, 69, 96, -0.5F, -0.5F, -9.5F, 1, 1, 19, 0.001F, false));

		gun19_r3 = new ModelRenderer(this);
		gun19_r3.setRotationPoint(2.0616F, 3.2439F, 29.8777F);
		stock.addChild(gun19_r3);
		setRotationAngle(gun19_r3, 0.1682F, -0.1396F, 0.6863F);
		gun19_r3.cubeList.add(new ModelBox(gun19_r3, 90, 97, -0.25F, -0.4999F, -9.5F, 1, 1, 19, 0.0F, false));
		gun19_r3.cubeList.add(new ModelBox(gun19_r3, 111, 94, -0.5F, -0.5F, -9.5F, 1, 1, 19, 0.001F, false));

		gun18_r8 = new ModelRenderer(this);
		gun18_r8.setRotationPoint(0.5F, 3.9675F, 29.8496F);
		stock.addChild(gun18_r8);
		setRotationAngle(gun18_r8, 0.2182F, 0.0F, 0.0F);
		gun18_r8.cubeList.add(new ModelBox(gun18_r8, 0, 0, -2.499F, -0.575F, -9.4F, 5, 5, 19, 0.0F, false));

		gun17_r9 = new ModelRenderer(this);
		gun17_r9.setRotationPoint(0.5F, 3.1175F, 29.8496F);
		stock.addChild(gun17_r9);
		setRotationAngle(gun17_r9, 0.2182F, 0.0F, 0.0F);
		gun17_r9.cubeList.add(new ModelBox(gun17_r9, 0, 24, -1.5F, -0.575F, -9.5F, 3, 1, 19, 0.0F, false));

		gun18_r9 = new ModelRenderer(this);
		gun18_r9.setRotationPoint(-1.2166F, 5.1744F, 16.5F);
		stock.addChild(gun18_r9);
		setRotationAngle(gun18_r9, 0.0F, 0.0F, -0.48F);
		gun18_r9.cubeList.add(new ModelBox(gun18_r9, 70, 96, -0.5F, -0.5F, -2.5F, 1, 1, 8, 0.0F, false));

		gun17_r10 = new ModelRenderer(this);
		gun17_r10.setRotationPoint(2.2126F, 5.1744F, 16.5F);
		stock.addChild(gun17_r10);
		setRotationAngle(gun17_r10, 0.0F, 0.0F, 0.48F);
		gun17_r10.cubeList.add(new ModelBox(gun17_r10, 50, 105, -0.5F, -0.5F, -2.5F, 1, 1, 8, 0.0F, false));

		gun18_r10 = new ModelRenderer(this);
		gun18_r10.setRotationPoint(-1.0656F, 1.2044F, 41.0F);
		stock.addChild(gun18_r10);
		setRotationAngle(gun18_r10, 0.0F, 0.0F, -0.6981F);
		gun18_r10.cubeList.add(new ModelBox(gun18_r10, 50, 96, -0.5F, -0.5F, -2.0F, 1, 1, 8, 0.001F, false));
		gun18_r10.cubeList.add(new ModelBox(gun18_r10, 29, 96, -0.75F, -0.4994F, -2.0F, 1, 1, 8, 0.0F, false));

		gun18_r11 = new ModelRenderer(this);
		gun18_r11.setRotationPoint(2.0616F, 1.2044F, 41.0F);
		stock.addChild(gun18_r11);
		setRotationAngle(gun18_r11, 0.0F, 0.0F, 0.6981F);
		gun18_r11.cubeList.add(new ModelBox(gun18_r11, 90, 96, -0.25F, -0.4994F, -2.0F, 1, 1, 8, 0.0F, false));
		gun18_r11.cubeList.add(new ModelBox(gun18_r11, 29, 105, -0.5F, -0.5F, -2.0F, 1, 1, 8, 0.001F, false));

		gun17_r11 = new ModelRenderer(this);
		gun17_r11.setRotationPoint(0.5F, 13.4539F, 44.3181F);
		stock.addChild(gun17_r11);
		setRotationAngle(gun17_r11, -0.1745F, 0.0F, 0.0F);
		gun17_r11.cubeList.add(new ModelBox(gun17_r11, 111, 96, -2.501F, -7.5F, -1.5F, 5, 7, 3, 0.0F, false));

		gun18_r12 = new ModelRenderer(this);
		gun18_r12.setRotationPoint(-1.004F, 11.0F, -4.5429F);
		stock.addChild(gun18_r12);
		setRotationAngle(gun18_r12, 0.0F, -0.7854F, 0.0F);
		gun18_r12.cubeList.add(new ModelBox(gun18_r12, 68, 16, -0.5F, -2.5F, -0.5F, 1, 5, 1, 0.0F, false));
		gun18_r12.cubeList.add(new ModelBox(gun18_r12, 55, 65, -0.498F, -2.5F, -0.1F, 1, 5, 1, 0.0F, false));

		gun18_r13 = new ModelRenderer(this);
		gun18_r13.setRotationPoint(2.0F, 11.0F, -4.5429F);
		stock.addChild(gun18_r13);
		setRotationAngle(gun18_r13, 0.0F, 0.7854F, 0.0F);
		gun18_r13.cubeList.add(new ModelBox(gun18_r13, 0, 65, -0.502F, -2.5F, -0.1F, 1, 5, 1, 0.0F, false));
		gun18_r13.cubeList.add(new ModelBox(gun18_r13, 47, 65, -0.5F, -2.5F, -0.5F, 1, 5, 1, 0.0F, false));

		gun14_r8 = new ModelRenderer(this);
		gun14_r8.setRotationPoint(-0.5F, 1.0F, -5.75F);
		stock.addChild(gun14_r8);
		setRotationAngle(gun14_r8, 0.3054F, 0.0F, 0.0F);
		gun14_r8.cubeList.add(new ModelBox(gun14_r8, 76, 23, -0.5F, -0.5F, -3.0F, 1, 1, 6, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 3.404F, -5.8039F);
		stock.addChild(bone6);
		

		gun16_r15 = new ModelRenderer(this);
		gun16_r15.setRotationPoint(0.5F, 1.0F, -2.0F);
		bone6.addChild(gun16_r15);
		setRotationAngle(gun16_r15, -0.2618F, 0.0F, 0.0F);
		gun16_r15.cubeList.add(new ModelBox(gun16_r15, 32, 74, -1.5F, 0.0F, -2.0F, 3, 1, 3, 0.0F, false));

		gun18_r14 = new ModelRenderer(this);
		gun18_r14.setRotationPoint(0.5F, 1.0F, -2.0F);
		bone6.addChild(gun18_r14);
		setRotationAngle(gun18_r14, -1.0472F, 0.0F, 0.0F);
		gun18_r14.cubeList.add(new ModelBox(gun18_r14, 135, 86, -1.5F, -1.0F, 0.625F, 3, 1, 5, 0.0F, false));

		gun20_r3 = new ModelRenderer(this);
		gun20_r3.setRotationPoint(-0.4228F, 4.1619F, 1.5235F);
		bone6.addChild(gun20_r3);
		setRotationAngle(gun20_r3, -0.839F, -0.7254F, -0.5374F);
		gun20_r3.cubeList.add(new ModelBox(gun20_r3, 132, 104, -1.5F, -0.5F, -4.0F, 3, 1, 6, 0.0F, false));
		gun20_r3.cubeList.add(new ModelBox(gun20_r3, 130, 39, -1.4992F, -0.825F, -3.0F, 3, 1, 5, 0.0F, false));

		gun20_r4 = new ModelRenderer(this);
		gun20_r4.setRotationPoint(1.4188F, 4.1619F, 1.5235F);
		bone6.addChild(gun20_r4);
		setRotationAngle(gun20_r4, -0.839F, 0.7254F, 0.5374F);
		gun20_r4.cubeList.add(new ModelBox(gun20_r4, 111, 106, -1.5008F, -0.825F, -4.0F, 3, 1, 6, 0.0F, false));
		gun20_r4.cubeList.add(new ModelBox(gun20_r4, 29, 116, -1.5F, -0.5F, -4.0F, 3, 1, 6, 0.0F, false));

		gun19_r4 = new ModelRenderer(this);
		gun19_r4.setRotationPoint(-0.4228F, 10.0302F, 1.5235F);
		bone6.addChild(gun19_r4);
		setRotationAngle(gun19_r4, 0.839F, -0.7254F, 0.5374F);
		gun19_r4.cubeList.add(new ModelBox(gun19_r4, 60, 25, -1.5F, -0.5F, -2.0F, 3, 1, 4, 0.0F, false));
		gun19_r4.cubeList.add(new ModelBox(gun19_r4, 123, 86, -1.4992F, -0.175F, -4.0F, 3, 1, 6, 0.0F, false));

		gun19_r5 = new ModelRenderer(this);
		gun19_r5.setRotationPoint(1.4188F, 10.0302F, 1.5235F);
		bone6.addChild(gun19_r5);
		setRotationAngle(gun19_r5, 0.839F, 0.7254F, -0.5374F);
		gun19_r5.cubeList.add(new ModelBox(gun19_r5, 123, 22, -1.5008F, -0.175F, -3.0F, 3, 1, 5, 0.0F, false));
		gun19_r5.cubeList.add(new ModelBox(gun19_r5, 95, 117, -1.5F, -0.5F, -4.0F, 3, 1, 6, 0.0F, false));

		gun17_r12 = new ModelRenderer(this);
		gun17_r12.setRotationPoint(0.5F, 13.192F, -2.0F);
		bone6.addChild(gun17_r12);
		setRotationAngle(gun17_r12, 1.0472F, 0.0F, 0.0F);
		gun17_r12.cubeList.add(new ModelBox(gun17_r12, 11, 135, -1.5F, 0.0F, 0.5F, 3, 1, 6, 0.0F, false));

		gun18_r15 = new ModelRenderer(this);
		gun18_r15.setRotationPoint(-1.3576F, 1.1156F, -3.0663F);
		bone6.addChild(gun18_r15);
		setRotationAngle(gun18_r15, -0.2533F, 0.067F, 0.2533F);
		gun18_r15.cubeList.add(new ModelBox(gun18_r15, 63, 83, -0.5F, -0.5F, -1.0F, 1, 1, 4, 0.0F, false));

		gun17_r13 = new ModelRenderer(this);
		gun17_r13.setRotationPoint(2.3536F, 1.1156F, -3.0663F);
		bone6.addChild(gun17_r13);
		setRotationAngle(gun17_r13, -0.2533F, -0.067F, -0.2533F);
		gun17_r13.cubeList.add(new ModelBox(gun17_r13, 40, 36, -0.5F, -0.5F, -1.0F, 1, 1, 4, 0.0F, false));

		gun17_r14 = new ModelRenderer(this);
		gun17_r14.setRotationPoint(-1.3576F, 13.0764F, -3.0663F);
		bone6.addChild(gun17_r14);
		setRotationAngle(gun17_r14, 0.2533F, 0.067F, -0.2533F);
		gun17_r14.cubeList.add(new ModelBox(gun17_r14, 80, 83, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		gun16_r16 = new ModelRenderer(this);
		gun16_r16.setRotationPoint(2.3536F, 13.0764F, -3.0663F);
		bone6.addChild(gun16_r16);
		setRotationAngle(gun16_r16, 0.2533F, -0.067F, 0.2533F);
		gun16_r16.cubeList.add(new ModelBox(gun16_r16, 63, 71, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		gun15_r12 = new ModelRenderer(this);
		gun15_r12.setRotationPoint(0.5F, 13.4509F, -2.9659F);
		bone6.addChild(gun15_r12);
		setRotationAngle(gun15_r12, 0.2618F, 0.0F, 0.0F);
		gun15_r12.cubeList.add(new ModelBox(gun15_r12, 60, 41, -1.5F, -1.0F, -2.0F, 3, 1, 4, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 3.404F, -4.8039F);
		stock.addChild(bone7);
		

		gun17_r15 = new ModelRenderer(this);
		gun17_r15.setRotationPoint(0.5F, 0.9066F, -2.0395F);
		bone7.addChild(gun17_r15);
		setRotationAngle(gun17_r15, -0.2618F, 0.0F, 0.0F);
		gun17_r15.cubeList.add(new ModelBox(gun17_r15, 25, 36, -2.501F, -1.0F, -3.0F, 5, 2, 5, 0.0F, false));

		gun19_r6 = new ModelRenderer(this);
		gun19_r6.setRotationPoint(0.5F, 1.0F, -2.0F);
		bone7.addChild(gun19_r6);
		setRotationAngle(gun19_r6, -1.0472F, 0.0F, 0.0F);
		gun19_r6.cubeList.add(new ModelBox(gun19_r6, 29, 0, -2.499F, -8.0F, 0.625F, 5, 8, 5, 0.0F, false));

		gun18_r16 = new ModelRenderer(this);
		gun18_r16.setRotationPoint(0.5F, 13.192F, -2.0F);
		bone7.addChild(gun18_r16);
		setRotationAngle(gun18_r16, 1.0472F, 0.0F, 0.0F);
		gun18_r16.cubeList.add(new ModelBox(gun18_r16, 123, 66, -2.5F, 0.0F, -0.5F, 5, 3, 7, 0.003F, false));

		gun16_r17 = new ModelRenderer(this);
		gun16_r17.setRotationPoint(0.5F, 13.4509F, -2.9659F);
		bone7.addChild(gun16_r17);
		setRotationAngle(gun16_r17, 0.2618F, 0.0F, 0.0F);
		gun16_r17.cubeList.add(new ModelBox(gun16_r17, 29, 13, -2.501F, -1.0F, -3.0F, 5, 1, 5, 0.0F, false));

		mag = new ModelRenderer(this);
		mag.setRotationPoint(-1.4998F, 3.9326F, 0.9034F);
		mag.cubeList.add(new ModelBox(mag, 0, 108, -1.4992F, 3.3174F, -6.9034F, 4, 1, 9, 0.0F, false));

		gun5_r5 = new ModelRenderer(this);
		gun5_r5.setRotationPoint(0.4998F, -4.2882F, -3.9494F);
		mag.addChild(gun5_r5);
		setRotationAngle(gun5_r5, 0.2732F, 0.0F, 0.0F);
		gun5_r5.cubeList.add(new ModelBox(gun5_r5, 20, 87, -1.5F, 8.25F, 1.0F, 3, 1, 2, 0.0F, false));
		gun5_r5.cubeList.add(new ModelBox(gun5_r5, 115, 128, -1.5F, 7.25F, -2.0F, 3, 1, 5, 0.0F, false));
		gun5_r5.cubeList.add(new ModelBox(gun5_r5, 0, 65, -1.5F, -11.75F, -3.0F, 3, 19, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
