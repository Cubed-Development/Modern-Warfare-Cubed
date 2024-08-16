package com.paneedah.weaponlib.vehicle;

import com.paneedah.weaponlib.animation.MultipartRenderStateManager;
import com.paneedah.weaponlib.vehicle.HierarchicalPartRenderer.SinglePart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class VehicleRendererBuilder extends HierarchicalRendererBuilder<VehiclePart, VehicleRenderableState> {

	private boolean doShiftAnimation = false;
	private boolean shiftRight = false;
	
	
	private static List<VehiclePart> allParts = Arrays.asList(VehiclePart.MAIN, VehiclePart.WINDOWS,
			VehiclePart.STEERING_WHEEL, VehiclePart.LEFT_HAND, VehiclePart.RIGHT_HAND,
			VehiclePart.FRONT_LEFT_CONTROL_ARM, VehiclePart.FRONT_RIGHT_CONTROL_ARM, VehiclePart.FRONT_LEFT_WHEEL,
			VehiclePart.FRONT_RIGHT_WHEEL, VehiclePart.REAR_LEFT_WHEEL, VehiclePart.REAR_RIGHT_WHEEL);

	private static BiConsumer<MultipartRenderStateManager<VehicleRenderableState, SinglePart, PartRenderContext<VehicleRenderableState>>, PartRenderContext<VehicleRenderableState>> DEFAULT_CONTINOUS_STATE_SETTER = (
			stateManager, renderContext) -> {
		stateManager.setContinousState(renderContext.getState(), true, false, false);
	};
/*
	private static Function<PartRenderContext<VehicleRenderableState>, Float> DEFAULT_TURN_PROGRESS_PROVIDER = context -> 0.5f
			+ (float) ((EntityVehicle) context.getEntity()).getLastYawDelta() / 20f;
*/
	
	private static Function<PartRenderContext<VehicleRenderableState>, Float> DEFAULT_TURN_PROGRESS_PROVIDER = context -> ((EntityVehicle) context.getEntity()).getInterpolatedYawDelta();

	
	private static Function<PartRenderContext<VehicleRenderableState>, Float> DEFAULT_WHEEL_TURN_PROGRESS_PROVIDER = context -> (float) ((EntityVehicle) context.getEntity()).getInterpolatedWheelRotation();
	
	/*
	private static Function<PartRenderContext<VehicleRenderableState>, Float> DEFAULT_WHEEL_TURN_PROGRESS_PROVIDER = context -> (float) Math
			.abs(((EntityVehicle) context.getEntity()).getWheelRotationAngle()) / 360f;
	*/
	
	public VehicleRendererBuilder performShiftAnimation(boolean state) {
		this.doShiftAnimation = state;
		return this;
	}
	
	public VehicleRendererBuilder shiftWithRight(boolean state) {
		this.shiftRight = state;
		return this;
	}
	
	public VehicleRendererBuilder withMainModelProvider(Supplier<VehicleModel> mainModelProvider) {
		VehicleModel model = mainModelProvider.get();
		withPartRenderer(VehiclePart.MAIN, renderContext -> {
			model.render((EntityVehicle) renderContext.getEntity(), 0.0625f);
		});
		return this;
	}

	public VehicleRendererBuilder withWindowModelProvider(Supplier<VehicleModel> mainModelProvider) {
		VehicleModel model = mainModelProvider.get();
		withPartRenderer(VehiclePart.WINDOWS, renderContext -> {
			model.render((EntityVehicle) renderContext.getEntity(), 0.0625f);
		});
		return this;
	}

	public VehicleRendererBuilder withSteeringWheelModelProvider(Supplier<VehicleModel> steeringWheelModelProvider) {
		VehicleModel steeringWheelModel = steeringWheelModelProvider.get();
		withPartRenderer(VehiclePart.STEERING_WHEEL, renderContext -> {
			steeringWheelModel.render((EntityVehicle) renderContext.getEntity(), 0.0625f);
		});
		return this;
	}

	public VehicleRendererBuilder withWheelModelProvider(Supplier<VehicleModel> mainModelProvider) {
		VehicleModel frontLeftWheelModel = mainModelProvider.get();
		withPartRenderer(VehiclePart.FRONT_LEFT_WHEEL, renderContext -> {

			frontLeftWheelModel.render((EntityVehicle) renderContext.getEntity(), 0.0625f);

		});

		VehicleModel frontRightWheelModel = mainModelProvider.get();
		withPartRenderer(VehiclePart.FRONT_RIGHT_WHEEL, renderContext -> {
			frontRightWheelModel.render((EntityVehicle) renderContext.getEntity(), 0.0625f);
		});

		VehicleModel rearLeftWheelModel = mainModelProvider.get();
		withPartRenderer(VehiclePart.REAR_LEFT_WHEEL, renderContext -> {
			rearLeftWheelModel.render((EntityVehicle) renderContext.getEntity(), 0.0625f);
		});

		VehicleModel rearRightWheelModel = mainModelProvider.get();
		withPartRenderer(VehiclePart.REAR_RIGHT_WHEEL, renderContext -> {
			rearRightWheelModel.render((EntityVehicle) renderContext.getEntity(), 0.0625f);
		});
		return this;
	}

	public VehicleRendererBuilder withControlArmModelProvider(Supplier<VehicleModel> controlArmModelProvider) {
		VehicleModel frontLeftControlArmModel = controlArmModelProvider.get();
		withPartRenderer(VehiclePart.FRONT_LEFT_CONTROL_ARM, renderContext -> {
			frontLeftControlArmModel.render((EntityVehicle) renderContext.getEntity(), 0.0625f);
		});

		VehicleModel frontRightControlArmModel = controlArmModelProvider.get();
		withPartRenderer(VehiclePart.FRONT_RIGHT_CONTROL_ARM, renderContext -> {
			frontRightControlArmModel.render((EntityVehicle) renderContext.getEntity(), 0.0625f);
		});
		return this;
	}

	@Override
	public HierarchicalRendererBuilder<VehiclePart, VehicleRenderableState> withPartPosition(VehiclePart part,
			Consumer<PartRenderContext<VehicleRenderableState>> positionFunction, VehicleRenderableState... states) {

		//System.out.println("Loading states... " + Arrays.toString(states));

		if (states.length == 0) {

			withPartPosition(part, positionFunction, VehicleRenderableState.IDLE,
					VehicleRenderableState.PREPARED_TO_DRIVE, VehicleRenderableState.DRIVING,
					VehicleRenderableState.STARTING_SHIFT, VehicleRenderableState.SHIFTING,
					VehicleRenderableState.FINISHING_SHIFT,
//                    VehicleRenderableState.TURN_LEFT,
//                    VehicleRenderableState.TURN_RIGHT,
					VehicleRenderableState.STOPPING);
		} else {

			super.withPartPosition(part, positionFunction, states);
		}

		return this;
	}

	@Override
	protected void prebuild() {

		//System.out.println("Prebuild called");

		withInitialState(VehicleRenderableState.IDLE);

		withPartStateSetter(VehiclePart.STEERING_WHEEL, DEFAULT_CONTINOUS_STATE_SETTER);

		withPartStateSetter(VehiclePart.FRONT_LEFT_WHEEL, DEFAULT_CONTINOUS_STATE_SETTER);

		withPartStateSetter(VehiclePart.FRONT_RIGHT_WHEEL, DEFAULT_CONTINOUS_STATE_SETTER);

		withPartStateSetter(VehiclePart.REAR_LEFT_WHEEL, DEFAULT_CONTINOUS_STATE_SETTER);

		withPartStateSetter(VehiclePart.REAR_RIGHT_WHEEL, DEFAULT_CONTINOUS_STATE_SETTER);

		withPartStateSetter(VehiclePart.FRONT_LEFT_CONTROL_ARM, DEFAULT_CONTINOUS_STATE_SETTER);

		withPartStateSetter(VehiclePart.FRONT_RIGHT_CONTROL_ARM, DEFAULT_CONTINOUS_STATE_SETTER);

		withPartRenderer(VehiclePart.LEFT_HAND,
				StatefulRenderers.createLeftHandRenderer(null, c -> c.getEntity().getControllingPassenger()));
		withPartRenderer(VehiclePart.RIGHT_HAND,
				StatefulRenderers.createRightHandRenderer(null, c -> c.getEntity().getControllingPassenger()));

		for (VehiclePart part : allParts) {
			PartConfiguration partConfiguration = partConfigurations.computeIfAbsent(part,
					p -> new PartConfiguration());

			if (partConfiguration.currentProgressProvider == null) {
				if (part instanceof VehiclePart.Wheel) {
					partConfiguration.currentProgressProvider = DEFAULT_WHEEL_TURN_PROGRESS_PROVIDER;
				} else {
					partConfiguration.currentProgressProvider = DEFAULT_TURN_PROGRESS_PROVIDER;
				}
			}

			for (VehicleRenderableState state : VehicleRenderableState.values()) {
				List<TransitionDescriptor> transitionDescriptors = partConfiguration.transitionDescriptors
						.computeIfAbsent(state, k -> new ArrayList<>());

				
				if(doShiftAnimation) {
					
					if(shiftRight) {
						// right handed shifting
						if (part == VehiclePart.LEFT_HAND && state == VehicleRenderableState.PREPARED_TO_DRIVE
								&& transitionDescriptors.isEmpty()) {
							List<TransitionDescriptor> drivingTransitionDescriptors = partConfiguration.transitionDescriptors
									.get(VehicleRenderableState.DRIVING);
							transitionDescriptors.add(new TransitionDescriptor(
									drivingTransitionDescriptors.get(0).positionFunction, animationDuration));
						} else if (part == VehiclePart.LEFT_HAND && state == VehicleRenderableState.STOPPING
								&& transitionDescriptors.isEmpty()) {
							List<TransitionDescriptor> idleTransitionDescriptors = partConfiguration.transitionDescriptors
									.get(VehicleRenderableState.IDLE);
							transitionDescriptors.add(new TransitionDescriptor(
									idleTransitionDescriptors.get(0).positionFunction, animationDuration));
						} else if (part == VehiclePart.LEFT_HAND && (state == VehicleRenderableState.FINISHING_SHIFT
								|| state == VehicleRenderableState.SHIFTING || state == VehicleRenderableState.STARTING_SHIFT)
								&& transitionDescriptors.isEmpty()) {
							List<TransitionDescriptor> idleTransitionDescriptors = partConfiguration.transitionDescriptors
									.get(VehicleRenderableState.DRIVING);
							transitionDescriptors.add(new TransitionDescriptor(
									idleTransitionDescriptors.get(0).positionFunction, animationDuration));
						} else if (part == VehiclePart.RIGHT_HAND && state == VehicleRenderableState.PREPARED_TO_DRIVE
								&& transitionDescriptors.isEmpty()) {
							List<TransitionDescriptor> drivingTransitionDescriptors = partConfiguration.transitionDescriptors
									.get(VehicleRenderableState.DRIVING);
							transitionDescriptors.add(new TransitionDescriptor(
									drivingTransitionDescriptors.get(0).positionFunction, animationDuration));
						} else if (part == VehiclePart.RIGHT_HAND && state == VehicleRenderableState.STOPPING
								&& transitionDescriptors.isEmpty()) {
							List<TransitionDescriptor> idleTransitionDescriptors = partConfiguration.transitionDescriptors
									.get(VehicleRenderableState.IDLE);
							transitionDescriptors.add(new TransitionDescriptor(
									idleTransitionDescriptors.get(0).positionFunction, animationDuration));
						} else if (part == VehiclePart.RIGHT_HAND && state == VehicleRenderableState.STARTING_SHIFT
								&& transitionDescriptors.isEmpty()) {
							List<TransitionDescriptor> drivingTransitionDescriptors = partConfiguration.transitionDescriptors
									.get(VehicleRenderableState.SHIFTING);
							transitionDescriptors.add(new TransitionDescriptor(
									drivingTransitionDescriptors.get(0).positionFunction, animationDuration));
						} else if (part == VehiclePart.RIGHT_HAND && state == VehicleRenderableState.FINISHING_SHIFT
								&& transitionDescriptors.isEmpty()) {
							List<TransitionDescriptor> idleTransitionDescriptors = partConfiguration.transitionDescriptors
									.get(VehicleRenderableState.DRIVING);
							transitionDescriptors.add(new TransitionDescriptor(
									idleTransitionDescriptors.get(0).positionFunction, animationDuration));
						}
					} else {
						// Left handed shifting :)
						if (part == VehiclePart.RIGHT_HAND && state == VehicleRenderableState.PREPARED_TO_DRIVE
								&& transitionDescriptors.isEmpty()) {
							List<TransitionDescriptor> drivingTransitionDescriptors = partConfiguration.transitionDescriptors
									.get(VehicleRenderableState.DRIVING);
							transitionDescriptors.add(new TransitionDescriptor(
									drivingTransitionDescriptors.get(0).positionFunction, animationDuration));
						} else if (part == VehiclePart.RIGHT_HAND && state == VehicleRenderableState.STOPPING
								&& transitionDescriptors.isEmpty()) {
							List<TransitionDescriptor> idleTransitionDescriptors = partConfiguration.transitionDescriptors
									.get(VehicleRenderableState.IDLE);
							transitionDescriptors.add(new TransitionDescriptor(
									idleTransitionDescriptors.get(0).positionFunction, animationDuration));
						} else if (part == VehiclePart.RIGHT_HAND && (state == VehicleRenderableState.FINISHING_SHIFT
								|| state == VehicleRenderableState.SHIFTING || state == VehicleRenderableState.STARTING_SHIFT)
								&& transitionDescriptors.isEmpty()) {
							List<TransitionDescriptor> idleTransitionDescriptors = partConfiguration.transitionDescriptors
									.get(VehicleRenderableState.DRIVING);
							transitionDescriptors.add(new TransitionDescriptor(
									idleTransitionDescriptors.get(0).positionFunction, animationDuration));
						} else if (part == VehiclePart.LEFT_HAND && state == VehicleRenderableState.PREPARED_TO_DRIVE
								&& transitionDescriptors.isEmpty()) {
							List<TransitionDescriptor> drivingTransitionDescriptors = partConfiguration.transitionDescriptors
									.get(VehicleRenderableState.DRIVING);
							transitionDescriptors.add(new TransitionDescriptor(
									drivingTransitionDescriptors.get(0).positionFunction, animationDuration));
						} else if (part == VehiclePart.LEFT_HAND && state == VehicleRenderableState.STOPPING
								&& transitionDescriptors.isEmpty()) {
							List<TransitionDescriptor> idleTransitionDescriptors = partConfiguration.transitionDescriptors
									.get(VehicleRenderableState.IDLE);
							transitionDescriptors.add(new TransitionDescriptor(
									idleTransitionDescriptors.get(0).positionFunction, animationDuration));
						} else if (part == VehiclePart.LEFT_HAND && state == VehicleRenderableState.STARTING_SHIFT
								&& transitionDescriptors.isEmpty()) {
							List<TransitionDescriptor> drivingTransitionDescriptors = partConfiguration.transitionDescriptors
									.get(VehicleRenderableState.SHIFTING);
			
								transitionDescriptors.add(new TransitionDescriptor(
										drivingTransitionDescriptors.get(0).positionFunction, animationDuration));
						
							} else if (part == VehiclePart.LEFT_HAND && state == VehicleRenderableState.FINISHING_SHIFT
								&& transitionDescriptors.isEmpty()) {
							List<TransitionDescriptor> idleTransitionDescriptors = partConfiguration.transitionDescriptors
									.get(VehicleRenderableState.DRIVING);
							transitionDescriptors.add(new TransitionDescriptor(
									idleTransitionDescriptors.get(0).positionFunction, animationDuration));
						}
						
					}
					
				} else {
					// If not doing shift anims
					if (part == VehiclePart.LEFT_HAND && state == VehicleRenderableState.PREPARED_TO_DRIVE
							&& transitionDescriptors.isEmpty()) {
						List<TransitionDescriptor> drivingTransitionDescriptors = partConfiguration.transitionDescriptors
								.get(VehicleRenderableState.DRIVING);
						transitionDescriptors.add(new TransitionDescriptor(
								drivingTransitionDescriptors.get(0).positionFunction, animationDuration));
					} else if (part == VehiclePart.LEFT_HAND && state == VehicleRenderableState.STOPPING
							&& transitionDescriptors.isEmpty()) {
						List<TransitionDescriptor> idleTransitionDescriptors = partConfiguration.transitionDescriptors
								.get(VehicleRenderableState.IDLE);
						transitionDescriptors.add(new TransitionDescriptor(
								idleTransitionDescriptors.get(0).positionFunction, animationDuration));
					} else if (part == VehiclePart.LEFT_HAND && (state == VehicleRenderableState.FINISHING_SHIFT
							|| state == VehicleRenderableState.SHIFTING || state == VehicleRenderableState.STARTING_SHIFT)
							&& transitionDescriptors.isEmpty()) {
						List<TransitionDescriptor> idleTransitionDescriptors = partConfiguration.transitionDescriptors
								.get(VehicleRenderableState.DRIVING);
						transitionDescriptors.add(new TransitionDescriptor(
								idleTransitionDescriptors.get(0).positionFunction, animationDuration));
					} else if (part == VehiclePart.RIGHT_HAND && state == VehicleRenderableState.PREPARED_TO_DRIVE
							&& transitionDescriptors.isEmpty()) {
						List<TransitionDescriptor> drivingTransitionDescriptors = partConfiguration.transitionDescriptors
								.get(VehicleRenderableState.DRIVING);
						transitionDescriptors.add(new TransitionDescriptor(
								drivingTransitionDescriptors.get(0).positionFunction, animationDuration));
					} else if (part == VehiclePart.RIGHT_HAND && state == VehicleRenderableState.STOPPING
							&& transitionDescriptors.isEmpty()) {
						List<TransitionDescriptor> idleTransitionDescriptors = partConfiguration.transitionDescriptors
								.get(VehicleRenderableState.IDLE);
						transitionDescriptors.add(new TransitionDescriptor(
								idleTransitionDescriptors.get(0).positionFunction, animationDuration));
					} else if (part == VehiclePart.RIGHT_HAND && (state == VehicleRenderableState.FINISHING_SHIFT
							|| state == VehicleRenderableState.SHIFTING || state == VehicleRenderableState.STARTING_SHIFT)
							&& transitionDescriptors.isEmpty()) {
						List<TransitionDescriptor> drivingTransitionDescriptors = partConfiguration.transitionDescriptors
								.get(VehicleRenderableState.DRIVING);
						transitionDescriptors.add(new TransitionDescriptor(
								drivingTransitionDescriptors.get(0).positionFunction, animationDuration));
					} 
					
				}
				
				
				
				if (part == VehiclePart.LEFT_HAND && state == VehicleRenderableState.PREPARED_TO_DRIVE
						&& transitionDescriptors.isEmpty()) {
					List<TransitionDescriptor> drivingTransitionDescriptors = partConfiguration.transitionDescriptors
							.get(VehicleRenderableState.DRIVING);
					transitionDescriptors.add(new TransitionDescriptor(
							drivingTransitionDescriptors.get(0).positionFunction, animationDuration));
				} else if (part == VehiclePart.LEFT_HAND && state == VehicleRenderableState.STOPPING
						&& transitionDescriptors.isEmpty()) {
					List<TransitionDescriptor> idleTransitionDescriptors = partConfiguration.transitionDescriptors
							.get(VehicleRenderableState.IDLE);
					transitionDescriptors.add(new TransitionDescriptor(
							idleTransitionDescriptors.get(0).positionFunction, animationDuration));
				} else if (part == VehiclePart.LEFT_HAND && (state == VehicleRenderableState.FINISHING_SHIFT
						|| state == VehicleRenderableState.SHIFTING || state == VehicleRenderableState.STARTING_SHIFT)
						&& transitionDescriptors.isEmpty()) {
					List<TransitionDescriptor> idleTransitionDescriptors = partConfiguration.transitionDescriptors
							.get(VehicleRenderableState.DRIVING);
					transitionDescriptors.add(new TransitionDescriptor(
							idleTransitionDescriptors.get(0).positionFunction, animationDuration));
				} else if (part == VehiclePart.RIGHT_HAND && state == VehicleRenderableState.PREPARED_TO_DRIVE
						&& transitionDescriptors.isEmpty()) {
					List<TransitionDescriptor> drivingTransitionDescriptors = partConfiguration.transitionDescriptors
							.get(VehicleRenderableState.DRIVING);
					transitionDescriptors.add(new TransitionDescriptor(
							drivingTransitionDescriptors.get(0).positionFunction, animationDuration));
				} else if (part == VehiclePart.RIGHT_HAND && state == VehicleRenderableState.STOPPING
						&& transitionDescriptors.isEmpty()) {
					List<TransitionDescriptor> idleTransitionDescriptors = partConfiguration.transitionDescriptors
							.get(VehicleRenderableState.IDLE);
					transitionDescriptors.add(new TransitionDescriptor(
							idleTransitionDescriptors.get(0).positionFunction, animationDuration));
				} else if (part == VehiclePart.RIGHT_HAND && state == VehicleRenderableState.STARTING_SHIFT
						&& transitionDescriptors.isEmpty()) {
					List<TransitionDescriptor> drivingTransitionDescriptors = partConfiguration.transitionDescriptors
							.get(VehicleRenderableState.SHIFTING);
					transitionDescriptors.add(new TransitionDescriptor(
							drivingTransitionDescriptors.get(0).positionFunction, animationDuration));
				} else if (part == VehiclePart.RIGHT_HAND && state == VehicleRenderableState.FINISHING_SHIFT
						&& transitionDescriptors.isEmpty()) {
					List<TransitionDescriptor> idleTransitionDescriptors = partConfiguration.transitionDescriptors
							.get(VehicleRenderableState.DRIVING);
					transitionDescriptors.add(new TransitionDescriptor(
							idleTransitionDescriptors.get(0).positionFunction, animationDuration));
				}

				if (transitionDescriptors == null || transitionDescriptors.isEmpty()) {
					withPartPosition(part, state, c -> {
					});
				}
			}
		}
	}
}
