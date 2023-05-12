package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class BlockHitMessageHandler implements CompatibleMessageHandler<BlockHitMessage, IMessage>  {
    
    @SuppressWarnings("unused")
    private ModContext modContext;
    
    //private double yOffset = 1;

    public BlockHitMessageHandler() {
    }

    public BlockHitMessageHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(BlockHitMessage message, MessageContext messageContext) {
        if(messageContext.side == Side.CLIENT) {
            compatibility.runInMainClientThread(() -> {
            	//BulletHoleRenderer
            
                compatibility.addBlockHitEffect(message.getBlockPos(), message.getPosX(), message.getPosY(), message.getPosZ(), message.getSideHit());
            });
        }
        return null;
    }
}
