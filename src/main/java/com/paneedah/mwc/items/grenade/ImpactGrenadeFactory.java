package com.paneedah.mwc.items.grenade;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.ImpactGrenade;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.grenade.GrenadeRenderer;
import com.paneedah.weaponlib.grenade.ItemGrenade;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;

public class ImpactGrenadeFactory implements GrenadeFactory {

    @Override
    public ItemGrenade createGrenade(CommonProxy commonProxy) {
        return new ItemGrenade.Builder()

                .withName("ImpactGrenade")
                .withCreativeTab(MWC.THROWABLES_TAB)
                .withTextureNames("ImpactGrenade")
                .withExplosionSound("grenadeexplosion")
                .withExplosionStrength(3f)
                .withBounceSoftSound("grenade-soft-bounce")
                .withBounceHardSound("grenade-hard-bounce")
                .withEffectiveRadius(15f)
                .withFragmentCount(1500)
                .withFragmentDamage(30f)
                .withVelocity(() -> 1.3f)
                .withGravityVelocity(() -> 0.06f)
                .withRotationSlowdownFactor(() -> 0.99f)
                .withExplosionOnImpact()
                .withDestroyingBlocks(false)
                .withModernRecipe(
                        CraftingGroup.GRENADE,
                        new CraftingEntry(MWCItems.steelIngot, 2),
                        new CraftingEntry(Blocks.TNT, 1),
                        new CraftingEntry(MWCItems.syntheticPolymerComposite, 4)
                )
                .withRenderer(new GrenadeRenderer.Builder()

                        .withModel(new ImpactGrenade())
                        .withAnimationDuration(500)
                        .withThrownEntityPositioning(() -> {
                            GlStateManager.scale(0.2f, 0.2f, 0.2f);
                            GlStateManager.rotate(180, 0f, 0f, 0f);
                        })
                        .withEntityRotationCenterOffsets(() -> -0.025f, () -> 0.2f, () -> -0.025f)
                        .withInventoryPositioning(itemStack -> {
                            GlStateManager.scale(0.7F, 0.7F, 0.7F);
                            GlStateManager.translate(1, 1.3f, -1.3f);
                            GlStateManager.rotate(230F, 0f, 1f, 0f);
                            GlStateManager.rotate(45F, 1f, 0f, 0f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GlStateManager.scale(0.3F, 0.3F, 0.3F);
                            GlStateManager.translate(-3F, -1F, 3F);
                            GlStateManager.rotate(-225F, 0f, 1f, 0f);
                            GlStateManager.rotate(-45F, 1f, 0f, 0f);
                        })
                        .withFirstPersonPositioning(context -> {
                            GlStateManager.scale(0.4f, 0.4f, 0.4f);
                            GlStateManager.rotate(25.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(10.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-3f, -0.6f, -2.2f);
                        })

                        .withFirstPersonHandPositioning(
                                context -> { // left hand
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(60.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.175000f, -0.525000f, 0.425000f);
                                },

                                context -> { // right hand
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.200000f, -0.300000f, 0.100000f);
                                })

                        .withFirstPersonPositioningThrowing(
                                new Transition<>(renderContext -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.scale(0.100000f, 0.100000f, 0.100000f);
                                    GlStateManager.rotate(-40.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0f, -6.849998f, -2.400000f);
                                }, 260, 120),

                                new Transition<>(renderContext -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.475000f, -0.750000f, -0.075000f);

                                    // Hide item on throwing
                                    GlStateManager.scale(0.000000f, 0.000000f, 0.000000f);
                                }, 80, 80),

                                new Transition<>(renderContext -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(155.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.475000f, -0.750000f, 0.075000f);
                                }, 80, 80))

                        .withFirstPersonLeftHandPositioningThrowing(
                                new Transition<>(renderContext -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(75.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.175000f, -1.025000f, 0.225000f);
                                }, 70, 0),

                                new Transition<>(renderContext -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-105.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(75.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.175000f, -1.025000f, 0.225000f);

                                }, 70, 0),

                                new Transition<>(renderContext -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(30.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(80.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(-0.225000f, -0.975000f, 0.550000f);
                                }, 70, 0)

                        )

                        .withFirstPersonRightHandPositioningThrowing(
                                new Transition<>(renderContext -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-150.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(0.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.5f, -0.200000f, -0.300000f);
                                }, 70, 0),

                                new Transition<>(renderContext -> {
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-80.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(-5.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.250000f, -0.50000f, -0.300000f);

                                }, 70, 0),

                                new Transition<>(renderContext -> {
                                    //                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    //                                    GlStateManager.rotate(-30.000000f, 1f, 0f, 0f);
                                    //                                    GlStateManager.rotate(10.000000f, 0f, 1f, 0f);
                                    //                                    GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
                                    //                                    GlStateManager.translate(0.275000f, -0.400000f, 0.200000f);
                                }, 70, 0))

                        .withFirstPersonHandPositioningThrown(
                                context -> { // left hand
                                    GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    GlStateManager.rotate(-85.000000f, 1f, 0f, 0f);
                                    GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
                                    GlStateManager.rotate(55.000000f, 0f, 0f, 1f);
                                    GlStateManager.translate(0.100000f, -0.725000f, 0.700000f);
                                },

                                context -> { // right hand
                                    //                                  GlStateManager.scale(3.000000f, 3.000000f, 3.000000f);
                                    //                                  GlStateManager.rotate(-90.000000f, 1f, 0f, 0f);
                                    //                                  GlStateManager.rotate(-10.000000f, 0f, 1f, 0f);
                                    //                                  GlStateManager.rotate(15.000000f, 0f, 0f, 1f);
//                                                                      GlStateManager.translate(0f, 0.8f, 0.7f);
                                })

                        .build())

                .build(MWC.modContext);
    }
}
