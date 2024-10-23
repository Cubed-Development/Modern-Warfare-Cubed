package com.paneedah.weaponlib.tile;

import com.paneedah.weaponlib.Configurable;
import lombok.Getter;
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

    @Getter
    private int side;


    private T safeCast(Object input) {
        return (T) input;
    }

    @Override
    public T getConfiguration() {
        if (configuration == null) {
            configuration = CustomTileEntityClassFactory.getInstance().getConfiguration(getClass());
        }
        return safeCast(configuration);
    }

    protected void setSide(int side) {
        this.side = side;
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
        readFromNBT(pkt.getNbtCompound());
    }

    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        NBTTagCompound tagCompound = new NBTTagCompound();
        writeToNBT(tagCompound);
        return new SPacketUpdateTileEntity(pos, 1, tagCompound);
    }

    @Override
    public NBTTagCompound getUpdateTag() {
        NBTTagCompound tagCompound = super.getUpdateTag();
        writeToNBT(tagCompound);
        return tagCompound;
    }

}
