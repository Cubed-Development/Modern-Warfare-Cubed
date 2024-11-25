package com.paneedah.mwc.handlers;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.instancing.PlayerItemInstanceRegistry;
import net.minecraft.world.GameRules;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonEventHandler {

    @SubscribeEvent
    public static void onWorldLoadEvent(WorldEvent.Load worldLoadEvent) {
        worldLoadEvent.getWorld().getGameRules().addGameRule("reconcileAmmunition", "true", GameRules.ValueType.BOOLEAN_VALUE);
        // This is off by default since it seems to rollback attachments maybe something is not getting updated
        worldLoadEvent.getWorld().getGameRules().addGameRule("reconcileAttachments", "false", GameRules.ValueType.BOOLEAN_VALUE);
    }

    @SubscribeEvent
    public static void onWorldUnloadEvent(final WorldEvent.Unload worldUnloadEvent) {
        MWC.modContext.getPlayerItemInstanceRegistry().invalidateCache();
        MWC.modContext.getPlayerItemInstanceRegistry().clearRegistry();
    }
}
