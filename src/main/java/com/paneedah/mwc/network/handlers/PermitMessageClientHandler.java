package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.instancing.PlayerItemInstance;
import com.paneedah.mwc.network.messages.PermitMessage;
import com.paneedah.mwc.context.ClientModContext;
import com.paneedah.weaponlib.state.Permit;
import dev.redstudio.redcore.utils.NetworkUtil;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.function.BiConsumer;

import static com.paneedah.mwc.ProjectConstants.LOGGER;
import static com.paneedah.mwc.proxies.ClientProxy.MC;

@NoArgsConstructor
public final class PermitMessageClientHandler implements IMessageHandler<PermitMessage, IMessage> {

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final PermitMessage permitMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final Permit<?> permit = permitMessage.getPermit();
            final PlayerItemInstance<?> playerItemInstance = permitMessage.getPlayerItemInstance();

            playerItemInstance.setPlayer(MC.player);

            final BiConsumer<Permit<?>, PlayerItemInstance<?>> callback = MWC.modContext.getNetworkPermitManager().getPermitCallbacks().remove(permit.getUuid());
            if (callback != null) {
                callback.accept(permit, playerItemInstance);
            } else {
                LOGGER.warn("No callback registered for permit {}", permit);
            }
        });

        return null;
    }
}
