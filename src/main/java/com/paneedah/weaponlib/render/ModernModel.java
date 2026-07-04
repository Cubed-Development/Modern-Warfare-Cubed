package com.paneedah.weaponlib.render;

import org.lwjgl.opengl.GL30;

public class ModernModel {

    public int vao;
    public int size;

    public ModernModel(final int vao, final int size) {
        this.vao = vao;
        this.size = size;
    }

    public void render() {
        //GlStateManager.glEnableClientState(GL11.GL_VERTEX_ARRAY);
        GL30.glBindVertexArray(vao);
        //GlStateManager.glDrawArrays(GL11.GL_TRIANGLES, 0, vertices);
        GL30.glBindVertexArray(0);
        //GlStateManager.glDisableClientState(GL11.GL_VERTEX_ARRAY);
    }
}
