package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DragunovHandguard extends ModelWithAttachments {
	private final QRenderer handguard;
	private final ModelRenderer gun251_r1;
	private final ModelRenderer gun267_r1;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;
	private final ModelRenderer cube_r67;
	private final ModelRenderer cube_r68;
	private final ModelRenderer cube_r69;
	private final ModelRenderer cube_r70;
	private final ModelRenderer cube_r71;
	private final ModelRenderer cube_r72;
	private final ModelRenderer cube_r73;
	private final ModelRenderer cube_r74;
	private final ModelRenderer cube_r75;
	private final ModelRenderer cube_r76;
	private final ModelRenderer cube_r77;
	private final ModelRenderer cube_r78;
	private final ModelRenderer cube_r79;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
	private final ModelRenderer cube_r87;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer cube_r90;
	private final ModelRenderer cube_r91;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;
	private final ModelRenderer cube_r94;
	private final ModelRenderer cube_r95;
	private final ModelRenderer cube_r96;

	public DragunovHandguard() {
		textureWidth = 350;
		textureHeight = 350;

		handguard = new QRenderer(this);
		handguard.setRotationPoint(0.0F, -15.0F, -44.8F);
		handguard.cubeList.add(new ModelBox(handguard, 0, 220, -2.0F, -2.5F, -41.5F, 1, 1, 35, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 181, 130, -2.5F, -0.7F, -41.5F, 2, 6, 35, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 14, 51, -2.5F, 5.9F, 0.7F, 2, 1, 1, 0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 71, 20, -2.2F, -1.9F, -6.5F, 2, 1, 7, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 113, 10, -2.8F, -1.9F, -6.5F, 1, 1, 7, 0.002F, false));
		handguard.cubeList.add(new ModelBox(handguard, 25, 16, -2.5F, -1.5F, 0.7F, 2, 1, 1, 0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 104, 177, -2.3F, -1.0F, -52.1F, 1, 1, 11, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 61, 155, -1.7F, -1.0F, -52.1F, 1, 1, 11, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 137, 20, -2.15F, -1.15F, -47.1F, 1, 1, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 93, 23, -2.0F, -1.5F, -42.1F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 93, 21, -2.2F, -1.4F, -42.1F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 21, 93, -1.8F, -1.4F, -42.1F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 93, 19, -1.5F, -1.0F, -42.1F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 93, 13, -1.6F, -1.2F, -42.1F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 93, 11, -2.4F, -1.2F, -42.1F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 10, 93, -2.5F, -1.0F, -42.1F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 93, 9, -2.4F, -0.8F, -42.1F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 93, 4, -2.2F, -0.6F, -42.1F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 93, 2, -2.0F, -0.5F, -42.1F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 93, 0, -1.8F, -0.6F, -42.1F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 93, -1.6F, -0.8F, -42.1F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 137, 7, -2.0F, -1.4F, -52.2F, 1, 1, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 137, 0, -1.6F, -1.0F, -52.201F, 1, 1, 6, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 136, 113, -2.4F, -1.0F, -52.201F, 1, 1, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 92, 91, -2.0F, 2.5F, -41.6F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 92, 44, -1.8F, 2.4F, -41.6F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 91, 88, -1.6F, 2.2F, -41.6F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 88, 44, -1.5F, 2.0F, -41.6F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 80, 87, -1.6F, 1.8F, -41.6F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 74, 87, -1.8F, 1.6F, -41.6F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 68, 87, -2.0F, 1.5F, -41.6F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 62, 87, -2.2F, 1.6F, -41.6F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 56, 87, -2.4F, 1.8F, -41.6F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 50, 87, -2.5F, 2.0F, -41.6F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 40, 87, -2.4F, 2.2F, -41.6F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 29, 87, -2.2F, 2.4F, -41.6F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 87, 22, -2.001F, 0.1F, -41.5F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 87, 25, -2.0F, 0.5F, -42.1F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 66, 122, -1.8F, -1.0F, -52.1F, 1, 1, 4, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 136, 106, -2.002F, -0.6F, -52.2F, 1, 1, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 122, 44, -2.201F, -1.0F, -52.101F, 1, 1, 4, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 136, 95, -2.0F, -1.3F, -47.1F, 1, 1, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 136, 88, -2.0F, -0.7F, -47.1F, 1, 1, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 136, 69, -2.25F, -0.75F, -52.2F, 1, 1, 6, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 136, 62, -1.75F, -0.75F, -52.2F, 1, 1, 6, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 136, 50, -1.75F, -1.25F, -52.2F, 1, 1, 6, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 136, 43, -2.25F, -1.25F, -52.2F, 1, 1, 6, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 43, 136, -1.85F, -1.15F, -47.1F, 1, 1, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 19, 136, -1.85F, -0.85F, -47.1F, 1, 1, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 136, -2.15F, -0.85F, -47.1F, 1, 1, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 43, 177, -2.15F, 2.05F, -82.1F, 1, 1, 41, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 88, 174, -1.85F, 2.05F, -82.1F, 1, 1, 41, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 138, 172, -1.85F, 1.75F, -82.1F, 1, 1, 41, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 120, 135, -2.25F, 1.65F, -56.2F, 1, 1, 6, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 88, 135, -1.75F, 1.65F, -56.2F, 1, 1, 6, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 44, 124, -1.75F, 2.15F, -56.2F, 1, 1, 6, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 19, 123, -2.25F, 2.15F, -56.2F, 1, 1, 6, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 138, 130, -2.0F, 2.2F, -82.1F, 1, 1, 41, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 137, 0, -2.0F, 1.6F, -82.1F, 1, 1, 41, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 112, 122, -2.002F, 2.3F, -56.2F, 1, 1, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 121, 30, -2.4F, 1.9F, -56.201F, 1, 1, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 121, -1.6F, 1.9F, -56.201F, 1, 1, 6, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 92, 119, -2.0F, 1.5F, -56.2F, 1, 1, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 136, 88, -2.15F, 1.75F, -82.1F, 1, 1, 41, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 136, 43, -1.7F, 1.9F, -82.1F, 1, 1, 41, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 136, -2.3F, 1.9F, -82.1F, 1, 1, 41, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 42, 178, -1.65F, 2.25F, -97.2F, 1, 1, 16, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 178, -1.5F, 1.9F, -97.201F, 1, 1, 16, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 86, 177, -1.65F, 1.55F, -97.2F, 1, 1, 16, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 131, 174, -2.002F, 2.4F, -97.2F, 1, 1, 16, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 88, 155, -2.35F, 2.25F, -97.2F, 1, 1, 16, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 43, 155, -2.5F, 1.9F, -97.201F, 1, 1, 16, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 155, -2.35F, 1.55F, -97.2F, 1, 1, 16, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 138, 149, -2.0F, 1.4F, -97.2F, 1, 1, 16, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 58, 0, -2.2F, -2.4F, -84.6F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 13, 78, -2.2F, -1.4F, -84.6F, 1, 4, 1, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 78, -1.8F, -1.4F, -84.6F, 1, 4, 1, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 58, -1.8F, -2.4F, -84.6F, 1, 2, 3, 0.001F, false));

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(-1.8F, -2.4F, -81.6F);
		handguard.addChild(gun251_r1);
		setRotationAngle(gun251_r1, -1.2566F, 0.0F, 0.0F);
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 121, 63, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
		gun251_r1.cubeList.add(new ModelBox(gun251_r1, 121, 71, -0.4F, 0.0F, 0.0F, 1, 1, 5, -0.001F, false));

		gun267_r1 = new ModelRenderer(this);
		gun267_r1.setRotationPoint(-1.0F, -1.4F, -52.2F);
		handguard.addChild(gun267_r1);
		setRotationAngle(gun267_r1, -0.7505F, 0.0F, 0.0F);
		gun267_r1.cubeList.add(new ModelBox(gun267_r1, 25, 0, -1.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-2.0F, -2.5F, -6.5F);
		handguard.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0F, 0.0F, 0.8901F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 92, 216, 0.0F, 0.0F, -35.0F, 1, 1, 35, 0.0F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(-2.8F, -1.9F, -6.5F);
		handguard.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, 0.0F, 0.4538F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 93, 0.0F, 0.0F, -35.0F, 1, 1, 42, 0.0F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(-3.47F, 3.0F, 0.5F);
		handguard.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.0F, 0.0F, -0.3316F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 48, 91, 0.0F, 0.0F, -42.0F, 1, 2, 42, 0.0F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(-3.97F, 2.0F, 0.5F);
		handguard.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.0022F, 0.0107F, -1.256F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 56, 44, 0.2F, 0.2F, 0.2F, 3, 1, 1, 0.2F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 93, 28, 2.7F, 0.2F, 0.2F, 1, 1, 1, 0.201F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(-4.27F, 5.1F, 0.5F);
		handguard.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.0082F, 0.0073F, -0.6102F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 87, 33, 0.2F, 0.2F, 0.2F, 1, 2, 1, 0.2F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(1.27F, 5.1F, 0.5F);
		handguard.addChild(cube_r67);
		setRotationAngle(cube_r67, 0.0082F, -0.0073F, 0.6102F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 87, 38, -1.2F, 0.2F, 0.2F, 1, 2, 1, 0.2F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(0.97F, 2.0F, 0.5F);
		handguard.addChild(cube_r68);
		setRotationAngle(cube_r68, 0.0022F, -0.0107F, 1.256F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 30, 93, -3.7F, 0.2F, 0.2F, 1, 1, 1, 0.201F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 10, 64, -3.2F, 0.2F, 0.2F, 3, 1, 1, 0.2F, false));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(-3.87F, 2.9F, 0.5F);
		handguard.addChild(cube_r69);
		setRotationAngle(cube_r69, 0.011F, 0.0001F, 0.1053F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 93, 30, 0.0F, -0.7F, 0.2F, 1, 1, 1, 0.201F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 87, 30, 0.0F, 0.0F, 0.2F, 1, 2, 1, 0.2F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(0.87F, 2.9F, 0.5F);
		handguard.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.011F, -0.0001F, -0.1053F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 93, 32, -1.0F, -0.7F, 0.2F, 1, 1, 1, 0.201F, false));
		cube_r70.cubeList.add(new ModelBox(cube_r70, 91, 57, -1.0F, 0.0F, 0.2F, 1, 2, 1, 0.2F, false));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(1.07F, 2.9F, 0.5F);
		handguard.addChild(cube_r71);
		setRotationAngle(cube_r71, 0.011F, 0.069F, -0.0348F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 113, 63, -1.0F, 0.0F, -6.0F, 1, 2, 6, 0.001F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(1.13F, 4.9F, 0.5F);
		handguard.addChild(cube_r72);
		setRotationAngle(cube_r72, 0.0503F, 0.0485F, 0.6119F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 113, 52, -1.0F, 0.0F, -6.0F, 1, 2, 6, 0.001F, false));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(-4.13F, 4.9F, 0.5F);
		handguard.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.0503F, -0.0485F, -0.6119F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 113, 71, 0.0F, 0.0F, -6.0F, 1, 2, 6, 0.001F, false));

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(-4.07F, 2.9F, 0.5F);
		handguard.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.011F, -0.069F, 0.0348F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 113, 91, 0.0F, 0.0F, -6.0F, 1, 2, 6, 0.001F, false));

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(-4.07F, 2.9F, 0.5F);
		handguard.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.0269F, -0.0454F, -0.2795F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 180, 0, 0.0F, 0.0F, -15.0F, 1, 2, 15, 0.001F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(-4.07F, 2.9F, 0.5F);
		handguard.addChild(cube_r76);
		setRotationAngle(cube_r76, -0.0953F, -0.0454F, -0.2795F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 149, 174, 0.0F, 1.7F, -13.7F, 1, 2, 14, 0.0F, false));

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(-2.5F, 7.25F, 0.5F);
		handguard.addChild(cube_r77);
		setRotationAngle(cube_r77, -0.1021F, -0.0698F, -0.5534F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 93, 0, 0.0F, -1.0F, -18.0F, 1, 1, 18, 0.0F, false));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(1.07F, 2.9F, 0.5F);
		handguard.addChild(cube_r78);
		setRotationAngle(cube_r78, -0.0953F, 0.0454F, 0.2795F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 181, 145, -1.0F, 1.7F, -13.7F, 1, 2, 14, 0.0F, false));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(1.07F, 2.9F, 0.5F);
		handguard.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.0269F, 0.0454F, 0.2795F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 180, 17, -1.0F, 0.0F, -15.0F, 1, 2, 15, 0.001F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(-4.07F, 1.9F, 0.5F);
		handguard.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.0133F, -0.0511F, 0.0F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 136, 88, 0.0F, 0.0F, -17.0F, 1, 1, 17, 0.0F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(-3.25F, -1.0F, 0.5F);
		handguard.addChild(cube_r81);
		setRotationAngle(cube_r81, -0.0013F, -0.0528F, 0.2792F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 0, 113, 0.0F, 0.0F, -17.0F, 1, 3, 17, 0.0F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(1.07F, 1.9F, 0.5F);
		handguard.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0133F, 0.0511F, 0.0F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 136, 106, -1.0F, 0.0F, -17.0F, 1, 1, 17, 0.0F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(0.25F, -1.0F, 0.5F);
		handguard.addChild(cube_r83);
		setRotationAngle(cube_r83, -0.0013F, 0.0528F, -0.2792F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 88, 135, -1.0F, 0.0F, -17.0F, 1, 3, 17, 0.0F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.47F, 3.0F, 0.5F);
		handguard.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.0F, 0.0F, 0.3316F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 92, 88, -1.0F, 0.0F, -42.0F, 1, 2, 42, 0.0F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(-3.57F, 2.0F, 0.5F);
		handguard.addChild(cube_r85);
		setRotationAngle(cube_r85, 0.0F, 0.0F, -0.1047F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 46, 68, 0.0F, 0.0F, -18.0F, 2, 1, 18, 0.0F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 121, 82, 0.0F, 0.0F, -24.0F, 2, 1, 3, 0.0F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 32, 118, 0.0F, 0.0F, -30.0F, 2, 1, 3, 0.0F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 113, 0, 0.0F, 0.0F, -42.0F, 2, 1, 9, 0.0F, false));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(-3.22F, -1.0F, -24.5F);
		handguard.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.0F, 0.0F, 0.1222F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 179, 58, 0.0F, 2.0F, -11.0F, 2, 1, 15, 0.0F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 0, 93, 0.0F, 0.0F, -17.0F, 2, 3, 6, 0.0F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 113, 38, 0.0F, 1.0F, -8.0F, 2, 1, 3, 0.0F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 179, 42, 0.0F, 0.0F, -11.0F, 2, 1, 15, 0.0F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 103, 38, 0.0F, 1.0F, -2.0F, 2, 1, 3, 0.0F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 0, 0, 0.0F, 0.0F, 4.0F, 2, 3, 21, 0.0F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(0.57F, 2.0F, -30.5F);
		handguard.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0F, 0.0F, 0.1047F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 19, 113, -2.0F, 0.0F, -11.0F, 2, 1, 9, 0.0F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 123, 38, -2.0F, 0.0F, 1.0F, 2, 1, 3, 0.0F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 124, 58, -2.0F, 0.0F, 7.0F, 2, 1, 3, 0.0F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 91, 63, -2.0F, 0.0F, 13.0F, 2, 1, 18, 0.0F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(-3.47F, 2.0F, -16.5F);
		handguard.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.0F, 0.0F, -0.1047F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 138, 132, 0.0F, 0.0F, -16.0F, 2, 1, 16, 0.0F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(-3.07F, -1.0F, -20.5F);
		handguard.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.0F, 0.0F, 0.1222F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 92, 91, 0.0F, 0.0F, -17.0F, 2, 3, 17, 0.0F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(0.47F, 2.0F, -16.5F);
		handguard.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0F, 0.0F, 0.1047F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 48, 0, -2.0F, 0.0F, -19.0F, 2, 1, 19, 0.0F, false));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(-0.2F, -1.9F, -6.5F);
		handguard.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.0F, 0.0F, -0.4538F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 93, 0, -1.0F, 0.0F, -35.0F, 1, 1, 42, 0.0F, false));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(-1.0F, -2.5F, -6.5F);
		handguard.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.0F, 0.0F, -0.8901F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 47, 219, -1.0F, 0.0F, -35.0F, 1, 1, 35, 0.0F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(-0.5F, 7.25F, 0.5F);
		handguard.addChild(cube_r93);
		setRotationAngle(cube_r93, -0.1021F, 0.0698F, 0.5534F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 93, 19, -1.0F, -1.0F, -18.0F, 1, 1, 18, 0.0F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(-1.0F, 7.25F, 0.5F);
		handguard.addChild(cube_r94);
		setRotationAngle(cube_r94, -0.1222F, 0.0F, 0.0F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 91, 44, -1.5F, -1.0F, -18.0F, 2, 1, 18, -0.001F, false));

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(0.22F, -1.0F, -24.5F);
		handguard.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.0F, 0.0F, -0.1222F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 179, 85, -2.0F, 0.0F, -11.0F, 2, 1, 15, 0.0F, false));
		cube_r95.cubeList.add(new ModelBox(cube_r95, 179, 101, -2.0F, 2.0F, -11.0F, 2, 1, 15, 0.0F, false));
		cube_r95.cubeList.add(new ModelBox(cube_r95, 124, 77, -2.0F, 1.0F, -2.0F, 2, 1, 3, 0.0F, false));
		cube_r95.cubeList.add(new ModelBox(cube_r95, 107, 135, -2.0F, 1.0F, -8.0F, 2, 1, 3, 0.0F, false));
		cube_r95.cubeList.add(new ModelBox(cube_r95, 93, 0, -2.0F, 0.0F, -17.0F, 2, 3, 6, 0.0F, false));
		cube_r95.cubeList.add(new ModelBox(cube_r95, 44, 93, -2.0F, 0.0F, 4.0F, 2, 3, 21, 0.0F, false));

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(0.07F, -1.0F, -20.5F);
		handguard.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.0F, 0.0F, -0.1222F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 0, 93, -2.0F, 0.0F, -17.0F, 2, 3, 17, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
