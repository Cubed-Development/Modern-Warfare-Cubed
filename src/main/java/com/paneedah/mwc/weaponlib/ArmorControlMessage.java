package com.paneedah.mwc.weaponlib;

import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import io.netty.buffer.ByteBuf;

public class ArmorControlMessage implements CompatibleMessage {

    public static enum EntityAction { STOP }

    public static final int NIGHT_VISION_MASK = 0x01;
    
    private int toggles;

    public ArmorControlMessage() {}

    public ArmorControlMessage(boolean toggleNightVision) {
        this.toggles |= NIGHT_VISION_MASK;
    }

    public void fromBytes(ByteBuf buf) {
        toggles = buf.readInt();
    }

    public void toBytes(ByteBuf buf) {
        buf.writeInt(toggles);
    }

    public boolean isToggleNightVision() {
        return (toggles & NIGHT_VISION_MASK) == NIGHT_VISION_MASK;
    }
}
