package edu.first.team2903.robot.subsystems;

import edu.first.team2903.robot.RobotMap;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

    Jaguar rightMotor = new Jaguar(RobotMap.rightMotor);
    Jaguar leftMotor = new Jaguar(RobotMap.leftMotor);
    
    
    protected void initDefaultCommand() {
    }
    
    public void drive(double left, double right) {
        rightMotor.set(right);
        leftMotor.set(left);
    }
}
