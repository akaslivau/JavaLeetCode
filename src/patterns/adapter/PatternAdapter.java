package patterns.adapter;

public class PatternAdapter {

  public static void main(String[] args) {
    VoltageSource euSocket = new EuSocket();
    VoltageSourceAdapter japanSocketAdapter = new JapanAdapter(euSocket);

    System.out.println(euSocket.getVoltage());
    System.out.println(japanSocketAdapter.getVoltage());
  }
}
