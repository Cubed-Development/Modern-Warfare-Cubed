package com.paneedah.mwc.weaponlib.inventory;

import com.paneedah.mwc.weaponlib.ModContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.player.EntityPlayer;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class OpenCustomInventoryGuiHandler implements CompatibleMessageHandler<OpenCustomPlayerInventoryGuiMessage, CompatibleMessage>  {

    private ModContext modContext;

    public OpenCustomInventoryGuiHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(OpenCustomPlayerInventoryGuiMessage message, CompatibleMessageContext ctx) {
        if(ctx.isServerSide()) {
            ctx.runInMainThread(() -> {
                EntityPlayer player = ctx.getPlayer();
                player.openGui(modContext.getMod(), message.getGuiInventoryId(), 
                        compatibility.world(player), (int)player.posX, (int)player.posY, (int)player.posZ);
            });
        }
        return null;
    }
}
