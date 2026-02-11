package com.paneedah.weaponlib.render.bgl.instancing;

import com.paneedah.weaponlib.render.vao.VAOData;
import com.paneedah.weaponlib.render.vao.VAOLoader;
import com.paneedah.weaponlib.render.bgl.GLCompatible;
import com.paneedah.weaponlib.shader.Shader;
import lombok.Getter;
import lombok.Setter;
import org.lwjgl.BufferUtils;

import java.nio.FloatBuffer;

public abstract class BasicInstancedObject<K> {

    @Getter @Setter private K genericType;

    @Getter @Setter private int maxObjects;

    @Getter @Setter private int instanceVBO;

    @Getter @Setter private VAOData vao;

    @Getter @Setter private FloatBuffer instancedBuffer;

    @Getter @Setter protected int arrayPointer;

    @Getter @Setter private Shader renderShader;

    protected String shaderName;

    @Getter @Setter private int instanceDataLength;

    @Getter @Setter private int largestAttribute = 0;

    @Getter @Setter private int renderMode;

    @Getter @Setter private InstancedAttribute[] attribs;


    public BasicInstancedObject(String shader, int renderMode, int maxCopies, InstancedAttribute... attribs) {
        this.shaderName = shader;
        this.renderMode = renderMode;
        this.maxObjects = maxCopies;
        this.attribs = attribs;


    }

    protected abstract void setupShader();

    protected void initialize(VAOData vao) {
        this.vao = vao;

        if (attribs != null) {
            for (InstancedAttribute attr : attribs) {
                this.instanceDataLength += attr.getAttributeType().getSize();
            }
        }

        this.instancedBuffer = BufferUtils.createFloatBuffer(getInstanceDataLength() * getMaxObjects());

        this.instanceVBO = VAOLoader.createEmptyVBO(this.maxObjects * this.instanceDataLength);


        // Add instanced attributes
        GLCompatible.glBindVertexArray(vao.getVaoID());
        int offset = 0;
        if (attribs != null) {
            for (InstancedAttribute attr : attribs) {
                VAOLoader.addInstancedAttribute(vao.getVaoID(),
                        this.instanceVBO, attr.getAttributeID(),
                        attr.getAttributeType().getSize(), this.instanceDataLength,
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

    /**
     * Ran before we render everything, sets up to render
     */
    protected void preRender() {

        renderShader.use();
        GLCompatible.glBindVertexArray(vao.getVaoID());
    }

    /**
     * Ran after we render everything, resets it back to how it was before
     */
    protected void postRender() {
        GLCompatible.glBindVertexArray(0);
        renderShader.release();
    }

    /**
     * This is where you'd fill the buffer with the necessary data
     */
    public abstract void updateData(K obj);

    public void render(int primCount) {


        // Render setup
        preRender();

        // Render elements
        GLCompatible.glDrawArraysInstanced(this.renderMode, 0, vao.getVertexCount(), primCount);

        // Tidy up renderer
        postRender();

    }

    public void uploadToBuffer(float[] data) {
        VAOLoader.updateVBO(getInstanceVBO(), data, getInstancedBuffer());

    }
}
