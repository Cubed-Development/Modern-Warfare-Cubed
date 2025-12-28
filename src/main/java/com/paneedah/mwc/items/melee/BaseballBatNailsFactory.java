package com.paneedah.mwc.items.melee;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.melee.ItemMelee;
import com.paneedah.weaponlib.melee.MeleeRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;

public class BaseballBatNailsFactory implements MeleeFactory {

    @Override
    public Item createMelee(CommonProxy commonProxy) {
        return new ItemMelee.Builder()

                .withName("baseball_bat_nails")
                .withCreativeTab(MWC.WEAPONS_TAB)
                .withTextureNames("bat_nails")
                .withAttackDamage(4f)
                .withHeavyAttackDamage(12f)
                .withPrepareStubTimeout(() -> 0)
                .withPrepareHeavyStubTimeout(() -> 0)
                .withAttackCooldownTimeout(() -> 0)
                .withHeavyAttackCooldownTimeout(() -> 0)
                .withAttackSound("swoosh")
                .withHeavyAttackSound("swoosh")
                .withRenderer(
                        new MeleeRenderer.Builder()

                                .withModel(new com.paneedah.mwc.models.BatNails())
                                .withAnimationDuration(300)
                                .withInventoryPositioning(itemStack -> {
                                    GlStateManager.scale(0.7F, 0.7F, 0.7F);
                                    GlStateManager.translate(1, 1.3f, -1.3f);
                                    GlStateManager.rotate(230F, 0f, 1f, 0f);
                                    GlStateManager.rotate(45F, 1f, 0f, 0f);
                                })
                                .withThirdPersonPositioning((renderContext) -> {
                                    GlStateManager.scale(0.8F, 0.8F, 0.8F);
                                    GlStateManager.translate(-0.6F, -0.8F, 0.4F);
                                    GlStateManager.rotate(-45F, 0f, 1f, 0f);
                                    GlStateManager.rotate(70F, 1f, 0f, 0f);
                                })
                                .withFirstPersonPositioning(context -> {
                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                    GlStateManager.rotate(-35.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-1.249999f, 0.375000f, -1.000000f);

//                                    GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
//                                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
//                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
//                                    GlStateManager.rotate(80.000000f, 0f, 0f, 1f);
//                                    GlStateManager.translate(-0.700000f, -0.175000f, -1.800000f);
                                })

                                .withFirstPersonHandPositioning(

                                        context -> { // left hand
                                            GlStateManager.scale(5f, 5f, 5f);
                                            GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(65.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.350000f, -0.075000f, 0.025000f);

//                                            GlStateManager.scale(5f, 5f, 5f);
//                                            GlStateManager.rotate(-135.000000f, 1f, 0f, 0f);
//                                            GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
//                                            GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
//                                            GlStateManager.translate(0.175000f, -0.600000f, 0.475000f);
                                        },

                                        context -> { // right hand
                                            GlStateManager.scale(5f, 5f, 5f);
                                            GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(-130.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(-0.075000f, -0.300000f, -0.275000f);
                                        })

                                .withFirstPersonPositioningHeavyAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                            GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(-1.249999f, 0f, -2f);
                                        }, 60, 0))

                                .withFirstPersonLeftHandPositioningHeavyAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(5f, 5f, 5f);
                                            GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(-25.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(85.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.450000f, -0.4f, -0.050000f);
                                        }, 50, 0)
                                )

                                .withFirstPersonRightHandPositioningHeavyAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(5f, 5f, 5f);
                                            GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(60.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(-110.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(-0.25f, -0.25f, -0.5f);
                                        }, 70, 0)
                                )

                                .withFirstPersonPositioningAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(2.000000f, 2.000000f, 2.000000f);
                                            GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(80.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(-0.700000f, -0.175000f, -1.800000f);
                                        }, 60, 0))

                                .withFirstPersonLeftHandPositioningAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(5f, 5f, 5f);
                                            GlStateManager.rotate(-135.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(-30.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(45.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.175000f, -0.600000f, 0.475000f);
                                        }, 70, 0))

                                .withFirstPersonRightHandPositioningAttacking(
                                        new Transition<>(renderContext -> {
                                            GlStateManager.scale(5f, 5f, 5f);
                                            GlStateManager.rotate(-120.000000f, 1f, 0f, 0f);
                                            GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                            GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                            GlStateManager.translate(0.100000f, 0.025000f, 0.325000f);
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
