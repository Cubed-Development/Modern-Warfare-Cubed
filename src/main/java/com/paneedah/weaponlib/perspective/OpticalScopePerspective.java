package com.paneedah.weaponlib.perspective;

import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.shader.jim.Shader;
import com.paneedah.weaponlib.shader.jim.ShaderLoader;
import com.paneedah.weaponlib.shader.jim.Uniform;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

import java.nio.FloatBuffer;

public class OpticalScopePerspective extends FirstPersonPerspective<RenderableState> {

    private static final int DEFAULT_WIDTH = 200;
    private static final int DEFAULT_HEIGHT = 200;

    public OpticalScopePerspective() {
    	
        this.width = DEFAULT_WIDTH;
        this.height = DEFAULT_HEIGHT;
    }
    
    @Override
    public void activate(ClientModContext modContext, PerspectiveManager manager) {
        PlayerWeaponInstance instance = modContext.getMainHeldWeapon();
        if(instance != null) {
            ItemScope scope = instance.getScope();
            if(scope.isOptical()) {
                setSize(scope.getWidth(), scope.getHeight());
            }
        }
        super.activate(modContext, manager);
    }

    @Override
    public float getBrightness(RenderContext<RenderableState> renderContext) {
     // if(1+1==2) return 1f;
    	
    	float brightness = 0f;
        PlayerWeaponInstance instance = renderContext.getWeaponInstance();
        if(instance == null) {
            return 0f;
        }
        boolean aimed = instance != null && instance.isAimed();
        float progress = Math.min(1f, renderContext.getTransitionProgress());

        if(isAimingState(renderContext.getFromState()) && isAimingState(renderContext.getToState())) {
            brightness = 1f;
        } else if(progress > 0f && aimed && isAimingState(renderContext.getToState())) {
            brightness = progress;
        } else if(isAimingState(renderContext.getFromState()) && progress > 0f && !aimed) {
            brightness = Math.max(1 - progress, 0f);
        }
        return brightness;
    }

    private static boolean isAimingState(RenderableState renderableState) {
        return renderableState == RenderableState.ZOOMING
                || renderableState == RenderableState.ZOOMING_RECOILED
                || renderableState == RenderableState.ZOOMING_SHOOTING
                ;
    }

    @Override
    public void update(TickEvent.RenderTickEvent event) {
    	
         PlayerWeaponInstance instance = modContext.getMainHeldWeapon();
        if(instance != null) {
            ItemScope scope = instance.getScope();
            
            
            		
           
            if(scope.isOptical()) {
            	//setSize(1920, DEFAULT_HEIGHT);

               setSize(scope.getWidth(), scope.getHeight());
              
            }
            
            super.update(event);
        }
    }
    
    public static final FloatBuffer AUX_GL_BUFFER = GLAllocation.createDirectFloatBuffer(16);
    
    
    public static final Uniform PROJECTION_MATRIX = shader -> {
		GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, AUX_GL_BUFFER);
		AUX_GL_BUFFER.rewind();
		
		GL20.glUniformMatrix4(GL20.glGetUniformLocation(shader, "projection"), false, AUX_GL_BUFFER);
		
	};
	
	public static Shader scope = ShaderLoader.loadShader("vignette").withUniforms(PROJECTION_MATRIX);
   
    
    
    @Override
    protected void prepareRenderWorld(TickEvent.RenderTickEvent event) {
    	
    	boolean reload = false;
    	if(reload) {
    		//System.out.println("yo");
    		//System.out.println("yo");
    		scope = ShaderLoader.loadShader("vignette");
    	}
    	
    	//GlStateManager.enableAlpha();
    	//scope.use();
    	/*
        DynamicShaderContext shaderContext = new DynamicShaderContext(
                DynamicShaderPhase.POST_WORLD_OPTICAL_SCOPE_RENDER,
                this.entityRenderer,
                framebuffer,
                event.getRenderTickTime());
        PlayerWeaponInstance instance = modContext.getMainHeldWeapon();
        shaderGroupManager.applyShader(shaderContext, instance);
       // shaderGroupManager.
        
        */
        
    }

    @Override
    protected void postRenderWorld(TickEvent.RenderTickEvent event) {
    	//scope.release();
    	/*
        DynamicShaderContext shaderContext = new DynamicShaderContext(
                DynamicShaderPhase.POST_WORLD_OPTICAL_SCOPE_RENDER,
                this.entityRenderer,
                framebuffer,
                event.getRenderTickTime());
        shaderGroupManager.removeStaleShaders(shaderContext); // this is probably not the right place
        */
    }
}
