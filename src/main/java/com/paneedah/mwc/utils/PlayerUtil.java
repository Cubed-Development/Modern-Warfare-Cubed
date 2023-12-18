package com.paneedah.mwc.utils;

import com.paneedah.weaponlib.compatibility.CompatibleExtraEntityFlags;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;

public final class PlayerUtil {

    public static void restorePlayerSpeed(final EntityPlayer entityPlayer, final AttributeModifier modifier) {
        if (entityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getModifier(modifier.getID()) != null)
            entityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(modifier);
    }

    public static void slowPlayerDown(final EntityPlayer entityPlayer, final AttributeModifier modifier) {
        if (entityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getModifier(modifier.getID()) == null)
            entityPlayer.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(modifier);
    }

    public static boolean isProning(final EntityPlayer player) {
        return (CompatibleExtraEntityFlags.getFlags(player) & CompatibleExtraEntityFlags.PRONING) != 0;
    }

    public static void setSize(final EntityPlayer entityPlayer, final float height) {
        if (height == entityPlayer.height)
            return;

        entityPlayer.height = height;

        AxisAlignedBB axisAlignedBB = entityPlayer.getEntityBoundingBox();

        entityPlayer.setEntityBoundingBox(new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.minX + entityPlayer.width, axisAlignedBB.minY + entityPlayer.height, axisAlignedBB.minZ + entityPlayer.width));
    }
}
