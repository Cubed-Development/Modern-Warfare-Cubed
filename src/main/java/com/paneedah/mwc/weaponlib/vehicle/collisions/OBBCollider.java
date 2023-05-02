package com.paneedah.mwc.weaponlib.vehicle.collisions;

import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.Iterator;

public class OBBCollider {
	
	public static int gjkMaxAttempts = 64;
	public static int epaMaxAttempts = 128;
	
	
	public static float epsilon = 0.00001f;
	
	public static MKV CSOSupport(OreintedBB a, OreintedBB b, Vec3d dir) {
		Vec3d support = 
				a.support(dir).subtract(b.support(dir.scale(-1)));
		return new MKV(support, dir);
	}
	
	
	
	
	/*
	 * GJK IMPLEMENTATION DESIGNED BASED OFF OF https://www.youtube.com/watch?v=Qupqu1xe7Io,
	 * THANK YOU TO DRILLGON200 FOR RECOMMENDING THE VIDEO AND PROVIDING ADVICE
	 * ALONG THE WAY!!
	 * 
	 * (code is commented for my own understanding + understanding of anyone who
	 * is looking at the code :))
	 */
	
	public static GJKResult areColliding(OreintedBB one, OreintedBB two) {
	
		GJKResult result = new GJKResult();
		
		Simplex simplex = new Simplex();
		
		// starting direction, this can be optimized with certain math algorithms
		Vec3d direction = new Vec3d(0, 0, 1);
		
		// get support in starting direction
		MKV support = CSOSupport(one, two, direction);
		
		// add the starting point
		simplex.addPoint(support);
		
		// now we want to search in the opposite direction of that
		direction = support.v.scale(-1);
		
		for(int x = 0; x < gjkMaxAttempts; ++x) {
			support = CSOSupport(one, two, direction);
			
			
			// if it cannot find a closer point, no collision >:(
			// if there's no closer point we can't make a simplex
			// that encloses the actual origin
			
			if(support.v.dotProduct(direction) < 0) {
				result.status = GJKResult.Status.SEPARATED;
				return result;
			}
			
			// if we do, then add this boi to le simplex
			simplex.addPoint(support);
			
		
			switch(simplex.getSize()) {
				case 0:
				case 1:
					break;
				case 2:
					// simplex is a line, AB = (B-A), AO = (Origin - A) [AKA: -A]
					Vec3d ab = simplex.points[1].v.subtract(simplex.points[0].v);
					Vec3d ao = simplex.points[0].v.scale(-1);
					
					if(ab.dotProduct(ao) > 0) {
						direction = ab.crossProduct(ao).crossProduct(ab);
					} else {
						simplex.points[1] =  null;
						simplex.size -= 1;
						direction = ao;
					}
					
					break;
				case 3:
					// simplex is a triangle
					ab = simplex.points[1].v.subtract(simplex.points[0].v);
					ao = simplex.points[0].v.scale(-1);
					Vec3d ac = simplex.points[2].v.subtract(simplex.points[0].v);
					Vec3d abc = ab.crossProduct(ac);
					direction = checkTriangleCase(simplex, ab, ac, abc, ao);
					break;
				case 4:
					
					// simplex is a tetrahedron
					ab = simplex.points[1].v.subtract(simplex.points[0].v);
					ao = simplex.points[0].v.scale(-1);
					ac = simplex.points[2].v.subtract(simplex.points[0].v);
					Vec3d ad = simplex.points[3].v.subtract(simplex.points[0].v);
					
					Vec3d tetraCheck = checkTetrahedralCase(simplex, ab, ac, ad, ao);
					if(tetraCheck == null) {
						//testDrillgonEPA(simplex, one, two, result);
						
						runEPA(result, simplex, one, two);
						return result;
					} else {
						direction = tetraCheck;
					}
					
					break;
			}
			
			
			
		}
		System.out.println("GJK Failure " + simplex.getSize());
		result.status = GJKResult.Status.FAILED;
		return result;
	}
	
	
	public static Vec3d localSupport(RigidBody body, OreintedBB c, Vec3d worldDir){
		double margin = 0;
		if(body != null){
			Vec3d localDir = body.globalToLocalVec(worldDir);
			if(margin != 0){
				localDir = localDir.normalize();
				return body.localToGlobalPos(c.support(localDir).add(localDir.scale(margin)));
			}
			return body.localToGlobalPos(c.support(localDir));
		} else {
			if(margin != 0){
				worldDir = worldDir.normalize();
				return c.support(worldDir).add(worldDir.scale(margin));
			}
			return c.support(worldDir);
		}
	}
	
	public static Vec3d checkTetrahedralCase(Simplex simp, Vec3d ab, Vec3d ac, Vec3d ad, Vec3d ao) {
		
		
		// AB * AC face
		if(ab.crossProduct(ac).dotProduct(ao) > 0) {
			simp.points[3] = null;
			simp.size -= 1;
			return checkTriangleCase(simp, ab, ac, ab.crossProduct(ac), ao);
		} else if(ac.crossProduct(ad).dotProduct(ao) > 0) {
			simp.points[1] = simp.points[2];
			simp.points[2] = simp.points[3];
			simp.points[3] = null;
			simp.size -= 1;
			return checkTriangleCase(simp, ac, ad, ac.crossProduct(ad), ao);
		} else if(ad.crossProduct(ab).dotProduct(ao) > 0) {
			
			simp.points[2] = simp.points[1];
			simp.points[1] = simp.points[3];
			simp.points[3] = null;
			simp.size -= 1;
			
			/*
			simp.points[1] = simp.points[3];
			simp.points[3] = null;
			simp.size -= 1;*/
			return checkTriangleCase(simp, ad, ab, ad.crossProduct(ab), ao);
		} else return null;
		
		
		
	}
	
	public static Vec3d checkTriangleCase(Simplex simp, Vec3d ab, Vec3d ac, Vec3d abc, Vec3d ao) {
		
		Vec3d direction = Vec3d.ZERO;
		
		if(abc.crossProduct(ac).dotProduct(ao) > 0) {
			if(ac.dotProduct(ao) > 0) {
				// notice that AC * AO * AC is the same form we did for the line, so
				// we are trying to make a new triangle, therefore we remove the second
				// point as it is sus. 
				
				simp.points[1] = simp.points[2];
				simp.points[2] = null;
				simp.size -= 1;
				
				return ac.crossProduct(ao).crossProduct(ac);
			} else {
				return specialTriangleCase(simp, ab, ac, abc, ao);
			}
		} else {
			if(ab.crossProduct(abc).dotProduct(ao) > 0) {
				return specialTriangleCase(simp, ab, ac, abc, ao);
			} else {
				if(abc.dotProduct(ao) > 0) {
					return abc;
				} else {
					MKV temp = simp.points[2];
					simp.points[2] = simp.points[1];
					simp.points[1] = temp;
					
					return abc.scale(-1);
				}
			}
		}
		
	}
	
	public static Vec3d specialTriangleCase(Simplex simp, Vec3d ab, Vec3d ac, Vec3d abc, Vec3d ao) {
		if(ab.dotProduct(ao) > 0) {
			// same explanation as the one in the other method
			
			simp.points[2] = null;
			simp.size -= 1;
			
			return ab.crossProduct(ao).crossProduct(ab);
		} else {
			
			// now we want to re-search from the last point,
			// so we are trying to make a line. Therefore,
			// we should remove our last two points.
			
			simp.points[1] = null;
			simp.points[2] = null;
			simp.size -= 2;
			
			return ao;
		}
		
	
	}
	
	/*
	 * EPA IMPLEMENTATION!!
	 * https://www.youtube.com/watch?v=0XQ2FSz3EK8
	 * https://www.youtube.com/watch?v=6rgiPrzqt9w
	 * https://blog.winter.dev/2020/epa-algorithm/
	 * 
	 * 
	 */
	
	
	public static void runEPA(GJKResult result, Simplex simplex, OreintedBB one, OreintedBB two) {
		
		ArrayList<MKV[]> faces = new ArrayList<>();
		ArrayList<MKV[]> edges = new ArrayList<>();
		
	
		
		// starting polytope
		// ABC | ACD | ADB | BCD
		
		faces.add(generateFace(simplex.points[0], simplex.points[1], simplex.points[2]));
		faces.add(generateFace(simplex.points[0], simplex.points[2], simplex.points[3]));
		faces.add(generateFace(simplex.points[0], simplex.points[3], simplex.points[1]));
		faces.add(generateFace(simplex.points[1], simplex.points[2], simplex.points[3]));
		
		
		for(int r = 0; r < epaMaxAttempts; ++r) {
			// first, we have to find the closest face on the tetrahedron
			MKV[] closestFace = null;
			float startingMin = Float.MAX_VALUE;
			
			for(MKV[] face : faces) {
				float dist = originToPlane(face);
				if(dist < startingMin) {
					closestFace = face;
					startingMin = dist;
				}
			}
			
			
			
			// get a new support point
			MKV support = CSOSupport(one, two, closestFace[3].v);
			
			
			// we then have to check to make sure the facer is actually
			// closer than the last one we tried (or in this case just really super close),
			// if it's not, we know that's the one
		
			if(distanceToPlane(closestFace, support.v) < epsilon) {
				/*
				 * Generate important information used to solve contacts.
				 * 
				 * 
				 * "Project the origin onto the closest triangle.
				 *  This is our closest point to the origin on the CSO�s boundary.
				 *  Compute the barycentric coordinates of this closest 
				 *  point using the vertices from this triangle. 
				 *  The barycentric coordinates are linear combination coefficients 
				 *  of vertices from the triangle. For each collider, linearly combine the support 
				 *  points corresponding to the vertices of the triangle, using the same barycentric
				 *  coordinates as coefficients. This gives us contact points on each 
				 *  collider in local space. We can then convert these contact points to world space."
				 *  
				 *  - Chou
				 */
				
				// set the result
				result.status = GJKResult.Status.COLLIDING;
				
				
				// get the contact normal and the penetration depth
				Vec3d spV =  planeProjectOrigin(closestFace);
				result.separationVector = spV.normalize();
				result.penetrationDepth = spV.length();
				
				Vec3d[][] com = new Vec3d[2][3];
				
				for(short s = 0; s < 3; s++) {
					com[0][s] = one.support(closestFace[s].u);
					com[1][s] = two.support(closestFace[s].u.scale(-1));
				}
				
				Vec3d baryCoords = calculateBarycentric(closestFace, spV);
				
				Vec3d cA = new Vec3d(com[0][0].x*baryCoords.x + com[0][1].x*baryCoords.y + com[0][2].x*baryCoords.z,
									 com[0][0].y*baryCoords.x + com[0][1].y*baryCoords.y + com[0][2].y*baryCoords.z,
									 com[0][0].z*baryCoords.x + com[0][1].z*baryCoords.y + com[0][2].z*baryCoords.z);
				
				Vec3d cB = new Vec3d(com[1][0].x*baryCoords.x + com[1][1].x*baryCoords.y + com[1][2].x*baryCoords.z,
									 com[1][0].y*baryCoords.x + com[1][1].y*baryCoords.y + com[1][2].y*baryCoords.z,
									 com[1][0].z*baryCoords.x + com[1][1].z*baryCoords.y + com[1][2].z*baryCoords.z);
	
				result.contactPointA = cA;
				result.contactPointB = cB;
				
				
				return;
				
				
			}
			
			
			
			
			// If it is sadly not that one, we have to use the face normal (it always
			// faces away so it will be closer), and then all we have to do is remove that face 
			// now we have to remove faces that can be "seen" by the new support point
			// and then we have to add new faces to cover this up
			
			Iterator<MKV[]> faceItr = faces.iterator();
			while(faceItr.hasNext()) {
				MKV[] face = faceItr.next();
				Vec3d normal = face[3].v;
				if(normal.dotProduct(support.v.subtract(face[0].v)) > 0) {
					faceItr.remove();
					
					// now we have to make edges
					MKV[] edgeOne = new MKV[] { face[1], face[0] };
					MKV[] edgeTwo = new MKV[] { face[2], face[1] };
					MKV[] edgeThree = new MKV[] { face[0], face[2] };
					
					if(isEdgeUnique(edges, edgeOne)) {
						edges.add(reverseEdge(edgeOne));
					}
					
					if(isEdgeUnique(edges, edgeTwo)) {
						edges.add(reverseEdge(edgeTwo));
					}
					
					if(isEdgeUnique(edges, edgeThree)) {
						edges.add(reverseEdge(edgeThree));
					}
 					
					
				}
			}
			
			
			for(MKV[] edge : edges) {
				
				faces.add(generateFace(edge[0], edge[1], support));
			}
			
			edges.clear();
			
			
			
			
			
		}
		System.out.println("Failed");
		result.status = GJKResult.Status.FAILED;
		
		return;
	}
	
	
	
	public static Vec3d calculateBarycentric(MKV[] face, Vec3d point) {
		/*
		 *        /\
		 *       /  \
		 *      /    \  triangle moment
		 *     /      \
		 *    ----------
		 *    
		 *    Barycentric coordinates essentially are coordinates on a triangle
		 * 
		 */
		
		
		// (p) -> (a, b, c) => (u, v, w)
		// point   triangle     barry :)
		float u = (float) face[1].v.subtract(point).crossProduct(face[2].v.subtract(point)).length();
		float v = (float) face[0].v.subtract(point).crossProduct(face[2].v.subtract(point)).length();
		float w = (float) face[0].v.subtract(point).crossProduct(face[1].v.subtract(point)).length();
		float uvw = u+v+w;
		return new Vec3d(u, v, w).scale(1/uvw);
		
		
		
	}
	
	public static Vec3d planeProjectOrigin(MKV[] face){
		Vec3d point = face[0].v.scale(-1);
		double dot = face[3].v.dotProduct(point);
		return face[3].v.scale(dot).scale(-1);
	}
	
	public static MKV[] reverseEdge(MKV[] edge) {
		return new MKV[] {edge[1], edge[0]};
	}
	
	public static MKV[] makeEdge(MKV one, MKV two) {
		return new MKV[] {one, two};
	}
	
	public static boolean isEdgeUnique(ArrayList<MKV[]> edgeList, MKV[] edge) {
		Iterator<MKV[]> edgeItr = edgeList.iterator();
		while(edgeItr.hasNext()) {
			MKV[] toCompare = edgeItr.next();
			if(edge[0] == toCompare[0] && edge[1] == toCompare[1]) {
					edgeItr.remove();
					return false;
			}
		}
		return true;
	}
	
	public static MKV[] generateFace(MKV a, MKV b, MKV c) {
		MKV[] face = new MKV[4];
		
		Vec3d ab = b.v.subtract(a.v);
		Vec3d ac = c.v.subtract(a.v);
		Vec3d ao = a.v.scale(-1);
		
		Vec3d normalVec = ab.crossProduct(ac).normalize();
		
		// check side
		if(normalVec.dotProduct(ao) < 0) {
			face = new MKV[] {a, b, c, new MKV(normalVec, null)};
		} else {
			face = new MKV[] {a, c, b, new MKV(normalVec.scale(-1), null)};
		}
		
		return face;
	}
	
	public static float distanceToPlane(MKV[] face, Vec3d point) {
		double dot = face[3].v.dotProduct(point.subtract(face[0].v));
		Vec3d proj = face[3].v.scale(dot);
		return (float) proj.lengthSquared();
	}
	
	public static float originToPlane(MKV[] face) {
		double dot = face[0].v.dotProduct(face[3].v);
		Vec3d proj = face[3].v.scale(dot);
		return (float) proj.lengthSquared();
	}
	
	/**
	 * Originally I did not believe I actually needed this,
	 * however I realized it's a really good idea.
	 */
	public static class MKV {
		Vec3d v;
		Vec3d u;
		
		public MKV(Vec3d pos, Vec3d dir) {
			this.v = pos;
			this.u = dir;
		}
		
	}

}
