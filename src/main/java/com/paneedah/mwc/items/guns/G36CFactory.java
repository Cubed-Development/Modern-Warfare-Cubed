package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingComplexity;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class G36CFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("g36c")
                .withFireRate(0.75f)
                .withRecoil(2.5f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.RIFLES)
                .hasFlashPedals()
                .withMaxShots(1, 3, Integer.MAX_VALUE)
                .withShootSound("g36c")
                .withSilencedShootSound("m4a1_silenced")
                .withReloadSound("g36c_reload")
                .withUnloadSound("g36c_unload")
                .withEndOfShootSound("gun_click")
                .withInspectSound("inspection")
                .withDrawSound("noaction_draw")
                .withReloadingTime(50)
                .withCrosshair("gun")
                .withCrosshairRunning("Running")
                .withCrosshairZoomed("Sight")
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.2f)
                .withShellCasingForwardOffset(0.05f)
                .withShellCasingVerticalOffset(-0.03f)
                .withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        // The weapon power
                        15.0,
                        // Muzzle climb divisor
                        15.75,
                        // "Stock Length"
                        50.0,
                        // Recovery rate from initial shot
                        0.4,
                        // Recovery rate @ "stock"
                        0.3125,
                        // Recoil rotation (Y)
                        0.0,
                        // Recoil rotation (Z)
                        0.0,
                        // Ads similarity divisor
                        1.0
                ))
                .withInformationProvider(stack -> Arrays.asList(
                        "Type: Assault Rifle",
                        "Damage: 6",
                        "Cartridge: 5.56x45mm NATO",
                        "Fire Rate: SEMI, AUTO",
                        "Rate of Fire: 75/100",
                        "Magazines:",
                        "30rnd 5.56x45mm NATO HK Magazine",
                        "100rnd 5.56x45mm NATO STANAG Drum Magazine"))
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.gunmetalIngot,
                        MWCItems.gunmetalPlate)

                .withScreenShaking(RenderableState.SHOOTING,
                        0.5f, // x
                        0f, // y
                        3.5f) // z

                .withModernRecipe(new
                        CraftingEntry(MWCItems.carbonComposite, 6), new
                        CraftingEntry(MWCItems.gunmetalPlate, 9), new
                        CraftingEntry(MWCItems.steelIngot, 5))

                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
                .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.GripPlaceholder, true, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Attachments.LaserPlaceholder, true, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withCompatibleAttachment(Magazines.G36CMag, (model) -> {
//            GL11.glTranslatef(-0.37F, 0.8F, -1.7F);
//            GL11.glScaled(1.25F, 1.7F, 1.7F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.G36CAction, true, (model) -> {
//            GL11.glTranslatef(0F, 0F, 0.75F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
                    if (model instanceof AKMiron1) {
                        GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AK47iron) {
                        GL11.glTranslatef(0.092F, -1.91F, -0.9F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof M4Iron1) {
                        GL11.glTranslatef(0.155F, -1.74F, 1F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof M4Iron2) {
                        GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof P90iron) {
                        GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof G36CIron1) {
                        GL11.glTranslatef(-0.18F, -1.73F, -0.3F);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof G36CIron2) {
                        GL11.glTranslatef(-0.19F, -1.7F, -3.25F);
                        GL11.glScaled(0.45F, 0.5F, 0.9F);
                    } else if (model instanceof ScarIron1) {
                        GL11.glTranslatef(0.165F, -1.65F, 1F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof ScarIron2) {
                        GL11.glTranslatef(0.25F, -1.55F, -2F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof FALIron) {
                        GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof M14Iron) {
                        GL11.glTranslatef(0.14F, -1.74F, 1F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GL11.glTranslatef(-0.218F, -1.75F, -2.4F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GL11.glTranslatef(-0.335F, -1.77F, -1F);
                    GL11.glScaled(0.9F, 0.9F, 0.9F);
                }, (model) -> {
                    if (model instanceof AcogScope2) {
                        GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof AcogReticle) {
                        GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
                    GL11.glTranslatef(-0.2F, -1.4F, -1.4F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GL11.glTranslatef(-0.06F, -1.56F, -1.8F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GL11.glTranslatef(-0.06F, -1.55F, -1.4F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GL11.glTranslatef(-0.035F, -1.6F, -1.4F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GL11.glTranslatef(-0.035F, -1.6F, -1.4F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
                    GL11.glTranslatef(-0.335F, -1.83F, -1.8F);
                    GL11.glScaled(0.54F, 0.54F, 0.54F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GL11.glTranslatef(-0.024F, -1.61F, -1.4F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
                    GL11.glTranslatef(-0.024F, -1.61F, -1.4F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
                    GL11.glTranslatef(-0.154F, -2.38F, -1.4F);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                })
                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GL11.glTranslatef(-0.19F, -1.81F, -1.5F);
                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.15F, -0.4F, -0.35F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GL11.glTranslatef(-0.19F, -1.81F, -1.5F);
                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.15F, -0.4F, -0.35F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.15F, -3.6F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.15F, -3.6F);
                    GL11.glScaled(1F, 1F, 1F);
                })
//      .withCompatibleAttachment(CommonProxy.Grip, (model) -> {
//          GL11.glTranslatef(.135F, -0.5F, -1.2F);
//          GL11.glScaled(0.6F, 0.6F, 0.6F);
//      })
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.15F, -3.6F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
                    GL11.glTranslatef(0.07F, -1.04F, -4.6F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
                    GL11.glTranslatef(0.07F, -1.04F, -4.6F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
                    GL11.glTranslatef(-0.2F, -1.1F, -6.15F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withTextureNames("g36c")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new G36C())
                        .withActionPiece(AuxiliaryAttachments.G36CAction)
                        .withActionTransform(new Transform().withPosition(0, 0, 1))
                        .withEntityPositioning(itemStack -> {
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(0, 0f, 3f);
                            GL11.glRotatef(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GL11.glScaled(0.35F, 0.35F, 0.35F);
                            GL11.glTranslatef(1, 2f, -1.2f);
                            GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GL11.glScaled(0.45F, 0.45F, 0.45F);
                            GL11.glTranslatef(-2.2F, -0.6F, 2.3F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.425000f, 4.545000f, -3.725000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                                        .withScale(3.000000f, 3.000000f, 3.000000f)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.090000f, 0.185000f, -0.340000f)
                                        .withBBRotation(-8.1997, -23.6991, 57.7232)
                                        .withScale(2.6, 2.6, 4.0)
                                        .withRotationPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.200000f, 0.300000f, 2.040000f)
                                        .withRotation(-5.402700f, -4.780500f, -1.669400f)
                                        .withScale(3.5, 3.5, 3.5)
                                        .withRotationPoint(0, 0, 0)

                        )

                        .setupModernAnimations("g36c", AuxiliaryAttachments.G36CAction)
                        .setupModernMagazineAnimations("g36c",
                                Magazines.G36CMag)

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.G36CAction.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GL11.glTranslatef(0F, 0F, 1F);
                            }
                        })

                        .withThirdPersonPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 240, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 170, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 260, 0),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 240, 100),

                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 200, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 170, 170),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 260, 10),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 100, 50)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                            GL11.glTranslatef(0.140f, 1.234f, -0.4f);

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(-0.002F, 0.215f, 0.8f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(-0.002F, 0.275f, 0.75f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.185f, 0.65f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Reflex");
                                GL11.glTranslatef(0.005F, 0.2f, 0.9f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Reflex");
                                GL11.glTranslatef(0F, 0.16f, 0.6f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                //System.out.println("Position me for Reflex");
                                GL11.glTranslatef(0.005F, 0.26f, 0.6f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Reflex");
                                GL11.glTranslatef(0F, 0.26f, 0.85f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                //System.out.println("Position me for Reflex");
                                GL11.glTranslatef(0F, 0.26f, 0.85f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Holo");
                                GL11.glTranslatef(0F, 0.245f, 0.55f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Holo");
                                GL11.glTranslatef(0F, 0.245f, 0.55f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                //System.out.println("Position me for Holo");
                                GL11.glTranslatef(0F, 0.3f, 0.85f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Holo");
                                GL11.glTranslatef(0F, 0.27f, 0.75f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Holo");
                                GL11.glTranslatef(0F, 0.27f, 0.75f);
                            }

                            // Everything else
                            else {
                            }

                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.985000f, 5.145000f, -5.245000f)
                                    .withRotation(0.000000f, -30.514396f, -26.062789f)
                                    .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .doGLDirect();
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.265000f, 4.745000f, -8.285000f)
                                    .withRotation(2.793742f, -46.352252f, -19.231070f)
                                    .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .doGLDirect();
                        })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.330000f, 0.065000f, 0.140000f)
                                            .withRotation(78.544055f, 23.699100f, 18.430633f)
                                            .withScale(2.6, 2.6, 4.0)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.200000f, 0.300000f, 2.040000f)
                                            .withRotation(-5.402700f, -4.780500f, -1.669400f)
                                            .withScale(3.5, 3.5, 3.5)
                                            .withRotationPoint(0, 0, 0)
                                            .doGLDirect();
                                })

                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.330000f, 0.065000f, 0.140000f)
                                            .withRotation(78.544055f, 23.699100f, 18.430633f)
                                            .withScale(2.600000f, 2.600000f, 4.000000f)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.200000f, 0.300000f, 2.040000f)
                                            .withRotation(-5.402700f, -4.780500f, -1.669400f)
                                            .withScale(3.5, 3.5, 3.5)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                })

                        .withThirdPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                                }, 250, 0))

                        .withThirdPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-54.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),
                                new Transition((renderContext) -> { // Reload position
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0))

                        .build())
                .withSpawnEntityDamage(6f)
                .withSpawnEntityGravityVelocity(0.0118f)


                .build(MWC.modContext);
    }
}
