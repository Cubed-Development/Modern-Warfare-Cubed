package com.paneedah.weaponlib.vehicle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface VehiclePart extends PartContainer<VehiclePart> {

    VehiclePart WINDOWS = new VehiclePart() {
        @Override
        public String toString() {
            return "WINDOWS";
        }
    };

    VehiclePart LEFT_HAND = new VehiclePart() {
        @Override
        public String toString() {
            return "LEFT_HAND";
        }
    };

    VehiclePart RIGHT_HAND = new VehiclePart() {
        public String toString() {
            return "RIGHT_HAND";
        }
    };

    VehiclePart STEERING_WHEEL = new VehiclePart() {
        private final List<VehiclePart> parts = Collections.unmodifiableList(Arrays.asList(LEFT_HAND, RIGHT_HAND));

        public List<VehiclePart> getChildParts() {

            return parts;

        }

        public String toString() {
            return "STEERING_WHEEL";
        }
    };

    interface Wheel extends VehiclePart {
    }

    VehiclePart FRONT_LEFT_WHEEL = new Wheel() {

        public String toString() {
            return "FRONT_LEFT_WHEEL";
        }
    };

    VehiclePart FRONT_RIGHT_WHEEL = new Wheel() {

        public String toString() {
            return "FRONT_RIGHT_WHEEL";
        }
    };

    VehiclePart REAR_LEFT_WHEEL = new Wheel() {

        public String toString() {
            return "REAR_LEFT_WHEEL";
        }
    };

    VehiclePart REAR_RIGHT_WHEEL = new Wheel() {

        public String toString() {
            return "REAR_RIGHT_WHEEL";
        }
    };

    VehiclePart FRONT_LEFT_CONTROL_ARM = new VehiclePart() {

        private final List<VehiclePart> parts = Collections.unmodifiableList(Collections.singletonList(FRONT_LEFT_WHEEL));

        @Override
        public List<VehiclePart> getChildParts() {
            return parts;
        }

        public String toString() {
            return "FRONT_LEFT_CONTROL_ARM";
        }
    };

    VehiclePart FRONT_RIGHT_CONTROL_ARM = new VehiclePart() {

        private final List<VehiclePart> parts = Collections.unmodifiableList(Collections.singletonList(FRONT_RIGHT_WHEEL));

        @Override
        public List<VehiclePart> getChildParts() {
            return parts;
        }

        public String toString() {
            return "FRONT_RIGHT_CONTROL_ARM";
        }
    };

    VehiclePart MAIN = new VehiclePart() {
        private final List<VehiclePart> parts = Collections.unmodifiableList(Arrays.asList(
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
