package com.paneedah.weaponlib;

import com.paneedah.weaponlib.vehicle.collisions.GJKResult;
import com.paneedah.weaponlib.vehicle.collisions.OBBCollider;
import com.paneedah.weaponlib.vehicle.collisions.OreintedBB;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class RopeSimulation {
	
	public static class Point {
		public Vec3d pos = Vec3d.ZERO, prevPos = Vec3d.ZERO;
		public boolean locked = false;
		public String name = "";
		
		public Point(Vec3d pos) {
			this.pos = pos;
			this.prevPos = pos;
			
			
		}
		
		public Point(String name, Vec3d pos, boolean locked) {
			this.name = name;
			this.pos = pos;
			this.prevPos = pos;
			this.locked = locked;
			
			
			
		}
		
		public Point(Vec3d pos, boolean locked) {
			this.pos = pos;
			this.prevPos = pos;
			this.locked = locked;
			
			
			
		}
	}
	
	public void printPoints() {
		for(Point p : points) {
			System.out.println(p.name + "(" + points.indexOf(p) + ")");
		}
	}
	
	public static class Stick {
		public Point pointA, pointB;
		public float length;
		
		// Only applies if the distance is smaller than length
		public boolean c3Constraint = false;
		
		public Stick(Point a, Point b) {
			this.pointA = a;
			this.pointB = b;
			
			this.length = (float) a.pos.distanceTo(b.pos);
		}
	}
	
	public RopeSimulation() {
		
	}
	
	public Vec3d getPointDifference(int index) {
		return points.get(index).pos.subtract(originalPos.get(points.get(index)));
	}
	
	public void connect(Point a, Point b) {
		if(!points.contains(a)) {
			originalPos.put(a, a.pos);
			points.add(a);
		}
		if(!points.contains(b)) {
			originalPos.put(b, b.pos);
			points.add(b);
		}
		sticks.add(new Stick(a, b));
	}
	
	/**
	 * Make a C-3 constraint between two points.
	 * Means that the constraint is only enforced if
	 * the distance is smaller than the length
	 *
	 */
	public void connectC3(Point a, Point b, double len) {
		if(!points.contains(a)) {
			originalPos.put(a, a.pos);
			points.add(a);
		}
		if(!points.contains(b)) {
			originalPos.put(b, b.pos);
			points.add(b);
		}
		Stick s = new Stick(a, b);
		s.c3Constraint = true;
		s.length = (float) len;
		sticks.add(s);
	}
	
	public ArrayList<Point> points = new ArrayList<>();
	public ArrayList<Stick> sticks = new ArrayList<>();
	
	
	public HashMap<Point, Vec3d> originalPos = new HashMap<>();
	
	public void generateChain(double totalLength, int pieces) {
		
		Point prev = new Point(new Vec3d(0, 0, 0), true);
		points.add(prev);
		
		
		for(int r = 1; r < pieces+1; ++r) {
			double yOffset = totalLength*(r/(double) pieces);
			
			
			Point newPoint = new Point(new Vec3d(-yOffset, 0, 0), false);
			points.add(newPoint);
			
			prev = newPoint;
			
			//sticks.add(stick);
			
			
			
		}
		
		autoSticks();
		
		/*
		
		RopeSimulation.Point prev = new Point();
		prev.locked = true;
		prev.pos = new Vec3d(0, 0, 0);
		
		points.add(prev);
		
		for(int r = 1; r < pieces+1; ++r) {
			double yOffset = totalLength*(r/(double) pieces);
			
			Point newPoint = new Point();
			
			newPoint.pos = new Vec3d(-yOffset, 0, 0);
			newPoint.locked = false;
			
			points.add(newPoint);
			
			Stick stick = new Stick();
			stick.pointA = prev;
			stick.pointB = newPoint;
			stick.length = (float) 1.0f;
			
			prev = newPoint;
			
			sticks.add(stick);
			
			
			
		}*/
		
		
		
		System.out.println("----------START----------");
		for(Stick stick : sticks) {
			
			System.out.println(stick.pointA.pos + " | " + stick.pointB.pos);
			
		}
		System.out.println("----------END----------");
		
		/*
		RopeSimulation.Point one = new Point();
		one.locked = true;
		one.pos = new Vec3d(0, 0, 0);
		
		RopeSimulation.Point two = new Point();
		two.locked = false;
		
		two.pos = new Vec3d(-1, 0, 0);
		
		RopeSimulation.Point three = new Point();
		three.locked = false;
		three.pos = new Vec3d(-2, 0, 0);
		
		
		RopeSimulation.Stick stick = new Stick();
		stick.pointA = one;
		stick.pointB = two;
		stick.length = 1.0f;
		
		RopeSimulation.Stick stick2 = new Stick();
		stick2.pointA = two;
		stick2.pointB = three;
		stick2.length = 2.0f;
		
		simulation.points.add(one);
		simulation.points.add(two);
		simulation.points.add(three);
		simulation.sticks.add(stick);
		simulation.sticks.add(stick2);
		*/
	}
	
	public void newPoint(Vec3d pos, boolean locked) {
		this.points.add(new Point(pos, locked));
	}
	
	public void autoSticks() {
		for(int p = 0; p < points.size()-1; ++p) {
			Stick stick = new Stick(points.get(p), points.get(p+1));
			sticks.add(stick);
		}
	}
	
	public void simulate(double dt) {
		//dt /= 20;
		for(Point p : points) {
			if(!p.locked) {
				Vec3d posBeforeUpdate = p.pos;
				
				
				
				p.pos = p.pos.add(p.pos.subtract(p.prevPos));
				p.pos = p.pos.add((new Vec3d(0, -1, 0)).scale(dt*dt));
			

				
				
				
				//System.out.println(worldPos);
				//belowHeight /= 2;
				//System.out.println(belowHeight + " | " + realPos);
				
				/*
				 * A note for anyone looking at this code from Jim:
				 * 
				 * The below code is solving for the separation vector to solve the collision
				 * between the actual world and the point. It is using a really small bounding box.
				 * There is lots of room for optimization here, like seriously.  
				 */
				
				double belowHeight = -4;
				AxisAlignedBB box = new AxisAlignedBB(-0.1, -0.1, -0.1, .1, .1, .1);
				box = box.grow(0.1);
				box = box.offset(p.pos);
				
				List<AxisAlignedBB> i = mc.world.getCollisionBoxes(null, box);
				
				for(AxisAlignedBB b : i) {
					if(b.maxY < p.pos.y) {
						
						GJKResult result = OBBCollider.areColliding(OreintedBB.fromAABB(box), OreintedBB.fromAABB(b));
						// this serves as friction, works okay :/, acts more like glue lmao
						posBeforeUpdate = posBeforeUpdate.subtract(p.pos).scale(0.01).add(p.pos);
						
						p.pos = p.pos.add(result.separationVector.scale(-result.penetrationDepth));
						
					}
				}
				
				
		
				p.prevPos = posBeforeUpdate;
			}
		}
		
	//	if(1+1==2) return;
		
		for(int i = 0; i < 3; ++i) {
			for(Stick stick : sticks) {
				
				// Check if this is a c-3 constraint. C-3 contstraints only get solved when the distnace
				// b/w points is less than legnth
				if(stick.c3Constraint) {
					if(stick.pointA.pos.distanceTo(stick.pointB.pos) > stick.length) {
						continue;
					}
				}
				
				Vec3d stickCentre = stick.pointA.pos.add(stick.pointB.pos).scale(0.5);
			//	System.out.println(stickCentre);
				Vec3d stickDir = (stick.pointA.pos.subtract(stick.pointB.pos)).normalize();
				//System.out.println(stickDir);
				/*
				if(!stick.pointA.locked)
					stick.pointA.pos = stickCentre.add(stickDir).scale(stick.length).scale(0.5);
				if(!stick.pointB.locked) 
					stick.pointB.pos = stickCentre.subtract(stickDir).scale(stick.length).scale(0.5);
				*/
			
				//double a = VectorUtil.angleBetweenVec(stick.pointA.pos, stick.pointB.pos);
				//System.out.println(Math.toDegrees(a));
				
				if(!stick.pointA.locked)
					stick.pointA.pos = stickCentre.add(stickDir.scale(stick.length).scale(0.5));
				if(!stick.pointB.locked) 
					stick.pointB.pos = stickCentre.subtract(stickDir.scale(stick.length).scale(0.5));
				
			}
		}
		
	}
	
	public void render(double x, double y, double z) {
		
	}

}
