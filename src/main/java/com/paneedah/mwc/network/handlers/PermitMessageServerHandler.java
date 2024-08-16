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

import java.util.function.BiConsumer;

import static com.paneedah.mwc.MWC.CHANNEL;
import static com.paneedah.mwc.utils.ModReference.LOG;

@NoArgsConstructor
@AllArgsConstructor
public final class PermitMessageServerHandler implements IMessageHandler<PermitMessage, IMessage> {

    private CommonModContext commonModContext;

    @Override
    public IMessage onMessage(final PermitMessage permitMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final Permit<?> permit = permitMessage.getPermit();
            final PlayerItemInstance<?> playerItemInstance = permitMessage.getPlayerItemInstance();

            playerItemInstance.setPlayer(messageContext.getServerHandler().player);

            final BiConsumer<Permit<?>, PlayerItemInstance<?>> evaluator = commonModContext.getPermitManager().getPermitEvaluators().get(permit.getClass());
            if (evaluator != null)
                evaluator.accept(permit, playerItemInstance);
            else
                LOG.warn("No evaluator registered for permit {}", permit);

            final PermitMessage message = new PermitMessage(permit, playerItemInstance);
            CHANNEL.sendTo(message, messageContext.getServerHandler().player);
        });

        return null;
    }
}
