package patterns.adapter;

public class EuSocket implements VoltageSource {

  @Override
  public int getVoltage() {
    return 220;
  }
}