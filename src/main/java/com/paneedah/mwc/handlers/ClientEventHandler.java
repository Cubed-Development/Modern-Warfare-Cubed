package com.paneedah.mwc.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.utils.ModReference.ID;

@SideOnly(Side.CLIENT)
public class ClientEventHandler {

    @SubscribeEvent
    public static void onTextureStitch(TextureStitchEvent.Pre textureStitchEvent) {
        textureStitchEvent.getMap().registerSprite(new ResourceLocation(ID, "gui/inventory/empty_backpack_slot"));
        textureStitchEvent.getMap().registerSprite(new ResourceLocation(ID, "gui/inventory/empty_vest_slot"));
    }
}
