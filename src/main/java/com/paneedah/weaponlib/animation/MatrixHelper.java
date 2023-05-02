package com.paneedah.weaponlib.animation;

import net.minecraft.util.math.Vec3d;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Quaternion;

import javax.vecmath.Vector3d;
import java.nio.FloatBuffer;

public class MatrixHelper {
	
	
	/*
	 * BEEZER lmao
	 */
	//https://danceswithcode.net/engineeringnotes/rotations_in_3d/rotations_in_3d_part2.html
	public static Matrix4f yawPitchRollToMatrix( 
            double yaw,     //Yaw   angle (radians)
            double pitch,   //Pitch angle (radians)
            double roll )   //Roll  angle (radians)
{
        //Precompute sines and cosines of Euler angles
        double su = Math.sin(roll);
        double cu = Math.cos(roll);
        double sv = Math.sin(pitch);
        double cv = Math.cos(pitch);
        double sw = Math.sin(yaw);
        double cw = Math.cos(yaw);
        
        //Create and populate RotationMatrix
        Matrix4f A = new Matrix4f();
        A.m00 = (float) (cv*cw);
        A.m10 = (float) (su*sv*cw - cu*sw);
        A.m20 = (float) (su*sw + cu*sv*cw);
        A.m01 = (float) (cv*sw);
        A.m11 = (float) (cu*cw + su*sv*sw);
        A.m21 = (float) (cu*sv*sw - su*cw);
        A.m02 = (float) -sv;
        A.m12 = (float) (su*cv);
        A.m22 = (float) (cu*cv);        
        
     
        return A;
}
	
	public static double[] MatrixToYawPitchRoll( Matrix4f mat)	{
	        double[] angle = new double[3];
	        angle[1] = -Math.asin( mat.m02 );  //Pitch

	        //Gymbal lock: pitch = -90
	        if( mat.m02 == 1 ){    
	            angle[0] = 0.0;             //yaw = 0
	            angle[2] = Math.atan2( -mat.m10, -mat.m20 );    //Roll
	            System.out.println("Gimbal lock: pitch = -90");
	        }

	        //Gymbal lock: pitch = 90
	        else if( mat.m02 == -1 ){    
	            angle[0] = 0.0;             //yaw = 0
	            angle[2] = Math.atan2( mat.m10, mat.m20 );    //Roll
	            System.out.println("Gimbal lock: pitch = 90");
	        }
	        //General solution
	        else{
	            angle[0] = Math.atan2(  mat.m01, mat.m00 );
	            angle[2] = Math.atan2(  mat.m12, mat.m22 );
	            System.out.println("No gimbal lock");
	        }
	        return angle;   //Euler angles in order yaw, pitch, roll
	}
	
	public static void scaleFloatBuffer(FloatBuffer matrix, Vec3d scale) {
		matrix.put(0, (float) (matrix.get(0)*scale.x));
		matrix.put(4, (float) (matrix.get(4)*scale.x));
		matrix.put(8, (float) (matrix.get(8)*scale.x));
		matrix.put(12, (float) (matrix.get(12)*scale.x));
		
		matrix.put(1, (float) (matrix.get(1)*scale.y));
		matrix.put(5, (float) (matrix.get(5)*scale.y));
		matrix.put(9, (float) (matrix.get(9)*scale.y));
		matrix.put(13, (float) (matrix.get(13)*scale.y));
		
		matrix.put(2, (float) (matrix.get(2)*scale.z));
		matrix.put(6, (float) (matrix.get(6)*scale.z));
		matrix.put(10, (float) (matrix.get(10)*scale.z));
		matrix.put(14, (float) (matrix.get(14)*scale.z));
	}
	
	public static Vec3d extractScale(Matrix4f mat) {
		
	
		
		
		Vec3d a = new Vec3d(mat.m00, mat.m01, mat.m02);
		Vec3d b = new Vec3d(mat.m10, mat.m11, mat.m12);
		Vec3d c = new Vec3d(mat.m20, mat.m21, mat.m22);
		
		Vec3d scale = new Vec3d(a.length(), b.length(), c.length());
		
		
		mat.m00 /= (float) scale.x;
		mat.m01 /= (float) scale.x;
		mat.m02 /= (float) scale.x;
		
		mat.m10/= (float) scale.y;
		mat.m11/= (float) scale.y;
		mat.m12 /= (float) scale.y;
		
		mat.m20/= (float) scale.z;
		mat.m21 /= (float) scale.z;
		mat.m22 /= (float) scale.z;
		
		
		/*
		Vec3d a = new Vec3d(mat.m00, mat.m10, mat.m20);
		Vec3d b = new Vec3d(mat.m01, mat.m11, mat.m21);
		Vec3d c = new Vec3d(mat.m02, mat.m12, mat.m22);
		
		Vec3d scale = new Vec3d(a.length(), b.length(), c.length());
		
		
		mat.m00 /= (float) scale.x;
		mat.m10 /= (float) scale.x;
		mat.m20 /= (float) scale.x;
		
		mat.m01/= (float) scale.y;
		mat.m11/= (float) scale.y;
		mat.m21 /= (float) scale.y;
		
		mat.m02/= (float) scale.z;
		mat.m12 /= (float) scale.z;
		mat.m22 /= (float) scale.z;
		*/
		return scale;
	}
	
	public static Vec3d extractScaleOld(Matrix4f mat) {
		Vec3d a = new Vec3d(mat.m00, mat.m10, mat.m20);
		Vec3d b = new Vec3d(mat.m01, mat.m11, mat.m21);
		Vec3d c = new Vec3d(mat.m02, mat.m12, mat.m22);
		
		Vec3d scale = new Vec3d(a.length(), b.length(), c.length());
		
		
		mat.m00 /= (float) scale.x;
		mat.m10 /= (float) scale.x;
		mat.m20 /= (float) scale.x;
		
		mat.m01/= (float) scale.y;
		mat.m11/= (float) scale.y;
		mat.m21 /= (float) scale.y;
		
		mat.m02/= (float) scale.z;
		mat.m12 /= (float) scale.z;
		mat.m22 /= (float) scale.z;
		return scale;
	}
	
	public static Vec3d restoreScale(Matrix4f mat, Vec3d scale) {
		
	
		mat.m00 *= (float) scale.x;
		mat.m10 *= (float) scale.x;
		mat.m20 *= (float) scale.x;
		
		mat.m01 *= (float) scale.y;
		mat.m11 *= (float) scale.y;
		mat.m21 *= (float) scale.y;
		
		mat.m02 *= (float) scale.z;
		mat.m12 *= (float) scale.z;
		mat.m22 *= (float) scale.z;
		
		return scale;
	}
	
	public static Vec3d lerpVectors(Vector3d a, Vector3d b, float t) {
		return lerpVectors(new Vec3d(a.x, a.y, a.z), new Vec3d(b.x, b.y, b.z), t);
	}
	
	public static Vec3d lerpVectors(Vec3d a, Vec3d b, float t) {
		return new Vec3d(solveLerp((float) a.x, (float) b.x, t),
						 solveLerp((float) a.y, (float) b.y, t),
						 solveLerp((float) a.z, (float) b.z, t));
	}
	
	public static Matrix4f buildTranslation(float x, float y, float z) {
		return build(1f, 0f, 0f, x,
				0f, 1f, 0f, y,
				0f, 0f, 1f, z,
				0f, 0f, 0f, 1.0f);
	}
	
	public static Matrix4f build(float m00, float m10, float m20, float m30,
			float m01, float m11, float m21, float m31, 
			float m02, float m12, float m22, float m32, 
			float m03, float m13, float m23, float m33) {
		
		Matrix4f m = new Matrix4f();
		
		m.m00 = m00;
		m.m01 = m01;
		m.m02 = m02;
		m.m03 = m03;
		
		m.m10 = m10;
		m.m11 = m11;
		m.m12 = m12;
		m.m13 = m13;
		
		m.m20 = m20;
		m.m21 = m21;
		m.m22 = m22;
		m.m23 = m23;
		
		m.m30 = m30;
		m.m31 = m31;
		m.m32 = m32;
		m.m33 = m33;
		
		return m;
		
		
	}
	
	/**
	 * Thank you Drillgon for donating this method :)
	 * @param v0
	 * @param v1
	 * @param t
	 * @return
	 */
	public static Quaternion slerp(Quaternion v0, Quaternion v1, float t) {
			// Only unit quaternions are valid rotations.
		    // Normalize to avoid undefined behavior.
			//Drillgon200: Any quaternions loaded from blender should be normalized already
		    //v0.normalise();
		    //v1.normalise();

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
		        Quaternion result = new Quaternion(v0.x + t*v1.x, 
		        								v0.y + t*v1.y, 
		        								v0.z + t*v1.z, 
		        								v0.w + t*v1.w);
		        result.normalise();
		        return result;
		    }

		    // Since dot is in range [0, DOT_THRESHOLD], acos is safe
		    double theta_0 = Math.acos(dot);        // theta_0 = angle between input vectors
		    double theta = theta_0*t;          // theta = angle between v0 and result
		    double sin_theta = Math.sin(theta);     // compute this value only once
		    double sin_theta_0 = Math.sin(theta_0); // compute this value only once

		    float s0 = (float) (Math.cos(theta) - dot * sin_theta / sin_theta_0);  // == sin(theta_0 - theta) / sin(theta_0)
		    float s1 = (float) (sin_theta / sin_theta_0);

		    return new Quaternion(s0*v0.x + s1*v1.x, 
		    					s0*v0.y + s1*v1.y, 
		    					s0*v0.z + s1*v1.z, 
		    					s0*v0.w + s1*v1.w);
	}
	
	public static float solveBeizer(float a, float b, float c, float t) {
		return (float) (Math.pow(1 - t, 2) * a + 2 * t * (1 - t) * b + t*t * c);
	}
	
	public static Vec3d solveBeizer(Vec3d before, Vec3d after, Vec3d beizer, double t) {
		double x = solveBeizer((float) before.x,(float)  beizer.x,(float)  after.x, (float) t);
		double y = solveBeizer((float) before.y,(float)  beizer.y,(float)  after.y, (float) t);
		double z = solveBeizer((float) before.z,(float)  beizer.z,(float)  after.z, (float) t);
		return new Vec3d(x, y, z);
	}
	
	public static float solveLerp(float a, float b, float t) {
		return a + (b-a)*t;
	}
	
	public static double solveLerp(double a, double b, double t) {
		return a + (b-a)*t;
	}
	
	public static Matrix4f beizerInterpolation(Matrix4f a, Matrix4f b, Matrix4f c, float t, boolean doRotation) {
		Matrix4f newMatrix = new Matrix4f();
		
		//System.out.println(b);
		
		if(doRotation) {
			newMatrix.m00 = solveBeizer(a.m00, b.m00, c.m00, t);
			newMatrix.m01 = solveBeizer(a.m01, b.m01, c.m01, t);
			newMatrix.m02 = solveBeizer(a.m02, b.m02, c.m02, t);
			newMatrix.m03 = solveBeizer(a.m03, b.m03, c.m03, t);
			
			newMatrix.m10 = solveBeizer(a.m10, b.m10, c.m10, t);
			newMatrix.m11 = solveBeizer(a.m11, b.m11, c.m11, t);
			newMatrix.m12 = solveBeizer(a.m12, b.m12, c.m12, t);
			newMatrix.m13 = solveBeizer(a.m13, b.m13, c.m13, t);
			
			newMatrix.m20 = solveBeizer(a.m20, b.m20, c.m20, t);
			newMatrix.m21 = solveBeizer(a.m21, b.m21, c.m21, t);
			newMatrix.m22 = solveBeizer(a.m22, b.m22, c.m22, t);
			newMatrix.m23 = solveBeizer(a.m23, b.m23, c.m23, t);
		} else {
			
			float factor = t*t*(3-(2*t));
			
			newMatrix.m00 = solveLerp(a.m00, b.m00, factor);
			newMatrix.m01 = solveLerp(a.m01, b.m01, factor);
			newMatrix.m02 = solveLerp(a.m02, b.m02, factor);
			newMatrix.m03 = solveLerp(a.m03, b.m03, factor);

			newMatrix.m10 =solveLerp(a.m10, b.m10, factor);
			newMatrix.m11 = solveLerp(a.m11, b.m11, factor);
			newMatrix.m12 = solveLerp(a.m12, b.m12, factor);
			newMatrix.m13 = solveLerp(a.m13, b.m13, factor);

			newMatrix.m20 =solveLerp(a.m20, b.m20, factor);
			newMatrix.m21 = solveLerp(a.m21, b.m21, factor);
			newMatrix.m22 = solveLerp(a.m22, b.m22, factor);
			newMatrix.m23 = solveLerp(a.m23, b.m23, factor);
		}
		
		
		newMatrix.m30 = solveBeizer(a.m30, b.m30, c.m30, t);
		newMatrix.m31 = solveBeizer(a.m31, b.m31, c.m31, t);
		newMatrix.m32 = solveBeizer(a.m32, b.m32, c.m32, t);
		newMatrix.m33 = solveBeizer(a.m33, b.m33, c.m33, t);
		
		
		
		
		return newMatrix;
		
	}
	

    public static void applyMatrix(Matrix4f m) { // TODO move out
        if(m == null) {
            return;
        }
        FloatBuffer buf = BufferUtils.createFloatBuffer(16);
        m.store(buf);
        buf.rewind();
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glMultMatrix(buf);
    }

    public static void loadMatrix(Matrix4f m) {
        if(m == null) {
            return;
        }
        FloatBuffer buf = BufferUtils.createFloatBuffer(16);
        m.store(buf);
        buf.rewind();
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glLoadMatrix(buf);
    }

    public static Matrix4f captureMatrix() {
        Matrix4f matrix;
        FloatBuffer buf = BufferUtils.createFloatBuffer(16);
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, buf);
        buf.rewind();
        matrix = new Matrix4f();
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        matrix.load(buf);
        return matrix;
    }
    
    public static FloatBuffer getModelViewMatrixBuffer() {
        FloatBuffer buf = BufferUtils.createFloatBuffer(16);
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, buf);
        buf.rewind();
        return buf;
    }
    
    public Matrix4f interpTwo(Matrix4f one, Matrix4f two, float f) {
Matrix4f result = new Matrix4f();

        
	result.m00 = solveLerp(one.m00, two.m00, f);
	result.m01 = solveLerp(one.m01, two.m01, f);
	result.m02 = solveLerp(one.m02, two.m02, f);
	result.m03 = solveLerp(one.m03, two.m03, f);
	
	result.m10 = solveLerp(one.m10, two.m10, f);
	result.m11 = solveLerp(one.m11, two.m11, f);
	result.m12 = solveLerp(one.m12, two.m12, f);
	result.m13 = solveLerp(one.m13, two.m13, f);
	
	result.m20 = solveLerp(one.m20, two.m20, f);
	result.m21 = solveLerp(one.m21, two.m21, f);
	result.m22 = solveLerp(one.m22, two.m22, f);
	result.m23 = solveLerp(one.m23, two.m23, f);
	
	result.m30 = solveLerp(one.m30, two.m30, f);
	result.m31 = solveLerp(one.m31, two.m31, f);
	result.m32 = solveLerp(one.m32, two.m32, f);
	result.m33 = solveLerp(one.m33, two.m33, f);
	
	


        return result;
    }

    public static Matrix4f interpolateMatrix(Matrix4f m, float factor, Interpolation interp) {
    	//factor = factor*factor*(3-(2*factor));
    	
    	factor = (float) interp.interpolate(factor);
    	//factor = factor*factor;
    	
    	
    	//factor = 1-((1-factor)*(1-factor));
    	
    	//	factor = factor;
    	//factor = Math.round(factor);
        Matrix4f result = new Matrix4f();

        
        result.m00 = m.m00 * factor;
        result.m01 = m.m01 * factor;
        result.m02 = m.m02 * factor;
        result.m03 = m.m03 * factor;

        result.m10 = m.m10 * factor;
        result.m11 = m.m11 * factor;
        result.m12 = m.m12 * factor;
        result.m13 = m.m13 * factor;

        result.m20 = m.m20 * factor;
        result.m21 = m.m21 * factor;
        result.m22 = m.m22 * factor;
        result.m23 = m.m23 * factor;

        result.m30 = m.m30 * factor;
        result.m31 = m.m31 * factor;
        result.m32 = m.m32 * factor;
        result.m33 = m.m33 * factor;

        return result;
    }
    
    /**
     * https://www.javatips.net/api/robotutils-master/src/main/java/robotutils/Quaternion.java
     * @param roll
     * @param pitch
     * @param yaw
     * @return
     */
    
    public static Quaternion fromEulerAngles(double roll, double pitch, double yaw) {
        double q[] = new double[4];
        
        // Apply Euler angle transformations
        // Derivation from www.euclideanspace.com
        double c1 = Math.cos(yaw/2.0);
        double s1 = Math.sin(yaw/2.0);
        double c2 = Math.cos(pitch/2.0);
        double s2 = Math.sin(pitch/2.0);
        double c3 = Math.cos(roll/2.0);
        double s3 = Math.sin(roll/2.0);
        double c1c2 = c1*c2;
        double s1s2 = s1*s2;
        
        // Compute quaternion from components
        q[0] = c1c2*c3 - s1s2*s3;
        q[1] = c1c2*s3 + s1s2*c3;
        q[2] = s1*c2*c3 + c1*s2*s3;
        q[3] = c1*s2*c3 - s1*c2*s3;
       
        return new Quaternion((float) q[0],(float)  q[1], (float) q[2], (float) q[3]);
    }
    
    /**
     * Returns the roll component of the quaternion if it is represented
     * as standard roll-pitch-yaw Euler angles.
     * @return the roll (x-axis rotation) of the robot.
     */
    public static double toRoll(Quaternion q) {
        // This is a test for singularities
        double test = q.x*q.y + q.z*q.w;
        
        // Special case for north pole
        if (test > SINGULARITY_NORTH_POLE)
            return 0;
        
        // Special case for south pole
        if (test < SINGULARITY_SOUTH_POLE)
            return 0;
            
        return Math.atan2( 
                    2*q.x*q.w - 2*q.y*q.z,
                    1 - 2*q.x*q.x - 2*q.z*q.z
                ); 
    }
    
    /**
     * Returns the pitch component of the quaternion if it is represented
     * as standard roll-pitch-yaw Euler angles.
     * @return the pitch (y-axis rotation) of the robot.
     */
    public static double toPitch(Quaternion q) {
        // This is a test for singularities
        double test = q.x*q.y + q.z*q.w;
        
        // Special case for north pole
        if (test > SINGULARITY_NORTH_POLE)
            return Math.PI/2;
        
        // Special case for south pole
        if (test < SINGULARITY_SOUTH_POLE)
            return -Math.PI/2;
        
        return Math.asin(2*test); 
    }
    
    /**
    * This defines the north pole singularity cutoff when converting 
    * from quaternions to Euler angles.
    */
   public static final double SINGULARITY_NORTH_POLE = 0.49999;
   
   /**
    * This defines the south pole singularity cutoff when converting 
    * from quaternions to Euler angles.
    */
   public static final double SINGULARITY_SOUTH_POLE = -0.49999;
    
    /**
     * Returns the yaw component of the quaternion if it is represented
     * as standard roll-pitch-yaw Euler angles.
     * @return the yaw (z-axis rotation) of the robot.
     */
    public static double toYaw(Quaternion q) {
        // This is a test for singularities
        double test = q.x*q.y + q.z*q.w;
        
        // Special case for north pole
        if (test > SINGULARITY_NORTH_POLE)
            return 2 * Math.atan2(q.x, q.w);
        
        // Special case for south pole
        if (test < SINGULARITY_SOUTH_POLE)
            return -2 * Math.atan2(q.x, q.w);
        
        return Math.atan2(
                    2*q.y*q.w - 2*q.x*q.z,
                    1 - 2*q.y*q.y - 2*q.z*q.z
                ); 

    }
    
    /**
     * Returns the components of the quaternion if it is represented
     * as standard roll-pitch-yaw Euler angles.
     * @return an array of the form {roll, pitch, yaw}.
     */
    public static double[] toEulerAngles(Quaternion q) {
        return new double[] { toRoll(q), toPitch(q), toYaw(q) };
    }
}
