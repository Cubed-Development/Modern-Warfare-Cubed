package com.paneedah.mwc.network.messages;

import com.paneedah.weaponlib.crafting.CraftingGroup;
import io.netty.buffer.ByteBuf;
import lombok.NoArgsConstructor;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@NoArgsConstructor
public final class WorkbenchMessage implements IMessage {

    public static final int CRAFT = 1;
    public static final int DISMANTLE = 2;
    public static final int MOVE_OUTPUT = 3;
    public static final int POP_FROM_QUEUE = 5;

    public int opcode;
    public BlockPos teLocation;
    public int craftingTimer;
    public int craftingDuration;
    public CraftingGroup craftingGroup;
    public String craftingName = "";
    public int playerID;
    public int slotToMove;
    public int quantity = -1;

    public WorkbenchMessage(int type, BlockPos location, String nameToCraft, CraftingGroup group, int quantity) {
        this.opcode = type;
        this.teLocation = location;
        this.craftingName = nameToCraft;
        this.craftingGroup = group;
        this.quantity = quantity;
    }

    public WorkbenchMessage(int type, BlockPos location, int craftingTimer, int craftingDuration, CraftingGroup group, String nameToCraft) {
        this.opcode = type;
        this.teLocation = location;
        this.craftingTimer = craftingTimer;
        this.craftingDuration = craftingDuration;
        this.craftingGroup = group;
        this.craftingName = nameToCraft;
    }

    public WorkbenchMessage(int type, BlockPos location, int playerID, int slotToMove) {
        this.opcode = type;
        this.teLocation = location;
        this.playerID = playerID;
        this.slotToMove = slotToMove;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.opcode = byteBuf.readInt();
        this.teLocation = BlockPos.fromLong(byteBuf.readLong());
        if (this.opcode == CRAFT) {
            this.quantity = byteBuf.readInt();
            if (quantity == -1) {
                this.craftingTimer = byteBuf.readInt();
                this.craftingDuration = byteBuf.readInt();
            }
            this.craftingGroup = CraftingGroup.getValue(byteBuf.readInt());
            this.craftingName = ByteBufUtils.readUTF8String(byteBuf);
        } else if (this.opcode == MOVE_OUTPUT || this.opcode == POP_FROM_QUEUE) {
            this.playerID = byteBuf.readInt();
            this.slotToMove = byteBuf.readInt();
        } else if (this.opcode == DISMANTLE) {
            this.craftingDuration = byteBuf.readInt();
        }
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeInt(this.opcode);
        byteBuf.writeLong(this.teLocation.toLong());
        if (this.opcode == CRAFT) {
            byteBuf.writeInt(this.quantity);
            if (this.quantity == -1) {
                byteBuf.writeInt(this.craftingTimer);
                byteBuf.writeInt(this.craftingDuration);
            }
            byteBuf.writeInt(this.craftingGroup.getID());
            ByteBufUtils.writeUTF8String(byteBuf, this.craftingName);
        } else if (this.opcode == MOVE_OUTPUT || this.opcode == POP_FROM_QUEUE) {
            byteBuf.writeInt(this.playerID);
            byteBuf.writeInt(this.slotToMove);
        } else if (this.opcode == DISMANTLE) {
            byteBuf.writeInt(this.craftingDuration);
        }
    }
}
