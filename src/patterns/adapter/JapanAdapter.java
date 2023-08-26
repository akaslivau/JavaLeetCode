package patterns.adapter;

public class JapanAdapter implements VoltageSourceAdapter {

  private VoltageSource source;
  private final DowngradeTransformator transformator = new DowngradeTransformator();

  public JapanAdapter(VoltageSource source) {
    this.source = source;
  }

  @Override
  public int getVoltage() {
    return transformator.transform(source.getVoltage());
  }

  static class DowngradeTransformator {

    public int transform(int voltage) {
      if (voltage > 100) {
        return 100;
      } else if (voltage < 100) {
        return 100; // :))
      }
      return voltage;
    }
  }
}