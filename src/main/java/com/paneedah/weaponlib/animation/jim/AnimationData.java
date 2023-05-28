package com.paneedah.weaponlib.animation.jim;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.paneedah.weaponlib.ClientModContext;
import com.paneedah.weaponlib.RenderContext;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.UniversalSoundLookup;
import com.paneedah.weaponlib.animation.MatrixHelper;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.render.bgl.math.AngleKit.EulerAngle;
import com.paneedah.weaponlib.render.bgl.math.AngleKit.Format;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import java.util.*;
import java.util.Map.Entry;

public class AnimationData {

	public TreeMap<Float, BlockbenchTransition> bbTransition = new TreeMap<>();

	public static final float PACE = 833f;
	
	public ArrayList<Float> timestamps = new ArrayList<>();

	public TreeMap<Float, Vec3d> rotationKeyframes = new TreeMap<>();
	public TreeMap<Float, Vec3d> translateKeyframes = new TreeMap<>();

	private boolean isNull = false;
	private int fakeTransitions = 0;
	private long fTLength;
	
	
	// The **ACTUAL** duration of the animation as designated in the BlockBench file
	private float appointedDuration;
	
	
	protected AnimationData(ArrayList<Float> arrayList) {
		this.isNull = true;
		this.fakeTransitions = arrayList.size();
		this.fTLength = (long) (arrayList.get(arrayList.size()-1)/arrayList.size());
	}
	
	public void setAppointedDuration(float f) {
		this.appointedDuration = f;
	}
	
	public float getAppointedDuration() {
		return this.appointedDuration;
	}
	
	public AnimationData(JsonObject obj) {

		// initialize a timestamp array and the key arrays
		ArrayList<Float> timestamps = new ArrayList<>();
		/*
		 * rotationKeyframes = new TreeMap<>(); translateKeyframes = new TreeMap<>();
		 */

		// load up the rotation keyframes
		if(obj.has("rotation") && obj.get("rotation").isJsonObject()) {
			JsonObject rotation = obj.get("rotation").getAsJsonObject();
			for (Entry<String, JsonElement> i : rotation.entrySet()) {
				JsonArray ar = i.getValue().getAsJsonArray();
				float time = Float.parseFloat(i.getKey());
				Vec3d rotationVector = new Vec3d(ar.get(0).getAsDouble(), ar.get(1).getAsDouble(), ar.get(2).getAsDouble());
				if (!timestamps.contains(time))
					timestamps.add(time);
				rotationKeyframes.put(time, rotationVector);
			}
		} else if(!obj.has("rotation")) {
			rotationKeyframes.put(0f, Vec3d.ZERO);
		} else if(!obj.get("rotation").isJsonObject()) {
			JsonArray ar = obj.get("rotation").getAsJsonArray();
			Vec3d translationVector = new Vec3d(ar.get(0).getAsDouble(), ar.get(1).getAsDouble(),
					ar.get(2).getAsDouble());
			rotationKeyframes.put(0f, translationVector);
		}
		

		// load up the translation keyframes
		if(obj.has("position") && obj.get("position").isJsonObject()) {
			JsonObject translate = obj.get("position").getAsJsonObject();
			for (Entry<String, JsonElement> i : translate.entrySet()) {
				JsonArray ar = i.getValue().getAsJsonArray();
				float time = Float.parseFloat(i.getKey());
				Vec3d translationVector = new Vec3d(ar.get(0).getAsDouble(), ar.get(1).getAsDouble(),
						ar.get(2).getAsDouble());
				if (!timestamps.contains(time))
					timestamps.add(time);
				translateKeyframes.put(time, translationVector);
			}
		} else if(!obj.has("position")) {
			
			translateKeyframes.put(0f, Vec3d.ZERO);
			
		} else if(!obj.get("position").isJsonObject()) {
			
			JsonArray ar = obj.get("position").getAsJsonArray();
			Vec3d translationVector = new Vec3d(ar.get(0).getAsDouble(), ar.get(1).getAsDouble(),
					ar.get(2).getAsDouble());
			translateKeyframes.put(0f, translationVector);
		}
		

		// sort the timestamp array
		Collections.sort(timestamps);
		this.timestamps = timestamps;

		// System.out.println(timestamps);

		// bake
		for (int i = 0; i < timestamps.size(); ++i) {
			float f = timestamps.get(i);
			Vec3d rotationKey = null;
			Vec3d translationKey = null;

			
			float timeDelta = 0;
			if (i != 0) {

				timeDelta = (f - timestamps.get(i - 1)) * PACE;
				// System.out.println("Delta for " + f + ": " +timeDelta);
			} else {
				//System.out.println("yo bo");
				timeDelta = 1f;
				//timeDelta = (timestamps.get(i + 1) - f) * PACE;
			}
			
			
			// timeDelta = 210f;
			try {
				if (!rotationKeyframes.containsKey(f)) {

					/*
					 * if(rotationKeyframes.ceilingKey(f) == null) { // The other keyframes extend
					 * farther rotationKey = rotationKeyframes.get(rotationKeyframes.floorKey(f)); }
					 * else if(rotationKeyframes.floorKey(f) == null) { // There is no keyframe
					 * before this rotationKey =
					 * rotationKeyframes.get(rotationKeyframes.ceilingKey(f)); } else { // Otherwise
					 * just interpolate a new one float fromDelta = rotationKeyframes.floorKey(f);
					 * float toDeltaDelta = rotationKeyframes.ceilingKey(f); float alpha = (f -
					 * fromDelta)/(toDeltaDelta-fromDelta);
					 * 
					 * Vec3d beforeKey = rotationKeyframes.floorEntry(f).getValue(); Vec3d afterKey
					 * = rotationKeyframes.ceilingEntry(f).getValue(); if(afterKey == null) afterKey
					 * = beforeKey; rotationKey = MatrixHelper.lerpVectors(beforeKey, afterKey,
					 * alpha); }
					 */
					rotationKey = buildRotationKeyframe(rotationKeyframes, f);
					rotationKeyframes.put(f, rotationKey);
				} else {
					rotationKey = rotationKeyframes.get(f);
				}

				if (!translateKeyframes.containsKey(f)) {

					/*
					 * if(translateKeyframes.ceilingKey(f) == null) { // The other keyframes extend
					 * farther translationKey =
					 * translateKeyframes.get(translateKeyframes.floorKey(f)); } else
					 * if(translateKeyframes.floorKey(f) == null) { // There is no keyframe before
					 * this translationKey =
					 * translateKeyframes.get(translateKeyframes.ceilingKey(f)); } else { float
					 * fromDelta = translateKeyframes.floorKey(f); float toDeltaDelta =
					 * translateKeyframes.ceilingKey(f); float alpha = (f -
					 * fromDelta)/(toDeltaDelta-fromDelta);
					 * 
					 * 
					 * Vec3d beforeKey = translateKeyframes.floorEntry(f).getValue(); Vec3d afterKey
					 * = translateKeyframes.ceilingEntry(f).getValue(); if(afterKey == null)
					 * afterKey = beforeKey; translationKey = MatrixHelper.lerpVectors(beforeKey,
					 * afterKey, alpha); }
					 */

					
					translationKey = buildKeyframe(translateKeyframes, f);
					translateKeyframes.put(f, translationKey);
				} else {

					translationKey = translateKeyframes.get(f);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			// System.out.println(f + " | " + new BlockbenchTransition(timeDelta,
			// rotationKey, translationKey));
		
			
			
			this.bbTransition.put(f, new BlockbenchTransition(timeDelta, rotationKey, translationKey));

		}

	}
	 
	public void setSounds(HashMap<Float, String> map, ArrayList<Float> overflowList) {
		for(Entry<Float, BlockbenchTransition> set : this.bbTransition.entrySet()) {
			if(map.containsKey(set.getKey())) {
				overflowList.remove(set.getKey());
				set.getValue().setSound(UniversalSoundLookup.lookupSound(map.get(set.getKey())));
			}
		}
	}
	
	public float getDelta(TreeMap<Float, Vec3d> map, float f) {
		
		
		if(map.floorKey(f) != null) {
			return (f-map.floorKey(f))*PACE;
		} else if(map.ceilingKey(f) != null) {
			//System.out.println("CALLED FOR DELTA!");
			return (f-map.ceilingKey(f))*PACE;
			//return 2456;
		} else {
		
			return 100f;
		}
		
	}
	
	public Vec3d buildRotationKeyframe(TreeMap<Float, Vec3d> keyList, float timestamp) {
		// Keylist is empty, just return a zero vector
		
				if (keyList.isEmpty())
					return Vec3d.ZERO;
				if (keyList.ceilingKey(timestamp) == null) {
					// There is no keyframe ahead, so there's nothing to interpolate
					// between. Just grab the last keyframe and use that.
					
					return keyList.get(keyList.floorKey(timestamp));
				} else if (keyList.floorKey(timestamp) == null) {
					// There is no keyframe before this. Just grab the next one and use
					// that.
					
					
					return keyList.get(keyList.ceilingKey(timestamp));
				} else {
					// Otherwise just interpolate a new one
					
					float fromDelta = keyList.floorKey(timestamp);
					float toDeltaDelta = keyList.ceilingKey(timestamp);
					float alpha = (timestamp - fromDelta) / (toDeltaDelta - fromDelta);

					Vec3d beforeKey = keyList.floorEntry(timestamp).getValue();
					Vec3d afterKey = keyList.ceilingEntry(timestamp).getValue();
					if (afterKey == null)
						afterKey = beforeKey;
					
					/*
					Quaternion q1 = MatrixHelper.fromEulerAngles(Math.toRadians(beforeKey.z), Math.toRadians(beforeKey.x), Math.toRadians(beforeKey.y));
					Quaternion q2 = MatrixHelper.fromEulerAngles(Math.toRadians(afterKey.z), Math.toRadians(afterKey.x), Math.toRadians(afterKey.y));
					// roll pitch yaw
					double[] result = MatrixHelper.toEulerAngles(MatrixHelper.slerp(q1, q2, alpha));
					System.out.println("TEST: " + Arrays.toString(result));
					//return new Vec3d(Math.toDegrees(result[1]), Math.toDegrees(result[2]), Math.toDegrees(result[0]));
					*/
					
					EulerAngle beforeAngle = new EulerAngle(Format.DEGREES, beforeKey.x, beforeKey.y, beforeKey.z);
					EulerAngle afterAngle = new EulerAngle(Format.DEGREES, afterKey.x, afterKey.y, afterKey.z);
					EulerAngle resultant = beforeAngle.slerp(afterAngle, alpha);
					return new Vec3d(resultant.getX(), resultant.getY(), resultant.getZ());
					
					
					//return MatrixHelper.lerpVectors(beforeKey, afterKey, alpha);
				}
	}
		

	public Vec3d buildKeyframe(TreeMap<Float, Vec3d> keyList, float timestamp) {
		// Keylist is empty, just return a zero vector
		
		if (keyList.isEmpty())
			return Vec3d.ZERO;
		if (keyList.ceilingKey(timestamp) == null) {
			// There is no keyframe ahead, so there's nothing to interpolate
			// between. Just grab the last keyframe and use that.
			
			return keyList.get(keyList.floorKey(timestamp));
		} else if (keyList.floorKey(timestamp) == null) {
			// There is no keyframe before this. Just grab the next one and use
			// that.
			
			
			return keyList.get(keyList.ceilingKey(timestamp));
		} else {
			// Otherwise just interpolate a new one
			
			float fromDelta = keyList.floorKey(timestamp);
			float toDeltaDelta = keyList.ceilingKey(timestamp);
			float alpha = (timestamp - fromDelta) / (toDeltaDelta - fromDelta);

			Vec3d beforeKey = keyList.floorEntry(timestamp).getValue();
			Vec3d afterKey = keyList.ceilingEntry(timestamp).getValue();
			if (afterKey == null)
				afterKey = beforeKey;
			return MatrixHelper.lerpVectors(beforeKey, afterKey, alpha);
		}
	}

	public void bakeKeyframes(float timeStamp) {
	
		// Build keyframes
		Vec3d rotation = buildRotationKeyframe(rotationKeyframes, timeStamp);
		Vec3d translation = buildKeyframe(translateKeyframes, timeStamp);
		
		
		float timeDelta = getDelta(rotationKeyframes, timeStamp);
		
		
		// Put keyframes in list (for debugging and testing)
		rotationKeyframes.put(timeStamp, rotation);
		translateKeyframes.put(timeStamp, translation);
		
	
		// Build a new BlockBench transition
		getBbTransition().put(timeStamp, new BlockbenchTransition(timeDelta, rotation, translation));
		

	}

	/*
	 * GL11.glScalef(3.5f, 3.5f, 4.5f);
	 * 
	 * GlStateManager.translate(0.2, 0.05, -0.1);
	 * 
	 * GL11.glRotated(57.7232f, 0, 0, 1); GL11.glRotated(26.1991f, 0, 1, 0);
	 * GL11.glRotated(0f, 1, 0, 0);
	 */

	@SuppressWarnings("unchecked")
	public List<Transition<RenderContext<RenderableState>>> getTransitionList() {
		
		List<Transition<RenderContext<RenderableState>>> transitionList = new ArrayList<>();
		for (Entry<Float, BlockbenchTransition> bb : this.bbTransition.entrySet()) {
			transitionList.add((Transition<RenderContext<RenderableState>>) bb.getValue().createVMWTransition());
		}
		return transitionList;

	}
	
	public Transition<RenderContext<RenderableState>>[] getTransitionArray() {
		List<Transition<RenderContext<RenderableState>>> list = getTransitionList();
		
		Transition<RenderContext<RenderableState>>[] array = new Transition[list.size()];
		
		int count = 1;
		for(Transition<RenderContext<RenderableState>> t : list) {
			array[count++] = t;
			if(count == list.size() - 1) break;
		}
		
		return array;
	}
	
	
	/**
	 * Allows for ADS reloads, quite a simple set of logic instructions, basically it'll provide transitions
	 * depending on if the player is aiming, quite nice!
	 * 
	 * @param normal
	 * @param ads
	 * @param divisor
	 * @return
	 */
	public List<Transition<RenderContext<RenderableState>>> getTransitionListDual(Transform normal, Transform ads, double divisor) {
		List<Transition<RenderContext<RenderableState>>> transitionList = new ArrayList<>();
		
		
		
		

		if(!isNull) {
			
			for (Entry<Float, BlockbenchTransition> bb : this.bbTransition.entrySet()) {
				transitionList.add((Transition<RenderContext<RenderableState>>) bb.getValue().createVMWTransitionWithADS(normal, ads, divisor));
			}
		} else {
			
			for(int i = 0; i < this.fakeTransitions; ++i) {
				transitionList.add(new Transition<>(normal.getAsPosition()
				, this.fTLength));
			}
		}
		
		
		// Swaps the last frame of the animation with
		// the initial position (much smoother lol)
		long curLength = transitionList.get(transitionList.size()-1).getDuration();
		transitionList.set(transitionList.size()-1, new Transition<>(normal.getAsPosition(), curLength));
		return transitionList;
	}

	@SuppressWarnings("unchecked")
	public List<Transition<RenderContext<RenderableState>>> getTransitionList(Transform initial, double divisor) {
		return getTransitionList(initial, divisor, true);
	}
	
	@SuppressWarnings("unchecked")
	public List<Transition<RenderContext<RenderableState>>> getTransitionList(Transform initial, double divisor, boolean applySwap) {
		List<Transition<RenderContext<RenderableState>>> transitionList = new ArrayList<>();
		
		
		
		/*
		transitionList.add((Transition<RenderContext<RenderableState>>) 
				
				new Transition<>(new Transform()
            			.withScale(3, 3, 3)
            			.withPosition(-0.3f, 4.75f, -2f)
            			.withRotation(-10, 0, 0)
            			.getAsPosition(), 10)
            			);
            			*/
		

		if(!isNull) {
			int count = 0;
			for (Entry<Float, BlockbenchTransition> bb : this.bbTransition.entrySet()) {
				Transition<RenderContext<RenderableState>> transition = (Transition<RenderContext<RenderableState>>) bb.getValue().createVMWTransition(initial, divisor);
				if(count == 0) transition.setDuration(100);
				transitionList.add(transition);
				count++;
			}
		} else {
			
			for(int i = 0; i < this.fakeTransitions; ++i) {
				transitionList.add(new Transition<>(initial.getAsPosition()
				, this.fTLength));
			}
		}
		
		
		
		
		
		// Swaps the last frame of the animation with
		// the initial position (much smoother lol)
		if(applySwap) {
			long curLength = transitionList.get(transitionList.size()-1).getDuration();
			transitionList.set(transitionList.size()-1, new Transition<>(initial.getAsPosition(), curLength));
		}
		
		
		
		//System.out.println("yo");
		
		/*
		System.out.println("---End--");
		System.out.println("Exporting transition list... " + transitionList.size());
		*/
		return transitionList;

	}

	public static class BlockbenchTransition {

		private float timestamp;
		private Vec3d rotation;
		private Vec3d translation;
		private SoundEvent sound;

		public BlockbenchTransition(float timestamp, Vec3d rotation, Vec3d translation) {
			this.timestamp = timestamp;
			this.rotation = rotation;
			this.translation = translation;
		}
		
		public void setSound(SoundEvent sound) {
			this.sound = sound;
		}

		public void directTransform() {
			GL11.glTranslated(translation.x / 25f, translation.y / 25f, translation.z / 25f);

			// Z, Y, X

			GL11.glRotated(rotation.x, 1, 0, 0);

			GL11.glRotated(rotation.y, 0, 1, 0);
			GL11.glRotated(rotation.z, 0, 0, 1);

			GL11.glScaled(1, 1, 1);
		}

		public Transition<?> createVMWTransition() {
			return new Transition<>((rc) -> {

				double mul = 0.01;
				GL11.glTranslated(-translation.x * mul, -translation.y * mul, translation.z * mul);

				// +Z, -Y, -X

				GL11.glRotated(rotation.z, 0, 0, 1);
				GL11.glRotated(rotation.y, 0, 1, 0);
				GL11.glRotated(rotation.x, 1, 0, 0);
			}, (int) timestamp);

		}
		
		
		public Transition<?> createVMWTransitionWithADS(Transform normal, Transform ads, double divisor) {
			Transition<?> trans =  new Transition<>((rc) -> {
				
				/*
				 * So you wanna mess with this code?
				 * 
				 * Warning: You will want to die. This code took like
				 * 2 weeks for some reason. You'll put one thing out of 
				 * order and you'll be working on it for weeks, even though
				 * it doesn't even seem like the problem.
				 */
				
				
				
				Transform t = normal;

				
				double rotXMult = 1.0;
				double rotYMult = 1.0;
				double rotZMult = 1.0;
				
				if(ClientModContext.getContext().getMainHeldWeapon().isAimed()) {
					rotXMult = 0.1;
					rotYMult = 0.1;
					rotZMult = 0.5;
				}
				
				double tesla = 0;
				if(divisor == 12.6) {
				
					tesla = BBLoader.HANDDIVISOR;
				} else if(divisor == 5) {
					tesla = BBLoader.GENDIVISOR;
				} else {
					tesla = divisor;
				}

				// Transform Multiplier (12x as small)
				double mul = 1 / tesla;
				
				// Original object positioning
				GlStateManager.translate(t.getPositionX(), t.getPositionY(), t.getPositionZ());

				// Animation translation
				GL11.glTranslated(translation.x * mul, -translation.y * mul, translation.z * mul);
				
				// Offset rotation point
				GlStateManager.translate(t.getRotationPointX(), t.getRotationPointY(), t.getRotationPointZ());
				
				// Original object rotation (+Z, -Y, -X)
				GL11.glRotated(t.getRotationZ(), 0, 0, 1);
				GL11.glRotated(rotation.z*rotZMult, 0, 0, 1);
				
				GL11.glRotated(t.getRotationY(), 0, 1, 0);
				GL11.glRotated(rotation.y*rotYMult, 0, 1, 0);
				
				GL11.glRotated(t.getRotationX(), 1, 0, 0);
				GL11.glRotated(rotation.x*rotXMult, 1, 0, 0);

				GlStateManager.translate(-t.getRotationPointX(), -t.getRotationPointY(), -t.getRotationPointZ());
				GlStateManager.scale(t.getScaleX(), t.getScaleY(), t.getScaleZ());

					
					
				
			}, (int) timestamp);
		//	System.out.println("Hello?! Brother! " + sound);
			trans.setSound(sound);
			
			return trans;
			
			
			

		}

		public Transition<?> createVMWTransition(Transform t, double divisor) {
			Transition<?> trans = new Transition<>((rc) -> {
				
				
				/*
				 * So you wanna mess with this code?
				 * 
				 * Warning: You will want to die. This code took like
				 * 2 weeks for some reason. You'll put one thing out of 
				 * order and you'll be working on it for weeks, even though
				 * it doesn't even seem like the problem.
				 */
				
				//System.out.println("hi " + " | " + timestamp + " | " + (int) timestamp);
				

				
				double rotXMult = 1.0;
				double rotYMult = 1.0;
				double rotZMult = 1.0;
				
				/*
				if(ClientModContext.getContext().getMainHeldWeapon().isAimed()) {
					rotXMult = 0.1;
					rotYMult = 0.1;
					rotZMult = 0.5;
				}*/
				
				double tesla = 0;
				if(divisor == 12.6) {
				
					tesla = BBLoader.HANDDIVISOR;
				} else if(divisor == 5) {
					tesla = BBLoader.GENDIVISOR;
				} else {
					tesla = divisor;
				}
				//System.out.println(tesla);
				
				// Transform Multiplier (12x as small)
				double mul = 1 / tesla;
				
				
				//System.out.println(tesla);
				
				//if(divisor == 5) mul = 0.0000000;
				
				// Original object positioning
				GlStateManager.translate(t.getPositionX(), t.getPositionY(), t.getPositionZ());

				// Animation translation
				GL11.glTranslated(translation.x * mul, -translation.y * mul, translation.z * mul);
				
				// Offset rotation point
				GlStateManager.translate(t.getRotationPointX(), t.getRotationPointY(), t.getRotationPointZ());

				
			
				
				// Original object rotation (+Z, -Y, -X)
				GL11.glRotated(t.getRotationZ(), 0, 0, 1);
				GL11.glRotated(rotation.z*rotZMult, 0, 0, 1);
				
				GL11.glRotated(t.getRotationY(), 0, 1, 0);
				GL11.glRotated(rotation.y*rotYMult, 0, 1, 0);
				
				GL11.glRotated(t.getRotationX(), 1, 0, 0);
				GL11.glRotated(rotation.x*rotXMult, 1, 0, 0);
				

				// Animation rotation
				
				
				
				
				
				
				

				// Revert rotation point
				GlStateManager.translate(-t.getRotationPointX(), -t.getRotationPointY(), -t.getRotationPointZ());

				
				
				
				// Original object scale
					GlStateManager.scale(t.getScaleX(), t.getScaleY(), t.getScaleZ());

					
					
				
			}, (int) Math.round(timestamp));
			
			
			
			
			//System.out.println("Hello?! Brother! " + sound);
			trans.setSound(sound);
			return trans;

		}

		public void showDebugCode() {
			System.out
					.println("GL11.glTranslated(" + translation.x + ", " + translation.y + ", " + translation.z + ");");
			System.out.println("GL11.glRotated(" + rotation.z + ", 0, 0, 1);");
			System.out.println("GL11.glRotated(" + rotation.y + ", 0, 1, 0);");
			System.out.println("GL11.glRotated(" + rotation.x + ", 1, 0, 0);");
			System.out.println("GL11.glScaled(1, 1, 1);");
		}

		@Override
		public String toString() {
			return "[(" + this.timestamp + ") " + this.rotation + " > " + this.translation + "]";
		}

		public float getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(float timestamp) {
			this.timestamp = timestamp;
		}

		public Vec3d getRotation() {
			return rotation;
		}

		public void setRotation(Vec3d rotation) {
			this.rotation = rotation;
		}

		public Vec3d getTranslation() {
			return translation;
		}

		public void setTranslation(Vec3d translation) {
			this.translation = translation;
		}

	}

	public TreeMap<Float, BlockbenchTransition> getBbTransition() {
		return bbTransition;
	}

	public void setBbTransition(TreeMap<Float, BlockbenchTransition> bbTransition) {
		this.bbTransition = bbTransition;
	}

	public ArrayList<Float> getTimestamps() {
		return timestamps;
	}

	public void setTimestamps(ArrayList<Float> timestamps) {
		this.timestamps = timestamps;
	}

}
