package com.paneedah.weaponlib.render;

import com.paneedah.weaponlib.shader.Shader;
import com.paneedah.weaponlib.shader.ShaderLoader;

/**
 * Stores all the shaders
 *
 * @author Jim Holden
 */
public class Shaders {

    public static final Shader legacyShell = ShaderLoader.loadShader("shells");
    public static final Shader select = ShaderLoader.loadShader("select");
    public static Shader blur = ShaderLoader.loadShader("blur");
    public static Shader blackScreen = ShaderLoader.loadShader("black");
    public static Shader shellLight = ShaderLoader.loadShader("shells");
    public static final Shader gunLightingShader = ShaderLoader.loadShader("gunlight");
    public static final Shader flash = ShaderLoader.loadShader("flash");
    public static final Shader selectedge = ShaderLoader.loadShader("selectedge");
    public static final Shader reflexReticle = ShaderLoader.loadShader("reflex");
    public static final Shader grid = ShaderLoader.loadShader("grid");

    public static final Shader axis = ShaderLoader.loadShader("axis");

    public static final Shader downsample = ShaderLoader.loadShader("downsample");
    public static final Shader upsample = ShaderLoader.loadShader("upsample");


    public static final Shader brightnessShader = ShaderLoader.loadShader("brightness");
    public static final Shader bloomTest = ShaderLoader.loadShader("bTest");
    public static final Shader post = ShaderLoader.loadShader("post");
    public static final Shader billboard = ShaderLoader.loadShader("billboard");


    // Post-processing shaders
    public static final Shader postFlat = ShaderLoader.loadShader("postflat");
    public static final Shader postWorld = ShaderLoader.loadShader("postworld");


}
