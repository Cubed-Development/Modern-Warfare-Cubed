package com.paneedah.mwc;

import com.paneedah.mwc.models.GasDetector;
import com.paneedah.weaponlib.ItemAttachment;
import com.paneedah.weaponlib.electronics.ItemHandheld;
import com.paneedah.weaponlib.electronics.ItemTablet;
import com.paneedah.weaponlib.electronics.ItemWirelessCamera;
import com.paneedah.weaponlib.model.CameraModel;
import com.paneedah.weaponlib.model.TabletModel;
import com.paneedah.weaponlib.perspective.GasDetectorScreenPerspective;
import org.lwjgl.opengl.GL11;

public class Electronics {

    public static ItemAttachment<Object> Tablet;

    public static void init(Object mod) {
        Tablet = new ItemTablet.Builder<>()
                .withViewfinderPositioning((p, s) -> {
                    float scale = 5.9f;
                    GL11.glScalef(scale, scale / MWC.modContext.getAspectRatio(), scale);
                    GL11.glTranslatef(-0.12f, 0.56f, 0.01f);
                })
                .withCreativeTab(MWC.GADGETS_TAB)
                .withCrosshair("HP")
                .withModel(new TabletModel(), "IPad.png")
                //.withModel(new com.paneedah.mwc.models.LPscope(), "HP2.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glRotatef(25.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(50.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(1.000000f, 0.100000f, -4.399998f);
                    GL11.glScaled(5F, 5F, 5F);
                })
                .withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof TabletModel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(1F, 1F, 1F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HP) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.65F, 0.65F, 0.65f);
                    } else if (model instanceof com.paneedah.mwc.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.LPscope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withFirstPersonHandPositioning(
                        c -> {
                            GL11.glScaled(2F, 2F, 2F);
                            GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.025000f, -1.149999f, -0.100000f);
                        },
                        c -> {
                            GL11.glScaled(2F, 2F, 2F);
                            GL11.glRotatef(-135.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.040000f, -0.575000f, 0.125000f);
                        })
                .withName("tablet")
        
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        new ItemWirelessCamera.Builder()

        .withName("wcam")
        .withCreativeTab(MWC.GADGETS_TAB)
        .withModel(new CameraModel(), "gun")
        .withFirstPersonPositioning((player, itemStack) -> {
            // GL11.glTranslatef(0.5F, -1.5F, -0.7F);
            GL11.glRotatef(55F, 0f, 1f, 0f);
            // GL11.glRotatef(2F, 1f, 0f, 0f);
            GL11.glTranslatef(-0.1F, -1.6F, 1F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof CameraModel) {
                GL11.glTranslatef(-0.9F, -0.8F, 0.5F);
                GL11.glRotatef(-50F, 0f, 1f, 0f);
                GL11.glRotatef(80F, 1f, 0f, 0f);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof com.paneedah.mwc.models.HP) {
                GL11.glTranslatef(-0.6F, -0.6F, 0.6F);
                GL11.glRotatef(10F, 1f, 0f, 0f);
                GL11.glRotatef(-190F, 0f, 1f, 0f);
                GL11.glRotatef(0F, 0f, 0f, 1f);
                GL11.glScaled(0.65F, 0.65F, 0.65f);
            } else if (model instanceof com.paneedah.mwc.models.LPscope) {
                GL11.glScaled(0F, 0F, 0F);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof com.paneedah.mwc.models.HP) {
                GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
            } else if (model instanceof com.paneedah.mwc.models.LPscope) {
                GL11.glScaled(0F, 0F, 0F);
            }
        })

        .withFirstPersonHandPositioning(
                c -> {
                    GL11.glScalef(0F, 0F, 0F);
                    // GL11.glRotatef(190F, 1f, 0f, 0f);
                    // GL11.glRotatef(10F, 0f, 1f, 0f);
                    // GL11.glRotatef(30F, 0f, 0f, 1f);
                    // GL11.glTranslatef(0.1F, -1.75F, 0F);
                },
                c -> {
                    GL11.glScalef(0F, 0F, 0F);
                    // GL11.glRotatef(190F, 1f, 0f, 0f);
                    // GL11.glRotatef(0F, 0f, 1f, 0f);
                    // GL11.glRotatef(-10F, 0f, 0f, 1f);
                    // GL11.glTranslatef(-0.15F, -0.4F, 0.4F);
                }
                )

        .build(MWC.modContext);


        new ItemHandheld.Builder<>()
        .withScreenPerspectiveType(GasDetectorScreenPerspective.class)
        .withScreenPositioning((p, s) -> {
            float scale = 1.9f;
            GL11.glScalef(scale, scale / MWC.modContext.getAspectRatio(), scale);
            GL11.glTranslatef(0.017f, 0.16f, 0.17f);
        })
        .withCreativeTab(MWC.GADGETS_TAB)
        .withCrosshair("HP")
        .withModel(new GasDetector(), "gasdetector.png")
        .withFirstPersonPositioning((player, itemStack) -> {
            GL11.glScalef(4f, 4f, 4f);
            GL11.glRotatef(0.000000f, 1f, 0f, 0f);
            GL11.glRotatef(70.000000f, 0f, 1f, 0f);
            GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
            GL11.glTranslatef(-0.2f, 0.4f, -1.8f);
//            GL11.glTranslatef(-6.500000f, 1.575000f, -2.000000f);
//            GL11.glRotatef(15.000000f, 1f, 0f, 0f);
//            GL11.glRotatef(45.000000f, 0f, 1f, 0f);
//            GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
//            GL11.glTranslatef(-0.8f, 0.2f, -1.5f);
        })
        .withThirdPersonModelPositioning((model, itemStack) -> {
            if (model instanceof TabletModel) {
                GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(80F, 1f, 0f, 0f);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
            }
        }).withInventoryModelPositioning((model, itemStack) -> {
            if (model instanceof com.paneedah.mwc.models.HP) {
                GL11.glTranslatef(-0.6F, -0.6F, 0.6F);
                GL11.glRotatef(10F, 1f, 0f, 0f);
                GL11.glRotatef(-190F, 0f, 1f, 0f);
                GL11.glRotatef(0F, 0f, 0f, 1f);
                GL11.glScaled(0.65F, 0.65F, 0.65f);
            } else if (model instanceof com.paneedah.mwc.models.LPscope) {
                GL11.glScaled(0F, 0F, 0F);
            }
        }).withEntityModelPositioning((model, itemStack) -> {
            if (model instanceof com.paneedah.mwc.models.HP) {
                GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
            } else if (model instanceof com.paneedah.mwc.models.LPscope) {
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withFirstPersonHandPositioning(
                c -> {

                    GL11.glScaled(0f, 0f, 0f);
                },
                c -> {
                    GL11.glScalef(3.3f, 3.3f, 3.3f);
                    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                    GL11.glRotatef(-105.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(0.275000f, -0.425000f, 0.050000f);
//                    GL11.glRotatef(-180.000000f, 1f, 0f, 0f);
//                    GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
//                    GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
//                    GL11.glTranslatef(0f, -0.1f, 0.8f);
                })
        .withName("gas-detector")

        .withTextureName("Dummy.png")
        .build(MWC.modContext);
    }
}
