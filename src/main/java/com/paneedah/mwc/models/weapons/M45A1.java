package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M45A1 extends ModelWithAttachments {
	private final ModelRenderer M45A1Gun;
	private final ModelRenderer details3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer trigger3;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer body;
	private final ModelRenderer cube_r5;
	private final ModelRenderer gun109_r2_r1;
	private final ModelRenderer gun110_r1_r1;
	private final ModelRenderer gun109_r1_r1;
	private final ModelRenderer gun108_r1_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer Grip;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer hammer3;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;

	public M45A1() {
		textureWidth = 280;
		textureHeight = 280;

		M45A1Gun = new ModelRenderer(this);
		M45A1Gun.setRotationPoint(-1.9963F, -6.0535F, -9.501F);
		

		details3 = new ModelRenderer(this);
		details3.setRotationPoint(0.0F, 0.0F, 0.0F);
		M45A1Gun.addChild(details3);
		details3.cubeList.add(new ModelBox(details3, 92, 153, -2.1F, -4.6F, -3.3F, 1, 1, 1, 0.0F, false));
		details3.cubeList.add(new ModelBox(details3, 84, 10, 1.3F, -4.6F, -3.3F, 1, 1, 6, 0.0F, false));
		details3.cubeList.add(new ModelBox(details3, 103, 11, 1.6F, -4.6F, 0.7F, 1, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.7F, -3.1F, 11.2F);
		details3.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.8901F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 84, 153, -0.5F, -0.9F, -0.3F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 59, 90, -0.5F, -1.9F, 0.4F, 1, 3, 1, -0.002F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 65, 90, 2.8927F, -1.9F, 0.4F, 1, 3, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 88, 153, 2.8927F, -0.9F, -0.3F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.7F, -3.1F, 11.2F);
		details3.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2443F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 77, -0.5F, -1.3F, -0.5F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 118, 3.1927F, -1.3F, -3.5F, 1, 1, 4, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 81, 2.8927F, -1.3F, -0.5F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 92, 100, 2.8927F, -1.3F, -0.5F, 1, 3, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 122, 25, -0.8F, -1.3F, -3.5F, 1, 1, 4, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 98, 100, -0.5F, -1.3F, -0.5F, 1, 3, 1, 0.0F, false));

		trigger3 = new ModelRenderer(this);
		trigger3.setRotationPoint(-0.5037F, 2.4535F, -3.999F);
		M45A1Gun.addChild(trigger3);
		trigger3.cubeList.add(new ModelBox(trigger3, 26, 10, 0.0F, -4.9F, 3.2F, 1, 4, 2, 0.0F, false));
		trigger3.cubeList.add(new ModelBox(trigger3, 9, 103, 0.0F, -1.4F, 3.2F, 1, 1, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.5F, -1.0329F, 3.4746F);
		trigger3.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7156F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 74, 68, -0.5F, -2.9F, -3.6F, 1, 1, 3, -0.002F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		trigger3.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.7156F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 77, 0.0F, 1.0F, 1.8F, 1, 1, 3, -0.002F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(-0.0037F, 12.906F, 14.6644F);
		M45A1Gun.addChild(body);
		body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -17.9525F, -20.1634F, 4, 2, 18, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 46, 56, -1.0F, -16.2525F, -19.1634F, 2, 1, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 46, 38, -1.0F, -10.9525F, -19.1634F, 2, 1, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 38, 99, -1.0F, -14.6525F, -20.6634F, 2, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 97, 119, -2.0F, -17.9525F, -30.1634F, 4, 1, 10, -0.002F, false));
		body.cubeList.add(new ModelBox(body, 92, 100, -2.0F, -17.4525F, -30.1634F, 4, 1, 10, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 59, 90, -1.5F, -18.1525F, -30.1634F, 3, 3, 10, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 74, 64, -1.5F, -18.1525F, -30.3634F, 3, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 71, 74, -1.0F, -16.2525F, -23.0634F, 2, 2, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 103, 8, -1.0F, -16.2525F, -24.7634F, 2, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 103, 3, -1.0F, -16.2525F, -26.7634F, 2, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 103, 0, -1.0F, -16.2525F, -28.7634F, 2, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 103, -1.0F, -16.2525F, -30.3634F, 2, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 138, 33, -2.0F, -17.9525F, -30.3634F, 4, 1, 1, -0.002F, false));
		body.cubeList.add(new ModelBox(body, 0, 11, -2.0F, -16.1525F, -5.5634F, 4, 1, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 99, -1.0F, -14.3525F, -13.4634F, 2, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 196, 55, -1.5F, -20.8525F, -37.5634F, 1, 1, 26, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 195, 102, -0.5F, -21.8525F, -37.5634F, 1, 1, 26, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 192, -0.5F, -19.8525F, -37.5634F, 1, 1, 26, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 191, 0, 0.5F, -20.8525F, -37.5634F, 1, 1, 26, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 143, 113, -1.6F, -21.6525F, -22.2634F, 2, 2, 8, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 61, 21, -1.0F, -22.3525F, -22.2634F, 2, 2, 8, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -20.1525F, -32.8634F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.8552F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 45, 0.0F, -2.2F, 10.6F, 1, 2, 8, 0.0F, false));

		gun109_r2_r1 = new ModelRenderer(this);
		gun109_r2_r1.setRotationPoint(-25.8145F, 6.2903F, -3.0634F);
		body.addChild(gun109_r2_r1);
		setRotationAngle(gun109_r2_r1, 0.0F, 0.0F, 0.7854F);
		gun109_r2_r1.cubeList.add(new ModelBox(gun109_r2_r1, 168, 148, -2.0F, -37.4F, -34.5F, 1, 1, 26, -0.002F, false));
		gun109_r2_r1.cubeList.add(new ModelBox(gun109_r2_r1, 176, 175, -2.0F, -37.8F, -34.5F, 1, 1, 26, -0.001F, false));

		gun110_r1_r1 = new ModelRenderer(this);
		gun110_r1_r1.setRotationPoint(25.5216F, 4.3405F, -3.0634F);
		body.addChild(gun110_r1_r1);
		setRotationAngle(gun110_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun110_r1_r1.cubeList.add(new ModelBox(gun110_r1_r1, 121, 183, -2.0F, -36.2F, -34.5F, 1, 1, 26, -0.002F, false));
		gun110_r1_r1.cubeList.add(new ModelBox(gun110_r1_r1, 83, 184, -2.0F, -35.8F, -34.5F, 1, 1, 26, -0.001F, false));

		gun109_r1_r1 = new ModelRenderer(this);
		gun109_r1_r1.setRotationPoint(-23.4003F, 6.4618F, -3.0634F);
		body.addChild(gun109_r1_r1);
		setRotationAngle(gun109_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun109_r1_r1.cubeList.add(new ModelBox(gun109_r1_r1, 189, 28, -2.0F, -36.2F, -34.5F, 1, 1, 26, -0.002F, false));
		gun109_r1_r1.cubeList.add(new ModelBox(gun109_r1_r1, 30, 190, -2.0F, -35.8F, -34.5F, 1, 1, 26, -0.001F, false));

		gun108_r1_r1 = new ModelRenderer(this);
		gun108_r1_r1.setRotationPoint(27.9358F, 4.1689F, -3.0634F);
		body.addChild(gun108_r1_r1);
		setRotationAngle(gun108_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun108_r1_r1.cubeList.add(new ModelBox(gun108_r1_r1, 196, 129, -2.0F, -37.8F, -34.5F, 1, 1, 26, -0.001F, false));
		gun108_r1_r1.cubeList.add(new ModelBox(gun108_r1_r1, 149, 202, -2.0F, -37.4F, -34.5F, 1, 1, 26, -0.002F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 58, 34, -2.0F, -0.2F, -6.75F, 4, 1, 1, -0.002F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 75, 98, -2.0F, -0.2F, -8.0F, 4, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 136, 150, -2.0F, -0.2F, -7.5F, 4, 1, 9, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -9.5628F, -1.4909F);
		body.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3491F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 55, 69, -1.0F, -0.7F, -0.95F, 2, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.5F, -16.9525F, -11.1634F);
		body.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.384F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 84, 5, 0.5F, 9.975F, 5.7F, 2, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 84, 24, 0.5F, 10.475F, 5.7F, 2, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 0, 0.5F, 6.475F, 5.2F, 2, 5, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 21, 0.5F, 11.875F, 5.2F, 2, 9, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 142, 0, -0.502F, 2.4F, 2.5F, 4, 18, 3, -0.002F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.0F, -16.9525F, -11.1634F);
		body.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.9687F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 41, -1.0F, 1.4F, -4.9F, 4, 1, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.0F, -16.9525F, -11.1634F);
		body.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.2793F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 60, 0.0F, 5.55F, -0.6F, 2, 1, 2, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 114, 76, -1.0F, 4.95F, 0.4F, 4, 1, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.0F, -16.9525F, -11.1634F);
		body.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.3142F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 138, 102, -1.0F, 4.1F, -3.0F, 4, 1, 2, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 59, 96, -1.0F, 0.4F, -1.9F, 4, 3, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 104, 39, 0.0F, 5.4F, -2.5F, 2, 13, 2, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 122, 0, -1.0F, 0.4F, -1.4F, 4, 19, 6, -0.002F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.0F, -16.9525F, -11.1634F);
		body.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.9425F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 127, -1.0F, -1.7F, -2.2F, 4, 2, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.0F, -16.9525F, -11.1634F);
		body.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.5934F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 0, 0.0F, -1.8F, -3.5F, 2, 6, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, -17.4525F, -3.1634F);
		body.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.3316F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 103, 142, -2.0F, -0.1F, 1.1F, 4, 1, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, -17.4525F, -3.1634F);
		body.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.925F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 115, 142, -2.0F, -1.1F, 0.2F, 4, 1, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, -15.6525F, -3.0634F);
		body.addChild(cube_r16);
		setRotationAngle(cube_r16, 1.2566F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 75, -2.0F, -0.1F, -3.8F, 4, 1, 3, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 92, 106, -1.0F, 0.6F, -3.8F, 2, 1, 3, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.0F, -15.6525F, -3.0634F);
		body.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.6283F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 84, 62, 0.0F, 1.7F, 3.9F, 2, 1, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(5.0F, -15.6525F, -3.0634F);
		body.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.1922F, -0.4293F, -0.0808F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 94, -2.7F, -0.3F, 3.8F, 1, 1, 2, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.0F, -15.6525F, -3.0634F);
		body.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.1922F, 0.4293F, 0.0808F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 92, 94, -1.9F, -0.3F, 2.0F, 1, 1, 2, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.0F, -15.6525F, -3.0634F);
		body.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.1745F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 61, 26, 0.0F, -0.3F, 2.7F, 2, 1, 2, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.0F, -15.6525F, -3.0634F);
		body.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.7156F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 46, 11, 0.0F, 1.2F, -2.2F, 2, 1, 5, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 74, 39, -1.0F, -0.7F, -2.2F, 4, 2, 3, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.925F, 17.1975F, -5.1634F);
		body.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.0175F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 80, 111, -1.675F, -34.6F, -25.2F, 4, 1, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.5F, -14.7525F, -29.8634F);
		body.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 74, 0, -1.0F, -0.3F, 6.8F, 1, 1, 3, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 30, 153, -1.0F, -0.3F, 5.1F, 1, 1, 1, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 153, 70, -1.0F, -0.3F, 3.1F, 1, 1, 1, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 76, 153, -1.0F, -0.3F, 1.1F, 1, 1, 1, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 80, 153, -1.0F, -0.3F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(4.5F, -14.7525F, -29.8634F);
		body.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 153, 21, -2.825F, -3.1F, 5.1F, 1, 1, 1, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 22, 153, -2.825F, -3.1F, 3.1F, 1, 1, 1, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 26, 153, -2.825F, -3.1F, 1.1F, 1, 1, 1, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 153, 28, -2.825F, -3.1F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 74, 45, -2.825F, -3.1F, 6.8F, 1, 1, 3, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, -10.4525F, -16.6634F);
		body.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.7156F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 84, 71, -1.0F, 1.0F, 1.5F, 2, 1, 1, 0.0F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 53, 119, -1.0F, 1.0F, 1.8F, 2, 1, 3, -0.002F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, -10.4525F, -16.6634F);
		body.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.8465F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 84, 86, -1.0F, 1.2F, -3.55F, 2, 1, 1, 0.0F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 64, 69, -1.0F, 1.2F, -3.3F, 2, 1, 2, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, -15.7525F, -16.6634F);
		body.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.5061F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 96, 76, -1.4F, -1.9F, -4.0F, 3, 1, 3, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 97, 125, -1.0F, -1.3F, -4.0F, 2, 1, 3, 0.0F, false));

		Grip = new ModelRenderer(this);
		Grip.setRotationPoint(-1.971F, 5.5849F, 7.8373F);
		M45A1Gun.addChild(Grip);
		Grip.cubeList.add(new ModelBox(Grip, 153, 0, -0.6827F, -6.556F, -1.3043F, 1, 1, 1, 0.0F, false));
		Grip.cubeList.add(new ModelBox(Grip, 140, 152, 3.5923F, 4.744F, 2.3957F, 1, 1, 1, 0.0F, false));
		Grip.cubeList.add(new ModelBox(Grip, 136, 152, 3.5923F, -6.556F, -1.3043F, 1, 1, 1, 0.0F, false));
		Grip.cubeList.add(new ModelBox(Grip, 128, 152, -0.6827F, 4.744F, 2.3957F, 1, 1, 1, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-0.1327F, -0.356F, 1.0957F);
		Grip.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.3231F, -0.2322F, -0.0769F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 38, 20, -0.8F, -7.0F, -3.3F, 1, 15, 2, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(4.0673F, -0.356F, 1.0957F);
		Grip.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.3292F, -0.2983F, -0.1001F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 109, 57, 0.0F, -6.0F, 1.2F, 1, 14, 2, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(4.0673F, -0.356F, 1.0957F);
		Grip.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.3142F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 117, 79, -0.5F, -8.0F, -1.5F, 1, 16, 3, 0.0F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 76, 119, -4.7F, -8.0F, -1.5F, 1, 16, 3, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(4.0673F, -0.356F, 1.0957F);
		Grip.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.3231F, 0.2322F, 0.0769F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 103, 57, -0.2F, -7.0F, -3.3F, 1, 15, 2, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-0.1327F, -0.356F, 1.0957F);
		Grip.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.3292F, 0.2983F, 0.1001F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 111, 82, -1.0F, -6.0F, 1.2F, 1, 14, 2, 0.0F, false));

		hammer3 = new ModelRenderer(this);
		hammer3.setRotationPoint(-0.0037F, -3.8465F, 11.501F);
		M45A1Gun.addChild(hammer3);
		setRotationAngle(hammer3, -0.8901F, 0.0F, 0.0F);
		

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, -3.888F, -1.4577F);
		hammer3.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.3752F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 114, 152, -0.5F, -0.96F, 0.476F, 1, 1, 1, 0.0F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 118, 152, -0.5F, -1.66F, -0.249F, 1, 1, 1, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, -3.888F, -1.4577F);
		hammer3.addChild(cube_r34);
		setRotationAngle(cube_r34, -0.4102F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 124, 152, -0.5F, -1.7155F, -0.6341F, 1, 1, 1, 0.0F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 60, 119, -0.5F, -0.9905F, -1.3591F, 1, 2, 1, 0.0F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 97, 119, -0.5F, -0.9905F, 0.0909F, 1, 2, 1, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.0F, -3.888F, -1.4577F);
		hammer3.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.8465F, 0.0F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 11, -0.5F, -1.0804F, -1.6146F, 1, 4, 1, 0.0F, false));
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