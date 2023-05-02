package com.paneedah.mwc.weaponlib.compatibility.sound;

import com.paneedah.mwc.vectors.Vector3D;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleSound;
import com.paneedah.mwc.weaponlib.vehicle.EntityVehicle;

import java.util.function.Supplier;

public class DriftMovingSound extends AdvCompatibleMovingSound {
	
	public EntityVehicle vehicle;
	public int startingMat = 0;
	public Supplier<Integer> currentMat;

	public DriftMovingSound(CompatibleSound sound, Supplier<Vector3D> positionProvider,
			Supplier<Boolean> donePlayingProvider, EntityVehicle vehicle, boolean shouldFade, int startMat, Supplier<Integer> currentMat) {
		super(sound, positionProvider, donePlayingProvider, shouldFade);
		this.startingMat = startMat;
		this.currentMat = currentMat;
		this.vehicle = vehicle;
	}
	
	@Override
	public void update() {
		super.update();
		
		if(vehicle.isDead) {
			donePlaying = true;
		}
		
		if(currentMat.get() != startingMat) {
			this.donePlaying = true;
			
			
		}
		
		
		//System.out.println("fortnite: " + ((float) Math.abs(vehicle.getSolver().getSideSlipAngle())*2.0));
		//System.out.println(this.donePlaying);
		if(!isDonePlaying()) {
			this.volume = 0.0f;
			if(vehicle.getRealSpeed() >= 9) {
				double sideSlipAngle = Math.abs(Math.toDegrees(vehicle.getSolver().getSideSlipAngle()));
				if(Double.isNaN(sideSlipAngle)) sideSlipAngle = 0;
				
				this.volume = (float) Math.min(sideSlipAngle/15.0, 2.0);
			}
			
			//this.volume = (float) ((float) Math.abs(vehicle.getSolver().getSideSlipAngle())*2.0);
			//this.pitch = (float) 2.0*vehicle.getSolver().getVelocityVector().normalize();
		}
	}

}
