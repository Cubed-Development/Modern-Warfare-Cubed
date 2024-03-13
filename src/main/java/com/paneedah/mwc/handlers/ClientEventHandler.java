package com.paneedah.mwc.handlers;

import com.paneedah.mwc.ClientTickerController;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.equipment.inventory.EquipmentSlot.EMPTY_BACKPACK_SLOT_TEXTURE;
import static com.paneedah.mwc.equipment.inventory.EquipmentSlot.EMPTY_BELT_SLOT_TEXTURE;
import static com.paneedah.mwc.equipment.inventory.EquipmentSlot.EMPTY_VEST_SLOT_TEXTURE;

@SideOnly(Side.CLIENT)
public class ClientEventHandler {

    @SubscribeEvent
    public static void onWorldLoadEvent(WorldEvent.Load worldLoadEvent) {
        ClientTickerController.start();
    }

    @SubscribeEvent
    public static void onWorldUnloadEvent(WorldEvent.Unload worldUnloadEvent) {
        ClientTickerController.stop();
    }

    @SubscribeEvent
    public static void onTextureStitch(TextureStitchEvent.Pre textureStitchEvent) {
        textureStitchEvent.getMap().registerSprite(EMPTY_BACKPACK_SLOT_TEXTURE);
        textureStitchEvent.getMap().registerSprite(EMPTY_BELT_SLOT_TEXTURE);
        textureStitchEvent.getMap().registerSprite(EMPTY_VEST_SLOT_TEXTURE);
    }
}
