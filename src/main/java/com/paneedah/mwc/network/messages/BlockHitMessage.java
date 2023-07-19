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
public class BlockHitMessage implements IMessage {

	private BlockPos blockPos;
    private Vector3F position;
    private EnumFacing enumFacing;

    public void fromBytes(ByteBuf byteBuf) {
    	blockPos = BlockPos.fromLong(byteBuf.readLong());
        position = new Vector3F(byteBuf.readFloat(), byteBuf.readFloat(), byteBuf.readFloat());
        enumFacing = EnumFacing.byIndex(byteBuf.readInt());
    }

    public void toBytes(ByteBuf buf) {
    	buf.writeLong(this.blockPos.toLong());
    	buf.writeFloat(position.x);
    	buf.writeFloat(position.y);
    	buf.writeFloat(position.z);
        buf.writeInt(enumFacing.getIndex());
    }
}
