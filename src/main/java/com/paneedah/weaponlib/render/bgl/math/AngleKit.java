package com.paneedah.weaponlib.render.bgl.math;

import org.lwjgl.util.vector.Quaternion;

/**
 * Thou hast been bequeathed by holy angle kit
 * <p>
 * <p>
 * Euler -> Quaternion -> Euler
 * https://math.stackexchange.com/questions/2975109/how-to-convert-euler-angles-to-quaternions-and-get-the-same-euler-angles-back-fr
 *
 * @author Cpt. James R. Holden of Rocinante, 2022
 */
public class AngleKit {

    public static enum Format {
        DEGREES, RADIANS
    }

    public static class AxisAngle {
        private Format format;
        private double angle, x, y, z;

        public AxisAngle(Format format, double angle, double x, double y, double z) {
            this.format = format;
            this.angle = angle;
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public boolean isRadians() {
            return format == Format.RADIANS;
        }

        public boolean isDegrees() {
            return format == Format.DEGREES;
        }

        public Format getFormat() {
            return this.format;
        }

        public AxisAngle toRadians() {
            if (format == Format.RADIANS) {
                return this;
            }
            return new AxisAngle(Format.RADIANS, rad(angle), x, y, z);
        }

        public AxisAngle toDegrees() {
            if (format == Format.DEGREES) {
                return this;
            }
            return new AxisAngle(Format.DEGREES, deg(angle), x, y, z);
        }

        public double getAngle() {
            return this.angle;
        }

        public double getX() {
            return this.x;
        }

        public double getY() {
            return this.y;
        }

        public double getZ() {
            return this.z;
        }

        @Override
        public String toString() {
            return "(" + angle + ", [" + x + ", " + y + ", " + z + "])";
        }

    }

    public static class EulerAngle {
        private Format format;
        private double x, y, z;

        public EulerAngle(Format format, double x, double y, double z) {
            this.format = format;
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public boolean isRadians() {
            return format == Format.RADIANS;
        }

        public boolean isDegrees() {
            return format == Format.DEGREES;
        }

        public Format getFormat() {
            return this.format;
        }

        public EulerAngle toRadians() {
            if (format == Format.RADIANS) {
                return this;
            }
            return new EulerAngle(Format.RADIANS, rad(x), rad(y), rad(z));
        }

        public EulerAngle toDegrees() {
            if (format == Format.DEGREES) {
                return this;
            }
            return new EulerAngle(Format.DEGREES, deg(x), deg(y), deg(z));
        }

        public double getPitch() {
            return this.x;
        }

        public double getRoll() {
            return this.z;
        }

        public double getYaw() {
            return this.y;
        }

        public double getX() {
            return this.x;
        }

        public double getY() {
            return this.y;
        }

        public double getZ() {
            return this.z;
        }

        public EulerAngle slerp(EulerAngle a1, double t) {
            Quaternion q0 = asQuaternion();
            Quaternion q1 = a1.asQuaternion();

            Quaternion result = AngleKit.slerp(q0, q1, (float) t);
            return eulerFromQuat(result, getFormat());

        }

        public AxisAngle asAxisAngle() {
            return convertEulerToAxisAngle(this);
        }

        public Quaternion asQuaternion() {
            return quatFromEuler(this);
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }

    }

    /*
     * QUICK CONVERSIONS BETWEEN ANGLE FORMATS
     */

    private static double rad(double deg) {
        return Math.toRadians(deg);
    }

    private static double deg(double rad) {
        return Math.toDegrees(rad);
    }

    private static float rad(float deg) {
        return (float) Math.toRadians(deg);
    }

    private static float deg(float rad) {
        return (float) Math.toDegrees(rad);
    }

    public static EulerAngle eulerFromQuat(Quaternion q1, Format format) {
        double t0, t1, t2, t3, t4, yaw, pitch, roll;

        t0 = 2.0 * (q1.w * q1.x + q1.y * q1.z);
        t1 = 1.0 - 2.0 * (q1.x * q1.x + q1.y * q1.y);
        roll = Math.atan2(t0, t1);
        t2 = 2.0 * (q1.w * q1.y - q1.z * q1.x);

        if (t2 > 1) {
            t2 = 1;
        }

        if (t2 < -1) {
            t2 = -1;
        }

        pitch = Math.asin(t2);

        t3 = 2.0 * (q1.w * q1.z + q1.x * q1.y);
        t4 = 1.0 - 2.0 * (q1.y * q1.y + q1.z * q1.z);
        yaw = Math.atan2(t3, t4);

        if (format == Format.DEGREES) {
            yaw = deg(yaw);
            pitch = deg(pitch);
            roll = deg(roll);
        }

        return new EulerAngle(format, pitch, yaw, roll);

        /*
         * double yaw, pitch, roll;
         *
         * double test = q1.x * q1.y + q1.z * q1.w; if (test > 0.499) { // singularity
         * at north pole yaw = 2 * Math.atan2(q1.x, q1.w); pitch = Math.PI / 2; roll =
         * 0;
         *
         * if (format == Format.DEGREES) { yaw = deg(yaw); pitch = deg(pitch); roll =
         * deg(roll); }
         *
         * return new EulerAngle(format, pitch, yaw, roll); // return new double[] {
         * yaw, pitch, roll }; } if (test < -0.499) { // singularity at south pole yaw =
         * -2 * Math.atan2(q1.x, q1.w); pitch = -Math.PI / 2; roll = 0;
         *
         * if (format == Format.DEGREES) { yaw = deg(yaw); pitch = deg(pitch); roll =
         * deg(roll); }
         *
         * return new EulerAngle(format, pitch, yaw, roll); // return new double[] {
         * yaw, pitch, roll }; } double sqx = q1.x * q1.x; double sqy = q1.y * q1.y;
         * double sqz = q1.z * q1.z; yaw = Math.atan2(2 * q1.y * q1.w - 2 * q1.x * q1.z,
         * 1 - 2 * sqy - 2 * sqz); pitch = Math.asin(2 * test); roll = Math.atan2(2 *
         * q1.x * q1.w - 2 * q1.y * q1.z, 1 - 2 * sqx - 2 * sqz);
         *
         * if (format == Format.DEGREES) { yaw = deg(yaw); pitch = deg(pitch); roll =
         * deg(roll); } return new EulerAngle(format, pitch, yaw, roll); // return new
         * double[] { yaw, pitch, roll };
         */
    }

    public static Quaternion quatFromEuler(EulerAngle euler) {
        return quatFromEuler(euler.getYaw(), euler.getPitch(), euler.getRoll(), euler.getFormat());
    }

    public static Quaternion quatFromEuler(float yaw, float pitch, float roll, Format format) {
        return quatFromEuler((double) yaw, (double) pitch, (double) roll, format);
    }

    /**
     * https://www.javatips.net/api/robotutils-master/src/main/java/robotutils/Quaternion.java
     *
     * @param roll
     * @param pitch
     * @param yaw
     *
     * @return
     */

    public static Quaternion quatFromEuler(double yaw, double pitch, double roll, Format format) {

        Quaternion quat = new Quaternion();
        if (format == Format.DEGREES) {
            yaw = rad(yaw);
            pitch = rad(pitch);
            roll = rad(roll);
        }

        // roll -> pitch
        // pitch -> yaw
        // roll ->

        quat.x = (float) (Math.sin(roll / 2) * Math.cos(pitch / 2) * Math.cos(yaw / 2)
                - Math.cos(roll / 2) * Math.sin(pitch / 2) * Math.sin(yaw / 2));
        quat.y = (float) (Math.cos(roll / 2) * Math.sin(pitch / 2) * Math.cos(yaw / 2)
                + Math.sin(roll / 2) * Math.cos(pitch / 2) * Math.sin(yaw / 2));
        quat.z = (float) (Math.cos(roll / 2) * Math.cos(pitch / 2) * Math.sin(yaw / 2)
                - Math.sin(roll / 2) * Math.sin(pitch / 2) * Math.cos(yaw / 2));
        quat.w = (float) (Math.cos(roll / 2) * Math.cos(pitch / 2) * Math.cos(yaw / 2)
                + Math.sin(roll / 2) * Math.sin(pitch / 2) * Math.sin(yaw / 2));

        return quat;

        /*
         * double q[] = new double[4];
         *
         * // Apply Euler angle transformations // Derivation from
         * www.euclideanspace.com double c1 = Math.cos(yaw/2.0); double s1 =
         * Math.sin(yaw/2.0); double c2 = Math.cos(pitch/2.0); double s2 =
         * Math.sin(pitch/2.0); double c3 = Math.cos(roll/2.0); double s3 =
         * Math.sin(roll/2.0); double c1c2 = c1*c2; double s1s2 = s1*s2;
         *
         * // Compute quaternion from components q[0] = c1c2*c3 - s1s2*s3; q[1] =
         * c1c2*s3 + s1s2*c3; q[2] = s1*c2*c3 + c1*s2*s3; q[3] = c1*s2*c3 - s1*c2*s3;
         *
         * return new Quaternion((float) q[0],(float) q[1], (float) q[2], (float) q[3]);
         */
    }

    /**
     * Thank you Drillgon for donating this method :)
     *
     * @param v0
     * @param v1
     * @param t
     *
     * @return
     */
    public static Quaternion slerp(Quaternion v0, Quaternion v1, float t) {
        // Only unit quaternions are valid rotations.
        // Normalize to avoid undefined behavior.
        // Drillgon200: Any quaternions loaded from blender should be normalized already
        // v0.normalise();
        // v1.normalise();

        // Compute the cosine of the angle between the two vectors.
        double dot = Quaternion.dot(v0, v1);

        // If the dot product is negative, slerp won't take
        // the shorter path. Note that v1 and -v1 are equivalent when
        // the negation is applied to all four components. Fix by
        // reversing one quaternion.
        if (dot < 0.0f) {
            v1 = new Quaternion(-v1.x, -v1.y, -v1.z, -v1.w);
            dot = -dot;
        }

        final double DOT_THRESHOLD = 0.9999999;
        if (dot > DOT_THRESHOLD) {
            // If the inputs are too close for comfort, linearly interpolate
            // and normalize the result.
            Quaternion result = new Quaternion(v0.x + t * v1.x, v0.y + t * v1.y, v0.z + t * v1.z, v0.w + t * v1.w);
            result.normalise();
            return result;
        }

        // Since dot is in range [0, DOT_THRESHOLD], acos is safe
        double theta_0 = Math.acos(dot); // theta_0 = angle between input vectors
        double theta = theta_0 * t; // theta = angle between v0 and result
        double sin_theta = Math.sin(theta); // compute this value only once
        double sin_theta_0 = Math.sin(theta_0); // compute this value only once

        float s0 = (float) (Math.cos(theta) - dot * sin_theta / sin_theta_0); // == sin(theta_0 - theta) / sin(theta_0)
        float s1 = (float) (sin_theta / sin_theta_0);

        return new Quaternion(s0 * v0.x + s1 * v1.x, s0 * v0.y + s1 * v1.y, s0 * v0.z + s1 * v1.z,
                s0 * v0.w + s1 * v1.w);
    }

    public static AxisAngle convertEulerToAxisAngle(EulerAngle euler) {
        return convertEulerToAxisAngle(euler.getYaw(), euler.getPitch(), euler.getRoll(), euler.getFormat());
    }

    /**
     * Double format of
     * {@link #convertEulerToAxisAngle(float, float, float, Format)}
     *
     * @param yaw
     * @param pitch
     * @param roll
     * @param format
     *
     * @return
     */
    public static AxisAngle convertEulerToAxisAngle(double yaw, double pitch, double roll, Format format) {
        return convertEulerToAxisAngle((float) yaw, (float) pitch, (float) roll, format);
    }

    /**
     * Converts euler angles to axis angle rotation
     * https://www.euclideanspace.com/maths/geometry/rotations/conversions/eulerToAngle/
     *
     * @param yaw (Y)
     * @param pitch (X)
     * @param roll (Z)
     * @param format type of angle to export as
     *
     * @return { Angle, x, y, z }
     */
    public static AxisAngle convertEulerToAxisAngle(float yaw, float pitch, float roll, Format format) {

        if (format == Format.DEGREES) {
            yaw = rad(yaw);
            pitch = rad(pitch);
            roll = rad(roll);
        }

        float c1, c2, c3, s1, s2, s3;
        c1 = (float) Math.cos(yaw / 2.0);
        c2 = (float) Math.cos(pitch / 2.0);
        c3 = (float) Math.cos(roll / 2.0);

        s1 = (float) Math.sin(yaw / 2.0);
        s2 = (float) Math.sin(pitch / 2.0);
        s3 = (float) Math.sin(roll / 2.0);

        float x, y, z;
        x = s1 * s2 * c3 + c1 * c2 * s3;
        y = s1 * c2 * c3 + c1 * s2 * s3;
        z = c1 * s2 * c3 - s1 * c2 * s3;

        float angle = (float) (2 * Math.acos(c1 * c2 * c3 - s1 * s2 * s3));
        float length = x * x + y * y + z * z;

        if (length < 0.001) {
            x = 1;
            y = 0;
            z = 0;
        } else {
            length = (float) Math.sqrt(length);
        }

        x /= length;
        y /= length;
        z /= length;

        if (format == Format.DEGREES) {
            angle = deg(angle);
        }

        return new AxisAngle(format, angle, x, y, z);

    }

    /**
     * https://math.stackexchange.com/questions/4383841/quaternion-to-euler-angles
     *
     * @param format
     * @param q0
     *
     * @return
     */
    public static AxisAngle quatToAxisAngle(Format format, Quaternion q0) {
        double angle, x, y, z;

        if (q0.w > 1) {
            q0.normalise();
        }
        angle = 2 * Math.acos(q0.w);
        double s = Math.sqrt(1 - q0.w * q0.w);
        if (s < 0.001) {
            x = q0.x;
            y = q0.y;
            z = q0.z;
        } else {
            x = q0.x / s;
            y = q0.y / s;
            z = q0.z / 2;
        }

        if (format == Format.DEGREES) {
            angle = deg(angle);
        }

        return new AxisAngle(format, angle, x, y, z);

    }

}
