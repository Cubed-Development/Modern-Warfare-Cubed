package com.paneedah.weaponlib.render.bgl.instancing;

import com.paneedah.weaponlib.render.vao.VAOData;
import com.paneedah.weaponlib.render.wavefront.WavefrontModel;
import com.paneedah.weaponlib.render.bgl.GLCompatible;
import com.paneedah.weaponlib.shader.ShaderAttribute;
import com.paneedah.weaponlib.shader.Shader;
import com.paneedah.weaponlib.shader.ShaderLoader;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.ProjectConstants.LOGGER;


public class ModelInstancedObject<K> extends BasicInstancedObject<K> {

    private final WavefrontModel model;

    public ModelInstancedObject(String shader, WavefrontModel model, int renderMode, int maxCopies, InstancedAttribute... attribs) {
        super(shader, renderMode, maxCopies, attribs);
        this.model = model;

        if (!model.usesVAO()) {
            LOGGER.error("ModelInstancedObject does not support VAOs!");
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
        ShaderAttribute[] array = new ShaderAttribute[3 + getAttribs().length];
        array[pointer++] = new ShaderAttribute("aPos", 0);
        array[pointer++] = new ShaderAttribute("aNormal", 1);
        array[pointer++] = new ShaderAttribute("aTexCoord", 2);
        for (InstancedAttribute ia : getAttribs()) {
            array[pointer++] = new ShaderAttribute(ia.getAttributeName(), ia.getAttributeID());
        }


        Shader shad = ShaderLoader.loadShader(this.shaderName, array);
        setRenderShader(shad);

    }


}
