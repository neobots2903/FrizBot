package edu.first.team2903.robot.commands;
import edu.first.team2903.robot.subsystems.Shooter;

public class AutoMode1 extends CommandBase {

    boolean done = false;
    
    public AutoMode1() {
        requires(drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //Shoot three disks
        drivetrain.leftMotor.set(-1);
        drivetrain.rightMotor.set(-1);
        //Finish that code to back up 9 feet
        drivetrain.leftMotor.set(1);
        drivetrain.rightMotor.set(-1);
        //finish that code to turn 180
        drivetrain.drive(5, 5);     
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        done = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

//shoot 3 disks
//back up X feet
//spin 180 deg