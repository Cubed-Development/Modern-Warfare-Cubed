package com.paneedah.weaponlib.render.bgl;

import com.paneedah.mwc.utils.MWCUtil;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.animation.ClientValueRepo;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.render.DepthTexture;
import com.paneedah.weaponlib.render.HDRFramebuffer;
import com.paneedah.weaponlib.render.Shaders;
import com.paneedah.weaponlib.render.bgl.weather.ModernWeatherRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.IRenderHandler;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.util.glu.Project;
import org.lwjgl.util.vector.Matrix4f;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

/**
 * Post-processing pipeline enabling modern post effects to be applied in
 * Minecraft
 * 
 * @author Jim Holden, 2022
 */
public class PostProcessPipeline {

	private static int width = -1;
	private static int height = -1;

	// Textures
	public static final ResourceLocation HEAT_DISTORTION = new ResourceLocation(ModReference.ID + "textures/maps/heatdistortion.png");
	public static final ResourceLocation CLOUD_SPRITE = new ResourceLocation(ModReference.ID + "textures/maps/cloudsprite.png");
	public static final ResourceLocation RAIN_DROP_TEXTURE = new ResourceLocation(ModReference.ID + "textures/maps/raindrop.png");
	public static final ResourceLocation SNOW_FLAKE_TEXTURE = new ResourceLocation(ModReference.ID + "textures/maps/snowflake.png");

	// Float buffers
	private static final FloatBuffer projectionBuffer = BufferUtils.createFloatBuffer(16);
	private static final FloatBuffer modelViewBuffer = BufferUtils.createFloatBuffer(16);

	private static final FloatBuffer PROJECTION_MATRIX_BUFFER = BufferUtils.createFloatBuffer(16);
	private static final FloatBuffer MODELVIEW_MATRIX_BUFFER = BufferUtils.createFloatBuffer(16);
	// private static final FloatBuffer INVERSE_VIEW_PROJECTION_BUFFER =
	// BufferUtils.createFloatBuffer(16);

	private static final LightManager lightManager = new LightManager();

	public static Framebuffer distortionBuffer;
	// public static Framebuffer maskingBuffer;
	public static Framebuffer rainBuffer;
	public static Framebuffer secondaryWorldBuffer;

	private static ArrayList<DistortionPoint> distortionList = new ArrayList<>();

	/*
	private static int depthBuffer = -1;
	private static int depthTexture = -1;
	*/
	
	private static int fauxColorTexture = -1;
	
	
	private static DepthTexture scopeDepthTexture;
	private static DepthTexture normalDepthTexture;

	
	// Tells us if the player has flipped the configuration option
	private static boolean persistenceWeatherStatus = false;
	private static boolean swappedWeatherRenderer = false;
	
	// Gives us the original weather renderer to swap back to
	private static IRenderHandler originalWeatherRenderer;
	
	
	private static final ModernWeatherRenderer modernWeatherRenderer = new ModernWeatherRenderer();

	private static final float ALPHA_MULTIPLIER_DISTORTION = 0.5f;

	// Constants
	private static final int MAX_RAINDROPS_ON_SCREEN = 16;
	private static final float BASE_FOG_INTENSITY = 0.6f;
	private static final float[] BASE_FOG_COLOR = new float[] { 0.6f, 0.6f, 0.6f };

	/**
	 * This is a useful tool to easily render things to the distortion buffer
	 * without making GL calls in areas where it is inconvienent to.
	 * 
	 * @author Homer Riva-Cambrin, 2022
	 * @version September 28th, 2022
	 */
	public static class DistortionPoint {
		private float x, y, z;
		private float size, life, alpha;
		private long creationTime;

		public DistortionPoint(float x, float y, float z, float size, float life) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.size = size;
			this.life = life;
			this.creationTime = System.currentTimeMillis();
		}

		public void update() {
			this.alpha = 1.0f - (System.currentTimeMillis() - creationTime) / life;

		}

		public float getAlpha() {
			return this.alpha;
		}

		public float getX() {
			return this.x;
		}

		public float getY() {
			return this.y;
		}

		public float getZ() {
			return this.z;
		}

		public float getSize() {
			return this.size;
		}

		public float getLife() {
			return this.life;
		}

		public long getBirthTime() {
			return creationTime;
		}

	}

	/**
	 * Creates a distortion point at the set coordinates with a certain size and
	 * life
	 * 
	 * @param x    - (X) coordinate in the world
	 * @param y    - (Y) coordinate in the world
	 * @param z    - (Z) coordinate in the world
	 * @param size - size of distortion circle
	 * @param life - how much time it lasts
	 */
	public static void createDistortionPoint(float x, float y, float z, float size, float life) {
		distortionList.add(new DistortionPoint(x, y, z, size, life));
	}

	/**
	 * Returns the game's light manager, this handles all the dyanmic world lights
	 * 
	 * @return light manager
	 */
	public static LightManager getLightManager() {
		return lightManager;
	}

	/**
	 * Getter method for obtaining the weather renderer class
	 * 
	 * @return the weather renderer
	 */
	public static ModernWeatherRenderer getWeatherRenderer() {
		return modernWeatherRenderer;
	}

	/**
	 * Static method that changes the world's weather renderer
	 */
	public static void setWorldElements() {
		if(!swappedWeatherRenderer || (ModernConfigManager.enableFancyRainAndSnow != persistenceWeatherStatus)) {
			persistenceWeatherStatus = ModernConfigManager.enableFancyRainAndSnow;

			if(persistenceWeatherStatus) {
				if(!swappedWeatherRenderer)
					originalWeatherRenderer = mc.world.provider.getWeatherRenderer();

				mc.world.provider.setWeatherRenderer(modernWeatherRenderer);

			} else {
				mc.world.provider.setWeatherRenderer(originalWeatherRenderer);
			}
			
			swappedWeatherRenderer = true;
		}
	}

	/**
	 * Obtains the current modelview & projection matrices, inverts them, and stores
	 * them in a float buffer for later shader use.
	 */
	public static void fillGLBuffers() {

		// Create base matrices
		// Matrix4f inverseProjView = new Matrix4f();
		Matrix4f modelViewMatrix = new Matrix4f();
		Matrix4f projectionMatrix = new Matrix4f();

		modelViewMatrix.load(MODELVIEW_MATRIX_BUFFER);
		projectionMatrix.load(PROJECTION_MATRIX_BUFFER);

		modelViewMatrix.invert();
		projectionMatrix.invert();

		PROJECTION_MATRIX_BUFFER.rewind();
		MODELVIEW_MATRIX_BUFFER.rewind();

		projectionMatrix.store(PROJECTION_MATRIX_BUFFER);
		modelViewMatrix.store(MODELVIEW_MATRIX_BUFFER);

		PROJECTION_MATRIX_BUFFER.rewind();
		MODELVIEW_MATRIX_BUFFER.rewind();

		/*
		 * Inverse view projection matrix Matrix4f.mul(projectionMatrix,
		 * modelViewMatrix, inverseProjView); INVERSE_VIEW_PROJECTION_BUFFER.rewind();
		 * inverseProjView.store(INVERSE_VIEW_PROJECTION_BUFFER);
		 * INVERSE_VIEW_PROJECTION_BUFFER.rewind();
		 */
	}
	
	
	public static boolean shouldDoFog() {
		return false;
		//return ModernConfigManager.enableAllShaders && ModernConfigManager.enableWorldShaders && getFogIntensity() != 0;
	}
	
	


	public static void recreateDepthFramebuffer() {
		if (normalDepthTexture == null)
			normalDepthTexture = new DepthTexture(width, height);
		normalDepthTexture.recreateBuffer(width, height);

		/*
		Framebuffer buffer = mc.getFramebuffer();
		
		if(normalDepthTexture == null) {
			normalDepthTexture = new DepthTexture(buffer.framebufferWidth, buffer.framebufferHeight);
		}
		
		// Method automatically tests if it should so there
		// is very little overhead here.
		normalDepthTexture.recreateBuffer(buffer.framebufferWidth, buffer.framebufferHeight);
		
		// Blit the buffer onto the scope's depth texture
		normalDepthTexture.blitOn(buffer, true);
		*/
		

		/*
		// If there is a depth buffer, delete it
		if (depthBuffer != -1)
			OpenGlHelper.glDeleteFramebuffers(depthBuffer);

		// Generate depth texture
		if (depthTexture == -1)
			depthTexture = GL11.glGenTextures();

		

		// Depth buffer
		depthBuffer = OpenGlHelper.glGenFramebuffers();
		OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, depthBuffer);

		GlStateManager.bindTexture(depthTexture);
		GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GLCompatible.GL_DEPTH_COMPONENT24, width, height, 0,
				GL11.GL_DEPTH_COMPONENT, GL11.GL_FLOAT, (FloatBuffer) null);
		GlStateManager.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
		GlStateManager.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
		GlStateManager.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
		GlStateManager.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
		OpenGlHelper.glFramebufferTexture2D(OpenGlHelper.GL_FRAMEBUFFER, OpenGlHelper.GL_DEPTH_ATTACHMENT,
				GL11.GL_TEXTURE_2D, depthTexture, 0);
		*/
		// Stupid OpenGL spec requires this
		// for older computers

		
		// GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGB, width, height, 0,
		// GL11.GL_RGB,
		// GL11.GL_UNSIGNED_BYTE, (IntBuffer) null);
		

		// (new org.apache.logging.log4j.core.log()).setl

		// GL30.GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER
		// System.out.println("Flag 3: " + GL11.glGetError());
		// int bruh =
		// OpenGlHelper.glCheckFramebufferStatus(OpenGlHelper.GL_FRAMEBUFFER);

		/*
		int status = OpenGlHelper.glCheckFramebufferStatus(OpenGlHelper.GL_FRAMEBUFFER);

		if (status != OpenGlHelper.GL_FRAMEBUFFER_COMPLETE) {
			if (status == OpenGlHelper.GL_FB_INCOMPLETE_ATTACHMENT) {
				log.error("Depth framebuffer creation returned an incomplete attachment error.");
			} else if (status == OpenGlHelper.GL_FB_INCOMPLETE_MISS_ATTACH) {
				log.error("Depth framebuffer creation returned a missing attachment error.");
			} else if (status == OpenGlHelper.GL_FB_INCOMPLETE_DRAW_BUFFER) {
				log.error("Depth framebuffer creation returned an incomplete draw buffer error.");
			} else if (status == OpenGlHelper.GL_FB_INCOMPLETE_READ_BUFFER) {
				log.error("Depth framebuffer creation returned an incomplete read buffer error.");
			} else {
				log.error("Depth framebuffer creation returned an unknown status");
			}
		} else {
			log.debug("Succesfully created depth buffer.");
		}
		*/

		// GL11.glGetError();
		/*
		 * if (bruh != OpenGlHelper.GL_FRAMEBUFFER_COMPLETE) { System.out.
		 * println("Failed to create depth texture framebuffer! This is an error!"); }
		 * else { System.out.println("Succesfully created DEPTH framebuffer!"); }
		 * 
		 */
	}
	
	
	
	public static void blitScopeDepthTexture(Framebuffer buffer) {
		if(scopeDepthTexture == null) {
			scopeDepthTexture = new DepthTexture(buffer.framebufferWidth, buffer.framebufferHeight);
		}
		
		// Method automatically tests if it should so there
		// is very little overhead here.
		scopeDepthTexture.recreateBuffer(buffer.framebufferWidth, buffer.framebufferHeight);
		
		// Blit the buffer onto the scope's depth texture
		scopeDepthTexture.blitOn(buffer, true);
		
	}
	
	public static DepthTexture getScopeDepthTexture() {
		return scopeDepthTexture;
	}

	public static void blitDepth() {
		
		Framebuffer buffer = mc.getFramebuffer();
		
		if(normalDepthTexture == null)
			normalDepthTexture = new DepthTexture(buffer.framebufferWidth, buffer.framebufferHeight);
		
	
		// Blit the buffer onto the main depth texture
		normalDepthTexture.blitOn(buffer, true);

		/*
		if (depthBuffer == -1)
			recreateDepthFramebuffer();
		// recreateDepthFramebuffer();
		// System.out.println("Core");

		OpenGlHelper.glBindFramebuffer(GLCompatible.GL_READ_FRAMEBUFFER,
				mc.getFramebuffer().framebufferObject);
		OpenGlHelper.glBindFramebuffer(GLCompatible.GL_DRAW_FRAMEBUFFER, depthBuffer);

		GLCompatible.glBlitFramebuffer(0, 0, width, height, 0, 0, width, height, GL11.GL_DEPTH_BUFFER_BIT,
				GL11.GL_NEAREST);

		mc.getFramebuffer().bindFramebuffer(false);
		*/
	}

	/**
	 * Checks to see if the screen size has changed, or if we are just initializing
	 * these buffers in order to determine if they must be recreated
	 * 
	 * @return true if the framebuffers need to be remade
	 */
	public static boolean shouldRecreateFramebuffer() {
		if (width == -1 || height == -1)
			return true;

		return mc.displayWidth != width || mc.displayHeight != height;
	}

	/**
	 * Recreates the various framebuffers that were initialized
	 */
	public static void recreateFramebuffers() {
		width = mc.displayWidth;
		height = mc.displayHeight;

		recreateDepthFramebuffer();
		
		// Create color attachment
		if (fauxColorTexture == -1)
			fauxColorTexture = GL11.glGenTextures();
		GlStateManager.bindTexture(fauxColorTexture);
		GlStateManager.glTexImage2D(3553, 0, 32856, width, height, 0, 6408, 5121, (IntBuffer) null);
		OpenGlHelper.glFramebufferTexture2D(OpenGlHelper.GL_FRAMEBUFFER, OpenGlHelper.GL_COLOR_ATTACHMENT0,
				GL11.GL_TEXTURE_2D, fauxColorTexture, 0);

		if (distortionBuffer != null)
			distortionBuffer.deleteFramebuffer();
		distortionBuffer = new Framebuffer(width, height, true);

		if (rainBuffer != null)
			rainBuffer.deleteFramebuffer();
		rainBuffer = new Framebuffer(width, height, false);

		if (secondaryWorldBuffer != null)
			secondaryWorldBuffer.deleteFramebuffer();
		secondaryWorldBuffer = new HDRFramebuffer(width, height, true);
	}

	/**
	 * Transforms a 3-dimensional vector according to a 4x4 matrix (i.e. OpenGL
	 * matrices)
	 * 
	 * @param vec - A 3-component vector
	 * @param mat - A [4x4] matrix
	 * @return Transformed vector
	 */
	public static Vec3d mat4Transform(Vec3d vec, Matrix4f mat) {
		if (mat != null) {
			double x = mat.m00 * vec.x + mat.m10 * vec.y + mat.m20 * vec.z + mat.m30;
			double y = mat.m01 * vec.x + mat.m11 * vec.y + mat.m21 * vec.z + mat.m31;
			double z = mat.m02 * vec.x + mat.m12 * vec.y + mat.m22 * vec.z + mat.m32;
			return new Vec3d(x, y, z);
		}
		return vec;
	}

	public static void setupDistortionBufferEffects() {
		if (shouldRecreateFramebuffer())
			recreateFramebuffers();

		// blitDepth();

		distortionBuffer.framebufferClear();

		/*
		OpenGlHelper.glBindFramebuffer(GLCompatible.GL_READ_FRAMEBUFFER,
				mc.getFramebuffer().framebufferObject);
		OpenGlHelper.glBindFramebuffer(GLCompatible.GL_DRAW_FRAMEBUFFER,
				PostProcessPipeline.distortionBuffer.framebufferObject);

		GLCompatible.glBlitFramebuffer(0, 0, width, height, 0, 0, width, height, GL11.GL_DEPTH_BUFFER_BIT,
				GL11.GL_NEAREST);

	
		distortionBuffer.bindFramebuffer(false);

		*/
		distortionList.removeIf((s) -> (System.currentTimeMillis() - s.getBirthTime() > s.getLife()));

		for (DistortionPoint dp : distortionList)
			dp.update();

		Vec3d playerPos = mc.player.getPositionVector();

		distortionList.sort((a, b) -> {
			double distA = new Vec3d(a.getX(), a.getY(), a.getZ()).subtract(playerPos).length();
			double distB = new Vec3d(b.getX(), b.getY(), b.getZ()).subtract(playerPos).length();

			return (int) (Math.round(distB) - Math.round(distA));

		});

		Vec3d iVec = MWCUtil.getInterpolatedPlayerPos();

		GlStateManager.pushMatrix();
		GlStateManager.translate(-iVec.x, -iVec.y, -iVec.z);
		GlStateManager.enableTexture2D();
		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();
		GlStateManager.alphaFunc(GL11.GL_GREATER, 0.0F);
		GlStateManager.blendFunc(SourceFactor.ONE, DestFactor.ONE_MINUS_SRC_ALPHA);
		mc.getTextureManager().bindTexture(CLOUD_SPRITE);

		GlStateManager.enableDepth();

		GlStateManager.depthMask(false);

		modelViewBuffer.rewind();
		projectionBuffer.rewind();

		GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, modelViewBuffer);
		GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, projectionBuffer);

		modelViewBuffer.rewind();
		projectionBuffer.rewind();

		Matrix4f modelViewMatrix = new Matrix4f();
		Matrix4f projectionMatrix = new Matrix4f();

		modelViewMatrix.load(modelViewBuffer);
		projectionMatrix.load(projectionBuffer);

		Matrix4f viewProjection = new Matrix4f();
		Matrix4f.mul(projectionMatrix, modelViewMatrix, viewProjection);

		modelViewMatrix.m30 = 0f;
		modelViewMatrix.m31 = 0f;
		modelViewMatrix.m32 = 0f;
		modelViewMatrix.invert();

		Shaders.billboard.use();
		Shaders.billboard.uniform1i("depthTex", 6);
		Shaders.billboard.uniform2f("viewportSize", width, height);

		GlStateManager.enableTexture2D();

		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX_COLOR);
		for (DistortionPoint dp : distortionList) {
			Vec3d pos = new Vec3d(dp.getX(), dp.getY(), dp.getZ());

			Vec3d v1 = mat4Transform(new Vec3d(-dp.getSize(), -dp.getSize(), 0), modelViewMatrix).add(pos);
			Vec3d v2 = mat4Transform(new Vec3d(-dp.getSize(), dp.getSize(), 0), modelViewMatrix).add(pos);
			Vec3d v3 = mat4Transform(new Vec3d(dp.getSize(), dp.getSize(), 0), modelViewMatrix).add(pos);
			Vec3d v4 = mat4Transform(new Vec3d(dp.getSize(), -dp.getSize(), 0), modelViewMatrix).add(pos);

			bb.pos(v1.x, v1.y, v1.z).tex(0, 0).color(1, 1, 1, dp.getAlpha() * ALPHA_MULTIPLIER_DISTORTION).endVertex();
			bb.pos(v2.x, v2.y, v2.z).tex(1, 0).color(1, 1, 1, dp.getAlpha() * ALPHA_MULTIPLIER_DISTORTION).endVertex();
			bb.pos(v3.x, v3.y, v3.z).tex(1, 1).color(1, 1, 1, dp.getAlpha() * ALPHA_MULTIPLIER_DISTORTION).endVertex();
			bb.pos(v4.x, v4.y, v4.z).tex(0, 1).color(1, 1, 1, dp.getAlpha() * ALPHA_MULTIPLIER_DISTORTION).endVertex();
		}

		t.draw();

		GlStateManager.depthMask(true);

		GlStateManager.blendFunc(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA);
		mc.getFramebuffer().bindFramebuffer(false);
		GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1F);
		GlStateManager.popMatrix();

		Shaders.billboard.release();

	}

	public static void captureMatricesIntoBuffers() {
		GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, MODELVIEW_MATRIX_BUFFER);
		GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, PROJECTION_MATRIX_BUFFER);

		PROJECTION_MATRIX_BUFFER.rewind();
		MODELVIEW_MATRIX_BUFFER.rewind();

	}

	public static float getFogIntensity() {
		if (mc.world == null)
			return 0.0f;
		return BASE_FOG_INTENSITY * mc.world.getRainStrength(mc.getRenderPartialTicks());
	}
	
	public static float[] getBaseFogColor() {
		return BASE_FOG_COLOR;
	}
	
	/**
	 * Called at the end of the world render, copies the framebuffer into a second
	 * buffer, applies post effects, and renders it back
	 */
	public static void doWorldProcessing() {
		if(!ModernConfigManager.enableWorldShaders)
			return;

		if(ModernConfigManager.enableAllShaders && ModernConfigManager.onScreenRainAndSnow)
			drawRainBuffer();

		if(true) // I don't know why Jim did this, but removing it renders a white screen.
			 return;

		//Shaders.postWorld = ShaderLoader.loadVMWShader("postworld");

		// Check if buffers need to be remade
		if (shouldRecreateFramebuffer())
			recreateFramebuffers();

		// Bind secondary buffer
		secondaryWorldBuffer.bindFramebuffer(false);

		// Do shader stuff
		GlStateManager.setActiveTexture(GL13.GL_TEXTURE0 + 6);
		GlStateManager.bindTexture(normalDepthTexture.getTexture());
		GlStateManager.setActiveTexture(GL13.GL_TEXTURE0);

		fillGLBuffers();

		// Copy the Minecraft framebuffer to the secondary world buffer
		OpenGlHelper.glBindFramebuffer(GLCompatible.GL_READ_FRAMEBUFFER, mc.getFramebuffer().framebufferObject);
		OpenGlHelper.glBindFramebuffer(GLCompatible.GL_DRAW_FRAMEBUFFER, secondaryWorldBuffer.framebufferObject);

		GLCompatible.glBlitFramebuffer(0, 0, width, height, 0, 0, width, height, GL11.GL_COLOR_BUFFER_BIT,
				GL11.GL_NEAREST);

		Shaders.postWorld.use();
		Shaders.postWorld.uniform1i("depthBuf", 6);
		Shaders.postWorld.uniform1f("fogIntensity", getFogIntensity());
		Shaders.postWorld.uniform3f("baseFogColor", getBaseFogColor()[0], getBaseFogColor()[1], getBaseFogColor()[2]);
		// Shaders.postWorld.uniform1f("help", 0.2f);
		// Shaders.postWorld.uniform1f("joe[0]", 1.0f);

		// GL20.glUniform1f(GL20.getloc, v0);

		// Shaders.post.uniform3f("fk3f[0]", 5f, 0f, 0f);

		// Shaders.post.uniform1f("help", 0.0f);
		// Send light data to the shader and
		// update the light manager
		lightManager.updateUniforms(Shaders.postWorld);
		lightManager.update();

		Vec3d interpolatedPosition = MWCUtil.getInterpolatedPlayerPos();
		Shaders.postWorld.uniform3f("cameraPosition", (float) interpolatedPosition.x, (float) interpolatedPosition.y,
				(float) interpolatedPosition.z);

		//System.out.println("obama");
		// Send inverse matrices to shader
		Shaders.postWorld.sendMatrix4AsUniform("inverseViewMatrix", false, MODELVIEW_MATRIX_BUFFER);
		Shaders.postWorld.sendMatrix4AsUniform("inverseProjectionMatrix", false, PROJECTION_MATRIX_BUFFER);

		// Render framebuffer back to main
		OpenGlHelper.glBindFramebuffer(GLCompatible.GL_DRAW_FRAMEBUFFER, mc.getFramebuffer().framebufferObject);
		secondaryWorldBuffer.framebufferRender(mc.displayWidth, mc.displayHeight);
		Shaders.postWorld.release();

		// Rebind the MC Framebuffer
		mc.getFramebuffer().bindFramebuffer(false);

		if(ModernConfigManager.enableAllShaders && ModernConfigManager.onScreenRainAndSnow)
			drawRainBuffer();
	}

	/**
	 * Prepares the rain buffer by setting up an orthographic matrix in order to
	 * render to screen coordinates
	 */
	public static void prepareRainBuffer() {
		rainBuffer.framebufferClear();
		rainBuffer.bindFramebuffer(false);
		GlStateManager.pushMatrix();

		ScaledResolution scaledresolution = new ScaledResolution(mc);
		GlStateManager.matrixMode(5889);
		GlStateManager.loadIdentity();
		GlStateManager.ortho(0.0D, scaledresolution.getScaledWidth_double(), scaledresolution.getScaledHeight_double(), 0.0D, 1000.0D, 3000.0D);
		GlStateManager.matrixMode(5888);
		GlStateManager.loadIdentity();
		GlStateManager.translate(0.0F, 0.0F, -2000.0F);
		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();
		GlStateManager.alphaFunc(GL11.GL_GREATER, 0.0f);

	}

	/*
	 * Raindrop[id] { posX, posY, velX, velY, scale, sizeTarget, time, life,
	 * stretch, texture} [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
	 * 
	 * Total size of Array = (4 bytes per float) x (16 drops) x (9 properties) = 512
	 * bytes
	 * 
	 */
	public static float[][] rainDrops = new float[64][9];
	public static long inRainTimestamp = System.currentTimeMillis();
	
	
	// Turns off when there are no more 'active' drops
	private static boolean rainKeepAlive = false;
	
	
	public static void drawRainBuffer() {
		float rainStrength = mc.world.getRainStrength(mc.getRenderPartialTicks());
		boolean isRain = ModernWeatherRenderer.isRainingOrSnowing(mc.player.getPosition());
	
		// Cancels rain render when there are no drops left to dry and there
		// is no rain.
		if(rainStrength == 0.0 && !rainKeepAlive)
			return;

		Biome playerBiome = mc.world.getBiome(mc.player.getPosition());

		int playerHeight = mc.world.getHeight(mc.player.getPosition().getX(), mc.player.getPosition().getZ());
		if (rainStrength != 0.0 && mc.player.getEyeHeight() + mc.player.posY > playerHeight
				&& ((isRain && playerBiome.canRain()) || (!isRain && playerBiome.getEnableSnow()))) {

			if (inRainTimestamp == -1) {
				inRainTimestamp = System.currentTimeMillis();
			}

			// Ease into rain by lowering the raindrop spawning
			// when rain is coming on and leaving, and also
			// when stepping out of shelter
			long currentTime = (int) Math
					.min((MAX_RAINDROPS_ON_SCREEN * ((System.currentTimeMillis() - inRainTimestamp) / (double) 2000))
							* rainStrength, MAX_RAINDROPS_ON_SCREEN);

			for (int i = 0; i < currentTime; i++) {

				// When raindrops die, their life
				// is set to zero, so here
				// we can replace dead raindrops with new ones
				if (rainDrops[i][7] == 0f) {

					// Velocity is handled as a special
					// case because we want some stagnant drops.
					// If it is snowing they should never
					// have velocity.
					float velocity = 0;
					if (isRain && Math.random() < 0.3) {
						velocity = (float) (Math.random() * 20f);
					}

					rainDrops[i] = new float[] { (float) Math.random() * 600f, (float) Math.random() * 250f, 0f,
							(float) velocity, 0f, (float) Math.random() * 25f + 30f, 0f, (float) Math.random() * 10f,
							0f, isRain ? 1 : 0 };

				}

			}
		} else {
			inRainTimestamp = -1;
		}

		// Prepare
		prepareRainBuffer();
		/*
		 * ResourceLocation res = new ResourceLocation("mw" + ":" +
		 * "textures/maps/snowflake.png");
		 * 
		 * GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER,
		 * GL11.GL_LINEAR); GL11.glTexParameteri(GL11.GL_TEXTURE_2D,
		 * GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
		 */
		
		rainKeepAlive = false;

		double dt = 0.05;
		for (float[] raindrop : rainDrops) {
			if (raindrop[7] == 0f)
				continue;
			
			rainKeepAlive = true;

			if (raindrop[9] == 1) {
				mc.getTextureManager().bindTexture(RAIN_DROP_TEXTURE);
			} else {
				mc.getTextureManager().bindTexture(SNOW_FLAKE_TEXTURE);
			}

			// Scale to size target
			// within the first 1/8th
			// of their life.
			float lifeDivisor = 64f;
			if (raindrop[6] < raindrop[7] / lifeDivisor) {
				raindrop[4] = raindrop[5] * (raindrop[6] / (raindrop[7] / lifeDivisor));

			}

			// Increase the time that they
			// have existed
			raindrop[6] += 0.01f;

			// Kill droplets that overlast their stay
			if (raindrop[6] > raindrop[7]) {
				raindrop[7] = 0f;
			}

			// Apply friction to velocity
			raindrop[2] *= 0.9999;
			raindrop[3] *= 0.992;

			// Semi-implicit euler integration
			float vertical = (float) (raindrop[3] * dt);
			raindrop[0] += raindrop[2] * dt;
			raindrop[1] += vertical;

			// System.out.println(vertical);
			raindrop[8] += vertical;

			// Fade
			float alphaFade = 1f;
			if (raindrop[6] > raindrop[7] / 2) {
				alphaFade = 1.0f - (raindrop[6] - raindrop[7] / 2.0f) / (raindrop[7] / 2);
			}

			drawRaindrop(raindrop[0], raindrop[1], raindrop[4], raindrop[8], alphaFade);
		}

		//System.out.println("There are " + (rainKeepAlive ? "still" : "no") + " drops left.");
		
		// Clean up GlStates
		endRainBufferRender();
	}

	/**
	 * Draws a rain drop on the screen with a certain stretch and size factor
	 * 
	 * @param x       - X-coordinate for raindrop
	 * @param y       - Y-coordinate for raindrop
	 * @param size    - Size of raindrop
	 * @param stretch - Stretch factor for raindrop
	 * @param alpha   - Opacity of raindrop
	 */
	public static void drawRaindrop(double x, double y, double size, double stretch, float alpha) {

		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();

		GlStateManager.disableCull();
		double halfSize = size / 2;

		GlStateManager.color(1.0f, 1.0f, 1.0f, alpha);

		bb.begin(GL11.GL_TRIANGLE_STRIP, DefaultVertexFormats.POSITION_TEX);

		bb.pos(x - halfSize, y - stretch, 0).tex(0, 0).endVertex();
		bb.pos(x - halfSize, y + halfSize, 0).tex(0, 0.5).endVertex();
		bb.pos(x + halfSize, y - stretch, 0).tex(1, 0).endVertex();

		bb.pos(x + halfSize, y - stretch, 0).tex(1, 0).endVertex();
		bb.pos(x + halfSize, y + halfSize, 0).tex(1, 0.5).endVertex();
		bb.pos(x - halfSize, y + halfSize, 0).tex(0, 0.5).endVertex();

		bb.pos(x - halfSize, y + halfSize, 0).tex(0, 0.5).endVertex();
		bb.pos(x + halfSize, y + halfSize, 0).tex(1, 0.5).endVertex();
		bb.pos(x - halfSize, y + size, 0).tex(0, 1.0).endVertex();

		bb.pos(x + halfSize, y + halfSize, 0).tex(1, 0.5).endVertex();
		bb.pos(x - halfSize, y + size, 0).tex(0, 1).endVertex();
		bb.pos(x + halfSize, y + size, 0).tex(1, 1).endVertex();

		t.draw();
	}

	/**
	 * Changes back to perspective rendering
	 */
	public static void endRainBufferRender() {

		GlStateManager.matrixMode(5889);
		GlStateManager.loadIdentity();

		float fpt = mc.entityRenderer.farPlaneDistance;

		float fovModValue = mc.entityRenderer.getFOVModifier(mc.getRenderPartialTicks(), false);;

		Project.gluPerspective(fovModValue, (float) mc.displayWidth / (float) mc.displayHeight, 0.05F, fpt * 2.0F);

		// Project.gluPerspective(fovModValue, (float) mc.displayWidth / (float)
		// mc.displayHeight, 0.05F, fpt * MathHelper.SQRT_2);

		// Project.gluPerspective(mc.gameSettings.fovSetting, (float) mc.displayWidth /
		// (float) mc.displayHeight, 0.05F,
		// fpt * 2.0f);

		// Project.gluPerspective(this.getFOVModifier(partialTicks, true),
		// (float)this.mc.displayWidth / (float)this.mc.displayHeight, 0.05F,
		// this.farPlaneDistance * MathHelper.SQRT_2);

		GlStateManager.matrixMode(5888);
		GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1f);
		GlStateManager.popMatrix();
		mc.getFramebuffer().bindFramebuffer(false);
	}

	/**
	 * Should be called at the end of rendering, applies to all rendering including
	 * the hand. This effects are effects that transcend things like the world, and
	 * are flat (i.e. film grain)
	 */
	public static void doPostProcess() {
		if (!ModernConfigManager.enableScreenShaders)
			return;
		
		// if(true) return;

		if (AnimationModeProcessor.getInstance().getFPSMode())
			return;

		// Checks to see if the framebuffers
		// should be remade in the case of
		// a screen resize
		if (shouldRecreateFramebuffer())
			recreateFramebuffers();

		// mc.player.world.play
		// Draws rain droplets
		// drawRainBuffer();

		GlStateManager.enableBlend();
		GlStateManager.disableAlpha();

		boolean isRain = mc.world.getBiomeProvider().getTemperatureAtHeight(mc.player.getPosition().getX(),
				mc.player.getPosition().getZ()) >= 0.15F;

		// Rain buffer which is used to render snow & rain on screen
		GlStateManager.setActiveTexture(GL13.GL_TEXTURE0 + 3);
		GlStateManager.bindTexture(rainBuffer.framebufferTexture);

		// Distortion buffer texture
		GlStateManager.setActiveTexture(GL13.GL_TEXTURE0 + 5);
		GlStateManager.bindTexture(distortionBuffer.framebufferTexture);

		// Heat distortion texture
		GlStateManager.setActiveTexture(GL13.GL_TEXTURE0 + 4);
		mc.getTextureManager().bindTexture(HEAT_DISTORTION);
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);

		// Return to default texture unit
		GlStateManager.setActiveTexture(GL13.GL_TEXTURE0);

		//Shaders.post = ShaderLoader.loadVMWShader("post");
		Shaders.post.use();

		// Send buffers as uniforms
		Shaders.post.uniform1i("rainBuf", 3);
		Shaders.post.uniform1i("distortionTex", 4);
		Shaders.post.uniform1i("distortionBuffer", 5);

		// Send variables as uniforms
		Shaders.post.uniform2f("windowSize", 1.0f / mc.displayWidth, 1.0f / mc.displayHeight);
		Shaders.post.boolean1b("isSnow", !isRain);
		Shaders.post.uniform1f("timer", ClientValueRepo.TICKER.getLerpedFloat());
		
		Shaders.post.boolean1b("enableFilmGrain", ModernConfigManager.filmGrain);
		Shaders.post.uniform1f("mdf", (float) ModernConfigManager.filmGrainIntensity);
		Shaders.post.boolean1b("onScreenLiquids", ModernConfigManager.onScreenRainAndSnow);

		Shaders.post.release();

		// drawRainBuffer();

	}

}
