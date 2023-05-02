package com.paneedah.mwc.weaponlib.jim.util;

public class RandomUtil {
	
	public static double getRandomDoubleInclusive(double min, double max) {
		return Math.random()*(max-min+1)+min;
	}
	
	public static double getRandomWithNegatives(double maximum) {
		return Math.random()*(2*maximum) - maximum;
	}

}
