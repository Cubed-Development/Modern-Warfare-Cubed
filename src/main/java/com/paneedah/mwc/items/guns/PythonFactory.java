package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.Python;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.Item;

public class PythonFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("Python")
                .withAmmoCapacity(6)
                .withFireRate(0.2f)
                .withRecoil(6f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.HANDGUN)
                .withMaxShots(1)
                .withShootSound("python")
//		.withIteratedLoad()
                .withReloadSound("revolver_reload")
                .withReloadIterationSound("revolver_insert_bullet")
                .withAllReloadIterationsCompletedSound("revolver_load_complete")
                .withReloadingTime(25)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.15f)
                .withInaccuracy(2)
                .withShellCasingEjectEnabled(false)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        // The weapon power
                        85.0,
                        // Muzzle climb divisor
                        13.125,
                        // "Stock Length"
                        50.0,
                        // Recovery rate from initial shot
                        0.3625,
                        // Recovery rate @ "stock"
                        0.325,
                        // Recoil rotation (Y)
                        0.0,
                        // Recoil rotation (Z)
                        0.0,
                        // Ads similarity divisor
                        1.0
                ))

                .withCompatibleAttachment(AuxiliaryAttachments.PythonChamber, true, (model) -> {
//			GlStateManager.translate(-0.35f, -0.1f, 0f);
//            GlStateManager.rotate(25F, 0f, 0f, 1f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.RevolverSpeedLoader, true, (model) -> {
//			GlStateManager.translate(-0f, -0.1f, 0.7f);
//			GlStateManager.rotate(30F, 0f, 1f, 0f);
//            GlStateManager.rotate(25F, 0f, 0f, 1f);
//            GlStateManager.rotate(-10F, 1f, 0f, 0f);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.RevolverSpeedLoaderBullets, true, (model) -> {
//			GlStateManager.translate(0f, 0f, 0.001f);

//			GlStateManager.translate(-0.35f, -0.1f, 0.4f);
//            GlStateManager.rotate(25F, 0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.DanWessonLaser, (p, s) -> {
                    GlStateManager.translate(-0.3F, -0.8F, -3);
                    GlStateManager.scale(0.9F, 0.9F, 0.9F);
//            GlStateManager.rotate(-90F, 0f, 0f, -4f);
                })
                .withCompatibleBullet(Bullets.Bullet357, (model) -> {})
                .withTextureNames("Python")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new Python())
                        //.withTextureName("XEagle")
                        //.withWeaponProximity(0.99F)
                        //.withYOffsetZoom(5F)
                        .withEntityPositioning(itemStack -> {
                            GlStateManager.scale(0.4F, 0.4F, 0.4F);
                            GlStateManager.rotate(-90F, 0f, 0f, 4f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GlStateManager.scale(0.35F, 0.35F, 0.35F);
                            GlStateManager.translate(0, 0.8f, 0);
                            GlStateManager.rotate(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GlStateManager.scale(0.5F, 0.5F, 0.5F);
                            GlStateManager.translate(-1.8F, -1F, 2F);
                            GlStateManager.rotate(-45F, 0f, 1f, 0f);
                            GlStateManager.rotate(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-0.945000f, 4.065000f, -7.845000f)
                                        .withRotation(0.000000f, 1.000000f, 10.681469f)
                                        .withPivotPoint(-0.12000000357627871F, -0.36000001072883614F, 0.040000001192092904F)
                                        .withScale(3, 3, 3)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.370000f, 1.025000f, 2.140000f)
                                        .withBBRotation(-12.9672F, -29.0825F, 67.8433F)
                                        .withScale(3, 3, 4)
                                        .withPivotPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.320000f, 0.260000f, 1.920000f)
                                        .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                                        .withScale(3, 3, 3.5F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("taurus", Attachments.P226Slide)
                        .setupCustomKeyedPart(AuxiliaryAttachments.PythonChamber, "taurus", "chamber")
                        .setupCustomKeyedPart(AuxiliaryAttachments.RevolverSpeedLoader, "taurus", "loader")
                        .setupCustomKeyedPart(AuxiliaryAttachments.RevolverSpeedLoaderBullets, "taurus", "bullets")

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GlStateManager.scale(3F, 3F, 3F);
                            GlStateManager.translate(0.14f, 0.78f, -2);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0f, 1f);
                            }

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Holo");
                                GlStateManager.translate(0f, 0.1f, 1f);
                            }

                            // Everything else
                            else {
                            }

                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(-0.945000f, 3.625000f, -7.165000f)
                                    .withRotation(-4.041486f, -30.854630f, -19.420376f)
                                    .withPivotPoint(-0.120000f, -0.360000f, 0.040000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            new Transform()
                                    .withPosition(-0.945000f, 3.625000f, -7.885000f)
                                    .withRotation(-4.041486f, -45.595835f, -21.768277f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.770000f, 1.225000f, 0.140000f)
                                            .withRotation(73.670132f, -70.659155f, 41.991085f)
                                            .withScale(2.6F, 2.6F, 4)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.320000f, 0.140000f, 2.040000f)
                                            .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                                            .withScale(3, 3, 3.5F)
                                            .withPivotPoint(0, 0, 0)
                                            .applyTransformations();
                                })

                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.770000f, 1.225000f, 0.140000f)
                                            .withRotation(73.670132f, -70.659155f, 41.991085f)
                                            .withScale(2.6F, 2.6F, 4)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.320000f, 0.140000f, 2.040000f)
                                            .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                                            .withScale(3, 3, 3.5F)
                                            .withPivotPoint(0, 0, 0)
                                            .applyTransformations();
                                })

                        .build())
                .withSpawnEntityDamage(11f)
                .withSpawnEntityGravityVelocity(0.016f)


                .build(MWC.modContext);
    }
}
