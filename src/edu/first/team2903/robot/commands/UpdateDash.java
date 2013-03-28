/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.first.team2903.robot.commands;

import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author robotics
 */
public class UpdateDash extends CommandBase {

    public UpdateDash() {
    requires(shooter);
    }
    
    
    protected void initialize() {
        SmartDashboard.putString("status", "Status: Dashboard command initialized.");
    }

    protected void execute() {
        SmartDashboard.putNumber("Shooter Speed", shooter.shooterWheel.getSpeed());
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "StrSpd: "+shooter.shooterWheel.getSpeed());
    }

    protected boolean isFinished() {
        return false;
        
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
