package com.paneedah.weaponlib.render;

import com.paneedah.weaponlib.shader.jim.Shader;
import com.paneedah.weaponlib.shader.jim.ShaderLoader;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL31;
import org.lwjgl.util.vector.Matrix4f;

import java.nio.FloatBuffer;

public class InstancedRender {

    private static final int MAX_INSTANCES = 50000;
    private static final int INSTANCE_DATA_LENGTH = 21;

    private static final float[] VERTICES = {-0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f, -0.5f};

    private static final FloatBuffer buffer = BufferUtils.createFloatBuffer(MAX_INSTANCES * INSTANCE_DATA_LENGTH);

    private static final Shader shad = ShaderLoader.loadShader("instanced");

    private final int vbo;
    private final VAOData vao;
    private int pointer = 0;

    public InstancedRender() {
        VAOLoader loader = new VAOLoader();
        vbo = loader.createEmptyVBO(INSTANCE_DATA_LENGTH * MAX_INSTANCES);
        vao = VAOLoader.loadToVAO(VERTICES);
        loader.addInstancedAttribute(vao.getVaoID(), vbo, 1, 4, INSTANCE_DATA_LENGTH, 0);
        loader.addInstancedAttribute(vao.getVaoID(), vbo, 2, 4, INSTANCE_DATA_LENGTH, 4);
        loader.addInstancedAttribute(vao.getVaoID(), vbo, 3, 4, INSTANCE_DATA_LENGTH, 8);
        loader.addInstancedAttribute(vao.getVaoID(), vbo, 4, 4, INSTANCE_DATA_LENGTH, 12);
        loader.addInstancedAttribute(vao.getVaoID(), vbo, 5, 4, INSTANCE_DATA_LENGTH, 16);
        loader.addInstancedAttribute(vao.getVaoID(), vbo, 6, 1, INSTANCE_DATA_LENGTH, 20);
    }

    public void prepare() {
        shad.use();
        GL30.glBindVertexArray(vao.getVaoID());
        GL20.glEnableVertexAttribArray(0);
        GL20.glEnableVertexAttribArray(1);
        GL20.glEnableVertexAttribArray(2);
        GL20.glEnableVertexAttribArray(3);
        GL20.glEnableVertexAttribArray(4);
        GL20.glEnableVertexAttribArray(5);
        GL20.glEnableVertexAttribArray(6);
        GlStateManager.enableBlend();
        GlStateManager.depthMask(false);

    }

    public void render() {
        prepare();
        updateData();
        GL31.glDrawArraysInstanced(GL11.GL_TRIANGLES, 0, vao.getVertexCount(), 1000);
        finishRender();
    }

    public void finishRender() {
        GlStateManager.depthMask(true);
        GlStateManager.disableBlend();
        GL20.glDisableVertexAttribArray(0);
        GL20.glDisableVertexAttribArray(1);
        GL20.glDisableVertexAttribArray(2);
        GL20.glDisableVertexAttribArray(3);
        GL20.glDisableVertexAttribArray(4);
        GL20.glDisableVertexAttribArray(5);
        GL20.glDisableVertexAttribArray(6);
    }

    public void updateData() {
        pointer = 0;
        int testNum = 1000;
        float[] vboData = new float[testNum * INSTANCE_DATA_LENGTH];
        for (int i = 0; i < testNum; ++i) {
            storeMatrixData(new Matrix4f(), vboData);
            vboData[pointer++] = 0.0f;
            vboData[pointer++] = 0.0f;
            vboData[pointer++] = 0.0f;
            vboData[pointer++] = 0.0f;
            vboData[pointer++] = 0.0f;
        }
        VAOLoader.updateVBO(vbo, vboData, buffer);


    }

    public void storeMatrixData(Matrix4f matrix, float[] vboData) {
        vboData[pointer++] = matrix.m00;
        vboData[pointer++] = matrix.m01;
        vboData[pointer++] = matrix.m02;
        vboData[pointer++] = matrix.m03;
        vboData[pointer++] = matrix.m10;
        vboData[pointer++] = matrix.m11;
        vboData[pointer++] = matrix.m12;
        vboData[pointer++] = matrix.m13;
        vboData[pointer++] = matrix.m20;
        vboData[pointer++] = matrix.m21;
        vboData[pointer++] = matrix.m22;
        vboData[pointer++] = matrix.m23;
        vboData[pointer++] = matrix.m30;
        vboData[pointer++] = matrix.m31;
        vboData[pointer++] = matrix.m32;
        vboData[pointer++] = matrix.m33;
    }


}
