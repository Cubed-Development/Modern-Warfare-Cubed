package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class F2000 extends ModelWithAttachments {
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer gun;
	private final ModelRenderer gun3_r1_r1;
	private final ModelRenderer gun3_r1_r2;
	private final ModelRenderer gun3_r1_r3;
	private final ModelRenderer gun3_r1_r4;
	private final ModelRenderer gun4_r1_r1;
	private final ModelRenderer gun6_r1_r1;
	private final ModelRenderer gun8_r1_r1;
	private final ModelRenderer gun9_r1_r1;
	private final ModelRenderer gun10_r1_r1;
	private final ModelRenderer gun13_r1_r1;
	private final ModelRenderer gun17_r1_r1;
	private final ModelRenderer gun44_r1_r1;
	private final ModelRenderer gun45_r1_r1;
	private final ModelRenderer gun50_r1_r1;
	private final ModelRenderer gun51_r1_r1;
	private final ModelRenderer gun52_r1_r1;
	private final ModelRenderer gun57_r1_r1;
	private final ModelRenderer gun59_r1_r1;
	private final ModelRenderer gun60_r1_r1;
	private final ModelRenderer gun61_r1_r1;
	private final ModelRenderer gun62_r1_r1;
	private final ModelRenderer gun66_r1_r1;
	private final ModelRenderer gun67_r1_r1;
	private final ModelRenderer gun68_r1_r1;
	private final ModelRenderer gun69_r1_r1;
	private final ModelRenderer gun69_r1_r2;
	private final ModelRenderer gun69_r1_r3;
	private final ModelRenderer gun69_r1_r4;
	private final ModelRenderer gun69_r1_r5;
	private final ModelRenderer gun69_r1_r6;
	private final ModelRenderer gun72_r1_r1;
	private final ModelRenderer gun73_r1_r1;
	private final ModelRenderer gun86_r1_r1;
	private final ModelRenderer gun87_r1_r1;
	private final ModelRenderer gun88_r1_r1;
	private final ModelRenderer gun89_r1_r1;
	private final ModelRenderer gun90_r1_r1;
	private final ModelRenderer gun92_r1_r1;
	private final ModelRenderer gun99_r1_r1;
	private final ModelRenderer gun106_r1_r1;
	private final ModelRenderer gun107_r1_r1;
	private final ModelRenderer gun110_r1_r1;
	private final ModelRenderer gun111_r1_r1;
	private final ModelRenderer gun114_r1_r1;
	private final ModelRenderer gun115_r1_r1;
	private final ModelRenderer gun116_r1_r1;
	private final ModelRenderer gun117_r1_r1;
	private final ModelRenderer gun118_r1_r1;
	private final ModelRenderer gun119_r1_r1;
	private final ModelRenderer gun121_r1_r1;
	private final ModelRenderer gun122_r1_r1;
	private final ModelRenderer gun124_r1_r1;
	private final ModelRenderer gun125_r1_r1;
	private final ModelRenderer gun126_r1_r1;
	private final ModelRenderer gun128_r1_r1;
	private final ModelRenderer gun136_r1_r1;
	private final ModelRenderer gun138_r1_r1;
	private final ModelRenderer gun139_r1_r1;
	private final ModelRenderer gun140_r1_r1;
	private final ModelRenderer gun142_r1_r1;
	private final ModelRenderer gun144_r1_r1;
	private final ModelRenderer gun145_r1_r1;
	private final ModelRenderer gun146_r1_r1;
	private final ModelRenderer gun151_r1_r1;
	private final ModelRenderer gun154_r1_r1;
	private final ModelRenderer gun160_r1_r1;
	private final ModelRenderer gun161_r1_r1;
	private final ModelRenderer gun168_r1_r1;
	private final ModelRenderer gun169_r1_r1;
	private final ModelRenderer gun170_r1_r1;
	private final ModelRenderer gun172_r1_r1;
	private final ModelRenderer gun185_r1_r1;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer barrel;
	private final ModelRenderer muzzle;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun_r5;
	private final ModelRenderer gun_r6;
	private final ModelRenderer gun_r7;
	private final ModelRenderer gun_r8;
	private final ModelRenderer bone;
	private final ModelRenderer gun_r9;
	private final ModelRenderer gun_r10;
	private final ModelRenderer gun_r11;
	private final ModelRenderer cube;
	private final ModelRenderer gun_r12;
	private final ModelRenderer gun_r13;
	private final ModelRenderer gun_r14;

	public F2000() {
		textureWidth = 290;
		textureHeight = 290;

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 92, 62, -2.93F, -33.537F, 0.0804F, 2, 2, 2, -0.5F, false));
		bone2.cubeList.add(new ModelBox(bone2, 84, 57, 1.43F, -33.2997F, 2.0559F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.1F, -22.4F, 17.2F);
		bone2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7418F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 88, 57, -1.0F, -7.3F, 4.0F, 1, 1, 1, -0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 87, 75, -1.0F, 8.1F, 5.8F, 1, 1, 1, -0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 86, 35, -1.35F, -22.0F, -17.9F, 1, 1, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 79, -1.45F, -19.3F, -9.8F, 1, 1, 1, -0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 79, 22, -1.45F, -9.5F, -11.5F, 1, 1, 1, -0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 79, 9, -1.35F, -22.0F, -17.9F, 1, 1, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 78, -1.0F, 0.1F, -0.5F, 1, 1, 1, -0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 73, -1.0F, 8.1F, 5.8F, 1, 1, 1, -0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 73, -0.67F, -31.7F, -19.5F, 1, 1, 1, -0.15F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 86, 41, -1.45F, -19.3F, -9.8F, 1, 1, 1, -0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 72, 41, -4.53F, -31.7F, -19.5F, 1, 1, 1, -0.15F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 72, 9, -3.85F, -22.0F, -17.9F, 1, 1, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 72, 3, -3.75F, -19.3F, -9.8F, 1, 1, 1, -0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 63, -4.2F, 0.1F, -0.5F, 1, 1, 1, -0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 58, 54, -4.2F, 8.1F, 5.8F, 1, 1, 1, -0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 50, -3.75F, -9.5F, -11.5F, 1, 1, 1, -0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 86, 17, -0.67F, -31.7F, -19.5F, 1, 1, 1, -0.15F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 86, 85, -1.45F, -9.5F, -11.5F, 1, 1, 1, -0.1F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 86, 88, -1.0F, 0.1F, -0.5F, 1, 1, 1, -0.1F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.1F, -22.4F, 19.7F);
		bone2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.7418F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 79, -0.67F, -16.9F, -3.3F, 1, 1, 1, -0.15F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 86, 3, -0.67F, -16.9F, -3.3F, 1, 1, 1, -0.15F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 63, -4.53F, -16.9F, -3.3F, 1, 1, 1, -0.15F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.93F, -32.5997F, 2.5559F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.2793F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 85, 48, -0.5F, 0.1F, -0.5F, 1, 1, 1, 0.0F, false));

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0354F, -25.9322F, -1.9816F);
		bone3.addChild(gun);
		gun.cubeList.add(new ModelBox(gun, 0, 0, -2.2354F, -10.0678F, 4.4816F, 3, 2, 30, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 14, 47, -1.5354F, -6.0678F, -4.7184F, 3, 6, 5, 0.01F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 73, -1.0354F, -11.6678F, -30.5184F, 2, 4, 66, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 210, 74, -2.0354F, -6.6678F, 17.4816F, 3, 10, 16, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 70, -0.5354F, -4.4678F, -7.2184F, 1, 2, 2, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 72, -1.5354F, -1.0678F, -13.5184F, 3, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 53, 32, -1.0354F, 3.2322F, 4.3816F, 2, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 82, -1.5354F, 1.9322F, 2.4816F, 3, 2, 8, -0.01F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 102, -1.5354F, 2.3322F, 2.4816F, 3, 4, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 0, -1.5354F, -6.6678F, 13.4816F, 3, 10, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 102, -1.2354F, -6.0678F, 18.9816F, 3, 11, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 103, 32, -1.7354F, -6.6678F, 17.4816F, 3, 10, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -1.5354F, -9.0678F, -30.5184F, 3, 4, 66, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 70, -0.8354F, -9.0678F, -30.5184F, 3, 3, 66, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 32, -2.3354F, -10.3678F, 32.9816F, 3, 5, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 70, -1.1354F, -6.6678F, 17.4816F, 3, 10, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 14, -1.0354F, -12.0678F, 32.9816F, 2, 5, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 53, 14, -0.7354F, -9.7678F, 32.9816F, 3, 4, 3, -0.0012F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 32, -0.7354F, -10.3678F, 32.9816F, 3, 5, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 4, -2.2354F, -8.0678F, -30.5184F, 3, 2, 66, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 122, 32, -1.5354F, -4.4678F, -5.2184F, 3, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 153, 182, 1.5646F, -9.0678F, -30.5184F, 1, 1, 37, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 170, 144, -2.6354F, -9.0678F, -30.5184F, 1, 1, 37, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 83, 102, 1.5646F, -10.3678F, 0.4816F, 1, 2, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 50, 102, -2.6354F, -10.3678F, 0.4816F, 1, 2, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 70, 1.4646F, -9.8678F, -30.4184F, 1, 1, 31, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 7, -2.5354F, -10.3678F, -24.4184F, 2, 1, 4, -0.0015F, false));
		gun.cubeList.add(new ModelBox(gun, 173, 39, -2.5354F, -9.8678F, -24.4184F, 1, 1, 25, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 123, 4, -2.5354F, -10.3678F, -13.4184F, 1, 1, 3, -0.0015F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 76, -2.5354F, -10.3678F, -4.4184F, 1, 1, 5, -0.0015F, false));
		gun.cubeList.add(new ModelBox(gun, 161, 0, 1.4646F, -10.3678F, -30.4184F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 123, 0, 1.4646F, -10.3678F, -2.4184F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 142, 72, 0.3646F, -11.7678F, -26.4184F, 1, 1, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 139, -1.4354F, -11.7678F, -26.4184F, 1, 1, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 54, 1.3646F, -11.7678F, -30.8184F, 1, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 47, 1.6646F, -10.7678F, -30.8184F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 210, 0, 1.7646F, -8.7678F, -17.4184F, 1, 1, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 32, 1.6646F, -8.7678F, -29.4184F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 209, 139, -2.8354F, -8.7678F, -17.4184F, 1, 1, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 13, -2.7354F, -8.7678F, -29.4184F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 16, -1.6354F, -14.0678F, 1.4816F, 1, 3, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 23, -1.3354F, -12.5678F, 6.4816F, 1, 2, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 121, 25, -1.0354F, -12.2678F, 10.4816F, 2, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 6, 0.2646F, -12.5678F, 6.4816F, 1, 2, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 92, 26, -1.0354F, -13.5678F, 6.4816F, 2, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 122, 80, -1.0354F, -13.5678F, -0.5184F, 2, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 0, 0.5646F, -14.0678F, 1.4816F, 1, 3, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 45, -1.0354F, -13.7178F, 1.5816F, 2, 3, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 44, -0.5354F, -13.7178F, 1.3816F, 1, 3, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 122, 76, -1.0354F, -13.1678F, -24.5184F, 2, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 124, 55, -1.3354F, -12.5678F, -24.9184F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 70, 0.2646F, -12.5678F, -24.9184F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 206, -1.0354F, -12.0678F, -22.5184F, 2, 1, 21, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 74, -1.0354F, -13.0678F, -2.5184F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 102, -0.8354F, -13.0678F, -29.5184F, 1, 1, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 102, -0.2354F, -13.0678F, -29.5184F, 1, 1, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 62, -1.0354F, -12.0678F, -29.5184F, 2, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 26, -1.0354F, -12.4678F, -27.0184F, 2, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 130, -2.7354F, -9.7678F, -30.8184F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 44, -2.4354F, -9.7678F, -30.8184F, 1, 3, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 5, 124, -1.0354F, -13.3678F, -29.6184F, 2, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 32, -0.8354F, -10.0678F, 4.4816F, 3, 1, 30, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 131, 181, 1.2646F, -10.2678F, -22.3184F, 1, 1, 20, -0.1F, false));

		gun3_r1_r1 = new ModelRenderer(this);
		gun3_r1_r1.setRotationPoint(0.9646F, -3.415F, 1.2106F);
		gun.addChild(gun3_r1_r1);
		setRotationAngle(gun3_r1_r1, -0.2353F, 1.1059F, -0.2111F);
		gun3_r1_r1.cubeList.add(new ModelBox(gun3_r1_r1, 18, 16, 0.1F, -2.3533F, -0.9919F, 1, 3, 1, 0.009F, false));
		gun3_r1_r1.cubeList.add(new ModelBox(gun3_r1_r1, 18, 0, 0.0F, -2.3533F, -0.9919F, 1, 3, 1, 0.01F, true));

		gun3_r1_r2 = new ModelRenderer(this);
		gun3_r1_r2.setRotationPoint(-1.0354F, -3.415F, 1.2106F);
		gun.addChild(gun3_r1_r2);
		setRotationAngle(gun3_r1_r2, -0.2353F, -1.1059F, 0.2111F);
		gun3_r1_r2.cubeList.add(new ModelBox(gun3_r1_r2, 25, 0, -1.1F, -2.3533F, -0.9919F, 1, 3, 1, 0.009F, false));
		gun3_r1_r2.cubeList.add(new ModelBox(gun3_r1_r2, 25, 16, -1.0F, -2.3533F, -0.9919F, 1, 3, 1, 0.01F, false));

		gun3_r1_r3 = new ModelRenderer(this);
		gun3_r1_r3.setRotationPoint(-1.0354F, -3.415F, 1.2106F);
		gun.addChild(gun3_r1_r3);
		setRotationAngle(gun3_r1_r3, -0.1047F, 0.0F, 0.0F);
		gun3_r1_r3.cubeList.add(new ModelBox(gun3_r1_r3, 14, 70, 0.0F, -2.3533F, -0.9919F, 2, 3, 1, 0.01F, false));

		gun3_r1_r4 = new ModelRenderer(this);
		gun3_r1_r4.setRotationPoint(-0.0354F, 26.2006F, 1.9148F);
		gun.addChild(gun3_r1_r4);
		setRotationAngle(gun3_r1_r4, -0.1047F, 0.0F, 0.0F);
		gun3_r1_r4.cubeList.add(new ModelBox(gun3_r1_r4, 72, 51, -1.5F, -31.733F, -6.7873F, 3, 3, 2, 0.0F, false));

		gun4_r1_r1 = new ModelRenderer(this);
		gun4_r1_r1.setRotationPoint(-0.0354F, 31.5785F, 0.9499F);
		gun.addChild(gun4_r1_r1);
		setRotationAngle(gun4_r1_r1, -0.5236F, 0.0F, 0.0F);
		gun4_r1_r1.cubeList.add(new ModelBox(gun4_r1_r1, 59, 0, -0.5F, -26.6901F, -24.2642F, 1, 3, 2, 0.0F, false));

		gun6_r1_r1 = new ModelRenderer(this);
		gun6_r1_r1.setRotationPoint(-0.0354F, 27.083F, 1.047F);
		gun.addChild(gun6_r1_r1);
		setRotationAngle(gun6_r1_r1, -0.2793F, 0.0F, 0.0F);
		gun6_r1_r1.cubeList.add(new ModelBox(gun6_r1_r1, 86, 0, -1.5F, -25.1481F, -5.7192F, 3, 2, 5, 0.01F, false));

		gun8_r1_r1 = new ModelRenderer(this);
		gun8_r1_r1.setRotationPoint(-0.0354F, 31.3359F, -2.5924F);
		gun.addChild(gun8_r1_r1);
		setRotationAngle(gun8_r1_r1, -0.5236F, 0.0F, 0.0F);
		gun8_r1_r1.cubeList.add(new ModelBox(gun8_r1_r1, 72, 45, -1.0F, -34.3956F, -17.2326F, 2, 3, 3, 0.0F, false));
		gun8_r1_r1.cubeList.add(new ModelBox(gun8_r1_r1, 72, 13, -1.5F, -34.3956F, -18.2326F, 3, 3, 3, 0.0F, false));

		gun9_r1_r1 = new ModelRenderer(this);
		gun9_r1_r1.setRotationPoint(-0.0354F, -3.7092F, -3.226F);
		gun.addChild(gun9_r1_r1);
		setRotationAngle(gun9_r1_r1, 0.2618F, 0.0F, 0.0F);
		gun9_r1_r1.cubeList.add(new ModelBox(gun9_r1_r1, 36, 0, -1.5F, -4.6F, 0.1F, 3, 11, 2, 0.0F, false));

		gun10_r1_r1 = new ModelRenderer(this);
		gun10_r1_r1.setRotationPoint(-0.0354F, 27.0321F, 0.9122F);
		gun.addChild(gun10_r1_r1);
		setRotationAngle(gun10_r1_r1, -0.2269F, 0.0F, 0.0F);
		gun10_r1_r1.cubeList.add(new ModelBox(gun10_r1_r1, 101, 72, -1.5F, -34.9888F, 1.7432F, 3, 10, 4, -0.0015F, false));

		gun13_r1_r1 = new ModelRenderer(this);
		gun13_r1_r1.setRotationPoint(-0.0354F, 26.9131F, 1.6323F);
		gun.addChild(gun13_r1_r1);
		setRotationAngle(gun13_r1_r1, 0.2398F, 0.0F, 0.0F);
		gun13_r1_r1.cubeList.add(new ModelBox(gun13_r1_r1, 36, 14, -1.5F, -21.7222F, 8.7592F, 3, 2, 11, -0.001F, false));

		gun17_r1_r1 = new ModelRenderer(this);
		gun17_r1_r1.setRotationPoint(-0.0354F, 30.9914F, 7.5948F);
		gun.addChild(gun17_r1_r1);
		setRotationAngle(gun17_r1_r1, 0.5236F, 0.0F, 0.0F);
		gun17_r1_r1.cubeList.add(new ModelBox(gun17_r1_r1, 59, 44, -0.5F, -39.4812F, 4.5349F, 1, 3, 2, 0.0F, false));

		gun44_r1_r1 = new ModelRenderer(this);
		gun44_r1_r1.setRotationPoint(-0.0354F, 27.3665F, 1.6025F);
		gun.addChild(gun44_r1_r1);
		setRotationAngle(gun44_r1_r1, 0.2269F, 0.0F, 0.0F);
		gun44_r1_r1.cubeList.add(new ModelBox(gun44_r1_r1, 29, 102, -1.5F, -31.6146F, 14.3588F, 3, 10, 4, 0.01F, false));

		gun45_r1_r1 = new ModelRenderer(this);
		gun45_r1_r1.setRotationPoint(-0.0354F, 26.6958F, 0.9388F);
		gun.addChild(gun45_r1_r1);
		setRotationAngle(gun45_r1_r1, -0.2618F, 0.0F, 0.0F);
		gun45_r1_r1.cubeList.add(new ModelBox(gun45_r1_r1, 104, 0, -1.0F, -24.6782F, -0.8743F, 2, 3, 3, -0.001F, false));

		gun50_r1_r1 = new ModelRenderer(this);
		gun50_r1_r1.setRotationPoint(2.3178F, 30.0034F, 1.9816F);
		gun.addChild(gun50_r1_r1);
		setRotationAngle(gun50_r1_r1, 0.0F, 0.0F, -0.4363F);
		gun50_r1_r1.cubeList.add(new ModelBox(gun50_r1_r1, 0, 139, 11.1175F, -34.6164F, -32.5F, 1, 1, 66, 0.0F, false));

		gun51_r1_r1 = new ModelRenderer(this);
		gun51_r1_r1.setRotationPoint(19.4627F, 38.4317F, 1.9816F);
		gun.addChild(gun51_r1_r1);
		setRotationAngle(gun51_r1_r1, 0.0F, 0.0F, -0.925F);
		gun51_r1_r1.cubeList.add(new ModelBox(gun51_r1_r1, 68, 143, 25.6748F, -46.5172F, -25.5F, 2, 1, 59, 0.0F, false));

		gun52_r1_r1 = new ModelRenderer(this);
		gun52_r1_r1.setRotationPoint(7.1718F, 35.63F, 1.9816F);
		gun.addChild(gun52_r1_r1);
		setRotationAngle(gun52_r1_r1, 0.0F, 0.0F, -0.6458F);
		gun52_r1_r1.cubeList.add(new ModelBox(gun52_r1_r1, 72, 0, 22.5077F, -41.5109F, 1.5F, 1, 2, 30, 0.0F, false));

		gun57_r1_r1 = new ModelRenderer(this);
		gun57_r1_r1.setRotationPoint(-0.0354F, 27.8736F, 1.0555F);
		gun.addChild(gun57_r1_r1);
		setRotationAngle(gun57_r1_r1, 0.2618F, 0.0F, 0.0F);
		gun57_r1_r1.cubeList.add(new ModelBox(gun57_r1_r1, 0, 16, -1.1F, -28.0852F, 22.4604F, 3, 10, 2, -0.002F, true));
		gun57_r1_r1.cubeList.add(new ModelBox(gun57_r1_r1, 0, 0, -2.05F, -28.0852F, 22.4604F, 3, 10, 2, 0.0F, false));

		gun59_r1_r1 = new ModelRenderer(this);
		gun59_r1_r1.setRotationPoint(-0.0354F, 26.5483F, 1.1018F);
		gun.addChild(gun59_r1_r1);
		setRotationAngle(gun59_r1_r1, -0.1745F, 0.0F, 0.0F);
		gun59_r1_r1.cubeList.add(new ModelBox(gun59_r1_r1, 29, 102, -1.05F, -35.3995F, 12.9296F, 3, 11, 15, -0.001F, false));
		gun59_r1_r1.cubeList.add(new ModelBox(gun59_r1_r1, 101, 72, -2.1F, -35.3995F, 12.9296F, 2, 11, 15, 0.0F, false));

		gun60_r1_r1 = new ModelRenderer(this);
		gun60_r1_r1.setRotationPoint(-0.0354F, 26.4707F, 0.7145F);
		gun.addChild(gun60_r1_r1);
		setRotationAngle(gun60_r1_r1, -0.1745F, 0.0F, 0.0F);
		gun60_r1_r1.cubeList.add(new ModelBox(gun60_r1_r1, 29, 139, -0.9F, -37.3523F, 26.1792F, 3, 13, 3, 0.0F, false));
		gun60_r1_r1.cubeList.add(new ModelBox(gun60_r1_r1, 125, 99, -2.2F, -37.3523F, 26.1792F, 3, 13, 3, 0.0F, false));

		gun61_r1_r1 = new ModelRenderer(this);
		gun61_r1_r1.setRotationPoint(-2.2754F, 30.1596F, 1.9816F);
		gun.addChild(gun61_r1_r1);
		setRotationAngle(gun61_r1_r1, 0.0F, 0.0F, 0.4363F);
		gun61_r1_r1.cubeList.add(new ModelBox(gun61_r1_r1, 142, 72, -12.313F, -34.7829F, -32.5F, 1, 1, 66, 0.0F, false));

		gun62_r1_r1 = new ModelRenderer(this);
		gun62_r1_r1.setRotationPoint(19.7014F, 38.5118F, 1.9816F);
		gun.addChild(gun62_r1_r1);
		setRotationAngle(gun62_r1_r1, 0.0F, 0.0F, -0.925F);
		gun62_r1_r1.cubeList.add(new ModelBox(gun62_r1_r1, 14, 96, 25.7745F, -47.0165F, 31.0F, 2, 2, 3, 0.0F, false));

		gun66_r1_r1 = new ModelRenderer(this);
		gun66_r1_r1.setRotationPoint(7.3243F, 35.3639F, 1.9816F);
		gun.addChild(gun66_r1_r1);
		setRotationAngle(gun66_r1_r1, 0.0F, 0.0F, -0.6458F);
		gun66_r1_r1.cubeList.add(new ModelBox(gun66_r1_r1, 50, 110, 21.4862F, -41.5718F, 31.0F, 2, 2, 3, 0.0F, false));

		gun67_r1_r1 = new ModelRenderer(this);
		gun67_r1_r1.setRotationPoint(2.2794F, 29.8767F, 1.9816F);
		gun.addChild(gun67_r1_r1);
		setRotationAngle(gun67_r1_r1, 0.0F, 0.0F, -0.4363F);
		gun67_r1_r1.cubeList.add(new ModelBox(gun67_r1_r1, 22, 87, 10.7123F, -33.8931F, 31.0F, 1, 2, 3, 0.0F, false));

		gun68_r1_r1 = new ModelRenderer(this);
		gun68_r1_r1.setRotationPoint(-2.2369F, 30.0328F, 1.9816F);
		gun.addChild(gun68_r1_r1);
		setRotationAngle(gun68_r1_r1, 0.0F, 0.0F, 0.4363F);
		gun68_r1_r1.cubeList.add(new ModelBox(gun68_r1_r1, 57, 93, -11.9078F, -34.0596F, 31.0F, 1, 2, 3, 0.0F, false));

		gun69_r1_r1 = new ModelRenderer(this);
		gun69_r1_r1.setRotationPoint(0.9646F, -1.9314F, 1.7498F);
		gun.addChild(gun69_r1_r1);
		setRotationAngle(gun69_r1_r1, 0.9878F, 0.8133F, 0.8338F);
		gun69_r1_r1.cubeList.add(new ModelBox(gun69_r1_r1, 11, 102, 0.1F, -3.0442F, -0.9915F, 1, 8, 1, -0.011F, false));
		gun69_r1_r1.cubeList.add(new ModelBox(gun69_r1_r1, 94, 88, 0.0F, -3.0442F, -0.9915F, 1, 8, 1, -0.01F, false));

		gun69_r1_r2 = new ModelRenderer(this);
		gun69_r1_r2.setRotationPoint(-1.0354F, -1.9314F, 1.7498F);
		gun.addChild(gun69_r1_r2);
		setRotationAngle(gun69_r1_r2, 0.9878F, -0.8133F, -0.8338F);
		gun69_r1_r2.cubeList.add(new ModelBox(gun69_r1_r2, 15, 102, -1.1F, -3.0442F, -0.9915F, 1, 8, 1, -0.0103F, false));
		gun69_r1_r2.cubeList.add(new ModelBox(gun69_r1_r2, 72, 102, -1.0F, -3.0442F, -0.9915F, 1, 8, 1, -0.01F, false));

		gun69_r1_r3 = new ModelRenderer(this);
		gun69_r1_r3.setRotationPoint(-1.0354F, -1.9314F, 1.7498F);
		gun.addChild(gun69_r1_r3);
		setRotationAngle(gun69_r1_r3, 0.6109F, 0.0F, 0.0F);
		gun69_r1_r3.cubeList.add(new ModelBox(gun69_r1_r3, 20, 102, 0.0F, -7.8442F, -0.9915F, 2, 15, 1, -0.01F, false));

		gun69_r1_r4 = new ModelRenderer(this);
		gun69_r1_r4.setRotationPoint(0.9646F, 3.1887F, 0.4832F);
		gun.addChild(gun69_r1_r4);
		setRotationAngle(gun69_r1_r4, 1.0278F, -0.8366F, -0.8882F);
		gun69_r1_r4.cubeList.add(new ModelBox(gun69_r1_r4, 11, 83, 0.1F, -2.3117F, -0.017F, 1, 6, 2, -0.01F, false));
		gun69_r1_r4.cubeList.add(new ModelBox(gun69_r1_r4, 0, 83, 0.0F, -2.3117F, -0.017F, 1, 6, 2, -0.01F, false));

		gun69_r1_r5 = new ModelRenderer(this);
		gun69_r1_r5.setRotationPoint(-1.0354F, 3.1887F, 0.4832F);
		gun.addChild(gun69_r1_r5);
		setRotationAngle(gun69_r1_r5, 1.0278F, 0.8366F, 0.8882F);
		gun69_r1_r5.cubeList.add(new ModelBox(gun69_r1_r5, 96, 11, -1.1F, -2.3117F, -0.017F, 1, 6, 2, -0.01F, false));
		gun69_r1_r5.cubeList.add(new ModelBox(gun69_r1_r5, 0, 102, -1.0F, -2.3117F, -0.017F, 1, 6, 2, -0.01F, false));

		gun69_r1_r6 = new ModelRenderer(this);
		gun69_r1_r6.setRotationPoint(-0.0354F, 33.1321F, 7.4648F);
		gun.addChild(gun69_r1_r6);
		setRotationAngle(gun69_r1_r6, 0.6109F, 0.0F, 0.0F);
		gun69_r1_r6.cubeList.add(new ModelBox(gun69_r1_r6, 36, 32, -1.0F, -30.844F, 11.4398F, 2, 6, 2, -0.01F, false));
		gun69_r1_r6.cubeList.add(new ModelBox(gun69_r1_r6, 131, 159, -1.5F, -39.844F, 12.4398F, 3, 15, 2, -0.01F, false));

		gun72_r1_r1 = new ModelRenderer(this);
		gun72_r1_r1.setRotationPoint(-0.0354F, 31.3105F, 0.4858F);
		gun.addChild(gun72_r1_r1);
		setRotationAngle(gun72_r1_r1, -0.5236F, 0.0F, 0.0F);
		gun72_r1_r1.cubeList.add(new ModelBox(gun72_r1_r1, 101, 110, -1.5F, -27.6901F, -21.9962F, 3, 3, 2, -0.001F, false));

		gun73_r1_r1 = new ModelRenderer(this);
		gun73_r1_r1.setRotationPoint(-0.0354F, 31.2593F, 7.1307F);
		gun.addChild(gun73_r1_r1);
		setRotationAngle(gun73_r1_r1, 0.5236F, 0.0F, 0.0F);
		gun73_r1_r1.cubeList.add(new ModelBox(gun73_r1_r1, 83, 113, -1.5F, -38.4812F, 6.8028F, 3, 3, 2, 0.0F, false));

		gun86_r1_r1 = new ModelRenderer(this);
		gun86_r1_r1.setRotationPoint(-68.3271F, -42.3881F, 1.9816F);
		gun.addChild(gun86_r1_r1);
		setRotationAngle(gun86_r1_r1, 0.0F, 0.0F, 2.2679F);
		gun86_r1_r1.cubeList.add(new ModelBox(gun86_r1_r1, 51, 0, -20.9622F, -74.91F, -1.5F, 1, 2, 6, 0.0F, false));

		gun87_r1_r1 = new ModelRenderer(this);
		gun87_r1_r1.setRotationPoint(24.422F, 25.9322F, -2.216F);
		gun.addChild(gun87_r1_r1);
		setRotationAngle(gun87_r1_r1, 3.1416F, -1.5184F, -3.1416F);
		gun87_r1_r1.cubeList.add(new ModelBox(gun87_r1_r1, 36, 27, 9.8299F, -36.0F, 21.372F, 10, 2, 1, 0.0F, false));

		gun88_r1_r1 = new ModelRenderer(this);
		gun88_r1_r1.setRotationPoint(-24.4928F, 25.9321F, -2.216F);
		gun.addChild(gun88_r1_r1);
		setRotationAngle(gun88_r1_r1, 3.1416F, 1.5184F, -3.1416F);
		gun88_r1_r1.cubeList.add(new ModelBox(gun88_r1_r1, 36, 57, -19.8299F, -36.0F, 21.3719F, 10, 2, 1, 0.0F, false));

		gun89_r1_r1 = new ModelRenderer(this);
		gun89_r1_r1.setRotationPoint(4.2184F, 31.8765F, 1.9816F);
		gun.addChild(gun89_r1_r1);
		setRotationAngle(gun89_r1_r1, 0.0F, 0.0F, -0.5251F);
		gun89_r1_r1.cubeList.add(new ModelBox(gun89_r1_r1, 131, 143, 14.095F, -37.9987F, -32.5F, 1, 1, 37, 0.0F, false));

		gun90_r1_r1 = new ModelRenderer(this);
		gun90_r1_r1.setRotationPoint(-4.2903F, 31.8774F, 1.9816F);
		gun.addChild(gun90_r1_r1);
		setRotationAngle(gun90_r1_r1, 0.0F, 0.0F, 0.5252F);
		gun90_r1_r1.cubeList.add(new ModelBox(gun90_r1_r1, 144, 0, -15.0956F, -37.9985F, -32.5F, 1, 1, 37, 0.0F, false));

		gun92_r1_r1 = new ModelRenderer(this);
		gun92_r1_r1.setRotationPoint(68.2564F, -42.3876F, 1.9816F);
		gun.addChild(gun92_r1_r1);
		setRotationAngle(gun92_r1_r1, 0.0F, 0.0F, -2.2679F);
		gun92_r1_r1.cubeList.add(new ModelBox(gun92_r1_r1, 52, 70, 19.9624F, -74.9098F, -1.5F, 1, 2, 6, 0.0F, false));

		gun99_r1_r1 = new ModelRenderer(this);
		gun99_r1_r1.setRotationPoint(8.6514F, 35.1763F, 1.9816F);
		gun.addChild(gun99_r1_r1);
		setRotationAngle(gun99_r1_r1, 0.0F, 0.0F, -0.6692F);
		gun99_r1_r1.cubeList.add(new ModelBox(gun99_r1_r1, 144, 38, 19.4802F, -42.6609F, -26.4F, 2, 1, 25, 0.0F, false));

		gun106_r1_r1 = new ModelRenderer(this);
		gun106_r1_r1.setRotationPoint(31.8808F, 25.9322F, 10.1675F);
		gun.addChild(gun106_r1_r1);
		setRotationAngle(gun106_r1_r1, 0.0F, 1.3384F, 0.0F);
		gun106_r1_r1.cubeList.add(new ModelBox(gun106_r1_r1, 36, 22, 28.3446F, -37.7F, -39.095F, 4, 2, 1, 0.0F, false));

		gun107_r1_r1 = new ModelRenderer(this);
		gun107_r1_r1.setRotationPoint(-39.0596F, 25.9322F, 5.9904F);
		gun.addChild(gun107_r1_r1);
		setRotationAngle(gun107_r1_r1, 0.0F, -1.4871F, 0.0F);
		gun107_r1_r1.cubeList.add(new ModelBox(gun107_r1_r1, 36, 40, -33.0672F, -37.7F, -41.1984F, 4, 1, 1, 0.0F, false));

		gun110_r1_r1 = new ModelRenderer(this);
		gun110_r1_r1.setRotationPoint(-21.9175F, -88.9896F, 1.9816F);
		gun.addChild(gun110_r1_r1);
		setRotationAngle(gun110_r1_r1, 0.0F, 0.0F, 2.8628F);
		gun110_r1_r1.cubeList.add(new ModelBox(gun110_r1_r1, 150, 68, -2.1053F, -81.9663F, -32.8F, 1, 1, 1, 0.0F, false));

		gun111_r1_r1 = new ModelRenderer(this);
		gun111_r1_r1.setRotationPoint(38.9725F, -71.8461F, 1.9816F);
		gun.addChild(gun111_r1_r1);
		setRotationAngle(gun111_r1_r1, 0.0F, 0.0F, -2.8628F);
		gun111_r1_r1.cubeList.add(new ModelBox(gun111_r1_r1, 142, 150, 17.2709F, -72.596F, -32.8F, 1, 1, 1, 0.0F, false));

		gun114_r1_r1 = new ModelRenderer(this);
		gun114_r1_r1.setRotationPoint(-66.1122F, -32.4278F, 1.9816F);
		gun.addChild(gun114_r1_r1);
		setRotationAngle(gun114_r1_r1, 0.0F, 0.0F, 2.1935F);
		gun114_r1_r1.cubeList.add(new ModelBox(gun114_r1_r1, 0, 206, -20.9532F, -69.7483F, -19.4F, 1, 1, 24, 0.0F, false));

		gun115_r1_r1 = new ModelRenderer(this);
		gun115_r1_r1.setRotationPoint(-25.6527F, -74.9371F, 1.9816F);
		gun.addChild(gun115_r1_r1);
		setRotationAngle(gun115_r1_r1, 0.0F, 0.0F, 2.7884F);
		gun115_r1_r1.cubeList.add(new ModelBox(gun115_r1_r1, 50, 206, -3.4296F, -72.8525F, -19.4F, 1, 1, 24, 0.0F, false));

		gun116_r1_r1 = new ModelRenderer(this);
		gun116_r1_r1.setRotationPoint(-66.2968F, -32.1705F, 1.9816F);
		gun.addChild(gun116_r1_r1);
		setRotationAngle(gun116_r1_r1, 0.0F, 0.0F, 2.1935F);
		gun116_r1_r1.cubeList.add(new ModelBox(gun116_r1_r1, 36, 44, -21.2115F, -69.667F, -31.4F, 1, 1, 12, 0.0F, false));

		gun117_r1_r1 = new ModelRenderer(this);
		gun117_r1_r1.setRotationPoint(-26.0163F, -74.803F, 1.9816F);
		gun.addChild(gun117_r1_r1);
		setRotationAngle(gun117_r1_r1, 0.0F, 0.0F, 2.7884F);
		gun117_r1_r1.cubeList.add(new ModelBox(gun117_r1_r1, 0, 47, -3.7234F, -72.8179F, -31.4F, 1, 1, 12, 0.0F, false));

		gun118_r1_r1 = new ModelRenderer(this);
		gun118_r1_r1.setRotationPoint(10.7318F, 25.9324F, -47.7132F);
		gun.addChild(gun118_r1_r1);
		setRotationAngle(gun118_r1_r1, 3.1416F, -0.0087F, -3.1416F);
		gun118_r1_r1.cubeList.add(new ModelBox(gun118_r1_r1, 72, 38, 8.2309F, -34.7001F, -30.2243F, 1, 1, 5, 0.0F, false));

		gun119_r1_r1 = new ModelRenderer(this);
		gun119_r1_r1.setRotationPoint(26.0282F, 25.9322F, -1.5488F);
		gun.addChild(gun119_r1_r1);
		setRotationAngle(gun119_r1_r1, 3.1416F, -1.4686F, -3.1416F);
		gun119_r1_r1.cubeList.add(new ModelBox(gun119_r1_r1, 50, 52, 10.4617F, -34.7F, 22.3126F, 7, 1, 1, 0.0F, false));

		gun121_r1_r1 = new ModelRenderer(this);
		gun121_r1_r1.setRotationPoint(66.0415F, -32.4273F, 1.9816F);
		gun.addChild(gun121_r1_r1);
		setRotationAngle(gun121_r1_r1, 0.0F, 0.0F, -2.1935F);
		gun121_r1_r1.cubeList.add(new ModelBox(gun121_r1_r1, 76, 207, 19.9534F, -69.7481F, -19.4F, 1, 1, 24, 0.0F, false));

		gun122_r1_r1 = new ModelRenderer(this);
		gun122_r1_r1.setRotationPoint(25.5822F, -74.937F, 1.9816F);
		gun.addChild(gun122_r1_r1);
		setRotationAngle(gun122_r1_r1, 0.0F, 0.0F, -2.7884F);
		gun122_r1_r1.cubeList.add(new ModelBox(gun122_r1_r1, 205, 208, 2.4298F, -72.8525F, -19.4F, 1, 1, 24, 0.0F, false));

		gun124_r1_r1 = new ModelRenderer(this);
		gun124_r1_r1.setRotationPoint(66.2262F, -32.1702F, 1.9816F);
		gun.addChild(gun124_r1_r1);
		setRotationAngle(gun124_r1_r1, 0.0F, 0.0F, -2.1935F);
		gun124_r1_r1.cubeList.add(new ModelBox(gun124_r1_r1, 0, 70, 20.2117F, -69.6669F, -31.4F, 1, 1, 12, 0.0F, false));

		gun125_r1_r1 = new ModelRenderer(this);
		gun125_r1_r1.setRotationPoint(25.9461F, -74.8029F, 1.9816F);
		gun.addChild(gun125_r1_r1);
		setRotationAngle(gun125_r1_r1, 0.0F, 0.0F, -2.7884F);
		gun125_r1_r1.cubeList.add(new ModelBox(gun125_r1_r1, 72, 0, 2.7237F, -72.8179F, -31.4F, 1, 1, 12, 0.0F, false));

		gun126_r1_r1 = new ModelRenderer(this);
		gun126_r1_r1.setRotationPoint(-10.8026F, 25.9323F, -47.7132F);
		gun.addChild(gun126_r1_r1);
		setRotationAngle(gun126_r1_r1, 3.1416F, 0.0087F, -3.1416F);
		gun126_r1_r1.cubeList.add(new ModelBox(gun126_r1_r1, 0, 76, -9.2307F, -34.7001F, -30.2243F, 1, 1, 5, 0.0F, false));

		gun128_r1_r1 = new ModelRenderer(this);
		gun128_r1_r1.setRotationPoint(-8.7221F, 35.1762F, 1.9816F);
		gun.addChild(gun128_r1_r1);
		setRotationAngle(gun128_r1_r1, 0.0F, 0.0F, 0.6692F);
		gun128_r1_r1.cubeList.add(new ModelBox(gun128_r1_r1, 122, 72, -21.68F, -42.6609F, -7.4F, 1, 1, 3, 0.0F, false));
		gun128_r1_r1.cubeList.add(new ModelBox(gun128_r1_r1, 29, 139, -21.18F, -42.6609F, -24.4F, 1, 1, 17, 0.0F, false));
		gun128_r1_r1.cubeList.add(new ModelBox(gun128_r1_r1, 14, 78, -21.48F, -42.6609F, -4.4F, 2, 1, 3, 0.0F, false));
		gun128_r1_r1.cubeList.add(new ModelBox(gun128_r1_r1, 0, 139, -21.48F, -42.6609F, -32.4F, 2, 2, 8, 0.0F, false));

		gun136_r1_r1 = new ModelRenderer(this);
		gun136_r1_r1.setRotationPoint(-0.0354F, 26.1055F, 1.8883F);
		gun.addChild(gun136_r1_r1);
		setRotationAngle(gun136_r1_r1, -0.0744F, 0.0F, 0.0F);
		gun136_r1_r1.cubeList.add(new ModelBox(gun136_r1_r1, 114, 23, -1.0F, -40.1273F, 4.6246F, 2, 2, 3, 0.0F, false));

		gun138_r1_r1 = new ModelRenderer(this);
		gun138_r1_r1.setRotationPoint(-0.0354F, -98.6361F, -21.9456F);
		gun.addChild(gun138_r1_r1);
		setRotationAngle(gun138_r1_r1, -2.4166F, 0.0F, 0.0F);
		gun138_r1_r1.cubeList.add(new ModelBox(gun138_r1_r1, 48, 60, -1.0F, -87.69F, 30.7556F, 2, 1, 1, 0.0F, false));
		gun138_r1_r1.cubeList.add(new ModelBox(gun138_r1_r1, 42, 60, -1.0F, -88.14F, 30.7556F, 2, 1, 1, -0.001F, false));

		gun139_r1_r1 = new ModelRenderer(this);
		gun139_r1_r1.setRotationPoint(-29.1406F, -94.2666F, 1.9816F);
		gun.addChild(gun139_r1_r1);
		setRotationAngle(gun139_r1_r1, 0.0F, 0.0F, 2.8628F);
		gun139_r1_r1.cubeList.add(new ModelBox(gun139_r1_r1, 56, 111, -6.7467F, -86.9115F, 4.5F, 1, 1, 4, 0.0F, false));

		gun140_r1_r1 = new ModelRenderer(this);
		gun140_r1_r1.setRotationPoint(29.0694F, -94.2666F, 1.9816F);
		gun.addChild(gun140_r1_r1);
		setRotationAngle(gun140_r1_r1, 0.0F, 0.0F, -2.8628F);
		gun140_r1_r1.cubeList.add(new ModelBox(gun140_r1_r1, 11, 114, 5.7465F, -86.9115F, 4.5F, 1, 1, 4, 0.0F, false));

		gun142_r1_r1 = new ModelRenderer(this);
		gun142_r1_r1.setRotationPoint(-0.0408F, 25.9322F, 1.7884F);
		gun.addChild(gun142_r1_r1);
		setRotationAngle(gun142_r1_r1, 0.0F, 0.1115F, 0.0F);
		gun142_r1_r1.cubeList.add(new ModelBox(gun142_r1_r1, 0, 151, -2.2544F, -38.0F, 10.4951F, 1, 1, 1, 0.0F, false));
		gun142_r1_r1.cubeList.add(new ModelBox(gun142_r1_r1, 24, 58, -2.2544F, -38.5F, 8.4951F, 1, 2, 2, 0.0F, false));

		gun144_r1_r1 = new ModelRenderer(this);
		gun144_r1_r1.setRotationPoint(-0.03F, 25.9322F, 1.7884F);
		gun.addChild(gun144_r1_r1);
		setRotationAngle(gun144_r1_r1, 0.0F, -0.1115F, 0.0F);
		gun144_r1_r1.cubeList.add(new ModelBox(gun144_r1_r1, 4, 151, 1.2546F, -38.0F, 10.4951F, 1, 1, 1, 0.0F, false));
		gun144_r1_r1.cubeList.add(new ModelBox(gun144_r1_r1, 40, 70, 1.2546F, -38.5F, 8.4951F, 1, 2, 2, 0.0F, false));

		gun145_r1_r1 = new ModelRenderer(this);
		gun145_r1_r1.setRotationPoint(25.4269F, 25.9322F, -1.4207F);
		gun.addChild(gun145_r1_r1);
		setRotationAngle(gun145_r1_r1, 3.1416F, -1.4813F, -3.1416F);
		gun145_r1_r1.cubeList.add(new ModelBox(gun145_r1_r1, 0, 63, 9.9145F, -36.3F, 22.0643F, 8, 2, 1, 0.0F, false));

		gun146_r1_r1 = new ModelRenderer(this);
		gun146_r1_r1.setRotationPoint(-25.4976F, 25.932F, -1.4206F);
		gun.addChild(gun146_r1_r1);
		setRotationAngle(gun146_r1_r1, 3.1416F, 1.4813F, -3.1416F);
		gun146_r1_r1.cubeList.add(new ModelBox(gun146_r1_r1, 18, 63, -17.9144F, -36.3F, 22.0642F, 8, 2, 1, 0.0F, false));

		gun151_r1_r1 = new ModelRenderer(this);
		gun151_r1_r1.setRotationPoint(-0.0354F, 24.5363F, -46.789F);
		gun.addChild(gun151_r1_r1);
		setRotationAngle(gun151_r1_r1, -1.2641F, 0.0F, 0.0F);
		gun151_r1_r1.cubeList.add(new ModelBox(gun151_r1_r1, 54, 57, -1.0F, -62.4394F, -20.3188F, 2, 1, 4, 0.0F, false));
		gun151_r1_r1.cubeList.add(new ModelBox(gun151_r1_r1, 16, 120, 0.6F, -62.4394F, -20.7188F, 1, 1, 4, -0.001F, false));
		gun151_r1_r1.cubeList.add(new ModelBox(gun151_r1_r1, 89, 114, -1.6F, -62.4394F, -20.7188F, 1, 1, 4, -0.002F, false));

		gun154_r1_r1 = new ModelRenderer(this);
		gun154_r1_r1.setRotationPoint(-0.0354F, 30.5002F, -1.1668F);
		gun.addChild(gun154_r1_r1);
		setRotationAngle(gun154_r1_r1, -0.409F, 0.0F, 0.0F);
		gun154_r1_r1.cubeList.add(new ModelBox(gun154_r1_r1, 58, 102, -1.0F, -41.545F, -15.2933F, 2, 3, 2, 0.0F, false));
		gun154_r1_r1.cubeList.add(new ModelBox(gun154_r1_r1, 51, 0, 0.6F, -41.945F, -15.2933F, 1, 4, 2, -0.002F, false));
		gun154_r1_r1.cubeList.add(new ModelBox(gun154_r1_r1, 50, 44, -1.6F, -41.945F, -15.2933F, 1, 4, 2, -0.002F, false));

		gun160_r1_r1 = new ModelRenderer(this);
		gun160_r1_r1.setRotationPoint(-0.0354F, 37.8615F, -12.0189F);
		gun.addChild(gun160_r1_r1);
		setRotationAngle(gun160_r1_r1, -0.7854F, 0.0F, 0.0F);
		gun160_r1_r1.cubeList.add(new ModelBox(gun160_r1_r1, 60, 63, -1.0F, -42.2354F, -28.7997F, 2, 1, 1, 0.0F, false));

		gun161_r1_r1 = new ModelRenderer(this);
		gun161_r1_r1.setRotationPoint(-0.0354F, 46.1459F, -3.7346F);
		gun.addChild(gun161_r1_r1);
		setRotationAngle(gun161_r1_r1, -0.7854F, 0.0F, 0.0F);
		gun161_r1_r1.cubeList.add(new ModelBox(gun161_r1_r1, 72, 57, -1.0F, -28.0932F, -54.6576F, 2, 1, 1, 0.0F, false));

		gun168_r1_r1 = new ModelRenderer(this);
		gun168_r1_r1.setRotationPoint(-39.0431F, -71.8462F, 1.9816F);
		gun.addChild(gun168_r1_r1);
		setRotationAngle(gun168_r1_r1, 0.0F, 0.0F, 2.8628F);
		gun168_r1_r1.cubeList.add(new ModelBox(gun168_r1_r1, 10, 151, -18.2708F, -72.596F, -32.8F, 1, 1, 1, 0.0F, false));

		gun169_r1_r1 = new ModelRenderer(this);
		gun169_r1_r1.setRotationPoint(1.7331F, 29.4519F, 1.9816F);
		gun.addChild(gun169_r1_r1);
		setRotationAngle(gun169_r1_r1, 0.0F, 0.0F, -0.3718F);
		gun169_r1_r1.cubeList.add(new ModelBox(gun169_r1_r1, 52, 74, 10.0848F, -38.1634F, -32.8F, 2, 1, 1, 0.0F, false));

		gun170_r1_r1 = new ModelRenderer(this);
		gun170_r1_r1.setRotationPoint(3.4728F, 31.3349F, 1.9816F);
		gun.addChild(gun170_r1_r1);
		setRotationAngle(gun170_r1_r1, 0.0F, 0.0F, -0.4833F);
		gun170_r1_r1.cubeList.add(new ModelBox(gun170_r1_r1, 86, 13, 13.3674F, -38.6139F, -32.4F, 2, 1, 6, 0.0F, false));

		gun172_r1_r1 = new ModelRenderer(this);
		gun172_r1_r1.setRotationPoint(-0.0354F, 33.7136F, 3.5976F);
		gun.addChild(gun172_r1_r1);
		setRotationAngle(gun172_r1_r1, -0.4461F, 0.0F, 0.0F);
		gun172_r1_r1.cubeList.add(new ModelBox(gun172_r1_r1, 122, 84, -1.0F, -28.1418F, -50.2801F, 2, 2, 1, 0.0F, false));

		gun185_r1_r1 = new ModelRenderer(this);
		gun185_r1_r1.setRotationPoint(-67.286F, -45.1227F, 2.0816F);
		gun.addChild(gun185_r1_r1);
		setRotationAngle(gun185_r1_r1, 0.0F, 0.0F, 2.3051F);
		gun185_r1_r1.cubeList.add(new ModelBox(gun185_r1_r1, 210, 52, -20.7305F, -75.0451F, -24.4F, 1, 2, 20, -0.1F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(-2.0354F, -6.5678F, -0.3184F);
		gun.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.0F, -0.2094F, 0.0F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 8, 16, 0.0F, -0.5F, 1.3F, 1, 1, 1, 0.0F, false));
		gun_r1.cubeList.add(new ModelBox(gun_r1, 8, 0, 0.0F, -0.5F, 1.8F, 1, 1, 1, 0.0F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-2.0354F, -6.5678F, 4.2816F);
		gun.addChild(gun_r2);
		setRotationAngle(gun_r2, 0.0F, 0.2094F, 0.0F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 42, 32, -0.4F, -0.5F, -0.2F, 1, 1, 1, 0.0F, false));
		gun_r2.cubeList.add(new ModelBox(gun_r2, 44, 0, -0.4F, -0.5F, -0.6F, 1, 1, 1, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(-0.0354F, -9.0678F, -33.5184F);
		gun.addChild(barrel);
		

		muzzle = new ModelRenderer(this);
		muzzle.setRotationPoint(0.0F, 0.1F, -6.0F);
		barrel.addChild(muzzle);
		muzzle.cubeList.add(new ModelBox(muzzle, 135, 145, -0.225F, -1.4F, 2.0F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 145, 83, -0.5F, 0.4F, 1.6F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 145, 85, -0.75F, 0.4F, 1.6F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 86, 145, -0.225F, 0.4F, 1.6F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 145, 87, -0.5F, -1.4F, 1.6F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 145, 89, -0.75F, -1.4F, 1.6F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 83, 102, -0.275F, -1.3F, 0.2F, 1, 1, 2, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 33, 96, -0.5F, 0.3F, 0.2F, 1, 1, 2, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 25, 97, -0.7F, 0.3F, 0.2F, 1, 1, 2, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 60, 98, -0.275F, 0.3F, 0.2F, 1, 1, 2, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 50, 105, -0.7F, -1.3F, 0.2F, 1, 1, 2, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 42, 139, -0.5F, 0.3F, 3.7F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 48, 139, -0.7F, 0.3F, 3.7F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 52, 139, -0.275F, 0.3F, 3.7F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 58, 139, -0.5F, -1.3F, 3.7F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 62, 139, -0.275F, -1.3F, 3.7F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 68, 139, -0.7F, -1.3F, 3.7F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 46, 96, -0.5F, 0.3F, 6.6F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 0, 97, -0.7F, 0.3F, 6.6F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 97, 3, -0.275F, 0.3F, 6.6F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 98, 62, -0.5F, -1.3F, 6.6F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 53, 99, -0.275F, -1.3F, 6.6F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 4, 102, -0.7F, -1.3F, 6.6F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 126, 42, -0.5F, 0.3F, 6.3F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 126, 115, -0.7F, 0.3F, 6.3F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 128, 26, -0.275F, 0.3F, 6.3F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 58, 128, -0.5F, -1.3F, 6.3F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 128, 85, -0.275F, -1.3F, 6.3F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 130, 11, -0.7F, -1.3F, 6.3F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 132, 34, -0.5F, 0.3F, 6.9F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 132, 39, -0.7F, 0.3F, 6.9F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 132, 41, -0.275F, 0.3F, 6.9F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 132, 55, -0.5F, -1.3F, 6.9F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 132, 63, -0.275F, -1.3F, 6.9F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 132, 74, -0.7F, -1.3F, 6.9F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 53, 32, -0.5F, 0.3F, 3.1F, 1, 2, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 0, 54, -1.0F, 1.6F, 3.1F, 2, 1, 4, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 36, 51, -1.0F, 1.6F, 3.9F, 2, 1, 4, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 43, 14, -0.5F, 0.3F, 6.9F, 1, 2, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 25, 47, -0.5F, 0.3F, 6.7F, 1, 2, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 51, 8, -0.5F, 0.3F, 6.3F, 1, 2, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 100, 62, -0.5F, 1.1F, 4.0F, 1, 1, 3, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 94, 7, -0.5F, 1.3F, 4.0F, 1, 1, 3, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 44, 51, -0.5F, 0.3F, 3.5F, 1, 2, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 36, 51, -0.5F, 0.3F, 3.7F, 1, 2, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 133, 133, -0.7F, 0.3F, 3.1F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 134, 5, -0.275F, 0.3F, 3.1F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 134, 28, -0.5F, -1.3F, 3.1F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 134, 43, -0.275F, -1.3F, 3.1F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 134, 76, -0.7F, -1.3F, 3.1F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 133, 31, -0.5F, 0.3F, 3.4F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 32, 133, -0.7F, 0.3F, 3.4F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 36, 133, -0.275F, 0.3F, 3.4F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 133, 36, -0.5F, -1.3F, 3.4F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 40, 133, -0.275F, -1.3F, 3.4F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 44, 133, -0.7F, -1.3F, 3.4F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 50, 102, -0.5F, -1.3F, 0.2F, 1, 1, 2, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 90, 145, -0.225F, -1.4F, 1.6F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 144, 58, -0.5F, 0.4F, 0.8F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 144, 60, -0.75F, 0.4F, 0.8F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 144, 64, -0.225F, 0.4F, 0.8F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 144, 66, -0.5F, -1.4F, 0.8F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 144, 68, -0.75F, -1.4F, 0.8F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 142, 144, -0.225F, -1.4F, 0.8F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 144, 4, -0.5F, 0.4F, 0.0F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 144, 6, -0.75F, 0.4F, 0.0F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 144, 8, -0.225F, 0.4F, 0.0F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 144, 10, -0.5F, -1.4F, 0.0F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 144, 12, -0.75F, -1.4F, 0.0F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 144, 16, -0.225F, -1.4F, 0.0F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 142, 112, -0.5F, 0.4F, -2.7F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 142, 116, -0.75F, 0.4F, -2.7F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 142, 118, -0.225F, 0.4F, -2.7F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 142, 120, -0.5F, -1.4F, -2.7F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 142, 124, -0.75F, -1.4F, -2.7F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 142, 128, -0.225F, -1.4F, -2.7F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 145, 125, -0.5F, 0.4F, 2.0F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 145, 129, -0.75F, 0.4F, 2.0F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 131, 145, -0.225F, 0.4F, 2.0F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 145, 133, -0.75F, -1.4F, 2.0F, 1, 1, 1, -0.3F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 145, 131, -0.5F, -1.4F, 2.0F, 1, 1, 1, -0.3F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(0.0125F, 0.0F, 0.0F);
		muzzle.addChild(gun_r3);
		setRotationAngle(gun_r3, 0.0F, 0.0F, 2.3562F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 145, 101, -0.2375F, -1.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 101, 145, -0.7625F, -1.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 145, 97, -0.5125F, -1.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 97, 145, -0.2375F, 0.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 145, 95, -0.7625F, 0.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 145, 93, -0.5125F, 0.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 142, 78, -0.2375F, -1.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 142, 76, -0.7625F, -1.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 142, 74, -0.5125F, -1.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 142, 72, -0.2375F, 0.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 23, 142, -0.7625F, 0.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 68, 141, -0.5125F, 0.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 86, 143, -0.2375F, -1.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 82, 143, -0.7625F, -1.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 78, 143, -0.5125F, -1.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 72, 143, -0.2375F, 0.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 68, 143, -0.7625F, 0.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 62, 143, -0.5125F, 0.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 144, 26, -0.2375F, -1.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 144, 24, -0.7625F, -1.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 23, 144, -0.5125F, -1.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 144, 22, -0.2375F, 0.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 144, 20, -0.7625F, 0.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 144, 18, -0.5125F, 0.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 41, 145, -0.2375F, -1.4F, 1.6F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 20, 145, -0.7625F, -1.4F, 1.6F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 16, 145, -0.5125F, -1.4F, 1.6F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 12, 145, -0.2375F, 0.4F, 1.6F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 4, 145, -0.7625F, 0.4F, 1.6F, 1, 1, 1, -0.3F, false));
		gun_r3.cubeList.add(new ModelBox(gun_r3, 0, 145, -0.5125F, 0.4F, 1.6F, 1, 1, 1, -0.3F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(0.0125F, 0.0F, 0.0F);
		muzzle.addChild(gun_r4);
		setRotationAngle(gun_r4, 0.0F, 0.0F, 1.5708F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 145, 111, -0.2375F, -1.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 111, 145, -0.7625F, -1.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 145, 109, -0.5125F, -1.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 107, 145, -0.2375F, 0.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 145, 105, -0.7625F, 0.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 145, 103, -0.5125F, 0.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 142, 94, -0.2375F, -1.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 142, 92, -0.7625F, -1.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 142, 88, -0.5125F, -1.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 142, 86, -0.2375F, 0.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 142, 84, -0.7625F, 0.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 142, 82, -0.5125F, 0.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 117, 143, -0.2375F, -1.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 111, 143, -0.7625F, -1.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 107, 143, -0.5125F, -1.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 101, 143, -0.2375F, 0.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 97, 143, -0.7625F, 0.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 90, 143, -0.5125F, 0.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 144, 42, -0.2375F, -1.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 144, 40, -0.7625F, -1.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 144, 38, -0.5125F, -1.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 144, 34, -0.2375F, 0.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 144, 32, -0.7625F, 0.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 144, 30, -0.5125F, 0.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 72, 145, -0.2375F, -1.4F, 1.6F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 68, 145, -0.7625F, -1.4F, 1.6F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 62, 145, -0.5125F, -1.4F, 1.6F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 58, 145, -0.2375F, 0.4F, 1.6F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 52, 145, -0.7625F, 0.4F, 1.6F, 1, 1, 1, -0.3F, false));
		gun_r4.cubeList.add(new ModelBox(gun_r4, 48, 145, -0.5125F, 0.4F, 1.6F, 1, 1, 1, -0.3F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(0.0125F, 0.0F, 0.0F);
		muzzle.addChild(gun_r5);
		setRotationAngle(gun_r5, 0.0F, 0.0F, 0.7854F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 145, 121, -0.2375F, -1.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 121, 145, -0.7625F, -1.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 145, 119, -0.5125F, -1.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 145, 117, -0.2375F, 0.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 117, 145, -0.7625F, 0.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 145, 113, -0.5125F, 0.4F, 2.0F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 142, 110, -0.2375F, -1.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 142, 108, -0.7625F, -1.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 142, 104, -0.5125F, -1.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 142, 102, -0.2375F, 0.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 142, 100, -0.7625F, 0.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 142, 96, -0.5125F, 0.4F, -2.7F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 144, 2, -0.2375F, -1.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 144, 0, -0.7625F, -1.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 139, 143, -0.5125F, -1.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 135, 143, -0.2375F, 0.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 131, 143, -0.7625F, 0.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 121, 143, -0.5125F, 0.4F, 0.0F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 144, 56, -0.2375F, -1.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 144, 53, -0.7625F, -1.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 144, 51, -0.5125F, -1.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 144, 49, -0.2375F, 0.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 144, 47, -0.7625F, 0.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 144, 44, -0.5125F, 0.4F, 0.8F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 82, 145, -0.2375F, -1.4F, 1.6F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 145, 79, -0.7625F, -1.4F, 1.6F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 78, 145, -0.5125F, -1.4F, 1.6F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 145, 77, -0.2375F, 0.4F, 1.6F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 145, 75, -0.7625F, 0.4F, 1.6F, 1, 1, 1, -0.3F, false));
		gun_r5.cubeList.add(new ModelBox(gun_r5, 145, 73, -0.5125F, 0.4F, 1.6F, 1, 1, 1, -0.3F, false));

		gun_r6 = new ModelRenderer(this);
		gun_r6.setRotationPoint(0.0125F, 0.0F, 3.9F);
		muzzle.addChild(gun_r6);
		setRotationAngle(gun_r6, 0.0F, 0.0F, 0.7854F);
		gun_r6.cubeList.add(new ModelBox(gun_r6, 28, 133, -0.2875F, -1.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 133, 25, -0.5125F, 0.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 24, 133, -0.7125F, 0.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 20, 133, -0.2875F, 0.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 16, 133, -0.7125F, -1.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 12, 133, -0.5125F, -1.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 126, 133, -0.2875F, -1.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 112, 133, -0.5125F, 0.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 108, 133, -0.7125F, 0.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 104, 133, -0.2875F, 0.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 100, 133, -0.7125F, -1.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 96, 133, -0.5125F, -1.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 132, 23, -0.2875F, -1.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 132, 7, -0.5125F, 0.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 132, 3, -0.7125F, 0.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 132, 0, -0.2875F, 0.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 131, 130, -0.7125F, -1.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 127, 131, -0.5125F, -1.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 125, 23, -0.2875F, -1.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 94, 122, -0.5125F, 0.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 121, 23, -0.7125F, 0.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 88, 119, -0.2875F, 0.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 15, 119, -0.7125F, -1.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 117, 28, -0.5125F, -1.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 13, 96, -0.2875F, -1.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 83, 95, -0.5125F, 0.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 72, 95, -0.7125F, 0.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 95, 53, -0.2875F, 0.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 94, 75, -0.7125F, -1.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 94, 48, -0.5125F, -1.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 38, 139, -0.2875F, -1.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 20, 139, -0.5125F, 0.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 16, 139, -0.7125F, 0.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 12, 139, -0.2875F, 0.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 4, 139, -0.7125F, -1.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 0, 139, -0.5125F, -1.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 21, 96, -0.2875F, -1.3F, -3.7F, 1, 1, 2, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 96, 20, -0.5125F, 0.3F, -3.7F, 1, 1, 2, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 9, 96, -0.7125F, 0.3F, -3.7F, 1, 1, 2, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 93, 82, -0.2875F, 0.3F, -3.7F, 1, 1, 2, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 93, 78, -0.7125F, -1.3F, -3.7F, 1, 1, 2, -0.3F, false));
		gun_r6.cubeList.add(new ModelBox(gun_r6, 93, 38, -0.5125F, -1.3F, -3.7F, 1, 1, 2, -0.3F, false));

		gun_r7 = new ModelRenderer(this);
		gun_r7.setRotationPoint(0.0125F, 0.0F, 3.9F);
		muzzle.addChild(gun_r7);
		setRotationAngle(gun_r7, 0.0F, 0.0F, 1.5708F);
		gun_r7.cubeList.add(new ModelBox(gun_r7, 133, 10, -0.2875F, -1.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 8, 133, -0.5125F, 0.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 4, 133, -0.7125F, 0.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 0, 133, -0.2875F, 0.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 130, 132, -0.7125F, -1.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 132, 128, -0.5125F, -1.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 92, 133, -0.2875F, -1.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 88, 133, -0.5125F, 0.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 84, 133, -0.7125F, 0.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 80, 133, -0.2875F, 0.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 76, 133, -0.7125F, -1.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 72, 133, -0.5125F, -1.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 131, 72, -0.2875F, -1.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 60, 131, -0.5125F, 0.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 56, 131, -0.7125F, 0.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 52, 131, -0.2875F, 0.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 131, 27, -0.7125F, -1.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 124, 130, -0.5125F, -1.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 11, 116, -0.2875F, -1.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 101, 115, -0.5125F, 0.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 50, 115, -0.7125F, 0.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 62, 113, -0.2875F, 0.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 113, 28, -0.7125F, -1.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 113, 11, -0.5125F, -1.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 94, 20, -0.2875F, -1.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 93, 85, -0.5125F, 0.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 93, 41, -0.7125F, 0.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 93, 35, -0.2875F, 0.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 26, 92, -0.7125F, -1.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 22, 92, -0.5125F, -1.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 138, 2, -0.2875F, -1.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 138, 0, -0.5125F, 0.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 135, 1, -0.7125F, 0.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 134, 131, -0.2875F, 0.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 129, 134, -0.7125F, -1.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 123, 134, -0.5125F, -1.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 33, 93, -0.2875F, -1.3F, -3.7F, 1, 1, 2, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 93, 32, -0.5125F, 0.3F, -3.7F, 1, 1, 2, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 91, 53, -0.7125F, 0.3F, -3.7F, 1, 1, 2, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 89, 26, -0.2875F, 0.3F, -3.7F, 1, 1, 2, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 87, 78, -0.7125F, -1.3F, -3.7F, 1, 1, 2, -0.3F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 85, 53, -0.5125F, -1.3F, -3.7F, 1, 1, 2, -0.3F, false));

		gun_r8 = new ModelRenderer(this);
		gun_r8.setRotationPoint(0.0125F, 0.0F, 3.9F);
		muzzle.addChild(gun_r8);
		setRotationAngle(gun_r8, 0.0F, 0.0F, 2.3562F);
		gun_r8.cubeList.add(new ModelBox(gun_r8, 123, 132, -0.2875F, -1.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 119, 132, -0.5125F, 0.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 115, 132, -0.7125F, 0.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 132, 85, -0.2875F, 0.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 132, 81, -0.7125F, -1.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 132, 78, -0.5125F, -1.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 133, 60, -0.2875F, -1.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 60, 133, -0.5125F, 0.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 133, 58, -0.7125F, 0.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 56, 133, -0.2875F, 0.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 52, 133, -0.7125F, -1.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 48, 133, -0.5125F, -1.3F, -0.8F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 120, 130, -0.2875F, -1.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 116, 130, -0.5125F, 0.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 130, 115, -0.7125F, 0.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 130, 59, -0.2875F, 0.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 130, 37, -0.7125F, -1.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 130, 32, -0.5125F, -1.3F, 3.0F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 109, 110, -0.2875F, -1.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 110, 41, -0.5125F, 0.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 110, 35, -0.7125F, 0.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 5, 109, -0.2875F, 0.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 103, 41, -0.7125F, -1.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 103, 35, -0.5125F, -1.3F, 2.4F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 91, 78, -0.2875F, -1.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 90, 88, -0.5125F, 0.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 16, 90, -0.7125F, 0.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 5, 90, -0.2875F, 0.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 89, 62, -0.7125F, -1.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 89, 53, -0.5125F, -1.3F, 2.7F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 119, 134, -0.2875F, -1.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 134, 115, -0.5125F, 0.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 115, 134, -0.7125F, 0.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 134, 100, -0.2875F, 0.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 134, 98, -0.7125F, -1.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 134, 83, -0.5125F, -1.3F, -0.2F, 1, 1, 1, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 79, 62, -0.2875F, -1.3F, -3.7F, 1, 1, 2, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 79, 26, -0.5125F, 0.3F, -3.7F, 1, 1, 2, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 14, 74, -0.7125F, 0.3F, -3.7F, 1, 1, 2, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 56, 63, -0.2875F, 0.3F, -3.7F, 1, 1, 2, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 50, 63, -0.7125F, -1.3F, -3.7F, 1, 1, 2, -0.3F, false));
		gun_r8.cubeList.add(new ModelBox(gun_r8, 44, 63, -0.5125F, -1.3F, -3.7F, 1, 1, 2, -0.3F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0125F, 0.0F, 0.2F);
		muzzle.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 58, 143, -0.7125F, -1.3F, -0.5F, 1, 1, 1, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 52, 143, -0.2875F, -1.3F, -0.5F, 1, 1, 1, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 48, 143, -0.5125F, -1.3F, -0.5F, 1, 1, 1, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 41, 143, -0.2875F, 0.3F, -0.5F, 1, 1, 1, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 20, 143, -0.7125F, 0.3F, -0.5F, 1, 1, 1, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 16, 143, -0.5125F, 0.3F, -0.5F, 1, 1, 1, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 23, 140, -0.5125F, -1.3F, -2.5F, 1, 1, 1, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 141, -0.7125F, -1.3F, -2.5F, 1, 1, 1, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 141, 1, -0.2875F, -1.3F, -2.5F, 1, 1, 1, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 20, 141, -0.5125F, 0.3F, -2.5F, 1, 1, 1, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 41, 141, -0.7125F, 0.3F, -2.5F, 1, 1, 1, -0.3F, false));
		bone.cubeList.add(new ModelBox(bone, 48, 141, -0.2875F, 0.3F, -2.5F, 1, 1, 1, -0.3F, false));

		gun_r9 = new ModelRenderer(this);
		gun_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(gun_r9);
		setRotationAngle(gun_r9, 0.0F, 0.0F, 2.3562F);
		gun_r9.cubeList.add(new ModelBox(gun_r9, 103, 55, -0.5125F, -1.3F, -2.5F, 1, 1, 3, -0.3F, false));
		gun_r9.cubeList.add(new ModelBox(gun_r9, 108, 62, -0.7125F, -1.3F, -2.5F, 1, 1, 3, -0.3F, false));
		gun_r9.cubeList.add(new ModelBox(gun_r9, 91, 110, -0.2875F, 0.3F, -2.5F, 1, 1, 3, -0.3F, false));
		gun_r9.cubeList.add(new ModelBox(gun_r9, 111, 55, -0.7125F, 0.3F, -2.5F, 1, 1, 3, -0.3F, false));
		gun_r9.cubeList.add(new ModelBox(gun_r9, 0, 113, -0.5125F, 0.3F, -2.5F, 1, 1, 3, -0.3F, false));
		gun_r9.cubeList.add(new ModelBox(gun_r9, 72, 113, -0.2875F, -1.3F, -2.5F, 1, 1, 3, -0.3F, false));

		gun_r10 = new ModelRenderer(this);
		gun_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(gun_r10);
		setRotationAngle(gun_r10, 0.0F, 0.0F, 1.5708F);
		gun_r10.cubeList.add(new ModelBox(gun_r10, 142, 130, -0.5125F, -1.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r10.cubeList.add(new ModelBox(gun_r10, 142, 132, -0.7125F, -1.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r10.cubeList.add(new ModelBox(gun_r10, 62, 141, -0.2875F, 0.3F, -2.5F, 1, 1, 1, -0.3F, false));
		gun_r10.cubeList.add(new ModelBox(gun_r10, 58, 141, -0.7125F, 0.3F, -2.5F, 1, 1, 1, -0.3F, false));
		gun_r10.cubeList.add(new ModelBox(gun_r10, 52, 141, -0.5125F, 0.3F, -2.5F, 1, 1, 1, -0.3F, false));
		gun_r10.cubeList.add(new ModelBox(gun_r10, 16, 141, -0.7125F, -1.3F, -2.5F, 1, 1, 1, -0.3F, false));
		gun_r10.cubeList.add(new ModelBox(gun_r10, 12, 141, -0.5125F, -1.3F, -2.5F, 1, 1, 1, -0.3F, false));
		gun_r10.cubeList.add(new ModelBox(gun_r10, 4, 141, -0.2875F, -1.3F, -2.5F, 1, 1, 1, -0.3F, false));
		gun_r10.cubeList.add(new ModelBox(gun_r10, 142, 134, -0.2875F, 0.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r10.cubeList.add(new ModelBox(gun_r10, 0, 143, -0.7125F, 0.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r10.cubeList.add(new ModelBox(gun_r10, 4, 143, -0.5125F, 0.3F, -0.5F, 1, 1, 1, -0.3F, false));
		gun_r10.cubeList.add(new ModelBox(gun_r10, 12, 143, -0.2875F, -1.3F, -0.5F, 1, 1, 1, -0.3F, false));

		gun_r11 = new ModelRenderer(this);
		gun_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(gun_r11);
		setRotationAngle(gun_r11, 0.0F, 0.0F, 0.7854F);
		gun_r11.cubeList.add(new ModelBox(gun_r11, 116, 62, -0.5125F, -1.3F, -2.5F, 1, 1, 3, -0.3F, false));
		gun_r11.cubeList.add(new ModelBox(gun_r11, 0, 117, -0.7125F, -1.3F, -2.5F, 1, 1, 3, -0.3F, false));
		gun_r11.cubeList.add(new ModelBox(gun_r11, 72, 117, -0.2875F, 0.3F, -2.5F, 1, 1, 3, -0.3F, false));
		gun_r11.cubeList.add(new ModelBox(gun_r11, 83, 118, -0.7125F, 0.3F, -2.5F, 1, 1, 3, -0.3F, false));
		gun_r11.cubeList.add(new ModelBox(gun_r11, 119, 55, -0.5125F, 0.3F, -2.5F, 1, 1, 3, -0.3F, false));
		gun_r11.cubeList.add(new ModelBox(gun_r11, 89, 121, -0.2875F, -1.3F, -2.5F, 1, 1, 3, -0.3F, false));

		cube = new ModelRenderer(this);
		cube.setRotationPoint(0.0125F, 0.1F, 0.0F);
		barrel.addChild(cube);
		cube.cubeList.add(new ModelBox(cube, 141, 159, -0.6125F, 0.1F, -4.0F, 1, 1, 8, -0.3F, false));
		cube.cubeList.add(new ModelBox(cube, 107, 153, -0.3875F, -1.1F, -4.0F, 1, 1, 8, -0.3F, false));
		cube.cubeList.add(new ModelBox(cube, 29, 157, -0.6375F, -1.1F, -4.0F, 1, 1, 8, -0.3F, false));
		cube.cubeList.add(new ModelBox(cube, 47, 157, -0.3625F, 0.1F, -4.0F, 1, 1, 8, -0.3F, false));

		gun_r12 = new ModelRenderer(this);
		gun_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube.addChild(gun_r12);
		setRotationAngle(gun_r12, 0.0F, 0.0F, 2.3562F);
		gun_r12.cubeList.add(new ModelBox(gun_r12, 97, 143, -0.6125F, 0.1F, -4.0F, 1, 1, 8, -0.3F, false));
		gun_r12.cubeList.add(new ModelBox(gun_r12, 68, 143, -0.3875F, -1.1F, -4.0F, 1, 1, 8, -0.3F, false));
		gun_r12.cubeList.add(new ModelBox(gun_r12, 142, 128, -0.6375F, -1.1F, -4.0F, 1, 1, 8, -0.3F, false));
		gun_r12.cubeList.add(new ModelBox(gun_r12, 48, 139, -0.3625F, 0.1F, -4.0F, 1, 1, 8, -0.3F, false));

		gun_r13 = new ModelRenderer(this);
		gun_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube.addChild(gun_r13);
		setRotationAngle(gun_r13, 0.0F, 0.0F, 1.5708F);
		gun_r13.cubeList.add(new ModelBox(gun_r13, 148, 143, -0.6125F, 0.1F, -4.0F, 1, 1, 8, -0.3F, false));
		gun_r13.cubeList.add(new ModelBox(gun_r13, 107, 144, -0.3875F, -1.1F, -4.0F, 1, 1, 8, -0.3F, false));
		gun_r13.cubeList.add(new ModelBox(gun_r13, 144, 47, -0.6375F, -1.1F, -4.0F, 1, 1, 8, -0.3F, false));
		gun_r13.cubeList.add(new ModelBox(gun_r13, 144, 38, -0.3625F, 0.1F, -4.0F, 1, 1, 8, -0.3F, false));

		gun_r14 = new ModelRenderer(this);
		gun_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube.addChild(gun_r14);
		setRotationAngle(gun_r14, 0.0F, 0.0F, 0.7854F);
		gun_r14.cubeList.add(new ModelBox(gun_r14, 152, 129, -0.6125F, 0.1F, -4.0F, 1, 1, 8, -0.3F, false));
		gun_r14.cubeList.add(new ModelBox(gun_r14, 97, 152, -0.3875F, -1.1F, -4.0F, 1, 1, 8, -0.3F, false));
		gun_r14.cubeList.add(new ModelBox(gun_r14, 68, 152, -0.6375F, -1.1F, -4.0F, 1, 1, 8, -0.3F, false));
		gun_r14.cubeList.add(new ModelBox(gun_r14, 0, 149, -0.3625F, 0.1F, -4.0F, 1, 1, 8, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}