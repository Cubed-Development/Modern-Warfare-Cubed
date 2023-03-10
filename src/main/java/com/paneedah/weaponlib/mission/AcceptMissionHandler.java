package com.paneedah.weaponlib.mission;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.weaponlib.compatibility.CompatibleMissionCapability;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

import java.util.Set;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class AcceptMissionHandler implements CompatibleMessageHandler<AcceptMissionMessage, CompatibleMessage>  {

    @SuppressWarnings("unused")
    private ModContext modContext;

    public AcceptMissionHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(AcceptMissionMessage message, CompatibleMessageContext ctx) {
        if(ctx.isServerSide()){
            ctx.runInMainThread(() -> {
                EntityPlayer player = ctx.getPlayer();
                Entity assigner = compatibility.world(player).getEntityByID(message.getAssignerEntityId());
                if(assigner instanceof MissionAssigner) {
                    MissionOffering offering = ((MissionAssigner) assigner).getMissionOfferings().get(message.getMissionOfferingId());
                    if(offering != null) {
                        if(message.getAction() == AcceptMissionMessage.Action.ASSIGN) {
                            ((MissionAssigner) assigner).assign(offering, player);
                        } else if(message.getAction() == AcceptMissionMessage.Action.REDEEM) {
                            Set<Mission> playerMissions = CompatibleMissionCapability.getMissions(player);
                            for(Mission mission: playerMissions) {
                                if(mission.getMissionOfferingId().equals(offering.getId())) {
                                    ((MissionAssigner) assigner).redeem(mission, player);
                                }
                            }
                        }
                    }
                }
            });
        }
        return null;
    }
}
