package com.paneedah.weaponlib.numerical;

import com.paneedah.weaponlib.animation.MatrixHelper;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

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
	public double springConstant, mass, damping, velocity, position, waitingForce;

	// For rendering we store the previous
	// position.
	public double prevPosition = 0;

	public SpringValue(double k, double mass, double damp) {
		this.springConstant = k;
		this.mass = mass;
		this.damping = damp;
	}

	/**
	 * Applies a force in Newtons (N) to
	 * the spring.
	 * 
	 * @param force - force in Newtons
	 */
	public void applyForce(double force) {
		this.waitingForce = force;
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
		if(isImpossibleDouble(position) || isImpossibleDouble(velocity) || isImpossibleDouble(waitingForce)) {
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
		this.velocity = 0;
		this.position = 0;
		this.waitingForce = 0;
	}

	public double getSpringConstant() {
		return springConstant;
	}

	public void configure(double k, double mass, double dampening) {
		this.springConstant = k;
		this.mass = mass;
		this.damping = dampening;
	}

	public void setSpringConstant(double springConstant) {
		this.springConstant = springConstant;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getDamping() {
		return damping;
	}

	public void setDamping(double damping) {
		this.damping = damping;
	}

	public double getVelocity() {
		return velocity;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}

	public double getPosition() {
		return position;
	}

	public double getLerpedPosition() {
		return getLerpedPosition(mc.getRenderPartialTicks());
	}

	public double getLerpedPosition(double mu) {
		return MatrixHelper.solveLerp((float) this.prevPosition, (float) this.position,
				mc.getRenderPartialTicks());
	}

	public float getLerpedFloat() {
		return (float) getLerpedPosition();
	}

	public void setPosition(double position) {
		this.position = position;
	}

}
