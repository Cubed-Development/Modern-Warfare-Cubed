package com.paneedah.weaponlib.vehicle.collisions;

import com.paneedah.weaponlib.vehicle.GearShiftPattern;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;

public class Test {

    public static void OBBCollisionTest() {
        OreintedBB ob = new OreintedBB(new AxisAlignedBB(-1, -1, -1, 1, 1, 1));
        OreintedBB ob2 = new OreintedBB(new AxisAlignedBB(-1, -1, -1, 1, 1, 1));

        ob2.rotate(0.0, Math.toRadians(45), 0.0);

        ob2.move(0.0, 1.9, 0.0);

        GJKResult result = OBBCollider.areColliding(ob, ob2);
        System.out.println(result.status);
        Vec3d sepVec = result.separationVector;
        ob2.move(sepVec.x, sepVec.y, sepVec.z);


        GJKResult result2 = OBBCollider.areColliding(ob, ob2);
        System.out.println(result2.status);

    }

    public static final GearShiftPattern STANDARD_SIX_SHIFT = new GearShiftPattern()
            .withNormalBranch(1, 2)
            .withNormalBranch(3, 4)
            .withNormalBranch(5, 6);

    public static void main(String[] args) {


        VehicleInertiaBuilder sedan = new VehicleInertiaBuilder(1352);
        sedan.basicSedanConstruct(new Vec3d(1, 1, 3), 0.2f, 2.8f, 0.3f, 0.1f);
        System.out.println(sedan.build());
		
		/*
		VehicleInertiaBuilder builda = new VehicleInertiaBuilder(1352);
		builda.addCube(new Vec3d(-1, 0, 0), new Vec3d(1, 1, 1), 5);
		builda.addCube(new Vec3d(1, 1.0, 1), new Vec3d(1, 1, 1), 5);
		
		
		System.out.println(builda.build());
		*/

        if (1 + 1 == 2) {
            return;
        }


        System.out.println("Inertia of Cylinder: " + InertiaKit.inertiaTensorCylinder(75f, 0.33f, 1.2f).m22);

        Vec3d[] face = {new Vec3d(-2, 0, 0), new Vec3d(1, 0, 0), new Vec3d(0, 1, 0)};
        Vec3d point = new Vec3d(0.7, 0.5, 0.3);
        //System.out.println("Drillgons method: " + OBBCollider.susBarry(face, point));
        //System.out.println("Jim incorp method: " + OBBCollider.calculateBarycentric(face, point));


        //if(1 + 1 == 2) return;
        //GearShiftAnimation animation = new GearShiftAnimation(STANDARD_SIX_SHIFT, 75, 1, 2);


        ArrayList<Vec3d> tList = STANDARD_SIX_SHIFT.getTransitions(1, 2);
		
		
		/*
		Vec3d o = STANDARD_SIX_SHIFT.doAnimation(39, 75, 1, 2);
		System.out.println(o);*/


        for (int x = 0; x <= 75; ++x) {
            Vec3d o = STANDARD_SIX_SHIFT.doAnimation(x, 75, 1, 2);
            System.out.println(x + " | " + o);
        }

        System.out.println();


        OBBCollisionTest();
		
		/*
		OreintedBB ob = new OreintedBB(new AxisAlignedBB(-1, -1, -1, 1, 1, 1));
		
		ob.rotate(Math.toRadians(45.0), Math.toRadians(0.0), Math.toRadians(0.0));
		
		Vec3d o = ob.doRayTrace(new Vec3d(-2, 0, 0), new Vec3d(2, 0, 0)).hitVec;
		*/

        //System.out.println();
        //ob.rotate(Math.toRadians(0.0), Math.toRadians(90.0), Math.toRadians(90.0));
        //Vec3d dir = new Vec3d(1, 2, 3);
        //System.out.println(ob.support(dir));


    }

}
