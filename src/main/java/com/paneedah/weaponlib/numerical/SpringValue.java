package com.paneedah.weaponlib.numerical;

import com.paneedah.weaponlib.animation.MatrixHelper;
import lombok.Getter;
import lombok.Setter;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

/**
 * Simulates a spring. Used for lots of effects that intend
 * to make the game feel more immersive, such as head movement
 * when jumping.
 *
 * @author Homer Riva-Cambrin
 * @since October 23rd, 2022
 */
public class SpringValue {

    /**
     * Integration Series:
     * Waiting Force -> Velocity -> Position
     */
    @Setter
    @Setter
    @Setter
    @Setter
    @Setter
    @Getter
    @Getter
    @Getter
    @Getter
    @Getter
    public double springConstant, mass, damping, velocity, position, waitingForce;

    // For rendering we store the previous
    // position.
    public double prevPosition = 0;

    public SpringValue(double k, double mass, double damp) {
        springConstant = k;
        this.mass = mass;
        damping = damp;
    }

    /**
     * Applies a force in Newtons (N) to
     * the spring.
     *
     * @param force - force in Newtons
     */
    public void applyForce(double force) {
        waitingForce = force;
    }

    /**
     * Integrates the parameters using a delta time (dt)
     * coefficient.
     *
     * @param dt - delta time (1/s)
     */
    public void update(double dt) {
        double force = -springConstant * (position);
        double dampingForce = damping * velocity;

        // Apply force than reset waiting force.
        force += waitingForce;
        waitingForce = 0;

        // Calculates the net force. Damping
        // is stored as a positive value
        // so we subtract.
        double netForce = force - dampingForce;

        // F = ma -> a = F/m. Calculates the acceleration.
        double acceleration = netForce / mass;

        // Before updating position store our current
        // position in previous position for interpolation.
        prevPosition = position;

        // Integrate w/ Semi-Euler
        // For more accuracy one could use Rutta-Kunge integration.
        velocity += acceleration * dt;
        position += velocity * dt;

        // Reset spring if simulation destabilizes.
        if (isImpossibleDouble(position) || isImpossibleDouble(velocity) || isImpossibleDouble(waitingForce)) {
            resetSpring();
        }

    }

    private boolean isImpossibleDouble(double value) {
        return Double.isNaN(value) || Double.isInfinite(value);
    }

    /**
     * Spring simulations can be unstable, this method will reset the spring
     * if the position goes to NaN or infinity;
     */
    public void resetSpring() {
        velocity = 0;
        position = 0;
        waitingForce = 0;
    }

    public void configure(double k, double mass, double dampening) {
        springConstant = k;
        this.mass = mass;
        damping = dampening;
    }

    public double getLerpedPosition() {
        return getLerpedPosition(MC.getRenderPartialTicks());
    }

    public double getLerpedPosition(double mu) {
        return MatrixHelper.solveLerp((float) prevPosition, (float) position,
                MC.getRenderPartialTicks());
    }

    public float getLerpedFloat() {
        return (float) getLerpedPosition();
    }

}
