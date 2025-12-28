package com.paneedah.weaponlib.shader.dynamic;

import com.paneedah.weaponlib.compatibility.CompatibleWorldRenderer;
import net.minecraft.client.renderer.*;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import org.lwjgl.opengl.GL11;

public interface DynamicShaderPhase {

    void apply(DynamicShaderContext context, DynamicShaderGroup shaderGroup);

    void remove(DynamicShaderContext context, DynamicShaderGroup shaderGroup);

    DynamicShaderPhase POST_WORLD_RENDER = new DynamicShaderPhase.EntityRendererTarget();

    DynamicShaderPhase POST_WORLD_OPTICAL_SCOPE_RENDER = new DynamicShaderPhase.CompatibleWorldRendererTarget();

    DynamicShaderPhase PRE_ITEM_RENDER = new DynamicShaderPhase() {

        @Override
        public void apply(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {

            if (OpenGlHelper.shadersSupported) {
                int originalMatrixMode = GlStateManager.glGetInteger(GL11.GL_MATRIX_MODE);

                GlStateManager.matrixMode(5890);
                GlStateManager.pushMatrix();
                GlStateManager.loadIdentity();

                GlStateManager.pushAttrib(); // TODO: This fucks up the GlStateManager - Luna Mira Lage (Desoroxxx) 2025-12-28 // Before the transition to GlStateManager it used `GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT`, but GlStateManager don't allow mask so maybe we just don't at all? - Luna Mira Lage (Desoroxxx) - 2025-12-28
                shaderGroup.render(context.getPartialTicks());
                GlStateManager.popAttrib(); // TODO: This fucks up the GlStateManager - Luna Mira Lage (Desoroxxx) 2025-12-28
                GlStateManager.popMatrix();
                GlStateManager.matrixMode(originalMatrixMode);

            }
        }

        @Override
        public void remove(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {
            shaderGroup.deleteShaderGroup();
        }

    };

    class EntityRendererTarget implements DynamicShaderPhase {

//        private Supplier<EntityRenderer> entityRendererSupplier;
//
//        public EntityRendererTarget(Supplier<EntityRenderer> entityRendererSupplier) {
//            this.entityRendererSupplier = entityRendererSupplier;
//        }

        @Override
        public void apply(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {
            Object target = context.getTarget();

            if (target instanceof EntityRenderer) {
                EntityRenderer entityRenderer = (EntityRenderer) target;
                ShaderGroup currentShaderGroup = entityRenderer.getShaderGroup();
                if (currentShaderGroup != shaderGroup) {
                    remove(context, null);
                    ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, entityRenderer, shaderGroup, "shaderGroup", "field_147707_d");
                    setUseShader(entityRenderer, true);
                }
            }
        }

        @Override
        public void remove(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {
            Object target = context.getTarget();
            if (target instanceof EntityRenderer) {
                EntityRenderer entityRenderer = (EntityRenderer) target;
                ShaderGroup currentShaderGroup = entityRenderer.getShaderGroup();
                if (currentShaderGroup instanceof DynamicShaderGroup) {
                    currentShaderGroup.deleteShaderGroup();
                    ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, entityRenderer, null, "shaderGroup", "field_147707_d");
                }
            }

        }

        private static void setUseShader(EntityRenderer entityRenderer, boolean value) {
            ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, entityRenderer, value, "useShader", "field_175083_ad");

        }

    }

    class CompatibleWorldRendererTarget implements DynamicShaderPhase {

        //private Supplier<CompatibleWorldRenderer> entityRendererSupplier;

//        public CompatibleWorldRendererTarget(Supplier<CompatibleWorldRenderer> entityRendererSupplier) {
//            this.entityRendererSupplier = entityRendererSupplier;
//        }

        @Override
        public void apply(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {


            Object target = context.getTarget();
            if (target instanceof CompatibleWorldRenderer) {
                CompatibleWorldRenderer entityRenderer = (CompatibleWorldRenderer) target;
                ShaderGroup currentShaderGroup = entityRenderer.getShaderGroup();
                if (currentShaderGroup != shaderGroup) {
                    //remove(context, null);

                    entityRenderer.setShaderGroup(shaderGroup);
                    entityRenderer.useShader(true);
                }
            }
        }

        @Override
        public void remove(DynamicShaderContext context, DynamicShaderGroup shaderGroup) {
            Object target = context.getTarget();
            if (target instanceof CompatibleWorldRenderer) {
                CompatibleWorldRenderer entityRenderer = (CompatibleWorldRenderer) target;
                ShaderGroup currentShaderGroup = entityRenderer.getShaderGroup();
                if (currentShaderGroup instanceof DynamicShaderGroup) {
                    currentShaderGroup.deleteShaderGroup();
                    entityRenderer.setShaderGroup(null);
                }
            }

        }
    }

}
