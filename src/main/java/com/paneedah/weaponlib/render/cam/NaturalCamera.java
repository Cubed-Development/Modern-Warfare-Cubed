package com.paneedah.weaponlib.render.cam;

import com.paneedah.weaponlib.ClientModContext;
import com.paneedah.weaponlib.WeaponState;
import com.paneedah.weaponlib.numerical.LissajousCurve;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Quaternion;

import java.util.LinkedList;

public class NaturalCamera {

    private double x, y, z, xr, yr, zr;

    private ShockVector shockVector = new ShockVector();

    private Matrix4f currentMatrix;
    private Matrix4f previousMatrix;

    private static final LinkedList<Matrix4f> matrixStack = new LinkedList<>();

    public void addToMatrixStack(Matrix4f mat) {

        matrixStack.push(mat);

        // matrixStack.add(mat);
    }

    public void sendQuaternionData(Quaternion a, Quaternion b) {
        // MatrixHelper.toEulerAngles(q)
    }

    public void feedMatrix(Matrix4f food) {
        this.previousMatrix = this.currentMatrix;
        this.currentMatrix = food;
        // System.out.println("Received " + food);
    }

    public NaturalCamera() {

    }

    public void update() {
        if (true) {
            return;
        }
        if (Double.isNaN(shockVector.getShockVector().x)) {
            shockVector = new ShockVector();
        }
        // shockVector = new ShockVector();
        if (matrixStack.size() > 1) {
			/*
			Matrix4f previous = matrixStack.pop();
			Matrix4f current = matrixStack.pop();

			Quaternion q1 = new Quaternion();
			Quaternion q2 = new Quaternion();

			Quaternion.setFromMatrix(previous, q1);
			Quaternion.setFromMatrix(current, q2);

			double[] a1 = MatrixHelper.toEulerAngles(q1);
			double[] a2 = MatrixHelper.toEulerAngles(q2);

			double scale = 1;

			double forceX = 0;
			double forceY = 0;
			double forceZ = 0;

			double thres = 0.5;
			if (Math.abs(a1[0] - a2[0]) > thres) {
				forceX = Math.toDegrees(a1[0] - a2[0]) * scale;
			}
			if (Math.abs(a1[1] - a2[1]) > thres) {
				forceY = Math.toDegrees(a1[1] - a2[1]) * scale;
			}
			if (Math.abs(a1[2] - a2[2]) > thres) {
				forceZ = Math.toDegrees(a1[2] - a2[2]) * scale;
			}

			shockVector.applyForce(forceX, forceY, forceZ);
			*/

            Matrix4f previous = matrixStack.pop();
            Matrix4f current = matrixStack.pop();
            double forceX = 0;
            double forceY = 0;
            double forceZ = 0;


            double scale = -1.0;
            double thres = 0.0;
            if (Math.abs(current.m30 - previous.m30) > thres) {
                forceX = (current.m30 - previous.m30) * scale;
            }
            if (Math.abs(current.m31 - previous.m31) > thres) {
                forceY = (current.m31 - previous.m31) * scale;
            }
            if (Math.abs(current.m32 - previous.m32) > thres) {
                forceZ = (current.m31 - previous.m31) * scale;
            }
            shockVector.applyForce(forceX, forceY, forceZ);

        }

        shockVector.configure(500, 800, 50);
        shockVector.update(0.05);
        Vec3d sv = shockVector.getShockVector();
        // System.out.println(sv);


        GlStateManager.rotate((float) sv.y, 0, 1, 0);
        GlStateManager.rotate((float) sv.z, 0, 0, 1);
        GlStateManager.rotate((float) sv.x, 1, 0, 0);
        // GlStateManager.translate(sv.x, sv.y, sv.z);

        // zr *= 0.9;
        // GlStateManager.translate(zr, 0, 0);

        // System.out.println(matrixStack.poll());

        // System.out.println(matrixStack.poll());

        // System.out.println(currentMatrix.m03);

        // xr = 0.01;
        if (ClientModContext.getContext().getMainHeldWeapon().getState() == WeaponState.READY) {
            yr *= 0.98;
        } else {
            yr += 0.01;
            yr = Math.min(yr, 1.0);
        }
        xr += 0.01;

        // System.out.println("hi-> " + currentMatrix);

        x = LissajousCurve.getXOffsetOnCurve(yr * 0.5, 0.5, 0, 0, xr * 2);
        y = LissajousCurve.getYOffsetOnCurve(yr * 0.5, 0.5, Math.PI / 2, 0, xr * 2);
        GlStateManager.rotate((float) x, 1, 0, 0);
        GlStateManager.rotate((float) y, 0, 0, 1);
        // GlStateManager.rotate(45f, 1, 0, 0);
        // GlStateManager.rotate((float) x, 1, 0, 0);
        // GlStateManager.translate(x, y, z);
    }

}
