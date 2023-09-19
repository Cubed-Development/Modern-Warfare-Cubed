package com.paneedah.weaponlib.compatibility;

import dev.redstudio.redcore.vectors.Vector3D;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.function.Supplier;

@Deprecated
@SideOnly(Side.CLIENT)
public class CompatibleMovingSound extends MovingSound {
    private Supplier<Vector3D> positionProvider;
    private Supplier<Float> volumeProvider;
    private Supplier<Boolean> donePlayingProvider;

    public CompatibleMovingSound(SoundEvent sound, Supplier<Vector3D> positionProvider, Supplier<Float> volumeProvider, Supplier<Boolean> donePlayingProvider) {
        super(sound, SoundCategory.BLOCKS);
        this.repeat = true;
        this.pitch = 0;
        this.volume = 0.1F;
        this.positionProvider = positionProvider;
        this.volumeProvider = volumeProvider;
        this.donePlayingProvider = donePlayingProvider;
    }

    public void update() {
        donePlaying = donePlayingProvider.get();
        if (!donePlaying) {
            Vector3D position = positionProvider.get();
            this.xPosF = (float) position.x;
            this.yPosF = (float) position.y;
            this.zPosF = (float) position.z;
            this.volume = volumeProvider.get();
            this.pitch = 1 + this.volume * this.volume;
        }
    }
}
