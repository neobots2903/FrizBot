package edu.first.team2903.robot.commands;

import edu.first.team2903.robot.RobotMap;

import edu.first.team2903.robot.OI;
import edu.wpi.first.wpilibj.Servo;

public class TeleopMode extends CommandBase {

    Servo frisbeePusher = new Servo(RobotMap.frisbeePusher);
    Servo diskDrop = new Servo(RobotMap.diskDrop);

    public TeleopMode() {
        requires(drivetrain);
        requires(shooter);
    }

    protected void initialize() {
        frisbeePusher.setAngle(5);
        diskDrop.setAngle(0);
    }

    protected void execute() {
        boolean state = true;

        //Can't figure out how to turn setPusher to true to activate the 
        //frisbee into the shooter area. Set to button 5 in OI.java
        //OI.triggerButton.whenPressed(new ToggleShooter());
        if (OI.rightStick.getZ() < 0) {
            shooter.setSpeed(OI.rightStick.getZ() * 2);
        } else {
            shooter.setSpeed(0);
        }


        //smart shooter
        if (OI.rightStick.getRawButton(1)) {
            try {
                Thread.sleep(400);
                setTimeout(.5);
                while (!isTimedOut()) {
                    diskDrop.setAngle(90);
                }
                frisbeePusher.setAngle(170);

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            frisbeePusher.setAngle(5);
            diskDrop.setAngle(0);

        }

        if (OI.rightStick.getRawButton(5)) {
            frisbeePusher.setAngle(170);
        } else {
            frisbeePusher.setAngle(5);
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
