package com.paneedah.weaponlib.sound;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public final class ClientSoundPlayer {

    @SideOnly(Side.CLIENT)
    public void PlaySoundClient(double distance, SoundEvent soundIn, SoundCategory categoryIn, float volumeIn, float pitchIn, float xIn, float yIn, float zIn) {
        Minecraft mc = Minecraft.getMinecraft();
        PositionedSoundRecord positionedsoundrecord = new PositionedSoundRecord(soundIn.getSoundName(), categoryIn, volumeIn, pitchIn, false, 0, ISound.AttenuationType.NONE, xIn,yIn, zIn);
        if (distance > 100.0D)
        {
            final double d1 = Math.sqrt(distance) / 40D;
            mc.getSoundHandler().playDelayedSound(positionedsoundrecord, (int)(d1 * 20.0D));
        } else {
            mc.getSoundHandler().playSound(positionedsoundrecord);
        }
    }
}
