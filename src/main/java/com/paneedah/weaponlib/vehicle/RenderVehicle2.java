package com.paneedah.weaponlib.vehicle;

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

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.ProjectConstants.ID;

public class RenderVehicle2 extends Render<Entity> {

    public static final ResourceLocation VEHICLE_SHADOW = new ResourceLocation(ID + ":textures/entity/vehicleshadow.png");


    private static final ThreadLocal<Matrix4f> cameraTransformMatrix = new ThreadLocal<>();

    private static ResourceLocation field_110782_f;

    private final StatefulRenderer<VehicleRenderableState> mainRenderer;

    private VehicleRenderableState currentRenderableState;


    public static Matrix4f tm = new Matrix4f();


    public static SuspensionSolver susSolve = new SuspensionSolver(271, 1.0);


    public RenderVehicle2(StatefulRenderer<VehicleRenderableState> mainRenderer) {
        super(MC.getRenderManager());

        shadowSize = 0.5F;
        this.mainRenderer = mainRenderer;
    }

    public RigidBody bruhBody = null;


    public void rigidBodyTest(EntityVehicle v) {
        try {


            DebugRenderer.setupBasicRender();

            Vec3d playerPos = MC.player.getPositionVector();

            GL11.glTranslated(-playerPos.x, -playerPos.y, -playerPos.z);
            //bruhBody = null;

            Vec3d posVec = v.getPositionVector();
            if (bruhBody == null) {
                bruhBody = new RigidBody(v.world, posVec.x, posVec.y + 10, posVec.z);
                OreintedBB obb = new OreintedBB(new AxisAlignedBB(-1, -1, -1, 1, 1, 1));
                obb.setupPhysically(175);
                bruhBody.addColliders(obb);
            }

            bruhBody.minecraftTimestep();


            Vec3d p = bruhBody.position;
            Vec3d adjP = v.getPositionVector().subtract(p);
            GL11.glTranslated(p.x, p.y, p.z);
            bruhBody.colliders.get(0).renderOBB();

            DebugRenderer.destructBasicRender();
        } catch (Exception e) {
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
        if (result.status == GJKResult.Status.COLLIDING) {
            Vec3d sepVec = result.separationVector.scale(result.penetrationDepth);
            ob2.move(sepVec.x, sepVec.y, sepVec.z);

            DebugRenderer.renderPoint(result.contactPointA, new Vec3d(0, 0, 1));
            DebugRenderer.renderPoint(result.contactPointB, new Vec3d(0, 0, 1));

        }


        ob.renderOBB();
        ob2.renderOBB();

        DebugRenderer.destructBasicRender();
        //System.out.println(OBBCollider.areColliding(ob, ob2));


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


    public void renderVehicle(EntityVehicle entityVehicle, double posX, double posY, double posZ, float rotationYaw, float par9) {
        int renderPass = net.minecraftforge.client.MinecraftForgeClient.getRenderPass();


        //		int pass = MC.getRenderManager().rend

        // RENDER VECTORS

        // RENDER CUSTOM BOUNDING BOX
        GL11.glPushMatrix();
        DebugRenderer.setupBasicRender();
        GL11.glTranslatef((float) posX, (float) posY, (float) posZ);

        double sr = entityVehicle.getSolver().rearAxel.leftWheel.slipRatio;

        //DebugRenderer.renderLine(Vec3d.ZERO.add(0, 3, 0), Vec3d.ZERO.add(0, -sr*100, 0), new Vec3d(1, 0, 0));
        GlStateManager.color(1.0f, 1f, 1f);
        if (MC.getRenderManager().isDebugBoundingBox()) {
            entityVehicle.oreintedBoundingBox.renderOBB();
        }
        DebugRenderer.destructBasicRender();
        GL11.glPopMatrix();


        GL11.glPushMatrix();
        invertCameraTransform();
        float pt = MC.getRenderPartialTicks();


        GL11.glTranslatef((float) posX, (float) posY, (float) posZ);

        //GL11.glTranslated(0.0, 0.0, 0.5);


        float muRoll = (float) ((1 - Math.cos(MC.getRenderPartialTicks() * Math.PI)) / 2f);
        float roll = (entityVehicle.prevRotationRollH + entityVehicle.prevRotationRoll) + ((entityVehicle.rotationRoll + entityVehicle.rotationRollH) - (entityVehicle.prevRotationRoll + entityVehicle.prevRotationRollH)) * muRoll;


        // debug
        GL11.glRotatef(180.0F - rotationYaw, 0.0F, 1.0F, 0.0F);


        GL11.glRotatef(roll, 0.0f, 0.0f, 1.0f);


        float mu2 = MC.getRenderPartialTicks();
        //float mu2 = (float) ((1 - Math.cos(MC.getRenderPartialTicks() * Math.PI)) / 2f);
        float interpPitch = entityVehicle.prevRotationPitch + (entityVehicle.rotationPitch - entityVehicle.prevRotationPitch) * mu2;

        //interpPitch += entityVehicle.forwardLean;


        // debug DD
        GL11.glRotatef(interpPitch, 1.0F, 0.0F, 0.0F);
        //GL11.glRotatef(interpPitch, 1.0F, 0.0F, 0.0F);
		

		/* wtf does this even do???
		if(MC.gameSettings.thirdPersonView == 0) {
			double interp = 1.0*(roll/45.0);
			System.out.println("fuck " + interp);
			GL11.glTranslated(interp, 0.0, 0.0);
		}*/


        if (MC.gameSettings.thirdPersonView == 0) {

            //GL11.glTranslated(0.0, (Math.abs(entityVehicle.rotationPitch)/90.0)*2.0, 0.0);

        } else {

            //GL11.glTranslated(0.0, -entityVehicle.getInterpolatedLiftOffset(), 0.0);


        }

        //GL11.glRotatef(MathHelper.wrapAngleTo180_float(par1HCEntityMongoose.getRotateWheelSpeed()*100F), 1.0F, 0.0F, 0.0F);


        //if(entityVehicle.rotationPitch > 5) {
        Vec3d startLift = InterpolationKit.interpolatedEntityPosition(entityVehicle);
        Vec3d endLift = startLift.subtract(new Vec3d(0, 10, 0).rotatePitch((float) Math.toRadians(entityVehicle.rotationPitch)).rotateYaw((float) Math.toRadians(-rotationYaw)));
        RayTraceResult rtr = entityVehicle.world.rayTraceBlocks(startLift, endLift, false, true, false);
        if (rtr != null) {
            entityVehicle.prevLiftOffset = entityVehicle.liftOffset;
            entityVehicle.liftOffset = (float) rtr.hitVec.subtract(startLift).length();

        }


        //GL11.glTranslated(0.0, -entityVehicle.getInterpolatedLiftOffset(), 0.0);
        //}

        if (renderPass == 0) {
            for (Entity pass : entityVehicle.getPassengers()) {

                if (MC.gameSettings.thirdPersonView == 0 && pass == MC.player) {
                    continue;
                }

                GL11.glPushMatrix();
                GL11.glScaled(0.95, 0.95, 0.95);
                int i = entityVehicle.getPassengers().indexOf(pass);
                Vec3d seatOffset = entityVehicle.getConfiguration().getSeatAtIndex(i).getSeatPosition();

                GL11.glTranslated(-seatOffset.x, seatOffset.y, -seatOffset.z);

                if (!(pass instanceof EntityPlayer)) {
                    MC.getRenderManager().renderEntity(pass, 0, 0, 0, -pass.rotationYaw, MC.getRenderPartialTicks(), true);
                } else {
                    EntityPlayer player = (EntityPlayer) pass;
                    RenderManager rManager = MC.getRenderManager();
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
                    assert render != null;
                    render.doRender(player, 0, 0, 0, 180, MC.getRenderPartialTicks());

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
        //this.model.renderer(entityVehicle, 0.0625F);

        VehicleRenderableState renderState = null;
        switch (entityVehicle.getState()) {
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


        EntityPlayer player = MC.player;
        int gameView = MC.gameSettings.thirdPersonView;
        boolean isRidingVehicle = player.isRiding();
        if (isRidingVehicle) {
            isRidingVehicle = ((player.getRidingEntity() instanceof EntityVehicle));
        }


        /*
         * A better method of this is to combine the textures
         * THIS SHOULD BE DONE LATER ON!!!
         */
        if (entityVehicle.isBraking) {
            if (gameView == 0 && isRidingVehicle && player.getRidingEntity() == entityVehicle) {

            } else {
                GlStateManager.enableBlend();
                GL11.glScaled(1.0001, 1.0001, 1.0001);
                GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
                ResourceLocation loc = new ResourceLocation(ID + ":textures/entity/audis4lights.png");

                context.renderAlternateTexture(loc);

                mainRenderer.render(context);
                GlStateManager.disableBlend();
            }

        }

        ResourceLocation loc = new ResourceLocation(ID + ":textures/entity/suspensionblue.png");
        MC.getTextureManager().bindTexture(loc);
		
		
		
		
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
			(new SuspensionModel()).renderer(entityVehicle, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
			GL11.glPopMatrix();
			
		}
		*/


        //DebugRenderer.setupBasicRender();

        // suspension
        //GL11.glTranslatef(-1.6f*s, (float) (-1.5f-entityVehicle.rideOffset), 1.75f*s);


        //DebugRenderer.destructBasicRender();


        // test raycast


        //


        // end test

        GL11.glPopMatrix();
        shadowSize = 0.1f;
    }

    @Override
    public void doRenderShadowAndFire(Entity entityIn, double x, double y, double z, float yaw, float partialTicks) {
        if (renderManager.options != null) {
            if (renderManager.options.entityShadows && shadowSize > 0.0F && !entityIn.isInvisible() && renderManager.isRenderShadow()) {
                double d0 = renderManager.getDistanceToCamera(entityIn.posX, entityIn.posY, entityIn.posZ);
                float f = (float) ((1.0D - d0 / 256.0D) * (double) shadowOpaque);

                if (f > 0.0F) {
                    renderShadow(entityIn, x, y, z, f, partialTicks);
                }
            }

        }
    }

    public void renderShadow(Entity entityIn, double x, double y, double z, float yaw, float partialTicks) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        renderManager.renderEngine.bindTexture(VEHICLE_SHADOW);
        World world = entityIn.world;
        GlStateManager.depthMask(false);
        float f = shadowSize;

        if (entityIn instanceof EntityLiving) {
            EntityLiving entityliving = (EntityLiving) entityIn;
            f *= entityliving.getRenderSizeModifier();

            if (entityliving.isChild()) {
                f *= 0.5F;
            }
        }

        double d5 = entityIn.lastTickPosX + (entityIn.posX - entityIn.lastTickPosX) * (double) partialTicks;
        double d0 = entityIn.lastTickPosY + (entityIn.posY - entityIn.lastTickPosY) * (double) partialTicks;
        double d1 = entityIn.lastTickPosZ + (entityIn.posZ - entityIn.lastTickPosZ) * (double) partialTicks;
        int i = MathHelper.floor(d5 - (double) f);
        int j = MathHelper.floor(d5 + (double) f);
        int k = MathHelper.floor(d0 - (double) f);
        int l = MathHelper.floor(d0);
        int i1 = MathHelper.floor(d1 - (double) f);
        int j1 = MathHelper.floor(d1 + (double) f);
        double d2 = x - d5;
        double d3 = y - d0;
        double d4 = z - d1;
        GL11.glPushMatrix();

        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferbuilder = tessellator.getBuffer();
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);

        for (BlockPos blockpos : BlockPos.getAllInBoxMutable(new BlockPos(i, k, i1), new BlockPos(j, l, j1))) {
            IBlockState iblockstate = world.getBlockState(blockpos.down());

            if (iblockstate.getRenderType() != EnumBlockRenderType.INVISIBLE && world.getLightFromNeighbors(blockpos) > 3) {
                renderShadowSingle(entityIn, iblockstate, x, y, z, blockpos, 0.7f, f, d2, d3, d4);
            }
        }


        //  GlStateManager.rotate(-entityIn.rotationYaw, 0.0f, 1.0f, 0.0f);
        tessellator.draw();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        GlStateManager.disableBlend();
        GlStateManager.depthMask(true);
        GL11.glPopMatrix();
    }

    private void renderShadowSingle(Entity e, IBlockState state, double p_188299_2_, double p_188299_4_, double p_188299_6_, BlockPos pos, float p_188299_9_, float p_188299_10_, double p_188299_11_, double p_188299_13_, double p_188299_15_) {
        return;
    }


    public static Vector3d matrixToEuler(Matrix3f rotation) {


        double sy = Math.sqrt(rotation.m00 * rotation.m00 + rotation.m10 * rotation.m10);
        boolean singular = sy < 1e-6;
        double x, y, z;
        if (!singular) {
            x = Math.atan2(rotation.m21, rotation.m22);
            y = Math.atan2(-rotation.m20, sy);
            z = Math.atan2(rotation.m10, rotation.m00);
        } else {
            x = Math.atan2(-rotation.m12, rotation.m11);
            y = Math.atan2(-rotation.m20, sy);
            z = 0;
        }
        return new Vector3d(x, y, z);
    }

    private void invertCameraTransform() {
        Matrix4f currentTransformMatrix = cameraTransformMatrix.get();
        if (currentTransformMatrix != null) {
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
        renderVehicle((EntityVehicle) par1Entity, par2, par4, par6, par8, par9);
    }
}
