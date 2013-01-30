/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.first.team2903.robot;

/**
 *
 * @author robotics
 */
public class PerodicDataFactory {
    
    public static PerodicDataFactory instance;
    protected double RPM = -1;
    
    protected PerodicDataFactory() {   
    }
    
    public static PerodicDataFactory getInstance() {
        if(instance == null) {
            instance = new PerodicDataFactory();
        }
        return instance;
    }
    
    public double getRPM() {
        return RPM;
    }
    
    public void setRPM(double rpm) {
        this.RPM = rpm;
    }
    
}
