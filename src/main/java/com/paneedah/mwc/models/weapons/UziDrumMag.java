package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziDrumMag extends ModelWithAttachments {
	private final ModelRenderer DrumMag;
	private final ModelRenderer magazine_r1;
	private final ModelRenderer magazine_r2;
	private final ModelRenderer magazine_r3;
	private final ModelRenderer magazine_r4;
	private final ModelRenderer magazine_r5;
	private final ModelRenderer magazine_r6;
	private final ModelRenderer magazine_r7;
	private final ModelRenderer magazine_r8;
	private final ModelRenderer magazine_r9;
	private final ModelRenderer magazine_r10;
	private final ModelRenderer magazine_r11;
	private final ModelRenderer magazine_r12;
	private final ModelRenderer magazine_r13;
	private final ModelRenderer magazine_r14;
	private final ModelRenderer magazine_r15;
	private final ModelRenderer magazine_r16;
	private final ModelRenderer magazine_r17;
	private final ModelRenderer magazine_r18;
	private final ModelRenderer magazine_r19;
	private final ModelRenderer magazine_r20;
	private final ModelRenderer magazine_r21;
	private final ModelRenderer magazine_r22;
	private final ModelRenderer magazine_r23;
	private final ModelRenderer magazine_r24;
	private final ModelRenderer magazine_r25;
	private final ModelRenderer magazine_r26;
	private final ModelRenderer magazine_r27;
	private final ModelRenderer magazine_r28;

	public UziDrumMag() {
		textureWidth = 240;
		textureHeight = 240;

		DrumMag = new ModelRenderer(this);
		DrumMag.setRotationPoint(-6.3658F, 24.0F, -0.9549F);
		DrumMag.cubeList.add(new ModelBox(DrumMag, 33, 72, 3.8658F, -31.5F, -5.0451F, 2, 12, 5, 0.0F, false));
		DrumMag.cubeList.add(new ModelBox(DrumMag, 66, 98, 3.3658F, -31.48F, -4.5451F, 3, 12, 4, 0.0F, false));

		magazine_r1 = new ModelRenderer(this);
		magazine_r1.setRotationPoint(4.8658F, -32.0F, -2.5451F);
		DrumMag.addChild(magazine_r1);
		setRotationAngle(magazine_r1, 0.2618F, 0.0F, 0.0F);
		magazine_r1.cubeList.add(new ModelBox(magazine_r1, 76, 116, 0.4F, 0.0F, -2.2F, 1, 1, 4, 0.0F, false));
		magazine_r1.cubeList.add(new ModelBox(magazine_r1, 116, 81, -1.48F, 0.0F, -2.2F, 1, 1, 4, 0.0F, false));

		magazine_r2 = new ModelRenderer(this);
		magazine_r2.setRotationPoint(4.7658F, -12.7264F, -4.3951F);
		DrumMag.addChild(magazine_r2);
		setRotationAngle(magazine_r2, -0.2025F, 0.0538F, 0.2563F);
		magazine_r2.cubeList.add(new ModelBox(magazine_r2, 118, 123, -1.998F, -7.7237F, -2.15F, 4, 15, 3, 0.0F, false));

		magazine_r3 = new ModelRenderer(this);
		magazine_r3.setRotationPoint(4.7658F, -12.7264F, -4.3951F);
		DrumMag.addChild(magazine_r3);
		setRotationAngle(magazine_r3, -0.1492F, 0.1476F, 0.7744F);
		magazine_r3.cubeList.add(new ModelBox(magazine_r3, 0, 129, -2.019F, -7.7275F, -2.15F, 4, 15, 3, 0.0F, false));

		magazine_r4 = new ModelRenderer(this);
		magazine_r4.setRotationPoint(4.7658F, -12.7264F, -4.3951F);
		DrumMag.addChild(magazine_r4);
		setRotationAngle(magazine_r4, -0.055F, 0.2022F, 1.3034F);
		magazine_r4.cubeList.add(new ModelBox(magazine_r4, 26, 129, -2.2255F, -7.5548F, -2.15F, 4, 15, 3, 0.0F, false));

		magazine_r5 = new ModelRenderer(this);
		magazine_r5.setRotationPoint(4.7658F, -12.7264F, -4.3951F);
		DrumMag.addChild(magazine_r5);
		setRotationAngle(magazine_r5, -0.055F, -0.2022F, -1.3034F);
		magazine_r5.cubeList.add(new ModelBox(magazine_r5, 133, 0, -1.9745F, -7.7548F, -2.15F, 4, 15, 3, 0.0F, false));

		magazine_r6 = new ModelRenderer(this);
		magazine_r6.setRotationPoint(4.7658F, -12.7264F, -4.3951F);
		DrumMag.addChild(magazine_r6);
		setRotationAngle(magazine_r6, -0.1492F, -0.1476F, -0.7744F);
		magazine_r6.cubeList.add(new ModelBox(magazine_r6, 135, 59, -1.981F, -7.7275F, -2.15F, 4, 15, 3, 0.0F, false));

		magazine_r7 = new ModelRenderer(this);
		magazine_r7.setRotationPoint(4.7658F, -12.7264F, -4.3951F);
		DrumMag.addChild(magazine_r7);
		setRotationAngle(magazine_r7, -0.2025F, -0.0538F, -0.2563F);
		magazine_r7.cubeList.add(new ModelBox(magazine_r7, 136, 26, -2.002F, -7.7237F, -2.15F, 4, 15, 3, 0.0F, false));

		magazine_r8 = new ModelRenderer(this);
		magazine_r8.setRotationPoint(4.7239F, -14.3403F, -7.6096F);
		DrumMag.addChild(magazine_r8);
		setRotationAngle(magazine_r8, 0.0093F, 0.2092F, 1.6154F);
		magazine_r8.cubeList.add(new ModelBox(magazine_r8, 19, 0, -1.0F, -3.0F, -0.3F, 2, 6, 1, 0.0F, false));
		magazine_r8.cubeList.add(new ModelBox(magazine_r8, 64, 19, -0.6F, 1.6F, -0.7F, 1, 1, 1, -0.2F, false));

		magazine_r9 = new ModelRenderer(this);
		magazine_r9.setRotationPoint(4.7239F, -14.4234F, -8.0009F);
		DrumMag.addChild(magazine_r9);
		setRotationAngle(magazine_r9, 0.1614F, 0.134F, 2.4543F);
		magazine_r9.cubeList.add(new ModelBox(magazine_r9, 16, 75, -0.8F, -0.9F, -0.4F, 2, 2, 1, -0.3F, false));

		magazine_r10 = new ModelRenderer(this);
		magazine_r10.setRotationPoint(6.9261F, -14.3649F, -7.7066F);
		DrumMag.addChild(magazine_r10);
		setRotationAngle(magazine_r10, 0.1838F, 0.2092F, 1.6154F);
		magazine_r10.cubeList.add(new ModelBox(magazine_r10, 64, 21, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		magazine_r11 = new ModelRenderer(this);
		magazine_r11.setRotationPoint(4.6658F, -13.4264F, -5.2951F);
		DrumMag.addChild(magazine_r11);
		setRotationAngle(magazine_r11, -0.055F, 0.2022F, 1.3034F);
		magazine_r11.cubeList.add(new ModelBox(magazine_r11, 37, 19, -1.5255F, -5.0548F, -2.425F, 3, 10, 1, 0.0F, false));

		magazine_r12 = new ModelRenderer(this);
		magazine_r12.setRotationPoint(4.6658F, -13.4264F, -5.2951F);
		DrumMag.addChild(magazine_r12);
		setRotationAngle(magazine_r12, -0.1492F, 0.1476F, 0.7744F);
		magazine_r12.cubeList.add(new ModelBox(magazine_r12, 0, 58, -1.619F, -5.0275F, -2.425F, 3, 10, 1, 0.0F, false));

		magazine_r13 = new ModelRenderer(this);
		magazine_r13.setRotationPoint(4.6658F, -13.4264F, -5.2951F);
		DrumMag.addChild(magazine_r13);
		setRotationAngle(magazine_r13, -0.2025F, 0.0538F, 0.2563F);
		magazine_r13.cubeList.add(new ModelBox(magazine_r13, 77, 0, -1.598F, -5.0237F, -2.425F, 3, 10, 1, 0.0F, false));

		magazine_r14 = new ModelRenderer(this);
		magazine_r14.setRotationPoint(4.7658F, -13.4264F, -5.2951F);
		DrumMag.addChild(magazine_r14);
		setRotationAngle(magazine_r14, -0.2025F, -0.0538F, -0.2563F);
		magazine_r14.cubeList.add(new ModelBox(magazine_r14, 0, 104, -1.602F, -5.0237F, -2.425F, 3, 10, 1, 0.0F, false));

		magazine_r15 = new ModelRenderer(this);
		magazine_r15.setRotationPoint(4.7658F, -13.4264F, -5.2951F);
		DrumMag.addChild(magazine_r15);
		setRotationAngle(magazine_r15, -0.1492F, -0.1476F, -0.7744F);
		magazine_r15.cubeList.add(new ModelBox(magazine_r15, 13, 104, -1.681F, -5.0275F, -2.425F, 3, 10, 1, 0.0F, false));

		magazine_r16 = new ModelRenderer(this);
		magazine_r16.setRotationPoint(4.7658F, -13.4264F, -5.2951F);
		DrumMag.addChild(magazine_r16);
		setRotationAngle(magazine_r16, -0.055F, -0.2022F, -1.3034F);
		magazine_r16.cubeList.add(new ModelBox(magazine_r16, 107, 0, -1.6745F, -5.0548F, -2.425F, 3, 10, 1, 0.0F, false));

		magazine_r17 = new ModelRenderer(this);
		magazine_r17.setRotationPoint(4.7658F, -13.6264F, -7.7951F);
		DrumMag.addChild(magazine_r17);
		setRotationAngle(magazine_r17, -0.2025F, -0.0538F, -0.2563F);
		magazine_r17.cubeList.add(new ModelBox(magazine_r17, 136, 101, -2.002F, -7.5237F, 0.65F, 4, 15, 2, 0.2F, false));

		magazine_r18 = new ModelRenderer(this);
		magazine_r18.setRotationPoint(4.7658F, -13.6264F, -7.7951F);
		DrumMag.addChild(magazine_r18);
		setRotationAngle(magazine_r18, -0.055F, 0.2022F, 1.3034F);
		magazine_r18.cubeList.add(new ModelBox(magazine_r18, 192, 147, -2.0255F, -7.5548F, 0.65F, 4, 15, 2, 0.2F, false));

		magazine_r19 = new ModelRenderer(this);
		magazine_r19.setRotationPoint(4.7658F, -13.6264F, -7.7951F);
		DrumMag.addChild(magazine_r19);
		setRotationAngle(magazine_r19, -0.1492F, 0.1476F, 0.7744F);
		magazine_r19.cubeList.add(new ModelBox(magazine_r19, 40, 196, -2.019F, -7.5275F, 0.65F, 4, 15, 2, 0.2F, false));

		magazine_r20 = new ModelRenderer(this);
		magazine_r20.setRotationPoint(4.7658F, -13.6264F, -7.7951F);
		DrumMag.addChild(magazine_r20);
		setRotationAngle(magazine_r20, -0.2025F, 0.0538F, 0.2563F);
		magazine_r20.cubeList.add(new ModelBox(magazine_r20, 52, 196, -1.998F, -7.5237F, 0.65F, 4, 15, 2, 0.2F, false));

		magazine_r21 = new ModelRenderer(this);
		magazine_r21.setRotationPoint(4.7658F, -13.6264F, -7.7951F);
		DrumMag.addChild(magazine_r21);
		setRotationAngle(magazine_r21, -0.1492F, -0.1476F, -0.7744F);
		magazine_r21.cubeList.add(new ModelBox(magazine_r21, 64, 196, -1.981F, -7.5275F, 0.65F, 4, 15, 2, 0.2F, false));

		magazine_r22 = new ModelRenderer(this);
		magazine_r22.setRotationPoint(4.7658F, -13.6264F, -7.7951F);
		DrumMag.addChild(magazine_r22);
		setRotationAngle(magazine_r22, -0.055F, -0.2022F, -1.3034F);
		magazine_r22.cubeList.add(new ModelBox(magazine_r22, 76, 196, -1.9745F, -7.5548F, 0.65F, 4, 15, 2, 0.2F, false));

		magazine_r23 = new ModelRenderer(this);
		magazine_r23.setRotationPoint(4.7658F, -12.9264F, -4.3951F);
		DrumMag.addChild(magazine_r23);
		setRotationAngle(magazine_r23, -0.2025F, -0.0538F, -0.2563F);
		magazine_r23.cubeList.add(new ModelBox(magazine_r23, 88, 197, -2.002F, -7.5237F, 0.65F, 4, 15, 2, 0.2F, false));

		magazine_r24 = new ModelRenderer(this);
		magazine_r24.setRotationPoint(4.7658F, -12.9264F, -4.3951F);
		DrumMag.addChild(magazine_r24);
		setRotationAngle(magazine_r24, -0.055F, 0.2022F, 1.3034F);
		magazine_r24.cubeList.add(new ModelBox(magazine_r24, 100, 198, -2.0255F, -7.5548F, 0.65F, 4, 15, 2, 0.2F, false));

		magazine_r25 = new ModelRenderer(this);
		magazine_r25.setRotationPoint(4.7658F, -12.9264F, -4.3951F);
		DrumMag.addChild(magazine_r25);
		setRotationAngle(magazine_r25, -0.1492F, 0.1476F, 0.7744F);
		magazine_r25.cubeList.add(new ModelBox(magazine_r25, 112, 198, -2.019F, -7.5275F, 0.65F, 4, 15, 2, 0.2F, false));

		magazine_r26 = new ModelRenderer(this);
		magazine_r26.setRotationPoint(4.7658F, -12.9264F, -4.3951F);
		DrumMag.addChild(magazine_r26);
		setRotationAngle(magazine_r26, -0.2025F, 0.0538F, 0.2563F);
		magazine_r26.cubeList.add(new ModelBox(magazine_r26, 124, 198, -1.998F, -7.5237F, 0.65F, 4, 15, 2, 0.2F, false));

		magazine_r27 = new ModelRenderer(this);
		magazine_r27.setRotationPoint(4.7658F, -12.9264F, -4.3951F);
		DrumMag.addChild(magazine_r27);
		setRotationAngle(magazine_r27, -0.1492F, -0.1476F, -0.7744F);
		magazine_r27.cubeList.add(new ModelBox(magazine_r27, 199, 125, -1.981F, -7.5275F, 0.65F, 4, 15, 2, 0.2F, false));

		magazine_r28 = new ModelRenderer(this);
		magazine_r28.setRotationPoint(4.7658F, -12.9264F, -4.3951F);
		DrumMag.addChild(magazine_r28);
		setRotationAngle(magazine_r28, -0.055F, -0.2022F, -1.3034F);
		magazine_r28.cubeList.add(new ModelBox(magazine_r28, 176, 199, -1.9745F, -7.5548F, 0.65F, 4, 15, 2, 0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		DrumMag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}