package com.paneedah.mwc.weaponlib;

import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class ArmorControlHandler implements CompatibleMessageHandler<ArmorControlMessage, CompatibleMessage>  {

    public static final String TAG_NIGHT_VISION = "nv";
    
    @SuppressWarnings("unused")
    private ModContext modContext;

    //private double yOffset = 1;

    public ArmorControlHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(ArmorControlMessage message, CompatibleMessageContext ctx) {
        if(ctx.isServerSide()) {
            ctx.runInMainThread(() -> {
                if(message.isToggleNightVision()) {
                    EntityPlayer player = ctx.getPlayer();
                    ItemStack helmetStack = compatibility.getHelmet(player);
                    if(helmetStack != null && helmetStack.getItem() instanceof CustomArmor 
                            && ((CustomArmor)helmetStack.getItem()).hasNightVision()) {
                        compatibility.ensureTagCompound(helmetStack);
                        NBTTagCompound tagCompound = compatibility.getTagCompound(helmetStack);
                        boolean nightVisionOn = tagCompound.getBoolean(TAG_NIGHT_VISION);
                        tagCompound.setBoolean(TAG_NIGHT_VISION, !nightVisionOn);
                    }
                }
            });
        }
        return null;
    }
}
