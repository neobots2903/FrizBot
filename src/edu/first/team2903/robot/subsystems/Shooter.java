package edu.first.team2903.robot.subsystems;

import edu.first.team2903.robot.RobotMap;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

    Jaguar shooterWheel = new Jaguar (RobotMap.shooterWheel);
    Servo frisbeePusher = new Servo (RobotMap.frisbeePusher);
            
    protected void initDefaultCommand() {
    }
    
    public void setSpeed(double speed) {
        shooterWheel.set(speed);
    }
    
    public void setPusher(boolean state) {
        if(state == true){ 
            frisbeePusher.setAngle(90); 
        }
        if(state == false) {
            frisbeePusher.setAngle(0);
        }
    }
}
