// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.drive;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

import edu.wpi.first.wpilibj.Joystick;


public class DriveCommand extends CommandBase {
  //Creates a new DriveCommand.
  private final DriveSubsystem mDrive;
  private final Joystick mJoystick;

  public DriveCommand(DriveSubsystem driveSubsystem, Joystick joystick) {
    // Use addRequirements() here to declare subsystem dependencies.
    mJoystick = joystick;
    mDrive = driveSubsystem;
    addRequirements(mDrive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mDrive.drive(-mJoystick.getY(), mJoystick.getZ());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mDrive.drive(0, 0);

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
