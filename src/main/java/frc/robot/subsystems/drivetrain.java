// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class drivetrain extends SubsystemBase {
  /** Creates a new drivetrain. */
    CANSparkMax leftLeader = new CANSparkMax(1, MotorType.kBrushless);
    CANSparkMax rightLeader = new CANSparkMax(2, MotorType.kBrushless);
    CANSparkMax leftFollower = new CANSparkMax(3, MotorType.kBrushless);
    CANSparkMax rightFollower = new CANSparkMax(4, MotorType.kBrushless);

    DifferentialDrive drive = new DifferentialDrive(leftLeader, leftFollower);
  public drivetrain() {
    leftFollower.setSmartCurrentLimit(40);
    rightFollower.setSmartCurrentLimit(40);
    leftLeader.setSmartCurrentLimit(40);
    rightLeader.setSmartCurrentLimit(40);

    leftFollower.follow(leftLeader);
    rightFollower.follow(rightLeader);
  }
    
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void arcadeDrive(double fwr, double rot){
    drive.arcadeDrive(fwr, rot);
  }

  public void set(double volt){
    leftLeader.set(volt);
  }
}
