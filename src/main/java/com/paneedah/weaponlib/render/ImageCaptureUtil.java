package com.paneedah.weaponlib.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureUtil;
import org.lwjgl.BufferUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.IntBuffer;

public class ImageCaptureUtil {

    private static IntBuffer pixelBuffer = null;
    private static int[] pixelValues = null;

    public static BufferedImage captureImage(int image, int width, int height, AffineTransform affine) {

        int i = width * height;

        if (pixelBuffer == null || pixelBuffer.capacity() < i) {
            pixelBuffer = BufferUtils.createIntBuffer(i);
            pixelValues = new int[i];
        }


        GlStateManager.glPixelStorei(3333, 1);
        GlStateManager.glPixelStorei(3317, 1);
        pixelBuffer.clear();

        if (OpenGlHelper.isFramebufferEnabled()) {
            GlStateManager.bindTexture(image);
            GlStateManager.glGetTexImage(3553, 0, 32993, 33639, pixelBuffer);
        } else {
            GlStateManager.glReadPixels(0, 0, width, height, 32993, 33639, pixelBuffer);
        }


        pixelBuffer.get(pixelValues);
        TextureUtil.processPixelValues(pixelValues, width, height);

        BufferedImage bufferedimage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        bufferedimage.setRGB(0, 0, width, height, pixelValues, 0, width);

        if (affine != null) {
            return transformImage(bufferedimage, affine);
        } else {
            return bufferedimage;
        }


    }

    public static BufferedImage transformImage(BufferedImage img, AffineTransform transform) {
        BufferedImage newImage = new BufferedImage(
                img.getWidth(), img.getHeight(),
                img.getType());
        Graphics2D g = newImage.createGraphics();
        g.transform(transform);
        g.drawImage(img, 0, 0, null);
        g.dispose();
        return newImage;
    }

    public static void saveImageToDisk(File file, BufferedImage img) {
        try {
            ImageIO.write(img, "png", file);
        } catch (IOException e) {
            System.err.println("Could not save buffered image to disk!");
        }
    }

}
