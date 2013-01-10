/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.first.team2903.robot.commands;

/**
 *
 * @author robotics
 */
public class CenterRobot extends CommandBase {

    public CenterRobot() {
    requires(camera);
    }

    
    
    protected void initialize() {
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        //TODO implement check
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
