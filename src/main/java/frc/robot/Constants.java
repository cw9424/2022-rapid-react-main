package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class VICTOR_SPX_CAN {
        //assign motor controllers to motors
        public static final int FRONT_LEFT_CAN_ID = 1;
        public static final int FRONT_RIGHT_CAN_ID = 2;
        public static final int REAR_LEFT_CAN_ID = 3;
        public static final int REAR_RIGHT_CAN_ID = 4;
    }
    public static final class COMPUTER_USB_PORTS {
        //assign joystick
        public static final int DRIVE_JOYSTICK_USB_ID = 0;
    }

    public static final class SPARK_MAX_CAN {
        //assign motor controllers to motors
        public static final int INTAKE_CAN_ID = 5;
        public static final int LIFT_CAN_ID = 6;

    }
    public static final class JOYSTICK_BUTTON {
        
        //assign joystick buttons
        public static final int INTAKE_BUTTON = 1;
        public static final int INVERSED_INTAKE_BUTTON = 2;
        public static final int LIFT_BUTTON = 5;
        public static final int INVERSED_LIFT_BUTTON = 6;
    }
    public static final class PCM_PNEUMATICS {

        //Pneumatics solonoids
        public static final int LIFT_SOLENOID = 0; 
        public static final int DOWN_SOLENOID = 1;
    }
}
