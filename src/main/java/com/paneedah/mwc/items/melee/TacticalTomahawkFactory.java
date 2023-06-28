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

public class TacticalTomahawkFactory implements MeleeFactory {

    @Override
    public Item createMelee(CommonProxy commonProxy) {
        return new ItemMelee.Builder()
        
                .withName("tactical_tomahawk")
                .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
                .withTextureNames("tacticaltomahawk")
                .withAttackDamage(5f)
                .withHeavyAttackDamage(10f)
                .withPrepareStubTimeout(() -> 00)
                .withPrepareHeavyStubTimeout(() -> 390)
                .withAttackCooldownTimeout(() -> 0)
                .withHeavyAttackCooldownTimeout(() -> 0)
                .withAttackSound("swoosh")
                .withHeavyAttackSound("swoosh")
                .withRenderer(
                        new MeleeRenderer.Builder()
                        
                                .withModel(new com.paneedah.mwc.models.TacticalTomahawk())
                                .withAnimationDuration(400)
                                .withInventoryPositioning(itemStack -> {
                                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                                    GL11.glTranslatef(1, 2f, -1.8f);
                                    GL11.glRotatef(80F, 0f, 1f, 0f);
                                    GL11.glRotatef(-30F, 1f, 0f, 0f);
                                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                                })
                                .withThirdPersonPositioning((renderContext) -> {
                                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                                        GL11.glTranslatef(-1.7F, -1F, 1.8F);
                                        GL11.glRotatef(10F, 1f, 1f, 0f);
                                        GL11.glRotatef(-145F, 0f, 1f, 0f);
                                        GL11.glRotatef(-70F, 0f, 0f, 1f);
                                })
                                .withFirstPersonPositioning(context -> {
                                    GL11.glScalef(0.7f, 0.7f, 0.7f);
                                    GL11.glRotatef(50.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-2.000000f, 0.400000f, 1.410000f);
                                    
//                                    GL11.glScalef(0.7f, 0.7f, 0.7f);
//                                    GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
//                                    GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
//                                    GL11.glRotatef(5.000000f, 0f, 0f, 1f);
//                                    GL11.glTranslatef(-1.400000f, -3.099999f, -0.075000f);
                                    })

                                .withFirstPersonHandPositioning(

                                        context -> { // left hand
                                        	GL11.glScalef(5f, 5f, 5f);
                                        	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                                        	GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                                        	GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                                        	GL11.glTranslatef(0.225000f, -0.450000f, 0.025000f);
                                        	
//                                        	GL11.glScalef(5f, 5f, 5f);
//                                        	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
//                                        	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
//                                        	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
//                                        	GL11.glTranslatef(0.250000f, -0.475000f, 0.150000f);
                                        },

                                        context -> { // right hand
                                        	GL11.glScalef(5f, 5f, 5f);
                                        	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                                        	GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                        	GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                                        	GL11.glTranslatef(0.170000f, -0.430000f, 0.200000f);
                                        	
//                                        	GL11.glScalef(5f, 5f, 5f);
                                        })

                                .withFirstPersonPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                        	GL11.glScalef(0.7f, 0.7f, 0.7f);
                                            GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(-1.400000f, -3.199999f, -0.075000f);
                                        }, 320, 0),
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                        	GL11.glScalef(0.7f, 0.7f, 0.7f);
                                        	GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                                        	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                                        	GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                                        	GL11.glTranslatef(-1.400000f, -1.500000f, 1.125000f);
                                        }, 70, 0),
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                        	GL11.glScalef(0.7f, 0.7f, 0.7f);
                                        	GL11.glRotatef(25.000000f, 1f, 0f, 0f);
                                        	GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                                        	GL11.glRotatef(-60.000000f, 0f, 0f, 1f);
                                        	GL11.glTranslatef(-2.000000f, -2.100000f, 1.225000f);
                                        }, 40, 0))

                                .withFirstPersonLeftHandPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                        	GL11.glScalef(5f, 5f, 5f);
                                        	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                                        	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                                        	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                                        	GL11.glTranslatef(0.250000f, -0.475000f, 0.150000f);
                                            }, 70, 0),
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                        	GL11.glScalef(5f, 5f, 5f);
                                        	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                                        	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                                        	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                                        	GL11.glTranslatef(0.250000f, -0.475000f, 0.150000f);
                                            }, 70, 0),
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                        	GL11.glScalef(5f, 5f, 5f);
                                        	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                                        	GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                                        	GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                                        	GL11.glTranslatef(0.250000f, -0.475000f, 0.150000f);
                                            }, 70, 0)
                                        )

                                .withFirstPersonRightHandPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                        	GL11.glScalef(5f, 5f, 5f);
                                        	GL11.glRotatef(-150.000000f, 1f, 0f, 0f);
                                        	GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                                        	GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                                        	GL11.glTranslatef(0.300000f, -0.400000f, -0.225000f);
                                            }, 70, 0),
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                        	GL11.glScalef(5f, 5f, 5f);
                                        	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                                        	GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                                        	GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                                        	GL11.glTranslatef(0.300000f, -0.400000f, 0.100000f);
                                            }, 70, 0),
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                        	GL11.glScalef(5f, 5f, 5f);
                                        	GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                                        	GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                                        	GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                                        	GL11.glTranslatef(0.275000f, -0.275000f, 0.125000f);
                                            }, 70, 0)
                                        )

                                .withFirstPersonPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(1f, 1f, 1f);
                                            GL11.glRotatef(20F, 1f, 0f, 0f);
                                            GL11.glRotatef(10F, 0f, 1f, 0f);
                                            GL11.glRotatef(-110F, 0f, 0f, 1f);
                                            GL11.glTranslatef(1.699999f, 0.250000f, -1.624999f);
                                        }, 120, 0),
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(1f, 1f, 1f);
                                            GL11.glRotatef(20F, 1f, 0f, 0f);
                                            GL11.glRotatef(30F, 0f, 1f, 0f);
                                            GL11.glRotatef(-110F, 0f, 0f, 1f);
                                            GL11.glTranslatef(1.699999f, 0.250000f, -2f);
                                        }, 50, 0))

                                .withFirstPersonLeftHandPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                                            GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.175000f, -0.525000f, 0.175000f);
                                            }, 70, 0),
                                            new Transition<RenderContext<RenderableState>>(renderContext -> {
                                                GL11.glScalef(4.5f, 4.5f, 4.5f);
                                                GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                                                GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                                                GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                                                GL11.glTranslatef(0.175000f, -0.525000f, 0.175000f);
                                                }, 70, 0))

                                .withFirstPersonRightHandPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(4.5f, 4.5f, 4.5f);
                                            GL11.glRotatef(-140.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.250000f, -0.150000f, 0.325000f);
                                            }, 70, 0),
                                            new Transition<RenderContext<RenderableState>>(renderContext -> {
                                                GL11.glScalef(4.5f, 4.5f, 4.5f);
                                                GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                                                GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                                                GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                                                GL11.glTranslatef(0.1f, -0.1f, 0.2f);
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
