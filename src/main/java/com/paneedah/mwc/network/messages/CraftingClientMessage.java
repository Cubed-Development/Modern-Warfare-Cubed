package com.paneedah.mwc.network.messages;

import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static com.paneedah.mwc.utils.ModReference.RED_LOG;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CraftingClientMessage implements IMessage {

    private int opCode;
    private ByteArrayOutputStream fileStream;

    public void fromBytes(ByteBuf byteBuf) {
        final int size = byteBuf.readInt();
        try {
            byteBuf.readBytes(fileStream, size);
        } catch (IOException ioException) {
            RED_LOG.printFramedError("Networking", "Failed to read file stream for craft mappings", "Bad things will happen", ioException.getMessage());
        }
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeInt(opCode);
        byteBuf.writeBytes(fileStream.toByteArray());
    }
}
