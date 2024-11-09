package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.BalancePackClientMessage;
import com.paneedah.weaponlib.config.BalancePackManager;
import dev.redstudio.redcore.utils.NetworkUtil;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public final class BalancePackClientMessageHandler implements IMessageHandler<BalancePackClientMessage, IMessage> {

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final BalancePackClientMessage balancePackClientMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> BalancePackManager.setCurrentBalancePack(balancePackClientMessage.getBalancePack()));

        return null;
    }
}
