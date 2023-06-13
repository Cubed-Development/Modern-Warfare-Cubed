package com.paneedah.weaponlib.vehicle;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.animation.MatrixHelper;
import com.paneedah.weaponlib.debug.DebugRenderer;
import com.paneedah.weaponlib.vehicle.collisions.GJKResult;
import com.paneedah.weaponlib.vehicle.collisions.OBBCollider;
import com.paneedah.weaponlib.vehicle.collisions.OreintedBB;
import com.paneedah.weaponlib.vehicle.collisions.RigidBody;
import com.paneedah.weaponlib.vehicle.jimphysics.InterpolationKit;
import com.paneedah.weaponlib.vehicle.jimphysics.solver.SuspensionSolver;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;

import javax.vecmath.Matrix3f;
import javax.vecmath.Vector3d;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class RenderVehicle2 extends Render<Entity> {
	
	public static final ResourceLocation VEHICLE_SHADOW = new ResourceLocation(ModReference.ID + ":textures/entity/vehicleshadow.png");
	
	
    private static ThreadLocal<Matrix4f> cameraTransformMatrix = new ThreadLocal<>();

	private static ResourceLocation field_110782_f;
	
	private StatefulRenderer<VehicleRenderableState> mainRenderer;
	
	private VehicleRenderableState currentRenderableState;
	
	
	public static Matrix4f tm = new Matrix4f();
	
	
	public static SuspensionSolver susSolve = new SuspensionSolver(271, 1.0);
	
	
	
	public RenderVehicle2(StatefulRenderer<VehicleRenderableState> mainRenderer) {
		super(mc.getRenderManager());

		this.shadowSize = 0.5F;
		this.mainRenderer = mainRenderer;
	}
	
	public RigidBody bruhBody = null;
	
	
	public void rigidBodyTest(EntityVehicle v) {
		try {
			
		
		DebugRenderer.setupBasicRender();
		
		Vec3d playerPos = mc.player.getPositionVector();
		
		GL11.glTranslated(-playerPos.x, -playerPos.y, -playerPos.z);
		//bruhBody = null;
		
		Vec3d posVec = v.getPositionVector();
		if(this.bruhBody == null) {
			this.bruhBody = new RigidBody(v.world, posVec.x, posVec.y+10, posVec.z);
			OreintedBB obb = new OreintedBB(new AxisAlignedBB(-1, -1, -1, 1, 1, 1));
			obb.setupPhysically(175);
			this.bruhBody.addColliders(obb);
		}
		
		this.bruhBody.minecraftTimestep();
		
		
		Vec3d p = this.bruhBody.position;
		Vec3d adjP = v.getPositionVector().subtract(p);
		GL11.glTranslated(p.x, p.y, p.z);
		this.bruhBody.colliders.get(0).renderOBB();
		
		DebugRenderer.destructBasicRender();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("fuck!");
		}
	}
	
	
	
	public void OBBTest() {
	
		DebugRenderer.setupBasicRender();
		
		GL11.glTranslated(0.0, -5.0, 0.0);
		OreintedBB ob2 = new OreintedBB(new AxisAlignedBB(-1, -1, -1, 1, 1, 1));
		ob2.move(1.0, 2.1, 0.0);
		ob2.rotate(Math.toRadians(0.0), Math.toRadians(0.0), Math.toRadians(45.0));
		
		
		
		
		
		OreintedBB ob = new OreintedBB(new AxisAlignedBB(-1, -1, -1, 1, 1, 1));
		ob.rotate(Math.toRadians(0.0), Math.toRadians(0.0), Math.toRadians(15.0));
		
		// test raytrace
//		/Vec3d o = ob.doRayTrace(new Vec3d(-2, 0, 0), new Vec3d(2, 0, 0)).hitVec;
		
		// test collision
		GJKResult result = OBBCollider.areColliding(ob, ob2);
		if(result.status == GJKResult.Status.COLLIDING) {
			Vec3d sepVec = result.separationVector.scale(result.penetrationDepth);
			ob2.move(sepVec.x, sepVec.y, sepVec.z);
			
			DebugRenderer.renderPoint(result.contactPointA, new Vec3d(0, 0, 1));
			DebugRenderer.renderPoint(result.contactPointB, new Vec3d(0, 0, 1));
			
		}
		
		
		ob.renderOBB();
		ob2.renderOBB();
		
		DebugRenderer.destructBasicRender();
		//System.out.println(OBBCollider.areColliding(ob, ob2));
		
		/*
		
		Vec3d startP = new Vec3d(3, -2, 2);
		
		// check cso support point
		Vec3d supPo = OBBCollider.CSOSupport(ob, ob2, startP);
		
		
		// test support
		Vec3d o2 = ob.support(startP);
		
		
		// test support on sec
		Vec3d o3 = ob2.support(startP);
		
		
		//System.out.println(o2);
		o = o2;
		
		//System.out.println(o);
		
		ob.renderOBB();
		ob2.renderOBB();
		
		
		
		
		GL11.glTranslated(0.0, -5.0, 0.0);
		DebugRenderer.renderPoint(o2, new Vec3d(1.0, 0.0, 0.0));
		DebugRenderer.renderPoint(o3, new Vec3d(0.5, 0.5, 0.5));
		DebugRenderer.renderPoint(startP, new Vec3d(0.0, 1.0, 0.0));
		
		DebugRenderer.renderPoint(supPo, new Vec3d(0.0, 0.0, 1.0));
		
		DebugRenderer.renderLine(Vec3d.ZERO, startP, new Vec3d(0.0, 1.0, 0.0));
	
		
		DebugRenderer.destructBasicRender();
		//GL11.glTranslated(0.0, -5.0, 0.0);
		*/
		
		
	}

	
	
	public void renderPlane(Vec3d[] list) {
		int red = 1;
		int blue = 0;
		int green = 0;
		int alpha = 1;
		DebugRenderer.setupBasicRender();
		DebugRenderer.renderLine(list[0], list[1], new Vec3d(1, 0, 0));
		DebugRenderer.renderLine(list[1], list[3], new Vec3d(1, 0, 0));
		DebugRenderer.renderLine(list[3], list[2], new Vec3d(1, 0, 0));
		DebugRenderer.renderLine(list[0], list[2], new Vec3d(1, 0, 0));
        DebugRenderer.destructBasicRender();
       
	}
	
	
	public void renderVehicle(EntityVehicle entityVehicle, double posX, double posY, double posZ, float rotationYaw, float par9)
	{
		int renderPass = net.minecraftforge.client.MinecraftForgeClient.getRenderPass();
		
		
		//		int pass = mc.getRenderManager().rend

		// RENDER VECTORS
		/*
		GL11.glPushMatrix();
		DebugRenderer.setupBasicRender();
		GL11.glTranslatef((float)posX, (float)posY+2, (float)posZ);
		
		Vec3d ve = entityVehicle.getSolver().getVelocityVector();
		Vec3d ov = entityVehicle.getSolver().getOreintationVector();
		
		DebugRenderer.renderLine(Vec3d.ZERO, ve.scale(0.1), new Vec3d(1, 0, 0));
		DebugRenderer.renderLine(Vec3d.ZERO, ov.scale(2), new Vec3d(0, 1, 0));
		
		GlStateManager.color(1.0f, 1.0f, 1.0f);
		DebugRenderer.destructBasicRender();
		GL11.glPopMatrix();
		*/
		
		// RENDER CUSTOM BOUNDING BOX
		GL11.glPushMatrix();
		DebugRenderer.setupBasicRender();	
		GL11.glTranslatef((float)posX, (float)posY, (float)posZ);
		
		double sr = entityVehicle.getSolver().rearAxel.leftWheel.slipRatio;
		
		//DebugRenderer.renderLine(Vec3d.ZERO.add(0, 3, 0), Vec3d.ZERO.add(0, -sr*100, 0), new Vec3d(1, 0, 0));
		GlStateManager.color(1.0f, 1f, 1f);
		if(mc.getRenderManager().isDebugBoundingBox()) {
			entityVehicle.oreintedBoundingBox.renderOBB();
		}
		DebugRenderer.destructBasicRender();
		GL11.glPopMatrix();
		
		
		
		

		GL11.glPushMatrix();
		invertCameraTransform();
		EntityVehicle v = entityVehicle;
		float pt = mc.getRenderPartialTicks();
		

		/*
		double preX = v.prevPosX - v.posX;
		double preY = v.prevPosY - v.posY;
		double preZ = v.prevPosZ - v.posZ;
		double newPosX = preX + (v.posX-preX)*pt;
		double newPosY = preY + (v.posY-preY)*pt;
		double newPosZ = preZ + (v.posZ-preZ)*pt;
		
		System.out.println(posX + " | " + posY + " | " + posZ);*/
		GL11.glTranslatef((float)posX, (float)posY, (float)posZ);
		
		//GL11.glTranslated(0.0, 0.0, 0.5);
		
		
		
		float muRoll = (float) ((1 - Math.cos(mc.getRenderPartialTicks() * Math.PI)) / 2f);
		float roll = (entityVehicle.prevRotationRollH+entityVehicle.prevRotationRoll) + ((entityVehicle.rotationRoll+entityVehicle.rotationRollH)-(entityVehicle.prevRotationRoll+entityVehicle.prevRotationRollH))*muRoll;
		
		
		
		// debug
		GL11.glRotatef(180.0F - rotationYaw, 0.0F, 1.0F, 0.0F);
		
		
		if(mc.gameSettings.thirdPersonView == 0) { 
			GL11.glRotatef(roll, 0.0f, 0.0f, 1.0f);
		} else {
			GL11.glRotatef(roll, 0.0f, 0.0f, 1.0f);
		}
		
		
		
		/*
		if(entityVehicle.getSolver().angles != null) {
			GL11.glRotated(-entityVehicle.getSolver().angles[2], 0.0, 0.0, 1.0);
			GL11.glRotated(-entityVehicle.getSolver().angles[0]-90f, 1.0, 0.0, 0.0);
		}
		*/
		
		float mu2 = mc.getRenderPartialTicks();
		//float mu2 = (float) ((1 - Math.cos(mc.getRenderPartialTicks() * Math.PI)) / 2f);
		float interpPitch = entityVehicle.prevRotationPitch + (entityVehicle.rotationPitch-entityVehicle.prevRotationPitch)*mu2;
		
		//interpPitch += entityVehicle.forwardLean;
		
		
		// debug DD
		if(mc.gameSettings.thirdPersonView != 0) {
			GL11.glRotatef(interpPitch, 1.0F, 0.0F, 0.0F);
		} else {

			GL11.glRotatef(interpPitch, 1.0F, 0.0F, 0.0F);

			
		}
		//GL11.glRotatef(interpPitch, 1.0F, 0.0F, 0.0F);
		

		/* wtf does this even do???
		if(mc.gameSettings.thirdPersonView == 0) {
			double interp = 1.0*(roll/45.0);
			System.out.println("fuck " + interp);
			GL11.glTranslated(interp, 0.0, 0.0);
		}*/ 

		
		
//		Matrix4f cM = MatrixHelper.captureMatrix();
		
		//cM.m33 = 0;
		//MatrixHelper.applyMatrix(cM);
		
		
/*
		if(entityVehicle.getSolver().rotMat != null) {
			
			Matrix3d k = entityVehicle.getSolver().rotMat;
			
			double[] dBuf = new double[] {k.m00, k.m01, k.m02, 0,
					k.m10, k.m11, k.m12, 0,
					k.m20, k.m21, k.m22, 0,
				  0, 0, 0, 0};
			DoubleBuffer db = DoubleBuffer.wrap(dBuf);
			
			
			GL11.glMultMatrix(db);
		
		}*/
		
		if(mc.gameSettings.thirdPersonView == 0) {

			//GL11.glTranslated(0.0, (Math.abs(entityVehicle.rotationPitch)/90.0)*2.0, 0.0);

		} else {
			
			if(!entityVehicle.onGround && entityVehicle.rotationPitch > 3) {

				
				//GL11.glTranslated(0.0, -entityVehicle.getInterpolatedLiftOffset(), 0.0);
			}
			
			
		}
		
		//GL11.glRotatef(MathHelper.wrapAngleTo180_float(par1HCEntityMongoose.getRotateWheelSpeed()*100F), 1.0F, 0.0F, 0.0F);
		
		
		
		
		//if(entityVehicle.rotationPitch > 5) {
			Vec3d startLift = InterpolationKit.interpolatedEntityPosition(entityVehicle);
			Vec3d endLift = startLift.subtract(new Vec3d(0, 10, 0).rotatePitch((float) Math.toRadians(entityVehicle.rotationPitch)).rotateYaw((float) Math.toRadians(-rotationYaw)));
			RayTraceResult rtr = entityVehicle.world.rayTraceBlocks(startLift, endLift, false, true, false);
			if(rtr != null) {
				entityVehicle.prevLiftOffset = entityVehicle.liftOffset;
				entityVehicle.liftOffset = (float) rtr.hitVec.subtract(startLift).length();
				
			}
			
			
			//GL11.glTranslated(0.0, -entityVehicle.getInterpolatedLiftOffset(), 0.0);
		//}
		
		if(renderPass == 0) {
			for(Entity pass : entityVehicle.getPassengers()) {
				
				if(mc.gameSettings.thirdPersonView == 0 && pass == mc.player) continue;
				
				GL11.glPushMatrix();
				GL11.glScaled(0.95, 0.95, 0.95);
				int i = entityVehicle.getPassengers().indexOf(pass);
		        Vec3d seatOffset = entityVehicle.getConfiguration().getSeatAtIndex(i).getSeatPosition();
		        
				GL11.glTranslated(-seatOffset.x, seatOffset.y, -seatOffset.z);
				
				if(!(pass instanceof EntityPlayer)) {
					mc.getRenderManager().renderEntity(pass, 0, 0, 0, -pass.rotationYaw, mc.getRenderPartialTicks(), true);		
				} else {
					EntityPlayer player = (EntityPlayer) pass;
					RenderManager rManager = mc.getRenderManager();
					Render<Entity> render = rManager.getEntityRenderObject(pass);
					
					

					
					player.rotationYaw += entityVehicle.deltaRotation;
					player.setRotationYawHead(player.getRotationYawHead() + entityVehicle.deltaRotation);
		            
				

					entityVehicle.applyYawToEntity(player);
					player.limbSwing = 39;
					float aPH = player.rotationPitch;
					float apPH = player.prevRotationPitch;
					float aY = player.rotationYaw;
					float apY = player.prevRotationYaw;
					float aYO = player.renderYawOffset;
					float apYO = player.prevRenderYawOffset;
					
					
					player.rotationYawHead = 180f;
					player.rotationPitch = 0;
					player.prevRotationPitch = 0;
					
					player.rotationYaw = 180;
					player.prevRotationYaw = 180;
					
					player.renderYawOffset = 180;
					player.prevRenderYawOffset = 180;
					render.doRender(player, 0, 0, 0, 180, mc.getRenderPartialTicks());		
					
					player.renderYawOffset = aYO;
					player.prevRenderYawOffset = apYO;
					player.rotationPitch = aPH;
					player.prevRotationPitch = apPH;
					player.rotationYaw = aY;
					player.prevRotationYaw = apY;
					player.limbSwing = 89;
					
				}
				GL11.glPopMatrix();
			}
		}
		
		
		float f4 = 0.75F;
		GL11.glScalef(f4, f4, f4);
		GL11.glScalef(0.6F / f4, 0.6F / f4, 0.6F / f4);
		//this.bindEntityTexture(entityVehicle);
		GL11.glScalef(-1.0F, -1.0F, 1.0F);
		//this.model.render(entityVehicle, 0.0625F);
		
		VehicleRenderableState renderState = null;
		switch(entityVehicle.getState()) {
		case OFF:
		    
		case IDLE:
		    renderState = VehicleRenderableState.IDLE;
		    break;
        case STARTING_TO_DRIVE:
            renderState = VehicleRenderableState.PREPARED_TO_DRIVE;
            break;
        case STOPPING:
            renderState = VehicleRenderableState.STOPPING;
            break;
        case DRIVING:
            renderState = VehicleRenderableState.DRIVING;
            break;
        case STARTING_TO_SHIFT:
        	renderState = VehicleRenderableState.STARTING_SHIFT;
        	break;
        case SHIFTING:
        	renderState = VehicleRenderableState.SHIFTING;
        	break;
        case FINISHING_SHIFT:
        	renderState = VehicleRenderableState.FINISHING_SHIFT;
        	break;
        
		}
		
		

		
		
	
		
		
		
		
		
		// RUN THE HIERARCHIAL RENDERING
		PartRenderContext<VehicleRenderableState> context = new PartRenderContext<>();
		context.setState(renderState);
		context.setEntity(entityVehicle);
		context.setScale(0.0625f);
		mainRenderer.render(context);
		

		
		
	
		
		
		
		
		
		
		EntityPlayer player = mc.player;
		int gameView = mc.gameSettings.thirdPersonView;
		boolean isPlayerRiding = player.isRiding();
		boolean isRidingVehicle = isPlayerRiding;
		if(isRidingVehicle) isRidingVehicle = ((player.getRidingEntity() instanceof EntityVehicle));
		
		
		/*
		 * A better method of this is to combine the textures
		 * THIS SHOULD BE DONE LATER ON!!!
		 */
		if(entityVehicle.isBraking) {
			if(gameView == 0 && isRidingVehicle && (EntityVehicle) player.getRidingEntity() == entityVehicle) {
				
			} else {
				GlStateManager.enableBlend();
				GL11.glScaled(1.0001, 1.0001, 1.0001);
				GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
				ResourceLocation loc = new ResourceLocation(ModReference.ID + ":textures/entity/audis4lights.png");
				
				context.renderAlternateTexture(loc);
				
				mainRenderer.render(context);
				GlStateManager.disableBlend();
			}
			
		}
		
		ResourceLocation loc = new ResourceLocation(ModReference.ID + ":textures/entity/suspensionblue.png");
		mc.getTextureManager().bindTexture(loc);
		
		
		
		
		/* suspension
		
		float s = 1.625f;
		double defaultRide = 1.0;
		entityVehicle.rideOffset = defaultRide + susSolve.getStretch();
		ArrayList<WheelSolver> solver = entityVehicle.getSolver().wheels;
		for(WheelSolver w : solver) {
			GL11.glPushMatrix();
			Vec3d r = w.relativePosition;
			
			w.getSuspension().springRate = 33000;
			
			
			GL11.glTranslatef((float) (r.x*s)+0.05f, (float) (-1.5f-entityVehicle.rideOffset)-0.1f, (float) (r.z*s)+0.2f);
			GL11.glRotated(0, 1.0, 0.0, 0.0);
			GL11.glScaled(1.0, 0.25 + (w.getSuspension().getStretch()*-1)*0.3, 1.0);
			GL11.glTranslated(0.0, -1.5, 0.0);
			(new SuspensionModel()).render(entityVehicle, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
			GL11.glPopMatrix();
			
		}
		*/
		
		
		
		//DebugRenderer.setupBasicRender();
		
		// suspension
		//GL11.glTranslatef(-1.6f*s, (float) (-1.5f-entityVehicle.rideOffset), 1.75f*s);
		
		/*
		if(entityVehicle.ticksExisted > 200) entityVehicle.ticksExisted = 0;
		float interp = (entityVehicle.ticksExisted-1)+(entityVehicle.ticksExisted-(entityVehicle.ticksExisted-1))*mc.getRenderPartialTicks();
		double tE = entityVehicle.ticksExisted;
		
		double dV = Math.sin(interp*2)/(Math.max(1.0, tE*tE/9000));
		
		double f = (entityVehicle.ticksExisted/200.0);
		*/
		//System.out.println("fuck");
	
		
		
		
		//System.out.println(entityVehicle.rideOffset);
		
		/*
		double dV = entityVehicle.getSolver().rearAxel.rightWheel.rideHeight;
		
		
		
		susSolve.springRate = 19000;
		
		
		
		susSolve.applyForce(-entityVehicle.mass*9.81);
		//System.out.println(susSolve.currentLength + " | " + susSolve.length);
		
		GL11.glRotated(0, 1.0, 0.0, 0.0);
		GL11.glScaled(1.0, 1.0 + (susSolve.getStretch()*-1), 1.0);
		GL11.glTranslated(0.0, -1.5, 0.0);
		
		(new SuspensionModel()).render(entityVehicle, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
		*/
		
		//DebugRenderer.destructBasicRender();
		
		
		
		/*
		GL11.glTranslated(0.0, -3.5, 0.0);
		GL11.glScaled(-1, -1, 1);
		GL11.glRotated(180, 0, 1, 0);
		Vec3d[] vL = entityVehicle.calculateTerrainPlane();
		//System.out.println(Arrays.toString(vL));
		boolean flag = true;
		
		if(vL == null) flag = false;
		if(vL != null) {
			for(Vec3d v : vL) {
				if(v == null) {
					flag = false;
					break;
				}
			}
		}
		
		
		if(flag) {
			//System.out.println(Arrays.toString(vL));
			renderPlane(vL);
		}
		*/
		
		
		/*
		GlStateManager.enableBlend();
		GL11.glScaled(1.001, 1.001, 1.001);
		GlStateManager.blendFunc(GL11.GL_ONE, GL11.GL_ONE);
		
		mainRenderer.render(context);
		
		GlStateManager.disableBlend();
		*/
		
		// test raycast
		
		
		//
		
		
		/*
		if(mc.getRenderManager().isDebugBoundingBox()) {
			GL11.glPushMatrix();
			
			DebugRenderer.setupBasicRender();
			entityVehicle.getOreintedBoundingBox().renderOBB();
			DebugRenderer.destructBasicRender();
			GL11.glPopMatrix();
		}*/
		
		
		
		
		/*
		// test side slip
		double angle = entityVehicle.solver.getSideSlipAngle();
		//System.out.println(Math.toDegrees(angle));
		
		
		Vec3d eV = new Vec3d(0, 0, -1);
		eV = eV.rotateYaw(-(float) angle);
		
		
		DebugRenderer.setupBasicRender();
		GL11.glTranslated(0.0, -3.5, 0.0);
		DebugRenderer.renderLine(Vec3d.ZERO, eV, new Vec3d(1,0,0));
		DebugRenderer.destructBasicRender();
		*/
		
		// end test
		
		//rigidBodyTest(entityVehicle);
		//OBBTest();
		
//		double d0 = RenderManager.renderPosX - (entityVehicle.posX - entityVehicle.lastTickPosX) * (double)par9; // - (RenderManager.renderPosX - (entityVehicle.lastTickPosX + (entityVehicle.posX - entityVehicle.lastTickPosX) * (double)par9));
//		double d1 = RenderManager.renderPosY; // - (RenderManager.renderPosY - (entityVehicle.lastTickPosY + (entityVehicle.posY - entityVehicle.lastTickPosY) * (double)par9));
//		double d2 = RenderManager.renderPosZ - (entityVehicle.posZ - entityVehicle.lastTickPosZ) * (double)par9; // - (RenderManager.renderPosZ - (entityVehicle.lastTickPosZ + (entityVehicle.posZ - entityVehicle.lastTickPosZ) * (double)par9));
//
//	        
		GL11.glPopMatrix();
		this.shadowSize = 0.1f;
//		
//		    GL11.glPushMatrix();
//	        GL11.glDepthMask(false);
//	        GL11.glDisable(GL11.GL_TEXTURE_2D);
//	        GL11.glDisable(GL11.GL_LIGHTING);
//	        GL11.glDisable(GL11.GL_CULL_FACE);
//	        GL11.glDisable(GL11.GL_BLEND);
//	        
//	        GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
//	        GL11.glLineWidth(2.0F);
//	        
//	        //AxisAlignedBB fbb = entityVehicle.getFrontBoundingBox().copy();
//
////	        AxisAlignedBB cbb = entityVehicle.getBoundingBox().copy();
////	        cbb.offset(-entityVehicle.posX, -entityVehicle.posY, -entityVehicle.posZ);
////	        RenderGlobal.drawOutlinedBoundingBox(cbb, 16777215);
//	        
//	        //System.out.println("Rendering " + entityVehicle + " " + entityVehicle.getFrontBoundingBox());
//	        //d0 = d1 = d2 = 0;
//	        RenderGlobal.drawOutlinedBoundingBox(entityVehicle.getBoundingBox().getOffsetBoundingBox(-d0, -d1, -d2), 0x00D0FF00);
//	        AxisAlignedBB fbb = entityVehicle.getFrontBoundingBox().getOffsetBoundingBox(-d0, -d1, -d2);
//	        RenderGlobal.drawOutlinedBoundingBox(fbb, 0xFF00FF00);
//	        
//	        AxisAlignedBB rbb = entityVehicle.getRearBoundingBox().getOffsetBoundingBox(-d0, -d1, -d2);
//	        RenderGlobal.drawOutlinedBoundingBox(rbb, 0xFF0000FF);
//	        
//	        GL11.glEnable(GL11.GL_TEXTURE_2D);
//	        GL11.glEnable(GL11.GL_LIGHTING);
//	        GL11.glEnable(GL11.GL_CULL_FACE);
//	        GL11.glDisable(GL11.GL_BLEND);
//	        GL11.glDepthMask(true);
//	        GL11.glPopMatrix();
	}
	
	@Override
	public void doRenderShadowAndFire(Entity entityIn, double x, double y, double z, float yaw, float partialTicks) {
		if (this.renderManager.options != null)
        {
            if (this.renderManager.options.entityShadows && this.shadowSize > 0.0F && !entityIn.isInvisible() && this.renderManager.isRenderShadow())
            {
                double d0 = this.renderManager.getDistanceToCamera(entityIn.posX, entityIn.posY, entityIn.posZ);
                float f = (float)((1.0D - d0 / 256.0D) * (double)this.shadowOpaque);

                if (f > 0.0F)
                {
                    this.renderShadow(entityIn, x, y, z, f, partialTicks);
                }
            }

        }
	}
	
	public void renderShadow(Entity entityIn, double x, double y, double z, float yaw, float partialTicks) {
		 GlStateManager.enableBlend();
	        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
	        this.renderManager.renderEngine.bindTexture(VEHICLE_SHADOW);
	        World world = entityIn.world;
	        GlStateManager.depthMask(false);
	        float f = this.shadowSize;

	        if (entityIn instanceof EntityLiving)
	        {
	            EntityLiving entityliving = (EntityLiving)entityIn;
	            f *= entityliving.getRenderSizeModifier();

	            if (entityliving.isChild())
	            {
	                f *= 0.5F;
	            }
	        }

	        double d5 = entityIn.lastTickPosX + (entityIn.posX - entityIn.lastTickPosX) * (double)partialTicks;
	        double d0 = entityIn.lastTickPosY + (entityIn.posY - entityIn.lastTickPosY) * (double)partialTicks;
	        double d1 = entityIn.lastTickPosZ + (entityIn.posZ - entityIn.lastTickPosZ) * (double)partialTicks;
	        int i = MathHelper.floor(d5 - (double)f);
	        int j = MathHelper.floor(d5 + (double)f);
	        int k = MathHelper.floor(d0 - (double)f);
	        int l = MathHelper.floor(d0);
	        int i1 = MathHelper.floor(d1 - (double)f);
	        int j1 = MathHelper.floor(d1 + (double)f);
	        double d2 = x - d5;
	        double d3 = y - d0;
	        double d4 = z - d1;
	        GL11.glPushMatrix();
	       
	        Tessellator tessellator = Tessellator.getInstance();
	        BufferBuilder bufferbuilder = tessellator.getBuffer();
	        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);

	        for (BlockPos blockpos : BlockPos.getAllInBoxMutable(new BlockPos(i, k, i1), new BlockPos(j, l, j1)))
	        {
	            IBlockState iblockstate = world.getBlockState(blockpos.down());

	            if (iblockstate.getRenderType() != EnumBlockRenderType.INVISIBLE && world.getLightFromNeighbors(blockpos) > 3)
	            {
	                this.renderShadowSingle(entityIn, iblockstate, x, y, z, blockpos, 0.7f, f, d2, d3, d4);
	            }
	        }

	        
	      //  GlStateManager.rotate(-entityIn.rotationYaw, 0.0f, 1.0f, 0.0f);
	       tessellator.draw();
	        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
	        GlStateManager.disableBlend();
	        GlStateManager.depthMask(true);
	        GL11.glPopMatrix();
	}
	
	private void renderShadowSingle(Entity e, IBlockState state, double p_188299_2_, double p_188299_4_, double p_188299_6_, BlockPos pos, float p_188299_9_, float p_188299_10_, double p_188299_11_, double p_188299_13_, double p_188299_15_)
    {
		if(1+1==2) return;
		GlStateManager.disableBlend();
		GlStateManager.disableAlpha();
		GlStateManager.color(1.0f, 1.0f, 1.0f);
		 if (state.isFullCube())
	        {
	            Tessellator tessellator = Tessellator.getInstance();
	            BufferBuilder bufferbuilder = tessellator.getBuffer();
	            double d0 = ((double)p_188299_9_ - (p_188299_4_ - ((double)pos.getY() + p_188299_13_)) / 2.0D) * 0.5D * (double)e.world.getLightBrightness(pos);

	            
	           
	            if (d0 >= 0.0D)
	            {
	                if (d0 > 1.0D)
	                {
	                    d0 = 1.0D;
	                }

	                AxisAlignedBB axisalignedbb = new AxisAlignedBB(-1, 0, -1.5, 1, 0, 1.5);
	                
	                
	                Vec3d p = e.getPositionVector();
	                //Vec3d p = new Vec3d(pos.getX(), pos.getY(), pos.getZ());
	                
	                double d1 = (double)p.x + axisalignedbb.minX + p_188299_11_;
	                double d2 = (double)p.x + axisalignedbb.maxX + p_188299_11_;
	                double d3 = (double)p.y + axisalignedbb.minY + p_188299_13_ + 0.015625D;
	                double d4 = (double)p.z + axisalignedbb.minZ + p_188299_15_;
	                double d5 = (double)p.z + axisalignedbb.maxZ + p_188299_15_;
	                
	                
	               
	                
	                /*
	                 * D1 = 0;
	                 * D2 = 1;
	                 * D3 = 0;
	                 * D4 = 0;
	                 * D5 = 1;
	                 */
	               // System.out.println(axisalignedbb);

	                
	                float f = 0.0f;
	                float f1 = 1.0f;
	                float f2 = 0.0f;
	                float f3 = 1.0f;
	                
	                
	               
	             //   System.out.println(d1 + " | " + d2 + " | " + d3 + " | " + d4 + " | " + d5);
	                
	                
	               // GL11.glRotated(30, 0.0, 1, 0.0);
	              // System.out.println(p_188299_11_ + " | " + p_188299_13_ + " | " + p_188299_15_);
	                
	                bufferbuilder.pos(d1, d3, d4).tex((double)f, (double)f2).color(1.0F, 1.0F, 1.0F, (float)d0).endVertex();
	                bufferbuilder.pos(d1, d3, d5).tex((double)f, (double)f3).color(1.0F, 1.0F, 1.0F, (float)d0).endVertex();
	                bufferbuilder.pos(d2, d3, d5).tex((double)f1, (double)f3).color(1.0F, 1.0F, 1.0F, (float)d0).endVertex();
	                bufferbuilder.pos(d2, d3, d4).tex((double)f1, (double)f2).color(1.0F, 1.0F, 1.0F, (float)d0).endVertex();
	                
	                GL11.glTranslated(pos.getX(), pos.getY(), pos.getZ());
	                GL11.glTranslated(p_188299_11_, p_188299_13_, p_188299_15_);
	                
	                e.rotationYaw = (float) (360.0*((e.ticksExisted%200)/200.0));
	                GL11.glTranslated(1.0, 0.0, 1.0);
	                GL11.glRotated(-e.rotationYaw+90, 0.0, 1, 0.0);
		           
	                
	               
	                
	               GL11.glTranslated(-p_188299_11_, -p_188299_13_, -p_188299_15_);
	               
	               GL11.glTranslated(-pos.getX(), -pos.getY(), -pos.getZ());
	               
	            }
	        }
    }
	
	
	
	public static Vector3d matrixToEuler(Matrix3f rotation) {
		
		
		double sy = Math.sqrt(rotation.m00*rotation.m00 + rotation.m10*rotation.m10);
		boolean singular = sy < 1e-6;
		double x,y,z;
		if(!singular) {
			x = Math.atan2( rotation.m21,rotation.m22);
			y = Math.atan2(-rotation.m20,sy);
			z = Math.atan2( rotation.m10,rotation.m00);
		} else {
			x = Math.atan2(-rotation.m12, rotation.m11);
			y = Math.atan2(-rotation.m20, sy);
			z = 0;
		}
		return new Vector3d(x,y,z);
	}

    private void invertCameraTransform() {
        Matrix4f currentTransformMatrix = cameraTransformMatrix.get();
		if(currentTransformMatrix != null) {
		    Matrix4f inverse = Matrix4f.invert(currentTransformMatrix, null);
		    Matrix4f currentMatrix = MatrixHelper.captureMatrix();
		    Matrix4f composite = Matrix4f.mul(inverse, currentMatrix, null);
	        MatrixHelper.loadMatrix(composite);
		}
    }
	
	public static void captureCameraTransform(Matrix4f transformMatrix) {
	    cameraTransformMatrix.set(transformMatrix);
	}

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity) {
        return null;
    }

	@Override
	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
		this.renderVehicle((EntityVehicle)par1Entity, par2, par4, par6, par8, par9);
	}
}
