package edu.first.team2903.robot.commands;
//TODO 


import edu.first.team2903.robot.PerodicDataFactory;
import edu.first.team2903.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj.image.NIVisionException;
import edu.wpi.first.wpilibj.networktables2.thread.PeriodicRunnable;

public class ShootTop extends CommandBase{

    public ShootTop() {
    requires(shooter);
    requires(camera);
    }

    
    protected void initialize() {
    }

    protected void execute() {
        try {
            boolean fired = false;
            /*??check if the disk is loaded??
            *-IF LOADED-
            *Get the distance from the target
            *Turn it into RPM target
            *turn on motor until it reaches ^ RPM
            * (If > RPM +15){
            * lower or stop motor power
            * }
            *  (if < RPM -15){
            * Speed up motor
            * }
            *fHIER
            *-IF NOT LOADED-
            *Stop Running command
            *print error message to driver station(DISK NOT LOADED!) */
                //if(diskLoaded = true) {
                  double topDistance = camera.computeTopDistance();
                    if(topDistance == -1) {
                        System.out.println("No top target detected.");
                    }
                    else {
                        double rpm = PerodicDataFactory.getInstance().getRPM();
                        double targetrpm = 500;
                        //todo find a way to equate the target rpm needed for the distance found.
                        while(fired == false) {
                        if(rpm > (targetrpm - 15)&& rpm < (targetrpm +15)){
                            //make it fHIER!(need to make frisbeePusher power on.)
                            //set the pusher to default if it isn't already.
                            shooter.setPusher(false);
                            shooter.setPusher(true);
                            shooter.setPusher(false);
                            //need to see if it does the full 90 degree turn before returning.
                            fired = true;
                        }
                        }
                    }
                //}
                //else(){
                //System.out.println("Disk is not loaded!");
                //}
        } catch (NIVisionException ex) {
            ex.printStackTrace();
        }
        
    }
    
    protected boolean isFinished() {
    return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
