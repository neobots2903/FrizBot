package edu.first.team2903.robot.subsystems;

import edu.first.team2903.robot.RobotMap;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

    public Jaguar rightMotor = new Jaguar(RobotMap.rightMotor);
    public Jaguar leftMotor = new Jaguar(RobotMap.leftMotor);
    public Jaguar climbMotor1 = new Jaguar(RobotMap.climbMotor1);
    public Jaguar climbMotor2 = new Jaguar(RobotMap.climbMotor2);
    
    
    protected void initDefaultCommand() {
    }
    
    public void drive(double left, double right,double speed) {
        rightMotor.set(right);
        leftMotor.set(-left);
        climbMotor1.set(speed);
        climbMotor2.set(speed);
    }
    
//    public void climb(double speed) {
//        climbMotor1.set(speed);
//        climbMotor2.set(speed);
//    }
}
