package com.paneedah.weaponlib.render.bgl.instancing;

import com.paneedah.weaponlib.render.VAOData;
import com.paneedah.weaponlib.render.VAOLoader;
import com.paneedah.weaponlib.render.bgl.GLCompatible;
import com.paneedah.weaponlib.render.bgl.ModernUtil;
import com.paneedah.weaponlib.shader.jim.Shader;
import lombok.Getter;
import lombok.Setter;
import org.lwjgl.BufferUtils;

import java.nio.FloatBuffer;

public abstract class BasicInstancedObject<K> {

    @Getter
    @Setter
    private K genericType;

    @Getter
    @Setter
    private int maxObjects;
    @Getter
    @Setter
    private int instanceVBO;
    @Getter
    @Setter
    private VAOData vao;

    @Getter
    @Setter
    private FloatBuffer instancedBuffer;
    @Getter
    @Setter
    protected int arrayPointer;
    @Getter
    @Setter
    private Shader renderShader;

    protected String shaderName;

    @Getter
    @Setter
    private int instanceDataLength;

    @Getter
    @Setter
    private int largestAttribute = 0;

    @Getter
    @Setter
    private int renderMode;

    @Getter
    @Setter
    private InstancedAttribute[] attribs;


    public BasicInstancedObject(String shader, int renderMode, int maxCopies, InstancedAttribute... attribs) {
        shaderName = shader;
        this.renderMode = renderMode;
        maxObjects = maxCopies;
        this.attribs = attribs;


    }

    protected abstract void setupShader();

    protected void initialize(VAOData vao) {
        this.vao = vao;

        if (attribs != null) {
            for (InstancedAttribute attr : attribs) {
                instanceDataLength += attr.getAttributeType().getSize();
            }
        }

        instancedBuffer = BufferUtils.createFloatBuffer(getInstanceDataLength() * getMaxObjects());

        instanceVBO = ModernUtil.createEmptyVBO(maxObjects * instanceDataLength);


        // Add instanced attributes
        GLCompatible.glBindVertexArray(vao.getVaoID());
        int offset = 0;
        if (attribs != null) {
            for (InstancedAttribute attr : attribs) {
                ModernUtil.addInstancedAttribute(vao.getVaoID(),
                        instanceVBO, attr.getAttributeID(),
                        attr.getAttributeType().getSize(), instanceDataLength,
                        offset);
                offset += attr.getAttributeType().getSize();

                // Important to enable the vertex attributes
                if (attr.getAttributeID() > largestAttribute) {
                    largestAttribute = attr.getAttributeID();
                }
            }
        }
        GLCompatible.glBindVertexArray(0);
    }

    protected void preRender() {

        renderShader.use();
        GLCompatible.glBindVertexArray(vao.getVaoID());
        ModernUtil.enableVertexAttribRange(0, largestAttribute);
    }

    protected void postRender() {
        ModernUtil.disableVertexAttribRange(0, largestAttribute);
        GLCompatible.glBindVertexArray(0);
        renderShader.release();
    }

    // This is where you'd fill the buffer with the necessary data
    public abstract void updateData(K obj);

    public void render(int primCount) {


        // Render setup
        preRender();

        // Render elements
        GLCompatible.glDrawArraysInstanced(renderMode, 0, vao.getVertexCount(), primCount);

        // Tidy up renderer
        postRender();

    }

    public void uploadToBuffer(float[] data) {
        VAOLoader.updateVBO(getInstanceVBO(), data, getInstancedBuffer());

    }


}
