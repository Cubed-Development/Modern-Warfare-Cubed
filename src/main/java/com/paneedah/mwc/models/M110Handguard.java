package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M110Handguard extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer receiver17_r1;
	private final ModelRenderer receiver16_r1;
	private final ModelRenderer receiver18_r1;
	private final ModelRenderer receiver17_r2;
	private final ModelRenderer receiver17_r3;
	private final ModelRenderer receiver16_r2;
	private final ModelRenderer receiver15_r1;
	private final ModelRenderer receiver14_r1;
	private final ModelRenderer receiver16_r3;
	private final ModelRenderer receiver15_r2;
	private final ModelRenderer receiver16_r4;
	private final ModelRenderer receiver15_r3;
	private final ModelRenderer receiver14_r2;
	private final ModelRenderer receiver15_r4;
	private final ModelRenderer receiver14_r3;
	private final ModelRenderer receiver16_r5;
	private final ModelRenderer receiver15_r5;
	private final ModelRenderer gun30_r1;
	private final ModelRenderer gun29_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun38_r1;
	private final ModelRenderer gun37_r1;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun51_r1;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun57_r1;
	private final ModelRenderer gun56_r1;
	private final ModelRenderer gun59_r1;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun59_r2;
	private final ModelRenderer gun59_r3;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun87_r1;
	private final ModelRenderer gun88_r1;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer gun132;
	private final ModelRenderer gun133_r1;
	private final ModelRenderer gun67;
	private final ModelRenderer gun60;
	private final ModelRenderer receiver;
	private final ModelRenderer gun263_r1;
	private final ModelRenderer gun264_r1;
	private final ModelRenderer gun266_r1;
	private final ModelRenderer receiver14_r4;
	private final ModelRenderer receiver14_r5;
	private final ModelRenderer receiver13_r1;
	private final ModelRenderer receiver12_r1;
	private final ModelRenderer receiver13_r2;
	private final ModelRenderer receiver11_r1;
	private final ModelRenderer gun125_r1;
	private final ModelRenderer gun170;
	private final ModelRenderer gun172_r1;
	private final ModelRenderer gun172_r2;
	private final ModelRenderer gun264;
	private final ModelRenderer action;
	private final ModelRenderer receiver15_r6;
	private final ModelRenderer receiver16_r6;
	private final ModelRenderer receiver15_r7;
	private final ModelRenderer receiver16_r7;
	private final ModelRenderer grip;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip3_r2;
	private final ModelRenderer grip4_r1;
	private final ModelRenderer grip5_r1;
	private final ModelRenderer grip13_r1;
	private final ModelRenderer handguard;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
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
	private final ModelRenderer bone3;
	private final ModelRenderer handguard118_r1;
	private final ModelRenderer handguard119_r1;
	private final ModelRenderer handguard118_r2;
	private final ModelRenderer handguard117_r1;
	private final ModelRenderer handguard112_r1;
	private final ModelRenderer handguard113_r1;
	private final ModelRenderer handguard108_r1;
	private final ModelRenderer handguard109_r1;
	private final ModelRenderer handguard109_r2;
	private final ModelRenderer handguard108_r2;
	private final ModelRenderer handguard107_r1;
	private final ModelRenderer handguard108_r3;
	private final ModelRenderer bone2;
	private final ModelRenderer handguard119_r2;
	private final ModelRenderer handguard120_r1;
	private final ModelRenderer handguard119_r3;
	private final ModelRenderer handguard118_r3;
	private final ModelRenderer handguard113_r2;
	private final ModelRenderer handguard114_r1;
	private final ModelRenderer handguard109_r3;
	private final ModelRenderer handguard110_r1;
	private final ModelRenderer handguard110_r2;
	private final ModelRenderer handguard109_r4;
	private final ModelRenderer handguard108_r4;
	private final ModelRenderer handguard109_r5;
	private final ModelRenderer bone4;
	private final ModelRenderer handguard120_r2;
	private final ModelRenderer handguard121_r1;
	private final ModelRenderer handguard120_r3;
	private final ModelRenderer handguard119_r4;
	private final ModelRenderer handguard114_r2;
	private final ModelRenderer handguard115_r1;
	private final ModelRenderer handguard110_r3;
	private final ModelRenderer handguard111_r1;
	private final ModelRenderer handguard111_r2;
	private final ModelRenderer handguard110_r4;
	private final ModelRenderer handguard109_r6;
	private final ModelRenderer handguard110_r5;
	private final ModelRenderer m110_stock;
	private final ModelRenderer receiver16_r8;
	private final ModelRenderer receiver19_r1;
	private final ModelRenderer receiver18_r2;
	private final ModelRenderer receiver23_r1;
	private final ModelRenderer receiver22_r1;
	private final ModelRenderer receiver21_r1;
	private final ModelRenderer receiver20_r1;
	private final ModelRenderer receiver19_r2;
	private final ModelRenderer receiver18_r3;
	private final ModelRenderer receiver19_r3;
	private final ModelRenderer receiver20_r2;
	private final ModelRenderer receiver21_r2;
	private final ModelRenderer receiver18_r4;
	private final ModelRenderer receiver16_r9;
	private final ModelRenderer receiver17_r4;
	private final ModelRenderer receiver17_r5;
	private final ModelRenderer magazine;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;

	public M110Handguard() {
		textureWidth = 310;
		textureHeight = 310;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 43, 18, -1.8F, -37.8F, -87.5F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 13, 71, -1.8F, -37.3F, -68.699F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 42, 72, -2.2F, -37.8F, -87.5F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 64, -2.2F, -37.3F, -68.7F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 84, 83, -2.2F, -38.2F, -87.5F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 64, -2.2F, -38.7F, -68.7F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 86, -1.8F, -38.2F, -87.5F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 27, -1.8F, -38.7F, -68.699F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 84, 90, -1.6F, -38.0F, -87.5F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 32, -1.6F, -38.0F, -68.7F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 93, -2.4F, -38.0F, -87.5F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 14, 64, -2.4F, -38.0F, -68.7F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 93, -2.0F, -37.6F, -87.5F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 71, -2.0F, -36.6F, -68.701F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 67, 98, -2.0F, -38.4F, -87.5F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 39, -2.0F, -39.4F, -68.701F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -2.2F, -38.0F, -81.499F, 1, 1, 57, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 58, -1.8F, -38.0F, -81.501F, 1, 1, 57, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 1, -2.0F, -37.8F, -81.5F, 1, 1, 57, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 59, -2.0F, -38.2F, -81.5F, 1, 1, 57, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 59, -0.05F, -36.1F, -12.75F, 1, 2, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 110, 0.0F, -34.6F, -12.751F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 84, 93, -0.35F, -32.8F, -16.5F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 49, -0.3501F, -32.2F, -16.501F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -0.35F, -31.4F, -16.5F, 1, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 7, 22, -0.349F, -28.0F, -16.501F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 35, 113, -3.7F, -33.9F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 84, 77, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 102, 0, -3.3F, -36.0F, -1.001F, 3, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 16, 18, -0.7F, -36.0F, -0.998F, 1, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 93, -1.349F, -35.7F, -24.7F, 2, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 102, 102, -1.348F, -35.05F, -23.95F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 96, -3.648F, -35.051F, -23.95F, 3, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 73, 6, -3.649F, -35.7F, -24.701F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 51, -1.35F, -36.0F, -24.702F, 2, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 73, 9, -3.65F, -36.0F, -24.703F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 0, -0.4F, -33.5F, -16.3F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 6, 64, -0.35F, -35.5F, -16.5F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 13, 0.049F, -34.2F, -16.899F, 1, 2, 1, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 0, -0.148F, -35.7F, -23.001F, 1, 1, 12, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 28, -3.848F, -35.7F, -23.001F, 1, 1, 12, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 32, 0.152F, -31.7F, -15.001F, 1, 2, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 2, 0.151F, -32.1F, -14.201F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 109, 111, 0.151F, -32.1F, -13.501F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 27, -0.049F, -31.9F, -13.5F, 1, 2, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 28, -0.13F, -34.4F, -13.85F, 1, 3, 1, -0.35F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 0, 0.15F, -32.3F, -14.2F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 112, 0.15F, -32.3F, -13.5F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 103, 111, 0.05F, -32.2F, -13.9F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 78, -0.149F, -36.201F, -14.002F, 1, 1, 3, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 6, -3.5F, -36.001F, -13.2F, 1, 2, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 99, 111, -3.5F, -32.501F, -13.2F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 13, 0, -0.5F, -35.001F, -13.2F, 1, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 0, -3.5F, -36.0F, -23.2F, 4, 8, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 46, -3.5F, -28.0F, -18.2F, 4, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 68, -0.6F, -36.0F, -1.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 83, 111, -0.598F, -36.0F, -2.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 91, 111, -0.599F, -35.5F, -1.501F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 87, 111, -0.6F, -35.5F, -2.001F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 70, -0.3F, -32.4F, -5.2F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 64, -0.3F, -34.5F, -2.8F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 66, -0.3F, -32.0F, -5.2F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 48, -0.3F, -34.5F, -2.4F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 84, 59, -3.3F, -36.0F, -14.0F, 3, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 28, -0.7F, -36.001F, -14.0F, 1, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 72, -3.001F, -32.0F, -13.8F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 77, -3.001F, -27.0F, -13.3F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 19, -3.001F, -27.002F, -7.8F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 51, -3.001F, -27.0F, -11.8F, 3, 1, 5, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 73, 0, -2.999F, -31.001F, -6.5F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 13, -2.65F, -39.401F, 1.0015F, 2, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 18, -1.35F, -39.4F, 1.0025F, 1, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 89, 68, -1.1F, -37.7F, 0.8012F, 2, 1, 2, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 89, 64, -3.9F, -37.7F, 0.8012F, 2, 1, 2, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 102, -1.099F, -37.7F, 2.202F, 2, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 102, -3.899F, -37.7F, 2.202F, 2, 1, 1, -0.2F, false));

		receiver17_r1 = new ModelRenderer(this);
		receiver17_r1.setRotationPoint(0.25F, -37.5F, 2.35F);
		gun.addChild(receiver17_r1);
		setRotationAngle(receiver17_r1, 0.0F, 0.0F, 0.4014F);
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 59, 83, -0.999F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 32, 86, -1.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver16_r1 = new ModelRenderer(this);
		receiver16_r1.setRotationPoint(-3.25F, -37.5F, 2.35F);
		gun.addChild(receiver16_r1);
		setRotationAngle(receiver16_r1, 0.0F, 0.0F, -0.4014F);
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 76, 59, -0.001F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 24, 89, 0.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver18_r1 = new ModelRenderer(this);
		receiver18_r1.setRotationPoint(-1.5F, -35.75F, 2.35F);
		gun.addChild(receiver18_r1);
		setRotationAngle(receiver18_r1, 0.0F, 0.0F, -0.4014F);
		receiver18_r1.cubeList.add(new ModelBox(receiver18_r1, 84, 83, 0.35F, -0.999F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver18_r1.cubeList.add(new ModelBox(receiver18_r1, 0, 86, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r2 = new ModelRenderer(this);
		receiver17_r2.setRotationPoint(-1.5F, -39.25F, 2.35F);
		gun.addChild(receiver17_r2);
		setRotationAngle(receiver17_r2, 0.0F, 0.0F, 0.4014F);
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 84, 86, 0.35F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 67, 86, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r3 = new ModelRenderer(this);
		receiver17_r3.setRotationPoint(-1.5F, -35.75F, 2.35F);
		gun.addChild(receiver17_r3);
		setRotationAngle(receiver17_r3, 0.0F, 0.0F, 0.4014F);
		receiver17_r3.cubeList.add(new ModelBox(receiver17_r3, 67, 83, -1.35F, -0.999F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver17_r3.cubeList.add(new ModelBox(receiver17_r3, 24, 86, -1.0F, -1.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver16_r2 = new ModelRenderer(this);
		receiver16_r2.setRotationPoint(-1.5F, -39.25F, 2.35F);
		gun.addChild(receiver16_r2);
		setRotationAngle(receiver16_r2, 0.0F, 0.0F, -0.4014F);
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 8, 88, -1.35F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 0, 89, -1.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver15_r1 = new ModelRenderer(this);
		receiver15_r1.setRotationPoint(0.25F, -37.5F, 2.35F);
		gun.addChild(receiver15_r1);
		setRotationAngle(receiver15_r1, 0.0F, 0.0F, -0.4014F);
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 59, 86, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 51, 86, -0.999F, -1.35F, -0.0001F, 1, 1, 2, 0.0F, false));

		receiver14_r1 = new ModelRenderer(this);
		receiver14_r1.setRotationPoint(-3.25F, -37.5F, 2.35F);
		gun.addChild(receiver14_r1);
		setRotationAngle(receiver14_r1, 0.0F, 0.0F, 0.4014F);
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 32, 89, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 84, 90, -0.001F, -1.35F, -0.0001F, 1, 1, 2, 0.0F, false));

		receiver16_r3 = new ModelRenderer(this);
		receiver16_r3.setRotationPoint(-3.37F, -36.0F, 0.0F);
		gun.addChild(receiver16_r3);
		setRotationAngle(receiver16_r3, 0.0F, 0.0F, -0.0524F);
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 14, 28, 0.0F, 0.0F, -1.999F, 1, 2, 5, 0.0F, false));

		receiver15_r2 = new ModelRenderer(this);
		receiver15_r2.setRotationPoint(0.37F, -36.0F, 0.0F);
		gun.addChild(receiver15_r2);
		setRotationAngle(receiver15_r2, 0.0F, 0.0F, 0.0524F);
		receiver15_r2.cubeList.add(new ModelBox(receiver15_r2, 46, 0, -1.0F, 0.0F, -0.999F, 1, 2, 4, 0.0F, false));

		receiver16_r4 = new ModelRenderer(this);
		receiver16_r4.setRotationPoint(-3.7F, -36.9F, 1.0F);
		gun.addChild(receiver16_r4);
		setRotationAngle(receiver16_r4, -0.9599F, 0.0F, -0.3142F);
		receiver16_r4.cubeList.add(new ModelBox(receiver16_r4, 42, 75, -0.001F, 0.0F, 0.0012F, 2, 2, 1, 0.0F, false));

		receiver15_r3 = new ModelRenderer(this);
		receiver15_r3.setRotationPoint(0.7F, -36.9F, 1.0F);
		gun.addChild(receiver15_r3);
		setRotationAngle(receiver15_r3, -0.9599F, 0.0F, 0.3142F);
		receiver15_r3.cubeList.add(new ModelBox(receiver15_r3, 50, 75, -1.999F, 0.0F, 0.0012F, 2, 2, 1, 0.0F, false));

		receiver14_r2 = new ModelRenderer(this);
		receiver14_r2.setRotationPoint(0.7F, -36.9F, 1.0F);
		gun.addChild(receiver14_r2);
		setRotationAngle(receiver14_r2, 0.0F, 0.0F, 0.3142F);
		receiver14_r2.cubeList.add(new ModelBox(receiver14_r2, 88, 27, -2.0F, 0.0F, 0.0012F, 2, 2, 2, 0.0F, false));

		receiver15_r4 = new ModelRenderer(this);
		receiver15_r4.setRotationPoint(-3.7F, -37.5F, 1.0F);
		gun.addChild(receiver15_r4);
		setRotationAngle(receiver15_r4, 0.0F, 0.0F, 0.5061F);
		receiver15_r4.cubeList.add(new ModelBox(receiver15_r4, 5, 76, -0.001F, -2.15F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver15_r4.cubeList.add(new ModelBox(receiver15_r4, 50, 28, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		receiver14_r3 = new ModelRenderer(this);
		receiver14_r3.setRotationPoint(0.7F, -37.5F, 1.0F);
		gun.addChild(receiver14_r3);
		setRotationAngle(receiver14_r3, 0.0F, 0.0F, -0.5061F);
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 24, 93, -0.999F, -2.15F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 34, 58, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		receiver16_r5 = new ModelRenderer(this);
		receiver16_r5.setRotationPoint(-1.5F, -37.5F, 3.1F);
		gun.addChild(receiver16_r5);
		setRotationAngle(receiver16_r5, 0.0F, 0.0F, -0.3316F);
		receiver16_r5.cubeList.add(new ModelBox(receiver16_r5, 39, 105, -1.0F, -1.001F, 8.0015F, 2, 2, 7, -0.1F, false));
		receiver16_r5.cubeList.add(new ModelBox(receiver16_r5, 40, 158, -1.0F, -1.001F, -0.2985F, 2, 2, 15, -0.2F, false));

		receiver15_r5 = new ModelRenderer(this);
		receiver15_r5.setRotationPoint(-3.7F, -36.9F, 1.0F);
		gun.addChild(receiver15_r5);
		setRotationAngle(receiver15_r5, 0.0F, 0.0F, -0.3142F);
		receiver15_r5.cubeList.add(new ModelBox(receiver15_r5, 87, 18, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-3.2F, -31.0F, -7.6F);
		gun.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 92, 4, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-3.2F, -27.0F, -7.6F);
		gun.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.3562F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 59, 77, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -27.0F, -11.5F);
		gun.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 94, 77, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(0.5F, -33.7F, -11.3F);
		gun.addChild(gun39_r1);
		setRotationAngle(gun39_r1, -0.3665F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 112, 46, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(0.5F, -32.7F, -7.6F);
		gun.addChild(gun38_r1);
		setRotationAngle(gun38_r1, -0.3665F, 0.0F, 0.0F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 112, 78, -1.05F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-3.4F, -33.0F, -4.2F);
		gun.addChild(gun37_r1);
		setRotationAngle(gun37_r1, -0.3665F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 97, 53, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(-2.398F, -35.25F, -1.25F);
		gun.addChild(gun40_r1);
		setRotationAngle(gun40_r1, -0.3316F, 0.0F, 0.0F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 75, 111, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 79, 111, 2.1F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

		gun51_r1 = new ModelRenderer(this);
		gun51_r1.setRotationPoint(-3.9F, -27.5F, -21.2F);
		gun.addChild(gun51_r1);
		setRotationAngle(gun51_r1, 1.3756F, 0.0F, 0.0F);
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 28, 0, 0.1F, 0.0806F, 0.0981F, 4, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 71, 65, 0.101F, -2.4194F, 0.098F, 4, 3, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 53, 58, 3.7F, 0.08F, 0.098F, 1, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 14, 35, 3.699F, -2.42F, 0.1F, 1, 3, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-3.5F, -31.0F, -11.2F);
		gun.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.6488F, 0.0F, 0.0F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 88, 31, 2.999F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun57_r1 = new ModelRenderer(this);
		gun57_r1.setRotationPoint(0.65F, -35.5F, -22.8F);
		gun.addChild(gun57_r1);
		setRotationAngle(gun57_r1, 0.0F, 0.0F, -0.7854F);
		gun57_r1.cubeList.add(new ModelBox(gun57_r1, 0, 41, -0.799F, -0.8F, -0.201F, 1, 1, 12, -0.2F, false));

		gun56_r1 = new ModelRenderer(this);
		gun56_r1.setRotationPoint(0.65F, -34.9F, -22.8F);
		gun.addChild(gun56_r1);
		setRotationAngle(gun56_r1, 0.0F, 0.0F, -0.7854F);
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 0, 58, -0.799F, -0.8F, -0.201F, 1, 1, 12, -0.2F, false));

		gun59_r1 = new ModelRenderer(this);
		gun59_r1.setRotationPoint(0.85F, -31.4F, -14.7F);
		gun.addChild(gun59_r1);
		setRotationAngle(gun59_r1, -1.2566F, 0.0F, 0.0F);
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 12, 112, -0.698F, -1.3F, -0.3F, 1, 1, 1, -0.3F, false));
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 4, 112, -0.699F, -1.1F, -0.301F, 1, 1, 1, -0.3F, false));
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 8, 112, -0.699F, -0.7F, -0.301F, 1, 1, 1, -0.3F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(0.85F, -30.0F, -14.7F);
		gun.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 1.2566F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 16, 112, -0.698F, 0.3F, -0.3F, 1, 1, 1, -0.3F, false));
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 20, 112, -0.699F, 0.1F, -0.301F, 1, 1, 1, -0.3F, false));
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 24, 112, -0.699F, -0.3F, -0.301F, 1, 1, 1, -0.3F, false));

		gun59_r2 = new ModelRenderer(this);
		gun59_r2.setRotationPoint(0.75F, -34.8F, -24.402F);
		gun.addChild(gun59_r2);
		setRotationAngle(gun59_r2, -0.384F, 0.0F, 0.0F);
		gun59_r2.cubeList.add(new ModelBox(gun59_r2, 32, 112, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun59_r3 = new ModelRenderer(this);
		gun59_r3.setRotationPoint(-0.649F, -34.7F, -24.7F);
		gun.addChild(gun59_r3);
		setRotationAngle(gun59_r3, -0.6981F, 0.0F, 0.0F);
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 96, 51, -3.002F, -1.001F, 0.0F, 3, 1, 1, 0.0F, false));
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 13, 103, -0.701F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -30.2F, -8.95F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 21, 28, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun87_r1 = new ModelRenderer(this);
		gun87_r1.setRotationPoint(-3.1F, -33.1F, -13.7F);
		gun.addChild(gun87_r1);
		setRotationAngle(gun87_r1, 0.0F, 0.1047F, 0.0F);
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 111, 94, -1.001F, -2.601F, 3.0F, 1, 1, 1, 0.0F, false));
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 95, 111, -1.0F, -2.6F, 2.3F, 1, 1, 1, 0.0F, false));

		gun88_r1 = new ModelRenderer(this);
		gun88_r1.setRotationPoint(1.05F, -30.2F, -14.3F);
		gun.addChild(gun88_r1);
		setRotationAngle(gun88_r1, 0.0F, 0.0F, -0.1571F);
		gun88_r1.cubeList.add(new ModelBox(gun88_r1, 28, 112, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.7F, -33.5F, -4.7F);
		gun.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 112, 112, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.6F, -33.4F, -4.5F);
		gun.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -1.5708F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 40, 93, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-0.15F, -36.2F, -12.8F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -1.2641F);
		

		gun133_r1 = new ModelRenderer(this);
		gun133_r1.setRotationPoint(1.273F, 1.22F, 0.25F);
		gun132.addChild(gun133_r1);
		setRotationAngle(gun133_r1, 0.0F, 0.0F, -0.1571F);
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 103, 24, -2.0149F, -1.0989F, 0.0F, 2, 1, 1, -0.2F, false));
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 103, 59, -2.0156F, -1.0982F, -0.4F, 2, 1, 1, -0.2F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -33.5F, 1.5F);
		gun.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 40, 86, 0.001F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 41, 47, 0.599F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));
		gun67.cubeList.add(new ModelBox(gun67, 75, 51, 0.299F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		gun.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		

		receiver = new ModelRenderer(this);
		receiver.setRotationPoint(0.0F, 24.0F, 0.0F);
		receiver.cubeList.add(new ModelBox(receiver, 32, 93, -2.0F, -40.3F, -1.0F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 59, 103, -2.502F, -40.2F, -2.0F, 2, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 46, 6, -2.501F, -40.101F, -24.7F, 2, 1, 3, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 107, 228, -2.5F, -40.1F, -22.0F, 2, 1, 21, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 28, 78, -1.401F, -39.301F, -24.701F, 1, 1, 3, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 71, 44, -2.601F, -39.301F, -24.702F, 2, 1, 3, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 59, 83, -1.4F, -39.3F, -22.0F, 1, 1, 23, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 59, 59, -2.6F, -39.3F, -22.0F, 1, 1, 23, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 50, 72, -3.93F, -37.25F, -24.5F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 112, 106, -3.93F, -37.25F, -13.5F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 28, 58, -3.55F, -37.0F, -24.451F, 1, 1, 13, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 33, 197, -1.2F, -37.7F, -24.8988F, 2, 1, 27, -0.2F, false));
		receiver.cubeList.add(new ModelBox(receiver, 89, 59, -3.8F, -37.7F, -24.8988F, 2, 1, 2, -0.2F, false));
		receiver.cubeList.add(new ModelBox(receiver, 28, 72, -3.9F, -37.5F, -22.8988F, 2, 1, 10, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 118, 100, -3.8F, -37.7F, -12.8988F, 2, 1, 15, -0.2F, false));
		receiver.cubeList.add(new ModelBox(receiver, 87, 0, -0.45F, -37.0F, -24.451F, 1, 1, 13, 0.0F, false));

		gun263_r1 = new ModelRenderer(this);
		gun263_r1.setRotationPoint(-3.8F, -37.5F, -23.5F);
		receiver.addChild(gun263_r1);
		setRotationAngle(gun263_r1, 0.0F, 0.0F, 0.4712F);
		gun263_r1.cubeList.add(new ModelBox(gun263_r1, 92, 90, 0.0F, -0.7F, -0.999F, 1, 1, 2, 0.0F, false));
		gun263_r1.cubeList.add(new ModelBox(gun263_r1, 51, 18, -0.001F, -2.22F, -1.001F, 1, 2, 2, 0.0F, false));
		gun263_r1.cubeList.add(new ModelBox(gun263_r1, 106, 112, 0.0F, -0.7F, 10.0F, 1, 1, 1, 0.0F, false));
		gun263_r1.cubeList.add(new ModelBox(gun263_r1, 65, 39, -0.001F, -2.22F, 9.999F, 1, 2, 1, 0.0F, false));

		gun264_r1 = new ModelRenderer(this);
		gun264_r1.setRotationPoint(-4.3F, -36.7F, -24.9F);
		receiver.addChild(gun264_r1);
		setRotationAngle(gun264_r1, 0.0F, 0.0F, -0.9295F);
		gun264_r1.cubeList.add(new ModelBox(gun264_r1, 92, 86, 0.0F, 0.0F, 5.85F, 1, 1, 2, -0.2F, false));
		gun264_r1.cubeList.add(new ModelBox(gun264_r1, 0, 71, 0.0F, 0.0F, 1.3F, 1, 1, 11, -0.3F, false));

		gun266_r1 = new ModelRenderer(this);
		gun266_r1.setRotationPoint(-3.32F, -38.62F, -23.0F);
		receiver.addChild(gun266_r1);
		setRotationAngle(gun266_r1, 0.0F, 0.0F, 0.4712F);
		gun266_r1.cubeList.add(new ModelBox(gun266_r1, 59, 39, 0.1F, -0.96F, 0.0F, 1, 1, 10, -0.1F, false));
		gun266_r1.cubeList.add(new ModelBox(gun266_r1, 59, 71, -0.021F, -1.1F, 0.0F, 1, 1, 10, -0.1F, false));

		receiver14_r4 = new ModelRenderer(this);
		receiver14_r4.setRotationPoint(-3.6F, -36.9F, -11.7F);
		receiver.addChild(receiver14_r4);
		setRotationAngle(receiver14_r4, 0.0F, 0.0F, -0.4014F);
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 137, 100, 0.0F, 0.0F, -0.999F, 1, 1, 14, 0.0F, false));
		receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 112, 108, 0.0F, 0.0F, -12.998F, 1, 1, 1, 0.0F, false));

		receiver14_r5 = new ModelRenderer(this);
		receiver14_r5.setRotationPoint(-3.6F, -36.9F, -1.95F);
		receiver.addChild(receiver14_r5);
		setRotationAngle(receiver14_r5, 0.0F, 0.0F, -0.3142F);
		receiver14_r5.cubeList.add(new ModelBox(receiver14_r5, 10, 22, 0.0F, 0.0F, 0.001F, 1, 1, 3, 0.0F, false));

		receiver13_r1 = new ModelRenderer(this);
		receiver13_r1.setRotationPoint(0.6F, -36.9F, -1.95F);
		receiver.addChild(receiver13_r1);
		setRotationAngle(receiver13_r1, 0.0F, 0.0F, 0.3142F);
		receiver13_r1.cubeList.add(new ModelBox(receiver13_r1, 70, 51, -1.0F, 0.0F, 0.001F, 1, 1, 3, 0.0F, false));

		receiver12_r1 = new ModelRenderer(this);
		receiver12_r1.setRotationPoint(0.6F, -36.9F, -22.7F);
		receiver.addChild(receiver12_r1);
		setRotationAngle(receiver12_r1, 0.0F, 0.0F, 0.4014F);
		receiver12_r1.cubeList.add(new ModelBox(receiver12_r1, 59, 0, -1.0F, 0.0F, -1.999F, 1, 1, 26, 0.0F, false));

		receiver13_r2 = new ModelRenderer(this);
		receiver13_r2.setRotationPoint(-3.6F, -37.5F, -9.7F);
		receiver.addChild(receiver13_r2);
		setRotationAngle(receiver13_r2, 0.0F, 0.0F, 0.5061F);
		receiver13_r2.cubeList.add(new ModelBox(receiver13_r2, 79, 158, 0.0F, -2.0F, -3.0F, 1, 2, 14, 0.0F, false));
		receiver13_r2.cubeList.add(new ModelBox(receiver13_r2, 65, 18, 0.0F, -2.0F, -15.0F, 1, 2, 1, 0.0F, false));

		receiver11_r1 = new ModelRenderer(this);
		receiver11_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
		receiver.addChild(receiver11_r1);
		setRotationAngle(receiver11_r1, 0.0F, 0.0F, -0.5061F);
		receiver11_r1.cubeList.add(new ModelBox(receiver11_r1, 0, 0, -1.0F, -2.0F, -2.0F, 1, 2, 26, 0.0F, false));

		gun125_r1 = new ModelRenderer(this);
		gun125_r1.setRotationPoint(-2.5F, -40.1F, -1.0F);
		receiver.addChild(gun125_r1);
		setRotationAngle(gun125_r1, -0.632F, 0.0F, 0.0F);
		gun125_r1.cubeList.add(new ModelBox(gun125_r1, 91, 54, -0.001F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(-3.5F, -39.25F, -10.3F);
		receiver.addChild(gun170);
		setRotationAngle(gun170, 0.0F, 0.0F, -0.0524F);
		gun170.cubeList.add(new ModelBox(gun170, 92, 8, -1.2F, -0.201F, -1.0F, 3, 2, 1, 0.0F, false));

		gun172_r1 = new ModelRenderer(this);
		gun172_r1.setRotationPoint(-1.2F, -0.25F, 0.0F);
		gun170.addChild(gun172_r1);
		setRotationAngle(gun172_r1, 0.0F, -0.2618F, 0.0F);
		gun172_r1.cubeList.add(new ModelBox(gun172_r1, 92, 0, 0.0F, 0.05F, -1.0F, 3, 2, 1, 0.0F, false));

		gun172_r2 = new ModelRenderer(this);
		gun172_r2.setRotationPoint(-1.2F, -0.25F, -1.0F);
		gun170.addChild(gun172_r2);
		setRotationAngle(gun172_r2, 0.0F, -0.9076F, 0.0F);
		gun172_r2.cubeList.add(new ModelBox(gun172_r2, 65, 44, 1.0F, 0.05F, -2.0F, 1, 2, 1, 0.0F, false));
		gun172_r2.cubeList.add(new ModelBox(gun172_r2, 84, 59, 0.0F, 0.05F, -3.0F, 1, 2, 3, 0.0F, false));

		gun264 = new ModelRenderer(this);
		gun264.setRotationPoint(-3.7F, -34.2F, -20.0F);
		receiver.addChild(gun264);
		setRotationAngle(gun264, 0.0F, 0.0F, 0.1578F);
		gun264.cubeList.add(new ModelBox(gun264, 88, 27, -0.7868F, -2.9327F, -2.8F, 1, 3, 9, -0.3F, false));
		gun264.cubeList.add(new ModelBox(gun264, 13, 76, -0.6368F, -2.6327F, -2.25F, 1, 2, 3, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 0, 76, -0.6368F, -2.6327F, 3.15F, 1, 2, 3, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 112, 104, -0.7868F, -1.2327F, 1.45F, 1, 1, 1, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 112, 80, -0.7878F, -1.6327F, 1.449F, 1, 1, 1, -0.1F, false));
		gun264.cubeList.add(new ModelBox(gun264, 35, 28, -0.7878F, -2.9337F, 4.8F, 1, 3, 2, -0.3F, false));

		action = new ModelRenderer(this);
		action.setRotationPoint(0.2F, 24.1F, 0.0F);
		

		receiver15_r6 = new ModelRenderer(this);
		receiver15_r6.setRotationPoint(-2.3F, -38.8F, -20.5F);
		action.addChild(receiver15_r6);
		setRotationAngle(receiver15_r6, 0.0F, 0.0F, -0.4014F);
		receiver15_r6.cubeList.add(new ModelBox(receiver15_r6, 85, 51, -1.0F, -0.001F, -1.999F, 1, 1, 3, 0.0F, false));
		receiver15_r6.cubeList.add(new ModelBox(receiver15_r6, 84, 68, -1.0F, 0.0F, 4.001F, 1, 1, 3, 0.0F, false));

		receiver16_r6 = new ModelRenderer(this);
		receiver16_r6.setRotationPoint(-3.6F, -37.5F, -16.5F);
		action.addChild(receiver16_r6);
		setRotationAngle(receiver16_r6, 0.0F, 0.0F, -0.4014F);
		receiver16_r6.cubeList.add(new ModelBox(receiver16_r6, 87, 0, -0.001F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
		receiver16_r6.cubeList.add(new ModelBox(receiver16_r6, 87, 8, -0.001F, 0.0F, -6.0F, 1, 1, 3, 0.0F, false));

		receiver15_r7 = new ModelRenderer(this);
		receiver15_r7.setRotationPoint(-3.6F, -37.5F, -16.5F);
		action.addChild(receiver15_r7);
		setRotationAngle(receiver15_r7, 0.0F, 0.0F, 0.4014F);
		receiver15_r7.cubeList.add(new ModelBox(receiver15_r7, 87, 4, -0.001F, -1.0F, -0.001F, 1, 1, 3, 0.0F, false));
		receiver15_r7.cubeList.add(new ModelBox(receiver15_r7, 87, 14, -0.001F, -1.0F, -6.001F, 1, 1, 3, 0.0F, false));

		receiver16_r7 = new ModelRenderer(this);
		receiver16_r7.setRotationPoint(-3.5F, -37.3F, -19.5F);
		action.addChild(receiver16_r7);
		setRotationAngle(receiver16_r7, 0.0F, 0.0F, 0.4014F);
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 49, 80, 0.0F, -1.3F, -0.001F, 1, 1, 3, 0.0F, false));
		receiver16_r7.cubeList.add(new ModelBox(receiver16_r7, 84, 64, -0.001F, -1.0F, -0.001F, 1, 1, 3, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		grip.cubeList.add(new ModelBox(grip, 71, 71, -3.0F, -31.0F, -1.0F, 3, 5, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 88, 39, -3.499F, -31.0F, -6.0F, 4, 5, 5, 0.0F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(-3.5F, -26.0F, -5.5F);
		grip.addChild(grip3_r1);
		setRotationAngle(grip3_r1, 0.3718F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 0, 38, 0.001F, 3.0F, -0.5F, 4, 1, 1, 0.0F, false));
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 0, 116, 0.0F, -0.5F, 0.0F, 4, 11, 4, 0.0F, false));

		grip3_r2 = new ModelRenderer(this);
		grip3_r2.setRotationPoint(-3.5F, -29.0F, -1.0F);
		grip.addChild(grip3_r2);
		setRotationAngle(grip3_r2, -1.0782F, 0.0F, 0.0F);
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 136, 41, -0.001F, 0.0F, 0.0F, 4, 3, 12, 0.0F, false));
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 118, 159, 0.499F, -1.0F, 0.0F, 3, 1, 12, 0.0F, false));

		grip4_r1 = new ModelRenderer(this);
		grip4_r1.setRotationPoint(-3.5F, -16.8F, -2.6F);
		grip.addChild(grip4_r1);
		setRotationAngle(grip4_r1, 0.2231F, 0.0F, 0.0F);
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 28, 18, 0.001F, 0.0F, 0.0F, 4, 1, 7, 0.0F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 72, 22, 0.0F, -0.001F, 6.45F, 4, 1, 1, 0.0F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 87, 24, 0.5F, 0.0F, 7.421F, 3, 1, 1, 0.0F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 95, 24, 0.501F, -0.25F, 7.42F, 3, 1, 1, 0.0F, false));

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(-3.5F, -16.8F, -2.6F);
		grip.addChild(grip5_r1);
		setRotationAngle(grip5_r1, 1.0782F, 0.0F, 0.0F);
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 28, 52, -0.001F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		grip13_r1 = new ModelRenderer(this);
		grip13_r1.setRotationPoint(-3.6F, -26.0F, -5.5F);
		grip.addChild(grip13_r1);
		setRotationAngle(grip13_r1, 0.3665F, 0.0F, 0.0F);
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 28, 58, 3.2F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 43, 58, 0.0F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(-0.5F, -16.1F, -58.7F);
		handguard.cubeList.add(new ModelBox(handguard, 0, 116, -2.0F, 0.0F, -6.0F, 2, 2, 40, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 126, 118, 0.45F, 2.2F, -6.0F, 1, 1, 40, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 84, 117, -3.45F, 2.2F, -6.0F, 1, 1, 40, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 118, 59, 0.451F, 2.7F, -6.002F, 1, 1, 40, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 118, 0, -3.449F, 2.7F, -6.002F, 1, 1, 40, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 118, 159, -2.0F, 4.9F, -3.0F, 2, 1, 34, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 22, -2.0F, 4.2F, 31.0F, 2, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 160, 0, -1.5F, 4.4F, -2.999F, 1, 1, 34, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 5.9F, 31.0F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5934F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 79, -2.001F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.05F, 5.0F, 33.0F);
		handguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.1868F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 59, 107, -1.0F, -1.0F, -0.002F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 35, -1.001F, -1.0F, -3.502F, 1, 1, 4, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 67, 107, -1.001F, -1.0F, -7.502F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 75, 107, -1.001F, -1.0F, -11.502F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 83, 107, -1.001F, -1.0F, -15.502F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 91, 107, -1.001F, -1.0F, -19.502F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 99, 107, -1.001F, -1.0F, -23.502F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 107, 103, -1.001F, -1.0F, -27.502F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 108, 60, -1.001F, -1.0F, -31.502F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 28, -0.701F, -1.3F, -5.502F, 1, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 0, -0.701F, -1.3F, -9.502F, 1, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 46, -0.701F, -1.3F, -13.502F, 1, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 46, -0.701F, -1.3F, -17.502F, 1, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 47, -0.701F, -1.3F, -21.502F, 1, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 47, -0.701F, -1.3F, -25.502F, 1, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 47, -0.701F, -1.3F, -29.502F, 1, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 47, -0.701F, -1.3F, -33.502F, 1, 2, 1, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 108, 95, -1.0F, -1.0F, -35.502F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 158, -0.999F, -0.3F, -36.002F, 1, 1, 37, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 109, 45, -0.998F, -1.0F, -36.003F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.95F, 5.0F, 33.0F);
		handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -1.1868F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 109, 0.0F, -1.0F, -0.002F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 59, 18, 0.001F, -1.0F, -3.502F, 1, 1, 4, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 63, 109, 0.001F, -1.0F, -7.502F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 109, 65, 0.001F, -1.0F, -11.502F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 109, 67, 0.001F, -1.0F, -15.502F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 71, 109, 0.001F, -1.0F, -19.502F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 109, 77, 0.001F, -1.0F, -23.502F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 109, 79, 0.001F, -1.0F, -27.502F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 83, 109, 0.001F, -1.0F, -31.502F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 0, -0.299F, -1.3F, -5.502F, 1, 2, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 46, -0.299F, -1.3F, -9.502F, 1, 2, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 49, -0.299F, -1.3F, -13.502F, 1, 2, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 53, 6, -0.299F, -1.3F, -17.502F, 1, 2, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 58, -0.299F, -1.3F, -21.502F, 1, 2, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 7, 58, -0.299F, -1.3F, -25.502F, 1, 2, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 58, -0.299F, -1.3F, -29.502F, 1, 2, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 58, -0.299F, -1.3F, -33.502F, 1, 2, 1, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 87, 109, 0.0F, -1.0F, -35.502F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 79, 159, -0.001F, -0.3F, -36.004F, 1, 1, 37, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 99, 109, -0.002F, -1.0F, -36.003F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.95F, 1.0F, 33.0F);
		handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 1.1868F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 109, 105, 0.0F, 0.0F, -0.002F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 59, 32, 0.001F, 0.0F, -3.502F, 1, 1, 4, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 109, 109, 0.001F, 0.0F, -7.502F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 4, 110, 0.001F, 0.0F, -11.502F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 110, 0.001F, 0.0F, -15.502F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 110, 11, 0.001F, 0.0F, -19.502F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 110, 14, 0.001F, 0.0F, -23.502F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 110, 16, 0.001F, 0.0F, -27.502F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 110, 0.001F, 0.0F, -31.502F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 58, -0.299F, -0.7F, -5.502F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 43, 58, -0.299F, -0.7F, -9.502F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 58, -0.299F, -0.7F, -13.502F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 59, 0, -0.299F, -0.7F, -17.502F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 59, 6, -0.299F, -0.7F, -21.502F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 59, 13, -0.299F, -0.7F, -25.502F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 59, 18, -0.299F, -0.7F, -29.502F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 59, 27, -0.299F, -0.7F, -33.502F, 1, 2, 1, -0.3F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 110, 20, 0.0F, 0.0F, -35.502F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 117, -0.001F, -0.7F, -37.002F, 1, 1, 38, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 65, 6, 0.0F, 0.0F, -39.002F, 1, 1, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.05F, 1.0F, 33.0F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -1.1868F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 110, -1.0F, 0.0F, -0.002F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 59, 44, -1.001F, 0.0F, -3.502F, 1, 1, 4, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 110, -1.001F, 0.0F, -7.502F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 110, 50, -1.001F, 0.0F, -11.502F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 110, 53, -1.001F, 0.0F, -15.502F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 106, 110, -1.001F, 0.0F, -19.502F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 111, 43, -1.001F, 0.0F, -23.502F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 59, 111, -1.001F, 0.0F, -27.502F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 63, 111, -1.001F, 0.0F, -31.502F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 59, 32, -0.701F, -0.7F, -5.502F, 1, 2, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 59, 39, -0.701F, -0.7F, -9.502F, 1, 2, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 59, 44, -0.701F, -0.7F, -13.502F, 1, 2, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 59, 51, -0.701F, -0.7F, -17.502F, 1, 2, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 59, 59, -0.701F, -0.7F, -21.502F, 1, 2, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 64, -0.701F, -0.7F, -25.502F, 1, 2, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 64, -0.701F, -0.7F, -29.502F, 1, 2, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 59, 64, -0.701F, -0.7F, -33.502F, 1, 2, 1, -0.3F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 71, 111, -1.0F, 0.0F, -35.502F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 158, -0.999F, -0.7F, -37.002F, 1, 1, 38, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 71, -1.0F, 0.0F, -39.002F, 1, 1, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.85F, 1.05F, -4.0F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 59, 27, 0.0F, 0.0F, -0.002F, 1, 2, 10, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.15F, 1.05F, -4.0F);
		handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 59, 59, -1.0F, 0.0F, -0.002F, 1, 2, 10, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.25F, 3.7F, 33.0F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -1.1868F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 63, 107, -1.0F, -0.999F, -0.001F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 59, 13, -1.0F, -1.0F, -3.501F, 1, 1, 4, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 71, 107, -1.0F, -1.0F, -7.501F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 79, 107, -1.0F, -1.0F, -11.501F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 87, 107, -1.0F, -1.0F, -15.501F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 95, 107, -1.0F, -1.0F, -19.501F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 103, 107, -1.0F, -1.0F, -23.501F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 53, 108, -1.0F, -1.0F, -27.501F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 108, 93, -1.0F, -1.0F, -31.501F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 22, -1.3F, -0.7F, -5.501F, 2, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 51, 22, -1.3F, -0.7F, -9.501F, 2, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 78, 13, -1.3F, -0.7F, -13.501F, 2, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 51, 89, -1.3F, -0.7F, -17.501F, 2, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 92, 93, -1.3F, -0.7F, -21.501F, 2, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 94, 11, -1.3F, -0.7F, -25.501F, 2, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 96, -1.3F, -0.7F, -29.501F, 2, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 96, -1.3F, -0.7F, -33.501F, 2, 1, 1, -0.3F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 106, 108, -1.0F, -1.0F, -35.501F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 160, 41, -0.3F, -0.999F, -37.001F, 1, 1, 34, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 109, 24, -1.0F, -1.001F, -36.001F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.25F, 3.7F, 33.0F);
		handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 1.1868F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 109, 47, 0.0F, -0.999F, -0.001F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 59, 27, 0.0F, -1.0F, -3.501F, 1, 1, 4, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 59, 109, 0.0F, -1.0F, -7.501F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 109, 63, 0.0F, -1.0F, -11.501F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 67, 109, 0.0F, -1.0F, -15.501F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 109, 69, 0.0F, -1.0F, -19.501F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 75, 109, 0.0F, -1.0F, -23.501F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 79, 109, 0.0F, -1.0F, -27.501F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 109, 81, 0.0F, -1.0F, -31.501F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 96, -0.7F, -0.7F, -5.501F, 2, 1, 1, -0.3F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 75, 98, -0.7F, -0.7F, -9.501F, 2, 1, 1, -0.3F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 98, 80, -0.7F, -0.7F, -13.501F, 2, 1, 1, -0.3F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 99, 27, -0.7F, -0.7F, -17.501F, 2, 1, 1, -0.3F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 99, 29, -0.7F, -0.7F, -21.501F, 2, 1, 1, -0.3F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 99, 31, -0.7F, -0.7F, -25.501F, 2, 1, 1, -0.3F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 99, 33, -0.7F, -0.7F, -29.501F, 2, 1, 1, -0.3F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 99, 55, -0.7F, -0.7F, -33.501F, 2, 1, 1, -0.3F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 91, 109, 0.0F, -1.0F, -35.501F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 156, 160, -0.7F, -0.999F, -37.001F, 1, 1, 34, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 95, 109, 0.0F, -1.001F, -36.001F, 1, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.25F, 2.3F, 33.0F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -1.1868F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 103, 109, 0.0F, -0.001F, -0.001F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 59, 39, 0.0F, 0.0F, -3.501F, 1, 1, 4, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 109, 107, 0.0F, 0.0F, -7.501F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 110, 0.0F, 0.0F, -11.501F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 110, 7, 0.0F, 0.0F, -15.501F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 110, 9, 0.0F, 0.0F, -19.501F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 110, 0.0F, 0.0F, -23.501F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 110, 0.0F, 0.0F, -27.501F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 110, 18, 0.0F, 0.0F, -31.501F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 75, 100, -0.7F, -0.3F, -5.501F, 2, 1, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 100, 93, -0.7F, -0.3F, -9.501F, 2, 1, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 100, 95, -0.7F, -0.3F, -13.501F, 2, 1, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 101, 39, -0.7F, -0.3F, -17.501F, 2, 1, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 101, 41, -0.7F, -0.3F, -21.501F, 2, 1, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 59, 101, -0.7F, -0.3F, -25.501F, 2, 1, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 65, 101, -0.7F, -0.3F, -29.501F, 2, 1, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 102, 7, -0.7F, -0.3F, -33.501F, 2, 1, 1, -0.3F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 110, 0.0F, 0.0F, -35.501F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 166, 76, -0.7F, -0.001F, -37.001F, 1, 1, 34, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 64, 0.0F, 0.0F, -39.001F, 1, 1, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.25F, 2.3F, 33.0F);
		handguard.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 1.1868F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 110, -1.0F, -0.001F, -0.001F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 59, 59, -1.0F, 0.0F, -3.501F, 1, 1, 4, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 40, 110, -1.0F, 0.0F, -7.501F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 53, 110, -1.0F, 0.0F, -11.501F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 110, 102, -1.0F, 0.0F, -15.501F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 111, 22, -1.0F, 0.0F, -19.501F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 111, 55, -1.0F, 0.0F, -23.501F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 111, 59, -1.0F, 0.0F, -27.501F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 111, 61, -1.0F, 0.0F, -31.501F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 102, 9, -1.3F, -0.3F, -5.501F, 2, 1, 1, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 102, 11, -1.3F, -0.3F, -9.501F, 2, 1, 1, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 102, 14, -1.3F, -0.3F, -13.501F, 2, 1, 1, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 102, 16, -1.3F, -0.3F, -17.501F, 2, 1, 1, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 102, 18, -1.3F, -0.3F, -21.501F, 2, 1, 1, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 102, 20, -1.3F, -0.3F, -25.501F, 2, 1, 1, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 75, 102, -1.3F, -0.3F, -29.501F, 2, 1, 1, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 84, 102, -1.3F, -0.3F, -33.501F, 2, 1, 1, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 67, 111, -1.0F, 0.0F, -35.501F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 168, 111, -0.3F, -0.001F, -37.001F, 1, 1, 34, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 72, -1.0F, 0.0F, -39.001F, 1, 1, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-3.75F, 3.73F, 29.6F);
		handguard.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0524F, -0.0873F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 47, -0.3F, -0.7F, -0.3F, 1, 1, 5, -0.3F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.75F, 3.73F, 29.6F);
		handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -0.0524F, 0.0873F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 58, -0.7F, -0.7F, -0.3F, 1, 1, 5, -0.3F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.75F, 2.17F, 29.6F);
		handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0524F, 0.0873F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 47, -0.3F, -0.3F, -0.3F, 1, 1, 5, -0.3F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(1.75F, 2.17F, 29.6F);
		handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.0524F, -0.0873F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 58, -0.7F, -0.3F, -0.3F, 1, 1, 5, -0.3F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(2.701F, 2.5F, 30.401F);
		handguard.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 126, 134, -1.1F, 0.0F, -16.901F, 1, 1, 16, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 107, 52, -0.9F, 0.0F, -2.901F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 107, 19, -1.0F, 0.0F, -8.901F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 107, 10, -1.0F, 0.0F, -6.901F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 106, 70, -1.0F, 0.0F, -4.901F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 106, 64, -1.0F, 0.0F, -10.901F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 106, 46, -1.0F, 0.0F, -12.901F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 8, 106, -1.0F, 0.0F, -14.901F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 105, 94, -1.0F, 0.0F, -16.801F, 1, 1, 1, 0.0F, false));

		handguard118_r1 = new ModelRenderer(this);
		handguard118_r1.setRotationPoint(-0.3F, 1.95F, -4.9F);
		bone3.addChild(handguard118_r1);
		setRotationAngle(handguard118_r1, 0.0F, 0.0F, 0.8203F);
		handguard118_r1.cubeList.add(new ModelBox(handguard118_r1, 11, 105, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard118_r1.cubeList.add(new ModelBox(handguard118_r1, 100, 104, -1.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard118_r1.cubeList.add(new ModelBox(handguard118_r1, 92, 104, -1.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard118_r1.cubeList.add(new ModelBox(handguard118_r1, 104, 104, -1.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard118_r1.cubeList.add(new ModelBox(handguard118_r1, 96, 104, -1.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard118_r1.cubeList.add(new ModelBox(handguard118_r1, 88, 104, -1.0F, 0.0F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard118_r1.cubeList.add(new ModelBox(handguard118_r1, 84, 104, -1.0F, 0.0F, -11.9F, 1, 1, 1, 0.0F, false));

		handguard119_r1 = new ModelRenderer(this);
		handguard119_r1.setRotationPoint(-0.2F, 1.95F, -2.9F);
		bone3.addChild(handguard119_r1);
		setRotationAngle(handguard119_r1, 0.0F, 0.0F, 1.0123F);
		handguard119_r1.cubeList.add(new ModelBox(handguard119_r1, 104, 54, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard118_r2 = new ModelRenderer(this);
		handguard118_r2.setRotationPoint(-0.2F, -0.95F, -2.9F);
		bone3.addChild(handguard118_r2);
		setRotationAngle(handguard118_r2, 0.0F, 0.0F, -1.0123F);
		handguard118_r2.cubeList.add(new ModelBox(handguard118_r2, 64, 104, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard117_r1 = new ModelRenderer(this);
		handguard117_r1.setRotationPoint(-0.3F, -0.95F, -4.9F);
		bone3.addChild(handguard117_r1);
		setRotationAngle(handguard117_r1, 0.0F, 0.0F, -0.8203F);
		handguard117_r1.cubeList.add(new ModelBox(handguard117_r1, 24, 105, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard117_r1.cubeList.add(new ModelBox(handguard117_r1, 32, 105, -1.0F, -1.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard117_r1.cubeList.add(new ModelBox(handguard117_r1, 36, 105, -1.0F, -1.0F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard117_r1.cubeList.add(new ModelBox(handguard117_r1, 15, 105, -1.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard117_r1.cubeList.add(new ModelBox(handguard117_r1, 28, 105, -1.0F, -1.0F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard117_r1.cubeList.add(new ModelBox(handguard117_r1, 40, 105, -1.0F, -1.0F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard117_r1.cubeList.add(new ModelBox(handguard117_r1, 105, 48, -1.0F, -1.0F, -11.9F, 1, 1, 1, 0.0F, false));

		handguard112_r1 = new ModelRenderer(this);
		handguard112_r1.setRotationPoint(0.0F, 0.0F, -16.8F);
		bone3.addChild(handguard112_r1);
		setRotationAngle(handguard112_r1, 0.0F, 0.0F, -0.2967F);
		handguard112_r1.cubeList.add(new ModelBox(handguard112_r1, 0, 106, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard112_r1.cubeList.add(new ModelBox(handguard112_r1, 18, 106, -1.0F, -1.0F, 1.9F, 1, 1, 1, 0.0F, false));
		handguard112_r1.cubeList.add(new ModelBox(handguard112_r1, 53, 106, -1.0F, -1.0F, 3.9F, 1, 1, 1, 0.0F, false));
		handguard112_r1.cubeList.add(new ModelBox(handguard112_r1, 106, 62, -1.0F, -1.0F, 5.9F, 1, 1, 1, 0.0F, false));
		handguard112_r1.cubeList.add(new ModelBox(handguard112_r1, 106, 106, -1.0F, -1.0F, 11.9F, 1, 1, 1, 0.0F, false));
		handguard112_r1.cubeList.add(new ModelBox(handguard112_r1, 107, 8, -1.0F, -1.0F, 9.9F, 1, 1, 1, 0.0F, false));
		handguard112_r1.cubeList.add(new ModelBox(handguard112_r1, 107, 21, -1.0F, -1.0F, 7.9F, 1, 1, 1, 0.0F, false));

		handguard113_r1 = new ModelRenderer(this);
		handguard113_r1.setRotationPoint(0.0F, 1.0F, -16.8F);
		bone3.addChild(handguard113_r1);
		setRotationAngle(handguard113_r1, 0.0F, 0.0F, 0.2967F);
		handguard113_r1.cubeList.add(new ModelBox(handguard113_r1, 50, 105, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard113_r1.cubeList.add(new ModelBox(handguard113_r1, 4, 106, -1.0F, 0.0F, 1.9F, 1, 1, 1, 0.0F, false));
		handguard113_r1.cubeList.add(new ModelBox(handguard113_r1, 106, 44, -1.0F, 0.0F, 3.9F, 1, 1, 1, 0.0F, false));
		handguard113_r1.cubeList.add(new ModelBox(handguard113_r1, 106, 66, -1.0F, 0.0F, 5.9F, 1, 1, 1, 0.0F, false));
		handguard113_r1.cubeList.add(new ModelBox(handguard113_r1, 106, 68, -1.0F, 0.0F, 11.9F, 1, 1, 1, 0.0F, false));
		handguard113_r1.cubeList.add(new ModelBox(handguard113_r1, 107, 15, -1.0F, 0.0F, 9.9F, 1, 1, 1, 0.0F, false));
		handguard113_r1.cubeList.add(new ModelBox(handguard113_r1, 107, 17, -1.0F, 0.0F, 7.9F, 1, 1, 1, 0.0F, false));

		handguard108_r1 = new ModelRenderer(this);
		handguard108_r1.setRotationPoint(0.1F, 0.0F, -2.9F);
		bone3.addChild(handguard108_r1);
		setRotationAngle(handguard108_r1, 0.0F, 0.0F, -0.2967F);
		handguard108_r1.cubeList.add(new ModelBox(handguard108_r1, 50, 107, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard109_r1 = new ModelRenderer(this);
		handguard109_r1.setRotationPoint(0.1F, 1.0F, -2.9F);
		bone3.addChild(handguard109_r1);
		setRotationAngle(handguard109_r1, 0.0F, 0.0F, 0.2967F);
		handguard109_r1.cubeList.add(new ModelBox(handguard109_r1, 107, 55, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard109_r2 = new ModelRenderer(this);
		handguard109_r2.setRotationPoint(-0.4F, 1.95F, -14.9F);
		bone3.addChild(handguard109_r2);
		setRotationAngle(handguard109_r2, 0.0F, 0.0F, 0.733F);
		handguard109_r2.cubeList.add(new ModelBox(handguard109_r2, 44, 134, -1.0F, 0.0F, -1.999F, 1, 1, 16, 0.0F, false));

		handguard108_r2 = new ModelRenderer(this);
		handguard108_r2.setRotationPoint(-0.1F, 1.0F, -14.9F);
		bone3.addChild(handguard108_r2);
		setRotationAngle(handguard108_r2, 0.0F, 0.0F, 0.2967F);
		handguard108_r2.cubeList.add(new ModelBox(handguard108_r2, 84, 134, -1.0F, 0.0F, -2.0F, 1, 1, 16, 0.0F, false));

		handguard107_r1 = new ModelRenderer(this);
		handguard107_r1.setRotationPoint(-0.1F, 0.0F, -14.9F);
		bone3.addChild(handguard107_r1);
		setRotationAngle(handguard107_r1, 0.0F, 0.0F, -0.2967F);
		handguard107_r1.cubeList.add(new ModelBox(handguard107_r1, 152, 41, -1.0F, -1.0F, -2.0F, 1, 1, 16, 0.0F, false));

		handguard108_r3 = new ModelRenderer(this);
		handguard108_r3.setRotationPoint(-0.4F, -0.95F, -14.9F);
		bone3.addChild(handguard108_r3);
		setRotationAngle(handguard108_r3, 0.0F, 0.0F, -0.733F);
		handguard108_r3.cubeList.add(new ModelBox(handguard108_r3, 0, 158, -1.0F, -1.0F, -1.999F, 1, 1, 16, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-4.701F, 2.5F, 30.401F);
		handguard.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 118, 76, 0.1F, 0.0F, -16.901F, 1, 1, 16, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 104, 51, -0.1F, 0.0F, -2.901F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 104, 30, 0.0F, 0.0F, -8.901F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 8, 104, 0.0F, 0.0F, -6.901F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 103, 79, 0.0F, 0.0F, -4.901F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 102, 77, 0.0F, 0.0F, -10.901F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 102, 2, 0.0F, 0.0F, -12.901F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 102, 0, 0.0F, 0.0F, -14.901F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 93, 31, 0.0F, 0.0F, -16.801F, 1, 1, 1, 0.0F, false));

		handguard119_r2 = new ModelRenderer(this);
		handguard119_r2.setRotationPoint(0.3F, 1.95F, -4.9F);
		bone2.addChild(handguard119_r2);
		setRotationAngle(handguard119_r2, 0.0F, 0.0F, -0.8203F);
		handguard119_r2.cubeList.add(new ModelBox(handguard119_r2, 48, 79, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard119_r2.cubeList.add(new ModelBox(handguard119_r2, 80, 19, 0.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard119_r2.cubeList.add(new ModelBox(handguard119_r2, 81, 2, 0.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard119_r2.cubeList.add(new ModelBox(handguard119_r2, 81, 6, 0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard119_r2.cubeList.add(new ModelBox(handguard119_r2, 81, 21, 0.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard119_r2.cubeList.add(new ModelBox(handguard119_r2, 84, 79, 0.0F, 0.0F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard119_r2.cubeList.add(new ModelBox(handguard119_r2, 40, 86, 0.0F, 0.0F, -11.9F, 1, 1, 1, 0.0F, false));

		handguard120_r1 = new ModelRenderer(this);
		handguard120_r1.setRotationPoint(0.2F, 1.95F, -2.9F);
		bone2.addChild(handguard120_r1);
		setRotationAngle(handguard120_r1, 0.0F, 0.0F, -1.0123F);
		handguard120_r1.cubeList.add(new ModelBox(handguard120_r1, 7, 80, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard119_r3 = new ModelRenderer(this);
		handguard119_r3.setRotationPoint(0.2F, -0.95F, -2.9F);
		bone2.addChild(handguard119_r3);
		setRotationAngle(handguard119_r3, 0.0F, 0.0F, 1.0123F);
		handguard119_r3.cubeList.add(new ModelBox(handguard119_r3, 80, 15, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard118_r3 = new ModelRenderer(this);
		handguard118_r3.setRotationPoint(0.3F, -0.95F, -4.9F);
		bone2.addChild(handguard118_r3);
		setRotationAngle(handguard118_r3, 0.0F, 0.0F, 0.8203F);
		handguard118_r3.cubeList.add(new ModelBox(handguard118_r3, 80, 17, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard118_r3.cubeList.add(new ModelBox(handguard118_r3, 81, 0, 0.0F, -1.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard118_r3.cubeList.add(new ModelBox(handguard118_r3, 81, 4, 0.0F, -1.0F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard118_r3.cubeList.add(new ModelBox(handguard118_r3, 81, 9, 0.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard118_r3.cubeList.add(new ModelBox(handguard118_r3, 84, 77, 0.0F, -1.0F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard118_r3.cubeList.add(new ModelBox(handguard118_r3, 18, 86, 0.0F, -1.0F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard118_r3.cubeList.add(new ModelBox(handguard118_r3, 88, 39, 0.0F, -1.0F, -11.9F, 1, 1, 1, 0.0F, false));

		handguard113_r2 = new ModelRenderer(this);
		handguard113_r2.setRotationPoint(0.0F, 0.0F, -16.8F);
		bone2.addChild(handguard113_r2);
		setRotationAngle(handguard113_r2, 0.0F, 0.0F, 0.2967F);
		handguard113_r2.cubeList.add(new ModelBox(handguard113_r2, 40, 88, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard113_r2.cubeList.add(new ModelBox(handguard113_r2, 88, 41, 0.0F, -1.0F, 1.9F, 1, 1, 1, 0.0F, false));
		handguard113_r2.cubeList.add(new ModelBox(handguard113_r2, 92, 14, 0.0F, -1.0F, 3.9F, 1, 1, 1, 0.0F, false));
		handguard113_r2.cubeList.add(new ModelBox(handguard113_r2, 92, 62, 0.0F, -1.0F, 5.9F, 1, 1, 1, 0.0F, false));
		handguard113_r2.cubeList.add(new ModelBox(handguard113_r2, 0, 104, 0.0F, -1.0F, 11.9F, 1, 1, 1, 0.0F, false));
		handguard113_r2.cubeList.add(new ModelBox(handguard113_r2, 4, 104, 0.0F, -1.0F, 9.9F, 1, 1, 1, 0.0F, false));
		handguard113_r2.cubeList.add(new ModelBox(handguard113_r2, 104, 32, 0.0F, -1.0F, 7.9F, 1, 1, 1, 0.0F, false));

		handguard114_r1 = new ModelRenderer(this);
		handguard114_r1.setRotationPoint(0.0F, 1.0F, -16.8F);
		bone2.addChild(handguard114_r1);
		setRotationAngle(handguard114_r1, 0.0F, 0.0F, -0.2967F);
		handguard114_r1.cubeList.add(new ModelBox(handguard114_r1, 103, 61, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard114_r1.cubeList.add(new ModelBox(handguard114_r1, 103, 63, 0.0F, 0.0F, 1.9F, 1, 1, 1, 0.0F, false));
		handguard114_r1.cubeList.add(new ModelBox(handguard114_r1, 103, 65, 0.0F, 0.0F, 3.9F, 1, 1, 1, 0.0F, false));
		handguard114_r1.cubeList.add(new ModelBox(handguard114_r1, 103, 67, 0.0F, 0.0F, 5.9F, 1, 1, 1, 0.0F, false));
		handguard114_r1.cubeList.add(new ModelBox(handguard114_r1, 103, 69, 0.0F, 0.0F, 11.9F, 1, 1, 1, 0.0F, false));
		handguard114_r1.cubeList.add(new ModelBox(handguard114_r1, 18, 104, 0.0F, 0.0F, 9.9F, 1, 1, 1, 0.0F, false));
		handguard114_r1.cubeList.add(new ModelBox(handguard114_r1, 104, 28, 0.0F, 0.0F, 7.9F, 1, 1, 1, 0.0F, false));

		handguard109_r3 = new ModelRenderer(this);
		handguard109_r3.setRotationPoint(-0.1F, 0.0F, -2.9F);
		bone2.addChild(handguard109_r3);
		setRotationAngle(handguard109_r3, 0.0F, 0.0F, 0.2967F);
		handguard109_r3.cubeList.add(new ModelBox(handguard109_r3, 104, 34, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard110_r1 = new ModelRenderer(this);
		handguard110_r1.setRotationPoint(-0.1F, 1.0F, -2.9F);
		bone2.addChild(handguard110_r1);
		setRotationAngle(handguard110_r1, 0.0F, 0.0F, -0.2967F);
		handguard110_r1.cubeList.add(new ModelBox(handguard110_r1, 53, 104, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard110_r2 = new ModelRenderer(this);
		handguard110_r2.setRotationPoint(0.4F, 1.95F, -14.9F);
		bone2.addChild(handguard110_r2);
		setRotationAngle(handguard110_r2, 0.0F, 0.0F, -0.733F);
		handguard110_r2.cubeList.add(new ModelBox(handguard110_r2, 118, 41, 0.0F, 0.0F, -1.999F, 1, 1, 16, 0.0F, false));

		handguard109_r4 = new ModelRenderer(this);
		handguard109_r4.setRotationPoint(0.1F, 1.0F, -14.9F);
		bone2.addChild(handguard109_r4);
		setRotationAngle(handguard109_r4, 0.0F, 0.0F, -0.2967F);
		handguard109_r4.cubeList.add(new ModelBox(handguard109_r4, 118, 59, 0.0F, 0.0F, -2.0F, 1, 1, 16, 0.0F, false));

		handguard108_r4 = new ModelRenderer(this);
		handguard108_r4.setRotationPoint(0.1F, 0.0F, -14.9F);
		bone2.addChild(handguard108_r4);
		setRotationAngle(handguard108_r4, 0.0F, 0.0F, 0.2967F);
		handguard108_r4.cubeList.add(new ModelBox(handguard108_r4, 126, 117, 0.0F, -1.0F, -2.0F, 1, 1, 16, 0.0F, false));

		handguard109_r5 = new ModelRenderer(this);
		handguard109_r5.setRotationPoint(0.4F, -0.95F, -14.9F);
		bone2.addChild(handguard109_r5);
		setRotationAngle(handguard109_r5, 0.0F, 0.0F, 0.733F);
		handguard109_r5.cubeList.add(new ModelBox(handguard109_r5, 0, 133, 0.0F, -1.0F, -1.999F, 1, 1, 16, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.501F, 6.8F, 30.401F);
		handguard.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -1.5708F);
		bone4.cubeList.add(new ModelBox(bone4, 84, 117, 0.1F, 0.0F, -16.901F, 1, 1, 16, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 33, 78, -0.1F, 0.0F, -2.901F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 77, 34, 0.0F, 0.0F, -8.901F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 77, 27, 0.0F, 0.0F, -6.901F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 6, 73, 0.0F, 0.0F, -4.901F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 71, 32, 0.0F, 0.0F, -10.901F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 71, 29, 0.0F, 0.0F, -12.901F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 71, 27, 0.0F, 0.0F, -14.901F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 13, 71, 0.0F, 0.0F, -16.801F, 1, 1, 1, 0.0F, false));

		handguard120_r2 = new ModelRenderer(this);
		handguard120_r2.setRotationPoint(0.3F, 1.95F, -4.9F);
		bone4.addChild(handguard120_r2);
		setRotationAngle(handguard120_r2, 0.0F, 0.0F, -0.8203F);
		handguard120_r2.cubeList.add(new ModelBox(handguard120_r2, 41, 49, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard120_r2.cubeList.add(new ModelBox(handguard120_r2, 21, 50, 0.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard120_r2.cubeList.add(new ModelBox(handguard120_r2, 59, 3, 0.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard120_r2.cubeList.add(new ModelBox(handguard120_r2, 0, 61, 0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard120_r2.cubeList.add(new ModelBox(handguard120_r2, 14, 61, 0.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard120_r2.cubeList.add(new ModelBox(handguard120_r2, 65, 64, 0.0F, 0.0F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard120_r2.cubeList.add(new ModelBox(handguard120_r2, 66, 2, 0.0F, 0.0F, -11.9F, 1, 1, 1, 0.0F, false));

		handguard121_r1 = new ModelRenderer(this);
		handguard121_r1.setRotationPoint(0.2F, 1.95F, -2.9F);
		bone4.addChild(handguard121_r1);
		setRotationAngle(handguard121_r1, 0.0F, 0.0F, -1.0123F);
		handguard121_r1.cubeList.add(new ModelBox(handguard121_r1, 0, 50, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard120_r3 = new ModelRenderer(this);
		handguard120_r3.setRotationPoint(0.2F, -0.95F, -2.9F);
		bone4.addChild(handguard120_r3);
		setRotationAngle(handguard120_r3, 0.0F, 0.0F, 1.0123F);
		handguard120_r3.cubeList.add(new ModelBox(handguard120_r3, 7, 50, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard119_r4 = new ModelRenderer(this);
		handguard119_r4.setRotationPoint(0.3F, -0.95F, -4.9F);
		bone4.addChild(handguard119_r4);
		setRotationAngle(handguard119_r4, 0.0F, 0.0F, 0.8203F);
		handguard119_r4.cubeList.add(new ModelBox(handguard119_r4, 14, 50, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard119_r4.cubeList.add(new ModelBox(handguard119_r4, 53, 55, 0.0F, -1.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard119_r4.cubeList.add(new ModelBox(handguard119_r4, 59, 54, 0.0F, -1.0F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard119_r4.cubeList.add(new ModelBox(handguard119_r4, 7, 61, 0.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard119_r4.cubeList.add(new ModelBox(handguard119_r4, 21, 61, 0.0F, -1.0F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard119_r4.cubeList.add(new ModelBox(handguard119_r4, 66, 0, 0.0F, -1.0F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard119_r4.cubeList.add(new ModelBox(handguard119_r4, 65, 66, 0.0F, -1.0F, -11.9F, 1, 1, 1, 0.0F, false));

		handguard114_r2 = new ModelRenderer(this);
		handguard114_r2.setRotationPoint(0.0F, 0.0F, -16.8F);
		bone4.addChild(handguard114_r2);
		setRotationAngle(handguard114_r2, 0.0F, 0.0F, 0.2967F);
		handguard114_r2.cubeList.add(new ModelBox(handguard114_r2, 53, 67, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard114_r2.cubeList.add(new ModelBox(handguard114_r2, 53, 69, 0.0F, -1.0F, 1.9F, 1, 1, 1, 0.0F, false));
		handguard114_r2.cubeList.add(new ModelBox(handguard114_r2, 0, 71, 0.0F, -1.0F, 3.9F, 1, 1, 1, 0.0F, false));
		handguard114_r2.cubeList.add(new ModelBox(handguard114_r2, 6, 71, 0.0F, -1.0F, 5.9F, 1, 1, 1, 0.0F, false));
		handguard114_r2.cubeList.add(new ModelBox(handguard114_r2, 13, 73, 0.0F, -1.0F, 11.9F, 1, 1, 1, 0.0F, false));
		handguard114_r2.cubeList.add(new ModelBox(handguard114_r2, 75, 51, 0.0F, -1.0F, 9.9F, 1, 1, 1, 0.0F, false));
		handguard114_r2.cubeList.add(new ModelBox(handguard114_r2, 77, 39, 0.0F, -1.0F, 7.9F, 1, 1, 1, 0.0F, false));

		handguard115_r1 = new ModelRenderer(this);
		handguard115_r1.setRotationPoint(0.0F, 1.0F, -16.8F);
		bone4.addChild(handguard115_r1);
		setRotationAngle(handguard115_r1, 0.0F, 0.0F, -0.2967F);
		handguard115_r1.cubeList.add(new ModelBox(handguard115_r1, 71, 34, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard115_r1.cubeList.add(new ModelBox(handguard115_r1, 71, 39, 0.0F, 0.0F, 1.9F, 1, 1, 1, 0.0F, false));
		handguard115_r1.cubeList.add(new ModelBox(handguard115_r1, 71, 41, 0.0F, 0.0F, 3.9F, 1, 1, 1, 0.0F, false));
		handguard115_r1.cubeList.add(new ModelBox(handguard115_r1, 64, 71, 0.0F, 0.0F, 5.9F, 1, 1, 1, 0.0F, false));
		handguard115_r1.cubeList.add(new ModelBox(handguard115_r1, 0, 73, 0.0F, 0.0F, 11.9F, 1, 1, 1, 0.0F, false));
		handguard115_r1.cubeList.add(new ModelBox(handguard115_r1, 77, 29, 0.0F, 0.0F, 9.9F, 1, 1, 1, 0.0F, false));
		handguard115_r1.cubeList.add(new ModelBox(handguard115_r1, 77, 32, 0.0F, 0.0F, 7.9F, 1, 1, 1, 0.0F, false));

		handguard110_r3 = new ModelRenderer(this);
		handguard110_r3.setRotationPoint(-0.1F, 0.0F, -2.9F);
		bone4.addChild(handguard110_r3);
		setRotationAngle(handguard110_r3, 0.0F, 0.0F, 0.2967F);
		handguard110_r3.cubeList.add(new ModelBox(handguard110_r3, 77, 41, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard111_r1 = new ModelRenderer(this);
		handguard111_r1.setRotationPoint(-0.1F, 1.0F, -2.9F);
		bone4.addChild(handguard111_r1);
		setRotationAngle(handguard111_r1, 0.0F, 0.0F, -0.2967F);
		handguard111_r1.cubeList.add(new ModelBox(handguard111_r1, 78, 44, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard111_r2 = new ModelRenderer(this);
		handguard111_r2.setRotationPoint(0.4F, 1.95F, -14.9F);
		bone4.addChild(handguard111_r2);
		setRotationAngle(handguard111_r2, 0.0F, 0.0F, -0.733F);
		handguard111_r2.cubeList.add(new ModelBox(handguard111_r2, 0, 116, 0.0F, 0.0F, -1.999F, 1, 1, 16, 0.0F, false));

		handguard110_r4 = new ModelRenderer(this);
		handguard110_r4.setRotationPoint(0.1F, 1.0F, -14.9F);
		bone4.addChild(handguard110_r4);
		setRotationAngle(handguard110_r4, 0.0F, 0.0F, -0.2967F);
		handguard110_r4.cubeList.add(new ModelBox(handguard110_r4, 44, 117, 0.0F, 0.0F, -2.0F, 1, 1, 16, 0.0F, false));

		handguard109_r6 = new ModelRenderer(this);
		handguard109_r6.setRotationPoint(0.1F, 0.0F, -14.9F);
		bone4.addChild(handguard109_r6);
		setRotationAngle(handguard109_r6, 0.0F, 0.0F, 0.2967F);
		handguard109_r6.cubeList.add(new ModelBox(handguard109_r6, 118, 0, 0.0F, -1.0F, -2.0F, 1, 1, 16, 0.0F, false));

		handguard110_r5 = new ModelRenderer(this);
		handguard110_r5.setRotationPoint(0.4F, -0.95F, -14.9F);
		bone4.addChild(handguard110_r5);
		setRotationAngle(handguard110_r5, 0.0F, 0.0F, 0.733F);
		handguard110_r5.cubeList.add(new ModelBox(handguard110_r5, 118, 17, 0.0F, -1.0F, -1.999F, 1, 1, 16, 0.0F, false));

		m110_stock = new ModelRenderer(this);
		m110_stock.setRotationPoint(0.0F, 23.9F, 1.0F);
		m110_stock.cubeList.add(new ModelBox(m110_stock, 194, 179, -1.65F, -37.4F, 2.351F, 2, 1, 32, 0.001F, false));
		m110_stock.cubeList.add(new ModelBox(m110_stock, 192, 146, -3.35F, -37.4F, 2.352F, 2, 1, 32, 0.001F, false));

		receiver16_r8 = new ModelRenderer(this);
		receiver16_r8.setRotationPoint(-3.35F, -37.4F, 2.35F);
		m110_stock.addChild(receiver16_r8);
		setRotationAngle(receiver16_r8, 0.0F, 0.0F, 0.4014F);
		receiver16_r8.cubeList.add(new ModelBox(receiver16_r8, 202, 69, -0.001F, -1.4F, -0.0001F, 1, 1, 32, 0.0F, false));
		receiver16_r8.cubeList.add(new ModelBox(receiver16_r8, 196, 0, 0.0F, -1.0F, 0.0F, 2, 1, 32, 0.0F, false));

		receiver19_r1 = new ModelRenderer(this);
		receiver19_r1.setRotationPoint(0.0F, -30.7F, 10.25F);
		m110_stock.addChild(receiver19_r1);
		setRotationAngle(receiver19_r1, -0.3491F, 0.0F, 0.0F);
		receiver19_r1.cubeList.add(new ModelBox(receiver19_r1, 59, 27, -3.001F, -1.0F, 0.0F, 3, 1, 23, 0.0F, false));

		receiver18_r2 = new ModelRenderer(this);
		receiver18_r2.setRotationPoint(0.0F, -32.3F, 1.95F);
		m110_stock.addChild(receiver18_r2);
		setRotationAngle(receiver18_r2, -0.192F, 0.0F, 0.0F);
		receiver18_r2.cubeList.add(new ModelBox(receiver18_r2, 87, 14, -3.0F, -1.0F, 0.0F, 3, 1, 9, 0.0F, false));

		receiver23_r1 = new ModelRenderer(this);
		receiver23_r1.setRotationPoint(-3.35F, -36.4F, 33.35F);
		m110_stock.addChild(receiver23_r1);
		setRotationAngle(receiver23_r1, -0.1658F, -0.0052F, -0.0279F);
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 84, 83, 0.0F, 4.0F, -30.0F, 1, 5, 14, 0.0F, false));
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 28, 28, 0.0F, 2.0F, -16.0F, 1, 8, 5, 0.0F, false));
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 102, 78, 0.0F, 1.0F, -11.0F, 1, 10, 5, 0.0F, false));
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 59, 83, 0.0F, 0.0F, -6.0F, 1, 12, 6, 0.0F, false));

		receiver22_r1 = new ModelRenderer(this);
		receiver22_r1.setRotationPoint(0.35F, -36.4F, 33.35F);
		m110_stock.addChild(receiver22_r1);
		setRotationAngle(receiver22_r1, -0.1658F, 0.0052F, 0.0279F);
		receiver22_r1.cubeList.add(new ModelBox(receiver22_r1, 24, 86, -1.0F, 4.0F, -30.0F, 1, 5, 14, 0.0F, false));
		receiver22_r1.cubeList.add(new ModelBox(receiver22_r1, 43, 28, -1.0F, 2.0F, -16.0F, 1, 8, 5, 0.0F, false));
		receiver22_r1.cubeList.add(new ModelBox(receiver22_r1, 18, 116, -1.0F, 1.0F, -11.0F, 1, 10, 5, 0.0F, false));
		receiver22_r1.cubeList.add(new ModelBox(receiver22_r1, 0, 86, -1.0F, 0.0F, -6.0F, 1, 12, 6, 0.0F, false));

		receiver21_r1 = new ModelRenderer(this);
		receiver21_r1.setRotationPoint(-3.35F, -36.4F, 33.35F);
		m110_stock.addChild(receiver21_r1);
		setRotationAngle(receiver21_r1, -0.3752F, -0.0052F, -0.0279F);
		receiver21_r1.cubeList.add(new ModelBox(receiver21_r1, 0, 86, -0.001F, 11.1F, -19.0F, 1, 2, 22, 0.0F, false));

		receiver20_r1 = new ModelRenderer(this);
		receiver20_r1.setRotationPoint(0.35F, -36.4F, 33.35F);
		m110_stock.addChild(receiver20_r1);
		setRotationAngle(receiver20_r1, -0.3752F, 0.0052F, 0.0279F);
		receiver20_r1.cubeList.add(new ModelBox(receiver20_r1, 97, 197, -0.999F, 11.1F, -19.0F, 1, 2, 22, 0.0F, false));

		receiver19_r2 = new ModelRenderer(this);
		receiver19_r2.setRotationPoint(-3.35F, -36.4F, 34.35F);
		m110_stock.addChild(receiver19_r2);
		setRotationAngle(receiver19_r2, -0.1658F, 0.0F, -0.0279F);
		receiver19_r2.cubeList.add(new ModelBox(receiver19_r2, 74, 117, 0.0F, 0.0F, -1.0F, 2, 13, 1, 0.0F, false));

		receiver18_r3 = new ModelRenderer(this);
		receiver18_r3.setRotationPoint(0.35F, -36.4F, 34.35F);
		m110_stock.addChild(receiver18_r3);
		setRotationAngle(receiver18_r3, -0.1658F, 0.0F, 0.0279F);
		receiver18_r3.cubeList.add(new ModelBox(receiver18_r3, 84, 117, -2.0F, 0.0F, -1.0F, 2, 13, 1, 0.0F, false));

		receiver19_r3 = new ModelRenderer(this);
		receiver19_r3.setRotationPoint(-3.35F, -36.4F, 2.0F);
		m110_stock.addChild(receiver19_r3);
		setRotationAngle(receiver19_r3, 0.0F, 0.0F, -0.0873F);
		receiver19_r3.cubeList.add(new ModelBox(receiver19_r3, 0, 197, 0.0F, 0.0F, 0.0F, 1, 4, 31, 0.0F, false));

		receiver20_r2 = new ModelRenderer(this);
		receiver20_r2.setRotationPoint(-2.35F, -34.85F, 3.5F);
		m110_stock.addChild(receiver20_r2);
		setRotationAngle(receiver20_r2, -0.2443F, 0.0F, 0.0F);
		receiver20_r2.cubeList.add(new ModelBox(receiver20_r2, 20, 35, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));
		receiver20_r2.cubeList.add(new ModelBox(receiver20_r2, 21, 44, 1.95F, 0.5F, 0.5F, 1, 1, 1, 0.0F, false));
		receiver20_r2.cubeList.add(new ModelBox(receiver20_r2, 43, 18, 1.7F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		receiver21_r2 = new ModelRenderer(this);
		receiver21_r2.setRotationPoint(-2.6F, -33.95F, 28.3F);
		m110_stock.addChild(receiver21_r2);
		setRotationAngle(receiver21_r2, -0.2443F, 0.0F, 0.0F);
		receiver21_r2.cubeList.add(new ModelBox(receiver21_r2, 59, 71, -1.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F, false));
		receiver21_r2.cubeList.add(new ModelBox(receiver21_r2, 71, 59, 2.2F, 0.0F, 0.0F, 1, 3, 3, 0.0F, false));

		receiver18_r4 = new ModelRenderer(this);
		receiver18_r4.setRotationPoint(0.35F, -36.4F, 2.0F);
		m110_stock.addChild(receiver18_r4);
		setRotationAngle(receiver18_r4, 0.0F, 0.0F, 0.0873F);
		receiver18_r4.cubeList.add(new ModelBox(receiver18_r4, 64, 197, -1.0F, 0.0F, 0.0F, 1, 4, 31, 0.0F, false));

		receiver16_r9 = new ModelRenderer(this);
		receiver16_r9.setRotationPoint(0.35F, -37.4F, 2.35F);
		m110_stock.addChild(receiver16_r9);
		setRotationAngle(receiver16_r9, 0.0F, 0.0F, -0.4014F);
		receiver16_r9.cubeList.add(new ModelBox(receiver16_r9, 123, 195, -2.0F, -1.0F, 0.0F, 2, 1, 32, 0.0F, false));
		receiver16_r9.cubeList.add(new ModelBox(receiver16_r9, 204, 102, -0.999F, -1.4F, -0.0001F, 1, 1, 32, 0.0F, false));

		receiver17_r4 = new ModelRenderer(this);
		receiver17_r4.setRotationPoint(-1.5F, -39.25F, 2.35F);
		m110_stock.addChild(receiver17_r4);
		setRotationAngle(receiver17_r4, 0.0F, 0.0F, -0.4014F);
		receiver17_r4.cubeList.add(new ModelBox(receiver17_r4, 196, 35, -1.4F, -0.001F, 0.0049F, 1, 2, 32, 0.0F, false));
		receiver17_r4.cubeList.add(new ModelBox(receiver17_r4, 193, 212, -1.0F, 0.0F, 0.002F, 1, 1, 32, 0.0F, false));

		receiver17_r5 = new ModelRenderer(this);
		receiver17_r5.setRotationPoint(-1.5F, -39.25F, 2.35F);
		m110_stock.addChild(receiver17_r5);
		setRotationAngle(receiver17_r5, 0.0F, 0.0F, 0.4014F);
		receiver17_r5.cubeList.add(new ModelBox(receiver17_r5, 227, 213, 0.0F, 0.0F, 0.0F, 1, 1, 32, 0.0F, false));
		receiver17_r5.cubeList.add(new ModelBox(receiver17_r5, 159, 196, 0.4F, -0.001F, 0.001F, 1, 2, 32, 0.0F, false));

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.25F, -2.4F, -22.7F);
		magazine.cubeList.add(new ModelBox(magazine, 14, 86, -1.0F, -6.0F, 0.0F, 1, 15, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -3.25F, -6.001F, -0.1F, 3, 15, 7, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 44, 116, -3.251F, -6.002F, 6.4F, 3, 15, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 70, 117, -1.0F, -6.0F, 2.75F, 1, 15, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 62, 117, -1.0F, -5.9F, 4.5F, 1, 15, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 54, 116, -1.0F, -6.0F, 6.5F, 1, 16, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 112, 26, -0.8F, -6.0F, 7.8F, 1, 16, 1, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 7, 41, -0.799F, 8.9F, 7.799F, 1, 2, 1, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 108, 27, -3.7F, -6.0F, 7.8F, 1, 16, 1, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 41, -3.701F, 8.9F, 7.799F, 1, 2, 1, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 20, 0, -3.5F, -6.0F, 0.0F, 1, 15, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 66, 117, -3.5F, -6.0F, 2.75F, 1, 15, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 30, 116, -3.5F, -5.9F, 4.5F, 1, 15, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 34, 116, -3.5F, -6.0F, 6.5F, 1, 16, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 73, 83, -3.25F, -4.0F, 8.15F, 3, 14, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 8, 86, -3.249F, 9.7F, 8.149F, 3, 1, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-2.5F, 9.0F, 0.0F);
		magazine.addChild(cube_r16);
		setRotationAngle(cube_r16, 1.3788F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 44, -0.998F, 6.5F, -0.001F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 28, -0.999F, 2.8F, 0.0F, 1, 4, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 41, -0.999F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 7, 44, 1.502F, 6.5F, -0.001F, 1, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 17, 1.501F, 2.8F, 0.0F, 1, 4, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 76, -0.748F, 7.5F, -0.001F, 3, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 28, -0.749F, 0.0F, -0.002F, 3, 8, 2, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 21, 41, 1.501F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.3F, -6.0F, 7.4F);
		magazine.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.3491F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 41, 0.0F, -1.0F, -4.001F, 1, 1, 5, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.2F, -6.0F, 7.4F);
		magazine.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.3491F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 14, 41, -1.0F, -1.0F, -4.001F, 1, 1, 5, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-3.5F, -6.0F, 6.5F);
		magazine.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.3491F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 17, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, -6.0F, 6.5F);
		magazine.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.3491F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 43, 31, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-3.5F, -5.9F, 4.5F);
		magazine.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.3491F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 8, 28, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, -5.9F, 4.5F);
		magazine.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.3491F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 44, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		gun.render(f5);
//		receiver.render(f5);
//		action.render(f5);
//		grip.render(f5);
		handguard.render(f5);
//		m110_stock.render(f5);
//		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
