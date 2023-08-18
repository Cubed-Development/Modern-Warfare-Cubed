package com.paneedah.weaponlib.animation.jim;

import com.paneedah.weaponlib.animation.jim.AnimationData.BlockbenchTransition;
import io.redstudioragnarok.redcore.vectors.Vector3F;
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
	public float max = 2.0f;


	public KeyedAnimation(float max) {
		this.max = max;
	}
	
	public KeyedAnimation(AnimationData data) {
		// Copy keys
		for(Entry<Float, BlockbenchTransition> entry : data.bbTransition.entrySet()) {
			bbMap.put(entry.getKey(), entry.getValue());
		}
		
		this.max = data.appointedDuration;
	}
	
	public void doPositioning(float speed) {
		doPositioning(1.0f, Vec3d.ZERO);
	}
	
	public void update(float speed) {
		this.prevTimer = this.timer;
		
		this.timer += speed;
		
		if (timer > max) {
			timer = 0;
			prevTimer = timer;
			//timer += speed;
		}
	}
	
	
	public void doPositioning(float magnitude, Vec3d rotationPoint) {

	
		
		if(magnitude == 0.0) return;
		
		// Add speed to timer
		float time = prevTimer + (timer-prevTimer)*MC.getRenderPartialTicks();
		
		


		// Find previous key
		float bottomKey = bbMap.floorEntry(time).getKey();
		
		float topKey = 0.0f;
		try {
			topKey = bbMap.ceilingKey(time);
		} catch (Exception e) {
			topKey = bbMap.floorKey(time);
		}


		//System.out.println(time);
		Vector3F prevTrans = bbMap.floorEntry(time).getValue().getTranslation();
		Vector3F nextTrans = bbMap.ceilingEntry(time).getValue().getTranslation();
		
		// If by some weird bug this is null, set them to eachother
		if (nextTrans == null)
			nextTrans = prevTrans;

		Vector3F prevRot = bbMap.floorEntry(time).getValue().getRotation();
		Vector3F nextRot = bbMap.ceilingEntry(time).getValue().getRotation();

		if (nextRot == null)
			nextRot = prevRot;


		float leDelta = (time - bottomKey) / (topKey - bottomKey);
		if (Double.isNaN(leDelta))
			leDelta = 0.0f;



		Vector3F translation = new Vector3F();
		translation.lerp(prevTrans, leDelta, nextTrans);

		Vector3F rotation = new Vector3F();
		rotation.lerp(prevRot, leDelta, nextRot);

		/*
		Vec3d rotation = Vec3d.ZERO;
		
		Quaternion q1 = MatrixHelper.fromEulerAngles(Math.toRadians(prevRot.z), Math.toRadians(prevRot.x), Math.toRadians(prevRot.y));
		Quaternion q2 = MatrixHelper.fromEulerAngles(Math.toRadians(nextRot.z), Math.toRadians(nextRot.x), Math.toRadians(nextRot.y));
		Quaternion q3 = MatrixHelper.slerp(q1, q2, leDelta);
		
		double[] rawArray = MatrixHelper.toEulerAngles(q3);
		rotation = new Vec3d(Math.toDegrees(rawArray[2]), Math.toDegrees(rawArray[1]), Math.toDegrees(rawArray[0]));
		*/
		
		//rotation = new Vec3d(MC.player.ticksExisted%45, 0, 0);
				
		translation.scale(magnitude);
		rotation.scale(magnitude);
		
	
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
		//GlStateManager.scale(t.scale.x, t.scale.y t.scale.z);


	}
	


}
