package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AACHoneyBadger extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun745_r1;
	private final ModelRenderer gun274_r1;
	private final ModelRenderer gun272_r1;
	private final ModelRenderer gun270_r1;
	private final ModelRenderer gun267_r1;
	private final ModelRenderer gun264_r1;
	private final ModelRenderer gun263_r1;
	private final ModelRenderer gun260_r1;
	private final ModelRenderer gun255_r1;
	private final ModelRenderer gun252_r1;
	private final ModelRenderer gun251_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer gun153_r1;
	private final ModelRenderer gun132_r1;
	private final ModelRenderer gun130_r1;
	private final ModelRenderer gun125_r1;
	private final ModelRenderer gun114_r1;
	private final ModelRenderer gun112_r1;
	private final ModelRenderer gun94_r1;
	private final ModelRenderer gun93_r1;
	private final ModelRenderer gun82_r1;
	private final ModelRenderer gun81_r1;
	private final ModelRenderer gun77_r1;
	private final ModelRenderer gun68_r1;
	private final ModelRenderer gun67_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun62_r1;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun49_r1;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone2_r1;
	private final ModelRenderer bone3_r1;
	private final ModelRenderer gun30_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun17_r1;

	public AACHoneyBadger() {
		textureWidth = 256;
		textureHeight = 256;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 16, 16, -3.0F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 22, -3.0F, -27.0F, -7.3F, 3, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 0, -2.5F, -27.1F, -12.3F, 2, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 6, -3.0F, -27.0F, -13.3F, 3, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -3.01F, -31.0F, -13.8F, 3, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 157, 131, -0.7F, -36.0F, -14.0F, 1, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 138, 156, -3.3F, -36.0F, -14.0F, 3, 5, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -3.5F, -36.0F, -21.2F, 4, 8, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 16, -3.5F, -28.5F, -21.2F, 4, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 73, -3.5F, -27.7F, -16.2F, 4, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 80, -3.5F, -36.0F, -15.2F, 4, 4, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 29, -0.35F, -36.0F, -16.5F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 39, 0, -0.4F, -33.5F, -16.3F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 39, 6, -3.5F, -35.5F, -22.7F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 4, -0.4F, -35.47F, -22.4F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 12, -0.7F, -36.5F, -1.0F, 1, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 64, -3.3F, -35.5F, -1.0F, 3, 2, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 3, -0.75F, -38.0F, -22.0F, 1, 2, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 54, 0, -3.25F, -37.0F, -22.0F, 1, 1, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 12, -1.45F, -38.0F, -21.2F, 1, 2, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 0, -0.55F, -38.0F, -21.2F, 1, 2, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 11, -0.4F, -36.5F, -16.5F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 0, -3.7F, -35.5F, -22.4F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 54, 0, -3.8F, -35.3F, -21.4F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 39, 40, -3.8F, -34.3F, -14.7F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 59, -3.8F, -32.4F, -13.7F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 25, -3.7F, -33.7F, -12.7F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 16, 0, -0.35F, -32.5F, -16.5F, 1, 5, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 65, -0.349F, -34.3F, -16.5F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 5, 58, -0.35F, -33.5F, -16.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 39, 29, -0.75F, -38.0F, -22.7F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 39, 17, -3.25F, -38.0F, -22.7F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 65, -3.7F, -37.8F, -22.7F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 39, 65, -2.7F, -39.3F, -22.7F, 2, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 65, -3.7F, -38.4F, -22.7F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 16, -2.5F, -39.3F, 1.0F, 2, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 46, 54, -0.3F, -35.6F, -12.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 54, -0.3F, -35.6F, -13.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 39, 12, -0.25F, -36.5F, -12.75F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 54, -3.0F, -38.5F, -22.6F, 3, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 19, -3.0F, -34.0F, 1.0F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 50, 0, -4.3F, -39.0F, -11.0F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 12, 50, -4.3F, -38.5F, -11.0F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 92, 154, -3.7F, -37.8F, -11.0F, 1, 1, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 12, 39, -1.3F, -39.3F, -22.7F, 1, 2, 1, 0.0F, false));

		gun745_r1 = new ModelRenderer(this);
		gun745_r1.setRotationPoint(0.0F, -19.855F, 18.534F);
		gun.addChild(gun745_r1);
		setRotationAngle(gun745_r1, 0.7854F, 0.0F, 0.0F);
		gun745_r1.cubeList.add(new ModelBox(gun745_r1, 6, 53, -3.8F, -32.0F, -14.7F, 1, 1, 1, 0.0F, false));
		gun745_r1.cubeList.add(new ModelBox(gun745_r1, 31, 59, -3.8F, -32.3F, -14.7F, 1, 1, 1, 0.0F, false));

		gun274_r1 = new ModelRenderer(this);
		gun274_r1.setRotationPoint(-10.84F, -0.2397F, 0.0F);
		gun.addChild(gun274_r1);
		setRotationAngle(gun274_r1, 0.0F, 0.0F, 0.2974F);
		gun274_r1.cubeList.add(new ModelBox(gun274_r1, 12, 58, -4.62F, -36.3F, -15.3F, 1, 1, 3, 0.0F, false));
		gun274_r1.cubeList.add(new ModelBox(gun274_r1, 26, 59, -4.62F, -36.3F, -19.7F, 1, 1, 3, 0.0F, false));

		gun272_r1 = new ModelRenderer(this);
		gun272_r1.setRotationPoint(-11.0355F, -0.3349F, 0.0F);
		gun.addChild(gun272_r1);
		setRotationAngle(gun272_r1, 0.0F, 0.0F, 0.2974F);
		gun272_r1.cubeList.add(new ModelBox(gun272_r1, 38, 59, -4.4F, -37.0F, -15.3F, 1, 1, 3, 0.0F, false));
		gun272_r1.cubeList.add(new ModelBox(gun272_r1, 53, 60, -4.4F, -37.0F, -19.7F, 1, 1, 3, 0.0F, false));

		gun270_r1 = new ModelRenderer(this);
		gun270_r1.setRotationPoint(-11.0149F, -0.2719F, 0.0F);
		gun.addChild(gun270_r1);
		setRotationAngle(gun270_r1, 0.0F, 0.0F, 0.2974F);
		gun270_r1.cubeList.add(new ModelBox(gun270_r1, 20, 39, -4.6F, -36.9F, -16.5F, 1, 2, 1, 0.0F, false));

		gun267_r1 = new ModelRenderer(this);
		gun267_r1.setRotationPoint(-10.697F, -0.1943F, 0.0F);
		gun.addChild(gun267_r1);
		setRotationAngle(gun267_r1, 0.0F, 0.0F, 0.2974F);
		gun267_r1.cubeList.add(new ModelBox(gun267_r1, 25, 79, -4.7F, -35.8F, -20.0F, 1, 1, 8, 0.0F, false));

		gun264_r1 = new ModelRenderer(this);
		gun264_r1.setRotationPoint(-11.1439F, -0.4111F, 0.0F);
		gun.addChild(gun264_r1);
		setRotationAngle(gun264_r1, 0.0F, 0.0F, 0.2974F);
		gun264_r1.cubeList.add(new ModelBox(gun264_r1, 52, 65, -4.2F, -37.4F, -20.0F, 1, 2, 8, 0.0F, false));

		gun263_r1 = new ModelRenderer(this);
		gun263_r1.setRotationPoint(28.0016F, -18.1507F, 0.0F);
		gun.addChild(gun263_r1);
		setRotationAngle(gun263_r1, 0.0F, 0.0F, -0.9295F);
		gun263_r1.cubeList.add(new ModelBox(gun263_r1, 0, 27, -4.1F, -37.0F, -21.5F, 1, 1, 11, 0.0F, false));

		gun260_r1 = new ModelRenderer(this);
		gun260_r1.setRotationPoint(-4.2147F, 0.2224F, 0.0F);
		gun.addChild(gun260_r1);
		setRotationAngle(gun260_r1, 0.0F, 0.0F, 0.1115F);
		gun260_r1.cubeList.add(new ModelBox(gun260_r1, 54, 11, -4.1F, -37.65F, -20.5F, 1, 1, 9, 0.0F, false));

		gun255_r1 = new ModelRenderer(this);
		gun255_r1.setRotationPoint(4.4037F, 0.0F, -3.4627F);
		gun.addChild(gun255_r1);
		setRotationAngle(gun255_r1, 0.0F, 0.5205F, 0.0F);
		gun255_r1.cubeList.add(new ModelBox(gun255_r1, 13, 64, -4.3F, -38.5F, -10.0F, 1, 1, 3, 0.0F, false));
		gun255_r1.cubeList.add(new ModelBox(gun255_r1, 64, 54, -4.3F, -39.0F, -10.0F, 1, 1, 3, 0.0F, false));

		gun252_r1 = new ModelRenderer(this);
		gun252_r1.setRotationPoint(33.1822F, -33.0478F, 0.0F);
		gun.addChild(gun252_r1);
		setRotationAngle(gun252_r1, 0.0F, 0.0F, -1.3384F);
		gun252_r1.cubeList.add(new ModelBox(gun252_r1, 39, 0, -4.3F, -37.5F, -11.0F, 1, 2, 1, 0.0F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(7.1343F, -1.4667F, 0.0F);
		gun.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -0.1859F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 18, 50, -4.3F, -39.0F, -11.0F, 2, 1, 1, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.0706F, 0.4336F, -4.8545F);
		gun.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -0.1396F, 0.1047F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 0, 64, -0.5F, -34.1F, -5.5F, 1, 1, 2, 0.0F, false));

		gun153_r1 = new ModelRenderer(this);
		gun153_r1.setRotationPoint(0.0F, -9.2841F, 17.7674F);
		gun.addChild(gun153_r1);
		setRotationAngle(gun153_r1, 0.5934F, 0.0F, 0.0F);
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 12, 53, -0.6F, -33.7F, -6.3F, 1, 1, 1, 0.0F, false));

		gun132_r1 = new ModelRenderer(this);
		gun132_r1.setRotationPoint(34.2409F, -25.4394F, 0.0F);
		gun.addChild(gun132_r1);
		setRotationAngle(gun132_r1, 0.0F, 0.0F, -1.2641F);
		gun132_r1.cubeList.add(new ModelBox(gun132_r1, 54, 21, -0.5662F, -36.1048F, -13.21F, 2, 1, 2, 0.0F, false));

		gun130_r1 = new ModelRenderer(this);
		gun130_r1.setRotationPoint(-24.3567F, -58.1742F, 0.0F);
		gun.addChild(gun130_r1);
		setRotationAngle(gun130_r1, 0.0F, 0.0F, 2.3051F);
		gun130_r1.cubeList.add(new ModelBox(gun130_r1, 26, 54, 0.75F, -34.5F, -12.75F, 1, 1, 1, 0.0F, false));

		gun125_r1 = new ModelRenderer(this);
		gun125_r1.setRotationPoint(0.0F, -7.1547F, -23.8826F);
		gun.addChild(gun125_r1);
		setRotationAngle(gun125_r1, -0.632F, 0.0F, 0.0F);
		

		gun114_r1 = new ModelRenderer(this);
		gun114_r1.setRotationPoint(24.9379F, -13.3948F, 0.0F);
		gun.addChild(gun114_r1);
		setRotationAngle(gun114_r1, 0.0F, 0.0F, -0.7854F);
		gun114_r1.cubeList.add(new ModelBox(gun114_r1, 54, 25, -3.7F, -36.8F, -22.7F, 1, 1, 1, 0.0F, false));
		gun114_r1.cubeList.add(new ModelBox(gun114_r1, 28, 29, -3.7F, -36.8F, -22.0F, 1, 1, 24, 0.0F, false));

		gun112_r1 = new ModelRenderer(this);
		gun112_r1.setRotationPoint(-38.6041F, -21.9698F, 0.0F);
		gun.addChild(gun112_r1);
		setRotationAngle(gun112_r1, 0.0F, 0.0F, 1.2269F);
		gun112_r1.cubeList.add(new ModelBox(gun112_r1, 45, 17, -3.7F, -40.4F, -22.7F, 1, 2, 2, 0.0F, false));

		gun94_r1 = new ModelRenderer(this);
		gun94_r1.setRotationPoint(24.3194F, -11.6281F, 0.0F);
		gun.addChild(gun94_r1);
		setRotationAngle(gun94_r1, 0.0F, 0.0F, -0.8551F);
		gun94_r1.cubeList.add(new ModelBox(gun94_r1, 12, 55, -0.6F, -32.5F, -16.0F, 1, 1, 1, 0.0F, false));
		gun94_r1.cubeList.add(new ModelBox(gun94_r1, 32, 56, -0.6F, -32.5F, -15.5F, 1, 1, 1, 0.0F, false));

		gun93_r1 = new ModelRenderer(this);
		gun93_r1.setRotationPoint(22.5192F, -9.2489F, 0.0F);
		gun.addChild(gun93_r1);
		setRotationAngle(gun93_r1, 0.0F, 0.0F, -0.7436F);
		gun93_r1.cubeList.add(new ModelBox(gun93_r1, 26, 56, -0.6F, -33.5F, -16.0F, 1, 1, 1, 0.0F, false));
		gun93_r1.cubeList.add(new ModelBox(gun93_r1, 56, 54, -0.6F, -33.5F, -15.5F, 1, 1, 1, 0.0F, false));

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(8.948F, 0.0F, -6.4526F);
		gun.addChild(gun82_r1);
		setRotationAngle(gun82_r1, 0.0F, 0.7436F, 0.0F);
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 27, 40, -3.8F, -34.3F, -14.7F, 1, 2, 1, 0.0F, false));

		gun81_r1 = new ModelRenderer(this);
		gun81_r1.setRotationPoint(8.542F, 0.0F, -6.6428F);
		gun.addChild(gun81_r1);
		setRotationAngle(gun81_r1, 0.0F, 0.7808F, 0.0F);
		gun81_r1.cubeList.add(new ModelBox(gun81_r1, 33, 40, -3.8F, -34.3F, -13.7F, 1, 2, 1, 0.0F, false));

		gun77_r1 = new ModelRenderer(this);
		gun77_r1.setRotationPoint(24.5774F, -14.6619F, 0.0F);
		gun.addChild(gun77_r1);
		setRotationAngle(gun77_r1, 0.0F, 0.0F, -0.8551F);
		gun77_r1.cubeList.add(new ModelBox(gun77_r1, 52, 54, -3.8F, -34.3F, -21.4F, 1, 1, 10, 0.0F, false));

		gun68_r1 = new ModelRenderer(this);
		gun68_r1.setRotationPoint(0.0F, -57.2984F, -20.6015F);
		gun.addChild(gun68_r1);
		setRotationAngle(gun68_r1, -2.3423F, 0.0F, 0.0F);
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 79, 71, -3.0F, -33.0F, 1.8F, 3, 2, 4, 0.0F, false));

		gun67_r1 = new ModelRenderer(this);
		gun67_r1.setRotationPoint(0.0F, -57.932F, -21.4691F);
		gun.addChild(gun67_r1);
		setRotationAngle(gun67_r1, -2.3423F, 0.0F, 0.0F);
		gun67_r1.cubeList.add(new ModelBox(gun67_r1, 80, 14, -3.31F, -33.5F, 1.5F, 3, 2, 4, 0.0F, false));
		gun67_r1.cubeList.add(new ModelBox(gun67_r1, 27, 40, -0.69F, -33.5F, 1.5F, 1, 2, 4, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(0.0F, 1.0684F, -12.7485F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 39, 45, -2.0F, -30.2F, -8.95F, 1, 2, 1, 0.0F, false));

		gun62_r1 = new ModelRenderer(this);
		gun62_r1.setRotationPoint(0.0F, -3.5062F, 7.7871F);
		gun.addChild(gun62_r1);
		setRotationAngle(gun62_r1, 0.2603F, 0.0F, 0.0F);
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 32, 46, -2.0F, -31.5F, -9.5F, 1, 2, 1, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(0.0F, -34.7751F, 18.5973F);
		gun.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.9955F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 39, 35, -3.49F, -34.5F, -22.7F, 4, 2, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(0.0F, -58.1507F, -32.7773F);
		gun.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.7884F, 0.0F, 0.0F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 0, 72, -3.499F, -32.0F, -11.2F, 4, 1, 3, 0.0F, false));

		gun49_r1 = new ModelRenderer(this);
		gun49_r1.setRotationPoint(0.0F, -42.9635F, 9.8897F);
		gun.addChild(gun49_r1);
		setRotationAngle(gun49_r1, 1.3756F, 0.0F, 0.0F);
		gun49_r1.cubeList.add(new ModelBox(gun49_r1, 13, 27, -4.0F, -27.65F, -21.2F, 5, 8, 1, 0.0F, false));
		gun49_r1.cubeList.add(new ModelBox(gun49_r1, 27, 35, -3.5F, -28.1F, -21.2F, 4, 3, 1, 0.0F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(-10.2617F, -39.6273F, 9.2301F);
		gun.addChild(bone_r1);
		setRotationAngle(bone_r1, 1.4029F, -0.1001F, -0.5327F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 52, 54, 0.0F, -27.6563F, -20.2F, 1, 8, 1, 0.0F, false));

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(9.8332F, -38.1114F, 8.9304F);
		gun.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 1.4029F, 0.1001F, 0.5327F);
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 6, 27, -4.0F, -27.6563F, -20.2F, 1, 8, 1, 0.0F, false));

		bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(0.0F, 5.3138F, -14.6885F);
		gun.addChild(bone3_r1);
		setRotationAngle(bone3_r1, -0.4221F, 0.0F, 0.0F);
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 13, 36, -3.49F, -29.1057F, -20.1985F, 4, 1, 1, 0.0F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(0.0F, -61.6081F, -11.0223F);
		gun.addChild(gun30_r1);
		setRotationAngle(gun30_r1, 2.6769F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 64, 58, -3.0F, -29.5F, -12.8F, 3, 3, 1, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(0.0F, -48.8408F, -32.3815F);
		gun.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.8256F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 54, 50, -3.0F, -27.0F, -12.3F, 3, 2, 1, 0.0F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(0.0F, -15.7374F, 18.3016F);
		gun.addChild(gun21_r1);
		setRotationAngle(gun21_r1, 0.8923F, 0.0F, 0.0F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 0, 45, -3.0F, -27.0F, -7.3F, 3, 1, 2, 0.0F, false));

		gun17_r1 = new ModelRenderer(this);
		gun17_r1.setRotationPoint(0.0F, -55.576F, 10.474F);
		gun.addChild(gun17_r1);
		setRotationAngle(gun17_r1, 2.3423F, 0.0F, 0.0F);
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 12, 45, -3.0F, -30.0F, -6.5F, 3, 1, 2, 0.0F, false));
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