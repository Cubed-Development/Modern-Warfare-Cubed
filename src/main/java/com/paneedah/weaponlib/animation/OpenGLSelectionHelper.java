package com.paneedah.weaponlib.animation;

import com.paneedah.weaponlib.render.Shaders;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

//https://www.lighthouse3d.com/tutorials/opengl-selection-tutorial/
public class OpenGLSelectionHelper {
	
	private static final ByteBuffer resultBuffer = BufferUtils.createByteBuffer(16);
	private static final IntBuffer VIEWPORT = BufferUtils.createIntBuffer(16);
	
	public static boolean isInSelectionPass = false;

	public static int selectID = 30;
	public static int currentlyHovering = 0;

	public static int width = 0;
	public static int height = 0;
	public static Framebuffer fbo;

	public static Framebuffer ballBuf;

	public static boolean mouseClick = false;

	/**
	 * Allows you to select obj behind
	 * 
	 * @return
	 */
	public static boolean shouldRender(int id) {
		return true;
	}

	public static void setupSelectionBuffer() {

	}

	public static void bindBallBuf() {
		if(ballBuf == null) {
			ballBuf = new Framebuffer(mc.displayWidth, mc.displayHeight, true);
		}
		ballBuf.bindFramebuffer(false);;
	}
	
	public static void bindSelectBuffer() {
		if (mc.displayWidth != width || mc.displayHeight != height
				|| fbo == null) {
			width = mc.displayWidth;
			height = mc.displayHeight;
			fbo = new Framebuffer(width, height, true);

			ballBuf = new Framebuffer(width, height, true);
		}
		fbo.framebufferClear();
		fbo.bindFramebuffer(true);
		// fbo.bindFramebufferTexture();
	}

	public static void startSelectionPass() {
		isInSelectionPass = true;
	}

	public static void stopSelectionPass() {
		isInSelectionPass = false;
	}

	public static ByteBuffer readRawColor() {
		//IntBuffer boof = BufferUtils.createIntBuffer(16);
		/* old
		VIEWPORT.rewind();
		GL11.glGetInteger(GL11.GL_VIEWPORT, VIEWPORT);
		VIEWPORT.rewind();
		*/
		ScaledResolution scaledResolution = new ScaledResolution(mc);

		int width = scaledResolution.getScaledWidth();
		int height = scaledResolution.getScaledHeight();

		/*
		 * width = mc.displayWidth; height =
		 * mc.displayHeight;
		 */

		int mouseX = Mouse.getX() * width / mc.displayWidth;
		int mouseZ = height - Mouse.getY() * height / mc.displayHeight - 1;

		// System.out.println( + " | " + (Mouse.getY()-boof.get(3)));
		// System.out.println(mouseX + " | " + mouseZ);

		mouseX = (int) Math.round((mouseX / (double) width) * mc.displayWidth);
		mouseZ = (int) Math.round((mouseZ / (double) height) * mc.displayHeight);

		// System.out.println("Pre: " + mouseX + " | " + mouseZ);

		/*
		 * mouseX = mc.displayWidth/2; mouseZ =
		 * mc.displayHeight/2;
		 * 
		 * mouseX = 0; mouseZ = 0;
		 */
		// mouseZ = mc.displayHeight-1;

		mouseZ = mc.displayHeight - mouseZ - 1;

		// System.out.println("Post: " + mouseX + " | " + mouseZ);
		
		// old
		//ByteBuffer buf = BufferUtils.createByteBuffer(16);
		//buf.rewind();

		resultBuffer.rewind();
		
		GL20.glUseProgram(0);
		// Maybe needed?
		//GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);

		// GlStateManager.enableDepth();
		// GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
		// GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
		/*
		 * GL11.glFlush(); GL11.glFinish();
		 */
		// mc.getFramebuffer().unbindFramebufferTexture();

		// maybe needed
		//GL11.glPixelStoref(GL11.GL_UNPACK_ALIGNMENT, 1);
		//GL11.glReadBuffer(GL30.GL_COLOR_ATTACHMENT0);

		// System.out.println(mouseX + " | " + mouseZ);

		// System.out.println(width + " | " + height);

		// GL11.glReadPixels(mouseX+200, mouseZ+100, 1, 1, GL11.GL_RGBA,
		// GL11.GL_UNSIGNED_BYTE, buf);
		GL11.glReadPixels(mouseX, mouseZ, 1, 1, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, resultBuffer);
		resultBuffer.rewind();
		// test 2

		// selectID = 120;

		
		return resultBuffer;
	}

	public static ByteBuffer readScreenArea() {

		ScaledResolution scaledResolution = new ScaledResolution(mc);

		int width = scaledResolution.getScaledWidth();
		int height = scaledResolution.getScaledHeight();

		int mouseX = Mouse.getX() * width / mc.displayWidth;
		int mouseZ = height - Mouse.getY() * height / mc.displayHeight - 1;

		mouseX = (int) Math.round((mouseX / (double) width) * mc.displayWidth);
		mouseZ = (int) Math.round((mouseZ / (double) height) * mc.displayHeight);

		mouseZ = mc.displayHeight - mouseZ - 1;

		
		
		
		ByteBuffer buf = BufferUtils.createByteBuffer(4*(10*10));
		buf.rewind();

		GL20.glUseProgram(0);
		GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);

		GL11.glPixelStoref(GL11.GL_UNPACK_ALIGNMENT, 1);
		GL11.glReadBuffer(GL30.GL_COLOR_ATTACHMENT0);

		GL11.glReadPixels(mouseX - 5, mouseZ + 5, 10, 10, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, buf);

		buf.rewind();
		return buf;
	}

	public static int searchForColorInScreen(ByteBuffer buf) {
		for (int i = 0; i < buf.capacity(); i += 4) {
			int red = buf.get(0) & 0xFF;
			int green = buf.get(1) & 0xFF;
			int blue = buf.get(2) & 0xFF;

			if (red == 0 && green == 0) {
				// blue
				return 3;
			} else if (red == 0 && blue == 0) {
				// green]
				return 2;
			} else if (green == 0 && blue == 0) {
				// red
				return 1;

			}
		}
		return -1;
	}

	public static int readValueAtMousePosition() {

		ByteBuffer buf = readRawColor();
		// System.out.println(buf.get(0) + " | " + buf.get(1) + " | " + buf.get(2) + " |
		// " + buf.get(3));
		int red = buf.get(0) & 0xFF;
		currentlyHovering = red;
		
		// System.out.println(currentlyHovering);
		// selectID = 20;

		GlStateManager.color(1, 1, 1, 1);
		return 0;
	}

	public static void bindSelectShader(int id) {
		//select = ShaderLoader.loadShader(new ResourceLocation(ModReference.id + ":shaders/select"));

		
		Shaders.select.use();
		Shaders.select.uniform1i("id", id);
	}

}
