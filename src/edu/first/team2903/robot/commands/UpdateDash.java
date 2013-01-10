/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.first.team2903.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author robotics
 */
public class UpdateDash extends CommandBase {
    
    protected void initialize() {
        SmartDashboard.putString("status", "Status: Dashboard command initialized.");
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
