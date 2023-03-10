package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.function.Supplier;

@SideOnly(Side.CLIENT)
public class CompatibleMovingSound extends MovingSound {
    private Supplier<CompatibleVec3> positionProvider;
    private Supplier<Float> volumeProvider;
    private Supplier<Boolean> donePlayingProvider;

    public CompatibleMovingSound(CompatibleSound sound, Supplier<CompatibleVec3> positionProvider,
            Supplier<Float> volumeProvider, Supplier<Boolean> donePlayingProvider) {
        super(sound.getSound(), SoundCategory.BLOCKS);
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
            CompatibleVec3 position = positionProvider.get();
            this.xPosF = (float) position.getXCoord();
            this.yPosF = (float) position.getYCoord();
            this.zPosF = (float) position.getZCoord();
            this.volume = volumeProvider.get();
            this.pitch = 1 + this.volume * this.volume;
        }
    }
}
