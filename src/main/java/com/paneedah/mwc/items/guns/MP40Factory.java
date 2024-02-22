package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class MP40Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
                .withName("mp40")
                .withFireRate(0.6f)
                .withRecoil(1.5f)
                .withZoom(0.9f)
                .withMuzzlePosition(new Vec3d(-.15, -.9, -6))
                .withConfigGroup(GunConfigurationGroup.SUBMACHINE_GUN)
                .withShellType(Type.PISTOL)
                .withMaxShots(1, Integer.MAX_VALUE)
                .withShootSound("mp40")
                .withSilencedShootSound("ak15_silenced")
                .withDrawSound("noaction_draw")
                .withReloadingTime(45)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.13f)
                .withInaccuracy(2f)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        15.0,
                        15.75,
                        50.0,
                        0.4,
                        0.3125,
                        0.0,
                        0.0,
                        1.0
                ))
                .withScreenShaking(RenderableState.SHOOTING,
                        2f,
                        0.1f,
                        3f)

                .withCompatibleAttachment(AuxiliaryAttachments.MP40action, true, (model) -> {
                })
                .withCompatibleAttachment(Magazines.MP40Mag, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
                    if (model instanceof AKMiron1) {
                        GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GL11.glTranslatef(-0.183F, -1.29F, -4.1F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AK47iron) {
                        GL11.glTranslatef(-0.2F, -1.46F, -1.585F);
                        GL11.glScaled(0.5F, 0.5F, 0.08F);
                    } else if (model instanceof M4Iron1) {
                        GL11.glTranslatef(0.155F, -1.74F, 1F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof M4Iron2) {
                        GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof P90iron) {
                        GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                        GL11.glScaled(0F, 0F, 0F);
                    }
                    if (model instanceof G36CIron1) {
                        GL11.glTranslatef(-0.04F, -1.216F, -1.65F);
                        GL11.glScaled(0.4F, 0.3F, 0.7F);
                        GL11.glRotatef(180F, 0f, 0f, 1f);
                    } else if (model instanceof G36CIron2) {
                        GL11.glTranslatef(-0.18F, -1.19F, -5.63F);
                        GL11.glScaled(0.4F, 0.45F, 0.45F);
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
                        GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GL11.glTranslatef(-0.101F, -1.27F, -0.18F);
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withTextureNames("mp40")
                .withRenderer(new WeaponRenderer.Builder()
                        .withModel(new MP40())
                        .withEntityPositioning(itemStack -> {
                            GL11.glScaled(0.35F, 0.35F, 0.35F);
                            GL11.glTranslatef(0, 0f, 3f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GL11.glScaled(0.28F, 0.28F, 0.28F);
                            GL11.glTranslatef(1, 2f, -1.2f);
                            GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-1.8F, -1.1F, 2F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.425000f, 3.745000f, -3.325000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(-0.350000f, -0.940000f, 0.060000f)
                                        .withScale(3.0F, 3.0F, 3.0F)
                        )

                        .withFirstPersonHandPositioning(


                                new Transform()
                                        .withPosition(1.210000f, 0.265000f, -0.260000f)
                                        .withBBRotation(-10.558F, -28.6459F, 58.5348F)
                                        .withScale(2.6F, 2.6F, 4.0F)
                                        .withPivotPoint(0, 0, 0),


                                new Transform()
                                        .withPosition(-0.200000f, 0.260000f, 1.680000f)
                                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                        .withScale(3.0F, 3.0F, 3.0F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("apc9", AuxiliaryAttachments.MP40action)
                        .setupModernMagazineAnimations("apc9",
                                Magazines.MP40Mag)

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glTranslatef(0.187F, -0.32F, 0.5F);
                        })

                        .build())
                .withSpawnEntityDamage(5f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}