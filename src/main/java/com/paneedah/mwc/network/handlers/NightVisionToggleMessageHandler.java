package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.NightVisionToggleMessage;
import com.paneedah.weaponlib.CustomArmor;
import dev.redstudio.redcore.utils.NetworkUtil;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public final class NightVisionToggleMessageHandler implements IMessageHandler<NightVisionToggleMessage, IMessage> {

    public static final String TAG_NIGHT_VISION_STATE = "nightVisionState";

    @Override
    public IMessage onMessage(final NightVisionToggleMessage nightVisionToggleMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final ItemStack helmetStack = messageContext.getServerHandler().player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);

            if (helmetStack.getItem() instanceof CustomArmor && ((CustomArmor) helmetStack.getItem()).hasNightVision()) {
                if (helmetStack.getTagCompound() == null)
                    helmetStack.setTagCompound(new NBTTagCompound());

                final NBTTagCompound tagCompound = helmetStack.getTagCompound();

                tagCompound.setBoolean(TAG_NIGHT_VISION_STATE, !tagCompound.getBoolean(TAG_NIGHT_VISION_STATE));
            }
        });


        return null;
    }
}
