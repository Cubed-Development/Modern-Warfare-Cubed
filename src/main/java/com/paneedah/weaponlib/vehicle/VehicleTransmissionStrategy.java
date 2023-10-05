package com.paneedah.weaponlib.vehicle;

import com.paneedah.weaponlib.compatibility.CompatibleMovingSound;
import dev.redstudio.redcore.vectors.Vector3D;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.SoundEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public abstract class VehicleTransmissionStrategy {
    
    public static class Builder {
        
        private List<DefaultTransmissionStrategy.Gear> gears = new ArrayList<>();
        private EntityVehicle entity;
        
        public Builder withGear(double minSpeed, SoundEvent sound) {
            DefaultTransmissionStrategy.Gear gear = new DefaultTransmissionStrategy.Gear();
            
            Supplier<Vector3D> soundPositionProvider = () -> new Vector3D(entity.posX, entity.posY, entity.posZ);

            Supplier<Float> drivingSoundVolumeProvider = () -> {                
                if(gear.strategy.speed >= gear.minSpeed && gear.strategy.speed < gear.maxSpeed) {
                    return (float) Math.log10((0.01 + gear.strategy.speed - gear.minSpeed) * 20) * 0.9f;
                }
                return 0f;
            };
            
            Supplier<Boolean> donePlayingSoundProvider = () -> entity.isDead;

            gear.sound = new CompatibleMovingSound(sound, soundPositionProvider, drivingSoundVolumeProvider, donePlayingSoundProvider);

            gears.add(gear);
            
            return this;
        }
        
        public VehicleTransmissionStrategy build() {
            gears.sort(null);
            for(int i = 0; i < gears.size() - 1; i++) {
                gears.get(i).maxSpeed = gears.get(i + 1).minSpeed;
            }
            gears.get(gears.size() - 1).maxSpeed = Double.MAX_VALUE;
            return null;
        }
    }
    
    public static class DefaultTransmissionStrategy extends VehicleTransmissionStrategy {
        
        private double speed;
        
        private static class Gear implements Comparable<Gear> {
            double minSpeed; // inclusive
            double maxSpeed; // exclusive
            MovingSound sound;
            DefaultTransmissionStrategy strategy;
            
            @Override
            public int compareTo(Gear o) {
                return Double.compare(minSpeed, o.minSpeed);
            }
        }
        
        private Gear[] gears;

        @Override
        public void update(double speed) {
            
            for(int i = 0; i < gears.length; i++) {
                if(speed > gears[i].minSpeed) {
//                    this.rate = thresholds[i].rate;
//                    this.amplitude = thresholds[i].amplitude;
                } else {
                    break;
                }
            }
        }
    }

    public abstract void update(double speed);
    
}
