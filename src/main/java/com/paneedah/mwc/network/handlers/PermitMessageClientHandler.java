package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.PermitMessage;
import com.paneedah.weaponlib.CommonModContext;
import com.paneedah.weaponlib.PlayerItemInstance;
import com.paneedah.weaponlib.state.Permit;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.function.BiConsumer;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.utils.ModReference.LOG;

@NoArgsConstructor
@AllArgsConstructor
public final class PermitMessageClientHandler implements IMessageHandler<PermitMessage, IMessage> {

    private CommonModContext commonModContext;

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final PermitMessage permitMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final Permit<?> permit = permitMessage.getPermit();
            final PlayerItemInstance<?> playerItemInstance = permitMessage.getPlayerItemInstance();

            playerItemInstance.setPlayer(MC.player);

            final BiConsumer<Permit<?>, PlayerItemInstance<?>> callback = commonModContext.getPermitManager().getPermitCallbacks().remove(permit.getUuid());
            if (callback != null)
                callback.accept(permit, playerItemInstance);
            else
                LOG.warn("No callback registered for permit {}", permit);
        });

        return null;
    }
}
