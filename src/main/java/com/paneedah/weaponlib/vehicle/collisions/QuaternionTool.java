package com.paneedah.weaponlib.vehicle.collisions;

import javax.vecmath.Matrix3f;
import javax.vecmath.Quat4f;

public class QuaternionTool {

    public static void matrixFromQuat(Matrix3f m, Quat4f q) {
        m.m00 = 1 - 2 * q.y * q.y - 2 * q.z * q.z;
        m.m01 = 2 * q.x * q.y - 2 * q.z * q.w;
        m.m02 = 2 * q.x * q.z + 2 * q.y * q.w;

        m.m10 = 2 * q.x * q.y + 2 * q.z * q.w;
        m.m11 = 1 - 2 * q.x * q.x - 2 * q.z * q.z;
        m.m12 = 2 * q.y * q.z - 2 * q.x * q.w;

        m.m20 = 2 * q.x * q.z - 2 * q.y * q.w;
        m.m21 = 2 * q.y * q.z + 2 * q.x * q.w;
        m.m22 = 1 - 2 * q.x * q.x - 2 * q.y * q.y;
    }


    public static void setFromMat(Quat4f q, Matrix3f mat) {
        setFromMat(q, mat.m00, mat.m01, mat.m02, mat.m10, mat.m11, mat.m12, mat.m20, mat.m21, mat.m22);
    }

    public static void setFromMat(Quat4f q, float m00, float m01, float m02, float m10,
                                  float m11, float m12, float m20, float m21, float m22) {

        RigidBody.setFromMat(q, m00, m01, m02, m10, m11, m12, m20, m21, m22);
    }

}
