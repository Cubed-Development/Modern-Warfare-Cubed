package com.paneedah.weaponlib.animation;

import com.paneedah.weaponlib.DefaultPart;
import com.paneedah.weaponlib.RenderContext;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.compatibility.Interceptors;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Quaternion;
import org.lwjgl.util.vector.Vector3f;

import java.nio.FloatBuffer;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.utils.ModReference.LOG;


public class MultipartRenderStateManager<State, Part, Context extends PartPositionProvider> {

	Randomizer randomizer;
	
	private Supplier<Long> currentTimeProvider; // = System::currentTimeMillis;

	private Function<Context, Float> currentProgressProvider;

	WeakHashMap<Part, Matrix4f> lastApplied = new WeakHashMap<>(); // TODO: replace with cache?

	private class TransitionedPositioning implements MultipartPositioning<Part, Context> {

		private class PartData {
			List<Matrix4f> matrices = new ArrayList<>();
			Part attachedTo;
		}
		private Map<Part, PartData> partDataMap = new HashMap<>();

		private Long startTime;
		private long totalDuration;

		
		private int previousIndex = -1;
		
		private int currentIndex;
		private long currentStartTime;
		private boolean expired;

		private int segmentCount;

		private List<MultipartTransition<Part, Context>> fromPositioning;
		private List<MultipartTransition<Part, Context>> toPositioning;

		private State fromState;
		private State toState;
		private boolean fromAnchored;

		TransitionedPositioning(State fromState, State toState, boolean fromAnchored) {
			this.fromState = fromState;
			this.toState = toState;
			this.fromAnchored = fromAnchored;
			fromPositioning = transitionProvider.getTransitions(fromState);
			toPositioning = transitionProvider.getTransitions(toState);
			segmentCount = toPositioning.size();

			
			
			for(MultipartTransition<Part, Context> t : toPositioning) {
				totalDuration += t.getDuration() + t.getPause();
			}
		}

		@Override
		public float getProgress() {
			return startTime != null ? (float)(currentTimeProvider.get() - startTime) / totalDuration : 0f;
		}

		@Override
		public boolean isExpired(Queue<MultipartPositioning<Part, Context>> positioningQueue) {
			return expired;
		}

		@Override
		public <T> T getFromState(Class<T> stateClass) {
			return stateClass.cast(fromState);
		}

		@Override
		public <T> T getToState(Class<T> stateClass) {
			return stateClass.cast(toState);
		}

		private Matrix4f adjustToAttached(Matrix4f matrix, Part fromAttached, Part toAttached, Context context) {

            if(fromAttached == toAttached) {
                return matrix;
            }

            Matrix4f fromMatrix = context.getPartPosition(fromAttached);
            if(fromMatrix == null) {
                return matrix;
            }

            Matrix4f toMatrix = context.getPartPosition(toAttached);
            if(toMatrix == null) {
                return matrix;
            }

            Matrix4f invertedToMatrix = Matrix4f.invert(toMatrix, null);
            if(invertedToMatrix == null) {
                return matrix;
            }

            Matrix4f correctionMatrix = Matrix4f.mul(invertedToMatrix, fromMatrix, null);
            return Matrix4f.mul(correctionMatrix, matrix, null);
        }

		private PartData getPartData(Part part, Context context) {
			try {
				return partDataMap.computeIfAbsent(part, p -> {
					PartData pd = new PartData();
					Matrix4f fromMatrix = null;
					if(fromAnchored) {
					    fromMatrix = lastApplied.get(p);
					}
					
					if(fromMatrix == null && fromPositioning != null) {
					    MultipartTransition<Part, Context> fromMultipart = fromPositioning.get(fromPositioning.size() - 1);

					    
					    
	                    if(fromMultipart.getPositioning(part) == (Object)MultipartTransition.anchoredPosition()) {
	                        fromMatrix = lastApplied.get(p);
	                        if(fromMatrix == null) {
	                            fromMatrix = new Matrix4f();
	                            fromMatrix.setIdentity();
	                        }
	                    } else {
	                        LOG.trace("Getting part data for {}", part);
	                        fromMatrix = getMatrixForPositioning(fromMultipart, p, context);
	                    }

	                    fromMatrix = adjustToAttached(fromMatrix, fromMultipart.getAttachedTo(p),
	                            toPositioning.get(0).getAttachedTo(p), context);
					} 
					
					if(fromMatrix == null){
					    fromMatrix = new Matrix4f();
					    fromMatrix.setIdentity();
					}
					
                    pd.matrices.add(fromMatrix);
                    pd.attachedTo = toPositioning.get(0).getAttachedTo(p);

                    Matrix4f previous = fromMatrix;
                    for(MultipartTransition<Part, Context> t: toPositioning) {
					    Matrix4f current;
					    if(t.getPositioning(part) == (Object)MultipartTransition.anchoredPosition()) {
					        current = previous;
					    } else {
					        current = getMatrixForPositioning(t, p, context);
					    }

					    pd.matrices.add(current);
					    previous = current;
					}

					return pd;
				});
			} catch(Exception e) {
				System.err.println("Failed to get data for part " + part + " for transition from [" + fromState + "] to [" + toState + "]");
				throw e;
			}
		}

		@Override
		public Positioner<Part, Context> getPositioner() {

			long currentTime = currentTimeProvider.get();
			MultipartTransition<Part, Context> targetState = toPositioning.get(currentIndex);
			
			
			
			if(previousIndex != currentIndex) {
				if(targetState.sound != null) {
					//System.out.println(targetState.sound.getResourceLocation());
					
					PositionedSoundRecord psr = new PositionedSoundRecord(targetState.sound, SoundCategory.PLAYERS, 1.0F, 1.0F, mc.player.getPosition().up(5));
		        	mc.getSoundHandler().playSound(psr);
				}
			}
			
			previousIndex = currentIndex;
		
			
			long currentDuration = targetState.getDuration();
			long currentPause = targetState.getPause();

		
			if(currentIndex == 0 && startTime == null) {
				LOG.debug("Starting transition {}, duration {}ms, pause {}ms", currentIndex, currentDuration, currentPause);
				startTime = currentTime;
				
				
			}
			
			
			if(currentTime-currentStartTime < 10) {
				
			}

			if(currentStartTime == 0) {
				
				currentStartTime = currentTime;
			} else if(currentTime > currentStartTime + currentDuration + currentPause) {
				LOG.debug("Completed transition {}, duration {}ms, pause {}ms", currentIndex, currentDuration, currentPause);
				currentIndex++;
				if(LOG.isDebugEnabled() && currentIndex < toPositioning.size()) {
					MultipartTransition<Part, Context> multipartTransition = toPositioning.get(currentIndex);
					LOG.debug("Starting transition {}, duration {}ms, pause {}ms", currentIndex,
							multipartTransition.getDuration(), multipartTransition.getPause());
				}
				currentStartTime = currentTime;
				
				
				
			
				
				
				
			}

			long currentOffset = currentTime - currentStartTime;

			float currentProgress = (float)currentOffset / currentDuration;

			
			
			
			if(currentProgress > 1f) {
				currentProgress = 1f;
				
			}
			
			
			

			float finalCurrentProgress = currentProgress;

			Interpolation interpolation = targetState.getInterpolationType();
			
			
			if(currentIndex >= segmentCount) {
				expired = true;
				return new Positioner<Part, Context>() {

					
					@Override
					public void position(Part part, Context context) {
						PartData partData = getPartData(part, context);
						
						boolean revertFlag = (toState == RenderableState.NORMAL && fromState == RenderableState.ZOOMING);
						
						
						
						
						if(mc.gameSettings.thirdPersonView == 0 && part.toString().contains("MAIN_ITEM")
								&& ((toState == RenderableState.ZOOMING && fromState == RenderableState.NORMAL) ||
										(toState == RenderableState.NORMAL && fromState == RenderableState.ZOOMING))) {
							
							Vec3d beizer = Vec3d.ZERO;
							if(targetState != null && targetState.beizer != null) {
								beizer = revertFlag ? targetState.beizer.scale(1.25) : targetState.beizer;
							}
							
							
							applyOnceNewBeizer(part, context,
									partData.matrices.get(currentIndex - 1),
							        partData.matrices.get(currentIndex),
							        partData.attachedTo,
							        1f, beizer, revertFlag, interpolation);
						} else {
							
							
							applyOnce2(part, context,
							        partData.matrices.get(currentIndex - 1),
							        partData.matrices.get(currentIndex),
							        partData.attachedTo,
							        1f, interpolation);
							
						}
						
						
					}

					@Override
					public void randomize(float rate, float amplitude) {
						randomizer.update(0f, 0f);
					}
				};
			}

			
			return new Positioner<Part, Context> () {
				@Override
				public void position(Part part, Context context) {
					PartData partData = getPartData(part, context);
					
				
					/*
					 * try {
						if(targetState.sound != null) {
							mc.getSoundHandler().laySound(PositionedSoundRecord.getMasterRecord(targetState.sound, 1.0f));
							
						}
					} catch(Exception e) {
						e.printStackTrace();
					}
					 */
				
					//System.out.println(partData.matrices.get(currentIndex));
					
					if(part == DefaultPart.MAIN_ITEM) {
						Interceptors.nc.addToMatrixStack(partData.matrices.get(currentIndex+1));
						
					}
					
					
					boolean revertFlag = (toState == RenderableState.NORMAL && fromState == RenderableState.ZOOMING);
					
					boolean cancelBeizer = (context instanceof RenderContext<?>) && ((RenderContext<?>) context).getCancelBeizer();
					
					if(!cancelBeizer && mc.gameSettings.thirdPersonView == 0 && part.toString().contains("MAIN_ITEM")
							&& ((toState == RenderableState.ZOOMING && fromState == RenderableState.NORMAL) ||
									(toState == RenderableState.NORMAL && fromState == RenderableState.ZOOMING))) {
						
						Vec3d beizer = Vec3d.ZERO;
						if(targetState != null && targetState.beizer != null) {
							beizer = revertFlag ? targetState.beizer.scale(1.25) : targetState.beizer;
						}
						
						
						applyOnceNewBeizer(part, context,
							    partData.matrices.get(currentIndex),
								partData.matrices.get(currentIndex + 1),
								partData.attachedTo,
								finalCurrentProgress, beizer, revertFlag, interpolation);
							
					} else {
						
					
						
						applyOnce2(part, context,
							    partData.matrices.get(currentIndex),
								partData.matrices.get(currentIndex + 1),
								partData.attachedTo,
								finalCurrentProgress, interpolation);
						
						
					}
					
				}

				@Override
				public void randomize(float rate, float amplitude) {
					randomizer.update(0f, 0f);
				}
			};
		}

		private void applyOnce(Part part, Context context, Matrix4f beforeMatrix, Matrix4f afterMatrix,
		        Part attachedTo, float progress, Interpolation interp) {

		    LOG.trace("Applying position for part {}", part);


		   
		    
			/*
			 *
			 * progress = (endTime - startTime) / duration
			 *
			 * current = start + (end - start) * progress = start * (1 - progress)  + end * progress;
			 */

		    Matrix4f currentMatrix = null;

		    if(attachedTo != null) {
		        currentMatrix = context.getPartPosition(attachedTo);
		        
		    }

		    /*
		     * Otherwise capture current position
		     */
		    if(currentMatrix == null) {
		    	//currentMatrix = new Matrix4f();
				currentMatrix = MatrixHelper.captureMatrix();
			}

		 
		    
			Matrix4f m1 = MatrixHelper.interpolateMatrix(beforeMatrix, 1 - progress, interp); //start * (1 - progress)
			Matrix4f m2 = MatrixHelper.interpolateMatrix(afterMatrix, progress, interp);
			
			

			Matrix4f deltaMatrix = Matrix4f.add(m1, m2, null);
			
			lastApplied.put(part, deltaMatrix);

			Matrix4f composite = Matrix4f.mul(currentMatrix, deltaMatrix, null);

			MatrixHelper.loadMatrix(composite);
		}
		
		private void applyOnceCom(Part part, Context context, Matrix4f beforeMatrix, Matrix4f afterMatrix,
		        Part attachedTo, float progress, Vec3d beizer, boolean accel, Interpolation interp) {

		    LOG.trace("Applying position for part {}", part);

		    //progress = 0.0f;
		    
		 
		   // progress = (float) interp.ACCELERATION.interpolate(progress);
			/*
			 *
			 * progress = (endTime - startTime) / duration
			 *
			 * current = start + (end - start) * progress = start * (1 - progress)  + end * progress;
			 */

		    Matrix4f currentMatrix = null;

		    if(attachedTo != null) {
		        currentMatrix = context.getPartPosition(attachedTo);
		    }

		    /*
		     * Otherwise capture current position
		     */
		    if(currentMatrix == null) {
				currentMatrix = MatrixHelper.captureMatrix();
			}
		    
		    
		    
		    
		    
		    FloatBuffer auxGLMatrix = GLAllocation.createDirectFloatBuffer(16);
		    auxGLMatrix.rewind();
		    
		    Vec3d beezer = new Vec3d(0, 3.5, -1);
		    
		    float fastProgress = 0f;
		    if(!accel) {
		    	fastProgress =  1 - ((1-progress)*(1-progress));
		    } else {
		    	fastProgress =  1 - ((1-progress)*(1-progress));
		    	//fastProgress =  progress*progress*(3-(2*progress));
		    }
		    
		    float newX = MatrixHelper.solveBeizer(beforeMatrix.m30, (float) beizer.x, afterMatrix.m30, fastProgress);
		    float newY = MatrixHelper.solveBeizer(beforeMatrix.m31, (float) beizer.y, afterMatrix.m31, fastProgress);
		    float newZ = MatrixHelper.solveBeizer(beforeMatrix.m32, (float) beizer.z, afterMatrix.m32, fastProgress);
		  //  Vec3d trans = MatrixHelper.lerpVectors(new Vec3d(beforeMatrix.m30, beforeMatrix.m31, beforeMatrix.m32),
		   // 									   new Vec3d(afterMatrix.m30, afterMatrix.m31, afterMatrix.m32),
		   // 		progress);
		    
		    Vec3d trans = new Vec3d(newX, newY, newZ);
		   
		    Vec3d scaleBefore = MatrixHelper.extractScale(beforeMatrix);
		    Vec3d scaleAfter = MatrixHelper.extractScale(afterMatrix);
		    
		  
		  
		    
		   Quaternion q = new Quaternion();
		   Quaternion.setFromMatrix(beforeMatrix, q);
		   
		   Quaternion q2 = new Quaternion();
		   Quaternion.setFromMatrix(afterMatrix, q2);
		   
		   MatrixHelper.restoreScale(beforeMatrix, scaleBefore);
		   MatrixHelper.restoreScale(afterMatrix, scaleAfter);
		 
		   
		   GlStateManager.quatToGlMatrix(auxGLMatrix, MatrixHelper.slerp(q, q2, progress));
		   
		   
		   
		   MatrixHelper.scaleFloatBuffer(auxGLMatrix, MatrixHelper.lerpVectors(scaleBefore, scaleAfter, progress));
		   
		   auxGLMatrix.put(12, (float) trans.x);
			auxGLMatrix.put(13, (float) trans.y);
			auxGLMatrix.put(14, (float) trans.z);
		   
		   
		   
		   //System.out.println("Jim's Method: " + deltaMatrix);
		   
		   

		//	deltaMatrix = Matrix4f.add(m1, m2, null);
			//System.out.println("Vic's Method: " + deltaMatrix);
			
			
			
		    
		    
		    Matrix4f deltaMatrix = new Matrix4f();
			  
			   deltaMatrix.load(auxGLMatrix);
			   deltaMatrix = deltaMatrix.rotate((float) Math.toRadians(90), new Vector3f(0, 1, 0));
		  
			   Matrix4f m1 = MatrixHelper.interpolateMatrix(beforeMatrix, 1 - progress, interp); //start * (1 - progress)
				Matrix4f m2 = MatrixHelper.interpolateMatrix(afterMatrix, progress, interp);
			   
				deltaMatrix = Matrix4f.add(m1, m2, null);
		   
				
				
			   deltaMatrix.m30 = (float) trans.x;
			   deltaMatrix.m31 = (float) trans.y;
			   deltaMatrix.m32 = (float) trans.z;
			
			   
			   //deltaMatrix.m30 = 0.0f;
		    /*
			Matrix4f m1 = MatrixHelper.interpolateMatrix(beforeMatrix, 1 - progress); //start * (1 - progress)
			Matrix4f m2 = MatrixHelper.interpolateMatrix(afterMatrix, progress);

			Matrix4f deltaMatrix = Matrix4f.add(m1, m2, null);
			*/
		   
		  
			//Matrix4f deltaMatrix = MatrixHelper.beizerInterpolation(beforeMatrix, 
			//		MatrixHelper.buildTranslation(0.5f, 0.5f, 0), afterMatrix, progress, true);
			
			
			//Matrix4f deltaMatrix = Matrix4f.add(m1, m2, null);

			lastApplied.put(part, deltaMatrix);

			Matrix4f composite = Matrix4f.mul(currentMatrix, deltaMatrix, null);

		///	Matrix4f comp2 = MatrixHelper.beizerInterpolation(beforeMatrix, new Matrix4f(), afterMatrix, progress);
			
			
			
			
			
			
			
			
			
			MatrixHelper.loadMatrix(composite);
		}
		
		private void applyOnceNewBeizer(Part part, Context context, Matrix4f beforeMatrix, Matrix4f afterMatrix,
		        Part attachedTo, float progress, Vec3d beizer, boolean accel, Interpolation interp) {

			
		    LOG.trace("Applying position for part {}", part);
		    
		    
		    progress = (float) interp.interpolate(progress);

		   
		    Matrix4f currentMatrix = null;

		    if(attachedTo != null) {
		        currentMatrix = context.getPartPosition(attachedTo);
		    }

		  
		    /*
		     * Otherwise capture current position
		     */
		    if(currentMatrix == null) {
				currentMatrix = MatrixHelper.captureMatrix();
			}
		    
		    // Copy matrices
		    Matrix4f copiedBefore = new Matrix4f(beforeMatrix);
		    Matrix4f copiedAfter = new Matrix4f(afterMatrix);
		    

		    FloatBuffer AUXGLBRUHFER = BufferUtils.createFloatBuffer(16);
			
		    
		    // Extract translations and interpolate 
		    
		    float newX = MatrixHelper.solveBeizer(copiedBefore.m30, (float) beizer.x, copiedAfter.m30, progress);
		    float newY = MatrixHelper.solveBeizer(copiedBefore.m31, (float) beizer.y, copiedAfter.m31, progress);
		    float newZ = MatrixHelper.solveBeizer(copiedBefore.m32, (float) beizer.z, copiedAfter.m32, progress);
		    Vec3d iT = new Vec3d(newX, newY, newZ);
		    
		    
		    // Create the quaternions
			  Quaternion q4 = new Quaternion();
			  Quaternion q5 = new Quaternion();
			   Matrix4f matty = new Matrix4f();

			   
			   // extract scales
			   
			   Vec3d scaleBefore = MatrixHelper.extractScale(copiedBefore);
			    Vec3d scaleAfter = MatrixHelper.extractScale(copiedAfter);
			   Vec3d iS = MatrixHelper.lerpVectors(scaleBefore, scaleAfter, progress);

			   // Deal with the before matrix
			   Quaternion.setFromMatrix(copiedBefore, q4);
			   
			   // Deal with after matrix
			   Quaternion.setFromMatrix(copiedAfter, q5);
			   
			   
			   // "Slerp" between the two quaternions
			   Quaternion q6 = MatrixHelper.slerp(q4, q5, progress);
			   GlStateManager.quatToGlMatrix(AUXGLBRUHFER, q6);
			   
			   //GlStateManager.quatToGlMatrix(AUXGLBRUHFER, q5);
			   
			   
			   
			   
			   // Put in matrix and do magic
			   AUXGLBRUHFER.rewind();
			   matty.load(AUXGLBRUHFER);
			   AUXGLBRUHFER.rewind();
			   matty.scale(new Vector3f((float) iS.x, (float)iS.y, (float) iS.z));
			   
			   matty.transpose();
			   
	

		    
		    // Add in the translation
		    matty.m30 = (float) iT.x;
		    matty.m31 = (float) iT.y;
		    matty.m32 = (float) iT.z;

			lastApplied.put(part, matty);
			Matrix4f composite = Matrix4f.mul(currentMatrix, matty, null);
			MatrixHelper.loadMatrix(composite);
		}
		
		private void applyOnce2(Part part, Context context, Matrix4f beforeMatrix, Matrix4f afterMatrix,
		        Part attachedTo, float progress, Interpolation interp) {

		    LOG.trace("Applying position for part {}", part);
		    
		    
		   // progress = (float) Interpolation.SMOOTHSTEP.interpolate(progress);
		    
		   // progress = 0f;
		   // progress = (float) interp.interpolate(progress);

		  // boolean log = part == DefaultPart.RIGHT_HAND;
		   
		 //  if(log) System.out.println("Before: " + beforeMatrix);
		    
		    
		    Matrix4f currentMatrix = null;

		    if(attachedTo != null) {
		        currentMatrix = context.getPartPosition(attachedTo);
		    }

		  
		    /*
		     * Otherwise capture current position
		     */
		    if(currentMatrix == null) {
				currentMatrix = MatrixHelper.captureMatrix();
			}
		    
		    // Copy matrices
		    Matrix4f copiedBefore = new Matrix4f(beforeMatrix);
		    Matrix4f copiedAfter = new Matrix4f(afterMatrix);
		    

		    FloatBuffer AUXGLBRUHFER = BufferUtils.createFloatBuffer(16);
			
		    
		    // Extract translations and interpolate
		    Vec3d beforeTranslation = new Vec3d(copiedBefore.m30, copiedBefore.m31, copiedBefore.m32);
			Vec3d afterTranslation = new Vec3d(copiedAfter.m30, copiedAfter.m31, copiedAfter.m32);   
		    Vec3d iT = MatrixHelper.lerpVectors(beforeTranslation, afterTranslation, progress);
		    
		    // Create the quaternions
			  Quaternion q4 = new Quaternion();
			  Quaternion q5 = new Quaternion();
			   Matrix4f matty = new Matrix4f();

			   
			   // extract scales
			   
			   Vec3d scaleBefore = null;
				if(AnimationModeProcessor.getInstance().isLegacyMode()) {
					scaleBefore =  MatrixHelper.extractScaleOld(copiedBefore);
				} else {
					scaleBefore =  MatrixHelper.extractScale(copiedBefore);
				}
					   
					   
					  
			    Vec3d scaleAfter = null;
			    if(AnimationModeProcessor.getInstance().isLegacyMode()) {
			    	scaleAfter =  MatrixHelper.extractScaleOld(copiedAfter);
				} else {
					scaleAfter =  MatrixHelper.extractScale(copiedAfter);
				}
					 
			    
			    
			   Vec3d iS = MatrixHelper.lerpVectors(scaleBefore, scaleAfter, progress);

			   
			   
			   
			   // Deal with the before matrix
			   Quaternion.setFromMatrix(copiedBefore, q4);
			   
			   // Deal with after matrix
			   Quaternion.setFromMatrix(copiedAfter, q5);
			   
			   
			   // "Slerp" between the two quaternions
			   Quaternion q6 = MatrixHelper.slerp(q4, q5, progress);
			   GlStateManager.quatToGlMatrix(AUXGLBRUHFER, q6);
			   
			   //GlStateManager.quatToGlMatrix(AUXGLBRUHFER, q5);
			   
			   
			   
			   
			   // Put in matrix and do magic
			   AUXGLBRUHFER.rewind();
			   matty.load(AUXGLBRUHFER);
			   AUXGLBRUHFER.rewind();

			   
			   if(AnimationModeProcessor.getInstance().isLegacyMode()) {
				   matty.scale(new Vector3f((float) iS.x, (float)iS.y, (float) iS.z));
				   
					
					// somewhat for legacy scale first?
					   matty.transpose();
			   } else {
				   

				   matty.transpose();
				   matty.scale(new Vector3f((float) iS.x, (float)iS.y, (float) iS.z));
				  
					
					
			   }
			   
			
			
			   
			
			   
			
			
			  
			
			   
				// Add in the translation
			    matty.m30 = (float) iT.x;
			    matty.m31 = (float) iT.y;
			    matty.m32 = (float) iT.z;
			   
			   
		    

		    //if(log) System.out.println("After: " + matty);
		    
			lastApplied.put(part, matty);
			Matrix4f composite = Matrix4f.mul(currentMatrix, matty, null);
			MatrixHelper.loadMatrix(composite);
		}

		private Matrix4f getMatrixForPositioning(MultipartTransition<Part, Context> transition, Part part, Context context) {
			GL11.glPushMatrix();
			GL11.glMatrixMode(GL11.GL_MODELVIEW);
			GL11.glLoadIdentity();
			FloatBuffer buf = BufferUtils.createFloatBuffer(16);
			transition.position(part, context);
			GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, buf);
			buf.rewind();
			Matrix4f matrix = new Matrix4f();
			matrix.load(buf);
			GL11.glPopMatrix();
			return matrix;
		}
	}

	private static class StateContainer<State> {
	    State state;
	    boolean isEndOfLoop;
	    
        StateContainer(State state, boolean isEndOfLoop) {
            this.state = state;
            this.isEndOfLoop = isEndOfLoop;
        }
        
        StateContainer(State state) {
            this(state, false);
        } 
	}
	
	private String name;
	
	private StateContainer<State> currentStateContainer;

	MultipartTransitionProvider<State, Part, Context> transitionProvider;

	private Deque<MultipartPositioning<Part, Context>> positioningQueue;
	
	public MultipartRenderStateManager(State initialState, MultipartTransitionProvider<State, Part, Context> transitionProvider) {
        this(initialState, transitionProvider, System::currentTimeMillis);
    }

	public MultipartRenderStateManager(State initialState, MultipartTransitionProvider<State, Part, Context> transitionProvider,
	        Supplier<Long> currentTimeProvider) {
//		this.transitionProvider = transitionProvider;
//		this.positioningQueue = new LinkedList<>();
//		this.randomizer = new Randomizer();
//		this.currentTimeProvider = currentTimeProvider;
//		setState(initialState, false, true);
	    this("anonymous", initialState, transitionProvider, currentTimeProvider, null);
	}
	
	public MultipartRenderStateManager(String name, State initialState, MultipartTransitionProvider<State, Part, Context> transitionProvider,
	        Supplier<Long> currentTimeProvider, Function<Context, Float> currentProgressProvider) {
	    this.name = name;
	    this.transitionProvider = transitionProvider;
	    this.positioningQueue = new LinkedList<>();
	    this.randomizer = new Randomizer();
	    this.currentTimeProvider = currentTimeProvider;
	    this.currentProgressProvider = currentProgressProvider;
	    setState(initialState, false, true);
	}

	public void setCycleState(State cycleState, /*, State endState, */ boolean immediate) {
	    
		
		if(cycleState == null) {
            throw new IllegalArgumentException("State cannot be null");
        }

        if(immediate) {
            positioningQueue.clear();
        }

        StateContainer<State> addedState;
        if(positioningQueue.size() <= 1) {
            /*
             * If the currentState is a start state, add the virtual end-of-loop state.
             * No transitions required
             */
            if(cycleState.equals(currentStateContainer.state) && !currentStateContainer.isEndOfLoop) {
                addedState = new StateContainer<>(cycleState, true);
            } else { 
                /*
                 * if the currentState is anything other than start (e.g. null or any non-cycle state), 
                 * then starting the cycle
                 */
                addedState = new StateContainer<>(cycleState, false);
                
                positioningQueue.add(new TransitionedPositioning(currentStateContainer.state, addedState.state, false));
                positioningQueue.add(new StaticPositioning<State, Part, Context>(transitionProvider, randomizer, addedState.state, lastApplied));
            }

            currentStateContainer = addedState; //new StateContainer<>(addedState.state);
        }
	}
	
	public void setState(State newState, boolean animated, boolean immediate) {
		setState(newState, animated, immediate, false);
	}
	
	public void setState(State newState, boolean animated, boolean immediate, boolean fromAnchored) {
        if(newState == null) {
            throw new IllegalArgumentException("State cannot be null");
        }

        if(currentStateContainer != null && newState.equals(currentStateContainer.state)) {
            return;
        }

        if(immediate) {
            positioningQueue.clear();
        }

        if(animated) {
            positioningQueue.add(new TransitionedPositioning(currentStateContainer != null ?
                    currentStateContainer.state : null, newState, fromAnchored));
        }

        positioningQueue.add(new StaticPositioning<State, Part, Context>(transitionProvider, randomizer, newState, lastApplied));
        currentStateContainer = new StateContainer<>(newState);
    }
	
	public void setContinousState(State newState, boolean animated, boolean immediate, boolean fromAnchored) {
	    if(newState == null) {
	        throw new IllegalArgumentException("State cannot be null");
	    }

	    if(currentStateContainer != null && newState.equals(currentStateContainer.state)) {
	        return;
	    }

	    if(immediate) {
	        positioningQueue.clear();
	    }

	    if(animated) {
	        positioningQueue.add(new ContinousPositioning2<State, Part, Context>(transitionProvider, 
	                currentProgressProvider, randomizer, currentStateContainer != null ?
	                        currentStateContainer.state : null, newState, fromAnchored, lastApplied));
	    }

	    positioningQueue.add(new StaticPositioning<State, Part, Context>(transitionProvider, randomizer, newState, lastApplied));
	    currentStateContainer = new StateContainer<>(newState);
	}
	   
	public State getLastState() {
	    return currentStateContainer != null ? currentStateContainer.state : null; 
	}
	
	public MultipartPositioning<Part, Context> nextPositioning() {
		MultipartPositioning<Part, Context> result = null;
		while(!positioningQueue.isEmpty()) {
			MultipartPositioning<Part, Context> p = positioningQueue.poll();
			if(!p.isExpired(positioningQueue)) { // TODO: this is rather a hack
		        //log.trace("Fetched next positioning from {} to {}", p.getFromState(Object.class), p.getToState(Object.class));
				positioningQueue.addFirst(p); // add it back to the head of the queue
				result = p;
				break;
			} else {
			    //log.trace("Fetched next expired positioning from {} to {}", p.getFromState(Object.class), p.getToState(Object.class));
			}
		}
		if(result == null) {
			throw new IllegalStateException("Position cannot be null");
		}
		return result;
	}
}
