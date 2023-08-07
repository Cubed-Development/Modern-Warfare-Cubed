package com.paneedah.mwc.handlers;

import net.minecraft.world.GameRules;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonEventHandler {

    @SubscribeEvent
    public static void onWorldLoadEvent(WorldEvent.Load worldLoadEvent) {
        worldLoadEvent.getWorld().getGameRules().addGameRule("reconcileAmmunition", "true", GameRules.ValueType.BOOLEAN_VALUE);
        worldLoadEvent.getWorld().getGameRules().addGameRule("reconcileAttachments", "true", GameRules.ValueType.BOOLEAN_VALUE);
    }
}
