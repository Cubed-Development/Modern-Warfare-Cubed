package com.paneedah.weaponlib.animation;

import com.paneedah.weaponlib.KeyBindings;
import com.paneedah.weaponlib.tracking.PlayerEntityTracker;
import net.minecraft.entity.Entity;
import net.minecraft.util.text.TextComponentString;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.utils.ModReference.LOG;

public class DebugPositioner {

	private static final String WEAPONLIB_DEBUG_PROPERTY = "weaponlib.debug";

	private static Boolean debugModeEnabled;

	private static Object currentPart;

	private static Set<Object> debugParts = new HashSet<>();

	private static Entity watchableEntity;

	private static boolean isAdjustRotationMode;

	public static void setAdjustRotPoint(boolean status) {
		isAdjustRotationMode = status;
	}

	public static final class TransitionConfiguration {
		private long pause;

		public long getPause() {
			return pause;
		}

		public void setPause(long pause) {
			this.pause = pause;
		}
	}

	public static class Position {
		public float xRotation;
		public float yRotation;
		public float zRotation;

		public float x;
		public float y;
		public float z;

		public float rOffsetX;
		public float rOffsetY;
		public float rOffsetZ;

		public float scale = 1f;
		public float step = 0.025f;

		public float xrpm;
		public float yrpm;
		public float zrpm;

		private long lastAutorotationTimestamp = System.currentTimeMillis();
	}

	private static Map<Object, Position> partPositions = new HashMap<>();

	private static Map<Integer, TransitionConfiguration> transitionConfigurations = new HashMap<>();

	public static Position getCurrentPartPosition() {
		return partPositions.get(currentPart);
	}

	private static Position getDebugPartPosition(Object part) {
		return partPositions.get(part);
	}

	public static Matrix4f rotationMatrix() {

		Position partPosition = getCurrentPartPosition();

		if (partPosition == null)
			return new Matrix4f();
		// System.out.println(partPosition.xRotation + " | " + partPosition.yRotation +
		// " | " + partPosition.zRotation);
		return MatrixHelper.yawPitchRollToMatrix(Math.toRadians(partPosition.yRotation),
				Math.toRadians(partPosition.xRotation), Math.toRadians(partPosition.zRotation));
	}

	public static void incrementXRotation(float increment) {
		Position partPosition = getCurrentPartPosition();
		if (partPosition == null) {
			mc.player.sendMessage(new TextComponentString("Debug part not selected"));
			return;
		}

		partPosition.xRotation += increment;
		LOG.debug("Debug rotations: ({}, {}, {}) ", partPosition.xRotation, partPosition.yRotation,
				partPosition.zRotation);
	}

	public static void incrementYRotation(float increment) {
		Position partPosition = getCurrentPartPosition();
		if (partPosition == null) {
			mc.player.sendMessage(new TextComponentString("Debug part not selected"));
			return;
		}
		partPosition.yRotation += increment;
		LOG.debug("Debug rotations: ({}, {}, {}) ", partPosition.xRotation, partPosition.yRotation,
				partPosition.zRotation);
	}

	public static void incrementZRotation(float increment) {
		Position partPosition = getCurrentPartPosition();
		if (partPosition == null) {
			mc.player.sendMessage(new TextComponentString("Debug part not selected"));
			return;
		}
		partPosition.zRotation += increment;
		LOG.debug("Debug rotations: ({}, {}, {}) ", partPosition.xRotation, partPosition.yRotation,
				partPosition.zRotation);
	}

	public static void incrementXPosition(float increment, boolean altMode) {
		Position partPosition = getCurrentPartPosition();
		if (partPosition == null) {
			mc.player.sendMessage(new TextComponentString("Debug part not selected"));
			return;
		}
		if (altMode) {
			partPosition.rOffsetX += partPosition.step * increment;
			LOG.debug("Debug roffset: ({}, {}, {}) ", partPosition.rOffsetX, partPosition.rOffsetY,
					partPosition.rOffsetZ);
		} else {
			partPosition.x += partPosition.step * increment;
			LOG.debug("Debug position: ({}, {}, {}) ", partPosition.x, partPosition.y, partPosition.z);
		}
	}

	public static void incrementYPosition(float increment, boolean altMode) {
		Position partPosition = getCurrentPartPosition();
		if (partPosition == null) {
			mc.player.sendMessage(new TextComponentString("Debug part not selected"));
			return;
		}
		if (altMode) {
			partPosition.rOffsetY += partPosition.step * increment;
			LOG.debug("Debug roffset: ({}, {}, {}) ", partPosition.rOffsetX, partPosition.rOffsetY,
					partPosition.rOffsetZ);
		} else {
			partPosition.y += partPosition.step * increment;
			LOG.debug("Debug position: ({}, {}, {}) ", partPosition.x, partPosition.y, partPosition.z);
		}
	}

	public static void incrementZPosition(float increment, boolean altMode) {
		Position partPosition = getCurrentPartPosition();
		if (partPosition == null) {
			mc.player.sendMessage(new TextComponentString("Debug part not selected"));
			return;
		}
		if (altMode) {
			partPosition.rOffsetZ += partPosition.step * increment;
			LOG.debug("Debug roffset: ({}, {}, {}) ", partPosition.rOffsetX, partPosition.rOffsetY,
					partPosition.rOffsetZ);
		} else {
			partPosition.z += partPosition.step * increment;
			LOG.debug("Debug position: ({}, {}, {}) ", partPosition.x, partPosition.y, partPosition.z);
		}
	}

	public static void setScale(float scale) {
		Position partPosition = getCurrentPartPosition();
		if (partPosition == null) {
			mc.player.sendMessage(new TextComponentString("Debug part not selected"));
			return;
		}
		partPosition.scale = scale;
		LOG.debug("Scale set to {}", scale);
	}

	public static void setStep(float step) {
		Position partPosition = getCurrentPartPosition();
		if (partPosition == null) {
			mc.player.sendMessage(new TextComponentString("Debug part not selected"));
			return;
		}
		partPosition.step = step;
		LOG.debug("Step set to {}", step);
	}

	public static void setDebugMode(boolean enabled) {
		debugModeEnabled = enabled;
		if (debugModeEnabled) {
			KeyBindings.bindDebugKeys();
		}
	}

	public static boolean isDebugModeEnabled() {
		if (debugModeEnabled == null) {
			debugModeEnabled = Boolean.getBoolean(WEAPONLIB_DEBUG_PROPERTY);
		}
		return debugModeEnabled;
	}

	public static void reset() {
		Position partPosition = getCurrentPartPosition();
		if (partPosition == null) {
			mc.player.sendMessage(new TextComponentString("Debug part not selected"));
			return;
		}
		transitionConfigurations.clear();
		partPosition.x = partPosition.y = partPosition.z = partPosition.xRotation = partPosition.yRotation = partPosition.zRotation = partPosition.xrpm = partPosition.yrpm = partPosition.zrpm = partPosition.rOffsetX = partPosition.rOffsetY = partPosition.rOffsetZ = 0f;
		partPosition.scale = 1f;
		partPosition.step = 0.025f;
	}

	public static void setDebugPart(Object part) {
		currentPart = part;
		debugParts.add(part);
		partPositions.computeIfAbsent(part, p -> new Position());
	}

	public static Object getDebugPart() {
		return currentPart;
	}

	public static void configureTransitionPause(int transitionNumber, long pause) {
		TransitionConfiguration transitionConfiguration = getTransitionConfiguration(transitionNumber, true);
		transitionConfiguration.pause = pause;
	}

	public static TransitionConfiguration getTransitionConfiguration(int transitionNumber, boolean init) {
		return transitionConfigurations.computeIfAbsent(transitionNumber,
				k -> init ? new TransitionConfiguration() : null);
	}

	public static void position(Object part, Object renderContext) {
//        if(part != currentPart) {
//            return;
//        }

		
		boolean legacy = false;

		if (!debugParts.contains(part)) {
			return;
		}
		Position partPosition = getDebugPartPosition(part);
		if (partPosition == null) {
			return;
		}
		
		

		// reset();

		updateAutoIncrements(partPosition);
		GL11.glScalef(partPosition.scale, partPosition.scale, partPosition.scale);

		if (isAdjustRotationMode) {
			
			GL11.glTranslatef(partPosition.rOffsetX, partPosition.rOffsetY, partPosition.rOffsetZ);
			GL11.glTranslatef(partPosition.x, partPosition.y, partPosition.z);
			GL11.glRotatef(partPosition.zRotation, 0f, 0f, 1f);
			GL11.glRotatef(partPosition.yRotation, 0f, 1f, 0f);
			GL11.glRotatef(partPosition.xRotation, 1f, 0f, 0f);
			GL11.glTranslatef(-partPosition.rOffsetX, -partPosition.rOffsetY, -partPosition.rOffsetZ);
		} else {
			
			
			GL11.glTranslatef(partPosition.x, partPosition.y, partPosition.z);

			GL11.glTranslatef(partPosition.rOffsetX, partPosition.rOffsetY, partPosition.rOffsetZ);

			GL11.glRotatef(partPosition.zRotation, 0f, 0f, 1f);
			GL11.glRotatef(partPosition.xRotation, 1f, 0f, 0f);

			GL11.glRotatef(partPosition.yRotation, 0f, 1f, 0f);

			GL11.glTranslatef(-partPosition.rOffsetX, -partPosition.rOffsetY, -partPosition.rOffsetZ);
			
			
			
			
			/*
			GL11.glTranslatef(partPosition.rOffsetX, partPosition.rOffsetY, partPosition.rOffsetZ);

			
			GL11.glRotatef(partPosition.xRotation, 1f, 0f, 0f);

			GL11.glRotatef(partPosition.yRotation, 0f, 1f, 0f);
			GL11.glRotatef(partPosition.zRotation, 0f, 0f, 1f);
			GL11.glTranslatef(-partPosition.rOffsetX, -partPosition.rOffsetY, -partPosition.rOffsetZ);
			GL11.glTranslatef(partPosition.x, partPosition.y, partPosition.z);
			*/
			
			/*
			 * GL11.glRotatef(partPosition.xRotation, 1f, 0f, 0f);
			 * GL11.glRotatef(partPosition.yRotation, 0f, 1f, 0f);
			 * GL11.glRotatef(partPosition.zRotation, 0f, 0f, 1f);
			 * GL11.glTranslatef(partPosition.x, partPosition.y, partPosition.z);
			 */
		}

	}

	private static void updateAutoIncrements(Position partPosition) {
		if (partPosition.xrpm > 0 || partPosition.yrpm > 0 || partPosition.zrpm > 0) {
			long timeSinceLastIncrement = System.currentTimeMillis() - partPosition.lastAutorotationTimestamp;

			if (partPosition.xrpm > 0) {
				float rpms = partPosition.xrpm / 60000f;
				float expectedRotations = (float) timeSinceLastIncrement * rpms;
				float expectedDegrees = expectedRotations * 360f;
				partPosition.xRotation += expectedDegrees;
				partPosition.xRotation %= 360f;
			} else if (partPosition.yrpm > 0) {
				float rpms = partPosition.yrpm / 60000f;
				float expectedRotations = (float) timeSinceLastIncrement * rpms;
				float expectedDegrees = expectedRotations * 360f;
				partPosition.yRotation += expectedDegrees;
				partPosition.yRotation %= 360f;
			} else if (partPosition.zrpm > 0) {
				float rpms = partPosition.zrpm / 60000f;
				float expectedRotations = (float) timeSinceLastIncrement * rpms;
				float expectedDegrees = expectedRotations * 360f;
				partPosition.zRotation += expectedDegrees;
				partPosition.zRotation %= 360f;
			}
			partPosition.lastAutorotationTimestamp = System.currentTimeMillis();
		}
	}

	public static void showCode() {
		Position partPosition = getCurrentPartPosition();
		if (partPosition == null) {
			return;
		}
		if (isAdjustRotationMode) {
			StringBuilder result = new StringBuilder();
			result.append("Positioners.position(\n");
			result.append(String.format("    %ff, %ff, %ff,\n", partPosition.x, partPosition.y, partPosition.z));
			result.append(String.format("    %ff, %ff, %ff,\n", partPosition.xRotation, partPosition.yRotation,
					partPosition.zRotation));
			result.append(String.format("    %ff, %ff, %ff,\n", partPosition.rOffsetX, partPosition.rOffsetY,
					partPosition.rOffsetZ));
			result.append(
					String.format("    %ff, %ff, %ff\n", partPosition.scale, partPosition.scale, partPosition.scale));
			result.append(");\n");
			LOG.debug("Generated positioning code: \n" + result);
			System.out.println("\n" + result);
		} else {

			System.out.println(mc.player.getHeldItemMainhand());

			StringBuilder result = new StringBuilder();
			result.append(String.format("GL11.glScalef(%ff, %ff, %ff);\n", partPosition.scale, partPosition.scale,
					partPosition.scale));
			result.append(String.format("GL11.glTranslatef(%ff, %ff, %ff);\n", partPosition.x, partPosition.y,
					partPosition.z));

			result.append(String.format("GL11.glTranslatef(%ff, %ff, %ff);\n", partPosition.rOffsetX,
					partPosition.rOffsetY, partPosition.rOffsetZ));
			result.append(String.format("GL11.glRotatef(%ff, 0f, 0f, 1f);\n", partPosition.zRotation));
			result.append(String.format("GL11.glRotatef(%ff, 1f, 0f, 0f);\n", partPosition.xRotation));
			result.append(String.format("GL11.glRotatef(%ff, 0f, 1f, 0f);\n", partPosition.yRotation));
			result.append(String.format("GL11.glTranslatef(%ff, %ff, %ff);", -partPosition.rOffsetX,
					-partPosition.rOffsetY, -partPosition.rOffsetZ));
			LOG.debug("Generated positioning code: \n" + result);
			System.out.println("\n" + result);

			/*
			 * legacy StringBuilder result = new StringBuilder();
			 * result.append(String.format("GL11.glScalef(%ff, %ff, %ff);\n",
			 * partPosition.scale, partPosition.scale, partPosition.scale));
			 * result.append(String.format("GL11.glRotatef(%ff, 1f, 0f, 0f);\n",
			 * partPosition.xRotation));
			 * result.append(String.format("GL11.glRotatef(%ff, 0f, 1f, 0f);\n",
			 * partPosition.yRotation));
			 * result.append(String.format("GL11.glRotatef(%ff, 0f, 0f, 1f);\n",
			 * partPosition.zRotation));
			 * result.append(String.format("GL11.glTranslatef(%ff, %ff, %ff);",
			 * partPosition.x, partPosition.y, partPosition.z));
			 * log.debug("Generated positioning code: \n" + result);
			 * System.out.println("\n" + result);
			 */
		}

	}

	public static void watch() {
		PlayerEntityTracker tracker = PlayerEntityTracker.getTracker(mc.player);
		System.out.println("Trackable entities: " + tracker.getTrackableEntitites());
	}

	public static Entity getWatchableEntity() {
		return watchableEntity;
	}

	public static void showCurrentMatrix(String message) {
		showCurrentMatrix(null, message);
	}

	public static void showCurrentMatrix(Object part, String message) {
		if (part != null && part != DebugPositioner.currentPart) {
			return;
		}
		Matrix4f preparedPositionMatrix = MatrixHelper.captureMatrix();
		LOG.trace("Current matrix: {} {}", message, formatMatrix(preparedPositionMatrix));
	}

	public static String formatMatrix(Matrix4f m) {
		StringBuilder buf = new StringBuilder();
		buf.append("\n");
		buf.append(String.format("%4.2f %4.2f %4.2f %4.2f\n", m.m00, m.m10, m.m20, m.m30));
		buf.append(String.format("%4.2f %4.2f %4.2f %4.2f\n", m.m01, m.m11, m.m21, m.m31));
		buf.append(String.format("%4.2f %4.2f %4.2f %4.2f\n", m.m02, m.m12, m.m22, m.m32));
		buf.append(String.format("%4.2f %4.2f %4.2f %4.2f\n", m.m03, m.m13, m.m23, m.m33));
		return buf.toString();
	}

	public static void setAutorotate(float xrpm, float yrpm, float zrpm) {
		Position partPosition = getCurrentPartPosition();
		if (partPosition == null) {
			mc.player.sendMessage(new TextComponentString("Debug part not selected"));
			return;
		}

		isAdjustRotationMode = xrpm > 0f || yrpm > 0f || zrpm > 0f;
		partPosition.xrpm = xrpm;
		if (xrpm > 0) {
			partPosition.yRotation = partPosition.zRotation = 0f;
		}
		partPosition.yrpm = yrpm;
		if (yrpm > 0) {
			partPosition.xRotation = partPosition.zRotation = 0f;
		}
		partPosition.zrpm = zrpm;
		if (zrpm > 0) {
			partPosition.xRotation = partPosition.yRotation = 0f;
		}
	}

}
