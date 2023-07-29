package com.paneedah.weaponlib;

import io.redstudioragnarok.redcore.vectors.Vector3D;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.utils.ModReference.ID;

public class BulletHoleRenderer {

    private final LinkedBlockingQueue<BulletHole> holeQueue = new LinkedBlockingQueue<>();
    private final ArrayList<BulletHole> bulletHoles = new ArrayList<>();

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
        this.holeQueue.removeIf(bulletHole -> bulletHole.shouldDie);

        GlStateManager.pushMatrix();

        EntityPlayer player = MC.player;
        double iPosX = player.prevPosX + (player.posX - player.prevPosX) * MC.getRenderPartialTicks();
        double iPosY = player.prevPosY + (player.posY - player.prevPosY) * MC.getRenderPartialTicks();
        double iPosZ = player.prevPosZ + (player.posZ - player.prevPosZ) * MC.getRenderPartialTicks();
        GlStateManager.translate(-iPosX, -iPosY, -iPosZ);

        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder buffer = tessellator.getBuffer();
        GlStateManager.enableTexture2D();
        GlStateManager.disableCull();

         MC.getTextureManager().bindTexture(new ResourceLocation(ID + ":textures/entity/bullethole.png"));

        GL14.glBlendEquation(GL14.GL_FUNC_ADD);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.enableBlend();
        final double size = 0.05;
        final double lift = 0.01;

        buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);

        for (BulletHole hole : holeQueue) {
            if (System.currentTimeMillis() - hole.timeExisted > 2000)
                hole.shouldDie = true;

            switch (hole.direction) {
                case UP:
                    buffer.pos(hole.pos.x + size, hole.pos.y + lift, hole.pos.z + size).tex(0, 0).endVertex();
                    buffer.pos(hole.pos.x - size, hole.pos.y + lift, hole.pos.z + size).tex(1, 0).endVertex();
                    buffer.pos(hole.pos.x - size, hole.pos.y + lift, hole.pos.z - size).tex(1, 1).endVertex();
                    buffer.pos(hole.pos.x + size, hole.pos.y + lift, hole.pos.z - size).tex(0, 1).endVertex();
                    break;
                case DOWN:
                    buffer.pos(hole.pos.x + size, hole.pos.y - lift, hole.pos.z + size).tex(0, 0).endVertex();
                    buffer.pos(hole.pos.x - size, hole.pos.y - lift, hole.pos.z + size).tex(1, 0).endVertex();
                    buffer.pos(hole.pos.x - size, hole.pos.y - lift, hole.pos.z - size).tex(1, 1).endVertex();
                    buffer.pos(hole.pos.x + size, hole.pos.y - lift, hole.pos.z - size).tex(0, 1).endVertex();
                    break;
                case EAST:
                    buffer.pos(hole.pos.x + lift, hole.pos.y + size, hole.pos.z + size).tex(0, 0).endVertex();
                    buffer.pos(hole.pos.x + lift, hole.pos.y - size, hole.pos.z + size).tex(1, 0).endVertex();
                    buffer.pos(hole.pos.x + lift, hole.pos.y - size, hole.pos.z - size).tex(1, 1).endVertex();
                    buffer.pos(hole.pos.x + lift, hole.pos.y + size, hole.pos.z - size).tex(0, 1).endVertex();
                    break;
                case WEST:
                    buffer.pos(hole.pos.x - lift, hole.pos.y + size, hole.pos.z + size).tex(0, 0).endVertex();
                    buffer.pos(hole.pos.x - lift, hole.pos.y - size, hole.pos.z + size).tex(1, 0).endVertex();
                    buffer.pos(hole.pos.x - lift, hole.pos.y - size, hole.pos.z - size).tex(1, 1).endVertex();
                    buffer.pos(hole.pos.x - lift, hole.pos.y + size, hole.pos.z - size).tex(0, 1).endVertex();
                    break;
                case SOUTH:
                    buffer.pos(hole.pos.x + size, hole.pos.y + size, hole.pos.z + lift).tex(0, 0).endVertex();
                    buffer.pos(hole.pos.x + size, hole.pos.y - size, hole.pos.z + lift).tex(1, 0).endVertex();
                    buffer.pos(hole.pos.x - size, hole.pos.y - size, hole.pos.z + lift).tex(1, 1).endVertex();
                    buffer.pos(hole.pos.x - size, hole.pos.y + size, hole.pos.z + lift).tex(0, 1).endVertex();
                    break;
                case NORTH:
                    buffer.pos(hole.pos.x + size, hole.pos.y + size, hole.pos.z - lift).tex(0, 0).endVertex();
                    buffer.pos(hole.pos.x + size, hole.pos.y - size, hole.pos.z - lift).tex(1, 0).endVertex();
                    buffer.pos(hole.pos.x - size, hole.pos.y - size, hole.pos.z - lift).tex(1, 1).endVertex();
                    buffer.pos(hole.pos.x - size, hole.pos.y + size, hole.pos.z - lift).tex(0, 1).endVertex();
                    break;
            }
        }

        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

        tessellator.draw();

        GlStateManager.popMatrix();

        GlStateManager.disableBlend();
        GlStateManager.enableCull();
        GlStateManager.disableTexture2D();
    }
}
