package com.paneedah.mwc.network.messages;

import com.paneedah.weaponlib.crafting.base.TileEntityStation;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraft.client.Minecraft;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Getter
@NoArgsConstructor
public final class WorkbenchClientMessage implements IMessage {

    /**
     * This only exists on the server end, this variable will be null on the client end.
     * <p>
     * Use  instead.
     */
    private World world;

    private BlockPos position;

    @SideOnly(Side.CLIENT)
    private ByteBuf buffer;

    public WorkbenchClientMessage(final World world, final BlockPos position) {
        this.world = world;
        this.position = position;
    }

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        position = BlockPos.fromLong(byteBuf.readLong());

        buffer = byteBuf.copy();
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeLong(position.toLong());

        final TileEntity tileEntity = world.getTileEntity(position);
        if (tileEntity instanceof TileEntityStation) {
            ((TileEntityStation) tileEntity).writeBytesForClientSync(byteBuf);
        }
    }
}
