package com.paneedah.weaponlib.render.bgl;

import com.paneedah.weaponlib.config.ModernConfigManager;
import org.apache.commons.lang3.SystemUtils;
import org.lwjgl.opengl.*;

public class GLCompatible {

	// Types
	public static final int NORMAL = 0;
	public static final int ARB = 1;
	public static final int EXT = 2;
	public static final int APPLE = 3;
	public static final int ATI = 4;

	// Support
	public static boolean supportsInstancing = true;
	
	// methods
	public static int fboType = -1;
	public static int msaaType = -1;
	public static int vaoType = -1;
	public static int instancingType = -1;

	public static int attribDivisorType = -1;
	
	public static int multisampleType = -1;

	public static int GL_READ_FRAMEBUFFER;
	public static int GL_DRAW_FRAMEBUFFER;
	public static int GL_FRAMEBUFFER;
	public static int GL_COLOR_ATTACHMENT0;
	public static int GL_DEPTH_ATTACHMENT;
	public static int GL_RENDERBUFFER;
	public static int GL_RGBA16F;
	
	public static int GL_DEPTH_COMPONENT24;

	public static int GL_TEXTURE_2D_MULTISAMPLE;

	// Vertex array object
	public static int GL_VERTEX_ARRAY_BINDING;

	public static boolean isLoaded = false;

	
	public static boolean doesSupportInstancing() {
		return supportsInstancing && ModernConfigManager.enableAllShaders;
	}
	
	/*
	 * Vertex Array Objects (VAOs)
	 */

	public static int glGenVertexArrays() {
		switch (vaoType) {
		case APPLE:
			return APPLEVertexArrayObject.glGenVertexArraysAPPLE();
		case ARB:
			return ARBVertexArrayObject.glGenVertexArrays();
		case NORMAL:
			return GL30.glGenVertexArrays();
		}
		return 0;
	}

	public static void glBindVertexArray(int arg0) {
		switch(vaoType) {
			case APPLE:
				APPLEVertexArrayObject.glBindVertexArrayAPPLE(arg0);
				break;
			case ARB:
				ARBVertexArrayObject.glBindVertexArray(arg0);
				break;
			case NORMAL:
				GL30.glBindVertexArray(arg0);
				break;
		}
	}

	public static boolean glIsVertexArray(int arg0) {
		switch (vaoType) {
		case APPLE:
			return APPLEVertexArrayObject.glIsVertexArrayAPPLE(arg0);
		case ARB:
			return ARBVertexArrayObject.glIsVertexArray(arg0);
		case NORMAL:
			return GL30.glIsVertexArray(arg0);
		}
		return false;
	}

	public static void glDeleteVertexArrays(int arg0) {
		switch(vaoType) {
			case APPLE:
				APPLEVertexArrayObject.glDeleteVertexArraysAPPLE(arg0);
	break;
			case ARB:
				ARBVertexArrayObject.glDeleteVertexArrays(arg0);
	break;
			case NORMAL:
				GL30.glDeleteVertexArrays(arg0);
	break;
		}
		return;
	}



	/*
	 * Vertex Attributes
	 */
	
	public static void glVertexAttribDivisor(int arg0, int arg1) {
		switch(attribDivisorType) {
	
			case ARB:
				ARBInstancedArrays.glVertexAttribDivisorARB(arg0, arg1);
	break;
			case NORMAL:
				GL33.glVertexAttribDivisor(arg0, arg1);
	break;
		}
		return;
	}

	/*
	 * Instancing
	 */
	
	public static void glDrawElementsInstanced(int arg0, int arg1, int arg2, long arg3, int arg4) {
		switch(instancingType) {
			case ARB:
				ARBDrawInstanced.glDrawElementsInstancedARB(arg0, arg1, arg2, arg3, arg4);
	break;
			case EXT:
				EXTDrawInstanced.glDrawElementsInstancedEXT(arg0, arg1, arg2, arg3, arg4);
	break;
			case NORMAL:
				GL31.glDrawElementsInstanced(arg0, arg1, arg2, arg3, arg4);
	break;
		}
		return;
	}
	

	public static void glDrawArraysInstanced(int mode, int first, int count, int primcount) {
		switch (instancingType) {
		case NORMAL:
			GL31.glDrawArraysInstanced(mode, first, count, primcount);
			break;
		case ARB:
			
			ARBDrawInstanced.glDrawArraysInstancedARB(mode, first, count, primcount);
			break;
		case EXT:
			EXTDrawInstanced.glDrawArraysInstancedEXT(mode, first, count, primcount);
			break;
		}
	}

	static {
		init();
	}

	public static void init() {
		if (isLoaded)
			return;
		isLoaded = true;

		ContextCapabilities cap = GLContext.getCapabilities();

		if(cap.OpenGL33) {
			attribDivisorType = NORMAL;
		} else if(cap.GL_ARB_instanced_arrays) {
			attribDivisorType = ARB;
		} else {
			supportsInstancing = false;
		}

		if (cap.OpenGL31) {
			instancingType = NORMAL;
		} else if (cap.GL_ARB_draw_instanced) {
			instancingType = ARB;
		} else if (cap.GL_EXT_draw_instanced) {
			instancingType = EXT;
		} else {
			supportsInstancing = false;
		}
		
		
		// Please fix ;(
		if(SystemUtils.IS_OS_MAC) {
			supportsInstancing = false;
		}

		// Vertex array objects
		if (cap.OpenGL30) {
			vaoType = NORMAL;
			GL_VERTEX_ARRAY_BINDING = GL30.GL_VERTEX_ARRAY_BINDING;
		} else if (cap.GL_ARB_vertex_array_object) {
			vaoType = ARB;
			GL_VERTEX_ARRAY_BINDING = ARBVertexArrayObject.GL_VERTEX_ARRAY_BINDING;
		} else if (cap.GL_APPLE_vertex_array_object) {
			GL_VERTEX_ARRAY_BINDING = APPLEVertexArrayObject.GL_VERTEX_ARRAY_BINDING_APPLE;
			vaoType = APPLE;
		}
		//System.out.println("VAO TYPE: " + vaoType);

		if (cap.OpenGL30) {
			fboType = 0;
			GL_READ_FRAMEBUFFER = GL30.GL_READ_FRAMEBUFFER;
			GL_DRAW_FRAMEBUFFER = GL30.GL_DRAW_FRAMEBUFFER;
			GL_FRAMEBUFFER = GL30.GL_FRAMEBUFFER;
			GL_RENDERBUFFER = GL30.GL_RENDERBUFFER;
			GL_DEPTH_ATTACHMENT = GL30.GL_DEPTH_ATTACHMENT;
			GL_COLOR_ATTACHMENT0 = GL30.GL_COLOR_ATTACHMENT0;
		} else if (cap.GL_ARB_framebuffer_object) {
			fboType = 1;
			GL_READ_FRAMEBUFFER = ARBFramebufferObject.GL_READ_FRAMEBUFFER;
			GL_DRAW_FRAMEBUFFER = ARBFramebufferObject.GL_DRAW_FRAMEBUFFER;
			GL_FRAMEBUFFER = ARBFramebufferObject.GL_FRAMEBUFFER;
			GL_RENDERBUFFER = ARBFramebufferObject.GL_RENDERBUFFER;
			GL_COLOR_ATTACHMENT0 = ARBFramebufferObject.GL_COLOR_ATTACHMENT0;
			GL_DEPTH_ATTACHMENT = ARBFramebufferObject.GL_DEPTH_ATTACHMENT;
		} else if (cap.GL_EXT_framebuffer_object && cap.GL_EXT_framebuffer_blit) {
			GL_READ_FRAMEBUFFER = EXTFramebufferBlit.GL_READ_FRAMEBUFFER_EXT;
			GL_DRAW_FRAMEBUFFER = EXTFramebufferBlit.GL_DRAW_FRAMEBUFFER_EXT;
			GL_FRAMEBUFFER = EXTFramebufferObject.GL_FRAMEBUFFER_EXT;
			GL_COLOR_ATTACHMENT0 = EXTFramebufferObject.GL_COLOR_ATTACHMENT0_EXT;
			GL_DEPTH_ATTACHMENT = EXTFramebufferObject.GL_DEPTH_ATTACHMENT_EXT;
			GL_RENDERBUFFER = EXTFramebufferObject.GL_RENDERBUFFER_EXT;
			fboType = 2;
		} else
			System.out.println("Framebuffer objects not supported");

		if (cap.OpenGL30) {
			GL_RGBA16F = GL30.GL_RGBA16F;
		} else if (cap.GL_APPLE_float_pixels) {
			GL_RGBA16F = APPLEFloatPixels.GL_RGBA_FLOAT16_APPLE;
		} else if (cap.GL_ARB_texture_float) {
			GL_RGBA16F = ARBTextureFloat.GL_RGB16F_ARB;
		} else if (cap.GL_ATI_texture_float) {
			GL_RGBA16F = ATITextureFloat.GL_RGBA_FLOAT16_ATI;
		} else {
			System.out.println("Floating point texture component not supported");
		}
		
		
		
		if(cap.OpenGL14) {
			GL_DEPTH_COMPONENT24 = GL14.GL_DEPTH_COMPONENT24;
		} else if(cap.GL_ARB_depth_texture) {
			GL_DEPTH_COMPONENT24 = ARBDepthTexture.GL_DEPTH_COMPONENT24_ARB;
		} 

		
		
		if(cap.OpenGL32) {
			multisampleType = NORMAL;
			GL_TEXTURE_2D_MULTISAMPLE = GL32.GL_TEXTURE_2D_MULTISAMPLE;
		} else if(cap.GL_ARB_texture_multisample) {
			multisampleType = ARB;
			GL_TEXTURE_2D_MULTISAMPLE = ARBTextureMultisample.GL_TEXTURE_2D_MULTISAMPLE;
			
		}

		
		
		
	

	}

	public static void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height,
			boolean fixedsamplelocations) {

		init();
		
		switch (multisampleType) {
			case NORMAL:
				GL32.glTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
				break;
			case ARB:
				
				ARBTextureMultisample.glTexImage2DMultisample(target, samples, internalformat, width, height,
						fixedsamplelocations);
				break;
				

		}

	}

	public static int glGenFramebuffers() {
		init();
		switch (fboType) {
		case NORMAL:
			return GL30.glGenFramebuffers();
		case ARB:

			return ARBFramebufferObject.glGenFramebuffers();

		case EXT:
			return EXTFramebufferObject.glGenFramebuffersEXT();

		}
		return -1;
	}

	public static void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
		init();
		switch (fboType) {
		case NORMAL:
			GL30.glFramebufferTexture2D(target, attachment, textarget, texture, level);
			break;
		case ARB:
			ARBFramebufferObject.glFramebufferTexture2D(target, attachment, textarget, texture, level);
			break;
		case EXT:
			EXTFramebufferObject.glFramebufferTexture2DEXT(target, attachment, textarget, texture, level);
			break;
		}
	}

	public static void glBindFramebuffer(int target, int framebuffer) {
		init();
		switch (fboType) {
		case NORMAL:
			GL30.glBindFramebuffer(target, framebuffer);
			break;
		case ARB:
			ARBFramebufferObject.glBindFramebuffer(target, framebuffer);
			break;
		case EXT:
			EXTFramebufferObject.glBindFramebufferEXT(target, framebuffer);
			break;
		}
	}

	public static void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1,
			int dstY1, int mask, int filter) {
		init();
		switch (fboType) {
		case NORMAL:
			GL30.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
			break;
		case ARB:
			ARBFramebufferObject.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask,
					filter);
			break;
		case EXT:
			EXTFramebufferBlit.glBlitFramebufferEXT(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask,
					filter);
			break;
		}
	}

	// GL20.glBindAttribLocation(shaderID, attribID, variableName);
	public static void glBindAttribLocation(int shaderID, int attribID, String variableName) {
		GL20.glBindAttribLocation(shaderID, attribID, variableName);
	}

}
