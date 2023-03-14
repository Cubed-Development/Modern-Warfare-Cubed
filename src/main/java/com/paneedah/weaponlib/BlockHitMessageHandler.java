package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class BlockHitMessageHandler implements CompatibleMessageHandler<BlockHitMessage, CompatibleMessage>  {

    //private double yOffset = 1;

    public BlockHitMessageHandler() {}

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(BlockHitMessage message, CompatibleMessageContext ctx) {
        if(ctx.isServerSide())
            return null;

        compatibility.runInMainClientThread(() -> {
            //BulletHoleRenderer
            compatibility.addBlockHitEffect(message.getBlockPos(), message.getPosX(), message.getPosY(), message.getPosZ(), message.getSideHit());
        });

        return null;
    }
}
