package com.paneedah.mwc.network.messages;

import com.paneedah.weaponlib.crafting.CraftingGroup;
import io.netty.buffer.ByteBuf;
import lombok.NoArgsConstructor;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@NoArgsConstructor
public final class WorkbenchServerMessage implements IMessage {

    public static final int CRAFT = 1;
    public static final int DISMANTLE = 2;
    public static final int MOVE_OUTPUT = 3;
    public static final int POP_FROM_QUEUE = 5;

    public int opCode;
    public BlockPos teLocation;
    public int craftingTimer;
    public int craftingDuration;
    public CraftingGroup craftingGroup;
    public String craftingName = "";
    public int playerID;
    public int slotToMove;
    public int quantity = -1;

    public WorkbenchServerMessage(final int type, final BlockPos location, final int playerID, final int slotToMove) {
        this.opCode = type;
        this.teLocation = location;
        this.playerID = playerID;
        this.slotToMove = slotToMove;
    }

    public WorkbenchServerMessage(final int type, final BlockPos location, final String nameToCraft, final CraftingGroup group, final int quantity) {
        this.opCode = type;
        this.teLocation = location;
        this.craftingName = nameToCraft;
        this.craftingGroup = group;
        this.quantity = quantity;
    }

    public WorkbenchServerMessage(final int type, final BlockPos location, final int craftingTimer, final int craftingDuration, final CraftingGroup group, final String nameToCraft) {
        this.opCode = type;
        this.teLocation = location;
        this.craftingTimer = craftingTimer;
        this.craftingDuration = craftingDuration;
        this.craftingGroup = group;
        this.craftingName = nameToCraft;
    }

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        this.opCode = byteBuf.readInt();
        this.teLocation = BlockPos.fromLong(byteBuf.readLong());

        if (this.opCode == CRAFT) {
            this.quantity = byteBuf.readInt();
            if (quantity == -1) {
                this.craftingTimer = byteBuf.readInt();
                this.craftingDuration = byteBuf.readInt();
            }
            this.craftingGroup = CraftingGroup.getValue(byteBuf.readInt());
            this.craftingName = ByteBufUtils.readUTF8String(byteBuf);
        } else if (this.opCode == MOVE_OUTPUT || this.opCode == POP_FROM_QUEUE) {
            this.playerID = byteBuf.readInt();
            this.slotToMove = byteBuf.readInt();
        } else if (this.opCode == DISMANTLE)
            this.craftingDuration = byteBuf.readInt();
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeInt(this.opCode);
        byteBuf.writeLong(this.teLocation.toLong());

        if (this.opCode == CRAFT) {
            byteBuf.writeInt(this.quantity);
            if (this.quantity == -1) {
                byteBuf.writeInt(this.craftingTimer);
                byteBuf.writeInt(this.craftingDuration);
            }
            byteBuf.writeInt(this.craftingGroup.getID());
            ByteBufUtils.writeUTF8String(byteBuf, this.craftingName);
        } else if (this.opCode == MOVE_OUTPUT || this.opCode == POP_FROM_QUEUE) {
            byteBuf.writeInt(this.playerID);
            byteBuf.writeInt(this.slotToMove);
        } else if (this.opCode == DISMANTLE)
            byteBuf.writeInt(this.craftingDuration);
    }
}
