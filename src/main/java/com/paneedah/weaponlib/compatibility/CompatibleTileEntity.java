package com.paneedah.weaponlib.compatibility;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

public class CompatibleTileEntity extends TileEntity {
   
    @Override
    public final NBTTagCompound writeToNBT(NBTTagCompound tagCompound) {
        return compatibleWriteToNBT(tagCompound);
    }
    
    public NBTTagCompound compatibleWriteToNBT(NBTTagCompound tagCompound) {
        return super.writeToNBT(tagCompound);
    }
    
    @Override
    public final void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        onDataPacket(net, pkt.getNbtCompound());
    }

    protected void onDataPacket(NetworkManager net, NBTTagCompound nbtCompound) {}
    
    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        return (SPacketUpdateTileEntity) getCompatibleUpdatePacket();
    }
    
    public Packet<?> getCompatibleUpdatePacket() {
        NBTTagCompound tagCompound = new NBTTagCompound();
        writeToNBT(tagCompound);
        return new SPacketUpdateTileEntity(this.pos, 1, tagCompound);
    }
    
    public BlockPos getCompatiblePos() {
        return new BlockPos(getPos());
    }
    
    @Override
    public NBTTagCompound getUpdateTag() {
        NBTTagCompound tagCompound = super.getUpdateTag();
        compatibleWriteToNBT(tagCompound);
        return tagCompound;
    }
}
