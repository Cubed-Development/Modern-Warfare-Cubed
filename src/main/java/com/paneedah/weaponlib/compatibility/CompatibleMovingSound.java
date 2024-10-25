package com.paneedah.weaponlib.compatibility;

import io.redstudioragnarok.redcore.vectors.Vector3D;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.function.Supplier;

@Deprecated
@SideOnly(Side.CLIENT)
public class CompatibleMovingSound extends MovingSound {
    private final Supplier<Vector3D> positionProvider;
    private final Supplier<Float> volumeProvider;
    private final Supplier<Boolean> donePlayingProvider;

    public CompatibleMovingSound(SoundEvent sound, Supplier<Vector3D> positionProvider, Supplier<Float> volumeProvider, Supplier<Boolean> donePlayingProvider) {
        super(sound, SoundCategory.BLOCKS);
        repeat = true;
        pitch = 0;
        volume = 0.1F;
        this.positionProvider = positionProvider;
        this.volumeProvider = volumeProvider;
        this.donePlayingProvider = donePlayingProvider;
    }

    public void update() {
        donePlaying = donePlayingProvider.get().booleanValue();
        if (!donePlaying) {
            Vector3D position = positionProvider.get();
            xPosF = (float) position.x;
            yPosF = (float) position.y;
            zPosF = (float) position.z;
            volume = volumeProvider.get().floatValue();
            pitch = 1 + volume * volume;
        }
    }
}
