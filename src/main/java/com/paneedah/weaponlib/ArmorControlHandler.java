package com.paneedah.weaponlib;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class ArmorControlHandler implements IMessageHandler<ArmorControlMessage, IMessage> {

    public static final String TAG_NIGHT_VISION = "nv";

    public ArmorControlHandler() {
    }

    @Override
    public IMessage onMessage(ArmorControlMessage message, MessageContext messageContext) {
        if(messageContext.side == Side.SERVER) {
            messageContext.getServerHandler().player.getServer().addScheduledTask(() -> {
                if(message.isToggleNightVision()) {
                    ItemStack helmetStack = messageContext.getServerHandler().player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
                    if(helmetStack != null && helmetStack.getItem() instanceof CustomArmor && ((CustomArmor) helmetStack.getItem()).hasNightVision()) {
                        if (helmetStack.getTagCompound() == null)
                            helmetStack.setTagCompound(new NBTTagCompound());
                        NBTTagCompound tagCompound = helmetStack.getTagCompound();
                        boolean nightVisionOn = tagCompound.getBoolean(TAG_NIGHT_VISION);
                        tagCompound.setBoolean(TAG_NIGHT_VISION, !nightVisionOn);
                    }
                }
            });
        }
        return null;
    }
}
