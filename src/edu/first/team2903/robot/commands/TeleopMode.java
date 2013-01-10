package edu.first.team2903.robot.commands;

public class TeleopMode extends CommandBase {

    public TeleopMode() {
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
