package edu.first.team2903.robot.commands;
//TODO Make the robot drivable so that we can test the drivetrain and such.

public class Drive extends CommandBase{

    public Drive() {
    requires(drivetrain);
    }

    
    protected void initialize() {
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
