package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ACRPrecisionHandguard extends ModelWithAttachments {
	private final ModelRenderer Precision_Handguard;
	private final ModelRenderer ACR2_r2;
	private final ModelRenderer bone9_r6;
	private final ModelRenderer ACR110_r1;
	private final ModelRenderer bone8_r6;
	private final ModelRenderer handguard20_r1;
	private final ModelRenderer bone3_r6;
	private final ModelRenderer handguard17_r1;
	private final ModelRenderer bone2_r6;
	private final ModelRenderer bone5_r5;

	public ACRPrecisionHandguard() {
		textureWidth = 380;
		textureHeight = 380;

		Precision_Handguard = new ModelRenderer(this);
		Precision_Handguard.setRotationPoint(-1.5022F, -13.6515F, -46.4924F);
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 49, 0, 0.2022F, -4.5485F, -21.5076F, 1, 1, 19, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 0, 23, -1.1978F, -4.5485F, -21.5076F, 2, 1, 19, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 141, 46, 1.8022F, -1.7485F, -20.5076F, 1, 1, 44, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 92, 140, -2.7978F, -1.7485F, -20.5076F, 1, 1, 44, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 46, 139, -2.7978F, 0.5515F, -20.5076F, 1, 1, 44, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 0, 138, 1.8022F, 0.5515F, -20.5076F, 1, 1, 44, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 0, 0, -0.9978F, 2.3515F, -21.5076F, 2, 1, 45, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 47, 130, -1.0078F, 2.8515F, -20.5076F, 2, 1, 6, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 96, 10, -1.4978F, 1.8515F, 17.4924F, 3, 2, 5, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 123, 160, 0.6022F, 2.6515F, 20.4924F, 1, 1, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 103, 160, -1.5978F, 2.6515F, 20.4924F, 1, 1, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 246, 60, -2.4978F, -2.1485F, -2.5076F, 5, 3, 24, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 47, 93, -2.4978F, -2.1485F, -20.5076F, 1, 1, 18, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 0, 92, 1.5022F, -2.1485F, -20.5076F, 1, 1, 18, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 123, 123, 1.7922F, -0.7485F, -20.5076F, 1, 2, 3, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 136, 6, 1.7922F, -0.7485F, -13.5076F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 136, 0, 1.7922F, -0.7485F, -12.0076F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 135, 79, 1.7922F, -0.7485F, -9.5076F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 135, 59, 1.7922F, -0.7485F, -8.0076F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 134, 131, 1.7922F, -0.7485F, -3.0076F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 134, 125, 1.7922F, -0.7485F, 1.9924F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 134, 53, 1.7922F, -0.7485F, 3.4924F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 86, 160, 1.7912F, -1.2485F, 6.9924F, 1, 1, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 69, 160, 1.7912F, -1.2485F, -13.0076F, 1, 1, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 63, 160, 1.7912F, -1.2485F, -9.0076F, 1, 1, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 160, 28, 1.7912F, -1.2485F, 2.9924F, 1, 1, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 134, 47, 1.7922F, -0.7485F, 5.9924F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 115, 130, 1.7922F, -0.7485F, 7.4924F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 56, 120, 1.7922F, -0.7485F, 20.4924F, 1, 2, 3, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 107, 130, 1.7922F, -0.7485F, 12.4924F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 63, 130, 1.7922F, -0.7485F, 17.4924F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 56, 112, -2.8078F, -0.7485F, -20.5076F, 1, 2, 3, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 57, 130, -2.8078F, -0.7485F, -13.5076F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 25, 129, -2.8078F, -0.7485F, -12.0076F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 15, 129, -2.8078F, -0.7485F, -9.5076F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 129, 6, -2.8078F, -0.7485F, -8.0076F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 129, 0, -2.8078F, -0.7485F, -3.0076F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 127, 47, -2.8078F, -0.7485F, 1.9924F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 127, 31, -2.8078F, -0.7485F, 3.4924F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 160, 26, -2.8088F, -1.2485F, 6.9924F, 1, 1, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 23, 160, -2.8088F, -1.2485F, -13.0076F, 1, 1, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 17, 160, -2.8088F, -1.2485F, -9.0076F, 1, 1, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 148, 159, -2.8088F, -1.2485F, 2.9924F, 1, 1, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 126, 105, -2.8078F, -0.7485F, 5.9924F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 40, 124, -2.8078F, -0.7485F, 7.4924F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 9, 111, -2.8078F, -0.7485F, 20.4924F, 1, 2, 3, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 114, 123, -2.8078F, -0.7485F, 12.4924F, 1, 2, 1, 0.0F, false));
		Precision_Handguard.cubeList.add(new ModelBox(Precision_Handguard, 122, 67, -2.8078F, -0.7485F, 17.4924F, 1, 2, 1, 0.0F, false));

		ACR2_r2 = new ModelRenderer(this);
		ACR2_r2.setRotationPoint(-29.9886F, 20.86F, 46.4924F);
		Precision_Handguard.addChild(ACR2_r2);
		setRotationAngle(ACR2_r2, 0.0F, 0.0F, 0.9295F);
		ACR2_r2.cubeList.add(new ModelBox(ACR2_r2, 9, 116, -2.0F, -39.8F, -50.0F, 3, 1, 1, 0.0F, false));
		ACR2_r2.cubeList.add(new ModelBox(ACR2_r2, 47, 112, -2.0F, -39.8F, -67.0F, 1, 1, 17, 0.0F, false));
		ACR2_r2.cubeList.add(new ModelBox(ACR2_r2, 0, 111, 0.0F, -39.8F, -67.0F, 1, 1, 17, 0.0F, false));

		bone9_r6 = new ModelRenderer(this);
		bone9_r6.setRotationPoint(-39.0188F, 8.7642F, 43.7845F);
		Precision_Handguard.addChild(bone9_r6);
		setRotationAngle(bone9_r6, 0.0F, -0.3142F, 0.9295F);
		bone9_r6.cubeList.add(new ModelBox(bone9_r6, 94, 89, -1.7F, -39.8F, -50.0F, 2, 1, 1, 0.0F, false));
		bone9_r6.cubeList.add(new ModelBox(bone9_r6, 94, 72, -2.9361F, -39.8F, -53.8042F, 2, 1, 1, 0.0F, false));
		bone9_r6.cubeList.add(new ModelBox(bone9_r6, 79, 82, -4.1721F, -39.8F, -57.6085F, 2, 1, 1, 0.0F, false));
		bone9_r6.cubeList.add(new ModelBox(bone9_r6, 58, 82, -5.4082F, -39.8F, -61.4127F, 2, 1, 1, 0.0F, false));
		bone9_r6.cubeList.add(new ModelBox(bone9_r6, 34, 54, -7.5F, -39.8F, -66.168F, 3, 1, 2, 0.0F, false));

		ACR110_r1 = new ModelRenderer(this);
		ACR110_r1.setRotationPoint(31.7877F, 18.456F, 46.4924F);
		Precision_Handguard.addChild(ACR110_r1);
		setRotationAngle(ACR110_r1, 0.0F, 0.0F, -0.9295F);
		ACR110_r1.cubeList.add(new ModelBox(ACR110_r1, 105, 32, -4.0F, -39.8F, -50.0F, 3, 1, 1, 0.0F, false));
		ACR110_r1.cubeList.add(new ModelBox(ACR110_r1, 96, 18, -4.0F, -39.8F, -67.0F, 1, 1, 17, 0.0F, false));
		ACR110_r1.cubeList.add(new ModelBox(ACR110_r1, 96, 0, -2.2F, -39.8F, -67.0F, 1, 1, 17, 0.0F, false));

		bone8_r6 = new ModelRenderer(this);
		bone8_r6.setRotationPoint(40.73F, 6.478F, 42.8573F);
		Precision_Handguard.addChild(bone8_r6);
		setRotationAngle(bone8_r6, 0.0F, 0.3142F, -0.9295F);
		bone8_r6.cubeList.add(new ModelBox(bone8_r6, 105, 23, -3.7F, -39.8F, -50.0F, 3, 1, 1, 0.0F, false));
		bone8_r6.cubeList.add(new ModelBox(bone8_r6, 105, 5, -2.4639F, -39.8F, -53.8042F, 3, 1, 1, 0.0F, false));
		bone8_r6.cubeList.add(new ModelBox(bone8_r6, 72, 87, -1.2279F, -39.8F, -57.6085F, 3, 1, 1, 0.0F, false));
		bone8_r6.cubeList.add(new ModelBox(bone8_r6, 10, 62, 0.0082F, -39.8F, -61.4127F, 3, 1, 1, 0.0F, false));
		bone8_r6.cubeList.add(new ModelBox(bone8_r6, 34, 38, 1.5533F, -39.8F, -66.168F, 3, 1, 2, 0.0F, false));

		handguard20_r1 = new ModelRenderer(this);
		handguard20_r1.setRotationPoint(-28.1728F, -19.8127F, 46.4924F);
		Precision_Handguard.addChild(handguard20_r1);
		setRotationAngle(handguard20_r1, 0.0F, 0.0F, 2.3422F);
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 96, 0, -3.7F, -36.0F, -30.0F, 1, 3, 7, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 141, 94, -3.7F, -35.9F, -68.0F, 1, 1, 38, 0.0F, false));
		handguard20_r1.cubeList.add(new ModelBox(handguard20_r1, 178, 133, -3.7F, -33.9F, -67.0F, 1, 1, 37, 0.0F, false));

		bone3_r6 = new ModelRenderer(this);
		bone3_r6.setRotationPoint(-11.4553F, -3.5567F, 60.7641F);
		Precision_Handguard.addChild(bone3_r6);
		setRotationAngle(bone3_r6, 0.5934F, 0.0F, 2.3422F);
		bone3_r6.cubeList.add(new ModelBox(bone3_r6, 122, 18, -3.7F, -35.1118F, -31.1658F, 1, 2, 1, 0.0F, false));
		bone3_r6.cubeList.add(new ModelBox(bone3_r6, 122, 0, -3.7F, -37.3486F, -34.482F, 1, 2, 1, 0.0F, false));
		bone3_r6.cubeList.add(new ModelBox(bone3_r6, 119, 113, -3.7F, -39.5854F, -37.7981F, 1, 2, 1, 0.0F, false));
		bone3_r6.cubeList.add(new ModelBox(bone3_r6, 74, 119, -3.7F, -41.8222F, -41.1143F, 1, 2, 1, 0.0F, false));
		bone3_r6.cubeList.add(new ModelBox(bone3_r6, 66, 119, -3.7F, -44.0589F, -44.4304F, 1, 2, 1, 0.0F, false));
		bone3_r6.cubeList.add(new ModelBox(bone3_r6, 0, 119, -3.7F, -46.2957F, -47.7466F, 1, 2, 1, 0.0F, false));
		bone3_r6.cubeList.add(new ModelBox(bone3_r6, 116, 67, -3.7F, -48.5325F, -51.0627F, 1, 2, 1, 0.0F, false));
		bone3_r6.cubeList.add(new ModelBox(bone3_r6, 115, 18, -3.7F, -50.7692F, -54.3789F, 1, 2, 1, 0.0F, false));
		bone3_r6.cubeList.add(new ModelBox(bone3_r6, 115, 0, -3.7F, -53.006F, -57.695F, 1, 2, 1, 0.0F, false));
		bone3_r6.cubeList.add(new ModelBox(bone3_r6, 87, 114, -3.7F, -55.6901F, -61.6744F, 1, 2, 1, 0.0F, false));

		handguard17_r1 = new ModelRenderer(this);
		handguard17_r1.setRotationPoint(26.0832F, -21.966F, 46.4924F);
		Precision_Handguard.addChild(handguard17_r1);
		setRotationAngle(handguard17_r1, 0.0F, 0.0F, -2.3423F);
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 94, 67, -0.3F, -36.0F, -30.0F, 1, 3, 7, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 143, 0, -0.3F, -33.8F, -67.0F, 1, 1, 37, 0.0F, false));
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 138, 140, -0.3F, -35.9F, -68.0F, 1, 1, 38, 0.0F, false));

		bone2_r6 = new ModelRenderer(this);
		bone2_r6.setRotationPoint(10.0534F, -6.3755F, 59.8338F);
		Precision_Handguard.addChild(bone2_r6);
		setRotationAngle(bone2_r6, 0.5934F, 0.0F, -2.3423F);
		bone2_r6.cubeList.add(new ModelBox(bone2_r6, 32, 59, -0.3F, -35.9F, -29.9F, 1, 3, 1, 0.0F, false));
		bone2_r6.cubeList.add(new ModelBox(bone2_r6, 57, 20, -0.3F, -38.2F, -33.2162F, 1, 3, 1, 0.0F, false));
		bone2_r6.cubeList.add(new ModelBox(bone2_r6, 57, 0, -0.3F, -40.4F, -36.5323F, 1, 3, 1, 0.0F, false));
		bone2_r6.cubeList.add(new ModelBox(bone2_r6, 49, 39, -0.3F, -42.6F, -39.8485F, 1, 3, 1, 0.0F, false));
		bone2_r6.cubeList.add(new ModelBox(bone2_r6, 49, 33, -0.3F, -44.9F, -43.1646F, 1, 3, 1, 0.0F, false));
		bone2_r6.cubeList.add(new ModelBox(bone2_r6, 49, 13, -0.3F, -47.13F, -46.4808F, 1, 3, 1, 0.0F, false));
		bone2_r6.cubeList.add(new ModelBox(bone2_r6, 40, 46, -0.3F, -49.3F, -49.7969F, 1, 3, 1, 0.0F, false));
		bone2_r6.cubeList.add(new ModelBox(bone2_r6, 34, 46, -0.3F, -51.6F, -53.1131F, 1, 3, 1, 0.0F, false));
		bone2_r6.cubeList.add(new ModelBox(bone2_r6, 14, 46, -0.3F, -53.8F, -56.4292F, 1, 3, 1, 0.0F, false));
		bone2_r6.cubeList.add(new ModelBox(bone2_r6, 80, 114, -0.3F, -55.8618F, -60.4086F, 1, 2, 1, 0.0F, false));

		bone5_r5 = new ModelRenderer(this);
		bone5_r5.setRotationPoint(1.5022F, 7.2497F, 63.8886F);
		Precision_Handguard.addChild(bone5_r5);
		setRotationAngle(bone5_r5, 0.7854F, 0.0F, 0.0F);
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 138, 159, -4.311F, -37.1293F, -28.0707F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 159, 128, -4.311F, -35.7151F, -26.6565F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 159, 126, -4.311F, -37.0586F, -25.313F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 115, 159, -4.311F, -38.4728F, -26.7272F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 109, 159, -4.311F, -39.1799F, -27.4343F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 100, 159, -4.311F, -42.0083F, -30.2627F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 92, 159, -4.311F, -40.5941F, -31.677F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 83, 159, -4.311F, -37.7657F, -28.8485F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 77, 159, -4.311F, -41.3012F, -32.3841F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 159, 53, -4.311F, -44.1296F, -35.2125F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 159, 51, -4.311F, -45.5439F, -33.7983F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 159, 48, -4.311F, -42.7154F, -30.9698F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 159, 46, -4.311F, -47.3116F, -35.566F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 31, 159, -4.311F, -48.3723F, -36.6267F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 69, 158, -4.311F, -50.1401F, -38.3945F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 63, 158, -4.311F, -52.9685F, -41.2229F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 158, 33, -4.311F, -53.6756F, -41.93F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 148, 157, -4.311F, -56.504F, -44.7584F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 138, 157, -4.311F, -58.2718F, -46.5262F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 31, 157, -4.311F, -59.3324F, -47.5869F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 156, 152, -4.311F, -61.1002F, -49.3546F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 156, 150, -4.311F, -63.9286F, -52.1831F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 10, 156, -4.311F, -62.5144F, -53.5973F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 0, 156, -4.311F, -59.686F, -50.7688F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 78, 154, -4.311F, -57.9182F, -49.0011F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 25, 154, -4.311F, -56.8576F, -47.9404F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 10, 154, -4.311F, -55.0898F, -46.1726F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 0, 154, -4.311F, -52.2614F, -43.3442F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 153, 133, -4.311F, -51.5543F, -42.6371F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 131, 153, -4.311F, -48.7258F, -39.8087F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 153, 126, -4.311F, -46.9581F, -38.0409F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 123, 153, -4.311F, -45.8974F, -36.9803F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 119, 153, 0.289F, -37.1293F, -28.0707F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 102, 153, 0.289F, -35.7151F, -26.6565F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 77, 152, 0.289F, -37.0586F, -25.313F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 73, 152, 0.289F, -38.4728F, -26.7272F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 57, 152, 0.289F, -39.1799F, -27.4343F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 151, 103, 0.289F, -42.0083F, -30.2627F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 151, 72, 0.289F, -40.5941F, -31.677F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 151, 42, 0.289F, -37.7657F, -28.8485F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 32, 150, 0.289F, -41.3012F, -32.3841F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 148, 122, 0.289F, -44.1296F, -35.2125F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 84, 148, 0.289F, -45.5439F, -33.7983F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 77, 148, 0.289F, -42.7154F, -30.9698F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 70, 148, 0.289F, -47.3116F, -35.566F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 63, 148, 0.289F, -48.3723F, -36.6267F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 10, 147, 0.289F, -50.1401F, -38.3945F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 123, 143, 0.289F, -52.9685F, -41.2229F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 116, 143, 0.289F, -53.6756F, -41.93F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 109, 143, 0.289F, -56.504F, -44.7584F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 54, 143, 0.289F, -58.2718F, -46.5262F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 46, 143, 0.289F, -59.3324F, -47.5869F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 143, 4, 0.289F, -61.1002F, -49.3546F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 77, 142, 0.289F, -63.9286F, -52.1831F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 70, 142, 0.289F, -62.5144F, -53.5973F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 63, 142, 0.289F, -59.686F, -50.7688F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 8, 142, 0.289F, -57.9182F, -49.0011F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 0, 142, 0.289F, -56.8576F, -47.9404F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 141, 136, 0.289F, -55.0898F, -46.1726F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 141, 129, 0.289F, -52.2614F, -43.3442F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 141, 122, 0.289F, -51.5543F, -42.6371F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 136, 9, 0.289F, -48.7258F, -39.8087F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 136, 3, 0.289F, -46.9581F, -38.0409F, 1, 1, 1, 0.0F, false));
		bone5_r5.cubeList.add(new ModelBox(bone5_r5, 107, 135, 0.289F, -45.8974F, -36.9803F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Precision_Handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}