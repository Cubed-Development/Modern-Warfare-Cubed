package com.paneedah.weaponlib.render;

import net.minecraft.util.ResourceLocation;

import static com.paneedah.mwc.utils.ModReference.ID;

public class QRL {

    public static ResourceLocation quickLoc(String folder, String name) {
        //new ResourceLocation(ID + ":textures/entity/vehicleshadow.png");
        return new ResourceLocation(ID + ":textures/" + folder + "/" + name + ".png");
    }

}
