package com.paneedah.weaponlib.compatibility;

import net.minecraft.util.math.MathHelper;

public class CompatibleMathHelper {

	public static float cos(float in) {
		return MathHelper.cos(in);
	}

	public static float sin(float in) {
		return MathHelper.sin(in);
	}

	public static float sqrt_float(float in) {
		return MathHelper.sqrt(in);
	}

	public static float sqrt_double(double in) {
		return MathHelper.sqrt(in);
	}

    public static int floor_double(double d) {
        return MathHelper.floor(d);
    }
    
    public static double clamp_double(double num, double min, double max) {
        return MathHelper.clamp(num, min, max);
    }

    public static double wrapAngleTo180Double(double angle) {
        angle %= 360.0;

        if (angle >= 180.0) {
            angle -= 360.0;
        } else if (angle < -180.0) {
            angle += 360.0;
        }

        return angle;
    }
    
    public static float wrapAngleTo180Float(float angle) {
        angle %= 360f;

        if (angle >= 180f) {
            angle -= 360f;
        } else if (angle < -180f) {
            angle += 360f;
        }

        return angle;
    }
}
