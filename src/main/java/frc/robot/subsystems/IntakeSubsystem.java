// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new IntakeSubsystem. */

  private final MotorController mMotor;

  public IntakeSubsystem() {
    mMotor = new CANSparkMax(Constants.SPARK_MAX_CAN.INTAKE_CAN_ID, MotorType.kBrushed);
  }

  public void suck(boolean on, boolean up) {
    if (on) {
     //What to do when the intake in ON?
      if(up){
        mMotor.set(0.5);
      }
        else{
        mMotor.set(-0.5);
        }
    }
      else {
        //What to do when the intake is OFF?
      mMotor.set(0);
    }
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
