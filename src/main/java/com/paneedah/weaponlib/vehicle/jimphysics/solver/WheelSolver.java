package com.paneedah.weaponlib.vehicle.jimphysics.solver;


import com.paneedah.weaponlib.KeyBindings;
import com.paneedah.weaponlib.vehicle.collisions.InertiaKit;
import com.paneedah.weaponlib.vehicle.jimphysics.InterpolationKit;
import com.paneedah.weaponlib.vehicle.jimphysics.TyreSize;
import com.paneedah.weaponlib.vehicle.jimphysics.VehiclePhysUtil;
import com.paneedah.weaponlib.vehicle.jimphysics.stability.numerical.vehicle.WheelSolutionVector;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.Vec3d;

import javax.vecmath.Vector3d;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class WheelSolver {


    public double actualRideHeight = 0;

    public double springRate = 271;

    VehiclePhysicsSolver solver;

    @Getter
    public SuspensionSolver suspension;


    public WheelAxel axel;

    public double wheelAngularVelocity = 0.0;
    double wheelAngularAcceleration = 0.0;
    public double wheelAngle = 0.0;
    double wheelInertia = 0.0;
    double loadOnWheel = 0.0;
    Vec3d wheelOreintation = new Vec3d(0, 0, 1);

    double driveTorque;
    double tractionTorque;
    double lateralForce = 0.0;
    double longForce = 0.0;

    boolean isDrive;

    // LAT & LONG FORCE
    public Vec3d longitudinalForce = new Vec3d(0, 0, 0);
    public Vec3d lateralForceVec = new Vec3d(0, 0, 0);

    /*
     * Set by external things
     */
    @Setter
    public Vec3d relativePosition = Vec3d.ZERO;
    public double rideHeight;


    public double wheelRot = 0.0;
    public double prevWheelRot = 0.0;

    public WheelSolutionVector state = new WheelSolutionVector();

    public double wheelMass;

    public TyreSize tyreSize;


    public double grassCoef = 0.5;


    /**
     * Creates a new wheel solver
     *
     * @param mass mass of tire in (kg)
     * @param isDrive Does the wheel get powered from the engine?
     */
    public WheelSolver(TyreSize tyreSize, double mass, boolean isDrive) {

        suspension = new SuspensionSolver(springRate, 1.0);
        this.tyreSize = tyreSize;

        //this.axel = axel;
        wheelMass = mass;
        // calculates the wheel's inertia, only ar
        wheelInertia = InertiaKit.inertiaTensorCylinder((float) mass, (float) getRadius(), (float) getWidth()).m22;
        this.isDrive = isDrive;
    }

    public WheelSolver(TyreSize tyreSize, double mass, boolean isDrive, double grassCoef) {

        suspension = new SuspensionSolver(springRate, 1.0);
        this.tyreSize = tyreSize;

        //this.axel = axel;
        wheelMass = mass;
        // calculates the wheel's inertia, only ar
        wheelInertia = InertiaKit.inertiaTensorCylinder((float) mass, (float) getRadius(), (float) getWidth()).m22;
        this.isDrive = isDrive;
        this.grassCoef = grassCoef;
    }


    public void assignSolver(VehiclePhysicsSolver solver) {
        this.solver = solver;

    }

    public double getRadius() {
        return tyreSize.getRadius();
    }

    public double getWidth() {
        return tyreSize.getWidth();
    }

    public double getInterpolatedWheelRotation() {
        return Math.toDegrees(InterpolationKit.interpolateValue(prevWheelRot, wheelRot, MC.getRenderPartialTicks()));
    }

    public Vec3d getSuspensionPosition() {
        Vec3d relative = relativePosition;
        relative = relative.add(0.0, getSuspension().getStretch() * -0.15, 0.0);
        return relative;
    }

    public boolean isDriveWheel() {
        return axel.isDriveWheel;
    }

    public void applySuspensionLoad(double force) {
        suspension.applyForce(force);
    }


    public double getRenderRideHeight() {
        double d = rideHeight;

        if (axel.solver.vehicle.rideOffset < 0) {
            d += axel.solver.vehicle.rideOffset * 1.75;
        }
        return d;
    }


    /**
     * Applies a braking force to the wheel
     *
     * @param magnitude 1.0-0.0, lower vals = higher braking
     */
    public void applyBrake(double magnitude) {

    }

    double oldWheelVel = 0;

    public double slipRatio = 0.0;

    public void doPhysics() {
        double radius = getRadius();

        Vec3d vM = solver.velocity.normalize();
        Vec3d oM = solver.getOreintationVector();
        Vector3d oreintation = new Vector3d(oM.x, oM.y, oM.z);
        Vector3d velocity = new Vector3d(vM.x, vM.y, vM.z);


        wheelAngularVelocity += wheelAngularAcceleration * solver.timeStep;

        if (solver.vehicle.throttle != 1.0) {
            wheelAngularVelocity *= 0.995;
        }


        if (solver.getLongitudinalSpeed() == 0.0) {
            wheelAngularVelocity = 0;
        }


        // prevents the user from going too fast backwards
        // in reverse. real life example = Mercedes G-Wagon.
        if (solver.transmission.isReverseGear) {
            if (wheelAngularVelocity > 20) {
                wheelAngularVelocity = 20;
            }
        }


        // RESETS THE WHEEL ANGULAR ACCELERATION
        wheelAngularAcceleration = 0;

        // UPDATES THE WHEEL ROTATION
        wheelRot += wheelAngularVelocity * solver.timeStep;


        // update wheel oreintatio
        Vec3d omega = wheelOreintation.rotateYaw((float) wheelAngle);


        //System.out.println(wheelAngularVelocity);
        // get slip ratio
        double B = 0.91;
        double ls = solver.getLongitudinalSpeed();


        double rm = solver.timeStep / 2;
        double cx = 75000;
        double n = 1.1;
        double m = loadOnWheel / 9.81;

        //System.out.println(hashCode());

        double lamdaR = -(cx / ls) * ((1 / m) + ((radius * radius) / wheelInertia));
        double r = -1 / lamdaR;


        double umx = rm * cx * (((radius * radius) / wheelInertia) + (1 / (m)));
        slipRatio = ((wheelAngularVelocity * radius) - ls) / Math.max(Math.abs(ls), n * umx);


        if (wheelAngularVelocity < 0 && !solver.transmission.isReverseGear) {

            wheelAngularVelocity = 0;
        }


        if (solver.vehicle.getRealSpeed() < 1 && KeyBindings.vehicleBrake.isKeyDown() && !solver.transmission.isReverseGear) {
            solver.velocity = Vec3d.ZERO;
            wheelAngularVelocity = 0;
            wheelAngularAcceleration = 0;
            slipRatio = 0;
        }


        //System.out.println(slipRatio);
        //slipRatio = 0;
        // Bernard & Clover


        //slipRatio = wheelAngularVelocity*radius-solver.getLongitudinalSpeed();

        if (Double.isNaN(slipRatio)) {
            slipRatio = 0;
        }
        //double slipRatio = VehiclePhysUtil.getSlipRatio(wheelAngularVelocity, radius, this.solver.vehicle.getRealSpeed());


        // sometimes this can actually be NaN which can cause errors.
        if (Double.isNaN(slipRatio)) {
            longitudinalForce = Vec3d.ZERO;
            return;
        }


        //loadOnWheel *= 5;

        // get longitundinal force
        double peak = 1.0;
        if (solver.transmission.getClutch().getSlippage() == 1) {
            peak = 1.9;
        }
        longForce = VehiclePhysUtil.pacejkaLong(loadOnWheel, slipRatio, 1.65, peak, 0.97, 10);


        if (Math.abs(Math.toDegrees(oreintation.angle(velocity))) > 150 && !solver.transmission.isReverseGear && solver.vehicle.throttle < 0.5) {
            axel.applyBrakingForce(8000);
            longForce *= -1;

        }


        //longForce *= 30.0;


        // REDUCES THE GRIP ON OTHER MATERIALS (DIRT)
        longitudinalForce = omega.scale(longForce);
        if (axel.solver.materialBelow != Material.ROCK) {
            longitudinalForce = longitudinalForce.scale(0.5);
        }


        // CALCULATES THE TRACTION TORQUE
        tractionTorque = longForce * radius * -1;


        // System.out.println(tractionTorque);






        /*
         * LATERAL FORCES :)
         */


        // finds yawspeed - I put absoplute around the offset so might cause errors?
        double yawspeed = solver.wheelBase * axel.COGoffset * solver.angularVelocity;

        // finds rotAngle
        double rot_angle = Math.atan(yawspeed / solver.getLongitudinalSpeed());

        // finds the sideslip angle
        double sideSlip = solver.getSideSlipAngle();

        //System.out.println("YAW: " + Math.toDegrees(yawspeed) + " | ROT: " + Math.toDegrees(rot_angle) + " | SIDE: " + Math.toDegrees(sideSlip));
        // calculates the slipangle


        double slipAngleTire;
        if (axel.COGoffset < 0) {
            slipAngleTire = sideSlip - rot_angle - wheelAngle;
        } else {
            slipAngleTire = sideSlip + rot_angle - wheelAngle;
        }
        slipAngleTire = Math.toDegrees(slipAngleTire);

        double cy = 100000;
        double uym = rm * (cy / m);

        //double lateralSlipRatio = ls/max

        Vec3d lateralVector = solver.getOreintationVector().rotateYaw((float) Math.toRadians(-90));
        double dotter = lateralVector.dotProduct(solver.velocity);

        double lateralSlipRatio = dotter / Math.max(Math.abs(ls), n * uym);
        lateralSlipRatio *= 100000;
        if (lateralSlipRatio == 0.0) {
        }


        //	double lF = VehiclePhysUtil.pacejkaLong(loadOnWheel, lateralSlipRatio, 1.3, 1.0, 1.0, 4);
        //System.out.println(lateralSlipRatio + " | " + slipAngleTire);
        //// LATERAL FORCE
        // https://www.edy.es/dev/docs/pacejka-94-parameters-explained-a-comprehensive-guide/
        // (SHOULD BE UPGRADED FROM '94 FORMULA)

        lateralForce = VehiclePhysUtil.pacejkaLong(loadOnWheel, slipAngleTire, 1.3, 1.3, 1.0, 4);

        // APPLIES THE FX OF HANDBRAKE
        if (axel.isHandbraking) {
            if (!(Math.abs(Math.toDegrees(solver.vehicle.steerangle)) > 4)) {
                if (axel.solver.materialBelow == Material.ROCK) {
                    axel.applyBrakingForce(40);
                } else {
                    axel.applyBrakingForce(10);
                }
            }
            lateralForce *= 0.15;
        }


        // REDUCES GRIP ON DIRT
        if (axel.COGoffset < 0 && axel.solver.materialBelow != Material.ROCK) {
            lateralForce *= grassCoef;
        }


        // if(absSlip > 1.5 && this.axel.COGoffset < 0) lateralForce *= kC;

        // PREVENTS THE LATERAL FORCE VALUE FROM GOING NAN
        if (Double.isNaN(lateralForce)) {
            lateralForce = 0.0;
            lateralForceVec = Vec3d.ZERO;
        } else {
            lateralForceVec = wheelOreintation.rotateYaw((float) Math.toRadians(-90)).scale(lateralForce);

        }


    }


    public WheelSolver newInstance() {


        return new WheelSolver(tyreSize, wheelMass, isDrive, grassCoef)
                .withRelativePosition(relativePosition);
    }


    public WheelSolver withRelativePosition(Vec3d vec) {
        setRelativePosition(vec);
        return this;

    }
}
