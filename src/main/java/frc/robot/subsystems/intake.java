// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class intake extends SubsystemBase {
  /** Creates a new intake. */
  CANSparkMax intakeMotor = new CANSparkMax(5, MotorType.kBrushless);

  public intake() {
    intakeMotor.setSmartCurrentLimit(40);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void shoot(double shoot){
    intakeMotor.set(shoot);
  }

  public void take(double take){
    intakeMotor.set(take);
  }

  public void stop(){
    intakeMotor.stopMotor();
  }
}
