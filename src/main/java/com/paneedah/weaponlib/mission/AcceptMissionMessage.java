package com.paneedah.weaponlib.mission;

import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import io.netty.buffer.ByteBuf;

import java.util.UUID;

public class AcceptMissionMessage implements CompatibleMessage {
    
    public static enum Action {
        ASSIGN, REDEEM
    }

    private UUID missionOfferingId;
    private int assignerEntityId;
    private Action action;
    
    public AcceptMissionMessage() {}
    
    public AcceptMissionMessage(MissionAssigner assigner, MissionOffering missionOffering, Action action) {
        this.missionOfferingId = missionOffering.getId();
        this.assignerEntityId = assigner.getEntityId();
        this.action = action;
    }

    public void fromBytes(ByteBuf buf) {
        action = Action.values()[buf.readInt()];
        assignerEntityId = buf.readInt();
        missionOfferingId = new UUID(buf.readLong(), buf.readLong());
    }

    public void toBytes(ByteBuf buf) {
        buf.writeInt(action.ordinal());
        buf.writeInt(assignerEntityId);
        buf.writeLong(missionOfferingId.getMostSignificantBits());
        buf.writeLong(missionOfferingId.getLeastSignificantBits());
    }
    
    public int getAssignerEntityId() {
        return assignerEntityId;
    }
    
    public UUID getMissionOfferingId() {
        return missionOfferingId;
    }
    
    public Action getAction() {
        return action;
    }
}
