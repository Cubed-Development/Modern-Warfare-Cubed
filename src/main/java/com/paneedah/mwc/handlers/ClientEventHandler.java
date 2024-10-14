package com.paneedah.mwc.handlers;

import com.paneedah.mwc.ClientTickerController;
import com.paneedah.mwc.MWC;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayDeque;
import java.util.Queue;

import static com.paneedah.mwc.equipment.inventory.EquipmentSlot.EMPTY_BACKPACK_SLOT_TEXTURE;
import static com.paneedah.mwc.equipment.inventory.EquipmentSlot.EMPTY_BELT_SLOT_TEXTURE;
import static com.paneedah.mwc.equipment.inventory.EquipmentSlot.EMPTY_VEST_SLOT_TEXTURE;
import static com.paneedah.mwc.proxies.ClientProxy.MC;

@SideOnly(Side.CLIENT)
public class ClientEventHandler {

    // TODO: This is a hack, more info on the hack page of the doc, it's named "Who let her cook" - Luna Lage (Desoroxxx) 2024-03-27
    public static final Queue<Item> COOKING_QUEUE = new ArrayDeque<>();

    private static boolean cooked = false;

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

    @SubscribeEvent
    public static void onRenderGameOverlayEvent(RenderGameOverlayEvent.Pre renderGameOverlayEvent) {
        if (cooked) {
            return;
        }

        if (COOKING_QUEUE.isEmpty()) {
            cooked = true;

            MWC.modContext.getPlayerItemInstanceRegistry().clearRegistry();
            MWC.modContext.getPlayerItemInstanceRegistry().invalidateCache();
        }

        for (int i = 0; i < 32 && !COOKING_QUEUE.isEmpty(); i++) { // We are limiting to 32 per frame to reduce "Minecraft is not responding"
            final Item item = COOKING_QUEUE.poll();

            if (item != null) {
                MC.getRenderItem().renderItem(new ItemStack(item), ItemCameraTransforms.TransformType.GUI);
            }
        }
    }
}
