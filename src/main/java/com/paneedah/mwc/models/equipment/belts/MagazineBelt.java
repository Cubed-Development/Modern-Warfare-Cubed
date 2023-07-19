package com.paneedah.mwc.models.equipment.belts;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

/**
 * Made with Blockbench 4.7.4
 *
 * @author Designer: Braiam23
 * @author Developer: Desoroxx
 */
public class MagazineBelt extends ModelBiped implements IModernModel {
	
	private final ModelRenderer body;
	private final ModelRenderer belt;
	private final ModelRenderer belt_r1;
	private final ModelRenderer belt_r2;
	private final ModelRenderer belt_r3;
	private final ModelRenderer belt_r4;
	private final ModelRenderer holders;
	private final ModelRenderer holder_r1;
	private final ModelRenderer holder_r2;
	private final ModelRenderer holder_r3;
	private final ModelRenderer holder_r4;
	private final ModelRenderer holder_r5;
	private final ModelRenderer holder_r6;
	private final ModelRenderer magazines;
	private final ModelRenderer magazine_r1;
	private final ModelRenderer magazine_r2;
	private final ModelRenderer magazine_r3;
	private final ModelRenderer magazine_r4;
	private final ModelRenderer magazine_r5;
	private final ModelRenderer magazine_r6;
	private final ModelRenderer satchel;
	private final ModelRenderer button_r1;

	public MagazineBelt() {
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.cubeList.add(new ModelBox(body, 0, 16, -4, 0, -2, 8, 12, 4, 0, false));

		belt = new ModelRenderer(this);
		belt.setRotationPoint(0.1043F, 11.0035F, 0.0666F);
		body.addChild(belt);
		belt.cubeList.add(new ModelBox(belt, 28, 32, -4.6043F, -1.4035F, 1.5334F, 9, 1, 1, 0, false));

		belt_r1 = new ModelRenderer(this);
		belt_r1.setRotationPoint(0.2514F, -0.1478F, 0.311F);
		belt.addChild(belt_r1);
		setRotationAngle(belt_r1, 0.3142F, 0, 0);
		belt_r1.cubeList.add(new ModelBox(belt_r1, 32, 36, -4.8557F, -0.7696F, -2.3609F, 1, 1, 4, 0, false));
		belt_r1.cubeList.add(new ModelBox(belt_r1, 38, 34, 3.1443F, -0.7078F, -2.1707F, 1, 1, 4, 0, false));

		belt_r2 = new ModelRenderer(this);
		belt_r2.setRotationPoint(0.2514F, -0.1478F, 0.311F);
		belt.addChild(belt_r2);
		setRotationAngle(belt_r2, 0.3689F, -0.4885F, -0.1128F);
		belt_r2.cubeList.add(new ModelBox(belt_r2, 0, 6, 0.6354F, -0.9293F, -3.8965F, 2, 1, 1, 0, false));

		belt_r3 = new ModelRenderer(this);
		belt_r3.setRotationPoint(0.2514F, -0.1478F, 0.311F);
		belt.addChild(belt_r3);
		setRotationAngle(belt_r3, 0.3689F, 0.4885F, 0.1128F);
		belt_r3.cubeList.add(new ModelBox(belt_r3, 24, 5, -3.2596F, -0.9743F, -4.3348F, 2, 1, 1, 0, false));

		belt_r4 = new ModelRenderer(this);
		belt_r4.setRotationPoint(0.2514F, -0.1478F, 0.311F);
		belt.addChild(belt_r4);
		setRotationAngle(belt_r4, 0.192F, 0, 0);
		belt_r4.cubeList.add(new ModelBox(belt_r4, 35, 51, -0.9557F, -0.4513F, -3.2923F, 1, 1, 1, 0.1F, false));
		belt_r4.cubeList.add(new ModelBox(belt_r4, 28, 34, -3.3557F, -0.4513F, -3.1923F, 6, 1, 1, 0, false));

		holders = new ModelRenderer(this);
		holders.setRotationPoint(0.2514F, -0.4478F, 1.011F);
		belt.addChild(holders);

		holder_r1 = new ModelRenderer(this);
		holders.addChild(holder_r1);
		setRotationAngle(holder_r1, 0.3142F, 0, 0);
		holder_r1.cubeList.add(new ModelBox(holder_r1, 25, 52, 4.1443F, -1.3078F, -1.0707F, 1, 4, 2, 0, false));

		holder_r2 = new ModelRenderer(this);
		holder_r2.setRotationPoint(0, 0.1F, -0.2F);
		holders.addChild(holder_r2);
		setRotationAngle(holder_r2, 2.9395F, -0.1113F, 3.0577F);
		holder_r2.cubeList.add(new ModelBox(holder_r2, 42, 52, 4.2744F, -2.0737F, -0.3257F, 1, 4, 1, 0, false));
		holder_r2.cubeList.add(new ModelBox(holder_r2, 31, 52, 4.2744F, -2.0737F, 1.1743F, 1, 4, 1, 0, false));

		holder_r3 = new ModelRenderer(this);
		holder_r3.setRotationPoint(-0.3F, 0.3F, -0.2F);
		holders.addChild(holder_r3);
		setRotationAngle(holder_r3, 0.5133F, -1.0807F, -0.3924F);
		holder_r3.cubeList.add(new ModelBox(holder_r3, 19, 52, -4.9757F, -1.2918F, 1.1699F, 1, 4, 2, 0, false));

		holder_r4 = new ModelRenderer(this);
		holder_r4.setRotationPoint(0, 0.3F, -0.3F);
		holders.addChild(holder_r4);
		setRotationAngle(holder_r4, 2.131F, 1.2944F, 2.0795F);
		holder_r4.cubeList.add(new ModelBox(holder_r4, 51, 51, 3.4445F, -1.6396F, -2.2104F, 1, 4, 2, 0, false));

		holder_r5 = new ModelRenderer(this);
		holder_r5.setRotationPoint(0, 0.3F, -0.7F);
		holders.addChild(holder_r5);
		setRotationAngle(holder_r5, 1.6952F, 1.4236F, 1.6291F);
		holder_r5.cubeList.add(new ModelBox(holder_r5, 46, 52, 2.764F, -0.7889F, 0.5263F, 1, 4, 1, 0, false));
		holder_r5.cubeList.add(new ModelBox(holder_r5, 35, 53, 2.764F, -0.7889F, 1.7263F, 1, 4, 1, 0, false));

		holder_r6 = new ModelRenderer(this);
		holder_r6.setRotationPoint(0, 0.3F, -0.1F);
		holders.addChild(holder_r6);
		setRotationAngle(holder_r6, 0.3615F, 0.8585F, 0.2096F);
		holder_r6.cubeList.add(new ModelBox(holder_r6, 51, 51, 4.2445F, -1.0396F, 0.1896F, 1, 4, 2, 0, false));

		magazines = new ModelRenderer(this);
		magazines.setRotationPoint(-0.3557F, 13.4443F, -1.0776F);
		holders.addChild(magazines);

		magazine_r1 = new ModelRenderer(this);
		magazine_r1.setRotationPoint(0.3557F, -13.3443F, 0.8776F);
		magazines.addChild(magazine_r1);
		setRotationAngle(magazine_r1, 2.9395F, -0.1113F, 3.0577F);
		magazine_r1.cubeList.add(new ModelBox(magazine_r1, 20, 16, 4.2744F, -3.1737F, -0.3257F, 1, 3, 1, -0.1F, false));
		magazine_r1.cubeList.add(new ModelBox(magazine_r1, 0, 16, 4.2744F, -3.1737F, 1.1743F, 1, 3, 1, -0.1F, false));

		magazine_r2 = new ModelRenderer(this);
		magazine_r2.setRotationPoint(0.0557F, -13.3443F, 0.8776F);
		magazines.addChild(magazine_r2);
		setRotationAngle(magazine_r2, 0.5133F, -1.0807F, -0.3924F);
		magazine_r2.cubeList.add(new ModelBox(magazine_r2, 40, 21, -4.9757F, -2.4918F, 1.1424F, 1, 3, 2, -0.1F, false));

		magazine_r3 = new ModelRenderer(this);
		magazine_r3.setRotationPoint(0.3557F, -13.6443F, 1.0776F);
		magazines.addChild(magazine_r3);
		setRotationAngle(magazine_r3, 0.3142F, 0, 0);
		magazine_r3.cubeList.add(new ModelBox(magazine_r3, 40, 26, 4.1443F, -2.7078F, -1.0707F, 1, 3, 2, -0.1F, false));

		magazine_r4 = new ModelRenderer(this);
		magazine_r4.setRotationPoint(0.3557F, -13.1443F, 0.3776F);
		magazines.addChild(magazine_r4);
		setRotationAngle(magazine_r4, 1.6952F, 1.4236F, 1.6291F);
		magazine_r4.cubeList.add(new ModelBox(magazine_r4, 30, 0, 2.764F, -1.7889F, 0.5263F, 1, 3, 1, -0.1F, false));
		magazine_r4.cubeList.add(new ModelBox(magazine_r4, 0, 32, 2.764F, -1.7889F, 1.7263F, 1, 3, 1, -0.1F, false));

		magazine_r5 = new ModelRenderer(this);
		magazine_r5.setRotationPoint(0.3557F, -13.3443F, 0.7776F);
		magazines.addChild(magazine_r5);
		setRotationAngle(magazine_r5, 2.1045F, 1.2989F, 2.052F);
		magazine_r5.cubeList.add(new ModelBox(magazine_r5, 24, 0, 3.4445F, -2.7396F, -2.2776F, 1, 3, 2, -0.1F, false));

		magazine_r6 = new ModelRenderer(this);
		magazine_r6.setRotationPoint(0.3557F, -13.3443F, 0.9776F);
		magazines.addChild(magazine_r6);
		setRotationAngle(magazine_r6, 0.3615F, 0.8585F, 0.2096F);
		magazine_r6.cubeList.add(new ModelBox(magazine_r6, 24, 0, 4.2445F, -2.5396F, 0.1896F, 1, 3, 2, -0.1F, false));

		satchel = new ModelRenderer(this);
		satchel.setRotationPoint(0.2514F, -0.1478F, 0.311F);
		belt.addChild(satchel);

		button_r1 = new ModelRenderer(this);
		satchel.addChild(button_r1);
		setRotationAngle(button_r1, -0.2182F, 0.48F, 0);
		button_r1.cubeList.add(new ModelBox(button_r1, 52, 16, 1.0589F, -1.8853F, 3.5957F, 1, 1, 1, -0.2F, false));
		button_r1.cubeList.add(new ModelBox(button_r1, 0, 0, -0.0411F, -2.1853F, 2.9957F, 3, 3, 1, 0, false));
		button_r1.cubeList.add(new ModelBox(button_r1, 0, 4, -0.0411F, -2.5853F, 3.0957F, 3, 1, 1, 0.1F, false));

		hideBiped(this, body);
	}
}
