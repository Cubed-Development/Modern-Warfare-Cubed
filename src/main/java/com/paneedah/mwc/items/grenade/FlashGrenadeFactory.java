package com.paneedah.mwc.items.grenade;

import com.paneedah.mwc.Grenades;
import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.FlashGrenade;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.weaponlib.Part;
import com.paneedah.weaponlib.RenderContext;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.grenade.GrenadeRenderer;
import com.paneedah.weaponlib.grenade.ItemGrenade;
import com.paneedah.weaponlib.grenade.ItemGrenade.Type;
import com.paneedah.weaponlib.grenade.RenderableState;
import net.minecraft.init.Items;
import org.lwjgl.opengl.GL11;

public class FlashGrenadeFactory implements GrenadeFactory {

    @Override
    public ItemGrenade createGrenade(CommonProxy commonProxy) {
        return new ItemGrenade.Builder()
        
                .withType(Type.FLASH)
                .withName("Flash")
                .withCreativeTab(MWC.GRENADES_TAB)
                .withTextureNames("flashgrenade")
                .withExplosionStrength(0.1f)
                .withExplosionTimeout(5000)
                .withExplosionSound("flashbang")
                .withBounceSoftSound("grenade-soft-bounce")
                .withBounceHardSound("grenade-hard-bounce")
                .withThrowSound("grenadethrow")
                .withSafetyPinOffSound("safetypinoff")
                .withEffectiveRadius(20f)
                .withFragmentCount(3000)
                .withFragmentDamage(500f)
                .withCompatibleAttachment(Grenades.GrenadeSafetyPin, (p, s) -> {})
                .withVelocity(() -> 0.8f)
                .withFarVelocity(() -> 1.3f)
                .withGravityVelocity(() -> 0.06f)
                .withRotationSlowdownFactor(() -> 0.99f)
                .withDestroyingBlocks(false)
                .withModernRecipe(
                        CraftingGroup.GRENADE,
                        new CraftingEntry(Items.IRON_INGOT, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2),
                        new CraftingEntry(MWCItems.syntheticPolymerComposite, 5)
                )
                .withRenderer(
                        new GrenadeRenderer.Builder()
                
                        .withModel(new FlashGrenade())
                        .withAnimationDuration(500)

                        .withThrownEntityPositioning(() -> {
                            GL11.glScalef(0.2f, 0.2f, 0.2f);
                            GL11.glRotatef(180, 0f, 0f, 0f);
                        })
                        .withEntityRotationCenterOffsets(() -> -0.025f, () -> 0.2f, () -> -0.025f)

                        .withInventoryPositioning(itemStack -> {
                            GL11.glScaled(0.7F, 0.7F, 0.7F);
                            GL11.glTranslatef(1, 1.8f, -1.6f);
                            GL11.glRotatef(230F, 0f, 1f, 0f);
                            GL11.glRotatef(45F, 1f, 0f, 0f);
                        })

                        .withThirdPersonPositioning((renderContext) -> {
                            GL11.glScaled(0.3F, 0.3F, 0.3F);
                            GL11.glTranslatef(-3F, -1F, 3F);
                            GL11.glRotatef(-225F, 0f, 1f, 0f);
                            GL11.glRotatef(-45F, 1f, 0f, 0f);
                        })
                        .withFirstPersonPositioning(context -> {
                            GL11.glScalef(0.4f, 0.4f, 0.4f);
                            GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-3f, -0.6f, -2.2f);
                        })

                        .withFirstPersonCustomPositioning(Grenades.GrenadeSafetyPin.getRenderablePart(), null,
                                context -> {
//                                    //context.attachTo(Part.MAIN_ITEM);
//                                    GL11.glScalef(1f, 1f, 1f);
//                                    GL11.glRotatef(25.000000f, 0f, 1f, 0f);
//                                    GL11.glRotatef(10.000000f, 0f, 0f, 1f);
//                                    GL11.glTranslatef(f, -0.6f, -2.2f);
                                })

                        .withFirstPersonHandPositioning(
                                context -> { // left hand
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.175000f, -0.525000f, 0.425000f);
                                },

                                context -> { // right hand
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.200000f, -0.300000f, 0.100000f);
                                })

                        .withFirstPersonPositioningSafetyPinOff(
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(0.33f, 0.33f, 0.33f);
                                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-1.5f, -2.15f, -2.3f);
                                }, 200, 50 ),

                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(0.33f, 0.33f, 0.33f);
                                    GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-1.5f, -2.15f, -2.3f);
                                }, 200, 0 )

                                )

                        .withFirstPersonLeftHandPositioningSafetyPinOff(
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(105.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.200000f, -0.775000f, 0.100000f);

                                }, 70, 0),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.175000f, -1.025000f, 0.225000f);
                                }, 70, 0)
                                )

                        .withFirstPersonRightHandPositioningSafetyPinOff(
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.325000f, -0.375000f, -0.125000f);
                                }, 70, 0),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.325000f, -0.375000f, -0.125000f);
                                }, 70, 0)
                                )

                        .withFirstPersonCustomPositioningSafetyPinOff(Grenades.GrenadeSafetyPin.getRenderablePart(),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(0.200000f, 0.200000f, 0.200000f);
                                    GL11.glRotatef(80.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-90.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-3.899998f, 1.400002f, -2.400000f);
                                }, 70, 0, Part.LEFT_HAND),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(0.200000f, 0.200000f, 0.200000f);
                                    GL11.glRotatef(80.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-90.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-3.899998f, 1.400002f, -2.400000f);
                                }, 70, 0, Part.LEFT_HAND)
                                )

                        .withFirstPersonPositioningThrowing(
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glScalef(0.100000f, 0.100000f, 0.100000f);
                                    GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0f, -6.849998f, -2.400000f);
                                }, 260, 120),

                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(85.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.475000f, -0.750000f, -0.075000f);

                                    // Hide item on throwing
                                    GL11.glScalef(0.000000f, 0.000000f, 0.000000f);
                                }, 80, 80),

                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(155.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.475000f, -0.750000f, 0.075000f);
                                }, 80, 80))

                        .withFirstPersonLeftHandPositioningThrowing(
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.175000f, -1.025000f, 0.225000f);
                                }, 70, 0),

                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.175000f, -1.025000f, 0.225000f);

                                }, 70, 0),

                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(80.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.225000f, -0.975000f, 0.550000f);
                                }, 70, 0)

                                )

                        .withFirstPersonRightHandPositioningThrowing(
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-150.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.5f, -0.200000f, -0.300000f);
                                }, 70, 0),

                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.250000f, -0.50000f, -0.300000f);

                                }, 70, 0),

                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    //                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    //                                    GL11.glRotatef(-30.000000f, 1f, 0f, 0f);
                                    //                                    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                                    //                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    //                                    GL11.glTranslatef(0.275000f, -0.400000f, 0.200000f);
                                }, 70, 0))

                        .withFirstPersonCustomPositioningThrowing(Grenades.GrenadeSafetyPin.getRenderablePart(),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(0.200000f, 0.200000f, 0.200000f);
                                    GL11.glRotatef(80.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-90.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-3.899998f, 1.400002f, -2.400000f);
                                }, 70, 0, Part.LEFT_HAND),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(0.200000f, 0.200000f, 0.200000f);
                                    GL11.glRotatef(80.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-90.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-3.899998f, 1.400002f, -2.400000f);
                                }, 70, 0, Part.LEFT_HAND),
                                new Transition<RenderContext<RenderableState>>(renderContext -> {
                                    GL11.glScalef(0.200000f, 0.200000f, 0.200000f);
                                    GL11.glRotatef(80.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-90.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-3.899998f, 1.400002f, -2.400000f);
                                }, 70, 0, Part.LEFT_HAND))

                        .withFirstPersonPositioningStrikerLeverOff(renderContext -> {
                            GL11.glScalef(0.33f, 0.33f, 0.33f);
                            GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(000000f, 0f, 1f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-1.5f, -2.15f, -2.3f);
                        })

                        .withFirstPersonCustomPositioningStrikerLeverOff(Grenades.GrenadeSafetyPin.getRenderablePart(),
                                Part.LEFT_HAND,
                                renderContext -> {
                                    GL11.glScalef(0.200000f, 0.200000f, 0.200000f);
                                    GL11.glRotatef(80.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-90.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-3.899998f, 1.400002f, -2.400000f);
                                })

                        .withFirstPersonCustomPositioningThrown(Grenades.GrenadeSafetyPin.getRenderablePart(),
                                Part.MAIN_ITEM,
                                renderContext -> {
                                    GL11.glScalef(0.500000f, 0.500000f, 0.500000f);
                                    GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.800000f, 1.025000f, -0.050000f);
                                })

                        .withFirstPersonHandPositioningStrikerLevelOff(

                                context -> { // left hand
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(75.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.175000f, -1.025000f, 0.225000f);

                                },

                                context -> { // right hand
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.325000f, -0.375000f, -0.125000f);
                                })


                        .withFirstPersonHandPositioningThrown(
                                context -> { // left hand
                                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(55.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.100000f, -0.725000f, 0.700000f);
                                },

                                context -> { // right hand
                                    //                                  GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                                    //                                  GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                    //                                  GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    //                                  GL11.glRotatef(15.000000f, 0f, 0f, 1f);
//                                                                      GL11.glTranslatef(0f, 0.8f, 0.7f);
                                })

                        .build())

                .build(MWC.modContext);
    }
}
