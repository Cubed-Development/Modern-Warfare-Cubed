package com.paneedah.weaponlib.particle;

import com.paneedah.weaponlib.jim.util.RandomUtil;
import com.paneedah.weaponlib.render.ModelRenderTool;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

import javax.annotation.Nullable;

import static com.paneedah.mw.proxies.ClientProxy.mc;

public class CompatibleDiggingParticle extends Particle {
	private final IBlockState sourceState;
	private BlockPos sourcePos;
	
	private float prevAxisAngle;
	private float axisAngle;
	private float axisMomentum;
	private float[] currentAxis = new float[3];
	private Matrix4f rotationMatrix = new Matrix4f();

	
	private static final float[] CUBE_VERTICES = new float[] {
			-1.0f, -1.0f, 1.0f,
			1.0f, -1.0f, 1.0f,
			1.0f, 1.0f, 1.0f,
			-1.0f, 1.0f, 1.0f,
			
			-1.0f, -1.0f, -1.0f,
			1.0f, -1.0f, -1.0f,
			1.0f, 1.0f, -1.0f,
			-1.0f, 1.0f, -1.0f,
			
			-1.0f, 1.0f, -1.0f,
			1.0f, 1.0f, -1.0f,
			1.0f, 1.0f, 1.0f,
			-1.0f, 1.0f, 1.0f,
			
			-1.0f, -1.0f, -1.0f,
			1.0f, -1.0f, -1.0f,
			1.0f, -1.0f, 1.0f,
			-1.0f, -1.0f, 1.0f,
			
			1.0f, -1.0f, -1.0f,
			1.0f, 1.0f, -1.0f,
			1.0f, 1.0f, 1.0f,
			1.0f, -1.0f, 1.0f,
			
			-1.0f, -1.0f, -1.0f,
			-1.0f, 1.0f, -1.0f, 
			-1.0f, 1.0f, 1.0f,
			-1.0f, -1.0f, 1.0f
			
			
		};
	
	public CompatibleDiggingParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn,
			double ySpeedIn, double zSpeedIn) {
		super(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, zSpeedIn);
		sourceState = null;
	}

	public CompatibleDiggingParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn, IBlockState state)
	    {
	        super(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, zSpeedIn);
	        this.sourceState = state;
	        this.setParticleTexture(mc.getBlockRendererDispatcher().getBlockModelShapes().getTexture(state));
	        this.particleGravity = state.getBlock().blockParticleGravity;
	       
	        
	     
	        this.particleGravity = 1.0f;
	        
	      
	        this.particleRed = 0.6F;
	        this.particleGreen = 0.6F;
	        this.particleBlue = 0.6F;
	        this.particleScale = (float) (Math.random()*0.05f);
	        
	        this.motionX = xSpeedIn;
	        this.motionY = ySpeedIn;
	        this.motionZ = zSpeedIn;

	        
	        this.currentAxis = new float[] { (float) RandomUtil.getRandomWithNegatives(1.0), (float) RandomUtil.getRandomWithNegatives(1.0), (float) RandomUtil.getRandomWithNegatives(1.0) };
	       
	    	//System.out.println(Arrays.toString(currentAxis));
	        
	        this.axisMomentum = (float) (Math.random()*5f);
	        
	        
	        
	        
	    }

	/**
	 * Sets the position of the block that this particle came from. Used for
	 * calculating texture and color multiplier.
	 */
	public CompatibleDiggingParticle setBlockPos(BlockPos pos) {
		this.sourcePos = pos;

		if (this.sourceState.getBlock() == Blocks.GRASS) {
			return this;
		} else {
			this.multiplyColor(pos);
			return this;
		}
	}

	public CompatibleDiggingParticle init() {
		this.sourcePos = new BlockPos(this.posX, this.posY, this.posZ);
		Block block = this.sourceState.getBlock();

		if (block == Blocks.GRASS) {
			return this;
		} else {
			this.multiplyColor(this.sourcePos);
			return this;
		}
	}

	protected void multiplyColor(@Nullable BlockPos p_187154_1_) {
		int i = mc.getBlockColors().colorMultiplier(this.sourceState, this.world, p_187154_1_, 0);
		this.particleRed *= (float) (i >> 16 & 255) / 255.0F;
		this.particleGreen *= (float) (i >> 8 & 255) / 255.0F;
		this.particleBlue *= (float) (i & 255) / 255.0F;
	}

	/**
	 * Retrieve what effect layer (what texture) the particle should be rendered
	 * with. 0 for the particle sprite sheet, 1 for the main Texture atlas, and 3
	 * for a custom texture
	 */
	public int getFXLayer() {
		return 1;
	}

	
	@Override
	public void onUpdate() {
		// TODO Auto-generated method stub
		super.onUpdate();
		
		if(this.onGround) {
			this.axisMomentum *= 0.9f;
		} else {
			this.axisMomentum *= 0.9999f;
		}
		
		
		rotationMatrix.rotate(this.axisMomentum*0.01f, new Vector3f(currentAxis[0], currentAxis[1], currentAxis[2]));
		
	}
	
	/**
	 * Renders the particle
	 */
	public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX,
			float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
		float f = ((float) this.particleTextureIndexX + this.particleTextureJitterX / 4.0F) / 16.0F;
		float f1 = f + 0.015609375F;
		float f2 = ((float) this.particleTextureIndexY + this.particleTextureJitterY / 4.0F) / 16.0F;
		float f3 = f2 + 0.015609375F;
		float f4 = 0.05F * this.particleScale;

		if (this.particleTexture != null) {
			float pixelSize = 4.0F;
			f = this.particleTexture.getInterpolatedU((double) (this.particleTextureJitterX / pixelSize * 16.0F));
			f1 = this.particleTexture.getInterpolatedU((double) ((this.particleTextureJitterX + 1.0F) / pixelSize * 16.0F));
			f2 = this.particleTexture.getInterpolatedV((double) (this.particleTextureJitterY / pixelSize * 16.0F));
			f3 = this.particleTexture.getInterpolatedV((double) ((this.particleTextureJitterY + 1.0F) / pixelSize * 16.0F));
		}

	
		
		
		
		
		float f5 = (float) (this.prevPosX + (this.posX - this.prevPosX) * (double) partialTicks - interpPosX);
		float f6 = (float) (this.prevPosY + (this.posY - this.prevPosY) * (double) partialTicks - interpPosY);
		float f7 = (float) (this.prevPosZ + (this.posZ - this.prevPosZ) * (double) partialTicks - interpPosZ);
		
		int i = this.getBrightnessForRender(partialTicks);
		
		
		int j = i >> 16 & 65535;
		int k = i & 65535;
		
	
		float size = this.particleScale;
		
		
		
		
		
		int c = 0;
		
		for(int n = 0; n < CUBE_VERTICES.length; n += 3) {
			
			
			// (f, f2), (f1, f2), (f1, f3), (f, f3)
			// Create texture coordinates
			float tx = f;
			float ty = f2;
			
			if(c == 1) {
				tx = f1;
				
			} else if(c == 2) {
				tx = f1;
				ty = f3;
			} else if(c == 3) {
				tx = f;
				ty = f3;
			}
			
			
			float[] vertex = ModelRenderTool.transformViaMatrix(CUBE_VERTICES[n]*size, CUBE_VERTICES[n+1]*size, CUBE_VERTICES[n+2]*size, rotationMatrix);
		
			
			
			// Add vertex to buffer
			buffer.pos(f5 + vertex[0], f6 + vertex[1], f7 + vertex[2]).tex(tx, ty).color(1f, 1f, 1f, 1f).lightmap(j, k).endVertex();
			
			// Cycle 'C'
			c += 1;
			if(c == 4) c = 0;
		}
	
	}

	public int getBrightnessForRender(float p_189214_1_) {
		int i = super.getBrightnessForRender(p_189214_1_);
		int j = 0;

		if (this.world.isBlockLoaded(this.sourcePos)) {
			j = this.world.getCombinedLight(new BlockPos(this.posX, this.posY, this.posZ), 0);
		}
	
		return i == 0 ? j : i;
	}

	@SideOnly(Side.CLIENT)
	public static class Factory implements IParticleFactory {
		public Particle createParticle(int particleID, World worldIn, double xCoordIn, double yCoordIn, double zCoordIn,
				double xSpeedIn, double ySpeedIn, double zSpeedIn, int... p_178902_15_) {
			return (new CompatibleDiggingParticle(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, zSpeedIn,
					Block.getStateById(p_178902_15_[0]))).init();
		}
	}

}
