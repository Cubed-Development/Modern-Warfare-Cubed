package com.paneedah.mwc.handlers;

import com.paneedah.mwc.ClientTickerController;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.utils.ModReference.ID;

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
        textureStitchEvent.getMap().registerSprite(new ResourceLocation(ID, "gui/inventory/empty_backpack_slot"));
        textureStitchEvent.getMap().registerSprite(new ResourceLocation(ID, "gui/inventory/empty_vest_slot"));
    }
}
