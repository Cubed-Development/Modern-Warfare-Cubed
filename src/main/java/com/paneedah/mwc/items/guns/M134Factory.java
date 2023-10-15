package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.*;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class M134Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("m134")
        .withFireRate(0.9999999f)
        .withRecoil(3f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.HEAVY)
        .withMaxShots(Integer.MAX_VALUE)
        .withMuzzlePosition(new Vec3d(-0.16400000488758082, 0.7, -6.9))
        .withShootSound("m134")
        .withReloadingTime(90)
        .withFlashIntensity(0.6f)
        .withFlashScale(() -> 0.7f)
        .withFlashOffsetX(() -> 0.18f)
        .withFlashOffsetY(() -> 0.2f)
        .withShellCasingForwardOffset(-0.02f)
        .withShellCasingVerticalOffset(-0.05f)
		.withInaccuracy(4f)
        .withBleedingCoefficient(7f)
        .withCreativeTab(MWC.WEAPONS_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
            // The weapons power
            10.0,
            // Muzzle climb divisor
            25.75,
            // "Stock Length"
            50.0,
            // Recovery rate from initial shot
            0.4,
            // Recovery rate @ "stock"
            0.3125,
            // Recoil rotation (Y)
            0.01,
            // Recoil rotation (Z)
            0.0,
            // Ads similarity divisor
            1.0
        ))

        .withCompatibleAttachment(Magazines.M134Mag, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M134Barrels, true, (model) -> {
        })
        .withTextureNames("m134")
        .withRenderer(new WeaponRenderer.Builder()
            .withActionPiece(AuxiliaryAttachments.M134Barrels)
            .withActionTransform(
                    new Transform()
                            .withPivotPoint(0.0F, -0.4F, 0.0F)
                            .withRotation(0f, 0f, 1200f)
            )
            .withModel(new M134())
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(0, 0f, 3f);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(1, 2.0f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-1.7F, -0.8F, 1.9F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
            })

            .withFirstPersonPositioning(
                    new Transform()
                            .withPosition(-2.925000f, 3.825000f, -3.825000f)
                            .withRotation(0.000000f, 1.000000f, 6.300000f)
                            .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                            .withScale(4.0F, 4.0F, 4.0F)
                )
                
                .withFirstPersonHandPositioning(

                        // Left hand
                        new Transform()
                        .withPosition(1.190000f, -0.170000f, 0.53000f)
                        .withBBRotation(-31.1566F, 0.6683F, 110.2262F)
                        .withScale(2f, 2f, 3f)
                        .withPivotPoint(0, 0, 0),



                        // Right hand
                        new Transform()
                        .withPosition(-0.0F, 0.2F, 4f)
                        .withBBRotation(-5.4027F, -4.7805F, -1.6694F)
                        .withScale(3f, 3f, 3f)
                        .withPivotPoint(0, 0, 0)


                )
            .setupModernAnimations("m4a1", AuxiliaryAttachments.AKaction)
            .setupModernMagazineAnimations("m4a1",
                    Magazines.M134Mag)

            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M134Barrels.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.0f);
                GL11.glRotatef(0.5F, 1f, 0.5f, 1f);
                })
                       
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScaled(4F, 4F, 4F);
                GL11.glTranslatef(-0.400000f, 1.150000f, -0.849999f);

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                }

                // Everything else
                else {
                }

                })

                .withFirstPersonPositioningModifying((renderContext) -> {
                    new Transform()
                            .withPosition(-1.905000f, 4.065000f, -3.645000f)
                            .withRotation(0.000000f, -30.514396f, -26.062789f)
                            .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                            .withScale(3.000000f, 3.000000f, 3.000000f)
                            .applyTransformations();
                })
                .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                    new Transform()
                            .withPosition(-1.425000f, 3.545000f, -5.685000f)
                            .withRotation(-0.187566f, -46.164037f, -11.869230f)
                            .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                            .withScale(3.000000f, 3.000000f, 3.000000f)
                            .applyTransformations();
                })

                .withFirstPersonHandPositioningModifying(
                        (renderContext) -> {
                            new Transform()
                                    .withPosition(1.730000f, 0.065000f, -0.980000f)
                                    .withRotation(93.414678f, 23.699100f, 15.553163f)
                                    .withScale(2.6F, 2.6F, 4.0F)
                                    .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                    .applyTransformations();
                        },
                        (renderContext) -> {
                            new Transform()
                                    .withPosition(-0.2F, 0.1F, 2)
                                    .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                    .withScale(3.5F, 3.5F, 3.5F)
                                    .withPivotPoint(0, 0, 0)
                                    .applyTransformations();
                        })

                .withFirstPersonHandPositioningModifyingAlt(
                        (renderContext) -> {
                            new Transform()
                                    .withPosition(2.450000f, -0.335000f, -0.660000f)
                                    .withRotation(93.766422f, 50.841130f, 4.679372f)
                                    .withScale(2.600000f, 2.600000f, 4.000000f)
                                    .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                    .applyTransformations();
                        },
                        (renderContext) -> {
                            new Transform()
                                    .withPosition(-0.600000f, 0.340000f, 1.880000f)
                                    .withRotation(-12.193518f, -4.7805F, 1.399459f)
                                    .withScale(3.5F, 3.5F, 3.5F)
                                    .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                    .applyTransformations();
                        })

            .build())
        .withSpawnEntityDamage(8f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
         
        .build(MWC.modContext);
    }
}
