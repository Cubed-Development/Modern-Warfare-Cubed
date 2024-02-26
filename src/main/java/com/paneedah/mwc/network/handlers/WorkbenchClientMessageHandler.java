package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.WorkbenchClientMessage;
import com.paneedah.weaponlib.crafting.base.TileEntityStation;
import dev.redstudio.redcore.utils.NetworkUtil;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public final class WorkbenchClientMessageHandler implements IMessageHandler<WorkbenchClientMessage, IMessage> {

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final WorkbenchClientMessage workbenchClientMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final TileEntity tileEntity = MC.world.getTileEntity(workbenchClientMessage.getPosition());
            if (tileEntity instanceof TileEntityStation) {
                ((TileEntityStation) tileEntity).readBytesFromClientSync(workbenchClientMessage.getBuffer());
                ((TileEntityStation) tileEntity).pushInventoryRefresh = true;
            }
        });

        return null;
    }
}
