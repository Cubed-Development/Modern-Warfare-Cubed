package com.paneedah.weaponlib.vehicle;

import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AccessibleVehicleGUI {

    public static void remotelySetModels(ModelBase key, ModelBase lock, ResourceLocation keyT, ResourceLocation lockT) {
        if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
            set(key, lock, keyT, lockT);
        }
        //

    }

    @SideOnly(Side.CLIENT)
    private static void set(ModelBase key, ModelBase lock, ResourceLocation keyT, ResourceLocation lockT) {
        VehicleCustomGUI.setLockAndKeyModels(key, lock, keyT, lockT);
    }


}
