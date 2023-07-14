package com.paneedah.mwc.entities;

import com.paneedah.weaponlib.compatibility.CompatibleExtraEntityFlags;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;

public class PlayerUtils {

    public static void restorePlayerSpeed(EntityPlayer entityPlayer, AttributeModifier modifier) {
        if (entityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getModifier(modifier.getID()) != null)
            entityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(modifier);
    }

    public static void slowPlayerDown(EntityPlayer entityPlayer, AttributeModifier modifier) {
        if (entityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getModifier(modifier.getID()) == null)
            entityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(modifier);
    }

    public static boolean isProning(EntityPlayer player) {
        return (CompatibleExtraEntityFlags.getFlags(player) & CompatibleExtraEntityFlags.PRONING) != 0;
    }
}
