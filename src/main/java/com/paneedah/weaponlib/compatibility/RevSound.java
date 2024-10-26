package com.paneedah.weaponlib.compatibility;

import com.paneedah.weaponlib.vehicle.EntityVehicle;
import io.redstudioragnarok.redcore.vectors.Vector3D;
import net.minecraft.client.audio.PositionedSound;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.function.Supplier;

@SideOnly(Side.CLIENT)
public class RevSound extends PositionedSound {
    private final Supplier<Vector3D> positionProvider;

    public RevSound(SoundEvent sound, Supplier<Vector3D> positionProvider, EntityVehicle vehicle) {
        super(sound, SoundCategory.BLOCKS);
        this.repeat = true;
        this.volume = 1.5F;
        this.positionProvider = positionProvider;
    }

    public void update() {
        Vector3D position = positionProvider.get();
        this.xPosF = (float) position.x;
        this.yPosF = (float) position.y;
        this.zPosF = (float) position.z;
    }
}
