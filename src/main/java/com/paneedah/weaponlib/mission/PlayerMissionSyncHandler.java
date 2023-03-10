package com.paneedah.weaponlib.mission;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.weaponlib.compatibility.CompatibleMissionCapability;
import net.minecraft.entity.player.EntityPlayer;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class PlayerMissionSyncHandler implements CompatibleMessageHandler<PlayerMissionSyncMessage, CompatibleMessage>  {

    @SuppressWarnings("unused")
    private ModContext modContext;

    public PlayerMissionSyncHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(PlayerMissionSyncMessage message, CompatibleMessageContext ctx) {
        if(!ctx.isServerSide()){
            compatibility.runInMainClientThread(() -> {
                EntityPlayer player = compatibility.clientPlayer();
                CompatibleMissionCapability.updateMissions(player, message.getMissions());
            });
        }
        return null;
    }
}
