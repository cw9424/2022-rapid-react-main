// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.LiftSubsystem;

public class LiftCommand extends CommandBase {
  /** Creates a new LiftCommand. */

  private final LiftSubsystem mLift;
  private final boolean mUp;
  private final boolean mOn;

  public LiftCommand(LiftSubsystem liftSubsystem, boolean on, boolean up) {
    // Use addRequirements() here to declare subsystem dependencies.
    mLift = liftSubsystem;
    mUp = up;
    mOn = on;
    addRequirements(mLift);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    mLift.lift(mOn, mUp);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
