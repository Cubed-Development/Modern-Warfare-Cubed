package com.paneedah.mwc.network.messages;

import com.paneedah.mwc.network.CompressionUtil;
import com.paneedah.weaponlib.tracking.LivingEntityTracker;
import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class LivingEntityTrackerMessage implements IMessage {

    private LivingEntityTracker playerEntityTracker;
    private String statusMessage;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        playerEntityTracker = LivingEntityTracker.read(byteBuf);

        if (!byteBuf.readBoolean())
            return;

        byte[] bytes = new byte[byteBuf.readInt()];
        for (int i = 0; i < bytes.length; ++i)
            bytes[i] = byteBuf.readByte();

        statusMessage = CompressionUtil.decompressString(bytes);
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        playerEntityTracker.write(byteBuf);

        byteBuf.writeBoolean(statusMessage != null);
        if (statusMessage == null)
            return;

        final byte[] bytes = CompressionUtil.compressString(statusMessage);
        byteBuf.writeInt(bytes.length);
        byteBuf.writeBytes(bytes);
    }
}
