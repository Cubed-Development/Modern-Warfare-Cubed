package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Albert01RSlide extends ModelWithAttachments {
	private final ModelRenderer slide;
	private final ModelRenderer gun195_r1;
	private final ModelRenderer gun193_r1;
	private final ModelRenderer gun189_r1;
	private final ModelRenderer gun188_r1;
	private final ModelRenderer gun187_r1;
	private final ModelRenderer gun183_r1;
	private final ModelRenderer gun182_r1;
	private final ModelRenderer gun180_r1;
	private final ModelRenderer gun179_r1;
	private final ModelRenderer gun154_r1;
	private final ModelRenderer gun153_r1;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun151_r1;
	private final ModelRenderer gun150_r1;
	private final ModelRenderer gun149_r1;
	private final ModelRenderer gun141_r1;
	private final ModelRenderer gun130_r1;
	private final ModelRenderer gun127_r1;
	private final ModelRenderer gun126_r1;
	private final ModelRenderer gun76_r1;
	private final ModelRenderer gun75_r1;
	private final ModelRenderer gun74_r1;
	private final ModelRenderer gun73_r1;
	private final ModelRenderer gun69_r1;
	private final ModelRenderer gun66_r1;
	private final ModelRenderer gun55_r1;
	private final ModelRenderer gun51_r1;
	private final ModelRenderer gun50_r1;

	public Albert01RSlide() {
		textureWidth = 512;
		textureHeight = 256;

		slide = new ModelRenderer(this);
		slide.setRotationPoint(0.0F, 24.0F, 0.0F);
		slide.cubeList.add(new ModelBox(slide, 100, 0, -2.8F, -38.0F, -10.5F, 2, 1, 11, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.0F, -23.5F, 1, 2, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -2.8F, -38.0F, -26.5F, 2, 4, 4, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.0F, -23.5F, 1, 2, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -3.5F, -36.0F, -26.5F, 3, 3, 3, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -0.5F, -36.0F, -26.5F, 1, 3, 3, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -0.3F, -36.0F, -8.5F, 1, 3, 9, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -1.2F, -38.0F, -10.5F, 1, 1, 11, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -1.2F, -38.0F, -26.5F, 1, 4, 4, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.8F, -23.5F, 1, 1, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.8F, -23.5F, 1, 1, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.8F, -3.0F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -34.0F, -3.0F, 1, 1, 5, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.8F, -3.0F, 1, 1, 5, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.0F, -3.0F, 1, 2, 5, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.0F, -4.5F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.0F, -7.5F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.0F, -9.0F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.0F, -6.0F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.0F, -4.5F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.0F, -7.5F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.0F, -9.0F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.0F, -6.0F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.8F, -9.0F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.8F, -6.0F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.8F, -4.5F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.8F, -7.5F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.8F, -4.5F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.8F, -7.5F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.8F, -6.0F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.8F, -9.0F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.2F, -35.8F, -22.0F, 1, 1, 19, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.2F, -35.0F, -22.0F, 1, 2, 19, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.2F, -35.0F, -22.0F, 1, 2, 19, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.2F, -35.8F, -22.0F, 1, 1, 19, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.8F, 1.0F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -34.5F, -2.0F, 1, 1, 3, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.8F, 0.5F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.0F, -34.8F, -2.0F, 1, 1, 3, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -36.8F, -14.5F, 1, 1, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -36.8F, -14.5F, 1, 1, 2, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.8F, -21.0F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.8F, -18.0F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.8F, -16.5F, 1, 1, 7, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.0F, -16.5F, 1, 2, 7, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.8F, -19.5F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.0F, -18.0F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.0F, -19.5F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, 0.3F, -35.0F, -21.0F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.0F, -16.5F, 1, 2, 7, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.8F, -16.5F, 1, 1, 7, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.8F, -19.5F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.8F, -21.0F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.8F, -18.0F, 1, 1, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.0F, -21.0F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.0F, -18.0F, 1, 2, 1, 0.0F, true));
		slide.cubeList.add(new ModelBox(slide, 100, 0, -4.3F, -35.0F, -19.5F, 1, 2, 1, 0.0F, true));

		gun195_r1 = new ModelRenderer(this);
		gun195_r1.setRotationPoint(0.0F, -0.4525F, -30.0997F);
		slide.addChild(gun195_r1);
		setRotationAngle(gun195_r1, -0.7808F, 0.0F, 0.0F);
		gun195_r1.cubeList.add(new ModelBox(gun195_r1, 100, 0, -4.3F, -36.8F, -14.5F, 1, 2, 1, 0.0F, true));
		gun195_r1.cubeList.add(new ModelBox(gun195_r1, 100, 0, 0.3F, -36.8F, -14.5F, 1, 2, 1, 0.0F, true));

		gun193_r1 = new ModelRenderer(this);
		gun193_r1.setRotationPoint(0.0F, 1.936F, -15.6647F);
		slide.addChild(gun193_r1);
		setRotationAngle(gun193_r1, -0.409F, 0.0F, 0.0F);
		gun193_r1.cubeList.add(new ModelBox(gun193_r1, 100, 0, 0.3F, -36.8F, -12.5F, 1, 1, 3, 0.0F, true));
		gun193_r1.cubeList.add(new ModelBox(gun193_r1, 100, 0, -4.3F, -36.8F, -12.5F, 1, 1, 3, 0.0F, true));

		gun189_r1 = new ModelRenderer(this);
		gun189_r1.setRotationPoint(0.0F, -68.3336F, -15.5099F);
		slide.addChild(gun189_r1);
		setRotationAngle(gun189_r1, -2.7512F, 0.0F, 0.0F);
		gun189_r1.cubeList.add(new ModelBox(gun189_r1, 100, 50, -4.6F, -35.7F, -1.0F, 1, 1, 2, 0.0F, true));

		gun188_r1 = new ModelRenderer(this);
		gun188_r1.setRotationPoint(0.0F, -16.5159F, -32.0953F);
		slide.addChild(gun188_r1);
		setRotationAngle(gun188_r1, -1.0038F, 0.0F, 0.0F);
		gun188_r1.cubeList.add(new ModelBox(gun188_r1, 100, 50, -4.0F, -37.5F, -1.0F, 1, 2, 2, 0.0F, true));

		gun187_r1 = new ModelRenderer(this);
		gun187_r1.setRotationPoint(-6.3572F, -68.8281F, 0.0F);
		slide.addChild(gun187_r1);
		setRotationAngle(gun187_r1, 0.0F, 0.0F, 2.8999F);
		gun187_r1.cubeList.add(new ModelBox(gun187_r1, 100, 0, 1.0F, -34.8F, -3.0F, 1, 1, 4, 0.0F, true));

		gun183_r1 = new ModelRenderer(this);
		gun183_r1.setRotationPoint(0.0F, -7.211F, -21.0537F);
		slide.addChild(gun183_r1);
		setRotationAngle(gun183_r1, -0.632F, 0.0F, 0.0F);
		gun183_r1.cubeList.add(new ModelBox(gun183_r1, 100, 0, 0.3F, -35.8F, 0.5F, 1, 2, 1, 0.0F, true));

		gun182_r1 = new ModelRenderer(this);
		gun182_r1.setRotationPoint(0.0F, -14.8854F, -31.1242F);
		slide.addChild(gun182_r1);
		setRotationAngle(gun182_r1, -1.0038F, 0.0F, 0.0F);
		gun182_r1.cubeList.add(new ModelBox(gun182_r1, 100, 0, 0.3F, -35.8F, -2.0F, 1, 1, 2, 0.0F, true));

		gun180_r1 = new ModelRenderer(this);
		gun180_r1.setRotationPoint(-21.8012F, -7.3247F, 0.0F);
		slide.addChild(gun180_r1);
		setRotationAngle(gun180_r1, 0.0F, 0.0F, 0.632F);
		gun180_r1.cubeList.add(new ModelBox(gun180_r1, 100, 50, 0.3F, -37.0F, -2.3F, 1, 1, 2, 0.0F, true));

		gun179_r1 = new ModelRenderer(this);
		gun179_r1.setRotationPoint(0.0F, -4.4953F, -18.8812F);
		slide.addChild(gun179_r1);
		setRotationAngle(gun179_r1, -0.5205F, 0.0F, 0.0F);
		gun179_r1.cubeList.add(new ModelBox(gun179_r1, 100, 50, -0.2F, -37.7F, -1.0F, 1, 2, 2, 0.0F, true));

		gun154_r1 = new ModelRenderer(this);
		gun154_r1.setRotationPoint(-23.0952F, -62.0336F, 0.0F);
		slide.addChild(gun154_r1);
		setRotationAngle(gun154_r1, 0.0F, 0.0F, 2.3562F);
		gun154_r1.cubeList.add(new ModelBox(gun154_r1, 100, 0, 1.3F, -35.5F, -23.5F, 1, 1, 21, 0.0F, true));
		gun154_r1.cubeList.add(new ModelBox(gun154_r1, 100, 0, 1.3F, -35.1F, 0.5F, 1, 1, 1, 0.0F, true));
		gun154_r1.cubeList.add(new ModelBox(gun154_r1, 100, 0, 1.3F, -35.8F, 0.5F, 1, 1, 1, 0.0F, true));
		gun154_r1.cubeList.add(new ModelBox(gun154_r1, 100, 0, 1.3F, -35.8F, -23.5F, 1, 1, 21, 0.0F, true));

		gun153_r1 = new ModelRenderer(this);
		gun153_r1.setRotationPoint(24.055F, -13.5261F, 0.0F);
		slide.addChild(gun153_r1);
		setRotationAngle(gun153_r1, 0.0F, 0.0F, -0.7854F);
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 100, 0, -4.0F, -35.8F, -23.5F, 1, 1, 24, 0.0F, true));
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 100, 0, -3.6F, -35.8F, 0.5F, 1, 1, 1, 0.0F, true));
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 100, 0, -4.3F, -35.8F, 0.5F, 1, 1, 1, 0.0F, true));
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 100, 0, -4.3F, -35.8F, -23.5F, 1, 1, 24, 0.0F, true));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(17.8324F, 0.0F, -14.5057F);
		slide.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.0F, 1.0038F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 100, 0, -4.3F, -35.8F, -23.5F, 2, 1, 1, 0.0F, true));
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 100, 0, -4.3F, -35.0F, -23.5F, 2, 2, 1, 0.0F, true));

		gun151_r1 = new ModelRenderer(this);
		gun151_r1.setRotationPoint(-8.8662F, 0.0F, -44.727F);
		slide.addChild(gun151_r1);
		setRotationAngle(gun151_r1, -3.1416F, -0.5019F, 3.1416F);
		gun151_r1.cubeList.add(new ModelBox(gun151_r1, 100, 0, 1.3F, -35.8F, -23.5F, 1, 1, 3, 0.0F, true));
		gun151_r1.cubeList.add(new ModelBox(gun151_r1, 100, 0, 1.3F, -35.0F, -23.5F, 1, 2, 3, 0.0F, true));

		gun150_r1 = new ModelRenderer(this);
		gun150_r1.setRotationPoint(-3.2772F, -71.7865F, 0.0F);
		slide.addChild(gun150_r1);
		setRotationAngle(gun150_r1, 0.0F, 0.0F, 3.0115F);
		gun150_r1.cubeList.add(new ModelBox(gun150_r1, 100, 0, 0.7F, -35.75F, -10.5F, 1, 1, 6, 0.0F, true));
		gun150_r1.cubeList.add(new ModelBox(gun150_r1, 100, 0, 0.7F, -35.75F, -5.0F, 1, 1, 6, 0.0F, true));
		gun150_r1.cubeList.add(new ModelBox(gun150_r1, 100, 0, 0.7F, -36.2F, -10.5F, 1, 1, 11, 0.0F, true));

		gun149_r1 = new ModelRenderer(this);
		gun149_r1.setRotationPoint(0.0F, -27.2276F, -32.7841F);
		slide.addChild(gun149_r1);
		setRotationAngle(gun149_r1, -1.2641F, 0.0F, 0.0F);
		gun149_r1.cubeList.add(new ModelBox(gun149_r1, 100, 0, -1.0F, -36.0F, 2.6F, 1, 1, 1, 0.0F, true));
		gun149_r1.cubeList.add(new ModelBox(gun149_r1, 100, 0, -3.0F, -36.0F, 2.6F, 1, 1, 1, 0.0F, true));
		gun149_r1.cubeList.add(new ModelBox(gun149_r1, 100, 0, -3.8F, -36.0F, 3.9F, 1, 1, 1, 0.0F, true));
		gun149_r1.cubeList.add(new ModelBox(gun149_r1, 100, 0, -0.2F, -36.0F, 3.9F, 1, 1, 1, 0.0F, true));
		gun149_r1.cubeList.add(new ModelBox(gun149_r1, 100, 0, -3.0F, -36.0F, 2.1F, 1, 1, 1, 0.0F, true));
		gun149_r1.cubeList.add(new ModelBox(gun149_r1, 100, 0, -1.0F, -36.0F, 2.1F, 1, 1, 1, 0.0F, true));
		gun149_r1.cubeList.add(new ModelBox(gun149_r1, 100, 0, -3.8F, -36.0F, 2.1F, 1, 2, 2, 0.0F, true));
		gun149_r1.cubeList.add(new ModelBox(gun149_r1, 100, 0, -0.2F, -36.0F, 2.1F, 1, 2, 2, 0.0F, true));

		gun141_r1 = new ModelRenderer(this);
		gun141_r1.setRotationPoint(0.0F, -13.4441F, -28.5045F);
		slide.addChild(gun141_r1);
		setRotationAngle(gun141_r1, -0.8551F, 0.0F, 0.0F);
		gun141_r1.cubeList.add(new ModelBox(gun141_r1, 100, 0, -1.2F, -38.0F, 0.5F, 1, 2, 1, 0.0F, true));
		gun141_r1.cubeList.add(new ModelBox(gun141_r1, 100, 0, -2.8F, -38.0F, 0.5F, 2, 2, 1, 0.0F, true));
		gun141_r1.cubeList.add(new ModelBox(gun141_r1, 100, 0, -1.0F, -38.0F, 1.0F, 1, 2, 2, 0.0F, true));
		gun141_r1.cubeList.add(new ModelBox(gun141_r1, 100, 0, -3.0F, -38.0F, 1.0F, 1, 2, 2, 0.0F, true));

		gun130_r1 = new ModelRenderer(this);
		gun130_r1.setRotationPoint(32.334F, -32.6475F, 0.0F);
		slide.addChild(gun130_r1);
		setRotationAngle(gun130_r1, 0.0F, 0.0F, -1.3756F);
		gun130_r1.cubeList.add(new ModelBox(gun130_r1, 100, 0, -3.45F, -36.0F, -5.0F, 1, 1, 6, 0.0F, true));
		gun130_r1.cubeList.add(new ModelBox(gun130_r1, 100, 0, -3.9F, -36.0F, -10.5F, 1, 1, 12, 0.0F, true));

		gun127_r1 = new ModelRenderer(this);
		gun127_r1.setRotationPoint(32.4614F, -33.7568F, 0.0F);
		slide.addChild(gun127_r1);
		setRotationAngle(gun127_r1, 0.0F, 0.0F, -1.4128F);
		gun127_r1.cubeList.add(new ModelBox(gun127_r1, 100, 0, -3.55F, -35.9F, -22.5F, 1, 1, 9, 0.0F, true));

		gun126_r1 = new ModelRenderer(this);
		gun126_r1.setRotationPoint(-4.8859F, -71.3903F, 0.0F);
		slide.addChild(gun126_r1);
		setRotationAngle(gun126_r1, 0.0F, 0.0F, 2.9743F);
		gun126_r1.cubeList.add(new ModelBox(gun126_r1, 100, 0, 0.55F, -35.9F, -22.5F, 1, 1, 9, 0.0F, true));

		gun76_r1 = new ModelRenderer(this);
		gun76_r1.setRotationPoint(-5.0352F, -71.9778F, 0.0F);
		slide.addChild(gun76_r1);
		setRotationAngle(gun76_r1, 0.0F, 0.0F, 2.9743F);
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 100, 0, 0.5F, -36.2F, -26.5F, 1, 1, 4, 0.0F, true));

		gun75_r1 = new ModelRenderer(this);
		gun75_r1.setRotationPoint(32.7998F, -33.9602F, 0.0F);
		slide.addChild(gun75_r1);
		setRotationAngle(gun75_r1, 0.0F, 0.0F, -1.4128F);
		gun75_r1.cubeList.add(new ModelBox(gun75_r1, 100, 0, -3.5F, -36.2F, -26.5F, 1, 1, 4, 0.0F, true));

		gun74_r1 = new ModelRenderer(this);
		gun74_r1.setRotationPoint(32.6023F, -33.7917F, 0.0F);
		slide.addChild(gun74_r1);
		setRotationAngle(gun74_r1, 0.0F, 0.0F, -1.4128F);
		gun74_r1.cubeList.add(new ModelBox(gun74_r1, 100, 0, -3.5F, -36.0F, -26.5F, 1, 1, 4, 0.0F, true));

		gun73_r1 = new ModelRenderer(this);
		gun73_r1.setRotationPoint(-5.0019F, -71.5806F, 0.0F);
		slide.addChild(gun73_r1);
		setRotationAngle(gun73_r1, 0.0F, 0.0F, 2.9743F);
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 100, 0, 0.5F, -36.0F, -26.5F, 1, 1, 4, 0.0F, true));

		gun69_r1 = new ModelRenderer(this);
		gun69_r1.setRotationPoint(-19.2688F, -3.6398F, 0.0F);
		slide.addChild(gun69_r1);
		setRotationAngle(gun69_r1, 0.0F, 0.0F, 0.5205F);
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 100, 0, -2.8F, -38.0F, -26.5F, 1, 1, 4, 0.0F, true));

		gun66_r1 = new ModelRenderer(this);
		gun66_r1.setRotationPoint(-33.5872F, -19.8523F, 0.0F);
		slide.addChild(gun66_r1);
		setRotationAngle(gun66_r1, 0.0F, 0.0F, 1.0782F);
		gun66_r1.cubeList.add(new ModelBox(gun66_r1, 100, 0, -0.2F, -38.0F, -26.5F, 1, 1, 4, 0.0F, true));

		gun55_r1 = new ModelRenderer(this);
		gun55_r1.setRotationPoint(32.6108F, -32.7106F, 0.0F);
		slide.addChild(gun55_r1);
		setRotationAngle(gun55_r1, 0.0F, 0.0F, -1.3756F);
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 100, 0, -3.6F, -36.1F, -10.5F, 1, 1, 11, 0.0F, true));

		gun51_r1 = new ModelRenderer(this);
		gun51_r1.setRotationPoint(-28.7452F, -12.9159F, 0.0F);
		slide.addChild(gun51_r1);
		setRotationAngle(gun51_r1, 0.0F, 0.0F, 0.8551F);
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 100, 0, -0.2F, -38.0F, -10.5F, 1, 1, 11, 0.0F, true));

		gun50_r1 = new ModelRenderer(this);
		gun50_r1.setRotationPoint(-25.3356F, -7.2756F, 0.0F);
		slide.addChild(gun50_r1);
		setRotationAngle(gun50_r1, 0.0F, 0.0F, 0.7064F);
		gun50_r1.cubeList.add(new ModelBox(gun50_r1, 100, 0, -2.8F, -38.0F, -10.5F, 1, 1, 11, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		slide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
