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

import java.util.function.BiConsumer;

import static com.paneedah.mwc.MWC.CHANNEL;
import static com.paneedah.mwc.ProjectConstants.LOGGER;

@NoArgsConstructor
public final class PermitMessageServerHandler implements IMessageHandler<PermitMessage, IMessage> {

    @Override
    public IMessage onMessage(final PermitMessage permitMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final Permit<?> permit = permitMessage.getPermit();
            final PlayerItemInstance<?> playerItemInstance = permitMessage.getPlayerItemInstance();

            playerItemInstance.setPlayer(messageContext.getServerHandler().player);

            final BiConsumer<Permit<?>, PlayerItemInstance<?>> evaluator = ((ClientModContext) MWC.modContext).getPermitManager().getPermitEvaluators().get(permit.getClass());
            if (evaluator != null) {
                evaluator.accept(permit, playerItemInstance);
            } else {
                LOGGER.warn("No evaluator registered for permit {}", permit);
            }

            final PermitMessage message = new PermitMessage(permit, playerItemInstance);
            CHANNEL.sendTo(message, messageContext.getServerHandler().player);
        });

        return null;
    }
}
