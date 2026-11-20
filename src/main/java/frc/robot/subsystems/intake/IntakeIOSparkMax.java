package frc.robot.subsystems.Intake;



public class IntakeIOKraken implements IntakeIO {
  private TalonFX m_motor;

  public IntakeIOKraken(int port, int encoder, CANBus bus){
    m_motor = new TalonFX(port, MotorType.kBrushed);
  }


  @Override
  public void updateInputs(IntakeInputs inputs) {
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
