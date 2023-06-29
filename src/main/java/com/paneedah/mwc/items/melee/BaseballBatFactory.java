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

public class BaseballBatFactory implements MeleeFactory {

    @Override
    public Item createMelee(CommonProxy commonProxy) {
        return new ItemMelee.Builder()
        
                .withName("baseball_bat")
                .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
                .withTextureNames("bat")
                .withAttackDamage(3f)
                .withHeavyAttackDamage(7f)
                .withPrepareStubTimeout(() -> 00)
                .withPrepareHeavyStubTimeout(() -> 00)
                .withAttackCooldownTimeout(() -> 0)
                .withHeavyAttackCooldownTimeout(() -> 0)
                .withAttackSound("swoosh")
                .withHeavyAttackSound("swoosh")
                .withRenderer(
                        new MeleeRenderer.Builder()
                        
                                .withModel(new com.paneedah.mwc.models.Bat())
                                .withAnimationDuration(300)
                                .withInventoryPositioning(itemStack -> {
                                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                                    GL11.glTranslatef(1, 1.3f, -1.3f);
                                    GL11.glRotatef(230F, 0f, 1f, 0f);
                                    GL11.glRotatef(45F, 1f, 0f, 0f);
                                })
                                .withThirdPersonPositioning((renderContext) -> {
                                        GL11.glScaled(0.8F, 0.8F, 0.8F);
                                        GL11.glTranslatef(-0.6F, -0.8F, 0.4F);
                                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                                        GL11.glRotatef(70F, 1f, 0f, 0f);
                                })
                                .withFirstPersonPositioning(context -> {
                                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                                    GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-1.249999f, 0.375000f, -1.000000f);
                                    
//                                    GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
//                                    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
//                                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
//                                    GL11.glRotatef(80.000000f, 0f, 0f, 1f);
//                                    GL11.glTranslatef(-0.700000f, -0.175000f, -1.800000f);
                                    })

                                .withFirstPersonHandPositioning(

                                        context -> { // left hand
                                            GL11.glScalef(5f, 5f, 5f);
                                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.350000f, -0.075000f, 0.025000f);
                                            
//                                            GL11.glScalef(5f, 5f, 5f);
//                                            GL11.glRotatef(-135.000000f, 1f, 0f, 0f);
//                                            GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
//                                            GL11.glRotatef(45.000000f, 0f, 0f, 1f);
//                                            GL11.glTranslatef(0.175000f, -0.600000f, 0.475000f);
                                        },

                                        context -> { // right hand
                                            GL11.glScalef(5f, 5f, 5f);
                                            GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-130.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(-0.075000f, -0.300000f, -0.275000f);
                                        })

                                .withFirstPersonPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                                            GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(-1.249999f, 0f, -2f);
                                        }, 60, 0))

                                .withFirstPersonLeftHandPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(5f, 5f, 5f);
                                            GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(85.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.450000f, -0.4f, -0.050000f);
                                            }, 50, 0)
                                        )

                                .withFirstPersonRightHandPositioningHeavyAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(5f, 5f, 5f);
                                            GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(60.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(-110.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(-0.25f, -0.25f, -0.5f);
                                            }, 70, 0)
                                        )

                                .withFirstPersonPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(2.000000f, 2.000000f, 2.000000f);
                                            GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(-0.700000f, -0.175000f, -1.800000f);
                                        }, 60, 0))

                                .withFirstPersonLeftHandPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(5f, 5f, 5f);
                                            GL11.glRotatef(-135.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.175000f, -0.600000f, 0.475000f);
                                            }, 70, 0))

                                .withFirstPersonRightHandPositioningAttacking(
                                        new Transition<RenderContext<RenderableState>>(renderContext -> {
                                            GL11.glScalef(5f, 5f, 5f);
                                            GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                                            GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                            GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                                            GL11.glTranslatef(0.100000f, 0.025000f, 0.325000f);
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
