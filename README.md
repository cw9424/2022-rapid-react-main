# 2022 Rapid React Robot (FRC Team 6639)

Robot code for **FRC Team 6639, Mechanical Minds**, written for the 2022 FIRST Robotics Competition game *Rapid React*.

It is a Java command-based project built on WPILib. We kept it deliberately simple so a new, growing team could read, understand and change it during the season.

## What the robot does

| Subsystem | Hardware | What it does |
| --- | --- | --- |
| Drive | 4 x Victor SPX (CAN 1-4), arcade drive | Driver-controlled driving, plus a short autonomous drive |
| Intake | Spark MAX (CAN 5) | Runs the intake in or out while a button is held |
| Lift | Victor SPX (CAN 6) | Raises or lowers the lift while a button is held |

## Driver controls

One joystick on USB port 0.

| Input | Action |
| --- | --- |
| Stick | Arcade drive (forward/back and turn) |
| Button 1 | Intake in (hold) |
| Button 2 | Intake out (hold) |
| Button 5 | Lift (hold) |

Autonomous drives the robot backward at 30% power.

## Project layout

```
src/main/java/frc/robot/
  Constants.java        CAN IDs, joystick port and button numbers
  RobotContainer.java   Wires buttons to commands
  subsystems/           Drive, Intake and Lift hardware
  commands/             What each button and autonomous does
```

## Build and deploy

1. Install the [2022 WPILib tools](https://docs.wpilib.org/en/stable/docs/zero-to-robot/step-2/wpilib-setup.html) (GradleRIO 2022.4.1).
2. Open this folder in WPILib VS Code.
3. Build: `./gradlew build`
4. Connect to the robot and deploy: `./gradlew deploy`

Vendor libraries used: CTRE Phoenix and REVLib (see `vendordeps/`).

## Status

This is the archived 2022 season code and is no longer being updated. Other teams are welcome to use it as a starting point. Questions are always welcome.

## License

Built on WPILib. See [WPILib-License.md](WPILib-License.md).
