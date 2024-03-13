package com.paneedah.mwc.network.messages;

import io.netty.buffer.ByteBuf;
import io.redstudioragnarok.redcore.vectors.Vector3F;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class BlockHitMessage implements IMessage {

	private BlockPos blockPos;
    private Vector3F position = new Vector3F();
    private EnumFacing enumFacing;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
    	blockPos = BlockPos.fromLong(byteBuf.readLong());
        position.read(byteBuf);
        enumFacing = EnumFacing.byIndex(byteBuf.readInt());
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
    	byteBuf.writeLong(this.blockPos.toLong());
        position.write(byteBuf);
        byteBuf.writeInt(enumFacing.getIndex());
    }
}
