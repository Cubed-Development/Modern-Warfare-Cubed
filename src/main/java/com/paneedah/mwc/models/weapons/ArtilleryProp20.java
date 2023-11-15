package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ArtilleryProp20 extends ModelBase implements IModernModel {
	private final ModelRenderer ArtilleryProp;
	private final ModelRenderer gun;
	private final ModelRenderer Place2_r1;
	private final ModelRenderer FiringPin_r1;
	private final ModelRenderer ValveTwo2_r1;
	private final ModelRenderer Support5_r1;
	private final ModelRenderer Gunholder2_r1;
	private final ModelRenderer Gunholder1_r1;
	private final ModelRenderer MiddleDown5_r1;
	private final ModelRenderer MiddleDown4_r1;
	private final ModelRenderer MiddleDown3_r1;
	private final ModelRenderer LGround4_r1;
	private final ModelRenderer RGround4_r1;
	private final ModelRenderer Gun20_r1;
	private final ModelRenderer Gun10DirectionCorrector_r1;
	private final ModelRenderer Gun8DirectionCorrector_r1;
	private final ModelRenderer muzzle;
	private final ModelRenderer Muzzle14_r1;
	private final ModelRenderer Muzzle13_r1;
	private final ModelRenderer shield;
	private final ModelRenderer Shield4_r1;
	private final ModelRenderer ShieldOnGun_r1;
	private final ModelRenderer Wheel;

	public ArtilleryProp20() {
		textureWidth = 512;
		textureHeight = 512;

		ArtilleryProp = new ModelRenderer(this);
		ArtilleryProp.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 1.1845F, 5.6039F);
		ArtilleryProp.addChild(gun);
		gun.cubeList.add(new ModelBox(gun, 0, 0, -4.0F, -15.1845F, -2.6039F, 7, 2, 2, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -9.0F, -16.1845F, -0.6039F, 17, 5, 7, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -4.0F, -16.1845F, 6.3961F, 7, 4, 9, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -3.5F, -14.8845F, 15.1961F, 2, 2, 1, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, 0.5F, -14.8845F, 15.1961F, 2, 2, 1, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, 0.0F, -17.6845F, 14.8961F, 3, 5, 1, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -4.0F, -17.6845F, 14.8961F, 3, 5, 1, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -4.5F, -18.1845F, 14.3961F, 8, 2, 2, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -7.0F, -6.1845F, 6.3961F, 13, 2, 13, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -1.5F, -7.1845F, 11.8961F, 2, 1, 2, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -6.5F, -9.1845F, 11.8961F, 12, 2, 2, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -4.5F, -15.1845F, 12.5961F, 8, 2, 2, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -7.0F, -19.1845F, -0.6039F, 4, 1, 1, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 100, -8.0F, -20.1845F, -1.6039F, 3, 3, 1, 0.0F, true));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -8.0F, -21.1845F, 0.3961F, 5, 1, 1, 0.0F, true));

		Place2_r1 = new ModelRenderer(this);
		Place2_r1.setRotationPoint(0.0F, -0.4755F, 0.1737F);
		gun.addChild(Place2_r1);
		setRotationAngle(Place2_r1, 0.2269F, 0.0F, 0.0F);
		Place2_r1.cubeList.add(new ModelBox(Place2_r1, 0, 0, -4.0F, -25.0F, -7.0F, 1, 4, 10, 0.0F, true));
		Place2_r1.cubeList.add(new ModelBox(Place2_r1, 0, 0, 2.0F, -25.0F, -7.0F, 1, 4, 10, 0.0F, true));
		Place2_r1.cubeList.add(new ModelBox(Place2_r1, 0, 0, -2.8F, -24.0F, 3.5F, 2, 3, 2, 0.0F, true));
		Place2_r1.cubeList.add(new ModelBox(Place2_r1, 0, 0, -3.5F, -25.0F, 3.0F, 1, 5, 10, 0.0F, true));
		Place2_r1.cubeList.add(new ModelBox(Place2_r1, 0, 0, 1.5F, -25.0F, 3.0F, 1, 5, 10, 0.0F, true));
		Place2_r1.cubeList.add(new ModelBox(Place2_r1, 0, 0, -1.5F, -20.0F, 18.0F, 2, 1, 2, 0.0F, true));
		Place2_r1.cubeList.add(new ModelBox(Place2_r1, 0, 0, 1.0F, -25.0F, 3.0F, 1, 5, 60, 0.0F, true));
		Place2_r1.cubeList.add(new ModelBox(Place2_r1, 0, 0, -3.0F, -25.0F, 3.0F, 1, 5, 60, 0.0F, true));
		Place2_r1.cubeList.add(new ModelBox(Place2_r1, 0, 0, -3.0F, -21.0F, 3.0F, 5, 1, 60, 0.0F, true));
		Place2_r1.cubeList.add(new ModelBox(Place2_r1, 0, 0, -2.0F, -25.0F, -4.0F, 3, 1, 7, 0.0F, true));
		Place2_r1.cubeList.add(new ModelBox(Place2_r1, 0, 0, 1.0F, -25.0F, -7.0F, 1, 4, 10, 0.0F, true));
		Place2_r1.cubeList.add(new ModelBox(Place2_r1, 0, 0, -3.0F, -25.0F, -7.0F, 1, 4, 10, 0.0F, true));
		Place2_r1.cubeList.add(new ModelBox(Place2_r1, 0, 0, -4.0F, -21.0F, -7.0F, 7, 1, 10, 0.0F, true));
		Place2_r1.cubeList.add(new ModelBox(Place2_r1, 0, 0, -3.5F, -20.0F, 3.0F, 6, 4, 10, 0.0F, true));
		Place2_r1.cubeList.add(new ModelBox(Place2_r1, 0, 0, -3.0F, -25.0F, 3.0F, 5, 1, 60, 0.0F, true));

		FiringPin_r1 = new ModelRenderer(this);
		FiringPin_r1.setRotationPoint(0.0F, -0.4499F, -0.0513F);
		gun.addChild(FiringPin_r1);
		setRotationAngle(FiringPin_r1, 0.2269F, 0.0F, 0.0F);
		FiringPin_r1.cubeList.add(new ModelBox(FiringPin_r1, 0, 0, -5.0F, -24.0F, 0.0F, 1, 2, 1, 0.0F, true));

		ValveTwo2_r1 = new ModelRenderer(this);
		ValveTwo2_r1.setRotationPoint(0.0F, -12.8803F, -19.3023F);
		gun.addChild(ValveTwo2_r1);
		setRotationAngle(ValveTwo2_r1, -0.8203F, 0.0F, 0.0F);
		ValveTwo2_r1.cubeList.add(new ModelBox(ValveTwo2_r1, 0, 100, -9.0F, -21.6F, 6.6F, 1, 3, 3, 0.0F, true));

		Support5_r1 = new ModelRenderer(this);
		Support5_r1.setRotationPoint(0.0F, -4.2196F, -7.5686F);
		gun.addChild(Support5_r1);
		setRotationAngle(Support5_r1, -0.1571F, 0.0F, 0.0F);
		Support5_r1.cubeList.add(new ModelBox(Support5_r1, 0, 0, -6.5F, -14.0F, 18.3F, 2, 6, 2, 0.0F, true));
		Support5_r1.cubeList.add(new ModelBox(Support5_r1, 0, 0, 3.5F, -14.0F, 18.3F, 2, 6, 2, 0.0F, true));

		Gunholder2_r1 = new ModelRenderer(this);
		Gunholder2_r1.setRotationPoint(-6.8F, -1.2198F, -5.6039F);
		gun.addChild(Gunholder2_r1);
		setRotationAngle(Gunholder2_r1, 0.0F, 0.0F, 0.3491F);
		Gunholder2_r1.cubeList.add(new ModelBox(Gunholder2_r1, 200, 0, -3.8F, -19.3F, 12.5F, 2, 5, 2, 0.0F, true));

		Gunholder1_r1 = new ModelRenderer(this);
		Gunholder1_r1.setRotationPoint(6.5888F, -1.8173F, -5.6039F);
		gun.addChild(Gunholder1_r1);
		setRotationAngle(Gunholder1_r1, 0.0F, 0.0F, -0.3491F);
		Gunholder1_r1.cubeList.add(new ModelBox(Gunholder1_r1, 200, 0, 1.0F, -19.0F, 12.5F, 2, 5, 2, 0.0F, true));

		MiddleDown5_r1 = new ModelRenderer(this);
		MiddleDown5_r1.setRotationPoint(0.0F, 0.135F, -4.1776F);
		gun.addChild(MiddleDown5_r1);
		setRotationAngle(MiddleDown5_r1, 0.1222F, 0.0F, 0.0F);
		MiddleDown5_r1.cubeList.add(new ModelBox(MiddleDown5_r1, 0, 0, -4.0F, -11.0F, 11.5F, 7, 1, 9, 0.0F, true));

		MiddleDown4_r1 = new ModelRenderer(this);
		MiddleDown4_r1.setRotationPoint(-1.4997F, -1.1845F, -6.1238F);
		gun.addChild(MiddleDown4_r1);
		setRotationAngle(MiddleDown4_r1, 0.0F, 0.1222F, 0.0F);
		MiddleDown4_r1.cubeList.add(new ModelBox(MiddleDown4_r1, 0, 0, -5.0F, -15.0F, 11.0F, 3, 4, 9, 0.0F, true));

		MiddleDown3_r1 = new ModelRenderer(this);
		MiddleDown3_r1.setRotationPoint(1.4699F, -1.1845F, -5.6363F);
		gun.addChild(MiddleDown3_r1);
		setRotationAngle(MiddleDown3_r1, 0.0F, -0.1222F, 0.0F);
		MiddleDown3_r1.cubeList.add(new ModelBox(MiddleDown3_r1, 0, 0, 1.0F, -15.0F, 11.0F, 3, 4, 9, 0.0F, true));

		LGround4_r1 = new ModelRenderer(this);
		LGround4_r1.setRotationPoint(7.0626F, -1.1845F, -13.5496F);
		gun.addChild(LGround4_r1);
		setRotationAngle(LGround4_r1, 0.0F, 0.3491F, 0.0F);
		LGround4_r1.cubeList.add(new ModelBox(LGround4_r1, 0, 0, -21.0F, -6.0F, -39.0F, 8, 2, 8, 0.0F, true));
		LGround4_r1.cubeList.add(new ModelBox(LGround4_r1, 0, 0, -19.0F, -10.0F, -40.0F, 4, 4, 10, 0.0F, true));
		LGround4_r1.cubeList.add(new ModelBox(LGround4_r1, 0, 0, -19.0F, -14.0F, -4.0F, 4, 4, 11, 0.0F, true));
		LGround4_r1.cubeList.add(new ModelBox(LGround4_r1, 0, 0, -19.0F, -12.0F, -30.0F, 4, 4, 26, 0.0F, true));

		RGround4_r1 = new ModelRenderer(this);
		RGround4_r1.setRotationPoint(-7.3642F, -1.1845F, -11.8395F);
		gun.addChild(RGround4_r1);
		setRotationAngle(RGround4_r1, 0.0F, -0.3491F, 0.0F);
		RGround4_r1.cubeList.add(new ModelBox(RGround4_r1, 0, 0, 12.0F, -6.0F, -39.0F, 8, 2, 8, 0.0F, true));
		RGround4_r1.cubeList.add(new ModelBox(RGround4_r1, 0, 0, 14.0F, -10.0F, -40.0F, 4, 4, 10, 0.0F, true));
		RGround4_r1.cubeList.add(new ModelBox(RGround4_r1, 0, 0, 14.0F, -14.0F, -4.0F, 4, 4, 11, 0.0F, true));
		RGround4_r1.cubeList.add(new ModelBox(RGround4_r1, 0, 0, 14.0F, -12.0F, -30.0F, 4, 4, 26, 0.0F, true));

		Gun20_r1 = new ModelRenderer(this);
		Gun20_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(Gun20_r1);
		setRotationAngle(Gun20_r1, 0.2269F, 0.0F, 0.0F);
		Gun20_r1.cubeList.add(new ModelBox(Gun20_r1, 0, 0, -3.0F, -28.0F, -4.5F, 1, 1, 28, 0.0F, true));
		Gun20_r1.cubeList.add(new ModelBox(Gun20_r1, 0, 0, 1.0F, -28.0F, -6.5F, 1, 1, 30, 0.0F, true));
		Gun20_r1.cubeList.add(new ModelBox(Gun20_r1, 0, 0, 1.0F, -28.0F, 22.0F, 2, 4, 1, 0.0F, true));
		Gun20_r1.cubeList.add(new ModelBox(Gun20_r1, 0, 0, -4.0F, -28.0F, 22.0F, 2, 4, 1, 0.0F, true));
		Gun20_r1.cubeList.add(new ModelBox(Gun20_r1, 0, 0, 0.5F, -28.5F, -6.0F, 2, 2, 29, 0.0F, true));
		Gun20_r1.cubeList.add(new ModelBox(Gun20_r1, 0, 0, -3.0F, -28.0F, -2.8F, 5, 3, 24, 0.0F, true));
		Gun20_r1.cubeList.add(new ModelBox(Gun20_r1, 0, 0, -3.5F, -28.5F, -4.0F, 2, 2, 27, 0.0F, true));

		Gun10DirectionCorrector_r1 = new ModelRenderer(this);
		Gun10DirectionCorrector_r1.setRotationPoint(0.0F, -3.0179F, -10.5357F);
		gun.addChild(Gun10DirectionCorrector_r1);
		setRotationAngle(Gun10DirectionCorrector_r1, -0.2443F, 0.0F, 0.0F);
		Gun10DirectionCorrector_r1.cubeList.add(new ModelBox(Gun10DirectionCorrector_r1, 200, 0, -2.0F, -18.0F, 5.0F, 1, 5, 1, 0.0F, true));

		Gun8DirectionCorrector_r1 = new ModelRenderer(this);
		Gun8DirectionCorrector_r1.setRotationPoint(0.0F, -2.5065F, -9.3707F);
		gun.addChild(Gun8DirectionCorrector_r1);
		setRotationAngle(Gun8DirectionCorrector_r1, -0.2443F, 0.0F, 0.0F);
		Gun8DirectionCorrector_r1.cubeList.add(new ModelBox(Gun8DirectionCorrector_r1, 0, 0, 0.5F, -19.0F, 3.5F, 2, 5, 2, 0.0F, true));

		muzzle = new ModelRenderer(this);
		muzzle.setRotationPoint(0.0F, -1.7996F, -0.205F);
		gun.addChild(muzzle);
		

		Muzzle14_r1 = new ModelRenderer(this);
		Muzzle14_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		muzzle.addChild(Muzzle14_r1);
		setRotationAngle(Muzzle14_r1, 0.2269F, 0.0F, 0.0F);
		Muzzle14_r1.cubeList.add(new ModelBox(Muzzle14_r1, 0, 0, -3.0F, -21.0F, 70.0F, 5, 1, 1, 0.0F, true));

		Muzzle13_r1 = new ModelRenderer(this);
		Muzzle13_r1.setRotationPoint(0.0F, 1.3241F, 0.3787F);
		muzzle.addChild(Muzzle13_r1);
		setRotationAngle(Muzzle13_r1, 0.2269F, 0.0F, 0.0F);
		Muzzle13_r1.cubeList.add(new ModelBox(Muzzle13_r1, 0, 0, -3.0F, -25.0F, 70.0F, 5, 1, 1, 0.0F, true));
		Muzzle13_r1.cubeList.add(new ModelBox(Muzzle13_r1, 0, 0, -4.0F, -25.0F, 63.0F, 1, 1, 8, 0.0F, true));
		Muzzle13_r1.cubeList.add(new ModelBox(Muzzle13_r1, 0, 0, -4.0F, -21.0F, 63.0F, 1, 1, 8, 0.0F, true));
		Muzzle13_r1.cubeList.add(new ModelBox(Muzzle13_r1, 0, 0, -4.0F, -24.0F, 70.0F, 2, 3, 1, 0.0F, true));
		Muzzle13_r1.cubeList.add(new ModelBox(Muzzle13_r1, 0, 0, -4.0F, -24.0F, 66.5F, 1, 3, 2, 0.0F, true));
		Muzzle13_r1.cubeList.add(new ModelBox(Muzzle13_r1, 0, 0, 1.0F, -24.0F, 70.0F, 2, 3, 1, 0.0F, true));
		Muzzle13_r1.cubeList.add(new ModelBox(Muzzle13_r1, 0, 0, 2.0F, -24.0F, 66.5F, 1, 3, 2, 0.0F, true));
		Muzzle13_r1.cubeList.add(new ModelBox(Muzzle13_r1, 0, 0, -4.0F, -24.0F, 63.0F, 1, 3, 1, 0.0F, true));
		Muzzle13_r1.cubeList.add(new ModelBox(Muzzle13_r1, 0, 0, 2.0F, -24.0F, 63.0F, 1, 3, 1, 0.0F, true));
		Muzzle13_r1.cubeList.add(new ModelBox(Muzzle13_r1, 0, 0, 2.0F, -21.0F, 63.0F, 1, 1, 8, 0.0F, true));
		Muzzle13_r1.cubeList.add(new ModelBox(Muzzle13_r1, 0, 0, 2.0F, -25.0F, 63.0F, 1, 1, 8, 0.0F, true));
		Muzzle13_r1.cubeList.add(new ModelBox(Muzzle13_r1, 0, 0, -4.0F, -20.5F, 63.0F, 7, 1, 8, 0.0F, true));
		Muzzle13_r1.cubeList.add(new ModelBox(Muzzle13_r1, 0, 0, -4.0F, -25.5F, 63.0F, 7, 1, 8, 0.0F, true));

		shield = new ModelRenderer(this);
		shield.setRotationPoint(0.0F, 0.0F, 0.0F);
		ArtilleryProp.addChild(shield);
		shield.cubeList.add(new ModelBox(shield, 0, 0, 2.0F, -23.0F, 6.0F, 2, 1, 1, 0.0F, true));
		shield.cubeList.add(new ModelBox(shield, 0, 0, -5.0F, -23.0F, 6.0F, 2, 1, 1, 0.0F, true));
		shield.cubeList.add(new ModelBox(shield, 0, 0, -4.5F, -24.0F, 7.0F, 1, 2, 1, 0.0F, true));
		shield.cubeList.add(new ModelBox(shield, 0, 0, -4.5F, -24.0F, 5.0F, 1, 2, 1, 0.0F, true));
		shield.cubeList.add(new ModelBox(shield, 0, 0, -4.5F, -22.0F, 5.0F, 1, 2, 4, 0.0F, true));
		shield.cubeList.add(new ModelBox(shield, 0, 0, 2.5F, -24.0F, 7.0F, 1, 2, 1, 0.0F, true));
		shield.cubeList.add(new ModelBox(shield, 0, 0, 2.5F, -24.0F, 5.0F, 1, 2, 1, 0.0F, true));
		shield.cubeList.add(new ModelBox(shield, 0, 0, 2.5F, -22.0F, 5.0F, 1, 2, 4, 0.0F, true));
		shield.cubeList.add(new ModelBox(shield, 0, 0, -10.5F, -24.0F, 9.0F, 7, 8, 2, 0.0F, true));
		shield.cubeList.add(new ModelBox(shield, 0, 0, 2.5F, -24.0F, 9.0F, 7, 8, 2, 0.0F, true));
		shield.cubeList.add(new ModelBox(shield, 0, 0, 4.0F, -17.0F, 9.0F, 3, 2, 2, 0.0F, true));
		shield.cubeList.add(new ModelBox(shield, 0, 0, -8.0F, -17.0F, 9.0F, 3, 2, 2, 0.0F, true));

		Shield4_r1 = new ModelRenderer(this);
		Shield4_r1.setRotationPoint(0.0F, 0.7128F, 7.9948F);
		shield.addChild(Shield4_r1);
		setRotationAngle(Shield4_r1, 0.2443F, 0.0F, 0.0F);
		Shield4_r1.cubeList.add(new ModelBox(Shield4_r1, 0, 0, 2.5F, -33.2F, 6.9F, 12, 10, 2, 0.0F, true));
		Shield4_r1.cubeList.add(new ModelBox(Shield4_r1, 0, 0, -15.5F, -33.2F, 6.9F, 9, 10, 2, 0.0F, true));
		Shield4_r1.cubeList.add(new ModelBox(Shield4_r1, 0, 0, -6.5F, -33.2F, 6.9F, 2, 3, 2, 0.0F, true));
		Shield4_r1.cubeList.add(new ModelBox(Shield4_r1, 0, 0, -6.5F, -27.2F, 6.9F, 2, 4, 2, 0.0F, true));
		Shield4_r1.cubeList.add(new ModelBox(Shield4_r1, 0, 0, -4.5F, -33.2F, 6.9F, 1, 10, 2, 0.0F, true));
		Shield4_r1.cubeList.add(new ModelBox(Shield4_r1, 0, 0, 5.5F, -31.2F, 4.9F, 5, 5, 2, 0.0F, true));
		Shield4_r1.cubeList.add(new ModelBox(Shield4_r1, 0, 0, -13.5F, -29.2F, 4.9F, 2, 5, 2, 0.0F, true));

		ShieldOnGun_r1 = new ModelRenderer(this);
		ShieldOnGun_r1.setRotationPoint(0.0F, 0.7187F, 7.9465F);
		shield.addChild(ShieldOnGun_r1);
		setRotationAngle(ShieldOnGun_r1, 0.2443F, 0.0F, 0.0F);
		ShieldOnGun_r1.cubeList.add(new ModelBox(ShieldOnGun_r1, 0, 0, -3.0F, -33.5F, 7.3F, 5, 5, 2, 0.0F, true));

		Wheel = new ModelRenderer(this);
		Wheel.setRotationPoint(0.0F, 0.0F, 0.0F);
		ArtilleryProp.addChild(Wheel);
		Wheel.cubeList.add(new ModelBox(Wheel, 0, 0, -16.5F, -15.0F, 4.0F, 5, 9, 9, 0.0F, true));
		Wheel.cubeList.add(new ModelBox(Wheel, 0, 0, 10.5F, -15.0F, 4.0F, 5, 9, 9, 0.0F, true));
		Wheel.cubeList.add(new ModelBox(Wheel, 0, 0, -12.0F, -11.5F, 7.5F, 23, 2, 2, 0.0F, true));
		Wheel.cubeList.add(new ModelBox(Wheel, 250, 0, 11.0F, -18.0F, 3.0F, 4, 15, 11, 0.0F, true));
		Wheel.cubeList.add(new ModelBox(Wheel, 250, 0, 11.0F, -16.0F, 1.0F, 4, 11, 15, 0.0F, true));
		Wheel.cubeList.add(new ModelBox(Wheel, 250, 0, -16.0F, -18.0F, 3.0F, 4, 15, 11, 0.0F, true));
		Wheel.cubeList.add(new ModelBox(Wheel, 250, 0, -16.0F, -16.0F, 1.0F, 4, 11, 15, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ArtilleryProp.render(f5);
	}
}