package com.paneedah.weaponlib.render.bgl;

import com.paneedah.weaponlib.compatibility.ShellRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class ModernUtil {

    public static void setupLighting(Vec3d position) {
        GlStateManager.enableLighting();
        MC.entityRenderer.enableLightmap();
        ShellRenderer.setupLightmapCoords(MC.player.getPositionVector().add(0, 1, 0));

    }

    public static void destructLighting(Vec3d position) {
        MC.entityRenderer.disableLightmap();
        GlStateManager.disableLighting();
    }

    public static void addInstancedAttribute(int vao, int vbo, int attribute, int dataSize, int instancedDataLength,
                                             int offset) {
        //GL11.glEnable(GL15.GL_ARRAY_BUFFER);
        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo);
        GLCompatible.glBindVertexArray(vao);
        GL20.glVertexAttribPointer(attribute, dataSize, GL11.GL_FLOAT, false, instancedDataLength * 4, offset * 4L);
        GLCompatible.glVertexAttribDivisor(attribute, 1);
        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
        GLCompatible.glBindVertexArray(0);
    }

    public static int createEmptyVBO(int floatCount) {
        int vbo = GL15.glGenBuffers();
        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo);
        GL15.glBufferData(GL15.GL_ARRAY_BUFFER, floatCount * 4L, GL15.GL_STREAM_DRAW);
        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
        return vbo;
    }

    public static void enableVertexAttribRange(int start, int end) {
        for (int i = start; i <= end; ++i) {
            GL20.glEnableVertexAttribArray(i);
        }
    }

    public static void disableVertexAttribRange(int start, int end) {
        for (int i = start; i <= end; ++i) {
            GL20.glDisableVertexAttribArray(i);
        }
    }

}
