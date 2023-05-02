package com.paneedah.weaponlib.render.bgl.instancing;

import com.paneedah.weaponlib.render.VAOData;
import com.paneedah.weaponlib.render.VAOLoader;
import com.paneedah.weaponlib.render.bgl.GLCompatible;
import com.paneedah.weaponlib.render.bgl.ModernUtil;
import com.paneedah.weaponlib.shader.jim.Shader;
import org.lwjgl.BufferUtils;

import java.nio.FloatBuffer;

public abstract class BasicInstancedObject<K> {
	
	private K genericType;
	
	private int maxObjects;
	private int instanceVBO;
	private VAOData vao;
	
	private FloatBuffer instancedBuffer;
	protected int arrayPointer;
	private Shader renderShader;
	
	protected String shaderName;
	
	private int instanceDataLength;
	
	private int largestAttribute = 0;
	
	private int renderMode;
	
	private InstancedAttribute[] attribs;
	
	
	public BasicInstancedObject(String shader, int renderMode, int maxCopies, InstancedAttribute...attribs) {
		this.shaderName = shader;
		this.renderMode = renderMode;
		this.maxObjects = maxCopies;
		this.attribs = attribs;
		
		
		
		
	
		
	}
	
	protected abstract void setupShader();
	
	protected void initialize(VAOData vao) {
		this.vao = vao;
		
		if(attribs != null) {
			for(InstancedAttribute attr : attribs) {
				this.instanceDataLength += attr.getAttributeType().getSize();
			}
		}
		
		this.instancedBuffer = BufferUtils.createFloatBuffer(getInstanceDataLength()*getMaxObjects());
		
		this.instanceVBO = ModernUtil.createEmptyVBO(this.maxObjects*this.instanceDataLength);
		
		
		// Add instanced attributes
		GLCompatible.glBindVertexArray(vao.getVaoID());
		int offset = 0;
		if(attribs != null) {
			for(InstancedAttribute attr : attribs) {
				ModernUtil.addInstancedAttribute(vao.getVaoID(),
						this.instanceVBO, attr.getAttributeID(),
						attr.getAttributeType().getSize(), this.instanceDataLength,
						offset);
				offset += attr.getAttributeType().getSize();
				
				// Important to enable the vertex attributes
				if(attr.getAttributeID() > largestAttribute) {
					largestAttribute = attr.getAttributeID();
				}
			}
		}
		GLCompatible.glBindVertexArray(0);
	}
	
	protected void preRender() {
		
		renderShader.use();
		GLCompatible.glBindVertexArray(vao.getVaoID());
		ModernUtil.enableVertexAttribRange(0, this.largestAttribute);
	}
	
	protected void postRender() {
		ModernUtil.disableVertexAttribRange(0, this.largestAttribute);
		GLCompatible.glBindVertexArray(0);
		renderShader.release();
	}
	
	// This is where you'd fill the buffer with the necessary data
	public abstract void updateData(K obj);
	
	public void render(int primCount) {
		

		// Render setup
		preRender();
		
		// Render elements
		GLCompatible.glDrawArraysInstanced(this.renderMode, 0, vao.getVertexCount(), primCount);
		
		// Tidy up render
		postRender();
		
	}

	public void uploadToBuffer(float[] data) {
		VAOLoader.updateVBO(getInstanceVBO(), data, getInstancedBuffer());
		
	}
	
	
	
	public K getGenericType() {
		return genericType;
	}

	public void setGenericType(K genericType) {
		this.genericType = genericType;
	}

	public int getMaxObjects() {
		return maxObjects;
	}

	public void setMaxObjects(int maxObjects) {
		this.maxObjects = maxObjects;
	}

	public int getInstanceVBO() {
		return instanceVBO;
	}

	public void setInstanceVBO(int instanceVBO) {
		this.instanceVBO = instanceVBO;
	}

	public VAOData getVao() {
		return vao;
	}

	public void setVao(VAOData vao) {
		this.vao = vao;
	}

	public FloatBuffer getInstancedBuffer() {
		return instancedBuffer;
	}

	public void setInstancedBuffer(FloatBuffer instancedBuffer) {
		this.instancedBuffer = instancedBuffer;
	}

	public int getArrayPointer() {
		return arrayPointer;
	}

	public void setArrayPointer(int arrayPointer) {
		this.arrayPointer = arrayPointer;
	}

	public Shader getRenderShader() {
		return renderShader;
	}

	public void setRenderShader(Shader renderShader) {
		this.renderShader = renderShader;
	}

	public int getInstanceDataLength() {
		return instanceDataLength;
	}

	public void setInstanceDataLength(int instanceDataLength) {
		this.instanceDataLength = instanceDataLength;
	}

	public int getLargestAttribute() {
		return largestAttribute;
	}

	public void setLargestAttribute(int largestAttribute) {
		this.largestAttribute = largestAttribute;
	}

	public int getRenderMode() {
		return renderMode;
	}

	public void setRenderMode(int renderMode) {
		this.renderMode = renderMode;
	}

	public InstancedAttribute[] getAttribs() {
		return attribs;
	}

	public void setAttribs(InstancedAttribute[] attribs) {
		this.attribs = attribs;
	}
	
	
}
