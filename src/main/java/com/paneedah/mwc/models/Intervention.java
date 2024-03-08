package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Intervention extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer Shape300_r1;
	private final ModelRenderer Shape296_r1;
	private final ModelRenderer Shape292_r1;
	private final ModelRenderer Shape291_r1;
	private final ModelRenderer Shape290_r1;
	private final ModelRenderer Shape286_r1;
	private final ModelRenderer Shape285_r1;
	private final ModelRenderer Shape284_r1;
	private final ModelRenderer Shape270_r1;
	private final ModelRenderer Shape269_r1;
	private final ModelRenderer Shape268_r1;
	private final ModelRenderer Shape267_r1;
	private final ModelRenderer Shape266_r1;
	private final ModelRenderer Shape265_r1;
	private final ModelRenderer Shape264_r1;
	private final ModelRenderer Shape263_r1;
	private final ModelRenderer Shape262_r1;
	private final ModelRenderer Shape261_r1;
	private final ModelRenderer Shape260_r1;
	private final ModelRenderer Shape259_r1;
	private final ModelRenderer Shape258_r1;
	private final ModelRenderer Shape257_r1;
	private final ModelRenderer Shape256_r1;
	private final ModelRenderer Shape255_r1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Shape14_r1;
	private final ModelRenderer Shape12_r1;
	private final ModelRenderer Shape11_r1;
	private final ModelRenderer Shape379_r1;
	private final ModelRenderer Shape374_r1;
	private final ModelRenderer Shape368_r1;
	private final ModelRenderer Shape367_r1;
	private final ModelRenderer Shape187_r1;
	private final ModelRenderer Shape139_r1;
	private final ModelRenderer Shape138_r1;
	private final ModelRenderer Shape137_r1;
	private final ModelRenderer Shape136_r1;
	private final ModelRenderer Shape135_r1;
	private final ModelRenderer Shape134_r1;
	private final ModelRenderer Shape133_r1;
	private final ModelRenderer Shape132_r1;
	private final ModelRenderer Shape49_r1;
	private final ModelRenderer Shape48_r1;
	private final ModelRenderer Shape47_r1;
	private final ModelRenderer Shape44_r1;
	private final ModelRenderer Shape39_r1;
	private final ModelRenderer Shape33_r1;
	private final ModelRenderer Shape32_r1;
	private final ModelRenderer Shape28_r1;
	private final ModelRenderer Shape27_r1;
	private final ModelRenderer Shape23_r1;
	private final ModelRenderer Shape17_r1;
	private final ModelRenderer Shape16_r1;
	private final ModelRenderer CheyTac_grip;
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

	public Intervention() {
		textureWidth = 512;
		textureHeight = 512;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(1.5613F, -18.993F, -33.2262F);
		gun.cubeList.add(new ModelBox(gun, 0, 26, -1.0613F, 5.493F, 29.2262F, 2, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 191, -1.5613F, 2.493F, 45.7262F, 3, 4, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 41, -1.0613F, 2.493F, 46.4262F, 2, 4, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 106, 32, 0.9287F, 2.493F, 27.2262F, 1, 8, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 204, 191, -2.0613F, 2.493F, 32.2262F, 4, 4, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 152, 235, 1.9387F, 4.493F, 32.2262F, 2, 2, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 41, -2.0613F, 1.993F, 11.2262F, 4, 1, 35, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 162, 75, -2.0613F, 2.493F, 15.2262F, 1, 2, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 131, 0.9287F, 2.493F, 15.2262F, 1, 2, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 129, 63, -2.0613F, 2.993F, 10.7262F, 4, 3, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 131, -2.0613F, 1.993F, 9.2262F, 4, 9, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 157, 3, 1.9387F, 4.493F, 10.2262F, 2, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 157, 0, -4.0613F, 4.493F, 10.2262F, 2, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 183, 1.9387F, 2.493F, 32.2262F, 2, 2, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 131, 148, 3.2387F, 3.493F, 34.0262F, 1, 2, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 148, 172, -2.0613F, 5.993F, 10.7262F, 4, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 155, 1.9387F, 4.493F, 10.7262F, 2, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 155, -4.0613F, 4.493F, 10.7262F, 2, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 172, 191, 1.7387F, 0.393F, 9.2262F, 1, 1, 30, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 172, 160, -2.8613F, 0.393F, 9.2262F, 1, 1, 30, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 85, -2.0613F, 0.993F, 10.2262F, 4, 1, 29, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 172, 1.7387F, -0.607F, 9.2262F, 1, 1, 30, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 204, 160, -2.8613F, -0.607F, 9.2262F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 130, 236, -2.8613F, -0.607F, 30.2262F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 166, 0, -1.0613F, -4.607F, 13.2162F, 2, 2, 26, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 32, -1.4613F, -3.107F, 9.2262F, 2, 1, 30, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 117, 0.3387F, -3.107F, 9.2262F, 1, 1, 30, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 60, -2.0613F, 0.993F, 39.2262F, 4, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 214, 54, -2.8613F, -3.107F, 39.1762F, 4, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 54, 78, -2.8613F, -0.607F, 39.2262F, 4, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 129, 99, 0.9387F, -0.507F, 38.2262F, 2, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 162, 85, -0.5613F, -4.707F, 13.2262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 162, -0.5613F, -4.707F, 16.2262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 162, -0.5613F, -4.707F, 19.2262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 162, -0.5613F, -4.707F, 22.2262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 89, 161, -0.5613F, -4.707F, 25.2262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 152, 160, -0.5613F, -4.707F, 28.2262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 143, 160, -0.5613F, -4.707F, 31.2262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 136, 160, -0.5613F, -4.707F, 34.2262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 153, 127, -0.5613F, -4.707F, 37.2262F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 127, 160, -0.5613F, -4.707F, 35.7262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 120, 160, -0.5613F, -4.707F, 32.7262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 111, 160, -0.5613F, -4.707F, 29.7262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 103, 160, -0.5613F, -4.707F, 26.7262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 95, 160, -0.5613F, -4.707F, 23.7262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 160, -0.5613F, -4.707F, 20.7262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 160, -0.5613F, -4.707F, 17.7262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 160, -0.5613F, -4.707F, 14.7262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 213, -2.0613F, 0.993F, 39.7262F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 11, 213, 0.9387F, 0.993F, 39.7262F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 160, 33, -2.0613F, 1.793F, 45.2262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 160, 20, 0.9387F, 1.793F, 45.2262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 78, 32, -1.0613F, 1.893F, 45.2262F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 222, 117, 2.2387F, -0.707F, 34.0262F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 222, 86, 2.2387F, -0.007F, 34.0262F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 230, -4.0613F, 4.493F, 32.2262F, 2, 2, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 106, -1.0613F, 9.493F, 33.2262F, 2, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 178, 28, -1.0613F, 6.493F, 29.2262F, 2, 4, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 41, -0.5613F, 6.493F, 38.7262F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 160, 15, -0.5613F, 7.393F, 36.9262F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 106, 0, -2.0613F, 2.493F, 27.2262F, 1, 8, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 85, -0.5613F, -1.507F, -70.7738F, 1, 3, 84, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -1.5613F, -0.507F, -70.7738F, 3, 1, 84, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 166, 0, -0.5613F, -1.807F, -80.7738F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 162, 137, -0.5613F, 0.793F, -80.7738F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 142, 71, -1.8613F, -0.507F, -80.7738F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 142, 66, 0.7387F, -0.507F, -80.7738F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 141, 87, 0.7387F, -0.507F, -78.7738F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 141, 85, 0.7387F, -0.507F, -76.7738F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 203, 0.7387F, -0.507F, -74.7738F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 141, -1.8613F, -0.507F, -78.7738F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 22, 141, -1.8613F, -0.507F, -76.7738F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 64, 202, -1.8613F, -0.507F, -74.7738F, 1, 1, 4, 0.0F, false));

		Shape300_r1 = new ModelRenderer(this);
		Shape300_r1.setRotationPoint(-25.9799F, -31.8925F, 45.2262F);
		gun.addChild(Shape300_r1);
		setRotationAngle(Shape300_r1, 0.0F, 0.0F, 2.3562F);
		Shape300_r1.cubeList.add(new ModelBox(Shape300_r1, 160, 177, 3.3F, -42.5F, -120.0F, 1, 1, 4, 0.0F, false));
		Shape300_r1.cubeList.add(new ModelBox(Shape300_r1, 137, 41, 3.3F, -42.5F, -122.0F, 1, 1, 1, 0.0F, false));
		Shape300_r1.cubeList.add(new ModelBox(Shape300_r1, 137, 43, 3.3F, -42.5F, -124.0F, 1, 1, 1, 0.0F, false));
		Shape300_r1.cubeList.add(new ModelBox(Shape300_r1, 138, 37, 3.3F, -42.5F, -126.0F, 1, 1, 1, 0.0F, false));

		Shape296_r1 = new ModelRenderer(this);
		Shape296_r1.setRotationPoint(-26.687F, -33.5996F, 45.2262F);
		gun.addChild(Shape296_r1);
		setRotationAngle(Shape296_r1, 0.0F, 0.0F, 2.3562F);
		Shape296_r1.cubeList.add(new ModelBox(Shape296_r1, 130, 185, 3.3F, -43.5F, -120.0F, 1, 1, 4, 0.0F, false));
		Shape296_r1.cubeList.add(new ModelBox(Shape296_r1, 138, 71, 3.3F, -43.5F, -122.0F, 1, 1, 1, 0.0F, false));
		Shape296_r1.cubeList.add(new ModelBox(Shape296_r1, 96, 138, 3.3F, -43.5F, -124.0F, 1, 1, 1, 0.0F, false));
		Shape296_r1.cubeList.add(new ModelBox(Shape296_r1, 112, 138, 3.3F, -43.5F, -126.0F, 1, 1, 1, 0.0F, false));

		Shape292_r1 = new ModelRenderer(this);
		Shape292_r1.setRotationPoint(30.9857F, -25.9256F, 45.2262F);
		gun.addChild(Shape292_r1);
		setRotationAngle(Shape292_r1, 0.0F, 0.0F, -2.3562F);
		Shape292_r1.cubeList.add(new ModelBox(Shape292_r1, 124, 51, 2.0F, -41.2F, -126.0F, 1, 1, 10, 0.0F, false));

		Shape291_r1 = new ModelRenderer(this);
		Shape291_r1.setRotationPoint(29.2786F, -26.6327F, 45.2262F);
		gun.addChild(Shape291_r1);
		setRotationAngle(Shape291_r1, 0.0F, 0.0F, -2.3562F);
		Shape291_r1.cubeList.add(new ModelBox(Shape291_r1, 138, 63, 1.0F, -41.2F, -126.0F, 1, 1, 10, 0.0F, false));

		Shape290_r1 = new ModelRenderer(this);
		Shape290_r1.setRotationPoint(28.4029F, 30.3329F, 45.2262F);
		gun.addChild(Shape290_r1);
		setRotationAngle(Shape290_r1, 0.0F, 0.0F, -0.7854F);
		Shape290_r1.cubeList.add(new ModelBox(Shape290_r1, 63, 192, -0.3F, -42.5F, -120.0F, 1, 1, 4, 0.0F, false));
		Shape290_r1.cubeList.add(new ModelBox(Shape290_r1, 127, 138, -0.3F, -42.5F, -122.0F, 1, 1, 1, 0.0F, false));
		Shape290_r1.cubeList.add(new ModelBox(Shape290_r1, 96, 140, -0.3F, -42.5F, -124.0F, 1, 1, 1, 0.0F, false));
		Shape290_r1.cubeList.add(new ModelBox(Shape290_r1, 112, 140, -0.3F, -42.5F, -126.0F, 1, 1, 1, 0.0F, false));

		Shape286_r1 = new ModelRenderer(this);
		Shape286_r1.setRotationPoint(-32.6539F, 28.4571F, 45.2262F);
		gun.addChild(Shape286_r1);
		setRotationAngle(Shape286_r1, 0.0F, 0.0F, 0.7854F);
		Shape286_r1.cubeList.add(new ModelBox(Shape286_r1, 86, 148, 2.0F, -44.8F, -126.0F, 1, 1, 10, 0.0F, false));

		Shape285_r1 = new ModelRenderer(this);
		Shape285_r1.setRotationPoint(-32.9468F, 29.1642F, 45.2262F);
		gun.addChild(Shape285_r1);
		setRotationAngle(Shape285_r1, 0.0F, 0.0F, 0.7854F);
		Shape285_r1.cubeList.add(new ModelBox(Shape285_r1, 108, 148, 1.0F, -44.8F, -126.0F, 1, 1, 10, 0.0F, false));

		Shape284_r1 = new ModelRenderer(this);
		Shape284_r1.setRotationPoint(29.11F, 30.04F, 45.2262F);
		gun.addChild(Shape284_r1);
		setRotationAngle(Shape284_r1, 0.0F, 0.0F, -0.7854F);
		Shape284_r1.cubeList.add(new ModelBox(Shape284_r1, 192, 191, -0.3F, -43.5F, -120.0F, 1, 1, 4, 0.0F, false));
		Shape284_r1.cubeList.add(new ModelBox(Shape284_r1, 127, 140, -0.3F, -43.5F, -122.0F, 1, 1, 1, 0.0F, false));
		Shape284_r1.cubeList.add(new ModelBox(Shape284_r1, 14, 141, -0.3F, -43.5F, -124.0F, 1, 1, 1, 0.0F, false));
		Shape284_r1.cubeList.add(new ModelBox(Shape284_r1, 18, 141, -0.3F, -43.5F, -126.0F, 1, 1, 1, 0.0F, false));

		Shape270_r1 = new ModelRenderer(this);
		Shape270_r1.setRotationPoint(29.6614F, -27.0741F, 45.2262F);
		gun.addChild(Shape270_r1);
		setRotationAngle(Shape270_r1, 0.0F, 0.0F, -2.3562F);
		Shape270_r1.cubeList.add(new ModelBox(Shape270_r1, 86, 85, 1.1F, -41.5F, -106.0F, 1, 1, 74, 0.0F, false));

		Shape269_r1 = new ModelRenderer(this);
		Shape269_r1.setRotationPoint(28.52F, 30.6157F, 45.2262F);
		gun.addChild(Shape269_r1);
		setRotationAngle(Shape269_r1, 0.0F, 0.0F, -0.7854F);
		Shape269_r1.cubeList.add(new ModelBox(Shape269_r1, 90, 0, 0.1F, -42.5F, -106.0F, 1, 1, 74, 0.0F, false));

		Shape268_r1 = new ModelRenderer(this);
		Shape268_r1.setRotationPoint(31.2686F, -26.6084F, 45.2262F);
		gun.addChild(Shape268_r1);
		setRotationAngle(Shape268_r1, 0.0F, 0.0F, -2.3562F);
		Shape268_r1.cubeList.add(new ModelBox(Shape268_r1, 96, 160, 2.0F, -41.6F, -106.0F, 1, 1, 74, 0.0F, false));

		Shape267_r1 = new ModelRenderer(this);
		Shape267_r1.setRotationPoint(-26.6628F, -31.6097F, 45.2262F);
		gun.addChild(Shape267_r1);
		setRotationAngle(Shape267_r1, 0.0F, 0.0F, 2.3562F);
		Shape267_r1.cubeList.add(new ModelBox(Shape267_r1, 162, 75, 2.9F, -42.5F, -106.0F, 1, 1, 74, 0.0F, false));

		Shape266_r1 = new ModelRenderer(this);
		Shape266_r1.setRotationPoint(-27.3699F, -33.3168F, 45.2262F);
		gun.addChild(Shape266_r1);
		setRotationAngle(Shape266_r1, 0.0F, 0.0F, 2.3562F);
		Shape266_r1.cubeList.add(new ModelBox(Shape266_r1, 0, 172, 2.9F, -43.5F, -106.0F, 1, 1, 74, 0.0F, false));

		Shape265_r1 = new ModelRenderer(this);
		Shape265_r1.setRotationPoint(-32.3711F, 28.5743F, 45.2262F);
		gun.addChild(Shape265_r1);
		setRotationAngle(Shape265_r1, 0.0F, 0.0F, 0.7854F);
		Shape265_r1.cubeList.add(new ModelBox(Shape265_r1, 172, 150, 2.0F, -44.4F, -106.0F, 1, 1, 74, 0.0F, false));

		Shape264_r1 = new ModelRenderer(this);
		Shape264_r1.setRotationPoint(29.2271F, 30.3228F, 45.2262F);
		gun.addChild(Shape264_r1);
		setRotationAngle(Shape264_r1, 0.0F, 0.0F, -0.7854F);
		Shape264_r1.cubeList.add(new ModelBox(Shape264_r1, 172, 225, 0.1F, -43.5F, -106.0F, 1, 1, 74, 0.0F, false));

		Shape263_r1 = new ModelRenderer(this);
		Shape263_r1.setRotationPoint(-32.664F, 29.2814F, 45.2262F);
		gun.addChild(Shape263_r1);
		setRotationAngle(Shape263_r1, 0.0F, 0.0F, 0.7854F);
		Shape263_r1.cubeList.add(new ModelBox(Shape263_r1, 76, 235, 1.0F, -44.4F, -106.0F, 1, 1, 74, 0.0F, false));

		Shape262_r1 = new ModelRenderer(this);
		Shape262_r1.setRotationPoint(31.1978F, -26.4377F, 45.2262F);
		gun.addChild(Shape262_r1);
		setRotationAngle(Shape262_r1, 0.0F, 0.0F, -2.3562F);
		Shape262_r1.cubeList.add(new ModelBox(Shape262_r1, 166, 11, 2.0F, -41.5F, -116.0F, 1, 1, 10, 0.0F, false));

		Shape261_r1 = new ModelRenderer(this);
		Shape261_r1.setRotationPoint(29.4907F, -27.1448F, 45.2262F);
		gun.addChild(Shape261_r1);
		setRotationAngle(Shape261_r1, 0.0F, 0.0F, -2.3562F);
		Shape261_r1.cubeList.add(new ModelBox(Shape261_r1, 166, 28, 1.0F, -41.5F, -116.0F, 1, 1, 10, 0.0F, false));

		Shape260_r1 = new ModelRenderer(this);
		Shape260_r1.setRotationPoint(28.4907F, 30.545F, 45.2262F);
		gun.addChild(Shape260_r1);
		setRotationAngle(Shape260_r1, 0.0F, 0.0F, -0.7854F);
		Shape260_r1.cubeList.add(new ModelBox(Shape260_r1, 166, 39, 0.0F, -42.5F, -116.0F, 1, 1, 10, 0.0F, false));

		Shape259_r1 = new ModelRenderer(this);
		Shape259_r1.setRotationPoint(29.1978F, 30.2521F, 45.2262F);
		gun.addChild(Shape259_r1);
		setRotationAngle(Shape259_r1, 0.0F, 0.0F, -0.7854F);
		Shape259_r1.cubeList.add(new ModelBox(Shape259_r1, 0, 172, 0.0F, -43.5F, -116.0F, 1, 1, 10, 0.0F, false));

		Shape258_r1 = new ModelRenderer(this);
		Shape258_r1.setRotationPoint(-26.492F, -31.6804F, 45.2262F);
		gun.addChild(Shape258_r1);
		setRotationAngle(Shape258_r1, 0.0F, 0.0F, 2.3562F);
		Shape258_r1.cubeList.add(new ModelBox(Shape258_r1, 148, 172, 3.0F, -42.5F, -116.0F, 1, 1, 10, 0.0F, false));

		Shape257_r1 = new ModelRenderer(this);
		Shape257_r1.setRotationPoint(-27.1992F, -33.3875F, 45.2262F);
		gun.addChild(Shape257_r1);
		setRotationAngle(Shape257_r1, 0.0F, 0.0F, 2.3562F);
		Shape257_r1.cubeList.add(new ModelBox(Shape257_r1, 172, 160, 3.0F, -43.5F, -116.0F, 1, 1, 10, 0.0F, false));

		Shape256_r1 = new ModelRenderer(this);
		Shape256_r1.setRotationPoint(-32.4418F, 28.545F, 45.2262F);
		gun.addChild(Shape256_r1);
		setRotationAngle(Shape256_r1, 0.0F, 0.0F, 0.7854F);
		Shape256_r1.cubeList.add(new ModelBox(Shape256_r1, 172, 171, 2.0F, -44.5F, -116.0F, 1, 1, 10, 0.0F, false));

		Shape255_r1 = new ModelRenderer(this);
		Shape255_r1.setRotationPoint(-32.7347F, 29.2521F, 45.2262F);
		gun.addChild(Shape255_r1);
		setRotationAngle(Shape255_r1, 0.0F, 0.0F, 0.7854F);
		Shape255_r1.cubeList.add(new ModelBox(Shape255_r1, 174, 138, 1.0F, -44.5F, -116.0F, 1, 1, 10, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.0613F, 13.7956F, 44.1401F);
		gun.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 64, 207, -1.5F, -6.4317F, -3.776F, 3, 2, 2, -0.48F, false));

		Shape14_r1 = new ModelRenderer(this);
		Shape14_r1.setRotationPoint(-1.5613F, 38.4215F, 19.319F);
		gun.addChild(Shape14_r1);
		setRotationAngle(Shape14_r1, -0.4189F, 0.0F, 0.0F);
		Shape14_r1.cubeList.add(new ModelBox(Shape14_r1, 160, 13, 1.0F, -35.0F, 3.8F, 1, 1, 1, 0.0F, false));

		Shape12_r1 = new ModelRenderer(this);
		Shape12_r1.setRotationPoint(-1.5613F, 41.0144F, 48.5348F);
		gun.addChild(Shape12_r1);
		setRotationAngle(Shape12_r1, 0.4189F, 0.0F, 0.0F);
		Shape12_r1.cubeList.add(new ModelBox(Shape12_r1, 65, 53, 1.0F, -37.0F, 3.0F, 1, 2, 1, 0.0F, false));

		Shape11_r1 = new ModelRenderer(this);
		Shape11_r1.setRotationPoint(-1.5613F, 41.1674F, 21.6999F);
		gun.addChild(Shape11_r1);
		setRotationAngle(Shape11_r1, -0.3142F, 0.0F, 0.0F);
		Shape11_r1.cubeList.add(new ModelBox(Shape11_r1, 37, 106, 0.5F, -37.3F, 0.0F, 2, 3, 1, 0.0F, false));

		Shape379_r1 = new ModelRenderer(this);
		Shape379_r1.setRotationPoint(-17.9941F, -39.2025F, 33.2262F);
		gun.addChild(Shape379_r1);
		setRotationAngle(Shape379_r1, 0.0F, 0.0F, 2.5281F);
		Shape379_r1.cubeList.add(new ModelBox(Shape379_r1, 160, 18, 4.8F, -43.7F, 0.8F, 1, 1, 1, 0.0F, false));

		Shape374_r1 = new ModelRenderer(this);
		Shape374_r1.setRotationPoint(-1.5613F, 32.8378F, 15.0251F);
		gun.addChild(Shape374_r1);
		setRotationAngle(Shape374_r1, -0.4833F, 0.0F, 0.0F);
		Shape374_r1.cubeList.add(new ModelBox(Shape374_r1, 160, 35, -0.5F, -42.0F, 12.2F, 1, 1, 1, 0.0F, false));
		Shape374_r1.cubeList.add(new ModelBox(Shape374_r1, 160, 37, 2.5F, -42.0F, 12.2F, 1, 1, 1, 0.0F, false));
		Shape374_r1.cubeList.add(new ModelBox(Shape374_r1, 160, 45, 2.5F, -42.0F, 11.5F, 1, 1, 1, 0.0F, false));
		Shape374_r1.cubeList.add(new ModelBox(Shape374_r1, 52, 160, -0.5F, -42.0F, 11.5F, 1, 1, 1, 0.0F, false));

		Shape368_r1 = new ModelRenderer(this);
		Shape368_r1.setRotationPoint(-47.1733F, 4.8584F, 33.2262F);
		gun.addChild(Shape368_r1);
		setRotationAngle(Shape368_r1, 0.0F, 0.0F, 1.3384F);
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 0, 0, 1.3F, -46.9F, -19.0F, 1, 0, 23, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 162, 150, 1.3F, -47.9F, -18.5F, 1, 1, 1, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 152, 162, 1.3F, -47.9F, -15.5F, 1, 1, 1, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 162, 152, 1.3F, -47.9F, -12.5F, 1, 1, 1, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 162, 154, 1.3F, -47.9F, -9.5F, 1, 1, 1, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 89, 163, 1.3F, -47.9F, -6.5F, 1, 1, 1, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 86, 164, 1.3F, -47.9F, -3.5F, 1, 1, 1, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 95, 164, 1.3F, -47.9F, -0.5F, 1, 1, 1, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 103, 164, 1.3F, -47.9F, 2.5F, 1, 1, 1, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 154, 108, 1.3F, -47.9F, 4.0F, 1, 1, 2, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 12, 165, 1.3F, -47.9F, 1.0F, 1, 1, 1, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 16, 165, 1.3F, -47.9F, -2.0F, 1, 1, 1, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 89, 165, 1.3F, -47.9F, -5.0F, 1, 1, 1, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 165, 103, 1.3F, -47.9F, -8.0F, 1, 1, 1, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 165, 107, 1.3F, -47.9F, -11.0F, 1, 1, 1, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 165, 109, 1.3F, -47.9F, -14.0F, 1, 1, 1, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 165, 111, 1.3F, -47.9F, -17.0F, 1, 1, 1, 0.0F, false));
		Shape368_r1.cubeList.add(new ModelBox(Shape368_r1, 165, 120, 1.3F, -47.9F, -20.0F, 1, 1, 1, 0.0F, false));

		Shape367_r1 = new ModelRenderer(this);
		Shape367_r1.setRotationPoint(-12.1968F, 41.4086F, 33.2262F);
		gun.addChild(Shape367_r1);
		setRotationAngle(Shape367_r1, 0.0F, 0.0F, 0.2248F);
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 0, 55, 2.7F, -47.9F, -19.0F, 0, 1, 23, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 86, 162, 1.7F, -47.9F, -18.5F, 1, 1, 1, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 95, 162, 1.7F, -47.9F, -15.5F, 1, 1, 1, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 162, 102, 1.7F, -47.9F, -12.5F, 1, 1, 1, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 103, 162, 1.7F, -47.9F, -9.5F, 1, 1, 1, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 162, 106, 1.7F, -47.9F, -6.5F, 1, 1, 1, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 162, 108, 1.7F, -47.9F, -3.5F, 1, 1, 1, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 162, 110, 1.7F, -47.9F, -0.5F, 1, 1, 1, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 111, 162, 1.7F, -47.9F, 2.5F, 1, 1, 1, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 153, 130, 1.7F, -47.9F, 4.0F, 1, 1, 2, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 162, 119, 1.7F, -47.9F, 1.0F, 1, 1, 1, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 120, 162, 1.7F, -47.9F, -2.0F, 1, 1, 1, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 162, 121, 1.7F, -47.9F, -5.0F, 1, 1, 1, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 162, 123, 1.7F, -47.9F, -8.0F, 1, 1, 1, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 127, 162, 1.7F, -47.9F, -11.0F, 1, 1, 1, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 136, 162, 1.7F, -47.9F, -14.0F, 1, 1, 1, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 143, 162, 1.7F, -47.9F, -17.0F, 1, 1, 1, 0.0F, false));
		Shape367_r1.cubeList.add(new ModelBox(Shape367_r1, 165, 122, 1.7F, -47.9F, -20.0F, 1, 1, 1, 0.0F, false));

		Shape187_r1 = new ModelRenderer(this);
		Shape187_r1.setRotationPoint(-1.5613F, 46.8436F, 17.5381F);
		gun.addChild(Shape187_r1);
		setRotationAngle(Shape187_r1, -0.3142F, 0.0F, 0.0F);
		Shape187_r1.cubeList.add(new ModelBox(Shape187_r1, 154, 152, 0.5F, -47.6F, -20.0F, 2, 2, 1, -0.01F, false));

		Shape139_r1 = new ModelRenderer(this);
		Shape139_r1.setRotationPoint(-41.6998F, 17.293F, 33.2262F);
		gun.addChild(Shape139_r1);
		setRotationAngle(Shape139_r1, 0.0F, 0.0F, 1.0996F);
		Shape139_r1.cubeList.add(new ModelBox(Shape139_r1, 165, 124, -0.1F, -45.6F, 6.0F, 1, 1, 1, 0.0F, false));

		Shape138_r1 = new ModelRenderer(this);
		Shape138_r1.setRotationPoint(44.6727F, 5.726F, 33.2262F);
		gun.addChild(Shape138_r1);
		setRotationAngle(Shape138_r1, 0.0F, 0.0F, -1.4137F);
		Shape138_r1.cubeList.add(new ModelBox(Shape138_r1, 165, 151, 1.3F, -45.7F, 6.0F, 1, 1, 1, 0.0F, false));

		Shape137_r1 = new ModelRenderer(this);
		Shape137_r1.setRotationPoint(-45.349F, 2.8617F, 33.2262F);
		gun.addChild(Shape137_r1);
		setRotationAngle(Shape137_r1, 0.0F, 0.0F, 1.4137F);
		Shape137_r1.cubeList.add(new ModelBox(Shape137_r1, 165, 153, 0.6F, -45.7F, 6.0F, 1, 1, 1, 0.0F, false));

		Shape136_r1 = new ModelRenderer(this);
		Shape136_r1.setRotationPoint(39.0857F, 19.9229F, 33.2262F);
		gun.addChild(Shape136_r1);
		setRotationAngle(Shape136_r1, 0.0F, 0.0F, -1.0996F);
		Shape136_r1.cubeList.add(new ModelBox(Shape136_r1, 118, 122, 1.5F, -44.7F, 5.0F, 2, 1, 2, 0.0F, false));

		Shape135_r1 = new ModelRenderer(this);
		Shape135_r1.setRotationPoint(30.5321F, 31.2734F, 33.2262F);
		gun.addChild(Shape135_r1);
		setRotationAngle(Shape135_r1, 0.0F, 0.0F, -0.7854F);
		Shape135_r1.cubeList.add(new ModelBox(Shape135_r1, 123, 24, 1.9F, -44.6F, 5.0F, 2, 1, 2, 0.0F, false));

		Shape134_r1 = new ModelRenderer(this);
		Shape134_r1.setRotationPoint(18.8356F, 39.1524F, 33.2262F);
		gun.addChild(Shape134_r1);
		setRotationAngle(Shape134_r1, 0.0F, 0.0F, -0.4712F);
		Shape134_r1.cubeList.add(new ModelBox(Shape134_r1, 124, 37, 2.2F, -44.4F, 5.0F, 2, 1, 2, 0.0F, false));

		Shape133_r1 = new ModelRenderer(this);
		Shape133_r1.setRotationPoint(5.367F, 42.8255F, 33.2262F);
		gun.addChild(Shape133_r1);
		setRotationAngle(Shape133_r1, 0.0F, 0.0F, -0.1571F);
		Shape133_r1.cubeList.add(new ModelBox(Shape133_r1, 128, 122, 2.4F, -44.1F, 5.0F, 2, 1, 2, 0.0F, false));

		Shape132_r1 = new ModelRenderer(this);
		Shape132_r1.setRotationPoint(-8.2416F, 42.0737F, 33.2262F);
		gun.addChild(Shape132_r1);
		setRotationAngle(Shape132_r1, 0.0F, 0.0F, 0.1571F);
		Shape132_r1.cubeList.add(new ModelBox(Shape132_r1, 129, 90, 2.5F, -42.9F, 5.0F, 2, 1, 2, 0.0F, false));

		Shape49_r1 = new ModelRenderer(this);
		Shape49_r1.setRotationPoint(-37.9212F, 23.7533F, 33.2262F);
		gun.addChild(Shape49_r1);
		setRotationAngle(Shape49_r1, 0.0F, 0.0F, 0.9425F);
		Shape49_r1.cubeList.add(new ModelBox(Shape49_r1, 162, 75, -0.3F, -45.3F, -24.0F, 1, 1, 30, 0.0F, false));

		Shape48_r1 = new ModelRenderer(this);
		Shape48_r1.setRotationPoint(36.0352F, 26.1804F, 33.2262F);
		gun.addChild(Shape48_r1);
		setRotationAngle(Shape48_r1, 0.0F, 0.0F, -0.9425F);
		Shape48_r1.cubeList.add(new ModelBox(Shape48_r1, 162, 106, 2.3F, -45.3F, -24.0F, 1, 1, 30, 0.0F, false));

		Shape47_r1 = new ModelRenderer(this);
		Shape47_r1.setRotationPoint(-15.5142F, 40.688F, 33.2262F);
		gun.addChild(Shape47_r1);
		setRotationAngle(Shape47_r1, 0.0F, 0.0F, 0.3142F);
		Shape47_r1.cubeList.add(new ModelBox(Shape47_r1, 86, 117, -0.7F, -45.2F, -17.0F, 1, 1, 14, 0.0F, false));
		Shape47_r1.cubeList.add(new ModelBox(Shape47_r1, 154, 75, -0.7F, -45.2F, -24.0F, 1, 2, 7, 0.0F, false));
		Shape47_r1.cubeList.add(new ModelBox(Shape47_r1, 144, 191, -0.7F, -45.2F, -3.0F, 1, 2, 9, 0.0F, false));

		Shape44_r1 = new ModelRenderer(this);
		Shape44_r1.setRotationPoint(12.5384F, 41.6151F, 33.2262F);
		gun.addChild(Shape44_r1);
		setRotationAngle(Shape44_r1, 0.0F, 0.0F, -0.3142F);
		Shape44_r1.cubeList.add(new ModelBox(Shape44_r1, 0, 115, 2.7F, -45.2F, -24.0F, 1, 2, 30, 0.0F, false));

		Shape39_r1 = new ModelRenderer(this);
		Shape39_r1.setRotationPoint(-1.5613F, 42.1337F, 37.9437F);
		gun.addChild(Shape39_r1);
		setRotationAngle(Shape39_r1, 0.1571F, 0.0F, 0.0F);
		Shape39_r1.cubeList.add(new ModelBox(Shape39_r1, 165, 155, 0.6F, -30.4F, -3.1F, 1, 1, 1, 0.0F, false));
		Shape39_r1.cubeList.add(new ModelBox(Shape39_r1, 166, 50, 1.4F, -30.4F, -3.1F, 1, 1, 1, 0.0F, false));

		Shape33_r1 = new ModelRenderer(this);
		Shape33_r1.setRotationPoint(30.7046F, 27.3875F, 33.2262F);
		gun.addChild(Shape33_r1);
		setRotationAngle(Shape33_r1, 0.0F, 0.0F, -0.8727F);
		Shape33_r1.cubeList.add(new ModelBox(Shape33_r1, 86, 85, -1.6F, -42.4F, -24.0F, 1, 1, 31, 0.0F, false));

		Shape32_r1 = new ModelRenderer(this);
		Shape32_r1.setRotationPoint(-32.7556F, 25.0894F, 33.2262F);
		gun.addChild(Shape32_r1);
		setRotationAngle(Shape32_r1, 0.0F, 0.0F, 0.8727F);
		Shape32_r1.cubeList.add(new ModelBox(Shape32_r1, 90, 0, 3.6F, -42.4F, -24.0F, 1, 1, 31, 0.0F, false));

		Shape28_r1 = new ModelRenderer(this);
		Shape28_r1.setRotationPoint(-29.2849F, 31.9237F, 33.2262F);
		gun.addChild(Shape28_r1);
		setRotationAngle(Shape28_r1, 0.0F, 0.0F, 0.7854F);
		Shape28_r1.cubeList.add(new ModelBox(Shape28_r1, 86, 132, -0.5F, -39.0F, -1.0F, 1, 1, 14, 0.0F, false));

		Shape27_r1 = new ModelRenderer(this);
		Shape27_r1.setRotationPoint(4.2387F, 4.493F, 38.2262F);
		gun.addChild(Shape27_r1);
		setRotationAngle(Shape27_r1, 0.0F, 0.3927F, 0.0F);
		Shape27_r1.cubeList.add(new ModelBox(Shape27_r1, 155, 75, -0.6F, -0.7F, -1.0F, 1, 1, 2, -0.1F, false));

		Shape23_r1 = new ModelRenderer(this);
		Shape23_r1.setRotationPoint(-1.5613F, 42.1095F, 38.0519F);
		gun.addChild(Shape23_r1);
		setRotationAngle(Shape23_r1, 0.1571F, 0.0F, 0.0F);
		Shape23_r1.cubeList.add(new ModelBox(Shape23_r1, 166, 59, 0.6F, -31.1F, -3.2F, 1, 1, 1, 0.0F, false));
		Shape23_r1.cubeList.add(new ModelBox(Shape23_r1, 166, 61, 1.4F, -31.1F, -3.2F, 1, 1, 1, 0.0F, false));

		Shape17_r1 = new ModelRenderer(this);
		Shape17_r1.setRotationPoint(-1.5613F, 42.0416F, 38.3142F);
		gun.addChild(Shape17_r1);
		setRotationAngle(Shape17_r1, 0.1571F, 0.0F, 0.0F);
		Shape17_r1.cubeList.add(new ModelBox(Shape17_r1, 66, 0, 1.0F, -32.8F, -3.5F, 1, 2, 1, 0.0F, false));

		Shape16_r1 = new ModelRenderer(this);
		Shape16_r1.setRotationPoint(-1.5613F, 42.0392F, 38.3455F);
		gun.addChild(Shape16_r1);
		setRotationAngle(Shape16_r1, 0.1571F, 0.0F, 0.0F);
		Shape16_r1.cubeList.add(new ModelBox(Shape16_r1, 166, 67, 1.2F, -33.0F, -3.5F, 1, 1, 1, 0.0F, false));
		Shape16_r1.cubeList.add(new ModelBox(Shape16_r1, 166, 69, 0.8F, -33.0F, -3.5F, 1, 1, 1, 0.0F, false));

		CheyTac_grip = new ModelRenderer(this);
		CheyTac_grip.setRotationPoint(-2.0F, 4.2682F, 16.1481F);
		CheyTac_grip.cubeList.add(new ModelBox(CheyTac_grip, 162, 106, 1.5F, -17.7682F, -8.6481F, 4, 6, 7, -0.5F, false));
		CheyTac_grip.cubeList.add(new ModelBox(CheyTac_grip, 144, 32, 2.0F, -17.7482F, -10.6481F, 3, 5, 7, -0.5F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.5F, -9.4655F, -5.2342F);
		CheyTac_grip.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.1345F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 176, 89, -2.0F, 2.1441F, -4.6666F, 4, 4, 4, -0.52F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.5F, -9.4655F, -5.2342F);
		CheyTac_grip.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.5272F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 178, 11, -2.0F, 0.4403F, -7.2016F, 4, 5, 3, -0.5F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(3.49F, -4.6663F, -0.0079F);
		CheyTac_grip.addChild(cube_r4);
		setRotationAngle(cube_r4, 2.0071F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 180, 150, -2.0F, -2.0F, -2.2F, 4, 4, 4, -0.5F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(3.5F, -6.289F, -0.6256F);
		CheyTac_grip.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.6581F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 131, -2.0F, -2.9F, -3.2F, 4, 6, 4, -0.5F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(3.5F, -9.4655F, -5.2342F);
		CheyTac_grip.addChild(cube_r6);
		setRotationAngle(cube_r6, 1.309F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 176, 75, -2.0F, -3.3834F, -1.1181F, 4, 4, 4, -0.5F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 172, 182, -2.0F, -0.8834F, -3.5181F, 4, 4, 4, -0.5F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(3.5F, -9.0804F, 1.0012F);
		CheyTac_grip.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.3578F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 100, 210, -2.0F, -2.1F, -1.7F, 4, 4, 2, -0.5F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(3.5F, -9.4655F, -5.1342F);
		CheyTac_grip.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.7156F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 124, 210, -2.0F, -0.7841F, 3.2778F, 4, 4, 2, -0.5F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(3.5F, -9.4655F, -5.2342F);
		CheyTac_grip.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.4363F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 86, 117, 0.38F, -4.7841F, 1.3778F, 2, 11, 3, -0.5F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 102, 117, -2.38F, -4.7841F, 1.3778F, 2, 11, 3, -0.5F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 123, 0, -2.4F, -4.7841F, -0.9222F, 2, 11, 4, -0.5F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 141, 85, 0.4F, -4.7841F, -0.9222F, 2, 11, 4, -0.5F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(3.9F, -14.5018F, -4.5037F);
		CheyTac_grip.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 160, 172, -0.03F, -0.9F, -1.5F, 2, 2, 3, -0.5F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 172, 165, -2.7F, -0.9F, -1.5F, 2, 2, 3, -0.5F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(3.1F, -12.8666F, -8.349F);
		CheyTac_grip.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.7156F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 172, 160, -1.9F, -0.1F, 0.8F, 2, 2, 3, -0.5F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 172, 171, 0.77F, -0.1F, 0.8F, 2, 2, 3, -0.5F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(3.5F, -9.4655F, -5.2342F);
		CheyTac_grip.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.5236F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 115, -2.0F, -4.3841F, -1.6222F, 4, 11, 7, -0.55F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(3.5F, -9.4655F, -5.2342F);
		CheyTac_grip.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.3054F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 144, 0, -1.5F, -6.649F, -6.3299F, 3, 5, 7, -0.55F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
		CheyTac_grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}