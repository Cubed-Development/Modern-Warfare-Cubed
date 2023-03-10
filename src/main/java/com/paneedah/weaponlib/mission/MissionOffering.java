package com.paneedah.weaponlib.mission;

import com.google.gson.*;
import com.paneedah.weaponlib.compatibility.CompatibleMissionCapability;
import com.paneedah.weaponlib.network.TypeRegistry;
import com.paneedah.weaponlib.network.UniversallySerializable;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.JsonUtils;

import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Collectors;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class MissionOffering implements UniversallySerializable {
    
    public static class Deserializer implements JsonDeserializer<MissionOffering> {
        
        
        public Deserializer() {
        }

        @Override
        public MissionOffering deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context)
                throws JsonParseException {
            
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            String missionName = JsonUtils.getString(jsonObject, "name");  
            Builder builder = new Builder(missionName);
            
            
            String missionDescription = JsonUtils.getString(jsonObject, "description");
            builder.withMissionDescription(missionDescription);
            String levelName = JsonUtils.getString(jsonObject, "level");            
            builder.withLevel(Level.valueOf(levelName.toUpperCase()));
            
            JsonArray requiresAllArray = JsonUtils.getJsonArray(jsonObject, "requiresAll", new JsonArray());
            List<String> requiresAll = new ArrayList<>();
            for (JsonElement requiresAllElement : requiresAllArray) {
                requiresAll.add(requiresAllElement.getAsString());
                
            }
            builder.requiresAll(requiresAll.toArray(new String[0]));
            
            JsonArray requiresAnyArray = JsonUtils.getJsonArray(jsonObject, "requiresAny", new JsonArray());
            if(requiresAnyArray.size() > 0 && requiresAllArray.size() > 0) {
                throw new IllegalArgumentException("Cannot use both requiresAll and requiresAny at the same time");
            }
            
            List<String> requiresAny = new ArrayList<>();
            for (JsonElement requiresAnyElement : requiresAnyArray) {
                requiresAny.add(requiresAnyElement.getAsString());
            }
            builder.requiresAny(requiresAny.toArray(new String[0]));
            
            int cooldownTime = JsonUtils.getInt(jsonObject, "cooldownTime", DEFAULT_COOLDOWN_TIME);
            builder.withCooldownTime(cooldownTime);
            
            int maxDuration = JsonUtils.getInt(jsonObject, "maxDuration", DEFAULT_MAX_DURATION);
            builder.withMaxDuration(maxDuration);
            
            boolean allowConcurrent = JsonUtils.getBoolean(jsonObject, "allowConcurrent", false);
            if(allowConcurrent) {
                builder.allowConcurrent();
            }
            
            JsonArray goalsArray = JsonUtils.getJsonArray(jsonObject, "goals", new JsonArray());
            for (JsonElement goalElement : goalsArray) {
                Goal goal = context.deserialize(goalElement, Goal.class);
                builder.withGoal(goal.getRequiredAction(), goal.getQuantity());
            }
            
            JsonArray rewardsArray = JsonUtils.getJsonArray(jsonObject, "rewards", new JsonArray());
            for (JsonElement rewardElement : rewardsArray) {
                MissionReward reward = context.deserialize(rewardElement, MissionReward.class);
                builder.withReward(reward);
            }
            
            return builder.build();
        }
    }
    
    public static final int DEFAULT_MAX_DURATION = 24000 * 30;
    public static final int DEFAULT_COOLDOWN_TIME = 24000 * 1000;
    
    private static Map<String, MissionOffering> allOfferings = new HashMap<>();
    private static Map<UUID, MissionOffering> allOfferingsById = new HashMap<>();
    
    private static void registerOffering(MissionOffering offering) {
        allOfferings.put(offering.getMissionName(), offering);
        allOfferingsById.put(offering.getId(), offering);
    }
    
    public static MissionOffering getOffering(UUID offeringId) {
        return allOfferingsById.get(offeringId);
    }
    
    public static enum Level {
        EASY,
        MEDIUM,
        HARD
    }
    
    public static interface Requirement extends UniversallySerializable {
        public boolean isSatisfied(EntityPlayer player);
    }
    
    public static class NoRequirement implements Requirement {

        @Override
        public boolean isSatisfied(EntityPlayer player) {
            return true;
        }

        @Override
        public void init(ByteBuf buf) {
        }

        @Override
        public void serialize(ByteBuf buf) {
        }
    }
    
    public static class CooldownMissionRequirement implements Requirement {
        
        private long cooldownTime;
        private UUID parentMissionOfferingId;
        
        public CooldownMissionRequirement() {}
        
        public CooldownMissionRequirement(UUID parentMissionOfferingId, long cooldownTime) {
            this.cooldownTime = cooldownTime;
            this.parentMissionOfferingId = parentMissionOfferingId;
        }

        @Override
        public boolean isSatisfied(EntityPlayer player) {
            Set<Mission> missions = CompatibleMissionCapability.getMissions(player);
            
            boolean isSatisfied = true;
            isSatisfied &= missions.stream().allMatch(m -> 
                !m.getMissionOfferingId().equals(this.parentMissionOfferingId)
                ||(m.getEndTime() + this.cooldownTime < compatibility.world(player).getTotalWorldTime()));
            return isSatisfied;
        }

        @Override
        public void init(ByteBuf buf) {
            parentMissionOfferingId = new UUID(buf.readLong(), buf.readLong());
            cooldownTime = buf.readLong();
        }

        @Override
        public void serialize(ByteBuf buf) {
            buf.writeLong(parentMissionOfferingId.getMostSignificantBits());
            buf.writeLong(parentMissionOfferingId.getLeastSignificantBits());
            buf.writeLong(cooldownTime);
        }
    }
    
    public static class NoMissionsInProgressRequirement implements Requirement {

        @Override
        public boolean isSatisfied(EntityPlayer player) {
            Set<Mission> missions = CompatibleMissionCapability.getMissions(player);
            return missions.stream().allMatch(m -> m.isCompleted(player) 
                    || m.isExpired(compatibility.world(player).getTotalWorldTime()));
        }

        @Override
        public void init(ByteBuf buf) {
            
        }

        @Override
        public void serialize(ByteBuf buf) {
            
        }
        
    }
    
    public static class CompositeRequirement implements Requirement {
        
        private Collection<Requirement> requirements;
        
        public CompositeRequirement() {
            this.requirements = new ArrayList<>();
        }

        @Override
        public boolean isSatisfied(EntityPlayer player) {
            return requirements.stream().allMatch(r -> r.isSatisfied(player));
        }
        
        public void init(ByteBuf buf) {
            int count = buf.readInt();
            for(int i = 0; i < count; i++) {
                requirements.add(TypeRegistry.getInstance().fromBytes(buf));
            }
        }
        
        public void serialize(ByteBuf buf) {
            buf.writeInt(requirements.size());
            for(Requirement requirement: requirements) {
                TypeRegistry.getInstance().toBytes(requirement, buf);
            }
        }
    }
    
    public static class CompletedMissionRequirement implements Requirement {
        private boolean all;
        private Collection<String> requiredMissionNames;
        
        public CompletedMissionRequirement() {
            this.requiredMissionNames = new ArrayList<>();
        }
        
        private CompletedMissionRequirement(Collection<String> requiredMissionNames, boolean all) {
            this.all = all;
            this.requiredMissionNames = Collections.unmodifiableCollection(requiredMissionNames);
        }

        @Override
        public boolean isSatisfied(EntityPlayer player) {
            Set<Mission> missions = CompatibleMissionCapability.getMissions(player);
            
            boolean completed = true;
            for(String requiredMissionName: requiredMissionNames) {
                MissionOffering offering = allOfferings.get(requiredMissionName);
                if(offering != null) {
                    Mission matchingMission = null;
                    for(Mission mission: missions) {
                        if(mission.getMissionOfferingId().equals(offering.getId())) {
                            matchingMission = mission;
                            break;
                        }
                    }
                    completed &= matchingMission != null && matchingMission.isCompleted(player)
                            && !matchingMission.isExpired(compatibility.world(player).getTotalWorldTime());
                    if(completed && !all) {
                        break;
                    }
                } else {
                    System.err.print("Invalid mission name: " + requiredMissionName);
                }
                
            }
            return completed;
        }

        @Override
        public void init(ByteBuf buf) {
            all = buf.readBoolean();
            int count = buf.readInt();
            for(int i = 0; i < count; i++) {
                int strLen = buf.readInt();
                byte[] nameBytes = new byte[strLen];
                buf.readBytes(nameBytes);
                requiredMissionNames.add(new String(nameBytes));
            }
        }

        @Override
        public void serialize(ByteBuf buf) {
            buf.writeBoolean(all);
            buf.writeInt(requiredMissionNames.size());
            for(String missionName: requiredMissionNames) {
                byte[] nameBytes = missionName.getBytes(Charset.defaultCharset());
                buf.writeInt(nameBytes.length);
                buf.writeBytes(nameBytes);
            }
            
        }
    }

    public static class Builder {
        
        private static final String SHA1PRNG_ALG = "SHA1PRNG";
        
        private UUID id;
        private String missionName;
        private String missionDescription = "";
        private Level level = Level.EASY;
        private List<Goal> goals = new ArrayList<>();
        private List<MissionReward> rewards = new ArrayList<>();

        private long cooldownTime = DEFAULT_COOLDOWN_TIME;
        private boolean isConcurrent;
        private CompositeRequirement requirement = new CompositeRequirement();
        private long maxDuration = DEFAULT_MAX_DURATION;

        public Builder(String missionName) {
            this.missionName = missionName;
        }
        
        private static UUID getUuid(String seed) {
            try {
                SecureRandom random = SecureRandom.getInstance(SHA1PRNG_ALG);
                random.setSeed(seed.getBytes());
                return new UUID(random.nextLong(), random.nextLong());
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("Cannot generate unique id", e);
            }
        }
        
        public Builder withMissionDescription(String missionDescription) {
            this.missionDescription = missionDescription;
            return this;
        }
        
        public Builder withLevel(Level level) {
            this.level = level;
            return this;
        }
        
        public Builder withGoal(Action action, int quantity) {
            goals.add(new Goal(action, quantity));
            return this;
        }
        
        public Builder withReward(MissionReward reward) {
            rewards.add(reward);
            return this;
        }
        
        public Builder withReward(Item item) {
            rewards.add(new MissionReward.ItemReward(item, 1));
            return this;
        }
        
        public Builder withReward(Item item, int count) {
            rewards.add(new MissionReward.ItemReward(item, count));
            return this;
        }
        
        public Builder requiresAny(String...requiredMissionNames) {
            this.requirement.requirements.add(new CompletedMissionRequirement(Arrays.asList(requiredMissionNames), false));
            return this;
        }
        
        public Builder requiresAll(String...requiredMissionNames) {
            this.requirement.requirements.add(new CompletedMissionRequirement(Arrays.asList(requiredMissionNames), true));
            return this;
        }
        
        public Builder withCooldownTime(int cooldownTime) {
            this.cooldownTime = cooldownTime;
            return this;
        }
        
        public Builder allowConcurrent() {
            this.isConcurrent = true;
            return this;
        }
        
        public Builder withMaxDuration(long maxDuration) {
            this.maxDuration = maxDuration;
            return this;
        }
        
        public MissionOffering build() {
            id = getUuid(missionName);
            if(!isConcurrent) {
                this.requirement.requirements.add(new NoMissionsInProgressRequirement());
            }
            
            MissionOffering offering = new MissionOffering();
            offering.id = id;
            offering.missionName = missionName;
            offering.missionDescription = missionDescription;
            offering.level = level;
            offering.goals = goals;
            offering.rewards = rewards;

            offering.cooldownTime = cooldownTime;
//            offering.isConcurrent = isConcurrent;
            offering.requirement = requirement;
            offering.maxDuration = maxDuration;
            
            this.requirement.requirements.add(new CooldownMissionRequirement(offering.getId(), cooldownTime));
            registerOffering(offering);
            return offering;
        }
    }
    
//    private Builder builder;
    
    private UUID id;
    private String missionName;
    private String missionDescription = "";
    private Level level = Level.EASY;
    private List<Goal> goals = new ArrayList<>();
    private List<MissionReward> rewards = new ArrayList<>();

    private long cooldownTime = DEFAULT_COOLDOWN_TIME;
//    private boolean isConcurrent;
    private CompositeRequirement requirement = new CompositeRequirement();
    private long maxDuration = DEFAULT_MAX_DURATION;
    
    public MissionOffering() {
    }
    
    public UUID getId() {
        return id;
    }
    
    public String getMissionName() {
        return missionName;
    }

    public String getMissionDescription() {
        return missionDescription;
    }

    public Level getLevel() {
        return level;
    }

    public List<MissionReward> getRewards() {
        return rewards;
    }

    public List<Goal> createGoals() {
        return goals.stream().map(s -> new Goal(s.getRequiredAction(), s.getQuantity())).collect(Collectors.toList());
    }
    
//    public Requirement getRequirement() {
//        return builder.requirement;
//    }
    
    public boolean isAvailableFor(EntityPlayer player) {
        return requirement.isSatisfied(player);
    }

    public long getMaxDuration() {
        return maxDuration;
    }
    
    public long getCooldownTime() {
        return cooldownTime;
    }
    
    @Override
    public void init(ByteBuf buf) {
        id = new UUID(buf.readLong(), buf.readLong());

        int nameBytesLen = buf.readInt();
        byte[] nameBytes = new byte[nameBytesLen];
        buf.readBytes(nameBytes);
        missionName = new String(nameBytes);
        
        int descriptionBytesLen = buf.readInt();
        byte[] descriptionBytes = new byte[descriptionBytesLen];
        buf.readBytes(descriptionBytes);
        missionDescription = new String(descriptionBytes);
        
        level = Level.values()[buf.readInt()];
        
        TypeRegistry typeRegistry = TypeRegistry.getInstance();
        requirement = typeRegistry.fromBytes(buf);
        
        int goalCount = buf.readInt();
        for(int i = 0; i < goalCount; i++) {
            goals.add(typeRegistry.fromBytes(buf));
        }
        
        int rewardCount = buf.readInt();
        for(int i = 0; i < rewardCount; i++) {
            rewards.add(typeRegistry.fromBytes(buf));
        }
    }

    @Override
    public void serialize(ByteBuf buf) {
        
        buf.writeLong(id.getMostSignificantBits());
        buf.writeLong(id.getLeastSignificantBits());
        
        byte[] nameBytes = missionName.getBytes(Charset.defaultCharset());
        buf.writeInt(nameBytes.length);
        buf.writeBytes(nameBytes);
        
        byte[] descriptionBytes = missionDescription.getBytes(Charset.defaultCharset());
        buf.writeInt(descriptionBytes.length);
        buf.writeBytes(descriptionBytes);
        
        buf.writeInt(level.ordinal());
        
        TypeRegistry typeRegistry = TypeRegistry.getInstance();
        typeRegistry.toBytes(requirement, buf);
        
        buf.writeInt(goals.size());
        for(Goal goal: goals) {
            typeRegistry.toBytes(goal, buf);
        }
        
        buf.writeInt(rewards.size());
        for(MissionReward reward: rewards) {
            typeRegistry.toBytes(reward, buf);
        }
    }
}
