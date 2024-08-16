package com.paneedah.mwc.network.messages;

import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static com.paneedah.mwc.ProjectConstants.RED_LOGGER;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class CraftingClientMessage implements IMessage {

    private int opCode;
    private ByteArrayOutputStream fileStream;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        final int size = byteBuf.readInt();
        try {
            byteBuf.readBytes(fileStream, size);
        } catch (IOException ioException) {
            RED_LOGGER.printFramedError("Networking", "Failed to read file stream for craft mappings", "Bad things will happen", ioException.getMessage());
        }
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeInt(opCode);
        byteBuf.writeBytes(fileStream.toByteArray());
    }
}
