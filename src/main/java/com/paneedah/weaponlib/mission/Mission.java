package com.paneedah.weaponlib.mission;

import com.paneedah.weaponlib.network.UniversalObject;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class Mission extends UniversalObject {

    private List<Goal> goals;
    private UUID missionOfferingId;
    private UUID assignerId;
    private boolean isRedeemed;
    private long startTime;
    private long maxDuration;
    private long redeemTime;
    
    public Mission() {
        this.goals = new ArrayList<>();
    }
    
    public Mission(UUID missionOfferingId, Entity assigner, long startTime, long maxDuration, Goal...goals) {
        this(missionOfferingId, assigner, startTime, maxDuration, Arrays.asList(goals));
    }
    
    public Mission(UUID missionOfferingId, Entity assigner, long startTime, long maxDuration, List<Goal> goals) {
        this.missionOfferingId = missionOfferingId;
        this.assignerId = assigner != null? assigner.getUniqueID() : new UUID(0L, 0L);
        this.goals = new ArrayList<>();
        for(Goal goal: goals) {
            this.goals.add(goal);
        }
        this.startTime = startTime;
        this.maxDuration = maxDuration;
    }
    
    public UUID getAssignerId() {
        return assignerId;
    }
    
    public Entity getAssigner(World world) {
        if(assignerId.getMostSignificantBits() == 0L && assignerId.getMostSignificantBits() == 0L) {
            return null;
        } else {
            return compatibility.getEntityByUuid(assignerId, world);
        }
    }
    
    public long getStartTime() {
        return startTime;
    }
    
    public long getMaxDuration() {
        return maxDuration;
    }
    
    public boolean isExpired(long currentWorldTime) {
        return currentWorldTime - startTime > maxDuration;
    }
    
    public boolean isCompleted(EntityPlayer player) {
        return this.isRedeemed || goals.stream().allMatch(g -> g.isCompleted(player));
    }
    
    public long getEndTime() {
        return isRedeemed ? redeemTime : startTime + maxDuration;
    }
    
    public boolean isRedeemed() {
        return isRedeemed;
    }
    
    public UUID getMissionOfferingId() {
        return missionOfferingId;
    }
    
    public List<Goal> getGoals() {
        return goals;
    }
    
    public void setRedeemed(long currentWorldTime) {
        this.isRedeemed = true;
        this.redeemTime = currentWorldTime;
    }
    
    public boolean update(Action action, EntityPlayer player) {
        boolean updated = false;
        for(Goal goal: goals) {
            updated = goal.update(action, player);
            if(updated) {
                /*
                 * A single action can be applied only to one goal at a time. 
                 */
                break;
            }
        }
        return updated;
    }
    
    @Override
    public void init(ByteBuf buf) {
        super.init(buf);
        missionOfferingId = new UUID(buf.readLong(), buf.readLong());
        assignerId = new UUID(buf.readLong(), buf.readLong());
        startTime = buf.readLong();
        maxDuration = buf.readLong();
        isRedeemed = buf.readBoolean();
        redeemTime = buf.readLong();
        int len = buf.readInt();
        for(int i = 0; i < len; i++) {
            Goal goal = new Goal();
            goal.init(buf);
            goals.add(goal);
        }
    }

    @Override
    public void serialize(ByteBuf buf) {
        super.serialize(buf);
        buf.writeLong(missionOfferingId.getMostSignificantBits());
        buf.writeLong(missionOfferingId.getLeastSignificantBits());
        buf.writeLong(assignerId.getMostSignificantBits());
        buf.writeLong(assignerId.getLeastSignificantBits());
        buf.writeLong(startTime);
        buf.writeLong(maxDuration);
        buf.writeBoolean(isRedeemed);
        buf.writeLong(redeemTime);
        buf.writeInt(goals.size());
        for(Goal goal: goals) {
            goal.serialize(buf);
        }
    }
    
}
