package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class Drive extends SubsystemBase{

    private int REPLACE_THIS_NUMBER;

    private VictorSPX frontLeftMotor;
    private VictorSPX frontRightMotor; 
    private VictorSPX backLeftMotor; 
    private VictorSPX backRightMotor; 

    private Joystick forwardandback;
    private Joystick leftandright;

    public void robotInit(){
        frontLeftMotor = new VictorSPX(REPLACE_THIS_NUMBER);
        backLeftMotor = new VictorSPX(REPLACE_THIS_NUMBER);
        forwardandback = new Joystick(REPLACE_THIS_NUMBER);
        leftandright = new Joystick(REPLACE_THIS_NUMBER);
        frontRightMotor= new VictorSPX(REPLACE_THIS_NUMBER);
        backRightMotor= new VictorSPX(REPLACE_THIS_NUMBER);
    

    }

    public void teleopPeriodic(){

        double motorSpeed = forwardandback.getRawAxis(REPLACE_THIS_NUMBER);
        frontLeftMotor.set(ControlMode.PercentOutput, motorSpeed);
        backLeftMotor.set(ControlMode.PercentOutput,motorSpeed);

        if(forwardandback.getRawButtonPressed(1)){
            double rampRate = forwardandback.getRawAxis(REPLACE_THIS_NUMBER);

            frontLeftMotor.configOpenloopRamp(rampRate);
            backLeftMotor.configOpenloopRamp(rampRate);
        }

        if(forwardandback.getRawAxis(REPLACE_THIS_NUMBER)>0){
            if(leftandright.getRawAxis(REPLACE_THIS_NUMBER)>0){
                frontLeftMotor.set(ControlMode.PercentOutput, forwardandback.getRawAxis(REPLACE_THIS_NUMBER));
            } 
        }

        if(forwardandback.getRawAxis(REPLACE_THIS_NUMBER)>0){
            if(leftandright.getRawAxis(REPLACE_THIS_NUMBER)>0){
                frontRightMotor.set(ControlMode.PercentOutput, forwardandback.getRawAxis(REPLACE_THIS_NUMBER));
            } 
        }

        if(forwardandback.getRawAxis(REPLACE_THIS_NUMBER)>0){
            if(leftandright.getRawAxis(REPLACE_THIS_NUMBER)>0){
                backLeftMotor.set(ControlMode.PercentOutput, forwardandback.getRawAxis(REPLACE_THIS_NUMBER));
            } 
        }

        if(forwardandback.getRawAxis(REPLACE_THIS_NUMBER)>0){
            if(leftandright.getRawAxis(REPLACE_THIS_NUMBER)>0){
                backRightMotor.set(ControlMode.PercentOutput, forwardandback.getRawAxis(REPLACE_THIS_NUMBER));
            } 
        }

    }
}


