package com.paneedah.weaponlib.render.cam;

import com.paneedah.mwc.instancing.PlayerWeaponInstance;
import com.paneedah.weaponlib.ClientModContext;
import com.paneedah.weaponlib.WeaponState;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.numerical.LissajousCurve;
import com.paneedah.weaponlib.numerical.SpringVector;
import lombok.NoArgsConstructor;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Quaternion;

import java.util.LinkedList;

@NoArgsConstructor
public class NaturalCamera {

    private double x, y, z, xr, yr, zr;

    private SpringVector shockVector = new SpringVector();

    private static final LinkedList<Matrix4f> matrixStack = new LinkedList<>();

    public void addToMatrixStack(Matrix4f mat) {
        matrixStack.push(mat);
    }

    public void update(PlayerWeaponInstance playerWeaponInstance) {
        if(ModernConfigManager.enableNaturalCamera){
            if (Double.isNaN(shockVector.getPosition().x)) {
                shockVector = new SpringVector();
            }
            if (matrixStack.size() > 1) {

                Matrix4f previous = matrixStack.pop();
                Matrix4f current = matrixStack.pop();
                double forceX = 0;
                double forceY = 0;
                double forceZ = 0;


                double scale = -0.04;
                double thres = 0.0;
                if (Math.abs(current.m30 - previous.m30) > thres) {
                    forceX = (current.m30 - previous.m30) * scale;
                }
                if (Math.abs(current.m31 - previous.m31) > thres) {
                    forceY = (current.m31 - previous.m31) * scale;
                }
                if (Math.abs(current.m32 - previous.m32) > thres) {
                    forceZ = (current.m32 - previous.m32) * scale;
                }
                shockVector.addVelocity(forceX, forceY, forceZ);

            }

            shockVector.configure(500, 800, 50);
            shockVector.update(0.05);
            Vec3d sv = shockVector.getPosition();


            GlStateManager.rotate((float) sv.y, 0, 1, 0);
            GlStateManager.rotate((float) sv.z, 0, 0, 1);
            GlStateManager.rotate((float) sv.x, 1, 0, 0);

            if (playerWeaponInstance.getState() == WeaponState.READY) {
                yr *= 0.98;
            } else {
                yr += 0.01;
                yr = Math.min(yr, 1.0);
            }
            xr += 0.01;


            x = LissajousCurve.getXOffsetOnCurve(yr * 0.5, 0.5, 0, 0, xr * 2);
            y = LissajousCurve.getYOffsetOnCurve(yr * 0.5, 0.5, Math.PI / 2, 0, xr * 2);
            GlStateManager.rotate((float) x, 1, 0, 0);
            GlStateManager.rotate((float) y, 0, 0, 1);
        }
    }
}
