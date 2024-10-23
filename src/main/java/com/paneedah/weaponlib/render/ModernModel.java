package com.paneedah.weaponlib.render;

import org.lwjgl.opengl.GL30;

public class ModernModel {


    public int vao;
    public int vertices;


    public ModernModel(int vao, int size) {
        this.vao = vao;
        vertices = size;

    }

    public void render() {
        //GL11.glEnableClientState(GL11.GL_VERTEX_ARRAY);
        GL30.glBindVertexArray(vao);
        //GL11.glDrawArrays(GL11.GL_TRIANGLES, 0, vertices);
        GL30.glBindVertexArray(0);
        //GL11.glDisableClientState(GL11.GL_VERTEX_ARRAY);
    }

}
