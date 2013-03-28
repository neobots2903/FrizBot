package edu.first.team2903.robot.commands;

import java.util.Random;

public class AutoMode1 extends CommandBase {

    
    boolean done = false;

    public AutoMode1() {
        requires(drivetrain);
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        shooter.frisbeePusher.setAngle(5);
        shooter.diskDrop.setAngle(0);
        shooter.setSpeed(-.75);
            try {
                Thread.sleep(3000);
                shooter.shoot();
                Thread.sleep(2000);
                shooter.shoot();
                Thread.sleep(2000);
                shooter.shoot();
            } catch (InterruptedException ex) {
                System.out.println("EXCEPTION OCCURED?!");
                System.out.println("Today's Execption Occured Lotto Winner: "+new Random().nextInt());
            }  

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

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