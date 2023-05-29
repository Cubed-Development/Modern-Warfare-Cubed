package com.paneedah.weaponlib.animation;

import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.WeaponRenderer.Builder;
import com.paneedah.weaponlib.animation.gui.AnimationGUI;
import com.paneedah.weaponlib.debug.DebugRenderer;
import com.paneedah.weaponlib.render.Shaders;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Quaternion;

import java.awt.Color;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map.Entry;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class AnimationModeProcessor {

	

	private static HashMap<Integer, AttachmentCategory> extraIDRegistry = new HashMap<>();
	
	
	static {
		extraIDRegistry.put(4, AttachmentCategory.ACTION);
	}
	
	 
	private HashMap<AttachmentCategory, Boolean> shouldRender = new HashMap<>();
	private AttachmentCategory activeCategory;
	private AttachmentCategory exclusionCategory;
	
	private static AnimationModeProcessor instance = new AnimationModeProcessor();

	public boolean legacyMode = false;
	
	public Vec3d pan = Vec3d.ZERO;

	public Vec3d rot = Vec3d.ZERO;

	private boolean fpsMode = false;
	
	
	public FloatBuffer deferredMatrix = BufferUtils.createFloatBuffer(16);

	public AnimationModeProcessor() {

		for(Entry<Integer, AttachmentCategory> i : extraIDRegistry.entrySet()) {
			shouldRender.put(i.getValue(), true);
		}
		
	}
	
	public void setExcludedCategory(AttachmentCategory category) {
		this.exclusionCategory = category;
	}
	
	public AttachmentCategory getExcludedCategory() {
		return this.exclusionCategory;
	}
	
	public void setActiveCategory(AttachmentCategory category) {
		this.activeCategory = category;
	}
	
	public boolean shouldIsolateCategory() {
		return this.activeCategory != null;
	}
	
	public AttachmentCategory getIsolatedCategory() {
		return this.activeCategory;
	}
	
	public void flagRender(AttachmentCategory category, boolean status) {
		if(!shouldRender.containsKey(category)) {
			return;
		}
		shouldRender.put(category, status);
	}
	
	public boolean queryRender(AttachmentCategory category) {
		if(!shouldRender.containsKey(category)) {
			// If we should not concern ourselves with
			// it, just render it.
			return true;
		}
		return shouldRender.get(category);
	}
	
	public boolean getFPSMode() {
		return this.fpsMode;
	}
	
	public void setFPSMode(boolean state) {
		
		this.fpsMode = state;
	}

	public static AnimationModeProcessor getInstance() {
		return instance;
	}
	
	public boolean isLegacyMode() {
		return this.legacyMode;
	}
	
	public void captureDeferral() {
		deferredMatrix.rewind();
		GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, deferredMatrix);
		deferredMatrix.rewind();
	}
	
	public boolean mouseStatus = false;
	public boolean permissionToDrag = false;
	public boolean leftLock = false;
	public long leftClickLast = System.currentTimeMillis();

	public void onMouseClick() {

		// If the player is hovering over the GUI, just ignore all
		// interactions
		if(AnimationGUI.getInstance().grabStatus) return;
		
		// currentPartMatrix = DebugPositioner.rotationMatrix();
		if(OpenGLSelectionHelper.selectID > 0 && OpenGLSelectionHelper.selectID < 5) {
			ScaledResolution scaledresolution = new ScaledResolution(mc);
	        final int scaledWidth = scaledresolution.getScaledWidth();
	        final int scaledHeight = scaledresolution.getScaledHeight();
	        int mouseX = Mouse.getX() * scaledWidth / mc.displayWidth;
	        int mouseY = scaledHeight - Mouse.getY() * scaledHeight / mc.displayHeight - 1;
			atGrab = getTransformFromSelected().copy();
			Arcball.grab(mouseX, mouseY);
		}
		
		if(transformMode == -1) {
			transformMode = 1;
		}
		
		if (Mouse.isButtonDown(0) && !AnimationModeProcessor.instance.leftLock) {
			AnimationModeProcessor.instance.tryToUpdateSelectedColor(AnimationModeProcessor.instance.colorHover);
		}

		if ((colorHover != -1 || colorSelected != -1) && AnimationGUI.getInstance().axisToggle.isState()) {
			leftLock = false;
		} else if ((OpenGLSelectionHelper.currentlyHovering > 0 && OpenGLSelectionHelper.currentlyHovering < 5) || AnimationGUI.getInstance().grabStatus) {
			
			OpenGLSelectionHelper.selectID = OpenGLSelectionHelper.currentlyHovering;
			DebugPositioner.setDebugMode(true);
			switch (OpenGLSelectionHelper.selectID) {
			case 1:
				DebugPositioner.setDebugPart(Part.LEFT_HAND);
				break;
			case 2:
				DebugPositioner.setDebugPart(Part.RIGHT_HAND);
				break;
			case 3:
				DebugPositioner.setDebugPart(Part.MAIN_ITEM);
				break;
			}

		} else {
			leftLock = true;
			permissionToDrag = true;
		}
	}

	public void tryToUpdateSelectedColor(int i) {

		this.colorSelected = i;
	}

	public int transformMode = -1;
	
	public Transform atGrab;

	public boolean editRotationPointMode = false;
	
	
	public Matrix4f currentPartMatrix = new Matrix4f();
	
	public Builder getCurrentWeaponRenderBuilder() {
		return ClientModContext.getContext().getMainHeldWeapon().getWeapon().getRenderer().getWeaponRendererBuilder();
	}
	
	public Transform slideTransform = Transform.NULL.copy();
	
	public Transform getTransformFromSelected() {
		int i = OpenGLSelectionHelper.selectID;
		Builder b = getCurrentWeaponRenderBuilder();
		switch(i) {
		case 1:
			return b.firstPersonLeftHandTransform;
			
		case 2:
			return b.firstPersonRightHandTransform;
		case 3:
			return b.firstPersonTransform;
		case 4:
			return slideTransform;
		}
		return null;
		 
	}

	public void onTick() {
		
		
		
	
		
		//this.transformMode = 1;
		
		
		//mc.player.world.setWorldTime(6000);
		
		if(ClientModContext.getContext() != null && ClientModContext.getContext().getMainHeldWeapon() != null) {
			if(this.pwi == null || pwi != ClientModContext.getContext().getMainHeldWeapon()) {
				Builder builder = getCurrentWeaponRenderBuilder();
				pwi = ClientModContext.getContext().getMainHeldWeapon();
				//System.out.println("BUILDER: " + builder + " | PWI: " + pwi);
				backupFP = builder.firstPersonTransform.copy();
				backupFPL = builder.firstPersonLeftHandTransform.copy();
				backupFPR = builder.firstPersonRightHandTransform.copy();
			}
		}

		if(ClientEventHandler.muzzlePositioner) {
			DebugPositioner.setDebugPart(Part.NONE);
			OpenGLSelectionHelper.selectID = 4;
			transformMode = 1;
		}
		
		if(AnimationGUI.getInstance().editRotButton.isState()) {
			transformMode = 1;
			editRotationPointMode = true;
		} else {
			editRotationPointMode = false;
		}
		
		if (Mouse.isButtonDown(0) && !mouseStatus) {
			mouseStatus = true;
			onMouseClick();
			leftClickLast = System.currentTimeMillis();
		} else if ((mouseStatus && !Mouse.isButtonDown(0))) {
			mouseStatus = false;
			permissionToDrag = false;
			leftLock = false;
		}

		
		
		
		if(!Mouse.isButtonDown(0)) {
			
			AnimationModeProcessor.getInstance().atGrab = null;
		}


		
		double dx = Mouse.getDX();
		double dy = Mouse.getDY();
		if (permissionToDrag && colorSelected == -1) {

			if (Mouse.isButtonDown(0)) {
				// System.out.println(mc.mouseHelper.deltaX);
				// double x = mc.mouseHelper.deltaX/1.0;
				// double y = mc.mouseHelper.deltaY/300.0;

				
				
				double x = dx / 2f;
				double y = dy / 2f;
				rot = rot.add(-y, x, 0);
			}
		}
		if (colorSelected != -1 && Mouse.isButtonDown(0)) {
			// transformMode = 2;
			if (transformMode == 1) {
				float m = 0.2f;
				
				if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
					m /= 10;
				}
				
				Vec3d vec = Vec3d.ZERO;
				switch (colorSelected) {
				case 1:
					vec = new Vec3d(-dx * m, 0, 0);
					// DebugPositioner.incrementXPosition((float) -dx, false);
					break;
				case 2:
					vec = new Vec3d(0, -dy * m, 0);
					// DebugPositioner.incrementYPosition((float) -dy, false);

					break;
				case 3:
					vec = new Vec3d(0, 0, dx * m);
					// DebugPositioner.incrementZPosition((float) dx, false);

					break;
				}
				
				
				boolean modernMode = true;
				
				if(ClientEventHandler.muzzlePositioner) {
					ClientEventHandler.debugmuzzlePosition = ClientEventHandler.debugmuzzlePosition.add(-vec.x*m*0.1, vec.y*m*0.1, vec.z*m*0.1);
				} else if(!modernMode){
					 DebugPositioner.incrementXPosition((float) vec.x*m, false);
					 DebugPositioner.incrementYPosition((float) vec.y*m, false);
					 DebugPositioner.incrementZPosition((float) vec.z*m, false);
				} else if(AnimationGUI.getInstance().magEdit.isState()) {


					ClientEventHandler.magRotPositioner = ClientEventHandler.magRotPositioner.add(vec.x*m, vec.y*m, vec.z*m);
					
				} else {
					
					if(!editRotationPointMode) {
						Transform t = getTransformFromSelected();
						
						
						t.withPosition(t.getPositionX() + vec.x*m, t.getPositionY() + vec.y*m, t.getPositionZ() + vec.z*m);
						
						if(AnimationGUI.getInstance().leftDrag.isState()) t.withRotation(t.getRotationX(), t.getRotationY()-vec.x*0.4, t.getRotationZ());
						
					} else {
						Transform t = getTransformFromSelected();
						
						
						t.withRotationPoint(t.getRotationPointX() + vec.x*m, t.getRotationPointY() + vec.y*m, t.getRotationPointZ() + vec.z*m);
						
					}
					
					
				}
				
				
				 
			} else {
				
				

				Vec3d vec = Vec3d.ZERO;
				switch (colorSelected) {
				case 1:

					vec = new Vec3d(0, 1, 0);
					// DebugPositioner.incrementYRotation((float) ((float) -dx));

					// DebugPositioner.incrementXPosition((float) -dx, false);
					break;
				case 2:

					vec = new Vec3d(1, 0, 0);
					// DebugPositioner.incrementXRotation((float) -dy);
					break;
				case 3:
					vec = new Vec3d(0, 0, 1);
					// DebugPositioner.incrementZRotation((float) dy);

					break;
				}

				// DebugPositioner.setAutorotate(0, 0, 0);
				// Matrix4f rotte = DebugPositioner.rotationMatrix();
				// System.out.println(currentPartMatrix);
				/*
				 * Matrix4f rotte = new Matrix4f(DebugPositioner.rotationMatrix());
				 * //rotte.invert(); rotte.transpose(); float m = (float) -dy*0.5f;
				 * 
				 * 
				 * 
				 * 
				 * double[] angles = MatrixHelper.MatrixToYawPitchRoll(rotte); Position i =
				 * DebugPositioner.getCurrentPartPosition(); i.xRotation = (float)
				 * Math.toDegrees(angles[0]); i.yRotation = (float) Math.toDegrees(angles[1]);
				 * i.zRotation = (float) Math.toDegrees(angles[2]);
				 * 
				 */

				// DebugPositioner.setAdjustRotPoint(false);

				float m = (float) -dy * 0.35f;

				
				boolean modernMode = true;
				
				
				 ScaledResolution scaledresolution = new ScaledResolution(mc);
			        final int scaledWidth = scaledresolution.getScaledWidth();
			        final int scaledHeight = scaledresolution.getScaledHeight();
			        int mouseX = Mouse.getX() * scaledWidth / mc.displayWidth;
			        int mouseY = scaledHeight - Mouse.getY() * scaledHeight / mc.displayHeight - 1;
			    
					Quaternion quat = Arcball.runArcBall(mouseX, mouseY);
					double[] quangles = MatrixHelper.toEulerAngles(quat);
					
					
				
				
				if(!modernMode) {
					DebugPositioner.incrementXRotation((float) (vec.x * m));
					DebugPositioner.incrementYRotation((float) (vec.y * m));
					DebugPositioner.incrementZRotation((float) (vec.z * m));

				} else {
					Builder i = ClientModContext.getContext().getMainHeldWeapon().getWeapon().getRenderer().getWeaponRendererBuilder();
					Transform t = getTransformFromSelected();
					
					
					
					
					
				if(atGrab != null)	{
					t.withRotation(atGrab.getRotationX() + Math.toDegrees(quangles[0])*vec.x, atGrab.getRotationY() + Math.toDegrees(quangles[1])*vec.y, atGrab.getRotationZ() + -Math.toDegrees(quangles[2])*vec.z);
				}
				t.printTransform();
					//t.withRotation(t.getRotationX() + vec.x*m*0.1, t.getRotationY() + vec.y*m*0.1, t.getRotationZ() + vec.z*m*0.1);
					
				}
				
				
			
				// System.out.println(currentPartMatrix);

				// System.out.println(axis);

				/*
				 * Matrix4f rotte = new Matrix4f(DebugPositioner.rotationMatrix());
				 * 
				 * 
				 * Matrix4f axisM = currentPartMatrix; Vector3f axis = new Vector3f(axisM.m10,
				 * axisM.m11, axisM.m12);
				 * 
				 * //rotte.setIdentity();
				 * 
				 * //Matrix4f testMa = MatrixHelper.yawPitchRollToMatrix(vec.x*m, vec.y*m,
				 * vec.z*m); // axis = (Vector3f) axis.scale(-1); axis.normalise();
				 * System.out.println(axis);
				 * 
				 * Matrix4f rot = new Matrix4f(); rot.rotate((float) Math.toRadians(2), axis);
				 * 
				 * 
				 * 
				 * //rot.invert();
				 * 
				 * Matrix4f.mul(rotte, rot, rotte);
				 * 
				 * double[] angles = MatrixHelper.MatrixToYawPitchRoll(rotte); Position i =
				 * DebugPositioner.getCurrentPartPosition(); i.yRotation = (float)
				 * Math.toDegrees(angles[0]); i.xRotation = (float) Math.toDegrees(angles[1]);
				 * i.zRotation = (float) Math.toDegrees(angles[2]);
				 * 
				 */

				// i.zRotation = 45f;

				/*
				 * i.x = rotte.m30; i.y = rotte.m31; i.z = rotte.m32;
				 */

				/*
				 * i.xRotation = 0; i.yRotation = 0; i.zRotation = 0;
				 * 
				 * i.x = 0; i.y = 0; i.z = 0;
				 */
				// Position i = DebugPositioner.getCurrentPartPosition();

				/*
				 * i.rOffsetY = 0f; i.rOffsetZ = 0f; i.rOffsetX = 0f;
				 */

				/*
				 * float m = (float) -dy*0.5f; Position i =
				 * DebugPositioner.getCurrentPartPosition(); Quaternion quat =
				 * MatrixHelper.fromEulerAngles(i.z, i.x, i.y);
				 * 
				 * Quaternion q2 = new Quaternion(); q2.setFromAxisAngle(new Vector4f((float)
				 * Math.toRadians(120), 1, 120, 0));
				 * 
				 * Quaternion.mul(quat, q2, quat);
				 * 
				 * double[] angle = MatrixHelper.toEulerAngles(quat); i.zRotation = (float)
				 * Math.toDegrees(angle[0]); i.xRotation = (float) Math.toDegrees(angle[1]);
				 * i.yRotation = (float) Math.toDegrees(angle[2]);
				 */

				/*
				 * Matrix4f test = new Matrix4f(); test.m10 = -69; System.out.println(test);
				 */
				// System.out.println("yo");
				// vec = new Vec3d(1, 0, 0);

				/*
				 * vec = ModelRenderTool.transformViaMatrix(vec, rotte);
				 * 
				 * 
				 * double[] angles = MatrixHelper.MatrixToYawPitchRoll(rotte); Position i =
				 * DebugPositioner.getCurrentPartPosition(); i.yRotation = (float)
				 * Math.toDegrees(angles[0]); i.xRotation = (float) Math.toDegrees(angles[1]);
				 * i.zRotation = (float) Math.toDegrees(angles[2]);
				 * 
				 * if(1+1==3) { i.yRotation = 0; i.xRotation = 0; i.zRotation = 0; }
				 */
				/*
				 * Position i = DebugPositioner.getCurrentPartPosition();
				 * 
				 * if(1+1==2) { i.yRotation = 0; i.xRotation = 0; i.zRotation = 0; }
				 */

				// DebugPositioner.incrementXRotation((float) (m));

				/*
				 * DebugPositioner.incrementXRotation((float) (vec.x*m));
				 * DebugPositioner.incrementYRotation((float) (vec.y*m));
				 * DebugPositioner.incrementZRotation((float) (vec.z*m));
				 */

			}

		}
		if (Mouse.isButtonDown(1)) {
			// System.out.println(Mouse.getDX());
			double x = dx / 10f;
			double y = dy / 10f;

			// double x = mc.mouseHelper.deltaX/120.0;
			// double y = mc.mouseHelper.deltaY/120.0;
			pan = pan.add(-x, -y, 0);
		}

		// rot = Vec3d.ZERO;
	}

	public int colorSelected = -1;
	public int colorHover = -1;
	
	public PlayerWeaponInstance pwi;
	public Transform backupFP;
	public Transform backupFPL;
	public Transform backupFPR;

	/**
	 * Re-positioner tools
	 */

	public void renderTransformIndicator(float scalar) {
		//GlStateManager.enableRescaleNormal();
		
		GlStateManager.disableDepth();
		if(!AnimationGUI.getInstance().axisToggle.isState()) return;
		
		
		
		
		GlStateManager.pushMatrix();
		if(AnimationGUI.getInstance().moveForward.isState()) GlStateManager.translate(0, 0, -4);
		
		
		if (transformMode == 1) {
			if(editRotationPointMode) {
				Transform t = getTransformFromSelected();
				

				
				
				GlStateManager.pushMatrix();
				GlStateManager.translate(t.getRotationPointX()+t.getPositionX(), t.getRotationPointY()+t.getPositionY(), t.getRotationPointZ()+t.getPositionZ());
				GlStateManager.scale(3, 3, 3);
				renderAtlas(scalar*5);
				
				GlStateManager.disableDepth();
				renderLightAxisRing(new Vec3d(0, 1, 0), Color.red, 0.2f, 0.1f, true, false);
				
				DebugRenderer.setupBasicRender();
				DebugRenderer.renderPoint(Vec3d.ZERO, new Vec3d(1, 0, 0));
				DebugRenderer.destructBasicRender();
				//GlStateManager.enableDepth();
				//renderLightAxisRing(new Vec3d(0, 0, 1), Color.red, 0.2f, 0.1f, true, false);
				
				
				
				
				
				GlStateManager.popMatrix();
				
				
				
			} else {
				
				renderAtlas(scalar);
			}
			
			
			
		} else if(transformMode == 2){
           renderRotAxis(scalar);
		} else {
			//OpenGLSelectionHelper.ballBuf.framebufferClear();
		//	mc.getFramebuffer().bindFramebuffer(false);
			//OpenGLSelectionHelper.ballBuf.bindFramebuffer(false);
		
			renderCross();
			
			
			
			
		}
		//GlStateManager.disableRescaleNormal();
		GlStateManager.popMatrix();
		GlStateManager.enableTexture2D();
		GlStateManager.enableLighting();
	}

	public void renderCross() {
		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		//DebugRenderer.setupBasicRender();
		GlStateManager.disableTexture2D();
		GlStateManager.disableLighting();
	
		GlStateManager.color(1f, 1f, 1f, 1);
		bb.begin(GL11.GL_LINES, DefaultVertexFormats.POSITION);
		
		bb.pos(0, -1, 0).endVertex();
		bb.pos(0, 1, 0).endVertex();
		
		bb.pos(-1, 0, 0).endVertex();
		bb.pos(1, 0, 0).endVertex();
		
		bb.pos(0, 0, -1).endVertex();
		bb.pos(0, 0, 1).endVertex();
		GlStateManager.color(1.0f, 1f, 1f);
		GlStateManager.enableTexture2D();
		//DebugRenderer.destructBasicRender();
		t.draw();
	
	}
	
	public FloatBuffer VIEW_BUFFER = BufferUtils.createFloatBuffer(16);
	
	public void renderRotAxis(float scalar) {
		GlStateManager.color(1, 1, 1);
		GL11.glLineWidth(5f);
		GlStateManager.disableTexture2D();
		GlStateManager.disableLighting();

		float size = (float) ((float) 0.08f*pan.z);
		float innerSize = (float) ((float) size - (AnimationModeProcessor.instance.pan.z) * 0.01);
		
		GlStateManager.pushMatrix();
		//GlStateManager.disableDepth();
		
		VIEW_BUFFER.rewind();
		GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, VIEW_BUFFER);
		
		FloatBuffer modifiedView = BufferUtils.createFloatBuffer(16);
		
		
		Matrix4f mat = new Matrix4f();
		VIEW_BUFFER.rewind();
		mat.load(VIEW_BUFFER);
		
		mat.m30 = 0f;
		mat.m31 = 0f;
		mat.m32 = 0f;
		
		mat.invert();
		

		mat.store(modifiedView);
		
		//System.out.println(mat);
		modifiedView.rewind();
		
		GL11.glLineWidth(2.0f);
		GlStateManager.multMatrix(modifiedView);
		GlStateManager.disableDepth();
		renderLightAxisRing(Vec3d.ZERO, Color.GRAY.brighter(), 0f, size*5.5f, false, false);
		
		
		GlStateManager.enableDepth();
		
		/*
		GlStateManager.disableDepth();
		GlStateManager.enableBlend();
		//GlStateManager.color(1, 1, 1, 0.2f);
		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		bb.begin(GL11.GL_TRIANGLE_FAN, DefaultVertexFormats.POSITION);
		
		bb.pos(0, 0, 0).endVertex();
		for(double i = 0; i <= 2*Math.PI; i += 2*Math.PI/31) {
			
			bb.pos(Math.cos(i)*size*2.5, Math.sin(i)*size*2.5, 0).endVertex();
		}
		
		t.draw();
		*/

		GlStateManager.popMatrix();
	
		

		GlStateManager.enableBlend();
		
		
		OpenGLSelectionHelper.ballBuf.framebufferClear();
		OpenGLSelectionHelper.ballBuf.bindFramebuffer(false);
		
		
		renderAxisRing(new Vec3d(1, 0, 0), Color.RED, size, innerSize, (colorSelected == -1 || colorSelected == 1), false);
		renderAxisRing(Vec3d.ZERO, Color.BLUE, size, innerSize, (colorSelected == -1 || colorSelected == 3), false);
		renderAxisRing(new Vec3d(0, 1, 0), Color.GREEN, size, innerSize, (colorSelected == -1 || colorSelected == 2), false);
		
		mc.getFramebuffer().bindFramebuffer(false);
		
		//GlStateManager.disableDepth();
		GL11.glLineWidth(1.5f);
		
		Shaders.axis.use();
		
		float panValue = (float) pan.length()*1.7f;
		
		panValue = Math.max(45f, panValue);
		Shaders.axis.uniform1f("zoom", panValue);
		
		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();
		GlStateManager.enableDepth();
		
	
		GlStateManager.disableDepth();
		renderLightAxisRing(new Vec3d(1, 0, 0), new Color(0xff3838), size, innerSize, (colorSelected == -1 || colorSelected == 1), (colorSelected == 1 || colorHover == 1));
		renderLightAxisRing(Vec3d.ZERO, new Color(0x32ff7e), size, innerSize, (colorSelected == -1 || colorSelected == 3), (colorSelected == 3 || colorHover == 3));
		renderLightAxisRing(new Vec3d(0, 1, 0), new Color(0x18dcff), size, innerSize, (colorSelected == -1 || colorSelected == 2), (colorSelected == 2 || colorHover == 2));
		
		
		Shaders.axis.release();
		/*
		if (colorSelected == -1 || colorSelected == 3) {
			renderCircleOutline(Color.blue, 1, 0, 0, size, innerSize);
		} else {
			renderCircleOutline(Color.blue, 0.2, 0, 0, size, innerSize);

		}

		if (colorSelected == -1 || colorSelected == 2) {
			GlStateManager.pushMatrix();
			GlStateManager.rotate(90f, 0, 1, 0);
			renderCircleOutline(Color.GREEN, 1, 0, 0, size, innerSize);
			GlStateManager.popMatrix();
		} else {
			GlStateManager.pushMatrix();
			GlStateManager.rotate(90f, 0, 1, 0);
			renderCircleOutline(Color.GREEN, 0.2, 0, 0, size, innerSize);
			GlStateManager.popMatrix();
		}

		if (colorSelected == -1 || colorSelected == 1) {
			GlStateManager.pushMatrix();
			GlStateManager.rotate(90f, 1, 0, 0);
			renderCircleOutline(Color.RED, 1, 0, 0, size, innerSize);
			GlStateManager.popMatrix();
		} else {
			GlStateManager.pushMatrix();
			GlStateManager.rotate(90f, 1, 0, 0);
			renderCircleOutline(Color.RED, 0.2, 0, 0, size, innerSize);
			GlStateManager.popMatrix();
		}
		*/
	}
	
	public void renderLightAxisRing(Vec3d axis, Color c, float outer, float inner, boolean held, boolean hovered) {
		
		//DebugPositioner.setDebugMode(enabled);
		
		if (hovered) {
			c = new Color(0x48dbfb);
		}

		float size = (outer+inner)/2f;
		
		float r = c.getRed() / 255f;
		float b = c.getBlue() / 255f;
		float g = c.getGreen() / 255f;

		float al = 1.0f;
		if (!held)
			al = 0.5f;
		GlStateManager.pushMatrix();
		GlStateManager.disableTexture2D();
		if(axis.lengthSquared() != 0) {
			GlStateManager.rotate(90f, (float) axis.x, (float) axis.y, (float) axis.z);
		}
		
		
		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		bb.begin(GL11.GL_LINE_STRIP, DefaultVertexFormats.POSITION_COLOR);
		
		for(double a = 0; a <= 2*Math.PI; a += Math.PI/14) {
			
			bb.pos(Math.cos(a)*size, Math.sin(a)*size, 0).color(r, g, b, al).endVertex();
		}
		
		t.draw();
		
		
		//renderCircleOutline(c, al, 0, 0, outer, inner);
		GlStateManager.popMatrix();
	}
	public void renderAxisRing(Vec3d axis, Color c, float outer, float inner, boolean held, boolean hovered) {
		
		if (hovered) {
			c = new Color(0x48dbfb);
		}

		float r = c.getRed() / 255f;
		float b = c.getBlue() / 255f;
		float g = c.getGreen() / 255f;

		float al = 1.0f;
		if (!held)
			al = 0.5f;
		GlStateManager.pushMatrix();
		if(axis.lengthSquared() != 0) {
			GlStateManager.rotate(90f, (float) axis.x, (float) axis.y, (float) axis.z);
		}
		
		renderCircleOutline(c, al, 0, 0, outer, inner);
		GlStateManager.popMatrix();
	}

	public void renderHollowCircle() {

	}

	public void renderAtlas(float scalar) {
		
		GlStateManager.color(1, 1, 1);

		GlStateManager.disableTexture2D();
		GlStateManager.disableLighting();

		GlStateManager.enableBlend();
		
		GlStateManager.disableDepth();
		GL11.glLineWidth((float) Math.abs(1 / pan.z) * 50);
		OpenGLSelectionHelper.ballBuf.framebufferClear();
		OpenGLSelectionHelper.ballBuf.bindFramebuffer(false);
		drawArrow(new Vec3d(1, 0, 0), Color.RED, 1, 1, (colorSelected == -1 || colorSelected == 1),
				false);
		drawArrow(new Vec3d(0, 1, 0), Color.GREEN, -1, 1, (colorSelected == -1 || colorSelected == 2),
				false);
		drawArrow(new Vec3d(0, 0, 1), Color.BLUE, 1, 1, (colorSelected == -1 || colorSelected == 3),
				false);

		GL11.glLineWidth((float) Math.abs(1 / pan.z) * 15);
		
		
		mc.getFramebuffer().bindFramebuffer(false);
		//if(1+1==2) return;
	//	GlStateManager.disableDepth();
		//GlStateManager.disableDepth();
		GlStateManager.disableDepth();
		drawArrow(new Vec3d(1, 0, 0), new Color(0xff3838), 1, 1, (colorSelected == -1 || colorSelected == 1),
				(colorHover == 1 || colorSelected == 1));
		drawArrow(new Vec3d(0, 1, 0), new Color(0x32ff7e), -1, 1, (colorSelected == -1 || colorSelected == 2),
				(colorHover == 2 || colorSelected == 2));
		drawArrow(new Vec3d(0, 0, 1), new Color(0x18dcff), 1, 1, (colorSelected == -1 || colorSelected == 3),
				(colorHover == 3 || colorSelected == 3));
	//	GlStateManager.enableDepth();
		GlStateManager.enableTexture2D();
		GlStateManager.enableLighting();
		GlStateManager.disableBlend();
		/*
		 * Tessellator t = Tessellator.getInstance(); BufferBuilder bb = t.getBuffer();
		 * bb.begin(GL11.GL_LINES, DefaultVertexFormats.POSITION_COLOR);
		 * 
		 * 
		 * if(colorSelected == -1 || colorSelected == 1 && colorHover != 1) { bb.pos(0,
		 * 0, 0).color(1f, 0, 0, 1).endVertex(); bb.pos(2*scalar, 0, 0).color(1f, 0, 0,
		 * 1).endVertex(); } else if(colorHover != 1){
		 * 
		 * bb.pos(0, 0, 0).color(1f, 0, 0, 0.5f).endVertex(); bb.pos(2*scalar, 0,
		 * 0).color(1f, 0, 0, 0.5f).endVertex();
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * if(colorSelected == -1 || colorSelected == 2) { bb.pos(0, 0, 0).color(0f, 1,
		 * 0, 1).endVertex(); bb.pos(0, -2*scalar, 0).color(0f, 1, 0, 1).endVertex(); }
		 * else { bb.pos(0, 0, 0).color(0f, 1, 0, 0.5f).endVertex(); bb.pos(0,
		 * -2*scalar, 0).color(0f, 1, 0, 0.5f).endVertex(); }
		 * 
		 * if(colorSelected == -1 || colorSelected == 3) { bb.pos(0, 0, 0).color(0f, 0,
		 * 1, 1).endVertex(); bb.pos(0, 0, 2*scalar).color(0f, 0, 1, 1).endVertex(); }
		 * else { bb.pos(0, 0, 0).color(0f, 0, 1, 0.5f).endVertex(); bb.pos(0, 0,
		 * 2*scalar).color(0f, 0, 1, 0.5f).endVertex(); }
		 * 
		 * 
		 * 
		 * 
		 * t.draw();
		 */

		// Tessellator t = Tessellator.getInstance();
		// BufferBuilder b = t.getBuffer();
	}
	
	
	public void drawAlignmentWidget(float size) {
		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		bb.begin(GL11.GL_LINES, DefaultVertexFormats.POSITION_COLOR);
		
		
		bb.pos(0, 0, 0).color(1, 0, 0, 1).endVertex();
		bb.pos(1, 0, 0).color(1, 0, 0, 1).endVertex();
		
		
		bb.pos(0, 0, 0).color(0, 1, 0, 1).endVertex();
		bb.pos(0, 1, 0).color(0, 1, 0, 1).endVertex();
		
		bb.pos(0, 0, 0).color(0, 0, 1, 1).endVertex();
		bb.pos(0, 0, 1).color(0, 0, 1, 1).endVertex();
		
		t.draw();
		
	}

	public void drawArrow(Vec3d dir, Color c, float size, float ct, boolean held, boolean hovered) {

		if (hovered) {
			c = new Color(0x48dbfb);
		}

		float r = c.getRed() / 255f;
		float b = c.getBlue() / 255f;
		float g = c.getGreen() / 255f;

		float al = 1.0f;
		if (!held)
			al = 0.5f;

		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		bb.begin(GL11.GL_LINES, DefaultVertexFormats.POSITION_COLOR);

		bb.pos(0, 0, 0).color(r, g, b, al).endVertex();
		bb.pos(dir.x * size, dir.y * size, dir.z * size).color(r, g, b, al).endVertex();

		t.draw();

		bb.begin(GL11.GL_TRIANGLE_STRIP, DefaultVertexFormats.POSITION_COLOR);

		double x = dir.x * size;
		double y = 0;

		for (double a = 0; a <= Math.PI * 2; a += (Math.PI / 7)) {
			double cos = -Math.cos(a) * size / 10;
			double sin = -Math.sin(a) * size / 10;

			if (Math.abs(dir.x) == 1) {
				bb.pos((dir.x * size), cos, y + sin).color(r, g, b, al).endVertex();
				bb.pos((dir.x * size) + size / 5, 0, 0).color(r, g, b, al).endVertex();

			} else if (Math.abs(dir.y) == 1) {
				bb.pos(x + cos, (dir.y * size), y + sin).color(r, g, b, al).endVertex();
				bb.pos(x, ((dir.y * size) + size / 5), 0).color(r, g, b, al).endVertex();

			} else {
				bb.pos(x + cos, y + sin, dir.z * size).color(r, g, b, al).endVertex();
				bb.pos(x, 0, dir.z * size + size / 5).color(r, g, b, al).endVertex();

			}
		}

		t.draw();

	}

	public void applyCameraTransforms() {

		GL11.glTranslated(pan.x, pan.y, pan.z);
		GL11.glRotatef((float) rot.x, 1f, 0f, 0f);
		GL11.glRotatef((float) rot.y, 0f, 1f, 0f);
		GL11.glRotatef((float) rot.z, 0f, 0f, 1f);

	}

	/**
	 * Render
	 */

	public static void renderCircleOutline(Color c, double alpha, double x, double y, double outerRadius,
			double innerRadius) {
		renderHalfCircle(c, alpha, x, y, outerRadius, innerRadius, 0, 360);
	}

	public static void renderHalfCircle(Color c, double alpha, double x, double y, double outerRadius,
			double innerRadius, double beginAngle, double finishAngle) {

		// System.out.println("fuck");

		float red = c.getRed() / 255.0f;
		float blue = c.getBlue() / 255.0f;
		float green = c.getGreen() / 255.0f;
		// float alpha = c.getAlpha()/255.0f;

		GL11.glPushMatrix();

		GlStateManager.disableTexture2D();
		//GlStateManager.disableDepth();
		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();
		// GL11.glBlendFunc(GL11.GL_SRC_ALPHA_SATURATE, GL11.GL_ONE);

		// GL11.glEnable(GL11.GL_POLYGON_SMOOTH);
		/*
		 * GL11.glEnable(GL13.GL_MULTISAMPLE);
		 * GL11.glHint(NVMultisampleFilterHint.GL_MULTISAMPLE_FILTER_HINT_NV,
		 * GL11.GL_NICEST);
		 * System.out.println(GL11.glGetInteger(GL13.GL_SAMPLE_BUFFERS));
		 */
		GlStateManager.color(1.0f, 1.0f, 1.0f);
		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		double endAng = 0;
		bb.begin(GL11.GL_TRIANGLE_STRIP, DefaultVertexFormats.POSITION_COLOR);
		for (double a = beginAngle; a <= finishAngle; a += 12) {
			double cos = -Math.cos(Math.toRadians(a)) * outerRadius;
			double sin = -Math.sin(Math.toRadians(a)) * outerRadius;

			double cosI = -Math.cos(Math.toRadians(a)) * innerRadius;
			double sinI = -Math.sin(Math.toRadians(a)) * innerRadius;

			bb.pos(x + cos, y + sin, -0.05).color(red, green, blue, (float) alpha).endVertex();
			bb.pos(x + cosI, y + sinI, 0.025).color(red, green, blue, (float) alpha).endVertex();

			endAng = a;
		}
		
		


		

		t.draw();

		// GL11.glDisable(GL11.GL_POLYGON_SMOOTH);
		GlStateManager.disableAlpha();
		GlStateManager.enableTexture2D();
		GlStateManager.disableBlend();
		GlStateManager.enableDepth();
		GL11.glPopMatrix();
	}

}
