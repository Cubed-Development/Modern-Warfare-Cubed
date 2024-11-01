package com.paneedah.weaponlib.animation.jim;

import com.paneedah.weaponlib.animation.MatrixHelper;
import com.paneedah.weaponlib.animation.jim.AnimationData.BlockbenchTransition;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import java.util.Map.Entry;
import java.util.TreeMap;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class KeyedAnimation {

    public TreeMap<Float, BlockbenchTransition> bbMap = new TreeMap<>();
    public float prevTimer = 0.0f;
    public float timer = 0.0f;
    public float max;


    public KeyedAnimation(float max) {
        this.max = max;
    }

    public KeyedAnimation(AnimationData data) {
        // Copy keys
        bbMap.putAll(data.bbTransition);

        max = data.getAppointedDuration();
    }

    public void doPositioning(float speed) {
        doPositioning(1.0f, Vec3d.ZERO);
    }

    public void update(float speed) {
        prevTimer = timer;

        timer += speed;

        if (timer > max) {
            timer = 0;
            prevTimer = timer;
            //timer += speed;
        }
    }


    public void doPositioning(float magnitude, Vec3d rotationPoint) {


        if (magnitude == 0.0) {
            return;
        }

        // Add speed to timer
        float time = prevTimer + (timer - prevTimer) * MC.getRenderPartialTicks();


        // Find previous key
        float bottomKey = bbMap.floorEntry(Float.valueOf(time)).getKey().floatValue();

        float topKey;
        try {
            topKey = bbMap.ceilingKey(Float.valueOf(time)).floatValue();
        } catch (Exception e) {
            topKey = bbMap.floorKey(Float.valueOf(time)).floatValue();
        }


        //System.out.println(time);
        Vec3d prevTrans = bbMap.floorEntry(Float.valueOf(time)).getValue().getTranslation();
        Vec3d nextTrans = bbMap.ceilingEntry(Float.valueOf(time)).getValue().getTranslation();

        // If by some weird bug this is null, set them to eachother
        if (nextTrans == null) {
            nextTrans = prevTrans;
        }

        Vec3d prevRot = bbMap.floorEntry(Float.valueOf(time)).getValue().getRotation();
        Vec3d nextRot = bbMap.ceilingEntry(Float.valueOf(time)).getValue().getRotation();

        if (nextRot == null) {
            nextRot = prevRot;
        }


        float leDelta = (time - bottomKey) / (topKey - bottomKey);
        if (Double.isNaN(leDelta)) {
            leDelta = 0.0f;
        }


        Vec3d translation = MatrixHelper.lerpVectors(prevTrans, nextTrans, leDelta);

        Vec3d rotation = MatrixHelper.lerpVectors(prevRot, nextRot, leDelta);

        //rotation = new Vec3d(MC.player.ticksExisted%45, 0, 0);

        translation = translation.scale(magnitude);
        rotation = rotation.scale(magnitude);


        double mul = 1 / 17.0;

        // Animation translation
        GL11.glTranslated(translation.x * mul, -translation.y * mul, translation.z * mul);

        // Offset rotation point
        GlStateManager.translate(rotationPoint.x, rotationPoint.y, rotationPoint.z);

        // Original object rotation (+Z, -Y, -X)
        GL11.glRotated(rotation.z, 0, 0, 1);
        GL11.glRotated(rotation.y, 0, 1, 0);
        GL11.glRotated(rotation.x, 1, 0, 0);

        GlStateManager.translate(-rotationPoint.x, -rotationPoint.y, -rotationPoint.z);
        //GlStateManager.scale(t.getScaleX(), t.getScaleY(), t.getScaleZ());


    }


}
