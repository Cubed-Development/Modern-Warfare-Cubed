package com.paneedah.mwc.weaponlib.render;

import com.paneedah.mwc.weaponlib.shader.jim.Shader;
import com.paneedah.mwc.weaponlib.shader.jim.ShaderLoader;

/**
 * Stores all of the shaders
 *
 * @author Jim Holden
 */
public class Shaders {

    public static Shader select = ShaderLoader.loadShader("select");
    public static Shader blur = ShaderLoader.loadShader("blur");
    public static Shader blackScreen = ShaderLoader.loadShader("black");
    public static Shader shellLight = ShaderLoader.loadShader("shells");
    public static Shader gunLightingShader = ShaderLoader.loadShader("gunlight");
    public static Shader flash = ShaderLoader.loadShader("flash");
    public static Shader selectedge = ShaderLoader.loadShader("selectedge");
    public static Shader reflexReticle = ShaderLoader.loadShader("reflex");
    public static Shader grid = ShaderLoader.loadShader("grid");

    public static Shader axis = ShaderLoader.loadShader("axis");

    public static Shader downsample = ShaderLoader.loadShader("downsample");
    public static Shader upsample = ShaderLoader.loadShader("upsample");


    public static Shader brightnessShader = ShaderLoader.loadShader("brightness");
    public static Shader bloomTest = ShaderLoader.loadShader("bTest");
    public static Shader post = ShaderLoader.loadShader("post");
    public static Shader billboard = ShaderLoader.loadShader("billboard");


    // Post-processing shaders
    public static Shader postFlat = ShaderLoader.loadShader("postflat");
    public static Shader postWorld = ShaderLoader.loadShader("postworld");


}
