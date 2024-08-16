package com.paneedah.weaponlib.vehicle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface VehiclePart extends PartContainer<VehiclePart> {
    
	public static VehiclePart WINDOWS = new VehiclePart() {
        @Override
        public String toString() {
            return "WINDOWS";
        }
    };
	
    public static VehiclePart LEFT_HAND = new VehiclePart() {
        @Override
        public String toString() {
            return "LEFT_HAND";
        }
    };
    
    public static VehiclePart RIGHT_HAND = new VehiclePart() {
        public String toString() {
            return "RIGHT_HAND";
        }
    };
    
    public static VehiclePart STEERING_WHEEL = new VehiclePart() {
        private List<VehiclePart> parts = Collections.unmodifiableList(Arrays.asList(LEFT_HAND, RIGHT_HAND));
        public List<VehiclePart> getChildParts() {
        	
        	return parts;
            
        }
        public String toString() {
            return "STEERING_WHEEL";
        }
    };
    
    public interface Wheel extends VehiclePart {
    }
    
    public static VehiclePart FRONT_LEFT_WHEEL = new Wheel() {
        
        public String toString() {
            return "FRONT_LEFT_WHEEL";
        }
    };
    
    public static VehiclePart FRONT_RIGHT_WHEEL = new Wheel() {
        
        public String toString() {
            return "FRONT_RIGHT_WHEEL";
        }
    };
    
    public static VehiclePart REAR_LEFT_WHEEL = new Wheel() {
        
        public String toString() {
            return "REAR_LEFT_WHEEL";
        }
    };
    
    public static VehiclePart REAR_RIGHT_WHEEL = new Wheel() {
        
        public String toString() {
            return "REAR_RIGHT_WHEEL";
        }
    };
    
    public static VehiclePart FRONT_LEFT_CONTROL_ARM = new VehiclePart() {
        
        private List<VehiclePart> parts = Collections.unmodifiableList(Arrays.asList(FRONT_LEFT_WHEEL));

        @Override
        public List<VehiclePart> getChildParts() {
            return parts;
        }
        
        public String toString() {
            return "FRONT_LEFT_CONTROL_ARM";
        }
    };
    
    public static VehiclePart FRONT_RIGHT_CONTROL_ARM = new VehiclePart() {
        
        private List<VehiclePart> parts = Collections.unmodifiableList(Arrays.asList(FRONT_RIGHT_WHEEL));

        @Override
        public List<VehiclePart> getChildParts() {
            return parts;
        }
        
        public String toString() {
            return "FRONT_RIGHT_CONTROL_ARM";
        }
    };
    
    public static VehiclePart MAIN = new VehiclePart() {
        private List<VehiclePart> parts = Collections.unmodifiableList(Arrays.asList(
                STEERING_WHEEL, FRONT_LEFT_CONTROL_ARM, FRONT_RIGHT_CONTROL_ARM, REAR_LEFT_WHEEL, REAR_RIGHT_WHEEL, WINDOWS));

        @Override
        public List<VehiclePart> getChildParts() {
        	
        	
        	
        	
        	
        
        	return Collections.unmodifiableList(Arrays.asList(
                    STEERING_WHEEL, FRONT_LEFT_CONTROL_ARM, FRONT_RIGHT_CONTROL_ARM, REAR_LEFT_WHEEL, REAR_RIGHT_WHEEL, WINDOWS, LEFT_HAND, RIGHT_HAND));

            //return parts;
        }
        
        public String toString() {
            return "MAIN";
        }
    };
    
    
    default List<VehiclePart> getChildParts() {
        return Collections.emptyList();
    }
        
}
