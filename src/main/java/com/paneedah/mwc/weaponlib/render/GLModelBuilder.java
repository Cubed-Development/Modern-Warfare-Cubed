package com.paneedah.mwc.weaponlib.render;

import com.paneedah.mwc.weaponlib.render.WavefrontModel.Vertex;
import com.paneedah.mwc.weaponlib.render.bgl.GLCompatible;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL15;

import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;

public class GLModelBuilder {
	
	private static final int FLOAT_SIZE = 4;
	private static final int INT_SIZE = 4;
	
	/**
	 * Creates a static VBO
	 * 
	 * @param How many floats are you storing?
	 * @return The VBO's identity
	 */
	public static int createStaticBuffer(int floatCount) {
		int vbo = GL15.glGenBuffers();
		// bind vbo
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo);
		GL15.glBufferData(GL15.GL_ARRAY_BUFFER, floatCount * 4, GL15.GL_STATIC_DRAW);
		// unbind vbo
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
		return vbo;
	}
	
	public static int createElementBuffer(int floatcount) {
		int ebo = GL15.glGenBuffers();
		GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, ebo);
		GL15.glBufferData(GL15.GL_ELEMENT_ARRAY_BUFFER, floatcount*INT_SIZE, GL15.GL_STATIC_DRAW);
		
		return ebo;
	}
	
	public static void unbindElementBuffer() {
		GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, 0);
	}
	
	/**
	 * Creates & binds a new vertex array object
	 * 
	 * @return VAO handle
	 */
	public static int createVAO() {
		int vaoID = GLCompatible.glGenVertexArrays();
		GLCompatible.glBindVertexArray(vaoID);
		return vaoID;
	}
	
	
	/**
	 * Builds a VBO from a set of vertices.
	 * This will flip the v (u, v) coordinate of the 
	 * texture coordinates in order to make it work with Minecraft.
	 * 
	 * It does NOT unbind the VBO.
	 * 
	 * @param vertexes
	 * @return
	 */
	public static int buildVBO(ArrayList<Vertex> vertexes) {
		int vbo = GL15.glGenBuffers();
		
		FloatBuffer floatBuffer = BufferUtils.createFloatBuffer(vertexes.size()*(3+3+2));
		for(Vertex v : vertexes) {
			floatBuffer.put(v.pos);
			floatBuffer.put(new float[] {v.texCoord[0], -v.texCoord[1]});
			floatBuffer.put(v.normal);
		}
		floatBuffer.rewind();
		
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo);
		GL15.glBufferData(GL15.GL_ARRAY_BUFFER, floatBuffer, GL15.GL_STATIC_DRAW);
		
		return vbo;
	}
	

	

	

	
	public static void fillBuffer(DoubleBuffer nioBuffer, double[][] buf) {
		for(double[] sub : buf) {
			nioBuffer.put(sub);
		}
		nioBuffer.rewind();
	}
	
	public static void fillBuffer(FloatBuffer nioBuffer, float[][] buf) {
		for(float[] sub : buf) {
			nioBuffer.put(sub);
		}
		nioBuffer.rewind();
	}
	
	
	
	/**
	 * Unbinds the current vertex array object (by binding 0)
	 */
	public static void unbindVAO() {
		GLCompatible.glBindVertexArray(0);
	}

}
