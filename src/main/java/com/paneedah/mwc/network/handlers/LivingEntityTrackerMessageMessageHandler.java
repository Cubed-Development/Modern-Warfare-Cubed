package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.LivingEntityTrackerMessage;
import com.paneedah.weaponlib.compatibility.CompatiblePlayerEntityTrackerProvider;
import dev.redstudio.redcore.utils.NetworkUtil;
import lombok.NoArgsConstructor;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@NoArgsConstructor
public final class LivingEntityTrackerMessageMessageHandler implements IMessageHandler<LivingEntityTrackerMessage, IMessage> {

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final LivingEntityTrackerMessage livingEntityTrackerMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            CompatiblePlayerEntityTrackerProvider.setTracker(MC.player, livingEntityTrackerMessage.getPlayerEntityTracker());

            if (livingEntityTrackerMessage.getStatusMessage() != null)
                MC.player.sendStatusMessage(new TextComponentString(livingEntityTrackerMessage.getStatusMessage()), true);
        });

        return null;
    }
}
