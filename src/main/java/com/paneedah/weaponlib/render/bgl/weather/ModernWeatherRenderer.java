package com.paneedah.weaponlib.render.bgl.weather;

import com.paneedah.mwc.utils.MWCUtil;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.animation.ClientValueRepo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

@SideOnly(Side.CLIENT)
public class ModernWeatherRenderer extends IRenderHandler {

	private static final int RAIN_SEARCH_AREA = 4;
	
	/*
	 * Rainpositions[rainIndex]
	 *   -> { enabled, posX, posY, posZ, type }
	 *        [0]      [1]   [2]   [3]   [4]
	 *        
	 *  Type = 1 if rain; type = 0 if snow.
	 * 
	 */
	private float[][] rainPositions = new float[(2*RAIN_SEARCH_AREA)*(2*RAIN_SEARCH_AREA)][5];

	//private float previousRotation;
	private Vec3d previousPosition;
	//private int previousThirdPerson;
	
	// Textures
	public static final ResourceLocation RAIN_LIGHT = new ResourceLocation(ModReference.ID + ":textures/environment/lightrain.png");
	public static final ResourceLocation RAIN_MEDIUM = new ResourceLocation(ModReference.ID + ":textures/environment/mediumrain.png");
	public static final ResourceLocation RAIN_HEAVY = new ResourceLocation(ModReference.ID + ":textures/environment/heavyrain.png");
	public static final ResourceLocation RAIN_INSANE = new ResourceLocation(ModReference.ID + ":textures/environment/insanerain.png");
	
	/**
	 * Check if it is raining or snowing
	 * at a given block position
	 * 
	 * @param Position to check
	 * @return True if raining, false if snowing
	 */
	public static boolean isRainingOrSnowing(BlockPos pos) {
		float f2 = mc.world.getBiome(pos).getTemperature(pos);
		int j2 = mc.world.getPrecipitationHeight(pos).getY();
		if (mc.world.getBiomeProvider().getTemperatureAtHeight(f2, j2) >= 0.15F) {
        	return true;
        } else return false;
	}
	
	/**
	 * Checks to see if we should refill the rain
	 * array with new positions. It's not incredibly expensive,
	 * but it's best this calculation happens as infrequently
	 * as possible.
	 * 
	 * @param player
	 * @return
	 */
	public boolean shouldRecalculateRainVectors(EntityPlayer player) {
		
		// If it's not raining, don't recalculate the vectors
		if(player.world.getRainStrength(mc.getRenderPartialTicks()) == 0.0) return false;
		
		if(previousPosition == null) {
			previousPosition = player.getPositionVector();
			return true;
		}
		
		/*
		// Rotation flag
		boolean rotationFlag = Math.abs(player.rotationYaw - previousRotation) > 10;
		if(rotationFlag) previousRotation = player.rotationYaw;
		*/
		
		// Position flag
		boolean positionFlag = player.getPositionVector().x != previousPosition.x || player.getPositionVector().y != previousPosition.y || player.getPositionVector().z != previousPosition.z;
		if(positionFlag) previousPosition = player.getPositionVector();
		
		

		/*
		boolean thirdPersonFlag = mc.gameSettings.thirdPersonView != previousThirdPerson;
		if(thirdPersonFlag) previousThirdPerson = mc.gameSettings.thirdPersonView;
		*/
		
		return positionFlag;
	}
	
	/**
	 * Check all rain in search area [(2*S)^2 blocks, where S is search area]
	 * @param Entity player
	 * @param The interpolated position of the player
	 */
	public void recalculateRainVectors(EntityPlayer player, Vec3d interpolatedPosition) {
		
		int count = 0;
		for(int x = -RAIN_SEARCH_AREA; x < RAIN_SEARCH_AREA; ++x) {
			for(int y = -RAIN_SEARCH_AREA; y < RAIN_SEARCH_AREA; ++y) {
				
				
				BlockPos rainPosition = new BlockPos(interpolatedPosition.x + x, player.getPositionVector().y, interpolatedPosition.z + y);
				boolean rainStatus = isRainingOrSnowing(rainPosition);
				
				// If it can't snow or rain, don't put it there
				Biome biome = mc.world.getBiome(rainPosition);
				if((rainStatus && !biome.canRain()) || (!rainStatus && !biome.getEnableSnow())) {
					rainPositions[count] = new float[] { 0.0f, 0f, 0f, 0f, 0f};
					return;
				}
					
				
						
				int worldPos = mc.world.getHeight(rainPosition.getX(), rainPosition.getZ());
				rainPositions[count] = new float[] { 1.0f, (float) rainPosition.getX() + 1, (float) worldPos, rainPosition.getZ(), rainStatus ? 1 : 0};
				count++;
				
				
			}
		}

		/*
		if(true) return;
		Vec3d direction = new Vec3d(0, 0, 1);
		if(mc.gameSettings.thirdPersonView == 1) direction = new Vec3d(0, 0, -1);
		
		
		double delta = -20;
		Vec3d lookVector = direction.rotateYaw((float) Math.toRadians(-player.rotationYaw + (4*delta)));
		
		for(int i = 0; i < 24; i++) {
			
			
			float length = (float) (i % 4) * 3f;
			if(length == 0) length = 1f;
		
				if(i % 4 == 0) {
					lookVector = lookVector.rotateYaw((float) -Math.toRadians(delta));
				}
				
				BlockPos rainPosition = new BlockPos(interpolatedPosition.x + lookVector.x*length, player.getPositionVector().y, interpolatedPosition.z + lookVector.z*length);
				int worldPos = mc.world.getHeight(rainPosition.getX(), rainPosition.getZ());
				rainPositions[i] = new float[] { 1.0f, (float) rainPosition.getX() + 1, (float) (rainPosition.getY() + (worldPos - player.getPosition().getY())), rainPosition.getZ()};

		}
		*/
		
		
		

	}
	
	public double getRandom(double scalar) {
		return Math.random()*scalar - (scalar/2.0);
	}
	
	public double getTrueHeight(BlockPos pos) {
		return mc.world.getHeight(pos).getY();
		
	}

	@Override
	public void render(float partialTicks, WorldClient world, Minecraft mc) {
		
		
		float rainStrength = mc.world.getRainStrength(mc.getRenderPartialTicks());
		if(rainStrength == 0.0) return;
		// Rain render size
		double lateralSize = 1.0;
		double thinness = 5.0;
		double verticalSize = 64;
		float textureScale = 48;
		
		
		
		

		
		
		// Initialize the timer
		float timer = 0f;

		
		// Culling is not favorable for this
		GlStateManager.disableCull();
	
		
		Vec3d iP = MWCUtil.getInterpolatedPlayerPos();
		
		
		
		
		GlStateManager.pushMatrix();
		GlStateManager.translate(-iP.x, -iP.y, -iP.z);
		

				
		
		
		
		GlStateManager.enableBlend();
		GlStateManager.color(1, 1, 1, rainStrength);
		Tessellator t = Tessellator.getInstance();
		
		
		// Rain pass
		mc.getTextureManager().bindTexture(RAIN_HEAVY);
		timer = -ClientValueRepo.TICKER.getLerpedFloat()/3f;
		BufferBuilder bb = t.getBuffer();
		bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
		for(int i = 0; i < rainPositions.length; ++i) {
			if(rainPositions[i][0] == 0.0 || rainPositions[i][4] == 0) continue;
			bb.pos(rainPositions[i][1]-lateralSize, rainPositions[i][2]+verticalSize, rainPositions[i][3]+lateralSize).tex(0, 0+timer).endVertex();
			bb.pos(rainPositions[i][1], rainPositions[i][2]+verticalSize, rainPositions[i][3]).tex(1*thinness, 0+timer).endVertex();
			bb.pos(rainPositions[i][1], rainPositions[i][2], rainPositions[i][3]).tex(1*thinness, 1*textureScale+timer).endVertex();
			bb.pos(rainPositions[i][1]-lateralSize, rainPositions[i][2], rainPositions[i][3]+lateralSize).tex(0, 1*textureScale+timer).endVertex();
			
			bb.pos(rainPositions[i][1], rainPositions[i][2]+verticalSize, rainPositions[i][3]+lateralSize).tex(0, 0+timer).endVertex();
			bb.pos(rainPositions[i][1]-lateralSize, rainPositions[i][2]+verticalSize, rainPositions[i][3]).tex(1*thinness, 0+timer).endVertex();
			bb.pos(rainPositions[i][1]-lateralSize, rainPositions[i][2], rainPositions[i][3]).tex(1*thinness, 1*textureScale+timer).endVertex();
			bb.pos(rainPositions[i][1], rainPositions[i][2], rainPositions[i][3]+lateralSize).tex(0, 1*textureScale+timer).endVertex();
		}
		t.draw();
		
		
		
		
		// Snow pass
		mc.getTextureManager().bindTexture(new ResourceLocation(ModReference.ID + ":textures/environment/christmassnow.png"));
		timer = -ClientValueRepo.TICKER.getLerpedFloat()/25f;
		bb = t.getBuffer();
		bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
		for(int i = 0; i < rainPositions.length; ++i) {
			if(rainPositions[i][0] == 0.0 || rainPositions[i][4] == 1) continue;
			bb.pos(rainPositions[i][1]-lateralSize, rainPositions[i][2]+verticalSize, rainPositions[i][3]+lateralSize).tex(0, 0+timer).endVertex();
			bb.pos(rainPositions[i][1], rainPositions[i][2]+verticalSize, rainPositions[i][3]).tex(1*thinness, 0+timer).endVertex();
			bb.pos(rainPositions[i][1], rainPositions[i][2], rainPositions[i][3]).tex(1*thinness, 1*textureScale+timer).endVertex();
			bb.pos(rainPositions[i][1]-lateralSize, rainPositions[i][2], rainPositions[i][3]+lateralSize).tex(0, 1*textureScale+timer).endVertex();
			
			bb.pos(rainPositions[i][1], rainPositions[i][2]+verticalSize, rainPositions[i][3]+lateralSize).tex(0, 0+timer).endVertex();
			bb.pos(rainPositions[i][1]-lateralSize, rainPositions[i][2]+verticalSize, rainPositions[i][3]).tex(1*thinness, 0+timer).endVertex();
			bb.pos(rainPositions[i][1]-lateralSize, rainPositions[i][2], rainPositions[i][3]).tex(1*thinness, 1*textureScale+timer).endVertex();
			bb.pos(rainPositions[i][1], rainPositions[i][2], rainPositions[i][3]+lateralSize).tex(0, 1*textureScale+timer).endVertex();
		}
		t.draw();
		
		GlStateManager.popMatrix();
		GlStateManager.enableCull();
	}

}
