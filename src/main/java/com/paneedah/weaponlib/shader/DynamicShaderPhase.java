package com.paneedah.weaponlib.shader;

import com.paneedah.weaponlib.compatibility.CompatibleWorldRenderer;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import org.lwjgl.opengl.GL11;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public interface DynamicShaderPhase {

    public void apply(DynamicShaderContext context, DynamicShaderGroup shaderGroup);

    public void remove(DynamicShaderContext context, DynamicShaderGroup shaderGroup);

    public static final DynamicShaderPhase POST_WORLD_RENDER = new DynamicShaderPhase.EntityRendererTarget();

    public static final DynamicShaderPhase POST_WORLD_OPTICAL_SCOPE_RENDER = new DynamicShaderPhase.CompatibleWorldRendererTarget();

    public static final DynamicShaderPhase PRE_ITEM_RENDER = new DynamicShaderPhase() {

        @Override
        public void apply(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {
        	
            if (OpenGlHelper.shadersSupported) {
                int originalMatrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);

                GL11.glMatrixMode(5890);
                GL11.glPushMatrix();
                GL11.glLoadIdentity();

                GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);
                shaderGroup.render(context.getPartialTicks());
                GL11.glPopAttrib();
                GL11.glPopMatrix();
                GL11.glMatrixMode(originalMatrixMode);

            }
        }

        @Override
        public void remove(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {
            shaderGroup.deleteShaderGroup();
        }

    };

    public static class EntityRendererTarget implements DynamicShaderPhase {

//        private Supplier<EntityRenderer> entityRendererSupplier;
//
//        public EntityRendererTarget(Supplier<EntityRenderer> entityRendererSupplier) {
//            this.entityRendererSupplier = entityRendererSupplier;
//        }

        @Override
        public void apply(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {
            Object target = context.getTarget();
            
            if(target instanceof EntityRenderer) {
                EntityRenderer entityRenderer = (EntityRenderer) target;
                ShaderGroup currentShaderGroup = entityRenderer.getShaderGroup();
                if(currentShaderGroup != shaderGroup) {
                    remove(context, null);
                    ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, entityRenderer, shaderGroup, "shaderGroup", "field_147707_d");
                    setUseShader(entityRenderer, true);
                }
            }
        }

        @Override
        public void remove(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {
            Object target = context.getTarget();
            if(target instanceof EntityRenderer) {
                EntityRenderer entityRenderer = (EntityRenderer) target;
                ShaderGroup currentShaderGroup = entityRenderer.getShaderGroup();
                if(currentShaderGroup instanceof DynamicShaderGroup) {
                    currentShaderGroup.deleteShaderGroup();
                    ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, entityRenderer, null, "shaderGroup", "field_147707_d");
                }
            }

        }

        private static void setUseShader(EntityRenderer entityRenderer, boolean value) {
            ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, entityRenderer, value, "useShader", "field_175083_ad");
            
        }

    }

    public static class CompatibleWorldRendererTarget implements DynamicShaderPhase {

        //private Supplier<CompatibleWorldRenderer> entityRendererSupplier;

//        public CompatibleWorldRendererTarget(Supplier<CompatibleWorldRenderer> entityRendererSupplier) {
//            this.entityRendererSupplier = entityRendererSupplier;
//        }

        @Override
        public void apply(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {
           
        	
        	
        	Object target = context.getTarget();
            if(target instanceof CompatibleWorldRenderer) {
                CompatibleWorldRenderer entityRenderer = (CompatibleWorldRenderer) target;
                ShaderGroup currentShaderGroup = entityRenderer.getShaderGroup();
                if(currentShaderGroup != shaderGroup) {
                    //remove(context, null);
                	
                	entityRenderer.setShaderGroup(shaderGroup);
                    entityRenderer.useShader(true);
                }
            }
        }

        @Override
        public void remove(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {
            Object target = context.getTarget();
            if(target instanceof CompatibleWorldRenderer) {
                CompatibleWorldRenderer entityRenderer = (CompatibleWorldRenderer) target;
                ShaderGroup currentShaderGroup = entityRenderer.getShaderGroup();
                if(currentShaderGroup instanceof DynamicShaderGroup) {
                    currentShaderGroup.deleteShaderGroup();
                    entityRenderer.setShaderGroup(null);
                }
            }

        }
    }

}
