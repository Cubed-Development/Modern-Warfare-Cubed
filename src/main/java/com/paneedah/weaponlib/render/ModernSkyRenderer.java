package com.paneedah.weaponlib.render;

import com.paneedah.weaponlib.shader.jim.Shader;
import com.paneedah.weaponlib.shader.jim.ShaderLoader;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.IResource;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IRenderHandler;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.ProjectConstants.ID;

public class ModernSkyRenderer extends IRenderHandler {

    public static int cubeMapTexture = -1;

    public static float[] cubeMap = new float[]{
            -1.0f, -1.0f, -1.0f,
            -1.0f, -1.0f, 1.0f,
            -1.0f, 1.0f, 1.0f,
            1.0f, 1.0f, -1.0f,
            -1.0f, -1.0f, -1.0f,
            -1.0f, 1.0f, -1.0f,
            1.0f, -1.0f, 1.0f,
            -1.0f, -1.0f, -1.0f,
            1.0f, -1.0f, -1.0f,
            1.0f, 1.0f, -1.0f,
            1.0f, -1.0f, -1.0f,
            -1.0f, -1.0f, -1.0f,
            -1.0f, -1.0f, -1.0f,
            -1.0f, 1.0f, 1.0f,
            -1.0f, 1.0f, -1.0f,
            1.0f, -1.0f, 1.0f,
            -1.0f, -1.0f, 1.0f,
            -1.0f, -1.0f, -1.0f,
            -1.0f, 1.0f, 1.0f,
            -1.0f, -1.0f, 1.0f,
            1.0f, -1.0f, 1.0f,
            1.0f, 1.0f, 1.0f,
            1.0f, -1.0f, -1.0f,
            1.0f, 1.0f, -1.0f,
            1.0f, -1.0f, -1.0f,
            1.0f, 1.0f, 1.0f,
            1.0f, -1.0f, 1.0f,
            1.0f, 1.0f, 1.0f,
            1.0f, 1.0f, -1.0f,
            -1.0f, 1.0f, -1.0f,
            1.0f, 1.0f, 1.0f,
            -1.0f, 1.0f, -1.0f,
            -1.0f, 1.0f, 1.0f,
            1.0f, 1.0f, 1.0f,
            -1.0f, 1.0f, 1.0f,
            1.0f, -1.0f, 1.0f
    };

    private static final String str = ID + ":textures/sky/hd/";

    public static ByteBuffer readByteBuffer3(BufferedImage image) {


        int[] pixels = new int[image.getWidth() * image.getHeight()];
        image.getRGB(0, 0, image.getWidth(), image.getHeight(), pixels, 0, image.getWidth());
        ByteBuffer buffer = ByteBuffer.allocateDirect(image.getWidth() * image.getHeight() * 3);

        for (int h = 0; h < image.getHeight(); h++) {
            for (int w = 0; w < image.getWidth(); w++) {
                int pixel = pixels[h * image.getWidth() + w];


                buffer.put((byte) ((pixel >> 16) & 0xFF));
                buffer.put((byte) ((pixel >> 8) & 0xFF));
                buffer.put((byte) (pixel & 0xFF));
                // buffer.put((byte) ((pixel >> 24) & 0xFF));
            }
        }

        buffer.flip();
        buffer.rewind();

        return buffer;


    }


    public ByteBuffer readImageFromFile(ResourceLocation location) {
        IResource resource;
        try {
            resource = MC.getResourceManager().getResource(location);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        ByteBuffer buf;
        try {
            assert resource != null;
            BufferedImage image = ImageIO.read(resource.getInputStream());
            buf = ByteBuffer.allocateDirect(image.getWidth() * image.getHeight() * 3);

            buf.put(readByteBuffer3(image));
            buf.rewind();
            return buf;

        } catch (IOException e) {
            System.err.println("Failed to read out cubemap texture!");
            e.printStackTrace();
        }


        return null;

    }

    public void setupCubemap() {

        if (cubeMapTexture != -1) {
            GlStateManager.deleteTexture(cubeMapTexture);
        }

        cubeMapTexture = GlStateManager.generateTexture();
        GL11.glBindTexture(GL13.GL_TEXTURE_CUBE_MAP, cubeMapTexture);

        final String[] faces = new String[]{
                "right.jpg",
                "left.jpg",
                "top.jpg",
                "bottom.jpg",
                "front.jpg",
                "back.jpg"
        };

        for (int i = 0; i < faces.length; ++i) {
            ByteBuffer buffer = readImageFromFile(new ResourceLocation(str + faces[i]));
            GL11.glTexImage2D(GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_X + i, 0, GL11.GL_RGB, 2048, 2048, 0, GL11.GL_RGB, GL11.GL_UNSIGNED_BYTE, buffer);
        }

        System.out.println("Cubemap succesfully created!");

        GL11.glTexParameteri(GL13.GL_TEXTURE_CUBE_MAP, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL13.GL_TEXTURE_CUBE_MAP, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL13.GL_TEXTURE_CUBE_MAP, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL13.GL_TEXTURE_CUBE_MAP, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL13.GL_TEXTURE_CUBE_MAP, GL12.GL_TEXTURE_WRAP_R, GL12.GL_CLAMP_TO_EDGE);

    }

    public Shader skyShader = ShaderLoader.loadShader("sky");


    @Override
    public void render(float partialTicks, WorldClient world, Minecraft MC) {
        return;

    }

}
