// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class DriveSubsystem extends SubsystemBase {
  //creates a new DriveSubsystem.
  private final MotorController frontLeft;
  private final MotorController frontRight;
  private final MotorController rearLeft;
  private final MotorController rearRight;
  private DifferentialDrive drive;

  public DriveSubsystem() {
    frontLeft = new WPI_VictorSPX(1);
    frontRight = new WPI_VictorSPX(2);
    rearLeft = new WPI_VictorSPX(3);
    rearRight = new WPI_VictorSPX(4);
    frontRight.setInverted(true);
    rearRight.setInverted(true);
    MotorControllerGroup left = new MotorControllerGroup(frontLeft, rearLeft);
    MotorControllerGroup right = new MotorControllerGroup(frontRight, rearRight);
    drive = new DifferentialDrive(left, right);
    



  }

  public void drive(double forward, double clockwise) {
    drive.arcadeDrive(forward, clockwise);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
