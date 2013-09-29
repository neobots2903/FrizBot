package edu.first.team2903.robot.commands;

import edu.first.team2903.robot.OI;
import edu.wpi.first.wpilibj.DriverStationLCD;
import java.util.Random;

public class TeleopMode extends CommandBase {

    DriverStationLCD lcd = DriverStationLCD.getInstance();
    

    public TeleopMode() {
        requires(drivetrain);
        requires(shooter);
    }

    protected void initialize() {
        shooter.frisbeePusher.setAngle(80);
        shooter.diskDrop.setAngle(0);
    }

    protected void execute() {
        //boolean state = true;
<<<<<<< HEAD
        //commented out in an attempt to stop the acceleration bug
=======
>>>>>>> origin/CompFreeze

        
        if (OI.scoreStick.getZ() < 0) {
            shooter.setSpeed(-OI.scoreStick.getZ() * 2);
        } else {
            shooter.setSpeed(0);
        }


        //smart shooter
        if (OI.scoreStick.getRawButton(1)) {
            try {
                shooter.shoot();
            } catch (InterruptedException ex) {
                System.out.println("EXCEPTION OCCURED?!");
                System.out.println("Today's Execption Occured Lotto Winner: "+new Random().nextInt());
            }
        }

        if(OI.scoreStick.getRawButton(3)) {
            drivetrain.drive(OI.leftStick.getY(), OI.rightStick.getY(), OI.scoreStick.getY());
        } else {
            drivetrain.drive(OI.leftStick.getY(), OI.rightStick.getY(), 0);
        }
        
        if(OI.scoreStick.getRawButton(4)) {
            shooter.setSpeed(1.0);
        }

        //System.out.println("Value: "+shooter.shooterWheel.getSpeed());
        lcd.println(DriverStationLCD.Line.kUser2, 1, "Shooter Speed: "+shooter.shooterWheel.getSpeed());
        lcd.println(DriverStationLCD.Line.kUser2, 2, "Z value: "+OI.scoreStick.getZ());
        lcd.updateLCD();

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
