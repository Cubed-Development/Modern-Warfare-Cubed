package com.paneedah.weaponlib.vehicle.jimphysics;

import net.minecraft.util.math.Vec3d;

import javax.vecmath.Quat4d;

/**
 * <a href="http://www.euclideanspace.com/maths/geometry/rotations/conversions/quaternionToEuler/inde<a href="x.htm">...</a>
 ">* http://www.euclideanspace.com/maths/geometry/rotations/conversions/eulerToQu</a>aternion/index.htm
 *
 * @author
 */
public class QuatUtil {


    public static Quat4d rotate(double heading, double attitude, double bank) {
        // Assuming the angles are in radians.
        double c1 = Math.cos(heading / 2);
        double s1 = Math.sin(heading / 2);
        double c2 = Math.cos(attitude / 2);
        double s2 = Math.sin(attitude / 2);
        double c3 = Math.cos(bank / 2);
        double s3 = Math.sin(bank / 2);
        double c1c2 = c1 * c2;
        double s1s2 = s1 * s2;
        double w = c1c2 * c3 - s1s2 * s3;
        double x = c1c2 * s3 + s1s2 * c3;
        double y = s1 * c2 * c3 + c1 * s2 * s3;
        double z = c1 * s2 * c3 - s1 * c2 * s3;
        return new Quat4d(x, y, z, w);
    }

    public static Vec3d set(Quat4d q1, double heading, double attitude, double bank) {
        double test = q1.x * q1.y + q1.z * q1.w;
        if (test > 0.499) { // singularity at north pole
            heading = 2 * Math.atan2(q1.x, q1.w);
            attitude = Math.PI / 2;
            bank = 0;
            return new Vec3d(heading, attitude, bank);
        }
        if (test < -0.499) { // singularity at south pole
            heading = -2 * Math.atan2(q1.x, q1.w);
            attitude = -Math.PI / 2;
            bank = 0;
            return new Vec3d(heading, attitude, bank);
        }
        double sqx = q1.x * q1.x;
        double sqy = q1.y * q1.y;
        double sqz = q1.z * q1.z;
        heading = Math.atan2(2 * q1.y * q1.w - 2 * q1.x * q1.z, 1 - 2 * sqy - 2 * sqz);
        attitude = Math.asin(2 * test);
        bank = Math.atan2(2 * q1.x * q1.w - 2 * q1.y * q1.z, 1 - 2 * sqx - 2 * sqz);
        return new Vec3d(heading, attitude, bank);
    }

}
