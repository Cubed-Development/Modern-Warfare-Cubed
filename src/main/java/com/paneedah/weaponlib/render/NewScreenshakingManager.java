package com.paneedah.weaponlib.render;

import akka.japi.Pair;
import com.paneedah.weaponlib.ClientModContext;
import com.paneedah.weaponlib.animation.MatrixHelper;
import com.paneedah.weaponlib.numerical.RandomVector;
import com.paneedah.weaponlib.numerical.SpringVector;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.Vec3d;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class NewScreenshakingManager {
	
	public RandomVector randomVec = new RandomVector();

	public double prevIntensity, intensity;
	
	
	public SpringVector springVector = new SpringVector(1, 2, 2);
	
	private double prevX, prevY, prevZ, prevRotX, prevRotY, prevRotZ;
	private double x, y, z, rotX, rotY, rotZ;
	
	
	private double getRandom(double min, double max) {
		return Math.random()*(max-min+1)+min;
	}
	
	private double getRandomWithNegative(double min, double max) {
		double random = Math.random()*(max-min+1)+min;
		if(Math.random() < 0.5) random *= -1;
		return random;
		
	}
	
	public void impulse(double mag) {
	
		//mag *= 1000;
		
		intensity += mag;
		
		
	//	x = Math.random()*mag - (mag/2);
	//	y = -Math.random()*mag;
		
	
		
		x = -10*mag;
		z = 2*mag;
		//z = 0;
		//springVector.addPosition(x, 0, z);
		springVector.addVelocity(x, y, z);
		
	}
	
	
	

	
	public void applyWorld() {
		float pt = mc.getRenderPartialTicks();
		//double i = MatrixHelper.solveLerp(prevIntensity, intensity, pt);
		
		
		if(ClientModContext.getContext() != null && ClientModContext.getContext().getMainHeldWeapon() != null) {
			
			Pair<Double, Double> param = ClientModContext.getContext().getMainHeldWeapon().getScreenShakeParameters();
			springVector.setXSpringParam(2, 3000*param.second(), 200*param.second());
			springVector.setZSpringParam(4, 9000*param.second(), 75*param.second());
		} else {
			springVector.setXSpringParam(2, 3000, 200);
			springVector.setZSpringParam(4, 9000, 75);
		}
		
		
		
		
		//System.out.println("yo " + (accumulator/dt));
		Vec3d rotVec = interpolated;
		GlStateManager.rotate((float) rotVec.z, 0, 0, 1);
		//GlStateManager.rotate((float) rotVec.y, 0, 1, 0);
		GlStateManager.rotate((float) rotVec.x, 1, 0, 0);
		
	
	}
	
	public void applyHead() {
		
		float pt = mc.getRenderPartialTicks();
		double i = MatrixHelper.solveLerp(prevIntensity, intensity, pt);
		
		

		
		
		/*
		GlStateManager.translate(i*MatrixHelper.solveLerp(prevX, x, pt),
				i*MatrixHelper.solveLerp(prevY, y, pt),
				i*MatrixHelper.solveLerp(prevZ, z, pt));
		
		float iRZ = (float) MatrixHelper.solveLerp(prevRotZ, rotZ, pt);
		//GlStateManager.rotate((float) (5f*i*iRZ), 0, 0, 1);
		
		*/
		
		//System.out.println(intensity);
	//	GlStateManager.scale(1, 1, 1+(intensity*0.2));
	}
	
	public double dt = 1/20;
	public long currentTime = System.currentTimeMillis();
	public double accumulator;
	public Vec3d interpolated = Vec3d.ZERO;

	
	public void update() {
		dt = 1/120.0;
		
		long newTime = System.currentTimeMillis();
		double frameTime = (newTime - currentTime)/1000.0;
		currentTime = newTime;

		// Prevents massive timesteps from accumuating
		if(frameTime > 0.25) frameTime = 0.25;
		
		accumulator += frameTime;
		
	
		Vec3d prev = springVector.getPosition();
		
		while(accumulator >= dt) {
			springVector.update(dt);
			accumulator -= dt;
		}
		
		interpolated = MatrixHelper.lerpVectors(prev, springVector.getPosition(), (float) (accumulator/dt));
		
		
	}

}
