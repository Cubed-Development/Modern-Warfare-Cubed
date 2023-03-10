package com.paneedah.weaponlib.inventory;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.player.EntityPlayer;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

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
