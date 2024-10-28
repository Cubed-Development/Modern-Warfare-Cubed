package com.paneedah.weaponlib.compatibility.sound;

import com.paneedah.weaponlib.vehicle.EntityVehicle;
import io.redstudioragnarok.redcore.vectors.Vector3D;
import net.minecraft.client.audio.ISound;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

public class EngineMovingSound extends AdvCompatibleMovingSound {

    public EntityVehicle vehicle;

    public EngineMovingSound(SoundEvent sound, Supplier<Vector3D> positionProvider, Supplier<Boolean> donePlayingProvider, EntityVehicle vehicle, boolean shouldFade) {
        super(sound, positionProvider, donePlayingProvider, shouldFade);

        this.vehicle = vehicle;
    }

    @Override
    public void update() {

        // TODO Auto-generated method stub
        super.update();
        double rpm = vehicle.getSolver().getCurrentRPM();
        repeatDelay = -1;
        attenuationType = ISound.AttenuationType.NONE;


        if (vehicle.isDead) {
            donePlaying = true;
        }

        if (!vehicle.isVehicleRunning()) {
            donePlaying = true;
        }

        if (!isDonePlaying()) {
            float suggested = (float) ((float) 1.0 * (vehicle.solver.getCurrentRPM() / 3500.0F) + 1.0f);

            pitch = (float) Math.min(suggested, 2.0);
            volume = 2f;
        }

    }

}
