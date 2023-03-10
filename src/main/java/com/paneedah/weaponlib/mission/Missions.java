package com.paneedah.weaponlib.mission;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMissionCapability;
import com.paneedah.weaponlib.mission.MissionReward.ItemReward;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class Missions {
    
    public static MissionOffering parse(String fileName) throws FileNotFoundException {
        
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(MissionOffering.class, new MissionOffering.Deserializer())
                
                .registerTypeAdapter(Goal.class, new Goal.Deserializer())
                
                .registerTypeAdapter(KillEntityAction.class, new KillEntityAction.Deserializer())
                .registerTypeAdapter(ObtainItemAction.class, new ObtainItemAction.Deserializer())
                .registerTypeAdapter(GoToLocationAction.class, new GoToLocationAction.Deserializer())
                
                .registerTypeAdapter(ItemReward.class, new ItemReward.Deserializer())
                
                .registerTypeHierarchyAdapter(Action.class, new TypeHierarchyDeserializer<>()
                        .registerType(KillEntityAction.class)
                        .registerType(ObtainItemAction.class)
                        .registerType(GoToLocationAction.class))
                
                .registerTypeAdapter(MissionReward.class, new TypeHierarchyDeserializer<>()
                        .registerType(ItemReward.class)
                        )
        .create();
        
        Reader reader = new FileReader(fileName);
        MissionOffering offering = gson.fromJson(reader, MissionOffering.class);
        return offering;
    }

    public static void update(EntityPlayer player, Action action, ModContext modContext) {
        Set<Mission> missions = CompatibleMissionCapability.getMissions(player);
       
        for(Mission mission: missions) {
        	
            if(!mission.isCompleted(player) && mission.update(action, player)) {
                if(mission.isCompleted(player)) {
                    modContext.getStatusMessageCenter().addAlertMessage(
                            compatibility.getLocalizedString("Mission accomplished!"), 3, 250, 200);
                }
                CompatibleMissionCapability.updateMission(player, mission);
                
                modContext.getChannel().getChannel().sendTo(
                        new PlayerMissionSyncMessage(CompatibleMissionCapability.getMissions(player)),
                        (EntityPlayerMP)player);
                
                break; // Only one mission can be carried at a time 
            }
        }
    }
    
    public static void redeem(EntityPlayer player, Mission mission, Entity assigner, ModContext modContext) {
        
        
    }
    
    public static void assign(EntityPlayer player, Mission mission, ModContext modContext) {
        CompatibleMissionCapability.updateMission(player, mission);
        modContext.getChannel().getChannel().sendTo(
                new PlayerMissionSyncMessage(CompatibleMissionCapability.getMissions(player)),
                (EntityPlayerMP)player);
    }
    
    public static Collection<Mission> getMatchingMissions(MissionOffering missionOffering, 
            EntityPlayer player, Predicate<Mission> predicate) {
        Collection<Mission> result = new ArrayList<>();        
        Set<Mission> missions = CompatibleMissionCapability.getMissions(player);

        for(Mission mission: missions) {
            if(missionOffering.getId().equals(mission.getMissionOfferingId())
                    && predicate.test(mission)) {
                result.add(mission);
            }
        }
        return result;
    }
    
    public static Collection<Mission> getRedeemableMissions(MissionOffering missionOffering, EntityPlayer player) {
        return getMatchingMissions(missionOffering, player, 
                mission -> 
                    mission.isCompleted(player) 
                    && !mission.isExpired(compatibility.world(player).getTotalWorldTime())
                    && !mission.isRedeemed());
    }
    
    public static Collection<MissionOffering> getRedeemableMissionOfferings(MissionAssigner missionAssigner, EntityPlayer player) {
        Collection<MissionOffering> result = new ArrayList<>();      
        for(MissionOffering missionOffering: missionAssigner.getMissionOfferings().values()) {
            if(!getMatchingMissions(missionOffering, player, 
                mission -> mission.isCompleted(player)
                    && !mission.isExpired(compatibility.world(player).getTotalWorldTime())
                    && !mission.isRedeemed()).isEmpty()) {
                result.add(missionOffering);
            }
        }
        return result;
    }
    
    public static Collection<MissionOffering> getAvailableOfferings(MissionAssigner missionAssigner, EntityPlayer player) {
        Collection<MissionOffering> result = new ArrayList<>();      
        for(MissionOffering missionOffering: missionAssigner.getMissionOfferings().values()) {
            if(missionOffering.isAvailableFor(player)) {
                result.add(missionOffering);
            }
        }
        return result;
    }
}
