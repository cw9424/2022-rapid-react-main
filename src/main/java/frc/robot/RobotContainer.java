// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;

import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.drive.DriveCommand;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.LiftSubsystem;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.LiftCommand;


public class RobotContainer {
  
  // The robot's subsystems and commands are defined here...
  private final DriveSubsystem driveSubsystem = new DriveSubsystem();
  private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
  private final LiftSubsystem liftSubsytem = new LiftSubsystem();
  private final Joystick driveJoystick = new Joystick(Constants.COMPUTER_USB_PORTS.DRIVE_JOYSTICK_USB_ID);
  
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    //Configure the button bindings
    configureButtonBindings();
    driveSubsystem.setDefaultCommand(new DriveCommand(driveSubsystem, driveJoystick));
  }

  private void configureButtonBindings() {

    //INTAKE BUTTONS    
    JoystickButton intakeButton = new JoystickButton(driveJoystick, Constants.JOYSTICK_BUTTON.INTAKE_BUTTON);
    intakeButton.whileHeld(new IntakeCommand(intakeSubsystem, true, true));
    intakeButton.whenReleased(new IntakeCommand(intakeSubsystem, false, false));

    JoystickButton inversedIntakeButton = new JoystickButton(driveJoystick, Constants.JOYSTICK_BUTTON.INVERSED_INTAKE_BUTTON);
    inversedIntakeButton.whileHeld(new IntakeCommand(intakeSubsystem, true, false));
    inversedIntakeButton.whenReleased(new IntakeCommand(intakeSubsystem, false, false));

    //LIFT BUTTONS
    JoystickButton liftButton = new JoystickButton(driveJoystick, Constants.JOYSTICK_BUTTON.LIFT_BUTTON);
    liftButton.whileHeld(new LiftCommand(liftSubsytem, true, true));
    liftButton.whenReleased(new LiftCommand(liftSubsytem, false, true));

    JoystickButton inversedLiftButton = new JoystickButton(driveJoystick,  Constants.JOYSTICK_BUTTON.INVERSED_LIFT_BUTTON);
    inversedLiftButton.whileHeld(new LiftCommand(liftSubsytem, true, false));
    inversedLiftButton.whenReleased(new LiftCommand(liftSubsytem, false, false));
    
    
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    //return new AutoDriveCommand(driveSubsystem, -0.3, 0);
    return null;
  }
}

