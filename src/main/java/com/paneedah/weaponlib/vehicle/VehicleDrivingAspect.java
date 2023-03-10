package com.paneedah.weaponlib.vehicle;

import com.paneedah.weaponlib.state.Aspect;
import com.paneedah.weaponlib.state.PermitManager;
import com.paneedah.weaponlib.state.StateManager;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class VehicleDrivingAspect implements Aspect<VehicleState, EntityVehicle> {
    
    private static final Set<VehicleState> allowedAutoUpdateFromStates = new HashSet<>(
            Arrays.asList(
                    VehicleState.IDLE, 
                    VehicleState.STARTING_TO_DRIVE,
                    VehicleState.DRIVING,
                    VehicleState.STARTING_TO_SHIFT,
                    VehicleState.SHIFTING,
                    VehicleState.FINISHING_SHIFT,
                    VehicleState.STOPPING));

   // private static Predicate<EntityVehicle> hasMinimalSpeed = vehicle -> vehicle.getSpeed() > 0.01;
    
    private static Predicate<EntityVehicle> hasMinimalSpeed = vehicle -> vehicle.solver.velocity.length() != 0.0;
    
    private static Predicate<EntityVehicle> movingForwardOrBackward = vehicle -> {
        return vehicle.isSteeredForward() || vehicle.isSteeredBackward();
    };
    
    private static Predicate<EntityVehicle> isShifting = vehicle -> {
        return vehicle.isInShift();
    };
    
    public static Predicate<EntityVehicle> shiftTime = vehicle -> 
    System.currentTimeMillis() >= 500 + vehicle.getStateUpdateTimestamp();
    
    public static Predicate<EntityVehicle> isDoneShifting = vehicle ->
    !vehicle.solver.transmission.runningAShift;
        
    
    public static Predicate<EntityVehicle> toShiftKnobTime = vehicle -> 
    System.currentTimeMillis() >= 50 + vehicle.getStateUpdateTimestamp();
    
    private static Predicate<EntityVehicle> speedupTimeoutExpired = vehicle ->
        System.currentTimeMillis() >= 300 + vehicle.getStateUpdateTimestamp();

//    @SuppressWarnings("unused")
//    private ModContext modContext;

    private StateManager<VehicleState, ? super EntityVehicle> stateManager;
    
    public VehicleDrivingAspect(/*CommonModContext modContext*/) {
        //this.modContext = modContext;
        this.setStateManager(new StateManager<>((s1, s2) -> s1 == s2));
    }

    public static long timeSinceStateChange(EntityVehicle vehicle) {
    	return System.currentTimeMillis() - vehicle.getStateUpdateTimestamp();
    }
    
    @Override
    public void setPermitManager(PermitManager permitManager) {}

    @Override
    public void setStateManager(StateManager<VehicleState, ? super EntityVehicle> stateManager) {
    	
        this.stateManager = stateManager;

        stateManager

            .in(this).change(VehicleState.IDLE).to(VehicleState.STARTING_TO_DRIVE)
            .when(hasMinimalSpeed.and(movingForwardOrBackward))
            .automatic() 
        
            .in(this).change(VehicleState.STARTING_TO_DRIVE).to(VehicleState.DRIVING)
            .when(speedupTimeoutExpired)
            .automatic()
            
            .in(this).change(VehicleState.DRIVING).to(VehicleState.STOPPING)
            .when(hasMinimalSpeed.negate())
            .automatic()
            
           
            
            
            .in(this).change(VehicleState.DRIVING).to(VehicleState.STARTING_TO_SHIFT)
            .when(isShifting)
            .automatic()
            
            .in(this).change(VehicleState.STARTING_TO_SHIFT).to(VehicleState.SHIFTING)
            .when(toShiftKnobTime)
            .automatic()
            
            .in(this).change(VehicleState.SHIFTING).to(VehicleState.FINISHING_SHIFT)
            .when(isDoneShifting)
            .automatic()
            
            .in(this).change(VehicleState.FINISHING_SHIFT).to(VehicleState.DRIVING)
            .when(toShiftKnobTime)
            .automatic()
  
            
            
            /*
            .in(this).change(VehicleState.DRIVING).to(VehicleState.SHIFTING)
            .when(isShifting)
            .automatic()
            
            .in(this).change(VehicleState.SHIFTING).to(VehicleState.DRIVING)
            .when(shiftTime)
            .automatic()*/
            
            .in(this).change(VehicleState.STOPPING).to(VehicleState.IDLE)
            .when(speedupTimeoutExpired)
            .automatic()
        ;
    }

    void onUpdate(EntityVehicle vehicle) {
    	//System.out.println("BRUH: " + isDoneShifting.test(vehicle));
    	//System.out.println((System.currentTimeMillis() >= 300 + vehicle.getStateUpdateTimestamp()));
    	//System.out.println(!(System.currentTimeMillis() >= 300 + vehicle.getStateUpdateTimestamp()));
        stateManager.changeStateFromAnyOf(this, vehicle, allowedAutoUpdateFromStates); // triggers "auto" state transitions
    }
}
