package com.paneedah.weaponlib.vehicle.jimphysics.stability.numerical;

public class RK4Integrator {
	
	
	
	public void calculateDerivatives(SolutionVector x0, SolutionVector dxdt) {
		
	}
	
	public void integrateRK4(SolutionVector state, float dt) {
		
		SolutionVector k1 = null, k2 = null, k3 = null, k4 = null;
		SolutionVector x;
		
		calculateDerivatives(state, k1);
		x = state;
		x.add(0.5f*dt, k1);
		
		calculateDerivatives(state, k2);
		x = state;
		x.add(0.5f*dt, k2);
		
		calculateDerivatives(state, k3);
		x = state;
		x.add(dt, k3);
		
		calculateDerivatives(x, k4);
		
		state.add( dt/6.0f, k1 );     
		 state.add( dt/3.0f, k2 );     
		 state.add( dt/3.0f, k3 );     
		 state.add( dt/6.0f, k4 );    
		
		
		
		
	}

}
