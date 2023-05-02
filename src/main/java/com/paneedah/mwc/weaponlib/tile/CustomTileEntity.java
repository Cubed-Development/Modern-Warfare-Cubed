package com.paneedah.mwc.weaponlib.tile;

import com.paneedah.mwc.weaponlib.Configurable;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleBlockPos;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleTileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.world.World;

public class CustomTileEntity<T extends CustomTileEntityConfiguration<T>> extends CompatibleTileEntity implements Configurable<T> {
    
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

    public void onEntityBlockActivated(World world, CompatibleBlockPos pos, EntityPlayer player) {
    }
    
    @Override
    public void readFromNBT(NBTTagCompound tagCompound) {
        super.readFromNBT(tagCompound);
        side = tagCompound.getInteger(TAG_SIDE);
    }
    
    @Override
    public NBTTagCompound compatibleWriteToNBT(NBTTagCompound tagCompound) {
        super.compatibleWriteToNBT(tagCompound);
        tagCompound.setInteger(TAG_SIDE, side);
        return tagCompound;
    }
    
    @Override
    public void onDataPacket(NetworkManager net, NBTTagCompound tagCompound) {
        this.readFromNBT(tagCompound);
    }
    
    
//    @Override
//    public Packet<?> getCompatibleUpdatePacket() {
//        NBTTagCompound tagCompound = new NBTTagCompound();
//        writeToNBT(tagCompound);
//        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, tagCompound);
//    }
}
