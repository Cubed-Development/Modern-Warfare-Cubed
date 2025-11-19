package com.paneedah.weaponlib.render;

import com.paneedah.weaponlib.render.wavefront.WavefrontModel.Vertex;
import com.paneedah.weaponlib.render.bgl.GLCompatible;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL15;

import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;

public class GLModelBuilder {

    /**
     * Creates a static VBO
     *
     * @param floatCount How many floats are you storing?
     * @return The VBO's identity
     */
    public static int createStaticBuffer(int floatCount) {
        int vbo = GL15.glGenBuffers();
        // bind vbo
        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo);
        GL15.glBufferData(GL15.GL_ARRAY_BUFFER, (long) floatCount * Float.BYTES, GL15.GL_STATIC_DRAW);  // Use Float.BYTES here
        // unbind vbo
        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
        return vbo;
    }

    /**
     * Creates an element buffer for indices
     *
     * @param intCount The number of indices (integers) to store in the buffer
     * @return The EBO (Element Buffer Object) identity
     */
    public static int createElementBuffer(int intCount) {  // Renamed floatCount to intCount
        int ebo = GL15.glGenBuffers();
        GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, ebo);
        GL15.glBufferData(GL15.GL_ELEMENT_ARRAY_BUFFER, (long) intCount * Integer.BYTES, GL15.GL_STATIC_DRAW);  // Use Integer.BYTES here
        return ebo;
    }

    public static void unbindElementBuffer() {
        GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, 0);
    }

    /**
     * Creates & binds a new vertex array object
     *
     * @return VAO handle
     */
    public static int createVAO() {
        int vaoID = GLCompatible.glGenVertexArrays();
        GLCompatible.glBindVertexArray(vaoID);
        return vaoID;
    }

    /**
     * Builds a VBO from a set of vertices.
     * This will flip the v (u, v) coordinate of the
     * texture coordinates in order to make it work with Minecraft.
     * <p>
     * It does NOT unbind the VBO.
     *
     * @param vertexes List of vertices
     * @return The VBO handle
     */
    public static int buildVBO(ArrayList<Vertex> vertexes) {
        int vbo = GL15.glGenBuffers();

        // Calculate total size for buffer: 3 floats for position + 3 floats for normal + 2 floats for texture coords
        FloatBuffer floatBuffer = BufferUtils.createFloatBuffer(vertexes.size() * (3 + 3 + 2));  // 3 position, 3 normal, 2 texture coords
        for (Vertex v : vertexes) {
            floatBuffer.put(v.pos);  // Vertex position
            floatBuffer.put(new float[]{v.texCoord[0], -v.texCoord[1]});  // Texture coordinates (flipped vertically)
            floatBuffer.put(v.normal);  // Vertex normal
        }
        floatBuffer.rewind();

        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo);
        GL15.glBufferData(GL15.GL_ARRAY_BUFFER, floatBuffer, GL15.GL_STATIC_DRAW);

        return vbo;
    }

    /**
     * Fills the buffer with double values
     *
     * @param nioBuffer The DoubleBuffer to fill
     * @param buf       The double data array
     */
    public static void fillBuffer(DoubleBuffer nioBuffer, double[][] buf) {
        for (double[] sub : buf) {
            nioBuffer.put(sub);
        }
        nioBuffer.rewind();
    }

    /**
     * Fills the buffer with float values
     *
     * @param nioBuffer The FloatBuffer to fill
     * @param buf       The float data array
     */
    public static void fillBuffer(FloatBuffer nioBuffer, float[][] buf) {
        for (float[] sub : buf) {
            nioBuffer.put(sub);
        }
        nioBuffer.rewind();
    }

    /**
     * Unbinds the current vertex array object (by binding 0)
     */
    public static void unbindVAO() {
        GLCompatible.glBindVertexArray(0);
    }
}
