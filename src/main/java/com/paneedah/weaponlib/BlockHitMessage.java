package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleEnumFacing;
import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.BlockPos;

public class BlockHitMessage implements CompatibleMessage {
	private BlockPos blockPos;
	private double posX, posY, posZ;
	/*
    private int posX;
    private int posY;
    private int posZ;
    */
    private int enumFacing;

    public BlockHitMessage() {}

    public BlockHitMessage(BlockPos pos, double x, double y, double z, CompatibleEnumFacing enumFacing) {
       this.blockPos = pos;
       this.posX = x; 
       this.posY = y;
       this.posZ = z;
        this.enumFacing = enumFacing.ordinal();
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
        enumFacing = buf.readInt();
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
        buf.writeInt(enumFacing);
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
    
    public CompatibleEnumFacing getSideHit() {
        return CompatibleEnumFacing.values()[enumFacing];
    }
}
