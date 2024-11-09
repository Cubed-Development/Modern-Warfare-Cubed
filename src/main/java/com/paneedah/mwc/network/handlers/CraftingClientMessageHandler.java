package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.CraftingClientMessage;
import com.paneedah.mwc.network.messages.CraftingServerMessage;
import com.paneedah.weaponlib.crafting.CraftingFileManager;
import dev.redstudio.redcore.utils.NetworkUtil;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.io.ByteArrayOutputStream;

import static com.paneedah.mwc.MWC.CHANNEL;
import static com.paneedah.mwc.proxies.ClientProxy.MC;

@NoArgsConstructor
public final class CraftingClientMessageHandler implements IMessageHandler<CraftingClientMessage, IMessage> {

    // Our "op-codes," which reduce the need for additional messages and allow us to execute more functions from one.
    public static final int RECEIVE_HASH = 0;
    public static final int RECEIVE_FILESTREAM = 1;

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final CraftingClientMessage craftingClientMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final int opCode = craftingClientMessage.getOpCode();
            final ByteArrayOutputStream fileStream = craftingClientMessage.getFileStream();

            if (opCode == RECEIVE_HASH) {
                // Check if we already have a file with this hash on our system
                boolean check = CraftingFileManager.getInstance().checkFileHashAndLoad(fileStream.toByteArray());
                if (!check) {
                    // Tell the server that we need the file data.
                    CHANNEL.sendToServer(new CraftingServerMessage(MC.player.getEntityId()));
                }
            } else if (opCode == RECEIVE_FILESTREAM) {
                // We have gotten the file, save it to disk and load it.
                CraftingFileManager.getInstance().saveCacheAndLoad(craftingClientMessage.getFileStream());
            }
        });

        return null;
    }
}
