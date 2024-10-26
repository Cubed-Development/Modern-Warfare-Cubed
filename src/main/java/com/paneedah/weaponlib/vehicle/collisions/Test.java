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

        return;


    }

}
