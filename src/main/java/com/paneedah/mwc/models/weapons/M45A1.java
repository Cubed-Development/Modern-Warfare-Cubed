package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M45A1 extends ModelWithAttachments {
	private final ModelRenderer M45A1Gun;
	private final ModelRenderer M45A1Slide_r1;
	private final ModelRenderer details2;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r2_r2;
	private final ModelRenderer cube_r2_r3;
	private final ModelRenderer cube_r1_r1;
	private final ModelRenderer details3_r1;
	private final ModelRenderer details3_r2;
	private final ModelRenderer trigger2;
	private final ModelRenderer cube_r4_r1;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer body2;
	private final ModelRenderer cube_r27_r1;
	private final ModelRenderer cube_r26_r1;
	private final ModelRenderer cube_r25_r1;
	private final ModelRenderer cube_r24_r1;
	private final ModelRenderer cube_r22_r1;
	private final ModelRenderer cube_r21_r1;
	private final ModelRenderer cube_r20_r1;
	private final ModelRenderer cube_r19_r1;
	private final ModelRenderer cube_r18_r1;
	private final ModelRenderer cube_r17_r1;
	private final ModelRenderer cube_r16_r1;
	private final ModelRenderer cube_r15_r1;
	private final ModelRenderer cube_r14_r1;
	private final ModelRenderer cube_r13_r1;
	private final ModelRenderer cube_r12_r1;
	private final ModelRenderer cube_r11_r1;
	private final ModelRenderer cube_r10_r1;
	private final ModelRenderer cube_r9_r1;
	private final ModelRenderer cube_r8_r1;
	private final ModelRenderer cube_r8_r2;
	private final ModelRenderer cube_r7_r1;
	private final ModelRenderer cube_r6_r1;
	private final ModelRenderer gun108_r1_r1_r1;
	private final ModelRenderer gun109_r1_r1_r1;
	private final ModelRenderer gun110_r1_r1_r1;
	private final ModelRenderer gun109_r2_r1_r1;
	private final ModelRenderer cube_r5_r1;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r23_r1;
	private final ModelRenderer Grip2;
	private final ModelRenderer cube_r32_r1;
	private final ModelRenderer cube_r31_r1;
	private final ModelRenderer cube_r29_r1;
	private final ModelRenderer cube_r30_r1;
	private final ModelRenderer cube_r31_r2;
	private final ModelRenderer cube_r29_r2;
	private final ModelRenderer cube_r28_r1;
	private final ModelRenderer hammer2;
	private final ModelRenderer cube_r35_r1;
	private final ModelRenderer cube_r34_r1;
	private final ModelRenderer cube_r33_r1;

	public M45A1() {
		textureWidth = 170;
		textureHeight = 170;

		M45A1Gun = new ModelRenderer(this);
		M45A1Gun.setRotationPoint(-1.9963F, -6.0535F, -9.501F);
		M45A1Gun.cubeList.add(new ModelBox(M45A1Gun, 48, 68, -2.0037F, -8.7465F, 10.501F, 3, 3, 1, 0.0F, false));
		M45A1Gun.cubeList.add(new ModelBox(M45A1Gun, 25, 65, -2.0037F, -6.0465F, 10.501F, 3, 1, 1, 0.0F, false));

		M45A1Slide_r1 = new ModelRenderer(this);
		M45A1Slide_r1.setRotationPoint(-0.6037F, -7.2465F, 11.101F);
		M45A1Gun.addChild(M45A1Slide_r1);
		setRotationAngle(M45A1Slide_r1, 0.0F, 0.0F, -0.7854F);
		M45A1Slide_r1.cubeList.add(new ModelBox(M45A1Slide_r1, 71, 58, -0.5F, -0.4F, -0.4F, 1, 1, 1, -0.1F, false));

		details2 = new ModelRenderer(this);
		details2.setRotationPoint(0.0F, 0.0F, 0.0F);
		M45A1Gun.addChild(details2);
		details2.cubeList.add(new ModelBox(details2, 19, 58, 1.3F, -4.6F, -3.3F, 1, 1, 6, 0.0F, false));
		details2.cubeList.add(new ModelBox(details2, 68, 17, 1.6F, -4.6F, 0.7F, 1, 1, 2, 0.0F, false));

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(0.9963F, 28.6581F, 1.5324F);
		details2.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, -0.2443F, 0.0F, 0.0F);
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 63, 34, -4.1963F, -34.4535F, 1.199F, 1, 1, 3, 0.0F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 63, 40, 0.1964F, -34.4535F, 1.199F, 1, 1, 3, 0.0F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 35, 13, 0.1964F, -34.4535F, 1.199F, 1, 3, 1, 0.0F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 19, 58, -4.1963F, -34.4535F, 1.399F, 2, 3, 1, 0.0F, false));

		cube_r2_r2 = new ModelRenderer(this);
		cube_r2_r2.setRotationPoint(1.9927F, -4.2391F, 9.9381F);
		details2.addChild(cube_r2_r2);
		setRotationAngle(cube_r2_r2, -0.2463F, 0.127F, -0.0318F);
		cube_r2_r2.cubeList.add(new ModelBox(cube_r2_r2, 35, 13, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r2_r3 = new ModelRenderer(this);
		cube_r2_r3.setRotationPoint(-3.0F, -4.2391F, 9.9381F);
		details2.addChild(cube_r2_r3);
		setRotationAngle(cube_r2_r3, -0.2463F, -0.127F, 0.0318F);
		cube_r2_r3.cubeList.add(new ModelBox(cube_r2_r3, 35, 18, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r1_r1 = new ModelRenderer(this);
		cube_r1_r1.setRotationPoint(1.9963F, 16.4443F, -15.634F);
		details2.addChild(cube_r1_r1);
		setRotationAngle(cube_r1_r1, -0.8901F, 0.0F, 0.0F);
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 81, 3, -4.1963F, -34.0535F, 1.399F, 1, 1, 1, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 27, 58, -5.1963F, -35.0535F, 2.099F, 2, 3, 1, -0.002F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 35, 18, -0.8036F, -35.0535F, 2.099F, 1, 3, 1, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 81, 9, -0.8036F, -34.0535F, 1.399F, 1, 1, 1, 0.0F, false));

		details3_r1 = new ModelRenderer(this);
		details3_r1.setRotationPoint(1.8F, 1.0F, 3.0F);
		details2.addChild(details3_r1);
		setRotationAngle(details3_r1, -0.7854F, 0.0F, 0.0F);
		details3_r1.cubeList.add(new ModelBox(details3_r1, 71, 52, -5.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		details3_r1.cubeList.add(new ModelBox(details3_r1, 71, 52, -0.7F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		details3_r2 = new ModelRenderer(this);
		details3_r2.setRotationPoint(-2.6F, -4.1F, -2.8F);
		details2.addChild(details3_r2);
		setRotationAngle(details3_r2, -0.6981F, 0.0F, 0.0F);
		details3_r2.cubeList.add(new ModelBox(details3_r2, 28, 81, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		trigger2 = new ModelRenderer(this);
		trigger2.setRotationPoint(-0.5037F, 2.4535F, -3.999F);
		M45A1Gun.addChild(trigger2);
		trigger2.cubeList.add(new ModelBox(trigger2, 0, 0, -0.5F, -4.9F, 3.2F, 1, 4, 2, 0.0F, false));
		trigger2.cubeList.add(new ModelBox(trigger2, 68, 13, -0.5F, -1.4F, 3.2F, 1, 1, 2, 0.0F, false));

		cube_r4_r1 = new ModelRenderer(this);
		cube_r4_r1.setRotationPoint(2.0F, 11.9728F, 28.296F);
		trigger2.addChild(cube_r4_r1);
		setRotationAngle(cube_r4_r1, 0.7156F, 0.0F, 0.0F);
		cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 63, 13, -2.5F, -26.6F, -11.7F, 1, 1, 3, -0.002F, false));

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(2.0F, 27.1537F, -7.7444F);
		trigger2.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, -0.7156F, 0.0F, 0.0F);
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 63, 17, -2.5F, -31.5329F, -13.6254F, 1, 1, 3, -0.002F, false));

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(-0.0037F, 12.906F, 14.6644F);
		M45A1Gun.addChild(body2);
		body2.cubeList.add(new ModelBox(body2, 98, 55, -3.0F, -17.9525F, -20.1634F, 5, 2, 18, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 81, 71, -1.5F, -16.2525F, -19.1634F, 2, 1, 5, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 51, 61, -1.5F, -10.9525F, -19.1634F, 2, 1, 5, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 10, 58, -1.5F, -14.6525F, -20.6634F, 2, 3, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 118, 75, -3.0F, -17.9525F, -30.1634F, 5, 1, 10, -0.002F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 47, -3.0F, -17.4525F, -30.1634F, 5, 1, 10, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 34, -2.5F, -18.1525F, -30.1634F, 4, 3, 10, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 46, 61, -2.5F, -18.1525F, -30.3634F, 4, 3, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 48, 6, -2.0F, -16.2525F, -23.0634F, 3, 2, 3, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 70, 64, -2.0F, -16.2525F, -24.7634F, 3, 2, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 70, 61, -2.0F, -16.2525F, -26.7634F, 3, 2, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 63, 21, -2.0F, -16.2525F, -28.7634F, 3, 2, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 63, 8, -2.0F, -16.2525F, -30.3634F, 3, 2, 1, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 47, 57, -3.0F, -17.9525F, -30.3634F, 5, 1, 1, -0.002F, false));
		body2.cubeList.add(new ModelBox(body2, 35, 27, -3.0F, -16.1525F, -5.5634F, 5, 1, 5, -0.002F, false));
		body2.cubeList.add(new ModelBox(body2, 55, 0, -1.5F, -14.3525F, -13.4634F, 2, 3, 1, -0.001F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 95, -2.0F, -20.8525F, -37.5634F, 1, 1, 26, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 91, 27, -1.0F, -21.8525F, -37.5634F, 1, 1, 26, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 91, 0, -1.0F, -19.8525F, -37.5634F, 1, 1, 26, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 28, 88, 0.0F, -20.8525F, -37.5634F, 1, 1, 26, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 70, 61, -2.1F, -21.6525F, -22.2634F, 2, 2, 8, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 48, 68, -1.5F, -22.3525F, -22.2634F, 2, 2, 8, 0.0F, false));

		cube_r27_r1 = new ModelRenderer(this);
		cube_r27_r1.setRotationPoint(2.0F, 7.4484F, 9.3439F);
		body2.addChild(cube_r27_r1);
		setRotationAngle(cube_r27_r1, 0.5061F, 0.0F, 0.0F);
		cube_r27_r1.cubeList.add(new ModelBox(cube_r27_r1, 48, 13, -3.4F, -34.8F, -15.5F, 3, 1, 3, 0.0F, false));
		cube_r27_r1.cubeList.add(new ModelBox(cube_r27_r1, 0, 47, -3.5F, -34.2F, -15.5F, 2, 1, 3, 0.0F, false));

		cube_r26_r1 = new ModelRenderer(this);
		cube_r26_r1.setRotationPoint(1.5F, 16.4486F, -29.7149F);
		body2.addChild(cube_r26_r1);
		setRotationAngle(cube_r26_r1, -0.8465F, 0.0F, 0.0F);
		cube_r26_r1.cubeList.add(new ModelBox(cube_r26_r1, 0, 30, -3.0F, -26.4F, -15.05F, 2, 1, 1, 0.0F, false));
		cube_r26_r1.cubeList.add(new ModelBox(cube_r26_r1, 48, 34, -3.0F, -26.4F, -14.8F, 2, 1, 2, 0.0F, false));

		cube_r25_r1 = new ModelRenderer(this);
		cube_r25_r1.setRotationPoint(1.5F, 2.8324F, 10.1232F);
		body2.addChild(cube_r25_r1);
		setRotationAngle(cube_r25_r1, 0.7156F, 0.0F, 0.0F);
		cube_r25_r1.cubeList.add(new ModelBox(cube_r25_r1, 27, 50, -3.0F, -26.6F, -10.0F, 2, 1, 1, 0.0F, false));
		cube_r25_r1.cubeList.add(new ModelBox(cube_r25_r1, 0, 51, -3.0F, -26.6F, -9.7F, 2, 1, 3, -0.002F, false));

		cube_r24_r1 = new ModelRenderer(this);
		cube_r24_r1.setRotationPoint(25.289F, 9.5719F, -5.1634F);
		body2.addChild(cube_r24_r1);
		setRotationAngle(cube_r24_r1, 0.0F, 0.0F, -0.7854F);
		cube_r24_r1.cubeList.add(new ModelBox(cube_r24_r1, 79, 52, -0.325F, -35.0F, -19.6F, 1, 1, 1, 0.0F, false));
		cube_r24_r1.cubeList.add(new ModelBox(cube_r24_r1, 80, 0, -0.325F, -35.0F, -21.6F, 1, 1, 1, 0.0F, false));
		cube_r24_r1.cubeList.add(new ModelBox(cube_r24_r1, 80, 7, -0.325F, -35.0F, -23.6F, 1, 1, 1, 0.0F, false));
		cube_r24_r1.cubeList.add(new ModelBox(cube_r24_r1, 80, 13, -0.325F, -35.0F, -25.2F, 1, 1, 1, 0.0F, false));
		cube_r24_r1.cubeList.add(new ModelBox(cube_r24_r1, 60, 61, -0.325F, -35.0F, -17.9F, 1, 1, 3, 0.0F, false));

		cube_r22_r1 = new ModelRenderer(this);
		cube_r22_r1.setRotationPoint(2.0004F, 17.1987F, -5.1634F);
		body2.addChild(cube_r22_r1);
		setRotationAngle(cube_r22_r1, 0.0F, 0.0F, 0.0175F);
		cube_r22_r1.cubeList.add(new ModelBox(cube_r22_r1, 18, 42, -5.6F, -34.55F, -25.2F, 5, 1, 1, 0.0F, false));

		cube_r21_r1 = new ModelRenderer(this);
		cube_r21_r1.setRotationPoint(2.0F, 10.4794F, 16.8708F);
		body2.addChild(cube_r21_r1);
		setRotationAngle(cube_r21_r1, 0.7156F, 0.0F, 0.0F);
		cube_r21_r1.cubeList.add(new ModelBox(cube_r21_r1, 35, 61, -4.0F, -31.6F, -0.1F, 3, 1, 5, 0.0F, false));
		cube_r21_r1.cubeList.add(new ModelBox(cube_r21_r1, 16, 28, -5.0F, -33.5F, -0.1F, 5, 2, 3, 0.0F, false));

		cube_r20_r1 = new ModelRenderer(this);
		cube_r20_r1.setRotationPoint(2.0F, 17.014F, 0.5631F);
		body2.addChild(cube_r20_r1);
		setRotationAngle(cube_r20_r1, 0.1745F, 0.0F, 0.0F);
		cube_r20_r1.cubeList.add(new ModelBox(cube_r20_r1, 9, 28, -4.0F, -33.1F, 4.8F, 3, 1, 2, 0.0F, false));

		cube_r19_r1 = new ModelRenderer(this);
		cube_r19_r1.setRotationPoint(-0.1679F, 17.1997F, -0.4895F);
		body2.addChild(cube_r19_r1);
		setRotationAngle(cube_r19_r1, 0.1922F, 0.4293F, 0.0808F);
		cube_r19_r1.cubeList.add(new ModelBox(cube_r19_r1, 10, 62, -4.9F, -33.1F, 4.1F, 1, 1, 2, 0.0F, false));

		cube_r18_r1 = new ModelRenderer(this);
		cube_r18_r1.setRotationPoint(3.1679F, 17.1997F, -0.4895F);
		body2.addChild(cube_r18_r1);
		setRotationAngle(cube_r18_r1, 0.1922F, -0.4293F, -0.0808F);
		cube_r18_r1.cubeList.add(new ModelBox(cube_r18_r1, 68, 4, 0.3F, -33.1F, 5.9F, 1, 1, 2, 0.0F, false));

		cube_r17_r1 = new ModelRenderer(this);
		cube_r17_r1.setRotationPoint(2.0F, 12.1179F, 14.5165F);
		body2.addChild(cube_r17_r1);
		setRotationAngle(cube_r17_r1, 0.6283F, 0.0F, 0.0F);
		cube_r17_r1.cubeList.add(new ModelBox(cube_r17_r1, 53, 53, -4.0F, -31.1F, 6.0F, 3, 1, 1, 0.0F, false));

		cube_r16_r1 = new ModelRenderer(this);
		cube_r16_r1.setRotationPoint(2.0F, -3.5184F, 27.4819F);
		body2.addChild(cube_r16_r1);
		setRotationAngle(cube_r16_r1, 1.2566F, 0.0F, 0.0F);
		cube_r16_r1.cubeList.add(new ModelBox(cube_r16_r1, 50, 27, -5.0F, -32.9F, -1.7F, 5, 1, 3, 0.0F, false));
		cube_r16_r1.cubeList.add(new ModelBox(cube_r16_r1, 48, 17, -4.0F, -32.2F, -1.7F, 3, 1, 3, 0.0F, false));

		cube_r15_r1 = new ModelRenderer(this);
		cube_r15_r1.setRotationPoint(2.0F, 1.7737F, -31.9993F);
		body2.addChild(cube_r15_r1);
		setRotationAngle(cube_r15_r1, -0.925F, 0.0F, 0.0F);
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 35, 57, -5.0F, -35.7F, 2.2F, 5, 1, 2, 0.0F, false));

		cube_r14_r1 = new ModelRenderer(this);
		cube_r14_r1.setRotationPoint(2.0F, 14.6115F, -16.3187F);
		body2.addChild(cube_r14_r1);
		setRotationAngle(cube_r14_r1, -0.3316F, 0.0F, 0.0F);
		cube_r14_r1.cubeList.add(new ModelBox(cube_r14_r1, 63, 55, -5.0F, -34.7F, 3.1F, 5, 1, 2, 0.0F, false));

		cube_r13_r1 = new ModelRenderer(this);
		cube_r13_r1.setRotationPoint(1.5F, 7.9628F, 12.879F);
		body2.addChild(cube_r13_r1);
		setRotationAngle(cube_r13_r1, 0.5934F, 0.0F, 0.0F);
		cube_r13_r1.cubeList.add(new ModelBox(cube_r13_r1, 35, 0, -3.0F, -35.9F, -9.5F, 2, 6, 2, 0.0F, false));

		cube_r12_r1 = new ModelRenderer(this);
		cube_r12_r1.setRotationPoint(2.0F, -1.7638F, 19.9511F);
		body2.addChild(cube_r12_r1);
		setRotationAngle(cube_r12_r1, 0.9425F, 0.0F, 0.0F);
		cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 48, 21, -5.0F, -35.8F, -8.2F, 5, 2, 1, 0.0F, false));

		cube_r11_r1 = new ModelRenderer(this);
		cube_r11_r1.setRotationPoint(2.0F, 13.6238F, 5.0817F);
		body2.addChild(cube_r11_r1);
		setRotationAngle(cube_r11_r1, 0.3142F, 0.0F, 0.0F);
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 75, 56, -5.0F, -30.0F, -9.0F, 5, 1, 2, 0.0F, false));
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 20, 53, -5.0F, -33.7F, -7.9F, 5, 3, 1, 0.0F, false));
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 0, 95, -4.0F, -28.7F, -8.5F, 3, 13, 2, 0.0F, false));
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 0, 0, -5.0F, -33.7F, -7.4F, 5, 19, 6, -0.002F, false));

		cube_r10_r1 = new ModelRenderer(this);
		cube_r10_r1.setRotationPoint(1.5F, 17.4802F, -14.7967F);
		body2.addChild(cube_r10_r1);
		setRotationAngle(cube_r10_r1, -0.2793F, 0.0F, 0.0F);
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 0, 63, -3.0F, -28.55F, -6.6F, 2, 1, 2, 0.0F, false));
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 81, 77, -4.5F, -29.15F, -5.6F, 5, 1, 2, 0.0F, false));

		cube_r9_r1 = new ModelRenderer(this);
		cube_r9_r1.setRotationPoint(2.0F, -2.5841F, 20.3383F);
		body2.addChild(cube_r9_r1);
		setRotationAngle(cube_r9_r1, 0.9687F, 0.0F, 0.0F);
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 70, 82, -5.0F, -32.7F, -10.9F, 5, 1, 2, 0.0F, false));

		cube_r8_r1 = new ModelRenderer(this);
		cube_r8_r1.setRotationPoint(2.0F, 12.4163F, 7.1746F);
		body2.addChild(cube_r8_r1);
		setRotationAngle(cube_r8_r1, 0.384F, 0.0F, 0.0F);
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 0, 55, -4.0F, -24.125F, -0.3F, 3, 1, 1, 0.0F, false));
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 35, 55, -4.0F, -23.625F, -0.3F, 3, 1, 1, 0.0F, false));
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 16, 0, -4.0F, -27.625F, -0.8F, 3, 5, 1, 0.0F, false));
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 35, 34, -5.002F, -31.7F, -3.5F, 5, 18, 3, -0.002F, false));

		cube_r8_r2 = new ModelRenderer(this);
		cube_r8_r2.setRotationPoint(-0.5F, -3.9054F, 0.2561F);
		body2.addChild(cube_r8_r2);
		setRotationAngle(cube_r8_r2, 0.4015F, 0.0F, 0.0F);
		cube_r8_r2.cubeList.add(new ModelBox(cube_r8_r2, 0, 34, -1.5F, -4.5F, -0.7F, 3, 9, 1, 0.0F, false));

		cube_r7_r1 = new ModelRenderer(this);
		cube_r7_r1.setRotationPoint(2.0F, 14.2802F, -14.0782F);
		body2.addChild(cube_r7_r1);
		setRotationAngle(cube_r7_r1, -0.3491F, 0.0F, 0.0F);
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 63, 52, -4.0F, -27.4103F, 2.7225F, 3, 1, 1, 0.0F, false));

		cube_r6_r1 = new ModelRenderer(this);
		cube_r6_r1.setRotationPoint(2.0F, 17.7835F, -2.1079F);
		body2.addChild(cube_r6_r1);
		setRotationAngle(cube_r6_r1, 0.1745F, 0.0F, 0.0F);
		cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 35, 8, -4.0F, -17.3475F, -1.5866F, 4, 1, 1, -0.002F, false));
		cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 55, 31, -5.0F, -17.3475F, -2.8366F, 5, 1, 1, 0.0F, false));
		cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 118, 86, -5.0F, -17.3475F, -2.3366F, 5, 1, 9, 0.0F, false));

		gun108_r1_r1_r1 = new ModelRenderer(this);
		gun108_r1_r1_r1.setRotationPoint(18.2737F, 31.6856F, -5.1634F);
		body2.addChild(gun108_r1_r1_r1);
		setRotationAngle(gun108_r1_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun108_r1_r1_r1.cubeList.add(new ModelBox(gun108_r1_r1_r1, 35, 0, 23.9358F, -50.7786F, -32.4F, 1, 1, 26, -0.001F, false));
		gun108_r1_r1_r1.cubeList.add(new ModelBox(gun108_r1_r1_r1, 35, 34, 23.9358F, -50.3786F, -32.4F, 1, 1, 26, -0.002F, false));

		gun109_r1_r1_r1 = new ModelRenderer(this);
		gun109_r1_r1_r1.setRotationPoint(-13.4956F, 31.9785F, -5.1634F);
		body2.addChild(gun109_r1_r1_r1);
		setRotationAngle(gun109_r1_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun109_r1_r1_r1.cubeList.add(new ModelBox(gun109_r1_r1_r1, 42, 61, -27.4003F, -46.8857F, -32.4F, 1, 1, 26, -0.002F, false));
		gun109_r1_r1_r1.cubeList.add(new ModelBox(gun109_r1_r1_r1, 63, 1, -27.4003F, -46.4857F, -32.4F, 1, 1, 26, -0.001F, false));

		gun110_r1_r1_r1 = new ModelRenderer(this);
		gun110_r1_r1_r1.setRotationPoint(17.4453F, 30.0287F, -5.1634F);
		body2.addChild(gun110_r1_r1_r1);
		setRotationAngle(gun110_r1_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun110_r1_r1_r1.cubeList.add(new ModelBox(gun110_r1_r1_r1, 63, 28, 21.5216F, -49.007F, -32.4F, 1, 1, 26, -0.002F, false));
		gun110_r1_r1_r1.cubeList.add(new ModelBox(gun110_r1_r1_r1, 0, 68, 21.5216F, -48.607F, -32.4F, 1, 1, 26, -0.001F, false));

		gun109_r2_r1_r1 = new ModelRenderer(this);
		gun109_r2_r1_r1.setRotationPoint(-14.3239F, 33.6353F, -5.1634F);
		body2.addChild(gun109_r2_r1_r1);
		setRotationAngle(gun109_r2_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun109_r2_r1_r1.cubeList.add(new ModelBox(gun109_r2_r1_r1, 70, 55, -29.8145F, -48.2572F, -32.4F, 1, 1, 26, -0.002F, false));
		gun109_r2_r1_r1.cubeList.add(new ModelBox(gun109_r2_r1_r1, 70, 82, -29.8145F, -48.6572F, -32.4F, 1, 1, 26, -0.001F, false));

		cube_r5_r1 = new ModelRenderer(this);
		cube_r5_r1.setRotationPoint(28.9625F, 2.8094F, -5.1634F);
		body2.addChild(cube_r5_r1);
		setRotationAngle(cube_r5_r1, 0.0F, 0.0F, -0.8552F);
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 43, 47, -2.0F, -39.5F, -17.1F, 1, 2, 8, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-22.289F, 9.5719F, -5.1634F);
		body2.addChild(bone);
		

		cube_r23_r1 = new ModelRenderer(this);
		cube_r23_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r23_r1);
		setRotationAngle(cube_r23_r1, 0.0F, 0.0F, 0.7854F);
		cube_r23_r1.cubeList.add(new ModelBox(cube_r23_r1, 63, 4, -3.5F, -32.2F, -17.9F, 1, 1, 3, 0.0F, false));
		cube_r23_r1.cubeList.add(new ModelBox(cube_r23_r1, 80, 16, -3.5F, -32.2F, -19.6F, 1, 1, 1, 0.0F, false));
		cube_r23_r1.cubeList.add(new ModelBox(cube_r23_r1, 80, 19, -3.5F, -32.2F, -21.6F, 1, 1, 1, 0.0F, false));
		cube_r23_r1.cubeList.add(new ModelBox(cube_r23_r1, 80, 22, -3.5F, -32.2F, -23.6F, 1, 1, 1, 0.0F, false));
		cube_r23_r1.cubeList.add(new ModelBox(cube_r23_r1, 80, 34, -3.5F, -32.2F, -25.2F, 1, 1, 1, 0.0F, false));

		Grip2 = new ModelRenderer(this);
		Grip2.setRotationPoint(-1.971F, 5.5849F, 7.8373F);
		M45A1Gun.addChild(Grip2);
		Grip2.cubeList.add(new ModelBox(Grip2, 79, 46, -0.6827F, -6.556F, -1.3043F, 1, 1, 1, 0.0F, false));
		Grip2.cubeList.add(new ModelBox(Grip2, 75, 78, 3.5923F, 4.744F, 2.3957F, 1, 1, 1, 0.05F, false));
		Grip2.cubeList.add(new ModelBox(Grip2, 76, 22, 3.5923F, -6.556F, -1.3043F, 1, 1, 1, 0.05F, false));
		Grip2.cubeList.add(new ModelBox(Grip2, 75, 52, -0.6827F, 4.744F, 2.3957F, 1, 1, 1, 0.0F, false));
		Grip2.cubeList.add(new ModelBox(Grip2, 70, 37, -1.6577F, -6.556F, -1.3043F, 1, 1, 1, 0.05F, false));
		Grip2.cubeList.add(new ModelBox(Grip2, 70, 67, -1.6577F, 4.744F, 2.3957F, 1, 1, 1, 0.05F, false));

		cube_r32_r1 = new ModelRenderer(this);
		cube_r32_r1.setRotationPoint(3.9414F, 23.4784F, 8.0755F);
		Grip2.addChild(cube_r32_r1);
		setRotationAngle(cube_r32_r1, 0.3292F, 0.2983F, 0.1001F);
		cube_r32_r1.cubeList.add(new ModelBox(cube_r32_r1, 28, 95, -5.1F, -30.8246F, 0.632F, 1, 14, 2, 0.0F, false));

		cube_r31_r1 = new ModelRenderer(this);
		cube_r31_r1.setRotationPoint(-1.1731F, 23.0761F, 9.3133F);
		Grip2.addChild(cube_r31_r1);
		setRotationAngle(cube_r31_r1, 0.3231F, -0.2322F, -0.0769F);
		cube_r31_r1.cubeList.add(new ModelBox(cube_r31_r1, 20, 68, -0.9F, -31.8246F, -3.868F, 1, 15, 2, 0.0F, false));

		cube_r29_r1 = new ModelRenderer(this);
		cube_r29_r1.setRotationPoint(-0.8628F, 23.0963F, 9.2511F);
		Grip2.addChild(cube_r29_r1);
		setRotationAngle(cube_r29_r1, 0.3292F, 0.2983F, 0.1001F);
		cube_r29_r1.cubeList.add(new ModelBox(cube_r29_r1, 16, 95, -1.1F, -30.8246F, 0.632F, 1, 14, 2, 0.0F, false));

		cube_r30_r1 = new ModelRenderer(this);
		cube_r30_r1.setRotationPoint(-1.0327F, 23.0777F, 9.3081F);
		Grip2.addChild(cube_r30_r1);
		setRotationAngle(cube_r30_r1, 0.3142F, 0.0F, 0.0F);
		cube_r30_r1.cubeList.add(new ModelBox(cube_r30_r1, 24, 0, -0.6F, -32.8246F, -2.068F, 1, 16, 3, 0.0F, false));
		cube_r30_r1.cubeList.add(new ModelBox(cube_r30_r1, 53, 34, 4.6F, -32.8246F, -2.068F, 1, 16, 3, 0.0F, false));
		cube_r30_r1.cubeList.add(new ModelBox(cube_r30_r1, 91, 0, 0.4F, -32.8246F, -2.068F, 1, 16, 3, 0.0F, false));

		cube_r31_r2 = new ModelRenderer(this);
		cube_r31_r2.setRotationPoint(4.1077F, 23.0761F, 9.3133F);
		Grip2.addChild(cube_r31_r2);
		setRotationAngle(cube_r31_r2, 0.3231F, 0.2322F, 0.0769F);
		cube_r31_r2.cubeList.add(new ModelBox(cube_r31_r2, 90, 55, -0.1F, -31.8246F, -3.868F, 1, 15, 2, 0.0F, false));

		cube_r29_r2 = new ModelRenderer(this);
		cube_r29_r2.setRotationPoint(3.7974F, 23.0963F, 9.2511F);
		Grip2.addChild(cube_r29_r2);
		setRotationAngle(cube_r29_r2, 0.3292F, -0.2983F, -0.1001F);
		cube_r29_r2.cubeList.add(new ModelBox(cube_r29_r2, 34, 95, 0.1F, -30.8246F, 0.632F, 1, 14, 2, 0.0F, false));

		cube_r28_r1 = new ModelRenderer(this);
		cube_r28_r1.setRotationPoint(3.7081F, 22.777F, 10.2338F);
		Grip2.addChild(cube_r28_r1);
		setRotationAngle(cube_r28_r1, 0.3231F, -0.2322F, -0.0769F);
		cube_r28_r1.cubeList.add(new ModelBox(cube_r28_r1, 10, 95, -4.9F, -31.8246F, -3.868F, 1, 15, 2, 0.0F, false));

		hammer2 = new ModelRenderer(this);
		hammer2.setRotationPoint(-0.0037F, -4.8465F, 10.501F);
		M45A1Gun.addChild(hammer2);
		setRotationAngle(hammer2, -1.85F, 0.0F, 0.0F);
		

		cube_r35_r1 = new ModelRenderer(this);
		cube_r35_r1.setRotationPoint(1.7F, 21.5568F, 26.4849F);
		hammer2.addChild(cube_r35_r1);
		setRotationAngle(cube_r35_r1, 0.8465F, 0.0F, 0.0F);
		cube_r35_r1.cubeList.add(new ModelBox(cube_r35_r1, 20, 47, -2.5F, -38.8684F, -1.0723F, 1, 4, 1, 0.0F, false));
		cube_r35_r1.cubeList.add(new ModelBox(cube_r35_r1, 35, 27, -3.0F, -38.8684F, -1.0723F, 1, 4, 1, 0.0F, false));

		cube_r34_r1 = new ModelRenderer(this);
		cube_r34_r1.setRotationPoint(1.7F, 30.5489F, -17.0246F);
		hammer2.addChild(cube_r34_r1);
		setRotationAngle(cube_r34_r1, -0.4102F, 0.0F, 0.0F);
		cube_r34_r1.cubeList.add(new ModelBox(cube_r34_r1, 64, 72, -2.5F, -39.5035F, -0.0918F, 1, 1, 1, 0.0F, false));
		cube_r34_r1.cubeList.add(new ModelBox(cube_r34_r1, 29, 19, -2.5F, -38.7785F, -0.8168F, 1, 2, 1, 0.0F, false));
		cube_r34_r1.cubeList.add(new ModelBox(cube_r34_r1, 29, 28, -2.5F, -38.7785F, 0.6332F, 1, 2, 1, 0.0F, false));
		cube_r34_r1.cubeList.add(new ModelBox(cube_r34_r1, 29, 0, -3.0F, -38.7785F, 0.6332F, 1, 2, 1, 0.0F, false));
		cube_r34_r1.cubeList.add(new ModelBox(cube_r34_r1, 9, 25, -3.0F, -38.7785F, -0.8168F, 1, 2, 1, 0.0F, false));
		cube_r34_r1.cubeList.add(new ModelBox(cube_r34_r1, 32, 72, -3.0F, -39.5035F, -0.0918F, 1, 1, 1, 0.0F, false));

		cube_r33_r1 = new ModelRenderer(this);
		cube_r33_r1.setRotationPoint(1.7F, 31.47F, 11.8855F);
		hammer2.addChild(cube_r33_r1);
		setRotationAngle(cube_r33_r1, 0.3752F, 0.0F, 0.0F);
		cube_r33_r1.cubeList.add(new ModelBox(cube_r33_r1, 74, 67, -2.5F, -38.748F, 1.0183F, 1, 1, 1, 0.0F, false));
		cube_r33_r1.cubeList.add(new ModelBox(cube_r33_r1, 52, 72, -3.0F, -39.448F, 0.2933F, 1, 1, 1, 0.0F, false));
		cube_r33_r1.cubeList.add(new ModelBox(cube_r33_r1, 42, 72, -3.0F, -38.748F, 1.0183F, 1, 1, 1, 0.0F, false));
		cube_r33_r1.cubeList.add(new ModelBox(cube_r33_r1, 74, 71, -2.5F, -39.448F, 0.2933F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		M45A1Gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}