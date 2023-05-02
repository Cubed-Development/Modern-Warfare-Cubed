package com.paneedah.weaponlib.animation;

import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.util.vector.Quaternion;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class Arcball {
	
	public static int grabX;
	public static int grabY;
	
	
	public static void grab(int mouseX, int mouseY) {
		grabX = mouseX;
		grabY = mouseY;
	}
	
	public static Quaternion runArcBall(int mouseX, int mouseY) {
		
		Vec3d grabPoint = project(grabX, grabY);
		Vec3d current = project(mouseX, mouseY);
		
		
		Quaternion quat = fromBetweenVectors(grabPoint, current);
				
				//System.out.println(quat);
				return quat;
	}
	
	public static Vec3d project(int mouseX, int mouseY) {
		ScaledResolution sr = new ScaledResolution(mc);
		double width = sr.getScaledWidth_double();
		double height = sr.getScaledHeight_double();
		
		
		double s = Math.min(width, height) -1;
		double pX = 2*(mouseX - (width/2))/s;
		double pY = -2*(mouseY - (height/2))/s;
		
		
		double radius = 0.5;
		double z = 0;
		
		if(pX*pX + pY*pY <= radius*radius/2) {
			z = Math.sqrt(radius*radius - pX*pX + pY*pY);
		} else {
			z = radius*radius/2/(Math.sqrt(pX*pX + pY*pY));
		}
		return new Vec3d(pX, -pY, z);
	}

	
	public static Quaternion fromBetweenVectors(Vec3d a, Vec3d b) {
	
		Quaternion quat = new Quaternion();
		
		double r = a.dotProduct(b) + 1;
		if(r < 0.001) {
			
			r = 0;
			
			if(Math.abs(a.x) > Math.abs(b.z)) {
				quat.x = (float) -a.y;
				quat.y = (float) a.x;
				quat.z = 0;
				quat.w = (float) r;
			} else {
				quat.x = 0f;
				quat.y = (float) -a.z;
				quat.z = (float) a.y;
				quat.w = (float) r;
			}
			
		} else {
			quat.x = (float) (a.y*b.z - a.z*b.y);
			quat.y = (float) (a.z*b.x - a.x*b.z);
			quat.z = (float) (a.x*b.y - a.y*b.x);
			quat.w = (float) r;
			
		}
		
		Quaternion.normalise(quat, quat);
		
		return quat;
		
	}
}
