package edu.first.team2903.robot.commands;

import edu.first.team2903.robot.OI;
import edu.first.team2903.robot.subsystems.Camera;
import edu.first.team2903.robot.subsystems.Drivetrain;
import edu.first.team2903.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj.command.Command;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    
    // --- SUBSYSTEMS BEGIN ---
    public static Drivetrain drivetrain = new Drivetrain();
    public static Camera camera = new Camera();
    public static Shooter shooter = new Shooter();
    // --- SUBSYSTEMS END

    public static void init() {
        // This MUST be here. 
        oi = new OI();
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
