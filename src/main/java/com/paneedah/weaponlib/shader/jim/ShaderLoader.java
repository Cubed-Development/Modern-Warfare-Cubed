package com.paneedah.weaponlib.shader.jim;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.render.bgl.GLCompatible;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.compress.utils.IOUtils;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

/**
 * This class is responsible for loading and compiling vertex and fragment shaders for use in rendering.
 */
public class ShaderLoader {

    public static boolean enableShaders = true;

    /**
     * Loads and compiles a shader with the given name and attributes, and returns a Shader object containing the compiled shader program.
     *
     * @param name The name of the shader file to load (without the extension)
     * @param attributes A list of Attribute objects to bind to the shader (optional)
     * @return A Shader object containing the compiled shader
     */
    public static Shader loadShader(String name, Attribute... attributes) {
        if (!enableShaders)
            return new Shader(0);

        ResourceLocation file = new ResourceLocation(ModReference.ID + ":shaders/" + name);

        int vertexShaderId = GL20.glCreateShader(GL20.GL_VERTEX_SHADER);
        int fragmentShaderId = GL20.glCreateShader(GL20.GL_FRAGMENT_SHADER);
        int programId = GL20.glCreateProgram();

        try {
            GL20.glShaderSource(vertexShaderId, readFileToBuf(new ResourceLocation(file.getNamespace(), file.getPath() + ".vert")));
            GL20.glCompileShader(vertexShaderId);
            if (GL20.glGetShaderi(vertexShaderId, GL20.GL_COMPILE_STATUS) == GL11.GL_FALSE) {
                ModReference.LOG.error(GL20.glGetShaderInfoLog(vertexShaderId, GL20.GL_INFO_LOG_LENGTH));
                throw new RuntimeException("Error creating vertex shader: " + file);
            }

            GL20.glShaderSource(fragmentShaderId, readFileToBuf(new ResourceLocation(file.getNamespace(), file.getPath() + ".frag")));
            GL20.glCompileShader(fragmentShaderId);
            if (GL20.glGetShaderi(fragmentShaderId, GL20.GL_COMPILE_STATUS) == GL11.GL_FALSE) {
                ModReference.LOG.error(GL20.glGetShaderInfoLog(fragmentShaderId, GL20.GL_INFO_LOG_LENGTH));
                throw new RuntimeException("Error creating fragment shader: " + file);
            }

            GL20.glAttachShader(programId, vertexShaderId);
            GL20.glAttachShader(programId, fragmentShaderId);

            if (attributes != null) {
                for (Attribute attribute : attributes) {
                    GLCompatible.glBindAttribLocation(programId, attribute.getAttributeID(), attribute.getAttributeName());
                }
            }

            GL20.glLinkProgram(programId);
            if (GL20.glGetProgrami(programId, GL20.GL_LINK_STATUS) == GL11.GL_FALSE) {
                ModReference.LOG.error(GL20.glGetProgramInfoLog(programId, GL20.GL_INFO_LOG_LENGTH));
                throw new RuntimeException("Error creating fragment shader: " + file);
            }

            ModReference.LOG.debug("Loaded shader successfully for " + file);

            return new Shader(programId);
        } catch (IOException ioException) {
            GL20.glDeleteProgram(programId);
            ModReference.LOG.error("Failed loading shader for " + ioException);
        } finally {
            GL20.glDeleteShader(vertexShaderId);
            GL20.glDeleteShader(fragmentShaderId);
        }

        return new Shader(0);
    }

    /**
     * Reads in the contents of a file and returns it as a ByteBuffer.
     *
     * @param file The location of the file to read in
     * @return A ByteBuffer containing the contents of the file
     * @throws IOException If there is an error reading the file
     */
    private static ByteBuffer readFileToBuf(ResourceLocation file) throws IOException {
        try (InputStream inputStream = mc.getResourceManager().getResource(file).getInputStream()) {
            byte[] bytes = IOUtils.toByteArray(inputStream);
            ByteBuffer buffer = BufferUtils.createByteBuffer(bytes.length);
            buffer.put(bytes);
            buffer.rewind();
            return buffer;
        }
    }
}
