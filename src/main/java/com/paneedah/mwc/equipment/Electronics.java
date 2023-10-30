package com.paneedah.mwc.equipment;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.weapons.GasDetector;
import com.paneedah.weaponlib.ItemAttachment;
import com.paneedah.weaponlib.electronics.ItemHandheld;
import com.paneedah.weaponlib.electronics.ItemTablet;
import com.paneedah.weaponlib.electronics.ItemWirelessCamera;
import com.paneedah.weaponlib.model.CameraModel;
import com.paneedah.weaponlib.model.TabletModel;
import com.paneedah.mwc.rendering.perspective.GasDetectorScreenPerspective;
import org.lwjgl.opengl.GL11;

public class Electronics {

    public static ItemAttachment<Object> Tablet;

    public static void init() {
        Tablet = new ItemTablet.Builder<>()
                .withViewfinderPositioning(() -> {
                    float scale = 5.9f;
                    GL11.glScalef(scale, scale / MWC.modContext.getAspectRatio(), scale);
                    GL11.glTranslatef(-0.12f, 0.56f, 0.01f);
                })
                .withCrosshair("HP")
                .withModel(new TabletModel(), "IPad.png")
                //.withModel(new com.paneedah.mwc.models.weapons.LPscope(), "HP2.png")
                .withName("tablet")

                .build();

        new ItemWirelessCamera.Builder()
                .withName("wcam")
                .withModel(new CameraModel(), "gun")
                .build(MWC.modContext);

        new ItemHandheld.Builder<>()
                .withScreenPerspectiveType(new GasDetectorScreenPerspective())
                .withScreenPositioning(() -> {
                    float scale = 1.9f;
                    GL11.glScalef(scale, scale / MWC.modContext.getAspectRatio(), scale);
                    GL11.glTranslatef(0.017f, 0.16f, 0.17f);
                })
                .withCrosshair("HP")
                .withModel(new GasDetector(), "gasdetector.png")
                .withName("gas-detector")


                .build();
    }
}
