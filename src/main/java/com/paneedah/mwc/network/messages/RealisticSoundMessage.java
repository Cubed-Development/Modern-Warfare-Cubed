package com.paneedah.mwc.network.messages;

import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class RealisticSoundMessage implements IMessage {
    private boolean silencer;
    
    private int dimensionId;
    
    private SoundEvent sound;
    private BlockPos pos;

    @Override
    public void fromBytes(final ByteBuf buf) {
        int length = buf.readInt();
        byte[] soundBytes = new byte[length];
        buf.readBytes(soundBytes);
        String soundName = new String(soundBytes);
        sound = SoundEvent.REGISTRY.getObject(new ResourceLocation(soundName));
        final int x = buf.readInt();
        final int y = buf.readInt();
        final int z = buf.readInt();
        pos = new BlockPos(x, y, z);
        
        dimensionId = buf.readInt();
        silencer = buf.readBoolean();
    }

    @Override
    public void toBytes(final ByteBuf buf) {
        String soundName = sound.getRegistryName().toString();
        byte[] soundBytes = soundName.getBytes();
        buf.writeInt(soundBytes.length);
        buf.writeBytes(soundBytes);

        buf.writeInt(pos.getX());
        buf.writeInt(pos.getY());
        buf.writeInt(pos.getZ());
        
        buf.writeInt(dimensionId);
        buf.writeBoolean(silencer);
    }
    public SoundEvent getSound() {return this.sound;}
    public BlockPos getPos() { return this.pos;}
    public int getWorldId() {return this.dimensionId;}
    public boolean getSilencer() {return this.silencer;}
}
