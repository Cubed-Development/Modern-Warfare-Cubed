package com.paneedah.weaponlib.shader.jim;

import com.paneedah.weaponlib.config.ModernConfigManager;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL20;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;


public class Shader {
	private int shader;
	private List<Uniform> uniforms = new ArrayList<>(2);
	
	public Shader(int shader) {
		this.shader = shader;
	}
	
	public Shader withUniforms(Uniform...uniforms) {
		for(Uniform u : uniforms) {
			this.uniforms.add(u);
		}
		return this;
	}
	
	public void use() {
		if(!ShaderLoader.enableShaders) return;
		
		if(!ModernConfigManager.enableAllShaders) {
			return;
		}
		
		GL20.glUseProgram(shader);
		for(Uniform uniform : uniforms) {
			uniform.apply(shader);
		}
	}
	
	public void release() {
		GL20.glUseProgram(0);
	}
	
	public int getShaderId() {
		return shader;
	}
	
	public void sendMatrix4AsUniform(String name, boolean transpose, FloatBuffer mat) {
		OpenGlHelper.glUniformMatrix4(getLoc(name),  transpose, mat);
	}
	
	public void boolean1b(String name, boolean b) {
		uniform1i(name, b ? 1 : 0);
	}
	
	public void uniform1i(String name, int i) {
		OpenGlHelper.glUniform1i(getLoc(name), i);
	}
	
	public void uniform1f(String name, float i) {
		GL20.glUniform1f(getLoc(name), i);
	}
	
	public void uniform2f(String name, float f0, float f1) {
		GL20.glUniform2f(getLoc(name), f0, f1);
	}

	public void uniform3f(String name, float f, float g, float h) {
		GL20.glUniform3f(getLoc(name), f, g, h);
		
	}
	
	private int getLoc(String name) {
		return OpenGlHelper.glGetUniformLocation(getShaderId(), name);
	}

}
