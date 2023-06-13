package com.paneedah.weaponlib.crafting.ammopress.model;


import com.paneedah.mwc.utils.ModReference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

import java.util.Arrays;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AmmoPress extends ModelBase {
	
	private Bullet bulletModel = new Bullet();
	private ResourceLocation bulletTexture = new ResourceLocation(ModReference.ID + ":textures/blocks/bullet.png");
	
	private Gunpowder gunpowderModel = new Gunpowder();
	private ResourceLocation powderTexture = new ResourceLocation(ModReference.ID + ":textures/blocks/gunpowder.png");
	
	
	private final ModelRenderer bone13;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer BottomRotor;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer Presser;
	private final ModelRenderer cube_r12;
	private final ModelRenderer TopRotor;
	private final ModelRenderer bone12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer bone11;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer bone10;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer bone9;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer MainPiston;

	public AmmoPress() {
		textureWidth = 64;
		textureHeight = 64;

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 24.0F, -6.75F);
		bone13.cubeList.add(new ModelBox(bone13, 40, 48, -1.0F, -9.25F, -0.15F, 2, 7, 2, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 48, 5, -1.0F, -2.0F, -3.15F, 2, 2, 4, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 20, 49, -2.0F, -4.0F, -2.9F, 1, 4, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 0, 49, -1.0F, -3.25F, -2.15F, 2, 2, 3, -0.2F, false));
		bone13.cubeList.add(new ModelBox(bone13, 10, 49, 2.0F, -8.75F, 0.35F, 1, 7, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.1F, -0.1F, -1.1F);
		bone13.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.6021F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 47, -2.0F, -3.0F, 0.0F, 2, 3, 4, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(13.0F, 0.0F, 5.95F);
		bone13.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.2094F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -8.0F, -6.0F, 0.0F, 8, 6, 7, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.15F, -1.0F, 5.35F);
		bone13.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.3665F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 13, -5.0F, -6.25F, 0.0F, 5, 6, 5, -0.2F, false));

		BottomRotor = new ModelRenderer(this);
		BottomRotor.setRotationPoint(0.0F, 0.0F, 6.75F);
		bone13.addChild(BottomRotor);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, -6.75F);
		BottomRotor.addChild(bone);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.4189F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 30, 0.0F, -3.0F, 0.0F, 5, 3, 4, 0.001F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.4189F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 7, -5.0F, -3.0F, 0.0F, 5, 3, 4, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 6.75F);
		BottomRotor.addChild(bone2);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.4189F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 27, 0.0F, -3.0F, -4.0F, 5, 3, 4, 0.001F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -0.4189F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 32, -5.0F, -3.0F, -4.0F, 5, 3, 4, -0.001F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(6.75F, 0.0F, 0.0F);
		BottomRotor.addChild(bone3);
		setRotationAngle(bone3, 0.0F, -1.5708F, 0.0F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -0.4189F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 23, 0, 0.0F, -3.0F, 0.0F, 5, 3, 4, 0.002F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.4189F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 25, -5.0F, -3.0F, 0.0F, 5, 3, 4, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-6.75F, 0.0F, 0.0F);
		BottomRotor.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 1.5708F, 0.0F);
		

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -0.4189F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 13, 0.0F, -3.0F, 0.0F, 5, 3, 4, 0.001F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.4189F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 20, -5.0F, -3.0F, 0.0F, 5, 3, 4, 0.0F, false));

		Presser = new ModelRenderer(this);
		Presser.setRotationPoint(2.0F, -5.75F, 1.15F);
		bone13.addChild(Presser);
		

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		Presser.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.2443F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 48, -1.0F, -2.5756F, -1.4567F, 1, 5, 3, 0.0F, false));

		TopRotor = new ModelRenderer(this);
		TopRotor.setRotationPoint(0.0F, 0.0F, 6.75F);
		bone13.addChild(TopRotor);
		TopRotor.cubeList.add(new ModelBox(TopRotor, 0, 0, -3.0F, -11.75F, -3.65F, 1, 4, 1, 0.0F, false));
		TopRotor.cubeList.add(new ModelBox(TopRotor, 0, 13, -4.1F, -11.75F, 0.95F, 1, 4, 1, 0.0F, false));
		TopRotor.cubeList.add(new ModelBox(TopRotor, 15, 13, -1.4F, -11.75F, 3.45F, 1, 4, 1, 0.0F, false));
		TopRotor.cubeList.add(new ModelBox(TopRotor, 30, 7, 2.5F, -11.75F, -3.15F, 1, 4, 1, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, -11.0F, -5.25F);
		TopRotor.addChild(bone12);
		

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -0.4189F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 16, 0.0F, -1.0F, 0.0F, 4, 1, 4, 0.001F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.4189F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 34, -4.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, -11.0F, 5.25F);
		TopRotor.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 3.1416F, 0.0F);
		

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.4189F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 23, 0.0F, -1.0F, 0.0F, 4, 1, 4, 0.001F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.4189F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 37, -4.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-5.25F, -11.0F, 0.0F);
		TopRotor.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 1.5708F, 0.0F);
		

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -0.4189F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 39, 0.0F, -1.0F, 0.0F, 4, 1, 4, 0.002F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.4189F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 39, -4.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(5.25F, -11.0F, 0.0F);
		TopRotor.addChild(bone9);
		setRotationAngle(bone9, 0.0F, -1.5708F, 0.0F);
		

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, -0.4189F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 41, 0, 0.0F, -1.0F, 0.0F, 4, 1, 4, 0.002F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.4189F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 28, 42, -4.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-5.25F, -7.0F, 0.0F);
		TopRotor.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 1.5708F, 0.0F);
		

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, -0.4189F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 42, 38, 0.0F, -1.0F, 0.0F, 4, 1, 4, 0.002F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.4189F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 40, 43, -4.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(5.25F, -7.0F, 0.0F);
		TopRotor.addChild(bone7);
		setRotationAngle(bone7, 0.0F, -1.5708F, 0.0F);
		

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, -0.4189F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 44, 0.0F, -1.0F, 0.0F, 4, 1, 4, 0.002F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.4189F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 16, 44, -4.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, -7.0F, 5.25F);
		TopRotor.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 3.1416F, 0.0F);
		

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, -0.4189F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 46, 14, 0.0F, -1.0F, 0.0F, 4, 1, 4, 0.001F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.4189F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 46, 19, -4.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -7.0F, -5.25F);
		TopRotor.addChild(bone5);
		

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, -0.4189F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 46, 24, 0.0F, -1.0F, 0.0F, 4, 1, 4, 0.001F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.4189F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 46, 29, -4.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

		MainPiston = new ModelRenderer(this);
		MainPiston.setRotationPoint(3.8F, -7.75F, 1.05F);
		TopRotor.addChild(MainPiston);
		MainPiston.cubeList.add(new ModelBox(MainPiston, 16, 49, -1.0F, -4.0F, 0.0F, 1, 7, 1, 0.0F, false));
		
		Arrays.fill(bulletStatus, -1);
	}
	
	public int[] bulletStatus = new int[13];
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		
		
		
		//if(true) return;
		bone13.render(f5);
		
		
		
		mc.getTextureManager().bindTexture(bulletTexture);
		
		boolean outOfBoolets = false;
		
		boolean bulletAtPowdering = false;
		boolean bulletAtPress = false;
		
		for(float i = 0; i < 2*Math.PI; i += Math.PI/6.0f) {
		
			// Calculate angle to render bullet at
			float totalAngle = (float) (i - BottomRotor.rotateAngleY);
			float wrappedAngle = (float) Math.toRadians(MathHelper.wrapDegrees(Math.toDegrees(totalAngle)));
			
			
			int bulletID = (int) Math.round(i/(Math.PI/6.0f));
			
			
			// This represents the hidden bullet (i.e. the one that
			// appears to have been just sucked up)
			if((wrappedAngle > 1.83 && wrappedAngle < 2.78)) {
				
				if(outOfBoolets) {
					bulletStatus[bulletID] = 0;
				}
				
				continue;
			}

			
			// Calculate X & Y positioning
			double x = Math.cos(totalAngle) * 0.023;
			double z = Math.sin(totalAngle) * 0.023;
			
			
			// Should this be rendered w/ a bullet? Since this is just visual,
			// all we have to do is check if the angle the bullet is on relative
			// to the circle is between the tip insertion and the pickup
			boolean hasBulletFlag = wrappedAngle > -1.1 && wrappedAngle < 2.8;
		
			float pickupSpotDistance = 2.81f - wrappedAngle;
			float placementSpotDistance = 1.8f - wrappedAngle;
			float powderingSpotDistance = 1.5f - wrappedAngle;
			float bulletPlacementDistance = -1.2f - wrappedAngle;
			
			//bulletStatus[bulletID] = -1;
			
			if(outOfBoolets && bulletStatus[bulletID] == 0) continue;
			
			
			//boolean hiddenFlag = wrappedAngle > 1.83 && wrappedAngle < 2.78;
			
			// Render the bullet
			GlStateManager.pushMatrix();
			
			// Preforms the pickup animation which looks like the bullet
			// getting sucked up into the top rotor
			if(Math.abs(pickupSpotDistance) < 0.03f) {
				float correctedDistance = (float) (pickupSpotDistance > 0 ? pickupSpotDistance : 0.0);
				GlStateManager.translate(0.0, -correctedDistance*1.2, 0.0);
				//System.out.println("Bullet being picked up: " + bulletID);
				//bulletBeingPickedUp = bulletID;
			}
			
			// Performs the placement animation which looks like the bullet
			// getting released from the top rotor
			if(Math.abs(placementSpotDistance) < 0.04f) {
				float correctedDistance = (float) (placementSpotDistance < 0 ? placementSpotDistance : 0.0);
				GlStateManager.translate(0.0, correctedDistance, 0.0);
				bulletStatus[bulletID] = -1;
			}
			
			if(bulletStatus[bulletID] == 0) {
				GlStateManager.popMatrix();
				continue;
			}
			
			if(Math.abs(bulletPlacementDistance) < 0.2f) {
				bulletAtPress = true;
			
			}
			
			if(Math.abs(powderingSpotDistance) < 0.1f) {
				bulletAtPowdering = true;
			}
			
			
			
			GlStateManager.translate(x, 0.07, z);
			GlStateManager.scale(0.4, 0.4, 0.4);
			bulletModel.render(entity, f, hasBulletFlag ? -1 : 1, f2, f3, f4, f5);
			GlStateManager.popMatrix();
		}
		
		
	
		
		
		BottomRotor.rotateAngleY = f;
		
		//if(BottomRotor.rotateAngleY >= 2*Math.PI) BottomRotor.rotateAngleY = 0.0f;
		
		
		//MainPiston.offsetY = (1.0f-proximity)/100.0f;
		
		
		// Performs the press animation
		float offset = (float) Math.abs(Math.pow(1 - Math.cos(BottomRotor.rotateAngleY*12 + 1.7), 5));
		
		if(bulletAtPress) {
			MainPiston.offsetY = offset*0.0003f - 0.01f;
			TopRotor.offsetY = offset*0.00005f;
			Presser.rotateAngleX = -offset*0.005f;
			
		}
		
		if(bulletAtPowdering) {
			mc.getTextureManager().bindTexture(powderTexture);
			GlStateManager.pushMatrix();
			GlStateManager.translate(0.0035, 0.101 + offset*0.0005f, 0.023);
			GlStateManager.scale(0.0015*offset, 0.05*offset, 0.0015*offset);
			gunpowderModel.render(entity, f, f1, f2, f3, f4, f5);
			GlStateManager.popMatrix();
		}
		
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
