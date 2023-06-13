package com.paneedah.weaponlib.render;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.animation.gui.AnimationGUI;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.render.SpriteSheetTools.Sprite;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class MuzzleFlashRenderer {
	
	public static ResourceLocation FLASH_SHEET = new ResourceLocation(ModReference.ID + ":textures/flashes/sheet.png");

	private static boolean assignedParameters = false;
	
	private static final int SPRITE_SIZE = 256;
	private static final int SHEET_WIDTH = 1536;
	private static final int SHEET_HEIGHT = 768;
	
	
	
	public static int getRandomNumberBetween(int min, int max) {
		return (int) Math.floor(Math.random()*(max-min+1)+min);
	}
	
	public static void renderFlash(int entityID, ItemStack weaponItemStack, boolean bloom) {
		 
		Weapon weapon = (Weapon) weaponItemStack.getItem();
		
		if(!(mc.world.getEntityByID(entityID) instanceof EntityPlayer)) {
			return;
		}
		
		EntityPlayer player = (EntityPlayer) mc.world.getEntityByID(entityID);
		
		
		boolean isPetalFlash = weapon.hasFlashPedals();
		boolean isSuppressedFlash = false;
		
		for(CompatibleAttachment<? extends AttachmentContainer> c : weapon.getActiveAttachments(player, weaponItemStack)) {
			if(c.getAttachment().getCategory() == AttachmentCategory.SILENCER) {
				isSuppressedFlash = true;
			}
		}
	
		
		
		boolean shouldRenderCrossplane = mc.world.getEntityByID(entityID) != mc.player || mc.gameSettings.thirdPersonView != 0;
		// Turn on all of the GL states
		GlStateManager.pushMatrix();
		//GlStateManager.depthMask(false);
		GlStateManager.disableLighting();
		GlStateManager.enableBlend();
		GlStateManager.enableAlpha();
		GlStateManager.disableCull();
		GlStateManager.enableDepth();
		
		// Translate to muzzle position
		Vec3d muzzle = weapon.getMuzzlePosition();
		if(AnimationModeProcessor.getInstance().getFPSMode() && AnimationGUI.getInstance().forceFlash.isState()) {
			muzzle = ClientEventHandler.debugmuzzlePosition;
		}
		GlStateManager.translate(muzzle.x, muzzle.y, muzzle.z);

		mc.getTextureManager().bindTexture(FLASH_SHEET);
		
		// This makes OpenGL sample linearly from
		// the texture which makes it look nice instead
		// of pixelated
		if(!assignedParameters) {
			assignedParameters = true;
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
	    	GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
		}
	
		//ClientValueRepo
		
		// Shaders.flash = ShaderLoader.loadVMWShader("flash");
		if(ModernConfigManager.enableAllShaders && ModernConfigManager.enableFlashShaders) {
			Shaders.flash.use();
			Shaders.flash.uniform1i("bloom", bloom ? 1 : 0);
		}
		
				
				// Changing the alpha function in order to prevent
				// edge artifacts.
				GlStateManager.alphaFunc(GL11.GL_GREATER, 0.0F);
		
    	 
		// Adds a random element to the size
		// as it looks nice.
    	double size = Math.random()*0.5 + 0.5;
    	
    	//isPetalFlash = true;
    	
    	// Get sprite sheet ID's
    	int mainBodyID = 0;
    	if(isPetalFlash) {
    		mainBodyID = getRandomNumberBetween(0, 2);
    	} else mainBodyID = getRandomNumberBetween(3, 5);
    	

    	Sprite mainFlashBody = SpriteSheetTools.getSquareSprite(mainBodyID, SPRITE_SIZE, SHEET_WIDTH, SHEET_HEIGHT);

    	
    	
    	
		if(shouldRenderCrossplane && !isSuppressedFlash) {
			// Only render if either in third person, or if it's on another player's
			// gun
			int sideID = getRandomNumberBetween(6, 9);
			
			Sprite spriteSide = SpriteSheetTools.getRectSprite(sideID, SPRITE_SIZE, SPRITE_SIZE*2, SHEET_WIDTH, SHEET_HEIGHT, true);
			renderCrossPlane(spriteSide, 1.2, 0.0, 0, size, size);
		}
		
	
		if(isSuppressedFlash) {
			Sprite suppressedSprite = SpriteSheetTools.getSquareSprite(0, 512, 512, 512);
			mc.getTextureManager().bindTexture(new ResourceLocation(ModReference.ID + ":textures/flashes/supre.png"));
	    	
			//GlStateManager.disableTexture2D();
	    	renderFlippedCrossPlane(suppressedSprite, 1, 0.0, 0, size/2, size/2);
		}
		
		
		// This is the most obvious part
		// of the flash
		GlStateManager.pushMatrix();
		GlStateManager.rotate(90f, 1, 0, 0);
		
		
		if(!isSuppressedFlash) {
			if(shouldRenderCrossplane) {
				
				for(double d = 0; d <= 2; ++d) {
					double descalar = 1.0 - d/2.0;
					renderFlatPlane(mainFlashBody, 0, -d, 0, size*descalar, size*descalar);
					
				}
				
			} else {
				renderFlatPlane(mainFlashBody, 0, 0, 0, size, size);
				
			}
		}
		
		if(ModernConfigManager.enableAllShaders && ModernConfigManager.enableFlashShaders) Shaders.flash.release();
		GlStateManager.popMatrix();
		
		//GL20.glDrawBuffers(GL30.GL_COLOR_ATTACHMENT0);
		
		// Return all the GL states to normal
		GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1F);
		GlStateManager.enableCull();
		GlStateManager.disableAlpha();
		GlStateManager.disableBlend();
		GlStateManager.enableLighting();
		GlStateManager.depthMask(true);
		GlStateManager.popMatrix();
		
	}
	
	public static void renderFlatPlane(Sprite sprite, double x, double y, double z, double width, double height) {
		GlStateManager.pushMatrix();
		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
		bb.pos(-width + x, y, -height + z).tex(sprite.getMinU(), sprite.getMinV()).endVertex();
		bb.pos(width + x, y, -height + z).tex(sprite.getMinU(), sprite.getMaxV()).endVertex();
		bb.pos(width + x, y, height + z).tex(sprite.getMaxU(), sprite.getMaxV()).endVertex();
		bb.pos(-width + x, y, height + z).tex(sprite.getMaxU(), sprite.getMinV()).endVertex();
		t.draw();
		GlStateManager.popMatrix();
	}
	
	public static void renderFlippedCrossPlane(Sprite sprite, double x, double y, double z, double sizeX, double sizeY) {
		
		
		

		GlStateManager.pushMatrix();
		GlStateManager.rotate(90, 0, 1, 0);
		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
		
		bb.pos(-sizeY + x, y, -sizeX + z).tex(sprite.getMinU(), sprite.getMaxV()).endVertex();
		bb.pos(sizeY + x, y, -sizeX + z).tex(sprite.getMaxU(), sprite.getMaxV()).endVertex();
		bb.pos(sizeY + x, y, sizeX + z).tex(sprite.getMaxU(), sprite.getMinV()).endVertex();
		bb.pos(-sizeY + x, y, sizeX + z).tex(sprite.getMinU(), sprite.getMinV()).endVertex();
		
		
		
		bb.pos(-sizeY + x,  -sizeX + y, z).tex(sprite.getMinU(), sprite.getMinV()).endVertex();
		bb.pos(sizeY + x, -sizeX + y,z).tex(sprite.getMaxU(), sprite.getMinV()).endVertex();
		bb.pos(sizeY + x,sizeX + y,z).tex(sprite.getMaxU(), sprite.getMaxV()).endVertex();
		bb.pos(-sizeY + x,sizeX + y,z).tex(sprite.getMinU(), sprite.getMaxV()).endVertex();
		
		t.draw();
		GlStateManager.popMatrix();

	}
	
	public static void renderCrossPlane(Sprite sprite, double x, double y, double z, double sizeX, double sizeY) {
		
	

		GlStateManager.pushMatrix();
		GlStateManager.rotate(90, 0, 1, 0);
		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
		bb.pos(-sizeY + x, y, -sizeX + z).tex(sprite.getMaxU(), sprite.getMinV()).endVertex();
		bb.pos(sizeY + x, y, -sizeX + z).tex(sprite.getMaxU(), sprite.getMaxV()).endVertex();
		bb.pos(sizeY + x, y, sizeX + z).tex(sprite.getMinU(), sprite.getMaxV()).endVertex();
		bb.pos(-sizeY + x, y, sizeX + z).tex(sprite.getMinU(), sprite.getMinV()).endVertex();
		
		
		
		bb.pos(-sizeY + x,  -sizeX + y, z).tex(sprite.getMinU(), sprite.getMinV()).endVertex();
		bb.pos(sizeY + x, -sizeX + y,z).tex(sprite.getMinU(), sprite.getMaxV()).endVertex();
		bb.pos(sizeY + x,sizeX + y,z).tex(sprite.getMaxU(), sprite.getMaxV()).endVertex();
		bb.pos(-sizeY + x,sizeX + y,z).tex(sprite.getMaxU(), sprite.getMinV()).endVertex();
		
		t.draw();
		GlStateManager.popMatrix();

	}

}
