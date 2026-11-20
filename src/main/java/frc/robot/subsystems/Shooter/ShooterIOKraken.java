package frc.robot.subsystems.Shooter;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

public class ShooterIOKraken implements ShooterIO {
  private SparkMax m_motor;

  public ShooterIOKraken(int Port) {
    m_motor = new SparkMax(Port, MotorType.kBrushed);
  }

  @Override
  public void updateInputs(ShooterInputs inputs) {
    inputs.voltage = m_motor.getBusVoltage();
    inputs.current = m_motor.getOutputCurrent();
    inputs.output = m_motor.getAppliedOutput();
  }

  @Override
  public void setVoltage(double volt) {
    m_motor.setVoltage(volt);
  }

  @Override
  public void setCurrentLimits(double supplyLimit) {}

  @Override
  public void setPIDFF(double kP, double kI, double kD, double kS) {}

}
