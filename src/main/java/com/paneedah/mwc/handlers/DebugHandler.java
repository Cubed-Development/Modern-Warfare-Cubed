package com.paneedah.mwc.handlers;

import com.paneedah.mwc.renderer.EquipmentModelPools;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.utils.ModReference.VERSION;

public class DebugHandler {

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onDebugList(RenderGameOverlayEvent.Text event) {
        if (MC.gameSettings.showDebugInfo) {
            ArrayList<String> debugScreenLeft = event.getLeft();

            debugScreenLeft.remove(4);
            debugScreenLeft.add(4, "T: " + MC.world.getDebugLoadedEntities());

            if (!debugScreenLeft.get(debugScreenLeft.size() - 1).equals("")) {
                debugScreenLeft.add("");
            }

            debugScreenLeft.add(String.format("%s<MWC>%s Modern Warfare Cubed version is %s.", TextFormatting.GOLD, TextFormatting.RESET, VERSION));
            debugScreenLeft.add("");
            debugScreenLeft.add(String.format("%s<MWC>%s Equipment model pool size: %s", TextFormatting.GOLD, TextFormatting.RESET, EquipmentModelPools.getSize()));
            debugScreenLeft.add(String.format("%s<MWC>%s Equipment equipped model pool size: %s", TextFormatting.GOLD, TextFormatting.RESET, EquipmentModelPools.getEquippedSize()));
            debugScreenLeft.add(String.format("%s<MWC>%s Equipment equipped armor model pool size: %s", TextFormatting.GOLD, TextFormatting.RESET, EquipmentModelPools.getEquippedArmorSize()));
        }
    }
}
