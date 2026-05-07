package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class GamePadPractice extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {

        double yAxisLeft = -gamepad1.left_stick_y;
        double yAxisRight = -gamepad1.right_stick_y;
        double diffXJoysticks = gamepad1.left_stick_x - gamepad1.right_stick_x;
        telemetry.addData("left x",gamepad1.left_stick_x);
        telemetry.addData("left y",yAxisLeft);
        telemetry.addData("difference X",diffXJoysticks);

        telemetry.addData("right x",gamepad1.right_stick_x);
        telemetry.addData("right y",yAxisRight);

        telemetry.addData("A button",gamepad1.a);
        telemetry.addData("B button",gamepad1.b);
    }
}
