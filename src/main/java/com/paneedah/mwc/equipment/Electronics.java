package com.paneedah.mwc.equipment;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.GasDetector;
import com.paneedah.weaponlib.ItemAttachment;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.electronics.*;
import com.paneedah.weaponlib.model.CameraModel;
import com.paneedah.weaponlib.model.TabletModel;
import com.paneedah.weaponlib.perspective.GasDetectorScreenPerspective;
import net.minecraft.client.renderer.GlStateManager;

public class Electronics {

    public static ItemAttachment<Object> Tablet;

    public static void createEquipment(ModContext modContext) {
        Tablet = new ItemTablet.Builder<>()
                .withViewfinderPositioning(() -> {
                    float scale = 5.9f;
                    GlStateManager.scale(scale, scale / modContext.getAspectRatio(), scale);
                    GlStateManager.translate(-0.12f, 0.56f, 0.01f);
                })
                .withCreativeTab(MWC.EQUIPMENT_TAB)
                .withModel(new TabletModel(), "IPad.png")
                //.withModel(new com.paneedah.mwc.models.LPscope(), "HP2.png")
                .withFirstPersonPositioning(() -> {
                    GlStateManager.rotate(25.000000f, 1f, 0f, 0f);
                    GlStateManager.rotate(50.000000f, 0f, 1f, 0f);
                    GlStateManager.rotate(-20.000000f, 0f, 0f, 1f);
                    GlStateManager.translate(1.000000f, 0.100000f, -4.399998f);
                    GlStateManager.scale(5F, 5F, 5F);
                })
                .withThirdPersonModelPositioning(model -> {
                    if (model instanceof TabletModel) {
                        GlStateManager.translate(-0.8F, -0.5F, 0.8F);
                        GlStateManager.rotate(-45F, 0f, 1f, 0f);
                        GlStateManager.rotate(80F, 1f, 0f, 0f);
                        GlStateManager.scale(1F, 1F, 1F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HP) {
                        GlStateManager.translate(-0.6F, -0.6F, 0.6F);
                        GlStateManager.rotate(10F, 1f, 0f, 0f);
                        GlStateManager.rotate(-190F, 0f, 1f, 0f);
                        GlStateManager.rotate(0F, 0f, 0f, 1f);
                        GlStateManager.scale(0.65F, 0.65F, 0.65f);
                    } else if (model instanceof com.paneedah.mwc.models.LPscope) {
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HP) {
                        GlStateManager.translate(0.1F, 0.2F, 0.4F);
                        GlStateManager.rotate(90F, 0f, 0f, 1f);
                        GlStateManager.scale(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.LPscope) {
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withFirstPersonHandPositioning(
                        () -> {
                            GlStateManager.scale(2F, 2F, 2F);
                            GlStateManager.rotate(-145.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(-35.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(20.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(-0.025000f, -1.149999f, -0.100000f);
                        },
                        () -> {
                            GlStateManager.scale(2F, 2F, 2F);
                            GlStateManager.rotate(-135.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(40.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-35.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(0.040000f, -0.575000f, 0.125000f);
                        })
                .withName("tablet")

                .withTextureName("Dummy.png")
                .build(modContext);

        new ItemWirelessCamera.Builder()

                .withName("wcam")
                .withCreativeTab(MWC.EQUIPMENT_TAB)
                .withModel(new CameraModel(), "gun")
                .withFirstPersonPositioning(() -> {
                    // GlStateManager.translate(0.5F, -1.5F, -0.7F);
                    GlStateManager.rotate(55F, 0f, 1f, 0f);
                    // GlStateManager.rotate(2F, 1f, 0f, 0f);
                    GlStateManager.translate(-0.1F, -1.6F, 1F);
                    GlStateManager.scale(1F, 1F, 1F);
                })
                .withThirdPersonModelPositioning(model -> {
                    if (model instanceof CameraModel) {
                        GlStateManager.translate(-0.9F, -0.8F, 0.5F);
                        GlStateManager.rotate(-50F, 0f, 1f, 0f);
                        GlStateManager.rotate(80F, 1f, 0f, 0f);
                        GlStateManager.scale(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HP) {
                        GlStateManager.translate(-0.6F, -0.6F, 0.6F);
                        GlStateManager.rotate(10F, 1f, 0f, 0f);
                        GlStateManager.rotate(-190F, 0f, 1f, 0f);
                        GlStateManager.rotate(0F, 0f, 0f, 1f);
                        GlStateManager.scale(0.65F, 0.65F, 0.65f);
                    } else if (model instanceof com.paneedah.mwc.models.LPscope) {
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HP) {
                        GlStateManager.translate(0.1F, 0.2F, 0.4F);
                        GlStateManager.rotate(90F, 0f, 0f, 1f);
                        GlStateManager.scale(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.LPscope) {
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })

                .withFirstPersonHandPositioning(
                        () -> {
                            GlStateManager.scale(0F, 0F, 0F);
                            // GlStateManager.rotate(190F, 1f, 0f, 0f);
                            // GlStateManager.rotate(10F, 0f, 1f, 0f);
                            // GlStateManager.rotate(30F, 0f, 0f, 1f);
                            // GlStateManager.translate(0.1F, -1.75F, 0F);
                        },
                        () -> {
                            GlStateManager.scale(0F, 0F, 0F);
                            // GlStateManager.rotate(190F, 1f, 0f, 0f);
                            // GlStateManager.rotate(0F, 0f, 1f, 0f);
                            // GlStateManager.rotate(-10F, 0f, 0f, 1f);
                            // GlStateManager.translate(-0.15F, -0.4F, 0.4F);
                        }
                )

                .build(modContext);


        new ItemHandheld.Builder<>()
                .withScreenPerspectiveType(GasDetectorScreenPerspective.class)
                .withScreenPositioning(() -> {
                    float scale = 1.9f;
                    GlStateManager.scale(scale, scale / modContext.getAspectRatio(), scale);
                    GlStateManager.translate(0.017f, 0.16f, 0.17f);
                })
                .withCreativeTab(MWC.EQUIPMENT_TAB)
                .withModel(new GasDetector(), "gasdetector.png")
                .withFirstPersonPositioning(() -> {
                    GlStateManager.scale(4f, 4f, 4f);
                    GlStateManager.rotate(0.000000f, 1f, 0f, 0f);
                    GlStateManager.rotate(70.000000f, 0f, 1f, 0f);
                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
                    GlStateManager.translate(-0.2f, 0.4f, -1.8f);
//            GlStateManager.translate(-6.500000f, 1.575000f, -2.000000f);
//            GlStateManager.rotate(15.000000f, 1f, 0f, 0f);
//            GlStateManager.rotate(45.000000f, 0f, 1f, 0f);
//            GlStateManager.rotate(-5.000000f, 0f, 0f, 1f);
//            GlStateManager.translate(-0.8f, 0.2f, -1.5f);
                })
                .withThirdPersonModelPositioning(model -> {
                    if (model instanceof TabletModel) {
                        GlStateManager.translate(-0.8F, -0.5F, 0.8F);
                        GlStateManager.rotate(-45F, 0f, 1f, 0f);
                        GlStateManager.rotate(80F, 1f, 0f, 0f);
                        GlStateManager.scale(0.6F, 0.6F, 0.6F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HP) {
                        GlStateManager.translate(-0.6F, -0.6F, 0.6F);
                        GlStateManager.rotate(10F, 1f, 0f, 0f);
                        GlStateManager.rotate(-190F, 0f, 1f, 0f);
                        GlStateManager.rotate(0F, 0f, 0f, 1f);
                        GlStateManager.scale(0.65F, 0.65F, 0.65f);
                    } else if (model instanceof com.paneedah.mwc.models.LPscope) {
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HP) {
                        GlStateManager.translate(0.1F, 0.2F, 0.4F);
                        GlStateManager.rotate(90F, 0f, 0f, 1f);
                        GlStateManager.scale(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.LPscope) {
                        GlStateManager.scale(0F, 0F, 0F);
                    }
                })
                .withFirstPersonHandPositioning(
                        () -> {

                            GlStateManager.scale(0f, 0f, 0f);
                        },
                        () -> {
                            GlStateManager.scale(3.3f, 3.3f, 3.3f);
                            GlStateManager.rotate(-100.000000f, 1f, 0f, 0f);
                            GlStateManager.rotate(5.000000f, 0f, 1f, 0f);
                            GlStateManager.rotate(-105.000000f, 0f, 0f, 1f);
                            GlStateManager.translate(0.275000f, -0.425000f, 0.050000f);
//                    GlStateManager.rotate(-180.000000f, 1f, 0f, 0f);
//                    GlStateManager.rotate(-60.000000f, 0f, 1f, 0f);
//                    GlStateManager.rotate(-15.000000f, 0f, 0f, 1f);
//                    GlStateManager.translate(0f, -0.1f, 0.8f);
                        })
                .withName("gas-detector")

                .withTextureName("Dummy.png")
                .build(modContext);
    }
}
