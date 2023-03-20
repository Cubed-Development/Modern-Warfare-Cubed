package com.paneedah.weaponlib.render.bgl.instancing;

import com.paneedah.weaponlib.render.VAOData;
import com.paneedah.weaponlib.render.WavefrontModel;
import com.paneedah.weaponlib.render.bgl.GLCompatible;
import com.paneedah.weaponlib.shader.jim.Attribute;
import com.paneedah.weaponlib.shader.jim.Shader;
import com.paneedah.weaponlib.shader.jim.ShaderLoader;
import org.lwjgl.opengl.GL11;

public class ModelInstancedObject<K> extends BasicInstancedObject<K> {

	private WavefrontModel model;
	
	public ModelInstancedObject(String shader, WavefrontModel model, int renderMode, int maxCopies, InstancedAttribute... attribs) {
		super(shader, renderMode, maxCopies, attribs);
		this.model = model;
		
		if(!model.usesVAO()) {
			System.err.println("Does not support VAOs!");
		}
		
		VAOData vaoData = new VAOData(model.getVAOID(), model.vertices.size());
		initialize(vaoData);
		setupShader();
	}



	@Override
	public void updateData(K obj) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void render(int primCount) {
		
	
		preRender();
		
		GLCompatible.glDrawElementsInstanced(getRenderMode(), model.indexBuffer.size(), GL11.GL_UNSIGNED_INT, 0, primCount);
		
		
		postRender();
	}



	@Override
	protected void setupShader() {
		
		
		int pointer = 0;
		Attribute[] array = new Attribute[3+getAttribs().length];
		array[pointer++] = new Attribute("aPos", 0);
		array[pointer++] = new Attribute("aNormal", 1);
		array[pointer++] = new Attribute("aTexCoord", 2);
		for(InstancedAttribute ia : getAttribs()) {
			array[pointer++] = new Attribute(ia.getAttributeName(), ia.getAttributeID());
		}
		
		
		
		Shader shad = ShaderLoader.loadShader(this.shaderName, array);
		setRenderShader(shad);
		
	}

	
}
