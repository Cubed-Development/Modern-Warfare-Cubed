package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class ArmorControlHandler implements CompatibleMessageHandler<ArmorControlMessage, IMessage>  {

    public static final String TAG_NIGHT_VISION = "nv";
    
    @SuppressWarnings("unused")
    private ModContext modContext;

    //private double yOffset = 1;

    public ArmorControlHandler() {
    }

    public ArmorControlHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(ArmorControlMessage message, MessageContext messageContext) {
        if(messageContext.side == Side.SERVER) {
            compatibility.runInMainClientThread(() -> {
                if(message.isToggleNightVision()) {
                    EntityPlayer player = messageContext.getServerHandler().player;
                    ItemStack helmetStack = mc.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
                    if(helmetStack != null && helmetStack.getItem() instanceof CustomArmor && ((CustomArmor)helmetStack.getItem()).hasNightVision()) {
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
