package com.paneedah.weaponlib.mission;

import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.Collection;

public class MissionOfferingSyncMessage implements CompatibleMessage {

    private Collection<MissionOffering> missionOfferings;

    public MissionOfferingSyncMessage() {
        this.missionOfferings = new ArrayList<>();
    }
    
    public MissionOfferingSyncMessage(Collection<MissionOffering> missionOfferings) {
        this.missionOfferings = missionOfferings;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        int missionCount = buf.readInt();
        for(int i = 0; i < missionCount; i++) {
            missionOfferings.add(TypeRegistry.getInstance().fromBytes(buf));
        }
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(missionOfferings.size());
        for(MissionOffering missionOffering: missionOfferings) {
            TypeRegistry.getInstance().toBytes(missionOffering, buf);
        }
    }
    
    protected Collection<MissionOffering> getMissionOfferings() {
        return missionOfferings;
    }
}
