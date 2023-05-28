package com.paneedah.weaponlib.inventory;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class OpenCustomPlayerInventoryGuiMessage implements IMessage {

    private int guiInventoryId;

    public OpenCustomPlayerInventoryGuiMessage() {}
    
    public OpenCustomPlayerInventoryGuiMessage(int inventoryId) {
        this.guiInventoryId = inventoryId;
    }

    public void fromBytes(ByteBuf buf) {
        guiInventoryId = buf.readInt();
    }

    public void toBytes(ByteBuf buf) {
        buf.writeInt(guiInventoryId);
    }
    
    public int getGuiInventoryId() {
        return guiInventoryId;
    }
}
