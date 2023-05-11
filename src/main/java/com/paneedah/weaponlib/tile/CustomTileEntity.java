package com.paneedah.weaponlib.tile;

import com.paneedah.weaponlib.Configurable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CustomTileEntity<T extends CustomTileEntityConfiguration<T>> extends TileEntity implements Configurable<T> {
    
    private static final String TAG_SIDE = "side";

    protected CustomTileEntityConfiguration<?> configuration;
    
    private int side;
    
    @SuppressWarnings("unchecked")
    private T safeCast(Object input) {
        return (T)input;
    }
    
    @Override
    public T getConfiguration() {
        if(configuration == null) {
            configuration = CustomTileEntityClassFactory.getInstance().getConfiguration(getClass());
        }
        return safeCast(configuration);
    }
    
    protected void setSide(int side) {
        this.side = side;
    }
    
    public int getSide() {
        return side;
    }

    public void onEntityBlockActivated(World world, BlockPos pos, EntityPlayer player) {
    }
    
    @Override
    public void readFromNBT(NBTTagCompound tagCompound) {
        super.readFromNBT(tagCompound);
        side = tagCompound.getInteger(TAG_SIDE);
    }
    
    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound tagCompound) {
        super.writeToNBT(tagCompound);
        tagCompound.setInteger(TAG_SIDE, side);
        return tagCompound;
    }
    
    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        this.readFromNBT(pkt.getNbtCompound());
    }
    
    
//    @Override
//    public Packet<?> getCompatibleUpdatePacket() {
//        NBTTagCompound tagCompound = new NBTTagCompound();
//        writeToNBT(tagCompound);
//        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, tagCompound);
//    }
}
