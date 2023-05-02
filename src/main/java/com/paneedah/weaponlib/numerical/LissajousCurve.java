package com.paneedah.weaponlib.numerical;

public class LissajousCurve {
	
	public static float getXOffsetOnCurve(double amp, double a, double b, double c, double tick) {
         return (float) ((float) amp*Math.sin(a*tick+c));
	}
	
	public static float getYOffsetOnCurve(double amp, double a, double b, double c, double tick) {
		return (float) ((float) amp*Math.sin(b*tick));
	}

}
