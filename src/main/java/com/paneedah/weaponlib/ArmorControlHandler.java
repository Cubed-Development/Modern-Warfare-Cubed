package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class ArmorControlHandler implements CompatibleMessageHandler<ArmorControlMessage, CompatibleMessage>  {

    public static final String TAG_NIGHT_VISION = "nv";

    //private double yOffset = 1;

    public ArmorControlHandler() {}

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(ArmorControlMessage message, CompatibleMessageContext ctx) {
        if (!ctx.isServerSide())
            return null;

        ctx.runInMainThread(() -> {
            if (!message.isToggleNightVision())
                return;

            EntityPlayer player = ctx.getPlayer();
            ItemStack helmetStack = compatibility.getHelmet(player);

            if(helmetStack != null && helmetStack.getItem() instanceof CustomArmor && ((CustomArmor)helmetStack.getItem()).hasNightVision()) {
                compatibility.ensureTagCompound(helmetStack);
                NBTTagCompound tagCompound = compatibility.getTagCompound(helmetStack);
                boolean nightVisionOn = tagCompound.getBoolean(TAG_NIGHT_VISION);
                tagCompound.setBoolean(TAG_NIGHT_VISION, !nightVisionOn);
            }
        });

        return null;
    }
}
