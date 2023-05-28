package com.paneedah.weaponlib;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class BlockHitMessage implements IMessage {
	private BlockPos blockPos;
	private double posX, posY, posZ;
	/*
    private int posX;
    private int posY;
    private int posZ;
    */
    private int enumFacingIndex;

    public BlockHitMessage() {}

    public BlockHitMessage(BlockPos pos, double x, double y, double z, EnumFacing enumFacing) {
       this.blockPos = pos;
       this.posX = x; 
       this.posY = y;
       this.posZ = z;
       this.enumFacingIndex = enumFacing.getIndex();
    }

    public void fromBytes(ByteBuf buf) {
    	blockPos = BlockPos.fromLong(buf.readLong());
    	posX = buf.readDouble();
    	posY = buf.readDouble();
    	posZ = buf.readDouble();
    	/*
        posX = buf.readInt();
        posY = buf.readInt();
        posZ = buf.readInt();
        */
        enumFacingIndex = buf.readInt();
    }

    public void toBytes(ByteBuf buf) {
    	buf.writeLong(this.blockPos.toLong());
    	buf.writeDouble(posX);
    	buf.writeDouble(posY);
    	buf.writeDouble(posZ);
    	/*
        buf.writeInt(posX);
        buf.writeInt(posY);
        buf.writeInt(posZ);
        */
        buf.writeInt(enumFacingIndex);
    }

    public BlockPos getBlockPos() {
    	return this.blockPos;
    }
    
    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double getPosZ() {
        return posZ;
    }
    
    public EnumFacing getSideHit() {
        return EnumFacing.byIndex(enumFacingIndex);
    }
}
