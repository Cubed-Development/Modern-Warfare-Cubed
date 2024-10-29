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

    @Setter
    @Getter
    private K genericType;

    @Setter
    @Getter
    private int maxObjects;
    @Setter
    @Getter
    private int instanceVBO;
    @Setter
    @Getter
    private VAOData vao;

    @Setter
    @Getter
    private FloatBuffer instancedBuffer;
    @Setter
    @Getter
    protected int arrayPointer;
    @Setter
    @Getter
    private Shader renderShader;

    protected String shaderName;

    @Setter
    @Getter
    private int instanceDataLength;

    @Setter
    @Getter
    private int largestAttribute = 0;

    @Setter
    @Getter
    private int renderMode;

    @Setter
    @Getter
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
