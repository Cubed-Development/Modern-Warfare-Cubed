package com.paneedah.mwc.network.messages;

import com.paneedah.mwc.utils.VectorUtil;
import dev.redstudio.redcore.math.vectors.Vector3D;
import io.netty.buffer.ByteBuf;
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
    private Vector3D position = new Vector3D();
    private EnumFacing enumFacing;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        blockPos = BlockPos.fromLong(byteBuf.readLong());
        VectorUtil.Networking.read(byteBuf, position);
        enumFacing = EnumFacing.byIndex(byteBuf.readInt());
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeLong(this.blockPos.toLong());
        VectorUtil.Networking.write(byteBuf, position);
        byteBuf.writeInt(enumFacing.getIndex());
    }
}
