package edu.first.team2903.robot.subsystems;

import edu.first.team2903.robot.RobotMap;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

    Jaguar shooterWheel = new Jaguar (RobotMap.shooterWheel);
    Relay frisbeePusher = new Relay (RobotMap.frisbeePusher);
            
    protected void initDefaultCommand() {
    }
    
    public void Shoot(double speed) {
        shooterWheel.set(speed);
    }
}
