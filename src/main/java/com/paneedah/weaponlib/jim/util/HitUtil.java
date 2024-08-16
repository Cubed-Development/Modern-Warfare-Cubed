package com.paneedah.weaponlib.jim.util;

import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class HitUtil {

    public static RayTraceResult traceMeleeHit(Entity attacker, Entity hurt) {
        Vec3d startVec = attacker.getPositionEyes(1.0F);
        Vec3d endVec = startVec.add(attacker.getLookVec().scale(3));
        return hurt.getEntityBoundingBox().calculateIntercept(startVec, endVec);
    }

    public static RayTraceResult traceProjectilehit(Entity attacker, Entity hurt) {
        Vec3d start = new Vec3d(
                attacker.posX - attacker.motionX,
                attacker.posY - attacker.motionY,
                attacker.posZ - attacker.motionZ);
        Vec3d end = new Vec3d(
                attacker.posX + attacker.motionX,
                attacker.posY + attacker.motionY,
                attacker.posZ + attacker.motionZ);
        return hurt.getEntityBoundingBox().grow(0.1).calculateIntercept(start, end);

    }

    public static Vec3d rotateVector(Vec3d toRot, Vec3d toOrigin, float pitch, float yaw) {
        return toRot.subtract(toOrigin).rotatePitch(pitch).rotateYaw(yaw).add(toOrigin);
    }

    public static EnumFacing getDirectionHitMelee(Entity player, Entity hurt) {
        Vec3d startVec = player.getPositionEyes(1.0F);
        Vec3d endVec = startVec.add(player.getLookVec().scale(5));


        float pitch = (float) Math.toRadians(hurt.rotationPitch);
        float yaw = (float) Math.toRadians(hurt.rotationYaw + 180);

        startVec = rotateVector(startVec, hurt.getPositionVector(), pitch, yaw);
        endVec = rotateVector(endVec, hurt.getPositionVector(), pitch, yaw);

        Vec3d zpV = hurt.getPositionVector().add(0, hurt.getEyeHeight(), 0);
        RayTraceResult result = hurt.getEntityBoundingBox().calculateIntercept(startVec, endVec);
        if (result != null) {
            return result.sideHit;
        } else {
            return null;
        }

    }


}
