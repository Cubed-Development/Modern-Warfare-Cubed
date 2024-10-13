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

    private double z;
    private double xr;
    private double yr;
    private double zr;

    private ShockVector shockVector = new ShockVector();

    private Matrix4f currentMatrix;

    private static final LinkedList<Matrix4f> matrixStack = new LinkedList<>();

    public void addToMatrixStack(Matrix4f mat) {

        matrixStack.push(mat);

        // matrixStack.add(mat);
    }

    public void sendQuaternionData(Quaternion a, Quaternion b) {
        // MatrixHelper.toEulerAngles(q)
    }

    public void feedMatrix(Matrix4f food) {
        Matrix4f previousMatrix = currentMatrix;
        currentMatrix = food;
        // System.out.println("Received " + food);
    }

    public NaturalCamera() {

    }

    public void update() {
        return;
    }

}
