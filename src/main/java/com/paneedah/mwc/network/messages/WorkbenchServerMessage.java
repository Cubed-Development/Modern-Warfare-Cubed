package com.paneedah.mwc.network.messages;

import com.paneedah.weaponlib.crafting.CraftingGroup;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
public final class WorkbenchServerMessage implements IMessage {

    public static final int CRAFT = 1;
    public static final int DISMANTLE = 2;
    public static final int MOVE_OUTPUT = 3;
    public static final int POP_FROM_QUEUE = 5;

    private int opCode;
    private BlockPos teLocation;
    private int craftingTimer;
    private int craftingDuration;
    private CraftingGroup craftingGroup;
    private String craftingName = "";
    private int playerID;
    private int slotToMove;
    private int quantity = -1;

    public WorkbenchServerMessage(final int type, final BlockPos location, final int playerID, final int slotToMove) {
        opCode = type;
        teLocation = location;
        this.playerID = playerID;
        this.slotToMove = slotToMove;
    }

    public WorkbenchServerMessage(final int type, final BlockPos location, final String nameToCraft, final CraftingGroup group, final int quantity) {
        opCode = type;
        teLocation = location;
        craftingName = nameToCraft;
        craftingGroup = group;
        this.quantity = quantity;
    }

    public WorkbenchServerMessage(final int type, final BlockPos location, final int craftingTimer, final int craftingDuration, final CraftingGroup group, final String nameToCraft) {
        opCode = type;
        teLocation = location;
        this.craftingTimer = craftingTimer;
        this.craftingDuration = craftingDuration;
        craftingGroup = group;
        craftingName = nameToCraft;
    }

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        opCode = byteBuf.readInt();
        teLocation = BlockPos.fromLong(byteBuf.readLong());

        if (opCode == CRAFT) {
            quantity = byteBuf.readInt();
            if (quantity == -1) {
                craftingTimer = byteBuf.readInt();
                craftingDuration = byteBuf.readInt();
            }
            craftingGroup = CraftingGroup.getValue(byteBuf.readInt());
            craftingName = ByteBufUtils.readUTF8String(byteBuf);
        } else if (opCode == MOVE_OUTPUT || opCode == POP_FROM_QUEUE) {
            playerID = byteBuf.readInt();
            slotToMove = byteBuf.readInt();
        } else if (opCode == DISMANTLE) {
            craftingDuration = byteBuf.readInt();
        }
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeInt(opCode);
        byteBuf.writeLong(teLocation.toLong());

        if (opCode == CRAFT) {
            byteBuf.writeInt(quantity);
            if (quantity == -1) {
                byteBuf.writeInt(craftingTimer);
                byteBuf.writeInt(craftingDuration);
            }
            byteBuf.writeInt(craftingGroup.getID());
            ByteBufUtils.writeUTF8String(byteBuf, craftingName);
        } else if (opCode == MOVE_OUTPUT || opCode == POP_FROM_QUEUE) {
            byteBuf.writeInt(playerID);
            byteBuf.writeInt(slotToMove);
        } else if (opCode == DISMANTLE) {
            byteBuf.writeInt(craftingDuration);
        }
    }
}
