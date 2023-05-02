package com.paneedah.weaponlib.crafting.ammopress;

import com.paneedah.weaponlib.crafting.base.TESRStation;
import com.paneedah.weaponlib.vehicle.jimphysics.InterpolationKit;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class TESRAmmoPress extends TESRStation<TileEntityAmmoPress> {

	private static final float ROTATION_NORTH = 180f;
	private static final float ROTATION_SOUTH = 0f;
	private static final float ROTATION_EAST = 270f;
	private static final float ROTATION_WEST = 90f;
	
	private static final float MODEL_RENDER_SCALE = 0.00625f;
	private static final float MODEL_RESCALE_VALUE = 10;
	
	private static final float MODEL_X_OFFSET = 0.5f;
	private static final float MODEL_Y_OFFSET = 1.5f;
	private static final float MODEL_Z_OFFSET = 0.5f;
	
	
	public TESRAmmoPress(ModelBase model, ResourceLocation loc) {
		super(model, loc);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 */
	
	@Override
	public void render(TileEntityAmmoPress te, double x, double y, double z, float partialTicks, int destroyStage,
			float alpha) {

        // Set initial state
        GlStateManager.enableTexture2D();
        GlStateManager.enableRescaleNormal();
        GL11.glPushMatrix();
        this.bindTexture(this.location);
        
        // Set-up initial parameters
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glTranslatef((float)x + MODEL_X_OFFSET, (float)y + MODEL_Y_OFFSET, (float)z + MODEL_Z_OFFSET);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        
        
        // Set rotation
        float blockRotation = 0f;
        switch(te.getFacing()) {
		    case NORTH:
		    	blockRotation = ROTATION_NORTH;
		    	break;
		    case EAST:
		    	blockRotation = ROTATION_EAST;
		    	break;
		    case WEST:
		    	blockRotation = ROTATION_WEST;
		    	break;
		    case SOUTH:
		    	blockRotation = ROTATION_SOUTH;
		    	break;
			default:
				break;
        }
        GlStateManager.rotate(blockRotation, 0, 1, 0);
        
        // Re-scale
        GlStateManager.scale(MODEL_RESCALE_VALUE, MODEL_RESCALE_VALUE, MODEL_RESCALE_VALUE);
      
        // Render the actual model
        double interp = InterpolationKit.interpolateValue(te.getPreviousWheelRotation(), te.getCurrentWheelRotation(), mc.getRenderPartialTicks());
        model.render((Entity)null, (float) interp, 0f, 0f, 0f, 0f, MODEL_RENDER_SCALE);
        
        // Undo block state
        GlStateManager.disableRescaleNormal();
        GL11.glPopMatrix();
	}

}
