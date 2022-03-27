// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
//------------------------------------------------------------------------------------------------------------------------------------------------------------
//import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
//import com.revrobotics.CANSparkMax;
//import com.revrobotics.CANSparkMaxLowLevel.MotorType;

//import edu.wpi.first.wpilibj.DoubleSolenoid;
//import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;

public class LiftSubsystem extends SubsystemBase {
  /** Creates a new LiftSubsystem. */

  private final MotorController mLift;
  
  public LiftSubsystem() {

    mLift = new WPI_VictorSPX(6);
    //mLift = new CANSparkMax(Constants.SPARK_MAX_CAN.LIFT_CAN_ID, MotorType.kBrushed);

  }

  public void lift(boolean on, boolean up) {
    if (on) {
      if (up) {
        mLift.set(-0.5);
      } else {
        mLift.set(0.5);
      }
    } else {
      mLift.set(0);
    }
  }
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
