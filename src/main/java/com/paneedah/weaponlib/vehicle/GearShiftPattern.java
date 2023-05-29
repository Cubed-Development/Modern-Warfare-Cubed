package com.paneedah.weaponlib.vehicle;

import akka.japi.Pair;
import com.paneedah.weaponlib.vehicle.jimphysics.Transmission;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedList;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class GearShiftPattern {
	
	private LinkedList<Branch> pattern = new LinkedList<>();
	
	public GearShiftPattern() {
		
	}
	
	public GearShiftPattern withNormalBranch(int g1, int g2) {
		Vec3d v1 = new Vec3d(0.5, 0, (1.0*pattern.size()));
		Vec3d v2 = new Vec3d(-0.5, 0, (1.0*pattern.size()));
		return withBranch(v1, g1, v2, g2);
	}
	
	public GearShiftPattern withBranch(Vec3d v1, int g1, Vec3d v2, int g2) {
		Node n1 = new Node(v1, g1);
		Node n2 = new Node(v2, g2);
		Branch b = new Branch(n1, n2, pattern.size());
		pattern.add(b);
		return this;
	}
	
	public static double interpValue(double oldVal, double newVal, double step) {
		return oldVal + (newVal-oldVal)*step;
	}
	
	public static Vec3d interpVec3d(Vec3d one, Vec3d two, double step) {
		return new Vec3d(interpValue(one.x, two.x, step), interpValue(one.y, two.y, step),interpValue(one.z, two.z, step));
	}
	
	public void drawCenteredString(FontRenderer fontRendererIn, String text, double x, double y, int color, double scale)
    {
		GL11.glPushMatrix();
		
		GL11.glTranslated(x, y, 0);
		GL11.glScaled(scale, scale, scale);
		
        fontRendererIn.drawStringWithShadow(text, (float)(-fontRendererIn.getStringWidth(text) / 2), 0.0f, color);
        GL11.glPopMatrix();
    }
	
	
	public void renderPattern(Color c, double x, double y) {
		
		
		
	
		
		GL11.glPushMatrix();
		float red = c.getRed()/255.0f;
		float blue = c.getBlue()/255.0f;
		float green = c.getGreen()/255.0f;
		float alpha = c.getAlpha()/255.0f;
		
		GL11.glLineWidth(3.0f);
		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		bb.begin(GL11.GL_LINE_STRIP, DefaultVertexFormats.POSITION_COLOR);
		
		for(Branch b : pattern) {
			Vec3d tG = b.topGear.pos;
			Vec3d bG = b.bottomGear.pos;
			Vec3d m = b.median;
			
			
			bb.pos(m.z, -m.x, 0).color(red, green, blue, alpha).endVertex();
			bb.pos(tG.z, -tG.x, 0).color(red, green, blue, alpha).endVertex();
			bb.pos(bG.z, -bG.x, 0).color(red, green, blue, alpha).endVertex();
			bb.pos(m.z, -m.x, 0).color(red, green, blue, alpha).endVertex();
			
		}
		
		
		t.draw();
		GL11.glPopMatrix();
		
		/*
		for(Branch b : pattern) {
			Vec3d tG = b.topGear.pos;
			Vec3d bG = b.bottomGear.pos;
			Vec3d m = b.median;
			
			drawCenteredString(mc.fontRenderer, "" + b.topGear.gear, +tG.z, -tG.x, 0xffdd59, 0.5);
			drawCenteredString(mc.fontRenderer, "" + b.bottomGear.gear, +bG.z, -bG.x, 0xffdd59, 0.5);
			
		}*/
		
		GlStateManager.enableAlpha();
		GlStateManager.enableTexture2D();
		
		
		for(Branch b : pattern) {
			Vec3d tG = b.topGear.pos;
			Vec3d bG = b.bottomGear.pos;
			Vec3d m = b.median;
			
			drawCenteredString(mc.fontRenderer, "" + b.topGear.gear, +tG.z, -tG.x*1.5, 0xffdd59, 0.02);
			drawCenteredString(mc.fontRenderer, "" + b.bottomGear.gear, +bG.z, -bG.x*1.1, 0xffdd59, 0.02);
			
			//drawCenteredString(mc.fontRenderer, "1", 20, -5, 0xffdd59, 0.05);\
			/*
			drawCenteredString(mc.fontRenderer, "" + b.topGear.gear, +tG.z, -tG.x, 0xffdd59, 0.5);
			drawCenteredString(mc.fontRenderer, "" + b.bottomGear.gear, +bG.z, -bG.x, 0xffdd59, 0.5);
			*/
		}
		//GlStateManager.disableAlpha();
		
	}
	
	public Vec3d quickDoAnimation(Transmission transmission) {
		return doAnimation(transmission.shiftTimer, transmission.maxShiftTime, transmission.startGear, transmission.targetGear);
	}
	
	public Vec3d doAnimation(int curVal, int maxVal, int startGear, int targetGear) {
		
		
		
		
		curVal = Math.min(maxVal, curVal);
		//System.out.println("CURVAL: " + curVal + " | MAX: " + maxVal + " | SG: " + startGear + " | TG: " + targetGear);
		
		ArrayList<Vec3d> transitions = getTransitions(startGear, targetGear);
		double globalStep = (double) curVal;
		
		double timePerTransiton = maxVal/((double) transitions.size()-1);
		
		ArrayList<Pair<Double, Vec3d>> realTimeTransitions = new ArrayList<>();
		double lastTime = 0;
		double totalPauseTime = 5;
		for(int x = 0; x < transitions.size(); ++x) {
			//realTimeTransitions.add(new Pair<Double, Vec3d>(lastTime+0.1, transitions.get(x)));
			
			if(x != 0) {
				realTimeTransitions.add(new Pair<Double, Vec3d>(lastTime+(timePerTransiton*x-totalPauseTime), transitions.get(x)));
			}
			
			realTimeTransitions.add(new Pair<Double, Vec3d>(lastTime+(timePerTransiton*x), transitions.get(x)));
			
			
			if(x == 0) {
				realTimeTransitions.add(new Pair<Double, Vec3d>(lastTime+(timePerTransiton*x+totalPauseTime), transitions.get(x)));
			}
			
		}
		
		//System.out.println(realTimeTransitions);
		Vec3d f = null;
		Vec3d s = null;
		double fB = 0;
		double sB = 0;
		
		
		for(int x = 0; x < realTimeTransitions.size()-1; ++x) {
			
			double firstBound = realTimeTransitions.get(x).first();
			double secondBound = realTimeTransitions.get(x+1).first();
			if(globalStep <= secondBound && globalStep >= firstBound) {
				f = realTimeTransitions.get(x).second();
				s = realTimeTransitions.get(x+1).second();
				fB = firstBound;
				sB = secondBound;
				break;
			}
		}
		
		double step = (globalStep-fB)/(sB-fB);
		step = step;
		
		
		
		return interpVec3d(f, s, step);
		
		
		/*
		
		
		Vec3d f = null;
		Vec3d s = null;
		double fB = 0;
		double sB = 0;
		
		
		for(int x = 0; x < transitions.size()-1; ++x) {
			
			double firstBound = timePerTransiton*x;
			double secondBound = timePerTransiton*(x+1);
			if(globalStep <= secondBound && globalStep >= firstBound) {
				f = transitions.get(x);
				s = transitions.get(x+1);
				fB = firstBound;
				sB = secondBound;
				break;
			}
		}
		
		double step = (globalStep-fB)/(sB-fB);
		return interpVec3d(f, s, step);*/
		
		
	}
	
	
	/**
	 * Calculates all the moves requires to get to the next gear position
	 * 
	 * @param startGear -> the gear we are starting our shift in
	 * @param endGear - > the gear we want to get to
	 * @return -> a list of transitions
	 */
	public ArrayList<Vec3d> getTransitions(int startGear, int endGear) {
		ArrayList<Vec3d> transitions = new ArrayList<>();
		
		boolean shouldReverse = false;
		if(startGear > endGear) {
			shouldReverse = true;
		}
		if(shouldReverse) {
			int tempGear = startGear;
			startGear = endGear;
			endGear = tempGear;
		}
		
		for(int x = 0; x < pattern.size(); ++x) {
			Branch b = pattern.get(x);
			if(b.containsGear(startGear) && b.containsGear(endGear)) {
				transitions.add(b.getGearPos(startGear));
				transitions.add(b.median);
				transitions.add(b.getGearPos(endGear));
				break;
			} else if(b.containsGear(startGear)) {
				transitions.add(b.getGearPos(startGear));
				transitions.add(b.median);
			} else if(b.containsGear(endGear)) {
				transitions.add(b.median);
				transitions.add(b.getGearPos(endGear));
			}
		}
	
		
		if(shouldReverse) {
			java.util.Collections.reverse(transitions);
		}
		
		
		return transitions;
		
		
	}
	
	
	
	class Branch {
		Node topGear;
		Node bottomGear;
		Vec3d median;
		
		public Branch(Node t, Node b, int i) {
			this.topGear = t;
			this.bottomGear = b;
			this.median = this.topGear.pos.add(this.bottomGear.pos).scale(0.5);
		}
		
		public boolean containsGear(int g) {
			if(topGear.gear == g || bottomGear.gear == g) {
				return true;
			} else return false;
		}
		
		public Vec3d getGearPos(int g) {
			if(topGear.gear == g) {
				return topGear.pos;
			} else if(bottomGear.gear == g) {
				return bottomGear.pos;
			} else return null;
		}
		
	}
	
	class Node {
		Vec3d pos;
		int gear;
		
		public Node(Vec3d pos, int gear) {
			this.pos = pos;
			this.gear = gear;
		}
	}

}
