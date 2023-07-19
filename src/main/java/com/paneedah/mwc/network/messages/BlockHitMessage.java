package com.paneedah.mwc.network.messages;

import com.paneedah.mwc.network.NetworkUtil;
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
    private Vector3F position;
    private EnumFacing enumFacing;

    public void fromBytes(final ByteBuf byteBuf) {
    	blockPos = BlockPos.fromLong(byteBuf.readLong());
        position = NetworkUtil.readVector3F(byteBuf);
        enumFacing = EnumFacing.byIndex(byteBuf.readInt());
    }

    public void toBytes(final ByteBuf byteBuf) {
    	byteBuf.writeLong(this.blockPos.toLong());
        NetworkUtil.writeVector3F(byteBuf, position);
        byteBuf.writeInt(enumFacing.getIndex());
    }
}
