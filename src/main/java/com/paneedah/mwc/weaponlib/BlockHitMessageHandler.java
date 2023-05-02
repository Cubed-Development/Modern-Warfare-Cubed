package com.paneedah.mwc.weaponlib;

import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageHandler;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class BlockHitMessageHandler implements CompatibleMessageHandler<BlockHitMessage, CompatibleMessage>  {
    
    @SuppressWarnings("unused")
    private ModContext modContext;
    
    //private double yOffset = 1;

    public BlockHitMessageHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(BlockHitMessage message, CompatibleMessageContext ctx) {
        if(!ctx.isServerSide()) {
            compatibility.runInMainClientThread(() -> {
            	//BulletHoleRenderer
            
                compatibility.addBlockHitEffect(message.getBlockPos(), message.getPosX(), message.getPosY(), message.getPosZ(), message.getSideHit());
            });
        }
        return null;
    }
}
