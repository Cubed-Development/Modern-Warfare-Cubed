package com.paneedah.weaponlib.animation;

import com.paneedah.weaponlib.RenderContext;
import com.paneedah.weaponlib.RenderableState;
import org.lwjgl.opengl.GL11;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Transform {
	
	public static final Transform NULL = new Transform().withPosition(0, 0, 0).withRotation(0, 0, 0).withRotationPoint(0, 0, 0).withScale(1, 1, 1);
	
	private double[] scale = new double[3];
	private double[] rotation = new double[3];
	private double[] position = new double[3];
	private double[] rotationPoint = new double[3];
	
	public Transform() {
		
	
		
	}
	
	public Transform withScale(double x, double y, double z) {
		scale[0] = x;
		scale[1] = y;
		scale[2] = z;
		return this;
	}
	
	public Transform withPosition(double x, double y, double z) {
		position[0] = x;
		position[1] = y;
		position[2] = z;
		return this;
	}
	
	/**
	 * When going from BB edit mode to the game, the X and Y rotations are inverted. This method will automatically do
	 * that for you.
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public Transform withBBRotation(double x, double y, double z) {
		rotation[0] = -x;
		rotation[1] = -y;
		rotation[2] = z;
		return this;
	}
	
	public Transform withRotation(double x, double y, double z) {
		rotation[0] = x;
		rotation[1] = y;
		rotation[2] = z;
		return this;
	}
	
	public Transform addTransformConditional(Supplier<Boolean> condition, double x, double y, double z) {
		if(!condition.get()) return this;
		return addTransform(x, y, z);
	}
	
	public Transform addTransform(double x, double y, double z) {
		position[0] += x;
		position[1] += y;
		position[2] += z;
		return this;
	}
	
	
	public Transform withRotationPoint(double x, double y, double z) {
		rotationPoint[0] = x;
		rotationPoint[1] = y;
		rotationPoint[2] = z;
		return this;
	}
	
	/*
	 * Transforms
	 */
	
	
	public double getPositionX() {
		return position[0];
	}
	
	public double getPositionY() {
		return position[1];
	}
	
	public double getPositionZ() {
		return position[2];
	}
	
	/*
	 * Rotations
	 */
	
	public double getRotationX() {
		return rotation[0];
	}
	
	public double getRotationY() {
		return rotation[1];
	}
	
	public double getRotationZ() {
		return rotation[2];
	}
	
	/*
	 * Scale
	 */
	
	public double getScaleX() {
		return scale[0];
	}
	
	public double getScaleY() {
		return scale[1];
	}
	
	public double getScaleZ() {
		return scale[2];
	}
	
	/*
	 * Rotation Point
	 */
	
	public double getRotationPointX() {
		return rotationPoint[0];
	}
	
	public double getRotationPointY() {
		return rotationPoint[1];
	}
	
	public double getRotationPointZ() {
		return rotationPoint[2];
	}
	
	
	private double[] copyArray(double[] array) {
		double[] newArray = new double[array.length];
		for(int i = 0; i < array.length; ++i) {
			newArray[i] = array[i];
		}
		return newArray;
	}
	
	public void set(Transform t) {
		this.position = copyArray(t.position);
		this.rotation = copyArray(t.rotation);
		this.rotationPoint = copyArray(t.rotationPoint);
		this.scale = copyArray(t.scale);
	}
	
	public Transform copy() {
		Transform nT = new Transform();
		nT.position = copyArray(position);
		nT.rotation = copyArray(rotation);
		nT.rotationPoint = copyArray(rotationPoint);
		nT.scale = copyArray(scale);
		return nT;
	}
	
	/*
	 * Export to VMW
	 */
	
	public Consumer<RenderContext<RenderableState>> getAsPosition() {
		return (renderContext) -> {
			doGLDirect();
			/*
			GL11.glTranslated(getPositionX(), getPositionY(), getPositionZ());
			GL11.glTranslated(getRotationPointX(), getRotationPointY(), getRotationPointZ());
			GL11.glRotated(getRotationZ(), 0, 0, 1);
			GL11.glRotated(getRotationY(), 0, 1, 0);
			GL11.glRotated(getRotationX(), 1, 0, 0);
			GL11.glTranslated(-getRotationPointX(), -getRotationPointY(), -getRotationPointZ());
			GL11.glScaled(getScaleX(), getScaleY(), getScaleZ());
			*/
		};
		
	}
	public void doGLDirect() {
		GL11.glTranslated(getPositionX(), getPositionY(), getPositionZ());
		GL11.glTranslated(getRotationPointX(), getRotationPointY(), getRotationPointZ());
		GL11.glRotated(getRotationZ(), 0, 0, 1);
		GL11.glRotated(getRotationY(), 0, 1, 0);
		GL11.glRotated(getRotationX(), 1, 0, 0);
		GL11.glTranslated(-getRotationPointX(), -getRotationPointY(), -getRotationPointZ());
		GL11.glScaled(getScaleX(), getScaleY(), getScaleZ());
	}
	
	public void printTransform() {
		
		
		
		StringBuilder result = new StringBuilder();
		result.append(String.format("new Transform()"));
		result.append(String.format("\n.withPosition(%ff, %ff, %ff)", getPositionX(), getPositionY(),
				getPositionZ()));
		result.append(String.format("\n.withRotation(%ff, %ff, %ff)", getRotationX(), getRotationY(),
				getRotationZ()));
		
	
		result.append(String.format("\n.withRotationPoint(%ff, %ff, %ff)", getRotationPointX(), getRotationPointY(), getRotationPointZ()));
		result.append(String.format("\n.withScale(%ff, %ff, %ff)", getScaleX(), getScaleY(), getScaleZ()));
		
		System.out.println("\n" + result);
	}
	

}
