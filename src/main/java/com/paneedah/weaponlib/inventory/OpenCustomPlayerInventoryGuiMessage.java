package com.paneedah.weaponlib.inventory;

import com.paneedah.weaponlib.compatibility.IMessage;
import io.netty.buffer.ByteBuf;

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
