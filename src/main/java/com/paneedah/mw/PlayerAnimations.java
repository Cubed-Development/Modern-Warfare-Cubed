package com.paneedah.mw;

import com.paneedah.weaponlib.Part;
import com.paneedah.weaponlib.PlayerTransitionProvider;
import com.paneedah.weaponlib.RenderContext;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.animation.MultipartTransition;
import com.paneedah.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.paneedah.weaponlib.configold.ConfigurationManager;
import org.lwjgl.opengl.GL11;

public class PlayerAnimations {

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlInitializationEvent event) {
        PlayerTransitionProvider playerTransitionProvider = new PlayerTransitionProvider.Builder()
                .withProningTransition(new MultipartTransition<Part, RenderContext<RenderableState>>(
                        Part.MAIN, renderContext -> {
                            GL11.glTranslatef(0f, 1.36f, -0.5f);
                            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0F);
                            GL11.glRotatef(-5.0F, 0.0F, 1.0F, 0F);

                        }, 200, 0)
                        .withPartPositionFunction(Part.HEAD, rc -> {
                            GL11.glTranslatef(0f, 0f, -0.08f);
                            //GL11.glRotatef(-10.0F, 0.0F, 1.0F, 1.0F);
                            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
                            GL11.glScalef(1f, 1f, 1f);
                        })
                        .withPartPositionFunction(Part.LEFT_HAND, rc -> {
                            GL11.glTranslatef(-0.1f, 0.1f, 0f);
                            GL11.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
                            GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
                            GL11.glScalef(1f, 1f, 1f);
                        })
                        .withPartPositionFunction(Part.RIGHT_HAND, rc -> {
                            GL11.glTranslatef(0.08f, 0.1f, 0f);
                            GL11.glRotatef(-160.0F, 1.0F, 0.0F, 0.0F);
                            GL11.glRotatef(5.0F, 0.0F, 0.0F, 1.0F);
                            GL11.glScalef(1f, 1f, 1f);
                        })
                        .withPartPositionFunction(Part.LEFT_LEG, rc -> {
                            GL11.glTranslatef(0.04f, 0f, 0f);
                            GL11.glRotatef(5.0F, 0.0F, 1.0F, 1.0F);
                            GL11.glScalef(1f, 1f, 1f);
                        })
                        .withPartPositionFunction(Part.RIGHT_LEG, rc -> {
                            GL11.glTranslatef(0.05f, 0.4f, -0.02f);
                            GL11.glRotatef(25.0F, 0.0F, 1.0F, 1.0F);
                            GL11.glScalef(1f, 0.5f, 1f);
                        }))

                .withProningTransition(new MultipartTransition<Part, RenderContext<RenderableState>>(
                        Part.MAIN, renderContext -> {
                            GL11.glTranslatef(0f, 1.36f, -0.5f);
                            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0F);
                            GL11.glRotatef(5.0F, 0.0F, 1.0F, 0F);
                        }, 200, 0)
                        .withPartPositionFunction(Part.HEAD, rc -> {
                            GL11.glTranslatef(0f, 0f, -0.08f);
                            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
                            GL11.glScalef(1f, 1f, 1f);
                        })
                        .withPartPositionFunction(Part.LEFT_HAND, rc -> {
                            GL11.glTranslatef(-0.1f, 0.1f, 0f);
                            GL11.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
                            GL11.glRotatef(-5.0F, 0.0F, 0.0F, 1.0F);
                            GL11.glScalef(1f, 0.5f, 1f);
                        })
                        .withPartPositionFunction(Part.RIGHT_HAND, rc -> {
                            GL11.glTranslatef(0.08f, 0.1f, 0f);
                            GL11.glRotatef(-160.0F, 1.0F, 0.0F, 0.0F);
                            GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
                            GL11.glScalef(1f, 1f, 1f);
                        })
                        .withPartPositionFunction(Part.LEFT_LEG, rc -> {
                            GL11.glTranslatef(-0.04f, 0.4f, -0.02f);
                            GL11.glRotatef(-25.0F, 0.0F, 1.0F, 1.0F);
                            GL11.glScalef(1f, 0.5f, 1f);
                        })
                        .withPartPositionFunction(Part.RIGHT_LEG, rc -> {
                            GL11.glTranslatef(-0.02f, 0f, -0.02f);
                            GL11.glRotatef(-2.0F, 0.0F, 1.0F, 1.0F);
                            GL11.glScalef(1f, 1f, 1f);
                        }))
                
                .withProningAimingTransition(new MultipartTransition<Part, RenderContext<RenderableState>>(
                        Part.MAIN, renderContext -> {
                            GL11.glTranslatef(0f, 1.36f, -0.5f);
                            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0F);
                            GL11.glRotatef(-5.0F, 0.0F, 1.0F, 0F);

                        }, 200, 0)
                        .withPartPositionFunction(Part.HEAD, rc -> {
                            GL11.glTranslatef(0f, 0f, -0.08f);
                            //GL11.glRotatef(-10.0F, 0.0F, 1.0F, 1.0F);
                            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
                            GL11.glScalef(1f, 1f, 1f);
                        })
                        .withPartPositionFunction(Part.LEFT_HAND, rc -> {
                            GL11.glTranslatef(-0.1f, 0.12f, -0.02f);
                            GL11.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
                            GL11.glRotatef(25.0F, 0.0F, 0.0F, 1.0F);
                            GL11.glScalef(1f, 1.1f, 1f);
                        })
                        .withPartPositionFunction(Part.RIGHT_HAND, rc -> {
                            GL11.glTranslatef(0.08f, 0.3f, 0.03f);
                            GL11.glRotatef(-160.0F, 1.0F, 0.0F, 0.0F);
                            GL11.glRotatef(-5.0F, 0.0F, 0.0F, 1.0F);
                            //GL11.glRotatef(-30.0F, 0.0F, 1.0F, 0.0F);
                            GL11.glScalef(1f, 1f, 1f);
                        })
                        .withPartPositionFunction(Part.LEFT_LEG, rc -> {
                            GL11.glTranslatef(-0.15f, 0f, -0.1f);
                            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 1.0F);
                            GL11.glScalef(1f, 1f, 1f);
                        })
                        .withPartPositionFunction(Part.RIGHT_LEG, rc -> {
                            GL11.glTranslatef(-0.02f, 0f, -0.02f);
                            GL11.glRotatef(-2.0F, 0.0F, 1.0F, 1.0F);
                            GL11.glScalef(1f, 1f, 1f);
                        }))

                .build();
        
        ModernWarfareMod.MOD_CONTEXT.setPlayerTransitionProvider(playerTransitionProvider);
    }

}
