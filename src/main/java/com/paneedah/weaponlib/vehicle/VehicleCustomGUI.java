package com.paneedah.weaponlib.vehicle;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.KeyBindings;
import com.paneedah.weaponlib.animation.jim.KeyStateAnimator;
import com.paneedah.weaponlib.render.ScreenRenderer;
import com.paneedah.weaponlib.vehicle.jimphysics.InterpolationKit;
import com.paneedah.weaponlib.vehicle.jimphysics.Transmission;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import java.awt.Color;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class VehicleCustomGUI extends Gui {
	
	// SCALED RESOLUTION
	public static final ScaledResolution SCALE_RES = new ScaledResolution(mc);
	
	// LOCK & KEY MODELS
	public static ModelBase keyModel;
	public static ModelBase lockModel;
	
	// LOCK & KEY TEXTURES
	public static ResourceLocation keyTex;
	public static ResourceLocation lockTex;
	
	
	// KEY ANIMATOR
	public KeyStateAnimator keyAnimator = new KeyStateAnimator();
	
	
	/**
	 * Sets the lock  & key models
	 * @param key
	 * @param lock
	 * @param keyT
	 * @param lockT
	 */
	public static void setLockAndKeyModels(ModelBase key, ModelBase lock, ResourceLocation keyT, ResourceLocation lockT) {
		keyModel = key;
		lockModel = lock;
		keyTex = lockT;
		lockTex = keyT;
	}
	
	
	
	/**
	 * Draws a needle for the tachometer
	 * 
	 * @param c - The color of the tachometer needle
	 * @param x - On-screen x-position
	 * @param y - On-screen y-pos
	 * @param length
	 * @param width
	 * @param startAngle
	 * @param angle
	 * @param prevAngle
	 */
	public void renderNeedle(Color c, double x, double y, double length, double width, float startAngle, float angle, float prevAngle) {
		float red = c.getRed()/255.0f;
		float blue = c.getBlue()/255.0f;
		float green = c.getGreen()/255.0f;
		float alpha = c.getAlpha()/255.0f;
		
		double tW = width/2.0;
		
		
		GL11.glPushMatrix();
		GlStateManager.disableTexture2D();
		GlStateManager.disableDepth();
		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();
		GlStateManager.color(1.0f, 1.0f, 1.0f);
		
		
		double interpolatedAng = prevAngle + (angle-prevAngle)*mc.getRenderPartialTicks();
		
		GlStateManager.translate(x, y, 0.0);
		GlStateManager.rotate((float) interpolatedAng, 0, 0, 1);
		GlStateManager.rotate(startAngle, 0, 0, 1);
		GlStateManager.translate(-12, 0.0, 0.0);
		//GlStateManager.translate(-x, -y, 0.0);
		//GlStateManager.rotate(15, 1, 0, 0);
		
		
		//GlStateManager.translate(10, 0.0, 0.0);
		//GlStateManager.rotate((float) angle, 0, 0, 1);
		
		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_COLOR);
		bb.pos(-length, tW, 0).color(red, green, blue, alpha).endVertex();
		bb.pos(0, tW, 0).color(red, green, blue, alpha).endVertex();
		bb.pos(0, -tW, 0).color(red, green, blue, alpha).endVertex();
		bb.pos(-length, -tW, 0).color(red, green, blue, alpha).endVertex();
		
		
		
		
		t.draw();
		
		
		
		
		GL11.glDisable(GL11.GL_POLYGON_SMOOTH);
		GlStateManager.disableAlpha();
		GlStateManager.enableTexture2D();
		GlStateManager.disableBlend();
		GlStateManager.enableDepth();
		GL11.glPopMatrix();
		
	}
	
	public void renderHalfCircle(Color c, double x, double y, int outerRadius, int innerRadius, double beginAngle, double finishAngle) {
		
		
		
		float red = c.getRed()/255.0f;
		float blue = c.getBlue()/255.0f;
		float green = c.getGreen()/255.0f;
		float alpha = c.getAlpha()/255.0f;
		
		GL11.glPushMatrix();
		
		GlStateManager.disableTexture2D();
		GlStateManager.disableDepth();
		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();
		//GL11.glBlendFunc(GL11.GL_SRC_ALPHA_SATURATE, GL11.GL_ONE);
		
		//GL11.glEnable(GL11.GL_POLYGON_SMOOTH);
		/*
		GL11.glEnable(GL13.GL_MULTISAMPLE);
		GL11.glHint(NVMultisampleFilterHint.GL_MULTISAMPLE_FILTER_HINT_NV, GL11.GL_NICEST);
		System.out.println(GL11.glGetInteger(GL13.GL_SAMPLE_BUFFERS)); */
		GlStateManager.color(1.0f, 1.0f, 1.0f);
		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		double endAng = 0;
		bb.begin(GL11.GL_TRIANGLE_STRIP, DefaultVertexFormats.POSITION_COLOR);
		for(double a = beginAngle; a < finishAngle; a += 6) {
			double cos = -Math.cos(Math.toRadians(a))*outerRadius;
			double sin = -Math.sin(Math.toRadians(a))*outerRadius;
			
			double cosI = -Math.cos(Math.toRadians(a))*innerRadius;
			double sinI = -Math.sin(Math.toRadians(a))*innerRadius;
			
			bb.pos(x+cos, y+sin, 0).color(red, green, blue, alpha).endVertex();
			bb.pos(x+cosI, y+sinI, 0).color(red, green, blue, 1.0f).endVertex();
			
			endAng = a;
		}
		
		if(endAng != finishAngle) {
			double cos = -Math.cos(Math.toRadians(finishAngle))*outerRadius;
			double sin = -Math.sin(Math.toRadians(finishAngle))*outerRadius;
			
			double cosI = -Math.cos(Math.toRadians(finishAngle))*innerRadius;
			double sinI = -Math.sin(Math.toRadians(finishAngle))*innerRadius;
			
			bb.pos(x+cos, y+sin, 0).color(red, green, blue, alpha).endVertex();
			bb.pos(x+cosI, y+sinI, 0).color(red, green, blue, 1.0f).endVertex();
		}
		
		
		t.draw();
		
		//GL11.glDisable(GL11.GL_POLYGON_SMOOTH);
		GlStateManager.disableAlpha();
		GlStateManager.enableTexture2D();
		GlStateManager.disableBlend();
		GlStateManager.enableDepth();
		GL11.glPopMatrix();
	}
	
	public float prevRPMAngle = 0.0f;
	public SimpleAnimationTimer sat = null;	
	public int oldPOV = 0;
	
	
	public int progess = 0;
	
	public void drawShiftPattern(EntityVehicle vehicle, double x, double y) {
		
		
		Transmission transmission = vehicle.solver.transmission;
		GearShiftPattern pattern = vehicle.getSolver().getPhysConf().getShiftPattern();
		
		//System.out.println(pattern + " | " + transmission + " | " + transmission.shiftTimer + " | " + transmission.maxShiftTime + " | " + transmission.startGear + " | " + transmission.targetGear);
		
		
		GL11.glPushMatrix();
		GlStateManager.enableAlpha();
		
		int old = 0;
		if(transmission.shiftTimer > 0) old = transmission.shiftTimer-1;
		
		Vec3d on2 = pattern.doAnimation(old, transmission.maxShiftTime, transmission.startGear, transmission.targetGear).scale(30.25);
		
		
		Vec3d oN = pattern.doAnimation(transmission.shiftTimer, transmission.maxShiftTime, transmission.startGear, transmission.targetGear).scale(30.25);
		
		oN = GearShiftPattern.interpVec3d(on2, oN, mc.getRenderPartialTicks());
		double nX = oN.z;
		double nZ = -oN.x;
		
		
		
		// render pattern
		
		GL11.glPushMatrix();
		GlStateManager.disableTexture2D();
		GlStateManager.disableDepth();
		GlStateManager.color(1.0f, 1.0f, 1.0f);
		GL11.glTranslated(x+6.5, y+6.5, 0.0);
		GL11.glScaled(30.5, 30.5, 30.5);
		
		pattern.renderPattern(Color.decode("#d2dae2"), x, y);
	
		GlStateManager.enableTexture2D();
		GlStateManager.enableDepth();
		GL11.glPopMatrix();
		
		// enmd
		
		// render knob
		ResourceLocation loc = new ResourceLocation(ModReference.ID + ":textures/gui/caricons.png");
		mc.getTextureManager().bindTexture(loc);
		GlStateManager.color(1.0f, 1.0f, 1.0f);
		GL11.glTranslated(x+nX, y+nZ, 0);
		GL11.glScaled(0.8, 0.8, 0.8);
		drawTexturedModalRect(0, 0, 0, 0, 17, 17);
		
		
		
		
		
		
		
		GlStateManager.disableAlpha();
		GL11.glPopMatrix();
	}
	
	public void drawSpeedometer(EntityVehicle vehicle, double x, double y, int maxRPM, int gear, double rpm, double speed, double ratio) {
		GL11.glPushMatrix();
		double scale = (new ScaledResolution(mc)).getScaledWidth()/640.0;
		//GL11.glScaled(scale, scale, scale);
		//x /= scale;
		//y /= scale;
		
		
		
		
		
		
		if(sat == null) {
			sat = new SimpleAnimationTimer(150, false);
		}
		
		
		if(mc.gameSettings.thirdPersonView != oldPOV) {
			oldPOV = mc.gameSettings.thirdPersonView;
			if(sat.isComplete()) sat.reset();
		}
		
		
		
		
		
		
		if(!sat.isComplete())sat.tick();
		
		
		
		
		
		
		float lowestAng = -45;
		float maxAng = 180;
		
		
		//rpm = 7000;
		float newRPMAngle = (float) (0.0 + ((maxAng+45)-0.0)*(rpm/(double) maxRPM));
		
		
		float prevRPMAngle = (float) (0.0 + ((maxAng+45)-0.0)*(vehicle.solver.getPreviousRPM()/(double) maxRPM));
		
		//float rpmAng = prevRPMAngle + (newRPMAngle-prevRPMAngle)*mc.getRenderPartialTicks();

		
		
		
		GlStateManager.disableDepth();
		GL11.glEnable(GL11.GL_POLYGON_SMOOTH);
		GL11.glHint(GL11.GL_POLYGON_SMOOTH_HINT, GL11.GL_DONT_CARE);
		
		GL11.glDisable(GL11.GL_POLYGON_SMOOTH);
		GL11.glPushMatrix();
		
		
		GL11.glTranslated(x, y, 0);
		
		
		GL11.glScaled(0.85, 0.85, 0.85);
		
		
		int thousands = maxRPM/1000;
		double an = 360/(double) thousands;
		double radius = 50;
		double bA = -45;
		double eA = 180;
		for(int n = 0; n <= thousands; ++n) {
			double pA = (n*an)/360;
			double actualAngle = bA + (eA-bA)*pA;
			double cos = -Math.cos(Math.toRadians(actualAngle))*radius;
			double sin = -Math.sin(Math.toRadians(actualAngle))*radius;
			int color = 0;
			if(n < 6) {
				color = 0xFFFFFF;
			} else {
				color = 0xc0392b;
			}
			
			drawCenteredString(mc.fontRenderer, "" + n, (int) cos, (int) sin-4, color);
		}
		
		GL11.glPopMatrix();
		GL11.glEnable(GL11.GL_POLYGON_SMOOTH);
		
		renderHalfCircle(Color.decode("#FFFFFF"), x, y, 50, 48, lowestAng, sat.smoothInterpDouble(-45, 133));
		renderHalfCircle(Color.decode("#c23616"), x, y, 50, 48, 135, sat.smoothInterpDouble(135, maxAng));
		renderHalfCircle(Color.decode("#4cd137"), x, y, 10, 9, 0, sat.smoothInterpDouble(0, 360));
		
		// test
		/*
		progess += 1;
		if(progess > 150) progess = 0;
		
		Vec3d oN = Test.STANDARD_SIX_SHIFT.doAnimation(progess, 150, 1, 3).scale(50);
		
		double nX = oN.z;
		double nZ = -oN.x;
		
		renderHalfCircle(Color.decode("#4cd137"), x-250+nX, y-50+nZ, 5, 0, 0, sat.smoothInterpDouble(0, 360));
		*/
		//
		
		/*
		GL11.glPushMatrix();
		GL11.glScaled(1.0, 1.0, 1.0);
			GL11.glDisable(GL11.GL_POLYGON_SMOOTH);
			drawShiftPattern(vehicle, x-125, y);
			GL11.glEnable(GL11.GL_POLYGON_SMOOTH);
		GL11.glPopMatrix();
		*/

		
		
		
		
		Transmission transmission = vehicle.solver.transmission;
		GearShiftPattern pattern = vehicle.getSolver().getPhysConf().getShiftPattern();
		renderHalfCircle(Color.decode("#7f8fa6"), x, y, 12, 11, lowestAng, sat.smoothInterpDouble(lowestAng, maxAng+4));
		renderNeedle(Color.decode("#FFFFFF"), x, y, 35, 1, lowestAng, newRPMAngle, prevRPMAngle);
		GL11.glDisable(GL11.GL_POLYGON_SMOOTH);
		
		
		
		
		GL11.glPushMatrix();
		GL11.glTranslated(x, y, 0);
		GL11.glScaled(1.5, 1.5, 1.5);
		
		
		if(transmission.isReverseGear) {
			drawCenteredString(mc.fontRenderer, "R", 0, -4, 0x10ac84);
		} else if(transmission.inNeutral()){
			drawCenteredString(mc.fontRenderer, "N", 0, -4, 0xc8d6e5);
			
		} else {
				drawCenteredString(mc.fontRenderer, "" + gear, 0, -4, 0x4cd137);
				
		}
		double valie = Math.floor(vehicle.getSolver().rearAxel.leftWheel.wheelAngularVelocity);
		//drawCenteredString(mc.fontRenderer, "" + valie, 0, -48, 0x4cd137);
		
		
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		
		GL11.glTranslated(x, y, 0);
		GL11.glScaled(2.0, 2.0, 2.0);
		int fixedSpeed = (int) Math.round(speed*3.6);
		drawCenteredString(mc.fontRenderer, "" + fixedSpeed, 20, 2, 0xc8d6e5);
		
		GL11.glPushMatrix();
		GL11.glScaled(0.4, 0.4, 0.4);
		drawCenteredString(mc.fontRenderer, "km/h", 53, 25, 0xc8d6e5);
		
		GL11.glPopMatrix();
		
		GL11.glPopMatrix();
		
		
		
		
		
		GL11.glPopMatrix();
		
		
		
		
		this.prevRPMAngle = newRPMAngle;
		
		
	}
	
	public void renderKeyAndLock(EntityVehicle vehicle, double x, double y, double ratio) {
		
		GL11.glPushMatrix();

		double pM = Math.sin(vehicle.ticksExisted/2)*3;
		double ppM = Math.sin((vehicle.ticksExisted-1)/2)*3;
		double iPM = InterpolationKit.interpolateValue(ppM, pM, mc.getRenderPartialTicks());
		
		

		
		
		keyAnimator.tick();
		
		
		
		//kA.transition(new Vec3d(5.0, 0.0, 0.0),
		//		  new Vec3d(00.0, 0, 30), 200.0);

		
		
		
		GL11.glTranslated(x, y, 0.0);
		
		//GL11.glRotated(90, 0, 1, 0);
		GL11.glRotated(-150, 0.0, 1.0, 0.0);
		GL11.glRotated(25, 1.0, 0.0, 0.0);
		//GL11.glRotated(25, 0.0, 0.0, 1.0);
		GL11.glScaled(0.9, 0.9, 0.9);
		
		
		
		Vec3d iR = keyAnimator.getInterpolatedRotation();
		Vec3d iP = keyAnimator.getInterpolatedPosition();
		
		lockModel.setLivingAnimations(null, (float) iR.x, 0.0f, 0.0f);
		ScreenRenderer.renderModelOnScreen(0.0, 0.0, 0.0, 30, 0f, 0f, 0f, lockModel, keyTex);
		
		
		double add = 0.0;
		
		if(keyAnimator.currentPosition.length() == 0.0) {
			
			add = iPM;
		}
		
		//GL11.glRotated(45, 1, 0, 0);
		ScreenRenderer.renderModelOnScreen(0.0 + iP.x, -24.0+ iP.y, -50.0+ iP.z + add, 30, 0f + iR.x, 0f + iR.y, 0f + iR.z, keyModel, lockTex);
		
		
		
		
		
		//GuiInventory.drawEntityOnScreen(320, 169, 30, 30, 30, mc.player);
		
		GL11.glPopMatrix();
	}
	
	
	public void renderGUI(EntityVehicle vehicle) {
		
		ScaledResolution sr = new ScaledResolution(mc);
		
		
		double width = sr.getScaledWidth();
		double height = sr.getScaledHeight();
		
		double x = width;
		double y = height;
		
		//System.out.println(width + " | " + height);
		
		
		
		GL11.glPushMatrix();
		
		
		double ratio = (width*height)/(640*339);
		//System.out.println(ratio);
		
		
		
		GL11.glScaled(ratio, ratio, ratio);
		x /= ratio;
		y /= ratio;
		
		x -= 75;
		y -= 50;
		
		
		renderKeyAndLock(vehicle, x-80, y-68, ratio);
		
		
		if(!vehicle.isVehicleRunning()) {
			
			drawCenteredString(mc.fontRenderer, "Press " + KeyBindings.vehicleTurnOff.getDisplayName(), (int) x-80, (int) y-78, 0xc8d6e5);
			
		}
		
		drawSpeedometer(vehicle, x, y, vehicle.solver.configuration.getEngine().getMaxRPM(), vehicle.solver.transmission.getCurrentGear(), vehicle.solver.getCurrentRPM(), vehicle.getRealSpeed(), ratio);
		//renderKeyAndLock(vehicle, 1, 1);
		GL11.glPopMatrix();
	}

}
