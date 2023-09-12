package com.paneedah.mwc.handlers;

import com.paneedah.mwc.network.handlers.NightVisionToggleMessageHandler;
import com.paneedah.weaponlib.CustomArmor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.GameRules;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class CommonEventHandler {

    @SubscribeEvent
    public static void onWorldLoadEvent(WorldEvent.Load worldLoadEvent) {
        worldLoadEvent.getWorld().getGameRules().addGameRule("reconcileAmmunition", "true", GameRules.ValueType.BOOLEAN_VALUE);
        // This is off by default since it seems to rollback attachments maybe something is not getting updated
        worldLoadEvent.getWorld().getGameRules().addGameRule("reconcileAttachments", "false", GameRules.ValueType.BOOLEAN_VALUE);
    }

    @SubscribeEvent
    public static void onPlayerTickEvent(PlayerTickEvent playerTickEvent) {
        EntityPlayer player = playerTickEvent.player;
        ItemStack helmetStack = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        if (helmetStack.getItem() instanceof CustomArmor
            && ((CustomArmor) helmetStack.getItem()).hasNightVision()) {
            NBTTagCompound tagCompound = helmetStack.getTagCompound();
            boolean nightVisionOn = tagCompound != null && tagCompound.getBoolean(
                NightVisionToggleMessageHandler.TAG_NIGHT_VISION_STATE);
            if (nightVisionOn) {
                player.addPotionEffect(
                    new PotionEffect(MobEffects.NIGHT_VISION, 210, 0, true, false));
            } else {
                player.removePotionEffect(MobEffects.NIGHT_VISION);
            }
            ;
        }
    }
}
