package edu.first.team2903.robot.commands;

import edu.first.team2903.robot.OI;

public class TeleopMode extends CommandBase {
    
    
    public TeleopMode() {
        requires(drivetrain);
        requires(shooter);
    }

    protected void initialize() {
       //Todo, spindown code
    }

    protected void execute() {
        boolean state = true;
        //DEBUG REMOVE LATER
        //Can't figure out how to turn setPusher to true to activate the 
        //frisbee into the shooter area. Set to button 5 in OI.java

        if (OI.rightStick.getZ() > 0) {
            shooter.setSpeed(OI.rightStick.getZ());
        }
        drivetrain.drive(OI.leftStick.getY(), OI.rightStick.getY());
        
    }

    protected boolean isFinished() {
        //Will end when teleop is done
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
    
}
