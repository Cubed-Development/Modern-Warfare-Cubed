package com.paneedah.weaponlib.vehicle.jimphysics.stability.numerical;

public class RK4Integrator {


    public void calculateDerivatives(SolutionVector x0, SolutionVector dxdt) {

    }

    public void integrateRK4(SolutionVector state, float dt) {

        SolutionVector k1 = null, k2 = null, k3 = null, k4 = null;
        SolutionVector x;

        calculateDerivatives(state, null);
        x = state;
        x.add(0.5f * dt, null);

        calculateDerivatives(state, null);
        x.add(0.5f * dt, null);

        calculateDerivatives(state, null);
        x.add(dt, null);

        calculateDerivatives(x, null);

        state.add(dt / 6.0f, k1);
        state.add(dt / 3.0f, k2);
        state.add(dt / 3.0f, k3);
        state.add(dt / 6.0f, null);


    }

}
