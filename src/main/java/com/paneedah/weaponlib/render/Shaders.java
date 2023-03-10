package com.paneedah.weaponlib.render;

import com.paneedah.weaponlib.shader.jim.Shader;
import com.paneedah.weaponlib.shader.jim.ShaderManager;
import net.minecraft.util.ResourceLocation;

/**
 * 
 * Stores all of the shaders
 * 
 * @author Jim Holden
 *
 */
public class Shaders {
	
	public static Shader select = ShaderManager.loadVMWShader("select");
	public static Shader blur = ShaderManager.loadVMWShader("blur");
	public static Shader blackScreen = ShaderManager.loadVMWShader("black");
	public static Shader shellLight = ShaderManager.loadVMWShader("shells");
	public static Shader gunLightingShader = ShaderManager.loadVMWShader("gunlight");
	public static Shader flash = ShaderManager.loadVMWShader("flash");
	public static Shader selectedge = ShaderManager.loadVMWShader("selectedge");
	public static Shader reflexReticle = ShaderManager.loadVMWShader("reflex");
	public static Shader grid = ShaderManager.loadVMWShader("grid");
	
	public static Shader axis = ShaderManager.loadVMWShader("axis");
	
	public static Shader downsample = ShaderManager.loadShader(new ResourceLocation("mw" + ":" + "shaders/downsample"));
	public static Shader upsample = ShaderManager.loadShader(new ResourceLocation("mw" + ":" + "shaders/upsample"));
	
	
	public static  Shader brightnessShader = ShaderManager.loadVMWShader("brightness");
	public static Shader bloomTest = ShaderManager.loadVMWShader("bTest");
	public static Shader post = ShaderManager.loadVMWShader("post");
	public static Shader billboard = ShaderManager.loadVMWShader("billboard");
	
	
	// Post processing shaders
	public static Shader postFlat = ShaderManager.loadVMWShader("postflat");
	public static Shader postWorld = ShaderManager.loadVMWShader("postworld");
	
	

}
