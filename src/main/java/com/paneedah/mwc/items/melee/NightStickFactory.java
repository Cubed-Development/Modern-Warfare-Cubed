package com.paneedah.mwc.items.melee;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.melee.ItemMelee;
import com.paneedah.weaponlib.melee.MeleeRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;

public class NightStickFactory implements MeleeFactory {

    @Override
    public Item createMelee(CommonProxy commonProxy) {
        return new ItemMelee.Builder()

                .withName("night_stick")
                .withCreativeTab(MWC.WEAPONS_TAB)
                .withTextureNames("gun")
                .withAttackDamage(1f)
                .withHeavyAttackDamage(3f)
                .withPrepareStubTimeout(() -> 0)
                .withPrepareHeavyStubTimeout(() -> 0)
                .withAttackCooldownTimeout(() -> 0)
                .withHeavyAttackCooldownTimeout(() -> 0)
                .withAttackSound("swoosh")
                .withHeavyAttackSound("swoosh")
                .withRenderer(
                        new MeleeRenderer.Builder()

                                .withModel(new com.paneedah.mwc.models.PoliceBaton())
                                .withAnimationDuration(200)
                                .withInventoryPositioning(itemStack -> {
                                    GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                    GlStateManager.translate(1, 1.8f, -1.9f);
                                    GlStateManager.rotate(230F, 0f, 1f, 0f);
                                    GlStateManager.rotate(45F, 1f, 0f, 0f);
                                })
                                .withThirdPersonPositioning((renderContext) -> {
                                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                                    GlStateManager.translate(-2F, -0.6F, 0.7F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(00F, 1f, 0f, 0f);
                                })
                                .withFirstPersonPositioning(context -> {
                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1f, 2.5f, -0.5f);

//                                    GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
//                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
//                                    GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
//                                    GlStateManager.rotate(-90.000000f, 0f, 0f, 1f);
//                                    GlStateManager.translate(-0.700000f, 1.700000f, -2.000000f);
                                })

                                .withFirstPersonHandPositioning(

                                        context -> { // left hand
                                            GlStateManager.scale(0f, 0f, 0f);
                                            GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.350000f, -0.475000f, 0.400000f);
                                        },

                                        context -> { // right hand
                                            GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                            GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.355000f, -0.020000f, 0.195000f);

//                                            GlStateManager.scale(4.5f, 4.5f, 4.5f);
//                                            GlStateManager.rotate(-235.000000f, 1f, 0f, 0f);
//                                            GlStateManager.rotate(125.000000f, 0f, 1f, 0f);
//                                            GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
//                                            GlStateManager.translate(0.125000f, -0.100000f, 0.025000f);
                                        })

                                .withFirstPersonPositioningHeavyAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                            GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(-1.3f, 2.7f, -1f);
                                        }, 60, 0))

                                .withFirstPersonLeftHandPositioningHeavyAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(0f, 0f, 0f);
                                            GlStateManager.rotate(-60.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.350000f, -0.475000f, 0.45f);
                                        }, 50, 0)
                                )

                                .withFirstPersonRightHandPositioningHeavyAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                            GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.425000f, 0.050000f, 0.050000f);
                                        }, 70, 0)
                                )

                                .withFirstPersonPositioningAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                            GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(-90.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(-0.700000f, 1.700000f, -2.000000f);
                                        }, 120, 0),
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(1.000000f, 1.000000f, 1.000000f);
                                            GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(-90.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(-0.700000f, 1.700000f, -2.000000f);
                                        }, 50, 0))

                                .withFirstPersonLeftHandPositioningAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(0f, 0f, 0f);
                                            GlStateManager.rotate(-125.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.175000f, -0.525000f, 0.175000f);
                                        }, 70, 0),
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(0f, 0f, 0f);
                                            GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(-50.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(50.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.175000f, -0.525000f, 0.175000f);
                                        }, 70, 0))

                                .withFirstPersonRightHandPositioningAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                            GlStateManager.rotate(-235.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(125.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.125000f, -0.100000f, 0.025000f);
                                        }, 70, 0),
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(4.5f, 4.5f, 4.5f);
                                            GlStateManager.rotate(-235.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(125.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(70.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.125000f, -0.100000f, 0.025000f);
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
