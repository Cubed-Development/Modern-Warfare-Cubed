package com.paneedah.weaponlib.animation.jim;

import net.minecraft.util.math.Vec3d;

public class KeyStateAnimator extends BasicStateAnimator {
	
	
	public void removeKey() {
		
		transition(new Vec3d(0.0, 0.0, 20.0),
				  new Vec3d(0.0, 0, 0), 40.0);
		
		addPause(10);
		
		transition(new Vec3d(0.0, 0.0, 0.0),
				  new Vec3d(0.0, 0, 0), 40.0);
	}
	
	public void turnKey() {
		
			transition(new Vec3d(0.0, 0.0, 0.0),
					  new Vec3d(0.0, 0, 0), 1.0);
		
			transition(new Vec3d(0.0, 0.0, 20.0),
				  new Vec3d(0.0, 0, 0), 50.0);
		
			addPause(20);
		
			transition(new Vec3d(0.0, 0.0, 20.0),
				  new Vec3d(-60.0, 0, 0.0), 50.0);
			
			addPause(30);
			
			transition(new Vec3d(0.0, 0.0, 20.0),
					  new Vec3d(-45.0, 0, 0.0), 30.0);
	}

}
