package com.paneedah.mwc.weaponlib.render;

import com.paneedah.mwc.weaponlib.render.bgl.GLCompatible;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;

public class WavefrontModel {
	
	
	
	public  ArrayList<float[]> vertex = new ArrayList<>();
	public  ArrayList<float[]> texcoord = new ArrayList<>();
	public ArrayList<float[]> normals = new ArrayList<>();

	// modern
	public ArrayList<Integer> indexBuffer = new ArrayList<>();
	public ArrayList<Vertex> vertices = new ArrayList<>();
	
	// (Index, (posID + texID + normID))
	public HashMap<String, Integer> indexVertexMap = new HashMap<>();
	
	// GL INTEGERS
	protected int ebo = -1;
	protected int vao = -1;
	protected int vbo = -1;
	
	private boolean hasVAO;
	
	public static class Vertex {
		public float[] texCoord;
		public float[] pos;
		public float[] normal;
		
		public Vertex(float[] tex, float[] pos, float[] normal) {
			this.texCoord = tex;
			this.pos = pos;
			this.normal = normal;
		}
		
	}

	
	

	public WavefrontModel() {
		
	}
	
	public void buildIndexBuffer(String[] line) {
		for(int i = 1; i < line.length; ++i) {
			String[] subArray = line[i].split("/");
			String vertexID = subArray[0] + "t" + subArray[1] + "n" + subArray[2];
			if(indexVertexMap.containsKey(vertexID)) {
				//System.out.println(vertexID);
				indexBuffer.add(indexVertexMap.get(vertexID));
				//System.out.println(vertexID + " | " + indexVertexMap.get(vertexID) + " | " + vertices.get(indexVertexMap.get(vertexID)));
			} else {
				
				int newIndex = indexVertexMap.size();
				indexVertexMap.put(vertexID, newIndex);
				vertices.add(buildVertexFromString(subArray));
				indexBuffer.add(newIndex);
			}
		}
	}
	

	public boolean usesVAO() {
		return this.hasVAO;
	}
	
	public int getVAOID() {
		return this.vao;
	}
	
	public Vertex buildVertexFromString(String[] array) {
		int vertID = Integer.parseInt(array[0]);
		int texID = Integer.parseInt(array[1]);
		int normalID = Integer.parseInt(array[2]);
		
		/*
		if(texcoord.size() <= texID-1) {
			System.err.println("Trying to get texcoord at " + (texID-1) + " while there are only: " + texcoord.size());
		}
		
		if(vertex.size() <= vertID-1) {
			System.err.println("Trying to get texcoord at " + (texID-1) + " while there are only: " + texcoord.size());
		}
		
		if(texcoord.size() <= texID-1) {
			System.err.println("Trying to get texcoord at " + (texID-1) + " while there are only: " + texcoord.size());
		}
		*/
		Vertex vert = new Vertex(texcoord.get(texID-1), vertex.get(vertID-1), normals.get(normalID-1));
		
		return vert;
	}
	

	public void build() {
		
		// Fill the int buffer with data
		IntBuffer intBuf = BufferUtils.createIntBuffer(indexBuffer.size());
		for(int i : indexBuffer) {
			intBuf.put(i);
		}
		intBuf.rewind();
		
		this.ebo = GL15.glGenBuffers();
		GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, ebo);
		GL15.glBufferData(GL15.GL_ELEMENT_ARRAY_BUFFER, intBuf, GL15.GL_STATIC_DRAW);
		GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, 0);
		
		this.vbo = GLModelBuilder.buildVBO(this.vertices);
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
		
	}
	
	public int buildVAO() {
		
		this.hasVAO = true;
		int vS = (3+3+2)*4;
		
		// Fill the int buffer with data
				IntBuffer intBuf = BufferUtils.createIntBuffer(indexBuffer.size());
				for(int i : indexBuffer) {
					intBuf.put(i);
				}
				intBuf.rewind();
				
				
				GL11.glEnable(GL15.GL_ARRAY_BUFFER);
				vao = GLModelBuilder.createVAO();
				
			
				
				
				
				this.ebo = GL15.glGenBuffers();
				GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, ebo);
				GL15.glBufferData(GL15.GL_ELEMENT_ARRAY_BUFFER, intBuf, GL15.GL_STATIC_DRAW);
				
				
				this.vbo = GLModelBuilder.buildVBO(this.vertices);
				//GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
				
				
			
				GL20.glEnableVertexAttribArray(0);
				GL20.glVertexAttribPointer(0, 3, GL11.GL_FLOAT, false, vS, 0);

				
				GL20.glEnableVertexAttribArray(1);
				GL20.glVertexAttribPointer(1, 3, GL11.GL_FLOAT, false, vS, 20);
				
				GL20.glEnableVertexAttribArray(2);
				GL20.glVertexAttribPointer(2, 2, GL11.GL_FLOAT, false, vS, 12);
				
				

				/*
				GL11.glVertexPointer(3, GL11.GL_FLOAT, vS, 0);
				GL11.glNormalPointer(GL11.GL_FLOAT, vS, 20);
				GL11.glTexCoordPointer(2, GL11.GL_FLOAT, vS, 12);
			*/
				//GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, 0);
			GLCompatible.glBindVertexArray(0);
			GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, 0);
		return vao;
	}
	
	public void render() {
		
		
	//	GlStateManager.enableTexture2D();
	//	GlStateManager.color(1.0f, 1.0f, 1.0f);
		//GlStateManager.disableCull();
		
		GlStateManager.glEnableClientState(GL11.GL_VERTEX_ARRAY);
		GlStateManager.glEnableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
		GlStateManager.glEnableClientState(GL11.GL_NORMAL_ARRAY);
		
	
		
		
		GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, this.ebo);
		
		
		
		
	//	GLModelBuilder.createModelVBO(face, vertCount);
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, this.vbo);
		
		int vS = (3+3+2)*4;
		
		GL11.glVertexPointer(3, GL11.GL_FLOAT, vS, 0);
		GL11.glNormalPointer(GL11.GL_FLOAT, vS, 20);
		GL11.glTexCoordPointer(2, GL11.GL_FLOAT, vS, 12);
		
		

		GL11.glDrawElements(GL11.GL_TRIANGLES, indexBuffer.size(), GL11.GL_UNSIGNED_INT, 0);

		
		GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, 0);
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
		
		GlStateManager.glDisableClientState(GL11.GL_VERTEX_ARRAY);
		GlStateManager.glDisableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
		GlStateManager.glDisableClientState(GL11.GL_NORMAL_ARRAY);
		
		

	}
	
	

}
