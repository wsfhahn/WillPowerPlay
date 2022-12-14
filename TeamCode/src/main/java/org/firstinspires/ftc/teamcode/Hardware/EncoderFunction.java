package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.hardware.bosch.JustLoggingAccelerationIntegrator;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

//import org.firstinspires.ftc.teamcode.TestFiles.PIDController;
//import org.firstinspires.ftc.teamcode.TestFiles.PIDControllerHor;

// Vision imports


/*
 * This is NOT an opmode. This file defines all the hardware on the robot
 * and some common helper functions (stop motors, reset encoders, etc.)
 */
public class EncoderFunction {

    public DcMotor motor1;
    public DcMotor motor2;

    public void init(HardwareMap ahwMap) {

    }

    public void moveByTileUnit(double speed, DcMotor motor1, DcMotor motor2, int encoderValue) {
        motor1.setPower(speed);
        motor2.setPower(speed);

        motor1.setTargetPosition(motor1.getCurrentPosition() + encoderValue);
        motor2.setTargetPosition(motor2.getCurrentPosition() + encoderValue);

        motor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor2.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        for (int i = 0; i < 1000; i++) {
            int x = 1 + 1;
        }
    }
}