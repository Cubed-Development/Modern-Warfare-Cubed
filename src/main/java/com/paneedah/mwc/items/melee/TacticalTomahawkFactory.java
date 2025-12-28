package com.paneedah.mwc.items.melee;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.melee.ItemMelee;
import com.paneedah.weaponlib.melee.MeleeRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;

public class TacticalTomahawkFactory implements MeleeFactory {

    @Override
    public Item createMelee(CommonProxy commonProxy) {
        return new ItemMelee.Builder()

                .withName("tactical_tomahawk")
                .withCreativeTab(MWC.WEAPONS_TAB)
                .withTextureNames("tacticaltomahawk")
                .withAttackDamage(5f)
                .withHeavyAttackDamage(10f)
                .withPrepareStubTimeout(() -> 0)
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
                                    GlStateManager.scale(0.4F, 0.4F, 0.4F);
                                    GlStateManager.translate(1, 2f, -1.8f);
                                    GlStateManager.rotate(80F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-30F, 1f, 0f, 0f);
                                    GlStateManager.rotate(-30F, 0f, 0f, 1f);
                                })
                                .withThirdPersonPositioning((renderContext) -> {
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(-1.7F, -1F, 1.8F);
                                    GlStateManager.rotate(10F, 1f, 1f, 0f);
                                    GlStateManager.rotate(-145F, 0f, 1f, 0f);
                                    GlStateManager.rotate(-70F, 0f, 0f, 1f);
                                })
                                .withFirstPersonPositioning(context -> {
                                    GlStateManager.scale(0.7f, 0.7f, 0.7f);
                                    GlStateManager.rotate(50.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-55.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-2.000000f, 0.400000f, 1.410000f);

//                                    GlStateManager.scale(0.7f, 0.7f, 0.7f);
//                                    GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
//                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
//                                    GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
//                                    GlStateManager.translate(-1.400000f, -3.099999f, -0.075000f);
                                })

                                .withFirstPersonHandPositioning(

                                        context -> { // left hand
                                            GlStateManager.scale(5f, 5f, 5f);
                                            GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(-15.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(65.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.225000f, -0.450000f, 0.025000f);

//                                        	GlStateManager.scale(5f, 5f, 5f);
//                                        	GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
//                                        	GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
//                                        	GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
//                                        	GlStateManager.translate(0.250000f, -0.475000f, 0.150000f);
                                        },

                                        context -> { // right hand
                                            GlStateManager.scale(5f, 5f, 5f);
                                            GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.170000f, -0.430000f, 0.200000f);

//                                        	GlStateManager.scale(5f, 5f, 5f);
                                        })

                                .withFirstPersonPositioningHeavyAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(0.7f, 0.7f, 0.7f);
                                            GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(5.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(-1.400000f, -3.199999f, -0.075000f);
                                        }, 320, 0),
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(0.7f, 0.7f, 0.7f);
                                            GlStateManager.rotate(-15.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(-55.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(-1.400000f, -1.500000f, 1.125000f);
                                        }, 70, 0),
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(0.7f, 0.7f, 0.7f);
                                            GlStateManager.rotate(25.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(-60.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(-2.000000f, -2.100000f, 1.225000f);
                                        }, 40, 0))

                                .withFirstPersonLeftHandPositioningHeavyAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(5f, 5f, 5f);
                                            GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.250000f, -0.475000f, 0.150000f);
                                        }, 70, 0),
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(5f, 5f, 5f);
                                            GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.250000f, -0.475000f, 0.150000f);
                                        }, 70, 0),
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(5f, 5f, 5f);
                                            GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.250000f, -0.475000f, 0.150000f);
                                        }, 70, 0)
                                )

                                .withFirstPersonRightHandPositioningHeavyAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(5f, 5f, 5f);
                                            GlStateManager.rotate(-150.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(-10.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.300000f, -0.400000f, -0.225000f);
                                        }, 70, 0),
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(5f, 5f, 5f);
                                            GlStateManager.rotate(-65.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.300000f, -0.400000f, 0.100000f);
                                        }, 70, 0),
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(5f, 5f, 5f);
                                            GlStateManager.rotate(-45.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.275000f, -0.275000f, 0.125000f);
                                        }, 70, 0)
                                )

                                .withFirstPersonPositioningAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(1f, 1f, 1f);
                                            GlStateManager.rotate(20F, 1f, 0f, 0f);
                                            GlStateManager.rotate(10F, 0f, 1f, 0f);
                                            GlStateManager.rotate(-110F, 0f, 0f, 1f);
                                            GlStateManager.translate(1.699999f, 0.250000f, -1.624999f);
                                        }, 120, 0),
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(1f, 1f, 1f);
                                            GlStateManager.rotate(20F, 1f, 0f, 0f);
                                            GlStateManager.rotate(30F, 0f, 1f, 0f);
                                            GlStateManager.rotate(-110F, 0f, 0f, 1f);
                                            GlStateManager.translate(1.699999f, 0.250000f, -2f);
                                        }, 50, 0))

                                .withFirstPersonLeftHandPositioningAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                            GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.175000f, -0.525000f, 0.175000f);
                                        }, 70, 0),
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                            GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.175000f, -0.525000f, 0.175000f);
                                        }, 70, 0))

                                .withFirstPersonRightHandPositioningAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                            GlStateManager.rotate(-140.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.250000f, -0.150000f, 0.325000f);
                                        }, 70, 0),
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                            GlStateManager.rotate(-130.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.1f, -0.1f, 0.2f);
                                        }, 70, 0))

                                .withFirstPersonPositioningModifying(renderContext -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(5.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-90.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-40.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.725000f, -1.299999f, 0.800000f);
                                })

                                .withFirstPersonHandPositioningModifying(

                                        context -> { // left hand
                                            GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                            GlStateManager.rotate(-70.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(75.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.050000f, -0.425000f, 0.100000f);
                                        },

                                        context -> { // right hand
                                            GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                            GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(20.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.300000f, -0.400000f, 0.250000f);
                                        })

                                .build())

                .build(MWC.modContext);
    }
}
