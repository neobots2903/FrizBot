/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.first.team2903.robot.commands;

import edu.first.team2903.robot.PerodicDataFactory;

/**
 *
 * @author robotics
 */
public class SampleRPM extends CommandBase {

    protected double RPM;
    
    protected void initialize() {
        requires(encoders);
        RPM = -1;
    }

    protected void execute() {
        RPM = encoders.getShooterRPM(.2);
        PerodicDataFactory.getInstance().setRPM(RPM);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        //TODO Stop the RPM
    }

    protected void interrupted() {
    }
    
}
