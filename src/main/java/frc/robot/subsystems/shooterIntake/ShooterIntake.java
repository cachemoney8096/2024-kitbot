package frc.robot.subsystems.shooterIntake;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterIntake extends SubsystemBase {

    private static WPI_VictorSPX topMotor = new WPI_VictorSPX(ShooterIntakeConstants.TOP_MOTOR);
    private static WPI_VictorSPX bottomMotor = new WPI_VictorSPX(ShooterIntakeConstants.BOTTOM_MOTOR);

    static void ShooterTopMotor() {
        topMotor.set(ShooterIntakeCal.SHOOTER_SET_SPEED);

    }

    static void ShooterBottomMotor() {
        bottomMotor.set(ShooterIntakeCal.SHOOTER_SET_SPEED);

    }

    static void IntakeTopMotor() {
        topMotor.set(ShooterIntakeCal.INTAKE_SET_SPEED);
        
    }

    static void IntakeBottomMotor() {
        bottomMotor.set(ShooterIntakeCal.INTAKE_SET_SPEED);
    

    }

    
    
}
