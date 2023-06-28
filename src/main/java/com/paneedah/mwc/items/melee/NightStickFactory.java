package com.paneedah.mwc.items.melee;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.weaponlib.RenderContext;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.melee.ItemMelee;
import com.paneedah.weaponlib.melee.MeleeRenderer;
import com.paneedah.weaponlib.melee.RenderableState;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class NightStickFactory implements MeleeFactory {

    @Override
    public Item createMelee(CommonProxy commonProxy) {
        return new ItemMelee.Builder()
        
                .withName("night_stick")
                .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
                .withTextureNames("gun")
                .withAttackDamage(1f)
                .withHeavyAttackDamage(3f)
                .withPrepareStubTimeout(() -> 00)
                .withPrepareHeavyStubTimeout(() -> 00)
                .withAttackCooldownTimeout(() -> 0)
                .withHeavyAttackCooldownTimeout(() -> 0)
                .withAttackSound("swoosh")
                .withHeavyAttackSound("swoosh")
                .withRenderer(
                        new MeleeRenderer.Builder()
                        
                                .withModel(new com.paneedah.mwc.models.PoliceBaton())
                                .withAnimationDuration(200)
                                .withInventoryPositioning(itemStack -> {
                                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                                    GL11.glTranslatef(1, 1.8f, -1.9f);
                                    GL11.glRotatef(230F, 0f, 1f, 0f);
                                    GL11.glRotatef(45F, 1f, 0f, 0f);
                                })
                                .withThirdPersonPositioning((renderContext) -> {
                                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                                        GL11.glTranslatef(-2F, -0.6F, 0.7F);
                                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                                        GL11.glRotatef(00F, 1f, 0f, 0f);
                                })
                                .withFirstPersonPositioning(context -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-1f, 2.5f, -0.5f);
                                    
//                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
//                                    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
//                                    GL11.glRotatef(40.000000f, 0f, 1f, 0f);
//                                    GL11.glRotatef(-90.000000f, 0f, 0f, 1f);
//                                    GL11.glTranslatef(-0.700000f, 1.700000f, -2.000000f);
                                    })

                                .withFirstPersonHandPositioning(

                                        context -> { // left hand
                                            GL11.glScalef(0f, 0f, 0f);
                                            GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.350000f, -0.475000f, 0.400000f);
                                        },

                                        context -> { // right hand
                                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.355000f, -0.020000f, 0.195000f);
                                            
//                                            GL11.glScalef(4.5f, 4.5f, 4.5f);
//                                            GL11.glRotatef(-235.000000f, 1f, 0f, 0f);
//                                            GL11.glRotatef(125.000000f, 0f, 1f, 0f);
//                                            GL11.glRotatef(70.000000f, 0f, 0f, 1f);
//                                            GL11.glTranslatef(0.125000f, -0.100000f, 0.025000f);
                                        })

                                .withFirstPersonPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                            GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(-1.3f, 2.7f, -1f);
                                        }, 60, 0))

                                .withFirstPersonLeftHandPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(0f, 0f, 0f);
                                            GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.350000f, -0.475000f, 0.45f);
                                            }, 50, 0)
                                        )

                                .withFirstPersonRightHandPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                                            GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.425000f, 0.050000f, 0.050000f);
                                            }, 70, 0)
                                        )

                                .withFirstPersonPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                            GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-90.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(-0.700000f, 1.700000f, -2.000000f);
                                        }, 120, 0),
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                            GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-90.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(-0.700000f, 1.700000f, -2.000000f);
                                        }, 50, 0))

                                .withFirstPersonLeftHandPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(0f, 0f, 0f);
                                            GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.175000f, -0.525000f, 0.175000f);
                                            }, 70, 0),
                                            new Transition<RenderContext<RenderableState>>(renderContext -> {
                                                GL11.glScalef(0f, 0f, 0f);
                                                GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                                                GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                                                GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                                                GL11.glTranslatef(0.175000f, -0.525000f, 0.175000f);
                                                }, 70, 0))

                                .withFirstPersonRightHandPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                                            GL11.glRotatef(-235.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(125.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.125000f, -0.100000f, 0.025000f);
                                            }, 70, 0),
                                            new Transition<RenderContext<RenderableState>>(renderContext -> {
                                                GL11.glScalef(4.5f, 4.5f, 4.5f);
                                                GL11.glRotatef(-235.000000f, 1f, 0f, 0f);
                                                GL11.glRotatef(125.000000f, 0f, 1f, 0f);
                                                GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                                                GL11.glTranslatef(0.125000f, -0.100000f, 0.025000f);
                                                }, 70, 0))

                                .withFirstPersonPositioningModifying(renderContext -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-90.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.725000f, -1.299999f, 0.800000f);
                                })

                                .withFirstPersonHandPositioningModifying(

                                        context -> { // left hand
                                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                                            GL11.glRotatef(-70.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.050000f, -0.425000f, 0.100000f);
                                                },

                                                context -> { // right hand
                                                    GL11.glScalef(4.5f, 4.5f, 4.5f);
                                                    GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                                                    GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                                                    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                                                    GL11.glTranslatef(0.300000f, -0.400000f, 0.250000f);
                                                })

                                .build())

                .build(MWC.modContext);
    }
}
