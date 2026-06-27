package com.paneedah.weaponlib.render.bgl;

import com.paneedah.weaponlib.config.ModernConfigManager;
import org.apache.commons.lang3.SystemUtils;
import org.lwjgl.opengl.*;

import static com.paneedah.mwc.ProjectConstants.LOGGER;

public class GLCompatible {

    /**
     * Enum representing different OpenGL implementation types.
     * Each type indicates whether instancing is supported via {@link #supportsInstancing}.
     */
    public enum GLImplementation {
        UNKNOWN_OR_UNSUPPORTED(false),
        NORMAL(true),
        ARB(true),
        EXT(true),
        APPLE(false),
        ATI(true);

        public final boolean supportsInstancing;

        GLImplementation(boolean supportsInstancing){
            this.supportsInstancing = supportsInstancing;
        }
    }

    /** Currently detected framebuffer object type */
    public static GLImplementation fboType = GLImplementation.UNKNOWN_OR_UNSUPPORTED;
    /** Currently detected vertex array object type */
    public static GLImplementation vaoType = GLImplementation.UNKNOWN_OR_UNSUPPORTED;
    /** Currently detected instancing type */
    public static GLImplementation instancingType = GLImplementation.UNKNOWN_OR_UNSUPPORTED;
    /** Currently detected vertex attribute type */
    public static GLImplementation attribDivisorType = GLImplementation.UNKNOWN_OR_UNSUPPORTED;
    /** Currently detected multisampling type */
    public static GLImplementation multisampleType = GLImplementation.UNKNOWN_OR_UNSUPPORTED;

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


    /**
     * Do we support using instances?
     *
     * @return true if {@link #instancingType} is true and shaders are enabled, false otherwise
     */
    public static boolean doesSupportInstancing() {
        return instancingType.supportsInstancing && ModernConfigManager.enableAllShaders;
    }

    /**
     * Do we support multisample?
     *
     * @return true if {@link #multisampleType} is anything other than {@link GLImplementation#UNKNOWN_OR_UNSUPPORTED}
     */
    public static boolean doesSupportMultisample() {
        return !(multisampleType == GLImplementation.UNKNOWN_OR_UNSUPPORTED);
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
        switch (vaoType) {
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
        switch (vaoType) {
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
    }



    /*
     * Vertex Attributes
     */

    public static void glVertexAttribDivisor(int arg0, int arg1) {
        switch (attribDivisorType) {

            case ARB:
                ARBInstancedArrays.glVertexAttribDivisorARB(arg0, arg1);
                break;
            case NORMAL:
                GL33.glVertexAttribDivisor(arg0, arg1);
                break;
        }
    }

    /*
     * Instancing
     */

    public static void glDrawElementsInstanced(int arg0, int arg1, int arg2, long arg3, int arg4) {
        switch (instancingType) {
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
    }


    public static void glDrawArraysInstanced(int mode, int first, int count, int priMCount) {
        switch (instancingType) {
            case NORMAL:
                GL31.glDrawArraysInstanced(mode, first, count, priMCount);
                break;
            case ARB:
                ARBDrawInstanced.glDrawArraysInstancedARB(mode, first, count, priMCount);
                break;
            case EXT:
                EXTDrawInstanced.glDrawArraysInstancedEXT(mode, first, count, priMCount);
                break;
        }
    }


    /**
     * Does OpenGL compatibility detection.
     * <p>
     * Detects available OpenGL versions and extensions, and sets the enum types
     * ({@link #vaoType}, {@link #fboType}, {@link #instancingType}, etc.) and constants.
     */
    public static void init() {

        ContextCapabilities cap = GLContext.getCapabilities();

        // Attribute divisor (instancing)
        if (cap.OpenGL33) {
            attribDivisorType = GLImplementation.NORMAL;
        } else if (cap.GL_ARB_instanced_arrays) {
            attribDivisorType = GLImplementation.ARB;
        } else {
            attribDivisorType = GLImplementation.UNKNOWN_OR_UNSUPPORTED;
        }

        // Instancing
        if (cap.OpenGL31) {
            instancingType = GLImplementation.NORMAL;
        } else if (cap.GL_ARB_draw_instanced) {
            instancingType = GLImplementation.ARB;
        } else if (cap.GL_EXT_draw_instanced) {
            instancingType = GLImplementation.EXT;
        } else {
            instancingType = GLImplementation.UNKNOWN_OR_UNSUPPORTED;
        }

        // Disable instancing on Mac
        if (SystemUtils.IS_OS_MAC) {
            instancingType = GLImplementation.APPLE;
        }

        // Vertex Array Objects
        if (cap.OpenGL30) {
            vaoType = GLImplementation.NORMAL;
            GL_VERTEX_ARRAY_BINDING = GL30.GL_VERTEX_ARRAY_BINDING;
        } else if (cap.GL_ARB_vertex_array_object) {
            vaoType = GLImplementation.ARB;
            GL_VERTEX_ARRAY_BINDING = ARBVertexArrayObject.GL_VERTEX_ARRAY_BINDING;
        } else if (cap.GL_APPLE_vertex_array_object) {
            vaoType = GLImplementation.APPLE;
            GL_VERTEX_ARRAY_BINDING = APPLEVertexArrayObject.GL_VERTEX_ARRAY_BINDING_APPLE;
        } else {
            vaoType = GLImplementation.UNKNOWN_OR_UNSUPPORTED;
        }

        // Framebuffer Objects
        if (cap.OpenGL30) {
            fboType = GLImplementation.NORMAL;
            GL_READ_FRAMEBUFFER = GL30.GL_READ_FRAMEBUFFER;
            GL_DRAW_FRAMEBUFFER = GL30.GL_DRAW_FRAMEBUFFER;
            GL_FRAMEBUFFER = GL30.GL_FRAMEBUFFER;
            GL_RENDERBUFFER = GL30.GL_RENDERBUFFER;
            GL_DEPTH_ATTACHMENT = GL30.GL_DEPTH_ATTACHMENT;
            GL_COLOR_ATTACHMENT0 = GL30.GL_COLOR_ATTACHMENT0;
        } else if (cap.GL_ARB_framebuffer_object) {
            fboType = GLImplementation.ARB;
            GL_READ_FRAMEBUFFER = ARBFramebufferObject.GL_READ_FRAMEBUFFER;
            GL_DRAW_FRAMEBUFFER = ARBFramebufferObject.GL_DRAW_FRAMEBUFFER;
            GL_FRAMEBUFFER = ARBFramebufferObject.GL_FRAMEBUFFER;
            GL_RENDERBUFFER = ARBFramebufferObject.GL_RENDERBUFFER;
            GL_COLOR_ATTACHMENT0 = ARBFramebufferObject.GL_COLOR_ATTACHMENT0;
            GL_DEPTH_ATTACHMENT = ARBFramebufferObject.GL_DEPTH_ATTACHMENT;
        } else if (cap.GL_EXT_framebuffer_object && cap.GL_EXT_framebuffer_blit) {
            fboType = GLImplementation.EXT;
            GL_READ_FRAMEBUFFER = EXTFramebufferBlit.GL_READ_FRAMEBUFFER_EXT;
            GL_DRAW_FRAMEBUFFER = EXTFramebufferBlit.GL_DRAW_FRAMEBUFFER_EXT;
            GL_FRAMEBUFFER = EXTFramebufferObject.GL_FRAMEBUFFER_EXT;
            GL_COLOR_ATTACHMENT0 = EXTFramebufferObject.GL_COLOR_ATTACHMENT0_EXT;
            GL_DEPTH_ATTACHMENT = EXTFramebufferObject.GL_DEPTH_ATTACHMENT_EXT;
            GL_RENDERBUFFER = EXTFramebufferObject.GL_RENDERBUFFER_EXT;
        } else {
            fboType = GLImplementation.UNKNOWN_OR_UNSUPPORTED;
            LOGGER.debug("Framebuffer objects not supported");
        }

        // Floating-point textures
        if (cap.OpenGL30) {
            GL_RGBA16F = GL30.GL_RGBA16F;
        } else if (cap.GL_APPLE_float_pixels) {
            GL_RGBA16F = APPLEFloatPixels.GL_RGBA_FLOAT16_APPLE;
        } else if (cap.GL_ARB_texture_float) {
            GL_RGBA16F = ARBTextureFloat.GL_RGB16F_ARB;
        } else if (cap.GL_ATI_texture_float) {
            GL_RGBA16F = ATITextureFloat.GL_RGBA_FLOAT16_ATI;
        } else {
            LOGGER.debug("Floating point texture component not supported");
        }

        // Depth component
        if (cap.OpenGL14) {
            GL_DEPTH_COMPONENT24 = GL14.GL_DEPTH_COMPONENT24;
        } else if (cap.GL_ARB_depth_texture) {
            GL_DEPTH_COMPONENT24 = ARBDepthTexture.GL_DEPTH_COMPONENT24_ARB;
        } else {
            GL_DEPTH_COMPONENT24 = 0; // fallback
        }

        // Multisampling
        if (cap.OpenGL32) {
            multisampleType = GLImplementation.NORMAL;
            GL_TEXTURE_2D_MULTISAMPLE = GL32.GL_TEXTURE_2D_MULTISAMPLE;
        } else if (cap.GL_ARB_texture_multisample) {
            multisampleType = GLImplementation.ARB;
            GL_TEXTURE_2D_MULTISAMPLE = ARBTextureMultisample.GL_TEXTURE_2D_MULTISAMPLE;
        } else {
            multisampleType = GLImplementation.UNKNOWN_OR_UNSUPPORTED;
        }

        LOGGER.debug("GL Compatibility set");
    }

    public static void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height,
                                               boolean fixedsamplelocations) {
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
