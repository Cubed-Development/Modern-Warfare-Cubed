package com.paneedah.weaponlib.render;

import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.*;

import java.nio.ByteBuffer;

public class ShellRenderer {
	
	public static ByteBuffer buf = GLAllocation.createDirectByteBuffer(4*9);
	
	
	
	public static final int VERTEX_BYTES = 3*4;
	
	public static final int FLOAT_SIZE = 4;
	public static final int INSTANCE = 5;
	
	
	public static ByteBuffer bufferDatapos = GLAllocation.createDirectByteBuffer(FLOAT_SIZE*INSTANCE*3);
	
	public static int vertexBuffer;
	public static int positionBuffer;
	
	public static int arrayBuffer;
	public static int elementBuffer;
	public static int vao;
	
	public static boolean loaded = false;
	
	public static void init() {
		if(loaded) return;
		loaded = true;
		addVertex(new Vec3d(0, 0, 0));
		addVertex(new Vec3d(0, 1, 0));
		addVertex(new Vec3d(0, 0, 1));
		buf.rewind();
		
		vertexBuffer = GL15.glGenBuffers();
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vertexBuffer);
		GL15.glBufferData(GL15.GL_ARRAY_BUFFER, buf, GL15.GL_STATIC_DRAW);
		
		positionBuffer = GL15.glGenBuffers();
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vertexBuffer);
		GL15.glBufferData(GL15.GL_ARRAY_BUFFER, FLOAT_SIZE*3*INSTANCE, GL15.GL_STREAM_DRAW);
	
		
		// update position
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, positionBuffer);
		GL15.glBufferData(GL15.GL_ARRAY_BUFFER, FLOAT_SIZE*INSTANCE*3, GL15.GL_STREAM_DRAW);
		GL15.glBufferSubData(GL15.GL_ARRAY_BUFFER, 0, bufferDatapos);
		
		GL30.glBindVertexArray(0);
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
		//GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, 0);
		
		
				
	}
	
	public static void use() {
		
		GL20.glEnableVertexAttribArray(0);
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vertexBuffer);
		GL20.glVertexAttribPointer(0, 3, GL11.GL_FLOAT, false, VERTEX_BYTES, 0);
		
		GL20.glEnableVertexAttribArray(1);
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, positionBuffer);
		GL20.glVertexAttribPointer(1, 3, GL11.GL_FLOAT, false, VERTEX_BYTES, 0);
		
		GL33.glVertexAttribDivisor(0, 0);
		GL33.glVertexAttribDivisor(1, 1);
		
		GL11.glEnableClientState(GL11.GL_VERTEX_ARRAY);
		GL11.glEnableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
		GL11.glEnableClientState(GL11.GL_COLOR_ARRAY);
		
		GL31.glDrawArraysInstanced(GL11.GL_TRIANGLES, 0, 3, INSTANCE);
		
		unbindVAO();
		//GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, 0);
		
	}
	
	public static void unbindVAO() {
		GL11.glDisableClientState(GL11.GL_VERTEX_ARRAY);
		GL11.glDisableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
		GL11.glDisableClientState(GL11.GL_COLOR_ARRAY);
		GL30.glBindVertexArray(0);
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
	}
	
	public static void generateVAO() {
		
	}
	
	public static void addVertex(Vec3d pos) {
		buf.putFloat((float) pos.x);
		buf.putFloat((float) pos.y);
		buf.putFloat((float) pos.z);
	}

}
