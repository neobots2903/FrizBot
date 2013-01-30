/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.first.team2903.robot.subsystems;

import edu.first.team2903.robot.OI;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author robotics
 */
public class Encoders extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    Encoder leftShooterEncoder = new Encoder(1, 2, 3);

    public double getShooterRPM(double sampleTime) {
        leftShooterEncoder.reset();
        leftShooterEncoder.start();
        Timer.delay(sampleTime);
        int nDegrees = leftShooterEncoder.get();
        double RPM = (double) nDegrees / 360 * 60 / sampleTime;
        leftShooterEncoder.stop();
        
        return RPM;
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
