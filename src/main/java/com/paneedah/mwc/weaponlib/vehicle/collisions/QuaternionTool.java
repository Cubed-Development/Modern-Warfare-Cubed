package com.paneedah.mwc.weaponlib.vehicle.collisions;

import javax.vecmath.Matrix3f;
import javax.vecmath.Quat4f;

public class QuaternionTool {
	
	public static void matrixFromQuat(Matrix3f m, Quat4f q){
		m.m00 = 1-2*q.y*q.y-2*q.z*q.z;
		m.m01 = 2*q.x*q.y-2*q.z*q.w;
		m.m02 = 2*q.x*q.z+2*q.y*q.w;
		
		m.m10 = 2*q.x*q.y+2*q.z*q.w;
		m.m11 = 1-2*q.x*q.x-2*q.z*q.z;
		m.m12 = 2*q.y*q.z-2*q.x*q.w;
		
		m.m20 = 2*q.x*q.z-2*q.y*q.w;
		m.m21 = 2*q.y*q.z+2*q.x*q.w;
		m.m22 = 1-2*q.x*q.x-2*q.y*q.y;
	}
	
	
	public static void setFromMat(Quat4f q, Matrix3f mat){
		setFromMat(q, mat.m00, mat.m01, mat.m02, mat.m10, mat.m11, mat.m12, mat.m20, mat.m21, mat.m22);
	}
	
	public static void setFromMat(Quat4f q, float m00, float m01, float m02, float m10,
			float m11, float m12, float m20, float m21, float m22) {

		float s;
		float tr = m00 + m11 + m22;
		if (tr >= 0.0) {
			s = (float) Math.sqrt(tr + 1.0);
			q.w = s * 0.5f;
			s = 0.5f / s;
			q.x = (m21 - m12) * s;
			q.y = (m02 - m20) * s;
			q.z = (m10 - m01) * s;
		} else {
			float max = Math.max(Math.max(m00, m11), m22);
			if (max == m00) {
				s = (float) Math.sqrt(m00 - (m11 + m22) + 1.0);
				q.x = s * 0.5f;
				s = 0.5f / s;
				q.y = (m01 + m10) * s;
				q.z = (m20 + m02) * s;
				q.w = (m21 - m12) * s;
			} else if (max == m11) {
				s = (float) Math.sqrt(m11 - (m22 + m00) + 1.0);
				q.y = s * 0.5f;
				s = 0.5f / s;
				q.z = (m12 + m21) * s;
				q.x = (m01 + m10) * s;
				q.w = (m02 - m20) * s;
			} else {
				s = (float) Math.sqrt(m22 - (m00 + m11) + 1.0);
				q.z = s * 0.5f;
				s = 0.5f / s;
				q.x = (m20 + m02) * s;
				q.y = (m12 + m21) * s;
				q.w = (m10 - m01) * s;
			}
		}
	}

}
