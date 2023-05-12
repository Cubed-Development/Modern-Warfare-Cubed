package com.paneedah.weaponlib.compatibility;

import com.paneedah.weaponlib.animation.MatrixHelper;
import com.paneedah.weaponlib.compatibility.shells.ShellRegistry;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.render.InstancedShellObject;
import com.paneedah.weaponlib.render.WavefrontLoader;
import com.paneedah.weaponlib.render.WavefrontModel;
import com.paneedah.weaponlib.render.bgl.GLCompatible;
import com.paneedah.weaponlib.render.bgl.instancing.InstancedAttribute;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import com.paneedah.weaponlib.shader.jim.Shader;
import com.paneedah.weaponlib.shader.jim.ShaderLoader;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import javax.vecmath.Vector3d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class ShellRenderer {

	private static HashMap<Shell.Type, InstancedShellObject> shellObjMap = new HashMap<>();
	private static Shader legacyShader = ShaderLoader.loadShader("shells");

	private static int shadowDisplayList = -1;
	
	// CREDIT: http://www.opengl-tutorial.org/beginners-tutorials/tutorial-4-a-colored-cube/
	public static final float[] g_vertex_buffer_data = {
		    -1.0f,-1.0f,-1.0f, // triangle 1 : begin
		    -1.0f,-1.0f, 1.0f,
		    -1.0f, 1.0f, 1.0f, // triangle 1 : end
		    1.0f, 1.0f,-1.0f, // triangle 2 : begin
		    -1.0f,-1.0f,-1.0f,
		    -1.0f, 1.0f,-1.0f, // triangle 2 : end
		    1.0f,-1.0f, 1.0f,
		    -1.0f,-1.0f,-1.0f,
		    1.0f,-1.0f,-1.0f,
		    1.0f, 1.0f,-1.0f,
		    1.0f,-1.0f,-1.0f,
		    -1.0f,-1.0f,-1.0f,
		    -1.0f,-1.0f,-1.0f,
		    -1.0f, 1.0f, 1.0f,
		    -1.0f, 1.0f,-1.0f,
		    1.0f,-1.0f, 1.0f,
		    -1.0f,-1.0f, 1.0f,
		    -1.0f,-1.0f,-1.0f,
		    -1.0f, 1.0f, 1.0f,
		    -1.0f,-1.0f, 1.0f,
		    1.0f,-1.0f, 1.0f,
		    1.0f, 1.0f, 1.0f,
		    1.0f,-1.0f,-1.0f,
		    1.0f, 1.0f,-1.0f,
		    1.0f,-1.0f,-1.0f,
		    1.0f, 1.0f, 1.0f,
		    1.0f,-1.0f, 1.0f,
		    1.0f, 1.0f, 1.0f,
		    1.0f, 1.0f,-1.0f,
		    -1.0f, 1.0f,-1.0f,
		    1.0f, 1.0f, 1.0f,
		    -1.0f, 1.0f,-1.0f,
		    -1.0f, 1.0f, 1.0f,
		    1.0f, 1.0f, 1.0f,
		    -1.0f, 1.0f, 1.0f,
		    1.0f,-1.0f, 1.0f
		};
	
	static {
		if(GLCompatible.doesSupportInstancing()) {
			addInstancedOperator(Type.ASSAULT, "assaultshell");
			addInstancedOperator(Type.SHOTGUN, "12gaugeshell");
			addInstancedOperator(Type.PISTOL, "9mmshell");
		}
		
	}
	
	
	public static void addInstancedOperator(Shell.Type type, String name) {
		WavefrontModel model = WavefrontLoader.loadSubModel(name, "casing", true);
		InstancedShellObject iso = new InstancedShellObject(type, "instanced", model, GL11.GL_TRIANGLES, 10000,
				new InstancedAttribute("inPosition", 3, InstancedAttribute.Type.VEC3),
				new InstancedAttribute("inQuat", 4, InstancedAttribute.Type.VEC4),
				new InstancedAttribute("inLightmapCoords", 5, InstancedAttribute.Type.VEC2));
		shellObjMap.put(type, iso);
	}
	
	public static void setupLightmapCoords(Vector3d pos) {
		setupLightmapCoords(new Vec3d(pos.x, pos.y, pos.z));
	}
	
	/**
	 * Sets the lightmap texture coordinates
	 */
	public static void setupLightmapCoords(Vec3d pos) {
		int i = mc.world.getCombinedLight(new BlockPos(pos.x, pos.y, pos.z), 0);
		float f = (float) (i & 65535);
		float f1 = (float) (i >> 16);
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, f, f1);

	}
	
	
	public static double getDistanceFromPlayer(Vector3d vec) {
		
		Vec3d player = mc.player.getPositionVector();
		double d0 = vec.x - player.x;
        double d1 = vec.y - player.y;
        double d2 = vec.z - player.z;
        return d0 * d0 + d1 * d1 + d2 * d2;
	}

	
	
	private static int degenDisplayOne = -1; 
	
	public static void renderDegenerateModel() {
		if(degenDisplayOne == -1) {
		
			degenDisplayOne = GLAllocation.generateDisplayLists(1);
			GlStateManager.glNewList(degenDisplayOne, 4864);
			Tessellator t = Tessellator.getInstance();
			BufferBuilder bb2 = t.getBuffer();
			bb2.begin(GL11.GL_TRIANGLES, DefaultVertexFormats.POSITION);
			//GlStateManager.disableCull();
			GlStateManager.color(0.78f, 0.65f, 0.33f, 1);
			GlStateManager.disableTexture2D();
			
			GlStateManager.disableLighting();
			double shScaleX = 0.02;
			double shScaleY = 0.12;
			double shScaleZ = 0.02;
			for(int i = 0; i < g_vertex_buffer_data.length-3; i += 3) {
				bb2.pos(g_vertex_buffer_data[i]*shScaleX, g_vertex_buffer_data[i+1]*shScaleY, g_vertex_buffer_data[i+2]*shScaleZ).endVertex();
			}
			GlStateManager.color(1, 1, 1);
			t.draw();
			GlStateManager.glEndList();
 		} else {
 		
 			GlStateManager.callList(degenDisplayOne);
 		}
	}
	
	public static void render(ArrayList<Shell> shells) {
		
	
		
		
		GlStateManager.pushMatrix();

		GlStateManager.enableTexture2D();

		// Interpolate player's position for rendering
		EntityPlayerSP pla = mc.player;

		float interpX = (float) MatrixHelper.solveLerp(pla.prevPosX, pla.posX,
				mc.getRenderPartialTicks());
		float interpY = (float) MatrixHelper.solveLerp(pla.prevPosY, pla.posY,
				mc.getRenderPartialTicks());
		float interpZ = (float) MatrixHelper.solveLerp(pla.prevPosZ, pla.posZ,
				mc.getRenderPartialTicks());
		GlStateManager.translate(-interpX, -interpY, -interpZ);
		
		if(GLCompatible.doesSupportInstancing()) {
			
			renderInstanced(shells);
		} else {
			//System.out.println("hi");
			renderNonInstanced(shells);
		}
		
		GlStateManager.color(1, 1, 1);
		GlStateManager.popMatrix();

	}
	
	public static void renderInstanced(ArrayList<Shell> shells) {
		for(Entry<Type, InstancedShellObject> i : shellObjMap.entrySet()) {
			mc.getTextureManager().bindTexture(ShellRegistry.getShellTexture(i.getKey()));
			i.getValue().updateData(shells);
			i.getValue().render(shells.size());
		}
		
		
	}
	
	public static void renderNonInstanced(ArrayList<Shell> shells) {
		GlStateManager.enableCull();
		GlStateManager.color(1, 1, 1, 1);
		mc.entityRenderer.enableLightmap();
		
		
		//System.out.println(shells.size());
		for (Shell sh : shells) {

			GlStateManager.pushMatrix();
			
			// setup lightmap
			setupLightmapCoords(sh.pos);
			
			
			// interpolate pos & rot
			Vec3d iP = MatrixHelper.lerpVectors(sh.prevPos, sh.pos, mc.getRenderPartialTicks());
			Vec3d iR = MatrixHelper.lerpVectors(sh.prevRot, sh.rot, mc.getRenderPartialTicks());
			
			// translate last
			GlStateManager.translate(iP.x, iP.y, iP.z);

	
			
		
			

			GlStateManager.rotate((float) iR.x, 0, 0, 1);
			GlStateManager.rotate((float) iR.y, 0, 1, 0);
			GlStateManager.rotate((float) iR.z, 1, 0, 0);
			
			double shellScale = 0.8;
			GlStateManager.scale(shellScale, shellScale, shellScale);
			
			
			
			
			//GlStateManager.disableLighting();
			
			//System.out.println(GL11.glIsEnabled(cap));
			GlStateManager.enableLighting();
			GlStateManager.enableTexture2D();
			
			
			if(getDistanceFromPlayer(sh.pos) < 120) {
				
				if(ModernConfigManager.enableAllShaders) {
					legacyShader.use();
					legacyShader.uniform1i("lightmap", 1);
					mc.getTextureManager().bindTexture(ShellRegistry.getShellTexture(sh.getType()));
					ShellRegistry.getShellModel(sh.getType()).render();
					legacyShader.release();
				} else {
					mc.getTextureManager().bindTexture(ShellRegistry.getShellTexture(sh.getType()));
					ShellRegistry.getShellModel(sh.getType()).render();
				}
				
			} else {
				
				
				renderDegenerateModel();
			}
			
			
			
			GlStateManager.disableLighting();
			GlStateManager.disableTexture2D();
			GlStateManager.popMatrix();
			
			
			

			

		}
	
		GlStateManager.enableTexture2D();
		mc.entityRenderer.disableLightmap();
		//GlStateManager.popMatrix();
	}
}
