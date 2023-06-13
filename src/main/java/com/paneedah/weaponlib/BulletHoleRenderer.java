package com.paneedah.weaponlib;

import io.redstudioragnarok.redcore.vectors.Vector3D;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class BulletHoleRenderer {
	
	private LinkedBlockingQueue<BulletHole> holeQueue = new LinkedBlockingQueue<>();
	private ArrayList<BulletHole> bulletHoles = new ArrayList<>(); 
	
	public static class BulletHole {
		private Vector3D pos;
		private boolean shouldDie;
		private EnumFacing direction;
		private double size;
		private long timeExisted;
		
		public BulletHole(Vector3D pos, EnumFacing direction, double size) {
			this.pos = pos;
			this.direction = direction;
			this.size = size;
			this.timeExisted = System.currentTimeMillis();
		}
	}
	
	
	public void addBulletHole(BulletHole hole) {
		this.holeQueue.add(hole);
		
	}
	
	public void render() {
		while(holeQueue.size() > 0)
			bulletHoles.add(holeQueue.poll());
		
		this.bulletHoles.removeIf((s) -> s.shouldDie);
		
		// Setup render beginnings
		GlStateManager.pushMatrix();
		EntityPlayer pla = mc.player;
		double iPosX = pla.prevPosX + (pla.posX - pla.prevPosX)*mc.getRenderPartialTicks();
		double iPosY = pla.prevPosY + (pla.posY - pla.prevPosY)*mc.getRenderPartialTicks();
		double iPosZ = pla.prevPosZ + (pla.posZ - pla.prevPosZ)*mc.getRenderPartialTicks();
		GlStateManager.translate(-iPosX, -iPosY, -iPosZ);

		Tessellator tes  = Tessellator.getInstance();
		BufferBuilder bb = tes.getBuffer();
		GlStateManager.enableTexture2D();
		GlStateManager.disableCull();
		
		//ResourceLocation rl = new ResourceLocation(ModReference.id + ":textures/entity/bullethole.png");

		// TODO: Actually add the texture
		// mc.getTextureManager().bindTexture(rl);
		
	
	//	GL14.glBlendEquation(GL14.GL_FUNC_ADD);
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		GlStateManager.enableBlend();
		double size = 0.05;
		bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
		
		double lift = 0.01;
		for(BulletHole hole : bulletHoles) {
			if(System.currentTimeMillis()-hole.timeExisted > 2000) {
				hole.shouldDie = true;
			}
		//	System.out.println("hi: " + hole.direction);
			switch(hole.direction) {
			case UP:
				bb.pos(hole.pos.x+size, hole.pos.y+lift, hole.pos.z+size).tex(0, 0).endVertex();
				bb.pos(hole.pos.x-size, hole.pos.y+lift, hole.pos.z+size).tex(1, 0).endVertex();
				bb.pos(hole.pos.x-size, hole.pos.y+lift, hole.pos.z-size).tex(1, 1).endVertex();
				bb.pos(hole.pos.x+size, hole.pos.y+lift, hole.pos.z-size).tex(0, 1).endVertex();
				break;
			case DOWN:
				bb.pos(hole.pos.x+size, hole.pos.y-lift, hole.pos.z+size).tex(0, 0).endVertex();
				bb.pos(hole.pos.x-size, hole.pos.y-lift, hole.pos.z+size).tex(1, 0).endVertex();
				bb.pos(hole.pos.x-size, hole.pos.y-lift, hole.pos.z-size).tex(1, 1).endVertex();
				bb.pos(hole.pos.x+size, hole.pos.y-lift, hole.pos.z-size).tex(0, 1).endVertex();
				break;
			case EAST:
				bb.pos(hole.pos.x+lift, hole.pos.y+size, hole.pos.z+size).tex(0, 0).endVertex();
				bb.pos(hole.pos.x+lift, hole.pos.y-size, hole.pos.z+size).tex(1, 0).endVertex();
				bb.pos(hole.pos.x+lift, hole.pos.y-size, hole.pos.z-size).tex(1, 1).endVertex();
				bb.pos(hole.pos.x+lift, hole.pos.y+size, hole.pos.z-size).tex(0, 1).endVertex();
				break;
			case WEST:
				bb.pos(hole.pos.x-lift, hole.pos.y+size, hole.pos.z+size).tex(0, 0).endVertex();
				bb.pos(hole.pos.x-lift, hole.pos.y-size, hole.pos.z+size).tex(1, 0).endVertex();
				bb.pos(hole.pos.x-lift, hole.pos.y-size, hole.pos.z-size).tex(1, 1).endVertex();
				bb.pos(hole.pos.x-lift, hole.pos.y+size, hole.pos.z-size).tex(0, 1).endVertex();
				break;
			case SOUTH:
				bb.pos(hole.pos.x+size, hole.pos.y+size, hole.pos.z+lift).tex(0, 0).endVertex();
				bb.pos(hole.pos.x+size, hole.pos.y-size, hole.pos.z+lift).tex(1, 0).endVertex();
				bb.pos(hole.pos.x-size, hole.pos.y-size, hole.pos.z+lift).tex(1, 1).endVertex();
				bb.pos(hole.pos.x-size, hole.pos.y+size, hole.pos.z+lift).tex(0, 1).endVertex();
				break;
			case NORTH:
				bb.pos(hole.pos.x+size, hole.pos.y+size, hole.pos.z-lift).tex(0, 0).endVertex();
				bb.pos(hole.pos.x+size, hole.pos.y-size, hole.pos.z-lift).tex(1, 0).endVertex();
				bb.pos(hole.pos.x-size, hole.pos.y-size, hole.pos.z-lift).tex(1, 1).endVertex();
				bb.pos(hole.pos.x-size, hole.pos.y+size, hole.pos.z-lift).tex(0, 1).endVertex();
				break;
			}
			
			
			
		}
		
		//GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		
		GlStateManager.disableBlend();
		
		tes.draw();
		
		GlStateManager.popMatrix();
		
	}
	
	

}
